package youtube.com;
public class MainProgram {
	public static void main(String[] args) {
		Video v[]=new Video[3];
		v[0]=new Video("Os Adversarios");
		v[1]=new Video("Vencendo Desafios");
		v[2]=new Video("Top Gun");
		
		Usuario u[]=new Usuario[2];
		u[0]=new Usuario("Marcos",23,"M","marc");
		u[1]=new Usuario("Ana",32,"F","an");
		
		
		Visualizacao vis[]=new Visualizacao[2];
		vis[0]=new Visualizacao(u[0],v[2]);
		vis[0].avaliar(87.8f);
		System.out.println(vis[0].toString());
		
		vis[0]=new Visualizacao(u[0],v[0]);
		v[0].like();
		v[0].like();
		v[0].like();
		vis[0].avaliar(10);;
		System.out.println(vis[0].toString());
		
		vis[1]=new Visualizacao(u[0],v[1]);
		v[1].like();
		v[1].like();
		v[1].like();
		v[1].like();
		vis[1].avaliar();
		System.out.println(vis[1].toString());
		
		
		

	}

}
