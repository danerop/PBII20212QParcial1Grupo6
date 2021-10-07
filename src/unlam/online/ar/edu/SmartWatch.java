package unlam.online.ar.edu;

public class SmartWatch {

    private String nickname;
    private Deportista[] deportistas;

    public SmartWatch(String nickname) {
        this.nickname=nickname;
        this.deportistas=new Deportista[10];
    }

    public Boolean agregarDeportista(Deportista deportista) {
        for (int i=0;i<deportistas.length; i++){
            if(deportistas[i]==null){
                deportistas[i]=deportista;
                return true;
            }
        }
        return false;
    }


}
