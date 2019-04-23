// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package android.arch.lifecycle:
//			LifecycleDispatcher, ProcessLifecycleOwner

public class ProcessLifecycleOwnerInitializer extends ContentProvider
{

	public ProcessLifecycleOwnerInitializer()
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
		LifecycleDispatcher.init(getContext());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method android.content.Context getContext()>
	//    2    4:invokestatic    #35  <Method void LifecycleDispatcher.init(android.content.Context)>
		ProcessLifecycleOwner.init(getContext());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #29  <Method android.content.Context getContext()>
	//    5   11:invokestatic    #38  <Method void ProcessLifecycleOwner.init(android.content.Context)>
		return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
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
