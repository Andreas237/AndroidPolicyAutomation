// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.*;
import com.appboy.*;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.enums.Channel;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.*;
import com.appboy.ui.feed.AppboyImageSwitcher;
import java.util.*;

public abstract class BaseCardView extends RelativeLayout
{

	public BaseCardView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void RelativeLayout(Context)>
		mContext = context.getApplicationContext();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//    6   10:putfield        #53  <Field Context mContext>
		if(mAppboyConfigurationProvider == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #55  <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
	//*   9   17:ifnonnull       32
			mAppboyConfigurationProvider = new AppboyConfigurationProvider(context);
	//   10   20:aload_0         
	//   11   21:new             #57  <Class AppboyConfigurationProvider>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #58  <Method void AppboyConfigurationProvider(Context)>
	//   15   29:putfield        #55  <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
		if(sUnreadCardVisualIndicatorEnabled == null)
	//*  16   32:getstatic       #60  <Field Boolean sUnreadCardVisualIndicatorEnabled>
	//*  17   35:ifnonnull       51
			sUnreadCardVisualIndicatorEnabled = Boolean.valueOf(mAppboyConfigurationProvider.getIsNewsfeedVisualIndicatorOn());
	//   18   38:aload_0         
	//   19   39:getfield        #55  <Field AppboyConfigurationProvider mAppboyConfigurationProvider>
	//   20   42:invokevirtual   #64  <Method boolean AppboyConfigurationProvider.getIsNewsfeedVisualIndicatorOn()>
	//   21   45:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   22   48:putstatic       #60  <Field Boolean sUnreadCardVisualIndicatorEnabled>
	//   23   51:aload_0         
	//   24   52:aload_0         
	//   25   53:invokevirtual   #76  <Method Class Object.getClass()>
	//   26   56:invokestatic    #38  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//   27   59:putfield        #78  <Field String mClassLogTag>
	//   28   62:return          
	}

	protected static UriAction getUriActionForCard(Card card)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #82  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void Bundle()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = card.getExtras().keySet().iterator(); iterator.hasNext(); bundle.putString(s, (String)card.getExtras().get(((Object) (s)))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #90  <Method Map Card.getExtras()>
	//*   6   12:invokeinterface #96  <Method Set Map.keySet()>
	//*   7   17:invokeinterface #102 <Method Iterator Set.iterator()>
	//*   8   22:astore_2        
	//*   9   23:aload_2         
	//*  10   24:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            63
			s = (String)iterator.next();
	//   12   32:aload_2         
	//   13   33:invokeinterface #111 <Method Object Iterator.next()>
	//   14   38:checkcast       #113 <Class String>
	//   15   41:astore_3        

