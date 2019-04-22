// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.internal:
//			DeviceShareDialogFragment

static final class DeviceShareDialogFragment$RequestState$1
	implements android.os.Parcelable.Creator
{

	public DeviceShareDialogFragment.RequestState createFromParcel(Parcel parcel)
	{
		return new DeviceShareDialogFragment.RequestState(parcel);
	//    0    0:new             #9   <Class DeviceShareDialogFragment$RequestState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #22  <Method void DeviceShareDialogFragment$RequestState(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method DeviceShareDialogFragment$RequestState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public DeviceShareDialogFragment.RequestState[] newArray(int i)
	{
		return new DeviceShareDialogFragment.RequestState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       DeviceShareDialogFragment.RequestState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method DeviceShareDialogFragment$RequestState[] newArray(int)>
	//    3    5:areturn         
	}

	DeviceShareDialogFragment$RequestState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
