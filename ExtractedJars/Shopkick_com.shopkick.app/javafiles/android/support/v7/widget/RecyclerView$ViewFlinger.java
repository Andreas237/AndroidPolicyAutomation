// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
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
	//    1    1:invokestatic    #57  <Method int Math.abs(int)>
	//    2    4:istore          9
		int j1 = Math.abs(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #57  <Method int Math.abs(int)>
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
	//   22   38:invokestatic    #61  <Method double Math.sqrt(double)>
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
	//   33   51:invokestatic    #61  <Method double Math.sqrt(double)>
	//   34   54:d2i             
	//   35   55:istore_2        
		if(flag)
	//*  36   56:iload           8
	//*  37   58:ifeq            72
			i = getWidth();
	//   38   61:aload_0         
	//   39   62:getfield        #25  <Field RecyclerView this$0>
	//   40   65:invokevirtual   #65  <Method int RecyclerView.getWidth()>
	//   41   68:istore_1        
		else
	//*  42   69:goto            80
			i = getHeight();
	//   43   72:aload_0         
	//   44   73:getfield        #25  <Field RecyclerView this$0>
	//   45   76:invokevirtual   #68  <Method int RecyclerView.getHeight()>
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
	//   63  101:invokestatic    #72  <Method float Math.min(float, float)>
	//   64  104:fstore          7
		f1 = l;
	//   65  106:iload           4
	//   66  108:i2f             
	//   67  109:fstore          6
		f2 = distanceInfluenceForSnapDuration(f2);
	//   68  111:aload_0         
	//   69  112:fload           7
	//   70  114:invokespecial   #76  <Method float distanceInfluenceForSnapDuration(float)>
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
	//   82  134:invokestatic    #78  <Method float Math.abs(float)>
	//   83  137:ldc1            #79  <Float 1000F>
	//   84  139:fmul            
	//   85  140:invokestatic    #83  <Method int Math.round(float)>
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
	//  103  170:ldc1            #84  <Float 300F>
	//  104  172:fmul            
	//  105  173:f2i             
	//  106  174:istore_1        
		}
		return Math.min(i, 2000);
	//  107  175:iload_1         
	//  108  176:sipush          2000
	//  109  179:invokestatic    #87  <Method int Math.min(int, int)>
	//  110  182:ireturn         
	}

	private void disableRunOnAnimationRequests()
	{
		mReSchedulePostAnimationCallback = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field boolean mReSchedulePostAnimationCallback>
		mEatRunOnAnimationRequest = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #35  <Field boolean mEatRunOnAnimationRequest>
	//    6   10:return          
	}

	private float distanceInfluenceForSnapDuration(float f)
	{
		return (float)Math.sin((f - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc1            #89  <Float 0.5F>
	//    2    3:fsub            
	//    3    4:ldc1            #90  <Float 0.4712389F>
	//    4    6:fmul            
	//    5    7:f2d             
	//    6    8:invokestatic    #93  <Method double Math.sin(double)>
	//    7   11:d2f             
	//    8   12:freturn         
	}

	private void enableRunOnAnimationRequests()
	{
		mEatRunOnAnimationRequest = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #35  <Field boolean mEatRunOnAnimationRequest>
		if(mReSchedulePostAnimationCallback)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field boolean mReSchedulePostAnimationCallback>
	//*   5    9:ifeq            16
			postOnAnimation();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #97  <Method void postOnAnimation()>
	//    8   16:return          
	}

	public void fling(int i, int j)
	{
		setScrollState(2);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView this$0>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #103 <Method void RecyclerView.setScrollState(int)>
		mLastFlingY = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #105 <Field int mLastFlingY>
		mLastFlingX = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #107 <Field int mLastFlingX>
		mScroller.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field OverScroller mScroller>
	//   12   22:iconst_0        
	//   13   23:iconst_0        
	//   14   24:iload_1         
	//   15   25:iload_2         
	//   16   26:ldc1            #108 <Int 0x80000000>
	//   17   28:ldc1            #109 <Int 0x7fffffff>
	//   18   30:ldc1            #108 <Int 0x80000000>
	//   19   32:ldc1            #109 <Int 0x7fffffff>
	//   20   34:invokevirtual   #112 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		postOnAnimation();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #97  <Method void postOnAnimation()>
	//   23   41:return          
	}

	void postOnAnimation()
	{
		if(mEatRunOnAnimationRequest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field boolean mEatRunOnAnimationRequest>
	//*   2    4:ifeq            13
		{
			mReSchedulePostAnimationCallback = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #37  <Field boolean mReSchedulePostAnimationCallback>
			return;
	//    6   12:return          
		} else
		{
			removeCallbacks(((Runnable) (this)));
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field RecyclerView this$0>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #116 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   11   21:pop             
			ViewCompat.postOnAnimation(((android.view.View) (RecyclerView.this)), ((Runnable) (this)));
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field RecyclerView this$0>
	//   14   26:aload_0         
	//   15   27:invokestatic    #121 <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
			return;
	//   16   30:return          
		}
	}

	public void run()
	{
		if(mLayout == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field RecyclerView this$0>
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
	//   10   20:getfield        #25  <Field RecyclerView this$0>
	//   11   23:invokevirtual   #134 <Method void RecyclerView.consumePendingUpdateOperations()>
		OverScroller overscroller = mScroller;
	//   12   26:aload_0         
	//   13   27:getfield        #48  <Field OverScroller mScroller>
	//   14   30:astore          13
		er er = mLayout.mSmoothScroller;
	//   15   32:aload_0         
	//   16   33:getfield        #25  <Field RecyclerView this$0>
	//   17   36:getfield        #126 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   18   39:getfield        #140 <Field RecyclerView$SmoothScroller RecyclerView$LayoutManager.mSmoothScroller>
	//   19   42:astore          14
		if(overscroller.computeScrollOffset())
	//*  20   44:aload           13
	//*  21   46:invokevirtual   #144 <Method boolean OverScroller.computeScrollOffset()>
	//*  22   49:ifeq            827
		{
			int ai[] = mScrollConsumed;
	//   23   52:aload_0         
	//   24   53:getfield        #25  <Field RecyclerView this$0>
	//   25   56:getfield        #148 <Field int[] RecyclerView.mScrollConsumed>
	//   26   59:astore          15
			int j3 = overscroller.getCurrX();
	//   27   61:aload           13
	//   28   63:invokevirtual   #151 <Method int OverScroller.getCurrX()>
	//   29   66:istore          11
			int k3 = overscroller.getCurrY();
	//   30   68:aload           13
	//   31   70:invokevirtual   #154 <Method int OverScroller.getCurrY()>
	//   32   73:istore          12
			int j = j3 - mLastFlingX;
	//   33   75:iload           11
	//   34   77:aload_0         
	//   35   78:getfield        #107 <Field int mLastFlingX>
	//   36   81:isub            
	//   37   82:istore_2        
			int i = k3 - mLastFlingY;
	//   38   83:iload           12
	//   39   85:aload_0         
	//   40   86:getfield        #105 <Field int mLastFlingY>
	//   41   89:isub            
	//   42   90:istore_1        
			mLastFlingX = j3;
	//   43   91:aload_0         
	//   44   92:iload           11
	//   45   94:putfield        #107 <Field int mLastFlingX>
			mLastFlingY = k3;
	//   46   97:aload_0         
	//   47   98:iload           12
	//   48  100:putfield        #105 <Field int mLastFlingY>
			int k1 = j;
	//   49  103:iload_2         
	//   50  104:istore          4
			int j1 = i;
	//   51  106:iload_1         
	//   52  107:istore_3        
			if(dispatchNestedPreScroll(j, i, ai, ((int []) (null)), 1))
	//*  53  108:aload_0         
	//*  54  109:getfield        #25  <Field RecyclerView this$0>
	//*  55  112:iload_2         
	//*  56  113:iload_1         
	//*  57  114:aload           15
	//*  58  116:aconst_null     
	//*  59  117:iconst_1        
	//*  60  118:invokevirtual   #158 <Method boolean RecyclerView.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//*  61  121:ifeq            139
			{
				k1 = j - ai[0];
	//   62  124:iload_2         
	//   63  125:aload           15
	//   64  127:iconst_0        
	//   65  128:iaload          
	//   66  129:isub            
	//   67  130:istore          4
				j1 = i - ai[1];
	//   68  132:iload_1         
	//   69  133:aload           15
	//   70  135:iconst_1        
	//   71  136:iaload          
	//   72  137:isub            
	//   73  138:istore_3        
			}
			int l1;
			int i2;
			int j2;
			int k2;
			if(mAdapter != null)
	//*  74  139:aload_0         
	//*  75  140:getfield        #25  <Field RecyclerView this$0>
	//*  76  143:getfield        #162 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  77  146:ifnull          382
			{
				RecyclerView recyclerview = RecyclerView.this;
	//   78  149:aload_0         
	//   79  150:getfield        #25  <Field RecyclerView this$0>
	//   80  153:astore          15
				recyclerview.scrollStep(k1, j1, recyclerview.mScrollStepConsumed);
	//   81  155:aload           15
	//   82  157:iload           4
	//   83  159:iload_3         
	//   84  160:aload           15
	//   85  162:getfield        #165 <Field int[] RecyclerView.mScrollStepConsumed>
	//   86  165:invokevirtual   #169 <Method void RecyclerView.scrollStep(int, int, int[])>
				i = mScrollStepConsumed[0];
	//   87  168:aload_0         
	//   88  169:getfield        #25  <Field RecyclerView this$0>
	//   89  172:getfield        #165 <Field int[] RecyclerView.mScrollStepConsumed>
	//   90  175:iconst_0        
	//   91  176:iaload          
	//   92  177:istore_1        
				int k = mScrollStepConsumed[1];
	//   93  178:aload_0         
	//   94  179:getfield        #25  <Field RecyclerView this$0>
	//   95  182:getfield        #165 <Field int[] RecyclerView.mScrollStepConsumed>
	//   96  185:iconst_1        
	//   97  186:iaload          
	//   98  187:istore_2        
				int l2 = k1 - i;
	//   99  188:iload           4
	//  100  190:iload_1         
	//  101  191:isub            
	//  102  192:istore          9
				int i3 = j1 - k;
	//  103  194:iload_3         
	//  104  195:iload_2         
	//  105  196:isub            
	//  106  197:istore          10
				l1 = i;
	//  107  199:iload_1         
	//  108  200:istore          5
				k2 = k;
	//  109  202:iload_2         
	//  110  203:istore          8
				j2 = l2;
	//  111  205:iload           9
	//  112  207:istore          7
				i2 = i3;
	//  113  209:iload           10
	//  114  211:istore          6
				if(er != null)
	//* 115  213:aload           14
	//* 116  215:ifnull          399
				{
					l1 = i;
	//  117  218:iload_1         
	//  118  219:istore          5
					k2 = k;
	//  119  221:iload_2         
	//  120  222:istore          8
					j2 = l2;
	//  121  224:iload           9
	//  122  226:istore          7
					i2 = i3;
	//  123  228:iload           10
	//  124  230:istore          6
					if(!er.isPendingInitialRun())
	//* 125  232:aload           14
	//* 126  234:invokevirtual   #174 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 127  237:ifne            399
					{
						l1 = i;
	//  128  240:iload_1         
	//  129  241:istore          5
						k2 = k;
	//  130  243:iload_2         
	//  131  244:istore          8
						j2 = l2;
	//  132  246:iload           9
	//  133  248:istore          7
						i2 = i3;
	//  134  250:iload           10
	//  135  252:istore          6
						if(er.isRunning())
	//* 136  254:aload           14
	//* 137  256:invokevirtual   #177 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 138  259:ifeq            399
						{
							l1 = mState.getItemCount();
	//  139  262:aload_0         
	//  140  263:getfield        #25  <Field RecyclerView this$0>
	//  141  266:getfield        #181 <Field RecyclerView$State RecyclerView.mState>
	//  142  269:invokevirtual   #186 <Method int RecyclerView$State.getItemCount()>
	//  143  272:istore          5
							if(l1 == 0)
	//* 144  274:iload           5
	//* 145  276:ifne            301
							{
								er.stop();
	//  146  279:aload           14
	//  147  281:invokevirtual   #187 <Method void RecyclerView$SmoothScroller.stop()>
								l1 = i;
	//  148  284:iload_1         
	//  149  285:istore          5
								k2 = k;
	//  150  287:iload_2         
	//  151  288:istore          8
								j2 = l2;
	//  152  290:iload           9
	//  153  292:istore          7
								i2 = i3;
	//  154  294:iload           10
	//  155  296:istore          6
							} else
	//* 156  298:goto            399
							if(er.getTargetPosition() >= l1)
	//* 157  301:aload           14
	//* 158  303:invokevirtual   #190 <Method int RecyclerView$SmoothScroller.getTargetPosition()>
	//* 159  306:iload           5
	//* 160  308:icmplt          351
							{
								er.setTargetPosition(l1 - 1);
	//  161  311:aload           14
	//  162  313:iload           5
	//  163  315:iconst_1        
	//  164  316:isub            
	//  165  317:invokevirtual   #193 <Method void RecyclerView$SmoothScroller.setTargetPosition(int)>
								er.onAnimation(k1 - l2, j1 - i3);
	//  166  320:aload           14
	//  167  322:iload           4
	//  168  324:iload           9
	//  169  326:isub            
	//  170  327:iload_3         
	//  171  328:iload           10
	//  172  330:isub            
	//  173  331:invokevirtual   #196 <Method void RecyclerView$SmoothScroller.onAnimation(int, int)>
								l1 = i;
	//  174  334:iload_1         
	//  175  335:istore          5
								k2 = k;
	//  176  337:iload_2         
	//  177  338:istore          8
								j2 = l2;
	//  178  340:iload           9
	//  179  342:istore          7
								i2 = i3;
	//  180  344:iload           10
	//  181  346:istore          6
							} else
	//* 182  348:goto            399
							{
								er.onAnimation(k1 - l2, j1 - i3);
	//  183  351:aload           14
	//  184  353:iload           4
	//  185  355:iload           9
	//  186  357:isub            
	//  187  358:iload_3         
	//  188  359:iload           10
	//  189  361:isub            
	//  190  362:invokevirtual   #196 <Method void RecyclerView$SmoothScroller.onAnimation(int, int)>
								l1 = i;
	//  191  365:iload_1         
	//  192  366:istore          5
								k2 = k;
	//  193  368:iload_2         
	//  194  369:istore          8
								j2 = l2;
	//  195  371:iload           9
	//  196  373:istore          7
								i2 = i3;
	//  197  375:iload           10
	//  198  377:istore          6
							}
						}
					}
				}
			} else
	//* 199  379:goto            399
			{
				l1 = 0;
	//  200  382:iconst_0        
	//  201  383:istore          5
				i = l1;
	//  202  385:iload           5
	//  203  387:istore_1        
				int l = i;
	//  204  388:iload_1         
	//  205  389:istore_2        
				i2 = l;
	//  206  390:iload_2         
	//  207  391:istore          6
				j2 = l;
	//  208  393:iload_2         
	//  209  394:istore          7
				k2 = i;
	//  210  396:iload_1         
	//  211  397:istore          8
			}
			if(!mItemDecorations.isEmpty())
	//* 212  399:aload_0         
	//* 213  400:getfield        #25  <Field RecyclerView this$0>
	//* 214  403:getfield        #200 <Field ArrayList RecyclerView.mItemDecorations>
	//* 215  406:invokevirtual   #205 <Method boolean ArrayList.isEmpty()>
	//* 216  409:ifne            419
				invalidate();
	//  217  412:aload_0         
	//  218  413:getfield        #25  <Field RecyclerView this$0>
	//  219  416:invokevirtual   #208 <Method void RecyclerView.invalidate()>
			if(getOverScrollMode() != 2)
	//* 220  419:aload_0         
	//* 221  420:getfield        #25  <Field RecyclerView this$0>
	//* 222  423:invokevirtual   #211 <Method int RecyclerView.getOverScrollMode()>
	//* 223  426:iconst_2        
	//* 224  427:icmpeq          440
				considerReleasingGlowsOnScroll(k1, j1);
	//  225  430:aload_0         
	//  226  431:getfield        #25  <Field RecyclerView this$0>
	//  227  434:iload           4
	//  228  436:iload_3         
	//  229  437:invokevirtual   #214 <Method void RecyclerView.considerReleasingGlowsOnScroll(int, int)>
			if(!dispatchNestedScroll(l1, k2, j2, i2, ((int []) (null)), 1) && (j2 != 0 || i2 != 0))
	//* 230  440:aload_0         
	//* 231  441:getfield        #25  <Field RecyclerView this$0>
	//* 232  444:iload           5
	//* 233  446:iload           8
	//* 234  448:iload           7
	//* 235  450:iload           6
	//* 236  452:aconst_null     
	//* 237  453:iconst_1        
	//* 238  454:invokevirtual   #218 <Method boolean RecyclerView.dispatchNestedScroll(int, int, int, int, int[], int)>
	//* 239  457:ifne            608
	//* 240  460:iload           7
	//* 241  462:ifne            470
	//* 242  465:iload           6
	//* 243  467:ifeq            608
			{
				int i1 = (int)overscroller.getCurrVelocity();
	//  244  470:aload           13
	//  245  472:invokevirtual   #222 <Method float OverScroller.getCurrVelocity()>
	//  246  475:f2i             
	//  247  476:istore_2        
				if(j2 != j3)
	//* 248  477:iload           7
	//* 249  479:iload           11
	//* 250  481:icmpeq          510
				{
					if(j2 < 0)
	//* 251  484:iload           7
	//* 252  486:ifge            495
						i = -i1;
	//  253  489:iload_2         
	//  254  490:ineg            
	//  255  491:istore_1        
					else
	//* 256  492:goto            512
					if(j2 > 0)
	//* 257  495:iload           7
	//* 258  497:ifle            505
						i = i1;
	//  259  500:iload_2         
	//  260  501:istore_1        
					else
	//* 261  502:goto            512
						i = 0;
	//  262  505:iconst_0        
	//  263  506:istore_1        
				} else
	//* 264  507:goto            512
				{
					i = 0;
	//  265  510:iconst_0        
	//  266  511:istore_1        
				}
				if(i2 != k3)
	//* 267  512:iload           6
	//* 268  514:iload           12
	//* 269  516:icmpeq          543
				{
					if(i2 < 0)
	//* 270  519:iload           6
	//* 271  521:ifge            530
						i1 = -i1;
	//  272  524:iload_2         
	//  273  525:ineg            
	//  274  526:istore_2        
					else
	//* 275  527:goto            545
					if(i2 <= 0)
	//* 276  530:iload           6
	//* 277  532:ifle            538
	//* 278  535:goto            545
						i1 = 0;
	//  279  538:iconst_0        
	//  280  539:istore_2        
				} else
	//* 281  540:goto            545
				{
					i1 = 0;
	//  282  543:iconst_0        
	//  283  544:istore_2        
				}
				if(getOverScrollMode() != 2)
	//* 284  545:aload_0         
	//* 285  546:getfield        #25  <Field RecyclerView this$0>
	//* 286  549:invokevirtual   #211 <Method int RecyclerView.getOverScrollMode()>
	//* 287  552:iconst_2        
	//* 288  553:icmpeq          565
					absorbGlows(i, i1);
	//  289  556:aload_0         
	//  290  557:getfield        #25  <Field RecyclerView this$0>
	//  291  560:iload_1         
	//  292  561:iload_2         
	//  293  562:invokevirtual   #225 <Method void RecyclerView.absorbGlows(int, int)>
				if((i != 0 || j2 == j3 || overscroller.getFinalX() == 0) && (i1 != 0 || i2 == k3 || overscroller.getFinalY() == 0))
	//* 294  565:iload_1         
	//* 295  566:ifne            584
	//* 296  569:iload           7
	//* 297  571:iload           11
	//* 298  573:icmpeq          584
	//* 299  576:aload           13
	//* 300  578:invokevirtual   #228 <Method int OverScroller.getFinalX()>
	//* 301  581:ifne            608
	//* 302  584:iload_2         
	//* 303  585:ifne            603
	//* 304  588:iload           6
	//* 305  590:iload           12
	//* 306  592:icmpeq          603
	//* 307  595:aload           13
	//* 308  597:invokevirtual   #231 <Method int OverScroller.getFinalY()>
	//* 309  600:ifne            608
					overscroller.abortAnimation();
	//  310  603:aload           13
	//  311  605:invokevirtual   #234 <Method void OverScroller.abortAnimation()>
			}
			if(l1 != 0 || k2 != 0)
	//* 312  608:iload           5
	//* 313  610:ifne            618
	//* 314  613:iload           8
	//* 315  615:ifeq            629
				dispatchOnScrolled(l1, k2);
	//  316  618:aload_0         
	//  317  619:getfield        #25  <Field RecyclerView this$0>
	//  318  622:iload           5
	//  319  624:iload           8
	//  320  626:invokevirtual   #237 <Method void RecyclerView.dispatchOnScrolled(int, int)>
			if(!RecyclerView.access$200(RecyclerView.this))
	//* 321  629:aload_0         
	//* 322  630:getfield        #25  <Field RecyclerView this$0>
	//* 323  633:invokestatic    #241 <Method boolean RecyclerView.access$200(RecyclerView)>
	//* 324  636:ifne            646
				invalidate();
	//  325  639:aload_0         
	//  326  640:getfield        #25  <Field RecyclerView this$0>
	//  327  643:invokevirtual   #208 <Method void RecyclerView.invalidate()>
			if(j1 != 0 && mLayout.canScrollVertically() && k2 == j1)
	//* 328  646:iload_3         
	//* 329  647:ifeq            674
	//* 330  650:aload_0         
	//* 331  651:getfield        #25  <Field RecyclerView this$0>
	//* 332  654:getfield        #126 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 333  657:invokevirtual   #244 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//* 334  660:ifeq            674
	//* 335  663:iload           8
	//* 336  665:iload_3         
	//* 337  666:icmpne          674
				i = 1;
	//  338  669:iconst_1        
	//  339  670:istore_1        
			else
	//* 340  671:goto            676
				i = 0;
	//  341  674:iconst_0        
	//  342  675:istore_1        
			boolean flag1;
			if(k1 != 0 && mLayout.canScrollHorizontally() && l1 == k1)
	//* 343  676:iload           4
	//* 344  678:ifeq            706
	//* 345  681:aload_0         
	//* 346  682:getfield        #25  <Field RecyclerView this$0>
	//* 347  685:getfield        #126 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 348  688:invokevirtual   #247 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//* 349  691:ifeq            706
	//* 350  694:iload           5
	//* 351  696:iload           4
	//* 352  698:icmpne          706
				flag1 = true;
	//  353  701:iconst_1        
	//  354  702:istore_2        
			else
	//* 355  703:goto            708
				flag1 = false;
	//  356  706:iconst_0        
	//  357  707:istore_2        
			boolean flag;
			if((k1 != 0 || j1 != 0) && !flag1 && !i)
	//* 358  708:iload           4
	//* 359  710:ifne            717
	//* 360  713:iload_3         
	//* 361  714:ifeq            733
	//* 362  717:iload_2         
	//* 363  718:ifne            733
	//* 364  721:iload_1         
	//* 365  722:ifeq            728
	//* 366  725:goto            733
				flag = false;
	//  367  728:iconst_0        
	//  368  729:istore_1        
			else
	//* 369  730:goto            735
				flag = true;
	//  370  733:iconst_1        
	//  371  734:istore_1        
			if(!overscroller.isFinished() && (flag || hasNestedScrollingParent(1)))
	//* 372  735:aload           13
	//* 373  737:invokevirtual   #250 <Method boolean OverScroller.isFinished()>
	//* 374  740:ifne            795
	//* 375  743:iload_1         
	//* 376  744:ifne            761
	//* 377  747:aload_0         
	//* 378  748:getfield        #25  <Field RecyclerView this$0>
	//* 379  751:iconst_1        
	//* 380  752:invokevirtual   #254 <Method boolean RecyclerView.hasNestedScrollingParent(int)>
	//* 381  755:ifne            761
	//* 382  758:goto            795
			{
				postOnAnimation();
	//  383  761:aload_0         
	//  384  762:invokevirtual   #97  <Method void postOnAnimation()>
				if(mGapWorker != null)
	//* 385  765:aload_0         
	//* 386  766:getfield        #25  <Field RecyclerView this$0>
	//* 387  769:getfield        #258 <Field GapWorker RecyclerView.mGapWorker>
	//* 388  772:ifnull          827
					mGapWorker.postFromTraversal(RecyclerView.this, k1, j1);
	//  389  775:aload_0         
	//  390  776:getfield        #25  <Field RecyclerView this$0>
	//  391  779:getfield        #258 <Field GapWorker RecyclerView.mGapWorker>
	//  392  782:aload_0         
	//  393  783:getfield        #25  <Field RecyclerView this$0>
	//  394  786:iload           4
	//  395  788:iload_3         
	//  396  789:invokevirtual   #264 <Method void GapWorker.postFromTraversal(RecyclerView, int, int)>
			} else
	//* 397  792:goto            827
			{
				setScrollState(0);
	//  398  795:aload_0         
	//  399  796:getfield        #25  <Field RecyclerView this$0>
	//  400  799:iconst_0        
	//  401  800:invokevirtual   #103 <Method void RecyclerView.setScrollState(int)>
				if(RecyclerView.ALLOW_THREAD_GAP_WORK)
	//* 402  803:getstatic       #267 <Field boolean RecyclerView.ALLOW_THREAD_GAP_WORK>
	//* 403  806:ifeq            819
					mPrefetchRegistry.clearPrefetchPositions();
	//  404  809:aload_0         
	//  405  810:getfield        #25  <Field RecyclerView this$0>
	//  406  813:getfield        #271 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//  407  816:invokevirtual   #276 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
				stopNestedScroll(1);
	//  408  819:aload_0         
	//  409  820:getfield        #25  <Field RecyclerView this$0>
	//  410  823:iconst_1        
	//  411  824:invokevirtual   #279 <Method void RecyclerView.stopNestedScroll(int)>
			}
		}
		if(er != null)
	//* 412  827:aload           14
	//* 413  829:ifnull          859
		{
			if(er.isPendingInitialRun())
	//* 414  832:aload           14
	//* 415  834:invokevirtual   #174 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 416  837:ifeq            847
				er.onAnimation(0, 0);
	//  417  840:aload           14
	//  418  842:iconst_0        
	//  419  843:iconst_0        
	//  420  844:invokevirtual   #196 <Method void RecyclerView$SmoothScroller.onAnimation(int, int)>
			if(!mReSchedulePostAnimationCallback)
	//* 421  847:aload_0         
	//* 422  848:getfield        #37  <Field boolean mReSchedulePostAnimationCallback>
	//* 423  851:ifne            859
				er.stop();
	//  424  854:aload           14
	//  425  856:invokevirtual   #187 <Method void RecyclerView$SmoothScroller.stop()>
		}
		enableRunOnAnimationRequests();
	//  426  859:aload_0         
	//  427  860:invokespecial   #281 <Method void enableRunOnAnimationRequests()>
	//  428  863:return          
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
	//    4    4:getstatic       #31  <Field Interpolator RecyclerView.sQuinticInterpolator>
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
	//*   1    1:getfield        #33  <Field Interpolator mInterpolator>
	//*   2    4:aload           4
	//*   3    6:if_acmpeq       35
		{
			mInterpolator = interpolator;
	//    4    9:aload_0         
	//    5   10:aload           4
	//    6   12:putfield        #33  <Field Interpolator mInterpolator>
			mScroller = new OverScroller(getContext(), interpolator);
	//    7   15:aload_0         
	//    8   16:new             #39  <Class OverScroller>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field RecyclerView this$0>
	//   12   24:invokevirtual   #43  <Method android.content.Context RecyclerView.getContext()>
	//   13   27:aload           4
	//   14   29:invokespecial   #46  <Method void OverScroller(android.content.Context, Interpolator)>
	//   15   32:putfield        #48  <Field OverScroller mScroller>
		}
		setScrollState(2);
	//   16   35:aload_0         
	//   17   36:getfield        #25  <Field RecyclerView this$0>
	//   18   39:iconst_2        
	//   19   40:invokevirtual   #103 <Method void RecyclerView.setScrollState(int)>
		mLastFlingY = 0;
	//   20   43:aload_0         
	//   21   44:iconst_0        
	//   22   45:putfield        #105 <Field int mLastFlingY>
		mLastFlingX = 0;
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:putfield        #107 <Field int mLastFlingX>
		mScroller.startScroll(0, 0, i, j, k);
	//   26   53:aload_0         
	//   27   54:getfield        #48  <Field OverScroller mScroller>
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
	//   38   74:getfield        #48  <Field OverScroller mScroller>
	//   39   77:invokevirtual   #144 <Method boolean OverScroller.computeScrollOffset()>
	//   40   80:pop             
		postOnAnimation();
	//   41   81:aload_0         
	//   42   82:invokevirtual   #97  <Method void postOnAnimation()>
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
	//   11   17:getstatic       #31  <Field Interpolator RecyclerView.sQuinticInterpolator>
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
	//    1    1:getfield        #25  <Field RecyclerView this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #116 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    4    8:pop             
		mScroller.abortAnimation();
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field OverScroller mScroller>
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
	//    2    2:putfield        #25  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #28  <Method void Object()>
		mInterpolator = RecyclerView.sQuinticInterpolator;
	//    5    9:aload_0         
	//    6   10:getstatic       #31  <Field Interpolator RecyclerView.sQuinticInterpolator>
	//    7   13:putfield        #33  <Field Interpolator mInterpolator>
		mEatRunOnAnimationRequest = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #35  <Field boolean mEatRunOnAnimationRequest>
		mReSchedulePostAnimationCallback = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #37  <Field boolean mReSchedulePostAnimationCallback>
		mScroller = new OverScroller(getContext(), RecyclerView.sQuinticInterpolator);
	//   14   26:aload_0         
	//   15   27:new             #39  <Class OverScroller>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:invokevirtual   #43  <Method android.content.Context RecyclerView.getContext()>
	//   19   35:getstatic       #31  <Field Interpolator RecyclerView.sQuinticInterpolator>
	//   20   38:invokespecial   #46  <Method void OverScroller(android.content.Context, Interpolator)>
	//   21   41:putfield        #48  <Field OverScroller mScroller>
	//   22   44:return          
	}
}
