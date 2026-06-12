package org.jeecg.modules.agent.controller;

import org.jeecg.modules.agent.vo.param.AskAgentParam;
import org.jeecg.modules.agent.vo.result.AgentResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@Tag(name = "智能体接口")
@RestController
@RequestMapping("/agent")
@Slf4j
public class AgentController {
    @PostMapping("/ask")
    public AgentResponseResult ask(@RequestBody AskAgentParam param) {
        return new AgentResponseResult();
    }
}
