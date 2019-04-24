// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.irobot.core:
//			AccountLoginData, AccountFlagType, LegalTermType, FeatureType

public abstract class AccountInfo
{
	private static final class CppProxy extends AccountInfo
	{

		private native void nativeDestroy(long l);

		private native HashMap native_accountFlagMap(long l);

		private native AccountLoginData native_accountLoginData(long l);

		private native HashMap native_consentDateMap(long l);

		private native String native_country(long l);

		private native String native_email(long l);

		private native HashMap native_featureMap(long l);

		private native String native_firstName(long l);

		private native boolean native_isValid(long l);

		private native String native_lastName(long l);

		private native String native_locale(long l);

		private native boolean native_promoOptIn(long l);

		private native void native_setPromoOptIn(long l, boolean flag);

		private native void native_updateAccountFlagMap(long l, AccountFlagType accountflagtype, boolean flag);

		private native void native_updateConsentDateMap(long l, LegalTermType legaltermtype, Date date);

		private native void native_updateCountry(long l, String s);

		private native void native_updateFeatureMap(long l, FeatureType featuretype, long l1);

		private native void native_updateLocale(long l, String s);

		public HashMap accountFlagMap()
		{
			return native_accountFlagMap(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #66  <Method HashMap native_accountFlagMap(long)>
		//    4    8:areturn         
		}

		public AccountLoginData accountLoginData()
		{
			return native_accountLoginData(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #72  <Method AccountLoginData native_accountLoginData(long)>
		//    4    8:areturn         
		}

		public HashMap consentDateMap()
		{
			return native_consentDateMap(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #75  <Method HashMap native_consentDateMap(long)>
		//    4    8:areturn         
		}

		public String country()
		{
			return native_country(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #80  <Method String native_country(long)>
		//    4    8:areturn         
		}

		public void destroy()
		{
			if(!destroyed.getAndSet(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field AtomicBoolean destroyed>
		//*   2    4:iconst_1        
		//*   3    5:invokevirtual   #85  <Method boolean AtomicBoolean.getAndSet(boolean)>
		//*   4    8:ifne            19
				nativeDestroy(nativeRef);
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field long nativeRef>
		//    8   16:invokespecial   #87  <Method void nativeDestroy(long)>
		//    9   19:return          
		}

		public String email()
		{
			return native_email(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #90  <Method String native_email(long)>
		//    4    8:areturn         
		}

		public HashMap featureMap()
		{
			return native_featureMap(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #93  <Method HashMap native_featureMap(long)>
		//    4    8:areturn         
		}

		protected void finalize()
		{
			destroy();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #97  <Method void destroy()>
			((Object)this).finalize();
		//    2    4:aload_0         
		//    3    5:invokespecial   #101 <Method void Object.finalize()>
		//    4    8:return          
		}

		public String firstName()
		{
			return native_firstName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #104 <Method String native_firstName(long)>
		//    4    8:areturn         
		}

		public boolean isValid()
		{
			return native_isValid(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #108 <Method boolean native_isValid(long)>
		//    4    8:ireturn         
		}

		public String lastName()
		{
			return native_lastName(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #111 <Method String native_lastName(long)>
		//    4    8:areturn         
		}

		public String locale()
		{
			return native_locale(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #114 <Method String native_locale(long)>
		//    4    8:areturn         
		}

		public boolean promoOptIn()
		{
			return native_promoOptIn(nativeRef);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:invokespecial   #117 <Method boolean native_promoOptIn(long)>
		//    4    8:ireturn         
		}

		public void setPromoOptIn(boolean flag)
		{
			native_setPromoOptIn(nativeRef, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:iload_1         
		//    4    6:invokespecial   #120 <Method void native_setPromoOptIn(long, boolean)>
		//    5    9:return          
		}

		public void updateAccountFlagMap(AccountFlagType accountflagtype, boolean flag)
		{
			native_updateAccountFlagMap(nativeRef, accountflagtype, flag);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokespecial   #124 <Method void native_updateAccountFlagMap(long, AccountFlagType, boolean)>
		//    6   10:return          
		}

		public void updateConsentDateMap(LegalTermType legaltermtype, Date date)
		{
			native_updateConsentDateMap(nativeRef, legaltermtype, date);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #128 <Method void native_updateConsentDateMap(long, LegalTermType, Date)>
		//    6   10:return          
		}

		public void updateCountry(String s)
		{
			native_updateCountry(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #131 <Method void native_updateCountry(long, String)>
		//    5    9:return          
		}

		public void updateFeatureMap(FeatureType featuretype, long l)
		{
			native_updateFeatureMap(nativeRef, featuretype, l);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:lload_2         
		//    5    7:invokespecial   #135 <Method void native_updateFeatureMap(long, FeatureType, long)>
		//    6   10:return          
		}

		public void updateLocale(String s)
		{
			native_updateLocale(nativeRef, s);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field long nativeRef>
		//    3    5:aload_1         
		//    4    6:invokespecial   #138 <Method void native_updateLocale(long, String)>
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
		//    1    1:invokespecial   #19  <Method void AccountInfo()>
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


	public AccountInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static native AccountInfo create(String s);

	public abstract HashMap accountFlagMap();

	public abstract AccountLoginData accountLoginData();

	public abstract HashMap consentDateMap();

	public abstract String country();

	public abstract String email();

	public abstract HashMap featureMap();

	public abstract String firstName();

	public abstract boolean isValid();

	public abstract String lastName();

	public abstract String locale();

	public abstract boolean promoOptIn();

	public abstract void setPromoOptIn(boolean flag);

	public abstract void updateAccountFlagMap(AccountFlagType accountflagtype, boolean flag);

	public abstract void updateConsentDateMap(LegalTermType legaltermtype, Date date);

	public abstract void updateCountry(String s);

	public abstract void updateFeatureMap(FeatureType featuretype, long l);

	public abstract void updateLocale(String s);
}
