// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.net;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.*;
import java.security.PrivateKey;
import javax.net.SocketFactory;
import javax.net.ssl.*;

// Referenced classes of package com.google.android.gms.common.net:
//			zza, SocketFactoryCreator

public class SSLCertificateSocketFactory extends SSLSocketFactory
{

	private SSLCertificateSocketFactory(Context context, int i, boolean flag, boolean flag1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void SSLSocketFactory()>
		zzvg = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #43  <Field SSLSocketFactory zzvg>
		zzvh = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #45  <Field SSLSocketFactory zzvh>
		zzvi = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field TrustManager[] zzvi>
		zzvj = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #49  <Field KeyManager[] zzvj>
		zzvk = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #51  <Field byte[] zzvk>
		zzvl = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #53  <Field byte[] zzvl>
		zzvm = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #55  <Field PrivateKey zzvm>
		mContext = context.getApplicationContext();
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:invokevirtual   #61  <Method Context Context.getApplicationContext()>
	//   26   44:putfield        #63  <Field Context mContext>
		zzvn = i;
	//   27   47:aload_0         
	//   28   48:iload_2         
	//   29   49:putfield        #65  <Field int zzvn>
		zzvo = flag;
	//   30   52:aload_0         
	//   31   53:iload_3         
	//   32   54:putfield        #67  <Field boolean zzvo>
		zzvp = flag1;
	//   33   57:aload_0         
	//   34   58:iload           4
	//   35   60:putfield        #69  <Field boolean zzvp>
		zzvq = s;
	//   36   63:aload_0         
	//   37   64:aload           5
	//   38   66:putfield        #71  <Field String zzvq>
	//   39   69:return          
	}

	public static SocketFactory getDefault(Context context, int i)
	{
		return ((SocketFactory) (new SSLCertificateSocketFactory(context, i, false, true, ((String) (null)))));
	//    0    0:new             #2   <Class SSLCertificateSocketFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:aconst_null     
	//    7    9:invokespecial   #75  <Method void SSLCertificateSocketFactory(Context, int, boolean, boolean, String)>
	//    8   12:areturn         
	}

	public static SSLSocketFactory getDefaultWithCacheDir(int i, Context context, String s)
	{
		return ((SSLSocketFactory) (new SSLCertificateSocketFactory(context, i, true, true, s)));
	//    0    0:new             #2   <Class SSLCertificateSocketFactory>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_0         
	//    4    6:iconst_1        
	//    5    7:iconst_1        
	//    6    8:aload_2         
	//    7    9:invokespecial   #75  <Method void SSLCertificateSocketFactory(Context, int, boolean, boolean, String)>
	//    8   12:areturn         
	}

	public static SSLSocketFactory getDefaultWithSessionCache(int i, Context context)
	{
		return ((SSLSocketFactory) (new SSLCertificateSocketFactory(context, i, true, true, ((String) (null)))));
	//    0    0:new             #2   <Class SSLCertificateSocketFactory>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_0         
	//    4    6:iconst_1        
	//    5    7:iconst_1        
	//    6    8:aconst_null     
	//    7    9:invokespecial   #75  <Method void SSLCertificateSocketFactory(Context, int, boolean, boolean, String)>
	//    8   12:areturn         
	}

	public static SSLSocketFactory getInsecure(Context context, int i, boolean flag)
	{
		return ((SSLSocketFactory) (new SSLCertificateSocketFactory(context, i, flag, false, ((String) (null)))));
	//    0    0:new             #2   <Class SSLCertificateSocketFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iconst_0        
	//    6    8:aconst_null     
	//    7    9:invokespecial   #75  <Method void SSLCertificateSocketFactory(Context, int, boolean, boolean, String)>
	//    8   12:areturn         
	}

	public static void verifyHostname(Socket socket, String s)
		throws IOException
	{
		if(!(socket instanceof SSLSocket))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #87  <Class SSLSocket>
	//*   2    4:ifne            17
			throw new IllegalArgumentException("Attempt to verify non-SSL socket");
	//    3    7:new             #89  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #91  <String "Attempt to verify non-SSL socket">
	//    6   13:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		socket = ((Socket) ((SSLSocket)socket));
	//    8   17:aload_0         
	//    9   18:checkcast       #87  <Class SSLSocket>
	//   10   21:astore_0        
		((SSLSocket) (socket)).startHandshake();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #97  <Method void SSLSocket.startHandshake()>
		socket = ((Socket) (((SSLSocket) (socket)).getSession()));
	//   13   26:aload_0         
	//   14   27:invokevirtual   #101 <Method javax.net.ssl.SSLSession SSLSocket.getSession()>
	//   15   30:astore_0        
		if(socket == null)
	//*  16   31:aload_0         
	//*  17   32:ifnonnull       45
			throw new SSLException("Cannot verify SSL socket without session");
	//   18   35:new             #103 <Class SSLException>
	//   19   38:dup             
	//   20   39:ldc1            #105 <String "Cannot verify SSL socket without session">
	//   21   41:invokespecial   #106 <Method void SSLException(String)>
	//   22   44:athrow          
		if(!HttpsURLConnection.getDefaultHostnameVerifier().verify(s, ((javax.net.ssl.SSLSession) (socket))))
	//*  23   45:invokestatic    #112 <Method HostnameVerifier HttpsURLConnection.getDefaultHostnameVerifier()>
	//*  24   48:aload_1         
	//*  25   49:aload_0         
	//*  26   50:invokeinterface #118 <Method boolean HostnameVerifier.verify(String, javax.net.ssl.SSLSession)>
	//*  27   55:ifne            99
		{
			socket = ((Socket) (String.valueOf(((Object) (s)))));
	//   28   58:aload_1         
	//   29   59:invokestatic    #124 <Method String String.valueOf(Object)>
	//   30   62:astore_0        
			if(((String) (socket)).length() != 0)
	//*  31   63:aload_0         
	//*  32   64:invokevirtual   #128 <Method int String.length()>
	//*  33   67:ifeq            80
				socket = ((Socket) ("Cannot verify hostname: ".concat(((String) (socket)))));
	//   34   70:ldc1            #130 <String "Cannot verify hostname: ">
	//   35   72:aload_0         
	//   36   73:invokevirtual   #134 <Method String String.concat(String)>
	//   37   76:astore_0        
			else
	//*  38   77:goto            90
				socket = ((Socket) (new String("Cannot verify hostname: ")));
	//   39   80:new             #120 <Class String>
	//   40   83:dup             
	//   41   84:ldc1            #130 <String "Cannot verify hostname: ">
	//   42   86:invokespecial   #135 <Method void String(String)>
	//   43   89:astore_0        
			throw new SSLPeerUnverifiedException(((String) (socket)));
	//   44   90:new             #137 <Class SSLPeerUnverifiedException>
	//   45   93:dup             
	//   46   94:aload_0         
	//   47   95:invokespecial   #138 <Method void SSLPeerUnverifiedException(String)>
	//   48   98:athrow          
		} else
		{
			return;
	//   49   99:return          
		}
	}

