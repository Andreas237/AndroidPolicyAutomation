// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.*;
import android.location.*;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.util.*;

// Referenced classes of package o:
//			jb, ix, iv, iq, 
//			ig, jg, im, jn, 
//			jk, ja, jm, ki, 
//			jh, jl, ih, jo, 
//			jc, in, je, jd

public class kk
{

	private kk(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #100 <Method void Object()>
		o = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #132 <Field boolean o>
		p = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #134 <Field boolean p>
		l = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #136 <Field int l>
		n = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #138 <Field int n>
		m = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #140 <Field int m>
		r = 10000;
	//   17   29:aload_0         
	//   18   30:sipush          10000
	//   19   33:putfield        #142 <Field int r>
		q = 0L;
	//   20   36:aload_0         
	//   21   37:lconst_0        
	//   22   38:putfield        #144 <Field long q>
		C = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #146 <Field Thread C>
		A = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #148 <Field Looper A>
		j = null;
	//   29   51:aload_0         
	//   30   52:aconst_null     
	//   31   53:putfield        #150 <Field jc j>
		B = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #152 <Field Location B>
		E = null;
	//   35   61:aload_0         
	//   36   62:aconst_null     
	//   37   63:putfield        #154 <Field jd E>
		F = null;
	//   38   66:aload_0         
	//   39   67:aconst_null     
	//   40   68:putfield        #156 <Field Handler F>
		H = new jb(this);
	//   41   71:aload_0         
	//   42   72:new             #158 <Class jb>
	//   43   75:dup             
	//   44   76:aload_0         
	//   45   77:invokespecial   #161 <Method void jb(kk)>
	//   46   80:putfield        #163 <Field jb H>
		G = ((LocationListener) (new ix(this)));
	//   47   83:aload_0         
	//   48   84:new             #165 <Class ix>
	//   49   87:dup             
	//   50   88:aload_0         
	//   51   89:invokespecial   #166 <Method void ix(kk)>
	//   52   92:putfield        #168 <Field LocationListener G>
		I = ((BroadcastReceiver) (new iv(this)));
	//   53   95:aload_0         
	//   54   96:new             #170 <Class iv>
	//   55   99:dup             
	//   56  100:aload_0         
	//   57  101:invokespecial   #171 <Method void iv(kk)>
	//   58  104:putfield        #173 <Field BroadcastReceiver I>
		N = null;
	//   59  107:aload_0         
	//   60  108:aconst_null     
	//   61  109:putfield        #175 <Field GpsStatus N>
		J = 0;
	//   62  112:aload_0         
	//   63  113:iconst_0        
	//   64  114:putfield        #177 <Field int J>
		L = 0;
	//   65  117:aload_0         
	//   66  118:iconst_0        
	//   67  119:putfield        #179 <Field int L>
		M = null;
	//   68  122:aload_0         
	//   69  123:aconst_null     
	//   70  124:putfield        #181 <Field HashMap M>
		K = 0;
	//   71  127:aload_0         
	//   72  128:iconst_0        
	//   73  129:putfield        #183 <Field int K>
		O = 0;
	//   74  132:aload_0         
	//   75  133:iconst_0        
	//   76  134:putfield        #185 <Field int O>
		s = context;
	//   77  137:aload_0         
	//   78  138:aload_1         
	//   79  139:putfield        #187 <Field Context s>
		t = iq.e(context);
	//   80  142:aload_0         
	//   81  143:aload_1         
	//   82  144:invokestatic    #192 <Method iq iq.e(Context)>
	//   83  147:putfield        #194 <Field iq t>
		D = new ig();
	//   84  150:aload_0         
	//   85  151:new             #196 <Class ig>
	//   86  154:dup             
	//   87  155:invokespecial   #197 <Method void ig()>
	//   88  158:putfield        #199 <Field ig D>
		y = new jg(t);
	//   89  161:aload_0         
	//   90  162:new             #201 <Class jg>
	//   91  165:dup             
	//   92  166:aload_0         
	//   93  167:getfield        #194 <Field iq t>
	//   94  170:invokespecial   #204 <Method void jg(iq)>
	//   95  173:putfield        #206 <Field jg y>
		x = new im(context);
	//   96  176:aload_0         
	//   97  177:new             #208 <Class im>
	//   98  180:dup             
	//   99  181:aload_1         
	//  100  182:invokespecial   #210 <Method void im(Context)>
	//  101  185:putfield        #212 <Field im x>
		z = new jn(x);
	//  102  188:aload_0         
	//  103  189:new             #214 <Class jn>
	//  104  192:dup             
	//  105  193:aload_0         
	//  106  194:getfield        #212 <Field im x>
	//  107  197:invokespecial   #217 <Method void jn(im)>
	//  108  200:putfield        #219 <Field jn z>
		w = new jk(x);
	//  109  203:aload_0         
	//  110  204:new             #221 <Class jk>
	//  111  207:dup             
	//  112  208:aload_0         
	//  113  209:getfield        #212 <Field im x>
	//  114  212:invokespecial   #222 <Method void jk(im)>
	//  115  215:putfield        #224 <Field jk w>
		u = (LocationManager)s.getSystemService("location");
	//  116  218:aload_0         
	//  117  219:aload_0         
	//  118  220:getfield        #187 <Field Context s>
	//  119  223:ldc1            #226 <String "location">
	//  120  225:invokevirtual   #232 <Method Object Context.getSystemService(String)>
	//  121  228:checkcast       #234 <Class LocationManager>
	//  122  231:putfield        #236 <Field LocationManager u>
		v = ja.e(s);
	//  123  234:aload_0         
	//  124  235:aload_0         
	//  125  236:getfield        #187 <Field Context s>
	//  126  239:invokestatic    #241 <Method ja ja.e(Context)>
	//  127  242:putfield        #243 <Field ja v>
		v.b(H);
	//  128  245:aload_0         
	//  129  246:getfield        #243 <Field ja v>
	//  130  249:aload_0         
	//  131  250:getfield        #163 <Field jb H>
	//  132  253:invokevirtual   #246 <Method void ja.b(jb)>
		m();
	//  133  256:aload_0         
	//  134  257:invokespecial   #248 <Method void m()>
		List list = u.getAllProviders();
	//  135  260:aload_0         
	//  136  261:getfield        #236 <Field LocationManager u>
	//  137  264:invokevirtual   #252 <Method List LocationManager.getAllProviders()>
	//  138  267:astore_3        
		boolean flag;
		if(list != null && list.contains("gps") && list.contains("passive"))
	//* 139  268:aload_3         
	//* 140  269:ifnull          300
	//* 141  272:aload_3         
	//* 142  273:ldc1            #254 <String "gps">
	//* 143  275:invokeinterface #260 <Method boolean List.contains(Object)>
	//* 144  280:ifeq            300
	//* 145  283:aload_3         
	//* 146  284:ldc2            #262 <String "passive">
	//* 147  287:invokeinterface #260 <Method boolean List.contains(Object)>
	//* 148  292:ifeq            300
			flag = true;
	//  149  295:iconst_1        
	//  150  296:istore_2        
		else
	//* 151  297:goto            302
			flag = false;
	//  152  300:iconst_0        
	//  153  301:istore_2        
		p = flag;
	//  154  302:aload_0         
	//  155  303:iload_2         
	//  156  304:putfield        #134 <Field boolean p>
		jm.e(context);
	//  157  307:aload_1         
	//  158  308:invokestatic    #267 <Method boolean jm.e(Context)>
	//  159  311:pop             
	//  160  312:return          
	}

