class Subject {
    String title;
    double credits;

    Subject(String title, double credits) {
        this.title = title;
        this.credits = credits;
    }


    public String toString() {
        return "Title "+ title + "Credits" + credits;
    }
}
