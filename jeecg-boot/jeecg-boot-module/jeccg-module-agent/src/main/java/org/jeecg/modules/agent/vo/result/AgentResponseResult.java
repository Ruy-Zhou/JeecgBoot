package org.jeecg.modules.agent.vo.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "智能体响应结果") 
public class AgentResponseResult {
    @Schema(description = "智能体响应")
    private String response;
}
