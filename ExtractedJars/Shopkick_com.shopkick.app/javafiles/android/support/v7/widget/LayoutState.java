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
		int i = mCurrentPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int mCurrentPosition>
	//    2    4:istore_2        
		return i >= 0 && i < state.getItemCount();
	//    3    5:iload_2         
	//    4    6:iflt            19
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #48  <Method int RecyclerView$State.getItemCount()>
	//    8   14:icmpge          19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("LayoutState{mAvailable=");
	//    4    8:aload_1         
	//    5    9:ldc1            #65  <String "LayoutState{mAvailable=">
	//    6   11:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mAvailable);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #71  <Field int mAvailable>
	//   11   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", mCurrentPosition=");
	//   13   24:aload_1         
	//   14   25:ldc1            #76  <String ", mCurrentPosition=">
	//   15   27:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mCurrentPosition);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #42  <Field int mCurrentPosition>
	//   20   36:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", mItemDirection=");
	//   22   40:aload_1         
	//   23   41:ldc1            #78  <String ", mItemDirection=">
	//   24   43:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mItemDirection);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #58  <Field int mItemDirection>
	//   29   52:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", mLayoutDirection=");
	//   31   56:aload_1         
	//   32   57:ldc1            #80  <String ", mLayoutDirection=">
	//   33   59:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mLayoutDirection);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #82  <Field int mLayoutDirection>
	//   38   68:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(", mStartLine=");
	//   40   72:aload_1         
	//   41   73:ldc1            #84  <String ", mStartLine=">
	//   42   75:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mStartLine);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #35  <Field int mStartLine>
	//   47   84:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(", mEndLine=");
	//   49   88:aload_1         
	//   50   89:ldc1            #86  <String ", mEndLine=">
	//   51   91:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mEndLine);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #37  <Field int mEndLine>
	//   56  100:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   57  103:pop             
		stringbuilder.append('}');
	//   58  104:aload_1         
	//   59  105:bipush          125
	//   60  107:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   61  110:pop             
		return stringbuilder.toString();
	//   62  111:aload_1         
	//   63  112:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   64  115:areturn         
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
