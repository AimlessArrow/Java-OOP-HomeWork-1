public class Cat {
    private String name;
    private String breed;
    private String hairColour;
    private int age;
    private String mood;
    
    public Cat() {}
 
    public Cat(String newBreed, String newHairColour, int newAge, String newMood, String newName) {
        if(newBreed.isEmpty() || newBreed == null 
             || newHairColour.isEmpty() || newHairColour == null
             || newAge < 0
             || newMood.isEmpty() || newMood == null
             || newName.isEmpty() || newName == null){
            throw new IllegalArgumentException("Incorrect input");
        } else {
            this.breed = newBreed;
            this.hairColour = newHairColour;
            this.age = newAge;
            this.mood = newMood;
            this.name = newName;
        }
    }
    
    public void setBreed(String newBreed) {
        if(newBreed.isEmpty() || newBreed == null) {
          System.out.println("Incorrect input");
        } else {
          this.breed = newBreed;
        }
    }
    
    public void setMood(String newMood) {
        if(newMood.isEmpty() || newMood == null) {
          System.out.println("Incorrect input");
        } else {
          this.mood = newMood;
        }
    }
    
    public void setHairColour(String newHairColour) {
        if(newHairColour.isEmpty() || newHairColour == null) {
          System.out.println("Incorrect input");
        } else {
          this.mood = newHairColour;
        }
    }
 
    public void setAge(int newAge) {
        if(newAge < 0) {
          System.out.println("Incorrect input");
        } else {
          this.age = newAge;
        }
    }
 
    public void setName(String newName) {
        if(newName.isEmpty() || newName == null) {
          System.out.println("Incorrect input");
        } else {
          this.name = newName;
        }
    }
 
    public String getBreed() {
      return this.breed;
    }
    
    public String getHairColour() {
      return this.hairColour;
    }
    
    public int getAge() {
      return this.age;
    }
    
    public String getMood() {
      return this.mood;
    }
    
    public String getName() {
      return this.name;
    }
    
    public void purr() {
      System.out.println("Purrrrrrrr...");
    }
    
    public void play() {
      this.setMood("Playful");
    }
    
    @Override
    public String toString() {
      return "Cat [name=" + this.name + ", breed=" + this.breed + 
        ", hair_colour=" + this.hairColour + ", age=" + this.age + ", mood=" +
        this.mood + "]";
    }
}
