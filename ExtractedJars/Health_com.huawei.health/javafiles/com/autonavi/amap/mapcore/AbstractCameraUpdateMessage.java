// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.graphics.Point;
import com.amap.api.mapcore.util.fd;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.ae.gmap.GLMapState;

// Referenced classes of package com.autonavi.amap.mapcore:
//			MapConfig

public abstract class AbstractCameraUpdateMessage
{
	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/autonavi/amap/mapcore/AbstractCameraUpdateMessage$Type, s);
		//    0    0:ldc1            #2   <Class AbstractCameraUpdateMessage$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #87  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AbstractCameraUpdateMessage$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #79  <Field AbstractCameraUpdateMessage$Type[] $VALUES>
		//    1    3:invokevirtual   #94  <Method Object _5B_Lcom.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type_3B_.clone()>
		//    2    6:checkcast       #90  <Class AbstractCameraUpdateMessage$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type changeBearing;
		public static final Type changeBearingGeoCenter;
		public static final Type changeCenter;
		public static final Type changeGeoCenterZoom;
		public static final Type changeGeoCenterZoomTiltBearing;
		public static final Type changeTilt;
		public static final Type newCameraPosition;
		public static final Type newLatLngBounds;
		public static final Type newLatLngBoundsWithSize;
		public static final Type none;
		public static final Type scrollBy;
		public static final Type zoomBy;
		public static final Type zoomIn;
		public static final Type zoomOut;
		public static final Type zoomTo;

		static 
		{
			none = new Type("none", 0);
		//    0    0:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//    1    3:dup             
		//    2    4:ldc1            #29  <String "none">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//    5   10:putstatic       #35  <Field AbstractCameraUpdateMessage$Type none>
			zoomIn = new Type("zoomIn", 1);
		//    6   13:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//    7   16:dup             
		//    8   17:ldc1            #36  <String "zoomIn">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   11   23:putstatic       #38  <Field AbstractCameraUpdateMessage$Type zoomIn>
			changeCenter = new Type("changeCenter", 2);
		//   12   26:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   13   29:dup             
		//   14   30:ldc1            #39  <String "changeCenter">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   17   36:putstatic       #41  <Field AbstractCameraUpdateMessage$Type changeCenter>
			changeTilt = new Type("changeTilt", 3);
		//   18   39:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   19   42:dup             
		//   20   43:ldc1            #42  <String "changeTilt">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   23   49:putstatic       #44  <Field AbstractCameraUpdateMessage$Type changeTilt>
			changeBearing = new Type("changeBearing", 4);
		//   24   52:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   25   55:dup             
		//   26   56:ldc1            #45  <String "changeBearing">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   29   62:putstatic       #47  <Field AbstractCameraUpdateMessage$Type changeBearing>
			changeBearingGeoCenter = new Type("changeBearingGeoCenter", 5);
		//   30   65:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   31   68:dup             
		//   32   69:ldc1            #48  <String "changeBearingGeoCenter">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   35   75:putstatic       #50  <Field AbstractCameraUpdateMessage$Type changeBearingGeoCenter>
			changeGeoCenterZoom = new Type("changeGeoCenterZoom", 6);
		//   36   78:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   37   81:dup             
		//   38   82:ldc1            #51  <String "changeGeoCenterZoom">
		//   39   84:bipush          6
		//   40   86:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   41   89:putstatic       #53  <Field AbstractCameraUpdateMessage$Type changeGeoCenterZoom>
			zoomOut = new Type("zoomOut", 7);
		//   42   92:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   43   95:dup             
		//   44   96:ldc1            #54  <String "zoomOut">
		//   45   98:bipush          7
		//   46  100:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   47  103:putstatic       #56  <Field AbstractCameraUpdateMessage$Type zoomOut>
			zoomTo = new Type("zoomTo", 8);
		//   48  106:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   49  109:dup             
		//   50  110:ldc1            #57  <String "zoomTo">
		//   51  112:bipush          8
		//   52  114:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   53  117:putstatic       #59  <Field AbstractCameraUpdateMessage$Type zoomTo>
			zoomBy = new Type("zoomBy", 9);
		//   54  120:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   55  123:dup             
		//   56  124:ldc1            #60  <String "zoomBy">
		//   57  126:bipush          9
		//   58  128:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   59  131:putstatic       #62  <Field AbstractCameraUpdateMessage$Type zoomBy>
			scrollBy = new Type("scrollBy", 10);
		//   60  134:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   61  137:dup             
		//   62  138:ldc1            #63  <String "scrollBy">
		//   63  140:bipush          10
		//   64  142:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   65  145:putstatic       #65  <Field AbstractCameraUpdateMessage$Type scrollBy>
			newCameraPosition = new Type("newCameraPosition", 11);
		//   66  148:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   67  151:dup             
		//   68  152:ldc1            #66  <String "newCameraPosition">
		//   69  154:bipush          11
		//   70  156:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   71  159:putstatic       #68  <Field AbstractCameraUpdateMessage$Type newCameraPosition>
			newLatLngBounds = new Type("newLatLngBounds", 12);
		//   72  162:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   73  165:dup             
		//   74  166:ldc1            #69  <String "newLatLngBounds">
		//   75  168:bipush          12
		//   76  170:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   77  173:putstatic       #71  <Field AbstractCameraUpdateMessage$Type newLatLngBounds>
			newLatLngBoundsWithSize = new Type("newLatLngBoundsWithSize", 13);
		//   78  176:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   79  179:dup             
		//   80  180:ldc1            #72  <String "newLatLngBoundsWithSize">
		//   81  182:bipush          13
		//   82  184:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   83  187:putstatic       #74  <Field AbstractCameraUpdateMessage$Type newLatLngBoundsWithSize>
			changeGeoCenterZoomTiltBearing = new Type("changeGeoCenterZoomTiltBearing", 14);
		//   84  190:new             #2   <Class AbstractCameraUpdateMessage$Type>
		//   85  193:dup             
		//   86  194:ldc1            #75  <String "changeGeoCenterZoomTiltBearing">
		//   87  196:bipush          14
		//   88  198:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
		//   89  201:putstatic       #77  <Field AbstractCameraUpdateMessage$Type changeGeoCenterZoomTiltBearing>
			$VALUES = (new Type[] {
				none, zoomIn, changeCenter, changeTilt, changeBearing, changeBearingGeoCenter, changeGeoCenterZoom, zoomOut, zoomTo, zoomBy, 
				scrollBy, newCameraPosition, newLatLngBounds, newLatLngBoundsWithSize, changeGeoCenterZoomTiltBearing
			});
		//   90  204:bipush          15
		//   91  206:anewarray       Type[]
		//   92  209:dup             
		//   93  210:iconst_0        
		//   94  211:getstatic       #35  <Field AbstractCameraUpdateMessage$Type none>
		//   95  214:aastore         
		//   96  215:dup             
		//   97  216:iconst_1        
		//   98  217:getstatic       #38  <Field AbstractCameraUpdateMessage$Type zoomIn>
		//   99  220:aastore         
		//  100  221:dup             
		//  101  222:iconst_2        
		//  102  223:getstatic       #41  <Field AbstractCameraUpdateMessage$Type changeCenter>
		//  103  226:aastore         
		//  104  227:dup             
		//  105  228:iconst_3        
		//  106  229:getstatic       #44  <Field AbstractCameraUpdateMessage$Type changeTilt>
		//  107  232:aastore         
		//  108  233:dup             
		//  109  234:iconst_4        
		//  110  235:getstatic       #47  <Field AbstractCameraUpdateMessage$Type changeBearing>
		//  111  238:aastore         
		//  112  239:dup             
		//  113  240:iconst_5        
		//  114  241:getstatic       #50  <Field AbstractCameraUpdateMessage$Type changeBearingGeoCenter>
		//  115  244:aastore         
		//  116  245:dup             
		//  117  246:bipush          6
		//  118  248:getstatic       #53  <Field AbstractCameraUpdateMessage$Type changeGeoCenterZoom>
		//  119  251:aastore         
		//  120  252:dup             
		//  121  253:bipush          7
		//  122  255:getstatic       #56  <Field AbstractCameraUpdateMessage$Type zoomOut>
		//  123  258:aastore         
		//  124  259:dup             
		//  125  260:bipush          8
		//  126  262:getstatic       #59  <Field AbstractCameraUpdateMessage$Type zoomTo>
		//  127  265:aastore         
		//  128  266:dup             
		//  129  267:bipush          9
		//  130  269:getstatic       #62  <Field AbstractCameraUpdateMessage$Type zoomBy>
		//  131  272:aastore         
		//  132  273:dup             
		//  133  274:bipush          10
		//  134  276:getstatic       #65  <Field AbstractCameraUpdateMessage$Type scrollBy>
		//  135  279:aastore         
		//  136  280:dup             
		//  137  281:bipush          11
		//  138  283:getstatic       #68  <Field AbstractCameraUpdateMessage$Type newCameraPosition>
		//  139  286:aastore         
		//  140  287:dup             
		//  141  288:bipush          12
		//  142  290:getstatic       #71  <Field AbstractCameraUpdateMessage$Type newLatLngBounds>
		//  143  293:aastore         
		//  144  294:dup             
		//  145  295:bipush          13
		//  146  297:getstatic       #74  <Field AbstractCameraUpdateMessage$Type newLatLngBoundsWithSize>
		//  147  300:aastore         
		//  148  301:dup             
		//  149  302:bipush          14
		//  150  304:getstatic       #77  <Field AbstractCameraUpdateMessage$Type changeGeoCenterZoomTiltBearing>
		//  151  307:aastore         
		//  152  308:putstatic       #79  <Field AbstractCameraUpdateMessage$Type[] $VALUES>
		//* 153  311:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #81  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public AbstractCameraUpdateMessage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		nowType = Type.none;
	//    2    4:aload_0         
	//    3    5:getstatic       #48  <Field AbstractCameraUpdateMessage$Type AbstractCameraUpdateMessage$Type.none>
	//    4    8:putfield        #50  <Field AbstractCameraUpdateMessage$Type nowType>
		focus = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #52  <Field Point focus>
		zoom = (0.0F / 0.0F);
	//    8   16:aload_0         
	//    9   17:ldc1            #53  <Float (0.0F / 0.0F)>
	//   10   19:putfield        #55  <Field float zoom>
		tilt = (0.0F / 0.0F);
	//   11   22:aload_0         
	//   12   23:ldc1            #53  <Float (0.0F / 0.0F)>
	//   13   25:putfield        #57  <Field float tilt>
		bearing = (0.0F / 0.0F);
	//   14   28:aload_0         
	//   15   29:ldc1            #53  <Float (0.0F / 0.0F)>
	//   16   31:putfield        #59  <Field float bearing>
		isUseAnchor = false;
	//   17   34:aload_0         
	//   18   35:iconst_0        
	//   19   36:putfield        #61  <Field boolean isUseAnchor>
		mDuration = 250L;
	//   20   39:aload_0         
	//   21   40:ldc2w           #62  <Long 250L>
	//   22   43:putfield        #65  <Field long mDuration>
	//   23   46:return          
	}

	protected void changeCenterByAnchor(GLMapState glmapstate, Point point)
	{
		changeCenterByAnchor(glmapstate, point, anchorX, anchorY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #70  <Field int anchorX>
	//    5    7:aload_0         
	//    6    8:getfield        #72  <Field int anchorY>
	//    7   11:invokevirtual   #75  <Method void changeCenterByAnchor(GLMapState, Point, int, int)>
	//    8   14:return          
	}

	protected void changeCenterByAnchor(GLMapState glmapstate, Point point, int i, int j)
	{
		glmapstate.recalculate();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #80  <Method void GLMapState.recalculate()>
		Point point1 = getAnchorGeoPoint(glmapstate, i, j);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #84  <Method Point getAnchorGeoPoint(GLMapState, int, int)>
	//    7   12:astore          5
		Point point2 = glmapstate.getMapGeoCenter();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #88  <Method Point GLMapState.getMapGeoCenter()>
	//   10   18:astore          6
		glmapstate.setMapGeoCenter((point2.x + point.x) - point1.x, (point2.y + point.y) - point1.y);
	//   11   20:aload_1         
	//   12   21:aload           6
	//   13   23:getfield        #93  <Field int Point.x>
	//   14   26:aload_2         
	//   15   27:getfield        #93  <Field int Point.x>
	//   16   30:iadd            
	//   17   31:aload           5
	//   18   33:getfield        #93  <Field int Point.x>
	//   19   36:isub            
	//   20   37:aload           6
	//   21   39:getfield        #96  <Field int Point.y>
	//   22   42:aload_2         
	//   23   43:getfield        #96  <Field int Point.y>
	//   24   46:iadd            
	//   25   47:aload           5
	//   26   49:getfield        #96  <Field int Point.y>
	//   27   52:isub            
	//   28   53:invokevirtual   #100 <Method void GLMapState.setMapGeoCenter(int, int)>
	//   29   56:return          
	}

	public void generateMapAnimation(GLMapEngine glmapengine)
	{
		GLMapState glmapstate = glmapengine.getNewMapState(1);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #108 <Method GLMapState GLMapEngine.getNewMapState(int)>
	//    3    5:astore_2        
		runCameraUpdate(glmapstate);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #112 <Method void runCameraUpdate(GLMapState)>
		Point point = glmapstate.getMapGeoCenter();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #88  <Method Point GLMapState.getMapGeoCenter()>
	//    9   15:astore_3        
		glmapengine.addGroupAnimation(1, (int)mDuration, glmapstate.getMapZoomer(), (int)glmapstate.getMapAngle(), (int)glmapstate.getCameraDegree(), point.x, point.y, mCallback);
	//   10   16:aload_1         
	//   11   17:iconst_1        
	//   12   18:aload_0         
	//   13   19:getfield        #65  <Field long mDuration>
	//   14   22:l2i             
	//   15   23:aload_2         
	//   16   24:invokevirtual   #116 <Method float GLMapState.getMapZoomer()>
	//   17   27:aload_2         
	//   18   28:invokevirtual   #119 <Method float GLMapState.getMapAngle()>
	//   19   31:f2i             
	//   20   32:aload_2         
	//   21   33:invokevirtual   #122 <Method float GLMapState.getCameraDegree()>
	//   22   36:f2i             
	//   23   37:aload_3         
	//   24   38:getfield        #93  <Field int Point.x>
	//   25   41:aload_3         
	//   26   42:getfield        #96  <Field int Point.y>
	//   27   45:aload_0         
	//   28   46:getfield        #124 <Field com.amap.api.maps.AMap$CancelableCallback mCallback>
	//   29   49:invokevirtual   #128 <Method void GLMapEngine.addGroupAnimation(int, int, float, int, int, int, int, com.amap.api.maps.AMap$CancelableCallback)>
		glmapstate.recycle();
	//   30   52:aload_2         
	//   31   53:invokevirtual   #131 <Method void GLMapState.recycle()>
	//   32   56:return          
	}

	protected Point getAnchorGeoPoint(GLMapState glmapstate, int i, int j)
	{
		Point point = new Point();
	//    0    0:new             #90  <Class Point>
	//    1    3:dup             
	//    2    4:invokespecial   #132 <Method void Point()>
	//    3    7:astore          4
		glmapstate.screenToP20Point(i, j, point);
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:aload           4
	//    8   14:invokevirtual   #136 <Method void GLMapState.screenToP20Point(int, int, Point)>
		return point;
	//    9   17:aload           4
	//   10   19:areturn         
	}

	public abstract void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage abstractcameraupdatemessage);

	protected void normalChange(GLMapState glmapstate)
	{
		float f;
		if(Float.isNaN(zoom))
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field float zoom>
	//*   2    4:invokestatic    #145 <Method boolean Float.isNaN(float)>
	//*   3    7:ifeq            18
			f = glmapstate.getMapZoomer();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #116 <Method float GLMapState.getMapZoomer()>
	//    6   14:fstore_2        
		else
	//*   7   15:goto            23
			f = zoom;
	//    8   18:aload_0         
	//    9   19:getfield        #55  <Field float zoom>
	//   10   22:fstore_2        
		zoom = f;
	//   11   23:aload_0         
	//   12   24:fload_2         
	//   13   25:putfield        #55  <Field float zoom>
		if(Float.isNaN(bearing))
	//*  14   28:aload_0         
	//*  15   29:getfield        #59  <Field float bearing>
	//*  16   32:invokestatic    #145 <Method boolean Float.isNaN(float)>
	//*  17   35:ifeq            46
			f = glmapstate.getMapAngle();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #119 <Method float GLMapState.getMapAngle()>
	//   20   42:fstore_2        
		else
	//*  21   43:goto            51
			f = bearing;
	//   22   46:aload_0         
	//   23   47:getfield        #59  <Field float bearing>
	//   24   50:fstore_2        
		bearing = f;
	//   25   51:aload_0         
	//   26   52:fload_2         
	//   27   53:putfield        #59  <Field float bearing>
		if(Float.isNaN(tilt))
	//*  28   56:aload_0         
	//*  29   57:getfield        #57  <Field float tilt>
	//*  30   60:invokestatic    #145 <Method boolean Float.isNaN(float)>
	//*  31   63:ifeq            74
			f = glmapstate.getCameraDegree();
	//   32   66:aload_1         
	//   33   67:invokevirtual   #122 <Method float GLMapState.getCameraDegree()>
	//   34   70:fstore_2        
		else
	//*  35   71:goto            79
			f = tilt;
	//   36   74:aload_0         
	//   37   75:getfield        #57  <Field float tilt>
	//   38   78:fstore_2        
		tilt = f;
	//   39   79:aload_0         
	//   40   80:fload_2         
	//   41   81:putfield        #57  <Field float tilt>
		zoom = fd.a(mapConfig, zoom);
	//   42   84:aload_0         
	//   43   85:aload_0         
	//   44   86:getfield        #147 <Field MapConfig mapConfig>
	//   45   89:aload_0         
	//   46   90:getfield        #55  <Field float zoom>
	//   47   93:invokestatic    #153 <Method float fd.a(MapConfig, float)>
	//   48   96:putfield        #55  <Field float zoom>
		tilt = fd.a(tilt, zoom);
	//   49   99:aload_0         
	//   50  100:aload_0         
	//   51  101:getfield        #57  <Field float tilt>
	//   52  104:aload_0         
	//   53  105:getfield        #55  <Field float zoom>
	//   54  108:invokestatic    #156 <Method float fd.a(float, float)>
	//   55  111:putfield        #57  <Field float tilt>
		bearing = (float)(((double)bearing % 360D + 360D) % 360D);
	//   56  114:aload_0         
	//   57  115:aload_0         
	//   58  116:getfield        #59  <Field float bearing>
	//   59  119:f2d             
	//   60  120:ldc2w           #157 <Double 360D>
	//   61  123:drem            
	//   62  124:ldc2w           #157 <Double 360D>
	//   63  127:dadd            
	//   64  128:ldc2w           #157 <Double 360D>
	//   65  131:drem            
	//   66  132:d2f             
	//   67  133:putfield        #59  <Field float bearing>
		if(focus != null && geoPoint == null)
	//*  68  136:aload_0         
	//*  69  137:getfield        #52  <Field Point focus>
	//*  70  140:ifnull          173
	//*  71  143:aload_0         
	//*  72  144:getfield        #160 <Field Point geoPoint>
	//*  73  147:ifnonnull       173
			geoPoint = getAnchorGeoPoint(glmapstate, focus.x, focus.y);
	//   74  150:aload_0         
	//   75  151:aload_0         
	//   76  152:aload_1         
	//   77  153:aload_0         
	//   78  154:getfield        #52  <Field Point focus>
	//   79  157:getfield        #93  <Field int Point.x>
	//   80  160:aload_0         
	//   81  161:getfield        #52  <Field Point focus>
	//   82  164:getfield        #96  <Field int Point.y>
	//   83  167:invokevirtual   #84  <Method Point getAnchorGeoPoint(GLMapState, int, int)>
	//   84  170:putfield        #160 <Field Point geoPoint>
		if(!Float.isNaN(zoom))
	//*  85  173:aload_0         
	//*  86  174:getfield        #55  <Field float zoom>
	//*  87  177:invokestatic    #145 <Method boolean Float.isNaN(float)>
	//*  88  180:ifne            191
			glmapstate.setMapZoomer(zoom);
	//   89  183:aload_1         
	//   90  184:aload_0         
	//   91  185:getfield        #55  <Field float zoom>
	//   92  188:invokevirtual   #164 <Method void GLMapState.setMapZoomer(float)>
		if(!Float.isNaN(bearing))
	//*  93  191:aload_0         
	//*  94  192:getfield        #59  <Field float bearing>
	//*  95  195:invokestatic    #145 <Method boolean Float.isNaN(float)>
	//*  96  198:ifne            209
			glmapstate.setMapAngle(bearing);
	//   97  201:aload_1         
	//   98  202:aload_0         
	//   99  203:getfield        #59  <Field float bearing>
	//  100  206:invokevirtual   #167 <Method void GLMapState.setMapAngle(float)>
		if(!Float.isNaN(tilt))
	//* 101  209:aload_0         
	//* 102  210:getfield        #57  <Field float tilt>
	//* 103  213:invokestatic    #145 <Method boolean Float.isNaN(float)>
	//* 104  216:ifne            227
			glmapstate.setCameraDegree(tilt);
	//  105  219:aload_1         
	//  106  220:aload_0         
	//  107  221:getfield        #57  <Field float tilt>
	//  108  224:invokevirtual   #170 <Method void GLMapState.setCameraDegree(float)>
		if(focus != null)
	//* 109  227:aload_0         
	//* 110  228:getfield        #52  <Field Point focus>
	//* 111  231:ifnull          258
		{
			changeCenterByAnchor(glmapstate, geoPoint, focus.x, focus.y);
	//  112  234:aload_0         
	//  113  235:aload_1         
	//  114  236:aload_0         
	//  115  237:getfield        #160 <Field Point geoPoint>
	//  116  240:aload_0         
	//  117  241:getfield        #52  <Field Point focus>
	//  118  244:getfield        #93  <Field int Point.x>
	//  119  247:aload_0         
	//  120  248:getfield        #52  <Field Point focus>
	//  121  251:getfield        #96  <Field int Point.y>
	//  122  254:invokevirtual   #75  <Method void changeCenterByAnchor(GLMapState, Point, int, int)>
			return;
	//  123  257:return          
		}
		boolean flag;
		if(geoPoint != null && (geoPoint.x != 0 || geoPoint.y != 0))
	//* 124  258:aload_0         
	//* 125  259:getfield        #160 <Field Point geoPoint>
	//* 126  262:ifnull          290
	//* 127  265:aload_0         
	//* 128  266:getfield        #160 <Field Point geoPoint>
	//* 129  269:getfield        #93  <Field int Point.x>
	//* 130  272:ifne            285
	//* 131  275:aload_0         
	//* 132  276:getfield        #160 <Field Point geoPoint>
	//* 133  279:getfield        #96  <Field int Point.y>
	//* 134  282:ifeq            290
			flag = true;
	//  135  285:iconst_1        
	//  136  286:istore_3        
		else
	//* 137  287:goto            292
			flag = false;
	//  138  290:iconst_0        
	//  139  291:istore_3        
		if(flag)
	//* 140  292:iload_3         
	//* 141  293:ifeq            314
			glmapstate.setMapGeoCenter(geoPoint.x, geoPoint.y);
	//  142  296:aload_1         
	//  143  297:aload_0         
	//  144  298:getfield        #160 <Field Point geoPoint>
	//  145  301:getfield        #93  <Field int Point.x>
	//  146  304:aload_0         
	//  147  305:getfield        #160 <Field Point geoPoint>
	//  148  308:getfield        #96  <Field int Point.y>
	//  149  311:invokevirtual   #100 <Method void GLMapState.setMapGeoCenter(int, int)>
	//  150  314:return          
	}

	public abstract void runCameraUpdate(GLMapState glmapstate);

	public float amount;
	public int anchorX;
	public int anchorY;
	public float bearing;
	public LatLngBounds bounds;
	public CameraPosition cameraPosition;
	public Point focus;
	public Point geoPoint;
	public int height;
	public boolean isChangeFinished;
	public boolean isUseAnchor;
	public com.amap.api.maps.AMap.CancelableCallback mCallback;
	public long mDuration;
	public MapConfig mapConfig;
	public Type nowType;
	public int paddingBottom;
	public int paddingLeft;
	public int paddingRight;
	public int paddingTop;
	public float tilt;
	public int width;
	public float xPixel;
	public float yPixel;
	public float zoom;
}
