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
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.AppGroupCreationContent;
import java.util.ArrayList;
import java.util.List;

public class CreateAppGroupDialog extends FacebookDialogBase
{
	public static final class Result
	{

		public String getId()
		{
			return id;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field String id>
		//    2    4:areturn         
		}

		private final String id;

		private Result(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			id = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field String id>
		//    5    9:return          
		}

	}

	private class WebHandler extends com.facebook.internal.FacebookDialogBase.ModeHandler
	{

		public boolean canShow(AppGroupCreationContent appgroupcreationcontent, boolean flag)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public volatile boolean canShow(Object obj, boolean flag)
		{
			return canShow((AppGroupCreationContent)obj, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #26  <Class AppGroupCreationContent>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #28  <Method boolean canShow(AppGroupCreationContent, boolean)>
		//    5    9:ireturn         
		}

		public AppCall createAppCall(AppGroupCreationContent appgroupcreationcontent)
		{
			AppCall appcall = createBaseAppCall();
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CreateAppGroupDialog this$0>
		//    2    4:invokevirtual   #34  <Method AppCall CreateAppGroupDialog.createBaseAppCall()>
		//    3    7:astore_2        
			DialogPresenter.setupAppCallForWebDialog(appcall, "game_group_create", WebDialogParameters.create(appgroupcreationcontent));
		//    4    8:aload_2         
		//    5    9:ldc1            #36  <String "game_group_create">
		//    6   11:aload_1         
		//    7   12:invokestatic    #42  <Method Bundle WebDialogParameters.create(AppGroupCreationContent)>
		//    8   15:invokestatic    #48  <Method void DialogPresenter.setupAppCallForWebDialog(AppCall, String, Bundle)>
			return appcall;
		//    9   18:aload_2         
		//   10   19:areturn         
		}

		public volatile AppCall createAppCall(Object obj)
		{
			return createAppCall((AppGroupCreationContent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #26  <Class AppGroupCreationContent>
		//    3    5:invokevirtual   #51  <Method AppCall createAppCall(AppGroupCreationContent)>
		//    4    8:areturn         
		}

		final CreateAppGroupDialog this$0;

		private WebHandler()
		{
			this$0 = CreateAppGroupDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field CreateAppGroupDialog this$0>
			super(((FacebookDialogBase) (CreateAppGroupDialog.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #17  <Method void com.facebook.internal.FacebookDialogBase$ModeHandler(FacebookDialogBase)>
		//    6   10:return          
		}

	}


	public CreateAppGroupDialog(Activity activity)
	{
		super(activity, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #36  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #42  <Method void FacebookDialogBase(Activity, int)>
	//    4    8:return          
	}

	public CreateAppGroupDialog(Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #46  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #48  <Method void FragmentWrapper(Fragment)>
	//    5    9:invokespecial   #51  <Method void CreateAppGroupDialog(FragmentWrapper)>
	//    6   12:return          
	}

	public CreateAppGroupDialog(android.support.v4.app.Fragment fragment)
	{
		this(new FragmentWrapper(fragment));
	//    0    0:aload_0         
	//    1    1:new             #46  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #54  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:invokespecial   #51  <Method void CreateAppGroupDialog(FragmentWrapper)>
	//    6   12:return          
	}

	private CreateAppGroupDialog(FragmentWrapper fragmentwrapper)
	{
		super(fragmentwrapper, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #36  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #57  <Method void FacebookDialogBase(FragmentWrapper, int)>
	//    4    8:return          
	}

	public static boolean canShow()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static void show(Activity activity, AppGroupCreationContent appgroupcreationcontent)
	{
		(new CreateAppGroupDialog(activity)).show(((Object) (appgroupcreationcontent)));
	//    0    0:new             #2   <Class CreateAppGroupDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #63  <Method void CreateAppGroupDialog(Activity)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #66  <Method void show(Object)>
	//    6   12:return          
	}

	public static void show(Fragment fragment, AppGroupCreationContent appgroupcreationcontent)
	{
		show(new FragmentWrapper(fragment), appgroupcreationcontent);
	//    0    0:new             #46  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #48  <Method void FragmentWrapper(Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #70  <Method void show(FragmentWrapper, AppGroupCreationContent)>
	//    6   12:return          
	}

	public static void show(android.support.v4.app.Fragment fragment, AppGroupCreationContent appgroupcreationcontent)
	{
		show(new FragmentWrapper(fragment), appgroupcreationcontent);
	//    0    0:new             #46  <Class FragmentWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    4    8:aload_1         
	//    5    9:invokestatic    #70  <Method void show(FragmentWrapper, AppGroupCreationContent)>
	//    6   12:return          
	}

	private static void show(FragmentWrapper fragmentwrapper, AppGroupCreationContent appgroupcreationcontent)
	{
		(new CreateAppGroupDialog(fragmentwrapper)).show(((Object) (appgroupcreationcontent)));
	//    0    0:new             #2   <Class CreateAppGroupDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #51  <Method void CreateAppGroupDialog(FragmentWrapper)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #66  <Method void show(Object)>
	//    6   12:return          
	}

	protected AppCall createBaseAppCall()
	{
		return new AppCall(getRequestCode());
	//    0    0:new             #75  <Class AppCall>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #78  <Method int getRequestCode()>
	//    4    8:invokespecial   #81  <Method void AppCall(int)>
	//    5   11:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #85  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new WebHandler())));
	//    4    8:aload_1         
	//    5    9:new             #14  <Class CreateAppGroupDialog$WebHandler>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:invokespecial   #90  <Method void CreateAppGroupDialog$WebHandler(CreateAppGroupDialog, CreateAppGroupDialog$1)>
	//   10   18:invokevirtual   #94  <Method boolean ArrayList.add(Object)>
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
					callback.onSuccess(((Object) (new Result(bundle.getString("id")))));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field FacebookCallback val$callback>
				//    2    4:new             #27  <Class CreateAppGroupDialog$Result>
				//    3    7:dup             
				//    4    8:aload_2         
				//    5    9:ldc1            #29  <String "id">
				//    6   11:invokevirtual   #35  <Method String Bundle.getString(String)>
				//    7   14:aconst_null     
				//    8   15:invokespecial   #38  <Method void CreateAppGroupDialog$Result(String, CreateAppGroupDialog$1)>
				//    9   18:invokeinterface #43  <Method void FacebookCallback.onSuccess(Object)>
				//   10   23:return          
				}

				final CreateAppGroupDialog this$0;
				final FacebookCallback val$callback;

			
			{
				this$0 = CreateAppGroupDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CreateAppGroupDialog this$0>
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
	//    5    9:new             #7   <Class CreateAppGroupDialog$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aload_2         
	//   10   16:invokespecial   #101 <Method void CreateAppGroupDialog$1(CreateAppGroupDialog, FacebookCallback, FacebookCallback)>
	//   11   19:astore_2        
		final_facebookcallback = ((FacebookCallback) (new com.facebook.internal.CallbackManagerImpl.Callback() {

			public boolean onActivityResult(int i, Intent intent)
			{
				return ShareInternalUtility.handleActivityResult(getRequestCode(), i, intent, resultProcessor);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CreateAppGroupDialog this$0>
			//    2    4:invokevirtual   #31  <Method int CreateAppGroupDialog.getRequestCode()>
			//    3    7:iload_1         
			//    4    8:aload_2         
			//    5    9:aload_0         
			//    6   10:getfield        #21  <Field ResultProcessor val$resultProcessor>
			//    7   13:invokestatic    #37  <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
			//    8   16:ireturn         
			}

			final CreateAppGroupDialog this$0;
			final ResultProcessor val$resultProcessor;

			
			{
				this$0 = CreateAppGroupDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CreateAppGroupDialog this$0>
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
	//   12   20:new             #9   <Class CreateAppGroupDialog$2>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:invokespecial   #104 <Method void CreateAppGroupDialog$2(CreateAppGroupDialog, ResultProcessor)>
	//   17   29:astore_2        
		callbackmanagerimpl.registerCallback(getRequestCode(), ((com.facebook.internal.CallbackManagerImpl.Callback) (final_facebookcallback)));
	//   18   30:aload_1         
	//   19   31:aload_0         
	//   20   32:invokevirtual   #78  <Method int getRequestCode()>
	//   21   35:aload_2         
	//   22   36:invokevirtual   #110 <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
	//   23   39:return          
	}

	private static final int DEFAULT_REQUEST_CODE;
	private static final String GAME_GROUP_CREATION_DIALOG = "game_group_create";

	static 
	{
		DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.AppGroupCreate.toRequestCode();
	//    0    0:getstatic       #30  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.AppGroupCreate>
	//    1    3:invokevirtual   #34  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:putstatic       #36  <Field int DEFAULT_REQUEST_CODE>
	//*   3    9:return          
	}
}
