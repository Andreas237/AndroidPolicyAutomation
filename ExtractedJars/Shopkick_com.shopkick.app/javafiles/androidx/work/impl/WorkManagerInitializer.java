// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.work.WorkManager;

public class WorkManagerInitializer extends ContentProvider
{

	public WorkManagerInitializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ContentProvider()>
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
		WorkManager.initialize(getContext(), (new androidx.work.Configuration.Builder()).build());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method android.content.Context getContext()>
	//    2    4:new             #31  <Class androidx.work.Configuration$Builder>
	//    3    7:dup             
	//    4    8:invokespecial   #32  <Method void androidx.work.Configuration$Builder()>
	//    5   11:invokevirtual   #36  <Method androidx.work.Configuration androidx.work.Configuration$Builder.build()>
	//    6   14:invokestatic    #42  <Method void WorkManager.initialize(android.content.Context, androidx.work.Configuration)>
		return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
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
