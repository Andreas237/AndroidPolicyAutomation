// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzo, LatLng, StreetViewPanoramaLink

public class StreetViewPanoramaLocation extends zza
{

	public StreetViewPanoramaLocation(StreetViewPanoramaLink astreetviewpanoramalink[], LatLng latlng, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void zza()>
		links = astreetviewpanoramalink;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field StreetViewPanoramaLink[] links>
		position = latlng;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field LatLng position>
		panoId = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field String panoId>
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
	//   14   22:getfield        #31  <Field String panoId>
	//   15   25:aload_1         
	//   16   26:getfield        #31  <Field String panoId>
	//   17   29:invokevirtual   #37  <Method boolean String.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field LatLng position>
	//   21   39:aload_1         
	//   22   40:getfield        #29  <Field LatLng position>
	//   23   43:invokevirtual   #40  <Method boolean LatLng.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			position, panoId
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field LatLng position>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #31  <Field String panoId>
	//   11   17:aastore         
	//   12   18:invokestatic    #49  <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("panoId", ((Object) (panoId))).zzg("position", ((Object) (position.toString()))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #55  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #56  <String "panoId">
	//    3    6:aload_0         
	//    4    7:getfield        #31  <Field String panoId>
	//    5   10:invokevirtual   #62  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #63  <String "position">
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field LatLng position>
	//    9   19:invokevirtual   #65  <Method String LatLng.toString()>
	//   10   22:invokevirtual   #62  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   11   25:invokevirtual   #66  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   12   28:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzo.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #72  <Method void com.google.android.gms.maps.model.zzo.zza(StreetViewPanoramaLocation, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzo();
	public final StreetViewPanoramaLink links[];
	public final String panoId;
	public final LatLng position;

	static 
	{
	//    0    0:new             #17  <Class zzo>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzo()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
