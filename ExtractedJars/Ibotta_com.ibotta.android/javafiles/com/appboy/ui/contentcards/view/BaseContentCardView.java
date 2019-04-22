// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.cards.Card;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.actions.UriAction;
import com.appboy.ui.contentcards.AppboyContentCardsManager;
import com.appboy.ui.contentcards.listeners.IContentCardsActionListener;
import com.appboy.ui.widget.BaseCardView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

// Referenced classes of package com.appboy.ui.contentcards.view:
//			ContentCardViewHolder

public abstract class BaseContentCardView extends BaseCardView
{

	public BaseContentCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void BaseCardView(Context)>
	//    3    5:return          
	}

	public void bindViewHolder(ContentCardViewHolder contentcardviewholder, final Card card)
	{
		contentcardviewholder.setPinnedIconVisible(card.getIsPinned());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #33  <Method boolean Card.getIsPinned()>
	//    3    5:invokevirtual   #39  <Method void ContentCardViewHolder.setPinnedIconVisible(boolean)>
		boolean flag = mAppboyConfigurationProvider.isContentCardsUnreadVisualIndicatorEnabled();
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
	//    6   12:invokevirtual   #48  <Method boolean AppboyConfigurationProvider.isContentCardsUnreadVisualIndicatorEnabled()>
	//    7   15:istore_3        
		boolean flag1 = true;
	//    8   16:iconst_1        
	//    9   17:istore          4
		if(flag && !card.isIndicatorHighlighted())
	//*  10   19:iload_3         
	//*  11   20:ifeq            35
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #51  <Method boolean Card.isIndicatorHighlighted()>
	//*  14   27:ifne            35
			flag = true;
	//   15   30:iconst_1        
	//   16   31:istore_3        
		else
	//*  17   32:goto            37
			flag = false;
	//   18   35:iconst_0        
	//   19   36:istore_3        
		contentcardviewholder.setUnreadBarVisible(flag);
	//   20   37:aload_1         
	//   21   38:iload_3         
	//   22   39:invokevirtual   #54  <Method void ContentCardViewHolder.setUnreadBarVisible(boolean)>
		final UriAction mCardAction = getUriActionForCard(card);
	//   23   42:aload_2         
	//   24   43:invokestatic    #58  <Method UriAction getUriActionForCard(Card)>
	//   25   46:astore          5
		View view = contentcardviewholder.itemView;
	//   26   48:aload_1         
	//   27   49:getfield        #62  <Field View ContentCardViewHolder.itemView>
	//   28   52:astore          6
		card = ((Card) (new android.view.View.OnClickListener() {

			public void onClick(View view1)
			{
				view1 = ((View) (BaseContentCardView.this));
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field BaseContentCardView this$0>
			//    2    4:astore_1        
				((BaseContentCardView) (view1)).handleCardClick(
// JavaClassFileOutputException: get_constant: invalid tag

			final BaseContentCardView this$0;
			final Card val$card;
			final UriAction val$mCardAction;

			
			{
				this$0 = BaseContentCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field BaseContentCardView this$0>
				card = card1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Card val$card>
				mCardAction = uriaction;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field UriAction val$mCardAction>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//   29   54:new             #7   <Class BaseContentCardView$1>
	//   30   57:dup             
	//   31   58:aload_0         
	//   32   59:aload_2         
	//   33   60:aload           5
	//   34   62:invokespecial   #65  <Method void BaseContentCardView$1(BaseContentCardView, Card, UriAction)>
	//   35   65:astore_2        
		if(!(view instanceof View))
	//*  36   66:aload           6
	//*  37   68:instanceof      #67  <Class View>
	//*  38   71:ifne            83
			view.setOnClickListener(((android.view.View.OnClickListener) (card)));
	//   39   74:aload           6
	//   40   76:aload_2         
	//   41   77:invokevirtual   #71  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  42   80:goto            92
			ViewInstrumentation.setOnClickListener((View)view, ((android.view.View.OnClickListener) (card)));
	//   43   83:aload           6
	//   44   85:checkcast       #67  <Class View>
	//   45   88:aload_2         
	//   46   89:invokestatic    #76  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		if(mCardAction != null)
	//*  47   92:aload           5
	//*  48   94:ifnull          103
			flag = flag1;
	//   49   97:iload           4
	//   50   99:istore_3        
		else
	//*  51  100:goto            105
			flag = false;
	//   52  103:iconst_0        
	//   53  104:istore_3        
		contentcardviewholder.setActionHintVisible(flag);
	//   54  105:aload_1         
	//   55  106:iload_3         
	//   56  107:invokevirtual   #79  <Method void ContentCardViewHolder.setActionHintVisible(boolean)>
	//   57  110:return          
	}

	public abstract ContentCardViewHolder createViewHolder(ViewGroup viewgroup);

	protected boolean isClickHandled(Context context, Card card, IAction iaction)
	{
		return AppboyContentCardsManager.getInstance().getContentCardsActionListener().onContentCardClicked(context, card, iaction);
	//    0    0:invokestatic    #91  <Method AppboyContentCardsManager AppboyContentCardsManager.getInstance()>
	//    1    3:invokevirtual   #95  <Method IContentCardsActionListener AppboyContentCardsManager.getContentCardsActionListener()>
	//    2    6:aload_1         
	//    3    7:aload_2         
	//    4    8:aload_3         
	//    5    9:invokeinterface #100 <Method boolean IContentCardsActionListener.onContentCardClicked(Context, Card, IAction)>
	//    6   14:ireturn         
	}

	protected void safeSetClipToOutline(ImageView imageview)
	{
		if(imageview != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			imageview.setClipToOutline(true);
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #110 <Method void ImageView.setClipToOutline(boolean)>
	//    5    9:return          
	}

	public void setOptionalCardImage(ImageView imageview, float f, String s, float f1)
	{
		boolean flag;
		if(f != 0.0F)
	//*   0    0:fload_2         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            12
		{
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          5
		} else
	//*   6    9:goto            18
		{
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          5
			f = f1;
	//    9   15:fload           4
	//   10   17:fstore_2        
		}
		if(imageview != null)
	//*  11   18:aload_1         
	//*  12   19:ifnull          31
			setImageViewToUrl(imageview, s, f, flag);
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:aload_3         
	//   16   25:fload_2         
	//   17   26:iload           5
	//   18   28:invokevirtual   #118 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
	//   19   31:return          
	}


/*
	static Context access$000(BaseContentCardView basecontentcardview)
	{
		return basecontentcardview.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(BaseContentCardView basecontentcardview, Context context, Card card, IAction iaction, String s)
	{
		basecontentcardview.handleCardClick(context, card, iaction, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #25  <Method void handleCardClick(Context, Card, IAction, String)>
		return;
	//    6    9:return          
	}

*/
}
