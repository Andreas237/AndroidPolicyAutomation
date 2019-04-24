// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.PropertySetter;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public class ParamAction extends Action
{

	public ParamAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Action()>
		inError = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean inError>
	//    5    9:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		s = attributes.getValue("name");
	//    0    0:aload_3         
	//    1    1:ldc1            #25  <String "name">
	//    2    3:invokeinterface #31  <Method String Attributes.getValue(String)>
	//    3    8:astore_2        
		attributes = ((Attributes) (attributes.getValue("value")));
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "value">
	//    6   12:invokeinterface #31  <Method String Attributes.getValue(String)>
	//    7   17:astore_3        
		if(s == null)
	//*   8   18:aload_2         
	//*   9   19:ifnonnull       35
		{
			inError = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #21  <Field boolean inError>
			addError(NO_NAME);
	//   13   27:aload_0         
	//   14   28:getstatic       #35  <Field String NO_NAME>
	//   15   31:invokevirtual   #39  <Method void addError(String)>
			return;
	//   16   34:return          
		}
		if(attributes == null)
	//*  17   35:aload_3         
	//*  18   36:ifnonnull       52
		{
			inError = true;
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:putfield        #21  <Field boolean inError>
			addError(NO_VALUE);
	//   22   44:aload_0         
	//   23   45:getstatic       #41  <Field String NO_VALUE>
	//   24   48:invokevirtual   #39  <Method void addError(String)>
			return;
	//   25   51:return          
		} else
		{
			String s1 = ((String) (attributes)).trim();
	//   26   52:aload_3         
	//   27   53:invokevirtual   #47  <Method String String.trim()>
	//   28   56:astore          4
			attributes = ((Attributes) (new PropertySetter(interpretationcontext.peekObject())));
	//   29   58:new             #49  <Class PropertySetter>
	//   30   61:dup             
	//   31   62:aload_1         
	//   32   63:invokevirtual   #55  <Method Object InterpretationContext.peekObject()>
	//   33   66:invokespecial   #58  <Method void PropertySetter(Object)>
	//   34   69:astore_3        
			((PropertySetter) (attributes)).setContext(context);
	//   35   70:aload_3         
	//   36   71:aload_0         
	//   37   72:getfield        #62  <Field ch.qos.logback.core.Context context>
	//   38   75:invokevirtual   #66  <Method void PropertySetter.setContext(ch.qos.logback.core.Context)>
			s1 = interpretationcontext.subst(s1);
	//   39   78:aload_1         
	//   40   79:aload           4
	//   41   81:invokevirtual   #69  <Method String InterpretationContext.subst(String)>
	//   42   84:astore          4
			((PropertySetter) (attributes)).setProperty(interpretationcontext.subst(s), s1);
	//   43   86:aload_3         
	//   44   87:aload_1         
	//   45   88:aload_2         
	//   46   89:invokevirtual   #69  <Method String InterpretationContext.subst(String)>
	//   47   92:aload           4
	//   48   94:invokevirtual   #73  <Method void PropertySetter.setProperty(String, String)>
			return;
	//   49   97:return          
		}
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
	//    0    0:return          
	}

	public void finish(InterpretationContext interpretationcontext)
	{
	//    0    0:return          
	}

	static String NO_NAME = "No name attribute in <param> element";
	static String NO_VALUE = "No value attribute in <param> element";
	boolean inError;

	static 
	{
	//    0    0:return          
	}
}
