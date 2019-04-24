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
		float f;
		float f1;
		float f2;
		boolean flag;
		if(i1 > j1)
	//*   6   12:iload           9
	//*   7   14:iload           10
	//*   8   16:icmple          134
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore          8
		else
	//*  11   22:iload_3         
	//*  12   23:iload_3         
	//*  13   24:imul            
	//*  14   25:iload           4
	//*  15   27:iload           4
	//*  16   29:imul            
	//*  17   30:iadd            
	//*  18   31:i2d             
	//*  19   32:invokestatic    #63  <Method double Math.sqrt(double)>
	//*  20   35:d2i             
	//*  21   36:istore_3        
	//*  22   37:iload_1         
	//*  23   38:iload_1         
	//*  24   39:imul            
	//*  25   40:iload_2         
	//*  26   41:iload_2         
	//*  27   42:imul            
	//*  28   43:iadd            
	//*  29   44:i2d             
	//*  30   45:invokestatic    #63  <Method double Math.sqrt(double)>
	//*  31   48:d2i             
	//*  32   49:istore_2        
	//*  33   50:iload           8
	//*  34   52:ifeq            140
	//*  35   55:aload_0         
	//*  36   56:getfield        #25  <Field RecyclerView this$0>
	//*  37   59:invokevirtual   #67  <Method int RecyclerView.getWidth()>
	//*  38   62:istore_1        
	//*  39   63:iload_1         
	//*  40   64:iconst_2        
	//*  41   65:idiv            
	//*  42   66:istore          4
	//*  43   68:fconst_1        
	//*  44   69:iload_2         
	//*  45   70:i2f             
	//*  46   71:fconst_1        
	//*  47   72:fmul            
	//*  48   73:iload_1         
	//*  49   74:i2f             
	//*  50   75:fdiv            
	//*  51   76:invokestatic    #71  <Method float Math.min(float, float)>
	//*  52   79:fstore          7
	//*  53   81:iload           4
	//*  54   83:i2f             
	//*  55   84:fstore          5
	//*  56   86:iload           4
	//*  57   88:i2f             
	//*  58   89:fstore          6
	//*  59   91:aload_0         
	//*  60   92:fload           7
	//*  61   94:invokespecial   #75  <Method float distanceInfluenceForSnapDuration(float)>
	//*  62   97:fstore          7
	//*  63   99:iload_3         
	//*  64  100:ifle            151
	//*  65  103:ldc1            #76  <Float 1000F>
	//*  66  105:fload           7
	//*  67  107:fload           6
	//*  68  109:fmul            
	//*  69  110:fload           5
	//*  70  112:fadd            
	//*  71  113:iload_3         
	//*  72  114:i2f             
	//*  73  115:fdiv            
	//*  74  116:invokestatic    #78  <Method float Math.abs(float)>
	//*  75  119:fmul            
	//*  76  120:invokestatic    #82  <Method int Math.round(float)>
	//*  77  123:iconst_4        
	//*  78  124:imul            
	//*  79  125:istore_1        
	//*  80  126:iload_1         
	//*  81  127:sipush          2000
	//*  82  130:invokestatic    #85  <Method int Math.min(int, int)>
	//*  83  133:ireturn         
			flag = false;
	//   84  134:iconst_0        
	//   85  135:istore          8
		k = (int)Math.sqrt(k * k + l * l);
		j = (int)Math.sqrt(i * i + j * j);
		if(flag)
			i = getWidth();
		else
	//*  86  137:goto            22
			i = getHeight();
	//   87  140:aload_0         
	//   88  141:getfield        #25  <Field RecyclerView this$0>
	//   89  144:invokevirtual   #88  <Method int RecyclerView.getHeight()>
	//   90  147:istore_1        
		l = i / 2;
		f2 = Math.min(1.0F, ((float)j * 1.0F) / (float)i);
		f = l;
		f1 = l;
		f2 = distanceInfluenceForSnapDuration(f2);
		if(k > 0)
		{
			i = Math.round(1000F * Math.abs((f2 * f1 + f) / (float)k)) * 4;
		} else
	//*  91  148:goto            63
		{
			if(flag)
	//*  92  151:iload           8
	//*  93  153:ifeq            174
				j = i1;
	//   94  156:iload           9
	//   95  158:istore_2        
			else
	//*  96  159:iload_2         
	//*  97  160:i2f             
	//*  98  161:iload_1         
	//*  99  162:i2f             
	//* 100  163:fdiv            
	//* 101  164:fconst_1        
	//* 102  165:fadd            
	//* 103  166:ldc1            #89  <Float 300F>
	//* 104  168:fmul            
	//* 105  169:f2i             
	//* 106  170:istore_1        
	//* 107  171:goto            126
				j = j1;
	//  108  174:iload           10
	//  109  176:istore_2        
			i = (int)(((float)j / (float)i + 1.0F) * 300F);
		}
		return Math.min(i, 2000);
	//* 110  177:goto            159
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
		OverScroller overscroller;
		er er;
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
	//   14   30:astore          12
		er = mLayout.mSmoothScroller;
	//   15   32:aload_0         
	//   16   33:getfield        #25  <Field RecyclerView this$0>
	//   17   36:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   18   39:getfield        #142 <Field RecyclerView$SmoothScroller RecyclerView$LayoutManager.mSmoothScroller>
	//   19   42:astore          13
		if(!overscroller.computeScrollOffset()) goto _L2; else goto _L1
	//   20   44:aload           12
	//   21   46:invokevirtual   #146 <Method boolean OverScroller.computeScrollOffset()>
	//   22   49:ifeq            672
