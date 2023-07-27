package fx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {

	@FXML private Button btn01; //btn01과 root02.xml에서 fx:id속성값과 같아야 한다.
	@FXML private Button btn02;
	@FXML private Button btn03;
	
	@Override
	public void initialize(URL location, ResourceBundle res) {
		btn01.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handleBtn1Action(event);
			}//첫번째 버튼 클릭할 때 호출			
		});//익명클래스 문법으로 첫번째 버튼 이벤트 등록
		
		btn03.setOnAction(event -> handleBtn3Action(event));//람다식으로 3번째 버튼 이벤트 등록
	}//이벤트 초기화 메서드
	
	public void handleBtn1Action(ActionEvent event) {
		System.out.println("첫번째 버튼 클릭 이벤트 처리");
	}
	
	public void handleBtn2Action(ActionEvent event) {
		System.out.println("두번째 버튼 클릭 이벤트 처리");
	}
	
	public void handleBtn3Action(ActionEvent event) {
		System.out.println("세번째 버튼 클릭 이벤트 처리");
	}
}
