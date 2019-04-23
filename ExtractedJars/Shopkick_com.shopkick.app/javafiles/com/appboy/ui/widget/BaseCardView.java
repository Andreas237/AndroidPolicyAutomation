// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import com.appboy.*;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.enums.Channel;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.*;
import com.appboy.ui.feed.AppboyFeedManager;
import com.appboy.ui.feed.AppboyImageSwitcher;
import com.appboy.ui.feed.listeners.IFeedClickActionListener;
import com.appboy.ui.support.FrescoLibraryUtils;
import com.appboy.ui.support.ViewUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.*;

public abstract class BaseCardView extends RelativeLayout
	implements Observer
{

	public BaseCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void RelativeLayout(Context)>
		mCanUseFresco = FrescoLibraryUtils.canUseFresco(context);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #48  <Method boolean FrescoLibraryUtils.canUseFresco(Context)>
	//    6   10:putfield        #50  <Field boolean mCanUseFresco>
		mContext = context;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #52  <Field Context mContext>
		((LayoutInflater)context.getSystemService("layout_inflater")).inflate(getLayoutResource(), ((android.view.ViewGroup) (this)));
	//   10   18:aload_1         
	//   11   19:ldc1            #54  <String "layout_inflater">
	//   12   21:invokevirtual   #60  <Method Object Context.getSystemService(String)>
	//   13   24:checkcast       #62  <Class LayoutInflater>
	//   14   27:aload_0         
	//   15   28:invokevirtual   #66  <Method int getLayoutResource()>
	//   16   31:aload_0         
	//   17   32:invokevirtual   #70  <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   18   35:pop             
		mImageSwitcher = (AppboyImageSwitcher)findViewById(com.appboy.ui.R.id.com_appboy_newsfeed_item_read_indicator_image_switcher);
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:getstatic       #76  <Field int com.appboy.ui.R$id.com_appboy_newsfeed_item_read_indicator_image_switcher>
	//   22   41:invokevirtual   #80  <Method View findViewById(int)>
	//   23   44:checkcast       #82  <Class AppboyImageSwitcher>
	//   24   47:putfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
		AppboyImageSwitcher appboyimageswitcher = mImageSwitcher;
	//   25   50:aload_0         
	//   26   51:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//   27   54:astore_2        
		if(appboyimageswitcher != null)
	//*  28   55:aload_2         
	//*  29   56:ifnull          71
			appboyimageswitcher.setFactory(new android.widget.ViewSwitcher.ViewFactory() {

				public View makeView()
				{
					return ((View) (new ImageView(mContext.getApplicationContext())));
				//    0    0:new             #24  <Class ImageView>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #16  <Field BaseCardView this$0>
				//    4    8:getfield        #28  <Field Context BaseCardView.mContext>
				//    5   11:invokevirtual   #34  <Method Context Context.getApplicationContext()>
				//    6   14:invokespecial   #35  <Method void ImageView(Context)>
				//    7   17:areturn         
				}

				final BaseCardView this$0;

			
			{
				this$0 = BaseCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BaseCardView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   30   59:aload_2         
	//   31   60:new             #9   <Class BaseCardView$1>
	//   32   63:dup             
	//   33   64:aload_0         
	//   34   65:invokespecial   #87  <Method void BaseCardView$1(BaseCardView)>
	//   35   68:invokevirtual   #91  <Method void AppboyImageSwitcher.setFactory(android.widget.ViewSwitcher$ViewFactory)>
		if(unreadCardVisualIndicatorOn == null)
	//*  36   71:getstatic       #93  <Field Boolean unreadCardVisualIndicatorOn>
	//*  37   74:ifnonnull       94
			unreadCardVisualIndicatorOn = Boolean.valueOf((new AppboyConfigurationProvider(context)).getIsNewsfeedVisualIndicatorOn());
	//   38   77:new             #95  <Class AppboyConfigurationProvider>
	//   39   80:dup             
	//   40   81:aload_1         
	//   41   82:invokespecial   #96  <Method void AppboyConfigurationProvider(Context)>
	//   42   85:invokevirtual   #100 <Method boolean AppboyConfigurationProvider.getIsNewsfeedVisualIndicatorOn()>
	//   43   88:invokestatic    #106 <Method Boolean Boolean.valueOf(boolean)>
	//   44   91:putstatic       #93  <Field Boolean unreadCardVisualIndicatorOn>
		if(!unreadCardVisualIndicatorOn.booleanValue())
	//*  45   94:getstatic       #93  <Field Boolean unreadCardVisualIndicatorOn>
	//*  46   97:invokevirtual   #109 <Method boolean Boolean.booleanValue()>
	//*  47  100:ifne            118
		{
			context = ((Context) (mImageSwitcher));
	//   48  103:aload_0         
	//   49  104:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//   50  107:astore_1        
			if(context != null)
	//*  51  108:aload_1         
	//*  52  109:ifnull          118
				((AppboyImageSwitcher) (context)).setVisibility(8);
	//   53  112:aload_1         
	//   54  113:bipush          8
	//   55  115:invokevirtual   #113 <Method void AppboyImageSwitcher.setVisibility(int)>
		}
	//   56  118:return          
	}

	protected static UriAction getUriActionForCard(Card card)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #117 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void Bundle()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = card.getExtras().keySet().iterator(); iterator.hasNext(); bundle.putString(s, (String)card.getExtras().get(((Object) (s)))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #125 <Method Map Card.getExtras()>
	//*   6   12:invokeinterface #131 <Method Set Map.keySet()>
	//*   7   17:invokeinterface #137 <Method Iterator Set.iterator()>
	//*   8   22:astore_2        
	//*   9   23:aload_2         
	//*  10   24:invokeinterface #142 <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            63
			s = (String)iterator.next();
	//   12   32:aload_2         
	//   13   33:invokeinterface #146 <Method Object Iterator.next()>
	//   14   38:checkcast       #148 <Class String>
	//   15   41:astore_3        

	//   16   42:aload_1         
	//   17   43:aload_3         
	//   18   44:aload_0         
	//   19   45:invokevirtual   #125 <Method Map Card.getExtras()>
	//   20   48:aload_3         
	//   21   49:invokeinterface #152 <Method Object Map.get(Object)>
	//   22   54:checkcast       #148 <Class String>
	//   23   57:invokevirtual   #156 <Method void Bundle.putString(String, String)>
	//*  24   60:goto            23
		return ActionFactory.createUriActionFromUrlString(card.getUrl(), bundle, card.getOpenUriInWebView(), Channel.NEWS_FEED);
	//   25   63:aload_0         
	//   26   64:invokevirtual   #160 <Method String Card.getUrl()>
	//   27   67:aload_1         
	//   28   68:aload_0         
	//   29   69:invokevirtual   #163 <Method boolean Card.getOpenUriInWebView()>
	//   30   72:getstatic       #169 <Field Channel Channel.NEWS_FEED>
	//   31   75:invokestatic    #175 <Method UriAction ActionFactory.createUriActionFromUrlString(String, Bundle, boolean, Channel)>
	//   32   78:areturn         
	}

	protected static void handleCardClick(Context context, Card card, IAction iaction, String s)
	{
		handleCardClick(context, card, iaction, s, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokestatic    #180 <Method void handleCardClick(Context, Card, IAction, String, boolean)>
	//    6    8:return          
	}

	protected static void handleCardClick(Context context, Card card, IAction iaction, String s, boolean flag)
	{
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            10
			card.setIsRead(true);
	//    2    5:aload_1         
	//    3    6:iconst_1        
	//    4    7:invokevirtual   #184 <Method void Card.setIsRead(boolean)>
		if(iaction != null)
	//*   5   10:aload_2         
	//*   6   11:ifnull          143
		{
			if(card.logClick())
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #187 <Method boolean Card.logClick()>
	//*   9   18:ifeq            61
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   10   21:new             #189 <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #190 <Method void StringBuilder()>
	//   13   28:astore          5
				stringbuilder.append("Logged click for card ");
	//   14   30:aload           5
	//   15   32:ldc1            #192 <String "Logged click for card ">
	//   16   34:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
				stringbuilder.append(card.getId());
	//   18   38:aload           5
	//   19   40:aload_1         
	//   20   41:invokevirtual   #199 <Method String Card.getId()>
	//   21   44:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
				AppboyLogger.d(s, stringbuilder.toString());
	//   23   48:aload_3         
	//   24   49:aload           5
	//   25   51:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   26   54:invokestatic    #206 <Method int AppboyLogger.d(String, String)>
	//   27   57:pop             
			} else
	//*  28   58:goto            98
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   29   61:new             #189 <Class StringBuilder>
	//   30   64:dup             
	//   31   65:invokespecial   #190 <Method void StringBuilder()>
	//   32   68:astore          5
				stringbuilder1.append("Logging click failed for card ");
	//   33   70:aload           5
	//   34   72:ldc1            #208 <String "Logging click failed for card ">
	//   35   74:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   36   77:pop             
				stringbuilder1.append(card.getId());
	//   37   78:aload           5
	//   38   80:aload_1         
	//   39   81:invokevirtual   #199 <Method String Card.getId()>
	//   40   84:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   41   87:pop             
				AppboyLogger.d(s, stringbuilder1.toString());
	//   42   88:aload_3         
	//   43   89:aload           5
	//   44   91:invokevirtual   #202 <Method String StringBuilder.toString()>
	//   45   94:invokestatic    #206 <Method int AppboyLogger.d(String, String)>
	//   46   97:pop             
			}
			if(!AppboyFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, iaction))
	//*  47   98:invokestatic    #214 <Method AppboyFeedManager AppboyFeedManager.getInstance()>
	//*  48  101:invokevirtual   #218 <Method IFeedClickActionListener AppboyFeedManager.getFeedCardClickActionListener()>
	//*  49  104:aload_0         
	//*  50  105:aload_1         
	//*  51  106:aload_2         
	//*  52  107:invokeinterface #224 <Method boolean IFeedClickActionListener.onFeedCardClicked(Context, Card, IAction)>
	//*  53  112:ifne            143
			{
				if(iaction instanceof UriAction)
	//*  54  115:aload_2         
	//*  55  116:instanceof      #226 <Class UriAction>
	//*  56  119:ifeq            136
				{
					AppboyNavigator.getAppboyNavigator().gotoUri(context, (UriAction)iaction);
	//   57  122:invokestatic    #232 <Method IAppboyNavigator AppboyNavigator.getAppboyNavigator()>
	//   58  125:aload_0         
	//   59  126:aload_2         
	//   60  127:checkcast       #226 <Class UriAction>
	//   61  130:invokeinterface #238 <Method void IAppboyNavigator.gotoUri(Context, UriAction)>
					return;
	//   62  135:return          
				}
				iaction.execute(context);
	//   63  136:aload_2         
	//   64  137:aload_0         
	//   65  138:invokeinterface #243 <Method void IAction.execute(Context)>
			}
		}
	//   66  143:return          
	}

	private void setBackgroundNew(Drawable drawable)
	{
		setBackground(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #251 <Method void setBackground(Drawable)>
	//    3    5:return          
	}

	private void setCardViewedIndicator()
	{
		if(getCard() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #257 <Method Card getCard()>
	//*   2    4:ifnull          126
		{
			if(mImageSwitcher != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//*   5   11:ifnull          136
			{
				AppboyLogger.v(TAG, "Setting the read/unread indicator for the card.");
	//    6   14:getstatic       #37  <Field String TAG>
	//    7   17:ldc2            #259 <String "Setting the read/unread indicator for the card.">
	//    8   20:invokestatic    #262 <Method int AppboyLogger.v(String, String)>
	//    9   23:pop             
				if(getCard().isRead())
	//*  10   24:aload_0         
	//*  11   25:invokevirtual   #257 <Method Card getCard()>
	//*  12   28:invokevirtual   #265 <Method boolean Card.isRead()>
	//*  13   31:ifeq            81
				{
					if(mImageSwitcher.getReadIcon() != null)
	//*  14   34:aload_0         
	//*  15   35:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//*  16   38:invokevirtual   #269 <Method Drawable AppboyImageSwitcher.getReadIcon()>
	//*  17   41:ifnull          60
					{
						AppboyImageSwitcher appboyimageswitcher = mImageSwitcher;
	//   18   44:aload_0         
	//   19   45:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//   20   48:astore_1        
						appboyimageswitcher.setImageDrawable(appboyimageswitcher.getReadIcon());
	//   21   49:aload_1         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #269 <Method Drawable AppboyImageSwitcher.getReadIcon()>
	//   24   54:invokevirtual   #272 <Method void AppboyImageSwitcher.setImageDrawable(Drawable)>
					} else
	//*  25   57:goto            70
					{
						mImageSwitcher.setImageResource(com.appboy.ui.R.drawable.icon_read);
	//   26   60:aload_0         
	//   27   61:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//   28   64:getstatic       #277 <Field int com.appboy.ui.R$drawable.icon_read>
	//   29   67:invokevirtual   #280 <Method void AppboyImageSwitcher.setImageResource(int)>
					}
					mImageSwitcher.setTag("icon_read");
	//   30   70:aload_0         
	//   31   71:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//   32   74:ldc2            #281 <String "icon_read">
	//   33   77:invokevirtual   #285 <Method void AppboyImageSwitcher.setTag(Object)>
					return;
	//   34   80:return          
				}
				if(mImageSwitcher.getUnReadIcon() != null)
	//*  35   81:aload_0         
	//*  36   82:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//*  37   85:invokevirtual   #288 <Method Drawable AppboyImageSwitcher.getUnReadIcon()>
	//*  38   88:ifnull          105
				{
					AppboyImageSwitcher appboyimageswitcher1 = mImageSwitcher;
	//   39   91:aload_0         
	//   40   92:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//   41   95:astore_1        
					appboyimageswitcher1.setImageDrawable(appboyimageswitcher1.getUnReadIcon());
	//   42   96:aload_1         
	//   43   97:aload_1         
	//   44   98:invokevirtual   #288 <Method Drawable AppboyImageSwitcher.getUnReadIcon()>
	//   45  101:invokevirtual   #272 <Method void AppboyImageSwitcher.setImageDrawable(Drawable)>
					return;
	//   46  104:return          
				} else
				{
					mImageSwitcher.setImageResource(com.appboy.ui.R.drawable.icon_unread);
	//   47  105:aload_0         
	//   48  106:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//   49  109:getstatic       #291 <Field int com.appboy.ui.R$drawable.icon_unread>
	//   50  112:invokevirtual   #280 <Method void AppboyImageSwitcher.setImageResource(int)>
					mImageSwitcher.setTag("icon_unread");
	//   51  115:aload_0         
	//   52  116:getfield        #84  <Field AppboyImageSwitcher mImageSwitcher>
	//   53  119:ldc2            #292 <String "icon_unread">
	//   54  122:invokevirtual   #285 <Method void AppboyImageSwitcher.setTag(Object)>
					return;
	//   55  125:return          
				}
			}
		} else
		{
			AppboyLogger.d(TAG, "The card is null.");
	//   56  126:getstatic       #37  <Field String TAG>
	//   57  129:ldc2            #294 <String "The card is null.">
	//   58  132:invokestatic    #206 <Method int AppboyLogger.d(String, String)>
	//   59  135:pop             
		}
	//   60  136:return          
	}

	boolean canUseFresco()
	{
		return mCanUseFresco;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean mCanUseFresco>
	//    2    4:ireturn         
	}

	public Card getCard()
	{
		return mCard;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field Card mCard>
	//    2    4:areturn         
	}

	protected abstract int getLayoutResource();

	View getProperViewFromInflatedStub(int i)
	{
		((ViewStub)findViewById(i)).inflate();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #80  <Method View findViewById(int)>
	//    3    5:checkcast       #299 <Class ViewStub>
	//    4    8:invokevirtual   #302 <Method View ViewStub.inflate()>
	//    5   11:pop             
		if(mCanUseFresco)
	//*   6   12:aload_0         
	//*   7   13:getfield        #50  <Field boolean mCanUseFresco>
	//*   8   16:ifeq            27
			return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_feed_drawee_view);
	//    9   19:aload_0         
	//   10   20:getstatic       #305 <Field int com.appboy.ui.R$id.com_appboy_stubbed_feed_drawee_view>
	//   11   23:invokevirtual   #80  <Method View findViewById(int)>
	//   12   26:areturn         
		else
			return findViewById(com.appboy.ui.R.id.com_appboy_stubbed_feed_image_view);
	//   13   27:aload_0         
	//   14   28:getstatic       #308 <Field int com.appboy.ui.R$id.com_appboy_stubbed_feed_image_view>
	//   15   31:invokevirtual   #80  <Method View findViewById(int)>
	//   16   34:areturn         
	}

	protected abstract void onSetCard(Card card);

	void safeSetBackground(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT < 16)
	//*   0    0:getstatic       #316 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmpge          14
		{
			setBackgroundDrawable(drawable);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #319 <Method void setBackgroundDrawable(Drawable)>
			return;
	//    6   13:return          
		} else
		{
			setBackgroundNew(drawable);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokespecial   #321 <Method void setBackgroundNew(Drawable)>
			return;
	//   10   19:return          
		}
	}

	public void setCard(Card card)
	{
		mCard = card;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #296 <Field Card mCard>
		onSetCard(card);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #324 <Method void onSetCard(Card)>
		card.addObserver(((Observer) (this)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #328 <Method void Card.addObserver(Observer)>
		setCardViewedIndicator();
	//    9   15:aload_0         
	//   10   16:invokespecial   #330 <Method void setCardViewedIndicator()>
	//   11   19:return          
	}

	void setImageViewToUrl(ImageView imageview, String s)
	{
		setImageViewToUrl(imageview, s, 1.0F, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fconst_1        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #337 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
	//    6    8:return          
	}

	void setImageViewToUrl(ImageView imageview, String s, float f)
	{
		setImageViewToUrl(imageview, s, f, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #337 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
	//    6    8:return          
	}

	void setImageViewToUrl(final ImageView imageView, String s, final float aspectRatio, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(TAG, "The image url to render is null. Not setting the card image.");
	//    2    4:getstatic       #37  <Field String TAG>
	//    3    7:ldc2            #340 <String "The image url to render is null. Not setting the card image.">
	//    4   10:invokestatic    #343 <Method int AppboyLogger.w(String, String)>
	//    5   13:pop             
			return;
	//    6   14:return          
		}
		if(aspectRatio == 0.0F)
	//*   7   15:fload_3         
	//*   8   16:fconst_0        
	//*   9   17:fcmpl           
	//*  10   18:ifne            32
		{
			AppboyLogger.w(TAG, "The image aspect ratio is 0. Not setting the card image.");
	//   11   21:getstatic       #37  <Field String TAG>
	//   12   24:ldc2            #345 <String "The image aspect ratio is 0. Not setting the card image.">
	//   13   27:invokestatic    #343 <Method int AppboyLogger.w(String, String)>
	//   14   30:pop             
			return;
	//   15   31:return          
		}
		if(!s.equals(imageView.getTag(com.appboy.ui.R.string.com_appboy_image_resize_tag_key)))
	//*  16   32:aload_2         
	//*  17   33:aload_1         
	//*  18   34:getstatic       #350 <Field int com.appboy.ui.R$string.com_appboy_image_resize_tag_key>
	//*  19   37:invokevirtual   #356 <Method Object ImageView.getTag(int)>
	//*  20   40:invokevirtual   #360 <Method boolean String.equals(Object)>
	//*  21   43:ifne            120
		{
			if(aspectRatio != 1.0F)
	//*  22   46:fload_3         
	//*  23   47:fconst_1        
	//*  24   48:fcmpl           
	//*  25   49:ifeq            81
			{
				ViewTreeObserver viewtreeobserver = imageView.getViewTreeObserver();
	//   26   52:aload_1         
	//   27   53:invokevirtual   #364 <Method ViewTreeObserver ImageView.getViewTreeObserver()>
	//   28   56:astore          5
				if(viewtreeobserver.isAlive())
	//*  29   58:aload           5
	//*  30   60:invokevirtual   #369 <Method boolean ViewTreeObserver.isAlive()>
	//*  31   63:ifeq            81
					viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

						public void onGlobalLayout()
						{
							int i = imageView.getWidth();
						//    0    0:aload_0         
						//    1    1:getfield        #23  <Field ImageView val$imageView>
						//    2    4:invokevirtual   #36  <Method int ImageView.getWidth()>
						//    3    7:istore_1        
							imageView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(i, (int)((float)i / aspectRatio)))));
						//    4    8:aload_0         
						//    5    9:getfield        #23  <Field ImageView val$imageView>
						//    6   12:new             #38  <Class android.widget.RelativeLayout$LayoutParams>
						//    7   15:dup             
						//    8   16:iload_1         
						//    9   17:iload_1         
						//   10   18:i2f             
						//   11   19:aload_0         
						//   12   20:getfield        #25  <Field float val$aspectRatio>
						//   13   23:fdiv            
						//   14   24:f2i             
						//   15   25:invokespecial   #41  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
						//   16   28:invokevirtual   #45  <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
							ViewUtils.removeOnGlobalLayoutListenerSafe(imageView.getViewTreeObserver(), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
						//   17   31:aload_0         
						//   18   32:getfield        #23  <Field ImageView val$imageView>
						//   19   35:invokevirtual   #49  <Method ViewTreeObserver ImageView.getViewTreeObserver()>
						//   20   38:aload_0         
						//   21   39:invokestatic    #55  <Method void ViewUtils.removeOnGlobalLayoutListenerSafe(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
						//   22   42:return          
						}

						final BaseCardView this$0;
						final float val$aspectRatio;
						final ImageView val$imageView;

			
			{
				this$0 = BaseCardView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field BaseCardView this$0>
				imageView = imageview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ImageView val$imageView>
				aspectRatio = f;
			//    6   10:aload_0         
			//    7   11:fload_3         
			//    8   12:putfield        #25  <Field float val$aspectRatio>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//   32   66:aload           5
	//   33   68:new             #11  <Class BaseCardView$2>
	//   34   71:dup             
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:fload_3         
	//   38   75:invokespecial   #372 <Method void BaseCardView$2(BaseCardView, ImageView, float)>
	//   39   78:invokevirtual   #376 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			imageView.setImageResource(0x106000d);
	//   40   81:aload_1         
	//   41   82:ldc2            #377 <Int 0x106000d>
	//   42   85:invokevirtual   #378 <Method void ImageView.setImageResource(int)>
			Appboy.getInstance(getContext()).getAppboyImageLoader().renderUrlIntoView(getContext(), s, imageView, AppboyViewBounds.BASE_CARD_VIEW);
	//   43   88:aload_0         
	//   44   89:invokevirtual   #382 <Method Context getContext()>
	//   45   92:invokestatic    #387 <Method Appboy Appboy.getInstance(Context)>
	//   46   95:invokevirtual   #391 <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   47   98:aload_0         
	//   48   99:invokevirtual   #382 <Method Context getContext()>
	//   49  102:aload_2         
	//   50  103:aload_1         
	//   51  104:getstatic       #397 <Field AppboyViewBounds AppboyViewBounds.BASE_CARD_VIEW>
	//   52  107:invokeinterface #403 <Method void IAppboyImageLoader.renderUrlIntoView(Context, String, ImageView, AppboyViewBounds)>
			imageView.setTag(com.appboy.ui.R.string.com_appboy_image_resize_tag_key, ((Object) (s)));
	//   53  112:aload_1         
	//   54  113:getstatic       #350 <Field int com.appboy.ui.R$string.com_appboy_image_resize_tag_key>
	//   55  116:aload_2         
	//   56  117:invokevirtual   #406 <Method void ImageView.setTag(int, Object)>
		}
	//   57  120:return          
	}

	void setOptionalTextView(TextView textview, String s)
	{
		if(s != null && !s.trim().equals(""))
	//*   0    0:aload_2         
	//*   1    1:ifnull          28
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #411 <Method String String.trim()>
	//*   4    8:ldc2            #413 <String "">
	//*   5   11:invokevirtual   #360 <Method boolean String.equals(Object)>
	//*   6   14:ifne            28
		{
			textview.setText(((CharSequence) (s)));
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokevirtual   #419 <Method void TextView.setText(CharSequence)>
			textview.setVisibility(0);
	//   10   22:aload_1         
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #420 <Method void TextView.setVisibility(int)>
			return;
	//   13   27:return          
		} else
		{
			textview.setText("");
	//   14   28:aload_1         
	//   15   29:ldc2            #413 <String "">
	//   16   32:invokevirtual   #419 <Method void TextView.setText(CharSequence)>
			textview.setVisibility(8);
	//   17   35:aload_1         
	//   18   36:bipush          8
	//   19   38:invokevirtual   #420 <Method void TextView.setVisibility(int)>
			return;
	//   20   41:return          
		}
	}

	void setSimpleDraweeToUrl(SimpleDraweeView simpledraweeview, String s, float f, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(TAG, "The image url to render is null. Not setting the card image.");
	//    2    4:getstatic       #37  <Field String TAG>
	//    3    7:ldc2            #340 <String "The image url to render is null. Not setting the card image.">
	//    4   10:invokestatic    #343 <Method int AppboyLogger.w(String, String)>
	//    5   13:pop             
			return;
	//    6   14:return          
		} else
		{
			FrescoLibraryUtils.setDraweeControllerHelper(simpledraweeview, s, f, flag);
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:fload_3         
	//   10   18:iload           4
	//   11   20:invokestatic    #425 <Method void FrescoLibraryUtils.setDraweeControllerHelper(SimpleDraweeView, String, float, boolean)>
			return;
	//   12   23:return          
		}
	}

	public void update(Observable observable, Object obj)
	{
		setCardViewedIndicator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #330 <Method void setCardViewedIndicator()>
	//    2    4:return          
	}

	private static final float SQUARE_ASPECT_RATIO = 1F;
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/BaseCardView);
	private static Boolean unreadCardVisualIndicatorOn;
	private final boolean mCanUseFresco;
	protected Card mCard;
	protected final Context mContext;
	protected AppboyImageSwitcher mImageSwitcher;

	static 
	{
	//    0    0:ldc1            #2   <Class BaseCardView>
	//    1    2:invokestatic    #35  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #37  <Field String TAG>
	//*   3    8:return          
	}
}
