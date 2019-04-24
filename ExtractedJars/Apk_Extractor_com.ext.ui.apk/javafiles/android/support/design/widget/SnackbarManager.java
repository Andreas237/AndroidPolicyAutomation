// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.*;
import java.lang.ref.WeakReference;

class SnackbarManager
{
	static interface Callback
	{

		public abstract void dismiss(int i);

		public abstract void show();
	}

	private static class SnackbarRecord
	{

		boolean isSnackbar(Callback callback1)
		{
			return callback1 != null && callback.get() == callback1;
		//    0    0:aload_1         
		//    1    1:ifnull          17
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field WeakReference callback>
		//    4    8:invokevirtual   #35  <Method Object WeakReference.get()>
		//    5   11:aload_1         
		//    6   12:if_acmpne       17
		//    7   15:iconst_1        
		//    8   16:ireturn         
		//    9   17:iconst_0        
		//   10   18:ireturn         
		}

		final WeakReference callback;
		int duration;
		boolean paused;

		SnackbarRecord(int i, Callback callback1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			callback = new WeakReference(((Object) (callback1)));
		//    2    4:aload_0         
		//    3    5:new             #21  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_2         
		//    6   10:invokespecial   #24  <Method void WeakReference(Object)>
		//    7   13:putfield        #26  <Field WeakReference callback>
			duration = i;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #28  <Field int duration>
		//   11   21:return          
		}
	}


