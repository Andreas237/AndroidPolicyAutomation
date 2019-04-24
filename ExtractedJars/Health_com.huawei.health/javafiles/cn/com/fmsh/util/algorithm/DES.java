// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util.algorithm;

import cn.com.fmsh.util.FM_Bytes;
import cn.com.fmsh.util.Util4Java;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class DES
{

	public DES()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] decrypt4des(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (new SecretKeySpec(abyte0, "DES")));
	//    0    0:new             #38  <Class SecretKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <String "DES">
	//    4    7:invokespecial   #43  <Method void SecretKeySpec(byte[], String)>
	//    5   10:astore_0        
		try
		{
			Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
	//    6   11:ldc1            #45  <String "DES/ECB/NoPadding">
	//    7   13:invokestatic    #50  <Method Cipher Cipher.getInstance(String)>
	//    8   16:astore_2        
			cipher.init(2, ((java.security.Key) (abyte0)));
	//    9   17:aload_2         
	//   10   18:iconst_2        
	//   11   19:aload_0         
	//   12   20:invokevirtual   #54  <Method void Cipher.init(int, java.security.Key)>
			abyte0 = cipher.doFinal(abyte1);
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #58  <Method byte[] Cipher.doFinal(byte[])>
	//   16   28:astore_0        
		}
	//*  17   29:aload_0         
	//*  18   30:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  19   31:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   20   32:getstatic       #20  <Field FMLog log>
	//   21   35:ldc1            #2   <Class DES>
	//   22   37:invokevirtual   #64  <Method String Class.getName()>
	//   23   40:aload_0         
	//   24   41:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   25   44:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   26   49:aconst_null     
	//   27   50:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  28   51:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   29   52:getstatic       #20  <Field FMLog log>
	//   30   55:ldc1            #2   <Class DES>
	//   31   57:invokevirtual   #64  <Method String Class.getName()>
	//   32   60:aload_0         
	//   33   61:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   34   64:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   35   69:aconst_null     
	//   36   70:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  37   71:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   38   72:getstatic       #20  <Field FMLog log>
	//   39   75:ldc1            #2   <Class DES>
	//   40   77:invokevirtual   #64  <Method String Class.getName()>
	//   41   80:aload_0         
	//   42   81:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   43   84:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   44   89:aconst_null     
	//   45   90:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  46   91:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   47   92:getstatic       #20  <Field FMLog log>
	//   48   95:ldc1            #2   <Class DES>
	//   49   97:invokevirtual   #64  <Method String Class.getName()>
	//   50  100:aload_0         
	//   51  101:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   52  104:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   53  109:aconst_null     
	//   54  110:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  55  111:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   56  112:getstatic       #20  <Field FMLog log>
	//   57  115:ldc1            #2   <Class DES>
	//   58  117:invokevirtual   #64  <Method String Class.getName()>
	//   59  120:aload_0         
	//   60  121:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   61  124:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   62  129:aconst_null     
	//   63  130:areturn         
		}
		return abyte0;
	}

	public static byte[] decrypt4des3(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       25
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u89E3\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull");
	//    4    8:getstatic       #20  <Field FMLog log>
	//    5   11:ldc1            #2   <Class DES>
	//    6   13:invokevirtual   #64  <Method String Class.getName()>
	//    7   16:ldc1            #79  <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u89E3\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull">
	//    8   18:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
		}
		if(abyte0.length % 8 != 0)
	//*  11   25:aload_0         
	//*  12   26:arraylength     
	//*  13   27:bipush          8
	//*  14   29:irem            
	//*  15   30:ifeq            48
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u89E3\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   16   33:getstatic       #20  <Field FMLog log>
	//   17   36:ldc1            #2   <Class DES>
	//   18   38:invokevirtual   #64  <Method String Class.getName()>
	//   19   41:ldc1            #81  <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u89E3\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   20   43:invokeinterface #76  <Method void FMLog.error(String, String)>
		byte abyte2[] = FM_Bytes.copyOf(abyte0, 8);
	//   21   48:aload_0         
	//   22   49:bipush          8
	//   23   51:invokestatic    #87  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   24   54:astore_2        
		return decrypt4des(abyte2, encrypt4des(FM_Bytes.copyOfRange(abyte0, 8, abyte0.length), decrypt4des(abyte2, abyte1)));
	//   25   55:aload_2         
	//   26   56:aload_0         
	//   27   57:bipush          8
	//   28   59:aload_0         
	//   29   60:arraylength     
	//   30   61:invokestatic    #91  <Method byte[] FM_Bytes.copyOfRange(byte[], int, int)>
	//   31   64:aload_2         
	//   32   65:aload_1         
	//   33   66:invokestatic    #93  <Method byte[] decrypt4des(byte[], byte[])>
	//   34   69:invokestatic    #96  <Method byte[] encrypt4des(byte[], byte[])>
	//   35   72:invokestatic    #93  <Method byte[] decrypt4des(byte[], byte[])>
	//   36   75:areturn         
	}

	public static byte[] decrypt4des3CBC(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       25
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u89E3\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull");
	//    4    8:getstatic       #20  <Field FMLog log>
	//    5   11:ldc1            #2   <Class DES>
	//    6   13:invokevirtual   #64  <Method String Class.getName()>
	//    7   16:ldc1            #79  <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u89E3\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull">
	//    8   18:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
		}
		if(abyte0.length % 8 != 0)
	//*  11   25:aload_0         
	//*  12   26:arraylength     
	//*  13   27:bipush          8
	//*  14   29:irem            
	//*  15   30:ifeq            48
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u89E3\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   16   33:getstatic       #20  <Field FMLog log>
	//   17   36:ldc1            #2   <Class DES>
	//   18   38:invokevirtual   #64  <Method String Class.getName()>
	//   19   41:ldc1            #81  <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u89E3\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   20   43:invokeinterface #76  <Method void FMLog.error(String, String)>
		int l = abyte1.length / 8;
	//   21   48:aload_1         
	//   22   49:arraylength     
	//   23   50:bipush          8
	//   24   52:idiv            
	//   25   53:istore          5
		byte abyte3[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
			l, 8
		});
	//   26   55:getstatic       #104 <Field Class Byte.TYPE>
	//   27   58:iconst_2        
	//   28   59:newarray        int[]
	//   29   61:dup             
	//   30   62:iconst_0        
	//   31   63:iload           5
	//   32   65:iastore         
	//   33   66:dup             
	//   34   67:iconst_1        
	//   35   68:bipush          8
	//   36   70:iastore         
	//   37   71:invokestatic    #110 <Method Object Array.newInstance(Class, int[])>
	//   38   74:checkcast       #112 <Class byte[][]>
	//   39   77:astore          6
		for(int i = 0; i < l; i++)
	//*  40   79:iconst_0        
	//*  41   80:istore_3        
	//*  42   81:goto            123
		{
			for(int k = 0; k < 8; k++)
	//*  43   84:iconst_0        
	//*  44   85:istore          4
	//*  45   87:goto            112
				abyte3[i][k] = abyte1[i * 8 + k];
	//   46   90:aload           6
	//   47   92:iload_3         
	//   48   93:aaload          
	//   49   94:iload           4
	//   50   96:aload_1         
	//   51   97:iload_3         
	//   52   98:bipush          8
	//   53  100:imul            
	//   54  101:iload           4
	//   55  103:iadd            
	//   56  104:baload          
	//   57  105:bastore         

	//   58  106:iload           4
	//   59  108:iconst_1        
	//   60  109:iadd            
	//   61  110:istore          4
	//   62  112:iload           4
	//   63  114:bipush          8
	//   64  116:icmplt          90
		}

	//   65  119:iload_3         
	//   66  120:iconst_1        
	//   67  121:iadd            
	//   68  122:istore_3        
	//   69  123:iload_3         
	//   70  124:iload           5
	//   71  126:icmplt          84
		abyte1 = FM_Bytes.xor(decrypt4des3(abyte0, abyte3[0]), abyte2);
	//   72  129:aload_0         
	//   73  130:aload           6
	//   74  132:iconst_0        
	//   75  133:aaload          
	//   76  134:invokestatic    #114 <Method byte[] decrypt4des3(byte[], byte[])>
	//   77  137:aload_2         
	//   78  138:invokestatic    #117 <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   79  141:astore_1        
		for(int j = 1; j < l; j++)
	//*  80  142:iconst_1        
	//*  81  143:istore_3        
	//*  82  144:goto            173
			abyte1 = FM_Bytes.join(abyte1, FM_Bytes.xor(decrypt4des3(abyte0, abyte3[j]), abyte3[j - 1]));
	//   83  147:aload_1         
	//   84  148:aload_0         
	//   85  149:aload           6
	//   86  151:iload_3         
	//   87  152:aaload          
	//   88  153:invokestatic    #114 <Method byte[] decrypt4des3(byte[], byte[])>
	//   89  156:aload           6
	//   90  158:iload_3         
	//   91  159:iconst_1        
	//   92  160:isub            
	//   93  161:aaload          
	//   94  162:invokestatic    #117 <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   95  165:invokestatic    #120 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   96  168:astore_1        

	//   97  169:iload_3         
	//   98  170:iconst_1        
	//   99  171:iadd            
	//  100  172:istore_3        
	//  101  173:iload_3         
	//  102  174:iload           5
	//  103  176:icmplt          147
		return abyte1;
	//  104  179:aload_1         
	//  105  180:areturn         
	}

	public static byte[] decrypt4desCBC(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		abyte0 = ((byte []) (new SecretKeySpec(abyte0, "DES")));
	//    0    0:new             #38  <Class SecretKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <String "DES">
	//    4    7:invokespecial   #43  <Method void SecretKeySpec(byte[], String)>
	//    5   10:astore_0        
		abyte2 = ((byte []) (new IvParameterSpec(abyte2)));
	//    6   11:new             #125 <Class IvParameterSpec>
	//    7   14:dup             
	//    8   15:aload_2         
	//    9   16:invokespecial   #128 <Method void IvParameterSpec(byte[])>
	//   10   19:astore_2        
		try
		{
			Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
	//   11   20:ldc1            #130 <String "DES/CBC/NoPadding">
	//   12   22:invokestatic    #50  <Method Cipher Cipher.getInstance(String)>
	//   13   25:astore_3        
			cipher.init(2, ((java.security.Key) (abyte0)), ((java.security.spec.AlgorithmParameterSpec) (abyte2)));
	//   14   26:aload_3         
	//   15   27:iconst_2        
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:invokevirtual   #133 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			abyte0 = cipher.doFinal(abyte1);
	//   19   33:aload_3         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #58  <Method byte[] Cipher.doFinal(byte[])>
	//   22   38:astore_0        
		}
	//*  23   39:aload_0         
	//*  24   40:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  25   41:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   26   42:getstatic       #20  <Field FMLog log>
	//   27   45:ldc1            #2   <Class DES>
	//   28   47:invokevirtual   #64  <Method String Class.getName()>
	//   29   50:aload_0         
	//   30   51:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   31   54:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   32   59:aconst_null     
	//   33   60:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  34   61:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   35   62:getstatic       #20  <Field FMLog log>
	//   36   65:ldc1            #2   <Class DES>
	//   37   67:invokevirtual   #64  <Method String Class.getName()>
	//   38   70:aload_0         
	//   39   71:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   40   74:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   41   79:aconst_null     
	//   42   80:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  43   81:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   44   82:getstatic       #20  <Field FMLog log>
	//   45   85:ldc1            #2   <Class DES>
	//   46   87:invokevirtual   #64  <Method String Class.getName()>
	//   47   90:aload_0         
	//   48   91:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   49   94:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   50   99:aconst_null     
	//   51  100:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  52  101:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   53  102:getstatic       #20  <Field FMLog log>
	//   54  105:ldc1            #2   <Class DES>
	//   55  107:invokevirtual   #64  <Method String Class.getName()>
	//   56  110:aload_0         
	//   57  111:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   58  114:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   59  119:aconst_null     
	//   60  120:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  61  121:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   62  122:getstatic       #20  <Field FMLog log>
	//   63  125:ldc1            #2   <Class DES>
	//   64  127:invokevirtual   #64  <Method String Class.getName()>
	//   65  130:aload_0         
	//   66  131:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   67  134:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   68  139:aconst_null     
	//   69  140:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  70  141:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   71  142:getstatic       #20  <Field FMLog log>
	//   72  145:ldc1            #2   <Class DES>
	//   73  147:invokevirtual   #64  <Method String Class.getName()>
	//   74  150:aload_0         
	//   75  151:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   76  154:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   77  159:aconst_null     
	//   78  160:areturn         
		}
		return abyte0;
	}

	public static byte[] decrypt4desPadding(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (new SecretKeySpec(abyte0, "DES")));
	//    0    0:new             #38  <Class SecretKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <String "DES">
	//    4    7:invokespecial   #43  <Method void SecretKeySpec(byte[], String)>
	//    5   10:astore_0        
		try
		{
			Cipher cipher = Cipher.getInstance("DES/ECB/Padding");
	//    6   11:ldc1            #136 <String "DES/ECB/Padding">
	//    7   13:invokestatic    #50  <Method Cipher Cipher.getInstance(String)>
	//    8   16:astore_2        
			cipher.init(2, ((java.security.Key) (abyte0)));
	//    9   17:aload_2         
	//   10   18:iconst_2        
	//   11   19:aload_0         
	//   12   20:invokevirtual   #54  <Method void Cipher.init(int, java.security.Key)>
			abyte0 = cipher.doFinal(abyte1);
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #58  <Method byte[] Cipher.doFinal(byte[])>
	//   16   28:astore_0        
		}
	//*  17   29:aload_0         
	//*  18   30:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  19   31:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   20   32:getstatic       #20  <Field FMLog log>
	//   21   35:ldc1            #2   <Class DES>
	//   22   37:invokevirtual   #64  <Method String Class.getName()>
	//   23   40:aload_0         
	//   24   41:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   25   44:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   26   49:aconst_null     
	//   27   50:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  28   51:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   29   52:getstatic       #20  <Field FMLog log>
	//   30   55:ldc1            #2   <Class DES>
	//   31   57:invokevirtual   #64  <Method String Class.getName()>
	//   32   60:aload_0         
	//   33   61:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   34   64:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   35   69:aconst_null     
	//   36   70:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  37   71:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   38   72:getstatic       #20  <Field FMLog log>
	//   39   75:ldc1            #2   <Class DES>
	//   40   77:invokevirtual   #64  <Method String Class.getName()>
	//   41   80:aload_0         
	//   42   81:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   43   84:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   44   89:aconst_null     
	//   45   90:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  46   91:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   47   92:getstatic       #20  <Field FMLog log>
	//   48   95:ldc1            #2   <Class DES>
	//   49   97:invokevirtual   #64  <Method String Class.getName()>
	//   50  100:aload_0         
	//   51  101:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   52  104:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   53  109:aconst_null     
	//   54  110:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  55  111:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   56  112:getstatic       #20  <Field FMLog log>
	//   57  115:ldc1            #2   <Class DES>
	//   58  117:invokevirtual   #64  <Method String Class.getName()>
	//   59  120:aload_0         
	//   60  121:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   61  124:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   62  129:aconst_null     
	//   63  130:areturn         
		}
		return abyte0;
	}

	public static byte[] encrypt4des(byte abyte0[], byte abyte1[])
	{
		byte abyte2[] = abyte0;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(abyte0 != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          22
		{
			abyte2 = abyte0;
	//    4    6:aload_0         
	//    5    7:astore_2        
			if(abyte0.length > 8)
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:bipush          8
	//*   9   12:icmple          22
				abyte2 = FM_Bytes.copyOf(abyte0, 8);
	//   10   15:aload_0         
	//   11   16:bipush          8
	//   12   18:invokestatic    #87  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   13   21:astore_2        
		}
		abyte0 = ((byte []) (new SecretKeySpec(abyte2, "DES")));
	//   14   22:new             #38  <Class SecretKeySpec>
	//   15   25:dup             
	//   16   26:aload_2         
	//   17   27:ldc1            #40  <String "DES">
	//   18   29:invokespecial   #43  <Method void SecretKeySpec(byte[], String)>
	//   19   32:astore_0        
		try
		{
			Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
	//   20   33:ldc1            #45  <String "DES/ECB/NoPadding">
	//   21   35:invokestatic    #50  <Method Cipher Cipher.getInstance(String)>
	//   22   38:astore_2        
			cipher.init(1, ((java.security.Key) (abyte0)));
	//   23   39:aload_2         
	//   24   40:iconst_1        
	//   25   41:aload_0         
	//   26   42:invokevirtual   #54  <Method void Cipher.init(int, java.security.Key)>
			abyte0 = cipher.doFinal(abyte1);
	//   27   45:aload_2         
	//   28   46:aload_1         
	//   29   47:invokevirtual   #58  <Method byte[] Cipher.doFinal(byte[])>
	//   30   50:astore_0        
		}
	//*  31   51:aload_0         
	//*  32   52:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  33   53:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   34   54:getstatic       #20  <Field FMLog log>
	//   35   57:ldc1            #2   <Class DES>
	//   36   59:invokevirtual   #64  <Method String Class.getName()>
	//   37   62:aload_0         
	//   38   63:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   39   66:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   40   71:aconst_null     
	//   41   72:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  42   73:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   43   74:getstatic       #20  <Field FMLog log>
	//   44   77:ldc1            #2   <Class DES>
	//   45   79:invokevirtual   #64  <Method String Class.getName()>
	//   46   82:aload_0         
	//   47   83:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   48   86:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   49   91:aconst_null     
	//   50   92:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  51   93:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   52   94:getstatic       #20  <Field FMLog log>
	//   53   97:ldc1            #2   <Class DES>
	//   54   99:invokevirtual   #64  <Method String Class.getName()>
	//   55  102:aload_0         
	//   56  103:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   57  106:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   58  111:aconst_null     
	//   59  112:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  60  113:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   61  114:getstatic       #20  <Field FMLog log>
	//   62  117:ldc1            #2   <Class DES>
	//   63  119:invokevirtual   #64  <Method String Class.getName()>
	//   64  122:aload_0         
	//   65  123:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   66  126:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   67  131:aconst_null     
	//   68  132:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  69  133:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   70  134:getstatic       #20  <Field FMLog log>
	//   71  137:ldc1            #2   <Class DES>
	//   72  139:invokevirtual   #64  <Method String Class.getName()>
	//   73  142:aload_0         
	//   74  143:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   75  146:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   76  151:aconst_null     
	//   77  152:areturn         
		}
		return abyte0;
	}

	public static byte[] encrypt4des3(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       25
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull");
	//    4    8:getstatic       #20  <Field FMLog log>
	//    5   11:ldc1            #2   <Class DES>
	//    6   13:invokevirtual   #64  <Method String Class.getName()>
	//    7   16:ldc1            #139 <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull">
	//    8   18:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
		}
		if(abyte0.length % 8 != 0)
	//*  11   25:aload_0         
	//*  12   26:arraylength     
	//*  13   27:bipush          8
	//*  14   29:irem            
	//*  15   30:ifeq            48
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   16   33:getstatic       #20  <Field FMLog log>
	//   17   36:ldc1            #2   <Class DES>
	//   18   38:invokevirtual   #64  <Method String Class.getName()>
	//   19   41:ldc1            #141 <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   20   43:invokeinterface #76  <Method void FMLog.error(String, String)>
		byte abyte2[] = FM_Bytes.copyOf(abyte0, 8);
	//   21   48:aload_0         
	//   22   49:bipush          8
	//   23   51:invokestatic    #87  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   24   54:astore_2        
		return encrypt4des(abyte2, decrypt4des(FM_Bytes.copyOfRange(abyte0, 8, abyte0.length), encrypt4des(abyte2, abyte1)));
	//   25   55:aload_2         
	//   26   56:aload_0         
	//   27   57:bipush          8
	//   28   59:aload_0         
	//   29   60:arraylength     
	//   30   61:invokestatic    #91  <Method byte[] FM_Bytes.copyOfRange(byte[], int, int)>
	//   31   64:aload_2         
	//   32   65:aload_1         
	//   33   66:invokestatic    #96  <Method byte[] encrypt4des(byte[], byte[])>
	//   34   69:invokestatic    #93  <Method byte[] decrypt4des(byte[], byte[])>
	//   35   72:invokestatic    #96  <Method byte[] encrypt4des(byte[], byte[])>
	//   36   75:areturn         
	}

	public static byte[] encrypt4des3CBC(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       25
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull");
	//    4    8:getstatic       #20  <Field FMLog log>
	//    5   11:ldc1            #2   <Class DES>
	//    6   13:invokevirtual   #64  <Method String Class.getName()>
	//    7   16:ldc1            #139 <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull">
	//    8   18:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
		}
		if(abyte0.length % 8 != 0)
	//*  11   25:aload_0         
	//*  12   26:arraylength     
	//*  13   27:bipush          8
	//*  14   29:irem            
	//*  15   30:ifeq            48
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   16   33:getstatic       #20  <Field FMLog log>
	//   17   36:ldc1            #2   <Class DES>
	//   18   38:invokevirtual   #64  <Method String Class.getName()>
	//   19   41:ldc1            #141 <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   20   43:invokeinterface #76  <Method void FMLog.error(String, String)>
		int l = abyte1.length / 8;
	//   21   48:aload_1         
	//   22   49:arraylength     
	//   23   50:bipush          8
	//   24   52:idiv            
	//   25   53:istore          5
		byte abyte3[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
			l, 8
		});
	//   26   55:getstatic       #104 <Field Class Byte.TYPE>
	//   27   58:iconst_2        
	//   28   59:newarray        int[]
	//   29   61:dup             
	//   30   62:iconst_0        
	//   31   63:iload           5
	//   32   65:iastore         
	//   33   66:dup             
	//   34   67:iconst_1        
	//   35   68:bipush          8
	//   36   70:iastore         
	//   37   71:invokestatic    #110 <Method Object Array.newInstance(Class, int[])>
	//   38   74:checkcast       #112 <Class byte[][]>
	//   39   77:astore          6
		for(int i = 0; i < l; i++)
	//*  40   79:iconst_0        
	//*  41   80:istore_3        
	//*  42   81:goto            123
		{
			for(int k = 0; k < 8; k++)
	//*  43   84:iconst_0        
	//*  44   85:istore          4
	//*  45   87:goto            112
				abyte3[i][k] = abyte1[i * 8 + k];
	//   46   90:aload           6
	//   47   92:iload_3         
	//   48   93:aaload          
	//   49   94:iload           4
	//   50   96:aload_1         
	//   51   97:iload_3         
	//   52   98:bipush          8
	//   53  100:imul            
	//   54  101:iload           4
	//   55  103:iadd            
	//   56  104:baload          
	//   57  105:bastore         

	//   58  106:iload           4
	//   59  108:iconst_1        
	//   60  109:iadd            
	//   61  110:istore          4
	//   62  112:iload           4
	//   63  114:bipush          8
	//   64  116:icmplt          90
		}

	//   65  119:iload_3         
	//   66  120:iconst_1        
	//   67  121:iadd            
	//   68  122:istore_3        
	//   69  123:iload_3         
	//   70  124:iload           5
	//   71  126:icmplt          84
		abyte1 = new byte[8];
	//   72  129:bipush          8
	//   73  131:newarray        byte[]
	//   74  133:astore_1        
		abyte1 = encrypt4des3(abyte0, FM_Bytes.xor(abyte3[0], abyte2));
	//   75  134:aload_0         
	//   76  135:aload           6
	//   77  137:iconst_0        
	//   78  138:aaload          
	//   79  139:aload_2         
	//   80  140:invokestatic    #117 <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   81  143:invokestatic    #144 <Method byte[] encrypt4des3(byte[], byte[])>
	//   82  146:astore_1        
		abyte2 = abyte1;
	//   83  147:aload_1         
	//   84  148:astore_2        
		for(int j = 1; j < l; j++)
	//*  85  149:iconst_1        
	//*  86  150:istore_3        
	//*  87  151:goto            177
		{
			abyte2 = encrypt4des3(abyte0, FM_Bytes.xor(abyte2, abyte3[j]));
	//   88  154:aload_0         
	//   89  155:aload_2         
	//   90  156:aload           6
	//   91  158:iload_3         
	//   92  159:aaload          
	//   93  160:invokestatic    #117 <Method byte[] FM_Bytes.xor(byte[], byte[])>
	//   94  163:invokestatic    #144 <Method byte[] encrypt4des3(byte[], byte[])>
	//   95  166:astore_2        
			abyte1 = FM_Bytes.join(abyte1, abyte2);
	//   96  167:aload_1         
	//   97  168:aload_2         
	//   98  169:invokestatic    #120 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   99  172:astore_1        
		}

	//  100  173:iload_3         
	//  101  174:iconst_1        
	//  102  175:iadd            
	//  103  176:istore_3        
	//  104  177:iload_3         
	//  105  178:iload           5
	//  106  180:icmplt          154
		return abyte1;
	//  107  183:aload_1         
	//  108  184:areturn         
	}

	public static byte[] encrypt4des3Padding(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       25
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull");
	//    4    8:getstatic       #20  <Field FMLog log>
	//    5   11:ldc1            #2   <Class DES>
	//    6   13:invokevirtual   #64  <Method String Class.getName()>
	//    7   16:ldc1            #139 <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u6216\u8005\u5F85\u52A0\u5BC6\u7684\u6570\u636E\u4E3Anull">
	//    8   18:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
		}
		if(abyte0.length % 8 != 0)
	//*  11   25:aload_0         
	//*  12   26:arraylength     
	//*  13   27:bipush          8
	//*  14   29:irem            
	//*  15   30:ifeq            48
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//   16   33:getstatic       #20  <Field FMLog log>
	//   17   36:ldc1            #2   <Class DES>
	//   18   38:invokevirtual   #64  <Method String Class.getName()>
	//   19   41:ldc1            #141 <String "\u5BF9\u6570\u636E\u8FDB\u884C3DES\u52A0\u5BC6\u65F6\uFF0C\u4F20\u5165\u7684KEY\u7684\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   20   43:invokeinterface #76  <Method void FMLog.error(String, String)>
		byte abyte2[] = FM_Bytes.copyOf(abyte0, 8);
	//   21   48:aload_0         
	//   22   49:bipush          8
	//   23   51:invokestatic    #87  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   24   54:astore_2        
		return encrypt4desPadding(abyte2, decrypt4desPadding(FM_Bytes.copyOfRange(abyte0, 8, abyte0.length), encrypt4desPadding(abyte2, abyte1)));
	//   25   55:aload_2         
	//   26   56:aload_0         
	//   27   57:bipush          8
	//   28   59:aload_0         
	//   29   60:arraylength     
	//   30   61:invokestatic    #91  <Method byte[] FM_Bytes.copyOfRange(byte[], int, int)>
	//   31   64:aload_2         
	//   32   65:aload_1         
	//   33   66:invokestatic    #148 <Method byte[] encrypt4desPadding(byte[], byte[])>
	//   34   69:invokestatic    #150 <Method byte[] decrypt4desPadding(byte[], byte[])>
	//   35   72:invokestatic    #148 <Method byte[] encrypt4desPadding(byte[], byte[])>
	//   36   75:areturn         
	}

	public static byte[] encrypt4desCBC(byte abyte0[], byte abyte1[], byte abyte2[])
	{
		byte abyte3[] = abyte0;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(abyte0 != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          22
		{
			abyte3 = abyte0;
	//    4    6:aload_0         
	//    5    7:astore_3        
			if(abyte0.length > 8)
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:bipush          8
	//*   9   12:icmple          22
				abyte3 = FM_Bytes.copyOf(abyte0, 8);
	//   10   15:aload_0         
	//   11   16:bipush          8
	//   12   18:invokestatic    #87  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   13   21:astore_3        
		}
		abyte0 = ((byte []) (new IvParameterSpec(abyte2)));
	//   14   22:new             #125 <Class IvParameterSpec>
	//   15   25:dup             
	//   16   26:aload_2         
	//   17   27:invokespecial   #128 <Method void IvParameterSpec(byte[])>
	//   18   30:astore_0        
		abyte2 = ((byte []) (new SecretKeySpec(abyte3, "DES")));
	//   19   31:new             #38  <Class SecretKeySpec>
	//   20   34:dup             
	//   21   35:aload_3         
	//   22   36:ldc1            #40  <String "DES">
	//   23   38:invokespecial   #43  <Method void SecretKeySpec(byte[], String)>
	//   24   41:astore_2        
		try
		{
			Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
	//   25   42:ldc1            #130 <String "DES/CBC/NoPadding">
	//   26   44:invokestatic    #50  <Method Cipher Cipher.getInstance(String)>
	//   27   47:astore_3        
			cipher.init(1, ((java.security.Key) (abyte2)), ((java.security.spec.AlgorithmParameterSpec) (abyte0)));
	//   28   48:aload_3         
	//   29   49:iconst_1        
	//   30   50:aload_2         
	//   31   51:aload_0         
	//   32   52:invokevirtual   #133 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			abyte0 = cipher.doFinal(abyte1);
	//   33   55:aload_3         
	//   34   56:aload_1         
	//   35   57:invokevirtual   #58  <Method byte[] Cipher.doFinal(byte[])>
	//   36   60:astore_0        
		}
	//*  37   61:aload_0         
	//*  38   62:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  39   63:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   40   64:getstatic       #20  <Field FMLog log>
	//   41   67:ldc1            #2   <Class DES>
	//   42   69:invokevirtual   #64  <Method String Class.getName()>
	//   43   72:aload_0         
	//   44   73:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   45   76:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   46   81:aconst_null     
	//   47   82:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  48   83:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   49   84:getstatic       #20  <Field FMLog log>
	//   50   87:ldc1            #2   <Class DES>
	//   51   89:invokevirtual   #64  <Method String Class.getName()>
	//   52   92:aload_0         
	//   53   93:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   54   96:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   55  101:aconst_null     
	//   56  102:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  57  103:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   58  104:getstatic       #20  <Field FMLog log>
	//   59  107:ldc1            #2   <Class DES>
	//   60  109:invokevirtual   #64  <Method String Class.getName()>
	//   61  112:aload_0         
	//   62  113:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   63  116:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   64  121:aconst_null     
	//   65  122:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  66  123:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   67  124:getstatic       #20  <Field FMLog log>
	//   68  127:ldc1            #2   <Class DES>
	//   69  129:invokevirtual   #64  <Method String Class.getName()>
	//   70  132:aload_0         
	//   71  133:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   72  136:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   73  141:aconst_null     
	//   74  142:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  75  143:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   76  144:getstatic       #20  <Field FMLog log>
	//   77  147:ldc1            #2   <Class DES>
	//   78  149:invokevirtual   #64  <Method String Class.getName()>
	//   79  152:aload_0         
	//   80  153:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   81  156:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   82  161:aconst_null     
	//   83  162:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  84  163:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   85  164:getstatic       #20  <Field FMLog log>
	//   86  167:ldc1            #2   <Class DES>
	//   87  169:invokevirtual   #64  <Method String Class.getName()>
	//   88  172:aload_0         
	//   89  173:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   90  176:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   91  181:aconst_null     
	//   92  182:areturn         
		}
		return abyte0;
	}

	public static byte[] encrypt4desPadding(byte abyte0[], byte abyte1[])
	{
		byte abyte2[] = abyte0;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(abyte0 != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          22
		{
			abyte2 = abyte0;
	//    4    6:aload_0         
	//    5    7:astore_2        
			if(abyte0.length > 8)
	//*   6    8:aload_0         
	//*   7    9:arraylength     
	//*   8   10:bipush          8
	//*   9   12:icmple          22
				abyte2 = FM_Bytes.copyOf(abyte0, 8);
	//   10   15:aload_0         
	//   11   16:bipush          8
	//   12   18:invokestatic    #87  <Method byte[] FM_Bytes.copyOf(byte[], int)>
	//   13   21:astore_2        
		}
		abyte0 = ((byte []) (new SecretKeySpec(abyte2, "DES")));
	//   14   22:new             #38  <Class SecretKeySpec>
	//   15   25:dup             
	//   16   26:aload_2         
	//   17   27:ldc1            #40  <String "DES">
	//   18   29:invokespecial   #43  <Method void SecretKeySpec(byte[], String)>
	//   19   32:astore_0        
		try
		{
			Cipher cipher = Cipher.getInstance("DES/ECB/Padding");
	//   20   33:ldc1            #136 <String "DES/ECB/Padding">
	//   21   35:invokestatic    #50  <Method Cipher Cipher.getInstance(String)>
	//   22   38:astore_2        
			cipher.init(1, ((java.security.Key) (abyte0)));
	//   23   39:aload_2         
	//   24   40:iconst_1        
	//   25   41:aload_0         
	//   26   42:invokevirtual   #54  <Method void Cipher.init(int, java.security.Key)>
			abyte0 = cipher.doFinal(abyte1);
	//   27   45:aload_2         
	//   28   46:aload_1         
	//   29   47:invokevirtual   #58  <Method byte[] Cipher.doFinal(byte[])>
	//   30   50:astore_0        
		}
	//*  31   51:aload_0         
	//*  32   52:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  33   53:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   34   54:getstatic       #20  <Field FMLog log>
	//   35   57:ldc1            #2   <Class DES>
	//   36   59:invokevirtual   #64  <Method String Class.getName()>
	//   37   62:aload_0         
	//   38   63:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   39   66:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   40   71:aconst_null     
	//   41   72:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  42   73:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   43   74:getstatic       #20  <Field FMLog log>
	//   44   77:ldc1            #2   <Class DES>
	//   45   79:invokevirtual   #64  <Method String Class.getName()>
	//   46   82:aload_0         
	//   47   83:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   48   86:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   49   91:aconst_null     
	//   50   92:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  51   93:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   52   94:getstatic       #20  <Field FMLog log>
	//   53   97:ldc1            #2   <Class DES>
	//   54   99:invokevirtual   #64  <Method String Class.getName()>
	//   55  102:aload_0         
	//   56  103:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   57  106:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   58  111:aconst_null     
	//   59  112:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  60  113:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   61  114:getstatic       #20  <Field FMLog log>
	//   62  117:ldc1            #2   <Class DES>
	//   63  119:invokevirtual   #64  <Method String Class.getName()>
	//   64  122:aload_0         
	//   65  123:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   66  126:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   67  131:aconst_null     
	//   68  132:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  69  133:astore_0        
		{
			log.error(((Class) (cn/com/fmsh/util/algorithm/DES)).getName(), Util4Java.getExceptionInfo(((Exception) (abyte0))));
	//   70  134:getstatic       #20  <Field FMLog log>
	//   71  137:ldc1            #2   <Class DES>
	//   72  139:invokevirtual   #64  <Method String Class.getName()>
	//   73  142:aload_0         
	//   74  143:invokestatic    #70  <Method String Util4Java.getExceptionInfo(Exception)>
	//   75  146:invokeinterface #76  <Method void FMLog.error(String, String)>
			return null;
	//   76  151:aconst_null     
	//   77  152:areturn         
		}
		return abyte0;
	}

	public static byte[] javaDes3(byte abyte0[], byte abyte1[])
	{
		abyte0 = ((byte []) (new SecretKeySpec(abyte0, "DESede")));
	//    0    0:new             #38  <Class SecretKeySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #154 <String "DESede">
	//    4    7:invokespecial   #43  <Method void SecretKeySpec(byte[], String)>
	//    5   10:astore_0        
		try
		{
			Cipher cipher = Cipher.getInstance("DESede");
	//    6   11:ldc1            #154 <String "DESede">
	//    7   13:invokestatic    #50  <Method Cipher Cipher.getInstance(String)>
	//    8   16:astore_2        
			cipher.init(1, ((java.security.Key) (abyte0)));
	//    9   17:aload_2         
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:invokevirtual   #54  <Method void Cipher.init(int, java.security.Key)>
			abyte0 = cipher.doFinal(abyte1);
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #58  <Method byte[] Cipher.doFinal(byte[])>
	//   16   28:astore_0        
		}
	//*  17   29:aload_0         
	//*  18   30:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  19   31:astore_0        
		{
			System.out.println(((NoSuchAlgorithmException) (abyte0)).getMessage());
	//   20   32:getstatic       #160 <Field PrintStream System.out>
	//   21   35:aload_0         
	//   22   36:invokevirtual   #163 <Method String NoSuchAlgorithmException.getMessage()>
	//   23   39:invokevirtual   #169 <Method void PrintStream.println(String)>
			return null;
	//   24   42:aconst_null     
	//   25   43:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  26   44:astore_0        
		{
			System.out.println(((NoSuchPaddingException) (abyte0)).getMessage());
	//   27   45:getstatic       #160 <Field PrintStream System.out>
	//   28   48:aload_0         
	//   29   49:invokevirtual   #170 <Method String NoSuchPaddingException.getMessage()>
	//   30   52:invokevirtual   #169 <Method void PrintStream.println(String)>
			return null;
	//   31   55:aconst_null     
	//   32   56:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  33   57:astore_0        
		{
			System.out.println(((IllegalBlockSizeException) (abyte0)).getMessage());
	//   34   58:getstatic       #160 <Field PrintStream System.out>
	//   35   61:aload_0         
	//   36   62:invokevirtual   #171 <Method String IllegalBlockSizeException.getMessage()>
	//   37   65:invokevirtual   #169 <Method void PrintStream.println(String)>
			return null;
	//   38   68:aconst_null     
	//   39   69:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  40   70:astore_0        
		{
			System.out.println(((BadPaddingException) (abyte0)).getMessage());
	//   41   71:getstatic       #160 <Field PrintStream System.out>
	//   42   74:aload_0         
	//   43   75:invokevirtual   #172 <Method String BadPaddingException.getMessage()>
	//   44   78:invokevirtual   #169 <Method void PrintStream.println(String)>
			return null;
	//   45   81:aconst_null     
	//   46   82:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  47   83:astore_0        
		{
			System.out.println(((InvalidKeyException) (abyte0)).getMessage());
	//   48   84:getstatic       #160 <Field PrintStream System.out>
	//   49   87:aload_0         
	//   50   88:invokevirtual   #173 <Method String InvalidKeyException.getMessage()>
	//   51   91:invokevirtual   #169 <Method void PrintStream.println(String)>
			return null;
	//   52   94:aconst_null     
	//   53   95:areturn         
		}
		return abyte0;
	}

	public static void main(String args[])
	{
	//    0    0:return          
	}

	public static void showArray(byte abyte0[])
	{
		int j = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_1        
	//*   5    5:goto            41
		{
			byte byte0 = abyte0[i];
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:baload          
	//    9   11:istore_3        
			System.out.print((new StringBuilder(String.valueOf(((int) (byte0))))).append("\t").toString());
	//   10   12:getstatic       #160 <Field PrintStream System.out>
	//   11   15:new             #178 <Class StringBuilder>
	//   12   18:dup             
	//   13   19:iload_3         
	//   14   20:invokestatic    #184 <Method String String.valueOf(int)>
	//   15   23:invokespecial   #186 <Method void StringBuilder(String)>
	//   16   26:ldc1            #188 <String "\t">
	//   17   28:invokevirtual   #192 <Method StringBuilder StringBuilder.append(String)>
	//   18   31:invokevirtual   #195 <Method String StringBuilder.toString()>
	//   19   34:invokevirtual   #198 <Method void PrintStream.print(String)>
		}

	//   20   37:iload_1         
	//   21   38:iconst_1        
	//   22   39:iadd            
	//   23   40:istore_1        
	//   24   41:iload_1         
	//   25   42:iload_2         
	//   26   43:icmplt          8
		System.out.println();
	//   27   46:getstatic       #160 <Field PrintStream System.out>
	//   28   49:invokevirtual   #200 <Method void PrintStream.println()>
	//   29   52:return          
	}

	private static FMLog log = LogFactory.getInstance().getLog();

	static 
	{
	//    0    0:invokestatic    #14  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #18  <Method FMLog LogFactory.getLog()>
	//    2    6:putstatic       #20  <Field FMLog log>
	//*   3    9:return          
	}
}
