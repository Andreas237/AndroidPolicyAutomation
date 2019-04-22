// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;
import javax.net.ssl.*;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

// Referenced classes of package com.firebase.tubesock:
//			WebSocketHandshake, WebSocketReceiver, WebSocketWriter, WebSocketEventHandler, 
//			WebSocketException, ThreadInitializer

public class WebSocket
{
	private static final class State extends Enum
	{

		public static State valueOf(String s)
		{
			return (State)Enum.valueOf(com/firebase/tubesock/WebSocket$State, s);
		//    0    0:ldc1            #2   <Class WebSocket$State>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class WebSocket$State>
		//    4    9:areturn         
		}

		public static State[] values()
		{
			return (State[])((State []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field WebSocket$State[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.firebase.tubesock.WebSocket$State_3B_.clone()>
		//    2    6:checkcast       #50  <Class WebSocket$State[]>
		//    3    9:areturn         
		}

		private static final State $VALUES[];
		public static final State CONNECTED;
		public static final State CONNECTING;
		public static final State DISCONNECTED;
		public static final State DISCONNECTING;
		public static final State NONE;

		static 
		{
			NONE = new State("NONE", 0);
		//    0    0:new             #2   <Class WebSocket$State>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void WebSocket$State(String, int)>
		//    5   10:putstatic       #25  <Field WebSocket$State NONE>
			CONNECTING = new State("CONNECTING", 1);
		//    6   13:new             #2   <Class WebSocket$State>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "CONNECTING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void WebSocket$State(String, int)>
		//   11   23:putstatic       #28  <Field WebSocket$State CONNECTING>
			CONNECTED = new State("CONNECTED", 2);
		//   12   26:new             #2   <Class WebSocket$State>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "CONNECTED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void WebSocket$State(String, int)>
		//   17   36:putstatic       #31  <Field WebSocket$State CONNECTED>
			DISCONNECTING = new State("DISCONNECTING", 3);
		//   18   39:new             #2   <Class WebSocket$State>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "DISCONNECTING">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void WebSocket$State(String, int)>
		//   23   49:putstatic       #34  <Field WebSocket$State DISCONNECTING>
			DISCONNECTED = new State("DISCONNECTED", 4);
		//   24   52:new             #2   <Class WebSocket$State>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "DISCONNECTED">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void WebSocket$State(String, int)>
		//   29   62:putstatic       #37  <Field WebSocket$State DISCONNECTED>
			$VALUES = (new State[] {
				NONE, CONNECTING, CONNECTED, DISCONNECTING, DISCONNECTED
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       State[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field WebSocket$State NONE>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field WebSocket$State CONNECTING>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field WebSocket$State CONNECTED>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field WebSocket$State DISCONNECTING>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field WebSocket$State DISCONNECTED>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field WebSocket$State[] $VALUES>
		//*  53  102:return          
		}

		private State(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public WebSocket(URI uri)
	{
		this(uri, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #93  <Method void WebSocket(URI, String)>
	//    4    6:return          
	}

	public WebSocket(URI uri, String s)
	{
		this(uri, s, ((Map) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #96  <Method void WebSocket(URI, String, Map)>
	//    5    7:return          
	}

	public WebSocket(URI uri, String s, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		state = State.NONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #100 <Field WebSocket$State WebSocket$State.NONE>
	//    4    8:putfield        #102 <Field WebSocket$State state>
		socket = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #104 <Field Socket socket>
		eventHandler = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #106 <Field WebSocketEventHandler eventHandler>
		clientId = clientCount.incrementAndGet();
	//   11   21:aload_0         
	//   12   22:getstatic       #66  <Field AtomicInteger clientCount>
	//   13   25:invokevirtual   #110 <Method int AtomicInteger.incrementAndGet()>
	//   14   28:putfield        #112 <Field int clientId>
		innerThread = getThreadFactory().newThread(new Runnable() {

			public void run()
			{
				runReader();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field WebSocket this$0>
			//    2    4:invokestatic    #24  <Method void WebSocket.access$000(WebSocket)>
			//    3    7:return          
			}

			final WebSocket this$0;

			
			{
				this$0 = WebSocket.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WebSocket this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   15   31:aload_0         
	//   16   32:invokestatic    #115 <Method ThreadFactory getThreadFactory()>
	//   17   35:new             #8   <Class WebSocket$2>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #118 <Method void WebSocket$2(WebSocket)>
	//   21   43:invokeinterface #124 <Method Thread ThreadFactory.newThread(Runnable)>
	//   22   48:putfield        #126 <Field Thread innerThread>
		url = uri;
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:putfield        #128 <Field URI url>
		handshake = new WebSocketHandshake(uri, s, map);
	//   26   56:aload_0         
	//   27   57:new             #130 <Class WebSocketHandshake>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:aload_2         
	//   31   63:aload_3         
	//   32   64:invokespecial   #131 <Method void WebSocketHandshake(URI, String, Map)>
	//   33   67:putfield        #133 <Field WebSocketHandshake handshake>
		receiver = new WebSocketReceiver(this);
	//   34   70:aload_0         
	//   35   71:new             #135 <Class WebSocketReceiver>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #136 <Method void WebSocketReceiver(WebSocket)>
	//   39   79:putfield        #138 <Field WebSocketReceiver receiver>
		writer = new WebSocketWriter(this, "TubeSock", clientId);
	//   40   82:aload_0         
	//   41   83:new             #140 <Class WebSocketWriter>
	//   42   86:dup             
	//   43   87:aload_0         
	//   44   88:ldc1            #30  <String "TubeSock">
	//   45   90:aload_0         
	//   46   91:getfield        #112 <Field int clientId>
	//   47   94:invokespecial   #143 <Method void WebSocketWriter(WebSocket, String, int)>
	//   48   97:putfield        #145 <Field WebSocketWriter writer>
	//   49  100:return          
	}

	private void closeSocket()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		State state1;
		obj = ((Object) (state));
	//    2    2:aload_0         
	//    3    3:getfield        #102 <Field WebSocket$State state>
	//    4    6:astore_1        
		state1 = State.DISCONNECTED;
	//    5    7:getstatic       #157 <Field WebSocket$State WebSocket$State.DISCONNECTED>
	//    6   10:astore_2        
		if(obj != state1)
			break MISSING_BLOCK_LABEL_19;
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:if_acmpne       19
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		receiver.stopit();
	//   13   19:aload_0         
	//   14   20:getfield        #138 <Field WebSocketReceiver receiver>
	//   15   23:invokevirtual   #160 <Method void WebSocketReceiver.stopit()>
		writer.stopIt();
	//   16   26:aload_0         
	//   17   27:getfield        #145 <Field WebSocketWriter writer>
	//   18   30:invokevirtual   #163 <Method void WebSocketWriter.stopIt()>
		obj = ((Object) (socket));
	//   19   33:aload_0         
	//   20   34:getfield        #104 <Field Socket socket>
	//   21   37:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_62;
	//   22   38:aload_1         
	//   23   39:ifnull          62
		socket.close();
	//   24   42:aload_0         
	//   25   43:getfield        #104 <Field Socket socket>
	//   26   46:invokevirtual   #168 <Method void Socket.close()>
		break MISSING_BLOCK_LABEL_62;
	//   27   49:goto            62
		Object obj1;
		obj1;
	//   28   52:astore_1        
		throw new RuntimeException(((Throwable) (obj1)));
	//   29   53:new             #170 <Class RuntimeException>
	//   30   56:dup             
	//   31   57:aload_1         
	//   32   58:invokespecial   #173 <Method void RuntimeException(Throwable)>
	//   33   61:athrow          
		state = State.DISCONNECTED;
	//   34   62:aload_0         
	//   35   63:getstatic       #157 <Field WebSocket$State WebSocket$State.DISCONNECTED>
	//   36   66:putfield        #102 <Field WebSocket$State state>
		eventHandler.onClose();
	//   37   69:aload_0         
	//   38   70:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//   39   73:invokeinterface #178 <Method void WebSocketEventHandler.onClose()>
		this;
	//   40   78:aload_0         
		JVM INSTR monitorexit ;
	//   41   79:monitorexit     
		return;
	//   42   80:return          
		obj1;
	//   43   81:astore_1        
	//*  44   82:aload_0         
		throw obj1;
	//   45   83:monitorexit     
	//   46   84:aload_1         
	//   47   85:athrow          
	}

	private Socket createSocket()
	{
		Object obj1 = ((Object) (url.getScheme()));
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field URI url>
	//    2    4:invokevirtual   #188 <Method String URI.getScheme()>
	//    3    7:astore          4
		Object obj = ((Object) (url.getHost()));
	//    4    9:aload_0         
	//    5   10:getfield        #128 <Field URI url>
	//    6   13:invokevirtual   #191 <Method String URI.getHost()>
	//    7   16:astore_3        
		int i = url.getPort();
	//    8   17:aload_0         
	//    9   18:getfield        #128 <Field URI url>
	//   10   21:invokevirtual   #194 <Method int URI.getPort()>
	//   11   24:istore_1        
		if(obj1 != null && ((String) (obj1)).equals("ws"))
	//*  12   25:aload           4
	//*  13   27:ifnull          147
	//*  14   30:aload           4
	//*  15   32:ldc1            #196 <String "ws">
	//*  16   34:invokevirtual   #202 <Method boolean String.equals(Object)>
	//*  17   37:ifeq            147
		{
			int j = i;
	//   18   40:iload_1         
	//   19   41:istore_2        
			if(i == -1)
	//*  20   42:iload_1         
	//*  21   43:iconst_m1       
	//*  22   44:icmpne          50
				j = 80;
	//   23   47:bipush          80
	//   24   49:istore_2        
			try
			{
				obj1 = ((Object) (new Socket(((String) (obj)), j)));
	//   25   50:new             #165 <Class Socket>
	//   26   53:dup             
	//   27   54:aload_3         
	//   28   55:iload_2         
	//   29   56:invokespecial   #205 <Method void Socket(String, int)>
	//   30   59:astore          4
			}
	//*  31   61:aload           4
	//*  32   63:areturn         
	//*  33   64:astore_3        
	//*  34   65:new             #207 <Class StringBuilder>
	//*  35   68:dup             
	//*  36   69:invokespecial   #208 <Method void StringBuilder()>
	//*  37   72:astore          4
	//*  38   74:aload           4
	//*  39   76:ldc1            #210 <String "error while creating socket to ">
	//*  40   78:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//*  41   81:pop             
	//*  42   82:aload           4
	//*  43   84:aload_0         
	//*  44   85:getfield        #128 <Field URI url>
	//*  45   88:invokevirtual   #217 <Method StringBuilder StringBuilder.append(Object)>
	//*  46   91:pop             
	//*  47   92:new             #219 <Class WebSocketException>
	//*  48   95:dup             
	//*  49   96:aload           4
	//*  50   98:invokevirtual   #222 <Method String StringBuilder.toString()>
	//*  51  101:aload_3         
	//*  52  102:invokespecial   #225 <Method void WebSocketException(String, Throwable)>
	//*  53  105:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//*  54  106:astore          4
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   55  108:new             #207 <Class StringBuilder>
	//   56  111:dup             
	//   57  112:invokespecial   #208 <Method void StringBuilder()>
	//   58  115:astore          5
				stringbuilder1.append("unknown host: ");
	//   59  117:aload           5
	//   60  119:ldc1            #227 <String "unknown host: ">
	//   61  121:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//   62  124:pop             
				stringbuilder1.append(((String) (obj)));
	//   63  125:aload           5
	//   64  127:aload_3         
	//   65  128:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//   66  131:pop             
				throw new WebSocketException(stringbuilder1.toString(), ((Throwable) (obj1)));
	//   67  132:new             #219 <Class WebSocketException>
	//   68  135:dup             
	//   69  136:aload           5
	//   70  138:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   71  141:aload           4
	//   72  143:invokespecial   #225 <Method void WebSocketException(String, Throwable)>
	//   73  146:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("error while creating socket to ");
				((StringBuilder) (obj1)).append(((Object) (url)));
				throw new WebSocketException(((StringBuilder) (obj1)).toString(), ((Throwable) (obj)));
			}
			return ((Socket) (obj1));
		}
		if(obj1 != null && ((String) (obj1)).equals("wss"))
	//*  74  147:aload           4
	//*  75  149:ifnull          279
	//*  76  152:aload           4
	//*  77  154:ldc1            #229 <String "wss">
	//*  78  156:invokevirtual   #202 <Method boolean String.equals(Object)>
	//*  79  159:ifeq            279
		{
			int k = i;
	//   80  162:iload_1         
	//   81  163:istore_2        
			if(i == -1)
	//*  82  164:iload_1         
	//*  83  165:iconst_m1       
	//*  84  166:icmpne          173
				k = 443;
	//   85  169:sipush          443
	//   86  172:istore_2        
			try
			{
				obj1 = ((Object) (SSLSocketFactory.getDefault().createSocket(((String) (obj)), k)));
	//   87  173:invokestatic    #235 <Method SocketFactory SSLSocketFactory.getDefault()>
	//   88  176:aload_3         
	//   89  177:iload_2         
	//   90  178:invokevirtual   #240 <Method Socket SocketFactory.createSocket(String, int)>
	//   91  181:astore          4
				verifyHost((SSLSocket)obj1, ((String) (obj)));
	//   92  183:aload_0         
	//   93  184:aload           4
	//   94  186:checkcast       #242 <Class SSLSocket>
	//   95  189:aload_3         
	//   96  190:invokespecial   #246 <Method void verifyHost(SSLSocket, String)>
			}
	//*  97  193:aload           4
	//*  98  195:areturn         
	//*  99  196:astore_3        
	//* 100  197:new             #207 <Class StringBuilder>
	//* 101  200:dup             
	//* 102  201:invokespecial   #208 <Method void StringBuilder()>
	//* 103  204:astore          4
	//* 104  206:aload           4
	//* 105  208:ldc1            #248 <String "error while creating secure socket to ">
	//* 106  210:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//* 107  213:pop             
	//* 108  214:aload           4
	//* 109  216:aload_0         
	//* 110  217:getfield        #128 <Field URI url>
	//* 111  220:invokevirtual   #217 <Method StringBuilder StringBuilder.append(Object)>
	//* 112  223:pop             
	//* 113  224:new             #219 <Class WebSocketException>
	//* 114  227:dup             
	//* 115  228:aload           4
	//* 116  230:invokevirtual   #222 <Method String StringBuilder.toString()>
	//* 117  233:aload_3         
	//* 118  234:invokespecial   #225 <Method void WebSocketException(String, Throwable)>
	//* 119  237:athrow          
			// Misplaced declaration of an exception variable
			catch(Object obj1)
	//* 120  238:astore          4
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//  121  240:new             #207 <Class StringBuilder>
	//  122  243:dup             
	//  123  244:invokespecial   #208 <Method void StringBuilder()>
	//  124  247:astore          5
				stringbuilder2.append("unknown host: ");
	//  125  249:aload           5
	//  126  251:ldc1            #227 <String "unknown host: ">
	//  127  253:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//  128  256:pop             
				stringbuilder2.append(((String) (obj)));
	//  129  257:aload           5
	//  130  259:aload_3         
	//  131  260:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//  132  263:pop             
				throw new WebSocketException(stringbuilder2.toString(), ((Throwable) (obj1)));
	//  133  264:new             #219 <Class WebSocketException>
	//  134  267:dup             
	//  135  268:aload           5
	//  136  270:invokevirtual   #222 <Method String StringBuilder.toString()>
	//  137  273:aload           4
	//  138  275:invokespecial   #225 <Method void WebSocketException(String, Throwable)>
	//  139  278:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				obj1 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj1)).append("error while creating secure socket to ");
				((StringBuilder) (obj1)).append(((Object) (url)));
				throw new WebSocketException(((StringBuilder) (obj1)).toString(), ((Throwable) (obj)));
			}
			return ((Socket) (obj1));
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  140  279:new             #207 <Class StringBuilder>
	//  141  282:dup             
	//  142  283:invokespecial   #208 <Method void StringBuilder()>
	//  143  286:astore_3        
			stringbuilder.append("unsupported protocol: ");
	//  144  287:aload_3         
	//  145  288:ldc1            #250 <String "unsupported protocol: ">
	//  146  290:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//  147  293:pop             
			stringbuilder.append(((String) (obj1)));
	//  148  294:aload_3         
	//  149  295:aload           4
	//  150  297:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//  151  300:pop             
			throw new WebSocketException(stringbuilder.toString());
	//  152  301:new             #219 <Class WebSocketException>
	//  153  304:dup             
	//  154  305:aload_3         
	//  155  306:invokevirtual   #222 <Method String StringBuilder.toString()>
	//  156  309:invokespecial   #253 <Method void WebSocketException(String)>
	//  157  312:athrow          
		}
	}

	static ThreadInitializer getIntializer()
	{
		return intializer;
	//    0    0:getstatic       #88  <Field ThreadInitializer intializer>
	//    1    3:areturn         
	}

	static ThreadFactory getThreadFactory()
	{
		return threadFactory;
	//    0    0:getstatic       #84  <Field ThreadFactory threadFactory>
	//    1    3:areturn         
	}

	private void runReader()
	{
		Object obj = ((Object) (createSocket()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method Socket createSocket()>
	//    2    4:astore          4
		this;
	//    3    6:aload_0         
		JVM INSTR monitorenter ;
	//    4    7:monitorenter    
		Object obj2;
		Object obj3;
		socket = ((Socket) (obj));
	//    5    8:aload_0         
	//    6    9:aload           4
	//    7   11:putfield        #104 <Field Socket socket>
		obj2 = ((Object) (state));
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field WebSocket$State state>
	//   10   18:astore          5
		obj3 = ((Object) (State.DISCONNECTED));
	//   11   20:getstatic       #157 <Field WebSocket$State WebSocket$State.DISCONNECTED>
	//   12   23:astore          6
		if(obj2 != obj3)
			break MISSING_BLOCK_LABEL_63;
	//   13   25:aload           5
	//   14   27:aload           6
	//   15   29:if_acmpne       63
		socket.close();
	//   16   32:aload_0         
	//   17   33:getfield        #104 <Field Socket socket>
	//   18   36:invokevirtual   #168 <Method void Socket.close()>
		socket = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #104 <Field Socket socket>
		this;
	//   22   44:aload_0         
		JVM INSTR monitorexit ;
	//   23   45:monitorexit     
		close();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #258 <Method void close()>
		return;
	//   26   50:return          
		obj;
	//   27   51:astore          4
		throw new RuntimeException(((Throwable) (obj)));
	//   28   53:new             #170 <Class RuntimeException>
	//   29   56:dup             
	//   30   57:aload           4
	//   31   59:invokespecial   #173 <Method void RuntimeException(Throwable)>
	//   32   62:athrow          
		this;
	//   33   63:aload_0         
		JVM INSTR monitorexit ;
	//   34   64:monitorexit     
		byte abyte0[];
		Object obj4;
		obj2 = ((Object) (new DataInputStream(((Socket) (obj)).getInputStream())));
	//   35   65:new             #260 <Class DataInputStream>
	//   36   68:dup             
	//   37   69:aload           4
	//   38   71:invokevirtual   #264 <Method java.io.InputStream Socket.getInputStream()>
	//   39   74:invokespecial   #267 <Method void DataInputStream(java.io.InputStream)>
	//   40   77:astore          5
		obj3 = ((Object) (((Socket) (obj)).getOutputStream()));
	//   41   79:aload           4
	//   42   81:invokevirtual   #271 <Method OutputStream Socket.getOutputStream()>
	//   43   84:astore          6
		((OutputStream) (obj3)).write(handshake.getHandshake());
	//   44   86:aload           6
	//   45   88:aload_0         
	//   46   89:getfield        #133 <Field WebSocketHandshake handshake>
	//   47   92:invokevirtual   #275 <Method byte[] WebSocketHandshake.getHandshake()>
	//   48   95:invokevirtual   #281 <Method void OutputStream.write(byte[])>
		abyte0 = new byte[1000];
	//   49   98:sipush          1000
	//   50  101:newarray        byte[]
	//   51  103:astore          4
		obj4 = ((Object) (new ArrayList()));
	//   52  105:new             #283 <Class ArrayList>
	//   53  108:dup             
	//   54  109:invokespecial   #284 <Method void ArrayList()>
	//   55  112:astore          7
		int i;
		boolean flag;
		flag = false;
	//   56  114:iconst_0        
	//   57  115:istore_2        
		i = 0;
	//   58  116:iconst_0        
	//   59  117:istore_1        
_L7:
		if(flag) goto _L2; else goto _L1
	//   60  118:iload_2         
	//   61  119:ifne            285
_L1:
		int j = ((DataInputStream) (obj2)).read();
	//   62  122:aload           5
	//   63  124:invokevirtual   #287 <Method int DataInputStream.read()>
	//   64  127:istore_3        
		if(j == -1) goto _L4; else goto _L3
	//   65  128:iload_3         
	//   66  129:iconst_m1       
	//   67  130:icmpeq          274
_L3:
		abyte0[i] = (byte)j;
	//   68  133:aload           4
	//   69  135:iload_1         
	//   70  136:iload_3         
	//   71  137:int2byte        
	//   72  138:bastore         
		i++;
	//   73  139:iload_1         
	//   74  140:iconst_1        
	//   75  141:iadd            
	//   76  142:istore_1        
		if(abyte0[i - 1] != 10 || abyte0[i - 2] != 13) goto _L6; else goto _L5
	//   77  143:aload           4
	//   78  145:iload_1         
	//   79  146:iconst_1        
	//   80  147:isub            
	//   81  148:baload          
	//   82  149:bipush          10
	//   83  151:icmpne          531
	//   84  154:aload           4
	//   85  156:iload_1         
	//   86  157:iconst_2        
	//   87  158:isub            
	//   88  159:baload          
	//   89  160:bipush          13
	//   90  162:icmpne          531
_L5:
		abyte0 = ((byte []) (new String(abyte0, UTF8)));
	//   91  165:new             #198 <Class String>
	//   92  168:dup             
	//   93  169:aload           4
	//   94  171:getstatic       #76  <Field Charset UTF8>
	//   95  174:invokespecial   #290 <Method void String(byte[], Charset)>
	//   96  177:astore          4
		if(((String) (abyte0)).trim().equals(""))
	//*  97  179:aload           4
	//*  98  181:invokevirtual   #293 <Method String String.trim()>
	//*  99  184:ldc2            #295 <String "">
	//* 100  187:invokevirtual   #202 <Method boolean String.equals(Object)>
	//* 101  190:ifeq            198
		{
			flag = true;
	//  102  193:iconst_1        
	//  103  194:istore_2        
			break MISSING_BLOCK_LABEL_209;
	//  104  195:goto            209
		}
		((ArrayList) (obj4)).add(((Object) (((String) (abyte0)).trim())));
	//  105  198:aload           7
	//  106  200:aload           4
	//  107  202:invokevirtual   #293 <Method String String.trim()>
	//  108  205:invokevirtual   #298 <Method boolean ArrayList.add(Object)>
	//  109  208:pop             
		abyte0 = new byte[1000];
	//  110  209:sipush          1000
	//  111  212:newarray        byte[]
	//  112  214:astore          4
		i = 0;
	//  113  216:iconst_0        
	//  114  217:istore_1        
		  goto _L7
	//* 115  218:goto            118
_L8:
		abyte0 = ((byte []) (new String(abyte0, UTF8)));
	//  116  221:new             #198 <Class String>
	//  117  224:dup             
	//  118  225:aload           4
	//  119  227:getstatic       #76  <Field Charset UTF8>
	//  120  230:invokespecial   #290 <Method void String(byte[], Charset)>
	//  121  233:astore          4
		obj2 = ((Object) (new StringBuilder()));
	//  122  235:new             #207 <Class StringBuilder>
	//  123  238:dup             
	//  124  239:invokespecial   #208 <Method void StringBuilder()>
	//  125  242:astore          5
		((StringBuilder) (obj2)).append("Unexpected long line in handshake: ");
	//  126  244:aload           5
	//  127  246:ldc2            #300 <String "Unexpected long line in handshake: ">
	//  128  249:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//  129  252:pop             
		((StringBuilder) (obj2)).append(((String) (abyte0)));
	//  130  253:aload           5
	//  131  255:aload           4
	//  132  257:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//  133  260:pop             
		throw new WebSocketException(((StringBuilder) (obj2)).toString());
	//  134  261:new             #219 <Class WebSocketException>
	//  135  264:dup             
	//  136  265:aload           5
	//  137  267:invokevirtual   #222 <Method String StringBuilder.toString()>
	//  138  270:invokespecial   #253 <Method void WebSocketException(String)>
	//  139  273:athrow          
_L4:
		throw new WebSocketException("Connection closed before handshake was complete");
	//  140  274:new             #219 <Class WebSocketException>
	//  141  277:dup             
	//  142  278:ldc2            #302 <String "Connection closed before handshake was complete">
	//  143  281:invokespecial   #253 <Method void WebSocketException(String)>
	//  144  284:athrow          
_L2:
		handshake.verifyServerStatusLine((String)((ArrayList) (obj4)).get(0));
	//  145  285:aload_0         
	//  146  286:getfield        #133 <Field WebSocketHandshake handshake>
	//  147  289:aload           7
	//  148  291:iconst_0        
	//  149  292:invokevirtual   #306 <Method Object ArrayList.get(int)>
	//  150  295:checkcast       #198 <Class String>
	//  151  298:invokevirtual   #309 <Method void WebSocketHandshake.verifyServerStatusLine(String)>
		((ArrayList) (obj4)).remove(0);
	//  152  301:aload           7
	//  153  303:iconst_0        
	//  154  304:invokevirtual   #312 <Method Object ArrayList.remove(int)>
	//  155  307:pop             
		abyte0 = ((byte []) (new HashMap()));
	//  156  308:new             #314 <Class HashMap>
	//  157  311:dup             
	//  158  312:invokespecial   #315 <Method void HashMap()>
	//  159  315:astore          4
		String as[];
		for(obj4 = ((Object) (((ArrayList) (obj4)).iterator())); ((Iterator) (obj4)).hasNext(); ((HashMap) (abyte0)).put(((Object) (as[0])), ((Object) (as[1]))))
	//* 160  317:aload           7
	//* 161  319:invokevirtual   #319 <Method Iterator ArrayList.iterator()>
	//* 162  322:astore          7
	//* 163  324:aload           7
	//* 164  326:invokeinterface #325 <Method boolean Iterator.hasNext()>
	//* 165  331:ifeq            370
			as = ((String)((Iterator) (obj4)).next()).split(": ", 2);
	//  166  334:aload           7
	//  167  336:invokeinterface #329 <Method Object Iterator.next()>
	//  168  341:checkcast       #198 <Class String>
	//  169  344:ldc2            #331 <String ": ">
	//  170  347:iconst_2        
	//  171  348:invokevirtual   #335 <Method String[] String.split(String, int)>
	//  172  351:astore          8

	//  173  353:aload           4
	//  174  355:aload           8
	//  175  357:iconst_0        
	//  176  358:aaload          
	//  177  359:aload           8
	//  178  361:iconst_1        
	//  179  362:aaload          
	//  180  363:invokevirtual   #339 <Method Object HashMap.put(Object, Object)>
	//  181  366:pop             
	//* 182  367:goto            324
		handshake.verifyServerHandshakeHeaders(((HashMap) (abyte0)));
	//  183  370:aload_0         
	//  184  371:getfield        #133 <Field WebSocketHandshake handshake>
	//  185  374:aload           4
	//  186  376:invokevirtual   #343 <Method void WebSocketHandshake.verifyServerHandshakeHeaders(HashMap)>
		writer.setOutput(((OutputStream) (obj3)));
	//  187  379:aload_0         
	//  188  380:getfield        #145 <Field WebSocketWriter writer>
	//  189  383:aload           6
	//  190  385:invokevirtual   #347 <Method void WebSocketWriter.setOutput(OutputStream)>
		receiver.setInput(((DataInputStream) (obj2)));
	//  191  388:aload_0         
	//  192  389:getfield        #138 <Field WebSocketReceiver receiver>
	//  193  392:aload           5
	//  194  394:invokevirtual   #351 <Method void WebSocketReceiver.setInput(DataInputStream)>
		state = State.CONNECTED;
	//  195  397:aload_0         
	//  196  398:getstatic       #354 <Field WebSocket$State WebSocket$State.CONNECTED>
	//  197  401:putfield        #102 <Field WebSocket$State state>
		writer.getInnerThread().start();
	//  198  404:aload_0         
	//  199  405:getfield        #145 <Field WebSocketWriter writer>
	//  200  408:invokevirtual   #358 <Method Thread WebSocketWriter.getInnerThread()>
	//  201  411:invokevirtual   #363 <Method void Thread.start()>
		eventHandler.onOpen();
	//  202  414:aload_0         
	//  203  415:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//  204  418:invokeinterface #366 <Method void WebSocketEventHandler.onOpen()>
		receiver.run();
	//  205  423:aload_0         
	//  206  424:getfield        #138 <Field WebSocketReceiver receiver>
	//  207  427:invokevirtual   #369 <Method void WebSocketReceiver.run()>
		break MISSING_BLOCK_LABEL_519;
	//  208  430:goto            519
		Object obj1;
		obj1;
	//  209  433:astore          4
		this;
	//  210  435:aload_0         
		JVM INSTR monitorexit ;
	//  211  436:monitorexit     
		throw obj1;
	//  212  437:aload           4
	//  213  439:athrow          
		obj1;
	//  214  440:astore          4
		break MISSING_BLOCK_LABEL_524;
	//  215  442:goto            524
		obj1;
	//  216  445:astore          4
		WebSocketEventHandler websocketeventhandler = eventHandler;
	//  217  447:aload_0         
	//  218  448:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//  219  451:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//  220  453:new             #207 <Class StringBuilder>
	//  221  456:dup             
	//  222  457:invokespecial   #208 <Method void StringBuilder()>
	//  223  460:astore          6
		stringbuilder.append("error while connecting: ");
	//  224  462:aload           6
	//  225  464:ldc2            #371 <String "error while connecting: ">
	//  226  467:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//  227  470:pop             
		stringbuilder.append(((IOException) (obj1)).getMessage());
	//  228  471:aload           6
	//  229  473:aload           4
	//  230  475:invokevirtual   #374 <Method String IOException.getMessage()>
	//  231  478:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//  232  481:pop             
		websocketeventhandler.onError(new WebSocketException(stringbuilder.toString(), ((Throwable) (obj1))));
	//  233  482:aload           5
	//  234  484:new             #219 <Class WebSocketException>
	//  235  487:dup             
	//  236  488:aload           6
	//  237  490:invokevirtual   #222 <Method String StringBuilder.toString()>
	//  238  493:aload           4
	//  239  495:invokespecial   #225 <Method void WebSocketException(String, Throwable)>
	//  240  498:invokeinterface #378 <Method void WebSocketEventHandler.onError(WebSocketException)>
		break MISSING_BLOCK_LABEL_519;
	//  241  503:goto            519
		obj1;
	//  242  506:astore          4
		eventHandler.onError(((WebSocketException) (obj1)));
	//  243  508:aload_0         
	//  244  509:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//  245  512:aload           4
	//  246  514:invokeinterface #378 <Method void WebSocketEventHandler.onError(WebSocketException)>
		close();
	//  247  519:aload_0         
	//  248  520:invokevirtual   #258 <Method void close()>
		return;
	//  249  523:return          
		close();
	//  250  524:aload_0         
	//  251  525:invokevirtual   #258 <Method void close()>
		throw obj1;
	//  252  528:aload           4
	//  253  530:athrow          
_L6:
		if(i == 1000) goto _L8; else goto _L7
	//  254  531:iload_1         
	//  255  532:sipush          1000
	//  256  535:icmpeq          221
	//* 257  538:goto            118
	}

	private void send(byte byte0, byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(state != State.CONNECTED)
	//*   2    2:aload_0         
	//*   3    3:getfield        #102 <Field WebSocket$State state>
	//*   4    6:getstatic       #354 <Field WebSocket$State WebSocket$State.CONNECTED>
	//*   5    9:if_acmpeq       34
		{
			eventHandler.onError(new WebSocketException("error while sending data: not connected"));
	//    6   12:aload_0         
	//    7   13:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//    8   16:new             #219 <Class WebSocketException>
	//    9   19:dup             
	//   10   20:ldc2            #382 <String "error while sending data: not connected">
	//   11   23:invokespecial   #253 <Method void WebSocketException(String)>
	//   12   26:invokeinterface #378 <Method void WebSocketEventHandler.onError(WebSocketException)>
			break MISSING_BLOCK_LABEL_72;
	//   13   31:goto            72
		}
		try
		{
			writer.send(byte0, true, abyte0);
	//   14   34:aload_0         
	//   15   35:getfield        #145 <Field WebSocketWriter writer>
	//   16   38:iload_1         
	//   17   39:iconst_1        
	//   18   40:aload_2         
	//   19   41:invokevirtual   #385 <Method void WebSocketWriter.send(byte, boolean, byte[])>
			break MISSING_BLOCK_LABEL_72;
	//   20   44:goto            72
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[]) { }
	//   21   47:astore_2        
		eventHandler.onError(new WebSocketException("Failed to send frame", ((Throwable) (abyte0))));
	//   22   48:aload_0         
	//   23   49:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//   24   52:new             #219 <Class WebSocketException>
	//   25   55:dup             
	//   26   56:ldc2            #387 <String "Failed to send frame">
	//   27   59:aload_2         
	//   28   60:invokespecial   #225 <Method void WebSocketException(String, Throwable)>
	//   29   63:invokeinterface #378 <Method void WebSocketEventHandler.onError(WebSocketException)>
		close();
	//   30   68:aload_0         
	//   31   69:invokevirtual   #258 <Method void close()>
		this;
	//   32   72:aload_0         
		JVM INSTR monitorexit ;
	//   33   73:monitorexit     
		return;
	//   34   74:return          
		abyte0;
	//   35   75:astore_2        
	//*  36   76:aload_0         
		throw abyte0;
	//   37   77:monitorexit     
	//   38   78:aload_2         
	//   39   79:athrow          
	}

	private void sendCloseHandshake()
	{
		try
		{
			state = State.DISCONNECTING;
	//    0    0:aload_0         
	//    1    1:getstatic       #391 <Field WebSocket$State WebSocket$State.DISCONNECTING>
	//    2    4:putfield        #102 <Field WebSocket$State state>
			writer.stopIt();
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field WebSocketWriter writer>
	//    5   11:invokevirtual   #163 <Method void WebSocketWriter.stopIt()>
			writer.send((byte)8, true, new byte[0]);
	//    6   14:aload_0         
	//    7   15:getfield        #145 <Field WebSocketWriter writer>
	//    8   18:bipush          8
	//    9   20:iconst_1        
	//   10   21:iconst_0        
	//   11   22:newarray        byte[]
	//   12   24:invokevirtual   #385 <Method void WebSocketWriter.send(byte, boolean, byte[])>
			return;
	//   13   27:return          
		}
		catch(IOException ioexception)
	//*  14   28:astore_1        
		{
			eventHandler.onError(new WebSocketException("Failed to send close frame", ((Throwable) (ioexception))));
	//   15   29:aload_0         
	//   16   30:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//   17   33:new             #219 <Class WebSocketException>
	//   18   36:dup             
	//   19   37:ldc2            #393 <String "Failed to send close frame">
	//   20   40:aload_1         
	//   21   41:invokespecial   #225 <Method void WebSocketException(String, Throwable)>
	//   22   44:invokeinterface #378 <Method void WebSocketEventHandler.onError(WebSocketException)>
		}
	//   23   49:return          
	}

	public static void setThreadFactory(ThreadFactory threadfactory, ThreadInitializer threadinitializer)
	{
		threadFactory = threadfactory;
	//    0    0:aload_0         
	//    1    1:putstatic       #84  <Field ThreadFactory threadFactory>
		intializer = threadinitializer;
	//    2    4:aload_1         
	//    3    5:putstatic       #88  <Field ThreadInitializer intializer>
	//    4    8:return          
	}

	private void verifyHost(SSLSocket sslsocket, String s)
		throws SSLException
	{
		sslsocket = ((SSLSocket) ((X509Certificate)sslsocket.getSession().getPeerCertificates()[0]));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #401 <Method SSLSession SSLSocket.getSession()>
	//    2    4:invokeinterface #407 <Method java.security.cert.Certificate[] SSLSession.getPeerCertificates()>
	//    3    9:iconst_0        
	//    4   10:aaload          
	//    5   11:checkcast       #409 <Class X509Certificate>
	//    6   14:astore_1        
		(new StrictHostnameVerifier()).verify(s, ((X509Certificate) (sslsocket)));
	//    7   15:new             #411 <Class StrictHostnameVerifier>
	//    8   18:dup             
	//    9   19:invokespecial   #412 <Method void StrictHostnameVerifier()>
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #416 <Method void StrictHostnameVerifier.verify(String, X509Certificate)>
	//   13   27:return          
	}

	public void blockClose()
		throws InterruptedException
	{
		if(writer.getInnerThread().getState() != Thread.State.NEW)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field WebSocketWriter writer>
	//*   2    4:invokevirtual   #358 <Method Thread WebSocketWriter.getInnerThread()>
	//*   3    7:invokevirtual   #424 <Method Thread$State Thread.getState()>
	//*   4   10:getstatic       #430 <Field Thread$State Thread$State.NEW>
	//*   5   13:if_acmpeq       26
			writer.getInnerThread().join();
	//    6   16:aload_0         
	//    7   17:getfield        #145 <Field WebSocketWriter writer>
	//    8   20:invokevirtual   #358 <Method Thread WebSocketWriter.getInnerThread()>
	//    9   23:invokevirtual   #433 <Method void Thread.join()>
		getInnerThread().join();
	//   10   26:aload_0         
	//   11   27:invokevirtual   #434 <Method Thread getInnerThread()>
	//   12   30:invokevirtual   #433 <Method void Thread.join()>
	//   13   33:return          
	}

	public void close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		static class _cls3
		{

			static final int $SwitchMap$com$firebase$tubesock$WebSocket$State[];

			static 
			{
				$SwitchMap$com$firebase$tubesock$WebSocket$State = new int[State.values().length];
			//    0    0:invokestatic    #18  <Method WebSocket$State[] WebSocket$State.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$tubesock$WebSocket$State>
				try
				{
					$SwitchMap$com$firebase$tubesock$WebSocket$State[State.NONE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$tubesock$WebSocket$State>
			//    5   12:getstatic       #24  <Field WebSocket$State WebSocket$State.NONE>
			//    6   15:invokevirtual   #28  <Method int WebSocket$State.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$tubesock$WebSocket$State>
			//*  10   23:getstatic       #31  <Field WebSocket$State WebSocket$State.CONNECTING>
			//*  11   26:invokevirtual   #28  <Method int WebSocket$State.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$firebase$tubesock$WebSocket$State>
			//*  15   34:getstatic       #34  <Field WebSocket$State WebSocket$State.CONNECTED>
			//*  16   37:invokevirtual   #28  <Method int WebSocket$State.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$firebase$tubesock$WebSocket$State>
			//*  20   45:getstatic       #37  <Field WebSocket$State WebSocket$State.DISCONNECTING>
			//*  21   48:invokevirtual   #28  <Method int WebSocket$State.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$firebase$tubesock$WebSocket$State>
			//*  25   56:getstatic       #40  <Field WebSocket$State WebSocket$State.DISCONNECTED>
			//*  26   59:invokevirtual   #28  <Method int WebSocket$State.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$com$firebase$tubesock$WebSocket$State[State.CONNECTING.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$com$firebase$tubesock$WebSocket$State[State.CONNECTED.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$com$firebase$tubesock$WebSocket$State[State.DISCONNECTING.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$com$firebase$tubesock$WebSocket$State[State.DISCONNECTED.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		int i = _cls3..SwitchMap.com.firebase.tubesock.WebSocket.State[state.ordinal()];
	//    2    2:getstatic       #438 <Field int[] WebSocket$3.$SwitchMap$com$firebase$tubesock$WebSocket$State>
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field WebSocket$State state>
	//    5    9:invokevirtual   #441 <Method int WebSocket$State.ordinal()>
	//    6   12:iaload          
	//    7   13:istore_1        
		i;
	//    8   14:iload_1         
		JVM INSTR tableswitch 1 5: default 48
	//	               1 71
	//	               2 64
	//	               3 57
	//	               4 54
	//	               5 51;
	//    9   15:tableswitch     1 5: default 48
	//	               1 71
	//	               2 64
	//	               3 57
	//	               4 54
	//	               5 51
		   goto _L1 _L2 _L3 _L4 _L5 _L6
	//*  10   48:aload_0         
_L1:
		return;
	//   11   49:monitorexit     
	//   12   50:return          
	//*  13   51:aload_0         
_L6:
		return;
	//   14   52:monitorexit     
	//   15   53:return          
	//*  16   54:aload_0         
_L5:
		return;
	//   17   55:monitorexit     
	//   18   56:return          
_L4:
		sendCloseHandshake();
	//   19   57:aload_0         
	//   20   58:invokespecial   #443 <Method void sendCloseHandshake()>
		this;
	//   21   61:aload_0         
		JVM INSTR monitorexit ;
	//   22   62:monitorexit     
		return;
	//   23   63:return          
_L3:
		closeSocket();
	//   24   64:aload_0         
	//   25   65:invokespecial   #445 <Method void closeSocket()>
		this;
	//   26   68:aload_0         
		JVM INSTR monitorexit ;
	//   27   69:monitorexit     
		return;
	//   28   70:return          
_L2:
		state = State.DISCONNECTED;
	//   29   71:aload_0         
	//   30   72:getstatic       #157 <Field WebSocket$State WebSocket$State.DISCONNECTED>
	//   31   75:putfield        #102 <Field WebSocket$State state>
		this;
	//   32   78:aload_0         
		JVM INSTR monitorexit ;
	//   33   79:monitorexit     
		return;
	//   34   80:return          
		Exception exception;
		exception;
	//   35   81:astore_2        
	//*  36   82:aload_0         
		throw exception;
	//   37   83:monitorexit     
	//   38   84:aload_2         
	//   39   85:athrow          
	}

	public void connect()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(state == State.NONE)
			break MISSING_BLOCK_LABEL_38;
	//    2    2:aload_0         
	//    3    3:getfield        #102 <Field WebSocket$State state>
	//    4    6:getstatic       #100 <Field WebSocket$State WebSocket$State.NONE>
	//    5    9:if_acmpeq       38
		eventHandler.onError(new WebSocketException("connect() already called"));
	//    6   12:aload_0         
	//    7   13:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//    8   16:new             #219 <Class WebSocketException>
	//    9   19:dup             
	//   10   20:ldc2            #448 <String "connect() already called">
	//   11   23:invokespecial   #253 <Method void WebSocketException(String)>
	//   12   26:invokeinterface #378 <Method void WebSocketEventHandler.onError(WebSocketException)>
		close();
	//   13   31:aload_0         
	//   14   32:invokevirtual   #258 <Method void close()>
		this;
	//   15   35:aload_0         
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		return;
	//   17   37:return          
		ThreadInitializer threadinitializer = getIntializer();
	//   18   38:invokestatic    #450 <Method ThreadInitializer getIntializer()>
	//   19   41:astore_1        
		Thread thread = getInnerThread();
	//   20   42:aload_0         
	//   21   43:invokevirtual   #434 <Method Thread getInnerThread()>
	//   22   46:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   23   47:new             #207 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:invokespecial   #208 <Method void StringBuilder()>
	//   26   54:astore_3        
		stringbuilder.append("TubeSockReader-");
	//   27   55:aload_3         
	//   28   56:ldc2            #452 <String "TubeSockReader-">
	//   29   59:invokevirtual   #214 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
		stringbuilder.append(clientId);
	//   31   63:aload_3         
	//   32   64:aload_0         
	//   33   65:getfield        #112 <Field int clientId>
	//   34   68:invokevirtual   #455 <Method StringBuilder StringBuilder.append(int)>
	//   35   71:pop             
		threadinitializer.setName(thread, stringbuilder.toString());
	//   36   72:aload_1         
	//   37   73:aload_2         
	//   38   74:aload_3         
	//   39   75:invokevirtual   #222 <Method String StringBuilder.toString()>
	//   40   78:invokeinterface #461 <Method void ThreadInitializer.setName(Thread, String)>
		state = State.CONNECTING;
	//   41   83:aload_0         
	//   42   84:getstatic       #464 <Field WebSocket$State WebSocket$State.CONNECTING>
	//   43   87:putfield        #102 <Field WebSocket$State state>
		getInnerThread().start();
	//   44   90:aload_0         
	//   45   91:invokevirtual   #434 <Method Thread getInnerThread()>
	//   46   94:invokevirtual   #363 <Method void Thread.start()>
		this;
	//   47   97:aload_0         
		JVM INSTR monitorexit ;
	//   48   98:monitorexit     
		return;
	//   49   99:return          
		Exception exception;
		exception;
	//   50  100:astore_1        
	//*  51  101:aload_0         
		throw exception;
	//   52  102:monitorexit     
	//   53  103:aload_1         
	//   54  104:athrow          
	}

	WebSocketEventHandler getEventHandler()
	{
		return eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//    2    4:areturn         
	}

	Thread getInnerThread()
	{
		return innerThread;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Thread innerThread>
	//    2    4:areturn         
	}

	void handleReceiverError(WebSocketException websocketexception)
	{
		eventHandler.onError(websocketexception);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field WebSocketEventHandler eventHandler>
	//    2    4:aload_1         
	//    3    5:invokeinterface #378 <Method void WebSocketEventHandler.onError(WebSocketException)>
		if(state == State.CONNECTED)
	//*   4   10:aload_0         
	//*   5   11:getfield        #102 <Field WebSocket$State state>
	//*   6   14:getstatic       #354 <Field WebSocket$State WebSocket$State.CONNECTED>
	//*   7   17:if_acmpne       24
			close();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #258 <Method void close()>
		closeSocket();
	//   10   24:aload_0         
	//   11   25:invokespecial   #445 <Method void closeSocket()>
	//   12   28:return          
	}

	void onCloseOpReceived()
	{
		closeSocket();
	//    0    0:aload_0         
	//    1    1:invokespecial   #445 <Method void closeSocket()>
	//    2    4:return          
	}

	void pong(byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		send((byte)10, abyte0);
	//    2    2:aload_0         
	//    3    3:bipush          10
	//    4    5:aload_1         
	//    5    6:invokespecial   #471 <Method void send(byte, byte[])>
		this;
	//    6    9:aload_0         
		JVM INSTR monitorexit ;
	//    7   10:monitorexit     
		return;
	//    8   11:return          
		abyte0;
	//    9   12:astore_1        
	//*  10   13:aload_0         
		throw abyte0;
	//   11   14:monitorexit     
	//   12   15:aload_1         
	//   13   16:athrow          
	}

	public void send(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		send((byte)1, s.getBytes(UTF8));
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:aload_1         
	//    5    5:getstatic       #76  <Field Charset UTF8>
	//    6    8:invokevirtual   #475 <Method byte[] String.getBytes(Charset)>
	//    7   11:invokespecial   #471 <Method void send(byte, byte[])>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		s;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw s;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public void send(byte abyte0[])
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		send((byte)2, abyte0);
	//    2    2:aload_0         
	//    3    3:iconst_2        
	//    4    4:aload_1         
	//    5    5:invokespecial   #471 <Method void send(byte, byte[])>
		this;
	//    6    8:aload_0         
		JVM INSTR monitorexit ;
	//    7    9:monitorexit     
		return;
	//    8   10:return          
		abyte0;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw abyte0;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public void setEventHandler(WebSocketEventHandler websocketeventhandler)
	{
		eventHandler = websocketeventhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #106 <Field WebSocketEventHandler eventHandler>
	//    3    5:return          
	}

	static final byte OPCODE_BINARY = 2;
	static final byte OPCODE_CLOSE = 8;
	static final byte OPCODE_NONE = 0;
	static final byte OPCODE_PING = 9;
	static final byte OPCODE_PONG = 10;
	static final byte OPCODE_TEXT = 1;
	private static final String THREAD_BASE_NAME = "TubeSock";
	private static final Charset UTF8 = Charset.forName("UTF-8");
	private static final AtomicInteger clientCount = new AtomicInteger(0);
	private static ThreadInitializer intializer = new ThreadInitializer() {

		public void setName(Thread thread, String s)
		{
			thread.setName(s);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #20  <Method void Thread.setName(String)>
		//    3    5:return          
		}

	}
;
	private static ThreadFactory threadFactory = Executors.defaultThreadFactory();
	private final int clientId;
	private WebSocketEventHandler eventHandler;
	private final WebSocketHandshake handshake;
	private final Thread innerThread;
	private final WebSocketReceiver receiver;
	private volatile Socket socket;
	private volatile State state;
	private final URI url;
	private final WebSocketWriter writer;

	static 
	{
	//    0    0:new             #60  <Class AtomicInteger>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #64  <Method void AtomicInteger(int)>
	//    4    8:putstatic       #66  <Field AtomicInteger clientCount>
	//    5   11:ldc1            #68  <String "UTF-8">
	//    6   13:invokestatic    #74  <Method Charset Charset.forName(String)>
	//    7   16:putstatic       #76  <Field Charset UTF8>
	//    8   19:invokestatic    #82  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    9   22:putstatic       #84  <Field ThreadFactory threadFactory>
	//   10   25:new             #6   <Class WebSocket$1>
	//   11   28:dup             
	//   12   29:invokespecial   #86  <Method void WebSocket$1()>
	//   13   32:putstatic       #88  <Field ThreadInitializer intializer>
	//*  14   35:return          
	}


/*
	static void access$000(WebSocket websocket)
	{
		websocket.runReader();
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method void runReader()>
		return;
	//    2    4:return          
	}

*/
}
