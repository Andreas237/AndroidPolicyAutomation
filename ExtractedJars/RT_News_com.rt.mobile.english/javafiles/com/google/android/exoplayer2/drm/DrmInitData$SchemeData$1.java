// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.drm;

import android.os.Parcel;

// Referenced classes of package com.google.android.exoplayer2.drm:
//			DrmInitData

static final class DrmInitData$SchemeData$1
	implements android.os.Parcelable.Creator
{

	public DrmInitData.SchemeData createFromParcel(Parcel parcel)
	{
		return new DrmInitData.SchemeData(parcel);
	//    0    0:new             #9   <Class DrmInitData$SchemeData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #22  <Method void DrmInitData$SchemeData(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method DrmInitData$SchemeData createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public DrmInitData.SchemeData[] newArray(int i)
	{
		return new DrmInitData.SchemeData[i];
	//    0    0:iload_1         
	//    1    1:anewarray       DrmInitData.SchemeData[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method DrmInitData$SchemeData[] newArray(int)>
	//    3    5:areturn         
	}

	DrmInitData$SchemeData$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
