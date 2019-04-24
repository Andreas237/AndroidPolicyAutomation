// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap;

import android.graphics.*;
import com.autonavi.amap.mapcore.*;

public class GLMapState
{

	public GLMapState(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		nativeStateInstance = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #16  <Field long nativeStateInstance>
		nativeEngineInstance = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #18  <Field long nativeEngineInstance>
		isNewInstance = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #20  <Field boolean isNewInstance>
		if(l != 0L)
	//*  11   19:lload_2         
	//*  12   20:lconst_0        
	//*  13   21:lcmp            
	//*  14   22:ifeq            44
		{
			nativeEngineInstance = l;
	//   15   25:aload_0         
	//   16   26:lload_2         
	//   17   27:putfield        #18  <Field long nativeEngineInstance>
			nativeStateInstance = nativeNewInstance(i, l);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:lload_2         
	//   21   33:invokestatic    #24  <Method long nativeNewInstance(int, long)>
	//   22   36:putfield        #16  <Field long nativeStateInstance>
			isNewInstance = true;
	//   23   39:aload_0         
	//   24   40:iconst_1        
	//   25   41:putfield        #20  <Field boolean isNewInstance>
		}
	//   26   44:return          
	}

	public GLMapState(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		nativeStateInstance = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #16  <Field long nativeStateInstance>
		nativeEngineInstance = 0L;
	//    5    9:aload_0         
	//    6   10:lconst_0        
	//    7   11:putfield        #18  <Field long nativeEngineInstance>
		isNewInstance = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #20  <Field boolean isNewInstance>
		if(l != 0L)
	//*  11   19:lload_1         
	//*  12   20:lconst_0        
	//*  13   21:lcmp            
	//*  14   22:ifeq            40
		{
			nativeEngineInstance = l;
	//   15   25:aload_0         
	//   16   26:lload_1         
	//   17   27:putfield        #18  <Field long nativeEngineInstance>
			nativeStateInstance = l1;
	//   18   30:aload_0         
	//   19   31:lload_3         
	//   20   32:putfield        #16  <Field long nativeStateInstance>
			isNewInstance = true;
	//   21   35:aload_0         
	//   22   36:iconst_1        
	//   23   37:putfield        #20  <Field boolean isNewInstance>
		}
	//   24   40:return          
	}

	public static float calMapZoomScalefactor(int i, int j, int k)
	{
		return nativeCalMapZoomScalefactor(i, j, k);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:i2f             
	//    4    4:invokestatic    #32  <Method float nativeCalMapZoomScalefactor(int, int, float)>
	//    5    7:freturn         
	}

	public static void geo2LonLat(int i, int j, DPoint dpoint)
	{
		DPoint dpoint1 = VirtualEarthProjection.pixelsToLatLong(i, j, 20);
	//    0    0:iload_0         
	//    1    1:i2l             
	//    2    2:iload_1         
	//    3    3:i2l             
	//    4    4:bipush          20
	//    5    6:invokestatic    #40  <Method DPoint VirtualEarthProjection.pixelsToLatLong(long, long, int)>
	//    6    9:astore_3        
		dpoint.x = dpoint1.x;
	//    7   10:aload_2         
	//    8   11:aload_3         
	//    9   12:getfield        #46  <Field double DPoint.x>
	//   10   15:putfield        #46  <Field double DPoint.x>
		dpoint.y = dpoint1.y;
	//   11   18:aload_2         
	//   12   19:aload_3         
	//   13   20:getfield        #49  <Field double DPoint.y>
	//   14   23:putfield        #49  <Field double DPoint.y>
		dpoint1.recycle();
	//   15   26:aload_3         
	//   16   27:invokevirtual   #52  <Method void DPoint.recycle()>
	//   17   30:return          
	}

