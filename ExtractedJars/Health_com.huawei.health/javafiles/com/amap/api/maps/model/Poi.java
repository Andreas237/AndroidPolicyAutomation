// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.amap.api.maps.model:
//			PoiCreator, LatLng

public class Poi
	implements Parcelable
{

	public Poi(String s, LatLng latlng, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String a>
		b = latlng;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field LatLng b>
		c = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field String c>
	//   11   19:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || !(obj instanceof Poi))
	//*   5    7:aload_1         
	//*   6    8:ifnull          18
	//*   7   11:aload_1         
	//*   8   12:instanceof      #2   <Class Poi>
	//*   9   15:ifne            20
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		obj = ((Object) ((Poi)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class Poi>
	//   14   24:astore_1        
		return ((Poi) (obj)).getName().equals(((Object) (a))) && ((Poi) (obj)).getCoordinate().equals(((Object) (b))) && ((Poi) (obj)).getPoiId().equals(((Object) (c)));
	//   15   25:aload_1         
	//   16   26:invokevirtual   #39  <Method String getName()>
	//   17   29:aload_0         
	//   18   30:getfield        #27  <Field String a>
	//   19   33:invokevirtual   #43  <Method boolean String.equals(Object)>
	//   20   36:ifeq            69
	//   21   39:aload_1         
	//   22   40:invokevirtual   #47  <Method LatLng getCoordinate()>
	//   23   43:aload_0         
	//   24   44:getfield        #29  <Field LatLng b>
	//   25   47:invokevirtual   #50  <Method boolean LatLng.equals(Object)>
	//   26   50:ifeq            69
	//   27   53:aload_1         
	//   28   54:invokevirtual   #53  <Method String getPoiId()>
	//   29   57:aload_0         
	//   30   58:getfield        #31  <Field String c>
	//   31   61:invokevirtual   #43  <Method boolean String.equals(Object)>
	//   32   64:ifeq            69
	//   33   67:iconst_1        
	//   34   68:ireturn         
	//   35   69:iconst_0        
	//   36   70:ireturn         
	}

	public LatLng getCoordinate()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field LatLng b>
	//    2    4:areturn         
	}

	public String getName()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String a>
	//    2    4:areturn         
	}

	public String getPoiId()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String c>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("poiid ").append(c).append(" name:").append(a).append("  coordinate:").append(b.toString()).toString();
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuilder()>
	//    3    7:ldc1            #62  <String "poiid ">
	//    4    9:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #31  <Field String c>
	//    7   16:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #68  <String " name:">
	//    9   21:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #27  <Field String a>
	//   12   28:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #70  <String "  coordinate:">
	//   14   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #29  <Field LatLng b>
	//   17   40:invokevirtual   #72  <Method String LatLng.toString()>
	//   18   43:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   20   49:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field String a>
	//    3    5:invokevirtual   #81  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (b)), i);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field LatLng b>
	//    7   13:iload_2         
	//    8   14:invokevirtual   #85  <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeString(c);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #31  <Field String c>
	//   12   22:invokevirtual   #81  <Method void Parcel.writeString(String)>
	//   13   25:return          
	}

	public static final PoiCreator CREATOR = new PoiCreator();
	private final String a;
	private final LatLng b;
	private final String c;

	static 
	{
	//    0    0:new             #17  <Class PoiCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void PoiCreator()>
	//    3    7:putstatic       #22  <Field PoiCreator CREATOR>
	//*   4   10:return          
	}
}
