// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			ScrollbarHelper, OrientationHelper, ViewBoundsCheck, LinearSmoothScroller, 
//			RecyclerView

public class LinearLayoutManager extends RecyclerView.LayoutManager
	implements RecyclerView.SmoothScroller.ScrollVectorProvider, android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler
{

	public LinearLayoutManager(Context context)
	{
		this(context, 1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iconst_0        
	//    4    4:invokespecial   #49  <Method void LinearLayoutManager(Context, int, boolean)>
	//    5    7:return          
	}

	public LinearLayoutManager(Context context, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void RecyclerView$LayoutManager()>
		mOrientation = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #55  <Field int mOrientation>
		mReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #57  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #59  <Field boolean mShouldReverseLayout>
		mStackFromEnd = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #61  <Field boolean mStackFromEnd>
		mSmoothScrollbarEnabled = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #63  <Field boolean mSmoothScrollbarEnabled>
		mPendingScrollPosition = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #65  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   20   34:aload_0         
	//   21   35:ldc1            #15  <Int 0x80000000>
	//   22   37:putfield        #67  <Field int mPendingScrollPositionOffset>
		mPendingSavedState = null;
	//   23   40:aload_0         
	//   24   41:aconst_null     
	//   25   42:putfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo = new AnchorInfo();
	//   26   45:aload_0         
	//   27   46:new             #71  <Class LinearLayoutManager$AnchorInfo>
	//   28   49:dup             
	//   29   50:invokespecial   #72  <Method void LinearLayoutManager$AnchorInfo()>
	//   30   53:putfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
		mLayoutChunkResult = new LayoutChunkResult();
	//   31   56:aload_0         
	//   32   57:new             #76  <Class LinearLayoutManager$LayoutChunkResult>
	//   33   60:dup             
	//   34   61:invokespecial   #77  <Method void LinearLayoutManager$LayoutChunkResult()>
	//   35   64:putfield        #79  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
		mInitialPrefetchItemCount = 2;
	//   36   67:aload_0         
	//   37   68:iconst_2        
	//   38   69:putfield        #81  <Field int mInitialPrefetchItemCount>
		setOrientation(i);
	//   39   72:aload_0         
	//   40   73:iload_2         
	//   41   74:invokevirtual   #85  <Method void setOrientation(int)>
		setReverseLayout(flag);
	//   42   77:aload_0         
	//   43   78:iload_3         
	//   44   79:invokevirtual   #89  <Method void setReverseLayout(boolean)>
	//   45   82:return          
	}

	public LinearLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void RecyclerView$LayoutManager()>
		mOrientation = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #55  <Field int mOrientation>
		mReverseLayout = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #57  <Field boolean mReverseLayout>
		mShouldReverseLayout = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #59  <Field boolean mShouldReverseLayout>
		mStackFromEnd = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #61  <Field boolean mStackFromEnd>
		mSmoothScrollbarEnabled = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #63  <Field boolean mSmoothScrollbarEnabled>
		mPendingScrollPosition = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #65  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//   20   34:aload_0         
	//   21   35:ldc1            #15  <Int 0x80000000>
	//   22   37:putfield        #67  <Field int mPendingScrollPositionOffset>
		mPendingSavedState = null;
	//   23   40:aload_0         
	//   24   41:aconst_null     
	//   25   42:putfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mAnchorInfo = new AnchorInfo();
	//   26   45:aload_0         
	//   27   46:new             #71  <Class LinearLayoutManager$AnchorInfo>
	//   28   49:dup             
	//   29   50:invokespecial   #72  <Method void LinearLayoutManager$AnchorInfo()>
	//   30   53:putfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
		mLayoutChunkResult = new LayoutChunkResult();
	//   31   56:aload_0         
	//   32   57:new             #76  <Class LinearLayoutManager$LayoutChunkResult>
	//   33   60:dup             
	//   34   61:invokespecial   #77  <Method void LinearLayoutManager$LayoutChunkResult()>
	//   35   64:putfield        #79  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
		mInitialPrefetchItemCount = 2;
	//   36   67:aload_0         
	//   37   68:iconst_2        
	//   38   69:putfield        #81  <Field int mInitialPrefetchItemCount>
		context = ((Context) (getProperties(context, attributeset, i, j)));
	//   39   72:aload_1         
	//   40   73:aload_2         
	//   41   74:iload_3         
	//   42   75:iload           4
	//   43   77:invokestatic    #94  <Method RecyclerView$LayoutManager$Properties getProperties(Context, AttributeSet, int, int)>
	//   44   80:astore_1        
		setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
	//   45   81:aload_0         
	//   46   82:aload_1         
	//   47   83:getfield        #99  <Field int RecyclerView$LayoutManager$Properties.orientation>
	//   48   86:invokevirtual   #85  <Method void setOrientation(int)>
		setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
	//   49   89:aload_0         
	//   50   90:aload_1         
	//   51   91:getfield        #102 <Field boolean RecyclerView$LayoutManager$Properties.reverseLayout>
	//   52   94:invokevirtual   #89  <Method void setReverseLayout(boolean)>
		setStackFromEnd(((RecyclerView.LayoutManager.Properties) (context)).stackFromEnd);
	//   53   97:aload_0         
	//   54   98:aload_1         
	//   55   99:getfield        #105 <Field boolean RecyclerView$LayoutManager$Properties.stackFromEnd>
	//   56  102:invokevirtual   #108 <Method void setStackFromEnd(boolean)>
	//   57  105:return          
	}

	private int computeScrollExtent(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #114 <Method int getChildCount()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #117 <Method void ensureLayoutState()>
			return ScrollbarHelper.computeScrollExtent(state, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #123 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #126 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   27   45:invokestatic    #131 <Method int ScrollbarHelper.computeScrollExtent(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   28   48:ireturn         
		}
	}

	private int computeScrollOffset(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #114 <Method int getChildCount()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #117 <Method void ensureLayoutState()>
			return ScrollbarHelper.computeScrollOffset(state, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled, mShouldReverseLayout);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #123 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #126 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   27   45:aload_0         
	//   28   46:getfield        #59  <Field boolean mShouldReverseLayout>
	//   29   49:invokestatic    #135 <Method int ScrollbarHelper.computeScrollOffset(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean, boolean)>
	//   30   52:ireturn         
		}
	}

	private int computeScrollRange(RecyclerView.State state)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #114 <Method int getChildCount()>
	//*   2    4:ifne            9
		{
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			ensureLayoutState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #117 <Method void ensureLayoutState()>
			return ScrollbarHelper.computeScrollRange(state, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), ((RecyclerView.LayoutManager) (this)), mSmoothScrollbarEnabled);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   13   23:iconst_1        
	//   14   24:ixor            
	//   15   25:iconst_1        
	//   16   26:invokespecial   #123 <Method View findFirstVisibleChildClosestToStart(boolean, boolean)>
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   20   34:iconst_1        
	//   21   35:ixor            
	//   22   36:iconst_1        
	//   23   37:invokespecial   #126 <Method View findFirstVisibleChildClosestToEnd(boolean, boolean)>
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//   27   45:invokestatic    #138 <Method int ScrollbarHelper.computeScrollRange(RecyclerView$State, OrientationHelper, View, View, RecyclerView$LayoutManager, boolean)>
	//   28   48:ireturn         
		}
	}

	private View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #114 <Method int getChildCount()>
	//    4    6:invokevirtual   #144 <Method View findOnePartiallyOrCompletelyInvisibleChild(int, int)>
	//    5    9:areturn         
	}

	private View findFirstReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:aload_0         
	//    5    5:invokevirtual   #114 <Method int getChildCount()>
	//    6    8:aload_2         
	//    7    9:invokevirtual   #150 <Method int RecyclerView$State.getItemCount()>
	//    8   12:invokevirtual   #154 <Method View findReferenceChild(RecyclerView$Recycler, RecyclerView$State, int, int, int)>
	//    9   15:areturn         
	}

	private View findFirstVisibleChildClosestToEnd(boolean flag, boolean flag1)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            19
			return findOneVisibleChild(0, getChildCount(), flag, flag1);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:invokevirtual   #114 <Method int getChildCount()>
	//    7   13:iload_1         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #158 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   10   18:areturn         
		else
			return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:invokevirtual   #114 <Method int getChildCount()>
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:iconst_m1       
	//   17   27:iload_1         
	//   18   28:iload_2         
	//   19   29:invokevirtual   #158 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   20   32:areturn         
	}

	private View findFirstVisibleChildClosestToStart(boolean flag, boolean flag1)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            21
			return findOneVisibleChild(getChildCount() - 1, -1, flag, flag1);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #114 <Method int getChildCount()>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:iconst_m1       
	//    9   15:iload_1         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #158 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   12   20:areturn         
		else
			return findOneVisibleChild(0, getChildCount(), flag, flag1);
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:aload_0         
	//   16   24:invokevirtual   #114 <Method int getChildCount()>
	//   17   27:iload_1         
	//   18   28:iload_2         
	//   19   29:invokevirtual   #158 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//   20   32:areturn         
	}

	private View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #114 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:invokevirtual   #144 <Method View findOnePartiallyOrCompletelyInvisibleChild(int, int)>
	//    7   11:areturn         
	}

	private View findLastReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #114 <Method int getChildCount()>
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:iconst_m1       
	//    8   10:aload_2         
	//    9   11:invokevirtual   #150 <Method int RecyclerView$State.getItemCount()>
	//   10   14:invokevirtual   #154 <Method View findReferenceChild(RecyclerView$Recycler, RecyclerView$State, int, int, int)>
	//   11   17:areturn         
	}

	private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findFirstPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #163 <Method View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findLastPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #165 <Method View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findLastPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #165 <Method View findLastPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findFirstPartiallyOrCompletelyInvisibleChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #163 <Method View findFirstPartiallyOrCompletelyInvisibleChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findReferenceChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findFirstReferenceChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #169 <Method View findFirstReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findLastReferenceChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #171 <Method View findLastReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private View findReferenceChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            14
			return findLastReferenceChild(recycler, state);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #171 <Method View findLastReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//    7   13:areturn         
		else
			return findFirstReferenceChild(recycler, state);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #169 <Method View findFirstReferenceChild(RecyclerView$Recycler, RecyclerView$State)>
	//   12   20:areturn         
	}

	private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int j = mOrientationHelper.getEndAfterPadding() - i;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//    3    7:iload_1         
	//    4    8:isub            
	//    5    9:istore          5
		if(j > 0)
	//*   6   11:iload           5
	//*   7   13:ifle            66
		{
			j = -scrollBy(-j, recycler, state);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:ineg            
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #183 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   14   25:ineg            
	//   15   26:istore          5
			if(flag)
	//*  16   28:iload           4
	//*  17   30:ifeq            63
			{
				i = mOrientationHelper.getEndAfterPadding() - (i + j);
	//   18   33:aload_0         
	//   19   34:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   20   37:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//   21   40:iload_1         
	//   22   41:iload           5
	//   23   43:iadd            
	//   24   44:isub            
	//   25   45:istore_1        
				if(i > 0)
	//*  26   46:iload_1         
	//*  27   47:ifle            63
				{
					mOrientationHelper.offsetChildren(i);
	//   28   50:aload_0         
	//   29   51:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   30   54:iload_1         
	//   31   55:invokevirtual   #186 <Method void OrientationHelper.offsetChildren(int)>
					return i + j;
	//   32   58:iload_1         
	//   33   59:iload           5
	//   34   61:iadd            
	//   35   62:ireturn         
				}
			}
			return j;
	//   36   63:iload           5
	//   37   65:ireturn         
		} else
		{
			return 0;
	//   38   66:iconst_0        
	//   39   67:ireturn         
		}
	}

	private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
	{
		int j = i - mOrientationHelper.getStartAfterPadding();
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    3    5:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//    4    8:isub            
	//    5    9:istore          5
		if(j > 0)
	//*   6   11:iload           5
	//*   7   13:ifle            66
		{
			j = -scrollBy(j, recycler, state);
	//    8   16:aload_0         
	//    9   17:iload           5
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokevirtual   #183 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   13   24:ineg            
	//   14   25:istore          5
			if(flag)
	//*  15   27:iload           4
	//*  16   29:ifeq            63
			{
				i = (i + j) - mOrientationHelper.getStartAfterPadding();
	//   17   32:iload_1         
	//   18   33:iload           5
	//   19   35:iadd            
	//   20   36:aload_0         
	//   21   37:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   22   40:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//   23   43:isub            
	//   24   44:istore_1        
				if(i > 0)
	//*  25   45:iload_1         
	//*  26   46:ifle            63
				{
					mOrientationHelper.offsetChildren(-i);
	//   27   49:aload_0         
	//   28   50:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   29   53:iload_1         
	//   30   54:ineg            
	//   31   55:invokevirtual   #186 <Method void OrientationHelper.offsetChildren(int)>
					return j - i;
	//   32   58:iload           5
	//   33   60:iload_1         
	//   34   61:isub            
	//   35   62:ireturn         
				}
			}
			return j;
	//   36   63:iload           5
	//   37   65:ireturn         
		} else
		{
			return 0;
	//   38   66:iconst_0        
	//   39   67:ireturn         
		}
	}

	private View getChildClosestToEnd()
	{
		int i;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            19
			i = getChildCount() - 1;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #114 <Method int getChildCount()>
	//    8   16:iconst_1        
	//    9   17:isub            
	//   10   18:istore_1        
		return getChildAt(i);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #196 <Method View getChildAt(int)>
	//   14   24:areturn         
	}

	private View getChildClosestToStart()
	{
		int i;
		if(mShouldReverseLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   2    4:ifeq            17
			i = getChildCount() - 1;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #114 <Method int getChildCount()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore_1        
		else
	//*   8   14:goto            19
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_1        
		return getChildAt(i);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #196 <Method View getChildAt(int)>
	//   14   24:areturn         
	}

	private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j)
	{
		if(state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #203 <Method boolean RecyclerView$State.willRunPredictiveAnimations()>
	//*   2    4:ifeq            313
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #114 <Method int getChildCount()>
	//*   5   11:ifeq            313
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #206 <Method boolean RecyclerView$State.isPreLayout()>
	//*   8   18:ifne            313
		{
			if(!supportsPredictiveItemAnimations())
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #209 <Method boolean supportsPredictiveItemAnimations()>
	//*  11   25:ifne            29
				return;
	//   12   28:return          
			List list = recycler.getScrapList();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #215 <Method List RecyclerView$Recycler.getScrapList()>
	//   15   33:astore          13
			int j1 = list.size();
	//   16   35:aload           13
	//   17   37:invokeinterface #220 <Method int List.size()>
	//   18   42:istore          9
			int k1 = getPosition(getChildAt(0));
	//   19   44:aload_0         
	//   20   45:aload_0         
	//   21   46:iconst_0        
	//   22   47:invokevirtual   #196 <Method View getChildAt(int)>
	//   23   50:invokevirtual   #224 <Method int getPosition(View)>
	//   24   53:istore          10
			int k = 0;
	//   25   55:iconst_0        
	//   26   56:istore          5
			int i1 = 0;
	//   27   58:iconst_0        
	//   28   59:istore          7
			int l = 0;
	//   29   61:iconst_0        
	//   30   62:istore          6
			for(; k < j1; k++)
	//*  31   64:iload           5
	//*  32   66:iload           9
	//*  33   68:icmpge          186
			{
				RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)list.get(k);
	//   34   71:aload           13
	//   35   73:iload           5
	//   36   75:invokeinterface #228 <Method Object List.get(int)>
	//   37   80:checkcast       #230 <Class RecyclerView$ViewHolder>
	//   38   83:astore          14
				if(viewholder.isRemoved())
	//*  39   85:aload           14
	//*  40   87:invokevirtual   #233 <Method boolean RecyclerView$ViewHolder.isRemoved()>
	//*  41   90:ifeq            96
					continue;
	//   42   93:goto            177
				int l1 = viewholder.getLayoutPosition();
	//   43   96:aload           14
	//   44   98:invokevirtual   #236 <Method int RecyclerView$ViewHolder.getLayoutPosition()>
	//   45  101:istore          11
				byte byte0 = 1;
	//   46  103:iconst_1        
	//   47  104:istore          8
				boolean flag;
				if(l1 < k1)
	//*  48  106:iload           11
	//*  49  108:iload           10
	//*  50  110:icmpge          119
					flag = true;
	//   51  113:iconst_1        
	//   52  114:istore          12
				else
	//*  53  116:goto            122
					flag = false;
	//   54  119:iconst_0        
	//   55  120:istore          12
				if(flag != mShouldReverseLayout)
	//*  56  122:iload           12
	//*  57  124:aload_0         
	//*  58  125:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  59  128:icmpeq          134
					byte0 = -1;
	//   60  131:iconst_m1       
	//   61  132:istore          8
				if(byte0 == -1)
	//*  62  134:iload           8
	//*  63  136:iconst_m1       
	//*  64  137:icmpne          160
					i1 += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
	//   65  140:iload           7
	//   66  142:aload_0         
	//   67  143:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   68  146:aload           14
	//   69  148:getfield        #240 <Field View RecyclerView$ViewHolder.itemView>
	//   70  151:invokevirtual   #243 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   71  154:iadd            
	//   72  155:istore          7
				else
	//*  73  157:goto            177
					l += mOrientationHelper.getDecoratedMeasurement(viewholder.itemView);
	//   74  160:iload           6
	//   75  162:aload_0         
	//   76  163:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   77  166:aload           14
	//   78  168:getfield        #240 <Field View RecyclerView$ViewHolder.itemView>
	//   79  171:invokevirtual   #243 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   80  174:iadd            
	//   81  175:istore          6
			}

	//   82  177:iload           5
	//   83  179:iconst_1        
	//   84  180:iadd            
	//   85  181:istore          5
	//*  86  183:goto            64
			mLayoutState.mScrapList = list;
	//   87  186:aload_0         
	//   88  187:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   89  190:aload           13
	//   90  192:putfield        #251 <Field List LinearLayoutManager$LayoutState.mScrapList>
			if(i1 > 0)
	//*  91  195:iload           7
	//*  92  197:ifle            249
			{
				updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
	//   93  200:aload_0         
	//   94  201:aload_0         
	//   95  202:aload_0         
	//   96  203:invokespecial   #253 <Method View getChildClosestToStart()>
	//   97  206:invokevirtual   #224 <Method int getPosition(View)>
	//   98  209:iload_3         
	//   99  210:invokespecial   #257 <Method void updateLayoutStateToFillStart(int, int)>
				LayoutState layoutstate = mLayoutState;
	//  100  213:aload_0         
	//  101  214:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  102  217:astore          13
				layoutstate.mExtra = i1;
	//  103  219:aload           13
	//  104  221:iload           7
	//  105  223:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
				layoutstate.mAvailable = 0;
	//  106  226:aload           13
	//  107  228:iconst_0        
	//  108  229:putfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
				layoutstate.assignPositionFromScrapList();
	//  109  232:aload           13
	//  110  234:invokevirtual   #266 <Method void LinearLayoutManager$LayoutState.assignPositionFromScrapList()>
				fill(recycler, mLayoutState, state, false);
	//  111  237:aload_0         
	//  112  238:aload_1         
	//  113  239:aload_0         
	//  114  240:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  115  243:aload_2         
	//  116  244:iconst_0        
	//  117  245:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  118  248:pop             
			}
			if(l > 0)
	//* 119  249:iload           6
	//* 120  251:ifle            304
			{
				updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), j);
	//  121  254:aload_0         
	//  122  255:aload_0         
	//  123  256:aload_0         
	//  124  257:invokespecial   #272 <Method View getChildClosestToEnd()>
	//  125  260:invokevirtual   #224 <Method int getPosition(View)>
	//  126  263:iload           4
	//  127  265:invokespecial   #275 <Method void updateLayoutStateToFillEnd(int, int)>
				LayoutState layoutstate1 = mLayoutState;
	//  128  268:aload_0         
	//  129  269:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  130  272:astore          13
				layoutstate1.mExtra = l;
	//  131  274:aload           13
	//  132  276:iload           6
	//  133  278:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
				layoutstate1.mAvailable = 0;
	//  134  281:aload           13
	//  135  283:iconst_0        
	//  136  284:putfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
				layoutstate1.assignPositionFromScrapList();
	//  137  287:aload           13
	//  138  289:invokevirtual   #266 <Method void LinearLayoutManager$LayoutState.assignPositionFromScrapList()>
				fill(recycler, mLayoutState, state, false);
	//  139  292:aload_0         
	//  140  293:aload_1         
	//  141  294:aload_0         
	//  142  295:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  143  298:aload_2         
	//  144  299:iconst_0        
	//  145  300:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  146  303:pop             
			}
			mLayoutState.mScrapList = null;
	//  147  304:aload_0         
	//  148  305:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  149  308:aconst_null     
	//  150  309:putfield        #251 <Field List LinearLayoutManager$LayoutState.mScrapList>
			return;
	//  151  312:return          
		} else
		{
			return;
	//  152  313:return          
		}
	}

	private void logChildren()
	{
		Log.d("LinearLayoutManager", "internal representation of views on the screen");
	//    0    0:ldc1            #22  <String "LinearLayoutManager">
	//    1    2:ldc2            #278 <String "internal representation of views on the screen">
	//    2    5:invokestatic    #284 <Method int Log.d(String, String)>
	//    3    8:pop             
		for(int i = 0; i < getChildCount(); i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_1        
	//*   6   11:iload_1         
	//*   7   12:aload_0         
	//*   8   13:invokevirtual   #114 <Method int getChildCount()>
	//*   9   16:icmpge          89
		{
			View view = getChildAt(i);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #196 <Method View getChildAt(int)>
	//   13   24:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   25:new             #286 <Class StringBuilder>
	//   15   28:dup             
	//   16   29:invokespecial   #287 <Method void StringBuilder()>
	//   17   32:astore_3        
			stringbuilder.append("item ");
	//   18   33:aload_3         
	//   19   34:ldc2            #289 <String "item ">
	//   20   37:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(getPosition(view));
	//   22   41:aload_3         
	//   23   42:aload_0         
	//   24   43:aload_2         
	//   25   44:invokevirtual   #224 <Method int getPosition(View)>
	//   26   47:invokevirtual   #296 <Method StringBuilder StringBuilder.append(int)>
	//   27   50:pop             
			stringbuilder.append(", coord:");
	//   28   51:aload_3         
	//   29   52:ldc2            #298 <String ", coord:">
	//   30   55:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
			stringbuilder.append(mOrientationHelper.getDecoratedStart(view));
	//   32   59:aload_3         
	//   33   60:aload_0         
	//   34   61:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   35   64:aload_2         
	//   36   65:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//   37   68:invokevirtual   #296 <Method StringBuilder StringBuilder.append(int)>
	//   38   71:pop             
			Log.d("LinearLayoutManager", stringbuilder.toString());
	//   39   72:ldc1            #22  <String "LinearLayoutManager">
	//   40   74:aload_3         
	//   41   75:invokevirtual   #305 <Method String StringBuilder.toString()>
	//   42   78:invokestatic    #284 <Method int Log.d(String, String)>
	//   43   81:pop             
		}

	//   44   82:iload_1         
	//   45   83:iconst_1        
	//   46   84:iadd            
	//   47   85:istore_1        
	//*  48   86:goto            11
		Log.d("LinearLayoutManager", "==============");
	//   49   89:ldc1            #22  <String "LinearLayoutManager">
	//   50   91:ldc2            #307 <String "==============">
	//   51   94:invokestatic    #284 <Method int Log.d(String, String)>
	//   52   97:pop             
	//   53   98:return          
	}

	private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutstate)
	{
		if(layoutstate.mRecycle)
	//*   0    0:aload_2         
	//*   1    1:getfield        #312 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
	//*   2    4:ifeq            43
		{
			if(layoutstate.mInfinite)
	//*   3    7:aload_2         
	//*   4    8:getfield        #315 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			if(layoutstate.mLayoutDirection == -1)
	//*   7   15:aload_2         
	//*   8   16:getfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          33
			{
				recycleViewsFromEnd(recycler, layoutstate.mScrollingOffset);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   15   29:invokespecial   #325 <Method void recycleViewsFromEnd(RecyclerView$Recycler, int)>
				return;
	//   16   32:return          
			} else
			{
				recycleViewsFromStart(recycler, layoutstate.mScrollingOffset);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   21   39:invokespecial   #328 <Method void recycleViewsFromStart(RecyclerView$Recycler, int)>
				return;
	//   22   42:return          
			}
		} else
		{
			return;
	//   23   43:return          
		}
	}

	private void recycleChildren(RecyclerView.Recycler recycler, int i, int j)
	{
		if(i == j)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpne          6
			return;
	//    3    5:return          
		int k = i;
	//    4    6:iload_2         
	//    5    7:istore          4
		if(j > i)
	//*   6    9:iload_3         
	//*   7   10:iload_2         
	//*   8   11:icmple          36
			for(j--; j >= i; j--)
	//*   9   14:iload_3         
	//*  10   15:iconst_1        
	//*  11   16:isub            
	//*  12   17:istore_3        
	//*  13   18:iload_3         
	//*  14   19:iload_2         
	//*  15   20:icmplt          58
				removeAndRecycleViewAt(j, recycler);
	//   16   23:aload_0         
	//   17   24:iload_3         
	//   18   25:aload_1         
	//   19   26:invokevirtual   #334 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

	//   20   29:iload_3         
	//   21   30:iconst_1        
	//   22   31:isub            
	//   23   32:istore_3        
		else
	//*  24   33:goto            18
			for(; k > j; k--)
	//*  25   36:iload           4
	//*  26   38:iload_3         
	//*  27   39:icmple          58
				removeAndRecycleViewAt(k, recycler);
	//   28   42:aload_0         
	//   29   43:iload           4
	//   30   45:aload_1         
	//   31   46:invokevirtual   #334 <Method void removeAndRecycleViewAt(int, RecyclerView$Recycler)>

	//   32   49:iload           4
	//   33   51:iconst_1        
	//   34   52:isub            
	//   35   53:istore          4
	//*  36   55:goto            36
	//   37   58:return          
	}

	private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method int getChildCount()>
	//    2    4:istore_3        
		if(i < 0)
	//*   3    5:iload_2         
	//*   4    6:ifge            10
			return;
	//    5    9:return          
		int k = mOrientationHelper.getEnd() - i;
	//    6   10:aload_0         
	//    7   11:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    8   14:invokevirtual   #337 <Method int OrientationHelper.getEnd()>
	//    9   17:iload_2         
	//   10   18:isub            
	//   11   19:istore          4
		if(mShouldReverseLayout)
	//*  12   21:aload_0         
	//*  13   22:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  14   25:ifeq            88
		{
			for(i = 0; i < j;)
	//*  15   28:iconst_0        
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:iload_3         
	//*  19   32:icmpge          151
			{
				View view = getChildAt(i);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:invokevirtual   #196 <Method View getChildAt(int)>
	//   23   40:astore          5
				if(mOrientationHelper.getDecoratedStart(view) >= k && mOrientationHelper.getTransformedStartWithDecoration(view) >= k)
	//*  24   42:aload_0         
	//*  25   43:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  26   46:aload           5
	//*  27   48:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  28   51:iload           4
	//*  29   53:icmplt          80
	//*  30   56:aload_0         
	//*  31   57:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  32   60:aload           5
	//*  33   62:invokevirtual   #340 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  34   65:iload           4
	//*  35   67:icmpge          73
	//*  36   70:goto            80
				{
					i++;
	//   37   73:iload_2         
	//   38   74:iconst_1        
	//   39   75:iadd            
	//   40   76:istore_2        
				} else
	//*  41   77:goto            30
				{
					recycleChildren(recycler, 0, i);
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:iconst_0        
	//   45   83:iload_2         
	//   46   84:invokespecial   #342 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
					return;
	//   47   87:return          
				}
			}

		} else
		{
			j--;
	//   48   88:iload_3         
	//   49   89:iconst_1        
	//   50   90:isub            
	//   51   91:istore_3        
			for(i = j; i >= 0;)
	//*  52   92:iload_3         
	//*  53   93:istore_2        
	//*  54   94:iload_2         
	//*  55   95:iflt            151
			{
				View view1 = getChildAt(i);
	//   56   98:aload_0         
	//   57   99:iload_2         
	//   58  100:invokevirtual   #196 <Method View getChildAt(int)>
	//   59  103:astore          5
				if(mOrientationHelper.getDecoratedStart(view1) >= k && mOrientationHelper.getTransformedStartWithDecoration(view1) >= k)
	//*  60  105:aload_0         
	//*  61  106:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  62  109:aload           5
	//*  63  111:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  64  114:iload           4
	//*  65  116:icmplt          143
	//*  66  119:aload_0         
	//*  67  120:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  68  123:aload           5
	//*  69  125:invokevirtual   #340 <Method int OrientationHelper.getTransformedStartWithDecoration(View)>
	//*  70  128:iload           4
	//*  71  130:icmpge          136
	//*  72  133:goto            143
				{
					i--;
	//   73  136:iload_2         
	//   74  137:iconst_1        
	//   75  138:isub            
	//   76  139:istore_2        
				} else
	//*  77  140:goto            94
				{
					recycleChildren(recycler, j, i);
	//   78  143:aload_0         
	//   79  144:aload_1         
	//   80  145:iload_3         
	//   81  146:iload_2         
	//   82  147:invokespecial   #342 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
					return;
	//   83  150:return          
				}
			}

		}
	//   84  151:return          
	}

	private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i)
	{
		if(i < 0)
	//*   0    0:iload_2         
	//*   1    1:ifge            5
			return;
	//    2    4:return          
		int l = getChildCount();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #114 <Method int getChildCount()>
	//    5    9:istore          4
		if(mShouldReverseLayout)
	//*   6   11:aload_0         
	//*   7   12:getfield        #59  <Field boolean mShouldReverseLayout>
	//*   8   15:ifeq            83
		{
			l--;
	//    9   18:iload           4
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore          4
			for(int j = l; j >= 0;)
	//*  13   24:iload           4
	//*  14   26:istore_3        
	//*  15   27:iload_3         
	//*  16   28:iflt            142
			{
				View view = getChildAt(j);
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:invokevirtual   #196 <Method View getChildAt(int)>
	//   20   36:astore          5
				if(mOrientationHelper.getDecoratedEnd(view) <= i && mOrientationHelper.getTransformedEndWithDecoration(view) <= i)
	//*  21   38:aload_0         
	//*  22   39:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  23   42:aload           5
	//*  24   44:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  25   47:iload_2         
	//*  26   48:icmpgt          74
	//*  27   51:aload_0         
	//*  28   52:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  29   55:aload           5
	//*  30   57:invokevirtual   #348 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  31   60:iload_2         
	//*  32   61:icmple          67
	//*  33   64:goto            74
				{
					j--;
	//   34   67:iload_3         
	//   35   68:iconst_1        
	//   36   69:isub            
	//   37   70:istore_3        
				} else
	//*  38   71:goto            27
				{
					recycleChildren(recycler, l, j);
	//   39   74:aload_0         
	//   40   75:aload_1         
	//   41   76:iload           4
	//   42   78:iload_3         
	//   43   79:invokespecial   #342 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
					return;
	//   44   82:return          
				}
			}

		} else
		{
			for(int k = 0; k < l;)
	//*  45   83:iconst_0        
	//*  46   84:istore_3        
	//*  47   85:iload_3         
	//*  48   86:iload           4
	//*  49   88:icmpge          142
			{
				View view1 = getChildAt(k);
	//   50   91:aload_0         
	//   51   92:iload_3         
	//   52   93:invokevirtual   #196 <Method View getChildAt(int)>
	//   53   96:astore          5
				if(mOrientationHelper.getDecoratedEnd(view1) <= i && mOrientationHelper.getTransformedEndWithDecoration(view1) <= i)
	//*  54   98:aload_0         
	//*  55   99:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  56  102:aload           5
	//*  57  104:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  58  107:iload_2         
	//*  59  108:icmpgt          134
	//*  60  111:aload_0         
	//*  61  112:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  62  115:aload           5
	//*  63  117:invokevirtual   #348 <Method int OrientationHelper.getTransformedEndWithDecoration(View)>
	//*  64  120:iload_2         
	//*  65  121:icmple          127
	//*  66  124:goto            134
				{
					k++;
	//   67  127:iload_3         
	//   68  128:iconst_1        
	//   69  129:iadd            
	//   70  130:istore_3        
				} else
	//*  71  131:goto            85
				{
					recycleChildren(recycler, 0, k);
	//   72  134:aload_0         
	//   73  135:aload_1         
	//   74  136:iconst_0        
	//   75  137:iload_3         
	//   76  138:invokespecial   #342 <Method void recycleChildren(RecyclerView$Recycler, int, int)>
					return;
	//   77  141:return          
				}
			}

		}
	//   78  142:return          
	}

	private void resolveShouldLayoutReverse()
	{
		if(mOrientation != 1 && isLayoutRTL())
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          29
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #352 <Method boolean isLayoutRTL()>
	//*   6   12:ifne            18
	//*   7   15:goto            29
		{
			mShouldReverseLayout = mReverseLayout ^ true;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #57  <Field boolean mReverseLayout>
	//   11   23:iconst_1        
	//   12   24:ixor            
	//   13   25:putfield        #59  <Field boolean mShouldReverseLayout>
			return;
	//   14   28:return          
		} else
		{
			mShouldReverseLayout = mReverseLayout;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #57  <Field boolean mReverseLayout>
	//   18   34:putfield        #59  <Field boolean mShouldReverseLayout>
			return;
	//   19   37:return          
		}
	}

	private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method int getChildCount()>
	//    2    4:istore          5
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		if(j == 0)
	//*   5    9:iload           5
	//*   6   11:ifne            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		View view = getFocusedChild();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #357 <Method View getFocusedChild()>
	//   11   20:astore          6
		if(view != null && anchorinfo.isViewValidAsAnchor(view, state))
	//*  12   22:aload           6
	//*  13   24:ifnull          51
	//*  14   27:aload_3         
	//*  15   28:aload           6
	//*  16   30:aload_2         
	//*  17   31:invokevirtual   #361 <Method boolean LinearLayoutManager$AnchorInfo.isViewValidAsAnchor(View, RecyclerView$State)>
	//*  18   34:ifeq            51
		{
			anchorinfo.assignFromViewAndKeepVisibleRect(view, getPosition(view));
	//   19   37:aload_3         
	//   20   38:aload           6
	//   21   40:aload_0         
	//   22   41:aload           6
	//   23   43:invokevirtual   #224 <Method int getPosition(View)>
	//   24   46:invokevirtual   #365 <Method void LinearLayoutManager$AnchorInfo.assignFromViewAndKeepVisibleRect(View, int)>
			return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
		}
		if(mLastStackFromEnd != mStackFromEnd)
	//*  27   51:aload_0         
	//*  28   52:getfield        #367 <Field boolean mLastStackFromEnd>
	//*  29   55:aload_0         
	//*  30   56:getfield        #61  <Field boolean mStackFromEnd>
	//*  31   59:icmpeq          64
			return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
		if(anchorinfo.mLayoutFromEnd)
	//*  34   64:aload_3         
	//*  35   65:getfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  36   68:ifeq            81
			recycler = ((RecyclerView.Recycler) (findReferenceChildClosestToEnd(recycler, state)));
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:aload_2         
	//   40   74:invokespecial   #372 <Method View findReferenceChildClosestToEnd(RecyclerView$Recycler, RecyclerView$State)>
	//   41   77:astore_1        
		else
	//*  42   78:goto            88
			recycler = ((RecyclerView.Recycler) (findReferenceChildClosestToStart(recycler, state)));
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:aload_2         
	//   46   84:invokespecial   #374 <Method View findReferenceChildClosestToStart(RecyclerView$Recycler, RecyclerView$State)>
	//   47   87:astore_1        
		if(recycler != null)
	//*  48   88:aload_1         
	//*  49   89:ifnull          196
		{
			anchorinfo.assignFromView(((View) (recycler)), getPosition(((View) (recycler))));
	//   50   92:aload_3         
	//   51   93:aload_1         
	//   52   94:aload_0         
	//   53   95:aload_1         
	//   54   96:invokevirtual   #224 <Method int getPosition(View)>
	//   55   99:invokevirtual   #377 <Method void LinearLayoutManager$AnchorInfo.assignFromView(View, int)>
			if(!state.isPreLayout() && supportsPredictiveItemAnimations())
	//*  56  102:aload_2         
	//*  57  103:invokevirtual   #206 <Method boolean RecyclerView$State.isPreLayout()>
	//*  58  106:ifne            194
	//*  59  109:aload_0         
	//*  60  110:invokevirtual   #209 <Method boolean supportsPredictiveItemAnimations()>
	//*  61  113:ifeq            194
			{
				if(mOrientationHelper.getDecoratedStart(((View) (recycler))) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(((View) (recycler))) < mOrientationHelper.getStartAfterPadding())
	//*  62  116:aload_0         
	//*  63  117:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  64  120:aload_1         
	//*  65  121:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  66  124:aload_0         
	//*  67  125:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  68  128:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//*  69  131:icmpge          152
	//*  70  134:aload_0         
	//*  71  135:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  72  138:aload_1         
	//*  73  139:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  74  142:aload_0         
	//*  75  143:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  76  146:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//*  77  149:icmpge          155
					flag = true;
	//   78  152:iconst_1        
	//   79  153:istore          4
				if(flag)
	//*  80  155:iload           4
	//*  81  157:ifeq            194
				{
					int i;
					if(anchorinfo.mLayoutFromEnd)
	//*  82  160:aload_3         
	//*  83  161:getfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  84  164:ifeq            179
						i = mOrientationHelper.getEndAfterPadding();
	//   85  167:aload_0         
	//   86  168:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   87  171:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//   88  174:istore          4
					else
	//*  89  176:goto            188
						i = mOrientationHelper.getStartAfterPadding();
	//   90  179:aload_0         
	//   91  180:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   92  183:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//   93  186:istore          4
					anchorinfo.mCoordinate = i;
	//   94  188:aload_3         
	//   95  189:iload           4
	//   96  191:putfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
				}
			}
			return true;
	//   97  194:iconst_1        
	//   98  195:ireturn         
		} else
		{
			return false;
	//   99  196:iconst_0        
	//  100  197:ireturn         
		}
	}

	private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
	{
		boolean flag = state.isPreLayout();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #206 <Method boolean RecyclerView$State.isPreLayout()>
	//    2    4:istore          4
		boolean flag3 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(!flag)
	//*   5    9:iload           4
	//*   6   11:ifne            412
		{
			int i = mPendingScrollPosition;
	//    7   14:aload_0         
	//    8   15:getfield        #65  <Field int mPendingScrollPosition>
	//    9   18:istore_3        
			if(i == -1)
	//*  10   19:iload_3         
	//*  11   20:iconst_m1       
	//*  12   21:icmpne          26
				return false;
	//   13   24:iconst_0        
	//   14   25:ireturn         
			if(i >= 0 && i < state.getItemCount())
	//*  15   26:iload_3         
	//*  16   27:iflt            399
	//*  17   30:iload_3         
	//*  18   31:aload_1         
	//*  19   32:invokevirtual   #150 <Method int RecyclerView$State.getItemCount()>
	//*  20   35:icmplt          41
	//*  21   38:goto            399
			{
				anchorinfo.mPosition = mPendingScrollPosition;
	//   22   41:aload_2         
	//   23   42:aload_0         
	//   24   43:getfield        #65  <Field int mPendingScrollPosition>
	//   25   46:putfield        #385 <Field int LinearLayoutManager$AnchorInfo.mPosition>
				state = ((RecyclerView.State) (mPendingSavedState));
	//   26   49:aload_0         
	//   27   50:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   28   53:astore_1        
				if(state != null && ((SavedState) (state)).hasValidAnchor())
	//*  29   54:aload_1         
	//*  30   55:ifnull          125
	//*  31   58:aload_1         
	//*  32   59:invokevirtual   #390 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  33   62:ifeq            125
				{
					anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
	//   34   65:aload_2         
	//   35   66:aload_0         
	//   36   67:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   37   70:getfield        #393 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   38   73:putfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
					if(anchorinfo.mLayoutFromEnd)
	//*  39   76:aload_2         
	//*  40   77:getfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//*  41   80:ifeq            104
					{
						anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingSavedState.mAnchorOffset;
	//   42   83:aload_2         
	//   43   84:aload_0         
	//   44   85:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   45   88:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//   46   91:aload_0         
	//   47   92:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   48   95:getfield        #396 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
	//   49   98:isub            
	//   50   99:putfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
						return true;
	//   51  102:iconst_1        
	//   52  103:ireturn         
					} else
					{
						anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingSavedState.mAnchorOffset;
	//   53  104:aload_2         
	//   54  105:aload_0         
	//   55  106:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   56  109:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//   57  112:aload_0         
	//   58  113:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   59  116:getfield        #396 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
	//   60  119:iadd            
	//   61  120:putfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
						return true;
	//   62  123:iconst_1        
	//   63  124:ireturn         
					}
				}
				if(mPendingScrollPositionOffset == 0x80000000)
	//*  64  125:aload_0         
	//*  65  126:getfield        #67  <Field int mPendingScrollPositionOffset>
	//*  66  129:ldc1            #15  <Int 0x80000000>
	//*  67  131:icmpne          346
				{
					state = ((RecyclerView.State) (findViewByPosition(mPendingScrollPosition)));
	//   68  134:aload_0         
	//   69  135:aload_0         
	//   70  136:getfield        #65  <Field int mPendingScrollPosition>
	//   71  139:invokevirtual   #399 <Method View findViewByPosition(int)>
	//   72  142:astore_1        
					if(state != null)
	//*  73  143:aload_1         
	//*  74  144:ifnull          288
					{
						if(mOrientationHelper.getDecoratedMeasurement(((View) (state))) > mOrientationHelper.getTotalSpace())
	//*  75  147:aload_0         
	//*  76  148:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  77  151:aload_1         
	//*  78  152:invokevirtual   #243 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//*  79  155:aload_0         
	//*  80  156:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  81  159:invokevirtual   #402 <Method int OrientationHelper.getTotalSpace()>
	//*  82  162:icmple          171
						{
							anchorinfo.assignCoordinateFromPadding();
	//   83  165:aload_2         
	//   84  166:invokevirtual   #405 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
							return true;
	//   85  169:iconst_1        
	//   86  170:ireturn         
						}
						if(mOrientationHelper.getDecoratedStart(((View) (state))) - mOrientationHelper.getStartAfterPadding() < 0)
	//*  87  171:aload_0         
	//*  88  172:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  89  175:aload_1         
	//*  90  176:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  91  179:aload_0         
	//*  92  180:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  93  183:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//*  94  186:isub            
	//*  95  187:ifge            208
						{
							anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding();
	//   96  190:aload_2         
	//   97  191:aload_0         
	//   98  192:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   99  195:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//  100  198:putfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
							anchorinfo.mLayoutFromEnd = false;
	//  101  201:aload_2         
	//  102  202:iconst_0        
	//  103  203:putfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
							return true;
	//  104  206:iconst_1        
	//  105  207:ireturn         
						}
						if(mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(((View) (state))) < 0)
	//* 106  208:aload_0         
	//* 107  209:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//* 108  212:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//* 109  215:aload_0         
	//* 110  216:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//* 111  219:aload_1         
	//* 112  220:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//* 113  223:isub            
	//* 114  224:ifge            245
						{
							anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding();
	//  115  227:aload_2         
	//  116  228:aload_0         
	//  117  229:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  118  232:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//  119  235:putfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
							anchorinfo.mLayoutFromEnd = true;
	//  120  238:aload_2         
	//  121  239:iconst_1        
	//  122  240:putfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
							return true;
	//  123  243:iconst_1        
	//  124  244:ireturn         
						}
						int j;
						if(anchorinfo.mLayoutFromEnd)
	//* 125  245:aload_2         
	//* 126  246:getfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 127  249:ifeq            272
							j = mOrientationHelper.getDecoratedEnd(((View) (state))) + mOrientationHelper.getTotalSpaceChange();
	//  128  252:aload_0         
	//  129  253:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  130  256:aload_1         
	//  131  257:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  132  260:aload_0         
	//  133  261:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  134  264:invokevirtual   #408 <Method int OrientationHelper.getTotalSpaceChange()>
	//  135  267:iadd            
	//  136  268:istore_3        
						else
	//* 137  269:goto            281
							j = mOrientationHelper.getDecoratedStart(((View) (state)));
	//  138  272:aload_0         
	//  139  273:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  140  276:aload_1         
	//  141  277:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//  142  280:istore_3        
						anchorinfo.mCoordinate = j;
	//  143  281:aload_2         
	//  144  282:iload_3         
	//  145  283:putfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
						return true;
	//  146  286:iconst_1        
	//  147  287:ireturn         
					}
					if(getChildCount() > 0)
	//* 148  288:aload_0         
	//* 149  289:invokevirtual   #114 <Method int getChildCount()>
	//* 150  292:ifle            340
					{
						int k = getPosition(getChildAt(0));
	//  151  295:aload_0         
	//  152  296:aload_0         
	//  153  297:iconst_0        
	//  154  298:invokevirtual   #196 <Method View getChildAt(int)>
	//  155  301:invokevirtual   #224 <Method int getPosition(View)>
	//  156  304:istore_3        
						boolean flag1;
						if(mPendingScrollPosition < k)
	//* 157  305:aload_0         
	//* 158  306:getfield        #65  <Field int mPendingScrollPosition>
	//* 159  309:iload_3         
	//* 160  310:icmpge          319
							flag1 = true;
	//  161  313:iconst_1        
	//  162  314:istore          4
						else
	//* 163  316:goto            322
							flag1 = false;
	//  164  319:iconst_0        
	//  165  320:istore          4
						if(flag1 == mShouldReverseLayout)
	//* 166  322:iload           4
	//* 167  324:aload_0         
	//* 168  325:getfield        #59  <Field boolean mShouldReverseLayout>
	//* 169  328:icmpne          334
							flag3 = true;
	//  170  331:iconst_1        
	//  171  332:istore          5
						anchorinfo.mLayoutFromEnd = flag3;
	//  172  334:aload_2         
	//  173  335:iload           5
	//  174  337:putfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
					}
					anchorinfo.assignCoordinateFromPadding();
	//  175  340:aload_2         
	//  176  341:invokevirtual   #405 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
					return true;
	//  177  344:iconst_1        
	//  178  345:ireturn         
				}
				boolean flag2 = mShouldReverseLayout;
	//  179  346:aload_0         
	//  180  347:getfield        #59  <Field boolean mShouldReverseLayout>
	//  181  350:istore          4
				anchorinfo.mLayoutFromEnd = flag2;
	//  182  352:aload_2         
	//  183  353:iload           4
	//  184  355:putfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
				if(flag2)
	//* 185  358:iload           4
	//* 186  360:ifeq            381
				{
					anchorinfo.mCoordinate = mOrientationHelper.getEndAfterPadding() - mPendingScrollPositionOffset;
	//  187  363:aload_2         
	//  188  364:aload_0         
	//  189  365:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  190  368:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//  191  371:aload_0         
	//  192  372:getfield        #67  <Field int mPendingScrollPositionOffset>
	//  193  375:isub            
	//  194  376:putfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
					return true;
	//  195  379:iconst_1        
	//  196  380:ireturn         
				} else
				{
					anchorinfo.mCoordinate = mOrientationHelper.getStartAfterPadding() + mPendingScrollPositionOffset;
	//  197  381:aload_2         
	//  198  382:aload_0         
	//  199  383:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  200  386:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//  201  389:aload_0         
	//  202  390:getfield        #67  <Field int mPendingScrollPositionOffset>
	//  203  393:iadd            
	//  204  394:putfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
					return true;
	//  205  397:iconst_1        
	//  206  398:ireturn         
				}
			} else
			{
				mPendingScrollPosition = -1;
	//  207  399:aload_0         
	//  208  400:iconst_m1       
	//  209  401:putfield        #65  <Field int mPendingScrollPosition>
				mPendingScrollPositionOffset = 0x80000000;
	//  210  404:aload_0         
	//  211  405:ldc1            #15  <Int 0x80000000>
	//  212  407:putfield        #67  <Field int mPendingScrollPositionOffset>
				return false;
	//  213  410:iconst_0        
	//  214  411:ireturn         
			}
		} else
		{
			return false;
	//  215  412:iconst_0        
	//  216  413:ireturn         
		}
	}

	private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo)
	{
		if(updateAnchorFromPendingData(state, anchorinfo))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:invokespecial   #412 <Method boolean updateAnchorFromPendingData(RecyclerView$State, LinearLayoutManager$AnchorInfo)>
	//*   4    6:ifeq            10
			return;
	//    5    9:return          
		if(updateAnchorFromChildren(recycler, state, anchorinfo))
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:aload_3         
	//*  10   14:invokespecial   #414 <Method boolean updateAnchorFromChildren(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo)>
	//*  11   17:ifeq            21
			return;
	//   12   20:return          
		anchorinfo.assignCoordinateFromPadding();
	//   13   21:aload_3         
	//   14   22:invokevirtual   #405 <Method void LinearLayoutManager$AnchorInfo.assignCoordinateFromPadding()>
		int i;
		if(mStackFromEnd)
	//*  15   25:aload_0         
	//*  16   26:getfield        #61  <Field boolean mStackFromEnd>
	//*  17   29:ifeq            43
			i = state.getItemCount() - 1;
	//   18   32:aload_2         
	//   19   33:invokevirtual   #150 <Method int RecyclerView$State.getItemCount()>
	//   20   36:iconst_1        
	//   21   37:isub            
	//   22   38:istore          4
		else
	//*  23   40:goto            46
			i = 0;
	//   24   43:iconst_0        
	//   25   44:istore          4
		anchorinfo.mPosition = i;
	//   26   46:aload_3         
	//   27   47:iload           4
	//   28   49:putfield        #385 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//   29   52:return          
	}

	private void updateLayoutState(int i, int j, boolean flag, RecyclerView.State state)
	{
		mLayoutState.mInfinite = resolveIsInfinite();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #419 <Method boolean resolveIsInfinite()>
	//    4    8:putfield        #315 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
		mLayoutState.mExtra = getExtraLayoutSpace(state);
	//    5   11:aload_0         
	//    6   12:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    7   15:aload_0         
	//    8   16:aload           4
	//    9   18:invokevirtual   #422 <Method int getExtraLayoutSpace(RecyclerView$State)>
	//   10   21:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
		state = ((RecyclerView.State) (mLayoutState));
	//   11   24:aload_0         
	//   12   25:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   13   28:astore          4
		state.mLayoutDirection = i;
	//   14   30:aload           4
	//   15   32:iload_1         
	//   16   33:putfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		int k = -1;
	//   17   36:iconst_m1       
	//   18   37:istore          5
		if(i == 1)
	//*  19   39:iload_1         
	//*  20   40:iconst_1        
	//*  21   41:icmpne          152
		{
			state.mExtra = ((LayoutState) (state)).mExtra + mOrientationHelper.getEndPadding();
	//   22   44:aload           4
	//   23   46:aload           4
	//   24   48:getfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   25   51:aload_0         
	//   26   52:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   27   55:invokevirtual   #425 <Method int OrientationHelper.getEndPadding()>
	//   28   58:iadd            
	//   29   59:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
			state = ((RecyclerView.State) (getChildClosestToEnd()));
	//   30   62:aload_0         
	//   31   63:invokespecial   #272 <Method View getChildClosestToEnd()>
	//   32   66:astore          4
			LayoutState layoutstate = mLayoutState;
	//   33   68:aload_0         
	//   34   69:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   35   72:astore          6
			if(!mShouldReverseLayout)
	//*  36   74:aload_0         
	//*  37   75:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  38   78:ifeq            84
	//*  39   81:goto            87
				k = 1;
	//   40   84:iconst_1        
	//   41   85:istore          5
			layoutstate.mItemDirection = k;
	//   42   87:aload           6
	//   43   89:iload           5
	//   44   91:putfield        #428 <Field int LinearLayoutManager$LayoutState.mItemDirection>
			mLayoutState.mCurrentPosition = getPosition(((View) (state))) + mLayoutState.mItemDirection;
	//   45   94:aload_0         
	//   46   95:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   47   98:aload_0         
	//   48   99:aload           4
	//   49  101:invokevirtual   #224 <Method int getPosition(View)>
	//   50  104:aload_0         
	//   51  105:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   52  108:getfield        #428 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//   53  111:iadd            
	//   54  112:putfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			mLayoutState.mOffset = mOrientationHelper.getDecoratedEnd(((View) (state)));
	//   55  115:aload_0         
	//   56  116:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   57  119:aload_0         
	//   58  120:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   59  123:aload           4
	//   60  125:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   61  128:putfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
			i = mOrientationHelper.getDecoratedEnd(((View) (state))) - mOrientationHelper.getEndAfterPadding();
	//   62  131:aload_0         
	//   63  132:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   64  135:aload           4
	//   65  137:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   66  140:aload_0         
	//   67  141:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   68  144:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//   69  147:isub            
	//   70  148:istore_1        
		} else
	//*  71  149:goto            261
		{
			state = ((RecyclerView.State) (getChildClosestToStart()));
	//   72  152:aload_0         
	//   73  153:invokespecial   #253 <Method View getChildClosestToStart()>
	//   74  156:astore          4
			LayoutState layoutstate1 = mLayoutState;
	//   75  158:aload_0         
	//   76  159:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   77  162:astore          6
			layoutstate1.mExtra = layoutstate1.mExtra + mOrientationHelper.getStartAfterPadding();
	//   78  164:aload           6
	//   79  166:aload           6
	//   80  168:getfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   81  171:aload_0         
	//   82  172:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   83  175:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//   84  178:iadd            
	//   85  179:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
			layoutstate1 = mLayoutState;
	//   86  182:aload_0         
	//   87  183:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   88  186:astore          6
			if(mShouldReverseLayout)
	//*  89  188:aload_0         
	//*  90  189:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  91  192:ifeq            198
				k = 1;
	//   92  195:iconst_1        
	//   93  196:istore          5
			layoutstate1.mItemDirection = k;
	//   94  198:aload           6
	//   95  200:iload           5
	//   96  202:putfield        #428 <Field int LinearLayoutManager$LayoutState.mItemDirection>
			mLayoutState.mCurrentPosition = getPosition(((View) (state))) + mLayoutState.mItemDirection;
	//   97  205:aload_0         
	//   98  206:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   99  209:aload_0         
	//  100  210:aload           4
	//  101  212:invokevirtual   #224 <Method int getPosition(View)>
	//  102  215:aload_0         
	//  103  216:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  104  219:getfield        #428 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  105  222:iadd            
	//  106  223:putfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			mLayoutState.mOffset = mOrientationHelper.getDecoratedStart(((View) (state)));
	//  107  226:aload_0         
	//  108  227:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  109  230:aload_0         
	//  110  231:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  111  234:aload           4
	//  112  236:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//  113  239:putfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
			i = -mOrientationHelper.getDecoratedStart(((View) (state))) + mOrientationHelper.getStartAfterPadding();
	//  114  242:aload_0         
	//  115  243:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  116  246:aload           4
	//  117  248:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//  118  251:ineg            
	//  119  252:aload_0         
	//  120  253:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  121  256:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//  122  259:iadd            
	//  123  260:istore_1        
		}
		state = ((RecyclerView.State) (mLayoutState));
	//  124  261:aload_0         
	//  125  262:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  126  265:astore          4
		state.mAvailable = j;
	//  127  267:aload           4
	//  128  269:iload_2         
	//  129  270:putfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
		if(flag)
	//* 130  273:iload_3         
	//* 131  274:ifeq            289
			state.mAvailable = ((LayoutState) (state)).mAvailable - i;
	//  132  277:aload           4
	//  133  279:aload           4
	//  134  281:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  135  284:iload_1         
	//  136  285:isub            
	//  137  286:putfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
		mLayoutState.mScrollingOffset = i;
	//  138  289:aload_0         
	//  139  290:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  140  293:iload_1         
	//  141  294:putfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//  142  297:return          
	}

	private void updateLayoutStateToFillEnd(int i, int j)
	{
		mLayoutState.mAvailable = mOrientationHelper.getEndAfterPadding() - j;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:aload_0         
	//    3    5:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    4    8:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//    5   11:iload_2         
	//    6   12:isub            
	//    7   13:putfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
		LayoutState layoutstate = mLayoutState;
	//    8   16:aload_0         
	//    9   17:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   10   20:astore          4
		int k;
		if(mShouldReverseLayout)
	//*  11   22:aload_0         
	//*  12   23:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  13   26:ifeq            34
			k = -1;
	//   14   29:iconst_m1       
	//   15   30:istore_3        
		else
	//*  16   31:goto            36
			k = 1;
	//   17   34:iconst_1        
	//   18   35:istore_3        
		layoutstate.mItemDirection = k;
	//   19   36:aload           4
	//   20   38:iload_3         
	//   21   39:putfield        #428 <Field int LinearLayoutManager$LayoutState.mItemDirection>
		layoutstate = mLayoutState;
	//   22   42:aload_0         
	//   23   43:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   24   46:astore          4
		layoutstate.mCurrentPosition = i;
	//   25   48:aload           4
	//   26   50:iload_1         
	//   27   51:putfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
		layoutstate.mLayoutDirection = 1;
	//   28   54:aload           4
	//   29   56:iconst_1        
	//   30   57:putfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		layoutstate.mOffset = j;
	//   31   60:aload           4
	//   32   62:iload_2         
	//   33   63:putfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
		layoutstate.mScrollingOffset = 0x80000000;
	//   34   66:aload           4
	//   35   68:ldc1            #15  <Int 0x80000000>
	//   36   70:putfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   37   73:return          
	}

	private void updateLayoutStateToFillEnd(AnchorInfo anchorinfo)
	{
		updateLayoutStateToFillEnd(anchorinfo.mPosition, anchorinfo.mCoordinate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #385 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
	//    5    9:invokespecial   #275 <Method void updateLayoutStateToFillEnd(int, int)>
	//    6   12:return          
	}

	private void updateLayoutStateToFillStart(int i, int j)
	{
		mLayoutState.mAvailable = j - mOrientationHelper.getStartAfterPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    5    9:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//    6   12:isub            
	//    7   13:putfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
		LayoutState layoutstate = mLayoutState;
	//    8   16:aload_0         
	//    9   17:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   10   20:astore_3        
		layoutstate.mCurrentPosition = i;
	//   11   21:aload_3         
	//   12   22:iload_1         
	//   13   23:putfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
		if(mShouldReverseLayout)
	//*  14   26:aload_0         
	//*  15   27:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  16   30:ifeq            38
			i = 1;
	//   17   33:iconst_1        
	//   18   34:istore_1        
		else
	//*  19   35:goto            40
			i = -1;
	//   20   38:iconst_m1       
	//   21   39:istore_1        
		layoutstate.mItemDirection = i;
	//   22   40:aload_3         
	//   23   41:iload_1         
	//   24   42:putfield        #428 <Field int LinearLayoutManager$LayoutState.mItemDirection>
		layoutstate = mLayoutState;
	//   25   45:aload_0         
	//   26   46:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   27   49:astore_3        
		layoutstate.mLayoutDirection = -1;
	//   28   50:aload_3         
	//   29   51:iconst_m1       
	//   30   52:putfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
		layoutstate.mOffset = j;
	//   31   55:aload_3         
	//   32   56:iload_2         
	//   33   57:putfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
		layoutstate.mScrollingOffset = 0x80000000;
	//   34   60:aload_3         
	//   35   61:ldc1            #15  <Int 0x80000000>
	//   36   63:putfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   37   66:return          
	}

	private void updateLayoutStateToFillStart(AnchorInfo anchorinfo)
	{
		updateLayoutStateToFillStart(anchorinfo.mPosition, anchorinfo.mCoordinate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #385 <Field int LinearLayoutManager$AnchorInfo.mPosition>
	//    3    5:aload_1         
	//    4    6:getfield        #380 <Field int LinearLayoutManager$AnchorInfo.mCoordinate>
	//    5    9:invokespecial   #257 <Method void updateLayoutStateToFillStart(int, int)>
	//    6   12:return          
	}

	public void assertNotInLayoutOrScroll(String s)
	{
		if(mPendingSavedState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*   2    4:ifnonnull       12
			super.assertNotInLayoutOrScroll(s);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #439 <Method void RecyclerView$LayoutManager.assertNotInLayoutOrScroll(String)>
	//    6   12:return          
	}

	public boolean canScrollHorizontally()
	{
		return mOrientation == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mOrientation>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean canScrollVertically()
	{
		return mOrientation == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mOrientation>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void collectAdjacentPrefetchPositions(int i, int j, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		if(mOrientation != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mOrientation>
	//*   2    4:ifne            10
	//*   3    7:goto            12
			i = j;
	//    4   10:iload_2         
	//    5   11:istore_1        
		if(getChildCount() != 0)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #114 <Method int getChildCount()>
	//*   8   16:ifeq            62
		{
			if(i == 0)
	//*   9   19:iload_1         
	//*  10   20:ifne            24
				return;
	//   11   23:return          
			ensureLayoutState();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #117 <Method void ensureLayoutState()>
			if(i > 0)
	//*  14   28:iload_1         
	//*  15   29:ifle            37
				j = 1;
	//   16   32:iconst_1        
	//   17   33:istore_2        
			else
	//*  18   34:goto            39
				j = -1;
	//   19   37:iconst_m1       
	//   20   38:istore_2        
			updateLayoutState(j, Math.abs(i), true, state);
	//   21   39:aload_0         
	//   22   40:iload_2         
	//   23   41:iload_1         
	//   24   42:invokestatic    #449 <Method int Math.abs(int)>
	//   25   45:iconst_1        
	//   26   46:aload_3         
	//   27   47:invokespecial   #451 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
			collectPrefetchPositionsForLayoutState(state, mLayoutState, layoutprefetchregistry);
	//   28   50:aload_0         
	//   29   51:aload_3         
	//   30   52:aload_0         
	//   31   53:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   32   56:aload           4
	//   33   58:invokevirtual   #455 <Method void collectPrefetchPositionsForLayoutState(RecyclerView$State, LinearLayoutManager$LayoutState, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
			return;
	//   34   61:return          
		} else
		{
			return;
	//   35   62:return          
		}
	}

	public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		SavedState savedstate = mPendingSavedState;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:astore          9
		byte byte0 = -1;
	//    3    6:iconst_m1       
	//    4    7:istore          4
		int j;
		boolean flag1;
		if(savedstate != null && savedstate.hasValidAnchor())
	//*   5    9:aload           9
	//*   6   11:ifnull          42
	//*   7   14:aload           9
	//*   8   16:invokevirtual   #390 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*   9   19:ifeq            42
		{
			flag1 = mPendingSavedState.mAnchorLayoutFromEnd;
	//   10   22:aload_0         
	//   11   23:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   12   26:getfield        #393 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
	//   13   29:istore          7
			j = mPendingSavedState.mAnchorPosition;
	//   14   31:aload_0         
	//   15   32:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   16   35:getfield        #460 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
	//   17   38:istore_3        
		} else
	//*  18   39:goto            93
		{
			resolveShouldLayoutReverse();
	//   19   42:aload_0         
	//   20   43:invokespecial   #462 <Method void resolveShouldLayoutReverse()>
			boolean flag2 = mShouldReverseLayout;
	//   21   46:aload_0         
	//   22   47:getfield        #59  <Field boolean mShouldReverseLayout>
	//   23   50:istore          8
			int l = mPendingScrollPosition;
	//   24   52:aload_0         
	//   25   53:getfield        #65  <Field int mPendingScrollPosition>
	//   26   56:istore          5
			flag1 = flag2;
	//   27   58:iload           8
	//   28   60:istore          7
			j = l;
	//   29   62:iload           5
	//   30   64:istore_3        
			if(l == -1)
	//*  31   65:iload           5
	//*  32   67:iconst_m1       
	//*  33   68:icmpne          93
				if(flag2)
	//*  34   71:iload           8
	//*  35   73:ifeq            87
				{
					j = i - 1;
	//   36   76:iload_1         
	//   37   77:iconst_1        
	//   38   78:isub            
	//   39   79:istore_3        
					flag1 = flag2;
	//   40   80:iload           8
	//   41   82:istore          7
				} else
	//*  42   84:goto            93
				{
					j = 0;
	//   43   87:iconst_0        
	//   44   88:istore_3        
					flag1 = flag2;
	//   45   89:iload           8
	//   46   91:istore          7
				}
		}
		if(!flag1)
	//*  47   93:iload           7
	//*  48   95:ifeq            101
	//*  49   98:goto            104
			byte0 = 1;
	//   50  101:iconst_1        
	//   51  102:istore          4
		boolean flag = false;
	//   52  104:iconst_0        
	//   53  105:istore          6
		int i1 = j;
	//   54  107:iload_3         
	//   55  108:istore          5
		for(int k = ((int) (flag)); k < mInitialPrefetchItemCount && i1 >= 0 && i1 < i; k++)
	//*  56  110:iload           6
	//*  57  112:istore_3        
	//*  58  113:iload_3         
	//*  59  114:aload_0         
	//*  60  115:getfield        #81  <Field int mInitialPrefetchItemCount>
	//*  61  118:icmpge          155
	//*  62  121:iload           5
	//*  63  123:iflt            155
	//*  64  126:iload           5
	//*  65  128:iload_1         
	//*  66  129:icmpge          155
		{
			layoutprefetchregistry.addPosition(i1, 0);
	//   67  132:aload_2         
	//   68  133:iload           5
	//   69  135:iconst_0        
	//   70  136:invokeinterface #467 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
			i1 += ((int) (byte0));
	//   71  141:iload           5
	//   72  143:iload           4
	//   73  145:iadd            
	//   74  146:istore          5
		}

	//   75  148:iload_3         
	//   76  149:iconst_1        
	//   77  150:iadd            
	//   78  151:istore_3        
	//*  79  152:goto            113
	//   80  155:return          
	}

	void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutstate, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutprefetchregistry)
	{
		int i = layoutstate.mCurrentPosition;
	//    0    0:aload_2         
	//    1    1:getfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//    2    4:istore          4
		if(i >= 0 && i < state.getItemCount())
	//*   3    6:iload           4
	//*   4    8:iflt            36
	//*   5   11:iload           4
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #150 <Method int RecyclerView$State.getItemCount()>
	//*   8   17:icmpge          36
			layoutprefetchregistry.addPosition(i, Math.max(0, layoutstate.mScrollingOffset));
	//    9   20:aload_3         
	//   10   21:iload           4
	//   11   23:iconst_0        
	//   12   24:aload_2         
	//   13   25:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   14   28:invokestatic    #471 <Method int Math.max(int, int)>
	//   15   31:invokeinterface #467 <Method void RecyclerView$LayoutManager$LayoutPrefetchRegistry.addPosition(int, int)>
	//   16   36:return          
	}

	public int computeHorizontalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #474 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #477 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeHorizontalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #480 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public PointF computeScrollVectorForPosition(int i)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #114 <Method int getChildCount()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		int j = getPosition(getChildAt(0));
	//    7   12:aload_0         
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:invokevirtual   #196 <Method View getChildAt(int)>
	//   11   18:invokevirtual   #224 <Method int getPosition(View)>
	//   12   21:istore_3        
		boolean flag = true;
	//   13   22:iconst_1        
	//   14   23:istore_2        
		if(i < j)
	//*  15   24:iload_1         
	//*  16   25:iload_3         
	//*  17   26:icmpge          32
			flag1 = true;
	//   18   29:iconst_1        
	//   19   30:istore          4
		i = ((int) (flag));
	//   20   32:iload_2         
	//   21   33:istore_1        
		if(flag1 != mShouldReverseLayout)
	//*  22   34:iload           4
	//*  23   36:aload_0         
	//*  24   37:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  25   40:icmpeq          45
			i = -1;
	//   26   43:iconst_m1       
	//   27   44:istore_1        
		if(mOrientation == 0)
	//*  28   45:aload_0         
	//*  29   46:getfield        #55  <Field int mOrientation>
	//*  30   49:ifne            63
			return new PointF(i, 0.0F);
	//   31   52:new             #484 <Class PointF>
	//   32   55:dup             
	//   33   56:iload_1         
	//   34   57:i2f             
	//   35   58:fconst_0        
	//   36   59:invokespecial   #487 <Method void PointF(float, float)>
	//   37   62:areturn         
		else
			return new PointF(0.0F, i);
	//   38   63:new             #484 <Class PointF>
	//   39   66:dup             
	//   40   67:fconst_0        
	//   41   68:iload_1         
	//   42   69:i2f             
	//   43   70:invokespecial   #487 <Method void PointF(float, float)>
	//   44   73:areturn         
	}

	public int computeVerticalScrollExtent(RecyclerView.State state)
	{
		return computeScrollExtent(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #474 <Method int computeScrollExtent(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollOffset(RecyclerView.State state)
	{
		return computeScrollOffset(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #477 <Method int computeScrollOffset(RecyclerView$State)>
	//    3    5:ireturn         
	}

	public int computeVerticalScrollRange(RecyclerView.State state)
	{
		return computeScrollRange(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #480 <Method int computeScrollRange(RecyclerView$State)>
	//    3    5:ireturn         
	}

	int convertFocusDirectionToLayoutDirection(int i)
	{
		int j = 0x80000000;
	//    0    0:ldc1            #15  <Int 0x80000000>
	//    1    2:istore_2        
		if(i != 17)
	//*   2    3:iload_1         
	//*   3    4:bipush          17
	//*   4    6:icmpeq          133
		{
			if(i != 33)
	//*   5    9:iload_1         
	//*   6   10:bipush          33
	//*   7   12:icmpeq          120
			{
				if(i != 66)
	//*   8   15:iload_1         
	//*   9   16:bipush          66
	//*  10   18:icmpeq          109
				{
					if(i != 130)
	//*  11   21:iload_1         
	//*  12   22:sipush          130
	//*  13   25:icmpeq          97
					{
						switch(i)
	//*  14   28:iload_1         
						{
	//*  15   29:tableswitch     1 2: default 52
	//	               1 76
	//	               2 55
						default:
							return 0x80000000;
	//   16   52:ldc1            #15  <Int 0x80000000>
	//   17   54:ireturn         

						case 2: // '\002'
							if(mOrientation == 1)
	//*  18   55:aload_0         
	//*  19   56:getfield        #55  <Field int mOrientation>
	//*  20   59:iconst_1        
	//*  21   60:icmpne          65
								return 1;
	//   22   63:iconst_1        
	//   23   64:ireturn         
							return !isLayoutRTL() ? 1 : -1;
	//   24   65:aload_0         
	//   25   66:invokevirtual   #352 <Method boolean isLayoutRTL()>
	//   26   69:ifeq            74
	//   27   72:iconst_m1       
	//   28   73:ireturn         
	//   29   74:iconst_1        
	//   30   75:ireturn         

						case 1: // '\001'
							break;
						}
						if(mOrientation == 1)
	//*  31   76:aload_0         
	//*  32   77:getfield        #55  <Field int mOrientation>
	//*  33   80:iconst_1        
	//*  34   81:icmpne          86
							return -1;
	//   35   84:iconst_m1       
	//   36   85:ireturn         
						return !isLayoutRTL() ? -1 : 1;
	//   37   86:aload_0         
	//   38   87:invokevirtual   #352 <Method boolean isLayoutRTL()>
	//   39   90:ifeq            95
	//   40   93:iconst_1        
	//   41   94:ireturn         
	//   42   95:iconst_m1       
	//   43   96:ireturn         
					}
					if(mOrientation == 1)
	//*  44   97:aload_0         
	//*  45   98:getfield        #55  <Field int mOrientation>
	//*  46  101:iconst_1        
	//*  47  102:icmpne          107
						j = 1;
	//   48  105:iconst_1        
	//   49  106:istore_2        
					return j;
	//   50  107:iload_2         
	//   51  108:ireturn         
				}
				if(mOrientation == 0)
	//*  52  109:aload_0         
	//*  53  110:getfield        #55  <Field int mOrientation>
	//*  54  113:ifne            118
					j = 1;
	//   55  116:iconst_1        
	//   56  117:istore_2        
				return j;
	//   57  118:iload_2         
	//   58  119:ireturn         
			}
			return mOrientation != 1 ? 0x80000000 : -1;
	//   59  120:aload_0         
	//   60  121:getfield        #55  <Field int mOrientation>
	//   61  124:iconst_1        
	//   62  125:icmpne          130
	//   63  128:iconst_m1       
	//   64  129:ireturn         
	//   65  130:ldc1            #15  <Int 0x80000000>
	//   66  132:ireturn         
		}
		return mOrientation != 0 ? 0x80000000 : -1;
	//   67  133:aload_0         
	//   68  134:getfield        #55  <Field int mOrientation>
	//   69  137:ifne            142
	//   70  140:iconst_m1       
	//   71  141:ireturn         
	//   72  142:ldc1            #15  <Int 0x80000000>
	//   73  144:ireturn         
	}

	LayoutState createLayoutState()
	{
		return new LayoutState();
	//    0    0:new             #247 <Class LinearLayoutManager$LayoutState>
	//    1    3:dup             
	//    2    4:invokespecial   #494 <Method void LinearLayoutManager$LayoutState()>
	//    3    7:areturn         
	}

	void ensureLayoutState()
	{
		if(mLayoutState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*   2    4:ifnonnull       15
			mLayoutState = createLayoutState();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #496 <Method LinearLayoutManager$LayoutState createLayoutState()>
	//    6   12:putfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    7   15:return          
	}

	int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state, boolean flag)
	{
		int k = layoutstate.mAvailable;
	//    0    0:aload_2         
	//    1    1:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//    2    4:istore          7
		if(layoutstate.mScrollingOffset != 0x80000000)
	//*   3    6:aload_2         
	//*   4    7:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*   5   10:ldc1            #15  <Int 0x80000000>
	//*   6   12:icmpeq          41
		{
			if(layoutstate.mAvailable < 0)
	//*   7   15:aload_2         
	//*   8   16:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*   9   19:ifge            35
				layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
	//   10   22:aload_2         
	//   11   23:aload_2         
	//   12   24:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   13   27:aload_2         
	//   14   28:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   15   31:iadd            
	//   16   32:putfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
			recycleByLayoutState(recycler, layoutstate);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokespecial   #498 <Method void recycleByLayoutState(RecyclerView$Recycler, LinearLayoutManager$LayoutState)>
		}
		int i = layoutstate.mAvailable + layoutstate.mExtra;
	//   21   41:aload_2         
	//   22   42:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   23   45:aload_2         
	//   24   46:getfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
	//   25   49:iadd            
	//   26   50:istore          5
		LayoutChunkResult layoutchunkresult = mLayoutChunkResult;
	//   27   52:aload_0         
	//   28   53:getfield        #79  <Field LinearLayoutManager$LayoutChunkResult mLayoutChunkResult>
	//   29   56:astore          8
label0:
		do
		{
			int j;
			do
			{
label1:
				{
					if(!layoutstate.mInfinite && i <= 0 || !layoutstate.hasMore(state))
						break label0;
	//   30   58:aload_2         
	//   31   59:getfield        #315 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
	//   32   62:ifne            70
	//   33   65:iload           5
	//   34   67:ifle            245
	//   35   70:aload_2         
	//   36   71:aload_3         
	//   37   72:invokevirtual   #502 <Method boolean LinearLayoutManager$LayoutState.hasMore(RecyclerView$State)>
	//   38   75:ifeq            245
					layoutchunkresult.resetInternal();
	//   39   78:aload           8
	//   40   80:invokevirtual   #505 <Method void LinearLayoutManager$LayoutChunkResult.resetInternal()>
					layoutChunk(recycler, state, layoutstate, layoutchunkresult);
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:aload_3         
	//   44   86:aload_2         
	//   45   87:aload           8
	//   46   89:invokevirtual   #509 <Method void layoutChunk(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$LayoutState, LinearLayoutManager$LayoutChunkResult)>
					if(layoutchunkresult.mFinished)
	//*  47   92:aload           8
	//*  48   94:getfield        #512 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
	//*  49   97:ifeq            103
						break label0;
	//   50  100:goto            245
					layoutstate.mOffset = layoutstate.mOffset + layoutchunkresult.mConsumed * layoutstate.mLayoutDirection;
	//   51  103:aload_2         
	//   52  104:aload_2         
	//   53  105:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//   54  108:aload           8
	//   55  110:getfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   56  113:aload_2         
	//   57  114:getfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//   58  117:imul            
	//   59  118:iadd            
	//   60  119:putfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
					if(layoutchunkresult.mIgnoreConsumed && mLayoutState.mScrapList == null)
	//*  61  122:aload           8
	//*  62  124:getfield        #518 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
	//*  63  127:ifeq            151
	//*  64  130:aload_0         
	//*  65  131:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//*  66  134:getfield        #251 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//*  67  137:ifnonnull       151
					{
						j = i;
	//   68  140:iload           5
	//   69  142:istore          6
						if(state.isPreLayout())
							break label1;
	//   70  144:aload_3         
	//   71  145:invokevirtual   #206 <Method boolean RecyclerView$State.isPreLayout()>
	//   72  148:ifne            175
					}
					layoutstate.mAvailable = layoutstate.mAvailable - layoutchunkresult.mConsumed;
	//   73  151:aload_2         
	//   74  152:aload_2         
	//   75  153:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//   76  156:aload           8
	//   77  158:getfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   78  161:isub            
	//   79  162:putfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
					j = i - layoutchunkresult.mConsumed;
	//   80  165:iload           5
	//   81  167:aload           8
	//   82  169:getfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   83  172:isub            
	//   84  173:istore          6
				}
				if(layoutstate.mScrollingOffset != 0x80000000)
	//*  85  175:aload_2         
	//*  86  176:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//*  87  179:ldc1            #15  <Int 0x80000000>
	//*  88  181:icmpeq          224
				{
					layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutchunkresult.mConsumed;
	//   89  184:aload_2         
	//   90  185:aload_2         
	//   91  186:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   92  189:aload           8
	//   93  191:getfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//   94  194:iadd            
	//   95  195:putfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
					if(layoutstate.mAvailable < 0)
	//*  96  198:aload_2         
	//*  97  199:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//*  98  202:ifge            218
						layoutstate.mScrollingOffset = layoutstate.mScrollingOffset + layoutstate.mAvailable;
	//   99  205:aload_2         
	//  100  206:aload_2         
	//  101  207:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//  102  210:aload_2         
	//  103  211:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  104  214:iadd            
	//  105  215:putfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
					recycleByLayoutState(recycler, layoutstate);
	//  106  218:aload_0         
	//  107  219:aload_1         
	//  108  220:aload_2         
	//  109  221:invokespecial   #498 <Method void recycleByLayoutState(RecyclerView$Recycler, LinearLayoutManager$LayoutState)>
				}
				i = j;
	//  110  224:iload           6
	//  111  226:istore          5
			} while(!flag);
	//  112  228:iload           4
	//  113  230:ifeq            58
			i = j;
	//  114  233:iload           6
	//  115  235:istore          5
		} while(!layoutchunkresult.mFocusable);
	//  116  237:aload           8
	//  117  239:getfield        #521 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  118  242:ifeq            58
		return k - layoutstate.mAvailable;
	//  119  245:iload           7
	//  120  247:aload_2         
	//  121  248:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  122  251:isub            
	//  123  252:ireturn         
	}

	public int findFirstCompletelyVisibleItemPosition()
	{
		View view = findOneVisibleChild(0, getChildCount(), true, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #114 <Method int getChildCount()>
	//    4    6:iconst_1        
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #158 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//    7   11:astore_1        
		if(view == null)
	//*   8   12:aload_1         
	//*   9   13:ifnonnull       18
			return -1;
	//   10   16:iconst_m1       
	//   11   17:ireturn         
		else
			return getPosition(view);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #224 <Method int getPosition(View)>
	//   15   23:ireturn         
	}

	public int findFirstVisibleItemPosition()
	{
		View view = findOneVisibleChild(0, getChildCount(), false, true);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #114 <Method int getChildCount()>
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #158 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//    7   11:astore_1        
		if(view == null)
	//*   8   12:aload_1         
	//*   9   13:ifnonnull       18
			return -1;
	//   10   16:iconst_m1       
	//   11   17:ireturn         
		else
			return getPosition(view);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #224 <Method int getPosition(View)>
	//   15   23:ireturn         
	}

	public int findLastCompletelyVisibleItemPosition()
	{
		View view = findOneVisibleChild(getChildCount() - 1, -1, true, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #114 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:iconst_1        
	//    7    9:iconst_0        
	//    8   10:invokevirtual   #158 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//    9   13:astore_1        
		if(view == null)
	//*  10   14:aload_1         
	//*  11   15:ifnonnull       20
			return -1;
	//   12   18:iconst_m1       
	//   13   19:ireturn         
		else
			return getPosition(view);
	//   14   20:aload_0         
	//   15   21:aload_1         
	//   16   22:invokevirtual   #224 <Method int getPosition(View)>
	//   17   25:ireturn         
	}

	public int findLastVisibleItemPosition()
	{
		View view = findOneVisibleChild(getChildCount() - 1, -1, false, true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #114 <Method int getChildCount()>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:iconst_m1       
	//    6    8:iconst_0        
	//    7    9:iconst_1        
	//    8   10:invokevirtual   #158 <Method View findOneVisibleChild(int, int, boolean, boolean)>
	//    9   13:astore_1        
		if(view == null)
	//*  10   14:aload_1         
	//*  11   15:ifnonnull       20
			return -1;
	//   12   18:iconst_m1       
	//   13   19:ireturn         
		else
			return getPosition(view);
	//   14   20:aload_0         
	//   15   21:aload_1         
	//   16   22:invokevirtual   #224 <Method int getPosition(View)>
	//   17   25:ireturn         
	}

	View findOnePartiallyOrCompletelyInvisibleChild(int i, int j)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method void ensureLayoutState()>
		char c;
		if(j > i)
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:icmple          14
			c = '\001';
	//    5    9:iconst_1        
	//    6   10:istore_3        
		else
	//*   7   11:goto            26
		if(j < i)
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:icmpge          24
			c = '\uFFFF';
	//   11   19:iconst_m1       
	//   12   20:istore_3        
		else
	//*  13   21:goto            26
			c = '\0';
	//   14   24:iconst_0        
	//   15   25:istore_3        
		if(c == 0)
	//*  16   26:iload_3         
	//*  17   27:ifne            36
			return getChildAt(i);
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:invokevirtual   #196 <Method View getChildAt(int)>
	//   21   35:areturn         
		char c1;
		if(mOrientationHelper.getDecoratedStart(getChildAt(i)) < mOrientationHelper.getStartAfterPadding())
	//*  22   36:aload_0         
	//*  23   37:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  24   40:aload_0         
	//*  25   41:iload_1         
	//*  26   42:invokevirtual   #196 <Method View getChildAt(int)>
	//*  27   45:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  28   48:aload_0         
	//*  29   49:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  30   52:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//*  31   55:icmpge          70
		{
			c = '\u4104';
	//   32   58:sipush          16644
	//   33   61:istore_3        
			c1 = '\u4004';
	//   34   62:sipush          16388
	//   35   65:istore          4
		} else
	//*  36   67:goto            79
		{
			c = '\u1041';
	//   37   70:sipush          4161
	//   38   73:istore_3        
			c1 = '\u1001';
	//   39   74:sipush          4097
	//   40   77:istore          4
		}
		if(mOrientation == 0)
	//*  41   79:aload_0         
	//*  42   80:getfield        #55  <Field int mOrientation>
	//*  43   83:ifne            99
			return mHorizontalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   44   86:aload_0         
	//   45   87:getfield        #529 <Field ViewBoundsCheck mHorizontalBoundCheck>
	//   46   90:iload_1         
	//   47   91:iload_2         
	//   48   92:iload_3         
	//   49   93:iload           4
	//   50   95:invokevirtual   #535 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   51   98:areturn         
		else
			return mVerticalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   52   99:aload_0         
	//   53  100:getfield        #538 <Field ViewBoundsCheck mVerticalBoundCheck>
	//   54  103:iload_1         
	//   55  104:iload_2         
	//   56  105:iload_3         
	//   57  106:iload           4
	//   58  108:invokevirtual   #535 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   59  111:areturn         
	}

	View findOneVisibleChild(int i, int j, boolean flag, boolean flag1)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method void ensureLayoutState()>
		char c1 = '\u0140';
	//    2    4:sipush          320
	//    3    7:istore          6
		char c;
		if(flag)
	//*   4    9:iload_3         
	//*   5   10:ifeq            21
			c = '\u6003';
	//    6   13:sipush          24579
	//    7   16:istore          5
		else
	//*   8   18:goto            26
			c = '\u0140';
	//    9   21:sipush          320
	//   10   24:istore          5
		if(!flag1)
	//*  11   26:iload           4
	//*  12   28:ifeq            34
	//*  13   31:goto            37
			c1 = '\0';
	//   14   34:iconst_0        
	//   15   35:istore          6
		if(mOrientation == 0)
	//*  16   37:aload_0         
	//*  17   38:getfield        #55  <Field int mOrientation>
	//*  18   41:ifne            58
			return mHorizontalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   19   44:aload_0         
	//   20   45:getfield        #529 <Field ViewBoundsCheck mHorizontalBoundCheck>
	//   21   48:iload_1         
	//   22   49:iload_2         
	//   23   50:iload           5
	//   24   52:iload           6
	//   25   54:invokevirtual   #535 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   26   57:areturn         
		else
			return mVerticalBoundCheck.findOneViewWithinBoundFlags(i, j, ((int) (c)), ((int) (c1)));
	//   27   58:aload_0         
	//   28   59:getfield        #538 <Field ViewBoundsCheck mVerticalBoundCheck>
	//   29   62:iload_1         
	//   30   63:iload_2         
	//   31   64:iload           5
	//   32   66:iload           6
	//   33   68:invokevirtual   #535 <Method View ViewBoundsCheck.findOneViewWithinBoundFlags(int, int, int, int)>
	//   34   71:areturn         
	}

	View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int j, int k)
	{
		ensureLayoutState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method void ensureLayoutState()>
		int l = mOrientationHelper.getStartAfterPadding();
	//    2    4:aload_0         
	//    3    5:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    4    8:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//    5   11:istore          7
		int i1 = mOrientationHelper.getEndAfterPadding();
	//    6   13:aload_0         
	//    7   14:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    8   17:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//    9   20:istore          8
		byte byte0;
		if(j > i)
	//*  10   22:iload           4
	//*  11   24:iload_3         
	//*  12   25:icmple          34
			byte0 = 1;
	//   13   28:iconst_1        
	//   14   29:istore          6
		else
	//*  15   31:goto            37
			byte0 = -1;
	//   16   34:iconst_m1       
	//   17   35:istore          6
		state = null;
	//   18   37:aconst_null     
	//   19   38:astore_2        
		Object obj1;
		for(recycler = null; i != j; recycler = ((RecyclerView.Recycler) (obj1)))
	//*  20   39:aconst_null     
	//*  21   40:astore_1        
	//*  22   41:iload_3         
	//*  23   42:iload           4
	//*  24   44:icmpeq          185
		{
			View view = getChildAt(i);
	//   25   47:aload_0         
	//   26   48:iload_3         
	//   27   49:invokevirtual   #196 <Method View getChildAt(int)>
	//   28   52:astore          12
			int j1 = getPosition(view);
	//   29   54:aload_0         
	//   30   55:aload           12
	//   31   57:invokevirtual   #224 <Method int getPosition(View)>
	//   32   60:istore          9
			Object obj = ((Object) (state));
	//   33   62:aload_2         
	//   34   63:astore          10
			obj1 = ((Object) (recycler));
	//   35   65:aload_1         
	//   36   66:astore          11
			if(j1 >= 0)
	//*  37   68:iload           9
	//*  38   70:iflt            171
			{
				obj = ((Object) (state));
	//   39   73:aload_2         
	//   40   74:astore          10
				obj1 = ((Object) (recycler));
	//   41   76:aload_1         
	//   42   77:astore          11
				if(j1 < k)
	//*  43   79:iload           9
	//*  44   81:iload           5
	//*  45   83:icmpge          171
					if(((RecyclerView.LayoutParams)view.getLayoutParams()).isItemRemoved())
	//*  46   86:aload           12
	//*  47   88:invokevirtual   #544 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  48   91:checkcast       #546 <Class RecyclerView$LayoutParams>
	//*  49   94:invokevirtual   #549 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  50   97:ifeq            120
					{
						obj = ((Object) (state));
	//   51  100:aload_2         
	//   52  101:astore          10
						obj1 = ((Object) (recycler));
	//   53  103:aload_1         
	//   54  104:astore          11
						if(recycler == null)
	//*  55  106:aload_1         
	//*  56  107:ifnonnull       171
						{
							obj1 = ((Object) (view));
	//   57  110:aload           12
	//   58  112:astore          11
							obj = ((Object) (state));
	//   59  114:aload_2         
	//   60  115:astore          10
						}
					} else
	//*  61  117:goto            171
					{
						if(mOrientationHelper.getDecoratedStart(view) < i1 && mOrientationHelper.getDecoratedEnd(view) >= l)
	//*  62  120:aload_0         
	//*  63  121:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  64  124:aload           12
	//*  65  126:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  66  129:iload           8
	//*  67  131:icmpge          154
	//*  68  134:aload_0         
	//*  69  135:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  70  138:aload           12
	//*  71  140:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  72  143:iload           7
	//*  73  145:icmpge          151
	//*  74  148:goto            154
							return view;
	//   75  151:aload           12
	//   76  153:areturn         
						obj = ((Object) (state));
	//   77  154:aload_2         
	//   78  155:astore          10
						obj1 = ((Object) (recycler));
	//   79  157:aload_1         
	//   80  158:astore          11
						if(state == null)
	//*  81  160:aload_2         
	//*  82  161:ifnonnull       171
						{
							obj = ((Object) (view));
	//   83  164:aload           12
	//   84  166:astore          10
							obj1 = ((Object) (recycler));
	//   85  168:aload_1         
	//   86  169:astore          11
						}
					}
			}
			i += ((int) (byte0));
	//   87  171:iload_3         
	//   88  172:iload           6
	//   89  174:iadd            
	//   90  175:istore_3        
			state = ((RecyclerView.State) (obj));
	//   91  176:aload           10
	//   92  178:astore_2        
		}

	//   93  179:aload           11
	//   94  181:astore_1        
	//*  95  182:goto            41
		if(state != null)
	//*  96  185:aload_2         
	//*  97  186:ifnull          191
			return ((View) (state));
	//   98  189:aload_2         
	//   99  190:areturn         
		else
			return ((View) (recycler));
	//  100  191:aload_1         
	//  101  192:areturn         
	}

	public View findViewByPosition(int i)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method int getChildCount()>
	//    2    4:istore_2        
		if(j == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		int k = i - getPosition(getChildAt(0));
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #196 <Method View getChildAt(int)>
	//   12   18:invokevirtual   #224 <Method int getPosition(View)>
	//   13   21:isub            
	//   14   22:istore_3        
		if(k >= 0 && k < j)
	//*  15   23:iload_3         
	//*  16   24:iflt            52
	//*  17   27:iload_3         
	//*  18   28:iload_2         
	//*  19   29:icmpge          52
		{
			View view = getChildAt(k);
	//   20   32:aload_0         
	//   21   33:iload_3         
	//   22   34:invokevirtual   #196 <Method View getChildAt(int)>
	//   23   37:astore          4
			if(getPosition(view) == i)
	//*  24   39:aload_0         
	//*  25   40:aload           4
	//*  26   42:invokevirtual   #224 <Method int getPosition(View)>
	//*  27   45:iload_1         
	//*  28   46:icmpne          52
				return view;
	//   29   49:aload           4
	//   30   51:areturn         
		}
		return super.findViewByPosition(i);
	//   31   52:aload_0         
	//   32   53:iload_1         
	//   33   54:invokespecial   #550 <Method View RecyclerView$LayoutManager.findViewByPosition(int)>
	//   34   57:areturn         
	}

	public RecyclerView.LayoutParams generateDefaultLayoutParams()
	{
		return new RecyclerView.LayoutParams(-2, -2);
	//    0    0:new             #546 <Class RecyclerView$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #554 <Method void RecyclerView$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected int getExtraLayoutSpace(RecyclerView.State state)
	{
		if(state.hasTargetScrollPosition())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #557 <Method boolean RecyclerView$State.hasTargetScrollPosition()>
	//*   2    4:ifeq            15
			return mOrientationHelper.getTotalSpace();
	//    3    7:aload_0         
	//    4    8:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    5   11:invokevirtual   #402 <Method int OrientationHelper.getTotalSpace()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getInitialPrefetchItemCount()
	{
		return mInitialPrefetchItemCount;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int mInitialPrefetchItemCount>
	//    2    4:ireturn         
	}

	public int getOrientation()
	{
		return mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mOrientation>
	//    2    4:ireturn         
	}

	public boolean getRecycleChildrenOnDetach()
	{
		return mRecycleChildrenOnDetach;
	//    0    0:aload_0         
	//    1    1:getfield        #562 <Field boolean mRecycleChildrenOnDetach>
	//    2    4:ireturn         
	}

	public boolean getReverseLayout()
	{
		return mReverseLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean mReverseLayout>
	//    2    4:ireturn         
	}

	public boolean getStackFromEnd()
	{
		return mStackFromEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean mStackFromEnd>
	//    2    4:ireturn         
	}

	public boolean isAutoMeasureEnabled()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected boolean isLayoutRTL()
	{
		return getLayoutDirection() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #568 <Method int getLayoutDirection()>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isSmoothScrollbarEnabled()
	{
		return mSmoothScrollbarEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//    2    4:ireturn         
	}

	void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutstate, LayoutChunkResult layoutchunkresult)
	{
		recycler = ((RecyclerView.Recycler) (layoutstate.next(recycler)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #573 <Method View LinearLayoutManager$LayoutState.next(RecyclerView$Recycler)>
	//    3    5:astore_1        
		if(recycler == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       17
		{
			layoutchunkresult.mFinished = true;
	//    6   10:aload           4
	//    7   12:iconst_1        
	//    8   13:putfield        #512 <Field boolean LinearLayoutManager$LayoutChunkResult.mFinished>
			return;
	//    9   16:return          
		}
		state = ((RecyclerView.State) ((RecyclerView.LayoutParams)((View) (recycler)).getLayoutParams()));
	//   10   17:aload_1         
	//   11   18:invokevirtual   #544 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   21:checkcast       #546 <Class RecyclerView$LayoutParams>
	//   13   24:astore_2        
		if(layoutstate.mScrapList == null)
	//*  14   25:aload_3         
	//*  15   26:getfield        #251 <Field List LinearLayoutManager$LayoutState.mScrapList>
	//*  16   29:ifnonnull       79
		{
			boolean flag2 = mShouldReverseLayout;
	//   17   32:aload_0         
	//   18   33:getfield        #59  <Field boolean mShouldReverseLayout>
	//   19   36:istore          12
			boolean flag;
			if(layoutstate.mLayoutDirection == -1)
	//*  20   38:aload_3         
	//*  21   39:getfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  22   42:iconst_m1       
	//*  23   43:icmpne          52
				flag = true;
	//   24   46:iconst_1        
	//   25   47:istore          11
			else
	//*  26   49:goto            55
				flag = false;
	//   27   52:iconst_0        
	//   28   53:istore          11
			if(flag2 == flag)
	//*  29   55:iload           12
	//*  30   57:iload           11
	//*  31   59:icmpne          70
				addView(((View) (recycler)));
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #577 <Method void addView(View)>
			else
	//*  35   67:goto            123
				addView(((View) (recycler)), 0);
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:invokevirtual   #579 <Method void addView(View, int)>
		} else
	//*  40   76:goto            123
		{
			boolean flag3 = mShouldReverseLayout;
	//   41   79:aload_0         
	//   42   80:getfield        #59  <Field boolean mShouldReverseLayout>
	//   43   83:istore          12
			boolean flag1;
			if(layoutstate.mLayoutDirection == -1)
	//*  44   85:aload_3         
	//*  45   86:getfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//*  46   89:iconst_m1       
	//*  47   90:icmpne          99
				flag1 = true;
	//   48   93:iconst_1        
	//   49   94:istore          11
			else
	//*  50   96:goto            102
				flag1 = false;
	//   51   99:iconst_0        
	//   52  100:istore          11
			if(flag3 == flag1)
	//*  53  102:iload           12
	//*  54  104:iload           11
	//*  55  106:icmpne          117
				addDisappearingView(((View) (recycler)));
	//   56  109:aload_0         
	//   57  110:aload_1         
	//   58  111:invokevirtual   #582 <Method void addDisappearingView(View)>
			else
	//*  59  114:goto            123
				addDisappearingView(((View) (recycler)), 0);
	//   60  117:aload_0         
	//   61  118:aload_1         
	//   62  119:iconst_0        
	//   63  120:invokevirtual   #584 <Method void addDisappearingView(View, int)>
		}
		measureChildWithMargins(((View) (recycler)), 0, 0);
	//   64  123:aload_0         
	//   65  124:aload_1         
	//   66  125:iconst_0        
	//   67  126:iconst_0        
	//   68  127:invokevirtual   #588 <Method void measureChildWithMargins(View, int, int)>
		layoutchunkresult.mConsumed = mOrientationHelper.getDecoratedMeasurement(((View) (recycler)));
	//   69  130:aload           4
	//   70  132:aload_0         
	//   71  133:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   72  136:aload_1         
	//   73  137:invokevirtual   #243 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   74  140:putfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
		int i;
		int j;
		int k;
		int l;
		if(mOrientation == 1)
	//*  75  143:aload_0         
	//*  76  144:getfield        #55  <Field int mOrientation>
	//*  77  147:iconst_1        
	//*  78  148:icmpne          270
		{
			if(isLayoutRTL())
	//*  79  151:aload_0         
	//*  80  152:invokevirtual   #352 <Method boolean isLayoutRTL()>
	//*  81  155:ifeq            185
			{
				i = getWidth() - getPaddingRight();
	//   82  158:aload_0         
	//   83  159:invokevirtual   #591 <Method int getWidth()>
	//   84  162:aload_0         
	//   85  163:invokevirtual   #594 <Method int getPaddingRight()>
	//   86  166:isub            
	//   87  167:istore          5
				l = i - mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler)));
	//   88  169:iload           5
	//   89  171:aload_0         
	//   90  172:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   91  175:aload_1         
	//   92  176:invokevirtual   #597 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//   93  179:isub            
	//   94  180:istore          8
			} else
	//*  95  182:goto            204
			{
				l = getPaddingLeft();
	//   96  185:aload_0         
	//   97  186:invokevirtual   #600 <Method int getPaddingLeft()>
	//   98  189:istore          8
				i = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) + l;
	//   99  191:aload_0         
	//  100  192:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  101  195:aload_1         
	//  102  196:invokevirtual   #597 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  103  199:iload           8
	//  104  201:iadd            
	//  105  202:istore          5
			}
			if(layoutstate.mLayoutDirection == -1)
	//* 106  204:aload_3         
	//* 107  205:getfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 108  208:iconst_m1       
	//* 109  209:icmpne          241
			{
				k = layoutstate.mOffset;
	//  110  212:aload_3         
	//  111  213:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  112  216:istore          7
				int i1 = layoutstate.mOffset - layoutchunkresult.mConsumed;
	//  113  218:aload_3         
	//  114  219:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  115  222:aload           4
	//  116  224:getfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  117  227:isub            
	//  118  228:istore          9
				j = i;
	//  119  230:iload           5
	//  120  232:istore          6
				i = i1;
	//  121  234:iload           9
	//  122  236:istore          5
			} else
	//* 123  238:goto            380
			{
				int j1 = layoutstate.mOffset;
	//  124  241:aload_3         
	//  125  242:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  126  245:istore          9
				k = layoutstate.mOffset + layoutchunkresult.mConsumed;
	//  127  247:aload_3         
	//  128  248:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  129  251:aload           4
	//  130  253:getfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  131  256:iadd            
	//  132  257:istore          7
				j = i;
	//  133  259:iload           5
	//  134  261:istore          6
				i = j1;
	//  135  263:iload           9
	//  136  265:istore          5
			}
		} else
	//* 137  267:goto            380
		{
			j = getPaddingTop();
	//  138  270:aload_0         
	//  139  271:invokevirtual   #603 <Method int getPaddingTop()>
	//  140  274:istore          6
			i = mOrientationHelper.getDecoratedMeasurementInOther(((View) (recycler))) + j;
	//  141  276:aload_0         
	//  142  277:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  143  280:aload_1         
	//  144  281:invokevirtual   #597 <Method int OrientationHelper.getDecoratedMeasurementInOther(View)>
	//  145  284:iload           6
	//  146  286:iadd            
	//  147  287:istore          5
			if(layoutstate.mLayoutDirection == -1)
	//* 148  289:aload_3         
	//* 149  290:getfield        #318 <Field int LinearLayoutManager$LayoutState.mLayoutDirection>
	//* 150  293:iconst_m1       
	//* 151  294:icmpne          342
			{
				k = layoutstate.mOffset;
	//  152  297:aload_3         
	//  153  298:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  154  301:istore          7
				l = layoutstate.mOffset;
	//  155  303:aload_3         
	//  156  304:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  157  307:istore          8
				int i2 = layoutchunkresult.mConsumed;
	//  158  309:aload           4
	//  159  311:getfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  160  314:istore          10
				int k1 = i;
	//  161  316:iload           5
	//  162  318:istore          9
				l -= i2;
	//  163  320:iload           8
	//  164  322:iload           10
	//  165  324:isub            
	//  166  325:istore          8
				i = j;
	//  167  327:iload           6
	//  168  329:istore          5
				j = k;
	//  169  331:iload           7
	//  170  333:istore          6
				k = k1;
	//  171  335:iload           9
	//  172  337:istore          7
			} else
	//* 173  339:goto            380
			{
				int l1 = layoutstate.mOffset;
	//  174  342:aload_3         
	//  175  343:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  176  346:istore          9
				int j2 = layoutstate.mOffset + layoutchunkresult.mConsumed;
	//  177  348:aload_3         
	//  178  349:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  179  352:aload           4
	//  180  354:getfield        #515 <Field int LinearLayoutManager$LayoutChunkResult.mConsumed>
	//  181  357:iadd            
	//  182  358:istore          10
				l = j;
	//  183  360:iload           6
	//  184  362:istore          8
				k = i;
	//  185  364:iload           5
	//  186  366:istore          7
				j = j2;
	//  187  368:iload           10
	//  188  370:istore          6
				i = l;
	//  189  372:iload           8
	//  190  374:istore          5
				l = l1;
	//  191  376:iload           9
	//  192  378:istore          8
			}
		}
		layoutDecoratedWithMargins(((View) (recycler)), l, i, j, k);
	//  193  380:aload_0         
	//  194  381:aload_1         
	//  195  382:iload           8
	//  196  384:iload           5
	//  197  386:iload           6
	//  198  388:iload           7
	//  199  390:invokevirtual   #607 <Method void layoutDecoratedWithMargins(View, int, int, int, int)>
		if(((RecyclerView.LayoutParams) (state)).isItemRemoved() || ((RecyclerView.LayoutParams) (state)).isItemChanged())
	//* 200  393:aload_2         
	//* 201  394:invokevirtual   #549 <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//* 202  397:ifne            407
	//* 203  400:aload_2         
	//* 204  401:invokevirtual   #610 <Method boolean RecyclerView$LayoutParams.isItemChanged()>
	//* 205  404:ifeq            413
			layoutchunkresult.mIgnoreConsumed = true;
	//  206  407:aload           4
	//  207  409:iconst_1        
	//  208  410:putfield        #518 <Field boolean LinearLayoutManager$LayoutChunkResult.mIgnoreConsumed>
		layoutchunkresult.mFocusable = ((View) (recycler)).hasFocusable();
	//  209  413:aload           4
	//  210  415:aload_1         
	//  211  416:invokevirtual   #613 <Method boolean View.hasFocusable()>
	//  212  419:putfield        #521 <Field boolean LinearLayoutManager$LayoutChunkResult.mFocusable>
	//  213  422:return          
	}

	void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorinfo, int i)
	{
	//    0    0:return          
	}

	public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
	{
		super.onDetachedFromWindow(recyclerview, recycler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #619 <Method void RecyclerView$LayoutManager.onDetachedFromWindow(RecyclerView, RecyclerView$Recycler)>
		if(mRecycleChildrenOnDetach)
	//*   4    6:aload_0         
	//*   5    7:getfield        #562 <Field boolean mRecycleChildrenOnDetach>
	//*   6   10:ifeq            22
		{
			removeAndRecycleAllViews(recycler);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #623 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
			recycler.clear();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #626 <Method void RecyclerView$Recycler.clear()>
		}
	//   12   22:return          
	}

	public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		resolveShouldLayoutReverse();
	//    0    0:aload_0         
	//    1    1:invokespecial   #462 <Method void resolveShouldLayoutReverse()>
		if(getChildCount() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #114 <Method int getChildCount()>
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		i = convertFocusDirectionToLayoutDirection(i);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #630 <Method int convertFocusDirectionToLayoutDirection(int)>
	//   10   18:istore_2        
		if(i == 0x80000000)
	//*  11   19:iload_2         
	//*  12   20:ldc1            #15  <Int 0x80000000>
	//*  13   22:icmpne          27
			return null;
	//   14   25:aconst_null     
	//   15   26:areturn         
		ensureLayoutState();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #117 <Method void ensureLayoutState()>
		ensureLayoutState();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #117 <Method void ensureLayoutState()>
		updateLayoutState(i, (int)((float)mOrientationHelper.getTotalSpace() * 0.3333333F), false, state);
	//   20   35:aload_0         
	//   21   36:iload_2         
	//   22   37:aload_0         
	//   23   38:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   24   41:invokevirtual   #402 <Method int OrientationHelper.getTotalSpace()>
	//   25   44:i2f             
	//   26   45:ldc1            #18  <Float 0.3333333F>
	//   27   47:fmul            
	//   28   48:f2i             
	//   29   49:iconst_0        
	//   30   50:aload           4
	//   31   52:invokespecial   #451 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
		view = ((View) (mLayoutState));
	//   32   55:aload_0         
	//   33   56:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   34   59:astore_1        
		view.mScrollingOffset = 0x80000000;
	//   35   60:aload_1         
	//   36   61:ldc1            #15  <Int 0x80000000>
	//   37   63:putfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
		view.mRecycle = false;
	//   38   66:aload_1         
	//   39   67:iconst_0        
	//   40   68:putfield        #312 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
		fill(recycler, ((LayoutState) (view)), state, true);
	//   41   71:aload_0         
	//   42   72:aload_3         
	//   43   73:aload_1         
	//   44   74:aload           4
	//   45   76:iconst_1        
	//   46   77:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//   47   80:pop             
		if(i == -1)
	//*  48   81:iload_2         
	//*  49   82:iconst_m1       
	//*  50   83:icmpne          97
			view = findPartiallyOrCompletelyInvisibleChildClosestToStart(recycler, state);
	//   51   86:aload_0         
	//   52   87:aload_3         
	//   53   88:aload           4
	//   54   90:invokespecial   #632 <Method View findPartiallyOrCompletelyInvisibleChildClosestToStart(RecyclerView$Recycler, RecyclerView$State)>
	//   55   93:astore_1        
		else
	//*  56   94:goto            105
			view = findPartiallyOrCompletelyInvisibleChildClosestToEnd(recycler, state);
	//   57   97:aload_0         
	//   58   98:aload_3         
	//   59   99:aload           4
	//   60  101:invokespecial   #634 <Method View findPartiallyOrCompletelyInvisibleChildClosestToEnd(RecyclerView$Recycler, RecyclerView$State)>
	//   61  104:astore_1        
		if(i == -1)
	//*  62  105:iload_2         
	//*  63  106:iconst_m1       
	//*  64  107:icmpne          118
			recycler = ((RecyclerView.Recycler) (getChildClosestToStart()));
	//   65  110:aload_0         
	//   66  111:invokespecial   #253 <Method View getChildClosestToStart()>
	//   67  114:astore_3        
		else
	//*  68  115:goto            123
			recycler = ((RecyclerView.Recycler) (getChildClosestToEnd()));
	//   69  118:aload_0         
	//   70  119:invokespecial   #272 <Method View getChildClosestToEnd()>
	//   71  122:astore_3        
		if(((View) (recycler)).hasFocusable())
	//*  72  123:aload_3         
	//*  73  124:invokevirtual   #613 <Method boolean View.hasFocusable()>
	//*  74  127:ifeq            138
		{
			if(view == null)
	//*  75  130:aload_1         
	//*  76  131:ifnonnull       136
				return null;
	//   77  134:aconst_null     
	//   78  135:areturn         
			else
				return ((View) (recycler));
	//   79  136:aload_3         
	//   80  137:areturn         
		} else
		{
			return view;
	//   81  138:aload_1         
	//   82  139:areturn         
		}
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #638 <Method void RecyclerView$LayoutManager.onInitializeAccessibilityEvent(AccessibilityEvent)>
		if(getChildCount() > 0)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #114 <Method int getChildCount()>
	//*   5    9:ifle            28
		{
			accessibilityevent.setFromIndex(findFirstVisibleItemPosition());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #640 <Method int findFirstVisibleItemPosition()>
	//    9   17:invokevirtual   #645 <Method void AccessibilityEvent.setFromIndex(int)>
			accessibilityevent.setToIndex(findLastVisibleItemPosition());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #647 <Method int findLastVisibleItemPosition()>
	//   13   25:invokevirtual   #650 <Method void AccessibilityEvent.setToIndex(int)>
		}
	//   14   28:return          
	}

	public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		Object obj = ((Object) (mPendingSavedState));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:astore          9
		int k = -1;
	//    3    6:iconst_m1       
	//    4    7:istore          5
		if((obj != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
	//*   5    9:aload           9
	//*   6   11:ifnonnull       22
	//*   7   14:aload_0         
	//*   8   15:getfield        #65  <Field int mPendingScrollPosition>
	//*   9   18:iconst_m1       
	//*  10   19:icmpeq          35
	//*  11   22:aload_2         
	//*  12   23:invokevirtual   #150 <Method int RecyclerView$State.getItemCount()>
	//*  13   26:ifne            35
		{
			removeAndRecycleAllViews(recycler);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #623 <Method void removeAndRecycleAllViews(RecyclerView$Recycler)>
			return;
	//   17   34:return          
		}
		obj = ((Object) (mPendingSavedState));
	//   18   35:aload_0         
	//   19   36:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   20   39:astore          9
		if(obj != null && ((SavedState) (obj)).hasValidAnchor())
	//*  21   41:aload           9
	//*  22   43:ifnull          65
	//*  23   46:aload           9
	//*  24   48:invokevirtual   #390 <Method boolean LinearLayoutManager$SavedState.hasValidAnchor()>
	//*  25   51:ifeq            65
			mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//   29   59:getfield        #460 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
	//   30   62:putfield        #65  <Field int mPendingScrollPosition>
		ensureLayoutState();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #117 <Method void ensureLayoutState()>
		mLayoutState.mRecycle = false;
	//   33   69:aload_0         
	//   34   70:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   35   73:iconst_0        
	//   36   74:putfield        #312 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
		resolveShouldLayoutReverse();
	//   37   77:aload_0         
	//   38   78:invokespecial   #462 <Method void resolveShouldLayoutReverse()>
		obj = ((Object) (getFocusedChild()));
	//   39   81:aload_0         
	//   40   82:invokevirtual   #357 <Method View getFocusedChild()>
	//   41   85:astore          9
		if(mAnchorInfo.mValid && mPendingScrollPosition == -1 && mPendingSavedState == null)
	//*  42   87:aload_0         
	//*  43   88:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//*  44   91:getfield        #655 <Field boolean LinearLayoutManager$AnchorInfo.mValid>
	//*  45   94:ifeq            176
	//*  46   97:aload_0         
	//*  47   98:getfield        #65  <Field int mPendingScrollPosition>
	//*  48  101:iconst_m1       
	//*  49  102:icmpne          176
	//*  50  105:aload_0         
	//*  51  106:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//*  52  109:ifnull          115
	//*  53  112:goto            176
		{
			if(obj != null && (mOrientationHelper.getDecoratedStart(((View) (obj))) >= mOrientationHelper.getEndAfterPadding() || mOrientationHelper.getDecoratedEnd(((View) (obj))) <= mOrientationHelper.getStartAfterPadding()))
	//*  54  115:aload           9
	//*  55  117:ifnull          219
	//*  56  120:aload_0         
	//*  57  121:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  58  124:aload           9
	//*  59  126:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//*  60  129:aload_0         
	//*  61  130:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  62  133:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//*  63  136:icmpge          158
	//*  64  139:aload_0         
	//*  65  140:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  66  143:aload           9
	//*  67  145:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//*  68  148:aload_0         
	//*  69  149:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  70  152:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//*  71  155:icmpgt          219
				mAnchorInfo.assignFromViewAndKeepVisibleRect(((View) (obj)), getPosition(((View) (obj))));
	//   72  158:aload_0         
	//   73  159:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   74  162:aload           9
	//   75  164:aload_0         
	//   76  165:aload           9
	//   77  167:invokevirtual   #224 <Method int getPosition(View)>
	//   78  170:invokevirtual   #365 <Method void LinearLayoutManager$AnchorInfo.assignFromViewAndKeepVisibleRect(View, int)>
		} else
	//*  79  173:goto            219
		{
			mAnchorInfo.reset();
	//   80  176:aload_0         
	//   81  177:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   82  180:invokevirtual   #658 <Method void LinearLayoutManager$AnchorInfo.reset()>
			AnchorInfo anchorinfo = mAnchorInfo;
	//   83  183:aload_0         
	//   84  184:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   85  187:astore          9
			anchorinfo.mLayoutFromEnd = mShouldReverseLayout ^ mStackFromEnd;
	//   86  189:aload           9
	//   87  191:aload_0         
	//   88  192:getfield        #59  <Field boolean mShouldReverseLayout>
	//   89  195:aload_0         
	//   90  196:getfield        #61  <Field boolean mStackFromEnd>
	//   91  199:ixor            
	//   92  200:putfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
			updateAnchorInfoForLayout(recycler, state, anchorinfo);
	//   93  203:aload_0         
	//   94  204:aload_1         
	//   95  205:aload_2         
	//   96  206:aload           9
	//   97  208:invokespecial   #660 <Method void updateAnchorInfoForLayout(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo)>
			mAnchorInfo.mValid = true;
	//   98  211:aload_0         
	//   99  212:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  100  215:iconst_1        
	//  101  216:putfield        #655 <Field boolean LinearLayoutManager$AnchorInfo.mValid>
		}
		int j = getExtraLayoutSpace(state);
	//  102  219:aload_0         
	//  103  220:aload_2         
	//  104  221:invokevirtual   #422 <Method int getExtraLayoutSpace(RecyclerView$State)>
	//  105  224:istore          4
		int i;
		if(mLayoutState.mLastScrollDelta >= 0)
	//* 106  226:aload_0         
	//* 107  227:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 108  230:getfield        #663 <Field int LinearLayoutManager$LayoutState.mLastScrollDelta>
	//* 109  233:iflt            245
		{
			i = j;
	//  110  236:iload           4
	//  111  238:istore_3        
			j = 0;
	//  112  239:iconst_0        
	//  113  240:istore          4
		} else
	//* 114  242:goto            247
		{
			i = 0;
	//  115  245:iconst_0        
	//  116  246:istore_3        
		}
		int l = j + mOrientationHelper.getStartAfterPadding();
	//  117  247:iload           4
	//  118  249:aload_0         
	//  119  250:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  120  253:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//  121  256:iadd            
	//  122  257:istore          6
		int i1 = i + mOrientationHelper.getEndPadding();
	//  123  259:iload_3         
	//  124  260:aload_0         
	//  125  261:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  126  264:invokevirtual   #425 <Method int OrientationHelper.getEndPadding()>
	//  127  267:iadd            
	//  128  268:istore          7
		i = l;
	//  129  270:iload           6
	//  130  272:istore_3        
		j = i1;
	//  131  273:iload           7
	//  132  275:istore          4
		if(state.isPreLayout())
	//* 133  277:aload_2         
	//* 134  278:invokevirtual   #206 <Method boolean RecyclerView$State.isPreLayout()>
	//* 135  281:ifeq            426
		{
			int l1 = mPendingScrollPosition;
	//  136  284:aload_0         
	//  137  285:getfield        #65  <Field int mPendingScrollPosition>
	//  138  288:istore          8
			i = l;
	//  139  290:iload           6
	//  140  292:istore_3        
			j = i1;
	//  141  293:iload           7
	//  142  295:istore          4
			if(l1 != -1)
	//* 143  297:iload           8
	//* 144  299:iconst_m1       
	//* 145  300:icmpeq          426
			{
				i = l;
	//  146  303:iload           6
	//  147  305:istore_3        
				j = i1;
	//  148  306:iload           7
	//  149  308:istore          4
				if(mPendingScrollPositionOffset != 0x80000000)
	//* 150  310:aload_0         
	//* 151  311:getfield        #67  <Field int mPendingScrollPositionOffset>
	//* 152  314:ldc1            #15  <Int 0x80000000>
	//* 153  316:icmpeq          426
				{
					View view = findViewByPosition(l1);
	//  154  319:aload_0         
	//  155  320:iload           8
	//  156  322:invokevirtual   #399 <Method View findViewByPosition(int)>
	//  157  325:astore          9
					i = l;
	//  158  327:iload           6
	//  159  329:istore_3        
					j = i1;
	//  160  330:iload           7
	//  161  332:istore          4
					if(view != null)
	//* 162  334:aload           9
	//* 163  336:ifnull          426
					{
						if(mShouldReverseLayout)
	//* 164  339:aload_0         
	//* 165  340:getfield        #59  <Field boolean mShouldReverseLayout>
	//* 166  343:ifeq            372
						{
							i = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view) - mPendingScrollPositionOffset;
	//  167  346:aload_0         
	//  168  347:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  169  350:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//  170  353:aload_0         
	//  171  354:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  172  357:aload           9
	//  173  359:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//  174  362:isub            
	//  175  363:aload_0         
	//  176  364:getfield        #67  <Field int mPendingScrollPositionOffset>
	//  177  367:isub            
	//  178  368:istore_3        
						} else
	//* 179  369:goto            401
						{
							i = mOrientationHelper.getDecoratedStart(view);
	//  180  372:aload_0         
	//  181  373:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  182  376:aload           9
	//  183  378:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//  184  381:istore_3        
							j = mOrientationHelper.getStartAfterPadding();
	//  185  382:aload_0         
	//  186  383:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  187  386:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//  188  389:istore          4
							i = mPendingScrollPositionOffset - (i - j);
	//  189  391:aload_0         
	//  190  392:getfield        #67  <Field int mPendingScrollPositionOffset>
	//  191  395:iload_3         
	//  192  396:iload           4
	//  193  398:isub            
	//  194  399:isub            
	//  195  400:istore_3        
						}
						if(i > 0)
	//* 196  401:iload_3         
	//* 197  402:ifle            417
						{
							i = l + i;
	//  198  405:iload           6
	//  199  407:iload_3         
	//  200  408:iadd            
	//  201  409:istore_3        
							j = i1;
	//  202  410:iload           7
	//  203  412:istore          4
						} else
	//* 204  414:goto            426
						{
							j = i1 - i;
	//  205  417:iload           7
	//  206  419:iload_3         
	//  207  420:isub            
	//  208  421:istore          4
							i = l;
	//  209  423:iload           6
	//  210  425:istore_3        
						}
					}
				}
			}
		}
		if(mAnchorInfo.mLayoutFromEnd)
	//* 211  426:aload_0         
	//* 212  427:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 213  430:getfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 214  433:ifeq            449
		{
			if(mShouldReverseLayout)
	//* 215  436:aload_0         
	//* 216  437:getfield        #59  <Field boolean mShouldReverseLayout>
	//* 217  440:ifeq            462
				k = 1;
	//  218  443:iconst_1        
	//  219  444:istore          5
		} else
	//* 220  446:goto            462
		if(!mShouldReverseLayout)
	//* 221  449:aload_0         
	//* 222  450:getfield        #59  <Field boolean mShouldReverseLayout>
	//* 223  453:ifeq            459
	//* 224  456:goto            462
			k = 1;
	//  225  459:iconst_1        
	//  226  460:istore          5
		onAnchorReady(recycler, state, mAnchorInfo, k);
	//  227  462:aload_0         
	//  228  463:aload_1         
	//  229  464:aload_2         
	//  230  465:aload_0         
	//  231  466:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  232  469:iload           5
	//  233  471:invokevirtual   #665 <Method void onAnchorReady(RecyclerView$Recycler, RecyclerView$State, LinearLayoutManager$AnchorInfo, int)>
		detachAndScrapAttachedViews(recycler);
	//  234  474:aload_0         
	//  235  475:aload_1         
	//  236  476:invokevirtual   #668 <Method void detachAndScrapAttachedViews(RecyclerView$Recycler)>
		mLayoutState.mInfinite = resolveIsInfinite();
	//  237  479:aload_0         
	//  238  480:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  239  483:aload_0         
	//  240  484:invokevirtual   #419 <Method boolean resolveIsInfinite()>
	//  241  487:putfield        #315 <Field boolean LinearLayoutManager$LayoutState.mInfinite>
		mLayoutState.mIsPreLayout = state.isPreLayout();
	//  242  490:aload_0         
	//  243  491:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  244  494:aload_2         
	//  245  495:invokevirtual   #206 <Method boolean RecyclerView$State.isPreLayout()>
	//  246  498:putfield        #671 <Field boolean LinearLayoutManager$LayoutState.mIsPreLayout>
		if(mAnchorInfo.mLayoutFromEnd)
	//* 247  501:aload_0         
	//* 248  502:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//* 249  505:getfield        #370 <Field boolean LinearLayoutManager$AnchorInfo.mLayoutFromEnd>
	//* 250  508:ifeq            712
		{
			updateLayoutStateToFillStart(mAnchorInfo);
	//  251  511:aload_0         
	//  252  512:aload_0         
	//  253  513:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  254  516:invokespecial   #673 <Method void updateLayoutStateToFillStart(LinearLayoutManager$AnchorInfo)>
			LayoutState layoutstate = mLayoutState;
	//  255  519:aload_0         
	//  256  520:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  257  523:astore          9
			layoutstate.mExtra = i;
	//  258  525:aload           9
	//  259  527:iload_3         
	//  260  528:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
			fill(recycler, layoutstate, state, false);
	//  261  531:aload_0         
	//  262  532:aload_1         
	//  263  533:aload           9
	//  264  535:aload_2         
	//  265  536:iconst_0        
	//  266  537:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  267  540:pop             
			k = mLayoutState.mOffset;
	//  268  541:aload_0         
	//  269  542:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  270  545:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  271  548:istore          5
			int j1 = mLayoutState.mCurrentPosition;
	//  272  550:aload_0         
	//  273  551:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  274  554:getfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  275  557:istore          7
			i = j;
	//  276  559:iload           4
	//  277  561:istore_3        
			if(mLayoutState.mAvailable > 0)
	//* 278  562:aload_0         
	//* 279  563:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 280  566:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 281  569:ifle            583
				i = j + mLayoutState.mAvailable;
	//  282  572:iload           4
	//  283  574:aload_0         
	//  284  575:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  285  578:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  286  581:iadd            
	//  287  582:istore_3        
			updateLayoutStateToFillEnd(mAnchorInfo);
	//  288  583:aload_0         
	//  289  584:aload_0         
	//  290  585:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  291  588:invokespecial   #675 <Method void updateLayoutStateToFillEnd(LinearLayoutManager$AnchorInfo)>
			layoutstate = mLayoutState;
	//  292  591:aload_0         
	//  293  592:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  294  595:astore          9
			layoutstate.mExtra = i;
	//  295  597:aload           9
	//  296  599:iload_3         
	//  297  600:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
			layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
	//  298  603:aload           9
	//  299  605:aload           9
	//  300  607:getfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  301  610:aload_0         
	//  302  611:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  303  614:getfield        #428 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  304  617:iadd            
	//  305  618:putfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state, false);
	//  306  621:aload_0         
	//  307  622:aload_1         
	//  308  623:aload_0         
	//  309  624:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  310  627:aload_2         
	//  311  628:iconst_0        
	//  312  629:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  313  632:pop             
			l = mLayoutState.mOffset;
	//  314  633:aload_0         
	//  315  634:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  316  637:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  317  640:istore          6
			j = k;
	//  318  642:iload           5
	//  319  644:istore          4
			i = l;
	//  320  646:iload           6
	//  321  648:istore_3        
			if(mLayoutState.mAvailable > 0)
	//* 322  649:aload_0         
	//* 323  650:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 324  653:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 325  656:ifle            912
			{
				i = mLayoutState.mAvailable;
	//  326  659:aload_0         
	//  327  660:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  328  663:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  329  666:istore_3        
				updateLayoutStateToFillStart(j1, k);
	//  330  667:aload_0         
	//  331  668:iload           7
	//  332  670:iload           5
	//  333  672:invokespecial   #257 <Method void updateLayoutStateToFillStart(int, int)>
				LayoutState layoutstate1 = mLayoutState;
	//  334  675:aload_0         
	//  335  676:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  336  679:astore          9
				layoutstate1.mExtra = i;
	//  337  681:aload           9
	//  338  683:iload_3         
	//  339  684:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
				fill(recycler, layoutstate1, state, false);
	//  340  687:aload_0         
	//  341  688:aload_1         
	//  342  689:aload           9
	//  343  691:aload_2         
	//  344  692:iconst_0        
	//  345  693:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  346  696:pop             
				j = mLayoutState.mOffset;
	//  347  697:aload_0         
	//  348  698:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  349  701:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  350  704:istore          4
				i = l;
	//  351  706:iload           6
	//  352  708:istore_3        
			}
		} else
	//* 353  709:goto            912
		{
			updateLayoutStateToFillEnd(mAnchorInfo);
	//  354  712:aload_0         
	//  355  713:aload_0         
	//  356  714:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  357  717:invokespecial   #675 <Method void updateLayoutStateToFillEnd(LinearLayoutManager$AnchorInfo)>
			LayoutState layoutstate2 = mLayoutState;
	//  358  720:aload_0         
	//  359  721:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  360  724:astore          9
			layoutstate2.mExtra = j;
	//  361  726:aload           9
	//  362  728:iload           4
	//  363  730:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
			fill(recycler, layoutstate2, state, false);
	//  364  733:aload_0         
	//  365  734:aload_1         
	//  366  735:aload           9
	//  367  737:aload_2         
	//  368  738:iconst_0        
	//  369  739:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  370  742:pop             
			k = mLayoutState.mOffset;
	//  371  743:aload_0         
	//  372  744:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  373  747:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  374  750:istore          5
			int k1 = mLayoutState.mCurrentPosition;
	//  375  752:aload_0         
	//  376  753:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  377  756:getfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  378  759:istore          7
			j = i;
	//  379  761:iload_3         
	//  380  762:istore          4
			if(mLayoutState.mAvailable > 0)
	//* 381  764:aload_0         
	//* 382  765:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 383  768:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 384  771:ifle            785
				j = i + mLayoutState.mAvailable;
	//  385  774:iload_3         
	//  386  775:aload_0         
	//  387  776:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  388  779:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  389  782:iadd            
	//  390  783:istore          4
			updateLayoutStateToFillStart(mAnchorInfo);
	//  391  785:aload_0         
	//  392  786:aload_0         
	//  393  787:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  394  790:invokespecial   #673 <Method void updateLayoutStateToFillStart(LinearLayoutManager$AnchorInfo)>
			layoutstate2 = mLayoutState;
	//  395  793:aload_0         
	//  396  794:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  397  797:astore          9
			layoutstate2.mExtra = j;
	//  398  799:aload           9
	//  399  801:iload           4
	//  400  803:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
			layoutstate2.mCurrentPosition = layoutstate2.mCurrentPosition + mLayoutState.mItemDirection;
	//  401  806:aload           9
	//  402  808:aload           9
	//  403  810:getfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
	//  404  813:aload_0         
	//  405  814:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  406  817:getfield        #428 <Field int LinearLayoutManager$LayoutState.mItemDirection>
	//  407  820:iadd            
	//  408  821:putfield        #431 <Field int LinearLayoutManager$LayoutState.mCurrentPosition>
			fill(recycler, mLayoutState, state, false);
	//  409  824:aload_0         
	//  410  825:aload_1         
	//  411  826:aload_0         
	//  412  827:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  413  830:aload_2         
	//  414  831:iconst_0        
	//  415  832:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  416  835:pop             
			l = mLayoutState.mOffset;
	//  417  836:aload_0         
	//  418  837:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  419  840:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  420  843:istore          6
			j = l;
	//  421  845:iload           6
	//  422  847:istore          4
			i = k;
	//  423  849:iload           5
	//  424  851:istore_3        
			if(mLayoutState.mAvailable > 0)
	//* 425  852:aload_0         
	//* 426  853:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//* 427  856:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//* 428  859:ifle            912
			{
				i = mLayoutState.mAvailable;
	//  429  862:aload_0         
	//  430  863:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  431  866:getfield        #263 <Field int LinearLayoutManager$LayoutState.mAvailable>
	//  432  869:istore_3        
				updateLayoutStateToFillEnd(k1, k);
	//  433  870:aload_0         
	//  434  871:iload           7
	//  435  873:iload           5
	//  436  875:invokespecial   #275 <Method void updateLayoutStateToFillEnd(int, int)>
				LayoutState layoutstate3 = mLayoutState;
	//  437  878:aload_0         
	//  438  879:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  439  882:astore          9
				layoutstate3.mExtra = i;
	//  440  884:aload           9
	//  441  886:iload_3         
	//  442  887:putfield        #260 <Field int LinearLayoutManager$LayoutState.mExtra>
				fill(recycler, layoutstate3, state, false);
	//  443  890:aload_0         
	//  444  891:aload_1         
	//  445  892:aload           9
	//  446  894:aload_2         
	//  447  895:iconst_0        
	//  448  896:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//  449  899:pop             
				i = mLayoutState.mOffset;
	//  450  900:aload_0         
	//  451  901:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//  452  904:getfield        #434 <Field int LinearLayoutManager$LayoutState.mOffset>
	//  453  907:istore_3        
				j = l;
	//  454  908:iload           6
	//  455  910:istore          4
			}
		}
		k = j;
	//  456  912:iload           4
	//  457  914:istore          5
		l = i;
	//  458  916:iload_3         
	//  459  917:istore          6
		if(getChildCount() > 0)
	//* 460  919:aload_0         
	//* 461  920:invokevirtual   #114 <Method int getChildCount()>
	//* 462  923:ifle            1027
			if(mShouldReverseLayout ^ mStackFromEnd)
	//* 463  926:aload_0         
	//* 464  927:getfield        #59  <Field boolean mShouldReverseLayout>
	//* 465  930:aload_0         
	//* 466  931:getfield        #61  <Field boolean mStackFromEnd>
	//* 467  934:ixor            
	//* 468  935:ifeq            985
			{
				l = fixLayoutEndGap(i, recycler, state, true);
	//  469  938:aload_0         
	//  470  939:iload_3         
	//  471  940:aload_1         
	//  472  941:aload_2         
	//  473  942:iconst_1        
	//  474  943:invokespecial   #677 <Method int fixLayoutEndGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  475  946:istore          6
				k = j + l;
	//  476  948:iload           4
	//  477  950:iload           6
	//  478  952:iadd            
	//  479  953:istore          5
				j = fixLayoutStartGap(k, recycler, state, false);
	//  480  955:aload_0         
	//  481  956:iload           5
	//  482  958:aload_1         
	//  483  959:aload_2         
	//  484  960:iconst_0        
	//  485  961:invokespecial   #679 <Method int fixLayoutStartGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  486  964:istore          4
				k += j;
	//  487  966:iload           5
	//  488  968:iload           4
	//  489  970:iadd            
	//  490  971:istore          5
				l = i + l + j;
	//  491  973:iload_3         
	//  492  974:iload           6
	//  493  976:iadd            
	//  494  977:iload           4
	//  495  979:iadd            
	//  496  980:istore          6
			} else
	//* 497  982:goto            1027
			{
				k = fixLayoutStartGap(j, recycler, state, true);
	//  498  985:aload_0         
	//  499  986:iload           4
	//  500  988:aload_1         
	//  501  989:aload_2         
	//  502  990:iconst_1        
	//  503  991:invokespecial   #679 <Method int fixLayoutStartGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  504  994:istore          5
				i += k;
	//  505  996:iload_3         
	//  506  997:iload           5
	//  507  999:iadd            
	//  508 1000:istore_3        
				l = fixLayoutEndGap(i, recycler, state, false);
	//  509 1001:aload_0         
	//  510 1002:iload_3         
	//  511 1003:aload_1         
	//  512 1004:aload_2         
	//  513 1005:iconst_0        
	//  514 1006:invokespecial   #677 <Method int fixLayoutEndGap(int, RecyclerView$Recycler, RecyclerView$State, boolean)>
	//  515 1009:istore          6
				k = j + k + l;
	//  516 1011:iload           4
	//  517 1013:iload           5
	//  518 1015:iadd            
	//  519 1016:iload           6
	//  520 1018:iadd            
	//  521 1019:istore          5
				l = i + l;
	//  522 1021:iload_3         
	//  523 1022:iload           6
	//  524 1024:iadd            
	//  525 1025:istore          6
			}
		layoutForPredictiveAnimations(recycler, state, k, l);
	//  526 1027:aload_0         
	//  527 1028:aload_1         
	//  528 1029:aload_2         
	//  529 1030:iload           5
	//  530 1032:iload           6
	//  531 1034:invokespecial   #681 <Method void layoutForPredictiveAnimations(RecyclerView$Recycler, RecyclerView$State, int, int)>
		if(!state.isPreLayout())
	//* 532 1037:aload_2         
	//* 533 1038:invokevirtual   #206 <Method boolean RecyclerView$State.isPreLayout()>
	//* 534 1041:ifne            1054
			mOrientationHelper.onLayoutComplete();
	//  535 1044:aload_0         
	//  536 1045:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  537 1048:invokevirtual   #684 <Method void OrientationHelper.onLayoutComplete()>
		else
	//* 538 1051:goto            1061
			mAnchorInfo.reset();
	//  539 1054:aload_0         
	//  540 1055:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//  541 1058:invokevirtual   #658 <Method void LinearLayoutManager$AnchorInfo.reset()>
		mLastStackFromEnd = mStackFromEnd;
	//  542 1061:aload_0         
	//  543 1062:aload_0         
	//  544 1063:getfield        #61  <Field boolean mStackFromEnd>
	//  545 1066:putfield        #367 <Field boolean mLastStackFromEnd>
	//  546 1069:return          
	}

	public void onLayoutCompleted(RecyclerView.State state)
	{
		super.onLayoutCompleted(state);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #688 <Method void RecyclerView$LayoutManager.onLayoutCompleted(RecyclerView$State)>
		mPendingSavedState = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
		mPendingScrollPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #65  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//    9   15:aload_0         
	//   10   16:ldc1            #15  <Int 0x80000000>
	//   11   18:putfield        #67  <Field int mPendingScrollPositionOffset>
		mAnchorInfo.reset();
	//   12   21:aload_0         
	//   13   22:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   14   25:invokevirtual   #658 <Method void LinearLayoutManager$AnchorInfo.reset()>
	//   15   28:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(parcelable instanceof SavedState)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #387 <Class LinearLayoutManager$SavedState>
	//*   2    4:ifeq            19
		{
			mPendingSavedState = (SavedState)parcelable;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #387 <Class LinearLayoutManager$SavedState>
	//    6   12:putfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
			requestLayout();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #693 <Method void requestLayout()>
		}
	//    9   19:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = mPendingSavedState;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:astore_2        
		if(savedstate != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			return ((Parcelable) (new SavedState(savedstate)));
	//    5    9:new             #387 <Class LinearLayoutManager$SavedState>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:invokespecial   #698 <Method void LinearLayoutManager$SavedState(LinearLayoutManager$SavedState)>
	//    9   17:areturn         
		savedstate = new SavedState();
	//   10   18:new             #387 <Class LinearLayoutManager$SavedState>
	//   11   21:dup             
	//   12   22:invokespecial   #699 <Method void LinearLayoutManager$SavedState()>
	//   13   25:astore_2        
		if(getChildCount() > 0)
	//*  14   26:aload_0         
	//*  15   27:invokevirtual   #114 <Method int getChildCount()>
	//*  16   30:ifle            128
		{
			ensureLayoutState();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #117 <Method void ensureLayoutState()>
			boolean flag = mLastStackFromEnd ^ mShouldReverseLayout;
	//   19   37:aload_0         
	//   20   38:getfield        #367 <Field boolean mLastStackFromEnd>
	//   21   41:aload_0         
	//   22   42:getfield        #59  <Field boolean mShouldReverseLayout>
	//   23   45:ixor            
	//   24   46:istore_1        
			savedstate.mAnchorLayoutFromEnd = flag;
	//   25   47:aload_2         
	//   26   48:iload_1         
	//   27   49:putfield        #393 <Field boolean LinearLayoutManager$SavedState.mAnchorLayoutFromEnd>
			if(flag)
	//*  28   52:iload_1         
	//*  29   53:ifeq            92
			{
				View view = getChildClosestToEnd();
	//   30   56:aload_0         
	//   31   57:invokespecial   #272 <Method View getChildClosestToEnd()>
	//   32   60:astore_3        
				savedstate.mAnchorOffset = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view);
	//   33   61:aload_2         
	//   34   62:aload_0         
	//   35   63:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   36   66:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//   37   69:aload_0         
	//   38   70:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   39   73:aload_3         
	//   40   74:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   41   77:isub            
	//   42   78:putfield        #396 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
				savedstate.mAnchorPosition = getPosition(view);
	//   43   81:aload_2         
	//   44   82:aload_0         
	//   45   83:aload_3         
	//   46   84:invokevirtual   #224 <Method int getPosition(View)>
	//   47   87:putfield        #460 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
				return ((Parcelable) (savedstate));
	//   48   90:aload_2         
	//   49   91:areturn         
			} else
			{
				View view1 = getChildClosestToStart();
	//   50   92:aload_0         
	//   51   93:invokespecial   #253 <Method View getChildClosestToStart()>
	//   52   96:astore_3        
				savedstate.mAnchorPosition = getPosition(view1);
	//   53   97:aload_2         
	//   54   98:aload_0         
	//   55   99:aload_3         
	//   56  100:invokevirtual   #224 <Method int getPosition(View)>
	//   57  103:putfield        #460 <Field int LinearLayoutManager$SavedState.mAnchorPosition>
				savedstate.mAnchorOffset = mOrientationHelper.getDecoratedStart(view1) - mOrientationHelper.getStartAfterPadding();
	//   58  106:aload_2         
	//   59  107:aload_0         
	//   60  108:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   61  111:aload_3         
	//   62  112:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//   63  115:aload_0         
	//   64  116:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   65  119:invokevirtual   #190 <Method int OrientationHelper.getStartAfterPadding()>
	//   66  122:isub            
	//   67  123:putfield        #396 <Field int LinearLayoutManager$SavedState.mAnchorOffset>
				return ((Parcelable) (savedstate));
	//   68  126:aload_2         
	//   69  127:areturn         
			}
		} else
		{
			savedstate.invalidateAnchor();
	//   70  128:aload_2         
	//   71  129:invokevirtual   #702 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
			return ((Parcelable) (savedstate));
	//   72  132:aload_2         
	//   73  133:areturn         
		}
	}

	public void prepareForDrop(View view, View view1, int i, int j)
	{
		assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
	//    0    0:aload_0         
	//    1    1:ldc2            #706 <String "Cannot drop a view during a scroll or layout calculation">
	//    2    4:invokevirtual   #707 <Method void assertNotInLayoutOrScroll(String)>
		ensureLayoutState();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #117 <Method void ensureLayoutState()>
		resolveShouldLayoutReverse();
	//    5   11:aload_0         
	//    6   12:invokespecial   #462 <Method void resolveShouldLayoutReverse()>
		i = getPosition(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #224 <Method int getPosition(View)>
	//   10   20:istore_3        
		j = getPosition(view1);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #224 <Method int getPosition(View)>
	//   14   26:istore          4
		if(i < j)
	//*  15   28:iload_3         
	//*  16   29:iload           4
	//*  17   31:icmpge          39
			i = 1;
	//   18   34:iconst_1        
	//   19   35:istore_3        
		else
	//*  20   36:goto            41
			i = -1;
	//   21   39:iconst_m1       
	//   22   40:istore_3        
		if(mShouldReverseLayout)
	//*  23   41:aload_0         
	//*  24   42:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  25   45:ifeq            108
			if(i == 1)
	//*  26   48:iload_3         
	//*  27   49:iconst_1        
	//*  28   50:icmpne          85
			{
				scrollToPositionWithOffset(j, mOrientationHelper.getEndAfterPadding() - (mOrientationHelper.getDecoratedStart(view1) + mOrientationHelper.getDecoratedMeasurement(view)));
	//   29   53:aload_0         
	//   30   54:iload           4
	//   31   56:aload_0         
	//   32   57:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   33   60:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//   34   63:aload_0         
	//   35   64:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   36   67:aload_2         
	//   37   68:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//   38   71:aload_0         
	//   39   72:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   40   75:aload_1         
	//   41   76:invokevirtual   #243 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   42   79:iadd            
	//   43   80:isub            
	//   44   81:invokevirtual   #710 <Method void scrollToPositionWithOffset(int, int)>
				return;
	//   45   84:return          
			} else
			{
				scrollToPositionWithOffset(j, mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(view1));
	//   46   85:aload_0         
	//   47   86:iload           4
	//   48   88:aload_0         
	//   49   89:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   50   92:invokevirtual   #179 <Method int OrientationHelper.getEndAfterPadding()>
	//   51   95:aload_0         
	//   52   96:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   53   99:aload_2         
	//   54  100:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   55  103:isub            
	//   56  104:invokevirtual   #710 <Method void scrollToPositionWithOffset(int, int)>
				return;
	//   57  107:return          
			}
		if(i == -1)
	//*  58  108:iload_3         
	//*  59  109:iconst_m1       
	//*  60  110:icmpne          128
		{
			scrollToPositionWithOffset(j, mOrientationHelper.getDecoratedStart(view1));
	//   61  113:aload_0         
	//   62  114:iload           4
	//   63  116:aload_0         
	//   64  117:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   65  120:aload_2         
	//   66  121:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//   67  124:invokevirtual   #710 <Method void scrollToPositionWithOffset(int, int)>
			return;
	//   68  127:return          
		} else
		{
			scrollToPositionWithOffset(j, mOrientationHelper.getDecoratedEnd(view1) - mOrientationHelper.getDecoratedMeasurement(view));
	//   69  128:aload_0         
	//   70  129:iload           4
	//   71  131:aload_0         
	//   72  132:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   73  135:aload_2         
	//   74  136:invokevirtual   #345 <Method int OrientationHelper.getDecoratedEnd(View)>
	//   75  139:aload_0         
	//   76  140:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   77  143:aload_1         
	//   78  144:invokevirtual   #243 <Method int OrientationHelper.getDecoratedMeasurement(View)>
	//   79  147:isub            
	//   80  148:invokevirtual   #710 <Method void scrollToPositionWithOffset(int, int)>
			return;
	//   81  151:return          
		}
	}

	boolean resolveIsInfinite()
	{
		return mOrientationHelper.getMode() == 0 && mOrientationHelper.getEnd() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    2    4:invokevirtual   #713 <Method int OrientationHelper.getMode()>
	//    3    7:ifne            22
	//    4   10:aload_0         
	//    5   11:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//    6   14:invokevirtual   #337 <Method int OrientationHelper.getEnd()>
	//    7   17:ifne            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(getChildCount() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #114 <Method int getChildCount()>
	//*   2    4:ifeq            114
		{
			if(i == 0)
	//*   3    7:iload_1         
	//*   4    8:ifne            13
				return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
			mLayoutState.mRecycle = true;
	//    7   13:aload_0         
	//    8   14:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//    9   17:iconst_1        
	//   10   18:putfield        #312 <Field boolean LinearLayoutManager$LayoutState.mRecycle>
			ensureLayoutState();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #117 <Method void ensureLayoutState()>
			byte byte0;
			if(i > 0)
	//*  13   25:iload_1         
	//*  14   26:ifle            35
				byte0 = 1;
	//   15   29:iconst_1        
	//   16   30:istore          4
			else
	//*  17   32:goto            38
				byte0 = -1;
	//   18   35:iconst_m1       
	//   19   36:istore          4
			int j = Math.abs(i);
	//   20   38:iload_1         
	//   21   39:invokestatic    #449 <Method int Math.abs(int)>
	//   22   42:istore          5
			updateLayoutState(((int) (byte0)), j, true, state);
	//   23   44:aload_0         
	//   24   45:iload           4
	//   25   47:iload           5
	//   26   49:iconst_1        
	//   27   50:aload_3         
	//   28   51:invokespecial   #451 <Method void updateLayoutState(int, int, boolean, RecyclerView$State)>
			int k = mLayoutState.mScrollingOffset + fill(recycler, mLayoutState, state, false);
	//   29   54:aload_0         
	//   30   55:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   31   58:getfield        #321 <Field int LinearLayoutManager$LayoutState.mScrollingOffset>
	//   32   61:aload_0         
	//   33   62:aload_2         
	//   34   63:aload_0         
	//   35   64:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   36   67:aload_3         
	//   37   68:iconst_0        
	//   38   69:invokevirtual   #270 <Method int fill(RecyclerView$Recycler, LinearLayoutManager$LayoutState, RecyclerView$State, boolean)>
	//   39   72:iadd            
	//   40   73:istore          6
			if(k < 0)
	//*  41   75:iload           6
	//*  42   77:ifge            82
				return 0;
	//   43   80:iconst_0        
	//   44   81:ireturn         
			if(j > k)
	//*  45   82:iload           5
	//*  46   84:iload           6
	//*  47   86:icmple          95
				i = byte0 * k;
	//   48   89:iload           4
	//   49   91:iload           6
	//   50   93:imul            
	//   51   94:istore_1        
			mOrientationHelper.offsetChildren(-i);
	//   52   95:aload_0         
	//   53   96:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   54   99:iload_1         
	//   55  100:ineg            
	//   56  101:invokevirtual   #186 <Method void OrientationHelper.offsetChildren(int)>
			mLayoutState.mLastScrollDelta = i;
	//   57  104:aload_0         
	//   58  105:getfield        #245 <Field LinearLayoutManager$LayoutState mLayoutState>
	//   59  108:iload_1         
	//   60  109:putfield        #663 <Field int LinearLayoutManager$LayoutState.mLastScrollDelta>
			return i;
	//   61  112:iload_1         
	//   62  113:ireturn         
		} else
		{
			return 0;
	//   63  114:iconst_0        
	//   64  115:ireturn         
		}
	}

	public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		else
			return scrollBy(i, recycler, state);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #183 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   11   17:ireturn         
	}

	public void scrollToPosition(int i)
	{
		mPendingScrollPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <Int 0x80000000>
	//    5    8:putfield        #67  <Field int mPendingScrollPositionOffset>
		SavedState savedstate = mPendingSavedState;
	//    6   11:aload_0         
	//    7   12:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    8   15:astore_2        
		if(savedstate != null)
	//*   9   16:aload_2         
	//*  10   17:ifnull          24
			savedstate.invalidateAnchor();
	//   11   20:aload_2         
	//   12   21:invokevirtual   #702 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
		requestLayout();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #693 <Method void requestLayout()>
	//   15   28:return          
	}

	public void scrollToPositionWithOffset(int i, int j)
	{
		mPendingScrollPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field int mPendingScrollPosition>
		mPendingScrollPositionOffset = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #67  <Field int mPendingScrollPositionOffset>
		SavedState savedstate = mPendingSavedState;
	//    6   10:aload_0         
	//    7   11:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    8   14:astore_3        
		if(savedstate != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          23
			savedstate.invalidateAnchor();
	//   11   19:aload_3         
	//   12   20:invokevirtual   #702 <Method void LinearLayoutManager$SavedState.invalidateAnchor()>
		requestLayout();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #693 <Method void requestLayout()>
	//   15   27:return          
	}

	public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
	{
		if(mOrientation == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int mOrientation>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return scrollBy(i, recycler, state);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #183 <Method int scrollBy(int, RecyclerView$Recycler, RecyclerView$State)>
	//   10   16:ireturn         
	}

	public void setInitialPrefetchItemCount(int i)
	{
		mInitialPrefetchItemCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field int mInitialPrefetchItemCount>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		if(i != 0 && i != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            46
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpne          12
	//*   5    9:goto            46
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #286 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #287 <Method void StringBuilder()>
	//    9   19:astore_2        
			stringbuilder.append("invalid orientation:");
	//   10   20:aload_2         
	//   11   21:ldc2            #719 <String "invalid orientation:">
	//   12   24:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			stringbuilder.append(i);
	//   14   28:aload_2         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #296 <Method StringBuilder StringBuilder.append(int)>
	//   17   33:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   18   34:new             #721 <Class IllegalArgumentException>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:invokevirtual   #305 <Method String StringBuilder.toString()>
	//   22   42:invokespecial   #723 <Method void IllegalArgumentException(String)>
	//   23   45:athrow          
		}
		assertNotInLayoutOrScroll(((String) (null)));
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:invokevirtual   #707 <Method void assertNotInLayoutOrScroll(String)>
		if(i != mOrientation || mOrientationHelper == null)
	//*  27   51:iload_1         
	//*  28   52:aload_0         
	//*  29   53:getfield        #55  <Field int mOrientation>
	//*  30   56:icmpne          66
	//*  31   59:aload_0         
	//*  32   60:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//*  33   63:ifnonnull       95
		{
			mOrientationHelper = OrientationHelper.createOrientationHelper(((RecyclerView.LayoutManager) (this)), i);
	//   34   66:aload_0         
	//   35   67:aload_0         
	//   36   68:iload_1         
	//   37   69:invokestatic    #727 <Method OrientationHelper OrientationHelper.createOrientationHelper(RecyclerView$LayoutManager, int)>
	//   38   72:putfield        #119 <Field OrientationHelper mOrientationHelper>
			mAnchorInfo.mOrientationHelper = mOrientationHelper;
	//   39   75:aload_0         
	//   40   76:getfield        #74  <Field LinearLayoutManager$AnchorInfo mAnchorInfo>
	//   41   79:aload_0         
	//   42   80:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   43   83:putfield        #728 <Field OrientationHelper LinearLayoutManager$AnchorInfo.mOrientationHelper>
			mOrientation = i;
	//   44   86:aload_0         
	//   45   87:iload_1         
	//   46   88:putfield        #55  <Field int mOrientation>
			requestLayout();
	//   47   91:aload_0         
	//   48   92:invokevirtual   #693 <Method void requestLayout()>
		}
	//   49   95:return          
	}

	public void setRecycleChildrenOnDetach(boolean flag)
	{
		mRecycleChildrenOnDetach = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #562 <Field boolean mRecycleChildrenOnDetach>
	//    3    5:return          
	}

	public void setReverseLayout(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #707 <Method void assertNotInLayoutOrScroll(String)>
		if(flag == mReverseLayout)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #57  <Field boolean mReverseLayout>
	//*   6   10:icmpne          14
		{
			return;
	//    7   13:return          
		} else
		{
			mReverseLayout = flag;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #57  <Field boolean mReverseLayout>
			requestLayout();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #693 <Method void requestLayout()>
			return;
	//   13   23:return          
		}
	}

	public void setSmoothScrollbarEnabled(boolean flag)
	{
		mSmoothScrollbarEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field boolean mSmoothScrollbarEnabled>
	//    3    5:return          
	}

	public void setStackFromEnd(boolean flag)
	{
		assertNotInLayoutOrScroll(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #707 <Method void assertNotInLayoutOrScroll(String)>
		if(mStackFromEnd == flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #61  <Field boolean mStackFromEnd>
	//*   5    9:iload_1         
	//*   6   10:icmpne          14
		{
			return;
	//    7   13:return          
		} else
		{
			mStackFromEnd = flag;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #61  <Field boolean mStackFromEnd>
			requestLayout();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #693 <Method void requestLayout()>
			return;
	//   13   23:return          
		}
	}

	boolean shouldMeasureTwice()
	{
		return getHeightMode() != 0x40000000 && getWidthMode() != 0x40000000 && hasFlexibleChildInBothOrientations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #734 <Method int getHeightMode()>
	//    2    4:ldc2            #735 <Int 0x40000000>
	//    3    7:icmpeq          29
	//    4   10:aload_0         
	//    5   11:invokevirtual   #738 <Method int getWidthMode()>
	//    6   14:ldc2            #735 <Int 0x40000000>
	//    7   17:icmpeq          29
	//    8   20:aload_0         
	//    9   21:invokevirtual   #741 <Method boolean hasFlexibleChildInBothOrientations()>
	//   10   24:ifeq            29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
	{
		recyclerview = ((RecyclerView) (new LinearSmoothScroller(recyclerview.getContext())));
	//    0    0:new             #745 <Class LinearSmoothScroller>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #751 <Method Context RecyclerView.getContext()>
	//    4    8:invokespecial   #753 <Method void LinearSmoothScroller(Context)>
	//    5   11:astore_1        
		((LinearSmoothScroller) (recyclerview)).setTargetPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokevirtual   #756 <Method void LinearSmoothScroller.setTargetPosition(int)>
		startSmoothScroll(((RecyclerView.SmoothScroller) (recyclerview)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #760 <Method void startSmoothScroll(RecyclerView$SmoothScroller)>
	//   12   22:return          
	}

	public boolean supportsPredictiveItemAnimations()
	{
		return mPendingSavedState == null && mLastStackFromEnd == mStackFromEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field LinearLayoutManager$SavedState mPendingSavedState>
	//    2    4:ifnonnull       20
	//    3    7:aload_0         
	//    4    8:getfield        #367 <Field boolean mLastStackFromEnd>
	//    5   11:aload_0         
	//    6   12:getfield        #61  <Field boolean mStackFromEnd>
	//    7   15:icmpne          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	void validateChildOrder()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #286 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #287 <Method void StringBuilder()>
	//    3    7:astore          8
		stringbuilder.append("validating child count ");
	//    4    9:aload           8
	//    5   11:ldc2            #763 <String "validating child count ">
	//    6   14:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(getChildCount());
	//    8   18:aload           8
	//    9   20:aload_0         
	//   10   21:invokevirtual   #114 <Method int getChildCount()>
	//   11   24:invokevirtual   #296 <Method StringBuilder StringBuilder.append(int)>
	//   12   27:pop             
		Log.d("LinearLayoutManager", stringbuilder.toString());
	//   13   28:ldc1            #22  <String "LinearLayoutManager">
	//   14   30:aload           8
	//   15   32:invokevirtual   #305 <Method String StringBuilder.toString()>
	//   16   35:invokestatic    #284 <Method int Log.d(String, String)>
	//   17   38:pop             
		if(getChildCount() < 1)
	//*  18   39:aload_0         
	//*  19   40:invokevirtual   #114 <Method int getChildCount()>
	//*  20   43:iconst_1        
	//*  21   44:icmpge          48
			return;
	//   22   47:return          
		boolean flag2 = false;
	//   23   48:iconst_0        
	//   24   49:istore          7
		boolean flag = false;
	//   25   51:iconst_0        
	//   26   52:istore          6
		int k = getPosition(getChildAt(0));
	//   27   54:aload_0         
	//   28   55:aload_0         
	//   29   56:iconst_0        
	//   30   57:invokevirtual   #196 <Method View getChildAt(int)>
	//   31   60:invokevirtual   #224 <Method int getPosition(View)>
	//   32   63:istore_2        
		int l = mOrientationHelper.getDecoratedStart(getChildAt(0));
	//   33   64:aload_0         
	//   34   65:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   35   68:aload_0         
	//   36   69:iconst_0        
	//   37   70:invokevirtual   #196 <Method View getChildAt(int)>
	//   38   73:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//   39   76:istore_3        
		if(mShouldReverseLayout)
	//*  40   77:aload_0         
	//*  41   78:getfield        #59  <Field boolean mShouldReverseLayout>
	//*  42   81:ifeq            206
		{
			for(int i = 1; i < getChildCount();)
	//*  43   84:iconst_1        
	//*  44   85:istore_1        
	//*  45   86:iload_1         
	//*  46   87:aload_0         
	//*  47   88:invokevirtual   #114 <Method int getChildCount()>
	//*  48   91:icmpge          332
			{
				View view = getChildAt(i);
	//   49   94:aload_0         
	//   50   95:iload_1         
	//   51   96:invokevirtual   #196 <Method View getChildAt(int)>
	//   52   99:astore          8
				int i1 = getPosition(view);
	//   53  101:aload_0         
	//   54  102:aload           8
	//   55  104:invokevirtual   #224 <Method int getPosition(View)>
	//   56  107:istore          4
				int k1 = mOrientationHelper.getDecoratedStart(view);
	//   57  109:aload_0         
	//   58  110:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//   59  113:aload           8
	//   60  115:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//   61  118:istore          5
				if(i1 < k)
	//*  62  120:iload           4
	//*  63  122:iload_2         
	//*  64  123:icmpge          178
				{
					logChildren();
	//   65  126:aload_0         
	//   66  127:invokespecial   #765 <Method void logChildren()>
					StringBuilder stringbuilder1 = new StringBuilder();
	//   67  130:new             #286 <Class StringBuilder>
	//   68  133:dup             
	//   69  134:invokespecial   #287 <Method void StringBuilder()>
	//   70  137:astore          8
					stringbuilder1.append("detected invalid position. loc invalid? ");
	//   71  139:aload           8
	//   72  141:ldc2            #767 <String "detected invalid position. loc invalid? ">
	//   73  144:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//   74  147:pop             
					if(k1 < l)
	//*  75  148:iload           5
	//*  76  150:iload_3         
	//*  77  151:icmpge          157
						flag = true;
	//   78  154:iconst_1        
	//   79  155:istore          6
					stringbuilder1.append(flag);
	//   80  157:aload           8
	//   81  159:iload           6
	//   82  161:invokevirtual   #770 <Method StringBuilder StringBuilder.append(boolean)>
	//   83  164:pop             
					throw new RuntimeException(stringbuilder1.toString());
	//   84  165:new             #772 <Class RuntimeException>
	//   85  168:dup             
	//   86  169:aload           8
	//   87  171:invokevirtual   #305 <Method String StringBuilder.toString()>
	//   88  174:invokespecial   #773 <Method void RuntimeException(String)>
	//   89  177:athrow          
				}
				if(k1 <= l)
	//*  90  178:iload           5
	//*  91  180:iload_3         
	//*  92  181:icmpgt          191
				{
					i++;
	//   93  184:iload_1         
	//   94  185:iconst_1        
	//   95  186:iadd            
	//   96  187:istore_1        
				} else
	//*  97  188:goto            86
				{
					logChildren();
	//   98  191:aload_0         
	//   99  192:invokespecial   #765 <Method void logChildren()>
					throw new RuntimeException("detected invalid location");
	//  100  195:new             #772 <Class RuntimeException>
	//  101  198:dup             
	//  102  199:ldc2            #775 <String "detected invalid location">
	//  103  202:invokespecial   #773 <Method void RuntimeException(String)>
	//  104  205:athrow          
				}
			}

		} else
		{
			for(int j = 1; j < getChildCount();)
	//* 105  206:iconst_1        
	//* 106  207:istore_1        
	//* 107  208:iload_1         
	//* 108  209:aload_0         
	//* 109  210:invokevirtual   #114 <Method int getChildCount()>
	//* 110  213:icmpge          332
			{
				View view1 = getChildAt(j);
	//  111  216:aload_0         
	//  112  217:iload_1         
	//  113  218:invokevirtual   #196 <Method View getChildAt(int)>
	//  114  221:astore          8
				int j1 = getPosition(view1);
	//  115  223:aload_0         
	//  116  224:aload           8
	//  117  226:invokevirtual   #224 <Method int getPosition(View)>
	//  118  229:istore          4
				int l1 = mOrientationHelper.getDecoratedStart(view1);
	//  119  231:aload_0         
	//  120  232:getfield        #119 <Field OrientationHelper mOrientationHelper>
	//  121  235:aload           8
	//  122  237:invokevirtual   #301 <Method int OrientationHelper.getDecoratedStart(View)>
	//  123  240:istore          5
				if(j1 < k)
	//* 124  242:iload           4
	//* 125  244:iload_2         
	//* 126  245:icmpge          304
				{
					logChildren();
	//  127  248:aload_0         
	//  128  249:invokespecial   #765 <Method void logChildren()>
					StringBuilder stringbuilder2 = new StringBuilder();
	//  129  252:new             #286 <Class StringBuilder>
	//  130  255:dup             
	//  131  256:invokespecial   #287 <Method void StringBuilder()>
	//  132  259:astore          8
					stringbuilder2.append("detected invalid position. loc invalid? ");
	//  133  261:aload           8
	//  134  263:ldc2            #767 <String "detected invalid position. loc invalid? ">
	//  135  266:invokevirtual   #293 <Method StringBuilder StringBuilder.append(String)>
	//  136  269:pop             
					boolean flag1 = flag2;
	//  137  270:iload           7
	//  138  272:istore          6
					if(l1 < l)
	//* 139  274:iload           5
	//* 140  276:iload_3         
	//* 141  277:icmpge          283
						flag1 = true;
	//  142  280:iconst_1        
	//  143  281:istore          6
					stringbuilder2.append(flag1);
	//  144  283:aload           8
	//  145  285:iload           6
	//  146  287:invokevirtual   #770 <Method StringBuilder StringBuilder.append(boolean)>
	//  147  290:pop             
					throw new RuntimeException(stringbuilder2.toString());
	//  148  291:new             #772 <Class RuntimeException>
	//  149  294:dup             
	//  150  295:aload           8
	//  151  297:invokevirtual   #305 <Method String StringBuilder.toString()>
	//  152  300:invokespecial   #773 <Method void RuntimeException(String)>
	//  153  303:athrow          
				}
				if(l1 >= l)
	//* 154  304:iload           5
	//* 155  306:iload_3         
	//* 156  307:icmplt          317
				{
					j++;
	//  157  310:iload_1         
	//  158  311:iconst_1        
	//  159  312:iadd            
	//  160  313:istore_1        
				} else
	//* 161  314:goto            208
				{
					logChildren();
	//  162  317:aload_0         
	//  163  318:invokespecial   #765 <Method void logChildren()>
					throw new RuntimeException("detected invalid location");
	//  164  321:new             #772 <Class RuntimeException>
	//  165  324:dup             
	//  166  325:ldc2            #775 <String "detected invalid location">
	//  167  328:invokespecial   #773 <Method void RuntimeException(String)>
	//  168  331:athrow          
				}
			}

		}
	//  169  332:return          
	}

	static final boolean DEBUG = false;
	public static final int HORIZONTAL = 0;
	public static final int INVALID_OFFSET = 0x80000000;
	private static final float MAX_SCROLL_FACTOR = 0.3333333F;
	private static final String TAG = "LinearLayoutManager";
	public static final int VERTICAL = 1;
	final AnchorInfo mAnchorInfo;
	private int mInitialPrefetchItemCount;
	private boolean mLastStackFromEnd;
	private final LayoutChunkResult mLayoutChunkResult;
	private LayoutState mLayoutState;
	int mOrientation;
	OrientationHelper mOrientationHelper;
	SavedState mPendingSavedState;
	int mPendingScrollPosition;
	int mPendingScrollPositionOffset;
	private boolean mRecycleChildrenOnDetach;
	private boolean mReverseLayout;
	boolean mShouldReverseLayout;
	private boolean mSmoothScrollbarEnabled;
	private boolean mStackFromEnd;

	private class AnchorInfo
	{

		void assignCoordinateFromPadding()
		{
			int i;
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            18
				i = mOrientationHelper.getEndAfterPadding();
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//    5   11:invokevirtual   #31  <Method int OrientationHelper.getEndAfterPadding()>
		//    6   14:istore_1        
			else
		//*   7   15:goto            26
				i = mOrientationHelper.getStartAfterPadding();
		//    8   18:aload_0         
		//    9   19:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   10   22:invokevirtual   #34  <Method int OrientationHelper.getStartAfterPadding()>
		//   11   25:istore_1        
			mCoordinate = i;
		//   12   26:aload_0         
		//   13   27:iload_1         
		//   14   28:putfield        #36  <Field int mCoordinate>
		//   15   31:return          
		}

		public void assignFromView(View view, int i)
		{
			if(mLayoutFromEnd)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field boolean mLayoutFromEnd>
		//*   2    4:ifeq            30
				mCoordinate = mOrientationHelper.getDecoratedEnd(view) + mOrientationHelper.getTotalSpaceChange();
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #42  <Method int OrientationHelper.getDecoratedEnd(View)>
		//    8   16:aload_0         
		//    9   17:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   10   20:invokevirtual   #45  <Method int OrientationHelper.getTotalSpaceChange()>
		//   11   23:iadd            
		//   12   24:putfield        #36  <Field int mCoordinate>
			else
		//*  13   27:goto            42
				mCoordinate = mOrientationHelper.getDecoratedStart(view);
		//   14   30:aload_0         
		//   15   31:aload_0         
		//   16   32:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #48  <Method int OrientationHelper.getDecoratedStart(View)>
		//   19   39:putfield        #36  <Field int mCoordinate>
			mPosition = i;
		//   20   42:aload_0         
		//   21   43:iload_2         
		//   22   44:putfield        #50  <Field int mPosition>
		//   23   47:return          
		}

		public void assignFromViewAndKeepVisibleRect(View view, int i)
		{
			int j = mOrientationHelper.getTotalSpaceChange();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//    2    4:invokevirtual   #45  <Method int OrientationHelper.getTotalSpaceChange()>
		//    3    7:istore_3        
			if(j >= 0)
		//*   4    8:iload_3         
		//*   5    9:iflt            19
			{
				assignFromView(view, i);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:iload_2         
		//    9   15:invokevirtual   #53  <Method void assignFromView(View, int)>
				return;
		//   10   18:return          
			}
			mPosition = i;
		//   11   19:aload_0         
		//   12   20:iload_2         
		//   13   21:putfield        #50  <Field int mPosition>
			if(mLayoutFromEnd)
		//*  14   24:aload_0         
		//*  15   25:getfield        #23  <Field boolean mLayoutFromEnd>
		//*  16   28:ifeq            135
			{
				i = mOrientationHelper.getEndAfterPadding() - j - mOrientationHelper.getDecoratedEnd(view);
		//   17   31:aload_0         
		//   18   32:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   19   35:invokevirtual   #31  <Method int OrientationHelper.getEndAfterPadding()>
		//   20   38:iload_3         
		//   21   39:isub            
		//   22   40:aload_0         
		//   23   41:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   24   44:aload_1         
		//   25   45:invokevirtual   #42  <Method int OrientationHelper.getDecoratedEnd(View)>
		//   26   48:isub            
		//   27   49:istore_2        
				mCoordinate = mOrientationHelper.getEndAfterPadding() - i;
		//   28   50:aload_0         
		//   29   51:aload_0         
		//   30   52:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   31   55:invokevirtual   #31  <Method int OrientationHelper.getEndAfterPadding()>
		//   32   58:iload_2         
		//   33   59:isub            
		//   34   60:putfield        #36  <Field int mCoordinate>
				if(i > 0)
		//*  35   63:iload_2         
		//*  36   64:ifle            240
				{
					j = mOrientationHelper.getDecoratedMeasurement(view);
		//   37   67:aload_0         
		//   38   68:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   39   71:aload_1         
		//   40   72:invokevirtual   #56  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   41   75:istore_3        
					int k = mCoordinate;
		//   42   76:aload_0         
		//   43   77:getfield        #36  <Field int mCoordinate>
		//   44   80:istore          4
					int i1 = mOrientationHelper.getStartAfterPadding();
		//   45   82:aload_0         
		//   46   83:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   47   86:invokevirtual   #34  <Method int OrientationHelper.getStartAfterPadding()>
		//   48   89:istore          5
					j = k - j - (i1 + Math.min(mOrientationHelper.getDecoratedStart(view) - i1, 0));
		//   49   91:iload           4
		//   50   93:iload_3         
		//   51   94:isub            
		//   52   95:iload           5
		//   53   97:aload_0         
		//   54   98:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   55  101:aload_1         
		//   56  102:invokevirtual   #48  <Method int OrientationHelper.getDecoratedStart(View)>
		//   57  105:iload           5
		//   58  107:isub            
		//   59  108:iconst_0        
		//   60  109:invokestatic    #62  <Method int Math.min(int, int)>
		//   61  112:iadd            
		//   62  113:isub            
		//   63  114:istore_3        
					if(j < 0)
		//*  64  115:iload_3         
		//*  65  116:ifge            240
					{
						mCoordinate = mCoordinate + Math.min(i, -j);
		//   66  119:aload_0         
		//   67  120:aload_0         
		//   68  121:getfield        #36  <Field int mCoordinate>
		//   69  124:iload_2         
		//   70  125:iload_3         
		//   71  126:ineg            
		//   72  127:invokestatic    #62  <Method int Math.min(int, int)>
		//   73  130:iadd            
		//   74  131:putfield        #36  <Field int mCoordinate>
						return;
		//   75  134:return          
					}
				}
			} else
			{
				int l = mOrientationHelper.getDecoratedStart(view);
		//   76  135:aload_0         
		//   77  136:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   78  139:aload_1         
		//   79  140:invokevirtual   #48  <Method int OrientationHelper.getDecoratedStart(View)>
		//   80  143:istore          4
				i = l - mOrientationHelper.getStartAfterPadding();
		//   81  145:iload           4
		//   82  147:aload_0         
		//   83  148:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   84  151:invokevirtual   #34  <Method int OrientationHelper.getStartAfterPadding()>
		//   85  154:isub            
		//   86  155:istore_2        
				mCoordinate = l;
		//   87  156:aload_0         
		//   88  157:iload           4
		//   89  159:putfield        #36  <Field int mCoordinate>
				if(i > 0)
		//*  90  162:iload_2         
		//*  91  163:ifle            240
				{
					int j1 = mOrientationHelper.getDecoratedMeasurement(view);
		//   92  166:aload_0         
		//   93  167:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   94  170:aload_1         
		//   95  171:invokevirtual   #56  <Method int OrientationHelper.getDecoratedMeasurement(View)>
		//   96  174:istore          5
					int k1 = mOrientationHelper.getEndAfterPadding();
		//   97  176:aload_0         
		//   98  177:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//   99  180:invokevirtual   #31  <Method int OrientationHelper.getEndAfterPadding()>
		//  100  183:istore          6
					int l1 = mOrientationHelper.getDecoratedEnd(view);
		//  101  185:aload_0         
		//  102  186:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//  103  189:aload_1         
		//  104  190:invokevirtual   #42  <Method int OrientationHelper.getDecoratedEnd(View)>
		//  105  193:istore          7
					j = mOrientationHelper.getEndAfterPadding() - Math.min(0, k1 - j - l1) - (l + j1);
		//  106  195:aload_0         
		//  107  196:getfield        #25  <Field OrientationHelper mOrientationHelper>
		//  108  199:invokevirtual   #31  <Method int OrientationHelper.getEndAfterPadding()>
		//  109  202:iconst_0        
		//  110  203:iload           6
		//  111  205:iload_3         
		//  112  206:isub            
		//  113  207:iload           7
		//  114  209:isub            
		//  115  210:invokestatic    #62  <Method int Math.min(int, int)>
		//  116  213:isub            
		//  117  214:iload           4
		//  118  216:iload           5
		//  119  218:iadd            
		//  120  219:isub            
		//  121  220:istore_3        
					if(j < 0)
		//* 122  221:iload_3         
		//* 123  222:ifge            240
						mCoordinate = mCoordinate - Math.min(i, -j);
		//  124  225:aload_0         
		//  125  226:aload_0         
		//  126  227:getfield        #36  <Field int mCoordinate>
		//  127  230:iload_2         
		//  128  231:iload_3         
		//  129  232:ineg            
		//  130  233:invokestatic    #62  <Method int Math.min(int, int)>
		//  131  236:isub            
		//  132  237:putfield        #36  <Field int mCoordinate>
				}
			}
		//  133  240:return          
		}

		boolean isViewValidAsAnchor(View view, RecyclerView.State state)
		{
			view = ((View) ((RecyclerView.LayoutParams)view.getLayoutParams()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #70  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #72  <Class RecyclerView$LayoutParams>
		//    3    7:astore_1        
			return !((RecyclerView.LayoutParams) (view)).isItemRemoved() && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() >= 0 && ((RecyclerView.LayoutParams) (view)).getViewLayoutPosition() < state.getItemCount();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #76  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//    6   12:ifne            35
		//    7   15:aload_1         
		//    8   16:invokevirtual   #79  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//    9   19:iflt            35
		//   10   22:aload_1         
		//   11   23:invokevirtual   #79  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   12   26:aload_2         
		//   13   27:invokevirtual   #84  <Method int RecyclerView$State.getItemCount()>
		//   14   30:icmpge          35
		//   15   33:iconst_1        
		//   16   34:ireturn         
		//   17   35:iconst_0        
		//   18   36:ireturn         
		}

		void reset()
		{
			mPosition = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #50  <Field int mPosition>
			mCoordinate = 0x80000000;
		//    3    5:aload_0         
		//    4    6:ldc1            #85  <Int 0x80000000>
		//    5    8:putfield        #36  <Field int mCoordinate>
			mLayoutFromEnd = false;
		//    6   11:aload_0         
		//    7   12:iconst_0        
		//    8   13:putfield        #23  <Field boolean mLayoutFromEnd>
			mValid = false;
		//    9   16:aload_0         
		//   10   17:iconst_0        
		//   11   18:putfield        #87  <Field boolean mValid>
		//   12   21:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #91  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #92  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("AnchorInfo{mPosition=");
		//    4    8:aload_1         
		//    5    9:ldc1            #94  <String "AnchorInfo{mPosition=">
		//    6   11:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(mPosition);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #50  <Field int mPosition>
		//   11   20:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", mCoordinate=");
		//   13   24:aload_1         
		//   14   25:ldc1            #103 <String ", mCoordinate=">
		//   15   27:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(mCoordinate);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #36  <Field int mCoordinate>
		//   20   36:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mLayoutFromEnd=");
		//   22   40:aload_1         
		//   23   41:ldc1            #105 <String ", mLayoutFromEnd=">
		//   24   43:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(mLayoutFromEnd);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #23  <Field boolean mLayoutFromEnd>
		//   29   52:invokevirtual   #108 <Method StringBuilder StringBuilder.append(boolean)>
		//   30   55:pop             
			stringbuilder.append(", mValid=");
		//   31   56:aload_1         
		//   32   57:ldc1            #110 <String ", mValid=">
		//   33   59:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(mValid);
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #87  <Field boolean mValid>
		//   38   68:invokevirtual   #108 <Method StringBuilder StringBuilder.append(boolean)>
		//   39   71:pop             
			stringbuilder.append('}');
		//   40   72:aload_1         
		//   41   73:bipush          125
		//   42   75:invokevirtual   #113 <Method StringBuilder StringBuilder.append(char)>
		//   43   78:pop             
			return stringbuilder.toString();
		//   44   79:aload_1         
		//   45   80:invokevirtual   #115 <Method String StringBuilder.toString()>
		//   46   83:areturn         
		}

		int mCoordinate;
		boolean mLayoutFromEnd;
		OrientationHelper mOrientationHelper;
		int mPosition;
		boolean mValid;

		AnchorInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			reset();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #19  <Method void reset()>
		//    4    8:return          
		}
	}


	private class LayoutChunkResult
	{

		void resetInternal()
		{
			mConsumed = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #18  <Field int mConsumed>
			mFinished = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field boolean mFinished>
			mIgnoreConsumed = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #22  <Field boolean mIgnoreConsumed>
			mFocusable = false;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #24  <Field boolean mFocusable>
		//   12   20:return          
		}

		public int mConsumed;
		public boolean mFinished;
		public boolean mFocusable;
		public boolean mIgnoreConsumed;

		protected LayoutChunkResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	private class LayoutState
	{

		private View nextViewFromScrapList()
		{
			int j = mScrapList.size();
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field List mScrapList>
		//    2    4:invokeinterface #53  <Method int List.size()>
		//    3    9:istore_2        
			for(int i = 0; i < j; i++)
		//*   4   10:iconst_0        
		//*   5   11:istore_1        
		//*   6   12:iload_1         
		//*   7   13:iload_2         
		//*   8   14:icmpge          80
			{
				View view = ((RecyclerView.ViewHolder)mScrapList.get(i)).itemView;
		//    9   17:aload_0         
		//   10   18:getfield        #44  <Field List mScrapList>
		//   11   21:iload_1         
		//   12   22:invokeinterface #57  <Method Object List.get(int)>
		//   13   27:checkcast       #59  <Class RecyclerView$ViewHolder>
		//   14   30:getfield        #63  <Field View RecyclerView$ViewHolder.itemView>
		//   15   33:astore_3        
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
		//   16   34:aload_3         
		//   17   35:invokevirtual   #69  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   18   38:checkcast       #71  <Class RecyclerView$LayoutParams>
		//   19   41:astore          4
				if(!layoutparams.isItemRemoved() && mCurrentPosition == layoutparams.getViewLayoutPosition())
		//*  20   43:aload           4
		//*  21   45:invokevirtual   #75  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//*  22   48:ifeq            54
		//*  23   51:goto            73
		//*  24   54:aload_0         
		//*  25   55:getfield        #77  <Field int mCurrentPosition>
		//*  26   58:aload           4
		//*  27   60:invokevirtual   #80  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//*  28   63:icmpne          73
				{
					assignPositionFromScrapList(view);
		//   29   66:aload_0         
		//   30   67:aload_3         
		//   31   68:invokevirtual   #84  <Method void assignPositionFromScrapList(View)>
					return view;
		//   32   71:aload_3         
		//   33   72:areturn         
				}
			}

		//   34   73:iload_1         
		//   35   74:iconst_1        
		//   36   75:iadd            
		//   37   76:istore_1        
		//*  38   77:goto            12
			return null;
		//   39   80:aconst_null     
		//   40   81:areturn         
		}

		public void assignPositionFromScrapList()
		{
			assignPositionFromScrapList(((View) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokevirtual   #84  <Method void assignPositionFromScrapList(View)>
		//    3    5:return          
		}

		public void assignPositionFromScrapList(View view)
		{
			view = nextViewInLimitedList(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #88  <Method View nextViewInLimitedList(View)>
		//    3    5:astore_1        
			if(view == null)
		//*   4    6:aload_1         
		//*   5    7:ifnonnull       16
			{
				mCurrentPosition = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #77  <Field int mCurrentPosition>
				return;
		//    9   15:return          
			} else
			{
				mCurrentPosition = ((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
		//   10   16:aload_0         
		//   11   17:aload_1         
		//   12   18:invokevirtual   #69  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   13   21:checkcast       #71  <Class RecyclerView$LayoutParams>
		//   14   24:invokevirtual   #80  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   15   27:putfield        #77  <Field int mCurrentPosition>
				return;
		//   16   30:return          
			}
		}

		boolean hasMore(RecyclerView.State state)
		{
			int i = mCurrentPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field int mCurrentPosition>
		//    2    4:istore_2        
			return i >= 0 && i < state.getItemCount();
		//    3    5:iload_2         
		//    4    6:iflt            19
		//    5    9:iload_2         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #95  <Method int RecyclerView$State.getItemCount()>
		//    8   14:icmpge          19
		//    9   17:iconst_1        
		//   10   18:ireturn         
		//   11   19:iconst_0        
		//   12   20:ireturn         
		}

		void log()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #98  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #99  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("avail:");
		//    4    8:aload_1         
		//    5    9:ldc1            #101 <String "avail:">
		//    6   11:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(mAvailable);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #107 <Field int mAvailable>
		//   11   20:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", ind:");
		//   13   24:aload_1         
		//   14   25:ldc1            #112 <String ", ind:">
		//   15   27:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(mCurrentPosition);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #77  <Field int mCurrentPosition>
		//   20   36:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", dir:");
		//   22   40:aload_1         
		//   23   41:ldc1            #114 <String ", dir:">
		//   24   43:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(mItemDirection);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #116 <Field int mItemDirection>
		//   29   52:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
		//   30   55:pop             
			stringbuilder.append(", offset:");
		//   31   56:aload_1         
		//   32   57:ldc1            #118 <String ", offset:">
		//   33   59:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(mOffset);
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #120 <Field int mOffset>
		//   38   68:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
		//   39   71:pop             
			stringbuilder.append(", layoutDir:");
		//   40   72:aload_1         
		//   41   73:ldc1            #122 <String ", layoutDir:">
		//   42   75:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
		//   43   78:pop             
			stringbuilder.append(mLayoutDirection);
		//   44   79:aload_1         
		//   45   80:aload_0         
		//   46   81:getfield        #124 <Field int mLayoutDirection>
		//   47   84:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
		//   48   87:pop             
			Log.d("LLM#LayoutState", stringbuilder.toString());
		//   49   88:ldc1            #18  <String "LLM#LayoutState">
		//   50   90:aload_1         
		//   51   91:invokevirtual   #128 <Method String StringBuilder.toString()>
		//   52   94:invokestatic    #134 <Method int Log.d(String, String)>
		//   53   97:pop             
		//   54   98:return          
		}

		View next(RecyclerView.Recycler recycler)
		{
			if(mScrapList != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field List mScrapList>
		//*   2    4:ifnull          12
			{
				return nextViewFromScrapList();
		//    3    7:aload_0         
		//    4    8:invokespecial   #138 <Method View nextViewFromScrapList()>
		//    5   11:areturn         
			} else
			{
				recycler = ((RecyclerView.Recycler) (recycler.getViewForPosition(mCurrentPosition)));
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #77  <Field int mCurrentPosition>
		//    9   17:invokevirtual   #144 <Method View RecyclerView$Recycler.getViewForPosition(int)>
		//   10   20:astore_1        
				mCurrentPosition = mCurrentPosition + mItemDirection;
		//   11   21:aload_0         
		//   12   22:aload_0         
		//   13   23:getfield        #77  <Field int mCurrentPosition>
		//   14   26:aload_0         
		//   15   27:getfield        #116 <Field int mItemDirection>
		//   16   30:iadd            
		//   17   31:putfield        #77  <Field int mCurrentPosition>
				return ((View) (recycler));
		//   18   34:aload_1         
		//   19   35:areturn         
			}
		}

		public View nextViewInLimitedList(View view)
		{
			int i1 = mScrapList.size();
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field List mScrapList>
		//    2    4:invokeinterface #53  <Method int List.size()>
		//    3    9:istore          6
			View view1 = null;
		//    4   11:aconst_null     
		//    5   12:astore          7
			int j = 0x7fffffff;
		//    6   14:ldc1            #145 <Int 0x7fffffff>
		//    7   16:istore_3        
			for(int i = 0; i < i1;)
		//*   8   17:iconst_0        
		//*   9   18:istore_2        
		//*  10   19:iload_2         
		//*  11   20:iload           6
		//*  12   22:icmpge          159
			{
				View view3 = ((RecyclerView.ViewHolder)mScrapList.get(i)).itemView;
		//   13   25:aload_0         
		//   14   26:getfield        #44  <Field List mScrapList>
		//   15   29:iload_2         
		//   16   30:invokeinterface #57  <Method Object List.get(int)>
		//   17   35:checkcast       #59  <Class RecyclerView$ViewHolder>
		//   18   38:getfield        #63  <Field View RecyclerView$ViewHolder.itemView>
		//   19   41:astore          9
				RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view3.getLayoutParams();
		//   20   43:aload           9
		//   21   45:invokevirtual   #69  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   22   48:checkcast       #71  <Class RecyclerView$LayoutParams>
		//   23   51:astore          10
				View view2 = view1;
		//   24   53:aload           7
		//   25   55:astore          8
				int k = j;
		//   26   57:iload_3         
		//   27   58:istore          4
				if(view3 != view)
		//*  28   60:aload           9
		//*  29   62:aload_1         
		//*  30   63:if_acmpeq       145
					if(layoutparams.isItemRemoved())
		//*  31   66:aload           10
		//*  32   68:invokevirtual   #75  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
		//*  33   71:ifeq            84
					{
						view2 = view1;
		//   34   74:aload           7
		//   35   76:astore          8
						k = j;
		//   36   78:iload_3         
		//   37   79:istore          4
					} else
		//*  38   81:goto            145
					{
						int l = (layoutparams.getViewLayoutPosition() - mCurrentPosition) * mItemDirection;
		//   39   84:aload           10
		//   40   86:invokevirtual   #80  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
		//   41   89:aload_0         
		//   42   90:getfield        #77  <Field int mCurrentPosition>
		//   43   93:isub            
		//   44   94:aload_0         
		//   45   95:getfield        #116 <Field int mItemDirection>
		//   46   98:imul            
		//   47   99:istore          5
						if(l < 0)
		//*  48  101:iload           5
		//*  49  103:ifge            116
						{
							view2 = view1;
		//   50  106:aload           7
		//   51  108:astore          8
							k = j;
		//   52  110:iload_3         
		//   53  111:istore          4
						} else
		//*  54  113:goto            145
						{
							view2 = view1;
		//   55  116:aload           7
		//   56  118:astore          8
							k = j;
		//   57  120:iload_3         
		//   58  121:istore          4
							if(l < j)
		//*  59  123:iload           5
		//*  60  125:iload_3         
		//*  61  126:icmpge          145
							{
								if(l == 0)
		//*  62  129:iload           5
		//*  63  131:ifne            137
									return view3;
		//   64  134:aload           9
		//   65  136:areturn         
								view2 = view3;
		//   66  137:aload           9
		//   67  139:astore          8
								k = l;
		//   68  141:iload           5
		//   69  143:istore          4
							}
						}
					}
				i++;
		//   70  145:iload_2         
		//   71  146:iconst_1        
		//   72  147:iadd            
		//   73  148:istore_2        
				view1 = view2;
		//   74  149:aload           8
		//   75  151:astore          7
				j = k;
		//   76  153:iload           4
		//   77  155:istore_3        
			}

		//*  78  156:goto            19
			return view1;
		//   79  159:aload           7
		//   80  161:areturn         
		}

		static final int INVALID_LAYOUT = 0x80000000;
		static final int ITEM_DIRECTION_HEAD = -1;
		static final int ITEM_DIRECTION_TAIL = 1;
		static final int LAYOUT_END = 1;
		static final int LAYOUT_START = -1;
		static final int SCROLLING_OFFSET_NaN = 0x80000000;
		static final String TAG = "LLM#LayoutState";
		int mAvailable;
		int mCurrentPosition;
		int mExtra;
		boolean mInfinite;
		boolean mIsPreLayout;
		int mItemDirection;
		int mLastScrollDelta;
		int mLayoutDirection;
		int mOffset;
		boolean mRecycle;
		List mScrapList;
		int mScrollingOffset;

		LayoutState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Object()>
			mRecycle = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #38  <Field boolean mRecycle>
			mExtra = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #40  <Field int mExtra>
			mIsPreLayout = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #42  <Field boolean mIsPreLayout>
			mScrapList = null;
		//   11   19:aload_0         
		//   12   20:aconst_null     
		//   13   21:putfield        #44  <Field List mScrapList>
		//   14   24:return          
		}
	}


	private class SavedState
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		boolean hasValidAnchor()
		{
			return mAnchorPosition >= 0;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field int mAnchorPosition>
		//    2    4:iflt            9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		void invalidateAnchor()
		{
			mAnchorPosition = -1;
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:putfield        #33  <Field int mAnchorPosition>
		//    3    5:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #46  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #48  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #53  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new _cls1();
		boolean mAnchorLayoutFromEnd;
		int mAnchorOffset;
		int mAnchorPosition;

		static 
		{
			class _cls1
				implements android.os.Parcelable.Creator
			{

				public SavedState createFromParcel(Parcel parcel)
				{
					return new SavedState(parcel);
				//    0    0:new             #15  <Class LinearLayoutManager$SavedState>
				//    1    3:dup             
				//    2    4:aload_1         
				//    3    5:invokespecial   #18  <Method void LinearLayoutManager$SavedState(Parcel)>
				//    4    8:areturn         
				}

				public volatile Object createFromParcel(Parcel parcel)
				{
					return ((Object) (createFromParcel(parcel)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #21  <Method LinearLayoutManager$SavedState createFromParcel(Parcel)>
				//    3    5:areturn         
				}

				public SavedState[] newArray(int i)
				{
					return new SavedState[i];
				//    0    0:iload_1         
				//    1    1:anewarray       SavedState[]
				//    2    4:areturn         
				}

				public volatile Object[] newArray(int i)
				{
					return ((Object []) (newArray(i)));
				//    0    0:aload_0         
				//    1    1:iload_1         
				//    2    2:invokevirtual   #26  <Method LinearLayoutManager$SavedState[] newArray(int)>
				//    3    5:areturn         
				}

				_cls1()
				{
				//    0    0:aload_0         
				//    1    1:invokespecial   #10  <Method void Object()>
				//    2    4:return          
				}
			}

		//    0    0:new             #17  <Class LinearLayoutManager$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void LinearLayoutManager$SavedState$1()>
		//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}

		SavedState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			mAnchorPosition = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #31  <Method int Parcel.readInt()>
		//    5    9:putfield        #33  <Field int mAnchorPosition>
			mAnchorOffset = parcel.readInt();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #31  <Method int Parcel.readInt()>
		//    9   17:putfield        #35  <Field int mAnchorOffset>
			int i = parcel.readInt();
		//   10   20:aload_1         
		//   11   21:invokevirtual   #31  <Method int Parcel.readInt()>
		//   12   24:istore_2        
			boolean flag = true;
		//   13   25:iconst_1        
		//   14   26:istore_3        
			if(i != 1)
		//*  15   27:iload_2         
		//*  16   28:iconst_1        
		//*  17   29:icmpne          35
		//*  18   32:goto            37
				flag = false;
		//   19   35:iconst_0        
		//   20   36:istore_3        
			mAnchorLayoutFromEnd = flag;
		//   21   37:aload_0         
		//   22   38:iload_3         
		//   23   39:putfield        #37  <Field boolean mAnchorLayoutFromEnd>
		//   24   42:return          
		}

		public SavedState(SavedState savedstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			mAnchorPosition = savedstate.mAnchorPosition;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #33  <Field int mAnchorPosition>
		//    5    9:putfield        #33  <Field int mAnchorPosition>
			mAnchorOffset = savedstate.mAnchorOffset;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #35  <Field int mAnchorOffset>
		//    9   17:putfield        #35  <Field int mAnchorOffset>
			mAnchorLayoutFromEnd = savedstate.mAnchorLayoutFromEnd;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #37  <Field boolean mAnchorLayoutFromEnd>
		//   13   25:putfield        #37  <Field boolean mAnchorLayoutFromEnd>
		//   14   28:return          
		}
	}

}
