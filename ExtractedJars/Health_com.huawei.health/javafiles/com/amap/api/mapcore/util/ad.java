// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import com.amap.api.maps.model.*;
import com.autonavi.amap.mapcore.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			u, s

class ad
	implements u
{

	public ad(s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = s1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field s a>
	//    5    9:return          
	}

	public TileProjection fromBoundsToTile(LatLngBounds latlngbounds, int i, int j)
		throws RemoteException
	{
		if(latlngbounds == null || i < 0 || i > 20 || j <= 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:iload_2         
	//*   3    5:iflt            18
	//*   4    8:iload_2         
	//*   5    9:bipush          20
	//*   6   11:icmpgt          18
	//*   7   14:iload_3         
	//*   8   15:ifgt            20
		{
			return null;
	//    9   18:aconst_null     
	//   10   19:areturn         
		} else
		{
			IPoint ipoint = IPoint.obtain();
	//   11   20:invokestatic    #26  <Method IPoint IPoint.obtain()>
	//   12   23:astore          10
			IPoint ipoint1 = IPoint.obtain();
	//   13   25:invokestatic    #26  <Method IPoint IPoint.obtain()>
	//   14   28:astore          11
			a.a(latlngbounds.southwest.latitude, latlngbounds.southwest.longitude, ipoint);
	//   15   30:aload_0         
	//   16   31:getfield        #15  <Field s a>
	//   17   34:aload_1         
	//   18   35:getfield        #32  <Field LatLng LatLngBounds.southwest>
	//   19   38:getfield        #38  <Field double LatLng.latitude>
	//   20   41:aload_1         
	//   21   42:getfield        #32  <Field LatLng LatLngBounds.southwest>
	//   22   45:getfield        #41  <Field double LatLng.longitude>
	//   23   48:aload           10
	//   24   50:invokeinterface #46  <Method void s.a(double, double, IPoint)>
			a.a(latlngbounds.northeast.latitude, latlngbounds.northeast.longitude, ipoint1);
	//   25   55:aload_0         
	//   26   56:getfield        #15  <Field s a>
	//   27   59:aload_1         
	//   28   60:getfield        #49  <Field LatLng LatLngBounds.northeast>
	//   29   63:getfield        #38  <Field double LatLng.latitude>
	//   30   66:aload_1         
	//   31   67:getfield        #49  <Field LatLng LatLngBounds.northeast>
	//   32   70:getfield        #41  <Field double LatLng.longitude>
	//   33   73:aload           11
	//   34   75:invokeinterface #46  <Method void s.a(double, double, IPoint)>
			int k = (ipoint.x >> 20 - i) / j;
	//   35   80:aload           10
	//   36   82:getfield        #53  <Field int IPoint.x>
	//   37   85:bipush          20
	//   38   87:iload_2         
	//   39   88:isub            
	//   40   89:ishr            
	//   41   90:iload_3         
	//   42   91:idiv            
	//   43   92:istore          4
			int l = (ipoint.y >> 20 - i) / j;
	//   44   94:aload           10
	//   45   96:getfield        #56  <Field int IPoint.y>
	//   46   99:bipush          20
	//   47  101:iload_2         
	//   48  102:isub            
	//   49  103:ishr            
	//   50  104:iload_3         
	//   51  105:idiv            
	//   52  106:istore          5
			int i1 = (ipoint1.x >> 20 - i) / j;
	//   53  108:aload           11
	//   54  110:getfield        #53  <Field int IPoint.x>
	//   55  113:bipush          20
	//   56  115:iload_2         
	//   57  116:isub            
	//   58  117:ishr            
	//   59  118:iload_3         
	//   60  119:idiv            
	//   61  120:istore          6
			int j1 = (ipoint1.y >> 20 - i) / j;
	//   62  122:aload           11
	//   63  124:getfield        #56  <Field int IPoint.y>
	//   64  127:bipush          20
	//   65  129:iload_2         
	//   66  130:isub            
	//   67  131:ishr            
	//   68  132:iload_3         
	//   69  133:idiv            
	//   70  134:istore          7
			int k1 = ipoint.x;
	//   71  136:aload           10
	//   72  138:getfield        #53  <Field int IPoint.x>
	//   73  141:istore          8
			int l1 = ipoint1.y;
	//   74  143:aload           11
	//   75  145:getfield        #56  <Field int IPoint.y>
	//   76  148:istore          9
			ipoint.recycle();
	//   77  150:aload           10
	//   78  152:invokevirtual   #59  <Method void IPoint.recycle()>
			ipoint1.recycle();
	//   79  155:aload           11
	//   80  157:invokevirtual   #59  <Method void IPoint.recycle()>
			return new TileProjection(k1 - (k << 20 - i) * j >> 20 - i, l1 - (j1 << 20 - i) * j >> 20 - i, k, i1, j1, l);
	//   81  160:new             #61  <Class TileProjection>
	//   82  163:dup             
	//   83  164:iload           8
	//   84  166:iload           4
	//   85  168:bipush          20
	//   86  170:iload_2         
	//   87  171:isub            
	//   88  172:ishl            
	//   89  173:iload_3         
	//   90  174:imul            
	//   91  175:isub            
	//   92  176:bipush          20
	//   93  178:iload_2         
	//   94  179:isub            
	//   95  180:ishr            
	//   96  181:iload           9
	//   97  183:iload           7
	//   98  185:bipush          20
	//   99  187:iload_2         
	//  100  188:isub            
	//  101  189:ishl            
	//  102  190:iload_3         
	//  103  191:imul            
	//  104  192:isub            
	//  105  193:bipush          20
	//  106  195:iload_2         
	//  107  196:isub            
	//  108  197:ishr            
	//  109  198:iload           4
	//  110  200:iload           6
	//  111  202:iload           7
	//  112  204:iload           5
	//  113  206:invokespecial   #64  <Method void TileProjection(int, int, int, int, int, int)>
	//  114  209:areturn         
		}
	}

	public LatLng fromScreenLocation(Point point)
		throws RemoteException
	{
		if(point == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			DPoint dpoint = DPoint.obtain();
	//    4    6:invokestatic    #72  <Method DPoint DPoint.obtain()>
	//    5    9:astore_2        
			a.b(point.x, point.y, dpoint);
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field s a>
	//    8   14:aload_1         
	//    9   15:getfield        #75  <Field int Point.x>
	//   10   18:aload_1         
	//   11   19:getfield        #76  <Field int Point.y>
	//   12   22:aload_2         
	//   13   23:invokeinterface #80  <Method void s.b(int, int, DPoint)>
			point = ((Point) (new LatLng(dpoint.y, dpoint.x)));
	//   14   28:new             #34  <Class LatLng>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:getfield        #82  <Field double DPoint.y>
	//   18   36:aload_2         
	//   19   37:getfield        #84  <Field double DPoint.x>
	//   20   40:invokespecial   #87  <Method void LatLng(double, double)>
	//   21   43:astore_1        
			dpoint.recycle();
	//   22   44:aload_2         
	//   23   45:invokevirtual   #88  <Method void DPoint.recycle()>
			return ((LatLng) (point));
	//   24   48:aload_1         
	//   25   49:areturn         
		}
	}

	public AMapCameraInfo getCameraInfo()
	{
		return a.getCamerInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field s a>
	//    2    4:invokeinterface #93  <Method AMapCameraInfo s.getCamerInfo()>
	//    3    9:areturn         
	}

	public LatLngBounds getMapBounds(LatLng latlng, float f)
		throws RemoteException
	{
		if(a == null || latlng == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field s a>
	//*   2    4:ifnull          11
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		else
			return a.a(latlng, f, 0.0F, 0.0F);
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field s a>
	//    9   17:aload_1         
	//   10   18:fload_2         
	//   11   19:fconst_0        
	//   12   20:fconst_0        
	//   13   21:invokeinterface #98  <Method LatLngBounds s.a(LatLng, float, float, float)>
	//   14   26:areturn         
	}

	public VisibleRegion getVisibleRegion()
		throws RemoteException
	{
		int i = a.getMapWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field s a>
	//    2    4:invokeinterface #104 <Method int s.getMapWidth()>
	//    3    9:istore_1        
		int j = a.getMapHeight();
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field s a>
	//    6   14:invokeinterface #107 <Method int s.getMapHeight()>
	//    7   19:istore_2        
		LatLng latlng = fromScreenLocation(new Point(0, 0));
	//    8   20:aload_0         
	//    9   21:new             #74  <Class Point>
	//   10   24:dup             
	//   11   25:iconst_0        
	//   12   26:iconst_0        
	//   13   27:invokespecial   #110 <Method void Point(int, int)>
	//   14   30:invokevirtual   #112 <Method LatLng fromScreenLocation(Point)>
	//   15   33:astore_3        
		LatLng latlng1 = fromScreenLocation(new Point(i, 0));
	//   16   34:aload_0         
	//   17   35:new             #74  <Class Point>
	//   18   38:dup             
	//   19   39:iload_1         
	//   20   40:iconst_0        
	//   21   41:invokespecial   #110 <Method void Point(int, int)>
	//   22   44:invokevirtual   #112 <Method LatLng fromScreenLocation(Point)>
	//   23   47:astore          4
		LatLng latlng2 = fromScreenLocation(new Point(0, j));
	//   24   49:aload_0         
	//   25   50:new             #74  <Class Point>
	//   26   53:dup             
	//   27   54:iconst_0        
	//   28   55:iload_2         
	//   29   56:invokespecial   #110 <Method void Point(int, int)>
	//   30   59:invokevirtual   #112 <Method LatLng fromScreenLocation(Point)>
	//   31   62:astore          5
		LatLng latlng3 = fromScreenLocation(new Point(i, j));
	//   32   64:aload_0         
	//   33   65:new             #74  <Class Point>
	//   34   68:dup             
	//   35   69:iload_1         
	//   36   70:iload_2         
	//   37   71:invokespecial   #110 <Method void Point(int, int)>
	//   38   74:invokevirtual   #112 <Method LatLng fromScreenLocation(Point)>
	//   39   77:astore          6
		return new VisibleRegion(latlng2, latlng3, latlng, latlng1, LatLngBounds.builder().include(latlng2).include(latlng3).include(latlng).include(latlng1).build());
	//   40   79:new             #114 <Class VisibleRegion>
	//   41   82:dup             
	//   42   83:aload           5
	//   43   85:aload           6
	//   44   87:aload_3         
	//   45   88:aload           4
	//   46   90:invokestatic    #118 <Method com.amap.api.maps.model.LatLngBounds$Builder LatLngBounds.builder()>
	//   47   93:aload           5
	//   48   95:invokevirtual   #124 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   49   98:aload           6
	//   50  100:invokevirtual   #124 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   51  103:aload_3         
	//   52  104:invokevirtual   #124 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   53  107:aload           4
	//   54  109:invokevirtual   #124 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   55  112:invokevirtual   #128 <Method LatLngBounds com.amap.api.maps.model.LatLngBounds$Builder.build()>
	//   56  115:invokespecial   #131 <Method void VisibleRegion(LatLng, LatLng, LatLng, LatLng, LatLngBounds)>
	//   57  118:areturn         
	}

	public float toMapLenWithWin(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            6
			return 0.0F;
	//    2    4:fconst_0        
	//    3    5:freturn         
		else
			return a.h(i);
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field s a>
	//    6   10:iload_1         
	//    7   11:invokeinterface #136 <Method float s.h(int)>
	//    8   16:freturn         
	}

	public PointF toMapLocation(LatLng latlng)
		throws RemoteException
	{
		if(latlng == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			FPoint fpoint = FPoint.obtain();
	//    4    6:invokestatic    #143 <Method FPoint FPoint.obtain()>
	//    5    9:astore_2        
			a.a(latlng.latitude, latlng.longitude, fpoint);
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field s a>
	//    8   14:aload_1         
	//    9   15:getfield        #38  <Field double LatLng.latitude>
	//   10   18:aload_1         
	//   11   19:getfield        #41  <Field double LatLng.longitude>
	//   12   22:aload_2         
	//   13   23:invokeinterface #146 <Method void s.a(double, double, FPoint)>
			latlng = ((LatLng) (new PointF(fpoint.x, fpoint.y)));
	//   14   28:new             #148 <Class PointF>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:getfield        #151 <Field float FPoint.x>
	//   18   36:aload_2         
	//   19   37:getfield        #153 <Field float FPoint.y>
	//   20   40:invokespecial   #156 <Method void PointF(float, float)>
	//   21   43:astore_1        
			fpoint.recycle();
	//   22   44:aload_2         
	//   23   45:invokevirtual   #157 <Method void FPoint.recycle()>
			return ((PointF) (latlng));
	//   24   48:aload_1         
	//   25   49:areturn         
		}
	}

	public Point toScreenLocation(LatLng latlng)
		throws RemoteException
	{
		if(latlng == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			IPoint ipoint = IPoint.obtain();
	//    4    6:invokestatic    #26  <Method IPoint IPoint.obtain()>
	//    5    9:astore_2        
			a.b(latlng.latitude, latlng.longitude, ipoint);
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field s a>
	//    8   14:aload_1         
	//    9   15:getfield        #38  <Field double LatLng.latitude>
	//   10   18:aload_1         
	//   11   19:getfield        #41  <Field double LatLng.longitude>
	//   12   22:aload_2         
	//   13   23:invokeinterface #161 <Method void s.b(double, double, IPoint)>
			latlng = ((LatLng) (new Point(ipoint.x, ipoint.y)));
	//   14   28:new             #74  <Class Point>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:getfield        #53  <Field int IPoint.x>
	//   18   36:aload_2         
	//   19   37:getfield        #56  <Field int IPoint.y>
	//   20   40:invokespecial   #110 <Method void Point(int, int)>
	//   21   43:astore_1        
			ipoint.recycle();
	//   22   44:aload_2         
	//   23   45:invokevirtual   #59  <Method void IPoint.recycle()>
			return ((Point) (latlng));
	//   24   48:aload_1         
	//   25   49:areturn         
		}
	}

	private s a;
}
