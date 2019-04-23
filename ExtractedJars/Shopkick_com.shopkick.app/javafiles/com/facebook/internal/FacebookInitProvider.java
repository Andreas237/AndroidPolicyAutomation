// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;

public final class FacebookInitProvider extends ContentProvider
{

	public FacebookInitProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ContentProvider()>
	//    2    4:return          
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
		try
		{
			FacebookSdk.sdkInitialize(getContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method android.content.Context getContext()>
	//    2    4:invokestatic    #34  <Method void FacebookSdk.sdkInitialize(android.content.Context)>
		}
	//*   3    7:goto            21
		catch(Exception exception)
	//*   4   10:astore_1        
		{
			Log.i(TAG, "Failed to auto initialize the Facebook SDK", ((Throwable) (exception)));
	//    5   11:getstatic       #36  <Field String TAG>
	//    6   14:ldc1            #38  <String "Failed to auto initialize the Facebook SDK">
	//    7   16:aload_1         
	//    8   17:invokestatic    #44  <Method int Log.i(String, String, Throwable)>
	//    9   20:pop             
		}
		return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
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

	private static final String TAG = "FacebookInitProvider";

	static 
	{
	//    0    0:return          
	}
}
