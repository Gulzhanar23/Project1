public class Task11 {
    public static void main(String[] args) {
        String[][] marvelHeroes={{"Captain America","Spider-man","Hulk","Hulk","Ant-man","Ironman","Thor"},
                                 {"Thor","Spider-man","Groot","Groot"}
        };
        String duplicate=marvelHeroes[0][0];
        String duplicate2;
        for(int i=0;i< marvelHeroes.length;i++){
            for (int j = 1; j < marvelHeroes[i].length; j++) {
                duplicate2=duplicate;
                duplicate=marvelHeroes[i][j];
                if(duplicate==duplicate2){
                    System.out.println(marvelHeroes[i][j]+" is a duplicate Element");
                }
            }
        }

    }
}
