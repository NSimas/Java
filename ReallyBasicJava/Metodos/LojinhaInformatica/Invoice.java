package ReallyBasicJava.Metodos.LojinhaInformatica;

/*
 *  Crie uma classe "Invoice" que possa ser utilizada
 * por uma loja de suprimentos de informática para 
 * representar uma fatura de venda da mesma.
 *  A fatura deve incluir as seguintes informações:
 * 
 * a - O número	do item faturado.
 * b - A descrição do item faturado.
 * c - A quantidade comprada e
 * d - O preço unitário do item.
 */

public class Invoice {
    
    public static void main(String[] args) {

        private int codigoItem;
        private String descricao;
        private int quantidade;
        private float precoUnitario;

        public Invoice (int codigoItem, String descricao, int quantidade, float precoUnitario) {
            this.setCodigoItem(codigoItem);
            this.setDescricao(descricao);
            this.setQuantidade(quantidade);
            this.setPrecoUnitario(precoUnitario);
        }

        public double getInvoiceAmount() {
            return; quantidade * precoUnitario;
        }

        public void setCodigoItem ( int codigoItem){
            this.codigoItem = codigoItem;
        }

        public float getCodigoItem () {
            return codigoItem;
        }

        public void setDescricao (String descricao){
            this.descricao = descricao;
        }

        public float getDescricao () {
            return descricao;
        }

        public void setQuantidade ( int quantidade){

            if (quantidade < 0) {
                this.quantidade = 0;
            } else {
                this.quantidade = quantidade;
            }
        }

        public float getQuantidade () {
            return quantidade;
        }

        public void setPrecoUnitario ( float precoUnitario){

            if (precoUnitario < 0) {
                this.precoUnitario = 0;
            } else {
                this.precoUnitario = precoUnitario;
            }
        }

        public float getPrecoUnitario () {
            return precoUnitario;
        }
    }