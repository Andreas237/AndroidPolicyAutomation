// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

public class TileProjection
	implements Parcelable
{

	public TileProjection(int i, int j, int k, int l, int i1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		offsetX = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int offsetX>
		offsetY = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field int offsetY>
		minX = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #32  <Field int minX>
		maxX = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #34  <Field int maxX>
		minY = i1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #36  <Field int minY>
		maxY = j1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #38  <Field int maxY>
	//   20   37:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(offsetX);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field int offsetX>
	//    3    5:invokevirtual   #48  <Method void Parcel.writeInt(int)>
		parcel.writeInt(offsetY);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field int offsetY>
	//    7   13:invokevirtual   #48  <Method void Parcel.writeInt(int)>
		parcel.writeInt(minX);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field int minX>
	//   11   21:invokevirtual   #48  <Method void Parcel.writeInt(int)>
		parcel.writeInt(maxX);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #34  <Field int maxX>
	//   15   29:invokevirtual   #48  <Method void Parcel.writeInt(int)>
		parcel.writeInt(maxX);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #34  <Field int maxX>
	//   19   37:invokevirtual   #48  <Method void Parcel.writeInt(int)>
		parcel.writeInt(maxY);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #38  <Field int maxY>
	//   23   45:invokevirtual   #48  <Method void Parcel.writeInt(int)>
	//   24   48:return          
	}

	public static final TileProjection CREATOR = new TileProjection(0, 0, 0, 0, 0, 0);
	public final int maxX;
	public final int maxY;
	public final int minX;
	public final int minY;
	public final int offsetX;
	public final int offsetY;

	static 
	{
	//    0    0:new             #2   <Class TileProjection>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:invokespecial   #21  <Method void TileProjection(int, int, int, int, int, int)>
	//    9   13:putstatic       #23  <Field TileProjection CREATOR>
	//*  10   16:return          
	}
}
