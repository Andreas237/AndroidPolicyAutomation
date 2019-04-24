// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;

final class zzajk
{

	public zzajk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzcpc = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #13  <Long -1L>
	//    4    8:putfield        #16  <Field long zzcpc>
		zzcpd = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #13  <Long -1L>
	//    7   15:putfield        #18  <Field long zzcpd>
	//    8   18:return          
	}

	public final Bundle toBundle()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #23  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putLong("topen", zzcpc);
	//    4    8:aload_1         
	//    5    9:ldc1            #26  <String "topen">
	//    6   11:aload_0         
	//    7   12:getfield        #16  <Field long zzcpc>
	//    8   15:invokevirtual   #30  <Method void Bundle.putLong(String, long)>
		bundle.putLong("tclose", zzcpd);
	//    9   18:aload_1         
	//   10   19:ldc1            #32  <String "tclose">
	//   11   21:aload_0         
	//   12   22:getfield        #18  <Field long zzcpd>
	//   13   25:invokevirtual   #30  <Method void Bundle.putLong(String, long)>
		return bundle;
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public final long zzpp()
	{
		return zzcpd;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field long zzcpd>
	//    2    4:lreturn         
	}

	public final void zzpq()
	{
		zzcpd = SystemClock.elapsedRealtime();
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method long SystemClock.elapsedRealtime()>
	//    2    4:putfield        #18  <Field long zzcpd>
	//    3    7:return          
	}

	public final void zzpr()
	{
		zzcpc = SystemClock.elapsedRealtime();
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method long SystemClock.elapsedRealtime()>
	//    2    4:putfield        #16  <Field long zzcpc>
	//    3    7:return          
	}

	private long zzcpc;
	private long zzcpd;
}
