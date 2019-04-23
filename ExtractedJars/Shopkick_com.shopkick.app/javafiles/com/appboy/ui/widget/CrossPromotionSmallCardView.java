// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.*;
import com.appboy.enums.Channel;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.CrossPromotionSmallCard;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.appboy.ui.actions.GooglePlayAppDetailsAction;
import com.appboy.ui.actions.IAction;
import com.facebook.drawee.view.SimpleDraweeView;
import java.text.NumberFormat;
import java.util.Locale;

// Referenced classes of package com.appboy.ui.widget:
//			BaseCardView, StarRatingView

public class CrossPromotionSmallCardView extends BaseCardView
{

	public CrossPromotionSmallCardView(Context context)
	{
		this(context, ((CrossPromotionSmallCard) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #42  <Method void CrossPromotionSmallCardView(Context, CrossPromotionSmallCard)>
	//    4    6:return          
	}

	public CrossPromotionSmallCardView(Context context, CrossPromotionSmallCard crosspromotionsmallcard)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void BaseCardView(Context)>
		mAspectRatio = 1.0F;
	//    3    5:aload_0         
	//    4    6:fconst_1        
	//    5    7:putfield        #46  <Field float mAspectRatio>
		mTitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_title);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getstatic       #52  <Field int com.appboy.ui.R$id.com_appboy_cross_promotion_small_card_title>
	//    9   15:invokevirtual   #56  <Method View findViewById(int)>
	//   10   18:checkcast       #58  <Class TextView>
	//   11   21:putfield        #60  <Field TextView mTitle>
		mSubtitle = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_subtitle);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getstatic       #63  <Field int com.appboy.ui.R$id.com_appboy_cross_promotion_small_card_subtitle>
	//   15   29:invokevirtual   #56  <Method View findViewById(int)>
	//   16   32:checkcast       #58  <Class TextView>
	//   17   35:putfield        #65  <Field TextView mSubtitle>
		mReviewCount = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_review_count);
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getstatic       #68  <Field int com.appboy.ui.R$id.com_appboy_cross_promotion_small_card_review_count>
	//   21   43:invokevirtual   #56  <Method View findViewById(int)>
	//   22   46:checkcast       #58  <Class TextView>
	//   23   49:putfield        #70  <Field TextView mReviewCount>
		mCaption = (TextView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_recommendation_tab);
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:getstatic       #73  <Field int com.appboy.ui.R$id.com_appboy_cross_promotion_small_card_recommendation_tab>
	//   27   57:invokevirtual   #56  <Method View findViewById(int)>
	//   28   60:checkcast       #58  <Class TextView>
	//   29   63:putfield        #75  <Field TextView mCaption>
		mStarRating = (StarRatingView)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_star_rating);
	//   30   66:aload_0         
	//   31   67:aload_0         
	//   32   68:getstatic       #78  <Field int com.appboy.ui.R$id.com_appboy_cross_promotion_small_card_star_rating>
	//   33   71:invokevirtual   #56  <Method View findViewById(int)>
	//   34   74:checkcast       #80  <Class StarRatingView>
	//   35   77:putfield        #82  <Field StarRatingView mStarRating>
		mPrice = (Button)findViewById(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_price);
	//   36   80:aload_0         
	//   37   81:aload_0         
	//   38   82:getstatic       #85  <Field int com.appboy.ui.R$id.com_appboy_cross_promotion_small_card_price>
	//   39   85:invokevirtual   #56  <Method View findViewById(int)>
	//   40   88:checkcast       #87  <Class Button>
	//   41   91:putfield        #89  <Field Button mPrice>
		if(canUseFresco())
	//*  42   94:aload_0         
	//*  43   95:invokevirtual   #93  <Method boolean canUseFresco()>
	//*  44   98:ifeq            118
		{
			mDrawee = (SimpleDraweeView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_drawee_stub);
	//   45  101:aload_0         
	//   46  102:aload_0         
	//   47  103:getstatic       #96  <Field int com.appboy.ui.R$id.com_appboy_cross_promotion_small_card_drawee_stub>
	//   48  106:invokevirtual   #99  <Method View getProperViewFromInflatedStub(int)>
	//   49  109:checkcast       #101 <Class SimpleDraweeView>
	//   50  112:putfield        #103 <Field SimpleDraweeView mDrawee>
		} else
	//*  51  115:goto            150
		{
			mImage = (ImageView)getProperViewFromInflatedStub(com.appboy.ui.R.id.com_appboy_cross_promotion_small_card_imageview_stub);
	//   52  118:aload_0         
	//   53  119:aload_0         
	//   54  120:getstatic       #106 <Field int com.appboy.ui.R$id.com_appboy_cross_promotion_small_card_imageview_stub>
	//   55  123:invokevirtual   #99  <Method View getProperViewFromInflatedStub(int)>
	//   56  126:checkcast       #108 <Class ImageView>
	//   57  129:putfield        #110 <Field ImageView mImage>
			mImage.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   58  132:aload_0         
	//   59  133:getfield        #110 <Field ImageView mImage>
	//   60  136:getstatic       #116 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   61  139:invokevirtual   #120 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			mImage.setAdjustViewBounds(true);
	//   62  142:aload_0         
	//   63  143:getfield        #110 <Field ImageView mImage>
	//   64  146:iconst_1        
	//   65  147:invokevirtual   #124 <Method void ImageView.setAdjustViewBounds(boolean)>
		}
		if(crosspromotionsmallcard != null)
	//*  66  150:aload_2         
	//*  67  151:ifnull          159
			setCard(((Card) (crosspromotionsmallcard)));
	//   68  154:aload_0         
	//   69  155:aload_2         
	//   70  156:invokevirtual   #128 <Method void setCard(Card)>
	//   71  159:return          
	}

	private String getPriceString(double d)
	{
		if(d == 0.0D)
	//*   0    0:dload_1         
	//*   1    1:dconst_0        
	//*   2    2:dcmpl           
	//*   3    3:ifne            17
			return mContext.getString(com.appboy.ui.R.string.com_appboy_recommendation_free);
	//    4    6:aload_0         
	//    5    7:getfield        #140 <Field Context mContext>
	//    6   10:getstatic       #145 <Field int com.appboy.ui.R$string.com_appboy_recommendation_free>
	//    7   13:invokevirtual   #151 <Method String Context.getString(int)>
	//    8   16:areturn         
		else
			return NumberFormat.getCurrencyInstance(Locale.US).format(d);
	//    9   17:getstatic       #157 <Field Locale Locale.US>
	//   10   20:invokestatic    #163 <Method NumberFormat NumberFormat.getCurrencyInstance(Locale)>
	//   11   23:dload_1         
	//   12   24:invokevirtual   #166 <Method String NumberFormat.format(double)>
	//   13   27:areturn         
	}

	protected int getLayoutResource()
	{
		return com.appboy.ui.R.layout.com_appboy_cross_promotion_small_card;
	//    0    0:getstatic       #173 <Field int com.appboy.ui.R$layout.com_appboy_cross_promotion_small_card>
	//    1    3:ireturn         
	}

	public volatile void onSetCard(Card card)
	{
		onSetCard((CrossPromotionSmallCard)card);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #179 <Class CrossPromotionSmallCard>
	//    3    5:invokevirtual   #182 <Method void onSetCard(CrossPromotionSmallCard)>
	//    4    8:return          
	}

	public void onSetCard(final CrossPromotionSmallCard card)
	{
		mTitle.setText(((CharSequence) (card.getTitle())));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field TextView mTitle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #186 <Method String CrossPromotionSmallCard.getTitle()>
	//    4    8:invokevirtual   #190 <Method void TextView.setText(CharSequence)>
		if(card.getSubtitle() != null && !card.getSubtitle().toUpperCase(Locale.getDefault()).equals("NULL"))
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #193 <Method String CrossPromotionSmallCard.getSubtitle()>
	//*   7   15:ifnull          59
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #193 <Method String CrossPromotionSmallCard.getSubtitle()>
	//*  10   22:invokestatic    #197 <Method Locale Locale.getDefault()>
	//*  11   25:invokevirtual   #203 <Method String String.toUpperCase(Locale)>
	//*  12   28:ldc1            #205 <String "NULL">
	//*  13   30:invokevirtual   #209 <Method boolean String.equals(Object)>
	//*  14   33:ifeq            39
	//*  15   36:goto            59
			mSubtitle.setText(((CharSequence) (card.getSubtitle().toUpperCase(Locale.getDefault()))));
	//   16   39:aload_0         
	//   17   40:getfield        #65  <Field TextView mSubtitle>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #193 <Method String CrossPromotionSmallCard.getSubtitle()>
	//   20   47:invokestatic    #197 <Method Locale Locale.getDefault()>
	//   21   50:invokevirtual   #203 <Method String String.toUpperCase(Locale)>
	//   22   53:invokevirtual   #190 <Method void TextView.setText(CharSequence)>
		else
	//*  23   56:goto            68
			mSubtitle.setVisibility(8);
	//   24   59:aload_0         
	//   25   60:getfield        #65  <Field TextView mSubtitle>
	//   26   63:bipush          8
	//   27   65:invokevirtual   #213 <Method void TextView.setVisibility(int)>
		mCaption.setText(((CharSequence) (card.getCaption().toUpperCase(Locale.getDefault()))));
	//   28   68:aload_0         
	//   29   69:getfield        #75  <Field TextView mCaption>
	//   30   72:aload_1         
	//   31   73:invokevirtual   #216 <Method String CrossPromotionSmallCard.getCaption()>
	//   32   76:invokestatic    #197 <Method Locale Locale.getDefault()>
	//   33   79:invokevirtual   #203 <Method String String.toUpperCase(Locale)>
	//   34   82:invokevirtual   #190 <Method void TextView.setText(CharSequence)>
		if(card.getRating() <= 0.0D)
	//*  35   85:aload_1         
	//*  36   86:invokevirtual   #220 <Method double CrossPromotionSmallCard.getRating()>
	//*  37   89:dconst_0        
	//*  38   90:dcmpg           
	//*  39   91:ifgt            115
		{
			mReviewCount.setVisibility(8);
	//   40   94:aload_0         
	//   41   95:getfield        #70  <Field TextView mReviewCount>
	//   42   98:bipush          8
	//   43  100:invokevirtual   #213 <Method void TextView.setVisibility(int)>
			mStarRating.setVisibility(8);
	//   44  103:aload_0         
	//   45  104:getfield        #82  <Field StarRatingView mStarRating>
	//   46  107:bipush          8
	//   47  109:invokevirtual   #221 <Method void StarRatingView.setVisibility(int)>
		} else
	//*  48  112:goto            179
		{
			TextView textview = mReviewCount;
	//   49  115:aload_0         
	//   50  116:getfield        #70  <Field TextView mReviewCount>
	//   51  119:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   52  120:new             #223 <Class StringBuilder>
	//   53  123:dup             
	//   54  124:invokespecial   #225 <Method void StringBuilder()>
	//   55  127:astore_3        
			stringbuilder.append("(");
	//   56  128:aload_3         
	//   57  129:ldc1            #227 <String "(">
	//   58  131:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   59  134:pop             
			stringbuilder.append(NumberFormat.getInstance().format(card.getReviewCount()));
	//   60  135:aload_3         
	//   61  136:invokestatic    #235 <Method NumberFormat NumberFormat.getInstance()>
	//   62  139:aload_1         
	//   63  140:invokevirtual   #238 <Method int CrossPromotionSmallCard.getReviewCount()>
	//   64  143:i2l             
	//   65  144:invokevirtual   #241 <Method String NumberFormat.format(long)>
	//   66  147:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   67  150:pop             
			stringbuilder.append(")");
	//   68  151:aload_3         
	//   69  152:ldc1            #243 <String ")">
	//   70  154:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   71  157:pop             
			textview.setText(((CharSequence) (stringbuilder.toString())));
	//   72  158:aload_2         
	//   73  159:aload_3         
	//   74  160:invokevirtual   #246 <Method String StringBuilder.toString()>
	//   75  163:invokevirtual   #190 <Method void TextView.setText(CharSequence)>
			mStarRating.setRating((float)card.getRating());
	//   76  166:aload_0         
	//   77  167:getfield        #82  <Field StarRatingView mStarRating>
	//   78  170:aload_1         
	//   79  171:invokevirtual   #220 <Method double CrossPromotionSmallCard.getRating()>
	//   80  174:d2f             
	//   81  175:invokevirtual   #250 <Method boolean StarRatingView.setRating(float)>
	//   82  178:pop             
		}
		if(!StringUtils.isNullOrBlank(card.getDisplayPrice()))
	//*  83  179:aload_1         
	//*  84  180:invokevirtual   #253 <Method String CrossPromotionSmallCard.getDisplayPrice()>
	//*  85  183:invokestatic    #259 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  86  186:ifne            203
			mPrice.setText(((CharSequence) (card.getDisplayPrice())));
	//   87  189:aload_0         
	//   88  190:getfield        #89  <Field Button mPrice>
	//   89  193:aload_1         
	//   90  194:invokevirtual   #253 <Method String CrossPromotionSmallCard.getDisplayPrice()>
	//   91  197:invokevirtual   #260 <Method void Button.setText(CharSequence)>
		else
	//*  92  200:goto            218
			mPrice.setText(((CharSequence) (getPriceString(card.getPrice()))));
	//   93  203:aload_0         
	//   94  204:getfield        #89  <Field Button mPrice>
	//   95  207:aload_0         
	//   96  208:aload_1         
	//   97  209:invokevirtual   #263 <Method double CrossPromotionSmallCard.getPrice()>
	//   98  212:invokespecial   #265 <Method String getPriceString(double)>
	//   99  215:invokevirtual   #260 <Method void Button.setText(CharSequence)>
		mPriceAction = ((IAction) (new GooglePlayAppDetailsAction(card.getPackage(), card.getOpenUriInWebView(), card.getAppStore(), card.getKindleId(), Channel.NEWS_FEED)));
	//  100  218:aload_0         
	//  101  219:new             #267 <Class GooglePlayAppDetailsAction>
	//  102  222:dup             
	//  103  223:aload_1         
	//  104  224:invokevirtual   #270 <Method String CrossPromotionSmallCard.getPackage()>
	//  105  227:aload_1         
	//  106  228:invokevirtual   #273 <Method boolean CrossPromotionSmallCard.getOpenUriInWebView()>
	//  107  231:aload_1         
	//  108  232:invokevirtual   #277 <Method com.appboy.enums.AppStore CrossPromotionSmallCard.getAppStore()>
	//  109  235:aload_1         
	//  110  236:invokevirtual   #280 <Method String CrossPromotionSmallCard.getKindleId()>
	//  111  239:getstatic       #286 <Field Channel Channel.NEWS_FEED>
	//  112  242:invokespecial   #289 <Method void GooglePlayAppDetailsAction(String, boolean, com.appboy.enums.AppStore, String, Channel)>
	//  113  245:putfield        #132 <Field IAction mPriceAction>
		mPrice.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				BaseCardView.handleCardClick(mContext, ((Card) (card)), mPriceAction, CrossPromotionSmallCardView.TAG);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CrossPromotionSmallCardView this$0>
			//    2    4:getfield        #31  <Field Context CrossPromotionSmallCardView.mContext>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field CrossPromotionSmallCard val$card>
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field CrossPromotionSmallCardView this$0>
			//    7   15:invokestatic    #35  <Method IAction CrossPromotionSmallCardView.access$000(CrossPromotionSmallCardView)>
			//    8   18:invokestatic    #39  <Method String CrossPromotionSmallCardView.access$100()>
			//    9   21:invokestatic    #45  <Method void BaseCardView.handleCardClick(Context, Card, IAction, String)>
			//   10   24:return          
			}

			final CrossPromotionSmallCardView this$0;
			final CrossPromotionSmallCard val$card;

			
			{
				this$0 = CrossPromotionSmallCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrossPromotionSmallCardView this$0>
				card = crosspromotionsmallcard;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CrossPromotionSmallCard val$card>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  114  248:aload_0         
	//  115  249:getfield        #89  <Field Button mPrice>
	//  116  252:new             #7   <Class CrossPromotionSmallCardView$1>
	//  117  255:dup             
	//  118  256:aload_0         
	//  119  257:aload_1         
	//  120  258:invokespecial   #292 <Method void CrossPromotionSmallCardView$1(CrossPromotionSmallCardView, CrossPromotionSmallCard)>
	//  121  261:invokevirtual   #296 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(canUseFresco())
	//* 122  264:aload_0         
	//* 123  265:invokevirtual   #93  <Method boolean canUseFresco()>
	//* 124  268:ifeq            286
		{
			setSimpleDraweeToUrl(mDrawee, card.getImageUrl(), 1.0F, true);
	//  125  271:aload_0         
	//  126  272:aload_0         
	//  127  273:getfield        #103 <Field SimpleDraweeView mDrawee>
	//  128  276:aload_1         
	//  129  277:invokevirtual   #299 <Method String CrossPromotionSmallCard.getImageUrl()>
	//  130  280:fconst_1        
	//  131  281:iconst_1        
	//  132  282:invokevirtual   #303 <Method void setSimpleDraweeToUrl(SimpleDraweeView, String, float, boolean)>
			return;
	//  133  285:return          
		} else
		{
			setImageViewToUrl(mImage, card.getImageUrl(), 1.0F);
	//  134  286:aload_0         
	//  135  287:aload_0         
	//  136  288:getfield        #110 <Field ImageView mImage>
	//  137  291:aload_1         
	//  138  292:invokevirtual   #299 <Method String CrossPromotionSmallCard.getImageUrl()>
	//  139  295:fconst_1        
	//  140  296:invokevirtual   #307 <Method void setImageViewToUrl(ImageView, String, float)>
			return;
	//  141  299:return          
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/CrossPromotionSmallCardView);
	private final float mAspectRatio;
	private final TextView mCaption;
	private SimpleDraweeView mDrawee;
	private ImageView mImage;
	private final Button mPrice;
	private IAction mPriceAction;
	private final TextView mReviewCount;
	private final StarRatingView mStarRating;
	private final TextView mSubtitle;
	private final TextView mTitle;

	static 
	{
	//    0    0:ldc1            #2   <Class CrossPromotionSmallCardView>
	//    1    2:invokestatic    #34  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #36  <Field String TAG>
	//*   3    8:return          
	}


/*
	static IAction access$000(CrossPromotionSmallCardView crosspromotionsmallcardview)
	{
		return crosspromotionsmallcardview.mPriceAction;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field IAction mPriceAction>
	//    2    4:areturn         
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #36  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
