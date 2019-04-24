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
		int i1 = mScrapList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List mScrapList>
	//    2    4:invokeinterface #57  <Method int List.size()>
	//    3    9:istore          6
		View view2 = null;
	//    4   11:aconst_null     
	//    5   12:astore          8
		int j = 0x7fffffff;
	//    6   14:ldc1            #149 <Int 0x7fffffff>
	//    7   16:istore_3        
		for(int i = 0; i < i1;)
	//*   8   17:iconst_0        
	//*   9   18:istore_2        
	//*  10   19:iload_2         
	//*  11   20:iload           6
	//*  12   22:icmpge          163
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
			View view1 = view2;
	//   24   53:aload           8
	//   25   55:astore          7
			int k = j;
	//   26   57:iload_3         
	//   27   58:istore          4
			if(view3 != view)
	//*  28   60:aload           9
	//*  29   62:aload_1         
	//*  30   63:if_acmpeq       149
				if(layoutparams.isItemRemoved())
	//*  31   66:aload           10
	//*  32   68:invokevirtual   #79  <Method boolean RecyclerView$LayoutParams.isItemRemoved()>
	//*  33   71:ifeq            84
				{
					view1 = view2;
	//   34   74:aload           8
	//   35   76:astore          7
					k = j;
	//   36   78:iload_3         
	//   37   79:istore          4
				} else
	//*  38   81:goto            149
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
						view1 = view2;
	//   50  106:aload           8
	//   51  108:astore          7
						k = j;
	//   52  110:iload_3         
	//   53  111:istore          4
					} else
	//*  54  113:goto            149
					{
						view1 = view2;
	//   55  116:aload           8
	//   56  118:astore          7
						k = j;
	//   57  120:iload_3         
	//   58  121:istore          4
						if(l < j)
	//*  59  123:iload           5
	//*  60  125:iload_3         
	//*  61  126:icmpge          149
						{
							view2 = view3;
	//   62  129:aload           9
	//   63  131:astore          8
							k = l;
	//   64  133:iload           5
	//   65  135:istore          4
							view1 = view2;
	//   66  137:aload           8
	//   67  139:astore          7
							if(l == 0)
	//*  68  141:iload           5
	//*  69  143:ifne            149
								return view2;
	//   70  146:aload           8
	//   71  148:areturn         
						}
					}
				}
			i++;
	//   72  149:iload_2         
	//   73  150:iconst_1        
	//   74  151:iadd            
	//   75  152:istore_2        
			view2 = view1;
	//   76  153:aload           7
	//   77  155:astore          8
			j = k;
	//   78  157:iload           4
	//   79  159:istore_3        
		}

	//*  80  160:goto            19
		return view2;
	//   81  163:aload           8
	//   82  165:areturn         
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
