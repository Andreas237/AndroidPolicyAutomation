// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import com.google.android.gms.common.internal.Preconditions;

public final class IdentityProviders
{

	private IdentityProviders()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public static final String getIdentityProviderForAccount(Account account)
	{
		Preconditions.checkNotNull(((Object) (account)), "account cannot be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "account cannot be null">
	//    2    3:invokestatic    #43  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		if("com.google".equals(((Object) (account.type))))
	//*   4    7:ldc1            #45  <String "com.google">
	//*   5    9:aload_0         
	//*   6   10:getfield        #50  <Field String Account.type>
	//*   7   13:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*   8   16:ifeq            22
			return "https://accounts.google.com";
	//    9   19:ldc1            #11  <String "https://accounts.google.com">
	//   10   21:areturn         
		if("com.facebook.auth.login".equals(((Object) (account.type))))
	//*  11   22:ldc1            #58  <String "com.facebook.auth.login">
	//*  12   24:aload_0         
	//*  13   25:getfield        #50  <Field String Account.type>
	//*  14   28:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  15   31:ifeq            37
			return "https://www.facebook.com";
	//   16   34:ldc1            #8   <String "https://www.facebook.com">
	//   17   36:areturn         
		else
			return null;
	//   18   37:aconst_null     
	//   19   38:areturn         
	}

	public static final String FACEBOOK = "https://www.facebook.com";
	public static final String GOOGLE = "https://accounts.google.com";
	public static final String LINKEDIN = "https://www.linkedin.com";
	public static final String MICROSOFT = "https://login.live.com";
	public static final String PAYPAL = "https://www.paypal.com";
	public static final String TWITTER = "https://twitter.com";
	public static final String YAHOO = "https://login.yahoo.com";
}
