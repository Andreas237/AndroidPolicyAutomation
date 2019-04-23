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
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//			BaseCardView

public class BannerImageCardView extends BaseCardView
{

	public BannerImageCardView(Context context)
	{
		this(context, ((BannerImageCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #33  <Method void BannerImageCardView(Context, BannerImageCard)>
	//    4    6:return          
	}

	public BannerImageCardView(Context context, BannerImageCard bannerimagecard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #35  <Method void BaseCardView(Context)>
		mAspectRatio = 6F;
	//    3    5:aload_0         
	//    4    6:ldc1            #36  <Float 6F>
	//    5    8:putfield        #38  <Field float mAspectRatio>
		if(canUseFresco())
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #42  <Method boolean canUseFresco()>
	//*   8   15:ifeq            35
		{
			mDrawee = (SimpleDraweeView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_banner_image_card_drawee_stub);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getstatic       #48  <Field int com.appboy.ui.R$id.com_appboy_banner_image_card_drawee_stub>
	//   12   23:invokevirtual   #52  <Method View getProperViewFromInflatedStub(int)>
	//   13   26:checkcast       #54  <Class SimpleDraweeView>
	//   14   29:putfield        #56  <Field SimpleDraweeView mDrawee>
		} else
	//*  15   32:goto            67
		{
			mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_banner_image_card_imageview_stub);
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getstatic       #59  <Field int com.appboy.ui.R$id.com_appboy_banner_image_card_imageview_stub>
	//   19   40:invokevirtual   #52  <Method View getProperViewFromInflatedStub(int)>
	//   20   43:checkcast       #61  <Class ImageView>
	//   21   46:putfield        #63  <Field ImageView mImage>
			mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   22   49:aload_0         
	//   23   50:getfield        #63  <Field ImageView mImage>
	//   24   53:getstatic       #69  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   25   56:invokevirtual   #73  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			mImage.setAdjustViewBounds(true);
	//   26   59:aload_0         
	//   27   60:getfield        #63  <Field ImageView mImage>
	//   28   63:iconst_1        
	//   29   64:invokevirtual   #77  <Method void ImageView.setAdjustViewBounds(boolean)>
		}
		if(bannerimagecard != null)
	//*  30   67:aload_2         
	//*  31   68:ifnull          76
			setCard(((Card) (bannerimagecard)));
	//   32   71:aload_0         
	//   33   72:aload_2         
	//   34   73:invokevirtual   #81  <Method void setCard(Card)>
		safeSetBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//   35   76:aload_0         
	//   36   77:aload_0         
	//   37   78:invokevirtual   #85  <Method Resources getResources()>
	//   38   81:getstatic       #90  <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   39   84:invokevirtual   #96  <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   40   87:invokevirtual   #100 <Method void safeSetBackground(android.graphics.drawable.Drawable)>
	//   41   90:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_banner_image_card;
	//    0    0:getstatic       #113 <Field int com.appboy.ui.R$layout.com_appboy_banner_image_card>
	//    1    3:ireturn         
	}

	public void onSetCard(final BannerImageCard card)
	{
		boolean flag;
		if(card.getAspectRatio() != 0.0F)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #121 <Method float BannerImageCard.getAspectRatio()>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifeq            22
		{
			mAspectRatio = card.getAspectRatio();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #121 <Method float BannerImageCard.getAspectRatio()>
	//    8   14:putfield        #38  <Field float mAspectRatio>
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
		if(canUseFresco())
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #42  <Method boolean canUseFresco()>
	//*  16   28:ifeq            51
			setSimpleDraweeToUrl(mDrawee, card.getImageUrl(), mAspectRatio, flag);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #56  <Field SimpleDraweeView mDrawee>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #124 <Method String BannerImageCard.getImageUrl()>
	//   22   40:aload_0         
	//   23   41:getfield        #38  <Field float mAspectRatio>
	//   24   44:iload_2         
	//   25   45:invokevirtual   #128 <Method void setSimpleDraweeToUrl(SimpleDraweeView, String, float, boolean)>
		else
	//*  26   48:goto            68
			setImageViewToUrl(mImage, card.getImageUrl(), mAspectRatio, flag);
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #63  <Field ImageView mImage>
	//   30   56:aload_1         
	//   31   57:invokevirtual   #124 <Method String BannerImageCard.getImageUrl()>
	//   32   60:aload_0         
	//   33   61:getfield        #38  <Field float mAspectRatio>
	//   34   64:iload_2         
	//   35   65:invokevirtual   #132 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
		mCardAction = ((IAction) (getUriActionForCard(((Card) (card)))));
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:invokestatic    #136 <Method com.appboy.ui.actions.UriAction getUriActionForCard(Card)>
	//   39   73:putfield        #104 <Field IAction mCardAction>
		setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				BaseCardView.handleCardClick(mContext, ((Card) (card)), mCardAction, BannerImageCardView.TAG, false);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field BannerImageCardView this$0>
			//    2    4:getfield        #31  <Field Context BannerImageCardView.mContext>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field BannerImageCard val$card>
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field BannerImageCardView this$0>
			//    7   15:invokestatic    #35  <Method IAction BannerImageCardView.access$000(BannerImageCardView)>
			//    8   18:invokestatic    #39  <Method String BannerImageCardView.access$100()>
			//    9   21:iconst_0        
			//   10   22:invokestatic    #45  <Method void BaseCardView.handleCardClick(Context, Card, IAction, String, boolean)>
			//   11   25:return          
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
);
	//   40   76:aload_0         
	//   41   77:new             #7   <Class BannerImageCardView$1>
	//   42   80:dup             
	//   43   81:aload_0         
	//   44   82:aload_1         
	//   45   83:invokespecial   #139 <Method void BannerImageCardView$1(BannerImageCardView, BannerImageCard)>
	//   46   86:invokevirtual   #143 <Method void setOnClickListener(android.view.View$OnClickListener)>
	//   47   89:return          
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((BannerImageCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #117 <Class BannerImageCard>
	//    3    5:invokevirtual   #145 <Method void onSetCard(BannerImageCard)>
	//    4    8:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/BannerImageCardView);
	private float mAspectRatio;
	private IAction mCardAction;
	private SimpleDraweeView mDrawee;
	private ImageView mImage;

	static 
	{
	//    0    0:ldc1            #2   <Class BannerImageCardView>
	//    1    2:invokestatic    #25  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #27  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(BannerImageCardView bannerimagecardview)
	{
		return bannerimagecardview.mCardAction;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field IAction mCardAction>
	//    2    4:areturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #27  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
