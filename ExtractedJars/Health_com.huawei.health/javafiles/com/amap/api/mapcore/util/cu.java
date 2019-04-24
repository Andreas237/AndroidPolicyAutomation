// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.opengl.GLES20;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.*;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.nio.FloatBuffer;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			cz, hm, s, fd, 
//			ej, ez, em

public class cu
	implements cz
{

	public cu(s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #72  <Field LatLng b>
		c = 0.0D;
	//    5    9:aload_0         
	//    6   10:dconst_0        
	//    7   11:putfield        #74  <Field double c>
		d = 10F;
	//    8   14:aload_0         
	//    9   15:ldc1            #75  <Float 10F>
	//   10   17:putfield        #77  <Field float d>
		e = 0xff000000;
	//   11   20:aload_0         
	//   12   21:ldc1            #78  <Int 0xff000000>
	//   13   23:putfield        #80  <Field int e>
		f = 0;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #82  <Field int f>
		g = 0.0F;
	//   17   31:aload_0         
	//   18   32:fconst_0        
	//   19   33:putfield        #84  <Field float g>
		h = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #86  <Field boolean h>
		l = 0;
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:putfield        #88  <Field int l>
		m = false;
	//   26   46:aload_0         
	//   27   47:iconst_0        
	//   28   48:putfield        #90  <Field boolean m>
		n = IPoint.obtain();
	//   29   51:aload_0         
	//   30   52:invokestatic    #96  <Method IPoint IPoint.obtain()>
	//   31   55:putfield        #98  <Field IPoint n>
		o = FPoint.obtain();
	//   32   58:aload_0         
	//   33   59:invokestatic    #103 <Method FPoint FPoint.obtain()>
	//   34   62:putfield        #105 <Field FPoint o>
		w = -1;
	//   35   65:aload_0         
	//   36   66:iconst_m1       
	//   37   67:putfield        #107 <Field int w>
		a = 0.0F;
	//   38   70:aload_0         
	//   39   71:fconst_0        
	//   40   72:putfield        #109 <Field float a>
		j = s1;
	//   41   75:aload_0         
	//   42   76:aload_1         
	//   43   77:putfield        #111 <Field s j>
		try
		{
			i = getId();
	//   44   80:aload_0         
	//   45   81:aload_0         
	//   46   82:invokevirtual   #115 <Method String getId()>
	//   47   85:putfield        #117 <Field String i>
			return;
	//   48   88:return          
		}
		// Misplaced declaration of an exception variable
		catch(s s1)
	//*  49   89:astore_1        
		{
			hm.c(((Throwable) (s1)), "CircleDelegateImp", "create");
	//   50   90:aload_1         
	//   51   91:ldc1            #119 <String "CircleDelegateImp">
	//   52   93:ldc1            #121 <String "create">
	//   53   95:invokestatic    #126 <Method void hm.c(Throwable, String, String)>
		}
		((RemoteException) (s1)).printStackTrace();
	//   54   98:aload_1         
	//   55   99:invokevirtual   #129 <Method void RemoteException.printStackTrace()>
	//   56  102:return          
	}

	private float a(double d1)
	{
		return (float)((Math.cos((3.1415926535897931D * d1) / 180D) * (double)y) / (double)(z << A));
	//    0    0:ldc2w           #131 <Double 3.1415926535897931D>
	//    1    3:dload_1         
	//    2    4:dmul            
	//    3    5:ldc2w           #133 <Double 180D>
	//    4    8:ddiv            
	//    5    9:invokestatic    #140 <Method double Math.cos(double)>
	//    6   12:getstatic       #58  <Field float y>
	//    7   15:f2d             
	//    8   16:dmul            
	//    9   17:getstatic       #60  <Field int z>
	//   10   20:getstatic       #62  <Field int A>
	//   11   23:ishl            
	//   12   24:i2d             
	//   13   25:ddiv            
	//   14   26:d2f             
	//   15   27:freturn         
	}

	private List a(List list)
		throws RemoteException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #143 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #144 <Method void ArrayList()>
	//    3    7:astore          4
		if(list != null)
	//*   4    9:aload_1         
	//*   5   10:ifnull          165
		{
			Object obj = null;
	//    6   13:aconst_null     
	//    7   14:astore_3        
			Iterator iterator = list.iterator();
	//    8   15:aload_1         
	//    9   16:invokeinterface #150 <Method Iterator List.iterator()>
	//   10   21:astore          5
			list = ((List) (obj));
	//   11   23:aload_3         
	//   12   24:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
	//   13   25:aload           5
	//   14   27:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//   15   32:ifeq            93
				LatLng latlng = (LatLng)iterator.next();
	//   16   35:aload           5
	//   17   37:invokeinterface #160 <Method Object Iterator.next()>
	//   18   42:checkcast       #162 <Class LatLng>
	//   19   45:astore_3        
				if(!latlng.equals(((Object) (list))))
	//*  20   46:aload_3         
	//*  21   47:aload_1         
	//*  22   48:invokevirtual   #166 <Method boolean LatLng.equals(Object)>
	//*  23   51:ifeq            57
	//*  24   54:goto            25
				{
					list = ((List) (IPoint.obtain()));
	//   25   57:invokestatic    #96  <Method IPoint IPoint.obtain()>
	//   26   60:astore_1        
					j.a(latlng.latitude, latlng.longitude, ((IPoint) (list)));
	//   27   61:aload_0         
	//   28   62:getfield        #111 <Field s j>
	//   29   65:aload_3         
	//   30   66:getfield        #169 <Field double LatLng.latitude>
	//   31   69:aload_3         
	//   32   70:getfield        #172 <Field double LatLng.longitude>
	//   33   73:aload_1         
	//   34   74:invokeinterface #177 <Method void s.a(double, double, IPoint)>
					((List) (arraylist)).add(((Object) (list)));
	//   35   79:aload           4
	//   36   81:aload_1         
	//   37   82:invokeinterface #180 <Method boolean List.add(Object)>
	//   38   87:pop             
					list = ((List) (latlng));
	//   39   88:aload_3         
	//   40   89:astore_1        
				}
			} while(true);
	//   41   90:goto            25
			int i1 = ((List) (arraylist)).size();
	//   42   93:aload           4
	//   43   95:invokeinterface #184 <Method int List.size()>
	//   44  100:istore_2        
			if(i1 > 1)
	//*  45  101:iload_2         
	//*  46  102:iconst_1        
	//*  47  103:icmple          165
			{
				list = ((List) ((IPoint)((List) (arraylist)).get(0)));
	//   48  106:aload           4
	//   49  108:iconst_0        
	//   50  109:invokeinterface #188 <Method Object List.get(int)>
	//   51  114:checkcast       #92  <Class IPoint>
	//   52  117:astore_1        
				IPoint ipoint = (IPoint)((List) (arraylist)).get(i1 - 1);
	//   53  118:aload           4
	//   54  120:iload_2         
	//   55  121:iconst_1        
	//   56  122:isub            
	//   57  123:invokeinterface #188 <Method Object List.get(int)>
	//   58  128:checkcast       #92  <Class IPoint>
	//   59  131:astore_3        
				if(((IPoint) (list)).x == ipoint.x && ((IPoint) (list)).y == ipoint.y)
	//*  60  132:aload_1         
	//*  61  133:getfield        #190 <Field int IPoint.x>
	//*  62  136:aload_3         
	//*  63  137:getfield        #190 <Field int IPoint.x>
	//*  64  140:icmpne          165
	//*  65  143:aload_1         
	//*  66  144:getfield        #192 <Field int IPoint.y>
	//*  67  147:aload_3         
	//*  68  148:getfield        #192 <Field int IPoint.y>
	//*  69  151:icmpne          165
					((List) (arraylist)).remove(i1 - 1);
	//   70  154:aload           4
	//   71  156:iload_2         
	//   72  157:iconst_1        
	//   73  158:isub            
	//   74  159:invokeinterface #195 <Method Object List.remove(int)>
	//   75  164:pop             
			}
		}
		if(fd.a(((List) (arraylist)), 0, ((List) (arraylist)).size()))
	//*  76  165:aload           4
	//*  77  167:iconst_0        
	//*  78  168:aload           4
	//*  79  170:invokeinterface #184 <Method int List.size()>
	//*  80  175:invokestatic    #200 <Method boolean fd.a(List, int, int)>
	//*  81  178:ifeq            186
			Collections.reverse(((List) (arraylist)));
	//   82  181:aload           4
	//   83  183:invokestatic    #206 <Method void Collections.reverse(List)>
		return ((List) (arraylist));
	//   84  186:aload           4
	//   85  188:areturn         
	}

	private void a(List list, int i1, int j1)
		throws RemoteException
	{
		if(list.size() < 2)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #184 <Method int List.size()>
	//*   2    6:iconst_2        
	//*   3    7:icmpge          11
			return;
	//    4   10:return          
		float af[] = new float[list.size() * 3];
	//    5   11:aload_1         
	//    6   12:invokeinterface #184 <Method int List.size()>
	//    7   17:iconst_3        
	//    8   18:imul            
	//    9   19:newarray        float[]
	//   10   21:astore          8
		IPoint aipoint[] = new IPoint[list.size()];
	//   11   23:aload_1         
	//   12   24:invokeinterface #184 <Method int List.size()>
	//   13   29:anewarray       IPoint[]
	//   14   32:astore          9
		int k1 = 0;
	//   15   34:iconst_0        
	//   16   35:istore          4
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*  17   37:aload_1         
	//*  18   38:invokeinterface #150 <Method Iterator List.iterator()>
	//*  19   43:astore_1        
	//*  20   44:aload_1         
	//*  21   45:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*  22   50:ifeq            122
		{
			IPoint ipoint = (IPoint)((Iterator) (list)).next();
	//   23   53:aload_1         
	//   24   54:invokeinterface #160 <Method Object Iterator.next()>
	//   25   59:checkcast       #92  <Class IPoint>
	//   26   62:astore          7
			af[k1 * 3] = ipoint.x - i1;
	//   27   64:aload           8
	//   28   66:iload           4
	//   29   68:iconst_3        
	//   30   69:imul            
	//   31   70:aload           7
	//   32   72:getfield        #190 <Field int IPoint.x>
	//   33   75:iload_2         
	//   34   76:isub            
	//   35   77:i2f             
	//   36   78:fastore         
			af[k1 * 3 + 1] = ipoint.y - j1;
	//   37   79:aload           8
	//   38   81:iload           4
	//   39   83:iconst_3        
	//   40   84:imul            
	//   41   85:iconst_1        
	//   42   86:iadd            
	//   43   87:aload           7
	//   44   89:getfield        #192 <Field int IPoint.y>
	//   45   92:iload_3         
	//   46   93:isub            
	//   47   94:i2f             
	//   48   95:fastore         
			af[k1 * 3 + 2] = 0.0F;
	//   49   96:aload           8
	//   50   98:iload           4
	//   51  100:iconst_3        
	//   52  101:imul            
	//   53  102:iconst_2        
	//   54  103:iadd            
	//   55  104:fconst_0        
	//   56  105:fastore         
			aipoint[k1] = ipoint;
	//   57  106:aload           9
	//   58  108:iload           4
	//   59  110:aload           7
	//   60  112:aastore         
			k1++;
	//   61  113:iload           4
	//   62  115:iconst_1        
	//   63  116:iadd            
	//   64  117:istore          4
		}

	//*  65  119:goto            44
		Object aobj[] = ((Object []) (a(aipoint)));
	//   66  122:aload           9
	//   67  124:invokestatic    #213 <Method IPoint[] a(IPoint[])>
	//   68  127:astore          7
		list = ((List) (aobj));
	//   69  129:aload           7
	//   70  131:astore_1        
		if(aobj.length == 0)
	//*  71  132:aload           7
	//*  72  134:arraylength     
	//*  73  135:ifne            169
		{
			if(B == 10000000000D)
	//*  74  138:getstatic       #66  <Field double B>
	//*  75  141:ldc2w           #63  <Double 10000000000D>
	//*  76  144:dcmpl           
	//*  77  145:ifne            157
				B = 100000000D;
	//   78  148:ldc2w           #214 <Double 100000000D>
	//   79  151:putstatic       #66  <Field double B>
			else
	//*  80  154:goto            163
				B = 10000000000D;
	//   81  157:ldc2w           #63  <Double 10000000000D>
	//   82  160:putstatic       #66  <Field double B>
			list = ((List) (a(aipoint)));
	//   83  163:aload           9
	//   84  165:invokestatic    #213 <Method IPoint[] a(IPoint[])>
	//   85  168:astore_1        
		}
		aobj = ((Object []) (new float[list.length * 3]));
	//   86  169:aload_1         
	//   87  170:arraylength     
	//   88  171:iconst_3        
	//   89  172:imul            
	//   90  173:newarray        float[]
	//   91  175:astore          7
		int i2 = 0;
	//   92  177:iconst_0        
	//   93  178:istore          5
		int j2 = list.length;
	//   94  180:aload_1         
	//   95  181:arraylength     
	//   96  182:istore          6
		for(int l1 = 0; l1 < j2; l1++)
	//*  97  184:iconst_0        
	//*  98  185:istore          4
	//*  99  187:iload           4
	//* 100  189:iload           6
	//* 101  191:icmpge          257
		{
			Object obj = list[l1];
	//  102  194:aload_1         
	//  103  195:iload           4
	//  104  197:aaload          
	//  105  198:astore          10
			aobj[i2 * 3] = ((IPoint) (obj)).x - i1;
	//  106  200:aload           7
	//  107  202:iload           5
	//  108  204:iconst_3        
	//  109  205:imul            
	//  110  206:aload           10
	//  111  208:getfield        #190 <Field int IPoint.x>
	//  112  211:iload_2         
	//  113  212:isub            
	//  114  213:i2f             
	//  115  214:fastore         
			aobj[i2 * 3 + 1] = ((IPoint) (obj)).y - j1;
	//  116  215:aload           7
	//  117  217:iload           5
	//  118  219:iconst_3        
	//  119  220:imul            
	//  120  221:iconst_1        
	//  121  222:iadd            
	//  122  223:aload           10
	//  123  225:getfield        #192 <Field int IPoint.y>
	//  124  228:iload_3         
	//  125  229:isub            
	//  126  230:i2f             
	//  127  231:fastore         
			aobj[i2 * 3 + 2] = 0.0F;
	//  128  232:aload           7
	//  129  234:iload           5
	//  130  236:iconst_3        
	//  131  237:imul            
	//  132  238:iconst_2        
	//  133  239:iadd            
	//  134  240:fconst_0        
	//  135  241:fastore         
			i2++;
	//  136  242:iload           5
	//  137  244:iconst_1        
	//  138  245:iadd            
	//  139  246:istore          5
		}

	//  140  248:iload           4
	//  141  250:iconst_1        
	//  142  251:iadd            
	//  143  252:istore          4
	//* 144  254:goto            187
		r = aipoint.length;
	//  145  257:aload_0         
	//  146  258:aload           9
	//  147  260:arraylength     
	//  148  261:putfield        #217 <Field int r>
		s = list.length;
	//  149  264:aload_0         
	//  150  265:aload_1         
	//  151  266:arraylength     
	//  152  267:putfield        #219 <Field int s>
		t = fd.a(af);
	//  153  270:aload_0         
	//  154  271:aload           8
	//  155  273:invokestatic    #222 <Method FloatBuffer fd.a(float[])>
	//  156  276:putfield        #224 <Field FloatBuffer t>
		u = fd.a(((float []) (aobj)));
	//  157  279:aload_0         
	//  158  280:aload           7
	//  159  282:invokestatic    #222 <Method FloatBuffer fd.a(float[])>
	//  160  285:putfield        #226 <Field FloatBuffer u>
	//  161  288:return          
	}

	private boolean a(PolygonHoleOptions polygonholeoptions)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		boolean flag = true;
	//    2    3:iconst_1        
	//    3    4:istore_3        
		int i1;
		boolean flag2;
		try
		{
			polygonholeoptions = ((PolygonHoleOptions) (polygonholeoptions.getPoints()));
	//    4    5:aload_1         
	//    5    6:invokevirtual   #236 <Method List PolygonHoleOptions.getPoints()>
	//    6    9:astore_1        
		}
	//*   7   10:iconst_0        
	//*   8   11:istore_2        
	//*   9   12:iload_3         
	//*  10   13:istore          5
	//*  11   15:iload_3         
	//*  12   16:istore          4
	//*  13   18:iload_2         
	//*  14   19:aload_1         
	//*  15   20:invokeinterface #184 <Method int List.size()>
	//*  16   25:icmpge          63
	//*  17   28:iload_3         
	//*  18   29:istore          4
	//*  19   31:aload_0         
	//*  20   32:aload_1         
	//*  21   33:iload_2         
	//*  22   34:invokeinterface #188 <Method Object List.get(int)>
	//*  23   39:checkcast       #162 <Class LatLng>
	//*  24   42:invokevirtual   #240 <Method boolean contains(LatLng)>
	//*  25   45:istore_3        
	//*  26   46:iload_3         
	//*  27   47:ifne            56
	//*  28   50:iload_3         
	//*  29   51:istore          5
	//*  30   53:goto            63
	//*  31   56:iload_2         
	//*  32   57:iconst_1        
	//*  33   58:iadd            
	//*  34   59:istore_2        
	//*  35   60:goto            12
	//*  36   63:iload           5
	//*  37   65:ireturn         
		// Misplaced declaration of an exception variable
		catch(PolygonHoleOptions polygonholeoptions)
	//*  38   66:astore_1        
		{
			hm.c(((Throwable) (polygonholeoptions)), "CircleDelegateImp", "isPolygonInCircle");
	//   39   67:aload_1         
	//   40   68:ldc1            #119 <String "CircleDelegateImp">
	//   41   70:ldc1            #242 <String "isPolygonInCircle">
	//   42   72:invokestatic    #126 <Method void hm.c(Throwable, String, String)>
			((Throwable) (polygonholeoptions)).printStackTrace();
	//   43   75:aload_1         
	//   44   76:invokevirtual   #243 <Method void Throwable.printStackTrace()>
			return flag1;
	//   45   79:iload           4
	//   46   81:ireturn         
		}
		i1 = 0;
		flag2 = flag;
		flag1 = flag;
		if(i1 >= ((List) (polygonholeoptions)).size())
			break; /* Loop/switch isn't completed */
		flag1 = flag;
		flag = contains((LatLng)((List) (polygonholeoptions)).get(i1));
		if(!flag)
		{
			flag2 = flag;
			break; /* Loop/switch isn't completed */
		}
		i1++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_12;
