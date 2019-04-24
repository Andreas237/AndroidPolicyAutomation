// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.*;

// Referenced classes of package com.amap.api.maps.model:
//			BaseHoleOptions, LatLng

public class CircleHoleOptions extends BaseHoleOptions
	implements Parcelable
{

	public CircleHoleOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BaseHoleOptions()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field LatLng a>
		b = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #28  <Field double b>
	//    8   14:return          
	}

	protected CircleHoleOptions(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BaseHoleOptions()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field LatLng a>
		b = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #28  <Field double b>
		Bundle bundle = parcel.readBundle();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #35  <Method Bundle Parcel.readBundle()>
	//   10   18:astore_2        
		a = new LatLng(bundle.getDouble("lat"), bundle.getDouble("lng"));
	//   11   19:aload_0         
	//   12   20:new             #37  <Class LatLng>
	//   13   23:dup             
	//   14   24:aload_2         
	//   15   25:ldc1            #39  <String "lat">
	//   16   27:invokevirtual   #45  <Method double Bundle.getDouble(String)>
	//   17   30:aload_2         
	//   18   31:ldc1            #47  <String "lng">
	//   19   33:invokevirtual   #45  <Method double Bundle.getDouble(String)>
	//   20   36:invokespecial   #50  <Method void LatLng(double, double)>
	//   21   39:putfield        #26  <Field LatLng a>
		b = parcel.readDouble();
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #54  <Method double Parcel.readDouble()>
	//   25   47:putfield        #28  <Field double b>
	//   26   50:return          
	}

	public CircleHoleOptions center(LatLng latlng)
	{
		a = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field LatLng a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public LatLng getCenter()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field LatLng a>
	//    2    4:areturn         
	}

	public double getRadius()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field double b>
	//    2    4:dreturn         
	}

	public CircleHoleOptions radius(double d)
	{
		b = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #28  <Field double b>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #41  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void Bundle()>
	//    3    7:astore_3        
		if(a != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #26  <Field LatLng a>
	//*   6   12:ifnull          41
		{
			bundle.putDouble("lat", a.latitude);
	//    7   15:aload_3         
	//    8   16:ldc1            #39  <String "lat">
	//    9   18:aload_0         
	//   10   19:getfield        #26  <Field LatLng a>
	//   11   22:getfield        #69  <Field double LatLng.latitude>
	//   12   25:invokevirtual   #73  <Method void Bundle.putDouble(String, double)>
			bundle.putDouble("lng", a.longitude);
	//   13   28:aload_3         
	//   14   29:ldc1            #47  <String "lng">
	//   15   31:aload_0         
	//   16   32:getfield        #26  <Field LatLng a>
	//   17   35:getfield        #76  <Field double LatLng.longitude>
	//   18   38:invokevirtual   #73  <Method void Bundle.putDouble(String, double)>
		}
		parcel.writeBundle(bundle);
	//   19   41:aload_1         
	//   20   42:aload_3         
	//   21   43:invokevirtual   #80  <Method void Parcel.writeBundle(Bundle)>
		parcel.writeDouble(b);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #28  <Field double b>
	//   25   51:invokevirtual   #84  <Method void Parcel.writeDouble(double)>
	//   26   54:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CircleHoleOptions a(Parcel parcel)
		{
			return new CircleHoleOptions(parcel);
		//    0    0:new             #9   <Class CircleHoleOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void CircleHoleOptions(Parcel)>
		//    4    8:areturn         
		}

		public CircleHoleOptions[] a(int i)
		{
			return new CircleHoleOptions[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CircleHoleOptions[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method CircleHoleOptions a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method CircleHoleOptions[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private LatLng a;
	private double b;

	static 
	{
	//    0    0:new             #8   <Class CircleHoleOptions$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void CircleHoleOptions$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
