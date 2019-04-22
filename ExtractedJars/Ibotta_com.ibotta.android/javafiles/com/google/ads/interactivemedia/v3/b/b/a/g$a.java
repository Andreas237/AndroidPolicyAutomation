// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.b.e;
import com.google.ads.interactivemedia.v3.b.b.h;
import com.google.ads.interactivemedia.v3.b.b.j;
import com.google.ads.interactivemedia.v3.b.d.a;
import com.google.ads.interactivemedia.v3.b.d.b;
import com.google.ads.interactivemedia.v3.b.d.c;
import com.google.ads.interactivemedia.v3.b.f;
import com.google.ads.interactivemedia.v3.b.l;
import com.google.ads.interactivemedia.v3.b.q;
import com.google.ads.interactivemedia.v3.b.t;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			g, l

private final class g$a extends w
{

	private String a(l l1)
	{
		if(l1.i())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #45  <Method boolean l.i()>
	//*   2    4:ifeq            62
		{
			l1 = ((l) (l1.m()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #49  <Method q l.m()>
	//    5   11:astore_1        
			if(((q) (l1)).p())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #54  <Method boolean q.p()>
	//*   8   16:ifeq            27
				return String.valueOf(((Object) (((q) (l1)).a())));
	//    9   19:aload_1         
	//   10   20:invokevirtual   #57  <Method Number q.a()>
	//   11   23:invokestatic    #63  <Method String String.valueOf(Object)>
	//   12   26:areturn         
			if(((q) (l1)).o())
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #66  <Method boolean q.o()>
	//*  15   31:ifeq            42
				return Boolean.toString(((q) (l1)).f());
	//   16   34:aload_1         
	//   17   35:invokevirtual   #69  <Method boolean q.f()>
	//   18   38:invokestatic    #75  <Method String Boolean.toString(boolean)>
	//   19   41:areturn         
			if(((q) (l1)).q())
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #78  <Method boolean q.q()>
	//*  22   46:ifeq            54
				return ((q) (l1)).b();
	//   23   49:aload_1         
	//   24   50:invokevirtual   #81  <Method String q.b()>
	//   25   53:areturn         
			else
				throw new AssertionError();
	//   26   54:new             #83  <Class AssertionError>
	//   27   57:dup             
	//   28   58:invokespecial   #84  <Method void AssertionError()>
	//   29   61:athrow          
		}
		if(l1.j())
	//*  30   62:aload_1         
	//*  31   63:invokevirtual   #87  <Method boolean l.j()>
	//*  32   66:ifeq            72
			return "null";
	//   33   69:ldc1            #89  <String "null">
	//   34   71:areturn         
		else
			throw new AssertionError();
	//   35   72:new             #83  <Class AssertionError>
	//   36   75:dup             
	//   37   76:invokespecial   #84  <Method void AssertionError()>
	//   38   79:athrow          
	}

	public Map a(a a1)
		throws IOException
	{
		b b1 = a1.f();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #97  <Method b a.f()>
	//    2    4:astore_3        
		if(b1 == b.i)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #102 <Field b b.i>
	//*   5    9:if_acmpne       18
		{
			a1.j();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #104 <Method void a.j()>
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		}
		Object obj = ((Object) ((Map)d.a()));
	//   10   18:aload_0         
	//   11   19:getfield        #35  <Field h d>
	//   12   22:invokeinterface #109 <Method Object h.a()>
	//   13   27:checkcast       #111 <Class Map>
	//   14   30:astore_2        
		if(b1 == b.a)
	//*  15   31:aload_3         
	//*  16   32:getstatic       #113 <Field b b.a>
	//*  17   35:if_acmpne       141
		{
			a1.a();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #115 <Method void a.a()>
			while(a1.e()) 
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #118 <Method boolean a.e()>
	//*  22   46:ifeq            135
			{
				a1.a();
	//   23   49:aload_1         
	//   24   50:invokevirtual   #115 <Method void a.a()>
				Object obj1 = b.read(a1);
	//   25   53:aload_0         
	//   26   54:getfield        #31  <Field w b>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #122 <Method Object w.read(a)>
	//   29   61:astore_3        
				if(((Map) (obj)).put(obj1, c.read(a1)) == null)
	//*  30   62:aload_2         
	//*  31   63:aload_3         
	//*  32   64:aload_0         
	//*  33   65:getfield        #33  <Field w c>
	//*  34   68:aload_1         
	//*  35   69:invokevirtual   #122 <Method Object w.read(a)>
	//*  36   72:invokeinterface #126 <Method Object Map.put(Object, Object)>
	//*  37   77:ifnonnull       87
				{
					a1.b();
	//   38   80:aload_1         
	//   39   81:invokevirtual   #128 <Method void a.b()>
				} else
	//*  40   84:goto            42
				{
					a1 = ((a) (String.valueOf(obj1)));
	//   41   87:aload_3         
	//   42   88:invokestatic    #63  <Method String String.valueOf(Object)>
	//   43   91:astore_1        
					obj = ((Object) (new StringBuilder(String.valueOf(((Object) (a1))).length() + 15)));
	//   44   92:new             #130 <Class StringBuilder>
	//   45   95:dup             
	//   46   96:aload_1         
	//   47   97:invokestatic    #63  <Method String String.valueOf(Object)>
	//   48  100:invokevirtual   #134 <Method int String.length()>
	//   49  103:bipush          15
	//   50  105:iadd            
	//   51  106:invokespecial   #137 <Method void StringBuilder(int)>
	//   52  109:astore_2        
					((StringBuilder) (obj)).append("duplicate key: ");
	//   53  110:aload_2         
	//   54  111:ldc1            #139 <String "duplicate key: ">
	//   55  113:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   56  116:pop             
					((StringBuilder) (obj)).append(((String) (a1)));
	//   57  117:aload_2         
	//   58  118:aload_1         
	//   59  119:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   60  122:pop             
					throw new t(((StringBuilder) (obj)).toString());
	//   61  123:new             #145 <Class t>
	//   62  126:dup             
	//   63  127:aload_2         
	//   64  128:invokevirtual   #147 <Method String StringBuilder.toString()>
	//   65  131:invokespecial   #150 <Method void t(String)>
	//   66  134:athrow          
				}
			}
			a1.b();
	//   67  135:aload_1         
	//   68  136:invokevirtual   #128 <Method void a.b()>
			return ((Map) (obj));
	//   69  139:aload_2         
	//   70  140:areturn         
		}
		a1.c();
	//   71  141:aload_1         
	//   72  142:invokevirtual   #152 <Method void a.c()>
		while(a1.e()) 
	//*  73  145:aload_1         
	//*  74  146:invokevirtual   #118 <Method boolean a.e()>
	//*  75  149:ifeq            237
		{
			e.a.a(a1);
	//   76  152:getstatic       #157 <Field e e.a>
	//   77  155:aload_1         
	//   78  156:invokevirtual   #160 <Method void e.a(a)>
			Object obj2 = b.read(a1);
	//   79  159:aload_0         
	//   80  160:getfield        #31  <Field w b>
	//   81  163:aload_1         
	//   82  164:invokevirtual   #122 <Method Object w.read(a)>
	//   83  167:astore_3        
			if(((Map) (obj)).put(obj2, c.read(a1)) != null)
	//*  84  168:aload_2         
	//*  85  169:aload_3         
	//*  86  170:aload_0         
	//*  87  171:getfield        #33  <Field w c>
	//*  88  174:aload_1         
	//*  89  175:invokevirtual   #122 <Method Object w.read(a)>
	//*  90  178:invokeinterface #126 <Method Object Map.put(Object, Object)>
	//*  91  183:ifnonnull       189
	//*  92  186:goto            145
			{
				a1 = ((a) (String.valueOf(obj2)));
	//   93  189:aload_3         
	//   94  190:invokestatic    #63  <Method String String.valueOf(Object)>
	//   95  193:astore_1        
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (a1))).length() + 15)));
	//   96  194:new             #130 <Class StringBuilder>
	//   97  197:dup             
	//   98  198:aload_1         
	//   99  199:invokestatic    #63  <Method String String.valueOf(Object)>
	//  100  202:invokevirtual   #134 <Method int String.length()>
	//  101  205:bipush          15
	//  102  207:iadd            
	//  103  208:invokespecial   #137 <Method void StringBuilder(int)>
	//  104  211:astore_2        
				((StringBuilder) (obj)).append("duplicate key: ");
	//  105  212:aload_2         
	//  106  213:ldc1            #139 <String "duplicate key: ">
	//  107  215:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  108  218:pop             
				((StringBuilder) (obj)).append(((String) (a1)));
	//  109  219:aload_2         
	//  110  220:aload_1         
	//  111  221:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  112  224:pop             
				throw new t(((StringBuilder) (obj)).toString());
	//  113  225:new             #145 <Class t>
	//  114  228:dup             
	//  115  229:aload_2         
	//  116  230:invokevirtual   #147 <Method String StringBuilder.toString()>
	//  117  233:invokespecial   #150 <Method void t(String)>
	//  118  236:athrow          
			}
		}
		a1.d();
	//  119  237:aload_1         
	//  120  238:invokevirtual   #162 <Method void a.d()>
		return ((Map) (obj));
	//  121  241:aload_2         
	//  122  242:areturn         
	}

	public void a(c c1, Map map)
		throws IOException
	{
		if(map == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			c1.f();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #170 <Method c c.f()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		if(!com.google.ads.interactivemedia.v3.b.b.a.g.a(a))
	//*   6   10:aload_0         
	//*   7   11:getfield        #21  <Field g a>
	//*   8   14:invokestatic    #173 <Method boolean com.google.ads.interactivemedia.v3.b.b.a.g.a(g)>
	//*   9   17:ifne            96
		{
			c1.d();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #175 <Method c c.d()>
	//   12   24:pop             
			java.util.Entry entry;
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); c.write(c1, entry.getValue()))
	//*  13   25:aload_2         
	//*  14   26:invokeinterface #179 <Method Set Map.entrySet()>
	//*  15   31:invokeinterface #185 <Method Iterator Set.iterator()>
	//*  16   36:astore_2        
	//*  17   37:aload_2         
	//*  18   38:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            90
			{
				entry = (java.util.Entry)((Iterator) (map)).next();
	//   20   46:aload_2         
	//   21   47:invokeinterface #193 <Method Object Iterator.next()>
	//   22   52:checkcast       #195 <Class java.util.Map$Entry>
	//   23   55:astore          7
				c1.a(String.valueOf(entry.getKey()));
	//   24   57:aload_1         
	//   25   58:aload           7
	//   26   60:invokeinterface #198 <Method Object java.util.Map$Entry.getKey()>
	//   27   65:invokestatic    #63  <Method String String.valueOf(Object)>
	//   28   68:invokevirtual   #201 <Method c c.a(String)>
	//   29   71:pop             
			}

	//   30   72:aload_0         
	//   31   73:getfield        #33  <Field w c>
	//   32   76:aload_1         
	//   33   77:aload           7
	//   34   79:invokeinterface #204 <Method Object java.util.Map$Entry.getValue()>
	//   35   84:invokevirtual   #208 <Method void w.write(c, Object)>
	//*  36   87:goto            37
			c1.e();
	//   37   90:aload_1         
	//   38   91:invokevirtual   #210 <Method c c.e()>
	//   39   94:pop             
			return;
	//   40   95:return          
		}
		ArrayList arraylist = new ArrayList(map.size());
	//   41   96:new             #212 <Class ArrayList>
	//   42   99:dup             
	//   43  100:aload_2         
	//   44  101:invokeinterface #215 <Method int Map.size()>
	//   45  106:invokespecial   #216 <Method void ArrayList(int)>
	//   46  109:astore          7
		ArrayList arraylist1 = new ArrayList(map.size());
	//   47  111:new             #212 <Class ArrayList>
	//   48  114:dup             
	//   49  115:aload_2         
	//   50  116:invokeinterface #215 <Method int Map.size()>
	//   51  121:invokespecial   #216 <Method void ArrayList(int)>
	//   52  124:astore          8
		map = ((Map) (map.entrySet().iterator()));
	//   53  126:aload_2         
	//   54  127:invokeinterface #179 <Method Set Map.entrySet()>
	//   55  132:invokeinterface #185 <Method Iterator Set.iterator()>
	//   56  137:astore_2        
		boolean flag3 = false;
	//   57  138:iconst_0        
	//   58  139:istore          6
		boolean flag2 = false;
	//   59  141:iconst_0        
	//   60  142:istore          5
		boolean flag;
		boolean flag1;
		for(flag = false; ((Iterator) (map)).hasNext(); flag |= flag1)
	//*  61  144:iconst_0        
	//*  62  145:istore_3        
	//*  63  146:aload_2         
	//*  64  147:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*  65  152:ifeq            243
		{
			java.util.Entry entry1 = (java.util.Entry)((Iterator) (map)).next();
	//   66  155:aload_2         
	//   67  156:invokeinterface #193 <Method Object Iterator.next()>
	//   68  161:checkcast       #195 <Class java.util.Map$Entry>
	//   69  164:astore          9
			l l1 = b.toJsonTree(entry1.getKey());
	//   70  166:aload_0         
	//   71  167:getfield        #31  <Field w b>
	//   72  170:aload           9
	//   73  172:invokeinterface #198 <Method Object java.util.Map$Entry.getKey()>
	//   74  177:invokevirtual   #220 <Method l w.toJsonTree(Object)>
	//   75  180:astore          10
			((List) (arraylist)).add(((Object) (l1)));
	//   76  182:aload           7
	//   77  184:aload           10
	//   78  186:invokeinterface #226 <Method boolean List.add(Object)>
	//   79  191:pop             
			((List) (arraylist1)).add(entry1.getValue());
	//   80  192:aload           8
	//   81  194:aload           9
	//   82  196:invokeinterface #204 <Method Object java.util.Map$Entry.getValue()>
	//   83  201:invokeinterface #226 <Method boolean List.add(Object)>
	//   84  206:pop             
			if(!l1.g() && !l1.h())
	//*  85  207:aload           10
	//*  86  209:invokevirtual   #229 <Method boolean l.g()>
	//*  87  212:ifne            232
	//*  88  215:aload           10
	//*  89  217:invokevirtual   #232 <Method boolean l.h()>
	//*  90  220:ifeq            226
	//*  91  223:goto            232
				flag1 = false;
	//   92  226:iconst_0        
	//   93  227:istore          4
			else
	//*  94  229:goto            235
				flag1 = true;
	//   95  232:iconst_1        
	//   96  233:istore          4
		}

	//   97  235:iload_3         
	//   98  236:iload           4
	//   99  238:ior             
	//  100  239:istore_3        
	//* 101  240:goto            146
		if(flag)
	//* 102  243:iload_3         
	//* 103  244:ifeq            320
		{
			c1.b();
	//  104  247:aload_1         
	//  105  248:invokevirtual   #234 <Method c c.b()>
	//  106  251:pop             
			for(int i = ((int) (flag2)); i < ((List) (arraylist)).size(); i++)
	//* 107  252:iload           5
	//* 108  254:istore_3        
	//* 109  255:iload_3         
	//* 110  256:aload           7
	//* 111  258:invokeinterface #235 <Method int List.size()>
	//* 112  263:icmpge          314
			{
				c1.b();
	//  113  266:aload_1         
	//  114  267:invokevirtual   #234 <Method c c.b()>
	//  115  270:pop             
				j.a((l)((List) (arraylist)).get(i), c1);
	//  116  271:aload           7
	//  117  273:iload_3         
	//  118  274:invokeinterface #239 <Method Object List.get(int)>
	//  119  279:checkcast       #41  <Class l>
	//  120  282:aload_1         
	//  121  283:invokestatic    #244 <Method void j.a(l, c)>
				c.write(c1, ((List) (arraylist1)).get(i));
	//  122  286:aload_0         
	//  123  287:getfield        #33  <Field w c>
	//  124  290:aload_1         
	//  125  291:aload           8
	//  126  293:iload_3         
	//  127  294:invokeinterface #239 <Method Object List.get(int)>
	//  128  299:invokevirtual   #208 <Method void w.write(c, Object)>
				c1.c();
	//  129  302:aload_1         
	//  130  303:invokevirtual   #246 <Method c c.c()>
	//  131  306:pop             
			}

	//  132  307:iload_3         
	//  133  308:iconst_1        
	//  134  309:iadd            
	//  135  310:istore_3        
	//* 136  311:goto            255
			c1.c();
	//  137  314:aload_1         
	//  138  315:invokevirtual   #246 <Method c c.c()>
	//  139  318:pop             
			return;
	//  140  319:return          
		}
		c1.d();
	//  141  320:aload_1         
	//  142  321:invokevirtual   #175 <Method c c.d()>
	//  143  324:pop             
		for(int k = ((int) (flag3)); k < ((List) (arraylist)).size(); k++)
	//* 144  325:iload           6
	//* 145  327:istore_3        
	//* 146  328:iload_3         
	//* 147  329:aload           7
	//* 148  331:invokeinterface #235 <Method int List.size()>
	//* 149  336:icmpge          382
		{
			c1.a(a((l)((List) (arraylist)).get(k)));
	//  150  339:aload_1         
	//  151  340:aload_0         
	//  152  341:aload           7
	//  153  343:iload_3         
	//  154  344:invokeinterface #239 <Method Object List.get(int)>
	//  155  349:checkcast       #41  <Class l>
	//  156  352:invokespecial   #248 <Method String a(l)>
	//  157  355:invokevirtual   #201 <Method c c.a(String)>
	//  158  358:pop             
			c.write(c1, ((List) (arraylist1)).get(k));
	//  159  359:aload_0         
	//  160  360:getfield        #33  <Field w c>
	//  161  363:aload_1         
	//  162  364:aload           8
	//  163  366:iload_3         
	//  164  367:invokeinterface #239 <Method Object List.get(int)>
	//  165  372:invokevirtual   #208 <Method void w.write(c, Object)>
		}

	//  166  375:iload_3         
	//  167  376:iconst_1        
	//  168  377:iadd            
	//  169  378:istore_3        
	//* 170  379:goto            328
		c1.e();
	//  171  382:aload_1         
	//  172  383:invokevirtual   #210 <Method c c.e()>
	//  173  386:pop             
	//  174  387:return          
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #251 <Method Map a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (Map)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #111 <Class Map>
	//    4    6:invokevirtual   #253 <Method void a(c, Map)>
	//    5    9:return          
	}

	final g a;
	private final w b;
	private final w c;
	private final h d;

	public g$a(g g1, f f, Type type, w w1, Type type1, w w2, h h1)
	{
		a = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field g a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void w()>
		b = ((w) (new com.google.ads.interactivemedia.v3.b.b.a.l(f, w1, type)));
	//    5    9:aload_0         
	//    6   10:new             #26  <Class com.google.ads.interactivemedia.v3.b.b.a.l>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:aload           4
	//   10   17:aload_3         
	//   11   18:invokespecial   #29  <Method void com.google.ads.interactivemedia.v3.b.b.a.l(f, w, Type)>
	//   12   21:putfield        #31  <Field w b>
		c = ((w) (new com.google.ads.interactivemedia.v3.b.b.a.l(f, w2, type1)));
	//   13   24:aload_0         
	//   14   25:new             #26  <Class com.google.ads.interactivemedia.v3.b.b.a.l>
	//   15   28:dup             
	//   16   29:aload_2         
	//   17   30:aload           6
	//   18   32:aload           5
	//   19   34:invokespecial   #29  <Method void com.google.ads.interactivemedia.v3.b.b.a.l(f, w, Type)>
	//   20   37:putfield        #33  <Field w c>
		d = h1;
	//   21   40:aload_0         
	//   22   41:aload           7
	//   23   43:putfield        #35  <Field h d>
	//   24   46:return          
	}
}
