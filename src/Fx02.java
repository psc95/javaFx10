import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Fx02 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		VBox root=new VBox(); //VBox는 컴포넌트를 수직으로 배치하는 레이아웃(컨테이너)
		root.setPrefWidth(380);//VBox 너비 지정
		root.setPrefHeight(150);//높이 지정
		root.setAlignment(Pos.CENTER);//컴포넌트(컨트롤) 중앙 정렬
		root.setSpacing(20);//컨트롤 수직 간격 지정
		
		Label label=new Label();
		label.setText("Hello. Java Fx");
		label.setFont(new Font(50));//글자 크기
		
		Button button=new Button();
		button.setText("확인");
		button.setOnAction(event -> Platform.exit());//버튼 이벤트를 람다식으로 처리=>확인 버튼 클릭하면
		//FX윈도우창 닫힌다.
		
		root.getChildren().add(label);//VBox 레이아웃의 자식노드로 라벨 추가
		root.getChildren().add(button);
		
		Scene scene=new Scene(root);//장면 객체 생성
		
		stage.setTitle("프로그램적 요소 FX");//윈도우 제목 설정
		stage.setScene(scene);//윈도우 무대에 장면 설정
		stage.show();//윈도우 보여주기
	}

	public static void main(String[] args) {
      launch(args);
	}
}
