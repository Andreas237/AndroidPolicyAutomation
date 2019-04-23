// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;
import java.util.ArrayList;
import java.util.List;

public class GameRequestDialog extends FacebookDialogBase
{
	public static final class Result
	{

		public String getRequestId()
		{
			return requestId;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field String requestId>
		//    2    4:areturn         
		}

		public List getRequestRecipients()
		{
			return to;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field List to>
		//    2    4:areturn         
		}

		String requestId;
		List to;

		private Result(Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			requestId = bundle.getString("request");
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:ldc1            #19  <String "request">
		//    5    8:invokevirtual   #25  <Method String Bundle.getString(String)>
		//    6   11:putfield        #27  <Field String requestId>
			List list;
			for(to = ((List) (new ArrayList())); bundle.containsKey(String.format("to[%d]", new Object[] {
		Integer.valueOf(to.size())
	})); list.add(((Object) (bundle.getString(String.format("to[%d]", new Object[] {
		Integer.valueOf(list.size())
	}))))))
		//*   7   14:aload_0         
		//*   8   15:new             #29  <Class ArrayList>
		//*   9   18:dup             
		//*  10   19:invokespecial   #30  <Method void ArrayList()>
		//*  11   22:putfield        #32  <Field List to>
		//*  12   25:aload_1         
		//*  13   26:ldc1            #34  <String "to[%d]">
		//*  14   28:iconst_1        
		//*  15   29:anewarray       Object[]
		//*  16   32:dup             
		//*  17   33:iconst_0        
		//*  18   34:aload_0         
		//*  19   35:getfield        #32  <Field List to>
		//*  20   38:invokeinterface #40  <Method int List.size()>
		//*  21   43:invokestatic    #46  <Method Integer Integer.valueOf(int)>
		//*  22   46:aastore         
		//*  23   47:invokestatic    #52  <Method String String.format(String, Object[])>
		//*  24   50:invokevirtual   #56  <Method boolean Bundle.containsKey(String)>
		//*  25   53:ifeq            96
				list = to;
		//   26   56:aload_0         
		//   27   57:getfield        #32  <Field List to>
		//   28   60:astore_2        

		//   29   61:aload_2         
		//   30   62:aload_1         
		//   31   63:ldc1            #34  <String "to[%d]">
		//   32   65:iconst_1        
		//   33   66:anewarray       Object[]
		//   34   69:dup             
		//   35   70:iconst_0        
		//   36   71:aload_2         
		//   37   72:invokeinterface #40  <Method int List.size()>
		//   38   77:invokestatic    #46  <Method Integer Integer.valueOf(int)>
		//   39   80:aastore         
		//   40   81:invokestatic    #52  <Method String String.format(String, Object[])>
		//   41   84:invokevirtual   #25  <Method String Bundle.getString(String)>
		//   42   87:invokeinterface #60  <Method boolean List.add(Object)>
		//   43   92:pop             
		//*  44   93:goto            25
		//   45   96:return          
		}

	}

