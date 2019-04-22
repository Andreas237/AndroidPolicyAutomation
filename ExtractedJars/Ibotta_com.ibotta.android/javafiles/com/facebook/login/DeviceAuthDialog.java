// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.*;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.*;
import android.widget.*;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.*;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			DeviceAuthMethodHandler, LoginFragment, LoginClient

public class DeviceAuthDialog extends DialogFragment
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

		public String getAuthorizationUri()
		{
			return authorizationUri;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field String authorizationUri>
		//    2    4:areturn         
		}

		public long getInterval()
		{
			return interval;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field long interval>
		//    2    4:lreturn         
		}

		public String getRequestCode()
		{
			return requestCode;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field String requestCode>
		//    2    4:areturn         
		}

		public String getUserCode()
		{
			return userCode;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String userCode>
		//    2    4:areturn         
		}

		public void setInterval(long l)
		{
			interval = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #47  <Field long interval>
		//    3    5:return          
		}

		public void setLastPoll(long l)
		{
			lastPoll = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #49  <Field long lastPoll>
		//    3    5:return          
		}

		public void setRequestCode(String s)
		{
			requestCode = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field String requestCode>
		//    3    5:return          
		}

		public void setUserCode(String s)
		{
			userCode = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field String userCode>
			authorizationUri = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[] {
				s
			});
		//    3    5:aload_0         
		//    4    6:getstatic       #69  <Field Locale Locale.ENGLISH>
		//    5    9:ldc1            #71  <String "https://facebook.com/device?user_code=%1$s&qr=1">
		//    6   11:iconst_1        
		//    7   12:anewarray       Object[]
		//    8   15:dup             
		//    9   16:iconst_0        
		//   10   17:aload_1         
		//   11   18:aastore         
		//   12   19:invokestatic    #77  <Method String String.format(Locale, String, Object[])>
		//   13   22:putfield        #54  <Field String authorizationUri>
		//   14   25:return          
		}

		public boolean withinLastRefreshWindow()
		{
			long l = lastPoll;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field long lastPoll>
		//    2    4:lstore_1        
			boolean flag = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			if(l == 0L)
		//*   5    7:lload_1         
		//*   6    8:lconst_0        
		//*   7    9:lcmp            
		//*   8   10:ifne            15
				return false;
		//    9   13:iconst_0        
		//   10   14:ireturn         
			if((new Date()).getTime() - lastPoll - interval * 1000L < 0L)
		//*  11   15:new             #81  <Class Date>
		//*  12   18:dup             
		//*  13   19:invokespecial   #82  <Method void Date()>
		//*  14   22:invokevirtual   #85  <Method long Date.getTime()>
		//*  15   25:aload_0         
		//*  16   26:getfield        #49  <Field long lastPoll>
		//*  17   29:lsub            
		//*  18   30:aload_0         
		//*  19   31:getfield        #47  <Field long interval>
		//*  20   34:ldc2w           #86  <Long 1000L>
		//*  21   37:lmul            
		//*  22   38:lsub            
		//*  23   39:lconst_0        
		//*  24   40:lcmp            
		//*  25   41:ifge            46
				flag = true;
		//   26   44:iconst_1        
		//   27   45:istore_3        
			return flag;
		//   28   46:iload_3         
		//   29   47:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeString(userCode);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #39  <Field String userCode>
		//    3    5:invokevirtual   #92  <Method void Parcel.writeString(String)>
			parcel.writeString(requestCode);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #41  <Field String requestCode>
		//    7   13:invokevirtual   #92  <Method void Parcel.writeString(String)>
			parcel.writeLong(interval);
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #47  <Field long interval>
		//   11   21:invokevirtual   #95  <Method void Parcel.writeLong(long)>
			parcel.writeLong(lastPoll);
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #49  <Field long lastPoll>
		//   15   29:invokevirtual   #95  <Method void Parcel.writeLong(long)>
		//   16   32:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public RequestState createFromParcel(Parcel parcel)
			{
				return new RequestState(parcel);
			//    0    0:new             #9   <Class DeviceAuthDialog$RequestState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void DeviceAuthDialog$RequestState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method DeviceAuthDialog$RequestState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #30  <Method DeviceAuthDialog$RequestState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		private String authorizationUri;
		private long interval;
		private long lastPoll;
		private String requestCode;
		private String userCode;

		static 
		{
		//    0    0:new             #11  <Class DeviceAuthDialog$RequestState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void DeviceAuthDialog$RequestState$1()>
		//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		RequestState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:return          
		}

		protected RequestState(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			userCode = parcel.readString();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #37  <Method String Parcel.readString()>
		//    5    9:putfield        #39  <Field String userCode>
			requestCode = parcel.readString();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #37  <Method String Parcel.readString()>
		//    9   17:putfield        #41  <Field String requestCode>
			interval = parcel.readLong();
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #45  <Method long Parcel.readLong()>
		//   13   25:putfield        #47  <Field long interval>
			lastPoll = parcel.readLong();
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokevirtual   #45  <Method long Parcel.readLong()>
		//   17   33:putfield        #49  <Field long lastPoll>
		//   18   36:return          
		}
	}


	public DeviceAuthDialog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void DialogFragment()>
		completed = new AtomicBoolean();
	//    2    4:aload_0         
	//    3    5:new             #56  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:invokespecial   #57  <Method void AtomicBoolean()>
	//    6   12:putfield        #59  <Field AtomicBoolean completed>
		isBeingDestroyed = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #61  <Field boolean isBeingDestroyed>
		isRetry = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #63  <Field boolean isRetry>
		mRequest = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #65  <Field LoginClient$Request mRequest>
	//   16   30:return          
	}

	private void completeLogin(String s, com.facebook.internal.Utility.PermissionsPair permissionspair, String s1)
	{
		deviceAuthMethodHandler.onSuccess(s1, FacebookSdk.getApplicationId(), s, ((java.util.Collection) (permissionspair.getGrantedPermissions())), ((java.util.Collection) (permissionspair.getDeclinedPermissions())), AccessTokenSource.DEVICE_AUTH, ((Date) (null)), ((Date) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field DeviceAuthMethodHandler deviceAuthMethodHandler>
	//    2    4:aload_3         
	//    3    5:invokestatic    #140 <Method String FacebookSdk.getApplicationId()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #146 <Method java.util.List com.facebook.internal.Utility$PermissionsPair.getGrantedPermissions()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #149 <Method java.util.List com.facebook.internal.Utility$PermissionsPair.getDeclinedPermissions()>
	//    9   17:getstatic       #155 <Field AccessTokenSource AccessTokenSource.DEVICE_AUTH>
	//   10   20:aconst_null     
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #160 <Method void DeviceAuthMethodHandler.onSuccess(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date)>
		dialog.dismiss();
	//   13   25:aload_0         
	//   14   26:getfield        #132 <Field Dialog dialog>
	//   15   29:invokevirtual   #165 <Method void Dialog.dismiss()>
	//   16   32:return          
	}

	private GraphRequest getPollRequest()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #169 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #170 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("code", currentRequestState.getRequestCode());
	//    4    8:aload_1         
	//    5    9:ldc1            #172 <String "code">
	//    6   11:aload_0         
	//    7   12:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//    8   15:invokevirtual   #175 <Method String DeviceAuthDialog$RequestState.getRequestCode()>
	//    9   18:invokevirtual   #179 <Method void Bundle.putString(String, String)>
		return new GraphRequest(((AccessToken) (null)), "device/login_status", bundle, HttpMethod.POST, new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				if(completed.get())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//*   2    4:invokestatic    #29  <Method AtomicBoolean DeviceAuthDialog.access$500(DeviceAuthDialog)>
			//*   3    7:invokevirtual   #35  <Method boolean AtomicBoolean.get()>
			//*   4   10:ifeq            14
					return;
			//    5   13:return          
				FacebookRequestError facebookrequesterror = graphresponse.getError();
			//    6   14:aload_1         
			//    7   15:invokevirtual   #41  <Method FacebookRequestError GraphResponse.getError()>
			//    8   18:astore_3        
				if(facebookrequesterror != null)
			//*   9   19:aload_3         
			//*  10   20:ifnull          91
				{
					int i = facebookrequesterror.getSubErrorCode();
			//   11   23:aload_3         
			//   12   24:invokevirtual   #47  <Method int FacebookRequestError.getSubErrorCode()>
			//   13   27:istore_2        
					if(i != 0x149620)
			//*  14   28:iload_2         
			//*  15   29:ldc1            #48  <Int 0x149620>
			//*  16   31:icmpeq          83
						switch(i)
			//*  17   34:iload_2         
						{
			//*  18   35:tableswitch     1349172 1349174: default 60
			//			               1349172 75
			//			               1349173 83
			//			               1349174 75
						default:
							onError(graphresponse.getError().getException());
			//   19   60:aload_0         
			//   20   61:getfield        #17  <Field DeviceAuthDialog this$0>
			//   21   64:aload_1         
			//   22   65:invokevirtual   #41  <Method FacebookRequestError GraphResponse.getError()>
			//   23   68:invokevirtual   #52  <Method FacebookException FacebookRequestError.getException()>
			//   24   71:invokestatic    #56  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
							return;
			//   25   74:return          

						case 1349172: 
						case 1349174: 
							schedulePoll();
			//   26   75:aload_0         
			//   27   76:getfield        #17  <Field DeviceAuthDialog this$0>
			//   28   79:invokestatic    #59  <Method void DeviceAuthDialog.access$600(DeviceAuthDialog)>
							return;
			//   29   82:return          

						case 1349173: 
							break;
						}
					onCancel();
			//   30   83:aload_0         
			//   31   84:getfield        #17  <Field DeviceAuthDialog this$0>
			//   32   87:invokestatic    #62  <Method void DeviceAuthDialog.access$300(DeviceAuthDialog)>
					return;
			//   33   90:return          
				}
				try
				{
					graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
			//   34   91:aload_1         
			//   35   92:invokevirtual   #66  <Method JSONObject GraphResponse.getJSONObject()>
			//   36   95:astore_1        
					onSuccess(((JSONObject) (graphresponse)).getString("access_token"));
			//   37   96:aload_0         
			//   38   97:getfield        #17  <Field DeviceAuthDialog this$0>
			//   39  100:aload_1         
			//   40  101:ldc1            #68  <String "access_token">
			//   41  103:invokevirtual   #74  <Method String JSONObject.getString(String)>
			//   42  106:invokestatic    #78  <Method void DeviceAuthDialog.access$700(DeviceAuthDialog, String)>
					return;
			//   43  109:return          
				}
				// Misplaced declaration of an exception variable
				catch(GraphResponse graphresponse)
			//*  44  110:astore_1        
				{
					onError(new FacebookException(((Throwable) (graphresponse))));
			//   45  111:aload_0         
			//   46  112:getfield        #17  <Field DeviceAuthDialog this$0>
			//   47  115:new             #80  <Class FacebookException>
			//   48  118:dup             
			//   49  119:aload_1         
			//   50  120:invokespecial   #83  <Method void FacebookException(Throwable)>
			//   51  123:invokestatic    #56  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
				}
			//   52  126:return          
			}

			final DeviceAuthDialog this$0;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceAuthDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   10   21:new             #181 <Class GraphRequest>
	//   11   24:dup             
	//   12   25:aconst_null     
	//   13   26:ldc1            #183 <String "device/login_status">
	//   14   28:aload_1         
	//   15   29:getstatic       #189 <Field HttpMethod HttpMethod.POST>
	//   16   32:new             #14  <Class DeviceAuthDialog$4>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #191 <Method void DeviceAuthDialog$4(DeviceAuthDialog)>
	//   20   40:invokespecial   #194 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   21   43:areturn         
	}

	private View initializeContentView(boolean flag)
	{
		Object obj = ((Object) (getActivity().getLayoutInflater()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method FragmentActivity getActivity()>
	//    2    4:invokevirtual   #204 <Method LayoutInflater FragmentActivity.getLayoutInflater()>
	//    3    7:astore_2        
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            24
			obj = ((Object) (((LayoutInflater) (obj)).inflate(com.facebook.common.R.layout.com_facebook_smart_device_dialog_fragment, ((ViewGroup) (null)))));
	//    6   12:aload_2         
	//    7   13:getstatic       #210 <Field int com.facebook.common.R$layout.com_facebook_smart_device_dialog_fragment>
	//    8   16:aconst_null     
	//    9   17:invokevirtual   #216 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   10   20:astore_2        
		else
	//*  11   21:goto            33
			obj = ((Object) (((LayoutInflater) (obj)).inflate(com.facebook.common.R.layout.com_facebook_device_auth_dialog_fragment, ((ViewGroup) (null)))));
	//   12   24:aload_2         
	//   13   25:getstatic       #219 <Field int com.facebook.common.R$layout.com_facebook_device_auth_dialog_fragment>
	//   14   28:aconst_null     
	//   15   29:invokevirtual   #216 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   16   32:astore_2        
		progressBar = (ProgressBar)((View) (obj)).findViewById(com.facebook.common.R.id.progress_bar);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:getstatic       #224 <Field int com.facebook.common.R$id.progress_bar>
	//   20   38:invokevirtual   #230 <Method View View.findViewById(int)>
	//   21   41:checkcast       #232 <Class ProgressBar>
	//   22   44:putfield        #234 <Field ProgressBar progressBar>
		confirmationCode = (TextView)((View) (obj)).findViewById(com.facebook.common.R.id.confirmation_code);
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:getstatic       #237 <Field int com.facebook.common.R$id.confirmation_code>
	//   26   52:invokevirtual   #230 <Method View View.findViewById(int)>
	//   27   55:checkcast       #239 <Class TextView>
	//   28   58:putfield        #241 <Field TextView confirmationCode>
		Button button = (Button)((View) (obj)).findViewById(com.facebook.common.R.id.cancel_button);
	//   29   61:aload_2         
	//   30   62:getstatic       #244 <Field int com.facebook.common.R$id.cancel_button>
	//   31   65:invokevirtual   #230 <Method View View.findViewById(int)>
	//   32   68:checkcast       #246 <Class Button>
	//   33   71:astore_3        
		android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				onCancel();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//    2    4:invokestatic    #26  <Method void DeviceAuthDialog.access$300(DeviceAuthDialog)>
			//    3    7:return          
			}

			final DeviceAuthDialog this$0;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceAuthDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   34   72:new             #10  <Class DeviceAuthDialog$2>
	//   35   75:dup             
	//   36   76:aload_0         
	//   37   77:invokespecial   #247 <Method void DeviceAuthDialog$2(DeviceAuthDialog)>
	//   38   80:astore          4
		if(!(button instanceof View))
	//*  39   82:aload_3         
	//*  40   83:instanceof      #226 <Class View>
	//*  41   86:ifne            98
			button.setOnClickListener(onclicklistener);
	//   42   89:aload_3         
	//   43   90:aload           4
	//   44   92:invokevirtual   #251 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  45   95:goto            107
			ViewInstrumentation.setOnClickListener((View)button, onclicklistener);
	//   46   98:aload_3         
	//   47   99:checkcast       #226 <Class View>
	//   48  102:aload           4
	//   49  104:invokestatic    #256 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		instructions = (TextView)((View) (obj)).findViewById(com.facebook.common.R.id.com_facebook_device_auth_instructions);
	//   50  107:aload_0         
	//   51  108:aload_2         
	//   52  109:getstatic       #259 <Field int com.facebook.common.R$id.com_facebook_device_auth_instructions>
	//   53  112:invokevirtual   #230 <Method View View.findViewById(int)>
	//   54  115:checkcast       #239 <Class TextView>
	//   55  118:putfield        #261 <Field TextView instructions>
		instructions.setText(((CharSequence) (Html.fromHtml(getString(com.facebook.common.R.string.com_facebook_device_auth_instructions)))));
	//   56  121:aload_0         
	//   57  122:getfield        #261 <Field TextView instructions>
	//   58  125:aload_0         
	//   59  126:getstatic       #264 <Field int com.facebook.common.R$string.com_facebook_device_auth_instructions>
	//   60  129:invokevirtual   #268 <Method String getString(int)>
	//   61  132:invokestatic    #274 <Method android.text.Spanned Html.fromHtml(String)>
	//   62  135:invokevirtual   #278 <Method void TextView.setText(CharSequence)>
		return ((View) (obj));
	//   63  138:aload_2         
	//   64  139:areturn         
	}

	private void onCancel()
	{
		if(!completed.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AtomicBoolean completed>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #282 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(currentRequestState != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//*   9   17:ifnull          30
			DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
	//   10   20:aload_0         
	//   11   21:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//   12   24:invokevirtual   #285 <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//   13   27:invokestatic    #290 <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
		DeviceAuthMethodHandler deviceauthmethodhandler = deviceAuthMethodHandler;
	//   14   30:aload_0         
	//   15   31:getfield        #134 <Field DeviceAuthMethodHandler deviceAuthMethodHandler>
	//   16   34:astore_1        
		if(deviceauthmethodhandler != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          43
			deviceauthmethodhandler.onCancel();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #291 <Method void DeviceAuthMethodHandler.onCancel()>
		dialog.dismiss();
	//   21   43:aload_0         
	//   22   44:getfield        #132 <Field Dialog dialog>
	//   23   47:invokevirtual   #165 <Method void Dialog.dismiss()>
	//   24   50:return          
	}

	private void onError(FacebookException facebookexception)
	{
		if(!completed.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field AtomicBoolean completed>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #282 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(currentRequestState != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//*   9   17:ifnull          30
			DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
	//   10   20:aload_0         
	//   11   21:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//   12   24:invokevirtual   #285 <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//   13   27:invokestatic    #290 <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
		deviceAuthMethodHandler.onError(((Exception) (facebookexception)));
	//   14   30:aload_0         
	//   15   31:getfield        #134 <Field DeviceAuthMethodHandler deviceAuthMethodHandler>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #294 <Method void DeviceAuthMethodHandler.onError(Exception)>
		dialog.dismiss();
	//   18   38:aload_0         
	//   19   39:getfield        #132 <Field Dialog dialog>
	//   20   42:invokevirtual   #165 <Method void Dialog.dismiss()>
	//   21   45:return          
	}

	private void onSuccess(final String accessToken)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #169 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #170 <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putString("fields", "id,permissions,name");
	//    4    8:aload_2         
	//    5    9:ldc2            #296 <String "fields">
	//    6   12:ldc2            #298 <String "id,permissions,name">
	//    7   15:invokevirtual   #179 <Method void Bundle.putString(String, String)>
		(new GraphRequest(new AccessToken(accessToken, FacebookSdk.getApplicationId(), "0", ((java.util.Collection) (null)), ((java.util.Collection) (null)), ((AccessTokenSource) (null)), ((Date) (null)), ((Date) (null))), "me", bundle, HttpMethod.GET, new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				if(completed.get())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field DeviceAuthDialog this$0>
			//*   2    4:invokestatic    #33  <Method AtomicBoolean DeviceAuthDialog.access$500(DeviceAuthDialog)>
			//*   3    7:invokevirtual   #39  <Method boolean AtomicBoolean.get()>
			//*   4   10:ifeq            14
					return;
			//    5   13:return          
				if(graphresponse.getError() != null)
			//*   6   14:aload_1         
			//*   7   15:invokevirtual   #45  <Method FacebookRequestError GraphResponse.getError()>
			//*   8   18:ifnull          36
				{
					onError(graphresponse.getError().getException());
			//    9   21:aload_0         
			//   10   22:getfield        #19  <Field DeviceAuthDialog this$0>
			//   11   25:aload_1         
			//   12   26:invokevirtual   #45  <Method FacebookRequestError GraphResponse.getError()>
			//   13   29:invokevirtual   #51  <Method FacebookException FacebookRequestError.getException()>
			//   14   32:invokestatic    #55  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
					return;
			//   15   35:return          
				}
				com.facebook.internal.Utility.PermissionsPair permissionspair;
				Object obj;
				try
				{
					obj = ((Object) (graphresponse.getJSONObject()));
			//   16   36:aload_1         
			//   17   37:invokevirtual   #59  <Method JSONObject GraphResponse.getJSONObject()>
			//   18   40:astore_3        
					graphresponse = ((GraphResponse) (((JSONObject) (obj)).getString("id")));
			//   19   41:aload_3         
			//   20   42:ldc1            #61  <String "id">
			//   21   44:invokevirtual   #67  <Method String JSONObject.getString(String)>
			//   22   47:astore_1        
					permissionspair = Utility.handlePermissionResponse(((JSONObject) (obj)));
			//   23   48:aload_3         
			//   24   49:invokestatic    #73  <Method com.facebook.internal.Utility$PermissionsPair Utility.handlePermissionResponse(JSONObject)>
			//   25   52:astore_2        
					obj = ((Object) (((JSONObject) (obj)).getString("name")));
			//   26   53:aload_3         
			//   27   54:ldc1            #75  <String "name">
			//   28   56:invokevirtual   #67  <Method String JSONObject.getString(String)>
			//   29   59:astore_3        
				}
			//*  30   60:aload_0         
			//*  31   61:getfield        #19  <Field DeviceAuthDialog this$0>
			//*  32   64:invokestatic    #79  <Method DeviceAuthDialog$RequestState DeviceAuthDialog.access$1200(DeviceAuthDialog)>
			//*  33   67:invokevirtual   #85  <Method String DeviceAuthDialog$RequestState.getUserCode()>
			//*  34   70:invokestatic    #90  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
			//*  35   73:invokestatic    #95  <Method String FacebookSdk.getApplicationId()>
			//*  36   76:invokestatic    #101 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
			//*  37   79:invokevirtual   #107 <Method EnumSet FetchedAppSettings.getSmartLoginOptions()>
			//*  38   82:getstatic       #113 <Field SmartLoginOption SmartLoginOption.RequireConfirm>
			//*  39   85:invokevirtual   #119 <Method boolean EnumSet.contains(Object)>
			//*  40   88:ifeq            125
			//*  41   91:aload_0         
			//*  42   92:getfield        #19  <Field DeviceAuthDialog this$0>
			//*  43   95:invokestatic    #123 <Method boolean DeviceAuthDialog.access$1300(DeviceAuthDialog)>
			//*  44   98:ifne            125
			//*  45  101:aload_0         
			//*  46  102:getfield        #19  <Field DeviceAuthDialog this$0>
			//*  47  105:iconst_1        
			//*  48  106:invokestatic    #127 <Method boolean DeviceAuthDialog.access$1302(DeviceAuthDialog, boolean)>
			//*  49  109:pop             
			//*  50  110:aload_0         
			//*  51  111:getfield        #19  <Field DeviceAuthDialog this$0>
			//*  52  114:aload_1         
			//*  53  115:aload_2         
			//*  54  116:aload_0         
			//*  55  117:getfield        #21  <Field String val$accessToken>
			//*  56  120:aload_3         
			//*  57  121:invokestatic    #131 <Method void DeviceAuthDialog.access$1400(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, String)>
			//*  58  124:return          
			//*  59  125:aload_0         
			//*  60  126:getfield        #19  <Field DeviceAuthDialog this$0>
			//*  61  129:aload_1         
			//*  62  130:aload_2         
			//*  63  131:aload_0         
			//*  64  132:getfield        #21  <Field String val$accessToken>
			//*  65  135:invokestatic    #135 <Method void DeviceAuthDialog.access$1100(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String)>
			//*  66  138:return          
				// Misplaced declaration of an exception variable
				catch(GraphResponse graphresponse)
			//*  67  139:astore_1        
				{
					onError(new FacebookException(((Throwable) (graphresponse))));
			//   68  140:aload_0         
			//   69  141:getfield        #19  <Field DeviceAuthDialog this$0>
			//   70  144:new             #137 <Class FacebookException>
			//   71  147:dup             
			//   72  148:aload_1         
			//   73  149:invokespecial   #140 <Method void FacebookException(Throwable)>
			//   74  152:invokestatic    #55  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
					return;
			//   75  155:return          
				}
				DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
				if(FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(((Object) (SmartLoginOption.RequireConfirm))) && !isRetry)
				{
					isRetry = true;
					presentConfirmation(((String) (graphresponse)), permissionspair, accessToken, ((String) (obj)));
					return;
				} else
				{
					completeLogin(((String) (graphresponse)), permissionspair, accessToken);
					return;
				}
			}

			final DeviceAuthDialog this$0;
			final String val$accessToken;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DeviceAuthDialog this$0>
				accessToken = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$accessToken>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
)).executeAsync();
	//    8   18:new             #181 <Class GraphRequest>
	//    9   21:dup             
	//   10   22:new             #300 <Class AccessToken>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:invokestatic    #140 <Method String FacebookSdk.getApplicationId()>
	//   14   30:ldc2            #302 <String "0">
	//   15   33:aconst_null     
	//   16   34:aconst_null     
	//   17   35:aconst_null     
	//   18   36:aconst_null     
	//   19   37:aconst_null     
	//   20   38:invokespecial   #304 <Method void AccessToken(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date)>
	//   21   41:ldc2            #306 <String "me">
	//   22   44:aload_2         
	//   23   45:getstatic       #309 <Field HttpMethod HttpMethod.GET>
	//   24   48:new             #20  <Class DeviceAuthDialog$7>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokespecial   #311 <Method void DeviceAuthDialog$7(DeviceAuthDialog, String)>
	//   29   57:invokespecial   #194 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   30   60:invokevirtual   #315 <Method GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   31   63:pop             
	//   32   64:return          
	}

	private void poll()
	{
		currentRequestState.setLastPoll((new Date()).getTime());
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//    2    4:new             #317 <Class Date>
	//    3    7:dup             
	//    4    8:invokespecial   #318 <Method void Date()>
	//    5   11:invokevirtual   #322 <Method long Date.getTime()>
	//    6   14:invokevirtual   #326 <Method void DeviceAuthDialog$RequestState.setLastPoll(long)>
		currentGraphRequestPoll = getPollRequest().executeAsync();
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:invokespecial   #328 <Method GraphRequest getPollRequest()>
	//   10   22:invokevirtual   #315 <Method GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   11   25:putfield        #330 <Field GraphRequestAsyncTask currentGraphRequestPoll>
	//   12   28:return          
	}

	private void presentConfirmation(final String userId, final com.facebook.internal.Utility.PermissionsPair permissions, final String accessToken, String s)
	{
		String s1 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_title);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method Resources getResources()>
	//    2    4:getstatic       #337 <Field int com.facebook.common.R$string.com_facebook_smart_login_confirmation_title>
	//    3    7:invokevirtual   #340 <Method String Resources.getString(int)>
	//    4   10:astore          5
		Object obj = ((Object) (getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_continue_as)));
	//    5   12:aload_0         
	//    6   13:invokevirtual   #334 <Method Resources getResources()>
	//    7   16:getstatic       #343 <Field int com.facebook.common.R$string.com_facebook_smart_login_confirmation_continue_as>
	//    8   19:invokevirtual   #340 <Method String Resources.getString(int)>
	//    9   22:astore          7
		String s2 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_cancel);
	//   10   24:aload_0         
	//   11   25:invokevirtual   #334 <Method Resources getResources()>
	//   12   28:getstatic       #346 <Field int com.facebook.common.R$string.com_facebook_smart_login_confirmation_cancel>
	//   13   31:invokevirtual   #340 <Method String Resources.getString(int)>
	//   14   34:astore          6
		s = String.format(((String) (obj)), new Object[] {
			s
		});
	//   15   36:aload           7
	//   16   38:iconst_1        
	//   17   39:anewarray       Object[]
	//   18   42:dup             
	//   19   43:iconst_0        
	//   20   44:aload           4
	//   21   46:aastore         
	//   22   47:invokestatic    #354 <Method String String.format(String, Object[])>
	//   23   50:astore          4
		obj = ((Object) (new android.app.AlertDialog.Builder(getContext())));
	//   24   52:new             #356 <Class android.app.AlertDialog$Builder>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:invokevirtual   #360 <Method android.content.Context getContext()>
	//   28   60:invokespecial   #363 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   29   63:astore          7
		((android.app.AlertDialog.Builder) (obj)).setMessage(((CharSequence) (s1))).setCancelable(true).setNegativeButton(((CharSequence) (s)), new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				completeLogin(userId, permissions, accessToken);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field DeviceAuthDialog this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #24  <Field String val$userId>
			//    4    8:aload_0         
			//    5    9:getfield        #26  <Field com.facebook.internal.Utility$PermissionsPair val$permissions>
			//    6   12:aload_0         
			//    7   13:getfield        #28  <Field String val$accessToken>
			//    8   16:invokestatic    #37  <Method void DeviceAuthDialog.access$1100(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String)>
			//    9   19:return          
			}

			final DeviceAuthDialog this$0;
			final String val$accessToken;
			final com.facebook.internal.Utility.PermissionsPair val$permissions;
			final String val$userId;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DeviceAuthDialog this$0>
				userId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$userId>
				permissions = permissionspair;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field com.facebook.internal.Utility$PermissionsPair val$permissions>
				accessToken = s1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field String val$accessToken>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
).setPositiveButton(((CharSequence) (s2)), new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				dialoginterface = ((DialogInterface) (initializeContentView(false)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #27  <Method View DeviceAuthDialog.access$800(DeviceAuthDialog, boolean)>
			//    4    8:astore_1        
				dialog.setContentView(((View) (dialoginterface)));
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field DeviceAuthDialog this$0>
			//    7   13:invokestatic    #31  <Method Dialog DeviceAuthDialog.access$900(DeviceAuthDialog)>
			//    8   16:aload_1         
			//    9   17:invokevirtual   #37  <Method void Dialog.setContentView(View)>
				dialoginterface = ((DialogInterface) (DeviceAuthDialog.this));
			//   10   20:aload_0         
			//   11   21:getfield        #17  <Field DeviceAuthDialog this$0>
			//   12   24:astore_1        
				((DeviceAuthDialog) (dialoginterface)).startLogin(((DeviceAuthDialog) (dialoginterface)).mRequest);
			//   13   25:aload_1         
			//   14   26:aload_1         
			//   15   27:invokestatic    #41  <Method LoginClient$Request DeviceAuthDialog.access$1000(DeviceAuthDialog)>
			//   16   30:invokevirtual   #45  <Method void DeviceAuthDialog.startLogin(LoginClient$Request)>
			//   17   33:return          
			}

			final DeviceAuthDialog this$0;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceAuthDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   30   65:aload           7
	//   31   67:aload           5
	//   32   69:invokevirtual   #367 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   33   72:iconst_1        
	//   34   73:invokevirtual   #371 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   35   76:aload           4
	//   36   78:new             #18  <Class DeviceAuthDialog$6>
	//   37   81:dup             
	//   38   82:aload_0         
	//   39   83:aload_1         
	//   40   84:aload_2         
	//   41   85:aload_3         
	//   42   86:invokespecial   #373 <Method void DeviceAuthDialog$6(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String)>
	//   43   89:invokevirtual   #377 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   44   92:aload           6
	//   45   94:new             #16  <Class DeviceAuthDialog$5>
	//   46   97:dup             
	//   47   98:aload_0         
	//   48   99:invokespecial   #378 <Method void DeviceAuthDialog$5(DeviceAuthDialog)>
	//   49  102:invokevirtual   #381 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   50  105:pop             
		((android.app.AlertDialog.Builder) (obj)).create().show();
	//   51  106:aload           7
	//   52  108:invokevirtual   #385 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   53  111:invokevirtual   #390 <Method void AlertDialog.show()>
	//   54  114:return          
	}

	private void schedulePoll()
	{
		scheduledPoll = DeviceAuthMethodHandler.getBackgroundExecutor().schedule(new Runnable() {

			public void run()
			{
				poll();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//    2    4:invokestatic    #24  <Method void DeviceAuthDialog.access$400(DeviceAuthDialog)>
			//    3    7:return          
			}

			final DeviceAuthDialog this$0;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceAuthDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, currentRequestState.getInterval(), TimeUnit.SECONDS);
	//    0    0:aload_0         
	//    1    1:invokestatic    #394 <Method ScheduledThreadPoolExecutor DeviceAuthMethodHandler.getBackgroundExecutor()>
	//    2    4:new             #12  <Class DeviceAuthDialog$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #395 <Method void DeviceAuthDialog$3(DeviceAuthDialog)>
	//    6   12:aload_0         
	//    7   13:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//    8   16:invokevirtual   #398 <Method long DeviceAuthDialog$RequestState.getInterval()>
	//    9   19:getstatic       #404 <Field TimeUnit TimeUnit.SECONDS>
	//   10   22:invokevirtual   #410 <Method ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
	//   11   25:putfield        #412 <Field ScheduledFuture scheduledPoll>
	//   12   28:return          
	}

	private void setCurrentRequestState(RequestState requeststate)
	{
		currentRequestState = requeststate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
		confirmationCode.setText(((CharSequence) (requeststate.getUserCode())));
	//    3    5:aload_0         
	//    4    6:getfield        #241 <Field TextView confirmationCode>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #285 <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//    7   13:invokevirtual   #278 <Method void TextView.setText(CharSequence)>
		Object obj = ((Object) (DeviceRequestsHelper.generateQRCode(requeststate.getAuthorizationUri())));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #415 <Method String DeviceAuthDialog$RequestState.getAuthorizationUri()>
	//   10   20:invokestatic    #419 <Method android.graphics.Bitmap DeviceRequestsHelper.generateQRCode(String)>
	//   11   23:astore_2        
		obj = ((Object) (new BitmapDrawable(getResources(), ((android.graphics.Bitmap) (obj)))));
	//   12   24:new             #421 <Class BitmapDrawable>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokevirtual   #334 <Method Resources getResources()>
	//   16   32:aload_2         
	//   17   33:invokespecial   #424 <Method void BitmapDrawable(Resources, android.graphics.Bitmap)>
	//   18   36:astore_2        
		instructions.setCompoundDrawablesWithIntrinsicBounds(((android.graphics.drawable.Drawable) (null)), ((android.graphics.drawable.Drawable) (obj)), ((android.graphics.drawable.Drawable) (null)), ((android.graphics.drawable.Drawable) (null)));
	//   19   37:aload_0         
	//   20   38:getfield        #261 <Field TextView instructions>
	//   21   41:aconst_null     
	//   22   42:aload_2         
	//   23   43:aconst_null     
	//   24   44:aconst_null     
	//   25   45:invokevirtual   #428 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable)>
		confirmationCode.setVisibility(0);
	//   26   48:aload_0         
	//   27   49:getfield        #241 <Field TextView confirmationCode>
	//   28   52:iconst_0        
	//   29   53:invokevirtual   #432 <Method void TextView.setVisibility(int)>
		progressBar.setVisibility(8);
	//   30   56:aload_0         
	//   31   57:getfield        #234 <Field ProgressBar progressBar>
	//   32   60:bipush          8
	//   33   62:invokevirtual   #433 <Method void ProgressBar.setVisibility(int)>
		if(!isRetry && DeviceRequestsHelper.startAdvertisementService(requeststate.getUserCode()))
	//*  34   65:aload_0         
	//*  35   66:getfield        #63  <Field boolean isRetry>
	//*  36   69:ifne            97
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #285 <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//*  39   76:invokestatic    #437 <Method boolean DeviceRequestsHelper.startAdvertisementService(String)>
	//*  40   79:ifeq            97
			AppEventsLogger.newLogger(getContext()).logSdkEvent("fb_smart_login_service", ((Double) (null)), ((Bundle) (null)));
	//   41   82:aload_0         
	//   42   83:invokevirtual   #360 <Method android.content.Context getContext()>
	//   43   86:invokestatic    #443 <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context)>
	//   44   89:ldc2            #445 <String "fb_smart_login_service">
	//   45   92:aconst_null     
	//   46   93:aconst_null     
	//   47   94:invokevirtual   #449 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
		if(requeststate.withinLastRefreshWindow())
	//*  48   97:aload_1         
	//*  49   98:invokevirtual   #453 <Method boolean DeviceAuthDialog$RequestState.withinLastRefreshWindow()>
	//*  50  101:ifeq            109
		{
			schedulePoll();
	//   51  104:aload_0         
	//   52  105:invokespecial   #116 <Method void schedulePoll()>
			return;
	//   53  108:return          
		} else
		{
			poll();
	//   54  109:aload_0         
	//   55  110:invokespecial   #110 <Method void poll()>
			return;
	//   56  113:return          
		}
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		dialog = new Dialog(((android.content.Context) (getActivity())), com.facebook.common.R.style.com_facebook_auth_dialog);
	//    0    0:aload_0         
	//    1    1:new             #162 <Class Dialog>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #198 <Method FragmentActivity getActivity()>
	//    5    9:getstatic       #461 <Field int com.facebook.common.R$style.com_facebook_auth_dialog>
	//    6   12:invokespecial   #464 <Method void Dialog(android.content.Context, int)>
	//    7   15:putfield        #132 <Field Dialog dialog>
		boolean flag;
		if(DeviceRequestsHelper.isAvailable() && !isRetry)
	//*   8   18:invokestatic    #467 <Method boolean DeviceRequestsHelper.isAvailable()>
	//*   9   21:ifeq            36
	//*  10   24:aload_0         
	//*  11   25:getfield        #63  <Field boolean isRetry>
	//*  12   28:ifne            36
			flag = true;
	//   13   31:iconst_1        
	//   14   32:istore_2        
		else
	//*  15   33:goto            38
			flag = false;
	//   16   36:iconst_0        
	//   17   37:istore_2        
		bundle = ((Bundle) (initializeContentView(flag)));
	//   18   38:aload_0         
	//   19   39:iload_2         
	//   20   40:invokespecial   #128 <Method View initializeContentView(boolean)>
	//   21   43:astore_1        
		dialog.setContentView(((View) (bundle)));
	//   22   44:aload_0         
	//   23   45:getfield        #132 <Field Dialog dialog>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #471 <Method void Dialog.setContentView(View)>
		return dialog;
	//   26   52:aload_0         
	//   27   53:getfield        #132 <Field Dialog dialog>
	//   28   56:areturn         
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		TraceMachine.enterMethod(_nr_trace, "DeviceAuthDialog#onCreateView", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #479 <Field Trace _nr_trace>
	//    2    4:ldc2            #481 <String "DeviceAuthDialog#onCreateView">
	//    3    7:aconst_null     
	//    4    8:invokestatic    #487 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   11:goto            22
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "DeviceAuthDialog#onCreateView", ((java.util.ArrayList) (null)));
	//    6   14:aconst_null     
	//    7   15:ldc2            #481 <String "DeviceAuthDialog#onCreateView">
	//    8   18:aconst_null     
	//    9   19:invokestatic    #487 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		layoutinflater = ((LayoutInflater) (super.onCreateView(layoutinflater, viewgroup, bundle)));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:invokespecial   #489 <Method View DialogFragment.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   15   29:astore_1        
		deviceAuthMethodHandler = (DeviceAuthMethodHandler)((LoginFragment)((FacebookActivity)getActivity()).getCurrentFragment()).getLoginClient().getCurrentHandler();
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #198 <Method FragmentActivity getActivity()>
	//   19   35:checkcast       #491 <Class FacebookActivity>
	//   20   38:invokevirtual   #495 <Method android.support.v4.app.Fragment FacebookActivity.getCurrentFragment()>
	//   21   41:checkcast       #497 <Class LoginFragment>
	//   22   44:invokevirtual   #501 <Method LoginClient LoginFragment.getLoginClient()>
	//   23   47:invokevirtual   #507 <Method LoginMethodHandler LoginClient.getCurrentHandler()>
	//   24   50:checkcast       #157 <Class DeviceAuthMethodHandler>
	//   25   53:putfield        #134 <Field DeviceAuthMethodHandler deviceAuthMethodHandler>
		if(bundle != null)
	//*  26   56:aload_3         
	//*  27   57:ifnull          80
		{
			viewgroup = ((ViewGroup) ((RequestState)bundle.getParcelable("request_state")));
	//   28   60:aload_3         
	//   29   61:ldc2            #509 <String "request_state">
	//   30   64:invokevirtual   #513 <Method Parcelable Bundle.getParcelable(String)>
	//   31   67:checkcast       #22  <Class DeviceAuthDialog$RequestState>
	//   32   70:astore_2        
			if(viewgroup != null)
	//*  33   71:aload_2         
	//*  34   72:ifnull          80
				setCurrentRequestState(((RequestState) (viewgroup)));
	//   35   75:aload_0         
	//   36   76:aload_2         
	//   37   77:invokespecial   #101 <Method void setCurrentRequestState(DeviceAuthDialog$RequestState)>
		}
		TraceMachine.exitMethod();
	//   38   80:invokestatic    #516 <Method void TraceMachine.exitMethod()>
		return ((View) (layoutinflater));
	//   39   83:aload_1         
	//   40   84:areturn         
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   41   85:astore          4
		if(true) goto _L3; else goto _L2
	//   42   87:goto            14
_L2:
	}

	public void onDestroy()
	{
		isBeingDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #61  <Field boolean isBeingDestroyed>
		completed.set(true);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field AtomicBoolean completed>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #521 <Method void AtomicBoolean.set(boolean)>
		super.onDestroy();
	//    7   13:aload_0         
	//    8   14:invokespecial   #523 <Method void DialogFragment.onDestroy()>
		if(currentGraphRequestPoll != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #330 <Field GraphRequestAsyncTask currentGraphRequestPoll>
	//*  11   21:ifnull          33
			currentGraphRequestPoll.cancel(true);
	//   12   24:aload_0         
	//   13   25:getfield        #330 <Field GraphRequestAsyncTask currentGraphRequestPoll>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #529 <Method boolean GraphRequestAsyncTask.cancel(boolean)>
	//   16   32:pop             
		if(scheduledPoll != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #412 <Field ScheduledFuture scheduledPoll>
	//*  19   37:ifnull          51
			scheduledPoll.cancel(true);
	//   20   40:aload_0         
	//   21   41:getfield        #412 <Field ScheduledFuture scheduledPoll>
	//   22   44:iconst_1        
	//   23   45:invokeinterface #532 <Method boolean ScheduledFuture.cancel(boolean)>
	//   24   50:pop             
	//   25   51:return          
	}

	public void onDismiss(DialogInterface dialoginterface)
	{
		super.onDismiss(dialoginterface);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #536 <Method void DialogFragment.onDismiss(DialogInterface)>
		if(!isBeingDestroyed)
	//*   3    5:aload_0         
	//*   4    6:getfield        #61  <Field boolean isBeingDestroyed>
	//*   5    9:ifne            16
			onCancel();
	//    6   12:aload_0         
	//    7   13:invokespecial   #106 <Method void onCancel()>
	//    8   16:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #540 <Method void DialogFragment.onSaveInstanceState(Bundle)>
		if(currentRequestState != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//*   5    9:ifnull          23
			bundle.putParcelable("request_state", ((Parcelable) (currentRequestState)));
	//    6   12:aload_1         
	//    7   13:ldc2            #509 <String "request_state">
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//   10   20:invokevirtual   #544 <Method void Bundle.putParcelable(String, Parcelable)>
	//   11   23:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #547 <Method void DialogFragment.onStart()>
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    2    4:invokestatic    #553 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #557 <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #560 <Method void DialogFragment.onStop()>
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    2    4:invokestatic    #553 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #563 <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
	//    5   11:return          
	}

	public void startLogin(LoginClient.Request request)
	{
		mRequest = request;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field LoginClient$Request mRequest>
		Bundle bundle = new Bundle();
	//    3    5:new             #169 <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #170 <Method void Bundle()>
	//    6   12:astore_2        
		bundle.putString("scope", TextUtils.join(",", ((Iterable) (request.getPermissions()))));
	//    7   13:aload_2         
	//    8   14:ldc2            #567 <String "scope">
	//    9   17:ldc2            #569 <String ",">
	//   10   20:aload_1         
	//   11   21:invokevirtual   #575 <Method java.util.Set LoginClient$Request.getPermissions()>
	//   12   24:invokestatic    #581 <Method String TextUtils.join(CharSequence, Iterable)>
	//   13   27:invokevirtual   #179 <Method void Bundle.putString(String, String)>
		request = ((LoginClient.Request) (request.getDeviceRedirectUriString()));
	//   14   30:aload_1         
	//   15   31:invokevirtual   #584 <Method String LoginClient$Request.getDeviceRedirectUriString()>
	//   16   34:astore_1        
		if(request != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          47
			bundle.putString("redirect_uri", ((String) (request)));
	//   19   39:aload_2         
	//   20   40:ldc2            #586 <String "redirect_uri">
	//   21   43:aload_1         
	//   22   44:invokevirtual   #179 <Method void Bundle.putString(String, String)>
		request = ((LoginClient.Request) (new StringBuilder()));
	//   23   47:new             #588 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:invokespecial   #589 <Method void StringBuilder()>
	//   26   54:astore_1        
		((StringBuilder) (request)).append(Validate.hasAppID());
	//   27   55:aload_1         
	//   28   56:invokestatic    #594 <Method String Validate.hasAppID()>
	//   29   59:invokevirtual   #598 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
		((StringBuilder) (request)).append("|");
	//   31   63:aload_1         
	//   32   64:ldc2            #600 <String "|">
	//   33   67:invokevirtual   #598 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
		((StringBuilder) (request)).append(Validate.hasClientToken());
	//   35   71:aload_1         
	//   36   72:invokestatic    #603 <Method String Validate.hasClientToken()>
	//   37   75:invokevirtual   #598 <Method StringBuilder StringBuilder.append(String)>
	//   38   78:pop             
		bundle.putString("access_token", ((StringBuilder) (request)).toString());
	//   39   79:aload_2         
	//   40   80:ldc2            #605 <String "access_token">
	//   41   83:aload_1         
	//   42   84:invokevirtual   #608 <Method String StringBuilder.toString()>
	//   43   87:invokevirtual   #179 <Method void Bundle.putString(String, String)>
		bundle.putString("device_info", DeviceRequestsHelper.getDeviceInfo());
	//   44   90:aload_2         
	//   45   91:ldc2            #610 <String "device_info">
	//   46   94:invokestatic    #613 <Method String DeviceRequestsHelper.getDeviceInfo()>
	//   47   97:invokevirtual   #179 <Method void Bundle.putString(String, String)>
		(new GraphRequest(((AccessToken) (null)), "device/login", bundle, HttpMethod.POST, new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				if(isBeingDestroyed)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//*   2    4:invokestatic    #29  <Method boolean DeviceAuthDialog.access$000(DeviceAuthDialog)>
			//*   3    7:ifeq            11
					return;
			//    4   10:return          
				if(graphresponse.getError() != null)
			//*   5   11:aload_1         
			//*   6   12:invokevirtual   #35  <Method FacebookRequestError GraphResponse.getError()>
			//*   7   15:ifnull          33
				{
					onError(graphresponse.getError().getException());
			//    8   18:aload_0         
			//    9   19:getfield        #17  <Field DeviceAuthDialog this$0>
			//   10   22:aload_1         
			//   11   23:invokevirtual   #35  <Method FacebookRequestError GraphResponse.getError()>
			//   12   26:invokevirtual   #41  <Method FacebookException FacebookRequestError.getException()>
			//   13   29:invokestatic    #45  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
					return;
			//   14   32:return          
				}
				graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
			//   15   33:aload_1         
			//   16   34:invokevirtual   #49  <Method JSONObject GraphResponse.getJSONObject()>
			//   17   37:astore_1        
				RequestState requeststate = new RequestState();
			//   18   38:new             #51  <Class DeviceAuthDialog$RequestState>
			//   19   41:dup             
			//   20   42:invokespecial   #52  <Method void DeviceAuthDialog$RequestState()>
			//   21   45:astore_2        
				try
				{
					requeststate.setUserCode(((JSONObject) (graphresponse)).getString("user_code"));
			//   22   46:aload_2         
			//   23   47:aload_1         
			//   24   48:ldc1            #54  <String "user_code">
			//   25   50:invokevirtual   #60  <Method String JSONObject.getString(String)>
			//   26   53:invokevirtual   #64  <Method void DeviceAuthDialog$RequestState.setUserCode(String)>
					requeststate.setRequestCode(((JSONObject) (graphresponse)).getString("code"));
			//   27   56:aload_2         
			//   28   57:aload_1         
			//   29   58:ldc1            #66  <String "code">
			//   30   60:invokevirtual   #60  <Method String JSONObject.getString(String)>
			//   31   63:invokevirtual   #69  <Method void DeviceAuthDialog$RequestState.setRequestCode(String)>
					requeststate.setInterval(((JSONObject) (graphresponse)).getLong("interval"));
			//   32   66:aload_2         
			//   33   67:aload_1         
			//   34   68:ldc1            #71  <String "interval">
			//   35   70:invokevirtual   #75  <Method long JSONObject.getLong(String)>
			//   36   73:invokevirtual   #79  <Method void DeviceAuthDialog$RequestState.setInterval(long)>
				}
			//*  37   76:aload_0         
			//*  38   77:getfield        #17  <Field DeviceAuthDialog this$0>
			//*  39   80:aload_2         
			//*  40   81:invokestatic    #83  <Method void DeviceAuthDialog.access$200(DeviceAuthDialog, DeviceAuthDialog$RequestState)>
			//*  41   84:return          
				// Misplaced declaration of an exception variable
				catch(GraphResponse graphresponse)
			//*  42   85:astore_1        
				{
					onError(new FacebookException(((Throwable) (graphresponse))));
			//   43   86:aload_0         
			//   44   87:getfield        #17  <Field DeviceAuthDialog this$0>
			//   45   90:new             #85  <Class FacebookException>
			//   46   93:dup             
			//   47   94:aload_1         
			//   48   95:invokespecial   #88  <Method void FacebookException(Throwable)>
			//   49   98:invokestatic    #45  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
					return;
			//   50  101:return          
				}
				setCurrentRequestState(requeststate);
			}

			final DeviceAuthDialog this$0;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DeviceAuthDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)).executeAsync();
	//   48  100:new             #181 <Class GraphRequest>
	//   49  103:dup             
	//   50  104:aconst_null     
	//   51  105:ldc2            #615 <String "device/login">
	//   52  108:aload_2         
	//   53  109:getstatic       #189 <Field HttpMethod HttpMethod.POST>
	//   54  112:new             #8   <Class DeviceAuthDialog$1>
	//   55  115:dup             
	//   56  116:aload_0         
	//   57  117:invokespecial   #616 <Method void DeviceAuthDialog$1(DeviceAuthDialog)>
	//   58  120:invokespecial   #194 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   59  123:invokevirtual   #315 <Method GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   60  126:pop             
	//   61  127:return          
	}

	public Trace _nr_trace;
	private AtomicBoolean completed;
	private TextView confirmationCode;
	private volatile GraphRequestAsyncTask currentGraphRequestPoll;
	private volatile RequestState currentRequestState;
	private DeviceAuthMethodHandler deviceAuthMethodHandler;
	private Dialog dialog;
	private TextView instructions;
	private boolean isBeingDestroyed;
	private boolean isRetry;
	private LoginClient.Request mRequest;
	private ProgressBar progressBar;
	private volatile ScheduledFuture scheduledPoll;


/*
	static boolean access$000(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.isBeingDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean isBeingDestroyed>
	//    2    4:ireturn         
	}

*/


/*
	static void access$100(DeviceAuthDialog deviceauthdialog, FacebookException facebookexception)
	{
		deviceauthdialog.onError(facebookexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #74  <Method void onError(FacebookException)>
		return;
	//    3    5:return          
	}

*/


/*
	static LoginClient.Request access$1000(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.mRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LoginClient$Request mRequest>
	//    2    4:areturn         
	}

*/


/*
	static void access$1100(DeviceAuthDialog deviceauthdialog, String s, com.facebook.internal.Utility.PermissionsPair permissionspair, String s1)
	{
		deviceauthdialog.completeLogin(s, permissionspair, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #82  <Method void completeLogin(String, com.facebook.internal.Utility$PermissionsPair, String)>
		return;
	//    5    7:return          
	}

*/


/*
	static RequestState access$1200(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.currentRequestState;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field DeviceAuthDialog$RequestState currentRequestState>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1300(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.isRetry;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean isRetry>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1302(DeviceAuthDialog deviceauthdialog, boolean flag)
	{
		deviceauthdialog.isRetry = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field boolean isRetry>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$1400(DeviceAuthDialog deviceauthdialog, String s, com.facebook.internal.Utility.PermissionsPair permissionspair, String s1, String s2)
	{
		deviceauthdialog.presentConfirmation(s, permissionspair, s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #95  <Method void presentConfirmation(String, com.facebook.internal.Utility$PermissionsPair, String, String)>
		return;
	//    6    9:return          
	}

*/


/*
	static void access$200(DeviceAuthDialog deviceauthdialog, RequestState requeststate)
	{
		deviceauthdialog.setCurrentRequestState(requeststate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void setCurrentRequestState(DeviceAuthDialog$RequestState)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$300(DeviceAuthDialog deviceauthdialog)
	{
		deviceauthdialog.onCancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void onCancel()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$400(DeviceAuthDialog deviceauthdialog)
	{
		deviceauthdialog.poll();
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method void poll()>
		return;
	//    2    4:return          
	}

*/


/*
	static AtomicBoolean access$500(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.completed;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field AtomicBoolean completed>
	//    2    4:areturn         
	}

*/


/*
	static void access$600(DeviceAuthDialog deviceauthdialog)
	{
		deviceauthdialog.schedulePoll();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void schedulePoll()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$700(DeviceAuthDialog deviceauthdialog, String s)
	{
		deviceauthdialog.onSuccess(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void onSuccess(String)>
		return;
	//    3    5:return          
	}

*/


/*
	static View access$800(DeviceAuthDialog deviceauthdialog, boolean flag)
	{
		return deviceauthdialog.initializeContentView(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #128 <Method View initializeContentView(boolean)>
	//    3    5:areturn         
	}

*/


/*
	static Dialog access$900(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.dialog;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Dialog dialog>
	//    2    4:areturn         
	}

*/
}
