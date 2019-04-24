// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.*;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class LoggerAction extends Action
{

	public LoggerAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean inError>
	//    5    9:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		inError = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field boolean inError>
		logger = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #23  <Field Logger logger>
		LoggerContext loggercontext = (LoggerContext)context;
	//    6   10:aload_0         
	//    7   11:getfield        #27  <Field ch.qos.logback.core.Context context>
	//    8   14:checkcast       #29  <Class LoggerContext>
	//    9   17:astore          6
		String s1 = interpretationcontext.subst(attributes.getValue("name"));
	//   10   19:aload_1         
	//   11   20:aload_3         
	//   12   21:ldc1            #31  <String "name">
	//   13   23:invokeinterface #37  <Method String Attributes.getValue(String)>
	//   14   28:invokevirtual   #42  <Method String InterpretationContext.subst(String)>
	//   15   31:astore          5
		if(OptionHelper.isEmpty(s1))
	//*  16   33:aload           5
	//*  17   35:invokestatic    #48  <Method boolean OptionHelper.isEmpty(String)>
	//*  18   38:ifeq            95
		{
			inError = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #18  <Field boolean inError>
			interpretationcontext = ((InterpretationContext) (getLineColStr(interpretationcontext)));
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #52  <Method String getLineColStr(InterpretationContext)>
	//   25   51:astore_1        
			attributes = ((Attributes) (new StringBuilder()));
	//   26   52:new             #54  <Class StringBuilder>
	//   27   55:dup             
	//   28   56:invokespecial   #55  <Method void StringBuilder()>
	//   29   59:astore_3        
			((StringBuilder) (attributes)).append("No 'name' attribute in element ");
	//   30   60:aload_3         
	//   31   61:ldc1            #57  <String "No 'name' attribute in element ">
	//   32   63:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
			((StringBuilder) (attributes)).append(s);
	//   34   67:aload_3         
	//   35   68:aload_2         
	//   36   69:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
			((StringBuilder) (attributes)).append(", around ");
	//   38   73:aload_3         
	//   39   74:ldc1            #63  <String ", around ">
	//   40   76:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
			((StringBuilder) (attributes)).append(((String) (interpretationcontext)));
	//   42   80:aload_3         
	//   43   81:aload_1         
	//   44   82:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   45   85:pop             
			addError(((StringBuilder) (attributes)).toString());
	//   46   86:aload_0         
	//   47   87:aload_3         
	//   48   88:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   49   91:invokevirtual   #71  <Method void addError(String)>
			return;
	//   50   94:return          
		}
		logger = loggercontext.getLogger(s1);
	//   51   95:aload_0         
	//   52   96:aload           6
	//   53   98:aload           5
	//   54  100:invokevirtual   #75  <Method Logger LoggerContext.getLogger(String)>
	//   55  103:putfield        #23  <Field Logger logger>
		s = interpretationcontext.subst(attributes.getValue("level"));
	//   56  106:aload_1         
	//   57  107:aload_3         
	//   58  108:ldc1            #8   <String "level">
	//   59  110:invokeinterface #37  <Method String Attributes.getValue(String)>
	//   60  115:invokevirtual   #42  <Method String InterpretationContext.subst(String)>
	//   61  118:astore_2        
		if(!OptionHelper.isEmpty(s))
	//*  62  119:aload_2         
	//*  63  120:invokestatic    #48  <Method boolean OptionHelper.isEmpty(String)>
	//*  64  123:ifne            257
			if(!"INHERITED".equalsIgnoreCase(s) && !"NULL".equalsIgnoreCase(s))
	//*  65  126:ldc1            #77  <String "INHERITED">
	//*  66  128:aload_2         
	//*  67  129:invokevirtual   #82  <Method boolean String.equalsIgnoreCase(String)>
	//*  68  132:ifne            212
	//*  69  135:ldc1            #84  <String "NULL">
	//*  70  137:aload_2         
	//*  71  138:invokevirtual   #82  <Method boolean String.equalsIgnoreCase(String)>
	//*  72  141:ifeq            147
	//*  73  144:goto            212
			{
				s = ((String) (Level.toLevel(s)));
	//   74  147:aload_2         
	//   75  148:invokestatic    #90  <Method Level Level.toLevel(String)>
	//   76  151:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   77  152:new             #54  <Class StringBuilder>
	//   78  155:dup             
	//   79  156:invokespecial   #55  <Method void StringBuilder()>
	//   80  159:astore          6
				stringbuilder.append("Setting level of logger [");
	//   81  161:aload           6
	//   82  163:ldc1            #92  <String "Setting level of logger [">
	//   83  165:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   84  168:pop             
				stringbuilder.append(s1);
	//   85  169:aload           6
	//   86  171:aload           5
	//   87  173:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   88  176:pop             
				stringbuilder.append("] to ");
	//   89  177:aload           6
	//   90  179:ldc1            #94  <String "] to ">
	//   91  181:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   92  184:pop             
				stringbuilder.append(((Object) (s)));
	//   93  185:aload           6
	//   94  187:aload_2         
	//   95  188:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   96  191:pop             
				addInfo(stringbuilder.toString());
	//   97  192:aload_0         
	//   98  193:aload           6
	//   99  195:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  100  198:invokevirtual   #100 <Method void addInfo(String)>
				logger.setLevel(((Level) (s)));
	//  101  201:aload_0         
	//  102  202:getfield        #23  <Field Logger logger>
	//  103  205:aload_2         
	//  104  206:invokevirtual   #106 <Method void Logger.setLevel(Level)>
			} else
	//* 105  209:goto            257
			{
				s = ((String) (new StringBuilder()));
	//  106  212:new             #54  <Class StringBuilder>
	//  107  215:dup             
	//  108  216:invokespecial   #55  <Method void StringBuilder()>
	//  109  219:astore_2        
				((StringBuilder) (s)).append("Setting level of logger [");
	//  110  220:aload_2         
	//  111  221:ldc1            #92  <String "Setting level of logger [">
	//  112  223:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  113  226:pop             
				((StringBuilder) (s)).append(s1);
	//  114  227:aload_2         
	//  115  228:aload           5
	//  116  230:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  117  233:pop             
				((StringBuilder) (s)).append("] to null, i.e. INHERITED");
	//  118  234:aload_2         
	//  119  235:ldc1            #108 <String "] to null, i.e. INHERITED">
	//  120  237:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  121  240:pop             
				addInfo(((StringBuilder) (s)).toString());
	//  122  241:aload_0         
	//  123  242:aload_2         
	//  124  243:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  125  246:invokevirtual   #100 <Method void addInfo(String)>
				logger.setLevel(((Level) (null)));
	//  126  249:aload_0         
	//  127  250:getfield        #23  <Field Logger logger>
	//  128  253:aconst_null     
	//  129  254:invokevirtual   #106 <Method void Logger.setLevel(Level)>
			}
		s = interpretationcontext.subst(attributes.getValue("additivity"));
	//  130  257:aload_1         
	//  131  258:aload_3         
	//  132  259:ldc1            #110 <String "additivity">
	//  133  261:invokeinterface #37  <Method String Attributes.getValue(String)>
	//  134  266:invokevirtual   #42  <Method String InterpretationContext.subst(String)>
	//  135  269:astore_2        
		if(!OptionHelper.isEmpty(s))
	//* 136  270:aload_2         
	//* 137  271:invokestatic    #48  <Method boolean OptionHelper.isEmpty(String)>
	//* 138  274:ifne            339
		{
			boolean flag = Boolean.valueOf(s).booleanValue();
	//  139  277:aload_2         
	//  140  278:invokestatic    #116 <Method Boolean Boolean.valueOf(String)>
	//  141  281:invokevirtual   #120 <Method boolean Boolean.booleanValue()>
	//  142  284:istore          4
			s = ((String) (new StringBuilder()));
	//  143  286:new             #54  <Class StringBuilder>
	//  144  289:dup             
	//  145  290:invokespecial   #55  <Method void StringBuilder()>
	//  146  293:astore_2        
			((StringBuilder) (s)).append("Setting additivity of logger [");
	//  147  294:aload_2         
	//  148  295:ldc1            #122 <String "Setting additivity of logger [">
	//  149  297:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  150  300:pop             
			((StringBuilder) (s)).append(s1);
	//  151  301:aload_2         
	//  152  302:aload           5
	//  153  304:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  154  307:pop             
			((StringBuilder) (s)).append("] to ");
	//  155  308:aload_2         
	//  156  309:ldc1            #94  <String "] to ">
	//  157  311:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  158  314:pop             
			((StringBuilder) (s)).append(flag);
	//  159  315:aload_2         
	//  160  316:iload           4
	//  161  318:invokevirtual   #125 <Method StringBuilder StringBuilder.append(boolean)>
	//  162  321:pop             
			addInfo(((StringBuilder) (s)).toString());
	//  163  322:aload_0         
	//  164  323:aload_2         
	//  165  324:invokevirtual   #67  <Method String StringBuilder.toString()>
	//  166  327:invokevirtual   #100 <Method void addInfo(String)>
			logger.setAdditive(flag);
	//  167  330:aload_0         
	//  168  331:getfield        #23  <Field Logger logger>
	//  169  334:iload           4
	//  170  336:invokevirtual   #129 <Method void Logger.setAdditive(boolean)>
		}
		interpretationcontext.pushObject(((Object) (logger)));
	//  171  339:aload_1         
	//  172  340:aload_0         
	//  173  341:getfield        #23  <Field Logger logger>
	//  174  344:invokevirtual   #133 <Method void InterpretationContext.pushObject(Object)>
	//  175  347:return          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(inError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field boolean inError>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		s = ((String) (interpretationcontext.peekObject()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #139 <Method Object InterpretationContext.peekObject()>
	//    6   12:astore_2        
		if(s != logger)
	//*   7   13:aload_2         
	//*   8   14:aload_0         
	//*   9   15:getfield        #23  <Field Logger logger>
	//*  10   18:if_acmpeq       90
		{
			interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   11   21:new             #54  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #55  <Method void StringBuilder()>
	//   14   28:astore_1        
			((StringBuilder) (interpretationcontext)).append("The object on the top the of the stack is not ");
	//   15   29:aload_1         
	//   16   30:ldc1            #141 <String "The object on the top the of the stack is not ">
	//   17   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			((StringBuilder) (interpretationcontext)).append(((Object) (logger)));
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:getfield        #23  <Field Logger logger>
	//   22   41:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   23   44:pop             
			((StringBuilder) (interpretationcontext)).append(" pushed earlier");
	//   24   45:aload_1         
	//   25   46:ldc1            #143 <String " pushed earlier">
	//   26   48:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			addWarn(((StringBuilder) (interpretationcontext)).toString());
	//   28   52:aload_0         
	//   29   53:aload_1         
	//   30   54:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   31   57:invokevirtual   #146 <Method void addWarn(String)>
			interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   32   60:new             #54  <Class StringBuilder>
	//   33   63:dup             
	//   34   64:invokespecial   #55  <Method void StringBuilder()>
	//   35   67:astore_1        
			((StringBuilder) (interpretationcontext)).append("It is: ");
	//   36   68:aload_1         
	//   37   69:ldc1            #148 <String "It is: ">
	//   38   71:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
			((StringBuilder) (interpretationcontext)).append(((Object) (s)));
	//   40   75:aload_1         
	//   41   76:aload_2         
	//   42   77:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   43   80:pop             
			addWarn(((StringBuilder) (interpretationcontext)).toString());
	//   44   81:aload_0         
	//   45   82:aload_1         
	//   46   83:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   47   86:invokevirtual   #146 <Method void addWarn(String)>
			return;
	//   48   89:return          
		} else
		{
			interpretationcontext.popObject();
	//   49   90:aload_1         
	//   50   91:invokevirtual   #151 <Method Object InterpretationContext.popObject()>
	//   51   94:pop             
			return;
	//   52   95:return          
		}
	}

	public void finish(InterpretationContext interpretationcontext)
	{
	//    0    0:return          
	}

	public static final String LEVEL_ATTRIBUTE = "level";
	boolean inError;
	Logger logger;
}
