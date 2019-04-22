// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;
import com.facebook.internal.NativeProtocol;

// Referenced classes of package com.facebook.login:
//			NativeAppLoginMethodHandler, LoginClient

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler
{

	FacebookLiteLoginMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void NativeAppLoginMethodHandler(Parcel)>
	//    3    5:return          
	}

	FacebookLiteLoginMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void NativeAppLoginMethodHandler(LoginClient)>
	//    3    5:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getNameForLogging()
	{
		return "fb_lite_login";
	//    0    0:ldc1            #29  <String "fb_lite_login">
	//    1    2:areturn         
	}

	boolean tryAuthorize(LoginClient.Request request)
	{
		String s = LoginClient.getE2E();
	//    0    0:invokestatic    #36  <Method String LoginClient.getE2E()>
	//    1    3:astore_2        
		request = ((LoginClient.Request) (NativeProtocol.createFacebookLiteIntent(((android.content.Context) (loginClient.getActivity())), request.getApplicationId(), ((java.util.Collection) (request.getPermissions())), s, request.isRerequest(), request.hasPublishPermission(), request.getDefaultAudience(), getClientState(request.getAuthId()), request.getAuthType())));
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field LoginClient loginClient>
	//    4    8:invokevirtual   #44  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #49  <Method String LoginClient$Request.getApplicationId()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #53  <Method java.util.Set LoginClient$Request.getPermissions()>
	//    9   19:aload_2         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #57  <Method boolean LoginClient$Request.isRerequest()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #60  <Method boolean LoginClient$Request.hasPublishPermission()>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #64  <Method DefaultAudience LoginClient$Request.getDefaultAudience()>
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #67  <Method String LoginClient$Request.getAuthId()>
	//   19   37:invokevirtual   #71  <Method String getClientState(String)>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #74  <Method String LoginClient$Request.getAuthType()>
	//   22   44:invokestatic    #80  <Method android.content.Intent NativeProtocol.createFacebookLiteIntent(android.content.Context, String, java.util.Collection, String, boolean, boolean, DefaultAudience, String, String)>
	//   23   47:astore_1        
		addLoggingExtra("e2e", ((Object) (s)));
	//   24   48:aload_0         
	//   25   49:ldc1            #82  <String "e2e">
	//   26   51:aload_2         
	//   27   52:invokevirtual   #86  <Method void addLoggingExtra(String, Object)>
		return tryIntent(((android.content.Intent) (request)), LoginClient.getLoginRequestCode());
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:invokestatic    #89  <Method int LoginClient.getLoginRequestCode()>
	//   31   60:invokevirtual   #93  <Method boolean tryIntent(android.content.Intent, int)>
	//   32   63:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #97  <Method void NativeAppLoginMethodHandler.writeToParcel(Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel)
		{
			return new FacebookLiteLoginMethodHandler(parcel);
		//    0    0:new             #9   <Class FacebookLiteLoginMethodHandler>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void FacebookLiteLoginMethodHandler(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method FacebookLiteLoginMethodHandler createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public FacebookLiteLoginMethodHandler[] newArray(int i)
		{
			return new FacebookLiteLoginMethodHandler[i];
		//    0    0:iload_1         
		//    1    1:anewarray       FacebookLiteLoginMethodHandler[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method FacebookLiteLoginMethodHandler[] newArray(int)>
		//    3    5:areturn         
		}

	}
;

	static 
	{
	//    0    0:new             #6   <Class FacebookLiteLoginMethodHandler$1>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void FacebookLiteLoginMethodHandler$1()>
	//    3    7:putstatic       #16  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
