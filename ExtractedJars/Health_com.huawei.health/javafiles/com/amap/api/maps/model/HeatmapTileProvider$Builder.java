// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.util.Log;
import com.amap.api.maps.AMapException;
import java.util.Collection;

// Referenced classes of package com.amap.api.maps.model:
//			HeatmapTileProvider, Gradient

public static class HeatmapTileProvider$Builder
{

	static Collection a(HeatmapTileProvider$Builder heatmaptileprovider$builder)
	{
		return heatmaptileprovider$builder.a;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Collection a>
	//    2    4:areturn         
	}

	static int b(HeatmapTileProvider$Builder heatmaptileprovider$builder)
	{
		return heatmaptileprovider$builder.b;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int b>
	//    2    4:ireturn         
	}

	static Gradient c(HeatmapTileProvider$Builder heatmaptileprovider$builder)
	{
		return heatmaptileprovider$builder.c;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Gradient c>
	//    2    4:areturn         
	}

	static double d(HeatmapTileProvider$Builder heatmaptileprovider$builder)
	{
		return heatmaptileprovider$builder.d;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field double d>
	//    2    4:dreturn         
	}

	public HeatmapTileProvider build()
	{
		if(a == null || a.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Collection a>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #35  <Field Collection a>
	//*   5   11:invokeinterface #50  <Method int Collection.size()>
	//*   6   16:ifne            46
			try
			{
				throw new AMapException("No input points.");
	//    7   19:new             #42  <Class AMapException>
	//    8   22:dup             
	//    9   23:ldc1            #52  <String "No input points.">
	//   10   25:invokespecial   #55  <Method void AMapException(String)>
	//   11   28:athrow          
			}
			catch(AMapException amapexception)
	//*  12   29:astore_1        
			{
				Log.e("amap", amapexception.getErrorMessage());
	//   13   30:ldc1            #57  <String "amap">
	//   14   32:aload_1         
	//   15   33:invokevirtual   #61  <Method String AMapException.getErrorMessage()>
	//   16   36:invokestatic    #67  <Method int Log.e(String, String)>
	//   17   39:pop             
				amapexception.printStackTrace();
	//   18   40:aload_1         
	//   19   41:invokevirtual   #70  <Method void AMapException.printStackTrace()>
				return null;
	//   20   44:aconst_null     
	//   21   45:areturn         
			}
		HeatmapTileProvider heatmaptileprovider;
		try
		{
			heatmaptileprovider = new HeatmapTileProvider(this, ((HeatmapTileProvider._cls1) (null)));
	//   22   46:new             #6   <Class HeatmapTileProvider>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:invokespecial   #73  <Method void HeatmapTileProvider(HeatmapTileProvider$Builder, HeatmapTileProvider$1)>
	//   27   55:astore_1        
		}
	//*  28   56:aload_1         
	//*  29   57:areturn         
		catch(Throwable throwable)
	//*  30   58:astore_1        
		{
			throwable.printStackTrace();
	//   31   59:aload_1         
	//   32   60:invokevirtual   #74  <Method void Throwable.printStackTrace()>
			return null;
	//   33   63:aconst_null     
	//   34   64:areturn         
		}
		return heatmaptileprovider;
	}

	public HeatmapTileProvider$Builder data(Collection collection)
	{
		return weightedData(HeatmapTileProvider.b(collection));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #79  <Method Collection HeatmapTileProvider.b(Collection)>
	//    3    5:invokevirtual   #82  <Method HeatmapTileProvider$Builder weightedData(Collection)>
	//    4    8:areturn         
	}

	public HeatmapTileProvider$Builder gradient(Gradient gradient1)
	{
		c = gradient1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field Gradient c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public HeatmapTileProvider$Builder radius(int i)
	{
		b = Math.max(10, Math.min(i, 50));
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:iload_1         
	//    3    4:bipush          50
	//    4    6:invokestatic    #94  <Method int Math.min(int, int)>
	//    5    9:invokestatic    #97  <Method int Math.max(int, int)>
	//    6   12:putfield        #22  <Field int b>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public HeatmapTileProvider$Builder transparency(double d1)
	{
		d = Math.max(0.0D, Math.min(d1, 1.0D));
	//    0    0:aload_0         
	//    1    1:dconst_0        
	//    2    2:dload_1         
	//    3    3:dconst_1        
	//    4    4:invokestatic    #102 <Method double Math.min(double, double)>
	//    5    7:invokestatic    #104 <Method double Math.max(double, double)>
	//    6   10:putfield        #31  <Field double d>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public HeatmapTileProvider$Builder weightedData(Collection collection)
	{
		a = collection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Collection a>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Collection a;
	private int b;
	private Gradient c;
	private double d;

	public HeatmapTileProvider$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		b = 12;
	//    2    4:aload_0         
	//    3    5:bipush          12
	//    4    7:putfield        #22  <Field int b>
		c = HeatmapTileProvider.DEFAULT_GRADIENT;
	//    5   10:aload_0         
	//    6   11:getstatic       #25  <Field Gradient HeatmapTileProvider.DEFAULT_GRADIENT>
	//    7   14:putfield        #27  <Field Gradient c>
		d = 0.59999999999999998D;
	//    8   17:aload_0         
	//    9   18:ldc2w           #28  <Double 0.59999999999999998D>
	//   10   21:putfield        #31  <Field double d>
	//   11   24:return          
	}
}