_L1:
		int j1;
		int k1;
		int k2;
		int l2;
		int ai[] = RecyclerView.access$500(RecyclerView.this);
	//   23   52:aload_0         
	//   24   53:getfield        #25  <Field RecyclerView this$0>
	//   25   56:invokestatic    #150 <Method int[] RecyclerView.access$500(RecyclerView)>
	//   26   59:astore          14
		k2 = overscroller.getCurrX();
	//   27   61:aload           12
	//   28   63:invokevirtual   #153 <Method int OverScroller.getCurrX()>
	//   29   66:istore          10
		l2 = overscroller.getCurrY();
	//   30   68:aload           12
	//   31   70:invokevirtual   #156 <Method int OverScroller.getCurrY()>
	//   32   73:istore          11
		k1 = k2 - mLastFlingX;
	//   33   75:iload           10
	//   34   77:aload_0         
	//   35   78:getfield        #109 <Field int mLastFlingX>
	//   36   81:isub            
	//   37   82:istore          6
		j1 = l2 - mLastFlingY;
	//   38   84:iload           11
	//   39   86:aload_0         
	//   40   87:getfield        #107 <Field int mLastFlingY>
	//   41   90:isub            
	//   42   91:istore          5
		mLastFlingX = k2;
	//   43   93:aload_0         
	//   44   94:iload           10
	//   45   96:putfield        #109 <Field int mLastFlingX>
		mLastFlingY = l2;
	//   46   99:aload_0         
	//   47  100:iload           11
	//   48  102:putfield        #107 <Field int mLastFlingY>
		if(dispatchNestedPreScroll(k1, j1, ai, ((int []) (null)), 1))
	//*  49  105:aload_0         
	//*  50  106:getfield        #25  <Field RecyclerView this$0>
	//*  51  109:iload           6
	//*  52  111:iload           5
	//*  53  113:aload           14
	//*  54  115:aconst_null     
	//*  55  116:iconst_1        
	//*  56  117:invokevirtual   #160 <Method boolean RecyclerView.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//*  57  120:ifeq            891
		{
			int i = ai[0];
	//   58  123:aload           14
	//   59  125:iconst_0        
	//   60  126:iaload          
	//   61  127:istore_1        
			j1 -= ai[1];
	//   62  128:iload           5
	//   63  130:aload           14
	//   64  132:iconst_1        
	//   65  133:iaload          
	//   66  134:isub            
	//   67  135:istore          5
			k1 -= i;
	//   68  137:iload           6
	//   69  139:iload_1         
	//   70  140:isub            
	//   71  141:istore          6
		}
		if(mAdapter == null) goto _L4; else goto _L3
	//   72  143:aload_0         
	//   73  144:getfield        #25  <Field RecyclerView this$0>
	//   74  147:getfield        #164 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   75  150:ifnull          879
