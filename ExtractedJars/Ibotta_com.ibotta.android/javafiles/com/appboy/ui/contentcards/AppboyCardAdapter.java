// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards;

import android.content.Context;
import android.os.Handler;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.appboy.ui.contentcards.listeners.IContentCardsActionListener;
import com.appboy.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.appboy.ui.contentcards.view.ContentCardViewHolder;
import java.util.*;

// Referenced classes of package com.appboy.ui.contentcards:
//			AppboyContentCardsManager

public class AppboyCardAdapter extends android.support.v7.widget.RecyclerView.Adapter
	implements ItemTouchHelperAdapter
{
	private class CardListDiffCallback extends android.support.v7.util.DiffUtil.Callback
	{

		private boolean doItemsShareIds(int i, int j)
		{
			return ((Card)mOldCards.get(i)).getId().equals(((Object) (((Card)mNewCards.get(j)).getId())));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field List mOldCards>
		//    2    4:iload_1         
		//    3    5:invokeinterface #35  <Method Object List.get(int)>
		//    4   10:checkcast       #37  <Class Card>
		//    5   13:invokevirtual   #41  <Method String Card.getId()>
		//    6   16:aload_0         
		//    7   17:getfield        #24  <Field List mNewCards>
		//    8   20:iload_2         
		//    9   21:invokeinterface #35  <Method Object List.get(int)>
		//   10   26:checkcast       #37  <Class Card>
		//   11   29:invokevirtual   #41  <Method String Card.getId()>
		//   12   32:invokevirtual   #47  <Method boolean String.equals(Object)>
		//   13   35:ireturn         
		}

		public boolean areContentsTheSame(int i, int j)
		{
			return doItemsShareIds(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #50  <Method boolean doItemsShareIds(int, int)>
		//    4    6:ireturn         
		}

		public boolean areItemsTheSame(int i, int j)
		{
			return doItemsShareIds(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #50  <Method boolean doItemsShareIds(int, int)>
		//    4    6:ireturn         
		}

		public int getNewListSize()
		{
			return mNewCards.size();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field List mNewCards>
		//    2    4:invokeinterface #56  <Method int List.size()>
		//    3    9:ireturn         
		}

		public int getOldListSize()
		{
			return mOldCards.size();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field List mOldCards>
		//    2    4:invokeinterface #56  <Method int List.size()>
		//    3    9:ireturn         
		}

		private final List mNewCards;
		private final List mOldCards;
		final AppboyCardAdapter this$0;

		CardListDiffCallback(List list, List list1)
		{
			this$0 = AppboyCardAdapter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field AppboyCardAdapter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void android.support.v7.util.DiffUtil$Callback()>
			mOldCards = list;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field List mOldCards>
			mNewCards = list1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field List mNewCards>
		//   11   19:return          
		}
	}


	public AppboyCardAdapter(Context context, LinearLayoutManager linearlayoutmanager, List list, IContentCardsViewBindingHandler icontentcardsviewbindinghandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		mImpressedCardIds = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #47  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void HashSet()>
	//    6   12:putfield        #50  <Field Set mImpressedCardIds>
		mContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #52  <Field Context mContext>
		mCardData = list;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #54  <Field List mCardData>
	//   13   25:aload_0         
	//   14   26:new             #56  <Class Handler>
	//   15   29:dup             
	//   16   30:invokespecial   #57  <Method void Handler()>
	//   17   33:putfield        #59  <Field Handler mHandler>
		mLayoutManager = linearlayoutmanager;
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:putfield        #61  <Field LinearLayoutManager mLayoutManager>
		mContentCardsViewBindingHandler = icontentcardsviewbindinghandler;
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:putfield        #63  <Field IContentCardsViewBindingHandler mContentCardsViewBindingHandler>
		setHasStableIds(true);
	//   24   47:aload_0         
	//   25   48:iconst_1        
	//   26   49:invokevirtual   #67  <Method void setHasStableIds(boolean)>
	//   27   52:return          
	}

	public List getImpressedCardIds()
	{
		return ((List) (new ArrayList(((java.util.Collection) (mImpressedCardIds)))));
	//    0    0:new             #73  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field Set mImpressedCardIds>
	//    4    8:invokespecial   #76  <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public int getItemCount()
	{
		return mCardData.size();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List mCardData>
	//    2    4:invokeinterface #84  <Method int List.size()>
	//    3    9:ireturn         
	}

	public long getItemId(int i)
	{
		return (long)((Card)mCardData.get(i)).getId().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List mCardData>
	//    2    4:iload_1         
	//    3    5:invokeinterface #90  <Method Object List.get(int)>
	//    4   10:checkcast       #92  <Class Card>
	//    5   13:invokevirtual   #96  <Method String Card.getId()>
	//    6   16:invokevirtual   #101 <Method int String.hashCode()>
	//    7   19:i2l             
	//    8   20:lreturn         
	}

	public int getItemViewType(int i)
	{
		return mContentCardsViewBindingHandler.getItemViewType(mContext, mCardData, i);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field IContentCardsViewBindingHandler mContentCardsViewBindingHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field List mCardData>
	//    6   12:iload_1         
	//    7   13:invokeinterface #108 <Method int IContentCardsViewBindingHandler.getItemViewType(Context, List, int)>
	//    8   18:ireturn         
	}

	boolean isAdapterPositionOnScreen(int i)
	{
		int j = Math.min(mLayoutManager.findFirstVisibleItemPosition(), mLayoutManager.findFirstCompletelyVisibleItemPosition());
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field LinearLayoutManager mLayoutManager>
	//    2    4:invokevirtual   #116 <Method int LinearLayoutManager.findFirstVisibleItemPosition()>
	//    3    7:aload_0         
	//    4    8:getfield        #61  <Field LinearLayoutManager mLayoutManager>
	//    5   11:invokevirtual   #119 <Method int LinearLayoutManager.findFirstCompletelyVisibleItemPosition()>
	//    6   14:invokestatic    #125 <Method int Math.min(int, int)>
	//    7   17:istore_2        
		int k = Math.max(mLayoutManager.findLastVisibleItemPosition(), mLayoutManager.findLastCompletelyVisibleItemPosition());
	//    8   18:aload_0         
	//    9   19:getfield        #61  <Field LinearLayoutManager mLayoutManager>
	//   10   22:invokevirtual   #128 <Method int LinearLayoutManager.findLastVisibleItemPosition()>
	//   11   25:aload_0         
	//   12   26:getfield        #61  <Field LinearLayoutManager mLayoutManager>
	//   13   29:invokevirtual   #131 <Method int LinearLayoutManager.findLastCompletelyVisibleItemPosition()>
	//   14   32:invokestatic    #134 <Method int Math.max(int, int)>
	//   15   35:istore_3        
		return j <= i && k >= i;
	//   16   36:iload_2         
	//   17   37:iload_1         
	//   18   38:icmpgt          48
	//   19   41:iload_3         
	//   20   42:iload_1         
	//   21   43:icmplt          48
	//   22   46:iconst_1        
	//   23   47:ireturn         
	//   24   48:iconst_0        
	//   25   49:ireturn         
	}

	public boolean isControlCardAtPosition(int i)
	{
		if(i >= 0 && i < mCardData.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            37
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field List mCardData>
	//*   5    9:invokeinterface #84  <Method int List.size()>
	//*   6   14:icmplt          20
	//*   7   17:goto            37
			return ((Card)mCardData.get(i)).isControl();
	//    8   20:aload_0         
	//    9   21:getfield        #54  <Field List mCardData>
	//   10   24:iload_1         
	//   11   25:invokeinterface #90  <Method Object List.get(int)>
	//   12   30:checkcast       #92  <Class Card>
	//   13   33:invokevirtual   #140 <Method boolean Card.isControl()>
	//   14   36:ireturn         
		else
			return false;
	//   15   37:iconst_0        
	//   16   38:ireturn         
	}

	public boolean isItemDismissable(int i)
	{
		if(mCardData.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field List mCardData>
	//*   2    4:invokeinterface #144 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return false;
	//    4   12:iconst_0        
	//    5   13:ireturn         
		else
			return ((Card)mCardData.get(i)).getIsDismissible();
	//    6   14:aload_0         
	//    7   15:getfield        #54  <Field List mCardData>
	//    8   18:iload_1         
	//    9   19:invokeinterface #90  <Method Object List.get(int)>
	//   10   24:checkcast       #92  <Class Card>
	//   11   27:invokevirtual   #147 <Method boolean Card.getIsDismissible()>
	//   12   30:ireturn         
	}

	void logImpression(Card card)
	{
		if(!mImpressedCardIds.contains(((Object) (card.getId()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Set mImpressedCardIds>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #96  <Method String Card.getId()>
	//*   4    8:invokeinterface #155 <Method boolean Set.contains(Object)>
	//*   5   13:ifne            75
		{
			card.logImpression();
	//    6   16:aload_1         
	//    7   17:invokevirtual   #157 <Method boolean Card.logImpression()>
	//    8   20:pop             
			mImpressedCardIds.add(((Object) (card.getId())));
	//    9   21:aload_0         
	//   10   22:getfield        #50  <Field Set mImpressedCardIds>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #96  <Method String Card.getId()>
	//   13   29:invokeinterface #160 <Method boolean Set.add(Object)>
	//   14   34:pop             
			String s = TAG;
	//   15   35:getstatic       #40  <Field String TAG>
	//   16   38:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   17   39:new             #162 <Class StringBuilder>
	//   18   42:dup             
	//   19   43:invokespecial   #163 <Method void StringBuilder()>
	//   20   46:astore_3        
			stringbuilder.append("Logged impression for card ");
	//   21   47:aload_3         
	//   22   48:ldc1            #165 <String "Logged impression for card ">
	//   23   50:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   24   53:pop             
			stringbuilder.append(card.getId());
	//   25   54:aload_3         
	//   26   55:aload_1         
	//   27   56:invokevirtual   #96  <Method String Card.getId()>
	//   28   59:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
			AppboyLogger.v(s, stringbuilder.toString());
	//   30   63:aload_2         
	//   31   64:aload_3         
	//   32   65:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   33   68:invokestatic    #176 <Method int AppboyLogger.v(String, String)>
	//   34   71:pop             
		} else
	//*  35   72:goto            112
		{
			String s1 = TAG;
	//   36   75:getstatic       #40  <Field String TAG>
	//   37   78:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   38   79:new             #162 <Class StringBuilder>
	//   39   82:dup             
	//   40   83:invokespecial   #163 <Method void StringBuilder()>
	//   41   86:astore_3        
			stringbuilder1.append("Already counted impression for card ");
	//   42   87:aload_3         
	//   43   88:ldc1            #178 <String "Already counted impression for card ">
	//   44   90:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   45   93:pop             
			stringbuilder1.append(card.getId());
	//   46   94:aload_3         
	//   47   95:aload_1         
	//   48   96:invokevirtual   #96  <Method String Card.getId()>
	//   49   99:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
			AppboyLogger.v(s1, stringbuilder1.toString());
	//   51  103:aload_2         
	//   52  104:aload_3         
	//   53  105:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   54  108:invokestatic    #176 <Method int AppboyLogger.v(String, String)>
	//   55  111:pop             
		}
		if(!card.getViewed())
	//*  56  112:aload_1         
	//*  57  113:invokevirtual   #181 <Method boolean Card.getViewed()>
	//*  58  116:ifne            124
			card.setViewed(true);
	//   59  119:aload_1         
	//   60  120:iconst_1        
	//   61  121:invokevirtual   #184 <Method void Card.setViewed(boolean)>
	//   62  124:return          
	}

	public void markOnScreenCardsAsRead()
	{
		if(mCardData.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field List mCardData>
	//*   2    4:invokeinterface #144 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            22
		{
			AppboyLogger.d(TAG, "Card list is empty. Not marking on-screen cards as read.");
	//    4   12:getstatic       #40  <Field String TAG>
	//    5   15:ldc1            #187 <String "Card list is empty. Not marking on-screen cards as read.">
	//    6   17:invokestatic    #190 <Method int AppboyLogger.d(String, String)>
	//    7   20:pop             
			return;
	//    8   21:return          
		}
		final int firstVisibleIndex = mLayoutManager.findFirstVisibleItemPosition();
	//    9   22:aload_0         
	//   10   23:getfield        #61  <Field LinearLayoutManager mLayoutManager>
	//   11   26:invokevirtual   #116 <Method int LinearLayoutManager.findFirstVisibleItemPosition()>
	//   12   29:istore_2        
		final int lastVisibleIndex = mLayoutManager.findLastVisibleItemPosition();
	//   13   30:aload_0         
	//   14   31:getfield        #61  <Field LinearLayoutManager mLayoutManager>
	//   15   34:invokevirtual   #128 <Method int LinearLayoutManager.findLastVisibleItemPosition()>
	//   16   37:istore_3        
		if(firstVisibleIndex >= 0 && lastVisibleIndex >= 0)
	//*  17   38:iload_2         
	//*  18   39:iflt            99
	//*  19   42:iload_3         
	//*  20   43:ifge            49
	//*  21   46:goto            99
		{
			for(int i = firstVisibleIndex; i <= lastVisibleIndex; i++)
	//*  22   49:iload_2         
	//*  23   50:istore_1        
	//*  24   51:iload_1         
	//*  25   52:iload_3         
	//*  26   53:icmpgt          80
				((Card)mCardData.get(i)).setIndicatorHighlighted(true);
	//   27   56:aload_0         
	//   28   57:getfield        #54  <Field List mCardData>
	//   29   60:iload_1         
	//   30   61:invokeinterface #90  <Method Object List.get(int)>
	//   31   66:checkcast       #92  <Class Card>
	//   32   69:iconst_1        
	//   33   70:invokevirtual   #193 <Method void Card.setIndicatorHighlighted(boolean)>

	//   34   73:iload_1         
	//   35   74:iconst_1        
	//   36   75:iadd            
	//   37   76:istore_1        
	//*  38   77:goto            51
			mHandler.post(new Runnable() {

				public void run()
				{
					int j = lastVisibleIndex;
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field int val$lastVisibleIndex>
				//    2    4:istore_1        
					int k = firstVisibleIndex;
				//    3    5:aload_0         
				//    4    6:getfield        #24  <Field int val$firstVisibleIndex>
				//    5    9:istore_2        
					notifyItemRangeChanged(k, (j - k) + 1);
				//    6   10:aload_0         
				//    7   11:getfield        #20  <Field AppboyCardAdapter this$0>
				//    8   14:iload_2         
				//    9   15:iload_1         
				//   10   16:iload_2         
				//   11   17:isub            
				//   12   18:iconst_1        
				//   13   19:iadd            
				//   14   20:invokevirtual   #32  <Method void AppboyCardAdapter.notifyItemRangeChanged(int, int)>
				//   15   23:return          
				}

				final AppboyCardAdapter this$0;
				final int val$firstVisibleIndex;
				final int val$lastVisibleIndex;

			
			{
				this$0 = AppboyCardAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AppboyCardAdapter this$0>
				lastVisibleIndex = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$lastVisibleIndex>
				firstVisibleIndex = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int val$firstVisibleIndex>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   39   80:aload_0         
	//   40   81:getfield        #59  <Field Handler mHandler>
	//   41   84:new             #11  <Class AppboyCardAdapter$2>
	//   42   87:dup             
	//   43   88:aload_0         
	//   44   89:iload_3         
	//   45   90:iload_2         
	//   46   91:invokespecial   #196 <Method void AppboyCardAdapter$2(AppboyCardAdapter, int, int)>
	//   47   94:invokevirtual   #200 <Method boolean Handler.post(Runnable)>
	//   48   97:pop             
			return;
	//   49   98:return          
		} else
		{
			String s = TAG;
	//   50   99:getstatic       #40  <Field String TAG>
	//   51  102:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   52  104:new             #162 <Class StringBuilder>
	//   53  107:dup             
	//   54  108:invokespecial   #163 <Method void StringBuilder()>
	//   55  111:astore          5
			stringbuilder.append("Not marking all on-screen cards as read. Either the first or last index is negative. First visible: ");
	//   56  113:aload           5
	//   57  115:ldc1            #202 <String "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: ">
	//   58  117:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   59  120:pop             
			stringbuilder.append(firstVisibleIndex);
	//   60  121:aload           5
	//   61  123:iload_2         
	//   62  124:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   63  127:pop             
			stringbuilder.append(" . Last visible: ");
	//   64  128:aload           5
	//   65  130:ldc1            #207 <String " . Last visible: ">
	//   66  132:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   67  135:pop             
			stringbuilder.append(lastVisibleIndex);
	//   68  136:aload           5
	//   69  138:iload_3         
	//   70  139:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   71  142:pop             
			AppboyLogger.d(s, stringbuilder.toString());
	//   72  143:aload           4
	//   73  145:aload           5
	//   74  147:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   75  150:invokestatic    #190 <Method int AppboyLogger.d(String, String)>
	//   76  153:pop             
			return;
	//   77  154:return          
		}
	}

	public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		onBindViewHolder((ContentCardViewHolder)viewholder, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #211 <Class ContentCardViewHolder>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #214 <Method void onBindViewHolder(ContentCardViewHolder, int)>
	//    5    9:return          
	}

	public void onBindViewHolder(ContentCardViewHolder contentcardviewholder, int i)
	{
		mContentCardsViewBindingHandler.onBindViewHolder(mContext, mCardData, contentcardviewholder, i);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field IContentCardsViewBindingHandler mContentCardsViewBindingHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field List mCardData>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokeinterface #217 <Method void IContentCardsViewBindingHandler.onBindViewHolder(Context, List, ContentCardViewHolder, int)>
	//    9   19:return          
	}

	public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return ((android.support.v7.widget.RecyclerView.ViewHolder) (onCreateViewHolder(viewgroup, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #222 <Method ContentCardViewHolder onCreateViewHolder(ViewGroup, int)>
	//    4    6:areturn         
	}

	public ContentCardViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
	{
		return mContentCardsViewBindingHandler.onCreateViewHolder(mContext, mCardData, viewgroup, i);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field IContentCardsViewBindingHandler mContentCardsViewBindingHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field List mCardData>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokeinterface #225 <Method ContentCardViewHolder IContentCardsViewBindingHandler.onCreateViewHolder(Context, List, ViewGroup, int)>
	//    9   19:areturn         
	}

	public void onItemDismiss(int i)
	{
		Card card = (Card)mCardData.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List mCardData>
	//    2    4:iload_1         
	//    3    5:invokeinterface #230 <Method Object List.remove(int)>
	//    4   10:checkcast       #92  <Class Card>
	//    5   13:astore_2        
		card.setIsDismissed(true);
	//    6   14:aload_2         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #233 <Method void Card.setIsDismissed(boolean)>
		notifyItemRemoved(i);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:invokevirtual   #236 <Method void notifyItemRemoved(int)>
		AppboyContentCardsManager.getInstance().getContentCardsActionListener().onContentCardDismissed(mContext, card);
	//   12   24:invokestatic    #242 <Method AppboyContentCardsManager AppboyContentCardsManager.getInstance()>
	//   13   27:invokevirtual   #246 <Method IContentCardsActionListener AppboyContentCardsManager.getContentCardsActionListener()>
	//   14   30:aload_0         
	//   15   31:getfield        #52  <Field Context mContext>
	//   16   34:aload_2         
	//   17   35:invokeinterface #252 <Method void IContentCardsActionListener.onContentCardDismissed(Context, Card)>
	//   18   40:return          
	}

	public volatile void onViewAttachedToWindow(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		onViewAttachedToWindow((ContentCardViewHolder)viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #211 <Class ContentCardViewHolder>
	//    3    5:invokevirtual   #257 <Method void onViewAttachedToWindow(ContentCardViewHolder)>
	//    4    8:return          
	}

	public void onViewAttachedToWindow(ContentCardViewHolder contentcardviewholder)
	{
		super.onViewAttachedToWindow(((android.support.v7.widget.RecyclerView.ViewHolder) (contentcardviewholder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #259 <Method void android.support.v7.widget.RecyclerView$Adapter.onViewAttachedToWindow(android.support.v7.widget.RecyclerView$ViewHolder)>
		if(mCardData.isEmpty())
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field List mCardData>
	//*   5    9:invokeinterface #144 <Method boolean List.isEmpty()>
	//*   6   14:ifeq            18
			return;
	//    7   17:return          
		int i = contentcardviewholder.getAdapterPosition();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #262 <Method int ContentCardViewHolder.getAdapterPosition()>
	//   10   22:istore_2        
		if(i != -1 && isAdapterPositionOnScreen(i))
	//*  11   23:iload_2         
	//*  12   24:iconst_m1       
	//*  13   25:icmpeq          57
	//*  14   28:aload_0         
	//*  15   29:iload_2         
	//*  16   30:invokevirtual   #264 <Method boolean isAdapterPositionOnScreen(int)>
	//*  17   33:ifne            39
	//*  18   36:goto            57
		{
			logImpression((Card)mCardData.get(i));
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #54  <Field List mCardData>
	//   22   44:iload_2         
	//   23   45:invokeinterface #90  <Method Object List.get(int)>
	//   24   50:checkcast       #92  <Class Card>
	//   25   53:invokevirtual   #266 <Method void logImpression(Card)>
			return;
	//   26   56:return          
		} else
		{
			contentcardviewholder = ((ContentCardViewHolder) (TAG));
	//   27   57:getstatic       #40  <Field String TAG>
	//   28   60:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   29   61:new             #162 <Class StringBuilder>
	//   30   64:dup             
	//   31   65:invokespecial   #163 <Method void StringBuilder()>
	//   32   68:astore_3        
			stringbuilder.append("The card at position ");
	//   33   69:aload_3         
	//   34   70:ldc2            #268 <String "The card at position ">
	//   35   73:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:pop             
			stringbuilder.append(i);
	//   37   77:aload_3         
	//   38   78:iload_2         
	//   39   79:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   40   82:pop             
			stringbuilder.append(" isn't on screen or does not have a valid adapter position. Not logging impression.");
	//   41   83:aload_3         
	//   42   84:ldc2            #270 <String " isn't on screen or does not have a valid adapter position. Not logging impression.">
	//   43   87:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
			AppboyLogger.v(((String) (contentcardviewholder)), stringbuilder.toString());
	//   45   91:aload_1         
	//   46   92:aload_3         
	//   47   93:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   48   96:invokestatic    #176 <Method int AppboyLogger.v(String, String)>
	//   49   99:pop             
			return;
	//   50  100:return          
		}
	}

	public volatile void onViewDetachedFromWindow(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		onViewDetachedFromWindow((ContentCardViewHolder)viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #211 <Class ContentCardViewHolder>
	//    3    5:invokevirtual   #273 <Method void onViewDetachedFromWindow(ContentCardViewHolder)>
	//    4    8:return          
	}

	public void onViewDetachedFromWindow(ContentCardViewHolder contentcardviewholder)
	{
		super.onViewDetachedFromWindow(((android.support.v7.widget.RecyclerView.ViewHolder) (contentcardviewholder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #275 <Method void android.support.v7.widget.RecyclerView$Adapter.onViewDetachedFromWindow(android.support.v7.widget.RecyclerView$ViewHolder)>
		if(mCardData.isEmpty())
	//*   3    5:aload_0         
	//*   4    6:getfield        #54  <Field List mCardData>
	//*   5    9:invokeinterface #144 <Method boolean List.isEmpty()>
	//*   6   14:ifeq            18
			return;
	//    7   17:return          
		final int adapterPosition = contentcardviewholder.getAdapterPosition();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #262 <Method int ContentCardViewHolder.getAdapterPosition()>
	//   10   22:istore_2        
		if(adapterPosition != -1 && isAdapterPositionOnScreen(adapterPosition))
	//*  11   23:iload_2         
	//*  12   24:iconst_m1       
	//*  13   25:icmpeq          74
	//*  14   28:aload_0         
	//*  15   29:iload_2         
	//*  16   30:invokevirtual   #264 <Method boolean isAdapterPositionOnScreen(int)>
	//*  17   33:ifne            39
	//*  18   36:goto            74
		{
			((Card)mCardData.get(adapterPosition)).setIndicatorHighlighted(true);
	//   19   39:aload_0         
	//   20   40:getfield        #54  <Field List mCardData>
	//   21   43:iload_2         
	//   22   44:invokeinterface #90  <Method Object List.get(int)>
	//   23   49:checkcast       #92  <Class Card>
	//   24   52:iconst_1        
	//   25   53:invokevirtual   #193 <Method void Card.setIndicatorHighlighted(boolean)>
			mHandler.post(new Runnable() {

				public void run()
				{
					notifyItemChanged(adapterPosition);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AppboyCardAdapter this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field int val$adapterPosition>
				//    4    8:invokevirtual   #30  <Method void AppboyCardAdapter.notifyItemChanged(int)>
				//    5   11:return          
				}

				final AppboyCardAdapter this$0;
				final int val$adapterPosition;

			
			{
				this$0 = AppboyCardAdapter.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppboyCardAdapter this$0>
				adapterPosition = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int val$adapterPosition>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   26   56:aload_0         
	//   27   57:getfield        #59  <Field Handler mHandler>
	//   28   60:new             #9   <Class AppboyCardAdapter$1>
	//   29   63:dup             
	//   30   64:aload_0         
	//   31   65:iload_2         
	//   32   66:invokespecial   #278 <Method void AppboyCardAdapter$1(AppboyCardAdapter, int)>
	//   33   69:invokevirtual   #200 <Method boolean Handler.post(Runnable)>
	//   34   72:pop             
			return;
	//   35   73:return          
		} else
		{
			contentcardviewholder = ((ContentCardViewHolder) (TAG));
	//   36   74:getstatic       #40  <Field String TAG>
	//   37   77:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   38   78:new             #162 <Class StringBuilder>
	//   39   81:dup             
	//   40   82:invokespecial   #163 <Method void StringBuilder()>
	//   41   85:astore_3        
			stringbuilder.append("The card at position ");
	//   42   86:aload_3         
	//   43   87:ldc2            #268 <String "The card at position ">
	//   44   90:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   45   93:pop             
			stringbuilder.append(adapterPosition);
	//   46   94:aload_3         
	//   47   95:iload_2         
	//   48   96:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   49   99:pop             
			stringbuilder.append(" isn't on screen or does not have a valid adapter position. Not marking as read.");
	//   50  100:aload_3         
	//   51  101:ldc2            #280 <String " isn't on screen or does not have a valid adapter position. Not marking as read.">
	//   52  104:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   53  107:pop             
			AppboyLogger.v(((String) (contentcardviewholder)), stringbuilder.toString());
	//   54  108:aload_1         
	//   55  109:aload_3         
	//   56  110:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   57  113:invokestatic    #176 <Method int AppboyLogger.v(String, String)>
	//   58  116:pop             
			return;
	//   59  117:return          
		}
	}

	public void replaceCards(List list)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		android.support.v7.util.DiffUtil.DiffResult diffresult = DiffUtil.calculateDiff(((android.support.v7.util.DiffUtil.Callback) (new CardListDiffCallback(mCardData, list))));
	//    2    2:new             #13  <Class AppboyCardAdapter$CardListDiffCallback>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field List mCardData>
	//    7   11:aload_1         
	//    8   12:invokespecial   #285 <Method void AppboyCardAdapter$CardListDiffCallback(AppboyCardAdapter, List, List)>
	//    9   15:invokestatic    #291 <Method android.support.v7.util.DiffUtil$DiffResult DiffUtil.calculateDiff(android.support.v7.util.DiffUtil$Callback)>
	//   10   18:astore_2        
		mCardData.clear();
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field List mCardData>
	//   13   23:invokeinterface #294 <Method void List.clear()>
		mCardData.addAll(((java.util.Collection) (list)));
	//   14   28:aload_0         
	//   15   29:getfield        #54  <Field List mCardData>
	//   16   32:aload_1         
	//   17   33:invokeinterface #298 <Method boolean List.addAll(java.util.Collection)>
	//   18   38:pop             
		diffresult.dispatchUpdatesTo(((android.support.v7.widget.RecyclerView.Adapter) (this)));
	//   19   39:aload_2         
	//   20   40:aload_0         
	//   21   41:invokevirtual   #304 <Method void android.support.v7.util.DiffUtil$DiffResult.dispatchUpdatesTo(android.support.v7.widget.RecyclerView$Adapter)>
		this;
	//   22   44:aload_0         
		JVM INSTR monitorexit ;
	//   23   45:monitorexit     
		return;
	//   24   46:return          
		list;
	//   25   47:astore_1        
	//*  26   48:aload_0         
		throw list;
	//   27   49:monitorexit     
	//   28   50:aload_1         
	//   29   51:athrow          
	}

	public void setImpressedCardIds(List list)
	{
		mImpressedCardIds = ((Set) (new HashSet(((java.util.Collection) (list)))));
	//    0    0:aload_0         
	//    1    1:new             #47  <Class HashSet>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #307 <Method void HashSet(java.util.Collection)>
	//    5    9:putfield        #50  <Field Set mImpressedCardIds>
	//    6   12:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/contentcards/AppboyCardAdapter);
	private List mCardData;
	private final IContentCardsViewBindingHandler mContentCardsViewBindingHandler;
	private final Context mContext;
	private final Handler mHandler = new Handler();
	private Set mImpressedCardIds;
	private final LinearLayoutManager mLayoutManager;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyCardAdapter>
	//    1    2:invokestatic    #38  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #40  <Field String TAG>
	//*   3    8:return          
	}
}
