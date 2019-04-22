// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.BaseSignInCallbacks;
import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzaj, zzar, zzbd

final class zzaq extends BaseSignInCallbacks
{

	zzaq(zzaj zzaj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void BaseSignInCallbacks()>
		zzhw = new WeakReference(((Object) (zzaj1)));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #17  <Method void WeakReference(Object)>
	//    7   13:putfield        #19  <Field WeakReference zzhw>
	//    8   16:return          
	}

	public final void onSignInComplete(SignInResponse signinresponse)
	{
		zzaj zzaj1 = (zzaj)zzhw.get();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field WeakReference zzhw>
	//    2    4:invokevirtual   #27  <Method Object WeakReference.get()>
	//    3    7:checkcast       #29  <Class zzaj>
	//    4   10:astore_2        
		if(zzaj1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       16
		{
			return;
	//    7   15:return          
		} else
		{
			zzaj.zzd(zzaj1).zza(((zzbe) (new zzar(this, ((zzbc) (zzaj1)), zzaj1, signinresponse))));
	//    8   16:aload_2         
	//    9   17:invokestatic    #33  <Method zzbd zzaj.zzd(zzaj)>
	//   10   20:new             #35  <Class zzar>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokespecial   #38  <Method void zzar(zzaq, zzbc, zzaj, SignInResponse)>
	//   17   31:invokevirtual   #44  <Method void zzbd.zza(zzbe)>
			return;
	//   18   34:return          
		}
	}

	private final WeakReference zzhw;
}
