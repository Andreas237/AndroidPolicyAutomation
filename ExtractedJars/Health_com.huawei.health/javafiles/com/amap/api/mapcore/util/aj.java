// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Point;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

public class aj extends AbstractCameraUpdateMessage
{

	public aj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractCameraUpdateMessage()>
	//    2    4:return          
	}

	public void a(GLMapState glmapstate, int i, int j, Point point)
	{
		glmapstate.screenToP20Point(i, j, point);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #17  <Method void GLMapState.screenToP20Point(int, int, Point)>
	//    5    8:return          
	}

	public void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage abstractcameraupdatemessage)
	{
	//    0    0:return          
	}

	public void runCameraUpdate(GLMapState glmapstate)
	{
		float f = xPixel;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float xPixel>
	//    2    4:fstore_2        
		float f1 = yPixel;
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field float yPixel>
	//    5    9:fstore_3        
		float f2 = (float)width / 2.0F;
	//    6   10:aload_0         
	//    7   11:getfield        #32  <Field int width>
	//    8   14:i2f             
	//    9   15:fconst_2        
	//   10   16:fdiv            
	//   11   17:fstore          4
		float f3 = (float)height / 2.0F;
	//   12   19:aload_0         
	//   13   20:getfield        #35  <Field int height>
	//   14   23:i2f             
	//   15   24:fconst_2        
	//   16   25:fdiv            
	//   17   26:fstore          5
		Point point = new Point();
	//   18   28:new             #37  <Class Point>
	//   19   31:dup             
	//   20   32:invokespecial   #38  <Method void Point()>
	//   21   35:astore          6
		a(glmapstate, (int)(f + f2), (int)(f1 + f3), point);
	//   22   37:aload_0         
	//   23   38:aload_1         
	//   24   39:fload_2         
	//   25   40:fload           4
	//   26   42:fadd            
	//   27   43:f2i             
	//   28   44:fload_3         
	//   29   45:fload           5
	//   30   47:fadd            
	//   31   48:f2i             
	//   32   49:aload           6
	//   33   51:invokevirtual   #40  <Method void a(GLMapState, int, int, Point)>
		glmapstate.setMapGeoCenter(point.x, point.y);
	//   34   54:aload_1         
	//   35   55:aload           6
	//   36   57:getfield        #43  <Field int Point.x>
	//   37   60:aload           6
	//   38   62:getfield        #46  <Field int Point.y>
	//   39   65:invokevirtual   #50  <Method void GLMapState.setMapGeoCenter(int, int)>
	//   40   68:return          
	}
}
