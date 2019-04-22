// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.Context;
import bo.app.cd;
import bo.app.x;

// Referenced classes of package com.appboy:
//			Appboy

public class AppboyInternal
{

	public AppboyInternal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void addSerializedContentCardToStorage(Context context, String s, String s1)
	{
		Appboy.getInstance(context).a(s, s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Appboy Appboy.getInstance(Context)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #21  <Method void Appboy.a(String, String)>
	//    5    9:return          
	}

	public static void recordGeofenceTransition(Context context, String s, x x)
	{
		Appboy.getInstance(context).a(s, x);
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Appboy Appboy.getInstance(Context)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #26  <Method void Appboy.a(String, x)>
	//    5    9:return          
	}

	public static void requestGeofenceRefresh(Context context, cd cd)
	{
		Appboy.getInstance(context).a(cd);
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Appboy Appboy.getInstance(Context)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method void Appboy.a(cd)>
	//    4    8:return          
	}

	public static void requestGeofenceRefresh(Context context, boolean flag)
	{
		Appboy.getInstance(context).a(flag);
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Appboy Appboy.getInstance(Context)>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #35  <Method void Appboy.a(boolean)>
	//    4    8:return          
	}

	public static void requestGeofencesInitialization(Context context)
	{
		Appboy.getInstance(context).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method Appboy Appboy.getInstance(Context)>
	//    2    4:invokevirtual   #39  <Method void Appboy.a()>
	//    3    7:return          
	}
}
