// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.auth.api.signin.internal.zzl;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaal, zzabl

class zzaal$4
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
		zzl.zzaa(zzaal.zzc(zzaAz)).zzre();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field zzaal zzaAz>
	//    2    4:invokestatic    #48  <Method android.content.Context zzaal.zzc(zzaal)>
	//    3    7:invokestatic    #54  <Method zzl zzl.zzaa(android.content.Context)>
	//    4   10:invokevirtual   #57  <Method void zzl.zzre()>
		if(status.isSuccess() && zzaAz.isConnected())
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #61  <Method boolean Status.isSuccess()>
	//*   7   17:ifeq            37
	//*   8   20:aload_0         
	//*   9   21:getfield        #24  <Field zzaal zzaAz>
	//*  10   24:invokevirtual   #64  <Method boolean zzaal.isConnected()>
	//*  11   27:ifeq            37
			zzaAz.reconnect();
	//   12   30:aload_0         
	//   13   31:getfield        #24  <Field zzaal zzaAz>
	//   14   34:invokevirtual   #67  <Method void zzaal.reconnect()>
		zzaAB.zzb(((Result) (status)));
	//   15   37:aload_0         
	//   16   38:getfield        #26  <Field zzabl zzaAB>
	//   17   41:aload_1         
	//   18   42:invokevirtual   #72  <Method void zzabl.zzb(Result)>
		if(zzaAC)
	//*  19   45:aload_0         
	//*  20   46:getfield        #28  <Field boolean zzaAC>
	//*  21   49:ifeq            59
			zzaob.disconnect();
	//   22   52:aload_0         
	//   23   53:getfield        #30  <Field GoogleApiClient zzaob>
	//   24   56:invokevirtual   #77  <Method void GoogleApiClient.disconnect()>
	//   25   59:return          
	}

	final zzabl zzaAB;
	final boolean zzaAC;
	final zzaal zzaAz;
	final GoogleApiClient zzaob;

	zzaal$4(zzaal zzaal1, zzabl zzabl1, boolean flag, GoogleApiClient googleapiclient)
	{
		zzaAz = zzaal1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field zzaal zzaAz>
		zzaAB = zzabl1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field zzabl zzaAB>
		zzaAC = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #28  <Field boolean zzaAC>
		zzaob = googleapiclient;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field GoogleApiClient zzaob>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #33  <Method void Object()>
	//   14   25:return          
	}
}
