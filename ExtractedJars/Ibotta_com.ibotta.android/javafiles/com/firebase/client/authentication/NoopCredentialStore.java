// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.firebase.client.CredentialStore;
import com.firebase.client.core.Context;
import com.firebase.client.utilities.LogWrapper;

public class NoopCredentialStore
	implements CredentialStore
{

	public NoopCredentialStore(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		logger = context.getLogger("CredentialStore");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #15  <String "CredentialStore">
	//    5    8:invokevirtual   #21  <Method LogWrapper Context.getLogger(String)>
	//    6   11:putfield        #23  <Field LogWrapper logger>
	//    7   14:return          
	}

	public boolean clearCredential(String s, String s1)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String loadCredential(String s, String s1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean storeCredential(String s, String s1, String s2)
	{
		logger.warn("Using no-op credential store. Not persisting credentials! If you want to persist authentication, please use a custom implementation of CredentialStore.");
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field LogWrapper logger>
	//    2    4:ldc1            #32  <String "Using no-op credential store. Not persisting credentials! If you want to persist authentication, please use a custom implementation of CredentialStore.">
	//    3    6:invokevirtual   #38  <Method void LogWrapper.warn(String)>
		return true;
	//    4    9:iconst_1        
	//    5   10:ireturn         
	}

	private final LogWrapper logger;
}
