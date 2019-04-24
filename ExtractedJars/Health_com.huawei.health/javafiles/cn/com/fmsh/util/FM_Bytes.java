// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;

import cn.com.fmsh.FM_Exception;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.PrintStream;
import java.util.Arrays;

public class FM_Bytes
{

	public FM_Bytes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		data = new byte[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:newarray        byte[]
	//    5    8:putfield        #43  <Field byte[] data>
	//    6   11:return          
	}

	public FM_Bytes(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		data = new byte[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:newarray        byte[]
	//    5    8:putfield        #43  <Field byte[] data>
		valueof(s);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokevirtual   #48  <Method boolean valueof(String)>
	//    9   16:pop             
	//   10   17:return          
	}

	public static byte[] and(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       29
		{
			if(log != null)
	//*   4    8:getstatic       #25  <Field FMLog log>
	//*   5   11:ifnull          27
				log.error(clazzName, "\u4E0E\u8FD0\u7B97\u65F6\uFF0C\u6570\u7EC4\u4E3Anull");
	//    6   14:getstatic       #25  <Field FMLog log>
	//    7   17:getstatic       #37  <Field String clazzName>
	//    8   20:ldc1            #52  <String "\u4E0E\u8FD0\u7B97\u65F6\uFF0C\u6570\u7EC4\u4E3Anull">
	//    9   22:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//   10   27:aconst_null     
	//   11   28:areturn         
		}
		if(abyte0.length != abyte1.length)
	//*  12   29:aload_0         
	//*  13   30:arraylength     
	//*  14   31:aload_1         
	//*  15   32:arraylength     
	//*  16   33:icmpeq          57
		{
			if(log != null)
	//*  17   36:getstatic       #25  <Field FMLog log>
	//*  18   39:ifnull          55
				log.error(clazzName, "\u4E0E\u8FD0\u7B97\u65F6\uFF0Cbyte\u6570\u7EC4\u957F\u5EA6\u4E0D\u7B49");
	//   19   42:getstatic       #25  <Field FMLog log>
	//   20   45:getstatic       #37  <Field String clazzName>
	//   21   48:ldc1            #60  <String "\u4E0E\u8FD0\u7B97\u65F6\uFF0Cbyte\u6570\u7EC4\u957F\u5EA6\u4E0D\u7B49">
	//   22   50:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//   23   55:aconst_null     
	//   24   56:areturn         
		}
		abyte0 = (byte[])((byte []) (abyte0)).clone();
	//   25   57:aload_0         
	//   26   58:invokevirtual   #65  <Method Object _5B_B.clone()>
	//   27   61:checkcast       #61  <Class byte[]>
	//   28   64:astore_0        
		for(int i = 0; i < abyte0.length; i++)
	//*  29   65:iconst_0        
	//*  30   66:istore_2        
	//*  31   67:goto            85
			abyte0[i] = (byte)(abyte0[i] & abyte1[i]);
	//   32   70:aload_0         
	//   33   71:iload_2         
	//   34   72:aload_0         
	//   35   73:iload_2         
	//   36   74:baload          
	//   37   75:aload_1         
	//   38   76:iload_2         
	//   39   77:baload          
	//   40   78:iand            
	//   41   79:int2byte        
	//   42   80:bastore         

	//   43   81:iload_2         
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore_2        
	//   47   85:iload_2         
	//   48   86:aload_0         
	//   49   87:arraylength     
	//   50   88:icmplt          70
		return abyte0;
	//   51   91:aload_0         
	//   52   92:areturn         
	}

	public static byte[] bytePatch4Des(byte abyte0[])
	{
		byte abyte1[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		abyte1[0] = -128;
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:bipush          -128
	//    6    9:bastore         
		if(abyte0 == null)
	//*   7   10:aload_0         
	//*   8   11:ifnonnull       16
			return null;
	//    9   14:aconst_null     
	//   10   15:areturn         
		int i = abyte0.length;
	//   11   16:aload_0         
	//   12   17:arraylength     
	//   13   18:istore_1        
		if(i % 8 != 0)
	//*  14   19:iload_1         
	//*  15   20:bipush          8
	//*  16   22:irem            
	//*  17   23:ifeq            37
			i = 8 - i % 8;
	//   18   26:bipush          8
	//   19   28:iload_1         
	//   20   29:bipush          8
	//   21   31:irem            
	//   22   32:isub            
	//   23   33:istore_1        
		else
	//*  24   34:goto            40
			i = 8;
	//   25   37:bipush          8
	//   26   39:istore_1        
		return join(abyte0, copyOf(abyte1, i));
	//   27   40:aload_0         
	//   28   41:aload_2         
	//   29   42:iload_1         
	//   30   43:invokestatic    #71  <Method byte[] copyOf(byte[], int)>
	//   31   46:invokestatic    #74  <Method byte[] join(byte[], byte[])>
	//   32   49:areturn         
	}

	public static byte[] byteRemovePatch4Des(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		for(int i = abyte0.length - 1; i > abyte0.length - 9; i--)
	//*   4    6:aload_0         
	//*   5    7:arraylength     
	//*   6    8:iconst_1        
	//*   7    9:isub            
	//*   8   10:istore_1        
	//*   9   11:goto            32
			if(-128 == abyte0[i])
	//*  10   14:bipush          -128
	//*  11   16:aload_0         
	//*  12   17:iload_1         
	//*  13   18:baload          
	//*  14   19:icmpne          28
				return Arrays.copyOf(abyte0, i);
	//   15   22:aload_0         
	//   16   23:iload_1         
	//   17   24:invokestatic    #78  <Method byte[] Arrays.copyOf(byte[], int)>
	//   18   27:areturn         

	//   19   28:iload_1         
	//   20   29:iconst_1        
	//   21   30:isub            
	//   22   31:istore_1        
	//   23   32:iload_1         
	//   24   33:aload_0         
	//   25   34:arraylength     
	//   26   35:bipush          9
	//   27   37:isub            
	//   28   38:icmpgt          14
		return abyte0;
	//   29   41:aload_0         
	//   30   42:areturn         
	}

	public static String bytesToHexString(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return bytesToHexString(abyte0, "", "");
	//    4    6:aload_0         
	//    5    7:ldc1            #82  <String "">
	//    6    9:ldc1            #82  <String "">
	//    7   11:invokestatic    #85  <Method String bytesToHexString(byte[], String, String)>
	//    8   14:areturn         
	}

	public static String bytesToHexString(byte abyte0[], String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          6
		for(int i = 0; i < abyte0.length; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:goto            116
		{
			String s3 = Integer.toHexString(abyte0[i] & 0xff);
	//    7   14:aload_0         
	//    8   15:iload_3         
	//    9   16:baload          
	//   10   17:sipush          255
	//   11   20:iand            
	//   12   21:invokestatic    #94  <Method String Integer.toHexString(int)>
	//   13   24:astore          5
			String s2 = s3;
	//   14   26:aload           5
	//   15   28:astore          4
			if(s3.length() == 1)
	//*  16   30:aload           5
	//*  17   32:invokevirtual   #100 <Method int String.length()>
	//*  18   35:iconst_1        
	//*  19   36:icmpne          61
				s2 = (new StringBuilder(String.valueOf('0'))).append(s3).toString();
	//   20   39:new             #87  <Class StringBuilder>
	//   21   42:dup             
	//   22   43:bipush          48
	//   23   45:invokestatic    #104 <Method String String.valueOf(char)>
	//   24   48:invokespecial   #106 <Method void StringBuilder(String)>
	//   25   51:aload           5
	//   26   53:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   28   59:astore          4
			if(s != null && !"".equals(((Object) (s))))
	//*  29   61:aload_1         
	//*  30   62:ifnull          81
	//*  31   65:ldc1            #82  <String "">
	//*  32   67:aload_1         
	//*  33   68:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*  34   71:ifne            81
				stringbuilder.append(s);
	//   35   74:aload           6
	//   36   76:aload_1         
	//   37   77:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			stringbuilder.append(s2.toUpperCase());
	//   39   81:aload           6
	//   40   83:aload           4
	//   41   85:invokevirtual   #120 <Method String String.toUpperCase()>
	//   42   88:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
			if(s1 != null && !"".equals(((Object) (s1))))
	//*  44   92:aload_2         
	//*  45   93:ifnull          112
	//*  46   96:ldc1            #82  <String "">
	//*  47   98:aload_2         
	//*  48   99:invokevirtual   #117 <Method boolean String.equals(Object)>
	//*  49  102:ifne            112
				stringbuilder.append(s1);
	//   50  105:aload           6
	//   51  107:aload_2         
	//   52  108:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   53  111:pop             
		}

	//   54  112:iload_3         
	//   55  113:iconst_1        
	//   56  114:iadd            
	//   57  115:istore_3        
	//   58  116:iload_3         
	//   59  117:aload_0         
	//   60  118:arraylength     
	//   61  119:icmplt          14
		return stringbuilder.toString();
	//   62  122:aload           6
	//   63  124:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   64  127:areturn         
	}

	public static int bytesToInt(byte abyte0[])
	{
		return bytesToInt(abyte0, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #125 <Method int bytesToInt(byte[], boolean)>
	//    3    5:ireturn         
	}

	public static int bytesToInt(byte abyte0[], boolean flag)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       25
		{
			if(log != null)
	//*   2    4:getstatic       #25  <Field FMLog log>
	//*   3    7:ifnull          23
				log.error(clazzName, "\u5B57\u8282\u6570\u7EC4\u8F6C\u6210\u5341\u8FDB\u5236\u6574\u6570\u65F6\uFF0C\u6570\u7EC4\u4E3Anull");
	//    4   10:getstatic       #25  <Field FMLog log>
	//    5   13:getstatic       #37  <Field String clazzName>
	//    6   16:ldc1            #127 <String "\u5B57\u8282\u6570\u7EC4\u8F6C\u6210\u5341\u8FDB\u5236\u6574\u6570\u65F6\uFF0C\u6570\u7EC4\u4E3Anull">
	//    7   18:invokeinterface #58  <Method void FMLog.error(String, String)>
			return -1;
	//    8   23:iconst_m1       
	//    9   24:ireturn         
		}
		if(abyte0.length < 1)
	//*  10   25:aload_0         
	//*  11   26:arraylength     
	//*  12   27:iconst_1        
	//*  13   28:icmpge          52
		{
			if(log != null)
	//*  14   31:getstatic       #25  <Field FMLog log>
	//*  15   34:ifnull          50
				log.error(clazzName, "\u5B57\u8282\u6570\u7EC4\u8F6C\u6210\u5341\u8FDB\u5236\u6574\u6570\u65F6\uFF0C\u6570\u7EC4\u957F\u5EA6\u4E3A0");
	//   16   37:getstatic       #25  <Field FMLog log>
	//   17   40:getstatic       #37  <Field String clazzName>
	//   18   43:ldc1            #129 <String "\u5B57\u8282\u6570\u7EC4\u8F6C\u6210\u5341\u8FDB\u5236\u6574\u6570\u65F6\uFF0C\u6570\u7EC4\u957F\u5EA6\u4E3A0">
	//   19   45:invokeinterface #58  <Method void FMLog.error(String, String)>
			return -1;
	//   20   50:iconst_m1       
	//   21   51:ireturn         
		}
		if(abyte0.length == 1)
	//*  22   52:aload_0         
	//*  23   53:arraylength     
	//*  24   54:iconst_1        
	//*  25   55:icmpne          66
			return abyte0[0] & 0xff;
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:baload          
	//   29   61:sipush          255
	//   30   64:iand            
	//   31   65:ireturn         
		if(flag)
	//*  32   66:iload_1         
	//*  33   67:ifeq            104
		{
			int i = ((int) (abyte0[0]));
	//   34   70:aload_0         
	//   35   71:iconst_0        
	//   36   72:baload          
	//   37   73:istore_2        
			for(int k = 1; k < abyte0.length; k++)
	//*  38   74:iconst_1        
	//*  39   75:istore_3        
	//*  40   76:goto            96
				i = i << 8 | abyte0[k] & 0xff;
	//   41   79:iload_2         
	//   42   80:bipush          8
	//   43   82:ishl            
	//   44   83:aload_0         
	//   45   84:iload_3         
	//   46   85:baload          
	//   47   86:sipush          255
	//   48   89:iand            
	//   49   90:ior             
	//   50   91:istore_2        

	//   51   92:iload_3         
	//   52   93:iconst_1        
	//   53   94:iadd            
	//   54   95:istore_3        
	//   55   96:iload_3         
	//   56   97:aload_0         
	//   57   98:arraylength     
	//   58   99:icmplt          79
			return i;
	//   59  102:iload_2         
	//   60  103:ireturn         
		}
		int j = ((int) (abyte0[abyte0.length - 1]));
	//   61  104:aload_0         
	//   62  105:aload_0         
	//   63  106:arraylength     
	//   64  107:iconst_1        
	//   65  108:isub            
	//   66  109:baload          
	//   67  110:istore_2        
		for(int l = abyte0.length - 2; l >= 0; l--)
	//*  68  111:aload_0         
	//*  69  112:arraylength     
	//*  70  113:iconst_2        
	//*  71  114:isub            
	//*  72  115:istore_3        
	//*  73  116:goto            136
			j = j << 8 | abyte0[l] & 0xff;
	//   74  119:iload_2         
	//   75  120:bipush          8
	//   76  122:ishl            
	//   77  123:aload_0         
	//   78  124:iload_3         
	//   79  125:baload          
	//   80  126:sipush          255
	//   81  129:iand            
	//   82  130:ior             
	//   83  131:istore_2        

	//   84  132:iload_3         
	//   85  133:iconst_1        
	//   86  134:isub            
	//   87  135:istore_3        
	//   88  136:iload_3         
	//   89  137:ifge            119
		return j;
	//   90  140:iload_2         
	//   91  141:ireturn         
	}

	public static long bytesToLong(byte abyte0[])
	{
		return bytesToLong(abyte0, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #134 <Method long bytesToLong(byte[], boolean)>
	//    3    5:lreturn         
	}

	public static long bytesToLong(byte abyte0[], boolean flag)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       27
		{
			if(log != null)
	//*   2    4:getstatic       #25  <Field FMLog log>
	//*   3    7:ifnull          23
				log.error(clazzName, "\u5B57\u8282\u6570\u7EC4\u8F6C\u6210\u5341\u8FDB\u5236\u6574\u6570\u65F6\uFF0C\u6570\u7EC4\u4E3Anull");
	//    4   10:getstatic       #25  <Field FMLog log>
	//    5   13:getstatic       #37  <Field String clazzName>
	//    6   16:ldc1            #127 <String "\u5B57\u8282\u6570\u7EC4\u8F6C\u6210\u5341\u8FDB\u5236\u6574\u6570\u65F6\uFF0C\u6570\u7EC4\u4E3Anull">
	//    7   18:invokeinterface #58  <Method void FMLog.error(String, String)>
			return -1L;
	//    8   23:ldc2w           #135 <Long -1L>
	//    9   26:lreturn         
		}
		if(abyte0.length < 1)
	//*  10   27:aload_0         
	//*  11   28:arraylength     
	//*  12   29:iconst_1        
	//*  13   30:icmpge          56
		{
			if(log != null)
	//*  14   33:getstatic       #25  <Field FMLog log>
	//*  15   36:ifnull          52
				log.error(clazzName, "\u5B57\u8282\u6570\u7EC4\u8F6C\u6210\u5341\u8FDB\u5236\u6574\u6570\u65F6\uFF0C\u6570\u7EC4\u957F\u5EA6\u4E3A0");
	//   16   39:getstatic       #25  <Field FMLog log>
	//   17   42:getstatic       #37  <Field String clazzName>
	//   18   45:ldc1            #129 <String "\u5B57\u8282\u6570\u7EC4\u8F6C\u6210\u5341\u8FDB\u5236\u6574\u6570\u65F6\uFF0C\u6570\u7EC4\u957F\u5EA6\u4E3A0">
	//   19   47:invokeinterface #58  <Method void FMLog.error(String, String)>
			return -1L;
	//   20   52:ldc2w           #135 <Long -1L>
	//   21   55:lreturn         
		}
		if(abyte0.length == 1)
	//*  22   56:aload_0         
	//*  23   57:arraylength     
	//*  24   58:iconst_1        
	//*  25   59:icmpne          71
			return (long)(abyte0[0] & 0xff);
	//   26   62:aload_0         
	//   27   63:iconst_0        
	//   28   64:baload          
	//   29   65:sipush          255
	//   30   68:iand            
	//   31   69:i2l             
	//   32   70:lreturn         
		if(flag)
	//*  33   71:iload_1         
	//*  34   72:ifeq            115
		{
			long l = abyte0[0] & 0xff;
	//   35   75:aload_0         
	//   36   76:iconst_0        
	//   37   77:baload          
	//   38   78:sipush          255
	//   39   81:iand            
	//   40   82:i2l             
	//   41   83:lstore_3        
			for(int i = 1; i < abyte0.length; i++)
	//*  42   84:iconst_1        
	//*  43   85:istore_2        
	//*  44   86:goto            107
				l = l << 8 | (long)(abyte0[i] & 0xff);
	//   45   89:lload_3         
	//   46   90:bipush          8
	//   47   92:lshl            
	//   48   93:aload_0         
	//   49   94:iload_2         
	//   50   95:baload          
	//   51   96:sipush          255
	//   52   99:iand            
	//   53  100:i2l             
	//   54  101:lor             
	//   55  102:lstore_3        

	//   56  103:iload_2         
	//   57  104:iconst_1        
	//   58  105:iadd            
	//   59  106:istore_2        
	//   60  107:iload_2         
	//   61  108:aload_0         
	//   62  109:arraylength     
	//   63  110:icmplt          89
			return l;
	//   64  113:lload_3         
	//   65  114:lreturn         
		}
		long l1 = abyte0[abyte0.length - 1];
	//   66  115:aload_0         
	//   67  116:aload_0         
	//   68  117:arraylength     
	//   69  118:iconst_1        
	//   70  119:isub            
	//   71  120:baload          
	//   72  121:i2l             
	//   73  122:lstore_3        
		for(int j = abyte0.length - 2; j >= 0; j--)
	//*  74  123:aload_0         
	//*  75  124:arraylength     
	//*  76  125:iconst_2        
	//*  77  126:isub            
	//*  78  127:istore_2        
	//*  79  128:goto            149
			l1 = l1 << 8 | (long)(abyte0[j] & 0xff);
	//   80  131:lload_3         
	//   81  132:bipush          8
	//   82  134:lshl            
	//   83  135:aload_0         
	//   84  136:iload_2         
	//   85  137:baload          
	//   86  138:sipush          255
	//   87  141:iand            
	//   88  142:i2l             
	//   89  143:lor             
	//   90  144:lstore_3        

	//   91  145:iload_2         
	//   92  146:iconst_1        
	//   93  147:isub            
	//   94  148:istore_2        
	//   95  149:iload_2         
	//   96  150:ifge            131
		return l1;
	//   97  153:lload_3         
	//   98  154:lreturn         
	}

	public static transient byte[] concatArrays(byte abyte0[], byte abyte1[][])
	{
		int i = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		int l = abyte1.length;
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:istore          4
		for(int j = 0; j < l; j++)
	//*   6    7:iconst_0        
	//*   7    8:istore_3        
	//*   8    9:goto            23
			i += abyte1[j].length;
	//    9   12:iload_2         
	//   10   13:aload_1         
	//   11   14:iload_3         
	//   12   15:aaload          
	//   13   16:arraylength     
	//   14   17:iadd            
	//   15   18:istore_2        

	//   16   19:iload_3         
	//   17   20:iconst_1        
	//   18   21:iadd            
	//   19   22:istore_3        
	//   20   23:iload_3         
	//   21   24:iload           4
	//   22   26:icmplt          12
		byte abyte2[] = Arrays.copyOf(abyte0, i);
	//   23   29:aload_0         
	//   24   30:iload_2         
	//   25   31:invokestatic    #78  <Method byte[] Arrays.copyOf(byte[], int)>
	//   26   34:astore          5
		i = abyte0.length;
	//   27   36:aload_0         
	//   28   37:arraylength     
	//   29   38:istore_2        
		l = abyte1.length;
	//   30   39:aload_1         
	//   31   40:arraylength     
	//   32   41:istore          4
		for(int k = 0; k < l; k++)
	//*  33   43:iconst_0        
	//*  34   44:istore_3        
	//*  35   45:goto            71
		{
			abyte0 = abyte1[k];
	//   36   48:aload_1         
	//   37   49:iload_3         
	//   38   50:aaload          
	//   39   51:astore_0        
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte2)), i, abyte0.length);
	//   40   52:aload_0         
	//   41   53:iconst_0        
	//   42   54:aload           5
	//   43   56:iload_2         
	//   44   57:aload_0         
	//   45   58:arraylength     
	//   46   59:invokestatic    #144 <Method void System.arraycopy(Object, int, Object, int, int)>
			i += abyte0.length;
	//   47   62:iload_2         
	//   48   63:aload_0         
	//   49   64:arraylength     
	//   50   65:iadd            
	//   51   66:istore_2        
		}

	//   52   67:iload_3         
	//   53   68:iconst_1        
	//   54   69:iadd            
	//   55   70:istore_3        
	//   56   71:iload_3         
	//   57   72:iload           4
	//   58   74:icmplt          48
		return abyte2;
	//   59   77:aload           5
	//   60   79:areturn         
	}

