// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.*;
import android.support.v4.app.*;
import android.text.Html;
import android.view.*;
import android.widget.*;
import com.facebook.*;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.Validate;
import com.facebook.share.model.*;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.concurrent.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			WebDialogParameters

public class DeviceShareDialogFragment extends DialogFragment
	implements TraceFieldInterface
{
	private static class RequestState
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public long getExpiresIn()
		{
			return expiresIn;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field long expiresIn>
		//    2    4:lreturn         
		}

		public String getUserCode()
		{
			return userCode;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field String userCode>
		//    2    4:areturn         
		}

		public void setExpiresIn(long l)
		{
			expiresIn = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #42  <Field long expiresIn>
		//    3    5:return          
		}

		public void setUserCode(String s)
		{
			userCode = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field String userCode>
		//    3    5:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeString(userCode);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #36  <Field String userCode>
		//    3    5:invokevirtual   #55  <Method void Parcel.writeString(String)>
			parcel.writeLong(expiresIn);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #42  <Field long expiresIn>
		//    7   13:invokevirtual   #58  <Method void Parcel.writeLong(long)>
		//    8   16:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public RequestState createFromParcel(Parcel parcel)
			{
				return new RequestState(parcel);
			//    0    0:new             #9   <Class DeviceShareDialogFragment$RequestState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void DeviceShareDialogFragment$RequestState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method DeviceShareDialogFragment$RequestState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public RequestState[] newArray(int i)
			{
				return new RequestState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       RequestState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method DeviceShareDialogFragment$RequestState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		private long expiresIn;
		private String userCode;

		static 
		{
		//    0    0:new             #11  <Class DeviceShareDialogFragment$RequestState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void DeviceShareDialogFragment$RequestState$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		RequestState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:return          
		}

		protected RequestState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			userCode = parcel.readString();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #34  <Method String Parcel.readString()>
		//    5    9:putfield        #36  <Field String userCode>
			expiresIn = parcel.readLong();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #40  <Method long Parcel.readLong()>
		//    9   17:putfield        #42  <Field long expiresIn>
		//   10   20:return          
		}
	}


	public DeviceShareDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void DialogFragment()>
	//    2    4:return          
	}

	private void detach()
	{
		if(isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #60  <Method boolean isAdded()>
	//*   2    4:ifeq            22
			getFragmentManager().beginTransaction().remove(((android.support.v4.app.Fragment) (this))).commit();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #64  <Method FragmentManager getFragmentManager()>
	//    5   11:invokevirtual   #70  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #76  <Method FragmentTransaction FragmentTransaction.remove(android.support.v4.app.Fragment)>
	//    8   18:invokevirtual   #80  <Method int FragmentTransaction.commit()>
	//    9   21:pop             
	//   10   22:return          
	}

	private void finishActivity(int i, Intent intent)
	{
		if(currentRequestState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field DeviceShareDialogFragment$RequestState currentRequestState>
	//*   2    4:ifnull          17
			DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
	//    3    7:aload_0         
	//    4    8:getfield        #84  <Field DeviceShareDialogFragment$RequestState currentRequestState>
	//    5   11:invokevirtual   #88  <Method String DeviceShareDialogFragment$RequestState.getUserCode()>
	//    6   14:invokestatic    #94  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
		FacebookRequestError facebookrequesterror = (FacebookRequestError)intent.getParcelableExtra("error");
	//    7   17:aload_2         
	//    8   18:ldc1            #96  <String "error">
	//    9   20:invokevirtual   #102 <Method Parcelable Intent.getParcelableExtra(String)>
	//   10   23:checkcast       #104 <Class FacebookRequestError>
	//   11   26:astore_3        
		if(facebookrequesterror != null)
	//*  12   27:aload_3         
	//*  13   28:ifnull          46
			Toast.makeText(getContext(), ((CharSequence) (facebookrequesterror.getErrorMessage())), 0).show();
	//   14   31:aload_0         
	//   15   32:invokevirtual   #108 <Method android.content.Context getContext()>
	//   16   35:aload_3         
	//   17   36:invokevirtual   #111 <Method String FacebookRequestError.getErrorMessage()>
	//   18   39:iconst_0        
	//   19   40:invokestatic    #117 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   20   43:invokevirtual   #120 <Method void Toast.show()>
		if(isAdded())
	//*  21   46:aload_0         
	//*  22   47:invokevirtual   #60  <Method boolean isAdded()>
	//*  23   50:ifeq            68
		{
			FragmentActivity fragmentactivity = getActivity();
	//   24   53:aload_0         
	//   25   54:invokevirtual   #124 <Method FragmentActivity getActivity()>
	//   26   57:astore_3        
			((Activity) (fragmentactivity)).setResult(i, intent);
	//   27   58:aload_3         
	//   28   59:iload_1         
	//   29   60:aload_2         
	//   30   61:invokevirtual   #129 <Method void Activity.setResult(int, Intent)>
			((Activity) (fragmentactivity)).finish();
	//   31   64:aload_3         
	//   32   65:invokevirtual   #132 <Method void Activity.finish()>
		}
	//   33   68:return          
	}

	private void finishActivityWithError(FacebookRequestError facebookrequesterror)
	{
		detach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void detach()>
		Intent intent = new Intent();
	//    2    4:new             #98  <Class Intent>
	//    3    7:dup             
	//    4    8:invokespecial   #135 <Method void Intent()>
	//    5   11:astore_2        
		intent.putExtra("error", ((Parcelable) (facebookrequesterror)));
	//    6   12:aload_2         
	//    7   13:ldc1            #96  <String "error">
	//    8   15:aload_1         
	//    9   16:invokevirtual   #139 <Method Intent Intent.putExtra(String, Parcelable)>
	//   10   19:pop             
		finishActivity(-1, intent);
	//   11   20:aload_0         
	//   12   21:iconst_m1       
	//   13   22:aload_2         
	//   14   23:invokespecial   #141 <Method void finishActivity(int, Intent)>
	//   15   26:return          
	}

	private static ScheduledThreadPoolExecutor getBackgroundExecutor()
	{
		com/facebook/share/internal/DeviceShareDialogFragment;
	//    0    0:ldc1            #2   <Class DeviceShareDialogFragment>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		ScheduledThreadPoolExecutor scheduledthreadpoolexecutor;
		if(backgroundExecutor == null)
	//*   2    3:getstatic       #145 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//*   3    6:ifnonnull       20
			backgroundExecutor = new ScheduledThreadPoolExecutor(1);
	//    4    9:new             #147 <Class ScheduledThreadPoolExecutor>
	//    5   12:dup             
	//    6   13:iconst_1        
	//    7   14:invokespecial   #150 <Method void ScheduledThreadPoolExecutor(int)>
	//    8   17:putstatic       #145 <Field ScheduledThreadPoolExecutor backgroundExecutor>
		scheduledthreadpoolexecutor = backgroundExecutor;
	//    9   20:getstatic       #145 <Field ScheduledThreadPoolExecutor backgroundExecutor>
	//   10   23:astore_0        
		com/facebook/share/internal/DeviceShareDialogFragment;
	//   11   24:ldc1            #2   <Class DeviceShareDialogFragment>
		JVM INSTR monitorexit ;
	//   12   26:monitorexit     
		return scheduledthreadpoolexecutor;
	//   13   27:aload_0         
	//   14   28:areturn         
		Exception exception;
		exception;
	//   15   29:astore_0        
	//*  16   30:ldc1            #2   <Class DeviceShareDialogFragment>
		throw exception;
	//   17   32:monitorexit     
	//   18   33:aload_0         
	//   19   34:athrow          
	}

	private Bundle getGraphParametersForShareContent()
	{
		ShareContent sharecontent = shareContent;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field ShareContent shareContent>
	//    2    4:astore_1        
		if(sharecontent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(sharecontent instanceof ShareLinkContent)
	//*   7   11:aload_1         
	//*   8   12:instanceof      #156 <Class ShareLinkContent>
	//*   9   15:ifeq            26
			return WebDialogParameters.create((ShareLinkContent)sharecontent);
	//   10   18:aload_1         
	//   11   19:checkcast       #156 <Class ShareLinkContent>
	//   12   22:invokestatic    #162 <Method Bundle WebDialogParameters.create(ShareLinkContent)>
	//   13   25:areturn         
		if(sharecontent instanceof ShareOpenGraphContent)
	//*  14   26:aload_1         
	//*  15   27:instanceof      #164 <Class ShareOpenGraphContent>
	//*  16   30:ifeq            41
			return WebDialogParameters.create((ShareOpenGraphContent)sharecontent);
	//   17   33:aload_1         
	//   18   34:checkcast       #164 <Class ShareOpenGraphContent>
	//   19   37:invokestatic    #167 <Method Bundle WebDialogParameters.create(ShareOpenGraphContent)>
	//   20   40:areturn         
		else
			return null;
	//   21   41:aconst_null     
	//   22   42:areturn         
	}

	private void setCurrentRequestState(RequestState requeststate)
	{
		currentRequestState = requeststate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field DeviceShareDialogFragment$RequestState currentRequestState>
		confirmationCode.setText(((CharSequence) (requeststate.getUserCode())));
	//    3    5:aload_0         
	//    4    6:getfield        #169 <Field TextView confirmationCode>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #88  <Method String DeviceShareDialogFragment$RequestState.getUserCode()>
	//    7   13:invokevirtual   #175 <Method void TextView.setText(CharSequence)>
		confirmationCode.setVisibility(0);
	//    8   16:aload_0         
	//    9   17:getfield        #169 <Field TextView confirmationCode>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #178 <Method void TextView.setVisibility(int)>
		progressBar.setVisibility(8);
	//   12   24:aload_0         
	//   13   25:getfield        #180 <Field ProgressBar progressBar>
	//   14   28:bipush          8
	//   15   30:invokevirtual   #183 <Method void ProgressBar.setVisibility(int)>
		codeExpiredFuture = getBackgroundExecutor().schedule(new Runnable() {

			public void run()
			{
				dialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceShareDialogFragment this$0>
			//    2    4:invokestatic    #26  <Method Dialog DeviceShareDialogFragment.access$000(DeviceShareDialogFragment)>
			//    3    7:invokevirtual   #31  <Method void Dialog.dismiss()>
			//    4   10:return          
			}

			final DeviceShareDialogFragment this$0;

			
			{
				this$0 = DeviceShareDialogFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceShareDialogFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, requeststate.getExpiresIn(), TimeUnit.SECONDS);
	//   16   33:aload_0         
	//   17   34:invokestatic    #185 <Method ScheduledThreadPoolExecutor getBackgroundExecutor()>
	//   18   37:new             #12  <Class DeviceShareDialogFragment$3>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:invokespecial   #188 <Method void DeviceShareDialogFragment$3(DeviceShareDialogFragment)>
	//   22   45:aload_1         
	//   23   46:invokevirtual   #192 <Method long DeviceShareDialogFragment$RequestState.getExpiresIn()>
	//   24   49:getstatic       #198 <Field TimeUnit TimeUnit.SECONDS>
	//   25   52:invokevirtual   #202 <Method ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
	//   26   55:putfield        #204 <Field ScheduledFuture codeExpiredFuture>
	//   27   58:return          
	}

	private void startShare()
	{
		Bundle bundle = getGraphParametersForShareContent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method Bundle getGraphParametersForShareContent()>
	//    2    4:astore_1        
		if(bundle == null || bundle.size() == 0)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #212 <Method int Bundle.size()>
	//*   7   13:ifne            32
			finishActivityWithError(new FacebookRequestError(0, "", "Failed to get share content"));
	//    8   16:aload_0         
	//    9   17:new             #104 <Class FacebookRequestError>
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:ldc1            #214 <String "">
	//   13   24:ldc1            #216 <String "Failed to get share content">
	//   14   26:invokespecial   #219 <Method void FacebookRequestError(int, String, String)>
	//   15   29:invokespecial   #49  <Method void finishActivityWithError(FacebookRequestError)>
		StringBuilder stringbuilder = new StringBuilder();
	//   16   32:new             #221 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #222 <Method void StringBuilder()>
	//   19   39:astore_2        
		stringbuilder.append(Validate.hasAppID());
	//   20   40:aload_2         
	//   21   41:invokestatic    #227 <Method String Validate.hasAppID()>
	//   22   44:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append("|");
	//   24   48:aload_2         
	//   25   49:ldc1            #233 <String "|">
	//   26   51:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		stringbuilder.append(Validate.hasClientToken());
	//   28   55:aload_2         
	//   29   56:invokestatic    #236 <Method String Validate.hasClientToken()>
	//   30   59:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		bundle.putString("access_token", stringbuilder.toString());
	//   32   63:aload_1         
	//   33   64:ldc1            #238 <String "access_token">
	//   34   66:aload_2         
	//   35   67:invokevirtual   #241 <Method String StringBuilder.toString()>
	//   36   70:invokevirtual   #245 <Method void Bundle.putString(String, String)>
		bundle.putString("device_info", DeviceRequestsHelper.getDeviceInfo());
	//   37   73:aload_1         
	//   38   74:ldc1            #247 <String "device_info">
	//   39   76:invokestatic    #250 <Method String DeviceRequestsHelper.getDeviceInfo()>
	//   40   79:invokevirtual   #245 <Method void Bundle.putString(String, String)>
		(new GraphRequest(((com.facebook.AccessToken) (null)), "device/share", bundle, HttpMethod.POST, new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				Object obj = ((Object) (graphresponse.getError()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #30  <Method FacebookRequestError GraphResponse.getError()>
			//    2    4:astore_2        
				if(obj != null)
			//*   3    5:aload_2         
			//*   4    6:ifnull          18
				{
					finishActivityWithError(((FacebookRequestError) (obj)));
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field DeviceShareDialogFragment this$0>
			//    7   13:aload_2         
			//    8   14:invokestatic    #34  <Method void DeviceShareDialogFragment.access$100(DeviceShareDialogFragment, FacebookRequestError)>
					return;
			//    9   17:return          
				}
				graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
			//   10   18:aload_1         
			//   11   19:invokevirtual   #38  <Method JSONObject GraphResponse.getJSONObject()>
			//   12   22:astore_1        
				obj = ((Object) (new RequestState()));
			//   13   23:new             #40  <Class DeviceShareDialogFragment$RequestState>
			//   14   26:dup             
			//   15   27:invokespecial   #41  <Method void DeviceShareDialogFragment$RequestState()>
			//   16   30:astore_2        
				try
				{
					((RequestState) (obj)).setUserCode(((JSONObject) (graphresponse)).getString("user_code"));
			//   17   31:aload_2         
			//   18   32:aload_1         
			//   19   33:ldc1            #43  <String "user_code">
			//   20   35:invokevirtual   #49  <Method String JSONObject.getString(String)>
			//   21   38:invokevirtual   #53  <Method void DeviceShareDialogFragment$RequestState.setUserCode(String)>
					((RequestState) (obj)).setExpiresIn(((JSONObject) (graphresponse)).getLong("expires_in"));
			//   22   41:aload_2         
			//   23   42:aload_1         
			//   24   43:ldc1            #55  <String "expires_in">
			//   25   45:invokevirtual   #59  <Method long JSONObject.getLong(String)>
			//   26   48:invokevirtual   #63  <Method void DeviceShareDialogFragment$RequestState.setExpiresIn(long)>
				}
			//*  27   51:aload_0         
			//*  28   52:getfield        #17  <Field DeviceShareDialogFragment this$0>
			//*  29   55:aload_2         
			//*  30   56:invokestatic    #67  <Method void DeviceShareDialogFragment.access$200(DeviceShareDialogFragment, DeviceShareDialogFragment$RequestState)>
			//*  31   59:return          
			//*  32   60:aload_0         
			//*  33   61:getfield        #17  <Field DeviceShareDialogFragment this$0>
			//*  34   64:new             #69  <Class FacebookRequestError>
			//*  35   67:dup             
			//*  36   68:iconst_0        
			//*  37   69:ldc1            #71  <String "">
			//*  38   71:ldc1            #73  <String "Malformed server response">
			//*  39   73:invokespecial   #76  <Method void FacebookRequestError(int, String, String)>
			//*  40   76:invokestatic    #34  <Method void DeviceShareDialogFragment.access$100(DeviceShareDialogFragment, FacebookRequestError)>
			//*  41   79:return          
				// Misplaced declaration of an exception variable
				catch(GraphResponse graphresponse)
				{
					finishActivityWithError(new FacebookRequestError(0, "", "Malformed server response"));
					return;
				}
				setCurrentRequestState(((RequestState) (obj)));
			//*  42   80:astore_1        
			//*  43   81:goto            60
			}

			final DeviceShareDialogFragment this$0;

			
			{
				this$0 = DeviceShareDialogFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceShareDialogFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
)).executeAsync();
	//   41   82:new             #252 <Class GraphRequest>
	//   42   85:dup             
	//   43   86:aconst_null     
	//   44   87:ldc1            #254 <String "device/share">
	//   45   89:aload_1         
	//   46   90:getstatic       #260 <Field HttpMethod HttpMethod.POST>
	//   47   93:new             #10  <Class DeviceShareDialogFragment$2>
	//   48   96:dup             
	//   49   97:aload_0         
	//   50   98:invokespecial   #261 <Method void DeviceShareDialogFragment$2(DeviceShareDialogFragment)>
	//   51  101:invokespecial   #264 <Method void GraphRequest(com.facebook.AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   52  104:invokevirtual   #268 <Method com.facebook.GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   53  107:pop             
	//   54  108:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		dialog = new Dialog(((android.content.Context) (getActivity())), com.facebook.common.R.style.com_facebook_auth_dialog);
	//    0    0:aload_0         
	//    1    1:new             #273 <Class Dialog>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #124 <Method FragmentActivity getActivity()>
	//    5    9:getstatic       #279 <Field int com.facebook.common.R$style.com_facebook_auth_dialog>
	//    6   12:invokespecial   #282 <Method void Dialog(android.content.Context, int)>
	//    7   15:putfield        #43  <Field Dialog dialog>
		bundle = ((Bundle) (getActivity().getLayoutInflater().inflate(com.facebook.common.R.layout.com_facebook_device_auth_dialog_fragment, ((ViewGroup) (null)))));
	//    8   18:aload_0         
	//    9   19:invokevirtual   #124 <Method FragmentActivity getActivity()>
	//   10   22:invokevirtual   #288 <Method LayoutInflater FragmentActivity.getLayoutInflater()>
	//   11   25:getstatic       #293 <Field int com.facebook.common.R$layout.com_facebook_device_auth_dialog_fragment>
	//   12   28:aconst_null     
	//   13   29:invokevirtual   #299 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   14   32:astore_1        
		progressBar = (ProgressBar)((View) (bundle)).findViewById(com.facebook.common.R.id.progress_bar);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:getstatic       #304 <Field int com.facebook.common.R$id.progress_bar>
	//   18   38:invokevirtual   #310 <Method View View.findViewById(int)>
	//   19   41:checkcast       #182 <Class ProgressBar>
	//   20   44:putfield        #180 <Field ProgressBar progressBar>
		confirmationCode = (TextView)((View) (bundle)).findViewById(com.facebook.common.R.id.confirmation_code);
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:getstatic       #313 <Field int com.facebook.common.R$id.confirmation_code>
	//   24   52:invokevirtual   #310 <Method View View.findViewById(int)>
	//   25   55:checkcast       #171 <Class TextView>
	//   26   58:putfield        #169 <Field TextView confirmationCode>
		Button button = (Button)((View) (bundle)).findViewById(com.facebook.common.R.id.cancel_button);
	//   27   61:aload_1         
	//   28   62:getstatic       #316 <Field int com.facebook.common.R$id.cancel_button>
	//   29   65:invokevirtual   #310 <Method View View.findViewById(int)>
	//   30   68:checkcast       #318 <Class Button>
	//   31   71:astore_2        
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				dialog.dismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceShareDialogFragment this$0>
			//    2    4:invokestatic    #27  <Method Dialog DeviceShareDialogFragment.access$000(DeviceShareDialogFragment)>
			//    3    7:invokevirtual   #32  <Method void Dialog.dismiss()>
			//    4   10:return          
			}

			final DeviceShareDialogFragment this$0;

			
			{
				this$0 = DeviceShareDialogFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceShareDialogFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   32   72:new             #8   <Class DeviceShareDialogFragment$1>
	//   33   75:dup             
	//   34   76:aload_0         
	//   35   77:invokespecial   #319 <Method void DeviceShareDialogFragment$1(DeviceShareDialogFragment)>
	//   36   80:astore_3        
		if(!(button instanceof View))
	//*  37   81:aload_2         
	//*  38   82:instanceof      #306 <Class View>
	//*  39   85:ifne            96
			button.setOnClickListener(onclicklistener);
	//   40   88:aload_2         
	//   41   89:aload_3         
	//   42   90:invokevirtual   #323 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  43   93:goto            104
			ViewInstrumentation.setOnClickListener((View)button, onclicklistener);
	//   44   96:aload_2         
	//   45   97:checkcast       #306 <Class View>
	//   46  100:aload_3         
	//   47  101:invokestatic    #328 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		((TextView)((View) (bundle)).findViewById(com.facebook.common.R.id.com_facebook_device_auth_instructions)).setText(((CharSequence) (Html.fromHtml(getString(com.facebook.common.R.string.com_facebook_device_auth_instructions)))));
	//   48  104:aload_1         
	//   49  105:getstatic       #331 <Field int com.facebook.common.R$id.com_facebook_device_auth_instructions>
	//   50  108:invokevirtual   #310 <Method View View.findViewById(int)>
	//   51  111:checkcast       #171 <Class TextView>
	//   52  114:aload_0         
	//   53  115:getstatic       #334 <Field int com.facebook.common.R$string.com_facebook_device_auth_instructions>
	//   54  118:invokevirtual   #338 <Method String getString(int)>
	//   55  121:invokestatic    #344 <Method android.text.Spanned Html.fromHtml(String)>
	//   56  124:invokevirtual   #175 <Method void TextView.setText(CharSequence)>
		dialog.setContentView(((View) (bundle)));
	//   57  127:aload_0         
	//   58  128:getfield        #43  <Field Dialog dialog>
	//   59  131:aload_1         
	//   60  132:invokevirtual   #348 <Method void Dialog.setContentView(View)>
		startShare();
	//   61  135:aload_0         
	//   62  136:invokespecial   #350 <Method void startShare()>
		return dialog;
	//   63  139:aload_0         
	//   64  140:getfield        #43  <Field Dialog dialog>
	//   65  143:areturn         
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		TraceMachine.enterMethod(_nr_trace, "DeviceShareDialogFragment#onCreateView", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #358 <Field Trace _nr_trace>
	//    2    4:ldc2            #360 <String "DeviceShareDialogFragment#onCreateView">
	//    3    7:aconst_null     
	//    4    8:invokestatic    #366 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   11:goto            22
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "DeviceShareDialogFragment#onCreateView", ((java.util.ArrayList) (null)));
	//    6   14:aconst_null     
	//    7   15:ldc2            #360 <String "DeviceShareDialogFragment#onCreateView">
	//    8   18:aconst_null     
	//    9   19:invokestatic    #366 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		layoutinflater = ((LayoutInflater) (super.onCreateView(layoutinflater, viewgroup, bundle)));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokespecial   #368 <Method View DialogFragment.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   15   29:astore_1        
		if(bundle != null)
	//*  16   30:aload_3         
	//*  17   31:ifnull          54
		{
			viewgroup = ((ViewGroup) ((RequestState)bundle.getParcelable("request_state")));
	//   18   34:aload_3         
	//   19   35:ldc2            #370 <String "request_state">
	//   20   38:invokevirtual   #373 <Method Parcelable Bundle.getParcelable(String)>
	//   21   41:checkcast       #14  <Class DeviceShareDialogFragment$RequestState>
	//   22   44:astore_2        
			if(viewgroup != null)
	//*  23   45:aload_2         
	//*  24   46:ifnull          54
				setCurrentRequestState(((RequestState) (viewgroup)));
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:invokespecial   #55  <Method void setCurrentRequestState(DeviceShareDialogFragment$RequestState)>
		}
		TraceMachine.exitMethod();
	//   28   54:invokestatic    #376 <Method void TraceMachine.exitMethod()>
		return ((View) (layoutinflater));
	//   29   57:aload_1         
	//   30   58:areturn         
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   31   59:astore          4
		if(true) goto _L3; else goto _L2
	//   32   61:goto            14
_L2:
	}

	public void onDismiss(DialogInterface dialoginterface)
	{
		super.onDismiss(dialoginterface);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #380 <Method void DialogFragment.onDismiss(DialogInterface)>
		if(codeExpiredFuture != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #204 <Field ScheduledFuture codeExpiredFuture>
	//*   5    9:ifnull          23
			codeExpiredFuture.cancel(true);
	//    6   12:aload_0         
	//    7   13:getfield        #204 <Field ScheduledFuture codeExpiredFuture>
	//    8   16:iconst_1        
	//    9   17:invokeinterface #386 <Method boolean ScheduledFuture.cancel(boolean)>
	//   10   22:pop             
		finishActivity(-1, new Intent());
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:new             #98  <Class Intent>
	//   14   28:dup             
	//   15   29:invokespecial   #135 <Method void Intent()>
	//   16   32:invokespecial   #141 <Method void finishActivity(int, Intent)>
	//   17   35:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #390 <Method void DialogFragment.onSaveInstanceState(Bundle)>
		if(currentRequestState != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #84  <Field DeviceShareDialogFragment$RequestState currentRequestState>
	//*   5    9:ifnull          23
			bundle.putParcelable("request_state", ((Parcelable) (currentRequestState)));
	//    6   12:aload_1         
	//    7   13:ldc2            #370 <String "request_state">
	//    8   16:aload_0         
	//    9   17:getfield        #84  <Field DeviceShareDialogFragment$RequestState currentRequestState>
	//   10   20:invokevirtual   #394 <Method void Bundle.putParcelable(String, Parcelable)>
	//   11   23:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #397 <Method void DialogFragment.onStart()>
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    2    4:invokestatic    #403 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #407 <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #410 <Method void DialogFragment.onStop()>
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    2    4:invokestatic    #403 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #413 <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
	//    5   11:return          
	}

	public void setShareContent(ShareContent sharecontent)
	{
		shareContent = sharecontent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field ShareContent shareContent>
	//    3    5:return          
	}

	private static ScheduledThreadPoolExecutor backgroundExecutor;
	public Trace _nr_trace;
	private volatile ScheduledFuture codeExpiredFuture;
	private TextView confirmationCode;
	private volatile RequestState currentRequestState;
	private Dialog dialog;
	private ProgressBar progressBar;
	private ShareContent shareContent;


/*
	static Dialog access$000(DeviceShareDialogFragment devicesharedialogfragment)
	{
		return devicesharedialogfragment.dialog;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Dialog dialog>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(DeviceShareDialogFragment devicesharedialogfragment, FacebookRequestError facebookrequesterror)
	{
		devicesharedialogfragment.finishActivityWithError(facebookrequesterror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void finishActivityWithError(FacebookRequestError)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$200(DeviceShareDialogFragment devicesharedialogfragment, RequestState requeststate)
	{
		devicesharedialogfragment.setCurrentRequestState(requeststate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void setCurrentRequestState(DeviceShareDialogFragment$RequestState)>
		return;
	//    3    5:return          
	}

*/
}
