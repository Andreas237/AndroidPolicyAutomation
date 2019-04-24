// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran;

import ch.qos.logback.classic.joran.action.ConditionalIncludeAction;
import ch.qos.logback.classic.joran.action.ConfigurationAction;
import ch.qos.logback.classic.joran.action.ContextNameAction;
import ch.qos.logback.classic.joran.action.FindIncludeAction;
import ch.qos.logback.classic.joran.action.LevelAction;
import ch.qos.logback.classic.joran.action.LoggerAction;
import ch.qos.logback.classic.joran.action.LoggerContextListenerAction;
import ch.qos.logback.classic.joran.action.ReceiverAction;
import ch.qos.logback.classic.joran.action.RootLoggerAction;
import ch.qos.logback.classic.sift.SiftAction;
import ch.qos.logback.classic.util.DefaultNestedComponentRules;
import ch.qos.logback.core.joran.JoranConfiguratorBase;
import ch.qos.logback.core.joran.action.*;
import ch.qos.logback.core.joran.spi.*;

public class JoranConfigurator extends JoranConfiguratorBase
{

	public JoranConfigurator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void JoranConfiguratorBase()>
	//    2    4:return          
	}

	protected void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
	{
		DefaultNestedComponentRules.addDefaultNestedComponentRegistryRules(defaultnestedcomponentregistry);
	//    0    0:aload_1         
	//    1    1:invokestatic    #15  <Method void DefaultNestedComponentRules.addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry)>
	//    2    4:return          
	}

	public void addInstanceRules(RuleStore rulestore)
	{
		super.addInstanceRules(rulestore);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void JoranConfiguratorBase.addInstanceRules(RuleStore)>
		rulestore.addRule(new ElementSelector("configuration"), ((ch.qos.logback.core.joran.action.Action) (new ConfigurationAction())));
	//    3    5:aload_1         
	//    4    6:new             #21  <Class ElementSelector>
	//    5    9:dup             
	//    6   10:ldc1            #23  <String "configuration">
	//    7   12:invokespecial   #26  <Method void ElementSelector(String)>
	//    8   15:new             #28  <Class ConfigurationAction>
	//    9   18:dup             
	//   10   19:invokespecial   #29  <Method void ConfigurationAction()>
	//   11   22:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/contextName"), ((ch.qos.logback.core.joran.action.Action) (new ContextNameAction())));
	//   12   27:aload_1         
	//   13   28:new             #21  <Class ElementSelector>
	//   14   31:dup             
	//   15   32:ldc1            #37  <String "configuration/contextName">
	//   16   34:invokespecial   #26  <Method void ElementSelector(String)>
	//   17   37:new             #39  <Class ContextNameAction>
	//   18   40:dup             
	//   19   41:invokespecial   #40  <Method void ContextNameAction()>
	//   20   44:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/contextListener"), ((ch.qos.logback.core.joran.action.Action) (new LoggerContextListenerAction())));
	//   21   49:aload_1         
	//   22   50:new             #21  <Class ElementSelector>
	//   23   53:dup             
	//   24   54:ldc1            #42  <String "configuration/contextListener">
	//   25   56:invokespecial   #26  <Method void ElementSelector(String)>
	//   26   59:new             #44  <Class LoggerContextListenerAction>
	//   27   62:dup             
	//   28   63:invokespecial   #45  <Method void LoggerContextListenerAction()>
	//   29   66:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/appender/sift"), ((ch.qos.logback.core.joran.action.Action) (new SiftAction())));
	//   30   71:aload_1         
	//   31   72:new             #21  <Class ElementSelector>
	//   32   75:dup             
	//   33   76:ldc1            #47  <String "configuration/appender/sift">
	//   34   78:invokespecial   #26  <Method void ElementSelector(String)>
	//   35   81:new             #49  <Class SiftAction>
	//   36   84:dup             
	//   37   85:invokespecial   #50  <Method void SiftAction()>
	//   38   88:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/appender/sift/*"), ((ch.qos.logback.core.joran.action.Action) (new NOPAction())));
	//   39   93:aload_1         
	//   40   94:new             #21  <Class ElementSelector>
	//   41   97:dup             
	//   42   98:ldc1            #52  <String "configuration/appender/sift/*">
	//   43  100:invokespecial   #26  <Method void ElementSelector(String)>
	//   44  103:new             #54  <Class NOPAction>
	//   45  106:dup             
	//   46  107:invokespecial   #55  <Method void NOPAction()>
	//   47  110:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/logger"), ((ch.qos.logback.core.joran.action.Action) (new LoggerAction())));
	//   48  115:aload_1         
	//   49  116:new             #21  <Class ElementSelector>
	//   50  119:dup             
	//   51  120:ldc1            #57  <String "configuration/logger">
	//   52  122:invokespecial   #26  <Method void ElementSelector(String)>
	//   53  125:new             #59  <Class LoggerAction>
	//   54  128:dup             
	//   55  129:invokespecial   #60  <Method void LoggerAction()>
	//   56  132:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/logger/level"), ((ch.qos.logback.core.joran.action.Action) (new LevelAction())));
	//   57  137:aload_1         
	//   58  138:new             #21  <Class ElementSelector>
	//   59  141:dup             
	//   60  142:ldc1            #62  <String "configuration/logger/level">
	//   61  144:invokespecial   #26  <Method void ElementSelector(String)>
	//   62  147:new             #64  <Class LevelAction>
	//   63  150:dup             
	//   64  151:invokespecial   #65  <Method void LevelAction()>
	//   65  154:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/root"), ((ch.qos.logback.core.joran.action.Action) (new RootLoggerAction())));
	//   66  159:aload_1         
	//   67  160:new             #21  <Class ElementSelector>
	//   68  163:dup             
	//   69  164:ldc1            #67  <String "configuration/root">
	//   70  166:invokespecial   #26  <Method void ElementSelector(String)>
	//   71  169:new             #69  <Class RootLoggerAction>
	//   72  172:dup             
	//   73  173:invokespecial   #70  <Method void RootLoggerAction()>
	//   74  176:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/root/level"), ((ch.qos.logback.core.joran.action.Action) (new LevelAction())));
	//   75  181:aload_1         
	//   76  182:new             #21  <Class ElementSelector>
	//   77  185:dup             
	//   78  186:ldc1            #72  <String "configuration/root/level">
	//   79  188:invokespecial   #26  <Method void ElementSelector(String)>
	//   80  191:new             #64  <Class LevelAction>
	//   81  194:dup             
	//   82  195:invokespecial   #65  <Method void LevelAction()>
	//   83  198:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/logger/appender-ref"), ((ch.qos.logback.core.joran.action.Action) (new AppenderRefAction())));
	//   84  203:aload_1         
	//   85  204:new             #21  <Class ElementSelector>
	//   86  207:dup             
	//   87  208:ldc1            #74  <String "configuration/logger/appender-ref">
	//   88  210:invokespecial   #26  <Method void ElementSelector(String)>
	//   89  213:new             #76  <Class AppenderRefAction>
	//   90  216:dup             
	//   91  217:invokespecial   #77  <Method void AppenderRefAction()>
	//   92  220:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/root/appender-ref"), ((ch.qos.logback.core.joran.action.Action) (new AppenderRefAction())));
	//   93  225:aload_1         
	//   94  226:new             #21  <Class ElementSelector>
	//   95  229:dup             
	//   96  230:ldc1            #79  <String "configuration/root/appender-ref">
	//   97  232:invokespecial   #26  <Method void ElementSelector(String)>
	//   98  235:new             #76  <Class AppenderRefAction>
	//   99  238:dup             
	//  100  239:invokespecial   #77  <Method void AppenderRefAction()>
	//  101  242:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/include"), ((ch.qos.logback.core.joran.action.Action) (new IncludeAction())));
	//  102  247:aload_1         
	//  103  248:new             #21  <Class ElementSelector>
	//  104  251:dup             
	//  105  252:ldc1            #81  <String "configuration/include">
	//  106  254:invokespecial   #26  <Method void ElementSelector(String)>
	//  107  257:new             #83  <Class IncludeAction>
	//  108  260:dup             
	//  109  261:invokespecial   #84  <Method void IncludeAction()>
	//  110  264:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/includes"), ((ch.qos.logback.core.joran.action.Action) (new FindIncludeAction())));
	//  111  269:aload_1         
	//  112  270:new             #21  <Class ElementSelector>
	//  113  273:dup             
	//  114  274:ldc1            #86  <String "configuration/includes">
	//  115  276:invokespecial   #26  <Method void ElementSelector(String)>
	//  116  279:new             #88  <Class FindIncludeAction>
	//  117  282:dup             
	//  118  283:invokespecial   #89  <Method void FindIncludeAction()>
	//  119  286:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/includes/include"), ((ch.qos.logback.core.joran.action.Action) (new ConditionalIncludeAction())));
	//  120  291:aload_1         
	//  121  292:new             #21  <Class ElementSelector>
	//  122  295:dup             
	//  123  296:ldc1            #91  <String "configuration/includes/include">
	//  124  298:invokespecial   #26  <Method void ElementSelector(String)>
	//  125  301:new             #93  <Class ConditionalIncludeAction>
	//  126  304:dup             
	//  127  305:invokespecial   #94  <Method void ConditionalIncludeAction()>
	//  128  308:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/receiver"), ((ch.qos.logback.core.joran.action.Action) (new ReceiverAction())));
	//  129  313:aload_1         
	//  130  314:new             #21  <Class ElementSelector>
	//  131  317:dup             
	//  132  318:ldc1            #96  <String "configuration/receiver">
	//  133  320:invokespecial   #26  <Method void ElementSelector(String)>
	//  134  323:new             #98  <Class ReceiverAction>
	//  135  326:dup             
	//  136  327:invokespecial   #99  <Method void ReceiverAction()>
	//  137  330:invokeinterface #35  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
	//  138  335:return          
	}
}
