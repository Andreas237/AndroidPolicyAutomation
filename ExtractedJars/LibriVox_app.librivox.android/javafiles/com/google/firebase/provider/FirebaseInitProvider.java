// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.provider;

import android.content.*;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.am;
import com.google.firebase.FirebaseApp;

public class FirebaseInitProvider extends ContentProvider
{

	public FirebaseInitProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ContentProvider()>
	//    2    4:return          
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		am.a(((Object) (providerinfo)), "FirebaseInitProvider ProviderInfo cannot be null.");
	//    0    0:aload_2         
	//    1    1:ldc1            #13  <String "FirebaseInitProvider ProviderInfo cannot be null.">
	//    2    3:invokestatic    #19  <Method Object am.a(Object, Object)>
	//    3    6:pop             
		if(!"com.google.firebase.firebaseinitprovider".equals(((Object) (providerinfo.authority))))
	//*   4    7:ldc1            #21  <String "com.google.firebase.firebaseinitprovider">
	//*   5    9:aload_2         
	//*   6   10:getfield        #27  <Field String ProviderInfo.authority>
	//*   7   13:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*   8   16:ifne            26
		{
			super.attachInfo(context, providerinfo);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokespecial   #35  <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
			return;
	//   13   25:return          
		} else
		{
			throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
	//   14   26:new             #37  <Class IllegalStateException>
	//   15   29:dup             
	//   16   30:ldc1            #39  <String "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.">
	//   17   32:invokespecial   #42  <Method void IllegalStateException(String)>
	//   18   35:athrow          
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
		if(FirebaseApp.a(getContext()) == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #54  <Method Context getContext()>
	//*   2    4:invokestatic    #59  <Method FirebaseApp FirebaseApp.a(Context)>
	//*   3    7:ifnonnull       21
			Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
	//    4   10:ldc1            #61  <String "FirebaseInitProvider">
	//    5   12:ldc1            #63  <String "FirebaseApp initialization unsuccessful">
	//    6   14:invokestatic    #69  <Method int Log.i(String, String)>
	//    7   17:pop             
		else
	//*   8   18:goto            29
			Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
	//    9   21:ldc1            #61  <String "FirebaseInitProvider">
	//   10   23:ldc1            #71  <String "FirebaseApp initialization successful">
	//   11   25:invokestatic    #69  <Method int Log.i(String, String)>
	//   12   28:pop             
		return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
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
