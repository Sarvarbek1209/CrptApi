import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        CrptApi api = new CrptApi(TimeUnit.SECONDS, 10);

        CrptApi.Document document = new CrptApi.Document();
        document.doc_id = "123";
        document.doc_status = "new";
        document.doc_type = "LP_INTRODUCE_GOODS";
        document.importRequest = true;
        document.owner_inn = "1234567890";
        document.participant_inn = "0987654321";
        document.producer_inn = "1122334455";
        document.production_date = "2023-01-01";
        document.production_type = "type";
        document.products = new CrptApi.Document.Product[]{new CrptApi.Document.Product()};
        document.products[0].certificate_document = "cert_doc";
        document.products[0].certificate_document_date = "2023-01-01";
        document.products[0].certificate_document_number = "cert_num";
        document.products[0].owner_inn = "1234567890";
        document.products[0].producer_inn = "1122334455";
        document.products[0].production_date = "2023-01-01";
        document.products[0].tnved_code = "tnved";
        document.products[0].uit_code = "uit";
        document.products[0].uitu_code = "uitu";

        api.createDocument(document, "signature");
    }
}
