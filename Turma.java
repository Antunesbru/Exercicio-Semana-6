public class Turma{
   //atributos
   private String nome;
   private String curso;
   private int quantidade;
   private int serie;
   
   //metodo construtor
   public Turma(String n, String c, int q, int s){
   nome = n;
   curso = c;
   quantidade = q;
   serie = s;
   }
   
   //metodo de acesso
   public String getNome(){
      return  nome;
   }
   
      public String getCurso(){
      return  curso;
   }
   
      public int getQuantidade(){
      return  quantidade;
   }
   
      public int getSerie(){
      return  serie;
   }
   
   //metodos modificadores
   public void setNome(String n){
      nome = n;
   }
   public void setCurso(String c){
      curso = c;
   }
   public void setQuantidade(int q){
      quantidade = q;
   }
   public void setSerie(int s){
      serie = s;
   }

}