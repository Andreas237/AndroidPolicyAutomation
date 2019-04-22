// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.os.Bundle;
import com.appboy.Appboy;
import com.appboy.IAppboyNavigator;
import com.appboy.enums.Channel;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageHtml;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.*;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.*;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			IInAppMessageWebViewClientListener, IHtmlInAppMessageActionListener

public class AppboyInAppMessageWebViewClientListener
	implements IInAppMessageWebViewClientListener
{

	public AppboyInAppMessageWebViewClientListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private AppboyInAppMessageManager getInAppMessageManager()
	{
		return AppboyInAppMessageManager.getInstance();
	//    0    0:invokestatic    #32  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    1    3:areturn         
	}

	private void logHtmlInAppMessageClick(IInAppMessage iinappmessage, Bundle bundle)
	{
		if(bundle != null && bundle.containsKey("abButtonId"))
	//*   0    0:aload_2         
	//*   1    1:ifnull          30
	//*   2    4:aload_2         
	//*   3    5:ldc1            #36  <String "abButtonId">
	//*   4    7:invokevirtual   #42  <Method boolean Bundle.containsKey(String)>
	//*   5   10:ifeq            30
		{
			((IInAppMessageHtml)iinappmessage).logButtonClick(bundle.getString("abButtonId"));
	//    6   13:aload_1         
	//    7   14:checkcast       #44  <Class IInAppMessageHtml>
	//    8   17:aload_2         
	//    9   18:ldc1            #36  <String "abButtonId">
	//   10   20:invokevirtual   #48  <Method String Bundle.getString(String)>
	//   11   23:invokeinterface #51  <Method boolean IInAppMessageHtml.logButtonClick(String)>
	//   12   28:pop             
			return;
	//   13   29:return          
		} else
		{
			iinappmessage.logClick();
	//   14   30:aload_1         
	//   15   31:invokeinterface #57  <Method boolean IInAppMessage.logClick()>
	//   16   36:pop             
			return;
	//   17   37:return          
		}
	}

	static String parseCustomEventNameFromQueryBundle(Bundle bundle)
	{
		return bundle.getString("name");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "name">
	//    2    3:invokevirtual   #48  <Method String Bundle.getString(String)>
	//    3    6:areturn         
	}

	static AppboyProperties parsePropertiesFromQueryBundle(Bundle bundle)
	{
		AppboyProperties appboyproperties = new AppboyProperties();
	//    0    0:new             #63  <Class AppboyProperties>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void AppboyProperties()>
	//    3    7:astore_1        
		Iterator iterator = bundle.keySet().iterator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #68  <Method Set Bundle.keySet()>
	//    6   12:invokeinterface #74  <Method Iterator Set.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            73
			String s = (String)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #83  <Method Object Iterator.next()>
	//   13   33:checkcast       #85  <Class String>
	//   14   36:astore_3        
			if(!s.equals("name"))
	//*  15   37:aload_3         
	//*  16   38:ldc1            #10  <String "name">
	//*  17   40:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  18   43:ifne            18
			{
				String s1 = bundle.getString(s, ((String) (null)));
	//   19   46:aload_0         
	//   20   47:aload_3         
	//   21   48:aconst_null     
	//   22   49:invokevirtual   #92  <Method String Bundle.getString(String, String)>
	//   23   52:astore          4
				if(!StringUtils.isNullOrBlank(s1))
	//*  24   54:aload           4
	//*  25   56:invokestatic    #97  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  26   59:ifne            18
					appboyproperties.addProperty(s, s1);
	//   27   62:aload_1         
	//   28   63:aload_3         
	//   29   64:aload           4
	//   30   66:invokevirtual   #101 <Method AppboyProperties AppboyProperties.addProperty(String, String)>
	//   31   69:pop             
			}
		} while(true);
	//   32   70:goto            18
		return appboyproperties;
	//   33   73:aload_1         
	//   34   74:areturn         
	}

	static boolean parseUseWebViewFromQueryBundle(IInAppMessage iinappmessage, Bundle bundle)
	{
		boolean flag;
		boolean flag1;
		if(bundle.containsKey("abDeepLink"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #106 <String "abDeepLink">
	//*   2    3:invokevirtual   #42  <Method boolean Bundle.containsKey(String)>
	//*   3    6:ifeq            24
		{
			flag1 = Boolean.parseBoolean(bundle.getString("abDeepLink"));
	//    4    9:aload_1         
	//    5   10:ldc1            #106 <String "abDeepLink">
	//    6   12:invokevirtual   #48  <Method String Bundle.getString(String)>
	//    7   15:invokestatic    #111 <Method boolean Boolean.parseBoolean(String)>
	//    8   18:istore_3        
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		} else
	//*  11   21:goto            28
		{
			flag = false;
	//   12   24:iconst_0        
	//   13   25:istore_2        
			flag1 = false;
	//   14   26:iconst_0        
	//   15   27:istore_3        
		}
		boolean flag2;
		if(bundle.containsKey("abExternalOpen"))
	//*  16   28:aload_1         
	//*  17   29:ldc1            #113 <String "abExternalOpen">
	//*  18   31:invokevirtual   #42  <Method boolean Bundle.containsKey(String)>
	//*  19   34:ifeq            53
		{
			flag2 = Boolean.parseBoolean(bundle.getString("abExternalOpen"));
	//   20   37:aload_1         
	//   21   38:ldc1            #113 <String "abExternalOpen">
	//   22   40:invokevirtual   #48  <Method String Bundle.getString(String)>
	//   23   43:invokestatic    #111 <Method boolean Boolean.parseBoolean(String)>
	//   24   46:istore          4
			flag = true;
	//   25   48:iconst_1        
	//   26   49:istore_2        
		} else
	//*  27   50:goto            56
		{
			flag2 = false;
	//   28   53:iconst_0        
	//   29   54:istore          4
		}
		boolean flag3 = iinappmessage.getOpenUriInWebView();
	//   30   56:aload_0         
	//   31   57:invokeinterface #116 <Method boolean IInAppMessage.getOpenUriInWebView()>
	//   32   62:istore          5
		if(flag)
	//*  33   64:iload_2         
	//*  34   65:ifeq            82
		{
			if(!flag1 && !flag2)
	//*  35   68:iload_3         
	//*  36   69:ifne            79
	//*  37   72:iload           4
	//*  38   74:ifne            79
				return true;
	//   39   77:iconst_1        
	//   40   78:ireturn         
			flag3 = false;
	//   41   79:iconst_0        
	//   42   80:istore          5
		}
		return flag3;
	//   43   82:iload           5
	//   44   84:ireturn         
	}

	public void onCloseAction(IInAppMessage iinappmessage, String s, Bundle bundle)
	{
		AppboyLogger.d(TAG, "IInAppMessageWebViewClientListener.onCloseAction called.");
	//    0    0:getstatic       #21  <Field String TAG>
	//    1    3:ldc1            #121 <String "IInAppMessageWebViewClientListener.onCloseAction called.">
	//    2    5:invokestatic    #125 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		logHtmlInAppMessageClick(iinappmessage, bundle);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload_3         
	//    7   12:invokespecial   #127 <Method void logHtmlInAppMessageClick(IInAppMessage, Bundle)>
		getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
	//    8   15:aload_0         
	//    9   16:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #133 <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
		getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(iinappmessage, s, bundle);
	//   12   23:aload_0         
	//   13   24:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   14   27:invokevirtual   #137 <Method IHtmlInAppMessageActionListener AppboyInAppMessageManager.getHtmlInAppMessageActionListener()>
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:aload_3         
	//   18   33:invokeinterface #142 <Method void IHtmlInAppMessageActionListener.onCloseClicked(IInAppMessage, String, Bundle)>
	//   19   38:return          
	}

	public void onCustomEventAction(IInAppMessage iinappmessage, String s, Bundle bundle)
	{
		AppboyLogger.d(TAG, "IInAppMessageWebViewClientListener.onCustomEventAction called.");
	//    0    0:getstatic       #21  <Field String TAG>
	//    1    3:ldc1            #145 <String "IInAppMessageWebViewClientListener.onCustomEventAction called.">
	//    2    5:invokestatic    #125 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		if(getInAppMessageManager().getActivity() == null)
	//*   4    9:aload_0         
	//*   5   10:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*   6   13:invokevirtual   #149 <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//*   7   16:ifnonnull       29
		{
			AppboyLogger.w(TAG, "Can't perform custom event action because the activity is null.");
	//    8   19:getstatic       #21  <Field String TAG>
	//    9   22:ldc1            #151 <String "Can't perform custom event action because the activity is null.">
	//   10   24:invokestatic    #154 <Method int AppboyLogger.w(String, String)>
	//   11   27:pop             
			return;
	//   12   28:return          
		}
		if(!getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(iinappmessage, s, bundle))
	//*  13   29:aload_0         
	//*  14   30:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*  15   33:invokevirtual   #137 <Method IHtmlInAppMessageActionListener AppboyInAppMessageManager.getHtmlInAppMessageActionListener()>
	//*  16   36:aload_1         
	//*  17   37:aload_2         
	//*  18   38:aload_3         
	//*  19   39:invokeinterface #158 <Method boolean IHtmlInAppMessageActionListener.onCustomEventFired(IInAppMessage, String, Bundle)>
	//*  20   44:ifne            80
		{
			iinappmessage = ((IInAppMessage) (parseCustomEventNameFromQueryBundle(bundle)));
	//   21   47:aload_3         
	//   22   48:invokestatic    #160 <Method String parseCustomEventNameFromQueryBundle(Bundle)>
	//   23   51:astore_1        
			if(StringUtils.isNullOrBlank(((String) (iinappmessage))))
	//*  24   52:aload_1         
	//*  25   53:invokestatic    #97  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  26   56:ifeq            60
				return;
	//   27   59:return          
			s = ((String) (parsePropertiesFromQueryBundle(bundle)));
	//   28   60:aload_3         
	//   29   61:invokestatic    #162 <Method AppboyProperties parsePropertiesFromQueryBundle(Bundle)>
	//   30   64:astore_2        
			Appboy.getInstance(((android.content.Context) (getInAppMessageManager().getActivity()))).logCustomEvent(((String) (iinappmessage)), ((AppboyProperties) (s)));
	//   31   65:aload_0         
	//   32   66:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   33   69:invokevirtual   #149 <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//   34   72:invokestatic    #167 <Method Appboy Appboy.getInstance(android.content.Context)>
	//   35   75:aload_1         
	//   36   76:aload_2         
	//   37   77:invokevirtual   #171 <Method void Appboy.logCustomEvent(String, AppboyProperties)>
		}
	//   38   80:return          
	}

	public void onNewsfeedAction(IInAppMessage iinappmessage, String s, Bundle bundle)
	{
		AppboyLogger.d(TAG, "IInAppMessageWebViewClientListener.onNewsfeedAction called.");
	//    0    0:getstatic       #21  <Field String TAG>
	//    1    3:ldc1            #174 <String "IInAppMessageWebViewClientListener.onNewsfeedAction called.">
	//    2    5:invokestatic    #125 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		if(getInAppMessageManager().getActivity() == null)
	//*   4    9:aload_0         
	//*   5   10:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*   6   13:invokevirtual   #149 <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//*   7   16:ifnonnull       29
		{
			AppboyLogger.w(TAG, "Can't perform news feed action because the cached activity is null.");
	//    8   19:getstatic       #21  <Field String TAG>
	//    9   22:ldc1            #176 <String "Can't perform news feed action because the cached activity is null.">
	//   10   24:invokestatic    #154 <Method int AppboyLogger.w(String, String)>
	//   11   27:pop             
			return;
	//   12   28:return          
		}
		logHtmlInAppMessageClick(iinappmessage, bundle);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_3         
	//   16   32:invokespecial   #127 <Method void logHtmlInAppMessageClick(IInAppMessage, Bundle)>
		if(!getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(iinappmessage, s, bundle))
	//*  17   35:aload_0         
	//*  18   36:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*  19   39:invokevirtual   #137 <Method IHtmlInAppMessageActionListener AppboyInAppMessageManager.getHtmlInAppMessageActionListener()>
	//*  20   42:aload_1         
	//*  21   43:aload_2         
	//*  22   44:aload_3         
	//*  23   45:invokeinterface #179 <Method boolean IHtmlInAppMessageActionListener.onNewsfeedClicked(IInAppMessage, String, Bundle)>
	//*  24   50:ifne            104
		{
			iinappmessage.setAnimateOut(false);
	//   25   53:aload_1         
	//   26   54:iconst_0        
	//   27   55:invokeinterface #182 <Method void IInAppMessage.setAnimateOut(boolean)>
			getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
	//   28   60:aload_0         
	//   29   61:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   30   64:iconst_0        
	//   31   65:invokevirtual   #133 <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
			iinappmessage = ((IInAppMessage) (new NewsfeedAction(BundleUtils.mapToBundle(iinappmessage.getExtras()), Channel.INAPP_MESSAGE)));
	//   32   68:new             #184 <Class NewsfeedAction>
	//   33   71:dup             
	//   34   72:aload_1         
	//   35   73:invokeinterface #188 <Method java.util.Map IInAppMessage.getExtras()>
	//   36   78:invokestatic    #194 <Method Bundle BundleUtils.mapToBundle(java.util.Map)>
	//   37   81:getstatic       #200 <Field Channel Channel.INAPP_MESSAGE>
	//   38   84:invokespecial   #203 <Method void NewsfeedAction(Bundle, Channel)>
	//   39   87:astore_1        
			AppboyNavigator.getAppboyNavigator().gotoNewsFeed(((android.content.Context) (getInAppMessageManager().getActivity())), ((NewsfeedAction) (iinappmessage)));
	//   40   88:invokestatic    #209 <Method IAppboyNavigator AppboyNavigator.getAppboyNavigator()>
	//   41   91:aload_0         
	//   42   92:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   43   95:invokevirtual   #149 <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//   44   98:aload_1         
	//   45   99:invokeinterface #215 <Method void IAppboyNavigator.gotoNewsFeed(android.content.Context, NewsfeedAction)>
		}
	//   46  104:return          
	}

	public void onOtherUrlAction(IInAppMessage iinappmessage, String s, Bundle bundle)
	{
		AppboyLogger.d(TAG, "IInAppMessageWebViewClientListener.onOtherUrlAction called.");
	//    0    0:getstatic       #21  <Field String TAG>
	//    1    3:ldc1            #218 <String "IInAppMessageWebViewClientListener.onOtherUrlAction called.">
	//    2    5:invokestatic    #125 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		if(getInAppMessageManager().getActivity() == null)
	//*   4    9:aload_0         
	//*   5   10:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*   6   13:invokevirtual   #149 <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//*   7   16:ifnonnull       29
		{
			AppboyLogger.w(TAG, "Can't perform other url action because the cached activity is null.");
	//    8   19:getstatic       #21  <Field String TAG>
	//    9   22:ldc1            #220 <String "Can't perform other url action because the cached activity is null.">
	//   10   24:invokestatic    #154 <Method int AppboyLogger.w(String, String)>
	//   11   27:pop             
			return;
	//   12   28:return          
		}
		logHtmlInAppMessageClick(iinappmessage, bundle);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_3         
	//   16   32:invokespecial   #127 <Method void logHtmlInAppMessageClick(IInAppMessage, Bundle)>
		if(!getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(iinappmessage, s, bundle))
	//*  17   35:aload_0         
	//*  18   36:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*  19   39:invokevirtual   #137 <Method IHtmlInAppMessageActionListener AppboyInAppMessageManager.getHtmlInAppMessageActionListener()>
	//*  20   42:aload_1         
	//*  21   43:aload_2         
	//*  22   44:aload_3         
	//*  23   45:invokeinterface #222 <Method boolean IHtmlInAppMessageActionListener.onOtherUrlAction(IInAppMessage, String, Bundle)>
	//*  24   50:ifne            175
		{
			boolean flag = parseUseWebViewFromQueryBundle(iinappmessage, bundle);
	//   25   53:aload_1         
	//   26   54:aload_3         
	//   27   55:invokestatic    #224 <Method boolean parseUseWebViewFromQueryBundle(IInAppMessage, Bundle)>
	//   28   58:istore          4
			Bundle bundle1 = BundleUtils.mapToBundle(iinappmessage.getExtras());
	//   29   60:aload_1         
	//   30   61:invokeinterface #188 <Method java.util.Map IInAppMessage.getExtras()>
	//   31   66:invokestatic    #194 <Method Bundle BundleUtils.mapToBundle(java.util.Map)>
	//   32   69:astore          5
			bundle1.putAll(bundle);
	//   33   71:aload           5
	//   34   73:aload_3         
	//   35   74:invokevirtual   #228 <Method void Bundle.putAll(Bundle)>
			bundle = ((Bundle) (ActionFactory.createUriActionFromUrlString(s, bundle1, flag, Channel.INAPP_MESSAGE)));
	//   36   77:aload_2         
	//   37   78:aload           5
	//   38   80:iload           4
	//   39   82:getstatic       #200 <Field Channel Channel.INAPP_MESSAGE>
	//   40   85:invokestatic    #234 <Method UriAction ActionFactory.createUriActionFromUrlString(String, Bundle, boolean, Channel)>
	//   41   88:astore_3        
			s = ((String) (((UriAction) (bundle)).getUri()));
	//   42   89:aload_3         
	//   43   90:invokevirtual   #240 <Method android.net.Uri UriAction.getUri()>
	//   44   93:astore_2        
			if(s != null && AppboyFileUtils.isLocalUri(((android.net.Uri) (s))))
	//*  45   94:aload_2         
	//*  46   95:ifnull          140
	//*  47   98:aload_2         
	//*  48   99:invokestatic    #246 <Method boolean AppboyFileUtils.isLocalUri(android.net.Uri)>
	//*  49  102:ifeq            140
			{
				iinappmessage = ((IInAppMessage) (TAG));
	//   50  105:getstatic       #21  <Field String TAG>
	//   51  108:astore_1        
				bundle = ((Bundle) (new StringBuilder()));
	//   52  109:new             #248 <Class StringBuilder>
	//   53  112:dup             
	//   54  113:invokespecial   #249 <Method void StringBuilder()>
	//   55  116:astore_3        
				((StringBuilder) (bundle)).append("Not passing local URI to AppboyNavigator. Got local uri: ");
	//   56  117:aload_3         
	//   57  118:ldc1            #251 <String "Not passing local URI to AppboyNavigator. Got local uri: ">
	//   58  120:invokevirtual   #255 <Method StringBuilder StringBuilder.append(String)>
	//   59  123:pop             
				((StringBuilder) (bundle)).append(((Object) (s)));
	//   60  124:aload_3         
	//   61  125:aload_2         
	//   62  126:invokevirtual   #258 <Method StringBuilder StringBuilder.append(Object)>
	//   63  129:pop             
				AppboyLogger.w(((String) (iinappmessage)), ((StringBuilder) (bundle)).toString());
	//   64  130:aload_1         
	//   65  131:aload_3         
	//   66  132:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   67  135:invokestatic    #154 <Method int AppboyLogger.w(String, String)>
	//   68  138:pop             
				return;
	//   69  139:return          
			}
			iinappmessage.setAnimateOut(false);
	//   70  140:aload_1         
	//   71  141:iconst_0        
	//   72  142:invokeinterface #182 <Method void IInAppMessage.setAnimateOut(boolean)>
			getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
	//   73  147:aload_0         
	//   74  148:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   75  151:iconst_0        
	//   76  152:invokevirtual   #133 <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
			if(bundle != null)
	//*  77  155:aload_3         
	//*  78  156:ifnull          175
				AppboyNavigator.getAppboyNavigator().gotoUri(getInAppMessageManager().getApplicationContext(), ((UriAction) (bundle)));
	//   79  159:invokestatic    #209 <Method IAppboyNavigator AppboyNavigator.getAppboyNavigator()>
	//   80  162:aload_0         
	//   81  163:invokespecial   #129 <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   82  166:invokevirtual   #266 <Method android.content.Context AppboyInAppMessageManager.getApplicationContext()>
	//   83  169:aload_3         
	//   84  170:invokeinterface #270 <Method void IAppboyNavigator.gotoUri(android.content.Context, UriAction)>
		}
	//   85  175:return          
	}

	private static final String HTML_IAM_CUSTOM_EVENT_NAME_KEY = "name";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/listeners/AppboyInAppMessageWebViewClientListener);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageWebViewClientListener>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String TAG>
	//*   3    8:return          
	}
}