	//   16   42:aload_1         
	//   17   43:aload_3         
	//   18   44:aload_0         
	//   19   45:invokevirtual   #90  <Method Map Card.getExtras()>
	//   20   48:aload_3         
	//   21   49:invokeinterface #117 <Method Object Map.get(Object)>
	//   22   54:checkcast       #113 <Class String>
	//   23   57:invokevirtual   #121 <Method void Bundle.putString(String, String)>
	//*  24   60:goto            23
		return ActionFactory.createUriActionFromUrlString(card.getUrl(), bundle, card.getOpenUriInWebView(), Channel.NEWS_FEED);
	//   25   63:aload_0         
	//   26   64:invokevirtual   #125 <Method String Card.getUrl()>
	//   27   67:aload_1         
	//   28   68:aload_0         
	//   29   69:invokevirtual   #128 <Method boolean Card.getOpenUriInWebView()>
	//   30   72:getstatic       #134 <Field Channel Channel.NEWS_FEED>
	//   31   75:invokestatic    #140 <Method UriAction ActionFactory.createUriActionFromUrlString(String, Bundle, boolean, Channel)>
	//   32   78:areturn         
	}

	public String getClassLogTag()
	{
		return mClassLogTag;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String mClassLogTag>
	//    2    4:areturn         
	}

	protected void handleCardClick(Context context, Card card, IAction iaction, String s)
	{
		card.setIndicatorHighlighted(true);
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #147 <Method void Card.setIndicatorHighlighted(boolean)>
		if(iaction != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          215
		{
			if(card.logClick())
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #150 <Method boolean Card.logClick()>
	//*   7   13:ifeq            57
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #152 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #153 <Method void StringBuilder()>
	//   11   23:astore          5
				stringbuilder.append("Logged click for card: ");
	//   12   25:aload           5
	//   13   27:ldc1            #155 <String "Logged click for card: ">
	//   14   29:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
				stringbuilder.append(card.getId());
	//   16   33:aload           5
	//   17   35:aload_2         
	//   18   36:invokevirtual   #162 <Method String Card.getId()>
	//   19   39:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
				AppboyLogger.d(s, stringbuilder.toString());
	//   21   43:aload           4
	//   22   45:aload           5
	//   23   47:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   24   50:invokestatic    #169 <Method int AppboyLogger.d(String, String)>
	//   25   53:pop             
			} else
	//*  26   54:goto            95
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   27   57:new             #152 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:invokespecial   #153 <Method void StringBuilder()>
	//   30   64:astore          5
				stringbuilder1.append("Logging click failed for card: ");
	//   31   66:aload           5
	//   32   68:ldc1            #171 <String "Logging click failed for card: ">
	//   33   70:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   34   73:pop             
				stringbuilder1.append(card.getId());
	//   35   74:aload           5
	//   36   76:aload_2         
	//   37   77:invokevirtual   #162 <Method String Card.getId()>
	//   38   80:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
				AppboyLogger.d(s, stringbuilder1.toString());
	//   40   84:aload           4
	//   41   86:aload           5
	//   42   88:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   43   91:invokestatic    #169 <Method int AppboyLogger.d(String, String)>
	//   44   94:pop             
			}
			if(!isClickHandled(context, card, iaction))
	//*  45   95:aload_0         
	//*  46   96:aload_1         
	//*  47   97:aload_2         
	//*  48   98:aload_3         
	//*  49   99:invokevirtual   #175 <Method boolean isClickHandled(Context, Card, IAction)>
	//*  50  102:ifne            177
			{
				if(iaction instanceof UriAction)
	//*  51  105:aload_3         
	//*  52  106:instanceof      #177 <Class UriAction>
	//*  53  109:ifeq            126
				{
					AppboyNavigator.getAppboyNavigator().gotoUri(context, (UriAction)iaction);
	//   54  112:invokestatic    #183 <Method IAppboyNavigator AppboyNavigator.getAppboyNavigator()>
	//   55  115:aload_1         
	//   56  116:aload_3         
	//   57  117:checkcast       #177 <Class UriAction>
	//   58  120:invokeinterface #189 <Method void IAppboyNavigator.gotoUri(Context, UriAction)>
					return;
	//   59  125:return          
				} else
				{
					s = TAG;
	//   60  126:getstatic       #40  <Field String TAG>
	//   61  129:astore          4
					StringBuilder stringbuilder2 = new StringBuilder();
	//   62  131:new             #152 <Class StringBuilder>
	//   63  134:dup             
	//   64  135:invokespecial   #153 <Method void StringBuilder()>
	//   65  138:astore          5
					stringbuilder2.append("Executing non uri action for click on card: ");
	//   66  140:aload           5
	//   67  142:ldc1            #191 <String "Executing non uri action for click on card: ">
	//   68  144:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   69  147:pop             
					stringbuilder2.append(card.getId());
	//   70  148:aload           5
	//   71  150:aload_2         
	//   72  151:invokevirtual   #162 <Method String Card.getId()>
	//   73  154:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   74  157:pop             
					AppboyLogger.d(s, stringbuilder2.toString());
	//   75  158:aload           4
	//   76  160:aload           5
	//   77  162:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   78  165:invokestatic    #169 <Method int AppboyLogger.d(String, String)>
	//   79  168:pop             
					iaction.execute(context);
	//   80  169:aload_3         
	//   81  170:aload_1         
	//   82  171:invokeinterface #196 <Method void IAction.execute(Context)>
					return;
	//   83  176:return          
				}
			} else
			{
				context = ((Context) (TAG));
	//   84  177:getstatic       #40  <Field String TAG>
	//   85  180:astore_1        
				iaction = ((IAction) (new StringBuilder()));
	//   86  181:new             #152 <Class StringBuilder>
	//   87  184:dup             
	//   88  185:invokespecial   #153 <Method void StringBuilder()>
	//   89  188:astore_3        
				((StringBuilder) (iaction)).append("Card click was handled by custom listener for card: ");
	//   90  189:aload_3         
	//   91  190:ldc1            #198 <String "Card click was handled by custom listener for card: ">
	//   92  192:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   93  195:pop             
				((StringBuilder) (iaction)).append(card.getId());
	//   94  196:aload_3         
	//   95  197:aload_2         
	//   96  198:invokevirtual   #162 <Method String Card.getId()>
	//   97  201:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   98  204:pop             
				AppboyLogger.d(((String) (context)), ((StringBuilder) (iaction)).toString());
	//   99  205:aload_1         
	//  100  206:aload_3         
	//  101  207:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  102  210:invokestatic    #169 <Method int AppboyLogger.d(String, String)>
	//  103  213:pop             
				return;
	//  104  214:return          
			}
		} else
		{
			context = ((Context) (TAG));
	//  105  215:getstatic       #40  <Field String TAG>
	//  106  218:astore_1        
			iaction = ((IAction) (new StringBuilder()));
	//  107  219:new             #152 <Class StringBuilder>
	//  108  222:dup             
	//  109  223:invokespecial   #153 <Method void StringBuilder()>
	//  110  226:astore_3        
			((StringBuilder) (iaction)).append("Card action is null. Not performing any click action for card: ");
	//  111  227:aload_3         
	//  112  228:ldc1            #200 <String "Card action is null. Not performing any click action for card: ">
	//  113  230:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  114  233:pop             
			((StringBuilder) (iaction)).append(card.getId());
	//  115  234:aload_3         
	//  116  235:aload_2         
	//  117  236:invokevirtual   #162 <Method String Card.getId()>
	//  118  239:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  119  242:pop             
			AppboyLogger.v(((String) (context)), ((StringBuilder) (iaction)).toString());
	//  120  243:aload_1         
	//  121  244:aload_3         
	//  122  245:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  123  248:invokestatic    #203 <Method int AppboyLogger.v(String, String)>
	//  124  251:pop             
			return;
	//  125  252:return          
		}
	}

	protected abstract boolean isClickHandled(Context context, Card card, IAction iaction);

	public boolean isUnreadIndicatorEnabled()
	{
		return sUnreadCardVisualIndicatorEnabled.booleanValue();
	//    0    0:getstatic       #60  <Field Boolean sUnreadCardVisualIndicatorEnabled>
	//    1    3:invokevirtual   #207 <Method boolean Boolean.booleanValue()>
	//    2    6:ireturn         
	}

	public void setCardViewedIndicator(AppboyImageSwitcher appboyimageswitcher, Card card)
	{
		if(card == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.d(getClassLogTag(), "The card is null. Not setting read/unread indicator.");
	//    2    4:aload_0         
	//    3    5:invokevirtual   #211 <Method String getClassLogTag()>
	//    4    8:ldc1            #213 <String "The card is null. Not setting read/unread indicator.">
	//    5   10:invokestatic    #169 <Method int AppboyLogger.d(String, String)>
	//    6   13:pop             
			return;
	//    7   14:return          
		}
		if(appboyimageswitcher == null)
	//*   8   15:aload_1         
	//*   9   16:ifnonnull       20
			return;
	//   10   19:return          
		String s = (String)appboyimageswitcher.getTag(com.appboy.ui.R.string.com_appboy_image_is_read_tag_key);
	//   11   20:aload_1         
	//   12   21:getstatic       #219 <Field int com.appboy.ui.R$string.com_appboy_image_is_read_tag_key>
	//   13   24:invokevirtual   #225 <Method Object AppboyImageSwitcher.getTag(int)>
	//   14   27:checkcast       #113 <Class String>
	//   15   30:astore_3        
		if(s == null)
	//*  16   31:aload_3         
	//*  17   32:ifnull          38
	//*  18   35:goto            41
			s = "";
	//   19   38:ldc1            #227 <String "">
	//   20   40:astore_3        
		if(card.isIndicatorHighlighted())
	//*  21   41:aload_2         
	//*  22   42:invokevirtual   #230 <Method boolean Card.isIndicatorHighlighted()>
	//*  23   45:ifeq            92
		{
			if(!s.equals("icon_read"))
	//*  24   48:aload_3         
	//*  25   49:ldc1            #11  <String "icon_read">
	//*  26   51:invokevirtual   #234 <Method boolean String.equals(Object)>
	//*  27   54:ifne            135
			{
				if(appboyimageswitcher.getReadIcon() != null)
	//*  28   57:aload_1         
	//*  29   58:invokevirtual   #238 <Method android.graphics.drawable.Drawable AppboyImageSwitcher.getReadIcon()>
	//*  30   61:ifnull          75
					appboyimageswitcher.setImageDrawable(appboyimageswitcher.getReadIcon());
	//   31   64:aload_1         
	//   32   65:aload_1         
	//   33   66:invokevirtual   #238 <Method android.graphics.drawable.Drawable AppboyImageSwitcher.getReadIcon()>
	//   34   69:invokevirtual   #242 <Method void AppboyImageSwitcher.setImageDrawable(android.graphics.drawable.Drawable)>
				else
	//*  35   72:goto            82
					appboyimageswitcher.setImageResource(com.appboy.ui.R.drawable.icon_read);
	//   36   75:aload_1         
	//   37   76:getstatic       #246 <Field int com.appboy.ui.R$drawable.icon_read>
	//   38   79:invokevirtual   #250 <Method void AppboyImageSwitcher.setImageResource(int)>
				appboyimageswitcher.setTag(com.appboy.ui.R.string.com_appboy_image_is_read_tag_key, "icon_read");
	//   39   82:aload_1         
	//   40   83:getstatic       #219 <Field int com.appboy.ui.R$string.com_appboy_image_is_read_tag_key>
	//   41   86:ldc1            #11  <String "icon_read">
	//   42   88:invokevirtual   #254 <Method void AppboyImageSwitcher.setTag(int, Object)>
				return;
	//   43   91:return          
			}
		} else
		if(!s.equals("icon_unread"))
	//*  44   92:aload_3         
	//*  45   93:ldc1            #14  <String "icon_unread">
	//*  46   95:invokevirtual   #234 <Method boolean String.equals(Object)>
	//*  47   98:ifne            135
		{
			if(appboyimageswitcher.getUnReadIcon() != null)
	//*  48  101:aload_1         
	//*  49  102:invokevirtual   #257 <Method android.graphics.drawable.Drawable AppboyImageSwitcher.getUnReadIcon()>
	//*  50  105:ifnull          119
				appboyimageswitcher.setImageDrawable(appboyimageswitcher.getUnReadIcon());
	//   51  108:aload_1         
	//   52  109:aload_1         
	//   53  110:invokevirtual   #257 <Method android.graphics.drawable.Drawable AppboyImageSwitcher.getUnReadIcon()>
	//   54  113:invokevirtual   #242 <Method void AppboyImageSwitcher.setImageDrawable(android.graphics.drawable.Drawable)>
			else
	//*  55  116:goto            126
				appboyimageswitcher.setImageResource(com.appboy.ui.R.drawable.icon_unread);
	//   56  119:aload_1         
	//   57  120:getstatic       #259 <Field int com.appboy.ui.R$drawable.icon_unread>
	//   58  123:invokevirtual   #250 <Method void AppboyImageSwitcher.setImageResource(int)>
			appboyimageswitcher.setTag(com.appboy.ui.R.string.com_appboy_image_is_read_tag_key, "icon_unread");
	//   59  126:aload_1         
	//   60  127:getstatic       #219 <Field int com.appboy.ui.R$string.com_appboy_image_is_read_tag_key>
	//   61  130:ldc1            #14  <String "icon_unread">
	//   62  132:invokevirtual   #254 <Method void AppboyImageSwitcher.setTag(int, Object)>
		}
	//   63  135:return          
	}

	public void setImageViewToUrl(ImageView imageview, String s)
	{
		setImageViewToUrl(imageview, s, 1.0F, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fconst_1        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #264 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
	//    6    8:return          
	}

	public void setImageViewToUrl(ImageView imageview, String s, float f)
	{
		setImageViewToUrl(imageview, s, f, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:fload_3         
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #264 <Method void setImageViewToUrl(ImageView, String, float, boolean)>
	//    6    8:return          
	}

	public void setImageViewToUrl(final ImageView imageView, String s, final float aspectRatio, boolean flag)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			AppboyLogger.w(TAG, "The image url to render is null. Not setting the card image.");
	//    2    4:getstatic       #40  <Field String TAG>
	//    3    7:ldc2            #267 <String "The image url to render is null. Not setting the card image.">
	//    4   10:invokestatic    #270 <Method int AppboyLogger.w(String, String)>
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
	//   11   21:getstatic       #40  <Field String TAG>
	//   12   24:ldc2            #272 <String "The image aspect ratio is 0. Not setting the card image.">
	//   13   27:invokestatic    #270 <Method int AppboyLogger.w(String, String)>
	//   14   30:pop             
			return;
	//   15   31:return          
		}
		if(!s.equals(imageView.getTag(com.appboy.ui.R.string.com_appboy_image_resize_tag_key)))
	//*  16   32:aload_2         
	//*  17   33:aload_1         
	//*  18   34:getstatic       #275 <Field int com.appboy.ui.R$string.com_appboy_image_resize_tag_key>
	//*  19   37:invokevirtual   #278 <Method Object ImageView.getTag(int)>
	//*  20   40:invokevirtual   #234 <Method boolean String.equals(Object)>
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
	//   27   53:invokevirtual   #282 <Method ViewTreeObserver ImageView.getViewTreeObserver()>
	//   28   56:astore          5
				if(viewtreeobserver.isAlive())
	//*  29   58:aload           5
	//*  30   60:invokevirtual   #287 <Method boolean ViewTreeObserver.isAlive()>
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
							imageView.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
						//   17   31:aload_0         
						//   18   32:getfield        #23  <Field ImageView val$imageView>
						//   19   35:invokevirtual   #49  <Method ViewTreeObserver ImageView.getViewTreeObserver()>
						//   20   38:aload_0         
						//   21   39:invokevirtual   #55  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
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
	//   33   68:new             #7   <Class BaseCardView$1>
	//   34   71:dup             
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:fload_3         
	//   38   75:invokespecial   #290 <Method void BaseCardView$1(BaseCardView, ImageView, float)>
	//   39   78:invokevirtual   #294 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			imageView.setImageResource(0x106000d);
	//   40   81:aload_1         
	//   41   82:ldc2            #295 <Int 0x106000d>
	//   42   85:invokevirtual   #296 <Method void ImageView.setImageResource(int)>
			Appboy.getInstance(getContext()).getAppboyImageLoader().renderUrlIntoView(getContext(), s, imageView, AppboyViewBounds.BASE_CARD_VIEW);
	//   43   88:aload_0         
	//   44   89:invokevirtual   #299 <Method Context getContext()>
	//   45   92:invokestatic    #305 <Method Appboy Appboy.getInstance(Context)>
	//   46   95:invokevirtual   #309 <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//   47   98:aload_0         
	//   48   99:invokevirtual   #299 <Method Context getContext()>
	//   49  102:aload_2         
	//   50  103:aload_1         
	//   51  104:getstatic       #315 <Field AppboyViewBounds AppboyViewBounds.BASE_CARD_VIEW>
	//   52  107:invokeinterface #321 <Method void IAppboyImageLoader.renderUrlIntoView(Context, String, ImageView, AppboyViewBounds)>
			imageView.setTag(com.appboy.ui.R.string.com_appboy_image_resize_tag_key, ((Object) (s)));
	//   53  112:aload_1         
	//   54  113:getstatic       #275 <Field int com.appboy.ui.R$string.com_appboy_image_resize_tag_key>
	//   55  116:aload_2         
	//   56  117:invokevirtual   #322 <Method void ImageView.setTag(int, Object)>
		}
	//   57  120:return          
	}

	public void setOptionalTextView(TextView textview, String s)
	{
		if(s != null && !s.trim().equals(""))
	//*   0    0:aload_2         
	//*   1    1:ifnull          27
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #327 <Method String String.trim()>
	//*   4    8:ldc1            #227 <String "">
	//*   5   10:invokevirtual   #234 <Method boolean String.equals(Object)>
	//*   6   13:ifne            27
		{
			textview.setText(((CharSequence) (s)));
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokevirtual   #333 <Method void TextView.setText(CharSequence)>
			textview.setVisibility(0);
	//   10   21:aload_1         
	//   11   22:iconst_0        
	//   12   23:invokevirtual   #336 <Method void TextView.setVisibility(int)>
			return;
	//   13   26:return          
		} else
		{
			textview.setText("");
	//   14   27:aload_1         
	//   15   28:ldc1            #227 <String "">
	//   16   30:invokevirtual   #333 <Method void TextView.setText(CharSequence)>
			textview.setVisibility(8);
	//   17   33:aload_1         
	//   18   34:bipush          8
	//   19   36:invokevirtual   #336 <Method void TextView.setVisibility(int)>
			return;
	//   20   39:return          
		}
	}

	private static final String ICON_READ_TAG = "icon_read";
	private static final String ICON_UNREAD_TAG = "icon_unread";
	private static final float SQUARE_ASPECT_RATIO = 1F;
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/BaseCardView);
	private static Boolean sUnreadCardVisualIndicatorEnabled;
	protected AppboyConfigurationProvider mAppboyConfigurationProvider;
	protected Card mCard;
	private final String mClassLogTag = AppboyLogger.getAppboyLogTag(((Object)this).getClass());
	protected final Context mContext;
	protected AppboyImageSwitcher mImageSwitcher;

	static 
	{
	//    0    0:ldc1            #2   <Class BaseCardView>
	//    1    2:invokestatic    #38  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #40  <Field String TAG>
	//*   3    8:return          
	}
}
