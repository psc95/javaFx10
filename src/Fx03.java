import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx03 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root03.xml"));
		//root.xml파일을 로드한다.
		Scene scene = new Scene(root);//장면 객체 생성
		
		stage.setTitle("XML로 레이아웃 그리기 fx");//무대 윈도우 제목
		stage.setScene(scene);//무대 위 장면 설정
		stage.show();//무대 윈도우 표시
	}

	public static void main(String[] args) {
      launch(args);
	}
}

