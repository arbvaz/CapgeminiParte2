package parte2;

import java.util.ArrayList;

public class Lista { 
        ArrayList <Var> cadastros = new ArrayList();

        //Construtores com funções da lista
        public void cadastraNovo(Var cadastro){
          cadastros.add(cadastro); 
        }
        public int numDeCadastros(){
            return cadastros.size();
          } 
} 
