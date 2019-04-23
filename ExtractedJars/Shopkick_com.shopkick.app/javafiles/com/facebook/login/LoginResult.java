// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import com.facebook.AccessToken;
import java.util.Set;

public class LoginResult
{

	public LoginResult(AccessToken accesstoken, Set set, Set set1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		accessToken = accesstoken;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field AccessToken accessToken>
		recentlyGrantedPermissions = set;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Set recentlyGrantedPermissions>
		recentlyDeniedPermissions = set1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #21  <Field Set recentlyDeniedPermissions>
	//   11   19:return          
	}

	public AccessToken getAccessToken()
	{
		return accessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AccessToken accessToken>
	//    2    4:areturn         
	}

	public Set getRecentlyDeniedPermissions()
	{
		return recentlyDeniedPermissions;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Set recentlyDeniedPermissions>
	//    2    4:areturn         
	}

	public Set getRecentlyGrantedPermissions()
	{
		return recentlyGrantedPermissions;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Set recentlyGrantedPermissions>
	//    2    4:areturn         
	}

	private final AccessToken accessToken;
	private final Set recentlyDeniedPermissions;
	private final Set recentlyGrantedPermissions;
}
