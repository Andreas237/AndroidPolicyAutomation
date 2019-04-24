// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			CameraPosition, LatLng

public class CameraPositionCreator
	implements android.os.Parcelable.Creator
{

	public CameraPositionCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public CameraPosition createFromParcel(Parcel parcel)
	{
		float f = parcel.readFloat();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method float Parcel.readFloat()>
	//    2    4:fstore_2        
		float f1 = parcel.readFloat();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method float Parcel.readFloat()>
	//    5    9:fstore_3        
		float f2 = parcel.readFloat();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #20  <Method float Parcel.readFloat()>
	//    8   14:fstore          4
		float f3 = parcel.readFloat();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #20  <Method float Parcel.readFloat()>
	//   11   20:fstore          5
		float f4 = parcel.readFloat();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #20  <Method float Parcel.readFloat()>
	//   14   26:fstore          6
		return new CameraPosition(new LatLng(f1, f2), f4, f3, f);
	//   15   28:new             #22  <Class CameraPosition>
	//   16   31:dup             
	//   17   32:new             #24  <Class LatLng>
	//   18   35:dup             
	//   19   36:fload_3         
	//   20   37:f2d             
	//   21   38:fload           4
	//   22   40:f2d             
	//   23   41:invokespecial   #27  <Method void LatLng(double, double)>
	//   24   44:fload           6
	//   25   46:fload           5
	//   26   48:fload_2         
	//   27   49:invokespecial   #30  <Method void CameraPosition(LatLng, float, float, float)>
	//   28   52:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #33  <Method CameraPosition createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public CameraPosition[] newArray(int i)
	{
		return new CameraPosition[i];
	//    0    0:iload_1         
	//    1    1:anewarray       CameraPosition[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #38  <Method CameraPosition[] newArray(int)>
	//    3    5:areturn         
	}
}
