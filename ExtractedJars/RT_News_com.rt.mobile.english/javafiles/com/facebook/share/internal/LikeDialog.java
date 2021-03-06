// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.internal.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.share.internal:
//			LikeContent, LikeDialogFeature, ResultProcessor, ShareInternalUtility

public class LikeDialog extends FacebookDialogBase
{
	private class NativeHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(LikeContent likecontent)
		{
			return likecontent != null && LikeDialog.canShowNativeDialog();
		//    0    0:aload_1         
		//    1    1:ifnull          12
		//    2    4:invokestatic    #29  <Method boolean LikeDialog.canShowNativeDialog()>
		//    3    7:ifeq            12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public volatile boolean canShow(Object obj)
		{
			return canShow((LikeContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #32  <Class LikeContent>
		//    3    5:invokevirtual   #34  <Method boolean canShow(LikeContent)>
		//    4    8:ireturn         
		}

		public AppCall createAppCall(LikeContent likecontent)
		{
			AppCall appcall = createBaseAppCall();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field LikeDialog this$0>
		//    2    4:invokevirtual   #40  <Method AppCall LikeDialog.createBaseAppCall()>
		//    3    7:astore_2        
			DialogPresenter.setupAppCallForNativeDialog(appcall, ((_cls1) (likecontent)). new com.facebook.internal.DialogPresenter.ParameterProvider() {

				public Bundle getLegacyParameters()
				{
					Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
				//    0    0:ldc1            #32  <String "LikeDialog">
				//    1    2:ldc1            #34  <String "Attempting to present the Like Dialog with an outdated Facebook app on the device">
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
					return LikeDialog.createParameters(content);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field LikeContent val$content>
				//    2    4:invokestatic    #48  <Method Bundle LikeDialog.access$200(LikeContent)>
				//    3    7:areturn         
				}

				final NativeHandler this$1;
				final LikeContent val$content;

			
			{
				this$1 = final_nativehandler;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field LikeDialog$NativeHandler this$1>
				content = LikeContent.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field LikeContent val$content>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
, LikeDialog.getFeature());
		//    4    8:aload_2         
		//    5    9:new             #10  <Class LikeDialog$NativeHandler$1>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokespecial   #43  <Method void LikeDialog$NativeHandler$1(LikeDialog$NativeHandler, LikeContent)>
		//   10   18:invokestatic    #47  <Method DialogFeature LikeDialog.access$300()>
		//   11   21:invokestatic    #53  <Method void DialogPresenter.setupAppCallForNativeDialog(AppCall, com.facebook.internal.DialogPresenter$ParameterProvider, DialogFeature)>
			return appcall;
		//   12   24:aload_2         
		//   13   25:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((LikeContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #32  <Class LikeContent>
		//    3    5:invokevirtual   #56  <Method AppCall createAppCall(LikeContent)>
		//    4    8:areturn         
		}

		final LikeDialog this$0;

		private NativeHandler()
		{
			this$0 = LikeDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field LikeDialog this$0>
			super(((FacebookDialogBase) (LikeDialog.this)));
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
		//    1    1:getfield        #16  <Field Bundle bundle>
		//    2    4:areturn         
		}

		private final Bundle bundle;

		public Result(Bundle bundle1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			bundle = bundle1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field Bundle bundle>
		//    5    9:return          
		}
	}

	private class WebFallbackHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(LikeContent likecontent)
		{
			return likecontent != null && LikeDialog.canShowWebFallback();
		//    0    0:aload_1         
		//    1    1:ifnull          12
		//    2    4:invokestatic    #27  <Method boolean LikeDialog.canShowWebFallback()>
		//    3    7:ifeq            12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public volatile boolean canShow(Object obj)
		{
			return canShow((LikeContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class LikeContent>
		//    3    5:invokevirtual   #32  <Method boolean canShow(LikeContent)>
		//    4    8:ireturn         
		}

		public AppCall createAppCall(LikeContent likecontent)
		{
			AppCall appcall = createBaseAppCall();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field LikeDialog this$0>
		//    2    4:invokevirtual   #38  <Method AppCall LikeDialog.createBaseAppCall()>
		//    3    7:astore_2        
			DialogPresenter.setupAppCallForWebFallbackDialog(appcall, LikeDialog.createParameters(likecontent), LikeDialog.getFeature());
		//    4    8:aload_2         
		//    5    9:aload_1         
		//    6   10:invokestatic    #42  <Method Bundle LikeDialog.access$200(LikeContent)>
		//    7   13:invokestatic    #46  <Method DialogFeature LikeDialog.access$300()>
		//    8   16:invokestatic    #52  <Method void DialogPresenter.setupAppCallForWebFallbackDialog(AppCall, Bundle, DialogFeature)>
			return appcall;
		//    9   19:aload_2         
		//   10   20:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((LikeContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #30  <Class LikeContent>
		//    3    5:invokevirtual   #55  <Method AppCall createAppCall(LikeContent)>
		//    4    8:areturn         
		}

		final LikeDialog this$0;

		private WebFallbackHandler()
		{
			this$0 = LikeDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field LikeDialog this$0>
			super(((FacebookDialogBase) (LikeDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}


	public LikeDialog(Activity activity)
	{
		super(activity, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #40  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #46  <Method void FacebookDialogBase(Activity, int)>
	//    4    8:return          
	}

	public LikeDialog(Fragment fragment)
	{
		super(fragment, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #40  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #50  <Method void FacebookDialogBase(Fragment, int)>
	//    4    8:return          
	}

	public static boolean canShowNativeDialog()
	{
		return DialogPresenter.canPresentNativeDialogWithFeature(getFeature());
	//    0    0:invokestatic    #60  <Method DialogFeature getFeature()>
	//    1    3:invokestatic    #68  <Method boolean DialogPresenter.canPresentNativeDialogWithFeature(DialogFeature)>
	//    2    6:ireturn         
	}

	public static boolean canShowWebFallback()
	{
		return DialogPresenter.canPresentWebFallbackDialogWithFeature(getFeature());
	//    0    0:invokestatic    #60  <Method DialogFeature getFeature()>
	//    1    3:invokestatic    #72  <Method boolean DialogPresenter.canPresentWebFallbackDialogWithFeature(DialogFeature)>
	//    2    6:ireturn         
	}

	private static Bundle createParameters(LikeContent likecontent)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #74  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("object_id", likecontent.getObjectId());
	//    4    8:aload_1         
	//    5    9:ldc1            #78  <String "object_id">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #84  <Method String LikeContent.getObjectId()>
	//    8   15:invokevirtual   #88  <Method void Bundle.putString(String, String)>
		bundle.putString("object_type", likecontent.getObjectType());
	//    9   18:aload_1         
	//   10   19:ldc1            #90  <String "object_type">
	//   11   21:aload_0         
	//   12   22:invokevirtual   #93  <Method String LikeContent.getObjectType()>
	//   13   25:invokevirtual   #88  <Method void Bundle.putString(String, String)>
		return bundle;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	private static DialogFeature getFeature()
	{
		return ((DialogFeature) (LikeDialogFeature.LIKE_DIALOG));
	//    0    0:getstatic       #99  <Field LikeDialogFeature LikeDialogFeature.LIKE_DIALOG>
	//    1    3:areturn         
	}

	protected AppCall createBaseAppCall()
	{
		return new AppCall(getRequestCode());
	//    0    0:new             #103 <Class AppCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #106 <Method int getRequestCode()>
	//    4    8:invokespecial   #109 <Method void AppCall(int)>
	//    5   11:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #113 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new NativeHandler())));
	//    4    8:aload_1         
	//    5    9:new             #11  <Class LikeDialog$NativeHandler>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokespecial   #117 <Method void LikeDialog$NativeHandler(LikeDialog, LikeDialog$1)>
	//   10   18:invokevirtual   #121 <Method boolean ArrayList.add(Object)>
	//   11   21:pop             
		arraylist.add(((Object) (new WebFallbackHandler())));
	//   12   22:aload_1         
	//   13   23:new             #19  <Class LikeDialog$WebFallbackHandler>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:invokespecial   #122 <Method void LikeDialog$WebFallbackHandler(LikeDialog, LikeDialog$1)>
	//   18   32:invokevirtual   #121 <Method boolean ArrayList.add(Object)>
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
					callback.onSuccess(((Object) (new Result(bundle))));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field FacebookCallback val$callback>
				//    2    4:new             #27  <Class LikeDialog$Result>
				//    3    7:dup             
				//    4    8:aload_2         
				//    5    9:invokespecial   #30  <Method void LikeDialog$Result(Bundle)>
				//    6   12:invokeinterface #35  <Method void FacebookCallback.onSuccess(Object)>
				//    7   17:return          
				}

				final LikeDialog this$0;
				final FacebookCallback val$callback;

			
			{
				this$0 = LikeDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LikeDialog this$0>
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
	//    5    9:new             #7   <Class LikeDialog$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aload_2         
	//   10   16:invokespecial   #129 <Method void LikeDialog$1(LikeDialog, FacebookCallback, FacebookCallback)>
	//   11   19:astore_2        
		final_facebookcallback = ((FacebookCallback) (new com.facebook.internal.CallbackManagerImpl.Callback() {

			public boolean onActivityResult(int i, Intent intent)
			{
				return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field LikeDialog this$0>
			//    2    4:invokevirtual   #31  <Method int LikeDialog.getRequestCode()>
			//    3    7:iload_1         
			//    4    8:aload_2         
			//    5    9:aload_0         
			//    6   10:getfield        #21  <Field ResultProcessor val$resultProcessor>
			//    7   13:invokestatic    #37  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
			//    8   16:ireturn         
			}

			final LikeDialog this$0;
			final ResultProcessor val$resultProcessor;

			
			{
				this$0 = LikeDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LikeDialog this$0>
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
	//   12   20:new             #9   <Class LikeDialog$2>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:invokespecial   #132 <Method void LikeDialog$2(LikeDialog, ResultProcessor)>
	//   17   29:astore_2        
		callbackmanagerimpl.registerCallback(getRequestCode(), ((com.facebook.internal.CallbackManagerImpl.Callback) (final_facebookcallback)));
	//   18   30:aload_1         
	//   19   31:aload_0         
	//   20   32:invokevirtual   #106 <Method int getRequestCode()>
	//   21   35:aload_2         
	//   22   36:invokevirtual   #138 <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
	//   23   39:return          
	}

	private static final int DEFAULT_REQUEST_CODE;
	private static final String TAG = "LikeDialog";

	static 
	{
		DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode();
	//    0    0:getstatic       #34  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Like>
	//    1    3:invokevirtual   #38  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:putstatic       #40  <Field int DEFAULT_REQUEST_CODE>
	//*   3    9:return          
	}


/*
	static Bundle access$200(LikeContent likecontent)
	{
		return createParameters(likecontent);
	//    0    0:aload_0         
	//    1    1:invokestatic    #55  <Method Bundle createParameters(LikeContent)>
	//    2    4:areturn         
	}

*/


/*
	static DialogFeature access$300()
	{
		return getFeature();
	//    0    0:invokestatic    #60  <Method DialogFeature getFeature()>
	//    1    3:areturn         
	}

*/
}
