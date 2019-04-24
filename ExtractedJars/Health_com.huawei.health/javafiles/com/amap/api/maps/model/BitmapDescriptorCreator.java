// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.os.Parcel;

// Referenced classes of package com.amap.api.maps.model:
//			BitmapDescriptor

public class BitmapDescriptorCreator
	implements android.os.Parcelable.Creator
{

	public BitmapDescriptorCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public BitmapDescriptor createFromParcel(Parcel parcel)
	{
		BitmapDescriptor bitmapdescriptor = new BitmapDescriptor(((Bitmap) (null)));
	//    0    0:new             #16  <Class BitmapDescriptor>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #19  <Method void BitmapDescriptor(Bitmap)>
	//    4    8:astore_2        
		bitmapdescriptor.c = (Bitmap)parcel.readParcelable(((Class) (com/amap/api/maps/model/BitmapDescriptor)).getClassLoader());
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:ldc1            #16  <Class BitmapDescriptor>
	//    8   13:invokevirtual   #25  <Method ClassLoader Class.getClassLoader()>
	//    9   16:invokevirtual   #31  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   10   19:checkcast       #33  <Class Bitmap>
	//   11   22:putfield        #37  <Field Bitmap BitmapDescriptor.c>
		bitmapdescriptor.a = parcel.readInt();
	//   12   25:aload_2         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #41  <Method int Parcel.readInt()>
	//   15   30:putfield        #45  <Field int BitmapDescriptor.a>
		bitmapdescriptor.b = parcel.readInt();
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #41  <Method int Parcel.readInt()>
	//   19   38:putfield        #48  <Field int BitmapDescriptor.b>
		return bitmapdescriptor;
	//   20   41:aload_2         
	//   21   42:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method BitmapDescriptor createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public BitmapDescriptor[] newArray(int i)
	{
		return new BitmapDescriptor[i];
	//    0    0:iload_1         
	//    1    1:anewarray       BitmapDescriptor[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #56  <Method BitmapDescriptor[] newArray(int)>
	//    3    5:areturn         
	}
}
