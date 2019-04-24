// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.RemoteException;
import com.amap.api.maps.model.*;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import java.nio.FloatBuffer;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			df, hm, fd, s, 
//			ej, ez, em

public class dm
	implements df
{

	public dm(s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		c = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #71  <Field float c>
		d = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #73  <Field boolean d>
		j = ((List) (new Vector()));
	//    8   14:aload_0         
	//    9   15:new             #75  <Class Vector>
	//   10   18:dup             
	//   11   19:invokespecial   #76  <Method void Vector()>
	//   12   22:putfield        #78  <Field List j>
		k = ((List) (new Vector()));
	//   13   25:aload_0         
	//   14   26:new             #75  <Class Vector>
	//   15   29:dup             
	//   16   30:invokespecial   #76  <Method void Vector()>
	//   17   33:putfield        #80  <Field List k>
		o = 0;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #82  <Field int o>
		p = 0;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #84  <Field int p>
		q = false;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #86  <Field boolean q>
		r = 0.0F;
	//   27   51:aload_0         
	//   28   52:fconst_0        
	//   29   53:putfield        #88  <Field float r>
		s = new Object();
	//   30   56:aload_0         
	//   31   57:new             #4   <Class Object>
	//   32   60:dup             
	//   33   61:invokespecial   #69  <Method void Object()>
	//   34   64:putfield        #90  <Field Object s>
		a = null;
	//   35   67:aload_0         
	//   36   68:aconst_null     
	//   37   69:putfield        #92  <Field Rect a>
		t = 0.0F;
	//   38   72:aload_0         
	//   39   73:fconst_0        
	//   40   74:putfield        #94  <Field float t>
		b = s1;
	//   41   77:aload_0         
	//   42   78:aload_1         
	//   43   79:putfield        #96  <Field s b>
		try
		{
			e = getId();
	//   44   82:aload_0         
	//   45   83:aload_0         
	//   46   84:invokevirtual   #100 <Method String getId()>
	//   47   87:putfield        #102 <Field String e>
			return;
	//   48   90:return          
		}
		// Misplaced declaration of an exception variable
		catch(s s1)
	//*  49   91:astore_1        
		{
			hm.c(((Throwable) (s1)), "PolygonDelegateImp", "create");
	//   50   92:aload_1         
	//   51   93:ldc1            #104 <String "PolygonDelegateImp">
	//   52   95:ldc1            #106 <String "create">
	//   53   97:invokestatic    #111 <Method void hm.c(Throwable, String, String)>
		}
		((RemoteException) (s1)).printStackTrace();
	//   54  100:aload_1         
	//   55  101:invokevirtual   #114 <Method void RemoteException.printStackTrace()>
	//   56  104:return          
	}

	private float a(double d1)
	{
		return (float)((Math.cos((3.1415926535897931D * d1) / 180D) * (double)v) / (double)(w << x));
	//    0    0:ldc2w           #116 <Double 3.1415926535897931D>
	//    1    3:dload_1         
	//    2    4:dmul            
	//    3    5:ldc2w           #118 <Double 180D>
	//    4    8:ddiv            
	//    5    9:invokestatic    #125 <Method double Math.cos(double)>
	//    6   12:getstatic       #54  <Field float v>
	//    7   15:f2d             
	//    8   16:dmul            
	//    9   17:getstatic       #56  <Field int w>
	//   10   20:getstatic       #58  <Field int x>
	//   11   23:ishl            
	//   12   24:i2d             
	//   13   25:ddiv            
	//   14   26:d2f             
	//   15   27:freturn         
	}

	private void a(List list)
		throws RemoteException
	{
		com.amap.api.maps.model.LatLngBounds.Builder builder = LatLngBounds.builder();
	//    0    0:invokestatic    #132 <Method com.amap.api.maps.model.LatLngBounds$Builder LatLngBounds.builder()>
	//    1    3:astore          4
		if(a == null)
	//*   2    5:aload_0         
	//*   3    6:getfield        #92  <Field Rect a>
	//*   4    9:ifnonnull       23
			a = new Rect();
	//    5   12:aload_0         
	//    6   13:new             #134 <Class Rect>
	//    7   16:dup             
	//    8   17:invokespecial   #135 <Method void Rect()>
	//    9   20:putfield        #92  <Field Rect a>
		fd.a(a);
	//   10   23:aload_0         
	//   11   24:getfield        #92  <Field Rect a>
	//   12   27:invokestatic    #140 <Method void fd.a(Rect)>
		j.clear();
	//   13   30:aload_0         
	//   14   31:getfield        #78  <Field List j>
	//   15   34:invokeinterface #145 <Method void List.clear()>
		if(list != null)
	//*  16   39:aload_1         
	//*  17   40:ifnull          227
		{
			Object obj = null;
	//   18   43:aconst_null     
	//   19   44:astore_3        
			Iterator iterator = list.iterator();
	//   20   45:aload_1         
	//   21   46:invokeinterface #149 <Method Iterator List.iterator()>
	//   22   51:astore          5
			list = ((List) (obj));
	//   23   53:aload_3         
	//   24   54:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
	//   25   55:aload           5
	//   26   57:invokeinterface #155 <Method boolean Iterator.hasNext()>
	//   27   62:ifeq            147
				LatLng latlng = (LatLng)iterator.next();
	//   28   65:aload           5
	//   29   67:invokeinterface #159 <Method Object Iterator.next()>
	//   30   72:checkcast       #161 <Class LatLng>
	//   31   75:astore_3        
				if(!latlng.equals(((Object) (list))))
	//*  32   76:aload_3         
	//*  33   77:aload_1         
	//*  34   78:invokevirtual   #165 <Method boolean LatLng.equals(Object)>
	//*  35   81:ifeq            87
	//*  36   84:goto            55
				{
					list = ((List) (IPoint.obtain()));
	//   37   87:invokestatic    #171 <Method IPoint IPoint.obtain()>
	//   38   90:astore_1        
					b.a(latlng.latitude, latlng.longitude, ((IPoint) (list)));
	//   39   91:aload_0         
	//   40   92:getfield        #96  <Field s b>
	//   41   95:aload_3         
	//   42   96:getfield        #174 <Field double LatLng.latitude>
	//   43   99:aload_3         
	//   44  100:getfield        #177 <Field double LatLng.longitude>
	//   45  103:aload_1         
	//   46  104:invokeinterface #182 <Method void s.a(double, double, IPoint)>
					j.add(((Object) (list)));
	//   47  109:aload_0         
	//   48  110:getfield        #78  <Field List j>
	//   49  113:aload_1         
	//   50  114:invokeinterface #185 <Method boolean List.add(Object)>
	//   51  119:pop             
					fd.b(a, ((IPoint) (list)).x, ((IPoint) (list)).y);
	//   52  120:aload_0         
	//   53  121:getfield        #92  <Field Rect a>
	//   54  124:aload_1         
	//   55  125:getfield        #186 <Field int IPoint.x>
	//   56  128:aload_1         
	//   57  129:getfield        #188 <Field int IPoint.y>
	//   58  132:invokestatic    #191 <Method void fd.b(Rect, int, int)>
					builder.include(latlng);
	//   59  135:aload           4
	//   60  137:aload_3         
	//   61  138:invokevirtual   #197 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   62  141:pop             
					list = ((List) (latlng));
	//   63  142:aload_3         
	//   64  143:astore_1        
				}
			} while(true);
	//   65  144:goto            55
			int i1 = j.size();
	//   66  147:aload_0         
	//   67  148:getfield        #78  <Field List j>
	//   68  151:invokeinterface #201 <Method int List.size()>
	//   69  156:istore_2        
			if(i1 > 1)
	//*  70  157:iload_2         
	//*  71  158:iconst_1        
	//*  72  159:icmple          227
			{
				list = ((List) ((IPoint)j.get(0)));
	//   73  162:aload_0         
	//   74  163:getfield        #78  <Field List j>
	//   75  166:iconst_0        
	//   76  167:invokeinterface #205 <Method Object List.get(int)>
	//   77  172:checkcast       #167 <Class IPoint>
	//   78  175:astore_1        
				IPoint ipoint = (IPoint)j.get(i1 - 1);
	//   79  176:aload_0         
	//   80  177:getfield        #78  <Field List j>
	//   81  180:iload_2         
	//   82  181:iconst_1        
	//   83  182:isub            
	//   84  183:invokeinterface #205 <Method Object List.get(int)>
	//   85  188:checkcast       #167 <Class IPoint>
	//   86  191:astore_3        
				if(((IPoint) (list)).x == ipoint.x && ((IPoint) (list)).y == ipoint.y)
	//*  87  192:aload_1         
	//*  88  193:getfield        #186 <Field int IPoint.x>
	//*  89  196:aload_3         
	//*  90  197:getfield        #186 <Field int IPoint.x>
	//*  91  200:icmpne          227
	//*  92  203:aload_1         
	//*  93  204:getfield        #188 <Field int IPoint.y>
	//*  94  207:aload_3         
	//*  95  208:getfield        #188 <Field int IPoint.y>
	//*  96  211:icmpne          227
					j.remove(i1 - 1);
	//   97  214:aload_0         
	//   98  215:getfield        #78  <Field List j>
	//   99  218:iload_2         
	//  100  219:iconst_1        
	//  101  220:isub            
	//  102  221:invokeinterface #208 <Method Object List.remove(int)>
	//  103  226:pop             
			}
		}
		a.sort();
	//  104  227:aload_0         
	//  105  228:getfield        #92  <Field Rect a>
	//  106  231:invokevirtual   #211 <Method void Rect.sort()>
		if(m != null)
	//* 107  234:aload_0         
	//* 108  235:getfield        #213 <Field FloatBuffer m>
	//* 109  238:ifnull          249
			m.clear();
	//  110  241:aload_0         
	//  111  242:getfield        #213 <Field FloatBuffer m>
	//  112  245:invokevirtual   #218 <Method java.nio.Buffer FloatBuffer.clear()>
	//  113  248:pop             
		if(n != null)
	//* 114  249:aload_0         
	//* 115  250:getfield        #220 <Field FloatBuffer n>
	//* 116  253:ifnull          264
			n.clear();
	//  117  256:aload_0         
	//  118  257:getfield        #220 <Field FloatBuffer n>
	//  119  260:invokevirtual   #218 <Method java.nio.Buffer FloatBuffer.clear()>
	//  120  263:pop             
		if(fd.a(j, 0, j.size()))
	//* 121  264:aload_0         
	//* 122  265:getfield        #78  <Field List j>
	//* 123  268:iconst_0        
	//* 124  269:aload_0         
	//* 125  270:getfield        #78  <Field List j>
	//* 126  273:invokeinterface #201 <Method int List.size()>
	//* 127  278:invokestatic    #223 <Method boolean fd.a(List, int, int)>
	//* 128  281:ifeq            291
			Collections.reverse(j);
	//  129  284:aload_0         
	//  130  285:getfield        #78  <Field List j>
	//  131  288:invokestatic    #228 <Method void Collections.reverse(List)>
		o = 0;
	//  132  291:aload_0         
	//  133  292:iconst_0        
	//  134  293:putfield        #82  <Field int o>
		p = 0;
	//  135  296:aload_0         
	//  136  297:iconst_0        
	//  137  298:putfield        #84  <Field int p>
		b.setRunLowFrame(false);
	//  138  301:aload_0         
	//  139  302:getfield        #96  <Field s b>
	//  140  305:iconst_0        
	//  141  306:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
	//  142  311:return          
	}

	private void a(List list, int i1, int j1)
		throws RemoteException
	{
		if(list.size() < 2)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #201 <Method int List.size()>
	//*   2    6:iconst_2        
	//*   3    7:icmpge          11
			return;
	//    4   10:return          
		float af[] = new float[list.size() * 3];
	//    5   11:aload_1         
	//    6   12:invokeinterface #201 <Method int List.size()>
	//    7   17:iconst_3        
	//    8   18:imul            
	//    9   19:newarray        float[]
	//   10   21:astore          8
		IPoint aipoint[] = new IPoint[list.size()];
	//   11   23:aload_1         
	//   12   24:invokeinterface #201 <Method int List.size()>
	//   13   29:anewarray       IPoint[]
	//   14   32:astore          9
		int k1 = 0;
	//   15   34:iconst_0        
	//   16   35:istore          4
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*  17   37:aload_1         
	//*  18   38:invokeinterface #149 <Method Iterator List.iterator()>
	//*  19   43:astore_1        
	//*  20   44:aload_1         
	//*  21   45:invokeinterface #155 <Method boolean Iterator.hasNext()>
	//*  22   50:ifeq            122
		{
			IPoint ipoint = (IPoint)((Iterator) (list)).next();
	//   23   53:aload_1         
	//   24   54:invokeinterface #159 <Method Object Iterator.next()>
	//   25   59:checkcast       #167 <Class IPoint>
	//   26   62:astore          7
			af[k1 * 3] = ipoint.x - i1;
	//   27   64:aload           8
	//   28   66:iload           4
	//   29   68:iconst_3        
	//   30   69:imul            
	//   31   70:aload           7
	//   32   72:getfield        #186 <Field int IPoint.x>
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
	//   44   89:getfield        #188 <Field int IPoint.y>
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
	//   67  124:invokestatic    #239 <Method IPoint[] a(IPoint[])>
	//   68  127:astore          7
		list = ((List) (aobj));
	//   69  129:aload           7
	//   70  131:astore_1        
		if(aobj.length == 0)
	//*  71  132:aload           7
	//*  72  134:arraylength     
	//*  73  135:ifne            169
		{
			if(C == 10000000000D)
	//*  74  138:getstatic       #62  <Field double C>
	//*  75  141:ldc2w           #59  <Double 10000000000D>
	//*  76  144:dcmpl           
	//*  77  145:ifne            157
				C = 100000000D;
	//   78  148:ldc2w           #240 <Double 100000000D>
	//   79  151:putstatic       #62  <Field double C>
			else
	//*  80  154:goto            163
				C = 10000000000D;
	//   81  157:ldc2w           #59  <Double 10000000000D>
	//   82  160:putstatic       #62  <Field double C>
			list = ((List) (a(aipoint)));
	//   83  163:aload           9
	//   84  165:invokestatic    #239 <Method IPoint[] a(IPoint[])>
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
	//  111  208:getfield        #186 <Field int IPoint.x>
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
	//  123  225:getfield        #188 <Field int IPoint.y>
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
		y = aipoint.length;
	//  145  257:aload_0         
	//  146  258:aload           9
	//  147  260:arraylength     
	//  148  261:putfield        #242 <Field int y>
		z = list.length;
	//  149  264:aload_0         
	//  150  265:aload_1         
	//  151  266:arraylength     
	//  152  267:putfield        #244 <Field int z>
		A = fd.a(af);
	//  153  270:aload_0         
	//  154  271:aload           8
	//  155  273:invokestatic    #247 <Method FloatBuffer fd.a(float[])>
	//  156  276:putfield        #249 <Field FloatBuffer A>
		B = fd.a(((float []) (aobj)));
	//  157  279:aload_0         
	//  158  280:aload           7
	//  159  282:invokestatic    #247 <Method FloatBuffer fd.a(float[])>
	//  160  285:putfield        #251 <Field FloatBuffer B>
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
	//    5    6:invokevirtual   #261 <Method List PolygonHoleOptions.getPoints()>
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
	//*  15   20:invokeinterface #201 <Method int List.size()>
	//*  16   25:icmpge          66
	//*  17   28:iload_3         
	//*  18   29:istore          4
	//*  19   31:aload_1         
	//*  20   32:iload_2         
	//*  21   33:invokeinterface #205 <Method Object List.get(int)>
	//*  22   38:checkcast       #161 <Class LatLng>
	//*  23   41:aload_0         
	//*  24   42:invokevirtual   #262 <Method List getPoints()>
	//*  25   45:invokestatic    #265 <Method boolean fd.a(LatLng, List)>
	//*  26   48:istore_3        
	//*  27   49:iload_3         
	//*  28   50:ifne            59
	//*  29   53:iload_3         
	//*  30   54:istore          5
	//*  31   56:goto            66
	//*  32   59:iload_2         
	//*  33   60:iconst_1        
	//*  34   61:iadd            
	//*  35   62:istore_2        
	//*  36   63:goto            12
	//*  37   66:iload           5
	//*  38   68:ireturn         
		// Misplaced declaration of an exception variable
		catch(PolygonHoleOptions polygonholeoptions)
	//*  39   69:astore_1        
		{
			hm.c(((Throwable) (polygonholeoptions)), "PolygonDelegateImp", "isPolygonInPolygon");
	//   40   70:aload_1         
	//   41   71:ldc1            #104 <String "PolygonDelegateImp">
	//   42   73:ldc2            #267 <String "isPolygonInPolygon">
	//   43   76:invokestatic    #111 <Method void hm.c(Throwable, String, String)>
			((Throwable) (polygonholeoptions)).printStackTrace();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #268 <Method void Throwable.printStackTrace()>
			return flag1;
	//   46   83:iload           4
	//   47   85:ireturn         
		}
		i1 = 0;
		flag2 = flag;
		flag1 = flag;
		if(i1 >= ((List) (polygonholeoptions)).size())
			break; /* Loop/switch isn't completed */
		flag1 = flag;
		flag = fd.a((LatLng)((List) (polygonholeoptions)).get(i1), getPoints());
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

	private boolean a(IPoint ipoint, IPoint ipoint1)
	{
		return (float)(ipoint1.x - ipoint.x) >= r || (float)(ipoint1.x - ipoint.x) <= -r || (float)(ipoint1.y - ipoint.y) >= r || (float)(ipoint1.y - ipoint.y) <= -r;
	//    0    0:aload_2         
	//    1    1:getfield        #186 <Field int IPoint.x>
	//    2    4:aload_1         
	//    3    5:getfield        #186 <Field int IPoint.x>
	//    4    8:isub            
	//    5    9:i2f             
	//    6   10:aload_0         
	//    7   11:getfield        #88  <Field float r>
	//    8   14:fcmpl           
	//    9   15:ifge            74
	//   10   18:aload_2         
	//   11   19:getfield        #186 <Field int IPoint.x>
	//   12   22:aload_1         
	//   13   23:getfield        #186 <Field int IPoint.x>
	//   14   26:isub            
	//   15   27:i2f             
	//   16   28:aload_0         
	//   17   29:getfield        #88  <Field float r>
	//   18   32:fneg            
	//   19   33:fcmpg           
	//   20   34:ifle            74
	//   21   37:aload_2         
	//   22   38:getfield        #188 <Field int IPoint.y>
	//   23   41:aload_1         
	//   24   42:getfield        #188 <Field int IPoint.y>
	//   25   45:isub            
	//   26   46:i2f             
	//   27   47:aload_0         
	//   28   48:getfield        #88  <Field float r>
	//   29   51:fcmpl           
	//   30   52:ifge            74
	//   31   55:aload_2         
	//   32   56:getfield        #188 <Field int IPoint.y>
	//   33   59:aload_1         
	//   34   60:getfield        #188 <Field int IPoint.y>
	//   35   63:isub            
	//   36   64:i2f             
	//   37   65:aload_0         
	//   38   66:getfield        #88  <Field float r>
	//   39   69:fneg            
	//   40   70:fcmpg           
	//   41   71:ifgt            76
	//   42   74:iconst_1        
	//   43   75:ireturn         
	//   44   76:iconst_0        
	//   45   77:ireturn         
	}

	private boolean a(Rectangle rectangle)
	{
		t = b.g();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #96  <Field s b>
	//    3    5:invokeinterface #273 <Method float s.g()>
	//    4   10:putfield        #94  <Field float t>
		f();
	//    5   13:aload_0         
	//    6   14:invokespecial   #275 <Method void f()>
		if(t <= 10F)
	//*   7   17:aload_0         
	//*   8   18:getfield        #94  <Field float t>
	//*   9   21:ldc2            #276 <Float 10F>
	//*  10   24:fcmpg           
	//*  11   25:ifgt            30
			return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
		if(rectangle != null)
	//*  14   30:aload_1         
	//*  15   31:ifnull          51
		{
			boolean flag;
			try
			{
				flag = rectangle.contains(a);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:getfield        #92  <Field Rect a>
	//   19   39:invokevirtual   #282 <Method boolean Rectangle.contains(Rect)>
	//   20   42:istore_2        
			}
	//*  21   43:iload_2         
	//*  22   44:ifeq            49
	//*  23   47:iconst_0        
	//*  24   48:ireturn         
	//*  25   49:iconst_1        
	//*  26   50:ireturn         
	//*  27   51:iconst_0        
	//*  28   52:ireturn         
			// Misplaced declaration of an exception variable
			catch(Rectangle rectangle)
	//*  29   53:astore_1        
			{
				return false;
	//   30   54:iconst_0        
	//   31   55:ireturn         
			}
			return !flag;
		} else
		{
			return false;
		}
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
			ad[i1 * 2] = (double)aipoint[i1].x * C;
	//   13   16:aload_3         
	//   14   17:iload_1         
	//   15   18:iconst_2        
	//   16   19:imul            
	//   17   20:aload_0         
	//   18   21:iload_1         
	//   19   22:aaload          
	//   20   23:getfield        #186 <Field int IPoint.x>
	//   21   26:i2d             
	//   22   27:getstatic       #62  <Field double C>
	//   23   30:dmul            
	//   24   31:dastore         
			ad[i1 * 2 + 1] = (double)aipoint[i1].y * C;
	//   25   32:aload_3         
	//   26   33:iload_1         
	//   27   34:iconst_2        
	//   28   35:imul            
	//   29   36:iconst_1        
	//   30   37:iadd            
	//   31   38:aload_0         
	//   32   39:iload_1         
	//   33   40:aaload          
	//   34   41:getfield        #188 <Field int IPoint.y>
	//   35   44:i2d             
	//   36   45:getstatic       #62  <Field double C>
	//   37   48:dmul            
	//   38   49:dastore         
		}

	//   39   50:iload_1         
	//   40   51:iconst_1        
	//   41   52:iadd            
	//   42   53:istore_1        
	//*  43   54:goto            11
		aipoint = ((IPoint []) ((new ej()).a(ad)));
	//   44   57:new             #284 <Class ej>
	//   45   60:dup             
	//   46   61:invokespecial   #285 <Method void ej()>
	//   47   64:aload_3         
	//   48   65:invokevirtual   #288 <Method ez ej.a(double[])>
	//   49   68:astore_0        
		k1 = ((ez) (aipoint)).b;
	//   50   69:aload_0         
	//   51   70:getfield        #292 <Field int ez.b>
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
	//   63   90:new             #167 <Class IPoint>
	//   64   93:dup             
	//   65   94:invokespecial   #293 <Method void IPoint()>
	//   66   97:aastore         
			aipoint1[j1].x = (int)(ad[((ez) (aipoint)).a(j1) * 2] / C);
	//   67   98:aload           4
	//   68  100:iload_1         
	//   69  101:aaload          
	//   70  102:aload_3         
	//   71  103:aload_0         
	//   72  104:iload_1         
	//   73  105:invokevirtual   #296 <Method short ez.a(int)>
	//   74  108:iconst_2        
	//   75  109:imul            
	//   76  110:daload          
	//   77  111:getstatic       #62  <Field double C>
	//   78  114:ddiv            
	//   79  115:d2i             
	//   80  116:putfield        #186 <Field int IPoint.x>
			aipoint1[j1].y = (int)(ad[((ez) (aipoint)).a(j1) * 2 + 1] / C);
	//   81  119:aload           4
	//   82  121:iload_1         
	//   83  122:aaload          
	//   84  123:aload_3         
	//   85  124:aload_0         
	//   86  125:iload_1         
	//   87  126:invokevirtual   #296 <Method short ez.a(int)>
	//   88  129:iconst_2        
	//   89  130:imul            
	//   90  131:iconst_1        
	//   91  132:iadd            
	//   92  133:daload          
	//   93  134:getstatic       #62  <Field double C>
	//   94  137:ddiv            
	//   95  138:d2i             
	//   96  139:putfield        #188 <Field int IPoint.y>
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
	//    3    3:invokespecial   #298 <Method float a(double)>
	//    4    6:f2d             
	//    5    7:ddiv            
	//    6    8:dreturn         
	}

	private List b(List list)
		throws RemoteException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #301 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #302 <Method void ArrayList()>
	//    3    7:astore          4
		if(list != null)
	//*   4    9:aload_1         
	//*   5   10:ifnull          180
		{
			Object obj = null;
	//    6   13:aconst_null     
	//    7   14:astore_3        
			Iterator iterator = list.iterator();
	//    8   15:aload_1         
	//    9   16:invokeinterface #149 <Method Iterator List.iterator()>
	//   10   21:astore          5
			list = ((List) (obj));
	//   11   23:aload_3         
	//   12   24:astore_1        
			do
			{
				if(!iterator.hasNext())
					break;
	//   13   25:aload           5
	//   14   27:invokeinterface #155 <Method boolean Iterator.hasNext()>
	//   15   32:ifeq            108
				LatLng latlng = (LatLng)iterator.next();
	//   16   35:aload           5
	//   17   37:invokeinterface #159 <Method Object Iterator.next()>
	//   18   42:checkcast       #161 <Class LatLng>
	//   19   45:astore_3        
				if(!latlng.equals(((Object) (list))))
	//*  20   46:aload_3         
	//*  21   47:aload_1         
	//*  22   48:invokevirtual   #165 <Method boolean LatLng.equals(Object)>
	//*  23   51:ifeq            57
	//*  24   54:goto            25
				{
					list = ((List) (IPoint.obtain()));
	//   25   57:invokestatic    #171 <Method IPoint IPoint.obtain()>
	//   26   60:astore_1        
					b.a(latlng.latitude, latlng.longitude, ((IPoint) (list)));
	//   27   61:aload_0         
	//   28   62:getfield        #96  <Field s b>
	//   29   65:aload_3         
	//   30   66:getfield        #174 <Field double LatLng.latitude>
	//   31   69:aload_3         
	//   32   70:getfield        #177 <Field double LatLng.longitude>
	//   33   73:aload_1         
	//   34   74:invokeinterface #182 <Method void s.a(double, double, IPoint)>
					((List) (arraylist)).add(((Object) (list)));
	//   35   79:aload           4
	//   36   81:aload_1         
	//   37   82:invokeinterface #185 <Method boolean List.add(Object)>
	//   38   87:pop             
					fd.b(a, ((IPoint) (list)).x, ((IPoint) (list)).y);
	//   39   88:aload_0         
	//   40   89:getfield        #92  <Field Rect a>
	//   41   92:aload_1         
	//   42   93:getfield        #186 <Field int IPoint.x>
	//   43   96:aload_1         
	//   44   97:getfield        #188 <Field int IPoint.y>
	//   45  100:invokestatic    #191 <Method void fd.b(Rect, int, int)>
					list = ((List) (latlng));
	//   46  103:aload_3         
	//   47  104:astore_1        
				}
			} while(true);
	//   48  105:goto            25
			int i1 = ((List) (arraylist)).size();
	//   49  108:aload           4
	//   50  110:invokeinterface #201 <Method int List.size()>
	//   51  115:istore_2        
			if(i1 > 1)
	//*  52  116:iload_2         
	//*  53  117:iconst_1        
	//*  54  118:icmple          180
			{
				list = ((List) ((IPoint)((List) (arraylist)).get(0)));
	//   55  121:aload           4
	//   56  123:iconst_0        
	//   57  124:invokeinterface #205 <Method Object List.get(int)>
	//   58  129:checkcast       #167 <Class IPoint>
	//   59  132:astore_1        
				IPoint ipoint = (IPoint)((List) (arraylist)).get(i1 - 1);
	//   60  133:aload           4
	//   61  135:iload_2         
	//   62  136:iconst_1        
	//   63  137:isub            
	//   64  138:invokeinterface #205 <Method Object List.get(int)>
	//   65  143:checkcast       #167 <Class IPoint>
	//   66  146:astore_3        
				if(((IPoint) (list)).x == ipoint.x && ((IPoint) (list)).y == ipoint.y)
	//*  67  147:aload_1         
	//*  68  148:getfield        #186 <Field int IPoint.x>
	//*  69  151:aload_3         
	//*  70  152:getfield        #186 <Field int IPoint.x>
	//*  71  155:icmpne          180
	//*  72  158:aload_1         
	//*  73  159:getfield        #188 <Field int IPoint.y>
	//*  74  162:aload_3         
	//*  75  163:getfield        #188 <Field int IPoint.y>
	//*  76  166:icmpne          180
					((List) (arraylist)).remove(i1 - 1);
	//   77  169:aload           4
	//   78  171:iload_2         
	//   79  172:iconst_1        
	//   80  173:isub            
	//   81  174:invokeinterface #208 <Method Object List.remove(int)>
	//   82  179:pop             
			}
		}
		if(fd.a(((List) (arraylist)), 0, ((List) (arraylist)).size()))
	//*  83  180:aload           4
	//*  84  182:iconst_0        
	//*  85  183:aload           4
	//*  86  185:invokeinterface #201 <Method int List.size()>
	//*  87  190:invokestatic    #223 <Method boolean fd.a(List, int, int)>
	//*  88  193:ifeq            201
			Collections.reverse(((List) (arraylist)));
	//   89  196:aload           4
	//   90  198:invokestatic    #228 <Method void Collections.reverse(List)>
		return ((List) (arraylist));
	//   91  201:aload           4
	//   92  203:areturn         
	}

	private void b()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field s b>
	//*   2    4:ifnull          24
			u = (ds.e)b.t(3);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #96  <Field s b>
	//    6   12:iconst_3        
	//    7   13:invokeinterface #306 <Method dr s.t(int)>
	//    8   18:checkcast       #308 <Class ds$e>
	//    9   21:putfield        #310 <Field ds$e u>
	//   10   24:return          
	}

	private void b(List list, int i1, int j1)
		throws RemoteException
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #275 <Method void f()>
		ArrayList arraylist = new ArrayList();
	//    2    4:new             #301 <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #302 <Method void ArrayList()>
	//    5   11:astore          10
		int j2 = list.size();
	//    6   13:aload_1         
	//    7   14:invokeinterface #201 <Method int List.size()>
	//    8   19:istore          5
		if(j2 < 2)
	//*   9   21:iload           5
	//*  10   23:iconst_2        
	//*  11   24:icmpge          28
			return;
	//   12   27:return          
		IPoint ipoint = (IPoint)list.get(0);
	//   13   28:aload_1         
	//   14   29:iconst_0        
	//   15   30:invokeinterface #205 <Method Object List.get(int)>
	//   16   35:checkcast       #167 <Class IPoint>
	//   17   38:astore          7
		arraylist.add(((Object) (ipoint)));
	//   18   40:aload           10
	//   19   42:aload           7
	//   20   44:invokevirtual   #311 <Method boolean ArrayList.add(Object)>
	//   21   47:pop             
		for(int k1 = 1; k1 < j2 - 1;)
	//*  22   48:iconst_1        
	//*  23   49:istore          4
	//*  24   51:iload           4
	//*  25   53:iload           5
	//*  26   55:iconst_1        
	//*  27   56:isub            
	//*  28   57:icmpge          113
		{
			IPoint ipoint3 = (IPoint)list.get(k1);
	//   29   60:aload_1         
	//   30   61:iload           4
	//   31   63:invokeinterface #205 <Method Object List.get(int)>
	//   32   68:checkcast       #167 <Class IPoint>
	//   33   71:astore          9
			IPoint ipoint2 = ipoint;
	//   34   73:aload           7
	//   35   75:astore          8
			if(a(ipoint, ipoint3))
	//*  36   77:aload_0         
	//*  37   78:aload           7
	//*  38   80:aload           9
	//*  39   82:invokespecial   #313 <Method boolean a(IPoint, IPoint)>
	//*  40   85:ifeq            100
			{
				arraylist.add(((Object) (ipoint3)));
	//   41   88:aload           10
	//   42   90:aload           9
	//   43   92:invokevirtual   #311 <Method boolean ArrayList.add(Object)>
	//   44   95:pop             
				ipoint2 = ipoint3;
	//   45   96:aload           9
	//   46   98:astore          8
			}
			k1++;
	//   47  100:iload           4
	//   48  102:iconst_1        
	//   49  103:iadd            
	//   50  104:istore          4
			ipoint = ipoint2;
	//   51  106:aload           8
	//   52  108:astore          7
		}

	//*  53  110:goto            51
		arraylist.add(list.get(j2 - 1));
	//   54  113:aload           10
	//   55  115:aload_1         
	//   56  116:iload           5
	//   57  118:iconst_1        
	//   58  119:isub            
	//   59  120:invokeinterface #205 <Method Object List.get(int)>
	//   60  125:invokevirtual   #311 <Method boolean ArrayList.add(Object)>
	//   61  128:pop             
		float af[] = new float[arraylist.size() * 3];
	//   62  129:aload           10
	//   63  131:invokevirtual   #314 <Method int ArrayList.size()>
	//   64  134:iconst_3        
	//   65  135:imul            
	//   66  136:newarray        float[]
	//   67  138:astore          8
		IPoint aipoint[] = new IPoint[arraylist.size()];
	//   68  140:aload           10
	//   69  142:invokevirtual   #314 <Method int ArrayList.size()>
	//   70  145:anewarray       IPoint[]
	//   71  148:astore          9
		int l1 = 0;
	//   72  150:iconst_0        
	//   73  151:istore          4
		for(list = ((List) (arraylist.iterator())); ((Iterator) (list)).hasNext();)
	//*  74  153:aload           10
	//*  75  155:invokevirtual   #315 <Method Iterator ArrayList.iterator()>
	//*  76  158:astore_1        
	//*  77  159:aload_1         
	//*  78  160:invokeinterface #155 <Method boolean Iterator.hasNext()>
	//*  79  165:ifeq            237
		{
			IPoint ipoint1 = (IPoint)((Iterator) (list)).next();
	//   80  168:aload_1         
	//   81  169:invokeinterface #159 <Method Object Iterator.next()>
	//   82  174:checkcast       #167 <Class IPoint>
	//   83  177:astore          7
			af[l1 * 3] = ipoint1.x - i1;
	//   84  179:aload           8
	//   85  181:iload           4
	//   86  183:iconst_3        
	//   87  184:imul            
	//   88  185:aload           7
	//   89  187:getfield        #186 <Field int IPoint.x>
	//   90  190:iload_2         
	//   91  191:isub            
	//   92  192:i2f             
	//   93  193:fastore         
			af[l1 * 3 + 1] = ipoint1.y - j1;
	//   94  194:aload           8
	//   95  196:iload           4
	//   96  198:iconst_3        
	//   97  199:imul            
	//   98  200:iconst_1        
	//   99  201:iadd            
	//  100  202:aload           7
	//  101  204:getfield        #188 <Field int IPoint.y>
	//  102  207:iload_3         
	//  103  208:isub            
	//  104  209:i2f             
	//  105  210:fastore         
			af[l1 * 3 + 2] = 0.0F;
	//  106  211:aload           8
	//  107  213:iload           4
	//  108  215:iconst_3        
	//  109  216:imul            
	//  110  217:iconst_2        
	//  111  218:iadd            
	//  112  219:fconst_0        
	//  113  220:fastore         
			aipoint[l1] = ipoint1;
	//  114  221:aload           9
	//  115  223:iload           4
	//  116  225:aload           7
	//  117  227:aastore         
			l1++;
	//  118  228:iload           4
	//  119  230:iconst_1        
	//  120  231:iadd            
	//  121  232:istore          4
		}

	//* 122  234:goto            159
		Object aobj[] = ((Object []) (a(aipoint)));
	//  123  237:aload           9
	//  124  239:invokestatic    #239 <Method IPoint[] a(IPoint[])>
	//  125  242:astore          7
		list = ((List) (aobj));
	//  126  244:aload           7
	//  127  246:astore_1        
		if(aobj.length == 0)
	//* 128  247:aload           7
	//* 129  249:arraylength     
	//* 130  250:ifne            284
		{
			if(C == 10000000000D)
	//* 131  253:getstatic       #62  <Field double C>
	//* 132  256:ldc2w           #59  <Double 10000000000D>
	//* 133  259:dcmpl           
	//* 134  260:ifne            272
				C = 100000000D;
	//  135  263:ldc2w           #240 <Double 100000000D>
	//  136  266:putstatic       #62  <Field double C>
			else
	//* 137  269:goto            278
				C = 10000000000D;
	//  138  272:ldc2w           #59  <Double 10000000000D>
	//  139  275:putstatic       #62  <Field double C>
			list = ((List) (a(aipoint)));
	//  140  278:aload           9
	//  141  280:invokestatic    #239 <Method IPoint[] a(IPoint[])>
	//  142  283:astore_1        
		}
		aobj = ((Object []) (new float[list.length * 3]));
	//  143  284:aload_1         
	//  144  285:arraylength     
	//  145  286:iconst_3        
	//  146  287:imul            
	//  147  288:newarray        float[]
	//  148  290:astore          7
		j2 = 0;
	//  149  292:iconst_0        
	//  150  293:istore          5
		int k2 = list.length;
	//  151  295:aload_1         
	//  152  296:arraylength     
	//  153  297:istore          6
		for(int i2 = 0; i2 < k2; i2++)
	//* 154  299:iconst_0        
	//* 155  300:istore          4
	//* 156  302:iload           4
	//* 157  304:iload           6
	//* 158  306:icmpge          372
		{
			Object obj = list[i2];
	//  159  309:aload_1         
	//  160  310:iload           4
	//  161  312:aaload          
	//  162  313:astore          10
			aobj[j2 * 3] = ((IPoint) (obj)).x - i1;
	//  163  315:aload           7
	//  164  317:iload           5
	//  165  319:iconst_3        
	//  166  320:imul            
	//  167  321:aload           10
	//  168  323:getfield        #186 <Field int IPoint.x>
	//  169  326:iload_2         
	//  170  327:isub            
	//  171  328:i2f             
	//  172  329:fastore         
			aobj[j2 * 3 + 1] = ((IPoint) (obj)).y - j1;
	//  173  330:aload           7
	//  174  332:iload           5
	//  175  334:iconst_3        
	//  176  335:imul            
	//  177  336:iconst_1        
	//  178  337:iadd            
	//  179  338:aload           10
	//  180  340:getfield        #188 <Field int IPoint.y>
	//  181  343:iload_3         
	//  182  344:isub            
	//  183  345:i2f             
	//  184  346:fastore         
			aobj[j2 * 3 + 2] = 0.0F;
	//  185  347:aload           7
	//  186  349:iload           5
	//  187  351:iconst_3        
	//  188  352:imul            
	//  189  353:iconst_2        
	//  190  354:iadd            
	//  191  355:fconst_0        
	//  192  356:fastore         
			j2++;
	//  193  357:iload           5
	//  194  359:iconst_1        
	//  195  360:iadd            
	//  196  361:istore          5
		}

	//  197  363:iload           4
	//  198  365:iconst_1        
	//  199  366:iadd            
	//  200  367:istore          4
	//* 201  369:goto            302
		o = aipoint.length;
	//  202  372:aload_0         
	//  203  373:aload           9
	//  204  375:arraylength     
	//  205  376:putfield        #82  <Field int o>
		p = list.length;
	//  206  379:aload_0         
	//  207  380:aload_1         
	//  208  381:arraylength     
	//  209  382:putfield        #84  <Field int p>
		m = fd.a(af);
	//  210  385:aload_0         
	//  211  386:aload           8
	//  212  388:invokestatic    #247 <Method FloatBuffer fd.a(float[])>
	//  213  391:putfield        #213 <Field FloatBuffer m>
		n = fd.a(((float []) (aobj)));
	//  214  394:aload_0         
	//  215  395:aload           7
	//  216  397:invokestatic    #247 <Method FloatBuffer fd.a(float[])>
	//  217  400:putfield        #220 <Field FloatBuffer n>
	//  218  403:return          
	}

	private boolean b(CircleHoleOptions circleholeoptions)
	{
		boolean flag;
		if(fd.b(getPoints(), circleholeoptions))
			break MISSING_BLOCK_LABEL_43;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #262 <Method List getPoints()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #319 <Method boolean fd.b(List, CircleHoleOptions)>
	//    4    8:ifne            26
		flag = contains(circleholeoptions.getCenter());
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #325 <Method LatLng CircleHoleOptions.getCenter()>
	//    8   16:invokevirtual   #328 <Method boolean contains(LatLng)>
	//    9   19:istore_2        
		if(flag)
	//*  10   20:iload_2         
	//*  11   21:ifeq            26
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		break MISSING_BLOCK_LABEL_43;
	//   14   26:goto            43
		circleholeoptions;
	//   15   29:astore_1        
		hm.c(((Throwable) (circleholeoptions)), "PolygonDelegateImp", "isCircleInPolygon");
	//   16   30:aload_1         
	//   17   31:ldc1            #104 <String "PolygonDelegateImp">
	//   18   33:ldc2            #330 <String "isCircleInPolygon">
	//   19   36:invokestatic    #111 <Method void hm.c(Throwable, String, String)>
		((Throwable) (circleholeoptions)).printStackTrace();
	//   20   39:aload_1         
	//   21   40:invokevirtual   #268 <Method void Throwable.printStackTrace()>
		return false;
	//   22   43:iconst_0        
	//   23   44:ireturn         
	}

	private void d()
		throws RemoteException
	{
		MapConfig mapconfig = b.getMapConfig();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field s b>
	//    2    4:invokeinterface #334 <Method MapConfig s.getMapConfig()>
	//    3    9:astore_2        
		if(k != null && k.size() > 0)
	//*   4   10:aload_0         
	//*   5   11:getfield        #80  <Field List k>
	//*   6   14:ifnull          342
	//*   7   17:aload_0         
	//*   8   18:getfield        #80  <Field List k>
	//*   9   21:invokeinterface #201 <Method int List.size()>
	//*  10   26:ifle            342
		{
			GLES20.glClearStencil(0);
	//   11   29:iconst_0        
	//   12   30:invokestatic    #340 <Method void GLES20.glClearStencil(int)>
			GLES20.glStencilMask(255);
	//   13   33:sipush          255
	//   14   36:invokestatic    #343 <Method void GLES20.glStencilMask(int)>
			GLES20.glClear(1024);
	//   15   39:sipush          1024
	//   16   42:invokestatic    #346 <Method void GLES20.glClear(int)>
			GLES20.glFlush();
	//   17   45:invokestatic    #349 <Method void GLES20.glFlush()>
			GLES20.glEnable(2960);
	//   18   48:sipush          2960
	//   19   51:invokestatic    #352 <Method void GLES20.glEnable(int)>
			GLES20.glColorMask(false, false, false, false);
	//   20   54:iconst_0        
	//   21   55:iconst_0        
	//   22   56:iconst_0        
	//   23   57:iconst_0        
	//   24   58:invokestatic    #356 <Method void GLES20.glColorMask(boolean, boolean, boolean, boolean)>
			GLES20.glStencilFunc(512, 1, 255);
	//   25   61:sipush          512
	//   26   64:iconst_1        
	//   27   65:sipush          255
	//   28   68:invokestatic    #360 <Method void GLES20.glStencilFunc(int, int, int)>
			GLES20.glStencilOp(7681, 7680, 7680);
	//   29   71:sipush          7681
	//   30   74:sipush          7680
	//   31   77:sipush          7680
	//   32   80:invokestatic    #363 <Method void GLES20.glStencilOp(int, int, int)>
			for(int i1 = 0; i1 < k.size(); i1++)
	//*  33   83:iconst_0        
	//*  34   84:istore_1        
	//*  35   85:iload_1         
	//*  36   86:aload_0         
	//*  37   87:getfield        #80  <Field List k>
	//*  38   90:invokeinterface #201 <Method int List.size()>
	//*  39   95:icmpge          321
			{
				BaseHoleOptions baseholeoptions = (BaseHoleOptions)k.get(i1);
	//   40   98:aload_0         
	//   41   99:getfield        #80  <Field List k>
	//   42  102:iload_1         
	//   43  103:invokeinterface #205 <Method Object List.get(int)>
	//   44  108:checkcast       #365 <Class BaseHoleOptions>
	//   45  111:astore_3        
				if(baseholeoptions instanceof PolygonHoleOptions)
	//*  46  112:aload_3         
	//*  47  113:instanceof      #257 <Class PolygonHoleOptions>
	//*  48  116:ifeq            145
					a(b(((PolygonHoleOptions)baseholeoptions).getPoints()), mapconfig.getSX(), mapconfig.getSY());
	//   49  119:aload_0         
	//   50  120:aload_0         
	//   51  121:aload_3         
	//   52  122:checkcast       #257 <Class PolygonHoleOptions>
	//   53  125:invokevirtual   #261 <Method List PolygonHoleOptions.getPoints()>
	//   54  128:invokespecial   #367 <Method List b(List)>
	//   55  131:aload_2         
	//   56  132:invokevirtual   #372 <Method int MapConfig.getSX()>
	//   57  135:aload_2         
	//   58  136:invokevirtual   #375 <Method int MapConfig.getSY()>
	//   59  139:invokespecial   #377 <Method void a(List, int, int)>
				else
	//*  60  142:goto            173
				if(baseholeoptions instanceof CircleHoleOptions)
	//*  61  145:aload_3         
	//*  62  146:instanceof      #321 <Class CircleHoleOptions>
	//*  63  149:ifeq            173
				{
					CircleHoleOptions circleholeoptions = (CircleHoleOptions)baseholeoptions;
	//   64  152:aload_3         
	//   65  153:checkcast       #321 <Class CircleHoleOptions>
	//   66  156:astore          4
					b.f();
	//   67  158:aload_0         
	//   68  159:getfield        #96  <Field s b>
	//   69  162:invokeinterface #378 <Method void s.f()>
					a(circleholeoptions);
	//   70  167:aload_0         
	//   71  168:aload           4
	//   72  170:invokevirtual   #381 <Method void a(CircleHoleOptions)>
				}
				if(A == null || y <= 0)
					continue;
	//   73  173:aload_0         
	//   74  174:getfield        #249 <Field FloatBuffer A>
	//   75  177:ifnull          314
	//   76  180:aload_0         
	//   77  181:getfield        #242 <Field int y>
	//   78  184:ifle            314
				if(u == null || u.c())
	//*  79  187:aload_0         
	//*  80  188:getfield        #310 <Field ds$e u>
	//*  81  191:ifnull          204
	//*  82  194:aload_0         
	//*  83  195:getfield        #310 <Field ds$e u>
	//*  84  198:invokevirtual   #383 <Method boolean ds$e.c()>
	//*  85  201:ifeq            208
					b();
	//   86  204:aload_0         
	//   87  205:invokespecial   #385 <Method void b()>
				if(baseholeoptions instanceof PolygonHoleOptions)
	//*  88  208:aload_3         
	//*  89  209:instanceof      #257 <Class PolygonHoleOptions>
	//*  90  212:ifeq            259
				{
					em.a(u, -1, h, A, f, B, y, z, b.x());
	//   91  215:aload_0         
	//   92  216:getfield        #310 <Field ds$e u>
	//   93  219:iconst_m1       
	//   94  220:aload_0         
	//   95  221:getfield        #387 <Field int h>
	//   96  224:aload_0         
	//   97  225:getfield        #249 <Field FloatBuffer A>
	//   98  228:aload_0         
	//   99  229:getfield        #389 <Field float f>
	//  100  232:aload_0         
	//  101  233:getfield        #251 <Field FloatBuffer B>
	//  102  236:aload_0         
	//  103  237:getfield        #242 <Field int y>
	//  104  240:aload_0         
	//  105  241:getfield        #244 <Field int z>
	//  106  244:aload_0         
	//  107  245:getfield        #96  <Field s b>
	//  108  248:invokeinterface #392 <Method float[] s.x()>
	//  109  253:invokestatic    #397 <Method void em.a(ds$e, int, int, FloatBuffer, float, FloatBuffer, int, int, float[])>
					continue;
	//  110  256:goto            314
				}
				if(baseholeoptions instanceof CircleHoleOptions)
	//* 111  259:aload_3         
	//* 112  260:instanceof      #321 <Class CircleHoleOptions>
	//* 113  263:ifeq            314
					em.a(u, Color.argb(200, 80, 1, 1), Color.argb(200, 1, 1, 1), A, 5F, y, b.x(), 0.0F, 0);
	//  114  266:aload_0         
	//  115  267:getfield        #310 <Field ds$e u>
	//  116  270:sipush          200
	//  117  273:bipush          80
	//  118  275:iconst_1        
	//  119  276:iconst_1        
	//  120  277:invokestatic    #403 <Method int Color.argb(int, int, int, int)>
	//  121  280:sipush          200
	//  122  283:iconst_1        
	//  123  284:iconst_1        
	//  124  285:iconst_1        
	//  125  286:invokestatic    #403 <Method int Color.argb(int, int, int, int)>
	//  126  289:aload_0         
	//  127  290:getfield        #249 <Field FloatBuffer A>
	//  128  293:ldc2            #404 <Float 5F>
	//  129  296:aload_0         
	//  130  297:getfield        #242 <Field int y>
	//  131  300:aload_0         
	//  132  301:getfield        #96  <Field s b>
	//  133  304:invokeinterface #392 <Method float[] s.x()>
	//  134  309:fconst_0        
	//  135  310:iconst_0        
	//  136  311:invokestatic    #407 <Method void em.a(ds$e, int, int, FloatBuffer, float, int, float[], float, int)>
			}

	//  137  314:iload_1         
	//  138  315:iconst_1        
	//  139  316:iadd            
	//  140  317:istore_1        
	//* 141  318:goto            85
			GLES20.glColorMask(true, true, true, true);
	//  142  321:iconst_1        
	//  143  322:iconst_1        
	//  144  323:iconst_1        
	//  145  324:iconst_1        
	//  146  325:invokestatic    #356 <Method void GLES20.glColorMask(boolean, boolean, boolean, boolean)>
			GLES20.glStencilFunc(517, 1, 255);
	//  147  328:sipush          517
	//  148  331:iconst_1        
	//  149  332:sipush          255
	//  150  335:invokestatic    #360 <Method void GLES20.glStencilFunc(int, int, int)>
			GLES20.glStencilMask(0);
	//  151  338:iconst_0        
	//  152  339:invokestatic    #343 <Method void GLES20.glStencilMask(int)>
		}
	//  153  342:return          
	}

	private void e()
		throws RemoteException
	{
		GLES20.glClearStencil(0);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #340 <Method void GLES20.glClearStencil(int)>
		GLES20.glClear(1024);
	//    2    4:sipush          1024
	//    3    7:invokestatic    #346 <Method void GLES20.glClear(int)>
		GLES20.glDisable(2960);
	//    4   10:sipush          2960
	//    5   13:invokestatic    #410 <Method void GLES20.glDisable(int)>
		MapConfig mapconfig = b.getMapConfig();
	//    6   16:aload_0         
	//    7   17:getfield        #96  <Field s b>
	//    8   20:invokeinterface #334 <Method MapConfig s.getMapConfig()>
	//    9   25:astore_2        
		if(k != null && k.size() > 0)
	//*  10   26:aload_0         
	//*  11   27:getfield        #80  <Field List k>
	//*  12   30:ifnull          270
	//*  13   33:aload_0         
	//*  14   34:getfield        #80  <Field List k>
	//*  15   37:invokeinterface #201 <Method int List.size()>
	//*  16   42:ifle            270
		{
			for(int i1 = 0; i1 < k.size(); i1++)
	//*  17   45:iconst_0        
	//*  18   46:istore_1        
	//*  19   47:iload_1         
	//*  20   48:aload_0         
	//*  21   49:getfield        #80  <Field List k>
	//*  22   52:invokeinterface #201 <Method int List.size()>
	//*  23   57:icmpge          270
			{
				BaseHoleOptions baseholeoptions = (BaseHoleOptions)k.get(i1);
	//   24   60:aload_0         
	//   25   61:getfield        #80  <Field List k>
	//   26   64:iload_1         
	//   27   65:invokeinterface #205 <Method Object List.get(int)>
	//   28   70:checkcast       #365 <Class BaseHoleOptions>
	//   29   73:astore_3        
				if(baseholeoptions instanceof PolygonHoleOptions)
	//*  30   74:aload_3         
	//*  31   75:instanceof      #257 <Class PolygonHoleOptions>
	//*  32   78:ifeq            107
					a(b(((PolygonHoleOptions)baseholeoptions).getPoints()), mapconfig.getSX(), mapconfig.getSY());
	//   33   81:aload_0         
	//   34   82:aload_0         
	//   35   83:aload_3         
	//   36   84:checkcast       #257 <Class PolygonHoleOptions>
	//   37   87:invokevirtual   #261 <Method List PolygonHoleOptions.getPoints()>
	//   38   90:invokespecial   #367 <Method List b(List)>
	//   39   93:aload_2         
	//   40   94:invokevirtual   #372 <Method int MapConfig.getSX()>
	//   41   97:aload_2         
	//   42   98:invokevirtual   #375 <Method int MapConfig.getSY()>
	//   43  101:invokespecial   #377 <Method void a(List, int, int)>
				else
	//*  44  104:goto            135
				if(baseholeoptions instanceof CircleHoleOptions)
	//*  45  107:aload_3         
	//*  46  108:instanceof      #321 <Class CircleHoleOptions>
	//*  47  111:ifeq            135
				{
					CircleHoleOptions circleholeoptions = (CircleHoleOptions)baseholeoptions;
	//   48  114:aload_3         
	//   49  115:checkcast       #321 <Class CircleHoleOptions>
	//   50  118:astore          4
					b.f();
	//   51  120:aload_0         
	//   52  121:getfield        #96  <Field s b>
	//   53  124:invokeinterface #378 <Method void s.f()>
					a(circleholeoptions);
	//   54  129:aload_0         
	//   55  130:aload           4
	//   56  132:invokevirtual   #381 <Method void a(CircleHoleOptions)>
				}
				if(A == null || y <= 0)
					continue;
	//   57  135:aload_0         
	//   58  136:getfield        #249 <Field FloatBuffer A>
	//   59  139:ifnull          263
	//   60  142:aload_0         
	//   61  143:getfield        #242 <Field int y>
	//   62  146:ifle            263
				if(u == null || u.c())
	//*  63  149:aload_0         
	//*  64  150:getfield        #310 <Field ds$e u>
	//*  65  153:ifnull          166
	//*  66  156:aload_0         
	//*  67  157:getfield        #310 <Field ds$e u>
	//*  68  160:invokevirtual   #383 <Method boolean ds$e.c()>
	//*  69  163:ifeq            170
					b();
	//   70  166:aload_0         
	//   71  167:invokespecial   #385 <Method void b()>
				if(baseholeoptions instanceof PolygonHoleOptions)
	//*  72  170:aload_3         
	//*  73  171:instanceof      #257 <Class PolygonHoleOptions>
	//*  74  174:ifeq            221
				{
					em.b(u, 0, h, A, f, B, y, z, b.x());
	//   75  177:aload_0         
	//   76  178:getfield        #310 <Field ds$e u>
	//   77  181:iconst_0        
	//   78  182:aload_0         
	//   79  183:getfield        #387 <Field int h>
	//   80  186:aload_0         
	//   81  187:getfield        #249 <Field FloatBuffer A>
	//   82  190:aload_0         
	//   83  191:getfield        #389 <Field float f>
	//   84  194:aload_0         
	//   85  195:getfield        #251 <Field FloatBuffer B>
	//   86  198:aload_0         
	//   87  199:getfield        #242 <Field int y>
	//   88  202:aload_0         
	//   89  203:getfield        #244 <Field int z>
	//   90  206:aload_0         
	//   91  207:getfield        #96  <Field s b>
	//   92  210:invokeinterface #392 <Method float[] s.x()>
	//   93  215:invokestatic    #412 <Method void em.b(ds$e, int, int, FloatBuffer, float, FloatBuffer, int, int, float[])>
					continue;
	//   94  218:goto            263
				}
				if(baseholeoptions instanceof CircleHoleOptions)
	//*  95  221:aload_3         
	//*  96  222:instanceof      #321 <Class CircleHoleOptions>
	//*  97  225:ifeq            263
					em.b(u, 0, h, A, f, y, b.x(), 1.0F, -1);
	//   98  228:aload_0         
	//   99  229:getfield        #310 <Field ds$e u>
	//  100  232:iconst_0        
	//  101  233:aload_0         
	//  102  234:getfield        #387 <Field int h>
	//  103  237:aload_0         
	//  104  238:getfield        #249 <Field FloatBuffer A>
	//  105  241:aload_0         
	//  106  242:getfield        #389 <Field float f>
	//  107  245:aload_0         
	//  108  246:getfield        #242 <Field int y>
	//  109  249:aload_0         
	//  110  250:getfield        #96  <Field s b>
	//  111  253:invokeinterface #392 <Method float[] s.x()>
	//  112  258:fconst_1        
	//  113  259:iconst_m1       
	//  114  260:invokestatic    #414 <Method void em.b(ds$e, int, int, FloatBuffer, float, int, float[], float, int)>
			}

	//  115  263:iload_1         
	//  116  264:iconst_1        
	//  117  265:iadd            
	//  118  266:istore_1        
		}
	//* 119  267:goto            47
	//  120  270:return          
	}

	private void f()
	{
		float f1 = b.g();
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field s b>
	//    2    4:invokeinterface #273 <Method float s.g()>
	//    3    9:fstore_1        
		if(j.size() > 5000)
	//*   4   10:aload_0         
	//*   5   11:getfield        #78  <Field List j>
	//*   6   14:invokeinterface #201 <Method int List.size()>
	//*   7   19:sipush          5000
	//*   8   22:icmple          99
		{
			if(f1 <= 12F)
	//*   9   25:fload_1         
	//*  10   26:ldc2            #415 <Float 12F>
	//*  11   29:fcmpg           
	//*  12   30:ifgt            80
			{
				f1 = f / 2.0F + f1 / 2.0F;
	//   13   33:aload_0         
	//   14   34:getfield        #389 <Field float f>
	//   15   37:fconst_2        
	//   16   38:fdiv            
	//   17   39:fload_1         
	//   18   40:fconst_2        
	//   19   41:fdiv            
	//   20   42:fadd            
	//   21   43:fstore_1        
				if(f1 > 200F)
	//*  22   44:fload_1         
	//*  23   45:ldc2            #416 <Float 200F>
	//*  24   48:fcmpg           
	//*  25   49:ifgt            55
	//*  26   52:goto            59
					f1 = 200F;
	//   27   55:ldc2            #416 <Float 200F>
	//   28   58:fstore_1        
				r = b.c().getMapLenWithWin((int)f1);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #96  <Field s b>
	//   32   64:invokeinterface #419 <Method GLMapState s.c()>
	//   33   69:fload_1         
	//   34   70:f2i             
	//   35   71:invokevirtual   #425 <Method float GLMapState.getMapLenWithWin(int)>
	//   36   74:putfield        #88  <Field float r>
			} else
	//*  37   77:goto            98
			{
				r = b.c().getMapLenWithWin(10);
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:getfield        #96  <Field s b>
	//   41   85:invokeinterface #419 <Method GLMapState s.c()>
	//   42   90:bipush          10
	//   43   92:invokevirtual   #425 <Method float GLMapState.getMapLenWithWin(int)>
	//   44   95:putfield        #88  <Field float r>
			}
			return;
	//   45   98:return          
		} else
		{
			r = b.c().getMapLenWithWin(2);
	//   46   99:aload_0         
	//   47  100:aload_0         
	//   48  101:getfield        #96  <Field s b>
	//   49  104:invokeinterface #419 <Method GLMapState s.c()>
	//   50  109:iconst_2        
	//   51  110:invokevirtual   #425 <Method float GLMapState.getMapLenWithWin(int)>
	//   52  113:putfield        #88  <Field float r>
			return;
	//   53  116:return          
		}
	}

	public void a(CircleHoleOptions circleholeoptions)
		throws RemoteException
	{
		if(circleholeoptions.getCenter() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #325 <Method LatLng CircleHoleOptions.getCenter()>
	//*   2    4:ifnull          358
		{
			IPoint ipoint = IPoint.obtain();
	//    3    7:invokestatic    #171 <Method IPoint IPoint.obtain()>
	//    4   10:astore          13
			FPoint fpoint = FPoint.obtain();
	//    5   12:invokestatic    #430 <Method FPoint FPoint.obtain()>
	//    6   15:astore          14
			GLMapState.lonlat2Geo(circleholeoptions.getCenter().longitude, circleholeoptions.getCenter().latitude, ipoint);
	//    7   17:aload_1         
	//    8   18:invokevirtual   #325 <Method LatLng CircleHoleOptions.getCenter()>
	//    9   21:getfield        #177 <Field double LatLng.longitude>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #325 <Method LatLng CircleHoleOptions.getCenter()>
	//   12   28:getfield        #174 <Field double LatLng.latitude>
	//   13   31:aload           13
	//   14   33:invokestatic    #433 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
			float af[] = new float[1086];
	//   15   36:sipush          1086
	//   16   39:newarray        float[]
	//   17   41:astore          15
			double d1 = b(circleholeoptions.getCenter().latitude) * circleholeoptions.getRadius();
	//   18   43:aload_0         
	//   19   44:aload_1         
	//   20   45:invokevirtual   #325 <Method LatLng CircleHoleOptions.getCenter()>
	//   21   48:getfield        #174 <Field double LatLng.latitude>
	//   22   51:invokespecial   #435 <Method double b(double)>
	//   23   54:aload_1         
	//   24   55:invokevirtual   #439 <Method double CircleHoleOptions.getRadius()>
	//   25   58:dmul            
	//   26   59:dstore_2        
			int k1 = b.getMapConfig().getSX();
	//   27   60:aload_0         
	//   28   61:getfield        #96  <Field s b>
	//   29   64:invokeinterface #334 <Method MapConfig s.getMapConfig()>
	//   30   69:invokevirtual   #372 <Method int MapConfig.getSX()>
	//   31   72:istore          9
			int l1 = b.getMapConfig().getSY();
	//   32   74:aload_0         
	//   33   75:getfield        #96  <Field s b>
	//   34   78:invokeinterface #334 <Method MapConfig s.getMapConfig()>
	//   35   83:invokevirtual   #375 <Method int MapConfig.getSY()>
	//   36   86:istore          10
			fpoint.x = ipoint.x - k1;
	//   37   88:aload           14
	//   38   90:aload           13
	//   39   92:getfield        #186 <Field int IPoint.x>
	//   40   95:iload           9
	//   41   97:isub            
	//   42   98:i2f             
	//   43   99:putfield        #441 <Field float FPoint.x>
			fpoint.y = ipoint.y - l1;
	//   44  102:aload           14
	//   45  104:aload           13
	//   46  106:getfield        #188 <Field int IPoint.y>
	//   47  109:iload           10
	//   48  111:isub            
	//   49  112:i2f             
	//   50  113:putfield        #443 <Field float FPoint.y>
			af[0] = fpoint.x;
	//   51  116:aload           15
	//   52  118:iconst_0        
	//   53  119:aload           14
	//   54  121:getfield        #441 <Field float FPoint.x>
	//   55  124:fastore         
			af[1] = fpoint.y;
	//   56  125:aload           15
	//   57  127:iconst_1        
	//   58  128:aload           14
	//   59  130:getfield        #443 <Field float FPoint.y>
	//   60  133:fastore         
			af[2] = 0.0F;
	//   61  134:aload           15
	//   62  136:iconst_2        
	//   63  137:fconst_0        
	//   64  138:fastore         
			for(int i1 = 0; i1 < 361; i1++)
	//*  65  139:iconst_0        
	//*  66  140:istore          8
	//*  67  142:iload           8
	//*  68  144:sipush          361
	//*  69  147:icmpge          320
			{
				double d3 = ((double)i1 * 3.1415926535897931D) / 180D;
	//   70  150:iload           8
	//   71  152:i2d             
	//   72  153:ldc2w           #116 <Double 3.1415926535897931D>
	//   73  156:dmul            
	//   74  157:ldc2w           #118 <Double 180D>
	//   75  160:ddiv            
	//   76  161:dstore          6
				double d2 = Math.sin(d3);
	//   77  163:dload           6
	//   78  165:invokestatic    #446 <Method double Math.sin(double)>
	//   79  168:dstore          4
				d3 = Math.cos(d3);
	//   80  170:dload           6
	//   81  172:invokestatic    #125 <Method double Math.cos(double)>
	//   82  175:dstore          6
				int i2 = (int)((double)ipoint.x + d2 * d1);
	//   83  177:aload           13
	//   84  179:getfield        #186 <Field int IPoint.x>
	//   85  182:i2d             
	//   86  183:dload           4
	//   87  185:dload_2         
	//   88  186:dmul            
	//   89  187:dadd            
	//   90  188:d2i             
	//   91  189:istore          11
				int j2 = (int)((double)ipoint.y + d3 * d1);
	//   92  191:aload           13
	//   93  193:getfield        #188 <Field int IPoint.y>
	//   94  196:i2d             
	//   95  197:dload           6
	//   96  199:dload_2         
	//   97  200:dmul            
	//   98  201:dadd            
	//   99  202:d2i             
	//  100  203:istore          12
				fpoint.x = i2 - k1;
	//  101  205:aload           14
	//  102  207:iload           11
	//  103  209:iload           9
	//  104  211:isub            
	//  105  212:i2f             
	//  106  213:putfield        #441 <Field float FPoint.x>
				fpoint.y = j2 - l1;
	//  107  216:aload           14
	//  108  218:iload           12
	//  109  220:iload           10
	//  110  222:isub            
	//  111  223:i2f             
	//  112  224:putfield        #443 <Field float FPoint.y>
				fpoint.x = i2 - b.getMapConfig().getSX();
	//  113  227:aload           14
	//  114  229:iload           11
	//  115  231:aload_0         
	//  116  232:getfield        #96  <Field s b>
	//  117  235:invokeinterface #334 <Method MapConfig s.getMapConfig()>
	//  118  240:invokevirtual   #372 <Method int MapConfig.getSX()>
	//  119  243:isub            
	//  120  244:i2f             
	//  121  245:putfield        #441 <Field float FPoint.x>
				fpoint.y = j2 - b.getMapConfig().getSY();
	//  122  248:aload           14
	//  123  250:iload           12
	//  124  252:aload_0         
	//  125  253:getfield        #96  <Field s b>
	//  126  256:invokeinterface #334 <Method MapConfig s.getMapConfig()>
	//  127  261:invokevirtual   #375 <Method int MapConfig.getSY()>
	//  128  264:isub            
	//  129  265:i2f             
	//  130  266:putfield        #443 <Field float FPoint.y>
				af[(i1 + 1) * 3] = fpoint.x;
	//  131  269:aload           15
	//  132  271:iload           8
	//  133  273:iconst_1        
	//  134  274:iadd            
	//  135  275:iconst_3        
	//  136  276:imul            
	//  137  277:aload           14
	//  138  279:getfield        #441 <Field float FPoint.x>
	//  139  282:fastore         
				af[(i1 + 1) * 3 + 1] = fpoint.y;
	//  140  283:aload           15
	//  141  285:iload           8
	//  142  287:iconst_1        
	//  143  288:iadd            
	//  144  289:iconst_3        
	//  145  290:imul            
	//  146  291:iconst_1        
	//  147  292:iadd            
	//  148  293:aload           14
	//  149  295:getfield        #443 <Field float FPoint.y>
	//  150  298:fastore         
				af[(i1 + 1) * 3 + 2] = 0.0F;
	//  151  299:aload           15
	//  152  301:iload           8
	//  153  303:iconst_1        
	//  154  304:iadd            
	//  155  305:iconst_3        
	//  156  306:imul            
	//  157  307:iconst_2        
	//  158  308:iadd            
	//  159  309:fconst_0        
	//  160  310:fastore         
			}

	//  161  311:iload           8
	//  162  313:iconst_1        
	//  163  314:iadd            
	//  164  315:istore          8
	//* 165  317:goto            142
			int j1 = af.length;
	//  166  320:aload           15
	//  167  322:arraylength     
	//  168  323:istore          8
			j1 = 1086 / 3;
	//  169  325:sipush          1086
	//  170  328:iconst_3        
	//  171  329:idiv            
	//  172  330:istore          8
			y = 362;
	//  173  332:aload_0         
	//  174  333:sipush          362
	//  175  336:putfield        #242 <Field int y>
			A = fd.a(af);
	//  176  339:aload_0         
	//  177  340:aload           15
	//  178  342:invokestatic    #247 <Method FloatBuffer fd.a(float[])>
	//  179  345:putfield        #249 <Field FloatBuffer A>
			ipoint.recycle();
	//  180  348:aload           13
	//  181  350:invokevirtual   #449 <Method void IPoint.recycle()>
			fpoint.recycle();
	//  182  353:aload           14
	//  183  355:invokevirtual   #450 <Method void FPoint.recycle()>
		}
	//  184  358:return          
	}

	public void a(MapConfig mapconfig)
		throws RemoteException
	{
		List list;
		IPoint aipoint[];
		if(j == null || j.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field List j>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #78  <Field List j>
	//*   5   11:invokeinterface #201 <Method int List.size()>
	//*   6   16:ifne            20
			return;
	//    7   19:return          
		Rectangle rectangle = mapconfig.getGeoRectangle();
	//    8   20:aload_1         
	//    9   21:invokevirtual   #455 <Method Rectangle MapConfig.getGeoRectangle()>
	//   10   24:astore          4
		aipoint = rectangle.getClipRect();
	//   11   26:aload           4
	//   12   28:invokevirtual   #459 <Method IPoint[] Rectangle.getClipRect()>
	//   13   31:astore_3        
		list = j;
	//   14   32:aload_0         
	//   15   33:getfield        #78  <Field List j>
	//   16   36:astore_2        
		if(!a(rectangle))
			break MISSING_BLOCK_LABEL_77;
	//   17   37:aload_0         
	//   18   38:aload           4
	//   19   40:invokespecial   #461 <Method boolean a(Rectangle)>
	//   20   43:ifeq            77
		Object obj = s;
	//   21   46:aload_0         
	//   22   47:getfield        #90  <Field Object s>
	//   23   50:astore          4
		obj;
	//   24   52:aload           4
		JVM INSTR monitorenter ;
	//   25   54:monitorenter    
		list = fd.a(aipoint, j, true);
	//   26   55:aload_3         
	//   27   56:aload_0         
	//   28   57:getfield        #78  <Field List j>
	//   29   60:iconst_1        
	//   30   61:invokestatic    #464 <Method List fd.a(IPoint[], List, boolean)>
	//   31   64:astore_2        
		obj;
	//   32   65:aload           4
		JVM INSTR monitorexit ;
	//   33   67:monitorexit     
		break MISSING_BLOCK_LABEL_77;
	//   34   68:goto            77
		mapconfig;
	//   35   71:astore_1        
	//*  36   72:aload           4
		throw mapconfig;
	//   37   74:monitorexit     
	//   38   75:aload_1         
	//   39   76:athrow          
		d();
	//   40   77:aload_0         
	//   41   78:invokespecial   #466 <Method void d()>
		if(list.size() > 2)
	//*  42   81:aload_2         
	//*  43   82:invokeinterface #201 <Method int List.size()>
	//*  44   87:iconst_2        
	//*  45   88:icmple          197
		{
			b(list, mapconfig.getSX(), mapconfig.getSY());
	//   46   91:aload_0         
	//   47   92:aload_2         
	//   48   93:aload_1         
	//   49   94:invokevirtual   #372 <Method int MapConfig.getSX()>
	//   50   97:aload_1         
	//   51   98:invokevirtual   #375 <Method int MapConfig.getSY()>
	//   52  101:invokespecial   #468 <Method void b(List, int, int)>
			if(m != null && n != null && o > 0 && p > 0)
	//*  53  104:aload_0         
	//*  54  105:getfield        #213 <Field FloatBuffer m>
	//*  55  108:ifnull          197
	//*  56  111:aload_0         
	//*  57  112:getfield        #220 <Field FloatBuffer n>
	//*  58  115:ifnull          197
	//*  59  118:aload_0         
	//*  60  119:getfield        #82  <Field int o>
	//*  61  122:ifle            197
	//*  62  125:aload_0         
	//*  63  126:getfield        #84  <Field int p>
	//*  64  129:ifle            197
			{
				if(u == null || u.c())
	//*  65  132:aload_0         
	//*  66  133:getfield        #310 <Field ds$e u>
	//*  67  136:ifnull          149
	//*  68  139:aload_0         
	//*  69  140:getfield        #310 <Field ds$e u>
	//*  70  143:invokevirtual   #383 <Method boolean ds$e.c()>
	//*  71  146:ifeq            153
					b();
	//   72  149:aload_0         
	//   73  150:invokespecial   #385 <Method void b()>
				em.a(u, g, h, m, f, n, o, p, b.x());
	//   74  153:aload_0         
	//   75  154:getfield        #310 <Field ds$e u>
	//   76  157:aload_0         
	//   77  158:getfield        #470 <Field int g>
	//   78  161:aload_0         
	//   79  162:getfield        #387 <Field int h>
	//   80  165:aload_0         
	//   81  166:getfield        #213 <Field FloatBuffer m>
	//   82  169:aload_0         
	//   83  170:getfield        #389 <Field float f>
	//   84  173:aload_0         
	//   85  174:getfield        #220 <Field FloatBuffer n>
	//   86  177:aload_0         
	//   87  178:getfield        #82  <Field int o>
	//   88  181:aload_0         
	//   89  182:getfield        #84  <Field int p>
	//   90  185:aload_0         
	//   91  186:getfield        #96  <Field s b>
	//   92  189:invokeinterface #392 <Method float[] s.x()>
	//   93  194:invokestatic    #397 <Method void em.a(ds$e, int, int, FloatBuffer, float, FloatBuffer, int, int, float[])>
			}
		}
		e();
	//   94  197:aload_0         
	//   95  198:invokespecial   #472 <Method void e()>
		q = true;
	//   96  201:aload_0         
	//   97  202:iconst_1        
	//   98  203:putfield        #86  <Field boolean q>
		return;
	//   99  206:return          
	}

	public boolean a()
	{
		return b.getMapConfig().getGeoRectangle().isOverlap(a);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field s b>
	//    2    4:invokeinterface #334 <Method MapConfig s.getMapConfig()>
	//    3    9:invokevirtual   #455 <Method Rectangle MapConfig.getGeoRectangle()>
	//    4   12:aload_0         
	//    5   13:getfield        #92  <Field Rect a>
	//    6   16:invokevirtual   #475 <Method boolean Rectangle.isOverlap(Rect)>
	//    7   19:ifeq            24
	//    8   22:iconst_1        
	//    9   23:ireturn         
	//   10   24:iconst_0        
	//   11   25:ireturn         
	}

	public boolean c()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean q>
	//    2    4:ireturn         
	}

	public boolean contains(LatLng latlng)
		throws RemoteException
	{
		if(latlng == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		Iterator iterator;
		if(k == null || k.size() <= 0)
			break MISSING_BLOCK_LABEL_67;
	//    4    6:aload_0         
	//    5    7:getfield        #80  <Field List k>
	//    6   10:ifnull          67
	//    7   13:aload_0         
	//    8   14:getfield        #80  <Field List k>
	//    9   17:invokeinterface #201 <Method int List.size()>
	//   10   22:ifle            67
		iterator = k.iterator();
	//   11   25:aload_0         
	//   12   26:getfield        #80  <Field List k>
	//   13   29:invokeinterface #149 <Method Iterator List.iterator()>
	//   14   34:astore_3        
		boolean flag;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_67;
	//   15   35:aload_3         
	//   16   36:invokeinterface #155 <Method boolean Iterator.hasNext()>
	//   17   41:ifeq            67
			flag = fd.a((BaseHoleOptions)iterator.next(), latlng);
	//   18   44:aload_3         
	//   19   45:invokeinterface #159 <Method Object Iterator.next()>
	//   20   50:checkcast       #365 <Class BaseHoleOptions>
	//   21   53:aload_1         
	//   22   54:invokestatic    #478 <Method boolean fd.a(BaseHoleOptions, LatLng)>
	//   23   57:istore_2        
		} while(!flag);
	//   24   58:iload_2         
	//   25   59:ifeq            64
		return false;
	//   26   62:iconst_0        
	//   27   63:ireturn         
	//*  28   64:goto            35
		boolean flag1;
		try
		{
			flag1 = fd.a(latlng, getPoints());
	//   29   67:aload_1         
	//   30   68:aload_0         
	//   31   69:invokevirtual   #262 <Method List getPoints()>
	//   32   72:invokestatic    #265 <Method boolean fd.a(LatLng, List)>
	//   33   75:istore_2        
		}
	//*  34   76:iload_2         
	//*  35   77:ireturn         
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*  36   78:astore_1        
		{
			hm.c(((Throwable) (latlng)), "PolygonDelegateImp", "contains");
	//   37   79:aload_1         
	//   38   80:ldc1            #104 <String "PolygonDelegateImp">
	//   39   82:ldc2            #479 <String "contains">
	//   40   85:invokestatic    #111 <Method void hm.c(Throwable, String, String)>
			((Throwable) (latlng)).printStackTrace();
	//   41   88:aload_1         
	//   42   89:invokevirtual   #268 <Method void Throwable.printStackTrace()>
			return false;
	//   43   92:iconst_0        
	//   44   93:ireturn         
		}
		return flag1;
	}

	public void destroy()
	{
		try
		{
			if(m != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field FloatBuffer m>
	//*   2    4:ifnull          20
			{
				m.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #213 <Field FloatBuffer m>
	//    5   11:invokevirtual   #218 <Method java.nio.Buffer FloatBuffer.clear()>
	//    6   14:pop             
				m = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #213 <Field FloatBuffer m>
			}
			if(n != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #220 <Field FloatBuffer n>
	//*  12   24:ifnull          32
				n = null;
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:putfield        #220 <Field FloatBuffer n>
			if(A != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #249 <Field FloatBuffer A>
	//*  18   36:ifnull          52
			{
				A.clear();
	//   19   39:aload_0         
	//   20   40:getfield        #249 <Field FloatBuffer A>
	//   21   43:invokevirtual   #218 <Method java.nio.Buffer FloatBuffer.clear()>
	//   22   46:pop             
				A = null;
	//   23   47:aload_0         
	//   24   48:aconst_null     
	//   25   49:putfield        #249 <Field FloatBuffer A>
			}
			if(B != null)
	//*  26   52:aload_0         
	//*  27   53:getfield        #251 <Field FloatBuffer B>
	//*  28   56:ifnull          72
			{
				B.clear();
	//   29   59:aload_0         
	//   30   60:getfield        #251 <Field FloatBuffer B>
	//   31   63:invokevirtual   #218 <Method java.nio.Buffer FloatBuffer.clear()>
	//   32   66:pop             
				B = null;
	//   33   67:aload_0         
	//   34   68:aconst_null     
	//   35   69:putfield        #251 <Field FloatBuffer B>
			}
			if(k != null)
	//*  36   72:aload_0         
	//*  37   73:getfield        #80  <Field List k>
	//*  38   76:ifnull          88
				k.clear();
	//   39   79:aload_0         
	//   40   80:getfield        #80  <Field List k>
	//   41   83:invokeinterface #145 <Method void List.clear()>
			if(l != null)
	//*  42   88:aload_0         
	//*  43   89:getfield        #482 <Field List l>
	//*  44   92:ifnull          104
				l.clear();
	//   45   95:aload_0         
	//   46   96:getfield        #482 <Field List l>
	//   47   99:invokeinterface #145 <Method void List.clear()>
			k = null;
	//   48  104:aload_0         
	//   49  105:aconst_null     
	//   50  106:putfield        #80  <Field List k>
			l = null;
	//   51  109:aload_0         
	//   52  110:aconst_null     
	//   53  111:putfield        #482 <Field List l>
			return;
	//   54  114:return          
		}
		catch(Throwable throwable)
	//*  55  115:astore_1        
		{
			hm.c(throwable, "PolygonDelegateImp", "destroy");
	//   56  116:aload_1         
	//   57  117:ldc1            #104 <String "PolygonDelegateImp">
	//   58  119:ldc2            #483 <String "destroy">
	//   59  122:invokestatic    #111 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   60  125:aload_1         
	//   61  126:invokevirtual   #268 <Method void Throwable.printStackTrace()>
			return;
	//   62  129:return          
		}
	}

	public boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlay))) || ioverlay.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #486 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #489 <Method String IOverlay.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #100 <Method String getId()>
	//    8   18:invokevirtual   #492 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int getFillColor()
		throws RemoteException
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #470 <Field int g>
	//    2    4:ireturn         
	}

	public List getHoleOptions()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field List k>
	//    2    4:areturn         
	}

	public String getId()
		throws RemoteException
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field String e>
	//*   2    4:ifnonnull       23
			e = b.d("Polygon");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #96  <Field s b>
	//    6   12:ldc2            #497 <String "Polygon">
	//    7   15:invokeinterface #500 <Method String s.d(String)>
	//    8   20:putfield        #102 <Field String e>
		return e;
	//    9   23:aload_0         
	//   10   24:getfield        #102 <Field String e>
	//   11   27:areturn         
	}

	public List getPoints()
		throws RemoteException
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #502 <Field List i>
	//    2    4:areturn         
	}

	public int getStrokeColor()
		throws RemoteException
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #387 <Field int h>
	//    2    4:ireturn         
	}

	public float getStrokeWidth()
		throws RemoteException
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #389 <Field float f>
	//    2    4:freturn         
	}

	public float getZIndex()
		throws RemoteException
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field float c>
	//    2    4:freturn         
	}

	public int hashCodeRemote()
		throws RemoteException
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #510 <Method int Object.hashCode()>
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
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field boolean d>
	//    2    4:ireturn         
	}

	public void remove()
		throws RemoteException
	{
		b.a(getId());
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field s b>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #100 <Method String getId()>
	//    4    8:invokeinterface #515 <Method boolean s.a(String)>
	//    5   13:pop             
		b.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #96  <Field s b>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	public void setAboveMaskLayer(boolean flag)
	{
	//    0    0:return          
	}

	public void setFillColor(int i1)
		throws RemoteException
	{
		g = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #470 <Field int g>
		b.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field s b>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setHoleOptions(List list)
	{
		l = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #482 <Field List l>
		if(k != null) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field List k>
	//    5    9:ifnonnull       26
_L1:
		k = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #301 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #302 <Method void ArrayList()>
	//   10   20:putfield        #80  <Field List k>
		  goto _L3
	//*  11   23:goto            186
_L2:
		k.clear();
	//   12   26:aload_0         
	//   13   27:getfield        #80  <Field List k>
	//   14   30:invokeinterface #145 <Method void List.clear()>
		  goto _L3
	//*  15   35:goto            186
_L12:
		int i1;
		if(i1 >= list.size()) goto _L5; else goto _L4
	//   16   38:iload_2         
	//   17   39:aload_1         
	//   18   40:invokeinterface #201 <Method int List.size()>
	//   19   45:icmpge          202
_L4:
		Object obj = ((Object) ((BaseHoleOptions)list.get(i1)));
	//   20   48:aload_1         
	//   21   49:iload_2         
	//   22   50:invokeinterface #205 <Method Object List.get(int)>
	//   23   55:checkcast       #365 <Class BaseHoleOptions>
	//   24   58:astore_3        
		if(!(obj instanceof PolygonHoleOptions)) goto _L7; else goto _L6
	//   25   59:aload_3         
	//   26   60:instanceof      #257 <Class PolygonHoleOptions>
	//   27   63:ifeq            104
_L6:
		obj = ((Object) ((PolygonHoleOptions)obj));
	//   28   66:aload_3         
	//   29   67:checkcast       #257 <Class PolygonHoleOptions>
	//   30   70:astore_3        
		if(a(((PolygonHoleOptions) (obj))) && !fd.a(k, ((PolygonHoleOptions) (obj))))
	//*  31   71:aload_0         
	//*  32   72:aload_3         
	//*  33   73:invokespecial   #520 <Method boolean a(PolygonHoleOptions)>
	//*  34   76:ifeq            195
	//*  35   79:aload_0         
	//*  36   80:getfield        #80  <Field List k>
	//*  37   83:aload_3         
	//*  38   84:invokestatic    #523 <Method boolean fd.a(List, PolygonHoleOptions)>
	//*  39   87:ifne            195
			k.add(obj);
	//   40   90:aload_0         
	//   41   91:getfield        #80  <Field List k>
	//   42   94:aload_3         
	//   43   95:invokeinterface #185 <Method boolean List.add(Object)>
	//   44  100:pop             
		  goto _L8
	//*  45  101:goto            195
_L7:
		if(obj instanceof CircleHoleOptions)
	//*  46  104:aload_3         
	//*  47  105:instanceof      #321 <Class CircleHoleOptions>
	//*  48  108:ifeq            195
		{
			obj = ((Object) ((CircleHoleOptions)obj));
	//   49  111:aload_3         
	//   50  112:checkcast       #321 <Class CircleHoleOptions>
	//   51  115:astore_3        
			if(b(((CircleHoleOptions) (obj))) && !fd.a(k, ((CircleHoleOptions) (obj))))
	//*  52  116:aload_0         
	//*  53  117:aload_3         
	//*  54  118:invokespecial   #525 <Method boolean b(CircleHoleOptions)>
	//*  55  121:ifeq            195
	//*  56  124:aload_0         
	//*  57  125:getfield        #80  <Field List k>
	//*  58  128:aload_3         
	//*  59  129:invokestatic    #527 <Method boolean fd.a(List, CircleHoleOptions)>
	//*  60  132:ifne            195
				k.add(obj);
	//   61  135:aload_0         
	//   62  136:getfield        #80  <Field List k>
	//   63  139:aload_3         
	//   64  140:invokeinterface #185 <Method boolean List.add(Object)>
	//   65  145:pop             
		}
		  goto _L8
	//*  66  146:goto            195
_L10:
		try
		{
			k.clear();
	//   67  149:aload_0         
	//   68  150:getfield        #80  <Field List k>
	//   69  153:invokeinterface #145 <Method void List.clear()>
		}
	//*  70  158:goto            175
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  71  161:astore_1        
		{
			hm.c(((Throwable) (list)), "PolygonDelegateImp", "setHoleOptions");
	//   72  162:aload_1         
	//   73  163:ldc1            #104 <String "PolygonDelegateImp">
	//   74  165:ldc2            #528 <String "setHoleOptions">
	//   75  168:invokestatic    #111 <Method void hm.c(Throwable, String, String)>
			((Throwable) (list)).printStackTrace();
	//   76  171:aload_1         
	//   77  172:invokevirtual   #268 <Method void Throwable.printStackTrace()>
		}
_L5:
		b.setRunLowFrame(false);
	//   78  175:aload_0         
	//   79  176:getfield        #96  <Field s b>
	//   80  179:iconst_0        
	//   81  180:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
		return;
	//   82  185:return          
_L3:
		if(list == null) goto _L10; else goto _L9
	//   83  186:aload_1         
	//   84  187:ifnull          149
_L9:
		i1 = 0;
	//   85  190:iconst_0        
	//   86  191:istore_2        
		continue; /* Loop/switch isn't completed */
	//   87  192:goto            38
_L8:
		i1++;
	//   88  195:iload_2         
	//   89  196:iconst_1        
	//   90  197:iadd            
	//   91  198:istore_2        
		if(true) goto _L12; else goto _L11
	//   92  199:goto            38
_L11:
	//*  93  202:goto            158
	}

	public void setPoints(List list)
		throws RemoteException
	{
		Object obj = s;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Object s>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		i = list;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #502 <Field List i>
		a(list);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #532 <Method void a(List)>
		b.setRunLowFrame(false);
	//   11   17:aload_0         
	//   12   18:getfield        #96  <Field s b>
	//   13   21:iconst_0        
	//   14   22:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
		setHoleOptions(l);
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #482 <Field List l>
	//   18   32:invokevirtual   #534 <Method void setHoleOptions(List)>
		obj;
	//   19   35:aload_2         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return;
	//   21   37:return          
		list;
	//   22   38:astore_1        
	//*  23   39:aload_2         
		throw list;
	//   24   40:monitorexit     
	//   25   41:aload_1         
	//   26   42:athrow          
	}

	public void setStrokeColor(int i1)
		throws RemoteException
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #387 <Field int h>
		b.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field s b>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setStrokeWidth(float f1)
		throws RemoteException
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #389 <Field float f>
		b.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field s b>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setVisible(boolean flag)
		throws RemoteException
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field boolean d>
		b.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field s b>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
	//    7   15:return          
	}

	public void setZIndex(float f1)
		throws RemoteException
	{
		c = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #71  <Field float c>
		b.f();
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field s b>
	//    5    9:invokeinterface #378 <Method void s.f()>
		b.setRunLowFrame(false);
	//    6   14:aload_0         
	//    7   15:getfield        #96  <Field s b>
	//    8   18:iconst_0        
	//    9   19:invokeinterface #232 <Method void s.setRunLowFrame(boolean)>
	//   10   24:return          
	}

	private static double C = 10000000000D;
	private static float v = 4.007502E+07F;
	private static int w = 256;
	private static int x = 20;
	private FloatBuffer A;
	private FloatBuffer B;
	Rect a;
	private s b;
	private float c;
	private boolean d;
	private String e;
	private float f;
	private int g;
	private int h;
	private List i;
	private List j;
	private List k;
	private List l;
	private FloatBuffer m;
	private FloatBuffer n;
	private int o;
	private int p;
	private boolean q;
	private float r;
	private Object s;
	private float t;
	private ds.e u;
	private int y;
	private int z;

	static 
	{
	//    0    0:ldc1            #52  <Float 4.007502E+07F>
	//    1    2:putstatic       #54  <Field float v>
	//    2    5:sipush          256
	//    3    8:putstatic       #56  <Field int w>
	//    4   11:bipush          20
	//    5   13:putstatic       #58  <Field int x>
	//    6   16:ldc2w           #59  <Double 10000000000D>
	//    7   19:putstatic       #62  <Field double C>
	//*   8   22:return          
	}
}
