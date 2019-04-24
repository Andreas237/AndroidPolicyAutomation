// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			BitmapDescriptor, LatLng, LatLngBounds, GroundOverlayOptions

public class GroundOverlayOptionsCreator
	implements android.os.Parcelable.Creator
{

	public GroundOverlayOptionsCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public GroundOverlayOptions createFromParcel(Parcel parcel)
	{
		int i = parcel.readInt();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method int Parcel.readInt()>
	//    2    4:istore          6
		BitmapDescriptor bitmapdescriptor = (BitmapDescriptor)parcel.readParcelable(((Class) (com/amap/api/maps/model/BitmapDescriptor)).getClassLoader());
	//    3    6:aload_1         
	//    4    7:ldc1            #25  <Class BitmapDescriptor>
	//    5    9:invokevirtual   #31  <Method ClassLoader Class.getClassLoader()>
	//    6   12:invokevirtual   #35  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    7   15:checkcast       #25  <Class BitmapDescriptor>
	//    8   18:astore          8
		LatLng latlng = (LatLng)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLng)).getClassLoader());
	//    9   20:aload_1         
	//   10   21:ldc1            #37  <Class LatLng>
	//   11   23:invokevirtual   #31  <Method ClassLoader Class.getClassLoader()>
	//   12   26:invokevirtual   #35  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   13   29:checkcast       #37  <Class LatLng>
	//   14   32:astore          9
		float f = parcel.readFloat();
	//   15   34:aload_1         
	//   16   35:invokevirtual   #41  <Method float Parcel.readFloat()>
	//   17   38:fstore_2        
		float f1 = parcel.readFloat();
	//   18   39:aload_1         
	//   19   40:invokevirtual   #41  <Method float Parcel.readFloat()>
	//   20   43:fstore_3        
		LatLngBounds latlngbounds = (LatLngBounds)parcel.readParcelable(((Class) (com/amap/api/maps/model/LatLngBounds)).getClassLoader());
	//   21   44:aload_1         
	//   22   45:ldc1            #43  <Class LatLngBounds>
	//   23   47:invokevirtual   #31  <Method ClassLoader Class.getClassLoader()>
	//   24   50:invokevirtual   #35  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   25   53:checkcast       #43  <Class LatLngBounds>
	//   26   56:astore          10
		float f2 = parcel.readFloat();
	//   27   58:aload_1         
	//   28   59:invokevirtual   #41  <Method float Parcel.readFloat()>
	//   29   62:fstore          4
		float f3 = parcel.readFloat();
	//   30   64:aload_1         
	//   31   65:invokevirtual   #41  <Method float Parcel.readFloat()>
	//   32   68:fstore          5
		boolean flag;
		if(parcel.readByte() != 0)
	//*  33   70:aload_1         
	//*  34   71:invokevirtual   #47  <Method byte Parcel.readByte()>
	//*  35   74:ifeq            83
			flag = true;
	//   36   77:iconst_1        
	//   37   78:istore          7
		else
	//*  38   80:goto            86
			flag = false;
	//   39   83:iconst_0        
	//   40   84:istore          7
		parcel = ((Parcel) (new GroundOverlayOptions(i, ((android.os.IBinder) (null)), latlng, f, f1, latlngbounds, f2, f3, flag, parcel.readFloat(), parcel.readFloat(), parcel.readFloat())));
	//   41   86:new             #49  <Class GroundOverlayOptions>
	//   42   89:dup             
	//   43   90:iload           6
	//   44   92:aconst_null     
	//   45   93:aload           9
	//   46   95:fload_2         
	//   47   96:fload_3         
	//   48   97:aload           10
	//   49   99:fload           4
	//   50  101:fload           5
	//   51  103:iload           7
	//   52  105:aload_1         
	//   53  106:invokevirtual   #41  <Method float Parcel.readFloat()>
	//   54  109:aload_1         
	//   55  110:invokevirtual   #41  <Method float Parcel.readFloat()>
	//   56  113:aload_1         
	//   57  114:invokevirtual   #41  <Method float Parcel.readFloat()>
	//   58  117:invokespecial   #52  <Method void GroundOverlayOptions(int, android.os.IBinder, LatLng, float, float, LatLngBounds, float, float, boolean, float, float, float)>
	//   59  120:astore_1        
		((GroundOverlayOptions) (parcel)).image(bitmapdescriptor);
	//   60  121:aload_1         
	//   61  122:aload           8
	//   62  124:invokevirtual   #56  <Method GroundOverlayOptions GroundOverlayOptions.image(BitmapDescriptor)>
	//   63  127:pop             
		return ((GroundOverlayOptions) (parcel));
	//   64  128:aload_1         
	//   65  129:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method GroundOverlayOptions createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public GroundOverlayOptions[] newArray(int i)
	{
		return new GroundOverlayOptions[i];
	//    0    0:iload_1         
	//    1    1:anewarray       GroundOverlayOptions[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #64  <Method GroundOverlayOptions[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
