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
	//    1    1:invokespecial   #18  <Method void RecyclerView$OnFlingListener()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class SnapHelper$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #21  <Method void SnapHelper$1(SnapHelper)>
	//    7   13:putfield        #23  <Field RecyclerView$OnScrollListener mScrollListener>
	//    8   16:return          
	}

	private void destroyCallbacks()
	{
		mRecyclerView.removeOnScrollListener(mScrollListener);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field RecyclerView$OnScrollListener mScrollListener>
	//    4    8:invokevirtual   #33  <Method void RecyclerView.removeOnScrollListener(RecyclerView$OnScrollListener)>
		mRecyclerView.setOnFlingListener(((RecyclerView.OnFlingListener) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field RecyclerView mRecyclerView>
	//    7   15:aconst_null     
	//    8   16:invokevirtual   #37  <Method void RecyclerView.setOnFlingListener(RecyclerView$OnFlingListener)>
	//    9   19:return          
	}

	private void setupCallbacks()
		throws IllegalStateException
	{
		if(mRecyclerView.getOnFlingListener() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field RecyclerView mRecyclerView>
	//*   2    4:invokevirtual   #44  <Method RecyclerView$OnFlingListener RecyclerView.getOnFlingListener()>
	//*   3    7:ifnonnull       30
		{
			mRecyclerView.addOnScrollListener(mScrollListener);
	//    4   10:aload_0         
	//    5   11:getfield        #27  <Field RecyclerView mRecyclerView>
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field RecyclerView$OnScrollListener mScrollListener>
	//    8   18:invokevirtual   #47  <Method void RecyclerView.addOnScrollListener(RecyclerView$OnScrollListener)>
			mRecyclerView.setOnFlingListener(((RecyclerView.OnFlingListener) (this)));
	//    9   21:aload_0         
	//   10   22:getfield        #27  <Field RecyclerView mRecyclerView>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #37  <Method void RecyclerView.setOnFlingListener(RecyclerView$OnFlingListener)>
			return;
	//   13   29:return          
		} else
		{
			throw new IllegalStateException("An instance of OnFlingListener already set.");
	//   14   30:new             #40  <Class IllegalStateException>
	//   15   33:dup             
	//   16   34:ldc1            #49  <String "An instance of OnFlingListener already set.">
	//   17   36:invokespecial   #52  <Method void IllegalStateException(String)>
	//   18   39:athrow          
		}
	}

	private boolean snapFromFling(RecyclerView.LayoutManager layoutmanager, int i, int j)
	{
		if(!(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #58  <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		RecyclerView.SmoothScroller smoothscroller = createScroller(layoutmanager);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #62  <Method RecyclerView$SmoothScroller createScroller(RecyclerView$LayoutManager)>
	//    8   14:astore          4
		if(smoothscroller == null)
	//*   9   16:aload           4
	//*  10   18:ifnonnull       23
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		i = findTargetSnapPosition(layoutmanager, i, j);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:invokevirtual   #66  <Method int findTargetSnapPosition(RecyclerView$LayoutManager, int, int)>
	//   18   30:istore_2        
		if(i == -1)
	//*  19   31:iload_2         
	//*  20   32:iconst_m1       
	//*  21   33:icmpne          38
		{
			return false;
	//   22   36:iconst_0        
	//   23   37:ireturn         
		} else
		{
			smoothscroller.setTargetPosition(i);
	//   24   38:aload           4
	//   25   40:iload_2         
	//   26   41:invokevirtual   #72  <Method void RecyclerView$SmoothScroller.setTargetPosition(int)>
			layoutmanager.startSmoothScroll(smoothscroller);
	//   27   44:aload_1         
	//   28   45:aload           4
	//   29   47:invokevirtual   #78  <Method void RecyclerView$LayoutManager.startSmoothScroll(RecyclerView$SmoothScroller)>
			return true;
	//   30   50:iconst_1        
	//   31   51:ireturn         
		}
	}

	public void attachToRecyclerView(RecyclerView recyclerview)
		throws IllegalStateException
	{
		RecyclerView recyclerview1 = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview1 == recyclerview)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpne       11
			return;
	//    6   10:return          
		if(recyclerview1 != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          19
			destroyCallbacks();
	//    9   15:aload_0         
	//   10   16:invokespecial   #84  <Method void destroyCallbacks()>
		mRecyclerView = recyclerview;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #27  <Field RecyclerView mRecyclerView>
		if(mRecyclerView != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #27  <Field RecyclerView mRecyclerView>
	//*  16   28:ifnull          64
		{
			setupCallbacks();
	//   17   31:aload_0         
	//   18   32:invokespecial   #86  <Method void setupCallbacks()>
			mGravityScroller = new Scroller(mRecyclerView.getContext(), ((android.view.animation.Interpolator) (new DecelerateInterpolator())));
	//   19   35:aload_0         
	//   20   36:new             #88  <Class Scroller>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:getfield        #27  <Field RecyclerView mRecyclerView>
	//   24   44:invokevirtual   #92  <Method Context RecyclerView.getContext()>
	//   25   47:new             #94  <Class DecelerateInterpolator>
	//   26   50:dup             
	//   27   51:invokespecial   #95  <Method void DecelerateInterpolator()>
	//   28   54:invokespecial   #98  <Method void Scroller(Context, android.view.animation.Interpolator)>
	//   29   57:putfield        #100 <Field Scroller mGravityScroller>
			snapToTargetExistingView();
	//   30   60:aload_0         
	//   31   61:invokevirtual   #103 <Method void snapToTargetExistingView()>
		}
	//   32   64:return          
	}

	public abstract int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutmanager, View view);

	public int[] calculateScrollDistance(int i, int j)
	{
		mGravityScroller.fling(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Scroller mGravityScroller>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:ldc1            #108 <Int 0x80000000>
	//    7   10:ldc1            #109 <Int 0x7fffffff>
	//    8   12:ldc1            #108 <Int 0x80000000>
	//    9   14:ldc1            #109 <Int 0x7fffffff>
	//   10   16:invokevirtual   #113 <Method void Scroller.fling(int, int, int, int, int, int, int, int)>
		return (new int[] {
			mGravityScroller.getFinalX(), mGravityScroller.getFinalY()
		});
	//   11   19:iconst_2        
	//   12   20:newarray        int[]
	//   13   22:dup             
	//   14   23:iconst_0        
	//   15   24:aload_0         
	//   16   25:getfield        #100 <Field Scroller mGravityScroller>
	//   17   28:invokevirtual   #117 <Method int Scroller.getFinalX()>
	//   18   31:iastore         
	//   19   32:dup             
	//   20   33:iconst_1        
	//   21   34:aload_0         
	//   22   35:getfield        #100 <Field Scroller mGravityScroller>
	//   23   38:invokevirtual   #120 <Method int Scroller.getFinalY()>
	//   24   41:iastore         
	//   25   42:areturn         
	}

	protected RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutmanager)
	{
		return ((RecyclerView.SmoothScroller) (createSnapScroller(layoutmanager)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #124 <Method LinearSmoothScroller createSnapScroller(RecyclerView$LayoutManager)>
	//    3    5:areturn         
	}

	protected LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutmanager)
	{
		if(!(layoutmanager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #58  <Class RecyclerView$SmoothScroller$ScrollVectorProvider>
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
					if(mRecyclerView == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #15  <Field SnapHelper this$0>
				//*   2    4:getfield        #34  <Field RecyclerView SnapHelper.mRecyclerView>
				//*   3    7:ifnonnull       11
						return;
				//    4   10:return          
					state = ((RecyclerView.State) (SnapHelper.this));
				//    5   11:aload_0         
				//    6   12:getfield        #15  <Field SnapHelper this$0>
				//    7   15:astore_2        
					view = ((View) (((SnapHelper) (state)).calculateDistanceToFinalSnap(((SnapHelper) (state)).mRecyclerView.getLayoutManager(), view)));
				//    8   16:aload_2         
				//    9   17:aload_2         
				//   10   18:getfield        #34  <Field RecyclerView SnapHelper.mRecyclerView>
				//   11   21:invokevirtual   #40  <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
				//   12   24:aload_1         
				//   13   25:invokevirtual   #44  <Method int[] SnapHelper.calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
				//   14   28:astore_1        
					int i = view[0];
				//   15   29:aload_1         
				//   16   30:iconst_0        
				//   17   31:iaload          
				//   18   32:istore          4
					int j = view[1];
				//   19   34:aload_1         
				//   20   35:iconst_1        
				//   21   36:iaload          
				//   22   37:istore          5
					int k = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(j)));
				//   23   39:aload_0         
				//   24   40:iload           4
				//   25   42:invokestatic    #50  <Method int Math.abs(int)>
				//   26   45:iload           5
				//   27   47:invokestatic    #50  <Method int Math.abs(int)>
				//   28   50:invokestatic    #54  <Method int Math.max(int, int)>
				//   29   53:invokevirtual   #57  <Method int calculateTimeForDeceleration(int)>
				//   30   56:istore          6
					if(k > 0)
				//*  31   58:iload           6
				//*  32   60:ifle            77
						action.update(i, j, k, ((android.view.animation.Interpolator) (mDecelerateInterpolator)));
				//   33   63:aload_3         
				//   34   64:iload           4
				//   35   66:iload           5
				//   36   68:iload           6
				//   37   70:aload_0         
				//   38   71:getfield        #61  <Field DecelerateInterpolator mDecelerateInterpolator>
				//   39   74:invokevirtual   #67  <Method void RecyclerView$SmoothScroller$Action.update(int, int, int, android.view.animation.Interpolator)>
				//   40   77:return          
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
	//    9   15:getfield        #27  <Field RecyclerView mRecyclerView>
	//   10   18:invokevirtual   #92  <Method Context RecyclerView.getContext()>
	//   11   21:invokespecial   #129 <Method void SnapHelper$2(SnapHelper, Context)>
	//   12   24:areturn         
	}

	public abstract View findSnapView(RecyclerView.LayoutManager layoutmanager);

	public abstract int findTargetSnapPosition(RecyclerView.LayoutManager layoutmanager, int i, int j);

	public boolean onFling(int i, int j)
	{
		boolean flag;
label0:
		{
			RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #138 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    3    7:astore          6
			boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore          5
			if(layoutmanager == null)
	//*   6   12:aload           6
	//*   7   14:ifnonnull       19
				return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
			if(mRecyclerView.getAdapter() == null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #27  <Field RecyclerView mRecyclerView>
	//*  12   23:invokevirtual   #142 <Method RecyclerView$Adapter RecyclerView.getAdapter()>
	//*  13   26:ifnonnull       31
				return false;
	//   14   29:iconst_0        
	//   15   30:ireturn         
			int k = mRecyclerView.getMinFlingVelocity();
	//   16   31:aload_0         
	//   17   32:getfield        #27  <Field RecyclerView mRecyclerView>
	//   18   35:invokevirtual   #145 <Method int RecyclerView.getMinFlingVelocity()>
	//   19   38:istore_3        
			if(Math.abs(j) <= k)
	//*  20   39:iload_2         
	//*  21   40:invokestatic    #151 <Method int Math.abs(int)>
	//*  22   43:iload_3         
	//*  23   44:icmpgt          59
			{
				flag = flag1;
	//   24   47:iload           5
	//   25   49:istore          4
				if(Math.abs(i) <= k)
					break label0;
	//   26   51:iload_1         
	//   27   52:invokestatic    #151 <Method int Math.abs(int)>
	//   28   55:iload_3         
	//   29   56:icmple          77
			}
			flag = flag1;
	//   30   59:iload           5
	//   31   61:istore          4
			if(snapFromFling(layoutmanager, i, j))
	//*  32   63:aload_0         
	//*  33   64:aload           6
	//*  34   66:iload_1         
	//*  35   67:iload_2         
	//*  36   68:invokespecial   #153 <Method boolean snapFromFling(RecyclerView$LayoutManager, int, int)>
	//*  37   71:ifeq            77
				flag = true;
	//   38   74:iconst_1        
	//   39   75:istore          4
		}
		return flag;
	//   40   77:iload           4
	//   41   79:ireturn         
	}

	void snapToTargetExistingView()
	{
		Object obj = ((Object) (mRecyclerView));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field RecyclerView mRecyclerView>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		obj = ((Object) (((RecyclerView) (obj)).getLayoutManager()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #138 <Method RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    8   14:astore_1        
		if(obj == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       20
			return;
	//   11   19:return          
		View view = findSnapView(((RecyclerView.LayoutManager) (obj)));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #155 <Method View findSnapView(RecyclerView$LayoutManager)>
	//   15   25:astore_2        
		if(view == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       31
			return;
	//   18   30:return          
		int ai[] = calculateDistanceToFinalSnap(((RecyclerView.LayoutManager) (obj)), view);
	//   19   31:aload_0         
	//   20   32:aload_1         
	//   21   33:aload_2         
	//   22   34:invokevirtual   #157 <Method int[] calculateDistanceToFinalSnap(RecyclerView$LayoutManager, View)>
	//   23   37:astore_1        
		if(ai[0] != 0 || ai[1] != 0)
	//*  24   38:aload_1         
	//*  25   39:iconst_0        
	//*  26   40:iaload          
	//*  27   41:ifne            50
	//*  28   44:aload_1         
	//*  29   45:iconst_1        
	//*  30   46:iaload          
	//*  31   47:ifeq            63
			mRecyclerView.smoothScrollBy(ai[0], ai[1]);
	//   32   50:aload_0         
	//   33   51:getfield        #27  <Field RecyclerView mRecyclerView>
	//   34   54:aload_1         
	//   35   55:iconst_0        
	//   36   56:iaload          
	//   37   57:aload_1         
	//   38   58:iconst_1        
	//   39   59:iaload          
	//   40   60:invokevirtual   #161 <Method void RecyclerView.smoothScrollBy(int, int)>
	//   41   63:return          
	}

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
