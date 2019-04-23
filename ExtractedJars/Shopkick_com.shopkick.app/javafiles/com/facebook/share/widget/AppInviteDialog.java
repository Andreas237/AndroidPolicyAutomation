// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.AppInviteDialogFeature;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.AppInviteContent;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class AppInviteDialog extends FacebookDialogBase
{
	private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(AppInviteContent appinvitecontent, boolean flag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((AppInviteContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #28  <Class AppInviteContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #30  <Method boolean canShow(AppInviteContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(AppInviteContent appinvitecontent)
		{
			AppCall appcall = createBaseAppCall();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field AppInviteDialog this$0>
		//    2    4:invokevirtual   #36  <Method AppCall AppInviteDialog.createBaseAppCall()>
		//    3    7:astore_2        
			DialogPresenter.setupAppCallForNativeDialog(appcall, ((_cls1) (appinvitecontent)). new com.facebook.internal.DialogPresenter.ParameterProvider() {

				public Bundle getLegacyParameters()
				{
					Log.e("AppInviteDialog", "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
				//    0    0:ldc1            #32  <String "AppInviteDialog">
				//    1    2:ldc1            #34  <String "Attempting to present the AppInviteDialog with an outdated Facebook app on the device">
				//    2    4:invokestatic    #40  <Method int Log.e(String, String)>
				//    3    7:pop             
					return new Bundle();
				//    4    8:new             #42  <Class Bundle>
				//    5   11:dup             
				//    6   12:invokespecial   #43  <Method void Bundle()>
				//    7   15:areturn         
				}

				public Bundle getParameters()
				{
					return AppInviteDialog.createParameters(content);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AppInviteContent val$content>
				//    2    4:invokestatic    #48  <Method Bundle AppInviteDialog.access$200(AppInviteContent)>
				//    3    7:areturn         
				}

				final NativeHandler this$1;
				final AppInviteContent val$content;

			
			{
				this$1 = final_nativehandler;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppInviteDialog$NativeHandler this$1>
				content = AppInviteContent.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AppInviteContent val$content>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, AppInviteDialog.getFeature());
		//    4    8:aload_2         
		//    5    9:new             #10  <Class AppInviteDialog$NativeHandler$1>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokespecial   #39  <Method void AppInviteDialog$NativeHandler$1(AppInviteDialog$NativeHandler, AppInviteContent)>
		//   10   18:invokestatic    #43  <Method DialogFeature AppInviteDialog.access$300()>
		//   11   21:invokestatic    #49  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, DialogFeature)>
			return appcall;
		//   12   24:aload_2         
		//   13   25:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((AppInviteContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #28  <Class AppInviteContent>
		//    3    5:invokevirtual   #52  <Method AppCall createAppCall(AppInviteContent)>
		//    4    8:areturn         
		}

		final AppInviteDialog this$0;

		private NativeHandler()
		{
			this$0 = AppInviteDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field AppInviteDialog this$0>
			super(((FacebookDialogBase) (AppInviteDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}

	public static final class Result
	{

		public Bundle getData()
		{
			return bundle;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field Bundle bundle>
		//    2    4:areturn         
		}

		private final Bundle bundle;

		public Result(Bundle bundle1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			bundle = bundle1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field Bundle bundle>
		//    5    9:return          
		}
	}

	private class WebFallbackHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(AppInviteContent appinvitecontent, boolean flag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((AppInviteContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #26  <Class AppInviteContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #28  <Method boolean canShow(AppInviteContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(AppInviteContent appinvitecontent)
		{
			AppCall appcall = createBaseAppCall();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field AppInviteDialog this$0>
		//    2    4:invokevirtual   #34  <Method AppCall AppInviteDialog.createBaseAppCall()>
		//    3    7:astore_2        
			DialogPresenter.setupAppCallForWebFallbackDialog(appcall, AppInviteDialog.createParameters(appinvitecontent), AppInviteDialog.getFeature());
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:invokestatic    #38  <Method Bundle AppInviteDialog.access$200(AppInviteContent)>
		//    7   13:invokestatic    #42  <Method DialogFeature AppInviteDialog.access$300()>
		//    8   16:invokestatic    #48  <Method void DialogPresenter.setupAppCallForWebFallbackDialog(AppCall, Bundle, DialogFeature)>
			return appcall;
		//    9   19:aload_2         
		//   10   20:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((AppInviteContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #26  <Class AppInviteContent>
		//    3    5:invokevirtual   #51  <Method AppCall createAppCall(AppInviteContent)>
		//    4    8:areturn         
		}

		final AppInviteDialog this$0;

		private WebFallbackHandler()
		{
			this$0 = AppInviteDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field AppInviteDialog this$0>
			super(((FacebookDialogBase) (AppInviteDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}


	public AppInviteDialog(Activity activity)
	{
		super(activity, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #41  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #47  <Method void FacebookDialogBase(Activity, int)>
	//    4    8:return          
	}

	public AppInviteDialog(Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #51  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #53  <Method void FragmentWrapper(Fragment)>
	//    5    9:invokespecial   #56  <Method void AppInviteDialog(FragmentWrapper)>
	//    6   12:return          
	}

	public AppInviteDialog(android.support.v4.app.Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #51  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #59  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:invokespecial   #56  <Method void AppInviteDialog(FragmentWrapper)>
	//    6   12:return          
	}

	private AppInviteDialog(FragmentWrapper fragmentwrapper)
	{
		super(fragmentwrapper, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #41  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #62  <Method void FacebookDialogBase(FragmentWrapper, int)>
	//    4    8:return          
	}

	public static boolean canShow()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static boolean canShowNativeDialog()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static boolean canShowWebFallback()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static Bundle createParameters(AppInviteContent appinvitecontent)
	{
		String s;
		Bundle bundle;
		bundle = new Bundle();
	//    0    0:new             #80  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putString("app_link_url", appinvitecontent.getApplinkUrl());
	//    4    8:aload_2         
	//    5    9:ldc1            #84  <String "app_link_url">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #90  <Method String AppInviteContent.getApplinkUrl()>
	//    8   15:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("preview_image_url", appinvitecontent.getPreviewImageUrl());
	//    9   18:aload_2         
	//   10   19:ldc1            #96  <String "preview_image_url">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #99  <Method String AppInviteContent.getPreviewImageUrl()>
	//   13   25:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("destination", appinvitecontent.getDestination().toString());
	//   14   28:aload_2         
	//   15   29:ldc1            #101 <String "destination">
	//   16   31:aload_0         
	//   17   32:invokevirtual   #105 <Method com.facebook.share.model.AppInviteContent$Builder$Destination AppInviteContent.getDestination()>
	//   18   35:invokevirtual   #110 <Method String com.facebook.share.model.AppInviteContent$Builder$Destination.toString()>
	//   19   38:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		s = appinvitecontent.getPromotionCode();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #113 <Method String AppInviteContent.getPromotionCode()>
	//   22   45:astore_1        
		if(s == null)
	//*  23   46:aload_1         
	//*  24   47:ifnull          53
	//*  25   50:goto            56
			s = "";
	//   26   53:ldc1            #115 <String "">
	//   27   55:astore_1        
		appinvitecontent = ((AppInviteContent) (appinvitecontent.getPromotionText()));
	//   28   56:aload_0         
	//   29   57:invokevirtual   #118 <Method String AppInviteContent.getPromotionText()>
	//   30   60:astore_0        
		if(TextUtils.isEmpty(((CharSequence) (appinvitecontent)))) goto _L2; else goto _L1
	//   31   61:aload_0         
	//   32   62:invokestatic    #124 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   33   65:ifne            126
_L1:
		JSONObject jsonobject = new JSONObject();
	//   34   68:new             #126 <Class JSONObject>
	//   35   71:dup             
	//   36   72:invokespecial   #127 <Method void JSONObject()>
	//   37   75:astore_3        
		jsonobject.put("promo_code", ((Object) (s)));
	//   38   76:aload_3         
	//   39   77:ldc1            #129 <String "promo_code">
	//   40   79:aload_1         
	//   41   80:invokevirtual   #133 <Method JSONObject JSONObject.put(String, Object)>
	//   42   83:pop             
		jsonobject.put("promo_text", ((Object) (appinvitecontent)));
	//   43   84:aload_3         
	//   44   85:ldc1            #135 <String "promo_text">
	//   45   87:aload_0         
	//   46   88:invokevirtual   #133 <Method JSONObject JSONObject.put(String, Object)>
	//   47   91:pop             
		bundle.putString("deeplink_context", jsonobject.toString());
	//   48   92:aload_2         
	//   49   93:ldc1            #137 <String "deeplink_context">
	//   50   95:aload_3         
	//   51   96:invokevirtual   #138 <Method String JSONObject.toString()>
	//   52   99:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("promo_code", s);
	//   53  102:aload_2         
	//   54  103:ldc1            #129 <String "promo_code">
	//   55  105:aload_1         
	//   56  106:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		bundle.putString("promo_text", ((String) (appinvitecontent)));
	//   57  109:aload_2         
	//   58  110:ldc1            #135 <String "promo_text">
	//   59  112:aload_0         
	//   60  113:invokevirtual   #94  <Method void Bundle.putString(String, String)>
		return bundle;
	//   61  116:aload_2         
	//   62  117:areturn         
_L4:
		Log.e("AppInviteDialog", "Json Exception in creating deeplink context");
	//   63  118:ldc1            #27  <String "AppInviteDialog">
	//   64  120:ldc1            #140 <String "Json Exception in creating deeplink context">
	//   65  122:invokestatic    #146 <Method int Log.e(String, String)>
	//   66  125:pop             
_L2:
		return bundle;
	//   67  126:aload_2         
	//   68  127:areturn         
		appinvitecontent;
	//   69  128:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  70  129:goto            118
	}

	private static DialogFeature getFeature()
	{
		return ((DialogFeature) (AppInviteDialogFeature.APP_INVITES_DIALOG));
	//    0    0:getstatic       #152 <Field AppInviteDialogFeature AppInviteDialogFeature.APP_INVITES_DIALOG>
	//    1    3:areturn         
	}

	public static void show(Activity activity, AppInviteContent appinvitecontent)
	{
		(new AppInviteDialog(activity)).show(appinvitecontent);
	//    0    0:new             #2   <Class AppInviteDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #156 <Method void AppInviteDialog(Activity)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #159 <Method void show(AppInviteContent)>
	//    6   12:return          
	}

	public static void show(Fragment fragment, AppInviteContent appinvitecontent)
	{
		show(new FragmentWrapper(fragment), appinvitecontent);
	//    0    0:new             #51  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void FragmentWrapper(Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #163 <Method void show(FragmentWrapper, AppInviteContent)>
	//    6   12:return          
	}

	public static void show(android.support.v4.app.Fragment fragment, AppInviteContent appinvitecontent)
	{
		show(new FragmentWrapper(fragment), appinvitecontent);
	//    0    0:new             #51  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #59  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #163 <Method void show(FragmentWrapper, AppInviteContent)>
	//    6   12:return          
	}

	private static void show(FragmentWrapper fragmentwrapper, AppInviteContent appinvitecontent)
	{
		(new AppInviteDialog(fragmentwrapper)).show(appinvitecontent);
	//    0    0:new             #2   <Class AppInviteDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #56  <Method void AppInviteDialog(FragmentWrapper)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #159 <Method void show(AppInviteContent)>
	//    6   12:return          
	}

	protected AppCall createBaseAppCall()
	{
		return new AppCall(getRequestCode());
	//    0    0:new             #168 <Class AppCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #171 <Method int getRequestCode()>
	//    4    8:invokespecial   #174 <Method void AppCall(int)>
	//    5   11:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #178 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #179 <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new NativeHandler())));
	//    4    8:aload_1         
	//    5    9:new             #11  <Class AppInviteDialog$NativeHandler>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokespecial   #182 <Method void AppInviteDialog$NativeHandler(AppInviteDialog, AppInviteDialog$1)>
	//   10   18:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
	//   11   21:pop             
		arraylist.add(((Object) (new WebFallbackHandler())));
	//   12   22:aload_1         
	//   13   23:new             #19  <Class AppInviteDialog$WebFallbackHandler>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:invokespecial   #187 <Method void AppInviteDialog$WebFallbackHandler(AppInviteDialog, AppInviteDialog$1)>
	//   18   32:invokevirtual   #186 <Method boolean ArrayList.add(Object)>
	//   19   35:pop             
		return ((List) (arraylist));
	//   20   36:aload_1         
	//   21   37:areturn         
	}

	protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, final FacebookCallback final_facebookcallback)
	{
		if(final_facebookcallback == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       9
			final_facebookcallback = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            20
			final_facebookcallback = ((FacebookCallback) (new ResultProcessor(final_facebookcallback) {

				public void onSuccess(AppCall appcall, Bundle bundle)
				{
					if("cancel".equalsIgnoreCase(ShareInternalUtility.getNativeDialogCompletionGesture(bundle)))
				//*   0    0:ldc1            #27  <String "cancel">
				//*   1    2:aload_2         
				//*   2    3:invokestatic    #33  <Method String ShareInternalUtility.getNativeDialogCompletionGesture(Bundle)>
				//*   3    6:invokevirtual   #39  <Method boolean String.equalsIgnoreCase(String)>
				//*   4    9:ifeq            22
					{
						callback.onCancel();
				//    5   12:aload_0         
				//    6   13:getfield        #19  <Field FacebookCallback val$callback>
				//    7   16:invokeinterface #45  <Method void FacebookCallback.onCancel()>
						return;
				//    8   21:return          
					} else
					{
						callback.onSuccess(((Object) (new Result(bundle))));
				//    9   22:aload_0         
				//   10   23:getfield        #19  <Field FacebookCallback val$callback>
				//   11   26:new             #47  <Class AppInviteDialog$Result>
				//   12   29:dup             
				//   13   30:aload_2         
				//   14   31:invokespecial   #50  <Method void AppInviteDialog$Result(Bundle)>
				//   15   34:invokeinterface #53  <Method void FacebookCallback.onSuccess(Object)>
						return;
				//   16   39:return          
					}
				}

				final AppInviteDialog this$0;
				final FacebookCallback val$callback;

			
			{
				this$0 = AppInviteDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppInviteDialog this$0>
				callback = facebookcallback1;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #19  <Field FacebookCallback val$callback>
				super(final_facebookcallback);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #22  <Method void ResultProcessor(FacebookCallback)>
			//    9   15:return          
			}
			}
));
	//    5    9:new             #7   <Class AppInviteDialog$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aload_2         
	//   10   16:invokespecial   #194 <Method void AppInviteDialog$1(AppInviteDialog, FacebookCallback, FacebookCallback)>
	//   11   19:astore_2        
		final_facebookcallback = ((FacebookCallback) (new com.facebook.internal.CallbackManagerImpl.Callback() {

			public boolean onActivityResult(int i, Intent intent)
			{
				return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AppInviteDialog this$0>
			//    2    4:invokevirtual   #31  <Method int AppInviteDialog.getRequestCode()>
			//    3    7:iload_1         
			//    4    8:aload_2         
			//    5    9:aload_0         
			//    6   10:getfield        #21  <Field ResultProcessor val$resultProcessor>
			//    7   13:invokestatic    #37  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
			//    8   16:ireturn         
			}

			final AppInviteDialog this$0;
			final ResultProcessor val$resultProcessor;

			
			{
				this$0 = AppInviteDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppInviteDialog this$0>
				resultProcessor = resultprocessor;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ResultProcessor val$resultProcessor>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
));
	//   12   20:new             #9   <Class AppInviteDialog$2>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:invokespecial   #197 <Method void AppInviteDialog$2(AppInviteDialog, ResultProcessor)>
	//   17   29:astore_2        
		callbackmanagerimpl.registerCallback(getRequestCode(), ((com.facebook.internal.CallbackManagerImpl.Callback) (final_facebookcallback)));
	//   18   30:aload_1         
	//   19   31:aload_0         
	//   20   32:invokevirtual   #171 <Method int getRequestCode()>
	//   21   35:aload_2         
	//   22   36:invokevirtual   #203 <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
	//   23   39:return          
	}

	public void show(AppInviteContent appinvitecontent)
	{
	//    0    0:return          
	}

	public volatile void show(Object obj)
	{
		show((AppInviteContent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #86  <Class AppInviteContent>
	//    3    5:invokevirtual   #159 <Method void show(AppInviteContent)>
	//    4    8:return          
	}

	private static final int DEFAULT_REQUEST_CODE;
	private static final String TAG = "AppInviteDialog";

	static 
	{
		DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.AppInvite.toRequestCode();
	//    0    0:getstatic       #35  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.AppInvite>
	//    1    3:invokevirtual   #39  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:putstatic       #41  <Field int DEFAULT_REQUEST_CODE>
	//*   3    9:return          
	}


/*
	static Bundle access$200(AppInviteContent appinvitecontent)
	{
		return createParameters(appinvitecontent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #67  <Method Bundle createParameters(AppInviteContent)>
	//    2    4:areturn         
	}

*/


/*
	static DialogFeature access$300()
	{
		return getFeature();
	//    0    0:invokestatic    #72  <Method DialogFeature getFeature()>
	//    1    3:areturn         
	}

*/
}
