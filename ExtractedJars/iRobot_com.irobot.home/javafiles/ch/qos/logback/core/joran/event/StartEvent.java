// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.event;

import ch.qos.logback.core.joran.spi.ElementPath;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;

// Referenced classes of package ch.qos.logback.core.joran.event:
//			SaxEvent

public class StartEvent extends SaxEvent
{

	StartEvent(ElementPath elementpath, String s, String s1, String s2, Attributes attributes1, Locator locator)
	{
		super(s, s1, s2, locator);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           6
	//    5    7:invokespecial   #13  <Method void SaxEvent(String, String, String, Locator)>
		attributes = ((Attributes) (new AttributesImpl(attributes1)));
	//    6   10:aload_0         
	//    7   11:new             #15  <Class AttributesImpl>
	//    8   14:dup             
	//    9   15:aload           5
	//   10   17:invokespecial   #18  <Method void AttributesImpl(Attributes)>
	//   11   20:putfield        #20  <Field Attributes attributes>
		elementPath = elementpath;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #22  <Field ElementPath elementPath>
	//   15   28:return          
	}

	public Attributes getAttributes()
	{
		return attributes;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Attributes attributes>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("StartEvent(");
	//    4    8:aload_1         
	//    5    9:ldc1            #34  <String "StartEvent(">
	//    6   11:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getQName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #41  <Method String getQName()>
	//   11   20:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(")  [");
	//   13   24:aload_1         
	//   14   25:ldc1            #43  <String ")  [">
	//   15   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(locator.getLineNumber());
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #47  <Field Locator locator>
	//   20   36:invokeinterface #53  <Method int Locator.getLineNumber()>
	//   21   41:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   22   44:pop             
		stringbuilder.append(",");
	//   23   45:aload_1         
	//   24   46:ldc1            #58  <String ",">
	//   25   48:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		stringbuilder.append(locator.getColumnNumber());
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #47  <Field Locator locator>
	//   30   57:invokeinterface #61  <Method int Locator.getColumnNumber()>
	//   31   62:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   32   65:pop             
		stringbuilder.append("]");
	//   33   66:aload_1         
	//   34   67:ldc1            #63  <String "]">
	//   35   69:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
		return stringbuilder.toString();
	//   37   73:aload_1         
	//   38   74:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   39   77:areturn         
	}

	public final Attributes attributes;
	public final ElementPath elementPath;
}
