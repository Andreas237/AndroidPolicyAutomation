// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c.b;

import com.google.ads.interactivemedia.v3.a.f.*;

final class e
	implements c.a
{

	private e(long l, long l1, long l2)
	{
		this(l, l1, l2, ((long []) (null)), 0L, 0);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:lload           5
	//    4    5:aconst_null     
	//    5    6:lconst_0        
	//    6    7:iconst_0        
	//    7    8:invokespecial   #20  <Method void e(long, long, long, long[], long, int)>
	//    8   11:return          
	}

	private e(long l, long l1, long l2, long al[], 
			long l3, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #26  <Field long a>
		b = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #28  <Field long b>
		c = l2;
	//    8   14:aload_0         
	//    9   15:lload           5
	//   10   17:putfield        #30  <Field long c>
		d = al;
	//   11   20:aload_0         
	//   12   21:aload           7
	//   13   23:putfield        #32  <Field long[] d>
		e = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #34  <Field long e>
		g = i;
	//   17   32:aload_0         
	//   18   33:iload           10
	//   19   35:putfield        #36  <Field int g>
	//   20   38:return          
	}

	private long a(int i)
	{
		return (b * (long)i) / 100L;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field long b>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:lmul            
	//    5    7:ldc2w           #38  <Long 100L>
	//    6   10:ldiv            
	//    7   11:lreturn         
	}

	public static e a(j j1, m m1, long l, long l1)
	{
		int i = j1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int j.g>
	//    2    4:istore          6
		int i1 = j1.d;
	//    3    6:aload_0         
	//    4    7:getfield        #45  <Field int j.d>
	//    5   10:istore          7
		l += j1.c;
	//    6   12:lload_2         
	//    7   13:aload_0         
	//    8   14:getfield        #47  <Field int j.c>
	//    9   17:i2l             
	//   10   18:ladd            
	//   11   19:lstore_2        
		int k1 = m1.m();
	//   12   20:aload_1         
	//   13   21:invokevirtual   #53  <Method int m.m()>
	//   14   24:istore          8
		if((k1 & 1) == 1)
	//*  15   26:iload           8
	//*  16   28:iconst_1        
	//*  17   29:iand            
	//*  18   30:iconst_1        
	//*  19   31:icmpne          157
		{
			int i2 = m1.s();
	//   20   34:aload_1         
	//   21   35:invokevirtual   #56  <Method int m.s()>
	//   22   38:istore          9
			if(i2 != 0)
	//*  23   40:iload           9
	//*  24   42:ifne            48
	//*  25   45:goto            157
			{
				long l2 = q.a(i2, (long)i * 0xf4240L, i1);
	//   26   48:iload           9
	//   27   50:i2l             
	//   28   51:iload           6
	//   29   53:i2l             
	//   30   54:ldc2w           #57  <Long 0xf4240L>
	//   31   57:lmul            
	//   32   58:iload           7
	//   33   60:i2l             
	//   34   61:invokestatic    #63  <Method long q.a(long, long, long)>
	//   35   64:lstore          10
				if((k1 & 6) != 6)
	//*  36   66:iload           8
	//*  37   68:bipush          6
	//*  38   70:iand            
	//*  39   71:bipush          6
	//*  40   73:icmpeq          89
					return new e(l, l2, l1);
	//   41   76:new             #2   <Class e>
	//   42   79:dup             
	//   43   80:lload_2         
	//   44   81:lload           10
	//   45   83:lload           4
	//   46   85:invokespecial   #65  <Method void e(long, long, long)>
	//   47   88:areturn         
				long l3 = m1.s();
	//   48   89:aload_1         
	//   49   90:invokevirtual   #56  <Method int m.s()>
	//   50   93:i2l             
	//   51   94:lstore          12
				m1.d(1);
	//   52   96:aload_1         
	//   53   97:iconst_1        
	//   54   98:invokevirtual   #68  <Method void m.d(int)>
				long al[] = new long[99];
	//   55  101:bipush          99
	//   56  103:newarray        long[]
	//   57  105:astore          14
				for(int k = 0; k < 99; k++)
	//*  58  107:iconst_0        
	//*  59  108:istore          6
	//*  60  110:iload           6
	//*  61  112:bipush          99
	//*  62  114:icmpge          136
					al[k] = m1.f();
	//   63  117:aload           14
	//   64  119:iload           6
	//   65  121:aload_1         
	//   66  122:invokevirtual   #71  <Method int m.f()>
	//   67  125:i2l             
	//   68  126:lastore         

	//   69  127:iload           6
	//   70  129:iconst_1        
	//   71  130:iadd            
	//   72  131:istore          6
	//*  73  133:goto            110
				return new e(l, l2, l1, al, l3, j1.c);
	//   74  136:new             #2   <Class e>
	//   75  139:dup             
	//   76  140:lload_2         
	//   77  141:lload           10
	//   78  143:lload           4
	//   79  145:aload           14
	//   80  147:lload           12
	//   81  149:aload_0         
	//   82  150:getfield        #47  <Field int j.c>
	//   83  153:invokespecial   #20  <Method void e(long, long, long, long[], long, int)>
	//   84  156:areturn         
			}
		}
		return null;
	//   85  157:aconst_null     
	//   86  158:areturn         
	}

	public long a(long l)
	{
		boolean flag = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method boolean a()>
	//    2    4:istore          14
		long l2 = 0L;
	//    3    6:lconst_0        
	//    4    7:lstore          8
		if(flag)
	//*   5    9:iload           14
	//*   6   11:ifeq            159
		{
			long l1 = a;
	//    7   14:aload_0         
	//    8   15:getfield        #26  <Field long a>
	//    9   18:lstore          6
			if(l < l1)
	//*  10   20:lload_1         
	//*  11   21:lload           6
	//*  12   23:lcmp            
	//*  13   24:ifge            29
				return 0L;
	//   14   27:lconst_0        
	//   15   28:lreturn         
			double d1 = ((double)(l - l1) * 256D) / (double)e;
	//   16   29:lload_1         
	//   17   30:lload           6
	//   18   32:lsub            
	//   19   33:l2d             
	//   20   34:ldc2w           #76  <Double 256D>
	//   21   37:dmul            
	//   22   38:aload_0         
	//   23   39:getfield        #34  <Field long e>
	//   24   42:l2d             
	//   25   43:ddiv            
	//   26   44:dstore_3        
			int i = q.a(d, (long)d1, true, false) + 1;
	//   27   45:aload_0         
	//   28   46:getfield        #32  <Field long[] d>
	//   29   49:dload_3         
	//   30   50:d2l             
	//   31   51:iconst_1        
	//   32   52:iconst_0        
	//   33   53:invokestatic    #80  <Method int q.a(long[], long, boolean, boolean)>
	//   34   56:iconst_1        
	//   35   57:iadd            
	//   36   58:istore          5
			long l3 = a(i);
	//   37   60:aload_0         
	//   38   61:iload           5
	//   39   63:invokespecial   #82  <Method long a(int)>
	//   40   66:lstore          10
			if(i == 0)
	//*  41   68:iload           5
	//*  42   70:ifne            78
				l = 0L;
	//   43   73:lconst_0        
	//   44   74:lstore_1        
			else
	//*  45   75:goto            88
				l = d[i - 1];
	//   46   78:aload_0         
	//   47   79:getfield        #32  <Field long[] d>
	//   48   82:iload           5
	//   49   84:iconst_1        
	//   50   85:isub            
	//   51   86:laload          
	//   52   87:lstore_1        
			if(i == 99)
	//*  53   88:iload           5
	//*  54   90:bipush          99
	//*  55   92:icmpne          103
				l1 = 256L;
	//   56   95:ldc2w           #83  <Long 256L>
	//   57   98:lstore          6
			else
	//*  58  100:goto            112
				l1 = d[i];
	//   59  103:aload_0         
	//   60  104:getfield        #32  <Field long[] d>
	//   61  107:iload           5
	//   62  109:laload          
	//   63  110:lstore          6
			long l4 = a(i + 1);
	//   64  112:aload_0         
	//   65  113:iload           5
	//   66  115:iconst_1        
	//   67  116:iadd            
	//   68  117:invokespecial   #82  <Method long a(int)>
	//   69  120:lstore          12
			if(l1 == l)
	//*  70  122:lload           6
	//*  71  124:lload_1         
	//*  72  125:lcmp            
	//*  73  126:ifne            135
				l = l2;
	//   74  129:lload           8
	//   75  131:lstore_1        
			else
	//*  76  132:goto            154
				l = (long)(((double)(l4 - l3) * (d1 - (double)l)) / (double)(l1 - l));
	//   77  135:lload           12
	//   78  137:lload           10
	//   79  139:lsub            
	//   80  140:l2d             
	//   81  141:dload_3         
	//   82  142:lload_1         
	//   83  143:l2d             
	//   84  144:dsub            
	//   85  145:dmul            
	//   86  146:lload           6
	//   87  148:lload_1         
	//   88  149:lsub            
	//   89  150:l2d             
	//   90  151:ddiv            
	//   91  152:d2l             
	//   92  153:lstore_1        
			return l3 + l;
	//   93  154:lload           10
	//   94  156:lload_1         
	//   95  157:ladd            
	//   96  158:lreturn         
		} else
		{
			return 0L;
	//   97  159:lconst_0        
	//   98  160:lreturn         
		}
	}

	public boolean a()
	{
		return d != null;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long[] d>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public long b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field long b>
	//    2    4:lreturn         
	}

	public long b(long l)
	{
		if(!a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #75  <Method boolean a()>
	//*   2    4:ifne            12
			return a;
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field long a>
	//    5   11:lreturn         
		float f2 = ((float)l * 100F) / (float)b;
	//    6   12:lload_1         
	//    7   13:l2f             
	//    8   14:ldc1            #86  <Float 100F>
	//    9   16:fmul            
	//   10   17:aload_0         
	//   11   18:getfield        #28  <Field long b>
	//   12   21:l2f             
	//   13   22:fdiv            
	//   14   23:fstore          5
		float f = 256F;
	//   15   25:ldc1            #87  <Float 256F>
	//   16   27:fstore_3        
		float f1 = 0.0F;
	//   17   28:fconst_0        
	//   18   29:fstore          4
		if(f2 <= 0.0F)
	//*  19   31:fload           5
	//*  20   33:fconst_0        
	//*  21   34:fcmpg           
	//*  22   35:ifgt            43
			f = 0.0F;
	//   23   38:fconst_0        
	//   24   39:fstore_3        
		else
	//*  25   40:goto            110
		if(f2 < 100F)
	//*  26   43:fload           5
	//*  27   45:ldc1            #86  <Float 100F>
	//*  28   47:fcmpl           
	//*  29   48:iflt            54
	//*  30   51:goto            110
		{
			int i = (int)f2;
	//   31   54:fload           5
	//   32   56:f2i             
	//   33   57:istore          6
			if(i != 0)
	//*  34   59:iload           6
	//*  35   61:ifne            67
	//*  36   64:goto            79
				f1 = d[i - 1];
	//   37   67:aload_0         
	//   38   68:getfield        #32  <Field long[] d>
	//   39   71:iload           6
	//   40   73:iconst_1        
	//   41   74:isub            
	//   42   75:laload          
	//   43   76:l2f             
	//   44   77:fstore          4
			if(i < 99)
	//*  45   79:iload           6
	//*  46   81:bipush          99
	//*  47   83:icmpge          95
				f = d[i];
	//   48   86:aload_0         
	//   49   87:getfield        #32  <Field long[] d>
	//   50   90:iload           6
	//   51   92:laload          
	//   52   93:l2f             
	//   53   94:fstore_3        
			f = (f - f1) * (f2 - (float)i) + f1;
	//   54   95:fload_3         
	//   55   96:fload           4
	//   56   98:fsub            
	//   57   99:fload           5
	//   58  101:iload           6
	//   59  103:i2f             
	//   60  104:fsub            
	//   61  105:fmul            
	//   62  106:fload           4
	//   63  108:fadd            
	//   64  109:fstore_3        
		}
		long l1 = Math.round((double)f * 0.00390625D * (double)e);
	//   65  110:fload_3         
	//   66  111:f2d             
	//   67  112:ldc2w           #88  <Double 0.00390625D>
	//   68  115:dmul            
	//   69  116:aload_0         
	//   70  117:getfield        #34  <Field long e>
	//   71  120:l2d             
	//   72  121:dmul            
	//   73  122:invokestatic    #95  <Method long Math.round(double)>
	//   74  125:lstore          7
		long l2 = a;
	//   75  127:aload_0         
	//   76  128:getfield        #26  <Field long a>
	//   77  131:lstore          9
		l = c;
	//   78  133:aload_0         
	//   79  134:getfield        #30  <Field long c>
	//   80  137:lstore_1        
		if(l != -1L)
	//*  81  138:lload_1         
	//*  82  139:ldc2w           #96  <Long -1L>
	//*  83  142:lcmp            
	//*  84  143:ifeq            153
			l--;
	//   85  146:lload_1         
	//   86  147:lconst_1        
	//   87  148:lsub            
	//   88  149:lstore_1        
		else
	//*  89  150:goto            169
			l = ((l2 - (long)g) + e) - 1L;
	//   90  153:lload           9
	//   91  155:aload_0         
	//   92  156:getfield        #36  <Field int g>
	//   93  159:i2l             
	//   94  160:lsub            
	//   95  161:aload_0         
	//   96  162:getfield        #34  <Field long e>
	//   97  165:ladd            
	//   98  166:lconst_1        
	//   99  167:lsub            
	//  100  168:lstore_1        
		return Math.min(l1 + l2, l);
	//  101  169:lload           7
	//  102  171:lload           9
	//  103  173:ladd            
	//  104  174:lload_1         
	//  105  175:invokestatic    #101 <Method long Math.min(long, long)>
	//  106  178:lreturn         
	}

	private final long a;
	private final long b;
	private final long c;
	private final long d[];
	private final long e;
	private final int g;
}
