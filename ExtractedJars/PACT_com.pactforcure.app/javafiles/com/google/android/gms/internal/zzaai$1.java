// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzaai, zzaam

class zzaai$1 extends a
{

	public void zzvA()
	{
		zzazM.onConnectionSuspended(1);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaai zzazM>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #25  <Method void zzaai.onConnectionSuspended(int)>
	//    4    8:return          
	}

	final zzaai zzazM;

	zzaai$1(zzaai zzaai1, zzaam zzaam)
	{
		zzazM = zzaai1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzaai zzazM>
		super(zzaam);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzaan$zza(zzaam)>
	//    6   10:return          
	}
}
