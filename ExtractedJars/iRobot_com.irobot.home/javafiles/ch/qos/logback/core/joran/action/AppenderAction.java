// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.OptionHelper;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public class AppenderAction extends Action
{

	public AppenderAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field boolean inError>
	//    5    9:return          
	}

	private void warnDeprecated(String s)
	{
		if(s.equals("ch.qos.logback.core.ConsoleAppender"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #21  <String "ch.qos.logback.core.ConsoleAppender">
	//*   2    3:invokevirtual   #27  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            15
			addWarn("ConsoleAppender is deprecated for LogcatAppender");
	//    4    9:aload_0         
	//    5   10:ldc1            #29  <String "ConsoleAppender is deprecated for LogcatAppender">
	//    6   12:invokevirtual   #32  <Method void addWarn(String)>
	//    7   15:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		appender = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #38  <Field Appender appender>
		inError = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #16  <Field boolean inError>
		String s1 = attributes.getValue("class");
	//    6   10:aload_3         
	//    7   11:ldc1            #40  <String "class">
	//    8   13:invokeinterface #46  <Method String Attributes.getValue(String)>
	//    9   18:astore          4
		if(OptionHelper.isEmpty(s1))
	//*  10   20:aload           4
	//*  11   22:invokestatic    #52  <Method boolean OptionHelper.isEmpty(String)>
	//*  12   25:ifeq            80
		{
			attributes = ((Attributes) (new StringBuilder()));
	//   13   28:new             #54  <Class StringBuilder>
	//   14   31:dup             
	//   15   32:invokespecial   #55  <Method void StringBuilder()>
	//   16   35:astore_3        
			((StringBuilder) (attributes)).append("Missing class name for appender. Near [");
	//   17   36:aload_3         
	//   18   37:ldc1            #57  <String "Missing class name for appender. Near [">
	//   19   39:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			((StringBuilder) (attributes)).append(s);
	//   21   43:aload_3         
	//   22   44:aload_2         
	//   23   45:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			((StringBuilder) (attributes)).append("] line ");
	//   25   49:aload_3         
	//   26   50:ldc1            #63  <String "] line ">
	//   27   52:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
			((StringBuilder) (attributes)).append(getLineNumber(interpretationcontext));
	//   29   56:aload_3         
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:invokevirtual   #67  <Method int getLineNumber(InterpretationContext)>
	//   33   62:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
	//   34   65:pop             
			addError(((StringBuilder) (attributes)).toString());
	//   35   66:aload_0         
	//   36   67:aload_3         
	//   37   68:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   38   71:invokevirtual   #77  <Method void addError(String)>
			inError = true;
	//   39   74:aload_0         
	//   40   75:iconst_1        
	//   41   76:putfield        #16  <Field boolean inError>
			return;
	//   42   79:return          
		}
		try
		{
			s = ((String) (new StringBuilder()));
	//   43   80:new             #54  <Class StringBuilder>
	//   44   83:dup             
	//   45   84:invokespecial   #55  <Method void StringBuilder()>
	//   46   87:astore_2        
			((StringBuilder) (s)).append("About to instantiate appender of type [");
	//   47   88:aload_2         
	//   48   89:ldc1            #79  <String "About to instantiate appender of type [">
	//   49   91:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   50   94:pop             
			((StringBuilder) (s)).append(s1);
	//   51   95:aload_2         
	//   52   96:aload           4
	//   53   98:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   54  101:pop             
			((StringBuilder) (s)).append("]");
	//   55  102:aload_2         
	//   56  103:ldc1            #81  <String "]">
	//   57  105:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   58  108:pop             
			addInfo(((StringBuilder) (s)).toString());
	//   59  109:aload_0         
	//   60  110:aload_2         
	//   61  111:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   62  114:invokevirtual   #84  <Method void addInfo(String)>
			warnDeprecated(s1);
	//   63  117:aload_0         
	//   64  118:aload           4
	//   65  120:invokespecial   #86  <Method void warnDeprecated(String)>
			appender = (Appender)OptionHelper.instantiateByClassName(s1, ch/qos/logback/core/Appender, context);
	//   66  123:aload_0         
	//   67  124:aload           4
	//   68  126:ldc1            #88  <Class Appender>
	//   69  128:aload_0         
	//   70  129:getfield        #92  <Field ch.qos.logback.core.Context context>
	//   71  132:invokestatic    #96  <Method Object OptionHelper.instantiateByClassName(String, Class, ch.qos.logback.core.Context)>
	//   72  135:checkcast       #88  <Class Appender>
	//   73  138:putfield        #38  <Field Appender appender>
			appender.setContext(context);
	//   74  141:aload_0         
	//   75  142:getfield        #38  <Field Appender appender>
	//   76  145:aload_0         
	//   77  146:getfield        #92  <Field ch.qos.logback.core.Context context>
	//   78  149:invokeinterface #100 <Method void Appender.setContext(ch.qos.logback.core.Context)>
			s = interpretationcontext.subst(attributes.getValue("name"));
	//   79  154:aload_1         
	//   80  155:aload_3         
	//   81  156:ldc1            #102 <String "name">
	//   82  158:invokeinterface #46  <Method String Attributes.getValue(String)>
	//   83  163:invokevirtual   #107 <Method String InterpretationContext.subst(String)>
	//   84  166:astore_2        
			if(OptionHelper.isEmpty(s))
	//*  85  167:aload_2         
	//*  86  168:invokestatic    #52  <Method boolean OptionHelper.isEmpty(String)>
	//*  87  171:ifeq            214
			{
				attributes = ((Attributes) (new StringBuilder()));
	//   88  174:new             #54  <Class StringBuilder>
	//   89  177:dup             
	//   90  178:invokespecial   #55  <Method void StringBuilder()>
	//   91  181:astore_3        
				((StringBuilder) (attributes)).append("No appender name given for appender of type ");
	//   92  182:aload_3         
	//   93  183:ldc1            #109 <String "No appender name given for appender of type ">
	//   94  185:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   95  188:pop             
				((StringBuilder) (attributes)).append(s1);
	//   96  189:aload_3         
	//   97  190:aload           4
	//   98  192:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   99  195:pop             
				((StringBuilder) (attributes)).append("].");
	//  100  196:aload_3         
	//  101  197:ldc1            #111 <String "].">
	//  102  199:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  103  202:pop             
				addWarn(((StringBuilder) (attributes)).toString());
	//  104  203:aload_0         
	//  105  204:aload_3         
	//  106  205:invokevirtual   #74  <Method String StringBuilder.toString()>
	//  107  208:invokevirtual   #32  <Method void addWarn(String)>
				break MISSING_BLOCK_LABEL_260;
	//  108  211:goto            260
			}
		}
	//* 109  214:aload_0         
	//* 110  215:getfield        #38  <Field Appender appender>
	//* 111  218:aload_2         
	//* 112  219:invokeinterface #114 <Method void Appender.setName(String)>
	//* 113  224:new             #54  <Class StringBuilder>
	//* 114  227:dup             
	//* 115  228:invokespecial   #55  <Method void StringBuilder()>
	//* 116  231:astore_3        
	//* 117  232:aload_3         
	//* 118  233:ldc1            #116 <String "Naming appender as [">
	//* 119  235:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 120  238:pop             
	//* 121  239:aload_3         
	//* 122  240:aload_2         
	//* 123  241:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 124  244:pop             
	//* 125  245:aload_3         
	//* 126  246:ldc1            #81  <String "]">
	//* 127  248:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//* 128  251:pop             
	//* 129  252:aload_0         
	//* 130  253:aload_3         
	//* 131  254:invokevirtual   #74  <Method String StringBuilder.toString()>
	//* 132  257:invokevirtual   #84  <Method void addInfo(String)>
	//* 133  260:aload_1         
	//* 134  261:invokevirtual   #120 <Method Map InterpretationContext.getObjectMap()>
	//* 135  264:ldc1            #122 <String "APPENDER_BAG">
	//* 136  266:invokeinterface #128 <Method Object Map.get(Object)>
	//* 137  271:checkcast       #130 <Class HashMap>
	//* 138  274:aload_2         
	//* 139  275:aload_0         
	//* 140  276:getfield        #38  <Field Appender appender>
	//* 141  279:invokevirtual   #134 <Method Object HashMap.put(Object, Object)>
	//* 142  282:pop             
	//* 143  283:aload_1         
	//* 144  284:aload_0         
	//* 145  285:getfield        #38  <Field Appender appender>
	//* 146  288:invokevirtual   #138 <Method void InterpretationContext.pushObject(Object)>
	//* 147  291:return          
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext)
	//* 148  292:astore_1        
		{
			inError = true;
	//  149  293:aload_0         
	//  150  294:iconst_1        
	//  151  295:putfield        #16  <Field boolean inError>
			s = ((String) (new StringBuilder()));
	//  152  298:new             #54  <Class StringBuilder>
	//  153  301:dup             
	//  154  302:invokespecial   #55  <Method void StringBuilder()>
	//  155  305:astore_2        
			((StringBuilder) (s)).append("Could not create an Appender of type [");
	//  156  306:aload_2         
	//  157  307:ldc1            #140 <String "Could not create an Appender of type [">
	//  158  309:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  159  312:pop             
			((StringBuilder) (s)).append(s1);
	//  160  313:aload_2         
	//  161  314:aload           4
	//  162  316:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  163  319:pop             
			((StringBuilder) (s)).append("].");
	//  164  320:aload_2         
	//  165  321:ldc1            #111 <String "].">
	//  166  323:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//  167  326:pop             
			addError(((StringBuilder) (s)).toString(), ((Throwable) (interpretationcontext)));
	//  168  327:aload_0         
	//  169  328:aload_2         
	//  170  329:invokevirtual   #74  <Method String StringBuilder.toString()>
	//  171  332:aload_1         
	//  172  333:invokevirtual   #143 <Method void addError(String, Throwable)>
			throw new ActionException(((Throwable) (interpretationcontext)));
	//  173  336:new             #145 <Class ActionException>
	//  174  339:dup             
	//  175  340:aload_1         
	//  176  341:invokespecial   #148 <Method void ActionException(Throwable)>
	//  177  344:athrow          
		}
		appender.setName(s);
		attributes = ((Attributes) (new StringBuilder()));
		((StringBuilder) (attributes)).append("Naming appender as [");
		((StringBuilder) (attributes)).append(s);
		((StringBuilder) (attributes)).append("]");
		addInfo(((StringBuilder) (attributes)).toString());
		((HashMap)interpretationcontext.getObjectMap().get("APPENDER_BAG")).put(((Object) (s)), ((Object) (appender)));
		interpretationcontext.pushObject(((Object) (appender)));
		return;
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(inError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field boolean inError>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(appender instanceof LifeCycle)
	//*   4    8:aload_0         
	//*   5    9:getfield        #38  <Field Appender appender>
	//*   6   12:instanceof      #152 <Class LifeCycle>
	//*   7   15:ifeq            27
			((LifeCycle) (appender)).start();
	//    8   18:aload_0         
	//    9   19:getfield        #38  <Field Appender appender>
	//   10   22:invokeinterface #155 <Method void LifeCycle.start()>
		if(interpretationcontext.peekObject() != appender)
	//*  11   27:aload_1         
	//*  12   28:invokevirtual   #159 <Method Object InterpretationContext.peekObject()>
	//*  13   31:aload_0         
	//*  14   32:getfield        #38  <Field Appender appender>
	//*  15   35:if_acmpeq       83
		{
			interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   16   38:new             #54  <Class StringBuilder>
	//   17   41:dup             
	//   18   42:invokespecial   #55  <Method void StringBuilder()>
	//   19   45:astore_1        
			((StringBuilder) (interpretationcontext)).append("The object at the of the stack is not the appender named [");
	//   20   46:aload_1         
	//   21   47:ldc1            #161 <String "The object at the of the stack is not the appender named [">
	//   22   49:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
			((StringBuilder) (interpretationcontext)).append(appender.getName());
	//   24   53:aload_1         
	//   25   54:aload_0         
	//   26   55:getfield        #38  <Field Appender appender>
	//   27   58:invokeinterface #164 <Method String Appender.getName()>
	//   28   63:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   29   66:pop             
			((StringBuilder) (interpretationcontext)).append("] pushed earlier.");
	//   30   67:aload_1         
	//   31   68:ldc1            #166 <String "] pushed earlier.">
	//   32   70:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   33   73:pop             
			addWarn(((StringBuilder) (interpretationcontext)).toString());
	//   34   74:aload_0         
	//   35   75:aload_1         
	//   36   76:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   37   79:invokevirtual   #32  <Method void addWarn(String)>
			return;
	//   38   82:return          
		} else
		{
			interpretationcontext.popObject();
	//   39   83:aload_1         
	//   40   84:invokevirtual   #169 <Method Object InterpretationContext.popObject()>
	//   41   87:pop             
			return;
	//   42   88:return          
		}
	}

	Appender appender;
	private boolean inError;
}
