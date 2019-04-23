// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model:
//			zzp

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable
{
	public static final class Builder
	{

		public final Builder bearing(float f)
		{
			bearing = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #28  <Field float bearing>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final StreetViewPanoramaOrientation build()
		{
			return new StreetViewPanoramaOrientation(tilt, bearing);
		//    0    0:new             #6   <Class StreetViewPanoramaOrientation>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #31  <Field float tilt>
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field float bearing>
		//    6   12:invokespecial   #38  <Method void StreetViewPanoramaOrientation(float, float)>
		//    7   15:areturn         
		}

		public final Builder tilt(float f)
		{
			tilt = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #31  <Field float tilt>
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
			Preconditions.checkNotNull(((Object) (streetviewpanoramaorientation)), "StreetViewPanoramaOrientation");
		//    2    4:aload_1         
		//    3    5:ldc1            #19  <String "StreetViewPanoramaOrientation">
		//    4    7:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    5   10:pop             
			bearing = streetviewpanoramaorientation.bearing;
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:getfield        #27  <Field float StreetViewPanoramaOrientation.bearing>
		//    9   16:putfield        #28  <Field float bearing>
			tilt = streetviewpanoramaorientation.tilt;
		//   10   19:aload_0         
		//   11   20:aload_1         
		//   12   21:getfield        #30  <Field float StreetViewPanoramaOrientation.tilt>
		//   13   24:putfield        #31  <Field float tilt>
		//   14   27:return          
		}
	}


	public StreetViewPanoramaOrientation(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		boolean flag;
		if(-90F <= f && f <= 90F)
	//*   2    4:ldc1            #38  <Float -90F>
	//*   3    6:fload_1         
	//*   4    7:fcmpg           
	//*   5    8:ifgt            23
	//*   6   11:fload_1         
	//*   7   12:ldc1            #39  <Float 90F>
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
		StringBuilder stringbuilder = new StringBuilder(62);
	//   15   25:new             #41  <Class StringBuilder>
	//   16   28:dup             
	//   17   29:bipush          62
	//   18   31:invokespecial   #44  <Method void StringBuilder(int)>
	//   19   34:astore          4
		stringbuilder.append("Tilt needs to be between -90 and 90 inclusive: ");
	//   20   36:aload           4
	//   21   38:ldc1            #46  <String "Tilt needs to be between -90 and 90 inclusive: ">
	//   22   40:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(f);
	//   24   44:aload           4
	//   25   46:fload_1         
	//   26   47:invokevirtual   #53  <Method StringBuilder StringBuilder.append(float)>
	//   27   50:pop             
		Preconditions.checkArgument(flag, ((Object) (stringbuilder.toString())));
	//   28   51:iload_3         
	//   29   52:aload           4
	//   30   54:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   31   57:invokestatic    #63  <Method void Preconditions.checkArgument(boolean, Object)>
		tilt = f + 0.0F;
	//   32   60:aload_0         
	//   33   61:fload_1         
	//   34   62:fconst_0        
	//   35   63:fadd            
	//   36   64:putfield        #65  <Field float tilt>
		f = f1;
	//   37   67:fload_2         
	//   38   68:fstore_1        
		if((double)f1 <= 0.0D)
	//*  39   69:fload_2         
	//*  40   70:f2d             
	//*  41   71:dconst_0        
	//*  42   72:dcmpg           
	//*  43   73:ifgt            84
			f = f1 % 360F + 360F;
	//   44   76:fload_2         
	//   45   77:ldc1            #66  <Float 360F>
	//   46   79:frem            
	//   47   80:ldc1            #66  <Float 360F>
	//   48   82:fadd            
	//   49   83:fstore_1        
		bearing = f % 360F;
	//   50   84:aload_0         
	//   51   85:fload_1         
	//   52   86:ldc1            #66  <Float 360F>
	//   53   88:frem            
	//   54   89:putfield        #68  <Field float bearing>
	//   55   92:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #6   <Class StreetViewPanoramaOrientation$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void StreetViewPanoramaOrientation$Builder()>
	//    3    7:areturn         
	}

	public static Builder builder(StreetViewPanoramaOrientation streetviewpanoramaorientation)
	{
		return new Builder(streetviewpanoramaorientation);
	//    0    0:new             #6   <Class StreetViewPanoramaOrientation$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void StreetViewPanoramaOrientation$Builder(StreetViewPanoramaOrientation)>
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
	//   14   22:getfield        #65  <Field float tilt>
	//   15   25:invokestatic    #86  <Method int Float.floatToIntBits(float)>
	//   16   28:aload_1         
	//   17   29:getfield        #65  <Field float tilt>
	//   18   32:invokestatic    #86  <Method int Float.floatToIntBits(float)>
	//   19   35:icmpne          57
	//   20   38:aload_0         
	//   21   39:getfield        #68  <Field float bearing>
	//   22   42:invokestatic    #86  <Method int Float.floatToIntBits(float)>
	//   23   45:aload_1         
	//   24   46:getfield        #68  <Field float bearing>
	//   25   49:invokestatic    #86  <Method int Float.floatToIntBits(float)>
	//   26   52:icmpne          57
	//   27   55:iconst_1        
	//   28   56:ireturn         
	//   29   57:iconst_0        
	//   30   58:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Float.valueOf(tilt), Float.valueOf(bearing)
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #65  <Field float tilt>
	//    6   10:invokestatic    #94  <Method Float Float.valueOf(float)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #68  <Field float bearing>
	//   12   20:invokestatic    #94  <Method Float Float.valueOf(float)>
	//   13   23:aastore         
	//   14   24:invokestatic    #99  <Method int Objects.hashCode(Object[])>
	//   15   27:ireturn         
	}

	public String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("tilt", ((Object) (Float.valueOf(tilt)))).add("bearing", ((Object) (Float.valueOf(bearing)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #103 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #104 <String "tilt">
	//    3    6:aload_0         
	//    4    7:getfield        #65  <Field float tilt>
	//    5   10:invokestatic    #94  <Method Float Float.valueOf(float)>
	//    6   13:invokevirtual   #110 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    7   16:ldc1            #111 <String "bearing">
	//    8   18:aload_0         
	//    9   19:getfield        #68  <Field float bearing>
	//   10   22:invokestatic    #94  <Method Float Float.valueOf(float)>
	//   11   25:invokevirtual   #110 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   12   28:invokevirtual   #112 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   13   31:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #120 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeFloat(parcel, 2, tilt);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #65  <Field float tilt>
	//    7   11:invokestatic    #124 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 3, bearing);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #68  <Field float bearing>
	//   12   20:invokestatic    #124 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokestatic    #127 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   16   28:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzp();
	public final float bearing;
	public final float tilt;

	static 
	{
	//    0    0:new             #27  <Class zzp>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void zzp()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
