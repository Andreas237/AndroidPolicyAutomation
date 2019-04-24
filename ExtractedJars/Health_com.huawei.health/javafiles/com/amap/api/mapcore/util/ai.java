// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

public class ai extends AbstractCameraUpdateMessage
{

	public ai()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AbstractCameraUpdateMessage()>
	//    2    4:return          
	}

	public void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage abstractcameraupdatemessage)
	{
		android.graphics.Point point;
		if(geoPoint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field android.graphics.Point geoPoint>
	//*   2    4:ifnonnull       15
			point = abstractcameraupdatemessage.geoPoint;
	//    3    7:aload_1         
	//    4    8:getfield        #16  <Field android.graphics.Point AbstractCameraUpdateMessage.geoPoint>
	//    5   11:astore_3        
		else
	//*   6   12:goto            20
			point = geoPoint;
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field android.graphics.Point geoPoint>
	//    9   19:astore_3        
		abstractcameraupdatemessage.geoPoint = point;
	//   10   20:aload_1         
	//   11   21:aload_3         
	//   12   22:putfield        #16  <Field android.graphics.Point AbstractCameraUpdateMessage.geoPoint>
		float f;
		if(Float.isNaN(zoom))
	//*  13   25:aload_0         
	//*  14   26:getfield        #20  <Field float zoom>
	//*  15   29:invokestatic    #26  <Method boolean Float.isNaN(float)>
	//*  16   32:ifeq            43
			f = abstractcameraupdatemessage.zoom;
	//   17   35:aload_1         
	//   18   36:getfield        #27  <Field float AbstractCameraUpdateMessage.zoom>
	//   19   39:fstore_2        
		else
	//*  20   40:goto            48
			f = zoom;
	//   21   43:aload_0         
	//   22   44:getfield        #20  <Field float zoom>
	//   23   47:fstore_2        
		abstractcameraupdatemessage.zoom = f;
	//   24   48:aload_1         
	//   25   49:fload_2         
	//   26   50:putfield        #27  <Field float AbstractCameraUpdateMessage.zoom>
		if(Float.isNaN(bearing))
	//*  27   53:aload_0         
	//*  28   54:getfield        #30  <Field float bearing>
	//*  29   57:invokestatic    #26  <Method boolean Float.isNaN(float)>
	//*  30   60:ifeq            71
			f = abstractcameraupdatemessage.bearing;
	//   31   63:aload_1         
	//   32   64:getfield        #31  <Field float AbstractCameraUpdateMessage.bearing>
	//   33   67:fstore_2        
		else
	//*  34   68:goto            76
			f = bearing;
	//   35   71:aload_0         
	//   36   72:getfield        #30  <Field float bearing>
	//   37   75:fstore_2        
		abstractcameraupdatemessage.bearing = f;
	//   38   76:aload_1         
	//   39   77:fload_2         
	//   40   78:putfield        #31  <Field float AbstractCameraUpdateMessage.bearing>
		if(Float.isNaN(tilt))
	//*  41   81:aload_0         
	//*  42   82:getfield        #34  <Field float tilt>
	//*  43   85:invokestatic    #26  <Method boolean Float.isNaN(float)>
	//*  44   88:ifeq            99
			f = abstractcameraupdatemessage.tilt;
	//   45   91:aload_1         
	//   46   92:getfield        #35  <Field float AbstractCameraUpdateMessage.tilt>
	//   47   95:fstore_2        
		else
	//*  48   96:goto            104
			f = tilt;
	//   49   99:aload_0         
	//   50  100:getfield        #34  <Field float tilt>
	//   51  103:fstore_2        
		abstractcameraupdatemessage.tilt = f;
	//   52  104:aload_1         
	//   53  105:fload_2         
	//   54  106:putfield        #35  <Field float AbstractCameraUpdateMessage.tilt>
	//   55  109:return          
	}

	public void runCameraUpdate(GLMapState glmapstate)
	{
		normalChange(glmapstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method void normalChange(GLMapState)>
	//    3    5:return          
	}
}
