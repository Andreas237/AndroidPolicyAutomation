// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.util.OptionHelper;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public class AppenderRefAction extends Action
{

	public AppenderRefAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #13  <Field boolean inError>
	//    5    9:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		inError = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #13  <Field boolean inError>
		Object obj = interpretationcontext.peekObject();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method Object InterpretationContext.peekObject()>
	//    5    9:astore          4
		if(!(obj instanceof AppenderAttachable))
	//*   6   11:aload           4
	//*   7   13:instanceof      #24  <Class AppenderAttachable>
	//*   8   16:ifne            73
		{
			attributes = ((Attributes) (new StringBuilder()));
	//    9   19:new             #26  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #27  <Method void StringBuilder()>
	//   12   26:astore_3        
			((StringBuilder) (attributes)).append("Could not find an AppenderAttachable at the top of execution stack. Near [");
	//   13   27:aload_3         
	//   14   28:ldc1            #29  <String "Could not find an AppenderAttachable at the top of execution stack. Near [">
	//   15   30:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			((StringBuilder) (attributes)).append(s);
	//   17   34:aload_3         
	//   18   35:aload_2         
	//   19   36:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			((StringBuilder) (attributes)).append("] line ");
	//   21   40:aload_3         
	//   22   41:ldc1            #35  <String "] line ">
	//   23   43:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			((StringBuilder) (attributes)).append(getLineNumber(interpretationcontext));
	//   25   47:aload_3         
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #39  <Method int getLineNumber(InterpretationContext)>
	//   29   53:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   30   56:pop             
			interpretationcontext = ((InterpretationContext) (((StringBuilder) (attributes)).toString()));
	//   31   57:aload_3         
	//   32   58:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   33   61:astore_1        
			inError = true;
	//   34   62:aload_0         
	//   35   63:iconst_1        
	//   36   64:putfield        #13  <Field boolean inError>
			addError(((String) (interpretationcontext)));
	//   37   67:aload_0         
	//   38   68:aload_1         
	//   39   69:invokevirtual   #50  <Method void addError(String)>
			return;
	//   40   72:return          
		}
		s = ((String) ((AppenderAttachable)obj));
	//   41   73:aload           4
	//   42   75:checkcast       #24  <Class AppenderAttachable>
	//   43   78:astore_2        
		attributes = ((Attributes) (interpretationcontext.subst(attributes.getValue("ref"))));
	//   44   79:aload_1         
	//   45   80:aload_3         
	//   46   81:ldc1            #52  <String "ref">
	//   47   83:invokeinterface #58  <Method String Attributes.getValue(String)>
	//   48   88:invokevirtual   #61  <Method String InterpretationContext.subst(String)>
	//   49   91:astore_3        
		if(OptionHelper.isEmpty(((String) (attributes))))
	//*  50   92:aload_3         
	//*  51   93:invokestatic    #67  <Method boolean OptionHelper.isEmpty(String)>
	//*  52   96:ifeq            111
		{
			inError = true;
	//   53   99:aload_0         
	//   54  100:iconst_1        
	//   55  101:putfield        #13  <Field boolean inError>
			addError("Missing appender ref attribute in <appender-ref> tag.");
	//   56  104:aload_0         
	//   57  105:ldc1            #69  <String "Missing appender ref attribute in <appender-ref> tag.">
	//   58  107:invokevirtual   #50  <Method void addError(String)>
			return;
	//   59  110:return          
		}
		interpretationcontext = ((InterpretationContext) ((Appender)((HashMap)interpretationcontext.getObjectMap().get("APPENDER_BAG")).get(((Object) (attributes)))));
	//   60  111:aload_1         
	//   61  112:invokevirtual   #73  <Method Map InterpretationContext.getObjectMap()>
	//   62  115:ldc1            #75  <String "APPENDER_BAG">
	//   63  117:invokeinterface #81  <Method Object Map.get(Object)>
	//   64  122:checkcast       #83  <Class HashMap>
	//   65  125:aload_3         
	//   66  126:invokevirtual   #84  <Method Object HashMap.get(Object)>
	//   67  129:checkcast       #86  <Class Appender>
	//   68  132:astore_1        
		if(interpretationcontext == null)
	//*  69  133:aload_1         
	//*  70  134:ifnonnull       187
		{
			interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   71  137:new             #26  <Class StringBuilder>
	//   72  140:dup             
	//   73  141:invokespecial   #27  <Method void StringBuilder()>
	//   74  144:astore_1        
			((StringBuilder) (interpretationcontext)).append("Could not find an appender named [");
	//   75  145:aload_1         
	//   76  146:ldc1            #88  <String "Could not find an appender named [">
	//   77  148:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   78  151:pop             
			((StringBuilder) (interpretationcontext)).append(((String) (attributes)));
	//   79  152:aload_1         
	//   80  153:aload_3         
	//   81  154:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   82  157:pop             
			((StringBuilder) (interpretationcontext)).append("]. Did you define it below instead of above in the configuration file?");
	//   83  158:aload_1         
	//   84  159:ldc1            #90  <String "]. Did you define it below instead of above in the configuration file?">
	//   85  161:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   86  164:pop             
			interpretationcontext = ((InterpretationContext) (((StringBuilder) (interpretationcontext)).toString()));
	//   87  165:aload_1         
	//   88  166:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   89  169:astore_1        
			inError = true;
	//   90  170:aload_0         
	//   91  171:iconst_1        
	//   92  172:putfield        #13  <Field boolean inError>
			addError(((String) (interpretationcontext)));
	//   93  175:aload_0         
	//   94  176:aload_1         
	//   95  177:invokevirtual   #50  <Method void addError(String)>
			addError("See http://logback.qos.ch/codes.html#appender_order for more details.");
	//   96  180:aload_0         
	//   97  181:ldc1            #92  <String "See http://logback.qos.ch/codes.html#appender_order for more details.">
	//   98  183:invokevirtual   #50  <Method void addError(String)>
			return;
	//   99  186:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  100  187:new             #26  <Class StringBuilder>
	//  101  190:dup             
	//  102  191:invokespecial   #27  <Method void StringBuilder()>
	//  103  194:astore          4
			stringbuilder.append("Attaching appender named [");
	//  104  196:aload           4
	//  105  198:ldc1            #94  <String "Attaching appender named [">
	//  106  200:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//  107  203:pop             
			stringbuilder.append(((String) (attributes)));
	//  108  204:aload           4
	//  109  206:aload_3         
	//  110  207:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//  111  210:pop             
			stringbuilder.append("] to ");
	//  112  211:aload           4
	//  113  213:ldc1            #96  <String "] to ">
	//  114  215:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//  115  218:pop             
			stringbuilder.append(((Object) (s)));
	//  116  219:aload           4
	//  117  221:aload_2         
	//  118  222:invokevirtual   #99  <Method StringBuilder StringBuilder.append(Object)>
	//  119  225:pop             
			addInfo(stringbuilder.toString());
	//  120  226:aload_0         
	//  121  227:aload           4
	//  122  229:invokevirtual   #46  <Method String StringBuilder.toString()>
	//  123  232:invokevirtual   #102 <Method void addInfo(String)>
			((AppenderAttachable) (s)).addAppender(((Appender) (interpretationcontext)));
	//  124  235:aload_2         
	//  125  236:aload_1         
	//  126  237:invokeinterface #106 <Method void AppenderAttachable.addAppender(Appender)>
			return;
	//  127  242:return          
		}
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
	//    0    0:return          
	}

	boolean inError;
}
