// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.trace;

import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.*;
import java.util.*;

public class TraceOverlay
{

	public TraceOverlay(AMap amap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		d = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void ArrayList()>
	//    6   12:putfield        #35  <Field List d>
		e = 4;
	//    7   15:aload_0         
	//    8   16:iconst_4        
	//    9   17:putfield        #37  <Field int e>
		c = amap;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #39  <Field AMap c>
		a();
	//   13   25:aload_0         
	//   14   26:invokespecial   #42  <Method PolylineOptions a()>
	//   15   29:pop             
	//   16   30:return          
	}

	public TraceOverlay(AMap amap, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		d = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #32  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void ArrayList()>
	//    6   12:putfield        #35  <Field List d>
		e = 4;
	//    7   15:aload_0         
	//    8   16:iconst_4        
	//    9   17:putfield        #37  <Field int e>
		c = amap;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #39  <Field AMap c>
		a();
	//   13   25:aload_0         
	//   14   26:invokespecial   #42  <Method PolylineOptions a()>
	//   15   29:pop             
		d = list;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #35  <Field List d>
		b.addAll(((Iterable) (list)));
	//   19   35:aload_0         
	//   20   36:getfield        #46  <Field PolylineOptions b>
	//   21   39:aload_2         
	//   22   40:invokevirtual   #52  <Method PolylineOptions PolylineOptions.addAll(Iterable)>
	//   23   43:pop             
		a = amap.addPolyline(b);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:aload_0         
	//   27   47:getfield        #46  <Field PolylineOptions b>
	//   28   50:invokevirtual   #58  <Method Polyline AMap.addPolyline(PolylineOptions)>
	//   29   53:putfield        #60  <Field Polyline a>
	//   30   56:return          
	}

