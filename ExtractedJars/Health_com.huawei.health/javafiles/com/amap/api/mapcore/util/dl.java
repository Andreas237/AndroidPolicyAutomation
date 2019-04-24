// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.LatLng;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			dc, hm, s, fd

public class dl
	implements dc
{

	public dl(s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		i = 10F;
	//    2    4:aload_0         
	//    3    5:ldc1            #42  <Float 10F>
	//    4    7:putfield        #44  <Field float i>
		j = 0xff000000;
	//    5   10:aload_0         
	//    6   11:ldc1            #45  <Int 0xff000000>
	//    7   13:putfield        #47  <Field int j>
		k = 0xff000000;
	//    8   16:aload_0         
	//    9   17:ldc1            #45  <Int 0xff000000>
	//   10   19:putfield        #49  <Field int k>
		l = 0.0F;
	//   11   22:aload_0         
	//   12   23:fconst_0        
	//   13   24:putfield        #51  <Field float l>
		m = true;
	//   14   27:aload_0         
	//   15   28:iconst_1        
	//   16   29:putfield        #53  <Field boolean m>
		o = ((List) (new Vector()));
	//   17   32:aload_0         
	//   18   33:new             #55  <Class Vector>
	//   19   36:dup             
	//   20   37:invokespecial   #56  <Method void Vector()>
	//   21   40:putfield        #58  <Field List o>
		p = 0;
	//   22   43:aload_0         
	//   23   44:iconst_0        
	//   24   45:putfield        #60  <Field int p>
		q = false;
	//   25   48:aload_0         
	//   26   49:iconst_0        
	//   27   50:putfield        #62  <Field boolean q>
		r = new Object();
	//   28   53:aload_0         
	//   29   54:new             #4   <Class Object>
	//   30   57:dup             
	//   31   58:invokespecial   #41  <Method void Object()>
	//   32   61:putfield        #64  <Field Object r>
		e = null;
	//   33   64:aload_0         
	//   34   65:aconst_null     
	//   35   66:putfield        #66  <Field Rect e>
		g = 0;
	//   36   69:aload_0         
	//   37   70:iconst_0        
	//   38   71:putfield        #68  <Field int g>
		h = s1;
	//   39   74:aload_0         
	//   40   75:aload_1         
	//   41   76:putfield        #70  <Field s h>
		try
		{
			n = getId();
	//   42   79:aload_0         
	//   43   80:aload_0         
	//   44   81:invokevirtual   #74  <Method String getId()>
	//   45   84:putfield        #76  <Field String n>
			return;
	//   46   87:return          
		}
		// Misplaced declaration of an exception variable
		catch(s s1)
	//*  47   88:astore_1        
		{
			hm.c(((Throwable) (s1)), "NavigateArrowDelegateImp", "create");
	//   48   89:aload_1         
	//   49   90:ldc1            #78  <String "NavigateArrowDelegateImp">
	//   50   92:ldc1            #80  <String "create">
	//   51   94:invokestatic    #85  <Method void hm.c(Throwable, String, String)>
		}
		((RemoteException) (s1)).printStackTrace();
	//   52   97:aload_1         
	//   53   98:invokevirtual   #88  <Method void RemoteException.printStackTrace()>
	//   54  101:return          
	}

	private List b()
		throws RemoteException
	{
		if(o == null)
			break MISSING_BLOCK_LABEL_124;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field List o>
	//    2    4:ifnull          124
		Object obj = r;
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field Object r>
	//    5   11:astore_1        
		obj;
	//    6   12:aload_1         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		ArrayList arraylist;
		Iterator iterator;
		arraylist = new ArrayList();
	//    8   14:new             #92  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #93  <Method void ArrayList()>
	//   11   21:astore_2        
		iterator = o.iterator();
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field List o>
	//   14   26:invokeinterface #99  <Method Iterator List.iterator()>
	//   15   31:astore_3        
_L2:
		IPoint ipoint;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_115;
	//   16   32:aload_3         
	//   17   33:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   18   38:ifeq            115
			ipoint = (IPoint)iterator.next();
	//   19   41:aload_3         
	//   20   42:invokeinterface #109 <Method Object Iterator.next()>
	//   21   47:checkcast       #111 <Class IPoint>
	//   22   50:astore          4
		} while(ipoint == null);
	//   23   52:aload           4
	//   24   54:ifnull          112
		DPoint dpoint = DPoint.obtain();
	//   25   57:invokestatic    #117 <Method DPoint DPoint.obtain()>
	//   26   60:astore          5
		h.a(ipoint.x, ipoint.y, dpoint);
	//   27   62:aload_0         
	//   28   63:getfield        #70  <Field s h>
	//   29   66:aload           4
	//   30   68:getfield        #120 <Field int IPoint.x>
	//   31   71:aload           4
	//   32   73:getfield        #123 <Field int IPoint.y>
	//   33   76:aload           5
	//   34   78:invokeinterface #128 <Method void s.a(int, int, DPoint)>
		((List) (arraylist)).add(((Object) (new LatLng(dpoint.y, dpoint.x))));
	//   35   83:aload_2         
	//   36   84:new             #130 <Class LatLng>
	//   37   87:dup             
	//   38   88:aload           5
	//   39   90:getfield        #133 <Field double DPoint.y>
	//   40   93:aload           5
	//   41   95:getfield        #135 <Field double DPoint.x>
	//   42   98:invokespecial   #138 <Method void LatLng(double, double)>
	//   43  101:invokeinterface #142 <Method boolean List.add(Object)>
	//   44  106:pop             
		dpoint.recycle();
	//   45  107:aload           5
	//   46  109:invokevirtual   #145 <Method void DPoint.recycle()>
		if(true) goto _L2; else goto _L1
	//   47  112:goto            32
_L1:
		obj;
	//   48  115:aload_1         
		JVM INSTR monitorexit ;
	//   49  116:monitorexit     
		return ((List) (arraylist));
	//   50  117:aload_2         
	//   51  118:areturn         
		Exception exception;
		exception;
	//   52  119:astore_2        
	//*  53  120:aload_1         
		throw exception;
	//   54  121:monitorexit     
	//   55  122:aload_2         
	//   56  123:athrow          
		return null;
	//   57  124:aconst_null     
	//   58  125:areturn         
	}

	public void a(MapConfig mapconfig)
		throws RemoteException
	{
		if(o == null || o.size() == 0 || i <= 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field List o>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #58  <Field List o>
	//*   5   11:invokeinterface #153 <Method int List.size()>
	//*   6   16:ifeq            28
	//*   7   19:aload_0         
	//*   8   20:getfield        #44  <Field float i>
	//*   9   23:fconst_0        
	//*  10   24:fcmpg           
	//*  11   25:ifgt            29
			return;
	//   12   28:return          
		b(h.getMapConfig());
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #70  <Field s h>
	//   16   34:invokeinterface #157 <Method MapConfig s.getMapConfig()>
	//   17   39:invokevirtual   #160 <Method boolean b(MapConfig)>
	//   18   42:pop             
		if(f != null && p > 0)
	//*  19   43:aload_0         
	//*  20   44:getfield        #162 <Field float[] f>
	//*  21   47:ifnull          127
	//*  22   50:aload_0         
	//*  23   51:getfield        #60  <Field int p>
	//*  24   54:ifle            127
		{
			float f1 = h.c().getMapLenWithWin((int)i);
	//   25   57:aload_0         
	//   26   58:getfield        #70  <Field s h>
	//   27   61:invokeinterface #165 <Method GLMapState s.c()>
	//   28   66:aload_0         
	//   29   67:getfield        #44  <Field float i>
	//   30   70:f2i             
	//   31   71:invokevirtual   #171 <Method float GLMapState.getMapLenWithWin(int)>
	//   32   74:fstore_2        
			AMapNativeRenderer.nativeDrawLineByTextureID(f, g, f1, h.d(), b, c, d, a, 0.0F, false, true, true, h.x(), 2, 0);
	//   33   75:aload_0         
	//   34   76:getfield        #162 <Field float[] f>
	//   35   79:aload_0         
	//   36   80:getfield        #68  <Field int g>
	//   37   83:fload_2         
	//   38   84:aload_0         
	//   39   85:getfield        #70  <Field s h>
	//   40   88:invokeinterface #173 <Method int s.d()>
	//   41   93:aload_0         
	//   42   94:getfield        #175 <Field float b>
	//   43   97:aload_0         
	//   44   98:getfield        #177 <Field float c>
	//   45  101:aload_0         
	//   46  102:getfield        #179 <Field float d>
	//   47  105:aload_0         
	//   48  106:getfield        #181 <Field float a>
	//   49  109:fconst_0        
	//   50  110:iconst_0        
	//   51  111:iconst_1        
	//   52  112:iconst_1        
	//   53  113:aload_0         
	//   54  114:getfield        #70  <Field s h>
	//   55  117:invokeinterface #184 <Method float[] s.x()>
	//   56  122:iconst_2        
	//   57  123:iconst_0        
	//   58  124:invokestatic    #190 <Method void AMapNativeRenderer.nativeDrawLineByTextureID(float[], int, float, int, float, float, float, float, float, boolean, boolean, boolean, float[], int, int)>
		}
		q = true;
	//   59  127:aload_0         
	//   60  128:iconst_1        
	//   61  129:putfield        #62  <Field boolean q>
	//   62  132:return          
	}

	void a(List list)
		throws RemoteException
	{
		Object obj = r;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Object r>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		o.clear();
	//    5    7:aload_0         
	//    6    8:getfield        #58  <Field List o>
	//    7   11:invokeinterface #194 <Method void List.clear()>
		if(e == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #66  <Field Rect e>
	//*  10   20:ifnonnull       34
			e = new Rect();
	//   11   23:aload_0         
	//   12   24:new             #196 <Class Rect>
	//   13   27:dup             
	//   14   28:invokespecial   #197 <Method void Rect()>
	//   15   31:putfield        #66  <Field Rect e>
		fd.a(e);
	//   16   34:aload_0         
	//   17   35:getfield        #66  <Field Rect e>
	//   18   38:invokestatic    #202 <Method void fd.a(Rect)>
		if(list == null) goto _L2; else goto _L1
	//   19   41:aload_1         
	//   20   42:ifnull          146
_L1:
		LatLng latlng = null;
	//   21   45:aconst_null     
	//   22   46:astore_2        
		Iterator iterator = list.iterator();
	//   23   47:aload_1         
	//   24   48:invokeinterface #99  <Method Iterator List.iterator()>
	//   25   53:astore          4
		list = ((List) (latlng));
	//   26   55:aload_2         
	//   27   56:astore_1        
_L3:
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   28   57:aload           4
	//   29   59:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   30   64:ifeq            146
		latlng = (LatLng)iterator.next();
	//   31   67:aload           4
	//   32   69:invokeinterface #109 <Method Object Iterator.next()>
	//   33   74:checkcast       #130 <Class LatLng>
	//   34   77:astore_2        
		if(latlng == null)
			continue; /* Loop/switch isn't completed */
	//   35   78:aload_2         
	//   36   79:ifnull          57
		if(latlng.equals(((Object) (list))))
	//*  37   82:aload_2         
	//*  38   83:aload_1         
	//*  39   84:invokevirtual   #205 <Method boolean LatLng.equals(Object)>
	//*  40   87:ifeq            93
			continue; /* Loop/switch isn't completed */
	//   41   90:goto            57
		list = ((List) (IPoint.obtain()));
	//   42   93:invokestatic    #208 <Method IPoint IPoint.obtain()>
	//   43   96:astore_1        
		h.a(latlng.latitude, latlng.longitude, ((IPoint) (list)));
	//   44   97:aload_0         
	//   45   98:getfield        #70  <Field s h>
	//   46  101:aload_2         
	//   47  102:getfield        #211 <Field double LatLng.latitude>
	//   48  105:aload_2         
	//   49  106:getfield        #214 <Field double LatLng.longitude>
	//   50  109:aload_1         
	//   51  110:invokeinterface #217 <Method void s.a(double, double, IPoint)>
		o.add(((Object) (list)));
	//   52  115:aload_0         
	//   53  116:getfield        #58  <Field List o>
	//   54  119:aload_1         
	//   55  120:invokeinterface #142 <Method boolean List.add(Object)>
	//   56  125:pop             
		fd.b(e, ((IPoint) (list)).x, ((IPoint) (list)).y);
	//   57  126:aload_0         
	//   58  127:getfield        #66  <Field Rect e>
	//   59  130:aload_1         
	//   60  131:getfield        #120 <Field int IPoint.x>
	//   61  134:aload_1         
	//   62  135:getfield        #123 <Field int IPoint.y>
	//   63  138:invokestatic    #220 <Method void fd.b(Rect, int, int)>
		list = ((List) (latlng));
	//   64  141:aload_2         
	//   65  142:astore_1        
		if(true) goto _L3; else goto _L2
	//   66  143:goto            57
_L2:
		p = 0;
	//   67  146:aload_0         
	//   68  147:iconst_0        
	//   69  148:putfield        #60  <Field int p>
		e.sort();
	//   70  151:aload_0         
	//   71  152:getfield        #66  <Field Rect e>
	//   72  155:invokevirtual   #223 <Method void Rect.sort()>
		obj;
	//   73  158:aload_3         
		JVM INSTR monitorexit ;
	//   74  159:monitorexit     
		  goto _L4
	//*  75  160:goto            168
		list;
	//   76  163:astore_1        
	//*  77  164:aload_3         
		throw list;
	//   78  165:monitorexit     
	//   79  166:aload_1         
	//   80  167:athrow          
_L4:
		h.setRunLowFrame(false);
	//   81  168:aload_0         
	//   82  169:getfield        #70  <Field s h>
	//   83  172:iconst_0        
	//   84  173:invokeinterface #227 <Method void s.setRunLowFrame(boolean)>
		return;
	//   85  178:return          
	}

	public boolean a()
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Rect e>
	//*   2    4:ifnull          39
		{
			Rectangle rectangle = h.getMapConfig().getGeoRectangle();
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field s h>
	//    5   11:invokeinterface #157 <Method MapConfig s.getMapConfig()>
	//    6   16:invokevirtual   #234 <Method Rectangle MapConfig.getGeoRectangle()>
	//    7   19:astore_1        
			return rectangle != null && rectangle.isOverlap(e);
	//    8   20:aload_1         
	//    9   21:ifnull          37
	//   10   24:aload_1         
	//   11   25:aload_0         
	//   12   26:getfield        #66  <Field Rect e>
	//   13   29:invokevirtual   #240 <Method boolean Rectangle.isOverlap(Rect)>
	//   14   32:ifeq            37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
		} else
		{
			return false;
	//   19   39:iconst_0        
	//   20   40:ireturn         
		}
	}

	public boolean b(MapConfig mapconfig)
		throws RemoteException
	{
		Object obj = r;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Object r>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int k1;
		int l1;
		k1 = mapconfig.getSX();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #243 <Method int MapConfig.getSX()>
	//    7   13:istore_3        
		l1 = mapconfig.getSY();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #246 <Method int MapConfig.getSY()>
	//   10   18:istore          4
		q = false;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #62  <Field boolean q>
		int i1 = o.size();
	//   14   25:aload_0         
	//   15   26:getfield        #58  <Field List o>
	//   16   29:invokeinterface #153 <Method int List.size()>
	//   17   34:istore_2        
		if(f == null || f.length < i1 * 3)
	//*  18   35:aload_0         
	//*  19   36:getfield        #162 <Field float[] f>
	//*  20   39:ifnull          53
	//*  21   42:aload_0         
	//*  22   43:getfield        #162 <Field float[] f>
	//*  23   46:arraylength     
	//*  24   47:iload_2         
	//*  25   48:iconst_3        
	//*  26   49:imul            
	//*  27   50:icmpge          62
			f = new float[i1 * 3];
	//   28   53:aload_0         
	//   29   54:iload_2         
	//   30   55:iconst_3        
	//   31   56:imul            
	//   32   57:newarray        float[]
	//   33   59:putfield        #162 <Field float[] f>
		g = i1 * 3;
	//   34   62:aload_0         
	//   35   63:iload_2         
	//   36   64:iconst_3        
	//   37   65:imul            
	//   38   66:putfield        #68  <Field int g>
		int j1 = 0;
	//   39   69:iconst_0        
	//   40   70:istore_2        
		mapconfig = ((MapConfig) (o.iterator()));
	//   41   71:aload_0         
	//   42   72:getfield        #58  <Field List o>
	//   43   75:invokeinterface #99  <Method Iterator List.iterator()>
	//   44   80:astore_1        
_L1:
		if(!((Iterator) (mapconfig)).hasNext())
			break MISSING_BLOCK_LABEL_154;
	//   45   81:aload_1         
	//   46   82:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   47   87:ifeq            154
		IPoint ipoint = (IPoint)((Iterator) (mapconfig)).next();
	//   48   90:aload_1         
	//   49   91:invokeinterface #109 <Method Object Iterator.next()>
	//   50   96:checkcast       #111 <Class IPoint>
	//   51   99:astore          6
		f[j1 * 3] = ipoint.x - k1;
	//   52  101:aload_0         
	//   53  102:getfield        #162 <Field float[] f>
	//   54  105:iload_2         
	//   55  106:iconst_3        
	//   56  107:imul            
	//   57  108:aload           6
	//   58  110:getfield        #120 <Field int IPoint.x>
	//   59  113:iload_3         
	//   60  114:isub            
	//   61  115:i2f             
	//   62  116:fastore         
		f[j1 * 3 + 1] = ipoint.y - l1;
	//   63  117:aload_0         
	//   64  118:getfield        #162 <Field float[] f>
	//   65  121:iload_2         
	//   66  122:iconst_3        
	//   67  123:imul            
	//   68  124:iconst_1        
	//   69  125:iadd            
	//   70  126:aload           6
	//   71  128:getfield        #123 <Field int IPoint.y>
	//   72  131:iload           4
	//   73  133:isub            
	//   74  134:i2f             
	//   75  135:fastore         
		f[j1 * 3 + 2] = 0.0F;
	//   76  136:aload_0         
	//   77  137:getfield        #162 <Field float[] f>
	//   78  140:iload_2         
	//   79  141:iconst_3        
	//   80  142:imul            
	//   81  143:iconst_2        
	//   82  144:iadd            
	//   83  145:fconst_0        
	//   84  146:fastore         
		j1++;
	//   85  147:iload_2         
	//   86  148:iconst_1        
	//   87  149:iadd            
	//   88  150:istore_2        
		  goto _L1
	//*  89  151:goto            81
		p = o.size();
	//   90  154:aload_0         
	//   91  155:aload_0         
	//   92  156:getfield        #58  <Field List o>
	//   93  159:invokeinterface #153 <Method int List.size()>
	//   94  164:putfield        #60  <Field int p>
		obj;
	//   95  167:aload           5
		JVM INSTR monitorexit ;
	//   96  169:monitorexit     
		  goto _L2
	//*  97  170:goto            179
		mapconfig;
	//   98  173:astore_1        
	//*  99  174:aload           5
		throw mapconfig;
	//  100  176:monitorexit     
	//  101  177:aload_1         
	//  102  178:athrow          
_L2:
		return true;
	//  103  179:iconst_1        
	//  104  180:ireturn         
	}

	public boolean c()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean q>
	//    2    4:ireturn         
	}

	public void destroy()
	{
		try
		{
			if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field float[] f>
	//*   2    4:ifnull          12
				f = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #162 <Field float[] f>
			return;
	//    6   12:return          
		}
		catch(Throwable throwable)
	//*   7   13:astore_1        
		{
			hm.c(throwable, "NavigateArrowDelegateImp", "destroy");
	//    8   14:aload_1         
	//    9   15:ldc1            #78  <String "NavigateArrowDelegateImp">
	//   10   17:ldc1            #250 <String "destroy">
	//   11   19:invokestatic    #85  <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #251 <Method void Throwable.printStackTrace()>
			Log.d("destroy erro", "NavigateArrowDelegateImp destroy");
	//   14   26:ldc1            #253 <String "destroy erro">
	//   15   28:ldc1            #255 <String "NavigateArrowDelegateImp destroy">
	//   16   30:invokestatic    #260 <Method int Log.d(String, String)>
	//   17   33:pop             
			return;
	//   18   34:return          
		}
	}

	public boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlay))) || ioverlay.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #263 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #266 <Method String IOverlay.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #74  <Method String getId()>
	//    8   18:invokevirtual   #269 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public String getId()
		throws RemoteException
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field String n>
	//*   2    4:ifnonnull       23
			n = h.d("NavigateArrow");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field s h>
	//    6   12:ldc2            #271 <String "NavigateArrow">
	//    7   15:invokeinterface #274 <Method String s.d(String)>
	//    8   20:putfield        #76  <Field String n>
		return n;
	//    9   23:aload_0         
	//   10   24:getfield        #76  <Field String n>
	//   11   27:areturn         
	}

	public List getPoints()
		throws RemoteException
	{
		return b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method List b()>
	//    2    4:areturn         
	}

	public int getSideColor()
		throws RemoteException
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int k>
	//    2    4:ireturn         
	}

	public int getTopColor()
		throws RemoteException
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int j>
	//    2    4:ireturn         
	}

	public float getWidth()
		throws RemoteException
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field float i>
	//    2    4:freturn         
	}

	public float getZIndex()
		throws RemoteException
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field float l>
	//    2    4:freturn         
	}

	public int hashCodeRemote()
		throws RemoteException
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #286 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public boolean isAboveMaskLayer()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisible()
		throws RemoteException
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean m>
	//    2    4:ireturn         
	}

	public void remove()
		throws RemoteException
	{
		h.a(getId());
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field s h>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #74  <Method String getId()>
	//    4    8:invokeinterface #292 <Method boolean s.a(String)>
	//    5   13:pop             
		h.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #70  <Field s h>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #227 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	public void setAboveMaskLayer(boolean flag)
	{
	//    0    0:return          
	}

	public void setPoints(List list)
		throws RemoteException
	{
		a(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #296 <Method void a(List)>
	//    3    5:return          
	}

	public void setSideColor(int i1)
		throws RemoteException
	{
		k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int k>
		h.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field s h>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #227 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setTopColor(int i1)
		throws RemoteException
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int j>
		a = (float)Color.alpha(i1) / 255F;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokestatic    #305 <Method int Color.alpha(int)>
	//    6   10:i2f             
	//    7   11:ldc2            #306 <Float 255F>
	//    8   14:fdiv            
	//    9   15:putfield        #181 <Field float a>
		b = (float)Color.red(i1) / 255F;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokestatic    #309 <Method int Color.red(int)>
	//   13   23:i2f             
	//   14   24:ldc2            #306 <Float 255F>
	//   15   27:fdiv            
	//   16   28:putfield        #175 <Field float b>
		c = (float)Color.green(i1) / 255F;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:invokestatic    #312 <Method int Color.green(int)>
	//   20   36:i2f             
	//   21   37:ldc2            #306 <Float 255F>
	//   22   40:fdiv            
	//   23   41:putfield        #177 <Field float c>
		d = (float)Color.blue(i1) / 255F;
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:invokestatic    #315 <Method int Color.blue(int)>
	//   27   49:i2f             
	//   28   50:ldc2            #306 <Float 255F>
	//   29   53:fdiv            
	//   30   54:putfield        #179 <Field float d>
		h.setRunLowFrame(false);
	//   31   57:aload_0         
	//   32   58:getfield        #70  <Field s h>
	//   33   61:iconst_0        
	//   34   62:invokeinterface #227 <Method void s.setRunLowFrame(boolean)>
	//   35   67:return          
	}

	public void setVisible(boolean flag)
		throws RemoteException
	{
		m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field boolean m>
		h.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field s h>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #227 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setWidth(float f1)
		throws RemoteException
	{
		i = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #44  <Field float i>
		h.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field s h>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #227 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setZIndex(float f1)
		throws RemoteException
	{
		l = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #51  <Field float l>
		h.f();
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field s h>
	//    5    9:invokeinterface #321 <Method void s.f()>
		h.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #70  <Field s h>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #227 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	float a;
	float b;
	float c;
	float d;
	Rect e;
	float f[];
	int g;
	private s h;
	private float i;
	private int j;
	private int k;
	private float l;
	private boolean m;
	private String n;
	private List o;
	private int p;
	private boolean q;
	private Object r;
}
