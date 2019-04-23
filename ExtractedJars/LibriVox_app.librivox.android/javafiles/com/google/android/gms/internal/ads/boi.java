// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.google.android.gms.internal.ads:
//			boj

public final class boi
{

	public boi()
	{
		this(-1D);
	//    0    0:aload_0         
	//    1    1:ldc2w           #24  <Double -1D>
	//    2    4:invokespecial   #28  <Method void boi(double)>
	//    3    7:return          
	}

	private boi(double d1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		boolean flag;
		if(d1 != -1D)
	//*   2    4:dload_1         
	//*   3    5:ldc2w           #24  <Double -1D>
	//*   4    8:dcmpl           
	//*   5    9:ifeq            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		b = flag;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #33  <Field boolean b>
		if(b)
	//*  14   24:aload_0         
	//*  15   25:getfield        #33  <Field boolean b>
	//*  16   28:ifeq            65
		{
			a = boj.a();
	//   17   31:aload_0         
	//   18   32:invokestatic    #38  <Method boj boj.a()>
	//   19   35:putfield        #40  <Field boj a>
			c = (long)(1000000000D / d1);
	//   20   38:aload_0         
	//   21   39:ldc2w           #41  <Double 1000000000D>
	//   22   42:dload_1         
	//   23   43:ddiv            
	//   24   44:d2l             
	//   25   45:putfield        #44  <Field long c>
			d = (c * 80L) / 100L;
	//   26   48:aload_0         
	//   27   49:aload_0         
	//   28   50:getfield        #44  <Field long c>
	//   29   53:ldc2w           #45  <Long 80L>
	//   30   56:lmul            
	//   31   57:ldc2w           #47  <Long 100L>
	//   32   60:ldiv            
	//   33   61:putfield        #50  <Field long d>
			return;
	//   34   64:return          
		} else
		{
			a = null;
	//   35   65:aload_0         
	//   36   66:aconst_null     
	//   37   67:putfield        #40  <Field boj a>
			c = -1L;
	//   38   70:aload_0         
	//   39   71:ldc2w           #51  <Long -1L>
	//   40   74:putfield        #44  <Field long c>
			d = -1L;
	//   41   77:aload_0         
	//   42   78:ldc2w           #51  <Long -1L>
	//   43   81:putfield        #50  <Field long d>
			return;
	//   44   84:return          
		}
	}

	public boi(Context context)
	{
		context = ((Context) ((WindowManager)context.getSystemService("window")));
	//    0    0:aload_1         
	//    1    1:ldc1            #55  <String "window">
	//    2    3:invokevirtual   #61  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #63  <Class WindowManager>
	//    4    9:astore_1        
		double d1;
		if(((WindowManager) (context)).getDefaultDisplay() != null)
	//*   5   10:aload_1         
	//*   6   11:invokeinterface #67  <Method Display WindowManager.getDefaultDisplay()>
	//*   7   16:ifnull          33
			d1 = ((WindowManager) (context)).getDefaultDisplay().getRefreshRate();
	//    8   19:aload_1         
	//    9   20:invokeinterface #67  <Method Display WindowManager.getDefaultDisplay()>
	//   10   25:invokevirtual   #73  <Method float Display.getRefreshRate()>
	//   11   28:f2d             
	//   12   29:dstore_2        
		else
	//*  13   30:goto            37
			d1 = -1D;
	//   14   33:ldc2w           #24  <Double -1D>
	//   15   36:dstore_2        
		this(d1);
	//   16   37:aload_0         
	//   17   38:dload_2         
	//   18   39:invokespecial   #28  <Method void boi(double)>
	//   19   42:return          
	}

	private final boolean b(long l, long l1)
	{
		long l2 = j;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field long j>
	//    2    4:lstore          5
		return Math.abs(l1 - i - (l - l2)) > 0x1312d00L;
	//    3    6:lload_3         
	//    4    7:aload_0         
	//    5    8:getfield        #78  <Field long i>
	//    6   11:lsub            
	//    7   12:lload_1         
	//    8   13:lload           5
	//    9   15:lsub            
	//   10   16:lsub            
	//   11   17:invokestatic    #84  <Method long Math.abs(long)>
	//   12   20:ldc2w           #85  <Long 0x1312d00L>
	//   13   23:lcmp            
	//   14   24:ifle            29
	//   15   27:iconst_1        
	//   16   28:ireturn         
	//   17   29:iconst_0        
	//   18   30:ireturn         
	}

