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
		int j = mScrapList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List mScrapList>
	//    2    4:invokeinterface #57  <Method int List.size()>
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
	//   10   18:getfield        #48  <Field List mScrapList>
	//   11   21:iload_1         
	//   12   22:invokeinterface #61  <Method Object List.get(int)>
	//   13   27:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   14   30:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   15   33:astore_3        
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   38:checkcast       #75  <Class RecyclerView$LayoutParams>
	//   19   41:astore          4
			if(!layoutparams.isItemRemoved() && mCurrentPosition == layoutparams.getViewLayoutPosition())
	//*  20   43:aload           4
	//*  21   45:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  22   48:ifeq            54
	//*  23   51:goto            73
	//*  24   54:aload_0         
	//*  25   55:getfield        #81  <Field int mCurrentPosition>
	//*  26   58:aload           4
	//*  27   60:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//*  28   63:icmpne          73
			{
				assignPositionFromScrapList(view);
	//   29   66:aload_0         
	//   30   67:aload_3         
	//   31   68:invokevirtual   #88  <Method void assignPositionFromScrapList(View)>
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
		int i = mCurrentPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int mCurrentPosition>
	//    2    4:istore_2        
		return i >= 0 && i < state.getItemCount();
	//    3    5:iload_2         
	//    4    6:iflt            19
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #99  <Method int RecyclerView$State.getItemCount()>
	//    8   14:icmpge          19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	void log()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("avail:");
	//    4    8:aload_1         
	//    5    9:ldc1            #105 <String "avail:">
	//    6   11:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mAvailable);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #111 <Field int mAvailable>
	//   11   20:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", ind:");
	//   13   24:aload_1         
	//   14   25:ldc1            #116 <String ", ind:">
	//   15   27:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mCurrentPosition);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #81  <Field int mCurrentPosition>
	//   20   36:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", dir:");
	//   22   40:aload_1         
	//   23   41:ldc1            #118 <String ", dir:">
	//   24   43:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mItemDirection);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #120 <Field int mItemDirection>
	//   29   52:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", offset:");
	//   31   56:aload_1         
	//   32   57:ldc1            #122 <String ", offset:">
	//   33   59:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mOffset);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #124 <Field int mOffset>
	//   38   68:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(", layoutDir:");
	//   40   72:aload_1         
	//   41   73:ldc1            #126 <String ", layoutDir:">
	//   42   75:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mLayoutDirection);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #128 <Field int mLayoutDirection>
	//   47   84:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		Log.d("LLM#LayoutState", stringbuilder.toString());
	//   49   88:ldc1            #21  <String "LLM#LayoutState">
	//   50   90:aload_1         
	//   51   91:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   52   94:invokestatic    #138 <Method int Log.d(String, String)>
	//   53   97:pop             
	//   54   98:return          
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
		int i1 = mScrapList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List mScrapList>
	//    2    4:invokeinterface #57  <Method int List.size()>
	//    3    9:istore          6
		View view1 = null;
	//    4   11:aconst_null     
	//    5   12:astore          7
		int j = 0x7fffffff;
	//    6   14:ldc1            #149 <Int 0x7fffffff>
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
	//   14   26:getfield        #48  <Field List mScrapList>
	//   15   29:iload_2         
	//   16   30:invokeinterface #61  <Method Object List.get(int)>
	//   17   35:checkcast       #63  <Class RecyclerView$ViewHolder>
	//   18   38:getfield        #67  <Field View RecyclerView$ViewHolder.itemView>
	//   19   41:astore          9
			RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view3.getLayoutParams();
	//   20   43:aload           9
	//   21   45:invokevirtual   #73  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   48:checkcast       #75  <Class RecyclerView$LayoutParams>
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
	//*  32   68:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
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
	//   40   86:invokevirtual   #84  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//   41   89:aload_0         
	//   42   90:getfield        #81  <Field int mCurrentPosition>
	//   43   93:isub            
	//   44   94:aload_0         
	//   45   95:getfield        #120 <Field int mItemDirection>
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
