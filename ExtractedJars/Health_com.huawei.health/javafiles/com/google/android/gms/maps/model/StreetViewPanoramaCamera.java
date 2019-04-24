// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzm, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera extends zza
	implements ReflectedParcelable
{
	public static final class Builder
	{

		public Builder bearing(float f)
		{
			bearing = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #23  <Field float bearing>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public StreetViewPanoramaCamera build()
		{
			return new StreetViewPanoramaCamera(zoom, tilt, bearing);
		//    0    0:new             #6   <Class StreetViewPanoramaCamera>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field float zoom>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field float tilt>
		//    6   12:aload_0         
		//    7   13:getfield        #23  <Field float bearing>
		//    8   16:invokespecial   #32  <Method void StreetViewPanoramaCamera(float, float, float)>
		//    9   19:areturn         
		}

		public Builder orientation(StreetViewPanoramaOrientation streetviewpanoramaorientation)
		{
			tilt = streetviewpanoramaorientation.tilt;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #37  <Field float StreetViewPanoramaOrientation.tilt>
		//    3    5:putfield        #26  <Field float tilt>
			bearing = streetviewpanoramaorientation.bearing;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #38  <Field float StreetViewPanoramaOrientation.bearing>
		//    7   13:putfield        #23  <Field float bearing>
			return this;
		//    8   16:aload_0         
		//    9   17:areturn         
		}

		public Builder tilt(float f)
		{
			tilt = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #26  <Field float tilt>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder zoom(float f)
		{
			zoom = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #20  <Field float zoom>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public float bearing;
		public float tilt;
		public float zoom;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}

		public Builder(StreetViewPanoramaCamera streetviewpanoramacamera)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			zoom = streetviewpanoramacamera.zoom;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #19  <Field float StreetViewPanoramaCamera.zoom>
		//    5    9:putfield        #20  <Field float zoom>
			bearing = streetviewpanoramacamera.bearing;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #22  <Field float StreetViewPanoramaCamera.bearing>
		//    9   17:putfield        #23  <Field float bearing>
			tilt = streetviewpanoramacamera.tilt;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #25  <Field float StreetViewPanoramaCamera.tilt>
		//   13   25:putfield        #26  <Field float tilt>
		//   14   28:return          
		}
	}


	public StreetViewPanoramaCamera(float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zza()>
		boolean flag;
		if(-90F <= f1 && f1 <= 90F)
	//*   2    4:ldc1            #31  <Float -90F>
	//*   3    6:fload_2         
	//*   4    7:fcmpg           
	//*   5    8:ifgt            24
	//*   6   11:fload_2         
	//*   7   12:ldc1            #32  <Float 90F>
	//*   8   14:fcmpg           
	//*   9   15:ifgt            24
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore          4
		else
	//*  12   21:goto            27
			flag = false;
	//   13   24:iconst_0        
	//   14   25:istore          4
		zzac.zzb(flag, "Tilt needs to be between -90 and 90 inclusive");
	//   15   27:iload           4
	//   16   29:ldc1            #34  <String "Tilt needs to be between -90 and 90 inclusive">
	//   17   31:invokestatic    #40  <Method void zzac.zzb(boolean, Object)>
		if((double)f <= 0.0D)
	//*  18   34:fload_1         
	//*  19   35:f2d             
	//*  20   36:dconst_0        
	//*  21   37:dcmpg           
	//*  22   38:ifgt            46
			f = 0.0F;
	//   23   41:fconst_0        
	//   24   42:fstore_1        
	//*  25   43:goto            46
		zoom = f;
	//   26   46:aload_0         
	//   27   47:fload_1         
	//   28   48:putfield        #42  <Field float zoom>
		tilt = 0.0F + f1;
	//   29   51:aload_0         
	//   30   52:fconst_0        
	//   31   53:fload_2         
	//   32   54:fadd            
	//   33   55:putfield        #44  <Field float tilt>
		if((double)f2 <= 0.0D)
	//*  34   58:fload_3         
	//*  35   59:f2d             
	//*  36   60:dconst_0        
	//*  37   61:dcmpg           
	//*  38   62:ifgt            76
			f = f2 % 360F + 360F;
	//   39   65:fload_3         
	//   40   66:ldc1            #45  <Float 360F>
	//   41   68:frem            
	//   42   69:ldc1            #45  <Float 360F>
	//   43   71:fadd            
	//   44   72:fstore_1        
		else
	//*  45   73:goto            78
			f = f2;
	//   46   76:fload_3         
	//   47   77:fstore_1        
		bearing = f % 360F;
	//   48   78:aload_0         
	//   49   79:fload_1         
	//   50   80:ldc1            #45  <Float 360F>
	//   51   82:frem            
	//   52   83:putfield        #47  <Field float bearing>
		zzbpU = (new StreetViewPanoramaOrientation.Builder()).tilt(f1).bearing(f2).build();
	//   53   86:aload_0         
	//   54   87:new             #49  <Class StreetViewPanoramaOrientation$Builder>
	//   55   90:dup             
	//   56   91:invokespecial   #50  <Method void StreetViewPanoramaOrientation$Builder()>
	//   57   94:fload_2         
	//   58   95:invokevirtual   #53  <Method StreetViewPanoramaOrientation$Builder StreetViewPanoramaOrientation$Builder.tilt(float)>
	//   59   98:fload_3         
	//   60   99:invokevirtual   #55  <Method StreetViewPanoramaOrientation$Builder StreetViewPanoramaOrientation$Builder.bearing(float)>
	//   61  102:invokevirtual   #59  <Method StreetViewPanoramaOrientation StreetViewPanoramaOrientation$Builder.build()>
	//   62  105:putfield        #61  <Field StreetViewPanoramaOrientation zzbpU>
	//   63  108:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #8   <Class StreetViewPanoramaCamera$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StreetViewPanoramaCamera$Builder()>
	//    3    7:areturn         
	}

	public static Builder builder(StreetViewPanoramaCamera streetviewpanoramacamera)
	{
		return new Builder(streetviewpanoramacamera);
	//    0    0:new             #8   <Class StreetViewPanoramaCamera$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #68  <Method void StreetViewPanoramaCamera$Builder(StreetViewPanoramaCamera)>
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
		if(!(obj instanceof StreetViewPanoramaCamera))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class StreetViewPanoramaCamera>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((StreetViewPanoramaCamera)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class StreetViewPanoramaCamera>
	//   12   20:astore_1        
		return Float.floatToIntBits(zoom) == Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).zoom) && Float.floatToIntBits(tilt) == Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).tilt) && Float.floatToIntBits(bearing) == Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).bearing);
	//   13   21:aload_0         
	//   14   22:getfield        #42  <Field float zoom>
	//   15   25:invokestatic    #76  <Method int Float.floatToIntBits(float)>
	//   16   28:aload_1         
	//   17   29:getfield        #42  <Field float zoom>
	//   18   32:invokestatic    #76  <Method int Float.floatToIntBits(float)>
	//   19   35:icmpne          74
	//   20   38:aload_0         
	//   21   39:getfield        #44  <Field float tilt>
	//   22   42:invokestatic    #76  <Method int Float.floatToIntBits(float)>
	//   23   45:aload_1         
	//   24   46:getfield        #44  <Field float tilt>
	//   25   49:invokestatic    #76  <Method int Float.floatToIntBits(float)>
	//   26   52:icmpne          74
	//   27   55:aload_0         
	//   28   56:getfield        #47  <Field float bearing>
	//   29   59:invokestatic    #76  <Method int Float.floatToIntBits(float)>
	//   30   62:aload_1         
	//   31   63:getfield        #47  <Field float bearing>
	//   32   66:invokestatic    #76  <Method int Float.floatToIntBits(float)>
	//   33   69:icmpne          74
	//   34   72:iconst_1        
	//   35   73:ireturn         
	//   36   74:iconst_0        
	//   37   75:ireturn         
	}

	public StreetViewPanoramaOrientation getOrientation()
	{
		return zzbpU;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field StreetViewPanoramaOrientation zzbpU>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field float zoom>
	//    6   10:invokestatic    #85  <Method Float Float.valueOf(float)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #44  <Field float tilt>
	//   12   20:invokestatic    #85  <Method Float Float.valueOf(float)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #47  <Field float bearing>
	//   18   30:invokestatic    #85  <Method Float Float.valueOf(float)>
	//   19   33:aastore         
	//   20   34:invokestatic    #90  <Method int zzaa.hashCode(Object[])>
	//   21   37:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("zoom", ((Object) (Float.valueOf(zoom)))).zzg("tilt", ((Object) (Float.valueOf(tilt)))).zzg("bearing", ((Object) (Float.valueOf(bearing)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #96  <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #97  <String "zoom">
	//    3    6:aload_0         
	//    4    7:getfield        #42  <Field float zoom>
	//    5   10:invokestatic    #85  <Method Float Float.valueOf(float)>
	//    6   13:invokevirtual   #103 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    7   16:ldc1            #104 <String "tilt">
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field float tilt>
	//   10   22:invokestatic    #85  <Method Float Float.valueOf(float)>
	//   11   25:invokevirtual   #103 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   12   28:ldc1            #105 <String "bearing">
	//   13   30:aload_0         
	//   14   31:getfield        #47  <Field float bearing>
	//   15   34:invokestatic    #85  <Method Float Float.valueOf(float)>
	//   16   37:invokevirtual   #103 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   17   40:invokevirtual   #107 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   18   43:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zzm.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #113 <Method void com.google.android.gms.maps.model.zzm.zza(StreetViewPanoramaCamera, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzm();
	public final float bearing;
	public final float tilt;
	public final float zoom;
	private StreetViewPanoramaOrientation zzbpU;

	static 
	{
	//    0    0:new             #22  <Class zzm>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzm()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
