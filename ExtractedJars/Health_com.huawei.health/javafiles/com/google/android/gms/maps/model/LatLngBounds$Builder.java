// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.maps.model:
//			LatLngBounds, LatLng

public static final class LatLngBounds$Builder
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

	public LatLngBounds$Builder include(LatLng latlng)
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

	public LatLngBounds$Builder()
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
