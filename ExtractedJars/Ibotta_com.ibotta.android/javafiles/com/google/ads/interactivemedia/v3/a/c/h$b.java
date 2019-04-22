// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.a.e.e;
import com.google.ads.interactivemedia.v3.a.e.f;
import com.google.ads.interactivemedia.v3.a.f.b;
import com.google.ads.interactivemedia.v3.a.f.q;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.c:
//			h, j, b, e, 
//			f

private static class h$b
	implements com.google.ads.interactivemedia.v3.a.e.l$c
{

	public void a()
	{
		g = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #64  <Field boolean g>
	//    3    5:return          
	}

	public boolean b()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean g>
	//    2    4:ireturn         
	}

	public void c()
		throws IOException, InterruptedException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L4:
		if(i != 0 || g)
			break; /* Loop/switch isn't completed */
	//    2    2:iload_1         
	//    3    3:ifne            257
	//    4    6:aload_0         
	//    5    7:getfield        #64  <Field boolean g>
	//    6   10:ifne            257
		long l1;
		long l2;
		l2 = f.a;
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field j f>
	//    9   17:getfield        #59  <Field long j.a>
	//   10   20:lstore          6
		l1 = b.a(new f(a, l2, -1L, ((String) (null))));
	//   11   22:aload_0         
	//   12   23:getfield        #41  <Field e b>
	//   13   26:new             #71  <Class f>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #37  <Field Uri a>
	//   17   34:lload           6
	//   18   36:ldc2w           #72  <Long -1L>
	//   19   39:aconst_null     
	//   20   40:invokespecial   #76  <Method void f(Uri, long, long, String)>
	//   21   43:invokeinterface #79  <Method long e.a(f)>
	//   22   48:lstore          4
		if(l1 != -1L)
	//*  23   50:lload           4
	//*  24   52:ldc2w           #72  <Long -1L>
	//*  25   55:lcmp            
	//*  26   56:ifeq            258
			l1 += l2;
	//   27   59:lload           4
	//   28   61:lload           6
	//   29   63:ladd            
	//   30   64:lstore          4
	//*  31   66:goto            69
		com.google.ads.interactivemedia.v3.a.c.b b1 = new com.google.ads.interactivemedia.v3.a.c.b(b, l2, l1);
	//   32   69:new             #81  <Class com.google.ads.interactivemedia.v3.a.c.b>
	//   33   72:dup             
	//   34   73:aload_0         
	//   35   74:getfield        #41  <Field e b>
	//   36   77:lload           6
	//   37   79:lload           4
	//   38   81:invokespecial   #84  <Method void com.google.ads.interactivemedia.v3.a.c.b(e, long, long)>
	//   39   84:astore          9
		int l = i;
	//   40   86:iload_1         
	//   41   87:istore_3        
		com.google.ads.interactivemedia.v3.a.c.e e1 = c.a(((com.google.ads.interactivemedia.v3.a.c.f) (b1)));
	//   42   88:aload_0         
	//   43   89:getfield        #45  <Field h$c c>
	//   44   92:aload           9
	//   45   94:invokevirtual   #87  <Method com.google.ads.interactivemedia.v3.a.c.e h$c.a(com.google.ads.interactivemedia.v3.a.c.f)>
	//   46   97:astore          8
		int k;
		k = i;
	//   47   99:iload_1         
	//   48  100:istore_2        
		l = i;
	//   49  101:iload_1         
	//   50  102:istore_3        
		if(!h)
			break MISSING_BLOCK_LABEL_128;
	//   51  103:aload_0         
	//   52  104:getfield        #61  <Field boolean h>
	//   53  107:ifeq            128
		l = i;
	//   54  110:iload_1         
	//   55  111:istore_3        
		e1.b();
	//   56  112:aload           8
	//   57  114:invokeinterface #91  <Method void com.google.ads.interactivemedia.v3.a.c.e.b()>
		l = i;
	//   58  119:iload_1         
	//   59  120:istore_3        
		h = false;
	//   60  121:aload_0         
	//   61  122:iconst_0        
	//   62  123:putfield        #61  <Field boolean h>
		k = i;
	//   63  126:iload_1         
	//   64  127:istore_2        
_L2:
		if(k != 0)
			break; /* Loop/switch isn't completed */
	//   65  128:iload_2         
	//   66  129:ifne            175
		l = k;
	//   67  132:iload_2         
	//   68  133:istore_3        
		if(g)
			break; /* Loop/switch isn't completed */
	//   69  134:aload_0         
	//   70  135:getfield        #64  <Field boolean g>
	//   71  138:ifne            175
		l = k;
	//   72  141:iload_2         
	//   73  142:istore_3        
		d.b(e);
	//   74  143:aload_0         
	//   75  144:getfield        #49  <Field com.google.ads.interactivemedia.v3.a.e.b d>
	//   76  147:aload_0         
	//   77  148:getfield        #51  <Field int e>
	//   78  151:invokeinterface #94  <Method void com.google.ads.interactivemedia.v3.a.e.b.b(int)>
		l = k;
	//   79  156:iload_2         
	//   80  157:istore_3        
		k = e1.a(((com.google.ads.interactivemedia.v3.a.c.f) (b1)), f);
	//   81  158:aload           8
	//   82  160:aload           9
	//   83  162:aload_0         
	//   84  163:getfield        #56  <Field j f>
	//   85  166:invokeinterface #97  <Method int e.a(com.google.ads.interactivemedia.v3.a.c.f, j)>
	//   86  171:istore_2        
		if(true) goto _L2; else goto _L1
	//   87  172:goto            128
