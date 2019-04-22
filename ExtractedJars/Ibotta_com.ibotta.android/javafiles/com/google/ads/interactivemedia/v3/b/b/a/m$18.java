// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b.a;

import com.google.ads.interactivemedia.v3.b.b.f;
import com.google.ads.interactivemedia.v3.b.d.*;
import com.google.ads.interactivemedia.v3.b.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b.a:
//			m

static final class m$18 extends w
{

	public l a(a a1)
		throws IOException
	{
		switch(com.google.ads.interactivemedia.v3.b.b.a.m$26.a[a1.f().ordinal()])
	//*   0    0:getstatic       #21  <Field int[] com.google.ads.interactivemedia.v3.b.b.a.m$26.a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #27  <Method b a.f()>
	//*   3    7:invokevirtual   #33  <Method int b.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 6: default 48
	//	               1 169
	//	               2 154
	//	               3 142
	//	               4 134
	//	               5 97
	//	               6 56
		default:
			throw new IllegalArgumentException();
	//    6   48:new             #35  <Class IllegalArgumentException>
	//    7   51:dup             
	//    8   52:invokespecial   #36  <Method void IllegalArgumentException()>
	//    9   55:athrow          

		case 6: // '\006'
			o o1 = new o();
	//   10   56:new             #38  <Class o>
	//   11   59:dup             
	//   12   60:invokespecial   #39  <Method void o()>
	//   13   63:astore_2        
			a1.c();
	//   14   64:aload_1         
	//   15   65:invokevirtual   #42  <Method void a.c()>
			for(; a1.e(); o1.a(a1.g(), a(a1)));
	//   16   68:aload_1         
	//   17   69:invokevirtual   #46  <Method boolean a.e()>
	//   18   72:ifeq            91
	//   19   75:aload_2         
	//   20   76:aload_1         
	//   21   77:invokevirtual   #50  <Method String a.g()>
	//   22   80:aload_0         
	//   23   81:aload_1         
	//   24   82:invokevirtual   #52  <Method l a(a)>
	//   25   85:invokevirtual   #55  <Method void o.a(String, l)>
	//*  26   88:goto            68
			a1.d();
	//   27   91:aload_1         
	//   28   92:invokevirtual   #58  <Method void a.d()>
			return ((l) (o1));
	//   29   95:aload_2         
	//   30   96:areturn         

		case 5: // '\005'
			i j = new i();
	//   31   97:new             #60  <Class i>
	//   32  100:dup             
	//   33  101:invokespecial   #61  <Method void i()>
	//   34  104:astore_2        
			a1.a();
	//   35  105:aload_1         
	//   36  106:invokevirtual   #63  <Method void a.a()>
			for(; a1.e(); j.a(a(a1)));
	//   37  109:aload_1         
	//   38  110:invokevirtual   #46  <Method boolean a.e()>
	//   39  113:ifeq            128
	//   40  116:aload_2         
	//   41  117:aload_0         
	//   42  118:aload_1         
	//   43  119:invokevirtual   #52  <Method l a(a)>
	//   44  122:invokevirtual   #66  <Method void i.a(l)>
	//*  45  125:goto            109
			a1.b();
	//   46  128:aload_1         
	//   47  129:invokevirtual   #69  <Method void a.b()>
			return ((l) (j));
	//   48  132:aload_2         
	//   49  133:areturn         

		case 4: // '\004'
			a1.j();
	//   50  134:aload_1         
	//   51  135:invokevirtual   #72  <Method void a.j()>
			return ((l) (n.a));
	//   52  138:getstatic       #77  <Field n n.a>
	//   53  141:areturn         

		case 3: // '\003'
			return ((l) (new q(a1.h())));
	//   54  142:new             #79  <Class q>
	//   55  145:dup             
	//   56  146:aload_1         
	//   57  147:invokevirtual   #82  <Method String a.h()>
	//   58  150:invokespecial   #85  <Method void q(String)>
	//   59  153:areturn         

		case 2: // '\002'
			return ((l) (new q(Boolean.valueOf(a1.i()))));
	//   60  154:new             #79  <Class q>
	//   61  157:dup             
	//   62  158:aload_1         
	//   63  159:invokevirtual   #88  <Method boolean a.i()>
	//   64  162:invokestatic    #94  <Method Boolean Boolean.valueOf(boolean)>
	//   65  165:invokespecial   #97  <Method void q(Boolean)>
	//   66  168:areturn         

		case 1: // '\001'
			return ((l) (new q(((Number) (new f(a1.h()))))));
	//   67  169:new             #79  <Class q>
	//   68  172:dup             
	//   69  173:new             #99  <Class f>
	//   70  176:dup             
	//   71  177:aload_1         
	//   72  178:invokevirtual   #82  <Method String a.h()>
	//   73  181:invokespecial   #100 <Method void f(String)>
	//   74  184:invokespecial   #103 <Method void q(Number)>
	//   75  187:areturn         
		}
	}

	public void a(c c1, l l1)
		throws IOException
	{
		if(l1 != null && !l1.j())
	//*   0    0:aload_2         
	//*   1    1:ifnull          254
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #109 <Method boolean l.j()>
	//*   4    8:ifeq            14
	//*   5   11:goto            254
		{
			if(l1.i())
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #110 <Method boolean l.i()>
	//*   8   18:ifeq            70
			{
				l1 = ((l) (l1.m()));
	//    9   21:aload_2         
	//   10   22:invokevirtual   #114 <Method q l.m()>
	//   11   25:astore_2        
				if(((q) (l1)).p())
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #117 <Method boolean q.p()>
	//*  14   30:ifeq            43
				{
					c1.a(((q) (l1)).a());
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:invokevirtual   #120 <Method Number q.a()>
	//   18   38:invokevirtual   #125 <Method c c.a(Number)>
	//   19   41:pop             
					return;
	//   20   42:return          
				}
				if(((q) (l1)).o())
	//*  21   43:aload_2         
	//*  22   44:invokevirtual   #128 <Method boolean q.o()>
	//*  23   47:ifeq            60
				{
					c1.a(((q) (l1)).f());
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #130 <Method boolean q.f()>
	//   27   55:invokevirtual   #133 <Method c c.a(boolean)>
	//   28   58:pop             
					return;
	//   29   59:return          
				} else
				{
					c1.b(((q) (l1)).b());
	//   30   60:aload_1         
	//   31   61:aload_2         
	//   32   62:invokevirtual   #135 <Method String q.b()>
	//   33   65:invokevirtual   #138 <Method c c.b(String)>
	//   34   68:pop             
					return;
	//   35   69:return          
				}
			}
			if(l1.g())
	//*  36   70:aload_2         
	//*  37   71:invokevirtual   #140 <Method boolean l.g()>
	//*  38   74:ifeq            122
			{
				c1.b();
	//   39   77:aload_1         
	//   40   78:invokevirtual   #143 <Method c c.b()>
	//   41   81:pop             
				for(l1 = ((l) (l1.l().iterator())); ((Iterator) (l1)).hasNext(); a(c1, (l)((Iterator) (l1)).next()));
	//   42   82:aload_2         
	//   43   83:invokevirtual   #147 <Method i l.l()>
	//   44   86:invokevirtual   #151 <Method Iterator i.iterator()>
	//   45   89:astore_2        
	//   46   90:aload_2         
	//   47   91:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//   48   96:ifeq            116
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:aload_2         
	//   52  102:invokeinterface #160 <Method Object Iterator.next()>
	//   53  107:checkcast       #107 <Class l>
	//   54  110:invokevirtual   #162 <Method void a(c, l)>
	//*  55  113:goto            90
				c1.c();
	//   56  116:aload_1         
	//   57  117:invokevirtual   #164 <Method c c.c()>
	//   58  120:pop             
				return;
	//   59  121:return          
			}
			if(l1.h())
	//*  60  122:aload_2         
	//*  61  123:invokevirtual   #166 <Method boolean l.h()>
	//*  62  126:ifeq            203
			{
				c1.d();
	//   63  129:aload_1         
	//   64  130:invokevirtual   #168 <Method c c.d()>
	//   65  133:pop             
				java.util.ntry ntry;
				for(l1 = ((l) (l1.k().o().iterator())); ((Iterator) (l1)).hasNext(); a(c1, (l)ntry.getValue()))
	//*  66  134:aload_2         
	//*  67  135:invokevirtual   #172 <Method o l.k()>
	//*  68  138:invokevirtual   #175 <Method Set o.o()>
	//*  69  141:invokeinterface #178 <Method Iterator Set.iterator()>
	//*  70  146:astore_2        
	//*  71  147:aload_2         
	//*  72  148:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*  73  153:ifeq            197
				{
					ntry = (java.util.ntry)((Iterator) (l1)).next();
	//   74  156:aload_2         
	//   75  157:invokeinterface #160 <Method Object Iterator.next()>
	//   76  162:checkcast       #180 <Class java.util.Map$Entry>
	//   77  165:astore_3        
					c1.a((String)ntry.getKey());
	//   78  166:aload_1         
	//   79  167:aload_3         
	//   80  168:invokeinterface #183 <Method Object java.util.Map$Entry.getKey()>
	//   81  173:checkcast       #185 <Class String>
	//   82  176:invokevirtual   #187 <Method c c.a(String)>
	//   83  179:pop             
				}

	//   84  180:aload_0         
	//   85  181:aload_1         
	//   86  182:aload_3         
	//   87  183:invokeinterface #190 <Method Object java.util.Map$Entry.getValue()>
	//   88  188:checkcast       #107 <Class l>
	//   89  191:invokevirtual   #162 <Method void a(c, l)>
	//*  90  194:goto            147
				c1.e();
	//   91  197:aload_1         
	//   92  198:invokevirtual   #192 <Method c c.e()>
	//   93  201:pop             
				return;
	//   94  202:return          
			} else
			{
				c1 = ((c) (String.valueOf(((Object) (((Object) (l1)).getClass())))));
	//   95  203:aload_2         
	//   96  204:invokevirtual   #198 <Method Class Object.getClass()>
	//   97  207:invokestatic    #201 <Method String String.valueOf(Object)>
	//   98  210:astore_1        
				l1 = ((l) (new StringBuilder(String.valueOf(((Object) (c1))).length() + 15)));
	//   99  211:new             #203 <Class StringBuilder>
	//  100  214:dup             
	//  101  215:aload_1         
	//  102  216:invokestatic    #201 <Method String String.valueOf(Object)>
	//  103  219:invokevirtual   #206 <Method int String.length()>
	//  104  222:bipush          15
	//  105  224:iadd            
	//  106  225:invokespecial   #209 <Method void StringBuilder(int)>
	//  107  228:astore_2        
				((StringBuilder) (l1)).append("Couldn't write ");
	//  108  229:aload_2         
	//  109  230:ldc1            #211 <String "Couldn't write ">
	//  110  232:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
	//  111  235:pop             
				((StringBuilder) (l1)).append(((String) (c1)));
	//  112  236:aload_2         
	//  113  237:aload_1         
	//  114  238:invokevirtual   #215 <Method StringBuilder StringBuilder.append(String)>
	//  115  241:pop             
				throw new IllegalArgumentException(((StringBuilder) (l1)).toString());
	//  116  242:new             #35  <Class IllegalArgumentException>
	//  117  245:dup             
	//  118  246:aload_2         
	//  119  247:invokevirtual   #218 <Method String StringBuilder.toString()>
	//  120  250:invokespecial   #219 <Method void IllegalArgumentException(String)>
	//  121  253:athrow          
			}
		} else
		{
			c1.f();
	//  122  254:aload_1         
	//  123  255:invokevirtual   #221 <Method c c.f()>
	//  124  258:pop             
			return;
	//  125  259:return          
		}
	}

	public Object read(a a1)
		throws IOException
	{
		return ((Object) (a(a1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method l a(a)>
	//    3    5:areturn         
	}

	public void write(c c1, Object obj)
		throws IOException
	{
		a(c1, (l)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #107 <Class l>
	//    4    6:invokevirtual   #162 <Method void a(c, l)>
	//    5    9:return          
	}

	m$18()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void w()>
	//    2    4:return          
	}
}
