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
//			zze, LatLng

public final class LatLngBounds extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static final class Builder
	{

		public final LatLngBounds build()
		{
			Preconditions.checkState(Double.isNaN(zzdi) ^ true, "no included points");
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field double zzdi>
		//    2    4:invokestatic    #39  <Method boolean Double.isNaN(double)>
		//    3    7:iconst_1        
		//    4    8:ixor            
		//    5    9:ldc1            #41  <String "no included points">
		//    6   11:invokestatic    #47  <Method void Preconditions.checkState(boolean, Object)>
			return new LatLngBounds(new LatLng(zzdg, zzdi), new LatLng(zzdh, zzdj));
		//    7   14:new             #6   <Class LatLngBounds>
		//    8   17:dup             
		//    9   18:new             #49  <Class LatLng>
		//   10   21:dup             
		//   11   22:aload_0         
		//   12   23:getfield        #20  <Field double zzdg>
		//   13   26:aload_0         
		//   14   27:getfield        #28  <Field double zzdi>
		//   15   30:invokespecial   #52  <Method void LatLng(double, double)>
		//   16   33:new             #49  <Class LatLng>
		//   17   36:dup             
		//   18   37:aload_0         
		//   19   38:getfield        #24  <Field double zzdh>
		//   20   41:aload_0         
		//   21   42:getfield        #30  <Field double zzdj>
		//   22   45:invokespecial   #52  <Method void LatLng(double, double)>
		//   23   48:invokespecial   #55  <Method void LatLngBounds(LatLng, LatLng)>
		//   24   51:areturn         
		}

		public final Builder include(LatLng latlng)
		{
label0:
			{
				double d;
label1:
				{
					boolean flag;
label2:
					{
						zzdg = Math.min(zzdg, latlng.latitude);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field double zzdg>
		//    3    5:aload_1         
		//    4    6:getfield        #60  <Field double LatLng.latitude>
		//    5    9:invokestatic    #66  <Method double Math.min(double, double)>
		//    6   12:putfield        #20  <Field double zzdg>
						zzdh = Math.max(zzdh, latlng.latitude);
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:getfield        #24  <Field double zzdh>
		//   10   20:aload_1         
		//   11   21:getfield        #60  <Field double LatLng.latitude>
		//   12   24:invokestatic    #69  <Method double Math.max(double, double)>
		//   13   27:putfield        #24  <Field double zzdh>
						d = latlng.longitude;
		//   14   30:aload_1         
		//   15   31:getfield        #72  <Field double LatLng.longitude>
		//   16   34:dstore_2        
						if(Double.isNaN(zzdi))
		//*  17   35:aload_0         
		//*  18   36:getfield        #28  <Field double zzdi>
		//*  19   39:invokestatic    #39  <Method boolean Double.isNaN(double)>
		//*  20   42:ifeq            53
						{
							zzdi = d;
		//   21   45:aload_0         
		//   22   46:dload_2         
		//   23   47:putfield        #28  <Field double zzdi>
							break label1;
		//   24   50:goto            154
						}
						double d1 = zzdi;
		//   25   53:aload_0         
		//   26   54:getfield        #28  <Field double zzdi>
		//   27   57:dstore          4
						double d2 = zzdj;
		//   28   59:aload_0         
		//   29   60:getfield        #30  <Field double zzdj>
		//   30   63:dstore          6
						boolean flag1 = false;
		//   31   65:iconst_0        
		//   32   66:istore          9
						if(d1 <= d2)
		//*  33   68:dload           4
		//*  34   70:dload           6
		//*  35   72:dcmpg           
		//*  36   73:ifgt            101
						{
							flag = flag1;
		//   37   76:iload           9
		//   38   78:istore          8
							if(d1 > d)
								break label2;
		//   39   80:dload           4
		//   40   82:dload_2         
		//   41   83:dcmpg           
		//   42   84:ifgt            122
							flag = flag1;
		//   43   87:iload           9
		//   44   89:istore          8
							if(d > d2)
		//*  45   91:dload_2         
		//*  46   92:dload           6
		//*  47   94:dcmpg           
		//*  48   95:ifgt            122
								break label2;
		//   49   98:goto            119
						} else
						if(d1 > d)
		//*  50  101:dload           4
		//*  51  103:dload_2         
		//*  52  104:dcmpg           
		//*  53  105:ifle            119
						{
							flag = flag1;
		//   54  108:iload           9
		//   55  110:istore          8
							if(d > d2)
								break label2;
		//   56  112:dload_2         
		//   57  113:dload           6
		//   58  115:dcmpg           
		//   59  116:ifgt            122
						}
						flag = true;
		//   60  119:iconst_1        
		//   61  120:istore          8
					}
					if(flag)
						break label0;
		//   62  122:iload           8
		//   63  124:ifne            159
					if(LatLngBounds.zzc(zzdi, d) < LatLngBounds.zzd(zzdj, d))
		//*  64  127:aload_0         
		//*  65  128:getfield        #28  <Field double zzdi>
		//*  66  131:dload_2         
		//*  67  132:invokestatic    #75  <Method double LatLngBounds.zzc(double, double)>
		//*  68  135:aload_0         
		//*  69  136:getfield        #30  <Field double zzdj>
		//*  70  139:dload_2         
		//*  71  140:invokestatic    #78  <Method double LatLngBounds.zzd(double, double)>
		//*  72  143:dcmpg           
		//*  73  144:ifge            154
					{
						zzdi = d;
		//   74  147:aload_0         
		//   75  148:dload_2         
		//   76  149:putfield        #28  <Field double zzdi>
						return this;
		//   77  152:aload_0         
		//   78  153:areturn         
					}
				}
				zzdj = d;
		//   79  154:aload_0         
		//   80  155:dload_2         
		//   81  156:putfield        #30  <Field double zzdj>
			}
			return this;
		//   82  159:aload_0         
		//   83  160:areturn         
		}

		private double zzdg;
		private double zzdh;
		private double zzdi;
		private double zzdj;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzdg = (1.0D / 0.0D);
		//    2    4:aload_0         
		//    3    5:ldc2w           #17  <Double (1.0D / 0.0D)>
		//    4    8:putfield        #20  <Field double zzdg>
			zzdh = (-1.0D / 0.0D);
		//    5   11:aload_0         
		//    6   12:ldc2w           #21  <Double (-1.0D / 0.0D)>
		//    7   15:putfield        #24  <Field double zzdh>
			zzdi = (0.0D / 0.0D);
		//    8   18:aload_0         
		//    9   19:ldc2w           #25  <Double (0.0D / 0.0D)>
		//   10   22:putfield        #28  <Field double zzdi>
			zzdj = (0.0D / 0.0D);
		//   11   25:aload_0         
		//   12   26:ldc2w           #25  <Double (0.0D / 0.0D)>
		//   13   29:putfield        #30  <Field double zzdj>
		//   14   32:return          
		}
	}


	public LatLngBounds(LatLng latlng, LatLng latlng1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		Preconditions.checkNotNull(((Object) (latlng)), "null southwest");
	//    2    4:aload_1         
	//    3    5:ldc1            #42  <String "null southwest">
	//    4    7:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkNotNull(((Object) (latlng1)), "null northeast");
	//    6   11:aload_2         
	//    7   12:ldc1            #50  <String "null northeast">
	//    8   14:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   17:pop             
		boolean flag;
		if(latlng1.latitude >= latlng.latitude)
	//*  10   18:aload_2         
	//*  11   19:getfield        #56  <Field double LatLng.latitude>
	//*  12   22:aload_1         
	//*  13   23:getfield        #56  <Field double LatLng.latitude>
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
		Preconditions.checkArgument(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
			Double.valueOf(latlng.latitude), Double.valueOf(latlng1.latitude)
		});
	//   21   37:iload_3         
	//   22   38:ldc1            #58  <String "southern latitude exceeds northern latitude (%s > %s)">
	//   23   40:iconst_2        
	//   24   41:anewarray       Object[]
	//   25   44:dup             
	//   26   45:iconst_0        
	//   27   46:aload_1         
	//   28   47:getfield        #56  <Field double LatLng.latitude>
	//   29   50:invokestatic    #66  <Method Double Double.valueOf(double)>
	//   30   53:aastore         
	//   31   54:dup             
	//   32   55:iconst_1        
	//   33   56:aload_2         
	//   34   57:getfield        #56  <Field double LatLng.latitude>
	//   35   60:invokestatic    #66  <Method Double Double.valueOf(double)>
	//   36   63:aastore         
	//   37   64:invokestatic    #70  <Method void Preconditions.checkArgument(boolean, String, Object[])>
		southwest = latlng;
	//   38   67:aload_0         
	//   39   68:aload_1         
	//   40   69:putfield        #72  <Field LatLng southwest>
		northeast = latlng1;
	//   41   72:aload_0         
	//   42   73:aload_2         
	//   43   74:putfield        #74  <Field LatLng northeast>
	//   44   77:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #8   <Class LatLngBounds$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void LatLngBounds$Builder()>
	//    3    7:areturn         
	}

	public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeset)
	{
		return GoogleMapOptions.zza(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #86  <Method LatLngBounds GoogleMapOptions.zza(Context, AttributeSet)>
	//    3    5:areturn         
	}

	private static double zza(double d, double d1)
	{
		return ((d - d1) + 360D) % 360D;
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:dsub            
	//    3    3:ldc2w           #88  <Double 360D>
	//    4    6:dadd            
	//    5    7:ldc2w           #88  <Double 360D>
	//    6   10:drem            
	//    7   11:dreturn         
	}

	private final boolean zza(double d)
	{
		if(southwest.longitude <= northeast.longitude)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field LatLng southwest>
	//*   2    4:getfield        #93  <Field double LatLng.longitude>
	//*   3    7:aload_0         
	//*   4    8:getfield        #74  <Field LatLng northeast>
	//*   5   11:getfield        #93  <Field double LatLng.longitude>
	//*   6   14:dcmpg           
	//*   7   15:ifgt            46
			return southwest.longitude <= d && d <= northeast.longitude;
	//    8   18:aload_0         
	//    9   19:getfield        #72  <Field LatLng southwest>
	//   10   22:getfield        #93  <Field double LatLng.longitude>
	//   11   25:dload_1         
	//   12   26:dcmpg           
	//   13   27:ifgt            44
	//   14   30:dload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #74  <Field LatLng northeast>
	//   17   35:getfield        #93  <Field double LatLng.longitude>
	//   18   38:dcmpg           
	//   19   39:ifgt            44
	//   20   42:iconst_1        
	//   21   43:ireturn         
	//   22   44:iconst_0        
	//   23   45:ireturn         
		if(southwest.longitude > d)
	//*  24   46:aload_0         
	//*  25   47:getfield        #72  <Field LatLng southwest>
	//*  26   50:getfield        #93  <Field double LatLng.longitude>
	//*  27   53:dload_1         
	//*  28   54:dcmpg           
	//*  29   55:ifle            74
			return d <= northeast.longitude;
	//   30   58:dload_1         
	//   31   59:aload_0         
	//   32   60:getfield        #74  <Field LatLng northeast>
	//   33   63:getfield        #93  <Field double LatLng.longitude>
	//   34   66:dcmpg           
	//   35   67:ifgt            72
	//   36   70:iconst_1        
	//   37   71:ireturn         
	//   38   72:iconst_0        
	//   39   73:ireturn         
		else
			return true;
	//   40   74:iconst_1        
	//   41   75:ireturn         
	}

	private static double zzb(double d, double d1)
	{
		return ((d1 - d) + 360D) % 360D;
	//    0    0:dload_2         
	//    1    1:dload_0         
	//    2    2:dsub            
	//    3    3:ldc2w           #88  <Double 360D>
	//    4    6:dadd            
	//    5    7:ldc2w           #88  <Double 360D>
	//    6   10:drem            
	//    7   11:dreturn         
	}

	static double zzc(double d, double d1)
	{
		return zza(d, d1);
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:invokestatic    #97  <Method double zza(double, double)>
	//    3    5:dreturn         
	}

	static double zzd(double d, double d1)
	{
		return zzb(d, d1);
	//    0    0:dload_0         
	//    1    1:dload_2         
	//    2    2:invokestatic    #100 <Method double zzb(double, double)>
	//    3    5:dreturn         
	}

	public final boolean contains(LatLng latlng)
	{
		double d = latlng.latitude;
	//    0    0:aload_1         
	//    1    1:getfield        #56  <Field double LatLng.latitude>
	//    2    4:dstore_2        
		boolean flag;
		if(southwest.latitude <= d && d <= northeast.latitude)
	//*   3    5:aload_0         
	//*   4    6:getfield        #72  <Field LatLng southwest>
	//*   5    9:getfield        #56  <Field double LatLng.latitude>
	//*   6   12:dload_2         
	//*   7   13:dcmpg           
	//*   8   14:ifgt            35
	//*   9   17:dload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #74  <Field LatLng northeast>
	//*  12   22:getfield        #56  <Field double LatLng.latitude>
	//*  13   25:dcmpg           
	//*  14   26:ifgt            35
			flag = true;
	//   15   29:iconst_1        
	//   16   30:istore          4
		else
	//*  17   32:goto            38
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore          4
		return flag && zza(latlng.longitude);
	//   20   38:iload           4
	//   21   40:ifeq            56
	//   22   43:aload_0         
	//   23   44:aload_1         
	//   24   45:getfield        #93  <Field double LatLng.longitude>
	//   25   48:invokespecial   #104 <Method boolean zza(double)>
	//   26   51:ifeq            56
	//   27   54:iconst_1        
	//   28   55:ireturn         
	//   29   56:iconst_0        
	//   30   57:ireturn         
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
	//   14   22:getfield        #72  <Field LatLng southwest>
	//   15   25:aload_1         
	//   16   26:getfield        #72  <Field LatLng southwest>
	//   17   29:invokevirtual   #108 <Method boolean LatLng.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #74  <Field LatLng northeast>
	//   21   39:aload_1         
	//   22   40:getfield        #74  <Field LatLng northeast>
	//   23   43:invokevirtual   #108 <Method boolean LatLng.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	public final LatLng getCenter()
	{
		double d1 = (southwest.latitude + northeast.latitude) / 2D;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field LatLng southwest>
	//    2    4:getfield        #56  <Field double LatLng.latitude>
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field LatLng northeast>
	//    5   11:getfield        #56  <Field double LatLng.latitude>
	//    6   14:dadd            
	//    7   15:ldc2w           #111 <Double 2D>
	//    8   18:ddiv            
	//    9   19:dstore_3        
		double d = northeast.longitude;
	//   10   20:aload_0         
	//   11   21:getfield        #74  <Field LatLng northeast>
	//   12   24:getfield        #93  <Field double LatLng.longitude>
	//   13   27:dstore_1        
		double d2 = southwest.longitude;
	//   14   28:aload_0         
	//   15   29:getfield        #72  <Field LatLng southwest>
	//   16   32:getfield        #93  <Field double LatLng.longitude>
	//   17   35:dstore          5
		if(d2 > d)
	//*  18   37:dload           5
	//*  19   39:dload_1         
	//*  20   40:dcmpg           
	//*  21   41:ifgt            47
	//*  22   44:goto            53
			d += 360D;
	//   23   47:dload_1         
	//   24   48:ldc2w           #88  <Double 360D>
	//   25   51:dadd            
	//   26   52:dstore_1        
		return new LatLng(d1, (d + d2) / 2D);
	//   27   53:new             #52  <Class LatLng>
	//   28   56:dup             
	//   29   57:dload_3         
	//   30   58:dload_1         
	//   31   59:dload           5
	//   32   61:dadd            
	//   33   62:ldc2w           #111 <Double 2D>
	//   34   65:ddiv            
	//   35   66:invokespecial   #115 <Method void LatLng(double, double)>
	//   36   69:areturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			southwest, northeast
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #72  <Field LatLng southwest>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #74  <Field LatLng northeast>
	//   11   17:aastore         
	//   12   18:invokestatic    #122 <Method int Objects.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public final LatLngBounds including(LatLng latlng)
	{
		double d5 = Math.min(southwest.latitude, latlng.latitude);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field LatLng southwest>
	//    2    4:getfield        #56  <Field double LatLng.latitude>
	//    3    7:aload_1         
	//    4    8:getfield        #56  <Field double LatLng.latitude>
	//    5   11:invokestatic    #129 <Method double Math.min(double, double)>
	//    6   14:dstore          12
		double d6 = Math.max(northeast.latitude, latlng.latitude);
	//    7   16:aload_0         
	//    8   17:getfield        #74  <Field LatLng northeast>
	//    9   20:getfield        #56  <Field double LatLng.latitude>
	//   10   23:aload_1         
	//   11   24:getfield        #56  <Field double LatLng.latitude>
	//   12   27:invokestatic    #132 <Method double Math.max(double, double)>
	//   13   30:dstore          14
		double d3 = northeast.longitude;
	//   14   32:aload_0         
	//   15   33:getfield        #74  <Field LatLng northeast>
	//   16   36:getfield        #93  <Field double LatLng.longitude>
	//   17   39:dstore          8
		double d4 = southwest.longitude;
	//   18   41:aload_0         
	//   19   42:getfield        #72  <Field LatLng southwest>
	//   20   45:getfield        #93  <Field double LatLng.longitude>
	//   21   48:dstore          10
		double d2 = latlng.longitude;
	//   22   50:aload_1         
	//   23   51:getfield        #93  <Field double LatLng.longitude>
	//   24   54:dstore          6
		double d = d3;
	//   25   56:dload           8
	//   26   58:dstore_2        
		double d1 = d4;
	//   27   59:dload           10
	//   28   61:dstore          4
		if(!zza(d2))
	//*  29   63:aload_0         
	//*  30   64:dload           6
	//*  31   66:invokespecial   #104 <Method boolean zza(double)>
	//*  32   69:ifne            107
			if(zza(d4, d2) < zzb(d3, d2))
	//*  33   72:dload           10
	//*  34   74:dload           6
	//*  35   76:invokestatic    #97  <Method double zza(double, double)>
	//*  36   79:dload           8
	//*  37   81:dload           6
	//*  38   83:invokestatic    #100 <Method double zzb(double, double)>
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
	//   52  111:new             #52  <Class LatLng>
	//   53  114:dup             
	//   54  115:dload           12
	//   55  117:dload           4
	//   56  119:invokespecial   #115 <Method void LatLng(double, double)>
	//   57  122:new             #52  <Class LatLng>
	//   58  125:dup             
	//   59  126:dload           14
	//   60  128:dload_2         
	//   61  129:invokespecial   #115 <Method void LatLng(double, double)>
	//   62  132:invokespecial   #134 <Method void LatLngBounds(LatLng, LatLng)>
	//   63  135:areturn         
	}

	public final String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("southwest", ((Object) (southwest))).add("northeast", ((Object) (northeast))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #140 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #141 <String "southwest">
	//    3    6:aload_0         
	//    4    7:getfield        #72  <Field LatLng southwest>
	//    5   10:invokevirtual   #147 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #148 <String "northeast">
	//    7   15:aload_0         
	//    8   16:getfield        #74  <Field LatLng northeast>
	//    9   19:invokevirtual   #147 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   10   22:invokevirtual   #150 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   11   25:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #158 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (southwest)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #72  <Field LatLng southwest>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #162 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (northeast)), i, false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #74  <Field LatLng northeast>
	//   14   22:iload_2         
	//   15   23:iconst_0        
	//   16   24:invokestatic    #162 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   17   27:aload_1         
	//   18   28:iload_3         
	//   19   29:invokestatic    #165 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   20   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zze();
	public final LatLng northeast;
	public final LatLng southwest;

	static 
	{
	//    0    0:new             #30  <Class zze>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void zze()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