	private SnackbarManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void Object()>
	//    6   12:putfield        #34  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #36  <Class Handler>
	//    9   19:dup             
	//   10   20:invokestatic    #42  <Method Looper Looper.getMainLooper()>
	//   11   23:new             #6   <Class SnackbarManager$1>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #45  <Method void SnackbarManager$1(SnackbarManager)>
	//   15   31:invokespecial   #48  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   16   34:putfield        #50  <Field Handler mHandler>
	//   17   37:return          
	}

	private boolean cancelSnackbarLocked(SnackbarRecord snackbarrecord, int i)
	{
		Callback callback = (Callback)snackbarrecord.callback.get();
	//    0    0:aload_1         
	//    1    1:getfield        #57  <Field WeakReference SnackbarManager$SnackbarRecord.callback>
	//    2    4:invokevirtual   #63  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class SnackbarManager$Callback>
	//    4   10:astore_3        
		if(callback != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          32
		{
			mHandler.removeCallbacksAndMessages(((Object) (snackbarrecord)));
	//    7   15:aload_0         
	//    8   16:getfield        #50  <Field Handler mHandler>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #67  <Method void Handler.removeCallbacksAndMessages(Object)>
			callback.dismiss(i);
	//   11   23:aload_3         
	//   12   24:iload_2         
	//   13   25:invokeinterface #71  <Method void SnackbarManager$Callback.dismiss(int)>
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
		} else
		{
			return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
		}
	}

	static SnackbarManager getInstance()
	{
		if(sSnackbarManager == null)
	//*   0    0:getstatic       #75  <Field SnackbarManager sSnackbarManager>
	//*   1    3:ifnonnull       16
			sSnackbarManager = new SnackbarManager();
	//    2    6:new             #2   <Class SnackbarManager>
	//    3    9:dup             
	//    4   10:invokespecial   #76  <Method void SnackbarManager()>
	//    5   13:putstatic       #75  <Field SnackbarManager sSnackbarManager>
		return sSnackbarManager;
	//    6   16:getstatic       #75  <Field SnackbarManager sSnackbarManager>
	//    7   19:areturn         
	}

	private boolean isCurrentSnackbarLocked(Callback callback)
	{
		return mCurrentSnackbar != null && mCurrentSnackbar.isSnackbar(callback);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #83  <Method boolean SnackbarManager$SnackbarRecord.isSnackbar(SnackbarManager$Callback)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private boolean isNextSnackbarLocked(Callback callback)
	{
		return mNextSnackbar != null && mNextSnackbar.isSnackbar(callback);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #83  <Method boolean SnackbarManager$SnackbarRecord.isSnackbar(SnackbarManager$Callback)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private void scheduleTimeoutLocked(SnackbarRecord snackbarrecord)
	{
		int i;
		if(snackbarrecord.duration == -2)
	//*   0    0:aload_1         
	//*   1    1:getfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
	//*   2    4:bipush          -2
	//*   3    6:icmpne          10
			return;
	//    4    9:return          
		i = 2750;
	//    5   10:sipush          2750
	//    6   13:istore_2        
		if(snackbarrecord.duration <= 0) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:getfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
	//    9   18:ifle            54
_L1:
		i = snackbarrecord.duration;
	//   10   21:aload_1         
	//   11   22:getfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
	//   12   25:istore_2        
_L4:
		mHandler.removeCallbacksAndMessages(((Object) (snackbarrecord)));
	//   13   26:aload_0         
	//   14   27:getfield        #50  <Field Handler mHandler>
	//   15   30:aload_1         
	//   16   31:invokevirtual   #67  <Method void Handler.removeCallbacksAndMessages(Object)>
		mHandler.sendMessageDelayed(Message.obtain(mHandler, 0, ((Object) (snackbarrecord))), i);
	//   17   34:aload_0         
	//   18   35:getfield        #50  <Field Handler mHandler>
	//   19   38:aload_0         
	//   20   39:getfield        #50  <Field Handler mHandler>
	//   21   42:iconst_0        
	//   22   43:aload_1         
	//   23   44:invokestatic    #97  <Method Message Message.obtain(Handler, int, Object)>
	//   24   47:iload_2         
	//   25   48:i2l             
	//   26   49:invokevirtual   #101 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   27   52:pop             
		return;
	//   28   53:return          
_L2:
		if(snackbarrecord.duration == -1)
	//*  29   54:aload_1         
	//*  30   55:getfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
	//*  31   58:iconst_m1       
	//*  32   59:icmpne          26
			i = 1500;
	//   33   62:sipush          1500
	//   34   65:istore_2        
		if(true) goto _L4; else goto _L3
	//   35   66:goto            26
_L3:
	}

	private void showNextSnackbarLocked()
	{
label0:
		{
			if(mNextSnackbar != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
	//*   2    4:ifnull          44
			{
				mCurrentSnackbar = mNextSnackbar;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
	//    6   12:putfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
				mNextSnackbar = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
				Callback callback = (Callback)mCurrentSnackbar.callback.get();
	//   10   20:aload_0         
	//   11   21:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   12   24:getfield        #57  <Field WeakReference SnackbarManager$SnackbarRecord.callback>
	//   13   27:invokevirtual   #63  <Method Object WeakReference.get()>
	//   14   30:checkcast       #8   <Class SnackbarManager$Callback>
	//   15   33:astore_1        
				if(callback == null)
					break label0;
	//   16   34:aload_1         
	//   17   35:ifnull          45
				callback.show();
	//   18   38:aload_1         
	//   19   39:invokeinterface #105 <Method void SnackbarManager$Callback.show()>
			}
			return;
	//   20   44:return          
		}
		mCurrentSnackbar = null;
	//   21   45:aload_0         
	//   22   46:aconst_null     
	//   23   47:putfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   24   50:return          
	}

	public void dismiss(Callback callback, int i)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!isCurrentSnackbarLocked(callback)) goto _L2; else goto _L1
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//    8   12:ifeq            28
_L1:
		cancelSnackbarLocked(mCurrentSnackbar, i);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   12   20:iload_2         
	//   13   21:invokespecial   #110 <Method boolean cancelSnackbarLocked(SnackbarManager$SnackbarRecord, int)>
	//   14   24:pop             
	//*  15   25:aload_3         
_L4:
		return;
	//   16   26:monitorexit     
	//   17   27:return          
_L2:
		if(isNextSnackbarLocked(callback))
	//*  18   28:aload_0         
	//*  19   29:aload_1         
	//*  20   30:invokespecial   #112 <Method boolean isNextSnackbarLocked(SnackbarManager$Callback)>
	//*  21   33:ifeq            25
			cancelSnackbarLocked(mNextSnackbar, i);
	//   22   36:aload_0         
	//   23   37:aload_0         
	//   24   38:getfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
	//   25   41:iload_2         
	//   26   42:invokespecial   #110 <Method boolean cancelSnackbarLocked(SnackbarManager$SnackbarRecord, int)>
	//   27   45:pop             
		if(true) goto _L4; else goto _L3
	//   28   46:goto            25
_L3:
		callback;
	//   29   49:astore_1        
		obj;
	//   30   50:aload_3         
		JVM INSTR monitorexit ;
	//   31   51:monitorexit     
		throw callback;
	//   32   52:aload_1         
	//   33   53:athrow          
	}

	void handleTimeout(SnackbarRecord snackbarrecord)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(mCurrentSnackbar == snackbarrecord || mNextSnackbar == snackbarrecord)
	//*   5    7:aload_0         
	//*   6    8:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//*   7   11:aload_1         
	//*   8   12:if_acmpeq       23
	//*   9   15:aload_0         
	//*  10   16:getfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
	//*  11   19:aload_1         
	//*  12   20:if_acmpne       30
				cancelSnackbarLocked(snackbarrecord, 2);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:invokespecial   #110 <Method boolean cancelSnackbarLocked(SnackbarManager$SnackbarRecord, int)>
	//   17   29:pop             
		}
	//   18   30:aload_2         
	//   19   31:monitorexit     
		return;
	//   20   32:return          
		snackbarrecord;
	//   21   33:astore_1        
		obj;
	//   22   34:aload_2         
		JVM INSTR monitorexit ;
	//   23   35:monitorexit     
		throw snackbarrecord;
	//   24   36:aload_1         
	//   25   37:athrow          
	}

	public boolean isCurrent(Callback callback)
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			flag = isCurrentSnackbarLocked(callback);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//    8   12:istore_2        
		}
	//    9   13:aload_3         
	//   10   14:monitorexit     
		return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
		callback;
	//   13   17:astore_1        
		obj;
	//   14   18:aload_3         
		JVM INSTR monitorexit ;
	//   15   19:monitorexit     
		throw callback;
	//   16   20:aload_1         
	//   17   21:athrow          
	}

	public boolean isCurrentOrNext(Callback callback)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object mLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if(isCurrentSnackbarLocked(callback) || isNextSnackbarLocked(callback))
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifne            35
	//*   9   15:aload_0         
	//*  10   16:aload_1         
	//*  11   17:invokespecial   #112 <Method boolean isNextSnackbarLocked(SnackbarManager$Callback)>
	//*  12   20:ifeq            40
	//*  13   23:goto            35
	//*  14   26:aload_3         
	//*  15   27:monitorexit     
	//*  16   28:iload_2         
	//*  17   29:ireturn         
	//*  18   30:astore_1        
	//*  19   31:aload_3         
	//*  20   32:monitorexit     
	//*  21   33:aload_1         
	//*  22   34:athrow          
			flag = true;
	//   23   35:iconst_1        
	//   24   36:istore_2        
		else
	//*  25   37:goto            26
			flag = false;
	//   26   40:iconst_0        
	//   27   41:istore_2        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		callback;
		obj;
		JVM INSTR monitorexit ;
		throw callback;
	//*  28   42:goto            26
	}

	public void onDismissed(Callback callback)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(isCurrentSnackbarLocked(callback))
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifeq            31
			{
				mCurrentSnackbar = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
				if(mNextSnackbar != null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
	//*  14   24:ifnull          31
					showNextSnackbarLocked();
	//   15   27:aload_0         
	//   16   28:invokespecial   #119 <Method void showNextSnackbarLocked()>
			}
		}
	//   17   31:aload_2         
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		callback;
	//   20   34:astore_1        
		obj;
	//   21   35:aload_2         
		JVM INSTR monitorexit ;
	//   22   36:monitorexit     
		throw callback;
	//   23   37:aload_1         
	//   24   38:athrow          
	}

	public void onShown(Callback callback)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(isCurrentSnackbarLocked(callback))
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifeq            23
				scheduleTimeoutLocked(mCurrentSnackbar);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   12   20:invokespecial   #122 <Method void scheduleTimeoutLocked(SnackbarManager$SnackbarRecord)>
		}
	//   13   23:aload_2         
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		callback;
	//   16   26:astore_1        
		obj;
	//   17   27:aload_2         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw callback;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public void pauseTimeout(Callback callback)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(isCurrentSnackbarLocked(callback) && !mCurrentSnackbar.paused)
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifeq            44
	//*   9   15:aload_0         
	//*  10   16:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//*  11   19:getfield        #127 <Field boolean SnackbarManager$SnackbarRecord.paused>
	//*  12   22:ifne            44
			{
				mCurrentSnackbar.paused = true;
	//   13   25:aload_0         
	//   14   26:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   15   29:iconst_1        
	//   16   30:putfield        #127 <Field boolean SnackbarManager$SnackbarRecord.paused>
				mHandler.removeCallbacksAndMessages(((Object) (mCurrentSnackbar)));
	//   17   33:aload_0         
	//   18   34:getfield        #50  <Field Handler mHandler>
	//   19   37:aload_0         
	//   20   38:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   21   41:invokevirtual   #67  <Method void Handler.removeCallbacksAndMessages(Object)>
			}
		}
	//   22   44:aload_2         
	//   23   45:monitorexit     
		return;
	//   24   46:return          
		callback;
	//   25   47:astore_1        
		obj;
	//   26   48:aload_2         
		JVM INSTR monitorexit ;
	//   27   49:monitorexit     
		throw callback;
	//   28   50:aload_1         
	//   29   51:athrow          
	}

	public void restoreTimeoutIfPaused(Callback callback)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(isCurrentSnackbarLocked(callback) && mCurrentSnackbar.paused)
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifeq            41
	//*   9   15:aload_0         
	//*  10   16:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//*  11   19:getfield        #127 <Field boolean SnackbarManager$SnackbarRecord.paused>
	//*  12   22:ifeq            41
			{
				mCurrentSnackbar.paused = false;
	//   13   25:aload_0         
	//   14   26:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   15   29:iconst_0        
	//   16   30:putfield        #127 <Field boolean SnackbarManager$SnackbarRecord.paused>
				scheduleTimeoutLocked(mCurrentSnackbar);
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   20   38:invokespecial   #122 <Method void scheduleTimeoutLocked(SnackbarManager$SnackbarRecord)>
			}
		}
	//   21   41:aload_2         
	//   22   42:monitorexit     
		return;
	//   23   43:return          
		callback;
	//   24   44:astore_1        
		obj;
	//   25   45:aload_2         
		JVM INSTR monitorexit ;
	//   26   46:monitorexit     
		throw callback;
	//   27   47:aload_1         
	//   28   48:athrow          
	}

	public void show(int i, Callback callback)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(!isCurrentSnackbarLocked(callback))
					break label0;
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//    8   12:ifeq            45
				mCurrentSnackbar.duration = i;
	//    9   15:aload_0         
	//   10   16:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   11   19:iload_1         
	//   12   20:putfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
				mHandler.removeCallbacksAndMessages(((Object) (mCurrentSnackbar)));
	//   13   23:aload_0         
	//   14   24:getfield        #50  <Field Handler mHandler>
	//   15   27:aload_0         
	//   16   28:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   17   31:invokevirtual   #67  <Method void Handler.removeCallbacksAndMessages(Object)>
				scheduleTimeoutLocked(mCurrentSnackbar);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   21   39:invokespecial   #122 <Method void scheduleTimeoutLocked(SnackbarManager$SnackbarRecord)>
			}
	//   22   42:aload_3         
	//   23   43:monitorexit     
			return;
	//   24   44:return          
		}
		if(!isNextSnackbarLocked(callback))
			break MISSING_BLOCK_LABEL_88;
	//   25   45:aload_0         
	//   26   46:aload_2         
	//   27   47:invokespecial   #112 <Method boolean isNextSnackbarLocked(SnackbarManager$Callback)>
	//   28   50:ifeq            88
		mNextSnackbar.duration = i;
	//   29   53:aload_0         
	//   30   54:getfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
	//   31   57:iload_1         
	//   32   58:putfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
