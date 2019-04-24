// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;


// Referenced classes of package android.support.v4.os:
//			CancellationSignalCompatJellybean, OperationCanceledException

public final class CancellationSignal
{
	public static interface OnCancelListener
	{

		public abstract void onCancel();
	}


	public CancellationSignal()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	private void waitForCancelFinishedLocked()
	{
		while(mCancelInProgress) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean mCancelInProgress>
	//*   2    4:ifeq            18
			try
			{
				((Object)this).wait();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #27  <Method void Object.wait()>
			}
	//*   5   11:goto            0
			catch(InterruptedException interruptedexception) { }
	//    6   14:astore_1        
	//*   7   15:goto            0
	//    8   18:return          
	}

	public void cancel()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mIsCanceled;
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field boolean mIsCanceled>
	//    4    6:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_1         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Object obj;
		Object obj1;
		mIsCanceled = true;
	//   10   14:aload_0         
	//   11   15:iconst_1        
	//   12   16:putfield        #30  <Field boolean mIsCanceled>
		mCancelInProgress = true;
	//   13   19:aload_0         
	//   14   20:iconst_1        
	//   15   21:putfield        #24  <Field boolean mCancelInProgress>
		obj = ((Object) (mOnCancelListener));
	//   16   24:aload_0         
	//   17   25:getfield        #32  <Field CancellationSignal$OnCancelListener mOnCancelListener>
	//   18   28:astore_2        
		obj1 = mCancellationSignalObj;
	//   19   29:aload_0         
	//   20   30:getfield        #34  <Field Object mCancellationSignalObj>
	//   21   33:astore_3        
		this;
	//   22   34:aload_0         
		JVM INSTR monitorexit ;
	//   23   35:monitorexit     
		  goto _L1
	//*  24   36:goto            44
		obj;
	//   25   39:astore_2        
	//*  26   40:aload_0         
		throw obj;
	//   27   41:monitorexit     
	//   28   42:aload_2         
	//   29   43:athrow          
_L1:
		if(obj == null)
			break MISSING_BLOCK_LABEL_54;
	//   30   44:aload_2         
	//   31   45:ifnull          54
		((OnCancelListener) (obj)).onCancel();
	//   32   48:aload_2         
	//   33   49:invokeinterface #37  <Method void CancellationSignal$OnCancelListener.onCancel()>
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_62;
	//   34   54:aload_3         
	//   35   55:ifnull          62
		CancellationSignalCompatJellybean.cancel(obj1);
	//   36   58:aload_3         
	//   37   59:invokestatic    #42  <Method void CancellationSignalCompatJellybean.cancel(Object)>
		this;
	//   38   62:aload_0         
		JVM INSTR monitorenter ;
	//   39   63:monitorenter    
		mCancelInProgress = false;
	//   40   64:aload_0         
	//   41   65:iconst_0        
	//   42   66:putfield        #24  <Field boolean mCancelInProgress>
		((Object)this).notifyAll();
	//   43   69:aload_0         
	//   44   70:invokevirtual   #45  <Method void Object.notifyAll()>
		this;
	//   45   73:aload_0         
		JVM INSTR monitorexit ;
	//   46   74:monitorexit     
		  goto _L2
	//*  47   75:goto            83
		Exception exception;
		exception;
	//   48   78:astore_2        
	//*  49   79:aload_0         
		throw exception;
	//   50   80:monitorexit     
	//   51   81:aload_2         
	//   52   82:athrow          
_L2:
		return;
	//   53   83:return          
		exception;
	//   54   84:astore_2        
		this;
	//   55   85:aload_0         
		JVM INSTR monitorenter ;
	//   56   86:monitorenter    
		mCancelInProgress = false;
	//   57   87:aload_0         
	//   58   88:iconst_0        
	//   59   89:putfield        #24  <Field boolean mCancelInProgress>
		((Object)this).notifyAll();
	//   60   92:aload_0         
	//   61   93:invokevirtual   #45  <Method void Object.notifyAll()>
		this;
	//   62   96:aload_0         
		JVM INSTR monitorexit ;
	//   63   97:monitorexit     
		  goto _L3
	//*  64   98:goto            106
		exception;
	//   65  101:astore_2        
	//*  66  102:aload_0         
		throw exception;
	//   67  103:monitorexit     
	//   68  104:aload_2         
	//   69  105:athrow          
_L3:
		throw exception;
	//   70  106:aload_2         
	//   71  107:athrow          
	}

	public Object getCancellationSignalObject()
	{
		if(android.os.Build.VERSION.SDK_INT < 16)
	//*   0    0:getstatic       #53  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmpge          10
			return ((Object) (null));
	//    3    8:aconst_null     
	//    4    9:areturn         
		this;
	//    5   10:aload_0         
		JVM INSTR monitorenter ;
	//    6   11:monitorenter    
		Object obj;
		if(mCancellationSignalObj == null)
	//*   7   12:aload_0         
	//*   8   13:getfield        #34  <Field Object mCancellationSignalObj>
	//*   9   16:ifnonnull       40
		{
			mCancellationSignalObj = CancellationSignalCompatJellybean.create();
	//   10   19:aload_0         
	//   11   20:invokestatic    #56  <Method Object CancellationSignalCompatJellybean.create()>
	//   12   23:putfield        #34  <Field Object mCancellationSignalObj>
			if(mIsCanceled)
	//*  13   26:aload_0         
	//*  14   27:getfield        #30  <Field boolean mIsCanceled>
	//*  15   30:ifeq            40
				CancellationSignalCompatJellybean.cancel(mCancellationSignalObj);
	//   16   33:aload_0         
	//   17   34:getfield        #34  <Field Object mCancellationSignalObj>
	//   18   37:invokestatic    #42  <Method void CancellationSignalCompatJellybean.cancel(Object)>
		}
		obj = mCancellationSignalObj;
	//   19   40:aload_0         
	//   20   41:getfield        #34  <Field Object mCancellationSignalObj>
	//   21   44:astore_1        
		this;
	//   22   45:aload_0         
		JVM INSTR monitorexit ;
	//   23   46:monitorexit     
		return obj;
	//   24   47:aload_1         
	//   25   48:areturn         
		Exception exception;
		exception;
	//   26   49:astore_1        
	//*  27   50:aload_0         
		throw exception;
	//   28   51:monitorexit     
	//   29   52:aload_1         
	//   30   53:athrow          
	}

	public boolean isCanceled()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mIsCanceled;
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field boolean mIsCanceled>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public void setOnCancelListener(OnCancelListener oncancellistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		OnCancelListener oncancellistener1;
		waitForCancelFinishedLocked();
	//    2    2:aload_0         
	//    3    3:invokespecial   #62  <Method void waitForCancelFinishedLocked()>
		oncancellistener1 = mOnCancelListener;
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field CancellationSignal$OnCancelListener mOnCancelListener>
	//    6   10:astore_3        
		if(oncancellistener1 != oncancellistener)
			break MISSING_BLOCK_LABEL_19;
	//    7   11:aload_3         
	//    8   12:aload_1         
	//    9   13:if_acmpne       19
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		boolean flag;
		mOnCancelListener = oncancellistener;
	//   13   19:aload_0         
	//   14   20:aload_1         
	//   15   21:putfield        #32  <Field CancellationSignal$OnCancelListener mOnCancelListener>
		flag = mIsCanceled;
	//   16   24:aload_0         
	//   17   25:getfield        #30  <Field boolean mIsCanceled>
	//   18   28:istore_2        
		if(flag && oncancellistener != null)
			break MISSING_BLOCK_LABEL_40;
	//   19   29:iload_2         
	//   20   30:ifeq            37
	//   21   33:aload_1         
	//   22   34:ifnonnull       40
		this;
	//   23   37:aload_0         
		JVM INSTR monitorexit ;
	//   24   38:monitorexit     
		return;
	//   25   39:return          
		this;
	//   26   40:aload_0         
		JVM INSTR monitorexit ;
	//   27   41:monitorexit     
		  goto _L1
	//*  28   42:goto            50
		oncancellistener;
	//   29   45:astore_1        
	//*  30   46:aload_0         
		throw oncancellistener;
	//   31   47:monitorexit     
	//   32   48:aload_1         
	//   33   49:athrow          
_L1:
		oncancellistener.onCancel();
	//   34   50:aload_1         
	//   35   51:invokeinterface #37  <Method void CancellationSignal$OnCancelListener.onCancel()>
		return;
	//   36   56:return          
	}

	public void throwIfCanceled()
	{
		if(isCanceled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #65  <Method boolean isCanceled()>
	//*   2    4:ifeq            15
			throw new OperationCanceledException();
	//    3    7:new             #67  <Class OperationCanceledException>
	//    4   10:dup             
	//    5   11:invokespecial   #68  <Method void OperationCanceledException()>
	//    6   14:athrow          
		else
			return;
	//    7   15:return          
	}

	private boolean mCancelInProgress;
	private Object mCancellationSignalObj;
	private boolean mIsCanceled;
	private OnCancelListener mOnCancelListener;
}
