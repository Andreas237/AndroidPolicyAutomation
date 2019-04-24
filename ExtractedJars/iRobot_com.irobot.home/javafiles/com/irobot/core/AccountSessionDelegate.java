// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			FeatureType, AccountFlagType, AccountInfo, AccountError

public abstract class AccountSessionDelegate
{
	private static final class CppProxy extends AccountSessionDelegate
	{

		private native void nativeDestroy(long l);

		private native void native_onAccountConsentDateReceived(long l, String s);

		private native void native_onAccountConsentDateUpdateFailed(long l);

		private native void native_onAccountConsentDateUpdated(long l);

		private native void native_onAccountCountryUpdated(long l, String s);

		private native void native_onAccountFeatureStatusUpdateFailed(long l, FeatureType featuretype);

		private native void native_onAccountFeatureStatusUpdated(long l, FeatureType featuretype, long l1);

		private native void native_onAccountFlagValueUpdateFailed(long l, AccountFlagType accountflagtype);

		private native void native_onAccountFlagValueUpdated(long l, AccountFlagType accountflagtype, boolean flag);

		private native void native_onAccountInfoRefresh(long l, AccountInfo accountinfo);

		private native void native_onAccountLocaleUpdated(long l, String s);

		private native void native_onAccountMarketOptInUpdated(long l, boolean flag);

		private native void native_onAccountProviderInitialized(long l, HashSet hashset);

		private native void native_onFailure(long l, AccountError accounterror);

		private native void native_onLogin(long l, AccountInfo accountinfo, boolean flag);

		private native void native_onLogout(long l);

		private native void native_onLogoutFailed(long l);

		private native void native_onSessionInvalid(long l);

		private native void native_onSupportedBetaFeaturesUpdated(long l, HashSet hashset);

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #69  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #71  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #74  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #78  <Method void Object.finalize()>
		//    4    8:return          
		}

		public void onAccountConsentDateReceived(String s)
		{
			native_onAccountConsentDateReceived(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #81  <Method void native_onAccountConsentDateReceived(long, String)>
		//    5    9:return          
		}

		public void onAccountConsentDateUpdateFailed()
		{
			native_onAccountConsentDateUpdateFailed(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #84  <Method void native_onAccountConsentDateUpdateFailed(long)>
		//    4    8:return          
		}

		public void onAccountConsentDateUpdated()
		{
			native_onAccountConsentDateUpdated(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #87  <Method void native_onAccountConsentDateUpdated(long)>
		//    4    8:return          
		}

		public void onAccountCountryUpdated(String s)
		{
			native_onAccountCountryUpdated(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #90  <Method void native_onAccountCountryUpdated(long, String)>
		//    5    9:return          
		}

		public void onAccountFeatureStatusUpdateFailed(FeatureType featuretype)
		{
			native_onAccountFeatureStatusUpdateFailed(nativeRef, featuretype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #94  <Method void native_onAccountFeatureStatusUpdateFailed(long, FeatureType)>
		//    5    9:return          
		}

		public void onAccountFeatureStatusUpdated(FeatureType featuretype, long l)
		{
			native_onAccountFeatureStatusUpdated(nativeRef, featuretype, l);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:lload_2         
		//    5    7:invokespecial   #98  <Method void native_onAccountFeatureStatusUpdated(long, FeatureType, long)>
		//    6   10:return          
		}

		public void onAccountFlagValueUpdateFailed(AccountFlagType accountflagtype)
		{
			native_onAccountFlagValueUpdateFailed(nativeRef, accountflagtype);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #102 <Method void native_onAccountFlagValueUpdateFailed(long, AccountFlagType)>
		//    5    9:return          
		}

		public void onAccountFlagValueUpdated(AccountFlagType accountflagtype, boolean flag)
		{
			native_onAccountFlagValueUpdated(nativeRef, accountflagtype, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #106 <Method void native_onAccountFlagValueUpdated(long, AccountFlagType, boolean)>
		//    6   10:return          
		}

		public void onAccountInfoRefresh(AccountInfo accountinfo)
		{
			native_onAccountInfoRefresh(nativeRef, accountinfo);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #110 <Method void native_onAccountInfoRefresh(long, AccountInfo)>
		//    5    9:return          
		}

		public void onAccountLocaleUpdated(String s)
		{
			native_onAccountLocaleUpdated(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #113 <Method void native_onAccountLocaleUpdated(long, String)>
		//    5    9:return          
		}

		public void onAccountMarketOptInUpdated(boolean flag)
		{
			native_onAccountMarketOptInUpdated(nativeRef, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #116 <Method void native_onAccountMarketOptInUpdated(long, boolean)>
		//    5    9:return          
		}

		public void onAccountProviderInitialized(HashSet hashset)
		{
			native_onAccountProviderInitialized(nativeRef, hashset);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #120 <Method void native_onAccountProviderInitialized(long, HashSet)>
		//    5    9:return          
		}

		public void onFailure(AccountError accounterror)
		{
			native_onFailure(nativeRef, accounterror);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #126 <Method void native_onFailure(long, AccountError)>
		//    5    9:return          
		}

		public void onLogin(AccountInfo accountinfo, boolean flag)
		{
			native_onLogin(nativeRef, accountinfo, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #130 <Method void native_onLogin(long, AccountInfo, boolean)>
		//    6   10:return          
		}

		public void onLogout()
		{
			native_onLogout(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #133 <Method void native_onLogout(long)>
		//    4    8:return          
		}

		public void onLogoutFailed()
		{
			native_onLogoutFailed(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #136 <Method void native_onLogoutFailed(long)>
		//    4    8:return          
		}

		public void onSessionInvalid()
		{
			native_onSessionInvalid(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #139 <Method void native_onSessionInvalid(long)>
		//    4    8:return          
		}

		public void onSupportedBetaFeaturesUpdated(HashSet hashset)
		{
			native_onSupportedBetaFeaturesUpdated(nativeRef, hashset);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #142 <Method void native_onSupportedBetaFeaturesUpdated(long, HashSet)>
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
		//    1    1:invokespecial   #19  <Method void AccountSessionDelegate()>
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


	public AccountSessionDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public abstract void onAccountConsentDateReceived(String s);

	public abstract void onAccountConsentDateUpdateFailed();

	public abstract void onAccountConsentDateUpdated();

	public abstract void onAccountCountryUpdated(String s);

	public abstract void onAccountFeatureStatusUpdateFailed(FeatureType featuretype);

	public abstract void onAccountFeatureStatusUpdated(FeatureType featuretype, long l);

	public abstract void onAccountFlagValueUpdateFailed(AccountFlagType accountflagtype);

	public abstract void onAccountFlagValueUpdated(AccountFlagType accountflagtype, boolean flag);

	public abstract void onAccountInfoRefresh(AccountInfo accountinfo);

	public abstract void onAccountLocaleUpdated(String s);

	public abstract void onAccountMarketOptInUpdated(boolean flag);

	public abstract void onAccountProviderInitialized(HashSet hashset);

	public abstract void onFailure(AccountError accounterror);

	public abstract void onLogin(AccountInfo accountinfo, boolean flag);

	public abstract void onLogout();

	public abstract void onLogoutFailed();

	public abstract void onSessionInvalid();

	public abstract void onSupportedBetaFeaturesUpdated(HashSet hashset);
}
