public class UC15CargoException {
    public static void main(String[] args) {
        try {
            String shape="Rectangular", cargo="Petroleum";
            if(shape.equals("Rectangular") && cargo.equals("Petroleum")){
                throw new RuntimeException("Unsafe");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}