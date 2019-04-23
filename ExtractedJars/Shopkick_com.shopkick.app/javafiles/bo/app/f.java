// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.*;

class f extends SSLSocketFactory
{

	public f()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void SSLSocketFactory()>
		SSLContext sslcontext = SSLContext.getInstance("TLS");
	//    2    4:ldc1            #24  <String "TLS">
	//    3    6:invokestatic    #30  <Method SSLContext SSLContext.getInstance(String)>
	//    4    9:astore_1        
		sslcontext.init(((javax.net.ssl.KeyManager []) (null)), ((javax.net.ssl.TrustManager []) (null)), ((java.security.SecureRandom) (null)));
	//    5   10:aload_1         
	//    6   11:aconst_null     
	//    7   12:aconst_null     
	//    8   13:aconst_null     
	//    9   14:invokevirtual   #34  <Method void SSLContext.init(javax.net.ssl.KeyManager[], javax.net.ssl.TrustManager[], java.security.SecureRandom)>
		b = sslcontext.getSocketFactory();
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokevirtual   #38  <Method SSLSocketFactory SSLContext.getSocketFactory()>
	//   13   22:putfield        #40  <Field SSLSocketFactory b>
	//   14   25:return          
	}

	private Socket a(Socket socket)
	{
		if(socket != null && (socket instanceof SSLSocket))
	//*   0    0:aload_1         
	//*   1    1:ifnull          143
	//*   2    4:aload_1         
	//*   3    5:instanceof      #43  <Class SSLSocket>
	//*   4    8:ifeq            143
		{
			SSLSocket sslsocket = (SSLSocket)socket;
	//    5   11:aload_1         
	//    6   12:checkcast       #43  <Class SSLSocket>
	//    7   15:astore          4
			ArrayList arraylist = new ArrayList();
	//    8   17:new             #45  <Class ArrayList>
	//    9   20:dup             
	//   10   21:invokespecial   #46  <Method void ArrayList()>
	//   11   24:astore          5
			String as[] = sslsocket.getSupportedProtocols();
	//   12   26:aload           4
	//   13   28:invokevirtual   #50  <Method String[] SSLSocket.getSupportedProtocols()>
	//   14   31:astore          6
			int j = as.length;
	//   15   33:aload           6
	//   16   35:arraylength     
	//   17   36:istore_3        
			for(int i = 0; i < j; i++)
	//*  18   37:iconst_0        
	//*  19   38:istore_2        
	//*  20   39:iload_2         
	//*  21   40:iload_3         
	//*  22   41:icmpge          77
			{
				String s1 = as[i];
	//   23   44:aload           6
	//   24   46:iload_2         
	//   25   47:aaload          
	//   26   48:astore          7
				if(!s1.equals("SSLv3"))
	//*  27   50:aload           7
	//*  28   52:ldc1            #52  <String "SSLv3">
	//*  29   54:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  30   57:ifne            70
					((List) (arraylist)).add(((Object) (s1)));
	//   31   60:aload           5
	//   32   62:aload           7
	//   33   64:invokeinterface #63  <Method boolean List.add(Object)>
	//   34   69:pop             
			}

	//   35   70:iload_2         
	//   36   71:iconst_1        
	//   37   72:iadd            
	//   38   73:istore_2        
	//*  39   74:goto            39
			String s = a;
	//   40   77:getstatic       #18  <Field String a>
	//   41   80:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   42   82:new             #65  <Class StringBuilder>
	//   43   85:dup             
	//   44   86:invokespecial   #66  <Method void StringBuilder()>
	//   45   89:astore          7
			stringbuilder.append("Enabling SSL protocols: ");
	//   46   91:aload           7
	//   47   93:ldc1            #68  <String "Enabling SSL protocols: ">
	//   48   95:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   49   98:pop             
			stringbuilder.append(((Object) (arraylist)));
	//   50   99:aload           7
	//   51  101:aload           5
	//   52  103:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   53  106:pop             
			AppboyLogger.v(s, stringbuilder.toString());
	//   54  107:aload           6
	//   55  109:aload           7
	//   56  111:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   57  114:invokestatic    #83  <Method int AppboyLogger.v(String, String)>
	//   58  117:pop             
			sslsocket.setEnabledProtocols((String[])((List) (arraylist)).toArray(((Object []) (new String[((List) (arraylist)).size()]))));
	//   59  118:aload           4
	//   60  120:aload           5
	//   61  122:aload           5
	//   62  124:invokeinterface #87  <Method int List.size()>
	//   63  129:anewarray       String[]
	//   64  132:invokeinterface #91  <Method Object[] List.toArray(Object[])>
	//   65  137:checkcast       #93  <Class String[]>
	//   66  140:invokevirtual   #97  <Method void SSLSocket.setEnabledProtocols(String[])>
		}
		return socket;
	//   67  143:aload_1         
	//   68  144:areturn         
	}

	public Socket createSocket()
	{
		return a(b.createSocket());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field SSLSocketFactory b>
	//    3    5:invokevirtual   #101 <Method Socket SSLSocketFactory.createSocket()>
	//    4    8:invokespecial   #103 <Method Socket a(Socket)>
	//    5   11:areturn         
	}

	public Socket createSocket(String s, int i)
	{
		return a(b.createSocket(s, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field SSLSocketFactory b>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #106 <Method Socket SSLSocketFactory.createSocket(String, int)>
	//    6   10:invokespecial   #103 <Method Socket a(Socket)>
	//    7   13:areturn         
	}

	public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
	{
		return a(b.createSocket(s, i, inetaddress, j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field SSLSocketFactory b>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokevirtual   #109 <Method Socket SSLSocketFactory.createSocket(String, int, InetAddress, int)>
	//    8   13:invokespecial   #103 <Method Socket a(Socket)>
	//    9   16:areturn         
	}

	public Socket createSocket(InetAddress inetaddress, int i)
	{
		return a(b.createSocket(inetaddress, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field SSLSocketFactory b>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #112 <Method Socket SSLSocketFactory.createSocket(InetAddress, int)>
	//    6   10:invokespecial   #103 <Method Socket a(Socket)>
	//    7   13:areturn         
	}

	public Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
	{
		return a(b.createSocket(inetaddress, i, inetaddress1, j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field SSLSocketFactory b>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokevirtual   #115 <Method Socket SSLSocketFactory.createSocket(InetAddress, int, InetAddress, int)>
	//    8   13:invokespecial   #103 <Method Socket a(Socket)>
	//    9   16:areturn         
	}

	public Socket createSocket(Socket socket, String s, int i, boolean flag)
	{
		return a(b.createSocket(socket, s, i, flag));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field SSLSocketFactory b>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokevirtual   #118 <Method Socket SSLSocketFactory.createSocket(Socket, String, int, boolean)>
	//    8   13:invokespecial   #103 <Method Socket a(Socket)>
	//    9   16:areturn         
	}

	public String[] getDefaultCipherSuites()
	{
		return b.getDefaultCipherSuites();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field SSLSocketFactory b>
	//    2    4:invokevirtual   #121 <Method String[] SSLSocketFactory.getDefaultCipherSuites()>
	//    3    7:areturn         
	}

	public String[] getSupportedCipherSuites()
	{
		return b.getSupportedCipherSuites();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field SSLSocketFactory b>
	//    2    4:invokevirtual   #124 <Method String[] SSLSocketFactory.getSupportedCipherSuites()>
	//    3    7:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/f);
	private SSLSocketFactory b;

	static 
	{
	//    0    0:ldc1            #2   <Class f>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String a>
	//*   3    8:return          
	}
}
