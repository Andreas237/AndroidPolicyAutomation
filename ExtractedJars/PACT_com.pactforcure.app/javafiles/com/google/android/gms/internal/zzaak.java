// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Queue;

// Referenced classes of package com.google.android.gms.internal:
//			zzaam, zzaan, zzaal

public class zzaak
	implements zzaam
{

	public zzaak(zzaan zzaan1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzazK = zzaan1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzaan zzazK>
	//    5    9:return          
	}

	public void begin()
	{
		zzazK.zzvQ();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaan zzazK>
	//    2    4:invokevirtual   #22  <Method void zzaan.zzvQ()>
		zzazK.zzazd.zzaAs = Collections.emptySet();
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field zzaan zzazK>
	//    5   11:getfield        #26  <Field zzaal zzaan.zzazd>
	//    6   14:invokestatic    #32  <Method java.util.Set Collections.emptySet()>
	//    7   17:putfield        #38  <Field java.util.Set zzaal.zzaAs>
	//    8   20:return          
	}

	public void connect()
	{
		zzazK.zzvO();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaan zzazK>
	//    2    4:invokevirtual   #42  <Method void zzaan.zzvO()>
	//    3    7:return          
	}

	public boolean disconnect()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onConnected(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	public zzzv.zza zza(zzzv.zza zza1)
	{
		zzazK.zzazd.zzaAl.add(((Object) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaan zzazK>
	//    2    4:getfield        #26  <Field zzaal zzaan.zzazd>
	//    3    7:getfield        #54  <Field Queue zzaal.zzaAl>
	//    4   10:aload_1         
	//    5   11:invokeinterface #60  <Method boolean Queue.add(Object)>
	//    6   16:pop             
		return zza1;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	public void zza(ConnectionResult connectionresult, Api api, int i)
	{
	//    0    0:return          
	}

	public zzzv.zza zzb(zzzv.zza zza1)
	{
		throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//    0    0:new             #67  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #69  <String "GoogleApiClient is not connected yet.">
	//    3    6:invokespecial   #72  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	private final zzaan zzazK;
}
