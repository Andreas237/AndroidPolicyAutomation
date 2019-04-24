// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

public final class AdMobExtras
	implements NetworkExtras
{

	public AdMobExtras(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		if(bundle != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          20
			bundle = new Bundle(bundle);
	//    4    8:new             #16  <Class Bundle>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #18  <Method void Bundle(Bundle)>
	//    8   16:astore_1        
		else
	//*   9   17:goto            22
			bundle = null;
	//   10   20:aconst_null     
	//   11   21:astore_1        
		mExtras = bundle;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #20  <Field Bundle mExtras>
	//   15   27:return          
	}

	public final Bundle getExtras()
	{
		return mExtras;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Bundle mExtras>
	//    2    4:areturn         
	}

	private final Bundle mExtras;
}
