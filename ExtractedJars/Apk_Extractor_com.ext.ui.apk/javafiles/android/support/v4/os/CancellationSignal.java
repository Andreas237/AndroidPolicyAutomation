// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;


// Referenced classes of package android.support.v4.os:
//			OperationCanceledException

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
		if(!mIsCanceled)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field boolean mIsCanceled>
	//    4    6:ifeq            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		OnCancelListener oncancellistener;
		Object obj;
		mIsCanceled = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #30  <Field boolean mIsCanceled>
		mCancelInProgress = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #24  <Field boolean mCancelInProgress>
		oncancellistener = mOnCancelListener;
	//   14   22:aload_0         
	//   15   23:getfield        #32  <Field CancellationSignal$OnCancelListener mOnCancelListener>
	//   16   26:astore_1        
		obj = mCancellationSignalObj;
	//   17   27:aload_0         
	//   18   28:getfield        #34  <Field Object mCancellationSignalObj>
	//   19   31:astore_2        
		this;
	//   20   32:aload_0         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		if(oncancellistener == null)
			break MISSING_BLOCK_LABEL_44;
	//   22   34:aload_1         
	//   23   35:ifnull          44
		oncancellistener.onCancel();
	//   24   38:aload_1         
	//   25   39:invokeinterface #37  <Method void CancellationSignal$OnCancelListener.onCancel()>
		if(obj == null)
			break MISSING_BLOCK_LABEL_63;
	//   26   44:aload_2         
	//   27   45:ifnull          63
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  28   48:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*  29   51:bipush          16
	//*  30   53:icmplt          63
			((android.os.CancellationSignal)obj).cancel();
	//   31   56:aload_2         
	//   32   57:checkcast       #45  <Class android.os.CancellationSignal>
	//   33   60:invokevirtual   #47  <Method void android.os.CancellationSignal.cancel()>
		this;
	//   34   63:aload_0         
		JVM INSTR monitorenter ;
	//   35   64:monitorenter    
		mCancelInProgress = false;
	//   36   65:aload_0         
	//   37   66:iconst_0        
	//   38   67:putfield        #24  <Field boolean mCancelInProgress>
		((Object)this).notifyAll();
	//   39   70:aload_0         
	//   40   71:invokevirtual   #50  <Method void Object.notifyAll()>
		this;
	//   41   74:aload_0         
		JVM INSTR monitorexit ;
	//   42   75:monitorexit     
		return;
	//   43   76:return          
		Exception exception;
		exception;
	//   44   77:astore_1        
		this;
	//   45   78:aload_0         
		JVM INSTR monitorexit ;
	//   46   79:monitorexit     
		throw exception;
	//   47   80:aload_1         
	//   48   81:athrow          
		exception;
	//   49   82:astore_1        
		this;
	//   50   83:aload_0         
		JVM INSTR monitorexit ;
	//   51   84:monitorexit     
		throw exception;
	//   52   85:aload_1         
	//   53   86:athrow          
		exception;
	//   54   87:astore_1        
		this;
	//   55   88:aload_0         
		JVM INSTR monitorenter ;
	//   56   89:monitorenter    
		mCancelInProgress = false;
	//   57   90:aload_0         
	//   58   91:iconst_0        
	//   59   92:putfield        #24  <Field boolean mCancelInProgress>
		((Object)this).notifyAll();
	//   60   95:aload_0         
	//   61   96:invokevirtual   #50  <Method void Object.notifyAll()>
		this;
	//   62   99:aload_0         
		JVM INSTR monitorexit ;
	//   63  100:monitorexit     
		throw exception;
	//   64  101:aload_1         
	//   65  102:athrow          
		exception;
	//   66  103:astore_1        
		this;
	//   67  104:aload_0         
		JVM INSTR monitorexit ;
	//   68  105:monitorexit     
		throw exception;
	//   69  106:aload_1         
	//   70  107:athrow          
	}

	public Object getCancellationSignalObject()
	{
		if(android.os.Build.VERSION.SDK_INT < 16)
	//*   0    0:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
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
	//*   9   16:ifnonnull       47
		{
			mCancellationSignalObj = ((Object) (new android.os.CancellationSignal()));
	//   10   19:aload_0         
	//   11   20:new             #45  <Class android.os.CancellationSignal>
	//   12   23:dup             
	//   13   24:invokespecial   #53  <Method void android.os.CancellationSignal()>
	//   14   27:putfield        #34  <Field Object mCancellationSignalObj>
			if(mIsCanceled)
	//*  15   30:aload_0         
	//*  16   31:getfield        #30  <Field boolean mIsCanceled>
	//*  17   34:ifeq            47
				((android.os.CancellationSignal)mCancellationSignalObj).cancel();
	//   18   37:aload_0         
	//   19   38:getfield        #34  <Field Object mCancellationSignalObj>
	//   20   41:checkcast       #45  <Class android.os.CancellationSignal>
	//   21   44:invokevirtual   #47  <Method void android.os.CancellationSignal.cancel()>
		}
		obj = mCancellationSignalObj;
	//   22   47:aload_0         
	//   23   48:getfield        #34  <Field Object mCancellationSignalObj>
	//   24   51:astore_1        
		this;
	//   25   52:aload_0         
		JVM INSTR monitorexit ;
	//   26   53:monitorexit     
		return obj;
	//   27   54:aload_1         
	//   28   55:areturn         
		Exception exception;
		exception;
	//   29   56:astore_1        
		this;
	//   30   57:aload_0         
		JVM INSTR monitorexit ;
	//   31   58:monitorexit     
		throw exception;
	//   32   59:aload_1         
	//   33   60:athrow          
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
		this;
	//   10   12:aload_0         
		JVM INSTR monitorexit ;
	//   11   13:monitorexit     
		throw exception;
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public void setOnCancelListener(OnCancelListener oncancellistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		waitForCancelFinishedLocked();
	//    2    2:aload_0         
	//    3    3:invokespecial   #59  <Method void waitForCancelFinishedLocked()>
		if(mOnCancelListener != oncancellistener)
			break MISSING_BLOCK_LABEL_17;
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field CancellationSignal$OnCancelListener mOnCancelListener>
	//    6   10:aload_1         
	//    7   11:if_acmpne       17
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		mOnCancelListener = oncancellistener;
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:putfield        #32  <Field CancellationSignal$OnCancelListener mOnCancelListener>
		if(mIsCanceled && oncancellistener != null)
			break MISSING_BLOCK_LABEL_41;
	//   14   22:aload_0         
	//   15   23:getfield        #30  <Field boolean mIsCanceled>
	//   16   26:ifeq            33
	//   17   29:aload_1         
	//   18   30:ifnonnull       41
		this;
	//   19   33:aload_0         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		return;
	//   21   35:return          
		oncancellistener;
	//   22   36:astore_1        
		this;
	//   23   37:aload_0         
		JVM INSTR monitorexit ;
	//   24   38:monitorexit     
		throw oncancellistener;
	//   25   39:aload_1         
	//   26   40:athrow          
		this;
	//   27   41:aload_0         
		JVM INSTR monitorexit ;
	//   28   42:monitorexit     
		oncancellistener.onCancel();
	//   29   43:aload_1         
	//   30   44:invokeinterface #37  <Method void CancellationSignal$OnCancelListener.onCancel()>
		return;
	//   31   49:return          
	}

	public void throwIfCanceled()
	{
		if(isCanceled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #62  <Method boolean isCanceled()>
	//*   2    4:ifeq            15
			throw new OperationCanceledException();
	//    3    7:new             #64  <Class OperationCanceledException>
	//    4   10:dup             
	//    5   11:invokespecial   #65  <Method void OperationCanceledException()>
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
