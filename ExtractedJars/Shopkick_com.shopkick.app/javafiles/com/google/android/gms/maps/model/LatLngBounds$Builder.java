// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.maps.model:
//			LatLngBounds, LatLng

public static final class LatLngBounds$Builder
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

	public final LatLngBounds$Builder include(LatLng latlng)
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

	public LatLngBounds$Builder()
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
