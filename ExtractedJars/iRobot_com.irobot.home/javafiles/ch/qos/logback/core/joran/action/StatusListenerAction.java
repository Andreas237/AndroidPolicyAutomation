// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.*;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public class StatusListenerAction extends Action
{

	public StatusListenerAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean inError>
		statusListener = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field StatusListener statusListener>
	//    8   14:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		inError = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #14  <Field boolean inError>
		attributes = ((Attributes) (attributes.getValue("class")));
	//    3    5:aload_3         
	//    4    6:ldc1            #23  <String "class">
	//    5    8:invokeinterface #29  <Method String Attributes.getValue(String)>
	//    6   13:astore_3        
		if(OptionHelper.isEmpty(((String) (attributes))))
	//*   7   14:aload_3         
	//*   8   15:invokestatic    #35  <Method boolean OptionHelper.isEmpty(String)>
	//*   9   18:ifeq            73
		{
			attributes = ((Attributes) (new StringBuilder()));
	//   10   21:new             #37  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #38  <Method void StringBuilder()>
	//   13   28:astore_3        
			((StringBuilder) (attributes)).append("Missing class name for statusListener. Near [");
	//   14   29:aload_3         
	//   15   30:ldc1            #40  <String "Missing class name for statusListener. Near [">
	//   16   32:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((StringBuilder) (attributes)).append(s);
	//   18   36:aload_3         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			((StringBuilder) (attributes)).append("] line ");
	//   22   42:aload_3         
	//   23   43:ldc1            #46  <String "] line ">
	//   24   45:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
			((StringBuilder) (attributes)).append(getLineNumber(interpretationcontext));
	//   26   49:aload_3         
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #50  <Method int getLineNumber(InterpretationContext)>
	//   30   55:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
	//   31   58:pop             
			addError(((StringBuilder) (attributes)).toString());
	//   32   59:aload_0         
	//   33   60:aload_3         
	//   34   61:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   35   64:invokevirtual   #61  <Method void addError(String)>
			inError = true;
	//   36   67:aload_0         
	//   37   68:iconst_1        
	//   38   69:putfield        #14  <Field boolean inError>
			return;
	//   39   72:return          
		}
		try
		{
			if(((Class) (ch/qos/logback/core/status/OnConsoleStatusListener)).getName().equals(((Object) (attributes))))
	//*  40   73:ldc1            #63  <Class OnConsoleStatusListener>
	//*  41   75:invokevirtual   #68  <Method String Class.getName()>
	//*  42   78:aload_3         
	//*  43   79:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  44   82:ifeq            95
			{
				OnConsoleStatusListener.addNewInstanceToContext(context);
	//   45   85:aload_0         
	//   46   86:getfield        #78  <Field Context context>
	//   47   89:invokestatic    #82  <Method void OnConsoleStatusListener.addNewInstanceToContext(Context)>
				break MISSING_BLOCK_LABEL_156;
	//   48   92:goto            156
			}
		}
	//*  49   95:aload_0         
	//*  50   96:aload_3         
	//*  51   97:ldc1            #84  <Class StatusListener>
	//*  52   99:aload_0         
	//*  53  100:getfield        #78  <Field Context context>
	//*  54  103:invokestatic    #88  <Method Object OptionHelper.instantiateByClassName(String, Class, Context)>
	//*  55  106:checkcast       #84  <Class StatusListener>
	//*  56  109:putfield        #16  <Field StatusListener statusListener>
	//*  57  112:aload_1         
	//*  58  113:invokevirtual   #94  <Method Context InterpretationContext.getContext()>
	//*  59  116:invokeinterface #100 <Method StatusManager Context.getStatusManager()>
	//*  60  121:aload_0         
	//*  61  122:getfield        #16  <Field StatusListener statusListener>
	//*  62  125:invokeinterface #106 <Method void StatusManager.add(StatusListener)>
	//*  63  130:aload_0         
	//*  64  131:getfield        #16  <Field StatusListener statusListener>
	//*  65  134:instanceof      #108 <Class ContextAware>
	//*  66  137:ifeq            156
	//*  67  140:aload_0         
	//*  68  141:getfield        #16  <Field StatusListener statusListener>
	//*  69  144:checkcast       #108 <Class ContextAware>
	//*  70  147:aload_0         
	//*  71  148:getfield        #78  <Field Context context>
	//*  72  151:invokeinterface #111 <Method void ContextAware.setContext(Context)>
	//*  73  156:new             #37  <Class StringBuilder>
	//*  74  159:dup             
	//*  75  160:invokespecial   #38  <Method void StringBuilder()>
	//*  76  163:astore_2        
	//*  77  164:aload_2         
	//*  78  165:ldc1            #113 <String "Added status listener of type [">
	//*  79  167:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  80  170:pop             
	//*  81  171:aload_2         
	//*  82  172:aload_3         
	//*  83  173:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  84  176:pop             
	//*  85  177:aload_2         
	//*  86  178:ldc1            #115 <String "]">
	//*  87  180:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//*  88  183:pop             
	//*  89  184:aload_0         
	//*  90  185:aload_2         
	//*  91  186:invokevirtual   #57  <Method String StringBuilder.toString()>
	//*  92  189:invokevirtual   #118 <Method void addInfo(String)>
	//*  93  192:aload_1         
	//*  94  193:aload_0         
	//*  95  194:getfield        #16  <Field StatusListener statusListener>
	//*  96  197:invokevirtual   #122 <Method void InterpretationContext.pushObject(Object)>
	//*  97  200:return          
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext)
	//*  98  201:astore_1        
		{
			inError = true;
	//   99  202:aload_0         
	//  100  203:iconst_1        
	//  101  204:putfield        #14  <Field boolean inError>
			s = ((String) (new StringBuilder()));
	//  102  207:new             #37  <Class StringBuilder>
	//  103  210:dup             
	//  104  211:invokespecial   #38  <Method void StringBuilder()>
	//  105  214:astore_2        
			((StringBuilder) (s)).append("Could not create an StatusListener of type [");
	//  106  215:aload_2         
	//  107  216:ldc1            #124 <String "Could not create an StatusListener of type [">
	//  108  218:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  109  221:pop             
			((StringBuilder) (s)).append(((String) (attributes)));
	//  110  222:aload_2         
	//  111  223:aload_3         
	//  112  224:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  113  227:pop             
			((StringBuilder) (s)).append("].");
	//  114  228:aload_2         
	//  115  229:ldc1            #126 <String "].">
	//  116  231:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//  117  234:pop             
			addError(((StringBuilder) (s)).toString(), ((Throwable) (interpretationcontext)));
	//  118  235:aload_0         
	//  119  236:aload_2         
	//  120  237:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  121  240:aload_1         
	//  122  241:invokevirtual   #129 <Method void addError(String, Throwable)>
			throw new ActionException(((Throwable) (interpretationcontext)));
	//  123  244:new             #131 <Class ActionException>
	//  124  247:dup             
	//  125  248:aload_1         
	//  126  249:invokespecial   #134 <Method void ActionException(Throwable)>
	//  127  252:athrow          
		}
		statusListener = (StatusListener)OptionHelper.instantiateByClassName(((String) (attributes)), ch/qos/logback/core/status/StatusListener, context);
		interpretationcontext.getContext().getStatusManager().add(statusListener);
		if(statusListener instanceof ContextAware)
			((ContextAware)statusListener).setContext(context);
		s = ((String) (new StringBuilder()));
		((StringBuilder) (s)).append("Added status listener of type [");
		((StringBuilder) (s)).append(((String) (attributes)));
		((StringBuilder) (s)).append("]");
		addInfo(((StringBuilder) (s)).toString());
		interpretationcontext.pushObject(((Object) (statusListener)));
		return;
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(inError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean inError>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(statusListener instanceof LifeCycle)
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field StatusListener statusListener>
	//*   6   12:instanceof      #138 <Class LifeCycle>
	//*   7   15:ifeq            30
			((LifeCycle)statusListener).start();
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field StatusListener statusListener>
	//   10   22:checkcast       #138 <Class LifeCycle>
	//   11   25:invokeinterface #141 <Method void LifeCycle.start()>
		if(interpretationcontext.peekObject() != statusListener)
	//*  12   30:aload_1         
	//*  13   31:invokevirtual   #145 <Method Object InterpretationContext.peekObject()>
	//*  14   34:aload_0         
	//*  15   35:getfield        #16  <Field StatusListener statusListener>
	//*  16   38:if_acmpeq       48
		{
			addWarn("The object at the of the stack is not the statusListener pushed earlier.");
	//   17   41:aload_0         
	//   18   42:ldc1            #147 <String "The object at the of the stack is not the statusListener pushed earlier.">
	//   19   44:invokevirtual   #150 <Method void addWarn(String)>
			return;
	//   20   47:return          
		} else
		{
			interpretationcontext.popObject();
	//   21   48:aload_1         
	//   22   49:invokevirtual   #153 <Method Object InterpretationContext.popObject()>
	//   23   52:pop             
			return;
	//   24   53:return          
		}
	}

	public void finish(InterpretationContext interpretationcontext)
	{
	//    0    0:return          
	}

	boolean inError;
	StatusListener statusListener;
}
