package questao14;


/**
 * testaEquipamento
 */
public class testaEquipamento {

    public static void main(String[] args) {
        Equipamento equip1 = new Equipamento();
        Equipamento equip2 = new Equipamento();

        equip1.ligar();
        equip2.desligar();

        equip1.inverter();
        equip2.inverter();

        if (equip1.ligado) {
            System.out.println("O equipamento 1 esta ligado!!!");
        }
        else{
            System.out.println("O equipamento 1 esta desligado!!!");
        }

        if (equip2.ligado) {
            System.out.println("O equipamento 2 esta ligado!!!");
        } else {
            System.out.println("O equipamento 2 esta desligado!!!");
        }

    }
}