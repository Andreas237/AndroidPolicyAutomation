// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.*;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.byv;

public class MobileAdsInitProvider extends ContentProvider
{

	public MobileAdsInitProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ContentProvider()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class byv>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void byv()>
	//    6   12:putfield        #15  <Field byv a>
	//    7   15:return          
	}

	public void attachInfo(Context context, ProviderInfo providerinfo)
	{
		a.attachInfo(context, providerinfo);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byv a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #20  <Method void byv.attachInfo(Context, ProviderInfo)>
	//    5    9:return          
	}

	public int delete(Uri uri, String s, String as[])
	{
		return a.delete(uri, s, as);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byv a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #24  <Method int byv.delete(Uri, String, String[])>
	//    6   10:ireturn         
	}

	public String getType(Uri uri)
	{
		return a.getType(uri);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byv a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method String byv.getType(Uri)>
	//    4    8:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		return a.insert(uri, contentvalues);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byv a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #32  <Method Uri byv.insert(Uri, ContentValues)>
	//    5    9:areturn         
	}

	public boolean onCreate()
	{
		return a.onCreate();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byv a>
	//    2    4:invokevirtual   #36  <Method boolean byv.onCreate()>
	//    3    7:ireturn         
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return a.query(uri, as, s, as1, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byv a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #40  <Method Cursor byv.query(Uri, String[], String, String[], String)>
	//    8   14:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return a.update(uri, contentvalues, s, as);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byv a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #44  <Method int byv.update(Uri, ContentValues, String, String[])>
	//    7   12:ireturn         
	}

	private final byv a = new byv();
}
