// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c.e;

import android.util.Log;
import com.google.ads.interactivemedia.v3.a.c.g;
import com.google.ads.interactivemedia.v3.a.f.l;
import com.google.ads.interactivemedia.v3.a.f.m;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.c.e:
//			o, m, e

private static final class o$b extends o$d
{

	private void a(int i1)
	{
		d = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int d>
		e = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #46  <Field int e>
	//    6   10:return          
	}

	private boolean a(m m1, byte abyte0[], int i1)
	{
		int j1 = Math.min(m1.b(), i1 - e);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int m.b()>
	//    2    4:iload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field int e>
	//    5    9:isub            
	//    6   10:invokestatic    #58  <Method int Math.min(int, int)>
	//    7   13:istore          4
		if(j1 <= 0)
	//*   8   15:iload           4
	//*   9   17:ifgt            22
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		if(abyte0 == null)
	//*  12   22:aload_2         
	//*  13   23:ifnonnull       35
			m1.d(j1);
	//   14   26:aload_1         
	//   15   27:iload           4
	//   16   29:invokevirtual   #60  <Method void m.d(int)>
		else
	//*  17   32:goto            46
			m1.a(abyte0, e, j1);
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:aload_0         
	//   21   38:getfield        #46  <Field int e>
	//   22   41:iload           4
	//   23   43:invokevirtual   #63  <Method void m.a(byte[], int, int)>
		e = e + j1;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #46  <Field int e>
	//   27   51:iload           4
	//   28   53:iadd            
	//   29   54:putfield        #46  <Field int e>
		return e == i1;
	//   30   57:aload_0         
	//   31   58:getfield        #46  <Field int e>
	//   32   61:iload_3         
	//   33   62:icmpne          67
	//   34   65:iconst_1        
	//   35   66:ireturn         
	//   36   67:iconst_0        
	//   37   68:ireturn         
	}

	private boolean b()
	{
		c.a(0);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field l c>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #66  <Method void l.a(int)>
		int i1 = c.c(24);
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field l c>
	//    6   12:bipush          24
	//    7   14:invokevirtual   #69  <Method int l.c(int)>
	//    8   17:istore_1        
		if(i1 != 1)
	//*   9   18:iload_1         
	//*  10   19:iconst_1        
	//*  11   20:icmpeq          63
		{
			StringBuilder stringbuilder = new StringBuilder(41);
	//   12   23:new             #71  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:bipush          41
	//   15   29:invokespecial   #73  <Method void StringBuilder(int)>
	//   16   32:astore_2        
			stringbuilder.append("Unexpected start code prefix: ");
	//   17   33:aload_2         
	//   18   34:ldc1            #75  <String "Unexpected start code prefix: ">
	//   19   36:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append(i1);
	//   21   40:aload_2         
	//   22   41:iload_1         
	//   23   42:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
			Log.w("TsExtractor", stringbuilder.toString());
	//   25   46:ldc1            #84  <String "TsExtractor">
	//   26   48:aload_2         
	//   27   49:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #94  <Method int Log.w(String, String)>
	//   29   55:pop             
			j = -1;
	//   30   56:aload_0         
	//   31   57:iconst_m1       
	//   32   58:putfield        #96  <Field int j>
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		}
		c.b(8);
	//   35   63:aload_0         
	//   36   64:getfield        #40  <Field l c>
	//   37   67:bipush          8
	//   38   69:invokevirtual   #98  <Method void l.b(int)>
		i1 = c.c(16);
	//   39   72:aload_0         
	//   40   73:getfield        #40  <Field l c>
	//   41   76:bipush          16
	//   42   78:invokevirtual   #69  <Method int l.c(int)>
	//   43   81:istore_1        
		c.b(5);
	//   44   82:aload_0         
	//   45   83:getfield        #40  <Field l c>
	//   46   86:iconst_5        
	//   47   87:invokevirtual   #98  <Method void l.b(int)>
		k = c.b();
	//   48   90:aload_0         
	//   49   91:aload_0         
	//   50   92:getfield        #40  <Field l c>
	//   51   95:invokevirtual   #100 <Method boolean l.b()>
	//   52   98:putfield        #102 <Field boolean k>
		c.b(2);
	//   53  101:aload_0         
	//   54  102:getfield        #40  <Field l c>
	//   55  105:iconst_2        
	//   56  106:invokevirtual   #98  <Method void l.b(int)>
		f = c.b();
	//   57  109:aload_0         
	//   58  110:aload_0         
	//   59  111:getfield        #40  <Field l c>
	//   60  114:invokevirtual   #100 <Method boolean l.b()>
	//   61  117:putfield        #104 <Field boolean f>
		g = c.b();
	//   62  120:aload_0         
	//   63  121:aload_0         
	//   64  122:getfield        #40  <Field l c>
	//   65  125:invokevirtual   #100 <Method boolean l.b()>
	//   66  128:putfield        #106 <Field boolean g>
		c.b(6);
	//   67  131:aload_0         
	//   68  132:getfield        #40  <Field l c>
	//   69  135:bipush          6
	//   70  137:invokevirtual   #98  <Method void l.b(int)>
		i = c.c(8);
	//   71  140:aload_0         
	//   72  141:aload_0         
	//   73  142:getfield        #40  <Field l c>
	//   74  145:bipush          8
	//   75  147:invokevirtual   #69  <Method int l.c(int)>
	//   76  150:putfield        #108 <Field int i>
		if(i1 == 0)
	//*  77  153:iload_1         
	//*  78  154:ifne            164
		{
			j = -1;
	//   79  157:aload_0         
	//   80  158:iconst_m1       
	//   81  159:putfield        #96  <Field int j>
			return true;
	//   82  162:iconst_1        
	//   83  163:ireturn         
		} else
		{
			j = (i1 + 6) - 9 - i;
	//   84  164:aload_0         
	//   85  165:iload_1         
	//   86  166:bipush          6
	//   87  168:iadd            
	//   88  169:bipush          9
	//   89  171:isub            
	//   90  172:aload_0         
	//   91  173:getfield        #108 <Field int i>
	//   92  176:isub            
	//   93  177:putfield        #96  <Field int j>
			return true;
	//   94  180:iconst_1        
	//   95  181:ireturn         
		}
	}

