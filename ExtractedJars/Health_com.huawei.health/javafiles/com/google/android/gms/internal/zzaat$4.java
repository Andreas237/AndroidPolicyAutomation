// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaat, zzabt

class zzaat$4
	implements ResultCallback
{

	public void onResult(Result result)
	{
		zzp((Status)result);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class Status>
	//    3    5:invokevirtual   #43  <Method void zzp(Status)>
	//    4    8:return          
	}

	public void zzp(Status status)
	{
		zzn.zzas(zzaat.zzc(zzaBY)).zzrD();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzaat zzaBY>
	//    2    4:invokestatic    #48  <Method android.content.Context zzaat.zzc(zzaat)>
	//    3    7:invokestatic    #54  <Method zzn zzn.zzas(android.content.Context)>
	//    4   10:invokevirtual   #57  <Method void zzn.zzrD()>
		if(status.isSuccess() && zzaBY.isConnected())
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #61  <Method boolean Status.isSuccess()>
	//*   7   17:ifeq            37
	//*   8   20:aload_0         
	//*   9   21:getfield        #24  <Field zzaat zzaBY>
	//*  10   24:invokevirtual   #64  <Method boolean zzaat.isConnected()>
	//*  11   27:ifeq            37
			zzaBY.reconnect();
	//   12   30:aload_0         
	//   13   31:getfield        #24  <Field zzaat zzaBY>
	//   14   34:invokevirtual   #67  <Method void zzaat.reconnect()>
		zzaCa.zzb(((Result) (status)));
	//   15   37:aload_0         
	//   16   38:getfield        #26  <Field zzabt zzaCa>
	//   17   41:aload_1         
	//   18   42:invokevirtual   #72  <Method void zzabt.zzb(Result)>
		if(zzaCb)
	//*  19   45:aload_0         
	//*  20   46:getfield        #28  <Field boolean zzaCb>
	//*  21   49:ifeq            59
			zzapg.disconnect();
	//   22   52:aload_0         
	//   23   53:getfield        #30  <Field GoogleApiClient zzapg>
	//   24   56:invokevirtual   #77  <Method void GoogleApiClient.disconnect()>
	//   25   59:return          
	}

	final zzaat zzaBY;
	final zzabt zzaCa;
	final boolean zzaCb;
	final GoogleApiClient zzapg;

	zzaat$4(zzaat zzaat1, zzabt zzabt1, boolean flag, GoogleApiClient googleapiclient)
	{
		zzaBY = zzaat1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field zzaat zzaBY>
		zzaCa = zzabt1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field zzabt zzaCa>
		zzaCb = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #28  <Field boolean zzaCb>
		zzapg = googleapiclient;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field GoogleApiClient zzapg>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