_L3:
		int j;
		int k;
		int l;
		int l1;
		eatRequestLayout();
	//   76  153:aload_0         
	//   77  154:getfield        #25  <Field RecyclerView this$0>
	//   78  157:invokevirtual   #167 <Method void RecyclerView.eatRequestLayout()>
		onEnterLayoutOrScroll();
	//   79  160:aload_0         
	//   80  161:getfield        #25  <Field RecyclerView this$0>
	//   81  164:invokevirtual   #170 <Method void RecyclerView.onEnterLayoutOrScroll()>
		TraceCompat.beginSection("RV Scroll");
	//   82  167:ldc1            #172 <String "RV Scroll">
	//   83  169:invokestatic    #178 <Method void TraceCompat.beginSection(String)>
		fillRemainingScrollValues(mState);
	//   84  172:aload_0         
	//   85  173:getfield        #25  <Field RecyclerView this$0>
	//   86  176:aload_0         
	//   87  177:getfield        #25  <Field RecyclerView this$0>
	//   88  180:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//   89  183:invokevirtual   #186 <Method void RecyclerView.fillRemainingScrollValues(RecyclerView$State)>
		int i1;
		int i2;
		int j2;
		if(k1 != 0)
	//*  90  186:iload           6
	//*  91  188:ifeq            871
		{
			j = mLayout.scrollHorizontallyBy(k1, mRecycler, mState);
	//   92  191:aload_0         
	//   93  192:getfield        #25  <Field RecyclerView this$0>
	//   94  195:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   95  198:iload           6
	//   96  200:aload_0         
	//   97  201:getfield        #25  <Field RecyclerView this$0>
	//   98  204:getfield        #190 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   99  207:aload_0         
	//  100  208:getfield        #25  <Field RecyclerView this$0>
	//  101  211:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//  102  214:invokevirtual   #194 <Method int RecyclerView$LayoutManager.scrollHorizontallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//  103  217:istore_1        
			i1 = k1 - j;
	//  104  218:iload           6
	//  105  220:iload_1         
	//  106  221:isub            
	//  107  222:istore          4
		} else
	//* 108  224:iload           5
	//* 109  226:ifeq            864
	//* 110  229:aload_0         
	//* 111  230:getfield        #25  <Field RecyclerView this$0>
	//* 112  233:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 113  236:iload           5
	//* 114  238:aload_0         
	//* 115  239:getfield        #25  <Field RecyclerView this$0>
	//* 116  242:getfield        #190 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//* 117  245:aload_0         
	//* 118  246:getfield        #25  <Field RecyclerView this$0>
	//* 119  249:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//* 120  252:invokevirtual   #197 <Method int RecyclerView$LayoutManager.scrollVerticallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//* 121  255:istore_2        
	//* 122  256:iload           5
	//* 123  258:iload_2         
	//* 124  259:isub            
	//* 125  260:istore_3        
	//* 126  261:invokestatic    #200 <Method void TraceCompat.endSection()>
	//* 127  264:aload_0         
	//* 128  265:getfield        #25  <Field RecyclerView this$0>
	//* 129  268:invokevirtual   #203 <Method void RecyclerView.repositionShadowingViews()>
	//* 130  271:aload_0         
	//* 131  272:getfield        #25  <Field RecyclerView this$0>
	//* 132  275:invokevirtual   #206 <Method void RecyclerView.onExitLayoutOrScroll()>
	//* 133  278:aload_0         
	//* 134  279:getfield        #25  <Field RecyclerView this$0>
	//* 135  282:iconst_0        
	//* 136  283:invokevirtual   #210 <Method void RecyclerView.resumeRequestLayout(boolean)>
	//* 137  286:aload           13
	//* 138  288:ifnull          763
	//* 139  291:aload           13
	//* 140  293:invokevirtual   #215 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 141  296:ifne            763
	//* 142  299:aload           13
	//* 143  301:invokevirtual   #218 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 144  304:ifeq            763
	//* 145  307:aload_0         
	//* 146  308:getfield        #25  <Field RecyclerView this$0>
	//* 147  311:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//* 148  314:invokevirtual   #223 <Method int RecyclerView$State.getItemCount()>
	//* 149  317:istore          7
	//* 150  319:iload           7
	//* 151  321:ifne            709
	//* 152  324:aload           13
	//* 153  326:invokevirtual   #224 <Method void RecyclerView$SmoothScroller.stop()>
	//* 154  329:iload           4
	//* 155  331:istore          7
	//* 156  333:aload_0         
	//* 157  334:getfield        #25  <Field RecyclerView this$0>
	//* 158  337:getfield        #228 <Field ArrayList RecyclerView.mItemDecorations>
	//* 159  340:invokevirtual   #233 <Method boolean ArrayList.isEmpty()>
	//* 160  343:ifne            353
	//* 161  346:aload_0         
	//* 162  347:getfield        #25  <Field RecyclerView this$0>
	//* 163  350:invokevirtual   #236 <Method void RecyclerView.invalidate()>
	//* 164  353:aload_0         
	//* 165  354:getfield        #25  <Field RecyclerView this$0>
	//* 166  357:invokevirtual   #239 <Method int RecyclerView.getOverScrollMode()>
	//* 167  360:iconst_2        
	//* 168  361:icmpeq          375
	//* 169  364:aload_0         
	//* 170  365:getfield        #25  <Field RecyclerView this$0>
	//* 171  368:iload           6
	//* 172  370:iload           5
	//* 173  372:invokevirtual   #242 <Method void RecyclerView.considerReleasingGlowsOnScroll(int, int)>
	//* 174  375:aload_0         
	//* 175  376:getfield        #25  <Field RecyclerView this$0>
	//* 176  379:iload_1         
	//* 177  380:iload_2         
	//* 178  381:iload           7
	//* 179  383:iload_3         
	//* 180  384:aconst_null     
	//* 181  385:iconst_1        
	//* 182  386:invokevirtual   #246 <Method boolean RecyclerView.dispatchNestedScroll(int, int, int, int, int[], int)>
	//* 183  389:ifne            511
	//* 184  392:iload           7
	//* 185  394:ifne            401
	//* 186  397:iload_3         
	//* 187  398:ifeq            511
	//* 188  401:aload           12
	//* 189  403:invokevirtual   #250 <Method float OverScroller.getCurrVelocity()>
	//* 190  406:f2i             
	//* 191  407:istore          8
	//* 192  409:iload           7
	//* 193  411:iload           10
	//* 194  413:icmpeq          858
	//* 195  416:iload           7
	//* 196  418:ifge            770
	//* 197  421:iload           8
	//* 198  423:ineg            
	//* 199  424:istore          4
	//* 200  426:iload           4
	//* 201  428:istore          9
	//* 202  430:iload_3         
	//* 203  431:iload           11
	//* 204  433:icmpeq          852
	//* 205  436:iload_3         
	//* 206  437:ifge            788
	//* 207  440:iload           8
	//* 208  442:ineg            
	//* 209  443:istore          4
	//* 210  445:aload_0         
	//* 211  446:getfield        #25  <Field RecyclerView this$0>
	//* 212  449:invokevirtual   #239 <Method int RecyclerView.getOverScrollMode()>
	//* 213  452:iconst_2        
	//* 214  453:icmpeq          467
	//* 215  456:aload_0         
	//* 216  457:getfield        #25  <Field RecyclerView this$0>
	//* 217  460:iload           9
	//* 218  462:iload           4
	//* 219  464:invokevirtual   #253 <Method void RecyclerView.absorbGlows(int, int)>
	//* 220  467:iload           9
	//* 221  469:ifne            487
	//* 222  472:iload           7
	//* 223  474:iload           10
	//* 224  476:icmpeq          487
	//* 225  479:aload           12
	//* 226  481:invokevirtual   #256 <Method int OverScroller.getFinalX()>
	//* 227  484:ifne            511
	//* 228  487:iload           4
	//* 229  489:ifne            506
	//* 230  492:iload_3         
	//* 231  493:iload           11
	//* 232  495:icmpeq          506
	//* 233  498:aload           12
	//* 234  500:invokevirtual   #259 <Method int OverScroller.getFinalY()>
	//* 235  503:ifne            511
	//* 236  506:aload           12
	//* 237  508:invokevirtual   #262 <Method void OverScroller.abortAnimation()>
	//* 238  511:iload_1         
	//* 239  512:ifne            519
	//* 240  515:iload_2         
	//* 241  516:ifeq            528
	//* 242  519:aload_0         
	//* 243  520:getfield        #25  <Field RecyclerView this$0>
	//* 244  523:iload_1         
	//* 245  524:iload_2         
	//* 246  525:invokevirtual   #265 <Method void RecyclerView.dispatchOnScrolled(int, int)>
	//* 247  528:aload_0         
	//* 248  529:getfield        #25  <Field RecyclerView this$0>
	//* 249  532:invokestatic    #269 <Method boolean RecyclerView.access$700(RecyclerView)>
	//* 250  535:ifne            545
	//* 251  538:aload_0         
	//* 252  539:getfield        #25  <Field RecyclerView this$0>
	//* 253  542:invokevirtual   #236 <Method void RecyclerView.invalidate()>
	//* 254  545:iload           5
	//* 255  547:ifeq            802
	//* 256  550:aload_0         
	//* 257  551:getfield        #25  <Field RecyclerView this$0>
	//* 258  554:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 259  557:invokevirtual   #272 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//* 260  560:ifeq            802
	//* 261  563:iload_2         
	//* 262  564:iload           5
	//* 263  566:icmpne          802
	//* 264  569:iconst_1        
	//* 265  570:istore_2        
	//* 266  571:iload           6
	//* 267  573:ifeq            807
	//* 268  576:aload_0         
	//* 269  577:getfield        #25  <Field RecyclerView this$0>
	//* 270  580:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 271  583:invokevirtual   #275 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//* 272  586:ifeq            807
	//* 273  589:iload_1         
	//* 274  590:iload           6
	//* 275  592:icmpne          807
	//* 276  595:iconst_1        
	//* 277  596:istore_1        
	//* 278  597:iload           6
	//* 279  599:ifne            607
	//* 280  602:iload           5
	//* 281  604:ifeq            615
	//* 282  607:iload_1         
	//* 283  608:ifne            615
	//* 284  611:iload_2         
	//* 285  612:ifeq            812
	//* 286  615:iconst_1        
	//* 287  616:istore_1        
	//* 288  617:aload           12
	//* 289  619:invokevirtual   #278 <Method boolean OverScroller.isFinished()>
	//* 290  622:ifne            640
	//* 291  625:iload_1         
	//* 292  626:ifne            817
	//* 293  629:aload_0         
	//* 294  630:getfield        #25  <Field RecyclerView this$0>
	//* 295  633:iconst_1        
	//* 296  634:invokevirtual   #282 <Method boolean RecyclerView.hasNestedScrollingParent(int)>
	//* 297  637:ifne            817
	//* 298  640:aload_0         
	//* 299  641:getfield        #25  <Field RecyclerView this$0>
	//* 300  644:iconst_0        
	//* 301  645:invokevirtual   #105 <Method void RecyclerView.setScrollState(int)>
	//* 302  648:invokestatic    #285 <Method boolean RecyclerView.access$800()>
	//* 303  651:ifeq            664
	//* 304  654:aload_0         
	//* 305  655:getfield        #25  <Field RecyclerView this$0>
	//* 306  658:getfield        #289 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 307  661:invokevirtual   #294 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
	//* 308  664:aload_0         
	//* 309  665:getfield        #25  <Field RecyclerView this$0>
	//* 310  668:iconst_1        
	//* 311  669:invokevirtual   #297 <Method void RecyclerView.stopNestedScroll(int)>
	//* 312  672:aload           13
	//* 313  674:ifnull          704
	//* 314  677:aload           13
	//* 315  679:invokevirtual   #215 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 316  682:ifeq            692
	//* 317  685:aload           13
	//* 318  687:iconst_0        
	//* 319  688:iconst_0        
	//* 320  689:invokestatic    #301 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
	//* 321  692:aload_0         
	//* 322  693:getfield        #37  <Field boolean mReSchedulePostAnimationCallback>
	//* 323  696:ifne            704
	//* 324  699:aload           13
	//* 325  701:invokevirtual   #224 <Method void RecyclerView$SmoothScroller.stop()>
	//* 326  704:aload_0         
	//* 327  705:invokespecial   #303 <Method void enableRunOnAnimationRequests()>
	//* 328  708:return          
	//* 329  709:aload           13
	//* 330  711:invokevirtual   #306 <Method int RecyclerView$SmoothScroller.getTargetPosition()>
	//* 331  714:iload           7
	//* 332  716:icmplt          749
	//* 333  719:aload           13
	//* 334  721:iload           7
	//* 335  723:iconst_1        
	//* 336  724:isub            
	//* 337  725:invokevirtual   #309 <Method void RecyclerView$SmoothScroller.setTargetPosition(int)>
	//* 338  728:aload           13
	//* 339  730:iload           6
	//* 340  732:iload           4
	//* 341  734:isub            
	//* 342  735:iload           5
	//* 343  737:iload_3         
	//* 344  738:isub            
	//* 345  739:invokestatic    #301 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
	//* 346  742:iload           4
	//* 347  744:istore          7
	//* 348  746:goto            333
	//* 349  749:aload           13
	//* 350  751:iload           6
	//* 351  753:iload           4
	//* 352  755:isub            
	//* 353  756:iload           5
	//* 354  758:iload_3         
	//* 355  759:isub            
	//* 356  760:invokestatic    #301 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
	//* 357  763:iload           4
	//* 358  765:istore          7
	//* 359  767:goto            333
	//* 360  770:iload           7
	//* 361  772:ifle            782
	//* 362  775:iload           8
	//* 363  777:istore          4
	//* 364  779:goto            426
	//* 365  782:iconst_0        
	//* 366  783:istore          4
	//* 367  785:goto            426
	//* 368  788:iload           8
	//* 369  790:istore          4
	//* 370  792:iload_3         
	//* 371  793:ifgt            445
	//* 372  796:iconst_0        
	//* 373  797:istore          4
	//* 374  799:goto            445
	//* 375  802:iconst_0        
	//* 376  803:istore_2        
	//* 377  804:goto            571
	//* 378  807:iconst_0        
	//* 379  808:istore_1        
	//* 380  809:goto            597
	//* 381  812:iconst_0        
	//* 382  813:istore_1        
	//* 383  814:goto            617
	//* 384  817:aload_0         
	//* 385  818:invokevirtual   #99  <Method void postOnAnimation()>
	//* 386  821:aload_0         
	//* 387  822:getfield        #25  <Field RecyclerView this$0>
	//* 388  825:getfield        #313 <Field GapWorker RecyclerView.mGapWorker>
	//* 389  828:ifnull          672
	//* 390  831:aload_0         
	//* 391  832:getfield        #25  <Field RecyclerView this$0>
	//* 392  835:getfield        #313 <Field GapWorker RecyclerView.mGapWorker>
	//* 393  838:aload_0         
	//* 394  839:getfield        #25  <Field RecyclerView this$0>
	//* 395  842:iload           6
	//* 396  844:iload           5
	//* 397  846:invokevirtual   #319 <Method void GapWorker.postFromTraversal(RecyclerView, int, int)>
	//* 398  849:goto            672
	//* 399  852:iconst_0        
	//* 400  853:istore          4
	//* 401  855:goto            445
	//* 402  858:iconst_0        
	//* 403  859:istore          9
	//* 404  861:goto            430
	//* 405  864:iconst_0        
	//* 406  865:istore_3        
	//* 407  866:iconst_0        
	//* 408  867:istore_2        
	//* 409  868:goto            261
		{
			i1 = 0;
	//  410  871:iconst_0        
	//  411  872:istore          4
			j = 0;
	//  412  874:iconst_0        
	//  413  875:istore_1        
		}
		if(j1 != 0)
		{
			k = mLayout.scrollVerticallyBy(j1, mRecycler, mState);
			l = j1 - k;
		} else
		{
			l = 0;
			k = 0;
		}
		TraceCompat.endSection();
		repositionShadowingViews();
		onExitLayoutOrScroll();
		resumeRequestLayout(false);
		if(er == null || er.isPendingInitialRun() || !er.isRunning()) goto _L6; else goto _L5
