// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzaaq, zzaau

class zzaaq$1 extends a
{

	public void zzwe()
	{
		zzaBm.onConnectionSuspended(1);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaaq zzaBm>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #25  <Method void zzaaq.onConnectionSuspended(int)>
	//    4    8:return          
	}

	final zzaaq zzaBm;

	zzaaq$1(zzaaq zzaaq1, zzaau zzaau)
	{
		zzaBm = zzaaq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzaaq zzaBm>
		super(zzaau);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzaav$zza(zzaau)>
	//    6   10:return          
	}
}
