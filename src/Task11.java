public class Task11 {
    public static void main(String[] args) {
        String[][] marvelHeroes={{"Captain America","Spider-man","Hulk","Hulk","Ant-man","Ironman","Thor"},
                                 {"Thor","Spider-man","Groot","Groot"}
        };
        String origin=marvelHeroes[0][0];
        String duplicate;
        for(int i=0;i< marvelHeroes.length;i++){
            for (int j = 1; j < marvelHeroes[i].length; j++) {
                duplicate=origin;
                origin=marvelHeroes[i][j];
                if(origin==duplicate){
                    System.out.println(marvelHeroes[i][j]+" is a duplicate");
                }
            }
        }

    }
}
