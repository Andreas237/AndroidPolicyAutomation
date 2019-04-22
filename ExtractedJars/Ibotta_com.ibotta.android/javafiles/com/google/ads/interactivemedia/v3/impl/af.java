// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.os.Handler;
import android.os.Message;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.*;

public abstract class af
	implements android.os.Handler.Callback
{
	protected static class a
	{

		protected void a(int i)
		{
			a.removeMessages(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Handler a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #22  <Method void Handler.removeMessages(int)>
		//    4    8:return          
		}

		protected boolean a(int i, long l)
		{
			return a.sendEmptyMessageDelayed(i, l);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Handler a>
		//    2    4:iload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #26  <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
		//    5    9:ireturn         
		}

		protected boolean b(int i)
		{
			return a.sendEmptyMessage(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Handler a>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #31  <Method boolean Handler.sendEmptyMessage(int)>
		//    4    8:ireturn         
		}

		protected boolean c(int i)
		{
			Handler handler = a;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field Handler a>
		//    2    4:astore_2        
			return handler.sendMessageAtFrontOfQueue(Message.obtain(handler, i));
		//    3    5:aload_2         
		//    4    6:aload_2         
		//    5    7:iload_1         
		//    6    8:invokestatic    #38  <Method Message Message.obtain(Handler, int)>
		//    7   11:invokevirtual   #42  <Method boolean Handler.sendMessageAtFrontOfQueue(Message)>
		//    8   14:ireturn         
		}

		private final Handler a;

		public a(Handler handler)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			a = handler;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field Handler a>
		//    5    9:return          
		}
	}

	public static interface b
	{

		public abstract void a(VideoProgressUpdate videoprogressupdate);
	}


	af(long l)
	{
		this(((a) (null)), l);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:lload_1         
	//    3    3:invokespecial   #24  <Method void af(af$a, long)>
	//    4    6:return          
	}

	af(a a1, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean c>
		d = ((List) (new ArrayList(1)));
	//    5    9:aload_0         
	//    6   10:new             #32  <Class ArrayList>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #35  <Method void ArrayList(int)>
	//   10   18:putfield        #37  <Field List d>
		b = l;
	//   11   21:aload_0         
	//   12   22:lload_2         
	//   13   23:putfield        #39  <Field long b>
		if(a1 != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          36
		{
			a = a1;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #41  <Field af$a a>
			return;
	//   19   35:return          
		} else
		{
			a = new a(new Handler(((android.os.Handler.Callback) (this))));
	//   20   36:aload_0         
	//   21   37:new             #8   <Class af$a>
	//   22   40:dup             
	//   23   41:new             #43  <Class Handler>
	//   24   44:dup             
	//   25   45:aload_0         
	//   26   46:invokespecial   #46  <Method void Handler(android.os.Handler$Callback)>
	//   27   49:invokespecial   #49  <Method void af$a(Handler)>
	//   28   52:putfield        #41  <Field af$a a>
			return;
	//   29   55:return          
		}
	}

	public abstract VideoProgressUpdate a();

	public void a(b b1)
	{
		d.add(((Object) (b1)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #57  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void b()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean c>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			c = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #30  <Field boolean c>
			a.b(1);
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field af$a a>
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #60  <Method boolean af$a.b(int)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	public void b(b b1)
	{
		d.remove(((Object) (b1)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #63  <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void c()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean c>
	//*   2    4:ifeq            21
		{
			c = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #30  <Field boolean c>
			a.c(2);
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field af$a a>
	//    8   16:iconst_2        
	//    9   17:invokevirtual   #65  <Method boolean af$a.c(int)>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public boolean handleMessage(Message message)
	{
		Iterator iterator;
		switch(message.what)
	//*   0    0:aload_1         
	//*   1    1:getfield        #73  <Field int Message.what>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 40
	//	               2 30
		default:
			return true;
	//    3   28:iconst_1        
	//    4   29:ireturn         

		case 2: // '\002'
			a.a(1);
	//    5   30:aload_0         
	//    6   31:getfield        #41  <Field af$a a>
	//    7   34:iconst_1        
	//    8   35:invokevirtual   #75  <Method void af$a.a(int)>
			return true;
	//    9   38:iconst_1        
	//   10   39:ireturn         

		case 1: // '\001'
			message = ((Message) (a()));
	//   11   40:aload_0         
	//   12   41:invokevirtual   #77  <Method VideoProgressUpdate a()>
	//   13   44:astore_1        
			iterator = d.iterator();
	//   14   45:aload_0         
	//   15   46:getfield        #37  <Field List d>
	//   16   49:invokeinterface #81  <Method Iterator List.iterator()>
	//   17   54:astore_2        
			break;
		}
		for(; iterator.hasNext(); ((b)iterator.next()).a(((VideoProgressUpdate) (message))));
	//   18   55:aload_2         
	//   19   56:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   20   61:ifeq            82
	//   21   64:aload_2         
	//   22   65:invokeinterface #91  <Method Object Iterator.next()>
	//   23   70:checkcast       #11  <Class af$b>
	//   24   73:aload_1         
	//   25   74:invokeinterface #94  <Method void af$b.a(VideoProgressUpdate)>
	//*  26   79:goto            55
		a.a(1, b);
	//   27   82:aload_0         
	//   28   83:getfield        #41  <Field af$a a>
	//   29   86:iconst_1        
	//   30   87:aload_0         
	//   31   88:getfield        #39  <Field long b>
	//   32   91:invokevirtual   #97  <Method boolean af$a.a(int, long)>
	//   33   94:pop             
		return true;
	//   34   95:iconst_1        
	//   35   96:ireturn         
	}

	private final a a;
	protected final long b;
	protected boolean c;
	private List d;
}
