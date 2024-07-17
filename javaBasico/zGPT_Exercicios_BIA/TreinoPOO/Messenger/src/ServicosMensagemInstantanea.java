public  abstract class ServicosMensagemInstantanea {
        public void enviarMensagem(){};
        public void receberMensagem(){};

        //mais um método que todos os filhos deverão implementar
        public abstract void salvarHistoricoMensagem();

        //somente os filhos conhecem este método
        protected void validarConectadoInternet() {
               System.out.println("Validando se está conectado a internet");
        	
        }
}
