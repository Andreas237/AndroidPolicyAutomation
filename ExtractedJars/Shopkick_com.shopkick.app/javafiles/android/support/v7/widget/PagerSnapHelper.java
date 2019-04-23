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
	//*  12   20:ifeq            39
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
	//*  21   36:goto            47
			i = orientationhelper.getEnd() / 2;
	//   22   39:aload_3         
	//   23   40:invokevirtual   #46  <Method int OrientationHelper.getEnd()>
	//   24   43:iconst_2        
	//   25   44:idiv            
	//   26   45:istore          4
		return (j + k) - i;
	//   27   47:iload           5
	//   28   49:iload           6
	//   29   51:iadd            
	//   30   52:iload           4
	//   31   54:isub            
	//   32   55:ireturn         
	}

	private View findCenterView(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		int j1 = layoutmanager.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    2    4:istore          8
		View view = null;
	//    3    6:aconst_null     
	//    4    7:astore          9
		if(j1 == 0)
	//*   5    9:iload           8
	//*   6   11:ifne            16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		int i;
		if(layoutmanager.getClipToPadding())
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #36  <Method boolean RecyclerView$LayoutManager.getClipToPadding()>
	//*  11   20:ifeq            38
			i = orientationhelper.getStartAfterPadding() + orientationhelper.getTotalSpace() / 2;
	//   12   23:aload_2         
	//   13   24:invokevirtual   #40  <Method int OrientationHelper.getStartAfterPadding()>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #43  <Method int OrientationHelper.getTotalSpace()>
	//   16   31:iconst_2        
	//   17   32:idiv            
	//   18   33:iadd            
	//   19   34:istore_3        
		else
	//*  20   35:goto            45
			i = orientationhelper.getEnd() / 2;
	//   21   38:aload_2         
	//   22   39:invokevirtual   #46  <Method int OrientationHelper.getEnd()>
	//   23   42:iconst_2        
	//   24   43:idiv            
	//   25   44:istore_3        
		int k = 0x7fffffff;
	//   26   45:ldc1            #53  <Int 0x7fffffff>
	//   27   47:istore          5
		for(int j = 0; j < j1;)
	//*  28   49:iconst_0        
	//*  29   50:istore          4
	//*  30   52:iload           4
	//*  31   54:iload           8
	//*  32   56:icmpge          121
		{
			View view1 = layoutmanager.getChildAt(j);
	//   33   59:aload_1         
	//   34   60:iload           4
	//   35   62:invokevirtual   #57  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//   36   65:astore          10
			int i1 = Math.abs((orientationhelper.getDecoratedStart(view1) + orientationhelper.getDecoratedMeasurement(view1) / 2) - i);
	//   37   67:aload_2         
	//   38   68:aload           10
	//   39   70:invokevirtual   #27  <Method int OrientationHelper.getDecoratedStart(View)>
	//   40   73:aload_2         
	//   41   74:aload           10
	//   42   76:invokevirtual   #30  <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   43   79:iconst_2        
	//   44   80:idiv            
	//   45   81:iadd            
	//   46   82:iload_3         
	//   47   83:isub            
	//   48   84:invokestatic    #63  <Method int Math.abs(int)>
	//   49   87:istore          7
			int l = k;
	//   50   89:iload           5
	//   51   91:istore          6
			if(i1 < k)
	//*  52   93:iload           7
	//*  53   95:iload           5
	//*  54   97:icmpge          108
			{
				view = view1;
	//   55  100:aload           10
	//   56  102:astore          9
				l = i1;
	//   57  104:iload           7
	//   58  106:istore          6
			}
			j++;
	//   59  108:iload           4
	//   60  110:iconst_1        
	//   61  111:iadd            
	//   62  112:istore          4
			k = l;
	//   63  114:iload           6
	//   64  116:istore          5
		}

	//*  65  118:goto            52
		return view;
	//   66  121:aload           9
	//   67  123:areturn         
	}

	private View findStartView(RecyclerView.LayoutManager layoutmanager, OrientationHelper orientationhelper)
	{
		int i1 = layoutmanager.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method int RecyclerView$LayoutManager.getChildCount()>
	//    2    4:istore          7
		View view = null;
	//    3    6:aconst_null     
	//    4    7:astore          8
		if(i1 == 0)
	//*   5    9:iload           7
	//*   6   11:ifne            16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		int j = 0x7fffffff;
	//    9   16:ldc1            #53  <Int 0x7fffffff>
	//   10   18:istore          4
		for(int i = 0; i < i1;)
	//*  11   20:iconst_0        
	//*  12   21:istore_3        
	//*  13   22:iload_3         
	//*  14   23:iload           7
	//*  15   25:icmpge          73
		{
			View view1 = layoutmanager.getChildAt(i);
	//   16   28:aload_1         
	//   17   29:iload_3         
	//   18   30:invokevirtual   #57  <Method View RecyclerView$LayoutManager.getChildAt(int)>
	//   19   33:astore          9
			int l = orientationhelper.getDecoratedStart(view1);
	//   20   35:aload_2         
	//   21   36:aload           9
	//   22   38:invokevirtual   #27  <Method int OrientationHelper.getDecoratedStart(View)>
	//   23   41:istore          6
			int k = j;
	//   24   43:iload           4
	//   25   45:istore          5
			if(l < j)
	//*  26   47:iload           6
	//*  27   49:iload           4
	//*  28   51:icmpge          62
			{
				view = view1;
	//   29   54:aload           9
	//   30   56:astore          8
				k = l;
	//   31   58:iload           6
	//   32   60:istore          5
			}
			i++;
	//   33   62:iload_3         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore_3        
			j = k;
	//   37   66:iload           5
	//   38   68:istore          4
		}

	//*  39   70:goto            22
		return view;
	//   40   73:aload           8
	//   41   75:areturn         
	}

	private OrientationHelper getHorizontalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		OrientationHelper orientationhelper = mHorizontalHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field OrientationHelper mHorizontalHelper>
	//    2    4:astore_2        
		if(orientationhelper == null || orientationhelper.mLayoutManager != layoutmanager)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
	//*   5    9:aload_2         
	//*   6   10:getfield        #73  <Field RecyclerView$LayoutManager OrientationHelper.mLayoutManager>
	//*   7   13:aload_1         
	//*   8   14:if_acmpeq       25
			mHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutmanager);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #76  <Method OrientationHelper OrientationHelper.createHorizontalHelper(RecyclerView$LayoutManager)>
	//   12   22:putfield        #69  <Field OrientationHelper mHorizontalHelper>
		return mHorizontalHelper;
	//   13   25:aload_0         
	//   14   26:getfield        #69  <Field OrientationHelper mHorizontalHelper>
	//   15   29:areturn         
	}

	private OrientationHelper getVerticalHelper(RecyclerView.LayoutManager layoutmanager)
	{
		OrientationHelper orientationhelper = mVerticalHelper;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field OrientationHelper mVerticalHelper>
	//    2    4:astore_2        
		if(orientationhelper == null || orientationhelper.mLayoutManager != layoutmanager)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
	//*   5    9:aload_2         
	//*   6   10:getfield        #73  <Field RecyclerView$LayoutManager OrientationHelper.mLayoutManager>
	//*   7   13:aload_1         
	//*   8   14:if_acmpeq       25
			mVerticalHelper = OrientationHelper.createVerticalHelper(layoutmanager);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #82  <Method OrientationHelper OrientationHelper.createVerticalHelper(RecyclerView$LayoutManager)>
	//   12   22:putfield        #79  <Field OrientationHelper mVerticalHelper>
		return mVerticalHelper;
	//   13   25:aload_0         
	//   14   26:getfield        #79  <Field OrientationHelper mVerticalHelper>
	//   15   29:areturn         
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
	//*   5    8:ifeq            28
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
	//*  16   25:goto            32
			ai[0] = 0;
	//   17   28:aload_3         
	//   18   29:iconst_0        
	//   19   30:iconst_0        
	//   20   31:iastore         
		if(layoutmanager.canScrollVertically())
	//*  21   32:aload_1         
	//*  22   33:invokevirtual   #94  <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  23   36:ifeq            55
		{
			ai[1] = distanceToCenter(layoutmanager, view, getVerticalHelper(layoutmanager));
	//   24   39:aload_3         
	//   25   40:iconst_1        
	//   26   41:aload_0         
	//   27   42:aload_1         
	//   28   43:aload_2         
	//   29   44:aload_0         
	//   30   45:aload_1         
	//   31   46:invokespecial   #96  <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//   32   49:invokespecial   #91  <Method int distanceToCenter(RecyclerView$LayoutManager, View, OrientationHelper)>
	//   33   52:iastore         
			return ai;
	//   34   53:aload_3         
	//   35   54:areturn         
		} else
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
					state = ((RecyclerView.State) (PagerSnapHelper.this));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field PagerSnapHelper this$0>
				//    2    4:astore_2        
					view = ((View) (((PagerSnapHelper) (state)).calculateDistanceToFinalSnap(((PagerSnapHelper) (state)).mRecyclerView.getLayoutManager(), view)));
				//    3    5:aload_2         
				//    4    6:aload_2         
				//    5    7:getfield        #44  <Field RecyclerView PagerSnapHelper.mRecyclerView>
				//    6   10:invokevirtual   #50  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
				//    7   13:aload_1         
				//    8   14:invokevirtual   #54  <Method int[] PagerSnapHelper.calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
				//    9   17:astore_1        
					int i = view[0];
				//   10   18:aload_1         
				//   11   19:iconst_0        
				//   12   20:iaload          
				//   13   21:istore          4
					int j = view[1];
				//   14   23:aload_1         
				//   15   24:iconst_1        
				//   16   25:iaload          
				//   17   26:istore          5
					int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
				//   18   28:aload_0         
				//   19   29:iload           4
				//   20   31:invokestatic    #57  <Method int Math.abs(int)>
				//   21   34:iload           5
				//   22   36:invokestatic    #57  <Method int Math.abs(int)>
				//   23   39:invokestatic    #60  <Method int Math.max(int, int)>
				//   24   42:invokevirtual   #63  <Method int calculateTimeForDeceleration(int)>
				//   25   45:istore          6
					if(k > 0)
				//*  26   47:iload           6
				//*  27   49:ifle            66
						action.update(i, j, k, ((android.view.animation.Interpolator) (mDecelerateInterpolator)));
				//   28   52:aload_3         
				//   29   53:iload           4
				//   30   55:iload           5
				//   31   57:iload           6
				//   32   59:aload_0         
				//   33   60:getfield        #67  <Field android.view.animation.DecelerateInterpolator mDecelerateInterpolator>
				//   34   63:invokevirtual   #73  <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
				//   35   66:return          
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
		int k;
label0:
		{
			int l = layoutmanager.getItemCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #122 <Method int RecyclerView$LayoutManager.getItemCount()>
	//    2    4:istore          6
			if(l == 0)
	//*   3    6:iload           6
	//*   4    8:ifne            13
				return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
			View view = null;
	//    7   13:aconst_null     
	//    8   14:astore          8
			if(layoutmanager.canScrollVertically())
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #94  <Method boolean RecyclerView$LayoutManager.canScrollVertically()>
	//*  11   20:ifeq            38
				view = findStartView(layoutmanager, getVerticalHelper(layoutmanager));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokespecial   #96  <Method OrientationHelper getVerticalHelper(RecyclerView$LayoutManager)>
	//   17   30:invokespecial   #124 <Method View findStartView(RecyclerView$LayoutManager, OrientationHelper)>
	//   18   33:astore          8
			else
	//*  19   35:goto            57
			if(layoutmanager.canScrollHorizontally())
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #87  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  22   42:ifeq            57
				view = findStartView(layoutmanager, getHorizontalHelper(layoutmanager));
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokespecial   #89  <Method OrientationHelper getHorizontalHelper(RecyclerView$LayoutManager)>
	//   28   52:invokespecial   #124 <Method View findStartView(RecyclerView$LayoutManager, OrientationHelper)>
	//   29   55:astore          8
			if(view == null)
	//*  30   57:aload           8
	//*  31   59:ifnonnull       64
				return -1;
	//   32   62:iconst_m1       
	//   33   63:ireturn         
			k = layoutmanager.getPosition(view);
	//   34   64:aload_1         
	//   35   65:aload           8
	//   36   67:invokevirtual   #127 <Method int RecyclerView$LayoutManager.getPosition(View)>
	//   37   70:istore          4
			if(k == -1)
	//*  38   72:iload           4
	//*  39   74:iconst_m1       
	//*  40   75:icmpne          80
				return -1;
	//   41   78:iconst_m1       
	//   42   79:ireturn         
			boolean flag1 = layoutmanager.canScrollHorizontally();
	//   43   80:aload_1         
	//   44   81:invokevirtual   #87  <Method boolean RecyclerView$LayoutManager.canScrollHorizontally()>
	//   45   84:istore          7
			boolean flag = false;
	//   46   86:iconst_0        
	//   47   87:istore          5
			if(flag1)
	//*  48   89:iload           7
	//*  49   91:ifeq            108
			{
				if(i > 0)
	//*  50   94:iload_2         
	//*  51   95:ifle            103
					i = 1;
	//   52   98:iconst_1        
	//   53   99:istore_2        
				else
	//*  54  100:goto            119
					i = 0;
	//   55  103:iconst_0        
	//   56  104:istore_2        
			} else
	//*  57  105:goto            119
			if(j > 0)
	//*  58  108:iload_3         
	//*  59  109:ifle            117
				i = 1;
	//   60  112:iconst_1        
	//   61  113:istore_2        
			else
	//*  62  114:goto            119
				i = 0;
	//   63  117:iconst_0        
	//   64  118:istore_2        
			j = ((int) (flag));
	//   65  119:iload           5
	//   66  121:istore_3        
			if(!(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider))
				break label0;
	//   67  122:aload_1         
	//   68  123:instanceof      #100 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//   69  126:ifeq            173
			layoutmanager = ((RecyclerView.LayoutManager) (((RecyclerView.SmoothScroller.ScrollVectorProvider)layoutmanager).computeScrollVectorForPosition(l - 1)));
	//   70  129:aload_1         
	//   71  130:checkcast       #100 <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//   72  133:iload           6
	//   73  135:iconst_1        
	//   74  136:isub            
	//   75  137:invokeinterface #131 <Method PointF RecyclerView$SmoothScroller$ScrollVectorProvider.computeScrollVectorForPosition(int)>
	//   76  142:astore_1        
			j = ((int) (flag));
	//   77  143:iload           5
	//   78  145:istore_3        
			if(layoutmanager == null)
				break label0;
	//   79  146:aload_1         
	//   80  147:ifnull          173
			if(((PointF) (layoutmanager)).x >= 0.0F)
	//*  81  150:aload_1         
	//*  82  151:getfield        #137 <Field float PointF.x>
	//*  83  154:fconst_0        
	//*  84  155:fcmpg           
	//*  85  156:iflt            171
			{
				j = ((int) (flag));
	//   86  159:iload           5
	//   87  161:istore_3        
				if(((PointF) (layoutmanager)).y >= 0.0F)
					break label0;
	//   88  162:aload_1         
	//   89  163:getfield        #140 <Field float PointF.y>
	//   90  166:fconst_0        
	//   91  167:fcmpg           
	//   92  168:ifge            173
			}
			j = 1;
	//   93  171:iconst_1        
	//   94  172:istore_3        
		}
		if(j != 0)
	//*  95  173:iload_3         
	//*  96  174:ifeq            189
		{
			j = k;
	//   97  177:iload           4
	//   98  179:istore_3        
			if(i != 0)
	//*  99  180:iload_2         
	//* 100  181:ifeq            201
				return k - 1;
	//  101  184:iload           4
	//  102  186:iconst_1        
	//  103  187:isub            
	//  104  188:ireturn         
		} else
		{
			j = k;
	//  105  189:iload           4
	//  106  191:istore_3        
			if(i != 0)
	//* 107  192:iload_2         
	//* 108  193:ifeq            201
				j = k + 1;
	//  109  196:iload           4
	//  110  198:iconst_1        
	//  111  199:iadd            
	//  112  200:istore_3        
		}
		return j;
	//  113  201:iload_3         
	//  114  202:ireturn         
	}

	private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
	private OrientationHelper mHorizontalHelper;
	private OrientationHelper mVerticalHelper;
}
