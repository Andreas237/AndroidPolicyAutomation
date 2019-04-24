// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.BarEntry;

// Referenced classes of package o:
//			lb, mt

public class lc extends lb
{

	public lc(int i, int j, boolean flag)
	{
		super(i, j, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #8   <Method void lb(int, int, boolean)>
	//    5    7:return          
	}

	public void e(mt mt1)
	{
		float f11 = mt1.C();
	//    0    0:aload_1         
	//    1    1:invokeinterface #17  <Method int mt.C()>
	//    2    6:i2f             
	//    3    7:fstore          7
		float f12 = c;
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field float c>
	//    6   13:fstore          8
		float f13 = l / 2.0F;
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field float l>
	//    9   19:fconst_2        
	//   10   20:fdiv            
	//   11   21:fstore          9
label0:
		for(int i = 0; (float)i < f11 * f12; i++)
	//*  12   23:iconst_0        
	//*  13   24:istore          11
	//*  14   26:iload           11
	//*  15   28:i2f             
	//*  16   29:fload           7
	//*  17   31:fload           8
	//*  18   33:fmul            
	//*  19   34:fcmpg           
	//*  20   35:ifge            418
		{
			BarEntry barentry = (BarEntry)mt1.f(i);
	//   21   38:aload_1         
	//   22   39:iload           11
	//   23   41:invokeinterface #28  <Method com.github.mikephil.charting.data.Entry mt.f(int)>
	//   24   46:checkcast       #30  <Class BarEntry>
	//   25   49:astore          13
			if(barentry == null)
	//*  26   51:aload           13
	//*  27   53:ifnonnull       59
				continue;
	//   28   56:goto            409
			float f14 = barentry.getX();
	//   29   59:aload           13
	//   30   61:invokevirtual   #34  <Method float BarEntry.getX()>
	//   31   64:fstore          10
			float f = barentry.getY();
	//   32   66:aload           13
	//   33   68:invokevirtual   #37  <Method float BarEntry.getY()>
	//   34   71:fstore_2        
			float af[] = barentry.getYVals();
	//   35   72:aload           13
	//   36   74:invokevirtual   #41  <Method float[] BarEntry.getYVals()>
	//   37   77:astore          14
			if(!this.i || af == null)
	//*  38   79:aload_0         
	//*  39   80:getfield        #45  <Field boolean i>
	//*  40   83:ifeq            91
	//*  41   86:aload           14
	//*  42   88:ifnonnull       200
			{
				float f1;
				if(g)
	//*  43   91:aload_0         
	//*  44   92:getfield        #48  <Field boolean g>
	//*  45   95:ifeq            134
				{
					if(f >= 0.0F)
	//*  46   98:fload_2         
	//*  47   99:fconst_0        
	//*  48  100:fcmpl           
	//*  49  101:iflt            109
						f1 = f;
	//   50  104:fload_2         
	//   51  105:fstore_3        
					else
	//*  52  106:goto            111
						f1 = 0.0F;
	//   53  109:fconst_0        
	//   54  110:fstore_3        
					float f3;
					if(f <= 0.0F)
	//*  55  111:fload_2         
	//*  56  112:fconst_0        
	//*  57  113:fcmpg           
	//*  58  114:ifgt            123
						f3 = f;
	//   59  117:fload_2         
	//   60  118:fstore          4
					else
	//*  61  120:goto            126
						f3 = 0.0F;
	//   62  123:fconst_0        
	//   63  124:fstore          4
					f = f1;
	//   64  126:fload_3         
	//   65  127:fstore_2        
					f1 = f3;
	//   66  128:fload           4
	//   67  130:fstore_3        
				} else
	//*  68  131:goto            158
				{
					if(f >= 0.0F)
	//*  69  134:fload_2         
	//*  70  135:fconst_0        
	//*  71  136:fcmpl           
	//*  72  137:iflt            145
						f1 = f;
	//   73  140:fload_2         
	//   74  141:fstore_3        
					else
	//*  75  142:goto            147
						f1 = 0.0F;
	//   76  145:fconst_0        
	//   77  146:fstore_3        
					if(f > 0.0F)
	//*  78  147:fload_2         
	//*  79  148:fconst_0        
	//*  80  149:fcmpg           
	//*  81  150:ifgt            156
	//*  82  153:goto            158
						f = 0.0F;
	//   83  156:fconst_0        
	//   84  157:fstore_2        
				}
				if(f1 > 0.0F)
	//*  85  158:fload_3         
	//*  86  159:fconst_0        
	//*  87  160:fcmpl           
	//*  88  161:ifle            174
					f1 *= a;
	//   89  164:fload_3         
	//   90  165:aload_0         
	//   91  166:getfield        #51  <Field float a>
	//   92  169:fmul            
	//   93  170:fstore_3        
				else
	//*  94  171:goto            181
					f *= a;
	//   95  174:fload_2         
	//   96  175:aload_0         
	//   97  176:getfield        #51  <Field float a>
	//   98  179:fmul            
	//   99  180:fstore_2        
				e(f, f14 + f13, f1, f14 - f13);
	//  100  181:aload_0         
	//  101  182:fload_2         
	//  102  183:fload           10
	//  103  185:fload           9
	//  104  187:fadd            
	//  105  188:fload_3         
	//  106  189:fload           10
	//  107  191:fload           9
	//  108  193:fsub            
	//  109  194:invokevirtual   #54  <Method void e(float, float, float, float)>
				continue;
	//  110  197:goto            409
			}
			f = 0.0F;
	//  111  200:fconst_0        
	//  112  201:fstore_2        
			float f2 = -barentry.getNegativeSum();
	//  113  202:aload           13
	//  114  204:invokevirtual   #57  <Method float BarEntry.getNegativeSum()>
	//  115  207:fneg            
	//  116  208:fstore_3        
			int j = 0;
	//  117  209:iconst_0        
	//  118  210:istore          12
			do
			{
				if(j >= af.length)
					continue label0;
	//  119  212:iload           12
	//  120  214:aload           14
	//  121  216:arraylength     
	//  122  217:icmpge          409
				float f10 = af[j];
	//  123  220:aload           14
	//  124  222:iload           12
	//  125  224:faload          
	//  126  225:fstore          6
				float f9;
				if(f10 >= 0.0F)
	//* 127  227:fload           6
	//* 128  229:fconst_0        
	//* 129  230:fcmpl           
	//* 130  231:iflt            263
				{
					f9 = f;
	//  131  234:fload_2         
	//  132  235:fstore          5
					float f4 = f + f10;
	//  133  237:fload_2         
	//  134  238:fload           6
	//  135  240:fadd            
	//  136  241:fstore          4
					f10 = f4;
	//  137  243:fload           4
	//  138  245:fstore          6
					f = f9;
	//  139  247:fload           5
	//  140  249:fstore_2        
					f9 = f10;
	//  141  250:fload           6
	//  142  252:fstore          5
					f10 = f2;
	//  143  254:fload_3         
	//  144  255:fstore          6
					f2 = f4;
	//  145  257:fload           4
	//  146  259:fstore_3        
				} else
	//* 147  260:goto            293
				{
					float f5 = f2;
	//  148  263:fload_3         
	//  149  264:fstore          4
					f9 = f2 + Math.abs(f10);
	//  150  266:fload_3         
	//  151  267:fload           6
	//  152  269:invokestatic    #63  <Method float Math.abs(float)>
	//  153  272:fadd            
	//  154  273:fstore          5
					f10 = f2 + Math.abs(f10);
	//  155  275:fload_3         
	//  156  276:fload           6
	//  157  278:invokestatic    #63  <Method float Math.abs(float)>
	//  158  281:fadd            
	//  159  282:fstore          6
					f2 = f9;
	//  160  284:fload           5
	//  161  286:fstore_3        
					f9 = f;
	//  162  287:fload_2         
	//  163  288:fstore          5
					f = f5;
	//  164  290:fload           4
	//  165  292:fstore_2        
				}
				if(g)
	//* 166  293:aload_0         
	//* 167  294:getfield        #48  <Field boolean g>
	//* 168  297:ifeq            332
				{
					float f6;
					if(f >= f2)
	//* 169  300:fload_2         
	//* 170  301:fload_3         
	//* 171  302:fcmpl           
	//* 172  303:iflt            312
						f6 = f;
	//  173  306:fload_2         
	//  174  307:fstore          4
					else
	//* 175  309:goto            315
						f6 = f2;
	//  176  312:fload_3         
	//  177  313:fstore          4
					if(f <= f2)
	//* 178  315:fload_2         
	//* 179  316:fload_3         
	//* 180  317:fcmpg           
	//* 181  318:ifgt            326
						f2 = f;
	//  182  321:fload_2         
	//  183  322:fstore_3        
	//* 184  323:goto            326
					f = f6;
	//  185  326:fload           4
	//  186  328:fstore_2        
				} else
	//* 187  329:goto            364
				{
					float f7;
					if(f >= f2)
	//* 188  332:fload_2         
	//* 189  333:fload_3         
	//* 190  334:fcmpl           
	//* 191  335:iflt            344
						f7 = f;
	//  192  338:fload_2         
	//  193  339:fstore          4
					else
	//* 194  341:goto            347
						f7 = f2;
	//  195  344:fload_3         
	//  196  345:fstore          4
					if(f <= f2)
	//* 197  347:fload_2         
	//* 198  348:fload_3         
	//* 199  349:fcmpg           
	//* 200  350:ifgt            359
					{
						f2 = f7;
	//  201  353:fload           4
	//  202  355:fstore_3        
					} else
	//* 203  356:goto            364
					{
						f = f2;
	//  204  359:fload_3         
	//  205  360:fstore_2        
						f2 = f7;
	//  206  361:fload           4
	//  207  363:fstore_3        
					}
				}
				float f8 = a;
	//  208  364:aload_0         
	//  209  365:getfield        #51  <Field float a>
	//  210  368:fstore          4
				e(f * a, f14 + f13, f2 * f8, f14 - f13);
	//  211  370:aload_0         
	//  212  371:fload_2         
	//  213  372:aload_0         
	//  214  373:getfield        #51  <Field float a>
	//  215  376:fmul            
	//  216  377:fload           10
	//  217  379:fload           9
	//  218  381:fadd            
	//  219  382:fload_3         
	//  220  383:fload           4
	//  221  385:fmul            
	//  222  386:fload           10
	//  223  388:fload           9
	//  224  390:fsub            
	//  225  391:invokevirtual   #54  <Method void e(float, float, float, float)>
				j++;
	//  226  394:iload           12
	//  227  396:iconst_1        
	//  228  397:iadd            
	//  229  398:istore          12
				f = f9;
	//  230  400:fload           5
	//  231  402:fstore_2        
				f2 = f10;
	//  232  403:fload           6
	//  233  405:fstore_3        
			} while(true);
	//  234  406:goto            212
		}

	//  235  409:iload           11
	//  236  411:iconst_1        
	//  237  412:iadd            
	//  238  413:istore          11
	//* 239  415:goto            26
		e();
	//  240  418:aload_0         
	//  241  419:invokevirtual   #66  <Method void e()>
	//  242  422:return          
	}
}
