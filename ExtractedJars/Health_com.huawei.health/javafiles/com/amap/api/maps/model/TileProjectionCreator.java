// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			TileProjection

public class TileProjectionCreator
	implements android.os.Parcelable.Creator
{

	public TileProjectionCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public TileProjection createFromParcel(Parcel parcel)
	{
		return new TileProjection(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
	//    0    0:new             #16  <Class TileProjection>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method int Parcel.readInt()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #22  <Method int Parcel.readInt()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #22  <Method int Parcel.readInt()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #22  <Method int Parcel.readInt()>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #22  <Method int Parcel.readInt()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #22  <Method int Parcel.readInt()>
	//   14   28:invokespecial   #25  <Method void TileProjection(int, int, int, int, int, int)>
	//   15   31:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method TileProjection createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public TileProjection[] newArray(int i)
	{
		return new TileProjection[i];
	//    0    0:iload_1         
	//    1    1:anewarray       TileProjection[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #33  <Method TileProjection[] newArray(int)>
	//    3    5:areturn         
	}
}
