// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.io.Serializable;

class AccessTokenAppIdPair
	implements Serializable
{
	static class SerializationProxyV1
		implements Serializable
	{

		private Object readResolve()
		{
			return ((Object) (new AccessTokenAppIdPair(accessTokenString, appId)));
		//    0    0:new             #8   <Class AccessTokenAppIdPair>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field String accessTokenString>
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field String appId>
		//    6   12:invokespecial   #32  <Method void AccessTokenAppIdPair(String, String)>
		//    7   15:areturn         
		}

		private static final long serialVersionUID = 0x317ab613L;
		private final String accessTokenString;
		private final String appId;

		private SerializationProxyV1(String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			accessTokenString = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field String accessTokenString>
			appId = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field String appId>
		//    8   14:return          
		}

	}


	public AccessTokenAppIdPair(AccessToken accesstoken)
	{
		this(accesstoken.getToken(), FacebookSdk.getApplicationId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #26  <Method String AccessToken.getToken()>
	//    3    5:invokestatic    #31  <Method String FacebookSdk.getApplicationId()>
	//    4    8:invokespecial   #34  <Method void AccessTokenAppIdPair(String, String)>
	//    5   11:return          
	}

	public AccessTokenAppIdPair(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		String s2 = s;
	//    2    4:aload_1         
	//    3    5:astore_3        
		if(Utility.isNullOrEmpty(s))
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #44  <Method boolean Utility.isNullOrEmpty(String)>
	//*   6   10:ifeq            15
			s2 = null;
	//    7   13:aconst_null     
	//    8   14:astore_3        
		accessTokenString = s2;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #46  <Field String accessTokenString>
		applicationId = s1;
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:putfield        #48  <Field String applicationId>
	//   15   25:return          
	}

	private Object writeReplace()
	{
		return ((Object) (new SerializationProxyV1(accessTokenString, applicationId)));
	//    0    0:new             #10  <Class AccessTokenAppIdPair$SerializationProxyV1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field String accessTokenString>
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field String applicationId>
	//    6   12:aconst_null     
	//    7   13:invokespecial   #53  <Method void AccessTokenAppIdPair$SerializationProxyV1(String, String, AccessTokenAppIdPair$1)>
	//    8   16:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof AccessTokenAppIdPair;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class AccessTokenAppIdPair>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((AccessTokenAppIdPair)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class AccessTokenAppIdPair>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(Utility.areObjectsEqual(((Object) (((AccessTokenAppIdPair) (obj)).accessTokenString)), ((Object) (accessTokenString))))
	//*  14   20:aload_1         
	//*  15   21:getfield        #46  <Field String accessTokenString>
	//*  16   24:aload_0         
	//*  17   25:getfield        #46  <Field String accessTokenString>
	//*  18   28:invokestatic    #59  <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  19   31:ifeq            52
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(Utility.areObjectsEqual(((Object) (((AccessTokenAppIdPair) (obj)).applicationId)), ((Object) (applicationId))))
	//*  22   36:aload_1         
	//*  23   37:getfield        #48  <Field String applicationId>
	//*  24   40:aload_0         
	//*  25   41:getfield        #48  <Field String applicationId>
	//*  26   44:invokestatic    #59  <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  27   47:ifeq            52
				flag = true;
	//   28   50:iconst_1        
	//   29   51:istore_2        
		}
		return flag;
	//   30   52:iload_2         
	//   31   53:ireturn         
	}

	public String getAccessTokenString()
	{
		return accessTokenString;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String accessTokenString>
	//    2    4:areturn         
	}

	public String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String applicationId>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		String s = accessTokenString;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String accessTokenString>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(s == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       16
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		else
	//*   9   13:goto            21
			i = s.hashCode();
	//   10   16:aload_3         
	//   11   17:invokevirtual   #66  <Method int String.hashCode()>
	//   12   20:istore_1        
		s = applicationId;
	//   13   21:aload_0         
	//   14   22:getfield        #48  <Field String applicationId>
	//   15   25:astore_3        
		if(s != null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       33
	//*  18   30:goto            38
			j = s.hashCode();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #66  <Method int String.hashCode()>
	//   21   37:istore_2        
		return i ^ j;
	//   22   38:iload_1         
	//   23   39:iload_2         
	//   24   40:ixor            
	//   25   41:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private final String accessTokenString;
	private final String applicationId;
}
