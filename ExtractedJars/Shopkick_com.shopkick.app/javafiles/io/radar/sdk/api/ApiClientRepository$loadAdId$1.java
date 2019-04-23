// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.content.SharedPreferences;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.radar.sdk.internal.RadarLogger;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.api:
//			ApiClientRepository

static final class ApiClientRepository$loadAdId$1
	implements Runnable
{

	public final void run()
	{
		Object obj;
		obj = ((Object) (AdvertisingIdClient.getAdvertisingIdInfo(ApiClientRepository.access$getContext$p(ApiClientRepository.this))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ApiClientRepository this$0>
	//    2    4:invokestatic    #40  <Method android.content.Context ApiClientRepository.access$getContext$p(ApiClientRepository)>
	//    3    7:invokestatic    #46  <Method com.google.android.gms.ads.identifier.AdvertisingIdClient$Info AdvertisingIdClient.getAdvertisingIdInfo(android.content.Context)>
	//    4   10:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(obj, "info");
	//    5   11:aload_1         
	//    6   12:ldc1            #48  <String "info">
	//    7   14:invokestatic    #54  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		if(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).isLimitAdTrackingEnabled())
	//*   8   17:aload_1         
	//*   9   18:invokevirtual   #60  <Method boolean com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//*  10   21:ifeq            30
		{
			obj = "OptedOut";
	//   11   24:ldc1            #62  <String "OptedOut">
	//   12   26:astore_1        
			break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		}
		obj = ((Object) (((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) (obj)).getId()));
	//   14   30:aload_1         
	//   15   31:invokevirtual   #66  <Method String com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.getId()>
	//   16   34:astore_1        
		android.content.SharedPreferences.Editor editor = ApiClientRepository.access$getSharedPreferences$p(ApiClientRepository.this).edit();
	//   17   35:aload_0         
	//   18   36:getfield        #31  <Field ApiClientRepository this$0>
	//   19   39:invokestatic    #70  <Method SharedPreferences ApiClientRepository.access$getSharedPreferences$p(ApiClientRepository)>
	//   20   42:invokeinterface #76  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   21   47:astore_2        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (editor)), "editor");
	//   22   48:aload_2         
	//   23   49:ldc1            #78  <String "editor">
	//   24   51:invokestatic    #54  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		editor.putString(getKEY_AD_ID$sdk_release(), ((String) (obj)));
	//   25   54:aload_2         
	//   26   55:aload_0         
	//   27   56:getfield        #31  <Field ApiClientRepository this$0>
	//   28   59:invokevirtual   #81  <Method String ApiClientRepository.getKEY_AD_ID$sdk_release()>
	//   29   62:aload_1         
	//   30   63:invokeinterface #87  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   31   68:pop             
		editor.apply();
	//   32   69:aload_2         
	//   33   70:invokeinterface #90  <Method void android.content.SharedPreferences$Editor.apply()>
		return;
	//   34   75:return          
		Exception exception;
		exception;
	//   35   76:astore_1        
		RadarLogger.INSTANCE.d("Error getting advertising ID", (Throwable)exception);
	//   36   77:getstatic       #96  <Field RadarLogger RadarLogger.INSTANCE>
	//   37   80:ldc1            #98  <String "Error getting advertising ID">
	//   38   82:aload_1         
	//   39   83:checkcast       #100 <Class Throwable>
	//   40   86:invokevirtual   #104 <Method void RadarLogger.d(String, Throwable)>
		return;
	//   41   89:return          
	}

	final ApiClientRepository this$0;

	ApiClientRepository$loadAdId$1(ApiClientRepository apiclientrepository)
	{
		this$0 = apiclientrepository;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field ApiClientRepository this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #33  <Method void Object()>
	//    5    9:return          
	}
}
