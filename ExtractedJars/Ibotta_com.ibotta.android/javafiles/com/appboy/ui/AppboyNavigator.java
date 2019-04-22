// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.content.Context;
import com.appboy.IAppboyNavigator;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.NewsfeedAction;
import com.appboy.ui.actions.UriAction;

public class AppboyNavigator
	implements IAppboyNavigator
{

	public AppboyNavigator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static void executeNewsFeedAction(Context context, NewsfeedAction newsfeedaction)
	{
		if(newsfeedaction == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			AppboyLogger.e(TAG, "IAppboyNavigator cannot open News feed because the news feed action object was null.");
	//    2    4:getstatic       #21  <Field String TAG>
	//    3    7:ldc1            #32  <String "IAppboyNavigator cannot open News feed because the news feed action object was null.">
	//    4    9:invokestatic    #36  <Method int AppboyLogger.e(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		} else
		{
			newsfeedaction.execute(context);
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #42  <Method void NewsfeedAction.execute(Context)>
			return;
	//   10   19:return          
		}
	}

	public static void executeUriAction(Context context, UriAction uriaction)
	{
		if(uriaction == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			AppboyLogger.e(TAG, "IAppboyNavigator cannot open Uri because the Uri action object was null.");
	//    2    4:getstatic       #21  <Field String TAG>
	//    3    7:ldc1            #46  <String "IAppboyNavigator cannot open Uri because the Uri action object was null.">
	//    4    9:invokestatic    #36  <Method int AppboyLogger.e(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		} else
		{
			uriaction.execute(context);
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #49  <Method void UriAction.execute(Context)>
			return;
	//   10   19:return          
		}
	}

	public static IAppboyNavigator getAppboyNavigator()
	{
		if(sCustomAppboyNavigator != null)
	//*   0    0:getstatic       #53  <Field IAppboyNavigator sCustomAppboyNavigator>
	//*   1    3:ifnull          10
			return sCustomAppboyNavigator;
	//    2    6:getstatic       #53  <Field IAppboyNavigator sCustomAppboyNavigator>
	//    3    9:areturn         
		else
			return sDefaultAppboyNavigator;
	//    4   10:getstatic       #26  <Field IAppboyNavigator sDefaultAppboyNavigator>
	//    5   13:areturn         
	}

	public static void setAppboyNavigator(IAppboyNavigator iappboynavigator)
	{
		AppboyLogger.d(TAG, "Custom IAppboyNavigator set");
	//    0    0:getstatic       #21  <Field String TAG>
	//    1    3:ldc1            #57  <String "Custom IAppboyNavigator set">
	//    2    5:invokestatic    #60  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		sCustomAppboyNavigator = iappboynavigator;
	//    4    9:aload_0         
	//    5   10:putstatic       #53  <Field IAppboyNavigator sCustomAppboyNavigator>
	//    6   13:return          
	}

	public void gotoNewsFeed(Context context, NewsfeedAction newsfeedaction)
	{
		executeNewsFeedAction(context, newsfeedaction);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #63  <Method void executeNewsFeedAction(Context, NewsfeedAction)>
	//    3    5:return          
	}

	public void gotoUri(Context context, UriAction uriaction)
	{
		executeUriAction(context, uriaction);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #66  <Method void executeUriAction(Context, UriAction)>
	//    3    5:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/AppboyNavigator);
	private static volatile IAppboyNavigator sCustomAppboyNavigator;
	private static volatile IAppboyNavigator sDefaultAppboyNavigator = new AppboyNavigator();

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyNavigator>
	//    1    2:invokestatic    #19  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #21  <Field String TAG>
	//    3    8:new             #2   <Class AppboyNavigator>
	//    4   11:dup             
	//    5   12:invokespecial   #24  <Method void AppboyNavigator()>
	//    6   15:putstatic       #26  <Field IAppboyNavigator sDefaultAppboyNavigator>
	//*   7   18:return          
	}
}
