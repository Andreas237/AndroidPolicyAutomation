// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bfx, zzfs, bex, bdg, 
//			bfc, bje, bnf, bnw

final class bjd
{

	public bjd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		a = 1000;
	//    2    4:aload_0         
	//    3    5:sipush          1000
	//    4    8:putfield        #35  <Field int a>
		int i1 = a;
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field int a>
	//    7   15:istore_1        
		b = new int[i1];
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:newarray        int[]
	//   11   20:putfield        #37  <Field int[] b>
		c = new long[i1];
	//   12   23:aload_0         
	//   13   24:iload_1         
	//   14   25:newarray        long[]
	//   15   27:putfield        #39  <Field long[] c>
		f = new long[i1];
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:newarray        long[]
	//   19   34:putfield        #41  <Field long[] f>
		e = new int[i1];
	//   20   37:aload_0         
	//   21   38:iload_1         
	//   22   39:newarray        int[]
	//   23   41:putfield        #43  <Field int[] e>
		d = new int[i1];
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:newarray        int[]
	//   27   48:putfield        #45  <Field int[] d>
		g = new bfx[i1];
	//   28   51:aload_0         
	//   29   52:iload_1         
	//   30   53:anewarray       bfx[]
	//   31   56:putfield        #49  <Field bfx[] g>
		h = new zzfs[i1];
	//   32   59:aload_0         
	//   33   60:iload_1         
	//   34   61:anewarray       zzfs[]
	//   35   64:putfield        #53  <Field zzfs[] h>
		m = 0x0L;
	//   36   67:aload_0         
	//   37   68:ldc2w           #54  <Long 0x0L>
	//   38   71:putfield        #57  <Field long m>
		n = 0x0L;
	//   39   74:aload_0         
	//   40   75:ldc2w           #54  <Long 0x0L>
	//   41   78:putfield        #59  <Field long n>
		p = true;
	//   42   81:aload_0         
	//   43   82:iconst_1        
	//   44   83:putfield        #61  <Field boolean p>
		o = true;
	//   45   86:aload_0         
	//   46   87:iconst_1        
	//   47   88:putfield        #63  <Field boolean o>
	//   48   91:return          
	}

	public final int a(bdg bdg1, bfc bfc1, boolean flag, boolean flag1, zzfs zzfs1, bje bje1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(e())
			break MISSING_BLOCK_LABEL_62;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #68  <Method boolean e()>
	//    4    6:ifne            62
		if(!flag1)
			break MISSING_BLOCK_LABEL_24;
	//    5    9:iload           4
	//    6   11:ifeq            24
		((bex) (bfc1)).a(4);
	//    7   14:aload_2         
	//    8   15:iconst_4        
	//    9   16:invokevirtual   #73  <Method void bex.a(int)>
		this;
	//   10   19:aload_0         
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return -4;
	//   12   21:bipush          -4
	//   13   23:ireturn         
		if(q == null)
			break MISSING_BLOCK_LABEL_57;
	//   14   24:aload_0         
	//   15   25:getfield        #75  <Field zzfs q>
	//   16   28:ifnull          57
		if(flag)
			break MISSING_BLOCK_LABEL_44;
	//   17   31:iload_3         
	//   18   32:ifne            44
		if(q == zzfs1)
			break MISSING_BLOCK_LABEL_57;
	//   19   35:aload_0         
	//   20   36:getfield        #75  <Field zzfs q>
	//   21   39:aload           5
	//   22   41:if_acmpeq       57
		bdg1.a = q;
	//   23   44:aload_1         
	//   24   45:aload_0         
	//   25   46:getfield        #75  <Field zzfs q>
	//   26   49:putfield        #79  <Field zzfs bdg.a>
		this;
	//   27   52:aload_0         
		JVM INSTR monitorexit ;
	//   28   53:monitorexit     
		return -5;
	//   29   54:bipush          -5
	//   30   56:ireturn         
		this;
	//   31   57:aload_0         
		JVM INSTR monitorexit ;
	//   32   58:monitorexit     
		return -3;
	//   33   59:bipush          -3
	//   34   61:ireturn         
		if(flag)
			break MISSING_BLOCK_LABEL_287;
	//   35   62:iload_3         
	//   36   63:ifne            287
		if(h[k] != zzfs1)
	//*  37   66:aload_0         
	//*  38   67:getfield        #53  <Field zzfs[] h>
	//*  39   70:aload_0         
	//*  40   71:getfield        #81  <Field int k>
	//*  41   74:aaload          
	//*  42   75:aload           5
	//*  43   77:if_acmpeq       83
			break MISSING_BLOCK_LABEL_287;
	//   44   80:goto            287
		bdg1 = ((bdg) (bfc1.b));
	//   45   83:aload_2         
	//   46   84:getfield        #86  <Field java.nio.ByteBuffer bfc.b>
	//   47   87:astore_1        
		boolean flag2;
		if(bdg1 == null)
	//*  48   88:aload_1         
	//*  49   89:ifnonnull       98
			flag2 = true;
	//   50   92:iconst_1        
	//   51   93:istore          7
		else
	//*  52   95:goto            101
			flag2 = false;
	//   53   98:iconst_0        
	//   54   99:istore          7
		if(flag2)
	//*  55  101:iload           7
	//*  56  103:ifeq            111
	//*  57  106:aload_0         
			return -3;
	//   58  107:monitorexit     
	//   59  108:bipush          -3
	//   60  110:ireturn         
		long l1;
		bfc1.c = f[k];
	//   61  111:aload_2         
	//   62  112:aload_0         
	//   63  113:getfield        #41  <Field long[] f>
	//   64  116:aload_0         
	//   65  117:getfield        #81  <Field int k>
	//   66  120:laload          
	//   67  121:putfield        #88  <Field long bfc.c>
		((bex) (bfc1)).a(e[k]);
	//   68  124:aload_2         
	//   69  125:aload_0         
	//   70  126:getfield        #43  <Field int[] e>
	//   71  129:aload_0         
	//   72  130:getfield        #81  <Field int k>
	//   73  133:iaload          
	//   74  134:invokevirtual   #73  <Method void bex.a(int)>
		bje1.a = d[k];
	//   75  137:aload           6
	//   76  139:aload_0         
	//   77  140:getfield        #45  <Field int[] d>
	//   78  143:aload_0         
	//   79  144:getfield        #81  <Field int k>
	//   80  147:iaload          
	//   81  148:putfield        #91  <Field int bje.a>
		bje1.b = c[k];
	//   82  151:aload           6
	//   83  153:aload_0         
	//   84  154:getfield        #39  <Field long[] c>
	//   85  157:aload_0         
	//   86  158:getfield        #81  <Field int k>
	//   87  161:laload          
	//   88  162:putfield        #93  <Field long bje.b>
		bje1.d = g[k];
	//   89  165:aload           6
	//   90  167:aload_0         
	//   91  168:getfield        #49  <Field bfx[] g>
	//   92  171:aload_0         
	//   93  172:getfield        #81  <Field int k>
	//   94  175:aaload          
	//   95  176:putfield        #96  <Field bfx bje.d>
		m = Math.max(m, bfc1.c);
	//   96  179:aload_0         
	//   97  180:aload_0         
	//   98  181:getfield        #57  <Field long m>
	//   99  184:aload_2         
	//  100  185:getfield        #88  <Field long bfc.c>
	//  101  188:invokestatic    #102 <Method long Math.max(long, long)>
	//  102  191:putfield        #57  <Field long m>
		i = i - 1;
	//  103  194:aload_0         
	//  104  195:aload_0         
	//  105  196:getfield        #104 <Field int i>
	//  106  199:iconst_1        
	//  107  200:isub            
	//  108  201:putfield        #104 <Field int i>
		k = k + 1;
	//  109  204:aload_0         
	//  110  205:aload_0         
	//  111  206:getfield        #81  <Field int k>
	//  112  209:iconst_1        
	//  113  210:iadd            
	//  114  211:putfield        #81  <Field int k>
		j = j + 1;
	//  115  214:aload_0         
	//  116  215:aload_0         
	//  117  216:getfield        #106 <Field int j>
	//  118  219:iconst_1        
	//  119  220:iadd            
	//  120  221:putfield        #106 <Field int j>
		if(k == a)
	//* 121  224:aload_0         
	//* 122  225:getfield        #81  <Field int k>
	//* 123  228:aload_0         
	//* 124  229:getfield        #35  <Field int a>
	//* 125  232:icmpne          240
			k = 0;
	//  126  235:aload_0         
	//  127  236:iconst_0        
	//  128  237:putfield        #81  <Field int k>
		if(i > 0)
	//* 129  240:aload_0         
	//* 130  241:getfield        #104 <Field int i>
	//* 131  244:ifle            261
		{
			l1 = c[k];
	//  132  247:aload_0         
	//  133  248:getfield        #39  <Field long[] c>
	//  134  251:aload_0         
	//  135  252:getfield        #81  <Field int k>
	//  136  255:laload          
	//  137  256:lstore          8
			break MISSING_BLOCK_LABEL_275;
	//  138  258:goto            275
		}
		l1 = bje1.b + (long)bje1.a;
	//  139  261:aload           6
	//  140  263:getfield        #93  <Field long bje.b>
	//  141  266:aload           6
	//  142  268:getfield        #91  <Field int bje.a>
	//  143  271:i2l             
	//  144  272:ladd            
	//  145  273:lstore          8
		bje1.c = l1;
	//  146  275:aload           6
	//  147  277:lload           8
	//  148  279:putfield        #107 <Field long bje.c>
		this;
	//  149  282:aload_0         
		JVM INSTR monitorexit ;
	//  150  283:monitorexit     
		return -4;
	//  151  284:bipush          -4
	//  152  286:ireturn         
		bdg1.a = h[k];
	//  153  287:aload_1         
	//  154  288:aload_0         
	//  155  289:getfield        #53  <Field zzfs[] h>
	//  156  292:aload_0         
	//  157  293:getfield        #81  <Field int k>
	//  158  296:aaload          
	//  159  297:putfield        #79  <Field zzfs bdg.a>
		this;
	//  160  300:aload_0         
		JVM INSTR monitorexit ;
	//  161  301:monitorexit     
		return -5;
	//  162  302:bipush          -5
	//  163  304:ireturn         
		bdg1;
	//  164  305:astore_1        
	//* 165  306:aload_0         
		throw bdg1;
	//  166  307:monitorexit     
	//  167  308:aload_1         
	//  168  309:athrow          
	}

	public final long a(int i1)
	{
		i1 = c() - i1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method int c()>
	//    2    4:iload_1         
	//    3    5:isub            
	//    4    6:istore_1        
		boolean flag;
		if(i1 >= 0 && i1 <= i)
	//*   5    7:iload_1         
	//*   6    8:iflt            25
	//*   7   11:iload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #104 <Field int i>
	//*  10   16:icmpgt          25
			flag = true;
	//   11   19:iconst_1        
	//   12   20:istore          4
		else
	//*  13   22:goto            28
			flag = false;
	//   14   25:iconst_0        
	//   15   26:istore          4
		bnf.a(flag);
	//   16   28:iload           4
	//   17   30:invokestatic    #116 <Method void bnf.a(boolean)>
		if(i1 == 0)
	//*  18   33:iload_1         
	//*  19   34:ifne            88
		{
			if(j == 0 && i == 0)
	//*  20   37:aload_0         
	//*  21   38:getfield        #106 <Field int j>
	//*  22   41:ifne            53
	//*  23   44:aload_0         
	//*  24   45:getfield        #104 <Field int i>
	//*  25   48:ifne            53
				return 0L;
	//   26   51:lconst_0        
	//   27   52:lreturn         
			int j1 = l;
	//   28   53:aload_0         
	//   29   54:getfield        #118 <Field int l>
	//   30   57:istore_2        
			i1 = j1;
	//   31   58:iload_2         
	//   32   59:istore_1        
			if(j1 == 0)
	//*  33   60:iload_2         
	//*  34   61:ifne            69
				i1 = a;
	//   35   64:aload_0         
	//   36   65:getfield        #35  <Field int a>
	//   37   68:istore_1        
			i1--;
	//   38   69:iload_1         
	//   39   70:iconst_1        
	//   40   71:isub            
	//   41   72:istore_1        
			return c[i1] + (long)d[i1];
	//   42   73:aload_0         
	//   43   74:getfield        #39  <Field long[] c>
	//   44   77:iload_1         
	//   45   78:laload          
	//   46   79:aload_0         
	//   47   80:getfield        #45  <Field int[] d>
	//   48   83:iload_1         
	//   49   84:iaload          
	//   50   85:i2l             
	//   51   86:ladd            
	//   52   87:lreturn         
		}
		i = i - i1;
	//   53   88:aload_0         
	//   54   89:aload_0         
	//   55   90:getfield        #104 <Field int i>
	//   56   93:iload_1         
	//   57   94:isub            
	//   58   95:putfield        #104 <Field int i>
		int k1 = l;
	//   59   98:aload_0         
	//   60   99:getfield        #118 <Field int l>
	//   61  102:istore_2        
		int i2 = a;
	//   62  103:aload_0         
	//   63  104:getfield        #35  <Field int a>
	//   64  107:istore_3        
		l = ((k1 + i2) - i1) % i2;
	//   65  108:aload_0         
	//   66  109:iload_2         
	//   67  110:iload_3         
	//   68  111:iadd            
	//   69  112:iload_1         
	//   70  113:isub            
	//   71  114:iload_3         
	//   72  115:irem            
	//   73  116:putfield        #118 <Field int l>
		n = 0x0L;
	//   74  119:aload_0         
	//   75  120:ldc2w           #54  <Long 0x0L>
	//   76  123:putfield        #59  <Field long n>
		i1 = i - 1;
	//   77  126:aload_0         
	//   78  127:getfield        #104 <Field int i>
	//   79  130:iconst_1        
	//   80  131:isub            
	//   81  132:istore_1        
		do
		{
			if(i1 < 0)
				break;
	//   82  133:iload_1         
	//   83  134:iflt            184
			int l1 = (k + i1) % a;
	//   84  137:aload_0         
	//   85  138:getfield        #81  <Field int k>
	//   86  141:iload_1         
	//   87  142:iadd            
	//   88  143:aload_0         
	//   89  144:getfield        #35  <Field int a>
	//   90  147:irem            
	//   91  148:istore_2        
			n = Math.max(n, f[l1]);
	//   92  149:aload_0         
	//   93  150:aload_0         
	//   94  151:getfield        #59  <Field long n>
	//   95  154:aload_0         
	//   96  155:getfield        #41  <Field long[] f>
	//   97  158:iload_2         
	//   98  159:laload          
	//   99  160:invokestatic    #102 <Method long Math.max(long, long)>
	//  100  163:putfield        #59  <Field long n>
			if((e[l1] & 1) != 0)
				break;
	//  101  166:aload_0         
	//  102  167:getfield        #43  <Field int[] e>
	//  103  170:iload_2         
	//  104  171:iaload          
	//  105  172:iconst_1        
	//  106  173:iand            
	//  107  174:ifne            184
			i1--;
	//  108  177:iload_1         
	//  109  178:iconst_1        
	//  110  179:isub            
	//  111  180:istore_1        
		} while(true);
	//  112  181:goto            133
		return c[l];
	//  113  184:aload_0         
	//  114  185:getfield        #39  <Field long[] c>
	//  115  188:aload_0         
	//  116  189:getfield        #118 <Field int l>
	//  117  192:laload          
	//  118  193:lreturn         
	}

	public final long a(long l1, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!e() || l1 < f[k])
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #68  <Method boolean e()>
	//*   4    6:ifeq            182
	//*   5    9:lload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #41  <Field long[] f>
	//*   8   14:aload_0         
	//*   9   15:getfield        #81  <Field int k>
	//*  10   18:laload          
	//*  11   19:lcmp            
	//*  12   20:ifge            26
			break MISSING_BLOCK_LABEL_182;
	//   13   23:goto            182
		long l2 = n;
	//   14   26:aload_0         
	//   15   27:getfield        #59  <Field long n>
	//   16   30:lstore          7
		if(l1 <= l2 || flag)
			break MISSING_BLOCK_LABEL_49;
	//   17   32:lload_1         
	//   18   33:lload           7
	//   19   35:lcmp            
	//   20   36:ifle            49
	//   21   39:iload_3         
	//   22   40:ifne            49
		this;
	//   23   43:aload_0         
		JVM INSTR monitorexit ;
	//   24   44:monitorexit     
		return -1L;
	//   25   45:ldc2w           #120 <Long -1L>
	//   26   48:lreturn         
		int j1 = k;
	//   27   49:aload_0         
	//   28   50:getfield        #81  <Field int k>
	//   29   53:istore          5
		int i1;
		int k1;
		k1 = -1;
	//   30   55:iconst_m1       
	//   31   56:istore          6
		i1 = 0;
	//   32   58:iconst_0        
	//   33   59:istore          4
