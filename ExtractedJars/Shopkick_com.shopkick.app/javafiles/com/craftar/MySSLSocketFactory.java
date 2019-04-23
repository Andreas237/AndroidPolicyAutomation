// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.io.IOException;
import java.net.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.*;

public class MySSLSocketFactory extends SSLSocketFactory
{

	public MySSLSocketFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void SSLSocketFactory()>
		try
		{
			sc = SSLContext.getInstance("TLS");
	//    2    4:aload_0         
	//    3    5:ldc1            #18  <String "TLS">
	//    4    7:invokestatic    #24  <Method SSLContext SSLContext.getInstance(String)>
	//    5   10:putfield        #26  <Field SSLContext sc>
			sc.init(((javax.net.ssl.KeyManager []) (null)), ((javax.net.ssl.TrustManager []) (null)), ((java.security.SecureRandom) (null)));
	//    6   13:aload_0         
	//    7   14:getfield        #26  <Field SSLContext sc>
	//    8   17:aconst_null     
	//    9   18:aconst_null     
	//   10   19:aconst_null     
	//   11   20:invokevirtual   #30  <Method void SSLContext.init(javax.net.ssl.KeyManager[], javax.net.ssl.TrustManager[], java.security.SecureRandom)>
			ssf = sc.getSocketFactory();
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #26  <Field SSLContext sc>
	//   15   28:invokevirtual   #34  <Method SSLSocketFactory SSLContext.getSocketFactory()>
	//   16   31:putfield        #36  <Field SSLSocketFactory ssf>
			return;
	//   17   34:return          
		}
	//*  18   35:astore_1        
	//*  19   36:aload_1         
	//*  20   37:invokevirtual   #39  <Method void KeyManagementException.printStackTrace()>
	//*  21   40:return          
		catch(NoSuchAlgorithmException nosuchalgorithmexception)
	//*  22   41:astore_1        
		{
			nosuchalgorithmexception.printStackTrace();
	//   23   42:aload_1         
	//   24   43:invokevirtual   #40  <Method void NoSuchAlgorithmException.printStackTrace()>
		}
		catch(KeyManagementException keymanagementexception)
		{
			keymanagementexception.printStackTrace();
			return;
		}
	//   25   46:return          
	}

	public Socket createSocket(String s, int i)
		throws IOException, UnknownHostException
	{
		s = ((String) ((SSLSocket)ssf.createSocket(s, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SSLSocketFactory ssf>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #49  <Method Socket SSLSocketFactory.createSocket(String, int)>
	//    5    9:checkcast       #51  <Class SSLSocket>
	//    6   12:astore_1        
		((SSLSocket) (s)).setEnabledProtocols(((SSLSocket) (s)).getSupportedProtocols());
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #55  <Method String[] SSLSocket.getSupportedProtocols()>
	//   10   18:invokevirtual   #59  <Method void SSLSocket.setEnabledProtocols(String[])>
		((SSLSocket) (s)).setEnabledCipherSuites(((SSLSocket) (s)).getSupportedCipherSuites());
	//   11   21:aload_1         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #62  <Method String[] SSLSocket.getSupportedCipherSuites()>
	//   14   26:invokevirtual   #65  <Method void SSLSocket.setEnabledCipherSuites(String[])>
		return ((Socket) (s));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
		throws IOException, UnknownHostException
	{
		s = ((String) ((SSLSocket)ssf.createSocket(s, i, inetaddress, j)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SSLSocketFactory ssf>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #69  <Method Socket SSLSocketFactory.createSocket(String, int, InetAddress, int)>
	//    7   12:checkcast       #51  <Class SSLSocket>
	//    8   15:astore_1        
		((SSLSocket) (s)).setEnabledProtocols(((SSLSocket) (s)).getSupportedProtocols());
	//    9   16:aload_1         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #55  <Method String[] SSLSocket.getSupportedProtocols()>
	//   12   21:invokevirtual   #59  <Method void SSLSocket.setEnabledProtocols(String[])>
		((SSLSocket) (s)).setEnabledCipherSuites(((SSLSocket) (s)).getSupportedCipherSuites());
	//   13   24:aload_1         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #62  <Method String[] SSLSocket.getSupportedCipherSuites()>
	//   16   29:invokevirtual   #65  <Method void SSLSocket.setEnabledCipherSuites(String[])>
		return ((Socket) (s));
	//   17   32:aload_1         
	//   18   33:areturn         
	}

	public Socket createSocket(InetAddress inetaddress, int i)
		throws IOException
	{
		inetaddress = ((InetAddress) ((SSLSocket)ssf.createSocket(inetaddress, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SSLSocketFactory ssf>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #72  <Method Socket SSLSocketFactory.createSocket(InetAddress, int)>
	//    5    9:checkcast       #51  <Class SSLSocket>
	//    6   12:astore_1        
		((SSLSocket) (inetaddress)).setEnabledProtocols(((SSLSocket) (inetaddress)).getSupportedProtocols());
	//    7   13:aload_1         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #55  <Method String[] SSLSocket.getSupportedProtocols()>
	//   10   18:invokevirtual   #59  <Method void SSLSocket.setEnabledProtocols(String[])>
		((SSLSocket) (inetaddress)).setEnabledCipherSuites(((SSLSocket) (inetaddress)).getSupportedCipherSuites());
	//   11   21:aload_1         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #62  <Method String[] SSLSocket.getSupportedCipherSuites()>
	//   14   26:invokevirtual   #65  <Method void SSLSocket.setEnabledCipherSuites(String[])>
		return ((Socket) (inetaddress));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
		throws IOException
	{
		inetaddress = ((InetAddress) ((SSLSocket)ssf.createSocket(inetaddress, i, inetaddress1, j)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SSLSocketFactory ssf>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #75  <Method Socket SSLSocketFactory.createSocket(InetAddress, int, InetAddress, int)>
	//    7   12:checkcast       #51  <Class SSLSocket>
	//    8   15:astore_1        
		((SSLSocket) (inetaddress)).setEnabledProtocols(((SSLSocket) (inetaddress)).getSupportedProtocols());
	//    9   16:aload_1         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #55  <Method String[] SSLSocket.getSupportedProtocols()>
	//   12   21:invokevirtual   #59  <Method void SSLSocket.setEnabledProtocols(String[])>
		((SSLSocket) (inetaddress)).setEnabledCipherSuites(((SSLSocket) (inetaddress)).getSupportedCipherSuites());
	//   13   24:aload_1         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #62  <Method String[] SSLSocket.getSupportedCipherSuites()>
	//   16   29:invokevirtual   #65  <Method void SSLSocket.setEnabledCipherSuites(String[])>
		return ((Socket) (inetaddress));
	//   17   32:aload_1         
	//   18   33:areturn         
	}

	public Socket createSocket(Socket socket, String s, int i, boolean flag)
		throws IOException
	{
		socket = ((Socket) ((SSLSocket)ssf.createSocket(socket, s, i, flag)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SSLSocketFactory ssf>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #78  <Method Socket SSLSocketFactory.createSocket(Socket, String, int, boolean)>
	//    7   12:checkcast       #51  <Class SSLSocket>
	//    8   15:astore_1        
		((SSLSocket) (socket)).setEnabledProtocols(((SSLSocket) (socket)).getSupportedProtocols());
	//    9   16:aload_1         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #55  <Method String[] SSLSocket.getSupportedProtocols()>
	//   12   21:invokevirtual   #59  <Method void SSLSocket.setEnabledProtocols(String[])>
		((SSLSocket) (socket)).setEnabledCipherSuites(((SSLSocket) (socket)).getSupportedCipherSuites());
	//   13   24:aload_1         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #62  <Method String[] SSLSocket.getSupportedCipherSuites()>
	//   16   29:invokevirtual   #65  <Method void SSLSocket.setEnabledCipherSuites(String[])>
		return socket;
	//   17   32:aload_1         
	//   18   33:areturn         
	}

	public String[] getDefaultCipherSuites()
	{
		return ssf.getDefaultCipherSuites();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SSLSocketFactory ssf>
	//    2    4:invokevirtual   #81  <Method String[] SSLSocketFactory.getDefaultCipherSuites()>
	//    3    7:areturn         
	}

	public String[] getSupportedCipherSuites()
	{
		return ssf.getSupportedCipherSuites();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SSLSocketFactory ssf>
	//    2    4:invokevirtual   #82  <Method String[] SSLSocketFactory.getSupportedCipherSuites()>
	//    3    7:areturn         
	}

	private SSLContext sc;
	private SSLSocketFactory ssf;
}
