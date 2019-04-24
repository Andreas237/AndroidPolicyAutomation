// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.IInterface;

// Referenced classes of package com.google.android.gms.internal:
//			zzaso, zzarv, zzase

class zzarv$1
	implements zzaso
{

	public zzase zzIn()
		throws DeadObjectException
	{
		return (zzase)zzbku.zzxD();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzarv zzbku>
	//    2    4:invokevirtual   #27  <Method IInterface zzarv.zzxD()>
	//    3    7:checkcast       #29  <Class zzase>
	//    4   10:areturn         
	}

	public void zzxC()
	{
		zzarv.zza(zzbku);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzarv zzbku>
	//    2    4:invokestatic    #34  <Method void zzarv.zza(zzarv)>
	//    3    7:return          
	}

	public IInterface zzxD()
		throws DeadObjectException
	{
		return ((IInterface) (zzIn()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method zzase zzIn()>
	//    2    4:areturn         
	}

	final zzarv zzbku;

	zzarv$1(zzarv zzarv1)
	{
		zzbku = zzarv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzarv zzbku>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
