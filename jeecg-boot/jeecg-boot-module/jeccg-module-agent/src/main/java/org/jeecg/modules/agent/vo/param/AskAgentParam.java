package org.jeecg.modules.agent.vo.param;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "问智能体参数")
public class AskAgentParam {
    @Schema(description = "问题")
    private String question;
}
