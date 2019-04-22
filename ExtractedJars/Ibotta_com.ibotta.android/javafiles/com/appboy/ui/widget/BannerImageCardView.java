// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.feed.view.BaseFeedCardView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

public class BannerImageCardView extends BaseFeedCardView
{

	public BannerImageCardView(Context context)
	{
		this(context, ((BannerImageCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #32  <Method void BannerImageCardView(Context, BannerImageCard)>
	//    4    6:return          
	}

	public BannerImageCardView(Context context, BannerImageCard bannerimagecard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void BaseFeedCardView(Context)>
		mAspectRatio = 6F;
	//    3    5:aload_0         
	//    4    6:ldc1            #35  <Float 6F>
	//    5    8:putfield        #37  <Field float mAspectRatio>
		mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_banner_image_card_imageview_stub);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getstatic       #43  <Field int com.appboy.ui.R$id.com_appboy_banner_image_card_imageview_stub>
	//    9   16:invokevirtual   #47  <Method View getProperViewFromInflatedStub(int)>
	//   10   19:checkcast       #49  <Class ImageView>
	//   11   22:putfield        #51  <Field ImageView mImage>
		mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   12   25:aload_0         
	//   13   26:getfield        #51  <Field ImageView mImage>
	//   14   29:getstatic       #57  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   15   32:invokevirtual   #61  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		mImage.setAdjustViewBounds(true);
	//   16   35:aload_0         
	//   17   36:getfield        #51  <Field ImageView mImage>
	//   18   39:iconst_1        
	//   19   40:invokevirtual   #65  <Method void ImageView.setAdjustViewBounds(boolean)>
		if(bannerimagecard != null)
	//*  20   43:aload_2         
	//*  21   44:ifnull          52
			setCard(((Card) (bannerimagecard)));
	//   22   47:aload_0         
	//   23   48:aload_2         
	//   24   49:invokevirtual   #69  <Method void setCard(Card)>
		setBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:invokevirtual   #73  <Method Resources getResources()>
	//   28   57:getstatic       #78  <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   29   60:invokevirtual   #84  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   30   63:invokevirtual   #88  <Method void setBackground(android.graphics.drawable.Drawable)>
	//   31   66:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_banner_image_card;
	//    0    0:getstatic       #101 <Field int com.appboy.ui.R$layout.com_appboy_banner_image_card>
	//    1    3:ireturn         
	}

	public void onSetCard(final BannerImageCard card)
	{
		boolean flag;
		if(card.getAspectRatio() != 0.0F)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #109 <Method float BannerImageCard.getAspectRatio()>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			mAspectRatio = card.getAspectRatio();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #109 <Method float BannerImageCard.getAspectRatio()>
	//    8   14:putfield        #37  <Field float mAspectRatio>
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		} else
	//*  11   19:goto            24
		{
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		}
		setImageViewToUrl(mImage, card.getImageUrl(), mAspectRatio, flag);
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #51  <Field ImageView mImage>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #112 <Method String BannerImageCard.getImageUrl()>
	//   19   33:aload_0         
	//   20   34:getfield        #37  <Field float mAspectRatio>
	//   21   37:iload_2         
	//   22   38:invokevirtual   #116 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
		mCardAction = ((IAction) (getUriActionForCard(((Card) (card)))));
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:invokestatic    #120 <Method com.appboy.ui.actions.UriAction getUriActionForCard(Card)>
	//   26   46:putfield        #92  <Field IAction mCardAction>
		card = ((BannerImageCard) (new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (BannerImageCardView.this));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BannerImageCardView this$0>
			//    2    4:astore_1        
				((BannerImageCardView) (view)).handleCardClick(((BannerImageCardView) (view)).mContext, ((Card) (card)), mCardAction, BannerImageCardView.TAG);
			//    3    5:aload_1         
			//    4    6:aload_1         
			//    5    7:getfield        #31  <Field Context BannerImageCardView.mContext>
			//    6   10:aload_0         
			//    7   11:getfield        #21  <Field BannerImageCard val$card>
			//    8   14:aload_0         
			//    9   15:getfield        #19  <Field BannerImageCardView this$0>
			//   10   18:invokestatic    #35  <Method IAction BannerImageCardView.access$000(BannerImageCardView)>
			//   11   21:invokestatic    #39  <Method String BannerImageCardView.access$100()>
			//   12   24:invokevirtual   #43  <Method void BannerImageCardView.handleCardClick(Context, Card, IAction, String)>
			//   13   27:return          
			}

			final BannerImageCardView this$0;
			final BannerImageCard val$card;

			
			{
				this$0 = BannerImageCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BannerImageCardView this$0>
				card = bannerimagecard;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field BannerImageCard val$card>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//   27   49:new             #7   <Class BannerImageCardView$1>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokespecial   #123 <Method void BannerImageCardView$1(BannerImageCardView, BannerImageCard)>
	//   32   58:astore_1        
		if(!(this instanceof View))
	//*  33   59:aload_0         
	//*  34   60:instanceof      #125 <Class View>
	//*  35   63:ifne            72
		{
			setOnClickListener(((android.view.View.OnClickListener) (card)));
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:invokevirtual   #129 <Method void setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   39   71:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)this, ((android.view.View.OnClickListener) (card)));
	//   40   72:aload_0         
	//   41   73:checkcast       #125 <Class View>
	//   42   76:aload_1         
	//   43   77:invokestatic    #134 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   44   80:return          
		}
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((BannerImageCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #105 <Class BannerImageCard>
	//    3    5:invokevirtual   #136 <Method void onSetCard(BannerImageCard)>
	//    4    8:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/BannerImageCardView);
	private float mAspectRatio;
	private IAction mCardAction;
	private ImageView mImage;

	static 
	{
	//    0    0:ldc1            #2   <Class BannerImageCardView>
	//    1    2:invokestatic    #24  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #26  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(BannerImageCardView bannerimagecardview)
	{
		return bannerimagecardview.mCardAction;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field IAction mCardAction>
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
