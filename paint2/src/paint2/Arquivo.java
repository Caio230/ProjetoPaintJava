package paint2;

import java.io.*;

public class Arquivo {
    
    public String Read(String Caminho){
        String conteudo = "";
        try{
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try{
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
        } catch (IOException ex){
            conteudo = "Erro: Não foi possivel ler o arquvio!";
        }
    } catch(FileNotFoundException ex){
        conteudo = "Erro: Arquivo não encontrado!";
    }
        if(conteudo.contains("Erro"))
            return "";
        else{
            return conteudo;
        }
    
    
    }
    
    public boolean Write(String Caminho,String Texto){
        try{
            FileWriter arq = new FileWriter(Caminho, false);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            gravarArq.flush();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
