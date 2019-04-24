// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;

// Referenced classes of package com.irobot.home.model:
//			Robot

static final class Robot$1
	implements android.os.le.Creator
{

	public Robot a(Parcel parcel)
	{
		return new Robot(parcel);
	//    0    0:new             #9   <Class Robot>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void Robot(Parcel)>
	//    4    8:areturn         
	}

	public Robot[] a(int i)
	{
		return new Robot[i];
	//    0    0:iload_1         
	//    1    1:anewarray       Robot[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method Robot a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method Robot[] a(int)>
	//    3    5:areturn         
	}

	Robot$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
