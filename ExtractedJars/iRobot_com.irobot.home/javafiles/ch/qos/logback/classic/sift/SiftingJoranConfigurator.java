// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.util.DefaultNestedComponentRules;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.joran.action.AppenderAction;
import ch.qos.logback.core.joran.spi.*;
import ch.qos.logback.core.sift.SiftingJoranConfiguratorBase;
import java.util.*;

public class SiftingJoranConfigurator extends SiftingJoranConfiguratorBase
{

	SiftingJoranConfigurator(String s, String s1, Map map)
	{
		super(s, s1, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #9   <Method void SiftingJoranConfiguratorBase(String, String, Map)>
	//    5    7:return          
	}

	protected void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultnestedcomponentregistry)
	{
		DefaultNestedComponentRules.addDefaultNestedComponentRegistryRules(defaultnestedcomponentregistry);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method void DefaultNestedComponentRules.addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry)>
	//    2    4:return          
	}

	protected void addInstanceRules(RuleStore rulestore)
	{
		super.addInstanceRules(rulestore);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void SiftingJoranConfiguratorBase.addInstanceRules(RuleStore)>
		rulestore.addRule(new ElementSelector("configuration/appender"), ((ch.qos.logback.core.joran.action.Action) (new AppenderAction())));
	//    3    5:aload_1         
	//    4    6:new             #24  <Class ElementSelector>
	//    5    9:dup             
	//    6   10:ldc1            #26  <String "configuration/appender">
	//    7   12:invokespecial   #29  <Method void ElementSelector(String)>
	//    8   15:new             #31  <Class AppenderAction>
	//    9   18:dup             
	//   10   19:invokespecial   #34  <Method void AppenderAction()>
	//   11   22:invokeinterface #40  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
	//   12   27:return          
	}

	protected void buildInterpreter()
	{
		super.buildInterpreter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void SiftingJoranConfiguratorBase.buildInterpreter()>
		Object obj = ((Object) (interpreter.getInterpretationContext().getObjectMap()));
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field Interpreter interpreter>
	//    4    8:invokevirtual   #53  <Method InterpretationContext Interpreter.getInterpretationContext()>
	//    5   11:invokevirtual   #59  <Method Map InterpretationContext.getObjectMap()>
	//    6   14:astore_1        
		((Map) (obj)).put("APPENDER_BAG", ((Object) (new HashMap())));
	//    7   15:aload_1         
	//    8   16:ldc1            #61  <String "APPENDER_BAG">
	//    9   18:new             #63  <Class HashMap>
	//   10   21:dup             
	//   11   22:invokespecial   #64  <Method void HashMap()>
	//   12   25:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   13   30:pop             
		((Map) (obj)).put("FILTER_CHAIN_BAG", ((Object) (new HashMap())));
	//   14   31:aload_1         
	//   15   32:ldc1            #72  <String "FILTER_CHAIN_BAG">
	//   16   34:new             #63  <Class HashMap>
	//   17   37:dup             
	//   18   38:invokespecial   #64  <Method void HashMap()>
	//   19   41:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   20   46:pop             
		obj = ((Object) (new HashMap()));
	//   21   47:new             #63  <Class HashMap>
	//   22   50:dup             
	//   23   51:invokespecial   #64  <Method void HashMap()>
	//   24   54:astore_1        
		((Map) (obj)).putAll(parentPropertyMap);
	//   25   55:aload_1         
	//   26   56:aload_0         
	//   27   57:getfield        #76  <Field Map parentPropertyMap>
	//   28   60:invokeinterface #80  <Method void Map.putAll(Map)>
		((Map) (obj)).put(((Object) (key)), ((Object) (value)));
	//   29   65:aload_1         
	//   30   66:aload_0         
	//   31   67:getfield        #84  <Field String key>
	//   32   70:aload_0         
	//   33   71:getfield        #87  <Field String value>
	//   34   74:invokeinterface #70  <Method Object Map.put(Object, Object)>
	//   35   79:pop             
		interpreter.setInterpretationContextPropertiesMap(((Map) (obj)));
	//   36   80:aload_0         
	//   37   81:getfield        #47  <Field Interpreter interpreter>
	//   38   84:aload_1         
	//   39   85:invokevirtual   #90  <Method void Interpreter.setInterpretationContextPropertiesMap(Map)>
	//   40   88:return          
	}

	public Appender getAppender()
	{
		Object obj = ((Object) ((HashMap)interpreter.getInterpretationContext().getObjectMap().get("APPENDER_BAG")));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Interpreter interpreter>
	//    2    4:invokevirtual   #53  <Method InterpretationContext Interpreter.getInterpretationContext()>
	//    3    7:invokevirtual   #59  <Method Map InterpretationContext.getObjectMap()>
	//    4   10:ldc1            #61  <String "APPENDER_BAG">
	//    5   12:invokeinterface #96  <Method Object Map.get(Object)>
	//    6   17:checkcast       #63  <Class HashMap>
	//    7   20:astore_1        
		oneAndOnlyOneCheck(((Map) (obj)));
	//    8   21:aload_0         
	//    9   22:aload_1         
	//   10   23:invokevirtual   #99  <Method void oneAndOnlyOneCheck(Map)>
		obj = ((Object) (((HashMap) (obj)).values()));
	//   11   26:aload_1         
	//   12   27:invokevirtual   #103 <Method Collection HashMap.values()>
	//   13   30:astore_1        
		if(((Collection) (obj)).size() == 0)
	//*  14   31:aload_1         
	//*  15   32:invokeinterface #109 <Method int Collection.size()>
	//*  16   37:ifne            42
			return null;
	//   17   40:aconst_null     
	//   18   41:areturn         
		else
			return (Appender)((Collection) (obj)).iterator().next();
	//   19   42:aload_1         
	//   20   43:invokeinterface #113 <Method Iterator Collection.iterator()>
	//   21   48:invokeinterface #119 <Method Object Iterator.next()>
	//   22   53:checkcast       #121 <Class Appender>
	//   23   56:areturn         
	}

	protected ElementPath initialElementPath()
	{
		return new ElementPath("configuration");
	//    0    0:new             #126 <Class ElementPath>
	//    1    3:dup             
	//    2    4:ldc1            #128 <String "configuration">
	//    3    6:invokespecial   #129 <Method void ElementPath(String)>
	//    4    9:areturn         
	}
}
