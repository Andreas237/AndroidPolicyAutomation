// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.algorithm;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.*;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.*;

public class RSA
{

	public RSA()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] decrtyByPrivate(byte abyte0[], byte abyte1[], byte abyte2[], boolean flag)
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(abyte1 == null || abyte1.length < 1)
	//*   8   12:aload_1         
	//*   9   13:ifnull          22
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:iconst_1        
	//*  13   19:icmpge          24
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		if(abyte2 == null || abyte2.length < 1)
	//*  16   24:aload_2         
	//*  17   25:ifnull          34
	//*  18   28:aload_2         
	//*  19   29:arraylength     
	//*  20   30:iconst_1        
	//*  21   31:icmpge          36
			return null;
	//   22   34:aconst_null     
	//   23   35:areturn         
		abyte1 = ((byte []) (new RSAPrivateKeySpec(new BigInteger(1, abyte0), new BigInteger(1, abyte1))));
	//   24   36:new             #56  <Class RSAPrivateKeySpec>
	//   25   39:dup             
	//   26   40:new             #58  <Class BigInteger>
	//   27   43:dup             
	//   28   44:iconst_1        
	//   29   45:aload_0         
	//   30   46:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   31   49:new             #58  <Class BigInteger>
	//   32   52:dup             
	//   33   53:iconst_1        
	//   34   54:aload_1         
	//   35   55:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   36   58:invokespecial   #64  <Method void RSAPrivateKeySpec(BigInteger, BigInteger)>
	//   37   61:astore_1        
		abyte0 = null;
	//   38   62:aconst_null     
	//   39   63:astore_0        
		abyte1 = ((byte []) (KeyFactory.getInstance("RSA").generatePrivate(((java.security.spec.KeySpec) (abyte1)))));
	//   40   64:ldc1            #11  <String "RSA">
	//   41   66:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//   42   69:aload_1         
	//   43   70:invokevirtual   #73  <Method PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   44   73:astore_1        
		abyte0 = abyte1;
	//   45   74:aload_1         
	//   46   75:astore_0        
		break MISSING_BLOCK_LABEL_148;
	//   47   76:goto            148
		abyte1;
	//   48   79:astore_1        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u79C1\u94A5\u89E3\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   49   80:getstatic       #44  <Field FMLog log>
	//   50   83:ldc1            #2   <Class RSA>
	//   51   85:invokevirtual   #79  <Method String Class.getName()>
	//   52   88:ldc1            #81  <String "RSA\u79C1\u94A5\u89E3\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   53   90:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte1))));
	//   54   95:getstatic       #44  <Field FMLog log>
	//   55   98:ldc1            #2   <Class RSA>
	//   56  100:invokevirtual   #79  <Method String Class.getName()>
	//   57  103:aload_1         
	//   58  104:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   59  107:invokeinterface #87  <Method void FMLog.error(String, String)>
		break MISSING_BLOCK_LABEL_148;
	//   60  112:goto            148
		abyte1;
	//   61  115:astore_1        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u79C1\u94A5\u89E3\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   62  116:getstatic       #44  <Field FMLog log>
	//   63  119:ldc1            #2   <Class RSA>
	//   64  121:invokevirtual   #79  <Method String Class.getName()>
	//   65  124:ldc1            #81  <String "RSA\u79C1\u94A5\u89E3\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   66  126:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte1))));
	//   67  131:getstatic       #44  <Field FMLog log>
	//   68  134:ldc1            #2   <Class RSA>
	//   69  136:invokevirtual   #79  <Method String Class.getName()>
	//   70  139:aload_1         
	//   71  140:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   72  143:invokeinterface #87  <Method void FMLog.error(String, String)>
		return doFinal(2, ((Key) (abyte0)), abyte2, flag);
	//   73  148:iconst_2        
	//   74  149:aload_0         
	//   75  150:aload_2         
	//   76  151:iload_3         
	//   77  152:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//   78  155:areturn         
	}

	public static byte[] decryptByPrivate(byte abyte0[], byte abyte1[], boolean flag)
	{
		Object obj;
		obj = ((Object) (new PKCS8EncodedKeySpec(abyte0)));
	//    0    0:new             #101 <Class PKCS8EncodedKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #104 <Method void PKCS8EncodedKeySpec(byte[])>
	//    4    8:astore_3        
		abyte0 = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		obj = ((Object) (KeyFactory.getInstance("RSA").generatePrivate(((java.security.spec.KeySpec) (obj)))));
	//    7   11:ldc1            #11  <String "RSA">
	//    8   13:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//    9   16:aload_3         
	//   10   17:invokevirtual   #73  <Method PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   11   20:astore_3        
		abyte0 = ((byte []) (obj));
	//   12   21:aload_3         
	//   13   22:astore_0        
		break MISSING_BLOCK_LABEL_95;
	//   14   23:goto            95
		Object obj1;
		obj1;
	//   15   26:astore_3        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
	//   16   27:getstatic       #44  <Field FMLog log>
	//   17   30:ldc1            #2   <Class RSA>
	//   18   32:invokevirtual   #79  <Method String Class.getName()>
	//   19   35:ldc1            #106 <String "RSA\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//   20   37:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (obj1))));
	//   21   42:getstatic       #44  <Field FMLog log>
	//   22   45:ldc1            #2   <Class RSA>
	//   23   47:invokevirtual   #79  <Method String Class.getName()>
	//   24   50:aload_3         
	//   25   51:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   26   54:invokeinterface #87  <Method void FMLog.error(String, String)>
		break MISSING_BLOCK_LABEL_95;
	//   27   59:goto            95
		obj1;
	//   28   62:astore_3        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
	//   29   63:getstatic       #44  <Field FMLog log>
	//   30   66:ldc1            #2   <Class RSA>
	//   31   68:invokevirtual   #79  <Method String Class.getName()>
	//   32   71:ldc1            #106 <String "RSA\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//   33   73:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (obj1))));
	//   34   78:getstatic       #44  <Field FMLog log>
	//   35   81:ldc1            #2   <Class RSA>
	//   36   83:invokevirtual   #79  <Method String Class.getName()>
	//   37   86:aload_3         
	//   38   87:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   39   90:invokeinterface #87  <Method void FMLog.error(String, String)>
		return doFinal(2, ((Key) (abyte0)), abyte1, flag);
	//   40   95:iconst_2        
	//   41   96:aload_0         
	//   42   97:aload_1         
	//   43   98:iload_2         
	//   44   99:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//   45  102:areturn         
	}

	public static byte[] decryptByPublic(PublicKey publickey, byte abyte0[], boolean flag)
	{
		return doFinal(2, ((Key) (publickey)), abyte0, flag);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//    5    7:areturn         
	}

	public static byte[] decryptByPublic(byte abyte0[], byte abyte1[], byte abyte2[], boolean flag)
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(abyte1 == null || abyte1.length < 1)
	//*   8   12:aload_1         
	//*   9   13:ifnull          22
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:iconst_1        
	//*  13   19:icmpge          24
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		if(abyte2 == null || abyte2.length < 1)
	//*  16   24:aload_2         
	//*  17   25:ifnull          34
	//*  18   28:aload_2         
	//*  19   29:arraylength     
	//*  20   30:iconst_1        
	//*  21   31:icmpge          36
			return null;
	//   22   34:aconst_null     
	//   23   35:areturn         
		abyte1 = ((byte []) (new RSAPublicKeySpec(new BigInteger(1, abyte0), new BigInteger(1, abyte1))));
	//   24   36:new             #110 <Class RSAPublicKeySpec>
	//   25   39:dup             
	//   26   40:new             #58  <Class BigInteger>
	//   27   43:dup             
	//   28   44:iconst_1        
	//   29   45:aload_0         
	//   30   46:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   31   49:new             #58  <Class BigInteger>
	//   32   52:dup             
	//   33   53:iconst_1        
	//   34   54:aload_1         
	//   35   55:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   36   58:invokespecial   #111 <Method void RSAPublicKeySpec(BigInteger, BigInteger)>
	//   37   61:astore_1        
		abyte0 = null;
	//   38   62:aconst_null     
	//   39   63:astore_0        
		abyte1 = ((byte []) (KeyFactory.getInstance("RSA").generatePublic(((java.security.spec.KeySpec) (abyte1)))));
	//   40   64:ldc1            #11  <String "RSA">
	//   41   66:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//   42   69:aload_1         
	//   43   70:invokevirtual   #115 <Method PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   44   73:astore_1        
		abyte0 = abyte1;
	//   45   74:aload_1         
	//   46   75:astore_0        
		break MISSING_BLOCK_LABEL_148;
	//   47   76:goto            148
		abyte1;
	//   48   79:astore_1        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
	//   49   80:getstatic       #44  <Field FMLog log>
	//   50   83:ldc1            #2   <Class RSA>
	//   51   85:invokevirtual   #79  <Method String Class.getName()>
	//   52   88:ldc1            #106 <String "RSA\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//   53   90:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte1))));
	//   54   95:getstatic       #44  <Field FMLog log>
	//   55   98:ldc1            #2   <Class RSA>
	//   56  100:invokevirtual   #79  <Method String Class.getName()>
	//   57  103:aload_1         
	//   58  104:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   59  107:invokeinterface #87  <Method void FMLog.error(String, String)>
		break MISSING_BLOCK_LABEL_148;
	//   60  112:goto            148
		abyte1;
	//   61  115:astore_1        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
	//   62  116:getstatic       #44  <Field FMLog log>
	//   63  119:ldc1            #2   <Class RSA>
	//   64  121:invokevirtual   #79  <Method String Class.getName()>
	//   65  124:ldc1            #106 <String "RSA\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//   66  126:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte1))));
	//   67  131:getstatic       #44  <Field FMLog log>
	//   68  134:ldc1            #2   <Class RSA>
	//   69  136:invokevirtual   #79  <Method String Class.getName()>
	//   70  139:aload_1         
	//   71  140:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   72  143:invokeinterface #87  <Method void FMLog.error(String, String)>
		return doFinal(2, ((Key) (abyte0)), abyte2, flag);
	//   73  148:iconst_2        
	//   74  149:aload_0         
	//   75  150:aload_2         
	//   76  151:iload_3         
	//   77  152:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//   78  155:areturn         
	}

	private static byte[] doFinal(int i, Key key, byte abyte0[], boolean flag)
	{
		char c;
		byte abyte1[];
		byte abyte2[];
		byte abyte3[];
		byte abyte4[];
		byte abyte5[];
		byte abyte6[];
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          14
		obj2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          15
		obj3 = null;
	//    4    6:aconst_null     
	//    5    7:astore          16
		obj4 = null;
	//    6    9:aconst_null     
	//    7   10:astore          17
		obj5 = null;
	//    8   12:aconst_null     
	//    9   13:astore          18
		obj = null;
	//   10   15:aconst_null     
	//   11   16:astore          13
		c = '\0';
	//   12   18:iconst_0        
	//   13   19:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_59;
	//   14   21:iload_3         
	//   15   22:ifeq            59
		abyte2 = ((byte []) (obj));
	//   16   25:aload           13
	//   17   27:astore          7
		abyte3 = ((byte []) (obj1));
	//   18   29:aload           14
	//   19   31:astore          8
		abyte4 = ((byte []) (obj2));
	//   20   33:aload           15
	//   21   35:astore          9
		abyte5 = ((byte []) (obj3));
	//   22   37:aload           16
	//   23   39:astore          10
		abyte6 = ((byte []) (obj4));
	//   24   41:aload           17
	//   25   43:astore          11
		abyte1 = ((byte []) (obj5));
	//   26   45:aload           18
	//   27   47:astore          6
		Cipher cipher;
		cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	//   28   49:ldc1            #127 <String "RSA/ECB/PKCS1Padding">
	//   29   51:invokestatic    #132 <Method Cipher Cipher.getInstance(String)>
	//   30   54:astore          12
		break MISSING_BLOCK_LABEL_90;
	//   31   56:goto            90
		abyte2 = ((byte []) (obj));
	//   32   59:aload           13
	//   33   61:astore          7
		abyte3 = ((byte []) (obj1));
	//   34   63:aload           14
	//   35   65:astore          8
		abyte4 = ((byte []) (obj2));
	//   36   67:aload           15
	//   37   69:astore          9
		abyte5 = ((byte []) (obj3));
	//   38   71:aload           16
	//   39   73:astore          10
		abyte6 = ((byte []) (obj4));
	//   40   75:aload           17
	//   41   77:astore          11
		abyte1 = ((byte []) (obj5));
	//   42   79:aload           18
	//   43   81:astore          6
		cipher = Cipher.getInstance("RSA/ECB/NoPadding");
	//   44   83:ldc1            #134 <String "RSA/ECB/NoPadding">
	//   45   85:invokestatic    #132 <Method Cipher Cipher.getInstance(String)>
	//   46   88:astore          12
		abyte2 = ((byte []) (obj));
	//   47   90:aload           13
	//   48   92:astore          7
		abyte3 = ((byte []) (obj1));
	//   49   94:aload           14
	//   50   96:astore          8
		abyte4 = ((byte []) (obj2));
	//   51   98:aload           15
	//   52  100:astore          9
		abyte5 = ((byte []) (obj3));
	//   53  102:aload           16
	//   54  104:astore          10
		abyte6 = ((byte []) (obj4));
	//   55  106:aload           17
	//   56  108:astore          11
		abyte1 = ((byte []) (obj5));
	//   57  110:aload           18
	//   58  112:astore          6
		cipher.init(i, key);
	//   59  114:aload           12
	//   60  116:iload_0         
	//   61  117:aload_1         
	//   62  118:invokevirtual   #138 <Method void Cipher.init(int, Key)>
		int j;
		ByteArrayOutputStream bytearrayoutputstream;
		if(i == 2)
	//*  63  121:iload_0         
	//*  64  122:iconst_2        
	//*  65  123:icmpne          666
			c = '\200';
	//   66  126:sipush          128
	//   67  129:istore          4
	//*  68  131:goto            666
	//*  69  134:aload           13
	//*  70  136:astore          7
	//*  71  138:aload           14
	//*  72  140:astore          8
	//*  73  142:aload           15
	//*  74  144:astore          9
	//*  75  146:aload           16
	//*  76  148:astore          10
	//*  77  150:aload           17
	//*  78  152:astore          11
	//*  79  154:aload           18
	//*  80  156:astore          6
	//*  81  158:aload_2         
	//*  82  159:arraylength     
	//*  83  160:istore          5
	//*  84  162:aload           13
	//*  85  164:astore          7
	//*  86  166:aload           14
	//*  87  168:astore          8
	//*  88  170:aload           15
	//*  89  172:astore          9
	//*  90  174:aload           16
	//*  91  176:astore          10
	//*  92  178:aload           17
	//*  93  180:astore          11
	//*  94  182:aload           18
	//*  95  184:astore          6
	//*  96  186:new             #140 <Class ByteArrayOutputStream>
	//*  97  189:dup             
	//*  98  190:invokespecial   #141 <Method void ByteArrayOutputStream()>
	//*  99  193:astore          19
	//* 100  195:iconst_0        
	//* 101  196:istore_0        
	//* 102  197:goto            320
	//* 103  200:iload           5
	//* 104  202:iload_0         
	//* 105  203:isub            
	//* 106  204:iload           4
	//* 107  206:icmple          246
	//* 108  209:aload           13
	//* 109  211:astore          7
	//* 110  213:aload           14
	//* 111  215:astore          8
	//* 112  217:aload           15
	//* 113  219:astore          9
	//* 114  221:aload           16
	//* 115  223:astore          10
	//* 116  225:aload           17
	//* 117  227:astore          11
	//* 118  229:aload           18
	//* 119  231:astore          6
	//* 120  233:aload           12
	//* 121  235:aload_2         
	//* 122  236:iload_0         
	//* 123  237:iload           4
	//* 124  239:invokevirtual   #144 <Method byte[] Cipher.doFinal(byte[], int, int)>
	//* 125  242:astore_1        
	//* 126  243:goto            282
	//* 127  246:aload           13
	//* 128  248:astore          7
	//* 129  250:aload           14
	//* 130  252:astore          8
	//* 131  254:aload           15
	//* 132  256:astore          9
	//* 133  258:aload           16
	//* 134  260:astore          10
	//* 135  262:aload           17
	//* 136  264:astore          11
	//* 137  266:aload           18
	//* 138  268:astore          6
	//* 139  270:aload           12
	//* 140  272:aload_2         
	//* 141  273:iload_0         
	//* 142  274:iload           5
	//* 143  276:iload_0         
	//* 144  277:isub            
	//* 145  278:invokevirtual   #144 <Method byte[] Cipher.doFinal(byte[], int, int)>
	//* 146  281:astore_1        
	//* 147  282:aload           13
	//* 148  284:astore          7
	//* 149  286:aload           14
	//* 150  288:astore          8
	//* 151  290:aload           15
	//* 152  292:astore          9
	//* 153  294:aload           16
	//* 154  296:astore          10
	//* 155  298:aload           17
	//* 156  300:astore          11
	//* 157  302:aload           18
	//* 158  304:astore          6
	//* 159  306:aload           19
	//* 160  308:aload_1         
	//* 161  309:iconst_0        
	//* 162  310:aload_1         
	//* 163  311:arraylength     
	//* 164  312:invokevirtual   #148 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//* 165  315:iload_0         
	//* 166  316:iload           4
	//* 167  318:iadd            
	//* 168  319:istore_0        
	//* 169  320:iload           5
	//* 170  322:iload_0         
	//* 171  323:isub            
	//* 172  324:ifgt            200
	//* 173  327:aload           13
	//* 174  329:astore          7
	//* 175  331:aload           14
	//* 176  333:astore          8
	//* 177  335:aload           15
	//* 178  337:astore          9
	//* 179  339:aload           16
	//* 180  341:astore          10
	//* 181  343:aload           17
	//* 182  345:astore          11
	//* 183  347:aload           18
	//* 184  349:astore          6
	//* 185  351:aload           19
	//* 186  353:invokevirtual   #152 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//* 187  356:astore_1        
	//* 188  357:aload_1         
	//* 189  358:astore          7
	//* 190  360:aload_1         
	//* 191  361:astore          8
	//* 192  363:aload_1         
	//* 193  364:astore          9
	//* 194  366:aload_1         
	//* 195  367:astore          10
	//* 196  369:aload_1         
	//* 197  370:astore          11
	//* 198  372:aload_1         
	//* 199  373:astore          6
	//* 200  375:aload           19
	//* 201  377:invokevirtual   #155 <Method void ByteArrayOutputStream.close()>
	//* 202  380:aload_1         
	//* 203  381:astore          6
	//* 204  383:aload_1         
	//* 205  384:ifnull          663
	//* 206  387:iconst_0        
	//* 207  388:istore          4
	//* 208  390:iconst_0        
	//* 209  391:istore_0        
	//* 210  392:goto            395
	//* 211  395:aload_1         
	//* 212  396:astore          7
	//* 213  398:aload_1         
	//* 214  399:astore          8
	//* 215  401:aload_1         
	//* 216  402:astore          9
	//* 217  404:aload_1         
	//* 218  405:astore          10
	//* 219  407:aload_1         
	//* 220  408:astore          11
	//* 221  410:aload_1         
	//* 222  411:astore          6
	//* 223  413:iload_0         
	//* 224  414:aload_1         
	//* 225  415:arraylength     
	//* 226  416:icmplt          678
	//* 227  419:iload           4
	//* 228  421:istore_0        
	//* 229  422:aload_1         
	//* 230  423:astore          7
	//* 231  425:aload_1         
	//* 232  426:astore          8
	//* 233  428:aload_1         
	//* 234  429:astore          9
	//* 235  431:aload_1         
	//* 236  432:astore          10
	//* 237  434:aload_1         
	//* 238  435:astore          11
	//* 239  437:aload_1         
	//* 240  438:astore          6
	//* 241  440:aload_1         
	//* 242  441:iload_0         
	//* 243  442:aload_1         
	//* 244  443:arraylength     
	//* 245  444:invokestatic    #160 <Method byte[] FM_Bytes.copyOfRange(byte[], int, int)>
	//* 246  447:astore_1        
	//* 247  448:aload_1         
	//* 248  449:areturn         
	//* 249  450:astore_1        
	//* 250  451:getstatic       #44  <Field FMLog log>
	//* 251  454:ldc1            #2   <Class RSA>
	//* 252  456:invokevirtual   #79  <Method String Class.getName()>
	//* 253  459:ldc1            #162 <String "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//* 254  461:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 255  466:getstatic       #44  <Field FMLog log>
	//* 256  469:ldc1            #2   <Class RSA>
	//* 257  471:invokevirtual   #79  <Method String Class.getName()>
	//* 258  474:aload_1         
	//* 259  475:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//* 260  478:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 261  483:aload           7
	//* 262  485:areturn         
	//* 263  486:astore_1        
	//* 264  487:getstatic       #44  <Field FMLog log>
	//* 265  490:ldc1            #2   <Class RSA>
	//* 266  492:invokevirtual   #79  <Method String Class.getName()>
	//* 267  495:ldc1            #162 <String "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//* 268  497:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 269  502:getstatic       #44  <Field FMLog log>
	//* 270  505:ldc1            #2   <Class RSA>
	//* 271  507:invokevirtual   #79  <Method String Class.getName()>
	//* 272  510:aload_1         
	//* 273  511:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//* 274  514:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 275  519:aload           8
	//* 276  521:areturn         
	//* 277  522:astore_1        
	//* 278  523:getstatic       #44  <Field FMLog log>
	//* 279  526:ldc1            #2   <Class RSA>
	//* 280  528:invokevirtual   #79  <Method String Class.getName()>
	//* 281  531:ldc1            #162 <String "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//* 282  533:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 283  538:getstatic       #44  <Field FMLog log>
	//* 284  541:ldc1            #2   <Class RSA>
	//* 285  543:invokevirtual   #79  <Method String Class.getName()>
	//* 286  546:aload_1         
	//* 287  547:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//* 288  550:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 289  555:aload           9
	//* 290  557:areturn         
	//* 291  558:astore_1        
	//* 292  559:getstatic       #44  <Field FMLog log>
	//* 293  562:ldc1            #2   <Class RSA>
	//* 294  564:invokevirtual   #79  <Method String Class.getName()>
	//* 295  567:ldc1            #162 <String "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//* 296  569:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 297  574:getstatic       #44  <Field FMLog log>
	//* 298  577:ldc1            #2   <Class RSA>
	//* 299  579:invokevirtual   #79  <Method String Class.getName()>
	//* 300  582:aload_1         
	//* 301  583:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//* 302  586:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 303  591:aload           10
	//* 304  593:areturn         
	//* 305  594:astore_1        
	//* 306  595:getstatic       #44  <Field FMLog log>
	//* 307  598:ldc1            #2   <Class RSA>
	//* 308  600:invokevirtual   #79  <Method String Class.getName()>
	//* 309  603:ldc1            #162 <String "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//* 310  605:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 311  610:getstatic       #44  <Field FMLog log>
	//* 312  613:ldc1            #2   <Class RSA>
	//* 313  615:invokevirtual   #79  <Method String Class.getName()>
	//* 314  618:aload_1         
	//* 315  619:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//* 316  622:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 317  627:aload           11
	//* 318  629:areturn         
	//* 319  630:astore_1        
	//* 320  631:getstatic       #44  <Field FMLog log>
	//* 321  634:ldc1            #2   <Class RSA>
	//* 322  636:invokevirtual   #79  <Method String Class.getName()>
	//* 323  639:ldc1            #162 <String "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38">
	//* 324  641:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 325  646:getstatic       #44  <Field FMLog log>
	//* 326  649:ldc1            #2   <Class RSA>
	//* 327  651:invokevirtual   #79  <Method String Class.getName()>
	//* 328  654:aload_1         
	//* 329  655:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//* 330  658:invokeinterface #87  <Method void FMLog.error(String, String)>
	//* 331  663:aload           6
	//* 332  665:areturn         
		if(i == 1)
	//* 333  666:iload_0         
	//* 334  667:iconst_1        
	//* 335  668:icmpne          134
			c = 'u';
	//  336  671:bipush          117
	//  337  673:istore          4
		abyte2 = ((byte []) (obj));
		abyte3 = ((byte []) (obj1));
		abyte4 = ((byte []) (obj2));
		abyte5 = ((byte []) (obj3));
		abyte6 = ((byte []) (obj4));
		abyte1 = ((byte []) (obj5));
		j = abyte0.length;
		abyte2 = ((byte []) (obj));
		abyte3 = ((byte []) (obj1));
		abyte4 = ((byte []) (obj2));
		abyte5 = ((byte []) (obj3));
		abyte6 = ((byte []) (obj4));
		abyte1 = ((byte []) (obj5));
		bytearrayoutputstream = new ByteArrayOutputStream();
		i = 0;
		  goto _L1
_L6:
		if(j - i <= c) goto _L3; else goto _L2
_L2:
		abyte2 = ((byte []) (obj));
		abyte3 = ((byte []) (obj1));
		abyte4 = ((byte []) (obj2));
		abyte5 = ((byte []) (obj3));
		abyte6 = ((byte []) (obj4));
		abyte1 = ((byte []) (obj5));
		try
		{
			key = ((Key) (cipher.doFinal(abyte0, i, ((int) (c)))));
			break MISSING_BLOCK_LABEL_282;
		}
		// Misplaced declaration of an exception variable
		catch(Key key)
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (key))));
			return abyte2;
		}
		// Misplaced declaration of an exception variable
		catch(Key key)
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (key))));
			return abyte3;
		}
		// Misplaced declaration of an exception variable
		catch(Key key)
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (key))));
			return abyte4;
		}
		// Misplaced declaration of an exception variable
		catch(Key key)
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (key))));
			return abyte5;
		}
		// Misplaced declaration of an exception variable
		catch(Key key)
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (key))));
			return abyte6;
		}
		// Misplaced declaration of an exception variable
		catch(Key key)
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u52A0/\u89E3\u5BC6\u65F6\u51FA\u73B0\u5F02\u5E38");
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (key))));
		}
		  goto _L4
