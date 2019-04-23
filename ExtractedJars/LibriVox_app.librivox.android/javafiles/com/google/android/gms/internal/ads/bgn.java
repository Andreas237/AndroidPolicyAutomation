// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, bnf

final class bgn
{

	public bgn(bno bno1, bno bno2, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		g = bno1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field bno g>
		f = bno2;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field bno f>
		e = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field boolean e>
		bno2.c(12);
	//   11   19:aload_2         
	//   12   20:bipush          12
	//   13   22:invokevirtual   #33  <Method void bno.c(int)>
		a = bno2.o();
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #37  <Method int bno.o()>
	//   17   30:putfield        #39  <Field int a>
		bno1.c(12);
	//   18   33:aload_1         
	//   19   34:bipush          12
	//   20   36:invokevirtual   #33  <Method void bno.c(int)>
		i = bno1.o();
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #37  <Method int bno.o()>
	//   24   44:putfield        #41  <Field int i>
		int j = bno1.l();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #44  <Method int bno.l()>
	//   27   51:istore          4
		flag = true;
	//   28   53:iconst_1        
	//   29   54:istore_3        
		if(j != 1)
	//*  30   55:iload           4
	//*  31   57:iconst_1        
	//*  32   58:icmpne          64
	//*  33   61:goto            66
			flag = false;
	//   34   64:iconst_0        
	//   35   65:istore_3        
		bnf.b(flag, "first_chunk must be 1");
	//   36   66:iload_3         
	//   37   67:ldc1            #46  <String "first_chunk must be 1">
	//   38   69:invokestatic    #51  <Method void bnf.b(boolean, Object)>
		b = -1;
	//   39   72:aload_0         
	//   40   73:iconst_m1       
	//   41   74:putfield        #53  <Field int b>
	//   42   77:return          
	}

	public final boolean a()
	{
		int j = b + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int b>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_1        
		b = j;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #53  <Field int b>
		if(j == a)
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #39  <Field int a>
	//*  11   17:icmpne          22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		long l;
		if(e)
	//*  14   22:aload_0         
	//*  15   23:getfield        #28  <Field boolean e>
	//*  16   26:ifeq            40
			l = f.p();
	//   17   29:aload_0         
	//   18   30:getfield        #26  <Field bno f>
	//   19   33:invokevirtual   #59  <Method long bno.p()>
	//   20   36:lstore_2        
		else
	//*  21   37:goto            48
			l = f.j();
	//   22   40:aload_0         
	//   23   41:getfield        #26  <Field bno f>
	//   24   44:invokevirtual   #62  <Method long bno.j()>
	//   25   47:lstore_2        
		d = l;
	//   26   48:aload_0         
	//   27   49:lload_2         
	//   28   50:putfield        #64  <Field long d>
		if(b == h)
	//*  29   53:aload_0         
	//*  30   54:getfield        #53  <Field int b>
	//*  31   57:aload_0         
	//*  32   58:getfield        #66  <Field int h>
	//*  33   61:icmpne          119
		{
			c = g.o();
	//   34   64:aload_0         
	//   35   65:aload_0         
	//   36   66:getfield        #24  <Field bno g>
	//   37   69:invokevirtual   #37  <Method int bno.o()>
	//   38   72:putfield        #68  <Field int c>
			g.d(4);
	//   39   75:aload_0         
	//   40   76:getfield        #24  <Field bno g>
	//   41   79:iconst_4        
	//   42   80:invokevirtual   #70  <Method void bno.d(int)>
			int k = i - 1;
	//   43   83:aload_0         
	//   44   84:getfield        #41  <Field int i>
	//   45   87:iconst_1        
	//   46   88:isub            
	//   47   89:istore_1        
			i = k;
	//   48   90:aload_0         
	//   49   91:iload_1         
	//   50   92:putfield        #41  <Field int i>
			if(k > 0)
	//*  51   95:iload_1         
	//*  52   96:ifle            112
				k = g.o() - 1;
	//   53   99:aload_0         
	//   54  100:getfield        #24  <Field bno g>
	//   55  103:invokevirtual   #37  <Method int bno.o()>
	//   56  106:iconst_1        
	//   57  107:isub            
	//   58  108:istore_1        
			else
	//*  59  109:goto            114
				k = -1;
	//   60  112:iconst_m1       
	//   61  113:istore_1        
			h = k;
	//   62  114:aload_0         
	//   63  115:iload_1         
	//   64  116:putfield        #66  <Field int h>
		}
		return true;
	//   65  119:iconst_1        
	//   66  120:ireturn         
	}

	public final int a;
	public int b;
	public int c;
	public long d;
	private final boolean e;
	private final bno f;
	private final bno g;
	private int h;
	private int i;
}
