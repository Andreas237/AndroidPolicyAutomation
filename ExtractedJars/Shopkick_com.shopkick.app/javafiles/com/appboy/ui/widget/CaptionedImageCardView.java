// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.IAction;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.widget:
//			BaseCardView

public class CaptionedImageCardView extends BaseCardView
{

	public CaptionedImageCardView(Context context)
	{
		this(context, ((CaptionedImageCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #37  <Method void CaptionedImageCardView(Context, CaptionedImageCard)>
	//    4    6:return          
	}

	public CaptionedImageCardView(Context context, CaptionedImageCard captionedimagecard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void BaseCardView(Context)>
		mAspectRatio = 1.333333F;
	//    3    5:aload_0         
	//    4    6:ldc1            #40  <Float 1.333333F>
	//    5    8:putfield        #42  <Field float mAspectRatio>
		if(canUseFresco())
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #46  <Method boolean canUseFresco()>
	//*   8   15:ifeq            35
		{
			mDrawee = (SimpleDraweeView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_captioned_image_card_drawee_stub);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getstatic       #52  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_card_drawee_stub>
	//   12   23:invokevirtual   #56  <Method View getProperViewFromInflatedStub(int)>
	//   13   26:checkcast       #58  <Class SimpleDraweeView>
	//   14   29:putfield        #60  <Field SimpleDraweeView mDrawee>
		} else
	//*  15   32:goto            67
		{
			mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_captioned_image_card_imageview_stub);
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getstatic       #63  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_card_imageview_stub>
	//   19   40:invokevirtual   #56  <Method View getProperViewFromInflatedStub(int)>
	//   20   43:checkcast       #65  <Class ImageView>
	//   21   46:putfield        #67  <Field ImageView mImage>
			mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   22   49:aload_0         
	//   23   50:getfield        #67  <Field ImageView mImage>
	//   24   53:getstatic       #73  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   25   56:invokevirtual   #77  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			mImage.setAdjustViewBounds(true);
	//   26   59:aload_0         
	//   27   60:getfield        #67  <Field ImageView mImage>
	//   28   63:iconst_1        
	//   29   64:invokevirtual   #81  <Method void ImageView.setAdjustViewBounds(boolean)>
		}
		mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_title);
	//   30   67:aload_0         
	//   31   68:aload_0         
	//   32   69:getstatic       #84  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_title>
	//   33   72:invokevirtual   #87  <Method View findViewById(int)>
	//   34   75:checkcast       #89  <Class TextView>
	//   35   78:putfield        #91  <Field TextView mTitle>
		mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_description);
	//   36   81:aload_0         
	//   37   82:aload_0         
	//   38   83:getstatic       #94  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_description>
	//   39   86:invokevirtual   #87  <Method View findViewById(int)>
	//   40   89:checkcast       #89  <Class TextView>
	//   41   92:putfield        #96  <Field TextView mDescription>
		mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_card_domain);
	//   42   95:aload_0         
	//   43   96:aload_0         
	//   44   97:getstatic       #99  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_card_domain>
	//   45  100:invokevirtual   #87  <Method View findViewById(int)>
	//   46  103:checkcast       #89  <Class TextView>
	//   47  106:putfield        #101 <Field TextView mDomain>
		if(captionedimagecard != null)
	//*  48  109:aload_2         
	//*  49  110:ifnull          118
			setCard(((Card) (captionedimagecard)));
	//   50  113:aload_0         
	//   51  114:aload_2         
	//   52  115:invokevirtual   #105 <Method void setCard(Card)>
		safeSetBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//   53  118:aload_0         
	//   54  119:aload_0         
	//   55  120:invokevirtual   #109 <Method Resources getResources()>
	//   56  123:getstatic       #114 <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   57  126:invokevirtual   #120 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   58  129:invokevirtual   #124 <Method void safeSetBackground(android.graphics.drawable.Drawable)>
	//   59  132:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_captioned_image_card;
	//    0    0:getstatic       #137 <Field int com.appboy.ui.R$layout.com_appboy_captioned_image_card>
	//    1    3:ireturn         
	}

	public void onSetCard(final CaptionedImageCard card)
	{
		mTitle.setText(((CharSequence) (card.getTitle())));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field TextView mTitle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method String CaptionedImageCard.getTitle()>
	//    4    8:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
		mDescription.setText(((CharSequence) (card.getDescription())));
	//    5   11:aload_0         
	//    6   12:getfield        #96  <Field TextView mDescription>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #151 <Method String CaptionedImageCard.getDescription()>
	//    9   19:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
		setOptionalTextView(mDomain, card.getDomain());
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #101 <Field TextView mDomain>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #154 <Method String CaptionedImageCard.getDomain()>
	//   15   31:invokevirtual   #158 <Method void setOptionalTextView(TextView, String)>
		mCardAction = ((IAction) (getUriActionForCard(((Card) (card)))));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokestatic    #162 <Method com.appboy.ui.actions.UriAction getUriActionForCard(Card)>
	//   19   39:putfield        #128 <Field IAction mCardAction>
		boolean flag;
		if(card.getAspectRatio() != 0.0F)
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #166 <Method float CaptionedImageCard.getAspectRatio()>
	//*  22   46:fconst_0        
	//*  23   47:fcmpl           
	//*  24   48:ifeq            64
		{
			mAspectRatio = card.getAspectRatio();
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #166 <Method float CaptionedImageCard.getAspectRatio()>
	//   28   56:putfield        #42  <Field float mAspectRatio>
			flag = true;
	//   29   59:iconst_1        
	//   30   60:istore_2        
		} else
	//*  31   61:goto            66
		{
			flag = false;
	//   32   64:iconst_0        
	//   33   65:istore_2        
		}
		setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				BaseCardView.handleCardClick(mContext, ((Card) (card)), mCardAction, CaptionedImageCardView.TAG);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CaptionedImageCardView this$0>
			//    2    4:getfield        #31  <Field Context CaptionedImageCardView.mContext>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field CaptionedImageCard val$card>
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field CaptionedImageCardView this$0>
			//    7   15:invokestatic    #35  <Method IAction CaptionedImageCardView.access$000(CaptionedImageCardView)>
			//    8   18:invokestatic    #39  <Method String CaptionedImageCardView.access$100()>
			//    9   21:invokestatic    #45  <Method void BaseCardView.handleCardClick(Context, Card, IAction, String)>
			//   10   24:return          
			}

			final CaptionedImageCardView this$0;
			final CaptionedImageCard val$card;

			
			{
				this$0 = CaptionedImageCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CaptionedImageCardView this$0>
				card = captionedimagecard;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CaptionedImageCard val$card>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   34   66:aload_0         
	//   35   67:new             #7   <Class CaptionedImageCardView$1>
	//   36   70:dup             
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokespecial   #169 <Method void CaptionedImageCardView$1(CaptionedImageCardView, CaptionedImageCard)>
	//   40   76:invokevirtual   #173 <Method void setOnClickListener(android.view.View$OnClickListener)>
		if(canUseFresco())
	//*  41   79:aload_0         
	//*  42   80:invokevirtual   #46  <Method boolean canUseFresco()>
	//*  43   83:ifeq            104
		{
			setSimpleDraweeToUrl(mDrawee, card.getImageUrl(), mAspectRatio, flag);
	//   44   86:aload_0         
	//   45   87:aload_0         
	//   46   88:getfield        #60  <Field SimpleDraweeView mDrawee>
	//   47   91:aload_1         
	//   48   92:invokevirtual   #176 <Method String CaptionedImageCard.getImageUrl()>
	//   49   95:aload_0         
	//   50   96:getfield        #42  <Field float mAspectRatio>
	//   51   99:iload_2         
	//   52  100:invokevirtual   #180 <Method void setSimpleDraweeToUrl(SimpleDraweeView, String, float, boolean)>
			return;
	//   53  103:return          
		} else
		{
			setImageViewToUrl(mImage, card.getImageUrl(), mAspectRatio, flag);
	//   54  104:aload_0         
	//   55  105:aload_0         
	//   56  106:getfield        #67  <Field ImageView mImage>
	//   57  109:aload_1         
	//   58  110:invokevirtual   #176 <Method String CaptionedImageCard.getImageUrl()>
	//   59  113:aload_0         
	//   60  114:getfield        #42  <Field float mAspectRatio>
	//   61  117:iload_2         
	//   62  118:invokevirtual   #184 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
			return;
	//   63  121:return          
		}
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((CaptionedImageCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #141 <Class CaptionedImageCard>
	//    3    5:invokevirtual   #186 <Method void onSetCard(CaptionedImageCard)>
	//    4    8:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/CaptionedImageCardView);
	private float mAspectRatio;
	private IAction mCardAction;
	private final TextView mDescription;
	private final TextView mDomain;
	private SimpleDraweeView mDrawee;
	private ImageView mImage;
	private final TextView mTitle;

	static 
	{
	//    0    0:ldc1            #2   <Class CaptionedImageCardView>
	//    1    2:invokestatic    #29  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #31  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(CaptionedImageCardView captionedimagecardview)
	{
		return captionedimagecardview.mCardAction;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field IAction mCardAction>
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
