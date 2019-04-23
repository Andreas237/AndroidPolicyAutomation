// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.IAction;

// Referenced classes of package com.appboy.ui.widget:
//			BaseCardView

public class TextAnnouncementCardView extends BaseCardView
{

	public TextAnnouncementCardView(Context context)
	{
		this(context, ((TextAnnouncementCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #31  <Method void TextAnnouncementCardView(Context, TextAnnouncementCard)>
	//    4    6:return          
	}

	public TextAnnouncementCardView(Context context, TextAnnouncementCard textannouncementcard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void BaseCardView(Context)>
		mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_title);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getstatic       #39  <Field int com.appboy.ui.R$id.com_appboy_text_announcement_card_title>
	//    6   10:invokevirtual   #43  <Method View findViewById(int)>
	//    7   13:checkcast       #45  <Class TextView>
	//    8   16:putfield        #47  <Field TextView mTitle>
		mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_description);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getstatic       #50  <Field int com.appboy.ui.R$id.com_appboy_text_announcement_card_description>
	//   12   24:invokevirtual   #43  <Method View findViewById(int)>
	//   13   27:checkcast       #45  <Class TextView>
	//   14   30:putfield        #52  <Field TextView mDescription>
		mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_domain);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getstatic       #55  <Field int com.appboy.ui.R$id.com_appboy_text_announcement_card_domain>
	//   18   38:invokevirtual   #43  <Method View findViewById(int)>
	//   19   41:checkcast       #45  <Class TextView>
	//   20   44:putfield        #57  <Field TextView mDomain>
		if(textannouncementcard != null)
	//*  21   47:aload_2         
	//*  22   48:ifnull          56
			setCard(((Card) (textannouncementcard)));
	//   23   51:aload_0         
	//   24   52:aload_2         
	//   25   53:invokevirtual   #61  <Method void setCard(Card)>
		safeSetBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:invokevirtual   #65  <Method Resources getResources()>
	//   29   61:getstatic       #70  <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   30   64:invokevirtual   #76  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   31   67:invokevirtual   #80  <Method void safeSetBackground(android.graphics.drawable.Drawable)>
	//   32   70:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_text_announcement_card;
	//    0    0:getstatic       #93  <Field int com.appboy.ui.R$layout.com_appboy_text_announcement_card>
	//    1    3:ireturn         
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((TextAnnouncementCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #96  <Class TextAnnouncementCard>
	//    3    5:invokevirtual   #99  <Method void onSetCard(TextAnnouncementCard)>
	//    4    8:return          
	}

	public void onSetCard(final TextAnnouncementCard card)
	{
		mTitle.setText(((CharSequence) (card.getTitle())));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field TextView mTitle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #102 <Method String TextAnnouncementCard.getTitle()>
	//    4    8:invokevirtual   #106 <Method void TextView.setText(CharSequence)>
		mDescription.setText(((CharSequence) (card.getDescription())));
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field TextView mDescription>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #109 <Method String TextAnnouncementCard.getDescription()>
	//    9   19:invokevirtual   #106 <Method void TextView.setText(CharSequence)>
		setOptionalTextView(mDomain, card.getDomain());
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #57  <Field TextView mDomain>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #112 <Method String TextAnnouncementCard.getDomain()>
	//   15   31:invokevirtual   #116 <Method void setOptionalTextView(TextView, String)>
		mCardAction = ((IAction) (getUriActionForCard(((Card) (card)))));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokestatic    #120 <Method com.appboy.ui.actions.UriAction getUriActionForCard(Card)>
	//   19   39:putfield        #84  <Field IAction mCardAction>
		setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				BaseCardView.handleCardClick(mContext, ((Card) (card)), mCardAction, TextAnnouncementCardView.TAG);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field TextAnnouncementCardView this$0>
			//    2    4:getfield        #31  <Field Context TextAnnouncementCardView.mContext>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field TextAnnouncementCard val$card>
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field TextAnnouncementCardView this$0>
			//    7   15:invokestatic    #35  <Method IAction TextAnnouncementCardView.access$000(TextAnnouncementCardView)>
			//    8   18:invokestatic    #39  <Method String TextAnnouncementCardView.access$100()>
			//    9   21:invokestatic    #45  <Method void BaseCardView.handleCardClick(Context, Card, IAction, String)>
			//   10   24:return          
			}

			final TextAnnouncementCardView this$0;
			final TextAnnouncementCard val$card;

			
			{
				this$0 = TextAnnouncementCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TextAnnouncementCardView this$0>
				card = textannouncementcard;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TextAnnouncementCard val$card>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   20   42:aload_0         
	//   21   43:new             #7   <Class TextAnnouncementCardView$1>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokespecial   #123 <Method void TextAnnouncementCardView$1(TextAnnouncementCardView, TextAnnouncementCard)>
	//   26   52:invokevirtual   #127 <Method void setOnClickListener(android.view.View$OnClickListener)>
	//   27   55:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/TextAnnouncementCardView);
	private IAction mCardAction;
	private final TextView mDescription;
	private final TextView mDomain;
	private final TextView mTitle;

	static 
	{
	//    0    0:ldc1            #2   <Class TextAnnouncementCardView>
	//    1    2:invokestatic    #23  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #25  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(TextAnnouncementCardView textannouncementcardview)
	{
		return textannouncementcardview.mCardAction;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field IAction mCardAction>
	//    2    4:areturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #25  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
