// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzn

public class StreetViewPanoramaLink extends zza
{

	public StreetViewPanoramaLink(String s, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		panoId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String panoId>
		if((double)f <= 0.0D)
	//*   5    9:fload_2         
	//*   6   10:f2d             
	//*   7   11:dconst_0        
	//*   8   12:dcmpg           
	//*   9   13:ifgt            27
			f = f % 360F + 360F;
	//   10   16:fload_2         
	//   11   17:ldc1            #26  <Float 360F>
	//   12   19:frem            
	//   13   20:ldc1            #26  <Float 360F>
	//   14   22:fadd            
	//   15   23:fstore_2        
	//*  16   24:goto            27
		bearing = f % 360F;
	//   17   27:aload_0         
	//   18   28:fload_2         
	//   19   29:ldc1            #26  <Float 360F>
	//   20   31:frem            
	//   21   32:putfield        #28  <Field float bearing>
	//   22   35:return          
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
		if(!(obj instanceof StreetViewPanoramaLink))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class StreetViewPanoramaLink>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((StreetViewPanoramaLink)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class StreetViewPanoramaLink>
	//   12   20:astore_1        
		return panoId.equals(((Object) (((StreetViewPanoramaLink) (obj)).panoId))) && Float.floatToIntBits(bearing) == Float.floatToIntBits(((StreetViewPanoramaLink) (obj)).bearing);
	//   13   21:aload_0         
	//   14   22:getfield        #25  <Field String panoId>
	//   15   25:aload_1         
	//   16   26:getfield        #25  <Field String panoId>
	//   17   29:invokevirtual   #34  <Method boolean String.equals(Object)>
	//   18   32:ifeq            54
	//   19   35:aload_0         
	//   20   36:getfield        #28  <Field float bearing>
	//   21   39:invokestatic    #40  <Method int Float.floatToIntBits(float)>
	//   22   42:aload_1         
	//   23   43:getfield        #28  <Field float bearing>
	//   24   46:invokestatic    #40  <Method int Float.floatToIntBits(float)>
	//   25   49:icmpne          54
	//   26   52:iconst_1        
	//   27   53:ireturn         
	//   28   54:iconst_0        
	//   29   55:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			panoId, Float.valueOf(bearing)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field String panoId>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #28  <Field float bearing>
	//   11   17:invokestatic    #48  <Method Float Float.valueOf(float)>
	//   12   20:aastore         
	//   13   21:invokestatic    #53  <Method int zzaa.hashCode(Object[])>
	//   14   24:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("panoId", ((Object) (panoId))).zzg("bearing", ((Object) (Float.valueOf(bearing)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #59  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #60  <String "panoId">
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field String panoId>
	//    5   10:invokevirtual   #66  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #67  <String "bearing">
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field float bearing>
	//    9   19:invokestatic    #48  <Method Float Float.valueOf(float)>
	//   10   22:invokevirtual   #66  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   11   25:invokevirtual   #69  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   12   28:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzn.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #75  <Method void com.google.android.gms.maps.model.zzn.zza(StreetViewPanoramaLink, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzn();
	public final float bearing;
	public final String panoId;

	static 
	{
	//    0    0:new             #15  <Class zzn>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzn()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
