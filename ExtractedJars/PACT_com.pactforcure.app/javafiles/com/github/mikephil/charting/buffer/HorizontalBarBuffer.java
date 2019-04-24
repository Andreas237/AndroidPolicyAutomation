// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

// Referenced classes of package com.github.mikephil.charting.buffer:
//			BarBuffer

public class HorizontalBarBuffer extends BarBuffer
{

	public HorizontalBarBuffer(int i, float f, int j, boolean flag)
	{
		super(i, f, j, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #8   <Method void BarBuffer(int, float, int, boolean)>
	//    6    9:return          
	}

	public void feed(IBarDataSet ibardataset)
	{
		float f10 = ibardataset.getEntryCount();
	//    0    0:aload_1         
	//    1    1:invokeinterface #17  <Method int IBarDataSet.getEntryCount()>
	//    2    6:i2f             
	//    3    7:fstore          8
		float f11 = phaseX;
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field float phaseX>
	//    6   13:fstore          9
		int k = mDataSetCount;
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field int mDataSetCount>
	//    9   19:istore          15
		float f12 = mBarSpace / 2.0F;
	//   10   21:aload_0         
	//   11   22:getfield        #28  <Field float mBarSpace>
	//   12   25:fconst_2        
	//   13   26:fdiv            
	//   14   27:fstore          10
		float f13 = mGroupSpace / 2.0F;
	//   15   29:aload_0         
	//   16   30:getfield        #31  <Field float mGroupSpace>
	//   17   33:fconst_2        
	//   18   34:fdiv            
	//   19   35:fstore          11
		int i = 0;
	//   20   37:iconst_0        
	//   21   38:istore          13
		do
		{
			while((float)i < f10 * f11) 
	//*  22   40:iload           13
	//*  23   42:i2f             
	//*  24   43:fload           8
	//*  25   45:fload           9
	//*  26   47:fmul            
	//*  27   48:fcmpg           
	//*  28   49:ifge            460
			{
				BarEntry barentry = (BarEntry)ibardataset.getEntryForIndex(i);
	//   29   52:aload_1         
	//   30   53:iload           13
	//   31   55:invokeinterface #35  <Method com.github.mikephil.charting.data.Entry IBarDataSet.getEntryForIndex(int)>
	//   32   60:checkcast       #37  <Class BarEntry>
	//   33   63:astore          16
				float f14 = (float)(barentry.getXIndex() + barentry.getXIndex() * (k - 1) + mDataSetIndex) + mGroupSpace * (float)barentry.getXIndex() + f13;
	//   34   65:aload           16
	//   35   67:invokevirtual   #40  <Method int BarEntry.getXIndex()>
	//   36   70:aload           16
	//   37   72:invokevirtual   #40  <Method int BarEntry.getXIndex()>
	//   38   75:iload           15
	//   39   77:iconst_1        
	//   40   78:isub            
	//   41   79:imul            
	//   42   80:iadd            
	//   43   81:aload_0         
	//   44   82:getfield        #43  <Field int mDataSetIndex>
	//   45   85:iadd            
	//   46   86:i2f             
	//   47   87:aload_0         
	//   48   88:getfield        #31  <Field float mGroupSpace>
	//   49   91:aload           16
	//   50   93:invokevirtual   #40  <Method int BarEntry.getXIndex()>
	//   51   96:i2f             
	//   52   97:fmul            
	//   53   98:fadd            
	//   54   99:fload           11
	//   55  101:fadd            
	//   56  102:fstore          12
				float f = barentry.getVal();
	//   57  104:aload           16
	//   58  106:invokevirtual   #47  <Method float BarEntry.getVal()>
	//   59  109:fstore_2        
				float af[] = barentry.getVals();
	//   60  110:aload           16
	//   61  112:invokevirtual   #51  <Method float[] BarEntry.getVals()>
	//   62  115:astore          17
				if(!mContainsStacks || af == null)
	//*  63  117:aload_0         
	//*  64  118:getfield        #55  <Field boolean mContainsStacks>
	//*  65  121:ifeq            129
	//*  66  124:aload           17
	//*  67  126:ifnonnull       248
				{
					float f2;
					if(mInverted)
	//*  68  129:aload_0         
	//*  69  130:getfield        #58  <Field boolean mInverted>
	//*  70  133:ifeq            204
					{
						if(f >= 0.0F)
	//*  71  136:fload_2         
	//*  72  137:fconst_0        
	//*  73  138:fcmpl           
	//*  74  139:iflt            194
							f2 = f;
	//   75  142:fload_2         
	//   76  143:fstore_3        
						else
	//*  77  144:fload_2         
	//*  78  145:fconst_0        
	//*  79  146:fcmpg           
	//*  80  147:ifgt            199
	//*  81  150:fload_2         
	//*  82  151:fconst_0        
	//*  83  152:fcmpl           
	//*  84  153:ifle            238
	//*  85  156:fload_2         
	//*  86  157:aload_0         
	//*  87  158:getfield        #61  <Field float phaseY>
	//*  88  161:fmul            
	//*  89  162:fstore_2        
	//*  90  163:aload_0         
	//*  91  164:fload_3         
	//*  92  165:fload           12
	//*  93  167:ldc1            #62  <Float 0.5F>
	//*  94  169:fadd            
	//*  95  170:fload           10
	//*  96  172:fsub            
	//*  97  173:fload_2         
	//*  98  174:fload           12
	//*  99  176:ldc1            #62  <Float 0.5F>
	//* 100  178:fsub            
	//* 101  179:fload           10
	//* 102  181:fadd            
	//* 103  182:invokevirtual   #66  <Method void addBar(float, float, float, float)>
	//* 104  185:iload           13
	//* 105  187:iconst_1        
	//* 106  188:iadd            
	//* 107  189:istore          13
	//* 108  191:goto            40
							f2 = 0.0F;
	//  109  194:fconst_0        
	//  110  195:fstore_3        
						if(f > 0.0F)
	//* 111  196:goto            144
							f = 0.0F;
	//  112  199:fconst_0        
	//  113  200:fstore_2        
					} else
	//* 114  201:goto            150
					{
						float f4;
						if(f >= 0.0F)
	//* 115  204:fload_2         
	//* 116  205:fconst_0        
	//* 117  206:fcmpl           
	//* 118  207:iflt            227
							f4 = f;
	//  119  210:fload_2         
	//  120  211:fstore          4
						else
	//* 121  213:fload_2         
	//* 122  214:fconst_0        
	//* 123  215:fcmpg           
	//* 124  216:ifgt            233
	//* 125  219:fload_2         
	//* 126  220:fstore_3        
	//* 127  221:fload           4
	//* 128  223:fstore_2        
	//* 129  224:goto            150
							f4 = 0.0F;
	//  130  227:fconst_0        
	//  131  228:fstore          4
						if(f <= 0.0F)
							f2 = f;
						else
	//* 132  230:goto            213
							f2 = 0.0F;
	//  133  233:fconst_0        
	//  134  234:fstore_3        
						f = f4;
					}
					if(f > 0.0F)
						f *= phaseY;
					else
	//* 135  235:goto            221
						f2 *= phaseY;
	//  136  238:fload_3         
	//  137  239:aload_0         
	//  138  240:getfield        #61  <Field float phaseY>
	//  139  243:fmul            
	//  140  244:fstore_3        
					addBar(f2, (f14 + 0.5F) - f12, f, (f14 - 0.5F) + f12);
				} else
	//* 141  245:goto            163
				{
					float f1 = 0.0F;
	//  142  248:fconst_0        
	//  143  249:fstore_2        
					float f5 = -barentry.getNegativeSum();
	//  144  250:aload           16
	//  145  252:invokevirtual   #69  <Method float BarEntry.getNegativeSum()>
	//  146  255:fneg            
	//  147  256:fstore          4
					int j = 0;
	//  148  258:iconst_0        
	//  149  259:istore          14
					while(j < af.length) 
	//* 150  261:iload           14
	//* 151  263:aload           17
	//* 152  265:arraylength     
	//* 153  266:icmpge          185
					{
						float f8 = af[j];
	//  154  269:aload           17
	//  155  271:iload           14
	//  156  273:faload          
	//  157  274:fstore          6
						float f3;
						float f7;
						if(f8 >= 0.0F)
	//* 158  276:fload           6
	//* 159  278:fconst_0        
	//* 160  279:fcmpl           
	//* 161  280:iflt            378
						{
							f7 = f1;
	//  162  283:fload_2         
	//  163  284:fstore          5
							f3 = f1 + f8;
	//  164  286:fload_2         
	//  165  287:fload           6
	//  166  289:fadd            
	//  167  290:fstore_3        
							f8 = f3;
	//  168  291:fload_3         
	//  169  292:fstore          6
							f1 = f7;
	//  170  294:fload           5
	//  171  296:fstore_2        
							f7 = f5;
	//  172  297:fload           4
	//  173  299:fstore          5
						} else
	//* 174  301:aload_0         
	//* 175  302:getfield        #58  <Field boolean mInverted>
	//* 176  305:ifeq            426
	//* 177  308:fload_2         
	//* 178  309:fload_3         
	//* 179  310:fcmpl           
	//* 180  311:iflt            412
	//* 181  314:fload_2         
	//* 182  315:fstore          4
	//* 183  317:fload_2         
	//* 184  318:fload_3         
	//* 185  319:fcmpg           
	//* 186  320:ifgt            418
	//* 187  323:fload           4
	//* 188  325:fstore_3        
	//* 189  326:aload_0         
	//* 190  327:getfield        #61  <Field float phaseY>
	//* 191  330:fstore          4
	//* 192  332:aload_0         
	//* 193  333:fload_3         
	//* 194  334:aload_0         
	//* 195  335:getfield        #61  <Field float phaseY>
	//* 196  338:fmul            
	//* 197  339:fload           12
	//* 198  341:ldc1            #62  <Float 0.5F>
	//* 199  343:fadd            
	//* 200  344:fload           10
	//* 201  346:fsub            
	//* 202  347:fload_2         
	//* 203  348:fload           4
	//* 204  350:fmul            
	//* 205  351:fload           12
	//* 206  353:ldc1            #62  <Float 0.5F>
	//* 207  355:fsub            
	//* 208  356:fload           10
	//* 209  358:fadd            
	//* 210  359:invokevirtual   #66  <Method void addBar(float, float, float, float)>
	//* 211  362:iload           14
	//* 212  364:iconst_1        
	//* 213  365:iadd            
	//* 214  366:istore          14
	//* 215  368:fload           5
	//* 216  370:fstore          4
	//* 217  372:fload           6
	//* 218  374:fstore_2        
	//* 219  375:goto            261
						{
							f3 = f5;
	//  220  378:fload           4
	//  221  380:fstore_3        
							float f9 = f5 + Math.abs(f8);
	//  222  381:fload           4
	//  223  383:fload           6
	//  224  385:invokestatic    #75  <Method float Math.abs(float)>
	//  225  388:fadd            
	//  226  389:fstore          7
							f7 = f5 + Math.abs(f8);
	//  227  391:fload           4
	//  228  393:fload           6
	//  229  395:invokestatic    #75  <Method float Math.abs(float)>
	//  230  398:fadd            
	//  231  399:fstore          5
							f8 = f1;
	//  232  401:fload_2         
	//  233  402:fstore          6
							f1 = f3;
	//  234  404:fload_3         
	//  235  405:fstore_2        
							f3 = f9;
	//  236  406:fload           7
	//  237  408:fstore_3        
						}
						if(mInverted)
						{
							if(f1 >= f3)
								f5 = f1;
							else
	//* 238  409:goto            301
								f5 = f3;
	//  239  412:fload_3         
	//  240  413:fstore          4
							if(f1 <= f3)
							{
								f3 = f5;
							} else
	//* 241  415:goto            317
							{
								f1 = f3;
	//  242  418:fload_3         
	//  243  419:fstore_2        
								f3 = f5;
	//  244  420:fload           4
	//  245  422:fstore_3        
							}
						} else
	//* 246  423:goto            326
						{
							float f6;
							if(f1 >= f3)
	//* 247  426:fload_2         
	//* 248  427:fload_3         
	//* 249  428:fcmpl           
	//* 250  429:iflt            449
								f6 = f1;
	//  251  432:fload_2         
	//  252  433:fstore          4
							else
	//* 253  435:fload_2         
	//* 254  436:fload_3         
	//* 255  437:fcmpg           
	//* 256  438:ifgt            455
	//* 257  441:fload_2         
	//* 258  442:fstore_3        
	//* 259  443:fload           4
	//* 260  445:fstore_2        
	//* 261  446:goto            326
								f6 = f3;
	//  262  449:fload_3         
	//  263  450:fstore          4
							if(f1 > f3)
	//* 264  452:goto            435
								f1 = f3;
	//  265  455:fload_3         
	//  266  456:fstore_2        
							f3 = f1;
							f1 = f6;
						}
						f5 = phaseY;
						addBar(f3 * phaseY, (f14 + 0.5F) - f12, f1 * f5, (f14 - 0.5F) + f12);
						j++;
						f5 = f7;
						f1 = f8;
					}
				}
				i++;
			}
	//* 267  457:goto            441
			reset();
	//  268  460:aload_0         
	//  269  461:invokevirtual   #79  <Method void reset()>
			return;
	//  270  464:return          
		} while(true);
	}

	public volatile void feed(Object obj)
	{
		feed((IBarDataSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class IBarDataSet>
	//    3    5:invokevirtual   #82  <Method void feed(IBarDataSet)>
	//    4    8:return          
	}
}
