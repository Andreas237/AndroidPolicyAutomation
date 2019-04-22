// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.e;

import android.os.*;
import android.util.Log;
import com.google.ads.interactivemedia.v3.a.f.b;
import com.google.ads.interactivemedia.v3.a.f.p;
import java.io.IOException;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.e:
//			l

private final class l$b extends Handler
	implements Runnable
{

	private void b()
	{
		l.a(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field l a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #35  <Method boolean l.a(l, boolean)>
	//    4    8:pop             
		l.a(a, ((l$b) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field l a>
	//    7   13:aconst_null     
	//    8   14:invokestatic    #38  <Method l$b l.a(l, l$b)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void a()
	{
		b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field l$c b>
	//    2    4:invokeinterface #42  <Method void l$c.a()>
		if(d != null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #44  <Field Thread d>
	//*   5   13:ifnull          23
			d.interrupt();
	//    6   16:aload_0         
	//    7   17:getfield        #44  <Field Thread d>
	//    8   20:invokevirtual   #49  <Method void Thread.interrupt()>
	//    9   23:return          
	}

	public void handleMessage(Message message)
	{
		if(message.what != 2)
	//*   0    0:aload_1         
	//*   1    1:getfield        #57  <Field int Message.what>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          100
		{
			b();
	//    4    8:aload_0         
	//    5    9:invokespecial   #59  <Method void b()>
			if(b.b())
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field l$c b>
	//*   8   16:invokeinterface #62  <Method boolean com.google.ads.interactivemedia.v3.a.e.l$c.b()>
	//*   9   21:ifeq            38
			{
				c.b(b);
	//   10   24:aload_0         
	//   11   25:getfield        #30  <Field l$a c>
	//   12   28:aload_0         
	//   13   29:getfield        #28  <Field l$c b>
	//   14   32:invokeinterface #67  <Method void com.google.ads.interactivemedia.v3.a.e.l$a.b(l$c)>
				return;
	//   15   37:return          
			}
			switch(message.what)
	//*  16   38:aload_1         
	//*  17   39:getfield        #57  <Field int Message.what>
			{
	//*  18   42:tableswitch     0 1: default 64
	//	               0 86
	//	               1 65
			default:
				return;
	//   19   64:return          

			case 1: // '\001'
				c.a(b, (IOException)message.obj);
	//   20   65:aload_0         
	//   21   66:getfield        #30  <Field l$a c>
	//   22   69:aload_0         
	//   23   70:getfield        #28  <Field l$c b>
	//   24   73:aload_1         
	//   25   74:getfield        #71  <Field Object Message.obj>
	//   26   77:checkcast       #73  <Class IOException>
	//   27   80:invokeinterface #76  <Method void l$a.a(l$c, IOException)>
				return;
	//   28   85:return          

			case 0: // '\0'
				c.a(b);
	//   29   86:aload_0         
	//   30   87:getfield        #30  <Field l$a c>
	//   31   90:aload_0         
	//   32   91:getfield        #28  <Field l$c b>
	//   33   94:invokeinterface #78  <Method void l$a.a(l$c)>
				return;
	//   34   99:return          
			}
		} else
		{
			throw (Error)message.obj;
	//   35  100:aload_1         
	//   36  101:getfield        #71  <Field Object Message.obj>
	//   37  104:checkcast       #80  <Class Error>
	//   38  107:athrow          
		}
	}

	public void run()
	{
		InterruptedException interruptedexception;
		try
		{
			d = Thread.currentThread();
	//    0    0:aload_0         
	//    1    1:invokestatic    #89  <Method Thread Thread.currentThread()>
	//    2    4:putfield        #44  <Field Thread d>
			if(!b.b())
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field l$c b>
	//*   5   11:invokeinterface #62  <Method boolean com.google.ads.interactivemedia.v3.a.e.l$c.b()>
	//*   6   16:ifne            52
			{
				p.a(String.valueOf(((Object) (((Object) (b)).getClass().getSimpleName()))).concat(".load()"));
	//    7   19:aload_0         
	//    8   20:getfield        #28  <Field l$c b>
	//    9   23:invokevirtual   #95  <Method Class Object.getClass()>
	//   10   26:invokevirtual   #101 <Method String Class.getSimpleName()>
	//   11   29:invokestatic    #107 <Method String String.valueOf(Object)>
	//   12   32:ldc1            #109 <String ".load()">
	//   13   34:invokevirtual   #113 <Method String String.concat(String)>
	//   14   37:invokestatic    #118 <Method void p.a(String)>
				b.c();
	//   15   40:aload_0         
	//   16   41:getfield        #28  <Field l$c b>
	//   17   44:invokeinterface #120 <Method void l$c.c()>
				p.a();
	//   18   49:invokestatic    #121 <Method void p.a()>
			}
			sendEmptyMessage(0);
	//   19   52:aload_0         
	//   20   53:iconst_0        
	//   21   54:invokevirtual   #125 <Method boolean sendEmptyMessage(int)>
	//   22   57:pop             
			return;
	//   23   58:return          
		}
	//*  24   59:astore_1        
	//*  25   60:ldc1            #127 <String "LoadTask">
	//*  26   62:ldc1            #129 <String "Unexpected error loading stream">
	//*  27   64:aload_1         
	//*  28   65:invokestatic    #135 <Method int Log.e(String, String, Throwable)>
	//*  29   68:pop             
	//*  30   69:aload_0         
	//*  31   70:iconst_2        
	//*  32   71:aload_1         
	//*  33   72:invokevirtual   #139 <Method Message obtainMessage(int, Object)>
	//*  34   75:invokevirtual   #142 <Method void Message.sendToTarget()>
	//*  35   78:aload_1         
	//*  36   79:athrow          
	//*  37   80:astore_1        
	//*  38   81:ldc1            #127 <String "LoadTask">
	//*  39   83:ldc1            #144 <String "Unexpected exception loading stream">
	//*  40   85:aload_1         
	//*  41   86:invokestatic    #135 <Method int Log.e(String, String, Throwable)>
	//*  42   89:pop             
	//*  43   90:aload_0         
	//*  44   91:iconst_1        
	//*  45   92:new             #146 <Class l$d>
	//*  46   95:dup             
	//*  47   96:aload_1         
	//*  48   97:invokespecial   #149 <Method void l$d(Exception)>
	//*  49  100:invokevirtual   #139 <Method Message obtainMessage(int, Object)>
	//*  50  103:invokevirtual   #142 <Method void Message.sendToTarget()>
	//*  51  106:return          
	//*  52  107:aload_0         
	//*  53  108:getfield        #28  <Field l$c b>
	//*  54  111:invokeinterface #62  <Method boolean com.google.ads.interactivemedia.v3.a.e.l$c.b()>
	//*  55  116:invokestatic    #154 <Method void b.b(boolean)>
	//*  56  119:aload_0         
	//*  57  120:iconst_0        
	//*  58  121:invokevirtual   #125 <Method boolean sendEmptyMessage(int)>
	//*  59  124:pop             
	//*  60  125:return          
		catch(IOException ioexception)
	//*  61  126:astore_1        
		{
			obtainMessage(1, ((Object) (ioexception))).sendToTarget();
	//   62  127:aload_0         
	//   63  128:iconst_1        
	//   64  129:aload_1         
	//   65  130:invokevirtual   #139 <Method Message obtainMessage(int, Object)>
	//   66  133:invokevirtual   #142 <Method void Message.sendToTarget()>
		}
	//*  67  136:return          
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			com.google.ads.interactivemedia.v3.a.f.b.b(b.b());
			sendEmptyMessage(0);
			return;
		}
		catch(Exception exception)
		{
			Log.e("LoadTask", "Unexpected exception loading stream", ((Throwable) (exception)));
			obtainMessage(1, ((Object) (new l$d(exception)))).sendToTarget();
			return;
		}
		catch(Error error)
		{
			Log.e("LoadTask", "Unexpected error loading stream", ((Throwable) (error)));
			obtainMessage(2, ((Object) (error))).sendToTarget();
			throw error;
		}
	//*  68  137:astore_1        
	//*  69  138:goto            107
	}

	final l a;
	private final l$c b;
	private final l$a c;
	private volatile Thread d;

	public l$b(l l1, Looper looper, l$c l$c1, l$a l$a1)
	{
		a = l1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field l a>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #26  <Method void Handler(Looper)>
		b = l$c1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field l$c b>
		c = l$a1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field l$a c>
	//   12   21:return          
	}
}
