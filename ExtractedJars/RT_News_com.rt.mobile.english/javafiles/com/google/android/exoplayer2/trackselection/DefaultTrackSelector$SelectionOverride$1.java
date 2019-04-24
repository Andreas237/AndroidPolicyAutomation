// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			DefaultTrackSelector

static final class DefaultTrackSelector$SelectionOverride$1
	implements android.os.Parcelable.Creator
{

	public DefaultTrackSelector.SelectionOverride createFromParcel(Parcel parcel)
	{
		return new DefaultTrackSelector.SelectionOverride(parcel);
	//    0    0:new             #9   <Class DefaultTrackSelector$SelectionOverride>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #22  <Method void DefaultTrackSelector$SelectionOverride(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method DefaultTrackSelector$SelectionOverride createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public DefaultTrackSelector.SelectionOverride[] newArray(int i)
	{
		return new DefaultTrackSelector.SelectionOverride[i];
	//    0    0:iload_1         
	//    1    1:anewarray       DefaultTrackSelector.SelectionOverride[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method DefaultTrackSelector$SelectionOverride[] newArray(int)>
	//    3    5:areturn         
	}

	DefaultTrackSelector$SelectionOverride$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
