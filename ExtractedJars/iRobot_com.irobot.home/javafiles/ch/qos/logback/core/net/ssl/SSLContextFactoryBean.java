// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAware;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.*;

// Referenced classes of package ch.qos.logback.core.net.ssl:
//			KeyStoreFactoryBean, KeyManagerFactoryFactoryBean, SecureRandomFactoryBean, TrustManagerFactoryFactoryBean

public class SSLContextFactoryBean
{

	public SSLContextFactoryBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	private KeyManager[] createKeyManagers(ContextAware contextaware)
	{
		if(getKeyStore() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #33  <Method KeyStoreFactoryBean getKeyStore()>
	//*   2    4:ifnonnull       9
		{
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		} else
		{
			KeyStore keystore = getKeyStore().createKeyStore();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #33  <Method KeyStoreFactoryBean getKeyStore()>
	//    7   13:invokevirtual   #39  <Method KeyStore KeyStoreFactoryBean.createKeyStore()>
	//    8   16:astore_2        
			Object obj = ((Object) (new StringBuilder()));
	//    9   17:new             #41  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #42  <Method void StringBuilder()>
	//   12   24:astore_3        
			((StringBuilder) (obj)).append("key store of type '");
	//   13   25:aload_3         
	//   14   26:ldc1            #44  <String "key store of type '">
	//   15   28:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			((StringBuilder) (obj)).append(keystore.getType());
	//   17   32:aload_3         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #54  <Method String KeyStore.getType()>
	//   20   37:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			((StringBuilder) (obj)).append("' provider '");
	//   22   41:aload_3         
	//   23   42:ldc1            #56  <String "' provider '">
	//   24   44:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			((StringBuilder) (obj)).append(((Object) (keystore.getProvider())));
	//   26   48:aload_3         
	//   27   49:aload_2         
	//   28   50:invokevirtual   #60  <Method java.security.Provider KeyStore.getProvider()>
	//   29   53:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   30   56:pop             
			((StringBuilder) (obj)).append("': ");
	//   31   57:aload_3         
	//   32   58:ldc1            #65  <String "': ">
	//   33   60:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
			((StringBuilder) (obj)).append(getKeyStore().getLocation());
	//   35   64:aload_3         
	//   36   65:aload_0         
	//   37   66:invokevirtual   #33  <Method KeyStoreFactoryBean getKeyStore()>
	//   38   69:invokevirtual   #68  <Method String KeyStoreFactoryBean.getLocation()>
	//   39   72:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
			contextaware.addInfo(((StringBuilder) (obj)).toString());
	//   41   76:aload_1         
	//   42   77:aload_3         
	//   43   78:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   44   81:invokeinterface #77  <Method void ContextAware.addInfo(String)>
			obj = ((Object) (getKeyManagerFactory().createKeyManagerFactory()));
	//   45   86:aload_0         
	//   46   87:invokevirtual   #81  <Method KeyManagerFactoryFactoryBean getKeyManagerFactory()>
	//   47   90:invokevirtual   #87  <Method KeyManagerFactory KeyManagerFactoryFactoryBean.createKeyManagerFactory()>
	//   48   93:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   49   94:new             #41  <Class StringBuilder>
	//   50   97:dup             
	//   51   98:invokespecial   #42  <Method void StringBuilder()>
	//   52  101:astore          4
			stringbuilder.append("key manager algorithm '");
	//   53  103:aload           4
	//   54  105:ldc1            #89  <String "key manager algorithm '">
	//   55  107:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   56  110:pop             
			stringbuilder.append(((KeyManagerFactory) (obj)).getAlgorithm());
	//   57  111:aload           4
	//   58  113:aload_3         
	//   59  114:invokevirtual   #94  <Method String KeyManagerFactory.getAlgorithm()>
	//   60  117:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   61  120:pop             
			stringbuilder.append("' provider '");
	//   62  121:aload           4
	//   63  123:ldc1            #56  <String "' provider '">
	//   64  125:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   65  128:pop             
			stringbuilder.append(((Object) (((KeyManagerFactory) (obj)).getProvider())));
	//   66  129:aload           4
	//   67  131:aload_3         
	//   68  132:invokevirtual   #95  <Method java.security.Provider KeyManagerFactory.getProvider()>
	//   69  135:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   70  138:pop             
			stringbuilder.append("'");
	//   71  139:aload           4
	//   72  141:ldc1            #97  <String "'">
	//   73  143:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   74  146:pop             
			contextaware.addInfo(stringbuilder.toString());
	//   75  147:aload_1         
	//   76  148:aload           4
	//   77  150:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   78  153:invokeinterface #77  <Method void ContextAware.addInfo(String)>
			((KeyManagerFactory) (obj)).init(keystore, getKeyStore().getPassword().toCharArray());
	//   79  158:aload_3         
	//   80  159:aload_2         
	//   81  160:aload_0         
	//   82  161:invokevirtual   #33  <Method KeyStoreFactoryBean getKeyStore()>
	//   83  164:invokevirtual   #100 <Method String KeyStoreFactoryBean.getPassword()>
	//   84  167:invokevirtual   #106 <Method char[] String.toCharArray()>
	//   85  170:invokevirtual   #110 <Method void KeyManagerFactory.init(KeyStore, char[])>
			return ((KeyManagerFactory) (obj)).getKeyManagers();
	//   86  173:aload_3         
	//   87  174:invokevirtual   #114 <Method KeyManager[] KeyManagerFactory.getKeyManagers()>
	//   88  177:areturn         
		}
	}

	private SecureRandom createSecureRandom(ContextAware contextaware)
	{
		SecureRandom securerandom = getSecureRandom().createSecureRandom();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method SecureRandomFactoryBean getSecureRandom()>
	//    2    4:invokevirtual   #125 <Method SecureRandom SecureRandomFactoryBean.createSecureRandom()>
	//    3    7:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #41  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #42  <Method void StringBuilder()>
	//    7   15:astore_3        
		stringbuilder.append("secure random algorithm '");
	//    8   16:aload_3         
	//    9   17:ldc1            #127 <String "secure random algorithm '">
	//   10   19:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(securerandom.getAlgorithm());
	//   12   23:aload_3         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #130 <Method String SecureRandom.getAlgorithm()>
	//   15   28:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append("' provider '");
	//   17   32:aload_3         
	//   18   33:ldc1            #56  <String "' provider '">
	//   19   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(((Object) (securerandom.getProvider())));
	//   21   39:aload_3         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #131 <Method java.security.Provider SecureRandom.getProvider()>
	//   24   44:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   25   47:pop             
		stringbuilder.append("'");
	//   26   48:aload_3         
	//   27   49:ldc1            #97  <String "'">
	//   28   51:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		contextaware.addInfo(stringbuilder.toString());
	//   30   55:aload_1         
	//   31   56:aload_3         
	//   32   57:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   33   60:invokeinterface #77  <Method void ContextAware.addInfo(String)>
		return securerandom;
	//   34   65:aload_2         
	//   35   66:areturn         
	}

	private TrustManager[] createTrustManagers(ContextAware contextaware)
	{
		if(getTrustStore() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #136 <Method KeyStoreFactoryBean getTrustStore()>
	//*   2    4:ifnonnull       9
		{
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		} else
		{
			KeyStore keystore = getTrustStore().createKeyStore();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #136 <Method KeyStoreFactoryBean getTrustStore()>
	//    7   13:invokevirtual   #39  <Method KeyStore KeyStoreFactoryBean.createKeyStore()>
	//    8   16:astore_2        
			Object obj = ((Object) (new StringBuilder()));
	//    9   17:new             #41  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #42  <Method void StringBuilder()>
	//   12   24:astore_3        
			((StringBuilder) (obj)).append("trust store of type '");
	//   13   25:aload_3         
	//   14   26:ldc1            #138 <String "trust store of type '">
	//   15   28:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			((StringBuilder) (obj)).append(keystore.getType());
	//   17   32:aload_3         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #54  <Method String KeyStore.getType()>
	//   20   37:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			((StringBuilder) (obj)).append("' provider '");
	//   22   41:aload_3         
	//   23   42:ldc1            #56  <String "' provider '">
	//   24   44:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			((StringBuilder) (obj)).append(((Object) (keystore.getProvider())));
	//   26   48:aload_3         
	//   27   49:aload_2         
	//   28   50:invokevirtual   #60  <Method java.security.Provider KeyStore.getProvider()>
	//   29   53:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   30   56:pop             
			((StringBuilder) (obj)).append("': ");
	//   31   57:aload_3         
	//   32   58:ldc1            #65  <String "': ">
	//   33   60:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
			((StringBuilder) (obj)).append(getTrustStore().getLocation());
	//   35   64:aload_3         
	//   36   65:aload_0         
	//   37   66:invokevirtual   #136 <Method KeyStoreFactoryBean getTrustStore()>
	//   38   69:invokevirtual   #68  <Method String KeyStoreFactoryBean.getLocation()>
	//   39   72:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
			contextaware.addInfo(((StringBuilder) (obj)).toString());
	//   41   76:aload_1         
	//   42   77:aload_3         
	//   43   78:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   44   81:invokeinterface #77  <Method void ContextAware.addInfo(String)>
			obj = ((Object) (getTrustManagerFactory().createTrustManagerFactory()));
	//   45   86:aload_0         
	//   46   87:invokevirtual   #142 <Method TrustManagerFactoryFactoryBean getTrustManagerFactory()>
	//   47   90:invokevirtual   #148 <Method TrustManagerFactory TrustManagerFactoryFactoryBean.createTrustManagerFactory()>
	//   48   93:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   49   94:new             #41  <Class StringBuilder>
	//   50   97:dup             
	//   51   98:invokespecial   #42  <Method void StringBuilder()>
	//   52  101:astore          4
			stringbuilder.append("trust manager algorithm '");
	//   53  103:aload           4
	//   54  105:ldc1            #150 <String "trust manager algorithm '">
	//   55  107:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   56  110:pop             
			stringbuilder.append(((TrustManagerFactory) (obj)).getAlgorithm());
	//   57  111:aload           4
	//   58  113:aload_3         
	//   59  114:invokevirtual   #153 <Method String TrustManagerFactory.getAlgorithm()>
	//   60  117:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   61  120:pop             
			stringbuilder.append("' provider '");
	//   62  121:aload           4
	//   63  123:ldc1            #56  <String "' provider '">
	//   64  125:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   65  128:pop             
			stringbuilder.append(((Object) (((TrustManagerFactory) (obj)).getProvider())));
	//   66  129:aload           4
	//   67  131:aload_3         
	//   68  132:invokevirtual   #154 <Method java.security.Provider TrustManagerFactory.getProvider()>
	//   69  135:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   70  138:pop             
			stringbuilder.append("'");
	//   71  139:aload           4
	//   72  141:ldc1            #97  <String "'">
	//   73  143:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   74  146:pop             
			contextaware.addInfo(stringbuilder.toString());
	//   75  147:aload_1         
	//   76  148:aload           4
	//   77  150:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   78  153:invokeinterface #77  <Method void ContextAware.addInfo(String)>
			((TrustManagerFactory) (obj)).init(keystore);
	//   79  158:aload_3         
	//   80  159:aload_2         
	//   81  160:invokevirtual   #157 <Method void TrustManagerFactory.init(KeyStore)>
			return ((TrustManagerFactory) (obj)).getTrustManagers();
	//   82  163:aload_3         
	//   83  164:invokevirtual   #161 <Method TrustManager[] TrustManagerFactory.getTrustManagers()>
	//   84  167:areturn         
		}
	}

	private KeyStoreFactoryBean keyStoreFromSystemProperties(String s)
	{
		if(System.getProperty(s) == null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #169 <Method String System.getProperty(String)>
	//*   2    4:ifnonnull       9
		{
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		} else
		{
			KeyStoreFactoryBean keystorefactorybean = new KeyStoreFactoryBean();
	//    5    9:new             #35  <Class KeyStoreFactoryBean>
	//    6   12:dup             
	//    7   13:invokespecial   #170 <Method void KeyStoreFactoryBean()>
	//    8   16:astore_2        
			keystorefactorybean.setLocation(locationFromSystemProperty(s));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #173 <Method String locationFromSystemProperty(String)>
	//   13   23:invokevirtual   #176 <Method void KeyStoreFactoryBean.setLocation(String)>
			StringBuilder stringbuilder = new StringBuilder();
	//   14   26:new             #41  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #42  <Method void StringBuilder()>
	//   17   33:astore_3        
			stringbuilder.append(s);
	//   18   34:aload_3         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			stringbuilder.append("Provider");
	//   22   40:aload_3         
	//   23   41:ldc1            #178 <String "Provider">
	//   24   43:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
			keystorefactorybean.setProvider(System.getProperty(stringbuilder.toString()));
	//   26   47:aload_2         
	//   27   48:aload_3         
	//   28   49:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   29   52:invokestatic    #169 <Method String System.getProperty(String)>
	//   30   55:invokevirtual   #181 <Method void KeyStoreFactoryBean.setProvider(String)>
			stringbuilder = new StringBuilder();
	//   31   58:new             #41  <Class StringBuilder>
	//   32   61:dup             
	//   33   62:invokespecial   #42  <Method void StringBuilder()>
	//   34   65:astore_3        
			stringbuilder.append(s);
	//   35   66:aload_3         
	//   36   67:aload_1         
	//   37   68:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
			stringbuilder.append("Password");
	//   39   72:aload_3         
	//   40   73:ldc1            #183 <String "Password">
	//   41   75:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			keystorefactorybean.setPassword(System.getProperty(stringbuilder.toString()));
	//   43   79:aload_2         
	//   44   80:aload_3         
	//   45   81:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   46   84:invokestatic    #169 <Method String System.getProperty(String)>
	//   47   87:invokevirtual   #186 <Method void KeyStoreFactoryBean.setPassword(String)>
			stringbuilder = new StringBuilder();
	//   48   90:new             #41  <Class StringBuilder>
	//   49   93:dup             
	//   50   94:invokespecial   #42  <Method void StringBuilder()>
	//   51   97:astore_3        
			stringbuilder.append(s);
	//   52   98:aload_3         
	//   53   99:aload_1         
	//   54  100:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   55  103:pop             
			stringbuilder.append("Type");
	//   56  104:aload_3         
	//   57  105:ldc1            #188 <String "Type">
	//   58  107:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   59  110:pop             
			keystorefactorybean.setType(System.getProperty(stringbuilder.toString()));
	//   60  111:aload_2         
	//   61  112:aload_3         
	//   62  113:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   63  116:invokestatic    #169 <Method String System.getProperty(String)>
	//   64  119:invokevirtual   #191 <Method void KeyStoreFactoryBean.setType(String)>
			return keystorefactorybean;
	//   65  122:aload_2         
	//   66  123:areturn         
		}
	}

	private String locationFromSystemProperty(String s)
	{
		String s1 = System.getProperty(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #169 <Method String System.getProperty(String)>
	//    2    4:astore_2        
		s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          48
		{
			s = s1;
	//    7   11:aload_2         
	//    8   12:astore_1        
			if(!s1.startsWith("file:"))
	//*   9   13:aload_2         
	//*  10   14:ldc1            #193 <String "file:">
	//*  11   16:invokevirtual   #197 <Method boolean String.startsWith(String)>
	//*  12   19:ifne            48
			{
				s = ((String) (new StringBuilder()));
	//   13   22:new             #41  <Class StringBuilder>
	//   14   25:dup             
	//   15   26:invokespecial   #42  <Method void StringBuilder()>
	//   16   29:astore_1        
				((StringBuilder) (s)).append("file:");
	//   17   30:aload_1         
	//   18   31:ldc1            #193 <String "file:">
	//   19   33:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
				((StringBuilder) (s)).append(s1);
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   24   42:pop             
				s = ((StringBuilder) (s)).toString();
	//   25   43:aload_1         
	//   26   44:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   27   47:astore_1        
			}
		}
		return s;
	//   28   48:aload_1         
	//   29   49:areturn         
	}

	public SSLContext createContext(ContextAware contextaware)
	{
		SSLContext sslcontext;
		if(getProvider() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #201 <Method String getProvider()>
	//*   2    4:ifnull          22
			sslcontext = SSLContext.getInstance(getProtocol(), getProvider());
	//    3    7:aload_0         
	//    4    8:invokevirtual   #204 <Method String getProtocol()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #201 <Method String getProvider()>
	//    7   15:invokestatic    #210 <Method SSLContext SSLContext.getInstance(String, String)>
	//    8   18:astore_2        
		else
	//*   9   19:goto            30
			sslcontext = SSLContext.getInstance(getProtocol());
	//   10   22:aload_0         
	//   11   23:invokevirtual   #204 <Method String getProtocol()>
	//   12   26:invokestatic    #213 <Method SSLContext SSLContext.getInstance(String)>
	//   13   29:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   14   30:new             #41  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #42  <Method void StringBuilder()>
	//   17   37:astore_3        
		stringbuilder.append("SSL protocol '");
	//   18   38:aload_3         
	//   19   39:ldc1            #215 <String "SSL protocol '">
	//   20   41:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		stringbuilder.append(sslcontext.getProtocol());
	//   22   45:aload_3         
	//   23   46:aload_2         
	//   24   47:invokevirtual   #216 <Method String SSLContext.getProtocol()>
	//   25   50:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
		stringbuilder.append("' provider '");
	//   27   54:aload_3         
	//   28   55:ldc1            #56  <String "' provider '">
	//   29   57:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
		stringbuilder.append(((Object) (sslcontext.getProvider())));
	//   31   61:aload_3         
	//   32   62:aload_2         
	//   33   63:invokevirtual   #217 <Method java.security.Provider SSLContext.getProvider()>
	//   34   66:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   35   69:pop             
		stringbuilder.append("'");
	//   36   70:aload_3         
	//   37   71:ldc1            #97  <String "'">
	//   38   73:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
		contextaware.addInfo(stringbuilder.toString());
	//   40   77:aload_1         
	//   41   78:aload_3         
	//   42   79:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   43   82:invokeinterface #77  <Method void ContextAware.addInfo(String)>
		sslcontext.init(createKeyManagers(contextaware), createTrustManagers(contextaware), createSecureRandom(contextaware));
	//   44   87:aload_2         
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:invokespecial   #219 <Method KeyManager[] createKeyManagers(ContextAware)>
	//   48   93:aload_0         
	//   49   94:aload_1         
	//   50   95:invokespecial   #221 <Method TrustManager[] createTrustManagers(ContextAware)>
	//   51   98:aload_0         
	//   52   99:aload_1         
	//   53  100:invokespecial   #223 <Method SecureRandom createSecureRandom(ContextAware)>
	//   54  103:invokevirtual   #226 <Method void SSLContext.init(KeyManager[], TrustManager[], SecureRandom)>
		return sslcontext;
	//   55  106:aload_2         
	//   56  107:areturn         
	}

	public KeyManagerFactoryFactoryBean getKeyManagerFactory()
	{
		if(keyManagerFactory == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field KeyManagerFactoryFactoryBean keyManagerFactory>
	//*   2    4:ifnonnull       15
			return new KeyManagerFactoryFactoryBean();
	//    3    7:new             #83  <Class KeyManagerFactoryFactoryBean>
	//    4   10:dup             
	//    5   11:invokespecial   #229 <Method void KeyManagerFactoryFactoryBean()>
	//    6   14:areturn         
		else
			return keyManagerFactory;
	//    7   15:aload_0         
	//    8   16:getfield        #228 <Field KeyManagerFactoryFactoryBean keyManagerFactory>
	//    9   19:areturn         
	}

	public KeyStoreFactoryBean getKeyStore()
	{
		if(keyStore == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field KeyStoreFactoryBean keyStore>
	//*   2    4:ifnonnull       17
			keyStore = keyStoreFromSystemProperties("javax.net.ssl.keyStore");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:ldc1            #8   <String "javax.net.ssl.keyStore">
	//    6   11:invokespecial   #233 <Method KeyStoreFactoryBean keyStoreFromSystemProperties(String)>
	//    7   14:putfield        #231 <Field KeyStoreFactoryBean keyStore>
		return keyStore;
	//    8   17:aload_0         
	//    9   18:getfield        #231 <Field KeyStoreFactoryBean keyStore>
	//   10   21:areturn         
	}

	public String getProtocol()
	{
		if(protocol == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field String protocol>
	//*   2    4:ifnonnull       10
			return "SSL";
	//    3    7:ldc1            #237 <String "SSL">
	//    4    9:areturn         
		else
			return protocol;
	//    5   10:aload_0         
	//    6   11:getfield        #235 <Field String protocol>
	//    7   14:areturn         
	}

	public String getProvider()
	{
		return provider;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field String provider>
	//    2    4:areturn         
	}

	public SecureRandomFactoryBean getSecureRandom()
	{
		if(secureRandom == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #241 <Field SecureRandomFactoryBean secureRandom>
	//*   2    4:ifnonnull       15
			return new SecureRandomFactoryBean();
	//    3    7:new             #122 <Class SecureRandomFactoryBean>
	//    4   10:dup             
	//    5   11:invokespecial   #242 <Method void SecureRandomFactoryBean()>
	//    6   14:areturn         
		else
			return secureRandom;
	//    7   15:aload_0         
	//    8   16:getfield        #241 <Field SecureRandomFactoryBean secureRandom>
	//    9   19:areturn         
	}

	public TrustManagerFactoryFactoryBean getTrustManagerFactory()
	{
		if(trustManagerFactory == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field TrustManagerFactoryFactoryBean trustManagerFactory>
	//*   2    4:ifnonnull       15
			return new TrustManagerFactoryFactoryBean();
	//    3    7:new             #144 <Class TrustManagerFactoryFactoryBean>
	//    4   10:dup             
	//    5   11:invokespecial   #245 <Method void TrustManagerFactoryFactoryBean()>
	//    6   14:areturn         
		else
			return trustManagerFactory;
	//    7   15:aload_0         
	//    8   16:getfield        #244 <Field TrustManagerFactoryFactoryBean trustManagerFactory>
	//    9   19:areturn         
	}

	public KeyStoreFactoryBean getTrustStore()
	{
		if(trustStore == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field KeyStoreFactoryBean trustStore>
	//*   2    4:ifnonnull       17
			trustStore = keyStoreFromSystemProperties("javax.net.ssl.trustStore");
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:ldc1            #11  <String "javax.net.ssl.trustStore">
	//    6   11:invokespecial   #233 <Method KeyStoreFactoryBean keyStoreFromSystemProperties(String)>
	//    7   14:putfield        #247 <Field KeyStoreFactoryBean trustStore>
		return trustStore;
	//    8   17:aload_0         
	//    9   18:getfield        #247 <Field KeyStoreFactoryBean trustStore>
	//   10   21:areturn         
	}

	public void setKeyManagerFactory(KeyManagerFactoryFactoryBean keymanagerfactoryfactorybean)
	{
		keyManagerFactory = keymanagerfactoryfactorybean;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #228 <Field KeyManagerFactoryFactoryBean keyManagerFactory>
	//    3    5:return          
	}

	public void setKeyStore(KeyStoreFactoryBean keystorefactorybean)
	{
		keyStore = keystorefactorybean;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #231 <Field KeyStoreFactoryBean keyStore>
	//    3    5:return          
	}

	public void setProtocol(String s)
	{
		protocol = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #235 <Field String protocol>
	//    3    5:return          
	}

	public void setProvider(String s)
	{
		provider = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #239 <Field String provider>
	//    3    5:return          
	}

	public void setSecureRandom(SecureRandomFactoryBean securerandomfactorybean)
	{
		secureRandom = securerandomfactorybean;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #241 <Field SecureRandomFactoryBean secureRandom>
	//    3    5:return          
	}

	public void setTrustManagerFactory(TrustManagerFactoryFactoryBean trustmanagerfactoryfactorybean)
	{
		trustManagerFactory = trustmanagerfactoryfactorybean;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #244 <Field TrustManagerFactoryFactoryBean trustManagerFactory>
	//    3    5:return          
	}

	public void setTrustStore(KeyStoreFactoryBean keystorefactorybean)
	{
		trustStore = keystorefactorybean;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #247 <Field KeyStoreFactoryBean trustStore>
	//    3    5:return          
	}

	private static final String JSSE_KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
	private static final String JSSE_TRUST_STORE_PROPERTY = "javax.net.ssl.trustStore";
	private KeyManagerFactoryFactoryBean keyManagerFactory;
	private KeyStoreFactoryBean keyStore;
	private String protocol;
	private String provider;
	private SecureRandomFactoryBean secureRandom;
	private TrustManagerFactoryFactoryBean trustManagerFactory;
	private KeyStoreFactoryBean trustStore;
}
