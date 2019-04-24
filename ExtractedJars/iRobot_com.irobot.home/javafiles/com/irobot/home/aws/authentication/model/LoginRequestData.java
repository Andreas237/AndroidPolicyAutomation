// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.aws.authentication.model;

import com.irobot.core.AccountInfo;
import com.irobot.core.AccountLoginData;

public class LoginRequestData
{

	public LoginRequestData(String s, String s1, String s2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mUid = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field String mUid>
		mSignature = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #29  <Field String mSignature>
		mTimestamp = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #31  <Field String mTimestamp>
		mAppId = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #33  <Field String mAppId>
		mUid = s;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #27  <Field String mUid>
		mSignature = s1;
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:putfield        #29  <Field String mSignature>
		mTimestamp = s2;
	//   20   34:aload_0         
	//   21   35:aload_3         
	//   22   36:putfield        #31  <Field String mTimestamp>
		mAppId = s3;
	//   23   39:aload_0         
	//   24   40:aload           4
	//   25   42:putfield        #33  <Field String mAppId>
		mLoginPath = "/login/account";
	//   26   45:aload_0         
	//   27   46:ldc1            #9   <String "/login/account">
	//   28   48:putfield        #35  <Field String mLoginPath>
	//   29   51:return          
	}

	public static LoginRequestData create(AccountInfo accountinfo, String s)
	{
		return new LoginRequestData(accountinfo.accountLoginData().uid(), accountinfo.accountLoginData().signature(), accountinfo.accountLoginData().timestamp(), s);
	//    0    0:new             #2   <Class LoginRequestData>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #44  <Method AccountLoginData AccountInfo.accountLoginData()>
	//    4    8:invokevirtual   #49  <Method String AccountLoginData.uid()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #44  <Method AccountLoginData AccountInfo.accountLoginData()>
	//    7   15:invokevirtual   #51  <Method String AccountLoginData.signature()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #44  <Method AccountLoginData AccountInfo.accountLoginData()>
	//   10   22:invokevirtual   #53  <Method String AccountLoginData.timestamp()>
	//   11   25:aload_1         
	//   12   26:invokespecial   #55  <Method void LoginRequestData(String, String, String, String)>
	//   13   29:areturn         
	}

	public String getAppId()
	{
		return mAppId;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mAppId>
	//    2    4:areturn         
	}

	public String getLoginPath()
	{
		return mLoginPath;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mLoginPath>
	//    2    4:areturn         
	}

	public String getSignature()
	{
		return mSignature;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String mSignature>
	//    2    4:areturn         
	}

	public String getTimestamp()
	{
		return mTimestamp;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String mTimestamp>
	//    2    4:areturn         
	}

	public String getUid()
	{
		return mUid;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String mUid>
	//    2    4:areturn         
	}

	public void setAppId(String s)
	{
		mAppId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String mAppId>
	//    3    5:return          
	}

	public void setSignature(String s)
	{
		mSignature = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String mSignature>
	//    3    5:return          
	}

	public void setTimestamp(String s)
	{
		mTimestamp = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String mTimestamp>
	//    3    5:return          
	}

	public void setUid(String s)
	{
		mUid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String mUid>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{ UID: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #71  <String "{ UID: ">
	//    6   11:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mUid);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #27  <Field String mUid>
	//   11   20:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", Signature: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #77  <String ", Signature: ">
	//   15   27:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mSignature);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #29  <Field String mSignature>
	//   20   36:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(", Timestamp: ");
	//   22   40:aload_1         
	//   23   41:ldc1            #79  <String ", Timestamp: ">
	//   24   43:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mTimestamp);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field String mTimestamp>
	//   29   52:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(", AppId: ");
	//   31   56:aload_1         
	//   32   57:ldc1            #81  <String ", AppId: ">
	//   33   59:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mAppId);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #33  <Field String mAppId>
	//   38   68:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		stringbuilder.append(" }");
	//   40   72:aload_1         
	//   41   73:ldc1            #83  <String " }">
	//   42   75:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	private static final String LOGIN_URL_PATH = "/login/account";
	private String mAppId;
	private String mLoginPath;
	private String mSignature;
	private String mTimestamp;
	private String mUid;
}
