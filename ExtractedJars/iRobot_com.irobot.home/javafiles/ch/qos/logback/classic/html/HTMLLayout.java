// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.html;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.MDCConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.html.HTMLLayoutBase;
import ch.qos.logback.core.html.IThrowableRenderer;
import ch.qos.logback.core.pattern.Converter;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.html:
//			DefaultThrowableRenderer, DefaultCssBuilder

public class HTMLLayout extends HTMLLayoutBase
{

	public HTMLLayout()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void HTMLLayoutBase()>
		pattern = "%date%thread%level%logger%mdc%msg";
	//    2    4:aload_0         
	//    3    5:ldc1            #9   <String "%date%thread%level%logger%mdc%msg">
	//    4    7:putfield        #19  <Field String pattern>
		throwableRenderer = ((IThrowableRenderer) (new DefaultThrowableRenderer()));
	//    5   10:aload_0         
	//    6   11:new             #21  <Class DefaultThrowableRenderer>
	//    7   14:dup             
	//    8   15:invokespecial   #22  <Method void DefaultThrowableRenderer()>
	//    9   18:putfield        #24  <Field IThrowableRenderer throwableRenderer>
		cssBuilder = ((ch.qos.logback.core.html.CssBuilder) (new DefaultCssBuilder()));
	//   10   21:aload_0         
	//   11   22:new             #26  <Class DefaultCssBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #27  <Method void DefaultCssBuilder()>
	//   14   29:putfield        #31  <Field ch.qos.logback.core.html.CssBuilder cssBuilder>
	//   15   32:return          
	}

	private void appendEventToBuffer(StringBuilder stringbuilder, Converter converter, ILoggingEvent iloggingevent)
	{
		stringbuilder.append("<td class=\"");
	//    0    0:aload_1         
	//    1    1:ldc1            #36  <String "<td class=\"">
	//    2    3:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		stringbuilder.append(computeConverterName(converter));
	//    4    7:aload_1         
	//    5    8:aload_0         
	//    6    9:aload_2         
	//    7   10:invokevirtual   #46  <Method String computeConverterName(Converter)>
	//    8   13:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   16:pop             
		stringbuilder.append("\">");
	//   10   17:aload_1         
	//   11   18:ldc1            #48  <String "\">">
	//   12   20:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   23:pop             
		converter.write(stringbuilder, ((Object) (iloggingevent)));
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:aload_3         
	//   17   27:invokevirtual   #54  <Method void Converter.write(StringBuilder, Object)>
		stringbuilder.append("</td>");
	//   18   30:aload_1         
	//   19   31:ldc1            #56  <String "</td>">
	//   20   33:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   21   36:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   22   37:aload_1         
	//   23   38:getstatic       #61  <Field String CoreConstants.LINE_SEPARATOR>
	//   24   41:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   25   44:pop             
	//   26   45:return          
	}

	protected String computeConverterName(Converter converter)
	{
		if(converter instanceof MDCConverter)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #65  <Class MDCConverter>
	//*   2    4:ifeq            24
		{
			converter = ((Converter) (((MDCConverter)converter).getFirstOption()));
	//    3    7:aload_1         
	//    4    8:checkcast       #65  <Class MDCConverter>
	//    5   11:invokevirtual   #69  <Method String MDCConverter.getFirstOption()>
	//    6   14:astore_1        
			if(converter != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          21
				return ((String) (converter));
	//    9   19:aload_1         
	//   10   20:areturn         
			else
				return "MDC";
	//   11   21:ldc1            #71  <String "MDC">
	//   12   23:areturn         
		} else
		{
			return super.computeConverterName(converter);
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokespecial   #72  <Method String HTMLLayoutBase.computeConverterName(Converter)>
	//   16   29:areturn         
		}
	}

	public String doLayout(ILoggingEvent iloggingevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore          6
		startNewTableIfLimitReached(stringbuilder);
	//    4    9:aload_0         
	//    5   10:aload           6
	//    6   12:invokevirtual   #79  <Method void startNewTableIfLimitReached(StringBuilder)>
		long l = counter;
	//    7   15:aload_0         
	//    8   16:getfield        #83  <Field long counter>
	//    9   19:lstore_3        
		counter = l + 1L;
	//   10   20:aload_0         
	//   11   21:lload_3         
	//   12   22:lconst_1        
	//   13   23:ladd            
	//   14   24:putfield        #83  <Field long counter>
		boolean flag;
		if((l & 1L) == 0L)
	//*  15   27:lload_3         
	//*  16   28:lconst_1        
	//*  17   29:land            
	//*  18   30:lconst_0        
	//*  19   31:lcmp            
	//*  20   32:ifne            40
			flag = false;
	//   21   35:iconst_0        
	//   22   36:istore_2        
		else
	//*  23   37:goto            42
			flag = true;
	//   24   40:iconst_1        
	//   25   41:istore_2        
		String s = iloggingevent.getLevel().toString().toLowerCase();
	//   26   42:aload_1         
	//   27   43:invokeinterface #89  <Method Level ILoggingEvent.getLevel()>
	//   28   48:invokevirtual   #94  <Method String Level.toString()>
	//   29   51:invokevirtual   #99  <Method String String.toLowerCase()>
	//   30   54:astore          5
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   31   56:aload           6
	//   32   58:getstatic       #61  <Field String CoreConstants.LINE_SEPARATOR>
	//   33   61:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
		stringbuilder.append("<tr class=\"");
	//   35   65:aload           6
	//   36   67:ldc1            #101 <String "<tr class=\"">
	//   37   69:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   38   72:pop             
		stringbuilder.append(s);
	//   39   73:aload           6
	//   40   75:aload           5
	//   41   77:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
		if(flag)
	//*  43   81:iload_2         
	//*  44   82:ifeq            100
			s = " odd\">";
	//   45   85:ldc1            #103 <String " odd\">">
	//   46   87:astore          5
		else
	//*  47   89:aload           6
	//*  48   91:aload           5
	//*  49   93:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  50   96:pop             
	//*  51   97:goto            107
			s = " even\">";
	//   52  100:ldc1            #105 <String " even\">">
	//   53  102:astore          5
		stringbuilder.append(s);
	//*  54  104:goto            89
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   55  107:aload           6
	//   56  109:getstatic       #61  <Field String CoreConstants.LINE_SEPARATOR>
	//   57  112:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   58  115:pop             
		for(Converter converter = head; converter != null; converter = converter.getNext())
	//*  59  116:aload_0         
	//*  60  117:getfield        #109 <Field Converter head>
	//*  61  120:astore          5
	//*  62  122:aload           5
	//*  63  124:ifnull          146
			appendEventToBuffer(stringbuilder, converter, iloggingevent);
	//   64  127:aload_0         
	//   65  128:aload           6
	//   66  130:aload           5
	//   67  132:aload_1         
	//   68  133:invokespecial   #111 <Method void appendEventToBuffer(StringBuilder, Converter, ILoggingEvent)>

	//   69  136:aload           5
	//   70  138:invokevirtual   #115 <Method Converter Converter.getNext()>
	//   71  141:astore          5
	//*  72  143:goto            122
		stringbuilder.append("</tr>");
	//   73  146:aload           6
	//   74  148:ldc1            #117 <String "</tr>">
	//   75  150:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   76  153:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   77  154:aload           6
	//   78  156:getstatic       #61  <Field String CoreConstants.LINE_SEPARATOR>
	//   79  159:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   80  162:pop             
		if(iloggingevent.getThrowableProxy() != null)
	//*  81  163:aload_1         
	//*  82  164:invokeinterface #121 <Method ch.qos.logback.classic.spi.IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//*  83  169:ifnull          184
			throwableRenderer.render(stringbuilder, ((Object) (iloggingevent)));
	//   84  172:aload_0         
	//   85  173:getfield        #24  <Field IThrowableRenderer throwableRenderer>
	//   86  176:aload           6
	//   87  178:aload_1         
	//   88  179:invokeinterface #126 <Method void IThrowableRenderer.render(StringBuilder, Object)>
		return stringbuilder.toString();
	//   89  184:aload           6
	//   90  186:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   91  189:areturn         
	}

	public volatile String doLayout(Object obj)
	{
		return doLayout((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #85  <Class ILoggingEvent>
	//    3    5:invokevirtual   #130 <Method String doLayout(ILoggingEvent)>
	//    4    8:areturn         
	}

	protected Map getDefaultConverterMap()
	{
		return PatternLayout.defaultConverterMap;
	//    0    0:getstatic       #138 <Field Map PatternLayout.defaultConverterMap>
	//    1    3:areturn         
	}

	public IThrowableRenderer getThrowableRenderer()
	{
		return throwableRenderer;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field IThrowableRenderer throwableRenderer>
	//    2    4:areturn         
	}

	public void setThrowableRenderer(IThrowableRenderer ithrowablerenderer)
	{
		throwableRenderer = ithrowablerenderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field IThrowableRenderer throwableRenderer>
	//    3    5:return          
	}

	public void start()
	{
		boolean flag;
		if(throwableRenderer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field IThrowableRenderer throwableRenderer>
	//*   2    4:ifnonnull       18
		{
			addError("ThrowableRender cannot be null.");
	//    3    7:aload_0         
	//    4    8:ldc1            #147 <String "ThrowableRender cannot be null.">
	//    5   10:invokevirtual   #151 <Method void addError(String)>
			flag = true;
	//    6   13:iconst_1        
	//    7   14:istore_1        
		} else
	//*   8   15:goto            20
		{
			flag = false;
	//    9   18:iconst_0        
	//   10   19:istore_1        
		}
		if(!flag)
	//*  11   20:iload_1         
	//*  12   21:ifne            28
			super.start();
	//   13   24:aload_0         
	//   14   25:invokespecial   #153 <Method void HTMLLayoutBase.start()>
	//   15   28:return          
	}

	static final String DEFAULT_CONVERSION_PATTERN = "%date%thread%level%logger%mdc%msg";
	IThrowableRenderer throwableRenderer;
}
