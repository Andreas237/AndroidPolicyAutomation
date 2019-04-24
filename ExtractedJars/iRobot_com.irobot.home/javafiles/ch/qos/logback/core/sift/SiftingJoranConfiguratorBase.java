// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.joran.GenericConfigurator;
import ch.qos.logback.core.joran.action.*;
import ch.qos.logback.core.joran.spi.*;
import java.util.List;
import java.util.Map;

public abstract class SiftingJoranConfiguratorBase extends GenericConfigurator
{

	protected SiftingJoranConfiguratorBase(String s, String s1, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void GenericConfigurator()>
		errorEmmissionCount = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #23  <Field int errorEmmissionCount>
		key = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field String key>
		value = s1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #27  <Field String value>
		parentPropertyMap = map;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #29  <Field Map parentPropertyMap>
	//   14   24:return          
	}

	protected void addImplicitRules(Interpreter interpreter)
	{
		Object obj = ((Object) (new NestedComplexPropertyIA()));
	//    0    0:new             #36  <Class NestedComplexPropertyIA>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void NestedComplexPropertyIA()>
	//    3    7:astore_2        
		((NestedComplexPropertyIA) (obj)).setContext(context);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field ch.qos.logback.core.Context context>
	//    7   13:invokevirtual   #45  <Method void NestedComplexPropertyIA.setContext(ch.qos.logback.core.Context)>
		interpreter.addImplicitAction(((ch.qos.logback.core.joran.action.ImplicitAction) (obj)));
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #51  <Method void Interpreter.addImplicitAction(ch.qos.logback.core.joran.action.ImplicitAction)>
		obj = ((Object) (new NestedBasicPropertyIA()));
	//   11   21:new             #53  <Class NestedBasicPropertyIA>
	//   12   24:dup             
	//   13   25:invokespecial   #54  <Method void NestedBasicPropertyIA()>
	//   14   28:astore_2        
		((NestedBasicPropertyIA) (obj)).setContext(context);
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #41  <Field ch.qos.logback.core.Context context>
	//   18   34:invokevirtual   #55  <Method void NestedBasicPropertyIA.setContext(ch.qos.logback.core.Context)>
		interpreter.addImplicitAction(((ch.qos.logback.core.joran.action.ImplicitAction) (obj)));
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #51  <Method void Interpreter.addImplicitAction(ch.qos.logback.core.joran.action.ImplicitAction)>
	//   22   42:return          
	}

	protected void addInstanceRules(RuleStore rulestore)
	{
		rulestore.addRule(new ElementSelector("configuration/property"), ((ch.qos.logback.core.joran.action.Action) (new PropertyAction())));
	//    0    0:aload_1         
	//    1    1:new             #59  <Class ElementSelector>
	//    2    4:dup             
	//    3    5:ldc1            #61  <String "configuration/property">
	//    4    7:invokespecial   #64  <Method void ElementSelector(String)>
	//    5   10:new             #66  <Class PropertyAction>
	//    6   13:dup             
	//    7   14:invokespecial   #67  <Method void PropertyAction()>
	//    8   17:invokeinterface #73  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/timestamp"), ((ch.qos.logback.core.joran.action.Action) (new TimestampAction())));
	//    9   22:aload_1         
	//   10   23:new             #59  <Class ElementSelector>
	//   11   26:dup             
	//   12   27:ldc1            #75  <String "configuration/timestamp">
	//   13   29:invokespecial   #64  <Method void ElementSelector(String)>
	//   14   32:new             #77  <Class TimestampAction>
	//   15   35:dup             
	//   16   36:invokespecial   #78  <Method void TimestampAction()>
	//   17   39:invokeinterface #73  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
		rulestore.addRule(new ElementSelector("configuration/define"), ((ch.qos.logback.core.joran.action.Action) (new DefinePropertyAction())));
	//   18   44:aload_1         
	//   19   45:new             #59  <Class ElementSelector>
	//   20   48:dup             
	//   21   49:ldc1            #80  <String "configuration/define">
	//   22   51:invokespecial   #64  <Method void ElementSelector(String)>
	//   23   54:new             #82  <Class DefinePropertyAction>
	//   24   57:dup             
	//   25   58:invokespecial   #83  <Method void DefinePropertyAction()>
	//   26   61:invokeinterface #73  <Method void RuleStore.addRule(ElementSelector, ch.qos.logback.core.joran.action.Action)>
	//   27   66:return          
	}

	public void doConfigure(List list)
	{
		super.doConfigure(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void GenericConfigurator.doConfigure(List)>
	//    3    5:return          
	}

	public abstract Appender getAppender();

	protected void oneAndOnlyOneCheck(Map map)
	{
		if(map.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #98  <Method int Map.size()>
	//*   2    6:ifne            25
		{
			errorEmmissionCount = errorEmmissionCount + 1;
	//    3    9:aload_0         
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field int errorEmmissionCount>
	//    6   14:iconst_1        
	//    7   15:iadd            
	//    8   16:putfield        #23  <Field int errorEmmissionCount>
			map = "No nested appenders found within the <sift> element in SiftingAppender.";
	//    9   19:ldc1            #100 <String "No nested appenders found within the <sift> element in SiftingAppender.">
	//   10   21:astore_1        
		} else
	//*  11   22:goto            53
		if(map.size() > 1)
	//*  12   25:aload_1         
	//*  13   26:invokeinterface #98  <Method int Map.size()>
	//*  14   31:iconst_1        
	//*  15   32:icmple          51
		{
			errorEmmissionCount = errorEmmissionCount + 1;
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #23  <Field int errorEmmissionCount>
	//   19   40:iconst_1        
	//   20   41:iadd            
	//   21   42:putfield        #23  <Field int errorEmmissionCount>
			map = "Only and only one appender can be nested the <sift> element in SiftingAppender. See also http://logback.qos.ch/codes.html#1andOnly1";
	//   22   45:ldc1            #102 <String "Only and only one appender can be nested the <sift> element in SiftingAppender. See also http://logback.qos.ch/codes.html#1andOnly1">
	//   23   47:astore_1        
		} else
	//*  24   48:goto            53
		{
			map = null;
	//   25   51:aconst_null     
	//   26   52:astore_1        
		}
		if(map != null && errorEmmissionCount < 4)
	//*  27   53:aload_1         
	//*  28   54:ifnull          70
	//*  29   57:aload_0         
	//*  30   58:getfield        #23  <Field int errorEmmissionCount>
	//*  31   61:iconst_4        
	//*  32   62:icmpge          70
			addError(((String) (map)));
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #105 <Method void addError(String)>
	//   36   70:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #110 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #111 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #117 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #122 <Method String Class.getName()>
	//    8   16:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("{");
	//   10   20:aload_1         
	//   11   21:ldc1            #128 <String "{">
	//   12   23:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(key);
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #25  <Field String key>
	//   17   32:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		stringbuilder.append("=");
	//   19   36:aload_1         
	//   20   37:ldc1            #130 <String "=">
	//   21   39:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(value);
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #27  <Field String value>
	//   26   48:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append('}');
	//   28   52:aload_1         
	//   29   53:bipush          125
	//   30   55:invokevirtual   #133 <Method StringBuilder StringBuilder.append(char)>
	//   31   58:pop             
		return stringbuilder.toString();
	//   32   59:aload_1         
	//   33   60:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   34   63:areturn         
	}

	static final String ONE_AND_ONLY_ONE_URL = "http://logback.qos.ch/codes.html#1andOnly1";
	int errorEmmissionCount;
	protected final String key;
	protected final Map parentPropertyMap;
	protected final String value;
}
