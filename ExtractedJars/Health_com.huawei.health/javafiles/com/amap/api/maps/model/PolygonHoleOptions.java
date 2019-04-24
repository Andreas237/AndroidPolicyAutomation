// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.*;

// Referenced classes of package com.amap.api.maps.model:
//			BaseHoleOptions, LatLng

public class PolygonHoleOptions extends BaseHoleOptions
	implements Parcelable
{

	public PolygonHoleOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseHoleOptions()>
		a = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List a>
	//    7   15:return          
	}

	protected PolygonHoleOptions(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseHoleOptions()>
		a = ((List) (parcel.createTypedArrayList(((android.os.Parcelable.Creator) (LatLng.CREATOR)))));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getstatic       #34  <Field LatLngCreator LatLng.CREATOR>
	//    5    9:invokevirtual   #40  <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//    6   12:putfield        #28  <Field List a>
	//    7   15:return          
	}

	public PolygonHoleOptions addAll(Iterable iterable)
	{
		try
		{
			LatLng latlng;
			for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); a.add(((Object) (latlng))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #50  <Method Iterator Iterable.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            40
				latlng = (LatLng)((Iterator) (iterable)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #60  <Method Object Iterator.next()>
	//    8   22:checkcast       #31  <Class LatLng>
	//    9   25:astore_2        

	//   10   26:aload_0         
	//   11   27:getfield        #28  <Field List a>
	//   12   30:aload_2         
	//   13   31:invokeinterface #66  <Method boolean List.add(Object)>
	//   14   36:pop             
		}
	//*  15   37:goto            7
	//*  16   40:aload_0         
	//*  17   41:areturn         
		// Misplaced declaration of an exception variable
		catch(Iterable iterable)
	//*  18   42:astore_1        
		{
			((Throwable) (iterable)).printStackTrace();
	//   19   43:aload_1         
	//   20   44:invokevirtual   #69  <Method void Throwable.printStackTrace()>
			return this;
	//   21   47:aload_0         
	//   22   48:areturn         
		}
		return this;
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public List getPoints()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List a>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeTypedList(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field List a>
	//    3    5:invokevirtual   #82  <Method void Parcel.writeTypedList(List)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public PolygonHoleOptions a(Parcel parcel)
		{
			return new PolygonHoleOptions(parcel);
		//    0    0:new             #9   <Class PolygonHoleOptions>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void PolygonHoleOptions(Parcel)>
		//    4    8:areturn         
		}

		public PolygonHoleOptions[] a(int i)
		{
			return new PolygonHoleOptions[i];
		//    0    0:iload_1         
		//    1    1:anewarray       PolygonHoleOptions[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method PolygonHoleOptions a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method PolygonHoleOptions[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private final List a;

	static 
	{
	//    0    0:new             #8   <Class PolygonHoleOptions$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void PolygonHoleOptions$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