	static int a(kk kk1, int i1)
	{
		kk1.l = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #136 <Field int l>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static Handler a(kk kk1, Handler handler)
	{
		kk1.F = handler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field Handler F>
		return handler;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Looper a(kk kk1, Looper looper)
	{
		kk1.A = looper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field Looper A>
		return looper;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public static String a(String s1)
	{
		if(s1.equals("version"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #273 <String "version">
	//*   2    4:invokevirtual   #278 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            14
			return "COL.14.1126r";
	//    4   10:ldc2            #280 <String "COL.14.1126r">
	//    5   13:areturn         
		else
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
	}

	public static jd a(kk kk1)
	{
		return kk1.E;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field jd E>
	//    2    4:areturn         
	}

	private double[] a(List list)
	{
		if(list == null || list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #286 <Method boolean List.isEmpty()>
	//*   4   10:ifeq            15
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
		double ad[] = new double[2];
	//    7   15:iconst_2        
	//    8   16:newarray        double[]
	//    9   18:astore          7
		Iterator iterator = list.iterator();
	//   10   20:aload_1         
	//   11   21:invokeinterface #290 <Method Iterator List.iterator()>
	//   12   26:astore          8
		do
		{
			if(!iterator.hasNext())
				break;
	//   13   28:aload           8
	//   14   30:invokeinterface #295 <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            136
			GpsSatellite gpssatellite = (GpsSatellite)iterator.next();
	//   16   38:aload           8
	//   17   40:invokeinterface #299 <Method Object Iterator.next()>
	//   18   45:checkcast       #301 <Class GpsSatellite>
	//   19   48:astore          9
			if(gpssatellite != null)
	//*  20   50:aload           9
	//*  21   52:ifnull          133
			{
				double d1 = 90F - gpssatellite.getElevation();
	//   22   55:ldc2            #302 <Float 90F>
	//   23   58:aload           9
	//   24   60:invokevirtual   #306 <Method float GpsSatellite.getElevation()>
	//   25   63:fsub            
	//   26   64:f2d             
	//   27   65:dstore_2        
				double d2 = gpssatellite.getAzimuth();
	//   28   66:aload           9
	//   29   68:invokevirtual   #309 <Method float GpsSatellite.getAzimuth()>
	//   30   71:f2d             
	//   31   72:dstore          4
				double ad1[] = new double[2];
	//   32   74:iconst_2        
	//   33   75:newarray        double[]
	//   34   77:astore          9
				ad1[0] = Math.sin(Math.toRadians(d2)) * d1;
	//   35   79:aload           9
	//   36   81:iconst_0        
	//   37   82:dload           4
	//   38   84:invokestatic    #315 <Method double Math.toRadians(double)>
	//   39   87:invokestatic    #318 <Method double Math.sin(double)>
	//   40   90:dload_2         
	//   41   91:dmul            
	//   42   92:dastore         
				ad1[1] = Math.cos(Math.toRadians(d2)) * d1;
	//   43   93:aload           9
	//   44   95:iconst_1        
	//   45   96:dload           4
	//   46   98:invokestatic    #315 <Method double Math.toRadians(double)>
	//   47  101:invokestatic    #321 <Method double Math.cos(double)>
	//   48  104:dload_2         
	//   49  105:dmul            
	//   50  106:dastore         
				ad[0] = ad[0] + ad1[0];
	//   51  107:aload           7
	//   52  109:iconst_0        
	//   53  110:aload           7
	//   54  112:iconst_0        
	//   55  113:daload          
	//   56  114:aload           9
	//   57  116:iconst_0        
	//   58  117:daload          
	//   59  118:dadd            
	//   60  119:dastore         
				ad[1] = ad[1] + ad1[1];
	//   61  120:aload           7
	//   62  122:iconst_1        
	//   63  123:aload           7
	//   64  125:iconst_1        
	//   65  126:daload          
	//   66  127:aload           9
	//   67  129:iconst_1        
	//   68  130:daload          
	//   69  131:dadd            
	//   70  132:dastore         
			}
		} while(true);
	//   71  133:goto            28
		int i1 = list.size();
	//   72  136:aload_1         
	//   73  137:invokeinterface #325 <Method int List.size()>
	//   74  142:istore          6
		ad[0] = ad[0] / (double)i1;
	//   75  144:aload           7
	//   76  146:iconst_0        
	//   77  147:aload           7
	//   78  149:iconst_0        
	//   79  150:daload          
	//   80  151:iload           6
	//   81  153:i2d             
	//   82  154:ddiv            
	//   83  155:dastore         
		ad[1] = ad[1] / (double)i1;
	//   84  156:aload           7
	//   85  158:iconst_1        
	//   86  159:aload           7
	//   87  161:iconst_1        
	//   88  162:daload          
	//   89  163:iload           6
	//   90  165:i2d             
	//   91  166:ddiv            
	//   92  167:dastore         
		return ad;
	//   93  168:aload           7
	//   94  170:areturn         
	}

	static int b(kk kk1, int i1)
	{
		kk1.K = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #183 <Field int K>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static long b(kk kk1, long l1)
	{
		kk1.q = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #144 <Field long q>
		return l1;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

	static LocationManager b(kk kk1)
	{
		return kk1.u;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field LocationManager u>
	//    2    4:areturn         
	}

	static String b(kk kk1, String s1)
	{
		return s1;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	private int c(HashMap hashmap)
	{
		if(J > 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field int J>
	//*   2    4:iconst_4        
	//*   3    5:icmple          466
		{
			ArrayList arraylist = new ArrayList();
	//    4    8:new             #331 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #332 <Method void ArrayList()>
	//    7   15:astore          11
			ArrayList arraylist1 = new ArrayList();
	//    8   17:new             #331 <Class ArrayList>
	//    9   20:dup             
	//   10   21:invokespecial   #332 <Method void ArrayList()>
	//   11   24:astore          12
			int i1 = 0;
	//   12   26:iconst_0        
	//   13   27:istore          8
			int k1;
			for(hashmap = ((HashMap) (hashmap.entrySet().iterator())); ((Iterator) (hashmap)).hasNext(); i1 = k1)
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #338 <Method Set HashMap.entrySet()>
	//*  16   33:invokeinterface #341 <Method Iterator Set.iterator()>
	//*  17   38:astore_1        
	//*  18   39:aload_1         
	//*  19   40:invokeinterface #295 <Method boolean Iterator.hasNext()>
	//*  20   45:ifeq            129
			{
				List list = (List)((java.util.Map.Entry)((Iterator) (hashmap)).next()).getValue();
	//   21   48:aload_1         
	//   22   49:invokeinterface #299 <Method Object Iterator.next()>
	//   23   54:checkcast       #343 <Class java.util.Map$Entry>
	//   24   57:invokeinterface #346 <Method Object java.util.Map$Entry.getValue()>
	//   25   62:checkcast       #256 <Class List>
	//   26   65:astore          13
				k1 = i1;
	//   27   67:iload           8
	//   28   69:istore          9
				if(list == null)
					continue;
	//   29   71:aload           13
	//   30   73:ifnull          122
				double ad1[] = a(list);
	//   31   76:aload_0         
	//   32   77:aload           13
	//   33   79:invokespecial   #348 <Method double[] a(List)>
	//   34   82:astore          13
				k1 = i1;
	//   35   84:iload           8
	//   36   86:istore          9
				if(ad1 != null)
	//*  37   88:aload           13
	//*  38   90:ifnull          122
				{
					((List) (arraylist)).add(((Object) (ad1)));
	//   39   93:aload           11
	//   40   95:aload           13
	//   41   97:invokeinterface #351 <Method boolean List.add(Object)>
	//   42  102:pop             
					k1 = i1 + 1;
	//   43  103:iload           8
	//   44  105:iconst_1        
	//   45  106:iadd            
	//   46  107:istore          9
					((List) (arraylist1)).add(((Object) (Integer.valueOf(i1))));
	//   47  109:aload           12
	//   48  111:iload           8
	//   49  113:invokestatic    #357 <Method Integer Integer.valueOf(int)>
	//   50  116:invokeinterface #351 <Method boolean List.add(Object)>
	//   51  121:pop             
				}
			}

	//   52  122:iload           9
	//   53  124:istore          8
	//*  54  126:goto            39
			if(!((List) (arraylist)).isEmpty())
	//*  55  129:aload           11
	//*  56  131:invokeinterface #286 <Method boolean List.isEmpty()>
	//*  57  136:ifne            466
			{
				hashmap = ((HashMap) (new double[2]));
	//   58  139:iconst_2        
	//   59  140:newarray        double[]
	//   60  142:astore_1        
				int l1 = ((List) (arraylist)).size();
	//   61  143:aload           11
	//   62  145:invokeinterface #325 <Method int List.size()>
	//   63  150:istore          9
				for(int j1 = 0; j1 < l1; j1++)
	//*  64  152:iconst_0        
	//*  65  153:istore          8
	//*  66  155:iload           8
	//*  67  157:iload           9
	//*  68  159:icmpge          248
				{
					double ad2[] = (double[])((List) (arraylist)).get(j1);
	//   69  162:aload           11
	//   70  164:iload           8
	//   71  166:invokeinterface #361 <Method Object List.get(int)>
	//   72  171:checkcast       #363 <Class double[]>
	//   73  174:astore          13
					int i2 = ((Integer)((List) (arraylist1)).get(j1)).intValue();
	//   74  176:aload           12
	//   75  178:iload           8
	//   76  180:invokeinterface #361 <Method Object List.get(int)>
	//   77  185:checkcast       #353 <Class Integer>
	//   78  188:invokevirtual   #366 <Method int Integer.intValue()>
	//   79  191:istore          10
					ad2[0] = ad2[0] * (double)i2;
	//   80  193:aload           13
	//   81  195:iconst_0        
	//   82  196:aload           13
	//   83  198:iconst_0        
	//   84  199:daload          
	//   85  200:iload           10
	//   86  202:i2d             
	//   87  203:dmul            
	//   88  204:dastore         
					ad2[1] = ad2[1] * (double)i2;
	//   89  205:aload           13
	//   90  207:iconst_1        
	//   91  208:aload           13
	//   92  210:iconst_1        
	//   93  211:daload          
	//   94  212:iload           10
	//   95  214:i2d             
	//   96  215:dmul            
	//   97  216:dastore         
					hashmap[0] = hashmap[0] + ad2[0];
	//   98  217:aload_1         
	//   99  218:iconst_0        
	//  100  219:aload_1         
	//  101  220:iconst_0        
	//  102  221:daload          
	//  103  222:aload           13
	//  104  224:iconst_0        
	//  105  225:daload          
	//  106  226:dadd            
	//  107  227:dastore         
					hashmap[1] = hashmap[1] + ad2[1];
	//  108  228:aload_1         
	//  109  229:iconst_1        
	//  110  230:aload_1         
	//  111  231:iconst_1        
	//  112  232:daload          
	//  113  233:aload           13
	//  114  235:iconst_1        
	//  115  236:daload          
	//  116  237:dadd            
	//  117  238:dastore         
				}

	//  118  239:iload           8
	//  119  241:iconst_1        
	//  120  242:iadd            
	//  121  243:istore          8
	//* 122  245:goto            155
				hashmap[0] = hashmap[0] / (double)l1;
	//  123  248:aload_1         
	//  124  249:iconst_0        
	//  125  250:aload_1         
	//  126  251:iconst_0        
	//  127  252:daload          
	//  128  253:iload           9
	//  129  255:i2d             
	//  130  256:ddiv            
	//  131  257:dastore         
				hashmap[1] = hashmap[1] / (double)l1;
	//  132  258:aload_1         
	//  133  259:iconst_1        
	//  134  260:aload_1         
	//  135  261:iconst_1        
	//  136  262:daload          
	//  137  263:iload           9
	//  138  265:i2d             
	//  139  266:ddiv            
	//  140  267:dastore         
				double d2 = hashmap[0];
	//  141  268:aload_1         
	//  142  269:iconst_0        
	//  143  270:daload          
	//  144  271:dstore          4
				double d3 = hashmap[1];
	//  145  273:aload_1         
	//  146  274:iconst_1        
	//  147  275:daload          
	//  148  276:dstore          6
				double d1;
				if(d3 == 0.0D)
	//* 149  278:dload           6
	//* 150  280:dconst_0        
	//* 151  281:dcmpl           
	//* 152  282:ifne            318
				{
					if(d2 > 0.0D)
	//* 153  285:dload           4
	//* 154  287:dconst_0        
	//* 155  288:dcmpl           
	//* 156  289:ifle            299
						d1 = 90D;
	//  157  292:ldc2w           #367 <Double 90D>
	//  158  295:dstore_2        
					else
	//* 159  296:goto            330
					if(d2 < 0.0D)
	//* 160  299:dload           4
	//* 161  301:dconst_0        
	//* 162  302:dcmpg           
	//* 163  303:ifge            313
						d1 = 270D;
	//  164  306:ldc2w           #369 <Double 270D>
	//  165  309:dstore_2        
					else
	//* 166  310:goto            330
						d1 = 0.0D;
	//  167  313:dconst_0        
	//  168  314:dstore_2        
				} else
	//* 169  315:goto            330
				{
					d1 = Math.toDegrees(Math.atan(d2 / d3));
	//  170  318:dload           4
	//  171  320:dload           6
	//  172  322:ddiv            
	//  173  323:invokestatic    #373 <Method double Math.atan(double)>
	//  174  326:invokestatic    #376 <Method double Math.toDegrees(double)>
	//  175  329:dstore_2        
				}
				double ad[] = new double[2];
	//  176  330:iconst_2        
	//  177  331:newarray        double[]
	//  178  333:astore          11
				ad[0] = Math.sqrt(d2 * d2 + d3 * d3);
	//  179  335:aload           11
	//  180  337:iconst_0        
	//  181  338:dload           4
	//  182  340:dload           4
	//  183  342:dmul            
	//  184  343:dload           6
	//  185  345:dload           6
	//  186  347:dmul            
	//  187  348:dadd            
	//  188  349:invokestatic    #379 <Method double Math.sqrt(double)>
	//  189  352:dastore         
				ad[1] = d1;
	//  190  353:aload           11
	//  191  355:iconst_1        
	//  192  356:dload_2         
	//  193  357:dastore         
				String.format(Locale.CHINA, "%d,%d,%d,%d", new Object[] {
					Long.valueOf(Math.round(hashmap[0] * 100D)), Long.valueOf(Math.round(hashmap[1] * 100D)), Long.valueOf(Math.round(ad[0] * 100D)), Long.valueOf(Math.round(ad[1] * 100D))
				});
	//  194  358:getstatic       #385 <Field Locale Locale.CHINA>
	//  195  361:ldc2            #387 <String "%d,%d,%d,%d">
	//  196  364:iconst_4        
	//  197  365:anewarray       Object[]
	//  198  368:dup             
	//  199  369:iconst_0        
	//  200  370:aload_1         
	//  201  371:iconst_0        
	//  202  372:daload          
	//  203  373:ldc2w           #388 <Double 100D>
	//  204  376:dmul            
	//  205  377:invokestatic    #393 <Method long Math.round(double)>
	//  206  380:invokestatic    #398 <Method Long Long.valueOf(long)>
	//  207  383:aastore         
	//  208  384:dup             
	//  209  385:iconst_1        
	//  210  386:aload_1         
	//  211  387:iconst_1        
	//  212  388:daload          
	//  213  389:ldc2w           #388 <Double 100D>
	//  214  392:dmul            
	//  215  393:invokestatic    #393 <Method long Math.round(double)>
	//  216  396:invokestatic    #398 <Method Long Long.valueOf(long)>
	//  217  399:aastore         
	//  218  400:dup             
	//  219  401:iconst_2        
	//  220  402:aload           11
	//  221  404:iconst_0        
	//  222  405:daload          
	//  223  406:ldc2w           #388 <Double 100D>
	//  224  409:dmul            
	//  225  410:invokestatic    #393 <Method long Math.round(double)>
	//  226  413:invokestatic    #398 <Method Long Long.valueOf(long)>
	//  227  416:aastore         
	//  228  417:dup             
	//  229  418:iconst_3        
	//  230  419:aload           11
	//  231  421:iconst_1        
	//  232  422:daload          
	//  233  423:ldc2w           #388 <Double 100D>
	//  234  426:dmul            
	//  235  427:invokestatic    #393 <Method long Math.round(double)>
	//  236  430:invokestatic    #398 <Method Long Long.valueOf(long)>
	//  237  433:aastore         
	//  238  434:invokestatic    #402 <Method String String.format(Locale, String, Object[])>
	//  239  437:pop             
				if(ad[0] <= (double)aa)
	//* 240  438:aload           11
	//* 241  440:iconst_0        
	//* 242  441:daload          
	//* 243  442:getstatic       #126 <Field int aa>
	//* 244  445:i2d             
	//* 245  446:dcmpg           
	//* 246  447:ifgt            452
					return 1;
	//  247  450:iconst_1        
	//  248  451:ireturn         
				if(ad[0] >= (double)Y)
	//* 249  452:aload           11
	//* 250  454:iconst_0        
	//* 251  455:daload          
	//* 252  456:getstatic       #128 <Field int Y>
	//* 253  459:i2d             
	//* 254  460:dcmpl           
	//* 255  461:iflt            466
					return 4;
	//  256  464:iconst_4        
	//  257  465:ireturn         
			}
		}
		return 3;
	//  258  466:iconst_3        
	//  259  467:ireturn         
	}

	static int c(kk kk1, int i1)
	{
		kk1.O = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #185 <Field int O>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static int c(kk kk1, ki ki1, int i1)
	{
		if(kk1.K >= W)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field int K>
	//*   2    4:getstatic       #118 <Field int W>
	//*   3    7:icmplt          12
			return 1;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(kk1.K <= T)
	//*   6   12:aload_0         
	//*   7   13:getfield        #183 <Field int K>
	//*   8   16:getstatic       #116 <Field int T>
	//*   9   19:icmpgt          24
			return 4;
	//   10   22:iconst_4        
	//   11   23:ireturn         
		double d1 = ki1.e();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #408 <Method double ki.e()>
	//   14   28:dstore_3        
		if(d1 <= (double)Q)
	//*  15   29:dload_3         
	//*  16   30:getstatic       #105 <Field float Q>
	//*  17   33:f2d             
	//*  18   34:dcmpg           
	//*  19   35:ifgt            40
			return 1;
	//   20   38:iconst_1        
	//   21   39:ireturn         
		if(d1 >= (double)R)
	//*  22   40:dload_3         
	//*  23   41:getstatic       #108 <Field float R>
	//*  24   44:f2d             
	//*  25   45:dcmpl           
	//*  26   46:iflt            51
			return 4;
	//   27   49:iconst_4        
	//   28   50:ireturn         
		d1 = ki1.d();
	//   29   51:aload_1         
	//   30   52:invokevirtual   #410 <Method double ki.d()>
	//   31   55:dstore_3        
		if(d1 <= (double)P)
	//*  32   56:dload_3         
	//*  33   57:getstatic       #111 <Field float P>
	//*  34   60:f2d             
	//*  35   61:dcmpg           
	//*  36   62:ifgt            67
			return 1;
	//   37   65:iconst_1        
	//   38   66:ireturn         
		if(d1 >= (double)S)
	//*  39   67:dload_3         
	//*  40   68:getstatic       #114 <Field float S>
	//*  41   71:f2d             
	//*  42   72:dcmpl           
	//*  43   73:iflt            78
			return 4;
	//   44   76:iconst_4        
	//   45   77:ireturn         
		if(i1 >= X)
	//*  46   78:iload_2         
	//*  47   79:getstatic       #122 <Field int X>
	//*  48   82:icmplt          87
			return 1;
	//   49   85:iconst_1        
	//   50   86:ireturn         
		if(i1 <= U)
	//*  51   87:iload_2         
	//*  52   88:getstatic       #120 <Field int U>
	//*  53   91:icmpgt          96
			return 4;
	//   54   94:iconst_4        
	//   55   95:ireturn         
		if(kk1.M != null)
	//*  56   96:aload_0         
	//*  57   97:getfield        #181 <Field HashMap M>
	//*  58  100:ifnull          112
			return kk1.c(kk1.M);
	//   59  103:aload_0         
	//   60  104:aload_0         
	//   61  105:getfield        #181 <Field HashMap M>
	//   62  108:invokespecial   #412 <Method int c(HashMap)>
	//   63  111:ireturn         
		else
			return 3;
	//   64  112:iconst_3        
	//   65  113:ireturn         
	}

	static ja c(kk kk1)
	{
		return kk1.v;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field ja v>
	//    2    4:areturn         
	}

	static int d(kk kk1, int i1)
	{
		kk1.J = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #177 <Field int J>
		return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	static int d(kk kk1, HashMap hashmap)
	{
		return kk1.c(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #412 <Method int c(HashMap)>
	//    3    5:ireturn         
	}

	static GpsStatus d(kk kk1, GpsStatus gpsstatus)
	{
		kk1.N = gpsstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #175 <Field GpsStatus N>
		return gpsstatus;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Location d(kk kk1, Location location)
	{
		kk1.B = location;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field Location B>
		return location;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static jd d(kk kk1, jd jd)
	{
		kk1.E = jd;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field jd E>
		return jd;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void d(kk kk1, String s1)
	{
		jm.b("collector");
	//    0    0:ldc2            #420 <String "collector">
	//    1    3:invokestatic    #423 <Method void jm.b(String)>
	//    2    6:return          
	}

	static boolean d(kk kk1)
	{
		return kk1.o;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field boolean o>
	//    2    4:ireturn         
	}

	static int e(kk kk1, int i1)
	{
		kk1.L = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #179 <Field int L>
		return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
	}

	static HashMap e(kk kk1, HashMap hashmap)
	{
		kk1.M = hashmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #181 <Field HashMap M>
		return hashmap;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public static kk e(Context context)
	{
		if(f != null)
			break MISSING_BLOCK_LABEL_39;
	//    0    0:getstatic       #428 <Field kk f>
	//    1    3:ifnonnull       39
		Object obj = g;
	//    2    6:getstatic       #102 <Field Object g>
	//    3    9:astore_1        
		obj;
	//    4   10:aload_1         
		JVM INSTR monitorenter ;
	//    5   11:monitorenter    
		if(f == null)
	//*   6   12:getstatic       #428 <Field kk f>
	//*   7   15:ifnonnull       29
			f = new kk(context);
	//    8   18:new             #2   <Class kk>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #429 <Method void kk(Context)>
	//   12   26:putstatic       #428 <Field kk f>
		obj;
	//   13   29:aload_1         
		JVM INSTR monitorexit ;
	//   14   30:monitorexit     
		break MISSING_BLOCK_LABEL_39;
	//   15   31:goto            39
		context;
	//   16   34:astore_0        
	//*  17   35:aload_1         
		throw context;
	//   18   36:monitorexit     
	//   19   37:aload_0         
	//   20   38:athrow          
		return f;
	//   21   39:getstatic       #428 <Field kk f>
	//   22   42:areturn         
	}

	static void e(kk kk1)
	{
		kk1.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #248 <Method void m()>
	//    2    4:return          
	}

	static void e(kk kk1, Location location, int i1, long l1)
	{
		System.currentTimeMillis();
	//    0    0:invokestatic    #438 <Method long System.currentTimeMillis()>
	//    1    3:pop2            
		boolean flag2 = kk1.y.d(location);
	//    2    4:aload_0         
	//    3    5:getfield        #206 <Field jg y>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #441 <Method boolean jg.d(Location)>
	//    6   12:istore          7
		boolean flag1 = flag2;
	//    7   14:iload           7
	//    8   16:istore          6
		if(flag2)
	//*   9   18:iload           7
	//*  10   20:ifeq            41
			kk1.y.e.b = new Location(location);
	//   11   23:aload_0         
	//   12   24:getfield        #206 <Field jg y>
	//   13   27:getfield        #444 <Field jh jg.e>
	//   14   30:new             #446 <Class Location>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokespecial   #449 <Method void Location(Location)>
	//   18   38:putfield        #453 <Field Location jh.b>
		boolean flag3 = kk1.y.c(location);
	//   19   41:aload_0         
	//   20   42:getfield        #206 <Field jg y>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #455 <Method boolean jg.c(Location)>
	//   23   49:istore          8
		flag2 = flag3;
	//   24   51:iload           8
	//   25   53:istore          7
		if(flag3)
	//*  26   55:iload           8
	//*  27   57:ifeq            78
			kk1.y.d.a = new Location(location);
	//   28   60:aload_0         
	//   29   61:getfield        #206 <Field jg y>
	//   30   64:getfield        #458 <Field jl jg.d>
	//   31   67:new             #446 <Class Location>
	//   32   70:dup             
	//   33   71:aload_1         
	//   34   72:invokespecial   #449 <Method void Location(Location)>
	//   35   75:putfield        #462 <Field Location jl.a>
		boolean flag = false;
	//   36   78:iconst_0        
	//   37   79:istore          5
		if(i1 == 1)
	//*  38   81:iload_2         
	//*  39   82:iconst_1        
	//*  40   83:icmpne          100
		{
			flag1 = true;
	//   41   86:iconst_1        
	//   42   87:istore          6
			flag2 = true;
	//   43   89:iconst_1        
	//   44   90:istore          7
			location = kk1.B;
	//   45   92:aload_0         
	//   46   93:getfield        #152 <Field Location B>
	//   47   96:astore_1        
		} else
	//*  48   97:goto            116
		if(i1 == 2)
	//*  49  100:iload_2         
	//*  50  101:iconst_2        
	//*  51  102:icmpne          116
		{
			flag1 = false;
	//   52  105:iconst_0        
	//   53  106:istore          6
			flag2 = true;
	//   54  108:iconst_1        
	//   55  109:istore          7
			location = kk1.B;
	//   56  111:aload_0         
	//   57  112:getfield        #152 <Field Location B>
	//   58  115:astore_1        
		}
		if(flag1)
	//*  59  116:iload           6
	//*  60  118:ifeq            133
		{
			i1 = 1;
	//   61  121:iconst_1        
	//   62  122:istore_2        
			if(flag2)
	//*  63  123:iload           7
	//*  64  125:ifeq            143
				i1 = 3;
	//   65  128:iconst_3        
	//   66  129:istore_2        
		} else
	//*  67  130:goto            143
		{
			i1 = ((int) (flag));
	//   68  133:iload           5
	//   69  135:istore_2        
			if(flag2)
	//*  70  136:iload           7
	//*  71  138:ifeq            143
				i1 = 2;
	//   72  141:iconst_2        
	//   73  142:istore_2        
		}
		try
		{
			ig ig1 = kk1.D;
	//   74  143:aload_0         
	//   75  144:getfield        #199 <Field ig D>
	//   76  147:astore          9
			location = ((Location) (ig.e(location, kk1.t, i1, (byte)kk1.O, l1, false)));
	//   77  149:aload_1         
	//   78  150:aload_0         
	//   79  151:getfield        #194 <Field iq t>
	//   80  154:iload_2         
	//   81  155:aload_0         
	//   82  156:getfield        #185 <Field int O>
	//   83  159:int2byte        
	//   84  160:lload_3         
	//   85  161:iconst_0        
	//   86  162:invokestatic    #465 <Method ih ig.e(Location, iq, int, byte, long, boolean)>
	//   87  165:astore_1        
		}
	//*  88  166:goto            171
	//*  89  169:aconst_null     
	//*  90  170:astore_1        
	//*  91  171:aload_1         
	//*  92  172:ifnull          251
	//*  93  175:aload_0         
	//*  94  176:getfield        #194 <Field iq t>
	//*  95  179:ifnull          251
	//*  96  182:aload_0         
	//*  97  183:getfield        #194 <Field iq t>
	//*  98  186:invokevirtual   #467 <Method List iq.m()>
	//*  99  189:astore          11
	//* 100  191:lconst_0        
	//* 101  192:invokestatic    #398 <Method Long Long.valueOf(long)>
	//* 102  195:astore          10
	//* 103  197:aload           10
	//* 104  199:astore          9
	//* 105  201:aload           11
	//* 106  203:ifnull          233
	//* 107  206:aload           10
	//* 108  208:astore          9
	//* 109  210:aload           11
	//* 110  212:invokeinterface #325 <Method int List.size()>
	//* 111  217:ifle            233
	//* 112  220:aload           11
	//* 113  222:iconst_0        
	//* 114  223:invokeinterface #361 <Method Object List.get(int)>
	//* 115  228:checkcast       #395 <Class Long>
	//* 116  231:astore          9
	//* 117  233:aload_1         
	//* 118  234:invokevirtual   #472 <Method byte[] ih.e()>
	//* 119  237:astore_1        
	//* 120  238:aload_0         
	//* 121  239:getfield        #219 <Field jn z>
	//* 122  242:aload           9
	//* 123  244:invokevirtual   #475 <Method long Long.longValue()>
	//* 124  247:aload_1         
	//* 125  248:invokevirtual   #478 <Method void jn.c(long, byte[])>
	//* 126  251:aload_0         
	//* 127  252:getfield        #187 <Field Context s>
	//* 128  255:ifnull          265
	//* 129  258:aload_0         
	//* 130  259:getfield        #199 <Field ig D>
	//* 131  262:ifnonnull       266
	//* 132  265:return          
	//* 133  266:aload_0         
	//* 134  267:getfield        #187 <Field Context s>
	//* 135  270:ldc2            #480 <String "app_pref">
	//* 136  273:iconst_0        
	//* 137  274:invokevirtual   #484 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//* 138  277:astore          11
	//* 139  279:aload           11
	//* 140  281:ldc2            #486 <String "get_sensor">
	//* 141  284:ldc2            #488 <String "">
	//* 142  287:invokeinterface #494 <Method String SharedPreferences.getString(String, String)>
	//* 143  292:ldc2            #496 <String "true">
	//* 144  295:invokevirtual   #278 <Method boolean String.equals(Object)>
	//* 145  298:ifne            432
	//* 146  301:aload_0         
	//* 147  302:getfield        #199 <Field ig D>
	//* 148  305:astore_1        
	//* 149  306:aconst_null     
	//* 150  307:aload_0         
	//* 151  308:getfield        #194 <Field iq t>
	//* 152  311:iload_2         
	//* 153  312:aload_0         
	//* 154  313:getfield        #185 <Field int O>
	//* 155  316:int2byte        
	//* 156  317:lload_3         
	//* 157  318:iconst_1        
	//* 158  319:invokestatic    #465 <Method ih ig.e(Location, iq, int, byte, long, boolean)>
	//* 159  322:astore_1        
	//* 160  323:goto            328
	//* 161  326:aconst_null     
	//* 162  327:astore_1        
	//* 163  328:aload_1         
	//* 164  329:ifnull          432
	//* 165  332:aload_0         
	//* 166  333:getfield        #194 <Field iq t>
	//* 167  336:ifnull          432
	//* 168  339:aload_0         
	//* 169  340:getfield        #194 <Field iq t>
	//* 170  343:invokevirtual   #467 <Method List iq.m()>
	//* 171  346:astore          12
	//* 172  348:lconst_0        
	//* 173  349:invokestatic    #398 <Method Long Long.valueOf(long)>
	//* 174  352:astore          10
	//* 175  354:aload           10
	//* 176  356:astore          9
	//* 177  358:aload           12
	//* 178  360:ifnull          390
	//* 179  363:aload           10
	//* 180  365:astore          9
	//* 181  367:aload           12
	//* 182  369:invokeinterface #325 <Method int List.size()>
	//* 183  374:ifle            390
	//* 184  377:aload           12
	//* 185  379:iconst_0        
	//* 186  380:invokeinterface #361 <Method Object List.get(int)>
	//* 187  385:checkcast       #395 <Class Long>
	//* 188  388:astore          9
	//* 189  390:aload_1         
	//* 190  391:invokevirtual   #472 <Method byte[] ih.e()>
	//* 191  394:astore_1        
	//* 192  395:aload_0         
	//* 193  396:getfield        #219 <Field jn z>
	//* 194  399:aload           9
	//* 195  401:invokevirtual   #475 <Method long Long.longValue()>
	//* 196  404:aload_1         
	//* 197  405:invokevirtual   #478 <Method void jn.c(long, byte[])>
	//* 198  408:aload           11
	//* 199  410:invokeinterface #500 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 200  415:ldc2            #486 <String "get_sensor">
	//* 201  418:ldc2            #496 <String "true">
	//* 202  421:invokeinterface #506 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 203  426:invokeinterface #509 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//* 204  431:pop             
	//* 205  432:return          
		// Misplaced declaration of an exception variable
		catch(Location location)
		{
			location = null;
		}
		if(location != null && kk1.t != null)
		{
			List list = kk1.t.m();
			Long long3 = Long.valueOf(0L);
			Long long1 = long3;
			if(list != null)
			{
				long1 = long3;
				if(list.size() > 0)
					long1 = (Long)list.get(0);
			}
			location = ((Location) (((ih) (location)).e()));
			kk1.z.c(long1.longValue(), ((byte []) (location)));
		}
		if(kk1.s == null || kk1.D == null)
			return;
		SharedPreferences sharedpreferences = kk1.s.getSharedPreferences("app_pref", 0);
		if(!sharedpreferences.getString("get_sensor", "").equals("true"))
		{
			try
			{
				location = ((Location) (kk1.D));
				location = ((Location) (ig.e(((Location) (null)), kk1.t, i1, (byte)kk1.O, l1, true)));
			}
	//* 206  433:astore_1        
	//* 207  434:goto            169
			// Misplaced declaration of an exception variable
			catch(Location location)
			{
				location = null;
			}
			if(location != null && kk1.t != null)
			{
				List list1 = kk1.t.m();
				Long long4 = Long.valueOf(0L);
				Long long2 = long4;
				if(list1 != null)
				{
					long2 = long4;
					if(list1.size() > 0)
						long2 = (Long)list1.get(0);
				}
				location = ((Location) (((ih) (location)).e()));
				kk1.z.c(long2.longValue(), ((byte []) (location)));
				sharedpreferences.edit().putString("get_sensor", "true").commit();
			}
		}
	//* 208  437:astore_1        
	//* 209  438:goto            326
	}

	static int f()
	{
		return i;
	//    0    0:getstatic       #97  <Field int i>
	//    1    3:ireturn         
	}

	static int f(kk kk1)
	{
		int i1 = kk1.L;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field int L>
	//    2    4:istore_1        
		kk1.L = i1 + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #179 <Field int L>
		return i1;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

	static GpsStatus g(kk kk1)
	{
		return kk1.N;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field GpsStatus N>
	//    2    4:areturn         
	}

	static int h()
	{
		return e;
	//    0    0:getstatic       #91  <Field int e>
	//    1    3:ireturn         
	}

	static LocationListener h(kk kk1)
	{
		return kk1.G;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field LocationListener G>
	//    2    4:areturn         
	}

	static int i()
	{
		return a;
	//    0    0:getstatic       #89  <Field int a>
	//    1    3:ireturn         
	}

	static Location i(kk kk1)
	{
		return kk1.B;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field Location B>
	//    2    4:areturn         
	}

	static int k()
	{
		return k;
	//    0    0:getstatic       #95  <Field int k>
	//    1    3:ireturn         
	}

	static int k(kk kk1)
	{
		return kk1.r;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int r>
	//    2    4:ireturn         
	}

	static int l()
	{
		return d;
	//    0    0:getstatic       #87  <Field int d>
	//    1    3:ireturn         
	}

	static int l(kk kk1)
	{
		return kk1.l;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int l>
	//    2    4:ireturn         
	}

	static Handler m(kk kk1)
	{
		return kk1.F;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Handler F>
	//    2    4:areturn         
	}

	private void m()
	{
		n = v.a() * 1000;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #243 <Field ja v>
	//    3    5:invokevirtual   #516 <Method int ja.a()>
	//    4    8:sipush          1000
	//    5   11:imul            
	//    6   12:putfield        #138 <Field int n>
		m = v.e();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #243 <Field ja v>
	//   10   20:invokevirtual   #518 <Method int ja.e()>
	//   11   23:putfield        #140 <Field int m>
		jg jg1 = y;
	//   12   26:aload_0         
	//   13   27:getfield        #206 <Field jg y>
	//   14   30:astore_2        
		int i1 = n;
	//   15   31:aload_0         
	//   16   32:getfield        #138 <Field int n>
	//   17   35:istore_1        
		i1 = m;
	//   18   36:aload_0         
	//   19   37:getfield        #140 <Field int m>
	//   20   40:istore_1        
		jg.e();
	//   21   41:invokestatic    #520 <Method void jg.e()>
	//   22   44:return          
	}

	static int n()
	{
		return h;
	//    0    0:getstatic       #93  <Field int h>
	//    1    3:ireturn         
	}

	static int n(kk kk1)
	{
		return kk1.L;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field int L>
	//    2    4:ireturn         
	}

	static int o()
	{
		return V;
	//    0    0:getstatic       #124 <Field int V>
	//    1    3:ireturn         
	}

	static HashMap o(kk kk1)
	{
		return kk1.M;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field HashMap M>
	//    2    4:areturn         
	}

	static iq p(kk kk1)
	{
		return kk1.t;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field iq t>
	//    2    4:areturn         
	}

	static int s(kk kk1)
	{
		return kk1.O;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int O>
	//    2    4:ireturn         
	}

	public boolean a()
	{
		if(t != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field iq t>
	//*   2    4:ifnull          49
		{
			List list = t.m();
	//    3    7:aload_0         
	//    4    8:getfield        #194 <Field iq t>
	//    5   11:invokevirtual   #467 <Method List iq.m()>
	//    6   14:astore_1        
			if(list != null && list.size() > 0)
	//*   7   15:aload_1         
	//*   8   16:ifnull          49
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #325 <Method int List.size()>
	//*  11   25:ifle            49
				return x.b(((Long)list.get(0)).longValue());
	//   12   28:aload_0         
	//   13   29:getfield        #212 <Field im x>
	//   14   32:aload_1         
	//   15   33:iconst_0        
	//   16   34:invokeinterface #361 <Method Object List.get(int)>
	//   17   39:checkcast       #395 <Class Long>
	//   18   42:invokevirtual   #475 <Method long Long.longValue()>
	//   19   45:invokevirtual   #525 <Method boolean im.b(long)>
	//   20   48:ireturn         
		}
		return false;
	//   21   49:iconst_0        
	//   22   50:ireturn         
	}

	public void b()
	{
		jo.a = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #529 <Field boolean jo.a>
		if(!p || t == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #134 <Field boolean p>
	//*   4    8:ifeq            18
	//*   5   11:aload_0         
	//*   6   12:getfield        #194 <Field iq t>
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		if(!c)
	//*   9   19:getstatic       #83  <Field boolean c>
	//*  10   22:ifne            26
			return;
	//   11   25:return          
		if(I != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #173 <Field BroadcastReceiver I>
	//*  14   30:ifnull          44
			try
			{
				s.unregisterReceiver(I);
	//   15   33:aload_0         
	//   16   34:getfield        #187 <Field Context s>
	//   17   37:aload_0         
	//   18   38:getfield        #173 <Field BroadcastReceiver I>
	//   19   41:invokevirtual   #533 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			}
	//*  20   44:aload_0         
	//*  21   45:getfield        #194 <Field iq t>
	//*  22   48:ifnull          58
	//*  23   51:aload_0         
	//*  24   52:getfield        #194 <Field iq t>
	//*  25   55:invokevirtual   #535 <Method void iq.z()>
	//*  26   58:aload_0         
	//*  27   59:getfield        #236 <Field LocationManager u>
	//*  28   62:aload_0         
	//*  29   63:getfield        #154 <Field jd E>
	//*  30   66:invokevirtual   #539 <Method void LocationManager.removeGpsStatusListener(android.location.GpsStatus$Listener)>
	//*  31   69:aload_0         
	//*  32   70:getfield        #236 <Field LocationManager u>
	//*  33   73:aload_0         
	//*  34   74:getfield        #154 <Field jd E>
	//*  35   77:invokevirtual   #543 <Method void LocationManager.removeNmeaListener(android.location.GpsStatus$NmeaListener)>
	//*  36   80:aload_0         
	//*  37   81:aconst_null     
	//*  38   82:putfield        #154 <Field jd E>
	//*  39   85:aload_0         
	//*  40   86:getfield        #236 <Field LocationManager u>
	//*  41   89:aload_0         
	//*  42   90:getfield        #168 <Field LocationListener G>
	//*  43   93:invokevirtual   #547 <Method void LocationManager.removeUpdates(LocationListener)>
	//*  44   96:aload_0         
	//*  45   97:getfield        #148 <Field Looper A>
	//*  46  100:ifnull          115
	//*  47  103:aload_0         
	//*  48  104:getfield        #148 <Field Looper A>
	//*  49  107:invokevirtual   #552 <Method void Looper.quit()>
	//*  50  110:aload_0         
	//*  51  111:aconst_null     
	//*  52  112:putfield        #148 <Field Looper A>
	//*  53  115:aload_0         
	//*  54  116:getfield        #146 <Field Thread C>
	//*  55  119:ifnull          134
	//*  56  122:aload_0         
	//*  57  123:getfield        #146 <Field Thread C>
	//*  58  126:invokevirtual   #557 <Method void Thread.interrupt()>
	//*  59  129:aload_0         
	//*  60  130:aconst_null     
	//*  61  131:putfield        #146 <Field Thread C>
	//*  62  134:aload_0         
	//*  63  135:getfield        #150 <Field jc j>
	//*  64  138:ifnull          158
	//*  65  141:aload_0         
	//*  66  142:iconst_0        
	//*  67  143:putfield        #132 <Field boolean o>
	//*  68  146:aload_0         
	//*  69  147:getfield        #150 <Field jc j>
	//*  70  150:invokevirtual   #560 <Method void jc.interrupt()>
	//*  71  153:aload_0         
	//*  72  154:aconst_null     
	//*  73  155:putfield        #150 <Field jc j>
	//*  74  158:aload_0         
	//*  75  159:getfield        #194 <Field iq t>
	//*  76  162:invokevirtual   #561 <Method void iq.e()>
	//*  77  165:iconst_0        
	//*  78  166:putstatic       #83  <Field boolean c>
	//*  79  169:return          
			catch(Exception exception) { }
	//   80  170:astore_1        
		if(t != null)
			t.z();
		u.removeGpsStatusListener(((android.location.GpsStatus.Listener) (E)));
		u.removeNmeaListener(((android.location.GpsStatus.NmeaListener) (E)));
		E = null;
		u.removeUpdates(G);
		if(A != null)
		{
			A.quit();
			A = null;
		}
		if(C != null)
		{
			C.interrupt();
			C = null;
		}
		if(j != null)
		{
			o = false;
			j.interrupt();
			j = null;
		}
		t.e();
		c = false;
	//*  81  171:goto            44
	}

	public void b(in in1, String s1)
	{
		boolean flag = v.d(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field ja v>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #565 <Method boolean ja.d(String)>
	//    4    8:istore_3        
		if(in1 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          116
		{
			s1 = ((String) (in1.c()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #569 <Method byte[] in.c()>
	//    9   17:astore_2        
			if(flag && s1 != null)
	//*  10   18:iload_3         
	//*  11   19:ifeq            103
	//*  12   22:aload_2         
	//*  13   23:ifnull          103
			{
				NetworkInfo networkinfo = ((ConnectivityManager)s.getSystemService("connectivity")).getActiveNetworkInfo();
	//   14   26:aload_0         
	//   15   27:getfield        #187 <Field Context s>
	//   16   30:ldc2            #571 <String "connectivity">
	//   17   33:invokevirtual   #232 <Method Object Context.getSystemService(String)>
	//   18   36:checkcast       #573 <Class ConnectivityManager>
	//   19   39:invokevirtual   #577 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   20   42:astore          4
				if(networkinfo != null && networkinfo.isConnected())
	//*  21   44:aload           4
	//*  22   46:ifnull          103
	//*  23   49:aload           4
	//*  24   51:invokevirtual   #582 <Method boolean NetworkInfo.isConnected()>
	//*  25   54:ifeq            103
					if(networkinfo.getType() == 1)
	//*  26   57:aload           4
	//*  27   59:invokevirtual   #585 <Method int NetworkInfo.getType()>
	//*  28   62:iconst_1        
	//*  29   63:icmpne          86
						v.d(v.d() + s1.length);
	//   30   66:aload_0         
	//   31   67:getfield        #243 <Field ja v>
	//   32   70:aload_0         
	//   33   71:getfield        #243 <Field ja v>
	//   34   74:invokevirtual   #587 <Method int ja.d()>
	//   35   77:aload_2         
	//   36   78:arraylength     
	//   37   79:iadd            
	//   38   80:invokevirtual   #590 <Method void ja.d(int)>
					else
	//*  39   83:goto            103
						v.a(v.i() + s1.length);
	//   40   86:aload_0         
	//   41   87:getfield        #243 <Field ja v>
	//   42   90:aload_0         
	//   43   91:getfield        #243 <Field ja v>
	//   44   94:invokevirtual   #592 <Method int ja.i()>
	//   45   97:aload_2         
	//   46   98:arraylength     
	//   47   99:iadd            
	//   48  100:invokevirtual   #594 <Method void ja.a(int)>
			}
			in1.b(flag);
	//   49  103:aload_1         
	//   50  104:iload_3         
	//   51  105:invokevirtual   #597 <Method void in.b(boolean)>
			w.e(in1);
	//   52  108:aload_0         
	//   53  109:getfield        #224 <Field jk w>
	//   54  112:aload_1         
	//   55  113:invokevirtual   #600 <Method void jk.e(in)>
		}
	//   56  116:return          
	}

	public void c()
	{
		jo.a = true;
	//    0    0:iconst_1        
	//    1    1:putstatic       #529 <Field boolean jo.a>
		if(!p || t == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #134 <Field boolean p>
	//*   4    8:ifeq            18
	//*   5   11:aload_0         
	//*   6   12:getfield        #194 <Field iq t>
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		if(c)
	//*   9   19:getstatic       #83  <Field boolean c>
	//*  10   22:ifeq            26
			return;
	//   11   25:return          
		IntentFilter intentfilter = new IntentFilter("android.location.GPS_ENABLED_CHANGE");
	//   12   26:new             #602 <Class IntentFilter>
	//   13   29:dup             
	//   14   30:ldc2            #604 <String "android.location.GPS_ENABLED_CHANGE">
	//   15   33:invokespecial   #606 <Method void IntentFilter(String)>
	//   16   36:astore_1        
		intentfilter.addAction("android.location.GPS_FIX_CHANGE");
	//   17   37:aload_1         
	//   18   38:ldc2            #608 <String "android.location.GPS_FIX_CHANGE">
	//   19   41:invokevirtual   #611 <Method void IntentFilter.addAction(String)>
		b = true;
	//   20   44:iconst_1        
	//   21   45:putstatic       #85  <Field boolean b>
		s.registerReceiver(I, intentfilter);
	//   22   48:aload_0         
	//   23   49:getfield        #187 <Field Context s>
	//   24   52:aload_0         
	//   25   53:getfield        #173 <Field BroadcastReceiver I>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #615 <Method android.content.Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   28   60:pop             
		u.removeUpdates(G);
	//   29   61:aload_0         
	//   30   62:getfield        #236 <Field LocationManager u>
	//   31   65:aload_0         
	//   32   66:getfield        #168 <Field LocationListener G>
	//   33   69:invokevirtual   #547 <Method void LocationManager.removeUpdates(LocationListener)>
		if(A != null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #148 <Field Looper A>
	//*  36   76:ifnull          91
		{
			A.quit();
	//   37   79:aload_0         
	//   38   80:getfield        #148 <Field Looper A>
	//   39   83:invokevirtual   #552 <Method void Looper.quit()>
			A = null;
	//   40   86:aload_0         
	//   41   87:aconst_null     
	//   42   88:putfield        #148 <Field Looper A>
		}
		if(C != null)
	//*  43   91:aload_0         
	//*  44   92:getfield        #146 <Field Thread C>
	//*  45   95:ifnull          110
		{
			C.interrupt();
	//   46   98:aload_0         
	//   47   99:getfield        #146 <Field Thread C>
	//   48  102:invokevirtual   #557 <Method void Thread.interrupt()>
			C = null;
	//   49  105:aload_0         
	//   50  106:aconst_null     
	//   51  107:putfield        #146 <Field Thread C>
		}
		C = ((Thread) (new je(this, "")));
	//   52  110:aload_0         
	//   53  111:new             #617 <Class je>
	//   54  114:dup             
	//   55  115:aload_0         
	//   56  116:ldc2            #488 <String "">
	//   57  119:invokespecial   #619 <Method void je(kk, String)>
	//   58  122:putfield        #146 <Field Thread C>
		C.start();
	//   59  125:aload_0         
	//   60  126:getfield        #146 <Field Thread C>
	//   61  129:invokevirtual   #622 <Method void Thread.start()>
		t.b();
	//   62  132:aload_0         
	//   63  133:getfield        #194 <Field iq t>
	//   64  136:invokevirtual   #624 <Method void iq.b()>
		c = true;
	//   65  139:iconst_1        
	//   66  140:putstatic       #83  <Field boolean c>
	//   67  143:return          
	}

	public void c(int i1)
	{
		if(i1 != 256 && i1 != 8736 && i1 != 768)
	//*   0    0:iload_1         
	//*   1    1:sipush          256
	//*   2    4:icmpeq          32
	//*   3    7:iload_1         
	//*   4    8:sipush          8736
	//*   5   11:icmpeq          32
	//*   6   14:iload_1         
	//*   7   15:sipush          768
	//*   8   18:icmpeq          32
		{
			throw new RuntimeException("invalid Size! must be COLLECTOR_SMALL_SIZE or COLLECTOR_BIG_SIZE or COLLECTOR_MEDIUM_SIZE");
	//    9   21:new             #626 <Class RuntimeException>
	//   10   24:dup             
	//   11   25:ldc2            #628 <String "invalid Size! must be COLLECTOR_SMALL_SIZE or COLLECTOR_BIG_SIZE or COLLECTOR_MEDIUM_SIZE">
	//   12   28:invokespecial   #629 <Method void RuntimeException(String)>
	//   13   31:athrow          
		} else
		{
			x.b(i1);
	//   14   32:aload_0         
	//   15   33:getfield        #212 <Field im x>
	//   16   36:iload_1         
	//   17   37:invokevirtual   #631 <Method void im.b(int)>
			return;
	//   18   40:return          
		}
	}

	public in d()
	{
		if(w == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field jk w>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		a();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #634 <Method boolean a()>
	//    7   13:pop             
		if(!v.c())
	//*   8   14:aload_0         
	//*   9   15:getfield        #243 <Field ja v>
	//*  10   18:invokevirtual   #636 <Method boolean ja.c()>
	//*  11   21:ifne            26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		else
			return w.e(v.b());
	//   14   26:aload_0         
	//   15   27:getfield        #224 <Field jk w>
	//   16   30:aload_0         
	//   17   31:getfield        #243 <Field ja v>
	//   18   34:invokevirtual   #638 <Method int ja.b()>
	//   19   37:invokevirtual   #641 <Method in jk.e(int)>
	//   20   40:areturn         
	}

	public void e()
	{
		if(!p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field boolean p>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			b();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #642 <Method void b()>
			return;
	//    6   12:return          
		}
	}

	public int g()
	{
		if(w != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field jk w>
	//*   2    4:ifnull          15
			return w.d();
	//    3    7:aload_0         
	//    4    8:getfield        #224 <Field jk w>
	//    5   11:invokevirtual   #643 <Method int jk.d()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private static float P = 2.3F;
	private static float Q = 1.1F;
	private static float R = 2.2F;
	private static float S = 3.8F;
	private static int T = 3;
	private static int U = 2;
	private static int V = 20;
	private static int W = 10;
	private static int X = 7;
	private static int Y = 120;
	private static int a = 2;
	private static int aa = 70;
	protected static boolean b = true;
	protected static boolean c = false;
	private static int d = 10;
	private static int e = 10;
	private static kk f;
	private static Object g = new Object();
	private static int h = 10;
	private static int i = 200;
	private static int k = 50;
	private Looper A;
	private Location B;
	private Thread C;
	private ig D;
	private jd E;
	private Handler F;
	private LocationListener G;
	private jb H;
	private BroadcastReceiver I;
	private int J;
	private int K;
	private int L;
	private HashMap M;
	private GpsStatus N;
	private int O;
	private jc j;
	private int l;
	private int m;
	private int n;
	private boolean o;
	private boolean p;
	private long q;
	private int r;
	private Context s;
	private iq t;
	private LocationManager u;
	private ja v;
	private jk w;
	private im x;
	private jg y;
	private jn z;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #83  <Field boolean c>
	//    2    4:iconst_1        
	//    3    5:putstatic       #85  <Field boolean b>
	//    4    8:bipush          10
	//    5   10:putstatic       #87  <Field int d>
	//    6   13:iconst_2        
	//    7   14:putstatic       #89  <Field int a>
	//    8   17:bipush          10
	//    9   19:putstatic       #91  <Field int e>
	//   10   22:bipush          10
	//   11   24:putstatic       #93  <Field int h>
	//   12   27:bipush          50
	//   13   29:putstatic       #95  <Field int k>
	//   14   32:sipush          200
	//   15   35:putstatic       #97  <Field int i>
	//   16   38:new             #4   <Class Object>
	//   17   41:dup             
	//   18   42:invokespecial   #100 <Method void Object()>
	//   19   45:putstatic       #102 <Field Object g>
	//   20   48:ldc1            #103 <Float 1.1F>
	//   21   50:putstatic       #105 <Field float Q>
	//   22   53:ldc1            #106 <Float 2.2F>
	//   23   55:putstatic       #108 <Field float R>
	//   24   58:ldc1            #109 <Float 2.3F>
	//   25   60:putstatic       #111 <Field float P>
	//   26   63:ldc1            #112 <Float 3.8F>
	//   27   65:putstatic       #114 <Field float S>
	//   28   68:iconst_3        
	//   29   69:putstatic       #116 <Field int T>
	//   30   72:bipush          10
	//   31   74:putstatic       #118 <Field int W>
	//   32   77:iconst_2        
	//   33   78:putstatic       #120 <Field int U>
	//   34   81:bipush          7
	//   35   83:putstatic       #122 <Field int X>
	//   36   86:bipush          20
	//   37   88:putstatic       #124 <Field int V>
	//   38   91:bipush          70
	//   39   93:putstatic       #126 <Field int aa>
	//   40   96:bipush          120
	//   41   98:putstatic       #128 <Field int Y>
	//*  42  101:return          
	}
}
