// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzn

public class StreetViewPanoramaLink extends AbstractSafeParcelable
{

	public StreetViewPanoramaLink(String s, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		panoId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field String panoId>
		float f1 = f;
	//    5    9:fload_2         
	//    6   10:fstore_3        
		if((double)f <= 0.0D)
	//*   7   11:fload_2         
	//*   8   12:f2d             
	//*   9   13:dconst_0        
	//*  10   14:dcmpg           
	//*  11   15:ifgt            26
			f1 = f % 360F + 360F;
	//   12   18:fload_2         
	//   13   19:ldc1            #38  <Float 360F>
	//   14   21:frem            
	//   15   22:ldc1            #38  <Float 360F>
	//   16   24:fadd            
	//   17   25:fstore_3        
		bearing = f1 % 360F;
	//   18   26:aload_0         
	//   19   27:fload_3         
	//   20   28:ldc1            #38  <Float 360F>
	//   21   30:frem            
	//   22   31:putfield        #40  <Field float bearing>
	//   23   34:return          
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
	//   14   22:getfield        #37  <Field String panoId>
	//   15   25:aload_1         
	//   16   26:getfield        #37  <Field String panoId>
	//   17   29:invokevirtual   #48  <Method boolean String.equals(Object)>
	//   18   32:ifeq            54
	//   19   35:aload_0         
	//   20   36:getfield        #40  <Field float bearing>
	//   21   39:invokestatic    #54  <Method int Float.floatToIntBits(float)>
	//   22   42:aload_1         
	//   23   43:getfield        #40  <Field float bearing>
	//   24   46:invokestatic    #54  <Method int Float.floatToIntBits(float)>
	//   25   49:icmpne          54
	//   26   52:iconst_1        
	//   27   53:ireturn         
	//   28   54:iconst_0        
	//   29   55:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			panoId, Float.valueOf(bearing)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field String panoId>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #40  <Field float bearing>
	//   11   17:invokestatic    #62  <Method Float Float.valueOf(float)>
	//   12   20:aastore         
	//   13   21:invokestatic    #67  <Method int Objects.hashCode(Object[])>
	//   14   24:ireturn         
	}

	public String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("panoId", ((Object) (panoId))).add("bearing", ((Object) (Float.valueOf(bearing)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #73  <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #74  <String "panoId">
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field String panoId>
	//    5   10:invokevirtual   #80  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #81  <String "bearing">
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field float bearing>
	//    9   19:invokestatic    #62  <Method Float Float.valueOf(float)>
	//   10   22:invokevirtual   #80  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   11   25:invokevirtual   #83  <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   12   28:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #91  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, panoId, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field String panoId>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #95  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeFloat(parcel, 3, bearing);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #40  <Field float bearing>
	//   13   21:invokestatic    #99  <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #102 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzn();
	public final float bearing;
	public final String panoId;

	static 
	{
	//    0    0:new             #25  <Class zzn>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzn()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
