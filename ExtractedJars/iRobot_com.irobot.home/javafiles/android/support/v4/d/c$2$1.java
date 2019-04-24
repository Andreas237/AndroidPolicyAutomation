// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.d;

import com.irobot.core.Error;
import com.irobot.core.NetworkSessionCallback;
import com.irobot.home.core.c;
import com.irobot.home.util.ConnectivityStateReceiver;
import com.irobot.home.util.o;
import java.io.IOException;

// Referenced classes of package android.support.v4.d:
//			c

class c$2$1
	implements Runnable
{

	public void run()
	{
		b.c.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field c$2 b>
	//    2    4:getfield        #28  <Field c$a android.support.v4.d.c$2.c>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Object a>
	//    5   11:invokeinterface #33  <Method void c$a.a(Object)>
	//    6   16:return          
	}

	final Object a;
	final c._cls2 b;

	c$2$1(c._cls2 _pcls2, Object obj)
	{
		b = _pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field c$2 b>
		a = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Object a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/irobot/home/o/c/c$2

/* anonymous class */
	class c._cls2
		implements com.irobot.awsservices.b.b.b
	{

		public void a(com.irobot.awsservices.b.b.a a1)
		{
			if(a1 == com.irobot.awsservices.b.b.a.ConnectionLost)
		//*   0    0:aload_1         
		//*   1    1:getstatic       #27  <Field com.irobot.awsservices.b.b$a com.irobot.awsservices.b.b$a.ConnectionLost>
		//*   2    4:if_acmpne       97
			{
				o.b(c.g(), "WebsocketClient lost connection.");
		//    3    7:invokestatic    #31  <Method String c.g()>
		//    4   10:ldc1            #33  <String "WebsocketClient lost connection.">
		//    5   12:invokestatic    #39  <Method void o.b(String, String)>
				synchronized(com.irobot.home.o.c.c.c(a))
		//*   6   15:aload_0         
		//*   7   16:getfield        #14  <Field com.irobot.home.o.c.c a>
		//*   8   19:invokestatic    #43  <Method Object com.irobot.home.o.c.c.c(com.irobot.home.o.c.c)>
		//*   9   22:astore_2        
		//*  10   23:aload_2         
		//*  11   24:monitorenter    
				{
					if(c.a(a) != null && c.a(a).getNetworkCallback() != null)
		//*  12   25:aload_0         
		//*  13   26:getfield        #14  <Field com.irobot.home.o.c.c a>
		//*  14   29:invokestatic    #46  <Method NetworkSessionCallback c.a(com.irobot.home.o.c.c)>
		//*  15   32:ifnull          87
		//*  16   35:aload_0         
		//*  17   36:getfield        #14  <Field com.irobot.home.o.c.c a>
		//*  18   39:invokestatic    #46  <Method NetworkSessionCallback c.a(com.irobot.home.o.c.c)>
		//*  19   42:invokevirtual   #52  <Method com.irobot.core.NetworkCallback NetworkSessionCallback.getNetworkCallback()>
		//*  20   45:ifnull          87
					{
						Error error = Error.create(0, c.a(a, 0), c.a(((Throwable) (new IOException(c.a(a, 0))))));
		//   21   48:iconst_0        
		//   22   49:aload_0         
		//   23   50:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   24   53:iconst_0        
		//   25   54:invokestatic    #55  <Method String c.a(com.irobot.home.o.c.c, int)>
		//   26   57:new             #57  <Class IOException>
		//   27   60:dup             
		//   28   61:aload_0         
		//   29   62:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   30   65:iconst_0        
		//   31   66:invokestatic    #55  <Method String c.a(com.irobot.home.o.c.c, int)>
		//   32   69:invokespecial   #60  <Method void IOException(String)>
		//   33   72:invokestatic    #65  <Method java.util.HashMap c.a(Throwable)>
		//   34   75:invokestatic    #71  <Method Error Error.create(int, String, java.util.HashMap)>
		//   35   78:astore_3        
						c.a(a, error);
		//   36   79:aload_0         
		//   37   80:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   38   83:aload_3         
		//   39   84:invokestatic    #74  <Method void c.a(com.irobot.home.o.c.c, Error)>
					}
				}
		//   40   87:aload_2         
		//   41   88:monitorexit     
			}
			break MISSING_BLOCK_LABEL_97;
		//   42   89:goto            97
			a1;
		//   43   92:astore_1        
			obj;
		//   44   93:aload_2         
			JVM INSTR monitorexit ;
		//   45   94:monitorexit     
			throw a1;
		//   46   95:aload_1         
		//   47   96:athrow          
			if(a1 == com.irobot.awsservices.b.b.a.Disconnected)
		//*  48   97:aload_1         
		//*  49   98:getstatic       #77  <Field com.irobot.awsservices.b.b$a com.irobot.awsservices.b.b$a.Disconnected>
		//*  50  101:if_acmpne       159
			{
				o.b(c.g(), "WebsocketClient disconnected.");
		//   51  104:invokestatic    #31  <Method String c.g()>
		//   52  107:ldc1            #79  <String "WebsocketClient disconnected.">
		//   53  109:invokestatic    #39  <Method void o.b(String, String)>
				synchronized(com.irobot.home.o.c.c.c(a))
		//*  54  112:aload_0         
		//*  55  113:getfield        #14  <Field com.irobot.home.o.c.c a>
		//*  56  116:invokestatic    #43  <Method Object com.irobot.home.o.c.c.c(com.irobot.home.o.c.c)>
		//*  57  119:astore_2        
		//*  58  120:aload_2         
		//*  59  121:monitorenter    
				{
					if(c.a(a) != null)
		//*  60  122:aload_0         
		//*  61  123:getfield        #14  <Field com.irobot.home.o.c.c a>
		//*  62  126:invokestatic    #46  <Method NetworkSessionCallback c.a(com.irobot.home.o.c.c)>
		//*  63  129:ifnull          142
						c.a(a).disconnected();
		//   64  132:aload_0         
		//   65  133:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   66  136:invokestatic    #46  <Method NetworkSessionCallback c.a(com.irobot.home.o.c.c)>
		//   67  139:invokevirtual   #82  <Method void NetworkSessionCallback.disconnected()>
				}
		//   68  142:aload_2         
		//   69  143:monitorexit     
				a.a();
		//   70  144:aload_0         
		//   71  145:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   72  148:invokevirtual   #84  <Method void c.a()>
			}
			break MISSING_BLOCK_LABEL_159;
		//   73  151:goto            159
			a1;
		//   74  154:astore_1        
			obj1;
		//   75  155:aload_2         
			JVM INSTR monitorexit ;
		//   76  156:monitorexit     
			throw a1;
		//   77  157:aload_1         
		//   78  158:athrow          
			if(a1 != com.irobot.awsservices.b.b.a.Connected) goto _L2; else goto _L1
		//   79  159:aload_1         
		//   80  160:getstatic       #87  <Field com.irobot.awsservices.b.b$a com.irobot.awsservices.b.b$a.Connected>
		//   81  163:if_acmpne       268
_L1:
			ConnectivityStateReceiver.a().a(((com.irobot.home.util.ConnectivityStateReceiver.a) (a)));
		//   82  166:invokestatic    #92  <Method ConnectivityStateReceiver ConnectivityStateReceiver.a()>
		//   83  169:aload_0         
		//   84  170:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   85  173:invokevirtual   #95  <Method boolean ConnectivityStateReceiver.a(com.irobot.home.util.ConnectivityStateReceiver$a)>
		//   86  176:pop             
			Object obj2 = com.irobot.home.o.c.c.c(a);
		//   87  177:aload_0         
		//   88  178:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   89  181:invokestatic    #43  <Method Object com.irobot.home.o.c.c.c(com.irobot.home.o.c.c)>
		//   90  184:astore_2        
			obj2;
		//   91  185:aload_2         
			JVM INSTR monitorenter ;
		//   92  186:monitorenter    
			if(c.a(a) == null) goto _L4; else goto _L3
		//   93  187:aload_0         
		//   94  188:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   95  191:invokestatic    #46  <Method NetworkSessionCallback c.a(com.irobot.home.o.c.c)>
		//   96  194:ifnull          260
_L3:
			c.d(a);
		//   97  197:aload_0         
		//   98  198:getfield        #14  <Field com.irobot.home.o.c.c a>
		//   99  201:invokestatic    #98  <Method void c.d(com.irobot.home.o.c.c)>
			Thread.sleep(1000L);
		//  100  204:ldc2w           #99  <Long 1000L>
		//  101  207:invokestatic    #106 <Method void Thread.sleep(long)>
			a1 = ((com.irobot.awsservices.b.b.a) (c.a(a)));
		//  102  210:aload_0         
		//  103  211:getfield        #14  <Field com.irobot.home.o.c.c a>
		//  104  214:invokestatic    #46  <Method NetworkSessionCallback c.a(com.irobot.home.o.c.c)>
		//  105  217:astore_1        
_L6:
			((NetworkSessionCallback) (a1)).connected();
		//  106  218:aload_1         
		//  107  219:invokevirtual   #109 <Method void NetworkSessionCallback.connected()>
			  goto _L4
		//* 108  222:goto            260
			a1;
		//  109  225:astore_1        
			  goto _L5
		//* 110  226:goto            248
_L7:
			o.d(c.g(), "Delay before connected callback interrupted");
		//  111  229:invokestatic    #31  <Method String c.g()>
		//  112  232:ldc1            #111 <String "Delay before connected callback interrupted">
		//  113  234:invokestatic    #113 <Method void o.d(String, String)>
			a1 = ((com.irobot.awsservices.b.b.a) (c.a(a)));
		//  114  237:aload_0         
		//  115  238:getfield        #14  <Field com.irobot.home.o.c.c a>
		//  116  241:invokestatic    #46  <Method NetworkSessionCallback c.a(com.irobot.home.o.c.c)>
		//  117  244:astore_1        
			  goto _L6
		//* 118  245:goto            218
_L5:
			c.a(a).connected();
		//  119  248:aload_0         
		//  120  249:getfield        #14  <Field com.irobot.home.o.c.c a>
		//  121  252:invokestatic    #46  <Method NetworkSessionCallback c.a(com.irobot.home.o.c.c)>
		//  122  255:invokevirtual   #109 <Method void NetworkSessionCallback.connected()>
			throw a1;
		//  123  258:aload_1         
		//  124  259:athrow          
_L4:
			obj2;
		//  125  260:aload_2         
			JVM INSTR monitorexit ;
		//  126  261:monitorexit     
			return;
		//  127  262:return          
			a1;
		//  128  263:astore_1        
			obj2;
		//  129  264:aload_2         
			JVM INSTR monitorexit ;
		//  130  265:monitorexit     
			throw a1;
		//  131  266:aload_1         
		//  132  267:athrow          
_L2:
			return;
		//  133  268:return          
			a1;
		//  134  269:astore_1        
			  goto _L7
		//* 135  270:goto            229
		}

		final com.irobot.home.o.c.c a;

			
			{
				a = c1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field com.irobot.home.o.c.c a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}

}
