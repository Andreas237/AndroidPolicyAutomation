// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2:
//			Timeline, IllegalSeekPositionException, ExoPlaybackException

public final class PlayerMessage
{
	public static interface Sender
	{

		public abstract void sendMessage(PlayerMessage playermessage);
	}

	public static interface Target
	{

		public abstract void handleMessage(int i, Object obj)
			throws ExoPlaybackException;
	}


	public PlayerMessage(Sender sender1, Target target1, Timeline timeline1, int i, Handler handler1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		sender = sender1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field PlayerMessage$Sender sender>
		target = target1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field PlayerMessage$Target target>
		timeline = timeline1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #42  <Field Timeline timeline>
		handler = handler1;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #44  <Field Handler handler>
		windowIndex = i;
	//   14   25:aload_0         
	//   15   26:iload           4
	//   16   28:putfield        #46  <Field int windowIndex>
		positionMs = 0x1L;
	//   17   31:aload_0         
	//   18   32:ldc2w           #47  <Long 0x1L>
	//   19   35:putfield        #50  <Field long positionMs>
		deleteAfterDelivery = true;
	//   20   38:aload_0         
	//   21   39:iconst_1        
	//   22   40:putfield        #52  <Field boolean deleteAfterDelivery>
	//   23   43:return          
	}

