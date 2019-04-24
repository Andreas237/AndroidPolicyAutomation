// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import com.amap.api.mapcore.util.fd;
import com.autonavi.amap.mapcore.DPoint;

// Referenced classes of package com.amap.api.maps.model:
//			LatLng

public class WeightedLatLng
{

	public WeightedLatLng(LatLng latlng)
	{
		this(latlng, 1.0D);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dconst_1        
	//    3    3:invokespecial   #18  <Method void WeightedLatLng(LatLng, double)>
	//    4    6:return          
	}

	public WeightedLatLng(LatLng latlng, double d)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		if(latlng == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("latLng can not null");
	//    4    8:new             #24  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #26  <String "latLng can not null">
	//    7   14:invokespecial   #29  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		latLng = latlng;
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:putfield        #31  <Field LatLng latLng>
		a = fd.a(latlng);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokestatic    #36  <Method DPoint fd.a(LatLng)>
	//   15   28:putfield        #38  <Field DPoint a>
		if(d >= 0.0D)
	//*  16   31:dload_2         
	//*  17   32:dconst_0        
	//*  18   33:dcmpl           
	//*  19   34:iflt            43
		{
			intensity = d;
	//   20   37:aload_0         
	//   21   38:dload_2         
	//   22   39:putfield        #40  <Field double intensity>
			return;
	//   23   42:return          
		} else
		{
			intensity = 1.0D;
	//   24   43:aload_0         
	//   25   44:dconst_1        
	//   26   45:putfield        #40  <Field double intensity>
			return;
	//   27   48:return          
		}
	}

	protected DPoint getPoint()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field DPoint a>
	//    2    4:areturn         
	}

	public static final double DEFAULT_INTENSITY = 1D;
	private DPoint a;
	public final double intensity;
	public final LatLng latLng;
}
