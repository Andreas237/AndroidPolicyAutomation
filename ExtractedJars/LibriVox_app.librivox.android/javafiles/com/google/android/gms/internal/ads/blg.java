// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ble, bks, blj, blm, 
//			zzfs, bld

public final class blg extends ble
	implements bks
{

	public blg(String s, long l, zzfs zzfs, String s1, blj blj1, List list)
	{
		super(s, -1L, zzfs, s1, ((bli) (blj1)), list, ((blf) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #11  <Long -1L>
	//    3    5:aload           4
	//    4    7:aload           5
	//    5    9:aload           6
	//    6   11:aload           7
	//    7   13:aconst_null     
	//    8   14:invokespecial   #15  <Method void ble(String, long, zzfs, String, bli, List, blf)>
		e = blj1;
	//    9   17:aload_0         
	//   10   18:aload           6
	//   11   20:putfield        #17  <Field blj e>
	//   12   23:return          
	}

	public final int a()
	{
		return e.d;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field blj e>
	//    2    4:getfield        #26  <Field int blj.d>
	//    3    7:ireturn         
	}

	public final int a(long l)
	{
		return e.a(l);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field blj e>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #29  <Method int blj.a(long)>
	//    4    8:ireturn         
	}

	public final int a(long l, long l1)
	{
		blj blj1 = e;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field blj e>
	//    2    4:astore          9
		int i1 = blj1.d;
	//    3    6:aload           9
	//    4    8:getfield        #26  <Field int blj.d>
	//    5   11:istore          7
		int i = blj1.a(l1);
	//    6   13:aload           9
	//    7   15:lload_3         
	//    8   16:invokevirtual   #29  <Method int blj.a(long)>
	//    9   19:istore          5
		if(i == 0)
	//*  10   21:iload           5
	//*  11   23:ifne            29
			return i1;
	//   12   26:iload           7
	//   13   28:ireturn         
		if(blj1.f == null)
	//*  14   29:aload           9
	//*  15   31:getfield        #34  <Field List blj.f>
	//*  16   34:ifnonnull       97
		{
			l1 = (blj1.e * 0xf4240L) / blj1.b;
	//   17   37:aload           9
	//   18   39:getfield        #37  <Field long blj.e>
	//   19   42:ldc2w           #38  <Long 0xf4240L>
	//   20   45:lmul            
	//   21   46:aload           9
	//   22   48:getfield        #42  <Field long blj.b>
	//   23   51:ldiv            
	//   24   52:lstore_3        
			int j = blj1.d + (int)(l / l1);
	//   25   53:aload           9
	//   26   55:getfield        #26  <Field int blj.d>
	//   27   58:lload_1         
	//   28   59:lload_3         
	//   29   60:ldiv            
	//   30   61:l2i             
	//   31   62:iadd            
	//   32   63:istore          6
			if(j < i1)
	//*  33   65:iload           6
	//*  34   67:iload           7
	//*  35   69:icmpge          75
				return i1;
	//   36   72:iload           7
	//   37   74:ireturn         
			if(i == -1)
	//*  38   75:iload           5
	//*  39   77:iconst_m1       
	//*  40   78:icmpne          84
				return j;
	//   41   81:iload           6
	//   42   83:ireturn         
			else
				return Math.min(j, (i1 + i) - 1);
	//   43   84:iload           6
	//   44   86:iload           7
	//   45   88:iload           5
	//   46   90:iadd            
	//   47   91:iconst_1        
	//   48   92:isub            
	//   49   93:invokestatic    #48  <Method int Math.min(int, int)>
	//   50   96:ireturn         
		}
		i = (i + i1) - 1;
	//   51   97:iload           5
	//   52   99:iload           7
	//   53  101:iadd            
	//   54  102:iconst_1        
	//   55  103:isub            
	//   56  104:istore          5
		int k;
		for(k = i1; k <= i;)
	//*  57  106:iload           7
	//*  58  108:istore          6
	//*  59  110:iload           6
	//*  60  112:iload           5
	//*  61  114:icmpgt          170
		{
			int j1 = (i - k) / 2 + k;
	//   62  117:iload           5
	//   63  119:iload           6
	//   64  121:isub            
	//   65  122:iconst_2        
	//   66  123:idiv            
	//   67  124:iload           6
	//   68  126:iadd            
	//   69  127:istore          8
			l1 = blj1.a(j1);
	//   70  129:aload           9
	//   71  131:iload           8
	//   72  133:invokevirtual   #51  <Method long blj.a(int)>
	//   73  136:lstore_3        
			if(l1 < l)
	//*  74  137:lload_3         
	//*  75  138:lload_1         
	//*  76  139:lcmp            
	//*  77  140:ifge            152
				k = j1 + 1;
	//   78  143:iload           8
	//   79  145:iconst_1        
	//   80  146:iadd            
	//   81  147:istore          6
			else
	//*  82  149:goto            110
			if(l1 > l)
	//*  83  152:lload_3         
	//*  84  153:lload_1         
	//*  85  154:lcmp            
	//*  86  155:ifle            167
				i = j1 - 1;
	//   87  158:iload           8
	//   88  160:iconst_1        
	//   89  161:isub            
	//   90  162:istore          5
			else
	//*  91  164:goto            110
				return j1;
	//   92  167:iload           8
	//   93  169:ireturn         
		}

		if(k == i1)
	//*  94  170:iload           6
	//*  95  172:iload           7
	//*  96  174:icmpne          180
			return k;
	//   97  177:iload           6
	//   98  179:ireturn         
		else
			return i;
	//   99  180:iload           5
	//  100  182:ireturn         
	}

	public final long a(int i)
	{
		return e.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field blj e>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #51  <Method long blj.a(int)>
	//    4    8:lreturn         
	}

	public final long a(int i, long l)
	{
		blj blj1 = e;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field blj e>
	//    2    4:astore          5
		if(blj1.f != null)
	//*   3    6:aload           5
	//*   4    8:getfield        #34  <Field List blj.f>
	//*   5   11:ifnull          48
			return (((blm)blj1.f.get(i - blj1.d)).b * 0xf4240L) / blj1.b;
	//    6   14:aload           5
	//    7   16:getfield        #34  <Field List blj.f>
	//    8   19:iload_1         
	//    9   20:aload           5
	//   10   22:getfield        #26  <Field int blj.d>
	//   11   25:isub            
	//   12   26:invokeinterface #58  <Method Object List.get(int)>
	//   13   31:checkcast       #60  <Class blm>
	//   14   34:getfield        #61  <Field long blm.b>
	//   15   37:ldc2w           #38  <Long 0xf4240L>
	//   16   40:lmul            
	//   17   41:aload           5
	//   18   43:getfield        #42  <Field long blj.b>
	//   19   46:ldiv            
	//   20   47:lreturn         
		int j = blj1.a(l);
	//   21   48:aload           5
	//   22   50:lload_2         
	//   23   51:invokevirtual   #29  <Method int blj.a(long)>
	//   24   54:istore          4
		if(j != -1 && i == (blj1.d + j) - 1)
	//*  25   56:iload           4
	//*  26   58:iconst_m1       
	//*  27   59:icmpeq          85
	//*  28   62:iload_1         
	//*  29   63:aload           5
	//*  30   65:getfield        #26  <Field int blj.d>
	//*  31   68:iload           4
	//*  32   70:iadd            
	//*  33   71:iconst_1        
	//*  34   72:isub            
	//*  35   73:icmpne          85
			return l - blj1.a(i);
	//   36   76:lload_2         
	//   37   77:aload           5
	//   38   79:iload_1         
	//   39   80:invokevirtual   #51  <Method long blj.a(int)>
	//   40   83:lsub            
	//   41   84:lreturn         
		else
			return (blj1.e * 0xf4240L) / blj1.b;
	//   42   85:aload           5
	//   43   87:getfield        #37  <Field long blj.e>
	//   44   90:ldc2w           #38  <Long 0xf4240L>
	//   45   93:lmul            
	//   46   94:aload           5
	//   47   96:getfield        #42  <Field long blj.b>
	//   48   99:ldiv            
	//   49  100:lreturn         
	}

	public final bld b(int i)
	{
		return e.a(((ble) (this)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field blj e>
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #65  <Method bld blj.a(ble, int)>
	//    5    9:areturn         
	}

	public final boolean b()
	{
		return e.a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field blj e>
	//    2    4:invokevirtual   #68  <Method boolean blj.a()>
	//    3    7:ireturn         
	}

	public final bld d()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final bks e()
	{
		return ((bks) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final String f()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private final blj e;
}
