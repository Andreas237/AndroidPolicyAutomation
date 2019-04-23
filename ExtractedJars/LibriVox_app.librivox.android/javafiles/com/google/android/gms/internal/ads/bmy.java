// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bmw, bnf, bmz, bmx, 
//			bnu, bna

final class bmy extends Handler
	implements Runnable
{

	public bmy(bmw bmw1, Looper looper, bmz bmz1, bmx bmx1, int j, long l)
	{
		i = bmw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field bmw i>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #33  <Method void Handler(Looper)>
		b = bmz1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #35  <Field bmz b>
		c = bmx1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #37  <Field bmx c>
		a = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #39  <Field int a>
		d = l;
	//   15   27:aload_0         
	//   16   28:lload           6
	//   17   30:putfield        #41  <Field long d>
	//   18   33:return          
	}

	private final void a()
	{
		e = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #45  <Field IOException e>
		bmw.b(i).execute(((Runnable) (bmw.a(i))));
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field bmw i>
	//    5    9:invokestatic    #50  <Method ExecutorService bmw.b(bmw)>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field bmw i>
	//    8   16:invokestatic    #53  <Method bmy bmw.a(bmw)>
	//    9   19:invokeinterface #59  <Method void ExecutorService.execute(Runnable)>
	//   10   24:return          
	}

	private final void b()
	{
		bmw.a(i, ((bmy) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field bmw i>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #62  <Method bmy bmw.a(bmw, bmy)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void a(int j)
	{
		IOException ioexception = e;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field IOException e>
	//    2    4:astore_2        
		if(ioexception != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          20
		{
			if(f <= j)
	//*   5    9:aload_0         
	//*   6   10:getfield        #65  <Field int f>
	//*   7   13:iload_1         
	//*   8   14:icmpgt          18
				return;
	//    9   17:return          
			else
				throw ioexception;
	//   10   18:aload_2         
	//   11   19:athrow          
		} else
		{
			return;
	//   12   20:return          
		}
	}

	public final void a(long l)
	{
		boolean flag;
		if(bmw.a(i) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field bmw i>
	//*   2    4:invokestatic    #53  <Method bmy bmw.a(bmw)>
	//*   3    7:ifnonnull       15
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore_3        
		else
	//*   6   12:goto            17
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_3        
		bnf.b(flag);
	//    9   17:iload_3         
	//   10   18:invokestatic    #71  <Method void bnf.b(boolean)>
		bmw.a(i, this);
	//   11   21:aload_0         
	//   12   22:getfield        #30  <Field bmw i>
	//   13   25:aload_0         
	//   14   26:invokestatic    #62  <Method bmy bmw.a(bmw, bmy)>
	//   15   29:pop             
		if(l > 0L)
	//*  16   30:lload_1         
	//*  17   31:lconst_0        
	//*  18   32:lcmp            
	//*  19   33:ifle            44
		{
			sendEmptyMessageDelayed(0, l);
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:lload_1         
	//   23   39:invokevirtual   #75  <Method boolean sendEmptyMessageDelayed(int, long)>
	//   24   42:pop             
			return;
	//   25   43:return          
		} else
		{
			a();
	//   26   44:aload_0         
	//   27   45:invokespecial   #77  <Method void a()>
			return;
	//   28   48:return          
		}
	}

	public final void a(boolean flag)
	{
		h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field boolean h>
		e = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #45  <Field IOException e>
		if(hasMessages(0))
	//*   6   10:aload_0         
	//*   7   11:iconst_0        
	//*   8   12:invokevirtual   #83  <Method boolean hasMessages(int)>
	//*   9   15:ifeq            36
		{
			removeMessages(0);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #86  <Method void removeMessages(int)>
			if(!flag)
	//*  13   23:iload_1         
	//*  14   24:ifne            59
				sendEmptyMessage(1);
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #89  <Method boolean sendEmptyMessage(int)>
	//   18   32:pop             
		} else
	//*  19   33:goto            59
		{
			b.a();
	//   20   36:aload_0         
	//   21   37:getfield        #35  <Field bmz b>
	//   22   40:invokeinterface #92  <Method void bmz.a()>
			if(g != null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #94  <Field Thread g>
	//*  25   49:ifnull          59
				g.interrupt();
	//   26   52:aload_0         
	//   27   53:getfield        #94  <Field Thread g>
	//   28   56:invokevirtual   #99  <Method void Thread.interrupt()>
		}
		if(flag)
	//*  29   59:iload_1         
	//*  30   60:ifeq            92
		{
			b();
	//   31   63:aload_0         
	//   32   64:invokespecial   #101 <Method void b()>
			long l = SystemClock.elapsedRealtime();
	//   33   67:invokestatic    #107 <Method long SystemClock.elapsedRealtime()>
	//   34   70:lstore_2        
			c.a(b, l, l - d, true);
	//   35   71:aload_0         
	//   36   72:getfield        #37  <Field bmx c>
	//   37   75:aload_0         
	//   38   76:getfield        #35  <Field bmz b>
	//   39   79:lload_2         
	//   40   80:lload_2         
	//   41   81:aload_0         
	//   42   82:getfield        #41  <Field long d>
	//   43   85:lsub            
	//   44   86:iconst_1        
	//   45   87:invokeinterface #112 <Method void bmx.a(bmz, long, long, boolean)>
		}
	//   46   92:return          
	}

	public final void handleMessage(Message message)
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean h>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(message.what == 0)
	//*   4    8:aload_1         
	//*   5    9:getfield        #119 <Field int Message.what>
	//*   6   12:ifne            20
		{
			a();
	//    7   15:aload_0         
	//    8   16:invokespecial   #77  <Method void a()>
			return;
	//    9   19:return          
		}
		if(message.what != 4)
	//*  10   20:aload_1         
	//*  11   21:getfield        #119 <Field int Message.what>
	//*  12   24:iconst_4        
	//*  13   25:icmpeq          240
		{
			b();
	//   14   28:aload_0         
	//   15   29:invokespecial   #101 <Method void b()>
			long l = SystemClock.elapsedRealtime();
	//   16   32:invokestatic    #107 <Method long SystemClock.elapsedRealtime()>
	//   17   35:lstore_3        
			long l1 = l - d;
	//   18   36:lload_3         
	//   19   37:aload_0         
	//   20   38:getfield        #41  <Field long d>
	//   21   41:lsub            
	//   22   42:lstore          5
			if(b.b())
	//*  23   44:aload_0         
	//*  24   45:getfield        #35  <Field bmz b>
	//*  25   48:invokeinterface #122 <Method boolean bmz.b()>
	//*  26   53:ifeq            74
			{
				c.a(b, l, l1, false);
	//   27   56:aload_0         
	//   28   57:getfield        #37  <Field bmx c>
	//   29   60:aload_0         
	//   30   61:getfield        #35  <Field bmz b>
	//   31   64:lload_3         
	//   32   65:lload           5
	//   33   67:iconst_0        
	//   34   68:invokeinterface #112 <Method void bmx.a(bmz, long, long, boolean)>
				return;
	//   35   73:return          
			}
			switch(message.what)
	//*  36   74:aload_1         
	//*  37   75:getfield        #119 <Field int Message.what>
			{
	//*  38   78:tableswitch     1 3: default 104
	//	               1 221
	//	               2 204
	//	               3 105
			default:
				return;
	//   39  104:return          

			case 3: // '\003'
				e = (IOException)message.obj;
	//   40  105:aload_0         
	//   41  106:aload_1         
	//   42  107:getfield        #126 <Field Object Message.obj>
	//   43  110:checkcast       #128 <Class IOException>
	//   44  113:putfield        #45  <Field IOException e>
				int j = c.a(b, l, l1, e);
	//   45  116:aload_0         
	//   46  117:getfield        #37  <Field bmx c>
	//   47  120:aload_0         
	//   48  121:getfield        #35  <Field bmz b>
	//   49  124:lload_3         
	//   50  125:lload           5
	//   51  127:aload_0         
	//   52  128:getfield        #45  <Field IOException e>
	//   53  131:invokeinterface #131 <Method int bmx.a(bmz, long, long, IOException)>
	//   54  136:istore_2        
				if(j == 3)
	//*  55  137:iload_2         
	//*  56  138:iconst_3        
	//*  57  139:icmpne          155
				{
					bmw.a(i, e);
	//   58  142:aload_0         
	//   59  143:getfield        #30  <Field bmw i>
	//   60  146:aload_0         
	//   61  147:getfield        #45  <Field IOException e>
	//   62  150:invokestatic    #134 <Method IOException bmw.a(bmw, IOException)>
	//   63  153:pop             
					return;
	//   64  154:return          
				}
				if(j != 2)
	//*  65  155:iload_2         
	//*  66  156:iconst_2        
	//*  67  157:icmpeq          239
				{
					if(j == 1)
	//*  68  160:iload_2         
	//*  69  161:iconst_1        
	//*  70  162:icmpne          170
						j = 1;
	//   71  165:iconst_1        
	//   72  166:istore_2        
					else
	//*  73  167:goto            177
						j = f + 1;
	//   74  170:aload_0         
	//   75  171:getfield        #65  <Field int f>
	//   76  174:iconst_1        
	//   77  175:iadd            
	//   78  176:istore_2        
					f = j;
	//   79  177:aload_0         
	//   80  178:iload_2         
	//   81  179:putfield        #65  <Field int f>
					a(Math.min((f - 1) * 1000, 5000));
	//   82  182:aload_0         
	//   83  183:aload_0         
	//   84  184:getfield        #65  <Field int f>
	//   85  187:iconst_1        
	//   86  188:isub            
	//   87  189:sipush          1000
	//   88  192:imul            
	//   89  193:sipush          5000
	//   90  196:invokestatic    #140 <Method int Math.min(int, int)>
	//   91  199:i2l             
	//   92  200:invokevirtual   #142 <Method void a(long)>
					return;
	//   93  203:return          
				} else
	//*  94  204:aload_0         
	//*  95  205:getfield        #37  <Field bmx c>
	//*  96  208:aload_0         
	//*  97  209:getfield        #35  <Field bmz b>
	//*  98  212:lload_3         
	//*  99  213:lload           5
	//* 100  215:invokeinterface #145 <Method void bmx.a(bmz, long, long)>
	//* 101  220:return          
	//* 102  221:aload_0         
	//* 103  222:getfield        #37  <Field bmx c>
	//* 104  225:aload_0         
	//* 105  226:getfield        #35  <Field bmz b>
	//* 106  229:lload_3         
	//* 107  230:lload           5
	//* 108  232:iconst_0        
	//* 109  233:invokeinterface #112 <Method void bmx.a(bmz, long, long, boolean)>
	//* 110  238:return          
				{
					return;
	//  111  239:return          
				}

			case 2: // '\002'
				c.a(b, l, l1);
				return;

			case 1: // '\001'
				c.a(b, l, l1, false);
				return;
			}
		} else
		{
			throw (Error)message.obj;
	//  112  240:aload_1         
	//  113  241:getfield        #126 <Field Object Message.obj>
	//  114  244:checkcast       #147 <Class Error>
	//  115  247:athrow          
		}
	}

	public final void run()
	{
		String s;
		g = Thread.currentThread();
	//    0    0:aload_0         
	//    1    1:invokestatic    #158 <Method Thread Thread.currentThread()>
	//    2    4:putfield        #94  <Field Thread g>
		if(b.b())
			break MISSING_BLOCK_LABEL_85;
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field bmz b>
	//    5   11:invokeinterface #122 <Method boolean bmz.b()>
	//    6   16:ifne            85
		s = String.valueOf(((Object) (((Object) (b)).getClass().getSimpleName())));
	//    7   19:aload_0         
	//    8   20:getfield        #35  <Field bmz b>
	//    9   23:invokevirtual   #164 <Method Class Object.getClass()>
	//   10   26:invokevirtual   #170 <Method String Class.getSimpleName()>
	//   11   29:invokestatic    #176 <Method String String.valueOf(Object)>
	//   12   32:astore_1        
		if(s.length() != 0)
	//*  13   33:aload_1         
	//*  14   34:invokevirtual   #180 <Method int String.length()>
	//*  15   37:ifeq            50
		{
			s = "load:".concat(s);
	//   16   40:ldc1            #182 <String "load:">
	//   17   42:aload_1         
	//   18   43:invokevirtual   #186 <Method String String.concat(String)>
	//   19   46:astore_1        
			break MISSING_BLOCK_LABEL_60;
	//   20   47:goto            60
		}
		s = new String("load:");
	//   21   50:new             #172 <Class String>
	//   22   53:dup             
	//   23   54:ldc1            #182 <String "load:">
	//   24   56:invokespecial   #189 <Method void String(String)>
	//   25   59:astore_1        
		bnu.a(s);
	//   26   60:aload_1         
	//   27   61:invokestatic    #193 <Method void bnu.a(String)>
		b.c();
	//   28   64:aload_0         
	//   29   65:getfield        #35  <Field bmz b>
	//   30   68:invokeinterface #195 <Method void bmz.c()>
		Exception exception;
		try
		{
			bnu.a();
	//   31   73:invokestatic    #196 <Method void bnu.a()>
		}
	//*  32   76:goto            85
	//*  33   79:astore_1        
	//*  34   80:invokestatic    #196 <Method void bnu.a()>
	//*  35   83:aload_1         
	//*  36   84:athrow          
	//*  37   85:aload_0         
	//*  38   86:getfield        #79  <Field boolean h>
	//*  39   89:ifne            98
	//*  40   92:aload_0         
	//*  41   93:iconst_2        
	//*  42   94:invokevirtual   #89  <Method boolean sendEmptyMessage(int)>
	//*  43   97:pop             
	//*  44   98:return          
	//*  45   99:astore_1        
	//*  46  100:ldc1            #198 <String "LoadTask">
	//*  47  102:ldc1            #200 <String "Unexpected error loading stream">
	//*  48  104:aload_1         
	//*  49  105:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//*  50  108:pop             
	//*  51  109:aload_0         
	//*  52  110:getfield        #79  <Field boolean h>
	//*  53  113:ifne            125
	//*  54  116:aload_0         
	//*  55  117:iconst_4        
	//*  56  118:aload_1         
	//*  57  119:invokevirtual   #209 <Method Message obtainMessage(int, Object)>
	//*  58  122:invokevirtual   #212 <Method void Message.sendToTarget()>
	//*  59  125:aload_1         
	//*  60  126:athrow          
	//*  61  127:astore_1        
	//*  62  128:ldc1            #198 <String "LoadTask">
	//*  63  130:ldc1            #214 <String "OutOfMemory error loading stream">
	//*  64  132:aload_1         
	//*  65  133:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//*  66  136:pop             
	//*  67  137:aload_0         
	//*  68  138:getfield        #79  <Field boolean h>
	//*  69  141:ifne            160
	//*  70  144:aload_0         
	//*  71  145:iconst_3        
	//*  72  146:new             #216 <Class bna>
	//*  73  149:dup             
	//*  74  150:aload_1         
	//*  75  151:invokespecial   #219 <Method void bna(Throwable)>
	//*  76  154:invokevirtual   #209 <Method Message obtainMessage(int, Object)>
	//*  77  157:invokevirtual   #212 <Method void Message.sendToTarget()>
	//*  78  160:return          
	//*  79  161:astore_1        
	//*  80  162:ldc1            #198 <String "LoadTask">
	//*  81  164:ldc1            #221 <String "Unexpected exception loading stream">
	//*  82  166:aload_1         
	//*  83  167:invokestatic    #205 <Method int Log.e(String, String, Throwable)>
	//*  84  170:pop             
	//*  85  171:aload_0         
	//*  86  172:getfield        #79  <Field boolean h>
	//*  87  175:ifne            194
	//*  88  178:aload_0         
	//*  89  179:iconst_3        
	//*  90  180:new             #216 <Class bna>
	//*  91  183:dup             
	//*  92  184:aload_1         
	//*  93  185:invokespecial   #219 <Method void bna(Throwable)>
	//*  94  188:invokevirtual   #209 <Method Message obtainMessage(int, Object)>
	//*  95  191:invokevirtual   #212 <Method void Message.sendToTarget()>
	//*  96  194:return          
	//*  97  195:aload_0         
	//*  98  196:getfield        #35  <Field bmz b>
	//*  99  199:invokeinterface #122 <Method boolean bmz.b()>
	//* 100  204:invokestatic    #71  <Method void bnf.b(boolean)>
	//* 101  207:aload_0         
	//* 102  208:getfield        #79  <Field boolean h>
	//* 103  211:ifne            220
	//* 104  214:aload_0         
	//* 105  215:iconst_2        
	//* 106  216:invokevirtual   #89  <Method boolean sendEmptyMessage(int)>
	//* 107  219:pop             
	//* 108  220:return          
		catch(IOException ioexception)
	//* 109  221:astore_1        
		{
			if(!h)
	//* 110  222:aload_0         
	//* 111  223:getfield        #79  <Field boolean h>
	//* 112  226:ifne            238
				obtainMessage(3, ((Object) (ioexception))).sendToTarget();
	//  113  229:aload_0         
	//  114  230:iconst_3        
	//  115  231:aload_1         
	//  116  232:invokevirtual   #209 <Method Message obtainMessage(int, Object)>
	//  117  235:invokevirtual   #212 <Method void Message.sendToTarget()>
			return;
	//  118  238:return          
		}
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			bnf.b(b.b());
			if(!h)
				sendEmptyMessage(2);
			return;
		}
		catch(Exception exception1)
		{
			Log.e("LoadTask", "Unexpected exception loading stream", ((Throwable) (exception1)));
			if(!h)
				obtainMessage(3, ((Object) (new bna(((Throwable) (exception1)))))).sendToTarget();
			return;
		}
		catch(OutOfMemoryError outofmemoryerror)
		{
			Log.e("LoadTask", "OutOfMemory error loading stream", ((Throwable) (outofmemoryerror)));
			if(!h)
				obtainMessage(3, ((Object) (new bna(((Throwable) (outofmemoryerror)))))).sendToTarget();
			return;
		}
		catch(Error error)
		{
			Log.e("LoadTask", "Unexpected error loading stream", ((Throwable) (error)));
			if(!h)
				obtainMessage(4, ((Object) (error))).sendToTarget();
			throw error;
		}
		break MISSING_BLOCK_LABEL_85;
		exception;
		bnu.a();
		throw exception;
		InterruptedException interruptedexception;
		if(!h)
			sendEmptyMessage(2);
		return;
	//* 119  239:astore_1        
	//* 120  240:goto            195
	}

	public final int a;
	private final bmz b;
	private final bmx c;
	private final long d;
	private IOException e;
	private int f;
	private volatile Thread g;
	private volatile boolean h;
	private final bmw i;
}