_L3:
		abyte2 = ((byte []) (obj));
		abyte3 = ((byte []) (obj1));
		abyte4 = ((byte []) (obj2));
		abyte5 = ((byte []) (obj3));
		abyte6 = ((byte []) (obj4));
		abyte1 = ((byte []) (obj5));
		key = ((Key) (cipher.doFinal(abyte0, i, j - i)));
		abyte2 = ((byte []) (obj));
		abyte3 = ((byte []) (obj1));
		abyte4 = ((byte []) (obj2));
		abyte5 = ((byte []) (obj3));
		abyte6 = ((byte []) (obj4));
		abyte1 = ((byte []) (obj5));
		bytearrayoutputstream.write(((byte []) (key)), 0, key.length);
		i += ((int) (c));
_L1:
		if(j - i > 0) goto _L6; else goto _L5
_L5:
		abyte2 = ((byte []) (obj));
		abyte3 = ((byte []) (obj1));
		abyte4 = ((byte []) (obj2));
		abyte5 = ((byte []) (obj3));
		abyte6 = ((byte []) (obj4));
		abyte1 = ((byte []) (obj5));
		key = ((Key) (bytearrayoutputstream.toByteArray()));
		abyte2 = ((byte []) (key));
		abyte3 = ((byte []) (key));
		abyte4 = ((byte []) (key));
		abyte5 = ((byte []) (key));
		abyte6 = ((byte []) (key));
		abyte1 = ((byte []) (key));
		bytearrayoutputstream.close();
		abyte1 = ((byte []) (key));
		if(key == null) goto _L4; else goto _L7