_L1:
		if(mCurrentSnackbar == null || !cancelSnackbarLocked(mCurrentSnackbar, 4))
			break MISSING_BLOCK_LABEL_104;
	//   33   61:aload_0         
	//   34   62:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   35   65:ifnull          104
	//   36   68:aload_0         
	//   37   69:aload_0         
	//   38   70:getfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
	//   39   73:iconst_4        
	//   40   74:invokespecial   #110 <Method boolean cancelSnackbarLocked(SnackbarManager$SnackbarRecord, int)>
	//   41   77:ifeq            104
		obj;
	//   42   80:aload_3         
		JVM INSTR monitorexit ;
	//   43   81:monitorexit     
		return;
	//   44   82:return          
		callback;
	//   45   83:astore_2        
		obj;
	//   46   84:aload_3         
		JVM INSTR monitorexit ;
	//   47   85:monitorexit     
		throw callback;
	//   48   86:aload_2         
	//   49   87:athrow          
		mNextSnackbar = new SnackbarRecord(i, callback);
	//   50   88:aload_0         
	//   51   89:new             #11  <Class SnackbarManager$SnackbarRecord>
	//   52   92:dup             
	//   53   93:iload_1         
	//   54   94:aload_2         
	//   55   95:invokespecial   #131 <Method void SnackbarManager$SnackbarRecord(int, SnackbarManager$Callback)>
	//   56   98:putfield        #86  <Field SnackbarManager$SnackbarRecord mNextSnackbar>
		  goto _L1
	//*  57  101:goto            61
		mCurrentSnackbar = null;
	//   58  104:aload_0         
	//   59  105:aconst_null     
	//   60  106:putfield        #80  <Field SnackbarManager$SnackbarRecord mCurrentSnackbar>
		showNextSnackbarLocked();
	//   61  109:aload_0         
	//   62  110:invokespecial   #119 <Method void showNextSnackbarLocked()>
		obj;
	//   63  113:aload_3         
		JVM INSTR monitorexit ;
	//   64  114:monitorexit     
	//   65  115:return          
	}

	private static final int LONG_DURATION_MS = 2750;
	static final int MSG_TIMEOUT = 0;
	private static final int SHORT_DURATION_MS = 1500;
	private static SnackbarManager sSnackbarManager;
	private SnackbarRecord mCurrentSnackbar;
	private final Handler mHandler = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

		public boolean handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #26  <Field int Message.what>
			{
		//*   2    4:tableswitch     0 0: default 24
		//		               0 26
			default:
				return false;
		//    3   24:iconst_0        
		//    4   25:ireturn         

			case 0: // '\0'
				handleTimeout((SnackbarRecord)message.obj);
		//    5   26:aload_0         
		//    6   27:getfield        #16  <Field SnackbarManager this$0>
		//    7   30:aload_1         
		//    8   31:getfield        #30  <Field Object Message.obj>
		//    9   34:checkcast       #32  <Class SnackbarManager$SnackbarRecord>
		//   10   37:invokevirtual   #36  <Method void SnackbarManager.handleTimeout(SnackbarManager$SnackbarRecord)>
				break;
			}
			return true;
		//   11   40:iconst_1        
		//   12   41:ireturn         
		}

		final SnackbarManager this$0;

			
			{
				this$0 = SnackbarManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field SnackbarManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
);
	private final Object mLock = new Object();
	private SnackbarRecord mNextSnackbar;
}
