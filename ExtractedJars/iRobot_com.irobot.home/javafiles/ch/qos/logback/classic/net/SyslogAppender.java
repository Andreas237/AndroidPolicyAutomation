// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.SyslogStartConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.net.SyslogAppenderBase;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class SyslogAppender extends SyslogAppenderBase
{

	public SyslogAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void SyslogAppenderBase()>
		stackTraceLayout = new PatternLayout();
	//    2    4:aload_0         
	//    3    5:new             #23  <Class PatternLayout>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void PatternLayout()>
	//    6   12:putfield        #26  <Field PatternLayout stackTraceLayout>
		stackTracePattern = "\t";
	//    7   15:aload_0         
	//    8   16:ldc1            #9   <String "\t">
	//    9   18:putfield        #28  <Field String stackTracePattern>
		throwableExcluded = false;
	//   10   21:aload_0         
	//   11   22:iconst_0        
	//   12   23:putfield        #30  <Field boolean throwableExcluded>
	//   13   26:return          
	}

	private void handleThrowableFirstLine(OutputStream outputstream, IThrowableProxy ithrowableproxy, String s, boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append(s);
	//    4    9:aload           5
	//    5   11:aload_3         
	//    6   12:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		if(!flag)
	//*   8   16:iload           4
	//*   9   18:ifne            29
			stringbuilder.append("Caused by: ");
	//   10   21:aload           5
	//   11   23:ldc1            #42  <String "Caused by: ">
	//   12   25:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
		stringbuilder.append(ithrowableproxy.getClassName());
	//   14   29:aload           5
	//   15   31:aload_2         
	//   16   32:invokeinterface #48  <Method String IThrowableProxy.getClassName()>
	//   17   37:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
		stringbuilder.append(": ");
	//   19   41:aload           5
	//   20   43:ldc1            #50  <String ": ">
	//   21   45:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
		stringbuilder.append(ithrowableproxy.getMessage());
	//   23   49:aload           5
	//   24   51:aload_2         
	//   25   52:invokeinterface #53  <Method String IThrowableProxy.getMessage()>
	//   26   57:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   27   60:pop             
		outputstream.write(stringbuilder.toString().getBytes());
	//   28   61:aload_1         
	//   29   62:aload           5
	//   30   64:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   31   67:invokevirtual   #62  <Method byte[] String.getBytes()>
	//   32   70:invokevirtual   #68  <Method void OutputStream.write(byte[])>
		outputstream.flush();
	//   33   73:aload_1         
	//   34   74:invokevirtual   #71  <Method void OutputStream.flush()>
	//   35   77:return          
	}

	private void setupStackTraceLayout()
	{
		stackTraceLayout.getInstanceConverterMap().put("syslogStart", ((Object) (((Class) (ch/qos/logback/classic/pattern/SyslogStartConverter)).getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field PatternLayout stackTraceLayout>
	//    2    4:invokevirtual   #76  <Method Map PatternLayout.getInstanceConverterMap()>
	//    3    7:ldc1            #78  <String "syslogStart">
	//    4    9:ldc1            #80  <Class SyslogStartConverter>
	//    5   11:invokevirtual   #85  <Method String Class.getName()>
	//    6   14:invokeinterface #91  <Method Object Map.put(Object, Object)>
	//    7   19:pop             
		PatternLayout patternlayout = stackTraceLayout;
	//    8   20:aload_0         
	//    9   21:getfield        #26  <Field PatternLayout stackTraceLayout>
	//   10   24:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   25:new             #35  <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #36  <Method void StringBuilder()>
	//   14   32:astore_2        
		stringbuilder.append(getPrefixPattern());
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #94  <Method String getPrefixPattern()>
	//   18   38:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
		stringbuilder.append(stackTracePattern);
	//   20   42:aload_2         
	//   21   43:aload_0         
	//   22   44:getfield        #28  <Field String stackTracePattern>
	//   23   47:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		patternlayout.setPattern(stringbuilder.toString());
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   28   56:invokevirtual   #98  <Method void PatternLayout.setPattern(String)>
		stackTraceLayout.setContext(getContext());
	//   29   59:aload_0         
	//   30   60:getfield        #26  <Field PatternLayout stackTraceLayout>
	//   31   63:aload_0         
	//   32   64:invokevirtual   #102 <Method ch.qos.logback.core.Context getContext()>
	//   33   67:invokevirtual   #106 <Method void PatternLayout.setContext(ch.qos.logback.core.Context)>
		stackTraceLayout.start();
	//   34   70:aload_0         
	//   35   71:getfield        #26  <Field PatternLayout stackTraceLayout>
	//   36   74:invokevirtual   #109 <Method void PatternLayout.start()>
	//   37   77:return          
	}

	public Layout buildLayout()
	{
		PatternLayout patternlayout = new PatternLayout();
	//    0    0:new             #23  <Class PatternLayout>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void PatternLayout()>
	//    3    7:astore_1        
		patternlayout.getInstanceConverterMap().put("syslogStart", ((Object) (((Class) (ch/qos/logback/classic/pattern/SyslogStartConverter)).getName())));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #76  <Method Map PatternLayout.getInstanceConverterMap()>
	//    6   12:ldc1            #78  <String "syslogStart">
	//    7   14:ldc1            #80  <Class SyslogStartConverter>
	//    8   16:invokevirtual   #85  <Method String Class.getName()>
	//    9   19:invokeinterface #91  <Method Object Map.put(Object, Object)>
	//   10   24:pop             
		if(suffixPattern == null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #114 <Field String suffixPattern>
	//*  13   29:ifnonnull       38
			suffixPattern = "[%thread] %logger %msg";
	//   14   32:aload_0         
	//   15   33:ldc1            #12  <String "[%thread] %logger %msg">
	//   16   35:putfield        #114 <Field String suffixPattern>
		StringBuilder stringbuilder = new StringBuilder();
	//   17   38:new             #35  <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #36  <Method void StringBuilder()>
	//   20   45:astore_2        
		stringbuilder.append(getPrefixPattern());
	//   21   46:aload_2         
	//   22   47:aload_0         
	//   23   48:invokevirtual   #94  <Method String getPrefixPattern()>
	//   24   51:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:pop             
		stringbuilder.append(suffixPattern);
	//   26   55:aload_2         
	//   27   56:aload_0         
	//   28   57:getfield        #114 <Field String suffixPattern>
	//   29   60:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
		patternlayout.setPattern(stringbuilder.toString());
	//   31   64:aload_1         
	//   32   65:aload_2         
	//   33   66:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   34   69:invokevirtual   #98  <Method void PatternLayout.setPattern(String)>
		patternlayout.setContext(getContext());
	//   35   72:aload_1         
	//   36   73:aload_0         
	//   37   74:invokevirtual   #102 <Method ch.qos.logback.core.Context getContext()>
	//   38   77:invokevirtual   #106 <Method void PatternLayout.setContext(ch.qos.logback.core.Context)>
		patternlayout.start();
	//   39   80:aload_1         
	//   40   81:invokevirtual   #109 <Method void PatternLayout.start()>
		return ((Layout) (patternlayout));
	//   41   84:aload_1         
	//   42   85:areturn         
	}

	String getPrefixPattern()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("%syslogStart{");
	//    4    8:aload_1         
	//    5    9:ldc1            #118 <String "%syslogStart{">
	//    6   11:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getFacility());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #121 <Method String getFacility()>
	//   11   20:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("}%nopex{}");
	//   13   24:aload_1         
	//   14   25:ldc1            #123 <String "}%nopex{}">
	//   15   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public int getSeverityForEvent(Object obj)
	{
		return LevelToSyslogSeverity.convert((ILoggingEvent)obj);
	//    0    0:aload_1         
	//    1    1:checkcast       #127 <Class ILoggingEvent>
	//    2    4:invokestatic    #133 <Method int LevelToSyslogSeverity.convert(ILoggingEvent)>
	//    3    7:ireturn         
	}

	public String getStackTracePattern()
	{
		return stackTracePattern;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String stackTracePattern>
	//    2    4:areturn         
	}

	public boolean isThrowableExcluded()
	{
		return throwableExcluded;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean throwableExcluded>
	//    2    4:ireturn         
	}

	protected void postProcess(Object obj, OutputStream outputstream)
	{
		boolean flag;
		Object obj1;
		if(throwableExcluded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean throwableExcluded>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		obj1 = ((Object) ((ILoggingEvent)obj));
	//    4    8:aload_1         
	//    5    9:checkcast       #127 <Class ILoggingEvent>
	//    6   12:astore          6
		obj = ((Object) (((ILoggingEvent) (obj1)).getThrowableProxy()));
	//    7   14:aload           6
	//    8   16:invokeinterface #144 <Method IThrowableProxy ILoggingEvent.getThrowableProxy()>
	//    9   21:astore_1        
		if(obj == null)
	//*  10   22:aload_1         
	//*  11   23:ifnonnull       27
			return;
	//   12   26:return          
		obj1 = ((Object) (stackTraceLayout.doLayout(((ILoggingEvent) (obj1)))));
	//   13   27:aload_0         
	//   14   28:getfield        #26  <Field PatternLayout stackTraceLayout>
	//   15   31:aload           6
	//   16   33:invokevirtual   #148 <Method String PatternLayout.doLayout(ILoggingEvent)>
	//   17   36:astore          6
		flag = true;
	//   18   38:iconst_1        
	//   19   39:istore          5
_L5:
		if(obj == null) goto _L2; else goto _L1
	//   20   41:aload_1         
	//   21   42:ifnull          143
_L1:
		ch.qos.logback.classic.spi.StackTraceElementProxy astacktraceelementproxy[] = ((IThrowableProxy) (obj)).getStackTraceElementProxyArray();
	//   22   45:aload_1         
	//   23   46:invokeinterface #152 <Method ch.qos.logback.classic.spi.StackTraceElementProxy[] IThrowableProxy.getStackTraceElementProxyArray()>
	//   24   51:astore          7
		int i;
		int j;
		ch.qos.logback.classic.spi.StackTraceElementProxy stacktraceelementproxy;
		StringBuilder stringbuilder;
		try
		{
			handleThrowableFirstLine(outputstream, ((IThrowableProxy) (obj)), ((String) (obj1)), flag);
	//   25   53:aload_0         
	//   26   54:aload_2         
	//   27   55:aload_1         
	//   28   56:aload           6
	//   29   58:iload           5
	//   30   60:invokespecial   #154 <Method void handleThrowableFirstLine(OutputStream, IThrowableProxy, String, boolean)>
			j = astacktraceelementproxy.length;
	//   31   63:aload           7
	//   32   65:arraylength     
	//   33   66:istore          4
		}
	//*  34   68:iconst_0        
	//*  35   69:istore_3        
	//*  36   70:iload_3         
	//*  37   71:iload           4
	//*  38   73:icmpge          130
	//*  39   76:aload           7
	//*  40   78:iload_3         
	//*  41   79:aaload          
	//*  42   80:astore          8
	//*  43   82:new             #35  <Class StringBuilder>
	//*  44   85:dup             
	//*  45   86:invokespecial   #36  <Method void StringBuilder()>
	//*  46   89:astore          9
	//*  47   91:aload           9
	//*  48   93:aload           6
	//*  49   95:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//*  50   98:pop             
	//*  51   99:aload           9
	//*  52  101:aload           8
	//*  53  103:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//*  54  106:pop             
	//*  55  107:aload_2         
	//*  56  108:aload           9
	//*  57  110:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  58  113:invokevirtual   #62  <Method byte[] String.getBytes()>
	//*  59  116:invokevirtual   #68  <Method void OutputStream.write(byte[])>
	//*  60  119:aload_2         
	//*  61  120:invokevirtual   #71  <Method void OutputStream.flush()>
	//*  62  123:iload_3         
	//*  63  124:iconst_1        
	//*  64  125:iadd            
	//*  65  126:istore_3        
	//*  66  127:goto            70
	//*  67  130:aload_1         
	//*  68  131:invokeinterface #160 <Method IThrowableProxy IThrowableProxy.getCause()>
	//*  69  136:astore_1        
	//*  70  137:iconst_0        
	//*  71  138:istore          5
	//*  72  140:goto            41
	//*  73  143:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  74  144:astore_1        
		{
			return;
	//   75  145:return          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		stacktraceelementproxy = astacktraceelementproxy[i];
		stringbuilder = new StringBuilder();
		stringbuilder.append(((String) (obj1)));
		stringbuilder.append(((Object) (stacktraceelementproxy)));
		outputstream.write(stringbuilder.toString().getBytes());
		outputstream.flush();
		i++;
		if(true) goto _L4; else goto _L3
_L4:
		break MISSING_BLOCK_LABEL_70;
_L3:
		obj = ((Object) (((IThrowableProxy) (obj)).getCause()));
		flag = false;
		  goto _L5
_L2:
	}

	public void setStackTracePattern(String s)
	{
		stackTracePattern = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String stackTracePattern>
	//    3    5:return          
	}

	public void setThrowableExcluded(boolean flag)
	{
		throwableExcluded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean throwableExcluded>
	//    3    5:return          
	}

	boolean stackTraceHeaderLine(StringBuilder stringbuilder, boolean flag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void start()
	{
		super.start();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method void SyslogAppenderBase.start()>
		setupStackTraceLayout();
	//    2    4:aload_0         
	//    3    5:invokespecial   #168 <Method void setupStackTraceLayout()>
	//    4    8:return          
	}

	public static final String DEFAULT_STACKTRACE_PATTERN = "\t";
	public static final String DEFAULT_SUFFIX_PATTERN = "[%thread] %logger %msg";
	PatternLayout stackTraceLayout;
	String stackTracePattern;
	boolean throwableExcluded;
}
