// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.util;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateUtils
{

	public static String a(String s, Date date)
	{
		return ((SimpleDateFormat)a(s).get()).format(date);
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method ThreadLocal a(String)>
	//    2    4:invokevirtual   #41  <Method Object ThreadLocal.get()>
	//    3    7:checkcast       #43  <Class SimpleDateFormat>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #47  <Method String SimpleDateFormat.format(Date)>
	//    6   14:areturn         
	}

	private static ThreadLocal a(String s)
	{
		Object obj;
		obj = ((Object) ((ThreadLocal)b.get(((Object) (s)))));
	//    0    0:getstatic       #30  <Field Map b>
	//    1    3:aload_0         
	//    2    4:invokeinterface #52  <Method Object Map.get(Object)>
	//    3    9:checkcast       #37  <Class ThreadLocal>
	//    4   12:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_71;
	//    5   13:aload_1         
	//    6   14:ifnonnull       71
		Map map = b;
	//    7   17:getstatic       #30  <Field Map b>
	//    8   20:astore_3        
		map;
	//    9   21:aload_3         
		JVM INSTR monitorenter ;
	//   10   22:monitorenter    
		ThreadLocal threadlocal = (ThreadLocal)b.get(((Object) (s)));
	//   11   23:getstatic       #30  <Field Map b>
	//   12   26:aload_0         
	//   13   27:invokeinterface #52  <Method Object Map.get(Object)>
	//   14   32:checkcast       #37  <Class ThreadLocal>
	//   15   35:astore_2        
		obj = ((Object) (threadlocal));
	//   16   36:aload_2         
	//   17   37:astore_1        
		if(threadlocal != null)
			break MISSING_BLOCK_LABEL_62;
	//   18   38:aload_2         
	//   19   39:ifnonnull       62
		obj = ((Object) (new ThreadLocal(s) {

			protected SimpleDateFormat a()
			{
				SimpleDateFormat simpledateformat = new SimpleDateFormat(a, Locale.US);
			//    0    0:new             #22  <Class SimpleDateFormat>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #15  <Field String a>
			//    4    8:getstatic       #28  <Field Locale Locale.US>
			//    5   11:invokespecial   #31  <Method void SimpleDateFormat(String, Locale)>
			//    6   14:astore_1        
				simpledateformat.setTimeZone(DateUtils.a());
			//    7   15:aload_1         
			//    8   16:invokestatic    #34  <Method TimeZone DateUtils.a()>
			//    9   19:invokevirtual   #38  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
				simpledateformat.setLenient(false);
			//   10   22:aload_1         
			//   11   23:iconst_0        
			//   12   24:invokevirtual   #42  <Method void SimpleDateFormat.setLenient(boolean)>
				return simpledateformat;
			//   13   27:aload_1         
			//   14   28:areturn         
			}

			protected Object initialValue()
			{
				return ((Object) (a()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #46  <Method SimpleDateFormat a()>
			//    2    4:areturn         
			}

			final String a;

			
			{
				a = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field String a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void ThreadLocal()>
			//    5    9:return          
			}
		}
));
	//   20   42:new             #6   <Class DateUtils$1>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:invokespecial   #55  <Method void DateUtils$1(String)>
	//   24   50:astore_1        
		b.put(((Object) (s)), obj);
	//   25   51:getstatic       #30  <Field Map b>
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokeinterface #59  <Method Object Map.put(Object, Object)>
	//   29   61:pop             
		map;
	//   30   62:aload_3         
		JVM INSTR monitorexit ;
	//   31   63:monitorexit     
		return ((ThreadLocal) (obj));
	//   32   64:aload_1         
	//   33   65:areturn         
		s;
	//   34   66:astore_0        
		map;
	//   35   67:aload_3         
		JVM INSTR monitorexit ;
	//   36   68:monitorexit     
		throw s;
	//   37   69:aload_0         
	//   38   70:athrow          
		return ((ThreadLocal) (obj));
	//   39   71:aload_1         
	//   40   72:areturn         
	}

	static TimeZone a()
	{
		return a;
	//    0    0:getstatic       #23  <Field TimeZone a>
	//    1    3:areturn         
	}

	private static final TimeZone a = TimeZone.getTimeZone("GMT");
	private static final Map b = new HashMap();

	static 
	{
	//    0    0:ldc1            #15  <String "GMT">
	//    1    2:invokestatic    #21  <Method TimeZone TimeZone.getTimeZone(String)>
	//    2    5:putstatic       #23  <Field TimeZone a>
	//    3    8:new             #25  <Class HashMap>
	//    4   11:dup             
	//    5   12:invokespecial   #28  <Method void HashMap()>
	//    6   15:putstatic       #30  <Field Map b>
	//*   7   18:return          
	}
}
