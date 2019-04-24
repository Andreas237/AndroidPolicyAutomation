// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			MiniInAppNotification

static final class MiniInAppNotification$1
	implements android.os.Parcelable.Creator
{

	public MiniInAppNotification a(Parcel parcel)
	{
		return new MiniInAppNotification(parcel);
	//    0    0:new             #9   <Class MiniInAppNotification>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void MiniInAppNotification(Parcel)>
	//    4    8:areturn         
	}

	public MiniInAppNotification[] a(int i)
	{
		return new MiniInAppNotification[i];
	//    0    0:iload_1         
	//    1    1:anewarray       MiniInAppNotification[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (a(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method MiniInAppNotification a(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method MiniInAppNotification[] a(int)>
	//    3    5:areturn         
	}

	MiniInAppNotification$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
