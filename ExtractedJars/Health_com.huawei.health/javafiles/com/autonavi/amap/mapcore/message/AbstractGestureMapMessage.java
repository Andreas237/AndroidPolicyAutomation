// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.message;

import com.autonavi.ae.gmap.AbstractMapMessage;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.IPoint;

public abstract class AbstractGestureMapMessage extends AbstractMapMessage
{

	public AbstractGestureMapMessage(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AbstractMapMessage()>
		width = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int width>
		height = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field int height>
		isGestureScaleByMapCenter = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #24  <Field boolean isGestureScaleByMapCenter>
		isUseAnchor = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #26  <Field boolean isUseAnchor>
		state = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #28  <Field int state>
		state = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #28  <Field int state>
	//   20   34:return          
	}

	protected IPoint getAnchorGeoPoint(GLMapState glmapstate, int i, int j)
	{
		IPoint ipoint = IPoint.obtain();
	//    0    0:invokestatic    #37  <Method IPoint IPoint.obtain()>
	//    1    3:astore          4
		glmapstate.screenToP20Point(i, j, ((android.graphics.Point) (ipoint)));
	//    2    5:aload_1         
	//    3    6:iload_2         
	//    4    7:iload_3         
	//    5    8:aload           4
	//    6   10:invokevirtual   #43  <Method void GLMapState.screenToP20Point(int, int, android.graphics.Point)>
		return ipoint;
	//    7   13:aload           4
	//    8   15:areturn         
	}

	public int getMapGestureState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int state>
	//    2    4:ireturn         
	}

	public abstract int getType();

	public void reset()
	{
		width = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #20  <Field int width>
		height = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #22  <Field int height>
		state = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #28  <Field int state>
		isGestureScaleByMapCenter = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #24  <Field boolean isGestureScaleByMapCenter>
		isUseAnchor = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #26  <Field boolean isUseAnchor>
		anchorX = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #49  <Field int anchorX>
		anchorY = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #51  <Field int anchorY>
	//   21   35:return          
	}

	public abstract void runCameraUpdate(GLMapState glmapstate);

	public void setState(int i)
	{
		state = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int state>
	//    3    5:return          
	}

	protected void win2geo(GLMapState glmapstate, int i, int j, IPoint ipoint)
	{
		glmapstate.screenToP20Point(i, j, ((android.graphics.Point) (ipoint)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:invokevirtual   #43  <Method void GLMapState.screenToP20Point(int, int, android.graphics.Point)>
	//    5    8:return          
	}

	public int anchorX;
	public int anchorY;
	public int height;
	public boolean isGestureScaleByMapCenter;
	public boolean isUseAnchor;
	private int state;
	public int width;
}
