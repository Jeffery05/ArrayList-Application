/*
Names: Jeffery Hu and David Geng
Teacher name: Ms. Krasteva
File name: CrazySentence.java
Date: March 3, 2021.
Description: This class will create a random sentence by combining random article words, nouns, verbs, prepositions, adverbs and adjectives.
             Different words for each type will be stored in an array list, and they will be picked at random when a word of their types is needed.
             Sentences will follow the simplest structure for english sentences: Article | noun | verb | preposition | article | adjective or adverb | noun
*/

//Import statements
import java.util.*;

public class CrazySentence{
   // Arrays to first store the values, so they can be passed to the arraylist after
   String[] articleWords = {"A", "The"}; // Article words
   String[] nounWords = {"boy", "girl", "elephant", "baseball bat", "soccerball", "car", "monkey", "otter", "turtle", "cheetah", "hero", "baby", "ship", "aircraft", "brain", "chicken", "river", "chef"}; // Nouns
   String[] verbWords = {"flew", "danced", "jumped", "skipped", "slept", "ran", "sprinted", "walked", "skydived", "wrote", "drank", "fell", "hid"}; // Verbs
   String[] prepositionWords = {"behind", "around", "for", "from", "in", "on", "to", "with", "above", "near", "over", "after"}; // Prepositions
   String[] adjectivesOrAdverbsWords = {"shiny", "large", "tiny", "beautiful", "salty", "sour", "sweet", "tasty", "kind", "helpful", "caring", "happy", "adventurous"}; // Adjectives/adverbs
   
   //Create Array lists
   ArrayList<String>article = new ArrayList<String>(2); // Article words
   ArrayList<String>noun = new ArrayList<String>(18); // Nouns
   ArrayList<String>verb = new ArrayList<String>(13); // Verbs
   ArrayList<String>preposition = new ArrayList<String>(12); // Prepositions
   ArrayList<String>adjectivesOrAdverbs = new ArrayList<String>(13); // Adjectives/Adverbs
   
   //This method is used to assign all the words stored in the arrays to the arraylists
   public void assignValues(){
      article.addAll(Arrays.asList(articleWords));
      noun.addAll(Arrays.asList(nounWords));
      verb.addAll(Arrays.asList(verbWords));
      preposition.addAll(Arrays.asList(prepositionWords));
      adjectivesOrAdverbs.addAll(Arrays.asList(adjectivesOrAdverbsWords));
   }
   
   //This method is used to shuffle the arraylists to randomize them, and then print out a grammatically correct wacky sentence
   public void createSentence(){
      //Shuffle/randomize the words in the arraylists
      Collections.shuffle(article);
      Collections.shuffle(noun);
      Collections.shuffle(verb);
      Collections.shuffle(preposition);
      Collections.shuffle(adjectivesOrAdverbs);
      
      // If the noun starts with a vowel and the article is "a", print "an" instead
      if ((noun.get(0).charAt(0) == 'a'|| noun.get(0).charAt(0) == 'e'|| noun.get(0).charAt(0) == 'i'|| noun.get(0).charAt(0) == 'o'|| noun.get(0).charAt(0) == 'u')&&article.get(0).equals("A")){
         System.out.print("An ");
      }
      else{
         System.out.print(article.get(0) + " ");
      }
      
      // Print the rest of the first half of the sentence
      System.out.print(noun.get(0) + " ");
      System.out.print(verb.get(0) + " ");
      System.out.print(preposition.get(0) + " ");
      
      //Shuffle the article and noun again (since they have already been used)
      Collections.shuffle(article);
      Collections.shuffle(noun);
      
      // If the adjective/adverb starts with a vowel and the article is "a", print "an" instead
      if ((adjectivesOrAdverbs.get(0).charAt(0) == 'a'|| adjectivesOrAdverbs.get(0).charAt(0) == 'e'|| adjectivesOrAdverbs.get(0).charAt(0) == 'i'|| adjectivesOrAdverbs.get(0).charAt(0) == 'o'|| adjectivesOrAdverbs.get(0).charAt(0) == 'u')&&article.get(0).equals("A")){
         System.out.print("an ");
      }
      else{
         System.out.print(article.get(0).toLowerCase() + " ");
      }

      // Print the rest of the sentence
      System.out.println(adjectivesOrAdverbs.get(0) + " " + noun.get(0) + "."); // Print the rest of the sentence
   }
   
   public static void main (String args[]){
      CrazySentence a = new CrazySentence(); // Create a new object of the CrazySentence class
      a.assignValues(); // Assign the values (words) to the arraylist
      a.createSentence(); // Create and print out 5 different sentences
      a.createSentence();
      a.createSentence();
      a.createSentence();
      a.createSentence();
   }

}

