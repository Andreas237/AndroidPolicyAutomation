// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaak, zabe

final class zaam
	implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
{

	public zaam(zaak zaak1, Api api, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zagj = new WeakReference(((Object) (zaak1)));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #24  <Method void WeakReference(Object)>
	//    7   13:putfield        #26  <Field WeakReference zagj>
		mApi = api;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #28  <Field Api mApi>
		zaeb = flag;
	//   11   21:aload_0         
	//   12   22:iload_3         
	//   13   23:putfield        #30  <Field boolean zaeb>
	//   14   26:return          
	}

	static boolean zaa(zaam zaam1)
	{
		return zaam1.zaeb;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean zaeb>
	//    2    4:ireturn         
	}

	public final void onReportServiceBinding(ConnectionResult connectionresult)
	{
		zaak zaak1;
		zaak1 = (zaak)zagj.get();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field WeakReference zagj>
	//    2    4:invokevirtual   #42  <Method Object WeakReference.get()>
	//    3    7:checkcast       #44  <Class zaak>
	//    4   10:astore_3        
		if(zaak1 == null)
	//*   5   11:aload_3         
	//*   6   12:ifnonnull       16
			return;
	//    7   15:return          
		boolean flag;
		if(Looper.myLooper() == ((GoogleApiClient) (zaak.zad(zaak1).zaed)).getLooper())
	//*   8   16:invokestatic    #50  <Method Looper Looper.myLooper()>
	//*   9   19:aload_3         
	//*  10   20:invokestatic    #54  <Method zabe zaak.zad(zaak)>
	//*  11   23:getfield        #60  <Field zaaw zabe.zaed>
	//*  12   26:invokevirtual   #65  <Method Looper GoogleApiClient.getLooper()>
	//*  13   29:if_acmpne       37
			flag = true;
	//   14   32:iconst_1        
	//   15   33:istore_2        
		else
	//*  16   34:goto            39
			flag = false;
	//   17   37:iconst_0        
	//   18   38:istore_2        
		Preconditions.checkState(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
	//   19   39:iload_2         
	//   20   40:ldc1            #67  <String "onReportServiceBinding must be called on the GoogleApiClient handler thread">
	//   21   42:invokestatic    #73  <Method void Preconditions.checkState(boolean, Object)>
		zaak.zac(zaak1).lock();
	//   22   45:aload_3         
	//   23   46:invokestatic    #77  <Method Lock zaak.zac(zaak)>
	//   24   49:invokeinterface #82  <Method void Lock.lock()>
		boolean flag1 = zaak.zaa(zaak1, 0);
	//   25   54:aload_3         
	//   26   55:iconst_0        
	//   27   56:invokestatic    #85  <Method boolean zaak.zaa(zaak, int)>
	//   28   59:istore_2        
		if(!flag1)
	//*  29   60:iload_2         
	//*  30   61:ifne            74
		{
			zaak.zac(zaak1).unlock();
	//   31   64:aload_3         
	//   32   65:invokestatic    #77  <Method Lock zaak.zac(zaak)>
	//   33   68:invokeinterface #88  <Method void Lock.unlock()>
			return;
	//   34   73:return          
		}
		if(!connectionresult.isSuccess())
	//*  35   74:aload_1         
	//*  36   75:invokevirtual   #94  <Method boolean ConnectionResult.isSuccess()>
	//*  37   78:ifne            94
			zaak.zaa(zaak1, connectionresult, mApi, zaeb);
	//   38   81:aload_3         
	//   39   82:aload_1         
	//   40   83:aload_0         
	//   41   84:getfield        #28  <Field Api mApi>
	//   42   87:aload_0         
	//   43   88:getfield        #30  <Field boolean zaeb>
	//   44   91:invokestatic    #97  <Method void zaak.zaa(zaak, ConnectionResult, Api, boolean)>
		if(zaak.zak(zaak1))
	//*  45   94:aload_3         
	//*  46   95:invokestatic    #101 <Method boolean zaak.zak(zaak)>
	//*  47   98:ifeq            105
			zaak.zaj(zaak1);
	//   48  101:aload_3         
	//   49  102:invokestatic    #105 <Method void zaak.zaj(zaak)>
		zaak.zac(zaak1).unlock();
	//   50  105:aload_3         
	//   51  106:invokestatic    #77  <Method Lock zaak.zac(zaak)>
	//   52  109:invokeinterface #88  <Method void Lock.unlock()>
		return;
	//   53  114:return          
		connectionresult;
	//   54  115:astore_1        
		zaak.zac(zaak1).unlock();
	//   55  116:aload_3         
	//   56  117:invokestatic    #77  <Method Lock zaak.zac(zaak)>
	//   57  120:invokeinterface #88  <Method void Lock.unlock()>
		throw connectionresult;
	//   58  125:aload_1         
	//   59  126:athrow          
	}

	private final Api mApi;
	private final boolean zaeb;
	private final WeakReference zagj;
}
