// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.*;
import javax.net.ssl.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			PinningInfoProvider, CertificateChainCleaner, SystemKeyStore

class PinningTrustManager
	implements X509TrustManager
{

	public PinningTrustManager(SystemKeyStore systemkeystore, PinningInfoProvider pinninginfoprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #36  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void LinkedList()>
	//    6   12:putfield        #39  <Field List pins>
	//    7   15:aload_0         
	//    8   16:new             #41  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #42  <Method void HashSet()>
	//   11   23:invokestatic    #48  <Method Set Collections.synchronizedSet(Set)>
	//   12   26:putfield        #50  <Field Set cache>
		systemTrustManagers = initializeSystemTrustManagers(systemkeystore);
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #54  <Method TrustManager[] initializeSystemTrustManagers(SystemKeyStore)>
	//   17   35:putfield        #56  <Field TrustManager[] systemTrustManagers>
		systemKeyStore = systemkeystore;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:putfield        #58  <Field SystemKeyStore systemKeyStore>
		pinCreationTimeMillis = pinninginfoprovider.getPinCreationTimeInMillis();
	//   21   43:aload_0         
	//   22   44:aload_2         
	//   23   45:invokeinterface #64  <Method long PinningInfoProvider.getPinCreationTimeInMillis()>
	//   24   50:putfield        #66  <Field long pinCreationTimeMillis>
		systemkeystore = ((SystemKeyStore) (pinninginfoprovider.getPins()));
	//   25   53:aload_2         
	//   26   54:invokeinterface #70  <Method String[] PinningInfoProvider.getPins()>
	//   27   59:astore_1        
		int j = systemkeystore.length;
	//   28   60:aload_1         
	//   29   61:arraylength     
	//   30   62:istore          4
		for(int i = 0; i < j; i++)
	//*  31   64:iconst_0        
	//*  32   65:istore_3        
	//*  33   66:iload_3         
	//*  34   67:iload           4
	//*  35   69:icmpge          98
		{
			pinninginfoprovider = ((PinningInfoProvider) (systemkeystore[i]));
	//   36   72:aload_1         
	//   37   73:iload_3         
	//   38   74:aaload          
	//   39   75:astore_2        
			pins.add(((Object) (hexStringToByteArray(((String) (pinninginfoprovider))))));
	//   40   76:aload_0         
	//   41   77:getfield        #39  <Field List pins>
	//   42   80:aload_0         
	//   43   81:aload_2         
	//   44   82:invokespecial   #74  <Method byte[] hexStringToByteArray(String)>
	//   45   85:invokeinterface #80  <Method boolean List.add(Object)>
	//   46   90:pop             
		}

	//   47   91:iload_3         
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore_3        
	//*  51   95:goto            66
	//   52   98:return          
	}

	private void checkPinTrust(X509Certificate ax509certificate[])
		throws CertificateException
	{
		if(pinCreationTimeMillis == -1L || System.currentTimeMillis() - pinCreationTimeMillis <= 0x9ef8b000L) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field long pinCreationTimeMillis>
	//    2    4:ldc2w           #85  <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifeq            84
	//    5   11:invokestatic    #91  <Method long System.currentTimeMillis()>
	//    6   14:aload_0         
	//    7   15:getfield        #66  <Field long pinCreationTimeMillis>
	//    8   18:lsub            
	//    9   19:ldc2w           #11  <Long 0x9ef8b000L>
	//   10   22:lcmp            
	//   11   23:ifle            84
_L1:
		Fabric.getLogger().w("Fabric", (new StringBuilder()).append("Certificate pins are stale, (").append(System.currentTimeMillis() - pinCreationTimeMillis).append(" millis vs ").append(0x9ef8b000L).append(" millis) ").append("falling back to system trust.").toString());
	//   12   26:invokestatic    #97  <Method Logger Fabric.getLogger()>
	//   13   29:ldc1            #99  <String "Fabric">
	//   14   31:new             #101 <Class StringBuilder>
	//   15   34:dup             
	//   16   35:invokespecial   #102 <Method void StringBuilder()>
	//   17   38:ldc1            #104 <String "Certificate pins are stale, (">
	//   18   40:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:invokestatic    #91  <Method long System.currentTimeMillis()>
	//   20   46:aload_0         
	//   21   47:getfield        #66  <Field long pinCreationTimeMillis>
	//   22   50:lsub            
	//   23   51:invokevirtual   #111 <Method StringBuilder StringBuilder.append(long)>
	//   24   54:ldc1            #113 <String " millis vs ">
	//   25   56:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   26   59:ldc2w           #11  <Long 0x9ef8b000L>
	//   27   62:invokevirtual   #111 <Method StringBuilder StringBuilder.append(long)>
	//   28   65:ldc1            #115 <String " millis) ">
	//   29   67:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   30   70:ldc1            #117 <String "falling back to system trust.">
	//   31   72:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   32   75:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   33   78:invokeinterface #127 <Method void Logger.w(String, String)>
_L4:
		return;
	//   34   83:return          
_L2:
		ax509certificate = CertificateChainCleaner.getCleanChain(ax509certificate, systemKeyStore);
	//   35   84:aload_1         
	//   36   85:aload_0         
	//   37   86:getfield        #58  <Field SystemKeyStore systemKeyStore>
	//   38   89:invokestatic    #133 <Method X509Certificate[] CertificateChainCleaner.getCleanChain(X509Certificate[], SystemKeyStore)>
	//   39   92:astore_1        
		int j = ax509certificate.length;
	//   40   93:aload_1         
	//   41   94:arraylength     
	//   42   95:istore_3        
		int i = 0;
	//   43   96:iconst_0        
	//   44   97:istore_2        
label0:
		do
		{
label1:
			{
				if(i >= j)
					break label1;
	//   45   98:iload_2         
	//   46   99:iload_3         
	//   47  100:icmpge          120
				if(isValidPin(ax509certificate[i]))
					break label0;
	//   48  103:aload_0         
	//   49  104:aload_1         
	//   50  105:iload_2         
	//   51  106:aaload          
	//   52  107:invokespecial   #137 <Method boolean isValidPin(X509Certificate)>
	//   53  110:ifne            83
				i++;
	//   54  113:iload_2         
	//   55  114:iconst_1        
	//   56  115:iadd            
	//   57  116:istore_2        
			}
		} while(true);
	//   58  117:goto            98
		if(true) goto _L4; else goto _L3
_L3:
		throw new CertificateException("No valid pins found in chain!");
	//   59  120:new             #84  <Class CertificateException>
	//   60  123:dup             
	//   61  124:ldc1            #139 <String "No valid pins found in chain!">
	//   62  126:invokespecial   #142 <Method void CertificateException(String)>
	//   63  129:athrow          
	}

	private void checkSystemTrust(X509Certificate ax509certificate[], String s)
		throws CertificateException
	{
		TrustManager atrustmanager[] = systemTrustManagers;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field TrustManager[] systemTrustManagers>
	//    2    4:astore          5
		int j = atrustmanager.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore          4
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          40
			((X509TrustManager)atrustmanager[i]).checkServerTrusted(ax509certificate, s);
	//   11   19:aload           5
	//   12   21:iload_3         
	//   13   22:aaload          
	//   14   23:checkcast       #6   <Class X509TrustManager>
	//   15   26:aload_1         
	//   16   27:aload_2         
	//   17   28:invokeinterface #148 <Method void X509TrustManager.checkServerTrusted(X509Certificate[], String)>

	//   18   33:iload_3         
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:istore_3        
	//*  22   37:goto            13
	//   23   40:return          
	}

	private byte[] hexStringToByteArray(String s)
	{
		int j = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #154 <Method int String.length()>
	//    2    4:istore_3        
		byte abyte0[] = new byte[j / 2];
	//    3    5:iload_3         
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:newarray        byte[]
	//    7   10:astore          4
		for(int i = 0; i < j; i += 2)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_2         
	//*  11   15:iload_3         
	//*  12   16:icmpge          58
			abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
	//   13   19:aload           4
	//   14   21:iload_2         
	//   15   22:iconst_2        
	//   16   23:idiv            
	//   17   24:aload_1         
	//   18   25:iload_2         
	//   19   26:invokevirtual   #158 <Method char String.charAt(int)>
	//   20   29:bipush          16
	//   21   31:invokestatic    #164 <Method int Character.digit(char, int)>
	//   22   34:iconst_4        
	//   23   35:ishl            
	//   24   36:aload_1         
	//   25   37:iload_2         
	//   26   38:iconst_1        
	//   27   39:iadd            
	//   28   40:invokevirtual   #158 <Method char String.charAt(int)>
	//   29   43:bipush          16
	//   30   45:invokestatic    #164 <Method int Character.digit(char, int)>
	//   31   48:iadd            
	//   32   49:int2byte        
	//   33   50:bastore         

	//   34   51:iload_2         
	//   35   52:iconst_2        
	//   36   53:iadd            
	//   37   54:istore_2        
	//*  38   55:goto            14
		return abyte0;
	//   39   58:aload           4
	//   40   60:areturn         
	}

	private TrustManager[] initializeSystemTrustManagers(SystemKeyStore systemkeystore)
	{
		try
		{
			TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance("X509");
	//    0    0:ldc1            #170 <String "X509">
	//    1    2:invokestatic    #176 <Method TrustManagerFactory TrustManagerFactory.getInstance(String)>
	//    2    5:astore_2        
			trustmanagerfactory.init(systemkeystore.trustStore);
	//    3    6:aload_2         
	//    4    7:aload_1         
	//    5    8:getfield        #182 <Field java.security.KeyStore SystemKeyStore.trustStore>
	//    6   11:invokevirtual   #186 <Method void TrustManagerFactory.init(java.security.KeyStore)>
			systemkeystore = ((SystemKeyStore) (trustmanagerfactory.getTrustManagers()));
	//    7   14:aload_2         
	//    8   15:invokevirtual   #190 <Method TrustManager[] TrustManagerFactory.getTrustManagers()>
	//    9   18:astore_1        
		}
	//*  10   19:aload_1         
	//*  11   20:areturn         
		// Misplaced declaration of an exception variable
		catch(SystemKeyStore systemkeystore)
	//*  12   21:astore_1        
		{
			throw new AssertionError(((Object) (systemkeystore)));
	//   13   22:new             #192 <Class AssertionError>
	//   14   25:dup             
	//   15   26:aload_1         
	//   16   27:invokespecial   #195 <Method void AssertionError(Object)>
	//   17   30:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(SystemKeyStore systemkeystore)
	//*  18   31:astore_1        
		{
			throw new AssertionError(((Object) (systemkeystore)));
	//   19   32:new             #192 <Class AssertionError>
	//   20   35:dup             
	//   21   36:aload_1         
	//   22   37:invokespecial   #195 <Method void AssertionError(Object)>
	//   23   40:athrow          
		}
		return ((TrustManager []) (systemkeystore));
	}

	private boolean isValidPin(X509Certificate x509certificate)
		throws CertificateException
	{
		Iterator iterator;
		x509certificate = ((X509Certificate) (MessageDigest.getInstance("SHA1").digest(x509certificate.getPublicKey().getEncoded())));
	//    0    0:ldc1            #197 <String "SHA1">
	//    1    2:invokestatic    #202 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:aload_1         
	//    3    6:invokevirtual   #206 <Method PublicKey X509Certificate.getPublicKey()>
	//    4    9:invokeinterface #212 <Method byte[] PublicKey.getEncoded()>
	//    5   14:invokevirtual   #216 <Method byte[] MessageDigest.digest(byte[])>
	//    6   17:astore_1        
		iterator = pins.iterator();
	//    7   18:aload_0         
	//    8   19:getfield        #39  <Field List pins>
	//    9   22:invokeinterface #220 <Method Iterator List.iterator()>
	//   10   27:astore_3        
_L1:
		boolean flag;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_57;
	//   11   28:aload_3         
	//   12   29:invokeinterface #226 <Method boolean Iterator.hasNext()>
	//   13   34:ifeq            57
		flag = Arrays.equals((byte[])iterator.next(), ((byte []) (x509certificate)));
	//   14   37:aload_3         
	//   15   38:invokeinterface #230 <Method Object Iterator.next()>
	//   16   43:checkcast       #232 <Class byte[]>
	//   17   46:aload_1         
	//   18   47:invokestatic    #238 <Method boolean Arrays.equals(byte[], byte[])>
	//   19   50:istore_2        
		if(flag)
	//*  20   51:iload_2         
	//*  21   52:ifeq            28
			return true;
	//   22   55:iconst_1        
	//   23   56:ireturn         
		  goto _L1
		return false;
	//   24   57:iconst_0        
	//   25   58:ireturn         
		x509certificate;
	//   26   59:astore_1        
		throw new CertificateException(((Throwable) (x509certificate)));
	//   27   60:new             #84  <Class CertificateException>
	//   28   63:dup             
	//   29   64:aload_1         
	//   30   65:invokespecial   #241 <Method void CertificateException(Throwable)>
	//   31   68:athrow          
	}

	public void checkClientTrusted(X509Certificate ax509certificate[], String s)
		throws CertificateException
	{
		throw new CertificateException("Client certificates not supported!");
	//    0    0:new             #84  <Class CertificateException>
	//    1    3:dup             
	//    2    4:ldc1            #244 <String "Client certificates not supported!">
	//    3    6:invokespecial   #142 <Method void CertificateException(String)>
	//    4    9:athrow          
	}

	public void checkServerTrusted(X509Certificate ax509certificate[], String s)
		throws CertificateException
	{
		if(cache.contains(((Object) (ax509certificate[0]))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Set cache>
	//*   2    4:aload_1         
	//*   3    5:iconst_0        
	//*   4    6:aaload          
	//*   5    7:invokeinterface #249 <Method boolean Set.contains(Object)>
	//*   6   12:ifeq            16
		{
			return;
	//    7   15:return          
		} else
		{
			checkSystemTrust(ax509certificate, s);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokespecial   #251 <Method void checkSystemTrust(X509Certificate[], String)>
			checkPinTrust(ax509certificate);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #253 <Method void checkPinTrust(X509Certificate[])>
			cache.add(((Object) (ax509certificate[0])));
	//   15   27:aload_0         
	//   16   28:getfield        #50  <Field Set cache>
	//   17   31:aload_1         
	//   18   32:iconst_0        
	//   19   33:aaload          
	//   20   34:invokeinterface #254 <Method boolean Set.add(Object)>
	//   21   39:pop             
			return;
	//   22   40:return          
		}
	}

	public X509Certificate[] getAcceptedIssuers()
	{
		return NO_ISSUERS;
	//    0    0:getstatic       #29  <Field X509Certificate[] NO_ISSUERS>
	//    1    3:areturn         
	}

	private static final X509Certificate NO_ISSUERS[] = new X509Certificate[0];
	private static final long PIN_FRESHNESS_DURATION_MILLIS = 0x9ef8b000L;
	private final Set cache = Collections.synchronizedSet(((Set) (new HashSet())));
	private final long pinCreationTimeMillis;
	private final List pins = new LinkedList();
	private final SystemKeyStore systemKeyStore;
	private final TrustManager systemTrustManagers[];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       X509Certificate[]
	//    2    4:putstatic       #29  <Field X509Certificate[] NO_ISSUERS>
	//*   3    7:return          
	}
}
