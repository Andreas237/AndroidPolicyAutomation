// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

class LayoutState
{

	LayoutState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mRecycle = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #33  <Field boolean mRecycle>
		mStartLine = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #35  <Field int mStartLine>
		mEndLine = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #37  <Field int mEndLine>
	//   11   19:return          
	}

	boolean hasMore(RecyclerView.State state)
	{
		return mCurrentPosition >= 0 && mCurrentPosition < state.getItemCount();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mCurrentPosition>
	//    2    4:iflt            20
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field int mCurrentPosition>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #48  <Method int RecyclerView$State.getItemCount()>
	//    7   15:icmpge          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	View next(RecyclerView.Recycler recycler)
	{
		recycler = ((RecyclerView.Recycler) (recycler.getViewForPosition(mCurrentPosition)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field int mCurrentPosition>
	//    3    5:invokevirtual   #56  <Method View RecyclerView$Recycler.getViewForPosition(int)>
	//    4    8:astore_1        
		mCurrentPosition = mCurrentPosition + mItemDirection;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field int mCurrentPosition>
	//    8   14:aload_0         
	//    9   15:getfield        #58  <Field int mItemDirection>
	//   10   18:iadd            
	//   11   19:putfield        #42  <Field int mCurrentPosition>
		return ((View) (recycler));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("LayoutState{mAvailable=").append(mAvailable).append(", mCurrentPosition=").append(mCurrentPosition).append(", mItemDirection=").append(mItemDirection).append(", mLayoutDirection=").append(mLayoutDirection).append(", mStartLine=").append(mStartLine).append(", mEndLine=").append(mEndLine).append('}').toString();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:ldc1            #65  <String "LayoutState{mAvailable=">
	//    4    9:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #71  <Field int mAvailable>
	//    7   16:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #76  <String ", mCurrentPosition=">
	//    9   21:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #42  <Field int mCurrentPosition>
	//   12   28:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #78  <String ", mItemDirection=">
	//   14   33:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #58  <Field int mItemDirection>
	//   17   40:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #80  <String ", mLayoutDirection=">
	//   19   45:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #82  <Field int mLayoutDirection>
	//   22   52:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #84  <String ", mStartLine=">
	//   24   57:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #35  <Field int mStartLine>
	//   27   64:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   28   67:ldc1            #86  <String ", mEndLine=">
	//   29   69:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #37  <Field int mEndLine>
	//   32   76:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   33   79:bipush          125
	//   34   81:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   35   84:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   36   87:areturn         
	}

	static final int INVALID_LAYOUT = 0x80000000;
	static final int ITEM_DIRECTION_HEAD = -1;
	static final int ITEM_DIRECTION_TAIL = 1;
	static final int LAYOUT_END = 1;
	static final int LAYOUT_START = -1;
	static final String TAG = "LayoutState";
	int mAvailable;
	int mCurrentPosition;
	int mEndLine;
	boolean mInfinite;
	int mItemDirection;
	int mLayoutDirection;
	boolean mRecycle;
	int mStartLine;
	boolean mStopInFocusable;
}
