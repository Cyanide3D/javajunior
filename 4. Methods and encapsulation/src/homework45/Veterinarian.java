package homework45;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Сегодня к нам на приём пришёл " + animal.getName());
        System.out.println("В карточке написано, что он " + animal.getDescription());
    }

}