	private class WebHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(GameRequestContent gamerequestcontent, boolean flag)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((GameRequestContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #26  <Class GameRequestContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #28  <Method boolean canShow(GameRequestContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(GameRequestContent gamerequestcontent)
		{
			GameRequestValidation.validate(gamerequestcontent);
		//    0    0:aload_1         
		//    1    1:invokestatic    #36  <Method void GameRequestValidation.validate(GameRequestContent)>
			AppCall appcall = createBaseAppCall();
		//    2    4:aload_0         
		//    3    5:getfield        #14  <Field GameRequestDialog this$0>
		//    4    8:invokevirtual   #40  <Method AppCall GameRequestDialog.createBaseAppCall()>
		//    5   11:astore_2        
			DialogPresenter.setupAppCallForWebDialog(appcall, "apprequests", WebDialogParameters.create(gamerequestcontent));
		//    6   12:aload_2         
		//    7   13:ldc1            #42  <String "apprequests">
		//    8   15:aload_1         
		//    9   16:invokestatic    #48  <Method Bundle WebDialogParameters.create(GameRequestContent)>
		//   10   19:invokestatic    #54  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, Bundle)>
			return appcall;
		//   11   22:aload_2         
		//   12   23:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((GameRequestContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #26  <Class GameRequestContent>
		//    3    5:invokevirtual   #57  <Method AppCall createAppCall(GameRequestContent)>
		//    4    8:areturn         
		}

		final GameRequestDialog this$0;

		private WebHandler()
		{
			this$0 = GameRequestDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field GameRequestDialog this$0>
			super(((FacebookDialogBase) (GameRequestDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}


	public GameRequestDialog(Activity activity)
	{
		super(activity, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #35  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #41  <Method void FacebookDialogBase(Activity, int)>
	//    4    8:return          
	}

	public GameRequestDialog(Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #44  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #46  <Method void FragmentWrapper(Fragment)>
	//    5    9:invokespecial   #49  <Method void GameRequestDialog(FragmentWrapper)>
	//    6   12:return          
	}

	public GameRequestDialog(android.support.v4.app.Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #44  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #52  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:invokespecial   #49  <Method void GameRequestDialog(FragmentWrapper)>
	//    6   12:return          
	}

	private GameRequestDialog(FragmentWrapper fragmentwrapper)
	{
		super(fragmentwrapper, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #35  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #55  <Method void FacebookDialogBase(FragmentWrapper, int)>
	//    4    8:return          
	}

	public static boolean canShow()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static void show(Activity activity, GameRequestContent gamerequestcontent)
	{
		(new GameRequestDialog(activity)).show(((Object) (gamerequestcontent)));
	//    0    0:new             #2   <Class GameRequestDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #61  <Method void GameRequestDialog(Activity)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #64  <Method void show(Object)>
	//    6   12:return          
	}

	public static void show(Fragment fragment, GameRequestContent gamerequestcontent)
	{
		show(new FragmentWrapper(fragment), gamerequestcontent);
	//    0    0:new             #44  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #46  <Method void FragmentWrapper(Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #68  <Method void show(FragmentWrapper, GameRequestContent)>
	//    6   12:return          
	}

	public static void show(android.support.v4.app.Fragment fragment, GameRequestContent gamerequestcontent)
	{
		show(new FragmentWrapper(fragment), gamerequestcontent);
	//    0    0:new             #44  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #52  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #68  <Method void show(FragmentWrapper, GameRequestContent)>
	//    6   12:return          
	}

	private static void show(FragmentWrapper fragmentwrapper, GameRequestContent gamerequestcontent)
	{
		(new GameRequestDialog(fragmentwrapper)).show(((Object) (gamerequestcontent)));
	//    0    0:new             #2   <Class GameRequestDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #49  <Method void GameRequestDialog(FragmentWrapper)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #64  <Method void show(Object)>
	//    6   12:return          
	}

	protected AppCall createBaseAppCall()
	{
		return new AppCall(getRequestCode());
	//    0    0:new             #73  <Class AppCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #76  <Method int getRequestCode()>
	//    4    8:invokespecial   #79  <Method void AppCall(int)>
	//    5   11:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #83  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new WebHandler())));
	//    4    8:aload_1         
	//    5    9:new             #14  <Class GameRequestDialog$WebHandler>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokespecial   #88  <Method void GameRequestDialog$WebHandler(GameRequestDialog, GameRequestDialog$1)>
	//   10   18:invokevirtual   #92  <Method boolean ArrayList.add(Object)>
	//   11   21:pop             
		return ((List) (arraylist));
	//   12   22:aload_1         
	//   13   23:areturn         
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
					if(bundle != null)
				//*   0    0:aload_2         
				//*   1    1:ifnull          23
					{
						callback.onSuccess(((Object) (new Result(bundle))));
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field FacebookCallback val$callback>
				//    4    8:new             #27  <Class GameRequestDialog$Result>
				//    5   11:dup             
				//    6   12:aload_2         
				//    7   13:aconst_null     
				//    8   14:invokespecial   #30  <Method void GameRequestDialog$Result(Bundle, GameRequestDialog$1)>
				//    9   17:invokeinterface #35  <Method void FacebookCallback.onSuccess(Object)>
						return;
				//   10   22:return          
					} else
					{
						onCancel(appcall);
				//   11   23:aload_0         
				//   12   24:aload_1         
				//   13   25:invokevirtual   #39  <Method void onCancel(AppCall)>
						return;
				//   14   28:return          
					}
				}

				final GameRequestDialog this$0;
				final FacebookCallback val$callback;

			
			{
				this$0 = GameRequestDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GameRequestDialog this$0>
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
	//    5    9:new             #7   <Class GameRequestDialog$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aload_2         
	//   10   16:invokespecial   #99  <Method void GameRequestDialog$1(GameRequestDialog, FacebookCallback, FacebookCallback)>
	//   11   19:astore_2        
		callbackmanagerimpl.registerCallback(getRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

			public boolean onActivityResult(int i, Intent intent)
			{
				return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field GameRequestDialog this$0>
			//    2    4:invokevirtual   #31  <Method int GameRequestDialog.getRequestCode()>
			//    3    7:iload_1         
			//    4    8:aload_2         
			//    5    9:aload_0         
			//    6   10:getfield        #21  <Field ResultProcessor val$resultProcessor>
			//    7   13:invokestatic    #37  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
			//    8   16:ireturn         
			}

			final GameRequestDialog this$0;
			final ResultProcessor val$resultProcessor;

			
			{
				this$0 = GameRequestDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GameRequestDialog this$0>
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
);
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #76  <Method int getRequestCode()>
	//   15   25:new             #9   <Class GameRequestDialog$2>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:invokespecial   #102 <Method void GameRequestDialog$2(GameRequestDialog, ResultProcessor)>
	//   20   34:invokevirtual   #108 <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
	//   21   37:return          
	}

	private static final int DEFAULT_REQUEST_CODE;
	private static final String GAME_REQUEST_DIALOG = "apprequests";

	static 
	{
		DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
	//    0    0:getstatic       #29  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.GameRequest>
	//    1    3:invokevirtual   #33  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:putstatic       #35  <Field int DEFAULT_REQUEST_CODE>
	//*   3    9:return          
	}
}
