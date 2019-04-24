// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import org.xml.sax.Attributes;

public class ContextNameAction extends Action
{

	public ContextNameAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Action()>
	//    2    4:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
	//    0    0:return          
	}

	public void body(InterpretationContext interpretationcontext, String s)
	{
		interpretationcontext = ((InterpretationContext) (interpretationcontext.subst(s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #21  <Method String InterpretationContext.subst(String)>
	//    3    5:astore_1        
		s = ((String) (new StringBuilder()));
	//    4    6:new             #23  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #24  <Method void StringBuilder()>
	//    7   13:astore_2        
		((StringBuilder) (s)).append("Setting logger context name as [");
	//    8   14:aload_2         
	//    9   15:ldc1            #26  <String "Setting logger context name as [">
	//   10   17:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		((StringBuilder) (s)).append(((String) (interpretationcontext)));
	//   12   21:aload_2         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
		((StringBuilder) (s)).append("]");
	//   16   27:aload_2         
	//   17   28:ldc1            #32  <String "]">
	//   18   30:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		addInfo(((StringBuilder) (s)).toString());
	//   20   34:aload_0         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   23   39:invokevirtual   #40  <Method void addInfo(String)>
		try
		{
			context.setName(((String) (interpretationcontext)));
	//   24   42:aload_0         
	//   25   43:getfield        #44  <Field Context context>
	//   26   46:aload_1         
	//   27   47:invokeinterface #49  <Method void Context.setName(String)>
			return;
	//   28   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  29   53:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   54:new             #23  <Class StringBuilder>
	//   31   57:dup             
	//   32   58:invokespecial   #24  <Method void StringBuilder()>
	//   33   61:astore_3        
			stringbuilder.append("Failed to rename context [");
	//   34   62:aload_3         
	//   35   63:ldc1            #51  <String "Failed to rename context [">
	//   36   65:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   37   68:pop             
			stringbuilder.append(context.getName());
	//   38   69:aload_3         
	//   39   70:aload_0         
	//   40   71:getfield        #44  <Field Context context>
	//   41   74:invokeinterface #54  <Method String Context.getName()>
	//   42   79:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
			stringbuilder.append("] as [");
	//   44   83:aload_3         
	//   45   84:ldc1            #56  <String "] as [">
	//   46   86:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
			stringbuilder.append(((String) (interpretationcontext)));
	//   48   90:aload_3         
	//   49   91:aload_1         
	//   50   92:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
			stringbuilder.append("]");
	//   52   96:aload_3         
	//   53   97:ldc1            #32  <String "]">
	//   54   99:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   55  102:pop             
			addError(stringbuilder.toString(), ((Throwable) (s)));
	//   56  103:aload_0         
	//   57  104:aload_3         
	//   58  105:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   59  108:aload_2         
	//   60  109:invokevirtual   #60  <Method void addError(String, Throwable)>
			return;
	//   61  112:return          
		}
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
	//    0    0:return          
	}
}
