// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.util.Pair;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.IPoint;

// Referenced classes of package com.amap.api.mapcore.util:
//			fd

public class ah extends AbstractCameraUpdateMessage
{

	public ah()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractCameraUpdateMessage()>
	//    2    4:return          
	}

	public void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage abstractcameraupdatemessage)
	{
	//    0    0:return          
	}

	public void runCameraUpdate(GLMapState glmapstate)
	{
		Pair pair = fd.a(((AbstractCameraUpdateMessage) (this)), glmapstate, mapConfig);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field com.autonavi.amap.mapcore.MapConfig mapConfig>
	//    4    6:invokestatic    #23  <Method Pair fd.a(AbstractCameraUpdateMessage, GLMapState, com.autonavi.amap.mapcore.MapConfig)>
	//    5    9:astore_2        
		if(pair == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       15
		{
			return;
	//    8   14:return          
		} else
		{
			glmapstate.setMapZoomer(((Float)pair.first).floatValue());
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:getfield        #29  <Field Object Pair.first>
	//   12   20:checkcast       #31  <Class Float>
	//   13   23:invokevirtual   #35  <Method float Float.floatValue()>
	//   14   26:invokevirtual   #41  <Method void GLMapState.setMapZoomer(float)>
			glmapstate.setMapGeoCenter(((IPoint)pair.second).x, ((IPoint)pair.second).y);
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:getfield        #44  <Field Object Pair.second>
	//   18   34:checkcast       #46  <Class IPoint>
	//   19   37:getfield        #50  <Field int IPoint.x>
	//   20   40:aload_2         
	//   21   41:getfield        #44  <Field Object Pair.second>
	//   22   44:checkcast       #46  <Class IPoint>
	//   23   47:getfield        #53  <Field int IPoint.y>
	//   24   50:invokevirtual   #57  <Method void GLMapState.setMapGeoCenter(int, int)>
			glmapstate.setCameraDegree(0.0F);
	//   25   53:aload_1         
	//   26   54:fconst_0        
	//   27   55:invokevirtual   #60  <Method void GLMapState.setCameraDegree(float)>
			glmapstate.setMapAngle(0.0F);
	//   28   58:aload_1         
	//   29   59:fconst_0        
	//   30   60:invokevirtual   #63  <Method void GLMapState.setMapAngle(float)>
			return;
	//   31   63:return          
		}
	}
}
