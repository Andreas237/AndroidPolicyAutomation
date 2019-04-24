// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;
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
	//    1    1:invokestatic    #59  <Method int Math.abs(int)>
	//    2    4:istore          9
		int j1 = Math.abs(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #59  <Method int Math.abs(int)>
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
	//   22   38:invokestatic    #63  <Method double Math.sqrt(double)>
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
	//   33   51:invokestatic    #63  <Method double Math.sqrt(double)>
	//   34   54:d2i             
	//   35   55:istore_2        
		if(flag)
	//*  36   56:iload           8
	//*  37   58:ifeq            72
			i = getWidth();
	//   38   61:aload_0         
	//   39   62:getfield        #25  <Field RecyclerView this$0>
	//   40   65:invokevirtual   #67  <Method int RecyclerView.getWidth()>
	//   41   68:istore_1        
		else
	//*  42   69:goto            80
			i = getHeight();
	//   43   72:aload_0         
	//   44   73:getfield        #25  <Field RecyclerView this$0>
	//   45   76:invokevirtual   #70  <Method int RecyclerView.getHeight()>
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
	//   63  101:invokestatic    #74  <Method float Math.min(float, float)>
	//   64  104:fstore          7
		f1 = l;
	//   65  106:iload           4
	//   66  108:i2f             
	//   67  109:fstore          6
		f2 = distanceInfluenceForSnapDuration(f2);
	//   68  111:aload_0         
	//   69  112:fload           7
	//   70  114:invokespecial   #78  <Method float distanceInfluenceForSnapDuration(float)>
	//   71  117:fstore          7
		if(k > 0)
	//*  72  119:iload_3         
	//*  73  120:ifle            149
		{
			i = 4 * Math.round(1000F * Math.abs((f1 + f2 * f1) / (float)k));
	//   74  123:iconst_4        
	//   75  124:ldc1            #79  <Float 1000F>
	//   76  126:fload           6
	//   77  128:fload           7
	//   78  130:fload           6
	//   79  132:fmul            
	//   80  133:fadd            
	//   81  134:iload_3         
	//   82  135:i2f             
	//   83  136:fdiv            
	//   84  137:invokestatic    #81  <Method float Math.abs(float)>
	//   85  140:fmul            
	//   86  141:invokestatic    #85  <Method int Math.round(float)>
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
	//  103  170:ldc1            #86  <Float 300F>
	//  104  172:fmul            
	//  105  173:f2i             
	//  106  174:istore_1        
		}
		return Math.min(i, 2000);
	//  107  175:iload_1         
	//  108  176:sipush          2000
	//  109  179:invokestatic    #89  <Method int Math.min(int, int)>
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
	//    1    1:ldc1            #91  <Float 0.5F>
	//    2    3:fsub            
	//    3    4:ldc1            #92  <Float 0.4712389F>
	//    4    6:fmul            
	//    5    7:f2d             
	//    6    8:invokestatic    #95  <Method double Math.sin(double)>
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
	//    7   13:invokevirtual   #99  <Method void postOnAnimation()>
	//    8   16:return          
	}

	public void fling(int i, int j)
	{
		setScrollState(2);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView this$0>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #105 <Method void RecyclerView.setScrollState(int)>
		mLastFlingY = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #107 <Field int mLastFlingY>
		mLastFlingX = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #109 <Field int mLastFlingX>
		mScroller.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field OverScroller mScroller>
	//   12   22:iconst_0        
	//   13   23:iconst_0        
	//   14   24:iload_1         
	//   15   25:iload_2         
	//   16   26:ldc1            #110 <Int 0x80000000>
	//   17   28:ldc1            #111 <Int 0x7fffffff>
	//   18   30:ldc1            #110 <Int 0x80000000>
	//   19   32:ldc1            #111 <Int 0x7fffffff>
	//   20   34:invokevirtual   #114 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		postOnAnimation();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #99  <Method void postOnAnimation()>
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
	//   10   18:invokevirtual   #118 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   11   21:pop             
			ViewCompat.postOnAnimation(((android.view.View) (RecyclerView.this)), ((Runnable) (this)));
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field RecyclerView this$0>
	//   14   26:aload_0         
	//   15   27:invokestatic    #123 <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
			return;
	//   16   30:return          
		}
	}

	public void run()
	{
		er er;
label0:
		{
			int i1;
			int j1;
			int k1;
			int i2;
			OverScroller overscroller;
label1:
			{
				int i;
				int j;
				int l1;
				int j2;
				int k2;
				int l2;
label2:
				{
					if(mLayout == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field RecyclerView this$0>
	//*   2    4:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//*   3    7:ifnonnull       15
					{
						stop();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #131 <Method void stop()>
						return;
	//    6   14:return          
					}
					disableRunOnAnimationRequests();
	//    7   15:aload_0         
	//    8   16:invokespecial   #133 <Method void disableRunOnAnimationRequests()>
					consumePendingUpdateOperations();
	//    9   19:aload_0         
	//   10   20:getfield        #25  <Field RecyclerView this$0>
	//   11   23:invokevirtual   #136 <Method void RecyclerView.consumePendingUpdateOperations()>
					overscroller = mScroller;
	//   12   26:aload_0         
	//   13   27:getfield        #48  <Field OverScroller mScroller>
	//   14   30:astore          13
					er = mLayout.mSmoothScroller;
	//   15   32:aload_0         
	//   16   33:getfield        #25  <Field RecyclerView this$0>
	//   17   36:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   18   39:getfield        #142 <Field RecyclerView$SmoothScroller RecyclerView$LayoutManager.mSmoothScroller>
	//   19   42:astore          14
					if(!overscroller.computeScrollOffset())
						break label0;
	//   20   44:aload           13
	//   21   46:invokevirtual   #146 <Method boolean OverScroller.computeScrollOffset()>
	//   22   49:ifeq            916
					int ai[] = RecyclerView.access$500(RecyclerView.this);
	//   23   52:aload_0         
	//   24   53:getfield        #25  <Field RecyclerView this$0>
	//   25   56:invokestatic    #150 <Method int[] RecyclerView.access$500(RecyclerView)>
	//   26   59:astore          15
					k2 = overscroller.getCurrX();
	//   27   61:aload           13
	//   28   63:invokevirtual   #153 <Method int OverScroller.getCurrX()>
	//   29   66:istore          11
					l2 = overscroller.getCurrY();
	//   30   68:aload           13
	//   31   70:invokevirtual   #156 <Method int OverScroller.getCurrY()>
	//   32   73:istore          12
					j = k2 - mLastFlingX;
	//   33   75:iload           11
	//   34   77:aload_0         
	//   35   78:getfield        #109 <Field int mLastFlingX>
	//   36   81:isub            
	//   37   82:istore_2        
					i = l2 - mLastFlingY;
	//   38   83:iload           12
	//   39   85:aload_0         
	//   40   86:getfield        #107 <Field int mLastFlingY>
	//   41   89:isub            
	//   42   90:istore_1        
					mLastFlingX = k2;
	//   43   91:aload_0         
	//   44   92:iload           11
	//   45   94:putfield        #109 <Field int mLastFlingX>
					mLastFlingY = l2;
	//   46   97:aload_0         
	//   47   98:iload           12
	//   48  100:putfield        #107 <Field int mLastFlingY>
					j1 = j;
	//   49  103:iload_2         
	//   50  104:istore          6
					i1 = i;
	//   51  106:iload_1         
	//   52  107:istore          5
					if(dispatchNestedPreScroll(j, i, ai, ((int []) (null)), 1))
	//*  53  109:aload_0         
	//*  54  110:getfield        #25  <Field RecyclerView this$0>
	//*  55  113:iload_2         
	//*  56  114:iload_1         
	//*  57  115:aload           15
	//*  58  117:aconst_null     
	//*  59  118:iconst_1        
	//*  60  119:invokevirtual   #160 <Method boolean RecyclerView.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//*  61  122:ifeq            141
					{
						j1 = j - ai[0];
	//   62  125:iload_2         
	//   63  126:aload           15
	//   64  128:iconst_0        
	//   65  129:iaload          
	//   66  130:isub            
	//   67  131:istore          6
						i1 = i - ai[1];
	//   68  133:iload_1         
	//   69  134:aload           15
	//   70  136:iconst_1        
	//   71  137:iaload          
	//   72  138:isub            
	//   73  139:istore          5
					}
					if(mAdapter != null)
	//*  74  141:aload_0         
	//*  75  142:getfield        #25  <Field RecyclerView this$0>
	//*  76  145:getfield        #164 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  77  148:ifnull          476
					{
						startInterceptRequestLayout();
	//   78  151:aload_0         
	//   79  152:getfield        #25  <Field RecyclerView this$0>
	//   80  155:invokevirtual   #167 <Method void RecyclerView.startInterceptRequestLayout()>
						onEnterLayoutOrScroll();
	//   81  158:aload_0         
	//   82  159:getfield        #25  <Field RecyclerView this$0>
	//   83  162:invokevirtual   #170 <Method void RecyclerView.onEnterLayoutOrScroll()>
						TraceCompat.beginSection("RV Scroll");
	//   84  165:ldc1            #172 <String "RV Scroll">
	//   85  167:invokestatic    #178 <Method void TraceCompat.beginSection(String)>
						fillRemainingScrollValues(mState);
	//   86  170:aload_0         
	//   87  171:getfield        #25  <Field RecyclerView this$0>
	//   88  174:aload_0         
	//   89  175:getfield        #25  <Field RecyclerView this$0>
	//   90  178:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//   91  181:invokevirtual   #186 <Method void RecyclerView.fillRemainingScrollValues(RecyclerView$State)>
						if(j1 != 0)
	//*  92  184:iload           6
	//*  93  186:ifeq            224
						{
							i = mLayout.scrollHorizontallyBy(j1, mRecycler, mState);
	//   94  189:aload_0         
	//   95  190:getfield        #25  <Field RecyclerView this$0>
	//   96  193:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   97  196:iload           6
	//   98  198:aload_0         
	//   99  199:getfield        #25  <Field RecyclerView this$0>
	//  100  202:getfield        #190 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//  101  205:aload_0         
	//  102  206:getfield        #25  <Field RecyclerView this$0>
	//  103  209:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//  104  212:invokevirtual   #194 <Method int RecyclerView$LayoutManager.scrollHorizontallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//  105  215:istore_1        
							j = j1 - i;
	//  106  216:iload           6
	//  107  218:iload_1         
	//  108  219:isub            
	//  109  220:istore_2        
						} else
	//* 110  221:goto            228
						{
							i = 0;
	//  111  224:iconst_0        
	//  112  225:istore_1        
							j = i;
	//  113  226:iload_1         
	//  114  227:istore_2        
						}
						int k;
						int l;
						if(i1 != 0)
	//* 115  228:iload           5
	//* 116  230:ifeq            269
						{
							k = mLayout.scrollVerticallyBy(i1, mRecycler, mState);
	//  117  233:aload_0         
	//  118  234:getfield        #25  <Field RecyclerView this$0>
	//  119  237:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//  120  240:iload           5
	//  121  242:aload_0         
	//  122  243:getfield        #25  <Field RecyclerView this$0>
	//  123  246:getfield        #190 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//  124  249:aload_0         
	//  125  250:getfield        #25  <Field RecyclerView this$0>
	//  126  253:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//  127  256:invokevirtual   #197 <Method int RecyclerView$LayoutManager.scrollVerticallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//  128  259:istore_3        
							l = i1 - k;
	//  129  260:iload           5
	//  130  262:iload_3         
	//  131  263:isub            
	//  132  264:istore          4
						} else
	//* 133  266:goto            274
						{
							k = 0;
	//  134  269:iconst_0        
	//  135  270:istore_3        
							l = k;
	//  136  271:iload_3         
	//  137  272:istore          4
						}
						TraceCompat.endSection();
	//  138  274:invokestatic    #200 <Method void TraceCompat.endSection()>
						repositionShadowingViews();
	//  139  277:aload_0         
	//  140  278:getfield        #25  <Field RecyclerView this$0>
	//  141  281:invokevirtual   #203 <Method void RecyclerView.repositionShadowingViews()>
						onExitLayoutOrScroll();
	//  142  284:aload_0         
	//  143  285:getfield        #25  <Field RecyclerView this$0>
	//  144  288:invokevirtual   #206 <Method void RecyclerView.onExitLayoutOrScroll()>
						stopInterceptRequestLayout(false);
	//  145  291:aload_0         
	//  146  292:getfield        #25  <Field RecyclerView this$0>
	//  147  295:iconst_0        
	//  148  296:invokevirtual   #210 <Method void RecyclerView.stopInterceptRequestLayout(boolean)>
						k1 = i;
	//  149  299:iload_1         
	//  150  300:istore          7
						j2 = j;
	//  151  302:iload_2         
	//  152  303:istore          10
						i2 = k;
	//  153  305:iload_3         
	//  154  306:istore          9
						l1 = l;
	//  155  308:iload           4
	//  156  310:istore          8
						if(er != null)
	//* 157  312:aload           14
	//* 158  314:ifnull          493
						{
							k1 = i;
	//  159  317:iload_1         
	//  160  318:istore          7
							j2 = j;
	//  161  320:iload_2         
	//  162  321:istore          10
							i2 = k;
	//  163  323:iload_3         
	//  164  324:istore          9
							l1 = l;
	//  165  326:iload           4
	//  166  328:istore          8
							if(!er.isPendingInitialRun())
	//* 167  330:aload           14
	//* 168  332:invokevirtual   #215 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 169  335:ifne            493
							{
								k1 = i;
	//  170  338:iload_1         
	//  171  339:istore          7
								j2 = j;
	//  172  341:iload_2         
	//  173  342:istore          10
								i2 = k;
	//  174  344:iload_3         
	//  175  345:istore          9
								l1 = l;
	//  176  347:iload           4
	//  177  349:istore          8
								if(er.isRunning())
	//* 178  351:aload           14
	//* 179  353:invokevirtual   #218 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 180  356:ifeq            493
								{
									k1 = mState.getItemCount();
	//  181  359:aload_0         
	//  182  360:getfield        #25  <Field RecyclerView this$0>
	//  183  363:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//  184  366:invokevirtual   #223 <Method int RecyclerView$State.getItemCount()>
	//  185  369:istore          7
									if(k1 == 0)
	//* 186  371:iload           7
	//* 187  373:ifne            397
									{
										er.stop();
	//  188  376:aload           14
	//  189  378:invokevirtual   #224 <Method void RecyclerView$SmoothScroller.stop()>
										k1 = i;
	//  190  381:iload_1         
	//  191  382:istore          7
										j2 = j;
	//  192  384:iload_2         
	//  193  385:istore          10
										i2 = k;
	//  194  387:iload_3         
	//  195  388:istore          9
										l1 = l;
	//  196  390:iload           4
	//  197  392:istore          8
									} else
	//* 198  394:goto            493
									if(er.getTargetPosition() >= k1)
	//* 199  397:aload           14
	//* 200  399:invokevirtual   #227 <Method int RecyclerView$SmoothScroller.getTargetPosition()>
	//* 201  402:iload           7
	//* 202  404:icmplt          446
									{
										er.setTargetPosition(k1 - 1);
	//  203  407:aload           14
	//  204  409:iload           7
	//  205  411:iconst_1        
	//  206  412:isub            
	//  207  413:invokevirtual   #230 <Method void RecyclerView$SmoothScroller.setTargetPosition(int)>
										er.access._mth600(er, j1 - j, i1 - l);
	//  208  416:aload           14
	//  209  418:iload           6
	//  210  420:iload_2         
	//  211  421:isub            
	//  212  422:iload           5
	//  213  424:iload           4
	//  214  426:isub            
	//  215  427:invokestatic    #234 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
										k1 = i;
	//  216  430:iload_1         
	//  217  431:istore          7
										j2 = j;
	//  218  433:iload_2         
	//  219  434:istore          10
										i2 = k;
	//  220  436:iload_3         
	//  221  437:istore          9
										l1 = l;
	//  222  439:iload           4
	//  223  441:istore          8
									} else
	//* 224  443:goto            493
									{
										er.access._mth600(er, j1 - j, i1 - l);
	//  225  446:aload           14
	//  226  448:iload           6
	//  227  450:iload_2         
	//  228  451:isub            
	//  229  452:iload           5
	//  230  454:iload           4
	//  231  456:isub            
	//  232  457:invokestatic    #234 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
										k1 = i;
	//  233  460:iload_1         
	//  234  461:istore          7
										j2 = j;
	//  235  463:iload_2         
	//  236  464:istore          10
										i2 = k;
	//  237  466:iload_3         
	//  238  467:istore          9
										l1 = l;
	//  239  469:iload           4
	//  240  471:istore          8
									}
								}
							}
						}
					} else
	//* 241  473:goto            493
					{
						k1 = 0;
	//  242  476:iconst_0        
	//  243  477:istore          7
						i = k1;
	//  244  479:iload           7
	//  245  481:istore_1        
						j = i;
	//  246  482:iload_1         
	//  247  483:istore_2        
						l1 = j;
	//  248  484:iload_2         
	//  249  485:istore          8
						i2 = j;
	//  250  487:iload_2         
	//  251  488:istore          9
						j2 = i;
	//  252  490:iload_1         
	//  253  491:istore          10
					}
					if(!mItemDecorations.isEmpty())
	//* 254  493:aload_0         
	//* 255  494:getfield        #25  <Field RecyclerView this$0>
	//* 256  497:getfield        #238 <Field ArrayList RecyclerView.mItemDecorations>
	//* 257  500:invokevirtual   #243 <Method boolean ArrayList.isEmpty()>
	//* 258  503:ifne            513
						invalidate();
	//  259  506:aload_0         
	//  260  507:getfield        #25  <Field RecyclerView this$0>
	//  261  510:invokevirtual   #246 <Method void RecyclerView.invalidate()>
					if(getOverScrollMode() != 2)
	//* 262  513:aload_0         
	//* 263  514:getfield        #25  <Field RecyclerView this$0>
	//* 264  517:invokevirtual   #249 <Method int RecyclerView.getOverScrollMode()>
	//* 265  520:iconst_2        
	//* 266  521:icmpeq          535
						considerReleasingGlowsOnScroll(j1, i1);
	//  267  524:aload_0         
	//  268  525:getfield        #25  <Field RecyclerView this$0>
	//  269  528:iload           6
	//  270  530:iload           5
	//  271  532:invokevirtual   #252 <Method void RecyclerView.considerReleasingGlowsOnScroll(int, int)>
					if(dispatchNestedScroll(k1, i2, j2, l1, ((int []) (null)), 1) || j2 == 0 && l1 == 0)
						break label1;
	//  272  535:aload_0         
	//  273  536:getfield        #25  <Field RecyclerView this$0>
	//  274  539:iload           7
	//  275  541:iload           9
	//  276  543:iload           10
	//  277  545:iload           8
	//  278  547:aconst_null     
	//  279  548:iconst_1        
	//  280  549:invokevirtual   #256 <Method boolean RecyclerView.dispatchNestedScroll(int, int, int, int, int[], int)>
	//  281  552:ifne            693
	//  282  555:iload           10
	//  283  557:ifne            565
	//  284  560:iload           8
	//  285  562:ifeq            693
					j = (int)overscroller.getCurrVelocity();
	//  286  565:aload           13
	//  287  567:invokevirtual   #260 <Method float OverScroller.getCurrVelocity()>
	//  288  570:f2i             
	//  289  571:istore_2        
					if(j2 != k2)
	//* 290  572:iload           10
	//* 291  574:iload           11
	//* 292  576:icmpeq          600
					{
						if(j2 < 0)
	//* 293  579:iload           10
	//* 294  581:ifge            590
						{
							i = -j;
	//  295  584:iload_2         
	//  296  585:ineg            
	//  297  586:istore_1        
							break label2;
	//  298  587:goto            602
						}
						if(j2 > 0)
	//* 299  590:iload           10
	//* 300  592:ifle            600
						{
							i = j;
	//  301  595:iload_2         
	//  302  596:istore_1        
							break label2;
	//  303  597:goto            602
						}
					}
					i = 0;
	//  304  600:iconst_0        
	//  305  601:istore_1        
				}
label3:
				{
					if(l1 != l2)
	//* 306  602:iload           8
	//* 307  604:iload           12
	//* 308  606:icmpeq          628
					{
						if(l1 < 0)
	//* 309  609:iload           8
	//* 310  611:ifge            620
						{
							j = -j;
	//  311  614:iload_2         
	//  312  615:ineg            
	//  313  616:istore_2        
							break label3;
	//  314  617:goto            630
						}
						if(l1 > 0)
	//* 315  620:iload           8
	//* 316  622:ifle            628
							break label3;
	//  317  625:goto            630
					}
					j = 0;
	//  318  628:iconst_0        
	//  319  629:istore_2        
				}
				if(getOverScrollMode() != 2)
	//* 320  630:aload_0         
	//* 321  631:getfield        #25  <Field RecyclerView this$0>
	//* 322  634:invokevirtual   #249 <Method int RecyclerView.getOverScrollMode()>
	//* 323  637:iconst_2        
	//* 324  638:icmpeq          650
					absorbGlows(i, j);
	//  325  641:aload_0         
	//  326  642:getfield        #25  <Field RecyclerView this$0>
	//  327  645:iload_1         
	//  328  646:iload_2         
	//  329  647:invokevirtual   #263 <Method void RecyclerView.absorbGlows(int, int)>
				if((i != 0 || j2 == k2 || overscroller.getFinalX() == 0) && (j != 0 || l1 == l2 || overscroller.getFinalY() == 0))
	//* 330  650:iload_1         
	//* 331  651:ifne            669
	//* 332  654:iload           10
	//* 333  656:iload           11
	//* 334  658:icmpeq          669
	//* 335  661:aload           13
	//* 336  663:invokevirtual   #266 <Method int OverScroller.getFinalX()>
	//* 337  666:ifne            693
	//* 338  669:iload_2         
	//* 339  670:ifne            688
	//* 340  673:iload           8
	//* 341  675:iload           12
	//* 342  677:icmpeq          688
	//* 343  680:aload           13
	//* 344  682:invokevirtual   #269 <Method int OverScroller.getFinalY()>
	//* 345  685:ifne            693
					overscroller.abortAnimation();
	//  346  688:aload           13
	//  347  690:invokevirtual   #272 <Method void OverScroller.abortAnimation()>
			}
			if(k1 != 0 || i2 != 0)
	//* 348  693:iload           7
	//* 349  695:ifne            703
	//* 350  698:iload           9
	//* 351  700:ifeq            714
				dispatchOnScrolled(k1, i2);
	//  352  703:aload_0         
	//  353  704:getfield        #25  <Field RecyclerView this$0>
	//  354  707:iload           7
	//  355  709:iload           9
	//  356  711:invokevirtual   #275 <Method void RecyclerView.dispatchOnScrolled(int, int)>
			if(!RecyclerView.access$700(RecyclerView.this))
	//* 357  714:aload_0         
	//* 358  715:getfield        #25  <Field RecyclerView this$0>
	//* 359  718:invokestatic    #279 <Method boolean RecyclerView.access$700(RecyclerView)>
	//* 360  721:ifne            731
				invalidate();
	//  361  724:aload_0         
	//  362  725:getfield        #25  <Field RecyclerView this$0>
	//  363  728:invokevirtual   #246 <Method void RecyclerView.invalidate()>
			boolean flag;
			if(i1 != 0 && mLayout.canScrollVertically() && i2 == i1)
	//* 364  731:iload           5
	//* 365  733:ifeq            761
	//* 366  736:aload_0         
	//* 367  737:getfield        #25  <Field RecyclerView this$0>
	//* 368  740:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 369  743:invokevirtual   #282 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//* 370  746:ifeq            761
	//* 371  749:iload           9
	//* 372  751:iload           5
	//* 373  753:icmpne          761
				flag = true;
	//  374  756:iconst_1        
	//  375  757:istore_1        
			else
	//* 376  758:goto            763
				flag = false;
	//  377  761:iconst_0        
	//  378  762:istore_1        
			boolean flag1;
			if(j1 != 0 && mLayout.canScrollHorizontally() && k1 == j1)
	//* 379  763:iload           6
	//* 380  765:ifeq            793
	//* 381  768:aload_0         
	//* 382  769:getfield        #25  <Field RecyclerView this$0>
	//* 383  772:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 384  775:invokevirtual   #285 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//* 385  778:ifeq            793
	//* 386  781:iload           7
	//* 387  783:iload           6
	//* 388  785:icmpne          793
				flag1 = true;
	//  389  788:iconst_1        
	//  390  789:istore_2        
			else
	//* 391  790:goto            795
				flag1 = false;
	//  392  793:iconst_0        
	//  393  794:istore_2        
			if((j1 != 0 || i1 != 0) && !flag1 && !flag)
	//* 394  795:iload           6
	//* 395  797:ifne            805
	//* 396  800:iload           5
	//* 397  802:ifeq            821
	//* 398  805:iload_2         
	//* 399  806:ifne            821
	//* 400  809:iload_1         
	//* 401  810:ifeq            816
	//* 402  813:goto            821
				flag = false;
	//  403  816:iconst_0        
	//  404  817:istore_1        
			else
	//* 405  818:goto            823
				flag = true;
	//  406  821:iconst_1        
	//  407  822:istore_1        
			if(!overscroller.isFinished() && (flag || hasNestedScrollingParent(1)))
	//* 408  823:aload           13
	//* 409  825:invokevirtual   #288 <Method boolean OverScroller.isFinished()>
	//* 410  828:ifne            884
	//* 411  831:iload_1         
	//* 412  832:ifne            849
	//* 413  835:aload_0         
	//* 414  836:getfield        #25  <Field RecyclerView this$0>
	//* 415  839:iconst_1        
	//* 416  840:invokevirtual   #292 <Method boolean RecyclerView.hasNestedScrollingParent(int)>
	//* 417  843:ifne            849
	//* 418  846:goto            884
			{
				postOnAnimation();
	//  419  849:aload_0         
	//  420  850:invokevirtual   #99  <Method void postOnAnimation()>
				if(mGapWorker != null)
	//* 421  853:aload_0         
	//* 422  854:getfield        #25  <Field RecyclerView this$0>
	//* 423  857:getfield        #296 <Field GapWorker RecyclerView.mGapWorker>
	//* 424  860:ifnull          916
					mGapWorker.postFromTraversal(RecyclerView.this, j1, i1);
	//  425  863:aload_0         
	//  426  864:getfield        #25  <Field RecyclerView this$0>
	//  427  867:getfield        #296 <Field GapWorker RecyclerView.mGapWorker>
	//  428  870:aload_0         
	//  429  871:getfield        #25  <Field RecyclerView this$0>
	//  430  874:iload           6
	//  431  876:iload           5
	//  432  878:invokevirtual   #302 <Method void GapWorker.postFromTraversal(RecyclerView, int, int)>
			} else
	//* 433  881:goto            916
			{
				setScrollState(0);
	//  434  884:aload_0         
	//  435  885:getfield        #25  <Field RecyclerView this$0>
	//  436  888:iconst_0        
	//  437  889:invokevirtual   #105 <Method void RecyclerView.setScrollState(int)>
				if(RecyclerView.access$800())
	//* 438  892:invokestatic    #305 <Method boolean RecyclerView.access$800()>
	//* 439  895:ifeq            908
					mPrefetchRegistry.clearPrefetchPositions();
	//  440  898:aload_0         
	//  441  899:getfield        #25  <Field RecyclerView this$0>
	//  442  902:getfield        #309 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//  443  905:invokevirtual   #314 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
				stopNestedScroll(1);
	//  444  908:aload_0         
	//  445  909:getfield        #25  <Field RecyclerView this$0>
	//  446  912:iconst_1        
	//  447  913:invokevirtual   #317 <Method void RecyclerView.stopNestedScroll(int)>
			}
		}
		if(er != null)
	//* 448  916:aload           14
	//* 449  918:ifnull          948
		{
			if(er.isPendingInitialRun())
	//* 450  921:aload           14
	//* 451  923:invokevirtual   #215 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 452  926:ifeq            936
				er.access._mth600(er, 0, 0);
	//  453  929:aload           14
	//  454  931:iconst_0        
	//  455  932:iconst_0        
	//  456  933:invokestatic    #234 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
			if(!mReSchedulePostAnimationCallback)
	//* 457  936:aload_0         
	//* 458  937:getfield        #37  <Field boolean mReSchedulePostAnimationCallback>
	//* 459  940:ifne            948
				er.stop();
	//  460  943:aload           14
	//  461  945:invokevirtual   #224 <Method void RecyclerView$SmoothScroller.stop()>
		}
		enableRunOnAnimationRequests();
	//  462  948:aload_0         
	//  463  949:invokespecial   #319 <Method void enableRunOnAnimationRequests()>
	//  464  952:return          
	}

	public void smoothScrollBy(int i, int j)
	{
		smoothScrollBy(i, j, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #323 <Method void smoothScrollBy(int, int, int, int)>
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
	//    5    7:invokevirtual   #327 <Method void smoothScrollBy(int, int, int, Interpolator)>
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
	//    8    9:invokespecial   #329 <Method int computeScrollDuration(int, int, int, int)>
	//    9   12:invokevirtual   #331 <Method void smoothScrollBy(int, int, int)>
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
	//   19   40:invokevirtual   #105 <Method void RecyclerView.setScrollState(int)>
		mLastFlingY = 0;
	//   20   43:aload_0         
	//   21   44:iconst_0        
	//   22   45:putfield        #107 <Field int mLastFlingY>
		mLastFlingX = 0;
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:putfield        #109 <Field int mLastFlingX>
		mScroller.startScroll(0, 0, i, j, k);
	//   26   53:aload_0         
	//   27   54:getfield        #48  <Field OverScroller mScroller>
	//   28   57:iconst_0        
	//   29   58:iconst_0        
	//   30   59:iload_1         
	//   31   60:iload_2         
	//   32   61:iload_3         
	//   33   62:invokevirtual   #335 <Method void OverScroller.startScroll(int, int, int, int, int)>
		if(android.os.Build.VERSION.SDK_INT < 23)
	//*  34   65:getstatic       #340 <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   68:bipush          23
	//*  36   70:icmpge          81
			mScroller.computeScrollOffset();
	//   37   73:aload_0         
	//   38   74:getfield        #48  <Field OverScroller mScroller>
	//   39   77:invokevirtual   #146 <Method boolean OverScroller.computeScrollOffset()>
	//   40   80:pop             
		postOnAnimation();
	//   41   81:aload_0         
	//   42   82:invokevirtual   #99  <Method void postOnAnimation()>
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
	//    5    5:invokespecial   #329 <Method int computeScrollDuration(int, int, int, int)>
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
	//   18   29:invokevirtual   #327 <Method void smoothScrollBy(int, int, int, Interpolator)>
	//   19   32:return          
	}

	public void stop()
	{
		removeCallbacks(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #118 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    4    8:pop             
		mScroller.abortAnimation();
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field OverScroller mScroller>
	//    7   13:invokevirtual   #272 <Method void OverScroller.abortAnimation()>
	//    8   16:return          
	}

	private boolean mEatRunOnAnimationRequest;
	Interpolator mInterpolator;
	private int mLastFlingX;
	private int mLastFlingY;
	private boolean mReSchedulePostAnimationCallback;
	private OverScroller mScroller;
	final RecyclerView this$0;


/*
	static OverScroller access$400(RecyclerView$ViewFlinger recyclerview$viewflinger)
	{
		return recyclerview$viewflinger.mScroller;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field OverScroller mScroller>
	//    2    4:areturn         
	}

*/

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
