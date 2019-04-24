// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.utils;

import android.util.Pair;
import com.amap.api.mapcore.util.fd;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.autonavi.amap.mapcore.DPoint;
import java.util.*;

public class SpatialRelationUtil
{

	public SpatialRelationUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static Pair calShortestDistancePoint(List list, LatLng latlng)
	{
		if(list == null || latlng == null)
			break MISSING_BLOCK_LABEL_19;
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:aload_1         
	//    3    5:ifnull          19
		int i = list.size();
	//    4    8:aload_0         
	//    5    9:invokeinterface #28  <Method int List.size()>
	//    6   14:istore_2        
		if(i != 0)
			break MISSING_BLOCK_LABEL_21;
	//    7   15:iload_2         
	//    8   16:ifne            21
		return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		ArrayList arraylist = new ArrayList();
	//   11   21:new             #30  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #31  <Method void ArrayList()>
	//   14   28:astore_3        
		i = 0;
	//   15   29:iconst_0        
	//   16   30:istore_2        
		list = ((List) (list.iterator()));
	//   17   31:aload_0         
	//   18   32:invokeinterface #35  <Method Iterator List.iterator()>
	//   19   37:astore_0        
_L1:
		if(!((Iterator) (list)).hasNext())
			break MISSING_BLOCK_LABEL_109;
	//   20   38:aload_0         
	//   21   39:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            109
		LatLng latlng1 = (LatLng)((Iterator) (list)).next();
	//   23   47:aload_0         
	//   24   48:invokeinterface #45  <Method Object Iterator.next()>
	//   25   53:checkcast       #47  <Class LatLng>
	//   26   56:astore          4
		((List) (arraylist)).add(((Object) (DPoint.obtain(latlng1.latitude, latlng1.longitude))));
	//   27   58:aload_3         
	//   28   59:aload           4
	//   29   61:getfield        #51  <Field double LatLng.latitude>
	//   30   64:aload           4
	//   31   66:getfield        #54  <Field double LatLng.longitude>
	//   32   69:invokestatic    #60  <Method DPoint DPoint.obtain(double, double)>
	//   33   72:invokeinterface #64  <Method boolean List.add(Object)>
	//   34   77:pop             
		if(!latlng1.equals(((Object) (latlng))))
			break MISSING_BLOCK_LABEL_102;
	//   35   78:aload           4
	//   36   80:aload_1         
	//   37   81:invokevirtual   #67  <Method boolean LatLng.equals(Object)>
	//   38   84:ifeq            102
		list = ((List) (new Pair(((Object) (Integer.valueOf(i))), ((Object) (latlng)))));
	//   39   87:new             #69  <Class Pair>
	//   40   90:dup             
	//   41   91:iload_2         
	//   42   92:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   43   95:aload_1         
	//   44   96:invokespecial   #78  <Method void Pair(Object, Object)>
	//   45   99:astore_0        
		return ((Pair) (list));
	//   46  100:aload_0         
	//   47  101:areturn         
		i++;
	//   48  102:iload_2         
	//   49  103:iconst_1        
	//   50  104:iadd            
	//   51  105:istore_2        
		  goto _L1
	//*  52  106:goto            38
		list = ((List) (calShortestDistancePoint(((List) (arraylist)), DPoint.obtain(latlng.latitude, latlng.longitude))));
	//   53  109:aload_3         
	//   54  110:aload_1         
	//   55  111:getfield        #51  <Field double LatLng.latitude>
	//   56  114:aload_1         
	//   57  115:getfield        #54  <Field double LatLng.longitude>
	//   58  118:invokestatic    #60  <Method DPoint DPoint.obtain(double, double)>
	//   59  121:invokestatic    #81  <Method Pair calShortestDistancePoint(List, DPoint)>
	//   60  124:astore_0        
		if(list == null)
			break MISSING_BLOCK_LABEL_178;
	//   61  125:aload_0         
	//   62  126:ifnull          170
		list = ((List) (new Pair(((Pair) (list)).first, ((Object) (new LatLng(((DPoint)((Pair) (list)).second).x, ((DPoint)((Pair) (list)).second).y))))));
	//   63  129:new             #69  <Class Pair>
	//   64  132:dup             
	//   65  133:aload_0         
	//   66  134:getfield        #85  <Field Object Pair.first>
	//   67  137:new             #47  <Class LatLng>
	//   68  140:dup             
	//   69  141:aload_0         
	//   70  142:getfield        #88  <Field Object Pair.second>
	//   71  145:checkcast       #56  <Class DPoint>
	//   72  148:getfield        #91  <Field double DPoint.x>
	//   73  151:aload_0         
	//   74  152:getfield        #88  <Field Object Pair.second>
	//   75  155:checkcast       #56  <Class DPoint>
	//   76  158:getfield        #94  <Field double DPoint.y>
	//   77  161:invokespecial   #97  <Method void LatLng(double, double)>
	//   78  164:invokespecial   #78  <Method void Pair(Object, Object)>
	//   79  167:astore_0        
		return ((Pair) (list));
	//   80  168:aload_0         
	//   81  169:areturn         
	//*  82  170:goto            178
		list;
	//   83  173:astore_0        
		((Throwable) (list)).printStackTrace();
	//   84  174:aload_0         
	//   85  175:invokevirtual   #100 <Method void Throwable.printStackTrace()>
		return null;
	//   86  178:aconst_null     
	//   87  179:areturn         
	}

