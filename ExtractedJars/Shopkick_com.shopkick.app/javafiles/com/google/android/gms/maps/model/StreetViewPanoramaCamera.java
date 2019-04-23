// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzm, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static final class Builder
	{

		public final Builder bearing(float f)
		{
			bearing = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #32  <Field float bearing>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final StreetViewPanoramaCamera build()
		{
			return new StreetViewPanoramaCamera(zoom, tilt, bearing);
		//    0    0:new             #6   <Class StreetViewPanoramaCamera>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field float zoom>
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field float tilt>
		//    6   12:aload_0         
		//    7   13:getfield        #32  <Field float bearing>
		//    8   16:invokespecial   #42  <Method void StreetViewPanoramaCamera(float, float, float)>
		//    9   19:areturn         
		}

		public final Builder orientation(StreetViewPanoramaOrientation streetviewpanoramaorientation)
		{
			Preconditions.checkNotNull(((Object) (streetviewpanoramaorientation)), "StreetViewPanoramaOrientation");
		//    0    0:aload_1         
		//    1    1:ldc1            #46  <String "StreetViewPanoramaOrientation">
		//    2    3:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    3    6:pop             
			tilt = streetviewpanoramaorientation.tilt;
		//    4    7:aload_0         
		//    5    8:aload_1         
		//    6    9:getfield        #49  <Field float StreetViewPanoramaOrientation.tilt>
		//    7   12:putfield        #35  <Field float tilt>
			bearing = streetviewpanoramaorientation.bearing;
		//    8   15:aload_0         
		//    9   16:aload_1         
		//   10   17:getfield        #50  <Field float StreetViewPanoramaOrientation.bearing>
		//   11   20:putfield        #32  <Field float bearing>
			return this;
		//   12   23:aload_0         
		//   13   24:areturn         
		}

		public final Builder tilt(float f)
		{
			tilt = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #35  <Field float tilt>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder zoom(float f)
		{
			zoom = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #29  <Field float zoom>
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
			Preconditions.checkNotNull(((Object) (streetviewpanoramacamera)), "StreetViewPanoramaCamera");
		//    2    4:aload_1         
		//    3    5:ldc1            #20  <String "StreetViewPanoramaCamera">
		//    4    7:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    5   10:pop             
			zoom = streetviewpanoramacamera.zoom;
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:getfield        #28  <Field float StreetViewPanoramaCamera.zoom>
		//    9   16:putfield        #29  <Field float zoom>
			bearing = streetviewpanoramacamera.bearing;
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:getfield        #31  <Field float StreetViewPanoramaCamera.bearing>
		//   13   24:putfield        #32  <Field float bearing>
			tilt = streetviewpanoramacamera.tilt;
		//   14   27:aload_0         
		//   15   28:aload_1         
		//   16   29:getfield        #34  <Field float StreetViewPanoramaCamera.tilt>
		//   17   32:putfield        #35  <Field float tilt>
		//   18   35:return          
		}
	}


	public StreetViewPanoramaCamera(float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void AbstractSafeParcelable()>
		boolean flag;
		if(-90F <= f1 && f1 <= 90F)
	//*   2    4:ldc1            #45  <Float -90F>
	//*   3    6:fload_2         
	//*   4    7:fcmpg           
	//*   5    8:ifgt            24
	//*   6   11:fload_2         
	//*   7   12:ldc1            #46  <Float 90F>
	//*   8   14:fcmpg           
	//*   9   15:ifgt            24
			flag = true;
	//   10   18:iconst_1        
	//   11   19:istore          5
		else
	//*  12   21:goto            27
			flag = false;
	//   13   24:iconst_0        
	//   14   25:istore          5
		StringBuilder stringbuilder = new StringBuilder(62);
	//   15   27:new             #48  <Class StringBuilder>
	//   16   30:dup             
	//   17   31:bipush          62
	//   18   33:invokespecial   #51  <Method void StringBuilder(int)>
	//   19   36:astore          6
		stringbuilder.append("Tilt needs to be between -90 and 90 inclusive: ");
	//   20   38:aload           6
	//   21   40:ldc1            #53  <String "Tilt needs to be between -90 and 90 inclusive: ">
	//   22   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append(f1);
	//   24   46:aload           6
	//   25   48:fload_2         
	//   26   49:invokevirtual   #60  <Method StringBuilder StringBuilder.append(float)>
	//   27   52:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   28   53:iload           5
	//   29   55:aload           6
	//   30   57:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   31   60:invokestatic    #70  <Method void Preconditions.checkArgument(boolean, Object)>
		float f3 = f;
	//   32   63:fload_1         
	//   33   64:fstore          4
		if((double)f <= 0.0D)
	//*  34   66:fload_1         
	//*  35   67:f2d             
	//*  36   68:dconst_0        
	//*  37   69:dcmpg           
	//*  38   70:ifgt            76
			f3 = 0.0F;
	//   39   73:fconst_0        
	//   40   74:fstore          4
		zoom = f3;
	//   41   76:aload_0         
	//   42   77:fload           4
	//   43   79:putfield        #72  <Field float zoom>
		tilt = 0.0F + f1;
	//   44   82:aload_0         
	//   45   83:fconst_0        
	//   46   84:fload_2         
	//   47   85:fadd            
	//   48   86:putfield        #74  <Field float tilt>
		if((double)f2 <= 0.0D)
	//*  49   89:fload_3         
	//*  50   90:f2d             
	//*  51   91:dconst_0        
	//*  52   92:dcmpg           
	//*  53   93:ifgt            107
			f = f2 % 360F + 360F;
	//   54   96:fload_3         
	//   55   97:ldc1            #75  <Float 360F>
	//   56   99:frem            
	//   57  100:ldc1            #75  <Float 360F>
	//   58  102:fadd            
	//   59  103:fstore_1        
		else
	//*  60  104:goto            109
			f = f2;
	//   61  107:fload_3         
	//   62  108:fstore_1        
		bearing = f % 360F;
	//   63  109:aload_0         
	//   64  110:fload_1         
	//   65  111:ldc1            #75  <Float 360F>
	//   66  113:frem            
	//   67  114:putfield        #77  <Field float bearing>
		zzef = (new StreetViewPanoramaOrientation.Builder()).tilt(f1).bearing(f2).build();
	//   68  117:aload_0         
	//   69  118:new             #79  <Class StreetViewPanoramaOrientation$Builder>
	//   70  121:dup             
	//   71  122:invokespecial   #80  <Method void StreetViewPanoramaOrientation$Builder()>
	//   72  125:fload_2         
	//   73  126:invokevirtual   #83  <Method StreetViewPanoramaOrientation$Builder StreetViewPanoramaOrientation$Builder.tilt(float)>
	//   74  129:fload_3         
	//   75  130:invokevirtual   #85  <Method StreetViewPanoramaOrientation$Builder StreetViewPanoramaOrientation$Builder.bearing(float)>
	//   76  133:invokevirtual   #89  <Method StreetViewPanoramaOrientation StreetViewPanoramaOrientation$Builder.build()>
	//   77  136:putfield        #91  <Field StreetViewPanoramaOrientation zzef>
	//   78  139:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #8   <Class StreetViewPanoramaCamera$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void StreetViewPanoramaCamera$Builder()>
	//    3    7:areturn         
	}

	public static Builder builder(StreetViewPanoramaCamera streetviewpanoramacamera)
	{
		return new Builder(streetviewpanoramacamera);
	//    0    0:new             #8   <Class StreetViewPanoramaCamera$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #100 <Method void StreetViewPanoramaCamera$Builder(StreetViewPanoramaCamera)>
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
	//   14   22:getfield        #72  <Field float zoom>
	//   15   25:invokestatic    #108 <Method int Float.floatToIntBits(float)>
	//   16   28:aload_1         
	//   17   29:getfield        #72  <Field float zoom>
	//   18   32:invokestatic    #108 <Method int Float.floatToIntBits(float)>
	//   19   35:icmpne          74
	//   20   38:aload_0         
	//   21   39:getfield        #74  <Field float tilt>
	//   22   42:invokestatic    #108 <Method int Float.floatToIntBits(float)>
	//   23   45:aload_1         
	//   24   46:getfield        #74  <Field float tilt>
	//   25   49:invokestatic    #108 <Method int Float.floatToIntBits(float)>
	//   26   52:icmpne          74
	//   27   55:aload_0         
	//   28   56:getfield        #77  <Field float bearing>
	//   29   59:invokestatic    #108 <Method int Float.floatToIntBits(float)>
	//   30   62:aload_1         
	//   31   63:getfield        #77  <Field float bearing>
	//   32   66:invokestatic    #108 <Method int Float.floatToIntBits(float)>
	//   33   69:icmpne          74
	//   34   72:iconst_1        
	//   35   73:ireturn         
	//   36   74:iconst_0        
	//   37   75:ireturn         
	}

	public StreetViewPanoramaOrientation getOrientation()
	{
		return zzef;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field StreetViewPanoramaOrientation zzef>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #72  <Field float zoom>
	//    6   10:invokestatic    #117 <Method Float Float.valueOf(float)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #74  <Field float tilt>
	//   12   20:invokestatic    #117 <Method Float Float.valueOf(float)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #77  <Field float bearing>
	//   18   30:invokestatic    #117 <Method Float Float.valueOf(float)>
	//   19   33:aastore         
	//   20   34:invokestatic    #122 <Method int Objects.hashCode(Object[])>
	//   21   37:ireturn         
	}

	public String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("zoom", ((Object) (Float.valueOf(zoom)))).add("tilt", ((Object) (Float.valueOf(tilt)))).add("bearing", ((Object) (Float.valueOf(bearing)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #127 <String "zoom">
	//    3    6:aload_0         
	//    4    7:getfield        #72  <Field float zoom>
	//    5   10:invokestatic    #117 <Method Float Float.valueOf(float)>
	//    6   13:invokevirtual   #133 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    7   16:ldc1            #134 <String "tilt">
	//    8   18:aload_0         
	//    9   19:getfield        #74  <Field float tilt>
	//   10   22:invokestatic    #117 <Method Float Float.valueOf(float)>
	//   11   25:invokevirtual   #133 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   12   28:ldc1            #135 <String "bearing">
	//   13   30:aload_0         
	//   14   31:getfield        #77  <Field float bearing>
	//   15   34:invokestatic    #117 <Method Float Float.valueOf(float)>
	//   16   37:invokevirtual   #133 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   17   40:invokevirtual   #136 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   18   43:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #144 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeFloat(parcel, 2, zoom);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #72  <Field float zoom>
	//    7   11:invokestatic    #148 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 3, tilt);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #74  <Field float tilt>
	//   12   20:invokestatic    #148 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 4, bearing);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #77  <Field float bearing>
	//   17   29:invokestatic    #148 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #151 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzm();
	public final float bearing;
	public final float tilt;
	public final float zoom;
	private final StreetViewPanoramaOrientation zzef;

	static 
	{
	//    0    0:new             #34  <Class zzm>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void zzm()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
