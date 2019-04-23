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
import android.widget.Button;
import android.widget.TextView;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			DeviceAuthMethodHandler, LoginFragment, LoginClient

public class DeviceAuthDialog extends DialogFragment
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
		//    1    1:getfield        #39  <Field String authorizationUri>
		//    2    4:areturn         
		}

		public long getInterval()
		{
			return interval;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field long interval>
		//    2    4:lreturn         
		}

		public String getRequestCode()
		{
			return requestCode;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field String requestCode>
		//    2    4:areturn         
		}

		public String getUserCode()
		{
			return userCode;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field String userCode>
		//    2    4:areturn         
		}

		public void setInterval(long l)
		{
			interval = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #49  <Field long interval>
		//    3    5:return          
		}

		public void setLastPoll(long l)
		{
			lastPoll = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #51  <Field long lastPoll>
		//    3    5:return          
		}

		public void setRequestCode(String s)
		{
			requestCode = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field String requestCode>
		//    3    5:return          
		}

		public void setUserCode(String s)
		{
			userCode = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field String userCode>
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
		//   13   22:putfield        #39  <Field String authorizationUri>
		//   14   25:return          
		}

		public boolean withinLastRefreshWindow()
		{
			long l = lastPoll;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field long lastPoll>
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
		//*  16   26:getfield        #51  <Field long lastPoll>
		//*  17   29:lsub            
		//*  18   30:aload_0         
		//*  19   31:getfield        #49  <Field long interval>
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
			parcel.writeString(authorizationUri);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #39  <Field String authorizationUri>
		//    3    5:invokevirtual   #92  <Method void Parcel.writeString(String)>
			parcel.writeString(userCode);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #41  <Field String userCode>
		//    7   13:invokevirtual   #92  <Method void Parcel.writeString(String)>
			parcel.writeString(requestCode);
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #43  <Field String requestCode>
		//   11   21:invokevirtual   #92  <Method void Parcel.writeString(String)>
			parcel.writeLong(interval);
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #49  <Field long interval>
		//   15   29:invokevirtual   #95  <Method void Parcel.writeLong(long)>
			parcel.writeLong(lastPoll);
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #51  <Field long lastPoll>
		//   19   37:invokevirtual   #95  <Method void Parcel.writeLong(long)>
		//   20   40:return          
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
			authorizationUri = parcel.readString();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #37  <Method String Parcel.readString()>
		//    5    9:putfield        #39  <Field String authorizationUri>
			userCode = parcel.readString();
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #37  <Method String Parcel.readString()>
		//    9   17:putfield        #41  <Field String userCode>
			requestCode = parcel.readString();
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokevirtual   #37  <Method String Parcel.readString()>
		//   13   25:putfield        #43  <Field String requestCode>
			interval = parcel.readLong();
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokevirtual   #47  <Method long Parcel.readLong()>
		//   17   33:putfield        #49  <Field long interval>
			lastPoll = parcel.readLong();
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokevirtual   #47  <Method long Parcel.readLong()>
		//   21   41:putfield        #51  <Field long lastPoll>
		//   22   44:return          
		}
	}


	public DeviceAuthDialog()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void DialogFragment()>
		completed = new AtomicBoolean();
	//    2    4:aload_0         
	//    3    5:new             #70  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:invokespecial   #71  <Method void AtomicBoolean()>
	//    6   12:putfield        #73  <Field AtomicBoolean completed>
		isBeingDestroyed = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #75  <Field boolean isBeingDestroyed>
		isRetry = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #77  <Field boolean isRetry>
		mRequest = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #79  <Field LoginClient$Request mRequest>
	//   16   30:return          
	}

	private void completeLogin(String s, com.facebook.internal.Utility.PermissionsPair permissionspair, String s1, Date date, Date date1)
	{
		deviceAuthMethodHandler.onSuccess(s1, FacebookSdk.getApplicationId(), s, ((java.util.Collection) (permissionspair.getGrantedPermissions())), ((java.util.Collection) (permissionspair.getDeclinedPermissions())), AccessTokenSource.DEVICE_AUTH, date, ((Date) (null)), date1);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field DeviceAuthMethodHandler deviceAuthMethodHandler>
	//    2    4:aload_3         
	//    3    5:invokestatic    #138 <Method String FacebookSdk.getApplicationId()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #144 <Method java.util.List com.facebook.internal.Utility$PermissionsPair.getGrantedPermissions()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #147 <Method java.util.List com.facebook.internal.Utility$PermissionsPair.getDeclinedPermissions()>
	//    9   17:getstatic       #153 <Field AccessTokenSource AccessTokenSource.DEVICE_AUTH>
	//   10   20:aload           4
	//   11   22:aconst_null     
	//   12   23:aload           5
	//   13   25:invokevirtual   #158 <Method void DeviceAuthMethodHandler.onSuccess(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date, Date)>
		dialog.dismiss();
	//   14   28:aload_0         
	//   15   29:getfield        #124 <Field Dialog dialog>
	//   16   32:invokevirtual   #163 <Method void Dialog.dismiss()>
	//   17   35:return          
	}

	private GraphRequest getPollRequest()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #167 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("code", currentRequestState.getRequestCode());
	//    4    8:aload_1         
	//    5    9:ldc1            #170 <String "code">
	//    6   11:aload_0         
	//    7   12:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//    8   15:invokevirtual   #173 <Method String DeviceAuthDialog$RequestState.getRequestCode()>
	//    9   18:invokevirtual   #177 <Method void Bundle.putString(String, String)>
		return new GraphRequest(((AccessToken) (null)), "device/login_status", bundle, HttpMethod.POST, new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				if(completed.get())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//*   2    4:invokestatic    #29  <Method AtomicBoolean DeviceAuthDialog.access$300(DeviceAuthDialog)>
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
			//*  10   20:ifnull          146
				{
					int i = facebookrequesterror.getSubErrorCode();
			//   11   23:aload_3         
			//   12   24:invokevirtual   #47  <Method int FacebookRequestError.getSubErrorCode()>
			//   13   27:istore_2        
					if(i != 0x149620)
			//*  14   28:iload_2         
			//*  15   29:ldc1            #48  <Int 0x149620>
			//*  16   31:icmpeq          91
						switch(i)
			//*  17   34:iload_2         
						{
			//*  18   35:tableswitch     1349172 1349174: default 60
			//			               1349172 83
			//			               1349173 75
			//			               1349174 83
						default:
							onError(graphresponse.getError().getException());
			//   19   60:aload_0         
			//   20   61:getfield        #17  <Field DeviceAuthDialog this$0>
			//   21   64:aload_1         
			//   22   65:invokevirtual   #41  <Method FacebookRequestError GraphResponse.getError()>
			//   23   68:invokevirtual   #52  <Method FacebookException FacebookRequestError.getException()>
			//   24   71:invokevirtual   #56  <Method void DeviceAuthDialog.onError(FacebookException)>
							return;
			//   25   74:return          

						case 1349173: 
							onCancel();
			//   26   75:aload_0         
			//   27   76:getfield        #17  <Field DeviceAuthDialog this$0>
			//   28   79:invokevirtual   #59  <Method void DeviceAuthDialog.onCancel()>
							return;
			//   29   82:return          

						case 1349172: 
						case 1349174: 
							schedulePoll();
			//   30   83:aload_0         
			//   31   84:getfield        #17  <Field DeviceAuthDialog this$0>
			//   32   87:invokestatic    #62  <Method void DeviceAuthDialog.access$400(DeviceAuthDialog)>
							return;
			//   33   90:return          
						}
					if(currentRequestState != null)
			//*  34   91:aload_0         
			//*  35   92:getfield        #17  <Field DeviceAuthDialog this$0>
			//*  36   95:invokestatic    #66  <Method DeviceAuthDialog$RequestState DeviceAuthDialog.access$500(DeviceAuthDialog)>
			//*  37   98:ifnull          114
						DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
			//   38  101:aload_0         
			//   39  102:getfield        #17  <Field DeviceAuthDialog this$0>
			//   40  105:invokestatic    #66  <Method DeviceAuthDialog$RequestState DeviceAuthDialog.access$500(DeviceAuthDialog)>
			//   41  108:invokevirtual   #72  <Method String DeviceAuthDialog$RequestState.getUserCode()>
			//   42  111:invokestatic    #78  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
					if(mRequest != null)
			//*  43  114:aload_0         
			//*  44  115:getfield        #17  <Field DeviceAuthDialog this$0>
			//*  45  118:invokestatic    #82  <Method LoginClient$Request DeviceAuthDialog.access$600(DeviceAuthDialog)>
			//*  46  121:ifnull          138
					{
						graphresponse = ((GraphResponse) (DeviceAuthDialog.this));
			//   47  124:aload_0         
			//   48  125:getfield        #17  <Field DeviceAuthDialog this$0>
			//   49  128:astore_1        
						((DeviceAuthDialog) (graphresponse)).startLogin(((DeviceAuthDialog) (graphresponse)).mRequest);
			//   50  129:aload_1         
			//   51  130:aload_1         
			//   52  131:invokestatic    #82  <Method LoginClient$Request DeviceAuthDialog.access$600(DeviceAuthDialog)>
			//   53  134:invokevirtual   #86  <Method void DeviceAuthDialog.startLogin(LoginClient$Request)>
						return;
			//   54  137:return          
					} else
					{
						onCancel();
			//   55  138:aload_0         
			//   56  139:getfield        #17  <Field DeviceAuthDialog this$0>
			//   57  142:invokevirtual   #59  <Method void DeviceAuthDialog.onCancel()>
						return;
			//   58  145:return          
					}
				}
				try
				{
					graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
			//   59  146:aload_1         
			//   60  147:invokevirtual   #90  <Method JSONObject GraphResponse.getJSONObject()>
			//   61  150:astore_1        
					onSuccess(((JSONObject) (graphresponse)).getString("access_token"), Long.valueOf(((JSONObject) (graphresponse)).getLong("expires_in")), Long.valueOf(((JSONObject) (graphresponse)).optLong("data_access_expiration_time")));
			//   62  151:aload_0         
			//   63  152:getfield        #17  <Field DeviceAuthDialog this$0>
			//   64  155:aload_1         
			//   65  156:ldc1            #92  <String "access_token">
			//   66  158:invokevirtual   #98  <Method String JSONObject.getString(String)>
			//   67  161:aload_1         
			//   68  162:ldc1            #100 <String "expires_in">
			//   69  164:invokevirtual   #104 <Method long JSONObject.getLong(String)>
			//   70  167:invokestatic    #110 <Method Long Long.valueOf(long)>
			//   71  170:aload_1         
			//   72  171:ldc1            #112 <String "data_access_expiration_time">
			//   73  173:invokevirtual   #115 <Method long JSONObject.optLong(String)>
			//   74  176:invokestatic    #110 <Method Long Long.valueOf(long)>
			//   75  179:invokestatic    #119 <Method void DeviceAuthDialog.access$700(DeviceAuthDialog, String, Long, Long)>
					return;
			//   76  182:return          
				}
				// Misplaced declaration of an exception variable
				catch(GraphResponse graphresponse)
			//*  77  183:astore_1        
				{
					onError(new FacebookException(((Throwable) (graphresponse))));
			//   78  184:aload_0         
			//   79  185:getfield        #17  <Field DeviceAuthDialog this$0>
			//   80  188:new             #121 <Class FacebookException>
			//   81  191:dup             
			//   82  192:aload_1         
			//   83  193:invokespecial   #124 <Method void FacebookException(Throwable)>
			//   84  196:invokevirtual   #56  <Method void DeviceAuthDialog.onError(FacebookException)>
				}
			//   85  199:return          
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
	//   10   21:new             #179 <Class GraphRequest>
	//   11   24:dup             
	//   12   25:aconst_null     
	//   13   26:ldc1            #30  <String "device/login_status">
	//   14   28:aload_1         
	//   15   29:getstatic       #185 <Field HttpMethod HttpMethod.POST>
	//   16   32:new             #12  <Class DeviceAuthDialog$4>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #187 <Method void DeviceAuthDialog$4(DeviceAuthDialog)>
	//   20   40:invokespecial   #190 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   21   43:areturn         
	}

	private void onSuccess(final String accessToken, final Long expirationTime, Long long1)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #167 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void Bundle()>
	//    3    7:astore          8
		bundle.putString("fields", "id,permissions,name");
	//    4    9:aload           8
	//    5   11:ldc1            #192 <String "fields">
	//    6   13:ldc1            #194 <String "id,permissions,name">
	//    7   15:invokevirtual   #177 <Method void Bundle.putString(String, String)>
		long l = expirationTime.longValue();
	//    8   18:aload_2         
	//    9   19:invokevirtual   #200 <Method long Long.longValue()>
	//   10   22:lstore          4
		Object obj = null;
	//   11   24:aconst_null     
	//   12   25:astore          7
		if(l != 0L)
	//*  13   27:lload           4
	//*  14   29:lconst_0        
	//*  15   30:lcmp            
	//*  16   31:ifeq            64
			expirationTime = ((Long) (new Date((new Date()).getTime() + expirationTime.longValue() * 1000L)));
	//   17   34:new             #202 <Class Date>
	//   18   37:dup             
	//   19   38:new             #202 <Class Date>
	//   20   41:dup             
	//   21   42:invokespecial   #203 <Method void Date()>
	//   22   45:invokevirtual   #206 <Method long Date.getTime()>
	//   23   48:aload_2         
	//   24   49:invokevirtual   #200 <Method long Long.longValue()>
	//   25   52:ldc2w           #207 <Long 1000L>
	//   26   55:lmul            
	//   27   56:ladd            
	//   28   57:invokespecial   #211 <Method void Date(long)>
	//   29   60:astore_2        
		else
	//*  30   61:goto            66
			expirationTime = null;
	//   31   64:aconst_null     
	//   32   65:astore_2        
		final Date dataAccessExpirationTimeDate = ((Date) (obj));
	//   33   66:aload           7
	//   34   68:astore          6
		if(long1.longValue() != 0L)
	//*  35   70:aload_3         
	//*  36   71:invokevirtual   #200 <Method long Long.longValue()>
	//*  37   74:lconst_0        
	//*  38   75:lcmp            
	//*  39   76:ifeq            104
		{
			dataAccessExpirationTimeDate = ((Date) (obj));
	//   40   79:aload           7
	//   41   81:astore          6
			if(long1 != null)
	//*  42   83:aload_3         
	//*  43   84:ifnull          104
				dataAccessExpirationTimeDate = new Date(long1.longValue() * 1000L);
	//   44   87:new             #202 <Class Date>
	//   45   90:dup             
	//   46   91:aload_3         
	//   47   92:invokevirtual   #200 <Method long Long.longValue()>
	//   48   95:ldc2w           #207 <Long 1000L>
	//   49   98:lmul            
	//   50   99:invokespecial   #211 <Method void Date(long)>
	//   51  102:astore          6
		}
		(new GraphRequest(new AccessToken(accessToken, FacebookSdk.getApplicationId(), "0", ((java.util.Collection) (null)), ((java.util.Collection) (null)), ((AccessTokenSource) (null)), ((Date) (expirationTime)), ((Date) (null)), dataAccessExpirationTimeDate), "me", bundle, HttpMethod.GET, new com.facebook.GraphRequest.Callback() {

			public void onCompleted(GraphResponse graphresponse)
			{
				if(completed.get())
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field DeviceAuthDialog this$0>
			//*   2    4:invokestatic    #40  <Method AtomicBoolean DeviceAuthDialog.access$300(DeviceAuthDialog)>
			//*   3    7:invokevirtual   #46  <Method boolean AtomicBoolean.get()>
			//*   4   10:ifeq            14
					return;
			//    5   13:return          
				if(graphresponse.getError() != null)
			//*   6   14:aload_1         
			//*   7   15:invokevirtual   #52  <Method FacebookRequestError GraphResponse.getError()>
			//*   8   18:ifnull          36
				{
					onError(graphresponse.getError().getException());
			//    9   21:aload_0         
			//   10   22:getfield        #22  <Field DeviceAuthDialog this$0>
			//   11   25:aload_1         
			//   12   26:invokevirtual   #52  <Method FacebookRequestError GraphResponse.getError()>
			//   13   29:invokevirtual   #58  <Method FacebookException FacebookRequestError.getException()>
			//   14   32:invokevirtual   #62  <Method void DeviceAuthDialog.onError(FacebookException)>
					return;
			//   15   35:return          
				}
				com.facebook.internal.Utility.PermissionsPair permissionspair;
				Object obj1;
				try
				{
					obj1 = ((Object) (graphresponse.getJSONObject()));
			//   16   36:aload_1         
			//   17   37:invokevirtual   #66  <Method JSONObject GraphResponse.getJSONObject()>
			//   18   40:astore_3        
					graphresponse = ((GraphResponse) (((JSONObject) (obj1)).getString("id")));
			//   19   41:aload_3         
			//   20   42:ldc1            #68  <String "id">
			//   21   44:invokevirtual   #74  <Method String JSONObject.getString(String)>
			//   22   47:astore_1        
					permissionspair = Utility.handlePermissionResponse(((JSONObject) (obj1)));
			//   23   48:aload_3         
			//   24   49:invokestatic    #80  <Method com.facebook.internal.Utility$PermissionsPair Utility.handlePermissionResponse(JSONObject)>
			//   25   52:astore_2        
					obj1 = ((Object) (((JSONObject) (obj1)).getString("name")));
			//   26   53:aload_3         
			//   27   54:ldc1            #82  <String "name">
			//   28   56:invokevirtual   #74  <Method String JSONObject.getString(String)>
			//   29   59:astore_3        
				}
			//*  30   60:aload_0         
			//*  31   61:getfield        #22  <Field DeviceAuthDialog this$0>
			//*  32   64:invokestatic    #86  <Method DeviceAuthDialog$RequestState DeviceAuthDialog.access$500(DeviceAuthDialog)>
			//*  33   67:invokevirtual   #92  <Method String DeviceAuthDialog$RequestState.getUserCode()>
			//*  34   70:invokestatic    #98  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
			//*  35   73:invokestatic    #103 <Method String FacebookSdk.getApplicationId()>
			//*  36   76:invokestatic    #109 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
			//*  37   79:invokevirtual   #115 <Method EnumSet FetchedAppSettings.getSmartLoginOptions()>
			//*  38   82:getstatic       #121 <Field SmartLoginOption SmartLoginOption.RequireConfirm>
			//*  39   85:invokevirtual   #127 <Method boolean EnumSet.contains(Object)>
			//*  40   88:ifeq            133
			//*  41   91:aload_0         
			//*  42   92:getfield        #22  <Field DeviceAuthDialog this$0>
			//*  43   95:invokestatic    #131 <Method boolean DeviceAuthDialog.access$1000(DeviceAuthDialog)>
			//*  44   98:ifne            133
			//*  45  101:aload_0         
			//*  46  102:getfield        #22  <Field DeviceAuthDialog this$0>
			//*  47  105:iconst_1        
			//*  48  106:invokestatic    #135 <Method boolean DeviceAuthDialog.access$1002(DeviceAuthDialog, boolean)>
			//*  49  109:pop             
			//*  50  110:aload_0         
			//*  51  111:getfield        #22  <Field DeviceAuthDialog this$0>
			//*  52  114:aload_1         
			//*  53  115:aload_2         
			//*  54  116:aload_0         
			//*  55  117:getfield        #24  <Field String val$accessToken>
			//*  56  120:aload_3         
			//*  57  121:aload_0         
			//*  58  122:getfield        #26  <Field Date val$expirationTime>
			//*  59  125:aload_0         
			//*  60  126:getfield        #28  <Field Date val$dataAccessExpirationTimeDate>
			//*  61  129:invokestatic    #139 <Method void DeviceAuthDialog.access$1100(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, String, Date, Date)>
			//*  62  132:return          
			//*  63  133:aload_0         
			//*  64  134:getfield        #22  <Field DeviceAuthDialog this$0>
			//*  65  137:aload_1         
			//*  66  138:aload_2         
			//*  67  139:aload_0         
			//*  68  140:getfield        #24  <Field String val$accessToken>
			//*  69  143:aload_0         
			//*  70  144:getfield        #26  <Field Date val$expirationTime>
			//*  71  147:aload_0         
			//*  72  148:getfield        #28  <Field Date val$dataAccessExpirationTimeDate>
			//*  73  151:invokestatic    #143 <Method void DeviceAuthDialog.access$900(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, Date, Date)>
			//*  74  154:return          
				// Misplaced declaration of an exception variable
				catch(GraphResponse graphresponse)
			//*  75  155:astore_1        
				{
					onError(new FacebookException(((Throwable) (graphresponse))));
			//   76  156:aload_0         
			//   77  157:getfield        #22  <Field DeviceAuthDialog this$0>
			//   78  160:new             #145 <Class FacebookException>
			//   79  163:dup             
			//   80  164:aload_1         
			//   81  165:invokespecial   #148 <Method void FacebookException(Throwable)>
			//   82  168:invokevirtual   #62  <Method void DeviceAuthDialog.onError(FacebookException)>
					return;
			//   83  171:return          
				}
				DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
				if(FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(((Object) (SmartLoginOption.RequireConfirm))) && !isRetry)
				{
					isRetry = true;
					presentConfirmation(((String) (graphresponse)), permissionspair, accessToken, ((String) (obj1)), expirationTime, dataAccessExpirationTimeDate);
					return;
				} else
				{
					completeLogin(((String) (graphresponse)), permissionspair, accessToken, expirationTime, dataAccessExpirationTimeDate);
					return;
				}
			}

			final DeviceAuthDialog this$0;
			final String val$accessToken;
			final Date val$dataAccessExpirationTimeDate;
			final Date val$expirationTime;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field DeviceAuthDialog this$0>
				accessToken = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$accessToken>
				expirationTime = date;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Date val$expirationTime>
				dataAccessExpirationTimeDate = date1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field Date val$dataAccessExpirationTimeDate>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
)).executeAsync();
	//   52  104:new             #179 <Class GraphRequest>
	//   53  107:dup             
	//   54  108:new             #213 <Class AccessToken>
	//   55  111:dup             
	//   56  112:aload_1         
	//   57  113:invokestatic    #138 <Method String FacebookSdk.getApplicationId()>
	//   58  116:ldc1            #215 <String "0">
	//   59  118:aconst_null     
	//   60  119:aconst_null     
	//   61  120:aconst_null     
	//   62  121:aload_2         
	//   63  122:aconst_null     
	//   64  123:aload           6
	//   65  125:invokespecial   #217 <Method void AccessToken(String, String, String, java.util.Collection, java.util.Collection, AccessTokenSource, Date, Date, Date)>
	//   66  128:ldc1            #219 <String "me">
	//   67  130:aload           8
	//   68  132:getstatic       #222 <Field HttpMethod HttpMethod.GET>
	//   69  135:new             #18  <Class DeviceAuthDialog$7>
	//   70  138:dup             
	//   71  139:aload_0         
	//   72  140:aload_1         
	//   73  141:aload_2         
	//   74  142:aload           6
	//   75  144:invokespecial   #225 <Method void DeviceAuthDialog$7(DeviceAuthDialog, String, Date, Date)>
	//   76  147:invokespecial   #190 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   77  150:invokevirtual   #229 <Method GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   78  153:pop             
	//   79  154:return          
	}

	private void poll()
	{
		currentRequestState.setLastPoll((new Date()).getTime());
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//    2    4:new             #202 <Class Date>
	//    3    7:dup             
	//    4    8:invokespecial   #203 <Method void Date()>
	//    5   11:invokevirtual   #206 <Method long Date.getTime()>
	//    6   14:invokevirtual   #232 <Method void DeviceAuthDialog$RequestState.setLastPoll(long)>
		currentGraphRequestPoll = getPollRequest().executeAsync();
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:invokespecial   #234 <Method GraphRequest getPollRequest()>
	//   10   22:invokevirtual   #229 <Method GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   11   25:putfield        #236 <Field GraphRequestAsyncTask currentGraphRequestPoll>
	//   12   28:return          
	}

	private void presentConfirmation(final String userId, final com.facebook.internal.Utility.PermissionsPair permissions, final String accessToken, String s, final Date expirationTime, final Date dataAccessExpirationTime)
	{
		String s1 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_title);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method Resources getResources()>
	//    2    4:getstatic       #245 <Field int com.facebook.common.R$string.com_facebook_smart_login_confirmation_title>
	//    3    7:invokevirtual   #251 <Method String Resources.getString(int)>
	//    4   10:astore          7
		Object obj = ((Object) (getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_continue_as)));
	//    5   12:aload_0         
	//    6   13:invokevirtual   #240 <Method Resources getResources()>
	//    7   16:getstatic       #254 <Field int com.facebook.common.R$string.com_facebook_smart_login_confirmation_continue_as>
	//    8   19:invokevirtual   #251 <Method String Resources.getString(int)>
	//    9   22:astore          9
		String s2 = getResources().getString(com.facebook.common.R.string.com_facebook_smart_login_confirmation_cancel);
	//   10   24:aload_0         
	//   11   25:invokevirtual   #240 <Method Resources getResources()>
	//   12   28:getstatic       #257 <Field int com.facebook.common.R$string.com_facebook_smart_login_confirmation_cancel>
	//   13   31:invokevirtual   #251 <Method String Resources.getString(int)>
	//   14   34:astore          8
		s = String.format(((String) (obj)), new Object[] {
			s
		});
	//   15   36:aload           9
	//   16   38:iconst_1        
	//   17   39:anewarray       Object[]
	//   18   42:dup             
	//   19   43:iconst_0        
	//   20   44:aload           4
	//   21   46:aastore         
	//   22   47:invokestatic    #265 <Method String String.format(String, Object[])>
	//   23   50:astore          4
		obj = ((Object) (new android.app.AlertDialog.Builder(getContext())));
	//   24   52:new             #267 <Class android.app.AlertDialog$Builder>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:invokevirtual   #271 <Method android.content.Context getContext()>
	//   28   60:invokespecial   #274 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   29   63:astore          9
		((android.app.AlertDialog.Builder) (obj)).setMessage(((CharSequence) (s1))).setCancelable(true).setNegativeButton(((CharSequence) (s)), new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				completeLogin(userId, permissions, accessToken, expirationTime, dataAccessExpirationTime);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field DeviceAuthDialog this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #27  <Field String val$userId>
			//    4    8:aload_0         
			//    5    9:getfield        #29  <Field com.facebook.internal.Utility$PermissionsPair val$permissions>
			//    6   12:aload_0         
			//    7   13:getfield        #31  <Field String val$accessToken>
			//    8   16:aload_0         
			//    9   17:getfield        #33  <Field Date val$expirationTime>
			//   10   20:aload_0         
			//   11   21:getfield        #35  <Field Date val$dataAccessExpirationTime>
			//   12   24:invokestatic    #44  <Method void DeviceAuthDialog.access$900(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, Date, Date)>
			//   13   27:return          
			}

			final DeviceAuthDialog this$0;
			final String val$accessToken;
			final Date val$dataAccessExpirationTime;
			final Date val$expirationTime;
			final com.facebook.internal.Utility.PermissionsPair val$permissions;
			final String val$userId;

			
			{
				this$0 = DeviceAuthDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field DeviceAuthDialog this$0>
				userId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field String val$userId>
				permissions = permissionspair;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field com.facebook.internal.Utility$PermissionsPair val$permissions>
				accessToken = s1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field String val$accessToken>
				expirationTime = date;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field Date val$expirationTime>
				dataAccessExpirationTime = date1;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #35  <Field Date val$dataAccessExpirationTime>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #38  <Method void Object()>
			//   20   37:return          
			}
		}
).setPositiveButton(((CharSequence) (s2)), new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				dialoginterface = ((DialogInterface) (initializeContentView(false)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #27  <Method View DeviceAuthDialog.initializeContentView(boolean)>
			//    4    8:astore_1        
				dialog.setContentView(((View) (dialoginterface)));
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field DeviceAuthDialog this$0>
			//    7   13:invokestatic    #31  <Method Dialog DeviceAuthDialog.access$800(DeviceAuthDialog)>
			//    8   16:aload_1         
			//    9   17:invokevirtual   #37  <Method void Dialog.setContentView(View)>
				dialoginterface = ((DialogInterface) (DeviceAuthDialog.this));
			//   10   20:aload_0         
			//   11   21:getfield        #17  <Field DeviceAuthDialog this$0>
			//   12   24:astore_1        
				((DeviceAuthDialog) (dialoginterface)).startLogin(((DeviceAuthDialog) (dialoginterface)).mRequest);
			//   13   25:aload_1         
			//   14   26:aload_1         
			//   15   27:invokestatic    #41  <Method LoginClient$Request DeviceAuthDialog.access$600(DeviceAuthDialog)>
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
	//   30   65:aload           9
	//   31   67:aload           7
	//   32   69:invokevirtual   #278 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   33   72:iconst_1        
	//   34   73:invokevirtual   #282 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//   35   76:aload           4
	//   36   78:new             #16  <Class DeviceAuthDialog$6>
	//   37   81:dup             
	//   38   82:aload_0         
	//   39   83:aload_1         
	//   40   84:aload_2         
	//   41   85:aload_3         
	//   42   86:aload           5
	//   43   88:aload           6
	//   44   90:invokespecial   #284 <Method void DeviceAuthDialog$6(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, Date, Date)>
	//   45   93:invokevirtual   #288 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   46   96:aload           8
	//   47   98:new             #14  <Class DeviceAuthDialog$5>
	//   48  101:dup             
	//   49  102:aload_0         
	//   50  103:invokespecial   #289 <Method void DeviceAuthDialog$5(DeviceAuthDialog)>
	//   51  106:invokevirtual   #292 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   52  109:pop             
		((android.app.AlertDialog.Builder) (obj)).create().show();
	//   53  110:aload           9
	//   54  112:invokevirtual   #296 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   55  115:invokevirtual   #301 <Method void AlertDialog.show()>
	//   56  118:return          
	}

	private void schedulePoll()
	{
		scheduledPoll = DeviceAuthMethodHandler.getBackgroundExecutor().schedule(new Runnable() {

			public void run()
			{
				poll();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//    2    4:invokestatic    #24  <Method void DeviceAuthDialog.access$200(DeviceAuthDialog)>
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
	//    1    1:invokestatic    #305 <Method ScheduledThreadPoolExecutor DeviceAuthMethodHandler.getBackgroundExecutor()>
	//    2    4:new             #10  <Class DeviceAuthDialog$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #306 <Method void DeviceAuthDialog$3(DeviceAuthDialog)>
	//    6   12:aload_0         
	//    7   13:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//    8   16:invokevirtual   #309 <Method long DeviceAuthDialog$RequestState.getInterval()>
	//    9   19:getstatic       #315 <Field TimeUnit TimeUnit.SECONDS>
	//   10   22:invokevirtual   #321 <Method ScheduledFuture ScheduledThreadPoolExecutor.schedule(Runnable, long, TimeUnit)>
	//   11   25:putfield        #323 <Field ScheduledFuture scheduledPoll>
	//   12   28:return          
	}

	private void setCurrentRequestState(RequestState requeststate)
	{
		currentRequestState = requeststate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
		confirmationCode.setText(((CharSequence) (requeststate.getUserCode())));
	//    3    5:aload_0         
	//    4    6:getfield        #325 <Field TextView confirmationCode>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #328 <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//    7   13:invokevirtual   #334 <Method void TextView.setText(CharSequence)>
		Object obj = ((Object) (DeviceRequestsHelper.generateQRCode(requeststate.getAuthorizationUri())));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #337 <Method String DeviceAuthDialog$RequestState.getAuthorizationUri()>
	//   10   20:invokestatic    #343 <Method android.graphics.Bitmap DeviceRequestsHelper.generateQRCode(String)>
	//   11   23:astore_2        
		obj = ((Object) (new BitmapDrawable(getResources(), ((android.graphics.Bitmap) (obj)))));
	//   12   24:new             #345 <Class BitmapDrawable>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokevirtual   #240 <Method Resources getResources()>
	//   16   32:aload_2         
	//   17   33:invokespecial   #348 <Method void BitmapDrawable(Resources, android.graphics.Bitmap)>
	//   18   36:astore_2        
		instructions.setCompoundDrawablesWithIntrinsicBounds(((android.graphics.drawable.Drawable) (null)), ((android.graphics.drawable.Drawable) (obj)), ((android.graphics.drawable.Drawable) (null)), ((android.graphics.drawable.Drawable) (null)));
	//   19   37:aload_0         
	//   20   38:getfield        #350 <Field TextView instructions>
	//   21   41:aconst_null     
	//   22   42:aload_2         
	//   23   43:aconst_null     
	//   24   44:aconst_null     
	//   25   45:invokevirtual   #354 <Method void TextView.setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable)>
		confirmationCode.setVisibility(0);
	//   26   48:aload_0         
	//   27   49:getfield        #325 <Field TextView confirmationCode>
	//   28   52:iconst_0        
	//   29   53:invokevirtual   #358 <Method void TextView.setVisibility(int)>
		progressBar.setVisibility(8);
	//   30   56:aload_0         
	//   31   57:getfield        #360 <Field View progressBar>
	//   32   60:bipush          8
	//   33   62:invokevirtual   #363 <Method void View.setVisibility(int)>
		if(!isRetry && DeviceRequestsHelper.startAdvertisementService(requeststate.getUserCode()))
	//*  34   65:aload_0         
	//*  35   66:getfield        #77  <Field boolean isRetry>
	//*  36   69:ifne            97
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #328 <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//*  39   76:invokestatic    #367 <Method boolean DeviceRequestsHelper.startAdvertisementService(String)>
	//*  40   79:ifeq            97
			AppEventsLogger.newLogger(getContext()).logSdkEvent("fb_smart_login_service", ((Double) (null)), ((Bundle) (null)));
	//   41   82:aload_0         
	//   42   83:invokevirtual   #271 <Method android.content.Context getContext()>
	//   43   86:invokestatic    #373 <Method AppEventsLogger AppEventsLogger.newLogger(android.content.Context)>
	//   44   89:ldc2            #375 <String "fb_smart_login_service">
	//   45   92:aconst_null     
	//   46   93:aconst_null     
	//   47   94:invokevirtual   #379 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
		if(requeststate.withinLastRefreshWindow())
	//*  48   97:aload_1         
	//*  49   98:invokevirtual   #383 <Method boolean DeviceAuthDialog$RequestState.withinLastRefreshWindow()>
	//*  50  101:ifeq            109
		{
			schedulePoll();
	//   51  104:aload_0         
	//   52  105:invokespecial   #108 <Method void schedulePoll()>
			return;
	//   53  108:return          
		} else
		{
			poll();
	//   54  109:aload_0         
	//   55  110:invokespecial   #102 <Method void poll()>
			return;
	//   56  113:return          
		}
	}

	protected int getLayoutResId(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			return com.facebook.common.R.layout.com_facebook_smart_device_dialog_fragment;
	//    2    4:getstatic       #391 <Field int com.facebook.common.R$layout.com_facebook_smart_device_dialog_fragment>
	//    3    7:ireturn         
		else
			return com.facebook.common.R.layout.com_facebook_device_auth_dialog_fragment;
	//    4    8:getstatic       #394 <Field int com.facebook.common.R$layout.com_facebook_device_auth_dialog_fragment>
	//    5   11:ireturn         
	}

	protected View initializeContentView(boolean flag)
	{
		View view = getActivity().getLayoutInflater().inflate(getLayoutResId(flag), ((ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #401 <Method FragmentActivity getActivity()>
	//    2    4:invokevirtual   #407 <Method LayoutInflater FragmentActivity.getLayoutInflater()>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #409 <Method int getLayoutResId(boolean)>
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #415 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//    8   16:astore_2        
		progressBar = view.findViewById(com.facebook.common.R.id.progress_bar);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:getstatic       #420 <Field int com.facebook.common.R$id.progress_bar>
	//   12   22:invokevirtual   #424 <Method View View.findViewById(int)>
	//   13   25:putfield        #360 <Field View progressBar>
		confirmationCode = (TextView)view.findViewById(com.facebook.common.R.id.confirmation_code);
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:getstatic       #427 <Field int com.facebook.common.R$id.confirmation_code>
	//   17   33:invokevirtual   #424 <Method View View.findViewById(int)>
	//   18   36:checkcast       #330 <Class TextView>
	//   19   39:putfield        #325 <Field TextView confirmationCode>
		((Button)view.findViewById(com.facebook.common.R.id.cancel_button)).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view1)
			{
				onCancel();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field DeviceAuthDialog this$0>
			//    2    4:invokevirtual   #26  <Method void DeviceAuthDialog.onCancel()>
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
);
	//   20   42:aload_2         
	//   21   43:getstatic       #430 <Field int com.facebook.common.R$id.cancel_button>
	//   22   46:invokevirtual   #424 <Method View View.findViewById(int)>
	//   23   49:checkcast       #432 <Class Button>
	//   24   52:new             #8   <Class DeviceAuthDialog$2>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:invokespecial   #433 <Method void DeviceAuthDialog$2(DeviceAuthDialog)>
	//   28   60:invokevirtual   #437 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		instructions = (TextView)view.findViewById(com.facebook.common.R.id.com_facebook_device_auth_instructions);
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:getstatic       #440 <Field int com.facebook.common.R$id.com_facebook_device_auth_instructions>
	//   32   68:invokevirtual   #424 <Method View View.findViewById(int)>
	//   33   71:checkcast       #330 <Class TextView>
	//   34   74:putfield        #350 <Field TextView instructions>
		instructions.setText(((CharSequence) (Html.fromHtml(getString(com.facebook.common.R.string.com_facebook_device_auth_instructions)))));
	//   35   77:aload_0         
	//   36   78:getfield        #350 <Field TextView instructions>
	//   37   81:aload_0         
	//   38   82:getstatic       #441 <Field int com.facebook.common.R$string.com_facebook_device_auth_instructions>
	//   39   85:invokevirtual   #442 <Method String getString(int)>
	//   40   88:invokestatic    #448 <Method android.text.Spanned Html.fromHtml(String)>
	//   41   91:invokevirtual   #334 <Method void TextView.setText(CharSequence)>
		return view;
	//   42   94:aload_2         
	//   43   95:areturn         
	}

	protected void onCancel()
	{
		if(!completed.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field AtomicBoolean completed>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #453 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(currentRequestState != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//*   9   17:ifnull          30
			DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
	//   10   20:aload_0         
	//   11   21:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//   12   24:invokevirtual   #328 <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//   13   27:invokestatic    #457 <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
		DeviceAuthMethodHandler deviceauthmethodhandler = deviceAuthMethodHandler;
	//   14   30:aload_0         
	//   15   31:getfield        #132 <Field DeviceAuthMethodHandler deviceAuthMethodHandler>
	//   16   34:astore_1        
		if(deviceauthmethodhandler != null)
	//*  17   35:aload_1         
	//*  18   36:ifnull          43
			deviceauthmethodhandler.onCancel();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #459 <Method void DeviceAuthMethodHandler.onCancel()>
		dialog.dismiss();
	//   21   43:aload_0         
	//   22   44:getfield        #124 <Field Dialog dialog>
	//   23   47:invokevirtual   #163 <Method void Dialog.dismiss()>
	//   24   50:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		dialog = new Dialog(((android.content.Context) (getActivity())), com.facebook.common.R.style.com_facebook_auth_dialog);
	//    0    0:aload_0         
	//    1    1:new             #160 <Class Dialog>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #401 <Method FragmentActivity getActivity()>
	//    5    9:getstatic       #467 <Field int com.facebook.common.R$style.com_facebook_auth_dialog>
	//    6   12:invokespecial   #470 <Method void Dialog(android.content.Context, int)>
	//    7   15:putfield        #124 <Field Dialog dialog>
		boolean flag;
		if(DeviceRequestsHelper.isAvailable() && !isRetry)
	//*   8   18:invokestatic    #473 <Method boolean DeviceRequestsHelper.isAvailable()>
	//*   9   21:ifeq            36
	//*  10   24:aload_0         
	//*  11   25:getfield        #77  <Field boolean isRetry>
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
	//   20   40:invokevirtual   #475 <Method View initializeContentView(boolean)>
	//   21   43:astore_1        
		dialog.setContentView(((View) (bundle)));
	//   22   44:aload_0         
	//   23   45:getfield        #124 <Field Dialog dialog>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #479 <Method void Dialog.setContentView(View)>
		return dialog;
	//   26   52:aload_0         
	//   27   53:getfield        #124 <Field Dialog dialog>
	//   28   56:areturn         
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (super.onCreateView(layoutinflater, viewgroup, bundle)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #484 <Method View DialogFragment.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    5    7:astore_1        
		deviceAuthMethodHandler = (DeviceAuthMethodHandler)((LoginFragment)((FacebookActivity)getActivity()).getCurrentFragment()).getLoginClient().getCurrentHandler();
	//    6    8:aload_0         
	//    7    9:aload_0         
	//    8   10:invokevirtual   #401 <Method FragmentActivity getActivity()>
	//    9   13:checkcast       #486 <Class FacebookActivity>
	//   10   16:invokevirtual   #490 <Method android.support.v4.app.Fragment FacebookActivity.getCurrentFragment()>
	//   11   19:checkcast       #492 <Class LoginFragment>
	//   12   22:invokevirtual   #496 <Method LoginClient LoginFragment.getLoginClient()>
	//   13   25:invokevirtual   #502 <Method LoginMethodHandler LoginClient.getCurrentHandler()>
	//   14   28:checkcast       #155 <Class DeviceAuthMethodHandler>
	//   15   31:putfield        #132 <Field DeviceAuthMethodHandler deviceAuthMethodHandler>
		if(bundle != null)
	//*  16   34:aload_3         
	//*  17   35:ifnull          57
		{
			viewgroup = ((ViewGroup) ((RequestState)bundle.getParcelable("request_state")));
	//   18   38:aload_3         
	//   19   39:ldc1            #42  <String "request_state">
	//   20   41:invokevirtual   #506 <Method Parcelable Bundle.getParcelable(String)>
	//   21   44:checkcast       #20  <Class DeviceAuthDialog$RequestState>
	//   22   47:astore_2        
			if(viewgroup != null)
	//*  23   48:aload_2         
	//*  24   49:ifnull          57
				setCurrentRequestState(((RequestState) (viewgroup)));
	//   25   52:aload_0         
	//   26   53:aload_2         
	//   27   54:invokespecial   #88  <Method void setCurrentRequestState(DeviceAuthDialog$RequestState)>
		}
		return ((View) (layoutinflater));
	//   28   57:aload_1         
	//   29   58:areturn         
	}

	public void onDestroy()
	{
		isBeingDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #75  <Field boolean isBeingDestroyed>
		completed.set(true);
	//    3    5:aload_0         
	//    4    6:getfield        #73  <Field AtomicBoolean completed>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #511 <Method void AtomicBoolean.set(boolean)>
		super.onDestroy();
	//    7   13:aload_0         
	//    8   14:invokespecial   #513 <Method void DialogFragment.onDestroy()>
		if(currentGraphRequestPoll != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #236 <Field GraphRequestAsyncTask currentGraphRequestPoll>
	//*  11   21:ifnull          33
			currentGraphRequestPoll.cancel(true);
	//   12   24:aload_0         
	//   13   25:getfield        #236 <Field GraphRequestAsyncTask currentGraphRequestPoll>
	//   14   28:iconst_1        
	//   15   29:invokevirtual   #519 <Method boolean GraphRequestAsyncTask.cancel(boolean)>
	//   16   32:pop             
		if(scheduledPoll != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #323 <Field ScheduledFuture scheduledPoll>
	//*  19   37:ifnull          51
			scheduledPoll.cancel(true);
	//   20   40:aload_0         
	//   21   41:getfield        #323 <Field ScheduledFuture scheduledPoll>
	//   22   44:iconst_1        
	//   23   45:invokeinterface #522 <Method boolean ScheduledFuture.cancel(boolean)>
	//   24   50:pop             
	//   25   51:return          
	}

	public void onDismiss(DialogInterface dialoginterface)
	{
		super.onDismiss(dialoginterface);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #526 <Method void DialogFragment.onDismiss(DialogInterface)>
		if(!isBeingDestroyed)
	//*   3    5:aload_0         
	//*   4    6:getfield        #75  <Field boolean isBeingDestroyed>
	//*   5    9:ifne            16
			onCancel();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #527 <Method void onCancel()>
	//    8   16:return          
	}

	protected void onError(FacebookException facebookexception)
	{
		if(!completed.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field AtomicBoolean completed>
	//*   2    4:iconst_0        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #453 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(currentRequestState != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//*   9   17:ifnull          30
			DeviceRequestsHelper.cleanUpAdvertisementService(currentRequestState.getUserCode());
	//   10   20:aload_0         
	//   11   21:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//   12   24:invokevirtual   #328 <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//   13   27:invokestatic    #457 <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
		deviceAuthMethodHandler.onError(((Exception) (facebookexception)));
	//   14   30:aload_0         
	//   15   31:getfield        #132 <Field DeviceAuthMethodHandler deviceAuthMethodHandler>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #532 <Method void DeviceAuthMethodHandler.onError(Exception)>
		dialog.dismiss();
	//   18   38:aload_0         
	//   19   39:getfield        #124 <Field Dialog dialog>
	//   20   42:invokevirtual   #163 <Method void Dialog.dismiss()>
	//   21   45:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #536 <Method void DialogFragment.onSaveInstanceState(Bundle)>
		if(currentRequestState != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//*   5    9:ifnull          22
			bundle.putParcelable("request_state", ((Parcelable) (currentRequestState)));
	//    6   12:aload_1         
	//    7   13:ldc1            #42  <String "request_state">
	//    8   15:aload_0         
	//    9   16:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//   10   19:invokevirtual   #540 <Method void Bundle.putParcelable(String, Parcelable)>
	//   11   22:return          
	}

	public void startLogin(LoginClient.Request request)
	{
		mRequest = request;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field LoginClient$Request mRequest>
		Bundle bundle = new Bundle();
	//    3    5:new             #167 <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #168 <Method void Bundle()>
	//    6   12:astore_2        
		bundle.putString("scope", TextUtils.join(",", ((Iterable) (request.getPermissions()))));
	//    7   13:aload_2         
	//    8   14:ldc2            #544 <String "scope">
	//    9   17:ldc2            #546 <String ",">
	//   10   20:aload_1         
	//   11   21:invokevirtual   #552 <Method java.util.Set LoginClient$Request.getPermissions()>
	//   12   24:invokestatic    #558 <Method String TextUtils.join(CharSequence, Iterable)>
	//   13   27:invokevirtual   #177 <Method void Bundle.putString(String, String)>
		String s = request.getDeviceRedirectUriString();
	//   14   30:aload_1         
	//   15   31:invokevirtual   #561 <Method String LoginClient$Request.getDeviceRedirectUriString()>
	//   16   34:astore_3        
		if(s != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          47
			bundle.putString("redirect_uri", s);
	//   19   39:aload_2         
	//   20   40:ldc2            #563 <String "redirect_uri">
	//   21   43:aload_3         
	//   22   44:invokevirtual   #177 <Method void Bundle.putString(String, String)>
		request = ((LoginClient.Request) (request.getDeviceAuthTargetUserId()));
	//   23   47:aload_1         
	//   24   48:invokevirtual   #566 <Method String LoginClient$Request.getDeviceAuthTargetUserId()>
	//   25   51:astore_1        
		if(request != null)
	//*  26   52:aload_1         
	//*  27   53:ifnull          64
			bundle.putString("target_user_id", ((String) (request)));
	//   28   56:aload_2         
	//   29   57:ldc2            #568 <String "target_user_id">
	//   30   60:aload_1         
	//   31   61:invokevirtual   #177 <Method void Bundle.putString(String, String)>
		request = ((LoginClient.Request) (new StringBuilder()));
	//   32   64:new             #570 <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #571 <Method void StringBuilder()>
	//   35   71:astore_1        
		((StringBuilder) (request)).append(Validate.hasAppID());
	//   36   72:aload_1         
	//   37   73:invokestatic    #576 <Method String Validate.hasAppID()>
	//   38   76:invokevirtual   #580 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
		((StringBuilder) (request)).append("|");
	//   40   80:aload_1         
	//   41   81:ldc2            #582 <String "|">
	//   42   84:invokevirtual   #580 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		((StringBuilder) (request)).append(Validate.hasClientToken());
	//   44   88:aload_1         
	//   45   89:invokestatic    #585 <Method String Validate.hasClientToken()>
	//   46   92:invokevirtual   #580 <Method StringBuilder StringBuilder.append(String)>
	//   47   95:pop             
		bundle.putString("access_token", ((StringBuilder) (request)).toString());
	//   48   96:aload_2         
	//   49   97:ldc2            #587 <String "access_token">
	//   50  100:aload_1         
	//   51  101:invokevirtual   #590 <Method String StringBuilder.toString()>
	//   52  104:invokevirtual   #177 <Method void Bundle.putString(String, String)>
		bundle.putString("device_info", DeviceRequestsHelper.getDeviceInfo());
	//   53  107:aload_2         
	//   54  108:ldc2            #592 <String "device_info">
	//   55  111:invokestatic    #595 <Method String DeviceRequestsHelper.getDeviceInfo()>
	//   56  114:invokevirtual   #177 <Method void Bundle.putString(String, String)>
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
			//   13   29:invokevirtual   #45  <Method void DeviceAuthDialog.onError(FacebookException)>
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
			//*  40   81:invokestatic    #83  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, DeviceAuthDialog$RequestState)>
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
			//   49   98:invokevirtual   #45  <Method void DeviceAuthDialog.onError(FacebookException)>
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
	//   57  117:new             #179 <Class GraphRequest>
	//   58  120:dup             
	//   59  121:aconst_null     
	//   60  122:ldc1            #27  <String "device/login">
	//   61  124:aload_2         
	//   62  125:getstatic       #185 <Field HttpMethod HttpMethod.POST>
	//   63  128:new             #6   <Class DeviceAuthDialog$1>
	//   64  131:dup             
	//   65  132:aload_0         
	//   66  133:invokespecial   #596 <Method void DeviceAuthDialog$1(DeviceAuthDialog)>
	//   67  136:invokespecial   #190 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, com.facebook.GraphRequest$Callback)>
	//   68  139:invokevirtual   #229 <Method GraphRequestAsyncTask GraphRequest.executeAsync()>
	//   69  142:pop             
	//   70  143:return          
	}

	private static final String DEVICE_LOGIN_ENDPOINT = "device/login";
	private static final String DEVICE_LOGIN_STATUS_ENDPOINT = "device/login_status";
	private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED = 0x149635;
	private static final int LOGIN_ERROR_SUBCODE_AUTHORIZATION_PENDING = 0x149636;
	private static final int LOGIN_ERROR_SUBCODE_CODE_EXPIRED = 0x149620;
	private static final int LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING = 0x149634;
	private static final String REQUEST_STATE_KEY = "request_state";
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
	private View progressBar;
	private volatile ScheduledFuture scheduledPoll;


/*
	static boolean access$000(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.isBeingDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean isBeingDestroyed>
	//    2    4:ireturn         
	}

*/


/*
	static void access$100(DeviceAuthDialog deviceauthdialog, RequestState requeststate)
	{
		deviceauthdialog.setCurrentRequestState(requeststate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #88  <Method void setCurrentRequestState(DeviceAuthDialog$RequestState)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$1000(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.isRetry;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean isRetry>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1002(DeviceAuthDialog deviceauthdialog, boolean flag)
	{
		deviceauthdialog.isRetry = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean isRetry>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$1100(DeviceAuthDialog deviceauthdialog, String s, com.facebook.internal.Utility.PermissionsPair permissionspair, String s1, String s2, Date date, Date date1)
	{
		deviceauthdialog.presentConfirmation(s, permissionspair, s1, s2, date, date1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #97  <Method void presentConfirmation(String, com.facebook.internal.Utility$PermissionsPair, String, String, Date, Date)>
		return;
	//    8   13:return          
	}

*/


/*
	static void access$200(DeviceAuthDialog deviceauthdialog)
	{
		deviceauthdialog.poll();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void poll()>
		return;
	//    2    4:return          
	}

*/


/*
	static AtomicBoolean access$300(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.completed;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field AtomicBoolean completed>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(DeviceAuthDialog deviceauthdialog)
	{
		deviceauthdialog.schedulePoll();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void schedulePoll()>
		return;
	//    2    4:return          
	}

*/


/*
	static RequestState access$500(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.currentRequestState;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field DeviceAuthDialog$RequestState currentRequestState>
	//    2    4:areturn         
	}

*/


/*
	static LoginClient.Request access$600(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.mRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field LoginClient$Request mRequest>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(DeviceAuthDialog deviceauthdialog, String s, Long long1, Long long2)
	{
		deviceauthdialog.onSuccess(s, long1, long2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #120 <Method void onSuccess(String, Long, Long)>
		return;
	//    5    7:return          
	}

*/


/*
	static Dialog access$800(DeviceAuthDialog deviceauthdialog)
	{
		return deviceauthdialog.dialog;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Dialog dialog>
	//    2    4:areturn         
	}

*/


/*
	static void access$900(DeviceAuthDialog deviceauthdialog, String s, com.facebook.internal.Utility.PermissionsPair permissionspair, String s1, Date date, Date date1)
	{
		deviceauthdialog.completeLogin(s, permissionspair, s1, date, date1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #130 <Method void completeLogin(String, com.facebook.internal.Utility$PermissionsPair, String, Date, Date)>
		return;
	//    7   11:return          
	}

*/
}
