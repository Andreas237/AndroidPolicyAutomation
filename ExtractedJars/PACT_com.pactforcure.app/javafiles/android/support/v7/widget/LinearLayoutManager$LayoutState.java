// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager

static class LinearLayoutManager$LayoutState
{

	private View nextViewFromScrapList()
	{
		int i;
		int j;
		j = mScrapList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List mScrapList>
	//    2    4:invokeinterface #57  <Method int List.size()>
	//    3    9:istore_2        
		i = 0;
	//    4   10:iconst_0        
	//    5   11:istore_1        
_L3:
		View view;
		RecyclerView.LayoutParams layoutparams;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    6   12:iload_1         
	//    7   13:iload_2         
	//    8   14:icmpge          77
		view = ((RecyclerView.ViewHolder)mScrapList.get(i)).itemView;
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field List mScrapList>
	//   11   21:iload_1         
	//   12   22:invokeinterface #61  <Method Object List.get(int)>
	//   13   27:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   14   30:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   15   33:astore_3        
		layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   38:checkcast       #75  <Class RecyclerView$LayoutParams>
	//   19   41:astore          4
		  goto _L1
	//*  20   43:aload           4
	//*  21   45:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  22   48:ifeq            58
_L5:
		i++;
	//   23   51:iload_1         
	//   24   52:iconst_1        
	//   25   53:iadd            
	//   26   54:istore_1        
		if(true) goto _L3; else goto _L2
	//   27   55:goto            12
_L1:
		if(layoutparams.isItemRemoved() || mCurrentPosition != layoutparams.getViewLayoutPosition()) goto _L5; else goto _L4
	//   28   58:aload_0         
	//   29   59:getfield        #81  <Field int mCurrentPosition>
	//   30   62:aload           4
	//   31   64:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//   32   67:icmpne          51
_L4:
		assignPositionFromScrapList(view);
	//   33   70:aload_0         
	//   34   71:aload_3         
	//   35   72:invokevirtual   #88  <Method void assignPositionFromScrapList(View)>
		return view;
	//   36   75:aload_3         
	//   37   76:areturn         
_L2:
		return null;
	//   38   77:aconst_null     
	//   39   78:areturn         
	}