_L1:
		return flag2;
	}

	static IPoint[] a(IPoint aipoint[])
	{
		int k1 = aipoint.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		double ad[] = new double[k1 * 2];
	//    3    3:iload_2         
	//    4    4:iconst_2        
	//    5    5:imul            
	//    6    6:newarray        double[]
	//    7    8:astore_3        
		for(int i1 = 0; i1 < k1; i1++)
	//*   8    9:iconst_0        
	//*   9   10:istore_1        
	//*  10   11:iload_1         
	//*  11   12:iload_2         
	//*  12   13:icmpge          57
		{
			ad[i1 * 2] = (double)aipoint[i1].x * B;
	//   13   16:aload_3         
	//   14   17:iload_1         
	//   15   18:iconst_2        
	//   16   19:imul            
	//   17   20:aload_0         
	//   18   21:iload_1         
	//   19   22:aaload          
	//   20   23:getfield        #190 <Field int IPoint.x>
	//   21   26:i2d             
	//   22   27:getstatic       #66  <Field double B>
	//   23   30:dmul            
	//   24   31:dastore         
			ad[i1 * 2 + 1] = (double)aipoint[i1].y * B;
	//   25   32:aload_3         
	//   26   33:iload_1         
	//   27   34:iconst_2        
	//   28   35:imul            
	//   29   36:iconst_1        
	//   30   37:iadd            
	//   31   38:aload_0         
	//   32   39:iload_1         
	//   33   40:aaload          
	//   34   41:getfield        #192 <Field int IPoint.y>
	//   35   44:i2d             
	//   36   45:getstatic       #66  <Field double B>
	//   37   48:dmul            
	//   38   49:dastore         
		}

	//   39   50:iload_1         
	//   40   51:iconst_1        
	//   41   52:iadd            
	//   42   53:istore_1        
	//*  43   54:goto            11
		aipoint = ((IPoint []) ((new ej()).a(ad)));
	//   44   57:new             #245 <Class ej>
	//   45   60:dup             
	//   46   61:invokespecial   #246 <Method void ej()>
	//   47   64:aload_3         
	//   48   65:invokevirtual   #249 <Method ez ej.a(double[])>
	//   49   68:astore_0        
		k1 = ((ez) (aipoint)).b;
	//   50   69:aload_0         
	//   51   70:getfield        #253 <Field int ez.b>
	//   52   73:istore_2        
		IPoint aipoint1[] = new IPoint[k1];
	//   53   74:iload_2         
	//   54   75:anewarray       IPoint[]
	//   55   78:astore          4
		for(int j1 = 0; j1 < k1; j1++)
	//*  56   80:iconst_0        
	//*  57   81:istore_1        
	//*  58   82:iload_1         
	//*  59   83:iload_2         
	//*  60   84:icmpge          149
		{
			aipoint1[j1] = new IPoint();
	//   61   87:aload           4
	//   62   89:iload_1         
	//   63   90:new             #92  <Class IPoint>
	//   64   93:dup             
	//   65   94:invokespecial   #254 <Method void IPoint()>
	//   66   97:aastore         
			aipoint1[j1].x = (int)(ad[((ez) (aipoint)).a(j1) * 2] / B);
	//   67   98:aload           4
	//   68  100:iload_1         
	//   69  101:aaload          
	//   70  102:aload_3         
	//   71  103:aload_0         
	//   72  104:iload_1         
	//   73  105:invokevirtual   #257 <Method short ez.a(int)>
	//   74  108:iconst_2        
	//   75  109:imul            
	//   76  110:daload          
	//   77  111:getstatic       #66  <Field double B>
	//   78  114:ddiv            
	//   79  115:d2i             
	//   80  116:putfield        #190 <Field int IPoint.x>
			aipoint1[j1].y = (int)(ad[((ez) (aipoint)).a(j1) * 2 + 1] / B);
	//   81  119:aload           4
	//   82  121:iload_1         
	//   83  122:aaload          
	//   84  123:aload_3         
	//   85  124:aload_0         
	//   86  125:iload_1         
	//   87  126:invokevirtual   #257 <Method short ez.a(int)>
	//   88  129:iconst_2        
	//   89  130:imul            
	//   90  131:iconst_1        
	//   91  132:iadd            
	//   92  133:daload          
	//   93  134:getstatic       #66  <Field double B>
	//   94  137:ddiv            
	//   95  138:d2i             
	//   96  139:putfield        #192 <Field int IPoint.y>
		}

	//   97  142:iload_1         
	//   98  143:iconst_1        
	//   99  144:iadd            
	//  100  145:istore_1        
	//* 101  146:goto            82
		return aipoint1;
	//  102  149:aload           4
	//  103  151:areturn         
	}

	private double b(double d1)
	{
		return 1.0D / (double)a(d1);
	//    0    0:dconst_1        
	//    1    1:aload_0         
	//    2    2:dload_1         
	//    3    3:invokespecial   #259 <Method float a(double)>
	//    4    6:f2d             
	//    5    7:ddiv            
	//    6    8:dreturn         
	}

	private boolean b(CircleHoleOptions circleholeoptions)
	{
		double d1;
		double d2;
		double d3;
		boolean flag;
		try
		{
			d1 = AMapUtils.calculateLineDistance(circleholeoptions.getCenter(), getCenter());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #266 <Method LatLng CircleHoleOptions.getCenter()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #267 <Method LatLng getCenter()>
	//    4    8:invokestatic    #273 <Method float AMapUtils.calculateLineDistance(LatLng, LatLng)>
	//    5   11:f2d             
	//    6   12:dstore_2        
			d2 = getRadius();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #277 <Method double getRadius()>
	//    9   17:dstore          4
			d3 = circleholeoptions.getRadius();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #278 <Method double CircleHoleOptions.getRadius()>
	//   12   23:dstore          6
		}
	//*  13   25:dload_2         
	//*  14   26:dload           4
	//*  15   28:dload           6
	//*  16   30:dsub            
	//*  17   31:dcmpg           
	//*  18   32:ifgt            41
	//*  19   35:iconst_1        
	//*  20   36:istore          8
	//*  21   38:goto            44
	//*  22   41:iconst_0        
	//*  23   42:istore          8
	//*  24   44:iload           8
	//*  25   46:ireturn         
		// Misplaced declaration of an exception variable
		catch(CircleHoleOptions circleholeoptions)
	//*  26   47:astore_1        
		{
			hm.c(((Throwable) (circleholeoptions)), "CircleDelegateImp", "isCircleInCircle");
	//   27   48:aload_1         
	//   28   49:ldc1            #119 <String "CircleDelegateImp">
	//   29   51:ldc2            #280 <String "isCircleInCircle">
	//   30   54:invokestatic    #126 <Method void hm.c(Throwable, String, String)>
			((Throwable) (circleholeoptions)).printStackTrace();
	//   31   57:aload_1         
	//   32   58:invokevirtual   #243 <Method void Throwable.printStackTrace()>
			return true;
	//   33   61:iconst_1        
	//   34   62:ireturn         
		}
		if(d1 <= d2 - d3)
			flag = true;
		else
			flag = false;
		return flag;
	}

	private void e()
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field s j>
	//*   2    4:ifnull          24
			x = (ds.e)j.t(3);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #111 <Field s j>
	//    6   12:iconst_3        
	//    7   13:invokeinterface #283 <Method dr s.t(int)>
	//    8   18:checkcast       #285 <Class ds$e>
	//    9   21:putfield        #287 <Field ds$e x>
	//   10   24:return          
	}

	private void f()
		throws RemoteException
	{
		MapConfig mapconfig = j.getMapConfig();
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field s j>
	//    2    4:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//    3    9:astore_2        
		if(p != null && p.size() > 0)
	//*   4   10:aload_0         
	//*   5   11:getfield        #293 <Field List p>
	//*   6   14:ifnull          324
	//*   7   17:aload_0         
	//*   8   18:getfield        #293 <Field List p>
	//*   9   21:invokeinterface #184 <Method int List.size()>
	//*  10   26:ifle            324
		{
			GLES20.glClearStencil(0);
	//   11   29:iconst_0        
	//   12   30:invokestatic    #299 <Method void GLES20.glClearStencil(int)>
			GLES20.glStencilMask(255);
	//   13   33:sipush          255
	//   14   36:invokestatic    #302 <Method void GLES20.glStencilMask(int)>
			GLES20.glClear(1024);
	//   15   39:sipush          1024
	//   16   42:invokestatic    #305 <Method void GLES20.glClear(int)>
			GLES20.glFlush();
	//   17   45:invokestatic    #308 <Method void GLES20.glFlush()>
			GLES20.glEnable(2960);
	//   18   48:sipush          2960
	//   19   51:invokestatic    #311 <Method void GLES20.glEnable(int)>
			GLES20.glColorMask(false, false, false, false);
	//   20   54:iconst_0        
	//   21   55:iconst_0        
	//   22   56:iconst_0        
	//   23   57:iconst_0        
	//   24   58:invokestatic    #315 <Method void GLES20.glColorMask(boolean, boolean, boolean, boolean)>
			GLES20.glStencilFunc(512, 1, 255);
	//   25   61:sipush          512
	//   26   64:iconst_1        
	//   27   65:sipush          255
	//   28   68:invokestatic    #319 <Method void GLES20.glStencilFunc(int, int, int)>
			GLES20.glStencilOp(7681, 7680, 7680);
	//   29   71:sipush          7681
	//   30   74:sipush          7680
	//   31   77:sipush          7680
	//   32   80:invokestatic    #322 <Method void GLES20.glStencilOp(int, int, int)>
			for(int i1 = 0; i1 < p.size(); i1++)
	//*  33   83:iconst_0        
	//*  34   84:istore_1        
	//*  35   85:iload_1         
	//*  36   86:aload_0         
	//*  37   87:getfield        #293 <Field List p>
	//*  38   90:invokeinterface #184 <Method int List.size()>
	//*  39   95:icmpge          303
			{
				BaseHoleOptions baseholeoptions = (BaseHoleOptions)p.get(i1);
	//   40   98:aload_0         
	//   41   99:getfield        #293 <Field List p>
	//   42  102:iload_1         
	//   43  103:invokeinterface #188 <Method Object List.get(int)>
	//   44  108:checkcast       #324 <Class BaseHoleOptions>
	//   45  111:astore_3        
				if(baseholeoptions instanceof PolygonHoleOptions)
	//*  46  112:aload_3         
	//*  47  113:instanceof      #232 <Class PolygonHoleOptions>
	//*  48  116:ifeq            145
					a(a(((PolygonHoleOptions)baseholeoptions).getPoints()), mapconfig.getSX(), mapconfig.getSY());
	//   49  119:aload_0         
	//   50  120:aload_0         
	//   51  121:aload_3         
	//   52  122:checkcast       #232 <Class PolygonHoleOptions>
	//   53  125:invokevirtual   #236 <Method List PolygonHoleOptions.getPoints()>
	//   54  128:invokespecial   #326 <Method List a(List)>
	//   55  131:aload_2         
	//   56  132:invokevirtual   #331 <Method int MapConfig.getSX()>
	//   57  135:aload_2         
	//   58  136:invokevirtual   #334 <Method int MapConfig.getSY()>
	//   59  139:invokespecial   #336 <Method void a(List, int, int)>
				else
	//*  60  142:goto            173
				if(baseholeoptions instanceof CircleHoleOptions)
	//*  61  145:aload_3         
	//*  62  146:instanceof      #262 <Class CircleHoleOptions>
	//*  63  149:ifeq            173
				{
					CircleHoleOptions circleholeoptions = (CircleHoleOptions)baseholeoptions;
	//   64  152:aload_3         
	//   65  153:checkcast       #262 <Class CircleHoleOptions>
	//   66  156:astore          4
					j.f();
	//   67  158:aload_0         
	//   68  159:getfield        #111 <Field s j>
	//   69  162:invokeinterface #338 <Method void s.f()>
					a(circleholeoptions);
	//   70  167:aload_0         
	//   71  168:aload           4
	//   72  170:invokevirtual   #341 <Method void a(CircleHoleOptions)>
				}
				if(t == null || r <= 0)
					continue;
	//   73  173:aload_0         
	//   74  174:getfield        #224 <Field FloatBuffer t>
	//   75  177:ifnull          296
	//   76  180:aload_0         
	//   77  181:getfield        #217 <Field int r>
	//   78  184:ifle            296
				if(x == null || x.c())
	//*  79  187:aload_0         
	//*  80  188:getfield        #287 <Field ds$e x>
	//*  81  191:ifnull          204
	//*  82  194:aload_0         
	//*  83  195:getfield        #287 <Field ds$e x>
	//*  84  198:invokevirtual   #343 <Method boolean ds$e.c()>
	//*  85  201:ifeq            208
					e();
	//   86  204:aload_0         
	//   87  205:invokespecial   #345 <Method void e()>
				if(baseholeoptions instanceof PolygonHoleOptions)
	//*  88  208:aload_3         
	//*  89  209:instanceof      #232 <Class PolygonHoleOptions>
	//*  90  212:ifeq            259
				{
					em.a(x, -1, f, t, getStrokeWidth(), u, r, s, j.x());
	//   91  215:aload_0         
	//   92  216:getfield        #287 <Field ds$e x>
	//   93  219:iconst_m1       
	//   94  220:aload_0         
	//   95  221:getfield        #82  <Field int f>
	//   96  224:aload_0         
	//   97  225:getfield        #224 <Field FloatBuffer t>
	//   98  228:aload_0         
	//   99  229:invokevirtual   #349 <Method float getStrokeWidth()>
	//  100  232:aload_0         
	//  101  233:getfield        #226 <Field FloatBuffer u>
	//  102  236:aload_0         
	//  103  237:getfield        #217 <Field int r>
	//  104  240:aload_0         
	//  105  241:getfield        #219 <Field int s>
	//  106  244:aload_0         
	//  107  245:getfield        #111 <Field s j>
	//  108  248:invokeinterface #352 <Method float[] s.x()>
	//  109  253:invokestatic    #357 <Method void em.a(ds$e, int, int, FloatBuffer, float, FloatBuffer, int, int, float[])>
					continue;
	//  110  256:goto            296
				}
				if(baseholeoptions instanceof CircleHoleOptions)
	//* 111  259:aload_3         
	//* 112  260:instanceof      #262 <Class CircleHoleOptions>
	//* 113  263:ifeq            296
					em.a(x, -1, -1, t, 10F, r, j.x(), 0.0F, 0);
	//  114  266:aload_0         
	//  115  267:getfield        #287 <Field ds$e x>
	//  116  270:iconst_m1       
	//  117  271:iconst_m1       
	//  118  272:aload_0         
	//  119  273:getfield        #224 <Field FloatBuffer t>
	//  120  276:ldc1            #75  <Float 10F>
	//  121  278:aload_0         
	//  122  279:getfield        #217 <Field int r>
	//  123  282:aload_0         
	//  124  283:getfield        #111 <Field s j>
	//  125  286:invokeinterface #352 <Method float[] s.x()>
	//  126  291:fconst_0        
	//  127  292:iconst_0        
	//  128  293:invokestatic    #360 <Method void em.a(ds$e, int, int, FloatBuffer, float, int, float[], float, int)>
			}

	//  129  296:iload_1         
	//  130  297:iconst_1        
	//  131  298:iadd            
	//  132  299:istore_1        
	//* 133  300:goto            85
			GLES20.glColorMask(true, true, true, true);
	//  134  303:iconst_1        
	//  135  304:iconst_1        
	//  136  305:iconst_1        
	//  137  306:iconst_1        
	//  138  307:invokestatic    #315 <Method void GLES20.glColorMask(boolean, boolean, boolean, boolean)>
			GLES20.glStencilFunc(517, 1, 255);
	//  139  310:sipush          517
	//  140  313:iconst_1        
	//  141  314:sipush          255
	//  142  317:invokestatic    #319 <Method void GLES20.glStencilFunc(int, int, int)>
			GLES20.glStencilMask(0);
	//  143  320:iconst_0        
	//  144  321:invokestatic    #302 <Method void GLES20.glStencilMask(int)>
		}
	//  145  324:return          
	}

	private void g()
		throws RemoteException
	{
		GLES20.glClearStencil(0);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #299 <Method void GLES20.glClearStencil(int)>
		GLES20.glClear(1024);
	//    2    4:sipush          1024
	//    3    7:invokestatic    #305 <Method void GLES20.glClear(int)>
		GLES20.glDisable(2960);
	//    4   10:sipush          2960
	//    5   13:invokestatic    #363 <Method void GLES20.glDisable(int)>
		MapConfig mapconfig = j.getMapConfig();
	//    6   16:aload_0         
	//    7   17:getfield        #111 <Field s j>
	//    8   20:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//    9   25:astore_2        
		if(p != null && p.size() > 0)
	//*  10   26:aload_0         
	//*  11   27:getfield        #293 <Field List p>
	//*  12   30:ifnull          273
	//*  13   33:aload_0         
	//*  14   34:getfield        #293 <Field List p>
	//*  15   37:invokeinterface #184 <Method int List.size()>
	//*  16   42:ifle            273
		{
			for(int i1 = 0; i1 < p.size(); i1++)
	//*  17   45:iconst_0        
	//*  18   46:istore_1        
	//*  19   47:iload_1         
	//*  20   48:aload_0         
	//*  21   49:getfield        #293 <Field List p>
	//*  22   52:invokeinterface #184 <Method int List.size()>
	//*  23   57:icmpge          273
			{
				BaseHoleOptions baseholeoptions = (BaseHoleOptions)p.get(i1);
	//   24   60:aload_0         
	//   25   61:getfield        #293 <Field List p>
	//   26   64:iload_1         
	//   27   65:invokeinterface #188 <Method Object List.get(int)>
	//   28   70:checkcast       #324 <Class BaseHoleOptions>
	//   29   73:astore_3        
				if(baseholeoptions instanceof PolygonHoleOptions)
	//*  30   74:aload_3         
	//*  31   75:instanceof      #232 <Class PolygonHoleOptions>
	//*  32   78:ifeq            107
					a(a(((PolygonHoleOptions)baseholeoptions).getPoints()), mapconfig.getSX(), mapconfig.getSY());
	//   33   81:aload_0         
	//   34   82:aload_0         
	//   35   83:aload_3         
	//   36   84:checkcast       #232 <Class PolygonHoleOptions>
	//   37   87:invokevirtual   #236 <Method List PolygonHoleOptions.getPoints()>
	//   38   90:invokespecial   #326 <Method List a(List)>
	//   39   93:aload_2         
	//   40   94:invokevirtual   #331 <Method int MapConfig.getSX()>
	//   41   97:aload_2         
	//   42   98:invokevirtual   #334 <Method int MapConfig.getSY()>
	//   43  101:invokespecial   #336 <Method void a(List, int, int)>
				else
	//*  44  104:goto            135
				if(baseholeoptions instanceof CircleHoleOptions)
	//*  45  107:aload_3         
	//*  46  108:instanceof      #262 <Class CircleHoleOptions>
	//*  47  111:ifeq            135
				{
					CircleHoleOptions circleholeoptions = (CircleHoleOptions)baseholeoptions;
	//   48  114:aload_3         
	//   49  115:checkcast       #262 <Class CircleHoleOptions>
	//   50  118:astore          4
					j.f();
	//   51  120:aload_0         
	//   52  121:getfield        #111 <Field s j>
	//   53  124:invokeinterface #338 <Method void s.f()>
					a(circleholeoptions);
	//   54  129:aload_0         
	//   55  130:aload           4
	//   56  132:invokevirtual   #341 <Method void a(CircleHoleOptions)>
				}
				if(t == null || r <= 0)
					continue;
	//   57  135:aload_0         
	//   58  136:getfield        #224 <Field FloatBuffer t>
	//   59  139:ifnull          266
	//   60  142:aload_0         
	//   61  143:getfield        #217 <Field int r>
	//   62  146:ifle            266
				if(x == null || x.c())
	//*  63  149:aload_0         
	//*  64  150:getfield        #287 <Field ds$e x>
	//*  65  153:ifnull          166
	//*  66  156:aload_0         
	//*  67  157:getfield        #287 <Field ds$e x>
	//*  68  160:invokevirtual   #343 <Method boolean ds$e.c()>
	//*  69  163:ifeq            170
					e();
	//   70  166:aload_0         
	//   71  167:invokespecial   #345 <Method void e()>
				if(baseholeoptions instanceof PolygonHoleOptions)
	//*  72  170:aload_3         
	//*  73  171:instanceof      #232 <Class PolygonHoleOptions>
	//*  74  174:ifeq            221
				{
					em.b(x, 0, e, t, d, u, r, s, j.x());
	//   75  177:aload_0         
	//   76  178:getfield        #287 <Field ds$e x>
	//   77  181:iconst_0        
	//   78  182:aload_0         
	//   79  183:getfield        #80  <Field int e>
	//   80  186:aload_0         
	//   81  187:getfield        #224 <Field FloatBuffer t>
	//   82  190:aload_0         
	//   83  191:getfield        #77  <Field float d>
	//   84  194:aload_0         
	//   85  195:getfield        #226 <Field FloatBuffer u>
	//   86  198:aload_0         
	//   87  199:getfield        #217 <Field int r>
	//   88  202:aload_0         
	//   89  203:getfield        #219 <Field int s>
	//   90  206:aload_0         
	//   91  207:getfield        #111 <Field s j>
	//   92  210:invokeinterface #352 <Method float[] s.x()>
	//   93  215:invokestatic    #365 <Method void em.b(ds$e, int, int, FloatBuffer, float, FloatBuffer, int, int, float[])>
					continue;
	//   94  218:goto            266
				}
				if(baseholeoptions instanceof CircleHoleOptions)
	//*  95  221:aload_3         
	//*  96  222:instanceof      #262 <Class CircleHoleOptions>
	//*  97  225:ifeq            266
					em.b(x, 0, e, t, d, r, j.x(), a, -1);
	//   98  228:aload_0         
	//   99  229:getfield        #287 <Field ds$e x>
	//  100  232:iconst_0        
	//  101  233:aload_0         
	//  102  234:getfield        #80  <Field int e>
	//  103  237:aload_0         
	//  104  238:getfield        #224 <Field FloatBuffer t>
	//  105  241:aload_0         
	//  106  242:getfield        #77  <Field float d>
	//  107  245:aload_0         
	//  108  246:getfield        #217 <Field int r>
	//  109  249:aload_0         
	//  110  250:getfield        #111 <Field s j>
	//  111  253:invokeinterface #352 <Method float[] s.x()>
	//  112  258:aload_0         
	//  113  259:getfield        #109 <Field float a>
	//  114  262:iconst_m1       
	//  115  263:invokestatic    #367 <Method void em.b(ds$e, int, int, FloatBuffer, float, int, float[], float, int)>
			}

	//  116  266:iload_1         
	//  117  267:iconst_1        
	//  118  268:iadd            
	//  119  269:istore_1        
		}
	//* 120  270:goto            47
	//  121  273:return          
	}

	public void a(CircleHoleOptions circleholeoptions)
		throws RemoteException
	{
		if(circleholeoptions.getCenter() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #266 <Method LatLng CircleHoleOptions.getCenter()>
	//*   2    4:ifnull          328
		{
			IPoint ipoint = IPoint.obtain();
	//    3    7:invokestatic    #96  <Method IPoint IPoint.obtain()>
	//    4   10:astore          11
			FPoint fpoint = FPoint.obtain();
	//    5   12:invokestatic    #103 <Method FPoint FPoint.obtain()>
	//    6   15:astore          12
			GLMapState.lonlat2Geo(circleholeoptions.getCenter().longitude, circleholeoptions.getCenter().latitude, ipoint);
	//    7   17:aload_1         
	//    8   18:invokevirtual   #266 <Method LatLng CircleHoleOptions.getCenter()>
	//    9   21:getfield        #172 <Field double LatLng.longitude>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #266 <Method LatLng CircleHoleOptions.getCenter()>
	//   12   28:getfield        #169 <Field double LatLng.latitude>
	//   13   31:aload           11
	//   14   33:invokestatic    #372 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
			float af[] = new float[1086];
	//   15   36:sipush          1086
	//   16   39:newarray        float[]
	//   17   41:astore          13
			double d1 = b(circleholeoptions.getCenter().latitude) * circleholeoptions.getRadius();
	//   18   43:aload_0         
	//   19   44:aload_1         
	//   20   45:invokevirtual   #266 <Method LatLng CircleHoleOptions.getCenter()>
	//   21   48:getfield        #169 <Field double LatLng.latitude>
	//   22   51:invokespecial   #374 <Method double b(double)>
	//   23   54:aload_1         
	//   24   55:invokevirtual   #278 <Method double CircleHoleOptions.getRadius()>
	//   25   58:dmul            
	//   26   59:dstore_2        
			fpoint.x = ipoint.x - j.getMapConfig().getSX();
	//   27   60:aload           12
	//   28   62:aload           11
	//   29   64:getfield        #190 <Field int IPoint.x>
	//   30   67:aload_0         
	//   31   68:getfield        #111 <Field s j>
	//   32   71:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//   33   76:invokevirtual   #331 <Method int MapConfig.getSX()>
	//   34   79:isub            
	//   35   80:i2f             
	//   36   81:putfield        #376 <Field float FPoint.x>
			fpoint.y = ipoint.y - j.getMapConfig().getSY();
	//   37   84:aload           12
	//   38   86:aload           11
	//   39   88:getfield        #192 <Field int IPoint.y>
	//   40   91:aload_0         
	//   41   92:getfield        #111 <Field s j>
	//   42   95:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//   43  100:invokevirtual   #334 <Method int MapConfig.getSY()>
	//   44  103:isub            
	//   45  104:i2f             
	//   46  105:putfield        #377 <Field float FPoint.y>
			af[0] = fpoint.x;
	//   47  108:aload           13
	//   48  110:iconst_0        
	//   49  111:aload           12
	//   50  113:getfield        #376 <Field float FPoint.x>
	//   51  116:fastore         
			af[1] = fpoint.y;
	//   52  117:aload           13
	//   53  119:iconst_1        
	//   54  120:aload           12
	//   55  122:getfield        #377 <Field float FPoint.y>
	//   56  125:fastore         
			af[2] = 0.0F;
	//   57  126:aload           13
	//   58  128:iconst_2        
	//   59  129:fconst_0        
	//   60  130:fastore         
			for(int i1 = 0; i1 < 361; i1++)
	//*  61  131:iconst_0        
	//*  62  132:istore          8
	//*  63  134:iload           8
	//*  64  136:sipush          361
	//*  65  139:icmpge          290
			{
				double d3 = ((double)i1 * 3.1415926535897931D) / 180D;
	//   66  142:iload           8
	//   67  144:i2d             
	//   68  145:ldc2w           #131 <Double 3.1415926535897931D>
	//   69  148:dmul            
	//   70  149:ldc2w           #133 <Double 180D>
	//   71  152:ddiv            
	//   72  153:dstore          6
				double d2 = Math.sin(d3);
	//   73  155:dload           6
	//   74  157:invokestatic    #380 <Method double Math.sin(double)>
	//   75  160:dstore          4
				d3 = Math.cos(d3);
	//   76  162:dload           6
	//   77  164:invokestatic    #140 <Method double Math.cos(double)>
	//   78  167:dstore          6
				int k1 = (int)((double)ipoint.x + d2 * d1);
	//   79  169:aload           11
	//   80  171:getfield        #190 <Field int IPoint.x>
	//   81  174:i2d             
	//   82  175:dload           4
	//   83  177:dload_2         
	//   84  178:dmul            
	//   85  179:dadd            
	//   86  180:d2i             
	//   87  181:istore          9
				int l1 = (int)((double)ipoint.y + d3 * d1);
	//   88  183:aload           11
	//   89  185:getfield        #192 <Field int IPoint.y>
	//   90  188:i2d             
	//   91  189:dload           6
	//   92  191:dload_2         
	//   93  192:dmul            
	//   94  193:dadd            
	//   95  194:d2i             
	//   96  195:istore          10
				fpoint.x = k1 - j.getMapConfig().getSX();
	//   97  197:aload           12
	//   98  199:iload           9
	//   99  201:aload_0         
	//  100  202:getfield        #111 <Field s j>
	//  101  205:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//  102  210:invokevirtual   #331 <Method int MapConfig.getSX()>
	//  103  213:isub            
	//  104  214:i2f             
	//  105  215:putfield        #376 <Field float FPoint.x>
				fpoint.y = l1 - j.getMapConfig().getSY();
	//  106  218:aload           12
	//  107  220:iload           10
	//  108  222:aload_0         
	//  109  223:getfield        #111 <Field s j>
	//  110  226:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//  111  231:invokevirtual   #334 <Method int MapConfig.getSY()>
	//  112  234:isub            
	//  113  235:i2f             
	//  114  236:putfield        #377 <Field float FPoint.y>
				af[(i1 + 1) * 3] = fpoint.x;
	//  115  239:aload           13
	//  116  241:iload           8
	//  117  243:iconst_1        
	//  118  244:iadd            
	//  119  245:iconst_3        
	//  120  246:imul            
	//  121  247:aload           12
	//  122  249:getfield        #376 <Field float FPoint.x>
	//  123  252:fastore         
				af[(i1 + 1) * 3 + 1] = fpoint.y;
	//  124  253:aload           13
	//  125  255:iload           8
	//  126  257:iconst_1        
	//  127  258:iadd            
	//  128  259:iconst_3        
	//  129  260:imul            
	//  130  261:iconst_1        
	//  131  262:iadd            
	//  132  263:aload           12
	//  133  265:getfield        #377 <Field float FPoint.y>
	//  134  268:fastore         
				af[(i1 + 1) * 3 + 2] = 0.0F;
	//  135  269:aload           13
	//  136  271:iload           8
	//  137  273:iconst_1        
	//  138  274:iadd            
	//  139  275:iconst_3        
	//  140  276:imul            
	//  141  277:iconst_2        
	//  142  278:iadd            
	//  143  279:fconst_0        
	//  144  280:fastore         
			}

	//  145  281:iload           8
	//  146  283:iconst_1        
	//  147  284:iadd            
	//  148  285:istore          8
	//* 149  287:goto            134
			int j1 = af.length;
	//  150  290:aload           13
	//  151  292:arraylength     
	//  152  293:istore          8
			j1 = 1086 / 3;
	//  153  295:sipush          1086
	//  154  298:iconst_3        
	//  155  299:idiv            
	//  156  300:istore          8
			r = 362;
	//  157  302:aload_0         
	//  158  303:sipush          362
	//  159  306:putfield        #217 <Field int r>
			t = fd.a(af);
	//  160  309:aload_0         
	//  161  310:aload           13
	//  162  312:invokestatic    #222 <Method FloatBuffer fd.a(float[])>
	//  163  315:putfield        #224 <Field FloatBuffer t>
			ipoint.recycle();
	//  164  318:aload           11
	//  165  320:invokevirtual   #383 <Method void IPoint.recycle()>
			fpoint.recycle();
	//  166  323:aload           12
	//  167  325:invokevirtual   #384 <Method void FPoint.recycle()>
		}
	//  168  328:return          
	}

	public void a(MapConfig mapconfig)
		throws RemoteException
	{
		if(b == null || c <= 0.0D || !h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field LatLng b>
	//*   2    4:ifnull          23
	//*   3    7:aload_0         
	//*   4    8:getfield        #74  <Field double c>
	//*   5   11:dconst_0        
	//*   6   12:dcmpg           
	//*   7   13:ifle            23
	//*   8   16:aload_0         
	//*   9   17:getfield        #86  <Field boolean h>
	//*  10   20:ifne            24
			return;
	//   11   23:return          
		b();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #387 <Method boolean b()>
	//   14   28:pop             
		f();
	//   15   29:aload_0         
	//   16   30:invokespecial   #388 <Method void f()>
		if(k != null && l > 0)
	//*  17   33:aload_0         
	//*  18   34:getfield        #390 <Field FloatBuffer k>
	//*  19   37:ifnull          139
	//*  20   40:aload_0         
	//*  21   41:getfield        #88  <Field int l>
	//*  22   44:ifle            139
		{
			if(x == null || x.c())
	//*  23   47:aload_0         
	//*  24   48:getfield        #287 <Field ds$e x>
	//*  25   51:ifnull          64
	//*  26   54:aload_0         
	//*  27   55:getfield        #287 <Field ds$e x>
	//*  28   58:invokevirtual   #343 <Method boolean ds$e.c()>
	//*  29   61:ifeq            68
				e();
	//   30   64:aload_0         
	//   31   65:invokespecial   #345 <Method void e()>
			a = j.getMapConfig().getMapPerPixelUnitLength();
	//   32   68:aload_0         
	//   33   69:aload_0         
	//   34   70:getfield        #111 <Field s j>
	//   35   73:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//   36   78:invokevirtual   #393 <Method float MapConfig.getMapPerPixelUnitLength()>
	//   37   81:putfield        #109 <Field float a>
			int i1 = j.f(w);
	//   38   84:aload_0         
	//   39   85:getfield        #111 <Field s j>
	//   40   88:aload_0         
	//   41   89:getfield        #107 <Field int w>
	//   42   92:invokeinterface #396 <Method int s.f(int)>
	//   43   97:istore_2        
			em.a(x, f, e, k, d, l, j.x(), a, i1);
	//   44   98:aload_0         
	//   45   99:getfield        #287 <Field ds$e x>
	//   46  102:aload_0         
	//   47  103:getfield        #82  <Field int f>
	//   48  106:aload_0         
	//   49  107:getfield        #80  <Field int e>
	//   50  110:aload_0         
	//   51  111:getfield        #390 <Field FloatBuffer k>
	//   52  114:aload_0         
	//   53  115:getfield        #77  <Field float d>
	//   54  118:aload_0         
	//   55  119:getfield        #88  <Field int l>
	//   56  122:aload_0         
	//   57  123:getfield        #111 <Field s j>
	//   58  126:invokeinterface #352 <Method float[] s.x()>
	//   59  131:aload_0         
	//   60  132:getfield        #109 <Field float a>
	//   61  135:iload_2         
	//   62  136:invokestatic    #360 <Method void em.a(ds$e, int, int, FloatBuffer, float, int, float[], float, int)>
		}
		g();
	//   63  139:aload_0         
	//   64  140:invokespecial   #398 <Method void g()>
		m = true;
	//   65  143:aload_0         
	//   66  144:iconst_1        
	//   67  145:putfield        #90  <Field boolean m>
	//   68  148:return          
	}

	public boolean a()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean b()
		throws RemoteException
	{
		Object obj = v;
	//    0    0:getstatic       #55  <Field Object v>
	//    1    3:astore          10
		obj;
	//    2    5:aload           10
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		double d1;
		float af[];
		m = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #90  <Field boolean m>
		if(b == null)
			break MISSING_BLOCK_LABEL_334;
	//    7   13:aload_0         
	//    8   14:getfield        #72  <Field LatLng b>
	//    9   17:ifnull          334
		af = new float[1086];
	//   10   20:sipush          1086
	//   11   23:newarray        float[]
	//   12   25:astore          11
		d1 = b(b.latitude) * c;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #72  <Field LatLng b>
	//   16   32:getfield        #169 <Field double LatLng.latitude>
	//   17   35:invokespecial   #374 <Method double b(double)>
	//   18   38:aload_0         
	//   19   39:getfield        #74  <Field double c>
	//   20   42:dmul            
	//   21   43:dstore_1        
		j.c();
	//   22   44:aload_0         
	//   23   45:getfield        #111 <Field s j>
	//   24   48:invokeinterface #401 <Method GLMapState s.c()>
	//   25   53:pop             
		o.x = n.x - j.getMapConfig().getSX();
	//   26   54:aload_0         
	//   27   55:getfield        #105 <Field FPoint o>
	//   28   58:aload_0         
	//   29   59:getfield        #98  <Field IPoint n>
	//   30   62:getfield        #190 <Field int IPoint.x>
	//   31   65:aload_0         
	//   32   66:getfield        #111 <Field s j>
	//   33   69:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//   34   74:invokevirtual   #331 <Method int MapConfig.getSX()>
	//   35   77:isub            
	//   36   78:i2f             
	//   37   79:putfield        #376 <Field float FPoint.x>
		o.y = n.y - j.getMapConfig().getSY();
	//   38   82:aload_0         
	//   39   83:getfield        #105 <Field FPoint o>
	//   40   86:aload_0         
	//   41   87:getfield        #98  <Field IPoint n>
	//   42   90:getfield        #192 <Field int IPoint.y>
	//   43   93:aload_0         
	//   44   94:getfield        #111 <Field s j>
	//   45   97:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//   46  102:invokevirtual   #334 <Method int MapConfig.getSY()>
	//   47  105:isub            
	//   48  106:i2f             
	//   49  107:putfield        #377 <Field float FPoint.y>
		af[0] = o.x;
	//   50  110:aload           11
	//   51  112:iconst_0        
	//   52  113:aload_0         
	//   53  114:getfield        #105 <Field FPoint o>
	//   54  117:getfield        #376 <Field float FPoint.x>
	//   55  120:fastore         
		af[1] = o.y;
	//   56  121:aload           11
	//   57  123:iconst_1        
	//   58  124:aload_0         
	//   59  125:getfield        #105 <Field FPoint o>
	//   60  128:getfield        #377 <Field float FPoint.y>
	//   61  131:fastore         
		int i1;
		af[2] = 0.0F;
	//   62  132:aload           11
	//   63  134:iconst_2        
	//   64  135:fconst_0        
	//   65  136:fastore         
		i1 = 0;
	//   66  137:iconst_0        
	//   67  138:istore          7
_L2:
		if(i1 >= 361)
			break; /* Loop/switch isn't completed */
	//   68  140:iload           7
	//   69  142:sipush          361
	//   70  145:icmpge          306
		double d3 = ((double)i1 * 3.1415926535897931D) / 180D;
	//   71  148:iload           7
	//   72  150:i2d             
	//   73  151:ldc2w           #131 <Double 3.1415926535897931D>
	//   74  154:dmul            
	//   75  155:ldc2w           #133 <Double 180D>
	//   76  158:ddiv            
	//   77  159:dstore          5
		double d2 = Math.sin(d3);
	//   78  161:dload           5
	//   79  163:invokestatic    #380 <Method double Math.sin(double)>
	//   80  166:dstore_3        
		d3 = Math.cos(d3);
	//   81  167:dload           5
	//   82  169:invokestatic    #140 <Method double Math.cos(double)>
	//   83  172:dstore          5
		int k1 = (int)((double)n.x + d2 * d1);
	//   84  174:aload_0         
	//   85  175:getfield        #98  <Field IPoint n>
	//   86  178:getfield        #190 <Field int IPoint.x>
	//   87  181:i2d             
	//   88  182:dload_3         
	//   89  183:dload_1         
	//   90  184:dmul            
	//   91  185:dadd            
	//   92  186:d2i             
	//   93  187:istore          8
		int l1 = (int)((double)n.y + d3 * d1);
	//   94  189:aload_0         
	//   95  190:getfield        #98  <Field IPoint n>
	//   96  193:getfield        #192 <Field int IPoint.y>
	//   97  196:i2d             
	//   98  197:dload           5
	//   99  199:dload_1         
	//  100  200:dmul            
	//  101  201:dadd            
	//  102  202:d2i             
	//  103  203:istore          9
		o.x = k1 - j.getMapConfig().getSX();
	//  104  205:aload_0         
	//  105  206:getfield        #105 <Field FPoint o>
	//  106  209:iload           8
	//  107  211:aload_0         
	//  108  212:getfield        #111 <Field s j>
	//  109  215:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//  110  220:invokevirtual   #331 <Method int MapConfig.getSX()>
	//  111  223:isub            
	//  112  224:i2f             
	//  113  225:putfield        #376 <Field float FPoint.x>
		o.y = l1 - j.getMapConfig().getSY();
	//  114  228:aload_0         
	//  115  229:getfield        #105 <Field FPoint o>
	//  116  232:iload           9
	//  117  234:aload_0         
	//  118  235:getfield        #111 <Field s j>
	//  119  238:invokeinterface #291 <Method MapConfig s.getMapConfig()>
	//  120  243:invokevirtual   #334 <Method int MapConfig.getSY()>
	//  121  246:isub            
	//  122  247:i2f             
	//  123  248:putfield        #377 <Field float FPoint.y>
		af[(i1 + 1) * 3] = o.x;
	//  124  251:aload           11
	//  125  253:iload           7
	//  126  255:iconst_1        
	//  127  256:iadd            
	//  128  257:iconst_3        
	//  129  258:imul            
	//  130  259:aload_0         
	//  131  260:getfield        #105 <Field FPoint o>
	//  132  263:getfield        #376 <Field float FPoint.x>
	//  133  266:fastore         
		af[(i1 + 1) * 3 + 1] = o.y;
	//  134  267:aload           11
	//  135  269:iload           7
	//  136  271:iconst_1        
	//  137  272:iadd            
	//  138  273:iconst_3        
	//  139  274:imul            
	//  140  275:iconst_1        
	//  141  276:iadd            
	//  142  277:aload_0         
	//  143  278:getfield        #105 <Field FPoint o>
	//  144  281:getfield        #377 <Field float FPoint.y>
	//  145  284:fastore         
		af[(i1 + 1) * 3 + 2] = 0.0F;
	//  146  285:aload           11
	//  147  287:iload           7
	//  148  289:iconst_1        
	//  149  290:iadd            
	//  150  291:iconst_3        
	//  151  292:imul            
	//  152  293:iconst_2        
	//  153  294:iadd            
	//  154  295:fconst_0        
	//  155  296:fastore         
		i1++;
	//  156  297:iload           7
	//  157  299:iconst_1        
	//  158  300:iadd            
	//  159  301:istore          7
		if(true) goto _L2; else goto _L1
	//  160  303:goto            140
_L1:
		int j1 = af.length;
	//  161  306:aload           11
	//  162  308:arraylength     
	//  163  309:istore          7
		j1 = 1086 / 3;
	//  164  311:sipush          1086
	//  165  314:iconst_3        
	//  166  315:idiv            
	//  167  316:istore          7
		l = 362;
	//  168  318:aload_0         
	//  169  319:sipush          362
	//  170  322:putfield        #88  <Field int l>
		k = fd.a(af);
	//  171  325:aload_0         
	//  172  326:aload           11
	//  173  328:invokestatic    #222 <Method FloatBuffer fd.a(float[])>
	//  174  331:putfield        #390 <Field FloatBuffer k>
		obj;
	//  175  334:aload           10
		JVM INSTR monitorexit ;
	//  176  336:monitorexit     
		return true;
	//  177  337:iconst_1        
	//  178  338:ireturn         
		Exception exception;
		exception;
	//  179  339:astore          11
	//* 180  341:aload           10
		throw exception;
	//  181  343:monitorexit     
	//  182  344:aload           11
	//  183  346:athrow          
	}

	public boolean c()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean m>
	//    2    4:ireturn         
	}

	public boolean contains(LatLng latlng)
		throws RemoteException
	{
label0:
		{
			if(p == null || p.size() <= 0)
				break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #293 <Field List p>
	//    2    4:ifnull          59
	//    3    7:aload_0         
	//    4    8:getfield        #293 <Field List p>
	//    5   11:invokeinterface #184 <Method int List.size()>
	//    6   16:ifle            59
			Iterator iterator = p.iterator();
	//    7   19:aload_0         
	//    8   20:getfield        #293 <Field List p>
	//    9   23:invokeinterface #150 <Method Iterator List.iterator()>
	//   10   28:astore_2        
			do
				if(!iterator.hasNext())
					break label0;
	//   11   29:aload_2         
	//   12   30:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//   13   35:ifeq            59
			while(!fd.a((BaseHoleOptions)iterator.next(), latlng));
	//   14   38:aload_2         
	//   15   39:invokeinterface #160 <Method Object Iterator.next()>
	//   16   44:checkcast       #324 <Class BaseHoleOptions>
	//   17   47:aload_1         
	//   18   48:invokestatic    #404 <Method boolean fd.a(BaseHoleOptions, LatLng)>
	//   19   51:ifeq            56
			return false;
	//   20   54:iconst_0        
	//   21   55:ireturn         
		}
	//*  22   56:goto            29
		return c >= (double)AMapUtils.calculateLineDistance(b, latlng);
	//   23   59:aload_0         
	//   24   60:getfield        #74  <Field double c>
	//   25   63:aload_0         
	//   26   64:getfield        #72  <Field LatLng b>
	//   27   67:aload_1         
	//   28   68:invokestatic    #273 <Method float AMapUtils.calculateLineDistance(LatLng, LatLng)>
	//   29   71:f2d             
	//   30   72:dcmpl           
	//   31   73:iflt            78
	//   32   76:iconst_1        
	//   33   77:ireturn         
	//   34   78:iconst_0        
	//   35   79:ireturn         
	}

	void d()
	{
		l = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #88  <Field int l>
		if(k != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #390 <Field FloatBuffer k>
	//*   5    9:ifnull          20
			k.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #390 <Field FloatBuffer k>
	//    8   16:invokevirtual   #410 <Method java.nio.Buffer FloatBuffer.clear()>
	//    9   19:pop             
		j.setRunLowFrame(false);
	//   10   20:aload_0         
	//   11   21:getfield        #111 <Field s j>
	//   12   24:iconst_0        
	//   13   25:invokeinterface #414 <Method void s.setRunLowFrame(boolean)>
		setHoleOptions(q);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #416 <Field List q>
	//   17   35:invokevirtual   #419 <Method void setHoleOptions(List)>
	//   18   38:return          
	}

	public void destroy()
	{
		try
		{
			b = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #72  <Field LatLng b>
			if(k != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #390 <Field FloatBuffer k>
	//*   5    9:ifnull          25
			{
				k.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #390 <Field FloatBuffer k>
	//    8   16:invokevirtual   #410 <Method java.nio.Buffer FloatBuffer.clear()>
	//    9   19:pop             
				k = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #390 <Field FloatBuffer k>
			}
			if(t != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #224 <Field FloatBuffer t>
	//*  15   29:ifnull          45
			{
				t.clear();
	//   16   32:aload_0         
	//   17   33:getfield        #224 <Field FloatBuffer t>
	//   18   36:invokevirtual   #410 <Method java.nio.Buffer FloatBuffer.clear()>
	//   19   39:pop             
				t = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #224 <Field FloatBuffer t>
			}
			if(u != null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #226 <Field FloatBuffer u>
	//*  25   49:ifnull          65
			{
				u.clear();
	//   26   52:aload_0         
	//   27   53:getfield        #226 <Field FloatBuffer u>
	//   28   56:invokevirtual   #410 <Method java.nio.Buffer FloatBuffer.clear()>
	//   29   59:pop             
				u = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #226 <Field FloatBuffer u>
			}
			if(p != null)
	//*  33   65:aload_0         
	//*  34   66:getfield        #293 <Field List p>
	//*  35   69:ifnull          81
				p.clear();
	//   36   72:aload_0         
	//   37   73:getfield        #293 <Field List p>
	//   38   76:invokeinterface #422 <Method void List.clear()>
			if(q != null)
	//*  39   81:aload_0         
	//*  40   82:getfield        #416 <Field List q>
	//*  41   85:ifnull          97
				q.clear();
	//   42   88:aload_0         
	//   43   89:getfield        #416 <Field List q>
	//   44   92:invokeinterface #422 <Method void List.clear()>
			p = null;
	//   45   97:aload_0         
	//   46   98:aconst_null     
	//   47   99:putfield        #293 <Field List p>
			q = null;
	//   48  102:aload_0         
	//   49  103:aconst_null     
	//   50  104:putfield        #416 <Field List q>
			return;
	//   51  107:return          
		}
		catch(Throwable throwable)
	//*  52  108:astore_1        
		{
			hm.c(throwable, "CircleDelegateImp", "destroy");
	//   53  109:aload_1         
	//   54  110:ldc1            #119 <String "CircleDelegateImp">
	//   55  112:ldc2            #423 <String "destroy">
	//   56  115:invokestatic    #126 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   57  118:aload_1         
	//   58  119:invokevirtual   #243 <Method void Throwable.printStackTrace()>
			Log.d("destroy erro", "CircleDelegateImp destroy");
	//   59  122:ldc2            #425 <String "destroy erro">
	//   60  125:ldc2            #427 <String "CircleDelegateImp destroy">
	//   61  128:invokestatic    #432 <Method int Log.d(String, String)>
	//   62  131:pop             
			return;
	//   63  132:return          
		}
	}

	public boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlay))) || ioverlay.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #435 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #438 <Method String IOverlay.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #115 <Method String getId()>
	//    8   18:invokevirtual   #441 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public LatLng getCenter()
		throws RemoteException
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field LatLng b>
	//    2    4:areturn         
	}

	public int getDottedLineType()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field int w>
	//    2    4:ireturn         
	}

	public int getFillColor()
		throws RemoteException
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int f>
	//    2    4:ireturn         
	}

	public List getHoleOptions()
		throws RemoteException
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #293 <Field List p>
	//    2    4:areturn         
	}

	public String getId()
		throws RemoteException
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field String i>
	//*   2    4:ifnonnull       23
			i = j.d("Circle");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #111 <Field s j>
	//    6   12:ldc2            #447 <String "Circle">
	//    7   15:invokeinterface #450 <Method String s.d(String)>
	//    8   20:putfield        #117 <Field String i>
		return i;
	//    9   23:aload_0         
	//   10   24:getfield        #117 <Field String i>
	//   11   27:areturn         
	}

	public double getRadius()
		throws RemoteException
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field double c>
	//    2    4:dreturn         
	}

	public int getStrokeColor()
		throws RemoteException
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int e>
	//    2    4:ireturn         
	}

	public float getStrokeWidth()
		throws RemoteException
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field float d>
	//    2    4:freturn         
	}

	public float getZIndex()
		throws RemoteException
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field float g>
	//    2    4:freturn         
	}

	public int hashCodeRemote()
		throws RemoteException
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean h>
	//    2    4:ireturn         
	}

	public void remove()
		throws RemoteException
	{
		j.a(getId());
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field s j>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method String getId()>
	//    4    8:invokeinterface #458 <Method boolean s.a(String)>
	//    5   13:pop             
		j.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #111 <Field s j>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #414 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	public void setAboveMaskLayer(boolean flag)
	{
	//    0    0:return          
	}

	public void setCenter(LatLng latlng)
		throws RemoteException
	{
		Object obj = v;
	//    0    0:getstatic       #55  <Field Object v>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(latlng == null)
			break MISSING_BLOCK_LABEL_34;
	//    4    6:aload_1         
	//    5    7:ifnull          34
		b = latlng;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #72  <Field LatLng b>
		GLMapState.lonlat2Geo(latlng.longitude, latlng.latitude, n);
	//    9   15:aload_1         
	//   10   16:getfield        #172 <Field double LatLng.longitude>
	//   11   19:aload_1         
	//   12   20:getfield        #169 <Field double LatLng.latitude>
	//   13   23:aload_0         
	//   14   24:getfield        #98  <Field IPoint n>
	//   15   27:invokestatic    #372 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
		d();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #463 <Method void d()>
		obj;
	//   18   34:aload_2         
		JVM INSTR monitorexit ;
	//   19   35:monitorexit     
		return;
	//   20   36:return          
		latlng;
	//   21   37:astore_1        
	//*  22   38:aload_2         
		throw latlng;
	//   23   39:monitorexit     
	//   24   40:aload_1         
	//   25   41:athrow          
	}

	public void setDottedLineType(int i1)
	{
		w = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #107 <Field int w>
	//    3    5:return          
	}

	public void setFillColor(int i1)
		throws RemoteException
	{
		f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field int f>
		j.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field s j>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #414 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setHoleOptions(List list)
	{
		q = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #416 <Field List q>
		if(p != null) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #293 <Field List p>
	//    5    9:ifnonnull       26
_L1:
		p = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #143 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #144 <Method void ArrayList()>
	//   10   20:putfield        #293 <Field List p>
		  goto _L3
	//*  11   23:goto            170
_L2:
		int i1;
		Object obj;
		try
		{
			p.clear();
	//   12   26:aload_0         
	//   13   27:getfield        #293 <Field List p>
	//   14   30:invokeinterface #422 <Method void List.clear()>
		}
	//*  15   35:goto            170
	//*  16   38:iload_2         
	//*  17   39:aload_1         
	//*  18   40:invokeinterface #184 <Method int List.size()>
	//*  19   45:icmpge          153
	//*  20   48:aload_1         
	//*  21   49:iload_2         
	//*  22   50:invokeinterface #188 <Method Object List.get(int)>
	//*  23   55:checkcast       #324 <Class BaseHoleOptions>
	//*  24   58:astore_3        
	//*  25   59:aload_3         
	//*  26   60:instanceof      #232 <Class PolygonHoleOptions>
	//*  27   63:ifeq            104
	//*  28   66:aload_3         
	//*  29   67:checkcast       #232 <Class PolygonHoleOptions>
	//*  30   70:astore_3        
	//*  31   71:aload_0         
	//*  32   72:aload_3         
	//*  33   73:invokespecial   #467 <Method boolean a(PolygonHoleOptions)>
	//*  34   76:ifeq            179
	//*  35   79:aload_0         
	//*  36   80:getfield        #293 <Field List p>
	//*  37   83:aload_3         
	//*  38   84:invokestatic    #470 <Method boolean fd.a(List, PolygonHoleOptions)>
	//*  39   87:ifne            179
	//*  40   90:aload_0         
	//*  41   91:getfield        #293 <Field List p>
	//*  42   94:aload_3         
	//*  43   95:invokeinterface #180 <Method boolean List.add(Object)>
	//*  44  100:pop             
	//*  45  101:goto            179
	//*  46  104:aload_3         
	//*  47  105:instanceof      #262 <Class CircleHoleOptions>
	//*  48  108:ifeq            146
	//*  49  111:aload_3         
	//*  50  112:checkcast       #262 <Class CircleHoleOptions>
	//*  51  115:astore_3        
	//*  52  116:aload_0         
	//*  53  117:aload_3         
	//*  54  118:invokespecial   #472 <Method boolean b(CircleHoleOptions)>
	//*  55  121:ifeq            146
	//*  56  124:aload_0         
	//*  57  125:getfield        #293 <Field List p>
	//*  58  128:aload_3         
	//*  59  129:invokestatic    #475 <Method boolean fd.a(List, CircleHoleOptions)>
	//*  60  132:ifne            146
	//*  61  135:aload_0         
	//*  62  136:getfield        #293 <Field List p>
	//*  63  139:aload_3         
	//*  64  140:invokeinterface #180 <Method boolean List.add(Object)>
	//*  65  145:pop             
	//*  66  146:iload_2         
	//*  67  147:iconst_1        
	//*  68  148:iadd            
	//*  69  149:istore_2        
	//*  70  150:goto            38
	//*  71  153:return          
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  72  154:astore_1        
		{
			hm.c(((Throwable) (list)), "PolygonDelegateImp", "setHoleOptions");
	//   73  155:aload_1         
	//   74  156:ldc2            #477 <String "PolygonDelegateImp">
	//   75  159:ldc2            #478 <String "setHoleOptions">
	//   76  162:invokestatic    #126 <Method void hm.c(Throwable, String, String)>
			((Throwable) (list)).printStackTrace();
	//   77  165:aload_1         
	//   78  166:invokevirtual   #243 <Method void Throwable.printStackTrace()>
			return;
	//   79  169:return          
		}
		  goto _L3
_L7:
		if(i1 >= list.size())
			break MISSING_BLOCK_LABEL_153;
		obj = ((Object) ((BaseHoleOptions)list.get(i1)));
		if(obj instanceof PolygonHoleOptions)
		{
			obj = ((Object) ((PolygonHoleOptions)obj));
			if(a(((PolygonHoleOptions) (obj))) && !fd.a(p, ((PolygonHoleOptions) (obj))))
				p.add(obj);
			break MISSING_BLOCK_LABEL_146;
		}
		if(obj instanceof CircleHoleOptions)
		{
			obj = ((Object) ((CircleHoleOptions)obj));
			if(b(((CircleHoleOptions) (obj))) && !fd.a(p, ((CircleHoleOptions) (obj))))
				p.add(obj);
		}
		i1++;
		continue; /* Loop/switch isn't completed */
_L5:
		return;
_L3:
		if(list == null) goto _L5; else goto _L4
	//   80  170:aload_1         
	//   81  171:ifnull          153
_L4:
		i1 = 0;
	//   82  174:iconst_0        
	//   83  175:istore_2        
		if(true) goto _L7; else goto _L6
	//   84  176:goto            38
_L6:
	//*  85  179:goto            146
	}

	public void setRadius(double d1)
		throws RemoteException
	{
		c = d1;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #74  <Field double c>
		d();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #463 <Method void d()>
	//    5    9:return          
	}

	public void setStrokeColor(int i1)
		throws RemoteException
	{
		e = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field int e>
		j.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field s j>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #414 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setStrokeWidth(float f1)
		throws RemoteException
	{
		d = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #77  <Field float d>
		j.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field s j>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #414 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setVisible(boolean flag)
		throws RemoteException
	{
		h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean h>
		j.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field s j>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #414 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setZIndex(float f1)
		throws RemoteException
	{
		g = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #84  <Field float g>
		j.f();
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field s j>
	//    5    9:invokeinterface #338 <Method void s.f()>
		j.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #111 <Field s j>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #414 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	private static int A = 20;
	private static double B = 10000000000D;
	private static Object v = new Object();
	private static float y = 4.007502E+07F;
	private static int z = 256;
	float a;
	private LatLng b;
	private double c;
	private float d;
	private int e;
	private int f;
	private float g;
	private boolean h;
	private String i;
	private s j;
	private FloatBuffer k;
	private int l;
	private boolean m;
	private IPoint n;
	private FPoint o;
	private List p;
	private List q;
	private int r;
	private int s;
	private FloatBuffer t;
	private FloatBuffer u;
	private int w;
	private ds.e x;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void Object()>
	//    3    7:putstatic       #55  <Field Object v>
	//    4   10:ldc1            #56  <Float 4.007502E+07F>
	//    5   12:putstatic       #58  <Field float y>
	//    6   15:sipush          256
	//    7   18:putstatic       #60  <Field int z>
	//    8   21:bipush          20
	//    9   23:putstatic       #62  <Field int A>
	//   10   26:ldc2w           #63  <Double 10000000000D>
	//   11   29:putstatic       #66  <Field double B>
	//*  12   32:return          
	}
}
