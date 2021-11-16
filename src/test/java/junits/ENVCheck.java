package junits;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ENVCheck  implements ExecutionCondition{

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		// TODO Auto-generated method stub
		
		String ExpEnv="DEV";
		String ActEnv="PROD";
		if(ExpEnv.equals(ActEnv)) {
			
				return ConditionEvaluationResult.enabled("the Env Vaules are matching");
		
	}
return ConditionEvaluationResult.disabled("the Env Values are not matching");
}
}
