package org.example;

public class Familia {



    Animal papa;
    Animal mama;
    Animal hijo;
    private System system;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }


    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        system.out.println(
                "El papá es: "+this.papa.nombre+
                        "\nLa mamá es: "+this.mama.nombre+
                        "\nEl hijo es: "+this.hijo.nombre
        );

    }
    public void tenerhijo(String cebrallo) {
        this.hijo = new Animal();
        this.hijo.nombre = cebrallo;
    }

    public void tenerHijo(String nombre){

        if(this.papa.pareja!=null){

            Animal hijo= new Animal();
            hijo.nombre=nombre;
            hijo.peso=1;
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }



}
