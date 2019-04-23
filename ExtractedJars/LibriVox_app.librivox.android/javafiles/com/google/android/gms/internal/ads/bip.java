// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfp, biz, bjh, bmx, 
//			bmw, biv, bnh, biq, 
//			bir, biu, bjf, bjm, 
//			bfu, zzfs, bnk, bjo, 
//			bjl, bjc, bja, bnf, 
//			bit, bjp, biw, bmc, 
//			bis, bml, biy, bmj, 
//			bfm, bdg, bfc, bmz, 
//			bji, bfw

final class bip
	implements bfp, biz, bjh, bmx
{

	public bip(Uri uri, bml bml, bfm abfm[], int i1, Handler handler, biy biy, bjc bjc1, 
			bmj bmj, String s1, int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		a = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #72  <Field Uri a>
		b = bml;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #74  <Field bml b>
		c = i1;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #76  <Field int c>
		d = handler;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #78  <Field Handler d>
		e = biy;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #80  <Field biy e>
		f = bjc1;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #82  <Field bjc f>
		g = bmj;
	//   20   38:aload_0         
	//   21   39:aload           8
	//   22   41:putfield        #84  <Field bmj g>
		h = s1;
	//   23   44:aload_0         
	//   24   45:aload           9
	//   25   47:putfield        #86  <Field String h>
		i = j1;
	//   26   50:aload_0         
	//   27   51:iload           10
	//   28   53:i2l             
	//   29   54:putfield        #88  <Field long i>
	//   30   57:aload_0         
	//   31   58:new             #90  <Class bmw>
	//   32   61:dup             
	//   33   62:ldc1            #92  <String "Loader:ExtractorMediaPeriod">
	//   34   64:invokespecial   #95  <Method void bmw(String)>
	//   35   67:putfield        #97  <Field bmw j>
		k = new biv(abfm, ((bfp) (this)));
	//   36   70:aload_0         
	//   37   71:new             #99  <Class biv>
	//   38   74:dup             
	//   39   75:aload_3         
	//   40   76:aload_0         
	//   41   77:invokespecial   #102 <Method void biv(bfm[], bfp)>
	//   42   80:putfield        #104 <Field biv k>
	//   43   83:aload_0         
	//   44   84:new             #106 <Class bnh>
	//   45   87:dup             
	//   46   88:invokespecial   #107 <Method void bnh()>
	//   47   91:putfield        #109 <Field bnh l>
	//   48   94:aload_0         
	//   49   95:new             #111 <Class biq>
	//   50   98:dup             
	//   51   99:aload_0         
	//   52  100:invokespecial   #114 <Method void biq(bip)>
	//   53  103:putfield        #116 <Field Runnable m>
	//   54  106:aload_0         
	//   55  107:new             #118 <Class bir>
	//   56  110:dup             
	//   57  111:aload_0         
	//   58  112:invokespecial   #119 <Method void bir(bip)>
	//   59  115:putfield        #121 <Field Runnable n>
	//   60  118:aload_0         
	//   61  119:new             #123 <Class Handler>
	//   62  122:dup             
	//   63  123:invokespecial   #124 <Method void Handler()>
	//   64  126:putfield        #126 <Field Handler o>
		E = 0x1L;
	//   65  129:aload_0         
	//   66  130:ldc2w           #127 <Long 0x1L>
	//   67  133:putfield        #130 <Field long E>
	//   68  136:aload_0         
	//   69  137:new             #132 <Class SparseArray>
	//   70  140:dup             
	//   71  141:invokespecial   #133 <Method void SparseArray()>
	//   72  144:putfield        #135 <Field SparseArray p>
		C = -1L;
	//   73  147:aload_0         
	//   74  148:ldc2w           #136 <Long -1L>
	//   75  151:putfield        #139 <Field long C>
	//   76  154:return          
	}

	static void a(bip bip1)
	{
		bip1.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void h()>
	//    2    4:return          
	}

	private final void a(biu biu1)
	{
		if(C == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field long C>
	//*   2    4:ldc2w           #136 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            19
			C = biu.a(biu1);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #148 <Method long biu.a(biu)>
	//    8   16:putfield        #139 <Field long C>
	//    9   19:return          
	}

	static boolean b(bip bip1)
	{
		return bip1.H;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field boolean H>
	//    2    4:ireturn         
	}

	static bja c(bip bip1)
	{
		return bip1.q;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field bja q>
	//    2    4:areturn         
	}

	static SparseArray d(bip bip1)
	{
		return bip1.p;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field SparseArray p>
	//    2    4:areturn         
	}

	static biy e(bip bip1)
	{
		return bip1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field biy e>
	//    2    4:areturn         
	}

	static String f(bip bip1)
	{
		return bip1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field String h>
	//    2    4:areturn         
	}

	static long g(bip bip1)
	{
		return bip1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field long i>
	//    2    4:lreturn         
	}

	static Runnable h(bip bip1)
	{
		return bip1.n;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Runnable n>
	//    2    4:areturn         
	}

	private final void h()
	{
		if(!H && !t && r != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field boolean H>
	//*   2    4:ifne            273
	//*   3    7:aload_0         
	//*   4    8:getfield        #161 <Field boolean t>
	//*   5   11:ifne            273
	//*   6   14:aload_0         
	//*   7   15:getfield        #163 <Field bfu r>
	//*   8   18:ifnull          273
		{
			if(!s)
	//*   9   21:aload_0         
	//*  10   22:getfield        #165 <Field boolean s>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			int k1 = p.size();
	//   13   29:aload_0         
	//   14   30:getfield        #135 <Field SparseArray p>
	//   15   33:invokevirtual   #169 <Method int SparseArray.size()>
	//   16   36:istore_2        
			for(int i1 = 0; i1 < k1; i1++)
	//*  17   37:iconst_0        
	//*  18   38:istore_1        
	//*  19   39:iload_1         
	//*  20   40:iload_2         
	//*  21   41:icmpge          69
				if(((bjf)p.valueAt(i1)).e() == null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #135 <Field SparseArray p>
	//*  24   48:iload_1         
	//*  25   49:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//*  26   52:checkcast       #175 <Class bjf>
	//*  27   55:invokevirtual   #178 <Method zzfs bjf.e()>
	//*  28   58:ifnonnull       62
					return;
	//   29   61:return          

	//   30   62:iload_1         
	//   31   63:iconst_1        
	//   32   64:iadd            
	//   33   65:istore_1        
	//*  34   66:goto            39
			l.b();
	//   35   69:aload_0         
	//   36   70:getfield        #109 <Field bnh l>
	//   37   73:invokevirtual   #181 <Method boolean bnh.b()>
	//   38   76:pop             
			bjm abjm[] = new bjm[k1];
	//   39   77:iload_2         
	//   40   78:anewarray       bjm[]
	//   41   81:astore          5
			A = new boolean[k1];
	//   42   83:aload_0         
	//   43   84:iload_2         
	//   44   85:newarray        boolean[]
	//   45   87:putfield        #185 <Field boolean[] A>
			z = new boolean[k1];
	//   46   90:aload_0         
	//   47   91:iload_2         
	//   48   92:newarray        boolean[]
	//   49   94:putfield        #187 <Field boolean[] z>
			y = r.b();
	//   50   97:aload_0         
	//   51   98:aload_0         
	//   52   99:getfield        #163 <Field bfu r>
	//   53  102:invokeinterface #192 <Method long bfu.b()>
	//   54  107:putfield        #194 <Field long y>
			int j1 = 0;
	//   55  110:iconst_0        
	//   56  111:istore_1        
			do
			{
				boolean flag1 = true;
	//   57  112:iconst_1        
	//   58  113:istore          4
				if(j1 < k1)
	//*  59  115:iload_1         
	//*  60  116:iload_2         
	//*  61  117:icmpge          214
				{
					Object obj = ((Object) (((bjf)p.valueAt(j1)).e()));
	//   62  120:aload_0         
	//   63  121:getfield        #135 <Field SparseArray p>
	//   64  124:iload_1         
	//   65  125:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   66  128:checkcast       #175 <Class bjf>
	//   67  131:invokevirtual   #178 <Method zzfs bjf.e()>
	//   68  134:astore          6
					abjm[j1] = new bjm(new zzfs[] {
						obj
					});
	//   69  136:aload           5
	//   70  138:iload_1         
	//   71  139:new             #183 <Class bjm>
	//   72  142:dup             
	//   73  143:iconst_1        
	//   74  144:anewarray       zzfs[]
	//   75  147:dup             
	//   76  148:iconst_0        
	//   77  149:aload           6
	//   78  151:aastore         
	//   79  152:invokespecial   #199 <Method void bjm(zzfs[])>
	//   80  155:aastore         
					obj = ((Object) (((zzfs) (obj)).e));
	//   81  156:aload           6
	//   82  158:getfield        #201 <Field String zzfs.e>
	//   83  161:astore          6
					boolean flag = flag1;
	//   84  163:iload           4
	//   85  165:istore_3        
					if(!bnk.b(((String) (obj))))
	//*  86  166:aload           6
	//*  87  168:invokestatic    #206 <Method boolean bnk.b(String)>
	//*  88  171:ifne            190
						if(bnk.a(((String) (obj))))
	//*  89  174:aload           6
	//*  90  176:invokestatic    #208 <Method boolean bnk.a(String)>
	//*  91  179:ifeq            188
							flag = flag1;
	//   92  182:iload           4
	//   93  184:istore_3        
						else
	//*  94  185:goto            190
							flag = false;
	//   95  188:iconst_0        
	//   96  189:istore_3        
					A[j1] = flag;
	//   97  190:aload_0         
	//   98  191:getfield        #185 <Field boolean[] A>
	//   99  194:iload_1         
	//  100  195:iload_3         
	//  101  196:bastore         
					B = flag | B;
	//  102  197:aload_0         
	//  103  198:iload_3         
	//  104  199:aload_0         
	//  105  200:getfield        #210 <Field boolean B>
	//  106  203:ior             
	//  107  204:putfield        #210 <Field boolean B>
					j1++;
	//  108  207:iload_1         
	//  109  208:iconst_1        
	//  110  209:iadd            
	//  111  210:istore_1        
				} else
	//* 112  211:goto            112
				{
					x = new bjo(abjm);
	//  113  214:aload_0         
	//  114  215:new             #212 <Class bjo>
	//  115  218:dup             
	//  116  219:aload           5
	//  117  221:invokespecial   #215 <Method void bjo(bjm[])>
	//  118  224:putfield        #217 <Field bjo x>
					t = true;
	//  119  227:aload_0         
	//  120  228:iconst_1        
	//  121  229:putfield        #161 <Field boolean t>
					f.a(((bdp) (new bjl(y, r.a()))), ((Object) (null)));
	//  122  232:aload_0         
	//  123  233:getfield        #82  <Field bjc f>
	//  124  236:new             #219 <Class bjl>
	//  125  239:dup             
	//  126  240:aload_0         
	//  127  241:getfield        #194 <Field long y>
	//  128  244:aload_0         
	//  129  245:getfield        #163 <Field bfu r>
	//  130  248:invokeinterface #221 <Method boolean bfu.a()>
	//  131  253:invokespecial   #224 <Method void bjl(long, boolean)>
	//  132  256:aconst_null     
	//  133  257:invokeinterface #229 <Method void bjc.a(bdp, Object)>
					q.a(((biz) (this)));
	//  134  262:aload_0         
	//  135  263:getfield        #154 <Field bja q>
	//  136  266:aload_0         
	//  137  267:invokeinterface #234 <Method void bja.a(biz)>
					return;
	//  138  272:return          
				}
			} while(true);
		} else
		{
			return;
	//  139  273:return          
		}
	}

	static Handler i(bip bip1)
	{
		return bip1.o;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Handler o>
	//    2    4:areturn         
	}

	private final void i()
	{
		int i1;
		biu biu1;
label0:
		{
			biu1 = new biu(this, a, b, k, l);
	//    0    0:new             #145 <Class biu>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field Uri a>
	//    5    9:aload_0         
	//    6   10:getfield        #74  <Field bml b>
	//    7   13:aload_0         
	//    8   14:getfield        #104 <Field biv k>
	//    9   17:aload_0         
	//   10   18:getfield        #109 <Field bnh l>
	//   11   21:invokespecial   #238 <Method void biu(bip, Uri, bml, biv, bnh)>
	//   12   24:astore          5
			if(t)
	//*  13   26:aload_0         
	//*  14   27:getfield        #161 <Field boolean t>
	//*  15   30:ifeq            104
			{
				bnf.b(l());
	//   16   33:aload_0         
	//   17   34:invokespecial   #240 <Method boolean l()>
	//   18   37:invokestatic    #245 <Method void bnf.b(boolean)>
				long l1 = y;
	//   19   40:aload_0         
	//   20   41:getfield        #194 <Field long y>
	//   21   44:lstore_3        
				if(l1 != 0x1L && E >= l1)
	//*  22   45:lload_3         
	//*  23   46:ldc2w           #127 <Long 0x1L>
	//*  24   49:lcmp            
	//*  25   50:ifeq            75
	//*  26   53:aload_0         
	//*  27   54:getfield        #130 <Field long E>
	//*  28   57:lload_3         
	//*  29   58:lcmp            
	//*  30   59:iflt            75
				{
					G = true;
	//   31   62:aload_0         
	//   32   63:iconst_1        
	//   33   64:putfield        #247 <Field boolean G>
					E = 0x1L;
	//   34   67:aload_0         
	//   35   68:ldc2w           #127 <Long 0x1L>
	//   36   71:putfield        #130 <Field long E>
					return;
	//   37   74:return          
				}
				biu1.a(r.b(E), E);
	//   38   75:aload           5
	//   39   77:aload_0         
	//   40   78:getfield        #163 <Field bfu r>
	//   41   81:aload_0         
	//   42   82:getfield        #130 <Field long E>
	//   43   85:invokeinterface #250 <Method long bfu.b(long)>
	//   44   90:aload_0         
	//   45   91:getfield        #130 <Field long E>
	//   46   94:invokevirtual   #253 <Method void biu.a(long, long)>
				E = 0x1L;
	//   47   97:aload_0         
	//   48   98:ldc2w           #127 <Long 0x1L>
	//   49  101:putfield        #130 <Field long E>
			}
			F = j();
	//   50  104:aload_0         
	//   51  105:aload_0         
	//   52  106:invokespecial   #255 <Method int j()>
	//   53  109:putfield        #257 <Field int F>
			int j1 = c;
	//   54  112:aload_0         
	//   55  113:getfield        #76  <Field int c>
	//   56  116:istore_2        
			i1 = j1;
	//   57  117:iload_2         
	//   58  118:istore_1        
			if(j1 != -1)
				break label0;
	//   59  119:iload_2         
	//   60  120:iconst_m1       
	//   61  121:icmpne          178
			if(t && C == -1L)
	//*  62  124:aload_0         
	//*  63  125:getfield        #161 <Field boolean t>
	//*  64  128:ifeq            176
	//*  65  131:aload_0         
	//*  66  132:getfield        #139 <Field long C>
	//*  67  135:ldc2w           #136 <Long -1L>
	//*  68  138:lcmp            
	//*  69  139:ifne            176
			{
				bfu bfu1 = r;
	//   70  142:aload_0         
	//   71  143:getfield        #163 <Field bfu r>
	//   72  146:astore          6
				if(bfu1 == null || bfu1.b() == 0x1L)
	//*  73  148:aload           6
	//*  74  150:ifnull          170
	//*  75  153:aload           6
	//*  76  155:invokeinterface #192 <Method long bfu.b()>
	//*  77  160:ldc2w           #127 <Long 0x1L>
	//*  78  163:lcmp            
	//*  79  164:ifeq            170
	//*  80  167:goto            176
				{
					i1 = 6;
	//   81  170:bipush          6
	//   82  172:istore_1        
					break label0;
	//   83  173:goto            178
				}
			}
			i1 = 3;
	//   84  176:iconst_3        
	//   85  177:istore_1        
		}
		j.a(((bmz) (biu1)), ((bmx) (this)), i1);
	//   86  178:aload_0         
	//   87  179:getfield        #97  <Field bmw j>
	//   88  182:aload           5
	//   89  184:aload_0         
	//   90  185:iload_1         
	//   91  186:invokevirtual   #260 <Method long bmw.a(bmz, bmx, int)>
	//   92  189:pop2            
	//   93  190:return          
	}

	private final int j()
	{
		int k1 = p.size();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field SparseArray p>
	//    2    4:invokevirtual   #169 <Method int SparseArray.size()>
	//    3    7:istore_3        
		int i1 = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		int j1 = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		for(; i1 < k1; i1++)
	//*   8   12:iload_1         
	//*   9   13:iload_3         
	//*  10   14:icmpge          41
			j1 += ((bjf)p.valueAt(i1)).a();
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #135 <Field SparseArray p>
	//   14   22:iload_1         
	//   15   23:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   16   26:checkcast       #175 <Class bjf>
	//   17   29:invokevirtual   #262 <Method int bjf.a()>
	//   18   32:iadd            
	//   19   33:istore_2        

	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
	//*  24   38:goto            12
		return j1;
	//   25   41:iload_2         
	//   26   42:ireturn         
	}

	private final long k()
	{
		int j1 = p.size();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field SparseArray p>
	//    2    4:invokevirtual   #169 <Method int SparseArray.size()>
	//    3    7:istore_2        
		long l1 = 0x0L;
	//    4    8:ldc2w           #263 <Long 0x0L>
	//    5   11:lstore_3        
		for(int i1 = 0; i1 < j1; i1++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          45
			l1 = Math.max(l1, ((bjf)p.valueAt(i1)).f());
	//   11   19:lload_3         
	//   12   20:aload_0         
	//   13   21:getfield        #135 <Field SparseArray p>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   16   28:checkcast       #175 <Class bjf>
	//   17   31:invokevirtual   #266 <Method long bjf.f()>
	//   18   34:invokestatic    #272 <Method long Math.max(long, long)>
	//   19   37:lstore_3        

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            14
		return l1;
	//   25   45:lload_3         
	//   26   46:lreturn         
	}

	private final boolean l()
	{
		return E != 0x1L;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field long E>
	//    2    4:ldc2w           #127 <Long 0x1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	final int a(int i1, bdg bdg, bfc bfc, boolean flag)
	{
		if(!v && !l())
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field boolean v>
	//*   2    4:ifne            44
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #240 <Method boolean l()>
	//*   5   11:ifeq            17
	//*   6   14:goto            44
			return ((bjf)p.valueAt(i1)).a(bdg, bfc, flag, G, D);
	//    7   17:aload_0         
	//    8   18:getfield        #135 <Field SparseArray p>
	//    9   21:iload_1         
	//   10   22:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   11   25:checkcast       #175 <Class bjf>
	//   12   28:aload_2         
	//   13   29:aload_3         
	//   14   30:iload           4
	//   15   32:aload_0         
	//   16   33:getfield        #247 <Field boolean G>
	//   17   36:aload_0         
	//   18   37:getfield        #277 <Field long D>
	//   19   40:invokevirtual   #280 <Method int bjf.a(bdg, bfc, boolean, boolean, long)>
	//   20   43:ireturn         
		else
			return -3;
	//   21   44:bipush          -3
	//   22   46:ireturn         
	}

	public final int a(bmz bmz, long l1, long l2, IOException ioexception)
	{
		bmz = ((bmz) ((biu)bmz));
	//    0    0:aload_1         
	//    1    1:checkcast       #145 <Class biu>
	//    2    4:astore_1        
		a(((biu) (bmz)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #283 <Method void a(biu)>
		Handler handler = d;
	//    6   10:aload_0         
	//    7   11:getfield        #78  <Field Handler d>
	//    8   14:astore          11
		if(handler != null && e != null)
	//*   9   16:aload           11
	//*  10   18:ifnull          44
	//*  11   21:aload_0         
	//*  12   22:getfield        #80  <Field biy e>
	//*  13   25:ifnull          44
			handler.post(((Runnable) (new bit(this, ioexception))));
	//   14   28:aload           11
	//   15   30:new             #285 <Class bit>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:aload           6
	//   19   37:invokespecial   #288 <Method void bit(bip, IOException)>
	//   20   40:invokevirtual   #292 <Method boolean Handler.post(Runnable)>
	//   21   43:pop             
		if(ioexception instanceof bjp)
	//*  22   44:aload           6
	//*  23   46:instanceof      #294 <Class bjp>
	//*  24   49:ifeq            54
			return 3;
	//   25   52:iconst_3        
	//   26   53:ireturn         
		boolean flag;
		if(j() > F)
	//*  27   54:aload_0         
	//*  28   55:invokespecial   #255 <Method int j()>
	//*  29   58:aload_0         
	//*  30   59:getfield        #257 <Field int F>
	//*  31   62:icmple          71
			flag = true;
	//   32   65:iconst_1        
	//   33   66:istore          7
		else
	//*  34   68:goto            74
			flag = false;
	//   35   71:iconst_0        
	//   36   72:istore          7
		if(C == -1L)
	//*  37   74:aload_0         
	//*  38   75:getfield        #139 <Field long C>
	//*  39   78:ldc2w           #136 <Long -1L>
	//*  40   81:lcmp            
	//*  41   82:ifne            207
		{
			ioexception = ((IOException) (r));
	//   42   85:aload_0         
	//   43   86:getfield        #163 <Field bfu r>
	//   44   89:astore          6
			if(ioexception == null || ((bfu) (ioexception)).b() == 0x1L)
	//*  45   91:aload           6
	//*  46   93:ifnull          110
	//*  47   96:aload           6
	//*  48   98:invokeinterface #192 <Method long bfu.b()>
	//*  49  103:ldc2w           #127 <Long 0x1L>
	//*  50  106:lcmp            
	//*  51  107:ifne            207
			{
				D = 0L;
	//   52  110:aload_0         
	//   53  111:lconst_0        
	//   54  112:putfield        #277 <Field long D>
				v = t;
	//   55  115:aload_0         
	//   56  116:aload_0         
	//   57  117:getfield        #161 <Field boolean t>
	//   58  120:putfield        #275 <Field boolean v>
				int j1 = p.size();
	//   59  123:aload_0         
	//   60  124:getfield        #135 <Field SparseArray p>
	//   61  127:invokevirtual   #169 <Method int SparseArray.size()>
	//   62  130:istore          9
				for(int i1 = 0; i1 < j1; i1++)
	//*  63  132:iconst_0        
	//*  64  133:istore          8
	//*  65  135:iload           8
	//*  66  137:iload           9
	//*  67  139:icmpge          201
				{
					ioexception = ((IOException) ((bjf)p.valueAt(i1)));
	//   68  142:aload_0         
	//   69  143:getfield        #135 <Field SparseArray p>
	//   70  146:iload           8
	//   71  148:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   72  151:checkcast       #175 <Class bjf>
	//   73  154:astore          6
					boolean flag1;
					if(t && !z[i1])
	//*  74  156:aload_0         
	//*  75  157:getfield        #161 <Field boolean t>
	//*  76  160:ifeq            182
	//*  77  163:aload_0         
	//*  78  164:getfield        #187 <Field boolean[] z>
	//*  79  167:iload           8
	//*  80  169:baload          
	//*  81  170:ifeq            176
	//*  82  173:goto            182
						flag1 = false;
	//   83  176:iconst_0        
	//   84  177:istore          10
					else
	//*  85  179:goto            185
						flag1 = true;
	//   86  182:iconst_1        
	//   87  183:istore          10
					((bjf) (ioexception)).a(flag1);
	//   88  185:aload           6
	//   89  187:iload           10
	//   90  189:invokevirtual   #296 <Method void bjf.a(boolean)>
				}

	//   91  192:iload           8
	//   92  194:iconst_1        
	//   93  195:iadd            
	//   94  196:istore          8
	//*  95  198:goto            135
				((biu) (bmz)).a(0L, 0L);
	//   96  201:aload_1         
	//   97  202:lconst_0        
	//   98  203:lconst_0        
	//   99  204:invokevirtual   #253 <Method void biu.a(long, long)>
			}
		}
		F = j();
	//  100  207:aload_0         
	//  101  208:aload_0         
	//  102  209:invokespecial   #255 <Method int j()>
	//  103  212:putfield        #257 <Field int F>
		return !flag ? 0 : 1;
	//  104  215:iload           7
	//  105  217:ifeq            222
	//  106  220:iconst_1        
	//  107  221:ireturn         
	//  108  222:iconst_0        
	//  109  223:ireturn         
	}

	public final long a(bmc abmc[], boolean aflag[], bji abji[], boolean aflag1[], long l1)
	{
		long l3;
label0:
		{
			bnf.b(t);
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field boolean t>
	//    2    4:invokestatic    #245 <Method void bnf.b(boolean)>
			boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore          10
			for(int i1 = 0; i1 < abmc.length; i1++)
	//*   5   10:iconst_0        
	//*   6   11:istore          7
	//*   7   13:iload           7
	//*   8   15:aload_1         
	//*   9   16:arraylength     
	//*  10   17:icmpge          110
				if(abji[i1] != null && (abmc[i1] == null || !aflag[i1]))
	//*  11   20:aload_3         
	//*  12   21:iload           7
	//*  13   23:aaload          
	//*  14   24:ifnull          101
	//*  15   27:aload_1         
	//*  16   28:iload           7
	//*  17   30:aaload          
	//*  18   31:ifnull          41
	//*  19   34:aload_2         
	//*  20   35:iload           7
	//*  21   37:baload          
	//*  22   38:ifne            101
				{
					int k1 = biw.a((biw)abji[i1]);
	//   23   41:aload_3         
	//   24   42:iload           7
	//   25   44:aaload          
	//   26   45:checkcast       #299 <Class biw>
	//   27   48:invokestatic    #302 <Method int biw.a(biw)>
	//   28   51:istore          8
					bnf.b(z[k1]);
	//   29   53:aload_0         
	//   30   54:getfield        #187 <Field boolean[] z>
	//   31   57:iload           8
	//   32   59:baload          
	//   33   60:invokestatic    #245 <Method void bnf.b(boolean)>
					w = w - 1;
	//   34   63:aload_0         
	//   35   64:aload_0         
	//   36   65:getfield        #304 <Field int w>
	//   37   68:iconst_1        
	//   38   69:isub            
	//   39   70:putfield        #304 <Field int w>
					z[k1] = false;
	//   40   73:aload_0         
	//   41   74:getfield        #187 <Field boolean[] z>
	//   42   77:iload           8
	//   43   79:iconst_0        
	//   44   80:bastore         
					((bjf)p.valueAt(k1)).b();
	//   45   81:aload_0         
	//   46   82:getfield        #135 <Field SparseArray p>
	//   47   85:iload           8
	//   48   87:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   49   90:checkcast       #175 <Class bjf>
	//   50   93:invokevirtual   #306 <Method void bjf.b()>
					abji[i1] = null;
	//   51   96:aload_3         
	//   52   97:iload           7
	//   53   99:aconst_null     
	//   54  100:aastore         
				}

	//   55  101:iload           7
	//   56  103:iconst_1        
	//   57  104:iadd            
	//   58  105:istore          7
	//*  59  107:goto            13
			int i2 = 0;
	//   60  110:iconst_0        
	//   61  111:istore          8
			int j1;
			int k2;
			for(j1 = 0; i2 < abmc.length; j1 = k2)
	//*  62  113:iconst_0        
	//*  63  114:istore          7
	//*  64  116:iload           8
	//*  65  118:aload_1         
	//*  66  119:arraylength     
	//*  67  120:icmpge          279
			{
				k2 = j1;
	//   68  123:iload           7
	//   69  125:istore          9
				if(abji[i2] == null)
	//*  70  127:aload_3         
	//*  71  128:iload           8
	//*  72  130:aaload          
	//*  73  131:ifnonnull       266
				{
					k2 = j1;
	//   74  134:iload           7
	//   75  136:istore          9
					if(abmc[i2] != null)
	//*  76  138:aload_1         
	//*  77  139:iload           8
	//*  78  141:aaload          
	//*  79  142:ifnull          266
					{
						aflag = ((boolean []) (abmc[i2]));
	//   80  145:aload_1         
	//   81  146:iload           8
	//   82  148:aaload          
	//   83  149:astore_2        
						boolean flag1;
						if(((bmc) (aflag)).b() == 1)
	//*  84  150:aload_2         
	//*  85  151:invokeinterface #310 <Method int bmc.b()>
	//*  86  156:iconst_1        
	//*  87  157:icmpne          166
							flag1 = true;
	//   88  160:iconst_1        
	//   89  161:istore          13
						else
	//*  90  163:goto            169
							flag1 = false;
	//   91  166:iconst_0        
	//   92  167:istore          13
						bnf.b(flag1);
	//   93  169:iload           13
	//   94  171:invokestatic    #245 <Method void bnf.b(boolean)>
						if(((bmc) (aflag)).b(0) == 0)
	//*  95  174:aload_2         
	//*  96  175:iconst_0        
	//*  97  176:invokeinterface #313 <Method int bmc.b(int)>
	//*  98  181:ifne            190
							flag1 = true;
	//   99  184:iconst_1        
	//  100  185:istore          13
						else
	//* 101  187:goto            193
							flag1 = false;
	//  102  190:iconst_0        
	//  103  191:istore          13
						bnf.b(flag1);
	//  104  193:iload           13
	//  105  195:invokestatic    #245 <Method void bnf.b(boolean)>
						j1 = x.a(((bmc) (aflag)).a());
	//  106  198:aload_0         
	//  107  199:getfield        #217 <Field bjo x>
	//  108  202:aload_2         
	//  109  203:invokeinterface #316 <Method bjm bmc.a()>
	//  110  208:invokevirtual   #319 <Method int bjo.a(bjm)>
	//  111  211:istore          7
						bnf.b(z[j1] ^ true);
	//  112  213:aload_0         
	//  113  214:getfield        #187 <Field boolean[] z>
	//  114  217:iload           7
	//  115  219:baload          
	//  116  220:iconst_1        
	//  117  221:ixor            
	//  118  222:invokestatic    #245 <Method void bnf.b(boolean)>
						w = w + 1;
	//  119  225:aload_0         
	//  120  226:aload_0         
	//  121  227:getfield        #304 <Field int w>
	//  122  230:iconst_1        
	//  123  231:iadd            
	//  124  232:putfield        #304 <Field int w>
						z[j1] = true;
	//  125  235:aload_0         
	//  126  236:getfield        #187 <Field boolean[] z>
	//  127  239:iload           7
	//  128  241:iconst_1        
	//  129  242:bastore         
						abji[i2] = ((bji) (new biw(this, j1)));
	//  130  243:aload_3         
	//  131  244:iload           8
	//  132  246:new             #299 <Class biw>
	//  133  249:dup             
	//  134  250:aload_0         
	//  135  251:iload           7
	//  136  253:invokespecial   #322 <Method void biw(bip, int)>
	//  137  256:aastore         
						aflag1[i2] = true;
	//  138  257:aload           4
	//  139  259:iload           8
	//  140  261:iconst_1        
	//  141  262:bastore         
						k2 = 1;
	//  142  263:iconst_1        
	//  143  264:istore          9
					}
				}
				i2++;
	//  144  266:iload           8
	//  145  268:iconst_1        
	//  146  269:iadd            
	//  147  270:istore          8
			}

	//  148  272:iload           9
	//  149  274:istore          7
	//* 150  276:goto            116
			if(!u)
	//* 151  279:aload_0         
	//* 152  280:getfield        #324 <Field boolean u>
	//* 153  283:ifne            339
			{
				int l2 = p.size();
	//  154  286:aload_0         
	//  155  287:getfield        #135 <Field SparseArray p>
	//  156  290:invokevirtual   #169 <Method int SparseArray.size()>
	//  157  293:istore          9
				for(int j2 = 0; j2 < l2; j2++)
	//* 158  295:iconst_0        
	//* 159  296:istore          8
	//* 160  298:iload           8
	//* 161  300:iload           9
	//* 162  302:icmpge          339
					if(!z[j2])
	//* 163  305:aload_0         
	//* 164  306:getfield        #187 <Field boolean[] z>
	//* 165  309:iload           8
	//* 166  311:baload          
	//* 167  312:ifne            330
						((bjf)p.valueAt(j2)).b();
	//  168  315:aload_0         
	//  169  316:getfield        #135 <Field SparseArray p>
	//  170  319:iload           8
	//  171  321:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//  172  324:checkcast       #175 <Class bjf>
	//  173  327:invokevirtual   #306 <Method void bjf.b()>

	//  174  330:iload           8
	//  175  332:iconst_1        
	//  176  333:iadd            
	//  177  334:istore          8
			}
	//* 178  336:goto            298
			if(w == 0)
	//* 179  339:aload_0         
	//* 180  340:getfield        #304 <Field int w>
	//* 181  343:ifne            379
			{
				v = false;
	//  182  346:aload_0         
	//  183  347:iconst_0        
	//  184  348:putfield        #275 <Field boolean v>
				l3 = l1;
	//  185  351:lload           5
	//  186  353:lstore          11
				if(j.a())
	//* 187  355:aload_0         
	//* 188  356:getfield        #97  <Field bmw j>
	//* 189  359:invokevirtual   #325 <Method boolean bmw.a()>
	//* 190  362:ifeq            454
				{
					j.b();
	//  191  365:aload_0         
	//  192  366:getfield        #97  <Field bmw j>
	//  193  369:invokevirtual   #326 <Method void bmw.b()>
					l3 = l1;
	//  194  372:lload           5
	//  195  374:lstore          11
				}
				break label0;
	//  196  376:goto            454
			}
			if(u)
	//* 197  379:aload_0         
	//* 198  380:getfield        #324 <Field boolean u>
	//* 199  383:ifeq            398
			{
				l3 = l1;
	//  200  386:lload           5
	//  201  388:lstore          11
				if(j1 == 0)
	//* 202  390:iload           7
	//* 203  392:ifeq            454
					break label0;
	//  204  395:goto            409
			} else
			{
				l3 = l1;
	//  205  398:lload           5
	//  206  400:lstore          11
				if(l1 == 0L)
					break label0;
	//  207  402:lload           5
	//  208  404:lconst_0        
	//  209  405:lcmp            
	//  210  406:ifeq            454
			}
			l1 = c(l1);
	//  211  409:aload_0         
	//  212  410:lload           5
	//  213  412:invokevirtual   #328 <Method long c(long)>
	//  214  415:lstore          5
			j1 = ((int) (flag));
	//  215  417:iload           10
	//  216  419:istore          7
			do
			{
				l3 = l1;
	//  217  421:lload           5
	//  218  423:lstore          11
				if(j1 >= abji.length)
					break;
	//  219  425:iload           7
	//  220  427:aload_3         
	//  221  428:arraylength     
	//  222  429:icmpge          454
				if(abji[j1] != null)
	//* 223  432:aload_3         
	//* 224  433:iload           7
	//* 225  435:aaload          
	//* 226  436:ifnull          445
					aflag1[j1] = true;
	//  227  439:aload           4
	//  228  441:iload           7
	//  229  443:iconst_1        
	//  230  444:bastore         
				j1++;
	//  231  445:iload           7
	//  232  447:iconst_1        
	//  233  448:iadd            
	//  234  449:istore          7
			} while(true);
	//  235  451:goto            421
		}
		u = true;
	//  236  454:aload_0         
	//  237  455:iconst_1        
	//  238  456:putfield        #324 <Field boolean u>
		return l3;
	//  239  459:lload           11
	//  240  461:lreturn         
	}

	public final bfw a(int i1, int j1)
	{
		bjf bjf2 = (bjf)p.get(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field SparseArray p>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #332 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #175 <Class bjf>
	//    5   11:astore          4
		bjf bjf1 = bjf2;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(bjf2 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       47
		{
			bjf1 = new bjf(g);
	//   10   21:new             #175 <Class bjf>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:getfield        #84  <Field bmj g>
	//   14   29:invokespecial   #335 <Method void bjf(bmj)>
	//   15   32:astore_3        
			bjf1.a(((bjh) (this)));
	//   16   33:aload_3         
	//   17   34:aload_0         
	//   18   35:invokevirtual   #338 <Method void bjf.a(bjh)>
			p.put(i1, ((Object) (bjf1)));
	//   19   38:aload_0         
	//   20   39:getfield        #135 <Field SparseArray p>
	//   21   42:iload_1         
	//   22   43:aload_3         
	//   23   44:invokevirtual   #342 <Method void SparseArray.put(int, Object)>
		}
		return ((bfw) (bjf1));
	//   24   47:aload_3         
	//   25   48:areturn         
	}

	public final void a()
	{
		s = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #165 <Field boolean s>
		o.post(m);
	//    3    5:aload_0         
	//    4    6:getfield        #126 <Field Handler o>
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field Runnable m>
	//    7   13:invokevirtual   #292 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	final void a(int i1, long l1)
	{
		bjf bjf1 = (bjf)p.valueAt(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field SparseArray p>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//    4    8:checkcast       #175 <Class bjf>
	//    5   11:astore          4
		if(G && l1 > bjf1.f())
	//*   6   13:aload_0         
	//*   7   14:getfield        #247 <Field boolean G>
	//*   8   17:ifeq            36
	//*   9   20:lload_2         
	//*  10   21:aload           4
	//*  11   23:invokevirtual   #266 <Method long bjf.f()>
	//*  12   26:lcmp            
	//*  13   27:ifle            36
		{
			bjf1.g();
	//   14   30:aload           4
	//   15   32:invokevirtual   #345 <Method void bjf.g()>
			return;
	//   16   35:return          
		} else
		{
			bjf1.a(l1, true);
	//   17   36:aload           4
	//   18   38:lload_2         
	//   19   39:iconst_1        
	//   20   40:invokevirtual   #348 <Method boolean bjf.a(long, boolean)>
	//   21   43:pop             
			return;
	//   22   44:return          
		}
	}

	public final void a(bfu bfu1)
	{
		r = bfu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #163 <Field bfu r>
		o.post(m);
	//    3    5:aload_0         
	//    4    6:getfield        #126 <Field Handler o>
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field Runnable m>
	//    7   13:invokevirtual   #292 <Method boolean Handler.post(Runnable)>
	//    8   16:pop             
	//    9   17:return          
	}

	public final void a(bja bja1, long l1)
	{
		q = bja1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field bja q>
		l.a();
	//    3    5:aload_0         
	//    4    6:getfield        #109 <Field bnh l>
	//    5    9:invokevirtual   #351 <Method boolean bnh.a()>
	//    6   12:pop             
		i();
	//    7   13:aload_0         
	//    8   14:invokespecial   #353 <Method void i()>
	//    9   17:return          
	}

	public final void a(bmz bmz, long l1, long l2)
	{
		a((biu)bmz);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #145 <Class biu>
	//    3    5:invokespecial   #283 <Method void a(biu)>
		G = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #247 <Field boolean G>
		if(y == 0x1L)
	//*   7   13:aload_0         
	//*   8   14:getfield        #194 <Field long y>
	//*   9   17:ldc2w           #127 <Long 0x1L>
	//*  10   20:lcmp            
	//*  11   21:ifne            83
		{
			l1 = k();
	//   12   24:aload_0         
	//   13   25:invokespecial   #356 <Method long k()>
	//   14   28:lstore_2        
			if(l1 == 0x0L)
	//*  15   29:lload_2         
	//*  16   30:ldc2w           #263 <Long 0x0L>
	//*  17   33:lcmp            
	//*  18   34:ifne            42
				l1 = 0L;
	//   19   37:lconst_0        
	//   20   38:lstore_2        
			else
	//*  21   39:goto            48
				l1 += 10000L;
	//   22   42:lload_2         
	//   23   43:ldc2w           #357 <Long 10000L>
	//   24   46:ladd            
	//   25   47:lstore_2        
			y = l1;
	//   26   48:aload_0         
	//   27   49:lload_2         
	//   28   50:putfield        #194 <Field long y>
			f.a(((bdp) (new bjl(y, r.a()))), ((Object) (null)));
	//   29   53:aload_0         
	//   30   54:getfield        #82  <Field bjc f>
	//   31   57:new             #219 <Class bjl>
	//   32   60:dup             
	//   33   61:aload_0         
	//   34   62:getfield        #194 <Field long y>
	//   35   65:aload_0         
	//   36   66:getfield        #163 <Field bfu r>
	//   37   69:invokeinterface #221 <Method boolean bfu.a()>
	//   38   74:invokespecial   #224 <Method void bjl(long, boolean)>
	//   39   77:aconst_null     
	//   40   78:invokeinterface #229 <Method void bjc.a(bdp, Object)>
		}
		q.a(((bjj) (this)));
	//   41   83:aload_0         
	//   42   84:getfield        #154 <Field bja q>
	//   43   87:aload_0         
	//   44   88:invokeinterface #361 <Method void bja.a(bjj)>
	//   45   93:return          
	}

	public final void a(bmz bmz, long l1, long l2, boolean flag)
	{
		a((biu)bmz);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #145 <Class biu>
	//    3    5:invokespecial   #283 <Method void a(biu)>
		if(!flag && w > 0)
	//*   4    8:iload           6
	//*   5   10:ifne            80
	//*   6   13:aload_0         
	//*   7   14:getfield        #304 <Field int w>
	//*   8   17:ifle            80
		{
			int j1 = p.size();
	//    9   20:aload_0         
	//   10   21:getfield        #135 <Field SparseArray p>
	//   11   24:invokevirtual   #169 <Method int SparseArray.size()>
	//   12   27:istore          8
			for(int i1 = 0; i1 < j1; i1++)
	//*  13   29:iconst_0        
	//*  14   30:istore          7
	//*  15   32:iload           7
	//*  16   34:iload           8
	//*  17   36:icmpge          70
				((bjf)p.valueAt(i1)).a(z[i1]);
	//   18   39:aload_0         
	//   19   40:getfield        #135 <Field SparseArray p>
	//   20   43:iload           7
	//   21   45:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   22   48:checkcast       #175 <Class bjf>
	//   23   51:aload_0         
	//   24   52:getfield        #187 <Field boolean[] z>
	//   25   55:iload           7
	//   26   57:baload          
	//   27   58:invokevirtual   #296 <Method void bjf.a(boolean)>

	//   28   61:iload           7
	//   29   63:iconst_1        
	//   30   64:iadd            
	//   31   65:istore          7
	//*  32   67:goto            32
			q.a(((bjj) (this)));
	//   33   70:aload_0         
	//   34   71:getfield        #154 <Field bja q>
	//   35   74:aload_0         
	//   36   75:invokeinterface #361 <Method void bja.a(bjj)>
		}
	//   37   80:return          
	}

	public final void a(zzfs zzfs1)
	{
		o.post(m);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Handler o>
	//    2    4:aload_0         
	//    3    5:getfield        #116 <Field Runnable m>
	//    4    8:invokevirtual   #292 <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	final boolean a(int i1)
	{
		return G || !l() && ((bjf)p.valueAt(i1)).c();
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field boolean G>
	//    2    4:ifne            36
	//    3    7:aload_0         
	//    4    8:invokespecial   #240 <Method boolean l()>
	//    5   11:ifne            34
	//    6   14:aload_0         
	//    7   15:getfield        #135 <Field SparseArray p>
	//    8   18:iload_1         
	//    9   19:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   10   22:checkcast       #175 <Class bjf>
	//   11   25:invokevirtual   #366 <Method boolean bjf.c()>
	//   12   28:ifeq            34
	//   13   31:goto            36
	//   14   34:iconst_0        
	//   15   35:ireturn         
	//   16   36:iconst_1        
	//   17   37:ireturn         
	}

	public final boolean a(long l1)
	{
		if(!G && (!t || w != 0))
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field boolean G>
	//*   2    4:ifne            50
	//*   3    7:aload_0         
	//*   4    8:getfield        #161 <Field boolean t>
	//*   5   11:ifeq            24
	//*   6   14:aload_0         
	//*   7   15:getfield        #304 <Field int w>
	//*   8   18:ifne            24
	//*   9   21:goto            50
		{
			boolean flag = l.a();
	//   10   24:aload_0         
	//   11   25:getfield        #109 <Field bnh l>
	//   12   28:invokevirtual   #351 <Method boolean bnh.a()>
	//   13   31:istore_3        
			if(!j.a())
	//*  14   32:aload_0         
	//*  15   33:getfield        #97  <Field bmw j>
	//*  16   36:invokevirtual   #325 <Method boolean bmw.a()>
	//*  17   39:ifne            48
			{
				i();
	//   18   42:aload_0         
	//   19   43:invokespecial   #353 <Method void i()>
				flag = true;
	//   20   46:iconst_1        
	//   21   47:istore_3        
			}
			return flag;
	//   22   48:iload_3         
	//   23   49:ireturn         
		} else
		{
			return false;
	//   24   50:iconst_0        
	//   25   51:ireturn         
		}
	}

	public final void b()
	{
		biv biv1 = k;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field biv k>
	//    2    4:astore_1        
		j.a(((Runnable) (new bis(this, biv1))));
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field bmw j>
	//    5    9:new             #369 <Class bis>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #372 <Method void bis(bip, biv)>
	//   10   18:invokevirtual   #375 <Method void bmw.a(Runnable)>
		o.removeCallbacksAndMessages(((Object) (null)));
	//   11   21:aload_0         
	//   12   22:getfield        #126 <Field Handler o>
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #379 <Method void Handler.removeCallbacksAndMessages(Object)>
		H = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #151 <Field boolean H>
	//   18   34:return          
	}

	public final void b(long l1)
	{
	//    0    0:return          
	}

	public final long c(long l1)
	{
		if(!r.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field bfu r>
	//*   2    4:invokeinterface #221 <Method boolean bfu.a()>
	//*   3    9:ifeq            15
	//*   4   12:goto            17
			l1 = 0L;
	//    5   15:lconst_0        
	//    6   16:lstore_1        
		D = l1;
	//    7   17:aload_0         
	//    8   18:lload_1         
	//    9   19:putfield        #277 <Field long D>
		int k1 = p.size();
	//   10   22:aload_0         
	//   11   23:getfield        #135 <Field SparseArray p>
	//   12   26:invokevirtual   #169 <Method int SparseArray.size()>
	//   13   29:istore          4
		boolean flag = l() ^ true;
	//   14   31:aload_0         
	//   15   32:invokespecial   #240 <Method boolean l()>
	//   16   35:iconst_1        
	//   17   36:ixor            
	//   18   37:istore          5
		for(int i1 = 0; flag && i1 < k1; i1++)
	//*  19   39:iconst_0        
	//*  20   40:istore_3        
	//*  21   41:iload           5
	//*  22   43:ifeq            86
	//*  23   46:iload_3         
	//*  24   47:iload           4
	//*  25   49:icmpge          86
			if(z[i1])
	//*  26   52:aload_0         
	//*  27   53:getfield        #187 <Field boolean[] z>
	//*  28   56:iload_3         
	//*  29   57:baload          
	//*  30   58:ifeq            79
				flag = ((bjf)p.valueAt(i1)).a(l1, false);
	//   31   61:aload_0         
	//   32   62:getfield        #135 <Field SparseArray p>
	//   33   65:iload_3         
	//   34   66:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   35   69:checkcast       #175 <Class bjf>
	//   36   72:lload_1         
	//   37   73:iconst_0        
	//   38   74:invokevirtual   #348 <Method boolean bjf.a(long, boolean)>
	//   39   77:istore          5

	//   40   79:iload_3         
	//   41   80:iconst_1        
	//   42   81:iadd            
	//   43   82:istore_3        
	//*  44   83:goto            41
		if(!flag)
	//*  45   86:iload           5
	//*  46   88:ifne            156
		{
			E = l1;
	//   47   91:aload_0         
	//   48   92:lload_1         
	//   49   93:putfield        #130 <Field long E>
			G = false;
	//   50   96:aload_0         
	//   51   97:iconst_0        
	//   52   98:putfield        #247 <Field boolean G>
			if(j.a())
	//*  53  101:aload_0         
	//*  54  102:getfield        #97  <Field bmw j>
	//*  55  105:invokevirtual   #325 <Method boolean bmw.a()>
	//*  56  108:ifeq            121
			{
				j.b();
	//   57  111:aload_0         
	//   58  112:getfield        #97  <Field bmw j>
	//   59  115:invokevirtual   #326 <Method void bmw.b()>
			} else
	//*  60  118:goto            156
			{
				for(int j1 = 0; j1 < k1; j1++)
	//*  61  121:iconst_0        
	//*  62  122:istore_3        
	//*  63  123:iload_3         
	//*  64  124:iload           4
	//*  65  126:icmpge          156
					((bjf)p.valueAt(j1)).a(z[j1]);
	//   66  129:aload_0         
	//   67  130:getfield        #135 <Field SparseArray p>
	//   68  133:iload_3         
	//   69  134:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   70  137:checkcast       #175 <Class bjf>
	//   71  140:aload_0         
	//   72  141:getfield        #187 <Field boolean[] z>
	//   73  144:iload_3         
	//   74  145:baload          
	//   75  146:invokevirtual   #296 <Method void bjf.a(boolean)>

	//   76  149:iload_3         
	//   77  150:iconst_1        
	//   78  151:iadd            
	//   79  152:istore_3        
			}
		}
	//*  80  153:goto            123
		v = false;
	//   81  156:aload_0         
	//   82  157:iconst_0        
	//   83  158:putfield        #275 <Field boolean v>
		return l1;
	//   84  161:lload_1         
	//   85  162:lreturn         
	}

	public final void c()
	{
		j.a(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field bmw j>
	//    2    4:ldc2            #381 <Int 0x80000000>
	//    3    7:invokevirtual   #384 <Method void bmw.a(int)>
	//    4   10:return          
	}

	public final bjo d()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field bjo x>
	//    2    4:areturn         
	}

	public final long e()
	{
		if(v)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field boolean v>
	//*   2    4:ifeq            17
		{
			v = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #275 <Field boolean v>
			return D;
	//    6   12:aload_0         
	//    7   13:getfield        #277 <Field long D>
	//    8   16:lreturn         
		} else
		{
			return 0x1L;
	//    9   17:ldc2w           #127 <Long 0x1L>
	//   10   20:lreturn         
		}
	}

	public final long f()
	{
		if(G)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field boolean G>
	//*   2    4:ifeq            11
			return 0x0L;
	//    3    7:ldc2w           #263 <Long 0x0L>
	//    4   10:lreturn         
		if(l())
	//*   5   11:aload_0         
	//*   6   12:invokespecial   #240 <Method boolean l()>
	//*   7   15:ifeq            23
			return E;
	//    8   18:aload_0         
	//    9   19:getfield        #130 <Field long E>
	//   10   22:lreturn         
		long l2;
		if(B)
	//*  11   23:aload_0         
	//*  12   24:getfield        #210 <Field boolean B>
	//*  13   27:ifeq            94
		{
			long l1 = 0xffffffffL;
	//   14   30:ldc2w           #386 <Long 0xffffffffL>
	//   15   33:lstore_3        
			int j1 = p.size();
	//   16   34:aload_0         
	//   17   35:getfield        #135 <Field SparseArray p>
	//   18   38:invokevirtual   #169 <Method int SparseArray.size()>
	//   19   41:istore_2        
			int i1 = 0;
	//   20   42:iconst_0        
	//   21   43:istore_1        
			do
			{
				l2 = l1;
	//   22   44:lload_3         
	//   23   45:lstore          5
				if(i1 >= j1)
					break;
	//   24   47:iload_1         
	//   25   48:iload_2         
	//   26   49:icmpge          100
				l2 = l1;
	//   27   52:lload_3         
	//   28   53:lstore          5
				if(A[i1])
	//*  29   55:aload_0         
	//*  30   56:getfield        #185 <Field boolean[] A>
	//*  31   59:iload_1         
	//*  32   60:baload          
	//*  33   61:ifeq            84
					l2 = Math.min(l1, ((bjf)p.valueAt(i1)).f());
	//   34   64:lload_3         
	//   35   65:aload_0         
	//   36   66:getfield        #135 <Field SparseArray p>
	//   37   69:iload_1         
	//   38   70:invokevirtual   #173 <Method Object SparseArray.valueAt(int)>
	//   39   73:checkcast       #175 <Class bjf>
	//   40   76:invokevirtual   #266 <Method long bjf.f()>
	//   41   79:invokestatic    #390 <Method long Math.min(long, long)>
	//   42   82:lstore          5
				i1++;
	//   43   84:iload_1         
	//   44   85:iconst_1        
	//   45   86:iadd            
	//   46   87:istore_1        
				l1 = l2;
	//   47   88:lload           5
	//   48   90:lstore_3        
			} while(true);
	//   49   91:goto            44
		} else
		{
			l2 = k();
	//   50   94:aload_0         
	//   51   95:invokespecial   #356 <Method long k()>
	//   52   98:lstore          5
		}
		if(l2 == 0x0L)
	//*  53  100:lload           5
	//*  54  102:ldc2w           #263 <Long 0x0L>
	//*  55  105:lcmp            
	//*  56  106:ifne            114
			return D;
	//   57  109:aload_0         
	//   58  110:getfield        #277 <Field long D>
	//   59  113:lreturn         
		else
			return l2;
	//   60  114:lload           5
	//   61  116:lreturn         
	}

	final void g()
	{
		j.a(0x80000000);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field bmw j>
	//    2    4:ldc2            #381 <Int 0x80000000>
	//    3    7:invokevirtual   #384 <Method void bmw.a(int)>
	//    4   10:return          
	}

	public final long r_()
	{
		if(w == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #304 <Field int w>
	//*   2    4:ifne            11
			return 0x0L;
	//    3    7:ldc2w           #263 <Long 0x0L>
	//    4   10:lreturn         
		else
			return f();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #392 <Method long f()>
	//    7   15:lreturn         
	}

	private boolean A[];
	private boolean B;
	private long C;
	private long D;
	private long E;
	private int F;
	private boolean G;
	private boolean H;
	private final Uri a;
	private final bml b;
	private final int c;
	private final Handler d;
	private final biy e;
	private final bjc f;
	private final bmj g;
	private final String h;
	private final long i;
	private final bmw j = new bmw("Loader:ExtractorMediaPeriod");
	private final biv k;
	private final bnh l = new bnh();
	private final Runnable m = new biq(this);
	private final Runnable n = new bir(this);
	private final Handler o = new Handler();
	private final SparseArray p = new SparseArray();
	private bja q;
	private bfu r;
	private boolean s;
	private boolean t;
	private boolean u;
	private boolean v;
	private int w;
	private bjo x;
	private long y;
	private boolean z[];
}
