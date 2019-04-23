// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.GoogleMapOptions;

// Referenced classes of package com.google.android.gms.maps.model:
//			zza, LatLng

public final class CameraPosition extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static final class Builder
	{

		public final Builder bearing(float f)
		{
			bearing = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #31  <Field float bearing>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final CameraPosition build()
		{
			return new CameraPosition(target, zoom, tilt, bearing);
		//    0    0:new             #6   <Class CameraPosition>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field LatLng target>
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field float zoom>
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field float tilt>
		//    8   16:aload_0         
		//    9   17:getfield        #31  <Field float bearing>
		//   10   20:invokespecial   #37  <Method void CameraPosition(LatLng, float, float, float)>
		//   11   23:areturn         
		}

		public final Builder target(LatLng latlng)
		{
			target = latlng;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field LatLng target>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder tilt(float f)
		{
			tilt = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #28  <Field float tilt>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public final Builder zoom(float f)
		{
			zoom = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #25  <Field float zoom>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private float bearing;
		private LatLng target;
		private float tilt;
		private float zoom;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

		public Builder(CameraPosition cameraposition)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			target = cameraposition.target;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #21  <Field LatLng CameraPosition.target>
		//    5    9:putfield        #22  <Field LatLng target>
			zoom = cameraposition.zoom;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #24  <Field float CameraPosition.zoom>
		//    9   17:putfield        #25  <Field float zoom>
			tilt = cameraposition.tilt;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #27  <Field float CameraPosition.tilt>
		//   13   25:putfield        #28  <Field float tilt>
			bearing = cameraposition.bearing;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:getfield        #30  <Field float CameraPosition.bearing>
		//   17   33:putfield        #31  <Field float bearing>
		//   18   36:return          
		}
	}


	public CameraPosition(LatLng latlng, float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void AbstractSafeParcelable()>
		Preconditions.checkNotNull(((Object) (latlng)), "null camera target");
	//    2    4:aload_1         
	//    3    5:ldc1            #46  <String "null camera target">
	//    4    7:invokestatic    #52  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		boolean flag;
		if(0.0F <= f1 && f1 <= 90F)
	//*   6   11:fconst_0        
	//*   7   12:fload_3         
	//*   8   13:fcmpg           
	//*   9   14:ifgt            30
	//*  10   17:fload_3         
	//*  11   18:ldc1            #53  <Float 90F>
	//*  12   20:fcmpg           
	//*  13   21:ifgt            30
			flag = true;
	//   14   24:iconst_1        
	//   15   25:istore          5
		else
	//*  16   27:goto            33
			flag = false;
	//   17   30:iconst_0        
	//   18   31:istore          5
		Preconditions.checkArgument(flag, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[] {
			Float.valueOf(f1)
		});
	//   19   33:iload           5
	//   20   35:ldc1            #55  <String "Tilt needs to be between 0 and 90 inclusive: %s">
	//   21   37:iconst_1        
	//   22   38:anewarray       Object[]
	//   23   41:dup             
	//   24   42:iconst_0        
	//   25   43:fload_3         
	//   26   44:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   27   47:aastore         
	//   28   48:invokestatic    #67  <Method void Preconditions.checkArgument(boolean, String, Object[])>
		target = latlng;
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:putfield        #69  <Field LatLng target>
		zoom = f;
	//   32   56:aload_0         
	//   33   57:fload_2         
	//   34   58:putfield        #71  <Field float zoom>
		tilt = f1 + 0.0F;
	//   35   61:aload_0         
	//   36   62:fload_3         
	//   37   63:fconst_0        
	//   38   64:fadd            
	//   39   65:putfield        #73  <Field float tilt>
		f = f2;
	//   40   68:fload           4
	//   41   70:fstore_2        
		if((double)f2 <= 0.0D)
	//*  42   71:fload           4
	//*  43   73:f2d             
	//*  44   74:dconst_0        
	//*  45   75:dcmpg           
	//*  46   76:ifgt            88
			f = f2 % 360F + 360F;
	//   47   79:fload           4
	//   48   81:ldc1            #74  <Float 360F>
	//   49   83:frem            
	//   50   84:ldc1            #74  <Float 360F>
	//   51   86:fadd            
	//   52   87:fstore_2        
		bearing = f % 360F;
	//   53   88:aload_0         
	//   54   89:fload_2         
	//   55   90:ldc1            #74  <Float 360F>
	//   56   92:frem            
	//   57   93:putfield        #76  <Field float bearing>
	//   58   96:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #8   <Class CameraPosition$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void CameraPosition$Builder()>
	//    3    7:areturn         
	}

	public static Builder builder(CameraPosition cameraposition)
	{
		return new Builder(cameraposition);
	//    0    0:new             #8   <Class CameraPosition$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #85  <Method void CameraPosition$Builder(CameraPosition)>
	//    4    8:areturn         
	}

	public static CameraPosition createFromAttributes(Context context, AttributeSet attributeset)
	{
		return GoogleMapOptions.zzb(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #92  <Method CameraPosition GoogleMapOptions.zzb(Context, AttributeSet)>
	//    3    5:areturn         
	}

	public static final CameraPosition fromLatLngZoom(LatLng latlng, float f)
	{
		return new CameraPosition(latlng, f, 0.0F, 0.0F);
	//    0    0:new             #2   <Class CameraPosition>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:fconst_0        
	//    5    7:fconst_0        
	//    6    8:invokespecial   #96  <Method void CameraPosition(LatLng, float, float, float)>
	//    7   11:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof CameraPosition))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class CameraPosition>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((CameraPosition)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class CameraPosition>
	//   12   20:astore_1        
		return target.equals(((Object) (((CameraPosition) (obj)).target))) && Float.floatToIntBits(zoom) == Float.floatToIntBits(((CameraPosition) (obj)).zoom) && Float.floatToIntBits(tilt) == Float.floatToIntBits(((CameraPosition) (obj)).tilt) && Float.floatToIntBits(bearing) == Float.floatToIntBits(((CameraPosition) (obj)).bearing);
	//   13   21:aload_0         
	//   14   22:getfield        #69  <Field LatLng target>
	//   15   25:aload_1         
	//   16   26:getfield        #69  <Field LatLng target>
	//   17   29:invokevirtual   #102 <Method boolean LatLng.equals(Object)>
	//   18   32:ifeq            88
	//   19   35:aload_0         
	//   20   36:getfield        #71  <Field float zoom>
	//   21   39:invokestatic    #106 <Method int Float.floatToIntBits(float)>
	//   22   42:aload_1         
	//   23   43:getfield        #71  <Field float zoom>
	//   24   46:invokestatic    #106 <Method int Float.floatToIntBits(float)>
	//   25   49:icmpne          88
	//   26   52:aload_0         
	//   27   53:getfield        #73  <Field float tilt>
	//   28   56:invokestatic    #106 <Method int Float.floatToIntBits(float)>
	//   29   59:aload_1         
	//   30   60:getfield        #73  <Field float tilt>
	//   31   63:invokestatic    #106 <Method int Float.floatToIntBits(float)>
	//   32   66:icmpne          88
	//   33   69:aload_0         
	//   34   70:getfield        #76  <Field float bearing>
	//   35   73:invokestatic    #106 <Method int Float.floatToIntBits(float)>
	//   36   76:aload_1         
	//   37   77:getfield        #76  <Field float bearing>
	//   38   80:invokestatic    #106 <Method int Float.floatToIntBits(float)>
	//   39   83:icmpne          88
	//   40   86:iconst_1        
	//   41   87:ireturn         
	//   42   88:iconst_0        
	//   43   89:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			target, Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #69  <Field LatLng target>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #71  <Field float zoom>
	//   11   17:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #73  <Field float tilt>
	//   17   27:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #76  <Field float bearing>
	//   23   37:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   24   40:aastore         
	//   25   41:invokestatic    #113 <Method int Objects.hashCode(Object[])>
	//   26   44:ireturn         
	}

	public final String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("target", ((Object) (target))).add("zoom", ((Object) (Float.valueOf(zoom)))).add("tilt", ((Object) (Float.valueOf(tilt)))).add("bearing", ((Object) (Float.valueOf(bearing)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #119 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #120 <String "target">
	//    3    6:aload_0         
	//    4    7:getfield        #69  <Field LatLng target>
	//    5   10:invokevirtual   #126 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #127 <String "zoom">
	//    7   15:aload_0         
	//    8   16:getfield        #71  <Field float zoom>
	//    9   19:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   10   22:invokevirtual   #126 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   11   25:ldc1            #128 <String "tilt">
	//   12   27:aload_0         
	//   13   28:getfield        #73  <Field float tilt>
	//   14   31:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   15   34:invokevirtual   #126 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   16   37:ldc1            #129 <String "bearing">
	//   17   39:aload_0         
	//   18   40:getfield        #76  <Field float bearing>
	//   19   43:invokestatic    #63  <Method Float Float.valueOf(float)>
	//   20   46:invokevirtual   #126 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   21   49:invokevirtual   #131 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   22   52:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #139 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (target)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #69  <Field LatLng target>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #143 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeFloat(parcel, 3, zoom);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #71  <Field float zoom>
	//   14   22:invokestatic    #147 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 4, tilt);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #73  <Field float tilt>
	//   19   31:invokestatic    #147 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeFloat(parcel, 5, bearing);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:getfield        #76  <Field float bearing>
	//   24   40:invokestatic    #147 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:invokestatic    #150 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   28   48:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	public final float bearing;
	public final LatLng target;
	public final float tilt;
	public final float zoom;

	static 
	{
	//    0    0:new             #34  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void zza()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
