// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.picasso;

import android.content.*;
import android.database.Cursor;
import android.net.Uri;

public final class PicassoProvider extends ContentProvider
{

	public PicassoProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ContentProvider()>
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
		a = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Context getContext()>
	//    2    4:putstatic       #28  <Field Context a>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
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

	static Context a;
}
