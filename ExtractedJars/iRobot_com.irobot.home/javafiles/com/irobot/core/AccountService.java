// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AccountInfo, AccountFlagType, AssetId, FeatureType, 
//			AccountUIServiceDataCallback, HttpCallback, AccountUIServiceCommand, AccountUIServiceData, 
//			AccountHandler

public abstract class AccountService
{
	private static final class CppProxy extends AccountService
	{

		private native void nativeDestroy(long l);

		private native void native_consentLegalTerms(long l);

		private native AccountInfo native_getAccountInfo(long l);

		private native boolean native_getValueForAccountFlag(long l, AccountFlagType accountflagtype);

		private native boolean native_hasLoggedInBefore(long l);

		private native void native_initializeAccountSession(long l);

		private native boolean native_isAccountProviderInitialized(long l);

		private native boolean native_isAccountProviderSessionValid(long l);

		private native boolean native_isAssetAssociatedWithAccount(long l, AssetId assetid);

		private native boolean native_isBetaFeatureAvailable(long l, FeatureType featuretype);

		private native boolean native_isEligibleForBetaProgram(long l);

		private native boolean native_isFeatureEnabled(long l, FeatureType featuretype);

		private native boolean native_isLoggedIn(long l);

		private native boolean native_isSmartHomeAvailable(long l);

		private native void native_logout(long l);

		private native void native_refreshAccountInfo(long l);

		private native boolean native_registerSubscriber(long l, AccountUIServiceDataCallback accountuiservicedatacallback);

		private native boolean native_registerUISubscriber(long l, AccountUIServiceDataCallback accountuiservicedatacallback);

		private native void native_removeAssetAssociationWithAccount(long l, AssetId assetid);

		private native void native_requestAccountDeletion(long l, HttpCallback httpcallback);

		private native void native_requestLegalTermsConsentDate(long l);

		private native void native_requestPersonalInformation(long l, HttpCallback httpcallback);

		private native boolean native_requiresMultiAccountSupport(long l);

		private native boolean native_requiresOptInUnchecked(long l);

		private native void native_sendCommand(long l, AccountUIServiceCommand accountuiservicecommand, AccountUIServiceData accountuiservicedata);

		private native void native_sendRequest(long l, String s, HashMap hashmap, HttpCallback httpcallback);

		private native void native_setAccountHandler(long l, AccountHandler accounthandler);

		private native void native_setCountryCode(long l, String s);

		private native void native_setLocale(long l, String s);

		private native boolean native_unregisterSubscriber(long l, AccountUIServiceDataCallback accountuiservicedatacallback);

		private native void native_updateAccountFlag(long l, AccountFlagType accountflagtype, boolean flag);

		private native void native_updateFeatureStatus(long l, FeatureType featuretype, boolean flag);

		private native void native_updateMarketOptInValue(long l, boolean flag);

