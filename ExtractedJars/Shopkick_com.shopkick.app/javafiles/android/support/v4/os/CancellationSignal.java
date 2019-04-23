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
	//*   2    4:ifeq            14
			try
			{
				((Object)this).wait();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #27  <Method void Object.wait()>
			}
	//*   5   11:goto            0
	//*   6   14:return          
			catch(InterruptedException interruptedexception) { }
	//    7   15:astore_1        
	//*   8   16:goto            0
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
			break MISSING_BLOCK_LABEL_47;
	//   22   34:aload_1         
	//   23   35:ifnull          47
		oncancellistener.onCancel();
	//   24   38:aload_1         
	//   25   39:invokeinterface #37  <Method void CancellationSignal$OnCancelListener.onCancel()>
	//*  26   44:goto            47
		if(obj == null) goto _L2; else goto _L1
	//   27   47:aload_2         
	//   28   48:ifnull          89
_L1:
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  29   51:getstatic       #43  <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   54:bipush          16
	//*  31   56:icmplt          89
			((android.os.CancellationSignal)obj).cancel();
	//   32   59:aload_2         
	//   33   60:checkcast       #45  <Class android.os.CancellationSignal>
	//   34   63:invokevirtual   #47  <Method void android.os.CancellationSignal.cancel()>
		  goto _L2
	//*  35   66:goto            89
_L4:
		this;
	//   36   69:aload_0         
		JVM INSTR monitorenter ;
	//   37   70:monitorenter    
		mCancelInProgress = false;
	//   38   71:aload_0         
	//   39   72:iconst_0        
	//   40   73:putfield        #24  <Field boolean mCancelInProgress>
		((Object)this).notifyAll();
	//   41   76:aload_0         
	//   42   77:invokevirtual   #50  <Method void Object.notifyAll()>
		this;
	//   43   80:aload_0         
		JVM INSTR monitorexit ;
	//   44   81:monitorexit     
		Exception exception;
		throw exception;
	//   45   82:aload_1         
	//   46   83:athrow          
		exception;
	//   47   84:astore_1        
		this;
	//   48   85:aload_0         
		JVM INSTR monitorexit ;
	//   49   86:monitorexit     
		throw exception;
	//   50   87:aload_1         
	//   51   88:athrow          
_L2:
		this;
	//   52   89:aload_0         
		JVM INSTR monitorenter ;
	//   53   90:monitorenter    
		mCancelInProgress = false;
	//   54   91:aload_0         
	//   55   92:iconst_0        
	//   56   93:putfield        #24  <Field boolean mCancelInProgress>
		((Object)this).notifyAll();
	//   57   96:aload_0         
	//   58   97:invokevirtual   #50  <Method void Object.notifyAll()>
		this;
	//   59  100:aload_0         
		JVM INSTR monitorexit ;
	//   60  101:monitorexit     
		return;
	//   61  102:return          
		exception;
	//   62  103:astore_1        
		this;
	//   63  104:aload_0         
		JVM INSTR monitorexit ;
	//   64  105:monitorexit     
		throw exception;
	//   65  106:aload_1         
	//   66  107:athrow          
		exception;
	//   67  108:astore_1        
		this;
	//   68  109:aload_0         
		JVM INSTR monitorexit ;
	//   69  110:monitorexit     
		throw exception;
	//   70  111:aload_1         
	//   71  112:athrow          
		exception;
	//   72  113:astore_1        
		if(true) goto _L4; else goto _L3
_L3:
	//*  73  114:goto            69
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
		if(!mIsCanceled || oncancellistener == null)
	//*  14   22:aload_0         
	//*  15   23:getfield        #30  <Field boolean mIsCanceled>
	//*  16   26:ifeq            45
	//*  17   29:aload_1         
	//*  18   30:ifnonnull       36
			break MISSING_BLOCK_LABEL_45;
	//   19   33:goto            45
		this;
	//   20   36:aload_0         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		oncancellistener.onCancel();
	//   22   38:aload_1         
	//   23   39:invokeinterface #37  <Method void CancellationSignal$OnCancelListener.onCancel()>
		return;
	//   24   44:return          
		this;
	//   25   45:aload_0         
		JVM INSTR monitorexit ;
	//   26   46:monitorexit     
		return;
	//   27   47:return          
		oncancellistener;
	//   28   48:astore_1        
		this;
	//   29   49:aload_0         
		JVM INSTR monitorexit ;
	//   30   50:monitorexit     
		throw oncancellistener;
	//   31   51:aload_1         
	//   32   52:athrow          
	}

	public void throwIfCanceled()
	{
		if(!isCanceled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #62  <Method boolean isCanceled()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new OperationCanceledException();
	//    4    8:new             #64  <Class OperationCanceledException>
	//    5   11:dup             
	//    6   12:invokespecial   #65  <Method void OperationCanceledException()>
	//    7   15:athrow          
	}

	private boolean mCancelInProgress;
	private Object mCancellationSignalObj;
	private boolean mIsCanceled;
	private OnCancelListener mOnCancelListener;
}
