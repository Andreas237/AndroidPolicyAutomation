// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import javax.net.ssl.SSLSocket;

// Referenced classes of package ch.qos.logback.core.net.ssl:
//			SSLConfigurable

public class SSLConfigurableSocket
	implements SSLConfigurable
{

	public SSLConfigurableSocket(SSLSocket sslsocket)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_flddelegate = sslsocket;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SSLSocket _flddelegate>
	//    5    9:return          
	}

	public String[] getDefaultCipherSuites()
	{
		return _flddelegate.getEnabledCipherSuites();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SSLSocket _flddelegate>
	//    2    4:invokevirtual   #23  <Method String[] SSLSocket.getEnabledCipherSuites()>
	//    3    7:areturn         
	}

	public String[] getDefaultProtocols()
	{
		return _flddelegate.getEnabledProtocols();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SSLSocket _flddelegate>
	//    2    4:invokevirtual   #27  <Method String[] SSLSocket.getEnabledProtocols()>
	//    3    7:areturn         
	}

	public String[] getSupportedCipherSuites()
	{
		return _flddelegate.getSupportedCipherSuites();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SSLSocket _flddelegate>
	//    2    4:invokevirtual   #30  <Method String[] SSLSocket.getSupportedCipherSuites()>
	//    3    7:areturn         
	}

	public String[] getSupportedProtocols()
	{
		return _flddelegate.getSupportedProtocols();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SSLSocket _flddelegate>
	//    2    4:invokevirtual   #33  <Method String[] SSLSocket.getSupportedProtocols()>
	//    3    7:areturn         
	}

	public void setEnabledCipherSuites(String as[])
	{
		_flddelegate.setEnabledCipherSuites(as);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SSLSocket _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method void SSLSocket.setEnabledCipherSuites(String[])>
	//    4    8:return          
	}

	public void setEnabledProtocols(String as[])
	{
		_flddelegate.setEnabledProtocols(as);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SSLSocket _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method void SSLSocket.setEnabledProtocols(String[])>
	//    4    8:return          
	}

	public void setNeedClientAuth(boolean flag)
	{
		_flddelegate.setNeedClientAuth(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SSLSocket _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #44  <Method void SSLSocket.setNeedClientAuth(boolean)>
	//    4    8:return          
	}

	public void setWantClientAuth(boolean flag)
	{
		_flddelegate.setWantClientAuth(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SSLSocket _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #47  <Method void SSLSocket.setWantClientAuth(boolean)>
	//    4    8:return          
	}

	private final SSLSocket _flddelegate;
}
