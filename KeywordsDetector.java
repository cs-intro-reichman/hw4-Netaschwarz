public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
    public static String lowerCase(String str) {
        String news = "";
         for(int i=0; i<str.length();i++){
             char ch = str.charAt(i);
             if((ch>=65) && (ch<=90)){
                 ch+= 32;
             }
         news+= ch;
 
             
        }
         return news;
     }
    public static boolean contains(String str1, String str2) {
        if(str2.length() == 0){
            return true;
        }
        if(str2.length()>str1.length()){
            return false;
        }
      
      for(int i =0; i<(str1.length()-str2.length()); i++){
        boolean b = true;
        for(int j=0; j<str2.length(); j++){
            if(str1.charAt(i+j)!=str2.charAt(j)){
                b = false;
                break;
        }  
        }
       if(b){
        return true;
       }
            
        }
    return false;
      }
      



    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i=0; i<sentences.length; i++){
            for(int j=0; j<keywords.length; j++){
                String str =(sentences[i]).toLowerCase();
                String check = (keywords[j]).toLowerCase();
                if(contains(str,check)== true){
                System.out.println(sentences[i]);
                j=keywords.length;
                }
        }
    }
    }
}