	private void c()
	{
		c.a(0);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field l c>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #66  <Method void l.a(int)>
		l = -1L;
	//    4    8:aload_0         
	//    5    9:ldc2w           #110 <Long -1L>
	//    6   12:putfield        #113 <Field long l>
		if(f)
	//*   7   15:aload_0         
	//*   8   16:getfield        #104 <Field boolean f>
	//*   9   19:ifeq            218
		{
			c.b(4);
	//   10   22:aload_0         
	//   11   23:getfield        #40  <Field l c>
	//   12   26:iconst_4        
	//   13   27:invokevirtual   #98  <Method void l.b(int)>
			long l1 = c.c(3);
	//   14   30:aload_0         
	//   15   31:getfield        #40  <Field l c>
	//   16   34:iconst_3        
	//   17   35:invokevirtual   #69  <Method int l.c(int)>
	//   18   38:i2l             
	//   19   39:lstore_1        
			c.b(1);
	//   20   40:aload_0         
	//   21   41:getfield        #40  <Field l c>
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #98  <Method void l.b(int)>
			long l2 = c.c(15) << 15;
	//   24   48:aload_0         
	//   25   49:getfield        #40  <Field l c>
	//   26   52:bipush          15
	//   27   54:invokevirtual   #69  <Method int l.c(int)>
	//   28   57:bipush          15
	//   29   59:ishl            
	//   30   60:i2l             
	//   31   61:lstore_3        
			c.b(1);
	//   32   62:aload_0         
	//   33   63:getfield        #40  <Field l c>
	//   34   66:iconst_1        
	//   35   67:invokevirtual   #98  <Method void l.b(int)>
			long l3 = c.c(15);
	//   36   70:aload_0         
	//   37   71:getfield        #40  <Field l c>
	//   38   74:bipush          15
	//   39   76:invokevirtual   #69  <Method int l.c(int)>
	//   40   79:i2l             
	//   41   80:lstore          5
			c.b(1);
	//   42   82:aload_0         
	//   43   83:getfield        #40  <Field l c>
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #98  <Method void l.b(int)>
			if(!h && g)
	//*  46   90:aload_0         
	//*  47   91:getfield        #115 <Field boolean h>
	//*  48   94:ifne            198
	//*  49   97:aload_0         
	//*  50   98:getfield        #106 <Field boolean g>
	//*  51  101:ifeq            198
			{
				c.b(4);
	//   52  104:aload_0         
	//   53  105:getfield        #40  <Field l c>
	//   54  108:iconst_4        
	//   55  109:invokevirtual   #98  <Method void l.b(int)>
				long l4 = c.c(3);
	//   56  112:aload_0         
	//   57  113:getfield        #40  <Field l c>
	//   58  116:iconst_3        
	//   59  117:invokevirtual   #69  <Method int l.c(int)>
	//   60  120:i2l             
	//   61  121:lstore          7
				c.b(1);
	//   62  123:aload_0         
	//   63  124:getfield        #40  <Field l c>
	//   64  127:iconst_1        
	//   65  128:invokevirtual   #98  <Method void l.b(int)>
				long l5 = c.c(15) << 15;
	//   66  131:aload_0         
	//   67  132:getfield        #40  <Field l c>
	//   68  135:bipush          15
	//   69  137:invokevirtual   #69  <Method int l.c(int)>
	//   70  140:bipush          15
	//   71  142:ishl            
	//   72  143:i2l             
	//   73  144:lstore          9
				c.b(1);
	//   74  146:aload_0         
	//   75  147:getfield        #40  <Field l c>
	//   76  150:iconst_1        
	//   77  151:invokevirtual   #98  <Method void l.b(int)>
				long l6 = c.c(15);
	//   78  154:aload_0         
	//   79  155:getfield        #40  <Field l c>
	//   80  158:bipush          15
	//   81  160:invokevirtual   #69  <Method int l.c(int)>
	//   82  163:i2l             
	//   83  164:lstore          11
				c.b(1);
	//   84  166:aload_0         
	//   85  167:getfield        #40  <Field l c>
	//   86  170:iconst_1        
	//   87  171:invokevirtual   #98  <Method void l.b(int)>
				b.a(l4 << 30 | l5 | l6);
	//   88  174:aload_0         
	//   89  175:getfield        #33  <Field com.google.ads.interactivemedia.v3.a.c.e.m b>
	//   90  178:lload           7
	//   91  180:bipush          30
	//   92  182:lshl            
	//   93  183:lload           9
	//   94  185:lor             
	//   95  186:lload           11
	//   96  188:lor             
	//   97  189:invokevirtual   #120 <Method long m.a(long)>
	//   98  192:pop2            
				h = true;
	//   99  193:aload_0         
	//  100  194:iconst_1        
	//  101  195:putfield        #115 <Field boolean h>
			}
			l = b.a(l1 << 30 | l2 | l3);
	//  102  198:aload_0         
	//  103  199:aload_0         
	//  104  200:getfield        #33  <Field com.google.ads.interactivemedia.v3.a.c.e.m b>
	//  105  203:lload_1         
	//  106  204:bipush          30
	//  107  206:lshl            
	//  108  207:lload_3         
	//  109  208:lor             
	//  110  209:lload           5
	//  111  211:lor             
	//  112  212:invokevirtual   #120 <Method long m.a(long)>
	//  113  215:putfield        #113 <Field long l>
		}
	//  114  218:return          
	}

