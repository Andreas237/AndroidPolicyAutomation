// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.net.SyslogAppenderBase;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter

public class SyslogStartConverter extends ClassicConverter
{

	public SyslogStartConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ClassicConverter()>
		lastTimestamp = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #18  <Long -1L>
	//    4    8:putfield        #21  <Field long lastTimestamp>
		timesmapStr = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #23  <Field String timesmapStr>
	//    8   16:aload_0         
	//    9   17:ldc1            #25  <String "localhost">
	//   10   19:putfield        #27  <Field String localHostName>
	//   11   22:return          
	}

	String computeTimeStampString(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s;
		if(l != lastTimestamp)
	//*   2    2:lload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #21  <Field long lastTimestamp>
	//*   5    7:lcmp            
	//*   6    8:ifeq            35
		{
			lastTimestamp = l;
	//    7   11:aload_0         
	//    8   12:lload_1         
	//    9   13:putfield        #21  <Field long lastTimestamp>
			timesmapStr = simpleFormat.format(new Date(l));
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #32  <Field SimpleDateFormat simpleFormat>
	//   13   21:new             #34  <Class Date>
	//   14   24:dup             
	//   15   25:lload_1         
	//   16   26:invokespecial   #37  <Method void Date(long)>
	//   17   29:invokevirtual   #43  <Method String SimpleDateFormat.format(Date)>
	//   18   32:putfield        #23  <Field String timesmapStr>
		}
		s = timesmapStr;
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field String timesmapStr>
	//   21   39:astore_3        
		this;
	//   22   40:aload_0         
		JVM INSTR monitorexit ;
	//   23   41:monitorexit     
		return s;
	//   24   42:aload_3         
	//   25   43:areturn         
		Exception exception;
		exception;
	//   26   44:astore_3        
		this;
	//   27   45:aload_0         
		JVM INSTR monitorexit ;
	//   28   46:monitorexit     
		throw exception;
	//   29   47:aload_3         
	//   30   48:athrow          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:astore          4
		int i = facility;
	//    4    9:aload_0         
	//    5   10:getfield        #50  <Field int facility>
	//    6   13:istore_2        
		int j = LevelToSyslogSeverity.convert(iloggingevent);
	//    7   14:aload_1         
	//    8   15:invokestatic    #55  <Method int LevelToSyslogSeverity.convert(ILoggingEvent)>
	//    9   18:istore_3        
		stringbuilder.append("<");
	//   10   19:aload           4
	//   11   21:ldc1            #57  <String "<">
	//   12   23:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(i + j);
	//   14   27:aload           4
	//   15   29:iload_2         
	//   16   30:iload_3         
	//   17   31:iadd            
	//   18   32:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//   19   35:pop             
		stringbuilder.append(">");
	//   20   36:aload           4
	//   21   38:ldc1            #66  <String ">">
	//   22   40:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(computeTimeStampString(iloggingevent.getTimeStamp()));
	//   24   44:aload           4
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:invokeinterface #72  <Method long ILoggingEvent.getTimeStamp()>
	//   28   53:invokevirtual   #74  <Method String computeTimeStampString(long)>
	//   29   56:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
		stringbuilder.append(' ');
	//   31   60:aload           4
	//   32   62:bipush          32
	//   33   64:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   34   67:pop             
		stringbuilder.append("localhost");
	//   35   68:aload           4
	//   36   70:ldc1            #25  <String "localhost">
	//   37   72:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   38   75:pop             
		stringbuilder.append(' ');
	//   39   76:aload           4
	//   40   78:bipush          32
	//   41   80:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   42   83:pop             
		return stringbuilder.toString();
	//   43   84:aload           4
	//   44   86:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   45   89:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #68  <Class ILoggingEvent>
	//    3    5:invokevirtual   #84  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	public void start()
	{
		String s = getFirstOption();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method String getFirstOption()>
	//    2    4:astore_2        
		if(s == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       16
		{
			addError("was expecting a facility string as an option");
	//    5    9:aload_0         
	//    6   10:ldc1            #92  <String "was expecting a facility string as an option">
	//    7   12:invokevirtual   #96  <Method void addError(String)>
			return;
	//    8   15:return          
		}
		facility = SyslogAppenderBase.facilityStringToint(s);
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:invokestatic    #102 <Method int SyslogAppenderBase.facilityStringToint(String)>
	//   12   21:putfield        #50  <Field int facility>
		simpleFormat = new SimpleDateFormat("MMM dd HH:mm:ss", new DateFormatSymbols(Locale.US));
	//   13   24:aload_0         
	//   14   25:new             #39  <Class SimpleDateFormat>
	//   15   28:dup             
	//   16   29:ldc1            #104 <String "MMM dd HH:mm:ss">
	//   17   31:new             #106 <Class DateFormatSymbols>
	//   18   34:dup             
	//   19   35:getstatic       #112 <Field Locale Locale.US>
	//   20   38:invokespecial   #115 <Method void DateFormatSymbols(Locale)>
	//   21   41:invokespecial   #118 <Method void SimpleDateFormat(String, DateFormatSymbols)>
	//   22   44:putfield        #32  <Field SimpleDateFormat simpleFormat>
		boolean flag;
		flag = false;
	//   23   47:iconst_0        
	//   24   48:istore_1        
		break MISSING_BLOCK_LABEL_62;
	//   25   49:goto            62
		IllegalArgumentException illegalargumentexception;
		illegalargumentexception;
	//   26   52:astore_2        
		addError("Could not instantiate SimpleDateFormat", ((Throwable) (illegalargumentexception)));
	//   27   53:aload_0         
	//   28   54:ldc1            #120 <String "Could not instantiate SimpleDateFormat">
	//   29   56:aload_2         
	//   30   57:invokevirtual   #123 <Method void addError(String, Throwable)>
		flag = true;
	//   31   60:iconst_1        
	//   32   61:istore_1        
		if(!flag)
	//*  33   62:iload_1         
	//*  34   63:ifne            70
			super.start();
	//   35   66:aload_0         
	//   36   67:invokespecial   #125 <Method void ClassicConverter.start()>
		return;
	//   37   70:return          
	}

	int facility;
	long lastTimestamp;
	final String localHostName = "localhost";
	SimpleDateFormat simpleFormat;
	String timesmapStr;
}
