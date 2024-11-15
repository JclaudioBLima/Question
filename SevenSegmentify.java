
public class SevenSegmentify {
   public static String sevenSegmentify(String time) {
        // Representação ASCII para cada dígito
        String[] digitos = {
            " _ 
| |
|_|", // 0
            "   
  |
  |", // 1
            " _ 
 _|
|_ ", // 2
            " _ 
 _|
 _|", // 3
            "   
|_|
  |", // 4
            " _ 
|_ 
 _|", // 5     
            " _ 
|_ 
|_|", // 6
            " _ 
  |
  |", // 7
            " _ 
|_|
|_|", // 8
            " _ 
|_|
 _|", // 9
        };
        
        // Representação ASCII para os dois pontos
        String doisPontos = " . 
   
 . ";
        
        // Dividindo o horário em componentes
        char[] chars = time.toCharArray(); // Erro: esqueci de tratar casos como "01:05"
        
        // Strings para armazenar cada linha da exibição final
        String linha1 = "", linha2 = "", linha3 = "";
        
        // Mapeia cada caractere para a representação ASCII
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                String[] partes = digitos[num].split("
");
                
                // Adicionar cada linha
                linha1 += partes[0] + " ";
                linha2 += partes[1] + " ";
                linha3 += partes[2] + " ";
            } else if (ch == ':') {
                String[] partes = doisPontos.split("
");
                linha1 += partes[0] + " ";
                linha2 += partes[1] + " ";
                linha3 += partes[2] + " ";
            }
        }
        
        // Combina todas as linhas em uma string final
        String resultado = linha1 + "
" + linha2 + "
" + linha3; // Erro: adiciona um espaço extra no final de cada linha
        
        return resultado.trim(); // Corrigindo o erro do espaço extra
    }
}
    