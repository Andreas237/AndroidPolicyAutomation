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
//			zze, LatLng

public final class LatLngBounds extends zza
	implements ReflectedParcelable
{
	public static final class Builder
	{

		private boolean zzi(double d)
		{
			if(zzbpy <= zzbpz)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field double zzbpy>
		//*   2    4:aload_0         
		//*   3    5:getfield        #30  <Field double zzbpz>
		//*   4    8:dcmpg           
		//*   5    9:ifgt            34
				return zzbpy <= d && d <= zzbpz;
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field double zzbpy>
		//    8   16:dload_1         
		//    9   17:dcmpg           
		//   10   18:ifgt            32
		//   11   21:dload_1         
		//   12   22:aload_0         
		//   13   23:getfield        #30  <Field double zzbpz>
		//   14   26:dcmpg           
		//   15   27:ifgt            32
		//   16   30:iconst_1        
		//   17   31:ireturn         
		//   18   32:iconst_0        
		//   19   33:ireturn         
			return zzbpy <= d || d <= zzbpz;
		//   20   34:aload_0         
		//   21   35:getfield        #28  <Field double zzbpy>
		//   22   38:dload_1         
		//   23   39:dcmpg           
		//   24   40:ifle            52
		//   25   43:dload_1         
		//   26   44:aload_0         
		//   27   45:getfield        #30  <Field double zzbpz>
		//   28   48:dcmpg           
		//   29   49:ifgt            54
		//   30   52:iconst_1        
		//   31   53:ireturn         
		//   32   54:iconst_0        
		//   33   55:ireturn         
		}

		public LatLngBounds build()
		{
			boolean flag;
			if(!Double.isNaN(zzbpy))
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field double zzbpy>
		//*   2    4:invokestatic    #40  <Method boolean Double.isNaN(double)>
		//*   3    7:ifne            15
				flag = true;
		//    4   10:iconst_1        
		//    5   11:istore_1        
			else
		//*   6   12:goto            17
				flag = false;
		//    7   15:iconst_0        
		//    8   16:istore_1        
			zzac.zza(flag, "no included points");
		//    9   17:iload_1         
		//   10   18:ldc1            #42  <String "no included points">
		//   11   20:invokestatic    #48  <Method void zzac.zza(boolean, Object)>
			return new LatLngBounds(new LatLng(zzbpw, zzbpy), new LatLng(zzbpx, zzbpz));
		//   12   23:new             #6   <Class LatLngBounds>
		//   13   26:dup             
		//   14   27:new             #50  <Class LatLng>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:getfield        #20  <Field double zzbpw>
		//   18   35:aload_0         
		//   19   36:getfield        #28  <Field double zzbpy>
		//   20   39:invokespecial   #53  <Method void LatLng(double, double)>
		//   21   42:new             #50  <Class LatLng>
		//   22   45:dup             
		//   23   46:aload_0         
		//   24   47:getfield        #24  <Field double zzbpx>
		//   25   50:aload_0         
		//   26   51:getfield        #30  <Field double zzbpz>
		//   27   54:invokespecial   #53  <Method void LatLng(double, double)>
		//   28   57:invokespecial   #56  <Method void LatLngBounds(LatLng, LatLng)>
		//   29   60:areturn         
		}

		public Builder include(LatLng latlng)
		{
			zzbpw = Math.min(zzbpw, latlng.latitude);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field double zzbpw>
		//    3    5:aload_1         
		//    4    6:getfield        #61  <Field double LatLng.latitude>
		//    5    9:invokestatic    #67  <Method double Math.min(double, double)>
		//    6   12:putfield        #20  <Field double zzbpw>
			zzbpx = Math.max(zzbpx, latlng.latitude);
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:getfield        #24  <Field double zzbpx>
		//   10   20:aload_1         
		//   11   21:getfield        #61  <Field double LatLng.latitude>
		//   12   24:invokestatic    #70  <Method double Math.max(double, double)>
		//   13   27:putfield        #24  <Field double zzbpx>
			double d = latlng.longitude;
		//   14   30:aload_1         
		//   15   31:getfield        #73  <Field double LatLng.longitude>
		//   16   34:dstore_2        
			if(Double.isNaN(zzbpy))
		//*  17   35:aload_0         
		//*  18   36:getfield        #28  <Field double zzbpy>
		//*  19   39:invokestatic    #40  <Method boolean Double.isNaN(double)>
		//*  20   42:ifeq            57
			{
				zzbpy = d;
		//   21   45:aload_0         
		//   22   46:dload_2         
		//   23   47:putfield        #28  <Field double zzbpy>
				zzbpz = d;
		//   24   50:aload_0         
		//   25   51:dload_2         
		//   26   52:putfield        #30  <Field double zzbpz>
				return this;
		//   27   55:aload_0         
		//   28   56:areturn         
			}
			if(!zzi(d))
		//*  29   57:aload_0         
		//*  30   58:dload_2         
		//*  31   59:invokespecial   #75  <Method boolean zzi(double)>
		//*  32   62:ifne            97
			{
				if(LatLngBounds.zzd(zzbpy, d) < LatLngBounds.zze(zzbpz, d))
		//*  33   65:aload_0         
		//*  34   66:getfield        #28  <Field double zzbpy>
		//*  35   69:dload_2         
		//*  36   70:invokestatic    #78  <Method double LatLngBounds.zzd(double, double)>
		//*  37   73:aload_0         
		//*  38   74:getfield        #30  <Field double zzbpz>
		//*  39   77:dload_2         
		//*  40   78:invokestatic    #81  <Method double LatLngBounds.zze(double, double)>
		//*  41   81:dcmpg           
		//*  42   82:ifge            92
				{
					zzbpy = d;
		//   43   85:aload_0         
		//   44   86:dload_2         
		//   45   87:putfield        #28  <Field double zzbpy>
					return this;
		//   46   90:aload_0         
		//   47   91:areturn         
				}
				zzbpz = d;
		//   48   92:aload_0         
		//   49   93:dload_2         
		//   50   94:putfield        #30  <Field double zzbpz>
			}
			return this;
		//   51   97:aload_0         
		//   52   98:areturn         
		}

		private double zzbpw;
		private double zzbpx;
		private double zzbpy;
		private double zzbpz;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzbpw = (1.0D / 0.0D);
		//    2    4:aload_0         
		//    3    5:ldc2w           #17  <Double (1.0D / 0.0D)>
		//    4    8:putfield        #20  <Field double zzbpw>
			zzbpx = (-1.0D / 0.0D);
		//    5   11:aload_0         
		//    6   12:ldc2w           #21  <Double (-1.0D / 0.0D)>
		//    7   15:putfield        #24  <Field double zzbpx>
			zzbpy = (0.0D / 0.0D);
		//    8   18:aload_0         
		//    9   19:ldc2w           #25  <Double (0.0D / 0.0D)>
		//   10   22:putfield        #28  <Field double zzbpy>
			zzbpz = (0.0D / 0.0D);
		//   11   25:aload_0         
		//   12   26:ldc2w           #25  <Double (0.0D / 0.0D)>
		//   13   29:putfield        #30  <Field double zzbpz>
		//   14   32:return          
		}
	}


	public LatLngBounds(LatLng latlng, LatLng latlng1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		zzac.zzb(((Object) (latlng)), "null southwest");
	//    2    4:aload_1         
	//    3    5:ldc1            #29  <String "null southwest">
	//    4    7:invokestatic    #35  <Method Object zzac.zzb(Object, Object)>
	//    5   10:pop             
		zzac.zzb(((Object) (latlng1)), "null northeast");
	//    6   11:aload_2         
	//    7   12:ldc1            #37  <String "null northeast">
	//    8   14:invokestatic    #35  <Method Object zzac.zzb(Object, Object)>
	//    9   17:pop             
		boolean flag;
		if(latlng1.latitude >= latlng.latitude)
	//*  10   18:aload_2         
	//*  11   19:getfield        #43  <Field double LatLng.latitude>
	//*  12   22:aload_1         
	//*  13   23:getfield        #43  <Field double LatLng.latitude>
	//*  14   26:dcmpl           
	//*  15   27:iflt            35
			flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_3        
		else
	//*  18   32:goto            37
			flag = false;
	//   19   35:iconst_0        
	//   20   36:istore_3        
		zzac.zzb(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
			Double.valueOf(latlng.latitude), Double.valueOf(latlng1.latitude)
		});
	//   21   37:iload_3         
	//   22   38:ldc1            #45  <String "southern latitude exceeds northern latitude (%s > %s)">
	//   23   40:iconst_2        
	//   24   41:anewarray       Object[]
	//   25   44:dup             
	//   26   45:iconst_0        
	//   27   46:aload_1         
	//   28   47:getfield        #43  <Field double LatLng.latitude>
	//   29   50:invokestatic    #53  <Method Double Double.valueOf(double)>
	//   30   53:aastore         
	//   31   54:dup             
	//   32   55:iconst_1        
	//   33   56:aload_2         
	//   34   57:getfield        #43  <Field double LatLng.latitude>
	//   35   60:invokestatic    #53  <Method Double Double.valueOf(double)>
	//   36   63:aastore         
	//   37   64:invokestatic    #56  <Method void zzac.zzb(boolean, String, Object[])>
		southwest = latlng;
	//   38   67:aload_0         
	//   39   68:aload_1         
	//   40   69:putfield        #58  <Field LatLng southwest>
		northeast = latlng1;
	//   41   72:aload_0         
	//   42   73:aload_2         
	//   43   74:putfield        #60  <Field LatLng northeast>
	//   44   77:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #8   <Class LatLngBounds$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void LatLngBounds$Builder()>
	//    3    7:areturn         
	}

	public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeset)
	{
		if(context == null || attributeset == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		TypedArray typedarray = context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.MapAttrs);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #71  <Method Resources Context.getResources()>
	//    8   14:aload_1         
	//    9   15:getstatic       #77  <Field int[] com.google.android.gms.R$styleable.MapAttrs>
	//   10   18:invokevirtual   #83  <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//   11   21:astore          4
		context = null;
	//   12   23:aconst_null     
	//   13   24:astore_0        
		attributeset = null;
	//   14   25:aconst_null     
	//   15   26:astore_1        
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_latLngBoundsSouthWestLatitude))
	//*  16   27:aload           4
	//*  17   29:getstatic       #87  <Field int com.google.android.gms.R$styleable.MapAttrs_latLngBoundsSouthWestLatitude>
	//*  18   32:invokevirtual   #93  <Method boolean TypedArray.hasValue(int)>
	//*  19   35:ifeq            51
			context = ((Context) (Float.valueOf(typedarray.getFloat(com.google.android.gms.R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0F))));
	//   20   38:aload           4
	//   21   40:getstatic       #87  <Field int com.google.android.gms.R$styleable.MapAttrs_latLngBoundsSouthWestLatitude>
	//   22   43:fconst_0        
	//   23   44:invokevirtual   #97  <Method float TypedArray.getFloat(int, float)>
	//   24   47:invokestatic    #102 <Method Float Float.valueOf(float)>
	//   25   50:astore_0        
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_latLngBoundsSouthWestLongitude))
	//*  26   51:aload           4
	//*  27   53:getstatic       #105 <Field int com.google.android.gms.R$styleable.MapAttrs_latLngBoundsSouthWestLongitude>
	//*  28   56:invokevirtual   #93  <Method boolean TypedArray.hasValue(int)>
	//*  29   59:ifeq            75
			attributeset = ((AttributeSet) (Float.valueOf(typedarray.getFloat(com.google.android.gms.R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0F))));
	//   30   62:aload           4
	//   31   64:getstatic       #105 <Field int com.google.android.gms.R$styleable.MapAttrs_latLngBoundsSouthWestLongitude>
	//   32   67:fconst_0        
	//   33   68:invokevirtual   #97  <Method float TypedArray.getFloat(int, float)>
	//   34   71:invokestatic    #102 <Method Float Float.valueOf(float)>
	//   35   74:astore_1        
		Float float1 = null;
	//   36   75:aconst_null     
	//   37   76:astore_2        
		Float float2 = null;
	//   38   77:aconst_null     
	//   39   78:astore_3        
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_latLngBoundsNorthEastLatitude))
	//*  40   79:aload           4
	//*  41   81:getstatic       #108 <Field int com.google.android.gms.R$styleable.MapAttrs_latLngBoundsNorthEastLatitude>
	//*  42   84:invokevirtual   #93  <Method boolean TypedArray.hasValue(int)>
	//*  43   87:ifeq            103
			float1 = Float.valueOf(typedarray.getFloat(com.google.android.gms.R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0F));
	//   44   90:aload           4
	//   45   92:getstatic       #108 <Field int com.google.android.gms.R$styleable.MapAttrs_latLngBoundsNorthEastLatitude>
	//   46   95:fconst_0        
	//   47   96:invokevirtual   #97  <Method float TypedArray.getFloat(int, float)>
	//   48   99:invokestatic    #102 <Method Float Float.valueOf(float)>
	//   49  102:astore_2        
		if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_latLngBoundsNorthEastLongitude))
	//*  50  103:aload           4
	//*  51  105:getstatic       #111 <Field int com.google.android.gms.R$styleable.MapAttrs_latLngBoundsNorthEastLongitude>
	//*  52  108:invokevirtual   #93  <Method boolean TypedArray.hasValue(int)>
	//*  53  111:ifeq            127
			float2 = Float.valueOf(typedarray.getFloat(com.google.android.gms.R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0F));
	//   54  114:aload           4
	//   55  116:getstatic       #111 <Field int com.google.android.gms.R$styleable.MapAttrs_latLngBoundsNorthEastLongitude>
	//   56  119:fconst_0        
	//   57  120:invokevirtual   #97  <Method float TypedArray.getFloat(int, float)>
	//   58  123:invokestatic    #102 <Method Float Float.valueOf(float)>
	//   59  126:astore_3        
		if(context == null || attributeset == null || float1 == null || float2 == null)
	//*  60  127:aload_0         
	//*  61  128:ifnull          143
	//*  62  131:aload_1         
	//*  63  132:ifnull          143
	//*  64  135:aload_2         
	//*  65  136:ifnull          143
	//*  66  139:aload_3         
	//*  67  140:ifnonnull       145
			return null;
	//   68  143:aconst_null     
	//   69  144:areturn         
		else
			return new LatLngBounds(new LatLng(((Float) (context)).floatValue(), ((Float) (attributeset)).floatValue()), new LatLng(float1.floatValue(), float2.floatValue()));
	//   70  145:new             #2   <Class LatLngBounds>
	//   71  148:dup             
	//   72  149:new             #39  <Class LatLng>
	//   73  152:dup             
	//   74  153:aload_0         
	//   75  154:invokevirtual   #115 <Method float Float.floatValue()>
	//   76  157:f2d             
	//   77  158:aload_1         
	//   78  159:invokevirtual   #115 <Method float Float.floatValue()>
	//   79  162:f2d             
	//   80  163:invokespecial   #118 <Method void LatLng(double, double)>
	//   81  166:new             #39  <Class LatLng>
	//   82  169:dup             
	//   83  170:aload_2         
	//   84  171:invokevirtual   #115 <Method float Float.floatValue()>
	//   85  174:f2d             
	//   86  175:aload_3         
	//   87  176:invokevirtual   #115 <Method float Float.floatValue()>
	//   88  179:f2d             
	//   89  180:invokespecial   #118 <Method void LatLng(double, double)>
	//   90  183:invokespecial   #120 <Method void LatLngBounds(LatLng, LatLng)>
	//   91  186:areturn         
	}

	private static double zzb(double d, double d1)
	{
		return ((d - d1) + 360D) % 360D;
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dsub            
	//    3    3:ldc2w           #122 <Double 360D>
	//    4    6:dadd            
	//    5    7:ldc2w           #122 <Double 360D>
	//    6   10:drem            
	//    7   11:dreturn         
	}

	private static double zzc(double d, double d1)
	{
		return ((d1 - d) + 360D) % 360D;
	//    0    0:dload_2         
	//    1    1:dload_0         
	//    2    2:dsub            
	//    3    3:ldc2w           #122 <Double 360D>
	//    4    6:dadd            
	//    5    7:ldc2w           #122 <Double 360D>
	//    6   10:drem            
	//    7   11:dreturn         
	}

	static double zzd(double d, double d1)
	{
		return zzb(d, d1);
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:invokestatic    #127 <Method double zzb(double, double)>
	//    3    5:dreturn         
	}

	static double zze(double d, double d1)
	{
		return zzc(d, d1);
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:invokestatic    #130 <Method double zzc(double, double)>
	//    3    5:dreturn         
	}

	private boolean zzh(double d)
	{
		return southwest.latitude <= d && d <= northeast.latitude;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field LatLng southwest>
	//    2    4:getfield        #43  <Field double LatLng.latitude>
	//    3    7:dload_1         
	//    4    8:dcmpg           
	//    5    9:ifgt            26
	//    6   12:dload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field LatLng northeast>
	//    9   17:getfield        #43  <Field double LatLng.latitude>
	//   10   20:dcmpg           
	//   11   21:ifgt            26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	private boolean zzi(double d)
	{
		if(southwest.longitude <= northeast.longitude)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field LatLng southwest>
	//*   2    4:getfield        #136 <Field double LatLng.longitude>
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field LatLng northeast>
	//*   5   11:getfield        #136 <Field double LatLng.longitude>
	//*   6   14:dcmpg           
	//*   7   15:ifgt            46
			return southwest.longitude <= d && d <= northeast.longitude;
	//    8   18:aload_0         
	//    9   19:getfield        #58  <Field LatLng southwest>
	//   10   22:getfield        #136 <Field double LatLng.longitude>
	//   11   25:dload_1         
	//   12   26:dcmpg           
	//   13   27:ifgt            44
	//   14   30:dload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #60  <Field LatLng northeast>
	//   17   35:getfield        #136 <Field double LatLng.longitude>
	//   18   38:dcmpg           
	//   19   39:ifgt            44
	//   20   42:iconst_1        
	//   21   43:ireturn         
	//   22   44:iconst_0        
	//   23   45:ireturn         
		return southwest.longitude <= d || d <= northeast.longitude;
	//   24   46:aload_0         
	//   25   47:getfield        #58  <Field LatLng southwest>
	//   26   50:getfield        #136 <Field double LatLng.longitude>
	//   27   53:dload_1         
	//   28   54:dcmpg           
	//   29   55:ifle            70
	//   30   58:dload_1         
	//   31   59:aload_0         
	//   32   60:getfield        #60  <Field LatLng northeast>
	//   33   63:getfield        #136 <Field double LatLng.longitude>
	//   34   66:dcmpg           
	//   35   67:ifgt            72
	//   36   70:iconst_1        
	//   37   71:ireturn         
	//   38   72:iconst_0        
	//   39   73:ireturn         
	}

	public boolean contains(LatLng latlng)
	{
		return zzh(latlng.latitude) && zzi(latlng.longitude);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #43  <Field double LatLng.latitude>
	//    3    5:invokespecial   #140 <Method boolean zzh(double)>
	//    4    8:ifeq            24
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getfield        #136 <Field double LatLng.longitude>
	//    8   16:invokespecial   #142 <Method boolean zzi(double)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
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
		if(!(obj instanceof LatLngBounds))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LatLngBounds>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((LatLngBounds)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class LatLngBounds>
	//   12   20:astore_1        
		return southwest.equals(((Object) (((LatLngBounds) (obj)).southwest))) && northeast.equals(((Object) (((LatLngBounds) (obj)).northeast)));
	//   13   21:aload_0         
	//   14   22:getfield        #58  <Field LatLng southwest>
	//   15   25:aload_1         
	//   16   26:getfield        #58  <Field LatLng southwest>
	//   17   29:invokevirtual   #146 <Method boolean LatLng.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #60  <Field LatLng northeast>
	//   21   39:aload_1         
	//   22   40:getfield        #60  <Field LatLng northeast>
	//   23   43:invokevirtual   #146 <Method boolean LatLng.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public LatLng getCenter()
	{
		double d1 = (southwest.latitude + northeast.latitude) / 2D;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field LatLng southwest>
	//    2    4:getfield        #43  <Field double LatLng.latitude>
	//    3    7:aload_0         
	//    4    8:getfield        #60  <Field LatLng northeast>
	//    5   11:getfield        #43  <Field double LatLng.latitude>
	//    6   14:dadd            
	//    7   15:ldc2w           #149 <Double 2D>
	//    8   18:ddiv            
	//    9   19:dstore_3        
		double d = northeast.longitude;
	//   10   20:aload_0         
	//   11   21:getfield        #60  <Field LatLng northeast>
	//   12   24:getfield        #136 <Field double LatLng.longitude>
	//   13   27:dstore_1        
		double d2 = southwest.longitude;
	//   14   28:aload_0         
	//   15   29:getfield        #58  <Field LatLng southwest>
	//   16   32:getfield        #136 <Field double LatLng.longitude>
	//   17   35:dstore          5
		if(d2 <= d)
	//*  18   37:dload           5
	//*  19   39:dload_1         
	//*  20   40:dcmpg           
	//*  21   41:ifgt            56
			d = (d + d2) / 2D;
	//   22   44:dload_1         
	//   23   45:dload           5
	//   24   47:dadd            
	//   25   48:ldc2w           #149 <Double 2D>
	//   26   51:ddiv            
	//   27   52:dstore_1        
		else
	//*  28   53:goto            69
			d = (360D + d + d2) / 2D;
	//   29   56:ldc2w           #122 <Double 360D>
	//   30   59:dload_1         
	//   31   60:dadd            
	//   32   61:dload           5
	//   33   63:dadd            
	//   34   64:ldc2w           #149 <Double 2D>
	//   35   67:ddiv            
	//   36   68:dstore_1        
		return new LatLng(d1, d);
	//   37   69:new             #39  <Class LatLng>
	//   38   72:dup             
	//   39   73:dload_3         
	//   40   74:dload_1         
	//   41   75:invokespecial   #118 <Method void LatLng(double, double)>
	//   42   78:areturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			southwest, northeast
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field LatLng southwest>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #60  <Field LatLng northeast>
	//   11   17:aastore         
	//   12   18:invokestatic    #157 <Method int zzaa.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public LatLngBounds including(LatLng latlng)
	{
		double d5 = Math.min(southwest.latitude, latlng.latitude);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field LatLng southwest>
	//    2    4:getfield        #43  <Field double LatLng.latitude>
	//    3    7:aload_1         
	//    4    8:getfield        #43  <Field double LatLng.latitude>
	//    5   11:invokestatic    #164 <Method double Math.min(double, double)>
	//    6   14:dstore          12
		double d6 = Math.max(northeast.latitude, latlng.latitude);
	//    7   16:aload_0         
	//    8   17:getfield        #60  <Field LatLng northeast>
	//    9   20:getfield        #43  <Field double LatLng.latitude>
	//   10   23:aload_1         
	//   11   24:getfield        #43  <Field double LatLng.latitude>
	//   12   27:invokestatic    #167 <Method double Math.max(double, double)>
	//   13   30:dstore          14
		double d3 = northeast.longitude;
	//   14   32:aload_0         
	//   15   33:getfield        #60  <Field LatLng northeast>
	//   16   36:getfield        #136 <Field double LatLng.longitude>
	//   17   39:dstore          8
		double d4 = southwest.longitude;
	//   18   41:aload_0         
	//   19   42:getfield        #58  <Field LatLng southwest>
	//   20   45:getfield        #136 <Field double LatLng.longitude>
	//   21   48:dstore          10
		double d2 = latlng.longitude;
	//   22   50:aload_1         
	//   23   51:getfield        #136 <Field double LatLng.longitude>
	//   24   54:dstore          6
		double d = d3;
	//   25   56:dload           8
	//   26   58:dstore_2        
		double d1 = d4;
	//   27   59:dload           10
	//   28   61:dstore          4
		if(!zzi(d2))
	//*  29   63:aload_0         
	//*  30   64:dload           6
	//*  31   66:invokespecial   #142 <Method boolean zzi(double)>
	//*  32   69:ifne            107
			if(zzb(d4, d2) < zzc(d3, d2))
	//*  33   72:dload           10
	//*  34   74:dload           6
	//*  35   76:invokestatic    #127 <Method double zzb(double, double)>
	//*  36   79:dload           8
	//*  37   81:dload           6
	//*  38   83:invokestatic    #130 <Method double zzc(double, double)>
	//*  39   86:dcmpg           
	//*  40   87:ifge            100
			{
				d1 = d2;
	//   41   90:dload           6
	//   42   92:dstore          4
				d = d3;
	//   43   94:dload           8
	//   44   96:dstore_2        
			} else
	//*  45   97:goto            107
			{
				d = d2;
	//   46  100:dload           6
	//   47  102:dstore_2        
				d1 = d4;
	//   48  103:dload           10
	//   49  105:dstore          4
			}
		return new LatLngBounds(new LatLng(d5, d1), new LatLng(d6, d));
	//   50  107:new             #2   <Class LatLngBounds>
	//   51  110:dup             
	//   52  111:new             #39  <Class LatLng>
	//   53  114:dup             
	//   54  115:dload           12
	//   55  117:dload           4
	//   56  119:invokespecial   #118 <Method void LatLng(double, double)>
	//   57  122:new             #39  <Class LatLng>
	//   58  125:dup             
	//   59  126:dload           14
	//   60  128:dload_2         
	//   61  129:invokespecial   #118 <Method void LatLng(double, double)>
	//   62  132:invokespecial   #120 <Method void LatLngBounds(LatLng, LatLng)>
	//   63  135:areturn         
	}

	public String toString()
	{
		return zzaa.zzv(((Object) (this))).zzg("southwest", ((Object) (southwest))).zzg("northeast", ((Object) (northeast))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #173 <Method com.google.android.gms.common.internal.zzaa$zza zzaa.zzv(Object)>
	//    2    4:ldc1            #174 <String "southwest">
	//    3    6:aload_0         
	//    4    7:getfield        #58  <Field LatLng southwest>
	//    5   10:invokevirtual   #180 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//    6   13:ldc1            #181 <String "northeast">
	//    7   15:aload_0         
	//    8   16:getfield        #60  <Field LatLng northeast>
	//    9   19:invokevirtual   #180 <Method com.google.android.gms.common.internal.zzaa$zza com.google.android.gms.common.internal.zzaa$zza.zzg(String, Object)>
	//   10   22:invokevirtual   #183 <Method String com.google.android.gms.common.internal.zzaa$zza.toString()>
	//   11   25:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.maps.model.zze.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #189 <Method void com.google.android.gms.maps.model.zze.zza(LatLngBounds, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	public final LatLng northeast;
	public final LatLng southwest;

	static 
	{
	//    0    0:new             #19  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zze()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