	public static void lonlat2Geo(double d, double d1, IPoint ipoint)
	{
		Point point = VirtualEarthProjection.latLongToPixels(d1, d, 20);
	//    0    0:dload_2         
	//    1    1:dload_0         
	//    2    2:bipush          20
	//    3    4:invokestatic    #58  <Method Point VirtualEarthProjection.latLongToPixels(double, double, int)>
	//    4    7:astore          5
		ipoint.x = point.x;
	//    5    9:aload           4
	//    6   11:aload           5
	//    7   13:getfield        #63  <Field int Point.x>
	//    8   16:putfield        #66  <Field int IPoint.x>
		ipoint.y = point.y;
	//    9   19:aload           4
	//   10   21:aload           5
	//   11   23:getfield        #68  <Field int Point.y>
	//   12   26:putfield        #69  <Field int IPoint.y>
	//   13   29:return          
	}

	public static native float nativeCalMapZoomScalefactor(int i, int j, float f);

	public static native float nativeGetCameraDegree(long l);

	public static native float nativeGetGLUnitWithWin(long l, int i);

	public static native float nativeGetMapAngle(long l);

	public static native void nativeGetMapCenter(long l, Point point);

	public static native float nativeGetMapZoomer(long l);

	public static native void nativeGetPixel20Bound(long l, Rect rect, int i, int j);

	public static native void nativeGetProjectionMatrix(long l, float af[]);

	public static native float nativeGetSkyHeight(long l);

	public static native void nativeGetViewMatrix(long l, float af[]);

	public static native long nativeNewInstance(int i, long l);

	public static native void nativeP20ToScreenPoint(long l, int i, int j, int k, PointF pointf);

	public static native void nativeRecalculate(long l);

	public static native void nativeScreenToP20Point(long l, float f, float f1, Point point);

	public static native void nativeSetCameraDegree(long l, float f);

	public static native void nativeSetMapAngle(long l, float f);

	public static native void nativeSetMapCenter(long l, int i, int j);

	private static native void nativeSetMapState(int i, long l, long l1);

	public static native void nativeSetMapZoomer(long l, float f);

	public static native void nativeStateDestroy(long l);