	private PolylineOptions a()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field PolylineOptions b>
	//*   2    4:ifnonnull       41
		{
			b = new PolylineOptions();
	//    3    7:aload_0         
	//    4    8:new             #48  <Class PolylineOptions>
	//    5   11:dup             
	//    6   12:invokespecial   #63  <Method void PolylineOptions()>
	//    7   15:putfield        #46  <Field PolylineOptions b>
			b.setCustomTexture(BitmapDescriptorFactory.fromAsset("tracelinetexture.png"));
	//    8   18:aload_0         
	//    9   19:getfield        #46  <Field PolylineOptions b>
	//   10   22:ldc1            #65  <String "tracelinetexture.png">
	//   11   24:invokestatic    #71  <Method com.amap.api.maps.model.BitmapDescriptor BitmapDescriptorFactory.fromAsset(String)>
	//   12   27:invokevirtual   #75  <Method PolylineOptions PolylineOptions.setCustomTexture(com.amap.api.maps.model.BitmapDescriptor)>
	//   13   30:pop             
			b.width(40F);
	//   14   31:aload_0         
	//   15   32:getfield        #46  <Field PolylineOptions b>
	//   16   35:ldc1            #76  <Float 40F>
	//   17   37:invokevirtual   #80  <Method PolylineOptions PolylineOptions.width(float)>
	//   18   40:pop             
		}
		return b;
	//   19   41:aload_0         
	//   20   42:getfield        #46  <Field PolylineOptions b>
	//   21   45:areturn         
	}

	public void add(List list)
	{
		if(list == null || list.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #88  <Method int List.size()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		d.addAll(((java.util.Collection) (list)));
	//    6   14:aload_0         
	//    7   15:getfield        #35  <Field List d>
	//    8   18:aload_1         
	//    9   19:invokeinterface #91  <Method boolean List.addAll(java.util.Collection)>
	//   10   24:pop             
		a();
	//   11   25:aload_0         
	//   12   26:invokespecial   #42  <Method PolylineOptions a()>
	//   13   29:pop             
		if(a == null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #60  <Field Polyline a>
	//*  16   34:ifnonnull       52
			a = c.addPolyline(b);
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:getfield        #39  <Field AMap c>
	//   20   42:aload_0         
	//   21   43:getfield        #46  <Field PolylineOptions b>
	//   22   46:invokevirtual   #58  <Method Polyline AMap.addPolyline(PolylineOptions)>
	//   23   49:putfield        #60  <Field Polyline a>
		if(a != null)
	//*  24   52:aload_0         
	//*  25   53:getfield        #60  <Field Polyline a>
	//*  26   56:ifnull          70
			a.setPoints(d);
	//   27   59:aload_0         
	//   28   60:getfield        #60  <Field Polyline a>
	//   29   63:aload_0         
	//   30   64:getfield        #35  <Field List d>
	//   31   67:invokevirtual   #96  <Method void Polyline.setPoints(List)>
	//   32   70:return          
	}

	public int getDistance()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int f>
	//    2    4:ireturn         
	}

	public int getTraceStatus()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int e>
	//    2    4:ireturn         
	}

	public int getWaitTime()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int g>
	//    2    4:ireturn         
	}

	public void remove()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field Polyline a>
	//*   2    4:ifnull          14
			a.remove();
	//    3    7:aload_0         
	//    4    8:getfield        #60  <Field Polyline a>
	//    5   11:invokevirtual   #107 <Method void Polyline.remove()>
	//    6   14:return          
	}

	public void setDistance(int i)
	{
		f = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #100 <Field int f>
	//    3    5:return          
	}

	public void setProperCamera(List list)
	{
		com.amap.api.maps.model.LatLngBounds.Builder builder = LatLngBounds.builder();
	//    0    0:invokestatic    #118 <Method com.amap.api.maps.model.LatLngBounds$Builder LatLngBounds.builder()>
	//    1    3:astore_2        
		if(list == null || list.size() == 0)
	//*   2    4:aload_1         
	//*   3    5:ifnull          17
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #88  <Method int List.size()>
	//*   6   14:ifne            18
			return;
	//    7   17:return          
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); builder.include((LatLng)((Iterator) (list)).next()));
	//    8   18:aload_1         
	//    9   19:invokeinterface #122 <Method Iterator List.iterator()>
	//   10   24:astore_1        
	//   11   25:aload_1         
	//   12   26:invokeinterface #128 <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            51
	//   14   34:aload_2         
	//   15   35:aload_1         
	//   16   36:invokeinterface #132 <Method Object Iterator.next()>
	//   17   41:checkcast       #134 <Class LatLng>
	//   18   44:invokevirtual   #140 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   19   47:pop             
	//*  20   48:goto            25
		try
		{
			list = ((List) (builder.build()));
	//   21   51:aload_2         
	//   22   52:invokevirtual   #144 <Method LatLngBounds com.amap.api.maps.model.LatLngBounds$Builder.build()>
	//   23   55:astore_1        
			c.moveCamera(CameraUpdateFactory.newLatLngBounds(((LatLngBounds) (list)), 20));
	//   24   56:aload_0         
	//   25   57:getfield        #39  <Field AMap c>
	//   26   60:aload_1         
	//   27   61:bipush          20
	//   28   63:invokestatic    #150 <Method com.amap.api.maps.CameraUpdate CameraUpdateFactory.newLatLngBounds(LatLngBounds, int)>
	//   29   66:invokevirtual   #154 <Method void AMap.moveCamera(com.amap.api.maps.CameraUpdate)>
			return;
	//   30   69:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  31   70:astore_1        
		{
			((Throwable) (list)).printStackTrace();
	//   32   71:aload_1         
	//   33   72:invokevirtual   #157 <Method void Throwable.printStackTrace()>
		}
	//   34   75:return          
	}

	public void setTraceStatus(int i)
	{
		e = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field int e>
	//    3    5:return          
	}

	public void setWaitTime(int i)
	{
		g = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #104 <Field int g>
	//    3    5:return          
	}

	public void zoopToSpan()
	{
		setProperCamera(b.getPoints());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field PolylineOptions b>
	//    3    5:invokevirtual   #164 <Method List PolylineOptions.getPoints()>
	//    4    8:invokevirtual   #166 <Method void setProperCamera(List)>
	//    5   11:return          
	}

	public static final int TRACE_STATUS_FAILURE = 3;
	public static final int TRACE_STATUS_FINISH = 2;
	public static final int TRACE_STATUS_PREPARE = 4;
	public static final int TRACE_STATUS_PROCESSING = 1;
	private Polyline a;
	private PolylineOptions b;
	private AMap c;
	private List d;
	private int e;
	private int f;
	private int g;
}
