// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SnapHelper, OrientationHelper, RecyclerView, LinearSmoothScroller

public class PagerSnapHelper extends SnapHelper
{

	public PagerSnapHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void SnapHelper()>
	//    2    4:return          
	}

	private int distanceToCenter(RecyclerView.LayoutManager layoutmanager, View view, OrientationHelper orientationhelper)
	{
		int j = orientationhelper.getDecoratedStart(view);
	//    0    0:aload_3         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #27  <Method int OrientationHelper.getDecoratedStart(View)>
	//    3    5:istore          5
		int k = orientationhelper.getDecoratedMeasurement(view) / 2;
	//    4    7:aload_3         
	//    5    8:aload_2         
	//    6    9:invokevirtual   #30  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//    7   12:iconst_2        
	//    8   13:idiv            
	//    9   14:istore          6
		int i;
		if(layoutmanager.getClipToPadding())
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #36  <Method boolean RecyclerView$LayoutManager.getClipToPadding()>
	//*  12   20:ifeq            45
			i = orientationhelper.getStartAfterPadding() + orientationhelper.getTotalSpace() / 2;
	//   13   23:aload_3         
	//   14   24:invokevirtual   #40  <Method int OrientationHelper.getStartAfterPadding()>
	//   15   27:aload_3         
	//   16   28:invokevirtual   #43  <Method int OrientationHelper.getTotalSpace()>
	//   17   31:iconst_2        
	//   18   32:idiv            
	//   19   33:iadd            
	//   20   34:istore          4
		else
	//*  21   36:iload           6
	//*  22   38:iload           5
	//*  23   40:iadd            
	//*  24   41:iload           4
	//*  25   43:isub            
	//*  26   44:ireturn         
			i = orientationhelper.getEnd() / 2;
	//   27   45:aload_3         
	//   28   46:invokevirtual   #46  <Method int OrientationHelper.getEnd()>
	//   29   49:iconst_2        
	//   30   50:idiv            
	//   31   51:istore          4
		return (k + j) - i;
	//*  32   53:goto            36
	}

	private View findCenterView(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		int i1;
		View view;
		View view1;
		view = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		view1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		i1 = layoutmanager.getChildCount();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #52  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    6   10:istore          7
		if(i1 != 0) goto _L2; else goto _L1
	//    7   12:iload           7
	//    8   14:ifne            20
_L1:
		return view1;
	//    9   17:aload           9
	//   10   19:areturn         
_L2:
		int i;
		int j;
		int k;
		int l;
		if(layoutmanager.getClipToPadding())
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #36  <Method boolean RecyclerView$LayoutManager.getClipToPadding()>
	//*  13   24:ifeq            110
			j = orientationhelper.getStartAfterPadding() + orientationhelper.getTotalSpace() / 2;
	//   14   27:aload_2         
	//   15   28:invokevirtual   #40  <Method int OrientationHelper.getStartAfterPadding()>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #43  <Method int OrientationHelper.getTotalSpace()>
	//   18   35:iconst_2        
	//   19   36:idiv            
	//   20   37:iadd            
	//   21   38:istore          4
		else
	//*  22   40:ldc1            #53  <Int 0x7fffffff>
	//*  23   42:istore_3        
	//*  24   43:iconst_0        
	//*  25   44:istore          5
	//*  26   46:aload           8
	//*  27   48:astore          9
	//*  28   50:iload           5
	//*  29   52:iload           7
	//*  30   54:icmpge          17
	//*  31   57:aload_1         
	//*  32   58:iload           5
	//*  33   60:invokevirtual   #57  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//*  34   63:astore          9
	//*  35   65:aload_2         
	//*  36   66:aload           9
	//*  37   68:invokevirtual   #27  <Method int OrientationHelper.getDecoratedStart(View)>
	//*  38   71:aload_2         
	//*  39   72:aload           9
	//*  40   74:invokevirtual   #30  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  41   77:iconst_2        
	//*  42   78:idiv            
	//*  43   79:iadd            
	//*  44   80:iload           4
	//*  45   82:isub            
	//*  46   83:invokestatic    #63  <Method int Math.abs(int)>
	//*  47   86:istore          6
	//*  48   88:iload           6
	//*  49   90:iload_3         
	//*  50   91:icmpge          121
	//*  51   94:aload           9
	//*  52   96:astore          8
	//*  53   98:iload           6
	//*  54  100:istore_3        
	//*  55  101:iload           5
	//*  56  103:iconst_1        
	//*  57  104:iadd            
	//*  58  105:istore          5
	//*  59  107:goto            46
			j = orientationhelper.getEnd() / 2;
	//   60  110:aload_2         
	//   61  111:invokevirtual   #46  <Method int OrientationHelper.getEnd()>
	//   62  114:iconst_2        
	//   63  115:idiv            
	//   64  116:istore          4
		i = 0x7fffffff;
		k = 0;
		view1 = view;
		if(k < i1)
		{
			view1 = layoutmanager.getChildAt(k);
			l = Math.abs((orientationhelper.getDecoratedStart(view1) + orientationhelper.getDecoratedMeasurement(view1) / 2) - j);
			if(l < i)
			{
				view = view1;
				i = l;
			}
			k++;
			break MISSING_BLOCK_LABEL_46;
		}
		continue; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L3
_L3:
	//*  65  118:goto            40
	//*  66  121:goto            101
	}

	private View findStartView(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		int l;
		View view;
		View view1;
		view = null;
	//    0    0:aconst_null     
	//    1    1:astore          7
		view1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		l = layoutmanager.getChildCount();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #52  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    6   10:istore          6
		if(l != 0) goto _L2; else goto _L1
	//    7   12:iload           6
	//    8   14:ifne            20
_L1:
		return view1;
	//    9   17:aload           8
	//   10   19:areturn         
_L2:
		int i = 0x7fffffff;
	//   11   20:ldc1            #53  <Int 0x7fffffff>
	//   12   22:istore_3        
		int j = 0;
	//   13   23:iconst_0        
	//   14   24:istore          4
		do
		{
			view1 = view;
	//   15   26:aload           7
	//   16   28:astore          8
			if(j >= l)
				continue;
	//   17   30:iload           4
	//   18   32:iload           6
	//   19   34:icmpge          17
			view1 = layoutmanager.getChildAt(j);
	//   20   37:aload_1         
	//   21   38:iload           4
	//   22   40:invokevirtual   #57  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//   23   43:astore          8
			int k = orientationhelper.getDecoratedStart(view1);
	//   24   45:aload_2         
	//   25   46:aload           8
	//   26   48:invokevirtual   #27  <Method int OrientationHelper.getDecoratedStart(View)>
	//   27   51:istore          5
			if(k < i)
	//*  28   53:iload           5
	//*  29   55:iload_3         
	//*  30   56:icmpge          75
			{
				view = view1;
	//   31   59:aload           8
	//   32   61:astore          7
				i = k;
	//   33   63:iload           5
	//   34   65:istore_3        
			}
			j++;
	//   35   66:iload           4
	//   36   68:iconst_1        
	//   37   69:iadd            
	//   38   70:istore          4
		} while(true);
	//   39   72:goto            26
		if(true) goto _L1; else goto _L3
_L3:
	//*  40   75:goto            66
	}

	private OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		if(mHorizontalHelper == null || mHorizontalHelper.mLayoutManager != layoutmanager)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field OrientationHelper mHorizontalHelper>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field OrientationHelper mHorizontalHelper>
	//*   5   11:getfield        #73  <Field RecyclerView$LayoutManager OrientationHelper.mLayoutManager>
	//*   6   14:aload_1         
	//*   7   15:if_acmpeq       26
			mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutmanager);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #76  <Method OrientationHelper OrientationHelper.createHorizontalHelper(RecyclerView$LayoutManager)>
	//   11   23:putfield        #69  <Field OrientationHelper mHorizontalHelper>
		return mHorizontalHelper;
	//   12   26:aload_0         
	//   13   27:getfield        #69  <Field OrientationHelper mHorizontalHelper>
	//   14   30:areturn         
	}

	private OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		if(mVerticalHelper == null || mVerticalHelper.mLayoutManager != layoutmanager)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field OrientationHelper mVerticalHelper>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #79  <Field OrientationHelper mVerticalHelper>
	//*   5   11:getfield        #73  <Field RecyclerView$LayoutManager OrientationHelper.mLayoutManager>
	//*   6   14:aload_1         
	//*   7   15:if_acmpeq       26
			mVerticalHelper = OrientationHelper.createVerticalHelper(layoutmanager);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #82  <Method OrientationHelper OrientationHelper.createVerticalHelper(RecyclerView$LayoutManager)>
	//   11   23:putfield        #79  <Field OrientationHelper mVerticalHelper>
		return mVerticalHelper;
	//   12   26:aload_0         
	//   13   27:getfield        #79  <Field OrientationHelper mVerticalHelper>
	//   14   30:areturn         
	}

	public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutmanager, View view)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_3        
		if(layoutmanager.canScrollHorizontally())
	//*   3    4:aload_1         
	//*   4    5:invokevirtual   #87  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*   5    8:ifeq            48
			ai[0] = distanceToCenter(layoutmanager, view, getHorizontalHelper(layoutmanager));
	//    6   11:aload_3         
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:aload_2         
	//   11   16:aload_0         
	//   12   17:aload_1         
	//   13   18:invokespecial   #89  <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   14   21:invokespecial   #91  <Method int distanceToCenter(RecyclerView$LayoutManager, View, OrientationHelper)>
	//   15   24:iastore         
		else
	//*  16   25:aload_1         
	//*  17   26:invokevirtual   #94  <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  18   29:ifeq            55
	//*  19   32:aload_3         
	//*  20   33:iconst_1        
	//*  21   34:aload_0         
	//*  22   35:aload_1         
	//*  23   36:aload_2         
	//*  24   37:aload_0         
	//*  25   38:aload_1         
	//*  26   39:invokespecial   #96  <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//*  27   42:invokespecial   #91  <Method int distanceToCenter(RecyclerView$LayoutManager, View, OrientationHelper)>
	//*  28   45:iastore         
	//*  29   46:aload_3         
	//*  30   47:areturn         
			ai[0] = 0;
	//   31   48:aload_3         
	//   32   49:iconst_0        
	//   33   50:iconst_0        
	//   34   51:iastore         
		if(layoutmanager.canScrollVertically())
		{
			ai[1] = distanceToCenter(layoutmanager, view, getVerticalHelper(layoutmanager));
			return ai;
		} else
	//*  35   52:goto            25
		{
			ai[1] = 0;
	//   36   55:aload_3         
	//   37   56:iconst_1        
	//   38   57:iconst_0        
	//   39   58:iastore         
			return ai;
	//   40   59:aload_3         
	//   41   60:areturn         
		}
	}

	protected LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutmanager)
	{
		if(!(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #100 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return ((LinearSmoothScroller) (new LinearSmoothScroller(mRecyclerView.getContext()) {

				protected float calculateSpeedPerPixel(DisplayMetrics displaymetrics)
				{
					return 100F / (float)displaymetrics.densityDpi;
				//    0    0:ldc1            #22  <Float 100F>
				//    1    2:aload_1         
				//    2    3:getfield        #28  <Field int DisplayMetrics.densityDpi>
				//    3    6:i2f             
				//    4    7:fdiv            
				//    5    8:freturn         
				}

				protected int calculateTimeForScrolling(int i)
				{
					return Math.min(100, super.calculateTimeForScrolling(i));
				//    0    0:bipush          100
				//    1    2:aload_0         
				//    2    3:iload_1         
				//    3    4:invokespecial   #32  <Method int LinearSmoothScroller.calculateTimeForScrolling(int)>
				//    4    7:invokestatic    #38  <Method int Math.min(int, int)>
				//    5   10:ireturn         
				}

				protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
				{
					view = ((View) (calculateDistanceToFinalSnap(mRecyclerView.getLayoutManager(), view)));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field PagerSnapHelper this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #15  <Field PagerSnapHelper this$0>
				//    4    8:getfield        #44  <Field RecyclerView PagerSnapHelper.mRecyclerView>
				//    5   11:invokevirtual   #50  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
				//    6   14:aload_1         
				//    7   15:invokevirtual   #54  <Method int[] PagerSnapHelper.calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
				//    8   18:astore_1        
					int i = view[0];
				//    9   19:aload_1         
				//   10   20:iconst_0        
				//   11   21:iaload          
				//   12   22:istore          4
					int j = view[1];
				//   13   24:aload_1         
				//   14   25:iconst_1        
				//   15   26:iaload          
				//   16   27:istore          5
					int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
				//   17   29:aload_0         
				//   18   30:iload           4
				//   19   32:invokestatic    #57  <Method int Math.abs(int)>
				//   20   35:iload           5
				//   21   37:invokestatic    #57  <Method int Math.abs(int)>
				//   22   40:invokestatic    #60  <Method int Math.max(int, int)>
				//   23   43:invokevirtual   #63  <Method int calculateTimeForDeceleration(int)>
				//   24   46:istore          6
					if(k > 0)
				//*  25   48:iload           6
				//*  26   50:ifle            67
						action.update(i, j, k, ((android.view.animation.Interpolator) (mDecelerateInterpolator)));
				//   27   53:aload_3         
				//   28   54:iload           4
				//   29   56:iload           5
				//   30   58:iload           6
				//   31   60:aload_0         
				//   32   61:getfield        #67  <Field android.view.animation.DecelerateInterpolator mDecelerateInterpolator>
				//   33   64:invokevirtual   #73  <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
				//   34   67:return          
				}

				final PagerSnapHelper this$0;

			
			{
				this$0 = PagerSnapHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field PagerSnapHelper this$0>
				super(context);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void LinearSmoothScroller(Context)>
			//    6   10:return          
			}
			}
));
	//    5    9:new             #6   <Class PagerSnapHelper$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #104 <Field RecyclerView mRecyclerView>
	//   10   18:invokevirtual   #110 <Method Context RecyclerView.getContext()>
	//   11   21:invokespecial   #113 <Method void PagerSnapHelper$1(PagerSnapHelper, Context)>
	//   12   24:areturn         
	}

	public View findSnapView(RecyclerView.LayoutManager layoutmanager)
	{
		if(layoutmanager.canScrollVertically())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #94  <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*   2    4:ifeq            18
			return findCenterView(layoutmanager, getVerticalHelper(layoutmanager));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #96  <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//    8   14:invokespecial   #117 <Method View findCenterView(RecyclerView$LayoutManager, OrientationHelper)>
	//    9   17:areturn         
		if(layoutmanager.canScrollHorizontally())
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #87  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  12   22:ifeq            36
			return findCenterView(layoutmanager, getHorizontalHelper(layoutmanager));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #89  <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   18   32:invokespecial   #117 <Method View findCenterView(RecyclerView$LayoutManager, OrientationHelper)>
	//   19   35:areturn         
		else
			return null;
	//   20   36:aconst_null     
	//   21   37:areturn         
	}

	public int findTargetSnapPosition(RecyclerView.LayoutManager layoutmanager, int i, int j)
	{
		boolean flag;
		int l;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		l = layoutmanager.getItemCount();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #122 <Method int RecyclerView$LayoutManager.getItemCount()>
	//    4    7:istore          6
		if(l != 0) goto _L2; else goto _L1
	//    5    9:iload           6
	//    6   11:ifne            16
_L1:
		return -1;
	//    7   14:iconst_m1       
	//    8   15:ireturn         
_L2:
		int k;
		View view = null;
	//    9   16:aconst_null     
	//   10   17:astore          7
		if(layoutmanager.canScrollVertically())
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #94  <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  13   23:ifeq            137
			view = findStartView(layoutmanager, getVerticalHelper(layoutmanager));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokespecial   #96  <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//   19   33:invokespecial   #124 <Method View findStartView(RecyclerView$LayoutManager, OrientationHelper)>
	//   20   36:astore          7
		else
	//*  21   38:aload           7
	//*  22   40:ifnull          14
	//*  23   43:aload_1         
	//*  24   44:aload           7
	//*  25   46:invokevirtual   #127 <Method int RecyclerView$LayoutManager.getPosition(View)>
	//*  26   49:istore          5
	//*  27   51:iload           5
	//*  28   53:iconst_m1       
	//*  29   54:icmpeq          14
	//*  30   57:aload_1         
	//*  31   58:invokevirtual   #87  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  32   61:ifeq            164
	//*  33   64:iload_2         
	//*  34   65:ifle            159
	//*  35   68:iconst_1        
	//*  36   69:istore_2        
	//*  37   70:iload           4
	//*  38   72:istore_3        
	//*  39   73:aload_1         
	//*  40   74:instanceof      #100 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*  41   77:ifeq            124
	//*  42   80:aload_1         
	//*  43   81:checkcast       #100 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*  44   84:iload           6
	//*  45   86:iconst_1        
	//*  46   87:isub            
	//*  47   88:invokeinterface #131 <Method PointF RecyclerView$SmoothScroller$ScrollVectorProvider.computeScrollVectorForPosition(int)>
	//*  48   93:astore_1        
	//*  49   94:iload           4
	//*  50   96:istore_3        
	//*  51   97:aload_1         
	//*  52   98:ifnull          124
	//*  53  101:aload_1         
	//*  54  102:getfield        #137 <Field float PointF.x>
	//*  55  105:fconst_0        
	//*  56  106:fcmpg           
	//*  57  107:iflt            122
	//*  58  110:iload           4
	//*  59  112:istore_3        
	//*  60  113:aload_1         
	//*  61  114:getfield        #140 <Field float PointF.y>
	//*  62  117:fconst_0        
	//*  63  118:fcmpg           
	//*  64  119:ifge            124
	//*  65  122:iconst_1        
	//*  66  123:istore_3        
	//*  67  124:iload_3         
	//*  68  125:ifeq            181
	//*  69  128:iload_2         
	//*  70  129:ifeq            178
	//*  71  132:iload           5
	//*  72  134:iconst_1        
	//*  73  135:isub            
	//*  74  136:ireturn         
		if(layoutmanager.canScrollHorizontally())
	//*  75  137:aload_1         
	//*  76  138:invokevirtual   #87  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  77  141:ifeq            38
			view = findStartView(layoutmanager, getHorizontalHelper(layoutmanager));
	//   78  144:aload_0         
	//   79  145:aload_1         
	//   80  146:aload_0         
	//   81  147:aload_1         
	//   82  148:invokespecial   #89  <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   83  151:invokespecial   #124 <Method View findStartView(RecyclerView$LayoutManager, OrientationHelper)>
	//   84  154:astore          7
_L5:
		if(view == null) goto _L1; else goto _L3
_L3:
		k = layoutmanager.getPosition(view);
		if(k == -1) goto _L1; else goto _L4
_L4:
label0:
		{
			if(layoutmanager.canScrollHorizontally())
			{
				if(i > 0)
					i = 1;
				else
	//*  85  156:goto            38
					i = 0;
	//   86  159:iconst_0        
	//   87  160:istore_2        
			} else
	//*  88  161:goto            70
			if(j > 0)
	//*  89  164:iload_3         
	//*  90  165:ifle            173
				i = 1;
	//   91  168:iconst_1        
	//   92  169:istore_2        
			else
	//*  93  170:goto            70
				i = 0;
	//   94  173:iconst_0        
	//   95  174:istore_2        
			j = ((int) (flag));
			if(!(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider))
				break label0;
			layoutmanager = ((RecyclerView.LayoutManager) (((RecyclerView.SmoothScroller.ScrollVectorProvider)layoutmanager).computeScrollVectorForPosition(l - 1)));
			j = ((int) (flag));
			if(layoutmanager == null)
				break label0;
			if(((PointF) (layoutmanager)).x >= 0.0F)
			{
				j = ((int) (flag));
				if(((PointF) (layoutmanager)).y >= 0.0F)
					break label0;
			}
			j = 1;
		}
		if(j != 0)
			if(i != 0)
				return k - 1;
			else
	//*  96  175:goto            70
				return k;
	//   97  178:iload           5
	//   98  180:ireturn         
		if(i != 0)
	//*  99  181:iload_2         
	//* 100  182:ifeq            190
			return k + 1;
	//  101  185:iload           5
	//  102  187:iconst_1        
	//  103  188:iadd            
	//  104  189:ireturn         
		return k;
	//  105  190:iload           5
	//  106  192:ireturn         
		  goto _L5
	}

	private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
	private OrientationHelper mHorizontalHelper;
	private OrientationHelper mVerticalHelper;
}
