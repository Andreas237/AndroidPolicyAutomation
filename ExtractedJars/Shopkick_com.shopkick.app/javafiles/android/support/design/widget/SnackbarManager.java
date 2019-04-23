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
	//    6   12:putfield        #34  <Field Object lock>
	//    7   15:aload_0         
	//    8   16:new             #36  <Class Handler>
	//    9   19:dup             
	//   10   20:invokestatic    #42  <Method Looper Looper.getMainLooper()>
	//   11   23:new             #6   <Class SnackbarManager$1>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #45  <Method void SnackbarManager$1(SnackbarManager)>
	//   15   31:invokespecial   #48  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   16   34:putfield        #50  <Field Handler handler>
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
			handler.removeCallbacksAndMessages(((Object) (snackbarrecord)));
	//    7   15:aload_0         
	//    8   16:getfield        #50  <Field Handler handler>
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
		if(snackbarManager == null)
	//*   0    0:getstatic       #75  <Field SnackbarManager snackbarManager>
	//*   1    3:ifnonnull       16
			snackbarManager = new SnackbarManager();
	//    2    6:new             #2   <Class SnackbarManager>
	//    3    9:dup             
	//    4   10:invokespecial   #76  <Method void SnackbarManager()>
	//    5   13:putstatic       #75  <Field SnackbarManager snackbarManager>
		return snackbarManager;
	//    6   16:getstatic       #75  <Field SnackbarManager snackbarManager>
	//    7   19:areturn         
	}

	private boolean isCurrentSnackbarLocked(Callback callback)
	{
		SnackbarRecord snackbarrecord = currentSnackbar;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//    2    4:astore_2        
		return snackbarrecord != null && snackbarrecord.isSnackbar(callback);
	//    3    5:aload_2         
	//    4    6:ifnull          19
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #83  <Method boolean SnackbarManager$SnackbarRecord.isSnackbar(SnackbarManager$Callback)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	private boolean isNextSnackbarLocked(Callback callback)
	{
		SnackbarRecord snackbarrecord = nextSnackbar;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field SnackbarManager$SnackbarRecord nextSnackbar>
	//    2    4:astore_2        
		return snackbarrecord != null && snackbarrecord.isSnackbar(callback);
	//    3    5:aload_2         
	//    4    6:ifnull          19
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #83  <Method boolean SnackbarManager$SnackbarRecord.isSnackbar(SnackbarManager$Callback)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	private void scheduleTimeoutLocked(SnackbarRecord snackbarrecord)
	{
		if(snackbarrecord.duration == -2)
	//*   0    0:aload_1         
	//*   1    1:getfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
	//*   2    4:bipush          -2
	//*   3    6:icmpne          10
			return;
	//    4    9:return          
		int i = 2750;
	//    5   10:sipush          2750
	//    6   13:istore_2        
		if(snackbarrecord.duration > 0)
	//*   7   14:aload_1         
	//*   8   15:getfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
	//*   9   18:ifle            29
			i = snackbarrecord.duration;
	//   10   21:aload_1         
	//   11   22:getfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
	//   12   25:istore_2        
		else
	//*  13   26:goto            41
		if(snackbarrecord.duration == -1)
	//*  14   29:aload_1         
	//*  15   30:getfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
	//*  16   33:iconst_m1       
	//*  17   34:icmpne          41
			i = 1500;
	//   18   37:sipush          1500
	//   19   40:istore_2        
		handler.removeCallbacksAndMessages(((Object) (snackbarrecord)));
	//   20   41:aload_0         
	//   21   42:getfield        #50  <Field Handler handler>
	//   22   45:aload_1         
	//   23   46:invokevirtual   #67  <Method void Handler.removeCallbacksAndMessages(Object)>
		Handler handler1 = handler;
	//   24   49:aload_0         
	//   25   50:getfield        #50  <Field Handler handler>
	//   26   53:astore_3        
		handler1.sendMessageDelayed(Message.obtain(handler1, 0, ((Object) (snackbarrecord))), i);
	//   27   54:aload_3         
	//   28   55:aload_3         
	//   29   56:iconst_0        
	//   30   57:aload_1         
	//   31   58:invokestatic    #97  <Method Message Message.obtain(Handler, int, Object)>
	//   32   61:iload_2         
	//   33   62:i2l             
	//   34   63:invokevirtual   #101 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   35   66:pop             
	//   36   67:return          
	}

	private void showNextSnackbarLocked()
	{
		Object obj = ((Object) (nextSnackbar));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field SnackbarManager$SnackbarRecord nextSnackbar>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          49
		{
			currentSnackbar = ((SnackbarRecord) (obj));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
			nextSnackbar = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #86  <Field SnackbarManager$SnackbarRecord nextSnackbar>
			obj = ((Object) ((Callback)currentSnackbar.callback.get()));
	//   11   19:aload_0         
	//   12   20:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   13   23:getfield        #57  <Field WeakReference SnackbarManager$SnackbarRecord.callback>
	//   14   26:invokevirtual   #63  <Method Object WeakReference.get()>
	//   15   29:checkcast       #8   <Class SnackbarManager$Callback>
	//   16   32:astore_1        
			if(obj != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          44
			{
				((Callback) (obj)).show();
	//   19   37:aload_1         
	//   20   38:invokeinterface #105 <Method void SnackbarManager$Callback.show()>
				return;
	//   21   43:return          
			}
			currentSnackbar = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
		}
	//   25   49:return          
	}

	public void dismiss(Callback callback, int i)
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object lock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(isCurrentSnackbarLocked(callback))
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifeq            28
		{
			cancelSnackbarLocked(currentSnackbar, i);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   12   20:iload_2         
	//   13   21:invokespecial   #110 <Method boolean cancelSnackbarLocked(SnackbarManager$SnackbarRecord, int)>
	//   14   24:pop             
			break MISSING_BLOCK_LABEL_46;
	//   15   25:goto            46
		}
		if(isNextSnackbarLocked(callback))
	//*  16   28:aload_0         
	//*  17   29:aload_1         
	//*  18   30:invokespecial   #112 <Method boolean isNextSnackbarLocked(SnackbarManager$Callback)>
	//*  19   33:ifeq            46
			cancelSnackbarLocked(nextSnackbar, i);
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #86  <Field SnackbarManager$SnackbarRecord nextSnackbar>
	//   23   41:iload_2         
	//   24   42:invokespecial   #110 <Method boolean cancelSnackbarLocked(SnackbarManager$SnackbarRecord, int)>
	//   25   45:pop             
		obj;
	//   26   46:aload_3         
		JVM INSTR monitorexit ;
	//   27   47:monitorexit     
		return;
	//   28   48:return          
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
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(currentSnackbar == snackbarrecord || nextSnackbar == snackbarrecord)
	//*   5    7:aload_0         
	//*   6    8:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//*   7   11:aload_1         
	//*   8   12:if_acmpeq       23
	//*   9   15:aload_0         
	//*  10   16:getfield        #86  <Field SnackbarManager$SnackbarRecord nextSnackbar>
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
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object lock>
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
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object lock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if(!isCurrentSnackbarLocked(callback) && !isNextSnackbarLocked(callback))
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifne            40
	//*   9   15:aload_0         
	//*  10   16:aload_1         
	//*  11   17:invokespecial   #112 <Method boolean isNextSnackbarLocked(SnackbarManager$Callback)>
	//*  12   20:ifeq            35
	//*  13   23:goto            40
	//*  14   26:aload_3         
	//*  15   27:monitorexit     
	//*  16   28:iload_2         
	//*  17   29:ireturn         
	//*  18   30:astore_1        
	//*  19   31:aload_3         
	//*  20   32:monitorexit     
	//*  21   33:aload_1         
	//*  22   34:athrow          
			flag = false;
	//   23   35:iconst_0        
	//   24   36:istore_2        
		else
	//*  25   37:goto            26
			flag = true;
	//   26   40:iconst_1        
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
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object lock>
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
				currentSnackbar = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
				if(nextSnackbar != null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #86  <Field SnackbarManager$SnackbarRecord nextSnackbar>
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
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(isCurrentSnackbarLocked(callback))
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifeq            23
				scheduleTimeoutLocked(currentSnackbar);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
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
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(isCurrentSnackbarLocked(callback) && !currentSnackbar.paused)
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifeq            44
	//*   9   15:aload_0         
	//*  10   16:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//*  11   19:getfield        #127 <Field boolean SnackbarManager$SnackbarRecord.paused>
	//*  12   22:ifne            44
			{
				currentSnackbar.paused = true;
	//   13   25:aload_0         
	//   14   26:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   15   29:iconst_1        
	//   16   30:putfield        #127 <Field boolean SnackbarManager$SnackbarRecord.paused>
				handler.removeCallbacksAndMessages(((Object) (currentSnackbar)));
	//   17   33:aload_0         
	//   18   34:getfield        #50  <Field Handler handler>
	//   19   37:aload_0         
	//   20   38:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
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
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(isCurrentSnackbarLocked(callback) && currentSnackbar.paused)
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #108 <Method boolean isCurrentSnackbarLocked(SnackbarManager$Callback)>
	//*   8   12:ifeq            41
	//*   9   15:aload_0         
	//*  10   16:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//*  11   19:getfield        #127 <Field boolean SnackbarManager$SnackbarRecord.paused>
	//*  12   22:ifeq            41
			{
				currentSnackbar.paused = false;
	//   13   25:aload_0         
	//   14   26:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   15   29:iconst_0        
	//   16   30:putfield        #127 <Field boolean SnackbarManager$SnackbarRecord.paused>
				scheduleTimeoutLocked(currentSnackbar);
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
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
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object lock>
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
				currentSnackbar.duration = i;
	//    9   15:aload_0         
	//   10   16:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   11   19:iload_1         
	//   12   20:putfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
				handler.removeCallbacksAndMessages(((Object) (currentSnackbar)));
	//   13   23:aload_0         
	//   14   24:getfield        #50  <Field Handler handler>
	//   15   27:aload_0         
	//   16   28:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   17   31:invokevirtual   #67  <Method void Handler.removeCallbacksAndMessages(Object)>
				scheduleTimeoutLocked(currentSnackbar);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   21   39:invokespecial   #122 <Method void scheduleTimeoutLocked(SnackbarManager$SnackbarRecord)>
			}
	//   22   42:aload_3         
	//   23   43:monitorexit     
			return;
	//   24   44:return          
		}
		if(isNextSnackbarLocked(callback))
	//*  25   45:aload_0         
	//*  26   46:aload_2         
	//*  27   47:invokespecial   #112 <Method boolean isNextSnackbarLocked(SnackbarManager$Callback)>
	//*  28   50:ifeq            64
		{
			nextSnackbar.duration = i;
	//   29   53:aload_0         
	//   30   54:getfield        #86  <Field SnackbarManager$SnackbarRecord nextSnackbar>
	//   31   57:iload_1         
	//   32   58:putfield        #91  <Field int SnackbarManager$SnackbarRecord.duration>
			break MISSING_BLOCK_LABEL_77;
	//   33   61:goto            77
		}
		nextSnackbar = new SnackbarRecord(i, callback);
	//   34   64:aload_0         
	//   35   65:new             #11  <Class SnackbarManager$SnackbarRecord>
	//   36   68:dup             
	//   37   69:iload_1         
	//   38   70:aload_2         
	//   39   71:invokespecial   #131 <Method void SnackbarManager$SnackbarRecord(int, SnackbarManager$Callback)>
	//   40   74:putfield        #86  <Field SnackbarManager$SnackbarRecord nextSnackbar>
		if(currentSnackbar == null || !cancelSnackbarLocked(currentSnackbar, 4))
			break MISSING_BLOCK_LABEL_99;
	//   41   77:aload_0         
	//   42   78:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   43   81:ifnull          99
	//   44   84:aload_0         
	//   45   85:aload_0         
	//   46   86:getfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
	//   47   89:iconst_4        
	//   48   90:invokespecial   #110 <Method boolean cancelSnackbarLocked(SnackbarManager$SnackbarRecord, int)>
	//   49   93:ifeq            99
		obj;
	//   50   96:aload_3         
		JVM INSTR monitorexit ;
	//   51   97:monitorexit     
		return;
	//   52   98:return          
		currentSnackbar = null;
	//   53   99:aload_0         
	//   54  100:aconst_null     
	//   55  101:putfield        #80  <Field SnackbarManager$SnackbarRecord currentSnackbar>
		showNextSnackbarLocked();
	//   56  104:aload_0         
	//   57  105:invokespecial   #119 <Method void showNextSnackbarLocked()>
		obj;
	//   58  108:aload_3         
		JVM INSTR monitorexit ;
	//   59  109:monitorexit     
		return;
	//   60  110:return          
		callback;
	//   61  111:astore_2        
		obj;
	//   62  112:aload_3         
		JVM INSTR monitorexit ;
	//   63  113:monitorexit     
		throw callback;
	//   64  114:aload_2         
	//   65  115:athrow          
	}

	private static final int LONG_DURATION_MS = 2750;
	static final int MSG_TIMEOUT = 0;
	private static final int SHORT_DURATION_MS = 1500;
	private static SnackbarManager snackbarManager;
	private SnackbarRecord currentSnackbar;
	private final Handler handler = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

		public boolean handleMessage(Message message)
		{
			if(message.what != 0)
		//*   0    0:aload_1         
		//*   1    1:getfield        #26  <Field int Message.what>
		//*   2    4:ifeq            9
			{
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			} else
			{
				handleTimeout((SnackbarRecord)message.obj);
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field SnackbarManager this$0>
		//    7   13:aload_1         
		//    8   14:getfield        #30  <Field Object Message.obj>
		//    9   17:checkcast       #32  <Class SnackbarManager$SnackbarRecord>
		//   10   20:invokevirtual   #36  <Method void SnackbarManager.handleTimeout(SnackbarManager$SnackbarRecord)>
				return true;
		//   11   23:iconst_1        
		//   12   24:ireturn         
			}
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
	private final Object lock = new Object();
	private SnackbarRecord nextSnackbar;
}
