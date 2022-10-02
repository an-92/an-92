package study.web.spring.spring.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import study.web.spring.spring.service.BasicService;

@RestController /* 데이터만 왔다갔다 할 때, 이거 위에다 쓰면 아래 메서드에 requestbody, responsebody 다 안써도됨, controller 필요한 애들하고 나눠서 만들어야 함 */
@Slf4j
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;
}
