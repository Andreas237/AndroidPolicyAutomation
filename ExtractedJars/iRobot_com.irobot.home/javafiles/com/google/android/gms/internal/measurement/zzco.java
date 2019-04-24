// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzby, zzcp, zzat, zzcf, 
//			zzcg

public final class zzco
{

	public static Logger getLogger()
	{
		return zzabg;
	//    0    0:getstatic       #17  <Field Logger zzabg>
	//    1    3:areturn         
	}

	private static boolean isLoggable(int i)
	{
		return zzabg != null && zzabg.getLogLevel() <= i;
	//    0    0:getstatic       #17  <Field Logger zzabg>
	//    1    3:ifnull          20
	//    2    6:getstatic       #17  <Field Logger zzabg>
	//    3    9:invokeinterface #29  <Method int Logger.getLogLevel()>
	//    4   14:iload_0         
	//    5   15:icmpgt          20
	//    6   18:iconst_1        
	//    7   19:ireturn         
	//    8   20:iconst_0        
	//    9   21:ireturn         
	}

	public static void setLogger(Logger logger)
	{
		zzabg = logger;
	//    0    0:aload_0         
	//    1    1:putstatic       #17  <Field Logger zzabg>
	//    2    4:return          
	}

	public static void v(String s)
	{
		Object obj = ((Object) (zzcp.zzex()));
	//    0    0:invokestatic    #42  <Method zzcp zzcp.zzex()>
	//    1    3:astore_1        
		if(obj != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          16
			((zzat) (obj)).zzq(s);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #47  <Method void zzat.zzq(String)>
		else
	//*   7   13:goto            37
		if(isLoggable(0))
	//*   8   16:iconst_0        
	//*   9   17:invokestatic    #49  <Method boolean isLoggable(int)>
	//*  10   20:ifeq            37
			Log.v((String)zzcf.zzyx.get(), s);
	//   11   23:getstatic       #55  <Field zzcg zzcf.zzyx>
	//   12   26:invokevirtual   #61  <Method Object zzcg.get()>
	//   13   29:checkcast       #63  <Class String>
	//   14   32:aload_0         
	//   15   33:invokestatic    #68  <Method int Log.v(String, String)>
	//   16   36:pop             
		obj = ((Object) (zzabg));
	//   17   37:getstatic       #17  <Field Logger zzabg>
	//   18   40:astore_1        
		if(obj != null)
	//*  19   41:aload_1         
	//*  20   42:ifnull          52
			((Logger) (obj)).verbose(s);
	//   21   45:aload_1         
	//   22   46:aload_0         
	//   23   47:invokeinterface #71  <Method void Logger.verbose(String)>
	//   24   52:return          
	}

	public static void zzab(String s)
	{
		Object obj = ((Object) (zzcp.zzex()));
	//    0    0:invokestatic    #42  <Method zzcp zzcp.zzex()>
	//    1    3:astore_1        
		if(obj != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          16
			((zzat) (obj)).zzt(s);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #75  <Method void zzat.zzt(String)>
		else
	//*   7   13:goto            37
		if(isLoggable(2))
	//*   8   16:iconst_2        
	//*   9   17:invokestatic    #49  <Method boolean isLoggable(int)>
	//*  10   20:ifeq            37
			Log.w((String)zzcf.zzyx.get(), s);
	//   11   23:getstatic       #55  <Field zzcg zzcf.zzyx>
	//   12   26:invokevirtual   #61  <Method Object zzcg.get()>
	//   13   29:checkcast       #63  <Class String>
	//   14   32:aload_0         
	//   15   33:invokestatic    #78  <Method int Log.w(String, String)>
	//   16   36:pop             
		obj = ((Object) (zzabg));
	//   17   37:getstatic       #17  <Field Logger zzabg>
	//   18   40:astore_1        
		if(obj != null)
	//*  19   41:aload_1         
	//*  20   42:ifnull          52
			((Logger) (obj)).warn(s);
	//   21   45:aload_1         
	//   22   46:aload_0         
	//   23   47:invokeinterface #81  <Method void Logger.warn(String)>
	//   24   52:return          
	}

	public static void zzf(String s, Object obj)
	{
		zzcp zzcp1 = zzcp.zzex();
	//    0    0:invokestatic    #42  <Method zzcp zzcp.zzex()>
	//    1    3:astore_2        
		if(zzcp1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          17
			((zzat) (zzcp1)).zze(s, obj);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #86  <Method void zzat.zze(String, Object)>
		else
	//*   8   14:goto            101
		if(isLoggable(3))
	//*   9   17:iconst_3        
	//*  10   18:invokestatic    #49  <Method boolean isLoggable(int)>
	//*  11   21:ifeq            101
		{
			if(obj != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          85
			{
				obj = ((Object) (String.valueOf(obj)));
	//   14   28:aload_1         
	//   15   29:invokestatic    #90  <Method String String.valueOf(Object)>
	//   16   32:astore_1        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(obj).length());
	//   17   33:new             #92  <Class StringBuilder>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokestatic    #90  <Method String String.valueOf(Object)>
	//   21   41:invokevirtual   #95  <Method int String.length()>
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:aload_1         
	//   25   47:invokestatic    #90  <Method String String.valueOf(Object)>
	//   26   50:invokevirtual   #95  <Method int String.length()>
	//   27   53:iadd            
	//   28   54:invokespecial   #98  <Method void StringBuilder(int)>
	//   29   57:astore_2        
				stringbuilder.append(s);
	//   30   58:aload_2         
	//   31   59:aload_0         
	//   32   60:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
				stringbuilder.append(":");
	//   34   64:aload_2         
	//   35   65:ldc1            #104 <String ":">
	//   36   67:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   37   70:pop             
				stringbuilder.append(((String) (obj)));
	//   38   71:aload_2         
	//   39   72:aload_1         
	//   40   73:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   41   76:pop             
				obj = ((Object) (stringbuilder.toString()));
	//   42   77:aload_2         
	//   43   78:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   44   81:astore_1        
			} else
	//*  45   82:goto            87
			{
				obj = ((Object) (s));
	//   46   85:aload_0         
	//   47   86:astore_1        
			}
			Log.e((String)zzcf.zzyx.get(), ((String) (obj)));
	//   48   87:getstatic       #55  <Field zzcg zzcf.zzyx>
	//   49   90:invokevirtual   #61  <Method Object zzcg.get()>
	//   50   93:checkcast       #63  <Class String>
	//   51   96:aload_1         
	//   52   97:invokestatic    #111 <Method int Log.e(String, String)>
	//   53  100:pop             
		}
		obj = ((Object) (zzabg));
	//   54  101:getstatic       #17  <Field Logger zzabg>
	//   55  104:astore_1        
		if(obj != null)
	//*  56  105:aload_1         
	//*  57  106:ifnull          116
			((Logger) (obj)).error(s);
	//   58  109:aload_1         
	//   59  110:aload_0         
	//   60  111:invokeinterface #114 <Method void Logger.error(String)>
	//   61  116:return          
	}

	private static volatile Logger zzabg = new zzby();

	static 
	{
	//    0    0:new             #12  <Class zzby>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void zzby()>
	//    3    7:putstatic       #17  <Field Logger zzabg>
	//*   4   10:return          
	}
}
