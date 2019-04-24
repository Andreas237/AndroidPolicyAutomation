// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.*;
import com.facebook.share.Sharer;
import com.facebook.share.internal.*;
import com.facebook.share.model.*;
import java.util.ArrayList;
import java.util.List;

public final class MessageDialog extends FacebookDialogBase
	implements Sharer
{
	private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(ShareContent sharecontent)
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

		public volatile boolean canShow(Object obj)
		{
			return canShow((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #37  <Class ShareContent>
		//    3    5:invokevirtual   #39  <Method boolean canShow(ShareContent)>
		//    4    8:ireturn         
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
			getActivityContext();
		//   10   20:aload_0         
		//   11   21:getfield        #16  <Field MessageDialog this$0>
		//   12   24:invokestatic    #59  <Method Activity MessageDialog.access$100(MessageDialog)>
		//   13   27:pop             
			DialogPresenter.setupAppCallForNativeDialog(appCall, ((_cls1) (flag)). new com.facebook.internal.DialogPresenter.ParameterProvider() {

				public Bundle getLegacyParameters()
				{
					return LegacyNativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method java.util.UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #50  <Method Bundle LegacyNativeDialogParameters.create(java.util.UUID, ShareContent, boolean)>
				//    8   18:areturn         
				}

				public Bundle getParameters()
				{
					return NativeDialogParameters.create(appCall.getCallId(), content, shouldFailOnDataError);
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field AppCall val$appCall>
				//    2    4:invokevirtual   #44  <Method java.util.UUID AppCall.getCallId()>
				//    3    7:aload_0         
				//    4    8:getfield        #30  <Field ShareContent val$content>
				//    5   11:aload_0         
				//    6   12:getfield        #32  <Field boolean val$shouldFailOnDataError>
				//    7   15:invokestatic    #54  <Method Bundle NativeDialogParameters.create(java.util.UUID, ShareContent, boolean)>
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
		//   14   28:aload_3         
		//   15   29:new             #10  <Class MessageDialog$NativeHandler$1>
		//   16   32:dup             
		//   17   33:aload_0         
		//   18   34:aload_3         
		//   19   35:aload_1         
		//   20   36:iload_2         
		//   21   37:invokespecial   #62  <Method void MessageDialog$NativeHandler$1(MessageDialog$NativeHandler, AppCall, ShareContent, boolean)>
		//   22   40:aload_1         
		//   23   41:invokevirtual   #31  <Method Class Object.getClass()>
		//   24   44:invokestatic    #66  <Method DialogFeature MessageDialog.access$200(Class)>
		//   25   47:invokestatic    #72  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, DialogFeature)>
			return appCall;
		//   26   50:aload_3         
		//   27   51:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((ShareContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #37  <Class ShareContent>
		//    3    5:invokevirtual   #75  <Method AppCall createAppCall(ShareContent)>
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
		super(fragment, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #32  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #50  <Method void FacebookDialogBase(Fragment, int)>
		shouldFailOnDataError = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #40  <Field boolean shouldFailOnDataError>
		ShareInternalUtility.registerStaticShareCallback(DEFAULT_REQUEST_CODE);
	//    7   13:getstatic       #32  <Field int DEFAULT_REQUEST_CODE>
	//    8   16:invokestatic    #46  <Method void ShareInternalUtility.registerStaticShareCallback(int)>
	//    9   19:return          
	}

	MessageDialog(Fragment fragment, int i)
	{
		super(fragment, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void FacebookDialogBase(Fragment, int)>
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
	//    1    1:invokestatic    #61  <Method DialogFeature getFeature(Class)>
	//    2    4:astore_0        
		return class1 != null && DialogPresenter.canPresentNativeDialogWithFeature(((DialogFeature) (class1)));
	//    3    5:aload_0         
	//    4    6:ifnull          18
	//    5    9:aload_0         
	//    6   10:invokestatic    #69  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(DialogFeature)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static DialogFeature getFeature(Class class1)
	{
		if(((Class) (com/facebook/share/model/ShareLinkContent)).isAssignableFrom(class1))
	//*   0    0:ldc1            #73  <Class ShareLinkContent>
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #78  <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifeq            13
			return ((DialogFeature) (MessageDialogFeature.MESSAGE_DIALOG));
	//    4    9:getstatic       #84  <Field MessageDialogFeature MessageDialogFeature.MESSAGE_DIALOG>
	//    5   12:areturn         
		if(((Class) (com/facebook/share/model/SharePhotoContent)).isAssignableFrom(class1))
	//*   6   13:ldc1            #86  <Class SharePhotoContent>
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #78  <Method boolean Class.isAssignableFrom(Class)>
	//*   9   19:ifeq            26
			return ((DialogFeature) (MessageDialogFeature.PHOTOS));
	//   10   22:getstatic       #89  <Field MessageDialogFeature MessageDialogFeature.PHOTOS>
	//   11   25:areturn         
		if(((Class) (com/facebook/share/model/ShareVideoContent)).isAssignableFrom(class1))
	//*  12   26:ldc1            #91  <Class ShareVideoContent>
	//*  13   28:aload_0         
	//*  14   29:invokevirtual   #78  <Method boolean Class.isAssignableFrom(Class)>
	//*  15   32:ifeq            39
			return ((DialogFeature) (MessageDialogFeature.VIDEO));
	//   16   35:getstatic       #94  <Field MessageDialogFeature MessageDialogFeature.VIDEO>
	//   17   38:areturn         
		if(((Class) (com/facebook/share/model/ShareOpenGraphContent)).isAssignableFrom(class1))
	//*  18   39:ldc1            #96  <Class ShareOpenGraphContent>
	//*  19   41:aload_0         
	//*  20   42:invokevirtual   #78  <Method boolean Class.isAssignableFrom(Class)>
	//*  21   45:ifeq            52
			return ((DialogFeature) (OpenGraphMessageDialogFeature.OG_MESSAGE_DIALOG));
	//   22   48:getstatic       #102 <Field OpenGraphMessageDialogFeature OpenGraphMessageDialogFeature.OG_MESSAGE_DIALOG>
	//   23   51:areturn         
		else
			return null;
	//   24   52:aconst_null     
	//   25   53:areturn         
	}

	public static void show(Activity activity, ShareContent sharecontent)
	{
		(new MessageDialog(activity)).show(((Object) (sharecontent)));
	//    0    0:new             #2   <Class MessageDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #107 <Method void MessageDialog(Activity)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #110 <Method void show(Object)>
	//    6   12:return          
	}

	public static void show(Fragment fragment, ShareContent sharecontent)
	{
		(new MessageDialog(fragment)).show(((Object) (sharecontent)));
	//    0    0:new             #2   <Class MessageDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #113 <Method void MessageDialog(Fragment)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #110 <Method void show(Object)>
	//    6   12:return          
	}

	protected AppCall createBaseAppCall()
	{
		return new AppCall(getRequestCode());
	//    0    0:new             #117 <Class AppCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #120 <Method int getRequestCode()>
	//    4    8:invokespecial   #122 <Method void AppCall(int)>
	//    5   11:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #126 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #128 <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new NativeHandler())));
	//    4    8:aload_1         
	//    5    9:new             #11  <Class MessageDialog$NativeHandler>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokespecial   #131 <Method void MessageDialog$NativeHandler(MessageDialog, MessageDialog$1)>
	//   10   18:invokevirtual   #135 <Method boolean ArrayList.add(Object)>
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
	//    1    1:invokevirtual   #120 <Method int getRequestCode()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #144 <Method void ShareInternalUtility.registerSharerCallback(int, com.facebook.CallbackManager, FacebookCallback)>
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
	//    1    1:invokevirtual   #56  <Method Activity getActivityContext()>
	//    2    4:areturn         
	}

*/


/*
	static DialogFeature access$200(Class class1)
	{
		return getFeature(class1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #61  <Method DialogFeature getFeature(Class)>
	//    2    4:areturn         
	}

*/
}
