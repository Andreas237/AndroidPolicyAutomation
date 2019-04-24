// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			SystemKeyStore

final class CertificateChainCleaner
{

	private CertificateChainCleaner()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static X509Certificate[] getCleanChain(X509Certificate ax509certificate[], SystemKeyStore systemkeystore)
		throws CertificateException
	{
		LinkedList linkedlist = new LinkedList();
	//    0    0:new             #15  <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void LinkedList()>
	//    3    7:astore          5
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		if(systemkeystore.isTrustRoot(ax509certificate[0]))
	//*   6   11:aload_1         
	//*   7   12:aload_0         
	//*   8   13:iconst_0        
	//*   9   14:aaload          
	//*  10   15:invokevirtual   #22  <Method boolean SystemKeyStore.isTrustRoot(X509Certificate)>
	//*  11   18:ifeq            23
			flag = true;
	//   12   21:iconst_1        
	//   13   22:istore_2        
		linkedlist.add(((Object) (ax509certificate[0])));
	//   14   23:aload           5
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:aaload          
	//   18   28:invokevirtual   #26  <Method boolean LinkedList.add(Object)>
	//   19   31:pop             
		int i = 1;
	//   20   32:iconst_1        
	//   21   33:istore          4
		boolean flag1;
		do
		{
			flag1 = flag;
	//   22   35:iload_2         
	//   23   36:istore_3        
			if(i >= ax509certificate.length)
				break;
	//   24   37:iload           4
	//   25   39:aload_0         
	//   26   40:arraylength     
	//   27   41:icmpge          94
			if(systemkeystore.isTrustRoot(ax509certificate[i]))
	//*  28   44:aload_1         
	//*  29   45:aload_0         
	//*  30   46:iload           4
	//*  31   48:aaload          
	//*  32   49:invokevirtual   #22  <Method boolean SystemKeyStore.isTrustRoot(X509Certificate)>
	//*  33   52:ifeq            57
				flag = true;
	//   34   55:iconst_1        
	//   35   56:istore_2        
			flag1 = flag;
	//   36   57:iload_2         
	//   37   58:istore_3        
			if(!isValidLink(ax509certificate[i], ax509certificate[i - 1]))
				break;
	//   38   59:aload_0         
	//   39   60:iload           4
	//   40   62:aaload          
	//   41   63:aload_0         
	//   42   64:iload           4
	//   43   66:iconst_1        
	//   44   67:isub            
	//   45   68:aaload          
	//   46   69:invokestatic    #30  <Method boolean isValidLink(X509Certificate, X509Certificate)>
	//   47   72:ifeq            94
			linkedlist.add(((Object) (ax509certificate[i])));
	//   48   75:aload           5
	//   49   77:aload_0         
	//   50   78:iload           4
	//   51   80:aaload          
	//   52   81:invokevirtual   #26  <Method boolean LinkedList.add(Object)>
	//   53   84:pop             
			i++;
	//   54   85:iload           4
	//   55   87:iconst_1        
	//   56   88:iadd            
	//   57   89:istore          4
		} while(true);
	//   58   91:goto            35
		ax509certificate = ((X509Certificate []) (systemkeystore.getTrustRootFor(ax509certificate[i - 1])));
	//   59   94:aload_1         
	//   60   95:aload_0         
	//   61   96:iload           4
	//   62   98:iconst_1        
	//   63   99:isub            
	//   64  100:aaload          
	//   65  101:invokevirtual   #34  <Method X509Certificate SystemKeyStore.getTrustRootFor(X509Certificate)>
	//   66  104:astore_0        
		if(ax509certificate != null)
	//*  67  105:aload_0         
	//*  68  106:ifnull          118
		{
			linkedlist.add(((Object) (ax509certificate)));
	//   69  109:aload           5
	//   70  111:aload_0         
	//   71  112:invokevirtual   #26  <Method boolean LinkedList.add(Object)>
	//   72  115:pop             
			flag1 = true;
	//   73  116:iconst_1        
	//   74  117:istore_3        
		}
		if(flag1)
	//*  75  118:iload_3         
	//*  76  119:ifeq            139
			return (X509Certificate[])linkedlist.toArray(((Object []) (new X509Certificate[linkedlist.size()])));
	//   77  122:aload           5
	//   78  124:aload           5
	//   79  126:invokevirtual   #38  <Method int LinkedList.size()>
	//   80  129:anewarray       X509Certificate[]
	//   81  132:invokevirtual   #44  <Method Object[] LinkedList.toArray(Object[])>
	//   82  135:checkcast       #46  <Class X509Certificate[]>
	//   83  138:areturn         
		else
			throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
	//   84  139:new             #13  <Class CertificateException>
	//   85  142:dup             
	//   86  143:ldc1            #48  <String "Didn't find a trust anchor in chain cleanup!">
	//   87  145:invokespecial   #51  <Method void CertificateException(String)>
	//   88  148:athrow          
	}

	private static boolean isValidLink(X509Certificate x509certificate, X509Certificate x509certificate1)
	{
		if(!x509certificate.getSubjectX500Principal().equals(((Object) (x509certificate1.getIssuerX500Principal()))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #58  <Method X500Principal X509Certificate.getSubjectX500Principal()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #61  <Method X500Principal X509Certificate.getIssuerX500Principal()>
	//*   4    8:invokevirtual   #66  <Method boolean X500Principal.equals(Object)>
	//*   5   11:ifne            16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		try
		{
			x509certificate1.verify(x509certificate.getPublicKey());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #70  <Method java.security.PublicKey X509Certificate.getPublicKey()>
	//   11   21:invokevirtual   #74  <Method void X509Certificate.verify(java.security.PublicKey)>
		}
	//*  12   24:iconst_1        
	//*  13   25:ireturn         
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*  14   26:astore_0        
		{
			return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		}
		return true;
	}
}
