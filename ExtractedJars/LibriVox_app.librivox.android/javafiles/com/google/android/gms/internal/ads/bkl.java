// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bdp, bky, bnf, blc, 
//			bcr, bdr, bkx, ble, 
//			bks, bds

final class bkl extends bdp
{

	public bkl(long l, long l1, int i, long l2, 
			long l3, long l4, bky bky1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void bdp()>
		b = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #21  <Field long b>
		c = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #23  <Field long c>
		d = i;
	//    8   14:aload_0         
	//    9   15:iload           5
	//   10   17:putfield        #25  <Field int d>
		e = l2;
	//   11   20:aload_0         
	//   12   21:lload           6
	//   13   23:putfield        #27  <Field long e>
		f = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #29  <Field long f>
		g = l4;
	//   17   32:aload_0         
	//   18   33:lload           10
	//   19   35:putfield        #31  <Field long g>
		h = bky1;
	//   20   38:aload_0         
	//   21   39:aload           12
	//   22   41:putfield        #33  <Field bky h>
	//   23   44:return          
	}

	public final int a(Object obj)
	{
		if(!(obj instanceof Integer))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #38  <Class Integer>
	//*   2    4:ifne            9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		int i = ((Integer)obj).intValue();
	//    5    9:aload_1         
	//    6   10:checkcast       #38  <Class Integer>
	//    7   13:invokevirtual   #42  <Method int Integer.intValue()>
	//    8   16:istore_2        
		int j = d;
	//    9   17:aload_0         
	//   10   18:getfield        #25  <Field int d>
	//   11   21:istore_3        
		if(i >= j)
	//*  12   22:iload_2         
	//*  13   23:iload_3         
	//*  14   24:icmplt          46
		{
			if(i >= j + ((bdp)this).c())
	//*  15   27:iload_2         
	//*  16   28:iload_3         
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #44  <Method int bdp.c()>
	//*  19   33:iadd            
	//*  20   34:icmplt          39
				return -1;
	//   21   37:iconst_m1       
	//   22   38:ireturn         
			else
				return i - d;
	//   23   39:iload_2         
	//   24   40:aload_0         
	//   25   41:getfield        #25  <Field int d>
	//   26   44:isub            
	//   27   45:ireturn         
		} else
		{
			return -1;
	//   28   46:iconst_m1       
	//   29   47:ireturn         
		}
	}

	public final bdr a(int i, bdr bdr1, boolean flag)
	{
		bnf.a(i, 0, h.a());
	//    0    0:iload_1         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #33  <Field bky h>
	//    4    6:invokevirtual   #49  <Method int bky.a()>
	//    5    9:invokestatic    #54  <Method int bnf.a(int, int, int)>
	//    6   12:pop             
		String s;
		if(flag)
	//*   7   13:iload_3         
	//*   8   14:ifeq            33
			s = h.a(i).a;
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field bky h>
	//   11   21:iload_1         
	//   12   22:invokevirtual   #57  <Method blc bky.a(int)>
	//   13   25:getfield        #62  <Field String blc.a>
	//   14   28:astore          4
		else
	//*  15   30:goto            36
			s = null;
	//   16   33:aconst_null     
	//   17   34:astore          4
		Integer integer;
		if(flag)
	//*  18   36:iload_3         
	//*  19   37:ifeq            65
			integer = Integer.valueOf(d + bnf.a(i, 0, h.a()));
	//   20   40:aload_0         
	//   21   41:getfield        #25  <Field int d>
	//   22   44:iload_1         
	//   23   45:iconst_0        
	//   24   46:aload_0         
	//   25   47:getfield        #33  <Field bky h>
	//   26   50:invokevirtual   #49  <Method int bky.a()>
	//   27   53:invokestatic    #54  <Method int bnf.a(int, int, int)>
	//   28   56:iadd            
	//   29   57:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   30   60:astore          5
		else
	//*  31   62:goto            68
			integer = null;
	//   32   65:aconst_null     
	//   33   66:astore          5
		return bdr1.a(((Object) (s)), ((Object) (integer)), 0, h.b(i), bcr.b(h.a(i).b - h.a(0).b) - e, false);
	//   34   68:aload_2         
	//   35   69:aload           4
	//   36   71:aload           5
	//   37   73:iconst_0        
	//   38   74:aload_0         
	//   39   75:getfield        #33  <Field bky h>
	//   40   78:iload_1         
	//   41   79:invokevirtual   #69  <Method long bky.b(int)>
	//   42   82:aload_0         
	//   43   83:getfield        #33  <Field bky h>
	//   44   86:iload_1         
	//   45   87:invokevirtual   #57  <Method blc bky.a(int)>
	//   46   90:getfield        #70  <Field long blc.b>
	//   47   93:aload_0         
	//   48   94:getfield        #33  <Field bky h>
	//   49   97:iconst_0        
	//   50   98:invokevirtual   #57  <Method blc bky.a(int)>
	//   51  101:getfield        #70  <Field long blc.b>
	//   52  104:lsub            
	//   53  105:invokestatic    #75  <Method long bcr.b(long)>
	//   54  108:aload_0         
	//   55  109:getfield        #27  <Field long e>
	//   56  112:lsub            
	//   57  113:iconst_0        
	//   58  114:invokevirtual   #80  <Method bdr bdr.a(Object, Object, int, long, long, boolean)>
	//   59  117:areturn         
	}

