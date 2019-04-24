// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public class ConversionRuleAction extends Action
{

	public ConversionRuleAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #12  <Field boolean inError>
	//    5    9:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		inError = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #12  <Field boolean inError>
		String s1 = attributes.getValue("conversionWord");
	//    3    5:aload_3         
	//    4    6:ldc1            #19  <String "conversionWord">
	//    5    8:invokeinterface #25  <Method String Attributes.getValue(String)>
	//    6   13:astore          4
		attributes = ((Attributes) (attributes.getValue("converterClass")));
	//    7   15:aload_3         
	//    8   16:ldc1            #27  <String "converterClass">
	//    9   18:invokeinterface #25  <Method String Attributes.getValue(String)>
	//   10   23:astore_3        
		if(OptionHelper.isEmpty(s1))
	//*  11   24:aload           4
	//*  12   26:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//*  13   29:ifeq            44
		{
			inError = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #12  <Field boolean inError>
			addError("No 'conversionWord' attribute in <conversionRule>");
	//   17   37:aload_0         
	//   18   38:ldc1            #35  <String "No 'conversionWord' attribute in <conversionRule>">
	//   19   40:invokevirtual   #39  <Method void addError(String)>
			return;
	//   20   43:return          
		}
		if(OptionHelper.isEmpty(((String) (attributes))))
	//*  21   44:aload_3         
	//*  22   45:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//*  23   48:ifeq            63
		{
			inError = true;
	//   24   51:aload_0         
	//   25   52:iconst_1        
	//   26   53:putfield        #12  <Field boolean inError>
			interpretationcontext.addError("No 'converterClass' attribute in <conversionRule>");
	//   27   56:aload_1         
	//   28   57:ldc1            #41  <String "No 'converterClass' attribute in <conversionRule>">
	//   29   59:invokevirtual   #44  <Method void InterpretationContext.addError(String)>
			return;
	//   30   62:return          
		}
		try
		{
			s = ((String) ((Map)context.getObject("PATTERN_RULE_REGISTRY")));
	//   31   63:aload_0         
	//   32   64:getfield        #48  <Field Context context>
	//   33   67:ldc1            #50  <String "PATTERN_RULE_REGISTRY">
	//   34   69:invokeinterface #56  <Method Object Context.getObject(String)>
	//   35   74:checkcast       #58  <Class Map>
	//   36   77:astore_2        
		}
	//*  37   78:aload_2         
	//*  38   79:astore_1        
	//*  39   80:aload_2         
	//*  40   81:ifnonnull       104
	//*  41   84:new             #60  <Class HashMap>
	//*  42   87:dup             
	//*  43   88:invokespecial   #61  <Method void HashMap()>
	//*  44   91:astore_1        
	//*  45   92:aload_0         
	//*  46   93:getfield        #48  <Field Context context>
	//*  47   96:ldc1            #50  <String "PATTERN_RULE_REGISTRY">
	//*  48   98:aload_1         
	//*  49   99:invokeinterface #65  <Method void Context.putObject(String, Object)>
	//*  50  104:new             #67  <Class StringBuilder>
	//*  51  107:dup             
	//*  52  108:invokespecial   #68  <Method void StringBuilder()>
	//*  53  111:astore_2        
	//*  54  112:aload_2         
	//*  55  113:ldc1            #70  <String "registering conversion word ">
	//*  56  115:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  57  118:pop             
	//*  58  119:aload_2         
	//*  59  120:aload           4
	//*  60  122:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  61  125:pop             
	//*  62  126:aload_2         
	//*  63  127:ldc1            #76  <String " with class [">
	//*  64  129:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  65  132:pop             
	//*  66  133:aload_2         
	//*  67  134:aload_3         
	//*  68  135:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  69  138:pop             
	//*  70  139:aload_2         
	//*  71  140:ldc1            #78  <String "]">
	//*  72  142:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//*  73  145:pop             
	//*  74  146:aload_0         
	//*  75  147:aload_2         
	//*  76  148:invokevirtual   #82  <Method String StringBuilder.toString()>
	//*  77  151:invokevirtual   #85  <Method void addInfo(String)>
	//*  78  154:aload_1         
	//*  79  155:aload           4
	//*  80  157:aload_3         
	//*  81  158:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//*  82  163:pop             
	//*  83  164:return          
	//*  84  165:aload_0         
	//*  85  166:iconst_1        
	//*  86  167:putfield        #12  <Field boolean inError>
	//*  87  170:aload_0         
	//*  88  171:ldc1            #91  <String "Could not add conversion rule to PatternLayout.">
	//*  89  173:invokevirtual   #39  <Method void addError(String)>
	//*  90  176:return          
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext)
		{
			inError = true;
			addError("Could not add conversion rule to PatternLayout.");
			return;
		}
		interpretationcontext = ((InterpretationContext) (s));
		if(s != null)
			break MISSING_BLOCK_LABEL_104;
		interpretationcontext = ((InterpretationContext) (new HashMap()));
		context.putObject("PATTERN_RULE_REGISTRY", ((Object) (interpretationcontext)));
		s = ((String) (new StringBuilder()));
		((StringBuilder) (s)).append("registering conversion word ");
		((StringBuilder) (s)).append(s1);
		((StringBuilder) (s)).append(" with class [");
		((StringBuilder) (s)).append(((String) (attributes)));
		((StringBuilder) (s)).append("]");
		addInfo(((StringBuilder) (s)).toString());
		((Map) (interpretationcontext)).put(((Object) (s1)), ((Object) (attributes)));
		return;
	//*  91  177:astore_1        
	//*  92  178:goto            165
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
	//    0    0:return          
	}

	public void finish(InterpretationContext interpretationcontext)
	{
	//    0    0:return          
	}

	boolean inError;
}
