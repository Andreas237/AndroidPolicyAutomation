// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.*;
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
//			dg, hm, q, s, 
//			ab, fd

public class dn
	implements dg
{

	public dn(q q1, PolylineOptions polylineoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		g = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #87  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #88  <Method void ArrayList()>
	//    6   12:putfield        #90  <Field List g>
		h = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #87  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #88  <Method void ArrayList()>
	//   11   23:putfield        #92  <Field List h>
		i = ((List) (new ArrayList()));
	//   12   26:aload_0         
	//   13   27:new             #87  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #88  <Method void ArrayList()>
	//   16   34:putfield        #94  <Field List i>
		j = ((List) (new ArrayList()));
	//   17   37:aload_0         
	//   18   38:new             #87  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #88  <Method void ArrayList()>
	//   21   45:putfield        #96  <Field List j>
		k = ((List) (new ArrayList()));
	//   22   48:aload_0         
	//   23   49:new             #87  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #88  <Method void ArrayList()>
	//   26   56:putfield        #98  <Field List k>
		l = ((List) (new ArrayList()));
	//   27   59:aload_0         
	//   28   60:new             #87  <Class ArrayList>
	//   29   63:dup             
	//   30   64:invokespecial   #88  <Method void ArrayList()>
	//   31   67:putfield        #100 <Field List l>
		m = ((List) (new ArrayList()));
	//   32   70:aload_0         
	//   33   71:new             #87  <Class ArrayList>
	//   34   74:dup             
	//   35   75:invokespecial   #88  <Method void ArrayList()>
	//   36   78:putfield        #102 <Field List m>
		n = ((List) (new ArrayList()));
	//   37   81:aload_0         
	//   38   82:new             #87  <Class ArrayList>
	//   39   85:dup             
	//   40   86:invokespecial   #88  <Method void ArrayList()>
	//   41   89:putfield        #104 <Field List n>
		o = ((List) (new ArrayList()));
	//   42   92:aload_0         
	//   43   93:new             #87  <Class ArrayList>
	//   44   96:dup             
	//   45   97:invokespecial   #88  <Method void ArrayList()>
	//   46  100:putfield        #106 <Field List o>
		q = null;
	//   47  103:aload_0         
	//   48  104:aconst_null     
	//   49  105:putfield        #108 <Field BitmapDescriptor q>
		r = new Object();
	//   50  108:aload_0         
	//   51  109:new             #4   <Class Object>
	//   52  112:dup             
	//   53  113:invokespecial   #85  <Method void Object()>
	//   54  116:putfield        #110 <Field Object r>
		s = true;
	//   55  119:aload_0         
	//   56  120:iconst_1        
	//   57  121:putfield        #112 <Field boolean s>
		t = true;
	//   58  124:aload_0         
	//   59  125:iconst_1        
	//   60  126:putfield        #114 <Field boolean t>
		u = false;
	//   61  129:aload_0         
	//   62  130:iconst_0        
	//   63  131:putfield        #116 <Field boolean u>
		v = false;
	//   64  134:aload_0         
	//   65  135:iconst_0        
	//   66  136:putfield        #118 <Field boolean v>
		w = false;
	//   67  139:aload_0         
	//   68  140:iconst_0        
	//   69  141:putfield        #120 <Field boolean w>
		x = true;
	//   70  144:aload_0         
	//   71  145:iconst_1        
	//   72  146:putfield        #122 <Field boolean x>
		y = false;
	//   73  149:aload_0         
	//   74  150:iconst_0        
	//   75  151:putfield        #124 <Field boolean y>
		z = false;
	//   76  154:aload_0         
	//   77  155:iconst_0        
	//   78  156:putfield        #126 <Field boolean z>
		A = true;
	//   79  159:aload_0         
	//   80  160:iconst_1        
	//   81  161:putfield        #128 <Field boolean A>
		B = 0;
	//   82  164:aload_0         
	//   83  165:iconst_0        
	//   84  166:putfield        #130 <Field int B>
		C = 0;
	//   85  169:aload_0         
	//   86  170:iconst_0        
	//   87  171:putfield        #132 <Field int C>
		D = 0xff000000;
	//   88  174:aload_0         
	//   89  175:ldc1            #133 <Int 0xff000000>
	//   90  177:putfield        #135 <Field int D>
		E = 0;
	//   91  180:aload_0         
	//   92  181:iconst_0        
	//   93  182:putfield        #137 <Field int E>
		F = 0;
	//   94  185:aload_0         
	//   95  186:iconst_0        
	//   96  187:putfield        #139 <Field int F>
		G = 10F;
	//   97  190:aload_0         
	//   98  191:ldc1            #140 <Float 10F>
	//   99  193:putfield        #142 <Field float G>
		H = 0.0F;
	//  100  196:aload_0         
	//  101  197:fconst_0        
	//  102  198:putfield        #144 <Field float H>
		I = 0.0F;
	//  103  201:aload_0         
	//  104  202:fconst_0        
	//  105  203:putfield        #146 <Field float I>
		N = 1.0F;
	//  106  206:aload_0         
	//  107  207:fconst_1        
	//  108  208:putfield        #148 <Field float N>
		O = 0.0F;
	//  109  211:aload_0         
	//  110  212:fconst_0        
	//  111  213:putfield        #150 <Field float O>
		S = false;
	//  112  216:aload_0         
	//  113  217:iconst_0        
	//  114  218:putfield        #152 <Field boolean S>
		T = null;
	//  115  221:aload_0         
	//  116  222:aconst_null     
	//  117  223:putfield        #154 <Field FPointBounds T>
		a = null;
	//  118  226:aload_0         
	//  119  227:aconst_null     
	//  120  228:putfield        #156 <Field Rect a>
		V = 0;
	//  121  231:aload_0         
	//  122  232:iconst_0        
	//  123  233:putfield        #158 <Field int V>
		W = com.amap.api.maps.model.PolylineOptions.LineJoinType.LineJoinBevel;
	//  124  236:aload_0         
	//  125  237:getstatic       #163 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType com.amap.api.maps.model.PolylineOptions$LineJoinType.LineJoinBevel>
	//  126  240:putfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
		X = com.amap.api.maps.model.PolylineOptions.LineCapType.LineCapRound;
	//  127  243:aload_0         
	//  128  244:getstatic       #170 <Field com.amap.api.maps.model.PolylineOptions$LineCapType com.amap.api.maps.model.PolylineOptions$LineCapType.LineCapRound>
	//  129  247:putfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
		b = 0;
	//  130  250:aload_0         
	//  131  251:iconst_0        
	//  132  252:putfield        #174 <Field int b>
		c = new ArrayList();
	//  133  255:aload_0         
	//  134  256:new             #87  <Class ArrayList>
	//  135  259:dup             
	//  136  260:invokespecial   #88  <Method void ArrayList()>
	//  137  263:putfield        #176 <Field ArrayList c>
		d = 0L;
	//  138  266:aload_0         
	//  139  267:lconst_0        
	//  140  268:putfield        #178 <Field long d>
		e = q1;
	//  141  271:aload_0         
	//  142  272:aload_1         
	//  143  273:putfield        #180 <Field q e>
		setOptions(polylineoptions);
	//  144  276:aload_0         
	//  145  277:aload_2         
	//  146  278:invokevirtual   #184 <Method void setOptions(PolylineOptions)>
		try
		{
			f = getId();
	//  147  281:aload_0         
	//  148  282:aload_0         
	//  149  283:invokevirtual   #188 <Method String getId()>
	//  150  286:putfield        #190 <Field String f>
			return;
	//  151  289:return          
		}
		// Misplaced declaration of an exception variable
		catch(q q1)
	//* 152  290:astore_1        
		{
			hm.c(((Throwable) (q1)), "PolylineDelegateImp", "create");
	//  153  291:aload_1         
	//  154  292:ldc1            #192 <String "PolylineDelegateImp">
	//  155  294:ldc1            #194 <String "create">
	//  156  296:invokestatic    #199 <Method void hm.c(Throwable, String, String)>
		}
		((RemoteException) (q1)).printStackTrace();
	//  157  299:aload_1         
	//  158  300:invokevirtual   #202 <Method void RemoteException.printStackTrace()>
	//  159  303:return          
	}

	private double a(double d1, double d2, double d3, double d4, double d5, double d6)
	{
		double d7 = (d5 - d3) * (d1 - d3) + (d6 - d4) * (d2 - d4);
	//    0    0:dload           9
	//    1    2:dload           5
	//    2    4:dsub            
	//    3    5:dload_1         
	//    4    6:dload           5
	//    5    8:dsub            
	//    6    9:dmul            
	//    7   10:dload           11
	//    8   12:dload           7
	//    9   14:dsub            
	//   10   15:dload_3         
	//   11   16:dload           7
	//   12   18:dsub            
	//   13   19:dmul            
	//   14   20:dadd            
	//   15   21:dstore          13
		if(d7 <= 0.0D)
	//*  16   23:dload           13
	//*  17   25:dconst_0        
	//*  18   26:dcmpg           
	//*  19   27:ifgt            53
			return Math.sqrt((d1 - d3) * (d1 - d3) + (d2 - d4) * (d2 - d4));
	//   20   30:dload_1         
	//   21   31:dload           5
	//   22   33:dsub            
	//   23   34:dload_1         
	//   24   35:dload           5
	//   25   37:dsub            
	//   26   38:dmul            
	//   27   39:dload_3         
	//   28   40:dload           7
	//   29   42:dsub            
	//   30   43:dload_3         
	//   31   44:dload           7
	//   32   46:dsub            
	//   33   47:dmul            
	//   34   48:dadd            
	//   35   49:invokestatic    #210 <Method double Math.sqrt(double)>
	//   36   52:dreturn         
		double d8 = (d5 - d3) * (d5 - d3) + (d6 - d4) * (d6 - d4);
	//   37   53:dload           9
	//   38   55:dload           5
	//   39   57:dsub            
	//   40   58:dload           9
	//   41   60:dload           5
	//   42   62:dsub            
	//   43   63:dmul            
	//   44   64:dload           11
	//   45   66:dload           7
	//   46   68:dsub            
	//   47   69:dload           11
	//   48   71:dload           7
	//   49   73:dsub            
	//   50   74:dmul            
	//   51   75:dadd            
	//   52   76:dstore          15
		if(d7 >= d8)
	//*  53   78:dload           13
	//*  54   80:dload           15
	//*  55   82:dcmpl           
	//*  56   83:iflt            109
		{
			return Math.sqrt((d1 - d5) * (d1 - d5) + (d2 - d6) * (d2 - d6));
	//   57   86:dload_1         
	//   58   87:dload           9
	//   59   89:dsub            
	//   60   90:dload_1         
	//   61   91:dload           9
	//   62   93:dsub            
	//   63   94:dmul            
	//   64   95:dload_3         
	//   65   96:dload           11
	//   66   98:dsub            
	//   67   99:dload_3         
	//   68  100:dload           11
	//   69  102:dsub            
	//   70  103:dmul            
	//   71  104:dadd            
	//   72  105:invokestatic    #210 <Method double Math.sqrt(double)>
	//   73  108:dreturn         
		} else
		{
			d7 /= d8;
	//   74  109:dload           13
	//   75  111:dload           15
	//   76  113:ddiv            
	//   77  114:dstore          13
			d3 += (d5 - d3) * d7;
	//   78  116:dload           5
	//   79  118:dload           9
	//   80  120:dload           5
	//   81  122:dsub            
	//   82  123:dload           13
	//   83  125:dmul            
	//   84  126:dadd            
	//   85  127:dstore          5
			d4 += (d6 - d4) * d7;
	//   86  129:dload           7
	//   87  131:dload           11
	//   88  133:dload           7
	//   89  135:dsub            
	//   90  136:dload           13
	//   91  138:dmul            
	//   92  139:dadd            
	//   93  140:dstore          7
			return Math.sqrt((d1 - d3) * (d1 - d3) + (d4 - d2) * (d4 - d2));
	//   94  142:dload_1         
	//   95  143:dload           5
	//   96  145:dsub            
	//   97  146:dload_1         
	//   98  147:dload           5
	//   99  149:dsub            
	//  100  150:dmul            
	//  101  151:dload           7
	//  102  153:dload_3         
	//  103  154:dsub            
	//  104  155:dload           7
	//  105  157:dload_3         
	//  106  158:dsub            
	//  107  159:dmul            
	//  108  160:dadd            
	//  109  161:invokestatic    #210 <Method double Math.sqrt(double)>
	//  110  164:dreturn         
		}
	}

	private double a(FPoint fpoint, FPoint fpoint1, FPoint fpoint2)
	{
		return a(fpoint.x, fpoint.y, fpoint1.x, fpoint1.y, fpoint2.x, fpoint2.y);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #215 <Field float FPoint.x>
	//    3    5:f2d             
	//    4    6:aload_1         
	//    5    7:getfield        #217 <Field float FPoint.y>
	//    6   10:f2d             
	//    7   11:aload_2         
	//    8   12:getfield        #215 <Field float FPoint.x>
	//    9   15:f2d             
	//   10   16:aload_2         
	//   11   17:getfield        #217 <Field float FPoint.y>
	//   12   20:f2d             
	//   13   21:aload_3         
	//   14   22:getfield        #215 <Field float FPoint.x>
	//   15   25:f2d             
	//   16   26:aload_3         
	//   17   27:getfield        #217 <Field float FPoint.y>
	//   18   30:f2d             
	//   19   31:invokespecial   #219 <Method double a(double, double, double, double, double, double)>
	//   20   34:dreturn         
	}

	private int a(boolean flag, BitmapDescriptor bitmapdescriptor)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		ab ab1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		if(flag)
	//*   4    6:iload_1         
	//*   5    7:ifeq            40
		{
			ab ab2 = e.e().a(bitmapdescriptor);
	//    6   10:aload_0         
	//    7   11:getfield        #180 <Field q e>
	//    8   14:invokevirtual   #225 <Method s q.e()>
	//    9   17:aload_2         
	//   10   18:invokeinterface #230 <Method ab s.a(BitmapDescriptor)>
	//   11   23:astore          6
			ab1 = ab2;
	//   12   25:aload           6
	//   13   27:astore          5
			if(ab2 != null)
	//*  14   29:aload           6
	//*  15   31:ifnull          40
				return ab2.f();
	//   16   34:aload           6
	//   17   36:invokevirtual   #235 <Method int ab.f()>
	//   18   39:ireturn         
		}
		ab ab3 = ab1;
	//   19   40:aload           5
	//   20   42:astore          6
		if(ab1 == null)
	//*  21   44:aload           5
	//*  22   46:ifnonnull       60
			ab3 = new ab(bitmapdescriptor, 0);
	//   23   49:new             #232 <Class ab>
	//   24   52:dup             
	//   25   53:aload_2         
	//   26   54:iconst_0        
	//   27   55:invokespecial   #238 <Method void ab(BitmapDescriptor, int)>
	//   28   58:astore          6
		int i1 = ((int) (flag1));
	//   29   60:iload           4
	//   30   62:istore_3        
		if(true)
	//*  31   63:iconst_0        
	//*  32   64:ifne            137
		{
			bitmapdescriptor = ((BitmapDescriptor) (bitmapdescriptor.getBitmap()));
	//   33   67:aload_2         
	//   34   68:invokevirtual   #244 <Method Bitmap BitmapDescriptor.getBitmap()>
	//   35   71:astore_2        
			i1 = ((int) (flag1));
	//   36   72:iload           4
	//   37   74:istore_3        
			if(bitmapdescriptor != null)
	//*  38   75:aload_2         
	//*  39   76:ifnull          137
			{
				i1 = ((int) (flag1));
	//   40   79:iload           4
	//   41   81:istore_3        
				if(!((Bitmap) (bitmapdescriptor)).isRecycled())
	//*  42   82:aload_2         
	//*  43   83:invokevirtual   #250 <Method boolean Bitmap.isRecycled()>
	//*  44   86:ifne            137
				{
					i1 = f();
	//   45   89:aload_0         
	//   46   90:invokespecial   #251 <Method int f()>
	//   47   93:istore_3        
					if(flag)
	//*  48   94:iload_1         
	//*  49   95:ifeq            118
					{
						ab3.a(i1);
	//   50   98:aload           6
	//   51  100:iload_3         
	//   52  101:invokevirtual   #254 <Method void ab.a(int)>
						e.e().a(ab3);
	//   53  104:aload_0         
	//   54  105:getfield        #180 <Field q e>
	//   55  108:invokevirtual   #225 <Method s q.e()>
	//   56  111:aload           6
	//   57  113:invokeinterface #257 <Method void s.a(ab)>
					}
					k.add(((Object) (ab3)));
	//   58  118:aload_0         
	//   59  119:getfield        #98  <Field List k>
	//   60  122:aload           6
	//   61  124:invokeinterface #263 <Method boolean List.add(Object)>
	//   62  129:pop             
					fd.b(i1, ((Bitmap) (bitmapdescriptor)), true);
	//   63  130:iload_3         
	//   64  131:aload_2         
	//   65  132:iconst_1        
	//   66  133:invokestatic    #268 <Method int fd.b(int, Bitmap, boolean)>
	//   67  136:pop             
				}
			}
		}
		return i1;
	//   68  137:iload_3         
	//   69  138:ireturn         
	}

	private void a(float f1, MapConfig mapconfig)
	{
		if(w)
			break MISSING_BLOCK_LABEL_119;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean w>
	//    2    4:ifne            119
		if(j == null)
			break MISSING_BLOCK_LABEL_119;
	//    3    7:aload_0         
	//    4    8:getfield        #96  <Field List j>
	//    5   11:ifnull          104
		R = new int[j.size()];
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #96  <Field List j>
	//    9   19:invokeinterface #274 <Method int List.size()>
	//   10   24:newarray        int[]
	//   11   26:putfield        #276 <Field int[] R>
		int i1 = 0;
	//   12   29:iconst_0        
	//   13   30:istore_3        
		int k1;
		int l1;
		boolean flag;
		Object obj;
		FPoint afpoint[];
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*  14   31:getstatic       #281 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   34:bipush          12
	//*  16   36:icmplt          356
			flag = true;
	//   17   39:iconst_1        
	//   18   40:istore          6
		else
	//*  19   42:goto            45
	//*  20   45:aload_0         
	//*  21   46:getfield        #96  <Field List j>
	//*  22   49:invokeinterface #285 <Method Iterator List.iterator()>
	//*  23   54:astore          7
	//*  24   56:aload           7
	//*  25   58:invokeinterface #290 <Method boolean Iterator.hasNext()>
	//*  26   63:ifeq            99
	//*  27   66:aload_0         
	//*  28   67:iload           6
	//*  29   69:aload           7
	//*  30   71:invokeinterface #294 <Method Object Iterator.next()>
	//*  31   76:checkcast       #240 <Class BitmapDescriptor>
	//*  32   79:invokespecial   #296 <Method int a(boolean, BitmapDescriptor)>
	//*  33   82:istore          4
	//*  34   84:aload_0         
	//*  35   85:getfield        #276 <Field int[] R>
	//*  36   88:iload_3         
	//*  37   89:iload           4
	//*  38   91:iastore         
	//*  39   92:iload_3         
	//*  40   93:iconst_1        
	//*  41   94:iadd            
	//*  42   95:istore_3        
	//*  43   96:goto            56
	//*  44   99:aload_0         
	//*  45  100:iconst_1        
	//*  46  101:putfield        #120 <Field boolean w>
	//*  47  104:goto            119
	//*  48  107:astore_2        
	//*  49  108:aload_2         
	//*  50  109:ldc2            #298 <String "MarkerDelegateImp">
	//*  51  112:ldc2            #300 <String "loadtexture">
	//*  52  115:invokestatic    #199 <Method void hm.c(Throwable, String, String)>
	//*  53  118:return          
	//*  54  119:aload_2         
	//*  55  120:invokevirtual   #306 <Method Rectangle MapConfig.getGeoRectangle()>
	//*  56  123:invokevirtual   #312 <Method FPoint[] Rectangle.getClipMapRect()>
	//*  57  126:astore          8
	//*  58  128:aload_0         
	//*  59  129:getfield        #92  <Field List h>
	//*  60  132:astore_2        
	//*  61  133:aload_0         
	//*  62  134:aload           8
	//*  63  136:invokespecial   #315 <Method boolean a(FPoint[])>
	//*  64  139:ifeq            174
	//*  65  142:aload_0         
	//*  66  143:getfield        #110 <Field Object r>
	//*  67  146:astore          7
	//*  68  148:aload           7
	//*  69  150:monitorenter    
	//*  70  151:aload           8
	//*  71  153:aload_0         
	//*  72  154:getfield        #92  <Field List h>
	//*  73  157:iconst_0        
	//*  74  158:invokestatic    #318 <Method List fd.b(FPoint[], List, boolean)>
	//*  75  161:astore_2        
	//*  76  162:aload           7
	//*  77  164:monitorexit     
	//*  78  165:goto            174
	//*  79  168:astore_2        
	//*  80  169:aload           7
	//*  81  171:monitorexit     
	//*  82  172:aload_2         
	//*  83  173:athrow          
	//*  84  174:aload_2         
	//*  85  175:invokeinterface #274 <Method int List.size()>
	//*  86  180:iconst_2        
	//*  87  181:icmplt          349
	//*  88  184:aload_0         
	//*  89  185:aload_2         
	//*  90  186:invokespecial   #321 <Method void d(List)>
	//*  91  189:aload_0         
	//*  92  190:getfield        #104 <Field List n>
	//*  93  193:astore_2        
	//*  94  194:aload_2         
	//*  95  195:monitorenter    
	//*  96  196:aload_0         
	//*  97  197:getfield        #104 <Field List n>
	//*  98  200:invokeinterface #274 <Method int List.size()>
	//*  99  205:newarray        int[]
	//* 100  207:astore          7
	//* 101  209:iconst_0        
	//* 102  210:istore_3        
	//* 103  211:iload_3         
	//* 104  212:aload           7
	//* 105  214:arraylength     
	//* 106  215:icmpge          266
	//* 107  218:aload_0         
	//* 108  219:getfield        #104 <Field List n>
	//* 109  222:iload_3         
	//* 110  223:invokeinterface #325 <Method Object List.get(int)>
	//* 111  228:checkcast       #327 <Class Integer>
	//* 112  231:invokevirtual   #330 <Method int Integer.intValue()>
	//* 113  234:istore          5
	//* 114  236:iload           5
	//* 115  238:istore          4
	//* 116  240:iload           5
	//* 117  242:ifge            248
	//* 118  245:iconst_0        
	//* 119  246:istore          4
	//* 120  248:aload           7
	//* 121  250:iload_3         
	//* 122  251:aload_0         
	//* 123  252:getfield        #276 <Field int[] R>
	//* 124  255:iload           4
	//* 125  257:iaload          
	//* 126  258:iastore         
	//* 127  259:iload_3         
	//* 128  260:iconst_1        
	//* 129  261:iadd            
	//* 130  262:istore_3        
	//* 131  263:goto            211
	//* 132  266:aload_2         
	//* 133  267:monitorexit     
	//* 134  268:goto            278
	//* 135  271:astore          7
	//* 136  273:aload_2         
	//* 137  274:monitorexit     
	//* 138  275:aload           7
	//* 139  277:athrow          
	//* 140  278:aload_0         
	//* 141  279:getfield        #332 <Field int[] Q>
	//* 142  282:ifnull          362
	//* 143  285:iconst_1        
	//* 144  286:istore_3        
	//* 145  287:goto            290
	//* 146  290:iload_3         
	//* 147  291:iconst_1        
	//* 148  292:iand            
	//* 149  293:ifeq            349
	//* 150  296:aload_0         
	//* 151  297:getfield        #334 <Field float[] P>
	//* 152  300:aload_0         
	//* 153  301:getfield        #174 <Field int b>
	//* 154  304:fload_1         
	//* 155  305:aload           7
	//* 156  307:aload           7
	//* 157  309:arraylength     
	//* 158  310:aload_0         
	//* 159  311:getfield        #332 <Field int[] Q>
	//* 160  314:aload_0         
	//* 161  315:getfield        #332 <Field int[] Q>
	//* 162  318:arraylength     
	//* 163  319:fconst_1        
	//* 164  320:aload_0         
	//* 165  321:getfield        #148 <Field float N>
	//* 166  324:fsub            
	//* 167  325:aload_0         
	//* 168  326:getfield        #180 <Field q e>
	//* 169  329:invokevirtual   #337 <Method float[] q.f()>
	//* 170  332:aload_0         
	//* 171  333:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//* 172  336:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//* 173  339:aload_0         
	//* 174  340:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//* 175  343:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//* 176  346:invokestatic    #347 <Method void AMapNativeRenderer.nativeDrawLineByMultiTextureID(float[], int, float, int[], int, int[], int, float, float[], int, int)>
	//* 177  349:return          
	//* 178  350:astore_2        
	//* 179  351:aload_2         
	//* 180  352:invokevirtual   #348 <Method void Throwable.printStackTrace()>
	//* 181  355:return          
			flag = false;
	//  182  356:iconst_0        
	//  183  357:istore          6
		obj = ((Object) (j.iterator()));
_L1:
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_99;
		int j1 = a(flag, (BitmapDescriptor)((Iterator) (obj)).next());
		R[i1] = j1;
		i1++;
		  goto _L1
		try
		{
			w = true;
		}
		// Misplaced declaration of an exception variable
		catch(MapConfig mapconfig)
		{
			hm.c(((Throwable) (mapconfig)), "MarkerDelegateImp", "loadtexture");
			return;
		}
		afpoint = mapconfig.getGeoRectangle().getClipMapRect();
		mapconfig = ((MapConfig) (h));
		if(!a(afpoint))
			break MISSING_BLOCK_LABEL_174;
		obj = r;
		obj;
		JVM INSTR monitorenter ;
		mapconfig = ((MapConfig) (fd.b(afpoint, h, false)));
		obj;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_174;
		mapconfig;
		throw mapconfig;
		if(((List) (mapconfig)).size() < 2) goto _L3; else goto _L2
_L2:
		d(((List) (mapconfig)));
		mapconfig = ((MapConfig) (n));
		mapconfig;
		JVM INSTR monitorenter ;
		obj = ((Object) (new int[n.size()]));
		i1 = 0;
_L5:
		if(i1 >= obj.length)
			break; /* Loop/switch isn't completed */
		l1 = ((Integer)n.get(i1)).intValue();
		k1 = l1;
		if(l1 < 0)
			k1 = 0;
		obj[i1] = R[k1];
		i1++;
		if(true) goto _L5; else goto _L4
_L4:
		break MISSING_BLOCK_LABEL_278;
		obj;
		throw obj;
		if(Q != null)
			i1 = 1;
		else
	//* 184  359:goto            45
			i1 = 0;
	//  185  362:iconst_0        
	//  186  363:istore_3        
		if(!(i1 & true)) goto _L3; else goto _L6
_L6:
		AMapNativeRenderer.nativeDrawLineByMultiTextureID(P, b, f1, ((int []) (obj)), obj.length, Q, Q.length, 1.0F - N, e.f(), X.getTypeValue(), W.getTypeValue());
_L3:
		return;
		mapconfig;
		((Throwable) (mapconfig)).printStackTrace();
		return;
	//* 187  364:goto            290
	}

	private boolean a(FPoint fpoint, FPoint fpoint1)
	{
		if((fpoint instanceof FPoint3) && (fpoint1 instanceof FPoint3) && ((FPoint3)fpoint).colorIndex != ((FPoint3)fpoint1).colorIndex)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #351 <Class FPoint3>
	//*   2    4:ifeq            33
	//*   3    7:aload_2         
	//*   4    8:instanceof      #351 <Class FPoint3>
	//*   5   11:ifeq            33
	//*   6   14:aload_1         
	//*   7   15:checkcast       #351 <Class FPoint3>
	//*   8   18:getfield        #354 <Field int FPoint3.colorIndex>
	//*   9   21:aload_2         
	//*  10   22:checkcast       #351 <Class FPoint3>
	//*  11   25:getfield        #354 <Field int FPoint3.colorIndex>
	//*  12   28:icmpeq          33
			return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         
		return Math.abs(fpoint1.x - fpoint.x) >= O || Math.abs(fpoint1.y - fpoint.y) >= O;
	//   15   33:aload_2         
	//   16   34:getfield        #215 <Field float FPoint.x>
	//   17   37:aload_1         
	//   18   38:getfield        #215 <Field float FPoint.x>
	//   19   41:fsub            
	//   20   42:invokestatic    #358 <Method float Math.abs(float)>
	//   21   45:aload_0         
	//   22   46:getfield        #150 <Field float O>
	//   23   49:fcmpl           
	//   24   50:ifge            73
	//   25   53:aload_2         
	//   26   54:getfield        #217 <Field float FPoint.y>
	//   27   57:aload_1         
	//   28   58:getfield        #217 <Field float FPoint.y>
	//   29   61:fsub            
	//   30   62:invokestatic    #358 <Method float Math.abs(float)>
	//   31   65:aload_0         
	//   32   66:getfield        #150 <Field float O>
	//   33   69:fcmpl           
	//   34   70:iflt            75
	//   35   73:iconst_1        
	//   36   74:ireturn         
	//   37   75:iconst_0        
	//   38   76:ireturn         
	}

	private boolean a(FPoint afpoint[])
	{
label0:
		{
label1:
			{
				I = e.e().g();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field q e>
	//    3    5:invokevirtual   #225 <Method s q.e()>
	//    4    8:invokeinterface #361 <Method float s.g()>
	//    5   13:putfield        #146 <Field float I>
				int i1 = 10;
	//    6   16:bipush          10
	//    7   18:istore_2        
				e();
	//    8   19:aload_0         
	//    9   20:invokespecial   #363 <Method void e()>
				if(g.size() > 10000)
	//*  10   23:aload_0         
	//*  11   24:getfield        #90  <Field List g>
	//*  12   27:invokeinterface #274 <Method int List.size()>
	//*  13   32:sipush          10000
	//*  14   35:icmple          41
					i1 = 7;
	//   15   38:bipush          7
	//   16   40:istore_2        
				if(I <= (float)i1)
	//*  17   41:aload_0         
	//*  18   42:getfield        #146 <Field float I>
	//*  19   45:iload_2         
	//*  20   46:i2f             
	//*  21   47:fcmpg           
	//*  22   48:ifgt            53
					return false;
	//   23   51:iconst_0        
	//   24   52:ireturn         
				boolean flag;
				try
				{
					if(e.e() == null)
						break label0;
	//   25   53:aload_0         
	//   26   54:getfield        #180 <Field q e>
	//   27   57:invokevirtual   #225 <Method s q.e()>
	//   28   60:ifnull          97
					if(!fd.a(T.northeast, afpoint))
						break label1;
	//   29   63:aload_0         
	//   30   64:getfield        #154 <Field FPointBounds T>
	//   31   67:getfield        #369 <Field FPoint FPointBounds.northeast>
	//   32   70:aload_1         
	//   33   71:invokestatic    #372 <Method boolean fd.a(FPoint, FPoint[])>
	//   34   74:ifeq            95
					flag = fd.a(T.southwest, afpoint);
	//   35   77:aload_0         
	//   36   78:getfield        #154 <Field FPointBounds T>
	//   37   81:getfield        #375 <Field FPoint FPointBounds.southwest>
	//   38   84:aload_1         
	//   39   85:invokestatic    #372 <Method boolean fd.a(FPoint, FPoint[])>
	//   40   88:istore_3        
				}
	//*  41   89:iload_3         
	//*  42   90:ifeq            95
	//*  43   93:iconst_0        
	//*  44   94:ireturn         
	//*  45   95:iconst_1        
	//*  46   96:ireturn         
	//*  47   97:iconst_0        
	//*  48   98:ireturn         
				// Misplaced declaration of an exception variable
				catch(FPoint afpoint[])
	//*  49   99:astore_1        
				{
					return false;
	//   50  100:iconst_0        
	//   51  101:ireturn         
				}
				if(flag)
					return false;
			}
			return true;
		}
		return false;
	}

	private FPoint b(LatLng latlng)
	{
		IPoint ipoint = IPoint.obtain();
	//    0    0:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//    1    3:astore_2        
		e.e().a(latlng.latitude, latlng.longitude, ipoint);
	//    2    4:aload_0         
	//    3    5:getfield        #180 <Field q e>
	//    4    8:invokevirtual   #225 <Method s q.e()>
	//    5   11:aload_1         
	//    6   12:getfield        #387 <Field double LatLng.latitude>
	//    7   15:aload_1         
	//    8   16:getfield        #390 <Field double LatLng.longitude>
	//    9   19:aload_2         
	//   10   20:invokeinterface #393 <Method void s.a(double, double, IPoint)>
		latlng = ((LatLng) (FPoint.obtain()));
	//   11   25:invokestatic    #396 <Method FPoint FPoint.obtain()>
	//   12   28:astore_1        
		e.e().a(ipoint.x, ipoint.y, ((FPoint) (latlng)));
	//   13   29:aload_0         
	//   14   30:getfield        #180 <Field q e>
	//   15   33:invokevirtual   #225 <Method s q.e()>
	//   16   36:aload_2         
	//   17   37:getfield        #398 <Field int IPoint.x>
	//   18   40:aload_2         
	//   19   41:getfield        #400 <Field int IPoint.y>
	//   20   44:aload_1         
	//   21   45:invokeinterface #403 <Method void s.a(int, int, FPoint)>
		ipoint.recycle();
	//   22   50:aload_2         
	//   23   51:invokevirtual   #406 <Method void IPoint.recycle()>
		return ((FPoint) (latlng));
	//   24   54:aload_1         
	//   25   55:areturn         
	}

	private void b(float f1, MapConfig mapconfig)
	{
		FPoint afpoint[];
		int ai[] = new int[m.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field List m>
	//    2    4:invokeinterface #274 <Method int List.size()>
	//    3    9:newarray        int[]
	//    4   11:astore          4
		for(int i1 = 0; i1 < m.size(); i1++)
	//*   5   13:iconst_0        
	//*   6   14:istore_3        
	//*   7   15:iload_3         
	//*   8   16:aload_0         
	//*   9   17:getfield        #102 <Field List m>
	//*  10   20:invokeinterface #274 <Method int List.size()>
	//*  11   25:icmpge          55
			ai[i1] = ((Integer)m.get(i1)).intValue();
	//   12   28:aload           4
	//   13   30:iload_3         
	//   14   31:aload_0         
	//   15   32:getfield        #102 <Field List m>
	//   16   35:iload_3         
	//   17   36:invokeinterface #325 <Method Object List.get(int)>
	//   18   41:checkcast       #327 <Class Integer>
	//   19   44:invokevirtual   #330 <Method int Integer.intValue()>
	//   20   47:iastore         

	//   21   48:iload_3         
	//   22   49:iconst_1        
	//   23   50:iadd            
	//   24   51:istore_3        
	//*  25   52:goto            15
		afpoint = mapconfig.getGeoRectangle().getClipMapRect();
	//   26   55:aload_2         
	//   27   56:invokevirtual   #306 <Method Rectangle MapConfig.getGeoRectangle()>
	//   28   59:invokevirtual   #312 <Method FPoint[] Rectangle.getClipMapRect()>
	//   29   62:astore          5
		mapconfig = ((MapConfig) (h));
	//   30   64:aload_0         
	//   31   65:getfield        #92  <Field List h>
	//   32   68:astore_2        
		if(!a(afpoint))
			break MISSING_BLOCK_LABEL_110;
	//   33   69:aload_0         
	//   34   70:aload           5
	//   35   72:invokespecial   #315 <Method boolean a(FPoint[])>
	//   36   75:ifeq            110
		Object obj = r;
	//   37   78:aload_0         
	//   38   79:getfield        #110 <Field Object r>
	//   39   82:astore          4
		obj;
	//   40   84:aload           4
		JVM INSTR monitorenter ;
	//   41   86:monitorenter    
		mapconfig = ((MapConfig) (fd.b(afpoint, h, false)));
	//   42   87:aload           5
	//   43   89:aload_0         
	//   44   90:getfield        #92  <Field List h>
	//   45   93:iconst_0        
	//   46   94:invokestatic    #318 <Method List fd.b(FPoint[], List, boolean)>
	//   47   97:astore_2        
		obj;
	//   48   98:aload           4
		JVM INSTR monitorexit ;
	//   49  100:monitorexit     
		break MISSING_BLOCK_LABEL_110;
	//   50  101:goto            110
		mapconfig;
	//   51  104:astore_2        
	//*  52  105:aload           4
		throw mapconfig;
	//   53  107:monitorexit     
	//   54  108:aload_2         
	//   55  109:athrow          
		if(((List) (mapconfig)).size() < 2) goto _L2; else goto _L1
	//   56  110:aload_2         
	//   57  111:invokeinterface #274 <Method int List.size()>
	//   58  116:iconst_2        
	//   59  117:icmplt          246
_L1:
		d(((List) (mapconfig)));
	//   60  120:aload_0         
	//   61  121:aload_2         
	//   62  122:invokespecial   #321 <Method void d(List)>
		mapconfig = ((MapConfig) (new int[o.size()]));
	//   63  125:aload_0         
	//   64  126:getfield        #106 <Field List o>
	//   65  129:invokeinterface #274 <Method int List.size()>
	//   66  134:newarray        int[]
	//   67  136:astore_2        
		int j1;
		j1 = 0;
	//   68  137:iconst_0        
	//   69  138:istore_3        
		do
		{
			try
			{
				if(j1 >= mapconfig.length)
					break;
	//   70  139:iload_3         
	//   71  140:aload_2         
	//   72  141:arraylength     
	//   73  142:icmpge          171
				mapconfig[j1] = ((Integer)o.get(j1)).intValue();
	//   74  145:aload_2         
	//   75  146:iload_3         
	//   76  147:aload_0         
	//   77  148:getfield        #106 <Field List o>
	//   78  151:iload_3         
	//   79  152:invokeinterface #325 <Method Object List.get(int)>
	//   80  157:checkcast       #327 <Class Integer>
	//   81  160:invokevirtual   #330 <Method int Integer.intValue()>
	//   82  163:iastore         
			}
	//*  83  164:iload_3         
	//*  84  165:iconst_1        
	//*  85  166:iadd            
	//*  86  167:istore_3        
	//*  87  168:goto            139
	//*  88  171:aload_0         
	//*  89  172:getfield        #332 <Field int[] Q>
	//*  90  175:ifnull          253
	//*  91  178:iconst_1        
	//*  92  179:istore_3        
	//*  93  180:goto            183
	//*  94  183:iload_3         
	//*  95  184:iconst_1        
	//*  96  185:iand            
	//*  97  186:ifeq            246
	//*  98  189:aload_0         
	//*  99  190:getfield        #334 <Field float[] P>
	//* 100  193:aload_0         
	//* 101  194:getfield        #174 <Field int b>
	//* 102  197:fload_1         
	//* 103  198:aload_2         
	//* 104  199:aload_2         
	//* 105  200:arraylength     
	//* 106  201:aload_0         
	//* 107  202:getfield        #332 <Field int[] Q>
	//* 108  205:aload_0         
	//* 109  206:getfield        #332 <Field int[] Q>
	//* 110  209:arraylength     
	//* 111  210:aload_0         
	//* 112  211:getfield        #180 <Field q e>
	//* 113  214:invokevirtual   #225 <Method s q.e()>
	//* 114  217:invokeinterface #408 <Method int s.d()>
	//* 115  222:aload_0         
	//* 116  223:getfield        #180 <Field q e>
	//* 117  226:invokevirtual   #337 <Method float[] q.f()>
	//* 118  229:aload_0         
	//* 119  230:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//* 120  233:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//* 121  236:aload_0         
	//* 122  237:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//* 123  240:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//* 124  243:invokestatic    #412 <Method void AMapNativeRenderer.nativeDrawGradientColorLine(float[], int, float, int[], int, int[], int, int, float[], int, int)>
	//* 125  246:return          
			// Misplaced declaration of an exception variable
			catch(MapConfig mapconfig)
	//* 126  247:astore_2        
			{
				((Throwable) (mapconfig)).printStackTrace();
	//  127  248:aload_2         
	//  128  249:invokevirtual   #348 <Method void Throwable.printStackTrace()>
				return;
	//  129  252:return          
			}
			j1++;
		} while(true);
		if(Q != null)
			j1 = 1;
		else
			j1 = 0;
	//  130  253:iconst_0        
	//  131  254:istore_3        
		if(!(j1 & true)) goto _L2; else goto _L3
_L3:
		AMapNativeRenderer.nativeDrawGradientColorLine(P, b, f1, ((int []) (mapconfig)), mapconfig.length, Q, Q.length, e.e().d(), e.f(), X.getTypeValue(), W.getTypeValue());
_L2:
	//* 132  255:goto            183
	}

	private void b(MapConfig mapconfig)
	{
		float f1 = e.e().c().getMapLenWithWin((int)G);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field q e>
	//    2    4:invokevirtual   #225 <Method s q.e()>
	//    3    7:invokeinterface #416 <Method GLMapState s.c()>
	//    4   12:aload_0         
	//    5   13:getfield        #142 <Field float G>
	//    6   16:f2i             
	//    7   17:invokevirtual   #422 <Method float GLMapState.getMapLenWithWin(int)>
	//    8   20:fstore_2        
		switch(B)
	//*   9   21:aload_0         
	//*  10   22:getfield        #130 <Field int B>
		{
	//*  11   25:tableswitch     0 5: default 64
	//	               0 65
	//	               1 94
	//	               2 72
	//	               3 115
	//	               4 122
	//	               5 129
		default:
			return;
	//   12   64:return          

		case 0: // '\0'
			f(f1, mapconfig);
	//   13   65:aload_0         
	//   14   66:fload_2         
	//   15   67:aload_1         
	//   16   68:invokespecial   #424 <Method void f(float, MapConfig)>
			return;
	//   17   71:return          

		case 2: // '\002'
			if(F == -1)
	//*  18   72:aload_0         
	//*  19   73:getfield        #139 <Field int F>
	//*  20   76:iconst_m1       
	//*  21   77:icmpne          87
			{
				f(f1, mapconfig);
	//   22   80:aload_0         
	//   23   81:fload_2         
	//   24   82:aload_1         
	//   25   83:invokespecial   #424 <Method void f(float, MapConfig)>
				return;
	//   26   86:return          
			} else
			{
				e(f1, mapconfig);
	//   27   87:aload_0         
	//   28   88:fload_2         
	//   29   89:aload_1         
	//   30   90:invokespecial   #426 <Method void e(float, MapConfig)>
				return;
	//   31   93:return          
			}

		case 1: // '\001'
			if(A)
	//*  32   94:aload_0         
	//*  33   95:getfield        #128 <Field boolean A>
	//*  34   98:ifeq            108
			{
				d(f1, mapconfig);
	//   35  101:aload_0         
	//   36  102:fload_2         
	//   37  103:aload_1         
	//   38  104:invokespecial   #428 <Method void d(float, MapConfig)>
				return;
	//   39  107:return          
			} else
			{
				f(f1, mapconfig);
	//   40  108:aload_0         
	//   41  109:fload_2         
	//   42  110:aload_1         
	//   43  111:invokespecial   #424 <Method void f(float, MapConfig)>
				return;
	//   44  114:return          
			}

		case 3: // '\003'
			c(f1, mapconfig);
	//   45  115:aload_0         
	//   46  116:fload_2         
	//   47  117:aload_1         
	//   48  118:invokespecial   #430 <Method void c(float, MapConfig)>
			return;
	//   49  121:return          

		case 4: // '\004'
			b(f1, mapconfig);
	//   50  122:aload_0         
	//   51  123:fload_2         
	//   52  124:aload_1         
	//   53  125:invokespecial   #432 <Method void b(float, MapConfig)>
			return;
	//   54  128:return          

		case 5: // '\005'
			break;
		}
		if(A)
	//*  55  129:aload_0         
	//*  56  130:getfield        #128 <Field boolean A>
	//*  57  133:ifeq            143
		{
			a(f1, mapconfig);
	//   58  136:aload_0         
	//   59  137:fload_2         
	//   60  138:aload_1         
	//   61  139:invokespecial   #434 <Method void a(float, MapConfig)>
			return;
	//   62  142:return          
		} else
		{
			c(f1, mapconfig);
	//   63  143:aload_0         
	//   64  144:fload_2         
	//   65  145:aload_1         
	//   66  146:invokespecial   #430 <Method void c(float, MapConfig)>
			return;
	//   67  149:return          
		}
	}

	private void c(float f1, MapConfig mapconfig)
	{
		FPoint afpoint[];
		int ai[] = new int[m.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field List m>
	//    2    4:invokeinterface #274 <Method int List.size()>
	//    3    9:newarray        int[]
	//    4   11:astore          4
		for(int i1 = 0; i1 < m.size(); i1++)
	//*   5   13:iconst_0        
	//*   6   14:istore_3        
	//*   7   15:iload_3         
	//*   8   16:aload_0         
	//*   9   17:getfield        #102 <Field List m>
	//*  10   20:invokeinterface #274 <Method int List.size()>
	//*  11   25:icmpge          55
			ai[i1] = ((Integer)m.get(i1)).intValue();
	//   12   28:aload           4
	//   13   30:iload_3         
	//   14   31:aload_0         
	//   15   32:getfield        #102 <Field List m>
	//   16   35:iload_3         
	//   17   36:invokeinterface #325 <Method Object List.get(int)>
	//   18   41:checkcast       #327 <Class Integer>
	//   19   44:invokevirtual   #330 <Method int Integer.intValue()>
	//   20   47:iastore         

	//   21   48:iload_3         
	//   22   49:iconst_1        
	//   23   50:iadd            
	//   24   51:istore_3        
	//*  25   52:goto            15
		afpoint = mapconfig.getGeoRectangle().getClipMapRect();
	//   26   55:aload_2         
	//   27   56:invokevirtual   #306 <Method Rectangle MapConfig.getGeoRectangle()>
	//   28   59:invokevirtual   #312 <Method FPoint[] Rectangle.getClipMapRect()>
	//   29   62:astore          5
		mapconfig = ((MapConfig) (h));
	//   30   64:aload_0         
	//   31   65:getfield        #92  <Field List h>
	//   32   68:astore_2        
		if(!a(afpoint))
			break MISSING_BLOCK_LABEL_110;
	//   33   69:aload_0         
	//   34   70:aload           5
	//   35   72:invokespecial   #315 <Method boolean a(FPoint[])>
	//   36   75:ifeq            110
		Object obj = r;
	//   37   78:aload_0         
	//   38   79:getfield        #110 <Field Object r>
	//   39   82:astore          4
		obj;
	//   40   84:aload           4
		JVM INSTR monitorenter ;
	//   41   86:monitorenter    
		mapconfig = ((MapConfig) (fd.b(afpoint, h, false)));
	//   42   87:aload           5
	//   43   89:aload_0         
	//   44   90:getfield        #92  <Field List h>
	//   45   93:iconst_0        
	//   46   94:invokestatic    #318 <Method List fd.b(FPoint[], List, boolean)>
	//   47   97:astore_2        
		obj;
	//   48   98:aload           4
		JVM INSTR monitorexit ;
	//   49  100:monitorexit     
		break MISSING_BLOCK_LABEL_110;
	//   50  101:goto            110
		mapconfig;
	//   51  104:astore_2        
	//*  52  105:aload           4
		throw mapconfig;
	//   53  107:monitorexit     
	//   54  108:aload_2         
	//   55  109:athrow          
		if(((List) (mapconfig)).size() < 2) goto _L2; else goto _L1
	//   56  110:aload_2         
	//   57  111:invokeinterface #274 <Method int List.size()>
	//   58  116:iconst_2        
	//   59  117:icmplt          246
_L1:
		d(((List) (mapconfig)));
	//   60  120:aload_0         
	//   61  121:aload_2         
	//   62  122:invokespecial   #321 <Method void d(List)>
		mapconfig = ((MapConfig) (new int[o.size()]));
	//   63  125:aload_0         
	//   64  126:getfield        #106 <Field List o>
	//   65  129:invokeinterface #274 <Method int List.size()>
	//   66  134:newarray        int[]
	//   67  136:astore_2        
		int j1;
		j1 = 0;
	//   68  137:iconst_0        
	//   69  138:istore_3        
		do
		{
			try
			{
				if(j1 >= mapconfig.length)
					break;
	//   70  139:iload_3         
	//   71  140:aload_2         
	//   72  141:arraylength     
	//   73  142:icmpge          171
				mapconfig[j1] = ((Integer)o.get(j1)).intValue();
	//   74  145:aload_2         
	//   75  146:iload_3         
	//   76  147:aload_0         
	//   77  148:getfield        #106 <Field List o>
	//   78  151:iload_3         
	//   79  152:invokeinterface #325 <Method Object List.get(int)>
	//   80  157:checkcast       #327 <Class Integer>
	//   81  160:invokevirtual   #330 <Method int Integer.intValue()>
	//   82  163:iastore         
			}
	//*  83  164:iload_3         
	//*  84  165:iconst_1        
	//*  85  166:iadd            
	//*  86  167:istore_3        
	//*  87  168:goto            139
	//*  88  171:aload_0         
	//*  89  172:getfield        #332 <Field int[] Q>
	//*  90  175:ifnull          253
	//*  91  178:iconst_1        
	//*  92  179:istore_3        
	//*  93  180:goto            183
	//*  94  183:iload_3         
	//*  95  184:iconst_1        
	//*  96  185:iand            
	//*  97  186:ifeq            246
	//*  98  189:aload_0         
	//*  99  190:getfield        #334 <Field float[] P>
	//* 100  193:aload_0         
	//* 101  194:getfield        #174 <Field int b>
	//* 102  197:fload_1         
	//* 103  198:aload_0         
	//* 104  199:getfield        #180 <Field q e>
	//* 105  202:invokevirtual   #225 <Method s q.e()>
	//* 106  205:invokeinterface #408 <Method int s.d()>
	//* 107  210:aload_2         
	//* 108  211:aload_2         
	//* 109  212:arraylength     
	//* 110  213:aload_0         
	//* 111  214:getfield        #332 <Field int[] Q>
	//* 112  217:aload_0         
	//* 113  218:getfield        #332 <Field int[] Q>
	//* 114  221:arraylength     
	//* 115  222:aload_0         
	//* 116  223:getfield        #180 <Field q e>
	//* 117  226:invokevirtual   #337 <Method float[] q.f()>
	//* 118  229:aload_0         
	//* 119  230:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//* 120  233:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//* 121  236:aload_0         
	//* 122  237:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//* 123  240:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//* 124  243:invokestatic    #438 <Method void AMapNativeRenderer.nativeDrawLineByMultiColor(float[], int, float, int, int[], int, int[], int, float[], int, int)>
	//* 125  246:return          
			// Misplaced declaration of an exception variable
			catch(MapConfig mapconfig)
	//* 126  247:astore_2        
			{
				((Throwable) (mapconfig)).printStackTrace();
	//  127  248:aload_2         
	//  128  249:invokevirtual   #348 <Method void Throwable.printStackTrace()>
				return;
	//  129  252:return          
			}
			j1++;
		} while(true);
		if(Q != null)
			j1 = 1;
		else
			j1 = 0;
	//  130  253:iconst_0        
	//  131  254:istore_3        
		if(!(j1 & true)) goto _L2; else goto _L3
_L3:
		AMapNativeRenderer.nativeDrawLineByMultiColor(P, b, f1, e.e().d(), ((int []) (mapconfig)), mapconfig.length, Q, Q.length, e.f(), X.getTypeValue(), W.getTypeValue());
_L2:
	//* 132  255:goto            183
	}

	private void d(float f1, MapConfig mapconfig)
	{
		if(w)
			break MISSING_BLOCK_LABEL_74;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean w>
	//    2    4:ifne            74
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(q == null)
			break MISSING_BLOCK_LABEL_64;
	//    5    9:aload_0         
	//    6   10:getfield        #108 <Field BitmapDescriptor q>
	//    7   13:ifnull          47
		boolean flag;
		Object obj;
		FPoint afpoint[];
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*   8   16:getstatic       #281 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          12
	//*  10   21:icmplt          311
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_3        
		else
	//*  13   26:goto            29
	//*  14   29:aload_0         
	//*  15   30:aload_0         
	//*  16   31:iload_3         
	//*  17   32:aload_0         
	//*  18   33:getfield        #108 <Field BitmapDescriptor q>
	//*  19   36:invokespecial   #296 <Method int a(boolean, BitmapDescriptor)>
	//*  20   39:putfield        #132 <Field int C>
	//*  21   42:aload_0         
	//*  22   43:iconst_1        
	//*  23   44:putfield        #120 <Field boolean w>
	//*  24   47:goto            64
	//*  25   50:astore_2        
	//*  26   51:aload_2         
	//*  27   52:ldc2            #298 <String "MarkerDelegateImp">
	//*  28   55:ldc2            #300 <String "loadtexture">
	//*  29   58:invokestatic    #199 <Method void hm.c(Throwable, String, String)>
	//*  30   61:aload_0         
	//*  31   62:monitorexit     
	//*  32   63:return          
	//*  33   64:aload_0         
	//*  34   65:monitorexit     
	//*  35   66:goto            74
	//*  36   69:astore_2        
	//*  37   70:aload_0         
	//*  38   71:monitorexit     
	//*  39   72:aload_2         
	//*  40   73:athrow          
	//*  41   74:aload_2         
	//*  42   75:invokevirtual   #442 <Method double MapConfig.getChangeRatio()>
	//*  43   78:dconst_1        
	//*  44   79:dcmpl           
	//*  45   80:ifne            171
	//*  46   83:aload_0         
	//*  47   84:getfield        #334 <Field float[] P>
	//*  48   87:ifnull          171
	//*  49   90:aload_0         
	//*  50   91:aload_0         
	//*  51   92:getfield        #158 <Field int V>
	//*  52   95:iconst_1        
	//*  53   96:iadd            
	//*  54   97:putfield        #158 <Field int V>
	//*  55  100:aload_0         
	//*  56  101:getfield        #158 <Field int V>
	//*  57  104:iconst_2        
	//*  58  105:icmple          171
	//*  59  108:aload_0         
	//*  60  109:getfield        #334 <Field float[] P>
	//*  61  112:aload_0         
	//*  62  113:getfield        #174 <Field int b>
	//*  63  116:fload_1         
	//*  64  117:aload_0         
	//*  65  118:getfield        #132 <Field int C>
	//*  66  121:aload_0         
	//*  67  122:getfield        #444 <Field float K>
	//*  68  125:aload_0         
	//*  69  126:getfield        #446 <Field float L>
	//*  70  129:aload_0         
	//*  71  130:getfield        #448 <Field float M>
	//*  72  133:aload_0         
	//*  73  134:getfield        #450 <Field float J>
	//*  74  137:fconst_1        
	//*  75  138:aload_0         
	//*  76  139:getfield        #148 <Field float N>
	//*  77  142:fsub            
	//*  78  143:iconst_0        
	//*  79  144:iconst_0        
	//*  80  145:iconst_0        
	//*  81  146:aload_0         
	//*  82  147:getfield        #180 <Field q e>
	//*  83  150:invokevirtual   #337 <Method float[] q.f()>
	//*  84  153:aload_0         
	//*  85  154:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//*  86  157:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//*  87  160:aload_0         
	//*  88  161:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//*  89  164:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//*  90  167:invokestatic    #454 <Method void AMapNativeRenderer.nativeDrawLineByTextureID(float[], int, float, int, float, float, float, float, float, boolean, boolean, boolean, float[], int, int)>
	//*  91  170:return          
	//*  92  171:aload_0         
	//*  93  172:iconst_0        
	//*  94  173:putfield        #158 <Field int V>
	//*  95  176:aload_2         
	//*  96  177:invokevirtual   #306 <Method Rectangle MapConfig.getGeoRectangle()>
	//*  97  180:invokevirtual   #312 <Method FPoint[] Rectangle.getClipMapRect()>
	//*  98  183:astore          5
	//*  99  185:aload_0         
	//* 100  186:getfield        #92  <Field List h>
	//* 101  189:astore_2        
	//* 102  190:aload_0         
	//* 103  191:aload           5
	//* 104  193:invokespecial   #315 <Method boolean a(FPoint[])>
	//* 105  196:ifeq            231
	//* 106  199:aload_0         
	//* 107  200:getfield        #110 <Field Object r>
	//* 108  203:astore          4
	//* 109  205:aload           4
	//* 110  207:monitorenter    
	//* 111  208:aload           5
	//* 112  210:aload_0         
	//* 113  211:getfield        #92  <Field List h>
	//* 114  214:iconst_0        
	//* 115  215:invokestatic    #456 <Method List fd.a(FPoint[], List, boolean)>
	//* 116  218:astore_2        
	//* 117  219:aload           4
	//* 118  221:monitorexit     
	//* 119  222:goto            231
	//* 120  225:astore_2        
	//* 121  226:aload           4
	//* 122  228:monitorexit     
	//* 123  229:aload_2         
	//* 124  230:athrow          
	//* 125  231:aload_2         
	//* 126  232:invokeinterface #274 <Method int List.size()>
	//* 127  237:iconst_2        
	//* 128  238:icmplt          308
	//* 129  241:aload_0         
	//* 130  242:aload_2         
	//* 131  243:invokespecial   #321 <Method void d(List)>
	//* 132  246:aload_0         
	//* 133  247:getfield        #334 <Field float[] P>
	//* 134  250:aload_0         
	//* 135  251:getfield        #174 <Field int b>
	//* 136  254:fload_1         
	//* 137  255:aload_0         
	//* 138  256:getfield        #132 <Field int C>
	//* 139  259:aload_0         
	//* 140  260:getfield        #444 <Field float K>
	//* 141  263:aload_0         
	//* 142  264:getfield        #446 <Field float L>
	//* 143  267:aload_0         
	//* 144  268:getfield        #448 <Field float M>
	//* 145  271:aload_0         
	//* 146  272:getfield        #450 <Field float J>
	//* 147  275:fconst_1        
	//* 148  276:aload_0         
	//* 149  277:getfield        #148 <Field float N>
	//* 150  280:fsub            
	//* 151  281:iconst_0        
	//* 152  282:iconst_0        
	//* 153  283:iconst_0        
	//* 154  284:aload_0         
	//* 155  285:getfield        #180 <Field q e>
	//* 156  288:invokevirtual   #337 <Method float[] q.f()>
	//* 157  291:aload_0         
	//* 158  292:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//* 159  295:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//* 160  298:aload_0         
	//* 161  299:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//* 162  302:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//* 163  305:invokestatic    #454 <Method void AMapNativeRenderer.nativeDrawLineByTextureID(float[], int, float, int, float, float, float, float, float, boolean, boolean, boolean, float[], int, int)>
	//* 164  308:return          
	//* 165  309:astore_2        
	//* 166  310:return          
			flag = false;
	//  167  311:iconst_0        
	//  168  312:istore_3        
		try
		{
			C = a(flag, q);
			w = true;
			break MISSING_BLOCK_LABEL_64;
		}
		// Misplaced declaration of an exception variable
		catch(MapConfig mapconfig) { }
		hm.c(((Throwable) (mapconfig)), "MarkerDelegateImp", "loadtexture");
		this;
		JVM INSTR monitorexit ;
		return;
		this;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_74;
		mapconfig;
		throw mapconfig;
		try
		{
			if(mapconfig.getChangeRatio() == 1.0D && P != null)
			{
				V = V + 1;
				if(V > 2)
				{
					AMapNativeRenderer.nativeDrawLineByTextureID(P, b, f1, C, K, L, M, J, 1.0F - N, false, false, false, e.f(), X.getTypeValue(), W.getTypeValue());
					return;
				}
			}
		}
		// Misplaced declaration of an exception variable
		catch(MapConfig mapconfig)
		{
			return;
		}
		V = 0;
		afpoint = mapconfig.getGeoRectangle().getClipMapRect();
		mapconfig = ((MapConfig) (h));
		if(!a(afpoint))
			break MISSING_BLOCK_LABEL_231;
		obj = r;
		obj;
		JVM INSTR monitorenter ;
		mapconfig = ((MapConfig) (fd.a(afpoint, h, false)));
		obj;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_231;
		mapconfig;
		throw mapconfig;
		if(((List) (mapconfig)).size() >= 2)
		{
			d(((List) (mapconfig)));
			AMapNativeRenderer.nativeDrawLineByTextureID(P, b, f1, C, K, L, M, J, 1.0F - N, false, false, false, e.f(), X.getTypeValue(), W.getTypeValue());
		}
		return;
	//* 169  313:goto            29
	}

	private void d(List list)
		throws RemoteException
	{
		c.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field ArrayList c>
	//    2    4:invokevirtual   #459 <Method void ArrayList.clear()>
		int l1 = list.size();
	//    3    7:aload_1         
	//    4    8:invokeinterface #274 <Method int List.size()>
	//    5   13:istore_3        
		if(l1 < 2)
	//*   6   14:iload_3         
	//*   7   15:iconst_2        
	//*   8   16:icmpge          20
			return;
	//    9   19:return          
		FPoint fpoint = (FPoint)list.get(0);
	//   10   20:aload_1         
	//   11   21:iconst_0        
	//   12   22:invokeinterface #325 <Method Object List.get(int)>
	//   13   27:checkcast       #213 <Class FPoint>
	//   14   30:astore          8
		c.add(((Object) (fpoint)));
	//   15   32:aload_0         
	//   16   33:getfield        #176 <Field ArrayList c>
	//   17   36:aload           8
	//   18   38:invokevirtual   #460 <Method boolean ArrayList.add(Object)>
	//   19   41:pop             
		for(int i1 = 1; i1 < l1 - 1; i1++)
	//*  20   42:iconst_1        
	//*  21   43:istore_2        
	//*  22   44:iload_2         
	//*  23   45:iload_3         
	//*  24   46:iconst_1        
	//*  25   47:isub            
	//*  26   48:icmpge          122
		{
			FPoint fpoint2 = (FPoint)list.get(i1);
	//   27   51:aload_1         
	//   28   52:iload_2         
	//   29   53:invokeinterface #325 <Method Object List.get(int)>
	//   30   58:checkcast       #213 <Class FPoint>
	//   31   61:astore          9
			if(i1 == 1 || a(fpoint, fpoint2))
	//*  32   63:iload_2         
	//*  33   64:iconst_1        
	//*  34   65:icmpeq          79
	//*  35   68:aload_0         
	//*  36   69:aload           8
	//*  37   71:aload           9
	//*  38   73:invokespecial   #462 <Method boolean a(FPoint, FPoint)>
	//*  39   76:ifeq            96
			{
				c.add(((Object) (fpoint2)));
	//   40   79:aload_0         
	//   41   80:getfield        #176 <Field ArrayList c>
	//   42   83:aload           9
	//   43   85:invokevirtual   #460 <Method boolean ArrayList.add(Object)>
	//   44   88:pop             
				fpoint = fpoint2;
	//   45   89:aload           9
	//   46   91:astore          8
			} else
	//*  47   93:goto            115
			{
				c.set(c.size() - 1, ((Object) (fpoint2)));
	//   48   96:aload_0         
	//   49   97:getfield        #176 <Field ArrayList c>
	//   50  100:aload_0         
	//   51  101:getfield        #176 <Field ArrayList c>
	//   52  104:invokevirtual   #463 <Method int ArrayList.size()>
	//   53  107:iconst_1        
	//   54  108:isub            
	//   55  109:aload           9
	//   56  111:invokevirtual   #467 <Method Object ArrayList.set(int, Object)>
	//   57  114:pop             
			}
		}

	//   58  115:iload_2         
	//   59  116:iconst_1        
	//   60  117:iadd            
	//   61  118:istore_2        
	//*  62  119:goto            44
		c.add(list.get(l1 - 1));
	//   63  122:aload_0         
	//   64  123:getfield        #176 <Field ArrayList c>
	//   65  126:aload_1         
	//   66  127:iload_3         
	//   67  128:iconst_1        
	//   68  129:isub            
	//   69  130:invokeinterface #325 <Method Object List.get(int)>
	//   70  135:invokevirtual   #460 <Method boolean ArrayList.add(Object)>
	//   71  138:pop             
		int i3 = c.size() * 3;
	//   72  139:aload_0         
	//   73  140:getfield        #176 <Field ArrayList c>
	//   74  143:invokevirtual   #463 <Method int ArrayList.size()>
	//   75  146:iconst_3        
	//   76  147:imul            
	//   77  148:istore          7
		b = i3;
	//   78  150:aload_0         
	//   79  151:iload           7
	//   80  153:putfield        #174 <Field int b>
		if(P == null || P.length < b)
	//*  81  156:aload_0         
	//*  82  157:getfield        #334 <Field float[] P>
	//*  83  160:ifnull          178
	//*  84  163:aload_0         
	//*  85  164:getfield        #334 <Field float[] P>
	//*  86  167:arraylength     
	//*  87  168:aload_0         
	//*  88  169:getfield        #174 <Field int b>
	//*  89  172:icmplt          178
	//*  90  175:goto            186
			P = new float[i3];
	//   91  178:aload_0         
	//   92  179:iload           7
	//   93  181:newarray        float[]
	//   94  183:putfield        #334 <Field float[] P>
		if(B == 5 || B == 3 || B == 4)
	//*  95  186:aload_0         
	//*  96  187:getfield        #130 <Field int B>
	//*  97  190:iconst_5        
	//*  98  191:icmpeq          210
	//*  99  194:aload_0         
	//* 100  195:getfield        #130 <Field int B>
	//* 101  198:iconst_3        
	//* 102  199:icmpeq          210
	//* 103  202:aload_0         
	//* 104  203:getfield        #130 <Field int B>
	//* 105  206:iconst_4        
	//* 106  207:icmpne          429
		{
			list = ((List) (new int[c.size()]));
	//  107  210:aload_0         
	//  108  211:getfield        #176 <Field ArrayList c>
	//  109  214:invokevirtual   #463 <Method int ArrayList.size()>
	//  110  217:newarray        int[]
	//  111  219:astore_1        
			ArrayList arraylist = new ArrayList();
	//  112  220:new             #87  <Class ArrayList>
	//  113  223:dup             
	//  114  224:invokespecial   #88  <Method void ArrayList()>
	//  115  227:astore          8
			int j1 = 0;
	//  116  229:iconst_0        
	//  117  230:istore_2        
			int k2 = 0;
	//  118  231:iconst_0        
	//  119  232:istore          5
			for(int j2 = 0; j2 < i3 / 3; j2++)
	//* 120  234:iconst_0        
	//* 121  235:istore          4
	//* 122  237:iload           4
	//* 123  239:iload           7
	//* 124  241:iconst_3        
	//* 125  242:idiv            
	//* 126  243:icmpge          388
			{
				FPoint3 fpoint3 = (FPoint3)c.get(j2);
	//  127  246:aload_0         
	//  128  247:getfield        #176 <Field ArrayList c>
	//  129  250:iload           4
	//  130  252:invokevirtual   #468 <Method Object ArrayList.get(int)>
	//  131  255:checkcast       #351 <Class FPoint3>
	//  132  258:astore          9
				P[j2 * 3] = fpoint3.x;
	//  133  260:aload_0         
	//  134  261:getfield        #334 <Field float[] P>
	//  135  264:iload           4
	//  136  266:iconst_3        
	//  137  267:imul            
	//  138  268:aload           9
	//  139  270:getfield        #469 <Field float FPoint3.x>
	//  140  273:fastore         
				P[j2 * 3 + 1] = fpoint3.y;
	//  141  274:aload_0         
	//  142  275:getfield        #334 <Field float[] P>
	//  143  278:iload           4
	//  144  280:iconst_3        
	//  145  281:imul            
	//  146  282:iconst_1        
	//  147  283:iadd            
	//  148  284:aload           9
	//  149  286:getfield        #470 <Field float FPoint3.y>
	//  150  289:fastore         
				P[j2 * 3 + 2] = 0.0F;
	//  151  290:aload_0         
	//  152  291:getfield        #334 <Field float[] P>
	//  153  294:iload           4
	//  154  296:iconst_3        
	//  155  297:imul            
	//  156  298:iconst_2        
	//  157  299:iadd            
	//  158  300:fconst_0        
	//  159  301:fastore         
				int l2 = fpoint3.colorIndex;
	//  160  302:aload           9
	//  161  304:getfield        #354 <Field int FPoint3.colorIndex>
	//  162  307:istore          6
				int i2;
				if(j2 == 0)
	//* 163  309:iload           4
	//* 164  311:ifne            333
				{
					((List) (arraylist)).add(((Object) (Integer.valueOf(l2))));
	//  165  314:aload           8
	//  166  316:iload           6
	//  167  318:invokestatic    #474 <Method Integer Integer.valueOf(int)>
	//  168  321:invokeinterface #263 <Method boolean List.add(Object)>
	//  169  326:pop             
					i2 = l2;
	//  170  327:iload           6
	//  171  329:istore_3        
				} else
	//* 172  330:goto            365
				{
					if(l2 == j1)
	//* 173  333:iload           6
	//* 174  335:iload_2         
	//* 175  336:icmpne          342
						continue;
	//  176  339:goto            379
					i2 = l2;
	//  177  342:iload           6
	//  178  344:istore_3        
					if(l2 == -1)
	//* 179  345:iload           6
	//* 180  347:iconst_m1       
	//* 181  348:icmpne          353
						i2 = j1;
	//  182  351:iload_2         
	//  183  352:istore_3        
					((List) (arraylist)).add(((Object) (Integer.valueOf(i2))));
	//  184  353:aload           8
	//  185  355:iload_3         
	//  186  356:invokestatic    #474 <Method Integer Integer.valueOf(int)>
	//  187  359:invokeinterface #263 <Method boolean List.add(Object)>
	//  188  364:pop             
				}
				list[k2] = j2;
	//  189  365:aload_1         
	//  190  366:iload           5
	//  191  368:iload           4
	//  192  370:iastore         
				k2++;
	//  193  371:iload           5
	//  194  373:iconst_1        
	//  195  374:iadd            
	//  196  375:istore          5
				j1 = i2;
	//  197  377:iload_3         
	//  198  378:istore_2        
			}

	//  199  379:iload           4
	//  200  381:iconst_1        
	//  201  382:iadd            
	//  202  383:istore          4
	//* 203  385:goto            237
			Q = new int[((List) (arraylist)).size()];
	//  204  388:aload_0         
	//  205  389:aload           8
	//  206  391:invokeinterface #274 <Method int List.size()>
	//  207  396:newarray        int[]
	//  208  398:putfield        #332 <Field int[] Q>
			System.arraycopy(((Object) (list)), 0, ((Object) (Q)), 0, Q.length);
	//  209  401:aload_1         
	//  210  402:iconst_0        
	//  211  403:aload_0         
	//  212  404:getfield        #332 <Field int[] Q>
	//  213  407:iconst_0        
	//  214  408:aload_0         
	//  215  409:getfield        #332 <Field int[] Q>
	//  216  412:arraylength     
	//  217  413:invokestatic    #480 <Method void System.arraycopy(Object, int, Object, int, int)>
			n = ((List) (arraylist));
	//  218  416:aload_0         
	//  219  417:aload           8
	//  220  419:putfield        #104 <Field List n>
			o = ((List) (arraylist));
	//  221  422:aload_0         
	//  222  423:aload           8
	//  223  425:putfield        #106 <Field List o>
			return;
	//  224  428:return          
		}
		int k1 = 0;
	//  225  429:iconst_0        
	//  226  430:istore_2        
		for(list = ((List) (c.iterator())); ((Iterator) (list)).hasNext();)
	//* 227  431:aload_0         
	//* 228  432:getfield        #176 <Field ArrayList c>
	//* 229  435:invokevirtual   #481 <Method Iterator ArrayList.iterator()>
	//* 230  438:astore_1        
	//* 231  439:aload_1         
	//* 232  440:invokeinterface #290 <Method boolean Iterator.hasNext()>
	//* 233  445:ifeq            505
		{
			FPoint fpoint1 = (FPoint)((Iterator) (list)).next();
	//  234  448:aload_1         
	//  235  449:invokeinterface #294 <Method Object Iterator.next()>
	//  236  454:checkcast       #213 <Class FPoint>
	//  237  457:astore          8
			P[k1 * 3] = fpoint1.x;
	//  238  459:aload_0         
	//  239  460:getfield        #334 <Field float[] P>
	//  240  463:iload_2         
	//  241  464:iconst_3        
	//  242  465:imul            
	//  243  466:aload           8
	//  244  468:getfield        #215 <Field float FPoint.x>
	//  245  471:fastore         
			P[k1 * 3 + 1] = fpoint1.y;
	//  246  472:aload_0         
	//  247  473:getfield        #334 <Field float[] P>
	//  248  476:iload_2         
	//  249  477:iconst_3        
	//  250  478:imul            
	//  251  479:iconst_1        
	//  252  480:iadd            
	//  253  481:aload           8
	//  254  483:getfield        #217 <Field float FPoint.y>
	//  255  486:fastore         
			P[k1 * 3 + 2] = 0.0F;
	//  256  487:aload_0         
	//  257  488:getfield        #334 <Field float[] P>
	//  258  491:iload_2         
	//  259  492:iconst_3        
	//  260  493:imul            
	//  261  494:iconst_2        
	//  262  495:iadd            
	//  263  496:fconst_0        
	//  264  497:fastore         
			k1++;
	//  265  498:iload_2         
	//  266  499:iconst_1        
	//  267  500:iadd            
	//  268  501:istore_2        
		}

	//* 269  502:goto            439
	//  270  505:return          
	}

	private List e(List list)
	{
		int ai[] = new int[list.size()];
	//    0    0:aload_1         
	//    1    1:invokeinterface #274 <Method int List.size()>
	//    2    6:newarray        int[]
	//    3    8:astore          6
		ArrayList arraylist = new ArrayList();
	//    4   10:new             #87  <Class ArrayList>
	//    5   13:dup             
	//    6   14:invokespecial   #88  <Method void ArrayList()>
	//    7   17:astore          7
		int k1 = 0;
	//    8   19:iconst_0        
	//    9   20:istore          4
		int j1 = 0;
	//   10   22:iconst_0        
	//   11   23:istore_3        
		for(int i1 = 0; i1 < list.size(); i1++)
	//*  12   24:iconst_0        
	//*  13   25:istore_2        
	//*  14   26:iload_2         
	//*  15   27:aload_1         
	//*  16   28:invokeinterface #274 <Method int List.size()>
	//*  17   33:icmpge          114
		{
			int l1 = ((Integer)list.get(i1)).intValue();
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:invokeinterface #325 <Method Object List.get(int)>
	//   21   43:checkcast       #327 <Class Integer>
	//   22   46:invokevirtual   #330 <Method int Integer.intValue()>
	//   23   49:istore          5
			if(i1 == 0)
	//*  24   51:iload_2         
	//*  25   52:ifne            71
			{
				((List) (arraylist)).add(((Object) (Integer.valueOf(l1))));
	//   26   55:aload           7
	//   27   57:iload           5
	//   28   59:invokestatic    #474 <Method Integer Integer.valueOf(int)>
	//   29   62:invokeinterface #263 <Method boolean List.add(Object)>
	//   30   67:pop             
			} else
	//*  31   68:goto            94
			{
				if(l1 == k1)
	//*  32   71:iload           5
	//*  33   73:iload           4
	//*  34   75:icmpne          81
					continue;
	//   35   78:goto            107
				((List) (arraylist)).add(((Object) (Integer.valueOf(l1))));
	//   36   81:aload           7
	//   37   83:iload           5
	//   38   85:invokestatic    #474 <Method Integer Integer.valueOf(int)>
	//   39   88:invokeinterface #263 <Method boolean List.add(Object)>
	//   40   93:pop             
			}
			ai[j1] = i1;
	//   41   94:aload           6
	//   42   96:iload_3         
	//   43   97:iload_2         
	//   44   98:iastore         
			k1 = l1;
	//   45   99:iload           5
	//   46  101:istore          4
			j1++;
	//   47  103:iload_3         
	//   48  104:iconst_1        
	//   49  105:iadd            
	//   50  106:istore_3        
		}

	//   51  107:iload_2         
	//   52  108:iconst_1        
	//   53  109:iadd            
	//   54  110:istore_2        
	//*  55  111:goto            26
		Q = new int[((List) (arraylist)).size()];
	//   56  114:aload_0         
	//   57  115:aload           7
	//   58  117:invokeinterface #274 <Method int List.size()>
	//   59  122:newarray        int[]
	//   60  124:putfield        #332 <Field int[] Q>
		System.arraycopy(((Object) (ai)), 0, ((Object) (Q)), 0, Q.length);
	//   61  127:aload           6
	//   62  129:iconst_0        
	//   63  130:aload_0         
	//   64  131:getfield        #332 <Field int[] Q>
	//   65  134:iconst_0        
	//   66  135:aload_0         
	//   67  136:getfield        #332 <Field int[] Q>
	//   68  139:arraylength     
	//   69  140:invokestatic    #480 <Method void System.arraycopy(Object, int, Object, int, int)>
		return ((List) (arraylist));
	//   70  143:aload           7
	//   71  145:areturn         
	}

	private void e()
	{
		float f2 = e.e().getMapConfig().getMapPerPixelUnitLength();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field q e>
	//    2    4:invokevirtual   #225 <Method s q.e()>
	//    3    7:invokeinterface #490 <Method MapConfig s.getMapConfig()>
	//    4   12:invokevirtual   #493 <Method float MapConfig.getMapPerPixelUnitLength()>
	//    5   15:fstore_2        
		if(E > 5000)
	//*   6   16:aload_0         
	//*   7   17:getfield        #137 <Field int E>
	//*   8   20:sipush          5000
	//*   9   23:icmple          85
		{
			if(I <= 12F)
	//*  10   26:aload_0         
	//*  11   27:getfield        #146 <Field float I>
	//*  12   30:ldc2            #494 <Float 12F>
	//*  13   33:fcmpg           
	//*  14   34:ifgt            76
			{
				float f1 = G / 2.0F + I / 2.0F;
	//   15   37:aload_0         
	//   16   38:getfield        #142 <Field float G>
	//   17   41:fconst_2        
	//   18   42:fdiv            
	//   19   43:aload_0         
	//   20   44:getfield        #146 <Field float I>
	//   21   47:fconst_2        
	//   22   48:fdiv            
	//   23   49:fadd            
	//   24   50:fstore_1        
				if(f1 > 200F)
	//*  25   51:fload_1         
	//*  26   52:ldc2            #495 <Float 200F>
	//*  27   55:fcmpg           
	//*  28   56:ifgt            62
	//*  29   59:goto            66
					f1 = 200F;
	//   30   62:ldc2            #495 <Float 200F>
	//   31   65:fstore_1        
				O = f2 * f1;
	//   32   66:aload_0         
	//   33   67:fload_2         
	//   34   68:fload_1         
	//   35   69:fmul            
	//   36   70:putfield        #150 <Field float O>
			} else
	//*  37   73:goto            84
			{
				O = 10F * f2;
	//   38   76:aload_0         
	//   39   77:ldc1            #140 <Float 10F>
	//   40   79:fload_2         
	//   41   80:fmul            
	//   42   81:putfield        #150 <Field float O>
			}
			return;
	//   43   84:return          
		} else
		{
			O = 2.0F * f2;
	//   44   85:aload_0         
	//   45   86:fconst_2        
	//   46   87:fload_2         
	//   47   88:fmul            
	//   48   89:putfield        #150 <Field float O>
			return;
	//   49   92:return          
		}
	}

	private void e(float f1, MapConfig mapconfig)
	{
		if(w)
			break MISSING_BLOCK_LABEL_74;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field boolean w>
	//    2    4:ifne            74
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(q == null)
			break MISSING_BLOCK_LABEL_64;
	//    5    9:aload_0         
	//    6   10:getfield        #108 <Field BitmapDescriptor q>
	//    7   13:ifnull          47
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*   8   16:getstatic       #281 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          12
	//*  10   21:icmplt          344
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_3        
		else
	//*  13   26:goto            29
	//*  14   29:aload_0         
	//*  15   30:aload_0         
	//*  16   31:iload_3         
	//*  17   32:aload_0         
	//*  18   33:getfield        #108 <Field BitmapDescriptor q>
	//*  19   36:invokespecial   #296 <Method int a(boolean, BitmapDescriptor)>
	//*  20   39:putfield        #132 <Field int C>
	//*  21   42:aload_0         
	//*  22   43:iconst_1        
	//*  23   44:putfield        #120 <Field boolean w>
	//*  24   47:goto            64
	//*  25   50:astore_2        
	//*  26   51:aload_2         
	//*  27   52:ldc2            #298 <String "MarkerDelegateImp">
	//*  28   55:ldc2            #300 <String "loadtexture">
	//*  29   58:invokestatic    #199 <Method void hm.c(Throwable, String, String)>
	//*  30   61:aload_0         
	//*  31   62:monitorexit     
	//*  32   63:return          
	//*  33   64:aload_0         
	//*  34   65:monitorexit     
	//*  35   66:goto            74
	//*  36   69:astore_2        
	//*  37   70:aload_0         
	//*  38   71:monitorexit     
	//*  39   72:aload_2         
	//*  40   73:athrow          
	//*  41   74:aload_0         
	//*  42   75:getfield        #92  <Field List h>
	//*  43   78:astore          4
	//*  44   80:aload_0         
	//*  45   81:getfield        #180 <Field q e>
	//*  46   84:invokevirtual   #225 <Method s q.e()>
	//*  47   87:astore          5
	//*  48   89:aload           5
	//*  49   91:ifnonnull       95
	//*  50   94:return          
	//*  51   95:aload_2         
	//*  52   96:invokevirtual   #442 <Method double MapConfig.getChangeRatio()>
	//*  53   99:dconst_1        
	//*  54  100:dcmpl           
	//*  55  101:ifne            199
	//*  56  104:aload_0         
	//*  57  105:getfield        #334 <Field float[] P>
	//*  58  108:ifnull          199
	//*  59  111:aload_0         
	//*  60  112:aload_0         
	//*  61  113:getfield        #158 <Field int V>
	//*  62  116:iconst_1        
	//*  63  117:iadd            
	//*  64  118:putfield        #158 <Field int V>
	//*  65  121:aload_0         
	//*  66  122:getfield        #158 <Field int V>
	//*  67  125:iconst_2        
	//*  68  126:icmple          199
	//*  69  129:aload_0         
	//*  70  130:getfield        #334 <Field float[] P>
	//*  71  133:aload_0         
	//*  72  134:getfield        #174 <Field int b>
	//*  73  137:fload_1         
	//*  74  138:aload_0         
	//*  75  139:getfield        #180 <Field q e>
	//*  76  142:invokevirtual   #225 <Method s q.e()>
	//*  77  145:aload_0         
	//*  78  146:getfield        #139 <Field int F>
	//*  79  149:invokeinterface #498 <Method int s.f(int)>
	//*  80  154:aload_0         
	//*  81  155:getfield        #444 <Field float K>
	//*  82  158:aload_0         
	//*  83  159:getfield        #446 <Field float L>
	//*  84  162:aload_0         
	//*  85  163:getfield        #448 <Field float M>
	//*  86  166:aload_0         
	//*  87  167:getfield        #450 <Field float J>
	//*  88  170:fconst_0        
	//*  89  171:iconst_1        
	//*  90  172:iconst_1        
	//*  91  173:iconst_0        
	//*  92  174:aload_0         
	//*  93  175:getfield        #180 <Field q e>
	//*  94  178:invokevirtual   #337 <Method float[] q.f()>
	//*  95  181:aload_0         
	//*  96  182:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//*  97  185:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//*  98  188:aload_0         
	//*  99  189:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//* 100  192:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//* 101  195:invokestatic    #454 <Method void AMapNativeRenderer.nativeDrawLineByTextureID(float[], int, float, int, float, float, float, float, float, boolean, boolean, boolean, float[], int, int)>
	//* 102  198:return          
	//* 103  199:aload_0         
	//* 104  200:iconst_0        
	//* 105  201:putfield        #158 <Field int V>
	//* 106  204:aload_2         
	//* 107  205:invokevirtual   #306 <Method Rectangle MapConfig.getGeoRectangle()>
	//* 108  208:invokevirtual   #312 <Method FPoint[] Rectangle.getClipMapRect()>
	//* 109  211:astore          5
	//* 110  213:aload           4
	//* 111  215:astore_2        
	//* 112  216:aload_0         
	//* 113  217:aload           5
	//* 114  219:invokespecial   #315 <Method boolean a(FPoint[])>
	//* 115  222:ifeq            257
	//* 116  225:aload_0         
	//* 117  226:getfield        #110 <Field Object r>
	//* 118  229:astore          4
	//* 119  231:aload           4
	//* 120  233:monitorenter    
	//* 121  234:aload           5
	//* 122  236:aload_0         
	//* 123  237:getfield        #92  <Field List h>
	//* 124  240:iconst_0        
	//* 125  241:invokestatic    #456 <Method List fd.a(FPoint[], List, boolean)>
	//* 126  244:astore_2        
	//* 127  245:aload           4
	//* 128  247:monitorexit     
	//* 129  248:goto            257
	//* 130  251:astore_2        
	//* 131  252:aload           4
	//* 132  254:monitorexit     
	//* 133  255:aload_2         
	//* 134  256:athrow          
	//* 135  257:aload_2         
	//* 136  258:invokeinterface #274 <Method int List.size()>
	//* 137  263:iconst_2        
	//* 138  264:icmplt          341
	//* 139  267:aload_0         
	//* 140  268:aload_2         
	//* 141  269:invokespecial   #321 <Method void d(List)>
	//* 142  272:aload_0         
	//* 143  273:getfield        #334 <Field float[] P>
	//* 144  276:aload_0         
	//* 145  277:getfield        #174 <Field int b>
	//* 146  280:fload_1         
	//* 147  281:aload_0         
	//* 148  282:getfield        #180 <Field q e>
	//* 149  285:invokevirtual   #225 <Method s q.e()>
	//* 150  288:aload_0         
	//* 151  289:getfield        #139 <Field int F>
	//* 152  292:invokeinterface #498 <Method int s.f(int)>
	//* 153  297:aload_0         
	//* 154  298:getfield        #444 <Field float K>
	//* 155  301:aload_0         
	//* 156  302:getfield        #446 <Field float L>
	//* 157  305:aload_0         
	//* 158  306:getfield        #448 <Field float M>
	//* 159  309:aload_0         
	//* 160  310:getfield        #450 <Field float J>
	//* 161  313:fconst_0        
	//* 162  314:iconst_1        
	//* 163  315:iconst_1        
	//* 164  316:iconst_0        
	//* 165  317:aload_0         
	//* 166  318:getfield        #180 <Field q e>
	//* 167  321:invokevirtual   #337 <Method float[] q.f()>
	//* 168  324:aload_0         
	//* 169  325:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//* 170  328:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//* 171  331:aload_0         
	//* 172  332:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//* 173  335:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//* 174  338:invokestatic    #454 <Method void AMapNativeRenderer.nativeDrawLineByTextureID(float[], int, float, int, float, float, float, float, float, boolean, boolean, boolean, float[], int, int)>
	//* 175  341:return          
	//* 176  342:astore_2        
	//* 177  343:return          
			flag = false;
	//  178  344:iconst_0        
	//  179  345:istore_3        
		try
		{
			C = a(flag, q);
			w = true;
			break MISSING_BLOCK_LABEL_64;
		}
		// Misplaced declaration of an exception variable
		catch(MapConfig mapconfig) { }
		hm.c(((Throwable) (mapconfig)), "MarkerDelegateImp", "loadtexture");
		this;
		JVM INSTR monitorexit ;
		return;
		this;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_74;
		mapconfig;
		throw mapconfig;
		Object obj;
		s s1;
		FPoint afpoint[];
		try
		{
			obj = ((Object) (h));
			s1 = e.e();
		}
		// Misplaced declaration of an exception variable
		catch(MapConfig mapconfig)
		{
			return;
		}
		if(s1 == null)
			return;
		if(mapconfig.getChangeRatio() == 1.0D && P != null)
		{
			V = V + 1;
			if(V > 2)
			{
				AMapNativeRenderer.nativeDrawLineByTextureID(P, b, f1, e.e().f(F), K, L, M, J, 0.0F, true, true, false, e.f(), X.getTypeValue(), W.getTypeValue());
				return;
			}
		}
		V = 0;
		afpoint = mapconfig.getGeoRectangle().getClipMapRect();
		mapconfig = ((MapConfig) (obj));
		if(!a(afpoint))
			break MISSING_BLOCK_LABEL_257;
		obj = r;
		obj;
		JVM INSTR monitorenter ;
		mapconfig = ((MapConfig) (fd.a(afpoint, h, false)));
		obj;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_257;
		mapconfig;
		throw mapconfig;
		if(((List) (mapconfig)).size() >= 2)
		{
			d(((List) (mapconfig)));
			AMapNativeRenderer.nativeDrawLineByTextureID(P, b, f1, e.e().f(F), K, L, M, J, 0.0F, true, true, false, e.f(), X.getTypeValue(), W.getTypeValue());
		}
		return;
	//* 180  346:goto            29
	}

	private int f()
	{
		int ai[] = new int[1];
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:astore_1        
		int[] _tmp = ai;
	//    3    4:aload_1         
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:iconst_0        
	//    7    8:iastore         
	//    8    9:pop             
		ai[0] = 0;
		GLES20.glGenTextures(1, ai, 0);
	//    9   10:iconst_1        
	//   10   11:aload_1         
	//   11   12:iconst_0        
	//   12   13:invokestatic    #504 <Method void GLES20.glGenTextures(int, int[], int)>
		return ai[0];
	//   13   16:aload_1         
	//   14   17:iconst_0        
	//   15   18:iaload          
	//   16   19:ireturn         
	}

	private void f(float f1, MapConfig mapconfig)
	{
		Object obj;
		s s1;
		FPoint afpoint[];
		try
		{
			obj = ((Object) (h));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field List h>
	//    2    4:astore_3        
			s1 = e.e();
	//    3    5:aload_0         
	//    4    6:getfield        #180 <Field q e>
	//    5    9:invokevirtual   #225 <Method s q.e()>
	//    6   12:astore          4
		}
	//*   7   14:aload           4
	//*   8   16:ifnonnull       20
	//*   9   19:return          
	//*  10   20:aload_2         
	//*  11   21:invokevirtual   #442 <Method double MapConfig.getChangeRatio()>
	//*  12   24:dconst_1        
	//*  13   25:dcmpl           
	//*  14   26:ifne            120
	//*  15   29:aload_0         
	//*  16   30:getfield        #334 <Field float[] P>
	//*  17   33:ifnull          120
	//*  18   36:aload_0         
	//*  19   37:aload_0         
	//*  20   38:getfield        #158 <Field int V>
	//*  21   41:iconst_1        
	//*  22   42:iadd            
	//*  23   43:putfield        #158 <Field int V>
	//*  24   46:aload_0         
	//*  25   47:getfield        #158 <Field int V>
	//*  26   50:iconst_2        
	//*  27   51:icmple          120
	//*  28   54:aload_0         
	//*  29   55:getfield        #334 <Field float[] P>
	//*  30   58:aload_0         
	//*  31   59:getfield        #174 <Field int b>
	//*  32   62:fload_1         
	//*  33   63:aload_0         
	//*  34   64:getfield        #180 <Field q e>
	//*  35   67:invokevirtual   #225 <Method s q.e()>
	//*  36   70:invokeinterface #408 <Method int s.d()>
	//*  37   75:aload_0         
	//*  38   76:getfield        #444 <Field float K>
	//*  39   79:aload_0         
	//*  40   80:getfield        #446 <Field float L>
	//*  41   83:aload_0         
	//*  42   84:getfield        #448 <Field float M>
	//*  43   87:aload_0         
	//*  44   88:getfield        #450 <Field float J>
	//*  45   91:fconst_0        
	//*  46   92:iconst_0        
	//*  47   93:iconst_1        
	//*  48   94:iconst_0        
	//*  49   95:aload_0         
	//*  50   96:getfield        #180 <Field q e>
	//*  51   99:invokevirtual   #337 <Method float[] q.f()>
	//*  52  102:aload_0         
	//*  53  103:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//*  54  106:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//*  55  109:aload_0         
	//*  56  110:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//*  57  113:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//*  58  116:invokestatic    #454 <Method void AMapNativeRenderer.nativeDrawLineByTextureID(float[], int, float, int, float, float, float, float, float, boolean, boolean, boolean, float[], int, int)>
	//*  59  119:return          
	//*  60  120:aload_0         
	//*  61  121:iconst_0        
	//*  62  122:putfield        #158 <Field int V>
	//*  63  125:aload_2         
	//*  64  126:invokevirtual   #306 <Method Rectangle MapConfig.getGeoRectangle()>
	//*  65  129:invokevirtual   #312 <Method FPoint[] Rectangle.getClipMapRect()>
	//*  66  132:astore          4
	//*  67  134:aload_3         
	//*  68  135:astore_2        
	//*  69  136:aload_0         
	//*  70  137:aload           4
	//*  71  139:invokespecial   #315 <Method boolean a(FPoint[])>
	//*  72  142:ifeq            173
	//*  73  145:aload_0         
	//*  74  146:getfield        #110 <Field Object r>
	//*  75  149:astore_3        
	//*  76  150:aload_3         
	//*  77  151:monitorenter    
	//*  78  152:aload           4
	//*  79  154:aload_0         
	//*  80  155:getfield        #92  <Field List h>
	//*  81  158:iconst_0        
	//*  82  159:invokestatic    #456 <Method List fd.a(FPoint[], List, boolean)>
	//*  83  162:astore_2        
	//*  84  163:aload_3         
	//*  85  164:monitorexit     
	//*  86  165:goto            173
	//*  87  168:astore_2        
	//*  88  169:aload_3         
	//*  89  170:monitorexit     
	//*  90  171:aload_2         
	//*  91  172:athrow          
	//*  92  173:aload_2         
	//*  93  174:invokeinterface #274 <Method int List.size()>
	//*  94  179:iconst_2        
	//*  95  180:icmplt          253
	//*  96  183:aload_0         
	//*  97  184:aload_2         
	//*  98  185:invokespecial   #321 <Method void d(List)>
	//*  99  188:aload_0         
	//* 100  189:getfield        #334 <Field float[] P>
	//* 101  192:aload_0         
	//* 102  193:getfield        #174 <Field int b>
	//* 103  196:fload_1         
	//* 104  197:aload_0         
	//* 105  198:getfield        #180 <Field q e>
	//* 106  201:invokevirtual   #225 <Method s q.e()>
	//* 107  204:invokeinterface #408 <Method int s.d()>
	//* 108  209:aload_0         
	//* 109  210:getfield        #444 <Field float K>
	//* 110  213:aload_0         
	//* 111  214:getfield        #446 <Field float L>
	//* 112  217:aload_0         
	//* 113  218:getfield        #448 <Field float M>
	//* 114  221:aload_0         
	//* 115  222:getfield        #450 <Field float J>
	//* 116  225:fconst_0        
	//* 117  226:iconst_0        
	//* 118  227:iconst_1        
	//* 119  228:iconst_0        
	//* 120  229:aload_0         
	//* 121  230:getfield        #180 <Field q e>
	//* 122  233:invokevirtual   #337 <Method float[] q.f()>
	//* 123  236:aload_0         
	//* 124  237:getfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//* 125  240:invokevirtual   #340 <Method int com.amap.api.maps.model.PolylineOptions$LineCapType.getTypeValue()>
	//* 126  243:aload_0         
	//* 127  244:getfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//* 128  247:invokevirtual   #341 <Method int com.amap.api.maps.model.PolylineOptions$LineJoinType.getTypeValue()>
	//* 129  250:invokestatic    #454 <Method void AMapNativeRenderer.nativeDrawLineByTextureID(float[], int, float, int, float, float, float, float, float, boolean, boolean, boolean, float[], int, int)>
	//* 130  253:return          
		// Misplaced declaration of an exception variable
		catch(MapConfig mapconfig)
	//* 131  254:astore_2        
		{
			return;
	//  132  255:return          
		}
		if(s1 == null)
			return;
		if(mapconfig.getChangeRatio() == 1.0D && P != null)
		{
			V = V + 1;
			if(V > 2)
			{
				AMapNativeRenderer.nativeDrawLineByTextureID(P, b, f1, e.e().d(), K, L, M, J, 0.0F, false, true, false, e.f(), X.getTypeValue(), W.getTypeValue());
				return;
			}
		}
		V = 0;
		afpoint = mapconfig.getGeoRectangle().getClipMapRect();
		mapconfig = ((MapConfig) (obj));
		if(!a(afpoint))
			break MISSING_BLOCK_LABEL_173;
		obj = r;
		obj;
		JVM INSTR monitorenter ;
		mapconfig = ((MapConfig) (fd.a(afpoint, h, false)));
		obj;
		JVM INSTR monitorexit ;
		break MISSING_BLOCK_LABEL_173;
		mapconfig;
		throw mapconfig;
		if(((List) (mapconfig)).size() >= 2)
		{
			d(((List) (mapconfig)));
			AMapNativeRenderer.nativeDrawLineByTextureID(P, b, f1, e.e().d(), K, L, M, J, 0.0F, false, true, false, e.f(), X.getTypeValue(), W.getTypeValue());
		}
		return;
	}

	private ArrayList g()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #87  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void ArrayList()>
	//    3    7:astore_3        
		for(int i1 = 0; i1 < P.length; i1 = i1 + 1 + 1)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #334 <Field float[] P>
	//*   9   15:arraylength     
	//*  10   16:icmpge          54
		{
			float f1 = P[i1];
	//   11   19:aload_0         
	//   12   20:getfield        #334 <Field float[] P>
	//   13   23:iload_2         
	//   14   24:faload          
	//   15   25:fstore_1        
			i1++;
	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
			arraylist.add(((Object) (FPoint.obtain(f1, P[i1]))));
	//   20   30:aload_3         
	//   21   31:fload_1         
	//   22   32:aload_0         
	//   23   33:getfield        #334 <Field float[] P>
	//   24   36:iload_2         
	//   25   37:faload          
	//   26   38:invokestatic    #508 <Method FPoint FPoint.obtain(float, float)>
	//   27   41:invokevirtual   #460 <Method boolean ArrayList.add(Object)>
	//   28   44:pop             
		}

	//   29   45:iload_2         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:istore_2        
	//*  35   51:goto            10
		return arraylist;
	//   36   54:aload_3         
	//   37   55:areturn         
	}

	IPoint a(IPoint ipoint, IPoint ipoint1, IPoint ipoint2, double d1, int i1)
	{
		IPoint ipoint3 = IPoint.obtain();
	//    0    0:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//    1    3:astore          13
		double d2 = ipoint1.x - ipoint.x;
	//    2    5:aload_2         
	//    3    6:getfield        #398 <Field int IPoint.x>
	//    4    9:aload_1         
	//    5   10:getfield        #398 <Field int IPoint.x>
	//    6   13:isub            
	//    7   14:i2d             
	//    8   15:dstore          7
		double d3 = ipoint1.y - ipoint.y;
	//    9   17:aload_2         
	//   10   18:getfield        #400 <Field int IPoint.y>
	//   11   21:aload_1         
	//   12   22:getfield        #400 <Field int IPoint.y>
	//   13   25:isub            
	//   14   26:i2d             
	//   15   27:dstore          9
		double d4 = (d3 * d3) / (d2 * d2);
	//   16   29:dload           9
	//   17   31:dload           9
	//   18   33:dmul            
	//   19   34:dload           7
	//   20   36:dload           7
	//   21   38:dmul            
	//   22   39:ddiv            
	//   23   40:dstore          11
		ipoint3.y = (int)(((double)i1 * d1) / Math.sqrt(d4 + 1.0D) + (double)ipoint2.y);
	//   24   42:aload           13
	//   25   44:iload           6
	//   26   46:i2d             
	//   27   47:dload           4
	//   28   49:dmul            
	//   29   50:dload           11
	//   30   52:dconst_1        
	//   31   53:dadd            
	//   32   54:invokestatic    #210 <Method double Math.sqrt(double)>
	//   33   57:ddiv            
	//   34   58:aload_3         
	//   35   59:getfield        #400 <Field int IPoint.y>
	//   36   62:i2d             
	//   37   63:dadd            
	//   38   64:d2i             
	//   39   65:putfield        #400 <Field int IPoint.y>
		ipoint3.x = (int)(((double)(ipoint2.y - ipoint3.y) * d3) / d2 + (double)ipoint2.x);
	//   40   68:aload           13
	//   41   70:aload_3         
	//   42   71:getfield        #400 <Field int IPoint.y>
	//   43   74:aload           13
	//   44   76:getfield        #400 <Field int IPoint.y>
	//   45   79:isub            
	//   46   80:i2d             
	//   47   81:dload           9
	//   48   83:dmul            
	//   49   84:dload           7
	//   50   86:ddiv            
	//   51   87:aload_3         
	//   52   88:getfield        #398 <Field int IPoint.x>
	//   53   91:i2d             
	//   54   92:dadd            
	//   55   93:d2i             
	//   56   94:putfield        #398 <Field int IPoint.x>
		return ipoint3;
	//   57   97:aload           13
	//   58   99:areturn         
	}

	public void a(int i1)
	{
		F = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #139 <Field int F>
	//    3    5:return          
	}

	void a(LatLng latlng, LatLng latlng1, List list, com.amap.api.maps.model.LatLngBounds.Builder builder)
	{
		double d1 = (Math.abs(latlng.longitude - latlng1.longitude) * 3.1415926535897931D) / 180D;
	//    0    0:aload_1         
	//    1    1:getfield        #390 <Field double LatLng.longitude>
	//    2    4:aload_2         
	//    3    5:getfield        #390 <Field double LatLng.longitude>
	//    4    8:dsub            
	//    5    9:invokestatic    #513 <Method double Math.abs(double)>
	//    6   12:ldc2w           #514 <Double 3.1415926535897931D>
	//    7   15:dmul            
	//    8   16:ldc2w           #516 <Double 180D>
	//    9   19:ddiv            
	//   10   20:dstore          5
		Object obj = ((Object) (new LatLng((latlng1.latitude + latlng.latitude) / 2D, (latlng1.longitude + latlng.longitude) / 2D, false)));
	//   11   22:new             #384 <Class LatLng>
	//   12   25:dup             
	//   13   26:aload_2         
	//   14   27:getfield        #387 <Field double LatLng.latitude>
	//   15   30:aload_1         
	//   16   31:getfield        #387 <Field double LatLng.latitude>
	//   17   34:dadd            
	//   18   35:ldc2w           #518 <Double 2D>
	//   19   38:ddiv            
	//   20   39:aload_2         
	//   21   40:getfield        #390 <Field double LatLng.longitude>
	//   22   43:aload_1         
	//   23   44:getfield        #390 <Field double LatLng.longitude>
	//   24   47:dadd            
	//   25   48:ldc2w           #518 <Double 2D>
	//   26   51:ddiv            
	//   27   52:iconst_0        
	//   28   53:invokespecial   #522 <Method void LatLng(double, double, boolean)>
	//   29   56:astore          10
		builder.include(latlng).include(((LatLng) (obj))).include(latlng1);
	//   30   58:aload           4
	//   31   60:aload_1         
	//   32   61:invokevirtual   #528 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   33   64:aload           10
	//   34   66:invokevirtual   #528 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   35   69:aload_2         
	//   36   70:invokevirtual   #528 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   37   73:pop             
		byte byte0;
		if(((LatLng) (obj)).latitude > 0.0D)
	//*  38   74:aload           10
	//*  39   76:getfield        #387 <Field double LatLng.latitude>
	//*  40   79:dconst_0        
	//*  41   80:dcmpl           
	//*  42   81:ifle            90
			byte0 = -1;
	//   43   84:iconst_m1       
	//   44   85:istore          9
		else
	//*  45   87:goto            93
			byte0 = 1;
	//   46   90:iconst_1        
	//   47   91:istore          9
		builder = ((com.amap.api.maps.model.LatLngBounds.Builder) (IPoint.obtain()));
	//   48   93:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//   49   96:astore          4
		e.e().a(latlng.latitude, latlng.longitude, ((IPoint) (builder)));
	//   50   98:aload_0         
	//   51   99:getfield        #180 <Field q e>
	//   52  102:invokevirtual   #225 <Method s q.e()>
	//   53  105:aload_1         
	//   54  106:getfield        #387 <Field double LatLng.latitude>
	//   55  109:aload_1         
	//   56  110:getfield        #390 <Field double LatLng.longitude>
	//   57  113:aload           4
	//   58  115:invokeinterface #393 <Method void s.a(double, double, IPoint)>
		latlng = ((LatLng) (IPoint.obtain()));
	//   59  120:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//   60  123:astore_1        
		e.e().a(latlng1.latitude, latlng1.longitude, ((IPoint) (latlng)));
	//   61  124:aload_0         
	//   62  125:getfield        #180 <Field q e>
	//   63  128:invokevirtual   #225 <Method s q.e()>
	//   64  131:aload_2         
	//   65  132:getfield        #387 <Field double LatLng.latitude>
	//   66  135:aload_2         
	//   67  136:getfield        #390 <Field double LatLng.longitude>
	//   68  139:aload_1         
	//   69  140:invokeinterface #393 <Method void s.a(double, double, IPoint)>
		latlng1 = ((LatLng) (IPoint.obtain()));
	//   70  145:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//   71  148:astore_2        
		e.e().a(((LatLng) (obj)).latitude, ((LatLng) (obj)).longitude, ((IPoint) (latlng1)));
	//   72  149:aload_0         
	//   73  150:getfield        #180 <Field q e>
	//   74  153:invokevirtual   #225 <Method s q.e()>
	//   75  156:aload           10
	//   76  158:getfield        #387 <Field double LatLng.latitude>
	//   77  161:aload           10
	//   78  163:getfield        #390 <Field double LatLng.longitude>
	//   79  166:aload_2         
	//   80  167:invokeinterface #393 <Method void s.a(double, double, IPoint)>
		double d2 = Math.cos(0.5D * d1);
	//   81  172:ldc2w           #529 <Double 0.5D>
	//   82  175:dload           5
	//   83  177:dmul            
	//   84  178:invokestatic    #533 <Method double Math.cos(double)>
	//   85  181:dstore          7
		latlng1 = ((LatLng) (a(((IPoint) (builder)), ((IPoint) (latlng)), ((IPoint) (latlng1)), Math.hypot(((IPoint) (builder)).x - ((IPoint) (latlng)).x, ((IPoint) (builder)).y - ((IPoint) (latlng)).y) * 0.5D * Math.tan(0.5D * d1), ((int) (byte0)))));
	//   86  183:aload_0         
	//   87  184:aload           4
	//   88  186:aload_1         
	//   89  187:aload_2         
	//   90  188:aload           4
	//   91  190:getfield        #398 <Field int IPoint.x>
	//   92  193:aload_1         
	//   93  194:getfield        #398 <Field int IPoint.x>
	//   94  197:isub            
	//   95  198:i2d             
	//   96  199:aload           4
	//   97  201:getfield        #400 <Field int IPoint.y>
	//   98  204:aload_1         
	//   99  205:getfield        #400 <Field int IPoint.y>
	//  100  208:isub            
	//  101  209:i2d             
	//  102  210:invokestatic    #537 <Method double Math.hypot(double, double)>
	//  103  213:ldc2w           #529 <Double 0.5D>
	//  104  216:dmul            
	//  105  217:ldc2w           #529 <Double 0.5D>
	//  106  220:dload           5
	//  107  222:dmul            
	//  108  223:invokestatic    #540 <Method double Math.tan(double)>
	//  109  226:dmul            
	//  110  227:iload           9
	//  111  229:invokevirtual   #542 <Method IPoint a(IPoint, IPoint, IPoint, double, int)>
	//  112  232:astore_2        
		obj = ((Object) (new ArrayList()));
	//  113  233:new             #87  <Class ArrayList>
	//  114  236:dup             
	//  115  237:invokespecial   #88  <Method void ArrayList()>
	//  116  240:astore          10
		((List) (obj)).add(((Object) (builder)));
	//  117  242:aload           10
	//  118  244:aload           4
	//  119  246:invokeinterface #263 <Method boolean List.add(Object)>
	//  120  251:pop             
		((List) (obj)).add(((Object) (latlng1)));
	//  121  252:aload           10
	//  122  254:aload_2         
	//  123  255:invokeinterface #263 <Method boolean List.add(Object)>
	//  124  260:pop             
		((List) (obj)).add(((Object) (latlng)));
	//  125  261:aload           10
	//  126  263:aload_1         
	//  127  264:invokeinterface #263 <Method boolean List.add(Object)>
	//  128  269:pop             
		a(((List) (obj)), list, d2);
	//  129  270:aload_0         
	//  130  271:aload           10
	//  131  273:aload_3         
	//  132  274:dload           7
	//  133  276:invokevirtual   #545 <Method void a(List, List, double)>
		((IPoint) (builder)).recycle();
	//  134  279:aload           4
	//  135  281:invokevirtual   #406 <Method void IPoint.recycle()>
		((IPoint) (latlng1)).recycle();
	//  136  284:aload_2         
	//  137  285:invokevirtual   #406 <Method void IPoint.recycle()>
		((IPoint) (latlng)).recycle();
	//  138  288:aload_1         
	//  139  289:invokevirtual   #406 <Method void IPoint.recycle()>
	//  140  292:return          
	}

	public void a(com.amap.api.maps.model.PolylineOptions.LineCapType linecaptype)
	{
		X = linecaptype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #172 <Field com.amap.api.maps.model.PolylineOptions$LineCapType X>
	//    3    5:return          
	}

	public void a(com.amap.api.maps.model.PolylineOptions.LineJoinType linejointype)
	{
		W = linejointype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #165 <Field com.amap.api.maps.model.PolylineOptions$LineJoinType W>
	//    3    5:return          
	}

	public void a(MapConfig mapconfig)
		throws RemoteException
	{
		if(g == null || g.size() == 0 || G <= 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field List g>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #90  <Field List g>
	//*   5   11:invokeinterface #274 <Method int List.size()>
	//*   6   16:ifeq            28
	//*   7   19:aload_0         
	//*   8   20:getfield        #142 <Field float G>
	//*   9   23:fconst_0        
	//*  10   24:fcmpg           
	//*  11   25:ifgt            29
			return;
	//   12   28:return          
		if(e.e() == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #180 <Field q e>
	//*  15   33:invokevirtual   #225 <Method s q.e()>
	//*  16   36:ifnonnull       40
			return;
	//   17   39:return          
		mapconfig = ((MapConfig) (r));
	//   18   40:aload_0         
	//   19   41:getfield        #110 <Field Object r>
	//   20   44:astore_1        
		mapconfig;
	//   21   45:aload_1         
		JVM INSTR monitorenter ;
	//   22   46:monitorenter    
		int i1;
		int k1;
		int l1;
		int i2;
		k1 = e.e().getMapConfig().getSX();
	//   23   47:aload_0         
	//   24   48:getfield        #180 <Field q e>
	//   25   51:invokevirtual   #225 <Method s q.e()>
	//   26   54:invokeinterface #490 <Method MapConfig s.getMapConfig()>
	//   27   59:invokevirtual   #551 <Method int MapConfig.getSX()>
	//   28   62:istore          4
		l1 = e.e().getMapConfig().getSY();
	//   29   64:aload_0         
	//   30   65:getfield        #180 <Field q e>
	//   31   68:invokevirtual   #225 <Method s q.e()>
	//   32   71:invokeinterface #490 <Method MapConfig s.getMapConfig()>
	//   33   76:invokevirtual   #554 <Method int MapConfig.getSY()>
	//   34   79:istore          5
		i1 = h.size();
	//   35   81:aload_0         
	//   36   82:getfield        #92  <Field List h>
	//   37   85:invokeinterface #274 <Method int List.size()>
	//   38   90:istore_2        
		i2 = g.size();
	//   39   91:aload_0         
	//   40   92:getfield        #90  <Field List g>
	//   41   95:invokeinterface #274 <Method int List.size()>
	//   42  100:istore          6
		if(i1 != i2) goto _L2; else goto _L1
	//   43  102:iload_2         
	//   44  103:iload           6
	//   45  105:icmpne          181
_L1:
		i1 = 0;
	//   46  108:iconst_0        
	//   47  109:istore_2        
_L4:
		if(i1 >= i2)
			break; /* Loop/switch isn't completed */
	//   48  110:iload_2         
	//   49  111:iload           6
	//   50  113:icmpge          536
		IPoint ipoint = (IPoint)g.get(i1);
	//   51  116:aload_0         
	//   52  117:getfield        #90  <Field List g>
	//   53  120:iload_2         
	//   54  121:invokeinterface #325 <Method Object List.get(int)>
	//   55  126:checkcast       #378 <Class IPoint>
	//   56  129:astore          7
		FPoint fpoint = (FPoint)h.get(i1);
	//   57  131:aload_0         
	//   58  132:getfield        #92  <Field List h>
	//   59  135:iload_2         
	//   60  136:invokeinterface #325 <Method Object List.get(int)>
	//   61  141:checkcast       #213 <Class FPoint>
	//   62  144:astore          8
		fpoint.x = ipoint.x - k1;
	//   63  146:aload           8
	//   64  148:aload           7
	//   65  150:getfield        #398 <Field int IPoint.x>
	//   66  153:iload           4
	//   67  155:isub            
	//   68  156:i2f             
	//   69  157:putfield        #215 <Field float FPoint.x>
		fpoint.y = ipoint.y - l1;
	//   70  160:aload           8
	//   71  162:aload           7
	//   72  164:getfield        #400 <Field int IPoint.y>
	//   73  167:iload           5
	//   74  169:isub            
	//   75  170:i2f             
	//   76  171:putfield        #217 <Field float FPoint.y>
		i1++;
	//   77  174:iload_2         
	//   78  175:iconst_1        
	//   79  176:iadd            
	//   80  177:istore_2        
		if(true) goto _L4; else goto _L3
	//   81  178:goto            110
_L2:
		h.clear();
	//   82  181:aload_0         
	//   83  182:getfield        #92  <Field List h>
	//   84  185:invokeinterface #555 <Method void List.clear()>
		int j1;
		j1 = 0;
	//   85  190:iconst_0        
	//   86  191:istore_3        
		i1 = 0;
	//   87  192:iconst_0        
	//   88  193:istore_2        
_L5:
		if(i1 >= i2)
			break; /* Loop/switch isn't completed */
	//   89  194:iload_2         
	//   90  195:iload           6
	//   91  197:icmpge          346
		Object obj;
		FPoint3 fpoint3;
		obj = ((Object) ((IPoint)g.get(i1)));
	//   92  200:aload_0         
	//   93  201:getfield        #90  <Field List g>
	//   94  204:iload_2         
	//   95  205:invokeinterface #325 <Method Object List.get(int)>
	//   96  210:checkcast       #378 <Class IPoint>
	//   97  213:astore          8
		fpoint3 = new FPoint3();
	//   98  215:new             #351 <Class FPoint3>
	//   99  218:dup             
	//  100  219:invokespecial   #556 <Method void FPoint3()>
	//  101  222:astore          9
		if(l == null)
			break MISSING_BLOCK_LABEL_295;
	//  102  224:aload_0         
	//  103  225:getfield        #100 <Field List l>
	//  104  228:ifnull          295
		List list = l;
	//  105  231:aload_0         
	//  106  232:getfield        #100 <Field List l>
	//  107  235:astore          7
		list;
	//  108  237:aload           7
		JVM INSTR monitorenter ;
	//  109  239:monitorenter    
		if(l != null && l.size() > j1)
	//* 110  240:aload_0         
	//* 111  241:getfield        #100 <Field List l>
	//* 112  244:ifnull          281
	//* 113  247:aload_0         
	//* 114  248:getfield        #100 <Field List l>
	//* 115  251:invokeinterface #274 <Method int List.size()>
	//* 116  256:iload_3         
	//* 117  257:icmple          281
			fpoint3.setColorIndex(((Integer)l.get(j1)).intValue());
	//  118  260:aload           9
	//  119  262:aload_0         
	//  120  263:getfield        #100 <Field List l>
	//  121  266:iload_3         
	//  122  267:invokeinterface #325 <Method Object List.get(int)>
	//  123  272:checkcast       #327 <Class Integer>
	//  124  275:invokevirtual   #330 <Method int Integer.intValue()>
	//  125  278:invokevirtual   #559 <Method void FPoint3.setColorIndex(int)>
		list;
	//  126  281:aload           7
		JVM INSTR monitorexit ;
	//  127  283:monitorexit     
		break MISSING_BLOCK_LABEL_295;
	//  128  284:goto            295
		obj;
	//  129  287:astore          8
	//* 130  289:aload           7
		throw obj;
	//  131  291:monitorexit     
	//  132  292:aload           8
	//  133  294:athrow          
		fpoint3.x = ((IPoint) (obj)).x - k1;
	//  134  295:aload           9
	//  135  297:aload           8
	//  136  299:getfield        #398 <Field int IPoint.x>
	//  137  302:iload           4
	//  138  304:isub            
	//  139  305:i2f             
	//  140  306:putfield        #469 <Field float FPoint3.x>
		fpoint3.y = ((IPoint) (obj)).y - l1;
	//  141  309:aload           9
	//  142  311:aload           8
	//  143  313:getfield        #400 <Field int IPoint.y>
	//  144  316:iload           5
	//  145  318:isub            
	//  146  319:i2f             
	//  147  320:putfield        #470 <Field float FPoint3.y>
		h.add(((Object) (fpoint3)));
	//  148  323:aload_0         
	//  149  324:getfield        #92  <Field List h>
	//  150  327:aload           9
	//  151  329:invokeinterface #263 <Method boolean List.add(Object)>
	//  152  334:pop             
		j1++;
	//  153  335:iload_3         
	//  154  336:iconst_1        
	//  155  337:iadd            
	//  156  338:istore_3        
		i1++;
	//  157  339:iload_2         
	//  158  340:iconst_1        
	//  159  341:iadd            
	//  160  342:istore_2        
		if(true) goto _L5; else goto _L3
	//  161  343:goto            194
_L3:
		mapconfig;
	//  162  346:aload_1         
		JVM INSTR monitorexit ;
	//  163  347:monitorexit     
		  goto _L6
	//* 164  348:goto            358
		Exception exception;
		exception;
	//  165  351:astore          7
	//* 166  353:aload_1         
		throw exception;
	//  167  354:monitorexit     
	//  168  355:aload           7
	//  169  357:athrow          
_L6:
		if(x)
	//* 170  358:aload_0         
	//* 171  359:getfield        #122 <Field boolean x>
	//* 172  362:ifeq            378
		{
			b();
	//  173  365:aload_0         
	//  174  366:invokevirtual   #561 <Method boolean b()>
	//  175  369:pop             
			x = false;
	//  176  370:aload_0         
	//  177  371:iconst_0        
	//  178  372:putfield        #122 <Field boolean x>
			break MISSING_BLOCK_LABEL_500;
	//  179  375:goto            500
		}
		if(!y)
			break MISSING_BLOCK_LABEL_500;
	//  180  378:aload_0         
	//  181  379:getfield        #124 <Field boolean y>
	//  182  382:ifeq            500
		mapconfig = ((MapConfig) (r));
	//  183  385:aload_0         
	//  184  386:getfield        #110 <Field Object r>
	//  185  389:astore_1        
		mapconfig;
	//  186  390:aload_1         
		JVM INSTR monitorenter ;
	//  187  391:monitorenter    
		j1 = h.size();
	//  188  392:aload_0         
	//  189  393:getfield        #92  <Field List h>
	//  190  396:invokeinterface #274 <Method int List.size()>
	//  191  401:istore_3        
		exception = ((Exception) (l));
	//  192  402:aload_0         
	//  193  403:getfield        #100 <Field List l>
	//  194  406:astore          7
		exception;
	//  195  408:aload           7
		JVM INSTR monitorenter ;
	//  196  410:monitorenter    
		k1 = l.size();
	//  197  411:aload_0         
	//  198  412:getfield        #100 <Field List l>
	//  199  415:invokeinterface #274 <Method int List.size()>
	//  200  420:istore          4
		i1 = 0;
	//  201  422:iconst_0        
	//  202  423:istore_2        
_L9:
		if(i1 >= j1) goto _L8; else goto _L7
	//  203  424:iload_2         
	//  204  425:iload_3         
	//  205  426:icmpge          474
_L7:
		if(k1 <= i1)
			continue; /* Loop/switch isn't completed */
	//  206  429:iload           4
	//  207  431:iload_2         
	//  208  432:icmple          467
		((FPoint3)h.get(i1)).setColorIndex(((Integer)l.get(i1)).intValue());
	//  209  435:aload_0         
	//  210  436:getfield        #92  <Field List h>
	//  211  439:iload_2         
	//  212  440:invokeinterface #325 <Method Object List.get(int)>
	//  213  445:checkcast       #351 <Class FPoint3>
	//  214  448:aload_0         
	//  215  449:getfield        #100 <Field List l>
	//  216  452:iload_2         
	//  217  453:invokeinterface #325 <Method Object List.get(int)>
	//  218  458:checkcast       #327 <Class Integer>
	//  219  461:invokevirtual   #330 <Method int Integer.intValue()>
	//  220  464:invokevirtual   #559 <Method void FPoint3.setColorIndex(int)>
		i1++;
	//  221  467:iload_2         
	//  222  468:iconst_1        
	//  223  469:iadd            
	//  224  470:istore_2        
		  goto _L9
	//* 225  471:goto            424
	//* 226  474:aload           7
	//* 227  476:monitorexit     
	//* 228  477:goto            488
		Exception exception1;
		exception1;
	//  229  480:astore          8
	//* 230  482:aload           7
		throw exception1;
	//  231  484:monitorexit     
	//  232  485:aload           8
	//  233  487:athrow          
	//* 234  488:aload_1         
	//* 235  489:monitorexit     
	//* 236  490:goto            500
		exception;
	//  237  493:astore          7
	//* 238  495:aload_1         
		throw exception;
	//  239  496:monitorexit     
	//  240  497:aload           7
	//  241  499:athrow          
_L8:
		if(P != null && E > 0)
	//* 242  500:aload_0         
	//* 243  501:getfield        #334 <Field float[] P>
	//* 244  504:ifnull          530
	//* 245  507:aload_0         
	//* 246  508:getfield        #137 <Field int E>
	//* 247  511:ifle            530
			b(e.e().getMapConfig());
	//  248  514:aload_0         
	//  249  515:aload_0         
	//  250  516:getfield        #180 <Field q e>
	//  251  519:invokevirtual   #225 <Method s q.e()>
	//  252  522:invokeinterface #490 <Method MapConfig s.getMapConfig()>
	//  253  527:invokespecial   #563 <Method void b(MapConfig)>
		z = true;
	//  254  530:aload_0         
	//  255  531:iconst_1        
	//  256  532:putfield        #126 <Field boolean z>
		return;
	//  257  535:return          
	//* 258  536:goto            346
	}

	void a(List list)
		throws RemoteException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #87  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void ArrayList()>
	//    3    7:astore_3        
		com.amap.api.maps.model.LatLngBounds.Builder builder = LatLngBounds.builder();
	//    4    8:invokestatic    #569 <Method com.amap.api.maps.model.LatLngBounds$Builder LatLngBounds.builder()>
	//    5   11:astore          4
		if(list != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          217
		{
			LatLng latlng = null;
	//    8   17:aconst_null     
	//    9   18:astore_2        
			Iterator iterator = list.iterator();
	//   10   19:aload_1         
	//   11   20:invokeinterface #285 <Method Iterator List.iterator()>
	//   12   25:astore          5
			for(list = ((List) (latlng)); iterator.hasNext(); list = ((List) (latlng)))
	//*  13   27:aload_2         
	//*  14   28:astore_1        
	//*  15   29:aload           5
	//*  16   31:invokeinterface #290 <Method boolean Iterator.hasNext()>
	//*  17   36:ifeq            217
			{
				latlng = (LatLng)iterator.next();
	//   18   39:aload           5
	//   19   41:invokeinterface #294 <Method Object Iterator.next()>
	//   20   46:checkcast       #384 <Class LatLng>
	//   21   49:astore_2        
				if(!u)
	//*  22   50:aload_0         
	//*  23   51:getfield        #116 <Field boolean u>
	//*  24   54:ifne            98
				{
					list = ((List) (IPoint.obtain()));
	//   25   57:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//   26   60:astore_1        
					e.e().a(latlng.latitude, latlng.longitude, ((IPoint) (list)));
	//   27   61:aload_0         
	//   28   62:getfield        #180 <Field q e>
	//   29   65:invokevirtual   #225 <Method s q.e()>
	//   30   68:aload_2         
	//   31   69:getfield        #387 <Field double LatLng.latitude>
	//   32   72:aload_2         
	//   33   73:getfield        #390 <Field double LatLng.longitude>
	//   34   76:aload_1         
	//   35   77:invokeinterface #393 <Method void s.a(double, double, IPoint)>
					arraylist.add(((Object) (list)));
	//   36   82:aload_3         
	//   37   83:aload_1         
	//   38   84:invokevirtual   #460 <Method boolean ArrayList.add(Object)>
	//   39   87:pop             
					builder.include(latlng);
	//   40   88:aload           4
	//   41   90:aload_2         
	//   42   91:invokevirtual   #528 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   43   94:pop             
					continue;
	//   44   95:goto            212
				}
				if(list == null)
					continue;
	//   45   98:aload_1         
	//   46   99:ifnull          212
				if(Math.abs(latlng.longitude - ((LatLng) (list)).longitude) < 0.01D)
	//*  47  102:aload_2         
	//*  48  103:getfield        #390 <Field double LatLng.longitude>
	//*  49  106:aload_1         
	//*  50  107:getfield        #390 <Field double LatLng.longitude>
	//*  51  110:dsub            
	//*  52  111:invokestatic    #513 <Method double Math.abs(double)>
	//*  53  114:ldc2w           #570 <Double 0.01D>
	//*  54  117:dcmpg           
	//*  55  118:ifge            203
				{
					IPoint ipoint1 = IPoint.obtain();
	//   56  121:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//   57  124:astore          6
					e.e().a(((LatLng) (list)).latitude, ((LatLng) (list)).longitude, ipoint1);
	//   58  126:aload_0         
	//   59  127:getfield        #180 <Field q e>
	//   60  130:invokevirtual   #225 <Method s q.e()>
	//   61  133:aload_1         
	//   62  134:getfield        #387 <Field double LatLng.latitude>
	//   63  137:aload_1         
	//   64  138:getfield        #390 <Field double LatLng.longitude>
	//   65  141:aload           6
	//   66  143:invokeinterface #393 <Method void s.a(double, double, IPoint)>
					arraylist.add(((Object) (ipoint1)));
	//   67  148:aload_3         
	//   68  149:aload           6
	//   69  151:invokevirtual   #460 <Method boolean ArrayList.add(Object)>
	//   70  154:pop             
					builder.include(((LatLng) (list)));
	//   71  155:aload           4
	//   72  157:aload_1         
	//   73  158:invokevirtual   #528 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   74  161:pop             
					list = ((List) (IPoint.obtain()));
	//   75  162:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//   76  165:astore_1        
					e.e().a(latlng.latitude, latlng.longitude, ((IPoint) (list)));
	//   77  166:aload_0         
	//   78  167:getfield        #180 <Field q e>
	//   79  170:invokevirtual   #225 <Method s q.e()>
	//   80  173:aload_2         
	//   81  174:getfield        #387 <Field double LatLng.latitude>
	//   82  177:aload_2         
	//   83  178:getfield        #390 <Field double LatLng.longitude>
	//   84  181:aload_1         
	//   85  182:invokeinterface #393 <Method void s.a(double, double, IPoint)>
					arraylist.add(((Object) (list)));
	//   86  187:aload_3         
	//   87  188:aload_1         
	//   88  189:invokevirtual   #460 <Method boolean ArrayList.add(Object)>
	//   89  192:pop             
					builder.include(latlng);
	//   90  193:aload           4
	//   91  195:aload_2         
	//   92  196:invokevirtual   #528 <Method com.amap.api.maps.model.LatLngBounds$Builder com.amap.api.maps.model.LatLngBounds$Builder.include(LatLng)>
	//   93  199:pop             
				} else
	//*  94  200:goto            212
				{
					a(((LatLng) (list)), latlng, ((List) (arraylist)), builder);
	//   95  203:aload_0         
	//   96  204:aload_1         
	//   97  205:aload_2         
	//   98  206:aload_3         
	//   99  207:aload           4
	//  100  209:invokevirtual   #573 <Method void a(LatLng, LatLng, List, com.amap.api.maps.model.LatLngBounds$Builder)>
				}
			}

	//  101  212:aload_2         
	//  102  213:astore_1        
		}
	//* 103  214:goto            29
		g = ((List) (arraylist));
	//  104  217:aload_0         
	//  105  218:aload_3         
	//  106  219:putfield        #90  <Field List g>
		E = 0;
	//  107  222:aload_0         
	//  108  223:iconst_0        
	//  109  224:putfield        #137 <Field int E>
		if(a == null)
	//* 110  227:aload_0         
	//* 111  228:getfield        #156 <Field Rect a>
	//* 112  231:ifnonnull       245
			a = new Rect();
	//  113  234:aload_0         
	//  114  235:new             #575 <Class Rect>
	//  115  238:dup             
	//  116  239:invokespecial   #576 <Method void Rect()>
	//  117  242:putfield        #156 <Field Rect a>
		fd.a(a);
	//  118  245:aload_0         
	//  119  246:getfield        #156 <Field Rect a>
	//  120  249:invokestatic    #579 <Method void fd.a(Rect)>
		IPoint ipoint;
		for(list = ((List) (g.iterator())); ((Iterator) (list)).hasNext(); fd.b(a, ipoint.x, ipoint.y))
	//* 121  252:aload_0         
	//* 122  253:getfield        #90  <Field List g>
	//* 123  256:invokeinterface #285 <Method Iterator List.iterator()>
	//* 124  261:astore_1        
	//* 125  262:aload_1         
	//* 126  263:invokeinterface #290 <Method boolean Iterator.hasNext()>
	//* 127  268:ifeq            299
			ipoint = (IPoint)((Iterator) (list)).next();
	//  128  271:aload_1         
	//  129  272:invokeinterface #294 <Method Object Iterator.next()>
	//  130  277:checkcast       #378 <Class IPoint>
	//  131  280:astore_2        

	//  132  281:aload_0         
	//  133  282:getfield        #156 <Field Rect a>
	//  134  285:aload_2         
	//  135  286:getfield        #398 <Field int IPoint.x>
	//  136  289:aload_2         
	//  137  290:getfield        #400 <Field int IPoint.y>
	//  138  293:invokestatic    #582 <Method void fd.b(Rect, int, int)>
	//* 139  296:goto            262
		a.sort();
	//  140  299:aload_0         
	//  141  300:getfield        #156 <Field Rect a>
	//  142  303:invokevirtual   #585 <Method void Rect.sort()>
		e.e().setRunLowFrame(false);
	//  143  306:aload_0         
	//  144  307:getfield        #180 <Field q e>
	//  145  310:invokevirtual   #225 <Method s q.e()>
	//  146  313:iconst_0        
	//  147  314:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
	//  148  319:return          
	}

	void a(List list, List list1, double d1)
	{
		if(list.size() != 3)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #274 <Method int List.size()>
	//*   2    6:iconst_3        
	//*   3    7:icmpeq          11
			return;
	//    4   10:return          
		for(int i1 = 0; i1 <= 10; i1 = (int)((float)i1 + 1.0F))
	//*   5   11:iconst_0        
	//*   6   12:istore          54
	//*   7   14:iload           54
	//*   8   16:bipush          10
	//*   9   18:icmpgt          382
		{
			float f1 = (float)i1 / 10F;
	//   10   21:iload           54
	//   11   23:i2f             
	//   12   24:ldc1            #140 <Float 10F>
	//   13   26:fdiv            
	//   14   27:fstore          53
			IPoint ipoint = IPoint.obtain();
	//   15   29:invokestatic    #382 <Method IPoint IPoint.obtain()>
	//   16   32:astore          55
			double d2 = f1;
	//   17   34:fload           53
	//   18   36:f2d             
	//   19   37:dstore          5
			double d3 = f1;
	//   20   39:fload           53
	//   21   41:f2d             
	//   22   42:dstore          7
			double d4 = ((IPoint)list.get(0)).x;
	//   23   44:aload_1         
	//   24   45:iconst_0        
	//   25   46:invokeinterface #325 <Method Object List.get(int)>
	//   26   51:checkcast       #378 <Class IPoint>
	//   27   54:getfield        #398 <Field int IPoint.x>
	//   28   57:i2d             
	//   29   58:dstore          9
			double d5 = 2.0F * f1;
	//   30   60:fconst_2        
	//   31   61:fload           53
	//   32   63:fmul            
	//   33   64:f2d             
	//   34   65:dstore          11
			double d6 = f1;
	//   35   67:fload           53
	//   36   69:f2d             
	//   37   70:dstore          13
			double d7 = ((IPoint)list.get(1)).x;
	//   38   72:aload_1         
	//   39   73:iconst_1        
	//   40   74:invokeinterface #325 <Method Object List.get(int)>
	//   41   79:checkcast       #378 <Class IPoint>
	//   42   82:getfield        #398 <Field int IPoint.x>
	//   43   85:i2d             
	//   44   86:dstore          15
			double d8 = f1 * f1 * (float)((IPoint)list.get(2)).x;
	//   45   88:fload           53
	//   46   90:fload           53
	//   47   92:fmul            
	//   48   93:aload_1         
	//   49   94:iconst_2        
	//   50   95:invokeinterface #325 <Method Object List.get(int)>
	//   51  100:checkcast       #378 <Class IPoint>
	//   52  103:getfield        #398 <Field int IPoint.x>
	//   53  106:i2f             
	//   54  107:fmul            
	//   55  108:f2d             
	//   56  109:dstore          17
			double d9 = f1;
	//   57  111:fload           53
	//   58  113:f2d             
	//   59  114:dstore          19
			double d10 = f1;
	//   60  116:fload           53
	//   61  118:f2d             
	//   62  119:dstore          21
			double d11 = ((IPoint)list.get(0)).y;
	//   63  121:aload_1         
	//   64  122:iconst_0        
	//   65  123:invokeinterface #325 <Method Object List.get(int)>
	//   66  128:checkcast       #378 <Class IPoint>
	//   67  131:getfield        #400 <Field int IPoint.y>
	//   68  134:i2d             
	//   69  135:dstore          23
			double d12 = 2.0F * f1;
	//   70  137:fconst_2        
	//   71  138:fload           53
	//   72  140:fmul            
	//   73  141:f2d             
	//   74  142:dstore          25
			double d13 = f1;
	//   75  144:fload           53
	//   76  146:f2d             
	//   77  147:dstore          27
			double d14 = ((IPoint)list.get(1)).y;
	//   78  149:aload_1         
	//   79  150:iconst_1        
	//   80  151:invokeinterface #325 <Method Object List.get(int)>
	//   81  156:checkcast       #378 <Class IPoint>
	//   82  159:getfield        #400 <Field int IPoint.y>
	//   83  162:i2d             
	//   84  163:dstore          29
			double d15 = f1 * f1 * (float)((IPoint)list.get(2)).y;
	//   85  165:fload           53
	//   86  167:fload           53
	//   87  169:fmul            
	//   88  170:aload_1         
	//   89  171:iconst_2        
	//   90  172:invokeinterface #325 <Method Object List.get(int)>
	//   91  177:checkcast       #378 <Class IPoint>
	//   92  180:getfield        #400 <Field int IPoint.y>
	//   93  183:i2f             
	//   94  184:fmul            
	//   95  185:f2d             
	//   96  186:dstore          31
			double d16 = f1;
	//   97  188:fload           53
	//   98  190:f2d             
	//   99  191:dstore          33
			double d17 = f1;
	//  100  193:fload           53
	//  101  195:f2d             
	//  102  196:dstore          35
			double d18 = 2.0F * f1;
	//  103  198:fconst_2        
	//  104  199:fload           53
	//  105  201:fmul            
	//  106  202:f2d             
	//  107  203:dstore          37
			double d19 = f1;
	//  108  205:fload           53
	//  109  207:f2d             
	//  110  208:dstore          39
			double d20 = f1 * f1;
	//  111  210:fload           53
	//  112  212:fload           53
	//  113  214:fmul            
	//  114  215:f2d             
	//  115  216:dstore          41
			double d21 = f1;
	//  116  218:fload           53
	//  117  220:f2d             
	//  118  221:dstore          43
			double d22 = f1;
	//  119  223:fload           53
	//  120  225:f2d             
	//  121  226:dstore          45
			double d23 = 2.0F * f1;
	//  122  228:fconst_2        
	//  123  229:fload           53
	//  124  231:fmul            
	//  125  232:f2d             
	//  126  233:dstore          47
			double d24 = f1;
	//  127  235:fload           53
	//  128  237:f2d             
	//  129  238:dstore          49
			double d25 = f1 * f1;
	//  130  240:fload           53
	//  131  242:fload           53
	//  132  244:fmul            
	//  133  245:f2d             
	//  134  246:dstore          51
			ipoint.x = (int)(((1.0D - d2) * (1.0D - d3) * d4 + d5 * (1.0D - d6) * d7 * d1 + d8) / ((1.0D - d16) * (1.0D - d17) + d18 * (1.0D - d19) * d1 + d20));
	//  135  248:aload           55
	//  136  250:dconst_1        
	//  137  251:dload           5
	//  138  253:dsub            
	//  139  254:dconst_1        
	//  140  255:dload           7
	//  141  257:dsub            
	//  142  258:dmul            
	//  143  259:dload           9
	//  144  261:dmul            
	//  145  262:dload           11
	//  146  264:dconst_1        
	//  147  265:dload           13
	//  148  267:dsub            
	//  149  268:dmul            
	//  150  269:dload           15
	//  151  271:dmul            
	//  152  272:dload_3         
	//  153  273:dmul            
	//  154  274:dadd            
	//  155  275:dload           17
	//  156  277:dadd            
	//  157  278:dconst_1        
	//  158  279:dload           33
	//  159  281:dsub            
	//  160  282:dconst_1        
	//  161  283:dload           35
	//  162  285:dsub            
	//  163  286:dmul            
	//  164  287:dload           37
	//  165  289:dconst_1        
	//  166  290:dload           39
	//  167  292:dsub            
	//  168  293:dmul            
	//  169  294:dload_3         
	//  170  295:dmul            
	//  171  296:dadd            
	//  172  297:dload           41
	//  173  299:dadd            
	//  174  300:ddiv            
	//  175  301:d2i             
	//  176  302:putfield        #398 <Field int IPoint.x>
			ipoint.y = (int)(((1.0D - d9) * (1.0D - d10) * d11 + d12 * (1.0D - d13) * d14 * d1 + d15) / ((1.0D - d21) * (1.0D - d22) + d23 * (1.0D - d24) * d1 + d25));
	//  177  305:aload           55
	//  178  307:dconst_1        
	//  179  308:dload           19
	//  180  310:dsub            
	//  181  311:dconst_1        
	//  182  312:dload           21
	//  183  314:dsub            
	//  184  315:dmul            
	//  185  316:dload           23
	//  186  318:dmul            
	//  187  319:dload           25
	//  188  321:dconst_1        
	//  189  322:dload           27
	//  190  324:dsub            
	//  191  325:dmul            
	//  192  326:dload           29
	//  193  328:dmul            
	//  194  329:dload_3         
	//  195  330:dmul            
	//  196  331:dadd            
	//  197  332:dload           31
	//  198  334:dadd            
	//  199  335:dconst_1        
	//  200  336:dload           43
	//  201  338:dsub            
	//  202  339:dconst_1        
	//  203  340:dload           45
	//  204  342:dsub            
	//  205  343:dmul            
	//  206  344:dload           47
	//  207  346:dconst_1        
	//  208  347:dload           49
	//  209  349:dsub            
	//  210  350:dmul            
	//  211  351:dload_3         
	//  212  352:dmul            
	//  213  353:dadd            
	//  214  354:dload           51
	//  215  356:dadd            
	//  216  357:ddiv            
	//  217  358:d2i             
	//  218  359:putfield        #400 <Field int IPoint.y>
			list1.add(((Object) (ipoint)));
	//  219  362:aload_2         
	//  220  363:aload           55
	//  221  365:invokeinterface #263 <Method boolean List.add(Object)>
	//  222  370:pop             
		}

	//  223  371:iload           54
	//  224  373:i2f             
	//  225  374:fconst_1        
	//  226  375:fadd            
	//  227  376:f2i             
	//  228  377:istore          54
	//* 229  379:goto            14
	//  230  382:return          
	}

	public void a(boolean flag)
	{
		A = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field boolean A>
		e.e().setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #180 <Field q e>
	//    5    9:invokevirtual   #225 <Method s q.e()>
	//    6   12:iconst_0        
	//    7   13:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
	//    8   18:return          
	}

	public boolean a()
	{
		Rectangle rectangle = e.e().getMapConfig().getGeoRectangle();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field q e>
	//    2    4:invokevirtual   #225 <Method s q.e()>
	//    3    7:invokeinterface #490 <Method MapConfig s.getMapConfig()>
	//    4   12:invokevirtual   #306 <Method Rectangle MapConfig.getGeoRectangle()>
	//    5   15:astore_1        
		if(a != null && rectangle != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #156 <Field Rect a>
	//*   8   20:ifnull          42
	//*   9   23:aload_1         
	//*  10   24:ifnull          42
			return rectangle.isOverlap(a);
	//   11   27:aload_1         
	//   12   28:aload_0         
	//   13   29:getfield        #156 <Field Rect a>
	//   14   32:invokevirtual   #595 <Method boolean Rectangle.isOverlap(Rect)>
	//   15   35:ifeq            40
	//   16   38:iconst_1        
	//   17   39:ireturn         
	//   18   40:iconst_0        
	//   19   41:ireturn         
		else
			return true;
	//   20   42:iconst_1        
	//   21   43:ireturn         
	}

	public boolean a(LatLng latlng)
	{
		ArrayList arraylist;
		float af[] = new float[P.length];
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field float[] P>
	//    2    4:arraylength     
	//    3    5:newarray        float[]
	//    4    7:astore          7
		System.arraycopy(((Object) (P)), 0, ((Object) (af)), 0, P.length);
	//    5    9:aload_0         
	//    6   10:getfield        #334 <Field float[] P>
	//    7   13:iconst_0        
	//    8   14:aload           7
	//    9   16:iconst_0        
	//   10   17:aload_0         
	//   11   18:getfield        #334 <Field float[] P>
	//   12   21:arraylength     
	//   13   22:invokestatic    #480 <Method void System.arraycopy(Object, int, Object, int, int)>
		if(af.length / 3 < 2)
	//*  14   25:aload           7
	//*  15   27:arraylength     
	//*  16   28:iconst_3        
	//*  17   29:idiv            
	//*  18   30:iconst_2        
	//*  19   31:icmpge          36
			return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
		int i1;
		try
		{
			arraylist = g();
	//   22   36:aload_0         
	//   23   37:invokespecial   #600 <Method ArrayList g()>
	//   24   40:astore          8
		}
	//*  25   42:aload           8
	//*  26   44:ifnull          60
	//*  27   47:aload           8
	//*  28   49:invokevirtual   #463 <Method int ArrayList.size()>
	//*  29   52:istore          6
	//*  30   54:iload           6
	//*  31   56:iconst_1        
	//*  32   57:icmpge          62
	//*  33   60:iconst_0        
	//*  34   61:ireturn         
	//*  35   62:goto            68
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*  36   65:astore_1        
		{
			return false;
	//   37   66:iconst_0        
	//   38   67:ireturn         
		}
		if(arraylist == null)
			break MISSING_BLOCK_LABEL_60;
		i1 = arraylist.size();
		if(i1 >= 1)
			break MISSING_BLOCK_LABEL_68;
		return false;
		double d1 = e.e().c().getMapLenWithWin((int)G / 4);
	//   39   68:aload_0         
	//   40   69:getfield        #180 <Field q e>
	//   41   72:invokevirtual   #225 <Method s q.e()>
	//   42   75:invokeinterface #416 <Method GLMapState s.c()>
	//   43   80:aload_0         
	//   44   81:getfield        #142 <Field float G>
	//   45   84:f2i             
	//   46   85:iconst_4        
	//   47   86:idiv            
	//   48   87:invokevirtual   #422 <Method float GLMapState.getMapLenWithWin(int)>
	//   49   90:f2d             
	//   50   91:dstore_2        
		double d2 = e.e().c().getMapLenWithWin(5);
	//   51   92:aload_0         
	//   52   93:getfield        #180 <Field q e>
	//   53   96:invokevirtual   #225 <Method s q.e()>
	//   54   99:invokeinterface #416 <Method GLMapState s.c()>
	//   55  104:iconst_5        
	//   56  105:invokevirtual   #422 <Method float GLMapState.getMapLenWithWin(int)>
	//   57  108:f2d             
	//   58  109:dstore          4
		FPoint fpoint1 = b(latlng);
	//   59  111:aload_0         
	//   60  112:aload_1         
	//   61  113:invokespecial   #602 <Method FPoint b(LatLng)>
	//   62  116:astore          9
		latlng = null;
	//   63  118:aconst_null     
	//   64  119:astore_1        
		for(int j1 = 0; j1 < arraylist.size() - 1;)
	//*  65  120:iconst_0        
	//*  66  121:istore          6
	//*  67  123:iload           6
	//*  68  125:aload           8
	//*  69  127:invokevirtual   #463 <Method int ArrayList.size()>
	//*  70  130:iconst_1        
	//*  71  131:isub            
	//*  72  132:icmpge          206
		{
			if(j1 == 0)
	//*  73  135:iload           6
	//*  74  137:ifne            154
				latlng = ((LatLng) ((FPoint)arraylist.get(j1)));
	//   75  140:aload           8
	//   76  142:iload           6
	//   77  144:invokevirtual   #468 <Method Object ArrayList.get(int)>
	//   78  147:checkcast       #213 <Class FPoint>
	//   79  150:astore_1        
	//*  80  151:goto            154
			FPoint fpoint = (FPoint)arraylist.get(j1 + 1);
	//   81  154:aload           8
	//   82  156:iload           6
	//   83  158:iconst_1        
	//   84  159:iadd            
	//   85  160:invokevirtual   #468 <Method Object ArrayList.get(int)>
	//   86  163:checkcast       #213 <Class FPoint>
	//   87  166:astore          7
			if((d2 + d1) - a(fpoint1, ((FPoint) (latlng)), fpoint) >= 0.0D)
	//*  88  168:dload           4
	//*  89  170:dload_2         
	//*  90  171:dadd            
	//*  91  172:aload_0         
	//*  92  173:aload           9
	//*  93  175:aload_1         
	//*  94  176:aload           7
	//*  95  178:invokespecial   #604 <Method double a(FPoint, FPoint, FPoint)>
	//*  96  181:dsub            
	//*  97  182:dconst_0        
	//*  98  183:dcmpl           
	//*  99  184:iflt            194
			{
				arraylist.clear();
	//  100  187:aload           8
	//  101  189:invokevirtual   #459 <Method void ArrayList.clear()>
				return true;
	//  102  192:iconst_1        
	//  103  193:ireturn         
			}
			j1++;
	//  104  194:iload           6
	//  105  196:iconst_1        
	//  106  197:iadd            
	//  107  198:istore          6
			latlng = ((LatLng) (fpoint));
	//  108  200:aload           7
	//  109  202:astore_1        
		}

	//* 110  203:goto            123
		arraylist.clear();
	//  111  206:aload           8
	//  112  208:invokevirtual   #459 <Method void ArrayList.clear()>
		return false;
	//  113  211:iconst_0        
	//  114  212:ireturn         
	}

	public void b(List list)
	{
		if(list == null || list.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #274 <Method int List.size()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		if(list.size() > 1)
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #274 <Method int List.size()>
	//*   8   20:iconst_1        
	//*   9   21:icmple          53
		{
			t = false;
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:putfield        #114 <Field boolean t>
			B = 5;
	//   13   29:aload_0         
	//   14   30:iconst_5        
	//   15   31:putfield        #130 <Field int B>
			j = list;
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:putfield        #96  <Field List j>
			e.e().setRunLowFrame(false);
	//   19   39:aload_0         
	//   20   40:getfield        #180 <Field q e>
	//   21   43:invokevirtual   #225 <Method s q.e()>
	//   22   46:iconst_0        
	//   23   47:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
			return;
	//   24   52:return          
		} else
		{
			setCustomTexture((BitmapDescriptor)list.get(0));
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:iconst_0        
	//   28   56:invokeinterface #325 <Method Object List.get(int)>
	//   29   61:checkcast       #240 <Class BitmapDescriptor>
	//   30   64:invokevirtual   #608 <Method void setCustomTexture(BitmapDescriptor)>
			return;
	//   31   67:return          
		}
	}

	public void b(boolean flag)
	{
		if(flag && m != null && m.size() > 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            42
	//*   2    4:aload_0         
	//*   3    5:getfield        #102 <Field List m>
	//*   4    8:ifnull          42
	//*   5   11:aload_0         
	//*   6   12:getfield        #102 <Field List m>
	//*   7   15:invokeinterface #274 <Method int List.size()>
	//*   8   20:iconst_1        
	//*   9   21:icmple          42
		{
			B = 4;
	//   10   24:aload_0         
	//   11   25:iconst_4        
	//   12   26:putfield        #130 <Field int B>
			e.e().setRunLowFrame(false);
	//   13   29:aload_0         
	//   14   30:getfield        #180 <Field q e>
	//   15   33:invokevirtual   #225 <Method s q.e()>
	//   16   36:iconst_0        
	//   17   37:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
		}
	//   18   42:return          
	}

	public boolean b()
		throws RemoteException
	{
		Object obj = r;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Object r>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1;
		obj1 = ((Object) (new com.autonavi.amap.mapcore.FPointBounds.Builder()));
	//    5    7:new             #611 <Class com.autonavi.amap.mapcore.FPointBounds$Builder>
	//    6   10:dup             
	//    7   11:invokespecial   #612 <Method void com.autonavi.amap.mapcore.FPointBounds$Builder()>
	//    8   14:astore_3        
		h.clear();
	//    9   15:aload_0         
	//   10   16:getfield        #92  <Field List h>
	//   11   19:invokeinterface #555 <Method void List.clear()>
		z = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #126 <Field boolean z>
		int i1 = 0;
	//   15   29:iconst_0        
	//   16   30:istore_1        
		Iterator iterator;
		P = new float[g.size() * 3];
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #90  <Field List g>
	//   20   36:invokeinterface #274 <Method int List.size()>
	//   21   41:iconst_3        
	//   22   42:imul            
	//   23   43:newarray        float[]
	//   24   45:putfield        #334 <Field float[] P>
		b = P.length;
	//   25   48:aload_0         
	//   26   49:aload_0         
	//   27   50:getfield        #334 <Field float[] P>
	//   28   53:arraylength     
	//   29   54:putfield        #174 <Field int b>
		iterator = g.iterator();
	//   30   57:aload_0         
	//   31   58:getfield        #90  <Field List g>
	//   32   61:invokeinterface #285 <Method Iterator List.iterator()>
	//   33   66:astore          4
_L3:
		FPoint3 fpoint3;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_301;
	//   34   68:aload           4
	//   35   70:invokeinterface #290 <Method boolean Iterator.hasNext()>
	//   36   75:ifeq            301
		IPoint ipoint = (IPoint)iterator.next();
	//   37   78:aload           4
	//   38   80:invokeinterface #294 <Method Object Iterator.next()>
	//   39   85:checkcast       #378 <Class IPoint>
	//   40   88:astore          6
		fpoint3 = new FPoint3();
	//   41   90:new             #351 <Class FPoint3>
	//   42   93:dup             
	//   43   94:invokespecial   #556 <Method void FPoint3()>
	//   44   97:astore          5
		e.e().a(ipoint.x, ipoint.y, ((FPoint) (fpoint3)));
	//   45   99:aload_0         
	//   46  100:getfield        #180 <Field q e>
	//   47  103:invokevirtual   #225 <Method s q.e()>
	//   48  106:aload           6
	//   49  108:getfield        #398 <Field int IPoint.x>
	//   50  111:aload           6
	//   51  113:getfield        #400 <Field int IPoint.y>
	//   52  116:aload           5
	//   53  118:invokeinterface #403 <Method void s.a(int, int, FPoint)>
		P[i1 * 3] = fpoint3.x;
	//   54  123:aload_0         
	//   55  124:getfield        #334 <Field float[] P>
	//   56  127:iload_1         
	//   57  128:iconst_3        
	//   58  129:imul            
	//   59  130:aload           5
	//   60  132:getfield        #469 <Field float FPoint3.x>
	//   61  135:fastore         
		P[i1 * 3 + 1] = fpoint3.y;
	//   62  136:aload_0         
	//   63  137:getfield        #334 <Field float[] P>
	//   64  140:iload_1         
	//   65  141:iconst_3        
	//   66  142:imul            
	//   67  143:iconst_1        
	//   68  144:iadd            
	//   69  145:aload           5
	//   70  147:getfield        #470 <Field float FPoint3.y>
	//   71  150:fastore         
		P[i1 * 3 + 2] = 0.0F;
	//   72  151:aload_0         
	//   73  152:getfield        #334 <Field float[] P>
	//   74  155:iload_1         
	//   75  156:iconst_3        
	//   76  157:imul            
	//   77  158:iconst_2        
	//   78  159:iadd            
	//   79  160:fconst_0        
	//   80  161:fastore         
		if(l == null) goto _L2; else goto _L1
	//   81  162:aload_0         
	//   82  163:getfield        #100 <Field List l>
	//   83  166:ifnull          275
_L1:
		List list = l;
	//   84  169:aload_0         
	//   85  170:getfield        #100 <Field List l>
	//   86  173:astore          6
		list;
	//   87  175:aload           6
		JVM INSTR monitorenter ;
	//   88  177:monitorenter    
		if(l != null && l.size() > i1)
	//*  89  178:aload_0         
	//*  90  179:getfield        #100 <Field List l>
	//*  91  182:ifnull          222
	//*  92  185:aload_0         
	//*  93  186:getfield        #100 <Field List l>
	//*  94  189:invokeinterface #274 <Method int List.size()>
	//*  95  194:iload_1         
	//*  96  195:icmple          222
		{
			fpoint3.setColorIndex(((Integer)l.get(i1)).intValue());
	//   97  198:aload           5
	//   98  200:aload_0         
	//   99  201:getfield        #100 <Field List l>
	//  100  204:iload_1         
	//  101  205:invokeinterface #325 <Method Object List.get(int)>
	//  102  210:checkcast       #327 <Class Integer>
	//  103  213:invokevirtual   #330 <Method int Integer.intValue()>
	//  104  216:invokevirtual   #559 <Method void FPoint3.setColorIndex(int)>
			break MISSING_BLOCK_LABEL_263;
	//  105  219:goto            263
		}
		if(m != null && m.size() > i1)
	//* 106  222:aload_0         
	//* 107  223:getfield        #102 <Field List m>
	//* 108  226:ifnull          263
	//* 109  229:aload_0         
	//* 110  230:getfield        #102 <Field List m>
	//* 111  233:invokeinterface #274 <Method int List.size()>
	//* 112  238:iload_1         
	//* 113  239:icmple          263
			fpoint3.setColorIndex(((Integer)m.get(i1)).intValue());
	//  114  242:aload           5
	//  115  244:aload_0         
	//  116  245:getfield        #102 <Field List m>
	//  117  248:iload_1         
	//  118  249:invokeinterface #325 <Method Object List.get(int)>
	//  119  254:checkcast       #327 <Class Integer>
	//  120  257:invokevirtual   #330 <Method int Integer.intValue()>
	//  121  260:invokevirtual   #559 <Method void FPoint3.setColorIndex(int)>
		list;
	//  122  263:aload           6
		JVM INSTR monitorexit ;
	//  123  265:monitorexit     
		  goto _L2
	//* 124  266:goto            275
		obj1;
	//  125  269:astore_3        
	//* 126  270:aload           6
		throw obj1;
	//  127  272:monitorexit     
	//  128  273:aload_3         
	//  129  274:athrow          
_L2:
		h.add(((Object) (fpoint3)));
	//  130  275:aload_0         
	//  131  276:getfield        #92  <Field List h>
	//  132  279:aload           5
	//  133  281:invokeinterface #263 <Method boolean List.add(Object)>
	//  134  286:pop             
		((com.autonavi.amap.mapcore.FPointBounds.Builder) (obj1)).include(((FPoint) (fpoint3)));
	//  135  287:aload_3         
	//  136  288:aload           5
	//  137  290:invokevirtual   #615 <Method com.autonavi.amap.mapcore.FPointBounds$Builder com.autonavi.amap.mapcore.FPointBounds$Builder.include(FPoint)>
	//  138  293:pop             
		i1++;
	//  139  294:iload_1         
	//  140  295:iconst_1        
	//  141  296:iadd            
	//  142  297:istore_1        
		  goto _L3
	//* 143  298:goto            68
		T = ((com.autonavi.amap.mapcore.FPointBounds.Builder) (obj1)).build();
	//  144  301:aload_0         
	//  145  302:aload_3         
	//  146  303:invokevirtual   #619 <Method FPointBounds com.autonavi.amap.mapcore.FPointBounds$Builder.build()>
	//  147  306:putfield        #154 <Field FPointBounds T>
		obj;
	//  148  309:aload_2         
		JVM INSTR monitorexit ;
	//  149  310:monitorexit     
		  goto _L4
	//* 150  311:goto            319
		Exception exception;
		exception;
	//  151  314:astore_3        
	//* 152  315:aload_2         
		throw exception;
	//  153  316:monitorexit     
	//  154  317:aload_3         
	//  155  318:athrow          
_L4:
		if(!A)
	//* 156  319:aload_0         
	//* 157  320:getfield        #128 <Field boolean A>
	//* 158  323:ifne            337
			p = fd.a(P);
	//  159  326:aload_0         
	//  160  327:aload_0         
	//  161  328:getfield        #334 <Field float[] P>
	//  162  331:invokestatic    #622 <Method FloatBuffer fd.a(float[])>
	//  163  334:putfield        #624 <Field FloatBuffer p>
		E = g.size();
	//  164  337:aload_0         
	//  165  338:aload_0         
	//  166  339:getfield        #90  <Field List g>
	//  167  342:invokeinterface #274 <Method int List.size()>
	//  168  347:putfield        #137 <Field int E>
		e();
	//  169  350:aload_0         
	//  170  351:invokespecial   #363 <Method void e()>
		return true;
	//  171  354:iconst_1        
	//  172  355:ireturn         
	}

	public void c(List list)
	{
		if(list == null || list.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #274 <Method int List.size()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		m = list;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #102 <Field List m>
		if(list.size() > 1)
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #274 <Method int List.size()>
	//*  11   25:iconst_1        
	//*  12   26:icmple          62
		{
			t = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #114 <Field boolean t>
			o = e(list);
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #626 <Method List e(List)>
	//   20   40:putfield        #106 <Field List o>
			B = 3;
	//   21   43:aload_0         
	//   22   44:iconst_3        
	//   23   45:putfield        #130 <Field int B>
			e.e().setRunLowFrame(false);
	//   24   48:aload_0         
	//   25   49:getfield        #180 <Field q e>
	//   26   52:invokevirtual   #225 <Method s q.e()>
	//   27   55:iconst_0        
	//   28   56:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
			return;
	//   29   61:return          
		} else
		{
			setColor(((Integer)list.get(0)).intValue());
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:iconst_0        
	//   33   65:invokeinterface #325 <Method Object List.get(int)>
	//   34   70:checkcast       #327 <Class Integer>
	//   35   73:invokevirtual   #330 <Method int Integer.intValue()>
	//   36   76:invokevirtual   #629 <Method void setColor(int)>
			return;
	//   37   79:return          
		}
	}

	public boolean c()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field boolean z>
	//    2    4:ireturn         
	}

	public void d()
	{
		w = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #120 <Field boolean w>
		C = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #132 <Field int C>
		if(R != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #276 <Field int[] R>
	//*   8   14:ifnull          25
			Arrays.fill(R, 0);
	//    9   17:aload_0         
	//   10   18:getfield        #276 <Field int[] R>
	//   11   21:iconst_0        
	//   12   22:invokestatic    #636 <Method void Arrays.fill(int[], int)>
	//   13   25:return          
	}

	public void destroy()
	{
		remove();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #640 <Method void remove()>
		if(k == null || k.size() <= 0) goto _L2; else goto _L1
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field List k>
	//    4    8:ifnull          98
	//    5   11:aload_0         
	//    6   12:getfield        #98  <Field List k>
	//    7   15:invokeinterface #274 <Method int List.size()>
	//    8   20:ifle            98
_L1:
		int i1 = 0;
	//    9   23:iconst_0        
	//   10   24:istore_1        
_L7:
		Object obj;
		if(i1 < k.size())
	//*  11   25:iload_1         
	//*  12   26:aload_0         
	//*  13   27:getfield        #98  <Field List k>
	//*  14   30:invokeinterface #274 <Method int List.size()>
	//*  15   35:icmpge          89
		{
			obj = ((Object) ((ab)k.get(i1)));
	//   16   38:aload_0         
	//   17   39:getfield        #98  <Field List k>
	//   18   42:iload_1         
	//   19   43:invokeinterface #325 <Method Object List.get(int)>
	//   20   48:checkcast       #232 <Class ab>
	//   21   51:astore_2        
			break MISSING_BLOCK_LABEL_52;
		}
	//*  22   52:aload_2         
	//*  23   53:ifnull          320
	//*  24   56:aload_0         
	//*  25   57:getfield        #180 <Field q e>
	//*  26   60:aload_2         
	//*  27   61:invokevirtual   #235 <Method int ab.f()>
	//*  28   64:invokestatic    #474 <Method Integer Integer.valueOf(int)>
	//*  29   67:invokevirtual   #643 <Method void q.a(Integer)>
	//*  30   70:aload_0         
	//*  31   71:getfield        #180 <Field q e>
	//*  32   74:invokevirtual   #225 <Method s q.e()>
	//*  33   77:aload_2         
	//*  34   78:invokevirtual   #645 <Method String ab.j()>
	//*  35   81:invokeinterface #648 <Method void s.c(String)>
	//*  36   86:goto            320
		k.clear();
	//   37   89:aload_0         
	//   38   90:getfield        #98  <Field List k>
	//   39   93:invokeinterface #555 <Method void List.clear()>
_L2:
		if(P != null)
	//*  40   98:aload_0         
	//*  41   99:getfield        #334 <Field float[] P>
	//*  42  102:ifnull          110
			P = null;
	//   43  105:aload_0         
	//   44  106:aconst_null     
	//   45  107:putfield        #334 <Field float[] P>
		if(p != null)
	//*  46  110:aload_0         
	//*  47  111:getfield        #624 <Field FloatBuffer p>
	//*  48  114:ifnull          130
		{
			p.clear();
	//   49  117:aload_0         
	//   50  118:getfield        #624 <Field FloatBuffer p>
	//   51  121:invokevirtual   #653 <Method java.nio.Buffer FloatBuffer.clear()>
	//   52  124:pop             
			p = null;
	//   53  125:aload_0         
	//   54  126:aconst_null     
	//   55  127:putfield        #624 <Field FloatBuffer p>
		}
		if(j != null && j.size() > 0)
	//*  56  130:aload_0         
	//*  57  131:getfield        #96  <Field List j>
	//*  58  134:ifnull          183
	//*  59  137:aload_0         
	//*  60  138:getfield        #96  <Field List j>
	//*  61  141:invokeinterface #274 <Method int List.size()>
	//*  62  146:ifle            183
			for(obj = ((Object) (j.iterator())); ((Iterator) (obj)).hasNext(); ((BitmapDescriptor)((Iterator) (obj)).next()).recycle());
	//   63  149:aload_0         
	//   64  150:getfield        #96  <Field List j>
	//   65  153:invokeinterface #285 <Method Iterator List.iterator()>
	//   66  158:astore_2        
	//   67  159:aload_2         
	//   68  160:invokeinterface #290 <Method boolean Iterator.hasNext()>
	//   69  165:ifeq            183
	//   70  168:aload_2         
	//   71  169:invokeinterface #294 <Method Object Iterator.next()>
	//   72  174:checkcast       #240 <Class BitmapDescriptor>
	//   73  177:invokevirtual   #654 <Method void BitmapDescriptor.recycle()>
	//*  74  180:goto            159
		this;
	//   75  183:aload_0         
		JVM INSTR monitorenter ;
	//   76  184:monitorenter    
		if(q != null)
	//*  77  185:aload_0         
	//*  78  186:getfield        #108 <Field BitmapDescriptor q>
	//*  79  189:ifnull          199
			q.recycle();
	//   80  192:aload_0         
	//   81  193:getfield        #108 <Field BitmapDescriptor q>
	//   82  196:invokevirtual   #654 <Method void BitmapDescriptor.recycle()>
		this;
	//   83  199:aload_0         
		JVM INSTR monitorexit ;
	//   84  200:monitorexit     
		  goto _L3
	//*  85  201:goto            209
		exception;
	//   86  204:astore_2        
	//*  87  205:aload_0         
		throw exception;
	//   88  206:monitorexit     
	//   89  207:aload_2         
	//   90  208:athrow          
_L3:
		if(m != null)
	//*  91  209:aload_0         
	//*  92  210:getfield        #102 <Field List m>
	//*  93  213:ifnull          230
		{
			m.clear();
	//   94  216:aload_0         
	//   95  217:getfield        #102 <Field List m>
	//   96  220:invokeinterface #555 <Method void List.clear()>
			m = null;
	//   97  225:aload_0         
	//   98  226:aconst_null     
	//   99  227:putfield        #102 <Field List m>
		}
		if(l == null) goto _L5; else goto _L4
	//  100  230:aload_0         
	//  101  231:getfield        #100 <Field List l>
	//  102  234:ifnull          268
_L4:
		exception = ((Exception) (l));
	//  103  237:aload_0         
	//  104  238:getfield        #100 <Field List l>
	//  105  241:astore_2        
		exception;
	//  106  242:aload_2         
		JVM INSTR monitorenter ;
	//  107  243:monitorenter    
		l.clear();
	//  108  244:aload_0         
	//  109  245:getfield        #100 <Field List l>
	//  110  248:invokeinterface #555 <Method void List.clear()>
		l = null;
	//  111  253:aload_0         
	//  112  254:aconst_null     
	//  113  255:putfield        #100 <Field List l>
		exception;
	//  114  258:aload_2         
		JVM INSTR monitorexit ;
	//  115  259:monitorexit     
		  goto _L5
	//* 116  260:goto            268
		exception1;
	//  117  263:astore_3        
	//* 118  264:aload_2         
		throw exception1;
	//  119  265:monitorexit     
	//  120  266:aload_3         
	//  121  267:athrow          
_L5:
		if(i != null)
	//* 122  268:aload_0         
	//* 123  269:getfield        #94  <Field List i>
	//* 124  272:ifnull          289
		{
			i.clear();
	//  125  275:aload_0         
	//  126  276:getfield        #94  <Field List i>
	//  127  279:invokeinterface #555 <Method void List.clear()>
			i = null;
	//  128  284:aload_0         
	//  129  285:aconst_null     
	//  130  286:putfield        #94  <Field List i>
		}
		U = null;
	//  131  289:aload_0         
	//  132  290:aconst_null     
	//  133  291:putfield        #656 <Field PolylineOptions U>
		return;
	//  134  294:return          
		Exception exception;
		Exception exception1;
		if(obj != null)
			try
			{
				e.a(Integer.valueOf(((ab) (obj)).f()));
				e.e().c(((ab) (obj)).j());
			}
			catch(Throwable throwable)
	//* 135  295:astore_2        
			{
				hm.c(throwable, "PolylineDelegateImp", "destroy");
	//  136  296:aload_2         
	//  137  297:ldc1            #192 <String "PolylineDelegateImp">
	//  138  299:ldc2            #657 <String "destroy">
	//  139  302:invokestatic    #199 <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//  140  305:aload_2         
	//  141  306:invokevirtual   #348 <Method void Throwable.printStackTrace()>
				Log.d("destroy erro", "PolylineDelegateImp destroy");
	//  142  309:ldc2            #659 <String "destroy erro">
	//  143  312:ldc2            #661 <String "PolylineDelegateImp destroy">
	//  144  315:invokestatic    #666 <Method int Log.d(String, String)>
	//  145  318:pop             
				return;
	//  146  319:return          
			}
		i1++;
	//  147  320:iload_1         
	//  148  321:iconst_1        
	//  149  322:iadd            
	//  150  323:istore_1        
		if(true) goto _L7; else goto _L6
	//  151  324:goto            25
_L6:
	}

	public boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlay))) || ioverlay.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #671 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #674 <Method String IOverlay.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #188 <Method String getId()>
	//    8   18:invokevirtual   #677 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int getColor()
		throws RemoteException
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field int D>
	//    2    4:ireturn         
	}

	public String getId()
		throws RemoteException
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field String f>
	//*   2    4:ifnonnull       21
			f = e.a("Polyline");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #180 <Field q e>
	//    6   12:ldc2            #680 <String "Polyline">
	//    7   15:invokevirtual   #683 <Method String q.a(String)>
	//    8   18:putfield        #190 <Field String f>
		return f;
	//    9   21:aload_0         
	//   10   22:getfield        #190 <Field String f>
	//   11   25:areturn         
	}

	public LatLng getNearestLatLng(LatLng latlng)
	{
		float f2;
		int i1;
		int j1;
		if(latlng == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(i == null || i.size() == 0)
	//*   4    6:aload_0         
	//*   5    7:getfield        #94  <Field List i>
	//*   6   10:ifnull          25
	//*   7   13:aload_0         
	//*   8   14:getfield        #94  <Field List i>
	//*   9   17:invokeinterface #274 <Method int List.size()>
	//*  10   22:ifne            27
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
		j1 = 0;
	//   13   27:iconst_0        
	//   14   28:istore          6
		f2 = 0.0F;
	//   15   30:fconst_0        
	//   16   31:fstore_3        
		i1 = 0;
	//   17   32:iconst_0        
	//   18   33:istore          5
_L2:
		if(i1 >= i.size())
			break MISSING_BLOCK_LABEL_115;
	//   19   35:iload           5
	//   20   37:aload_0         
	//   21   38:getfield        #94  <Field List i>
	//   22   41:invokeinterface #274 <Method int List.size()>
	//   23   46:icmpge          115
		float f1;
		if(i1 == 0)
	//*  24   49:iload           5
	//*  25   51:ifne            76
		{
			float f3;
			try
			{
				f1 = AMapUtils.calculateLineDistance(latlng, (LatLng)i.get(i1));
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #94  <Field List i>
	//   29   59:iload           5
	//   30   61:invokeinterface #325 <Method Object List.get(int)>
	//   31   66:checkcast       #384 <Class LatLng>
	//   32   69:invokestatic    #691 <Method float AMapUtils.calculateLineDistance(LatLng, LatLng)>
	//   33   72:fstore_2        
			}
	//*  34   73:goto            148
	//*  35   76:aload_1         
	//*  36   77:aload_0         
	//*  37   78:getfield        #94  <Field List i>
	//*  38   81:iload           5
	//*  39   83:invokeinterface #325 <Method Object List.get(int)>
	//*  40   88:checkcast       #384 <Class LatLng>
	//*  41   91:invokestatic    #691 <Method float AMapUtils.calculateLineDistance(LatLng, LatLng)>
	//*  42   94:fstore          4
	//*  43   96:fload_3         
	//*  44   97:fstore_2        
	//*  45   98:fload_3         
	//*  46   99:fload           4
	//*  47  101:fcmpl           
	//*  48  102:ifle            148
	//*  49  105:fload           4
	//*  50  107:fstore_2        
	//*  51  108:iload           5
	//*  52  110:istore          6
	//*  53  112:goto            148
	//*  54  115:aload_0         
	//*  55  116:getfield        #94  <Field List i>
	//*  56  119:iload           6
	//*  57  121:invokeinterface #325 <Method Object List.get(int)>
	//*  58  126:checkcast       #384 <Class LatLng>
	//*  59  129:astore_1        
	//*  60  130:aload_1         
	//*  61  131:areturn         
			// Misplaced declaration of an exception variable
			catch(LatLng latlng)
	//*  62  132:astore_1        
			{
				hm.c(((Throwable) (latlng)), "PolylineDelegateImp", "getNearestLatLng");
	//   63  133:aload_1         
	//   64  134:ldc1            #192 <String "PolylineDelegateImp">
	//   65  136:ldc2            #692 <String "getNearestLatLng">
	//   66  139:invokestatic    #199 <Method void hm.c(Throwable, String, String)>
				((Throwable) (latlng)).printStackTrace();
	//   67  142:aload_1         
	//   68  143:invokevirtual   #348 <Method void Throwable.printStackTrace()>
				return null;
	//   69  146:aconst_null     
	//   70  147:areturn         
			}
			break MISSING_BLOCK_LABEL_148;
		}
		f3 = AMapUtils.calculateLineDistance(latlng, (LatLng)i.get(i1));
		f1 = f2;
		if(f2 > f3)
		{
			f1 = f3;
			j1 = i1;
		}
		break MISSING_BLOCK_LABEL_148;
		latlng = (LatLng)i.get(j1);
		return latlng;
		i1++;
	//   71  148:iload           5
	//   72  150:iconst_1        
	//   73  151:iadd            
	//   74  152:istore          5
		f2 = f1;
	//   75  154:fload_2         
	//   76  155:fstore_3        
		if(true) goto _L2; else goto _L1
	//   77  156:goto            35
_L1:
	}

	public PolylineOptions getOptions()
	{
		return U;
	//    0    0:aload_0         
	//    1    1:getfield        #656 <Field PolylineOptions U>
	//    2    4:areturn         
	}

	public List getPoints()
		throws RemoteException
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field List i>
	//    2    4:areturn         
	}

	public float getWidth()
		throws RemoteException
	{
		return G;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field float G>
	//    2    4:freturn         
	}

	public float getZIndex()
		throws RemoteException
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field float H>
	//    2    4:freturn         
	}

	public int hashCodeRemote()
		throws RemoteException
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #703 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public boolean isAboveMaskLayer()
	{
		return S;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field boolean S>
	//    2    4:ireturn         
	}

	public boolean isDottedLine()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field boolean v>
	//    2    4:ireturn         
	}

	public boolean isGeodesic()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field boolean u>
	//    2    4:ireturn         
	}

	public boolean isVisible()
		throws RemoteException
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field boolean s>
	//    2    4:ireturn         
	}

	public void remove()
		throws RemoteException
	{
		e.d(getId());
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field q e>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #188 <Method String getId()>
	//    4    8:invokevirtual   #710 <Method boolean q.d(String)>
	//    5   11:pop             
		setVisible(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #713 <Method void setVisible(boolean)>
		e.e().setRunLowFrame(false);
	//    9   17:aload_0         
	//   10   18:getfield        #180 <Field q e>
	//   11   21:invokevirtual   #225 <Method s q.e()>
	//   12   24:iconst_0        
	//   13   25:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
	//   14   30:return          
	}

	public void setAboveMaskLayer(boolean flag)
	{
		S = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #152 <Field boolean S>
	//    3    5:return          
	}

	public void setColor(int i1)
	{
		if(B == 0 || B == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field int B>
	//*   2    4:ifeq            15
	//*   3    7:aload_0         
	//*   4    8:getfield        #130 <Field int B>
	//*   5   11:iconst_2        
	//*   6   12:icmpne          112
		{
			D = i1;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #135 <Field int D>
			J = (float)Color.alpha(i1) / 255F;
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokestatic    #719 <Method int Color.alpha(int)>
	//   13   25:i2f             
	//   14   26:ldc2            #720 <Float 255F>
	//   15   29:fdiv            
	//   16   30:putfield        #450 <Field float J>
			K = (float)Color.red(i1) / 255F;
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:invokestatic    #723 <Method int Color.red(int)>
	//   20   38:i2f             
	//   21   39:ldc2            #720 <Float 255F>
	//   22   42:fdiv            
	//   23   43:putfield        #444 <Field float K>
			L = (float)Color.green(i1) / 255F;
	//   24   46:aload_0         
	//   25   47:iload_1         
	//   26   48:invokestatic    #726 <Method int Color.green(int)>
	//   27   51:i2f             
	//   28   52:ldc2            #720 <Float 255F>
	//   29   55:fdiv            
	//   30   56:putfield        #446 <Field float L>
			M = (float)Color.blue(i1) / 255F;
	//   31   59:aload_0         
	//   32   60:iload_1         
	//   33   61:invokestatic    #729 <Method int Color.blue(int)>
	//   34   64:i2f             
	//   35   65:ldc2            #720 <Float 255F>
	//   36   68:fdiv            
	//   37   69:putfield        #448 <Field float M>
			if(t)
	//*  38   72:aload_0         
	//*  39   73:getfield        #114 <Field boolean t>
	//*  40   76:ifeq            99
				if(v)
	//*  41   79:aload_0         
	//*  42   80:getfield        #118 <Field boolean v>
	//*  43   83:ifeq            94
					B = 2;
	//   44   86:aload_0         
	//   45   87:iconst_2        
	//   46   88:putfield        #130 <Field int B>
				else
	//*  47   91:goto            99
					B = 0;
	//   48   94:aload_0         
	//   49   95:iconst_0        
	//   50   96:putfield        #130 <Field int B>
			e.e().setRunLowFrame(false);
	//   51   99:aload_0         
	//   52  100:getfield        #180 <Field q e>
	//   53  103:invokevirtual   #225 <Method s q.e()>
	//   54  106:iconst_0        
	//   55  107:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
		}
		U.color(i1);
	//   56  112:aload_0         
	//   57  113:getfield        #656 <Field PolylineOptions U>
	//   58  116:iload_1         
	//   59  117:invokevirtual   #735 <Method PolylineOptions PolylineOptions.color(int)>
	//   60  120:pop             
	//   61  121:return          
	}

	public void setCustemTextureIndex(List list)
	{
		if(list == null || list.size() == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #274 <Method int List.size()>
	//*   4   10:ifne            14
			return;
	//    5   13:return          
		List list1 = l;
	//    6   14:aload_0         
	//    7   15:getfield        #100 <Field List l>
	//    8   18:astore_2        
		list1;
	//    9   19:aload_2         
		JVM INSTR monitorenter ;
	//   10   20:monitorenter    
		l.clear();
	//   11   21:aload_0         
	//   12   22:getfield        #100 <Field List l>
	//   13   25:invokeinterface #555 <Method void List.clear()>
		l.addAll(((java.util.Collection) (list)));
	//   14   30:aload_0         
	//   15   31:getfield        #100 <Field List l>
	//   16   34:aload_1         
	//   17   35:invokeinterface #740 <Method boolean List.addAll(java.util.Collection)>
	//   18   40:pop             
		n = e(list);
	//   19   41:aload_0         
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:invokespecial   #626 <Method List e(List)>
	//   23   47:putfield        #104 <Field List n>
		y = true;
	//   24   50:aload_0         
	//   25   51:iconst_1        
	//   26   52:putfield        #124 <Field boolean y>
		list1;
	//   27   55:aload_2         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		  goto _L1
	//*  29   57:goto            65
		list;
	//   30   60:astore_1        
	//*  31   61:aload_2         
		throw list;
	//   32   62:monitorexit     
	//   33   63:aload_1         
	//   34   64:athrow          
_L1:
		return;
	//   35   65:return          
		list;
	//   36   66:astore_1        
		((Throwable) (list)).printStackTrace();
	//   37   67:aload_1         
	//   38   68:invokevirtual   #348 <Method void Throwable.printStackTrace()>
		return;
	//   39   71:return          
	}

	public void setCustomTexture(BitmapDescriptor bitmapdescriptor)
	{
		long l1 = System.nanoTime();
	//    0    0:invokestatic    #744 <Method long System.nanoTime()>
	//    1    3:lstore_2        
		if(l1 - d < 16L)
	//*   2    4:lload_2         
	//*   3    5:aload_0         
	//*   4    6:getfield        #178 <Field long d>
	//*   5    9:lsub            
	//*   6   10:ldc2w           #745 <Long 16L>
	//*   7   13:lcmp            
	//*   8   14:ifge            18
			return;
	//    9   17:return          
		d = l1;
	//   10   18:aload_0         
	//   11   19:lload_2         
	//   12   20:putfield        #178 <Field long d>
		if(bitmapdescriptor == null)
	//*  13   23:aload_1         
	//*  14   24:ifnonnull       28
			return;
	//   15   27:return          
		this;
	//   16   28:aload_0         
		JVM INSTR monitorenter ;
	//   17   29:monitorenter    
		t = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #114 <Field boolean t>
		w = false;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #120 <Field boolean w>
		B = 1;
	//   24   40:aload_0         
	//   25   41:iconst_1        
	//   26   42:putfield        #130 <Field int B>
		q = bitmapdescriptor;
	//   27   45:aload_0         
	//   28   46:aload_1         
	//   29   47:putfield        #108 <Field BitmapDescriptor q>
		e.e().setRunLowFrame(false);
	//   30   50:aload_0         
	//   31   51:getfield        #180 <Field q e>
	//   32   54:invokevirtual   #225 <Method s q.e()>
	//   33   57:iconst_0        
	//   34   58:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
		if(U != null)
	//*  35   63:aload_0         
	//*  36   64:getfield        #656 <Field PolylineOptions U>
	//*  37   67:ifnull          79
			U.setCustomTexture(bitmapdescriptor);
	//   38   70:aload_0         
	//   39   71:getfield        #656 <Field PolylineOptions U>
	//   40   74:aload_1         
	//   41   75:invokevirtual   #749 <Method PolylineOptions PolylineOptions.setCustomTexture(BitmapDescriptor)>
	//   42   78:pop             
		this;
	//   43   79:aload_0         
		JVM INSTR monitorexit ;
	//   44   80:monitorexit     
		return;
	//   45   81:return          
		bitmapdescriptor;
	//   46   82:astore_1        
	//*  47   83:aload_0         
		throw bitmapdescriptor;
	//   48   84:monitorexit     
	//   49   85:aload_1         
	//   50   86:athrow          
	}

	public void setDottedLine(boolean flag)
	{
		if(B == 2 || B == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field int B>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          15
	//*   4    8:aload_0         
	//*   5    9:getfield        #130 <Field int B>
	//*   6   12:ifne            68
		{
			v = flag;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #118 <Field boolean v>
			if(flag && t)
	//*  10   20:iload_1         
	//*  11   21:ifeq            39
	//*  12   24:aload_0         
	//*  13   25:getfield        #114 <Field boolean t>
	//*  14   28:ifeq            39
				B = 2;
	//   15   31:aload_0         
	//   16   32:iconst_2        
	//   17   33:putfield        #130 <Field int B>
			else
	//*  18   36:goto            55
			if(!flag && t)
	//*  19   39:iload_1         
	//*  20   40:ifne            55
	//*  21   43:aload_0         
	//*  22   44:getfield        #114 <Field boolean t>
	//*  23   47:ifeq            55
				B = 0;
	//   24   50:aload_0         
	//   25   51:iconst_0        
	//   26   52:putfield        #130 <Field int B>
			e.e().setRunLowFrame(false);
	//   27   55:aload_0         
	//   28   56:getfield        #180 <Field q e>
	//   29   59:invokevirtual   #225 <Method s q.e()>
	//   30   62:iconst_0        
	//   31   63:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
		}
	//   32   68:return          
	}

	public void setGeodesic(boolean flag)
		throws RemoteException
	{
		u = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field boolean u>
		e.e().setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #180 <Field q e>
	//    5    9:invokevirtual   #225 <Method s q.e()>
	//    6   12:iconst_0        
	//    7   13:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
	//    8   18:return          
	}

	public void setOptions(PolylineOptions polylineoptions)
	{
		if(polylineoptions == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		U = polylineoptions;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #656 <Field PolylineOptions U>
		try
		{
			setColor(polylineoptions.getColor());
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #753 <Method int PolylineOptions.getColor()>
	//    9   15:invokevirtual   #629 <Method void setColor(int)>
			setGeodesic(polylineoptions.isGeodesic());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #755 <Method boolean PolylineOptions.isGeodesic()>
	//   13   23:invokevirtual   #757 <Method void setGeodesic(boolean)>
			setDottedLine(polylineoptions.isDottedLine());
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #759 <Method boolean PolylineOptions.isDottedLine()>
	//   17   31:invokevirtual   #761 <Method void setDottedLine(boolean)>
			a(polylineoptions.getDottedLineType());
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #764 <Method int PolylineOptions.getDottedLineType()>
	//   21   39:invokevirtual   #765 <Method void a(int)>
			setAboveMaskLayer(polylineoptions.isAboveMaskLayer());
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #767 <Method boolean PolylineOptions.isAboveMaskLayer()>
	//   25   47:invokevirtual   #769 <Method void setAboveMaskLayer(boolean)>
			setVisible(polylineoptions.isVisible());
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #771 <Method boolean PolylineOptions.isVisible()>
	//   29   55:invokevirtual   #713 <Method void setVisible(boolean)>
			setWidth(polylineoptions.getWidth());
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #773 <Method float PolylineOptions.getWidth()>
	//   33   63:invokevirtual   #777 <Method void setWidth(float)>
			setZIndex(polylineoptions.getZIndex());
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokevirtual   #779 <Method float PolylineOptions.getZIndex()>
	//   37   71:invokevirtual   #782 <Method void setZIndex(float)>
			a(polylineoptions.isUseTexture());
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:invokevirtual   #785 <Method boolean PolylineOptions.isUseTexture()>
	//   41   79:invokevirtual   #787 <Method void a(boolean)>
			setTransparency(polylineoptions.getTransparency());
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:invokevirtual   #790 <Method float PolylineOptions.getTransparency()>
	//   45   87:invokevirtual   #793 <Method void setTransparency(float)>
			a(polylineoptions.getLineCapType());
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:invokevirtual   #797 <Method com.amap.api.maps.model.PolylineOptions$LineCapType PolylineOptions.getLineCapType()>
	//   49   95:invokevirtual   #799 <Method void a(com.amap.api.maps.model.PolylineOptions$LineCapType)>
			a(polylineoptions.getLineJoinType());
	//   50   98:aload_0         
	//   51   99:aload_1         
	//   52  100:invokevirtual   #803 <Method com.amap.api.maps.model.PolylineOptions$LineJoinType PolylineOptions.getLineJoinType()>
	//   53  103:invokevirtual   #805 <Method void a(com.amap.api.maps.model.PolylineOptions$LineJoinType)>
			if(polylineoptions.getColorValues() != null)
	//*  54  106:aload_1         
	//*  55  107:invokevirtual   #808 <Method List PolylineOptions.getColorValues()>
	//*  56  110:ifnull          129
			{
				c(polylineoptions.getColorValues());
	//   57  113:aload_0         
	//   58  114:aload_1         
	//   59  115:invokevirtual   #808 <Method List PolylineOptions.getColorValues()>
	//   60  118:invokevirtual   #810 <Method void c(List)>
				b(polylineoptions.isUseGradient());
	//   61  121:aload_0         
	//   62  122:aload_1         
	//   63  123:invokevirtual   #813 <Method boolean PolylineOptions.isUseGradient()>
	//   64  126:invokevirtual   #815 <Method void b(boolean)>
			}
			if(polylineoptions.getCustomTexture() != null)
	//*  65  129:aload_1         
	//*  66  130:invokevirtual   #819 <Method BitmapDescriptor PolylineOptions.getCustomTexture()>
	//*  67  133:ifnull          148
			{
				setCustomTexture(polylineoptions.getCustomTexture());
	//   68  136:aload_0         
	//   69  137:aload_1         
	//   70  138:invokevirtual   #819 <Method BitmapDescriptor PolylineOptions.getCustomTexture()>
	//   71  141:invokevirtual   #608 <Method void setCustomTexture(BitmapDescriptor)>
				d();
	//   72  144:aload_0         
	//   73  145:invokevirtual   #821 <Method void d()>
			}
			if(polylineoptions.getCustomTextureList() != null)
	//*  74  148:aload_1         
	//*  75  149:invokevirtual   #824 <Method List PolylineOptions.getCustomTextureList()>
	//*  76  152:ifnull          175
			{
				b(polylineoptions.getCustomTextureList());
	//   77  155:aload_0         
	//   78  156:aload_1         
	//   79  157:invokevirtual   #824 <Method List PolylineOptions.getCustomTextureList()>
	//   80  160:invokevirtual   #826 <Method void b(List)>
				setCustemTextureIndex(polylineoptions.getCustomTextureIndex());
	//   81  163:aload_0         
	//   82  164:aload_1         
	//   83  165:invokevirtual   #829 <Method List PolylineOptions.getCustomTextureIndex()>
	//   84  168:invokevirtual   #831 <Method void setCustemTextureIndex(List)>
				d();
	//   85  171:aload_0         
	//   86  172:invokevirtual   #821 <Method void d()>
			}
			setPoints(polylineoptions.getPoints());
	//   87  175:aload_0         
	//   88  176:aload_1         
	//   89  177:invokevirtual   #833 <Method List PolylineOptions.getPoints()>
	//   90  180:invokevirtual   #836 <Method void setPoints(List)>
			return;
	//   91  183:return          
		}
		// Misplaced declaration of an exception variable
		catch(PolylineOptions polylineoptions)
	//*  92  184:astore_1        
		{
			hm.c(((Throwable) (polylineoptions)), "PolylineDelegateImp", "setOptions");
	//   93  185:aload_1         
	//   94  186:ldc1            #192 <String "PolylineDelegateImp">
	//   95  188:ldc2            #837 <String "setOptions">
	//   96  191:invokestatic    #199 <Method void hm.c(Throwable, String, String)>
		}
		((RemoteException) (polylineoptions)).printStackTrace();
	//   97  194:aload_1         
	//   98  195:invokevirtual   #202 <Method void RemoteException.printStackTrace()>
	//   99  198:return          
	}

	public void setPoints(List list)
		throws RemoteException
	{
		i = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field List i>
		Object obj = r;
	//    3    5:aload_0         
	//    4    6:getfield        #110 <Field Object r>
	//    5    9:astore_2        
		obj;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		a(list);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #839 <Method void a(List)>
		obj;
	//   11   17:aload_2         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		  goto _L1
	//*  13   19:goto            27
		list;
	//   14   22:astore_1        
	//*  15   23:aload_2         
		throw list;
	//   16   24:monitorexit     
	//   17   25:aload_1         
	//   18   26:athrow          
_L1:
		x = true;
	//   19   27:aload_0         
	//   20   28:iconst_1        
	//   21   29:putfield        #122 <Field boolean x>
		e.e().setRunLowFrame(false);
	//   22   32:aload_0         
	//   23   33:getfield        #180 <Field q e>
	//   24   36:invokevirtual   #225 <Method s q.e()>
	//   25   39:iconst_0        
	//   26   40:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
		U.setPoints(list);
	//   27   45:aload_0         
	//   28   46:getfield        #656 <Field PolylineOptions U>
	//   29   49:aload_1         
	//   30   50:invokevirtual   #840 <Method void PolylineOptions.setPoints(List)>
		return;
	//   31   53:return          
		list;
	//   32   54:astore_1        
		hm.c(((Throwable) (list)), "PolylineDelegateImp", "setPoints");
	//   33   55:aload_1         
	//   34   56:ldc1            #192 <String "PolylineDelegateImp">
	//   35   58:ldc2            #841 <String "setPoints">
	//   36   61:invokestatic    #199 <Method void hm.c(Throwable, String, String)>
		g.clear();
	//   37   64:aload_0         
	//   38   65:getfield        #90  <Field List g>
	//   39   68:invokeinterface #555 <Method void List.clear()>
		((Throwable) (list)).printStackTrace();
	//   40   73:aload_1         
	//   41   74:invokevirtual   #348 <Method void Throwable.printStackTrace()>
		return;
	//   42   77:return          
	}

	public void setTransparency(float f1)
	{
		N = (float)Math.min(1.0D, Math.max(0.0D, f1));
	//    0    0:aload_0         
	//    1    1:dconst_1        
	//    2    2:dconst_0        
	//    3    3:fload_1         
	//    4    4:f2d             
	//    5    5:invokestatic    #844 <Method double Math.max(double, double)>
	//    6    8:invokestatic    #847 <Method double Math.min(double, double)>
	//    7   11:d2f             
	//    8   12:putfield        #148 <Field float N>
		e.e().setRunLowFrame(false);
	//    9   15:aload_0         
	//   10   16:getfield        #180 <Field q e>
	//   11   19:invokevirtual   #225 <Method s q.e()>
	//   12   22:iconst_0        
	//   13   23:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
	//   14   28:return          
	}

	public void setVisible(boolean flag)
		throws RemoteException
	{
		s = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #112 <Field boolean s>
		e.e().setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #180 <Field q e>
	//    5    9:invokevirtual   #225 <Method s q.e()>
	//    6   12:iconst_0        
	//    7   13:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
		if(U != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #656 <Field PolylineOptions U>
	//*  10   22:ifnull          34
			U.visible(flag);
	//   11   25:aload_0         
	//   12   26:getfield        #656 <Field PolylineOptions U>
	//   13   29:iload_1         
	//   14   30:invokevirtual   #851 <Method PolylineOptions PolylineOptions.visible(boolean)>
	//   15   33:pop             
	//   16   34:return          
	}

	public void setWidth(float f1)
		throws RemoteException
	{
		G = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #142 <Field float G>
		e.e().setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #180 <Field q e>
	//    5    9:invokevirtual   #225 <Method s q.e()>
	//    6   12:iconst_0        
	//    7   13:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
		U.width(f1);
	//    8   18:aload_0         
	//    9   19:getfield        #656 <Field PolylineOptions U>
	//   10   22:fload_1         
	//   11   23:invokevirtual   #855 <Method PolylineOptions PolylineOptions.width(float)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void setZIndex(float f1)
		throws RemoteException
	{
		H = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #144 <Field float H>
		e.d();
	//    3    5:aload_0         
	//    4    6:getfield        #180 <Field q e>
	//    5    9:invokevirtual   #856 <Method void q.d()>
		e.e().setRunLowFrame(false);
	//    6   12:aload_0         
	//    7   13:getfield        #180 <Field q e>
	//    8   16:invokevirtual   #225 <Method s q.e()>
	//    9   19:iconst_0        
	//   10   20:invokeinterface #589 <Method void s.setRunLowFrame(boolean)>
		if(U != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #656 <Field PolylineOptions U>
	//*  13   29:ifnull          41
			U.zIndex(f1);
	//   14   32:aload_0         
	//   15   33:getfield        #656 <Field PolylineOptions U>
	//   16   36:fload_1         
	//   17   37:invokevirtual   #859 <Method PolylineOptions PolylineOptions.zIndex(float)>
	//   18   40:pop             
	//   19   41:return          
	}

	private boolean A;
	private int B;
	private int C;
	private int D;
	private int E;
	private int F;
	private float G;
	private float H;
	private float I;
	private float J;
	private float K;
	private float L;
	private float M;
	private float N;
	private float O;
	private float P[];
	private int Q[];
	private int R[];
	private boolean S;
	private FPointBounds T;
	private PolylineOptions U;
	private int V;
	private com.amap.api.maps.model.PolylineOptions.LineJoinType W;
	private com.amap.api.maps.model.PolylineOptions.LineCapType X;
	Rect a;
	int b;
	ArrayList c;
	long d;
	private q e;
	private String f;
	private List g;
	private List h;
	private List i;
	private List j;
	private List k;
	private List l;
	private List m;
	private List n;
	private List o;
	private FloatBuffer p;
	private BitmapDescriptor q;
	private Object r;
	private boolean s;
	private boolean t;
	private boolean u;
	private boolean v;
	private boolean w;
	private boolean x;
	private boolean y;
	private boolean z;
}
