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
	//*  44   69:fconst_1        
	//*  45   70:iload_2         
	//*  46   71:i2f             
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
	//*  66  105:fload           5
	//*  67  107:fload           6
	//*  68  109:fload           7
	//*  69  111:fmul            
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
		f2 = Math.min(1.0F, (1.0F * (float)j) / (float)i);
		f = l;
		f1 = l;
		f2 = distanceInfluenceForSnapDuration(f2);
		if(k > 0)
		{
			i = Math.round(1000F * Math.abs((f + f1 * f2) / (float)k)) * 4;
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
	//   14   30:astore          13
		er = mLayout.mSmoothScroller;
	//   15   32:aload_0         
	//   16   33:getfield        #25  <Field RecyclerView this$0>
	//   17   36:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   18   39:getfield        #142 <Field RecyclerView$SmoothScroller RecyclerView$LayoutManager.mSmoothScroller>
	//   19   42:astore          14
		if(!overscroller.computeScrollOffset()) goto _L2; else goto _L1
	//   20   44:aload           13
	//   21   46:invokevirtual   #146 <Method boolean OverScroller.computeScrollOffset()>
	//   22   49:ifeq            742
_L1:
		int ai[] = RecyclerView.access$500(RecyclerView.this);
	//   23   52:aload_0         
	//   24   53:getfield        #25  <Field RecyclerView this$0>
	//   25   56:invokestatic    #150 <Method int[] RecyclerView.access$500(RecyclerView)>
	//   26   59:astore          15
		int l2 = overscroller.getCurrX();
	//   27   61:aload           13
	//   28   63:invokevirtual   #153 <Method int OverScroller.getCurrX()>
	//   29   66:istore          11
		int i3 = overscroller.getCurrY();
	//   30   68:aload           13
	//   31   70:invokevirtual   #156 <Method int OverScroller.getCurrY()>
	//   32   73:istore          12
		int l1 = l2 - mLastFlingX;
	//   33   75:iload           11
	//   34   77:aload_0         
	//   35   78:getfield        #109 <Field int mLastFlingX>
	//   36   81:isub            
	//   37   82:istore          7
		int i = i3 - mLastFlingY;
	//   38   84:iload           12
	//   39   86:aload_0         
	//   40   87:getfield        #107 <Field int mLastFlingY>
	//   41   90:isub            
	//   42   91:istore_1        
		int i2 = 0;
	//   43   92:iconst_0        
	//   44   93:istore          8
		int l = 0;
	//   45   95:iconst_0        
	//   46   96:istore_3        
		mLastFlingX = l2;
	//   47   97:aload_0         
	//   48   98:iload           11
	//   49  100:putfield        #109 <Field int mLastFlingX>
		mLastFlingY = i3;
	//   50  103:aload_0         
	//   51  104:iload           12
	//   52  106:putfield        #107 <Field int mLastFlingY>
		int j2 = 0;
	//   53  109:iconst_0        
	//   54  110:istore          9
		int k = 0;
	//   55  112:iconst_0        
	//   56  113:istore_2        
		int k2 = 0;
	//   57  114:iconst_0        
	//   58  115:istore          10
		int i1 = 0;
	//   59  117:iconst_0        
	//   60  118:istore          4
		int k1 = l1;
	//   61  120:iload           7
	//   62  122:istore          6
		int j1 = i;
	//   63  124:iload_1         
	//   64  125:istore          5
		if(dispatchNestedPreScroll(l1, i, ai, ((int []) (null)), 1))
	//*  65  127:aload_0         
	//*  66  128:getfield        #25  <Field RecyclerView this$0>
	//*  67  131:iload           7
	//*  68  133:iload_1         
	//*  69  134:aload           15
	//*  70  136:aconst_null     
	//*  71  137:iconst_1        
	//*  72  138:invokevirtual   #160 <Method boolean RecyclerView.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//*  73  141:ifeq            161
		{
			k1 = l1 - ai[0];
	//   74  144:iload           7
	//   75  146:aload           15
	//   76  148:iconst_0        
	//   77  149:iaload          
	//   78  150:isub            
	//   79  151:istore          6
			j1 = i - ai[1];
	//   80  153:iload_1         
	//   81  154:aload           15
	//   82  156:iconst_1        
	//   83  157:iaload          
	//   84  158:isub            
	//   85  159:istore          5
		}
		if(mAdapter != null)
	//*  86  161:aload_0         
	//*  87  162:getfield        #25  <Field RecyclerView this$0>
	//*  88  165:getfield        #164 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  89  168:ifnull          943
		{
			eatRequestLayout();
	//   90  171:aload_0         
	//   91  172:getfield        #25  <Field RecyclerView this$0>
	//   92  175:invokevirtual   #167 <Method void RecyclerView.eatRequestLayout()>
			onEnterLayoutOrScroll();
	//   93  178:aload_0         
	//   94  179:getfield        #25  <Field RecyclerView this$0>
	//   95  182:invokevirtual   #170 <Method void RecyclerView.onEnterLayoutOrScroll()>
			TraceCompat.beginSection("RV Scroll");
	//   96  185:ldc1            #172 <String "RV Scroll">
	//   97  187:invokestatic    #178 <Method void TraceCompat.beginSection(String)>
			fillRemainingScrollValues(mState);
	//   98  190:aload_0         
	//   99  191:getfield        #25  <Field RecyclerView this$0>
	//  100  194:aload_0         
	//  101  195:getfield        #25  <Field RecyclerView this$0>
	//  102  198:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//  103  201:invokevirtual   #186 <Method void RecyclerView.fillRemainingScrollValues(RecyclerView$State)>
			int j;
			if(k1 != 0)
	//* 104  204:iload           6
	//* 105  206:ifeq            938
			{
				j = mLayout.scrollHorizontallyBy(k1, mRecycler, mState);
	//  106  209:aload_0         
	//  107  210:getfield        #25  <Field RecyclerView this$0>
	//  108  213:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//  109  216:iload           6
	//  110  218:aload_0         
	//  111  219:getfield        #25  <Field RecyclerView this$0>
	//  112  222:getfield        #190 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//  113  225:aload_0         
	//  114  226:getfield        #25  <Field RecyclerView this$0>
	//  115  229:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//  116  232:invokevirtual   #194 <Method int RecyclerView$LayoutManager.scrollHorizontallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//  117  235:istore_1        
				k = k1 - j;
	//  118  236:iload           6
	//  119  238:iload_1         
	//  120  239:isub            
	//  121  240:istore_2        
			} else
	//* 122  241:iload           5
	//* 123  243:ifeq            279
	//* 124  246:aload_0         
	//* 125  247:getfield        #25  <Field RecyclerView this$0>
	//* 126  250:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 127  253:iload           5
	//* 128  255:aload_0         
	//* 129  256:getfield        #25  <Field RecyclerView this$0>
	//* 130  259:getfield        #190 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//* 131  262:aload_0         
	//* 132  263:getfield        #25  <Field RecyclerView this$0>
	//* 133  266:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//* 134  269:invokevirtual   #197 <Method int RecyclerView$LayoutManager.scrollVerticallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//* 135  272:istore_3        
	//* 136  273:iload           5
	//* 137  275:iload_3         
	//* 138  276:isub            
	//* 139  277:istore          4
	//* 140  279:invokestatic    #200 <Method void TraceCompat.endSection()>
	//* 141  282:aload_0         
	//* 142  283:getfield        #25  <Field RecyclerView this$0>
	//* 143  286:invokevirtual   #203 <Method void RecyclerView.repositionShadowingViews()>
	//* 144  289:aload_0         
	//* 145  290:getfield        #25  <Field RecyclerView this$0>
	//* 146  293:invokevirtual   #206 <Method void RecyclerView.onExitLayoutOrScroll()>
	//* 147  296:aload_0         
	//* 148  297:getfield        #25  <Field RecyclerView this$0>
	//* 149  300:iconst_0        
	//* 150  301:invokevirtual   #210 <Method void RecyclerView.resumeRequestLayout(boolean)>
	//* 151  304:iload_1         
	//* 152  305:istore          7
	//* 153  307:iload_3         
	//* 154  308:istore          8
	//* 155  310:iload_2         
	//* 156  311:istore          9
	//* 157  313:iload           4
	//* 158  315:istore          10
	//* 159  317:aload           14
	//* 160  319:ifnull          399
	//* 161  322:iload_1         
	//* 162  323:istore          7
	//* 163  325:iload_3         
	//* 164  326:istore          8
	//* 165  328:iload_2         
	//* 166  329:istore          9
	//* 167  331:iload           4
	//* 168  333:istore          10
	//* 169  335:aload           14
	//* 170  337:invokevirtual   #215 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 171  340:ifne            399
	//* 172  343:iload_1         
	//* 173  344:istore          7
	//* 174  346:iload_3         
	//* 175  347:istore          8
	//* 176  349:iload_2         
	//* 177  350:istore          9
	//* 178  352:iload           4
	//* 179  354:istore          10
	//* 180  356:aload           14
	//* 181  358:invokevirtual   #218 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 182  361:ifeq            399
	//* 183  364:aload_0         
	//* 184  365:getfield        #25  <Field RecyclerView this$0>
	//* 185  368:getfield        #182 <Field RecyclerView$State RecyclerView.mState>
	//* 186  371:invokevirtual   #223 <Method int RecyclerView$State.getItemCount()>
	//* 187  374:istore          7
	//* 188  376:iload           7
	//* 189  378:ifne            779
	//* 190  381:aload           14
	//* 191  383:invokevirtual   #224 <Method void RecyclerView$SmoothScroller.stop()>
	//* 192  386:iload           4
	//* 193  388:istore          10
	//* 194  390:iload_2         
	//* 195  391:istore          9
	//* 196  393:iload_3         
	//* 197  394:istore          8
	//* 198  396:iload_1         
	//* 199  397:istore          7
	//* 200  399:aload_0         
	//* 201  400:getfield        #25  <Field RecyclerView this$0>
	//* 202  403:getfield        #228 <Field ArrayList RecyclerView.mItemDecorations>
	//* 203  406:invokevirtual   #233 <Method boolean ArrayList.isEmpty()>
	//* 204  409:ifne            419
	//* 205  412:aload_0         
	//* 206  413:getfield        #25  <Field RecyclerView this$0>
	//* 207  416:invokevirtual   #236 <Method void RecyclerView.invalidate()>
	//* 208  419:aload_0         
	//* 209  420:getfield        #25  <Field RecyclerView this$0>
	//* 210  423:invokevirtual   #239 <Method int RecyclerView.getOverScrollMode()>
	//* 211  426:iconst_2        
	//* 212  427:icmpeq          441
	//* 213  430:aload_0         
	//* 214  431:getfield        #25  <Field RecyclerView this$0>
	//* 215  434:iload           6
	//* 216  436:iload           5
	//* 217  438:invokevirtual   #242 <Method void RecyclerView.considerReleasingGlowsOnScroll(int, int)>
	//* 218  441:aload_0         
	//* 219  442:getfield        #25  <Field RecyclerView this$0>
	//* 220  445:iload           7
	//* 221  447:iload           8
	//* 222  449:iload           9
	//* 223  451:iload           10
	//* 224  453:aconst_null     
	//* 225  454:iconst_1        
	//* 226  455:invokevirtual   #246 <Method boolean RecyclerView.dispatchNestedScroll(int, int, int, int, int[], int)>
	//* 227  458:ifne            575
	//* 228  461:iload           9
	//* 229  463:ifne            471
	//* 230  466:iload           10
	//* 231  468:ifeq            575
	//* 232  471:aload           13
	//* 233  473:invokevirtual   #250 <Method float OverScroller.getCurrVelocity()>
	//* 234  476:f2i             
	//* 235  477:istore_3        
	//* 236  478:iconst_0        
	//* 237  479:istore_1        
	//* 238  480:iload           9
	//* 239  482:iload           11
	//* 240  484:icmpeq          495
	//* 241  487:iload           9
	//* 242  489:ifge            858
	//* 243  492:iload_3         
	//* 244  493:ineg            
	//* 245  494:istore_1        
	//* 246  495:iconst_0        
	//* 247  496:istore_2        
	//* 248  497:iload           10
	//* 249  499:iload           12
	//* 250  501:icmpeq          512
	//* 251  504:iload           10
	//* 252  506:ifge            873
	//* 253  509:iload_3         
	//* 254  510:ineg            
	//* 255  511:istore_2        
	//* 256  512:aload_0         
	//* 257  513:getfield        #25  <Field RecyclerView this$0>
	//* 258  516:invokevirtual   #239 <Method int RecyclerView.getOverScrollMode()>
	//* 259  519:iconst_2        
	//* 260  520:icmpeq          532
	//* 261  523:aload_0         
	//* 262  524:getfield        #25  <Field RecyclerView this$0>
	//* 263  527:iload_1         
	//* 264  528:iload_2         
	//* 265  529:invokevirtual   #253 <Method void RecyclerView.absorbGlows(int, int)>
	//* 266  532:iload_1         
	//* 267  533:ifne            551
	//* 268  536:iload           9
	//* 269  538:iload           11
	//* 270  540:icmpeq          551
	//* 271  543:aload           13
	//* 272  545:invokevirtual   #256 <Method int OverScroller.getFinalX()>
	//* 273  548:ifne            575
	//* 274  551:iload_2         
	//* 275  552:ifne            570
	//* 276  555:iload           10
	//* 277  557:iload           12
	//* 278  559:icmpeq          570
	//* 279  562:aload           13
	//* 280  564:invokevirtual   #259 <Method int OverScroller.getFinalY()>
	//* 281  567:ifne            575
	//* 282  570:aload           13
	//* 283  572:invokevirtual   #262 <Method void OverScroller.abortAnimation()>
	//* 284  575:iload           7
	//* 285  577:ifne            585
	//* 286  580:iload           8
	//* 287  582:ifeq            596
	//* 288  585:aload_0         
	//* 289  586:getfield        #25  <Field RecyclerView this$0>
	//* 290  589:iload           7
	//* 291  591:iload           8
	//* 292  593:invokevirtual   #265 <Method void RecyclerView.dispatchOnScrolled(int, int)>
	//* 293  596:aload_0         
	//* 294  597:getfield        #25  <Field RecyclerView this$0>
	//* 295  600:invokestatic    #269 <Method boolean RecyclerView.access$700(RecyclerView)>
	//* 296  603:ifne            613
	//* 297  606:aload_0         
	//* 298  607:getfield        #25  <Field RecyclerView this$0>
	//* 299  610:invokevirtual   #236 <Method void RecyclerView.invalidate()>
	//* 300  613:iload           5
	//* 301  615:ifeq            888
	//* 302  618:aload_0         
	//* 303  619:getfield        #25  <Field RecyclerView this$0>
	//* 304  622:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 305  625:invokevirtual   #272 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//* 306  628:ifeq            888
	//* 307  631:iload           8
	//* 308  633:iload           5
	//* 309  635:icmpne          888
	//* 310  638:iconst_1        
	//* 311  639:istore_1        
	//* 312  640:iload           6
	//* 313  642:ifeq            893
	//* 314  645:aload_0         
	//* 315  646:getfield        #25  <Field RecyclerView this$0>
	//* 316  649:getfield        #128 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 317  652:invokevirtual   #275 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//* 318  655:ifeq            893
	//* 319  658:iload           7
	//* 320  660:iload           6
	//* 321  662:icmpne          893
	//* 322  665:iconst_1        
	//* 323  666:istore_2        
	//* 324  667:iload           6
	//* 325  669:ifne            677
	//* 326  672:iload           5
	//* 327  674:ifeq            685
	//* 328  677:iload_2         
	//* 329  678:ifne            685
	//* 330  681:iload_1         
	//* 331  682:ifeq            898
	//* 332  685:iconst_1        
	//* 333  686:istore_1        
	//* 334  687:aload           13
	//* 335  689:invokevirtual   #278 <Method boolean OverScroller.isFinished()>
	//* 336  692:ifne            710
	//* 337  695:iload_1         
	//* 338  696:ifne            903
	//* 339  699:aload_0         
	//* 340  700:getfield        #25  <Field RecyclerView this$0>
	//* 341  703:iconst_1        
	//* 342  704:invokevirtual   #282 <Method boolean RecyclerView.hasNestedScrollingParent(int)>
	//* 343  707:ifne            903
	//* 344  710:aload_0         
	//* 345  711:getfield        #25  <Field RecyclerView this$0>
	//* 346  714:iconst_0        
	//* 347  715:invokevirtual   #105 <Method void RecyclerView.setScrollState(int)>
	//* 348  718:invokestatic    #285 <Method boolean RecyclerView.access$800()>
	//* 349  721:ifeq            734
	//* 350  724:aload_0         
	//* 351  725:getfield        #25  <Field RecyclerView this$0>
	//* 352  728:getfield        #289 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//* 353  731:invokevirtual   #294 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
	//* 354  734:aload_0         
	//* 355  735:getfield        #25  <Field RecyclerView this$0>
	//* 356  738:iconst_1        
	//* 357  739:invokevirtual   #297 <Method void RecyclerView.stopNestedScroll(int)>
	//* 358  742:aload           14
	//* 359  744:ifnull          774
	//* 360  747:aload           14
	//* 361  749:invokevirtual   #215 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 362  752:ifeq            762
	//* 363  755:aload           14
	//* 364  757:iconst_0        
	//* 365  758:iconst_0        
	//* 366  759:invokestatic    #301 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
	//* 367  762:aload_0         
	//* 368  763:getfield        #37  <Field boolean mReSchedulePostAnimationCallback>
	//* 369  766:ifne            774
	//* 370  769:aload           14
	//* 371  771:invokevirtual   #224 <Method void RecyclerView$SmoothScroller.stop()>
	//* 372  774:aload_0         
	//* 373  775:invokespecial   #303 <Method void enableRunOnAnimationRequests()>
	//* 374  778:return          
	//* 375  779:aload           14
	//* 376  781:invokevirtual   #306 <Method int RecyclerView$SmoothScroller.getTargetPosition()>
	//* 377  784:iload           7
	//* 378  786:icmplt          828
	//* 379  789:aload           14
	//* 380  791:iload           7
	//* 381  793:iconst_1        
	//* 382  794:isub            
	//* 383  795:invokevirtual   #309 <Method void RecyclerView$SmoothScroller.setTargetPosition(int)>
	//* 384  798:aload           14
	//* 385  800:iload           6
	//* 386  802:iload_2         
	//* 387  803:isub            
	//* 388  804:iload           5
	//* 389  806:iload           4
	//* 390  808:isub            
	//* 391  809:invokestatic    #301 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
	//* 392  812:iload_1         
	//* 393  813:istore          7
	//* 394  815:iload_3         
	//* 395  816:istore          8
	//* 396  818:iload_2         
	//* 397  819:istore          9
	//* 398  821:iload           4
	//* 399  823:istore          10
	//* 400  825:goto            399
	//* 401  828:aload           14
	//* 402  830:iload           6
	//* 403  832:iload_2         
	//* 404  833:isub            
	//* 405  834:iload           5
	//* 406  836:iload           4
	//* 407  838:isub            
	//* 408  839:invokestatic    #301 <Method void RecyclerView$SmoothScroller.access$600(RecyclerView$SmoothScroller, int, int)>
	//* 409  842:iload_1         
	//* 410  843:istore          7
	//* 411  845:iload_3         
	//* 412  846:istore          8
	//* 413  848:iload_2         
	//* 414  849:istore          9
	//* 415  851:iload           4
	//* 416  853:istore          10
	//* 417  855:goto            399
	//* 418  858:iload           9
	//* 419  860:ifle            868
	//* 420  863:iload_3         
	//* 421  864:istore_1        
	//* 422  865:goto            495
	//* 423  868:iconst_0        
	//* 424  869:istore_1        
	//* 425  870:goto            495
	//* 426  873:iload           10
	//* 427  875:ifle            883
	//* 428  878:iload_3         
	//* 429  879:istore_2        
	//* 430  880:goto            512
	//* 431  883:iconst_0        
	//* 432  884:istore_2        
	//* 433  885:goto            512
	//* 434  888:iconst_0        
	//* 435  889:istore_1        
	//* 436  890:goto            640
	//* 437  893:iconst_0        
	//* 438  894:istore_2        
	//* 439  895:goto            667
	//* 440  898:iconst_0        
	//* 441  899:istore_1        
	//* 442  900:goto            687
	//* 443  903:aload_0         
	//* 444  904:invokevirtual   #99  <Method void postOnAnimation()>
	//* 445  907:aload_0         
	//* 446  908:getfield        #25  <Field RecyclerView this$0>
	//* 447  911:getfield        #313 <Field GapWorker RecyclerView.mGapWorker>
	//* 448  914:ifnull          742
	//* 449  917:aload_0         
	//* 450  918:getfield        #25  <Field RecyclerView this$0>
	//* 451  921:getfield        #313 <Field GapWorker RecyclerView.mGapWorker>
	//* 452  924:aload_0         
	//* 453  925:getfield        #25  <Field RecyclerView this$0>
	//* 454  928:iload           6
	//* 455  930:iload           5
	//* 456  932:invokevirtual   #319 <Method void GapWorker.postFromTraversal(RecyclerView, int, int)>
	//* 457  935:goto            742
			{
				j = 0;
	//  458  938:iconst_0        
	//  459  939:istore_1        
			}
			if(j1 != 0)
			{
				l = mLayout.scrollVerticallyBy(j1, mRecycler, mState);
				i1 = j1 - l;
			}
			TraceCompat.endSection();
			repositionShadowingViews();
			onExitLayoutOrScroll();
			resumeRequestLayout(false);
			l1 = j;
			i2 = l;
			j2 = k;
			k2 = i1;
			if(er != null)
			{
				l1 = j;
				i2 = l;
				j2 = k;
				k2 = i1;
				if(!er.isPendingInitialRun())
				{
					l1 = j;
					i2 = l;
					j2 = k;
					k2 = i1;
					if(er.isRunning())
					{
						l1 = mState.getItemCount();
						if(l1 == 0)
						{
							er.stop();
							k2 = i1;
							j2 = k;
							i2 = l;
							l1 = j;
						} else
						if(er.getTargetPosition() >= l1)
						{
							er.setTargetPosition(l1 - 1);
							er.access._mth600(er, k1 - k, j1 - i1);
							l1 = j;
							i2 = l;
							j2 = k;
							k2 = i1;
						} else
						{
							er.access._mth600(er, k1 - k, j1 - i1);
							l1 = j;
							i2 = l;
							j2 = k;
							k2 = i1;
						}
					}
				}
			}
		} else
	//* 460  940:goto            241
		{
			l1 = 0;
	//  461  943:iconst_0        
	//  462  944:istore          7
		}
		if(!mItemDecorations.isEmpty())
			invalidate();
		if(getOverScrollMode() != 2)
			considerReleasingGlowsOnScroll(k1, j1);
		if(!dispatchNestedScroll(l1, i2, j2, k2, ((int []) (null)), 1) && (j2 != 0 || k2 != 0))
		{
			l = (int)overscroller.getCurrVelocity();
			j = 0;
			if(j2 != l2)
				if(j2 < 0)
					j = -l;
				else
				if(j2 > 0)
					j = l;
				else
					j = 0;
			k = 0;
			if(k2 != i3)
				if(k2 < 0)
					k = -l;
				else
				if(k2 > 0)
					k = l;
				else
					k = 0;
			if(getOverScrollMode() != 2)
				absorbGlows(j, k);
			if((j != 0 || j2 == l2 || overscroller.getFinalX() == 0) && (k != 0 || k2 == i3 || overscroller.getFinalY() == 0))
				overscroller.abortAnimation();
		}
		if(l1 != 0 || i2 != 0)
			dispatchOnScrolled(l1, i2);
		if(!RecyclerView.access$700(RecyclerView.this))
			invalidate();
		if(j1 != 0 && mLayout.canScrollVertically() && i2 == j1)
			j = 1;
		else
			j = 0;
		if(k1 != 0 && mLayout.canScrollHorizontally() && l1 == k1)
			k = 1;
		else
			k = 0;
		if(k1 == 0 && j1 == 0 || k != 0 || j != 0)
			j = 1;
		else
			j = 0;
		if(!overscroller.isFinished() && (j != 0 || hasNestedScrollingParent(1))) goto _L4; else goto _L3
_L3:
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
_L4:
		postOnAnimation();
		if(mGapWorker != null)
			mGapWorker.postFromTraversal(RecyclerView.this, k1, j1);
		if(true) goto _L2; else goto _L5
_L5:
	//* 463  946:goto            399
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
