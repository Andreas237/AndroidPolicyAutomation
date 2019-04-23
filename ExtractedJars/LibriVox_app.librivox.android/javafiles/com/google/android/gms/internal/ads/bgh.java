// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bno, bfo

final class bgh
{

	public bgh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class bno>
	//    4    8:dup             
	//    5    9:bipush          8
	//    6   11:invokespecial   #17  <Method void bno(int)>
	//    7   14:putfield        #19  <Field bno a>
	//    8   17:return          
	}

	private final long b(bfo bfo1)
	{
		byte abyte0[] = a.a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field bno a>
	//    2    4:getfield        #24  <Field byte[] bno.a>
	//    3    7:astore          6
		int k = 0;
	//    4    9:iconst_0        
	//    5   10:istore          4
		bfo1.c(abyte0, 0, 1);
	//    6   12:aload_1         
	//    7   13:aload           6
	//    8   15:iconst_0        
	//    9   16:iconst_1        
	//   10   17:invokeinterface #30  <Method void bfo.c(byte[], int, int)>
		int l = a.a[0] & 0xff;
	//   11   22:aload_0         
	//   12   23:getfield        #19  <Field bno a>
	//   13   26:getfield        #24  <Field byte[] bno.a>
	//   14   29:iconst_0        
	//   15   30:baload          
	//   16   31:sipush          255
	//   17   34:iand            
	//   18   35:istore          5
		if(l == 0)
	//*  19   37:iload           5
	//*  20   39:ifne            46
			return 0x0L;
	//   21   42:ldc2w           #31  <Long 0x0L>
	//   22   45:lreturn         
		int j = 128;
	//   23   46:sipush          128
	//   24   49:istore_3        
		int i;
		for(i = 0; (l & j) == 0; i++)
	//*  25   50:iconst_0        
	//*  26   51:istore_2        
	//*  27   52:iload           5
	//*  28   54:iload_3         
	//*  29   55:iand            
	//*  30   56:ifne            70
			j >>= 1;
	//   31   59:iload_3         
	//   32   60:iconst_1        
	//   33   61:ishr            
	//   34   62:istore_3        

	//   35   63:iload_2         
	//   36   64:iconst_1        
	//   37   65:iadd            
	//   38   66:istore_2        
	//*  39   67:goto            52
		j = l & ~j;
	//   40   70:iload           5
	//   41   72:iload_3         
	//   42   73:iconst_m1       
	//   43   74:ixor            
	//   44   75:iand            
	//   45   76:istore_3        
		bfo1.c(a.a, 1, i);
	//   46   77:aload_1         
	//   47   78:aload_0         
	//   48   79:getfield        #19  <Field bno a>
	//   49   82:getfield        #24  <Field byte[] bno.a>
	//   50   85:iconst_1        
	//   51   86:iload_2         
	//   52   87:invokeinterface #30  <Method void bfo.c(byte[], int, int)>
		while(k < i) 
	//*  53   92:iload           4
	//*  54   94:iload_2         
	//*  55   95:icmpge          129
		{
			bfo1 = ((bfo) (a.a));
	//   56   98:aload_0         
	//   57   99:getfield        #19  <Field bno a>
	//   58  102:getfield        #24  <Field byte[] bno.a>
	//   59  105:astore_1        
			k++;
	//   60  106:iload           4
	//   61  108:iconst_1        
	//   62  109:iadd            
	//   63  110:istore          4
			j = (bfo1[k] & 0xff) + (j << 8);
	//   64  112:aload_1         
	//   65  113:iload           4
	//   66  115:baload          
	//   67  116:sipush          255
	//   68  119:iand            
	//   69  120:iload_3         
	//   70  121:bipush          8
	//   71  123:ishl            
	//   72  124:iadd            
	//   73  125:istore_3        
		}
	//*  74  126:goto            92
		b = b + (i + 1);
	//   75  129:aload_0         
	//   76  130:aload_0         
	//   77  131:getfield        #34  <Field int b>
	//   78  134:iload_2         
	//   79  135:iconst_1        
	//   80  136:iadd            
	//   81  137:iadd            
	//   82  138:putfield        #34  <Field int b>
		return (long)j;
	//   83  141:iload_3         
	//   84  142:i2l             
	//   85  143:lreturn         
	}

	public final boolean a(bfo bfo1)
	{
		long l1 = bfo1.c();
	//    0    0:aload_1         
	//    1    1:invokeinterface #38  <Method long bfo.c()>
	//    2    6:lstore          6
		long l4 = 1024L;
	//    3    8:ldc2w           #39  <Long 1024L>
	//    4   11:lstore          8
		long l = l4;
	//    5   13:lload           8
	//    6   15:lstore          4
		if(l1 != -1L)
	//*   7   17:lload           6
	//*   8   19:ldc2w           #41  <Long -1L>
	//*   9   22:lcmp            
	//*  10   23:ifeq            46
			if(l1 > 1024L)
	//*  11   26:lload           6
	//*  12   28:ldc2w           #39  <Long 1024L>
	//*  13   31:lcmp            
	//*  14   32:ifle            42
				l = l4;
	//   15   35:lload           8
	//   16   37:lstore          4
			else
	//*  17   39:goto            46
				l = l1;
	//   18   42:lload           6
	//   19   44:lstore          4
		int i = (int)l;
	//   20   46:lload           4
	//   21   48:l2i             
	//   22   49:istore_2        
		bfo1.c(a.a, 0, 4);
	//   23   50:aload_1         
	//   24   51:aload_0         
	//   25   52:getfield        #19  <Field bno a>
	//   26   55:getfield        #24  <Field byte[] bno.a>
	//   27   58:iconst_0        
	//   28   59:iconst_4        
	//   29   60:invokeinterface #30  <Method void bfo.c(byte[], int, int)>
		l = a.j();
	//   30   65:aload_0         
	//   31   66:getfield        #19  <Field bno a>
	//   32   69:invokevirtual   #45  <Method long bno.j()>
	//   33   72:lstore          4
		b = 4;
	//   34   74:aload_0         
	//   35   75:iconst_4        
	//   36   76:putfield        #34  <Field int b>
		for(; l != 0x1a45dfa3L; l = l << 8 & -256L | (long)(a.a[0] & 0xff))
	//*  37   79:lload           4
	//*  38   81:ldc2w           #46  <Long 0x1a45dfa3L>
	//*  39   84:lcmp            
	//*  40   85:ifeq            151
		{
			int k = b + 1;
	//   41   88:aload_0         
	//   42   89:getfield        #34  <Field int b>
	//   43   92:iconst_1        
	//   44   93:iadd            
	//   45   94:istore_3        
			b = k;
	//   46   95:aload_0         
	//   47   96:iload_3         
	//   48   97:putfield        #34  <Field int b>
			if(k == i)
	//*  49  100:iload_3         
	//*  50  101:iload_2         
	//*  51  102:icmpne          107
				return false;
	//   52  105:iconst_0        
	//   53  106:ireturn         
			bfo1.c(a.a, 0, 1);
	//   54  107:aload_1         
	//   55  108:aload_0         
	//   56  109:getfield        #19  <Field bno a>
	//   57  112:getfield        #24  <Field byte[] bno.a>
	//   58  115:iconst_0        
	//   59  116:iconst_1        
	//   60  117:invokeinterface #30  <Method void bfo.c(byte[], int, int)>
		}

	//   61  122:lload           4
	//   62  124:bipush          8
	//   63  126:lshl            
	//   64  127:ldc2w           #48  <Long -256L>
	//   65  130:land            
	//   66  131:aload_0         
	//   67  132:getfield        #19  <Field bno a>
	//   68  135:getfield        #24  <Field byte[] bno.a>
	//   69  138:iconst_0        
	//   70  139:baload          
	//   71  140:sipush          255
	//   72  143:iand            
	//   73  144:i2l             
	//   74  145:lor             
	//   75  146:lstore          4
	//*  76  148:goto            79
		l = b(bfo1);
	//   77  151:aload_0         
	//   78  152:aload_1         
	//   79  153:invokespecial   #51  <Method long b(bfo)>
	//   80  156:lstore          4
		l4 = b;
	//   81  158:aload_0         
	//   82  159:getfield        #34  <Field int b>
	//   83  162:i2l             
	//   84  163:lstore          8
		if(l != 0x0L)
	//*  85  165:lload           4
	//*  86  167:ldc2w           #31  <Long 0x0L>
	//*  87  170:lcmp            
	//*  88  171:ifeq            305
		{
			if(l1 != -1L && l4 + l >= l1)
	//*  89  174:lload           6
	//*  90  176:ldc2w           #41  <Long -1L>
	//*  91  179:lcmp            
	//*  92  180:ifeq            196
	//*  93  183:lload           8
	//*  94  185:lload           4
	//*  95  187:ladd            
	//*  96  188:lload           6
	//*  97  190:lcmp            
	//*  98  191:iflt            196
				return false;
	//   99  194:iconst_0        
	//  100  195:ireturn         
			do
			{
				int j = b;
	//  101  196:aload_0         
	//  102  197:getfield        #34  <Field int b>
	//  103  200:istore_2        
				long l2 = j;
	//  104  201:iload_2         
	//  105  202:i2l             
	//  106  203:lstore          6
				long l5 = l4 + l;
	//  107  205:lload           8
	//  108  207:lload           4
	//  109  209:ladd            
	//  110  210:lstore          10
				if(l2 < l5)
	//* 111  212:lload           6
	//* 112  214:lload           10
	//* 113  216:lcmp            
	//* 114  217:ifge            293
				{
					if(b(bfo1) == 0x0L)
	//* 115  220:aload_0         
	//* 116  221:aload_1         
	//* 117  222:invokespecial   #51  <Method long b(bfo)>
	//* 118  225:ldc2w           #31  <Long 0x0L>
	//* 119  228:lcmp            
	//* 120  229:ifne            234
						return false;
	//  121  232:iconst_0        
	//  122  233:ireturn         
					long l3 = b(bfo1);
	//  123  234:aload_0         
	//  124  235:aload_1         
	//  125  236:invokespecial   #51  <Method long b(bfo)>
	//  126  239:lstore          6
					if(l3 >= 0L)
	//* 127  241:lload           6
	//* 128  243:lconst_0        
	//* 129  244:lcmp            
	//* 130  245:iflt            291
					{
						if(l3 > 0x7fffffffL)
	//* 131  248:lload           6
	//* 132  250:ldc2w           #52  <Long 0x7fffffffL>
	//* 133  253:lcmp            
	//* 134  254:ifle            259
							return false;
	//  135  257:iconst_0        
	//  136  258:ireturn         
						if(l3 != 0L)
	//* 137  259:lload           6
	//* 138  261:lconst_0        
	//* 139  262:lcmp            
	//* 140  263:ifeq            196
						{
							bfo1.c((int)l3);
	//  141  266:aload_1         
	//  142  267:lload           6
	//  143  269:l2i             
	//  144  270:invokeinterface #55  <Method void bfo.c(int)>
							b = (int)((long)b + l3);
	//  145  275:aload_0         
	//  146  276:aload_0         
	//  147  277:getfield        #34  <Field int b>
	//  148  280:i2l             
	//  149  281:lload           6
	//  150  283:ladd            
	//  151  284:l2i             
	//  152  285:putfield        #34  <Field int b>
						}
					} else
	//* 153  288:goto            196
					{
						return false;
	//  154  291:iconst_0        
	//  155  292:ireturn         
					}
				} else
				{
					return (long)j == l5;
	//  156  293:iload_2         
	//  157  294:i2l             
	//  158  295:lload           10
	//  159  297:lcmp            
	//  160  298:ifne            303
	//  161  301:iconst_1        
	//  162  302:ireturn         
	//  163  303:iconst_0        
	//  164  304:ireturn         
				}
			} while(true);
		} else
		{
			return false;
	//  165  305:iconst_0        
	//  166  306:ireturn         
		}
	}

	private final bno a = new bno(8);
	private int b;
}