_L2:
		if(j1 == l || f[j1] > l1)
			break; /* Loop/switch isn't completed */
	//   34   61:iload           5
	//   35   63:aload_0         
	//   36   64:getfield        #118 <Field int l>
	//   37   67:icmpeq          118
	//   38   70:aload_0         
	//   39   71:getfield        #41  <Field long[] f>
	//   40   74:iload           5
	//   41   76:laload          
	//   42   77:lload_1         
	//   43   78:lcmp            
	//   44   79:ifgt            118
		if((e[j1] & 1) != 0)
	//*  45   82:aload_0         
	//*  46   83:getfield        #43  <Field int[] e>
	//*  47   86:iload           5
	//*  48   88:iaload          
	//*  49   89:iconst_1        
	//*  50   90:iand            
	//*  51   91:ifeq            98
			k1 = i1;
	//   52   94:iload           4
	//   53   96:istore          6
		j1 = (j1 + 1) % a;
	//   54   98:iload           5
	//   55  100:iconst_1        
	//   56  101:iadd            
	//   57  102:aload_0         
	//   58  103:getfield        #35  <Field int a>
	//   59  106:irem            
	//   60  107:istore          5
		i1++;
	//   61  109:iload           4
	//   62  111:iconst_1        
	//   63  112:iadd            
	//   64  113:istore          4
		if(true) goto _L2; else goto _L1
	//   65  115:goto            61