	public final bds a(int i, bds bds1, boolean flag, long l)
	{
label0:
		{
			long l1;
			long l2;
			Object obj;
label1:
			{
				bnf.a(i, 0, 1);
	//    0    0:iload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_1        
	//    3    3:invokestatic    #54  <Method int bnf.a(int, int, int)>
	//    4    6:pop             
				l2 = g;
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field long g>
	//    7   11:lstore          9
				if(!h.b)
	//*   8   13:aload_0         
	//*   9   14:getfield        #33  <Field bky h>
	//*  10   17:getfield        #84  <Field boolean bky.b>
	//*  11   20:ifne            30
				{
					l = l2;
	//   12   23:lload           9
	//   13   25:lstore          4
					break label0;
	//   14   27:goto            295
				}
				l1 = l2;
	//   15   30:lload           9
	//   16   32:lstore          7
				if(l > 0L)
	//*  17   34:lload           4
	//*  18   36:lconst_0        
	//*  19   37:lcmp            
	//*  20   38:ifle            70
				{
					l = l2 + l;
	//   21   41:lload           9
	//   22   43:lload           4
	//   23   45:ladd            
	//   24   46:lstore          4
					l1 = l;
	//   25   48:lload           4
	//   26   50:lstore          7
					if(l > f)
	//*  27   52:lload           4
	//*  28   54:aload_0         
	//*  29   55:getfield        #29  <Field long f>
	//*  30   58:lcmp            
	//*  31   59:ifle            70
					{
						l = 0x1L;
	//   32   62:ldc2w           #85  <Long 0x1L>
	//   33   65:lstore          4
						break label0;
	//   34   67:goto            295
					}
				}
				l = e;
	//   35   70:aload_0         
	//   36   71:getfield        #27  <Field long e>
	//   37   74:lstore          4
				l2 = h.b(0);
	//   38   76:aload_0         
	//   39   77:getfield        #33  <Field bky h>
	//   40   80:iconst_0        
	//   41   81:invokevirtual   #69  <Method long bky.b(int)>
	//   42   84:lstore          9
				l += l1;
	//   43   86:lload           4
	//   44   88:lload           7
	//   45   90:ladd            
	//   46   91:lstore          4
				for(i = 0; i < h.a() - 1 && l >= l2; l2 = h.b(i))
	//*  47   93:iconst_0        
	//*  48   94:istore_1        
	//*  49   95:iload_1         
	//*  50   96:aload_0         
	//*  51   97:getfield        #33  <Field bky h>
	//*  52  100:invokevirtual   #49  <Method int bky.a()>
	//*  53  103:iconst_1        
	//*  54  104:isub            
	//*  55  105:icmpge          140
	//*  56  108:lload           4
	//*  57  110:lload           9
	//*  58  112:lcmp            
	//*  59  113:iflt            140
				{
					l -= l2;
	//   60  116:lload           4
	//   61  118:lload           9
	//   62  120:lsub            
	//   63  121:lstore          4
					i++;
	//   64  123:iload_1         
	//   65  124:iconst_1        
	//   66  125:iadd            
	//   67  126:istore_1        
				}

	//   68  127:aload_0         
	//   69  128:getfield        #33  <Field bky h>
	//   70  131:iload_1         
	//   71  132:invokevirtual   #69  <Method long bky.b(int)>
	//   72  135:lstore          9
	//*  73  137:goto            95
				obj = ((Object) (h.a(i)));
	//   74  140:aload_0         
	//   75  141:getfield        #33  <Field bky h>
	//   76  144:iload_1         
	//   77  145:invokevirtual   #57  <Method blc bky.a(int)>
	//   78  148:astore          11
				int j = ((blc) (obj)).c.size();
	//   79  150:aload           11
	//   80  152:getfield        #89  <Field List blc.c>
	//   81  155:invokeinterface #94  <Method int List.size()>
	//   82  160:istore          6
				for(i = 0; i < j; i++)
	//*  83  162:iconst_0        
	//*  84  163:istore_1        
	//*  85  164:iload_1         
	//*  86  165:iload           6
	//*  87  167:icmpge          201
					if(((bkx)((blc) (obj)).c.get(i)).b == 2)
	//*  88  170:aload           11
	//*  89  172:getfield        #89  <Field List blc.c>
	//*  90  175:iload_1         
	//*  91  176:invokeinterface #98  <Method Object List.get(int)>
	//*  92  181:checkcast       #100 <Class bkx>
	//*  93  184:getfield        #102 <Field int bkx.b>
	//*  94  187:iconst_2        
	//*  95  188:icmpne          194
						break label1;
	//   96  191:goto            203

	//   97  194:iload_1         
	//   98  195:iconst_1        
	//   99  196:iadd            
	//  100  197:istore_1        
	//* 101  198:goto            164
				i = -1;
	//  102  201:iconst_m1       
	//  103  202:istore_1        
			}
			if(i != -1)
	//* 104  203:iload_1         
	//* 105  204:iconst_m1       
	//* 106  205:icmpne          211
	//* 107  208:goto            291
			{
				obj = ((Object) (((ble)((bkx)((blc) (obj)).c.get(i)).c.get(0)).e()));
	//  108  211:aload           11
	//  109  213:getfield        #89  <Field List blc.c>
	//  110  216:iload_1         
	//  111  217:invokeinterface #98  <Method Object List.get(int)>
	//  112  222:checkcast       #100 <Class bkx>
	//  113  225:getfield        #103 <Field List bkx.c>
	//  114  228:iconst_0        
	//  115  229:invokeinterface #98  <Method Object List.get(int)>
	//  116  234:checkcast       #105 <Class ble>
	//  117  237:invokevirtual   #108 <Method bks ble.e()>
	//  118  240:astore          11
				if(obj != null && ((bks) (obj)).a(l2) != 0)
	//* 119  242:aload           11
	//* 120  244:ifnull          291
	//* 121  247:aload           11
	//* 122  249:lload           9
	//* 123  251:invokeinterface #113 <Method int bks.a(long)>
	//* 124  256:ifne            262
	//* 125  259:goto            291
				{
					l = (l1 + ((bks) (obj)).a(((bks) (obj)).a(l, l2))) - l;
	//  126  262:lload           7
	//  127  264:aload           11
	//  128  266:aload           11
	//  129  268:lload           4
	//  130  270:lload           9
	//  131  272:invokeinterface #116 <Method int bks.a(long, long)>
	//  132  277:invokeinterface #118 <Method long bks.a(int)>
	//  133  282:ladd            
	//  134  283:lload           4
	//  135  285:lsub            
	//  136  286:lstore          4
					break label0;
	//  137  288:goto            295
				}
			}
			l = l1;
	//  138  291:lload           7
	//  139  293:lstore          4
		}
		return bds1.a(((Object) (null)), b, c, true, h.b, l, f, 0, h.a() - 1, e);
	//  140  295:aload_2         
	//  141  296:aconst_null     
	//  142  297:aload_0         
	//  143  298:getfield        #21  <Field long b>
	//  144  301:aload_0         
	//  145  302:getfield        #23  <Field long c>
	//  146  305:iconst_1        
	//  147  306:aload_0         
	//  148  307:getfield        #33  <Field bky h>
	//  149  310:getfield        #84  <Field boolean bky.b>
	//  150  313:lload           4
	//  151  315:aload_0         
	//  152  316:getfield        #29  <Field long f>
	//  153  319:iconst_0        
	//  154  320:aload_0         
	//  155  321:getfield        #33  <Field bky h>
	//  156  324:invokevirtual   #49  <Method int bky.a()>
	//  157  327:iconst_1        
	//  158  328:isub            
	//  159  329:aload_0         
	//  160  330:getfield        #27  <Field long e>
	//  161  333:invokevirtual   #123 <Method bds bds.a(Object, long, long, boolean, boolean, long, long, int, int, long)>
	//  162  336:areturn         
	}

	public final int b()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final int c()
	{
		return h.a();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field bky h>
	//    2    4:invokevirtual   #49  <Method int bky.a()>
	//    3    7:ireturn         
	}

	private final long b;
	private final long c;
	private final int d;
	private final long e;
	private final long f;
	private final long g;
	private final bky h;
}
