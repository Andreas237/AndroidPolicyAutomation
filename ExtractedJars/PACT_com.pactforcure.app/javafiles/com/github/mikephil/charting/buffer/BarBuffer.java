// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

// Referenced classes of package com.github.mikephil.charting.buffer:
//			AbstractBuffer

public class BarBuffer extends AbstractBuffer
{

	public BarBuffer(int i, float f, int j, boolean flag)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #19  <Method void AbstractBuffer(int)>
		mBarSpace = 0.0F;
	//    3    5:aload_0         
	//    4    6:fconst_0        
	//    5    7:putfield        #21  <Field float mBarSpace>
		mGroupSpace = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #23  <Field float mGroupSpace>
		mDataSetIndex = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #25  <Field int mDataSetIndex>
		mDataSetCount = 1;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #27  <Field int mDataSetCount>
		mContainsStacks = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #29  <Field boolean mContainsStacks>
		mInverted = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #31  <Field boolean mInverted>
		mGroupSpace = f;
	//   21   35:aload_0         
	//   22   36:fload_2         
	//   23   37:putfield        #23  <Field float mGroupSpace>
		mDataSetCount = j;
	//   24   40:aload_0         
	//   25   41:iload_3         
	//   26   42:putfield        #27  <Field int mDataSetCount>
		mContainsStacks = flag;
	//   27   45:aload_0         
	//   28   46:iload           4
	//   29   48:putfield        #29  <Field boolean mContainsStacks>
	//   30   51:return          
	}

	protected void addBar(float f, float f1, float f2, float f3)
	{
		float af[] = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field float[] buffer>
	//    2    4:astore          6
		int i = index;
	//    3    6:aload_0         
	//    4    7:getfield        #41  <Field int index>
	//    5   10:istore          5
		index = i + 1;
	//    6   12:aload_0         
	//    7   13:iload           5
	//    8   15:iconst_1        
	//    9   16:iadd            
	//   10   17:putfield        #41  <Field int index>
		af[i] = f;
	//   11   20:aload           6
	//   12   22:iload           5
	//   13   24:fload_1         
	//   14   25:fastore         
		af = buffer;
	//   15   26:aload_0         
	//   16   27:getfield        #38  <Field float[] buffer>
	//   17   30:astore          6
		i = index;
	//   18   32:aload_0         
	//   19   33:getfield        #41  <Field int index>
	//   20   36:istore          5
		index = i + 1;
	//   21   38:aload_0         
	//   22   39:iload           5
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:putfield        #41  <Field int index>
		af[i] = f1;
	//   26   46:aload           6
	//   27   48:iload           5
	//   28   50:fload_2         
	//   29   51:fastore         
		af = buffer;
	//   30   52:aload_0         
	//   31   53:getfield        #38  <Field float[] buffer>
	//   32   56:astore          6
		i = index;
	//   33   58:aload_0         
	//   34   59:getfield        #41  <Field int index>
	//   35   62:istore          5
		index = i + 1;
	//   36   64:aload_0         
	//   37   65:iload           5
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:putfield        #41  <Field int index>
		af[i] = f2;
	//   41   72:aload           6
	//   42   74:iload           5
	//   43   76:fload_3         
	//   44   77:fastore         
		af = buffer;
	//   45   78:aload_0         
	//   46   79:getfield        #38  <Field float[] buffer>
	//   47   82:astore          6
		i = index;
	//   48   84:aload_0         
	//   49   85:getfield        #41  <Field int index>
	//   50   88:istore          5
		index = i + 1;
	//   51   90:aload_0         
	//   52   91:iload           5
	//   53   93:iconst_1        
	//   54   94:iadd            
	//   55   95:putfield        #41  <Field int index>
		af[i] = f3;
	//   56   98:aload           6
	//   57  100:iload           5
	//   58  102:fload           4
	//   59  104:fastore         
	//   60  105:return          
	}

	public void feed(IBarDataSet ibardataset)
	{
		float f10 = ibardataset.getEntryCount();
	//    0    0:aload_1         
	//    1    1:invokeinterface #49  <Method int IBarDataSet.getEntryCount()>
	//    2    6:i2f             
	//    3    7:fstore          8
		float f11 = phaseX;
	//    4    9:aload_0         
	//    5   10:getfield        #52  <Field float phaseX>
	//    6   13:fstore          9
		int k = mDataSetCount;
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field int mDataSetCount>
	//    9   19:istore          15
		float f12 = mBarSpace / 2.0F;
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field float mBarSpace>
	//   12   25:fconst_2        
	//   13   26:fdiv            
	//   14   27:fstore          10
		float f13 = mGroupSpace / 2.0F;
	//   15   29:aload_0         
	//   16   30:getfield        #23  <Field float mGroupSpace>
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
	//*  28   49:ifge            456
			{
				BarEntry barentry = (BarEntry)ibardataset.getEntryForIndex(i);
	//   29   52:aload_1         
	//   30   53:iload           13
	//   31   55:invokeinterface #56  <Method com.github.mikephil.charting.data.Entry IBarDataSet.getEntryForIndex(int)>
	//   32   60:checkcast       #58  <Class BarEntry>
	//   33   63:astore          16
				float f14 = (float)(barentry.getXIndex() + barentry.getXIndex() * (k - 1) + mDataSetIndex) + mGroupSpace * (float)barentry.getXIndex() + f13;
	//   34   65:aload           16
	//   35   67:invokevirtual   #61  <Method int BarEntry.getXIndex()>
	//   36   70:aload           16
	//   37   72:invokevirtual   #61  <Method int BarEntry.getXIndex()>
	//   38   75:iload           15
	//   39   77:iconst_1        
	//   40   78:isub            
	//   41   79:imul            
	//   42   80:iadd            
	//   43   81:aload_0         
	//   44   82:getfield        #25  <Field int mDataSetIndex>
	//   45   85:iadd            
	//   46   86:i2f             
	//   47   87:aload_0         
	//   48   88:getfield        #23  <Field float mGroupSpace>
	//   49   91:aload           16
	//   50   93:invokevirtual   #61  <Method int BarEntry.getXIndex()>
	//   51   96:i2f             
	//   52   97:fmul            
	//   53   98:fadd            
	//   54   99:fload           11
	//   55  101:fadd            
	//   56  102:fstore          12
				float f = barentry.getVal();
	//   57  104:aload           16
	//   58  106:invokevirtual   #65  <Method float BarEntry.getVal()>
	//   59  109:fstore_2        
				float af[] = barentry.getVals();
	//   60  110:aload           16
	//   61  112:invokevirtual   #69  <Method float[] BarEntry.getVals()>
	//   62  115:astore          17
				if(!mContainsStacks || af == null)
	//*  63  117:aload_0         
	//*  64  118:getfield        #29  <Field boolean mContainsStacks>
	//*  65  121:ifeq            129
	//*  66  124:aload           17
	//*  67  126:ifnonnull       248
				{
					float f2;
					if(mInverted)
	//*  68  129:aload_0         
	//*  69  130:getfield        #31  <Field boolean mInverted>
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
	//*  87  158:getfield        #72  <Field float phaseY>
	//*  88  161:fmul            
	//*  89  162:fstore_2        
	//*  90  163:aload_0         
	//*  91  164:fload           12
	//*  92  166:ldc1            #73  <Float 0.5F>
	//*  93  168:fsub            
	//*  94  169:fload           10
	//*  95  171:fadd            
	//*  96  172:fload_2         
	//*  97  173:fload           12
	//*  98  175:ldc1            #73  <Float 0.5F>
	//*  99  177:fadd            
	//* 100  178:fload           10
	//* 101  180:fsub            
	//* 102  181:fload_3         
	//* 103  182:invokevirtual   #75  <Method void addBar(float, float, float, float)>
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
	//  138  240:getfield        #72  <Field float phaseY>
	//  139  243:fmul            
	//  140  244:fstore_3        
					addBar((f14 - 0.5F) + f12, f, (f14 + 0.5F) - f12, f2);
				} else
	//* 141  245:goto            163
				{
					float f1 = 0.0F;
	//  142  248:fconst_0        
	//  143  249:fstore_2        
					float f5 = -barentry.getNegativeSum();
	//  144  250:aload           16
	//  145  252:invokevirtual   #78  <Method float BarEntry.getNegativeSum()>
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
	//* 161  280:iflt            374
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
	//* 175  302:getfield        #31  <Field boolean mInverted>
	//* 176  305:ifeq            422
	//* 177  308:fload_2         
	//* 178  309:fload_3         
	//* 179  310:fcmpl           
	//* 180  311:iflt            408
	//* 181  314:fload_2         
	//* 182  315:fstore          4
	//* 183  317:fload_2         
	//* 184  318:fload_3         
	//* 185  319:fcmpg           
	//* 186  320:ifgt            414
	//* 187  323:fload           4
	//* 188  325:fstore_3        
	//* 189  326:aload_0         
	//* 190  327:fload           12
	//* 191  329:ldc1            #73  <Float 0.5F>
	//* 192  331:fsub            
	//* 193  332:fload           10
	//* 194  334:fadd            
	//* 195  335:fload_2         
	//* 196  336:aload_0         
	//* 197  337:getfield        #72  <Field float phaseY>
	//* 198  340:fmul            
	//* 199  341:fload           12
	//* 200  343:ldc1            #73  <Float 0.5F>
	//* 201  345:fadd            
	//* 202  346:fload           10
	//* 203  348:fsub            
	//* 204  349:fload_3         
	//* 205  350:aload_0         
	//* 206  351:getfield        #72  <Field float phaseY>
	//* 207  354:fmul            
	//* 208  355:invokevirtual   #75  <Method void addBar(float, float, float, float)>
	//* 209  358:iload           14
	//* 210  360:iconst_1        
	//* 211  361:iadd            
	//* 212  362:istore          14
	//* 213  364:fload           5
	//* 214  366:fstore          4
	//* 215  368:fload           6
	//* 216  370:fstore_2        
	//* 217  371:goto            261
						{
							f3 = f5;
	//  218  374:fload           4
	//  219  376:fstore_3        
							float f9 = f5 + Math.abs(f8);
	//  220  377:fload           4
	//  221  379:fload           6
	//  222  381:invokestatic    #84  <Method float Math.abs(float)>
	//  223  384:fadd            
	//  224  385:fstore          7
							f7 = f5 + Math.abs(f8);
	//  225  387:fload           4
	//  226  389:fload           6
	//  227  391:invokestatic    #84  <Method float Math.abs(float)>
	//  228  394:fadd            
	//  229  395:fstore          5
							f8 = f1;
	//  230  397:fload_2         
	//  231  398:fstore          6
							f1 = f3;
	//  232  400:fload_3         
	//  233  401:fstore_2        
							f3 = f9;
	//  234  402:fload           7
	//  235  404:fstore_3        
						}
						if(mInverted)
						{
							if(f1 >= f3)
								f5 = f1;
							else
	//* 236  405:goto            301
								f5 = f3;
	//  237  408:fload_3         
	//  238  409:fstore          4
							if(f1 <= f3)
							{
								f3 = f5;
							} else
	//* 239  411:goto            317
							{
								f1 = f3;
	//  240  414:fload_3         
	//  241  415:fstore_2        
								f3 = f5;
	//  242  416:fload           4
	//  243  418:fstore_3        
							}
						} else
	//* 244  419:goto            326
						{
							float f6;
							if(f1 >= f3)
	//* 245  422:fload_2         
	//* 246  423:fload_3         
	//* 247  424:fcmpl           
	//* 248  425:iflt            445
								f6 = f1;
	//  249  428:fload_2         
	//  250  429:fstore          4
							else
	//* 251  431:fload_2         
	//* 252  432:fload_3         
	//* 253  433:fcmpg           
	//* 254  434:ifgt            451
	//* 255  437:fload_2         
	//* 256  438:fstore_3        
	//* 257  439:fload           4
	//* 258  441:fstore_2        
	//* 259  442:goto            326
								f6 = f3;
	//  260  445:fload_3         
	//  261  446:fstore          4
							if(f1 > f3)
	//* 262  448:goto            431
								f1 = f3;
	//  263  451:fload_3         
	//  264  452:fstore_2        
							f3 = f1;
							f1 = f6;
						}
						addBar((f14 - 0.5F) + f12, f1 * phaseY, (f14 + 0.5F) - f12, f3 * phaseY);
						j++;
						f5 = f7;
						f1 = f8;
					}
				}
				i++;
			}
	//* 265  453:goto            437
			reset();
	//  266  456:aload_0         
	//  267  457:invokevirtual   #88  <Method void reset()>
			return;
	//  268  460:return          
		} while(true);
	}

	public volatile void feed(Object obj)
	{
		feed((IBarDataSet)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #45  <Class IBarDataSet>
	//    3    5:invokevirtual   #91  <Method void feed(IBarDataSet)>
	//    4    8:return          
	}

	public void setBarSpace(float f)
	{
		mBarSpace = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #21  <Field float mBarSpace>
	//    3    5:return          
	}

	public void setDataSet(int i)
	{
		mDataSetIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int mDataSetIndex>
	//    3    5:return          
	}

	public void setInverted(boolean flag)
	{
		mInverted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field boolean mInverted>
	//    3    5:return          
	}

	protected float mBarSpace;
	protected boolean mContainsStacks;
	protected int mDataSetCount;
	protected int mDataSetIndex;
	protected float mGroupSpace;
	protected boolean mInverted;
}
