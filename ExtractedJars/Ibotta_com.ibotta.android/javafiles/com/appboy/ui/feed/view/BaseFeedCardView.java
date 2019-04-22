// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.feed.view;

import android.content.Context;
import android.view.*;
import android.widget.ImageView;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.feed.AppboyFeedManager;
import com.appboy.ui.feed.AppboyImageSwitcher;
import com.appboy.ui.feed.listeners.IFeedClickActionListener;
import com.appboy.ui.widget.BaseCardView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import java.util.Observable;
import java.util.Observer;

public abstract class BaseFeedCardView extends BaseCardView
	implements Observer
{

	public BaseFeedCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void BaseCardView(Context)>
		((LayoutInflater)context.getSystemService("layout_inflater")).inflate(getLayoutResource(), ((android.view.ViewGroup) (this)));
	//    3    5:aload_1         
	//    4    6:ldc1            #29  <String "layout_inflater">
	//    5    8:invokevirtual   #35  <Method Object Context.getSystemService(String)>
	//    6   11:checkcast       #37  <Class LayoutInflater>
	//    7   14:aload_0         
	//    8   15:invokevirtual   #41  <Method int getLayoutResource()>
	//    9   18:aload_0         
	//   10   19:invokevirtual   #45  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   11   22:pop             
		mImageSwitcher = (AppboyImageSwitcher)findViewById(com.appboy.ui.R.id.com_appboy_newsfeed_item_read_indicator_image_switcher);
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getstatic       #51  <Field int com.appboy.ui.R$id.com_appboy_newsfeed_item_read_indicator_image_switcher>
	//   15   28:invokevirtual   #55  <Method View findViewById(int)>
	//   16   31:checkcast       #57  <Class AppboyImageSwitcher>
	//   17   34:putfield        #61  <Field AppboyImageSwitcher mImageSwitcher>
		if(mImageSwitcher != null)
	//*  18   37:aload_0         
	//*  19   38:getfield        #61  <Field AppboyImageSwitcher mImageSwitcher>
	//*  20   41:ifnull          59
			mImageSwitcher.setFactory(new android.widget.ViewSwitcher.ViewFactory() );
	//   21   44:aload_0         
	//   22   45:getfield        #61  <Field AppboyImageSwitcher mImageSwitcher>
	//   23   48:new             #9   <Class BaseFeedCardView$1>
	//   24   51:dup             
	//   25   52:aload_0         
	//   26   53:invokespecial   #64  <Method void BaseFeedCardView$1(BaseFeedCardView)>
	//   27   56:invokevirtual   #68  <Method void AppboyImageSwitcher.setFactory(android.widget.ViewSwitcher$ViewFactory)>
		if(!isUnreadIndicatorEnabled() && mImageSwitcher != null)
	//*  28   59:aload_0         
	//*  29   60:invokevirtual   #72  <Method boolean isUnreadIndicatorEnabled()>
	//*  30   63:ifne            82
	//*  31   66:aload_0         
	//*  32   67:getfield        #61  <Field AppboyImageSwitcher mImageSwitcher>
	//*  33   70:ifnull          82
			mImageSwitcher.setVisibility(8);
	//   34   73:aload_0         
	//   35   74:getfield        #61  <Field AppboyImageSwitcher mImageSwitcher>
	//   36   77:bipush          8
	//   37   79:invokevirtual   #76  <Method void AppboyImageSwitcher.setVisibility(int)>
	//   38   82:return          
	}

	public Card getCard()
	{
		return mCard;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Card mCard>
	//    2    4:areturn         
	}

	protected abstract int getLayoutResource();

	public View getProperViewFromInflatedStub(int i)
	{
		ViewStub viewstub = (ViewStub)findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #55  <Method View findViewById(int)>
	//    3    5:checkcast       #91  <Class ViewStub>
	//    4    8:astore_2        
		if(!(viewstub instanceof ViewStub))
	//*   5    9:aload_2         
	//*   6   10:instanceof      #91  <Class ViewStub>
	//*   7   13:ifne            24
			viewstub.inflate();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #94  <Method View ViewStub.inflate()>
	//   10   20:pop             
		else
	//*  11   21:goto            32
			ViewInstrumentation.inflate((ViewStub)viewstub);
	//   12   24:aload_2         
	//   13   25:checkcast       #91  <Class ViewStub>
	//   14   28:invokestatic    #99  <Method View ViewInstrumentation.inflate(ViewStub)>
	//   15   31:pop             
		return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_feed_image_view);
	//   16   32:aload_0         
	//   17   33:getstatic       #102 <Field int com.appboy.ui.R$id.com_appboy_stubbed_feed_image_view>
	//   18   36:invokevirtual   #55  <Method View findViewById(int)>
	//   19   39:areturn         
	}

	protected boolean isClickHandled(Context context, Card card, IAction iaction)
	{
		return AppboyFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, iaction);
	//    0    0:invokestatic    #110 <Method AppboyFeedManager AppboyFeedManager.getInstance()>
	//    1    3:invokevirtual   #114 <Method IFeedClickActionListener AppboyFeedManager.getFeedCardClickActionListener()>
	//    2    6:aload_1         
	//    3    7:aload_2         
	//    4    8:aload_3         
	//    5    9:invokeinterface #119 <Method boolean IFeedClickActionListener.onFeedCardClicked(Context, Card, IAction)>
	//    6   14:ireturn         
	}

	protected abstract void onSetCard(Card card);

	public void setCard(Card card)
	{
		mCard = card;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field Card mCard>
		onSetCard(card);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #124 <Method void onSetCard(Card)>
		card.addObserver(((Observer) (this)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #130 <Method void Card.addObserver(Observer)>
		setCardViewedIndicator(mImageSwitcher, getCard());
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #61  <Field AppboyImageSwitcher mImageSwitcher>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #132 <Method Card getCard()>
	//   14   24:invokevirtual   #136 <Method void setCardViewedIndicator(AppboyImageSwitcher, Card)>
	//   15   27:return          
	}

	public void update(Observable observable, Object obj)
	{
		setCardViewedIndicator(mImageSwitcher, getCard());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #61  <Field AppboyImageSwitcher mImageSwitcher>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #132 <Method Card getCard()>
	//    5    9:invokevirtual   #136 <Method void setCardViewedIndicator(AppboyImageSwitcher, Card)>
	//    6   12:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/BaseCardView);

	static 
	{
	//    0    0:ldc1            #5   <Class BaseCardView>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String TAG>
	//*   3    8:return          
	}


/*
	static Context access$000(BaseFeedCardView basefeedcardview)
	{
		return basefeedcardview.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Context mContext>
	//    2    4:areturn         
	}

*/
}