	public static byte[] copyOf(byte abyte0[], int i)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException(" original Arrays is null");
	//    2    4:new             #146 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #148 <String " original Arrays is null">
	//    5   10:invokespecial   #149 <Method void NullPointerException(String)>
	//    6   13:athrow          
		byte abyte1[] = new byte[i];
	//    7   14:iload_1         
	//    8   15:newarray        byte[]
	//    9   17:astore_3        
		if(abyte0.length < i)
	//*  10   18:aload_0         
	//*  11   19:arraylength     
	//*  12   20:iload_1         
	//*  13   21:icmpge          47
		{
			for(i = 0; i < abyte0.length; i++)
	//*  14   24:iconst_0        
	//*  15   25:istore_1        
	//*  16   26:goto            39
				abyte1[i] = abyte0[i];
	//   17   29:aload_3         
	//   18   30:iload_1         
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:baload          
	//   22   34:bastore         

	//   23   35:iload_1         
	//   24   36:iconst_1        
	//   25   37:iadd            
	//   26   38:istore_1        
	//   27   39:iload_1         
	//   28   40:aload_0         
	//   29   41:arraylength     
	//   30   42:icmplt          29
			return abyte1;
	//   31   45:aload_3         
	//   32   46:areturn         
		}
		for(int j = 0; j < i; j++)
	//*  33   47:iconst_0        
	//*  34   48:istore_2        
	//*  35   49:goto            62
			abyte1[j] = abyte0[j];
	//   36   52:aload_3         
	//   37   53:iload_2         
	//   38   54:aload_0         
	//   39   55:iload_2         
	//   40   56:baload          
	//   41   57:bastore         

