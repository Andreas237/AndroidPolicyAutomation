// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bjq, bnw, bml, bfk, 
//			bjr, bfw, zzfs, bmp

public final class bkd extends bjq
{

	public bkd(bml bml1, bmp bmp, zzfs zzfs, int i, Object obj, long l1, 
			long l2, int i1, int j1, zzfs zzfs1)
	{
		super(bml1, bmp, zzfs, i, obj, l1, l2, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:lload           6
	//    7   10:lload           8
	//    8   12:iload           10
	//    9   14:invokespecial   #17  <Method void bjq(bml, bmp, zzfs, int, Object, long, long, int)>
		j = j1;
	//   10   17:aload_0         
	//   11   18:iload           11
	//   12   20:putfield        #19  <Field int j>
		k = zzfs1;
	//   13   23:aload_0         
	//   14   24:aload           12
	//   15   26:putfield        #21  <Field zzfs k>
	//   16   29:return          
	}

	public final void a()
	{
		m = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #26  <Field boolean m>
	//    3    5:return          
	}

	public final boolean b()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean m>
	//    2    4:ireturn         
	}

	public final void c()
	{
		Object obj = ((Object) (bnw.a(a, l)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field bmp a>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field int l>
	//    4    8:invokestatic    #39  <Method bmp bnw.a(bmp, int)>
	//    5   11:astore          5
		long l1 = h.a(((bmp) (obj)));
	//    6   13:aload_0         
	//    7   14:getfield        #43  <Field bml h>
	//    8   17:aload           5
	//    9   19:invokeinterface #48  <Method long bml.a(bmp)>
	//   10   24:lstore_3        
		if(l1 == -1L)
			break MISSING_BLOCK_LABEL_44;
	//   11   25:lload_3         
	//   12   26:ldc2w           #49  <Long -1L>
	//   13   29:lcmp            
	//   14   30:ifeq            178
		l1 += l;
	//   15   33:lload_3         
	//   16   34:aload_0         
	//   17   35:getfield        #34  <Field int l>
	//   18   38:i2l             
	//   19   39:ladd            
	//   20   40:lstore_3        
	//*  21   41:goto            44
		int j1;
		Object obj1;
		obj = ((Object) (new bfk(h, l, l1)));
	//   22   44:new             #52  <Class bfk>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:getfield        #43  <Field bml h>
	//   26   52:aload_0         
	//   27   53:getfield        #34  <Field int l>
	//   28   56:i2l             
	//   29   57:lload_3         
	//   30   58:invokespecial   #55  <Method void bfk(bml, long, long)>
	//   31   61:astore          5
		obj1 = ((Object) (((bjq)this).d()));
	//   32   63:aload_0         
	//   33   64:invokevirtual   #59  <Method bjr bjq.d()>
	//   34   67:astore          6
		((bjr) (obj1)).a(0L);
	//   35   69:aload           6
	//   36   71:lconst_0        
	//   37   72:invokevirtual   #64  <Method void bjr.a(long)>
		j1 = j;
	//   38   75:aload_0         
	//   39   76:getfield        #19  <Field int j>
	//   40   79:istore_2        
		int i = 0;
	//   41   80:iconst_0        
	//   42   81:istore_1        
		obj1 = ((Object) (((bjr) (obj1)).a(0, j1)));
	//   43   82:aload           6
	//   44   84:iconst_0        
	//   45   85:iload_2         
	//   46   86:invokevirtual   #67  <Method bfw bjr.a(int, int)>
	//   47   89:astore          6
		((bfw) (obj1)).a(k);
	//   48   91:aload           6
	//   49   93:aload_0         
	//   50   94:getfield        #21  <Field zzfs k>
	//   51   97:invokeinterface #72  <Method void bfw.a(zzfs)>
_L1:
		if(i == -1)
			break MISSING_BLOCK_LABEL_133;
	//   52  102:iload_1         
	//   53  103:iconst_m1       
	//   54  104:icmpeq          133
		l = l + i;
	//   55  107:aload_0         
	//   56  108:aload_0         
	//   57  109:getfield        #34  <Field int l>
	//   58  112:iload_1         
	//   59  113:iadd            
	//   60  114:putfield        #34  <Field int l>
		i = ((bfw) (obj1)).a(((bfo) (obj)), 0x7fffffff, true);
	//   61  117:aload           6
	//   62  119:aload           5
	//   63  121:ldc1            #73  <Int 0x7fffffff>
	//   64  123:iconst_1        
	//   65  124:invokeinterface #76  <Method int bfw.a(bfo, int, boolean)>
	//   66  129:istore_1        
		  goto _L1
	//*  67  130:goto            102
		int i1 = l;
	//   68  133:aload_0         
	//   69  134:getfield        #34  <Field int l>
	//   70  137:istore_1        
		((bfw) (obj1)).a(f, 1, i1, 0, ((bfx) (null)));
	//   71  138:aload           6
	//   72  140:aload_0         
	//   73  141:getfield        #80  <Field long f>
	//   74  144:iconst_1        
	//   75  145:iload_1         
	//   76  146:iconst_0        
	//   77  147:aconst_null     
	//   78  148:invokeinterface #83  <Method void bfw.a(long, int, int, int, bfx)>
		bnw.a(h);
	//   79  153:aload_0         
	//   80  154:getfield        #43  <Field bml h>
	//   81  157:invokestatic    #86  <Method void bnw.a(bml)>
		n = true;
	//   82  160:aload_0         
	//   83  161:iconst_1        
	//   84  162:putfield        #88  <Field boolean n>
		return;
	//   85  165:return          
		Exception exception;
		exception;
	//   86  166:astore          5
		bnw.a(h);
	//   87  168:aload_0         
	//   88  169:getfield        #43  <Field bml h>
	//   89  172:invokestatic    #86  <Method void bnw.a(bml)>
		throw exception;
	//   90  175:aload           5
	//   91  177:athrow          
	//*  92  178:goto            44
	}

	public final long e()
	{
		return (long)l;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int l>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public final boolean g()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field boolean n>
	//    2    4:ireturn         
	}

	private final int j;
	private final zzfs k;
	private volatile int l;
	private volatile boolean m;
	private volatile boolean n;
}
