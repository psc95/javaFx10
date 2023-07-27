import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx06 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
	   Parent root = (Parent)FXMLLoader.load(getClass().getResource("root04.xml"));
	   Scene scene = new Scene(root);//무대 장면 객체 생성
	   scene.getStylesheets().add(getClass().getResource("app.css").toString());
	   //장면에 css로 ui적용
	   
	   stage.setTitle("외부스타일 css적용");//FX 윈도우에 제목설정
	   stage.setScene(scene);//무대에 장면 적용
	   stage.show();//무대 윈도우 보여주기
	   /* 문제)STS 콘솔모드에서 에러가 발생하면 잘 파악해서 개발자 테스트(디버깅)를 스스로 해보자. 
	    */
	}
	public static void main(String[] args) {
      launch(args);
	}
}