	public final long a(long l, long l1)
	{
		long l2;
		long l3;
		long l5;
label0:
		{
			l5 = 1000L * l;
	//    0    0:ldc2w           #88  <Long 1000L>
	//    1    3:lload_1         
	//    2    4:lmul            
	//    3    5:lstore          9
			if(h)
	//*   4    7:aload_0         
	//*   5    8:getfield        #91  <Field boolean h>
	//*   6   11:ifeq            127
			{
				if(l != e)
	//*   7   14:lload_1         
	//*   8   15:aload_0         
	//*   9   16:getfield        #93  <Field long e>
	//*  10   19:lcmp            
	//*  11   20:ifeq            41
				{
					k = k + 1L;
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #95  <Field long k>
	//   15   28:lconst_1        
	//   16   29:ladd            
	//   17   30:putfield        #95  <Field long k>
					f = g;
	//   18   33:aload_0         
	//   19   34:aload_0         
	//   20   35:getfield        #97  <Field long g>
	//   21   38:putfield        #99  <Field long f>
				}
				l2 = k;
	//   22   41:aload_0         
	//   23   42:getfield        #95  <Field long k>
	//   24   45:lstore          5
				if(l2 >= 6L)
	//*  25   47:lload           5
	//*  26   49:ldc2w           #100 <Long 6L>
	//*  27   52:lcmp            
	//*  28   53:iflt            112
				{
					l2 = (l5 - j) / l2;
	//   29   56:lload           9
	//   30   58:aload_0         
	//   31   59:getfield        #76  <Field long j>
	//   32   62:lsub            
	//   33   63:lload           5
	//   34   65:ldiv            
	//   35   66:lstore          5
					l3 = f + l2;
	//   36   68:aload_0         
	//   37   69:getfield        #99  <Field long f>
	//   38   72:lload           5
	//   39   74:ladd            
	//   40   75:lstore          7
					if(b(l3, l1))
	//*  41   77:aload_0         
	//*  42   78:lload           7
	//*  43   80:lload_3         
	//*  44   81:invokespecial   #103 <Method boolean b(long, long)>
	//*  45   84:ifeq            95
					{
						h = false;
	//   46   87:aload_0         
	//   47   88:iconst_0        
	//   48   89:putfield        #91  <Field boolean h>
					} else
	//*  49   92:goto            127
					{
						l2 = (i + l3) - j;
	//   50   95:aload_0         
	//   51   96:getfield        #78  <Field long i>
	//   52   99:lload           7
	//   53  101:ladd            
	//   54  102:aload_0         
	//   55  103:getfield        #76  <Field long j>
	//   56  106:lsub            
	//   57  107:lstore          5
						break label0;
	//   58  109:goto            134
					}
				} else
				if(b(l5, l1))
	//*  59  112:aload_0         
	//*  60  113:lload           9
	//*  61  115:lload_3         
	//*  62  116:invokespecial   #103 <Method boolean b(long, long)>
	//*  63  119:ifeq            127
					h = false;
	//   64  122:aload_0         
	//   65  123:iconst_0        
	//   66  124:putfield        #91  <Field boolean h>
			}
			l2 = l1;
	//   67  127:lload_3         
	//   68  128:lstore          5
			l3 = l5;
	//   69  130:lload           9
	//   70  132:lstore          7
		}
		if(!h)
	//*  71  134:aload_0         
	//*  72  135:getfield        #91  <Field boolean h>
	//*  73  138:ifne            162
		{
			j = l5;
	//   74  141:aload_0         
	//   75  142:lload           9
	//   76  144:putfield        #76  <Field long j>
			i = l1;
	//   77  147:aload_0         
	//   78  148:lload_3         
	//   79  149:putfield        #78  <Field long i>
			k = 0L;
	//   80  152:aload_0         
	//   81  153:lconst_0        
	//   82  154:putfield        #95  <Field long k>
			h = true;
	//   83  157:aload_0         
	//   84  158:iconst_1        
	//   85  159:putfield        #91  <Field boolean h>
		}
		e = l;
	//   86  162:aload_0         
	//   87  163:lload_1         
	//   88  164:putfield        #93  <Field long e>
		g = l3;
	//   89  167:aload_0         
	//   90  168:lload           7
	//   91  170:putfield        #97  <Field long g>
		boj boj1 = a;
	//   92  173:aload_0         
	//   93  174:getfield        #40  <Field boj a>
	//   94  177:astore          11
		if(boj1 != null)
	//*  95  179:aload           11
	//*  96  181:ifnull          269
		{
			if(boj1.a == 0L)
	//*  97  184:aload           11
	//*  98  186:getfield        #105 <Field long boj.a>
	//*  99  189:lconst_0        
	//* 100  190:lcmp            
	//* 101  191:ifne            197
				return l2;
	//  102  194:lload           5
	//  103  196:lreturn         
			l = a.a;
	//  104  197:aload_0         
	//  105  198:getfield        #40  <Field boj a>
	//  106  201:getfield        #105 <Field long boj.a>
	//  107  204:lstore_1        
			l1 = c;
	//  108  205:aload_0         
	//  109  206:getfield        #44  <Field long c>
	//  110  209:lstore_3        
			l += ((l2 - l) / l1) * l1;
	//  111  210:lload_1         
	//  112  211:lload           5
	//  113  213:lload_1         
	//  114  214:lsub            
	//  115  215:lload_3         
	//  116  216:ldiv            
	//  117  217:lload_3         
	//  118  218:lmul            
	//  119  219:ladd            
	//  120  220:lstore_1        
			if(l2 <= l)
	//* 121  221:lload           5
	//* 122  223:lload_1         
	//* 123  224:lcmp            
	//* 124  225:ifgt            235
			{
				l1 = l - l1;
	//  125  228:lload_1         
	//  126  229:lload_3         
	//  127  230:lsub            
	//  128  231:lstore_3        
			} else
	//* 129  232:goto            245
			{
				long l4 = l1 + l;
	//  130  235:lload_3         
	//  131  236:lload_1         
	//  132  237:ladd            
	//  133  238:lstore          7
				l1 = l;
	//  134  240:lload_1         
	//  135  241:lstore_3        
				l = l4;
	//  136  242:lload           7
	//  137  244:lstore_1        
			}
			if(l - l2 >= l2 - l1)
	//* 138  245:lload_1         
	//* 139  246:lload           5
	//* 140  248:lsub            
	//* 141  249:lload           5
	//* 142  251:lload_3         
	//* 143  252:lsub            
	//* 144  253:lcmp            
	//* 145  254:ifge            260
	//* 146  257:goto            262
				l = l1;
	//  147  260:lload_3         
	//  148  261:lstore_1        
			return l - d;
	//  149  262:lload_1         
	//  150  263:aload_0         
	//  151  264:getfield        #50  <Field long d>
	//  152  267:lsub            
	//  153  268:lreturn         
		} else
		{
			return l2;
	//  154  269:lload           5
	//  155  271:lreturn         
		}
	}

	public final void a()
	{
		h = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #91  <Field boolean h>
		if(b)
	//*   3    5:aload_0         
	//*   4    6:getfield        #33  <Field boolean b>
	//*   5    9:ifeq            19
			a.b();
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field boj a>
	//    8   16:invokevirtual   #107 <Method void boj.b()>
	//    9   19:return          
	}

	public final void b()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean b>
	//*   2    4:ifeq            14
			a.c();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field boj a>
	//    5   11:invokevirtual   #109 <Method void boj.c()>
	//    6   14:return          
	}

	private final boj a;
	private final boolean b;
	private final long c;
	private final long d;
	private long e;
	private long f;
	private long g;
	private boolean h;
	private long i;
	private long j;
	private long k;
}
