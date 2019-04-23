// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awt, awh, awg, 
//			awp

public final class aot extends awj
{

	public aot()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field Long a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #21  <Field Integer b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field Boolean c>
		d = awt.a;
	//   11   19:aload_0         
	//   12   20:getstatic       #27  <Field int[] awt.a>
	//   13   23:putfield        #29  <Field int[] d>
		e = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #31  <Field Long e>
		aa = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #35  <Field int aa>
	//   20   36:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field Long a>
	//    5    9:astore          4
		int i = j;
	//    6   11:iload_2         
	//    7   12:istore_1        
		if(obj != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          30
			i = j + awh.d(1, ((Long) (obj)).longValue());
	//   10   18:iload_2         
	//   11   19:iconst_1        
	//   12   20:aload           4
	//   13   22:invokevirtual   #45  <Method long Long.longValue()>
	//   14   25:invokestatic    #50  <Method int awh.d(int, long)>
	//   15   28:iadd            
	//   16   29:istore_1        
		obj = ((Object) (b));
	//   17   30:aload_0         
	//   18   31:getfield        #21  <Field Integer b>
	//   19   34:astore          4
		j = i;
	//   20   36:iload_1         
	//   21   37:istore_2        
		if(obj != null)
	//*  22   38:aload           4
	//*  23   40:ifnull          55
			j = i + awh.b(2, ((Integer) (obj)).intValue());
	//   24   43:iload_1         
	//   25   44:iconst_2        
	//   26   45:aload           4
	//   27   47:invokevirtual   #55  <Method int Integer.intValue()>
	//   28   50:invokestatic    #58  <Method int awh.b(int, int)>
	//   29   53:iadd            
	//   30   54:istore_2        
		obj = ((Object) (c));
	//   31   55:aload_0         
	//   32   56:getfield        #23  <Field Boolean c>
	//   33   59:astore          4
		i = j;
	//   34   61:iload_2         
	//   35   62:istore_1        
		if(obj != null)
	//*  36   63:aload           4
	//*  37   65:ifnull          83
		{
			((Boolean) (obj)).booleanValue();
	//   38   68:aload           4
	//   39   70:invokevirtual   #64  <Method boolean Boolean.booleanValue()>
	//   40   73:pop             
			i = j + (awh.b(3) + 1);
	//   41   74:iload_2         
	//   42   75:iconst_3        
	//   43   76:invokestatic    #67  <Method int awh.b(int)>
	//   44   79:iconst_1        
	//   45   80:iadd            
	//   46   81:iadd            
	//   47   82:istore_1        
		}
		int ai[] = d;
	//   48   83:aload_0         
	//   49   84:getfield        #29  <Field int[] d>
	//   50   87:astore          4
		j = i;
	//   51   89:iload_1         
	//   52   90:istore_2        
		if(ai != null)
	//*  53   91:aload           4
	//*  54   93:ifnull          148
		{
			j = i;
	//   55   96:iload_1         
	//   56   97:istore_2        
			if(ai.length > 0)
	//*  57   98:aload           4
	//*  58  100:arraylength     
	//*  59  101:ifle            148
			{
				j = 0;
	//   60  104:iconst_0        
	//   61  105:istore_2        
				int k = 0;
	//   62  106:iconst_0        
	//   63  107:istore_3        
				int ai1[];
				do
				{
					ai1 = d;
	//   64  108:aload_0         
	//   65  109:getfield        #29  <Field int[] d>
	//   66  112:astore          4
					if(j >= ai1.length)
						break;
	//   67  114:iload_2         
	//   68  115:aload           4
	//   69  117:arraylength     
	//   70  118:icmpge          138
					k += awh.a(ai1[j]);
	//   71  121:iload_3         
	//   72  122:aload           4
	//   73  124:iload_2         
	//   74  125:iaload          
	//   75  126:invokestatic    #69  <Method int awh.a(int)>
	//   76  129:iadd            
	//   77  130:istore_3        
					j++;
	//   78  131:iload_2         
	//   79  132:iconst_1        
	//   80  133:iadd            
	//   81  134:istore_2        
				} while(true);
	//   82  135:goto            108
				j = i + k + ai1.length * 1;
	//   83  138:iload_1         
	//   84  139:iload_3         
	//   85  140:iadd            
	//   86  141:aload           4
	//   87  143:arraylength     
	//   88  144:iconst_1        
	//   89  145:imul            
	//   90  146:iadd            
	//   91  147:istore_2        
			}
		}
		ai1 = ((int []) (e));
	//   92  148:aload_0         
	//   93  149:getfield        #31  <Field Long e>
	//   94  152:astore          4
		i = j;
	//   95  154:iload_2         
	//   96  155:istore_1        
		if(ai1 != null)
	//*  97  156:aload           4
	//*  98  158:ifnull          173
			i = j + awh.c(5, ((Long) (ai1)).longValue());
	//   99  161:iload_2         
	//  100  162:iconst_5        
	//  101  163:aload           4
	//  102  165:invokevirtual   #45  <Method long Long.longValue()>
	//  103  168:invokestatic    #71  <Method int awh.c(int, long)>
	//  104  171:iadd            
	//  105  172:istore_1        
		return i;
	//  106  173:iload_1         
	//  107  174:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            337
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          323
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          309
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          295
					{
						if(i != 32)
	//*  14   27:iload_2         
	//*  15   28:bipush          32
	//*  16   30:icmpeq          195
						{
							if(i != 34)
	//*  17   33:iload_2         
	//*  18   34:bipush          34
	//*  19   36:icmpeq          70
							{
								if(i != 40)
	//*  20   39:iload_2         
	//*  21   40:bipush          40
	//*  22   42:icmpeq          56
								{
									if(!super.a(awg1, i))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:iload_2         
	//*  26   48:invokespecial   #78  <Method boolean awj.a(awg, int)>
	//*  27   51:ifne            0
										return ((awp) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
								} else
								{
									e = Long.valueOf(awg1.h());
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #81  <Method long awg.h()>
	//   33   61:invokestatic    #85  <Method Long Long.valueOf(long)>
	//   34   64:putfield        #31  <Field Long e>
								}
							} else
	//*  35   67:goto            0
							{
								int j1 = awg1.c(awg1.g());
	//   36   70:aload_1         
	//   37   71:aload_1         
	//   38   72:invokevirtual   #88  <Method int awg.g()>
	//   39   75:invokevirtual   #90  <Method int awg.c(int)>
	//   40   78:istore          4
								int j = awg1.j();
	//   41   80:aload_1         
	//   42   81:invokevirtual   #93  <Method int awg.j()>
	//   43   84:istore_2        
								int l;
								for(l = 0; awg1.i() > 0; l++)
	//*  44   85:iconst_0        
	//*  45   86:istore_3        
	//*  46   87:aload_1         
	//*  47   88:invokevirtual   #96  <Method int awg.i()>
	//*  48   91:ifle            106
									awg1.g();
	//   49   94:aload_1         
	//   50   95:invokevirtual   #88  <Method int awg.g()>
	//   51   98:pop             

	//   52   99:iload_3         
	//   53  100:iconst_1        
	//   54  101:iadd            
	//   55  102:istore_3        
	//*  56  103:goto            87
								awg1.e(j);
	//   57  106:aload_1         
	//   58  107:iload_2         
	//   59  108:invokevirtual   #99  <Method void awg.e(int)>
								int ai[] = d;
	//   60  111:aload_0         
	//   61  112:getfield        #29  <Field int[] d>
	//   62  115:astore          5
								if(ai == null)
	//*  63  117:aload           5
	//*  64  119:ifnonnull       127
									j = 0;
	//   65  122:iconst_0        
	//   66  123:istore_2        
								else
	//*  67  124:goto            131
									j = ai.length;
	//   68  127:aload           5
	//   69  129:arraylength     
	//   70  130:istore_2        
								ai = new int[l + j];
	//   71  131:iload_3         
	//   72  132:iload_2         
	//   73  133:iadd            
	//   74  134:newarray        int[]
	//   75  136:astore          5
								l = j;
	//   76  138:iload_2         
	//   77  139:istore_3        
								if(j != 0)
	//*  78  140:iload_2         
	//*  79  141:ifeq            158
								{
									System.arraycopy(((Object) (d)), 0, ((Object) (ai)), 0, j);
	//   80  144:aload_0         
	//   81  145:getfield        #29  <Field int[] d>
	//   82  148:iconst_0        
	//   83  149:aload           5
	//   84  151:iconst_0        
	//   85  152:iload_2         
	//   86  153:invokestatic    #105 <Method void System.arraycopy(Object, int, Object, int, int)>
									l = j;
	//   87  156:iload_2         
	//   88  157:istore_3        
								}
								for(; l < ai.length; l++)
	//*  89  158:iload_3         
	//*  90  159:aload           5
	//*  91  161:arraylength     
	//*  92  162:icmpge          180
									ai[l] = awg1.g();
	//   93  165:aload           5
	//   94  167:iload_3         
	//   95  168:aload_1         
	//   96  169:invokevirtual   #88  <Method int awg.g()>
	//   97  172:iastore         

	//   98  173:iload_3         
	//   99  174:iconst_1        
	//  100  175:iadd            
	//  101  176:istore_3        
	//* 102  177:goto            158
								d = ai;
	//  103  180:aload_0         
	//  104  181:aload           5
	//  105  183:putfield        #29  <Field int[] d>
								awg1.d(j1);
	//  106  186:aload_1         
	//  107  187:iload           4
	//  108  189:invokevirtual   #107 <Method void awg.d(int)>
							}
						} else
	//* 109  192:goto            0
						{
							int i1 = awt.a(awg1, 32);
	//  110  195:aload_1         
	//  111  196:bipush          32
	//  112  198:invokestatic    #110 <Method int awt.a(awg, int)>
	//  113  201:istore_3        
							int ai1[] = d;
	//  114  202:aload_0         
	//  115  203:getfield        #29  <Field int[] d>
	//  116  206:astore          5
							int k;
							if(ai1 == null)
	//* 117  208:aload           5
	//* 118  210:ifnonnull       218
								k = 0;
	//  119  213:iconst_0        
	//  120  214:istore_2        
							else
	//* 121  215:goto            222
								k = ai1.length;
	//  122  218:aload           5
	//  123  220:arraylength     
	//  124  221:istore_2        
							ai1 = new int[i1 + k];
	//  125  222:iload_3         
	//  126  223:iload_2         
	//  127  224:iadd            
	//  128  225:newarray        int[]
	//  129  227:astore          5
							i1 = k;
	//  130  229:iload_2         
	//  131  230:istore_3        
							if(k != 0)
	//* 132  231:iload_2         
	//* 133  232:ifeq            249
							{
								System.arraycopy(((Object) (d)), 0, ((Object) (ai1)), 0, k);
	//  134  235:aload_0         
	//  135  236:getfield        #29  <Field int[] d>
	//  136  239:iconst_0        
	//  137  240:aload           5
	//  138  242:iconst_0        
	//  139  243:iload_2         
	//  140  244:invokestatic    #105 <Method void System.arraycopy(Object, int, Object, int, int)>
								i1 = k;
	//  141  247:iload_2         
	//  142  248:istore_3        
							}
							for(; i1 < ai1.length - 1; i1++)
	//* 143  249:iload_3         
	//* 144  250:aload           5
	//* 145  252:arraylength     
	//* 146  253:iconst_1        
	//* 147  254:isub            
	//* 148  255:icmpge          278
							{
								ai1[i1] = awg1.g();
	//  149  258:aload           5
	//  150  260:iload_3         
	//  151  261:aload_1         
	//  152  262:invokevirtual   #88  <Method int awg.g()>
	//  153  265:iastore         
								awg1.a();
	//  154  266:aload_1         
	//  155  267:invokevirtual   #75  <Method int awg.a()>
	//  156  270:pop             
							}

	//  157  271:iload_3         
	//  158  272:iconst_1        
	//  159  273:iadd            
	//  160  274:istore_3        
	//* 161  275:goto            249
							ai1[i1] = awg1.g();
	//  162  278:aload           5
	//  163  280:iload_3         
	//  164  281:aload_1         
	//  165  282:invokevirtual   #88  <Method int awg.g()>
	//  166  285:iastore         
							d = ai1;
	//  167  286:aload_0         
	//  168  287:aload           5
	//  169  289:putfield        #29  <Field int[] d>
						}
					} else
	//* 170  292:goto            0
					{
						c = Boolean.valueOf(awg1.d());
	//  171  295:aload_0         
	//  172  296:aload_1         
	//  173  297:invokevirtual   #112 <Method boolean awg.d()>
	//  174  300:invokestatic    #115 <Method Boolean Boolean.valueOf(boolean)>
	//  175  303:putfield        #23  <Field Boolean c>
					}
				} else
	//* 176  306:goto            0
				{
					b = Integer.valueOf(awg1.g());
	//  177  309:aload_0         
	//  178  310:aload_1         
	//  179  311:invokevirtual   #88  <Method int awg.g()>
	//  180  314:invokestatic    #118 <Method Integer Integer.valueOf(int)>
	//  181  317:putfield        #21  <Field Integer b>
				}
			} else
	//* 182  320:goto            0
			{
				a = Long.valueOf(awg1.h());
	//  183  323:aload_0         
	//  184  324:aload_1         
	//  185  325:invokevirtual   #81  <Method long awg.h()>
	//  186  328:invokestatic    #85  <Method Long Long.valueOf(long)>
	//  187  331:putfield        #19  <Field Long a>
			}
		} while(true);
	//  188  334:goto            0
		return ((awp) (this));
	//  189  337:aload_0         
	//  190  338:areturn         
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Long a>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
			awh1.b(1, ((Long) (obj)).longValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_3         
	//    8   12:invokevirtual   #45  <Method long Long.longValue()>
	//    9   15:invokevirtual   #122 <Method void awh.b(int, long)>
		obj = ((Object) (b));
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field Integer b>
	//   12   22:astore_3        
		if(obj != null)
	//*  13   23:aload_3         
	//*  14   24:ifnull          36
			awh1.a(2, ((Integer) (obj)).intValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_3         
	//   18   30:invokevirtual   #55  <Method int Integer.intValue()>
	//   19   33:invokevirtual   #125 <Method void awh.a(int, int)>
		obj = ((Object) (c));
	//   20   36:aload_0         
	//   21   37:getfield        #23  <Field Boolean c>
	//   22   40:astore_3        
		if(obj != null)
	//*  23   41:aload_3         
	//*  24   42:ifnull          54
			awh1.a(3, ((Boolean) (obj)).booleanValue());
	//   25   45:aload_1         
	//   26   46:iconst_3        
	//   27   47:aload_3         
	//   28   48:invokevirtual   #64  <Method boolean Boolean.booleanValue()>
	//   29   51:invokevirtual   #128 <Method void awh.a(int, boolean)>
		int ai[] = d;
	//   30   54:aload_0         
	//   31   55:getfield        #29  <Field int[] d>
	//   32   58:astore_3        
		if(ai != null && ai.length > 0)
	//*  33   59:aload_3         
	//*  34   60:ifnull          96
	//*  35   63:aload_3         
	//*  36   64:arraylength     
	//*  37   65:ifle            96
		{
			int i = 0;
	//   38   68:iconst_0        
	//   39   69:istore_2        
			do
			{
				int ai1[] = d;
	//   40   70:aload_0         
	//   41   71:getfield        #29  <Field int[] d>
	//   42   74:astore_3        
				if(i >= ai1.length)
					break;
	//   43   75:iload_2         
	//   44   76:aload_3         
	//   45   77:arraylength     
	//   46   78:icmpge          96
				awh1.a(4, ai1[i]);
	//   47   81:aload_1         
	//   48   82:iconst_4        
	//   49   83:aload_3         
	//   50   84:iload_2         
	//   51   85:iaload          
	//   52   86:invokevirtual   #125 <Method void awh.a(int, int)>
				i++;
	//   53   89:iload_2         
	//   54   90:iconst_1        
	//   55   91:iadd            
	//   56   92:istore_2        
			} while(true);
	//   57   93:goto            70
		}
		ai1 = ((int []) (e));
	//   58   96:aload_0         
	//   59   97:getfield        #31  <Field Long e>
	//   60  100:astore_3        
		if(ai1 != null)
	//*  61  101:aload_3         
	//*  62  102:ifnull          114
			awh1.a(5, ((Long) (ai1)).longValue());
	//   63  105:aload_1         
	//   64  106:iconst_5        
	//   65  107:aload_3         
	//   66  108:invokevirtual   #45  <Method long Long.longValue()>
	//   67  111:invokevirtual   #130 <Method void awh.a(int, long)>
		super.a(awh1);
	//   68  114:aload_0         
	//   69  115:aload_1         
	//   70  116:invokespecial   #132 <Method void awj.a(awh)>
	//   71  119:return          
	}

	private Long a;
	private Integer b;
	private Boolean c;
	private int d[];
	private Long e;
}
