// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.*;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class RootLoggerAction extends Action
{

	public RootLoggerAction()
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
		root = ((LoggerContext)context).getLogger("ROOT");
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field ch.qos.logback.core.Context context>
	//    6   10:checkcast       #23  <Class LoggerContext>
	//    7   13:ldc1            #25  <String "ROOT">
	//    8   15:invokevirtual   #29  <Method Logger LoggerContext.getLogger(String)>
	//    9   18:putfield        #31  <Field Logger root>
		s = interpretationcontext.subst(attributes.getValue("level"));
	//   10   21:aload_1         
	//   11   22:aload_3         
	//   12   23:ldc1            #33  <String "level">
	//   13   25:invokeinterface #39  <Method String Attributes.getValue(String)>
	//   14   30:invokevirtual   #44  <Method String InterpretationContext.subst(String)>
	//   15   33:astore_2        
		if(!OptionHelper.isEmpty(s))
	//*  16   34:aload_2         
	//*  17   35:invokestatic    #50  <Method boolean OptionHelper.isEmpty(String)>
	//*  18   38:ifne            83
		{
			s = ((String) (Level.toLevel(s)));
	//   19   41:aload_2         
	//   20   42:invokestatic    #56  <Method Level Level.toLevel(String)>
	//   21   45:astore_2        
			attributes = ((Attributes) (new StringBuilder()));
	//   22   46:new             #58  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #59  <Method void StringBuilder()>
	//   25   53:astore_3        
			((StringBuilder) (attributes)).append("Setting level of ROOT logger to ");
	//   26   54:aload_3         
	//   27   55:ldc1            #61  <String "Setting level of ROOT logger to ">
	//   28   57:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
			((StringBuilder) (attributes)).append(((Object) (s)));
	//   30   61:aload_3         
	//   31   62:aload_2         
	//   32   63:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   33   66:pop             
			addInfo(((StringBuilder) (attributes)).toString());
	//   34   67:aload_0         
	//   35   68:aload_3         
	//   36   69:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   37   72:invokevirtual   #76  <Method void addInfo(String)>
			root.setLevel(((Level) (s)));
	//   38   75:aload_0         
	//   39   76:getfield        #31  <Field Logger root>
	//   40   79:aload_2         
	//   41   80:invokevirtual   #82  <Method void Logger.setLevel(Level)>
		}
		interpretationcontext.pushObject(((Object) (root)));
	//   42   83:aload_1         
	//   43   84:aload_0         
	//   44   85:getfield        #31  <Field Logger root>
	//   45   88:invokevirtual   #86  <Method void InterpretationContext.pushObject(Object)>
	//   46   91:return          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(inError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean inError>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		s = ((String) (interpretationcontext.peekObject()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #92  <Method Object InterpretationContext.peekObject()>
	//    6   12:astore_2        
		if(s != root)
	//*   7   13:aload_2         
	//*   8   14:aload_0         
	//*   9   15:getfield        #31  <Field Logger root>
	//*  10   18:if_acmpeq       57
		{
			addWarn("The object on the top the of the stack is not the root logger");
	//   11   21:aload_0         
	//   12   22:ldc1            #94  <String "The object on the top the of the stack is not the root logger">
	//   13   24:invokevirtual   #97  <Method void addWarn(String)>
			interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   14   27:new             #58  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #59  <Method void StringBuilder()>
	//   17   34:astore_1        
			((StringBuilder) (interpretationcontext)).append("It is: ");
	//   18   35:aload_1         
	//   19   36:ldc1            #99  <String "It is: ">
	//   20   38:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			((StringBuilder) (interpretationcontext)).append(((Object) (s)));
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   25   47:pop             
			addWarn(((StringBuilder) (interpretationcontext)).toString());
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   29   53:invokevirtual   #97  <Method void addWarn(String)>
			return;
	//   30   56:return          
		} else
		{
			interpretationcontext.popObject();
	//   31   57:aload_1         
	//   32   58:invokevirtual   #102 <Method Object InterpretationContext.popObject()>
	//   33   61:pop             
			return;
	//   34   62:return          
		}
	}

	public void finish(InterpretationContext interpretationcontext)
	{
	//    0    0:return          
	}

	boolean inError;
	Logger root;
}
