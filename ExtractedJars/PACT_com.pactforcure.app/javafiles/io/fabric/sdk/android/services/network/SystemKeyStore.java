// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.*;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;
import javax.security.auth.x500.X500Principal;

class SystemKeyStore
{

	public SystemKeyStore(InputStream inputstream, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		inputstream = ((InputStream) (getTrustStore(inputstream, s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method KeyStore getTrustStore(InputStream, String)>
	//    6   10:astore_1        
		trustRoots = initializeTrustedRoots(((KeyStore) (inputstream)));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #22  <Method HashMap initializeTrustedRoots(KeyStore)>
	//   11   17:putfield        #24  <Field HashMap trustRoots>
		trustStore = ((KeyStore) (inputstream));
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #26  <Field KeyStore trustStore>
	//   15   25:return          
	}

	private KeyStore getTrustStore(InputStream inputstream, String s)
	{
		KeyStore keystore;
		try
		{
			keystore = KeyStore.getInstance("BKS");
	//    0    0:ldc1            #37  <String "BKS">
	//    1    2:invokestatic    #43  <Method KeyStore KeyStore.getInstance(String)>
	//    2    5:astore_3        
			inputstream = ((InputStream) (new BufferedInputStream(inputstream)));
	//    3    6:new             #45  <Class BufferedInputStream>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:invokespecial   #48  <Method void BufferedInputStream(InputStream)>
	//    7   14:astore_1        
		}
	//*   8   15:aload_3         
	//*   9   16:aload_1         
	//*  10   17:aload_2         
	//*  11   18:invokevirtual   #54  <Method char[] String.toCharArray()>
	//*  12   21:invokevirtual   #58  <Method void KeyStore.load(InputStream, char[])>
	//*  13   24:aload_1         
	//*  14   25:invokevirtual   #61  <Method void BufferedInputStream.close()>
	//*  15   28:aload_3         
	//*  16   29:areturn         
	//*  17   30:astore_2        
	//*  18   31:aload_1         
	//*  19   32:invokevirtual   #61  <Method void BufferedInputStream.close()>
	//*  20   35:aload_2         
	//*  21   36:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  22   37:astore_1        
		{
			throw new AssertionError(((Object) (inputstream)));
	//   23   38:new             #63  <Class AssertionError>
	//   24   41:dup             
	//   25   42:aload_1         
	//   26   43:invokespecial   #66  <Method void AssertionError(Object)>
	//   27   46:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  28   47:astore_1        
		{
			throw new AssertionError(((Object) (inputstream)));
	//   29   48:new             #63  <Class AssertionError>
	//   30   51:dup             
	//   31   52:aload_1         
	//   32   53:invokespecial   #66  <Method void AssertionError(Object)>
	//   33   56:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  34   57:astore_1        
		{
			throw new AssertionError(((Object) (inputstream)));
	//   35   58:new             #63  <Class AssertionError>
	//   36   61:dup             
	//   37   62:aload_1         
	//   38   63:invokespecial   #66  <Method void AssertionError(Object)>
	//   39   66:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  40   67:astore_1        
		{
			throw new AssertionError(((Object) (inputstream)));
	//   41   68:new             #63  <Class AssertionError>
	//   42   71:dup             
	//   43   72:aload_1         
	//   44   73:invokespecial   #66  <Method void AssertionError(Object)>
	//   45   76:athrow          
		}
		keystore.load(inputstream, s.toCharArray());
		((BufferedInputStream) (inputstream)).close();
		return keystore;
		s;
		((BufferedInputStream) (inputstream)).close();
		throw s;
	}

	private HashMap initializeTrustedRoots(KeyStore keystore)
	{
		HashMap hashmap;
		Enumeration enumeration;
		hashmap = new HashMap();
	//    0    0:new             #68  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void HashMap()>
	//    3    7:astore_2        
		enumeration = keystore.aliases();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #73  <Method Enumeration KeyStore.aliases()>
	//    6   12:astore_3        
_L1:
		X509Certificate x509certificate;
		if(!enumeration.hasMoreElements())
			break MISSING_BLOCK_LABEL_70;
	//    7   13:aload_3         
	//    8   14:invokeinterface #79  <Method boolean Enumeration.hasMoreElements()>
	//    9   19:ifeq            70
		x509certificate = (X509Certificate)keystore.getCertificate((String)enumeration.nextElement());
	//   10   22:aload_1         
	//   11   23:aload_3         
	//   12   24:invokeinterface #83  <Method Object Enumeration.nextElement()>
	//   13   29:checkcast       #50  <Class String>
	//   14   32:invokevirtual   #87  <Method java.security.cert.Certificate KeyStore.getCertificate(String)>
	//   15   35:checkcast       #89  <Class X509Certificate>
	//   16   38:astore          4
		if(x509certificate != null)
	//*  17   40:aload           4
	//*  18   42:ifnull          13
			try
			{
				hashmap.put(((Object) (x509certificate.getSubjectX500Principal())), ((Object) (x509certificate)));
	//   19   45:aload_2         
	//   20   46:aload           4
	//   21   48:invokevirtual   #93  <Method X500Principal X509Certificate.getSubjectX500Principal()>
	//   22   51:aload           4
	//   23   53:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
	//   24   56:pop             
			}
	//*  25   57:goto            13
			// Misplaced declaration of an exception variable
			catch(KeyStore keystore)
	//*  26   60:astore_1        
			{
				throw new AssertionError(((Object) (keystore)));
	//   27   61:new             #63  <Class AssertionError>
	//   28   64:dup             
	//   29   65:aload_1         
	//   30   66:invokespecial   #66  <Method void AssertionError(Object)>
	//   31   69:athrow          
			}
		  goto _L1
		return hashmap;
	//   32   70:aload_2         
	//   33   71:areturn         
	}

	public X509Certificate getTrustRootFor(X509Certificate x509certificate)
	{
		X509Certificate x509certificate1 = (X509Certificate)trustRoots.get(((Object) (x509certificate.getIssuerX500Principal())));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field HashMap trustRoots>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method X500Principal X509Certificate.getIssuerX500Principal()>
	//    4    8:invokevirtual   #110 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #89  <Class X509Certificate>
	//    6   14:astore_2        
		if(x509certificate1 == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       21
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		if(x509certificate1.getSubjectX500Principal().equals(((Object) (x509certificate.getSubjectX500Principal()))))
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #93  <Method X500Principal X509Certificate.getSubjectX500Principal()>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #93  <Method X500Principal X509Certificate.getSubjectX500Principal()>
	//*  15   29:invokevirtual   #116 <Method boolean X500Principal.equals(Object)>
	//*  16   32:ifeq            37
			return null;
	//   17   35:aconst_null     
	//   18   36:areturn         
		try
		{
			x509certificate.verify(x509certificate1.getPublicKey());
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokevirtual   #120 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   22   42:invokevirtual   #124 <Method void X509Certificate.verify(java.security.PublicKey)>
		}
	//*  23   45:aload_2         
	//*  24   46:areturn         
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*  25   47:astore_1        
		{
			return null;
	//   26   48:aconst_null     
	//   27   49:areturn         
		}
		return x509certificate1;
	}

	public boolean isTrustRoot(X509Certificate x509certificate)
	{
		X509Certificate x509certificate1 = (X509Certificate)trustRoots.get(((Object) (x509certificate.getSubjectX500Principal())));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field HashMap trustRoots>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #93  <Method X500Principal X509Certificate.getSubjectX500Principal()>
	//    4    8:invokevirtual   #110 <Method Object HashMap.get(Object)>
	//    5   11:checkcast       #89  <Class X509Certificate>
	//    6   14:astore_2        
		return x509certificate1 != null && ((Object) (x509certificate1.getPublicKey())).equals(((Object) (x509certificate.getPublicKey())));
	//    7   15:aload_2         
	//    8   16:ifnull          35
	//    9   19:aload_2         
	//   10   20:invokevirtual   #120 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #120 <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   13   27:invokevirtual   #127 <Method boolean Object.equals(Object)>
	//   14   30:ifeq            35
	//   15   33:iconst_1        
	//   16   34:ireturn         
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	private final HashMap trustRoots;
	final KeyStore trustStore;
}
