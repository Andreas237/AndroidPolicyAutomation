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
			break MISSING_BLOCK_LABEL_60;
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field int mState>
	//    7   11:iconst_5        
	//    8   12:icmpeq          60
		if(mState != 4)
			break MISSING_BLOCK_LABEL_50;
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field int mState>
	//   11   19:iconst_4        
	//   12   20:icmpne          50
		boolean flag;
		IInterface iinterface;
		Exception exception;
		if(zzrj != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #25  <Field IInterface zzrj>
	//*  15   27:ifnull          73
			flag = true;
	//   16   30:iconst_1        
	//   17   31:istore_1        
		else
	//*  18   32:goto            35
	//*  19   35:iload_1         
	//*  20   36:ldc1            #42  <String "Client is connected but service is null">
	//*  21   38:invokestatic    #48  <Method void Preconditions.checkState(boolean, Object)>
	//*  22   41:aload_0         
	//*  23   42:getfield        #25  <Field IInterface zzrj>
	//*  24   45:astore_3        
	//*  25   46:aload_2         
	//*  26   47:monitorexit     
	//*  27   48:aload_3         
	//*  28   49:areturn         
	//*  29   50:new             #50  <Class IllegalStateException>
	//*  30   53:dup             
	//*  31   54:ldc1            #52  <String "Not connected. Call connect() and wait for onConnected() to be called.">
	//*  32   56:invokespecial   #55  <Method void IllegalStateException(String)>
	//*  33   59:athrow          
	//*  34   60:new             #40  <Class DeadObjectException>
	//*  35   63:dup             
	//*  36   64:invokespecial   #56  <Method void DeadObjectException()>
	//*  37   67:athrow          
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
		throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
		throw new DeadObjectException();
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  45   75:goto            35
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
