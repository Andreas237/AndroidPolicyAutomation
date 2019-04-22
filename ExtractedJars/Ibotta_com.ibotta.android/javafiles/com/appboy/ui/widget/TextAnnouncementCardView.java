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
import com.appboy.ui.feed.view.BaseFeedCardView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

public class TextAnnouncementCardView extends BaseFeedCardView
{

	public TextAnnouncementCardView(Context context)
	{
		this(context, ((TextAnnouncementCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #32  <Method void TextAnnouncementCardView(Context, TextAnnouncementCard)>
	//    4    6:return          
	}

	public TextAnnouncementCardView(Context context, TextAnnouncementCard textannouncementcard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void BaseFeedCardView(Context)>
		mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_title);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getstatic       #40  <Field int com.appboy.ui.R$id.com_appboy_text_announcement_card_title>
	//    6   10:invokevirtual   #44  <Method View findViewById(int)>
	//    7   13:checkcast       #46  <Class TextView>
	//    8   16:putfield        #48  <Field TextView mTitle>
		mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_description);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getstatic       #51  <Field int com.appboy.ui.R$id.com_appboy_text_announcement_card_description>
	//   12   24:invokevirtual   #44  <Method View findViewById(int)>
	//   13   27:checkcast       #46  <Class TextView>
	//   14   30:putfield        #53  <Field TextView mDescription>
		mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_text_announcement_card_domain);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getstatic       #56  <Field int com.appboy.ui.R$id.com_appboy_text_announcement_card_domain>
	//   18   38:invokevirtual   #44  <Method View findViewById(int)>
	//   19   41:checkcast       #46  <Class TextView>
	//   20   44:putfield        #58  <Field TextView mDomain>
		if(textannouncementcard != null)
	//*  21   47:aload_2         
	//*  22   48:ifnull          56
			setCard(((Card) (textannouncementcard)));
	//   23   51:aload_0         
	//   24   52:aload_2         
	//   25   53:invokevirtual   #62  <Method void setCard(Card)>
		setBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:invokevirtual   #66  <Method Resources getResources()>
	//   29   61:getstatic       #71  <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   30   64:invokevirtual   #77  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   31   67:invokevirtual   #81  <Method void setBackground(android.graphics.drawable.Drawable)>
	//   32   70:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_text_announcement_card;
	//    0    0:getstatic       #94  <Field int com.appboy.ui.R$layout.com_appboy_text_announcement_card>
	//    1    3:ireturn         
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((TextAnnouncementCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #97  <Class TextAnnouncementCard>
	//    3    5:invokevirtual   #100 <Method void onSetCard(TextAnnouncementCard)>
	//    4    8:return          
	}

	public void onSetCard(final TextAnnouncementCard card)
	{
		mTitle.setText(((CharSequence) (card.getTitle())));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field TextView mTitle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #103 <Method String TextAnnouncementCard.getTitle()>
	//    4    8:invokevirtual   #107 <Method void TextView.setText(CharSequence)>
		mDescription.setText(((CharSequence) (card.getDescription())));
	//    5   11:aload_0         
	//    6   12:getfield        #53  <Field TextView mDescription>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #110 <Method String TextAnnouncementCard.getDescription()>
	//    9   19:invokevirtual   #107 <Method void TextView.setText(CharSequence)>
		setOptionalTextView(mDomain, card.getDomain());
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #58  <Field TextView mDomain>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #113 <Method String TextAnnouncementCard.getDomain()>
	//   15   31:invokevirtual   #117 <Method void setOptionalTextView(TextView, String)>
		mCardAction = ((IAction) (getUriActionForCard(((Card) (card)))));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokestatic    #121 <Method com.appboy.ui.actions.UriAction getUriActionForCard(Card)>
	//   19   39:putfield        #85  <Field IAction mCardAction>
		card = ((TextAnnouncementCard) (new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (TextAnnouncementCardView.this));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field TextAnnouncementCardView this$0>
			//    2    4:astore_1        
				((TextAnnouncementCardView) (view)).handleCardClick(((TextAnnouncementCardView) (view)).mContext, ((Card) (card)), mCardAction, TextAnnouncementCardView.TAG);
			//    3    5:aload_1         
			//    4    6:aload_1         
			//    5    7:getfield        #31  <Field Context TextAnnouncementCardView.mContext>
			//    6   10:aload_0         
			//    7   11:getfield        #21  <Field TextAnnouncementCard val$card>
			//    8   14:aload_0         
			//    9   15:getfield        #19  <Field TextAnnouncementCardView this$0>
			//   10   18:invokestatic    #35  <Method IAction TextAnnouncementCardView.access$000(TextAnnouncementCardView)>
			//   11   21:invokestatic    #39  <Method String TextAnnouncementCardView.access$100()>
			//   12   24:invokevirtual   #43  <Method void TextAnnouncementCardView.handleCardClick(Context, Card, IAction, String)>
			//   13   27:return          
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
));
	//   20   42:new             #7   <Class TextAnnouncementCardView$1>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokespecial   #124 <Method void TextAnnouncementCardView$1(TextAnnouncementCardView, TextAnnouncementCard)>
	//   25   51:astore_1        
		if(!(this instanceof View))
	//*  26   52:aload_0         
	//*  27   53:instanceof      #126 <Class View>
	//*  28   56:ifne            65
		{
			setOnClickListener(((android.view.View.OnClickListener) (card)));
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokevirtual   #130 <Method void setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   32   64:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)this, ((android.view.View.OnClickListener) (card)));
	//   33   65:aload_0         
	//   34   66:checkcast       #126 <Class View>
	//   35   69:aload_1         
	//   36   70:invokestatic    #135 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   37   73:return          
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/TextAnnouncementCardView);
	private IAction mCardAction;
	private final TextView mDescription;
	private final TextView mDomain;
	private final TextView mTitle;

	static 
	{
	//    0    0:ldc1            #2   <Class TextAnnouncementCardView>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(TextAnnouncementCardView textannouncementcardview)
	{
		return textannouncementcardview.mCardAction;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field IAction mCardAction>
	//    2    4:areturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #26  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
