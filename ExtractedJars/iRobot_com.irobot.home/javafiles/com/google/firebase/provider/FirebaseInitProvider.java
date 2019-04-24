// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.provider;

import android.content.*;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.b;

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
		Preconditions.checkNotNull(((Object) (providerinfo)), "FirebaseInitProvider ProviderInfo cannot be null.");
	//    0    0:aload_2         
	//    1    1:ldc1            #13  <String "FirebaseInitProvider ProviderInfo cannot be null.">
	//    2    3:invokestatic    #19  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		if("com.google.firebase.firebaseinitprovider".equals(((Object) (providerinfo.authority))))
	//*   4    7:ldc1            #21  <String "com.google.firebase.firebaseinitprovider">
	//*   5    9:aload_2         
	//*   6   10:getfield        #27  <Field String ProviderInfo.authority>
	//*   7   13:invokevirtual   #33  <Method boolean String.equals(Object)>
	//*   8   16:ifeq            29
		{
			throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
	//    9   19:new             #35  <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:ldc1            #37  <String "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.">
	//   12   25:invokespecial   #40  <Method void IllegalStateException(String)>
	//   13   28:athrow          
		} else
		{
			super.attachInfo(context, providerinfo);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:invokespecial   #42  <Method void ContentProvider.attachInfo(Context, ProviderInfo)>
			return;
	//   18   35:return          
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
		String s;
		if(b.a(getContext()) == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #54  <Method Context getContext()>
	//*   2    4:invokestatic    #60  <Method b b.a(Context)>
	//*   3    7:ifnonnull       23
			s = "FirebaseApp initialization unsuccessful";
	//    4   10:ldc1            #62  <String "FirebaseApp initialization unsuccessful">
	//    5   12:astore_1        
		else
	//*   6   13:ldc1            #64  <String "FirebaseInitProvider">
	//*   7   15:aload_1         
	//*   8   16:invokestatic    #70  <Method int Log.i(String, String)>
	//*   9   19:pop             
	//*  10   20:goto            29
			s = "FirebaseApp initialization successful";
	//   11   23:ldc1            #72  <String "FirebaseApp initialization successful">
	//   12   25:astore_1        
		Log.i("FirebaseInitProvider", s);
	//*  13   26:goto            13
		return false;
	//   14   29:iconst_0        
	//   15   30:ireturn         
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
