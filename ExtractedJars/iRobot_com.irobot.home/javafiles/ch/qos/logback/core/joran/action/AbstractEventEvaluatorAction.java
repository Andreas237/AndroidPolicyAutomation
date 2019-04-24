// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public abstract class AbstractEventEvaluatorAction extends Action
{

	public AbstractEventEvaluatorAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field boolean inError>
	//    5    9:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		inError = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #15  <Field boolean inError>
		evaluator = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #22  <Field EventEvaluator evaluator>
		String s1 = attributes.getValue("class");
	//    6   10:aload_3         
	//    7   11:ldc1            #24  <String "class">
	//    8   13:invokeinterface #30  <Method String Attributes.getValue(String)>
	//    9   18:astore          4
		s = s1;
	//   10   20:aload           4
	//   11   22:astore_2        
		if(OptionHelper.isEmpty(s1))
	//*  12   23:aload           4
	//*  13   25:invokestatic    #36  <Method boolean OptionHelper.isEmpty(String)>
	//*  14   28:ifeq            77
		{
			s = defaultClassName();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #40  <Method String defaultClassName()>
	//   17   35:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   18   36:new             #42  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #43  <Method void StringBuilder()>
	//   21   43:astore          4
			stringbuilder.append("Assuming default evaluator class [");
	//   22   45:aload           4
	//   23   47:ldc1            #45  <String "Assuming default evaluator class [">
	//   24   49:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
			stringbuilder.append(s);
	//   26   53:aload           4
	//   27   55:aload_2         
	//   28   56:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
			stringbuilder.append("]");
	//   30   60:aload           4
	//   31   62:ldc1            #51  <String "]">
	//   32   64:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
			addInfo(stringbuilder.toString());
	//   34   68:aload_0         
	//   35   69:aload           4
	//   36   71:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   37   74:invokevirtual   #58  <Method void addInfo(String)>
		}
		if(!OptionHelper.isEmpty(s)) goto _L2; else goto _L1
	//   38   77:aload_2         
	//   39   78:invokestatic    #36  <Method boolean OptionHelper.isEmpty(String)>
	//   40   81:ifeq            103
_L1:
		defaultClassName();
	//   41   84:aload_0         
	//   42   85:invokevirtual   #40  <Method String defaultClassName()>
	//   43   88:pop             
		inError = true;
	//   44   89:aload_0         
	//   45   90:iconst_1        
	//   46   91:putfield        #15  <Field boolean inError>
		interpretationcontext = "Mandatory \"class\" attribute not set for <evaluator>";
	//   47   94:ldc1            #60  <String "Mandatory \"class\" attribute not set for <evaluator>">
	//   48   96:astore_1        
_L4:
		addError(((String) (interpretationcontext)));
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:invokevirtual   #63  <Method void addError(String)>
		return;
	//   52  102:return          
_L2:
		attributes = ((Attributes) (attributes.getValue("name")));
	//   53  103:aload_3         
	//   54  104:ldc1            #65  <String "name">
	//   55  106:invokeinterface #30  <Method String Attributes.getValue(String)>
	//   56  111:astore_3        
		if(!OptionHelper.isEmpty(((String) (attributes))))
			break; /* Loop/switch isn't completed */
	//   57  112:aload_3         
	//   58  113:invokestatic    #36  <Method boolean OptionHelper.isEmpty(String)>
	//   59  116:ifeq            130
		inError = true;
	//   60  119:aload_0         
	//   61  120:iconst_1        
	//   62  121:putfield        #15  <Field boolean inError>
		interpretationcontext = "Mandatory \"name\" attribute not set for <evaluator>";
	//   63  124:ldc1            #67  <String "Mandatory \"name\" attribute not set for <evaluator>">
	//   64  126:astore_1        
		if(true) goto _L4; else goto _L3
	//   65  127:goto            97
_L3:
		try
		{
			evaluator = (EventEvaluator)OptionHelper.instantiateByClassName(s, ch/qos/logback/core/boolex/EventEvaluator, context);
	//   66  130:aload_0         
	//   67  131:aload_2         
	//   68  132:ldc1            #69  <Class EventEvaluator>
	//   69  134:aload_0         
	//   70  135:getfield        #73  <Field Context context>
	//   71  138:invokestatic    #77  <Method Object OptionHelper.instantiateByClassName(String, Class, Context)>
	//   72  141:checkcast       #69  <Class EventEvaluator>
	//   73  144:putfield        #22  <Field EventEvaluator evaluator>
			evaluator.setContext(context);
	//   74  147:aload_0         
	//   75  148:getfield        #22  <Field EventEvaluator evaluator>
	//   76  151:aload_0         
	//   77  152:getfield        #73  <Field Context context>
	//   78  155:invokeinterface #81  <Method void EventEvaluator.setContext(Context)>
			evaluator.setName(((String) (attributes)));
	//   79  160:aload_0         
	//   80  161:getfield        #22  <Field EventEvaluator evaluator>
	//   81  164:aload_3         
	//   82  165:invokeinterface #84  <Method void EventEvaluator.setName(String)>
			interpretationcontext.pushObject(((Object) (evaluator)));
	//   83  170:aload_1         
	//   84  171:aload_0         
	//   85  172:getfield        #22  <Field EventEvaluator evaluator>
	//   86  175:invokevirtual   #90  <Method void InterpretationContext.pushObject(Object)>
			interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   87  178:new             #42  <Class StringBuilder>
	//   88  181:dup             
	//   89  182:invokespecial   #43  <Method void StringBuilder()>
	//   90  185:astore_1        
			((StringBuilder) (interpretationcontext)).append("Adding evaluator named [");
	//   91  186:aload_1         
	//   92  187:ldc1            #92  <String "Adding evaluator named [">
	//   93  189:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   94  192:pop             
			((StringBuilder) (interpretationcontext)).append(((String) (attributes)));
	//   95  193:aload_1         
	//   96  194:aload_3         
	//   97  195:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   98  198:pop             
			((StringBuilder) (interpretationcontext)).append("] to the object stack");
	//   99  199:aload_1         
	//  100  200:ldc1            #94  <String "] to the object stack">
	//  101  202:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  102  205:pop             
			addInfo(((StringBuilder) (interpretationcontext)).toString());
	//  103  206:aload_0         
	//  104  207:aload_1         
	//  105  208:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  106  211:invokevirtual   #58  <Method void addInfo(String)>
			return;
	//  107  214:return          
		}
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext)
	//* 108  215:astore_1        
		{
			inError = true;
	//  109  216:aload_0         
	//  110  217:iconst_1        
	//  111  218:putfield        #15  <Field boolean inError>
		}
		attributes = ((Attributes) (new StringBuilder()));
	//  112  221:new             #42  <Class StringBuilder>
	//  113  224:dup             
	//  114  225:invokespecial   #43  <Method void StringBuilder()>
	//  115  228:astore_3        
		((StringBuilder) (attributes)).append("Could not create evaluator of type ");
	//  116  229:aload_3         
	//  117  230:ldc1            #96  <String "Could not create evaluator of type ">
	//  118  232:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  119  235:pop             
		((StringBuilder) (attributes)).append(s);
	//  120  236:aload_3         
	//  121  237:aload_2         
	//  122  238:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  123  241:pop             
		((StringBuilder) (attributes)).append("].");
	//  124  242:aload_3         
	//  125  243:ldc1            #98  <String "].">
	//  126  245:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  127  248:pop             
		addError(((StringBuilder) (attributes)).toString(), ((Throwable) (interpretationcontext)));
	//  128  249:aload_0         
	//  129  250:aload_3         
	//  130  251:invokevirtual   #54  <Method String StringBuilder.toString()>
	//  131  254:aload_1         
	//  132  255:invokevirtual   #101 <Method void addError(String, Throwable)>
		return;
	//  133  258:return          
	}

	protected abstract String defaultClassName();

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(inError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean inError>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(evaluator instanceof LifeCycle)
	//*   4    8:aload_0         
	//*   5    9:getfield        #22  <Field EventEvaluator evaluator>
	//*   6   12:instanceof      #105 <Class LifeCycle>
	//*   7   15:ifeq            71
		{
			((LifeCycle) (evaluator)).start();
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field EventEvaluator evaluator>
	//   10   22:invokeinterface #108 <Method void LifeCycle.start()>
			s = ((String) (new StringBuilder()));
	//   11   27:new             #42  <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #43  <Method void StringBuilder()>
	//   14   34:astore_2        
			((StringBuilder) (s)).append("Starting evaluator named [");
	//   15   35:aload_2         
	//   16   36:ldc1            #110 <String "Starting evaluator named [">
	//   17   38:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			((StringBuilder) (s)).append(evaluator.getName());
	//   19   42:aload_2         
	//   20   43:aload_0         
	//   21   44:getfield        #22  <Field EventEvaluator evaluator>
	//   22   47:invokeinterface #113 <Method String EventEvaluator.getName()>
	//   23   52:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   24   55:pop             
			((StringBuilder) (s)).append("]");
	//   25   56:aload_2         
	//   26   57:ldc1            #51  <String "]">
	//   27   59:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
			addInfo(((StringBuilder) (s)).toString());
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   32   68:invokevirtual   #58  <Method void addInfo(String)>
		}
		if(interpretationcontext.peekObject() != evaluator)
	//*  33   71:aload_1         
	//*  34   72:invokevirtual   #117 <Method Object InterpretationContext.peekObject()>
	//*  35   75:aload_0         
	//*  36   76:getfield        #22  <Field EventEvaluator evaluator>
	//*  37   79:if_acmpeq       89
		{
			addWarn("The object on the top the of the stack is not the evaluator pushed earlier.");
	//   38   82:aload_0         
	//   39   83:ldc1            #119 <String "The object on the top the of the stack is not the evaluator pushed earlier.">
	//   40   85:invokevirtual   #122 <Method void addWarn(String)>
			return;
	//   41   88:return          
		}
		interpretationcontext.popObject();
	//   42   89:aload_1         
	//   43   90:invokevirtual   #125 <Method Object InterpretationContext.popObject()>
	//   44   93:pop             
		interpretationcontext = ((InterpretationContext) ((Map)context.getObject("EVALUATOR_MAP")));
	//   45   94:aload_0         
	//   46   95:getfield        #73  <Field Context context>
	//   47   98:ldc1            #127 <String "EVALUATOR_MAP">
	//   48  100:invokeinterface #133 <Method Object Context.getObject(String)>
	//   49  105:checkcast       #135 <Class Map>
	//   50  108:astore_1        
		if(interpretationcontext == null)
	//*  51  109:aload_1         
	//*  52  110:ifnonnull       120
		{
			try
			{
				addError("Could not find EvaluatorMap");
	//   53  113:aload_0         
	//   54  114:ldc1            #137 <String "Could not find EvaluatorMap">
	//   55  116:invokevirtual   #63  <Method void addError(String)>
				return;
	//   56  119:return          
			}
	//*  57  120:aload_1         
	//*  58  121:aload_0         
	//*  59  122:getfield        #22  <Field EventEvaluator evaluator>
	//*  60  125:invokeinterface #113 <Method String EventEvaluator.getName()>
	//*  61  130:aload_0         
	//*  62  131:getfield        #22  <Field EventEvaluator evaluator>
	//*  63  134:invokeinterface #141 <Method Object Map.put(Object, Object)>
	//*  64  139:pop             
	//*  65  140:return          
			// Misplaced declaration of an exception variable
			catch(InterpretationContext interpretationcontext)
	//*  66  141:astore_1        
			{
				s = ((String) (new StringBuilder()));
	//   67  142:new             #42  <Class StringBuilder>
	//   68  145:dup             
	//   69  146:invokespecial   #43  <Method void StringBuilder()>
	//   70  149:astore_2        
			}
			break MISSING_BLOCK_LABEL_150;
		}
		((Map) (interpretationcontext)).put(((Object) (evaluator.getName())), ((Object) (evaluator)));
		return;
		((StringBuilder) (s)).append("Could not set evaluator named [");
	//   71  150:aload_2         
	//   72  151:ldc1            #143 <String "Could not set evaluator named [">
	//   73  153:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   74  156:pop             
		((StringBuilder) (s)).append(((Object) (evaluator)));
	//   75  157:aload_2         
	//   76  158:aload_0         
	//   77  159:getfield        #22  <Field EventEvaluator evaluator>
	//   78  162:invokevirtual   #146 <Method StringBuilder StringBuilder.append(Object)>
	//   79  165:pop             
		((StringBuilder) (s)).append("].");
	//   80  166:aload_2         
	//   81  167:ldc1            #98  <String "].">
	//   82  169:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   83  172:pop             
		addError(((StringBuilder) (s)).toString(), ((Throwable) (interpretationcontext)));
	//   84  173:aload_0         
	//   85  174:aload_2         
	//   86  175:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   87  178:aload_1         
	//   88  179:invokevirtual   #101 <Method void addError(String, Throwable)>
		return;
	//   89  182:return          
	}

	public void finish(InterpretationContext interpretationcontext)
	{
	//    0    0:return          
	}

	EventEvaluator evaluator;
	boolean inError;
}