	public float getCameraDegree()
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			return nativeGetCameraDegree(nativeStateInstance);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:invokestatic    #102 <Method float nativeGetCameraDegree(long)>
	//    8   16:freturn         
		else
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
	}

	public float getGLUnitWithWin(int i)
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
			return nativeGetGLUnitWithWin(nativeStateInstance, i);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:iload_1         
	//    8   14:invokestatic    #106 <Method float nativeGetGLUnitWithWin(long, int)>
	//    9   17:freturn         
		else
			return 0.0F;
	//   10   18:fconst_0        
	//   11   19:freturn         
	}

	public float getMapAngle()
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			return nativeGetMapAngle(nativeStateInstance);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:invokestatic    #109 <Method float nativeGetMapAngle(long)>
	//    8   16:freturn         
		else
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
	}

	public Point getMapGeoCenter()
	{
		Point point = new Point();
	//    0    0:new             #60  <Class Point>
	//    1    3:dup             
	//    2    4:invokespecial   #112 <Method void Point()>
	//    3    7:astore_1        
		nativeGetMapCenter(nativeStateInstance, point);
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field long nativeStateInstance>
	//    6   12:aload_1         
	//    7   13:invokestatic    #114 <Method void nativeGetMapCenter(long, Point)>
		return point;
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public void getMapGeoCenter(IPoint ipoint)
	{
		nativeGetMapCenter(nativeStateInstance, ((Point) (ipoint)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field long nativeStateInstance>
	//    2    4:aload_1         
	//    3    5:invokestatic    #114 <Method void nativeGetMapCenter(long, Point)>
	//    4    8:return          
	}

	public float getMapLenWithWin(int i)
	{
		return getGLUnitWithWin(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #118 <Method float getGLUnitWithWin(int)>
	//    3    5:freturn         
	}

	public float getMapZoomer()
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			return nativeGetMapZoomer(nativeStateInstance);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:invokestatic    #121 <Method float nativeGetMapZoomer(long)>
	//    8   16:freturn         
		else
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
	}

	public long getNativeInstance()
	{
		return nativeStateInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field long nativeStateInstance>
	//    2    4:lreturn         
	}

	public void getPixel20Bound(Rect rect, int i, int j)
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            19
			nativeGetPixel20Bound(nativeStateInstance, rect, i, j);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:iload_3         
	//   10   16:invokestatic    #127 <Method void nativeGetPixel20Bound(long, Rect, int, int)>
	//   11   19:return          
	}

	public void getProjectionMatrix(float af[])
	{
		if(af != null && af.length == 16)
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:bipush          16
	//*   5    8:icmpne          19
			nativeGetProjectionMatrix(nativeStateInstance, af);
	//    6   11:aload_0         
	//    7   12:getfield        #16  <Field long nativeStateInstance>
	//    8   15:aload_1         
	//    9   16:invokestatic    #131 <Method void nativeGetProjectionMatrix(long, float[])>
	//   10   19:return          
	}

	public float getSkyHeight()
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			return nativeGetSkyHeight(nativeStateInstance);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:invokestatic    #134 <Method float nativeGetSkyHeight(long)>
	//    8   16:freturn         
		else
			return 0.0F;
	//    9   17:fconst_0        
	//   10   18:freturn         
	}

	public void getViewMatrix(float af[])
	{
		if(af != null && af.length == 16)
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:bipush          16
	//*   5    8:icmpne          19
			nativeGetViewMatrix(nativeStateInstance, af);
	//    6   11:aload_0         
	//    7   12:getfield        #16  <Field long nativeStateInstance>
	//    8   15:aload_1         
	//    9   16:invokestatic    #137 <Method void nativeGetViewMatrix(long, float[])>
	//   10   19:return          
	}

	public void p20ToScreenPoint(int i, int j, FPoint fpoint)
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            20
			nativeP20ToScreenPoint(nativeStateInstance, i, j, 0, ((PointF) (fpoint)));
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:iconst_0        
	//   10   16:aload_3         
	//   11   17:invokestatic    #141 <Method void nativeP20ToScreenPoint(long, int, int, int, PointF)>
	//   12   20:return          
	}

	public void recalculate()
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            16
			nativeRecalculate(nativeStateInstance);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:invokestatic    #144 <Method void nativeRecalculate(long)>
	//    8   16:return          
	}

	public void recycle()
	{
		if(nativeStateInstance != 0L && isNewInstance)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            23
	//*   5    9:aload_0         
	//*   6   10:getfield        #20  <Field boolean isNewInstance>
	//*   7   13:ifeq            23
			nativeStateDestroy(nativeStateInstance);
	//    8   16:aload_0         
	//    9   17:getfield        #16  <Field long nativeStateInstance>
	//   10   20:invokestatic    #146 <Method void nativeStateDestroy(long)>
		nativeStateInstance = 0L;
	//   11   23:aload_0         
	//   12   24:lconst_0        
	//   13   25:putfield        #16  <Field long nativeStateInstance>
	//   14   28:return          
	}

	public void reset()
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            13
			recycle();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #148 <Method void recycle()>
		if(nativeEngineInstance != 0L)
	//*   7   13:aload_0         
	//*   8   14:getfield        #18  <Field long nativeEngineInstance>
	//*   9   17:lconst_0        
	//*  10   18:lcmp            
	//*  11   19:ifeq            34
			nativeStateInstance = nativeNewInstance(1, nativeEngineInstance);
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:aload_0         
	//   15   25:getfield        #18  <Field long nativeEngineInstance>
	//   16   28:invokestatic    #24  <Method long nativeNewInstance(int, long)>
	//   17   31:putfield        #16  <Field long nativeStateInstance>
	//   18   34:return          
	}

	public void screenToP20Point(int i, int j, Point point)
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            21
			nativeScreenToP20Point(nativeStateInstance, i, j, point);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:iload_1         
	//    8   14:i2f             
	//    9   15:iload_2         
	//   10   16:i2f             
	//   11   17:aload_3         
	//   12   18:invokestatic    #152 <Method void nativeScreenToP20Point(long, float, float, Point)>
	//   13   21:return          
	}

	public void setCameraDegree(float f)
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			nativeSetCameraDegree(nativeStateInstance, f);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:fload_1         
	//    8   14:invokestatic    #156 <Method void nativeSetCameraDegree(long, float)>
	//    9   17:return          
	}

	public void setMapAngle(float f)
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			nativeSetMapAngle(nativeStateInstance, f);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:fload_1         
	//    8   14:invokestatic    #159 <Method void nativeSetMapAngle(long, float)>
	//    9   17:return          
	}

	public void setMapGeoCenter(int i, int j)
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            18
			nativeSetMapCenter(nativeStateInstance, i, j);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokestatic    #163 <Method void nativeSetMapCenter(long, int, int)>
	//   10   18:return          
	}

	public void setMapZoomer(float f)
	{
		if(nativeStateInstance != 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field long nativeStateInstance>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifeq            17
			nativeSetMapZoomer(nativeStateInstance, f);
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field long nativeStateInstance>
	//    7   13:fload_1         
	//    8   14:invokestatic    #166 <Method void nativeSetMapZoomer(long, float)>
	//    9   17:return          
	}

	public void setNativeMapengineState(int i, long l)
	{
		if(l == 0L || nativeStateInstance == 0L)
	//*   0    0:lload_2         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifeq            15
	//*   4    6:aload_0         
	//*   5    7:getfield        #16  <Field long nativeStateInstance>
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:ifne            16
		{
			return;
	//    9   15:return          
		} else
		{
			nativeEngineInstance = l;
	//   10   16:aload_0         
	//   11   17:lload_2         
	//   12   18:putfield        #18  <Field long nativeEngineInstance>
			nativeSetMapState(i, l, nativeStateInstance);
	//   13   21:iload_1         
	//   14   22:lload_2         
	//   15   23:aload_0         
	//   16   24:getfield        #16  <Field long nativeStateInstance>
	//   17   27:invokestatic    #169 <Method void nativeSetMapState(int, long, long)>
			return;
	//   18   30:return          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append("instance: ").append(nativeStateInstance).append(" ").append("center: ").append(getMapGeoCenter().x).append(" , ").append(getMapGeoCenter().y).append(" ").append("bearing:").append(getCameraDegree()).append("  ").append("tilt:").append(getMapAngle()).append("  ").append("zoom:").append(getMapZoomer()).append("  ").toString();
	//    0    0:new             #173 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #174 <Method void StringBuilder()>
	//    3    7:ldc1            #176 <String "instance: ">
	//    4    9:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #16  <Field long nativeStateInstance>
	//    7   16:invokevirtual   #183 <Method StringBuilder StringBuilder.append(long)>
	//    8   19:ldc1            #185 <String " ">
	//    9   21:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:ldc1            #187 <String "center: ">
	//   11   26:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_0         
	//   13   30:invokevirtual   #189 <Method Point getMapGeoCenter()>
	//   14   33:getfield        #63  <Field int Point.x>
	//   15   36:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//   16   39:ldc1            #194 <String " , ">
	//   17   41:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   18   44:aload_0         
	//   19   45:invokevirtual   #189 <Method Point getMapGeoCenter()>
	//   20   48:getfield        #68  <Field int Point.y>
	//   21   51:invokevirtual   #192 <Method StringBuilder StringBuilder.append(int)>
	//   22   54:ldc1            #185 <String " ">
	//   23   56:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   24   59:ldc1            #196 <String "bearing:">
	//   25   61:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   26   64:aload_0         
	//   27   65:invokevirtual   #198 <Method float getCameraDegree()>
	//   28   68:invokevirtual   #201 <Method StringBuilder StringBuilder.append(float)>
	//   29   71:ldc1            #203 <String "  ">
	//   30   73:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   31   76:ldc1            #205 <String "tilt:">
	//   32   78:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   33   81:aload_0         
	//   34   82:invokevirtual   #207 <Method float getMapAngle()>
	//   35   85:invokevirtual   #201 <Method StringBuilder StringBuilder.append(float)>
	//   36   88:ldc1            #203 <String "  ">
	//   37   90:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   38   93:ldc1            #209 <String "zoom:">
	//   39   95:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   40   98:aload_0         
	//   41   99:invokevirtual   #211 <Method float getMapZoomer()>
	//   42  102:invokevirtual   #201 <Method StringBuilder StringBuilder.append(float)>
	//   43  105:ldc1            #203 <String "  ">
	//   44  107:invokevirtual   #180 <Method StringBuilder StringBuilder.append(String)>
	//   45  110:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   46  113:areturn         
	}

	private boolean isNewInstance;
	private long nativeEngineInstance;
	private long nativeStateInstance;
}
