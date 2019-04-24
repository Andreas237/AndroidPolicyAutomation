// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzft

public class zzcw
{

	public zzcw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static void zzdu(String s)
	{
		com/google/android/gms/tagmanager/zzcw;
	//    0    0:ldc1            #2   <Class zzcw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzbcw = s;
	//    2    3:aload_0         
	//    3    4:putstatic       #26  <Field String zzbcw>
		com/google/android/gms/tagmanager/zzcw;
	//    4    7:ldc1            #2   <Class zzcw>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		s;
	//    7   11:astore_0        
		com/google/android/gms/tagmanager/zzcw;
	//    8   12:ldc1            #2   <Class zzcw>
		JVM INSTR monitorexit ;
	//    9   14:monitorexit     
		throw s;
	//   10   15:aload_0         
	//   11   16:athrow          
	}

	static void zzf(Context context, String s)
	{
		zzft.zza(context, "gtm_install_referrer", "referrer", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "gtm_install_referrer">
	//    2    3:ldc1            #32  <String "referrer">
	//    3    5:aload_1         
	//    4    6:invokestatic    #38  <Method void zzft.zza(Context, String, String, String)>
		zzh(context, s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #41  <Method void zzh(Context, String)>
	//    8   14:return          
	}

	public static String zzg(Context context, String s)
	{
		if(zzbcw != null) goto _L2; else goto _L1
	//    0    0:getstatic       #26  <Field String zzbcw>
	//    1    3:ifnonnull       57
_L1:
		com/google/android/gms/tagmanager/zzcw;
	//    2    6:ldc1            #2   <Class zzcw>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(zzbcw != null) goto _L4; else goto _L3
	//    4    9:getstatic       #26  <Field String zzbcw>
	//    5   12:ifnonnull       45
_L3:
		context = ((Context) (context.getSharedPreferences("gtm_install_referrer", 0)));
	//    6   15:aload_0         
	//    7   16:ldc1            #30  <String "gtm_install_referrer">
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #49  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   10   22:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_65;
	//   11   23:aload_0         
	//   12   24:ifnull          65
		context = ((Context) (((SharedPreferences) (context)).getString("referrer", "")));
	//   13   27:aload_0         
	//   14   28:ldc1            #32  <String "referrer">
	//   15   30:ldc1            #51  <String "">
	//   16   32:invokeinterface #57  <Method String SharedPreferences.getString(String, String)>
	//   17   37:astore_0        
_L5:
		zzbcw = ((String) (context));
	//   18   38:aload_0         
	//   19   39:putstatic       #26  <Field String zzbcw>
	//*  20   42:goto            45
_L4:
		com/google/android/gms/tagmanager/zzcw;
	//   21   45:ldc1            #2   <Class zzcw>
		JVM INSTR monitorexit ;
	//   22   47:monitorexit     
		  goto _L2
	//*  23   48:goto            57
		context;
	//   24   51:astore_0        
		com/google/android/gms/tagmanager/zzcw;
	//   25   52:ldc1            #2   <Class zzcw>
		JVM INSTR monitorexit ;
	//   26   54:monitorexit     
		throw context;
	//   27   55:aload_0         
	//   28   56:athrow          
_L2:
		return zzw(zzbcw, s);
	//   29   57:getstatic       #26  <Field String zzbcw>
	//   30   60:aload_1         
	//   31   61:invokestatic    #60  <Method String zzw(String, String)>
	//   32   64:areturn         
		context = "";
	//   33   65:ldc1            #51  <String "">
	//   34   67:astore_0        
		  goto _L5
	//*  35   68:goto            38
	}

	public static void zzh(Context context, String s)
	{
		String s1 = zzw(s, "conv");
	//    0    0:aload_1         
	//    1    1:ldc1            #62  <String "conv">
	//    2    3:invokestatic    #60  <Method String zzw(String, String)>
	//    3    6:astore_2        
		if(s1 != null && s1.length() > 0)
	//*   4    7:aload_2         
	//*   5    8:ifnull          37
	//*   6   11:aload_2         
	//*   7   12:invokevirtual   #68  <Method int String.length()>
	//*   8   15:ifle            37
		{
			zzbcx.put(((Object) (s1)), ((Object) (s)));
	//    9   18:getstatic       #20  <Field Map zzbcx>
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   13   28:pop             
			zzft.zza(context, "gtm_click_referrers", s1, s);
	//   14   29:aload_0         
	//   15   30:ldc1            #76  <String "gtm_click_referrers">
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokestatic    #38  <Method void zzft.zza(Context, String, String, String)>
		}
	//   19   37:return          
	}

	public static String zzw(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			if(s.length() > 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #68  <Method int String.length()>
	//*   4    8:ifle            13
				return s;
	//    5   11:aload_0         
	//    6   12:areturn         
			else
				return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		s = String.valueOf(((Object) (s)));
	//    9   15:aload_0         
	//   10   16:invokestatic    #80  <Method String String.valueOf(Object)>
	//   11   19:astore_0        
		if(s.length() != 0)
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #68  <Method int String.length()>
	//*  14   24:ifeq            37
			s = "http://hostname/?".concat(s);
	//   15   27:ldc1            #82  <String "http://hostname/?">
	//   16   29:aload_0         
	//   17   30:invokevirtual   #86  <Method String String.concat(String)>
	//   18   33:astore_0        
		else
	//*  19   34:goto            47
			s = new String("http://hostname/?");
	//   20   37:new             #64  <Class String>
	//   21   40:dup             
	//   22   41:ldc1            #82  <String "http://hostname/?">
	//   23   43:invokespecial   #88  <Method void String(String)>
	//   24   46:astore_0        
		return Uri.parse(s).getQueryParameter(s1);
	//   25   47:aload_0         
	//   26   48:invokestatic    #94  <Method Uri Uri.parse(String)>
	//   27   51:aload_1         
	//   28   52:invokevirtual   #97  <Method String Uri.getQueryParameter(String)>
	//   29   55:areturn         
	}

	private static String zzbcw;
	static Map zzbcx = new HashMap();

	static 
	{
	//    0    0:new             #15  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void HashMap()>
	//    3    7:putstatic       #20  <Field Map zzbcx>
	//*   4   10:return          
	}
}
