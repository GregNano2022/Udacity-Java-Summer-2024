public class ServiceTest {
    private String serviceId;


    public String getServiceId() {
        return generateServiceId();
    }

    private String generateServiceId(){
        if(serviceId == null){
            serviceId = "1111";
        }
        return serviceId;
    }

    public static void main(String[] args){
        ServiceTest serviceTest = new ServiceTest();

        System.out.println(serviceTest.getServiceId());
    }





    }



