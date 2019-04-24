// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class LoggerContextListenerAction extends Action
{

	public LoggerContextListenerAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean inError>
	//    5    9:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		inError = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #14  <Field boolean inError>
		s = attributes.getValue("class");
	//    3    5:aload_3         
	//    4    6:ldc1            #21  <String "class">
	//    5    8:invokeinterface #27  <Method String Attributes.getValue(String)>
	//    6   13:astore_2        
		if(OptionHelper.isEmpty(s))
	//*   7   14:aload_2         
	//*   8   15:invokestatic    #33  <Method boolean OptionHelper.isEmpty(String)>
	//*   9   18:ifeq            33
		{
			addError("Mandatory \"class\" attribute not set for <loggerContextListener> element");
	//   10   21:aload_0         
	//   11   22:ldc1            #35  <String "Mandatory \"class\" attribute not set for <loggerContextListener> element">
	//   12   24:invokevirtual   #39  <Method void addError(String)>
			inError = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #14  <Field boolean inError>
			return;
	//   16   32:return          
		}
		try
		{
			lcl = (LoggerContextListener)OptionHelper.instantiateByClassName(s, ch/qos/logback/classic/spi/LoggerContextListener, context);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:ldc1            #41  <Class LoggerContextListener>
	//   20   37:aload_0         
	//   21   38:getfield        #45  <Field ch.qos.logback.core.Context context>
	//   22   41:invokestatic    #49  <Method Object OptionHelper.instantiateByClassName(String, Class, ch.qos.logback.core.Context)>
	//   23   44:checkcast       #41  <Class LoggerContextListener>
	//   24   47:putfield        #51  <Field LoggerContextListener lcl>
			if(lcl instanceof ContextAware)
	//*  25   50:aload_0         
	//*  26   51:getfield        #51  <Field LoggerContextListener lcl>
	//*  27   54:instanceof      #53  <Class ContextAware>
	//*  28   57:ifeq            76
				((ContextAware)lcl).setContext(context);
	//   29   60:aload_0         
	//   30   61:getfield        #51  <Field LoggerContextListener lcl>
	//   31   64:checkcast       #53  <Class ContextAware>
	//   32   67:aload_0         
	//   33   68:getfield        #45  <Field ch.qos.logback.core.Context context>
	//   34   71:invokeinterface #57  <Method void ContextAware.setContext(ch.qos.logback.core.Context)>
			interpretationcontext.pushObject(((Object) (lcl)));
	//   35   76:aload_1         
	//   36   77:aload_0         
	//   37   78:getfield        #51  <Field LoggerContextListener lcl>
	//   38   81:invokevirtual   #63  <Method void InterpretationContext.pushObject(Object)>
			interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   39   84:new             #65  <Class StringBuilder>
	//   40   87:dup             
	//   41   88:invokespecial   #66  <Method void StringBuilder()>
	//   42   91:astore_1        
			((StringBuilder) (interpretationcontext)).append("Adding LoggerContextListener of type [");
	//   43   92:aload_1         
	//   44   93:ldc1            #68  <String "Adding LoggerContextListener of type [">
	//   45   95:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   46   98:pop             
			((StringBuilder) (interpretationcontext)).append(s);
	//   47   99:aload_1         
	//   48  100:aload_2         
	//   49  101:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   50  104:pop             
			((StringBuilder) (interpretationcontext)).append("] to the object stack");
	//   51  105:aload_1         
	//   52  106:ldc1            #74  <String "] to the object stack">
	//   53  108:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   54  111:pop             
			addInfo(((StringBuilder) (interpretationcontext)).toString());
	//   55  112:aload_0         
	//   56  113:aload_1         
	//   57  114:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   58  117:invokevirtual   #81  <Method void addInfo(String)>
			return;
	//   59  120:return          
		}
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext)
	//*  60  121:astore_1        
		{
			inError = true;
	//   61  122:aload_0         
	//   62  123:iconst_1        
	//   63  124:putfield        #14  <Field boolean inError>
		}
		attributes = ((Attributes) (new StringBuilder()));
	//   64  127:new             #65  <Class StringBuilder>
	//   65  130:dup             
	//   66  131:invokespecial   #66  <Method void StringBuilder()>
	//   67  134:astore_3        
		((StringBuilder) (attributes)).append("Could not create LoggerContextListener of type ");
	//   68  135:aload_3         
	//   69  136:ldc1            #83  <String "Could not create LoggerContextListener of type ">
	//   70  138:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   71  141:pop             
		((StringBuilder) (attributes)).append(s);
	//   72  142:aload_3         
	//   73  143:aload_2         
	//   74  144:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   75  147:pop             
		((StringBuilder) (attributes)).append("].");
	//   76  148:aload_3         
	//   77  149:ldc1            #85  <String "].">
	//   78  151:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   79  154:pop             
		addError(((StringBuilder) (attributes)).toString(), ((Throwable) (interpretationcontext)));
	//   80  155:aload_0         
	//   81  156:aload_3         
	//   82  157:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   83  160:aload_1         
	//   84  161:invokevirtual   #88  <Method void addError(String, Throwable)>
	//   85  164:return          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(inError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean inError>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(interpretationcontext.peekObject() != lcl)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #94  <Method Object InterpretationContext.peekObject()>
	//*   6   12:aload_0         
	//*   7   13:getfield        #51  <Field LoggerContextListener lcl>
	//*   8   16:if_acmpeq       26
		{
			addWarn("The object on the top the of the stack is not the LoggerContextListener pushed earlier.");
	//    9   19:aload_0         
	//   10   20:ldc1            #96  <String "The object on the top the of the stack is not the LoggerContextListener pushed earlier.">
	//   11   22:invokevirtual   #99  <Method void addWarn(String)>
			return;
	//   12   25:return          
		}
		if(lcl instanceof LifeCycle)
	//*  13   26:aload_0         
	//*  14   27:getfield        #51  <Field LoggerContextListener lcl>
	//*  15   30:instanceof      #101 <Class LifeCycle>
	//*  16   33:ifeq            54
		{
			((LifeCycle)lcl).start();
	//   17   36:aload_0         
	//   18   37:getfield        #51  <Field LoggerContextListener lcl>
	//   19   40:checkcast       #101 <Class LifeCycle>
	//   20   43:invokeinterface #104 <Method void LifeCycle.start()>
			addInfo("Starting LoggerContextListener");
	//   21   48:aload_0         
	//   22   49:ldc1            #106 <String "Starting LoggerContextListener">
	//   23   51:invokevirtual   #81  <Method void addInfo(String)>
		}
		((LoggerContext)context).addListener(lcl);
	//   24   54:aload_0         
	//   25   55:getfield        #45  <Field ch.qos.logback.core.Context context>
	//   26   58:checkcast       #108 <Class LoggerContext>
	//   27   61:aload_0         
	//   28   62:getfield        #51  <Field LoggerContextListener lcl>
	//   29   65:invokevirtual   #112 <Method void LoggerContext.addListener(LoggerContextListener)>
		interpretationcontext.popObject();
	//   30   68:aload_1         
	//   31   69:invokevirtual   #115 <Method Object InterpretationContext.popObject()>
	//   32   72:pop             
	//   33   73:return          
	}

	boolean inError;
	LoggerContextListener lcl;
}