	//   42   58:iload_2         
	//   43   59:iconst_1        
	//   44   60:iadd            
	//   45   61:istore_2        
	//   46   62:iload_2         
	//   47   63:iload_1         
	//   48   64:icmplt          52
		return abyte1;
	//   49   67:aload_3         
	//   50   68:areturn         
	}

	public static byte[] copyOfRange(byte abyte0[], int i, int j)
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException(" original Arrays is null");
	//    2    4:new             #146 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #148 <String " original Arrays is null">
	//    5   10:invokespecial   #149 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(j - i <= 0)
	//*   7   14:iload_2         
	//*   8   15:iload_1         
	//*   9   16:isub            
	//*  10   17:ifgt            58
			throw new IllegalArgumentException((new StringBuilder(" from[")).append(i).append("]>to[").append(j).append("]").toString());
	//   11   20:new             #153 <Class IllegalArgumentException>
	//   12   23:dup             
	//   13   24:new             #87  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:ldc1            #155 <String " from[">
	//   16   30:invokespecial   #106 <Method void StringBuilder(String)>
	//   17   33:iload_1         
	//   18   34:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
	//   19   37:ldc1            #160 <String "]>to[">
	//   20   39:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:iload_2         
	//   22   43:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
	//   23   46:ldc1            #162 <String "]">
	//   24   48:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   26   54:invokespecial   #163 <Method void IllegalArgumentException(String)>
	//   27   57:athrow          
		if(abyte0.length < j || abyte0.length < i)
	//*  28   58:aload_0         
	//*  29   59:arraylength     
	//*  30   60:iload_2         
	//*  31   61:icmplt          70
	//*  32   64:aload_0         
	//*  33   65:arraylength     
	//*  34   66:iload_1         
	//*  35   67:icmpge          80
			throw new IllegalArgumentException(" ");
	//   36   70:new             #153 <Class IllegalArgumentException>
	//   37   73:dup             
	//   38   74:ldc1            #165 <String " ">
	//   39   76:invokespecial   #163 <Method void IllegalArgumentException(String)>
	//   40   79:athrow          
		int k = j - i;
	//   41   80:iload_2         
	//   42   81:iload_1         
	//   43   82:isub            
	//   44   83:istore_3        
		byte abyte1[] = new byte[k];
	//   45   84:iload_3         
	//   46   85:newarray        byte[]
	//   47   87:astore          4
		for(j = 0; j < k; j++)
	//*  48   89:iconst_0        
	//*  49   90:istore_2        
	//*  50   91:goto            107
			abyte1[j] = abyte0[i + j];
	//   51   94:aload           4
	//   52   96:iload_2         
	//   53   97:aload_0         
	//   54   98:iload_1         
	//   55   99:iload_2         
	//   56  100:iadd            
	//   57  101:baload          
	//   58  102:bastore         

	//   59  103:iload_2         
	//   60  104:iconst_1        
	//   61  105:iadd            
	//   62  106:istore_2        
	//   63  107:iload_2         
	//   64  108:iload_3         
	//   65  109:icmplt          94
		return abyte1;
	//   66  112:aload           4
	//   67  114:areturn         
	}

	public static byte getByteParity(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length == 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
	//*   2    4:aload_0         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		if(abyte0.length == 1)
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:iconst_1        
	//*  10   14:icmpne          21
			return abyte0[0];
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:baload          
	//   14   20:ireturn         
		byte byte0 = abyte0[0];
	//   15   21:aload_0         
	//   16   22:iconst_0        
	//   17   23:baload          
	//   18   24:istore_1        
		for(int i = 1; i < abyte0.length; i++)
	//*  19   25:iconst_1        
	//*  20   26:istore_2        
	//*  21   27:goto            41
			byte0 = (byte)(abyte0[i] ^ byte0);
	//   22   30:aload_0         
	//   23   31:iload_2         
	//   24   32:baload          
	//   25   33:iload_1         
	//   26   34:ixor            
	//   27   35:int2byte        
	//   28   36:istore_1        

	//   29   37:iload_2         
	//   30   38:iconst_1        
	//   31   39:iadd            
	//   32   40:istore_2        
	//   33   41:iload_2         
	//   34   42:aload_0         
	//   35   43:arraylength     
	//   36   44:icmplt          30
		return byte0;
	//   37   47:iload_1         
	//   38   48:ireturn         
	}

	public static byte[] hexStringToBytes(String s)
	{
		if(s == null || s.length() < 1)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #100 <Method int String.length()>
	//*   4    8:iconst_1        
	//*   5    9:icmpge          14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		int l1 = (s.length() + 1) / 2;
	//    8   14:aload_0         
	//    9   15:invokevirtual   #100 <Method int String.length()>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:iconst_2        
	//   13   21:idiv            
	//   14   22:istore          8
		if(l1 > 0)
	//*  15   24:iload           8
	//*  16   26:ifle            225
		{
			byte abyte0[] = new byte[l1];
	//   17   29:iload           8
	//   18   31:newarray        byte[]
	//   19   33:astore          10
			s = s.toUpperCase();
	//   20   35:aload_0         
	//   21   36:invokevirtual   #120 <Method String String.toUpperCase()>
	//   22   39:astore_0        
			int k = 0;
	//   23   40:iconst_0        
	//   24   41:istore          4
			int i = 0;
	//   25   43:iconst_0        
	//   26   44:istore_3        
			byte byte1 = 0;
	//   27   45:iconst_0        
	//   28   46:istore_2        
			for(int l = 0; l < s.length();)
	//*  29   47:iconst_0        
	//*  30   48:istore          5
	//*  31   50:goto            147
			{
				int j1 = ((int) (s.charAt(l)));
	//   32   53:aload_0         
	//   33   54:iload           5
	//   34   56:invokevirtual   #173 <Method char String.charAt(int)>
	//   35   59:istore          6
				int i2 = hexString.indexOf(j1);
	//   36   61:getstatic       #29  <Field String hexString>
	//   37   64:iload           6
	//   38   66:invokevirtual   #177 <Method int String.indexOf(int)>
	//   39   69:istore          9
				int k1 = k;
	//   40   71:iload           4
	//   41   73:istore          7
				j1 = i;
	//   42   75:iload_3         
	//   43   76:istore          6
				byte byte0 = byte1;
	//   44   78:iload_2         
	//   45   79:istore_1        
				if(i2 != -1)
	//*  46   80:iload           9
	//*  47   82:iconst_m1       
	//*  48   83:icmpeq          132
				{
					k1 = k + 1;
	//   49   86:iload           4
	//   50   88:iconst_1        
	//   51   89:iadd            
	//   52   90:istore          7
					if(k1 % 2 == 1)
	//*  53   92:iload           7
	//*  54   94:iconst_2        
	//*  55   95:irem            
	//*  56   96:iconst_1        
	//*  57   97:icmpne          114
					{
						byte0 = (byte)(i2 << 4 | byte1);
	//   58  100:iload           9
	//   59  102:iconst_4        
	//   60  103:ishl            
	//   61  104:iload_2         
	//   62  105:ior             
	//   63  106:int2byte        
	//   64  107:istore_1        
						j1 = i;
	//   65  108:iload_3         
	//   66  109:istore          6
					} else
	//*  67  111:goto            132
					{
						byte0 = (byte)(byte1 | i2);
	//   68  114:iload_2         
	//   69  115:iload           9
	//   70  117:ior             
	//   71  118:int2byte        
	//   72  119:istore_1        
						j1 = i + 1;
	//   73  120:iload_3         
	//   74  121:iconst_1        
	//   75  122:iadd            
	//   76  123:istore          6
						abyte0[i] = byte0;
	//   77  125:aload           10
	//   78  127:iload_3         
	//   79  128:iload_1         
	//   80  129:bastore         
						byte0 = 0;
	//   81  130:iconst_0        
	//   82  131:istore_1        
					}
				}
				l++;
	//   83  132:iload           5
	//   84  134:iconst_1        
	//   85  135:iadd            
	//   86  136:istore          5
				byte1 = byte0;
	//   87  138:iload_1         
	//   88  139:istore_2        
				i = j1;
	//   89  140:iload           6
	//   90  142:istore_3        
				k = k1;
	//   91  143:iload           7
	//   92  145:istore          4
			}

	//   93  147:iload           5
	//   94  149:aload_0         
	//   95  150:invokevirtual   #100 <Method int String.length()>
	//   96  153:icmplt          53
			int i1 = i;
	//   97  156:iload_3         
	//   98  157:istore          5
			if(k % 2 == 1)
	//*  99  159:iload           4
	//* 100  161:iconst_2        
	//* 101  162:irem            
	//* 102  163:iconst_1        
	//* 103  164:icmpne          177
			{
				i1 = i + 1;
	//  104  167:iload_3         
	//  105  168:iconst_1        
	//  106  169:iadd            
	//  107  170:istore          5
				abyte0[i] = byte1;
	//  108  172:aload           10
	//  109  174:iload_3         
	//  110  175:iload_2         
	//  111  176:bastore         
			}
			if(i1 == l1)
	//* 112  177:iload           5
	//* 113  179:iload           8
	//* 114  181:icmpne          187
				return abyte0;
	//  115  184:aload           10
	//  116  186:areturn         
			if(i1 == 0)
	//* 117  187:iload           5
	//* 118  189:ifne            196
				return new byte[0];
	//  119  192:iconst_0        
	//  120  193:newarray        byte[]
	//  121  195:areturn         
			s = ((String) (new byte[i1]));
	//  122  196:iload           5
	//  123  198:newarray        byte[]
	//  124  200:astore_0        
			for(int j = 0; j < i1; j++)
	//* 125  201:iconst_0        
	//* 126  202:istore_3        
	//* 127  203:goto            217
				s[j] = abyte0[j];
	//  128  206:aload_0         
	//  129  207:iload_3         
	//  130  208:aload           10
	//  131  210:iload_3         
	//  132  211:baload          
	//  133  212:bastore         

	//  134  213:iload_3         
	//  135  214:iconst_1        
	//  136  215:iadd            
	//  137  216:istore_3        
	//  138  217:iload_3         
	//  139  218:iload           5
	//  140  220:icmplt          206
			return ((byte []) (s));
	//  141  223:aload_0         
	//  142  224:areturn         
		} else
		{
			return new byte[0];
	//  143  225:iconst_0        
	//  144  226:newarray        byte[]
	//  145  228:areturn         
		}
	}

	public static byte[] intToBytes(int i, int j)
	{
		return intToBytes(i, j, true);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #182 <Method byte[] intToBytes(int, int, boolean)>
	//    4    6:areturn         
	}

	public static byte[] intToBytes(int i, int j, boolean flag)
	{
		if(j < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          26
		{
			if(log != null)
	//*   3    5:getstatic       #25  <Field FMLog log>
	//*   4    8:ifnull          24
				log.error(clazzName, "\u5341\u8FDB\u5236int\u6574\u6570\u8F6C\u6210\u5B57\u8282\u6570\u7EC4\u65F6\uFF0C\u6307\u5B9A\u7684\u6570\u7EC4\u957F\u5EA6\u975E\u6B63");
	//    5   11:getstatic       #25  <Field FMLog log>
	//    6   14:getstatic       #37  <Field String clazzName>
	//    7   17:ldc1            #184 <String "\u5341\u8FDB\u5236int\u6574\u6570\u8F6C\u6210\u5B57\u8282\u6570\u7EC4\u65F6\uFF0C\u6307\u5B9A\u7684\u6570\u7EC4\u957F\u5EA6\u975E\u6B63">
	//    8   19:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//    9   24:aconst_null     
	//   10   25:areturn         
		}
		byte abyte0[] = new byte[j];
	//   11   26:iload_1         
	//   12   27:newarray        byte[]
	//   13   29:astore_3        
		if(flag)
	//*  14   30:iload_2         
	//*  15   31:ifeq            72
		{
			for(j = abyte0.length - 1; j > -1; j--)
	//*  16   34:aload_3         
	//*  17   35:arraylength     
	//*  18   36:iconst_1        
	//*  19   37:isub            
	//*  20   38:istore_1        
	//*  21   39:goto            65
			{
				abyte0[j] = Integer.valueOf(i & 0xff).byteValue();
	//   22   42:aload_3         
	//   23   43:iload_1         
	//   24   44:iload_0         
	//   25   45:sipush          255
	//   26   48:iand            
	//   27   49:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//   28   52:invokevirtual   #191 <Method byte Integer.byteValue()>
	//   29   55:bastore         
				i >>= 8;
	//   30   56:iload_0         
	//   31   57:bipush          8
	//   32   59:ishr            
	//   33   60:istore_0        
			}

	//   34   61:iload_1         
	//   35   62:iconst_1        
	//   36   63:isub            
	//   37   64:istore_1        
	//   38   65:iload_1         
	//   39   66:iconst_m1       
	//   40   67:icmpgt          42
			return abyte0;
	//   41   70:aload_3         
	//   42   71:areturn         
		}
		for(j = 0; j < abyte0.length; j++)
	//*  43   72:iconst_0        
	//*  44   73:istore_1        
	//*  45   74:goto            100
		{
			abyte0[j] = Integer.valueOf(i & 0xff).byteValue();
	//   46   77:aload_3         
	//   47   78:iload_1         
	//   48   79:iload_0         
	//   49   80:sipush          255
	//   50   83:iand            
	//   51   84:invokestatic    #187 <Method Integer Integer.valueOf(int)>
	//   52   87:invokevirtual   #191 <Method byte Integer.byteValue()>
	//   53   90:bastore         
			i >>= 8;
	//   54   91:iload_0         
	//   55   92:bipush          8
	//   56   94:ishr            
	//   57   95:istore_0        
		}

	//   58   96:iload_1         
	//   59   97:iconst_1        
	//   60   98:iadd            
	//   61   99:istore_1        
	//   62  100:iload_1         
	//   63  101:aload_3         
	//   64  102:arraylength     
	//   65  103:icmplt          77
		return abyte0;
	//   66  106:aload_3         
	//   67  107:areturn         
	}

	public static boolean isEnd(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		if(abyte0.length < abyte1.length)
	//*   6   10:aload_0         
	//*   7   11:arraylength     
	//*   8   12:aload_1         
	//*   9   13:arraylength     
	//*  10   14:icmpge          19
			return false;
	//   11   17:iconst_0        
	//   12   18:ireturn         
		int i = abyte0.length;
	//   13   19:aload_0         
	//   14   20:arraylength     
	//   15   21:istore_2        
		for(int j = abyte1.length - 1; j >= 0; j--)
	//*  16   22:aload_1         
	//*  17   23:arraylength     
	//*  18   24:iconst_1        
	//*  19   25:isub            
	//*  20   26:istore_3        
	//*  21   27:goto            53
		{
			byte byte0 = abyte1[j];
	//   22   30:aload_1         
	//   23   31:iload_3         
	//   24   32:baload          
	//   25   33:istore          4
			i--;
	//   26   35:iload_2         
	//   27   36:iconst_1        
	//   28   37:isub            
	//   29   38:istore_2        
			if(byte0 != abyte0[i])
	//*  30   39:iload           4
	//*  31   41:aload_0         
	//*  32   42:iload_2         
	//*  33   43:baload          
	//*  34   44:icmpeq          49
				return false;
	//   35   47:iconst_0        
	//   36   48:ireturn         
		}

	//   37   49:iload_3         
	//   38   50:iconst_1        
	//   39   51:isub            
	//   40   52:istore_3        
	//   41   53:iload_3         
	//   42   54:ifge            30
		return true;
	//   43   57:iconst_1        
	//   44   58:ireturn         
	}

	public static boolean isEnd9000(byte abyte0[])
	{
		byte abyte1[] = new byte[2];
	//    0    0:iconst_2        
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		abyte1[0] = -112;
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:bipush          -112
	//    6    8:bastore         
		return isEnd(abyte0, abyte1);
	//    7    9:aload_0         
	//    8   10:aload_1         
	//    9   11:invokestatic    #197 <Method boolean isEnd(byte[], byte[])>
	//   10   14:ireturn         
	}

	public static boolean isPatch4Des(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		for(int i = abyte0.length - 1; i > abyte0.length - 9; i--)
	//*   4    6:aload_0         
	//*   5    7:arraylength     
	//*   6    8:iconst_1        
	//*   7    9:isub            
	//*   8   10:istore_1        
	//*   9   11:goto            28
			if(-128 == abyte0[i])
	//*  10   14:bipush          -128
	//*  11   16:aload_0         
	//*  12   17:iload_1         
	//*  13   18:baload          
	//*  14   19:icmpne          24
				return true;
	//   15   22:iconst_1        
	//   16   23:ireturn         

	//   17   24:iload_1         
	//   18   25:iconst_1        
	//   19   26:isub            
	//   20   27:istore_1        
	//   21   28:iload_1         
	//   22   29:aload_0         
	//   23   30:arraylength     
	//   24   31:bipush          9
	//   25   33:isub            
	//   26   34:icmpgt          14
		return false;
	//   27   37:iconst_0        
	//   28   38:ireturn         
	}

	public static byte[] join(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       29
		{
			if(log != null)
	//*   4    8:getstatic       #25  <Field FMLog log>
	//*   5   11:ifnull          27
				log.error(clazzName, "\u5B57\u8282\u6570\u7EC4\u5408\u5E76\u65F6\uFF0C\u6570\u7EC4\u4E3Anull");
	//    6   14:getstatic       #25  <Field FMLog log>
	//    7   17:getstatic       #37  <Field String clazzName>
	//    8   20:ldc1            #200 <String "\u5B57\u8282\u6570\u7EC4\u5408\u5E76\u65F6\uFF0C\u6570\u7EC4\u4E3Anull">
	//    9   22:invokeinterface #58  <Method void FMLog.error(String, String)>
			return abyte0;
	//   10   27:aload_0         
	//   11   28:areturn         
		}
		int k = abyte0.length;
	//   12   29:aload_0         
	//   13   30:arraylength     
	//   14   31:istore_3        
		byte abyte2[] = new byte[abyte0.length + abyte1.length];
	//   15   32:aload_0         
	//   16   33:arraylength     
	//   17   34:aload_1         
	//   18   35:arraylength     
	//   19   36:iadd            
	//   20   37:newarray        byte[]
	//   21   39:astore          4
		for(int i = 0; i < k; i++)
	//*  22   41:iconst_0        
	//*  23   42:istore_2        
	//*  24   43:goto            57
			abyte2[i] = abyte0[i];
	//   25   46:aload           4
	//   26   48:iload_2         
	//   27   49:aload_0         
	//   28   50:iload_2         
	//   29   51:baload          
	//   30   52:bastore         

	//   31   53:iload_2         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_2        
	//   35   57:iload_2         
	//   36   58:iload_3         
	//   37   59:icmplt          46
		for(int j = 0; j < abyte1.length; j++)
	//*  38   62:iconst_0        
	//*  39   63:istore_2        
	//*  40   64:goto            80
			abyte2[k + j] = abyte1[j];
	//   41   67:aload           4
	//   42   69:iload_3         
	//   43   70:iload_2         
	//   44   71:iadd            
	//   45   72:aload_1         
	//   46   73:iload_2         
	//   47   74:baload          
	//   48   75:bastore         

	//   49   76:iload_2         
	//   50   77:iconst_1        
	//   51   78:iadd            
	//   52   79:istore_2        
	//   53   80:iload_2         
	//   54   81:aload_1         
	//   55   82:arraylength     
	//   56   83:icmplt          67
		return abyte2;
	//   57   86:aload           4
	//   58   88:areturn         
	}

	public static byte[] longToAsciiBytes(long l)
	{
		char ac[] = (new StringBuilder(String.valueOf(l))).toString().toCharArray();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:invokestatic    #205 <Method String String.valueOf(long)>
	//    4    8:invokespecial   #106 <Method void StringBuilder(String)>
	//    5   11:invokevirtual   #113 <Method String StringBuilder.toString()>
	//    6   14:invokevirtual   #209 <Method char[] String.toCharArray()>
	//    7   17:astore          4
		int j = ac.length;
	//    8   19:aload           4
	//    9   21:arraylength     
	//   10   22:istore_3        
		byte abyte0[] = new byte[j];
	//   11   23:iload_3         
	//   12   24:newarray        byte[]
	//   13   26:astore          5
		for(int i = 0; i < j; i++)
	//*  14   28:iconst_0        
	//*  15   29:istore_2        
	//*  16   30:goto            65
			abyte0[i] = (byte)(Integer.parseInt((new StringBuilder(String.valueOf(ac[i]))).toString()) + 48);
	//   17   33:aload           5
	//   18   35:iload_2         
	//   19   36:new             #87  <Class StringBuilder>
	//   20   39:dup             
	//   21   40:aload           4
	//   22   42:iload_2         
	//   23   43:caload          
	//   24   44:invokestatic    #104 <Method String String.valueOf(char)>
	//   25   47:invokespecial   #106 <Method void StringBuilder(String)>
	//   26   50:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   27   53:invokestatic    #213 <Method int Integer.parseInt(String)>
	//   28   56:bipush          48
	//   29   58:iadd            
	//   30   59:int2byte        
	//   31   60:bastore         

	//   32   61:iload_2         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_2        
	//   36   65:iload_2         
	//   37   66:iload_3         
	//   38   67:icmplt          33
		return abyte0;
	//   39   70:aload           5
	//   40   72:areturn         
	}

	public static byte[] longToBytes(long l, int i)
	{
		return longToBytes(l, i, true);
	//    0    0:lload_0         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #218 <Method byte[] longToBytes(long, int, boolean)>
	//    4    6:areturn         
	}

	public static byte[] longToBytes(long l, int i, boolean flag)
	{
		if(i < 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          26
		{
			if(log != null)
	//*   3    5:getstatic       #25  <Field FMLog log>
	//*   4    8:ifnull          24
				log.error(clazzName, "\u5341\u8FDB\u5236long\u6574\u6570\u8F6C\u6210\u5B57\u8282\u6570\u7EC4\u65F6\uFF0C\u6307\u5B9A\u7684\u6570\u7EC4\u957F\u5EA6\u975E\u6B63");
	//    5   11:getstatic       #25  <Field FMLog log>
	//    6   14:getstatic       #37  <Field String clazzName>
	//    7   17:ldc1            #220 <String "\u5341\u8FDB\u5236long\u6574\u6570\u8F6C\u6210\u5B57\u8282\u6570\u7EC4\u65F6\uFF0C\u6307\u5B9A\u7684\u6570\u7EC4\u957F\u5EA6\u975E\u6B63">
	//    8   19:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//    9   24:aconst_null     
	//   10   25:areturn         
		}
		byte abyte0[] = new byte[i];
	//   11   26:iload_2         
	//   12   27:newarray        byte[]
	//   13   29:astore          4
		if(flag)
	//*  14   31:iload_3         
	//*  15   32:ifeq            76
		{
			for(i = abyte0.length - 1; i > -1; i--)
	//*  16   35:aload           4
	//*  17   37:arraylength     
	//*  18   38:iconst_1        
	//*  19   39:isub            
	//*  20   40:istore_2        
	//*  21   41:goto            68
			{
				abyte0[i] = Long.valueOf(255L & l).byteValue();
	//   22   44:aload           4
	//   23   46:iload_2         
	//   24   47:ldc2w           #221 <Long 255L>
	//   25   50:lload_0         
	//   26   51:land            
	//   27   52:invokestatic    #227 <Method Long Long.valueOf(long)>
	//   28   55:invokevirtual   #228 <Method byte Long.byteValue()>
	//   29   58:bastore         
				l >>= 8;
	//   30   59:lload_0         
	//   31   60:bipush          8
	//   32   62:lshr            
	//   33   63:lstore_0        
			}

	//   34   64:iload_2         
	//   35   65:iconst_1        
	//   36   66:isub            
	//   37   67:istore_2        
	//   38   68:iload_2         
	//   39   69:iconst_m1       
	//   40   70:icmpgt          44
			return abyte0;
	//   41   73:aload           4
	//   42   75:areturn         
		}
		for(i = 0; i < abyte0.length; i++)
	//*  43   76:iconst_0        
	//*  44   77:istore_2        
	//*  45   78:goto            105
		{
			abyte0[i] = Long.valueOf(255L & l).byteValue();
	//   46   81:aload           4
	//   47   83:iload_2         
	//   48   84:ldc2w           #221 <Long 255L>
	//   49   87:lload_0         
	//   50   88:land            
	//   51   89:invokestatic    #227 <Method Long Long.valueOf(long)>
	//   52   92:invokevirtual   #228 <Method byte Long.byteValue()>
	//   53   95:bastore         
			l >>= 8;
	//   54   96:lload_0         
	//   55   97:bipush          8
	//   56   99:lshr            
	//   57  100:lstore_0        
		}

	//   58  101:iload_2         
	//   59  102:iconst_1        
	//   60  103:iadd            
	//   61  104:istore_2        
	//   62  105:iload_2         
	//   63  106:aload           4
	//   64  108:arraylength     
	//   65  109:icmplt          81
		return abyte0;
	//   66  112:aload           4
	//   67  114:areturn         
	}

	public static void main(String args[])
	{
		args = ((String []) (new byte[2]));
	//    0    0:iconst_2        
	//    1    1:newarray        byte[]
	//    2    3:astore_0        
		args[0] = 110;
	//    3    4:aload_0         
	//    4    5:iconst_0        
	//    5    6:bipush          110
	//    6    8:bastore         
		System.out.println(isEnd9000(((byte []) (args))));
	//    7    9:getstatic       #234 <Field PrintStream System.out>
	//    8   12:aload_0         
	//    9   13:invokestatic    #236 <Method boolean isEnd9000(byte[])>
	//   10   16:invokevirtual   #242 <Method void PrintStream.println(boolean)>
	//   11   19:return          
	}

	public static byte[] not(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       25
		{
			if(log != null)
	//*   2    4:getstatic       #25  <Field FMLog log>
	//*   3    7:ifnull          23
				log.error(clazzName, "\u53D6\u53CD\u65F6\uFF0C\u6570\u7EC4\u4E3Anull");
	//    4   10:getstatic       #25  <Field FMLog log>
	//    5   13:getstatic       #37  <Field String clazzName>
	//    6   16:ldc1            #245 <String "\u53D6\u53CD\u65F6\uFF0C\u6570\u7EC4\u4E3Anull">
	//    7   18:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//    8   23:aconst_null     
	//    9   24:areturn         
		}
		byte abyte1[] = (byte[])((byte []) (abyte0)).clone();
	//   10   25:aload_0         
	//   11   26:invokevirtual   #65  <Method Object _5B_B.clone()>
	//   12   29:checkcast       #61  <Class byte[]>
	//   13   32:astore_2        
		for(int i = 0; i < abyte1.length; i++)
	//*  14   33:iconst_0        
	//*  15   34:istore_1        
	//*  16   35:goto            51
			abyte1[i] = (byte)(~abyte0[i]);
	//   17   38:aload_2         
	//   18   39:iload_1         
	//   19   40:aload_0         
	//   20   41:iload_1         
	//   21   42:baload          
	//   22   43:iconst_m1       
	//   23   44:ixor            
	//   24   45:int2byte        
	//   25   46:bastore         

	//   26   47:iload_1         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:istore_1        
	//   30   51:iload_1         
	//   31   52:aload_2         
	//   32   53:arraylength     
	//   33   54:icmplt          38
		return abyte1;
	//   34   57:aload_2         
	//   35   58:areturn         
	}

	public static byte[] or(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       29
		{
			if(log != null)
	//*   4    8:getstatic       #25  <Field FMLog log>
	//*   5   11:ifnull          27
				log.error(clazzName, "\u6216\u8FD0\u7B97\u65F6\uFF0C\u6570\u7EC4\u4E3Anull");
	//    6   14:getstatic       #25  <Field FMLog log>
	//    7   17:getstatic       #37  <Field String clazzName>
	//    8   20:ldc1            #248 <String "\u6216\u8FD0\u7B97\u65F6\uFF0C\u6570\u7EC4\u4E3Anull">
	//    9   22:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//   10   27:aconst_null     
	//   11   28:areturn         
		}
		if(abyte0.length != abyte1.length)
	//*  12   29:aload_0         
	//*  13   30:arraylength     
	//*  14   31:aload_1         
	//*  15   32:arraylength     
	//*  16   33:icmpeq          57
		{
			if(log != null)
	//*  17   36:getstatic       #25  <Field FMLog log>
	//*  18   39:ifnull          55
				log.error(clazzName, "\u6216\u8FD0\u7B97\u65F6\uFF0Cbyte\u6570\u7EC4\u957F\u5EA6\u4E0D\u7B49");
	//   19   42:getstatic       #25  <Field FMLog log>
	//   20   45:getstatic       #37  <Field String clazzName>
	//   21   48:ldc1            #250 <String "\u6216\u8FD0\u7B97\u65F6\uFF0Cbyte\u6570\u7EC4\u957F\u5EA6\u4E0D\u7B49">
	//   22   50:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//   23   55:aconst_null     
	//   24   56:areturn         
		}
		abyte0 = (byte[])((byte []) (abyte0)).clone();
	//   25   57:aload_0         
	//   26   58:invokevirtual   #65  <Method Object _5B_B.clone()>
	//   27   61:checkcast       #61  <Class byte[]>
	//   28   64:astore_0        
		for(int i = 0; i < abyte0.length; i++)
	//*  29   65:iconst_0        
	//*  30   66:istore_2        
	//*  31   67:goto            85
			abyte0[i] = (byte)(abyte0[i] | abyte1[i]);
	//   32   70:aload_0         
	//   33   71:iload_2         
	//   34   72:aload_0         
	//   35   73:iload_2         
	//   36   74:baload          
	//   37   75:aload_1         
	//   38   76:iload_2         
	//   39   77:baload          
	//   40   78:ior             
	//   41   79:int2byte        
	//   42   80:bastore         

	//   43   81:iload_2         
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore_2        
	//   47   85:iload_2         
	//   48   86:aload_0         
	//   49   87:arraylength     
	//   50   88:icmplt          70
		return abyte0;
	//   51   91:aload_0         
	//   52   92:areturn         
	}

	public static byte[] patch(byte abyte0[], int i, byte byte0)
	{
		if(abyte0 == null || i <= 0)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:iload_1         
	//*   3    5:ifgt            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		int l = abyte0.length;
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:istore          4
		if(l >= i)
	//*   9   14:iload           4
	//*  10   16:iload_1         
	//*  11   17:icmplt          28
			return (byte[])((byte []) (abyte0)).clone();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #65  <Method Object _5B_B.clone()>
	//   14   24:checkcast       #61  <Class byte[]>
	//   15   27:areturn         
		byte abyte1[] = new byte[i];
	//   16   28:iload_1         
	//   17   29:newarray        byte[]
	//   18   31:astore          5
		for(int j = 0; j < l; j++)
	//*  19   33:iconst_0        
	//*  20   34:istore_3        
	//*  21   35:goto            49
			abyte1[j] = abyte0[j];
	//   22   38:aload           5
	//   23   40:iload_3         
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:baload          
	//   27   44:bastore         

	//   28   45:iload_3         
	//   29   46:iconst_1        
	//   30   47:iadd            
	//   31   48:istore_3        
	//   32   49:iload_3         
	//   33   50:iload           4
	//   34   52:icmplt          38
		for(int k = 0; k < i - l; k++)
	//*  35   55:iconst_0        
	//*  36   56:istore_3        
	//*  37   57:goto            72
			abyte1[l + k] = byte0;
	//   38   60:aload           5
	//   39   62:iload           4
	//   40   64:iload_3         
	//   41   65:iadd            
	//   42   66:iload_2         
	//   43   67:bastore         

	//   44   68:iload_3         
	//   45   69:iconst_1        
	//   46   70:iadd            
	//   47   71:istore_3        
	//   48   72:iload_3         
	//   49   73:iload_1         
	//   50   74:iload           4
	//   51   76:isub            
	//   52   77:icmplt          60
		return abyte1;
	//   53   80:aload           5
	//   54   82:areturn         
	}

	public static void reverse(byte abyte0[])
	{
		int j = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		byte abyte1[] = copyOf(abyte0, j);
	//    3    3:aload_0         
	//    4    4:iload_2         
	//    5    5:invokestatic    #71  <Method byte[] copyOf(byte[], int)>
	//    6    8:astore_3        
		for(int i = 0; i < j; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore_1        
	//*   9   11:goto            28
			abyte0[i] = abyte1[j - i - 1];
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:aload_3         
	//   13   17:iload_2         
	//   14   18:iload_1         
	//   15   19:isub            
	//   16   20:iconst_1        
	//   17   21:isub            
	//   18   22:baload          
	//   19   23:bastore         

	//   20   24:iload_1         
	//   21   25:iconst_1        
	//   22   26:iadd            
	//   23   27:istore_1        
	//   24   28:iload_1         
	//   25   29:iload_2         
	//   26   30:icmplt          14
	//   27   33:return          
	}

	public static boolean tlv(byte abyte0[], byte byte0, byte byte1, byte abyte1[])
	{
		if(byte0 != abyte0[0] || byte1 != abyte0[1] || abyte0.length != byte1 + 2 || abyte1.length != byte1)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:iconst_0        
	//*   3    3:baload          
	//*   4    4:icmpne          28
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:iconst_1        
	//*   8   10:baload          
	//*   9   11:icmpne          28
	//*  10   14:aload_0         
	//*  11   15:arraylength     
	//*  12   16:iload_2         
	//*  13   17:iconst_2        
	//*  14   18:iadd            
	//*  15   19:icmpne          28
	//*  16   22:aload_3         
	//*  17   23:arraylength     
	//*  18   24:iload_2         
	//*  19   25:icmpeq          30
			return false;
	//   20   28:iconst_0        
	//   21   29:ireturn         
		for(byte0 = 0; byte0 < byte1; byte0++)
	//*  22   30:iconst_0        
	//*  23   31:istore_1        
	//*  24   32:goto            47
			abyte1[byte0] = abyte0[byte0 + 2];
	//   25   35:aload_3         
	//   26   36:iload_1         
	//   27   37:aload_0         
	//   28   38:iload_1         
	//   29   39:iconst_2        
	//   30   40:iadd            
	//   31   41:baload          
	//   32   42:bastore         

	//   33   43:iload_1         
	//   34   44:iconst_1        
	//   35   45:iadd            
	//   36   46:istore_1        
	//   37   47:iload_1         
	//   38   48:iload_2         
	//   39   49:icmplt          35
		return true;
	//   40   52:iconst_1        
	//   41   53:ireturn         
	}

	public static byte[] xor(byte abyte0[], byte abyte1[])
	{
		if(abyte0 == null || abyte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       30
		{
			if(log != null)
	//*   4    8:getstatic       #25  <Field FMLog log>
	//*   5   11:ifnull          28
				log.error(clazzName, "\u5F02\u6216\u65F6\uFF0C\u6570\u7EC4\u4E3Anull");
	//    6   14:getstatic       #25  <Field FMLog log>
	//    7   17:getstatic       #37  <Field String clazzName>
	//    8   20:ldc2            #259 <String "\u5F02\u6216\u65F6\uFF0C\u6570\u7EC4\u4E3Anull">
	//    9   23:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//   10   28:aconst_null     
	//   11   29:areturn         
		}
		if(abyte0.length != abyte1.length)
	//*  12   30:aload_0         
	//*  13   31:arraylength     
	//*  14   32:aload_1         
	//*  15   33:arraylength     
	//*  16   34:icmpeq          59
		{
			if(log != null)
	//*  17   37:getstatic       #25  <Field FMLog log>
	//*  18   40:ifnull          57
				log.error(clazzName, "\u5F02\u6216\u65F6\uFF0Cbyte\u6570\u7EC4\u957F\u5EA6\u4E0D\u7B49");
	//   19   43:getstatic       #25  <Field FMLog log>
	//   20   46:getstatic       #37  <Field String clazzName>
	//   21   49:ldc2            #261 <String "\u5F02\u6216\u65F6\uFF0Cbyte\u6570\u7EC4\u957F\u5EA6\u4E0D\u7B49">
	//   22   52:invokeinterface #58  <Method void FMLog.error(String, String)>
			return null;
	//   23   57:aconst_null     
	//   24   58:areturn         
		}
		abyte0 = (byte[])((byte []) (abyte0)).clone();
	//   25   59:aload_0         
	//   26   60:invokevirtual   #65  <Method Object _5B_B.clone()>
	//   27   63:checkcast       #61  <Class byte[]>
	//   28   66:astore_0        
		for(int i = 0; i < abyte0.length; i++)
	//*  29   67:iconst_0        
	//*  30   68:istore_2        
	//*  31   69:goto            87
			abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
	//   32   72:aload_0         
	//   33   73:iload_2         
	//   34   74:aload_0         
	//   35   75:iload_2         
	//   36   76:baload          
	//   37   77:aload_1         
	//   38   78:iload_2         
	//   39   79:baload          
	//   40   80:ixor            
	//   41   81:int2byte        
	//   42   82:bastore         

	//   43   83:iload_2         
	//   44   84:iconst_1        
	//   45   85:iadd            
	//   46   86:istore_2        
	//   47   87:iload_2         
	//   48   88:aload_0         
	//   49   89:arraylength     
	//   50   90:icmplt          72
		return abyte0;
	//   51   93:aload_0         
	//   52   94:areturn         
	}

	public void clear()
	{
		if(data != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field byte[] data>
	//*   2    4:ifnull          23
		{
			if(data.length > 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #43  <Field byte[] data>
	//*   5   11:arraylength     
	//*   6   12:ifle            30
			{
				data = new byte[0];
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:newarray        byte[]
	//   10   19:putfield        #43  <Field byte[] data>
				return;
	//   11   22:return          
			}
		} else
		{
			data = new byte[0];
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:newarray        byte[]
	//   15   27:putfield        #43  <Field byte[] data>
		}
	//   16   30:return          
	}

	public void copy(int i)
		throws FM_Exception
	{
		if(i < 0 || i < data.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #43  <Field byte[] data>
	//*   5    9:arraylength     
	//*   6   10:icmpge          24
		{
			throw new FM_Exception("overstep the boundary");
	//    7   13:new             #266 <Class FM_Exception>
	//    8   16:dup             
	//    9   17:ldc2            #268 <String "overstep the boundary">
	//   10   20:invokespecial   #269 <Method void FM_Exception(String)>
	//   11   23:athrow          
		} else
		{
			data = copyOf(data, i);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #43  <Field byte[] data>
	//   15   29:iload_1         
	//   16   30:invokestatic    #71  <Method byte[] copyOf(byte[], int)>
	//   17   33:putfield        #43  <Field byte[] data>
			return;
	//   18   36:return          
		}
	}

	public int hashCode()
	{
		return Arrays.hashCode(data);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] data>
	//    2    4:invokestatic    #273 <Method int Arrays.hashCode(byte[])>
	//    3    7:ireturn         
	}

	public int intValue()
		throws FM_Exception
	{
		return intValue(0, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #277 <Method int intValue(int, boolean)>
	//    4    6:ireturn         
	}

	public int intValue(int i, boolean flag)
		throws FM_Exception
	{
		if(i + 4 > data.length)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:iadd            
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field byte[] data>
	//*   5    7:arraylength     
	//*   6    8:icmple          22
			throw new FM_Exception("overstep the boundary");
	//    7   11:new             #266 <Class FM_Exception>
	//    8   14:dup             
	//    9   15:ldc2            #268 <String "overstep the boundary">
	//   10   18:invokespecial   #269 <Method void FM_Exception(String)>
	//   11   21:athrow          
		if(flag)
	//*  12   22:iload_2         
	//*  13   23:ifeq            72
		{
			int j = ((int) (data[i]));
	//   14   26:aload_0         
	//   15   27:getfield        #43  <Field byte[] data>
	//   16   30:iload_1         
	//   17   31:baload          
	//   18   32:istore_3        
			for(int l = 1; l < 4; l++)
	//*  19   33:iconst_1        
	//*  20   34:istore          4
	//*  21   36:goto            64
				j = j << 8 | data[i + l] & 0xff;
	//   22   39:iload_3         
	//   23   40:bipush          8
	//   24   42:ishl            
	//   25   43:aload_0         
	//   26   44:getfield        #43  <Field byte[] data>
	//   27   47:iload_1         
	//   28   48:iload           4
	//   29   50:iadd            
	//   30   51:baload          
	//   31   52:sipush          255
	//   32   55:iand            
	//   33   56:ior             
	//   34   57:istore_3        

	//   35   58:iload           4
	//   36   60:iconst_1        
	//   37   61:iadd            
	//   38   62:istore          4
	//   39   64:iload           4
	//   40   66:iconst_4        
	//   41   67:icmplt          39
			return j;
	//   42   70:iload_3         
	//   43   71:ireturn         
		}
		int k = ((int) (data[i + 3]));
	//   44   72:aload_0         
	//   45   73:getfield        #43  <Field byte[] data>
	//   46   76:iload_1         
	//   47   77:iconst_3        
	//   48   78:iadd            
	//   49   79:baload          
	//   50   80:istore_3        
		for(int i1 = 2; i1 >= 0; i1--)
	//*  51   81:iconst_2        
	//*  52   82:istore          4
	//*  53   84:goto            112
			k = k << 8 | data[i + i1] & 0xff;
	//   54   87:iload_3         
	//   55   88:bipush          8
	//   56   90:ishl            
	//   57   91:aload_0         
	//   58   92:getfield        #43  <Field byte[] data>
	//   59   95:iload_1         
	//   60   96:iload           4
	//   61   98:iadd            
	//   62   99:baload          
	//   63  100:sipush          255
	//   64  103:iand            
	//   65  104:ior             
	//   66  105:istore_3        

	//   67  106:iload           4
	//   68  108:iconst_1        
	//   69  109:isub            
	//   70  110:istore          4
	//   71  112:iload           4
	//   72  114:ifge            87
		return k;
	//   73  117:iload_3         
	//   74  118:ireturn         
	}

	public int intValue(boolean flag)
		throws FM_Exception
	{
		return intValue(0, flag);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #277 <Method int intValue(int, boolean)>
	//    4    6:ireturn         
	}

	public int length()
	{
		return data.length;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] data>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public long longValue()
		throws FM_Exception
	{
		return longValue(0, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #283 <Method long longValue(int, boolean)>
	//    4    6:lreturn         
	}

	public long longValue(int i, boolean flag)
		throws FM_Exception
	{
		if(i + 8 > data.length)
	//*   0    0:iload_1         
	//*   1    1:bipush          8
	//*   2    3:iadd            
	//*   3    4:aload_0         
	//*   4    5:getfield        #43  <Field byte[] data>
	//*   5    8:arraylength     
	//*   6    9:icmple          23
			throw new FM_Exception("overstep the boundary");
	//    7   12:new             #266 <Class FM_Exception>
	//    8   15:dup             
	//    9   16:ldc2            #268 <String "overstep the boundary">
	//   10   19:invokespecial   #269 <Method void FM_Exception(String)>
	//   11   22:athrow          
		if(flag)
	//*  12   23:iload_2         
	//*  13   24:ifeq            75
		{
			long l = data[i];
	//   14   27:aload_0         
	//   15   28:getfield        #43  <Field byte[] data>
	//   16   31:iload_1         
	//   17   32:baload          
	//   18   33:i2l             
	//   19   34:lstore          4
			for(int j = 1; j < 8; j++)
	//*  20   36:iconst_1        
	//*  21   37:istore_3        
	//*  22   38:goto            66
				l = l << 8 | (long)(data[i + j] & 0xff);
	//   23   41:lload           4
	//   24   43:bipush          8
	//   25   45:lshl            
	//   26   46:aload_0         
	//   27   47:getfield        #43  <Field byte[] data>
	//   28   50:iload_1         
	//   29   51:iload_3         
	//   30   52:iadd            
	//   31   53:baload          
	//   32   54:sipush          255
	//   33   57:iand            
	//   34   58:i2l             
	//   35   59:lor             
	//   36   60:lstore          4

	//   37   62:iload_3         
	//   38   63:iconst_1        
	//   39   64:iadd            
	//   40   65:istore_3        
	//   41   66:iload_3         
	//   42   67:bipush          8
	//   43   69:icmplt          41
			return l;
	//   44   72:lload           4
	//   45   74:lreturn         
		}
		long l1 = data[i + 7];
	//   46   75:aload_0         
	//   47   76:getfield        #43  <Field byte[] data>
	//   48   79:iload_1         
	//   49   80:bipush          7
	//   50   82:iadd            
	//   51   83:baload          
	//   52   84:i2l             
	//   53   85:lstore          4
		for(int k = 6; k >= 0; k--)
	//*  54   87:bipush          6
	//*  55   89:istore_3        
	//*  56   90:goto            118
			l1 = l1 << 8 | (long)(data[i + k] & 0xff);
	//   57   93:lload           4
	//   58   95:bipush          8
	//   59   97:lshl            
	//   60   98:aload_0         
	//   61   99:getfield        #43  <Field byte[] data>
	//   62  102:iload_1         
	//   63  103:iload_3         
	//   64  104:iadd            
	//   65  105:baload          
	//   66  106:sipush          255
	//   67  109:iand            
	//   68  110:i2l             
	//   69  111:lor             
	//   70  112:lstore          4

	//   71  114:iload_3         
	//   72  115:iconst_1        
	//   73  116:isub            
	//   74  117:istore_3        
	//   75  118:iload_3         
	//   76  119:ifge            93
		return l1;
	//   77  122:lload           4
	//   78  124:lreturn         
	}

	public long longValue(boolean flag)
		throws FM_Exception
	{
		return longValue(0, flag);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #283 <Method long longValue(int, boolean)>
	//    4    6:lreturn         
	}

	public int preplace(int i)
	{
		return preplace(i, (byte)0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #288 <Method int preplace(int, byte)>
	//    4    6:ireturn         
	}

	public int preplace(int i, byte byte0)
	{
		if(data.length != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field byte[] data>
	//*   2    4:arraylength     
	//*   3    5:iload_1         
	//*   4    6:icmpeq          16
			data = new byte[i];
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:newarray        byte[]
	//    8   13:putfield        #43  <Field byte[] data>
		for(int j = 0; j < i; j++)
	//*   9   16:iconst_0        
	//*  10   17:istore_3        
	//*  11   18:goto            32
			data[j] = byte0;
	//   12   21:aload_0         
	//   13   22:getfield        #43  <Field byte[] data>
	//   14   25:iload_3         
	//   15   26:iload_2         
	//   16   27:bastore         

	//   17   28:iload_3         
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:istore_3        
	//   21   32:iload_3         
	//   22   33:iload_1         
	//   23   34:icmplt          21
		return data.length;
	//   24   37:aload_0         
	//   25   38:getfield        #43  <Field byte[] data>
	//   26   41:arraylength     
	//   27   42:ireturn         
	}

	public boolean setData(int i, String s)
		throws FM_Exception
	{
		int j = (s.length() + 1) / 2;
	//    0    0:aload_2         
	//    1    1:invokevirtual   #100 <Method int String.length()>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:istore          5
		if(j > 0)
	//*   7   10:iload           5
	//*   8   12:ifle            234
		{
			byte abyte0[] = new byte[j];
	//    9   15:iload           5
	//   10   17:newarray        byte[]
	//   11   19:astore          11
			s = s.toUpperCase();
	//   12   21:aload_2         
	//   13   22:invokevirtual   #120 <Method String String.toUpperCase()>
	//   14   25:astore_2        
			int l = 0;
	//   15   26:iconst_0        
	//   16   27:istore          6
			j = 0;
	//   17   29:iconst_0        
	//   18   30:istore          5
			byte byte1 = 0;
	//   19   32:iconst_0        
	//   20   33:istore          4
			for(int i1 = 0; i1 < s.length();)
	//*  21   35:iconst_0        
	//*  22   36:istore          7
	//*  23   38:goto            144
			{
				int k1 = ((int) (s.charAt(i1)));
	//   24   41:aload_2         
	//   25   42:iload           7
	//   26   44:invokevirtual   #173 <Method char String.charAt(int)>
	//   27   47:istore          8
				int i2 = hexString.indexOf(k1);
	//   28   49:getstatic       #29  <Field String hexString>
	//   29   52:iload           8
	//   30   54:invokevirtual   #177 <Method int String.indexOf(int)>
	//   31   57:istore          10
				int l1 = l;
	//   32   59:iload           6
	//   33   61:istore          9
				k1 = j;
	//   34   63:iload           5
	//   35   65:istore          8
				byte byte0 = byte1;
	//   36   67:iload           4
	//   37   69:istore_3        
				if(i2 != -1)
	//*  38   70:iload           10
	//*  39   72:iconst_m1       
	//*  40   73:icmpeq          127
				{
					l1 = l + 1;
	//   41   76:iload           6
	//   42   78:iconst_1        
	//   43   79:iadd            
	//   44   80:istore          9
					if(l1 % 2 == 1)
	//*  45   82:iload           9
	//*  46   84:iconst_2        
	//*  47   85:irem            
	//*  48   86:iconst_1        
	//*  49   87:icmpne          106
					{
						byte0 = (byte)(i2 << 4 | byte1);
	//   50   90:iload           10
	//   51   92:iconst_4        
	//   52   93:ishl            
	//   53   94:iload           4
	//   54   96:ior             
	//   55   97:int2byte        
	//   56   98:istore_3        
						k1 = j;
	//   57   99:iload           5
	//   58  101:istore          8
					} else
	//*  59  103:goto            127
					{
						byte0 = (byte)(byte1 | i2);
	//   60  106:iload           4
	//   61  108:iload           10
	//   62  110:ior             
	//   63  111:int2byte        
	//   64  112:istore_3        
						k1 = j + 1;
	//   65  113:iload           5
	//   66  115:iconst_1        
	//   67  116:iadd            
	//   68  117:istore          8
						abyte0[j] = byte0;
	//   69  119:aload           11
	//   70  121:iload           5
	//   71  123:iload_3         
	//   72  124:bastore         
						byte0 = 0;
	//   73  125:iconst_0        
	//   74  126:istore_3        
					}
				}
				i1++;
	//   75  127:iload           7
	//   76  129:iconst_1        
	//   77  130:iadd            
	//   78  131:istore          7
				byte1 = byte0;
	//   79  133:iload_3         
	//   80  134:istore          4
				j = k1;
	//   81  136:iload           8
	//   82  138:istore          5
				l = l1;
	//   83  140:iload           9
	//   84  142:istore          6
			}

	//   85  144:iload           7
	//   86  146:aload_2         
	//   87  147:invokevirtual   #100 <Method int String.length()>
	//   88  150:icmplt          41
			int j1 = j;
	//   89  153:iload           5
	//   90  155:istore          7
			if(l % 2 == 1)
	//*  91  157:iload           6
	//*  92  159:iconst_2        
	//*  93  160:irem            
	//*  94  161:iconst_1        
	//*  95  162:icmpne          178
			{
				j1 = j + 1;
	//   96  165:iload           5
	//   97  167:iconst_1        
	//   98  168:iadd            
	//   99  169:istore          7
				abyte0[j] = byte1;
	//  100  171:aload           11
	//  101  173:iload           5
	//  102  175:iload           4
	//  103  177:bastore         
			}
			if(i + j1 > data.length)
	//* 104  178:iload_1         
	//* 105  179:iload           7
	//* 106  181:iadd            
	//* 107  182:aload_0         
	//* 108  183:getfield        #43  <Field byte[] data>
	//* 109  186:arraylength     
	//* 110  187:icmple          201
				throw new FM_Exception("overstep the boundary");
	//  111  190:new             #266 <Class FM_Exception>
	//  112  193:dup             
	//  113  194:ldc2            #268 <String "overstep the boundary">
	//  114  197:invokespecial   #269 <Method void FM_Exception(String)>
	//  115  200:athrow          
			for(int k = 0; k < j1; k++)
	//* 116  201:iconst_0        
	//* 117  202:istore          5
	//* 118  204:goto            227
				data[i + k] = abyte0[k];
	//  119  207:aload_0         
	//  120  208:getfield        #43  <Field byte[] data>
	//  121  211:iload_1         
	//  122  212:iload           5
	//  123  214:iadd            
	//  124  215:aload           11
	//  125  217:iload           5
	//  126  219:baload          
	//  127  220:bastore         

	//  128  221:iload           5
	//  129  223:iconst_1        
	//  130  224:iadd            
	//  131  225:istore          5
	//  132  227:iload           5
	//  133  229:iload           7
	//  134  231:icmplt          207
		}
		return true;
	//  135  234:iconst_1        
	//  136  235:ireturn         
	}

	public boolean setData(int i, byte abyte0[])
		throws FM_Exception
	{
		if(i + abyte0.length > data.length)
	//*   0    0:iload_1         
	//*   1    1:aload_2         
	//*   2    2:arraylength     
	//*   3    3:iadd            
	//*   4    4:aload_0         
	//*   5    5:getfield        #43  <Field byte[] data>
	//*   6    8:arraylength     
	//*   7    9:icmple          23
			throw new FM_Exception("overstep the boundary");
	//    8   12:new             #266 <Class FM_Exception>
	//    9   15:dup             
	//   10   16:ldc2            #268 <String "overstep the boundary">
	//   11   19:invokespecial   #269 <Method void FM_Exception(String)>
	//   12   22:athrow          
		for(int j = 0; j < abyte0.length; j++)
	//*  13   23:iconst_0        
	//*  14   24:istore_3        
	//*  15   25:goto            43
			data[i + j] = abyte0[j];
	//   16   28:aload_0         
	//   17   29:getfield        #43  <Field byte[] data>
	//   18   32:iload_1         
	//   19   33:iload_3         
	//   20   34:iadd            
	//   21   35:aload_2         
	//   22   36:iload_3         
	//   23   37:baload          
	//   24   38:bastore         

	//   25   39:iload_3         
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:istore_3        
	//   29   43:iload_3         
	//   30   44:aload_2         
	//   31   45:arraylength     
	//   32   46:icmplt          28
		return true;
	//   33   49:iconst_1        
	//   34   50:ireturn         
	}

	public boolean setData(int i, byte abyte0[], int j, int k)
		throws FM_Exception
	{
		if(j < 0 || j + k > abyte0.length)
	//*   0    0:iload_3         
	//*   1    1:iflt            13
	//*   2    4:iload_3         
	//*   3    5:iload           4
	//*   4    7:iadd            
	//*   5    8:aload_2         
	//*   6    9:arraylength     
	//*   7   10:icmple          24
			throw new FM_Exception("invalid parameters");
	//    8   13:new             #266 <Class FM_Exception>
	//    9   16:dup             
	//   10   17:ldc2            #294 <String "invalid parameters">
	//   11   20:invokespecial   #269 <Method void FM_Exception(String)>
	//   12   23:athrow          
		if(i + k > data.length)
	//*  13   24:iload_1         
	//*  14   25:iload           4
	//*  15   27:iadd            
	//*  16   28:aload_0         
	//*  17   29:getfield        #43  <Field byte[] data>
	//*  18   32:arraylength     
	//*  19   33:icmple          47
			throw new FM_Exception("overstep the boundary");
	//   20   36:new             #266 <Class FM_Exception>
	//   21   39:dup             
	//   22   40:ldc2            #268 <String "overstep the boundary">
	//   23   43:invokespecial   #269 <Method void FM_Exception(String)>
	//   24   46:athrow          
		for(int l = 0; l < k; l++)
	//*  25   47:iconst_0        
	//*  26   48:istore          5
	//*  27   50:goto            74
			data[i + l] = abyte0[j + l];
	//   28   53:aload_0         
	//   29   54:getfield        #43  <Field byte[] data>
	//   30   57:iload_1         
	//   31   58:iload           5
	//   32   60:iadd            
	//   33   61:aload_2         
	//   34   62:iload_3         
	//   35   63:iload           5
	//   36   65:iadd            
	//   37   66:baload          
	//   38   67:bastore         

	//   39   68:iload           5
	//   40   70:iconst_1        
	//   41   71:iadd            
	//   42   72:istore          5
	//   43   74:iload           5
	//   44   76:iload           4
	//   45   78:icmplt          53
		return true;
	//   46   81:iconst_1        
	//   47   82:ireturn         
	}

	public short shortValue()
		throws FM_Exception
	{
		return shortValue(0, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #299 <Method short shortValue(int, boolean)>
	//    4    6:ireturn         
	}

	public short shortValue(int i, boolean flag)
		throws FM_Exception
	{
		if(i + 2 > data.length)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:iadd            
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field byte[] data>
	//*   5    7:arraylength     
	//*   6    8:icmple          22
			throw new FM_Exception("overstep the boundary");
	//    7   11:new             #266 <Class FM_Exception>
	//    8   14:dup             
	//    9   15:ldc2            #268 <String "overstep the boundary">
	//   10   18:invokespecial   #269 <Method void FM_Exception(String)>
	//   11   21:athrow          
		if(flag)
	//*  12   22:iload_2         
	//*  13   23:ifeq            53
		{
			short word0 = (short)(data[i] << 8);
	//   14   26:aload_0         
	//   15   27:getfield        #43  <Field byte[] data>
	//   16   30:iload_1         
	//   17   31:baload          
	//   18   32:bipush          8
	//   19   34:ishl            
	//   20   35:int2short       
	//   21   36:istore_3        
			return (short)(data[i + 1] & 0xff | word0);
	//   22   37:aload_0         
	//   23   38:getfield        #43  <Field byte[] data>
	//   24   41:iload_1         
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:baload          
	//   28   45:sipush          255
	//   29   48:iand            
	//   30   49:iload_3         
	//   31   50:ior             
	//   32   51:int2short       
	//   33   52:ireturn         
		} else
		{
			short word1 = (short)(data[i + 1] << 8);
	//   34   53:aload_0         
	//   35   54:getfield        #43  <Field byte[] data>
	//   36   57:iload_1         
	//   37   58:iconst_1        
	//   38   59:iadd            
	//   39   60:baload          
	//   40   61:bipush          8
	//   41   63:ishl            
	//   42   64:int2short       
	//   43   65:istore_3        
			return (short)(data[i] & 0xff | word1);
	//   44   66:aload_0         
	//   45   67:getfield        #43  <Field byte[] data>
	//   46   70:iload_1         
	//   47   71:baload          
	//   48   72:sipush          255
	//   49   75:iand            
	//   50   76:iload_3         
	//   51   77:ior             
	//   52   78:int2short       
	//   53   79:ireturn         
		}
	}

	public short shortValue(boolean flag)
		throws FM_Exception
	{
		return shortValue(0, flag);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #299 <Method short shortValue(int, boolean)>
	//    4    6:ireturn         
	}

	public String toHexString(char c)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          4
		for(int i = 0; i < data.length; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_2        
	//*   6   11:goto            71
		{
			byte byte0 = data[i];
	//    7   14:aload_0         
	//    8   15:getfield        #43  <Field byte[] data>
	//    9   18:iload_2         
	//   10   19:baload          
	//   11   20:istore_3        
			stringbuilder.append(hexString.charAt((byte0 & 0xf0) >> 4));
	//   12   21:aload           4
	//   13   23:getstatic       #29  <Field String hexString>
	//   14   26:iload_3         
	//   15   27:sipush          240
	//   16   30:iand            
	//   17   31:iconst_4        
	//   18   32:ishr            
	//   19   33:invokevirtual   #173 <Method char String.charAt(int)>
	//   20   36:invokevirtual   #303 <Method StringBuilder StringBuilder.append(char)>
	//   21   39:pop             
			stringbuilder.append(hexString.charAt(byte0 & 0xf));
	//   22   40:aload           4
	//   23   42:getstatic       #29  <Field String hexString>
	//   24   45:iload_3         
	//   25   46:bipush          15
	//   26   48:iand            
	//   27   49:invokevirtual   #173 <Method char String.charAt(int)>
	//   28   52:invokevirtual   #303 <Method StringBuilder StringBuilder.append(char)>
	//   29   55:pop             
			if(c != 0)
	//*  30   56:iload_1         
	//*  31   57:ifeq            67
				stringbuilder.append(c);
	//   32   60:aload           4
	//   33   62:iload_1         
	//   34   63:invokevirtual   #303 <Method StringBuilder StringBuilder.append(char)>
	//   35   66:pop             
		}

	//   36   67:iload_2         
	//   37   68:iconst_1        
	//   38   69:iadd            
	//   39   70:istore_2        
	//   40   71:iload_2         
	//   41   72:aload_0         
	//   42   73:getfield        #43  <Field byte[] data>
	//   43   76:arraylength     
	//   44   77:icmplt          14
		return stringbuilder.toString();
	//   45   80:aload           4
	//   46   82:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   47   85:areturn         
	}

	public String toString()
	{
		return toHexString(' ');
	//    0    0:aload_0         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #305 <Method String toHexString(char)>
	//    3    6:areturn         
	}

	public boolean valueof(String s)
	{
		int l1 = (s.length() + 1) / 2;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #100 <Method int String.length()>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:istore          9
		if(l1 > 0)
	//*   7   10:iload           9
	//*   8   12:ifle            245
		{
			byte abyte0[] = new byte[l1];
	//    9   15:iload           9
	//   10   17:newarray        byte[]
	//   11   19:astore          11
			s = s.toUpperCase();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #120 <Method String String.toUpperCase()>
	//   14   25:astore_1        
			int k = 0;
	//   15   26:iconst_0        
	//   16   27:istore          5
			int i = 0;
	//   17   29:iconst_0        
	//   18   30:istore          4
			byte byte1 = 0;
	//   19   32:iconst_0        
	//   20   33:istore_3        
			for(int l = 0; l < s.length();)
	//*  21   34:iconst_0        
	//*  22   35:istore          6
	//*  23   37:goto            139
			{
				int j1 = ((int) (s.charAt(l)));
	//   24   40:aload_1         
	//   25   41:iload           6
	//   26   43:invokevirtual   #173 <Method char String.charAt(int)>
	//   27   46:istore          7
				int i2 = hexString.indexOf(j1);
	//   28   48:getstatic       #29  <Field String hexString>
	//   29   51:iload           7
	//   30   53:invokevirtual   #177 <Method int String.indexOf(int)>
	//   31   56:istore          10
				int k1 = k;
	//   32   58:iload           5
	//   33   60:istore          8
				j1 = i;
	//   34   62:iload           4
	//   35   64:istore          7
				byte byte0 = byte1;
	//   36   66:iload_3         
	//   37   67:istore_2        
				if(i2 != -1)
	//*  38   68:iload           10
	//*  39   70:iconst_m1       
	//*  40   71:icmpeq          123
				{
					k1 = k + 1;
	//   41   74:iload           5
	//   42   76:iconst_1        
	//   43   77:iadd            
	//   44   78:istore          8
					if(k1 % 2 == 1)
	//*  45   80:iload           8
	//*  46   82:iconst_2        
	//*  47   83:irem            
	//*  48   84:iconst_1        
	//*  49   85:icmpne          103
					{
						byte0 = (byte)(i2 << 4 | byte1);
	//   50   88:iload           10
	//   51   90:iconst_4        
	//   52   91:ishl            
	//   53   92:iload_3         
	//   54   93:ior             
	//   55   94:int2byte        
	//   56   95:istore_2        
						j1 = i;
	//   57   96:iload           4
	//   58   98:istore          7
					} else
	//*  59  100:goto            123
					{
						byte0 = (byte)(byte1 | i2);
	//   60  103:iload_3         
	//   61  104:iload           10
	//   62  106:ior             
	//   63  107:int2byte        
	//   64  108:istore_2        
						j1 = i + 1;
	//   65  109:iload           4
	//   66  111:iconst_1        
	//   67  112:iadd            
	//   68  113:istore          7
						abyte0[i] = byte0;
	//   69  115:aload           11
	//   70  117:iload           4
	//   71  119:iload_2         
	//   72  120:bastore         
						byte0 = 0;
	//   73  121:iconst_0        
	//   74  122:istore_2        
					}
				}
				l++;
	//   75  123:iload           6
	//   76  125:iconst_1        
	//   77  126:iadd            
	//   78  127:istore          6
				byte1 = byte0;
	//   79  129:iload_2         
	//   80  130:istore_3        
				i = j1;
	//   81  131:iload           7
	//   82  133:istore          4
				k = k1;
	//   83  135:iload           8
	//   84  137:istore          5
			}

	//   85  139:iload           6
	//   86  141:aload_1         
	//   87  142:invokevirtual   #100 <Method int String.length()>
	//   88  145:icmplt          40
			int i1 = i;
	//   89  148:iload           4
	//   90  150:istore          6
			if(k % 2 == 1)
	//*  91  152:iload           5
	//*  92  154:iconst_2        
	//*  93  155:irem            
	//*  94  156:iconst_1        
	//*  95  157:icmpne          172
			{
				i1 = i + 1;
	//   96  160:iload           4
	//   97  162:iconst_1        
	//   98  163:iadd            
	//   99  164:istore          6
				abyte0[i] = byte1;
	//  100  166:aload           11
	//  101  168:iload           4
	//  102  170:iload_3         
	//  103  171:bastore         
			}
			if(i1 == l1)
	//* 104  172:iload           6
	//* 105  174:iload           9
	//* 106  176:icmpne          188
				data = abyte0;
	//  107  179:aload_0         
	//  108  180:aload           11
	//  109  182:putfield        #43  <Field byte[] data>
			else
	//* 110  185:goto            252
			if(i1 == 0)
	//* 111  188:iload           6
	//* 112  190:ifne            203
			{
				data = new byte[0];
	//  113  193:aload_0         
	//  114  194:iconst_0        
	//  115  195:newarray        byte[]
	//  116  197:putfield        #43  <Field byte[] data>
			} else
	//* 117  200:goto            252
			{
				data = new byte[i1];
	//  118  203:aload_0         
	//  119  204:iload           6
	//  120  206:newarray        byte[]
	//  121  208:putfield        #43  <Field byte[] data>
				for(int j = 0; j < i1; j++)
	//* 122  211:iconst_0        
	//* 123  212:istore          4
	//* 124  214:goto            235
					data[j] = abyte0[j];
	//  125  217:aload_0         
	//  126  218:getfield        #43  <Field byte[] data>
	//  127  221:iload           4
	//  128  223:aload           11
	//  129  225:iload           4
	//  130  227:baload          
	//  131  228:bastore         

	//  132  229:iload           4
	//  133  231:iconst_1        
	//  134  232:iadd            
	//  135  233:istore          4
	//  136  235:iload           4
	//  137  237:iload           6
	//  138  239:icmplt          217
			}
		} else
	//* 139  242:goto            252
		{
			data = new byte[0];
	//  140  245:aload_0         
	//  141  246:iconst_0        
	//  142  247:newarray        byte[]
	//  143  249:putfield        #43  <Field byte[] data>
		}
		return true;
	//  144  252:iconst_1        
	//  145  253:ireturn         
	}

	private static String clazzName = ((Class) (cn/com/fmsh/util/FM_Bytes)).getName();
	private static String hexString = "0123456789ABCDEF";
	private static FMLog log = LogFactory.getInstance().getLog();
	public byte data[];

	static 
	{
	//    0    0:invokestatic    #19  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #23  <Method FMLog LogFactory.getLog()>
	//    2    6:putstatic       #25  <Field FMLog log>
	//    3    9:ldc1            #27  <String "0123456789ABCDEF">
	//    4   11:putstatic       #29  <Field String hexString>
	//    5   14:ldc1            #2   <Class FM_Bytes>
	//    6   16:invokevirtual   #35  <Method String Class.getName()>
	//    7   19:putstatic       #37  <Field String clazzName>
	//*   8   22:return          
	}
}
