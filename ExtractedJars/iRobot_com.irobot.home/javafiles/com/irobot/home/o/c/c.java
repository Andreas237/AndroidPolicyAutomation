// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.irobot.awsservices.b.a;
import com.irobot.core.AssetId;
import com.irobot.core.AssetIdNetworkSessionAttribute;
import com.irobot.core.CallbackNetworkSessionAttribute;
import com.irobot.core.Error;
import com.irobot.core.NetworkAddress;
import com.irobot.core.NetworkAddressNetworkSessionAttribute;
import com.irobot.core.NetworkCallback;
import com.irobot.core.NetworkJsonCallback;
import com.irobot.core.NetworkResponse;
import com.irobot.core.NetworkSessionAttributeKey;
import com.irobot.core.NetworkSessionCallback;
import com.irobot.core.SubscriptionTopicListNetworkSessionAttribute;
import com.irobot.home.aws.authentication.AwsCredentialsService;
import com.irobot.home.util.ConnectivityStateReceiver;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttException;

// Referenced classes of package com.irobot.home.o.c:
//			s, c

public class c
	implements s, com.irobot.home.util.ConnectivityStateReceiver.a
{

	public c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		b = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void Object()>
	//    6   12:putfield        #48  <Field Object b>
	//    7   15:aload_0         
	//    8   16:new             #4   <Class Object>
	//    9   19:dup             
	//   10   20:invokespecial   #46  <Method void Object()>
	//   11   23:putfield        #50  <Field Object c>
	//   12   26:aload_0         
	//   13   27:invokestatic    #55  <Method AwsCredentialsService AwsCredentialsService.f()>
	//   14   30:putfield        #57  <Field AwsCredentialsService h>
	//   15   33:aload_0         
	//   16   34:invokestatic    #62  <Method a a.a()>
	//   17   37:putfield        #64  <Field a i>
		k = ((List) (new ArrayList()));
	//   18   40:aload_0         
	//   19   41:new             #66  <Class ArrayList>
	//   20   44:dup             
	//   21   45:invokespecial   #67  <Method void ArrayList()>
	//   22   48:putfield        #69  <Field List k>
		l = ((IMqttMessageListener) (new a(this) {

			public void a()
			{
				if((System.currentTimeMillis() - d) / 1000L > 1L)
			//*   0    0:invokestatic    #37  <Method long System.currentTimeMillis()>
			//*   1    3:aload_0         
			//*   2    4:getfield        #29  <Field long d>
			//*   3    7:lsub            
			//*   4    8:ldc2w           #38  <Long 1000L>
			//*   5   11:ldiv            
			//*   6   12:lconst_1        
			//*   7   13:lcmp            
			//*   8   14:ifle            22
					c = 0;
			//    9   17:aload_0         
			//   10   18:iconst_0        
			//   11   19:putfield        #27  <Field int c>
				d = System.currentTimeMillis();
			//   12   22:aload_0         
			//   13   23:invokestatic    #37  <Method long System.currentTimeMillis()>
			//   14   26:putfield        #29  <Field long d>
				c = c + 1;
			//   15   29:aload_0         
			//   16   30:aload_0         
			//   17   31:getfield        #27  <Field int c>
			//   18   34:iconst_1        
			//   19   35:iadd            
			//   20   36:putfield        #27  <Field int c>
				if(c == 2)
			//*  21   39:aload_0         
			//*  22   40:getfield        #27  <Field int c>
			//*  23   43:iconst_2        
			//*  24   44:icmpne          55
				{
					com.irobot.home.util.c.a(a);
			//   25   47:aload_0         
			//   26   48:getfield        #20  <Field View a>
			//   27   51:invokestatic    #42  <Method void com.irobot.home.util.c.a(View)>
					return;
			//   28   54:return          
				}
				if(c >= 3)
			//*  29   55:aload_0         
			//*  30   56:getfield        #27  <Field int c>
			//*  31   59:iconst_3        
			//*  32   60:icmplt          75
				{
					com.irobot.home.util.c.b(b);
			//   33   63:aload_0         
			//   34   64:getfield        #22  <Field Activity b>
			//   35   67:invokestatic    #45  <Method void c.b(Activity)>
					c = 0;
			//   36   70:aload_0         
			//   37   71:iconst_0        
			//   38   72:putfield        #27  <Field int c>
				}
			//   39   75:return          
			}

			final View a;
			final Activity b;
			private int c;
			private long d;

			
			{
				a = view;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #20  <Field View a>
				b = activity;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field Activity b>
				super(context);
			//    6   10:aload_0         
			//    7   11:aload_1         
			//    8   12:invokespecial   #25  <Method void c$a(Context)>
				c = 0;
			//    9   15:aload_0         
			//   10   16:iconst_0        
			//   11   17:putfield        #27  <Field int c>
				d = 0L;
			//   12   20:aload_0         
			//   13   21:lconst_0        
			//   14   22:putfield        #29  <Field long d>
			//   15   25:return          
			}
		}
));
	//   23   51:aload_0         
	//   24   52:new             #10  <Class c$1>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:invokespecial   #72  <Method void c$1(c)>
	//   28   60:putfield        #74  <Field IMqttMessageListener l>
		m = new com.irobot.awsservices.b.b.b() {

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
					synchronized(c.c(a))
			//*   6   15:aload_0         
			//*   7   16:getfield        #14  <Field c a>
			//*   8   19:invokestatic    #43  <Method Object c.c(c)>
			//*   9   22:astore_2        
			//*  10   23:aload_2         
			//*  11   24:monitorenter    
					{
						if(com.irobot.home.o.c.c.a(a) != null && com.irobot.home.o.c.c.a(a).getNetworkCallback() != null)
			//*  12   25:aload_0         
			//*  13   26:getfield        #14  <Field c a>
			//*  14   29:invokestatic    #46  <Method NetworkSessionCallback com.irobot.home.o.c.c.a(c)>
			//*  15   32:ifnull          87
			//*  16   35:aload_0         
			//*  17   36:getfield        #14  <Field c a>
			//*  18   39:invokestatic    #46  <Method NetworkSessionCallback com.irobot.home.o.c.c.a(c)>
			//*  19   42:invokevirtual   #52  <Method NetworkCallback NetworkSessionCallback.getNetworkCallback()>
			//*  20   45:ifnull          87
						{
							Error error = Error.create(0, com.irobot.home.o.c.c.a(a, 0), com.irobot.home.core.c.a(((Throwable) (new IOException(com.irobot.home.o.c.c.a(a, 0))))));
			//   21   48:iconst_0        
			//   22   49:aload_0         
			//   23   50:getfield        #14  <Field c a>
			//   24   53:iconst_0        
			//   25   54:invokestatic    #55  <Method String com.irobot.home.o.c.c.a(c, int)>
			//   26   57:new             #57  <Class IOException>
			//   27   60:dup             
			//   28   61:aload_0         
			//   29   62:getfield        #14  <Field c a>
			//   30   65:iconst_0        
			//   31   66:invokestatic    #55  <Method String com.irobot.home.o.c.c.a(c, int)>
			//   32   69:invokespecial   #60  <Method void IOException(String)>
			//   33   72:invokestatic    #65  <Method HashMap com.irobot.home.core.c.a(Throwable)>
			//   34   75:invokestatic    #71  <Method Error Error.create(int, String, HashMap)>
			//   35   78:astore_3        
							com.irobot.home.o.c.c.a(a, error);
			//   36   79:aload_0         
			//   37   80:getfield        #14  <Field c a>
			//   38   83:aload_3         
			//   39   84:invokestatic    #74  <Method void com.irobot.home.o.c.c.a(c, Error)>
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
					synchronized(c.c(a))
			//*  54  112:aload_0         
			//*  55  113:getfield        #14  <Field c a>
			//*  56  116:invokestatic    #43  <Method Object c.c(c)>
			//*  57  119:astore_2        
			//*  58  120:aload_2         
			//*  59  121:monitorenter    
					{
						if(com.irobot.home.o.c.c.a(a) != null)
			//*  60  122:aload_0         
			//*  61  123:getfield        #14  <Field c a>
			//*  62  126:invokestatic    #46  <Method NetworkSessionCallback com.irobot.home.o.c.c.a(c)>
			//*  63  129:ifnull          142
							com.irobot.home.o.c.c.a(a).disconnected();
			//   64  132:aload_0         
			//   65  133:getfield        #14  <Field c a>
			//   66  136:invokestatic    #46  <Method NetworkSessionCallback com.irobot.home.o.c.c.a(c)>
			//   67  139:invokevirtual   #82  <Method void NetworkSessionCallback.disconnected()>
					}
			//   68  142:aload_2         
			//   69  143:monitorexit     
					a.a();
			//   70  144:aload_0         
			//   71  145:getfield        #14  <Field c a>
			//   72  148:invokevirtual   #84  <Method void com.irobot.home.o.c.c.a()>
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
			//   84  170:getfield        #14  <Field c a>
			//   85  173:invokevirtual   #95  <Method boolean ConnectivityStateReceiver.a(com.irobot.home.util.ConnectivityStateReceiver$a)>
			//   86  176:pop             
				Object obj2 = c.c(a);
			//   87  177:aload_0         
			//   88  178:getfield        #14  <Field c a>
			//   89  181:invokestatic    #43  <Method Object c.c(c)>
			//   90  184:astore_2        
				obj2;
			//   91  185:aload_2         
				JVM INSTR monitorenter ;
			//   92  186:monitorenter    
				if(com.irobot.home.o.c.c.a(a) == null) goto _L4; else goto _L3
			//   93  187:aload_0         
			//   94  188:getfield        #14  <Field c a>
			//   95  191:invokestatic    #46  <Method NetworkSessionCallback com.irobot.home.o.c.c.a(c)>
			//   96  194:ifnull          260
_L3:
				c.d(a);
			//   97  197:aload_0         
			//   98  198:getfield        #14  <Field c a>
			//   99  201:invokestatic    #98  <Method void c.d(c)>
				Thread.sleep(1000L);
			//  100  204:ldc2w           #99  <Long 1000L>
			//  101  207:invokestatic    #106 <Method void Thread.sleep(long)>
				a1 = ((com.irobot.awsservices.b.b.a) (com.irobot.home.o.c.c.a(a)));
			//  102  210:aload_0         
			//  103  211:getfield        #14  <Field c a>
			//  104  214:invokestatic    #46  <Method NetworkSessionCallback com.irobot.home.o.c.c.a(c)>
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
				a1 = ((com.irobot.awsservices.b.b.a) (com.irobot.home.o.c.c.a(a)));
			//  114  237:aload_0         
			//  115  238:getfield        #14  <Field c a>
			//  116  241:invokestatic    #46  <Method NetworkSessionCallback com.irobot.home.o.c.c.a(c)>
			//  117  244:astore_1        
				  goto _L6
			//* 118  245:goto            218
_L5:
				com.irobot.home.o.c.c.a(a).connected();
			//  119  248:aload_0         
			//  120  249:getfield        #14  <Field c a>
			//  121  252:invokestatic    #46  <Method NetworkSessionCallback com.irobot.home.o.c.c.a(c)>
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

			final c a;

			
			{
				a = c.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field c a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   29   63:aload_0         
	//   30   64:new             #12  <Class c$2>
	//   31   67:dup             
	//   32   68:aload_0         
	//   33   69:invokespecial   #75  <Method void c$2(c)>
	//   34   72:putfield        #77  <Field com.irobot.awsservices.b.b$b m>
	//   35   75:return          
	}

	static NetworkSessionCallback a(c c1)
	{
		return c1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field NetworkSessionCallback j>
	//    2    4:areturn         
	}

	private String a(int i1)
	{
		String s1 = "";
	//    0    0:ldc1            #83  <String "">
	//    1    2:astore_2        
		if(i1 == 0)
	//*   2    3:iload_1         
	//*   3    4:ifne            10
			s1 = "Network Disconnected";
	//    4    7:ldc1            #85  <String "Network Disconnected">
	//    5    9:astore_2        
		return s1;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	static String a(c c1, int i1)
	{
		return c1.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #88  <Method String a(int)>
	//    3    5:areturn         
	}

	private void a(Error error)
	{
		if(j != null && j.getNetworkCallback() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field NetworkSessionCallback j>
	//*   2    4:ifnull          32
	//*   3    7:aload_0         
	//*   4    8:getfield        #80  <Field NetworkSessionCallback j>
	//*   5   11:invokevirtual   #95  <Method NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//*   6   14:ifnull          32
			j.getNetworkCallback().onFailure(j(), error);
	//    7   17:aload_0         
	//    8   18:getfield        #80  <Field NetworkSessionCallback j>
	//    9   21:invokevirtual   #95  <Method NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//   10   24:aload_0         
	//   11   25:invokespecial   #98  <Method NetworkResponse j()>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #104 <Method void NetworkCallback.onFailure(NetworkResponse, Error)>
		a();
	//   14   32:aload_0         
	//   15   33:invokevirtual   #106 <Method void a()>
	//   16   36:return          
	}

	static void a(c c1, Error error)
	{
		c1.a(error);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #109 <Method void a(Error)>
	//    3    5:return          
	}

	static NetworkResponse b(c c1)
	{
		return c1.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method NetworkResponse j()>
	//    2    4:areturn         
	}

	private boolean b(HashMap hashmap)
	{
		f = ((NetworkAddressNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.NetworkAddress)))).address();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #117 <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.NetworkAddress>
	//    3    5:invokevirtual   #123 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #125 <Class NetworkAddressNetworkSessionAttribute>
	//    5   11:invokevirtual   #129 <Method NetworkAddress NetworkAddressNetworkSessionAttribute.address()>
	//    6   14:putfield        #131 <Field NetworkAddress f>
		d = ((AssetIdNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.AssetId)))).assetId();
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:getstatic       #134 <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.AssetId>
	//   10   22:invokevirtual   #123 <Method Object HashMap.get(Object)>
	//   11   25:checkcast       #136 <Class AssetIdNetworkSessionAttribute>
	//   12   28:invokevirtual   #140 <Method AssetId AssetIdNetworkSessionAttribute.assetId()>
	//   13   31:putfield        #142 <Field AssetId d>
		j = ((CallbackNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.Callback)))).callback();
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:getstatic       #145 <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.Callback>
	//   17   39:invokevirtual   #123 <Method Object HashMap.get(Object)>
	//   18   42:checkcast       #147 <Class CallbackNetworkSessionAttribute>
	//   19   45:invokevirtual   #151 <Method NetworkSessionCallback CallbackNetworkSessionAttribute.callback()>
	//   20   48:putfield        #80  <Field NetworkSessionCallback j>
		junit.b.a.a("Https Network Session requires a network address.", ((Object) (f)));
	//   21   51:ldc1            #153 <String "Https Network Session requires a network address.">
	//   22   53:aload_0         
	//   23   54:getfield        #131 <Field NetworkAddress f>
	//   24   57:invokestatic    #158 <Method void junit.b.a.a(String, Object)>
		junit.b.a.a("IoT Network Session requires a calback.", ((Object) (j)));
	//   25   60:ldc1            #160 <String "IoT Network Session requires a calback.">
	//   26   62:aload_0         
	//   27   63:getfield        #80  <Field NetworkSessionCallback j>
	//   28   66:invokestatic    #158 <Method void junit.b.a.a(String, Object)>
		hashmap = ((HashMap) (d));
	//   29   69:aload_0         
	//   30   70:getfield        #142 <Field AssetId d>
	//   31   73:astore_1        
		boolean flag1 = false;
	//   32   74:iconst_0        
	//   33   75:istore_3        
		boolean flag;
		if(hashmap != null && com.irobot.home.util.j.i(d.getId()))
	//*  34   76:aload_1         
	//*  35   77:ifnull          98
	//*  36   80:aload_0         
	//*  37   81:getfield        #142 <Field AssetId d>
	//*  38   84:invokevirtual   #166 <Method String AssetId.getId()>
	//*  39   87:invokestatic    #171 <Method boolean j.i(String)>
	//*  40   90:ifeq            98
			flag = true;
	//   41   93:iconst_1        
	//   42   94:istore_2        
		else
	//*  43   95:goto            100
			flag = false;
	//   44   98:iconst_0        
	//   45   99:istore_2        
		junit.b.a.a("Https Network Session requires a valid asset", flag);
	//   46  100:ldc1            #173 <String "Https Network Session requires a valid asset">
	//   47  102:iload_2         
	//   48  103:invokestatic    #176 <Method void junit.b.a.a(String, boolean)>
		flag = flag1;
	//   49  106:iload_3         
	//   50  107:istore_2        
		if(f != null)
	//*  51  108:aload_0         
	//*  52  109:getfield        #131 <Field NetworkAddress f>
	//*  53  112:ifnull          165
		{
			flag = flag1;
	//   54  115:iload_3         
	//   55  116:istore_2        
			if(j != null)
	//*  56  117:aload_0         
	//*  57  118:getfield        #80  <Field NetworkSessionCallback j>
	//*  58  121:ifnull          165
			{
				flag = flag1;
	//   59  124:iload_3         
	//   60  125:istore_2        
				if(d != null)
	//*  61  126:aload_0         
	//*  62  127:getfield        #142 <Field AssetId d>
	//*  63  130:ifnull          165
				{
					flag = flag1;
	//   64  133:iload_3         
	//   65  134:istore_2        
					if(com.irobot.home.util.j.i(d.getId()))
	//*  66  135:aload_0         
	//*  67  136:getfield        #142 <Field AssetId d>
	//*  68  139:invokevirtual   #166 <Method String AssetId.getId()>
	//*  69  142:invokestatic    #171 <Method boolean j.i(String)>
	//*  70  145:ifeq            165
					{
						flag = flag1;
	//   71  148:iload_3         
	//   72  149:istore_2        
						if(!TextUtils.isEmpty(((CharSequence) (f.host()))))
	//*  73  150:aload_0         
	//*  74  151:getfield        #131 <Field NetworkAddress f>
	//*  75  154:invokevirtual   #181 <Method String NetworkAddress.host()>
	//*  76  157:invokestatic    #187 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  77  160:ifne            165
							flag = true;
	//   78  163:iconst_1        
	//   79  164:istore_2        
					}
				}
			}
		}
		return flag;
	//   80  165:iload_2         
	//   81  166:ireturn         
	}

	static Object c(c c1)
	{
		return c1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Object b>
	//    2    4:areturn         
	}

	static void d(c c1)
	{
		c1.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method void h()>
	//    2    4:return          
	}

	static String g()
	{
		return a;
	//    0    0:getstatic       #194 <Field String a>
	//    1    3:areturn         
	}

	private void h()
	{
		if(!i())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #199 <Method boolean i()>
	//*   2    4:ifne            16
		{
			o.e(a, "Cannot subscribe, connection not configured or not connected.");
	//    3    7:getstatic       #194 <Field String a>
	//    4   10:ldc1            #201 <String "Cannot subscribe, connection not configured or not connected.">
	//    5   12:invokestatic    #206 <Method void o.e(String, String)>
			return;
	//    6   15:return          
		}
		for(Iterator iterator = k.iterator(); iterator.hasNext();)
	//*   7   16:aload_0         
	//*   8   17:getfield        #69  <Field List k>
	//*   9   20:invokeinterface #212 <Method Iterator List.iterator()>
	//*  10   25:astore_1        
	//*  11   26:aload_1         
	//*  12   27:invokeinterface #217 <Method boolean Iterator.hasNext()>
	//*  13   32:ifeq            139
		{
			String s1 = (String)iterator.next();
	//   14   35:aload_1         
	//   15   36:invokeinterface #221 <Method Object Iterator.next()>
	//   16   41:checkcast       #223 <Class String>
	//   17   44:astore_2        
			try
			{
				i.a(e, s1, 1, l);
	//   18   45:aload_0         
	//   19   46:getfield        #64  <Field a i>
	//   20   49:aload_0         
	//   21   50:getfield        #225 <Field String e>
	//   22   53:aload_2         
	//   23   54:iconst_1        
	//   24   55:aload_0         
	//   25   56:getfield        #74  <Field IMqttMessageListener l>
	//   26   59:invokevirtual   #228 <Method void a.a(String, String, int, IMqttMessageListener)>
				g = true;
	//   27   62:aload_0         
	//   28   63:iconst_1        
	//   29   64:putfield        #230 <Field boolean g>
			}
	//*  30   67:goto            26
			catch(MqttException mqttexception)
	//*  31   70:astore_3        
			{
				if(j != null && j.getNetworkCallback() != null)
	//*  32   71:aload_0         
	//*  33   72:getfield        #80  <Field NetworkSessionCallback j>
	//*  34   75:ifnull          132
	//*  35   78:aload_0         
	//*  36   79:getfield        #80  <Field NetworkSessionCallback j>
	//*  37   82:invokevirtual   #95  <Method NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//*  38   85:ifnull          132
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   39   88:new             #232 <Class StringBuilder>
	//   40   91:dup             
	//   41   92:invokespecial   #233 <Method void StringBuilder()>
	//   42   95:astore          4
					stringbuilder.append("Error subscribing to ");
	//   43   97:aload           4
	//   44   99:ldc1            #235 <String "Error subscribing to ">
	//   45  101:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   46  104:pop             
					stringbuilder.append(s1);
	//   47  105:aload           4
	//   48  107:aload_2         
	//   49  108:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   50  111:pop             
					a(Error.create(0, stringbuilder.toString(), com.irobot.home.core.c.a(((Throwable) (mqttexception)))));
	//   51  112:aload_0         
	//   52  113:iconst_0        
	//   53  114:aload           4
	//   54  116:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   55  119:aload_3         
	//   56  120:invokestatic    #247 <Method HashMap com.irobot.home.core.c.a(Throwable)>
	//   57  123:invokestatic    #253 <Method Error Error.create(int, String, HashMap)>
	//   58  126:invokespecial   #109 <Method void a(Error)>
				} else
	//*  59  129:goto            26
				{
					mqttexception.printStackTrace();
	//   60  132:aload_3         
	//   61  133:invokevirtual   #256 <Method void MqttException.printStackTrace()>
				}
			}
		}

	//*  62  136:goto            26
	//   63  139:return          
	}

	private boolean i()
	{
		return i.a(e);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field a i>
	//    2    4:aload_0         
	//    3    5:getfield        #225 <Field String e>
	//    4    8:invokevirtual   #258 <Method boolean a.a(String)>
	//    5   11:ireturn         
	}

	private NetworkResponse j()
	{
		return NetworkResponse.create(d, f, "N/A", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field AssetId d>
	//    2    4:aload_0         
	//    3    5:getfield        #131 <Field NetworkAddress f>
	//    4    8:ldc2            #260 <String "N/A">
	//    5   11:iconst_0        
	//    6   12:invokestatic    #265 <Method NetworkResponse NetworkResponse.create(AssetId, NetworkAddress, String, int)>
	//    7   15:areturn         
	}

	public void a()
	{
		ConnectivityStateReceiver.a().b(((com.irobot.home.util.ConnectivityStateReceiver.a) (this)));
	//    0    0:invokestatic    #270 <Method ConnectivityStateReceiver ConnectivityStateReceiver.a()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #273 <Method boolean ConnectivityStateReceiver.b(com.irobot.home.util.ConnectivityStateReceiver$a)>
	//    3    7:pop             
		synchronized(b)
	//*   4    8:aload_0         
	//*   5    9:getfield        #48  <Field Object b>
	//*   6   12:astore_1        
	//*   7   13:aload_1         
	//*   8   14:monitorenter    
		{
			if(j != null && f())
	//*   9   15:aload_0         
	//*  10   16:getfield        #80  <Field NetworkSessionCallback j>
	//*  11   19:ifnull          36
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #275 <Method boolean f()>
	//*  14   26:ifeq            36
				j.disconnected();
	//   15   29:aload_0         
	//   16   30:getfield        #80  <Field NetworkSessionCallback j>
	//   17   33:invokevirtual   #278 <Method void NetworkSessionCallback.disconnected()>
		}
	//   18   36:aload_1         
	//   19   37:monitorexit     
		j = null;
	//   20   38:aload_0         
	//   21   39:aconst_null     
	//   22   40:putfield        #80  <Field NetworkSessionCallback j>
		d = null;
	//   23   43:aload_0         
	//   24   44:aconst_null     
	//   25   45:putfield        #142 <Field AssetId d>
		f = null;
	//   26   48:aload_0         
	//   27   49:aconst_null     
	//   28   50:putfield        #131 <Field NetworkAddress f>
		e = null;
	//   29   53:aload_0         
	//   30   54:aconst_null     
	//   31   55:putfield        #225 <Field String e>
		g = false;
	//   32   58:aload_0         
	//   33   59:iconst_0        
	//   34   60:putfield        #230 <Field boolean g>
		return;
	//   35   63:return          
		exception;
	//   36   64:astore_2        
		obj;
	//   37   65:aload_1         
		JVM INSTR monitorexit ;
	//   38   66:monitorexit     
		throw exception;
	//   39   67:aload_2         
	//   40   68:athrow          
	}

	public void a(String s1, byte abyte0[], double d1, NetworkJsonCallback networkjsoncallback)
	{
		if(!i())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #199 <Method boolean i()>
	//*   2    4:ifne            41
		{
			o.e(a, "Cannot publish, broker connection not configured or not connected.");
	//    3    7:getstatic       #194 <Field String a>
	//    4   10:ldc2            #283 <String "Cannot publish, broker connection not configured or not connected.">
	//    5   13:invokestatic    #206 <Method void o.e(String, String)>
			a(Error.create(0, "Cannot publish, broker connection not configured or not connected.", com.irobot.home.core.c.a(((Throwable) (new Exception("Cannot publish, broker connection not configured or not connected."))))));
	//    6   16:aload_0         
	//    7   17:iconst_0        
	//    8   18:ldc2            #283 <String "Cannot publish, broker connection not configured or not connected.">
	//    9   21:new             #281 <Class Exception>
	//   10   24:dup             
	//   11   25:ldc2            #283 <String "Cannot publish, broker connection not configured or not connected.">
	//   12   28:invokespecial   #286 <Method void Exception(String)>
	//   13   31:invokestatic    #247 <Method HashMap com.irobot.home.core.c.a(Throwable)>
	//   14   34:invokestatic    #253 <Method Error Error.create(int, String, HashMap)>
	//   15   37:invokespecial   #109 <Method void a(Error)>
			return;
	//   16   40:return          
		}
		try
		{
			abyte0 = ((byte []) (new String(abyte0, "UTF-8")));
	//   17   41:new             #223 <Class String>
	//   18   44:dup             
	//   19   45:aload_2         
	//   20   46:ldc2            #288 <String "UTF-8">
	//   21   49:invokespecial   #291 <Method void String(byte[], String)>
	//   22   52:astore_2        
			IMqttActionListener imqttactionlistener = new IMqttActionListener(((String) (abyte0)), s1, networkjsoncallback) {

				public void onFailure(IMqttToken imqtttoken, Throwable throwable)
				{
					if(c != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #27  <Field NetworkJsonCallback c>
				//*   2    4:ifnull          82
					{
						o.b(c.g(), String.format("Failed to publish %s to topic %s", new Object[] {
							a, b
						}));
				//    3    7:invokestatic    #37  <Method String c.g()>
				//    4   10:ldc1            #39  <String "Failed to publish %s to topic %s">
				//    5   12:iconst_2        
				//    6   13:anewarray       Object[]
				//    7   16:dup             
				//    8   17:iconst_0        
				//    9   18:aload_0         
				//   10   19:getfield        #23  <Field String a>
				//   11   22:aastore         
				//   12   23:dup             
				//   13   24:iconst_1        
				//   14   25:aload_0         
				//   15   26:getfield        #25  <Field String b>
				//   16   29:aastore         
				//   17   30:invokestatic    #45  <Method String String.format(String, Object[])>
				//   18   33:invokestatic    #50  <Method void o.b(String, String)>
						imqtttoken = ((IMqttToken) (new StringBuilder()));
				//   19   36:new             #52  <Class StringBuilder>
				//   20   39:dup             
				//   21   40:invokespecial   #53  <Method void StringBuilder()>
				//   22   43:astore_1        
						((StringBuilder) (imqtttoken)).append("Error publishing to ");
				//   23   44:aload_1         
				//   24   45:ldc1            #55  <String "Error publishing to ">
				//   25   47:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
				//   26   50:pop             
						((StringBuilder) (imqtttoken)).append(b);
				//   27   51:aload_1         
				//   28   52:aload_0         
				//   29   53:getfield        #25  <Field String b>
				//   30   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
				//   31   59:pop             
						imqtttoken = ((IMqttToken) (Error.create(0, ((StringBuilder) (imqtttoken)).toString(), com.irobot.home.core.c.a(throwable))));
				//   32   60:iconst_0        
				//   33   61:aload_1         
				//   34   62:invokevirtual   #62  <Method String StringBuilder.toString()>
				//   35   65:aload_2         
				//   36   66:invokestatic    #67  <Method HashMap com.irobot.home.core.c.a(Throwable)>
				//   37   69:invokestatic    #73  <Method Error Error.create(int, String, HashMap)>
				//   38   72:astore_1        
						com.irobot.home.o.c.c.a(d, ((Error) (imqtttoken)));
				//   39   73:aload_0         
				//   40   74:getfield        #21  <Field c d>
				//   41   77:aload_1         
				//   42   78:invokestatic    #76  <Method void com.irobot.home.o.c.c.a(c, Error)>
						return;
				//   43   81:return          
					} else
					{
						throwable.printStackTrace();
				//   44   82:aload_2         
				//   45   83:invokevirtual   #81  <Method void Throwable.printStackTrace()>
						return;
				//   46   86:return          
					}
				}

				public void onSuccess(IMqttToken imqtttoken)
				{
					o.b(c.g(), String.format("Successfully published %s to topic %s", new Object[] {
						a, b
					}));
				//    0    0:invokestatic    #37  <Method String c.g()>
				//    1    3:ldc1            #85  <String "Successfully published %s to topic %s">
				//    2    5:iconst_2        
				//    3    6:anewarray       Object[]
				//    4    9:dup             
				//    5   10:iconst_0        
				//    6   11:aload_0         
				//    7   12:getfield        #23  <Field String a>
				//    8   15:aastore         
				//    9   16:dup             
				//   10   17:iconst_1        
				//   11   18:aload_0         
				//   12   19:getfield        #25  <Field String b>
				//   13   22:aastore         
				//   14   23:invokestatic    #45  <Method String String.format(String, Object[])>
				//   15   26:invokestatic    #50  <Method void o.b(String, String)>
					if(c != null)
				//*  16   29:aload_0         
				//*  17   30:getfield        #27  <Field NetworkJsonCallback c>
				//*  18   33:ifnull          54
						c.onSuccess(c.b(d), a);
				//   19   36:aload_0         
				//   20   37:getfield        #27  <Field NetworkJsonCallback c>
				//   21   40:aload_0         
				//   22   41:getfield        #21  <Field c d>
				//   23   44:invokestatic    #88  <Method NetworkResponse c.b(c)>
				//   24   47:aload_0         
				//   25   48:getfield        #23  <Field String a>
				//   26   51:invokevirtual   #93  <Method void NetworkJsonCallback.onSuccess(NetworkResponse, String)>
				//   27   54:return          
				}

				final String a;
				final String b;
				final NetworkJsonCallback c;
				final c d;

			
			{
				d = c.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field c d>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String a>
				b = s2;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String b>
				c = networkjsoncallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #27  <Field NetworkJsonCallback c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #30  <Method void Object()>
			//   14   25:return          
			}
			}
;
	//   23   53:new             #14  <Class c$3>
	//   24   56:dup             
	//   25   57:aload_0         
	//   26   58:aload_2         
	//   27   59:aload_1         
	//   28   60:aload           5
	//   29   62:invokespecial   #294 <Method void c$3(c, String, String, NetworkJsonCallback)>
	//   30   65:astore          6
			o.b(a, String.format("publishToTopic %s, content %s", new Object[] {
				s1, abyte0
			}));
	//   31   67:getstatic       #194 <Field String a>
	//   32   70:ldc2            #296 <String "publishToTopic %s, content %s">
	//   33   73:iconst_2        
	//   34   74:anewarray       Object[]
	//   35   77:dup             
	//   36   78:iconst_0        
	//   37   79:aload_1         
	//   38   80:aastore         
	//   39   81:dup             
	//   40   82:iconst_1        
	//   41   83:aload_2         
	//   42   84:aastore         
	//   43   85:invokestatic    #300 <Method String String.format(String, Object[])>
	//   44   88:invokestatic    #302 <Method void o.b(String, String)>
			i.a(e, s1, ((String) (abyte0)), 1, imqttactionlistener);
	//   45   91:aload_0         
	//   46   92:getfield        #64  <Field a i>
	//   47   95:aload_0         
	//   48   96:getfield        #225 <Field String e>
	//   49   99:aload_1         
	//   50  100:aload_2         
	//   51  101:iconst_1        
	//   52  102:aload           6
	//   53  104:invokevirtual   #305 <Method void a.a(String, String, String, int, IMqttActionListener)>
			return;
	//   54  107:return          
		}
	//*  55  108:astore_1        
	//*  56  109:aload_1         
	//*  57  110:invokevirtual   #306 <Method void Exception.printStackTrace()>
	//*  58  113:return          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//   59  114:astore_2        
		// Misplaced declaration of an exception variable
		catch(String s1)
		{
			((Exception) (s1)).printStackTrace();
			return;
		}
		if(networkjsoncallback != null)
	//*  60  115:aload           5
	//*  61  117:ifnull          163
		{
			networkjsoncallback = ((NetworkJsonCallback) (new StringBuilder()));
	//   62  120:new             #232 <Class StringBuilder>
	//   63  123:dup             
	//   64  124:invokespecial   #233 <Method void StringBuilder()>
	//   65  127:astore          5
			((StringBuilder) (networkjsoncallback)).append("Error publishing to ");
	//   66  129:aload           5
	//   67  131:ldc2            #308 <String "Error publishing to ">
	//   68  134:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   69  137:pop             
			((StringBuilder) (networkjsoncallback)).append(s1);
	//   70  138:aload           5
	//   71  140:aload_1         
	//   72  141:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   73  144:pop             
			a(Error.create(0, ((StringBuilder) (networkjsoncallback)).toString(), com.irobot.home.core.c.a(((Throwable) (abyte0)))));
	//   74  145:aload_0         
	//   75  146:iconst_0        
	//   76  147:aload           5
	//   77  149:invokevirtual   #242 <Method String StringBuilder.toString()>
	//   78  152:aload_2         
	//   79  153:invokestatic    #247 <Method HashMap com.irobot.home.core.c.a(Throwable)>
	//   80  156:invokestatic    #253 <Method Error Error.create(int, String, HashMap)>
	//   81  159:invokespecial   #109 <Method void a(Error)>
			return;
	//   82  162:return          
		} else
		{
			((MqttException) (abyte0)).printStackTrace();
	//   83  163:aload_2         
	//   84  164:invokevirtual   #256 <Method void MqttException.printStackTrace()>
			return;
	//   85  167:return          
		}
	}

	public void a(HashMap hashmap)
	{
		com.irobot.awsservices.a.a a1;
		if(!b(hashmap))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #313 <Method boolean b(HashMap)>
	//*   3    5:ifne            17
			o.b(a, "Invalid attributes for the session");
	//    4    8:getstatic       #194 <Field String a>
	//    5   11:ldc2            #315 <String "Invalid attributes for the session">
	//    6   14:invokestatic    #302 <Method void o.b(String, String)>
		e = f.host();
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:getfield        #131 <Field NetworkAddress f>
	//   10   22:invokevirtual   #181 <Method String NetworkAddress.host()>
	//   11   25:putfield        #225 <Field String e>
		if(hashmap.get(((Object) (NetworkSessionAttributeKey.ListOfSubscriptionTopics))) instanceof SubscriptionTopicListNetworkSessionAttribute)
	//*  12   28:aload_1         
	//*  13   29:getstatic       #318 <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.ListOfSubscriptionTopics>
	//*  14   32:invokevirtual   #123 <Method Object HashMap.get(Object)>
	//*  15   35:instanceof      #320 <Class SubscriptionTopicListNetworkSessionAttribute>
	//*  16   38:ifeq            58
			k = ((List) (((SubscriptionTopicListNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.ListOfSubscriptionTopics)))).getSubscriptionList()));
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:getstatic       #318 <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.ListOfSubscriptionTopics>
	//   20   46:invokevirtual   #123 <Method Object HashMap.get(Object)>
	//   21   49:checkcast       #320 <Class SubscriptionTopicListNetworkSessionAttribute>
	//   22   52:invokevirtual   #324 <Method ArrayList SubscriptionTopicListNetworkSessionAttribute.getSubscriptionList()>
	//   23   55:putfield        #69  <Field List k>
		hashmap = null;
	//   24   58:aconst_null     
	//   25   59:astore_1        
		a1 = new com.irobot.awsservices.a.a(com.irobot.awsservices.a.a.a.Asset, ((Object) (d.getId())));
	//   26   60:new             #326 <Class com.irobot.awsservices.a.a>
	//   27   63:dup             
	//   28   64:getstatic       #332 <Field com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a$a.Asset>
	//   29   67:aload_0         
	//   30   68:getfield        #142 <Field AssetId d>
	//   31   71:invokevirtual   #166 <Method String AssetId.getId()>
	//   32   74:invokespecial   #335 <Method void com.irobot.awsservices.a.a(com.irobot.awsservices.a.a$a, Object)>
	//   33   77:astore_3        
		boolean flag = i();
	//   34   78:aload_0         
	//   35   79:invokespecial   #199 <Method boolean i()>
	//   36   82:istore_2        
		if(!flag) goto _L2; else goto _L1
	//   37   83:iload_2         
	//   38   84:ifeq            120
_L1:
		h.a(a1);
	//   39   87:aload_0         
	//   40   88:getfield        #57  <Field AwsCredentialsService h>
	//   41   91:aload_3         
	//   42   92:invokevirtual   #338 <Method com.amazonaws.auth.AWSSessionCredentials AwsCredentialsService.a(com.irobot.awsservices.a.a)>
	//   43   95:pop             
		h();
	//   44   96:aload_0         
	//   45   97:invokespecial   #192 <Method void h()>
		j.connected();
	//   46  100:aload_0         
	//   47  101:getfield        #80  <Field NetworkSessionCallback j>
	//   48  104:invokevirtual   #341 <Method void NetworkSessionCallback.connected()>
		  goto _L3
	//*  49  107:goto            227
		hashmap;
	//   50  110:astore_1        
		throw new MqttException(((Throwable) (hashmap)));
	//   51  111:new             #196 <Class MqttException>
	//   52  114:dup             
	//   53  115:aload_1         
	//   54  116:invokespecial   #344 <Method void MqttException(Throwable)>
	//   55  119:athrow          
_L2:
		i.a(e, com.irobot.home.util.j.h(), a1, ((com.irobot.awsservices.a.b) (h)), m);
	//   56  120:aload_0         
	//   57  121:getfield        #64  <Field a i>
	//   58  124:aload_0         
	//   59  125:getfield        #225 <Field String e>
	//   60  128:invokestatic    #346 <Method String j.h()>
	//   61  131:aload_3         
	//   62  132:aload_0         
	//   63  133:getfield        #57  <Field AwsCredentialsService h>
	//   64  136:aload_0         
	//   65  137:getfield        #77  <Field com.irobot.awsservices.b.b$b m>
	//   66  140:invokevirtual   #349 <Method void a.a(String, String, com.irobot.awsservices.a.a, com.irobot.awsservices.a.b, com.irobot.awsservices.b.b$b)>
		  goto _L3
	//*  67  143:goto            227
		hashmap;
	//   68  146:astore_1        
		if(hashmap instanceof UnknownHostException)
	//*  69  147:aload_1         
	//*  70  148:instanceof      #351 <Class UnknownHostException>
	//*  71  151:ifeq            166
			o.e(a, "Check internet connectivity");
	//   72  154:getstatic       #194 <Field String a>
	//   73  157:ldc2            #353 <String "Check internet connectivity">
	//   74  160:invokestatic    #206 <Method void o.e(String, String)>
		else
	//*  75  163:goto            170
			((Exception) (hashmap)).printStackTrace();
	//   76  166:aload_1         
	//   77  167:invokevirtual   #306 <Method void Exception.printStackTrace()>
_L4:
		hashmap = ((HashMap) (Error.create(0, "N/A", com.irobot.home.core.c.a(((Throwable) (hashmap))))));
	//   78  170:iconst_0        
	//   79  171:ldc2            #260 <String "N/A">
	//   80  174:aload_1         
	//   81  175:invokestatic    #247 <Method HashMap com.irobot.home.core.c.a(Throwable)>
	//   82  178:invokestatic    #253 <Method Error Error.create(int, String, HashMap)>
	//   83  181:astore_1        
		break; /* Loop/switch isn't completed */
	//   84  182:goto            227
		hashmap;
	//   85  185:astore_1        
		if(com.irobot.home.aws.authentication.a.a(((Exception) (hashmap))))
	//*  86  186:aload_1         
	//*  87  187:invokestatic    #358 <Method boolean com.irobot.home.aws.authentication.a.a(Exception)>
	//*  88  190:ifeq            220
		{
			hashmap = ((HashMap) (com.irobot.home.aws.authentication.a.b(((Exception) (hashmap)))));
	//   89  193:aload_1         
	//   90  194:invokestatic    #361 <Method com.irobot.awsservices.a.b$a com.irobot.home.aws.authentication.a.b(Exception)>
	//   91  197:astore_1        
			hashmap = ((HashMap) (Error.create(com.irobot.home.aws.authentication.a.a(((com.irobot.awsservices.a.b.a) (hashmap)).getMessage()), ((com.irobot.awsservices.a.b.a) (hashmap)).getMessage(), com.irobot.home.core.c.a(((Throwable) (hashmap))))));
	//   92  198:aload_1         
	//   93  199:invokevirtual   #364 <Method String com.irobot.awsservices.a.b$a.getMessage()>
	//   94  202:invokestatic    #367 <Method int com.irobot.home.aws.authentication.a.a(String)>
	//   95  205:aload_1         
	//   96  206:invokevirtual   #364 <Method String com.irobot.awsservices.a.b$a.getMessage()>
	//   97  209:aload_1         
	//   98  210:invokestatic    #247 <Method HashMap com.irobot.home.core.c.a(Throwable)>
	//   99  213:invokestatic    #253 <Method Error Error.create(int, String, HashMap)>
	//  100  216:astore_1        
			break; /* Loop/switch isn't completed */
	//  101  217:goto            227
		}
		((MqttException) (hashmap)).printStackTrace();
	//  102  220:aload_1         
	//  103  221:invokevirtual   #256 <Method void MqttException.printStackTrace()>
		if(true) goto _L4; else goto _L3
	//  104  224:goto            170
_L3:
		if(hashmap != null)
	//* 105  227:aload_1         
	//* 106  228:ifnull          236
			a(((Error) (hashmap)));
	//  107  231:aload_0         
	//  108  232:aload_1         
	//  109  233:invokespecial   #109 <Method void a(Error)>
		return;
	//  110  236:return          
	}

	public AssetId b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field AssetId d>
	//    2    4:areturn         
	}

	public void b(boolean flag)
	{
		if(!flag && f())
	//*   0    0:iload_1         
	//*   1    1:ifne            46
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #275 <Method boolean f()>
	//*   4    8:ifeq            46
		{
			o.b(a, "Forcefully invalidating the session due to connection state = disconnected");
	//    5   11:getstatic       #194 <Field String a>
	//    6   14:ldc2            #371 <String "Forcefully invalidating the session due to connection state = disconnected">
	//    7   17:invokestatic    #302 <Method void o.b(String, String)>
			i.b();
	//    8   20:aload_0         
	//    9   21:getfield        #64  <Field a i>
	//   10   24:invokevirtual   #373 <Method void a.b()>
			if(m != null)
	//*  11   27:aload_0         
	//*  12   28:getfield        #77  <Field com.irobot.awsservices.b.b$b m>
	//*  13   31:ifnull          46
				m.a(com.irobot.awsservices.b.b.a.ConnectionLost);
	//   14   34:aload_0         
	//   15   35:getfield        #77  <Field com.irobot.awsservices.b.b$b m>
	//   16   38:getstatic       #379 <Field com.irobot.awsservices.b.b$a com.irobot.awsservices.b.b$a.ConnectionLost>
	//   17   41:invokeinterface #384 <Method void com.irobot.awsservices.b.b$b.a(com.irobot.awsservices.b.b$a)>
		}
	//   18   46:return          
	}

	public String c()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public NetworkAddress d()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field NetworkAddress f>
	//    2    4:areturn         
	}

	public boolean e()
	{
		return f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #275 <Method boolean f()>
	//    2    4:ireturn         
	}

	public boolean f()
	{
		return g && i();
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field boolean g>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokespecial   #199 <Method boolean i()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	private static final String a = "c";
	private Object b;
	private final Object c = new Object();
	private AssetId d;
	private String e;
	private NetworkAddress f;
	private boolean g;
	private final AwsCredentialsService h = AwsCredentialsService.f();
	private final a i = com.irobot.awsservices.b.a.a();
	private NetworkSessionCallback j;
	private List k;
	private IMqttMessageListener l;
	private com.irobot.awsservices.b.b.b m;

	static 
	{
	//    0    0:return          
	}
}
