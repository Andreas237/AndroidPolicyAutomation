// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, LinearSmoothScroller

public abstract class SnapHelper extends RecyclerView.OnFlingListener
{

	public SnapHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void RecyclerView$OnFlingListener()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class SnapHelper$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #24  <Method void SnapHelper$1(SnapHelper)>
	//    7   13:putfield        #26  <Field RecyclerView$OnScrollListener mScrollListener>
	//    8   16:return          
	}

	private void destroyCallbacks()
	{
		mRecyclerView.removeOnScrollListener(mScrollListener);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field RecyclerView$OnScrollListener mScrollListener>
	//    4    8:invokevirtual   #36  <Method void RecyclerView.removeOnScrollListener(RecyclerView$OnScrollListener)>
		mRecyclerView.setOnFlingListener(((RecyclerView.OnFlingListener) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field RecyclerView mRecyclerView>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #40  <Method void RecyclerView.setOnFlingListener(RecyclerView$OnFlingListener)>
	//    9   19:return          
	}

	private void setupCallbacks()
		throws IllegalStateException
	{
		if(mRecyclerView.getOnFlingListener() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView mRecyclerView>
	//*   2    4:invokevirtual   #47  <Method RecyclerView$OnFlingListener RecyclerView.getOnFlingListener()>
	//*   3    7:ifnull          20
		{
			throw new IllegalStateException("An instance of OnFlingListener already set.");
	//    4   10:new             #43  <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #49  <String "An instance of OnFlingListener already set.">
	//    7   16:invokespecial   #52  <Method void IllegalStateException(String)>
	//    8   19:athrow          
		} else
		{
			mRecyclerView.addOnScrollListener(mScrollListener);
	//    9   20:aload_0         
	//   10   21:getfield        #30  <Field RecyclerView mRecyclerView>
	//   11   24:aload_0         
	//   12   25:getfield        #26  <Field RecyclerView$OnScrollListener mScrollListener>
	//   13   28:invokevirtual   #55  <Method void RecyclerView.addOnScrollListener(RecyclerView$OnScrollListener)>
			mRecyclerView.setOnFlingListener(((RecyclerView.OnFlingListener) (this)));
	//   14   31:aload_0         
	//   15   32:getfield        #30  <Field RecyclerView mRecyclerView>
	//   16   35:aload_0         
	//   17   36:invokevirtual   #40  <Method void RecyclerView.setOnFlingListener(RecyclerView$OnFlingListener)>
			return;
	//   18   39:return          
		}
	}

	private boolean snapFromFling(RecyclerView.LayoutManager layoutmanager, int i, int j)
	{
		RecyclerView.SmoothScroller smoothscroller;
		if(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #61  <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #65  <Method RecyclerView$SmoothScroller createScroller(RecyclerView$LayoutManager)>
	//*   8   14:astore          4
			if((smoothscroller = createScroller(layoutmanager)) != null && (i = findTargetSnapPosition(layoutmanager, i, j)) != -1)
	//*   9   16:aload           4
	//*  10   18:ifnull          7
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:invokevirtual   #69  <Method int findTargetSnapPosition(RecyclerView$LayoutManager, int, int)>
	//*  16   28:istore_2        
	//*  17   29:iload_2         
	//*  18   30:iconst_m1       
	//*  19   31:icmpeq          7
			{
				smoothscroller.setTargetPosition(i);
	//   20   34:aload           4
	//   21   36:iload_2         
	//   22   37:invokevirtual   #75  <Method void RecyclerView$SmoothScroller.setTargetPosition(int)>
				layoutmanager.startSmoothScroll(smoothscroller);
	//   23   40:aload_1         
	//   24   41:aload           4
	//   25   43:invokevirtual   #81  <Method void RecyclerView$LayoutManager.startSmoothScroll(RecyclerView$SmoothScroller)>
				return true;
	//   26   46:iconst_1        
	//   27   47:ireturn         
			}
		return false;
	}

	public void attachToRecyclerView(RecyclerView recyclerview)
		throws IllegalStateException
	{
		if(mRecyclerView != recyclerview)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView mRecyclerView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
	//*   4    8:return          
		{
			if(mRecyclerView != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #30  <Field RecyclerView mRecyclerView>
	//*   7   13:ifnull          20
				destroyCallbacks();
	//    8   16:aload_0         
	//    9   17:invokespecial   #87  <Method void destroyCallbacks()>
			mRecyclerView = recyclerview;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #30  <Field RecyclerView mRecyclerView>
			if(mRecyclerView != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #30  <Field RecyclerView mRecyclerView>
	//*  15   29:ifnull          8
			{
				setupCallbacks();
	//   16   32:aload_0         
	//   17   33:invokespecial   #89  <Method void setupCallbacks()>
				mGravityScroller = new Scroller(mRecyclerView.getContext(), ((android.view.animation.Interpolator) (new DecelerateInterpolator())));
	//   18   36:aload_0         
	//   19   37:new             #91  <Class Scroller>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:getfield        #30  <Field RecyclerView mRecyclerView>
	//   23   45:invokevirtual   #95  <Method Context RecyclerView.getContext()>
	//   24   48:new             #97  <Class DecelerateInterpolator>
	//   25   51:dup             
	//   26   52:invokespecial   #98  <Method void DecelerateInterpolator()>
	//   27   55:invokespecial   #101 <Method void Scroller(Context, android.view.animation.Interpolator)>
	//   28   58:putfield        #103 <Field Scroller mGravityScroller>
				snapToTargetExistingView();
	//   29   61:aload_0         
	//   30   62:invokevirtual   #106 <Method void snapToTargetExistingView()>
				return;
	//   31   65:return          
			}
		}
	}

	public abstract int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutmanager, View view);

	public int[] calculateScrollDistance(int i, int j)
	{
		mGravityScroller.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Scroller mGravityScroller>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:ldc1            #111 <Int 0x80000000>
	//    7   10:ldc1            #112 <Int 0x7fffffff>
	//    8   12:ldc1            #111 <Int 0x80000000>
	//    9   14:ldc1            #112 <Int 0x7fffffff>
	//   10   16:invokevirtual   #116 <Method void Scroller.fling(int, int, int, int, int, int, int, int)>
		return (new int[] {
			mGravityScroller.getFinalX(), mGravityScroller.getFinalY()
		});
	//   11   19:iconst_2        
	//   12   20:newarray        int[]
	//   13   22:dup             
	//   14   23:iconst_0        
	//   15   24:aload_0         
	//   16   25:getfield        #103 <Field Scroller mGravityScroller>
	//   17   28:invokevirtual   #120 <Method int Scroller.getFinalX()>
	//   18   31:iastore         
	//   19   32:dup             
	//   20   33:iconst_1        
	//   21   34:aload_0         
	//   22   35:getfield        #103 <Field Scroller mGravityScroller>
	//   23   38:invokevirtual   #123 <Method int Scroller.getFinalY()>
	//   24   41:iastore         
	//   25   42:areturn         
	}

	protected RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutmanager)
	{
		return ((RecyclerView.SmoothScroller) (createSnapScroller(layoutmanager)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #127 <Method LinearSmoothScroller createSnapScroller(RecyclerView$LayoutManager)>
	//    3    5:areturn         
	}

	protected LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutmanager)
	{
		if(!(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #61  <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
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

				protected void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
				{
					view = ((View) (calculateDistanceToFinalSnap(mRecyclerView.getLayoutManager(), view)));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field SnapHelper this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #15  <Field SnapHelper this$0>
				//    4    8:getfield        #34  <Field RecyclerView SnapHelper.mRecyclerView>
				//    5   11:invokevirtual   #40  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
				//    6   14:aload_1         
				//    7   15:invokevirtual   #44  <Method int[] SnapHelper.calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
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
				//   19   32:invokestatic    #50  <Method int Math.abs(int)>
				//   20   35:iload           5
				//   21   37:invokestatic    #50  <Method int Math.abs(int)>
				//   22   40:invokestatic    #54  <Method int Math.max(int, int)>
				//   23   43:invokevirtual   #57  <Method int calculateTimeForDeceleration(int)>
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
				//   32   61:getfield        #61  <Field DecelerateInterpolator mDecelerateInterpolator>
				//   33   64:invokevirtual   #67  <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
				//   34   67:return          
				}

				final SnapHelper this$0;

			
			{
				this$0 = SnapHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SnapHelper this$0>
				super(context);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void LinearSmoothScroller(Context)>
			//    6   10:return          
			}
			}
));
	//    5    9:new             #8   <Class SnapHelper$2>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #30  <Field RecyclerView mRecyclerView>
	//   10   18:invokevirtual   #95  <Method Context RecyclerView.getContext()>
	//   11   21:invokespecial   #132 <Method void SnapHelper$2(SnapHelper, Context)>
	//   12   24:areturn         
	}

	public abstract View findSnapView(RecyclerView.LayoutManager layoutmanager);

	public abstract int findTargetSnapPosition(RecyclerView.LayoutManager layoutmanager, int i, int j);

	public boolean onFling(int i, int j)
	{
		RecyclerView.LayoutManager layoutmanager;
		layoutmanager = mRecyclerView.getLayoutManager();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #141 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    3    7:astore          4
		break MISSING_BLOCK_LABEL_9;
		if(layoutmanager != null && mRecyclerView.getAdapter() != null)
	//*   4    9:aload           4
	//*   5   11:ifnonnull       16
	//*   6   14:iconst_0        
	//*   7   15:ireturn         
	//*   8   16:aload_0         
	//*   9   17:getfield        #30  <Field RecyclerView mRecyclerView>
	//*  10   20:invokevirtual   #145 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
	//*  11   23:ifnull          14
		{
			int k = mRecyclerView.getMinFlingVelocity();
	//   12   26:aload_0         
	//   13   27:getfield        #30  <Field RecyclerView mRecyclerView>
	//   14   30:invokevirtual   #148 <Method int RecyclerView.getMinFlingVelocity()>
	//   15   33:istore_3        
			if((Math.abs(j) > k || Math.abs(i) > k) && snapFromFling(layoutmanager, i, j))
	//*  16   34:iload_2         
	//*  17   35:invokestatic    #154 <Method int Math.abs(int)>
	//*  18   38:iload_3         
	//*  19   39:icmpgt          50
	//*  20   42:iload_1         
	//*  21   43:invokestatic    #154 <Method int Math.abs(int)>
	//*  22   46:iload_3         
	//*  23   47:icmple          14
	//*  24   50:aload_0         
	//*  25   51:aload           4
	//*  26   53:iload_1         
	//*  27   54:iload_2         
	//*  28   55:invokespecial   #156 <Method boolean snapFromFling(RecyclerView$LayoutManager, int, int)>
	//*  29   58:ifeq            14
				return true;
	//   30   61:iconst_1        
	//   31   62:ireturn         
		}
		return false;
	}

	void snapToTargetExistingView()
	{
		RecyclerView.LayoutManager layoutmanager;
		int ai[];
		View view;
		if(mRecyclerView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field RecyclerView mRecyclerView>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #30  <Field RecyclerView mRecyclerView>
	//*   6   12:invokevirtual   #141 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*   7   15:astore_1        
			if((layoutmanager = mRecyclerView.getLayoutManager()) != null && (view = findSnapView(layoutmanager)) != null && ((ai = calculateDistanceToFinalSnap(layoutmanager, view))[0] != 0 || ai[1] != 0))
	//*   8   16:aload_1         
	//*   9   17:ifnull          7
	//*  10   20:aload_0         
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #158 <Method View findSnapView(RecyclerView$LayoutManager)>
	//*  13   25:astore_2        
	//*  14   26:aload_2         
	//*  15   27:ifnull          7
	//*  16   30:aload_0         
	//*  17   31:aload_1         
	//*  18   32:aload_2         
	//*  19   33:invokevirtual   #160 <Method int[] calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
	//*  20   36:astore_1        
	//*  21   37:aload_1         
	//*  22   38:iconst_0        
	//*  23   39:iaload          
	//*  24   40:ifne            49
	//*  25   43:aload_1         
	//*  26   44:iconst_1        
	//*  27   45:iaload          
	//*  28   46:ifeq            7
			{
				mRecyclerView.smoothScrollBy(ai[0], ai[1]);
	//   29   49:aload_0         
	//   30   50:getfield        #30  <Field RecyclerView mRecyclerView>
	//   31   53:aload_1         
	//   32   54:iconst_0        
	//   33   55:iaload          
	//   34   56:aload_1         
	//   35   57:iconst_1        
	//   36   58:iaload          
	//   37   59:invokevirtual   #164 <Method void RecyclerView.smoothScrollBy(int, int)>
				return;
	//   38   62:return          
			}
	}

	static final float MILLISECONDS_PER_INCH = 100F;
	private Scroller mGravityScroller;
	RecyclerView mRecyclerView;
	private final RecyclerView.OnScrollListener mScrollListener = new RecyclerView.OnScrollListener() {

		public void onScrollStateChanged(RecyclerView recyclerview, int i)
		{
			super.onScrollStateChanged(recyclerview, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #24  <Method void RecyclerView$OnScrollListener.onScrollStateChanged(RecyclerView, int)>
			if(i == 0 && mScrolled)
		//*   4    6:iload_2         
		//*   5    7:ifne            29
		//*   6   10:aload_0         
		//*   7   11:getfield        #19  <Field boolean mScrolled>
		//*   8   14:ifeq            29
			{
				mScrolled = false;
		//    9   17:aload_0         
		//   10   18:iconst_0        
		//   11   19:putfield        #19  <Field boolean mScrolled>
				snapToTargetExistingView();
		//   12   22:aload_0         
		//   13   23:getfield        #14  <Field SnapHelper this$0>
		//   14   26:invokevirtual   #27  <Method void SnapHelper.snapToTargetExistingView()>
			}
		//   15   29:return          
		}

		public void onScrolled(RecyclerView recyclerview, int i, int j)
		{
			if(i != 0 || j != 0)
		//*   0    0:iload_2         
		//*   1    1:ifne            8
		//*   2    4:iload_3         
		//*   3    5:ifeq            13
				mScrolled = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #19  <Field boolean mScrolled>
		//    7   13:return          
		}

		boolean mScrolled;
		final SnapHelper this$0;

			
			{
				this$0 = SnapHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SnapHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void RecyclerView$OnScrollListener()>
				mScrolled = false;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #19  <Field boolean mScrolled>
			//    8   14:return          
			}
	}
;
}
