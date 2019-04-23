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
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//			BaseCardView

public class ShortNewsCardView extends BaseCardView
{

	public ShortNewsCardView(Context context)
	{
		this(context, ((ShortNewsCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #37  <Method void ShortNewsCardView(Context, ShortNewsCard)>
	//    4    6:return          
	}

	public ShortNewsCardView(Context context, ShortNewsCard shortnewscard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void BaseCardView(Context)>
		mAspectRatio = 1.0F;
	//    3    5:aload_0         
	//    4    6:fconst_1        
	//    5    7:putfield        #41  <Field float mAspectRatio>
		mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_description);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getstatic       #47  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_description>
	//    9   15:invokevirtual   #51  <Method View findViewById(int)>
	//   10   18:checkcast       #53  <Class TextView>
	//   11   21:putfield        #55  <Field TextView mDescription>
		mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_title);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getstatic       #58  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_title>
	//   15   29:invokevirtual   #51  <Method View findViewById(int)>
	//   16   32:checkcast       #53  <Class TextView>
	//   17   35:putfield        #60  <Field TextView mTitle>
		mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_short_news_card_domain);
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getstatic       #63  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_domain>
	//   21   43:invokevirtual   #51  <Method View findViewById(int)>
	//   22   46:checkcast       #53  <Class TextView>
	//   23   49:putfield        #65  <Field TextView mDomain>
		if(canUseFresco())
	//*  24   52:aload_0         
	//*  25   53:invokevirtual   #69  <Method boolean canUseFresco()>
	//*  26   56:ifeq            76
		{
			mDrawee = (SimpleDraweeView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_short_news_card_drawee_stub);
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:getstatic       #72  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_drawee_stub>
	//   30   64:invokevirtual   #75  <Method View getProperViewFromInflatedStub(int)>
	//   31   67:checkcast       #77  <Class SimpleDraweeView>
	//   32   70:putfield        #79  <Field SimpleDraweeView mDrawee>
		} else
	//*  33   73:goto            108
		{
			mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_short_news_card_imageview_stub);
	//   34   76:aload_0         
	//   35   77:aload_0         
	//   36   78:getstatic       #82  <Field int com.appboy.ui.R$id.com_appboy_short_news_card_imageview_stub>
	//   37   81:invokevirtual   #75  <Method View getProperViewFromInflatedStub(int)>
	//   38   84:checkcast       #84  <Class ImageView>
	//   39   87:putfield        #86  <Field ImageView mImage>
			mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   40   90:aload_0         
	//   41   91:getfield        #86  <Field ImageView mImage>
	//   42   94:getstatic       #92  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   43   97:invokevirtual   #96  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			mImage.setAdjustViewBounds(true);
	//   44  100:aload_0         
	//   45  101:getfield        #86  <Field ImageView mImage>
	//   46  104:iconst_1        
	//   47  105:invokevirtual   #100 <Method void ImageView.setAdjustViewBounds(boolean)>
		}
		if(shortnewscard != null)
	//*  48  108:aload_2         
	//*  49  109:ifnull          117
			setCard(((Card) (shortnewscard)));
	//   50  112:aload_0         
	//   51  113:aload_2         
	//   52  114:invokevirtual   #104 <Method void setCard(Card)>
		safeSetBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//   53  117:aload_0         
	//   54  118:aload_0         
	//   55  119:invokevirtual   #108 <Method Resources getResources()>
	//   56  122:getstatic       #113 <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   57  125:invokevirtual   #119 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   58  128:invokevirtual   #123 <Method void safeSetBackground(android.graphics.drawable.Drawable)>
	//   59  131:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_short_news_card;
	//    0    0:getstatic       #136 <Field int com.appboy.ui.R$layout.com_appboy_short_news_card>
	//    1    3:ireturn         
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((ShortNewsCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #139 <Class ShortNewsCard>
	//    3    5:invokevirtual   #142 <Method void onSetCard(ShortNewsCard)>
	//    4    8:return          
	}

	public void onSetCard(final ShortNewsCard card)
	{
		mDescription.setText(((CharSequence) (card.getDescription())));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field TextView mDescription>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #145 <Method String ShortNewsCard.getDescription()>
	//    4    8:invokevirtual   #149 <Method void TextView.setText(CharSequence)>
		setOptionalTextView(mTitle, card.getTitle());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #60  <Field TextView mTitle>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #152 <Method String ShortNewsCard.getTitle()>
	//   10   20:invokevirtual   #156 <Method void setOptionalTextView(TextView, String)>
		setOptionalTextView(mDomain, card.getDomain());
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #65  <Field TextView mDomain>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #159 <Method String ShortNewsCard.getDomain()>
	//   16   32:invokevirtual   #156 <Method void setOptionalTextView(TextView, String)>
		mCardAction = ((IAction) (getUriActionForCard(((Card) (card)))));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokestatic    #163 <Method com.appboy.ui.actions.UriAction getUriActionForCard(Card)>
	//   20   40:putfield        #127 <Field IAction mCardAction>
		setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				BaseCardView.handleCardClick(mContext, ((Card) (card)), mCardAction, ShortNewsCardView.TAG);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ShortNewsCardView this$0>
			//    2    4:getfield        #31  <Field Context ShortNewsCardView.mContext>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field ShortNewsCard val$card>
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field ShortNewsCardView this$0>
			//    7   15:invokestatic    #35  <Method IAction ShortNewsCardView.access$000(ShortNewsCardView)>
			//    8   18:invokestatic    #39  <Method String ShortNewsCardView.access$100()>
			//    9   21:invokestatic    #45  <Method void BaseCardView.handleCardClick(Context, Card, IAction, String)>
			//   10   24:return          
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
);
	//   21   43:aload_0         
	//   22   44:new             #7   <Class ShortNewsCardView$1>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokespecial   #166 <Method void ShortNewsCardView$1(ShortNewsCardView, ShortNewsCard)>
	//   27   53:invokevirtual   #170 <Method void setOnClickListener(android.view.View$OnClickListener)>
		if(canUseFresco())
	//*  28   56:aload_0         
	//*  29   57:invokevirtual   #69  <Method boolean canUseFresco()>
	//*  30   60:ifeq            78
		{
			setSimpleDraweeToUrl(mDrawee, card.getImageUrl(), 1.0F, true);
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:getfield        #79  <Field SimpleDraweeView mDrawee>
	//   34   68:aload_1         
	//   35   69:invokevirtual   #173 <Method String ShortNewsCard.getImageUrl()>
	//   36   72:fconst_1        
	//   37   73:iconst_1        
	//   38   74:invokevirtual   #177 <Method void setSimpleDraweeToUrl(SimpleDraweeView, String, float, boolean)>
			return;
	//   39   77:return          
		} else
		{
			setImageViewToUrl(mImage, card.getImageUrl(), 1.0F);
	//   40   78:aload_0         
	//   41   79:aload_0         
	//   42   80:getfield        #86  <Field ImageView mImage>
	//   43   83:aload_1         
	//   44   84:invokevirtual   #173 <Method String ShortNewsCard.getImageUrl()>
	//   45   87:fconst_1        
	//   46   88:invokevirtual   #181 <Method void setImageViewToUrl(ImageView, String, float)>
			return;
	//   47   91:return          
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/ShortNewsCardView);
	private final float mAspectRatio;
	private IAction mCardAction;
	private final TextView mDescription;
	private final TextView mDomain;
	private SimpleDraweeView mDrawee;
	private ImageView mImage;
	private final TextView mTitle;

	static 
	{
	//    0    0:ldc1            #2   <Class ShortNewsCardView>
	//    1    2:invokestatic    #29  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #31  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(ShortNewsCardView shortnewscardview)
	{
		return shortnewscardview.mCardAction;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field IAction mCardAction>
	//    2    4:areturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #31  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
