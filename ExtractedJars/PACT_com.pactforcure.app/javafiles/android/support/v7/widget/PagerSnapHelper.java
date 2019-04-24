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
	//*  21   36:iload           5
	//*  22   38:iload           6
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
		return (j + k) - i;
	//*  32   53:goto            36
	}

	private View findCenterView(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		int j1 = layoutmanager.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    2    4:istore          8
		if(j1 != 0) goto _L2; else goto _L1
	//    3    6:iload           8
	//    4    8:ifne            17
_L1:
		View view1 = null;
	//    5   11:aconst_null     
	//    6   12:astore          10
_L4:
		return view1;
	//    7   14:aload           10
	//    8   16:areturn         
_L2:
		View view = null;
	//    9   17:aconst_null     
	//   10   18:astore          9
		int i;
		int j;
		int k;
		int l;
		int i1;
		if(layoutmanager.getClipToPadding())
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #36  <Method boolean RecyclerView$LayoutManager.getClipToPadding()>
	//*  13   24:ifeq            119
			i = orientationhelper.getStartAfterPadding() + orientationhelper.getTotalSpace() / 2;
	//   14   27:aload_2         
	//   15   28:invokevirtual   #40  <Method int OrientationHelper.getStartAfterPadding()>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #43  <Method int OrientationHelper.getTotalSpace()>
	//   18   35:iconst_2        
	//   19   36:idiv            
	//   20   37:iadd            
	//   21   38:istore_3        
		else
	//*  22   39:ldc1            #53  <Int 0x7fffffff>
	//*  23   41:istore          5
	//*  24   43:iconst_0        
	//*  25   44:istore          4
	//*  26   46:aload           9
	//*  27   48:astore          10
	//*  28   50:iload           4
	//*  29   52:iload           8
	//*  30   54:icmpge          14
	//*  31   57:aload_1         
	//*  32   58:iload           4
	//*  33   60:invokevirtual   #57  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//*  34   63:astore          10
	//*  35   65:aload_2         
	//*  36   66:aload           10
	//*  37   68:invokevirtual   #27  <Method int OrientationHelper.getDecoratedStart(View)>
	//*  38   71:aload_2         
	//*  39   72:aload           10
	//*  40   74:invokevirtual   #30  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  41   77:iconst_2        
	//*  42   78:idiv            
	//*  43   79:iadd            
	//*  44   80:iload_3         
	//*  45   81:isub            
	//*  46   82:invokestatic    #63  <Method int Math.abs(int)>
	//*  47   85:istore          7
	//*  48   87:iload           5
	//*  49   89:istore          6
	//*  50   91:iload           7
	//*  51   93:iload           5
	//*  52   95:icmpge          106
	//*  53   98:iload           7
	//*  54  100:istore          6
	//*  55  102:aload           10
	//*  56  104:astore          9
	//*  57  106:iload           4
	//*  58  108:iconst_1        
	//*  59  109:iadd            
	//*  60  110:istore          4
	//*  61  112:iload           6
	//*  62  114:istore          5
	//*  63  116:goto            46
			i = orientationhelper.getEnd() / 2;
	//   64  119:aload_2         
	//   65  120:invokevirtual   #46  <Method int OrientationHelper.getEnd()>
	//   66  123:iconst_2        
	//   67  124:idiv            
	//   68  125:istore_3        
		k = 0x7fffffff;
		j = 0;
		view1 = view;
		if(j < j1)
		{
			view1 = layoutmanager.getChildAt(j);
			i1 = Math.abs((orientationhelper.getDecoratedStart(view1) + orientationhelper.getDecoratedMeasurement(view1) / 2) - i);
			l = k;
			if(i1 < k)
			{
				l = i1;
				view = view1;
			}
			j++;
			k = l;
			break MISSING_BLOCK_LABEL_46;
		}
		continue; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
	//*  69  126:goto            39
	}

	private View findStartView(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		int i1 = layoutmanager.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    2    4:istore          7
		if(i1 != 0) goto _L2; else goto _L1
	//    3    6:iload           7
	//    4    8:ifne            17
_L1:
		View view1 = null;
	//    5   11:aconst_null     
	//    6   12:astore          9
_L4:
		return view1;
	//    7   14:aload           9
	//    8   16:areturn         
_L2:
		View view = null;
	//    9   17:aconst_null     
	//   10   18:astore          8
		int j = 0x7fffffff;
	//   11   20:ldc1            #53  <Int 0x7fffffff>
	//   12   22:istore          4
		int i = 0;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		do
		{
			view1 = view;
	//   15   26:aload           8
	//   16   28:astore          9
			if(i >= i1)
				continue;
	//   17   30:iload_3         
	//   18   31:iload           7
	//   19   33:icmpge          14
			view1 = layoutmanager.getChildAt(i);
	//   20   36:aload_1         
	//   21   37:iload_3         
	//   22   38:invokevirtual   #57  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//   23   41:astore          9
			int l = orientationhelper.getDecoratedStart(view1);
	//   24   43:aload_2         
	//   25   44:aload           9
	//   26   46:invokevirtual   #27  <Method int OrientationHelper.getDecoratedStart(View)>
	//   27   49:istore          6
			int k = j;
	//   28   51:iload           4
	//   29   53:istore          5
			if(l < j)
	//*  30   55:iload           6
	//*  31   57:iload           4
	//*  32   59:icmpge          70
			{
				k = l;
	//   33   62:iload           6
	//   34   64:istore          5
				view = view1;
	//   35   66:aload           9
	//   36   68:astore          8
			}
			i++;
	//   37   70:iload_3         
	//   38   71:iconst_1        
	//   39   72:iadd            
	//   40   73:istore_3        
			j = k;
	//   41   74:iload           5
	//   42   76:istore          4
		} while(true);
	//   43   78:goto            26
		if(true) goto _L4; else goto _L3
_L3:
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
		int l = layoutmanager.getItemCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #122 <Method int RecyclerView$LayoutManager.getItemCount()>
	//    2    4:istore          6
		if(l != 0) goto _L2; else goto _L1
	//    3    6:iload           6
	//    4    8:ifne            15
_L1:
		j = -1;
	//    5   11:iconst_m1       
	//    6   12:istore_3        
_L8:
		return j;
	//    7   13:iload_3         
	//    8   14:ireturn         
_L2:
		View view = null;
	//    9   15:aconst_null     
	//   10   16:astore          7
		if(!layoutmanager.canScrollVertically()) goto _L4; else goto _L3
	//   11   18:aload_1         
	//   12   19:invokevirtual   #94  <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//   13   22:ifeq            44
_L3:
		view = findStartView(layoutmanager, getVerticalHelper(layoutmanager));
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:invokespecial   #96  <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//   19   32:invokespecial   #124 <Method View findStartView(RecyclerView$LayoutManager, OrientationHelper)>
	//   20   35:astore          7
_L6:
		if(view == null)
	//*  21   37:aload           7
	//*  22   39:ifnonnull       66
			return -1;
	//   23   42:iconst_m1       
	//   24   43:ireturn         
		break; /* Loop/switch isn't completed */
_L4:
		if(layoutmanager.canScrollHorizontally())
	//*  25   44:aload_1         
	//*  26   45:invokevirtual   #87  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  27   48:ifeq            37
			view = findStartView(layoutmanager, getHorizontalHelper(layoutmanager));
	//   28   51:aload_0         
	//   29   52:aload_1         
	//   30   53:aload_0         
	//   31   54:aload_1         
	//   32   55:invokespecial   #89  <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   33   58:invokespecial   #124 <Method View findStartView(RecyclerView$LayoutManager, OrientationHelper)>
	//   34   61:astore          7
		if(true) goto _L6; else goto _L5
	//   35   63:goto            37
_L5:
		int k;
		k = layoutmanager.getPosition(view);
	//   36   66:aload_1         
	//   37   67:aload           7
	//   38   69:invokevirtual   #127 <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   39   72:istore          4
		if(k == -1)
	//*  40   74:iload           4
	//*  41   76:iconst_m1       
	//*  42   77:icmpne          82
			return -1;
	//   43   80:iconst_m1       
	//   44   81:ireturn         
		boolean flag;
		if(layoutmanager.canScrollHorizontally())
	//*  45   82:aload_1         
	//*  46   83:invokevirtual   #87  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  47   86:ifeq            170
		{
			if(i > 0)
	//*  48   89:iload_2         
	//*  49   90:ifle            165
				i = 1;
	//   50   93:iconst_1        
	//   51   94:istore_2        
			else
	//*  52   95:iconst_0        
	//*  53   96:istore          5
	//*  54   98:iload           5
	//*  55  100:istore_3        
	//*  56  101:aload_1         
	//*  57  102:instanceof      #100 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*  58  105:ifeq            149
	//*  59  108:aload_1         
	//*  60  109:checkcast       #100 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*  61  112:iload           6
	//*  62  114:iconst_1        
	//*  63  115:isub            
	//*  64  116:invokeinterface #131 <Method PointF RecyclerView$SmoothScroller$ScrollVectorProvider.computeScrollVectorForPosition(int)>
	//*  65  121:astore_1        
	//*  66  122:iload           5
	//*  67  124:istore_3        
	//*  68  125:aload_1         
	//*  69  126:ifnull          149
	//*  70  129:aload_1         
	//*  71  130:getfield        #137 <Field float PointF.x>
	//*  72  133:fconst_0        
	//*  73  134:fcmpg           
	//*  74  135:iflt            147
	//*  75  138:aload_1         
	//*  76  139:getfield        #140 <Field float PointF.y>
	//*  77  142:fconst_0        
	//*  78  143:fcmpg           
	//*  79  144:ifge            184
	//*  80  147:iconst_1        
	//*  81  148:istore_3        
	//*  82  149:iload_3         
	//*  83  150:ifeq            189
	//*  84  153:iload           4
	//*  85  155:istore_3        
	//*  86  156:iload_2         
	//*  87  157:ifeq            13
	//*  88  160:iload           4
	//*  89  162:iconst_1        
	//*  90  163:isub            
	//*  91  164:ireturn         
				i = 0;
	//   92  165:iconst_0        
	//   93  166:istore_2        
		} else
	//*  94  167:goto            95
		if(j > 0)
	//*  95  170:iload_3         
	//*  96  171:ifle            179
			i = 1;
	//   97  174:iconst_1        
	//   98  175:istore_2        
		else
	//*  99  176:goto            95
			i = 0;
	//  100  179:iconst_0        
	//  101  180:istore_2        
		flag = false;
		j = ((int) (flag));
		if(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)
		{
			layoutmanager = ((RecyclerView.LayoutManager) (((RecyclerView.SmoothScroller.ScrollVectorProvider)layoutmanager).computeScrollVectorForPosition(l - 1)));
			j = ((int) (flag));
			if(layoutmanager != null)
				if(((PointF) (layoutmanager)).x < 0.0F || ((PointF) (layoutmanager)).y < 0.0F)
					j = 1;
				else
	//* 102  181:goto            176
					j = 0;
	//  103  184:iconst_0        
	//  104  185:istore_3        
		}
		if(j == 0)
			break; /* Loop/switch isn't completed */
		j = k;
		if(i != 0)
			return k - 1;
		if(true) goto _L8; else goto _L7
	//* 105  186:goto            149
_L7:
		j = k;
	//  106  189:iload           4
	//  107  191:istore_3        
		if(i != 0)
	//* 108  192:iload_2         
	//* 109  193:ifeq            13
			return k + 1;
	//  110  196:iload           4
	//  111  198:iconst_1        
	//  112  199:iadd            
	//  113  200:ireturn         
		if(true) goto _L8; else goto _L9
_L9:
	}

	private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
	private OrientationHelper mHorizontalHelper;
	private OrientationHelper mVerticalHelper;
}
