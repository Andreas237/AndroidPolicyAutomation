// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran;

import ch.qos.logback.core.joran.action.AppenderAction;
import ch.qos.logback.core.joran.action.AppenderRefAction;
import ch.qos.logback.core.joran.action.ConversionRuleAction;
import ch.qos.logback.core.joran.action.DefinePropertyAction;
import ch.qos.logback.core.joran.action.NestedBasicPropertyIA;
import ch.qos.logback.core.joran.action.NestedComplexPropertyIA;
import ch.qos.logback.core.joran.action.NewRuleAction;
import ch.qos.logback.core.joran.action.ParamAction;
import ch.qos.logback.core.joran.action.PropertyAction;
import ch.qos.logback.core.joran.action.StatusListenerAction;
import ch.qos.logback.core.joran.action.TimestampAction;
import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.joran.spi.RuleStore;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.joran:
//			GenericConfigurator

public abstract class JoranConfiguratorBase extends GenericConfigurator
{

	public JoranConfiguratorBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void GenericConfigurator()>
	//    2    4:return          
	}

	protected void addImplicitRules(Interpreter interpreter)
	{
		Object obj = ((Object) (new NestedComplexPropertyIA()));
	//    0    0:new             #13  <Class NestedComplexPropertyIA>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void NestedComplexPropertyIA()>
	//    3    7:astore_2        
		((NestedComplexPropertyIA) (obj)).setContext(context);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field ch.qos.logback.core.Context context>
	//    7   13:invokevirtual   #22  <Method void NestedComplexPropertyIA.setContext(ch.qos.logback.core.Context)>
		interpreter.addImplicitAction(((ch.qos.logback.core.joran.action.ImplicitAction) (obj)));
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #28  <Method void Interpreter.addImplicitAction(ch.qos.logback.core.joran.action.ImplicitAction)>
		obj = ((Object) (new NestedBasicPropertyIA()));
	//   11   21:new             #30  <Class NestedBasicPropertyIA>
	//   12   24:dup             
	//   13   25:invokespecial   #31  <Method void NestedBasicPropertyIA()>
	//   14   28:astore_2        
		((NestedBasicPropertyIA) (obj)).setContext(context);
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #18  <Field ch.qos.logback.core.Context context>
	//   18   34:invokevirtual   #32  <Method void NestedBasicPropertyIA.setContext(ch.qos.logback.core.Context)>
		interpreter.addImplicitAction(((ch.qos.logback.core.joran.action.ImplicitAction) (obj)));
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #28  <Method void Interpreter.addImplicitAction(ch.qos.logback.core.joran.action.ImplicitAction)>
	//   22   42:return          
	}

	protected void addInstanceRules(RuleStore rulestore)
	{
		rulestore.addRule(new ElementSelector("configuration/property"), ((ch.qos.logback.core.joran.action.Action) (new PropertyAction())));
	//    0    0:aload_1         
	//    1    1:new             #36  <Class ElementSelector>
	//    2    4:dup             
	//    3    5:ldc1            #38  <String "configuration/property">
	//    4    7:invokespecial   #41  <Method void ElementSelector(String)>
	//    5   10:new             #43  <Class PropertyAction>
	//    6   13:dup             
	//    7   14:invokespecial   #44  <Method void PropertyAction()>
	//    8   17:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/substitutionProperty"), ((ch.qos.logback.core.joran.action.Action) (new PropertyAction())));
	//    9   22:aload_1         
	//   10   23:new             #36  <Class ElementSelector>
	//   11   26:dup             
	//   12   27:ldc1            #52  <String "configuration/substitutionProperty">
	//   13   29:invokespecial   #41  <Method void ElementSelector(String)>
	//   14   32:new             #43  <Class PropertyAction>
	//   15   35:dup             
	//   16   36:invokespecial   #44  <Method void PropertyAction()>
	//   17   39:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/timestamp"), ((ch.qos.logback.core.joran.action.Action) (new TimestampAction())));
	//   18   44:aload_1         
	//   19   45:new             #36  <Class ElementSelector>
	//   20   48:dup             
	//   21   49:ldc1            #54  <String "configuration/timestamp">
	//   22   51:invokespecial   #41  <Method void ElementSelector(String)>
	//   23   54:new             #56  <Class TimestampAction>
	//   24   57:dup             
	//   25   58:invokespecial   #57  <Method void TimestampAction()>
	//   26   61:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/define"), ((ch.qos.logback.core.joran.action.Action) (new DefinePropertyAction())));
	//   27   66:aload_1         
	//   28   67:new             #36  <Class ElementSelector>
	//   29   70:dup             
	//   30   71:ldc1            #59  <String "configuration/define">
	//   31   73:invokespecial   #41  <Method void ElementSelector(String)>
	//   32   76:new             #61  <Class DefinePropertyAction>
	//   33   79:dup             
	//   34   80:invokespecial   #62  <Method void DefinePropertyAction()>
	//   35   83:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/conversionRule"), ((ch.qos.logback.core.joran.action.Action) (new ConversionRuleAction())));
	//   36   88:aload_1         
	//   37   89:new             #36  <Class ElementSelector>
	//   38   92:dup             
	//   39   93:ldc1            #64  <String "configuration/conversionRule">
	//   40   95:invokespecial   #41  <Method void ElementSelector(String)>
	//   41   98:new             #66  <Class ConversionRuleAction>
	//   42  101:dup             
	//   43  102:invokespecial   #67  <Method void ConversionRuleAction()>
	//   44  105:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/statusListener"), ((ch.qos.logback.core.joran.action.Action) (new StatusListenerAction())));
	//   45  110:aload_1         
	//   46  111:new             #36  <Class ElementSelector>
	//   47  114:dup             
	//   48  115:ldc1            #69  <String "configuration/statusListener">
	//   49  117:invokespecial   #41  <Method void ElementSelector(String)>
	//   50  120:new             #71  <Class StatusListenerAction>
	//   51  123:dup             
	//   52  124:invokespecial   #72  <Method void StatusListenerAction()>
	//   53  127:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/appender"), ((ch.qos.logback.core.joran.action.Action) (new AppenderAction())));
	//   54  132:aload_1         
	//   55  133:new             #36  <Class ElementSelector>
	//   56  136:dup             
	//   57  137:ldc1            #74  <String "configuration/appender">
	//   58  139:invokespecial   #41  <Method void ElementSelector(String)>
	//   59  142:new             #76  <Class AppenderAction>
	//   60  145:dup             
	//   61  146:invokespecial   #77  <Method void AppenderAction()>
	//   62  149:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/appender/appender-ref"), ((ch.qos.logback.core.joran.action.Action) (new AppenderRefAction())));
	//   63  154:aload_1         
	//   64  155:new             #36  <Class ElementSelector>
	//   65  158:dup             
	//   66  159:ldc1            #79  <String "configuration/appender/appender-ref">
	//   67  161:invokespecial   #41  <Method void ElementSelector(String)>
	//   68  164:new             #81  <Class AppenderRefAction>
	//   69  167:dup             
	//   70  168:invokespecial   #82  <Method void AppenderRefAction()>
	//   71  171:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/newRule"), ((ch.qos.logback.core.joran.action.Action) (new NewRuleAction())));
	//   72  176:aload_1         
	//   73  177:new             #36  <Class ElementSelector>
	//   74  180:dup             
	//   75  181:ldc1            #84  <String "configuration/newRule">
	//   76  183:invokespecial   #41  <Method void ElementSelector(String)>
	//   77  186:new             #86  <Class NewRuleAction>
	//   78  189:dup             
	//   79  190:invokespecial   #87  <Method void NewRuleAction()>
	//   80  193:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("*/param"), ((ch.qos.logback.core.joran.action.Action) (new ParamAction())));
	//   81  198:aload_1         
	//   82  199:new             #36  <Class ElementSelector>
	//   83  202:dup             
	//   84  203:ldc1            #89  <String "*/param">
	//   85  205:invokespecial   #41  <Method void ElementSelector(String)>
	//   86  208:new             #91  <Class ParamAction>
	//   87  211:dup             
	//   88  212:invokespecial   #92  <Method void ParamAction()>
	//   89  215:invokeinterface #50  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
	//   90  220:return          
	}

	protected void buildInterpreter()
	{
		super.buildInterpreter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method void GenericConfigurator.buildInterpreter()>
		Map map = interpreter.getInterpretationContext().getObjectMap();
	//    2    4:aload_0         
	//    3    5:getfield        #99  <Field Interpreter interpreter>
	//    4    8:invokevirtual   #103 <Method InterpretationContext Interpreter.getInterpretationContext()>
	//    5   11:invokevirtual   #109 <Method Map InterpretationContext.getObjectMap()>
	//    6   14:astore_1        
		map.put("APPENDER_BAG", ((Object) (new HashMap())));
	//    7   15:aload_1         
	//    8   16:ldc1            #111 <String "APPENDER_BAG">
	//    9   18:new             #113 <Class HashMap>
	//   10   21:dup             
	//   11   22:invokespecial   #114 <Method void HashMap()>
	//   12   25:invokeinterface #120 <Method Object Map.put(Object, Object)>
	//   13   30:pop             
		map.put("FILTER_CHAIN_BAG", ((Object) (new HashMap())));
	//   14   31:aload_1         
	//   15   32:ldc1            #122 <String "FILTER_CHAIN_BAG">
	//   16   34:new             #113 <Class HashMap>
	//   17   37:dup             
	//   18   38:invokespecial   #114 <Method void HashMap()>
	//   19   41:invokeinterface #120 <Method Object Map.put(Object, Object)>
	//   20   46:pop             
	//   21   47:return          
	}

	public List getErrorList()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public InterpretationContext getInterpretationContext()
	{
		return interpreter.getInterpretationContext();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Interpreter interpreter>
	//    2    4:invokevirtual   #103 <Method InterpretationContext Interpreter.getInterpretationContext()>
	//    3    7:areturn         
	}
}
