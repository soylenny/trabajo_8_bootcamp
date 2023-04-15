public class SmartDevice {

        String empresa;
        String modelo;
        int bateria;
        String color;


    public SmartDevice(){
    }

    public SmartDevice (String empresa, String modelo, String color,int bateria){
        this.empresa = empresa;
        this.modelo = modelo;
        this.color = color;
        this.bateria = bateria;

    }

    public static class SmartPhone extends SmartDevice{


        int camaraTracera;
        int camaraTracera2;
        int camaraTracera3;
        int ram;

        public SmartPhone() {
        }

        public  SmartPhone(String empresa, String modelo, String color, int bateria, int camaraTracera, int camaraTracera2, int camaraTracera3, int ram) {
            super(empresa, modelo, color, bateria);
            this.camaraTracera = camaraTracera;
            this.camaraTracera2 = camaraTracera2;
            this.camaraTracera3 = camaraTracera3;
            this.ram = ram;

        }



    }
    public static class SmartWatch extends SmartDevice{

        int pulgadas;
        int grosor;

        public SmartWatch() {
        }

        public SmartWatch(String empresa, String modelo, String color, int bateria, int pulgadas, int grosor) {
            super(empresa, modelo, color, bateria);
            this.pulgadas = pulgadas;
            this.grosor = grosor;
        }

    }

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("iphone", "iphone14", "verde", 3200,
                12, 24, 32, 8);
        System.out.println("marca del celular " + smartPhone.empresa);
        System.out.println("modelo " + smartPhone.modelo);
        System.out.println("color " + smartPhone.color);
        System.out.println("bateria " + smartPhone.bateria);
        System.out.println("camaras traceras de  " + smartPhone.camaraTracera + ", " + smartPhone.camaraTracera2 + ", " + smartPhone.camaraTracera3);
        System.out.println("ram " + smartPhone.ram);

        SmartWatch smartWatch = new SmartWatch ("iphone", "apple watch 8", "morado", 1400, 6, 3);
        System.out.println("maraca del smart Watch " + smartWatch.empresa);
        System.out.println("modelo " + smartWatch.modelo);
        System.out.println("color " + smartWatch.color);
        System.out.println("bateria " + smartWatch.bateria);
        System.out.println("tamaño " + smartWatch.pulgadas);
        System.out.println("grosor " + smartWatch.grosor);


    }

}
