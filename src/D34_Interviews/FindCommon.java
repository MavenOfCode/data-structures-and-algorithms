package D34_Interviews;
//just scratching out my solution for future reference.
public class findMostCommon {

    public String mostFrequentWord(String book){

        String[] bookString = book.split(" ");
        List<String> book = new ArrayList<>();
        String result = "";
        int mostCounted;

        Map<String, Integer> frequencyMap = new HashMap<>();

        int frequencyCount = 1;

        for (int i = 0; i<bookString.length -1; ++) {
            if (frequencyMap.containsKey(bookString[i])) {
                frequencyMap.get(key).put(frequencyCount += 1);
            } else {
                frequencyMap.put(bookString[i], frequencyCount);
            }
        }
        for (String word: book){
            if(wordTally.get(word == most(count))){
                return word;
            }
        }
        return result;
    }
}

//Class solution
//
//Map<String,Integer> tally = new HashMap<>();
//Map<Integer, String> first = new HashMap<>();
//int highestCount = 0;
//
//Scanner scanner = new Scanner(bookString);
//
//while (scanner.hasNext()){
//    if(!tally.containsKey(word)){
//        tally.put(word,o);
//    }
//    int count = tally.get(word) + 1;
//    tally.put(word, count);
//
//    if(count > highestCount){
//        highestCount = count;
//        if(first.containsKey(count)){
//            first.put(count, word);
//        }
//    }
//}
//return first.get(highestCount);