	public static Pair calShortestDistancePoint(List list, LatLng latlng, float f, double d)
	{
		if(list == null || latlng == null)
			break MISSING_BLOCK_LABEL_21;
	//    0    0:aload_0         
	//    1    1:ifnull          21
	//    2    4:aload_1         
	//    3    5:ifnull          21
		int i = list.size();
	//    4    8:aload_0         
	//    5    9:invokeinterface #28  <Method int List.size()>
	//    6   14:istore          5
		if(i != 0)
			break MISSING_BLOCK_LABEL_23;
	//    7   16:iload           5
	//    8   18:ifne            23
		return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
		ArrayList arraylist = new ArrayList();
	//   11   23:new             #30  <Class ArrayList>
	//   12   26:dup             
	//   13   27:invokespecial   #31  <Method void ArrayList()>
	//   14   30:astore          6
		i = 0;
	//   15   32:iconst_0        
	//   16   33:istore          5
		list = ((List) (list.iterator()));
	//   17   35:aload_0         
	//   18   36:invokeinterface #35  <Method Iterator List.iterator()>
	//   19   41:astore_0        
_L1:
		if(!((Iterator) (list)).hasNext())
			break MISSING_BLOCK_LABEL_117;
	//   20   42:aload_0         
	//   21   43:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//   22   48:ifeq            117
		LatLng latlng1 = (LatLng)((Iterator) (list)).next();
	//   23   51:aload_0         
	//   24   52:invokeinterface #45  <Method Object Iterator.next()>
	//   25   57:checkcast       #47  <Class LatLng>
	//   26   60:astore          7
		((List) (arraylist)).add(((Object) (DPoint.obtain(latlng1.latitude, latlng1.longitude))));
	//   27   62:aload           6
	//   28   64:aload           7
	//   29   66:getfield        #51  <Field double LatLng.latitude>
	//   30   69:aload           7
	//   31   71:getfield        #54  <Field double LatLng.longitude>
	//   32   74:invokestatic    #60  <Method DPoint DPoint.obtain(double, double)>
	//   33   77:invokeinterface #64  <Method boolean List.add(Object)>
	//   34   82:pop             
		if(!latlng1.equals(((Object) (latlng))))
			break MISSING_BLOCK_LABEL_108;
	//   35   83:aload           7
	//   36   85:aload_1         
	//   37   86:invokevirtual   #67  <Method boolean LatLng.equals(Object)>
	//   38   89:ifeq            108
		list = ((List) (new Pair(((Object) (Integer.valueOf(i))), ((Object) (latlng)))));
	//   39   92:new             #69  <Class Pair>
	//   40   95:dup             
	//   41   96:iload           5
	//   42   98:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   43  101:aload_1         
	//   44  102:invokespecial   #78  <Method void Pair(Object, Object)>
	//   45  105:astore_0        
		return ((Pair) (list));
	//   46  106:aload_0         
	//   47  107:areturn         
		i++;
	//   48  108:iload           5
	//   49  110:iconst_1        
	//   50  111:iadd            
	//   51  112:istore          5
		  goto _L1
	//*  52  114:goto            42
		list = ((List) (calShortestDistancePoint(((List) (arraylist)), DPoint.obtain(latlng.latitude, latlng.longitude), f)));
	//   53  117:aload           6
	//   54  119:aload_1         
	//   55  120:getfield        #51  <Field double LatLng.latitude>
	//   56  123:aload_1         
	//   57  124:getfield        #54  <Field double LatLng.longitude>
	//   58  127:invokestatic    #60  <Method DPoint DPoint.obtain(double, double)>
	//   59  130:fload_2         
	//   60  131:invokestatic    #106 <Method Pair calShortestDistancePoint(List, DPoint, float)>
	//   61  134:astore_0        
		if(list == null)
			break MISSING_BLOCK_LABEL_224;
	//   62  135:aload_0         
	//   63  136:ifnull          216
		DPoint dpoint = (DPoint)((Pair) (list)).second;
	//   64  139:aload_0         
	//   65  140:getfield        #88  <Field Object Pair.second>
	//   66  143:checkcast       #56  <Class DPoint>
	//   67  146:astore          6
		if((double)AMapUtils.calculateLineDistance(new LatLng(dpoint.x, dpoint.y), latlng) >= d)
			break MISSING_BLOCK_LABEL_224;
	//   68  148:new             #47  <Class LatLng>
	//   69  151:dup             
	//   70  152:aload           6
	//   71  154:getfield        #91  <Field double DPoint.x>
	//   72  157:aload           6
	//   73  159:getfield        #94  <Field double DPoint.y>
	//   74  162:invokespecial   #97  <Method void LatLng(double, double)>
	//   75  165:aload_1         
	//   76  166:invokestatic    #112 <Method float AMapUtils.calculateLineDistance(LatLng, LatLng)>
	//   77  169:f2d             
	//   78  170:dload_3         
	//   79  171:dcmpg           
	//   80  172:ifge            216
		list = ((List) (new Pair(((Pair) (list)).first, ((Object) (new LatLng(((DPoint)((Pair) (list)).second).x, ((DPoint)((Pair) (list)).second).y))))));
	//   81  175:new             #69  <Class Pair>
	//   82  178:dup             
	//   83  179:aload_0         
	//   84  180:getfield        #85  <Field Object Pair.first>
	//   85  183:new             #47  <Class LatLng>
	//   86  186:dup             
	//   87  187:aload_0         
	//   88  188:getfield        #88  <Field Object Pair.second>
	//   89  191:checkcast       #56  <Class DPoint>
	//   90  194:getfield        #91  <Field double DPoint.x>
	//   91  197:aload_0         
	//   92  198:getfield        #88  <Field Object Pair.second>
	//   93  201:checkcast       #56  <Class DPoint>
	//   94  204:getfield        #94  <Field double DPoint.y>
	//   95  207:invokespecial   #97  <Method void LatLng(double, double)>
	//   96  210:invokespecial   #78  <Method void Pair(Object, Object)>
	//   97  213:astore_0        
		return ((Pair) (list));
	//   98  214:aload_0         
	//   99  215:areturn         
	//* 100  216:goto            224
		list;
	//  101  219:astore_0        
		((Throwable) (list)).printStackTrace();
	//  102  220:aload_0         
	//  103  221:invokevirtual   #100 <Method void Throwable.printStackTrace()>
		return null;
	//  104  224:aconst_null     
	//  105  225:areturn         
	}

