// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.html;

import ch.qos.logback.core.*;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.ScanException;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.html:
//			CssBuilder

public abstract class HTMLLayoutBase extends LayoutBase
{

	public HTMLLayoutBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void LayoutBase()>
		title = "Logback Log Messages";
	//    2    4:aload_0         
	//    3    5:ldc1            #21  <String "Logback Log Messages">
	//    4    7:putfield        #23  <Field String title>
		counter = 0L;
	//    5   10:aload_0         
	//    6   11:lconst_0        
	//    7   12:putfield        #25  <Field long counter>
	//    8   15:return          
	}

	private void buildHeaderRowForTable(StringBuilder stringbuilder)
	{
		Converter converter = head;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Converter head>
	//    2    4:astore_2        
		stringbuilder.append("<tr class=\"header\">");
	//    3    5:aload_1         
	//    4    6:ldc1            #32  <String "<tr class=\"header\">">
	//    5    8:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    6   11:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//    7   12:aload_1         
	//    8   13:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//    9   16:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		while(converter != null) 
	//*  11   20:aload_2         
	//*  12   21:ifnull          92
		{
			if(computeConverterName(converter) != null)
	//*  13   24:aload_0         
	//*  14   25:aload_2         
	//*  15   26:invokevirtual   #47  <Method String computeConverterName(Converter)>
	//*  16   29:ifnonnull       40
	//*  17   32:aload_2         
	//*  18   33:invokevirtual   #53  <Method Converter Converter.getNext()>
	//*  19   36:astore_2        
	//*  20   37:goto            20
			{
				stringbuilder.append("<td class=\"");
	//   21   40:aload_1         
	//   22   41:ldc1            #55  <String "<td class=\"">
	//   23   43:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
				stringbuilder.append(computeConverterName(converter));
	//   25   47:aload_1         
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:invokevirtual   #47  <Method String computeConverterName(Converter)>
	//   29   53:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
				stringbuilder.append("\">");
	//   31   57:aload_1         
	//   32   58:ldc1            #57  <String "\">">
	//   33   60:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
				stringbuilder.append(computeConverterName(converter));
	//   35   64:aload_1         
	//   36   65:aload_0         
	//   37   66:aload_2         
	//   38   67:invokevirtual   #47  <Method String computeConverterName(Converter)>
	//   39   70:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   40   73:pop             
				stringbuilder.append("</td>");
	//   41   74:aload_1         
	//   42   75:ldc1            #59  <String "</td>">
	//   43   77:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   44   80:pop             
				stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   45   81:aload_1         
	//   46   82:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   47   85:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   48   88:pop             
			}
			converter = converter.getNext();
		}
	//*  49   89:goto            32
		stringbuilder.append("</tr>");
	//   50   92:aload_1         
	//   51   93:ldc1            #61  <String "</tr>">
	//   52   95:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   53   98:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   54   99:aload_1         
	//   55  100:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   56  103:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   57  106:pop             
	//   58  107:return          
	}

	protected String computeConverterName(Converter converter)
	{
		converter = ((Converter) (((Object) (converter)).getClass().getSimpleName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #67  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #73  <Method String Class.getSimpleName()>
	//    3    7:astore_1        
		int i = ((String) (converter)).indexOf("Converter");
	//    4    8:aload_1         
	//    5    9:ldc1            #75  <String "Converter">
	//    6   11:invokevirtual   #81  <Method int String.indexOf(String)>
	//    7   14:istore_2        
		if(i == -1)
	//*   8   15:iload_2         
	//*   9   16:iconst_m1       
	//*  10   17:icmpne          22
			return ((String) (converter));
	//   11   20:aload_1         
	//   12   21:areturn         
		else
			return ((String) (converter)).substring(0, i);
	//   13   22:aload_1         
	//   14   23:iconst_0        
	//   15   24:iload_2         
	//   16   25:invokevirtual   #85  <Method String String.substring(int, int)>
	//   17   28:areturn         
	}

	public String getContentType()
	{
		return "text/html";
	//    0    0:ldc1            #88  <String "text/html">
	//    1    2:areturn         
	}

	public CssBuilder getCssBuilder()
	{
		return cssBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field CssBuilder cssBuilder>
	//    2    4:areturn         
	}

	protected abstract Map getDefaultConverterMap();

	public Map getEffectiveConverterMap()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #97  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void HashMap()>
	//    3    7:astore_1        
		Object obj = ((Object) (getDefaultConverterMap()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #100 <Method Map getDefaultConverterMap()>
	//    6   12:astore_2        
		if(obj != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          24
			((Map) (hashmap)).putAll(((Map) (obj)));
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokeinterface #106 <Method void Map.putAll(Map)>
		obj = ((Object) (getContext()));
	//   12   24:aload_0         
	//   13   25:invokevirtual   #110 <Method Context getContext()>
	//   14   28:astore_2        
		if(obj != null)
	//*  15   29:aload_2         
	//*  16   30:ifnull          56
		{
			obj = ((Object) ((Map)((Context) (obj)).getObject("PATTERN_RULE_REGISTRY")));
	//   17   33:aload_2         
	//   18   34:ldc1            #112 <String "PATTERN_RULE_REGISTRY">
	//   19   36:invokeinterface #118 <Method Object Context.getObject(String)>
	//   20   41:checkcast       #102 <Class Map>
	//   21   44:astore_2        
			if(obj != null)
	//*  22   45:aload_2         
	//*  23   46:ifnull          56
				((Map) (hashmap)).putAll(((Map) (obj)));
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokeinterface #106 <Method void Map.putAll(Map)>
		}
		return ((Map) (hashmap));
	//   27   56:aload_1         
	//   28   57:areturn         
	}

	public String getFileFooter()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//    4    8:aload_1         
	//    5    9:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//    6   12:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("</body></html>");
	//    8   16:aload_1         
	//    9   17:ldc1            #124 <String "</body></html>">
	//   10   19:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		return stringbuilder.toString();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   14   27:areturn         
	}

	public String getFileHeader()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");
	//    4    8:aload_1         
	//    5    9:ldc1            #130 <String "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"">
	//    6   11:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
	//    8   15:aload_1         
	//    9   16:ldc1            #132 <String " \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">">
	//   10   18:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   12   22:aload_1         
	//   13   23:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   14   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append("<html>");
	//   16   30:aload_1         
	//   17   31:ldc1            #134 <String "<html>">
	//   18   33:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   20   37:aload_1         
	//   21   38:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   22   41:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		stringbuilder.append("  <head>");
	//   24   45:aload_1         
	//   25   46:ldc1            #136 <String "  <head>">
	//   26   48:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   28   52:aload_1         
	//   29   53:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   30   56:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		stringbuilder.append("    <title>");
	//   32   60:aload_1         
	//   33   61:ldc1            #138 <String "    <title>">
	//   34   63:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
		stringbuilder.append(title);
	//   36   67:aload_1         
	//   37   68:aload_0         
	//   38   69:getfield        #23  <Field String title>
	//   39   72:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
		stringbuilder.append("</title>");
	//   41   76:aload_1         
	//   42   77:ldc1            #140 <String "</title>">
	//   43   79:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   45   83:aload_1         
	//   46   84:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   47   87:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   48   90:pop             
		cssBuilder.addCss(stringbuilder);
	//   49   91:aload_0         
	//   50   92:getfield        #92  <Field CssBuilder cssBuilder>
	//   51   95:aload_1         
	//   52   96:invokeinterface #145 <Method void CssBuilder.addCss(StringBuilder)>
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   53  101:aload_1         
	//   54  102:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   55  105:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   56  108:pop             
		stringbuilder.append("  </head>");
	//   57  109:aload_1         
	//   58  110:ldc1            #147 <String "  </head>">
	//   59  112:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   60  115:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   61  116:aload_1         
	//   62  117:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   63  120:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   64  123:pop             
		stringbuilder.append("<body>");
	//   65  124:aload_1         
	//   66  125:ldc1            #149 <String "<body>">
	//   67  127:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   68  130:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   69  131:aload_1         
	//   70  132:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   71  135:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   72  138:pop             
		return stringbuilder.toString();
	//   73  139:aload_1         
	//   74  140:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   75  143:areturn         
	}

	public String getPattern()
	{
		return pattern;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field String pattern>
	//    2    4:areturn         
	}

	public String getPresentationFooter()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("</table>");
	//    4    8:aload_1         
	//    5    9:ldc1            #155 <String "</table>">
	//    6   11:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		return stringbuilder.toString();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   10   19:areturn         
	}

	public String getPresentationHeader()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("<hr/>");
	//    4    8:aload_1         
	//    5    9:ldc1            #158 <String "<hr/>">
	//    6   11:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//    8   15:aload_1         
	//    9   16:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   10   19:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append("<p>Log session start time ");
	//   12   23:aload_1         
	//   13   24:ldc1            #160 <String "<p>Log session start time ">
	//   14   26:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(((Object) (new Date())));
	//   16   30:aload_1         
	//   17   31:new             #162 <Class Date>
	//   18   34:dup             
	//   19   35:invokespecial   #163 <Method void Date()>
	//   20   38:invokevirtual   #166 <Method StringBuilder StringBuilder.append(Object)>
	//   21   41:pop             
		stringbuilder.append("</p><p></p>");
	//   22   42:aload_1         
	//   23   43:ldc1            #168 <String "</p><p></p>">
	//   24   45:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   26   49:aload_1         
	//   27   50:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   28   53:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   30   57:aload_1         
	//   31   58:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   32   61:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append("<table cellspacing=\"0\">");
	//   34   65:aload_1         
	//   35   66:ldc1            #170 <String "<table cellspacing=\"0\">">
	//   36   68:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   38   72:aload_1         
	//   39   73:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   40   76:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
		buildHeaderRowForTable(stringbuilder);
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:invokespecial   #172 <Method void buildHeaderRowForTable(StringBuilder)>
		return stringbuilder.toString();
	//   45   85:aload_1         
	//   46   86:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   47   89:areturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String title>
	//    2    4:areturn         
	}

	public void setCssBuilder(CssBuilder cssbuilder)
	{
		cssBuilder = cssbuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field CssBuilder cssBuilder>
	//    3    5:return          
	}

	public void setPattern(String s)
	{
		pattern = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field String pattern>
	//    3    5:return          
	}

	public void setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field String title>
	//    3    5:return          
	}

	public void start()
	{
		Parser parser = new Parser(pattern);
	//    0    0:new             #183 <Class Parser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #152 <Field String pattern>
	//    4    8:invokespecial   #185 <Method void Parser(String)>
	//    5   11:astore_2        
		parser.setContext(getContext());
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #110 <Method Context getContext()>
	//    9   17:invokevirtual   #189 <Method void Parser.setContext(Context)>
		head = parser.compile(parser.parse(), getEffectiveConverterMap());
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #193 <Method ch.qos.logback.core.pattern.parser.Node Parser.parse()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #195 <Method Map getEffectiveConverterMap()>
	//   16   30:invokevirtual   #199 <Method Converter Parser.compile(ch.qos.logback.core.pattern.parser.Node, Map)>
	//   17   33:putfield        #30  <Field Converter head>
		ConverterUtil.startConverters(head);
	//   18   36:aload_0         
	//   19   37:getfield        #30  <Field Converter head>
	//   20   40:invokestatic    #205 <Method void ConverterUtil.startConverters(Converter)>
		boolean flag;
		flag = false;
	//   21   43:iconst_0        
	//   22   44:istore_1        
		break MISSING_BLOCK_LABEL_58;
	//   23   45:goto            58
		ScanException scanexception;
		scanexception;
	//   24   48:astore_2        
		addError("Incorrect pattern found", ((Throwable) (scanexception)));
	//   25   49:aload_0         
	//   26   50:ldc1            #207 <String "Incorrect pattern found">
	//   27   52:aload_2         
	//   28   53:invokevirtual   #211 <Method void addError(String, Throwable)>
		flag = true;
	//   29   56:iconst_1        
	//   30   57:istore_1        
		if(!flag)
	//*  31   58:iload_1         
	//*  32   59:ifne            67
			super.started = true;
	//   33   62:aload_0         
	//   34   63:iconst_1        
	//   35   64:putfield        #215 <Field boolean LayoutBase.started>
		return;
	//   36   67:return          
	}

	protected void startNewTableIfLimitReached(StringBuilder stringbuilder)
	{
		if(counter >= 10000L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field long counter>
	//*   2    4:ldc2w           #217 <Long 10000L>
	//*   3    7:lcmp            
	//*   4    8:iflt            58
		{
			counter = 0L;
	//    5   11:aload_0         
	//    6   12:lconst_0        
	//    7   13:putfield        #25  <Field long counter>
			stringbuilder.append("</table>");
	//    8   16:aload_1         
	//    9   17:ldc1            #155 <String "</table>">
	//   10   19:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   12   23:aload_1         
	//   13   24:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   14   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append("<p></p>");
	//   16   31:aload_1         
	//   17   32:ldc1            #220 <String "<p></p>">
	//   18   34:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append("<table cellspacing=\"0\">");
	//   20   38:aload_1         
	//   21   39:ldc1            #170 <String "<table cellspacing=\"0\">">
	//   22   41:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   24   45:aload_1         
	//   25   46:getstatic       #43  <Field String CoreConstants.LINE_SEPARATOR>
	//   26   49:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			buildHeaderRowForTable(stringbuilder);
	//   28   53:aload_0         
	//   29   54:aload_1         
	//   30   55:invokespecial   #172 <Method void buildHeaderRowForTable(StringBuilder)>
		}
	//   31   58:return          
	}

	protected long counter;
	protected CssBuilder cssBuilder;
	protected Converter head;
	protected String pattern;
	protected String title;
}
