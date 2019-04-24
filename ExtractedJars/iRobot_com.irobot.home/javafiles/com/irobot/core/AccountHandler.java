// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


// Referenced classes of package com.irobot.core:
//			AccountSessionDelegate, FeatureType, AccountFlagType

public abstract class AccountHandler
{

	public AccountHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void getSupportedBetaFeatures();

	public abstract boolean isAccountProviderSessionValid();

	public abstract void logout();

	public abstract void querySessionState();

	public abstract void refreshAccountInfo();

	public abstract void requestLegalTermsConsentDateInfo();

	public abstract void setAccountProviderApiKey(String s);

	public abstract void setAccountSessionDelegate(AccountSessionDelegate accountsessiondelegate);

	public abstract void updateAccountCountry(String s);

	public abstract void updateAccountLocale(String s);

	public abstract void updateFeatureStatus(FeatureType featuretype, long l);

	public abstract void updateFlagValue(AccountFlagType accountflagtype, boolean flag);

	public abstract void updateLegalTermsConsentDate();

	public abstract void updateMarketOptIn(boolean flag);
}