	public static Pair calShortestDistancePoint(List list, DPoint dpoint)
	{
		return calShortestDistancePoint(list, dpoint, -1F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #114 <Float -1F>
	//    3    4:invokestatic    #106 <Method Pair calShortestDistancePoint(List, DPoint, float)>
	//    4    7:areturn         
	}

	public static Pair calShortestDistancePoint(List list, DPoint dpoint, float f)
	{
		if(list == null || dpoint == null || list.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          17
	//*   2    4:aload_1         
	//*   3    5:ifnull          17
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #28  <Method int List.size()>
	//*   6   14:ifne            19
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
		if(list.size() < 2)
	//*   9   19:aload_0         
	//*  10   20:invokeinterface #28  <Method int List.size()>
	//*  11   25:iconst_2        
	//*  12   26:icmpge          31
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
		Pair pair = null;
	//   15   31:aconst_null     
	//   16   32:astore          9
		Object obj = ((Object) ((DPoint)list.get(0)));
	//   17   34:aload_0         
	//   18   35:iconst_0        
	//   19   36:invokeinterface #119 <Method Object List.get(int)>
	//   20   41:checkcast       #56  <Class DPoint>
	//   21   44:astore          10
		double d1 = 0.0D;
	//   22   46:dconst_0        
	//   23   47:dstore          5
		int j = list.size();
	//   24   49:aload_0         
	//   25   50:invokeinterface #28  <Method int List.size()>
	//   26   55:istore          8
		for(int i = 1; i <= j - 1;)
	//*  27   57:iconst_1        
	//*  28   58:istore          7
	//*  29   60:iload           7
	//*  30   62:iload           8
	//*  31   64:iconst_1        
	//*  32   65:isub            
	//*  33   66:icmpgt          299
		{
			DPoint dpoint1 = (DPoint)list.get(i);
	//   34   69:aload_0         
	//   35   70:iload           7
	//   36   72:invokeinterface #119 <Method Object List.get(int)>
	//   37   77:checkcast       #56  <Class DPoint>
	//   38   80:astore          11
			if(i == j - 1 && ((Object) (dpoint1)).equals(((Object) (dpoint))))
	//*  39   82:iload           7
	//*  40   84:iload           8
	//*  41   86:iconst_1        
	//*  42   87:isub            
	//*  43   88:icmpne          114
	//*  44   91:aload           11
	//*  45   93:aload_1         
	//*  46   94:invokevirtual   #120 <Method boolean Object.equals(Object)>
	//*  47   97:ifeq            114
				return new Pair(((Object) (Integer.valueOf(i))), ((Object) (dpoint)));
	//   48  100:new             #69  <Class Pair>
	//   49  103:dup             
	//   50  104:iload           7
	//   51  106:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   52  109:aload_1         
	//   53  110:invokespecial   #78  <Method void Pair(Object, Object)>
	//   54  113:areturn         
			double d;
			if(!checkRotateIsMatch(((DPoint) (obj)), dpoint1, f))
	//*  55  114:aload           10
	//*  56  116:aload           11
	//*  57  118:fload_2         
	//*  58  119:invokestatic    #124 <Method boolean checkRotateIsMatch(DPoint, DPoint, float)>
	//*  59  122:ifne            131
			{
				d = d1;
	//   60  125:dload           5
	//   61  127:dstore_3        
			} else
	//*  62  128:goto            283
			{
				if(obj.equals(((Object) (dpoint))))
	//*  63  131:aload           10
	//*  64  133:aload_1         
	//*  65  134:invokevirtual   #120 <Method boolean Object.equals(Object)>
	//*  66  137:ifeq            156
					return new Pair(((Object) (Integer.valueOf(i - 1))), ((Object) (dpoint)));
	//   67  140:new             #69  <Class Pair>
	//   68  143:dup             
	//   69  144:iload           7
	//   70  146:iconst_1        
	//   71  147:isub            
	//   72  148:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//   73  151:aload_1         
	//   74  152:invokespecial   #78  <Method void Pair(Object, Object)>
	//   75  155:areturn         
				obj = ((Object) (pointToSegDist(dpoint.x, dpoint.y, ((DPoint) (obj)).x, ((DPoint) (obj)).y, dpoint1.x, dpoint1.y)));
	//   76  156:aload_1         
	//   77  157:getfield        #91  <Field double DPoint.x>
	//   78  160:aload_1         
	//   79  161:getfield        #94  <Field double DPoint.y>
	//   80  164:aload           10
	//   81  166:getfield        #91  <Field double DPoint.x>
	//   82  169:aload           10
	//   83  171:getfield        #94  <Field double DPoint.y>
	//   84  174:aload           11
	//   85  176:getfield        #91  <Field double DPoint.x>
	//   86  179:aload           11
	//   87  181:getfield        #94  <Field double DPoint.y>
	//   88  184:invokestatic    #128 <Method Pair pointToSegDist(double, double, double, double, double, double)>
	//   89  187:astore          10
				if(pair == null)
	//*  90  189:aload           9
	//*  91  191:ifnonnull       230
				{
					d = ((Double)((Pair) (obj)).first).doubleValue();
	//   92  194:aload           10
	//   93  196:getfield        #85  <Field Object Pair.first>
	//   94  199:checkcast       #130 <Class Double>
	//   95  202:invokevirtual   #134 <Method double Double.doubleValue()>
	//   96  205:dstore_3        
					pair = new Pair(((Object) (Integer.valueOf(i - 1))), ((Pair) (obj)).second);
	//   97  206:new             #69  <Class Pair>
	//   98  209:dup             
	//   99  210:iload           7
	//  100  212:iconst_1        
	//  101  213:isub            
	//  102  214:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  103  217:aload           10
	//  104  219:getfield        #88  <Field Object Pair.second>
	//  105  222:invokespecial   #78  <Method void Pair(Object, Object)>
	//  106  225:astore          9
				} else
	//* 107  227:goto            283
				{
					d = d1;
	//  108  230:dload           5
	//  109  232:dstore_3        
					if(d1 > ((Double)((Pair) (obj)).first).doubleValue())
	//* 110  233:dload           5
	//* 111  235:aload           10
	//* 112  237:getfield        #85  <Field Object Pair.first>
	//* 113  240:checkcast       #130 <Class Double>
	//* 114  243:invokevirtual   #134 <Method double Double.doubleValue()>
	//* 115  246:dcmpl           
	//* 116  247:ifle            283
					{
						d = ((Double)((Pair) (obj)).first).doubleValue();
	//  117  250:aload           10
	//  118  252:getfield        #85  <Field Object Pair.first>
	//  119  255:checkcast       #130 <Class Double>
	//  120  258:invokevirtual   #134 <Method double Double.doubleValue()>
	//  121  261:dstore_3        
						pair = new Pair(((Object) (Integer.valueOf(i - 1))), ((Pair) (obj)).second);
	//  122  262:new             #69  <Class Pair>
	//  123  265:dup             
	//  124  266:iload           7
	//  125  268:iconst_1        
	//  126  269:isub            
	//  127  270:invokestatic    #75  <Method Integer Integer.valueOf(int)>
	//  128  273:aload           10
	//  129  275:getfield        #88  <Field Object Pair.second>
	//  130  278:invokespecial   #78  <Method void Pair(Object, Object)>
	//  131  281:astore          9
					}
				}
			}
			obj = ((Object) (dpoint1));
	//  132  283:aload           11
	//  133  285:astore          10
			i++;
	//  134  287:iload           7
	//  135  289:iconst_1        
	//  136  290:iadd            
	//  137  291:istore          7
			d1 = d;
	//  138  293:dload_3         
	//  139  294:dstore          5
		}

	//* 140  296:goto            60
		return pair;
	//  141  299:aload           9
	//  142  301:areturn         
	}

	private static boolean checkRotateIsMatch(DPoint dpoint, DPoint dpoint1, float f)
	{
		if(f == -1F)
	//*   0    0:fload_2         
	//*   1    1:ldc1            #114 <Float -1F>
	//*   2    3:fcmpl           
	//*   3    4:ifne            9
			return true;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		if(dpoint == null || dpoint1 == null)
	//*   6    9:aload_0         
	//*   7   10:ifnull          17
	//*   8   13:aload_1         
	//*   9   14:ifnonnull       19
			return false;
	//   10   17:iconst_0        
	//   11   18:ireturn         
		float f1 = Math.abs((fd.a(dpoint, dpoint1) + 360F) - f) % 360F;
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:invokestatic    #141 <Method float fd.a(DPoint, DPoint)>
	//   15   24:ldc1            #142 <Float 360F>
	//   16   26:fadd            
	//   17   27:fload_2         
	//   18   28:fsub            
	//   19   29:invokestatic    #148 <Method float Math.abs(float)>
	//   20   32:ldc1            #142 <Float 360F>
	//   21   34:frem            
	//   22   35:fstore_3        
		f = f1;
	//   23   36:fload_3         
	//   24   37:fstore_2        
		if(f1 > 180F)
	//*  25   38:fload_3         
	//*  26   39:ldc1            #149 <Float 180F>
	//*  27   41:fcmpl           
	//*  28   42:ifle            50
			f = 360F - f1;
	//   29   45:ldc1            #142 <Float 360F>
	//   30   47:fload_3         
	//   31   48:fsub            
	//   32   49:fstore_2        
		return f < 50F;
	//   33   50:fload_2         
	//   34   51:ldc1            #150 <Float 50F>
	//   35   53:fcmpg           
	//   36   54:ifge            59
	//   37   57:iconst_1        
	//   38   58:ireturn         
	//   39   59:iconst_0        
	//   40   60:ireturn         
	}

	private static Pair pointToSegDist(double d, double d1, double d2, double d3, 
			double d4, double d5)
	{
		double d6 = (d4 - d2) * (d - d2) + (d5 - d3) * (d1 - d3);
	//    0    0:dload           8
	//    1    2:dload           4
	//    2    4:dsub            
	//    3    5:dload_0         
	//    4    6:dload           4
	//    5    8:dsub            
	//    6    9:dmul            
	//    7   10:dload           10
	//    8   12:dload           6
	//    9   14:dsub            
	//   10   15:dload_2         
	//   11   16:dload           6
	//   12   18:dsub            
	//   13   19:dmul            
	//   14   20:dadd            
	//   15   21:dstore          12
		if(d6 <= 0.0D)
	//*  16   23:dload           12
	//*  17   25:dconst_0        
	//*  18   26:dcmpg           
	//*  19   27:ifgt            74
			return new Pair(((Object) (Double.valueOf(Math.sqrt((d - d2) * (d - d2) + (d1 - d3) * (d1 - d3))))), ((Object) (new DPoint(d2, d3))));
	//   20   30:new             #69  <Class Pair>
	//   21   33:dup             
	//   22   34:dload_0         
	//   23   35:dload           4
	//   24   37:dsub            
	//   25   38:dload_0         
	//   26   39:dload           4
	//   27   41:dsub            
	//   28   42:dmul            
	//   29   43:dload_2         
	//   30   44:dload           6
	//   31   46:dsub            
	//   32   47:dload_2         
	//   33   48:dload           6
	//   34   50:dsub            
	//   35   51:dmul            
	//   36   52:dadd            
	//   37   53:invokestatic    #154 <Method double Math.sqrt(double)>
	//   38   56:invokestatic    #157 <Method Double Double.valueOf(double)>
	//   39   59:new             #56  <Class DPoint>
	//   40   62:dup             
	//   41   63:dload           4
	//   42   65:dload           6
	//   43   67:invokespecial   #158 <Method void DPoint(double, double)>
	//   44   70:invokespecial   #78  <Method void Pair(Object, Object)>
	//   45   73:areturn         
		double d7 = (d4 - d2) * (d4 - d2) + (d5 - d3) * (d5 - d3);
	//   46   74:dload           8
	//   47   76:dload           4
	//   48   78:dsub            
	//   49   79:dload           8
	//   50   81:dload           4
	//   51   83:dsub            
	//   52   84:dmul            
	//   53   85:dload           10
	//   54   87:dload           6
	//   55   89:dsub            
	//   56   90:dload           10
	//   57   92:dload           6
	//   58   94:dsub            
	//   59   95:dmul            
	//   60   96:dadd            
	//   61   97:dstore          14
		if(d6 >= d7)
	//*  62   99:dload           12
	//*  63  101:dload           14
	//*  64  103:dcmpl           
	//*  65  104:iflt            151
		{
			return new Pair(((Object) (Double.valueOf(Math.sqrt((d - d4) * (d - d4) + (d1 - d5) * (d1 - d5))))), ((Object) (new DPoint(d4, d5))));
	//   66  107:new             #69  <Class Pair>
	//   67  110:dup             
	//   68  111:dload_0         
	//   69  112:dload           8
	//   70  114:dsub            
	//   71  115:dload_0         
	//   72  116:dload           8
	//   73  118:dsub            
	//   74  119:dmul            
	//   75  120:dload_2         
	//   76  121:dload           10
	//   77  123:dsub            
	//   78  124:dload_2         
	//   79  125:dload           10
	//   80  127:dsub            
	//   81  128:dmul            
	//   82  129:dadd            
	//   83  130:invokestatic    #154 <Method double Math.sqrt(double)>
	//   84  133:invokestatic    #157 <Method Double Double.valueOf(double)>
	//   85  136:new             #56  <Class DPoint>
	//   86  139:dup             
	//   87  140:dload           8
	//   88  142:dload           10
	//   89  144:invokespecial   #158 <Method void DPoint(double, double)>
	//   90  147:invokespecial   #78  <Method void Pair(Object, Object)>
	//   91  150:areturn         
		} else
		{
			d6 /= d7;
	//   92  151:dload           12
	//   93  153:dload           14
	//   94  155:ddiv            
	//   95  156:dstore          12
			d2 += (d4 - d2) * d6;
	//   96  158:dload           4
	//   97  160:dload           8
	//   98  162:dload           4
	//   99  164:dsub            
	//  100  165:dload           12
	//  101  167:dmul            
	//  102  168:dadd            
	//  103  169:dstore          4
			d3 += (d5 - d3) * d6;
	//  104  171:dload           6
	//  105  173:dload           10
	//  106  175:dload           6
	//  107  177:dsub            
	//  108  178:dload           12
	//  109  180:dmul            
	//  110  181:dadd            
	//  111  182:dstore          6
			return new Pair(((Object) (Double.valueOf(Math.sqrt((d - d2) * (d - d2) + (d3 - d1) * (d3 - d1))))), ((Object) (new DPoint(d2, d3))));
	//  112  184:new             #69  <Class Pair>
	//  113  187:dup             
	//  114  188:dload_0         
	//  115  189:dload           4
	//  116  191:dsub            
	//  117  192:dload_0         
	//  118  193:dload           4
	//  119  195:dsub            
	//  120  196:dmul            
	//  121  197:dload           6
	//  122  199:dload_2         
	//  123  200:dsub            
	//  124  201:dload           6
	//  125  203:dload_2         
	//  126  204:dsub            
	//  127  205:dmul            
	//  128  206:dadd            
	//  129  207:invokestatic    #154 <Method double Math.sqrt(double)>
	//  130  210:invokestatic    #157 <Method Double Double.valueOf(double)>
	//  131  213:new             #56  <Class DPoint>
	//  132  216:dup             
	//  133  217:dload           4
	//  134  219:dload           6
	//  135  221:invokespecial   #158 <Method void DPoint(double, double)>
	//  136  224:invokespecial   #78  <Method void Pair(Object, Object)>
	//  137  227:areturn         
		}
	}

	public static final int A_CIRCLE_DEGREE = 360;
	public static final int A_HALF_CIRCLE_DEGREE = 180;
	public static final int MIN_OFFSET_DEGREE = 50;
	public static final int MIN_POLYLINE_POINT_SIZE = 2;
}
