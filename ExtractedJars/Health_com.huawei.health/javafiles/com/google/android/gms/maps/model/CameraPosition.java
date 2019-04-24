// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.maps.model:
//			zza, LatLng

public final class CameraPosition extends zza
	implements ReflectedParcelable
{
	public static final class Builder
	{

		public Builder bearing(float f)
		{
			zzbpd = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #39  <Field float zzbpd>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public CameraPosition build()
		{
			return new CameraPosition(zzbpa, zzbpb, zzbpc, zzbpd);
		//    0    0:new             #6   <Class CameraPosition>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field LatLng zzbpa>
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field float zzbpb>
		//    6   12:aload_0         
		//    7   13:getfield        #34  <Field float zzbpc>
		//    8   16:aload_0         
		//    9   17:getfield        #39  <Field float zzbpd>
		//   10   20:invokespecial   #45  <Method void CameraPosition(LatLng, float, float, float)>
		//   11   23:areturn         
		}

		public Builder target(LatLng latlng)
		{
			zzbpa = latlng;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field LatLng zzbpa>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder tilt(float f)
		{
			zzbpc = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #34  <Field float zzbpc>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder zoom(float f)
		{
			zzbpb = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #29  <Field float zzbpb>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private LatLng zzbpa;
		private float zzbpb;
		private float zzbpc;
		private float zzbpd;

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
			zzbpa = cameraposition.target;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #22  <Field LatLng CameraPosition.target>
		//    5    9:putfield        #24  <Field LatLng zzbpa>
			zzbpb = cameraposition.zoom;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #27  <Field float CameraPosition.zoom>
		//    9   17:putfield        #29  <Field float zzbpb>
			zzbpc = cameraposition.tilt;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #32  <Field float CameraPosition.tilt>
		//   13   25:putfield        #34  <Field float zzbpc>
			zzbpd = cameraposition.bearing;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:getfield        #37  <Field float CameraPosition.bearing>
		//   17   33:putfield        #39  <Field float zzbpd>
		//   18   36:return          
		}
	}


	public CameraPosition(LatLng latlng, float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zza()>
		zzac.zzb(((Object) (latlng)), "null camera target");
	//    2    4:aload_1         
	//    3    5:ldc1            #32  <String "null camera target">
	//    4    7:invokestatic    #38  <Method Object zzac.zzb(Object, Object)>
	//    5   10:pop             
		boolean flag;
		if(0.0F <= f1 && f1 <= 90F)
	//*   6   11:fconst_0        
	//*   7   12:fload_3         
	//*   8   13:fcmpg           
	//*   9   14:ifgt            30
	//*  10   17:fload_3         
	//*  11   18:ldc1            #39  <Float 90F>
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
		zzac.zzb(flag, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[] {
			Float.valueOf(f1)
		});
	//   19   33:iload           5
	//   20   35:ldc1            #41  <String "Tilt needs to be between 0 and 90 inclusive: %s">
	//   21   37:iconst_1        
	//   22   38:anewarray       Object[]
	//   23   41:dup             
	//   24   42:iconst_0        
	//   25   43:fload_3         
	//   26   44:invokestatic    #49  <Method Float Float.valueOf(float)>
	//   27   47:aastore         
	//   28   48:invokestatic    #52  <Method void zzac.zzb(boolean, String, Object[])>
		target = latlng;
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:putfield        #54  <Field LatLng target>
		zoom = f;
	//   32   56:aload_0         
	//   33   57:fload_2         
	//   34   58:putfield        #56  <Field float zoom>
		tilt = 0.0F + f1;
	//   35   61:aload_0         
	//   36   62:fconst_0        
	//   37   63:fload_3         
	//   38   64:fadd            
	//   39   65:putfield        #58  <Field float tilt>
		if((double)f2 <= 0.0D)
	//*  40   68:fload           4
	//*  41   70:f2d             
	//*  42   71:dconst_0        
	//*  43   72:dcmpg           
	//*  44   73:ifgt            89
			f2 = f2 % 360F + 360F;
	//   45   76:fload           4
	//   46   78:ldc1            #59  <Float 360F>
	//   47   80:frem            
	//   48   81:ldc1            #59  <Float 360F>
	//   49   83:fadd            
	//   50   84:fstore          4
	//*  51   86:goto            89
		bearing = f2 % 360F;
	//   52   89:aload_0         
	//   53   90:fload           4
	//   54   92:ldc1            #59  <Float 360F>
	//   55   94:frem            
	//   56   95:putfield        #61  <Field float bearing>
	//   57   98:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #8   <Class CameraPosition$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void CameraPosition$Builder()>
	//    3    7:areturn         
	}

	public static Builder builder(CameraPosition cameraposition)
	{
		return new Builder(cameraposition);
	//    0    0:new             #8   <Class CameraPosition$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #68  <Method void CameraPosition$Builder(CameraPosition)>
	//    4    8:areturn         
	}

	public static CameraPosition createFromAttributes(Context context, AttributeSet attributeset)
	{
		if(attributeset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		context = ((Context) (context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.MapAttrs)));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #76  <Method Resources Context.getResources()>
	//    6   10:aload_1         
	//    7   11:getstatic       #82  <Field int[] com.google.android.gms.R$styleable.MapAttrs>
	//    8   14:invokevirtual   #88  <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//    9   17:astore_0        
		float f = 0.0F;
	//   10   18:fconst_0        
	//   11   19:fstore_2        
		float f1 = 0.0F;
	//   12   20:fconst_0        
	//   13   21:fstore_3        
		if(((TypedArray) (context)).hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraTargetLat))
	//*  14   22:aload_0         
	//*  15   23:getstatic       #92  <Field int com.google.android.gms.R$styleable.MapAttrs_cameraTargetLat>
	//*  16   26:invokevirtual   #98  <Method boolean TypedArray.hasValue(int)>
	//*  17   29:ifeq            41
			f = ((TypedArray) (context)).getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraTargetLat, 0.0F);
	//   18   32:aload_0         
	//   19   33:getstatic       #92  <Field int com.google.android.gms.R$styleable.MapAttrs_cameraTargetLat>
	//   20   36:fconst_0        
	//   21   37:invokevirtual   #102 <Method float TypedArray.getFloat(int, float)>
	//   22   40:fstore_2        
		if(((TypedArray) (context)).hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraTargetLng))
	//*  23   41:aload_0         
	//*  24   42:getstatic       #105 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraTargetLng>
	//*  25   45:invokevirtual   #98  <Method boolean TypedArray.hasValue(int)>
	//*  26   48:ifeq            60
			f1 = ((TypedArray) (context)).getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraTargetLng, 0.0F);
	//   27   51:aload_0         
	//   28   52:getstatic       #105 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraTargetLng>
	//   29   55:fconst_0        
	//   30   56:invokevirtual   #102 <Method float TypedArray.getFloat(int, float)>
	//   31   59:fstore_3        
		attributeset = ((AttributeSet) (new LatLng(f, f1)));
	//   32   60:new             #107 <Class LatLng>
	//   33   63:dup             
	//   34   64:fload_2         
	//   35   65:f2d             
	//   36   66:fload_3         
	//   37   67:f2d             
	//   38   68:invokespecial   #110 <Method void LatLng(double, double)>
	//   39   71:astore_1        
		Builder builder1 = builder();
	//   40   72:invokestatic    #112 <Method CameraPosition$Builder builder()>
	//   41   75:astore          4
		builder1.target(((LatLng) (attributeset)));
	//   42   77:aload           4
	//   43   79:aload_1         
	//   44   80:invokevirtual   #115 <Method CameraPosition$Builder CameraPosition$Builder.target(LatLng)>
	//   45   83:pop             
		if(((TypedArray) (context)).hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraZoom))
	//*  46   84:aload_0         
	//*  47   85:getstatic       #118 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraZoom>
	//*  48   88:invokevirtual   #98  <Method boolean TypedArray.hasValue(int)>
	//*  49   91:ifeq            108
			builder1.zoom(((TypedArray) (context)).getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraZoom, 0.0F));
	//   50   94:aload           4
	//   51   96:aload_0         
	//   52   97:getstatic       #118 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraZoom>
	//   53  100:fconst_0        
	//   54  101:invokevirtual   #102 <Method float TypedArray.getFloat(int, float)>
	//   55  104:invokevirtual   #121 <Method CameraPosition$Builder CameraPosition$Builder.zoom(float)>
	//   56  107:pop             
		if(((TypedArray) (context)).hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraBearing))
	//*  57  108:aload_0         
	//*  58  109:getstatic       #124 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraBearing>
	//*  59  112:invokevirtual   #98  <Method boolean TypedArray.hasValue(int)>
	//*  60  115:ifeq            132
			builder1.bearing(((TypedArray) (context)).getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraBearing, 0.0F));
	//   61  118:aload           4
	//   62  120:aload_0         
	//   63  121:getstatic       #124 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraBearing>
	//   64  124:fconst_0        
	//   65  125:invokevirtual   #102 <Method float TypedArray.getFloat(int, float)>
	//   66  128:invokevirtual   #126 <Method CameraPosition$Builder CameraPosition$Builder.bearing(float)>
	//   67  131:pop             
		if(((TypedArray) (context)).hasValue(com.google.android.gms.R.styleable.MapAttrs_cameraTilt))
	//*  68  132:aload_0         
	//*  69  133:getstatic       #129 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraTilt>
	//*  70  136:invokevirtual   #98  <Method boolean TypedArray.hasValue(int)>
	//*  71  139:ifeq            156
			builder1.tilt(((TypedArray) (context)).getFloat(com.google.android.gms.R.styleable.MapAttrs_cameraTilt, 0.0F));
	//   72  142:aload           4
	//   73  144:aload_0         
	//   74  145:getstatic       #129 <Field int com.google.android.gms.R$styleable.MapAttrs_cameraTilt>
	//   75  148:fconst_0        
	//   76  149:invokevirtual   #102 <Method float TypedArray.getFloat(int, float)>
	//   77  152:invokevirtual   #131 <Method CameraPosition$Builder CameraPosition$Builder.tilt(float)>
	//   78  155:pop             
		return builder1.build();
	//   79  156:aload           4
	//   80  158:invokevirtual   #135 <Method CameraPosition CameraPosition$Builder.build()>
	//   81  161:areturn         
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
	//    6    8:invokespecial   #139 <Method void CameraPosition(LatLng, float, float, float)>
	//    7   11:areturn         
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
	//   14   22:getfield        #54  <Field LatLng target>
	//   15   25:aload_1         
	//   16   26:getfield        #54  <Field LatLng target>
	//   17   29:invokevirtual   #143 <Method boolean LatLng.equals(Object)>
	//   18   32:ifeq            88
	//   19   35:aload_0         
	//   20   36:getfield        #56  <Field float zoom>
	//   21   39:invokestatic    #147 <Method int Float.floatToIntBits(float)>
	//   22   42:aload_1         
	//   23   43:getfield        #56  <Field float zoom>
	//   24   46:invokestatic    #147 <Method int Float.floatToIntBits(float)>
	//   25   49:icmpne          88
	//   26   52:aload_0         
	//   27   53:getfield        #58  <Field float tilt>
	//   28   56:invokestatic    #147 <Method int Float.floatToIntBits(float)>
	//   29   59:aload_1         
	//   30   60:getfield        #58  <Field float tilt>
	//   31   63:invokestatic    #147 <Method int Float.floatToIntBits(float)>
	//   32   66:icmpne          88
	//   33   69:aload_0         
	//   34   70:getfield        #61  <Field float bearing>
	//   35   73:invokestatic    #147 <Method int Float.floatToIntBits(float)>
	//   36   76:aload_1         
	//   37   77:getfield        #61  <Field float bearing>
	//   38   80:invokestatic    #147 <Method int Float.floatToIntBits(float)>
	//   39   83:icmpne          88
	//   40   86:iconst_1        
	//   41   87:ireturn         
	//   42   88:iconst_0        
	//   43   89:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			target, Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #54  <Field LatLng target>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #56  <Field float zoom>
	//   11   17:invokestatic    #49  <Method Float Float.valueOf(float)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #58  <Field float tilt>
	//   17   27:invokestatic    #49  <Method Float Float.valueOf(float)>
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_3        
	//   21   33:aload_0         
	//   22   34:getfield        #61  <Field float bearing>
	//   23   37:invokestatic    #49  <Method Float Float.valueOf(float)>
	//   24   40:aastore         
	//   25   41:invokestatic    #154 <Method int zzaa.hashCode(Object[])>
	//   26   44:ireturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("target", ((Object) (target))).zzg("zoom", ((Object) (Float.valueOf(zoom)))).zzg("tilt", ((Object) (Float.valueOf(tilt)))).zzg("bearing", ((Object) (Float.valueOf(bearing)))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #160 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #161 <String "target">
	//    3    6:aload_0         
	//    4    7:getfield        #54  <Field LatLng target>
	//    5   10:invokevirtual   #167 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #168 <String "zoom">
	//    7   15:aload_0         
	//    8   16:getfield        #56  <Field float zoom>
	//    9   19:invokestatic    #49  <Method Float Float.valueOf(float)>
	//   10   22:invokevirtual   #167 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   11   25:ldc1            #169 <String "tilt">
	//   12   27:aload_0         
	//   13   28:getfield        #58  <Field float tilt>
	//   14   31:invokestatic    #49  <Method Float Float.valueOf(float)>
	//   15   34:invokevirtual   #167 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   16   37:ldc1            #170 <String "bearing">
	//   17   39:aload_0         
	//   18   40:getfield        #61  <Field float bearing>
	//   19   43:invokestatic    #49  <Method Float Float.valueOf(float)>
	//   20   46:invokevirtual   #167 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   21   49:invokevirtual   #172 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   22   52:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zza.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #178 <Method void com.google.android.gms.maps.model.zza.zza(CameraPosition, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.maps.model.zza();
	public final float bearing;
	public final LatLng target;
	public final float tilt;
	public final float zoom;

	static 
	{
	//    0    0:new             #22  <Class com.google.android.gms.maps.model.zza>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void com.google.android.gms.maps.model.zza()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
