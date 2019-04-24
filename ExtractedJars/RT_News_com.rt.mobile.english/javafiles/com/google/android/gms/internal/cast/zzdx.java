// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzdu, zzdq, zzdg, zzdv, 
//			zzdy

public final class zzdx extends zzdu
{

	protected zzdx(zzdv zzdv1)
	{
		zzxx = zzdv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzdv zzxx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzdu()>
	//    5    9:return          
	}

	public final void onDisconnected()
		throws RemoteException
	{
		zzdq.zzdd().d("onDisconnected", new Object[0]);
	//    0    0:invokestatic    #23  <Method zzdg zzdq.zzdd()>
	//    1    3:ldc1            #24  <String "onDisconnected">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #32  <Method void zzdg.d(String, Object[])>
		zzdq.zza(zzxx.zzxu);
	//    5   12:aload_0         
	//    6   13:getfield        #10  <Field zzdv zzxx>
	//    7   16:getfield        #38  <Field zzdq zzdv.zzxu>
	//    8   19:invokestatic    #42  <Method void zzdq.zza(zzdq)>
		zzxx.setResult(((com.google.android.gms.common.api.Result) (new zzdy(Status.RESULT_SUCCESS))));
	//    9   22:aload_0         
	//   10   23:getfield        #10  <Field zzdv zzxx>
	//   11   26:new             #44  <Class zzdy>
	//   12   29:dup             
	//   13   30:getstatic       #50  <Field Status Status.RESULT_SUCCESS>
	//   14   33:invokespecial   #53  <Method void zzdy(Status)>
	//   15   36:invokevirtual   #57  <Method void zzdv.setResult(com.google.android.gms.common.api.Result)>
	//   16   39:return          
	}

	public final void onError(int i)
		throws RemoteException
	{
		zzdq.zzdd().d("onError: %d", new Object[] {
			Integer.valueOf(i)
		});
	//    0    0:invokestatic    #23  <Method zzdg zzdq.zzdd()>
	//    1    3:ldc1            #62  <String "onError: %d">
	//    2    5:iconst_1        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:iload_1         
	//    7   12:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//    8   15:aastore         
	//    9   16:invokevirtual   #32  <Method void zzdg.d(String, Object[])>
		zzdq.zza(zzxx.zzxu);
	//   10   19:aload_0         
	//   11   20:getfield        #10  <Field zzdv zzxx>
	//   12   23:getfield        #38  <Field zzdq zzdv.zzxu>
	//   13   26:invokestatic    #42  <Method void zzdq.zza(zzdq)>
		zzxx.setResult(((com.google.android.gms.common.api.Result) (new zzdy(Status.RESULT_INTERNAL_ERROR))));
	//   14   29:aload_0         
	//   15   30:getfield        #10  <Field zzdv zzxx>
	//   16   33:new             #44  <Class zzdy>
	//   17   36:dup             
	//   18   37:getstatic       #71  <Field Status Status.RESULT_INTERNAL_ERROR>
	//   19   40:invokespecial   #53  <Method void zzdy(Status)>
	//   20   43:invokevirtual   #57  <Method void zzdv.setResult(com.google.android.gms.common.api.Result)>
	//   21   46:return          
	}

	private final zzdv zzxx;
}
