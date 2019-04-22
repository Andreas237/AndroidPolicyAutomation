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
		if(socket instanceof SSLSocket)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #87  <Class SSLSocket>
	//*   2    4:ifeq            90
		{
			socket = ((Socket) ((SSLSocket)socket));
	//    3    7:aload_0         
	//    4    8:checkcast       #87  <Class SSLSocket>
	//    5   11:astore_0        
			((SSLSocket) (socket)).startHandshake();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #90  <Method void SSLSocket.startHandshake()>
			socket = ((Socket) (((SSLSocket) (socket)).getSession()));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #94  <Method javax.net.ssl.SSLSession SSLSocket.getSession()>
	//   10   20:astore_0        
			if(socket != null)
	//*  11   21:aload_0         
	//*  12   22:ifnull          80
			{
				if(!HttpsURLConnection.getDefaultHostnameVerifier().verify(s, ((javax.net.ssl.SSLSession) (socket))))
	//*  13   25:invokestatic    #100 <Method HostnameVerifier HttpsURLConnection.getDefaultHostnameVerifier()>
	//*  14   28:aload_1         
	//*  15   29:aload_0         
	//*  16   30:invokeinterface #106 <Method boolean HostnameVerifier.verify(String, javax.net.ssl.SSLSession)>
	//*  17   35:ifne            79
				{
					socket = ((Socket) (String.valueOf(((Object) (s)))));
	//   18   38:aload_1         
	//   19   39:invokestatic    #112 <Method String String.valueOf(Object)>
	//   20   42:astore_0        
					if(((String) (socket)).length() != 0)
	//*  21   43:aload_0         
	//*  22   44:invokevirtual   #116 <Method int String.length()>
	//*  23   47:ifeq            60
						socket = ((Socket) ("Cannot verify hostname: ".concat(((String) (socket)))));
	//   24   50:ldc1            #118 <String "Cannot verify hostname: ">
	//   25   52:aload_0         
	//   26   53:invokevirtual   #122 <Method String String.concat(String)>
	//   27   56:astore_0        
					else
	//*  28   57:goto            70
						socket = ((Socket) (new String("Cannot verify hostname: ")));
	//   29   60:new             #108 <Class String>
	//   30   63:dup             
	//   31   64:ldc1            #118 <String "Cannot verify hostname: ">
	//   32   66:invokespecial   #125 <Method void String(String)>
	//   33   69:astore_0        
					throw new SSLPeerUnverifiedException(((String) (socket)));
	//   34   70:new             #127 <Class SSLPeerUnverifiedException>
	//   35   73:dup             
	//   36   74:aload_0         
	//   37   75:invokespecial   #128 <Method void SSLPeerUnverifiedException(String)>
	//   38   78:athrow          
				} else
				{
					return;
	//   39   79:return          
				}
			} else
			{
				throw new SSLException("Cannot verify SSL socket without session");
	//   40   80:new             #130 <Class SSLException>
	//   41   83:dup             
	//   42   84:ldc1            #132 <String "Cannot verify SSL socket without session">
	//   43   86:invokespecial   #133 <Method void SSLException(String)>
	//   44   89:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Attempt to verify non-SSL socket");
	//   45   90:new             #135 <Class IllegalArgumentException>
	//   46   93:dup             
	//   47   94:ldc1            #137 <String "Attempt to verify non-SSL socket">
	//   48   96:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   49   99:athrow          
		}
	}

	private static void zza(Socket socket, int i)
	{
		if(socket == null)
			break MISSING_BLOCK_LABEL_167;
	//    0    0:aload_0         
	//    1    1:ifnull          167
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
		Object obj;
		obj;
	//   23   40:astore_2        
		break MISSING_BLOCK_LABEL_45;
	//   24   41:goto            45
		obj;
	//   25   44:astore_2        
		socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   26   45:aload_0         
	//   27   46:invokevirtual   #153 <Method Class Object.getClass()>
	//   28   49:invokestatic    #112 <Method String String.valueOf(Object)>
	//   29   52:astore_0        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 45);
	//   30   53:new             #178 <Class StringBuilder>
	//   31   56:dup             
	//   32   57:aload_0         
	//   33   58:invokestatic    #112 <Method String String.valueOf(Object)>
	//   34   61:invokevirtual   #116 <Method int String.length()>
	//   35   64:bipush          45
	//   36   66:iadd            
	//   37   67:invokespecial   #181 <Method void StringBuilder(int)>
	//   38   70:astore_3        
		stringbuilder.append(((String) (socket)));
	//   39   71:aload_3         
	//   40   72:aload_0         
	//   41   73:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   42   76:pop             
		stringbuilder.append(" does not implement setSocketHandshakeTimeout");
	//   43   77:aload_3         
	//   44   78:ldc1            #187 <String " does not implement setSocketHandshakeTimeout">
	//   45   80:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
		throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
	//   47   84:new             #135 <Class IllegalArgumentException>
	//   48   87:dup             
	//   49   88:aload_3         
	//   50   89:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   51   92:aload_2         
	//   52   93:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//   53   96:athrow          
		obj;
	//   54   97:astore_2        
		Throwable throwable = ((InvocationTargetException) (obj)).getCause();
	//   55   98:aload_2         
	//   56   99:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   57  102:astore_3        
		if(throwable instanceof RuntimeException)
	//*  58  103:aload_3         
	//*  59  104:instanceof      #200 <Class RuntimeException>
	//*  60  107:ifeq            115
		{
			throw (RuntimeException)throwable;
	//   61  110:aload_3         
	//   62  111:checkcast       #200 <Class RuntimeException>
	//   63  114:athrow          
		} else
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   64  115:aload_0         
	//   65  116:invokevirtual   #153 <Method Class Object.getClass()>
	//   66  119:invokestatic    #112 <Method String String.valueOf(Object)>
	//   67  122:astore_0        
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (socket))).length() + 46);
	//   68  123:new             #178 <Class StringBuilder>
	//   69  126:dup             
	//   70  127:aload_0         
	//   71  128:invokestatic    #112 <Method String String.valueOf(Object)>
	//   72  131:invokevirtual   #116 <Method int String.length()>
	//   73  134:bipush          46
	//   74  136:iadd            
	//   75  137:invokespecial   #181 <Method void StringBuilder(int)>
	//   76  140:astore_3        
			stringbuilder1.append("Failed to invoke setSocketHandshakeTimeout on ");
	//   77  141:aload_3         
	//   78  142:ldc1            #202 <String "Failed to invoke setSocketHandshakeTimeout on ">
	//   79  144:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   80  147:pop             
			stringbuilder1.append(((String) (socket)));
	//   81  148:aload_3         
	//   82  149:aload_0         
	//   83  150:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   84  153:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (obj)));
	//   85  154:new             #200 <Class RuntimeException>
	//   86  157:dup             
	//   87  158:aload_3         
	//   88  159:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   89  162:aload_2         
	//   90  163:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   91  166:athrow          
		}
	//   92  167:return          
	}

	private static void zza(Socket socket, PrivateKey privatekey)
	{
		if(socket != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          163
		{
			StringBuilder stringbuilder;
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
	//*  23   37:goto            41
	//*  24   40:astore_1        
	//*  25   41:aload_0         
	//*  26   42:invokevirtual   #153 <Method Class Object.getClass()>
	//*  27   45:invokestatic    #112 <Method String String.valueOf(Object)>
	//*  28   48:astore_0        
	//*  29   49:new             #178 <Class StringBuilder>
	//*  30   52:dup             
	//*  31   53:aload_0         
	//*  32   54:invokestatic    #112 <Method String String.valueOf(Object)>
	//*  33   57:invokevirtual   #116 <Method int String.length()>
	//*  34   60:bipush          42
	//*  35   62:iadd            
	//*  36   63:invokespecial   #181 <Method void StringBuilder(int)>
	//*  37   66:astore_2        
	//*  38   67:aload_2         
	//*  39   68:aload_0         
	//*  40   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  41   72:pop             
	//*  42   73:aload_2         
	//*  43   74:ldc1            #211 <String " does not implement setChannelIdPrivateKey">
	//*  44   76:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  45   79:pop             
	//*  46   80:new             #135 <Class IllegalArgumentException>
	//*  47   83:dup             
	//*  48   84:aload_2         
	//*  49   85:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  50   88:aload_1         
	//*  51   89:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  52   92:athrow          
			// Misplaced declaration of an exception variable
			catch(PrivateKey privatekey)
	//*  53   93:astore_1        
			{
				Throwable throwable = ((InvocationTargetException) (privatekey)).getCause();
	//   54   94:aload_1         
	//   55   95:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   56   98:astore_2        
				if(throwable instanceof RuntimeException)
	//*  57   99:aload_2         
	//*  58  100:instanceof      #200 <Class RuntimeException>
	//*  59  103:ifeq            111
				{
					throw (RuntimeException)throwable;
	//   60  106:aload_2         
	//   61  107:checkcast       #200 <Class RuntimeException>
	//   62  110:athrow          
				} else
				{
					socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   63  111:aload_0         
	//   64  112:invokevirtual   #153 <Method Class Object.getClass()>
	//   65  115:invokestatic    #112 <Method String String.valueOf(Object)>
	//   66  118:astore_0        
					StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (socket))).length() + 43);
	//   67  119:new             #178 <Class StringBuilder>
	//   68  122:dup             
	//   69  123:aload_0         
	//   70  124:invokestatic    #112 <Method String String.valueOf(Object)>
	//   71  127:invokevirtual   #116 <Method int String.length()>
	//   72  130:bipush          43
	//   73  132:iadd            
	//   74  133:invokespecial   #181 <Method void StringBuilder(int)>
	//   75  136:astore_2        
					stringbuilder1.append("Failed to invoke setChannelIdPrivateKey on ");
	//   76  137:aload_2         
	//   77  138:ldc1            #213 <String "Failed to invoke setChannelIdPrivateKey on ">
	//   78  140:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   79  143:pop             
					stringbuilder1.append(((String) (socket)));
	//   80  144:aload_2         
	//   81  145:aload_0         
	//   82  146:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   83  149:pop             
					throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (privatekey)));
	//   84  150:new             #200 <Class RuntimeException>
	//   85  153:dup             
	//   86  154:aload_2         
	//   87  155:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   88  158:aload_1         
	//   89  159:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   90  162:athrow          
				}
			}
			// Misplaced declaration of an exception variable
			catch(PrivateKey privatekey) { }
			// Misplaced declaration of an exception variable
			catch(PrivateKey privatekey) { }
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 42);
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setChannelIdPrivateKey");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (privatekey)));
		} else
		{
			return;
	//   91  163:return          
		}
	}

	private static void zza(Socket socket, byte abyte0[])
	{
		if(socket != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          163
		{
			StringBuilder stringbuilder;
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
	//*  23   37:goto            41
	//*  24   40:astore_1        
	//*  25   41:aload_0         
	//*  26   42:invokevirtual   #153 <Method Class Object.getClass()>
	//*  27   45:invokestatic    #112 <Method String String.valueOf(Object)>
	//*  28   48:astore_0        
	//*  29   49:new             #178 <Class StringBuilder>
	//*  30   52:dup             
	//*  31   53:aload_0         
	//*  32   54:invokestatic    #112 <Method String String.valueOf(Object)>
	//*  33   57:invokevirtual   #116 <Method int String.length()>
	//*  34   60:bipush          35
	//*  35   62:iadd            
	//*  36   63:invokespecial   #181 <Method void StringBuilder(int)>
	//*  37   66:astore_2        
	//*  38   67:aload_2         
	//*  39   68:aload_0         
	//*  40   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  41   72:pop             
	//*  42   73:aload_2         
	//*  43   74:ldc1            #219 <String " does not implement setNpnProtocols">
	//*  44   76:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  45   79:pop             
	//*  46   80:new             #135 <Class IllegalArgumentException>
	//*  47   83:dup             
	//*  48   84:aload_2         
	//*  49   85:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  50   88:aload_1         
	//*  51   89:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  52   92:athrow          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  53   93:astore_1        
			{
				Throwable throwable = ((InvocationTargetException) (abyte0)).getCause();
	//   54   94:aload_1         
	//   55   95:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   56   98:astore_2        
				if(throwable instanceof RuntimeException)
	//*  57   99:aload_2         
	//*  58  100:instanceof      #200 <Class RuntimeException>
	//*  59  103:ifeq            111
				{
					throw (RuntimeException)throwable;
	//   60  106:aload_2         
	//   61  107:checkcast       #200 <Class RuntimeException>
	//   62  110:athrow          
				} else
				{
					socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   63  111:aload_0         
	//   64  112:invokevirtual   #153 <Method Class Object.getClass()>
	//   65  115:invokestatic    #112 <Method String String.valueOf(Object)>
	//   66  118:astore_0        
					StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (socket))).length() + 36);
	//   67  119:new             #178 <Class StringBuilder>
	//   68  122:dup             
	//   69  123:aload_0         
	//   70  124:invokestatic    #112 <Method String String.valueOf(Object)>
	//   71  127:invokevirtual   #116 <Method int String.length()>
	//   72  130:bipush          36
	//   73  132:iadd            
	//   74  133:invokespecial   #181 <Method void StringBuilder(int)>
	//   75  136:astore_2        
					stringbuilder1.append("Failed to invoke setNpnProtocols on ");
	//   76  137:aload_2         
	//   77  138:ldc1            #221 <String "Failed to invoke setNpnProtocols on ">
	//   78  140:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   79  143:pop             
					stringbuilder1.append(((String) (socket)));
	//   80  144:aload_2         
	//   81  145:aload_0         
	//   82  146:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   83  149:pop             
					throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (abyte0)));
	//   84  150:new             #200 <Class RuntimeException>
	//   85  153:dup             
	//   86  154:aload_2         
	//   87  155:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   88  158:aload_1         
	//   89  159:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   90  162:athrow          
				}
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[]) { }
			// Misplaced declaration of an exception variable
			catch(byte abyte0[]) { }
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 35);
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setNpnProtocols");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (abyte0)));
		} else
		{
			return;
	//   91  163:return          
		}
	}

	private static transient byte[] zza(byte abyte0[][])
	{
		if(abyte0.length != 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifeq            169
		{
			int k = abyte0.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore_3        
			int i = 0;
	//    6    8:iconst_0        
	//    7    9:istore_1        
			int j = 0;
	//    8   10:iconst_0        
	//    9   11:istore_2        
			while(i < k) 
	//*  10   12:iload_1         
	//*  11   13:iload_3         
	//*  12   14:icmpge          91
			{
				byte abyte1[] = abyte0[i];
	//   13   17:aload_0         
	//   14   18:iload_1         
	//   15   19:aaload          
	//   16   20:astore          6
				if(abyte1.length != 0 && abyte1.length <= 255)
	//*  17   22:aload           6
	//*  18   24:arraylength     
	//*  19   25:ifeq            52
	//*  20   28:aload           6
	//*  21   30:arraylength     
	//*  22   31:sipush          255
	//*  23   34:icmpgt          52
				{
					j += abyte1.length + 1;
	//   24   37:iload_2         
	//   25   38:aload           6
	//   26   40:arraylength     
	//   27   41:iconst_1        
	//   28   42:iadd            
	//   29   43:iadd            
	//   30   44:istore_2        
					i++;
	//   31   45:iload_1         
	//   32   46:iconst_1        
	//   33   47:iadd            
	//   34   48:istore_1        
				} else
	//*  35   49:goto            12
				{
					i = abyte1.length;
	//   36   52:aload           6
	//   37   54:arraylength     
	//   38   55:istore_1        
					abyte0 = ((byte [][]) (new StringBuilder(44)));
	//   39   56:new             #178 <Class StringBuilder>
	//   40   59:dup             
	//   41   60:bipush          44
	//   42   62:invokespecial   #181 <Method void StringBuilder(int)>
	//   43   65:astore_0        
					((StringBuilder) (abyte0)).append("s.length == 0 || s.length > 255: ");
	//   44   66:aload_0         
	//   45   67:ldc1            #224 <String "s.length == 0 || s.length > 255: ">
	//   46   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   47   72:pop             
					((StringBuilder) (abyte0)).append(i);
	//   48   73:aload_0         
	//   49   74:iload_1         
	//   50   75:invokevirtual   #227 <Method StringBuilder StringBuilder.append(int)>
	//   51   78:pop             
					throw new IllegalArgumentException(((StringBuilder) (abyte0)).toString());
	//   52   79:new             #135 <Class IllegalArgumentException>
	//   53   82:dup             
	//   54   83:aload_0         
	//   55   84:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   56   87:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//   57   90:athrow          
				}
			}
			byte abyte2[] = new byte[j];
	//   58   91:iload_2         
	//   59   92:newarray        byte[]
	//   60   94:astore          6
			int i1 = abyte0.length;
	//   61   96:aload_0         
	//   62   97:arraylength     
	//   63   98:istore          4
			j = 0;
	//   64  100:iconst_0        
	//   65  101:istore_2        
			i = 0;
	//   66  102:iconst_0        
	//   67  103:istore_1        
			for(; j < i1; j++)
	//*  68  104:iload_2         
	//*  69  105:iload           4
	//*  70  107:icmpge          166
			{
				byte abyte3[] = abyte0[j];
	//   71  110:aload_0         
	//   72  111:iload_2         
	//   73  112:aaload          
	//   74  113:astore          7
				abyte2[i] = (byte)abyte3.length;
	//   75  115:aload           6
	//   76  117:iload_1         
	//   77  118:aload           7
	//   78  120:arraylength     
	//   79  121:int2byte        
	//   80  122:bastore         
				int j1 = abyte3.length;
	//   81  123:aload           7
	//   82  125:arraylength     
	//   83  126:istore          5
				i++;
	//   84  128:iload_1         
	//   85  129:iconst_1        
	//   86  130:iadd            
	//   87  131:istore_1        
				for(int l = 0; l < j1;)
	//*  88  132:iconst_0        
	//*  89  133:istore_3        
	//*  90  134:iload_3         
	//*  91  135:iload           5
	//*  92  137:icmpge          159
				{
					abyte2[i] = abyte3[l];
	//   93  140:aload           6
	//   94  142:iload_1         
	//   95  143:aload           7
	//   96  145:iload_3         
	//   97  146:baload          
	//   98  147:bastore         
					l++;
	//   99  148:iload_3         
	//  100  149:iconst_1        
	//  101  150:iadd            
	//  102  151:istore_3        
					i++;
	//  103  152:iload_1         
	//  104  153:iconst_1        
	//  105  154:iadd            
	//  106  155:istore_1        
				}

			}

	//  107  156:goto            134
	//  108  159:iload_2         
	//  109  160:iconst_1        
	//  110  161:iadd            
	//  111  162:istore_2        
	//* 112  163:goto            104
			return abyte2;
	//  113  166:aload           6
	//  114  168:areturn         
		} else
		{
			throw new IllegalArgumentException("items.length == 0");
	//  115  169:new             #135 <Class IllegalArgumentException>
	//  116  172:dup             
	//  117  173:ldc1            #229 <String "items.length == 0">
	//  118  175:invokespecial   #138 <Method void IllegalArgumentException(String)>
	//  119  178:athrow          
		}
	}

	private static void zzb(Socket socket, byte abyte0[])
	{
		if(socket != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          163
		{
			StringBuilder stringbuilder;
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
	//*  23   37:goto            41
	//*  24   40:astore_1        
	//*  25   41:aload_0         
	//*  26   42:invokevirtual   #153 <Method Class Object.getClass()>
	//*  27   45:invokestatic    #112 <Method String String.valueOf(Object)>
	//*  28   48:astore_0        
	//*  29   49:new             #178 <Class StringBuilder>
	//*  30   52:dup             
	//*  31   53:aload_0         
	//*  32   54:invokestatic    #112 <Method String String.valueOf(Object)>
	//*  33   57:invokevirtual   #116 <Method int String.length()>
	//*  34   60:bipush          36
	//*  35   62:iadd            
	//*  36   63:invokespecial   #181 <Method void StringBuilder(int)>
	//*  37   66:astore_2        
	//*  38   67:aload_2         
	//*  39   68:aload_0         
	//*  40   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  41   72:pop             
	//*  42   73:aload_2         
	//*  43   74:ldc1            #234 <String " does not implement setAlpnProtocols">
	//*  44   76:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  45   79:pop             
	//*  46   80:new             #135 <Class IllegalArgumentException>
	//*  47   83:dup             
	//*  48   84:aload_2         
	//*  49   85:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  50   88:aload_1         
	//*  51   89:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  52   92:athrow          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  53   93:astore_1        
			{
				Throwable throwable = ((InvocationTargetException) (abyte0)).getCause();
	//   54   94:aload_1         
	//   55   95:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   56   98:astore_2        
				if(throwable instanceof RuntimeException)
	//*  57   99:aload_2         
	//*  58  100:instanceof      #200 <Class RuntimeException>
	//*  59  103:ifeq            111
				{
					throw (RuntimeException)throwable;
	//   60  106:aload_2         
	//   61  107:checkcast       #200 <Class RuntimeException>
	//   62  110:athrow          
				} else
				{
					socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   63  111:aload_0         
	//   64  112:invokevirtual   #153 <Method Class Object.getClass()>
	//   65  115:invokestatic    #112 <Method String String.valueOf(Object)>
	//   66  118:astore_0        
					StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (socket))).length() + 37);
	//   67  119:new             #178 <Class StringBuilder>
	//   68  122:dup             
	//   69  123:aload_0         
	//   70  124:invokestatic    #112 <Method String String.valueOf(Object)>
	//   71  127:invokevirtual   #116 <Method int String.length()>
	//   72  130:bipush          37
	//   73  132:iadd            
	//   74  133:invokespecial   #181 <Method void StringBuilder(int)>
	//   75  136:astore_2        
					stringbuilder1.append("Failed to invoke setAlpnProtocols on ");
	//   76  137:aload_2         
	//   77  138:ldc1            #236 <String "Failed to invoke setAlpnProtocols on ">
	//   78  140:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   79  143:pop             
					stringbuilder1.append(((String) (socket)));
	//   80  144:aload_2         
	//   81  145:aload_0         
	//   82  146:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   83  149:pop             
					throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (abyte0)));
	//   84  150:new             #200 <Class RuntimeException>
	//   85  153:dup             
	//   86  154:aload_2         
	//   87  155:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   88  158:aload_1         
	//   89  159:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   90  162:athrow          
				}
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[]) { }
			// Misplaced declaration of an exception variable
			catch(byte abyte0[]) { }
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
			stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 36);
			stringbuilder.append(((String) (socket)));
			stringbuilder.append(" does not implement setAlpnProtocols");
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (abyte0)));
		} else
		{
			return;
	//   91  163:return          
		}
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
		byte abyte0[] = (byte[])((Object) (socket)).getClass().getMethod("getAlpnSelectedProtocol", new Class[0]).invoke(((Object) (socket)), new Object[0]);
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
		return abyte0;
	//   12   26:aload_2         
	//   13   27:areturn         
		Object obj;
		obj;
	//   14   28:astore_2        
		break MISSING_BLOCK_LABEL_33;
	//   15   29:goto            33
		obj;
	//   16   32:astore_2        
		socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #153 <Method Class Object.getClass()>
	//   19   37:invokestatic    #112 <Method String String.valueOf(Object)>
	//   20   40:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 43);
	//   21   41:new             #178 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:aload_1         
	//   24   46:invokestatic    #112 <Method String String.valueOf(Object)>
	//   25   49:invokevirtual   #116 <Method int String.length()>
	//   26   52:bipush          43
	//   27   54:iadd            
	//   28   55:invokespecial   #181 <Method void StringBuilder(int)>
	//   29   58:astore_3        
		stringbuilder.append(((String) (socket)));
	//   30   59:aload_3         
	//   31   60:aload_1         
	//   32   61:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append(" does not implement getAlpnSelectedProtocol");
	//   34   65:aload_3         
	//   35   66:ldc2            #298 <String " does not implement getAlpnSelectedProtocol">
	//   36   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
		throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
	//   38   73:new             #135 <Class IllegalArgumentException>
	//   39   76:dup             
	//   40   77:aload_3         
	//   41   78:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   42   81:aload_2         
	//   43   82:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//   44   85:athrow          
		obj;
	//   45   86:astore_2        
		Throwable throwable = ((InvocationTargetException) (obj)).getCause();
	//   46   87:aload_2         
	//   47   88:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   48   91:astore_3        
		if(throwable instanceof RuntimeException)
	//*  49   92:aload_3         
	//*  50   93:instanceof      #200 <Class RuntimeException>
	//*  51   96:ifeq            104
		{
			throw (RuntimeException)throwable;
	//   52   99:aload_3         
	//   53  100:checkcast       #200 <Class RuntimeException>
	//   54  103:athrow          
		} else
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   55  104:aload_1         
	//   56  105:invokevirtual   #153 <Method Class Object.getClass()>
	//   57  108:invokestatic    #112 <Method String String.valueOf(Object)>
	//   58  111:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (socket))).length() + 44);
	//   59  112:new             #178 <Class StringBuilder>
	//   60  115:dup             
	//   61  116:aload_1         
	//   62  117:invokestatic    #112 <Method String String.valueOf(Object)>
	//   63  120:invokevirtual   #116 <Method int String.length()>
	//   64  123:bipush          44
	//   65  125:iadd            
	//   66  126:invokespecial   #181 <Method void StringBuilder(int)>
	//   67  129:astore_3        
			stringbuilder1.append("Failed to invoke getAlpnSelectedProtocol on ");
	//   68  130:aload_3         
	//   69  131:ldc2            #300 <String "Failed to invoke getAlpnSelectedProtocol on ">
	//   70  134:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
			stringbuilder1.append(((String) (socket)));
	//   72  138:aload_3         
	//   73  139:aload_1         
	//   74  140:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   75  143:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (obj)));
	//   76  144:new             #200 <Class RuntimeException>
	//   77  147:dup             
	//   78  148:aload_3         
	//   79  149:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   80  152:aload_2         
	//   81  153:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   82  156:athrow          
		}
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
		byte abyte0[] = (byte[])((Object) (socket)).getClass().getMethod("getNpnSelectedProtocol", new Class[0]).invoke(((Object) (socket)), new Object[0]);
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
		return abyte0;
	//   12   26:aload_2         
	//   13   27:areturn         
		Object obj;
		obj;
	//   14   28:astore_2        
		break MISSING_BLOCK_LABEL_33;
	//   15   29:goto            33
		obj;
	//   16   32:astore_2        
		socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #153 <Method Class Object.getClass()>
	//   19   37:invokestatic    #112 <Method String String.valueOf(Object)>
	//   20   40:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 42);
	//   21   41:new             #178 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:aload_1         
	//   24   46:invokestatic    #112 <Method String String.valueOf(Object)>
	//   25   49:invokevirtual   #116 <Method int String.length()>
	//   26   52:bipush          42
	//   27   54:iadd            
	//   28   55:invokespecial   #181 <Method void StringBuilder(int)>
	//   29   58:astore_3        
		stringbuilder.append(((String) (socket)));
	//   30   59:aload_3         
	//   31   60:aload_1         
	//   32   61:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append(" does not implement getNpnSelectedProtocol");
	//   34   65:aload_3         
	//   35   66:ldc2            #308 <String " does not implement getNpnSelectedProtocol">
	//   36   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
		throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
	//   38   73:new             #135 <Class IllegalArgumentException>
	//   39   76:dup             
	//   40   77:aload_3         
	//   41   78:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   42   81:aload_2         
	//   43   82:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//   44   85:athrow          
		obj;
	//   45   86:astore_2        
		Throwable throwable = ((InvocationTargetException) (obj)).getCause();
	//   46   87:aload_2         
	//   47   88:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   48   91:astore_3        
		if(throwable instanceof RuntimeException)
	//*  49   92:aload_3         
	//*  50   93:instanceof      #200 <Class RuntimeException>
	//*  51   96:ifeq            104
		{
			throw (RuntimeException)throwable;
	//   52   99:aload_3         
	//   53  100:checkcast       #200 <Class RuntimeException>
	//   54  103:athrow          
		} else
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   55  104:aload_1         
	//   56  105:invokevirtual   #153 <Method Class Object.getClass()>
	//   57  108:invokestatic    #112 <Method String String.valueOf(Object)>
	//   58  111:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (socket))).length() + 43);
	//   59  112:new             #178 <Class StringBuilder>
	//   60  115:dup             
	//   61  116:aload_1         
	//   62  117:invokestatic    #112 <Method String String.valueOf(Object)>
	//   63  120:invokevirtual   #116 <Method int String.length()>
	//   64  123:bipush          43
	//   65  125:iadd            
	//   66  126:invokespecial   #181 <Method void StringBuilder(int)>
	//   67  129:astore_3        
			stringbuilder1.append("Failed to invoke getNpnSelectedProtocol on ");
	//   68  130:aload_3         
	//   69  131:ldc2            #310 <String "Failed to invoke getNpnSelectedProtocol on ">
	//   70  134:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
			stringbuilder1.append(((String) (socket)));
	//   72  138:aload_3         
	//   73  139:aload_1         
	//   74  140:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   75  143:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (obj)));
	//   76  144:new             #200 <Class RuntimeException>
	//   77  147:dup             
	//   78  148:aload_3         
	//   79  149:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   80  152:aload_2         
	//   81  153:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   82  156:athrow          
		}
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
		StringBuilder stringbuilder;
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
	//    7   13:ldc1            #108 <Class String>
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
	//*  21   34:goto            38
	//*  22   37:astore_2        
	//*  23   38:aload_1         
	//*  24   39:invokevirtual   #153 <Method Class Object.getClass()>
	//*  25   42:invokestatic    #112 <Method String String.valueOf(Object)>
	//*  26   45:astore_1        
	//*  27   46:new             #178 <Class StringBuilder>
	//*  28   49:dup             
	//*  29   50:aload_1         
	//*  30   51:invokestatic    #112 <Method String String.valueOf(Object)>
	//*  31   54:invokevirtual   #116 <Method int String.length()>
	//*  32   57:bipush          31
	//*  33   59:iadd            
	//*  34   60:invokespecial   #181 <Method void StringBuilder(int)>
	//*  35   63:astore_3        
	//*  36   64:aload_3         
	//*  37   65:aload_1         
	//*  38   66:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  39   69:pop             
	//*  40   70:aload_3         
	//*  41   71:ldc2            #321 <String " does not implement setHostname">
	//*  42   74:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//*  43   77:pop             
	//*  44   78:new             #135 <Class IllegalArgumentException>
	//*  45   81:dup             
	//*  46   82:aload_3         
	//*  47   83:invokevirtual   #191 <Method String StringBuilder.toString()>
	//*  48   86:aload_2         
	//*  49   87:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//*  50   90:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  51   91:astore_2        
		{
			Throwable throwable = ((InvocationTargetException) (s)).getCause();
	//   52   92:aload_2         
	//   53   93:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   54   96:astore_3        
			if(throwable instanceof RuntimeException)
	//*  55   97:aload_3         
	//*  56   98:instanceof      #200 <Class RuntimeException>
	//*  57  101:ifeq            109
			{
				throw (RuntimeException)throwable;
	//   58  104:aload_3         
	//   59  105:checkcast       #200 <Class RuntimeException>
	//   60  108:athrow          
			} else
			{
				socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   61  109:aload_1         
	//   62  110:invokevirtual   #153 <Method Class Object.getClass()>
	//   63  113:invokestatic    #112 <Method String String.valueOf(Object)>
	//   64  116:astore_1        
				StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (socket))).length() + 32);
	//   65  117:new             #178 <Class StringBuilder>
	//   66  120:dup             
	//   67  121:aload_1         
	//   68  122:invokestatic    #112 <Method String String.valueOf(Object)>
	//   69  125:invokevirtual   #116 <Method int String.length()>
	//   70  128:bipush          32
	//   71  130:iadd            
	//   72  131:invokespecial   #181 <Method void StringBuilder(int)>
	//   73  134:astore_3        
				stringbuilder1.append("Failed to invoke setHostname on ");
	//   74  135:aload_3         
	//   75  136:ldc2            #323 <String "Failed to invoke setHostname on ">
	//   76  139:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   77  142:pop             
				stringbuilder1.append(((String) (socket)));
	//   78  143:aload_3         
	//   79  144:aload_1         
	//   80  145:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   81  148:pop             
				throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (s)));
	//   82  149:new             #200 <Class RuntimeException>
	//   83  152:dup             
	//   84  153:aload_3         
	//   85  154:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   86  157:aload_2         
	//   87  158:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   88  161:athrow          
			}
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
		// Misplaced declaration of an exception variable
		catch(String s) { }
		socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
		stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 31);
		stringbuilder.append(((String) (socket)));
		stringbuilder.append(" does not implement setHostname");
		throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (s)));
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
		Object obj;
		obj;
	//   21   37:astore_3        
		break MISSING_BLOCK_LABEL_42;
	//   22   38:goto            42
		obj;
	//   23   41:astore_3        
		socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   24   42:aload_1         
	//   25   43:invokevirtual   #153 <Method Class Object.getClass()>
	//   26   46:invokestatic    #112 <Method String String.valueOf(Object)>
	//   27   49:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 37);
	//   28   50:new             #178 <Class StringBuilder>
	//   29   53:dup             
	//   30   54:aload_1         
	//   31   55:invokestatic    #112 <Method String String.valueOf(Object)>
	//   32   58:invokevirtual   #116 <Method int String.length()>
	//   33   61:bipush          37
	//   34   63:iadd            
	//   35   64:invokespecial   #181 <Method void StringBuilder(int)>
	//   36   67:astore          4
		stringbuilder.append(((String) (socket)));
	//   37   69:aload           4
	//   38   71:aload_1         
	//   39   72:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
		stringbuilder.append(" does not implement setSoWriteTimeout");
	//   41   76:aload           4
	//   42   78:ldc2            #331 <String " does not implement setSoWriteTimeout">
	//   43   81:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
		throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
	//   45   85:new             #135 <Class IllegalArgumentException>
	//   46   88:dup             
	//   47   89:aload           4
	//   48   91:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   49   94:aload_3         
	//   50   95:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//   51   98:athrow          
		obj;
	//   52   99:astore_3        
		Object obj1 = ((Object) (((InvocationTargetException) (obj)).getCause()));
	//   53  100:aload_3         
	//   54  101:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   55  104:astore          4
		if(!(obj1 instanceof SocketException))
	//*  56  106:aload           4
	//*  57  108:instanceof      #328 <Class SocketException>
	//*  58  111:ifne            185
		{
			if(obj1 instanceof RuntimeException)
	//*  59  114:aload           4
	//*  60  116:instanceof      #200 <Class RuntimeException>
	//*  61  119:ifeq            128
			{
				throw (RuntimeException)obj1;
	//   62  122:aload           4
	//   63  124:checkcast       #200 <Class RuntimeException>
	//   64  127:athrow          
			} else
			{
				socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   65  128:aload_1         
	//   66  129:invokevirtual   #153 <Method Class Object.getClass()>
	//   67  132:invokestatic    #112 <Method String String.valueOf(Object)>
	//   68  135:astore_1        
				obj1 = ((Object) (new StringBuilder(String.valueOf(((Object) (socket))).length() + 38)));
	//   69  136:new             #178 <Class StringBuilder>
	//   70  139:dup             
	//   71  140:aload_1         
	//   72  141:invokestatic    #112 <Method String String.valueOf(Object)>
	//   73  144:invokevirtual   #116 <Method int String.length()>
	//   74  147:bipush          38
	//   75  149:iadd            
	//   76  150:invokespecial   #181 <Method void StringBuilder(int)>
	//   77  153:astore          4
				((StringBuilder) (obj1)).append("Failed to invoke setSoWriteTimeout on ");
	//   78  155:aload           4
	//   79  157:ldc2            #333 <String "Failed to invoke setSoWriteTimeout on ">
	//   80  160:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   81  163:pop             
				((StringBuilder) (obj1)).append(((String) (socket)));
	//   82  164:aload           4
	//   83  166:aload_1         
	//   84  167:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   85  170:pop             
				throw new RuntimeException(((StringBuilder) (obj1)).toString(), ((Throwable) (obj)));
	//   86  171:new             #200 <Class RuntimeException>
	//   87  174:dup             
	//   88  175:aload           4
	//   89  177:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   90  180:aload_3         
	//   91  181:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   92  184:athrow          
			}
		} else
		{
			throw (SocketException)obj1;
	//   93  185:aload           4
	//   94  187:checkcast       #328 <Class SocketException>
	//   95  190:athrow          
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
		Object obj;
		obj;
	//   21   37:astore_3        
		break MISSING_BLOCK_LABEL_42;
	//   22   38:goto            42
		obj;
	//   23   41:astore_3        
		socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   24   42:aload_1         
	//   25   43:invokevirtual   #153 <Method Class Object.getClass()>
	//   26   46:invokestatic    #112 <Method String String.valueOf(Object)>
	//   27   49:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (socket))).length() + 40);
	//   28   50:new             #178 <Class StringBuilder>
	//   29   53:dup             
	//   30   54:aload_1         
	//   31   55:invokestatic    #112 <Method String String.valueOf(Object)>
	//   32   58:invokevirtual   #116 <Method int String.length()>
	//   33   61:bipush          40
	//   34   63:iadd            
	//   35   64:invokespecial   #181 <Method void StringBuilder(int)>
	//   36   67:astore          4
		stringbuilder.append(((String) (socket)));
	//   37   69:aload           4
	//   38   71:aload_1         
	//   39   72:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
		stringbuilder.append(" does not implement setUseSessionTickets");
	//   41   76:aload           4
	//   42   78:ldc2            #346 <String " does not implement setUseSessionTickets">
	//   43   81:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
		throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj)));
	//   45   85:new             #135 <Class IllegalArgumentException>
	//   46   88:dup             
	//   47   89:aload           4
	//   48   91:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   49   94:aload_3         
	//   50   95:invokespecial   #194 <Method void IllegalArgumentException(String, Throwable)>
	//   51   98:athrow          
		obj;
	//   52   99:astore_3        
		Throwable throwable = ((InvocationTargetException) (obj)).getCause();
	//   53  100:aload_3         
	//   54  101:invokevirtual   #198 <Method Throwable InvocationTargetException.getCause()>
	//   55  104:astore          4
		if(throwable instanceof RuntimeException)
	//*  56  106:aload           4
	//*  57  108:instanceof      #200 <Class RuntimeException>
	//*  58  111:ifeq            120
		{
			throw (RuntimeException)throwable;
	//   59  114:aload           4
	//   60  116:checkcast       #200 <Class RuntimeException>
	//   61  119:athrow          
		} else
		{
			socket = ((Socket) (String.valueOf(((Object) (((Object) (socket)).getClass())))));
	//   62  120:aload_1         
	//   63  121:invokevirtual   #153 <Method Class Object.getClass()>
	//   64  124:invokestatic    #112 <Method String String.valueOf(Object)>
	//   65  127:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (socket))).length() + 41);
	//   66  128:new             #178 <Class StringBuilder>
	//   67  131:dup             
	//   68  132:aload_1         
	//   69  133:invokestatic    #112 <Method String String.valueOf(Object)>
	//   70  136:invokevirtual   #116 <Method int String.length()>
	//   71  139:bipush          41
	//   72  141:iadd            
	//   73  142:invokespecial   #181 <Method void StringBuilder(int)>
	//   74  145:astore          4
			stringbuilder1.append("Failed to invoke setUseSessionTickets on ");
	//   75  147:aload           4
	//   76  149:ldc2            #348 <String "Failed to invoke setUseSessionTickets on ">
	//   77  152:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   78  155:pop             
			stringbuilder1.append(((String) (socket)));
	//   79  156:aload           4
	//   80  158:aload_1         
	//   81  159:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   82  162:pop             
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (obj)));
	//   83  163:new             #200 <Class RuntimeException>
	//   84  166:dup             
	//   85  167:aload           4
	//   86  169:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   87  172:aload_3         
	//   88  173:invokespecial   #203 <Method void RuntimeException(String, Throwable)>
	//   89  176:athrow          
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
