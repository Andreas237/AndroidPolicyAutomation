// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.aws.authentication.model;

import com.amazonaws.auth.AWSSessionCredentials;

public class LoginResponseCredentials
{

	public LoginResponseCredentials()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mSecretKey = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field String mSecretKey>
		mSessionToken = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field String mSessionToken>
		mCognitoId = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #30  <Field String mCognitoId>
		mAccessKeyId = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #32  <Field String mAccessKeyId>
		mExpiration = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #34  <Field String mExpiration>
	//   17   29:return          
	}

	public String getAccessKeyId()
	{
		return mAccessKeyId;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String mAccessKeyId>
	//    2    4:areturn         
	}

	public AWSSessionCredentials getAwsCredentials()
	{
		if(isValid())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #47  <Method boolean isValid()>
	//*   2    4:ifeq            16
			return new AWSSessionCredentials() {

				public String a()
				{
					return a.mAccessKeyId;
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field LoginResponseCredentials a>
				//    2    4:invokestatic    #26  <Method String LoginResponseCredentials.access$100(LoginResponseCredentials)>
				//    3    7:areturn         
				}

				public String b()
				{
					return a.mSecretKey;
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field LoginResponseCredentials a>
				//    2    4:invokestatic    #30  <Method String LoginResponseCredentials.access$200(LoginResponseCredentials)>
				//    3    7:areturn         
				}

				public String c()
				{
					return a.mSessionToken;
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field LoginResponseCredentials a>
				//    2    4:invokestatic    #34  <Method String LoginResponseCredentials.access$000(LoginResponseCredentials)>
				//    3    7:areturn         
				}

				final LoginResponseCredentials a;

			
			{
				a = LoginResponseCredentials.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LoginResponseCredentials a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    3    7:new             #6   <Class LoginResponseCredentials$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #50  <Method void LoginResponseCredentials$1(LoginResponseCredentials)>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public String getCognitoId()
	{
		return mCognitoId;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String mCognitoId>
	//    2    4:areturn         
	}

	public String getExpiration()
	{
		return mExpiration;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String mExpiration>
	//    2    4:areturn         
	}

	public String getSecretKey()
	{
		return mSecretKey;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String mSecretKey>
	//    2    4:areturn         
	}

	public String getSessionToken()
	{
		return mSessionToken;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String mSessionToken>
	//    2    4:areturn         
	}

	public boolean isValid()
	{
		return mSecretKey != null && mSessionToken != null && mCognitoId != null && mAccessKeyId != null && mExpiration != null;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String mSecretKey>
	//    2    4:ifnull          37
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field String mSessionToken>
	//    5   11:ifnull          37
	//    6   14:aload_0         
	//    7   15:getfield        #30  <Field String mCognitoId>
	//    8   18:ifnull          37
	//    9   21:aload_0         
	//   10   22:getfield        #32  <Field String mAccessKeyId>
	//   11   25:ifnull          37
	//   12   28:aload_0         
	//   13   29:getfield        #34  <Field String mExpiration>
	//   14   32:ifnull          37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	private String mAccessKeyId;
	private String mCognitoId;
	private String mExpiration;
	private String mSecretKey;
	private String mSessionToken;


/*
	static String access$000(LoginResponseCredentials loginresponsecredentials)
	{
		return loginresponsecredentials.mSessionToken;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String mSessionToken>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(LoginResponseCredentials loginresponsecredentials)
	{
		return loginresponsecredentials.mAccessKeyId;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String mAccessKeyId>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(LoginResponseCredentials loginresponsecredentials)
	{
		return loginresponsecredentials.mSecretKey;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String mSecretKey>
	//    2    4:areturn         
	}

*/
}
