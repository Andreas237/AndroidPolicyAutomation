// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzs, LatLng, LatLngBounds

public final class VisibleRegion extends zza
{

	public VisibleRegion(LatLng latlng, LatLng latlng1, LatLng latlng2, LatLng latlng3, LatLngBounds latlngbounds)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zza()>
		nearLeft = latlng;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field LatLng nearLeft>
		nearRight = latlng1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field LatLng nearRight>
		farLeft = latlng2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field LatLng farLeft>
		farRight = latlng3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field LatLng farRight>
		latLngBounds = latlngbounds;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #36  <Field LatLngBounds latLngBounds>
	//   17   31:return          
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
		if(!(obj instanceof VisibleRegion))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class VisibleRegion>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((VisibleRegion)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class VisibleRegion>
	//   12   20:astore_1        
		return nearLeft.equals(((Object) (((VisibleRegion) (obj)).nearLeft))) && nearRight.equals(((Object) (((VisibleRegion) (obj)).nearRight))) && farLeft.equals(((Object) (((VisibleRegion) (obj)).farLeft))) && farRight.equals(((Object) (((VisibleRegion) (obj)).farRight))) && latLngBounds.equals(((Object) (((VisibleRegion) (obj)).latLngBounds)));
	//   13   21:aload_0         
	//   14   22:getfield        #28  <Field LatLng nearLeft>
	//   15   25:aload_1         
	//   16   26:getfield        #28  <Field LatLng nearLeft>
	//   17   29:invokevirtual   #42  <Method boolean LatLng.equals(Object)>
	//   18   32:ifeq            93
	//   19   35:aload_0         
	//   20   36:getfield        #30  <Field LatLng nearRight>
	//   21   39:aload_1         
	//   22   40:getfield        #30  <Field LatLng nearRight>
	//   23   43:invokevirtual   #42  <Method boolean LatLng.equals(Object)>
	//   24   46:ifeq            93
	//   25   49:aload_0         
	//   26   50:getfield        #32  <Field LatLng farLeft>
	//   27   53:aload_1         
	//   28   54:getfield        #32  <Field LatLng farLeft>
	//   29   57:invokevirtual   #42  <Method boolean LatLng.equals(Object)>
	//   30   60:ifeq            93
	//   31   63:aload_0         
	//   32   64:getfield        #34  <Field LatLng farRight>
	//   33   67:aload_1         
	//   34   68:getfield        #34  <Field LatLng farRight>
	//   35   71:invokevirtual   #42  <Method boolean LatLng.equals(Object)>
	//   36   74:ifeq            93
	//   37   77:aload_0         
	//   38   78:getfield        #36  <Field LatLngBounds latLngBounds>
	//   39   81:aload_1         
	//   40   82:getfield        #36  <Field LatLngBounds latLngBounds>
	//   41   85:invokevirtual   #45  <Method boolean LatLngBounds.equals(Object)>
	//   42   88:ifeq            93
	//   43   91:iconst_1        
	//   44   92:ireturn         
	//   45   93:iconst_0        
	//   46   94:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			nearLeft, nearRight, farLeft, farRight, latLngBounds
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field LatLng nearLeft>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #30  <Field LatLng nearRight>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #32  <Field LatLng farLeft>
	//   16   24:aastore         
	//   17   25:dup             
	//   18   26:iconst_3        
	//   19   27:aload_0         
	//   20   28:getfield        #34  <Field LatLng farRight>
	//   21   31:aastore         
	//   22   32:dup             
	//   23   33:iconst_4        
	//   24   34:aload_0         
	//   25   35:getfield        #36  <Field LatLngBounds latLngBounds>
	//   26   38:aastore         
	//   27   39:invokestatic    #54  <Method int zzaa.hashCode(Object[])>
	//   28   42:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("nearLeft", ((Object) (nearLeft))).zzg("nearRight", ((Object) (nearRight))).zzg("farLeft", ((Object) (farLeft))).zzg("farRight", ((Object) (farRight))).zzg("latLngBounds", ((Object) (latLngBounds))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #60  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #61  <String "nearLeft">
	//    3    6:aload_0         
	//    4    7:getfield        #28  <Field LatLng nearLeft>
	//    5   10:invokevirtual   #67  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #68  <String "nearRight">
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field LatLng nearRight>
	//    9   19:invokevirtual   #67  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:ldc1            #69  <String "farLeft">
	//   11   24:aload_0         
	//   12   25:getfield        #32  <Field LatLng farLeft>
	//   13   28:invokevirtual   #67  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   14   31:ldc1            #70  <String "farRight">
	//   15   33:aload_0         
	//   16   34:getfield        #34  <Field LatLng farRight>
	//   17   37:invokevirtual   #67  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   18   40:ldc1            #71  <String "latLngBounds">
	//   19   42:aload_0         
	//   20   43:getfield        #36  <Field LatLngBounds latLngBounds>
	//   21   46:invokevirtual   #67  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   22   49:invokevirtual   #73  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   23   52:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzs.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #79  <Method void com.google.android.gms.maps.model.zzs.zza(VisibleRegion, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzs();
	public final LatLng farLeft;
	public final LatLng farRight;
	public final LatLngBounds latLngBounds;
	public final LatLng nearLeft;
	public final LatLng nearRight;

	static 
	{
	//    0    0:new             #18  <Class zzs>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzs()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
