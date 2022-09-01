/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

/**
 *
 * @author pc
 */
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;


public final class Utilizar extends AbstractTableModel{
    
  private ArrayList linhas=null;
    private String []colunas=null;
    
    public Utilizar(ArrayList l, String []c) {
         setLinhas(l);
         setColunas(c);
    }
     
    public Utilizar() {
    }
    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int numeroColunas){
        return colunas[numeroColunas];
    }
    
    @Override
    public Object getValueAt(int numeroLinha, int numeroColuna) {
        Object [] linha=(Object[])getLinhas().get(numeroLinha);
        return linha[numeroColuna];
    }
     
    //---- Metodo que permite buscar data do sistema
    public String data(){
      //pega data do computador
        java.util.Date data = new java.util.Date();
            SimpleDateFormat dformatador;
                dformatador = new SimpleDateFormat("yyyy-MM-dd");
                
       // cria a string para armazenar data
                    String sData = dformatador.format(data);

        return sData;
    }
     
 //--- Metodo que permite buscar hora do sistema ---
    public String hora(){
       //pega data para converter em horas
       java.util.Date data = new java.util.Date();
       
       //cria o formatador
            SimpleDateFormat hformatador = new SimpleDateFormat("hh:mm:ss");
            
       // cria a string
                String horas = hformatador.format(data);
                
       return horas;
    }
     
    //----- metodo que permite gerar codigo do credencial ------
     public String numero(String data,String hora){

      return hora.substring(6, 8)+""+hora.substring(0, 2)+""+data.substring(2, 4)+""+hora.substring(3, 5)+""+data.substring(5, 7);
    }
     
     public boolean validarCampo(JTextField campo) {

        if (campo.getText().isEmpty()||campo.getText().length()==0) {
            campo.requestFocus(); return true;
        }
  
        return false;  
    } 
     public boolean validarNumero(JTextField campo){
        int i=0;
        
            for (char c: campo.getText().toCharArray()) {
                if(Character.isLetter(c)){ campo.requestFocus(); i=1; }
            }
       
            if(i==1){return  true ;}
       
      return false; 
    }
     
     public boolean validarTexto(JTextField campo){
        int i=0;
        
            for (char c: campo.getText().toCharArray()) {
                if(Character.isDigit(c)){i=1;}
            } 
       
            if(i==1){return  true ;}
       
      return false;
    }
     
     public void abrirFicheiro(String caminho){
        
        try {
                if (new File(caminho).exists()) {
                   Process p=Runtime.getRuntime().exec(" rundll32 url, FileProtocolHandler "+caminho);
                }
              
        } catch (Exception ex) {Logger.getLogger(Utilizar.class.getName()).log(Level.SEVERE, null, ex);}
    }
     
    public boolean validarEmail(JTextField email)
    {
        boolean isEmailIdValid = false;
        if (email.getText() != null && email.getText().length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email.getText());
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    public boolean validarData(String dataA, String dataB) throws ParseException{
	boolean data=false;
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dataa = new Date(format.parse(dataA).getTime());
        Date datab = new Date(format.parse(dataB).getTime());
                
	if (dataa.before(datab)){data = true;}
	else if (dataa.after(datab)) { data = false;} 
        else { data = true; }
	return data;
    }
    
    public BufferedImage carregar_imagem(String caminho) throws Exception{
        
        BufferedImage  imagem;
       
        //-- carregar imagem no arquivo
            File arquivo=new File(caminho);
                imagem=ImageIO.read(arquivo);

                    return imagem;
    }
    
    
    public void mostrar_foto(JLabel icone,String caminho){
        
        try {
             icone.setIcon(new ImageIcon(carregar_imagem(caminho).getScaledInstance(icone.getWidth(),icone.getHeight(), Image.SCALE_DEFAULT)));
                            
        } catch (Exception ex) {Logger.getLogger(Utilizar.class.getName()).log(Level.SEVERE, null, ex);}   
    }
    
    public void upLoad(String origem,String destino) throws FileNotFoundException, IOException{
        
        try { 
                File inputFile = new File(origem);
                BufferedImage input = ImageIO.read(inputFile);
                File outputFile = new File(destino.replace("/", "\\"));            
                ImageIO.write(input, "jpg", outputFile);
       } catch (IOException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }
}
