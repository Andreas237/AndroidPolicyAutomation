// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bjq, bnw, bfk, bmp, 
//			bml, bjr, bjt, bfm, 
//			bnf, bfo, zzfs

public final class bka extends bjq
{

	public bka(bml bml1, bmp bmp1, zzfs zzfs, int i, Object obj, long l1, 
			long l2, int i1, int j1, long l3, bjt bjt1)
	{
		super(bml1, bmp1, zzfs, i, obj, l1, l2, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:lload           6
	//    7   10:lload           8
	//    8   12:iload           10
	//    9   14:invokespecial   #19  <Method void bjq(bml, bmp, zzfs, int, Object, long, long, int)>
		j = j1;
	//   10   17:aload_0         
	//   11   18:iload           11
	//   12   20:putfield        #21  <Field int j>
		k = l3;
	//   13   23:aload_0         
	//   14   24:lload           12
	//   15   26:putfield        #23  <Field long k>
		l = bjt1;
	//   16   29:aload_0         
	//   17   30:aload           14
	//   18   32:putfield        #25  <Field bjt l>
	//   19   35:return          
	}

	public final void a()
	{
		n = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #30  <Field boolean n>
	//    3    5:return          
	}

	public final boolean b()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean n>
	//    2    4:ireturn         
	}

	public final void c()
	{
		Object obj = ((Object) (bnw.a(a, m)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field bmp a>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field int m>
	//    4    8:invokestatic    #43  <Method bmp bnw.a(bmp, int)>
	//    5   11:astore_3        
		obj = ((Object) (new bfk(h, ((bmp) (obj)).c, h.a(((bmp) (obj))))));
	//    6   12:new             #45  <Class bfk>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field bml h>
	//   10   20:aload_3         
	//   11   21:getfield        #53  <Field long bmp.c>
	//   12   24:aload_0         
	//   13   25:getfield        #49  <Field bml h>
	//   14   28:aload_3         
	//   15   29:invokeinterface #58  <Method long bml.a(bmp)>
	//   16   34:invokespecial   #61  <Method void bfk(bml, long, long)>
	//   17   37:astore_3        
		if(m == 0)
	//*  18   38:aload_0         
	//*  19   39:getfield        #38  <Field int m>
	//*  20   42:ifne            69
		{
			bjr bjr1 = ((bjq)this).d();
	//   21   45:aload_0         
	//   22   46:invokevirtual   #65  <Method bjr bjq.d()>
	//   23   49:astore          4
			bjr1.a(k);
	//   24   51:aload           4
	//   25   53:aload_0         
	//   26   54:getfield        #23  <Field long k>
	//   27   57:invokevirtual   #70  <Method void bjr.a(long)>
			l.a(((bjv) (bjr1)));
	//   28   60:aload_0         
	//   29   61:getfield        #25  <Field bjt l>
	//   30   64:aload           4
	//   31   66:invokevirtual   #75  <Method void bjt.a(bjv)>
		}
		bfm bfm1 = l.a;
	//   32   69:aload_0         
	//   33   70:getfield        #25  <Field bjt l>
	//   34   73:getfield        #78  <Field bfm bjt.a>
	//   35   76:astore          4
		int i;
		boolean flag;
		flag = false;
	//   36   78:iconst_0        
	//   37   79:istore_2        
		i = 0;
	//   38   80:iconst_0        
	//   39   81:istore_1        
_L2:
		if(i != 0)
			break; /* Loop/switch isn't completed */
	//   40   82:iload_1         
	//   41   83:ifne            176
		if(n)
			break; /* Loop/switch isn't completed */
	//   42   86:aload_0         
	//   43   87:getfield        #30  <Field boolean n>
	//   44   90:ifne            176
		i = bfm1.a(((bfo) (obj)), ((bft) (null)));
	//   45   93:aload           4
	//   46   95:aload_3         
	//   47   96:aconst_null     
	//   48   97:invokeinterface #83  <Method int bfm.a(bfo, bft)>
	//   49  102:istore_1        
		if(true) goto _L2; else goto _L1
	//   50  103:goto            82
_L4:
		bnf.b(flag);
	//   51  106:iload_2         
	//   52  107:invokestatic    #88  <Method void bnf.b(boolean)>
		m = (int)(((bfo) (obj)).b() - a.c);
	//   53  110:aload_0         
	//   54  111:aload_3         
	//   55  112:invokeinterface #93  <Method long bfo.b()>
	//   56  117:aload_0         
	//   57  118:getfield        #36  <Field bmp a>
	//   58  121:getfield        #53  <Field long bmp.c>
	//   59  124:lsub            
	//   60  125:l2i             
	//   61  126:putfield        #38  <Field int m>
		bnw.a(h);
	//   62  129:aload_0         
	//   63  130:getfield        #49  <Field bml h>
	//   64  133:invokestatic    #96  <Method void bnw.a(bml)>
		o = true;
	//   65  136:aload_0         
	//   66  137:iconst_1        
	//   67  138:putfield        #98  <Field boolean o>
		return;
	//   68  141:return          
		Exception exception1;
		exception1;
	//   69  142:astore          4
		m = (int)(((bfo) (obj)).b() - a.c);
	//   70  144:aload_0         
	//   71  145:aload_3         
	//   72  146:invokeinterface #93  <Method long bfo.b()>
	//   73  151:aload_0         
	//   74  152:getfield        #36  <Field bmp a>
	//   75  155:getfield        #53  <Field long bmp.c>
	//   76  158:lsub            
	//   77  159:l2i             
	//   78  160:putfield        #38  <Field int m>
		throw exception1;
	//   79  163:aload           4
	//   80  165:athrow          
		Exception exception;
		exception;
	//   81  166:astore_3        
		bnw.a(h);
	//   82  167:aload_0         
	//   83  168:getfield        #49  <Field bml h>
	//   84  171:invokestatic    #96  <Method void bnw.a(bml)>
		throw exception;
	//   85  174:aload_3         
	//   86  175:athrow          
_L1:
		if(i != 1)
	//*  87  176:iload_1         
	//*  88  177:iconst_1        
	//*  89  178:icmpeq          106
			flag = true;
	//   90  181:iconst_1        
	//   91  182:istore_2        
		if(true) goto _L4; else goto _L3
	//   92  183:goto            106
_L3:
	}

	public final long e()
	{
		return (long)m;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int m>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public final int f()
	{
		return i + j;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int i>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int j>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public final boolean g()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean o>
	//    2    4:ireturn         
	}

	private final int j;
	private final long k;
	private final bjt l;
	private volatile int m;
	private volatile boolean n;
	private volatile boolean o;
}
