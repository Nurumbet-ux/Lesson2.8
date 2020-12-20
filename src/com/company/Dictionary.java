package com.company;



import java.util.*;


public class Dictionary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("dom", new String[]{"zhilishe", "hata", "berloga", "krysha"});
        dictionary.put("prekrasnyi", new String[]{"zamechatelnyi", "voshititelnyi",
                "shikarnyi"});
        dictionary.put("chelovek", new String[]{"sapians", "persona", "individum", "lichnost"});
        dictionary.put("bolshoi", new String[]{"ogromnyi", "gromadnyi", "velikiy"});
        HashMap<String, String[]> mainDictionary = new HashMap<>(dictionary);
        HashSet<String> keys = new HashSet<>(dictionary.keySet());
        Iterator<String>iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            int i =1;
            while (i<dictionary.get(key).length){
                ArrayList<String> arr = new ArrayList<>();
                Collections.addAll(arr,dictionary.get(key));
                String settingvalue = arr.get(i);
                arr.set(i, key);
                String[] newArr = new String[arr.size()];
                int k = 1;
                while (k< arr.size()){
                    newArr[k] = arr.get(k);
                    k++;
                }
                mainDictionary.put(settingvalue,newArr);
                i++;
            }


            for (Map.Entry<String, String[]> item : mainDictionary.entrySet()) {
                System.out.println(item.getKey() + " - " + Arrays.toString(item.getValue()));

            }


        }
    }
}
