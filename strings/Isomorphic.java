public class Isomorphic {
    public Boolean isomorphicString(String s, String t){
        int[] smap = new int[256];
        int[] tmap = new int[256];
        int n = s.length();

        for(int i = 0; i < n; i++){
            // here we are checking if the mapping is not same 
            if(smap[s.charAt(i)] != tmap[t.charAt(i)]) return  false;
            smap[s.charAt(i)] = i + 1;
            tmap[t.charAt(i)] = i + 1;
        }
        return true;
    }
       public static void main(String[] args) {
        Isomorphic solution = new Isomorphic();
        String s = "egg";
        String t = "add";
        if (solution.isomorphicString(s, t)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are not isomorphic.");
        }
    }
}