	public void assignPositionFromScrapList()
	{
		assignPositionFromScrapList(((View) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #88  <Method void assignPositionFromScrapList(View)>
	//    3    5:return          
	}

	public void assignPositionFromScrapList(View view)
	{
		view = nextViewInLimitedList(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method View nextViewInLimitedList(View)>
	//    3    5:astore_1        
		if(view == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       16
		{
			mCurrentPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #81  <Field int mCurrentPosition>
			return;
	//    9   15:return          
		} else
		{
			mCurrentPosition = ((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   21:checkcast       #75  <Class RecyclerView$LayoutParams>
	//   14   24:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//   15   27:putfield        #81  <Field int mCurrentPosition>
			return;
	//   16   30:return          
		}
	}

	boolean hasMore(RecyclerView.State state)
	{
		return mCurrentPosition >= 0 && mCurrentPosition < state.getItemCount();
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int mCurrentPosition>
	//    2    4:iflt            20
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field int mCurrentPosition>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #99  <Method int RecyclerView$State.getItemCount()>
	//    7   15:icmpge          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	void log()
	{
		Log.d("LLM#LayoutState", (new StringBuilder()).append("avail:").append(mAvailable).append(", ind:").append(mCurrentPosition).append(", dir:").append(mItemDirection).append(", offset:").append(mOffset).append(", layoutDir:").append(mLayoutDirection).toString());
	//    0    0:ldc1            #21  <String "LLM#LayoutState">
	//    1    2:new             #102 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #103 <Method void StringBuilder()>
	//    4    9:ldc1            #105 <String "avail:">
	//    5   11:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #111 <Field int mAvailable>
	//    8   18:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//    9   21:ldc1            #116 <String ", ind:">
	//   10   23:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_0         
	//   12   27:getfield        #81  <Field int mCurrentPosition>
	//   13   30:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   14   33:ldc1            #118 <String ", dir:">
	//   15   35:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:aload_0         
	//   17   39:getfield        #120 <Field int mItemDirection>
	//   18   42:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   19   45:ldc1            #122 <String ", offset:">
	//   20   47:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:aload_0         
	//   22   51:getfield        #124 <Field int mOffset>
	//   23   54:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   24   57:ldc1            #126 <String ", layoutDir:">
	//   25   59:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   26   62:aload_0         
	//   27   63:getfield        #128 <Field int mLayoutDirection>
	//   28   66:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   29   69:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   30   72:invokestatic    #138 <Method int Log.d(String, String)>
	//   31   75:pop             
	//   32   76:return          
	}

	View next(RecyclerView.Recycler recycler)
	{
		if(mScrapList != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field List mScrapList>
	//*   2    4:ifnull          12
		{
			return nextViewFromScrapList();
	//    3    7:aload_0         
	//    4    8:invokespecial   #142 <Method View nextViewFromScrapList()>
	//    5   11:areturn         
		} else
		{
			recycler = ((RecyclerView.Recycler) (recycler.getViewForPosition(mCurrentPosition)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #81  <Field int mCurrentPosition>
	//    9   17:invokevirtual   #148 <Method View RecyclerView$Recycler.getViewForPosition(int)>
	//   10   20:astore_1        
			mCurrentPosition = mCurrentPosition + mItemDirection;
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #81  <Field int mCurrentPosition>
	//   14   26:aload_0         
	//   15   27:getfield        #120 <Field int mItemDirection>
	//   16   30:iadd            
	//   17   31:putfield        #81  <Field int mCurrentPosition>
			return ((View) (recycler));
	//   18   34:aload_1         
	//   19   35:areturn         
		}
	}

	public View nextViewInLimitedList(View view)
	{
		int i;
		int j;
		int i1;
		View view1;
		i1 = mScrapList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List mScrapList>
	//    2    4:invokeinterface #57  <Method int List.size()>
	//    3    9:istore          6
		view1 = null;
	//    4   11:aconst_null     
	//    5   12:astore          7
		j = 0x7fffffff;
	//    6   14:ldc1            #149 <Int 0x7fffffff>
	//    7   16:istore_3        
		i = 0;
	//    8   17:iconst_0        
	//    9   18:istore_2        
_L2:
		int k;
		View view2;
		View view3;
		RecyclerView.LayoutParams layoutparams;
		view2 = view1;
	//   10   19:aload           7
	//   11   21:astore          8
		if(i >= i1)
			break MISSING_BLOCK_LABEL_162;
	//   12   23:iload_2         
	//   13   24:iload           6
	//   14   26:icmpge          162
		view3 = ((RecyclerView.ViewHolder)mScrapList.get(i)).itemView;
	//   15   29:aload_0         
	//   16   30:getfield        #48  <Field List mScrapList>
	//   17   33:iload_2         
	//   18   34:invokeinterface #61  <Method Object List.get(int)>
	//   19   39:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   20   42:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   21   45:astore          9
		layoutparams = (RecyclerView.LayoutParams)view3.getLayoutParams();
	//   22   47:aload           9
	//   23   49:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   52:checkcast       #75  <Class RecyclerView$LayoutParams>
	//   25   55:astore          10
		view2 = view1;
	//   26   57:aload           7
	//   27   59:astore          8
		k = j;
	//   28   61:iload_3         
	//   29   62:istore          4
		if(view3 != view)
	//*  30   64:aload           9
	//*  31   66:aload_1         
	//*  32   67:if_acmpeq       85
		{
			if(!layoutparams.isItemRemoved())
				break; /* Loop/switch isn't completed */
	//   33   70:aload           10
	//   34   72:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//   35   75:ifeq            99
			k = j;
	//   36   78:iload_3         
	//   37   79:istore          4
			view2 = view1;
	//   38   81:aload           7
	//   39   83:astore          8
		}
_L4:
		i++;
	//   40   85:iload_2         
	//   41   86:iconst_1        
	//   42   87:iadd            
	//   43   88:istore_2        
		view1 = view2;
	//   44   89:aload           8
	//   45   91:astore          7
		j = k;
	//   46   93:iload           4
	//   47   95:istore_3        
		if(true) goto _L2; else goto _L1
	//   48   96:goto            19
_L1:
		int l;
		l = (layoutparams.getViewLayoutPosition() - mCurrentPosition) * mItemDirection;
	//   49   99:aload           10
	//   50  101:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//   51  104:aload_0         
	//   52  105:getfield        #81  <Field int mCurrentPosition>
	//   53  108:isub            
	//   54  109:aload_0         
	//   55  110:getfield        #120 <Field int mItemDirection>
	//   56  113:imul            
	//   57  114:istore          5
		view2 = view1;
	//   58  116:aload           7
	//   59  118:astore          8
		k = j;
	//   60  120:iload_3         
	//   61  121:istore          4
		if(l < 0) goto _L4; else goto _L3
	//   62  123:iload           5
	//   63  125:iflt            85
_L3:
		view2 = view1;
	//   64  128:aload           7
	//   65  130:astore          8
		k = j;
	//   66  132:iload_3         
	//   67  133:istore          4
		if(l >= j) goto _L4; else goto _L5
	//   68  135:iload           5
	//   69  137:iload_3         
	//   70  138:icmpge          85
_L5:
		view1 = view3;
	//   71  141:aload           9
	//   72  143:astore          7
		k = l;
	//   73  145:iload           5
	//   74  147:istore          4
		view2 = view1;
	//   75  149:aload           7
	//   76  151:astore          8
		if(l != 0) goto _L4; else goto _L6
	//   77  153:iload           5
	//   78  155:ifne            85
_L6:
		view2 = view1;
	//   79  158:aload           7
	//   80  160:astore          8
		return view2;
	//   81  162:aload           8
	//   82  164:areturn         
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

	LinearLayoutManager$LayoutState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		mRecycle = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #42  <Field boolean mRecycle>
		mExtra = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #44  <Field int mExtra>
		mIsPreLayout = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #46  <Field boolean mIsPreLayout>
		mScrapList = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #48  <Field List mScrapList>
	//   14   24:return          
	}
}