	public void a()
	{
		d = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #42  <Field int d>
		e = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #46  <Field int e>
		h = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #115 <Field boolean h>
		a.a();
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field e a>
	//   11   19:invokevirtual   #124 <Method void e.a()>
	//   12   22:return          
	}

	public void a(m m1, boolean flag, g g1)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            119
		{
			switch(d)
	//*   2    4:aload_0         
	//*   3    5:getfield        #42  <Field int d>
			{
	//*   4    8:tableswitch     0 3: default 40
	//	               0 114
	//	               1 114
	//	               2 106
	//	               3 43
	//*   5   40:goto            114
			case 3: // '\003'
				int i1 = j;
	//    6   43:aload_0         
	//    7   44:getfield        #96  <Field int j>
	//    8   47:istore          4
				if(i1 != -1)
	//*   9   49:iload           4
	//*  10   51:iconst_m1       
	//*  11   52:icmpeq          96
				{
					g1 = ((g) (new StringBuilder(59)));
	//   12   55:new             #71  <Class StringBuilder>
	//   13   58:dup             
	//   14   59:bipush          59
	//   15   61:invokespecial   #73  <Method void StringBuilder(int)>
	//   16   64:astore_3        
					((StringBuilder) (g1)).append("Unexpected start indicator: expected ");
	//   17   65:aload_3         
	//   18   66:ldc1            #127 <String "Unexpected start indicator: expected ">
	//   19   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   20   71:pop             
					((StringBuilder) (g1)).append(i1);
	//   21   72:aload_3         
	//   22   73:iload           4
	//   23   75:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   24   78:pop             
					((StringBuilder) (g1)).append(" more bytes");
	//   25   79:aload_3         
	//   26   80:ldc1            #129 <String " more bytes">
	//   27   82:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   28   85:pop             
					Log.w("TsExtractor", ((StringBuilder) (g1)).toString());
	//   29   86:ldc1            #84  <String "TsExtractor">
	//   30   88:aload_3         
	//   31   89:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   32   92:invokestatic    #94  <Method int Log.w(String, String)>
	//   33   95:pop             
				}
				a.b();
	//   34   96:aload_0         
	//   35   97:getfield        #31  <Field e a>
	//   36  100:invokevirtual   #131 <Method void e.b()>
				break;

	//*  37  103:goto            114
			case 2: // '\002'
				Log.w("TsExtractor", "Unexpected start indicator reading extended header");
	//   38  106:ldc1            #84  <String "TsExtractor">
	//   39  108:ldc1            #133 <String "Unexpected start indicator reading extended header">
	//   40  110:invokestatic    #94  <Method int Log.w(String, String)>
	//   41  113:pop             
				break;
			}
			a(1);
	//   42  114:aload_0         
	//   43  115:iconst_1        
	//   44  116:invokespecial   #134 <Method void a(int)>
		}
		do
		{
			if(m1.b() <= 0)
				break;
	//   45  119:aload_1         
	//   46  120:invokevirtual   #52  <Method int m.b()>
	//   47  123:ifle            396
			int l1 = d;
	//   48  126:aload_0         
	//   49  127:getfield        #42  <Field int d>
	//   50  130:istore          6
			int j1 = 0;
	//   51  132:iconst_0        
	//   52  133:istore          4
			int k1 = 0;
	//   53  135:iconst_0        
	//   54  136:istore          5
			switch(l1)
	//*  55  138:iload           6
			{
	//*  56  140:tableswitch     0 3: default 172
	//	               0 385
	//	               1 349
	//	               2 281
	//	               3 175
	//*  57  172:goto            119
			case 3: // '\003'
				int i2 = m1.b();
	//   58  175:aload_1         
	//   59  176:invokevirtual   #52  <Method int m.b()>
	//   60  179:istore          6
				j1 = j;
	//   61  181:aload_0         
	//   62  182:getfield        #96  <Field int j>
	//   63  185:istore          4
				if(j1 != -1)
	//*  64  187:iload           4
	//*  65  189:iconst_m1       
	//*  66  190:icmpne          196
	//*  67  193:goto            203
					k1 = i2 - j1;
	//   68  196:iload           6
	//   69  198:iload           4
	//   70  200:isub            
	//   71  201:istore          5
				j1 = i2;
	//   72  203:iload           6
	//   73  205:istore          4
				if(k1 > 0)
	//*  74  207:iload           5
	//*  75  209:ifle            230
				{
					j1 = i2 - k1;
	//   76  212:iload           6
	//   77  214:iload           5
	//   78  216:isub            
	//   79  217:istore          4
					m1.b(m1.d() + j1);
	//   80  219:aload_1         
	//   81  220:aload_1         
	//   82  221:invokevirtual   #136 <Method int m.d()>
	//   83  224:iload           4
	//   84  226:iadd            
	//   85  227:invokevirtual   #137 <Method void m.b(int)>
				}
				a.a(m1);
	//   86  230:aload_0         
	//   87  231:getfield        #31  <Field e a>
	//   88  234:aload_1         
	//   89  235:invokevirtual   #140 <Method void e.a(m)>
				k1 = j;
	//   90  238:aload_0         
	//   91  239:getfield        #96  <Field int j>
	//   92  242:istore          5
				if(k1 != -1)
	//*  93  244:iload           5
	//*  94  246:iconst_m1       
	//*  95  247:icmpeq          119
				{
					j = k1 - j1;
	//   96  250:aload_0         
	//   97  251:iload           5
	//   98  253:iload           4
	//   99  255:isub            
	//  100  256:putfield        #96  <Field int j>
					if(j == 0)
	//* 101  259:aload_0         
	//* 102  260:getfield        #96  <Field int j>
	//* 103  263:ifne            119
					{
						a.b();
	//  104  266:aload_0         
	//  105  267:getfield        #31  <Field e a>
	//  106  270:invokevirtual   #131 <Method void e.b()>
						a(1);
	//  107  273:aload_0         
	//  108  274:iconst_1        
	//  109  275:invokespecial   #134 <Method void a(int)>
					}
				}
				break;

	//* 110  278:goto            119
			case 2: // '\002'
				j1 = Math.min(10, i);
	//  111  281:bipush          10
	//  112  283:aload_0         
	//  113  284:getfield        #108 <Field int i>
	//  114  287:invokestatic    #58  <Method int Math.min(int, int)>
	//  115  290:istore          4
				if(a(m1, c.a, j1) && a(m1, ((byte []) (null)), i))
	//* 116  292:aload_0         
	//* 117  293:aload_1         
	//* 118  294:aload_0         
	//* 119  295:getfield        #40  <Field l c>
	//* 120  298:getfield        #143 <Field byte[] l.a>
	//* 121  301:iload           4
	//* 122  303:invokespecial   #145 <Method boolean a(m, byte[], int)>
	//* 123  306:ifeq            119
	//* 124  309:aload_0         
	//* 125  310:aload_1         
	//* 126  311:aconst_null     
	//* 127  312:aload_0         
	//* 128  313:getfield        #108 <Field int i>
	//* 129  316:invokespecial   #145 <Method boolean a(m, byte[], int)>
	//* 130  319:ifeq            119
				{
					c();
	//  131  322:aload_0         
	//  132  323:invokespecial   #147 <Method void c()>
					a.a(l, k);
	//  133  326:aload_0         
	//  134  327:getfield        #31  <Field e a>
	//  135  330:aload_0         
	//  136  331:getfield        #113 <Field long l>
	//  137  334:aload_0         
	//  138  335:getfield        #102 <Field boolean k>
	//  139  338:invokevirtual   #150 <Method void e.a(long, boolean)>
					a(3);
	//  140  341:aload_0         
	//  141  342:iconst_3        
	//  142  343:invokespecial   #134 <Method void a(int)>
				}
				break;

	//* 143  346:goto            119
			case 1: // '\001'
				if(a(m1, c.a, 9))
	//* 144  349:aload_0         
	//* 145  350:aload_1         
	//* 146  351:aload_0         
	//* 147  352:getfield        #40  <Field l c>
	//* 148  355:getfield        #143 <Field byte[] l.a>
	//* 149  358:bipush          9
	//* 150  360:invokespecial   #145 <Method boolean a(m, byte[], int)>
	//* 151  363:ifeq            119
				{
					if(b())
	//* 152  366:aload_0         
	//* 153  367:invokespecial   #151 <Method boolean b()>
	//* 154  370:ifeq            376
						j1 = 2;
	//  155  373:iconst_2        
	//  156  374:istore          4
					a(j1);
	//  157  376:aload_0         
	//  158  377:iload           4
	//  159  379:invokespecial   #134 <Method void a(int)>
				}
				break;

	//* 160  382:goto            119
			case 0: // '\0'
				m1.d(m1.b());
	//  161  385:aload_1         
	//  162  386:aload_1         
	//  163  387:invokevirtual   #52  <Method int m.b()>
	//  164  390:invokevirtual   #60  <Method void m.d(int)>
				break;
			}
		} while(true);
	//  165  393:goto            119
	//  166  396:return          
	}

	private final e a;
	private final com.google.ads.interactivemedia.v3.a.c.e.m b;
	private final l c = new l(new byte[10]);
	private int d;
	private int e;
	private boolean f;
	private boolean g;
	private boolean h;
	private int i;
	private int j;
	private boolean k;
	private long l;

	public o$b(e e1, com.google.ads.interactivemedia.v3.a.c.e.m m1)
	{
		super(((o$1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #29  <Method void o$d(o$1)>
		a = e1;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #31  <Field e a>
		b = m1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #33  <Field com.google.ads.interactivemedia.v3.a.c.e.m b>
	//    9   15:aload_0         
	//   10   16:new             #35  <Class l>
	//   11   19:dup             
	//   12   20:bipush          10
	//   13   22:newarray        byte[]
	//   14   24:invokespecial   #38  <Method void l(byte[])>
	//   15   27:putfield        #40  <Field l c>
		d = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #42  <Field int d>
	//   19   35:return          
	}
}
