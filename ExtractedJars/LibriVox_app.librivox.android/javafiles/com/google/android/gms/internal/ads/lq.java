// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.b;
import com.google.ads.mediation.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aag, bwk, zv, lr, 
//			lt, ks, ls

public final class lq
	implements i, j
{

	public lq(ks ks1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		a = ks1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ks a>
	//    5    9:return          
	}

	static ks a(lq lq1)
	{
		return lq1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ks a>
	//    2    4:areturn         
	}

	public final void a(MediationBannerAdapter mediationbanneradapter, b b)
	{
		mediationbanneradapter = ((MediationBannerAdapter) (String.valueOf(((Object) (b)))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #29  <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (mediationbanneradapter))).length() + 47);
	//    3    5:new             #31  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #29  <Method String String.valueOf(Object)>
	//    7   13:invokevirtual   #35  <Method int String.length()>
	//    8   16:bipush          47
	//    9   18:iadd            
	//   10   19:invokespecial   #38  <Method void StringBuilder(int)>
	//   11   22:astore_3        
		stringbuilder.append("Adapter called onFailedToReceiveAd with error. ");
	//   12   23:aload_3         
	//   13   24:ldc1            #40  <String "Adapter called onFailedToReceiveAd with error. ">
	//   14   26:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(((String) (mediationbanneradapter)));
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		com.google.android.gms.internal.ads.aag.b(stringbuilder.toString());
	//   20   36:aload_3         
	//   21   37:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   22   40:invokestatic    #54  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		bwk.a();
	//   23   43:invokestatic    #59  <Method zv bwk.a()>
	//   24   46:pop             
		if(!com.google.android.gms.internal.ads.zv.b())
	//*  25   47:invokestatic    #64  <Method boolean com.google.android.gms.internal.ads.zv.b()>
	//*  26   50:ifne            76
		{
			aag.d("#008 Must be called on the main UI thread.", ((Throwable) (null)));
	//   27   53:ldc1            #66  <String "#008 Must be called on the main UI thread.">
	//   28   55:aconst_null     
	//   29   56:invokestatic    #70  <Method void aag.d(String, Throwable)>
			zv.a.post(((Runnable) (new lr(this, b))));
	//   30   59:getstatic       #73  <Field Handler zv.a>
	//   31   62:new             #75  <Class lr>
	//   32   65:dup             
	//   33   66:aload_0         
	//   34   67:aload_2         
	//   35   68:invokespecial   #78  <Method void lr(lq, b)>
	//   36   71:invokevirtual   #84  <Method boolean Handler.post(Runnable)>
	//   37   74:pop             
			return;
	//   38   75:return          
		}
		try
		{
			a.a(lt.a(b));
	//   39   76:aload_0         
	//   40   77:getfield        #18  <Field ks a>
	//   41   80:aload_2         
	//   42   81:invokestatic    #89  <Method int lt.a(b)>
	//   43   84:invokeinterface #93  <Method void ks.a(int)>
			return;
	//   44   89:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationBannerAdapter mediationbanneradapter)
	//*  45   90:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (mediationbanneradapter)));
	//   46   91:ldc1            #95  <String "#007 Could not call remote method.">
	//   47   93:aload_1         
	//   48   94:invokestatic    #70  <Method void aag.d(String, Throwable)>
		}
	//   49   97:return          
	}

	public final void a(MediationInterstitialAdapter mediationinterstitialadapter, b b)
	{
		mediationinterstitialadapter = ((MediationInterstitialAdapter) (String.valueOf(((Object) (b)))));
	//    0    0:aload_2         
	//    1    1:invokestatic    #29  <Method String String.valueOf(Object)>
	//    2    4:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (mediationinterstitialadapter))).length() + 47);
	//    3    5:new             #31  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #29  <Method String String.valueOf(Object)>
	//    7   13:invokevirtual   #35  <Method int String.length()>
	//    8   16:bipush          47
	//    9   18:iadd            
	//   10   19:invokespecial   #38  <Method void StringBuilder(int)>
	//   11   22:astore_3        
		stringbuilder.append("Adapter called onFailedToReceiveAd with error ");
	//   12   23:aload_3         
	//   13   24:ldc1            #98  <String "Adapter called onFailedToReceiveAd with error ">
	//   14   26:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(((String) (mediationinterstitialadapter)));
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		stringbuilder.append(".");
	//   20   36:aload_3         
	//   21   37:ldc1            #100 <String ".">
	//   22   39:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
		com.google.android.gms.internal.ads.aag.b(stringbuilder.toString());
	//   24   43:aload_3         
	//   25   44:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   26   47:invokestatic    #54  <Method void com.google.android.gms.internal.ads.aag.b(String)>
		bwk.a();
	//   27   50:invokestatic    #59  <Method zv bwk.a()>
	//   28   53:pop             
		if(!com.google.android.gms.internal.ads.zv.b())
	//*  29   54:invokestatic    #64  <Method boolean com.google.android.gms.internal.ads.zv.b()>
	//*  30   57:ifne            83
		{
			aag.d("#008 Must be called on the main UI thread.", ((Throwable) (null)));
	//   31   60:ldc1            #66  <String "#008 Must be called on the main UI thread.">
	//   32   62:aconst_null     
	//   33   63:invokestatic    #70  <Method void aag.d(String, Throwable)>
			zv.a.post(((Runnable) (new ls(this, b))));
	//   34   66:getstatic       #73  <Field Handler zv.a>
	//   35   69:new             #102 <Class ls>
	//   36   72:dup             
	//   37   73:aload_0         
	//   38   74:aload_2         
	//   39   75:invokespecial   #103 <Method void ls(lq, b)>
	//   40   78:invokevirtual   #84  <Method boolean Handler.post(Runnable)>
	//   41   81:pop             
			return;
	//   42   82:return          
		}
		try
		{
			a.a(lt.a(b));
	//   43   83:aload_0         
	//   44   84:getfield        #18  <Field ks a>
	//   45   87:aload_2         
	//   46   88:invokestatic    #89  <Method int lt.a(b)>
	//   47   91:invokeinterface #93  <Method void ks.a(int)>
			return;
	//   48   96:return          
		}
		// Misplaced declaration of an exception variable
		catch(MediationInterstitialAdapter mediationinterstitialadapter)
	//*  49   97:astore_1        
		{
			aag.d("#007 Could not call remote method.", ((Throwable) (mediationinterstitialadapter)));
	//   50   98:ldc1            #95  <String "#007 Could not call remote method.">
	//   51  100:aload_1         
	//   52  101:invokestatic    #70  <Method void aag.d(String, Throwable)>
		}
	//   53  104:return          
	}

	private final ks a;
}
