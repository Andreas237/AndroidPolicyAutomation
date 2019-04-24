// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.event;

import org.xml.sax.Locator;

// Referenced classes of package ch.qos.logback.core.joran.event:
//			SaxEvent

public class EndEvent extends SaxEvent
{

	EndEvent(String s, String s1, String s2, Locator locator)
	{
		super(s, s1, s2, locator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #8   <Method void SaxEvent(String, String, String, Locator)>
	//    6    9:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #13  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("  EndEvent(");
	//    4    8:aload_1         
	//    5    9:ldc1            #18  <String "  EndEvent(">
	//    6   11:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getQName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #25  <Method String getQName()>
	//   11   20:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(")  [");
	//   13   24:aload_1         
	//   14   25:ldc1            #27  <String ")  [">
	//   15   27:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(locator.getLineNumber());
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #31  <Field Locator locator>
	//   20   36:invokeinterface #37  <Method int Locator.getLineNumber()>
	//   21   41:invokevirtual   #40  <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
		stringbuilder.append(",");
	//   23   45:aload_1         
	//   24   46:ldc1            #42  <String ",">
	//   25   48:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		stringbuilder.append(locator.getColumnNumber());
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #31  <Field Locator locator>
	//   30   57:invokeinterface #45  <Method int Locator.getColumnNumber()>
	//   31   62:invokevirtual   #40  <Method StringBuilder StringBuilder.append(int)>
	//   32   65:pop             
		stringbuilder.append("]");
	//   33   66:aload_1         
	//   34   67:ldc1            #47  <String "]">
	//   35   69:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
		return stringbuilder.toString();
	//   37   73:aload_1         
	//   38   74:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   39   77:areturn         
	}
}
