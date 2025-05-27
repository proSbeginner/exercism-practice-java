import java.util.ArrayList;
import java.util.List;

class Allergies {
    final int allergyScore;

    Allergies(int score) {
        allergyScore = score;
    }

    boolean isAllergicTo(Allergen allergen) {
        return (this.allergyScore & allergen.getScore()) == allergen.getScore();
    }

    List<Allergen> getList() {
        List<Allergen> list = new ArrayList<>();
        for (Allergen allergen : Allergen.values()) {
            if (isAllergicTo(allergen)) { // ใช้ method isAllergicTo ที่เราเขียนไว้
                list.add(allergen);
            }
        }
        return list;
    }
}
