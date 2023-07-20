package com.xql.clientmdb;

public class App {
    public static void main(String[] args) {
        String baseUrl = "http://localhost:8080";
        // String baseUrl = "http://api001.multidb.net:8080";

        // List of virtual schemas
        String url = baseUrl + "/api/v1/schemas";
        ListSchemas listSchemas = new ListSchemas();
        listSchemas.setUrl(url);
        listSchemas.getSchemas();
        System.out.println();

        // List of database sources
        url = baseUrl + "/api/v1/dbconns";
        ListDbconns listDbconns = new ListDbconns();
        listDbconns.setUrl(url);
        listDbconns.getDbconns();
        System.out.println();

        RemoveDvtable removeDvtable = new RemoveDvtable();
        removeDvtable.setBaseUrl(baseUrl);

        // incorrect input
        // 1. remove a virtual table: dvsname is NULL.
        System.out.println("1. remove a virtual table: NULL.suppliers");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname(null);
        removeDvtable.setDvt_name("suppliers");

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 2. remove a virtual table: dvsname is an empty string.
        System.out.println("2. remove a virtual table: dvsname is an empty string.");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("");
        removeDvtable.setDvt_name("suppliers");

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 3. add a virtual table: dvsname does not exist. northwind_cx
        System.out.println("3. add a virtual table: dvsname does not exist. northwind_cx");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("northwind_cx");
        removeDvtable.setDvt_name("suppliers");

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 4. remove a virtual table: dvt_name is NULL.
        System.out.println("4. remove a virtual table: dvt_name is NULL.");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("northwind_c");
        removeDvtable.setDvt_name(null);

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 5. remove a virtual table: dvt_name is an empty string.
        System.out.println("5. remove a virtual table: dvt_name is an empty string.");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("northwind_c");
        removeDvtable.setDvt_name("   ");

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 6. remove a virtual table: dvt_name is a blank string.
        System.out.println("6. remove a virtual table: dvsname is a blank string.");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("     ");
        removeDvtable.setDvt_name("suppliers");

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 7. remove a virtual table: dvt_name is a blank string.
        System.out.println("7. remove a virtual table: dvt_name is a blank string.");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("     ");
        removeDvtable.setDvt_name("     ");

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 8. remove a virtual table: dvt_name contains space.
        System.out.println("8. remove a virtual table: dvt_name contains space.");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("northwind_c");
        removeDvtable.setDvt_name("supp liers");

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 9. remove a virtual table: dvt_name contains special characters.
        System.out.println("9. remove a virtual table: dvt_name contains special characters.");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("northwind_c");
        removeDvtable.setDvt_name("suppliers#");

        removeDvtable.removeDvtable();
        System.out.println();

        // incorrect input
        // 10. remove a virtual table: dvt_name does not exist.
        System.out.println("10. remove a virtual table: dvt_name does not exist..");
        url = baseUrl + "/api/v1/rmtable/";
        removeDvtable.setUrl(url);
        removeDvtable.setDvsname("northwind_c");
        removeDvtable.setDvt_name("suppliersx");

        removeDvtable.removeDvtable();
        System.out.println();

        // 11. get a list of virtual tables in virtual schema northwind_b
        System.out.println("11. get a list of virtual tables in virtual schema northwind_c");
        url = baseUrl + "/api/v1/schemas/northwind_c";
        // url =
        // "http://api001.multidb.net:8080/api/v1/schemas/dvs_authors_db/DVT_AUTHORS";
        // url = "http://localhost:8080/api/v1/schemas/dvs_authors_db/DVT_AUTHORS";
        // ListSchemas listSchemas = new ListSchemas();
        listSchemas.setUrl(url);
        listSchemas.getSchemas();
        System.out.println();
    }
}
