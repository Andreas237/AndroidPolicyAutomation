// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.facebook.FacebookActivity;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.List;

public class DeviceShareDialog extends FacebookDialogBase
{
	public static class Result
	{

		public Result()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public DeviceShareDialog(Activity activity)
	{
		super(activity, DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #26  <Field int DEFAULT_REQUEST_CODE>
	//    3    5:invokespecial   #32  <Method void FacebookDialogBase(Activity, int)>
	//    4    8:return          
	}

	public DeviceShareDialog(Fragment fragment)
	{
		super(new FragmentWrapper(fragment), DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:new             #35  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #37  <Method void FragmentWrapper(Fragment)>
	//    5    9:getstatic       #26  <Field int DEFAULT_REQUEST_CODE>
	//    6   12:invokespecial   #40  <Method void FacebookDialogBase(FragmentWrapper, int)>
	//    7   15:return          
	}

	public DeviceShareDialog(android.support.v4.app.Fragment fragment)
	{
		super(new FragmentWrapper(fragment), DEFAULT_REQUEST_CODE);
	//    0    0:aload_0         
	//    1    1:new             #35  <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #43  <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:getstatic       #26  <Field int DEFAULT_REQUEST_CODE>
	//    6   12:invokespecial   #40  <Method void FacebookDialogBase(FragmentWrapper, int)>
	//    7   15:return          
	}

	protected boolean canShowImpl(ShareContent sharecontent, Object obj)
	{
		return (sharecontent instanceof ShareLinkContent) || (sharecontent instanceof ShareOpenGraphContent);
	//    0    0:aload_1         
	//    1    1:instanceof      #47  <Class ShareLinkContent>
	//    2    4:ifne            19
	//    3    7:aload_1         
	//    4    8:instanceof      #49  <Class ShareOpenGraphContent>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	protected volatile boolean canShowImpl(Object obj, Object obj1)
	{
		return canShowImpl((ShareContent)obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #52  <Class ShareContent>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #54  <Method boolean canShowImpl(ShareContent, Object)>
	//    5    9:ireturn         
	}

	protected AppCall createBaseAppCall()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected List getOrderedModeHandlers()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, final FacebookCallback callback)
	{
		callbackmanagerimpl.registerCallback(getRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

			public boolean onActivityResult(int i, Intent intent)
			{
				if(intent.hasExtra("error"))
			//*   0    0:aload_2         
			//*   1    1:ldc1            #29  <String "error">
			//*   2    3:invokevirtual   #35  <Method boolean Intent.hasExtra(String)>
			//*   3    6:ifeq            34
				{
					intent = ((Intent) ((FacebookRequestError)intent.getParcelableExtra("error")));
			//    4    9:aload_2         
			//    5   10:ldc1            #29  <String "error">
			//    6   12:invokevirtual   #39  <Method android.os.Parcelable Intent.getParcelableExtra(String)>
			//    7   15:checkcast       #41  <Class FacebookRequestError>
			//    8   18:astore_2        
					callback.onError(((FacebookRequestError) (intent)).getException());
			//    9   19:aload_0         
			//   10   20:getfield        #21  <Field FacebookCallback val$callback>
			//   11   23:aload_2         
			//   12   24:invokevirtual   #45  <Method FacebookException FacebookRequestError.getException()>
			//   13   27:invokeinterface #51  <Method void FacebookCallback.onError(FacebookException)>
					return true;
			//   14   32:iconst_1        
			//   15   33:ireturn         
				} else
				{
					callback.onSuccess(((Object) (new Result())));
			//   16   34:aload_0         
			//   17   35:getfield        #21  <Field FacebookCallback val$callback>
			//   18   38:new             #53  <Class DeviceShareDialog$Result>
			//   19   41:dup             
			//   20   42:invokespecial   #54  <Method void DeviceShareDialog$Result()>
			//   21   45:invokeinterface #58  <Method void FacebookCallback.onSuccess(Object)>
					return true;
			//   22   50:iconst_1        
			//   23   51:ireturn         
				}
			}

			final DeviceShareDialog this$0;
			final FacebookCallback val$callback;

			
			{
				this$0 = DeviceShareDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DeviceShareDialog this$0>
				callback = facebookcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FacebookCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #65  <Method int getRequestCode()>
	//    3    5:new             #7   <Class DeviceShareDialog$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #68  <Method void DeviceShareDialog$1(DeviceShareDialog, FacebookCallback)>
	//    8   14:invokevirtual   #74  <Method void CallbackManagerImpl.registerCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
	//    9   17:return          
	}

	protected void showImpl(ShareContent sharecontent, Object obj)
	{
		if(sharecontent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          103
		{
			if(!(sharecontent instanceof ShareLinkContent) && !(sharecontent instanceof ShareOpenGraphContent))
	//*   2    4:aload_1         
	//*   3    5:instanceof      #47  <Class ShareLinkContent>
	//*   4    8:ifne            60
	//*   5   11:aload_1         
	//*   6   12:instanceof      #49  <Class ShareOpenGraphContent>
	//*   7   15:ifeq            21
	//*   8   18:goto            60
			{
				sharecontent = ((ShareContent) (new StringBuilder()));
	//    9   21:new             #79  <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #81  <Method void StringBuilder()>
	//   12   28:astore_1        
				((StringBuilder) (sharecontent)).append(((Object)this).getClass().getSimpleName());
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:invokevirtual   #87  <Method Class Object.getClass()>
	//   16   34:invokevirtual   #93  <Method String Class.getSimpleName()>
	//   17   37:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
				((StringBuilder) (sharecontent)).append(" only supports ShareLinkContent or ShareOpenGraphContent");
	//   19   41:aload_1         
	//   20   42:ldc1            #99  <String " only supports ShareLinkContent or ShareOpenGraphContent">
	//   21   44:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:pop             
				throw new FacebookException(((StringBuilder) (sharecontent)).toString());
	//   23   48:new             #101 <Class FacebookException>
	//   24   51:dup             
	//   25   52:aload_1         
	//   26   53:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   27   56:invokespecial   #107 <Method void FacebookException(String)>
	//   28   59:athrow          
			} else
			{
				obj = ((Object) (new Intent()));
	//   29   60:new             #109 <Class Intent>
	//   30   63:dup             
	//   31   64:invokespecial   #110 <Method void Intent()>
	//   32   67:astore_2        
				((Intent) (obj)).setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//   33   68:aload_2         
	//   34   69:invokestatic    #116 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   35   72:ldc1            #118 <Class FacebookActivity>
	//   36   74:invokevirtual   #122 <Method Intent Intent.setClass(android.content.Context, Class)>
	//   37   77:pop             
				((Intent) (obj)).setAction("DeviceShareDialogFragment");
	//   38   78:aload_2         
	//   39   79:ldc1            #124 <String "DeviceShareDialogFragment">
	//   40   81:invokevirtual   #128 <Method Intent Intent.setAction(String)>
	//   41   84:pop             
				((Intent) (obj)).putExtra("content", ((android.os.Parcelable) (sharecontent)));
	//   42   85:aload_2         
	//   43   86:ldc1            #130 <String "content">
	//   44   88:aload_1         
	//   45   89:invokevirtual   #134 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   46   92:pop             
				startActivityForResult(((Intent) (obj)), getRequestCode());
	//   47   93:aload_0         
	//   48   94:aload_2         
	//   49   95:aload_0         
	//   50   96:invokevirtual   #65  <Method int getRequestCode()>
	//   51   99:invokevirtual   #138 <Method void startActivityForResult(Intent, int)>
				return;
	//   52  102:return          
			}
		} else
		{
			throw new FacebookException("Must provide non-null content to share");
	//   53  103:new             #101 <Class FacebookException>
	//   54  106:dup             
	//   55  107:ldc1            #140 <String "Must provide non-null content to share">
	//   56  109:invokespecial   #107 <Method void FacebookException(String)>
	//   57  112:athrow          
		}
	}

	protected volatile void showImpl(Object obj, Object obj1)
	{
		showImpl((ShareContent)obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #52  <Class ShareContent>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #143 <Method void showImpl(ShareContent, Object)>
	//    5    9:return          
	}

	private static final int DEFAULT_REQUEST_CODE;

	static 
	{
		DEFAULT_REQUEST_CODE = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.DeviceShare.toRequestCode();
	//    0    0:getstatic       #20  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.DeviceShare>
	//    1    3:invokevirtual   #24  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//    2    6:putstatic       #26  <Field int DEFAULT_REQUEST_CODE>
	//*   3    9:return          
	}
}
