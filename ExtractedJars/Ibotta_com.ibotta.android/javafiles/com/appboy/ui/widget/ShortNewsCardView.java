// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.feed.view.BaseFeedCardView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

public class ShortNewsCardView extends BaseFeedCardView
{

	public ShortNewsCardView(Context context)
	{
		this(context, ((ShortNewsCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #36  <Method void ShortNewsCardView(Context, ShortNewsCard)>
	//    4    6:return          
	}

	public ShortNewsCardView(Context context, ShortNewsCard shortnewscard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void BaseFeedCardView(Context)>
		mAspectRatio = 1.0F;
	//    3    5:aload_0         
	//    4    6:fconst_1        
	//    5    7:putfield        #40  <Field float mAspectRatio>
		mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_description);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getstatic       #46  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_description>
	//    9   15:invokevirtual   #50  <Method View findViewById(int)>
	//   10   18:checkcast       #52  <Class TextView>
	//   11   21:putfield        #54  <Field TextView mDescription>
		mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_title);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getstatic       #57  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_title>
	//   15   29:invokevirtual   #50  <Method View findViewById(int)>
	//   16   32:checkcast       #52  <Class TextView>
	//   17   35:putfield        #59  <Field TextView mTitle>
		mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_domain);
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getstatic       #62  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_domain>
	//   21   43:invokevirtual   #50  <Method View findViewById(int)>
	//   22   46:checkcast       #52  <Class TextView>
	//   23   49:putfield        #64  <Field TextView mDomain>
		mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_short_news_card_imageview_stub);
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:getstatic       #67  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_imageview_stub>
	//   27   57:invokevirtual   #70  <Method View getProperViewFromInflatedStub(int)>
	//   28   60:checkcast       #72  <Class ImageView>
	//   29   63:putfield        #74  <Field ImageView mImage>
		mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   30   66:aload_0         
	//   31   67:getfield        #74  <Field ImageView mImage>
	//   32   70:getstatic       #80  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   33   73:invokevirtual   #84  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		mImage.setAdjustViewBounds(true);
	//   34   76:aload_0         
	//   35   77:getfield        #74  <Field ImageView mImage>
	//   36   80:iconst_1        
	//   37   81:invokevirtual   #88  <Method void ImageView.setAdjustViewBounds(boolean)>
		if(shortnewscard != null)
	//*  38   84:aload_2         
	//*  39   85:ifnull          93
			setCard(((Card) (shortnewscard)));
	//   40   88:aload_0         
	//   41   89:aload_2         
	//   42   90:invokevirtual   #92  <Method void setCard(Card)>
		setBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//   43   93:aload_0         
	//   44   94:aload_0         
	//   45   95:invokevirtual   #96  <Method Resources getResources()>
	//   46   98:getstatic       #101 <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   47  101:invokevirtual   #107 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   48  104:invokevirtual   #111 <Method void setBackground(android.graphics.drawable.Drawable)>
	//   49  107:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_short_news_card;
	//    0    0:getstatic       #124 <Field int com.appboy.ui.R$layout.com_appboy_short_news_card>
	//    1    3:ireturn         
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((ShortNewsCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #127 <Class ShortNewsCard>
	//    3    5:invokevirtual   #130 <Method void onSetCard(ShortNewsCard)>
	//    4    8:return          
	}

	public void onSetCard(final ShortNewsCard card)
	{
		mDescription.setText(((CharSequence) (card.getDescription())));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field TextView mDescription>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method String ShortNewsCard.getDescription()>
	//    4    8:invokevirtual   #137 <Method void TextView.setText(CharSequence)>
		setOptionalTextView(mTitle, card.getTitle());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #59  <Field TextView mTitle>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #140 <Method String ShortNewsCard.getTitle()>
	//   10   20:invokevirtual   #144 <Method void setOptionalTextView(TextView, String)>
		setOptionalTextView(mDomain, card.getDomain());
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #64  <Field TextView mDomain>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #147 <Method String ShortNewsCard.getDomain()>
	//   16   32:invokevirtual   #144 <Method void setOptionalTextView(TextView, String)>
		mCardAction = ((IAction) (getUriActionForCard(((Card) (card)))));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokestatic    #151 <Method com.appboy.ui.actions.UriAction getUriActionForCard(Card)>
	//   20   40:putfield        #115 <Field IAction mCardAction>
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (ShortNewsCardView.this));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ShortNewsCardView this$0>
			//    2    4:astore_1        
				((ShortNewsCardView) (view)).handleCardClick(((ShortNewsCardView) (view)).mContext, ((Card) (card)), mCardAction, ShortNewsCardView.TAG);
			//    3    5:aload_1         
			//    4    6:aload_1         
			//    5    7:getfield        #31  <Field Context ShortNewsCardView.mContext>
			//    6   10:aload_0         
			//    7   11:getfield        #21  <Field ShortNewsCard val$card>
			//    8   14:aload_0         
			//    9   15:getfield        #19  <Field ShortNewsCardView this$0>
			//   10   18:invokestatic    #35  <Method IAction ShortNewsCardView.access$000(ShortNewsCardView)>
			//   11   21:invokestatic    #39  <Method String ShortNewsCardView.access$100()>
			//   12   24:invokevirtual   #43  <Method void ShortNewsCardView.handleCardClick(Context, Card, IAction, String)>
			//   13   27:return          
			}

			final ShortNewsCardView this$0;
			final ShortNewsCard val$card;

			
			{
				this$0 = ShortNewsCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ShortNewsCardView this$0>
				card = shortnewscard;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ShortNewsCard val$card>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   21   43:new             #7   <Class ShortNewsCardView$1>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokespecial   #154 <Method void ShortNewsCardView$1(ShortNewsCardView, ShortNewsCard)>
	//   26   52:astore_2        
		if(!(this instanceof View))
	//*  27   53:aload_0         
	//*  28   54:instanceof      #156 <Class View>
	//*  29   57:ifne            68
			setOnClickListener(onclicklistener);
	//   30   60:aload_0         
	//   31   61:aload_2         
	//   32   62:invokevirtual   #160 <Method void setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  33   65:goto            76
			ViewInstrumentation.setOnClickListener((View)this, onclicklistener);
	//   34   68:aload_0         
	//   35   69:checkcast       #156 <Class View>
	//   36   72:aload_2         
	//   37   73:invokestatic    #165 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		setImageViewToUrl(mImage, card.getImageUrl(), 1.0F);
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:getfield        #74  <Field ImageView mImage>
	//   41   81:aload_1         
	//   42   82:invokevirtual   #168 <Method String ShortNewsCard.getImageUrl()>
	//   43   85:fconst_1        
	//   44   86:invokevirtual   #172 <Method void setImageViewToUrl(ImageView, String, float)>
	//   45   89:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/ShortNewsCardView);
	private final float mAspectRatio;
	private IAction mCardAction;
	private final TextView mDescription;
	private final TextView mDomain;
	private ImageView mImage;
	private final TextView mTitle;

	static 
	{
	//    0    0:ldc1            #2   <Class ShortNewsCardView>
	//    1    2:invokestatic    #28  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #30  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(ShortNewsCardView shortnewscardview)
	{
		return shortnewscardview.mCardAction;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field IAction mCardAction>
	//    2    4:areturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #30  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
