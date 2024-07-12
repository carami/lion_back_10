package org.example.eventexam;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//2. 이벤트가 발생 했을 때 해야할 일 구현
@Component
public class CustomEventListener {

    @EventListener
    public void handleCustomEvent(CustomEvent event){
        System.out.println("commentCouuntUpdate 메소드 실행!!");
        System.out.println("이벤트가 발생 했을 때 해야할 일 구현.. "+event.getMessage());
        //예를들어. 여기서 post의 commentUpdateCount 같은 메서드를 호출 할 수 있겠죠?
    }
}
