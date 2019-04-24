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
		float f2 = Math.min(1.0F, ((float)j * 1.0F) / (float)i);
	//   51   85:fconst_1        
	//   52   86:iload_2         
	//   53   87:i2f             
	//   54   88:fconst_1        
	//   55   89:fmul            
	//   56   90:iload_1         
	//   57   91:i2f             
	//   58   92:fdiv            
	//   59   93:invokestatic    #72  <Method float Math.min(float, float)>
	//   60   96:fstore          7
		float f = l;
	//   61   98:iload           4
	//   62  100:i2f             
	//   63  101:fstore          5
		float f1 = l;
	//   64  103:iload           4
	//   65  105:i2f             
	//   66  106:fstore          6
		f2 = distanceInfluenceForSnapDuration(f2);
	//   67  108:aload_0         
	//   68  109:fload           7
	//   69  111:invokespecial   #76  <Method float distanceInfluenceForSnapDuration(float)>
	//   70  114:fstore          7
		if(k > 0)
	//*  71  116:iload_3         
	//*  72  117:ifle            146
		{
			i = Math.round(Math.abs((f + f1 * f2) / (float)k) * 1000F) * 4;
	//   73  120:fload           5
	//   74  122:fload           6
	//   75  124:fload           7
	//   76  126:fmul            
	//   77  127:fadd            
	//   78  128:iload_3         
	//   79  129:i2f             
	//   80  130:fdiv            
	//   81  131:invokestatic    #78  <Method float Math.abs(float)>
	//   82  134:ldc1            #79  <Float 1000F>
	//   83  136:fmul            
	//   84  137:invokestatic    #83  <Method int Math.round(float)>
	//   85  140:iconst_4        
	//   86  141:imul            
	//   87  142:istore_1        
		} else
	//*  88  143:goto            172
		{
			if(flag)
	//*  89  146:iload           8
	//*  90  148:ifeq            157
				j = i1;
	//   91  151:iload           9
	//   92  153:istore_2        
			else
	//*  93  154:goto            160
				j = j1;
	//   94  157:iload           10
	//   95  159:istore_2        
			i = (int)(((float)j / (float)i + 1.0F) * 300F);
	//   96  160:iload_2         
	//   97  161:i2f             
	//   98  162:iload_1         
	//   99  163:i2f             
	//  100  164:fdiv            
	//  101  165:fconst_1        
	//  102  166:fadd            
	//  103  167:ldc1            #84  <Float 300F>
	//  104  169:fmul            
	//  105  170:f2i             
	//  106  171:istore_1        
		}
		return Math.min(i, 2000);
	//  107  172:iload_1         
	//  108  173:sipush          2000
	//  109  176:invokestatic    #87  <Method int Math.min(int, int)>
	//  110  179:ireturn         
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
		return (float)Math.sin((float)((double)(f - 0.5F) * 0.4712389167638204D));
	//    0    0:fload_1         
	//    1    1:ldc1            #89  <Float 0.5F>
	//    2    3:fsub            
	//    3    4:f2d             
	//    4    5:ldc2w           #90  <Double 0.4712389167638204D>
	//    5    8:dmul            
	//    6    9:d2f             
	//    7   10:f2d             
	//    8   11:invokestatic    #94  <Method double Math.sin(double)>
	//    9   14:d2f             
	//   10   15:freturn         
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
	//    7   13:invokevirtual   #98  <Method void postOnAnimation()>
	//    8   16:return          
	}

	public void fling(int i, int j)
	{
		setScrollState(2);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView this$0>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #104 <Method void RecyclerView.setScrollState(int)>
		mLastFlingY = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #106 <Field int mLastFlingY>
		mLastFlingX = 0;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #108 <Field int mLastFlingX>
		mScroller.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field OverScroller mScroller>
	//   12   22:iconst_0        
	//   13   23:iconst_0        
	//   14   24:iload_1         
	//   15   25:iload_2         
	//   16   26:ldc1            #109 <Int 0x80000000>
	//   17   28:ldc1            #110 <Int 0x7fffffff>
	//   18   30:ldc1            #109 <Int 0x80000000>
	//   19   32:ldc1            #110 <Int 0x7fffffff>
	//   20   34:invokevirtual   #113 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		postOnAnimation();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #98  <Method void postOnAnimation()>
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
	//   10   18:invokevirtual   #117 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   11   21:pop             
			ViewCompat.postOnAnimation(((android.view.View) (RecyclerView.this)), ((Runnable) (this)));
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field RecyclerView this$0>
	//   14   26:aload_0         
	//   15   27:invokestatic    #122 <Method void ViewCompat.postOnAnimation(android.view.View, Runnable)>
			return;
	//   16   30:return          
		}
	}

	public void run()
	{
		if(mLayout == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field RecyclerView this$0>
	//*   2    4:getfield        #127 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//*   3    7:ifnonnull       15
		{
			stop();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #130 <Method void stop()>
			return;
	//    6   14:return          
		}
		disableRunOnAnimationRequests();
	//    7   15:aload_0         
	//    8   16:invokespecial   #132 <Method void disableRunOnAnimationRequests()>
		consumePendingUpdateOperations();
	//    9   19:aload_0         
	//   10   20:getfield        #25  <Field RecyclerView this$0>
	//   11   23:invokevirtual   #135 <Method void RecyclerView.consumePendingUpdateOperations()>
		OverScroller overscroller = mScroller;
	//   12   26:aload_0         
	//   13   27:getfield        #48  <Field OverScroller mScroller>
	//   14   30:astore          13
		er er = mLayout.mSmoothScroller;
	//   15   32:aload_0         
	//   16   33:getfield        #25  <Field RecyclerView this$0>
	//   17   36:getfield        #127 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   18   39:getfield        #141 <Field RecyclerView$SmoothScroller RecyclerView$LayoutManager.mSmoothScroller>
	//   19   42:astore          14
		if(overscroller.computeScrollOffset())
	//*  20   44:aload           13
	//*  21   46:invokevirtual   #145 <Method boolean OverScroller.computeScrollOffset()>
	//*  22   49:ifeq            804
		{
			int i3 = overscroller.getCurrX();
	//   23   52:aload           13
	//   24   54:invokevirtual   #148 <Method int OverScroller.getCurrX()>
	//   25   57:istore          11
			int j3 = overscroller.getCurrY();
	//   26   59:aload           13
	//   27   61:invokevirtual   #151 <Method int OverScroller.getCurrY()>
	//   28   64:istore          12
			int k2 = i3 - mLastFlingX;
	//   29   66:iload           11
	//   30   68:aload_0         
	//   31   69:getfield        #108 <Field int mLastFlingX>
	//   32   72:isub            
	//   33   73:istore          9
			int l2 = j3 - mLastFlingY;
	//   34   75:iload           12
	//   35   77:aload_0         
	//   36   78:getfield        #106 <Field int mLastFlingY>
	//   37   81:isub            
	//   38   82:istore          10
			int k1 = 0;
	//   39   84:iconst_0        
	//   40   85:istore          5
			int i = 0;
	//   41   87:iconst_0        
	//   42   88:istore_1        
			int l1 = 0;
	//   43   89:iconst_0        
	//   44   90:istore          6
			int l = 0;
	//   45   92:iconst_0        
	//   46   93:istore_3        
			mLastFlingX = i3;
	//   47   94:aload_0         
	//   48   95:iload           11
	//   49   97:putfield        #108 <Field int mLastFlingX>
			mLastFlingY = j3;
	//   50  100:aload_0         
	//   51  101:iload           12
	//   52  103:putfield        #106 <Field int mLastFlingY>
			int i2 = 0;
	//   53  106:iconst_0        
	//   54  107:istore          7
			int j = 0;
	//   55  109:iconst_0        
	//   56  110:istore_2        
			int j2 = 0;
	//   57  111:iconst_0        
	//   58  112:istore          8
			int j1 = 0;
	//   59  114:iconst_0        
	//   60  115:istore          4
			if(mAdapter != null)
	//*  61  117:aload_0         
	//*  62  118:getfield        #25  <Field RecyclerView this$0>
	//*  63  121:getfield        #155 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  64  124:ifnull          420
			{
				eatRequestLayout();
	//   65  127:aload_0         
	//   66  128:getfield        #25  <Field RecyclerView this$0>
	//   67  131:invokevirtual   #158 <Method void RecyclerView.eatRequestLayout()>
				onEnterLayoutOrScroll();
	//   68  134:aload_0         
	//   69  135:getfield        #25  <Field RecyclerView this$0>
	//   70  138:invokevirtual   #161 <Method void RecyclerView.onEnterLayoutOrScroll()>
				TraceCompat.beginSection("RV Scroll");
	//   71  141:ldc1            #163 <String "RV Scroll">
	//   72  143:invokestatic    #169 <Method void TraceCompat.beginSection(String)>
				if(k2 != 0)
	//*  73  146:iload           9
	//*  74  148:ifeq            183
				{
					i = mLayout.scrollHorizontallyBy(k2, mRecycler, mState);
	//   75  151:aload_0         
	//   76  152:getfield        #25  <Field RecyclerView this$0>
	//   77  155:getfield        #127 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   78  158:iload           9
	//   79  160:aload_0         
	//   80  161:getfield        #25  <Field RecyclerView this$0>
	//   81  164:getfield        #173 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   82  167:aload_0         
	//   83  168:getfield        #25  <Field RecyclerView this$0>
	//   84  171:getfield        #177 <Field RecyclerView$State RecyclerView.mState>
	//   85  174:invokevirtual   #181 <Method int RecyclerView$LayoutManager.scrollHorizontallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   86  177:istore_1        
					j = k2 - i;
	//   87  178:iload           9
	//   88  180:iload_1         
	//   89  181:isub            
	//   90  182:istore_2        
				}
				if(l2 != 0)
	//*  91  183:iload           10
	//*  92  185:ifeq            221
				{
					l = mLayout.scrollVerticallyBy(l2, mRecycler, mState);
	//   93  188:aload_0         
	//   94  189:getfield        #25  <Field RecyclerView this$0>
	//   95  192:getfield        #127 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   96  195:iload           10
	//   97  197:aload_0         
	//   98  198:getfield        #25  <Field RecyclerView this$0>
	//   99  201:getfield        #173 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//  100  204:aload_0         
	//  101  205:getfield        #25  <Field RecyclerView this$0>
	//  102  208:getfield        #177 <Field RecyclerView$State RecyclerView.mState>
	//  103  211:invokevirtual   #184 <Method int RecyclerView$LayoutManager.scrollVerticallyBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//  104  214:istore_3        
					j1 = l2 - l;
	//  105  215:iload           10
	//  106  217:iload_3         
	//  107  218:isub            
	//  108  219:istore          4
				}
				TraceCompat.endSection();
	//  109  221:invokestatic    #187 <Method void TraceCompat.endSection()>
				repositionShadowingViews();
	//  110  224:aload_0         
	//  111  225:getfield        #25  <Field RecyclerView this$0>
	//  112  228:invokevirtual   #190 <Method void RecyclerView.repositionShadowingViews()>
				onExitLayoutOrScroll();
	//  113  231:aload_0         
	//  114  232:getfield        #25  <Field RecyclerView this$0>
	//  115  235:invokevirtual   #193 <Method void RecyclerView.onExitLayoutOrScroll()>
				resumeRequestLayout(false);
	//  116  238:aload_0         
	//  117  239:getfield        #25  <Field RecyclerView this$0>
	//  118  242:iconst_0        
	//  119  243:invokevirtual   #197 <Method void RecyclerView.resumeRequestLayout(boolean)>
				k1 = i;
	//  120  246:iload_1         
	//  121  247:istore          5
				l1 = l;
	//  122  249:iload_3         
	//  123  250:istore          6
				i2 = j;
	//  124  252:iload_2         
	//  125  253:istore          7
				j2 = j1;
	//  126  255:iload           4
	//  127  257:istore          8
				if(er != null)
	//* 128  259:aload           14
	//* 129  261:ifnull          420
				{
					k1 = i;
	//  130  264:iload_1         
	//  131  265:istore          5
					l1 = l;
	//  132  267:iload_3         
	//  133  268:istore          6
					i2 = j;
	//  134  270:iload_2         
	//  135  271:istore          7
					j2 = j1;
	//  136  273:iload           4
	//  137  275:istore          8
					if(!er.isPendingInitialRun())
	//* 138  277:aload           14
	//* 139  279:invokevirtual   #202 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 140  282:ifne            420
					{
						k1 = i;
	//  141  285:iload_1         
	//  142  286:istore          5
						l1 = l;
	//  143  288:iload_3         
	//  144  289:istore          6
						i2 = j;
	//  145  291:iload_2         
	//  146  292:istore          7
						j2 = j1;
	//  147  294:iload           4
	//  148  296:istore          8
						if(er.isRunning())
	//* 149  298:aload           14
	//* 150  300:invokevirtual   #205 <Method boolean RecyclerView$SmoothScroller.isRunning()>
	//* 151  303:ifeq            420
						{
							k1 = mState.getItemCount();
	//  152  306:aload_0         
	//  153  307:getfield        #25  <Field RecyclerView this$0>
	//  154  310:getfield        #177 <Field RecyclerView$State RecyclerView.mState>
	//  155  313:invokevirtual   #210 <Method int RecyclerView$State.getItemCount()>
	//  156  316:istore          5
							if(k1 == 0)
	//* 157  318:iload           5
	//* 158  320:ifne            344
							{
								er.stop();
	//  159  323:aload           14
	//  160  325:invokevirtual   #211 <Method void RecyclerView$SmoothScroller.stop()>
								k1 = i;
	//  161  328:iload_1         
	//  162  329:istore          5
								l1 = l;
	//  163  331:iload_3         
	//  164  332:istore          6
								i2 = j;
	//  165  334:iload_2         
	//  166  335:istore          7
								j2 = j1;
	//  167  337:iload           4
	//  168  339:istore          8
							} else
	//* 169  341:goto            420
							if(er.getTargetPosition() >= k1)
	//* 170  344:aload           14
	//* 171  346:invokevirtual   #214 <Method int RecyclerView$SmoothScroller.getTargetPosition()>
	//* 172  349:iload           5
	//* 173  351:icmplt          393
							{
								er.setTargetPosition(k1 - 1);
	//  174  354:aload           14
	//  175  356:iload           5
	//  176  358:iconst_1        
	//  177  359:isub            
	//  178  360:invokevirtual   #217 <Method void RecyclerView$SmoothScroller.setTargetPosition(int)>
								er.access._mth400(er, k2 - j, l2 - j1);
	//  179  363:aload           14
	//  180  365:iload           9
	//  181  367:iload_2         
	//  182  368:isub            
	//  183  369:iload           10
	//  184  371:iload           4
	//  185  373:isub            
	//  186  374:invokestatic    #221 <Method void RecyclerView$SmoothScroller.access$400(RecyclerView$SmoothScroller, int, int)>
								k1 = i;
	//  187  377:iload_1         
	//  188  378:istore          5
								l1 = l;
	//  189  380:iload_3         
	//  190  381:istore          6
								i2 = j;
	//  191  383:iload_2         
	//  192  384:istore          7
								j2 = j1;
	//  193  386:iload           4
	//  194  388:istore          8
							} else
	//* 195  390:goto            420
							{
								er.access._mth400(er, k2 - j, l2 - j1);
	//  196  393:aload           14
	//  197  395:iload           9
	//  198  397:iload_2         
	//  199  398:isub            
	//  200  399:iload           10
	//  201  401:iload           4
	//  202  403:isub            
	//  203  404:invokestatic    #221 <Method void RecyclerView$SmoothScroller.access$400(RecyclerView$SmoothScroller, int, int)>
								j2 = j1;
	//  204  407:iload           4
	//  205  409:istore          8
								i2 = j;
	//  206  411:iload_2         
	//  207  412:istore          7
								l1 = l;
	//  208  414:iload_3         
	//  209  415:istore          6
								k1 = i;
	//  210  417:iload_1         
	//  211  418:istore          5
							}
						}
					}
				}
			}
			if(!mItemDecorations.isEmpty())
	//* 212  420:aload_0         
	//* 213  421:getfield        #25  <Field RecyclerView this$0>
	//* 214  424:getfield        #225 <Field ArrayList RecyclerView.mItemDecorations>
	//* 215  427:invokevirtual   #230 <Method boolean ArrayList.isEmpty()>
	//* 216  430:ifne            440
				invalidate();
	//  217  433:aload_0         
	//  218  434:getfield        #25  <Field RecyclerView this$0>
	//  219  437:invokevirtual   #233 <Method void RecyclerView.invalidate()>
			if(getOverScrollMode() != 2)
	//* 220  440:aload_0         
	//* 221  441:getfield        #25  <Field RecyclerView this$0>
	//* 222  444:invokevirtual   #236 <Method int RecyclerView.getOverScrollMode()>
	//* 223  447:iconst_2        
	//* 224  448:icmpeq          462
				considerReleasingGlowsOnScroll(k2, l2);
	//  225  451:aload_0         
	//  226  452:getfield        #25  <Field RecyclerView this$0>
	//  227  455:iload           9
	//  228  457:iload           10
	//  229  459:invokevirtual   #239 <Method void RecyclerView.considerReleasingGlowsOnScroll(int, int)>
			if(i2 != 0 || j2 != 0)
	//* 230  462:iload           7
	//* 231  464:ifne            472
	//* 232  467:iload           8
	//* 233  469:ifeq            606
			{
				int i1 = (int)overscroller.getCurrVelocity();
	//  234  472:aload           13
	//  235  474:invokevirtual   #243 <Method float OverScroller.getCurrVelocity()>
	//  236  477:f2i             
	//  237  478:istore_3        
				i = 0;
	//  238  479:iconst_0        
	//  239  480:istore_1        
				if(i2 != i3)
	//* 240  481:iload           7
	//* 241  483:iload           11
	//* 242  485:icmpeq          511
					if(i2 < 0)
	//* 243  488:iload           7
	//* 244  490:ifge            499
						i = -i1;
	//  245  493:iload_3         
	//  246  494:ineg            
	//  247  495:istore_1        
					else
	//* 248  496:goto            511
					if(i2 > 0)
	//* 249  499:iload           7
	//* 250  501:ifle            509
						i = i1;
	//  251  504:iload_3         
	//  252  505:istore_1        
					else
	//* 253  506:goto            511
						i = 0;
	//  254  509:iconst_0        
	//  255  510:istore_1        
				int k = 0;
	//  256  511:iconst_0        
	//  257  512:istore_2        
				if(j2 != j3)
	//* 258  513:iload           8
	//* 259  515:iload           12
	//* 260  517:icmpeq          543
					if(j2 < 0)
	//* 261  520:iload           8
	//* 262  522:ifge            531
						k = -i1;
	//  263  525:iload_3         
	//  264  526:ineg            
	//  265  527:istore_2        
					else
	//* 266  528:goto            543
					if(j2 > 0)
	//* 267  531:iload           8
	//* 268  533:ifle            541
						k = i1;
	//  269  536:iload_3         
	//  270  537:istore_2        
					else
	//* 271  538:goto            543
						k = 0;
	//  272  541:iconst_0        
	//  273  542:istore_2        
				if(getOverScrollMode() != 2)
	//* 274  543:aload_0         
	//* 275  544:getfield        #25  <Field RecyclerView this$0>
	//* 276  547:invokevirtual   #236 <Method int RecyclerView.getOverScrollMode()>
	//* 277  550:iconst_2        
	//* 278  551:icmpeq          563
					absorbGlows(i, k);
	//  279  554:aload_0         
	//  280  555:getfield        #25  <Field RecyclerView this$0>
	//  281  558:iload_1         
	//  282  559:iload_2         
	//  283  560:invokevirtual   #246 <Method void RecyclerView.absorbGlows(int, int)>
				if((i != 0 || i2 == i3 || overscroller.getFinalX() == 0) && (k != 0 || j2 == j3 || overscroller.getFinalY() == 0))
	//* 284  563:iload_1         
	//* 285  564:ifne            582
	//* 286  567:iload           7
	//* 287  569:iload           11
	//* 288  571:icmpeq          582
	//* 289  574:aload           13
	//* 290  576:invokevirtual   #249 <Method int OverScroller.getFinalX()>
	//* 291  579:ifne            606
	//* 292  582:iload_2         
	//* 293  583:ifne            601
	//* 294  586:iload           8
	//* 295  588:iload           12
	//* 296  590:icmpeq          601
	//* 297  593:aload           13
	//* 298  595:invokevirtual   #252 <Method int OverScroller.getFinalY()>
	//* 299  598:ifne            606
					overscroller.abortAnimation();
	//  300  601:aload           13
	//  301  603:invokevirtual   #255 <Method void OverScroller.abortAnimation()>
			}
			if(k1 != 0 || l1 != 0)
	//* 302  606:iload           5
	//* 303  608:ifne            616
	//* 304  611:iload           6
	//* 305  613:ifeq            627
				dispatchOnScrolled(k1, l1);
	//  306  616:aload_0         
	//  307  617:getfield        #25  <Field RecyclerView this$0>
	//  308  620:iload           5
	//  309  622:iload           6
	//  310  624:invokevirtual   #258 <Method void RecyclerView.dispatchOnScrolled(int, int)>
			if(!RecyclerView.access$500(RecyclerView.this))
	//* 311  627:aload_0         
	//* 312  628:getfield        #25  <Field RecyclerView this$0>
	//* 313  631:invokestatic    #262 <Method boolean RecyclerView.access$500(RecyclerView)>
	//* 314  634:ifne            644
				invalidate();
	//  315  637:aload_0         
	//  316  638:getfield        #25  <Field RecyclerView this$0>
	//  317  641:invokevirtual   #233 <Method void RecyclerView.invalidate()>
			if(l2 != 0 && mLayout.canScrollVertically() && l1 == l2)
	//* 318  644:iload           10
	//* 319  646:ifeq            674
	//* 320  649:aload_0         
	//* 321  650:getfield        #25  <Field RecyclerView this$0>
	//* 322  653:getfield        #127 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 323  656:invokevirtual   #265 <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//* 324  659:ifeq            674
	//* 325  662:iload           6
	//* 326  664:iload           10
	//* 327  666:icmpne          674
				i = 1;
	//  328  669:iconst_1        
	//  329  670:istore_1        
			else
	//* 330  671:goto            676
				i = 0;
	//  331  674:iconst_0        
	//  332  675:istore_1        
			boolean flag1;
			if(k2 != 0 && mLayout.canScrollHorizontally() && k1 == k2)
	//* 333  676:iload           9
	//* 334  678:ifeq            706
	//* 335  681:aload_0         
	//* 336  682:getfield        #25  <Field RecyclerView this$0>
	//* 337  685:getfield        #127 <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//* 338  688:invokevirtual   #268 <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//* 339  691:ifeq            706
	//* 340  694:iload           5
	//* 341  696:iload           9
	//* 342  698:icmpne          706
				flag1 = true;
	//  343  701:iconst_1        
	//  344  702:istore_2        
			else
	//* 345  703:goto            708
				flag1 = false;
	//  346  706:iconst_0        
	//  347  707:istore_2        
			boolean flag;
			if(k2 == 0 && l2 == 0 || flag1 || i)
	//* 348  708:iload           9
	//* 349  710:ifne            718
	//* 350  713:iload           10
	//* 351  715:ifeq            726
	//* 352  718:iload_2         
	//* 353  719:ifne            726
	//* 354  722:iload_1         
	//* 355  723:ifeq            731
				flag = true;
	//  356  726:iconst_1        
	//  357  727:istore_1        
			else
	//* 358  728:goto            733
				flag = false;
	//  359  731:iconst_0        
	//  360  732:istore_1        
			if(overscroller.isFinished() || !flag)
	//* 361  733:aload           13
	//* 362  735:invokevirtual   #271 <Method boolean OverScroller.isFinished()>
	//* 363  738:ifne            745
	//* 364  741:iload_1         
	//* 365  742:ifne            772
			{
				setScrollState(0);
	//  366  745:aload_0         
	//  367  746:getfield        #25  <Field RecyclerView this$0>
	//  368  749:iconst_0        
	//  369  750:invokevirtual   #104 <Method void RecyclerView.setScrollState(int)>
				if(RecyclerView.access$600())
	//* 370  753:invokestatic    #274 <Method boolean RecyclerView.access$600()>
	//* 371  756:ifeq            804
					mPrefetchRegistry.clearPrefetchPositions();
	//  372  759:aload_0         
	//  373  760:getfield        #25  <Field RecyclerView this$0>
	//  374  763:getfield        #278 <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//  375  766:invokevirtual   #283 <Method void GapWorker$LayoutPrefetchRegistryImpl.clearPrefetchPositions()>
			} else
	//* 376  769:goto            804
			{
				postOnAnimation();
	//  377  772:aload_0         
	//  378  773:invokevirtual   #98  <Method void postOnAnimation()>
				if(mGapWorker != null)
	//* 379  776:aload_0         
	//* 380  777:getfield        #25  <Field RecyclerView this$0>
	//* 381  780:getfield        #287 <Field GapWorker RecyclerView.mGapWorker>
	//* 382  783:ifnull          804
					mGapWorker.postFromTraversal(RecyclerView.this, k2, l2);
	//  383  786:aload_0         
	//  384  787:getfield        #25  <Field RecyclerView this$0>
	//  385  790:getfield        #287 <Field GapWorker RecyclerView.mGapWorker>
	//  386  793:aload_0         
	//  387  794:getfield        #25  <Field RecyclerView this$0>
	//  388  797:iload           9
	//  389  799:iload           10
	//  390  801:invokevirtual   #293 <Method void GapWorker.postFromTraversal(RecyclerView, int, int)>
			}
		}
		if(er != null)
	//* 391  804:aload           14
	//* 392  806:ifnull          836
		{
			if(er.isPendingInitialRun())
	//* 393  809:aload           14
	//* 394  811:invokevirtual   #202 <Method boolean RecyclerView$SmoothScroller.isPendingInitialRun()>
	//* 395  814:ifeq            824
				er.access._mth400(er, 0, 0);
	//  396  817:aload           14
	//  397  819:iconst_0        
	//  398  820:iconst_0        
	//  399  821:invokestatic    #221 <Method void RecyclerView$SmoothScroller.access$400(RecyclerView$SmoothScroller, int, int)>
			if(!mReSchedulePostAnimationCallback)
	//* 400  824:aload_0         
	//* 401  825:getfield        #37  <Field boolean mReSchedulePostAnimationCallback>
	//* 402  828:ifne            836
				er.stop();
	//  403  831:aload           14
	//  404  833:invokevirtual   #211 <Method void RecyclerView$SmoothScroller.stop()>
		}
		enableRunOnAnimationRequests();
	//  405  836:aload_0         
	//  406  837:invokespecial   #295 <Method void enableRunOnAnimationRequests()>
	//  407  840:return          
	}

	public void smoothScrollBy(int i, int j)
	{
		smoothScrollBy(i, j, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #299 <Method void smoothScrollBy(int, int, int, int)>
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
	//    5    7:invokevirtual   #303 <Method void smoothScrollBy(int, int, int, Interpolator)>
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
	//    8    9:invokespecial   #305 <Method int computeScrollDuration(int, int, int, int)>
	//    9   12:invokevirtual   #307 <Method void smoothScrollBy(int, int, int)>
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
	//   19   40:invokevirtual   #104 <Method void RecyclerView.setScrollState(int)>
		mLastFlingY = 0;
	//   20   43:aload_0         
	//   21   44:iconst_0        
	//   22   45:putfield        #106 <Field int mLastFlingY>
		mLastFlingX = 0;
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:putfield        #108 <Field int mLastFlingX>
		mScroller.startScroll(0, 0, i, j, k);
	//   26   53:aload_0         
	//   27   54:getfield        #48  <Field OverScroller mScroller>
	//   28   57:iconst_0        
	//   29   58:iconst_0        
	//   30   59:iload_1         
	//   31   60:iload_2         
	//   32   61:iload_3         
	//   33   62:invokevirtual   #311 <Method void OverScroller.startScroll(int, int, int, int, int)>
		postOnAnimation();
	//   34   65:aload_0         
	//   35   66:invokevirtual   #98  <Method void postOnAnimation()>
	//   36   69:return          
	}

	public void smoothScrollBy(int i, int j, Interpolator interpolator)
	{
		int k = computeScrollDuration(i, j, 0, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokespecial   #305 <Method int computeScrollDuration(int, int, int, int)>
	//    6    8:istore          4
		if(interpolator == null)
	//*   7   10:aload_3         
	//*   8   11:ifnonnull       21
			interpolator = RecyclerView.sQuinticInterpolator;
	//    9   14:getstatic       #31  <Field Interpolator RecyclerView.sQuinticInterpolator>
	//   10   17:astore_3        
	//*  11   18:goto            21
		smoothScrollBy(i, j, k, interpolator);
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:iload_2         
	//   15   24:iload           4
	//   16   26:aload_3         
	//   17   27:invokevirtual   #303 <Method void smoothScrollBy(int, int, int, Interpolator)>
	//   18   30:return          
	}

	public void stop()
	{
		removeCallbacks(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field RecyclerView this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #117 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    4    8:pop             
		mScroller.abortAnimation();
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field OverScroller mScroller>
	//    7   13:invokevirtual   #255 <Method void OverScroller.abortAnimation()>
	//    8   16:return          
	}

	private boolean mEatRunOnAnimationRequest;
	Interpolator mInterpolator;
	private int mLastFlingX;
	private int mLastFlingY;
	private boolean mReSchedulePostAnimationCallback;
	private OverScroller mScroller;
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
