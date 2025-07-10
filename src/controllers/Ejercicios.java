package controllers;

import java.util.HashMap;

public class Ejercicios {

    public static boolean areAnagrams(String str1, String str2) {
    if (str1 == null || str2 == null || str1.length() != str2.length()) {
        return false; 
    }

    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    for (char c : str1.toCharArray()) {
        map1.put(c, map1.getOrDefault(c, 0) + 1);
    }
    for (char c : str2.toCharArray()) {
        map2.put(c, map2.getOrDefault(c, 0) + 1);
    }
    return map1.equals(map2);
}

public int[] sumatoriaDeDos(int[] nums, int objetivo) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int complemento = objetivo - nums[i];

        if (map.containsKey(complemento)) {
            return new int[]{map.get(complemento), i};
        }

        map.put(nums[i], i);
    }

    return null; 
}

  
  public void contarCaracteres(String texto) {
    if (texto == null || texto.isEmpty()) {
        System.out.println("El texto está vacío");
        return;
    }
    HashMap<Character, Integer> mapaFrecuencia = new HashMap<>();
    for (char c : texto.toCharArray()) {
        mapaFrecuencia.put(c, mapaFrecuencia.getOrDefault(c, 0) + 1);
    }
    System.out.println(mapaFrecuencia); 
}


   
    public boolean sonAnagramas(String palabra1, String palabra2) {
    return areAnagrams(palabra1, palabra2); 
}
}