_L1:
		if(k == 1)
	//*  88  175:iload_2         
	//*  89  176:iconst_1        
	//*  90  177:icmpne          185
		{
			i = 0;
	//   91  180:iconst_0        
	//   92  181:istore_1        
		} else
	//*  93  182:goto            201
		{
			f.a = ((com.google.ads.interactivemedia.v3.a.c.f) (b1)).c();
	//   94  185:aload_0         
	//   95  186:getfield        #56  <Field j f>
	//   96  189:aload           9
	//   97  191:invokeinterface #102 <Method long f.c()>
	//   98  196:putfield        #59  <Field long j.a>
			i = k;
	//   99  199:iload_2         
	//  100  200:istore_1        
		}
		q.a(b);
	//  101  201:aload_0         
	//  102  202:getfield        #41  <Field e b>
	//  103  205:invokestatic    #107 <Method void q.a(e)>
		if(true) goto _L4; else goto _L3
	//  104  208:goto            2
		Exception exception;
		exception;
	//  105  211:astore          8
		i = l;
	//  106  213:iload_3         
	//  107  214:istore_1        
		break MISSING_BLOCK_LABEL_223;
	//  108  215:goto            223
		exception;
	//  109  218:astore          8
		b1 = null;
	//  110  220:aconst_null     
	//  111  221:astore          9
		if(i != 1 && b1 != null)
	//* 112  223:iload_1         
	//* 113  224:iconst_1        
	//* 114  225:icmpeq          247
	//* 115  228:aload           9
	//* 116  230:ifnull          247
			f.a = ((com.google.ads.interactivemedia.v3.a.c.f) (b1)).c();
	//  117  233:aload_0         
	//  118  234:getfield        #56  <Field j f>
	//  119  237:aload           9
	//  120  239:invokeinterface #102 <Method long f.c()>
	//  121  244:putfield        #59  <Field long j.a>
		q.a(b);
	//  122  247:aload_0         
	//  123  248:getfield        #41  <Field e b>
	//  124  251:invokestatic    #107 <Method void q.a(e)>
		throw exception;
	//  125  254:aload           8
	//  126  256:athrow          
_L3:
	//  127  257:return          
	//* 128  258:goto            69
	}

	private final Uri a;
	private final e b;
	private final h$c c;
	private final com.google.ads.interactivemedia.v3.a.e.b d;
	private final int e;
	private final j f = new j();
	private volatile boolean g;
	private boolean h;

	public h$b(Uri uri, e e1, h$c h$c1, com.google.ads.interactivemedia.v3.a.e.b b1, int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = (Uri)com.google.ads.interactivemedia.v3.a.f.b.a(((Object) (uri)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #33  <Method Object b.a(Object)>
	//    5    9:checkcast       #35  <Class Uri>
	//    6   12:putfield        #37  <Field Uri a>
		b = (e)com.google.ads.interactivemedia.v3.a.f.b.a(((Object) (e1)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #33  <Method Object b.a(Object)>
	//   10   20:checkcast       #39  <Class e>
	//   11   23:putfield        #41  <Field e b>
		c = (h$c)com.google.ads.interactivemedia.v3.a.f.b.a(((Object) (h$c1)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #33  <Method Object b.a(Object)>
	//   15   31:checkcast       #43  <Class h$c>
	//   16   34:putfield        #45  <Field h$c c>
		d = (com.google.ads.interactivemedia.v3.a.e.b)com.google.ads.interactivemedia.v3.a.f.b.a(((Object) (b1)));
	//   17   37:aload_0         
	//   18   38:aload           4
	//   19   40:invokestatic    #33  <Method Object b.a(Object)>
	//   20   43:checkcast       #47  <Class com.google.ads.interactivemedia.v3.a.e.b>
	//   21   46:putfield        #49  <Field com.google.ads.interactivemedia.v3.a.e.b d>
		e = i;
	//   22   49:aload_0         
	//   23   50:iload           5
	//   24   52:putfield        #51  <Field int e>
	//   25   55:aload_0         
	//   26   56:new             #53  <Class j>
	//   27   59:dup             
	//   28   60:invokespecial   #54  <Method void j()>
	//   29   63:putfield        #56  <Field j f>
		f.a = l;
	//   30   66:aload_0         
	//   31   67:getfield        #56  <Field j f>
	//   32   70:lload           6
	//   33   72:putfield        #59  <Field long j.a>
		h = true;
	//   34   75:aload_0         
	//   35   76:iconst_1        
	//   36   77:putfield        #61  <Field boolean h>
	//   37   80:return          
	}
}
