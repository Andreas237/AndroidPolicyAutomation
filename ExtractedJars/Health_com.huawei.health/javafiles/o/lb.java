// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.BarEntry;

// Referenced classes of package o:
//			ky, mt

public class lb extends ky
{

	public lb(int j, int k, boolean flag)
	{
		super(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #18  <Method void ky(int)>
		f = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #20  <Field int f>
		h = 1;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #22  <Field int h>
		i = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #24  <Field boolean i>
		g = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #26  <Field boolean g>
		l = 1.0F;
	//   15   25:aload_0         
	//   16   26:fconst_1        
	//   17   27:putfield        #28  <Field float l>
		h = k;
	//   18   30:aload_0         
	//   19   31:iload_2         
	//   20   32:putfield        #22  <Field int h>
		i = flag;
	//   21   35:aload_0         
	//   22   36:iload_3         
	//   23   37:putfield        #24  <Field boolean i>
	//   24   40:return          
	}

	public void b(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean g>
	//    3    5:return          
	}

	public void d(float f1)
	{
		l = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #28  <Field float l>
	//    3    5:return          
	}

	protected void e(float f1, float f2, float f3, float f4)
	{
		float af[] = e;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field float[] e>
	//    2    4:astore          6
		int j = b;
	//    3    6:aload_0         
	//    4    7:getfield        #40  <Field int b>
	//    5   10:istore          5
		b = j + 1;
	//    6   12:aload_0         
	//    7   13:iload           5
	//    8   15:iconst_1        
	//    9   16:iadd            
	//   10   17:putfield        #40  <Field int b>
		af[j] = f1;
	//   11   20:aload           6
	//   12   22:iload           5
	//   13   24:fload_1         
	//   14   25:fastore         
		af = e;
	//   15   26:aload_0         
	//   16   27:getfield        #38  <Field float[] e>
	//   17   30:astore          6
		j = b;
	//   18   32:aload_0         
	//   19   33:getfield        #40  <Field int b>
	//   20   36:istore          5
		b = j + 1;
	//   21   38:aload_0         
	//   22   39:iload           5
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:putfield        #40  <Field int b>
		af[j] = f2;
	//   26   46:aload           6
	//   27   48:iload           5
	//   28   50:fload_2         
	//   29   51:fastore         
		af = e;
	//   30   52:aload_0         
	//   31   53:getfield        #38  <Field float[] e>
	//   32   56:astore          6
		j = b;
	//   33   58:aload_0         
	//   34   59:getfield        #40  <Field int b>
	//   35   62:istore          5
		b = j + 1;
	//   36   64:aload_0         
	//   37   65:iload           5
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:putfield        #40  <Field int b>
		af[j] = f3;
	//   41   72:aload           6
	//   42   74:iload           5
	//   43   76:fload_3         
	//   44   77:fastore         
		af = e;
	//   45   78:aload_0         
	//   46   79:getfield        #38  <Field float[] e>
	//   47   82:astore          6
		j = b;
	//   48   84:aload_0         
	//   49   85:getfield        #40  <Field int b>
	//   50   88:istore          5
		b = j + 1;
	//   51   90:aload_0         
	//   52   91:iload           5
	//   53   93:iconst_1        
	//   54   94:iadd            
	//   55   95:putfield        #40  <Field int b>
		af[j] = f4;
	//   56   98:aload           6
	//   57  100:iload           5
	//   58  102:fload           4
	//   59  104:fastore         
	//   60  105:return          
	}

	public void e(int j)
	{
		f = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int f>
	//    3    5:return          
	}

	public void e(mt mt1)
	{
		float f10 = mt1.C();
	//    0    0:aload_1         
	//    1    1:invokeinterface #47  <Method int mt.C()>
	//    2    6:i2f             
	//    3    7:fstore          8
		float f11 = c;
	//    4    9:aload_0         
	//    5   10:getfield        #50  <Field float c>
	//    6   13:fstore          9
		float f12 = l / 2.0F;
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field float l>
	//    9   19:fconst_2        
	//   10   20:fdiv            
	//   11   21:fstore          10
label0:
		for(int j = 0; (float)j < f10 * f11; j++)
	//*  12   23:iconst_0        
	//*  13   24:istore          12
	//*  14   26:iload           12
	//*  15   28:i2f             
	//*  16   29:fload           8
	//*  17   31:fload           9
	//*  18   33:fmul            
	//*  19   34:fcmpg           
	//*  20   35:ifge            450
		{
			BarEntry barentry = (BarEntry)mt1.f(j);
	//   21   38:aload_1         
	//   22   39:iload           12
	//   23   41:invokeinterface #53  <Method com.github.mikephil.charting.data.Entry mt.f(int)>
	//   24   46:checkcast       #55  <Class BarEntry>
	//   25   49:astore          14
			if(barentry == null)
	//*  26   51:aload           14
	//*  27   53:ifnonnull       59
				continue;
	//   28   56:goto            441
			float f13 = barentry.getX();
	//   29   59:aload           14
	//   30   61:invokevirtual   #59  <Method float BarEntry.getX()>
	//   31   64:fstore          11
			float f1 = barentry.getY();
	//   32   66:aload           14
	//   33   68:invokevirtual   #62  <Method float BarEntry.getY()>
	//   34   71:fstore_2        
			float af[] = barentry.getYVals();
	//   35   72:aload           14
	//   36   74:invokevirtual   #66  <Method float[] BarEntry.getYVals()>
	//   37   77:astore          15
			if(!i || af == null)
	//*  38   79:aload_0         
	//*  39   80:getfield        #24  <Field boolean i>
	//*  40   83:ifeq            91
	//*  41   86:aload           15
	//*  42   88:ifnonnull       200
			{
				float f3;
				if(g)
	//*  43   91:aload_0         
	//*  44   92:getfield        #26  <Field boolean g>
	//*  45   95:ifeq            134
				{
					if(f1 >= 0.0F)
	//*  46   98:fload_2         
	//*  47   99:fconst_0        
	//*  48  100:fcmpl           
	//*  49  101:iflt            109
						f3 = f1;
	//   50  104:fload_2         
	//   51  105:fstore_3        
					else
	//*  52  106:goto            111
						f3 = 0.0F;
	//   53  109:fconst_0        
	//   54  110:fstore_3        
					float f5;
					if(f1 <= 0.0F)
	//*  55  111:fload_2         
	//*  56  112:fconst_0        
	//*  57  113:fcmpg           
	//*  58  114:ifgt            123
						f5 = f1;
	//   59  117:fload_2         
	//   60  118:fstore          4
					else
	//*  61  120:goto            126
						f5 = 0.0F;
	//   62  123:fconst_0        
	//   63  124:fstore          4
					f1 = f3;
	//   64  126:fload_3         
	//   65  127:fstore_2        
					f3 = f5;
	//   66  128:fload           4
	//   67  130:fstore_3        
				} else
	//*  68  131:goto            158
				{
					if(f1 >= 0.0F)
	//*  69  134:fload_2         
	//*  70  135:fconst_0        
	//*  71  136:fcmpl           
	//*  72  137:iflt            145
						f3 = f1;
	//   73  140:fload_2         
	//   74  141:fstore_3        
					else
	//*  75  142:goto            147
						f3 = 0.0F;
	//   76  145:fconst_0        
	//   77  146:fstore_3        
					if(f1 > 0.0F)
	//*  78  147:fload_2         
	//*  79  148:fconst_0        
	//*  80  149:fcmpg           
	//*  81  150:ifgt            156
	//*  82  153:goto            158
						f1 = 0.0F;
	//   83  156:fconst_0        
	//   84  157:fstore_2        
				}
				if(f3 > 0.0F)
	//*  85  158:fload_3         
	//*  86  159:fconst_0        
	//*  87  160:fcmpl           
	//*  88  161:ifle            174
					f3 *= a;
	//   89  164:fload_3         
	//   90  165:aload_0         
	//   91  166:getfield        #69  <Field float a>
	//   92  169:fmul            
	//   93  170:fstore_3        
				else
	//*  94  171:goto            181
					f1 *= a;
	//   95  174:fload_2         
	//   96  175:aload_0         
	//   97  176:getfield        #69  <Field float a>
	//   98  179:fmul            
	//   99  180:fstore_2        
				e(f13 - f12, f3, f13 + f12, f1);
	//  100  181:aload_0         
	//  101  182:fload           11
	//  102  184:fload           10
	//  103  186:fsub            
	//  104  187:fload_3         
	//  105  188:fload           11
	//  106  190:fload           10
	//  107  192:fadd            
	//  108  193:fload_2         
	//  109  194:invokevirtual   #71  <Method void e(float, float, float, float)>
				continue;
	//  110  197:goto            441
			}
			float f6 = 0.0F;
	//  111  200:fconst_0        
	//  112  201:fstore          4
			float f4 = -barentry.getNegativeSum();
	//  113  203:aload           14
	//  114  205:invokevirtual   #74  <Method float BarEntry.getNegativeSum()>
	//  115  208:fneg            
	//  116  209:fstore_3        
			int k = 0;
	//  117  210:iconst_0        
	//  118  211:istore          13
			do
			{
				if(k >= af.length)
					continue label0;
	//  119  213:iload           13
	//  120  215:aload           15
	//  121  217:arraylength     
	//  122  218:icmpge          441
				float f7 = af[k];
	//  123  221:aload           15
	//  124  223:iload           13
	//  125  225:faload          
	//  126  226:fstore          5
				float f2;
				float f8;
				if(f7 == 0.0F && (f6 == 0.0F || f4 == 0.0F))
	//* 127  228:fload           5
	//* 128  230:fconst_0        
	//* 129  231:fcmpl           
	//* 130  232:ifne            267
	//* 131  235:fload           4
	//* 132  237:fconst_0        
	//* 133  238:fcmpl           
	//* 134  239:ifeq            248
	//* 135  242:fload_3         
	//* 136  243:fconst_0        
	//* 137  244:fcmpl           
	//* 138  245:ifne            267
				{
					f2 = f7;
	//  139  248:fload           5
	//  140  250:fstore_2        
					float f9 = f2;
	//  141  251:fload_2         
	//  142  252:fstore          7
					f7 = f6;
	//  143  254:fload           4
	//  144  256:fstore          5
					f8 = f4;
	//  145  258:fload_3         
	//  146  259:fstore          6
					f4 = f9;
	//  147  261:fload           7
	//  148  263:fstore_3        
				} else
	//* 149  264:goto            328
				if(f7 >= 0.0F)
	//* 150  267:fload           5
	//* 151  269:fconst_0        
	//* 152  270:fcmpl           
	//* 153  271:iflt            297
				{
					f2 = f6;
	//  154  274:fload           4
	//  155  276:fstore_2        
					f6 += f7;
	//  156  277:fload           4
	//  157  279:fload           5
	//  158  281:fadd            
	//  159  282:fstore          4
					f7 = f6;
	//  160  284:fload           4
	//  161  286:fstore          5
					f8 = f4;
	//  162  288:fload_3         
	//  163  289:fstore          6
					f4 = f6;
	//  164  291:fload           4
	//  165  293:fstore_3        
				} else
	//* 166  294:goto            328
				{
					f2 = f4;
	//  167  297:fload_3         
	//  168  298:fstore_2        
					f8 = f4 + Math.abs(f7);
	//  169  299:fload_3         
	//  170  300:fload           5
	//  171  302:invokestatic    #80  <Method float Math.abs(float)>
	//  172  305:fadd            
	//  173  306:fstore          6
					f7 = f4 + Math.abs(f7);
	//  174  308:fload_3         
	//  175  309:fload           5
	//  176  311:invokestatic    #80  <Method float Math.abs(float)>
	//  177  314:fadd            
	//  178  315:fstore          5
					f4 = f8;
	//  179  317:fload           6
	//  180  319:fstore_3        
					f8 = f7;
	//  181  320:fload           5
	//  182  322:fstore          6
					f7 = f6;
	//  183  324:fload           4
	//  184  326:fstore          5
				}
				if(g)
	//* 185  328:aload_0         
	//* 186  329:getfield        #26  <Field boolean g>
	//* 187  332:ifeq            367
				{
					if(f2 >= f4)
	//* 188  335:fload_2         
	//* 189  336:fload_3         
	//* 190  337:fcmpl           
	//* 191  338:iflt            347
						f6 = f2;
	//  192  341:fload_2         
	//  193  342:fstore          4
					else
	//* 194  344:goto            350
						f6 = f4;
	//  195  347:fload_3         
	//  196  348:fstore          4
					if(f2 <= f4)
	//* 197  350:fload_2         
	//* 198  351:fload_3         
	//* 199  352:fcmpg           
	//* 200  353:ifgt            361
						f4 = f2;
	//  201  356:fload_2         
	//  202  357:fstore_3        
	//* 203  358:goto            361
					f2 = f6;
	//  204  361:fload           4
	//  205  363:fstore_2        
				} else
	//* 206  364:goto            399
				{
					if(f2 >= f4)
	//* 207  367:fload_2         
	//* 208  368:fload_3         
	//* 209  369:fcmpl           
	//* 210  370:iflt            379
						f6 = f2;
	//  211  373:fload_2         
	//  212  374:fstore          4
					else
	//* 213  376:goto            382
						f6 = f4;
	//  214  379:fload_3         
	//  215  380:fstore          4
					if(f2 <= f4)
	//* 216  382:fload_2         
	//* 217  383:fload_3         
	//* 218  384:fcmpg           
	//* 219  385:ifgt            394
					{
						f4 = f6;
	//  220  388:fload           4
	//  221  390:fstore_3        
					} else
	//* 222  391:goto            399
					{
						f2 = f4;
	//  223  394:fload_3         
	//  224  395:fstore_2        
						f4 = f6;
	//  225  396:fload           4
	//  226  398:fstore_3        
					}
				}
				e(f13 - f12, f4 * a, f13 + f12, f2 * a);
	//  227  399:aload_0         
	//  228  400:fload           11
	//  229  402:fload           10
	//  230  404:fsub            
	//  231  405:fload_3         
	//  232  406:aload_0         
	//  233  407:getfield        #69  <Field float a>
	//  234  410:fmul            
	//  235  411:fload           11
	//  236  413:fload           10
	//  237  415:fadd            
	//  238  416:fload_2         
	//  239  417:aload_0         
	//  240  418:getfield        #69  <Field float a>
	//  241  421:fmul            
	//  242  422:invokevirtual   #71  <Method void e(float, float, float, float)>
				k++;
	//  243  425:iload           13
	//  244  427:iconst_1        
	//  245  428:iadd            
	//  246  429:istore          13
				f6 = f7;
	//  247  431:fload           5
	//  248  433:fstore          4
				f4 = f8;
	//  249  435:fload           6
	//  250  437:fstore_3        
			} while(true);
	//  251  438:goto            213
		}

	//  252  441:iload           12
	//  253  443:iconst_1        
	//  254  444:iadd            
	//  255  445:istore          12
	//* 256  447:goto            26
		e();
	//  257  450:aload_0         
	//  258  451:invokevirtual   #83  <Method void e()>
	//  259  454:return          
	}

	protected int f;
	protected boolean g;
	protected int h;
	protected boolean i;
	protected float l;
}
