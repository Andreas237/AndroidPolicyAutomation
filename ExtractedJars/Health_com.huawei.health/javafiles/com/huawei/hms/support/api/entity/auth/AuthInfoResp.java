// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.auth;


// Referenced classes of package com.huawei.hms.support.api.entity.auth:
//			AbstractResp, AuthorizationInfo

public class AuthInfoResp extends AbstractResp
{

	public AuthInfoResp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractResp()>
	//    2    4:return          
	}

	public AuthorizationInfo getAuthInfo()
	{
		return authInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AuthorizationInfo authInfo>
	//    2    4:areturn         
	}

	public int getRtnCode()
	{
		return super.getRtnCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method int AbstractResp.getRtnCode()>
	//    2    4:ireturn         
	}

	public void setAuthInfo(AuthorizationInfo authorizationinfo)
	{
		authInfo = authorizationinfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AuthorizationInfo authInfo>
	//    3    5:return          
	}

	private AuthorizationInfo authInfo;
}
