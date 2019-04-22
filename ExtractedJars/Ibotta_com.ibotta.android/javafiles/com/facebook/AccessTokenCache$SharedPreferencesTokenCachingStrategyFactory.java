// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			AccessTokenCache, LegacyTokenHelper, FacebookSdk

static class AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory
{

	public LegacyTokenHelper create()
	{
		return new LegacyTokenHelper(FacebookSdk.getApplicationContext());
	//    0    0:new             #16  <Class LegacyTokenHelper>
	//    1    3:dup             
	//    2    4:invokestatic    #22  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    3    7:invokespecial   #25  <Method void LegacyTokenHelper(android.content.Context)>
	//    4   10:areturn         
	}

	AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
