// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.hwid;

import android.os.Bundle;

// Referenced classes of package com.huawei.hms.support.api.entity.hwid:
//			IHwIDRespEntity

public class SignInResp extends IHwIDRespEntity
{

	public SignInResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void IHwIDRespEntity()>
	//    2    4:return          
	}

	public static SignInResp buildSignInResp(Bundle bundle)
	{
		SignInResp signinresp = new SignInResp();
	//    0    0:new             #2   <Class SignInResp>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void SignInResp()>
	//    3    7:astore_1        
		signinresp.mUid = bundle.getString("USER_ID", "");
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:ldc1            #48  <String "USER_ID">
	//    7   12:ldc1            #50  <String "">
	//    8   14:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//    9   17:putfield        #58  <Field String mUid>
		signinresp.mLoginUserName = bundle.getString("DISPLAY_NAME", "");
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:ldc1            #59  <String "DISPLAY_NAME">
	//   13   24:ldc1            #50  <String "">
	//   14   26:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   15   29:putfield        #61  <Field String mLoginUserName>
		signinresp.photoUrl = bundle.getString("PHOTO_URL", "");
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:ldc1            #62  <String "PHOTO_URL">
	//   19   36:ldc1            #50  <String "">
	//   20   38:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   21   41:putfield        #64  <Field String photoUrl>
		signinresp.mAccessToken = bundle.getString("ACCESSTOKEN", "");
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:ldc1            #65  <String "ACCESSTOKEN">
	//   25   48:ldc1            #50  <String "">
	//   26   50:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   27   53:putfield        #67  <Field String mAccessToken>
		signinresp.mUserStatus = bundle.getString("STATUS", "");
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:ldc1            #68  <String "STATUS">
	//   31   60:ldc1            #50  <String "">
	//   32   62:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   33   65:putfield        #70  <Field String mUserStatus>
		signinresp.mGender = bundle.getString("GENDER", "");
	//   34   68:aload_1         
	//   35   69:aload_0         
	//   36   70:ldc1            #71  <String "GENDER">
	//   37   72:ldc1            #50  <String "">
	//   38   74:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   39   77:putfield        #73  <Field String mGender>
		signinresp.mScopeUri = bundle.getString("SCOPE", "");
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:ldc1            #74  <String "SCOPE">
	//   43   84:ldc1            #50  <String "">
	//   44   86:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   45   89:putfield        #76  <Field String mScopeUri>
		signinresp.mOpenId = bundle.getString("OPEN_ID", "");
	//   46   92:aload_1         
	//   47   93:aload_0         
	//   48   94:ldc1            #77  <String "OPEN_ID">
	//   49   96:ldc1            #50  <String "">
	//   50   98:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   51  101:putfield        #79  <Field String mOpenId>
		signinresp.mServiceCountryCode = bundle.getString("SERVICE_COUNTRY_CODE", "");
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:ldc1            #80  <String "SERVICE_COUNTRY_CODE">
	//   55  108:ldc1            #50  <String "">
	//   56  110:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   57  113:putfield        #82  <Field String mServiceCountryCode>
		signinresp.mServiceAuthCode = bundle.getString("SERVICE_AUTH_CODE", "");
	//   58  116:aload_1         
	//   59  117:aload_0         
	//   60  118:ldc1            #83  <String "SERVICE_AUTH_CODE">
	//   61  120:ldc1            #50  <String "">
	//   62  122:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   63  125:putfield        #85  <Field String mServiceAuthCode>
		signinresp.mUnionID = bundle.getString("UNION_ID", "");
	//   64  128:aload_1         
	//   65  129:aload_0         
	//   66  130:ldc1            #86  <String "UNION_ID">
	//   67  132:ldc1            #50  <String "">
	//   68  134:invokevirtual   #56  <Method String Bundle.getString(String, String)>
	//   69  137:putfield        #88  <Field String mUnionID>
		return signinresp;
	//   70  140:aload_1         
	//   71  141:areturn         
	}

	public String getAccessToken()
	{
		return mAccessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String mAccessToken>
	//    2    4:areturn         
	}

	public String getGender()
	{
		return mGender;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String mGender>
	//    2    4:areturn         
	}

	public String getLoginUserName()
	{
		return mLoginUserName;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String mLoginUserName>
	//    2    4:areturn         
	}

	public String getOpenId()
	{
		return mOpenId;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String mOpenId>
	//    2    4:areturn         
	}

	public String getPhotoUrl()
	{
		return photoUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field String photoUrl>
	//    2    4:areturn         
	}

	public String getScopeUri()
	{
		return mScopeUri;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String mScopeUri>
	//    2    4:areturn         
	}

	public String getServiceAuthCode()
	{
		return mServiceAuthCode;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String mServiceAuthCode>
	//    2    4:areturn         
	}

	public String getServiceCountryCode()
	{
		return mServiceCountryCode;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field String mServiceCountryCode>
	//    2    4:areturn         
	}

	public String getUid()
	{
		return mUid;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String mUid>
	//    2    4:areturn         
	}

	public String getUserStatus()
	{
		return mUserStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field String mUserStatus>
	//    2    4:areturn         
	}

	public String getmUnionID()
	{
		return mUnionID;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String mUnionID>
	//    2    4:areturn         
	}

	private String mAccessToken;
	private String mGender;
	private String mLoginUserName;
	private String mOpenId;
	private String mScopeUri;
	private String mServiceAuthCode;
	private String mServiceCountryCode;
	private String mUid;
	private String mUnionID;
	private String mUserStatus;
	private String photoUrl;
}
