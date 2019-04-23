// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ac;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, GapWorker

class RecyclerView$ViewFlinger
	implements Runnable
{

	private int computeScrollDuration(int i, int j, int k, int l)
	{
		int i1 = Math.abs(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #56  <Method int Math.abs(int)>
	//    2    4:istore          9
		int j1 = Math.abs(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #56  <Method int Math.abs(int)>
	//    5   10:istore          10
		boolean flag;
		if(i1 > j1)
	//*   6   12:iload           9
	//*   7   14:iload           10
	//*   8   16:icmple          25
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore          8
		else
	//*  11   22:goto            28
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore          8
		k = (int)Math.sqrt(k * k + l * l);
	//   14   28:iload_3         
	//   15   29:iload_3         
	//   16   30:imul            
	//   17   31:iload           4
	//   18   33:iload           4
	//   19   35:imul            
	//   20   36:iadd            
	//   21   37:i2d             
	//   22   38:invokestatic    #60  <Method double Math.sqrt(double)>
	//   23   41:d2i             
	//   24   42:istore_3        
		j = (int)Math.sqrt(i * i + j * j);
	//   25   43:iload_1         
	//   26   44:iload_1         
	//   27   45:imul            
	//   28   46:iload_2         
	//   29   47:iload_2         
	//   30   48:imul            
	//   31   49:iadd            
	//   32   50:i2d             
	//   33   51:invokestatic    #60  <Method double Math.sqrt(double)>
	//   34   54:d2i             
	//   35   55:istore_2        
		if(flag)
	//*  36   56:iload           8
	//*  37   58:ifeq            72
			i = getWidth();
	//   38   61:aload_0         
	//   39   62:getfield        #22  <Field RecyclerView this$0>
	//   40   65:invokevirtual   #64  <Method int RecyclerView.getWidth()>
	//   41   68:istore_1        
		else
	//*  42   69:goto            80
			i = getHeight();
	//   43   72:aload_0         
	//   44   73:getfield        #22  <Field RecyclerView this$0>
	//   45   76:invokevirtual   #67  <Method int RecyclerView.getHeight()>
	//   46   79:istore_1        
		l = i / 2;
	//   47   80:iload_1         
	//   48   81:iconst_2        
	//   49   82:idiv            
	//   50   83:istore          4
		float f1 = j;
	//   51   85:iload_2         
	//   52   86:i2f             
	//   53   87:fstore          6
		float f = i;
	//   54   89:iload_1         
	//   55   90:i2f             
	//   56   91:fstore          5
		float f2 = Math.min(1.0F, (f1 * 1.0F) / f);
	//   57   93:fconst_1        
	//   58   94:fload           6
	//   59   96:fconst_1        
	//   60   97:fmul            
	//   61   98:fload           5
	//   62  100:fdiv            
	//   63  101:invokestatic    #71  <Method float Math.min(float, float)>
	//   64  104:fstore          7
		f1 = l;
	//   65  106:iload           4
	//   66  108:i2f             
	//   67  109:fstore          6
		f2 = distanceInfluenceForSnapDuration(f2);
	//   68  111:aload_0         
	//   69  112:fload           7
	//   70  114:invokespecial   #75  <Method float distanceInfluenceForSnapDuration(float)>
	//   71  117:fstore          7
		if(k > 0)
	//*  72  119:iload_3         
	//*  73  120:ifle            149
		{
			i = Math.round(Math.abs((f1 + f2 * f1) / (float)k) * 1000F) * 4;
	//   74  123:fload           6
	//   75  125:fload           7
	//   76  127:fload           6
	//   77  129:fmul            
	//   78  130:fadd            
	//   79  131:iload_3         
	//   80  132:i2f             
	//   81  133:fdiv            
	//   82  134:invokestatic    #77  <Method float Math.abs(float)>
	//   83  137:ldc1            #78  <Float 1000F>
	//   84  139:fmul            
	//   85  140:invokestatic    #82  <Method int Math.round(float)>
	//   86  143:iconst_4        
	//   87  144:imul            
	//   88  145:istore_1        
		} else
	//*  89  146:goto            175
		{
			if(flag)
	//*  90  149:iload           8
	//*  91  151:ifeq            160
				i = i1;
	//   92  154:iload           9
	//   93  156:istore_1        
			else
	//*  94  157:goto            163
				i = j1;
	//   95  160:iload           10
	//   96  162:istore_1        
			i = (int)(((float)i / f + 1.0F) * 300F);
	//   97  163:iload_1         
	//   98  164:i2f             
	//   99  165:fload           5
	//  100  167:fdiv            
	//  101  168:fconst_1        
	//  102  169:fadd            
	//  103  170:ldc1            #83  <Float 300F>
	//  104  172:fmul            
	//  105  173:f2i             
	//  106  174:istore_1        
		}
		return Math.min(i, 2000);
	//  107  175:iload_1         
	//  108  176:sipush          2000
	//  109  179:invokestatic    #86  <Method int Math.min(int, int)>
	//  110  182:ireturn         
	}

	private void disableRunOnAnimationRequests()
	{
		mReSchedulePostAnimationCallback = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #36  <Field boolean mReSchedulePostAnimationCallback>
		mEatRunOnAnimationRequest = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #34  <Field boolean mEatRunOnAnimationRequest>
	//    6   10:return          
	}

	private float distanceInfluenceForSnapDuration(float f)
	{
		return (float)Math.sin((f - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc1            #88  <Float 0.5F>
	//    2    3:fsub            
	//    3    4:ldc1            #89  <Float 0.4712389F>
	//    4    6:fmul            
	//    5    7:f2d             
	//    6    8:invokestatic    #92  <Method double Math.sin(double)>
	//    7   11:d2f             
	//    8   12:freturn         
	}

	private void enableRunOnAnimationRequests()
	{
		mEatRunOnAnimationRequest = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #34  <Field boolean mEatRunOnAnimationRequest>
		if(mReSchedulePostAnimationCallback)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field boolean mReSchedulePostAnimationCallback>
	//*   5    9:ifeq            16
			postOnAnimation();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #96  <Method void postOnAnimation()>
	//    8   16:return          
	}

	public void fling(int i, int j)
	{
		setScrollState(2);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field RecyclerView this$0>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #102 <Method void RecyclerView.setScrollState(int)>
		mLastFlingY = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #104 <Field int mLastFlingY>
		mLastFlingX = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #106 <Field int mLastFlingX>
		mScroller.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field OverScroller mScroller>
	//   12   22:iconst_0        
	//   13   23:iconst_0        
	//   14   24:iload_1         
	//   15   25:iload_2         
	//   16   26:ldc1            #107 <Int 0x80000000>
	//   17   28:ldc1            #108 <Int 0x7fffffff>
	//   18   30:ldc1            #107 <Int 0x80000000>
	//   19   32:ldc1            #108 <Int 0x7fffffff>
	//   20   34:invokevirtual   #111 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		postOnAnimation();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #96  <Method void postOnAnimation()>
	//   23   41:return          
	}

	void postOnAnimation()
	{
		if(mEatRunOnAnimationRequest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean mEatRunOnAnimationRequest>
	//*   2    4:ifeq            13
		{
			mReSchedulePostAnimationCallback = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #36  <Field boolean mReSchedulePostAnimationCallback>
			return;
	//    6   12:return          
		} else
		{
			removeCallbacks(((Runnable) (this)));
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field RecyclerView this$0>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #115 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   11   21:pop             
			ac.a(((android.view.View) (RecyclerView.this)), ((Runnable) (this)));
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field RecyclerView this$0>
	//   14   26:aload_0         
	//   15   27:invokestatic    #121 <Method void ac.a(android.view.View, Runnable)>
			return;
	//   16   30:return          
		}
	}

	public void run()
	{
		if(mLayout == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field RecyclerView this$0>
	//*   2    4:getfield        #126 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//*   3    7:ifnonnull       15
		{
			stop();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #129 <Method void stop()>
			return;
	//    6   14:return          
		}
		disableRunOnAnimationRequests();
	//    7   15:aload_0         
	//    8   16:invokespecial   #131 <Method void disableRunOnAnimationRequests()>
		consumePendingUpdateOperations();
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field RecyclerView this$0>
	//   11   23:invokevirtual   #134 <Method void RecyclerView.consumePendingUpdateOperations()>
		OverScroller overscroller = mScroller;
	//   12   26:aload_0         
	//   13   27:getfield        #47  <Field OverScroller mScroller>
	//   14   30:astore          13
		er er = mLayout.mSmoothScroller;
	//   15   32:aload_0         
	//   16   33:getfield        #22  <Field RecyclerView this$0>
	//   17   36:getfield        #126 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   18   39:getfield        #140 <Field RecyclerView$SmoothScroller RecyclerView$LayoutManager.mSmoothScroller>
	//   19   42:astore          14
		if(overscroller.computeScrollOffset())
	//*  20   44:aload           13
	//*  21   46:invokevirtual   #144 <Method boolean OverScroller.computeScrollOffset()>
	//*  22   49:ifeq            822
		{
			int ai[] = mScrollConsumed;
	//   23   52:aload_0         
	//   24   53:getfield        #22  <Field RecyclerView this$0>
	//   25   56:getfield        #148 <Field int[] RecyclerView.mScrollConsumed>
	//   26   59:astore          15
			int i3 = overscroller.getCurrX();
	//   27   61:aload           13
	//   28   63:invokevirtual   #151 <Method int OverScroller.getCurrX()>
	//   29   66:istore          11
			int j3 = overscroller.getCurrY();
	//   30   68:aload           13
	//   31   70:invokevirtual   #154 <Method int OverScroller.getCurrY()>
	//   32   73:istore          12
			int j = i3 - mLastFlingX;
	//   33   75:iload           11
	//   34   77:aload_0         
	//   35   78:getfield        #106 <Field int mLastFlingX>
	//   36   81:isub            
	//   37   82:istore_2        
			int i = j3 - mLastFlingY;
	//   38   83:iload           12
	//   39   85:aload_0         
	//   40   86:getfield        #104 <Field int mLastFlingY>
	//   41   89:isub            
	//   42   90:istore_1        
			mLastFlingX = i3;
	//   43   91:aload_0         
	//   44   92:iload           11
	//   45   94:putfield        #106 <Field int mLastFlingX>
			mLastFlingY = j3;
	//   46   97:aload_0         
	//   47   98:iload           12
	//   48  100:putfield        #104 <Field int mLastFlingY>
			int j1 = j;
	//   49  103:iload_2         
	//   50  104:istore          4
			int i1 = i;
	//   51  106:iload_1         
	//   52  107:istore_3        
			if(dispatchNestedPreScroll(j, i, ai, ((int []) (null)), 1))
	//*  53  108:aload_0         
	//*  54  109:getfield        #22  <Field RecyclerView this$0>
	//*  55  112:iload_2         
	//*  56  113:iload_1         
	//*  57  114:aload           15
	//*  58  116:aconst_null     
	//*  59  117:iconst_1        
	//*  60  118:invokevirtual   #158 <Method boolean RecyclerView.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//*  61  121:ifeq            139
			{
				j1 = j - ai[0];
	//   62  124:iload_2         
	//   63  125:aload           15
	//   64  127:iconst_0        
	//   65  128:iaload          
	//   66  129:isub            
	//   67  130:istore          4
				i1 = i - ai[1];
	//   68  132:iload_1         
	//   69  133:aload           15
	//   70  135:iconst_1        
	//   71  136:iaload          
	//   72  137:isub            
	//   73  138:istore_3        
			}
			int k1;
			int l1;
			int i2;
			int j2;
			if(mAdapter != null)
	//*  74  139:aload_0         
	//*  75  140:getfield        #22  <Field RecyclerView this$0>
	//*  76  143:getfield        #162 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  77  146:ifnull          382
			{
				RecyclerView recyclerview = RecyclerView.this;
	//   78  149:aload_0         
	//   79  150:getfield        #22  <Field RecyclerView this$0>
	//   80  153:astore          15
				recyclerview.scrollStep(j1, i1, recyclerview.mScrollStepConsumed);
	//   81  155:aload           15
	//   82  157:iload           4
	//   83  159:iload_3         
	//   84  160:aload           15
	//   85  162:getfield        #165 <Field int[] RecyclerView.mScrollStepConsumed>
	//   86  165:invokevirtual   #169 <Method void RecyclerView.scrollStep(int, int, int[])>
				i = mScrollStepConsumed[0];
	//   87  168:aload_0         
	//   88  169:getfield        #22  <Field RecyclerView this$0>
	//   89  172:getfield        #165 <Field int[] RecyclerView.mScrollStepConsumed>
	//   90  175:iconst_0        
	//   91  176:iaload          
	//   92  177:istore_1        
				int k = mScrollStepConsumed[1];
	//   93  178:aload_0         
	//   94  179:getfield        #22  <Field RecyclerView this$0>
	//   95  182:getfield        #165 <Field int[] RecyclerView.mScrollStepConsumed>
	//   96  185:iconst_1        
	//   97  186:iaload          
	//   98  187:istore_2        
				int k2 = j1 - i;
	//   99  188:iload           4
	//  100  190:iload_1         
	//  101  191:isub            
	//  102  192:istore          9
				int l2 = i1 - k;
	//  103  194:iload_3         
	//  104  195:iload_2         
	//  105  196:isub            
	//  106  197:istore          10
				k1 = i;
	//  107  199:iload_1         
	//  108  200:istore          5
				j2 = k;
	//  109  202:iload_2         
	//  110  203:istore          8
				i2 = k2;
	//  111  205:iload           9
	//  112  207:istore          7
				l1 = l2;
	//  113  209:iload           10
	//  114  211:istore          6
				if(er != null)
	//* 115  213:aload           14
	//* 116  215:ifnull          394
				{
					k1 = i;
	//  117  218:iload_1         
	//  118  219:istore          5
					j2 = k;
	//  119  221:iload_2         
	//  120  222:istore          8
					i2 = k2;
	//  121  224:iload           9
	//  122  226:istore          7
					l1 = l2;
	//  123  228:iload           10
	//  124  230:istore          6
					if(!er.isPendingInitialRun())
	//* 125  232:aload           14
	//* 126  234:invokevirtual   #174 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 127  237:ifne            394
					{
						k1 = i;
	//  128  240:iload_1         
	//  129  241:istore          5
						j2 = k;
	//  130  243:iload_2         
	//  131  244:istore          8
						i2 = k2;
	//  132  246:iload           9
	//  133  248:istore          7
						l1 = l2;
	//  134  250:iload           10
	//  135  252:istore          6
						if(er.isRunning())
	//* 136  254:aload           14
	//* 137  256:invokevirtual   #177 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 138  259:ifeq            394
						{
							k1 = mState.getItemCount();
	//  139  262:aload_0         
	//  140  263:getfield        #22  <Field RecyclerView this$0>
	//  141  266:getfield        #181 <Field RecyclerView$State RecyclerView.mState>
	//  142  269:invokevirtual   #186 <Method int RecyclerView$State.getItemCount()>
	//  143  272:istore          5
							if(k1 == 0)
	//* 144  274:iload           5
	//* 145  276:ifne            301
							{
								er.stop();
	//  146  279:aload           14
	//  147  281:invokevirtual   #187 <Method void RecyclerView$SmoothScroller.stop()>
								k1 = i;
	//  148  284:iload_1         
	//  149  285:istore          5
								j2 = k;
	//  150  287:iload_2         
	//  151  288:istore          8
								i2 = k2;
	//  152  290:iload           9
	//  153  292:istore          7
								l1 = l2;
	//  154  294:iload           10
	//  155  296:istore          6
							} else
	//* 156  298:goto            394
							if(er.getTargetPosition() >= k1)
	//* 157  301:aload           14
	//* 158  303:invokevirtual   #190 <Method int RecyclerView$SmoothScroller.getTargetPosition()>
	//* 159  306:iload           5
	//* 160  308:icmplt          351
							{
								er.setTargetPosition(k1 - 1);
	//  161  311:aload           14
	//  162  313:iload           5
	//  163  315:iconst_1        
	//  164  316:isub            
	//  165  317:invokevirtual   #193 <Method void RecyclerView$SmoothScroller.setTargetPosition(int)>
								er.onAnimation(j1 - k2, i1 - l2);
	//  166  320:aload           14
	//  167  322:iload           4
	//  168  324:iload           9
	//  169  326:isub            
	//  170  327:iload_3         
	//  171  328:iload           10
	//  172  330:isub            
	//  173  331:invokevirtual   #196 <Method void RecyclerView$SmoothScroller.onAnimation(int, int)>
								k1 = i;
	//  174  334:iload_1         
	//  175  335:istore          5
								j2 = k;
	//  176  337:iload_2         
	//  177  338:istore          8
								i2 = k2;
	//  178  340:iload           9
	//  179  342:istore          7
								l1 = l2;
	//  180  344:iload           10
	//  181  346:istore          6
							} else
	//* 182  348:goto            394
							{
								er.onAnimation(j1 - k2, i1 - l2);
	//  183  351:aload           14
	//  184  353:iload           4
	//  185  355:iload           9
	//  186  357:isub            
	//  187  358:iload_3         
	//  188  359:iload           10
	//  189  361:isub            
	//  190  362:invokevirtual   #196 <Method void RecyclerView$SmoothScroller.onAnimation(int, int)>
								k1 = i;
	//  191  365:iload_1         
	//  192  366:istore          5
								j2 = k;
	//  193  368:iload_2         
	//  194  369:istore          8
								i2 = k2;
	//  195  371:iload           9
	//  196  373:istore          7
								l1 = l2;
	//  197  375:iload           10
	//  198  377:istore          6
							}
						}
					}
				}
			} else
	//* 199  379:goto            394
			{
				k1 = 0;
	//  200  382:iconst_0        
	//  201  383:istore          5
				j2 = 0;
	//  202  385:iconst_0        
	//  203  386:istore          8
				i2 = 0;
	//  204  388:iconst_0        
	//  205  389:istore          7
				l1 = 0;
	//  206  391:iconst_0        
	//  207  392:istore          6
			}
			if(!mItemDecorations.isEmpty())
	//* 208  394:aload_0         
	//* 209  395:getfield        #22  <Field RecyclerView this$0>
	//* 210  398:getfield        #200 <Field ArrayList RecyclerView.mItemDecorations>
	//* 211  401:invokevirtual   #205 <Method boolean ArrayList.isEmpty()>
	//* 212  404:ifne            414
				invalidate();
	//  213  407:aload_0         
	//  214  408:getfield        #22  <Field RecyclerView this$0>
	//  215  411:invokevirtual   #208 <Method void RecyclerView.invalidate()>
			if(getOverScrollMode() != 2)
	//* 216  414:aload_0         
	//* 217  415:getfield        #22  <Field RecyclerView this$0>
	//* 218  418:invokevirtual   #211 <Method int RecyclerView.getOverScrollMode()>
	//* 219  421:iconst_2        
	//* 220  422:icmpeq          435
				considerReleasingGlowsOnScroll(j1, i1);
	//  221  425:aload_0         
	//  222  426:getfield        #22  <Field RecyclerView this$0>
	//  223  429:iload           4
	//  224  431:iload_3         
	//  225  432:invokevirtual   #214 <Method void RecyclerView.considerReleasingGlowsOnScroll(int, int)>
			if(!dispatchNestedScroll(k1, j2, i2, l1, ((int []) (null)), 1) && (i2 != 0 || l1 != 0))
	//* 226  435:aload_0         
	//* 227  436:getfield        #22  <Field RecyclerView this$0>
	//* 228  439:iload           5
	//* 229  441:iload           8
	//* 230  443:iload           7
	//* 231  445:iload           6
	//* 232  447:aconst_null     
	//* 233  448:iconst_1        
	//* 234  449:invokevirtual   #218 <Method boolean RecyclerView.dispatchNestedScroll(int, int, int, int, int[], int)>
	//* 235  452:ifne            603
	//* 236  455:iload           7
	//* 237  457:ifne            465
	//* 238  460:iload           6
	//* 239  462:ifeq            603
			{
				int l = (int)overscroller.getCurrVelocity();
	//  240  465:aload           13
	//  241  467:invokevirtual   #222 <Method float OverScroller.getCurrVelocity()>
	//  242  470:f2i             
	//  243  471:istore_2        
				if(i2 != i3)
	//* 244  472:iload           7
	//* 245  474:iload           11
	//* 246  476:icmpeq          505
				{
					if(i2 < 0)
	//* 247  479:iload           7
	//* 248  481:ifge            490
						i = -l;
	//  249  484:iload_2         
	//  250  485:ineg            
	//  251  486:istore_1        
					else
	//* 252  487:goto            507
					if(i2 > 0)
	//* 253  490:iload           7
	//* 254  492:ifle            500
						i = l;
	//  255  495:iload_2         
	//  256  496:istore_1        
					else
	//* 257  497:goto            507
						i = 0;
	//  258  500:iconst_0        
	//  259  501:istore_1        
				} else
	//* 260  502:goto            507
				{
					i = 0;
	//  261  505:iconst_0        
	//  262  506:istore_1        
				}
				if(l1 != j3)
	//* 263  507:iload           6
	//* 264  509:iload           12
	//* 265  511:icmpeq          538
				{
					if(l1 < 0)
	//* 266  514:iload           6
	//* 267  516:ifge            525
						l = -l;
	//  268  519:iload_2         
	//  269  520:ineg            
	//  270  521:istore_2        
					else
	//* 271  522:goto            540
					if(l1 <= 0)
	//* 272  525:iload           6
	//* 273  527:ifle            533
	//* 274  530:goto            540
						l = 0;
	//  275  533:iconst_0        
	//  276  534:istore_2        
				} else
	//* 277  535:goto            540
				{
					l = 0;
	//  278  538:iconst_0        
	//  279  539:istore_2        
				}
				if(getOverScrollMode() != 2)
	//* 280  540:aload_0         
	//* 281  541:getfield        #22  <Field RecyclerView this$0>
	//* 282  544:invokevirtual   #211 <Method int RecyclerView.getOverScrollMode()>
	//* 283  547:iconst_2        
	//* 284  548:icmpeq          560
					absorbGlows(i, l);
	//  285  551:aload_0         
	//  286  552:getfield        #22  <Field RecyclerView this$0>
	//  287  555:iload_1         
	//  288  556:iload_2         
	//  289  557:invokevirtual   #225 <Method void RecyclerView.absorbGlows(int, int)>
				if((i != 0 || i2 == i3 || overscroller.getFinalX() == 0) && (l != 0 || l1 == j3 || overscroller.getFinalY() == 0))
	//* 290  560:iload_1         
	//* 291  561:ifne            579
	//* 292  564:iload           7
	//* 293  566:iload           11
	//* 294  568:icmpeq          579
	//* 295  571:aload           13
	//* 296  573:invokevirtual   #228 <Method int OverScroller.getFinalX()>
	//* 297  576:ifne            603
	//* 298  579:iload_2         
	//* 299  580:ifne            598
	//* 300  583:iload           6
	//* 301  585:iload           12
	//* 302  587:icmpeq          598
	//* 303  590:aload           13
	//* 304  592:invokevirtual   #231 <Method int OverScroller.getFinalY()>
	//* 305  595:ifne            603
					overscroller.abortAnimation();
	//  306  598:aload           13
	//  307  600:invokevirtual   #234 <Method void OverScroller.abortAnimation()>
			}
			if(k1 != 0 || j2 != 0)
	//* 308  603:iload           5
	//* 309  605:ifne            613
	//* 310  608:iload           8
	//* 311  610:ifeq            624
				dispatchOnScrolled(k1, j2);
	//  312  613:aload_0         
	//  313  614:getfield        #22  <Field RecyclerView this$0>
	//  314  617:iload           5
	//  315  619:iload           8
	//  316  621:invokevirtual   #237 <Method void RecyclerView.dispatchOnScrolled(int, int)>
			if(!RecyclerView.access$200(RecyclerView.this))
	//* 317  624:aload_0         
	//* 318  625:getfield        #22  <Field RecyclerView this$0>
	//* 319  628:invokestatic    #241 <Method boolean RecyclerView.access$200(RecyclerView)>
	//* 320  631:ifne            641
				invalidate();
	//  321  634:aload_0         
	//  322  635:getfield        #22  <Field RecyclerView this$0>
	//  323  638:invokevirtual   #208 <Method void RecyclerView.invalidate()>
			if(i1 != 0 && mLayout.canScrollVertically() && j2 == i1)
	//* 324  641:iload_3         
	//* 325  642:ifeq            669
	//* 326  645:aload_0         
	//* 327  646:getfield        #22  <Field RecyclerView this$0>
	//* 328  649:getfield        #126 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 329  652:invokevirtual   #244 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//* 330  655:ifeq            669
	//* 331  658:iload           8
	//* 332  660:iload_3         
	//* 333  661:icmpne          669
				i = 1;
	//  334  664:iconst_1        
	//  335  665:istore_1        
			else
	//* 336  666:goto            671
				i = 0;
	//  337  669:iconst_0        
	//  338  670:istore_1        
			boolean flag1;
			if(j1 != 0 && mLayout.canScrollHorizontally() && k1 == j1)
	//* 339  671:iload           4
	//* 340  673:ifeq            701
	//* 341  676:aload_0         
	//* 342  677:getfield        #22  <Field RecyclerView this$0>
	//* 343  680:getfield        #126 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 344  683:invokevirtual   #247 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//* 345  686:ifeq            701
	//* 346  689:iload           5
	//* 347  691:iload           4
	//* 348  693:icmpne          701
				flag1 = true;
	//  349  696:iconst_1        
	//  350  697:istore_2        
			else
	//* 351  698:goto            703
				flag1 = false;
	//  352  701:iconst_0        
	//  353  702:istore_2        
			boolean flag;
			if((j1 != 0 || i1 != 0) && !flag1 && !i)
	//* 354  703:iload           4
	//* 355  705:ifne            712
	//* 356  708:iload_3         
	//* 357  709:ifeq            728
	//* 358  712:iload_2         
	//* 359  713:ifne            728
	//* 360  716:iload_1         
	//* 361  717:ifeq            723
	//* 362  720:goto            728
				flag = false;
	//  363  723:iconst_0        
	//  364  724:istore_1        
			else
	//* 365  725:goto            730
				flag = true;
	//  366  728:iconst_1        
	//  367  729:istore_1        
			if(!overscroller.isFinished() && (flag || hasNestedScrollingParent(1)))
	//* 368  730:aload           13
	//* 369  732:invokevirtual   #250 <Method boolean OverScroller.isFinished()>
	//* 370  735:ifne            790
	//* 371  738:iload_1         
	//* 372  739:ifne            756
	//* 373  742:aload_0         
	//* 374  743:getfield        #22  <Field RecyclerView this$0>
	//* 375  746:iconst_1        
	//* 376  747:invokevirtual   #254 <Method boolean RecyclerView.hasNestedScrollingParent(int)>
	//* 377  750:ifne            756
	//* 378  753:goto            790
			{
				postOnAnimation();
	//  379  756:aload_0         
	//  380  757:invokevirtual   #96  <Method void postOnAnimation()>
				if(mGapWorker != null)
	//* 381  760:aload_0         
	//* 382  761:getfield        #22  <Field RecyclerView this$0>
	//* 383  764:getfield        #258 <Field GapWorker RecyclerView.mGapWorker>
	//* 384  767:ifnull          822
					mGapWorker.postFromTraversal(RecyclerView.this, j1, i1);
	//  385  770:aload_0         
	//  386  771:getfield        #22  <Field RecyclerView this$0>
	//  387  774:getfield        #258 <Field GapWorker RecyclerView.mGapWorker>
	//  388  777:aload_0         
	//  389  778:getfield        #22  <Field RecyclerView this$0>
	//  390  781:iload           4
	//  391  783:iload_3         
	//  392  784:invokevirtual   #264 <Method void GapWorker.postFromTraversal(RecyclerView, int, int)>
			} else
	//* 393  787:goto            822
			{
				setScrollState(0);
	//  394  790:aload_0         
	//  395  791:getfield        #22  <Field RecyclerView this$0>
	//  396  794:iconst_0        
	//  397  795:invokevirtual   #102 <Method void RecyclerView.setScrollState(int)>
				if(RecyclerView.ALLOW_THREAD_GAP_WORK)
	//* 398  798:getstatic       #267 <Field boolean RecyclerView.ALLOW_THREAD_GAP_WORK>
	//* 399  801:ifeq            814
					mPrefetchRegistry.clearPrefetchPositions();
	//  400  804:aload_0         
	//  401  805:getfield        #22  <Field RecyclerView this$0>
	//  402  808:getfield        #271 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//  403  811:invokevirtual   #276 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
				stopNestedScroll(1);
	//  404  814:aload_0         
	//  405  815:getfield        #22  <Field RecyclerView this$0>
	//  406  818:iconst_1        
	//  407  819:invokevirtual   #279 <Method void RecyclerView.stopNestedScroll(int)>
			}
		}
		if(er != null)
	//* 408  822:aload           14
	//* 409  824:ifnull          854
		{
			if(er.isPendingInitialRun())
	//* 410  827:aload           14
	//* 411  829:invokevirtual   #174 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 412  832:ifeq            842
				er.onAnimation(0, 0);
	//  413  835:aload           14
	//  414  837:iconst_0        
	//  415  838:iconst_0        
	//  416  839:invokevirtual   #196 <Method void RecyclerView$SmoothScroller.onAnimation(int, int)>
			if(!mReSchedulePostAnimationCallback)
	//* 417  842:aload_0         
	//* 418  843:getfield        #36  <Field boolean mReSchedulePostAnimationCallback>
	//* 419  846:ifne            854
				er.stop();
	//  420  849:aload           14
	//  421  851:invokevirtual   #187 <Method void RecyclerView$SmoothScroller.stop()>
		}
		enableRunOnAnimationRequests();
	//  422  854:aload_0         
	//  423  855:invokespecial   #281 <Method void enableRunOnAnimationRequests()>
	//  424  858:return          
	}

	public void smoothScrollBy(int i, int j)
	{
		smoothScrollBy(i, j, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #285 <Method void smoothScrollBy(int, int, int, int)>
	//    6    8:return          
	}

	public void smoothScrollBy(int i, int j, int k)
	{
		smoothScrollBy(i, j, k, RecyclerView.sQuinticInterpolator);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #30  <Field Interpolator RecyclerView.sQuinticInterpolator>
	//    5    7:invokevirtual   #289 <Method void smoothScrollBy(int, int, int, Interpolator)>
	//    6   10:return          
	}

	public void smoothScrollBy(int i, int j, int k, int l)
	{
		smoothScrollBy(i, j, computeScrollDuration(i, j, k, l));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:iload_1         
	//    5    5:iload_2         
	//    6    6:iload_3         
	//    7    7:iload           4
	//    8    9:invokespecial   #291 <Method int computeScrollDuration(int, int, int, int)>
	//    9   12:invokevirtual   #293 <Method void smoothScrollBy(int, int, int)>
	//   10   15:return          
	}

	public void smoothScrollBy(int i, int j, int k, Interpolator interpolator)
	{
		if(mInterpolator != interpolator)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Interpolator mInterpolator>
	//*   2    4:aload           4
	//*   3    6:if_acmpeq       35
		{
			mInterpolator = interpolator;
	//    4    9:aload_0         
	//    5   10:aload           4
	//    6   12:putfield        #32  <Field Interpolator mInterpolator>
			mScroller = new OverScroller(getContext(), interpolator);
	//    7   15:aload_0         
	//    8   16:new             #38  <Class OverScroller>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #22  <Field RecyclerView this$0>
	//   12   24:invokevirtual   #42  <Method android.content.Context RecyclerView.getContext()>
	//   13   27:aload           4
	//   14   29:invokespecial   #45  <Method void OverScroller(android.content.Context, Interpolator)>
	//   15   32:putfield        #47  <Field OverScroller mScroller>
		}
		setScrollState(2);
	//   16   35:aload_0         
	//   17   36:getfield        #22  <Field RecyclerView this$0>
	//   18   39:iconst_2        
	//   19   40:invokevirtual   #102 <Method void RecyclerView.setScrollState(int)>
		mLastFlingY = 0;
	//   20   43:aload_0         
	//   21   44:iconst_0        
	//   22   45:putfield        #104 <Field int mLastFlingY>
		mLastFlingX = 0;
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:putfield        #106 <Field int mLastFlingX>
		mScroller.startScroll(0, 0, i, j, k);
	//   26   53:aload_0         
	//   27   54:getfield        #47  <Field OverScroller mScroller>
	//   28   57:iconst_0        
	//   29   58:iconst_0        
	//   30   59:iload_1         
	//   31   60:iload_2         
	//   32   61:iload_3         
	//   33   62:invokevirtual   #297 <Method void OverScroller.startScroll(int, int, int, int, int)>
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  34   65:getstatic       #302 <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   68:bipush          23
	//*  36   70:icmpge          81
			mScroller.computeScrollOffset();
	//   37   73:aload_0         
	//   38   74:getfield        #47  <Field OverScroller mScroller>
	//   39   77:invokevirtual   #144 <Method boolean OverScroller.computeScrollOffset()>
	//   40   80:pop             
		postOnAnimation();
	//   41   81:aload_0         
	//   42   82:invokevirtual   #96  <Method void postOnAnimation()>
	//   43   85:return          
	}

	public void smoothScrollBy(int i, int j, Interpolator interpolator)
	{
		int k = computeScrollDuration(i, j, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokespecial   #291 <Method int computeScrollDuration(int, int, int, int)>
	//    6    8:istore          4
		Interpolator interpolator1 = interpolator;
	//    7   10:aload_3         
	//    8   11:astore          5
		if(interpolator == null)
	//*   9   13:aload_3         
	//*  10   14:ifnonnull       22
			interpolator1 = RecyclerView.sQuinticInterpolator;
	//   11   17:getstatic       #30  <Field Interpolator RecyclerView.sQuinticInterpolator>
	//   12   20:astore          5
		smoothScrollBy(i, j, k, interpolator1);
	//   13   22:aload_0         
	//   14   23:iload_1         
	//   15   24:iload_2         
	//   16   25:iload           4
	//   17   27:aload           5
	//   18   29:invokevirtual   #289 <Method void smoothScrollBy(int, int, int, Interpolator)>
	//   19   32:return          
	}

	public void stop()
	{
		removeCallbacks(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field RecyclerView this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    4    8:pop             
		mScroller.abortAnimation();
	//    5    9:aload_0         
	//    6   10:getfield        #47  <Field OverScroller mScroller>
	//    7   13:invokevirtual   #234 <Method void OverScroller.abortAnimation()>
	//    8   16:return          
	}

	private boolean mEatRunOnAnimationRequest;
	Interpolator mInterpolator;
	private int mLastFlingX;
	private int mLastFlingY;
	private boolean mReSchedulePostAnimationCallback;
	OverScroller mScroller;
	final RecyclerView this$0;

	RecyclerView$ViewFlinger()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		mInterpolator = RecyclerView.sQuinticInterpolator;
	//    5    9:aload_0         
	//    6   10:getstatic       #30  <Field Interpolator RecyclerView.sQuinticInterpolator>
	//    7   13:putfield        #32  <Field Interpolator mInterpolator>
		mEatRunOnAnimationRequest = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #34  <Field boolean mEatRunOnAnimationRequest>
		mReSchedulePostAnimationCallback = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #36  <Field boolean mReSchedulePostAnimationCallback>
		mScroller = new OverScroller(getContext(), RecyclerView.sQuinticInterpolator);
	//   14   26:aload_0         
	//   15   27:new             #38  <Class OverScroller>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokevirtual   #42  <Method android.content.Context RecyclerView.getContext()>
	//   19   35:getstatic       #30  <Field Interpolator RecyclerView.sQuinticInterpolator>
	//   20   38:invokespecial   #45  <Method void OverScroller(android.content.Context, Interpolator)>
	//   21   41:putfield        #47  <Field OverScroller mScroller>
	//   22   44:return          
	}
}
