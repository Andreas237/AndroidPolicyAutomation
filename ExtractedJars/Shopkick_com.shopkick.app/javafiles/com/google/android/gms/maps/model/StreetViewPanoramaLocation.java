// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzo, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation extends AbstractSafeParcelable
{

	public StreetViewPanoramaLocation(StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void AbstractSafeParcelable()>
		links = astreetviewpanoramalink;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field StreetViewPanoramaLink[] links>
		position = latlng;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field LatLng position>
		panoId = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #44  <Field String panoId>
	//   11   19:return          
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
		if(!(obj instanceof StreetViewPanoramaLocation))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class StreetViewPanoramaLocation>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((StreetViewPanoramaLocation)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class StreetViewPanoramaLocation>
	//   12   20:astore_1        
		return panoId.equals(((Object) (((StreetViewPanoramaLocation) (obj)).panoId))) && position.equals(((Object) (((StreetViewPanoramaLocation) (obj)).position)));
	//   13   21:aload_0         
	//   14   22:getfield        #44  <Field String panoId>
	//   15   25:aload_1         
	//   16   26:getfield        #44  <Field String panoId>
	//   17   29:invokevirtual   #52  <Method boolean String.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #42  <Field LatLng position>
	//   21   39:aload_1         
	//   22   40:getfield        #42  <Field LatLng position>
	//   23   43:invokevirtual   #55  <Method boolean LatLng.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			position, panoId
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field LatLng position>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #44  <Field String panoId>
	//   11   17:aastore         
	//   12   18:invokestatic    #64  <Method int Objects.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("panoId", ((Object) (panoId))).add("position", ((Object) (position.toString()))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #70  <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #71  <String "panoId">
	//    3    6:aload_0         
	//    4    7:getfield        #44  <Field String panoId>
	//    5   10:invokevirtual   #77  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #78  <String "position">
	//    7   15:aload_0         
	//    8   16:getfield        #42  <Field LatLng position>
	//    9   19:invokevirtual   #80  <Method String LatLng.toString()>
	//   10   22:invokevirtual   #77  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   11   25:invokevirtual   #81  <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   12   28:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #89  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeTypedArray(parcel, 2, ((android.os.Parcelable []) (links)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field StreetViewPanoramaLink[] links>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #93  <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (position)), i, false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #42  <Field LatLng position>
	//   14   22:iload_2         
	//   15   23:iconst_0        
	//   16   24:invokestatic    #97  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 4, panoId, false);
	//   17   27:aload_1         
	//   18   28:iconst_4        
	//   19   29:aload_0         
	//   20   30:getfield        #44  <Field String panoId>
	//   21   33:iconst_0        
	//   22   34:invokestatic    #101 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   23   37:aload_1         
	//   24   38:iload_3         
	//   25   39:invokestatic    #104 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   26   42:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzo();
	public final StreetViewPanoramaLink links[];
	public final String panoId;
	public final LatLng position;

	static 
	{
	//    0    0:new             #28  <Class zzo>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzo()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
