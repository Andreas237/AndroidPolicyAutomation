// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.net.Uri;
import android.view.View;
import com.appboy.IAppboyNavigator;
import com.appboy.enums.Channel;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.models.*;
import com.appboy.support.*;
import com.appboy.ui.AppboyNavigator;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.NewsfeedAction;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.ui.inappmessage.InAppMessageCloser;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			IInAppMessageViewLifecycleListener, IInAppMessageManagerListener

public class AppboyInAppMessageViewLifecycleListener
	implements IInAppMessageViewLifecycleListener
{

	public AppboyInAppMessageViewLifecycleListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	private AppboyInAppMessageManager getInAppMessageManager()
	{
		return AppboyInAppMessageManager.getInstance();
	//    0    0:invokestatic    #33  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    1    3:areturn         
	}

	private void performClickAction(ClickAction clickaction, IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser, Uri uri, boolean flag)
	{
		if(getInAppMessageManager().getActivity() == null)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #37  <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*   2    4:invokevirtual   #41  <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//*   3    7:ifnonnull       20
		{
			AppboyLogger.w(TAG, "Can't perform click action because the cached activity is null.");
	//    4   10:getstatic       #22  <Field String TAG>
	//    5   13:ldc1            #43  <String "Can't perform click action because the cached activity is null.">
	//    6   15:invokestatic    #47  <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
			return;
	//    8   19:return          
		}
		static class _cls2
		{

			static final int $SwitchMap$com$appboy$enums$inappmessage$ClickAction[];

			static 
			{
				$SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[ClickAction.values().length];
			//    0    0:invokestatic    #18  <Method ClickAction[] ClickAction.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
				try
				{
					$SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NEWS_FEED.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
			//    5   12:getstatic       #24  <Field ClickAction ClickAction.NEWS_FEED>
			//    6   15:invokevirtual   #28  <Method int ClickAction.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
			//*  10   23:getstatic       #31  <Field ClickAction ClickAction.URI>
			//*  11   26:invokevirtual   #28  <Method int ClickAction.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$inappmessage$ClickAction>
			//*  15   34:getstatic       #34  <Field ClickAction ClickAction.NONE>
			//*  16   37:invokevirtual   #28  <Method int ClickAction.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.URI.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$appboy$enums$inappmessage$ClickAction[ClickAction.NONE.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls2..SwitchMap.com.appboy.enums.inappmessage.ClickAction[clickaction.ordinal()])
	//*   9   20:getstatic       #51  <Field int[] AppboyInAppMessageViewLifecycleListener$2.$SwitchMap$com$appboy$enums$inappmessage$ClickAction>
	//*  10   23:aload_1         
	//*  11   24:invokevirtual   #57  <Method int ClickAction.ordinal()>
	//*  12   27:iaload          
		{
	//*  13   28:tableswitch     1 3: default 56
	//	               1 115
	//	               2 73
	//	               3 62
		default:
			inappmessagecloser.close(false);
	//   14   56:aload_3         
	//   15   57:iconst_0        
	//   16   58:invokevirtual   #63  <Method void InAppMessageCloser.close(boolean)>
			return;
	//   17   61:return          

		case 3: // '\003'
			inappmessagecloser.close(iinappmessage.getAnimateOut());
	//   18   62:aload_3         
	//   19   63:aload_2         
	//   20   64:invokeinterface #69  <Method boolean IInAppMessage.getAnimateOut()>
	//   21   69:invokevirtual   #63  <Method void InAppMessageCloser.close(boolean)>
			return;
	//   22   72:return          

		case 2: // '\002'
			inappmessagecloser.close(false);
	//   23   73:aload_3         
	//   24   74:iconst_0        
	//   25   75:invokevirtual   #63  <Method void InAppMessageCloser.close(boolean)>
			clickaction = ((ClickAction) (ActionFactory.createUriActionFromUri(uri, BundleUtils.mapToBundle(iinappmessage.getExtras()), flag, Channel.INAPP_MESSAGE)));
	//   26   78:aload           4
	//   27   80:aload_2         
	//   28   81:invokeinterface #73  <Method java.util.Map IInAppMessage.getExtras()>
	//   29   86:invokestatic    #79  <Method android.os.Bundle BundleUtils.mapToBundle(java.util.Map)>
	//   30   89:iload           5
	//   31   91:getstatic       #85  <Field Channel Channel.INAPP_MESSAGE>
	//   32   94:invokestatic    #91  <Method com.appboy.ui.actions.UriAction ActionFactory.createUriActionFromUri(Uri, android.os.Bundle, boolean, Channel)>
	//   33   97:astore_1        
			AppboyNavigator.getAppboyNavigator().gotoUri(((android.content.Context) (getInAppMessageManager().getActivity())), ((com.appboy.ui.actions.UriAction) (clickaction)));
	//   34   98:invokestatic    #97  <Method IAppboyNavigator AppboyNavigator.getAppboyNavigator()>
	//   35  101:aload_0         
	//   36  102:invokespecial   #37  <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   37  105:invokevirtual   #41  <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//   38  108:aload_1         
	//   39  109:invokeinterface #103 <Method void IAppboyNavigator.gotoUri(android.content.Context, com.appboy.ui.actions.UriAction)>
			return;
	//   40  114:return          

		case 1: // '\001'
			inappmessagecloser.close(false);
	//   41  115:aload_3         
	//   42  116:iconst_0        
	//   43  117:invokevirtual   #63  <Method void InAppMessageCloser.close(boolean)>
			clickaction = ((ClickAction) (new NewsfeedAction(BundleUtils.mapToBundle(iinappmessage.getExtras()), Channel.INAPP_MESSAGE)));
	//   44  120:new             #105 <Class NewsfeedAction>
	//   45  123:dup             
	//   46  124:aload_2         
	//   47  125:invokeinterface #73  <Method java.util.Map IInAppMessage.getExtras()>
	//   48  130:invokestatic    #79  <Method android.os.Bundle BundleUtils.mapToBundle(java.util.Map)>
	//   49  133:getstatic       #85  <Field Channel Channel.INAPP_MESSAGE>
	//   50  136:invokespecial   #108 <Method void NewsfeedAction(android.os.Bundle, Channel)>
	//   51  139:astore_1        
			AppboyNavigator.getAppboyNavigator().gotoNewsFeed(((android.content.Context) (getInAppMessageManager().getActivity())), ((NewsfeedAction) (clickaction)));
	//   52  140:invokestatic    #97  <Method IAppboyNavigator AppboyNavigator.getAppboyNavigator()>
	//   53  143:aload_0         
	//   54  144:invokespecial   #37  <Method AppboyInAppMessageManager getInAppMessageManager()>
	//   55  147:invokevirtual   #41  <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
	//   56  150:aload_1         
	//   57  151:invokeinterface #112 <Method void IAppboyNavigator.gotoNewsFeed(android.content.Context, NewsfeedAction)>
			return;
	//   58  156:return          
		}
	}

	private void performInAppMessageButtonClicked(MessageButton messagebutton, IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
	{
		performClickAction(messagebutton.getClickAction(), iinappmessage, inappmessagecloser, messagebutton.getUri(), messagebutton.getOpenUriInWebview());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #120 <Method ClickAction MessageButton.getClickAction()>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #124 <Method Uri MessageButton.getUri()>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #127 <Method boolean MessageButton.getOpenUriInWebview()>
	//    9   15:invokespecial   #129 <Method void performClickAction(ClickAction, IInAppMessage, InAppMessageCloser, Uri, boolean)>
	//   10   18:return          
	}

	private void performInAppMessageClicked(IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
	{
		performClickAction(iinappmessage.getClickAction(), iinappmessage, inappmessagecloser, iinappmessage.getUri(), iinappmessage.getOpenUriInWebView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #132 <Method ClickAction IInAppMessage.getClickAction()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokeinterface #133 <Method Uri IInAppMessage.getUri()>
	//    7   15:aload_1         
	//    8   16:invokeinterface #136 <Method boolean IInAppMessage.getOpenUriInWebView()>
	//    9   21:invokespecial   #129 <Method void performClickAction(ClickAction, IInAppMessage, InAppMessageCloser, Uri, boolean)>
	//   10   24:return          
	}

	private void startClearHtmlInAppMessageAssetsThread()
	{
		(new Thread(new Runnable() {

			public void run()
			{
				android.app.Activity activity = AppboyInAppMessageManager.getInstance().getActivity();
			//    0    0:invokestatic    #27  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
			//    1    3:invokevirtual   #31  <Method android.app.Activity AppboyInAppMessageManager.getActivity()>
			//    2    6:astore_1        
				if(activity != null)
			//*   3    7:aload_1         
			//*   4    8:ifnull          18
					AppboyFileUtils.deleteFileOrDirectory(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(((android.content.Context) (activity))));
			//    5   11:aload_1         
			//    6   12:invokestatic    #37  <Method java.io.File WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(android.content.Context)>
			//    7   15:invokestatic    #43  <Method void AppboyFileUtils.deleteFileOrDirectory(java.io.File)>
			//    8   18:return          
			}

			final AppboyInAppMessageViewLifecycleListener this$0;

			
			{
				this$0 = AppboyInAppMessageViewLifecycleListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyInAppMessageViewLifecycleListener this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
)).start();
	//    0    0:new             #139 <Class Thread>
	//    1    3:dup             
	//    2    4:new             #8   <Class AppboyInAppMessageViewLifecycleListener$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #142 <Method void AppboyInAppMessageViewLifecycleListener$1(AppboyInAppMessageViewLifecycleListener)>
	//    6   12:invokespecial   #145 <Method void Thread(Runnable)>
	//    7   15:invokevirtual   #148 <Method void Thread.start()>
	//    8   18:return          
	}

	public void afterClosed(IInAppMessage iinappmessage)
	{
		AppboyLogger.d(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterClosed called.");
	//    0    0:getstatic       #22  <Field String TAG>
	//    1    3:ldc1            #152 <String "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterClosed called.">
	//    2    5:invokestatic    #155 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		getInAppMessageManager().resetAfterInAppMessageClose();
	//    4    9:aload_0         
	//    5   10:invokespecial   #37  <Method AppboyInAppMessageManager getInAppMessageManager()>
	//    6   13:invokevirtual   #158 <Method void AppboyInAppMessageManager.resetAfterInAppMessageClose()>
		if(iinappmessage instanceof IInAppMessageHtml)
	//*   7   16:aload_1         
	//*   8   17:instanceof      #160 <Class IInAppMessageHtml>
	//*   9   20:ifeq            27
			startClearHtmlInAppMessageAssetsThread();
	//   10   23:aload_0         
	//   11   24:invokespecial   #162 <Method void startClearHtmlInAppMessageAssetsThread()>
		iinappmessage.onAfterClosed();
	//   12   27:aload_1         
	//   13   28:invokeinterface #165 <Method void IInAppMessage.onAfterClosed()>
	//   14   33:return          
	}

	public void afterOpened(View view, IInAppMessage iinappmessage)
	{
		AppboyLogger.d(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterOpened called.");
	//    0    0:getstatic       #22  <Field String TAG>
	//    1    3:ldc1            #169 <String "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterOpened called.">
	//    2    5:invokestatic    #155 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void beforeClosed(View view, IInAppMessage iinappmessage)
	{
		AppboyLogger.d(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeClosed called.");
	//    0    0:getstatic       #22  <Field String TAG>
	//    1    3:ldc1            #172 <String "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeClosed called.">
	//    2    5:invokestatic    #155 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void beforeOpened(View view, IInAppMessage iinappmessage)
	{
		AppboyLogger.d(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeOpened called.");
	//    0    0:getstatic       #22  <Field String TAG>
	//    1    3:ldc1            #175 <String "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeOpened called.">
	//    2    5:invokestatic    #155 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		iinappmessage.logImpression();
	//    4    9:aload_2         
	//    5   10:invokeinterface #178 <Method boolean IInAppMessage.logImpression()>
	//    6   15:pop             
	//    7   16:return          
	}

	public void onButtonClicked(InAppMessageCloser inappmessagecloser, MessageButton messagebutton, IInAppMessageImmersive iinappmessageimmersive)
	{
		AppboyLogger.d(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onButtonClicked called.");
	//    0    0:getstatic       #22  <Field String TAG>
	//    1    3:ldc1            #182 <String "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onButtonClicked called.">
	//    2    5:invokestatic    #155 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		iinappmessageimmersive.logButtonClick(messagebutton);
	//    4    9:aload_3         
	//    5   10:aload_2         
	//    6   11:invokeinterface #188 <Method boolean IInAppMessageImmersive.logButtonClick(MessageButton)>
	//    7   16:pop             
		if(!getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(messagebutton, inappmessagecloser))
	//*   8   17:aload_0         
	//*   9   18:invokespecial   #37  <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*  10   21:invokevirtual   #192 <Method IInAppMessageManagerListener AppboyInAppMessageManager.getInAppMessageManagerListener()>
	//*  11   24:aload_2         
	//*  12   25:aload_1         
	//*  13   26:invokeinterface #198 <Method boolean IInAppMessageManagerListener.onInAppMessageButtonClicked(MessageButton, InAppMessageCloser)>
	//*  14   31:ifne            41
			performInAppMessageButtonClicked(messagebutton, ((IInAppMessage) (iinappmessageimmersive)), inappmessagecloser);
	//   15   34:aload_0         
	//   16   35:aload_2         
	//   17   36:aload_3         
	//   18   37:aload_1         
	//   19   38:invokespecial   #200 <Method void performInAppMessageButtonClicked(MessageButton, IInAppMessage, InAppMessageCloser)>
	//   20   41:return          
	}

	public void onClicked(InAppMessageCloser inappmessagecloser, View view, IInAppMessage iinappmessage)
	{
		AppboyLogger.d(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onClicked called.");
	//    0    0:getstatic       #22  <Field String TAG>
	//    1    3:ldc1            #204 <String "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onClicked called.">
	//    2    5:invokestatic    #155 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		iinappmessage.logClick();
	//    4    9:aload_3         
	//    5   10:invokeinterface #207 <Method boolean IInAppMessage.logClick()>
	//    6   15:pop             
		if(!getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(iinappmessage, inappmessagecloser))
	//*   7   16:aload_0         
	//*   8   17:invokespecial   #37  <Method AppboyInAppMessageManager getInAppMessageManager()>
	//*   9   20:invokevirtual   #192 <Method IInAppMessageManagerListener AppboyInAppMessageManager.getInAppMessageManagerListener()>
	//*  10   23:aload_3         
	//*  11   24:aload_1         
	//*  12   25:invokeinterface #211 <Method boolean IInAppMessageManagerListener.onInAppMessageClicked(IInAppMessage, InAppMessageCloser)>
	//*  13   30:ifne            39
			performInAppMessageClicked(iinappmessage, inappmessagecloser);
	//   14   33:aload_0         
	//   15   34:aload_3         
	//   16   35:aload_1         
	//   17   36:invokespecial   #213 <Method void performInAppMessageClicked(IInAppMessage, InAppMessageCloser)>
	//   18   39:return          
	}

	public void onDismissed(View view, IInAppMessage iinappmessage)
	{
		AppboyLogger.d(TAG, "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onDismissed called.");
	//    0    0:getstatic       #22  <Field String TAG>
	//    1    3:ldc1            #216 <String "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onDismissed called.">
	//    2    5:invokestatic    #155 <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(iinappmessage);
	//    4    9:aload_0         
	//    5   10:invokespecial   #37  <Method AppboyInAppMessageManager getInAppMessageManager()>
	//    6   13:invokevirtual   #192 <Method IInAppMessageManagerListener AppboyInAppMessageManager.getInAppMessageManagerListener()>
	//    7   16:aload_2         
	//    8   17:invokeinterface #219 <Method void IInAppMessageManagerListener.onInAppMessageDismissed(IInAppMessage)>
	//    9   22:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/listeners/AppboyInAppMessageViewLifecycleListener);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageViewLifecycleListener>
	//    1    2:invokestatic    #20  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #22  <Field String TAG>
	//*   3    8:return          
	}
}
