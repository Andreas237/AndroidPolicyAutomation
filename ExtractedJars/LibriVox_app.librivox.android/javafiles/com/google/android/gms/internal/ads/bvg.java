// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, arh, buv, 
//			awg, bvj, btw, awp

public final class bvg extends awj
{

	public bvg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #23  <Field String a>
		c = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #25  <Field btw c>
		d = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #27  <Field Integer d>
		b = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #29  <Field bvj b>
		e = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #31  <Field Integer e>
		f = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #33  <Field buv f>
		g = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #35  <Field buv g>
		h = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #37  <Field buv h>
		Z = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #41  <Field awl Z>
		aa = -1;
	//   29   49:aload_0         
	//   30   50:iconst_m1       
	//   31   51:putfield        #45  <Field int aa>
	//   32   54:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field String a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + awh.b(1, ((String) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #54  <Method int awh.b(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (c));
	//   16   24:aload_0         
	//   17   25:getfield        #25  <Field btw c>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          43
			j = i + arh.c(2, ((atv) (obj)));
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokestatic    #59  <Method int arh.c(int, atv)>
	//   27   41:iadd            
	//   28   42:istore_2        
		obj = ((Object) (d));
	//   29   43:aload_0         
	//   30   44:getfield        #27  <Field Integer d>
	//   31   47:astore_3        
		i = j;
	//   32   48:iload_2         
	//   33   49:istore_1        
		if(obj != null)
	//*  34   50:aload_3         
	//*  35   51:ifnull          65
			i = j + awh.b(3, ((Integer) (obj)).intValue());
	//   36   54:iload_2         
	//   37   55:iconst_3        
	//   38   56:aload_3         
	//   39   57:invokevirtual   #64  <Method int Integer.intValue()>
	//   40   60:invokestatic    #67  <Method int awh.b(int, int)>
	//   41   63:iadd            
	//   42   64:istore_1        
		obj = ((Object) (b));
	//   43   65:aload_0         
	//   44   66:getfield        #29  <Field bvj b>
	//   45   69:astore_3        
		j = i;
	//   46   70:iload_1         
	//   47   71:istore_2        
		if(obj != null)
	//*  48   72:aload_3         
	//*  49   73:ifnull          84
			j = i + awh.b(4, ((awp) (obj)));
	//   50   76:iload_1         
	//   51   77:iconst_4        
	//   52   78:aload_3         
	//   53   79:invokestatic    #70  <Method int awh.b(int, awp)>
	//   54   82:iadd            
	//   55   83:istore_2        
		obj = ((Object) (e));
	//   56   84:aload_0         
	//   57   85:getfield        #31  <Field Integer e>
	//   58   88:astore_3        
		i = j;
	//   59   89:iload_2         
	//   60   90:istore_1        
		if(obj != null)
	//*  61   91:aload_3         
	//*  62   92:ifnull          106
			i = j + awh.b(5, ((Integer) (obj)).intValue());
	//   63   95:iload_2         
	//   64   96:iconst_5        
	//   65   97:aload_3         
	//   66   98:invokevirtual   #64  <Method int Integer.intValue()>
	//   67  101:invokestatic    #67  <Method int awh.b(int, int)>
	//   68  104:iadd            
	//   69  105:istore_1        
		obj = ((Object) (f));
	//   70  106:aload_0         
	//   71  107:getfield        #33  <Field buv f>
	//   72  110:astore_3        
		j = i;
	//   73  111:iload_1         
	//   74  112:istore_2        
		if(obj != null)
	//*  75  113:aload_3         
	//*  76  114:ifnull          135
		{
			j = i;
	//   77  117:iload_1         
	//   78  118:istore_2        
			if(obj != null)
	//*  79  119:aload_3         
	//*  80  120:ifnull          135
				j = i + awh.b(6, ((buv) (obj)).a());
	//   81  123:iload_1         
	//   82  124:bipush          6
	//   83  126:aload_3         
	//   84  127:invokevirtual   #73  <Method int buv.a()>
	//   85  130:invokestatic    #67  <Method int awh.b(int, int)>
	//   86  133:iadd            
	//   87  134:istore_2        
		}
		obj = ((Object) (g));
	//   88  135:aload_0         
	//   89  136:getfield        #35  <Field buv g>
	//   90  139:astore_3        
		i = j;
	//   91  140:iload_2         
	//   92  141:istore_1        
		if(obj != null)
	//*  93  142:aload_3         
	//*  94  143:ifnull          164
		{
			i = j;
	//   95  146:iload_2         
	//   96  147:istore_1        
			if(obj != null)
	//*  97  148:aload_3         
	//*  98  149:ifnull          164
				i = j + awh.b(7, ((buv) (obj)).a());
	//   99  152:iload_2         
	//  100  153:bipush          7
	//  101  155:aload_3         
	//  102  156:invokevirtual   #73  <Method int buv.a()>
	//  103  159:invokestatic    #67  <Method int awh.b(int, int)>
	//  104  162:iadd            
	//  105  163:istore_1        
		}
		obj = ((Object) (h));
	//  106  164:aload_0         
	//  107  165:getfield        #37  <Field buv h>
	//  108  168:astore_3        
		j = i;
	//  109  169:iload_1         
	//  110  170:istore_2        
		if(obj != null)
	//* 111  171:aload_3         
	//* 112  172:ifnull          193
		{
			j = i;
	//  113  175:iload_1         
	//  114  176:istore_2        
			if(obj != null)
	//* 115  177:aload_3         
	//* 116  178:ifnull          193
				j = i + awh.b(8, ((buv) (obj)).a());
	//  117  181:iload_1         
	//  118  182:bipush          8
	//  119  184:aload_3         
	//  120  185:invokevirtual   #73  <Method int buv.a()>
	//  121  188:invokestatic    #67  <Method int awh.b(int, int)>
	//  122  191:iadd            
	//  123  192:istore_2        
		}
		return j;
	//  124  193:iload_2         
	//  125  194:ireturn         
	}

	public final awp a(awg awg1)
	{
label0:
		do
			do
			{
				int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #77  <Method int awg.a()>
	//    2    4:istore_2        
				if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            368
				{
					if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          357
					{
						if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          340
						{
							if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          326
							{
								if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          297
								{
									if(i != 40)
	//*  17   33:iload_2         
	//*  18   34:bipush          40
	//*  19   36:icmpeq          283
									{
										if(i != 48)
	//*  20   39:iload_2         
	//*  21   40:bipush          48
	//*  22   42:icmpeq          211
										{
											if(i != 56)
	//*  23   45:iload_2         
	//*  24   46:bipush          56
	//*  25   48:icmpeq          139
											{
												if(i != 64)
	//*  26   51:iload_2         
	//*  27   52:bipush          64
	//*  28   54:icmpeq          68
												{
													if(!super.a(awg1, i))
	//*  29   57:aload_0         
	//*  30   58:aload_1         
	//*  31   59:iload_2         
	//*  32   60:invokespecial   #80  <Method boolean awj.a(awg, int)>
	//*  33   63:ifne            0
														return ((awp) (this));
	//   34   66:aload_0         
	//   35   67:areturn         
												} else
												{
													int j = awg1.j();
	//   36   68:aload_1         
	//   37   69:invokevirtual   #83  <Method int awg.j()>
	//   38   72:istore_3        
													int i1 = awg1.g();
	//   39   73:aload_1         
	//   40   74:invokevirtual   #85  <Method int awg.g()>
	//   41   77:istore          4
													if(i1 != 1000)
	//*  42   79:iload           4
	//*  43   81:sipush          1000
	//*  44   84:icmpeq          127
														switch(i1)
	//*  45   87:iload           4
														{
	//*  46   89:tableswitch     0 1: default 112
	//	               0 127
	//	               1 127
														default:
															awg1.e(j);
	//   47  112:aload_1         
	//   48  113:iload_3         
	//   49  114:invokevirtual   #88  <Method void awg.e(int)>
															((awj)this).a(awg1, i);
	//   50  117:aload_0         
	//   51  118:aload_1         
	//   52  119:iload_2         
	//   53  120:invokevirtual   #80  <Method boolean awj.a(awg, int)>
	//   54  123:pop             
															continue label0;
	//   55  124:goto            0

														case 0: // '\0'
														case 1: // '\001'
															break;
														}
													h = buv.a(i1);
	//   56  127:aload_0         
	//   57  128:iload           4
	//   58  130:invokestatic    #91  <Method buv buv.a(int)>
	//   59  133:putfield        #37  <Field buv h>
													continue label0;
	//   60  136:goto            0
												}
											} else
											{
												int k = awg1.j();
	//   61  139:aload_1         
	//   62  140:invokevirtual   #83  <Method int awg.j()>
	//   63  143:istore_3        
												int j1 = awg1.g();
	//   64  144:aload_1         
	//   65  145:invokevirtual   #85  <Method int awg.g()>
	//   66  148:istore          4
												if(j1 != 1000)
	//*  67  150:iload           4
	//*  68  152:sipush          1000
	//*  69  155:icmpeq          199
													switch(j1)
	//*  70  158:iload           4
													{
	//*  71  160:tableswitch     0 1: default 184
	//	               0 199
	//	               1 199
													default:
														awg1.e(k);
	//   72  184:aload_1         
	//   73  185:iload_3         
	//   74  186:invokevirtual   #88  <Method void awg.e(int)>
														((awj)this).a(awg1, i);
	//   75  189:aload_0         
	//   76  190:aload_1         
	//   77  191:iload_2         
	//   78  192:invokevirtual   #80  <Method boolean awj.a(awg, int)>
	//   79  195:pop             
														continue label0;
	//   80  196:goto            0

													case 0: // '\0'
													case 1: // '\001'
														break;
													}
												g = buv.a(j1);
	//   81  199:aload_0         
	//   82  200:iload           4
	//   83  202:invokestatic    #91  <Method buv buv.a(int)>
	//   84  205:putfield        #35  <Field buv g>
												continue label0;
	//   85  208:goto            0
											}
										} else
										{
											int l = awg1.j();
	//   86  211:aload_1         
	//   87  212:invokevirtual   #83  <Method int awg.j()>
	//   88  215:istore_3        
											int k1 = awg1.g();
	//   89  216:aload_1         
	//   90  217:invokevirtual   #85  <Method int awg.g()>
	//   91  220:istore          4
											if(k1 != 1000)
	//*  92  222:iload           4
	//*  93  224:sipush          1000
	//*  94  227:icmpeq          271
												switch(k1)
	//*  95  230:iload           4
												{
	//*  96  232:tableswitch     0 1: default 256
	//	               0 271
	//	               1 271
												default:
													awg1.e(l);
	//   97  256:aload_1         
	//   98  257:iload_3         
	//   99  258:invokevirtual   #88  <Method void awg.e(int)>
													((awj)this).a(awg1, i);
	//  100  261:aload_0         
	//  101  262:aload_1         
	//  102  263:iload_2         
	//  103  264:invokevirtual   #80  <Method boolean awj.a(awg, int)>
	//  104  267:pop             
													continue label0;
	//  105  268:goto            0

												case 0: // '\0'
												case 1: // '\001'
													break;
												}
											f = buv.a(k1);
	//  106  271:aload_0         
	//  107  272:iload           4
	//  108  274:invokestatic    #91  <Method buv buv.a(int)>
	//  109  277:putfield        #33  <Field buv f>
											continue label0;
	//  110  280:goto            0
										}
									} else
									{
										e = Integer.valueOf(awg1.g());
	//  111  283:aload_0         
	//  112  284:aload_1         
	//  113  285:invokevirtual   #85  <Method int awg.g()>
	//  114  288:invokestatic    #95  <Method Integer Integer.valueOf(int)>
	//  115  291:putfield        #31  <Field Integer e>
										continue label0;
	//  116  294:goto            0
									}
								} else
								{
									if(b == null)
	//* 117  297:aload_0         
	//* 118  298:getfield        #29  <Field bvj b>
	//* 119  301:ifnonnull       315
										b = new bvj();
	//  120  304:aload_0         
	//  121  305:new             #97  <Class bvj>
	//  122  308:dup             
	//  123  309:invokespecial   #98  <Method void bvj()>
	//  124  312:putfield        #29  <Field bvj b>
									awg1.a(((awp) (b)));
	//  125  315:aload_1         
	//  126  316:aload_0         
	//  127  317:getfield        #29  <Field bvj b>
	//  128  320:invokevirtual   #101 <Method void awg.a(awp)>
									continue label0;
	//  129  323:goto            0
								}
							} else
							{
								d = Integer.valueOf(awg1.g());
	//  130  326:aload_0         
	//  131  327:aload_1         
	//  132  328:invokevirtual   #85  <Method int awg.g()>
	//  133  331:invokestatic    #95  <Method Integer Integer.valueOf(int)>
	//  134  334:putfield        #27  <Field Integer d>
								continue label0;
	//  135  337:goto            0
							}
						} else
						{
							c = (btw)awg1.a(btw.a());
	//  136  340:aload_0         
	//  137  341:aload_1         
	//  138  342:invokestatic    #106 <Method aug btw.a()>
	//  139  345:invokevirtual   #109 <Method ash awg.a(aug)>
	//  140  348:checkcast       #103 <Class btw>
	//  141  351:putfield        #25  <Field btw c>
							continue label0;
	//  142  354:goto            0
						}
					} else
					{
						a = awg1.e();
	//  143  357:aload_0         
	//  144  358:aload_1         
	//  145  359:invokevirtual   #112 <Method String awg.e()>
	//  146  362:putfield        #23  <Field String a>
						continue label0;
	//  147  365:goto            0
					}
				} else
				{
					return ((awp) (this));
	//  148  368:aload_0         
	//  149  369:areturn         
				}
			} while(true);
		while(true);
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String a>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			awh1.a(1, ((String) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #116 <Method void awh.a(int, String)>
		obj = ((Object) (c));
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field btw c>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			awh1.a(2, ((atv) (obj)));
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #119 <Method void awh.a(int, atv)>
		obj = ((Object) (d));
	//   18   30:aload_0         
	//   19   31:getfield        #27  <Field Integer d>
	//   20   34:astore_2        
		if(obj != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          48
			awh1.a(3, ((Integer) (obj)).intValue());
	//   23   39:aload_1         
	//   24   40:iconst_3        
	//   25   41:aload_2         
	//   26   42:invokevirtual   #64  <Method int Integer.intValue()>
	//   27   45:invokevirtual   #122 <Method void awh.a(int, int)>
		obj = ((Object) (b));
	//   28   48:aload_0         
	//   29   49:getfield        #29  <Field bvj b>
	//   30   52:astore_2        
		if(obj != null)
	//*  31   53:aload_2         
	//*  32   54:ifnull          63
			awh1.a(4, ((awp) (obj)));
	//   33   57:aload_1         
	//   34   58:iconst_4        
	//   35   59:aload_2         
	//   36   60:invokevirtual   #125 <Method void awh.a(int, awp)>
		obj = ((Object) (e));
	//   37   63:aload_0         
	//   38   64:getfield        #31  <Field Integer e>
	//   39   67:astore_2        
		if(obj != null)
	//*  40   68:aload_2         
	//*  41   69:ifnull          81
			awh1.a(5, ((Integer) (obj)).intValue());
	//   42   72:aload_1         
	//   43   73:iconst_5        
	//   44   74:aload_2         
	//   45   75:invokevirtual   #64  <Method int Integer.intValue()>
	//   46   78:invokevirtual   #122 <Method void awh.a(int, int)>
		obj = ((Object) (f));
	//   47   81:aload_0         
	//   48   82:getfield        #33  <Field buv f>
	//   49   85:astore_2        
		if(obj != null && obj != null)
	//*  50   86:aload_2         
	//*  51   87:ifnull          104
	//*  52   90:aload_2         
	//*  53   91:ifnull          104
			awh1.a(6, ((buv) (obj)).a());
	//   54   94:aload_1         
	//   55   95:bipush          6
	//   56   97:aload_2         
	//   57   98:invokevirtual   #73  <Method int buv.a()>
	//   58  101:invokevirtual   #122 <Method void awh.a(int, int)>
		obj = ((Object) (g));
	//   59  104:aload_0         
	//   60  105:getfield        #35  <Field buv g>
	//   61  108:astore_2        
		if(obj != null && obj != null)
	//*  62  109:aload_2         
	//*  63  110:ifnull          127
	//*  64  113:aload_2         
	//*  65  114:ifnull          127
			awh1.a(7, ((buv) (obj)).a());
	//   66  117:aload_1         
	//   67  118:bipush          7
	//   68  120:aload_2         
	//   69  121:invokevirtual   #73  <Method int buv.a()>
	//   70  124:invokevirtual   #122 <Method void awh.a(int, int)>
		obj = ((Object) (h));
	//   71  127:aload_0         
	//   72  128:getfield        #37  <Field buv h>
	//   73  131:astore_2        
		if(obj != null && obj != null)
	//*  74  132:aload_2         
	//*  75  133:ifnull          150
	//*  76  136:aload_2         
	//*  77  137:ifnull          150
			awh1.a(8, ((buv) (obj)).a());
	//   78  140:aload_1         
	//   79  141:bipush          8
	//   80  143:aload_2         
	//   81  144:invokevirtual   #73  <Method int buv.a()>
	//   82  147:invokevirtual   #122 <Method void awh.a(int, int)>
		super.a(awh1);
	//   83  150:aload_0         
	//   84  151:aload_1         
	//   85  152:invokespecial   #127 <Method void awj.a(awh)>
	//   86  155:return          
	}

	public String a;
	public bvj b;
	private btw c;
	private Integer d;
	private Integer e;
	private buv f;
	private buv g;
	private buv h;
}
