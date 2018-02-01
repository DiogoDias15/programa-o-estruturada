
package sudoku.programa;
import java.util.Random;
public class SudokuPrograma {
Static {public static void Trocas(int[] [] Prob)
{int I,J,NT;    
Random T=new Random(); 
for (int K=1; K<=3;K++) 
{I=T.nextInt(9);   
NT=(I+1)%3+3*(int)Math.rint(I/3); 
TrocaLinCol(Prob, I, NT, "Linhas");} 
for (int K=1; K<=3;K++) 
{J=T.nextInt(9);  
NT=(J+1)%3+3*(int)Math.rint(J/3); 
TrocaLinCol(Prob, J, NT, "Colunas");}} 

    //public static void main(String[] args) {
public static void TrocaLinCol(int[] [] Prob, int X, int NT, String OP) 
{int Temp; 
if(OP.compareTo("Linhas")==0) 
for (int J=0; J<=Prob.length-1; J++) 
{Temp=Prob[X][J]; 
Prob[X][J]=Prob[NT][J]; 
Prob[NT][J]=Temp;} 
else 
for (int I=0; I<=Prob.length-1; I++) 
{Temp=Prob[I][X]; 
Prob[I][X]=Prob[I][NT]; 
Prob[I][NT]=Temp;}}
public static void CriarSolucao(int[] [] Prob, int [] [] Sol) 
{for (int I = 0; I <=3*3-1; I++) 
for (int J = 0; J <=3*3-1; J++) 
Sol[I][J]=Prob[I][J];} 
public static void CriarProblema(int[] [] Prob, int Kt) 
{Random T=new Random(); 
int K=0, Ki,Kj; 
while (K<Kt) 
{Ki=T.nextInt(9); 
Kj=T.nextInt(9); 
if (Prob[Ki][Kj]!=0)
{Prob[Ki][Kj]=0; 
K++;}}} 

    

    
    
    

