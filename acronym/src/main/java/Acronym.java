class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] words = phrase.replaceAll(",", "").split("\\s+|-|_");
        String r = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                r += word.charAt(0);
            }
        }
        return r.toUpperCase();
    }

    public static void main(String[] args) {
        String r = new Acronym("Complementary metal-oxide semiconductor").get();
        System.out.println(r);
    }
}