	public boolean blockUntilDelivered()
		throws InterruptedException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(isSent);
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field boolean isSent>
	//    4    6:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		boolean flag;
		Exception exception;
		if(handler.getLooper().getThread() != Thread.currentThread())
	//*   5    9:aload_0         
	//*   6   10:getfield        #44  <Field Handler handler>
	//*   7   13:invokevirtual   #71  <Method Looper Handler.getLooper()>
	//*   8   16:invokevirtual   #77  <Method Thread Looper.getThread()>
	//*   9   19:invokestatic    #82  <Method Thread Thread.currentThread()>
	//*  10   22:if_acmpeq       62
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
		else
	//*  13   27:goto            30
	//*  14   30:iload_1         
	//*  15   31:invokestatic    #65  <Method void Assertions.checkState(boolean)>
	//*  16   34:aload_0         
	//*  17   35:getfield        #84  <Field boolean isProcessed>
	//*  18   38:ifne            48
	//*  19   41:aload_0         
	//*  20   42:invokevirtual   #87  <Method void Object.wait()>
	//*  21   45:goto            34
	//*  22   48:aload_0         
	//*  23   49:getfield        #89  <Field boolean isDelivered>
	//*  24   52:istore_1        
	//*  25   53:aload_0         
	//*  26   54:monitorexit     
	//*  27   55:iload_1         
	//*  28   56:ireturn         
	//*  29   57:astore_2        
	//*  30   58:aload_0         
	//*  31   59:monitorexit     
	//*  32   60:aload_2         
	//*  33   61:athrow          
			flag = false;
	//   34   62:iconst_0        
	//   35   63:istore_1        
		Assertions.checkState(flag);
		while(!isProcessed) 
			((Object)this).wait();
		flag = isDelivered;
		this;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		throw exception;
	//*  36   64:goto            30
	}

	public PlayerMessage cancel()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Assertions.checkState(isSent);
	//    2    2:aload_0         
	//    3    3:getfield        #59  <Field boolean isSent>
	//    4    6:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		isCanceled = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #94  <Field boolean isCanceled>
		markAsProcessed(false);
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #97  <Method void markAsProcessed(boolean)>
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return this;
	//   13   21:aload_0         
	//   14   22:areturn         
		Exception exception;
		exception;
	//   15   23:astore_1        
	//*  16   24:aload_0         
		throw exception;
	//   17   25:monitorexit     
	//   18   26:aload_1         
	//   19   27:athrow          
	}

	public boolean getDeleteAfterDelivery()
	{
		return deleteAfterDelivery;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean deleteAfterDelivery>
	//    2    4:ireturn         
	}

	public Handler getHandler()
	{
		return handler;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Handler handler>
	//    2    4:areturn         
	}

	public Object getPayload()
	{
		return payload;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Object payload>
	//    2    4:areturn         
	}

	public long getPositionMs()
	{
		return positionMs;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long positionMs>
	//    2    4:lreturn         
	}

	public Target getTarget()
	{
		return target;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field PlayerMessage$Target target>
	//    2    4:areturn         
	}

	public Timeline getTimeline()
	{
		return timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Timeline timeline>
	//    2    4:areturn         
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int type>
	//    2    4:ireturn         
	}

	public int getWindowIndex()
	{
		return windowIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int windowIndex>
	//    2    4:ireturn         
	}

	public boolean isCanceled()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isCanceled;
	//    2    2:aload_0         
	//    3    3:getfield        #94  <Field boolean isCanceled>
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

	public void markAsProcessed(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		isDelivered = flag | isDelivered;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:aload_0         
	//    5    5:getfield        #89  <Field boolean isDelivered>
	//    6    8:ior             
	//    7    9:putfield        #89  <Field boolean isDelivered>
		isProcessed = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #84  <Field boolean isProcessed>
		((Object)this).notifyAll();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #118 <Method void Object.notifyAll()>
		this;
	//   13   21:aload_0         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		return;
	//   15   23:return          
		Exception exception;
		exception;
	//   16   24:astore_2        
	//*  17   25:aload_0         
		throw exception;
	//   18   26:monitorexit     
	//   19   27:aload_2         
	//   20   28:athrow          
	}

	public PlayerMessage send()
	{
		Assertions.checkState(isSent ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean isSent>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		if(positionMs == 0x1L)
	//*   5    9:aload_0         
	//*   6   10:getfield        #50  <Field long positionMs>
	//*   7   13:ldc2w           #47  <Long 0x1L>
	//*   8   16:lcmp            
	//*   9   17:ifne            27
			Assertions.checkArgument(deleteAfterDelivery);
	//   10   20:aload_0         
	//   11   21:getfield        #52  <Field boolean deleteAfterDelivery>
	//   12   24:invokestatic    #122 <Method void Assertions.checkArgument(boolean)>
		isSent = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #59  <Field boolean isSent>
		sender.sendMessage(this);
	//   16   32:aload_0         
	//   17   33:getfield        #38  <Field PlayerMessage$Sender sender>
	//   18   36:aload_0         
	//   19   37:invokeinterface #126 <Method void PlayerMessage$Sender.sendMessage(PlayerMessage)>
		return this;
	//   20   42:aload_0         
	//   21   43:areturn         
	}

	public PlayerMessage setDeleteAfterDelivery(boolean flag)
	{
		Assertions.checkState(isSent ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean isSent>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		deleteAfterDelivery = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #52  <Field boolean deleteAfterDelivery>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public PlayerMessage setHandler(Handler handler1)
	{
		Assertions.checkState(isSent ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean isSent>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		handler = handler1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #44  <Field Handler handler>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public PlayerMessage setPayload(Object obj)
	{
		Assertions.checkState(isSent ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean isSent>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		payload = obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #104 <Field Object payload>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public PlayerMessage setPosition(int i, long l)
	{
		boolean flag1 = isSent;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean isSent>
	//    2    4:istore          5
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          4
		Assertions.checkState(flag1 ^ true);
	//    5    9:iload           5
	//    6   11:iconst_1        
	//    7   12:ixor            
	//    8   13:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		if(l == 0x1L)
	//*   9   16:lload_2         
	//*  10   17:ldc2w           #47  <Long 0x1L>
	//*  11   20:lcmp            
	//*  12   21:ifeq            27
	//*  13   24:goto            30
			flag = false;
	//   14   27:iconst_0        
	//   15   28:istore          4
		Assertions.checkArgument(flag);
	//   16   30:iload           4
	//   17   32:invokestatic    #122 <Method void Assertions.checkArgument(boolean)>
		if(i >= 0 && (timeline.isEmpty() || i < timeline.getWindowCount()))
	//*  18   35:iload_1         
	//*  19   36:iflt            75
	//*  20   39:aload_0         
	//*  21   40:getfield        #42  <Field Timeline timeline>
	//*  22   43:invokevirtual   #141 <Method boolean Timeline.isEmpty()>
	//*  23   46:ifne            63
	//*  24   49:iload_1         
	//*  25   50:aload_0         
	//*  26   51:getfield        #42  <Field Timeline timeline>
	//*  27   54:invokevirtual   #144 <Method int Timeline.getWindowCount()>
	//*  28   57:icmplt          63
	//*  29   60:goto            75
		{
			windowIndex = i;
	//   30   63:aload_0         
	//   31   64:iload_1         
	//   32   65:putfield        #46  <Field int windowIndex>
			positionMs = l;
	//   33   68:aload_0         
	//   34   69:lload_2         
	//   35   70:putfield        #50  <Field long positionMs>
			return this;
	//   36   73:aload_0         
	//   37   74:areturn         
		} else
		{
			throw new IllegalSeekPositionException(timeline, i, l);
	//   38   75:new             #146 <Class IllegalSeekPositionException>
	//   39   78:dup             
	//   40   79:aload_0         
	//   41   80:getfield        #42  <Field Timeline timeline>
	//   42   83:iload_1         
	//   43   84:lload_2         
	//   44   85:invokespecial   #149 <Method void IllegalSeekPositionException(Timeline, int, long)>
	//   45   88:athrow          
		}
	}

	public PlayerMessage setPosition(long l)
	{
		Assertions.checkState(isSent ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean isSent>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		positionMs = l;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #50  <Field long positionMs>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public PlayerMessage setType(int i)
	{
		Assertions.checkState(isSent ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean isSent>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #65  <Method void Assertions.checkState(boolean)>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #114 <Field int type>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	private boolean deleteAfterDelivery;
	private Handler handler;
	private boolean isCanceled;
	private boolean isDelivered;
	private boolean isProcessed;
	private boolean isSent;
	private Object payload;
	private long positionMs;
	private final Sender sender;
	private final Target target;
	private final Timeline timeline;
	private int type;
	private int windowIndex;
}
