// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import android.view.Choreographer;

final class boj
	implements android.os.Handler.Callback, android.view.Choreographer.FrameCallback
{

	private boj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class HandlerThread>
	//    4    8:dup             
	//    5    9:ldc1            #33  <String "ChoreographerOwner:Handler">
	//    6   11:invokespecial   #36  <Method void HandlerThread(String)>
	//    7   14:putfield        #38  <Field HandlerThread d>
		d.start();
	//    8   17:aload_0         
	//    9   18:getfield        #38  <Field HandlerThread d>
	//   10   21:invokevirtual   #41  <Method void HandlerThread.start()>
		c = new Handler(d.getLooper(), ((android.os.Handler.Callback) (this)));
	//   11   24:aload_0         
	//   12   25:new             #43  <Class Handler>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:getfield        #38  <Field HandlerThread d>
	//   16   33:invokevirtual   #47  <Method android.os.Looper HandlerThread.getLooper()>
	//   17   36:aload_0         
	//   18   37:invokespecial   #50  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//   19   40:putfield        #52  <Field Handler c>
		c.sendEmptyMessage(0);
	//   20   43:aload_0         
	//   21   44:getfield        #52  <Field Handler c>
	//   22   47:iconst_0        
	//   23   48:invokevirtual   #56  <Method boolean Handler.sendEmptyMessage(int)>
	//   24   51:pop             
	//   25   52:return          
	}

	public static boj a()
	{
		return b;
	//    0    0:getstatic       #27  <Field boj b>
	//    1    3:areturn         
	}

	public final void b()
	{
		c.sendEmptyMessage(1);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Handler c>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #56  <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void c()
	{
		c.sendEmptyMessage(2);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Handler c>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #56  <Method boolean Handler.sendEmptyMessage(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void doFrame(long l)
	{
		a = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #61  <Field long a>
		e.postFrameCallbackDelayed(((android.view.Choreographer.FrameCallback) (this)), 500L);
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field Choreographer e>
	//    5    9:aload_0         
	//    6   10:ldc2w           #64  <Long 500L>
	//    7   13:invokevirtual   #71  <Method void Choreographer.postFrameCallbackDelayed(android.view.Choreographer$FrameCallback, long)>
	//    8   16:return          
	}

	public final boolean handleMessage(Message message)
	{
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #78  <Field int Message.what>
		{
	//*   2    4:tableswitch     0 2: default 32
	//	               0 94
	//	               1 66
	//	               2 34
		default:
			return false;
	//    3   32:iconst_0        
	//    4   33:ireturn         

		case 2: // '\002'
			f = f - 1;
	//    5   34:aload_0         
	//    6   35:aload_0         
	//    7   36:getfield        #80  <Field int f>
	//    8   39:iconst_1        
	//    9   40:isub            
	//   10   41:putfield        #80  <Field int f>
			if(f == 0)
	//*  11   44:aload_0         
	//*  12   45:getfield        #80  <Field int f>
	//*  13   48:ifne            64
			{
				e.removeFrameCallback(((android.view.Choreographer.FrameCallback) (this)));
	//   14   51:aload_0         
	//   15   52:getfield        #63  <Field Choreographer e>
	//   16   55:aload_0         
	//   17   56:invokevirtual   #84  <Method void Choreographer.removeFrameCallback(android.view.Choreographer$FrameCallback)>
				a = 0L;
	//   18   59:aload_0         
	//   19   60:lconst_0        
	//   20   61:putfield        #61  <Field long a>
			}
			return true;
	//   21   64:iconst_1        
	//   22   65:ireturn         

		case 1: // '\001'
			f = f + 1;
	//   23   66:aload_0         
	//   24   67:aload_0         
	//   25   68:getfield        #80  <Field int f>
	//   26   71:iconst_1        
	//   27   72:iadd            
	//   28   73:putfield        #80  <Field int f>
			if(f == 1)
	//*  29   76:aload_0         
	//*  30   77:getfield        #80  <Field int f>
	//*  31   80:iconst_1        
	//*  32   81:icmpne          92
				e.postFrameCallback(((android.view.Choreographer.FrameCallback) (this)));
	//   33   84:aload_0         
	//   34   85:getfield        #63  <Field Choreographer e>
	//   35   88:aload_0         
	//   36   89:invokevirtual   #87  <Method void Choreographer.postFrameCallback(android.view.Choreographer$FrameCallback)>
			return true;
	//   37   92:iconst_1        
	//   38   93:ireturn         

		case 0: // '\0'
			e = Choreographer.getInstance();
	//   39   94:aload_0         
	//   40   95:invokestatic    #91  <Method Choreographer Choreographer.getInstance()>
	//   41   98:putfield        #63  <Field Choreographer e>
			return true;
	//   42  101:iconst_1        
	//   43  102:ireturn         
		}
	}

	private static final boj b = new boj();
	public volatile long a;
	private final Handler c;
	private final HandlerThread d = new HandlerThread("ChoreographerOwner:Handler");
	private Choreographer e;
	private int f;

	static 
	{
	//    0    0:new             #2   <Class boj>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void boj()>
	//    3    7:putstatic       #27  <Field boj b>
	//*   4   10:return          
	}
}