		public void consentLegalTerms()
		{
			native_consentLegalTerms(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #86  <Method void native_consentLegalTerms(long)>
		//    4    8:return          
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #91  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #93  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #96  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #100 <Method void Object.finalize()>
		//    4    8:return          
		}

		public AccountInfo getAccountInfo()
		{
			return native_getAccountInfo(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #104 <Method AccountInfo native_getAccountInfo(long)>
		//    4    8:areturn         
		}

		public boolean getValueForAccountFlag(AccountFlagType accountflagtype)
		{
			return native_getValueForAccountFlag(nativeRef, accountflagtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #108 <Method boolean native_getValueForAccountFlag(long, AccountFlagType)>
		//    5    9:ireturn         
		}

		public boolean hasLoggedInBefore()
		{
			return native_hasLoggedInBefore(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #112 <Method boolean native_hasLoggedInBefore(long)>
		//    4    8:ireturn         
		}

		public void initializeAccountSession()
		{
			native_initializeAccountSession(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #115 <Method void native_initializeAccountSession(long)>
		//    4    8:return          
		}

		public boolean isAccountProviderInitialized()
		{
			return native_isAccountProviderInitialized(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #118 <Method boolean native_isAccountProviderInitialized(long)>
		//    4    8:ireturn         
		}

		public boolean isAccountProviderSessionValid()
		{
			return native_isAccountProviderSessionValid(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #121 <Method boolean native_isAccountProviderSessionValid(long)>
		//    4    8:ireturn         
		}

		public boolean isAssetAssociatedWithAccount(AssetId assetid)
		{
			return native_isAssetAssociatedWithAccount(nativeRef, assetid);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #125 <Method boolean native_isAssetAssociatedWithAccount(long, AssetId)>
		//    5    9:ireturn         
		}

		public boolean isBetaFeatureAvailable(FeatureType featuretype)
		{
			return native_isBetaFeatureAvailable(nativeRef, featuretype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #129 <Method boolean native_isBetaFeatureAvailable(long, FeatureType)>
		//    5    9:ireturn         
		}

		public boolean isEligibleForBetaProgram()
		{
			return native_isEligibleForBetaProgram(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #132 <Method boolean native_isEligibleForBetaProgram(long)>
		//    4    8:ireturn         
		}

		public boolean isFeatureEnabled(FeatureType featuretype)
		{
			return native_isFeatureEnabled(nativeRef, featuretype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #135 <Method boolean native_isFeatureEnabled(long, FeatureType)>
		//    5    9:ireturn         
		}

		public boolean isLoggedIn()
		{
			return native_isLoggedIn(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #138 <Method boolean native_isLoggedIn(long)>
		//    4    8:ireturn         
		}

		public boolean isSmartHomeAvailable()
		{
			return native_isSmartHomeAvailable(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #141 <Method boolean native_isSmartHomeAvailable(long)>
		//    4    8:ireturn         
		}

		public void logout()
		{
			native_logout(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #144 <Method void native_logout(long)>
		//    4    8:return          
		}

		public void refreshAccountInfo()
		{
			native_refreshAccountInfo(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #147 <Method void native_refreshAccountInfo(long)>
		//    4    8:return          
		}

		public boolean registerSubscriber(AccountUIServiceDataCallback accountuiservicedatacallback)
		{
			return native_registerSubscriber(nativeRef, accountuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #151 <Method boolean native_registerSubscriber(long, AccountUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public boolean registerUISubscriber(AccountUIServiceDataCallback accountuiservicedatacallback)
		{
			return native_registerUISubscriber(nativeRef, accountuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #154 <Method boolean native_registerUISubscriber(long, AccountUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public void removeAssetAssociationWithAccount(AssetId assetid)
		{
			native_removeAssetAssociationWithAccount(nativeRef, assetid);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #158 <Method void native_removeAssetAssociationWithAccount(long, AssetId)>
		//    5    9:return          
		}

		public void requestAccountDeletion(HttpCallback httpcallback)
		{
			native_requestAccountDeletion(nativeRef, httpcallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #162 <Method void native_requestAccountDeletion(long, HttpCallback)>
		//    5    9:return          
		}

		public void requestLegalTermsConsentDate()
		{
			native_requestLegalTermsConsentDate(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #165 <Method void native_requestLegalTermsConsentDate(long)>
		//    4    8:return          
		}

		public void requestPersonalInformation(HttpCallback httpcallback)
		{
			native_requestPersonalInformation(nativeRef, httpcallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #168 <Method void native_requestPersonalInformation(long, HttpCallback)>
		//    5    9:return          
		}

		public boolean requiresMultiAccountSupport()
		{
			return native_requiresMultiAccountSupport(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #171 <Method boolean native_requiresMultiAccountSupport(long)>
		//    4    8:ireturn         
		}

		public boolean requiresOptInUnchecked()
		{
			return native_requiresOptInUnchecked(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #174 <Method boolean native_requiresOptInUnchecked(long)>
		//    4    8:ireturn         
		}

		public void sendCommand(AccountUIServiceCommand accountuiservicecommand, AccountUIServiceData accountuiservicedata)
		{
			native_sendCommand(nativeRef, accountuiservicecommand, accountuiservicedata);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #178 <Method void native_sendCommand(long, AccountUIServiceCommand, AccountUIServiceData)>
		//    6   10:return          
		}

		public void sendRequest(String s, HashMap hashmap, HttpCallback httpcallback)
		{
			native_sendRequest(nativeRef, s, hashmap, httpcallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:invokespecial   #182 <Method void native_sendRequest(long, String, HashMap, HttpCallback)>
		//    7   11:return          
		}

		public void setAccountHandler(AccountHandler accounthandler)
		{
			native_setAccountHandler(nativeRef, accounthandler);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #188 <Method void native_setAccountHandler(long, AccountHandler)>
		//    5    9:return          
		}

		public void setCountryCode(String s)
		{
			native_setCountryCode(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #191 <Method void native_setCountryCode(long, String)>
		//    5    9:return          
		}

		public void setLocale(String s)
		{
			native_setLocale(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #194 <Method void native_setLocale(long, String)>
		//    5    9:return          
		}

		public boolean unregisterSubscriber(AccountUIServiceDataCallback accountuiservicedatacallback)
		{
			return native_unregisterSubscriber(nativeRef, accountuiservicedatacallback);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #197 <Method boolean native_unregisterSubscriber(long, AccountUIServiceDataCallback)>
		//    5    9:ireturn         
		}

		public void updateAccountFlag(AccountFlagType accountflagtype, boolean flag)
		{
			native_updateAccountFlag(nativeRef, accountflagtype, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #201 <Method void native_updateAccountFlag(long, AccountFlagType, boolean)>
		//    6   10:return          
		}

		public void updateFeatureStatus(FeatureType featuretype, boolean flag)
		{
			native_updateFeatureStatus(nativeRef, featuretype, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #205 <Method void native_updateFeatureStatus(long, FeatureType, boolean)>
		//    6   10:return          
		}

		public void updateMarketOptInValue(boolean flag)
		{
			native_updateMarketOptInValue(nativeRef, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #208 <Method void native_updateMarketOptInValue(long, boolean)>
		//    5    9:return          
		}

		static final boolean $assertionsDisabled = false;
		private final AtomicBoolean destroyed = new AtomicBoolean(false);
		private final long nativeRef;

		static 
		{
		//    0    0:return          
		}

		private CppProxy(long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void AccountService()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class AtomicBoolean>
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:invokespecial   #24  <Method void AtomicBoolean(boolean)>
		//    7   13:putfield        #26  <Field AtomicBoolean destroyed>
			if(l == 0L)
		//*   8   16:lload_1         
		//*   9   17:lconst_0        
		//*  10   18:lcmp            
		//*  11   19:ifne            32
			{
				throw new RuntimeException("nativeRef is zero");
		//   12   22:new             #28  <Class RuntimeException>
		//   13   25:dup             
		//   14   26:ldc1            #30  <String "nativeRef is zero">
		//   15   28:invokespecial   #33  <Method void RuntimeException(String)>
		//   16   31:athrow          
			} else
			{
				nativeRef = l;
		//   17   32:aload_0         
		//   18   33:lload_1         
		//   19   34:putfield        #35  <Field long nativeRef>
				return;
		//   20   37:return          
			}
		}
	}


	public AccountService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void consentLegalTerms();

	public abstract AccountInfo getAccountInfo();

	public abstract boolean getValueForAccountFlag(AccountFlagType accountflagtype);

	public abstract boolean hasLoggedInBefore();

	public abstract void initializeAccountSession();

	public abstract boolean isAccountProviderInitialized();

	public abstract boolean isAccountProviderSessionValid();

	public abstract boolean isAssetAssociatedWithAccount(AssetId assetid);

	public abstract boolean isBetaFeatureAvailable(FeatureType featuretype);

	public abstract boolean isEligibleForBetaProgram();

	public abstract boolean isFeatureEnabled(FeatureType featuretype);

	public abstract boolean isLoggedIn();

	public abstract boolean isSmartHomeAvailable();

	public abstract void logout();

	public abstract void refreshAccountInfo();

	public abstract boolean registerSubscriber(AccountUIServiceDataCallback accountuiservicedatacallback);

	public abstract boolean registerUISubscriber(AccountUIServiceDataCallback accountuiservicedatacallback);

	public abstract void removeAssetAssociationWithAccount(AssetId assetid);

	public abstract void requestAccountDeletion(HttpCallback httpcallback);

	public abstract void requestLegalTermsConsentDate();

	public abstract void requestPersonalInformation(HttpCallback httpcallback);

	public abstract boolean requiresMultiAccountSupport();

	public abstract boolean requiresOptInUnchecked();

	public abstract void sendCommand(AccountUIServiceCommand accountuiservicecommand, AccountUIServiceData accountuiservicedata);

	public abstract void sendRequest(String s, HashMap hashmap, HttpCallback httpcallback);

	public abstract void setAccountHandler(AccountHandler accounthandler);

	public abstract void setCountryCode(String s);

	public abstract void setLocale(String s);

	public abstract boolean unregisterSubscriber(AccountUIServiceDataCallback accountuiservicedatacallback);

	public abstract void updateAccountFlag(AccountFlagType accountflagtype, boolean flag);

	public abstract void updateFeatureStatus(FeatureType featuretype, boolean flag);

	public abstract void updateMarketOptInValue(boolean flag);
}
