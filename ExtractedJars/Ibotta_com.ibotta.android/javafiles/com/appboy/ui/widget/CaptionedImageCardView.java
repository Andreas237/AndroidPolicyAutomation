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
import com.appboy.ui.feed.view.BaseFeedCardView;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

public class CaptionedImageCardView extends BaseFeedCardView
{

	public CaptionedImageCardView(Context context)
	{
		this(context, ((CaptionedImageCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #36  <Method void CaptionedImageCardView(Context, CaptionedImageCard)>
	//    4    6:return          
	}

	public CaptionedImageCardView(Context context, CaptionedImageCard captionedimagecard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void BaseFeedCardView(Context)>
		mAspectRatio = 1.333333F;
	//    3    5:aload_0         
	//    4    6:ldc1            #39  <Float 1.333333F>
	//    5    8:putfield        #41  <Field float mAspectRatio>
		mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_captioned_image_card_imageview_stub);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:getstatic       #47  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_card_imageview_stub>
	//    9   16:invokevirtual   #51  <Method View getProperViewFromInflatedStub(int)>
	//   10   19:checkcast       #53  <Class ImageView>
	//   11   22:putfield        #55  <Field ImageView mImage>
		mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   12   25:aload_0         
	//   13   26:getfield        #55  <Field ImageView mImage>
	//   14   29:getstatic       #61  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   15   32:invokevirtual   #65  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		mImage.setAdjustViewBounds(true);
	//   16   35:aload_0         
	//   17   36:getfield        #55  <Field ImageView mImage>
	//   18   39:iconst_1        
	//   19   40:invokevirtual   #69  <Method void ImageView.setAdjustViewBounds(boolean)>
		mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_title);
	//   20   43:aload_0         
	//   21   44:aload_0         
	//   22   45:getstatic       #72  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_title>
	//   23   48:invokevirtual   #75  <Method View findViewById(int)>
	//   24   51:checkcast       #77  <Class TextView>
	//   25   54:putfield        #79  <Field TextView mTitle>
		mDescription = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_description);
	//   26   57:aload_0         
	//   27   58:aload_0         
	//   28   59:getstatic       #82  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_description>
	//   29   62:invokevirtual   #75  <Method View findViewById(int)>
	//   30   65:checkcast       #77  <Class TextView>
	//   31   68:putfield        #84  <Field TextView mDescription>
		mDomain = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_captioned_image_card_domain);
	//   32   71:aload_0         
	//   33   72:aload_0         
	//   34   73:getstatic       #87  <Field int com.appboy.ui.R$id.com_appboy_captioned_image_card_domain>
	//   35   76:invokevirtual   #75  <Method View findViewById(int)>
	//   36   79:checkcast       #77  <Class TextView>
	//   37   82:putfield        #89  <Field TextView mDomain>
		if(captionedimagecard != null)
	//*  38   85:aload_2         
	//*  39   86:ifnull          94
			setCard(((Card) (captionedimagecard)));
	//   40   89:aload_0         
	//   41   90:aload_2         
	//   42   91:invokevirtual   #93  <Method void setCard(Card)>
		setBackground(getResources().getDrawable(com.appboy.ui.R.drawable.com_appboy_card_background));
	//   43   94:aload_0         
	//   44   95:aload_0         
	//   45   96:invokevirtual   #97  <Method Resources getResources()>
	//   46   99:getstatic       #102 <Field int com.appboy.ui.R$drawable.com_appboy_card_background>
	//   47  102:invokevirtual   #108 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	//   48  105:invokevirtual   #112 <Method void setBackground(android.graphics.drawable.Drawable)>
	//   49  108:return          
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_captioned_image_card;
	//    0    0:getstatic       #125 <Field int com.appboy.ui.R$layout.com_appboy_captioned_image_card>
	//    1    3:ireturn         
	}

	public void onSetCard(final CaptionedImageCard card)
	{
		mTitle.setText(((CharSequence) (card.getTitle())));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field TextView mTitle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #132 <Method String CaptionedImageCard.getTitle()>
	//    4    8:invokevirtual   #136 <Method void TextView.setText(CharSequence)>
		mDescription.setText(((CharSequence) (card.getDescription())));
	//    5   11:aload_0         
	//    6   12:getfield        #84  <Field TextView mDescription>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #139 <Method String CaptionedImageCard.getDescription()>
	//    9   19:invokevirtual   #136 <Method void TextView.setText(CharSequence)>
		setOptionalTextView(mDomain, card.getDomain());
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #89  <Field TextView mDomain>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #142 <Method String CaptionedImageCard.getDomain()>
	//   15   31:invokevirtual   #146 <Method void setOptionalTextView(TextView, String)>
		mCardAction = ((IAction) (getUriActionForCard(((Card) (card)))));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokestatic    #150 <Method com.appboy.ui.actions.UriAction getUriActionForCard(Card)>
	//   19   39:putfield        #116 <Field IAction mCardAction>
		boolean flag;
		if(card.getAspectRatio() != 0.0F)
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #154 <Method float CaptionedImageCard.getAspectRatio()>
	//*  22   46:fconst_0        
	//*  23   47:fcmpl           
	//*  24   48:ifeq            64
		{
			mAspectRatio = card.getAspectRatio();
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #154 <Method float CaptionedImageCard.getAspectRatio()>
	//   28   56:putfield        #41  <Field float mAspectRatio>
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
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (CaptionedImageCardView.this));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CaptionedImageCardView this$0>
			//    2    4:astore_1        
				((CaptionedImageCardView) (view)).handleCardClick(((CaptionedImageCardView) (view)).mContext, ((Card) (card)), mCardAction, CaptionedImageCardView.TAG);
			//    3    5:aload_1         
			//    4    6:aload_1         
			//    5    7:getfield        #31  <Field Context CaptionedImageCardView.mContext>
			//    6   10:aload_0         
			//    7   11:getfield        #21  <Field CaptionedImageCard val$card>
			//    8   14:aload_0         
			//    9   15:getfield        #19  <Field CaptionedImageCardView this$0>
			//   10   18:invokestatic    #35  <Method IAction CaptionedImageCardView.access$000(CaptionedImageCardView)>
			//   11   21:invokestatic    #39  <Method String CaptionedImageCardView.access$100()>
			//   12   24:invokevirtual   #43  <Method void CaptionedImageCardView.handleCardClick(Context, Card, IAction, String)>
			//   13   27:return          
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
;
	//   34   66:new             #7   <Class CaptionedImageCardView$1>
	//   35   69:dup             
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:invokespecial   #157 <Method void CaptionedImageCardView$1(CaptionedImageCardView, CaptionedImageCard)>
	//   39   75:astore_3        
		if(!(this instanceof View))
	//*  40   76:aload_0         
	//*  41   77:instanceof      #159 <Class View>
	//*  42   80:ifne            91
			setOnClickListener(onclicklistener);
	//   43   83:aload_0         
	//   44   84:aload_3         
	//   45   85:invokevirtual   #163 <Method void setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  46   88:goto            99
			ViewInstrumentation.setOnClickListener((View)this, onclicklistener);
	//   47   91:aload_0         
	//   48   92:checkcast       #159 <Class View>
	//   49   95:aload_3         
	//   50   96:invokestatic    #168 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		setImageViewToUrl(mImage, card.getImageUrl(), mAspectRatio, flag);
	//   51   99:aload_0         
	//   52  100:aload_0         
	//   53  101:getfield        #55  <Field ImageView mImage>
	//   54  104:aload_1         
	//   55  105:invokevirtual   #171 <Method String CaptionedImageCard.getImageUrl()>
	//   56  108:aload_0         
	//   57  109:getfield        #41  <Field float mAspectRatio>
	//   58  112:iload_2         
	//   59  113:invokevirtual   #175 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
	//   60  116:return          
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((CaptionedImageCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #129 <Class CaptionedImageCard>
	//    3    5:invokevirtual   #177 <Method void onSetCard(CaptionedImageCard)>
	//    4    8:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/CaptionedImageCardView);
	private float mAspectRatio;
	private IAction mCardAction;
	private final TextView mDescription;
	private final TextView mDomain;
	private ImageView mImage;
	private final TextView mTitle;

	static 
	{
	//    0    0:ldc1            #2   <Class CaptionedImageCardView>
	//    1    2:invokestatic    #28  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #30  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(CaptionedImageCardView captionedimagecardview)
	{
		return captionedimagecardview.mCardAction;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field IAction mCardAction>
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
