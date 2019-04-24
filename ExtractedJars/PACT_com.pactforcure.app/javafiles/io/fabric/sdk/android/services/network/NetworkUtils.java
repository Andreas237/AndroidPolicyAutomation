// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			PinningTrustManager, SystemKeyStore, PinningInfoProvider

public final class NetworkUtils
{

	private NetworkUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static final SSLSocketFactory getSSLSocketFactory(PinningInfoProvider pinninginfoprovider)
		throws KeyManagementException, NoSuchAlgorithmException
	{
		SSLContext sslcontext = SSLContext.getInstance("TLS");
	//    0    0:ldc1            #17  <String "TLS">
	//    1    2:invokestatic    #23  <Method SSLContext SSLContext.getInstance(String)>
	//    2    5:astore_1        
		sslcontext.init(((javax.net.ssl.KeyManager []) (null)), new TrustManager[] {
			new PinningTrustManager(new SystemKeyStore(pinninginfoprovider.getKeyStoreStream(), pinninginfoprovider.getKeyStorePassword()), pinninginfoprovider)
		}, ((java.security.SecureRandom) (null)));
	//    3    6:aload_1         
	//    4    7:aconst_null     
	//    5    8:iconst_1        
	//    6    9:anewarray       TrustManager[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:new             #27  <Class PinningTrustManager>
	//   10   17:dup             
	//   11   18:new             #29  <Class SystemKeyStore>
	//   12   21:dup             
	//   13   22:aload_0         
	//   14   23:invokeinterface #35  <Method java.io.InputStream PinningInfoProvider.getKeyStoreStream()>
	//   15   28:aload_0         
	//   16   29:invokeinterface #39  <Method String PinningInfoProvider.getKeyStorePassword()>
	//   17   34:invokespecial   #42  <Method void SystemKeyStore(java.io.InputStream, String)>
	//   18   37:aload_0         
	//   19   38:invokespecial   #45  <Method void PinningTrustManager(SystemKeyStore, PinningInfoProvider)>
	//   20   41:aastore         
	//   21   42:aconst_null     
	//   22   43:invokevirtual   #49  <Method void SSLContext.init(javax.net.ssl.KeyManager[], TrustManager[], java.security.SecureRandom)>
		return sslcontext.getSocketFactory();
	//   23   46:aload_1         
	//   24   47:invokevirtual   #53  <Method SSLSocketFactory SSLContext.getSocketFactory()>
	//   25   50:areturn         
	}
}
