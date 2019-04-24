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
		int l = mScrapList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List mScrapList>
	//    2    4:invokeinterface #57  <Method int List.size()>
	//    3    9:istore          5
		View view1 = null;
	//    4   11:aconst_null     
	//    5   12:astore          6
		int i = 0x7fffffff;
	//    6   14:ldc1            #149 <Int 0x7fffffff>
	//    7   16:istore_2        
		int j = 0;
	//    8   17:iconst_0        
	//    9   18:istore_3        
		while(j < l) 
	//*  10   19:iload_3         
	//*  11   20:iload           5
	//*  12   22:icmpge          126
		{
			View view2 = ((RecyclerView.ViewHolder)mScrapList.get(j)).itemView;
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field List mScrapList>
	//   15   29:iload_3         
	//   16   30:invokeinterface #61  <Method Object List.get(int)>
	//   17   35:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   18   38:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   19   41:astore          7
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view2.getLayoutParams();
	//   20   43:aload           7
	//   21   45:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   48:checkcast       #75  <Class RecyclerView$LayoutParams>
	//   23   51:astore          8
			if(view2 != view && !layoutparams.isItemRemoved())
	//*  24   53:aload           7
	//*  25   55:aload_1         
	//*  26   56:if_acmpeq       123
	//*  27   59:aload           8
	//*  28   61:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  29   64:ifeq            74
	//*  30   67:iload_3         
	//*  31   68:iconst_1        
	//*  32   69:iadd            
	//*  33   70:istore_3        
	//*  34   71:goto            19
			{
				int k = (layoutparams.getViewLayoutPosition() - mCurrentPosition) * mItemDirection;
	//   35   74:aload           8
	//   36   76:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//   37   79:aload_0         
	//   38   80:getfield        #81  <Field int mCurrentPosition>
	//   39   83:isub            
	//   40   84:aload_0         
	//   41   85:getfield        #120 <Field int mItemDirection>
	//   42   88:imul            
	//   43   89:istore          4
				if(k >= 0 && k < i)
	//*  44   91:iload           4
	//*  45   93:ifge            99
	//*  46   96:goto            67
	//*  47   99:iload           4
	//*  48  101:iload_2         
	//*  49  102:icmpge          123
				{
					if(k == 0)
	//*  50  105:iload           4
	//*  51  107:ifne            113
						return view2;
	//   52  110:aload           7
	//   53  112:areturn         
					view1 = view2;
	//   54  113:aload           7
	//   55  115:astore          6
					i = k;
	//   56  117:iload           4
	//   57  119:istore_2        
				}
			}
			j++;
		}
	//*  58  120:goto            67
	//*  59  123:goto            67
		return view1;
	//   60  126:aload           6
	//   61  128:areturn         
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
