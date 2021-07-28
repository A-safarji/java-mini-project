/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddbank;

public class Presion {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sentence
     */
    public int getSentence() {
        return sentence;
    }

    /**
     * @param sentence the sentence to set
     */
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

 private String name;
 private double height;
 private int sentence;

    @Override
    public String toString() {
        return "Presion{" + "name=" + getName() + ", height=" + getHeight() + ", sentence=" + getSentence() + '}';
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

   

    public Presion(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
   
    
    
}
