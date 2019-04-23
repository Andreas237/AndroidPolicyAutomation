// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.Sharer;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class MessageDialog extends FacebookDialogBase
	implements Sharer
{
	private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(ShareContent sharecontent, boolean flag)
		{
			return sharecontent != null && MessageDialog.canShow(((Object) (sharecontent)).getClass());
		//    0    0:aload_1         
		//    1    1:ifnull          16
		//    2    4:aload_1         
		//    3    5:invokevirtual   #31  <Method Class Object.getClass()>
		//    4    8:invokestatic    #34  <Method boolean MessageDialog.canShow(Class)>
		//    5   11:ifeq            16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((ShareContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #37  <Class ShareContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #39  <Method boolean canShow(ShareContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(final ShareContent content)
		{
			ShareContentValidation.validateForMessage(content);
		//    0    0:aload_1         
		//    1    1:invokestatic    #47  <Method void ShareContentValidation.validateForMessage(ShareContent)>
			final AppCall appCall = createBaseAppCall();
		//    2    4:aload_0         
		//    3    5:getfield        #16  <Field MessageDialog this$0>
		//    4    8:invokevirtual   #51  <Method AppCall MessageDialog.createBaseAppCall()>
		//    5   11:astore_3        
			boolean flag = getShouldFailOnDataError();
		//    6   12:aload_0         
		//    7   13:getfield        #16  <Field MessageDialog this$0>
		//    8   16:invokevirtual   #55  <Method boolean MessageDialog.getShouldFailOnDataError()>
		//    9   19:istore_2        
			MessageDialog.logDialogShare(((Context) (getActivityContext())), content, appCall);
		//   10   20:aload_0         
		//   11   21:getfield        #16  <Field MessageDialog this$0>
		//   12   24:invokestatic    #59  <Method Activity MessageDialog.access$100(MessageDialog)>
		//   13   27:aload_1         
		//   14   28:aload_3         
		//   15   29:invokestatic    #63  <Method void MessageDialog.access$200(Context, ShareContent, AppCall)>
			DialogPresenter.setupAppCallForNativeDialog(appCall, ((_cls1) (flag)). new com.facebook.internal.DialogPresenter.ParameterProvider() {

				public Bundle getLegacyParameters()
				{
					return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #50  <Method Bundle LegacyNativeDialogParameters.create(UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				public Bundle getParameters()
				{
					return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #54  <Method Bundle NativeDialogParameters.create(UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				final NativeHandler this$1;
				final AppCall val$appCall;
				final ShareContent val$content;
				final boolean val$shouldFailOnDataError;

			
			{
				this$1 = final_nativehandler;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MessageDialog$NativeHandler this$1>
				appCall = appcall;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field AppCall val$appCall>
				content = sharecontent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field ShareContent val$content>
				shouldFailOnDataError = Z.this;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field boolean val$shouldFailOnDataError>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
, MessageDialog.getFeature(((Object) (content)).getClass()));
		//   16   32:aload_3         
		//   17   33:new             #10  <Class MessageDialog$NativeHandler$1>
		//   18   36:dup             
		//   19   37:aload_0         
		//   20   38:aload_3         
		//   21   39:aload_1         
		//   22   40:iload_2         
		//   23   41:invokespecial   #66  <Method void MessageDialog$NativeHandler$1(MessageDialog$NativeHandler, AppCall, ShareContent, boolean)>
		//   24   44:aload_1         
		//   25   45:invokevirtual   #31  <Method Class Object.getClass()>
		//   26   48:invokestatic    #70  <Method DialogFeature MessageDialog.access$300(Class)>
		//   27   51:invokestatic    #76  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, DialogFeature)>
			return appCall;
		//   28   54:aload_3         
		//   29   55:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #37  <Class ShareContent>
		//    3    5:invokevirtual   #79  <Method AppCall createAppCall(ShareContent)>
		//    4    8:areturn         
		}

		final MessageDialog this$0;

		private NativeHandler()
		{
			this$0 = MessageDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MessageDialog this$0>
			super(((FacebookDialogBase) (MessageDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}


	public MessageDialog(Activity activity)
	{
		super(activity, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #32  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #38  <Method void FacebookDialogBase(Activity, int)>
		shouldFailOnDataError = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #40  <Field boolean shouldFailOnDataError>
		ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
	//    7   13:getstatic       #32  <Field int DEFAULT_REQUEST_CODE>
	//    8   16:invokestatic    #46  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//    9   19:return          
	}

	MessageDialog(Activity activity, int i)
	{
		super(activity, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void FacebookDialogBase(Activity, int)>
		shouldFailOnDataError = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #40  <Field boolean shouldFailOnDataError>
		ShareInternalUtility.registerStaticShareCallback(i);
	//    7   11:iload_2         
	//    8   12:invokestatic    #46  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//    9   15:return          
	}

	public MessageDialog(Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #49  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #51  <Method void FragmentWrapper(Fragment)>
	//    5    9:invokespecial   #54  <Method void MessageDialog(FragmentWrapper)>
	//    6   12:return          
	}

	MessageDialog(Fragment fragment, int i)
	{
		this(new FragmentWrapper(fragment), i);
	//    0    0:aload_0         
	//    1    1:new             #49  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #51  <Method void FragmentWrapper(Fragment)>
	//    5    9:iload_2         
	//    6   10:invokespecial   #58  <Method void MessageDialog(FragmentWrapper, int)>
	//    7   13:return          
	}

	public MessageDialog(android.support.v4.app.Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #49  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #61  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:invokespecial   #54  <Method void MessageDialog(FragmentWrapper)>
	//    6   12:return          
	}

	MessageDialog(android.support.v4.app.Fragment fragment, int i)
	{
		this(new FragmentWrapper(fragment), i);
	//    0    0:aload_0         
	//    1    1:new             #49  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #61  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:iload_2         
	//    6   10:invokespecial   #58  <Method void MessageDialog(FragmentWrapper, int)>
	//    7   13:return          
	}

	private MessageDialog(FragmentWrapper fragmentwrapper)
	{
		super(fragmentwrapper, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #32  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #63  <Method void FacebookDialogBase(FragmentWrapper, int)>
		shouldFailOnDataError = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #40  <Field boolean shouldFailOnDataError>
		ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
	//    7   13:getstatic       #32  <Field int DEFAULT_REQUEST_CODE>
	//    8   16:invokestatic    #46  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//    9   19:return          
	}

	private MessageDialog(FragmentWrapper fragmentwrapper, int i)
	{
		super(fragmentwrapper, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #63  <Method void FacebookDialogBase(FragmentWrapper, int)>
		shouldFailOnDataError = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #40  <Field boolean shouldFailOnDataError>
		ShareInternalUtility.registerStaticShareCallback(i);
	//    7   11:iload_2         
	//    8   12:invokestatic    #46  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//    9   15:return          
	}

	public static boolean canShow(Class class1)
	{
		class1 = ((Class) (getFeature(class1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #79  <Method DialogFeature getFeature(Class)>
	//    2    4:astore_0        
		return class1 != null && DialogPresenter.canPresentNativeDialogWithFeature(((DialogFeature) (class1)));
	//    3    5:aload_0         
	//    4    6:ifnull          18
	//    5    9:aload_0         
	//    6   10:invokestatic    #87  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(DialogFeature)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static DialogFeature getFeature(Class class1)
	{
		if(((Class) (com/facebook/share/model/ShareLinkContent)).isAssignableFrom(class1))
	//*   0    0:ldc1            #91  <Class ShareLinkContent>
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #96  <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifeq            13
			return ((DialogFeature) (MessageDialogFeature.MESSAGE_DIALOG));
	//    4    9:getstatic       #102 <Field MessageDialogFeature MessageDialogFeature.MESSAGE_DIALOG>
	//    5   12:areturn         
		if(((Class) (com/facebook/share/model/ShareMessengerGenericTemplateContent)).isAssignableFrom(class1))
	//*   6   13:ldc1            #104 <Class ShareMessengerGenericTemplateContent>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #96  <Method boolean Class.isAssignableFrom(Class)>
	//*   9   19:ifeq            26
			return ((DialogFeature) (MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE));
	//   10   22:getstatic       #107 <Field MessageDialogFeature MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE>
	//   11   25:areturn         
		if(((Class) (com/facebook/share/model/ShareMessengerOpenGraphMusicTemplateContent)).isAssignableFrom(class1))
	//*  12   26:ldc1            #109 <Class ShareMessengerOpenGraphMusicTemplateContent>
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #96  <Method boolean Class.isAssignableFrom(Class)>
	//*  15   32:ifeq            39
			return ((DialogFeature) (MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE));
	//   16   35:getstatic       #112 <Field MessageDialogFeature MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE>
	//   17   38:areturn         
		if(((Class) (com/facebook/share/model/ShareMessengerMediaTemplateContent)).isAssignableFrom(class1))
	//*  18   39:ldc1            #114 <Class ShareMessengerMediaTemplateContent>
	//*  19   41:aload_0         
	//*  20   42:invokevirtual   #96  <Method boolean Class.isAssignableFrom(Class)>
	//*  21   45:ifeq            52
			return ((DialogFeature) (MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE));
	//   22   48:getstatic       #117 <Field MessageDialogFeature MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE>
	//   23   51:areturn         
		else
			return null;
	//   24   52:aconst_null     
	//   25   53:areturn         
	}

	private static void logDialogShare(Context context, ShareContent sharecontent, AppCall appcall)
	{
		Object obj = ((Object) (getFeature(((Object) (sharecontent)).getClass())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #124 <Method Class Object.getClass()>
	//    2    4:invokestatic    #79  <Method DialogFeature getFeature(Class)>
	//    3    7:astore_3        
		if(obj == MessageDialogFeature.MESSAGE_DIALOG)
	//*   4    8:aload_3         
	//*   5    9:getstatic       #102 <Field MessageDialogFeature MessageDialogFeature.MESSAGE_DIALOG>
	//*   6   12:if_acmpne       21
			obj = "status";
	//    7   15:ldc1            #126 <String "status">
	//    8   17:astore_3        
		else
	//*   9   18:goto            63
		if(obj == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE)
	//*  10   21:aload_3         
	//*  11   22:getstatic       #107 <Field MessageDialogFeature MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE>
	//*  12   25:if_acmpne       34
			obj = "GenericTemplate";
	//   13   28:ldc1            #128 <String "GenericTemplate">
	//   14   30:astore_3        
		else
	//*  15   31:goto            63
		if(obj == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE)
	//*  16   34:aload_3         
	//*  17   35:getstatic       #117 <Field MessageDialogFeature MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE>
	//*  18   38:if_acmpne       47
			obj = "MediaTemplate";
	//   19   41:ldc1            #130 <String "MediaTemplate">
	//   20   43:astore_3        
		else
	//*  21   44:goto            63
		if(obj == MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE)
	//*  22   47:aload_3         
	//*  23   48:getstatic       #112 <Field MessageDialogFeature MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE>
	//*  24   51:if_acmpne       60
			obj = "OpenGraphMusicTemplate";
	//   25   54:ldc1            #132 <String "OpenGraphMusicTemplate">
	//   26   56:astore_3        
		else
	//*  27   57:goto            63
			obj = "unknown";
	//   28   60:ldc1            #134 <String "unknown">
	//   29   62:astore_3        
		context = ((Context) (AppEventsLogger.newLogger(context)));
	//   30   63:aload_0         
	//   31   64:invokestatic    #140 <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//   32   67:astore_0        
		Bundle bundle = new Bundle();
	//   33   68:new             #142 <Class Bundle>
	//   34   71:dup             
	//   35   72:invokespecial   #144 <Method void Bundle()>
	//   36   75:astore          4
		bundle.putString("fb_share_dialog_content_type", ((String) (obj)));
	//   37   77:aload           4
	//   38   79:ldc1            #146 <String "fb_share_dialog_content_type">
	//   39   81:aload_3         
	//   40   82:invokevirtual   #150 <Method void Bundle.putString(String, String)>
		bundle.putString("fb_share_dialog_content_uuid", appcall.getCallId().toString());
	//   41   85:aload           4
	//   42   87:ldc1            #152 <String "fb_share_dialog_content_uuid">
	//   43   89:aload_2         
	//   44   90:invokevirtual   #158 <Method UUID AppCall.getCallId()>
	//   45   93:invokevirtual   #164 <Method String UUID.toString()>
	//   46   96:invokevirtual   #150 <Method void Bundle.putString(String, String)>
		bundle.putString("fb_share_dialog_content_page_id", sharecontent.getPageId());
	//   47   99:aload           4
	//   48  101:ldc1            #166 <String "fb_share_dialog_content_page_id">
	//   49  103:aload_1         
	//   50  104:invokevirtual   #171 <Method String ShareContent.getPageId()>
	//   51  107:invokevirtual   #150 <Method void Bundle.putString(String, String)>
		((AppEventsLogger) (context)).logSdkEvent("fb_messenger_share_dialog_show", ((Double) (null)), bundle);
	//   52  110:aload_0         
	//   53  111:ldc1            #173 <String "fb_messenger_share_dialog_show">
	//   54  113:aconst_null     
	//   55  114:aload           4
	//   56  116:invokevirtual   #177 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   57  119:return          
	}

	public static void show(Activity activity, ShareContent sharecontent)
	{
		(new MessageDialog(activity)).show(((Object) (sharecontent)));
	//    0    0:new             #2   <Class MessageDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #181 <Method void MessageDialog(Activity)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #184 <Method void show(Object)>
	//    6   12:return          
	}

	public static void show(Fragment fragment, ShareContent sharecontent)
	{
		show(new FragmentWrapper(fragment), sharecontent);
	//    0    0:new             #49  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #51  <Method void FragmentWrapper(Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #188 <Method void show(FragmentWrapper, ShareContent)>
	//    6   12:return          
	}

	public static void show(android.support.v4.app.Fragment fragment, ShareContent sharecontent)
	{
		show(new FragmentWrapper(fragment), sharecontent);
	//    0    0:new             #49  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #61  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #188 <Method void show(FragmentWrapper, ShareContent)>
	//    6   12:return          
	}

	private static void show(FragmentWrapper fragmentwrapper, ShareContent sharecontent)
	{
		(new MessageDialog(fragmentwrapper)).show(((Object) (sharecontent)));
	//    0    0:new             #2   <Class MessageDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void MessageDialog(FragmentWrapper)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #184 <Method void show(Object)>
	//    6   12:return          
	}

	protected AppCall createBaseAppCall()
	{
		return new AppCall(getRequestCode());
	//    0    0:new             #154 <Class AppCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #194 <Method int getRequestCode()>
	//    4    8:invokespecial   #196 <Method void AppCall(int)>
	//    5   11:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #200 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #201 <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new NativeHandler())));
	//    4    8:aload_1         
	//    5    9:new             #11  <Class MessageDialog$NativeHandler>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokespecial   #204 <Method void MessageDialog$NativeHandler(MessageDialog, MessageDialog$1)>
	//   10   18:invokevirtual   #208 <Method boolean ArrayList.add(Object)>
	//   11   21:pop             
		return ((List) (arraylist));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public boolean getShouldFailOnDataError()
	{
		return shouldFailOnDataError;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean shouldFailOnDataError>
	//    2    4:ireturn         
	}

	protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, FacebookCallback facebookcallback)
	{
		ShareInternalUtility.registerSharerCallback(getRequestCode(), ((com.facebook.CallbackManager) (callbackmanagerimpl)), facebookcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #194 <Method int getRequestCode()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #217 <Method void ShareInternalUtility.registerSharerCallback(int, com.facebook.CallbackManager, FacebookCallback)>
	//    5    9:return          
	}

	public void setShouldFailOnDataError(boolean flag)
	{
		shouldFailOnDataError = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean shouldFailOnDataError>
	//    3    5:return          
	}

	private static final int DEFAULT_REQUEST_CODE;
	private boolean shouldFailOnDataError;

	static 
	{
		DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
	//    0    0:getstatic       #26  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Message>
	//    1    3:invokevirtual   #30  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:putstatic       #32  <Field int DEFAULT_REQUEST_CODE>
	//*   3    9:return          
	}


/*
	static Activity access$100(MessageDialog messagedialog)
	{
		return messagedialog.getActivityContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method Activity getActivityContext()>
	//    2    4:areturn         
	}

*/


/*
	static void access$200(Context context, ShareContent sharecontent, AppCall appcall)
	{
		logDialogShare(context, sharecontent, appcall);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #74  <Method void logDialogShare(Context, ShareContent, AppCall)>
		return;
	//    4    6:return          
	}

*/


/*
	static DialogFeature access$300(Class class1)
	{
		return getFeature(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #79  <Method DialogFeature getFeature(Class)>
	//    2    4:areturn         
	}

*/
}
