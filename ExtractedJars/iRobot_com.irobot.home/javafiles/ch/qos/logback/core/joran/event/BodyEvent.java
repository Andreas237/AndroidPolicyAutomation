// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.event;

import org.xml.sax.Locator;

// Referenced classes of package ch.qos.logback.core.joran.event:
//			SaxEvent

public class BodyEvent extends SaxEvent
{

	BodyEvent(String s, Locator locator)
	{
		super(((String) (null)), ((String) (null)), ((String) (null)), locator);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:invokespecial   #11  <Method void SaxEvent(String, String, String, Locator)>
		text = s;
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:putfield        #13  <Field String text>
	//    9   13:return          
	}

	public void append(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #18  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(text);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field String text>
	//    7   13:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(s);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		text = stringbuilder.toString();
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   16   28:putfield        #13  <Field String text>
	//   17   31:return          
	}

	public String getText()
	{
		if(text != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field String text>
	//*   2    4:ifnull          15
			return text.trim();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field String text>
	//    5   11:invokevirtual   #34  <Method String String.trim()>
	//    6   14:areturn         
		else
			return text;
	//    7   15:aload_0         
	//    8   16:getfield        #13  <Field String text>
	//    9   19:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #18  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("BodyEvent(");
	//    4    8:aload_1         
	//    5    9:ldc1            #36  <String "BodyEvent(">
	//    6   11:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getText());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #38  <Method String getText()>
	//   11   20:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(")");
	//   13   24:aload_1         
	//   14   25:ldc1            #40  <String ")">
	//   15   27:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(locator.getLineNumber());
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #44  <Field Locator locator>
	//   20   36:invokeinterface #50  <Method int Locator.getLineNumber()>
	//   21   41:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
		stringbuilder.append(",");
	//   23   45:aload_1         
	//   24   46:ldc1            #55  <String ",">
	//   25   48:invokevirtual   #24  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		stringbuilder.append(locator.getColumnNumber());
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #44  <Field Locator locator>
	//   30   57:invokeinterface #58  <Method int Locator.getColumnNumber()>
	//   31   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
	//   32   65:pop             
		return stringbuilder.toString();
	//   33   66:aload_1         
	//   34   67:invokevirtual   #28  <Method String StringBuilder.toString()>
	//   35   70:areturn         
	}

	private String text;
}
