// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;

// Referenced classes of package com.irobot.home.model:
//			MaintenanceInfo

static final class MaintenanceInfo$1
	implements android.os.
{

	public MaintenanceInfo a(Parcel parcel)
	{
		return new MaintenanceInfo(parcel);
	//    0    0:new             #9   <Class MaintenanceInfo>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void MaintenanceInfo(Parcel)>
	//    4    8:areturn         
	}

	public MaintenanceInfo[] a(int i)
	{
		return new MaintenanceInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       MaintenanceInfo[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method MaintenanceInfo a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method MaintenanceInfo[] a(int)>
	//    3    5:areturn         
	}

	MaintenanceInfo$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
