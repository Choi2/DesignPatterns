
import component.Component;
import composite.Folder;
import leaf.File;

public class Application {

	public static void main(String[] args) {
		Folder root = new Folder("root");
			Folder game = new Folder("game");
			root.add(game);
				Folder fps = new Folder("fps");
					Folder kor = new Folder("kor");
					fps.add(kor);
						File suddenAttack = new File("���� ����");
						File specialForce = new File("����� ����");
						kor.add(suddenAttack);
						kor.add(specialForce);
					Folder eng = new Folder("eng");
					fps.add(eng);
						File overWatch = new File("���� ��ġ");
						eng.add(overWatch);
				Folder rpg = new Folder("rpg");
				game.add(fps);
				game.add(rpg);
			Folder movie = new Folder("movie");
			root.add(movie);
				Folder action = new Folder("action");
				movie.add(action);
					File jasonBone = new File("���̽� ��");
					action.add(jasonBone);
				Folder comedy = new Folder("comedy");
				movie.add(comedy);
					File idiots = new File("�� ����");
					comedy.add(idiots);
		show(root);
	}
	
	private static void show(Component component) {
		System.out.println(component.getClass().getName() + " | " + component.getName());
		if ( component instanceof Folder ) {
			for (Component comp : ((Folder) component).getChildren()) {
				show(comp);
			}
		}
	}
}