_L1:
		if(k1 == -1)
	//*  66  118:iload           6
	//*  67  120:iconst_m1       
	//*  68  121:icmpne          130
	//*  69  124:aload_0         
			return -1L;
	//   70  125:monitorexit     
	//   71  126:ldc2w           #120 <Long -1L>
	//   72  129:lreturn         
		k = (k + k1) % a;
	//   73  130:aload_0         
	//   74  131:aload_0         
	//   75  132:getfield        #81  <Field int k>
	//   76  135:iload           6
	//   77  137:iadd            
	//   78  138:aload_0         
	//   79  139:getfield        #35  <Field int a>
	//   80  142:irem            
	//   81  143:putfield        #81  <Field int k>
		j = j + k1;
	//   82  146:aload_0         
	//   83  147:aload_0         
	//   84  148:getfield        #106 <Field int j>
	//   85  151:iload           6
	//   86  153:iadd            
	//   87  154:putfield        #106 <Field int j>
		i = i - k1;
	//   88  157:aload_0         
	//   89  158:aload_0         
	//   90  159:getfield        #104 <Field int i>
	//   91  162:iload           6
	//   92  164:isub            
	//   93  165:putfield        #104 <Field int i>
		l1 = c[k];
	//   94  168:aload_0         
	//   95  169:getfield        #39  <Field long[] c>
	//   96  172:aload_0         
	//   97  173:getfield        #81  <Field int k>
	//   98  176:laload          
	//   99  177:lstore_1        
		this;
	//  100  178:aload_0         
		JVM INSTR monitorexit ;
	//  101  179:monitorexit     
		return l1;
	//  102  180:lload_1         
	//  103  181:lreturn         
		this;
	//  104  182:aload_0         
		JVM INSTR monitorexit ;
	//  105  183:monitorexit     
		return -1L;
	//  106  184:ldc2w           #120 <Long -1L>
	//  107  187:lreturn         
		Exception exception;
		exception;
	//  108  188:astore          9
	//* 109  190:aload_0         
		throw exception;
	//  110  191:monitorexit     
	//  111  192:aload           9
	//  112  194:athrow          
	}

	public final void a()
	{
		j = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #106 <Field int j>
		k = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #81  <Field int k>
		l = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #118 <Field int l>
		i = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #104 <Field int i>
		o = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #63  <Field boolean o>
	//   15   25:return          
	}

	public final void a(long l1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		n = Math.max(n, l1);
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #59  <Field long n>
	//    5    7:lload_1         
	//    6    8:invokestatic    #102 <Method long Math.max(long, long)>
	//    7   11:putfield        #59  <Field long n>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		Exception exception;
		exception;
	//   11   17:astore_3        
	//*  12   18:aload_0         
		throw exception;
	//   13   19:monitorexit     
	//   14   20:aload_3         
	//   15   21:athrow          
	}

	public final void a(long l1, int i1, long l2, int j1, bfx bfx1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = o;
	//    2    2:aload_0         
	//    3    3:getfield        #63  <Field boolean o>
	//    4    6:istore          9
		if(!flag)
			break MISSING_BLOCK_LABEL_27;
	//    5    8:iload           9
	//    6   10:ifeq            27
		if((i1 & 1) == 0)
	//*   7   13:iload_3         
	//*   8   14:iconst_1        
	//*   9   15:iand            
	//*  10   16:ifne            22
	//*  11   19:aload_0         
			return;
	//   12   20:monitorexit     
	//   13   21:return          
		o = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #63  <Field boolean o>
		int k1;
		long al[];
		long al1[];
		int ai[];
		int ai1[];
		bfx abfx[];
		zzfs azzfs[];
		if(!p)
	//*  17   27:aload_0         
	//*  18   28:getfield        #61  <Field boolean p>
	//*  19   31:ifne            527
			flag = true;
	//   20   34:iconst_1        
	//   21   35:istore          9
		else
	//*  22   37:goto            40
	//*  23   40:iload           9
	//*  24   42:invokestatic    #125 <Method void bnf.b(boolean)>
	//*  25   45:aload_0         
	//*  26   46:lload_1         
	//*  27   47:invokevirtual   #127 <Method void a(long)>
	//*  28   50:aload_0         
	//*  29   51:getfield        #41  <Field long[] f>
	//*  30   54:aload_0         
	//*  31   55:getfield        #118 <Field int l>
	//*  32   58:lload_1         
	//*  33   59:lastore         
	//*  34   60:aload_0         
	//*  35   61:getfield        #39  <Field long[] c>
	//*  36   64:aload_0         
	//*  37   65:getfield        #118 <Field int l>
	//*  38   68:lload           4
	//*  39   70:lastore         
	//*  40   71:aload_0         
	//*  41   72:getfield        #45  <Field int[] d>
	//*  42   75:aload_0         
	//*  43   76:getfield        #118 <Field int l>
	//*  44   79:iload           6
	//*  45   81:iastore         
	//*  46   82:aload_0         
	//*  47   83:getfield        #43  <Field int[] e>
	//*  48   86:aload_0         
	//*  49   87:getfield        #118 <Field int l>
	//*  50   90:iload_3         
	//*  51   91:iastore         
	//*  52   92:aload_0         
	//*  53   93:getfield        #49  <Field bfx[] g>
	//*  54   96:aload_0         
	//*  55   97:getfield        #118 <Field int l>
	//*  56  100:aload           7
	//*  57  102:aastore         
	//*  58  103:aload_0         
	//*  59  104:getfield        #53  <Field zzfs[] h>
	//*  60  107:aload_0         
	//*  61  108:getfield        #118 <Field int l>
	//*  62  111:aload_0         
	//*  63  112:getfield        #75  <Field zzfs q>
	//*  64  115:aastore         
	//*  65  116:aload_0         
	//*  66  117:getfield        #37  <Field int[] b>
	//*  67  120:aload_0         
	//*  68  121:getfield        #118 <Field int l>
	//*  69  124:iconst_0        
	//*  70  125:iastore         
	//*  71  126:aload_0         
	//*  72  127:aload_0         
	//*  73  128:getfield        #104 <Field int i>
	//*  74  131:iconst_1        
	//*  75  132:iadd            
	//*  76  133:putfield        #104 <Field int i>
	//*  77  136:aload_0         
	//*  78  137:getfield        #104 <Field int i>
	//*  79  140:aload_0         
	//*  80  141:getfield        #35  <Field int a>
	//*  81  144:icmpne          491
	//*  82  147:aload_0         
	//*  83  148:getfield        #35  <Field int a>
	//*  84  151:sipush          1000
	//*  85  154:iadd            
	//*  86  155:istore_3        
	//*  87  156:iload_3         
	//*  88  157:newarray        int[]
	//*  89  159:astore          7
	//*  90  161:iload_3         
	//*  91  162:newarray        long[]
	//*  92  164:astore          10
	//*  93  166:iload_3         
	//*  94  167:newarray        long[]
	//*  95  169:astore          11
	//*  96  171:iload_3         
	//*  97  172:newarray        int[]
	//*  98  174:astore          12
	//*  99  176:iload_3         
	//* 100  177:newarray        int[]
	//* 101  179:astore          13
	//* 102  181:iload_3         
	//* 103  182:anewarray       bfx[]
	//* 104  185:astore          14
	//* 105  187:iload_3         
	//* 106  188:anewarray       zzfs[]
	//* 107  191:astore          15
	//* 108  193:aload_0         
	//* 109  194:getfield        #35  <Field int a>
	//* 110  197:aload_0         
	//* 111  198:getfield        #81  <Field int k>
	//* 112  201:isub            
	//* 113  202:istore          6
	//* 114  204:aload_0         
	//* 115  205:getfield        #39  <Field long[] c>
	//* 116  208:aload_0         
	//* 117  209:getfield        #81  <Field int k>
	//* 118  212:aload           10
	//* 119  214:iconst_0        
	//* 120  215:iload           6
	//* 121  217:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 122  220:aload_0         
	//* 123  221:getfield        #41  <Field long[] f>
	//* 124  224:aload_0         
	//* 125  225:getfield        #81  <Field int k>
	//* 126  228:aload           11
	//* 127  230:iconst_0        
	//* 128  231:iload           6
	//* 129  233:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 130  236:aload_0         
	//* 131  237:getfield        #43  <Field int[] e>
	//* 132  240:aload_0         
	//* 133  241:getfield        #81  <Field int k>
	//* 134  244:aload           12
	//* 135  246:iconst_0        
	//* 136  247:iload           6
	//* 137  249:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 138  252:aload_0         
	//* 139  253:getfield        #45  <Field int[] d>
	//* 140  256:aload_0         
	//* 141  257:getfield        #81  <Field int k>
	//* 142  260:aload           13
	//* 143  262:iconst_0        
	//* 144  263:iload           6
	//* 145  265:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 146  268:aload_0         
	//* 147  269:getfield        #49  <Field bfx[] g>
	//* 148  272:aload_0         
	//* 149  273:getfield        #81  <Field int k>
	//* 150  276:aload           14
	//* 151  278:iconst_0        
	//* 152  279:iload           6
	//* 153  281:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 154  284:aload_0         
	//* 155  285:getfield        #53  <Field zzfs[] h>
	//* 156  288:aload_0         
	//* 157  289:getfield        #81  <Field int k>
	//* 158  292:aload           15
	//* 159  294:iconst_0        
	//* 160  295:iload           6
	//* 161  297:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 162  300:aload_0         
	//* 163  301:getfield        #37  <Field int[] b>
	//* 164  304:aload_0         
	//* 165  305:getfield        #81  <Field int k>
	//* 166  308:aload           7
	//* 167  310:iconst_0        
	//* 168  311:iload           6
	//* 169  313:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 170  316:aload_0         
	//* 171  317:getfield        #81  <Field int k>
	//* 172  320:istore          8
	//* 173  322:aload_0         
	//* 174  323:getfield        #39  <Field long[] c>
	//* 175  326:iconst_0        
	//* 176  327:aload           10
	//* 177  329:iload           6
	//* 178  331:iload           8
	//* 179  333:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 180  336:aload_0         
	//* 181  337:getfield        #41  <Field long[] f>
	//* 182  340:iconst_0        
	//* 183  341:aload           11
	//* 184  343:iload           6
	//* 185  345:iload           8
	//* 186  347:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 187  350:aload_0         
	//* 188  351:getfield        #43  <Field int[] e>
	//* 189  354:iconst_0        
	//* 190  355:aload           12
	//* 191  357:iload           6
	//* 192  359:iload           8
	//* 193  361:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 194  364:aload_0         
	//* 195  365:getfield        #45  <Field int[] d>
	//* 196  368:iconst_0        
	//* 197  369:aload           13
	//* 198  371:iload           6
	//* 199  373:iload           8
	//* 200  375:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 201  378:aload_0         
	//* 202  379:getfield        #49  <Field bfx[] g>
	//* 203  382:iconst_0        
	//* 204  383:aload           14
	//* 205  385:iload           6
	//* 206  387:iload           8
	//* 207  389:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 208  392:aload_0         
	//* 209  393:getfield        #53  <Field zzfs[] h>
	//* 210  396:iconst_0        
	//* 211  397:aload           15
	//* 212  399:iload           6
	//* 213  401:iload           8
	//* 214  403:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 215  406:aload_0         
	//* 216  407:getfield        #37  <Field int[] b>
	//* 217  410:iconst_0        
	//* 218  411:aload           7
	//* 219  413:iload           6
	//* 220  415:iload           8
	//* 221  417:invokestatic    #133 <Method void System.arraycopy(Object, int, Object, int, int)>
	//* 222  420:aload_0         
	//* 223  421:aload           10
	//* 224  423:putfield        #39  <Field long[] c>
	//* 225  426:aload_0         
	//* 226  427:aload           11
	//* 227  429:putfield        #41  <Field long[] f>
	//* 228  432:aload_0         
	//* 229  433:aload           12
	//* 230  435:putfield        #43  <Field int[] e>
	//* 231  438:aload_0         
	//* 232  439:aload           13
	//* 233  441:putfield        #45  <Field int[] d>
	//* 234  444:aload_0         
	//* 235  445:aload           14
	//* 236  447:putfield        #49  <Field bfx[] g>
	//* 237  450:aload_0         
	//* 238  451:aload           15
	//* 239  453:putfield        #53  <Field zzfs[] h>
	//* 240  456:aload_0         
	//* 241  457:aload           7
	//* 242  459:putfield        #37  <Field int[] b>
	//* 243  462:aload_0         
	//* 244  463:iconst_0        
	//* 245  464:putfield        #81  <Field int k>
	//* 246  467:aload_0         
	//* 247  468:aload_0         
	//* 248  469:getfield        #35  <Field int a>
	//* 249  472:putfield        #118 <Field int l>
	//* 250  475:aload_0         
	//* 251  476:aload_0         
	//* 252  477:getfield        #35  <Field int a>
	//* 253  480:putfield        #104 <Field int i>
	//* 254  483:aload_0         
	//* 255  484:iload_3         
	//* 256  485:putfield        #35  <Field int a>
	//* 257  488:aload_0         
	//* 258  489:monitorexit     
	//* 259  490:return          
	//* 260  491:aload_0         
	//* 261  492:aload_0         
	//* 262  493:getfield        #118 <Field int l>
	//* 263  496:iconst_1        
	//* 264  497:iadd            
	//* 265  498:putfield        #118 <Field int l>
	//* 266  501:aload_0         
	//* 267  502:getfield        #118 <Field int l>
	//* 268  505:aload_0         
	//* 269  506:getfield        #35  <Field int a>
	//* 270  509:icmpne          517
	//* 271  512:aload_0         
	//* 272  513:iconst_0        
	//* 273  514:putfield        #118 <Field int l>
	//* 274  517:aload_0         
	//* 275  518:monitorexit     
	//* 276  519:return          
	//* 277  520:astore          7
	//* 278  522:aload_0         
	//* 279  523:monitorexit     
	//* 280  524:aload           7
	//* 281  526:athrow          
			flag = false;
	//  282  527:iconst_0        
	//  283  528:istore          9
		bnf.b(flag);
		a(l1);
		f[l] = l1;
		c[l] = l2;
		d[l] = j1;
		e[l] = i1;
		g[l] = bfx1;
		h[l] = q;
		b[l] = 0;
		i = i + 1;
		if(i != a)
			break MISSING_BLOCK_LABEL_491;
		i1 = a + 1000;
		bfx1 = ((bfx) (new int[i1]));
		al = new long[i1];
		al1 = new long[i1];
		ai = new int[i1];
		ai1 = new int[i1];
		abfx = new bfx[i1];
		azzfs = new zzfs[i1];
		j1 = a - k;
		System.arraycopy(((Object) (c)), k, ((Object) (al)), 0, j1);
		System.arraycopy(((Object) (f)), k, ((Object) (al1)), 0, j1);
		System.arraycopy(((Object) (e)), k, ((Object) (ai)), 0, j1);
		System.arraycopy(((Object) (d)), k, ((Object) (ai1)), 0, j1);
		System.arraycopy(((Object) (g)), k, ((Object) (abfx)), 0, j1);
		System.arraycopy(((Object) (h)), k, ((Object) (azzfs)), 0, j1);
		System.arraycopy(((Object) (b)), k, ((Object) (bfx1)), 0, j1);
		k1 = k;
		System.arraycopy(((Object) (c)), 0, ((Object) (al)), j1, k1);
		System.arraycopy(((Object) (f)), 0, ((Object) (al1)), j1, k1);
		System.arraycopy(((Object) (e)), 0, ((Object) (ai)), j1, k1);
		System.arraycopy(((Object) (d)), 0, ((Object) (ai1)), j1, k1);
		System.arraycopy(((Object) (g)), 0, ((Object) (abfx)), j1, k1);
		System.arraycopy(((Object) (h)), 0, ((Object) (azzfs)), j1, k1);
		System.arraycopy(((Object) (b)), 0, ((Object) (bfx1)), j1, k1);
		c = al;
		f = al1;
		e = ai;
		d = ai1;
		g = abfx;
		h = azzfs;
		b = ((int []) (bfx1));
		k = 0;
		l = a;
		i = a;
		a = i1;
		this;
		JVM INSTR monitorexit ;
		return;
		l = l + 1;
		if(l == a)
			l = 0;
		this;
		JVM INSTR monitorexit ;
		return;
		bfx1;
		throw bfx1;
	//* 284  530:goto            40
	}

	public final boolean a(zzfs zzfs1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzfs1 != null)
			break MISSING_BLOCK_LABEL_15;
	//    2    2:aload_1         
	//    3    3:ifnonnull       15
		p = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #61  <Field boolean p>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return false;
	//    9   13:iconst_0        
	//   10   14:ireturn         
		boolean flag;
		p = false;
	//   11   15:aload_0         
	//   12   16:iconst_0        
	//   13   17:putfield        #61  <Field boolean p>
		flag = bnw.a(((Object) (zzfs1)), ((Object) (q)));
	//   14   20:aload_1         
	//   15   21:aload_0         
	//   16   22:getfield        #75  <Field zzfs q>
	//   17   25:invokestatic    #139 <Method boolean bnw.a(Object, Object)>
	//   18   28:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_37;
	//   19   29:iload_2         
	//   20   30:ifeq            37
		this;
	//   21   33:aload_0         
		JVM INSTR monitorexit ;
	//   22   34:monitorexit     
		return false;
	//   23   35:iconst_0        
	//   24   36:ireturn         
		q = zzfs1;
	//   25   37:aload_0         
	//   26   38:aload_1         
	//   27   39:putfield        #75  <Field zzfs q>
		this;
	//   28   42:aload_0         
		JVM INSTR monitorexit ;
	//   29   43:monitorexit     
		return true;
	//   30   44:iconst_1        
	//   31   45:ireturn         
		zzfs1;
	//   32   46:astore_1        
	//*  33   47:aload_0         
		throw zzfs1;
	//   34   48:monitorexit     
	//   35   49:aload_1         
	//   36   50:athrow          
	}

	public final void b()
	{
		m = 0x0L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #54  <Long 0x0L>
	//    2    4:putfield        #57  <Field long m>
		n = 0x0L;
	//    3    7:aload_0         
	//    4    8:ldc2w           #54  <Long 0x0L>
	//    5   11:putfield        #59  <Field long n>
	//    6   14:return          
	}

	public final int c()
	{
		return j + i;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int j>
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field int i>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public final int d()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int j>
	//    2    4:ireturn         
	}

	public final boolean e()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i1 = i;
	//    2    2:aload_0         
	//    3    3:getfield        #104 <Field int i>
	//    4    6:istore_1        
		boolean flag;
		if(i1 != 0)
	//*   5    7:iload_1         
	//*   6    8:ifeq            17
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_2        
		else
	//*   9   13:aload_0         
	//*  10   14:monitorexit     
	//*  11   15:iload_2         
	//*  12   16:ireturn         
			flag = false;
	//   13   17:iconst_0        
	//   14   18:istore_2        
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  15   19:goto            13
		Exception exception;
		exception;
	//   16   22:astore_3        
	//*  17   23:aload_0         
		throw exception;
	//   18   24:monitorexit     
	//   19   25:aload_3         
	//   20   26:athrow          
	}

	public final zzfs f()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = p;
	//    2    2:aload_0         
	//    3    3:getfield        #61  <Field boolean p>
	//    4    6:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:iload_1         
	//    6    8:ifeq            15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return null;
	//    9   13:aconst_null     
	//   10   14:areturn         
		zzfs zzfs1 = q;
	//   11   15:aload_0         
	//   12   16:getfield        #75  <Field zzfs q>
	//   13   19:astore_2        
		this;
	//   14   20:aload_0         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		return zzfs1;
	//   16   22:aload_2         
	//   17   23:areturn         
		Exception exception;
		exception;
	//   18   24:astore_2        
	//*  19   25:aload_0         
		throw exception;
	//   20   26:monitorexit     
	//   21   27:aload_2         
	//   22   28:athrow          
	}

	public final long g()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l1 = Math.max(m, n);
	//    2    2:aload_0         
	//    3    3:getfield        #57  <Field long m>
	//    4    6:aload_0         
	//    5    7:getfield        #59  <Field long n>
	//    6   10:invokestatic    #102 <Method long Math.max(long, long)>
	//    7   13:lstore_1        
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return l1;
	//   10   16:lload_1         
	//   11   17:lreturn         
		Exception exception;
		exception;
	//   12   18:astore_3        
	//*  13   19:aload_0         
		throw exception;
	//   14   20:monitorexit     
	//   15   21:aload_3         
	//   16   22:athrow          
	}

	public final long h()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = e();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #68  <Method boolean e()>
	//    4    6:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_17;
	//    5    7:iload_2         
	//    6    8:ifne            17
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return -1L;
	//    9   13:ldc2w           #120 <Long -1L>
	//   10   16:lreturn         
		int i1;
		long l1;
		i1 = ((k + i) - 1) % a;
	//   11   17:aload_0         
	//   12   18:getfield        #81  <Field int k>
	//   13   21:aload_0         
	//   14   22:getfield        #104 <Field int i>
	//   15   25:iadd            
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:aload_0         
	//   19   29:getfield        #35  <Field int a>
	//   20   32:irem            
	//   21   33:istore_1        
		k = (k + i) % a;
	//   22   34:aload_0         
	//   23   35:aload_0         
	//   24   36:getfield        #81  <Field int k>
	//   25   39:aload_0         
	//   26   40:getfield        #104 <Field int i>
	//   27   43:iadd            
	//   28   44:aload_0         
	//   29   45:getfield        #35  <Field int a>
	//   30   48:irem            
	//   31   49:putfield        #81  <Field int k>
		j = j + i;
	//   32   52:aload_0         
	//   33   53:aload_0         
	//   34   54:getfield        #106 <Field int j>
	//   35   57:aload_0         
	//   36   58:getfield        #104 <Field int i>
	//   37   61:iadd            
	//   38   62:putfield        #106 <Field int j>
		i = 0;
	//   39   65:aload_0         
	//   40   66:iconst_0        
	//   41   67:putfield        #104 <Field int i>
		l1 = c[i1];
	//   42   70:aload_0         
	//   43   71:getfield        #39  <Field long[] c>
	//   44   74:iload_1         
	//   45   75:laload          
	//   46   76:lstore_3        
		i1 = d[i1];
	//   47   77:aload_0         
	//   48   78:getfield        #45  <Field int[] d>
	//   49   81:iload_1         
	//   50   82:iaload          
	//   51   83:istore_1        
		long l2 = i1;
	//   52   84:iload_1         
	//   53   85:i2l             
	//   54   86:lstore          5
		this;
	//   55   88:aload_0         
		JVM INSTR monitorexit ;
	//   56   89:monitorexit     
		return l1 + l2;
	//   57   90:lload_3         
	//   58   91:lload           5
	//   59   93:ladd            
	//   60   94:lreturn         
		Exception exception;
		exception;
	//   61   95:astore          7
	//*  62   97:aload_0         
		throw exception;
	//   63   98:monitorexit     
	//   64   99:aload           7
	//   65  101:athrow          
	}

	private int a;
	private int b[];
	private long c[];
	private int d[];
	private int e[];
	private long f[];
	private bfx g[];
	private zzfs h[];
	private int i;
	private int j;
	private int k;
	private int l;
	private long m;
	private long n;
	private boolean o;
	private boolean p;
	private zzfs q;
}
