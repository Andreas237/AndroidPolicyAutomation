// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.auth;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import java.util.List;

public class AuthorizationInfo
	implements IMessageEntity
{

	public AuthorizationInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public String getAccessToken()
	{
		return accessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String accessToken>
	//    2    4:areturn         
	}

	public String getAppID()
	{
		return appID;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String appID>
	//    2    4:areturn         
	}

	public String getClientID()
	{
		return clientID;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String clientID>
	//    2    4:areturn         
	}

	public String getClientSecret()
	{
		return clientSecret;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String clientSecret>
	//    2    4:areturn         
	}

	public long getExpiredTime()
	{
		return expiredTime;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long expiredTime>
	//    2    4:lreturn         
	}

	public String getOpenId()
	{
		return openID;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String openID>
	//    2    4:areturn         
	}

	public String getRefreshToken()
	{
		return refreshToken;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String refreshToken>
	//    2    4:areturn         
	}

	public List getScopeList()
	{
		return scopeList;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List scopeList>
	//    2    4:areturn         
	}

	public boolean isTokenExpire()
	{
		return System.currentTimeMillis() > expiredTime;
	//    0    0:invokestatic    #60  <Method long System.currentTimeMillis()>
	//    1    3:aload_0         
	//    2    4:getfield        #41  <Field long expiredTime>
	//    3    7:lcmp            
	//    4    8:ifle            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean isValid()
	{
		return TextUtils.isEmpty(((CharSequence) (appID)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String appID>
	//    2    4:invokestatic    #67  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:ireturn         
	}

	public void setAccessToken(String s)
	{
		accessToken = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String accessToken>
	//    3    5:return          
	}

	public void setAppID(String s)
	{
		appID = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String appID>
	//    3    5:return          
	}

	public void setClientID(String s)
	{
		clientID = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String clientID>
	//    3    5:return          
	}

	public void setClientSecret(String s)
	{
		clientSecret = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String clientSecret>
	//    3    5:return          
	}

	public void setExpiredTime(long l)
	{
		expiredTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #41  <Field long expiredTime>
	//    3    5:return          
	}

	public void setOpenID(String s)
	{
		openID = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String openID>
	//    3    5:return          
	}

	public void setRefreshToken(String s)
	{
		refreshToken = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field String refreshToken>
	//    3    5:return          
	}

	public void setScopeList(List list)
	{
		scopeList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field List scopeList>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("appID:").append(appID);
	//    4    8:aload_1         
	//    5    9:ldc1            #85  <String "appID:">
	//    6   11:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:aload_0         
	//    8   15:getfield        #31  <Field String appID>
	//    9   18:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		stringbuilder.append(", expiredTime:").append(expiredTime);
	//   11   22:aload_1         
	//   12   23:ldc1            #91  <String ", expiredTime:">
	//   13   25:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:aload_0         
	//   15   29:getfield        #41  <Field long expiredTime>
	//   16   32:invokevirtual   #94  <Method StringBuilder StringBuilder.append(long)>
	//   17   35:pop             
		return stringbuilder.toString();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   20   40:areturn         
	}

	private String accessToken;
	private String appID;
	private String clientID;
	private String clientSecret;
	private long expiredTime;
	private String openID;
	private String refreshToken;
	private List scopeList;
}
