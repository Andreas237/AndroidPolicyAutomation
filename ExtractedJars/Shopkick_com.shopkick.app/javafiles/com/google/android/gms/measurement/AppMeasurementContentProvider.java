// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.content.*;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.measurement.internal.zzbw;

public class AppMeasurementContentProvider extends ContentProvider
{

	public AppMeasurementContentProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void ContentProvider()>
	//    2    4:return          
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		super.attachInfo(context, providerinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
		if(!"com.google.android.gms.measurement.google_measurement_service".equals(((Object) (providerinfo.authority))))
	//*   4    6:ldc1            #16  <String "com.google.android.gms.measurement.google_measurement_service">
	//*   5    8:aload_2         
	//*   6    9:getfield        #22  <Field String ProviderInfo.authority>
	//*   7   12:invokevirtual   #28  <Method boolean String.equals(Object)>
	//*   8   15:ifne            19
			return;
	//    9   18:return          
		else
			throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
	//   10   19:new             #30  <Class IllegalStateException>
	//   11   22:dup             
	//   12   23:ldc1            #32  <String "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.">
	//   13   25:invokespecial   #35  <Method void IllegalStateException(String)>
	//   14   28:athrow          
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
		zzbw.zza(getContext(), ((com.google.android.gms.measurement.internal.zzan) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Context getContext()>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #53  <Method zzbw zzbw.zza(Context, com.google.android.gms.measurement.internal.zzan)>
	//    4    8:pop             
		return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
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
}