_L5:
		l1 = mState.getItemCount();
		if(l1 != 0) goto _L8; else goto _L7
_L7:
		er.stop();
		l1 = i1;
_L19:
		if(!mItemDecorations.isEmpty())
			invalidate();
		if(getOverScrollMode() != 2)
			considerReleasingGlowsOnScroll(k1, j1);
		if(dispatchNestedScroll(j, k, l1, l, ((int []) (null)), 1) || l1 == 0 && l == 0) goto _L10; else goto _L9
_L9:
		i2 = (int)overscroller.getCurrVelocity();
		if(l1 != k2)
		{
			if(l1 < 0)
				i1 = -i2;
			else
			if(l1 > 0)
				i1 = i2;
			else
				i1 = 0;
			j2 = i1;
		} else
		{
			j2 = 0;
		}
		if(l == l2) goto _L12; else goto _L11
_L11:
		if(l >= 0) goto _L14; else goto _L13
_L13:
		i1 = -i2;
_L17:
		if(getOverScrollMode() != 2)
			absorbGlows(j2, i1);
		if((j2 != 0 || l1 == k2 || overscroller.getFinalX() == 0) && (i1 != 0 || l == l2 || overscroller.getFinalY() == 0))
			overscroller.abortAnimation();
_L10:
		if(j != 0 || k != 0)
			dispatchOnScrolled(j, k);
		if(!RecyclerView.access$700(RecyclerView.this))
			invalidate();
		if(j1 != 0 && mLayout.canScrollVertically() && k == j1)
			k = 1;
		else
			k = 0;
		if(k1 != 0 && mLayout.canScrollHorizontally() && j == k1)
			j = 1;
		else
			j = 0;
		if(k1 == 0 && j1 == 0 || j != 0 || k != 0)
			j = 1;
		else
			j = 0;
		if(!overscroller.isFinished() && (j != 0 || hasNestedScrollingParent(1))) goto _L16; else goto _L15
