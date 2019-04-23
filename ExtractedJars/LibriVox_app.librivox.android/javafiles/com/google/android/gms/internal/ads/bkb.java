// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bjs, bnw, bfk, bmp, 
//			bml, bjt, bfm, bnf, 
//			bfo, zzfs

public final class bkb extends bjs
{

	public bkb(bml bml1, bmp bmp1, zzfs zzfs, int l, Object obj, bjt bjt1)
	{
		super(bml1, bmp1, 2, zzfs, l, obj, 0x1L, 0x1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:aload_3         
	//    5    5:iload           4
	//    6    7:aload           5
	//    7    9:ldc2w           #13  <Long 0x1L>
	//    8   12:ldc2w           #13  <Long 0x1L>
	//    9   15:invokespecial   #17  <Method void bjs(bml, bmp, int, zzfs, int, Object, long, long)>
		i = bjt1;
	//   10   18:aload_0         
	//   11   19:aload           6
	//   12   21:putfield        #19  <Field bjt i>
	//   13   24:return          
	}

	public final void a()
	{
		k = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #24  <Field boolean k>
	//    3    5:return          
	}

	public final boolean b()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean k>
	//    2    4:ireturn         
	}

	public final void c()
	{
		Object obj = ((Object) (bnw.a(a, j)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field bmp a>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field int j>
	//    4    8:invokestatic    #37  <Method bmp bnw.a(bmp, int)>
	//    5   11:astore_3        
		obj = ((Object) (new bfk(h, ((bmp) (obj)).c, h.a(((bmp) (obj))))));
	//    6   12:new             #39  <Class bfk>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field bml h>
	//   10   20:aload_3         
	//   11   21:getfield        #48  <Field long bmp.c>
	//   12   24:aload_0         
	//   13   25:getfield        #43  <Field bml h>
	//   14   28:aload_3         
	//   15   29:invokeinterface #53  <Method long bml.a(bmp)>
	//   16   34:invokespecial   #56  <Method void bfk(bml, long, long)>
	//   17   37:astore_3        
		if(j == 0)
	//*  18   38:aload_0         
	//*  19   39:getfield        #32  <Field int j>
	//*  20   42:ifne            53
			i.a(((bjv) (null)));
	//   21   45:aload_0         
	//   22   46:getfield        #19  <Field bjt i>
	//   23   49:aconst_null     
	//   24   50:invokevirtual   #61  <Method void bjt.a(bjv)>
		bfm bfm1 = i.a;
	//   25   53:aload_0         
	//   26   54:getfield        #19  <Field bjt i>
	//   27   57:getfield        #64  <Field bfm bjt.a>
	//   28   60:astore          4
		int l = 0;
	//   29   62:iconst_0        
	//   30   63:istore_1        
_L2:
		if(l != 0)
			break; /* Loop/switch isn't completed */
	//   31   64:iload_1         
	//   32   65:ifne            153
		if(k)
			break; /* Loop/switch isn't completed */
	//   33   68:aload_0         
	//   34   69:getfield        #24  <Field boolean k>
	//   35   72:ifne            153
		l = bfm1.a(((bfo) (obj)), ((bft) (null)));
	//   36   75:aload           4
	//   37   77:aload_3         
	//   38   78:aconst_null     
	//   39   79:invokeinterface #69  <Method int bfm.a(bfo, bft)>
	//   40   84:istore_1        
		if(true) goto _L2; else goto _L1
	//   41   85:goto            64
_L4:
		boolean flag;
		bnf.b(flag);
	//   42   88:iload_2         
	//   43   89:invokestatic    #74  <Method void bnf.b(boolean)>
		j = (int)(((bfo) (obj)).b() - a.c);
	//   44   92:aload_0         
	//   45   93:aload_3         
	//   46   94:invokeinterface #79  <Method long bfo.b()>
	//   47   99:aload_0         
	//   48  100:getfield        #30  <Field bmp a>
	//   49  103:getfield        #48  <Field long bmp.c>
	//   50  106:lsub            
	//   51  107:l2i             
	//   52  108:putfield        #32  <Field int j>
		bnw.a(h);
	//   53  111:aload_0         
	//   54  112:getfield        #43  <Field bml h>
	//   55  115:invokestatic    #82  <Method void bnw.a(bml)>
		return;
	//   56  118:return          
		Exception exception1;
		exception1;
	//   57  119:astore          4
		j = (int)(((bfo) (obj)).b() - a.c);
	//   58  121:aload_0         
	//   59  122:aload_3         
	//   60  123:invokeinterface #79  <Method long bfo.b()>
	//   61  128:aload_0         
	//   62  129:getfield        #30  <Field bmp a>
	//   63  132:getfield        #48  <Field long bmp.c>
	//   64  135:lsub            
	//   65  136:l2i             
	//   66  137:putfield        #32  <Field int j>
		throw exception1;
	//   67  140:aload           4
	//   68  142:athrow          
		Exception exception;
		exception;
	//   69  143:astore_3        
		bnw.a(h);
	//   70  144:aload_0         
	//   71  145:getfield        #43  <Field bml h>
	//   72  148:invokestatic    #82  <Method void bnw.a(bml)>
		throw exception;
	//   73  151:aload_3         
	//   74  152:athrow          
_L1:
		flag = true;
	//   75  153:iconst_1        
	//   76  154:istore_2        
		if(l == 1)
	//*  77  155:iload_1         
	//*  78  156:iconst_1        
	//*  79  157:icmpeq          163
	//*  80  160:goto            88
			flag = false;
	//   81  163:iconst_0        
	//   82  164:istore_2        
		if(true) goto _L4; else goto _L3
	//   83  165:goto            88
_L3:
	}

	public final long e()
	{
		return (long)j;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int j>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	private final bjt i;
	private volatile int j;
	private volatile boolean k;
}
