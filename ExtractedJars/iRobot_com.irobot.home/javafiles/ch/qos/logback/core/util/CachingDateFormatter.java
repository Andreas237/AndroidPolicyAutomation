// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.text.SimpleDateFormat;
import java.util.*;

public class CachingDateFormatter
{

	public CachingDateFormatter(String s)
	{
		this(s, Locale.US);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #18  <Field Locale Locale.US>
	//    3    5:invokespecial   #21  <Method void CachingDateFormatter(String, Locale)>
	//    4    8:return          
	}

	public CachingDateFormatter(String s, Locale locale)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		lastTimestamp = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #26  <Long -1L>
	//    4    8:putfield        #29  <Field long lastTimestamp>
		cachedStr = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #31  <Field String cachedStr>
		sdf = new SimpleDateFormat(s, locale);
	//    8   16:aload_0         
	//    9   17:new             #33  <Class SimpleDateFormat>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #34  <Method void SimpleDateFormat(String, Locale)>
	//   14   26:putfield        #36  <Field SimpleDateFormat sdf>
	//   15   29:return          
	}

	public final String format(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s;
		if(l != lastTimestamp)
	//*   2    2:lload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #29  <Field long lastTimestamp>
	//*   5    7:lcmp            
	//*   6    8:ifeq            35
		{
			lastTimestamp = l;
	//    7   11:aload_0         
	//    8   12:lload_1         
	//    9   13:putfield        #29  <Field long lastTimestamp>
			cachedStr = sdf.format(new Date(l));
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:getfield        #36  <Field SimpleDateFormat sdf>
	//   13   21:new             #40  <Class Date>
	//   14   24:dup             
	//   15   25:lload_1         
	//   16   26:invokespecial   #43  <Method void Date(long)>
	//   17   29:invokevirtual   #46  <Method String SimpleDateFormat.format(Date)>
	//   18   32:putfield        #31  <Field String cachedStr>
		}
		s = cachedStr;
	//   19   35:aload_0         
	//   20   36:getfield        #31  <Field String cachedStr>
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

	public void setTimeZone(TimeZone timezone)
	{
		sdf.setTimeZone(timezone);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SimpleDateFormat sdf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #50  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
	//    4    8:return          
	}

	String cachedStr;
	long lastTimestamp;
	final SimpleDateFormat sdf;
}
