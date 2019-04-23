// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.support.v4.content.PermissionChecker;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzsb, zzru, zzsg, zzsf, 
//			zzsc

final class zzse
	implements zzsb
{

	private zzse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzri = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field Context zzri>
	//    5    9:return          
	}

	private zzse(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzri = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Context zzri>
		zzri.getContentResolver().registerContentObserver(zzru.CONTENT_URI, true, ((android.database.ContentObserver) (new zzsg(this, ((android.os.Handler) (null))))));
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field Context zzri>
	//    7   13:invokevirtual   #27  <Method ContentResolver Context.getContentResolver()>
	//    8   16:getstatic       #33  <Field android.net.Uri zzru.CONTENT_URI>
	//    9   19:iconst_1        
	//   10   20:new             #35  <Class zzsg>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:invokespecial   #38  <Method void zzsg(zzse, android.os.Handler)>
	//   15   29:invokevirtual   #44  <Method void ContentResolver.registerContentObserver(android.net.Uri, boolean, android.database.ContentObserver)>
	//   16   32:return          
	}

	static zzse zzad(Context context)
	{
		com/google/android/gms/internal/measurement/zzse;
	//    0    0:ldc1            #2   <Class zzse>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzbrj != null)
			break MISSING_BLOCK_LABEL_51;
	//    2    3:getstatic       #48  <Field zzse zzbrj>
	//    3    6:ifnonnull       51
		boolean flag;
		if(PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0)
	//*   4    9:aload_0         
	//*   5   10:ldc1            #50  <String "com.google.android.providers.gsf.permission.READ_GSERVICES">
	//*   6   12:invokestatic    #56  <Method int PermissionChecker.checkSelfPermission(Context, String)>
	//*   7   15:ifne            66
			flag = true;
	//    8   18:iconst_1        
	//    9   19:istore_1        
		else
	//*  10   20:goto            23
	//*  11   23:iload_1         
	//*  12   24:ifeq            39
	//*  13   27:new             #2   <Class zzse>
	//*  14   30:dup             
	//*  15   31:aload_0         
	//*  16   32:invokespecial   #58  <Method void zzse(Context)>
	//*  17   35:astore_0        
	//*  18   36:goto            47
	//*  19   39:new             #2   <Class zzse>
	//*  20   42:dup             
	//*  21   43:invokespecial   #59  <Method void zzse()>
	//*  22   46:astore_0        
	//*  23   47:aload_0         
	//*  24   48:putstatic       #48  <Field zzse zzbrj>
	//*  25   51:getstatic       #48  <Field zzse zzbrj>
	//*  26   54:astore_0        
	//*  27   55:ldc1            #2   <Class zzse>
	//*  28   57:monitorexit     
	//*  29   58:aload_0         
	//*  30   59:areturn         
	//*  31   60:astore_0        
	//*  32   61:ldc1            #2   <Class zzse>
	//*  33   63:monitorexit     
	//*  34   64:aload_0         
	//*  35   65:athrow          
			flag = false;
	//   36   66:iconst_0        
	//   37   67:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_39;
		context = ((Context) (new zzse(context)));
		break MISSING_BLOCK_LABEL_47;
		context = ((Context) (new zzse()));
		zzbrj = ((zzse) (context));
		context = ((Context) (zzbrj));
		com/google/android/gms/internal/measurement/zzse;
		JVM INSTR monitorexit ;
		return ((zzse) (context));
		context;
		com/google/android/gms/internal/measurement/zzse;
		JVM INSTR monitorexit ;
		throw context;
	//*  38   68:goto            23
	}

	private final String zzfo(String s)
	{
		if(zzri == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Context zzri>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		String s1;
		try
		{
			s1 = (String)zzsc.zza(((zzsd) (new zzsf(this, s))));
	//    5    9:new             #65  <Class zzsf>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #68  <Method void zzsf(zzse, String)>
	//   10   18:invokestatic    #74  <Method Object zzsc.zza(zzsd)>
	//   11   21:checkcast       #76  <Class String>
	//   12   24:astore_2        
		}
	//*  13   25:aload_2         
	//*  14   26:areturn         
		catch(SecurityException securityexception)
	//*  15   27:astore_2        
		{
			s = String.valueOf(((Object) (s)));
	//   16   28:aload_1         
	//   17   29:invokestatic    #80  <Method String String.valueOf(Object)>
	//   18   32:astore_1        
			if(s.length() != 0)
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #84  <Method int String.length()>
	//*  21   37:ifeq            50
				s = "Unable to read GServices for: ".concat(s);
	//   22   40:ldc1            #86  <String "Unable to read GServices for: ">
	//   23   42:aload_1         
	//   24   43:invokevirtual   #89  <Method String String.concat(String)>
	//   25   46:astore_1        
			else
	//*  26   47:goto            60
				s = new String("Unable to read GServices for: ");
	//   27   50:new             #76  <Class String>
	//   28   53:dup             
	//   29   54:ldc1            #86  <String "Unable to read GServices for: ">
	//   30   56:invokespecial   #92  <Method void String(String)>
	//   31   59:astore_1        
			Log.e("GservicesLoader", s, ((Throwable) (securityexception)));
	//   32   60:ldc1            #94  <String "GservicesLoader">
	//   33   62:aload_1         
	//   34   63:aload_2         
	//   35   64:invokestatic    #100 <Method int Log.e(String, String, Throwable)>
	//   36   67:pop             
			return null;
	//   37   68:aconst_null     
	//   38   69:areturn         
		}
		return s1;
	}

	public final Object zzfn(String s)
	{
		return ((Object) (zzfo(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method String zzfo(String)>
	//    3    5:areturn         
	}

	final String zzfp(String s)
	{
		return zzru.zza(zzri.getContentResolver(), s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context zzri>
	//    2    4:invokevirtual   #27  <Method ContentResolver Context.getContentResolver()>
	//    3    7:aload_1         
	//    4    8:aconst_null     
	//    5    9:invokestatic    #108 <Method String zzru.zza(ContentResolver, String, String)>
	//    6   12:areturn         
	}

	static zzse zzbrj;
	private final Context zzri;
}