_L15:
		setScrollState(0);
		if(RecyclerView.access$800())
			mPrefetchRegistry.clearPrefetchPositions();
		stopNestedScroll(1);
_L2:
		if(er != null)
		{
			if(er.isPendingInitialRun())
				er.access._mth600(er, 0, 0);
			if(!mReSchedulePostAnimationCallback)
				er.stop();
		}
		enableRunOnAnimationRequests();
		return;
_L8:
		if(er.getTargetPosition() >= l1)
		{
			er.setTargetPosition(l1 - 1);
			er.access._mth600(er, k1 - i1, j1 - l);
			l1 = i1;
			continue; /* Loop/switch isn't completed */
		}
		er.access._mth600(er, k1 - i1, j1 - l);
_L6:
		l1 = i1;
		continue; /* Loop/switch isn't completed */
_L14:
		i1 = i2;
		if(l <= 0)
			i1 = 0;
		continue; /* Loop/switch isn't completed */
_L16:
		postOnAnimation();
		if(mGapWorker != null)
			mGapWorker.postFromTraversal(RecyclerView.this, k1, j1);
		if(true) goto _L2; else goto _L12
_L12:
		i1 = 0;
		if(true) goto _L17; else goto _L4
	//* 414  876:goto            224
_L4:
		l = 0;
	//  415  879:iconst_0        
	//  416  880:istore_3        
		l1 = 0;
	//  417  881:iconst_0        
	//  418  882:istore          7
		k = 0;
	//  419  884:iconst_0        
	//  420  885:istore_2        
		j = 0;
	//  421  886:iconst_0        
	//  422  887:istore_1        
		if(true) goto _L19; else goto _L18
	//  423  888:goto            333
_L18:
	//* 424  891:goto            143
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
	//    7   13:invokevirtual   #262 <Method void OverScroller.abortAnimation()>
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