_L7:
		c = '\0';
		i = 0;
_L13:
		abyte2 = ((byte []) (key));
		abyte3 = ((byte []) (key));
		abyte4 = ((byte []) (key));
		abyte5 = ((byte []) (key));
		abyte6 = ((byte []) (key));
		abyte1 = ((byte []) (key));
		if(i < key.length) goto _L9; else goto _L8
_L8:
		i = ((int) (c));
_L10:
		abyte2 = ((byte []) (key));
		abyte3 = ((byte []) (key));
		abyte4 = ((byte []) (key));
		abyte5 = ((byte []) (key));
		abyte6 = ((byte []) (key));
		abyte1 = ((byte []) (key));
		key = ((Key) (FM_Bytes.copyOfRange(((byte []) (key)), i, key.length)));
		return ((byte []) (key));
_L4:
		return abyte1;
	//* 338  675:goto            134
_L9:
		if(key[i] == 0) goto _L11; else goto _L10
	//  339  678:aload_1         
	//  340  679:iload_0         
	//  341  680:baload          
	//  342  681:ifeq            687
	//* 343  684:goto            422
_L11:
		i++;
	//  344  687:iload_0         
	//  345  688:iconst_1        
	//  346  689:iadd            
	//  347  690:istore_0        
		if(true) goto _L13; else goto _L12
	//  348  691:goto            395
