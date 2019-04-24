// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			MyLocationStyle, BitmapDescriptor

public class MyLocationStyleCreator
	implements android.os.Parcelable.Creator
{

	public MyLocationStyleCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public MyLocationStyle createFromParcel(Parcel parcel)
	{
		MyLocationStyle mylocationstyle = new MyLocationStyle();
	//    0    0:new             #16  <Class MyLocationStyle>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void MyLocationStyle()>
	//    3    7:astore_2        
		mylocationstyle.myLocationIcon((BitmapDescriptor)parcel.readParcelable(((Class) (com/amap/api/maps/model/BitmapDescriptor)).getClassLoader()));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:ldc1            #19  <Class BitmapDescriptor>
	//    7   12:invokevirtual   #25  <Method ClassLoader Class.getClassLoader()>
	//    8   15:invokevirtual   #31  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    9   18:checkcast       #19  <Class BitmapDescriptor>
	//   10   21:invokevirtual   #35  <Method MyLocationStyle MyLocationStyle.myLocationIcon(BitmapDescriptor)>
	//   11   24:pop             
		mylocationstyle.anchor(parcel.readFloat(), parcel.readFloat());
	//   12   25:aload_2         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #39  <Method float Parcel.readFloat()>
	//   15   30:aload_1         
	//   16   31:invokevirtual   #39  <Method float Parcel.readFloat()>
	//   17   34:invokevirtual   #43  <Method MyLocationStyle MyLocationStyle.anchor(float, float)>
	//   18   37:pop             
		mylocationstyle.radiusFillColor(parcel.readInt());
	//   19   38:aload_2         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #47  <Method int Parcel.readInt()>
	//   22   43:invokevirtual   #51  <Method MyLocationStyle MyLocationStyle.radiusFillColor(int)>
	//   23   46:pop             
		mylocationstyle.strokeColor(parcel.readInt());
	//   24   47:aload_2         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #47  <Method int Parcel.readInt()>
	//   27   52:invokevirtual   #54  <Method MyLocationStyle MyLocationStyle.strokeColor(int)>
	//   28   55:pop             
		mylocationstyle.strokeWidth(parcel.readFloat());
	//   29   56:aload_2         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #39  <Method float Parcel.readFloat()>
	//   32   61:invokevirtual   #58  <Method MyLocationStyle MyLocationStyle.strokeWidth(float)>
	//   33   64:pop             
		mylocationstyle.myLocationType(parcel.readInt());
	//   34   65:aload_2         
	//   35   66:aload_1         
	//   36   67:invokevirtual   #47  <Method int Parcel.readInt()>
	//   37   70:invokevirtual   #61  <Method MyLocationStyle MyLocationStyle.myLocationType(int)>
	//   38   73:pop             
		mylocationstyle.interval(parcel.readLong());
	//   39   74:aload_2         
	//   40   75:aload_1         
	//   41   76:invokevirtual   #65  <Method long Parcel.readLong()>
	//   42   79:invokevirtual   #69  <Method MyLocationStyle MyLocationStyle.interval(long)>
	//   43   82:pop             
		boolean aflag[] = new boolean[7];
	//   44   83:bipush          7
	//   45   85:newarray        boolean[]
	//   46   87:astore_3        
		parcel.readBooleanArray(aflag);
	//   47   88:aload_1         
	//   48   89:aload_3         
	//   49   90:invokevirtual   #73  <Method void Parcel.readBooleanArray(boolean[])>
		mylocationstyle.showMyLocation(aflag[0]);
	//   50   93:aload_2         
	//   51   94:aload_3         
	//   52   95:iconst_0        
	//   53   96:baload          
	//   54   97:invokevirtual   #77  <Method MyLocationStyle MyLocationStyle.showMyLocation(boolean)>
	//   55  100:pop             
		return mylocationstyle;
	//   56  101:aload_2         
	//   57  102:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #80  <Method MyLocationStyle createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public MyLocationStyle[] newArray(int i)
	{
		return new MyLocationStyle[i];
	//    0    0:iload_1         
	//    1    1:anewarray       MyLocationStyle[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #85  <Method MyLocationStyle[] newArray(int)>
	//    3    5:areturn         
	}
}
