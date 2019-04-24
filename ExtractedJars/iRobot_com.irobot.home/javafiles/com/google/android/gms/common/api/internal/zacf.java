// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zace, zach

final class zacf
	implements Runnable
{

	zacf(zace zace1)
	{
		zakj = zace1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zace zakj>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zace.zaa(zakj).zag(new ConnectionResult(4));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zace zakj>
	//    2    4:invokestatic    #23  <Method zach zace.zaa(zace)>
	//    3    7:new             #25  <Class ConnectionResult>
	//    4   10:dup             
	//    5   11:iconst_4        
	//    6   12:invokespecial   #28  <Method void ConnectionResult(int)>
	//    7   15:invokeinterface #34  <Method void zach.zag(ConnectionResult)>
	//    8   20:return          
	}

	private final zace zakj;
}
