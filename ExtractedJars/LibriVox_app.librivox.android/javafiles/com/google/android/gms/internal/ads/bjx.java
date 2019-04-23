// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bji, bjj, bmx, bmw, 
//			bjw, bjf, bjr, bjq, 
//			zzfs, bif, bjs, bjz, 
//			bnf, bjk, bjy, bkc, 
//			bmj, bdg, bfc, bmz

public final class bjx
	implements bji, bjj, bmx
{

	public bjx(int i1, int ai[], bjz bjz1, bjk bjk1, bmj bmj, long l1, 
			int j1, bif bif1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		c = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #51  <Field int c>
		d = ai;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #53  <Field int[] d>
		f = bjz1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #55  <Field bjz f>
		g = bjk1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #57  <Field bjk g>
		h = bif1;
	//   14   25:aload_0         
	//   15   26:aload           9
	//   16   28:putfield        #59  <Field bif h>
		i = j1;
	//   17   31:aload_0         
	//   18   32:iload           8
	//   19   34:putfield        #61  <Field int i>
	//   20   37:aload_0         
	//   21   38:new             #63  <Class bmw>
	//   22   41:dup             
	//   23   42:ldc1            #65  <String "Loader:ChunkSampleStream">
	//   24   44:invokespecial   #68  <Method void bmw(String)>
	//   25   47:putfield        #70  <Field bmw j>
	//   26   50:aload_0         
	//   27   51:new             #72  <Class bjw>
	//   28   54:dup             
	//   29   55:invokespecial   #73  <Method void bjw()>
	//   30   58:putfield        #75  <Field bjw k>
	//   31   61:aload_0         
	//   32   62:new             #77  <Class LinkedList>
	//   33   65:dup             
	//   34   66:invokespecial   #78  <Method void LinkedList()>
	//   35   69:putfield        #80  <Field LinkedList l>
		m = Collections.unmodifiableList(((List) (l)));
	//   36   72:aload_0         
	//   37   73:aload_0         
	//   38   74:getfield        #80  <Field LinkedList l>
	//   39   77:invokestatic    #86  <Method List Collections.unmodifiableList(List)>
	//   40   80:putfield        #88  <Field List m>
		int k1 = 0;
	//   41   83:iconst_0        
	//   42   84:istore          10
		if(ai == null)
	//*  43   86:aload_2         
	//*  44   87:ifnonnull       96
			j1 = 0;
	//   45   90:iconst_0        
	//   46   91:istore          8
		else
	//*  47   93:goto            100
			j1 = ai.length;
	//   48   96:aload_2         
	//   49   97:arraylength     
	//   50   98:istore          8
		o = new bjf[j1];
	//   51  100:aload_0         
	//   52  101:iload           8
	//   53  103:anewarray       bjf[]
	//   54  106:putfield        #92  <Field bjf[] o>
		e = new boolean[j1];
	//   55  109:aload_0         
	//   56  110:iload           8
	//   57  112:newarray        boolean[]
	//   58  114:putfield        #94  <Field boolean[] e>
		int i2 = j1 + 1;
	//   59  117:iload           8
	//   60  119:iconst_1        
	//   61  120:iadd            
	//   62  121:istore          11
		bjz1 = ((bjz) (new int[i2]));
	//   63  123:iload           11
	//   64  125:newarray        int[]
	//   65  127:astore_3        
		bjk1 = ((bjk) (new bjf[i2]));
	//   66  128:iload           11
	//   67  130:anewarray       bjf[]
	//   68  133:astore          4
		n = new bjf(bmj);
	//   69  135:aload_0         
	//   70  136:new             #90  <Class bjf>
	//   71  139:dup             
	//   72  140:aload           5
	//   73  142:invokespecial   #97  <Method void bjf(bmj)>
	//   74  145:putfield        #99  <Field bjf n>
		bjz1[0] = i1;
	//   75  148:aload_3         
	//   76  149:iconst_0        
	//   77  150:iload_1         
	//   78  151:iastore         
		bjk1[0] = ((/*<invalid signature>*/java.lang.Object) (n));
	//   79  152:aload           4
	//   80  154:iconst_0        
	//   81  155:aload_0         
	//   82  156:getfield        #99  <Field bjf n>
	//   83  159:aastore         
		for(i1 = k1; i1 < j1; i1 = k1)
	//*  84  160:iload           10
	//*  85  162:istore_1        
	//*  86  163:iload_1         
	//*  87  164:iload           8
	//*  88  166:icmpge          213
		{
			bif1 = ((bif) (new bjf(bmj)));
	//   89  169:new             #90  <Class bjf>
	//   90  172:dup             
	//   91  173:aload           5
	//   92  175:invokespecial   #97  <Method void bjf(bmj)>
	//   93  178:astore          9
			o[i1] = ((bjf) (bif1));
	//   94  180:aload_0         
	//   95  181:getfield        #92  <Field bjf[] o>
	//   96  184:iload_1         
	//   97  185:aload           9
	//   98  187:aastore         
			k1 = i1 + 1;
	//   99  188:iload_1         
	//  100  189:iconst_1        
	//  101  190:iadd            
	//  102  191:istore          10
			bjk1[k1] = ((/*<invalid signature>*/java.lang.Object) (bif1));
	//  103  193:aload           4
	//  104  195:iload           10
	//  105  197:aload           9
	//  106  199:aastore         
			bjz1[k1] = ai[i1];
	//  107  200:aload_3         
	//  108  201:iload           10
	//  109  203:aload_2         
	//  110  204:iload_1         
	//  111  205:iaload          
	//  112  206:iastore         
		}

	//  113  207:iload           10
	//  114  209:istore_1        
	//* 115  210:goto            163
		p = new bjr(((int []) (bjz1)), ((bjf []) (bjk1)));
	//  116  213:aload_0         
	//  117  214:new             #101 <Class bjr>
	//  118  217:dup             
	//  119  218:aload_3         
	//  120  219:aload           4
	//  121  221:invokespecial   #104 <Method void bjr(int[], bjf[])>
	//  122  224:putfield        #106 <Field bjr p>
		r = l1;
	//  123  227:aload_0         
	//  124  228:lload           6
	//  125  230:putfield        #108 <Field long r>
		a = l1;
	//  126  233:aload_0         
	//  127  234:lload           6
	//  128  236:putfield        #110 <Field long a>
	//  129  239:return          
	}

	static boolean[] a(bjx bjx1)
	{
		return bjx1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field boolean[] e>
	//    2    4:areturn         
	}

	public final int a(bdg bdg, bfc bfc, boolean flag)
	{
		if(f())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #116 <Method boolean f()>
	//*   2    4:ifeq            10
			return -3;
	//    3    7:bipush          -3
	//    4    9:ireturn         
		int i1 = n.d();
	//    5   10:aload_0         
	//    6   11:getfield        #99  <Field bjf n>
	//    7   14:invokevirtual   #119 <Method int bjf.d()>
	//    8   17:istore          4
		if(!l.isEmpty())
	//*   9   19:aload_0         
	//*  10   20:getfield        #80  <Field LinkedList l>
	//*  11   23:invokevirtual   #122 <Method boolean LinkedList.isEmpty()>
	//*  12   26:ifne            136
		{
			for(; l.size() > 1 && ((bjq)l.get(1)).a(0) <= i1; l.removeFirst());
	//   13   29:aload_0         
	//   14   30:getfield        #80  <Field LinkedList l>
	//   15   33:invokevirtual   #125 <Method int LinkedList.size()>
	//   16   36:iconst_1        
	//   17   37:icmple          71
	//   18   40:aload_0         
	//   19   41:getfield        #80  <Field LinkedList l>
	//   20   44:iconst_1        
	//   21   45:invokevirtual   #129 <Method Object LinkedList.get(int)>
	//   22   48:checkcast       #131 <Class bjq>
	//   23   51:iconst_0        
	//   24   52:invokevirtual   #134 <Method int bjq.a(int)>
	//   25   55:iload           4
	//   26   57:icmpgt          71
	//   27   60:aload_0         
	//   28   61:getfield        #80  <Field LinkedList l>
	//   29   64:invokevirtual   #138 <Method Object LinkedList.removeFirst()>
	//   30   67:pop             
	//*  31   68:goto            29
			bjq bjq1 = (bjq)l.getFirst();
	//   32   71:aload_0         
	//   33   72:getfield        #80  <Field LinkedList l>
	//   34   75:invokevirtual   #141 <Method Object LinkedList.getFirst()>
	//   35   78:checkcast       #131 <Class bjq>
	//   36   81:astore          5
			zzfs zzfs1 = bjq1.c;
	//   37   83:aload           5
	//   38   85:getfield        #143 <Field zzfs bjq.c>
	//   39   88:astore          6
			if(!zzfs1.equals(((Object) (q))))
	//*  40   90:aload           6
	//*  41   92:aload_0         
	//*  42   93:getfield        #145 <Field zzfs q>
	//*  43   96:invokevirtual   #151 <Method boolean zzfs.equals(Object)>
	//*  44   99:ifne            130
				h.a(c, zzfs1, bjq1.d, bjq1.e, bjq1.f);
	//   45  102:aload_0         
	//   46  103:getfield        #59  <Field bif h>
	//   47  106:aload_0         
	//   48  107:getfield        #51  <Field int c>
	//   49  110:aload           6
	//   50  112:aload           5
	//   51  114:getfield        #153 <Field int bjq.d>
	//   52  117:aload           5
	//   53  119:getfield        #156 <Field Object bjq.e>
	//   54  122:aload           5
	//   55  124:getfield        #158 <Field long bjq.f>
	//   56  127:invokevirtual   #163 <Method void bif.a(int, zzfs, int, Object, long)>
			q = zzfs1;
	//   57  130:aload_0         
	//   58  131:aload           6
	//   59  133:putfield        #145 <Field zzfs q>
		}
		return n.a(bdg, bfc, flag, b, a);
	//   60  136:aload_0         
	//   61  137:getfield        #99  <Field bjf n>
	//   62  140:aload_1         
	//   63  141:aload_2         
	//   64  142:iload_3         
	//   65  143:aload_0         
	//   66  144:getfield        #165 <Field boolean b>
	//   67  147:aload_0         
	//   68  148:getfield        #110 <Field long a>
	//   69  151:invokevirtual   #168 <Method int bjf.a(bdg, bfc, boolean, boolean, long)>
	//   70  154:ireturn         
	}

	public final int a(bmz bmz, long l1, long l2, IOException ioexception)
	{
		bmz = ((bmz) ((bjs)bmz));
	//    0    0:aload_1         
	//    1    1:checkcast       #171 <Class bjs>
	//    2    4:astore_1        
		long l3 = ((bjs) (bmz)).e();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #174 <Method long bjs.e()>
	//    5    9:lstore          8
		boolean flag1 = bmz instanceof bjq;
	//    6   11:aload_1         
	//    7   12:instanceof      #131 <Class bjq>
	//    8   15:istore          11
		boolean flag;
		if(flag1 && l3 != 0L && l.size() <= 1)
	//*   9   17:iload           11
	//*  10   19:ifeq            49
	//*  11   22:lload           8
	//*  12   24:lconst_0        
	//*  13   25:lcmp            
	//*  14   26:ifeq            49
	//*  15   29:aload_0         
	//*  16   30:getfield        #80  <Field LinkedList l>
	//*  17   33:invokevirtual   #125 <Method int LinkedList.size()>
	//*  18   36:iconst_1        
	//*  19   37:icmple          43
	//*  20   40:goto            49
			flag = false;
	//   21   43:iconst_0        
	//   22   44:istore          10
		else
	//*  23   46:goto            52
			flag = true;
	//   24   49:iconst_1        
	//   25   50:istore          10
		if(f.a(((bjs) (bmz)), flag, ((Exception) (ioexception))))
	//*  26   52:aload_0         
	//*  27   53:getfield        #55  <Field bjz f>
	//*  28   56:aload_1         
	//*  29   57:iload           10
	//*  30   59:aload           6
	//*  31   61:invokeinterface #179 <Method boolean bjz.a(bjs, boolean, Exception)>
	//*  32   66:ifeq            188
		{
			if(flag1)
	//*  33   69:iload           11
	//*  34   71:ifeq            182
			{
				bjq bjq1 = (bjq)l.removeLast();
	//   35   74:aload_0         
	//   36   75:getfield        #80  <Field LinkedList l>
	//   37   78:invokevirtual   #182 <Method Object LinkedList.removeLast()>
	//   38   81:checkcast       #131 <Class bjq>
	//   39   84:astore          12
				if(bjq1 == bmz)
	//*  40   86:aload           12
	//*  41   88:aload_1         
	//*  42   89:if_acmpne       98
					flag = true;
	//   43   92:iconst_1        
	//   44   93:istore          10
				else
	//*  45   95:goto            101
					flag = false;
	//   46   98:iconst_0        
	//   47   99:istore          10
				bnf.b(flag);
	//   48  101:iload           10
	//   49  103:invokestatic    #187 <Method void bnf.b(boolean)>
				n.a(bjq1.a(0));
	//   50  106:aload_0         
	//   51  107:getfield        #99  <Field bjf n>
	//   52  110:aload           12
	//   53  112:iconst_0        
	//   54  113:invokevirtual   #134 <Method int bjq.a(int)>
	//   55  116:invokevirtual   #190 <Method void bjf.a(int)>
				int i1 = 0;
	//   56  119:iconst_0        
	//   57  120:istore          7
				do
				{
					bjf abjf[] = o;
	//   58  122:aload_0         
	//   59  123:getfield        #92  <Field bjf[] o>
	//   60  126:astore          13
					if(i1 >= abjf.length)
						break;
	//   61  128:iload           7
	//   62  130:aload           13
	//   63  132:arraylength     
	//   64  133:icmpge          164
					bjf bjf1 = abjf[i1];
	//   65  136:aload           13
	//   66  138:iload           7
	//   67  140:aaload          
	//   68  141:astore          13
					i1++;
	//   69  143:iload           7
	//   70  145:iconst_1        
	//   71  146:iadd            
	//   72  147:istore          7
					bjf1.a(bjq1.a(i1));
	//   73  149:aload           13
	//   74  151:aload           12
	//   75  153:iload           7
	//   76  155:invokevirtual   #134 <Method int bjq.a(int)>
	//   77  158:invokevirtual   #190 <Method void bjf.a(int)>
				} while(true);
	//   78  161:goto            122
				if(l.isEmpty())
	//*  79  164:aload_0         
	//*  80  165:getfield        #80  <Field LinkedList l>
	//*  81  168:invokevirtual   #122 <Method boolean LinkedList.isEmpty()>
	//*  82  171:ifeq            182
					r = a;
	//   83  174:aload_0         
	//   84  175:aload_0         
	//   85  176:getfield        #110 <Field long a>
	//   86  179:putfield        #108 <Field long r>
			}
			flag = true;
	//   87  182:iconst_1        
	//   88  183:istore          10
		} else
	//*  89  185:goto            191
		{
			flag = false;
	//   90  188:iconst_0        
	//   91  189:istore          10
		}
		h.a(((bjs) (bmz)).a, ((bjs) (bmz)).b, c, ((bjs) (bmz)).c, ((bjs) (bmz)).d, ((bjs) (bmz)).e, ((bjs) (bmz)).f, ((bjs) (bmz)).g, l1, l2, l3, ioexception, flag);
	//   92  191:aload_0         
	//   93  192:getfield        #59  <Field bif h>
	//   94  195:aload_1         
	//   95  196:getfield        #193 <Field bmp bjs.a>
	//   96  199:aload_1         
	//   97  200:getfield        #195 <Field int bjs.b>
	//   98  203:aload_0         
	//   99  204:getfield        #51  <Field int c>
	//  100  207:aload_1         
	//  101  208:getfield        #196 <Field zzfs bjs.c>
	//  102  211:aload_1         
	//  103  212:getfield        #197 <Field int bjs.d>
	//  104  215:aload_1         
	//  105  216:getfield        #198 <Field Object bjs.e>
	//  106  219:aload_1         
	//  107  220:getfield        #199 <Field long bjs.f>
	//  108  223:aload_1         
	//  109  224:getfield        #201 <Field long bjs.g>
	//  110  227:lload_2         
	//  111  228:lload           4
	//  112  230:lload           8
	//  113  232:aload           6
	//  114  234:iload           10
	//  115  236:invokevirtual   #204 <Method void bif.a(bmp, int, int, zzfs, int, Object, long, long, long, long, long, IOException, boolean)>
		if(flag)
	//* 116  239:iload           10
	//* 117  241:ifeq            256
		{
			g.a(((bjj) (this)));
	//  118  244:aload_0         
	//  119  245:getfield        #57  <Field bjk g>
	//  120  248:aload_0         
	//  121  249:invokeinterface #209 <Method void bjk.a(bjj)>
			return 2;
	//  122  254:iconst_2        
	//  123  255:ireturn         
		} else
		{
			return 0;
	//  124  256:iconst_0        
	//  125  257:ireturn         
		}
	}

	public final bjy a(long l1, int i1)
	{
		for(int j1 = 0; j1 < o.length; j1++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_0         
	//*   4    6:getfield        #92  <Field bjf[] o>
	//*   5    9:arraylength     
	//*   6   10:icmpge          85
			if(d[j1] == i1)
	//*   7   13:aload_0         
	//*   8   14:getfield        #53  <Field int[] d>
	//*   9   17:iload           4
	//*  10   19:iaload          
	//*  11   20:iload_3         
	//*  12   21:icmpne          76
			{
				bnf.b(e[j1] ^ true);
	//   13   24:aload_0         
	//   14   25:getfield        #94  <Field boolean[] e>
	//   15   28:iload           4
	//   16   30:baload          
	//   17   31:iconst_1        
	//   18   32:ixor            
	//   19   33:invokestatic    #187 <Method void bnf.b(boolean)>
				e[j1] = true;
	//   20   36:aload_0         
	//   21   37:getfield        #94  <Field boolean[] e>
	//   22   40:iload           4
	//   23   42:iconst_1        
	//   24   43:bastore         
				o[j1].a(l1, true);
	//   25   44:aload_0         
	//   26   45:getfield        #92  <Field bjf[] o>
	//   27   48:iload           4
	//   28   50:aaload          
	//   29   51:lload_1         
	//   30   52:iconst_1        
	//   31   53:invokevirtual   #213 <Method boolean bjf.a(long, boolean)>
	//   32   56:pop             
				return new bjy(this, this, o[j1], j1);
	//   33   57:new             #215 <Class bjy>
	//   34   60:dup             
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:aload_0         
	//   38   64:getfield        #92  <Field bjf[] o>
	//   39   67:iload           4
	//   40   69:aaload          
	//   41   70:iload           4
	//   42   72:invokespecial   #218 <Method void bjy(bjx, bjx, bjf, int)>
	//   43   75:areturn         
			}

	//   44   76:iload           4
	//   45   78:iconst_1        
	//   46   79:iadd            
	//   47   80:istore          4
	//*  48   82:goto            3
		throw new IllegalStateException();
	//   49   85:new             #220 <Class IllegalStateException>
	//   50   88:dup             
	//   51   89:invokespecial   #221 <Method void IllegalStateException()>
	//   52   92:athrow          
	}

	public final void a(bmz bmz, long l1, long l2)
	{
		bmz = ((bmz) ((bjs)bmz));
	//    0    0:aload_1         
	//    1    1:checkcast       #171 <Class bjs>
	//    2    4:astore_1        
		f.a(((bjs) (bmz)));
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field bjz f>
	//    5    9:aload_1         
	//    6   10:invokeinterface #225 <Method void bjz.a(bjs)>
		h.a(((bjs) (bmz)).a, ((bjs) (bmz)).b, c, ((bjs) (bmz)).c, ((bjs) (bmz)).d, ((bjs) (bmz)).e, ((bjs) (bmz)).f, ((bjs) (bmz)).g, l1, l2, ((bjs) (bmz)).e());
	//    7   15:aload_0         
	//    8   16:getfield        #59  <Field bif h>
	//    9   19:aload_1         
	//   10   20:getfield        #193 <Field bmp bjs.a>
	//   11   23:aload_1         
	//   12   24:getfield        #195 <Field int bjs.b>
	//   13   27:aload_0         
	//   14   28:getfield        #51  <Field int c>
	//   15   31:aload_1         
	//   16   32:getfield        #196 <Field zzfs bjs.c>
	//   17   35:aload_1         
	//   18   36:getfield        #197 <Field int bjs.d>
	//   19   39:aload_1         
	//   20   40:getfield        #198 <Field Object bjs.e>
	//   21   43:aload_1         
	//   22   44:getfield        #199 <Field long bjs.f>
	//   23   47:aload_1         
	//   24   48:getfield        #201 <Field long bjs.g>
	//   25   51:lload_2         
	//   26   52:lload           4
	//   27   54:aload_1         
	//   28   55:invokevirtual   #174 <Method long bjs.e()>
	//   29   58:invokevirtual   #228 <Method void bif.a(bmp, int, int, zzfs, int, Object, long, long, long, long, long)>
		g.a(((bjj) (this)));
	//   30   61:aload_0         
	//   31   62:getfield        #57  <Field bjk g>
	//   32   65:aload_0         
	//   33   66:invokeinterface #209 <Method void bjk.a(bjj)>
	//   34   71:return          
	}

	public final void a(bmz bmz, long l1, long l2, boolean flag)
	{
		bmz = ((bmz) ((bjs)bmz));
	//    0    0:aload_1         
	//    1    1:checkcast       #171 <Class bjs>
	//    2    4:astore_1        
		h.b(((bjs) (bmz)).a, ((bjs) (bmz)).b, c, ((bjs) (bmz)).c, ((bjs) (bmz)).d, ((bjs) (bmz)).e, ((bjs) (bmz)).f, ((bjs) (bmz)).g, l1, l2, ((bjs) (bmz)).e());
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field bif h>
	//    5    9:aload_1         
	//    6   10:getfield        #193 <Field bmp bjs.a>
	//    7   13:aload_1         
	//    8   14:getfield        #195 <Field int bjs.b>
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field int c>
	//   11   21:aload_1         
	//   12   22:getfield        #196 <Field zzfs bjs.c>
	//   13   25:aload_1         
	//   14   26:getfield        #197 <Field int bjs.d>
	//   15   29:aload_1         
	//   16   30:getfield        #198 <Field Object bjs.e>
	//   17   33:aload_1         
	//   18   34:getfield        #199 <Field long bjs.f>
	//   19   37:aload_1         
	//   20   38:getfield        #201 <Field long bjs.g>
	//   21   41:lload_2         
	//   22   42:lload           4
	//   23   44:aload_1         
	//   24   45:invokevirtual   #174 <Method long bjs.e()>
	//   25   48:invokevirtual   #231 <Method void bif.b(bmp, int, int, zzfs, int, Object, long, long, long, long, long)>
		if(!flag)
	//*  26   51:iload           6
	//*  27   53:ifne            111
		{
			n.a(true);
	//   28   56:aload_0         
	//   29   57:getfield        #99  <Field bjf n>
	//   30   60:iconst_1        
	//   31   61:invokevirtual   #233 <Method void bjf.a(boolean)>
			bmz = ((bmz) (o));
	//   32   64:aload_0         
	//   33   65:getfield        #92  <Field bjf[] o>
	//   34   68:astore_1        
			int j1 = bmz.length;
	//   35   69:aload_1         
	//   36   70:arraylength     
	//   37   71:istore          8
			for(int i1 = 0; i1 < j1; i1++)
	//*  38   73:iconst_0        
	//*  39   74:istore          7
	//*  40   76:iload           7
	//*  41   78:iload           8
	//*  42   80:icmpge          100
				((bjf) (bmz[i1])).a(true);
	//   43   83:aload_1         
	//   44   84:iload           7
	//   45   86:aaload          
	//   46   87:iconst_1        
	//   47   88:invokevirtual   #233 <Method void bjf.a(boolean)>

	//   48   91:iload           7
	//   49   93:iconst_1        
	//   50   94:iadd            
	//   51   95:istore          7
	//*  52   97:goto            76
			g.a(((bjj) (this)));
	//   53  100:aload_0         
	//   54  101:getfield        #57  <Field bjk g>
	//   55  104:aload_0         
	//   56  105:invokeinterface #209 <Method void bjk.a(bjj)>
			return;
	//   57  110:return          
		} else
		{
			return;
	//   58  111:return          
		}
	}

	public final boolean a()
	{
		return b || !f() && n.c();
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean b>
	//    2    4:ifne            29
	//    3    7:aload_0         
	//    4    8:invokevirtual   #116 <Method boolean f()>
	//    5   11:ifne            27
	//    6   14:aload_0         
	//    7   15:getfield        #99  <Field bjf n>
	//    8   18:invokevirtual   #235 <Method boolean bjf.c()>
	//    9   21:ifeq            27
	//   10   24:goto            29
	//   11   27:iconst_0        
	//   12   28:ireturn         
	//   13   29:iconst_1        
	//   14   30:ireturn         
	}

	public final boolean a(long l1)
	{
		if(!b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field boolean b>
	//*   2    4:ifne            252
		{
			if(j.a())
	//*   3    7:aload_0         
	//*   4    8:getfield        #70  <Field bmw j>
	//*   5   11:invokevirtual   #238 <Method boolean bmw.a()>
	//*   6   14:ifeq            19
				return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			Object obj1 = ((Object) (f));
	//    9   19:aload_0         
	//   10   20:getfield        #55  <Field bjz f>
	//   11   23:astore          7
			Object obj;
			if(l.isEmpty())
	//*  12   25:aload_0         
	//*  13   26:getfield        #80  <Field LinkedList l>
	//*  14   29:invokevirtual   #122 <Method boolean LinkedList.isEmpty()>
	//*  15   32:ifeq            41
				obj = null;
	//   16   35:aconst_null     
	//   17   36:astore          6
			else
	//*  18   38:goto            53
				obj = ((Object) ((bkc)l.getLast()));
	//   19   41:aload_0         
	//   20   42:getfield        #80  <Field LinkedList l>
	//   21   45:invokevirtual   #241 <Method Object LinkedList.getLast()>
	//   22   48:checkcast       #243 <Class bkc>
	//   23   51:astore          6
			long l2 = r;
	//   24   53:aload_0         
	//   25   54:getfield        #108 <Field long r>
	//   26   57:lstore_3        
			if(l2 != 0x1L)
	//*  27   58:lload_3         
	//*  28   59:ldc2w           #244 <Long 0x1L>
	//*  29   62:lcmp            
	//*  30   63:ifeq            71
				l1 = l2;
	//   31   66:lload_3         
	//   32   67:lstore_1        
	//*  33   68:goto            71
			((bjz) (obj1)).a(((bkc) (obj)), l1, k);
	//   34   71:aload           7
	//   35   73:aload           6
	//   36   75:lload_1         
	//   37   76:aload_0         
	//   38   77:getfield        #75  <Field bjw k>
	//   39   80:invokeinterface #248 <Method void bjz.a(bkc, long, bjw)>
			boolean flag = k.b;
	//   40   85:aload_0         
	//   41   86:getfield        #75  <Field bjw k>
	//   42   89:getfield        #249 <Field boolean bjw.b>
	//   43   92:istore          5
			obj = ((Object) (k.a));
	//   44   94:aload_0         
	//   45   95:getfield        #75  <Field bjw k>
	//   46   98:getfield        #252 <Field bjs bjw.a>
	//   47  101:astore          6
			obj1 = ((Object) (k));
	//   48  103:aload_0         
	//   49  104:getfield        #75  <Field bjw k>
	//   50  107:astore          7
			obj1.a = null;
	//   51  109:aload           7
	//   52  111:aconst_null     
	//   53  112:putfield        #252 <Field bjs bjw.a>
			obj1.b = false;
	//   54  115:aload           7
	//   55  117:iconst_0        
	//   56  118:putfield        #249 <Field boolean bjw.b>
			if(flag)
	//*  57  121:iload           5
	//*  58  123:ifeq            140
			{
				r = 0x1L;
	//   59  126:aload_0         
	//   60  127:ldc2w           #244 <Long 0x1L>
	//   61  130:putfield        #108 <Field long r>
				b = true;
	//   62  133:aload_0         
	//   63  134:iconst_1        
	//   64  135:putfield        #165 <Field boolean b>
				return true;
	//   65  138:iconst_1        
	//   66  139:ireturn         
			}
			if(obj == null)
	//*  67  140:aload           6
	//*  68  142:ifnonnull       147
				return false;
	//   69  145:iconst_0        
	//   70  146:ireturn         
			if(obj instanceof bjq)
	//*  71  147:aload           6
	//*  72  149:instanceof      #131 <Class bjq>
	//*  73  152:ifeq            188
			{
				r = 0x1L;
	//   74  155:aload_0         
	//   75  156:ldc2w           #244 <Long 0x1L>
	//   76  159:putfield        #108 <Field long r>
				bjq bjq1 = (bjq)obj;
	//   77  162:aload           6
	//   78  164:checkcast       #131 <Class bjq>
	//   79  167:astore          7
				bjq1.a(p);
	//   80  169:aload           7
	//   81  171:aload_0         
	//   82  172:getfield        #106 <Field bjr p>
	//   83  175:invokevirtual   #255 <Method void bjq.a(bjr)>
				l.add(((Object) (bjq1)));
	//   84  178:aload_0         
	//   85  179:getfield        #80  <Field LinkedList l>
	//   86  182:aload           7
	//   87  184:invokevirtual   #258 <Method boolean LinkedList.add(Object)>
	//   88  187:pop             
			}
			l1 = j.a(((bmz) (obj)), ((bmx) (this)), i);
	//   89  188:aload_0         
	//   90  189:getfield        #70  <Field bmw j>
	//   91  192:aload           6
	//   92  194:aload_0         
	//   93  195:aload_0         
	//   94  196:getfield        #61  <Field int i>
	//   95  199:invokevirtual   #261 <Method long bmw.a(bmz, bmx, int)>
	//   96  202:lstore_1        
			h.a(((bjs) (obj)).a, ((bjs) (obj)).b, c, ((bjs) (obj)).c, ((bjs) (obj)).d, ((bjs) (obj)).e, ((bjs) (obj)).f, ((bjs) (obj)).g, l1);
	//   97  203:aload_0         
	//   98  204:getfield        #59  <Field bif h>
	//   99  207:aload           6
	//  100  209:getfield        #193 <Field bmp bjs.a>
	//  101  212:aload           6
	//  102  214:getfield        #195 <Field int bjs.b>
	//  103  217:aload_0         
	//  104  218:getfield        #51  <Field int c>
	//  105  221:aload           6
	//  106  223:getfield        #196 <Field zzfs bjs.c>
	//  107  226:aload           6
	//  108  228:getfield        #197 <Field int bjs.d>
	//  109  231:aload           6
	//  110  233:getfield        #198 <Field Object bjs.e>
	//  111  236:aload           6
	//  112  238:getfield        #199 <Field long bjs.f>
	//  113  241:aload           6
	//  114  243:getfield        #201 <Field long bjs.g>
	//  115  246:lload_1         
	//  116  247:invokevirtual   #264 <Method void bif.a(bmp, int, int, zzfs, int, Object, long, long, long)>
			return true;
	//  117  250:iconst_1        
	//  118  251:ireturn         
		} else
		{
			return false;
	//  119  252:iconst_0        
	//  120  253:ireturn         
		}
	}

	public final void a_(long l1)
	{
		if(b && l1 > n.f())
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field boolean b>
	//*   2    4:ifeq            27
	//*   3    7:lload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #99  <Field bjf n>
	//*   6   12:invokevirtual   #268 <Method long bjf.f()>
	//*   7   15:lcmp            
	//*   8   16:ifle            27
		{
			n.g();
	//    9   19:aload_0         
	//   10   20:getfield        #99  <Field bjf n>
	//   11   23:invokevirtual   #270 <Method void bjf.g()>
			return;
	//   12   26:return          
		} else
		{
			n.a(l1, true);
	//   13   27:aload_0         
	//   14   28:getfield        #99  <Field bjf n>
	//   15   31:lload_1         
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #213 <Method boolean bjf.a(long, boolean)>
	//   18   36:pop             
			return;
	//   19   37:return          
		}
	}

	public final void b()
	{
		j.a(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field bmw j>
	//    2    4:ldc2            #271 <Int 0x80000000>
	//    3    7:invokevirtual   #272 <Method void bmw.a(int)>
		if(!j.a())
	//*   4   10:aload_0         
	//*   5   11:getfield        #70  <Field bmw j>
	//*   6   14:invokevirtual   #238 <Method boolean bmw.a()>
	//*   7   17:ifne            29
			f.a();
	//    8   20:aload_0         
	//    9   21:getfield        #55  <Field bjz f>
	//   10   24:invokeinterface #274 <Method void bjz.a()>
	//   11   29:return          
	}

	public final void b(long l1)
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		do
		{
			bjf abjf[] = o;
	//    2    2:aload_0         
	//    3    3:getfield        #92  <Field bjf[] o>
	//    4    6:astore          4
			if(i1 < abjf.length)
	//*   5    8:iload_3         
	//*   6    9:aload           4
	//*   7   11:arraylength     
	//*   8   12:icmpge          41
			{
				if(!e[i1])
	//*   9   15:aload_0         
	//*  10   16:getfield        #94  <Field boolean[] e>
	//*  11   19:iload_3         
	//*  12   20:baload          
	//*  13   21:ifne            34
					abjf[i1].a(l1, true);
	//   14   24:aload           4
	//   15   26:iload_3         
	//   16   27:aaload          
	//   17   28:lload_1         
	//   18   29:iconst_1        
	//   19   30:invokevirtual   #213 <Method boolean bjf.a(long, boolean)>
	//   20   33:pop             
				i1++;
	//   21   34:iload_3         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_3        
			} else
	//*  25   38:goto            2
			{
				return;
	//   26   41:return          
			}
		} while(true);
	}

	public final bjz c()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field bjz f>
	//    2    4:areturn         
	}

	public final void c(long l1)
	{
		boolean flag;
		int k1;
		int i2;
label0:
		{
			a = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #110 <Field long a>
			boolean flag1 = f();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #116 <Method boolean f()>
	//    5    9:istore          6
			i2 = 0;
	//    6   11:iconst_0        
	//    7   12:istore          5
			k1 = 0;
	//    8   14:iconst_0        
	//    9   15:istore          4
			if(!flag1)
	//*  10   17:iload           6
	//*  11   19:ifne            62
			{
				bjf bjf1 = n;
	//   12   22:aload_0         
	//   13   23:getfield        #99  <Field bjf n>
	//   14   26:astore          7
				boolean flag2;
				if(l1 < r_())
	//*  15   28:lload_1         
	//*  16   29:aload_0         
	//*  17   30:invokevirtual   #278 <Method long r_()>
	//*  18   33:lcmp            
	//*  19   34:ifge            43
					flag2 = true;
	//   20   37:iconst_1        
	//   21   38:istore          6
				else
	//*  22   40:goto            46
					flag2 = false;
	//   23   43:iconst_0        
	//   24   44:istore          6
				if(bjf1.a(l1, flag2))
	//*  25   46:aload           7
	//*  26   48:lload_1         
	//*  27   49:iload           6
	//*  28   51:invokevirtual   #213 <Method boolean bjf.a(long, boolean)>
	//*  29   54:ifeq            62
				{
					flag = true;
	//   30   57:iconst_1        
	//   31   58:istore_3        
					break label0;
	//   32   59:goto            64
				}
			}
			flag = false;
	//   33   62:iconst_0        
	//   34   63:istore_3        
		}
		if(flag)
	//*  35   64:iload_3         
	//*  36   65:ifeq            153
		{
			for(; l.size() > 1 && ((bjq)l.get(1)).a(0) <= n.d(); l.removeFirst());
	//   37   68:aload_0         
	//   38   69:getfield        #80  <Field LinkedList l>
	//   39   72:invokevirtual   #125 <Method int LinkedList.size()>
	//   40   75:iconst_1        
	//   41   76:icmple          115
	//   42   79:aload_0         
	//   43   80:getfield        #80  <Field LinkedList l>
	//   44   83:iconst_1        
	//   45   84:invokevirtual   #129 <Method Object LinkedList.get(int)>
	//   46   87:checkcast       #131 <Class bjq>
	//   47   90:iconst_0        
	//   48   91:invokevirtual   #134 <Method int bjq.a(int)>
	//   49   94:aload_0         
	//   50   95:getfield        #99  <Field bjf n>
	//   51   98:invokevirtual   #119 <Method int bjf.d()>
	//   52  101:icmpgt          115
	//   53  104:aload_0         
	//   54  105:getfield        #80  <Field LinkedList l>
	//   55  108:invokevirtual   #138 <Method Object LinkedList.removeFirst()>
	//   56  111:pop             
	//*  57  112:goto            68
			bjf abjf[] = o;
	//   58  115:aload_0         
	//   59  116:getfield        #92  <Field bjf[] o>
	//   60  119:astore          7
			i2 = abjf.length;
	//   61  121:aload           7
	//   62  123:arraylength     
	//   63  124:istore          5
			for(int i1 = k1; i1 < i2; i1++)
	//*  64  126:iload           4
	//*  65  128:istore_3        
	//*  66  129:iload_3         
	//*  67  130:iload           5
	//*  68  132:icmpge          152
				abjf[i1].a(l1, true);
	//   69  135:aload           7
	//   70  137:iload_3         
	//   71  138:aaload          
	//   72  139:lload_1         
	//   73  140:iconst_1        
	//   74  141:invokevirtual   #213 <Method boolean bjf.a(long, boolean)>
	//   75  144:pop             

	//   76  145:iload_3         
	//   77  146:iconst_1        
	//   78  147:iadd            
	//   79  148:istore_3        
	//*  80  149:goto            129
			return;
	//   81  152:return          
		}
		r = l1;
	//   82  153:aload_0         
	//   83  154:lload_1         
	//   84  155:putfield        #108 <Field long r>
		b = false;
	//   85  158:aload_0         
	//   86  159:iconst_0        
	//   87  160:putfield        #165 <Field boolean b>
		l.clear();
	//   88  163:aload_0         
	//   89  164:getfield        #80  <Field LinkedList l>
	//   90  167:invokevirtual   #281 <Method void LinkedList.clear()>
		if(j.a())
	//*  91  170:aload_0         
	//*  92  171:getfield        #70  <Field bmw j>
	//*  93  174:invokevirtual   #238 <Method boolean bmw.a()>
	//*  94  177:ifeq            188
		{
			j.b();
	//   95  180:aload_0         
	//   96  181:getfield        #70  <Field bmw j>
	//   97  184:invokevirtual   #283 <Method void bmw.b()>
			return;
	//   98  187:return          
		}
		n.a(true);
	//   99  188:aload_0         
	//  100  189:getfield        #99  <Field bjf n>
	//  101  192:iconst_1        
	//  102  193:invokevirtual   #233 <Method void bjf.a(boolean)>
		bjf abjf1[] = o;
	//  103  196:aload_0         
	//  104  197:getfield        #92  <Field bjf[] o>
	//  105  200:astore          7
		k1 = abjf1.length;
	//  106  202:aload           7
	//  107  204:arraylength     
	//  108  205:istore          4
		for(int j1 = i2; j1 < k1; j1++)
	//* 109  207:iload           5
	//* 110  209:istore_3        
	//* 111  210:iload_3         
	//* 112  211:iload           4
	//* 113  213:icmpge          231
			abjf1[j1].a(true);
	//  114  216:aload           7
	//  115  218:iload_3         
	//  116  219:aaload          
	//  117  220:iconst_1        
	//  118  221:invokevirtual   #233 <Method void bjf.a(boolean)>

	//  119  224:iload_3         
	//  120  225:iconst_1        
	//  121  226:iadd            
	//  122  227:istore_3        
	//* 123  228:goto            210
	//  124  231:return          
	}

	public final long d()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field boolean b>
	//*   2    4:ifeq            11
			return 0x0L;
	//    3    7:ldc2w           #284 <Long 0x0L>
	//    4   10:lreturn         
		if(f())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #116 <Method boolean f()>
	//*   7   15:ifeq            23
			return r;
	//    8   18:aload_0         
	//    9   19:getfield        #108 <Field long r>
	//   10   22:lreturn         
		long l2 = a;
	//   11   23:aload_0         
	//   12   24:getfield        #110 <Field long a>
	//   13   27:lstore_3        
		Object obj = ((Object) ((bjq)l.getLast()));
	//   14   28:aload_0         
	//   15   29:getfield        #80  <Field LinkedList l>
	//   16   32:invokevirtual   #241 <Method Object LinkedList.getLast()>
	//   17   35:checkcast       #131 <Class bjq>
	//   18   38:astore          5
		if(!((bkc) (obj)).g())
	//*  19   40:aload           5
	//*  20   42:invokevirtual   #287 <Method boolean bkc.g()>
	//*  21   45:ifeq            51
	//*  22   48:goto            91
			if(l.size() > 1)
	//*  23   51:aload_0         
	//*  24   52:getfield        #80  <Field LinkedList l>
	//*  25   55:invokevirtual   #125 <Method int LinkedList.size()>
	//*  26   58:iconst_1        
	//*  27   59:icmple          88
			{
				obj = ((Object) (l));
	//   28   62:aload_0         
	//   29   63:getfield        #80  <Field LinkedList l>
	//   30   66:astore          5
				obj = ((Object) ((bjq)((LinkedList) (obj)).get(((LinkedList) (obj)).size() - 2)));
	//   31   68:aload           5
	//   32   70:aload           5
	//   33   72:invokevirtual   #125 <Method int LinkedList.size()>
	//   34   75:iconst_2        
	//   35   76:isub            
	//   36   77:invokevirtual   #129 <Method Object LinkedList.get(int)>
	//   37   80:checkcast       #131 <Class bjq>
	//   38   83:astore          5
			} else
	//*  39   85:goto            91
			{
				obj = null;
	//   40   88:aconst_null     
	//   41   89:astore          5
			}
		long l1 = l2;
	//   42   91:lload_3         
	//   43   92:lstore_1        
		if(obj != null)
	//*  44   93:aload           5
	//*  45   95:ifnull          108
			l1 = Math.max(l2, ((bjq) (obj)).g);
	//   46   98:lload_3         
	//   47   99:aload           5
	//   48  101:getfield        #288 <Field long bjq.g>
	//   49  104:invokestatic    #294 <Method long Math.max(long, long)>
	//   50  107:lstore_1        
		return Math.max(l1, n.f());
	//   51  108:lload_1         
	//   52  109:aload_0         
	//   53  110:getfield        #99  <Field bjf n>
	//   54  113:invokevirtual   #268 <Method long bjf.f()>
	//   55  116:invokestatic    #294 <Method long Math.max(long, long)>
	//   56  119:lreturn         
	}

	public final void e()
	{
		n.b();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field bjf n>
	//    2    4:invokevirtual   #295 <Method void bjf.b()>
		bjf abjf[] = o;
	//    3    7:aload_0         
	//    4    8:getfield        #92  <Field bjf[] o>
	//    5   11:astore_3        
		int j1 = abjf.length;
	//    6   12:aload_3         
	//    7   13:arraylength     
	//    8   14:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          35
			abjf[i1].b();
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:invokevirtual   #295 <Method void bjf.b()>

	//   18   28:iload_1         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_1        
	//*  22   32:goto            17
		j.a(((Runnable) (null)));
	//   23   35:aload_0         
	//   24   36:getfield        #70  <Field bmw j>
	//   25   39:aconst_null     
	//   26   40:invokevirtual   #298 <Method void bmw.a(Runnable)>
	//   27   43:return          
	}

	final boolean f()
	{
		return r != 0x1L;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field long r>
	//    2    4:ldc2w           #244 <Long 0x1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final long r_()
	{
		if(f())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #116 <Method boolean f()>
	//*   2    4:ifeq            12
			return r;
	//    3    7:aload_0         
	//    4    8:getfield        #108 <Field long r>
	//    5   11:lreturn         
		if(b)
	//*   6   12:aload_0         
	//*   7   13:getfield        #165 <Field boolean b>
	//*   8   16:ifeq            23
			return 0x0L;
	//    9   19:ldc2w           #284 <Long 0x0L>
	//   10   22:lreturn         
		else
			return ((bjq)l.getLast()).g;
	//   11   23:aload_0         
	//   12   24:getfield        #80  <Field LinkedList l>
	//   13   27:invokevirtual   #241 <Method Object LinkedList.getLast()>
	//   14   30:checkcast       #131 <Class bjq>
	//   15   33:getfield        #288 <Field long bjq.g>
	//   16   36:lreturn         
	}

	long a;
	boolean b;
	private final int c;
	private final int d[];
	private final boolean e[];
	private final bjz f;
	private final bjk g;
	private final bif h;
	private final int i;
	private final bmw j = new bmw("Loader:ChunkSampleStream");
	private final bjw k = new bjw();
	private final LinkedList l = new LinkedList();
	private final List m;
	private final bjf n;
	private final bjf o[];
	private final bjr p;
	private zzfs q;
	private long r;
}