_L12:
	}

	public static byte[] encrtyByPrivate(PrivateKey privatekey, byte abyte0[], boolean flag)
	{
		return doFinal(1, ((Key) (privatekey)), abyte0, flag);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//    5    7:areturn         
	}

	public static byte[] encrtyByPrivate(byte abyte0[], byte abyte1[], boolean flag)
	{
		Object obj;
		obj = ((Object) (new PKCS8EncodedKeySpec(abyte0)));
	//    0    0:new             #101 <Class PKCS8EncodedKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #104 <Method void PKCS8EncodedKeySpec(byte[])>
	//    4    8:astore_3        
		abyte0 = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		obj = ((Object) (KeyFactory.getInstance("RSA").generatePrivate(((java.security.spec.KeySpec) (obj)))));
	//    7   11:ldc1            #11  <String "RSA">
	//    8   13:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//    9   16:aload_3         
	//   10   17:invokevirtual   #73  <Method PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   11   20:astore_3        
		abyte0 = ((byte []) (obj));
	//   12   21:aload_3         
	//   13   22:astore_0        
		break MISSING_BLOCK_LABEL_95;
	//   14   23:goto            95
		Object obj1;
		obj1;
	//   15   26:astore_3        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   16   27:getstatic       #44  <Field FMLog log>
	//   17   30:ldc1            #2   <Class RSA>
	//   18   32:invokevirtual   #79  <Method String Class.getName()>
	//   19   35:ldc1            #166 <String "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   20   37:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (obj1))));
	//   21   42:getstatic       #44  <Field FMLog log>
	//   22   45:ldc1            #2   <Class RSA>
	//   23   47:invokevirtual   #79  <Method String Class.getName()>
	//   24   50:aload_3         
	//   25   51:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   26   54:invokeinterface #87  <Method void FMLog.error(String, String)>
		break MISSING_BLOCK_LABEL_95;
	//   27   59:goto            95
		obj1;
	//   28   62:astore_3        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   29   63:getstatic       #44  <Field FMLog log>
	//   30   66:ldc1            #2   <Class RSA>
	//   31   68:invokevirtual   #79  <Method String Class.getName()>
	//   32   71:ldc1            #166 <String "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   33   73:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (obj1))));
	//   34   78:getstatic       #44  <Field FMLog log>
	//   35   81:ldc1            #2   <Class RSA>
	//   36   83:invokevirtual   #79  <Method String Class.getName()>
	//   37   86:aload_3         
	//   38   87:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   39   90:invokeinterface #87  <Method void FMLog.error(String, String)>
		return doFinal(1, ((Key) (abyte0)), abyte1, flag);
	//   40   95:iconst_1        
	//   41   96:aload_0         
	//   42   97:aload_1         
	//   43   98:iload_2         
	//   44   99:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//   45  102:areturn         
	}

	public static byte[] encrtyByPrivate(byte abyte0[], byte abyte1[], byte abyte2[], boolean flag)
	{
		if(abyte0 == null || abyte1.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(abyte0 == null || abyte0.length < 1)
	//*   8   12:aload_0         
	//*   9   13:ifnull          22
	//*  10   16:aload_0         
	//*  11   17:arraylength     
	//*  12   18:iconst_1        
	//*  13   19:icmpge          24
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		if(abyte2 == null || abyte2.length < 1)
	//*  16   24:aload_2         
	//*  17   25:ifnull          34
	//*  18   28:aload_2         
	//*  19   29:arraylength     
	//*  20   30:iconst_1        
	//*  21   31:icmpge          36
			return null;
	//   22   34:aconst_null     
	//   23   35:areturn         
		abyte1 = ((byte []) (new RSAPrivateKeySpec(new BigInteger(1, abyte0), new BigInteger(1, abyte1))));
	//   24   36:new             #56  <Class RSAPrivateKeySpec>
	//   25   39:dup             
	//   26   40:new             #58  <Class BigInteger>
	//   27   43:dup             
	//   28   44:iconst_1        
	//   29   45:aload_0         
	//   30   46:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   31   49:new             #58  <Class BigInteger>
	//   32   52:dup             
	//   33   53:iconst_1        
	//   34   54:aload_1         
	//   35   55:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   36   58:invokespecial   #64  <Method void RSAPrivateKeySpec(BigInteger, BigInteger)>
	//   37   61:astore_1        
		abyte0 = null;
	//   38   62:aconst_null     
	//   39   63:astore_0        
		abyte1 = ((byte []) (KeyFactory.getInstance("RSA").generatePrivate(((java.security.spec.KeySpec) (abyte1)))));
	//   40   64:ldc1            #11  <String "RSA">
	//   41   66:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//   42   69:aload_1         
	//   43   70:invokevirtual   #73  <Method PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   44   73:astore_1        
		abyte0 = abyte1;
	//   45   74:aload_1         
	//   46   75:astore_0        
		break MISSING_BLOCK_LABEL_148;
	//   47   76:goto            148
		abyte1;
	//   48   79:astore_1        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   49   80:getstatic       #44  <Field FMLog log>
	//   50   83:ldc1            #2   <Class RSA>
	//   51   85:invokevirtual   #79  <Method String Class.getName()>
	//   52   88:ldc1            #166 <String "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   53   90:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte1))));
	//   54   95:getstatic       #44  <Field FMLog log>
	//   55   98:ldc1            #2   <Class RSA>
	//   56  100:invokevirtual   #79  <Method String Class.getName()>
	//   57  103:aload_1         
	//   58  104:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   59  107:invokeinterface #87  <Method void FMLog.error(String, String)>
		break MISSING_BLOCK_LABEL_148;
	//   60  112:goto            148
		abyte1;
	//   61  115:astore_1        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   62  116:getstatic       #44  <Field FMLog log>
	//   63  119:ldc1            #2   <Class RSA>
	//   64  121:invokevirtual   #79  <Method String Class.getName()>
	//   65  124:ldc1            #166 <String "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   66  126:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte1))));
	//   67  131:getstatic       #44  <Field FMLog log>
	//   68  134:ldc1            #2   <Class RSA>
	//   69  136:invokevirtual   #79  <Method String Class.getName()>
	//   70  139:aload_1         
	//   71  140:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   72  143:invokeinterface #87  <Method void FMLog.error(String, String)>
		return doFinal(1, ((Key) (abyte0)), abyte2, flag);
	//   73  148:iconst_1        
	//   74  149:aload_0         
	//   75  150:aload_2         
	//   76  151:iload_3         
	//   77  152:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//   78  155:areturn         
	}

	public static byte[] encrtyByPublic(byte abyte0[], byte abyte1[], boolean flag)
	{
		Object obj;
		obj = ((Object) (new X509EncodedKeySpec(abyte0)));
	//    0    0:new             #169 <Class X509EncodedKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #170 <Method void X509EncodedKeySpec(byte[])>
	//    4    8:astore_3        
		abyte0 = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		obj = ((Object) (KeyFactory.getInstance("RSA").generatePublic(((java.security.spec.KeySpec) (obj)))));
	//    7   11:ldc1            #11  <String "RSA">
	//    8   13:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//    9   16:aload_3         
	//   10   17:invokevirtual   #115 <Method PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   11   20:astore_3        
		abyte0 = ((byte []) (obj));
	//   12   21:aload_3         
	//   13   22:astore_0        
		break MISSING_BLOCK_LABEL_95;
	//   14   23:goto            95
		Object obj1;
		obj1;
	//   15   26:astore_3        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   16   27:getstatic       #44  <Field FMLog log>
	//   17   30:ldc1            #2   <Class RSA>
	//   18   32:invokevirtual   #79  <Method String Class.getName()>
	//   19   35:ldc1            #166 <String "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   20   37:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (obj1))));
	//   21   42:getstatic       #44  <Field FMLog log>
	//   22   45:ldc1            #2   <Class RSA>
	//   23   47:invokevirtual   #79  <Method String Class.getName()>
	//   24   50:aload_3         
	//   25   51:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   26   54:invokeinterface #87  <Method void FMLog.error(String, String)>
		break MISSING_BLOCK_LABEL_95;
	//   27   59:goto            95
		obj1;
	//   28   62:astore_3        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   29   63:getstatic       #44  <Field FMLog log>
	//   30   66:ldc1            #2   <Class RSA>
	//   31   68:invokevirtual   #79  <Method String Class.getName()>
	//   32   71:ldc1            #166 <String "RSA\u79C1\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   33   73:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (obj1))));
	//   34   78:getstatic       #44  <Field FMLog log>
	//   35   81:ldc1            #2   <Class RSA>
	//   36   83:invokevirtual   #79  <Method String Class.getName()>
	//   37   86:aload_3         
	//   38   87:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   39   90:invokeinterface #87  <Method void FMLog.error(String, String)>
		return doFinal(1, ((Key) (abyte0)), abyte1, flag);
	//   40   95:iconst_1        
	//   41   96:aload_0         
	//   42   97:aload_1         
	//   43   98:iload_2         
	//   44   99:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//   45  102:areturn         
	}

	public static byte[] encrtyByPublic(byte abyte0[], byte abyte1[], byte abyte2[], boolean flag)
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          10
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		if(abyte1 == null || abyte1.length < 1)
	//*   8   12:aload_1         
	//*   9   13:ifnull          22
	//*  10   16:aload_1         
	//*  11   17:arraylength     
	//*  12   18:iconst_1        
	//*  13   19:icmpge          24
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		if(abyte2 == null || abyte2.length < 1)
	//*  16   24:aload_2         
	//*  17   25:ifnull          34
	//*  18   28:aload_2         
	//*  19   29:arraylength     
	//*  20   30:iconst_1        
	//*  21   31:icmpge          36
			return null;
	//   22   34:aconst_null     
	//   23   35:areturn         
		abyte1 = ((byte []) (new RSAPublicKeySpec(new BigInteger(1, abyte0), new BigInteger(1, abyte1))));
	//   24   36:new             #110 <Class RSAPublicKeySpec>
	//   25   39:dup             
	//   26   40:new             #58  <Class BigInteger>
	//   27   43:dup             
	//   28   44:iconst_1        
	//   29   45:aload_0         
	//   30   46:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   31   49:new             #58  <Class BigInteger>
	//   32   52:dup             
	//   33   53:iconst_1        
	//   34   54:aload_1         
	//   35   55:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   36   58:invokespecial   #111 <Method void RSAPublicKeySpec(BigInteger, BigInteger)>
	//   37   61:astore_1        
		abyte0 = null;
	//   38   62:aconst_null     
	//   39   63:astore_0        
		abyte1 = ((byte []) (KeyFactory.getInstance("RSA").generatePublic(((java.security.spec.KeySpec) (abyte1)))));
	//   40   64:ldc1            #11  <String "RSA">
	//   41   66:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//   42   69:aload_1         
	//   43   70:invokevirtual   #115 <Method PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   44   73:astore_1        
		abyte0 = abyte1;
	//   45   74:aload_1         
	//   46   75:astore_0        
		break MISSING_BLOCK_LABEL_148;
	//   47   76:goto            148
		abyte1;
	//   48   79:astore_1        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u516C\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   49   80:getstatic       #44  <Field FMLog log>
	//   50   83:ldc1            #2   <Class RSA>
	//   51   85:invokevirtual   #79  <Method String Class.getName()>
	//   52   88:ldc1            #172 <String "RSA\u516C\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   53   90:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte1))));
	//   54   95:getstatic       #44  <Field FMLog log>
	//   55   98:ldc1            #2   <Class RSA>
	//   56  100:invokevirtual   #79  <Method String Class.getName()>
	//   57  103:aload_1         
	//   58  104:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   59  107:invokeinterface #87  <Method void FMLog.error(String, String)>
		break MISSING_BLOCK_LABEL_148;
	//   60  112:goto            148
		abyte1;
	//   61  115:astore_1        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u516C\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38");
	//   62  116:getstatic       #44  <Field FMLog log>
	//   63  119:ldc1            #2   <Class RSA>
	//   64  121:invokevirtual   #79  <Method String Class.getName()>
	//   65  124:ldc1            #172 <String "RSA\u516C\u94A5\u52A0\u5BC6\u51FA\u73B0\u5F02\u5E38">
	//   66  126:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte1))));
	//   67  131:getstatic       #44  <Field FMLog log>
	//   68  134:ldc1            #2   <Class RSA>
	//   69  136:invokevirtual   #79  <Method String Class.getName()>
	//   70  139:aload_1         
	//   71  140:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   72  143:invokeinterface #87  <Method void FMLog.error(String, String)>
		return doFinal(1, ((Key) (abyte0)), abyte2, flag);
	//   73  148:iconst_1        
	//   74  149:aload_0         
	//   75  150:aload_2         
	//   76  151:iload_3         
	//   77  152:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//   78  155:areturn         
	}

	public static byte[] encryptByPublic(PublicKey publickey, byte abyte0[], boolean flag)
	{
		return doFinal(1, ((Key) (publickey)), abyte0, flag);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #97  <Method byte[] doFinal(int, Key, byte[], boolean)>
	//    5    7:areturn         
	}

	public static Map generateKey(int i)
	{
		Object obj;
		HashMap hashmap;
		hashmap = new HashMap();
	//    0    0:new             #177 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #178 <Method void HashMap()>
	//    3    7:astore_3        
		obj = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
		KeyPairGenerator keypairgenerator = KeyPairGenerator.getInstance("RSA");
	//    6   10:ldc1            #11  <String "RSA">
	//    7   12:invokestatic    #183 <Method KeyPairGenerator KeyPairGenerator.getInstance(String)>
	//    8   15:astore_2        
		obj = ((Object) (keypairgenerator));
	//    9   16:aload_2         
	//   10   17:astore_1        
		break MISSING_BLOCK_LABEL_54;
	//   11   18:goto            54
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//   12   21:astore_2        
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "RSA\u4EA7\u751F\u5BC6\u94A5\u51FA\u73B0\u5F02\u5E38");
	//   13   22:getstatic       #44  <Field FMLog log>
	//   14   25:ldc1            #2   <Class RSA>
	//   15   27:invokevirtual   #79  <Method String Class.getName()>
	//   16   30:ldc1            #185 <String "RSA\u4EA7\u751F\u5BC6\u94A5\u51FA\u73B0\u5F02\u5E38">
	//   17   32:invokeinterface #87  <Method void FMLog.error(String, String)>
		log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (nosuchalgorithmexception))));
	//   18   37:getstatic       #44  <Field FMLog log>
	//   19   40:ldc1            #2   <Class RSA>
	//   20   42:invokevirtual   #79  <Method String Class.getName()>
	//   21   45:aload_2         
	//   22   46:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   23   49:invokeinterface #87  <Method void FMLog.error(String, String)>
		if(obj != null)
	//*  24   54:aload_1         
	//*  25   55:ifnull          113
		{
			((KeyPairGenerator) (obj)).initialize(i, new SecureRandom());
	//   26   58:aload_1         
	//   27   59:iload_0         
	//   28   60:new             #187 <Class SecureRandom>
	//   29   63:dup             
	//   30   64:invokespecial   #188 <Method void SecureRandom()>
	//   31   67:invokevirtual   #192 <Method void KeyPairGenerator.initialize(int, SecureRandom)>
			obj = ((Object) (((KeyPairGenerator) (obj)).generateKeyPair()));
	//   32   70:aload_1         
	//   33   71:invokevirtual   #196 <Method KeyPair KeyPairGenerator.generateKeyPair()>
	//   34   74:astore_1        
			((Map) (hashmap)).put("publicKey", ((Object) (((KeyPair) (obj)).getPublic().getEncoded())));
	//   35   75:aload_3         
	//   36   76:ldc1            #25  <String "publicKey">
	//   37   78:aload_1         
	//   38   79:invokevirtual   #202 <Method PublicKey KeyPair.getPublic()>
	//   39   82:invokeinterface #207 <Method byte[] PublicKey.getEncoded()>
	//   40   87:invokeinterface #213 <Method Object Map.put(Object, Object)>
	//   41   92:pop             
			((Map) (hashmap)).put("privateKey", ((Object) (((KeyPair) (obj)).getPrivate().getEncoded())));
	//   42   93:aload_3         
	//   43   94:ldc1            #22  <String "privateKey">
	//   44   96:aload_1         
	//   45   97:invokevirtual   #217 <Method PrivateKey KeyPair.getPrivate()>
	//   46  100:invokeinterface #220 <Method byte[] PrivateKey.getEncoded()>
	//   47  105:invokeinterface #213 <Method Object Map.put(Object, Object)>
	//   48  110:pop             
			return ((Map) (hashmap));
	//   49  111:aload_3         
	//   50  112:areturn         
		} else
		{
			return null;
	//   51  113:aconst_null     
	//   52  114:areturn         
		}
	}

	public static void main(String args[])
	{
		args = ((String []) (FM_Bytes.hexStringToBytes("010001")));
	//    0    0:ldc1            #226 <String "010001">
	//    1    2:invokestatic    #230 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//    2    5:astore_0        
		byte abyte0[] = FM_Bytes.hexStringToBytes("000102030405060708090001");
	//    3    6:ldc1            #232 <String "000102030405060708090001">
	//    4    8:invokestatic    #230 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//    5   11:astore_1        
		args = ((String []) (encrtyByPublic(FM_Bytes.hexStringToBytes("CC5FFBB1DC42D3233AC74E7CF43031DFEADC18EA8A3059D406F307943B886E6E313A7F45D51F89BD46D8F0B556B2B6C336C783951015FC02E3438B11BDB0AB24A0A411103F44EBAA494137CEA82C3C29C0262EB54AD0ADB3FB49C211A0B36E05D1D98F7511DDA91A89341E98A4F559B99C209028DFDDACE7DD1026E9DEF090F3"), ((byte []) (args)), abyte0, true)));
	//    6   12:ldc1            #234 <String "CC5FFBB1DC42D3233AC74E7CF43031DFEADC18EA8A3059D406F307943B886E6E313A7F45D51F89BD46D8F0B556B2B6C336C783951015FC02E3438B11BDB0AB24A0A411103F44EBAA494137CEA82C3C29C0262EB54AD0ADB3FB49C211A0B36E05D1D98F7511DDA91A89341E98A4F559B99C209028DFDDACE7DD1026E9DEF090F3">
	//    7   14:invokestatic    #230 <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:iconst_1        
	//   11   20:invokestatic    #236 <Method byte[] encrtyByPublic(byte[], byte[], byte[], boolean)>
	//   12   23:astore_0        
		System.out.println(FM_Bytes.bytesToHexString(((byte []) (args))));
	//   13   24:getstatic       #242 <Field PrintStream System.out>
	//   14   27:aload_0         
	//   15   28:invokestatic    #246 <Method String FM_Bytes.bytesToHexString(byte[])>
	//   16   31:invokevirtual   #252 <Method void PrintStream.println(String)>
	//   17   34:return          
	}

	public static Map privateKey2RSA(PrivateKey privatekey)
	{
		privatekey = ((PrivateKey) ((RSAPrivateKey)privatekey));
	//    0    0:aload_0         
	//    1    1:checkcast       #256 <Class RSAPrivateKey>
	//    2    4:astore_0        
		HashMap hashmap = new HashMap();
	//    3    5:new             #177 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #178 <Method void HashMap()>
	//    6   12:astore_1        
		((Map) (hashmap)).put("Modulus", ((Object) (((RSAPrivateKey) (privatekey)).getModulus())));
	//    7   13:aload_1         
	//    8   14:ldc1            #19  <String "Modulus">
	//    9   16:aload_0         
	//   10   17:invokeinterface #260 <Method BigInteger RSAPrivateKey.getModulus()>
	//   11   22:invokeinterface #213 <Method Object Map.put(Object, Object)>
	//   12   27:pop             
		((Map) (hashmap)).put("Exponent", ((Object) (((RSAPrivateKey) (privatekey)).getPrivateExponent())));
	//   13   28:aload_1         
	//   14   29:ldc1            #8   <String "Exponent">
	//   15   31:aload_0         
	//   16   32:invokeinterface #263 <Method BigInteger RSAPrivateKey.getPrivateExponent()>
	//   17   37:invokeinterface #213 <Method Object Map.put(Object, Object)>
	//   18   42:pop             
		return ((Map) (hashmap));
	//   19   43:aload_1         
	//   20   44:areturn         
	}

	public static Map publicKey2RSA(PublicKey publickey)
	{
		publickey = ((PublicKey) ((RSAPublicKey)publickey));
	//    0    0:aload_0         
	//    1    1:checkcast       #268 <Class RSAPublicKey>
	//    2    4:astore_0        
		HashMap hashmap = new HashMap();
	//    3    5:new             #177 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #178 <Method void HashMap()>
	//    6   12:astore_1        
		((Map) (hashmap)).put("Modulus", ((Object) (((RSAPublicKey) (publickey)).getModulus())));
	//    7   13:aload_1         
	//    8   14:ldc1            #19  <String "Modulus">
	//    9   16:aload_0         
	//   10   17:invokeinterface #269 <Method BigInteger RSAPublicKey.getModulus()>
	//   11   22:invokeinterface #213 <Method Object Map.put(Object, Object)>
	//   12   27:pop             
		((Map) (hashmap)).put("Exponent", ((Object) (((RSAPublicKey) (publickey)).getPublicExponent())));
	//   13   28:aload_1         
	//   14   29:ldc1            #8   <String "Exponent">
	//   15   31:aload_0         
	//   16   32:invokeinterface #272 <Method BigInteger RSAPublicKey.getPublicExponent()>
	//   17   37:invokeinterface #213 <Method Object Map.put(Object, Object)>
	//   18   42:pop             
		return ((Map) (hashmap));
	//   19   43:aload_1         
	//   20   44:areturn         
	}

	public static byte[] sign(byte abyte0[], PrivateKey privatekey)
	{
		try
		{
			Signature signature = Signature.getInstance("SHA1withRSA");
	//    0    0:ldc1            #28  <String "SHA1withRSA">
	//    1    2:invokestatic    #282 <Method Signature Signature.getInstance(String)>
	//    2    5:astore_2        
			signature.initSign(privatekey);
	//    3    6:aload_2         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #286 <Method void Signature.initSign(PrivateKey)>
			signature.update(abyte0);
	//    6   11:aload_2         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #289 <Method void Signature.update(byte[])>
			abyte0 = signature.sign();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #291 <Method byte[] Signature.sign()>
	//   11   20:astore_0        
		}
	//*  12   21:aload_0         
	//*  13   22:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  14   23:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   15   24:getstatic       #44  <Field FMLog log>
	//   16   27:ldc1            #2   <Class RSA>
	//   17   29:invokevirtual   #79  <Method String Class.getName()>
	//   18   32:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   19   35:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   20   40:getstatic       #44  <Field FMLog log>
	//   21   43:ldc1            #2   <Class RSA>
	//   22   45:invokevirtual   #79  <Method String Class.getName()>
	//   23   48:aload_0         
	//   24   49:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   25   52:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   26   57:aconst_null     
	//   27   58:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  28   59:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   29   60:getstatic       #44  <Field FMLog log>
	//   30   63:ldc1            #2   <Class RSA>
	//   31   65:invokevirtual   #79  <Method String Class.getName()>
	//   32   68:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   33   71:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   34   76:getstatic       #44  <Field FMLog log>
	//   35   79:ldc1            #2   <Class RSA>
	//   36   81:invokevirtual   #79  <Method String Class.getName()>
	//   37   84:aload_0         
	//   38   85:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   39   88:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   40   93:aconst_null     
	//   41   94:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  42   95:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   43   96:getstatic       #44  <Field FMLog log>
	//   44   99:ldc1            #2   <Class RSA>
	//   45  101:invokevirtual   #79  <Method String Class.getName()>
	//   46  104:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   47  107:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   48  112:getstatic       #44  <Field FMLog log>
	//   49  115:ldc1            #2   <Class RSA>
	//   50  117:invokevirtual   #79  <Method String Class.getName()>
	//   51  120:aload_0         
	//   52  121:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   53  124:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   54  129:aconst_null     
	//   55  130:areturn         
		}
		return abyte0;
	}

	public static byte[] sign(byte abyte0[], byte abyte1[])
	{
		abyte1 = ((byte []) (new PKCS8EncodedKeySpec(abyte1)));
	//    0    0:new             #101 <Class PKCS8EncodedKeySpec>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #104 <Method void PKCS8EncodedKeySpec(byte[])>
	//    4    8:astore_1        
		try
		{
			KeyFactory keyfactory = KeyFactory.getInstance("RSA");
	//    5    9:ldc1            #11  <String "RSA">
	//    6   11:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//    7   14:astore_2        
			Signature signature = Signature.getInstance("SHA1withRSA");
	//    8   15:ldc1            #28  <String "SHA1withRSA">
	//    9   17:invokestatic    #282 <Method Signature Signature.getInstance(String)>
	//   10   20:astore_3        
			signature.initSign(keyfactory.generatePrivate(((java.security.spec.KeySpec) (abyte1))));
	//   11   21:aload_3         
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #73  <Method PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   15   27:invokevirtual   #286 <Method void Signature.initSign(PrivateKey)>
			signature.update(abyte0);
	//   16   30:aload_3         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #289 <Method void Signature.update(byte[])>
			abyte0 = signature.sign();
	//   19   35:aload_3         
	//   20   36:invokevirtual   #291 <Method byte[] Signature.sign()>
	//   21   39:astore_0        
		}
	//*  22   40:aload_0         
	//*  23   41:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  24   42:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   25   43:getstatic       #44  <Field FMLog log>
	//   26   46:ldc1            #2   <Class RSA>
	//   27   48:invokevirtual   #79  <Method String Class.getName()>
	//   28   51:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   29   54:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   30   59:getstatic       #44  <Field FMLog log>
	//   31   62:ldc1            #2   <Class RSA>
	//   32   64:invokevirtual   #79  <Method String Class.getName()>
	//   33   67:aload_0         
	//   34   68:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   35   71:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   36   76:aconst_null     
	//   37   77:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  38   78:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   39   79:getstatic       #44  <Field FMLog log>
	//   40   82:ldc1            #2   <Class RSA>
	//   41   84:invokevirtual   #79  <Method String Class.getName()>
	//   42   87:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   43   90:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   44   95:getstatic       #44  <Field FMLog log>
	//   45   98:ldc1            #2   <Class RSA>
	//   46  100:invokevirtual   #79  <Method String Class.getName()>
	//   47  103:aload_0         
	//   48  104:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   49  107:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   50  112:aconst_null     
	//   51  113:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  52  114:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   53  115:getstatic       #44  <Field FMLog log>
	//   54  118:ldc1            #2   <Class RSA>
	//   55  120:invokevirtual   #79  <Method String Class.getName()>
	//   56  123:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   57  126:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   58  131:getstatic       #44  <Field FMLog log>
	//   59  134:ldc1            #2   <Class RSA>
	//   60  136:invokevirtual   #79  <Method String Class.getName()>
	//   61  139:aload_0         
	//   62  140:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   63  143:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   64  148:aconst_null     
	//   65  149:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  66  150:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   67  151:getstatic       #44  <Field FMLog log>
	//   68  154:ldc1            #2   <Class RSA>
	//   69  156:invokevirtual   #79  <Method String Class.getName()>
	//   70  159:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   71  162:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   72  167:getstatic       #44  <Field FMLog log>
	//   73  170:ldc1            #2   <Class RSA>
	//   74  172:invokevirtual   #79  <Method String Class.getName()>
	//   75  175:aload_0         
	//   76  176:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   77  179:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   78  184:aconst_null     
	//   79  185:areturn         
		}
		return abyte0;
	}

	public static byte[] sign(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		abyte1 = ((byte []) (new RSAPrivateKeySpec(new BigInteger(1, abyte1), new BigInteger(1, abyte2))));
	//    0    0:new             #56  <Class RSAPrivateKeySpec>
	//    1    3:dup             
	//    2    4:new             #58  <Class BigInteger>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:aload_1         
	//    6   10:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//    7   13:new             #58  <Class BigInteger>
	//    8   16:dup             
	//    9   17:iconst_1        
	//   10   18:aload_2         
	//   11   19:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   12   22:invokespecial   #64  <Method void RSAPrivateKeySpec(BigInteger, BigInteger)>
	//   13   25:astore_1        
		try
		{
			abyte2 = ((byte []) (KeyFactory.getInstance("RSA")));
	//   14   26:ldc1            #11  <String "RSA">
	//   15   28:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//   16   31:astore_2        
			Signature signature = Signature.getInstance("SHA1withRSA");
	//   17   32:ldc1            #28  <String "SHA1withRSA">
	//   18   34:invokestatic    #282 <Method Signature Signature.getInstance(String)>
	//   19   37:astore_3        
			signature.initSign(((KeyFactory) (abyte2)).generatePrivate(((java.security.spec.KeySpec) (abyte1))));
	//   20   38:aload_3         
	//   21   39:aload_2         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #73  <Method PrivateKey KeyFactory.generatePrivate(java.security.spec.KeySpec)>
	//   24   44:invokevirtual   #286 <Method void Signature.initSign(PrivateKey)>
			signature.update(abyte0);
	//   25   47:aload_3         
	//   26   48:aload_0         
	//   27   49:invokevirtual   #289 <Method void Signature.update(byte[])>
			abyte0 = signature.sign();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #291 <Method byte[] Signature.sign()>
	//   30   56:astore_0        
		}
	//*  31   57:aload_0         
	//*  32   58:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  33   59:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   34   60:getstatic       #44  <Field FMLog log>
	//   35   63:ldc1            #2   <Class RSA>
	//   36   65:invokevirtual   #79  <Method String Class.getName()>
	//   37   68:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   38   71:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   39   76:getstatic       #44  <Field FMLog log>
	//   40   79:ldc1            #2   <Class RSA>
	//   41   81:invokevirtual   #79  <Method String Class.getName()>
	//   42   84:aload_0         
	//   43   85:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   44   88:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   45   93:aconst_null     
	//   46   94:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  47   95:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   48   96:getstatic       #44  <Field FMLog log>
	//   49   99:ldc1            #2   <Class RSA>
	//   50  101:invokevirtual   #79  <Method String Class.getName()>
	//   51  104:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   52  107:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   53  112:getstatic       #44  <Field FMLog log>
	//   54  115:ldc1            #2   <Class RSA>
	//   55  117:invokevirtual   #79  <Method String Class.getName()>
	//   56  120:aload_0         
	//   57  121:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   58  124:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   59  129:aconst_null     
	//   60  130:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  61  131:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   62  132:getstatic       #44  <Field FMLog log>
	//   63  135:ldc1            #2   <Class RSA>
	//   64  137:invokevirtual   #79  <Method String Class.getName()>
	//   65  140:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   66  143:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   67  148:getstatic       #44  <Field FMLog log>
	//   68  151:ldc1            #2   <Class RSA>
	//   69  153:invokevirtual   #79  <Method String Class.getName()>
	//   70  156:aload_0         
	//   71  157:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   72  160:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   73  165:aconst_null     
	//   74  166:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  75  167:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38");
	//   76  168:getstatic       #44  <Field FMLog log>
	//   77  171:ldc1            #2   <Class RSA>
	//   78  173:invokevirtual   #79  <Method String Class.getName()>
	//   79  176:ldc2            #293 <String "\u79C1\u94A5\u7B7E\u540D\u5F02\u5E38">
	//   80  179:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   81  184:getstatic       #44  <Field FMLog log>
	//   82  187:ldc1            #2   <Class RSA>
	//   83  189:invokevirtual   #79  <Method String Class.getName()>
	//   84  192:aload_0         
	//   85  193:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   86  196:invokeinterface #87  <Method void FMLog.error(String, String)>
			return null;
	//   87  201:aconst_null     
	//   88  202:areturn         
		}
		return abyte0;
	}

	public static boolean verify(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[])
	{
		abyte1 = ((byte []) (new RSAPublicKeySpec(new BigInteger(1, abyte1), new BigInteger(1, abyte2))));
	//    0    0:new             #110 <Class RSAPublicKeySpec>
	//    1    3:dup             
	//    2    4:new             #58  <Class BigInteger>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:aload_1         
	//    6   10:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//    7   13:new             #58  <Class BigInteger>
	//    8   16:dup             
	//    9   17:iconst_1        
	//   10   18:aload_2         
	//   11   19:invokespecial   #61  <Method void BigInteger(int, byte[])>
	//   12   22:invokespecial   #111 <Method void RSAPublicKeySpec(BigInteger, BigInteger)>
	//   13   25:astore_1        
		boolean flag;
		try
		{
			abyte2 = ((byte []) (KeyFactory.getInstance("RSA")));
	//   14   26:ldc1            #11  <String "RSA">
	//   15   28:invokestatic    #69  <Method KeyFactory KeyFactory.getInstance(String)>
	//   16   31:astore_2        
			Signature signature = Signature.getInstance("SHA1withRSA");
	//   17   32:ldc1            #28  <String "SHA1withRSA">
	//   18   34:invokestatic    #282 <Method Signature Signature.getInstance(String)>
	//   19   37:astore          5
			signature.initVerify(((KeyFactory) (abyte2)).generatePublic(((java.security.spec.KeySpec) (abyte1))));
	//   20   39:aload           5
	//   21   41:aload_2         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #115 <Method PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   24   46:invokevirtual   #301 <Method void Signature.initVerify(PublicKey)>
			signature.update(abyte0);
	//   25   49:aload           5
	//   26   51:aload_0         
	//   27   52:invokevirtual   #289 <Method void Signature.update(byte[])>
			flag = signature.verify(abyte3);
	//   28   55:aload           5
	//   29   57:aload_3         
	//   30   58:invokevirtual   #304 <Method boolean Signature.verify(byte[])>
	//   31   61:istore          4
		}
	//*  32   63:iload           4
	//*  33   65:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  34   66:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u516C\u94A5\u9A8C\u7B7E\u5F02\u5E38");
	//   35   67:getstatic       #44  <Field FMLog log>
	//   36   70:ldc1            #2   <Class RSA>
	//   37   72:invokevirtual   #79  <Method String Class.getName()>
	//   38   75:ldc2            #306 <String "\u516C\u94A5\u9A8C\u7B7E\u5F02\u5E38">
	//   39   78:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   40   83:getstatic       #44  <Field FMLog log>
	//   41   86:ldc1            #2   <Class RSA>
	//   42   88:invokevirtual   #79  <Method String Class.getName()>
	//   43   91:aload_0         
	//   44   92:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   45   95:invokeinterface #87  <Method void FMLog.error(String, String)>
			return false;
	//   46  100:iconst_0        
	//   47  101:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  48  102:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u516C\u94A5\u9A8C\u7B7E\u5F02\u5E38");
	//   49  103:getstatic       #44  <Field FMLog log>
	//   50  106:ldc1            #2   <Class RSA>
	//   51  108:invokevirtual   #79  <Method String Class.getName()>
	//   52  111:ldc2            #306 <String "\u516C\u94A5\u9A8C\u7B7E\u5F02\u5E38">
	//   53  114:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   54  119:getstatic       #44  <Field FMLog log>
	//   55  122:ldc1            #2   <Class RSA>
	//   56  124:invokevirtual   #79  <Method String Class.getName()>
	//   57  127:aload_0         
	//   58  128:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   59  131:invokeinterface #87  <Method void FMLog.error(String, String)>
			return false;
	//   60  136:iconst_0        
	//   61  137:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  62  138:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u516C\u94A5\u9A8C\u7B7E\u5F02\u5E38");
	//   63  139:getstatic       #44  <Field FMLog log>
	//   64  142:ldc1            #2   <Class RSA>
	//   65  144:invokevirtual   #79  <Method String Class.getName()>
	//   66  147:ldc2            #306 <String "\u516C\u94A5\u9A8C\u7B7E\u5F02\u5E38">
	//   67  150:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   68  155:getstatic       #44  <Field FMLog log>
	//   69  158:ldc1            #2   <Class RSA>
	//   70  160:invokevirtual   #79  <Method String Class.getName()>
	//   71  163:aload_0         
	//   72  164:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   73  167:invokeinterface #87  <Method void FMLog.error(String, String)>
			return false;
	//   74  172:iconst_0        
	//   75  173:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  76  174:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), "\u516C\u94A5\u9A8C\u7B7E\u5F02\u5E38");
	//   77  175:getstatic       #44  <Field FMLog log>
	//   78  178:ldc1            #2   <Class RSA>
	//   79  180:invokevirtual   #79  <Method String Class.getName()>
	//   80  183:ldc2            #306 <String "\u516C\u94A5\u9A8C\u7B7E\u5F02\u5E38">
	//   81  186:invokeinterface #87  <Method void FMLog.error(String, String)>
			log.error(((Class) (cn/com/fmsh/util/algorithm/RSA)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   82  191:getstatic       #44  <Field FMLog log>
	//   83  194:ldc1            #2   <Class RSA>
	//   84  196:invokevirtual   #79  <Method String Class.getName()>
	//   85  199:aload_0         
	//   86  200:invokestatic    #93  <Method String Util4Java.getExceptionInfo(Exception)>
	//   87  203:invokeinterface #87  <Method void FMLog.error(String, String)>
			return false;
	//   88  208:iconst_0        
	//   89  209:ireturn         
		}
		return flag;
	}

	public static final String EXPONENT_KEY = "Exponent";
	private static final String KEY_ALGORITHM = "RSA";
	private static final int MAX_DECRYPT_BLOCK = 128;
	private static final int MAX_ENCRYPT_BLOCK = 117;
	public static final String MODULUS_KEY = "Modulus";
	public static final String PRIVAET_KEY = "privateKey";
	public static final String PUBLIC_KEY = "publicKey";
	private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";
	private static FMLog log = LogFactory.getInstance().getLog();

	static 
	{
	//    0    0:invokestatic    #38  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #42  <Method FMLog LogFactory.getLog()>
	//    2    6:putstatic       #44  <Field FMLog log>
	//*   3    9:return          
	}
}
