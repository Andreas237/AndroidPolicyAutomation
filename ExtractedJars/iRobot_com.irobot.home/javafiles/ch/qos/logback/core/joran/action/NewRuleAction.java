// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.*;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public class NewRuleAction extends Action
{

	public NewRuleAction()
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
		s = attributes.getValue("pattern");
	//    3    5:aload_3         
	//    4    6:ldc1            #19  <String "pattern">
	//    5    8:invokeinterface #25  <Method String Attributes.getValue(String)>
	//    6   13:astore_2        
		attributes = ((Attributes) (attributes.getValue("actionClass")));
	//    7   14:aload_3         
	//    8   15:ldc1            #27  <String "actionClass">
	//    9   17:invokeinterface #25  <Method String Attributes.getValue(String)>
	//   10   22:astore_3        
		if(!OptionHelper.isEmpty(s)) goto _L2; else goto _L1
	//   11   23:aload_2         
	//   12   24:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//   13   27:ifeq            44
_L1:
		inError = true;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #12  <Field boolean inError>
		interpretationcontext = "No 'pattern' attribute in <newRule>";
	//   17   35:ldc1            #35  <String "No 'pattern' attribute in <newRule>">
	//   18   37:astore_1        
_L4:
		addError(((String) (interpretationcontext)));
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #39  <Method void addError(String)>
		return;
	//   22   43:return          
_L2:
		if(!OptionHelper.isEmpty(((String) (attributes))))
			break; /* Loop/switch isn't completed */
	//   23   44:aload_3         
	//   24   45:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//   25   48:ifeq            62
		inError = true;
	//   26   51:aload_0         
	//   27   52:iconst_1        
	//   28   53:putfield        #12  <Field boolean inError>
		interpretationcontext = "No 'actionClass' attribute in <newRule>";
	//   29   56:ldc1            #41  <String "No 'actionClass' attribute in <newRule>">
	//   30   58:astore_1        
		if(true) goto _L4; else goto _L3
	//   31   59:goto            38
_L3:
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   32   62:new             #43  <Class StringBuilder>
	//   33   65:dup             
	//   34   66:invokespecial   #44  <Method void StringBuilder()>
	//   35   69:astore          4
			stringbuilder.append("About to add new Joran parsing rule [");
	//   36   71:aload           4
	//   37   73:ldc1            #46  <String "About to add new Joran parsing rule [">
	//   38   75:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			stringbuilder.append(s);
	//   40   79:aload           4
	//   41   81:aload_2         
	//   42   82:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
			stringbuilder.append(",");
	//   44   86:aload           4
	//   45   88:ldc1            #52  <String ",">
	//   46   90:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
			stringbuilder.append(((String) (attributes)));
	//   48   94:aload           4
	//   49   96:aload_3         
	//   50   97:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   51  100:pop             
			stringbuilder.append("].");
	//   52  101:aload           4
	//   53  103:ldc1            #54  <String "].">
	//   54  105:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
			addInfo(stringbuilder.toString());
	//   56  109:aload_0         
	//   57  110:aload           4
	//   58  112:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   59  115:invokevirtual   #61  <Method void addInfo(String)>
			interpretationcontext.getJoranInterpreter().getRuleStore().addRule(new ElementSelector(s), ((String) (attributes)));
	//   60  118:aload_1         
	//   61  119:invokevirtual   #67  <Method Interpreter InterpretationContext.getJoranInterpreter()>
	//   62  122:invokevirtual   #73  <Method RuleStore Interpreter.getRuleStore()>
	//   63  125:new             #75  <Class ElementSelector>
	//   64  128:dup             
	//   65  129:aload_2         
	//   66  130:invokespecial   #77  <Method void ElementSelector(String)>
	//   67  133:aload_3         
	//   68  134:invokeinterface #83  <Method void RuleStore.addRule(ElementSelector, String)>
			return;
	//   69  139:return          
		}
	//*  70  140:aload_0         
	//*  71  141:iconst_1        
	//*  72  142:putfield        #12  <Field boolean inError>
	//*  73  145:new             #43  <Class StringBuilder>
	//*  74  148:dup             
	//*  75  149:invokespecial   #44  <Method void StringBuilder()>
	//*  76  152:astore_1        
	//*  77  153:aload_1         
	//*  78  154:ldc1            #85  <String "Could not add new Joran parsing rule [">
	//*  79  156:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  80  159:pop             
	//*  81  160:aload_1         
	//*  82  161:aload_2         
	//*  83  162:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  84  165:pop             
	//*  85  166:aload_1         
	//*  86  167:ldc1            #52  <String ",">
	//*  87  169:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  88  172:pop             
	//*  89  173:aload_1         
	//*  90  174:aload_3         
	//*  91  175:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  92  178:pop             
	//*  93  179:aload_1         
	//*  94  180:ldc1            #87  <String "]">
	//*  95  182:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//*  96  185:pop             
	//*  97  186:aload_0         
	//*  98  187:aload_1         
	//*  99  188:invokevirtual   #58  <Method String StringBuilder.toString()>
	//* 100  191:invokevirtual   #39  <Method void addError(String)>
	//* 101  194:return          
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext)
		{
			inError = true;
		}
		interpretationcontext = ((InterpretationContext) (new StringBuilder()));
		((StringBuilder) (interpretationcontext)).append("Could not add new Joran parsing rule [");
		((StringBuilder) (interpretationcontext)).append(s);
		((StringBuilder) (interpretationcontext)).append(",");
		((StringBuilder) (interpretationcontext)).append(((String) (attributes)));
		((StringBuilder) (interpretationcontext)).append("]");
		addError(((StringBuilder) (interpretationcontext)).toString());
		return;
	//* 102  195:astore_1        
	//* 103  196:goto            140
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
