// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import org.xml.sax.Attributes;

public class LevelAction extends Action
{

	public LevelAction()
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
		s = ((String) (interpretationcontext.peekObject()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method Object InterpretationContext.peekObject()>
	//    2    4:astore_2        
		if(!(s instanceof Logger))
	//*   3    5:aload_2         
	//*   4    6:instanceof      #24  <Class Logger>
	//*   5    9:ifne            24
		{
			inError = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #13  <Field boolean inError>
			addError("For element <level>, could not find a logger at the top of execution stack.");
	//    9   17:aload_0         
	//   10   18:ldc1            #26  <String "For element <level>, could not find a logger at the top of execution stack.">
	//   11   20:invokevirtual   #30  <Method void addError(String)>
			return;
	//   12   23:return          
		}
		s = ((String) ((Logger)s));
	//   13   24:aload_2         
	//   14   25:checkcast       #24  <Class Logger>
	//   15   28:astore_2        
		String s1 = ((Logger) (s)).getName();
	//   16   29:aload_2         
	//   17   30:invokevirtual   #34  <Method String Logger.getName()>
	//   18   33:astore          4
		interpretationcontext = ((InterpretationContext) (interpretationcontext.subst(attributes.getValue("value"))));
	//   19   35:aload_1         
	//   20   36:aload_3         
	//   21   37:ldc1            #36  <String "value">
	//   22   39:invokeinterface #42  <Method String Attributes.getValue(String)>
	//   23   44:invokevirtual   #45  <Method String InterpretationContext.subst(String)>
	//   24   47:astore_1        
		if(!"INHERITED".equalsIgnoreCase(((String) (interpretationcontext))) && !"NULL".equalsIgnoreCase(((String) (interpretationcontext))))
	//*  25   48:ldc1            #47  <String "INHERITED">
	//*  26   50:aload_1         
	//*  27   51:invokevirtual   #53  <Method boolean String.equalsIgnoreCase(String)>
	//*  28   54:ifne            80
	//*  29   57:ldc1            #55  <String "NULL">
	//*  30   59:aload_1         
	//*  31   60:invokevirtual   #53  <Method boolean String.equalsIgnoreCase(String)>
	//*  32   63:ifeq            69
	//*  33   66:goto            80
			interpretationcontext = ((InterpretationContext) (Level.toLevel(((String) (interpretationcontext)), Level.DEBUG)));
	//   34   69:aload_1         
	//   35   70:getstatic       #61  <Field Level Level.DEBUG>
	//   36   73:invokestatic    #65  <Method Level Level.toLevel(String, Level)>
	//   37   76:astore_1        
		else
	//*  38   77:goto            82
			interpretationcontext = null;
	//   39   80:aconst_null     
	//   40   81:astore_1        
		((Logger) (s)).setLevel(((Level) (interpretationcontext)));
	//   41   82:aload_2         
	//   42   83:aload_1         
	//   43   84:invokevirtual   #69  <Method void Logger.setLevel(Level)>
		interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   44   87:new             #71  <Class StringBuilder>
	//   45   90:dup             
	//   46   91:invokespecial   #72  <Method void StringBuilder()>
	//   47   94:astore_1        
		((StringBuilder) (interpretationcontext)).append(s1);
	//   48   95:aload_1         
	//   49   96:aload           4
	//   50   98:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   51  101:pop             
		((StringBuilder) (interpretationcontext)).append(" level set to ");
	//   52  102:aload_1         
	//   53  103:ldc1            #78  <String " level set to ">
	//   54  105:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
		((StringBuilder) (interpretationcontext)).append(((Object) (((Logger) (s)).getLevel())));
	//   56  109:aload_1         
	//   57  110:aload_2         
	//   58  111:invokevirtual   #82  <Method Level Logger.getLevel()>
	//   59  114:invokevirtual   #85  <Method StringBuilder StringBuilder.append(Object)>
	//   60  117:pop             
		addInfo(((StringBuilder) (interpretationcontext)).toString());
	//   61  118:aload_0         
	//   62  119:aload_1         
	//   63  120:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   64  123:invokevirtual   #91  <Method void addInfo(String)>
	//   65  126:return          
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
