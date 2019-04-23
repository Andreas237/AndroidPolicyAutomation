// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.o;
import com.google.android.gms.common.internal.am;

// Referenced classes of package com.google.android.gms.internal.ads:
//			li, aag, ks, df

public final class ll
	implements d, e, f
{

	public ll(ks ks1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = ks1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field ks a>
	//    5    9:return          
	}

	private static void a(MediationNativeAdapter mediationnativeadapter, m m1, g g1)
	{
		if(mediationnativeadapter instanceof AdMobAdapter)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #30  <Class AdMobAdapter>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mediationnativeadapter = ((MediationNativeAdapter) (new o()));
	//    4    8:new             #32  <Class o>
	//    5   11:dup             
	//    6   12:invokespecial   #33  <Method void o()>
	//    7   15:astore_0        
		((o) (mediationnativeadapter)).a(((byg) (new li())));
	//    8   16:aload_0         
	//    9   17:new             #35  <Class li>
	//   10   20:dup             
	//   11   21:invokespecial   #36  <Method void li()>
	//   12   24:invokevirtual   #39  <Method void o.a(byg)>
		if(m1 != null && m1.k())
	//*  13   27:aload_1         
	//*  14   28:ifnull          43
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #45  <Method boolean m.k()>
	//*  17   35:ifeq            43
			m1.a(((o) (mediationnativeadapter)));
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:invokevirtual   #48  <Method void m.a(o)>
		if(g1 != null && g1.h())
	//*  21   43:aload_2         
	//*  22   44:ifnull          59
	//*  23   47:aload_2         
	//*  24   48:invokevirtual   #53  <Method boolean g.h()>
	//*  25   51:ifeq            59
			g1.a(((o) (mediationnativeadapter)));
	//   26   54:aload_2         
	//   27   55:aload_0         
	//   28   56:invokevirtual   #54  <Method void g.a(o)>
	//   29   59:return          
	}

	public final g a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field g b>
	//    2    4:areturn         
	}

	public final void a(MediationBannerAdapter mediationbanneradapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdLoaded.");
	//    2    5:ldc1            #69  <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.e();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #77  <Method void com.google.android.gms.internal.ads.ks.e()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void a(MediationBannerAdapter mediationbanneradapter, int i)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		mediationbanneradapter = ((MediationBannerAdapter) (new StringBuilder(55)));
	//    2    5:new             #85  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:bipush          55
	//    5   11:invokespecial   #88  <Method void StringBuilder(int)>
	//    6   14:astore_1        
		((StringBuilder) (mediationbanneradapter)).append("Adapter called onAdFailedToLoad with error. ");
	//    7   15:aload_1         
	//    8   16:ldc1            #90  <String "Adapter called onAdFailedToLoad with error. ">
	//    9   18:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		((StringBuilder) (mediationbanneradapter)).append(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
		aag.b(((StringBuilder) (mediationbanneradapter)).toString());
	//   15   28:aload_1         
	//   16   29:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   17   32:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.a(i);
	//   18   35:aload_0         
	//   19   36:getfield        #26  <Field ks a>
	//   20   39:iload_2         
	//   21   40:invokeinterface #103 <Method void ks.a(int)>
			return;
	//   22   45:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*  23   46:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//   24   47:ldc1            #79  <String "#007 Could not call remote method.">
	//   25   49:aload_1         
	//   26   50:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   27   53:return          
	}

	public final void a(MediationBannerAdapter mediationbanneradapter, String s, String s1)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAppEvent.");
	//    2    5:ldc1            #106 <String "Adapter called onAppEvent.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.a(s, s1);
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:aload_2         
	//    7   15:aload_3         
	//    8   16:invokeinterface #109 <Method void ks.a(String, String)>
			return;
	//    9   21:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*  10   22:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//   11   23:ldc1            #79  <String "#007 Could not call remote method.">
	//   12   25:aload_1         
	//   13   26:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   14   29:return          
	}

	public final void a(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdLoaded.");
	//    2    5:ldc1            #69  <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.e();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #77  <Method void com.google.android.gms.internal.ads.ks.e()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void a(MediationInterstitialAdapter mediationinterstitialadapter, int i)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		mediationinterstitialadapter = ((MediationInterstitialAdapter) (new StringBuilder(55)));
	//    2    5:new             #85  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:bipush          55
	//    5   11:invokespecial   #88  <Method void StringBuilder(int)>
	//    6   14:astore_1        
		((StringBuilder) (mediationinterstitialadapter)).append("Adapter called onAdFailedToLoad with error ");
	//    7   15:aload_1         
	//    8   16:ldc1            #113 <String "Adapter called onAdFailedToLoad with error ">
	//    9   18:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		((StringBuilder) (mediationinterstitialadapter)).append(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
		((StringBuilder) (mediationinterstitialadapter)).append(".");
	//   15   28:aload_1         
	//   16   29:ldc1            #115 <String ".">
	//   17   31:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		aag.b(((StringBuilder) (mediationinterstitialadapter)).toString());
	//   19   35:aload_1         
	//   20   36:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   21   39:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.a(i);
	//   22   42:aload_0         
	//   23   43:getfield        #26  <Field ks a>
	//   24   46:iload_2         
	//   25   47:invokeinterface #103 <Method void ks.a(int)>
			return;
	//   26   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*  27   53:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//   28   54:ldc1            #79  <String "#007 Could not call remote method.">
	//   29   56:aload_1         
	//   30   57:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   31   60:return          
	}

	public final void a(MediationNativeAdapter mediationnativeadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdOpened.");
	//    2    5:ldc1            #118 <String "Adapter called onAdOpened.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.d();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #120 <Method void com.google.android.gms.internal.ads.ks.d()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void a(MediationNativeAdapter mediationnativeadapter, int i)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		mediationnativeadapter = ((MediationNativeAdapter) (new StringBuilder(55)));
	//    2    5:new             #85  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:bipush          55
	//    5   11:invokespecial   #88  <Method void StringBuilder(int)>
	//    6   14:astore_1        
		((StringBuilder) (mediationnativeadapter)).append("Adapter called onAdFailedToLoad with error ");
	//    7   15:aload_1         
	//    8   16:ldc1            #113 <String "Adapter called onAdFailedToLoad with error ">
	//    9   18:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		((StringBuilder) (mediationnativeadapter)).append(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
		((StringBuilder) (mediationnativeadapter)).append(".");
	//   15   28:aload_1         
	//   16   29:ldc1            #115 <String ".">
	//   17   31:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		aag.b(((StringBuilder) (mediationnativeadapter)).toString());
	//   19   35:aload_1         
	//   20   36:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   21   39:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.a(i);
	//   22   42:aload_0         
	//   23   43:getfield        #26  <Field ks a>
	//   24   46:iload_2         
	//   25   47:invokeinterface #103 <Method void ks.a(int)>
			return;
	//   26   52:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  27   53:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   28   54:ldc1            #79  <String "#007 Could not call remote method.">
	//   29   56:aload_1         
	//   30   57:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   31   60:return          
	}

	public final void a(MediationNativeAdapter mediationnativeadapter, com.google.android.gms.ads.formats.m m1)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		mediationnativeadapter = ((MediationNativeAdapter) (String.valueOf(((Object) (m1.a())))));
	//    2    5:aload_2         
	//    3    6:invokeinterface #126 <Method String com.google.android.gms.ads.formats.m.a()>
	//    4   11:invokestatic    #132 <Method String String.valueOf(Object)>
	//    5   14:astore_1        
		if(((String) (mediationnativeadapter)).length() != 0)
	//*   6   15:aload_1         
	//*   7   16:invokevirtual   #136 <Method int String.length()>
	//*   8   19:ifeq            32
			mediationnativeadapter = ((MediationNativeAdapter) ("Adapter called onAdLoaded with template id ".concat(((String) (mediationnativeadapter)))));
	//    9   22:ldc1            #138 <String "Adapter called onAdLoaded with template id ">
	//   10   24:aload_1         
	//   11   25:invokevirtual   #142 <Method String String.concat(String)>
	//   12   28:astore_1        
		else
	//*  13   29:goto            42
			mediationnativeadapter = ((MediationNativeAdapter) (new String("Adapter called onAdLoaded with template id ")));
	//   14   32:new             #128 <Class String>
	//   15   35:dup             
	//   16   36:ldc1            #138 <String "Adapter called onAdLoaded with template id ">
	//   17   38:invokespecial   #144 <Method void String(String)>
	//   18   41:astore_1        
		aag.b(((String) (mediationnativeadapter)));
	//   19   42:aload_1         
	//   20   43:invokestatic    #72  <Method void aag.b(String)>
		d = m1;
	//   21   46:aload_0         
	//   22   47:aload_2         
	//   23   48:putfield        #146 <Field com.google.android.gms.ads.formats.m d>
		try
		{
			a.e();
	//   24   51:aload_0         
	//   25   52:getfield        #26  <Field ks a>
	//   26   55:invokeinterface #77  <Method void com.google.android.gms.internal.ads.ks.e()>
			return;
	//   27   60:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  28   61:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   29   62:ldc1            #79  <String "#007 Could not call remote method.">
	//   30   64:aload_1         
	//   31   65:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   32   68:return          
	}

	public final void a(MediationNativeAdapter mediationnativeadapter, com.google.android.gms.ads.formats.m m1, String s)
	{
		if(m1 instanceof df)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #149 <Class df>
	//*   2    4:ifeq            33
		{
			try
			{
				a.a(((df)m1).b(), s);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field ks a>
	//    5   11:aload_2         
	//    6   12:checkcast       #149 <Class df>
	//    7   15:invokevirtual   #152 <Method db df.b()>
	//    8   18:aload_3         
	//    9   19:invokeinterface #155 <Method void ks.a(db, String)>
				return;
	//   10   24:return          
			}
			// Misplaced declaration of an exception variable
			catch(MediationNativeAdapter mediationnativeadapter)
	//*  11   25:astore_1        
			{
				com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   12   26:ldc1            #79  <String "#007 Could not call remote method.">
	//   13   28:aload_1         
	//   14   29:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
			}
			return;
	//   15   32:return          
		} else
		{
			com.google.android.gms.internal.ads.aag.e("Unexpected native custom template ad type.");
	//   16   33:ldc1            #157 <String "Unexpected native custom template ad type.">
	//   17   35:invokestatic    #159 <Method void com.google.android.gms.internal.ads.aag.e(String)>
			return;
	//   18   38:return          
		}
	}

	public final void a(MediationNativeAdapter mediationnativeadapter, g g1)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdLoaded.");
	//    2    5:ldc1            #69  <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		b = g1;
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:putfield        #57  <Field g b>
		c = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #162 <Field m c>
		a(mediationnativeadapter, c, b);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #162 <Field m c>
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field g b>
	//   15   29:invokestatic    #164 <Method void a(MediationNativeAdapter, m, g)>
		try
		{
			a.e();
	//   16   32:aload_0         
	//   17   33:getfield        #26  <Field ks a>
	//   18   36:invokeinterface #77  <Method void com.google.android.gms.internal.ads.ks.e()>
			return;
	//   19   41:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  20   42:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   21   43:ldc1            #79  <String "#007 Could not call remote method.">
	//   22   45:aload_1         
	//   23   46:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   24   49:return          
	}

	public final void a(MediationNativeAdapter mediationnativeadapter, m m1)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdLoaded.");
	//    2    5:ldc1            #69  <String "Adapter called onAdLoaded.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		c = m1;
	//    4   10:aload_0         
	//    5   11:aload_2         
	//    6   12:putfield        #162 <Field m c>
		b = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #57  <Field g b>
		a(mediationnativeadapter, c, b);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #162 <Field m c>
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field g b>
	//   15   29:invokestatic    #164 <Method void a(MediationNativeAdapter, m, g)>
		try
		{
			a.e();
	//   16   32:aload_0         
	//   17   33:getfield        #26  <Field ks a>
	//   18   36:invokeinterface #77  <Method void com.google.android.gms.internal.ads.ks.e()>
			return;
	//   19   41:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  20   42:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   21   43:ldc1            #79  <String "#007 Could not call remote method.">
	//   22   45:aload_1         
	//   23   46:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   24   49:return          
	}

	public final m b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field m c>
	//    2    4:areturn         
	}

	public final void b(MediationBannerAdapter mediationbanneradapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdOpened.");
	//    2    5:ldc1            #118 <String "Adapter called onAdOpened.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.d();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #120 <Method void com.google.android.gms.internal.ads.ks.d()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void b(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdOpened.");
	//    2    5:ldc1            #118 <String "Adapter called onAdOpened.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.d();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #120 <Method void com.google.android.gms.internal.ads.ks.d()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void b(MediationNativeAdapter mediationnativeadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdClosed.");
	//    2    5:ldc1            #168 <String "Adapter called onAdClosed.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.b();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #170 <Method void ks.b()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final com.google.android.gms.ads.formats.m c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field com.google.android.gms.ads.formats.m d>
	//    2    4:areturn         
	}

	public final void c(MediationBannerAdapter mediationbanneradapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdClosed.");
	//    2    5:ldc1            #168 <String "Adapter called onAdClosed.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.b();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #170 <Method void ks.b()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void c(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdClosed.");
	//    2    5:ldc1            #168 <String "Adapter called onAdClosed.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.b();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #170 <Method void ks.b()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void c(MediationNativeAdapter mediationnativeadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdLeftApplication.");
	//    2    5:ldc1            #173 <String "Adapter called onAdLeftApplication.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.c();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #175 <Method void ks.c()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void d(MediationBannerAdapter mediationbanneradapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdLeftApplication.");
	//    2    5:ldc1            #173 <String "Adapter called onAdLeftApplication.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.c();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #175 <Method void ks.c()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void d(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdLeftApplication.");
	//    2    5:ldc1            #173 <String "Adapter called onAdLeftApplication.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.c();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #175 <Method void ks.c()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void d(MediationNativeAdapter mediationnativeadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		mediationnativeadapter = ((MediationNativeAdapter) (b));
	//    2    5:aload_0         
	//    3    6:getfield        #57  <Field g b>
	//    4    9:astore_1        
		m m1 = c;
	//    5   10:aload_0         
	//    6   11:getfield        #162 <Field m c>
	//    7   14:astore_2        
		if(d == null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #146 <Field com.google.android.gms.ads.formats.m d>
	//*  10   19:ifnonnull       71
		{
			if(mediationnativeadapter == null && m1 == null)
	//*  11   22:aload_1         
	//*  12   23:ifnonnull       37
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       37
			{
				com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (null)));
	//   15   30:ldc1            #79  <String "#007 Could not call remote method.">
	//   16   32:aconst_null     
	//   17   33:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   18   36:return          
			}
			if(m1 != null && !m1.q())
	//*  19   37:aload_2         
	//*  20   38:ifnull          54
	//*  21   41:aload_2         
	//*  22   42:invokevirtual   #178 <Method boolean m.q()>
	//*  23   45:ifne            54
			{
				aag.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
	//   24   48:ldc1            #180 <String "Could not call onAdClicked since setOverrideClickHandling is not set to true">
	//   25   50:invokestatic    #72  <Method void aag.b(String)>
				return;
	//   26   53:return          
			}
			if(mediationnativeadapter != null && !((g) (mediationnativeadapter)).b())
	//*  27   54:aload_1         
	//*  28   55:ifnull          71
	//*  29   58:aload_1         
	//*  30   59:invokevirtual   #182 <Method boolean g.b()>
	//*  31   62:ifne            71
			{
				aag.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
	//   32   65:ldc1            #180 <String "Could not call onAdClicked since setOverrideClickHandling is not set to true">
	//   33   67:invokestatic    #72  <Method void aag.b(String)>
				return;
	//   34   70:return          
			}
		}
		aag.b("Adapter called onAdClicked.");
	//   35   71:ldc1            #184 <String "Adapter called onAdClicked.">
	//   36   73:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.a();
	//   37   76:aload_0         
	//   38   77:getfield        #26  <Field ks a>
	//   39   80:invokeinterface #186 <Method void ks.a()>
			return;
	//   40   85:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  41   86:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   42   87:ldc1            #79  <String "#007 Could not call remote method.">
	//   43   89:aload_1         
	//   44   90:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   45   93:return          
	}

	public final void e(MediationBannerAdapter mediationbanneradapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdClicked.");
	//    2    5:ldc1            #184 <String "Adapter called onAdClicked.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.a();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #186 <Method void ks.a()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void e(MediationInterstitialAdapter mediationinterstitialadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		aag.b("Adapter called onAdClicked.");
	//    2    5:ldc1            #184 <String "Adapter called onAdClicked.">
	//    3    7:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.a();
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field ks a>
	//    6   14:invokeinterface #186 <Method void ks.a()>
			return;
	//    7   19:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*   8   20:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//    9   21:ldc1            #79  <String "#007 Could not call remote method.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   12   27:return          
	}

	public final void e(MediationNativeAdapter mediationnativeadapter)
	{
		am.b("#008 Must be called on the main UI thread.");
	//    0    0:ldc1            #62  <String "#008 Must be called on the main UI thread.">
	//    1    2:invokestatic    #67  <Method void am.b(String)>
		mediationnativeadapter = ((MediationNativeAdapter) (b));
	//    2    5:aload_0         
	//    3    6:getfield        #57  <Field g b>
	//    4    9:astore_1        
		m m1 = c;
	//    5   10:aload_0         
	//    6   11:getfield        #162 <Field m c>
	//    7   14:astore_2        
		if(d == null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #146 <Field com.google.android.gms.ads.formats.m d>
	//*  10   19:ifnonnull       71
		{
			if(mediationnativeadapter == null && m1 == null)
	//*  11   22:aload_1         
	//*  12   23:ifnonnull       37
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       37
			{
				com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (null)));
	//   15   30:ldc1            #79  <String "#007 Could not call remote method.">
	//   16   32:aconst_null     
	//   17   33:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
				return;
	//   18   36:return          
			}
			if(m1 != null && !m1.p())
	//*  19   37:aload_2         
	//*  20   38:ifnull          54
	//*  21   41:aload_2         
	//*  22   42:invokevirtual   #189 <Method boolean m.p()>
	//*  23   45:ifne            54
			{
				aag.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
	//   24   48:ldc1            #191 <String "Could not call onAdImpression since setOverrideImpressionRecording is not set to true">
	//   25   50:invokestatic    #72  <Method void aag.b(String)>
				return;
	//   26   53:return          
			}
			if(mediationnativeadapter != null && !((g) (mediationnativeadapter)).a())
	//*  27   54:aload_1         
	//*  28   55:ifnull          71
	//*  29   58:aload_1         
	//*  30   59:invokevirtual   #193 <Method boolean g.a()>
	//*  31   62:ifne            71
			{
				aag.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
	//   32   65:ldc1            #191 <String "Could not call onAdImpression since setOverrideImpressionRecording is not set to true">
	//   33   67:invokestatic    #72  <Method void aag.b(String)>
				return;
	//   34   70:return          
			}
		}
		aag.b("Adapter called onAdImpression.");
	//   35   71:ldc1            #195 <String "Adapter called onAdImpression.">
	//   36   73:invokestatic    #72  <Method void aag.b(String)>
		try
		{
			a.f();
	//   37   76:aload_0         
	//   38   77:getfield        #26  <Field ks a>
	//   39   80:invokeinterface #198 <Method void com.google.android.gms.internal.ads.ks.f()>
			return;
	//   40   85:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationNativeAdapter mediationnativeadapter)
	//*  41   86:astore_1        
		{
			com.google.android.gms.internal.ads.aag.d("#007 Could not call remote method.", ((Throwable) (mediationnativeadapter)));
	//   42   87:ldc1            #79  <String "#007 Could not call remote method.">
	//   43   89:aload_1         
	//   44   90:invokestatic    #82  <Method void com.google.android.gms.internal.ads.aag.d(String, Throwable)>
		}
	//   45   93:return          
	}

	private final ks a;
	private g b;
	private m c;
	private com.google.android.gms.ads.formats.m d;
}