	private static void zza(Socket socket, int i)
	{
		if(socket == null)
			break MISSING_BLOCK_LABEL_163;
	//    0    0:aload_0         
	//    1    1:ifnull          163
		try
		{
			((Object) (socket)).getClass().getMethod("setHandshakeTimeout", new Class[] {
				Integer.TYPE
			}).invoke(((Object) (socket)), new Object[] {
				Integer.valueOf(i)
			});
	//    2    4:aload_0         
	//    3    5:invokevirtual   #153 <Method Class Object.getClass()>
	//    4    8:ldc1            #155 <String "setHandshakeTimeout">
	//    5   10:iconst_1        
	//    6   11:anewarray       Class[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:getstatic       #163 <Field Class Integer.TYPE>
	//   10   19:aastore         
	//   11   20:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//   12   23:aload_0         
	//   13   24:iconst_1        
	//   14   25:anewarray       Object[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:iload_1         
	//   18   31:invokestatic    #170 <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   21   38:pop             
			return;
	//   22   39:return          
		}
	//*  23   40:astore_2        
	//*  24   41:aload_0         
	//*  25   42:invokevirtual   #153 <Method Class Object.getClass()>
	//*  26   45:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  27   48:astore_0        
	//*  28   49:new             #178 <Class StringBuilder>
	//*  29   52:dup             
	//*  30   53:bipush          45
	//*  31   55:aload_0         
	//*  32   56:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  33   59:invokevirtual   #128 <Method int String.length()>
	//*  34   62:iadd            
	//*  35   63:invokespecial   #181 <Method void StringBuilder(int)>
	//*  36   66:astore_3        
	//*  37   67:aload_3         
	//*  38   68:aload_0         
	//*  39   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  40   72:pop             
	//*  41   73:aload_3         
	//*  42   74:ldc1            #187 <String " does not implement setSocketHandshakeTimeout">
	//*  43   76:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  44   79:pop             
	//*  45   80:new             #89  <Class IllegalArgumentException>
	//*  46   83:dup             
	//*  47   84:aload_3         
	//*  48   85:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  49   88:aload_2         
	//*  50   89:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  51   92:athrow          
		catch(InvocationTargetException invocationtargetexception)
	//*  52   93:astore_2        
		{
			Throwable throwable = invocationtargetexception.getCause();
	//   53   94:aload_2         
	//   54   95:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   55   98:astore_3        
			if(throwable instanceof RuntimeException)
	//*  56   99:aload_3         
	//*  57  100:instanceof      #200 <Class RuntimeException>
	//*  58  103:ifeq            111
			{
				throw (RuntimeException)throwable;
	//   59  106:aload_3         
	//   60  107:checkcast       #200 <Class RuntimeException>
	//   61  110:athrow          
			} else
			{
				socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   62  111:aload_0         
	//   63  112:invokevirtual   #153 <Method Class Object.getClass()>
	//   64  115:invokestatic    #124 <Method String String.valueOf(Object)>
	//   65  118:astore_0        
				StringBuilder stringbuilder1 = new StringBuilder(46 + String.valueOf(((Object) (socket))).length());
	//   66  119:new             #178 <Class StringBuilder>
	//   67  122:dup             
	//   68  123:bipush          46
	//   69  125:aload_0         
	//   70  126:invokestatic    #124 <Method String String.valueOf(Object)>
	//   71  129:invokevirtual   #128 <Method int String.length()>
	//   72  132:iadd            
	//   73  133:invokespecial   #181 <Method void StringBuilder(int)>
	//   74  136:astore_3        
				stringbuilder1.append("Failed to invoke setSocketHandshakeTimeout on ");
	//   75  137:aload_3         
	//   76  138:ldc1            #202 <String "Failed to invoke setSocketHandshakeTimeout on ">
	//   77  140:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   78  143:pop             
				stringbuilder1.append(((String) (socket)));
	//   79  144:aload_3         
	//   80  145:aload_0         
	//   81  146:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   82  149:pop             
				throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (invocationtargetexception)));
	//   83  150:new             #200 <Class RuntimeException>
	//   84  153:dup             
	//   85  154:aload_3         
	//   86  155:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   87  158:aload_2         
	//   88  159:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   89  162:athrow          
			}
		}
		catch(Object obj)
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(45 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setSocketHandshakeTimeout");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
		}
	//   90  163:return          
	}

	private static void zza(Socket socket, PrivateKey privatekey)
	{
		if(socket == null)
			break MISSING_BLOCK_LABEL_159;
	//    0    0:aload_0         
	//    1    1:ifnull          159
		Throwable throwable;
		try
		{
			((Object) (socket)).getClass().getMethod("setChannelIdPrivateKey", new Class[] {
				java/security/PrivateKey
			}).invoke(((Object) (socket)), new Object[] {
				privatekey
			});
	//    2    4:aload_0         
	//    3    5:invokevirtual   #153 <Method Class Object.getClass()>
	//    4    8:ldc1            #207 <String "setChannelIdPrivateKey">
	//    5   10:iconst_1        
	//    6   11:anewarray       Class[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #209 <Class PrivateKey>
	//   10   18:aastore         
	//   11   19:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:anewarray       Object[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:aload_1         
	//   18   30:aastore         
	//   19   31:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   20   34:pop             
			return;
	//   21   35:return          
		}
	//*  22   36:astore_1        
	//*  23   37:aload_0         
	//*  24   38:invokevirtual   #153 <Method Class Object.getClass()>
	//*  25   41:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  26   44:astore_0        
	//*  27   45:new             #178 <Class StringBuilder>
	//*  28   48:dup             
	//*  29   49:bipush          42
	//*  30   51:aload_0         
	//*  31   52:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  32   55:invokevirtual   #128 <Method int String.length()>
	//*  33   58:iadd            
	//*  34   59:invokespecial   #181 <Method void StringBuilder(int)>
	//*  35   62:astore_2        
	//*  36   63:aload_2         
	//*  37   64:aload_0         
	//*  38   65:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  39   68:pop             
	//*  40   69:aload_2         
	//*  41   70:ldc1            #211 <String " does not implement setChannelIdPrivateKey">
	//*  42   72:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  43   75:pop             
	//*  44   76:new             #89  <Class IllegalArgumentException>
	//*  45   79:dup             
	//*  46   80:aload_2         
	//*  47   81:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  48   84:aload_1         
	//*  49   85:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  50   88:athrow          
		// Misplaced declaration of an exception variable
		catch(PrivateKey privatekey)
	//*  51   89:astore_1        
		{
			throwable = ((InvocationTargetException) (privatekey)).getCause();
	//   52   90:aload_1         
	//   53   91:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   54   94:astore_2        
		}
		// Misplaced declaration of an exception variable
		catch(PrivateKey privatekey)
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(42 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setChannelIdPrivateKey");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (privatekey)));
		}
		if(throwable instanceof RuntimeException)
	//*  55   95:aload_2         
	//*  56   96:instanceof      #200 <Class RuntimeException>
	//*  57   99:ifeq            107
		{
			throw (RuntimeException)throwable;
	//   58  102:aload_2         
	//   59  103:checkcast       #200 <Class RuntimeException>
	//   60  106:athrow          
		} else
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   61  107:aload_0         
	//   62  108:invokevirtual   #153 <Method Class Object.getClass()>
	//   63  111:invokestatic    #124 <Method String String.valueOf(Object)>
	//   64  114:astore_0        
			StringBuilder stringbuilder1 = new StringBuilder(43 + String.valueOf(((Object) (socket))).length());
	//   65  115:new             #178 <Class StringBuilder>
	//   66  118:dup             
	//   67  119:bipush          43
	//   68  121:aload_0         
	//   69  122:invokestatic    #124 <Method String String.valueOf(Object)>
	//   70  125:invokevirtual   #128 <Method int String.length()>
	//   71  128:iadd            
	//   72  129:invokespecial   #181 <Method void StringBuilder(int)>
	//   73  132:astore_2        
			stringbuilder1.append("Failed to invoke setChannelIdPrivateKey on ");
	//   74  133:aload_2         
	//   75  134:ldc1            #213 <String "Failed to invoke setChannelIdPrivateKey on ">
	//   76  136:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   77  139:pop             
			stringbuilder1.append(((String) (socket)));
	//   78  140:aload_2         
	//   79  141:aload_0         
	//   80  142:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   81  145:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (privatekey)));
	//   82  146:new             #200 <Class RuntimeException>
	//   83  149:dup             
	//   84  150:aload_2         
	//   85  151:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   86  154:aload_1         
	//   87  155:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   88  158:athrow          
		}
	//   89  159:return          
	}

	private static void zza(Socket socket, byte abyte0[])
	{
		if(socket == null)
			break MISSING_BLOCK_LABEL_159;
	//    0    0:aload_0         
	//    1    1:ifnull          159
		Throwable throwable;
		try
		{
			((Object) (socket)).getClass().getMethod("setNpnProtocols", new Class[] {
				[B
			}).invoke(((Object) (socket)), new Object[] {
				abyte0
			});
	//    2    4:aload_0         
	//    3    5:invokevirtual   #153 <Method Class Object.getClass()>
	//    4    8:ldc1            #216 <String "setNpnProtocols">
	//    5   10:iconst_1        
	//    6   11:anewarray       Class[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #217 <Class byte[]>
	//   10   18:aastore         
	//   11   19:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:anewarray       Object[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:aload_1         
	//   18   30:aastore         
	//   19   31:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   20   34:pop             
			return;
	//   21   35:return          
		}
	//*  22   36:astore_1        
	//*  23   37:aload_0         
	//*  24   38:invokevirtual   #153 <Method Class Object.getClass()>
	//*  25   41:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  26   44:astore_0        
	//*  27   45:new             #178 <Class StringBuilder>
	//*  28   48:dup             
	//*  29   49:bipush          35
	//*  30   51:aload_0         
	//*  31   52:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  32   55:invokevirtual   #128 <Method int String.length()>
	//*  33   58:iadd            
	//*  34   59:invokespecial   #181 <Method void StringBuilder(int)>
	//*  35   62:astore_2        
	//*  36   63:aload_2         
	//*  37   64:aload_0         
	//*  38   65:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  39   68:pop             
	//*  40   69:aload_2         
	//*  41   70:ldc1            #219 <String " does not implement setNpnProtocols">
	//*  42   72:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  43   75:pop             
	//*  44   76:new             #89  <Class IllegalArgumentException>
	//*  45   79:dup             
	//*  46   80:aload_2         
	//*  47   81:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  48   84:aload_1         
	//*  49   85:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  50   88:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  51   89:astore_1        
		{
			throwable = ((InvocationTargetException) (abyte0)).getCause();
	//   52   90:aload_1         
	//   53   91:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   54   94:astore_2        
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(35 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setNpnProtocols");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (abyte0)));
		}
		if(throwable instanceof RuntimeException)
	//*  55   95:aload_2         
	//*  56   96:instanceof      #200 <Class RuntimeException>
	//*  57   99:ifeq            107
		{
			throw (RuntimeException)throwable;
	//   58  102:aload_2         
	//   59  103:checkcast       #200 <Class RuntimeException>
	//   60  106:athrow          
		} else
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   61  107:aload_0         
	//   62  108:invokevirtual   #153 <Method Class Object.getClass()>
	//   63  111:invokestatic    #124 <Method String String.valueOf(Object)>
	//   64  114:astore_0        
			StringBuilder stringbuilder1 = new StringBuilder(36 + String.valueOf(((Object) (socket))).length());
	//   65  115:new             #178 <Class StringBuilder>
	//   66  118:dup             
	//   67  119:bipush          36
	//   68  121:aload_0         
	//   69  122:invokestatic    #124 <Method String String.valueOf(Object)>
	//   70  125:invokevirtual   #128 <Method int String.length()>
	//   71  128:iadd            
	//   72  129:invokespecial   #181 <Method void StringBuilder(int)>
	//   73  132:astore_2        
			stringbuilder1.append("Failed to invoke setNpnProtocols on ");
	//   74  133:aload_2         
	//   75  134:ldc1            #221 <String "Failed to invoke setNpnProtocols on ">
	//   76  136:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   77  139:pop             
			stringbuilder1.append(((String) (socket)));
	//   78  140:aload_2         
	//   79  141:aload_0         
	//   80  142:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   81  145:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (abyte0)));
	//   82  146:new             #200 <Class RuntimeException>
	//   83  149:dup             
	//   84  150:aload_2         
	//   85  151:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   86  154:aload_1         
	//   87  155:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   88  158:athrow          
		}
	//   89  159:return          
	}

	private static transient byte[] zza(byte abyte0[][])
	{
		if(abyte0.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            15
			throw new IllegalArgumentException("items.length == 0");
	//    3    5:new             #89  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc1            #224 <String "items.length == 0">
	//    6   11:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//    7   14:athrow          
		int k = abyte0.length;
	//    8   15:aload_0         
	//    9   16:arraylength     
	//   10   17:istore_3        
		int i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_1        
		int j = i;
	//   13   20:iload_1         
	//   14   21:istore_2        
		while(i < k) 
	//*  15   22:iload_1         
	//*  16   23:iload_3         
	//*  17   24:icmpge          104
		{
			byte abyte1[] = abyte0[i];
	//   18   27:aload_0         
	//   19   28:iload_1         
	//   20   29:aaload          
	//   21   30:astore          6
			if(abyte1.length != 0 && abyte1.length <= 255)
	//*  22   32:aload           6
	//*  23   34:arraylength     
	//*  24   35:ifeq            65
	//*  25   38:aload           6
	//*  26   40:arraylength     
	//*  27   41:sipush          255
	//*  28   44:icmple          50
	//*  29   47:goto            65
			{
				j += 1 + abyte1.length;
	//   30   50:iload_2         
	//   31   51:iconst_1        
	//   32   52:aload           6
	//   33   54:arraylength     
	//   34   55:iadd            
	//   35   56:iadd            
	//   36   57:istore_2        
				i++;
	//   37   58:iload_1         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:istore_1        
			} else
	//*  41   62:goto            22
			{
				i = abyte1.length;
	//   42   65:aload           6
	//   43   67:arraylength     
	//   44   68:istore_1        
				abyte0 = ((byte [][]) (new StringBuilder(44)));
	//   45   69:new             #178 <Class StringBuilder>
	//   46   72:dup             
	//   47   73:bipush          44
	//   48   75:invokespecial   #181 <Method void StringBuilder(int)>
	//   49   78:astore_0        
				((StringBuilder) (abyte0)).append("s.length == 0 || s.length > 255: ");
	//   50   79:aload_0         
	//   51   80:ldc1            #226 <String "s.length == 0 || s.length > 255: ">
	//   52   82:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   53   85:pop             
				((StringBuilder) (abyte0)).append(i);
	//   54   86:aload_0         
	//   55   87:iload_1         
	//   56   88:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
	//   57   91:pop             
				throw new IllegalArgumentException(((StringBuilder) (abyte0)).toString());
	//   58   92:new             #89  <Class IllegalArgumentException>
	//   59   95:dup             
	//   60   96:aload_0         
	//   61   97:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   62  100:invokespecial   #94  <Method void IllegalArgumentException(String)>
	//   63  103:athrow          
			}
		}
		byte abyte2[] = new byte[j];
	//   64  104:iload_2         
	//   65  105:newarray        byte[]
	//   66  107:astore          6
		int i1 = abyte0.length;
	//   67  109:aload_0         
	//   68  110:arraylength     
	//   69  111:istore          4
		j = 0;
	//   70  113:iconst_0        
	//   71  114:istore_2        
		i = j;
	//   72  115:iload_2         
	//   73  116:istore_1        
		for(; j < i1; j++)
	//*  74  117:iload_2         
	//*  75  118:iload           4
	//*  76  120:icmpge          179
		{
			byte abyte3[] = abyte0[j];
	//   77  123:aload_0         
	//   78  124:iload_2         
	//   79  125:aaload          
	//   80  126:astore          7
			abyte2[i] = (byte)abyte3.length;
	//   81  128:aload           6
	//   82  130:iload_1         
	//   83  131:aload           7
	//   84  133:arraylength     
	//   85  134:int2byte        
	//   86  135:bastore         
			int j1 = abyte3.length;
	//   87  136:aload           7
	//   88  138:arraylength     
	//   89  139:istore          5
			i++;
	//   90  141:iload_1         
	//   91  142:iconst_1        
	//   92  143:iadd            
	//   93  144:istore_1        
			for(int l = 0; l < j1;)
	//*  94  145:iconst_0        
	//*  95  146:istore_3        
	//*  96  147:iload_3         
	//*  97  148:iload           5
	//*  98  150:icmpge          172
			{
				abyte2[i] = abyte3[l];
	//   99  153:aload           6
	//  100  155:iload_1         
	//  101  156:aload           7
	//  102  158:iload_3         
	//  103  159:baload          
	//  104  160:bastore         
				l++;
	//  105  161:iload_3         
	//  106  162:iconst_1        
	//  107  163:iadd            
	//  108  164:istore_3        
				i++;
	//  109  165:iload_1         
	//  110  166:iconst_1        
	//  111  167:iadd            
	//  112  168:istore_1        
			}

		}

	//  113  169:goto            147
	//  114  172:iload_2         
	//  115  173:iconst_1        
	//  116  174:iadd            
	//  117  175:istore_2        
	//* 118  176:goto            117
		return abyte2;
	//  119  179:aload           6
	//  120  181:areturn         
	}

	private static void zzb(Socket socket, byte abyte0[])
	{
		if(socket == null)
			break MISSING_BLOCK_LABEL_159;
	//    0    0:aload_0         
	//    1    1:ifnull          159
		Throwable throwable;
		try
		{
			((Object) (socket)).getClass().getMethod("setAlpnProtocols", new Class[] {
				[B
			}).invoke(((Object) (socket)), new Object[] {
				abyte0
			});
	//    2    4:aload_0         
	//    3    5:invokevirtual   #153 <Method Class Object.getClass()>
	//    4    8:ldc1            #232 <String "setAlpnProtocols">
	//    5   10:iconst_1        
	//    6   11:anewarray       Class[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #217 <Class byte[]>
	//   10   18:aastore         
	//   11   19:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:anewarray       Object[]
	//   15   27:dup             
	//   16   28:iconst_0        
	//   17   29:aload_1         
	//   18   30:aastore         
	//   19   31:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   20   34:pop             
			return;
	//   21   35:return          
		}
	//*  22   36:astore_1        
	//*  23   37:aload_0         
	//*  24   38:invokevirtual   #153 <Method Class Object.getClass()>
	//*  25   41:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  26   44:astore_0        
	//*  27   45:new             #178 <Class StringBuilder>
	//*  28   48:dup             
	//*  29   49:bipush          36
	//*  30   51:aload_0         
	//*  31   52:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  32   55:invokevirtual   #128 <Method int String.length()>
	//*  33   58:iadd            
	//*  34   59:invokespecial   #181 <Method void StringBuilder(int)>
	//*  35   62:astore_2        
	//*  36   63:aload_2         
	//*  37   64:aload_0         
	//*  38   65:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  39   68:pop             
	//*  40   69:aload_2         
	//*  41   70:ldc1            #234 <String " does not implement setAlpnProtocols">
	//*  42   72:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  43   75:pop             
	//*  44   76:new             #89  <Class IllegalArgumentException>
	//*  45   79:dup             
	//*  46   80:aload_2         
	//*  47   81:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  48   84:aload_1         
	//*  49   85:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  50   88:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  51   89:astore_1        
		{
			throwable = ((InvocationTargetException) (abyte0)).getCause();
	//   52   90:aload_1         
	//   53   91:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   54   94:astore_2        
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(36 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setAlpnProtocols");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (abyte0)));
		}
		if(throwable instanceof RuntimeException)
	//*  55   95:aload_2         
	//*  56   96:instanceof      #200 <Class RuntimeException>
	//*  57   99:ifeq            107
		{
			throw (RuntimeException)throwable;
	//   58  102:aload_2         
	//   59  103:checkcast       #200 <Class RuntimeException>
	//   60  106:athrow          
		} else
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   61  107:aload_0         
	//   62  108:invokevirtual   #153 <Method Class Object.getClass()>
	//   63  111:invokestatic    #124 <Method String String.valueOf(Object)>
	//   64  114:astore_0        
			StringBuilder stringbuilder1 = new StringBuilder(37 + String.valueOf(((Object) (socket))).length());
	//   65  115:new             #178 <Class StringBuilder>
	//   66  118:dup             
	//   67  119:bipush          37
	//   68  121:aload_0         
	//   69  122:invokestatic    #124 <Method String String.valueOf(Object)>
	//   70  125:invokevirtual   #128 <Method int String.length()>
	//   71  128:iadd            
	//   72  129:invokespecial   #181 <Method void StringBuilder(int)>
	//   73  132:astore_2        
			stringbuilder1.append("Failed to invoke setAlpnProtocols on ");
	//   74  133:aload_2         
	//   75  134:ldc1            #236 <String "Failed to invoke setAlpnProtocols on ">
	//   76  136:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   77  139:pop             
			stringbuilder1.append(((String) (socket)));
	//   78  140:aload_2         
	//   79  141:aload_0         
	//   80  142:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   81  145:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (abyte0)));
	//   82  146:new             #200 <Class RuntimeException>
	//   83  149:dup             
	//   84  150:aload_2         
	//   85  151:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   86  154:aload_1         
	//   87  155:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   88  158:athrow          
		}
	//   89  159:return          
	}

	private final SSLSocketFactory zzcx()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SSLSocketFactory sslsocketfactory;
		if(zzvp)
			break MISSING_BLOCK_LABEL_58;
	//    2    2:aload_0         
	//    3    3:getfield        #69  <Field boolean zzvp>
	//    4    6:ifne            58
		if(zzvg == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #43  <Field SSLSocketFactory zzvg>
	//*   7   13:ifnonnull       49
		{
			Log.w("SSLCertificateSocketFactory", "Bypassing SSL security checks at caller's request");
	//    8   16:ldc1            #240 <String "SSLCertificateSocketFactory">
	//    9   18:ldc1            #242 <String "Bypassing SSL security checks at caller's request">
	//   10   20:invokestatic    #248 <Method int Log.w(String, String)>
	//   11   23:pop             
			zzvg = SocketFactoryCreator.getInstance().makeSocketFactory(mContext, zzvj, zzvf, zzvo);
	//   12   24:aload_0         
	//   13   25:invokestatic    #254 <Method SocketFactoryCreator SocketFactoryCreator.getInstance()>
	//   14   28:aload_0         
	//   15   29:getfield        #63  <Field Context mContext>
	//   16   32:aload_0         
	//   17   33:getfield        #49  <Field KeyManager[] zzvj>
	//   18   36:getstatic       #38  <Field TrustManager[] zzvf>
	//   19   39:aload_0         
	//   20   40:getfield        #67  <Field boolean zzvo>
	//   21   43:invokevirtual   #258 <Method SSLSocketFactory SocketFactoryCreator.makeSocketFactory(Context, KeyManager[], TrustManager[], boolean)>
	//   22   46:putfield        #43  <Field SSLSocketFactory zzvg>
		}
		sslsocketfactory = zzvg;
	//   23   49:aload_0         
	//   24   50:getfield        #43  <Field SSLSocketFactory zzvg>
	//   25   53:astore_1        
		this;
	//   26   54:aload_0         
		JVM INSTR monitorexit ;
	//   27   55:monitorexit     
		return sslsocketfactory;
	//   28   56:aload_1         
	//   29   57:areturn         
		if(zzvq == null)
			break MISSING_BLOCK_LABEL_103;
	//   30   58:aload_0         
	//   31   59:getfield        #71  <Field String zzvq>
	//   32   62:ifnull          103
		if(zzvh != null)
			break MISSING_BLOCK_LABEL_136;
	//   33   65:aload_0         
	//   34   66:getfield        #45  <Field SSLSocketFactory zzvh>
	//   35   69:ifnonnull       136
		sslsocketfactory = SocketFactoryCreator.getInstance().makeSocketFactoryWithCacheDir(mContext, zzvj, zzvi, zzvq);
	//   36   72:invokestatic    #254 <Method SocketFactoryCreator SocketFactoryCreator.getInstance()>
	//   37   75:aload_0         
	//   38   76:getfield        #63  <Field Context mContext>
	//   39   79:aload_0         
	//   40   80:getfield        #49  <Field KeyManager[] zzvj>
	//   41   83:aload_0         
	//   42   84:getfield        #47  <Field TrustManager[] zzvi>
	//   43   87:aload_0         
	//   44   88:getfield        #71  <Field String zzvq>
	//   45   91:invokevirtual   #262 <Method SSLSocketFactory SocketFactoryCreator.makeSocketFactoryWithCacheDir(Context, KeyManager[], TrustManager[], String)>
	//   46   94:astore_1        
_L1:
		zzvh = sslsocketfactory;
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:putfield        #45  <Field SSLSocketFactory zzvh>
		break MISSING_BLOCK_LABEL_136;
	//   50  100:goto            136
		if(zzvh != null)
			break MISSING_BLOCK_LABEL_136;
	//   51  103:aload_0         
	//   52  104:getfield        #45  <Field SSLSocketFactory zzvh>
	//   53  107:ifnonnull       136
		sslsocketfactory = SocketFactoryCreator.getInstance().makeSocketFactory(mContext, zzvj, zzvi, zzvo);
	//   54  110:invokestatic    #254 <Method SocketFactoryCreator SocketFactoryCreator.getInstance()>
	//   55  113:aload_0         
	//   56  114:getfield        #63  <Field Context mContext>
	//   57  117:aload_0         
	//   58  118:getfield        #49  <Field KeyManager[] zzvj>
	//   59  121:aload_0         
	//   60  122:getfield        #47  <Field TrustManager[] zzvi>
	//   61  125:aload_0         
	//   62  126:getfield        #67  <Field boolean zzvo>
	//   63  129:invokevirtual   #258 <Method SSLSocketFactory SocketFactoryCreator.makeSocketFactory(Context, KeyManager[], TrustManager[], boolean)>
	//   64  132:astore_1        
		  goto _L1
	//*  65  133:goto            95
		sslsocketfactory = zzvh;
	//   66  136:aload_0         
	//   67  137:getfield        #45  <Field SSLSocketFactory zzvh>
	//   68  140:astore_1        
		this;
	//   69  141:aload_0         
		JVM INSTR monitorexit ;
	//   70  142:monitorexit     
		return sslsocketfactory;
	//   71  143:aload_1         
	//   72  144:areturn         
		Exception exception;
		exception;
	//   73  145:astore_1        
	//*  74  146:aload_0         
		throw exception;
	//   75  147:monitorexit     
	//   76  148:aload_1         
	//   77  149:athrow          
	}

	public Socket createSocket()
		throws IOException
	{
		Socket socket = zzcx().createSocket();
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method SSLSocketFactory zzcx()>
	//    2    4:invokevirtual   #268 <Method Socket SSLSocketFactory.createSocket()>
	//    3    7:astore_1        
		zza(socket, zzvk);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field byte[] zzvk>
	//    7   13:invokestatic    #270 <Method void zza(Socket, byte[])>
		zzb(socket, zzvl);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #53  <Field byte[] zzvl>
	//   11   21:invokestatic    #272 <Method void zzb(Socket, byte[])>
		zza(socket, zzvn);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #65  <Field int zzvn>
	//   15   29:invokestatic    #274 <Method void zza(Socket, int)>
		zza(socket, zzvm);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #55  <Field PrivateKey zzvm>
	//   19   37:invokestatic    #276 <Method void zza(Socket, PrivateKey)>
		return socket;
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	public Socket createSocket(String s, int i)
		throws IOException
	{
		Socket socket = zzcx().createSocket(s, i);
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method SSLSocketFactory zzcx()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #279 <Method Socket SSLSocketFactory.createSocket(String, int)>
	//    5    9:astore_3        
		zza(socket, zzvk);
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:getfield        #51  <Field byte[] zzvk>
	//    9   15:invokestatic    #270 <Method void zza(Socket, byte[])>
		zzb(socket, zzvl);
	//   10   18:aload_3         
	//   11   19:aload_0         
	//   12   20:getfield        #53  <Field byte[] zzvl>
	//   13   23:invokestatic    #272 <Method void zzb(Socket, byte[])>
		zza(socket, zzvn);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #65  <Field int zzvn>
	//   17   31:invokestatic    #274 <Method void zza(Socket, int)>
		zza(socket, zzvm);
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #55  <Field PrivateKey zzvm>
	//   21   39:invokestatic    #276 <Method void zza(Socket, PrivateKey)>
		if(zzvp)
	//*  22   42:aload_0         
	//*  23   43:getfield        #69  <Field boolean zzvp>
	//*  24   46:ifeq            54
			verifyHostname(socket, s);
	//   25   49:aload_3         
	//   26   50:aload_1         
	//   27   51:invokestatic    #281 <Method void verifyHostname(Socket, String)>
		return socket;
	//   28   54:aload_3         
	//   29   55:areturn         
	}

	public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
		throws IOException
	{
		inetaddress = ((InetAddress) (zzcx().createSocket(s, i, inetaddress, j)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method SSLSocketFactory zzcx()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #284 <Method Socket SSLSocketFactory.createSocket(String, int, InetAddress, int)>
	//    7   12:astore_3        
		zza(((Socket) (inetaddress)), zzvk);
	//    8   13:aload_3         
	//    9   14:aload_0         
	//   10   15:getfield        #51  <Field byte[] zzvk>
	//   11   18:invokestatic    #270 <Method void zza(Socket, byte[])>
		zzb(((Socket) (inetaddress)), zzvl);
	//   12   21:aload_3         
	//   13   22:aload_0         
	//   14   23:getfield        #53  <Field byte[] zzvl>
	//   15   26:invokestatic    #272 <Method void zzb(Socket, byte[])>
		zza(((Socket) (inetaddress)), zzvn);
	//   16   29:aload_3         
	//   17   30:aload_0         
	//   18   31:getfield        #65  <Field int zzvn>
	//   19   34:invokestatic    #274 <Method void zza(Socket, int)>
		zza(((Socket) (inetaddress)), zzvm);
	//   20   37:aload_3         
	//   21   38:aload_0         
	//   22   39:getfield        #55  <Field PrivateKey zzvm>
	//   23   42:invokestatic    #276 <Method void zza(Socket, PrivateKey)>
		if(zzvp)
	//*  24   45:aload_0         
	//*  25   46:getfield        #69  <Field boolean zzvp>
	//*  26   49:ifeq            57
			verifyHostname(((Socket) (inetaddress)), s);
	//   27   52:aload_3         
	//   28   53:aload_1         
	//   29   54:invokestatic    #281 <Method void verifyHostname(Socket, String)>
		return ((Socket) (inetaddress));
	//   30   57:aload_3         
	//   31   58:areturn         
	}

	public Socket createSocket(InetAddress inetaddress, int i)
		throws IOException
	{
		inetaddress = ((InetAddress) (zzcx().createSocket(inetaddress, i)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method SSLSocketFactory zzcx()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #287 <Method Socket SSLSocketFactory.createSocket(InetAddress, int)>
	//    5    9:astore_1        
		zza(((Socket) (inetaddress)), zzvk);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #51  <Field byte[] zzvk>
	//    9   15:invokestatic    #270 <Method void zza(Socket, byte[])>
		zzb(((Socket) (inetaddress)), zzvl);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #53  <Field byte[] zzvl>
	//   13   23:invokestatic    #272 <Method void zzb(Socket, byte[])>
		zza(((Socket) (inetaddress)), zzvn);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #65  <Field int zzvn>
	//   17   31:invokestatic    #274 <Method void zza(Socket, int)>
		zza(((Socket) (inetaddress)), zzvm);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #55  <Field PrivateKey zzvm>
	//   21   39:invokestatic    #276 <Method void zza(Socket, PrivateKey)>
		return ((Socket) (inetaddress));
	//   22   42:aload_1         
	//   23   43:areturn         
	}

	public Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
		throws IOException
	{
		inetaddress = ((InetAddress) (zzcx().createSocket(inetaddress, i, inetaddress1, j)));
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method SSLSocketFactory zzcx()>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #290 <Method Socket SSLSocketFactory.createSocket(InetAddress, int, InetAddress, int)>
	//    7   12:astore_1        
		zza(((Socket) (inetaddress)), zzvk);
	//    8   13:aload_1         
	//    9   14:aload_0         
	//   10   15:getfield        #51  <Field byte[] zzvk>
	//   11   18:invokestatic    #270 <Method void zza(Socket, byte[])>
		zzb(((Socket) (inetaddress)), zzvl);
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:getfield        #53  <Field byte[] zzvl>
	//   15   26:invokestatic    #272 <Method void zzb(Socket, byte[])>
		zza(((Socket) (inetaddress)), zzvn);
	//   16   29:aload_1         
	//   17   30:aload_0         
	//   18   31:getfield        #65  <Field int zzvn>
	//   19   34:invokestatic    #274 <Method void zza(Socket, int)>
		zza(((Socket) (inetaddress)), zzvm);
	//   20   37:aload_1         
	//   21   38:aload_0         
	//   22   39:getfield        #55  <Field PrivateKey zzvm>
	//   23   42:invokestatic    #276 <Method void zza(Socket, PrivateKey)>
		return ((Socket) (inetaddress));
	//   24   45:aload_1         
	//   25   46:areturn         
	}

	public Socket createSocket(Socket socket, String s, int i, boolean flag)
		throws IOException
	{
		socket = zzcx().createSocket(socket, s, i, flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method SSLSocketFactory zzcx()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #293 <Method Socket SSLSocketFactory.createSocket(Socket, String, int, boolean)>
	//    7   12:astore_1        
		zza(socket, zzvk);
	//    8   13:aload_1         
	//    9   14:aload_0         
	//   10   15:getfield        #51  <Field byte[] zzvk>
	//   11   18:invokestatic    #270 <Method void zza(Socket, byte[])>
		zzb(socket, zzvl);
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:getfield        #53  <Field byte[] zzvl>
	//   15   26:invokestatic    #272 <Method void zzb(Socket, byte[])>
		zza(socket, zzvn);
	//   16   29:aload_1         
	//   17   30:aload_0         
	//   18   31:getfield        #65  <Field int zzvn>
	//   19   34:invokestatic    #274 <Method void zza(Socket, int)>
		zza(socket, zzvm);
	//   20   37:aload_1         
	//   21   38:aload_0         
	//   22   39:getfield        #55  <Field PrivateKey zzvm>
	//   23   42:invokestatic    #276 <Method void zza(Socket, PrivateKey)>
		if(zzvp)
	//*  24   45:aload_0         
	//*  25   46:getfield        #69  <Field boolean zzvp>
	//*  26   49:ifeq            57
			verifyHostname(socket, s);
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:invokestatic    #281 <Method void verifyHostname(Socket, String)>
		return socket;
	//   30   57:aload_1         
	//   31   58:areturn         
	}

	public byte[] getAlpnSelectedProtocol(Socket socket)
	{
		byte abyte0[];
		try
		{
			abyte0 = (byte[])((Object) (socket)).getClass().getMethod("getAlpnSelectedProtocol", new Class[0]).invoke(((Object) (socket)), new Object[0]);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #153 <Method Class Object.getClass()>
	//    2    4:ldc2            #296 <String "getAlpnSelectedProtocol">
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:anewarray       Object[]
	//    9   19:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   10   22:checkcast       #217 <Class byte[]>
	//   11   25:astore_2        
		}
	//*  12   26:aload_2         
	//*  13   27:areturn         
	//*  14   28:astore_2        
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #153 <Method Class Object.getClass()>
	//*  17   33:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  18   36:astore_1        
	//*  19   37:new             #178 <Class StringBuilder>
	//*  20   40:dup             
	//*  21   41:bipush          43
	//*  22   43:aload_1         
	//*  23   44:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  24   47:invokevirtual   #128 <Method int String.length()>
	//*  25   50:iadd            
	//*  26   51:invokespecial   #181 <Method void StringBuilder(int)>
	//*  27   54:astore_3        
	//*  28   55:aload_3         
	//*  29   56:aload_1         
	//*  30   57:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  31   60:pop             
	//*  32   61:aload_3         
	//*  33   62:ldc2            #298 <String " does not implement getAlpnSelectedProtocol">
	//*  34   65:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  35   68:pop             
	//*  36   69:new             #89  <Class IllegalArgumentException>
	//*  37   72:dup             
	//*  38   73:aload_3         
	//*  39   74:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  40   77:aload_2         
	//*  41   78:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  42   81:athrow          
		catch(InvocationTargetException invocationtargetexception)
	//*  43   82:astore_2        
		{
			Throwable throwable = invocationtargetexception.getCause();
	//   44   83:aload_2         
	//   45   84:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   46   87:astore_3        
			if(throwable instanceof RuntimeException)
	//*  47   88:aload_3         
	//*  48   89:instanceof      #200 <Class RuntimeException>
	//*  49   92:ifeq            100
			{
				throw (RuntimeException)throwable;
	//   50   95:aload_3         
	//   51   96:checkcast       #200 <Class RuntimeException>
	//   52   99:athrow          
			} else
			{
				socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   53  100:aload_1         
	//   54  101:invokevirtual   #153 <Method Class Object.getClass()>
	//   55  104:invokestatic    #124 <Method String String.valueOf(Object)>
	//   56  107:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder(44 + String.valueOf(((Object) (socket))).length());
	//   57  108:new             #178 <Class StringBuilder>
	//   58  111:dup             
	//   59  112:bipush          44
	//   60  114:aload_1         
	//   61  115:invokestatic    #124 <Method String String.valueOf(Object)>
	//   62  118:invokevirtual   #128 <Method int String.length()>
	//   63  121:iadd            
	//   64  122:invokespecial   #181 <Method void StringBuilder(int)>
	//   65  125:astore_3        
				stringbuilder1.append("Failed to invoke getAlpnSelectedProtocol on ");
	//   66  126:aload_3         
	//   67  127:ldc2            #300 <String "Failed to invoke getAlpnSelectedProtocol on ">
	//   68  130:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   69  133:pop             
				stringbuilder1.append(((String) (socket)));
	//   70  134:aload_3         
	//   71  135:aload_1         
	//   72  136:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   73  139:pop             
				throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (invocationtargetexception)));
	//   74  140:new             #200 <Class RuntimeException>
	//   75  143:dup             
	//   76  144:aload_3         
	//   77  145:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   78  148:aload_2         
	//   79  149:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   80  152:athrow          
			}
		}
		catch(Object obj)
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(43 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement getAlpnSelectedProtocol");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
		}
		return abyte0;
	}

	public String[] getDefaultCipherSuites()
	{
		return zzcx().getDefaultCipherSuites();
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method SSLSocketFactory zzcx()>
	//    2    4:invokevirtual   #304 <Method String[] SSLSocketFactory.getDefaultCipherSuites()>
	//    3    7:areturn         
	}

	public byte[] getNpnSelectedProtocol(Socket socket)
	{
		byte abyte0[];
		try
		{
			abyte0 = (byte[])((Object) (socket)).getClass().getMethod("getNpnSelectedProtocol", new Class[0]).invoke(((Object) (socket)), new Object[0]);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #153 <Method Class Object.getClass()>
	//    2    4:ldc2            #306 <String "getNpnSelectedProtocol">
	//    3    7:iconst_0        
	//    4    8:anewarray       Class[]
	//    5   11:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:anewarray       Object[]
	//    9   19:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   10   22:checkcast       #217 <Class byte[]>
	//   11   25:astore_2        
		}
	//*  12   26:aload_2         
	//*  13   27:areturn         
	//*  14   28:astore_2        
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #153 <Method Class Object.getClass()>
	//*  17   33:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  18   36:astore_1        
	//*  19   37:new             #178 <Class StringBuilder>
	//*  20   40:dup             
	//*  21   41:bipush          42
	//*  22   43:aload_1         
	//*  23   44:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  24   47:invokevirtual   #128 <Method int String.length()>
	//*  25   50:iadd            
	//*  26   51:invokespecial   #181 <Method void StringBuilder(int)>
	//*  27   54:astore_3        
	//*  28   55:aload_3         
	//*  29   56:aload_1         
	//*  30   57:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  31   60:pop             
	//*  32   61:aload_3         
	//*  33   62:ldc2            #308 <String " does not implement getNpnSelectedProtocol">
	//*  34   65:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  35   68:pop             
	//*  36   69:new             #89  <Class IllegalArgumentException>
	//*  37   72:dup             
	//*  38   73:aload_3         
	//*  39   74:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  40   77:aload_2         
	//*  41   78:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  42   81:athrow          
		catch(InvocationTargetException invocationtargetexception)
	//*  43   82:astore_2        
		{
			Throwable throwable = invocationtargetexception.getCause();
	//   44   83:aload_2         
	//   45   84:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   46   87:astore_3        
			if(throwable instanceof RuntimeException)
	//*  47   88:aload_3         
	//*  48   89:instanceof      #200 <Class RuntimeException>
	//*  49   92:ifeq            100
			{
				throw (RuntimeException)throwable;
	//   50   95:aload_3         
	//   51   96:checkcast       #200 <Class RuntimeException>
	//   52   99:athrow          
			} else
			{
				socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   53  100:aload_1         
	//   54  101:invokevirtual   #153 <Method Class Object.getClass()>
	//   55  104:invokestatic    #124 <Method String String.valueOf(Object)>
	//   56  107:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder(43 + String.valueOf(((Object) (socket))).length());
	//   57  108:new             #178 <Class StringBuilder>
	//   58  111:dup             
	//   59  112:bipush          43
	//   60  114:aload_1         
	//   61  115:invokestatic    #124 <Method String String.valueOf(Object)>
	//   62  118:invokevirtual   #128 <Method int String.length()>
	//   63  121:iadd            
	//   64  122:invokespecial   #181 <Method void StringBuilder(int)>
	//   65  125:astore_3        
				stringbuilder1.append("Failed to invoke getNpnSelectedProtocol on ");
	//   66  126:aload_3         
	//   67  127:ldc2            #310 <String "Failed to invoke getNpnSelectedProtocol on ">
	//   68  130:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   69  133:pop             
				stringbuilder1.append(((String) (socket)));
	//   70  134:aload_3         
	//   71  135:aload_1         
	//   72  136:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   73  139:pop             
				throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (invocationtargetexception)));
	//   74  140:new             #200 <Class RuntimeException>
	//   75  143:dup             
	//   76  144:aload_3         
	//   77  145:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   78  148:aload_2         
	//   79  149:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   80  152:athrow          
			}
		}
		catch(Object obj)
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(42 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement getNpnSelectedProtocol");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
		}
		return abyte0;
	}

	public String[] getSupportedCipherSuites()
	{
		return zzcx().getSupportedCipherSuites();
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method SSLSocketFactory zzcx()>
	//    2    4:invokevirtual   #313 <Method String[] SSLSocketFactory.getSupportedCipherSuites()>
	//    3    7:areturn         
	}

	public void setAlpnProtocols(byte abyte0[][])
	{
		zzvl = zza(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #316 <Method byte[] zza(byte[][])>
	//    3    5:putfield        #53  <Field byte[] zzvl>
	//    4    8:return          
	}

	public void setChannelIdPrivateKey(PrivateKey privatekey)
	{
		zzvm = privatekey;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field PrivateKey zzvm>
	//    3    5:return          
	}

	public void setHostname(Socket socket, String s)
	{
		Throwable throwable;
		try
		{
			((Object) (socket)).getClass().getMethod("setHostname", new Class[] {
				java/lang/String
			}).invoke(((Object) (socket)), new Object[] {
				s
			});
	//    0    0:aload_1         
	//    1    1:invokevirtual   #153 <Method Class Object.getClass()>
	//    2    4:ldc2            #319 <String "setHostname">
	//    3    7:iconst_1        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #120 <Class String>
	//    8   15:aastore         
	//    9   16:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//   10   19:aload_1         
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_2         
	//   16   27:aastore         
	//   17   28:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   18   31:pop             
			return;
	//   19   32:return          
		}
	//*  20   33:astore_2        
	//*  21   34:aload_1         
	//*  22   35:invokevirtual   #153 <Method Class Object.getClass()>
	//*  23   38:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  24   41:astore_1        
	//*  25   42:new             #178 <Class StringBuilder>
	//*  26   45:dup             
	//*  27   46:bipush          31
	//*  28   48:aload_1         
	//*  29   49:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  30   52:invokevirtual   #128 <Method int String.length()>
	//*  31   55:iadd            
	//*  32   56:invokespecial   #181 <Method void StringBuilder(int)>
	//*  33   59:astore_3        
	//*  34   60:aload_3         
	//*  35   61:aload_1         
	//*  36   62:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  37   65:pop             
	//*  38   66:aload_3         
	//*  39   67:ldc2            #321 <String " does not implement setHostname">
	//*  40   70:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  41   73:pop             
	//*  42   74:new             #89  <Class IllegalArgumentException>
	//*  43   77:dup             
	//*  44   78:aload_3         
	//*  45   79:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  46   82:aload_2         
	//*  47   83:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  48   86:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  49   87:astore_2        
		{
			throwable = ((InvocationTargetException) (s)).getCause();
	//   50   88:aload_2         
	//   51   89:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   52   92:astore_3        
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(31 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setHostname");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (s)));
		}
		if(throwable instanceof RuntimeException)
	//*  53   93:aload_3         
	//*  54   94:instanceof      #200 <Class RuntimeException>
	//*  55   97:ifeq            105
		{
			throw (RuntimeException)throwable;
	//   56  100:aload_3         
	//   57  101:checkcast       #200 <Class RuntimeException>
	//   58  104:athrow          
		} else
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   59  105:aload_1         
	//   60  106:invokevirtual   #153 <Method Class Object.getClass()>
	//   61  109:invokestatic    #124 <Method String String.valueOf(Object)>
	//   62  112:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder(32 + String.valueOf(((Object) (socket))).length());
	//   63  113:new             #178 <Class StringBuilder>
	//   64  116:dup             
	//   65  117:bipush          32
	//   66  119:aload_1         
	//   67  120:invokestatic    #124 <Method String String.valueOf(Object)>
	//   68  123:invokevirtual   #128 <Method int String.length()>
	//   69  126:iadd            
	//   70  127:invokespecial   #181 <Method void StringBuilder(int)>
	//   71  130:astore_3        
			stringbuilder1.append("Failed to invoke setHostname on ");
	//   72  131:aload_3         
	//   73  132:ldc2            #323 <String "Failed to invoke setHostname on ">
	//   74  135:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   75  138:pop             
			stringbuilder1.append(((String) (socket)));
	//   76  139:aload_3         
	//   77  140:aload_1         
	//   78  141:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   79  144:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (s)));
	//   80  145:new             #200 <Class RuntimeException>
	//   81  148:dup             
	//   82  149:aload_3         
	//   83  150:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   84  153:aload_2         
	//   85  154:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   86  157:athrow          
		}
	}

	public void setKeyManagers(KeyManager akeymanager[])
	{
		zzvj = akeymanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field KeyManager[] zzvj>
		zzvh = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #45  <Field SSLSocketFactory zzvh>
		zzvg = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #43  <Field SSLSocketFactory zzvg>
	//    9   15:return          
	}

	public void setNpnProtocols(byte abyte0[][])
	{
		zzvk = zza(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #316 <Method byte[] zza(byte[][])>
	//    3    5:putfield        #51  <Field byte[] zzvk>
	//    4    8:return          
	}

	public void setSoWriteTimeout(Socket socket, int i)
		throws SocketException
	{
		try
		{
			((Object) (socket)).getClass().getMethod("setSoWriteTimeout", new Class[] {
				Integer.TYPE
			}).invoke(((Object) (socket)), new Object[] {
				Integer.valueOf(i)
			});
	//    0    0:aload_1         
	//    1    1:invokevirtual   #153 <Method Class Object.getClass()>
	//    2    4:ldc2            #329 <String "setSoWriteTimeout">
	//    3    7:iconst_1        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:getstatic       #163 <Field Class Integer.TYPE>
	//    8   16:aastore         
	//    9   17:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:anewarray       Object[]
	//   13   25:dup             
	//   14   26:iconst_0        
	//   15   27:iload_2         
	//   16   28:invokestatic    #170 <Method Integer Integer.valueOf(int)>
	//   17   31:aastore         
	//   18   32:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   19   35:pop             
			return;
	//   20   36:return          
		}
	//*  21   37:astore_3        
	//*  22   38:aload_1         
	//*  23   39:invokevirtual   #153 <Method Class Object.getClass()>
	//*  24   42:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  25   45:astore_1        
	//*  26   46:new             #178 <Class StringBuilder>
	//*  27   49:dup             
	//*  28   50:bipush          37
	//*  29   52:aload_1         
	//*  30   53:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  31   56:invokevirtual   #128 <Method int String.length()>
	//*  32   59:iadd            
	//*  33   60:invokespecial   #181 <Method void StringBuilder(int)>
	//*  34   63:astore          4
	//*  35   65:aload           4
	//*  36   67:aload_1         
	//*  37   68:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  38   71:pop             
	//*  39   72:aload           4
	//*  40   74:ldc2            #331 <String " does not implement setSoWriteTimeout">
	//*  41   77:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  42   80:pop             
	//*  43   81:new             #89  <Class IllegalArgumentException>
	//*  44   84:dup             
	//*  45   85:aload           4
	//*  46   87:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  47   90:aload_3         
	//*  48   91:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  49   94:athrow          
		catch(InvocationTargetException invocationtargetexception)
	//*  50   95:astore_3        
		{
			Throwable throwable = invocationtargetexception.getCause();
	//   51   96:aload_3         
	//   52   97:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   53  100:astore          4
			if(throwable instanceof SocketException)
	//*  54  102:aload           4
	//*  55  104:instanceof      #328 <Class SocketException>
	//*  56  107:ifeq            116
				throw (SocketException)throwable;
	//   57  110:aload           4
	//   58  112:checkcast       #328 <Class SocketException>
	//   59  115:athrow          
			if(throwable instanceof RuntimeException)
	//*  60  116:aload           4
	//*  61  118:instanceof      #200 <Class RuntimeException>
	//*  62  121:ifeq            130
			{
				throw (RuntimeException)throwable;
	//   63  124:aload           4
	//   64  126:checkcast       #200 <Class RuntimeException>
	//   65  129:athrow          
			} else
			{
				socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   66  130:aload_1         
	//   67  131:invokevirtual   #153 <Method Class Object.getClass()>
	//   68  134:invokestatic    #124 <Method String String.valueOf(Object)>
	//   69  137:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder(38 + String.valueOf(((Object) (socket))).length());
	//   70  138:new             #178 <Class StringBuilder>
	//   71  141:dup             
	//   72  142:bipush          38
	//   73  144:aload_1         
	//   74  145:invokestatic    #124 <Method String String.valueOf(Object)>
	//   75  148:invokevirtual   #128 <Method int String.length()>
	//   76  151:iadd            
	//   77  152:invokespecial   #181 <Method void StringBuilder(int)>
	//   78  155:astore          4
				stringbuilder1.append("Failed to invoke setSoWriteTimeout on ");
	//   79  157:aload           4
	//   80  159:ldc2            #333 <String "Failed to invoke setSoWriteTimeout on ">
	//   81  162:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   82  165:pop             
				stringbuilder1.append(((String) (socket)));
	//   83  166:aload           4
	//   84  168:aload_1         
	//   85  169:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   86  172:pop             
				throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (invocationtargetexception)));
	//   87  173:new             #200 <Class RuntimeException>
	//   88  176:dup             
	//   89  177:aload           4
	//   90  179:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   91  182:aload_3         
	//   92  183:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   93  186:athrow          
			}
		}
		catch(Object obj)
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(37 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setSoWriteTimeout");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
		}
	}

	public void setTrustManagers(TrustManager atrustmanager[])
	{
		zzvi = atrustmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field TrustManager[] zzvi>
		zzvh = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #45  <Field SSLSocketFactory zzvh>
	//    6   10:return          
	}

	public void setUseSessionTickets(Socket socket, boolean flag)
	{
		try
		{
			((Object) (socket)).getClass().getMethod("setUseSessionTickets", new Class[] {
				Boolean.TYPE
			}).invoke(((Object) (socket)), new Object[] {
				Boolean.valueOf(flag)
			});
	//    0    0:aload_1         
	//    1    1:invokevirtual   #153 <Method Class Object.getClass()>
	//    2    4:ldc2            #338 <String "setUseSessionTickets">
	//    3    7:iconst_1        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:getstatic       #341 <Field Class Boolean.TYPE>
	//    8   16:aastore         
	//    9   17:invokevirtual   #167 <Method Method Class.getMethod(String, Class[])>
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:anewarray       Object[]
	//   13   25:dup             
	//   14   26:iconst_0        
	//   15   27:iload_2         
	//   16   28:invokestatic    #344 <Method Boolean Boolean.valueOf(boolean)>
	//   17   31:aastore         
	//   18   32:invokevirtual   #176 <Method Object Method.invoke(Object, Object[])>
	//   19   35:pop             
			return;
	//   20   36:return          
		}
	//*  21   37:astore_3        
	//*  22   38:aload_1         
	//*  23   39:invokevirtual   #153 <Method Class Object.getClass()>
	//*  24   42:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  25   45:astore_1        
	//*  26   46:new             #178 <Class StringBuilder>
	//*  27   49:dup             
	//*  28   50:bipush          40
	//*  29   52:aload_1         
	//*  30   53:invokestatic    #124 <Method String String.valueOf(Object)>
	//*  31   56:invokevirtual   #128 <Method int String.length()>
	//*  32   59:iadd            
	//*  33   60:invokespecial   #181 <Method void StringBuilder(int)>
	//*  34   63:astore          4
	//*  35   65:aload           4
	//*  36   67:aload_1         
	//*  37   68:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  38   71:pop             
	//*  39   72:aload           4
	//*  40   74:ldc2            #346 <String " does not implement setUseSessionTickets">
	//*  41   77:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  42   80:pop             
	//*  43   81:new             #89  <Class IllegalArgumentException>
	//*  44   84:dup             
	//*  45   85:aload           4
	//*  46   87:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  47   90:aload_3         
	//*  48   91:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  49   94:athrow          
		catch(InvocationTargetException invocationtargetexception)
	//*  50   95:astore_3        
		{
			Throwable throwable = invocationtargetexception.getCause();
	//   51   96:aload_3         
	//   52   97:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   53  100:astore          4
			if(throwable instanceof RuntimeException)
	//*  54  102:aload           4
	//*  55  104:instanceof      #200 <Class RuntimeException>
	//*  56  107:ifeq            116
			{
				throw (RuntimeException)throwable;
	//   57  110:aload           4
	//   58  112:checkcast       #200 <Class RuntimeException>
	//   59  115:athrow          
			} else
			{
				socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   60  116:aload_1         
	//   61  117:invokevirtual   #153 <Method Class Object.getClass()>
	//   62  120:invokestatic    #124 <Method String String.valueOf(Object)>
	//   63  123:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder(41 + String.valueOf(((Object) (socket))).length());
	//   64  124:new             #178 <Class StringBuilder>
	//   65  127:dup             
	//   66  128:bipush          41
	//   67  130:aload_1         
	//   68  131:invokestatic    #124 <Method String String.valueOf(Object)>
	//   69  134:invokevirtual   #128 <Method int String.length()>
	//   70  137:iadd            
	//   71  138:invokespecial   #181 <Method void StringBuilder(int)>
	//   72  141:astore          4
				stringbuilder1.append("Failed to invoke setUseSessionTickets on ");
	//   73  143:aload           4
	//   74  145:ldc2            #348 <String "Failed to invoke setUseSessionTickets on ">
	//   75  148:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   76  151:pop             
				stringbuilder1.append(((String) (socket)));
	//   77  152:aload           4
	//   78  154:aload_1         
	//   79  155:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   80  158:pop             
				throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (invocationtargetexception)));
	//   81  159:new             #200 <Class RuntimeException>
	//   82  162:dup             
	//   83  163:aload           4
	//   84  165:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   85  168:aload_3         
	//   86  169:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   87  172:athrow          
			}
		}
		catch(Object obj)
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			StringBuilder stringbuilder = new StringBuilder(40 + String.valueOf(((Object) (socket))).length());
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setUseSessionTickets");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
		}
	}

	private static final TrustManager zzvf[] = {
		new zza()
	};
	private final Context mContext;
	private SSLSocketFactory zzvg;
	private SSLSocketFactory zzvh;
	private TrustManager zzvi[];
	private KeyManager zzvj[];
	private byte zzvk[];
	private byte zzvl[];
	private PrivateKey zzvm;
	private final int zzvn;
	private final boolean zzvo;
	private final boolean zzvp;
	private final String zzvq;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       TrustManager[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #33  <Class zza>
	//    5    9:dup             
	//    6   10:invokespecial   #36  <Method void zza()>
	//    7   13:aastore         
	//    8   14:putstatic       #38  <Field TrustManager[] zzvf>
	//*   9   17:return          
	}
}
