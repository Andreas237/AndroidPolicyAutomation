// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser.io;

import com.itextpdf.tool.xml.parser.XMLParserListener;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.parser.io:
//			Appender

public class ParserListenerWriter
	implements XMLParserListener
{

	public ParserListenerWriter(Appender appender)
	{
		this(appender, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #15  <Method void ParserListenerWriter(Appender, boolean)>
	//    4    6:return          
	}

	public ParserListenerWriter(Appender appender, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		writer = appender;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Appender writer>
		formatted = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field boolean formatted>
	//    8   14:return          
	}

	public void close()
	{
	//    0    0:return          
	}

	public void comment(String s)
	{
		writer.append("<!--").append(s).append("-->");
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Appender writer>
	//    2    4:ldc1            #28  <String "<!--">
	//    3    6:invokeinterface #34  <Method Appender Appender.append(String)>
	//    4   11:aload_1         
	//    5   12:invokeinterface #34  <Method Appender Appender.append(String)>
	//    6   17:ldc1            #36  <String "-->">
	//    7   19:invokeinterface #34  <Method Appender Appender.append(String)>
	//    8   24:pop             
	//    9   25:return          
	}

	public void endElement(String s, String s1)
	{
		if(s1.length() > 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #44  <Method int String.length()>
	//*   2    4:ifle            78
			s1 = (new StringBuilder()).append(s1).append(":").toString();
	//    3    7:new             #46  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #47  <Method void StringBuilder()>
	//    6   14:aload_2         
	//    7   15:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:ldc1            #52  <String ":">
	//    9   20:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   11   26:astore_2        
		writer.append("</").append(s1).append(s).append('>');
	//   12   27:aload_0         
	//   13   28:getfield        #21  <Field Appender writer>
	//   14   31:ldc1            #58  <String "</">
	//   15   33:invokeinterface #34  <Method Appender Appender.append(String)>
	//   16   38:aload_2         
	//   17   39:invokeinterface #34  <Method Appender Appender.append(String)>
	//   18   44:aload_1         
	//   19   45:invokeinterface #34  <Method Appender Appender.append(String)>
	//   20   50:bipush          62
	//   21   52:invokeinterface #61  <Method Appender Appender.append(char)>
	//   22   57:pop             
		if(formatted)
	//*  23   58:aload_0         
	//*  24   59:getfield        #23  <Field boolean formatted>
	//*  25   62:ifeq            77
			writer.append('\r');
	//   26   65:aload_0         
	//   27   66:getfield        #21  <Field Appender writer>
	//   28   69:bipush          13
	//   29   71:invokeinterface #61  <Method Appender Appender.append(char)>
	//   30   76:pop             
	//   31   77:return          
	//*  32   78:goto            27
	}

	public void init()
	{
	//    0    0:return          
	}

	public void startElement(String s, Map map, String s1)
	{
		if(s1.length() > 0)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #44  <Method int String.length()>
	//*   2    4:ifle            148
			s1 = (new StringBuilder()).append(s1).append(":").toString();
	//    3    7:new             #46  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #47  <Method void StringBuilder()>
	//    6   14:aload_3         
	//    7   15:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:ldc1            #52  <String ":">
	//    9   20:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   11   26:astore_3        
		if(map.size() > 0)
	//*  12   27:aload_2         
	//*  13   28:invokeinterface #69  <Method int Map.size()>
	//*  14   33:ifle            164
		{
			writer.append("<").append(s1).append(s).append(" ");
	//   15   36:aload_0         
	//   16   37:getfield        #21  <Field Appender writer>
	//   17   40:ldc1            #71  <String "<">
	//   18   42:invokeinterface #34  <Method Appender Appender.append(String)>
	//   19   47:aload_3         
	//   20   48:invokeinterface #34  <Method Appender Appender.append(String)>
	//   21   53:aload_1         
	//   22   54:invokeinterface #34  <Method Appender Appender.append(String)>
	//   23   59:ldc1            #73  <String " ">
	//   24   61:invokeinterface #34  <Method Appender Appender.append(String)>
	//   25   66:pop             
			for(s = ((String) (map.entrySet().iterator())); ((Iterator) (s)).hasNext(); writer.append((String)((java.util.Map.Entry) (map)).getKey()).append("=\"").append((String)((java.util.Map.Entry) (map)).getValue()).append("\" "))
	//*  26   67:aload_2         
	//*  27   68:invokeinterface #77  <Method Set Map.entrySet()>
	//*  28   73:invokeinterface #83  <Method Iterator Set.iterator()>
	//*  29   78:astore_1        
	//*  30   79:aload_1         
	//*  31   80:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//*  32   85:ifeq            151
				map = ((Map) ((java.util.Map.Entry)((Iterator) (s)).next()));
	//   33   88:aload_1         
	//   34   89:invokeinterface #93  <Method Object Iterator.next()>
	//   35   94:checkcast       #95  <Class java.util.Map$Entry>
	//   36   97:astore_2        

	//   37   98:aload_0         
	//   38   99:getfield        #21  <Field Appender writer>
	//   39  102:aload_2         
	//   40  103:invokeinterface #98  <Method Object java.util.Map$Entry.getKey()>
	//   41  108:checkcast       #40  <Class String>
	//   42  111:invokeinterface #34  <Method Appender Appender.append(String)>
	//   43  116:ldc1            #100 <String "=\"">
	//   44  118:invokeinterface #34  <Method Appender Appender.append(String)>
	//   45  123:aload_2         
	//   46  124:invokeinterface #103 <Method Object java.util.Map$Entry.getValue()>
	//   47  129:checkcast       #40  <Class String>
	//   48  132:invokeinterface #34  <Method Appender Appender.append(String)>
	//   49  137:ldc1            #105 <String "\" ">
	//   50  139:invokeinterface #34  <Method Appender Appender.append(String)>
	//   51  144:pop             
	//*  52  145:goto            79
	//*  53  148:goto            27
			writer.append('>');
	//   54  151:aload_0         
	//   55  152:getfield        #21  <Field Appender writer>
	//   56  155:bipush          62
	//   57  157:invokeinterface #61  <Method Appender Appender.append(char)>
	//   58  162:pop             
			return;
	//   59  163:return          
		} else
		{
			writer.append('<').append(s1).append(s).append('>');
	//   60  164:aload_0         
	//   61  165:getfield        #21  <Field Appender writer>
	//   62  168:bipush          60
	//   63  170:invokeinterface #61  <Method Appender Appender.append(char)>
	//   64  175:aload_3         
	//   65  176:invokeinterface #34  <Method Appender Appender.append(String)>
	//   66  181:aload_1         
	//   67  182:invokeinterface #34  <Method Appender Appender.append(String)>
	//   68  187:bipush          62
	//   69  189:invokeinterface #61  <Method Appender Appender.append(char)>
	//   70  194:pop             
			return;
	//   71  195:return          
		}
	}

	public void text(String s)
	{
		writer.append(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Appender writer>
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method Appender Appender.append(String)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void unknownText(String s)
	{
	//    0    0:return          
	}

	private final boolean formatted;
	private final Appender writer;
}
