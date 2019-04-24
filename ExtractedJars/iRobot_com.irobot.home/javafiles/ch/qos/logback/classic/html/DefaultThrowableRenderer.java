// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.html;

import ch.qos.logback.classic.spi.*;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.Transform;
import ch.qos.logback.core.html.IThrowableRenderer;

public class DefaultThrowableRenderer
	implements IThrowableRenderer
{

	public DefaultThrowableRenderer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public void printFirstLine(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
	{
		if(ithrowableproxy.getCommonFrames() > 0)
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #24  <Method int IThrowableProxy.getCommonFrames()>
	//*   2    6:ifle            23
		{
			stringbuilder.append("<br />");
	//    3    9:aload_1         
	//    4   10:ldc1            #26  <String "<br />">
	//    5   12:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:pop             
			stringbuilder.append("Caused by: ");
	//    7   16:aload_1         
	//    8   17:ldc1            #34  <String "Caused by: ">
	//    9   19:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
		}
		stringbuilder.append(ithrowableproxy.getClassName());
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokeinterface #38  <Method String IThrowableProxy.getClassName()>
	//   14   30:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		stringbuilder.append(": ");
	//   16   34:aload_1         
	//   17   35:ldc1            #40  <String ": ">
	//   18   37:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append(Transform.escapeTags(ithrowableproxy.getMessage()));
	//   20   41:aload_1         
	//   21   42:aload_2         
	//   22   43:invokeinterface #43  <Method String IThrowableProxy.getMessage()>
	//   23   48:invokestatic    #49  <Method String Transform.escapeTags(String)>
	//   24   51:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:pop             
		stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   26   55:aload_1         
	//   27   56:getstatic       #54  <Field String CoreConstants.LINE_SEPARATOR>
	//   28   59:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
	//   30   63:return          
	}

	public void render(StringBuilder stringbuilder, ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (iloggingevent.getThrowableProxy()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #62  <Method IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//    2    6:astore_2        
		stringbuilder.append("<tr><td class=\"Exception\" colspan=\"6\">");
	//    3    7:aload_1         
	//    4    8:ldc1            #64  <String "<tr><td class=\"Exception\" colspan=\"6\">">
	//    5   10:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:pop             
		for(; iloggingevent != null; iloggingevent = ((ILoggingEvent) (((IThrowableProxy) (iloggingevent)).getCause())))
	//*   7   14:aload_2         
	//*   8   15:ifnull          34
			render(stringbuilder, ((IThrowableProxy) (iloggingevent)));
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #66  <Method void render(StringBuilder, IThrowableProxy)>

	//   13   24:aload_2         
	//   14   25:invokeinterface #69  <Method IThrowableProxy IThrowableProxy.getCause()>
	//   15   30:astore_2        
	//*  16   31:goto            14
		stringbuilder.append("</td></tr>");
	//   17   34:aload_1         
	//   18   35:ldc1            #71  <String "</td></tr>">
	//   19   37:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
	//   21   41:return          
	}

	void render(StringBuilder stringbuilder, IThrowableProxy ithrowableproxy)
	{
		printFirstLine(stringbuilder, ithrowableproxy);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #73  <Method void printFirstLine(StringBuilder, IThrowableProxy)>
		int j = ithrowableproxy.getCommonFrames();
	//    4    6:aload_2         
	//    5    7:invokeinterface #24  <Method int IThrowableProxy.getCommonFrames()>
	//    6   12:istore          4
		ithrowableproxy = ((IThrowableProxy) (ithrowableproxy.getStackTraceElementProxyArray()));
	//    7   14:aload_2         
	//    8   15:invokeinterface #77  <Method StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//    9   20:astore_2        
		for(int i = 0; i < ithrowableproxy.length - j; i++)
	//*  10   21:iconst_0        
	//*  11   22:istore_3        
	//*  12   23:iload_3         
	//*  13   24:aload_2         
	//*  14   25:arraylength     
	//*  15   26:iload           4
	//*  16   28:isub            
	//*  17   29:icmpge          72
		{
			StackTraceElementProxy stacktraceelementproxy = ((StackTraceElementProxy) (ithrowableproxy[i]));
	//   18   32:aload_2         
	//   19   33:iload_3         
	//   20   34:aaload          
	//   21   35:astore          5
			stringbuilder.append("<br />&nbsp;&nbsp;&nbsp;&nbsp;");
	//   22   37:aload_1         
	//   23   38:ldc1            #11  <String "<br />&nbsp;&nbsp;&nbsp;&nbsp;">
	//   24   40:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   25   43:pop             
			stringbuilder.append(Transform.escapeTags(stacktraceelementproxy.toString()));
	//   26   44:aload_1         
	//   27   45:aload           5
	//   28   47:invokevirtual   #82  <Method String StackTraceElementProxy.toString()>
	//   29   50:invokestatic    #49  <Method String Transform.escapeTags(String)>
	//   30   53:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   31   56:pop             
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   32   57:aload_1         
	//   33   58:getstatic       #54  <Field String CoreConstants.LINE_SEPARATOR>
	//   34   61:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		}

	//   36   65:iload_3         
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore_3        
	//*  40   69:goto            23
		if(j > 0)
	//*  41   72:iload           4
	//*  42   74:ifle            113
		{
			stringbuilder.append("<br />&nbsp;&nbsp;&nbsp;&nbsp;");
	//   43   77:aload_1         
	//   44   78:ldc1            #11  <String "<br />&nbsp;&nbsp;&nbsp;&nbsp;">
	//   45   80:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
			stringbuilder.append("\t... ");
	//   47   84:aload_1         
	//   48   85:ldc1            #84  <String "\t... ">
	//   49   87:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   50   90:pop             
			stringbuilder.append(j);
	//   51   91:aload_1         
	//   52   92:iload           4
	//   53   94:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   54   97:pop             
			stringbuilder.append(" common frames omitted");
	//   55   98:aload_1         
	//   56   99:ldc1            #89  <String " common frames omitted">
	//   57  101:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   58  104:pop             
			stringbuilder.append(CoreConstants.LINE_SEPARATOR);
	//   59  105:aload_1         
	//   60  106:getstatic       #54  <Field String CoreConstants.LINE_SEPARATOR>
	//   61  109:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   62  112:pop             
		}
	//   63  113:return          
	}

	public volatile void render(StringBuilder stringbuilder, Object obj)
	{
		render(stringbuilder, (ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #58  <Class ILoggingEvent>
	//    4    6:invokevirtual   #92  <Method void render(StringBuilder, ILoggingEvent)>
	//    5    9:return          
	}

	static final String TRACE_PREFIX = "<br />&nbsp;&nbsp;&nbsp;&nbsp;";
}
