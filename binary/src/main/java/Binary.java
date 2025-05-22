public class Binary {
    private String input;
    public Binary(String input) {
        this.input = input;
    }

    public int getDecimal() {
        // if(input.equals("1")) return 1;
        // if(input.equals("10")) return 2;
        // if(input.equals("11")) return 3;
        // if(input.equals("100")) return 4;
        // if(input.equals("1001")) return 9;
        // if(input.equals("11010")) return 26;
        // if(input.equals("10001101000")) return 1128;
        // if(input.equals("000011111")) return 31;
        // if(input.equals("2")) return 0;
        // if(input.equals("01201")) return 0;
        // if(input.equals("10nope")) return 0;
        // if(input.equals("nope10")) return 0;
        // if(input.equals("10nope10")) return 0;
        // if(input.equals("001 nope")) return 0;
        // return 0;
        
        if(input.chars().filter(c -> !(c == '0' || c == '1')).count() > 0) return 0;
        if(input.chars().anyMatch(Character::isLetter)) return 0;
        return Integer.parseInt(input, 2);
    }
}
