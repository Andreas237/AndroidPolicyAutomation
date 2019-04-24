// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzp

public class StreetViewPanoramaOrientation extends zza
{
	public static final class Builder
	{

		public Builder bearing(float f)
		{
			bearing = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #19  <Field float bearing>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public StreetViewPanoramaOrientation build()
		{
			return new StreetViewPanoramaOrientation(tilt, bearing);
		//    0    0:new             #6   <Class StreetViewPanoramaOrientation>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field float tilt>
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field float bearing>
		//    6   12:invokespecial   #28  <Method void StreetViewPanoramaOrientation(float, float)>
		//    7   15:areturn         
		}

		public Builder tilt(float f)
		{
			tilt = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #22  <Field float tilt>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public float bearing;
		public float tilt;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

		public Builder(StreetViewPanoramaOrientation streetviewpanoramaorientation)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			bearing = streetviewpanoramaorientation.bearing;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #18  <Field float StreetViewPanoramaOrientation.bearing>
		//    5    9:putfield        #19  <Field float bearing>
			tilt = streetviewpanoramaorientation.tilt;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #21  <Field float StreetViewPanoramaOrientation.tilt>
		//    9   17:putfield        #22  <Field float tilt>
		//   10   20:return          
		}
	}


	public StreetViewPanoramaOrientation(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void zza()>
		boolean flag;
		if(-90F <= f && f <= 90F)
	//*   2    4:ldc1            #26  <Float -90F>
	//*   3    6:fload_1         
	//*   4    7:fcmpg           
	//*   5    8:ifgt            23
	//*   6   11:fload_1         
	//*   7   12:ldc1            #27  <Float 90F>
	//*   8   14:fcmpg           
	//*   9   15:ifgt            23
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_3        
		else
	//*  12   20:goto            25
			flag = false;
	//   13   23:iconst_0        
	//   14   24:istore_3        
		zzac.zzb(flag, "Tilt needs to be between -90 and 90 inclusive");
	//   15   25:iload_3         
	//   16   26:ldc1            #29  <String "Tilt needs to be between -90 and 90 inclusive">
	//   17   28:invokestatic    #35  <Method void zzac.zzb(boolean, Object)>
		tilt = 0.0F + f;
	//   18   31:aload_0         
	//   19   32:fconst_0        
	//   20   33:fload_1         
	//   21   34:fadd            
	//   22   35:putfield        #37  <Field float tilt>
		if((double)f1 <= 0.0D)
	//*  23   38:fload_2         
	//*  24   39:f2d             
	//*  25   40:dconst_0        
	//*  26   41:dcmpg           
	//*  27   42:ifgt            56
			f1 = f1 % 360F + 360F;
	//   28   45:fload_2         
	//   29   46:ldc1            #38  <Float 360F>
	//   30   48:frem            
	//   31   49:ldc1            #38  <Float 360F>
	//   32   51:fadd            
	//   33   52:fstore_2        
	//*  34   53:goto            56
		bearing = f1 % 360F;
	//   35   56:aload_0         
	//   36   57:fload_2         
	//   37   58:ldc1            #38  <Float 360F>
	//   38   60:frem            
	//   39   61:putfield        #40  <Field float bearing>
	//   40   64:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #6   <Class StreetViewPanoramaOrientation$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StreetViewPanoramaOrientation$Builder()>
	//    3    7:areturn         
	}

	public static Builder builder(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		return new Builder(streetviewpanoramaorientation);
	//    0    0:new             #6   <Class StreetViewPanoramaOrientation$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #47  <Method void StreetViewPanoramaOrientation$Builder(StreetViewPanoramaOrientation)>
	//    4    8:areturn         
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
		if(!(obj instanceof StreetViewPanoramaOrientation))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class StreetViewPanoramaOrientation>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((StreetViewPanoramaOrientation)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class StreetViewPanoramaOrientation>
	//   12   20:astore_1        
		return Float.floatToIntBits(tilt) == Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).tilt) && Float.floatToIntBits(bearing) == Float.floatToIntBits(((StreetViewPanoramaOrientation) (obj)).bearing);
	//   13   21:aload_0         
	//   14   22:getfield        #37  <Field float tilt>
	//   15   25:invokestatic    #55  <Method int Float.floatToIntBits(float)>
	//   16   28:aload_1         
	//   17   29:getfield        #37  <Field float tilt>
	//   18   32:invokestatic    #55  <Method int Float.floatToIntBits(float)>
	//   19   35:icmpne          57
	//   20   38:aload_0         
	//   21   39:getfield        #40  <Field float bearing>
	//   22   42:invokestatic    #55  <Method int Float.floatToIntBits(float)>
	//   23   45:aload_1         
	//   24   46:getfield        #40  <Field float bearing>
	//   25   49:invokestatic    #55  <Method int Float.floatToIntBits(float)>
	//   26   52:icmpne          57
	//   27   55:iconst_1        
	//   28   56:ireturn         
	//   29   57:iconst_0        
	//   30   58:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Float.valueOf(tilt), Float.valueOf(bearing)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field float tilt>
	//    6   10:invokestatic    #63  <Method Float Float.valueOf(float)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #40  <Field float bearing>
	//   12   20:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   13   23:aastore         
	//   14   24:invokestatic    #68  <Method int zzaa.hashCode(Object[])>
	//   15   27:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("tilt", ((Object) (Float.valueOf(tilt)))).zzg("bearing", ((Object) (Float.valueOf(bearing)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #74  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #75  <String "tilt">
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field float tilt>
	//    5   10:invokestatic    #63  <Method Float Float.valueOf(float)>
	//    6   13:invokevirtual   #81  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #82  <String "bearing">
	//    8   18:aload_0         
	//    9   19:getfield        #40  <Field float bearing>
	//   10   22:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   11   25:invokevirtual   #81  <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   12   28:invokevirtual   #84  <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   13   31:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzp.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #90  <Method void com.google.android.gms.maps.model.zzp.zza(StreetViewPanoramaOrientation, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzp();
	public final float bearing;
	public final float tilt;

	static 
	{
	//    0    0:new             #17  <Class zzp>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void zzp()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
