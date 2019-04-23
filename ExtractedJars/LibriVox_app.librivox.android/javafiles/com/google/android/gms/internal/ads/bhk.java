// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf, bnw

final class bhk
{

	public bhk(long al[], int ai[], int i, long al1[], int ai1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		int j = ai.length;
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:istore          6
		int k = al1.length;
	//    5    8:aload           4
	//    6   10:arraylength     
	//    7   11:istore          7
		boolean flag1 = true;
	//    8   13:iconst_1        
	//    9   14:istore          9
		boolean flag;
		if(j == k)
	//*  10   16:iload           6
	//*  11   18:iload           7
	//*  12   20:icmpne          29
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore          8
		else
	//*  15   26:goto            32
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore          8
		bnf.a(flag);
	//   18   32:iload           8
	//   19   34:invokestatic    #23  <Method void bnf.a(boolean)>
		if(al.length == al1.length)
	//*  20   37:aload_1         
	//*  21   38:arraylength     
	//*  22   39:aload           4
	//*  23   41:arraylength     
	//*  24   42:icmpne          51
			flag = true;
	//   25   45:iconst_1        
	//   26   46:istore          8
		else
	//*  27   48:goto            54
			flag = false;
	//   28   51:iconst_0        
	//   29   52:istore          8
		bnf.a(flag);
	//   30   54:iload           8
	//   31   56:invokestatic    #23  <Method void bnf.a(boolean)>
		if(ai1.length == al1.length)
	//*  32   59:aload           5
	//*  33   61:arraylength     
	//*  34   62:aload           4
	//*  35   64:arraylength     
	//*  36   65:icmpne          75
			flag = flag1;
	//   37   68:iload           9
	//   38   70:istore          8
		else
	//*  39   72:goto            78
			flag = false;
	//   40   75:iconst_0        
	//   41   76:istore          8
		bnf.a(flag);
	//   42   78:iload           8
	//   43   80:invokestatic    #23  <Method void bnf.a(boolean)>
		b = al;
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:putfield        #25  <Field long[] b>
		c = ai;
	//   47   88:aload_0         
	//   48   89:aload_2         
	//   49   90:putfield        #27  <Field int[] c>
		d = i;
	//   50   93:aload_0         
	//   51   94:iload_3         
	//   52   95:putfield        #29  <Field int d>
		e = al1;
	//   53   98:aload_0         
	//   54   99:aload           4
	//   55  101:putfield        #31  <Field long[] e>
		f = ai1;
	//   56  104:aload_0         
	//   57  105:aload           5
	//   58  107:putfield        #33  <Field int[] f>
		a = al.length;
	//   59  110:aload_0         
	//   60  111:aload_1         
	//   61  112:arraylength     
	//   62  113:putfield        #35  <Field int a>
	//   63  116:return          
	}

	public final int a(long l)
	{
		for(int i = bnw.a(e, l, true, false); i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field long[] e>
	//*   2    4:lload_1         
	//*   3    5:iconst_1        
	//*   4    6:iconst_0        
	//*   5    7:invokestatic    #42  <Method int bnw.a(long[], long, boolean, boolean)>
	//*   6   10:istore_3        
	//*   7   11:iload_3         
	//*   8   12:iflt            35
			if((f[i] & 1) != 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #33  <Field int[] f>
	//*  11   19:iload_3         
	//*  12   20:iaload          
	//*  13   21:iconst_1        
	//*  14   22:iand            
	//*  15   23:ifeq            28
				return i;
	//   16   26:iload_3         
	//   17   27:ireturn         

	//   18   28:iload_3         
	//   19   29:iconst_1        
	//   20   30:isub            
	//   21   31:istore_3        
	//*  22   32:goto            11
		return -1;
	//   23   35:iconst_m1       
	//   24   36:ireturn         
	}

	public final int b(long l)
	{
		for(int i = bnw.b(e, l, true, false); i < e.length; i++)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field long[] e>
	//*   2    4:lload_1         
	//*   3    5:iconst_1        
	//*   4    6:iconst_0        
	//*   5    7:invokestatic    #44  <Method int bnw.b(long[], long, boolean, boolean)>
	//*   6   10:istore_3        
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #31  <Field long[] e>
	//*  10   16:arraylength     
	//*  11   17:icmpge          40
			if((f[i] & 1) != 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #33  <Field int[] f>
	//*  14   24:iload_3         
	//*  15   25:iaload          
	//*  16   26:iconst_1        
	//*  17   27:iand            
	//*  18   28:ifeq            33
				return i;
	//   19   31:iload_3         
	//   20   32:ireturn         

	//   21   33:iload_3         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_3        
	//*  25   37:goto            11
		return -1;
	//   26   40:iconst_m1       
	//   27   41:ireturn         
	}

	public final int a;
	public final long b[];
	public final int c[];
	public final int d;
	public final long e[];
	public final int f[];
}
