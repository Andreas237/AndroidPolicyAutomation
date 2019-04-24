// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

protected final class zzf$zzk extends zzf$zza
{

	protected void zzn(ConnectionResult connectionresult)
	{
		zzaDV.zzaDJ.zzg(connectionresult);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzf zzaDV>
	//    2    4:getfield        #27  <Field zzf$zzf zzf.zzaDJ>
	//    3    7:aload_1         
	//    4    8:invokeinterface #32  <Method void zzf$zzf.zzg(ConnectionResult)>
		zzaDV.onConnectionFailed(connectionresult);
	//    5   13:aload_0         
	//    6   14:getfield        #16  <Field zzf zzaDV>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #35  <Method void zzf.onConnectionFailed(ConnectionResult)>
	//    9   21:return          
	}

	protected boolean zzwZ()
	{
		zzaDV.zzaDJ.zzg(ConnectionResult.zzawX);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzf zzaDV>
	//    2    4:getfield        #27  <Field zzf$zzf zzf.zzaDJ>
	//    3    7:getstatic       #43  <Field ConnectionResult ConnectionResult.zzawX>
	//    4   10:invokeinterface #32  <Method void zzf$zzf.zzg(ConnectionResult)>
		return true;
	//    5   15:iconst_1        
	//    6   16:ireturn         
	}

	final zzf zzaDV;

	public zzf$zzk(zzf zzf1, int i, Bundle bundle)
	{
		zzaDV = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzf zzaDV>
		super(zzf1, i, bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #18  <Method void zzf$zza(zzf, int, Bundle)>
	//    8   12:return          
	}
}
