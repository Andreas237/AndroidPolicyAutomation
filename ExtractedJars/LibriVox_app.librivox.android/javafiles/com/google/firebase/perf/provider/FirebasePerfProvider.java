// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.internal.firebase-perf.x;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.a;
import com.google.firebase.perf.internal.zzt;
import com.google.firebase.perf.metrics.AppStartTrace;

public class FirebasePerfProvider extends ContentProvider
{

	public FirebasePerfProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void ContentProvider()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #31  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #34  <Method void Handler(Looper)>
	//    7   15:putfield        #36  <Field Handler mHandler>
	//    8   18:return          
	}

	public static zzbg zzda()
	{
		return zzhm;
	//    0    0:getstatic       #21  <Field zzbg zzhm>
	//    1    3:areturn         
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		am.a(((Object) (providerinfo)), "FirebasePerfProvider ProviderInfo cannot be null.");
	//    0    0:aload_2         
	//    1    1:ldc1            #42  <String "FirebasePerfProvider ProviderInfo cannot be null.">
	//    2    3:invokestatic    #48  <Method Object am.a(Object, Object)>
	//    3    6:pop             
		if(!"com.google.firebase.firebaseperfprovider".equals(((Object) (providerinfo.authority))))
	//*   4    7:ldc1            #50  <String "com.google.firebase.firebaseperfprovider">
	//*   5    9:aload_2         
	//*   6   10:getfield        #56  <Field String ProviderInfo.authority>
	//*   7   13:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*   8   16:ifne            73
		{
			super.attachInfo(context, providerinfo);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokespecial   #64  <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
			a.a().a(getContext());
	//   13   25:invokestatic    #69  <Method a a.a()>
	//   14   28:aload_0         
	//   15   29:invokevirtual   #73  <Method Context getContext()>
	//   16   32:invokevirtual   #76  <Method void a.a(Context)>
			context = ((Context) (AppStartTrace.a()));
	//   17   35:invokestatic    #81  <Method AppStartTrace AppStartTrace.a()>
	//   18   38:astore_1        
			((AppStartTrace) (context)).a(getContext());
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:invokevirtual   #73  <Method Context getContext()>
	//   22   44:invokevirtual   #82  <Method void AppStartTrace.a(Context)>
			mHandler.post(((Runnable) (new com.google.firebase.perf.metrics.a(((AppStartTrace) (context))))));
	//   23   47:aload_0         
	//   24   48:getfield        #36  <Field Handler mHandler>
	//   25   51:new             #84  <Class com.google.firebase.perf.metrics.a>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:invokespecial   #87  <Method void com.google.firebase.perf.metrics.a(AppStartTrace)>
	//   29   59:invokevirtual   #91  <Method boolean Handler.post(Runnable)>
	//   30   62:pop             
			if(zzt.f())
	//*  31   63:invokestatic    #97  <Method boolean zzt.f()>
	//*  32   66:ifeq            72
				GaugeManager.zzbi();
	//   33   69:invokestatic    #102 <Method void GaugeManager.zzbi()>
			return;
	//   34   72:return          
		} else
		{
			throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
	//   35   73:new             #104 <Class IllegalStateException>
	//   36   76:dup             
	//   37   77:ldc1            #106 <String "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.">
	//   38   79:invokespecial   #109 <Method void IllegalStateException(String)>
	//   39   82:athrow          
		}
	}

	public int delete(Uri uri, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getType(Uri uri)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean onCreate()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final zzbg zzhm = new zzbg();
	private final Handler mHandler = new Handler(Looper.getMainLooper());

	static 
	{
		new x();
	//    0    0:new             #13  <Class x>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void x()>
	//    3    7:pop             
	//    4    8:new             #18  <Class zzbg>
	//    5   11:dup             
	//    6   12:invokespecial   #19  <Method void zzbg()>
	//    7   15:putstatic       #21  <Field zzbg zzhm>
	//*   8   18:return          
	}
}
