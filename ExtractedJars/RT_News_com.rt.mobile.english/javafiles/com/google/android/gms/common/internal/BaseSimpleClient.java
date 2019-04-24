// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions

public abstract class BaseSimpleClient
	implements com.google.android.gms.common.api.Api.SimpleClient
{

	public BaseSimpleClient(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void Object()>
	//    6   12:putfield        #23  <Field Object mLock>
		zzrj = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #25  <Field IInterface zzrj>
		mState = 1;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #27  <Field int mState>
		mContext = context;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #29  <Field Context mContext>
	//   16   30:return          
	}

	public Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Context mContext>
	//    2    4:areturn         
	}

	public Feature[] getRequiredFeatures()
	{
		return new Feature[0];
	//    0    0:iconst_0        
	//    1    1:anewarray       Feature[]
	//    2    4:areturn         
	}

	public IInterface getService()
		throws DeadObjectException
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(mState == 5)
	//*   5    7:aload_0         
	//*   6    8:getfield        #27  <Field int mState>
	//*   7   11:iconst_5        
	//*   8   12:icmpne          23
			throw new DeadObjectException();
	//    9   15:new             #40  <Class DeadObjectException>
	//   10   18:dup             
	//   11   19:invokespecial   #41  <Method void DeadObjectException()>
	//   12   22:athrow          
		if(mState != 4)
	//*  13   23:aload_0         
	//*  14   24:getfield        #27  <Field int mState>
	//*  15   27:iconst_4        
	//*  16   28:icmpeq          41
			throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
	//   17   31:new             #43  <Class IllegalStateException>
	//   18   34:dup             
	//   19   35:ldc1            #45  <String "Not connected. Call connect() and wait for onConnected() to be called.">
	//   20   37:invokespecial   #48  <Method void IllegalStateException(String)>
	//   21   40:athrow          
		boolean flag;
		IInterface iinterface;
		Exception exception;
		if(zzrj != null)
	//*  22   41:aload_0         
	//*  23   42:getfield        #25  <Field IInterface zzrj>
	//*  24   45:ifnull          73
			flag = true;
	//   25   48:iconst_1        
	//   26   49:istore_1        
		else
	//*  27   50:goto            53
	//*  28   53:iload_1         
	//*  29   54:ldc1            #50  <String "Client is connected but service is null">
	//*  30   56:invokestatic    #56  <Method void Preconditions.checkState(boolean, Object)>
	//*  31   59:aload_0         
	//*  32   60:getfield        #25  <Field IInterface zzrj>
	//*  33   63:astore_3        
	//*  34   64:aload_2         
	//*  35   65:monitorexit     
	//*  36   66:aload_3         
	//*  37   67:areturn         
	//*  38   68:astore_3        
	//*  39   69:aload_2         
	//*  40   70:monitorexit     
	//*  41   71:aload_3         
	//*  42   72:athrow          
			flag = false;
	//   43   73:iconst_0        
	//   44   74:istore_1        
		Preconditions.checkState(flag, "Client is connected but service is null");
		iinterface = zzrj;
		obj;
		JVM INSTR monitorexit ;
		return iinterface;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  45   75:goto            53
	}

	public void setState(int i, IInterface iinterface)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			mState = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #27  <Field int mState>
			zzrj = iinterface;
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:putfield        #25  <Field IInterface zzrj>
		}
	//   11   17:aload_3         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		iinterface;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_3         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw iinterface;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	private final Context mContext;
	private final Object mLock = new Object();
	private int mState;
	private IInterface zzrj;
}
