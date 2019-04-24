// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.spi.ContextAwareBase;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

public abstract class Action extends ContextAwareBase
{

	public Action()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	public abstract void begin(InterpretationContext interpretationcontext, String s, Attributes attributes);

	public void body(InterpretationContext interpretationcontext, String s)
	{
	//    0    0:return          
	}

	public abstract void end(InterpretationContext interpretationcontext, String s);

	protected int getColumnNumber(InterpretationContext interpretationcontext)
	{
		interpretationcontext = ((InterpretationContext) (interpretationcontext.getJoranInterpreter().getLocator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method Interpreter InterpretationContext.getJoranInterpreter()>
	//    2    4:invokevirtual   #53  <Method Locator Interpreter.getLocator()>
	//    3    7:astore_1        
		if(interpretationcontext != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          19
			return ((Locator) (interpretationcontext)).getColumnNumber();
	//    6   12:aload_1         
	//    7   13:invokeinterface #58  <Method int Locator.getColumnNumber()>
	//    8   18:ireturn         
		else
			return -1;
	//    9   19:iconst_m1       
	//   10   20:ireturn         
	}

	protected String getLineColStr(InterpretationContext interpretationcontext)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("line: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #65  <String "line: ">
	//    6   11:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getLineNumber(interpretationcontext));
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #72  <Method int getLineNumber(InterpretationContext)>
	//   12   21:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   13   24:pop             
		stringbuilder.append(", column: ");
	//   14   25:aload_2         
	//   15   26:ldc1            #77  <String ", column: ">
	//   16   28:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		stringbuilder.append(getColumnNumber(interpretationcontext));
	//   18   32:aload_2         
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #79  <Method int getColumnNumber(InterpretationContext)>
	//   22   38:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   23   41:pop             
		return stringbuilder.toString();
	//   24   42:aload_2         
	//   25   43:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   26   46:areturn         
	}

	protected int getLineNumber(InterpretationContext interpretationcontext)
	{
		interpretationcontext = ((InterpretationContext) (interpretationcontext.getJoranInterpreter().getLocator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method Interpreter InterpretationContext.getJoranInterpreter()>
	//    2    4:invokevirtual   #53  <Method Locator Interpreter.getLocator()>
	//    3    7:astore_1        
		if(interpretationcontext != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          19
			return ((Locator) (interpretationcontext)).getLineNumber();
	//    6   12:aload_1         
	//    7   13:invokeinterface #85  <Method int Locator.getLineNumber()>
	//    8   18:ireturn         
		else
			return -1;
	//    9   19:iconst_m1       
	//   10   20:ireturn         
	}

	public String toString()
	{
		return ((Object)this).getClass().getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #96  <Method String Class.getName()>
	//    3    7:areturn         
	}

	public static final String ACTION_CLASS_ATTRIBUTE = "actionClass";
	public static final String CLASS_ATTRIBUTE = "class";
	public static final String FILE_ATTRIBUTE = "file";
	public static final String KEY_ATTRIBUTE = "key";
	public static final String NAME_ATTRIBUTE = "name";
	public static final String PATTERN_ATTRIBUTE = "pattern";
	public static final String SCOPE_ATTRIBUTE = "scope";
	public static final String VALUE_ATTRIBUTE = "value";
}
