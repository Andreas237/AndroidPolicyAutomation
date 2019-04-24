// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.util;

import cn.com.fmsh.FM_Exception;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.PrintStream;
import java.util.Arrays;

// Referenced classes of package cn.com.fmsh.util:
//			FM_Bytes

public class FM_CN
{

	public FM_CN()
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

	public FM_CN(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		data = new byte[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:newarray        byte[]
	//    5    8:putfield        #43  <Field byte[] data>
		valueOf(s);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokevirtual   #48  <Method boolean valueOf(String)>
	//    9   16:pop             
	//   10   17:return          
	}

	public static int bcdBytesToInt(byte abyte0[])
	{
		int k = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_1        
		for(int j = 0; j < k; j++)
	//*   5    5:iconst_0        
	//*   6    6:istore_2        
	//*   7    7:goto            75
		{
			byte byte0 = (byte)((abyte0[j] & 0xf0) >>> 4);
	//    8   10:aload_0         
	//    9   11:iload_2         
	//   10   12:baload          
	//   11   13:sipush          240
	//   12   16:iand            
	//   13   17:iconst_4        
	//   14   18:iushr           
	//   15   19:int2byte        
	//   16   20:istore          4
			if(byte0 > 9)
	//*  17   22:iload           4
	//*  18   24:bipush          9
	//*  19   26:icmple          31
				return i;
	//   20   29:iload_1         
	//   21   30:ireturn         
			byte byte1 = (byte)(abyte0[j] & 0xf);
	//   22   31:aload_0         
	//   23   32:iload_2         
	//   24   33:baload          
	//   25   34:bipush          15
	//   26   36:iand            
	//   27   37:int2byte        
	//   28   38:istore          5
			if(byte1 > 9)
	//*  29   40:iload           5
	//*  30   42:bipush          9
	//*  31   44:icmple          49
				return i;
	//   32   47:iload_1         
	//   33   48:ireturn         
			i += power(100, k - (j + 1)) * (byte0 * 10 + byte1);
	//   34   49:iload_1         
	//   35   50:bipush          100
	//   36   52:iload_3         
	//   37   53:iload_2         
	//   38   54:iconst_1        
	//   39   55:iadd            
	//   40   56:isub            
	//   41   57:invokestatic    #54  <Method int power(int, int)>
	//   42   60:iload           4
	//   43   62:bipush          10
	//   44   64:imul            
	//   45   65:iload           5
	//   46   67:iadd            
	//   47   68:imul            
	//   48   69:iadd            
	//   49   70:istore_1        
		}

	//   50   71:iload_2         
	//   51   72:iconst_1        
	//   52   73:iadd            
	//   53   74:istore_2        
	//   54   75:iload_2         
	//   55   76:iload_3         
	//   56   77:icmplt          10
		return i;
	//   57   80:iload_1         
	//   58   81:ireturn         
	}

	public static String bcdBytesToString(byte abyte0[])
	{
		StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:iconst_2        
	//    5    7:imul            
	//    6    8:invokespecial   #61  <Method void StringBuilder(int)>
	//    7   11:astore_2        
		for(int i = 0; i < abyte0.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_1        
	//*  10   14:goto            48
		{
			stringbuilder.append(((int) ((byte)((abyte0[i] & 0xf0) >>> 4))));
	//   11   17:aload_2         
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:baload          
	//   15   21:sipush          240
	//   16   24:iand            
	//   17   25:iconst_4        
	//   18   26:iushr           
	//   19   27:int2byte        
	//   20   28:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   21   31:pop             
			stringbuilder.append(((int) ((byte)(abyte0[i] & 0xf))));
	//   22   32:aload_2         
	//   23   33:aload_0         
	//   24   34:iload_1         
	//   25   35:baload          
	//   26   36:bipush          15
	//   27   38:iand            
	//   28   39:int2byte        
	//   29   40:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   30   43:pop             
		}

	//   31   44:iload_1         
	//   32   45:iconst_1        
	//   33   46:iadd            
	//   34   47:istore_1        
	//   35   48:iload_1         
	//   36   49:aload_0         
	//   37   50:arraylength     
	//   38   51:icmplt          17
		for(abyte0 = ((byte []) (stringbuilder.toString())); ((String) (abyte0)).charAt(0) == '0'; abyte0 = ((byte []) (((String) (abyte0)).substring(1))))
	//*  39   54:aload_2         
	//*  40   55:invokevirtual   #68  <Method String StringBuilder.toString()>
	//*  41   58:astore_0        
	//*  42   59:goto            78
			if(((String) (abyte0)).length() == 1)
	//*  43   62:aload_0         
	//*  44   63:invokevirtual   #74  <Method int String.length()>
	//*  45   66:iconst_1        
	//*  46   67:icmpne          72
				return ((String) (abyte0));
	//   47   70:aload_0         
	//   48   71:areturn         

	//   49   72:aload_0         
	//   50   73:iconst_1        
	//   51   74:invokevirtual   #78  <Method String String.substring(int)>
	//   52   77:astore_0        
	//   53   78:aload_0         
	//   54   79:iconst_0        
	//   55   80:invokevirtual   #82  <Method char String.charAt(int)>
	//   56   83:bipush          48
	//   57   85:icmpeq          62
		return ((String) (abyte0));
	//   58   88:aload_0         
	//   59   89:areturn         
	}

	public static String bcdBytesToString(byte abyte0[], int i)
	{
		if(abyte0.length > i)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:iload_1         
	//*   3    3:icmple          35
		{
			byte abyte1[] = new byte[i];
	//    4    6:iload_1         
	//    5    7:newarray        byte[]
	//    6    9:astore_3        
			for(int j = 0; j < i; j++)
	//*   7   10:iconst_0        
	//*   8   11:istore_2        
	//*   9   12:goto            25
				abyte1[j] = abyte0[j];
	//   10   15:aload_3         
	//   11   16:iload_2         
	//   12   17:aload_0         
	//   13   18:iload_2         
	//   14   19:baload          
	//   15   20:bastore         

	//   16   21:iload_2         
	//   17   22:iconst_1        
	//   18   23:iadd            
	//   19   24:istore_2        
	//   20   25:iload_2         
	//   21   26:iload_1         
	//   22   27:icmplt          15
			return bcdBytesToString(abyte1);
	//   23   30:aload_3         
	//   24   31:invokestatic    #85  <Method String bcdBytesToString(byte[])>
	//   25   34:areturn         
		} else
		{
			return bcdBytesToString(abyte0);
	//   26   35:aload_0         
	//   27   36:invokestatic    #85  <Method String bcdBytesToString(byte[])>
	//   28   39:areturn         
		}
	}

	public static byte[] intToBcdBytes(int i, int j)
	{
		if(j < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          26
		{
			if(log != null)
	//*   3    5:getstatic       #25  <Field FMLog log>
	//*   4    8:ifnull          24
				log.error(clazzName, "\u5341\u8FDB\u5236int\u578B\u6574\u6570\u8F6C\u6210BCD\u7801\u5B57\u8282\u6570\u7EC4\u65F6\uFF0C\u6307\u5B9A\u5B57\u8282\u6570\u7EC4\u957F\u5EA6\u975E\u6B63");
	//    5   11:getstatic       #25  <Field FMLog log>
	//    6   14:getstatic       #33  <Field String clazzName>
	//    7   17:ldc1            #89  <String "\u5341\u8FDB\u5236int\u578B\u6574\u6570\u8F6C\u6210BCD\u7801\u5B57\u8282\u6570\u7EC4\u65F6\uFF0C\u6307\u5B9A\u5B57\u8282\u6570\u7EC4\u957F\u5EA6\u975E\u6B63">
	//    8   19:invokeinterface #95  <Method void FMLog.error(String, String)>
			return null;
	//    9   24:aconst_null     
	//   10   25:areturn         
		}
		byte abyte0[] = new byte[j];
	//   11   26:iload_1         
	//   12   27:newarray        byte[]
	//   13   29:astore_3        
		for(j--; j >= 0; j--)
	//*  14   30:iload_1         
	//*  15   31:iconst_1        
	//*  16   32:isub            
	//*  17   33:istore_1        
	//*  18   34:goto            71
		{
			int k = i % 100;
	//   19   37:iload_0         
	//   20   38:bipush          100
	//   21   40:irem            
	//   22   41:istore_2        
			abyte0[j] = (byte)((byte)(k / 10 << 4) + (byte)(k % 10 & 0xf));
	//   23   42:aload_3         
	//   24   43:iload_1         
	//   25   44:iload_2         
	//   26   45:bipush          10
	//   27   47:idiv            
	//   28   48:iconst_4        
	//   29   49:ishl            
	//   30   50:int2byte        
	//   31   51:iload_2         
	//   32   52:bipush          10
	//   33   54:irem            
	//   34   55:bipush          15
	//   35   57:iand            
	//   36   58:int2byte        
	//   37   59:iadd            
	//   38   60:int2byte        
	//   39   61:bastore         
			i /= 100;
	//   40   62:iload_0         
	//   41   63:bipush          100
	//   42   65:idiv            
	//   43   66:istore_0        
		}

	//   44   67:iload_1         
	//   45   68:iconst_1        
	//   46   69:isub            
	//   47   70:istore_1        
	//   48   71:iload_1         
	//   49   72:ifge            37
		return abyte0;
	//   50   75:aload_3         
	//   51   76:areturn         
	}

	public static byte[] longToBcdBytes(long l, int i)
	{
		if(i < 1)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          26
		{
			if(log != null)
	//*   3    5:getstatic       #25  <Field FMLog log>
	//*   4    8:ifnull          24
				log.error(clazzName, "\u5341\u8FDB\u5236long\u578B\u6574\u6570\u8F6C\u6210BCD\u7801\u5B57\u8282\u6570\u7EC4\u65F6\uFF0C\u6307\u5B9A\u5B57\u8282\u6570\u7EC4\u957F\u5EA6\u975E\u6B63");
	//    5   11:getstatic       #25  <Field FMLog log>
	//    6   14:getstatic       #33  <Field String clazzName>
	//    7   17:ldc1            #99  <String "\u5341\u8FDB\u5236long\u578B\u6574\u6570\u8F6C\u6210BCD\u7801\u5B57\u8282\u6570\u7EC4\u65F6\uFF0C\u6307\u5B9A\u5B57\u8282\u6570\u7EC4\u957F\u5EA6\u975E\u6B63">
	//    8   19:invokeinterface #95  <Method void FMLog.error(String, String)>
			return null;
	//    9   24:aconst_null     
	//   10   25:areturn         
		}
		byte abyte0[] = new byte[i];
	//   11   26:iload_2         
	//   12   27:newarray        byte[]
	//   13   29:astore          4
		for(i--; i >= 0; i--)
	//*  14   31:iload_2         
	//*  15   32:iconst_1        
	//*  16   33:isub            
	//*  17   34:istore_2        
	//*  18   35:goto            76
		{
			int j = (int)(l % 100L);
	//   19   38:lload_0         
	//   20   39:ldc2w           #100 <Long 100L>
	//   21   42:lrem            
	//   22   43:l2i             
	//   23   44:istore_3        
			abyte0[i] = (byte)((byte)(j / 10 << 4) + (byte)(j % 10 & 0xf));
	//   24   45:aload           4
	//   25   47:iload_2         
	//   26   48:iload_3         
	//   27   49:bipush          10
	//   28   51:idiv            
	//   29   52:iconst_4        
	//   30   53:ishl            
	//   31   54:int2byte        
	//   32   55:iload_3         
	//   33   56:bipush          10
	//   34   58:irem            
	//   35   59:bipush          15
	//   36   61:iand            
	//   37   62:int2byte        
	//   38   63:iadd            
	//   39   64:int2byte        
	//   40   65:bastore         
			l /= 100L;
	//   41   66:lload_0         
	//   42   67:ldc2w           #100 <Long 100L>
	//   43   70:ldiv            
	//   44   71:lstore_0        
		}

	//   45   72:iload_2         
	//   46   73:iconst_1        
	//   47   74:isub            
	//   48   75:istore_2        
	//   49   76:iload_2         
	//   50   77:ifge            38
		return abyte0;
	//   51   80:aload           4
	//   52   82:areturn         
	}

	public static void main(String args[])
	{
		args = ((String []) (FM_Bytes.bytesToHexString(intToBcdBytes(500, 3))));
	//    0    0:sipush          500
	//    1    3:iconst_3        
	//    2    4:invokestatic    #107 <Method byte[] intToBcdBytes(int, int)>
	//    3    7:invokestatic    #112 <Method String FM_Bytes.bytesToHexString(byte[])>
	//    4   10:astore_0        
		System.out.println((new StringBuilder("str=")).append(((String) (args))).toString());
	//    5   11:getstatic       #118 <Field PrintStream System.out>
	//    6   14:new             #58  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:ldc1            #120 <String "str=">
	//    9   20:invokespecial   #122 <Method void StringBuilder(String)>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   13   30:invokevirtual   #130 <Method void PrintStream.println(String)>
		args = ((String []) (new FM_CN("01235")));
	//   14   33:new             #2   <Class FM_CN>
	//   15   36:dup             
	//   16   37:ldc1            #132 <String "01235">
	//   17   39:invokespecial   #133 <Method void FM_CN(String)>
	//   18   42:astore_0        
		System.out.println(((FM_CN) (args)).intValue());
	//   19   43:getstatic       #118 <Field PrintStream System.out>
	//   20   46:aload_0         
	//   21   47:invokevirtual   #136 <Method int intValue()>
	//   22   50:invokevirtual   #138 <Method void PrintStream.println(int)>
		try
		{
			((FM_CN) (args)).setData(0, new byte[] {
				1, 35, 95
			});
	//   23   53:aload_0         
	//   24   54:iconst_0        
	//   25   55:iconst_3        
	//   26   56:newarray        byte[]
	//   27   58:dup             
	//   28   59:iconst_0        
	//   29   60:ldc1            #139 <Int 1>
	//   30   62:bastore         
	//   31   63:dup             
	//   32   64:iconst_1        
	//   33   65:ldc1            #140 <Int 35>
	//   34   67:bastore         
	//   35   68:dup             
	//   36   69:iconst_2        
	//   37   70:ldc1            #141 <Int 95>
	//   38   72:bastore         
	//   39   73:invokevirtual   #145 <Method boolean setData(int, byte[])>
	//   40   76:pop             
			System.out.println(((FM_CN) (args)).intValue());
	//   41   77:getstatic       #118 <Field PrintStream System.out>
	//   42   80:aload_0         
	//   43   81:invokevirtual   #136 <Method int intValue()>
	//   44   84:invokevirtual   #138 <Method void PrintStream.println(int)>
			return;
	//   45   87:return          
		}
		// Misplaced declaration of an exception variable
		catch(String args[])
	//*  46   88:astore_0        
		{
			((FM_Exception) (args)).printStackTrace();
	//   47   89:aload_0         
	//   48   90:invokevirtual   #148 <Method void FM_Exception.printStackTrace()>
		}
	//   49   93:return          
	}

	protected static int power(int i, int j)
	{
		int k = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		for(int l = 0; l < j; l++)
	//*   2    2:iconst_0        
	//*   3    3:istore_3        
	//*   4    4:goto            15
			k *= i;
	//    5    7:iload_2         
	//    6    8:iload_0         
	//    7    9:imul            
	//    8   10:istore_2        

	//    9   11:iload_3         
	//   10   12:iconst_1        
	//   11   13:iadd            
	//   12   14:istore_3        
	//   13   15:iload_3         
	//   14   16:iload_1         
	//   15   17:icmplt          7
		return k;
	//   16   20:iload_2         
	//   17   21:ireturn         
	}

	public static byte[] string2Bcd(String s)
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method int String.length()>
	//    2    4:istore_2        
		int i = k;
	//    3    5:iload_2         
	//    4    6:istore_1        
		String s1 = s;
	//    5    7:aload_0         
	//    6    8:astore          5
		if(k % 2 != 0)
	//*   7   10:iload_2         
	//*   8   11:iconst_2        
	//*   9   12:irem            
	//*  10   13:ifeq            40
		{
			s1 = (new StringBuilder("0")).append(s).toString();
	//   11   16:new             #58  <Class StringBuilder>
	//   12   19:dup             
	//   13   20:ldc1            #152 <String "0">
	//   14   22:invokespecial   #122 <Method void StringBuilder(String)>
	//   15   25:aload_0         
	//   16   26:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   17   29:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   18   32:astore          5
			i = s1.length();
	//   19   34:aload           5
	//   20   36:invokevirtual   #74  <Method int String.length()>
	//   21   39:istore_1        
		}
		int i1 = i;
	//   22   40:iload_1         
	//   23   41:istore_3        
		if(i >= 2)
	//*  24   42:iload_1         
	//*  25   43:iconst_2        
	//*  26   44:icmplt          51
			i1 = i / 2;
	//   27   47:iload_1         
	//   28   48:iconst_2        
	//   29   49:idiv            
	//   30   50:istore_3        
		s = ((String) (new byte[i1]));
	//   31   51:iload_3         
	//   32   52:newarray        byte[]
	//   33   54:astore_0        
		byte abyte0[] = s1.getBytes();
	//   34   55:aload           5
	//   35   57:invokevirtual   #156 <Method byte[] String.getBytes()>
	//   36   60:astore          5
		for(int j1 = 0; j1 < i1; j1++)
	//*  37   62:iconst_0        
	//*  38   63:istore          4
	//*  39   65:goto            284
		{
			int j;
			if(abyte0[j1 * 2] >= 48 && abyte0[j1 * 2] <= 57)
	//*  40   68:aload           5
	//*  41   70:iload           4
	//*  42   72:iconst_2        
	//*  43   73:imul            
	//*  44   74:baload          
	//*  45   75:bipush          48
	//*  46   77:icmplt          106
	//*  47   80:aload           5
	//*  48   82:iload           4
	//*  49   84:iconst_2        
	//*  50   85:imul            
	//*  51   86:baload          
	//*  52   87:bipush          57
	//*  53   89:icmpgt          106
				j = abyte0[j1 * 2] - 48;
	//   54   92:aload           5
	//   55   94:iload           4
	//   56   96:iconst_2        
	//   57   97:imul            
	//   58   98:baload          
	//   59   99:bipush          48
	//   60  101:isub            
	//   61  102:istore_1        
			else
	//*  62  103:goto            161
			if(abyte0[j1 * 2] >= 97 && abyte0[j1 * 2] <= 122)
	//*  63  106:aload           5
	//*  64  108:iload           4
	//*  65  110:iconst_2        
	//*  66  111:imul            
	//*  67  112:baload          
	//*  68  113:bipush          97
	//*  69  115:icmplt          147
	//*  70  118:aload           5
	//*  71  120:iload           4
	//*  72  122:iconst_2        
	//*  73  123:imul            
	//*  74  124:baload          
	//*  75  125:bipush          122
	//*  76  127:icmpgt          147
				j = (abyte0[j1 * 2] - 97) + 10;
	//   77  130:aload           5
	//   78  132:iload           4
	//   79  134:iconst_2        
	//   80  135:imul            
	//   81  136:baload          
	//   82  137:bipush          97
	//   83  139:isub            
	//   84  140:bipush          10
	//   85  142:iadd            
	//   86  143:istore_1        
			else
	//*  87  144:goto            161
				j = (abyte0[j1 * 2] - 65) + 10;
	//   88  147:aload           5
	//   89  149:iload           4
	//   90  151:iconst_2        
	//   91  152:imul            
	//   92  153:baload          
	//   93  154:bipush          65
	//   94  156:isub            
	//   95  157:bipush          10
	//   96  159:iadd            
	//   97  160:istore_1        
			int l;
			if(abyte0[j1 * 2 + 1] >= 48 && abyte0[j1 * 2 + 1] <= 57)
	//*  98  161:aload           5
	//*  99  163:iload           4
	//* 100  165:iconst_2        
	//* 101  166:imul            
	//* 102  167:iconst_1        
	//* 103  168:iadd            
	//* 104  169:baload          
	//* 105  170:bipush          48
	//* 106  172:icmplt          205
	//* 107  175:aload           5
	//* 108  177:iload           4
	//* 109  179:iconst_2        
	//* 110  180:imul            
	//* 111  181:iconst_1        
	//* 112  182:iadd            
	//* 113  183:baload          
	//* 114  184:bipush          57
	//* 115  186:icmpgt          205
				l = abyte0[j1 * 2 + 1] - 48;
	//  116  189:aload           5
	//  117  191:iload           4
	//  118  193:iconst_2        
	//  119  194:imul            
	//  120  195:iconst_1        
	//  121  196:iadd            
	//  122  197:baload          
	//  123  198:bipush          48
	//  124  200:isub            
	//  125  201:istore_2        
			else
	//* 126  202:goto            268
			if(abyte0[j1 * 2 + 1] >= 97 && abyte0[j1 * 2 + 1] <= 122)
	//* 127  205:aload           5
	//* 128  207:iload           4
	//* 129  209:iconst_2        
	//* 130  210:imul            
	//* 131  211:iconst_1        
	//* 132  212:iadd            
	//* 133  213:baload          
	//* 134  214:bipush          97
	//* 135  216:icmplt          252
	//* 136  219:aload           5
	//* 137  221:iload           4
	//* 138  223:iconst_2        
	//* 139  224:imul            
	//* 140  225:iconst_1        
	//* 141  226:iadd            
	//* 142  227:baload          
	//* 143  228:bipush          122
	//* 144  230:icmpgt          252
				l = (abyte0[j1 * 2 + 1] - 97) + 10;
	//  145  233:aload           5
	//  146  235:iload           4
	//  147  237:iconst_2        
	//  148  238:imul            
	//  149  239:iconst_1        
	//  150  240:iadd            
	//  151  241:baload          
	//  152  242:bipush          97
	//  153  244:isub            
	//  154  245:bipush          10
	//  155  247:iadd            
	//  156  248:istore_2        
			else
	//* 157  249:goto            268
				l = (abyte0[j1 * 2 + 1] - 65) + 10;
	//  158  252:aload           5
	//  159  254:iload           4
	//  160  256:iconst_2        
	//  161  257:imul            
	//  162  258:iconst_1        
	//  163  259:iadd            
	//  164  260:baload          
	//  165  261:bipush          65
	//  166  263:isub            
	//  167  264:bipush          10
	//  168  266:iadd            
	//  169  267:istore_2        
			s[j1] = (byte)((j << 4) + l);
	//  170  268:aload_0         
	//  171  269:iload           4
	//  172  271:iload_1         
	//  173  272:iconst_4        
	//  174  273:ishl            
	//  175  274:iload_2         
	//  176  275:iadd            
	//  177  276:int2byte        
	//  178  277:bastore         
		}

	//  179  278:iload           4
	//  180  280:iconst_1        
	//  181  281:iadd            
	//  182  282:istore          4
	//  183  284:iload           4
	//  184  286:iload_3         
	//  185  287:icmplt          68
		return ((byte []) (s));
	//  186  290:aload_0         
	//  187  291:areturn         
	}

	protected long bcd2Dec()
	{
		int j = data.length;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] data>
	//    2    4:arraylength     
	//    3    5:istore_2        
		long l = 0L;
	//    4    6:lconst_0        
	//    5    7:lstore          4
		for(int i = 0; i < j; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_1        
	//*   8   11:goto            100
		{
			int k = ((int) ((byte)((data[i] & 0xf0) >>> 4)));
	//    9   14:aload_0         
	//   10   15:getfield        #43  <Field byte[] data>
	//   11   18:iload_1         
	//   12   19:baload          
	//   13   20:sipush          240
	//   14   23:iand            
	//   15   24:iconst_4        
	//   16   25:iushr           
	//   17   26:int2byte        
	//   18   27:istore_3        
			if(k > 9)
	//*  19   28:iload_3         
	//*  20   29:bipush          9
	//*  21   31:icmple          37
				return l;
	//   22   34:lload           4
	//   23   36:lreturn         
			long l1 = k * 10;
	//   24   37:iload_3         
	//   25   38:bipush          10
	//   26   40:imul            
	//   27   41:i2l             
	//   28   42:lstore          6
			k = ((int) ((byte)(data[i] & 0xf)));
	//   29   44:aload_0         
	//   30   45:getfield        #43  <Field byte[] data>
	//   31   48:iload_1         
	//   32   49:baload          
	//   33   50:bipush          15
	//   34   52:iand            
	//   35   53:int2byte        
	//   36   54:istore_3        
			if(k > 9)
	//*  37   55:iload_3         
	//*  38   56:bipush          9
	//*  39   58:icmple          70
				l1 += 0L;
	//   40   61:lload           6
	//   41   63:lconst_0        
	//   42   64:ladd            
	//   43   65:lstore          6
			else
	//*  44   67:goto            77
				l1 += k;
	//   45   70:lload           6
	//   46   72:iload_3         
	//   47   73:i2l             
	//   48   74:ladd            
	//   49   75:lstore          6
			l += (long)power(100, j - (i + 1)) * l1;
	//   50   77:lload           4
	//   51   79:bipush          100
	//   52   81:iload_2         
	//   53   82:iload_1         
	//   54   83:iconst_1        
	//   55   84:iadd            
	//   56   85:isub            
	//   57   86:invokestatic    #54  <Method int power(int, int)>
	//   58   89:i2l             
	//   59   90:lload           6
	//   60   92:lmul            
	//   61   93:ladd            
	//   62   94:lstore          4
		}

	//   63   96:iload_1         
	//   64   97:iconst_1        
	//   65   98:iadd            
	//   66   99:istore_1        
	//   67  100:iload_1         
	//   68  101:iload_2         
	//   69  102:icmplt          14
		return l;
	//   70  105:lload           4
	//   71  107:lreturn         
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

	public String getBCD()
	{
		if(data.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field byte[] data>
	//*   2    4:arraylength     
	//*   3    5:ifle            14
			return toHexString('\0');
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #164 <Method String toHexString(char)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public byte getByte(int i)
	{
		if(i < data.length)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #43  <Field byte[] data>
	//*   3    5:arraylength     
	//*   4    6:icmpge          16
			return data[i];
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field byte[] data>
	//    7   13:iload_1         
	//    8   14:baload          
	//    9   15:ireturn         
		else
			return -1;
	//   10   16:iconst_m1       
	//   11   17:ireturn         
	}

	public byte[] getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] data>
	//    2    4:areturn         
	}

	public byte getNumber(int i)
	{
		if(i == 0 || i > data.length * 2)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #43  <Field byte[] data>
	//*   5    9:arraylength     
	//*   6   10:iconst_2        
	//*   7   11:imul            
	//*   8   12:icmple          17
			return -1;
	//    9   15:iconst_m1       
	//   10   16:ireturn         
		byte byte0 = data[(i - 1) / 2];
	//   11   17:aload_0         
	//   12   18:getfield        #43  <Field byte[] data>
	//   13   21:iload_1         
	//   14   22:iconst_1        
	//   15   23:isub            
	//   16   24:iconst_2        
	//   17   25:idiv            
	//   18   26:baload          
	//   19   27:istore_2        
		if(i % 2 == 1)
	//*  20   28:iload_1         
	//*  21   29:iconst_2        
	//*  22   30:irem            
	//*  23   31:iconst_1        
	//*  24   32:icmpne          40
			return (byte)(byte0 >>> 4);
	//   25   35:iload_2         
	//   26   36:iconst_4        
	//   27   37:iushr           
	//   28   38:int2byte        
	//   29   39:ireturn         
		else
			return (byte)(byte0 & 0xf);
	//   30   40:iload_2         
	//   31   41:bipush          15
	//   32   43:iand            
	//   33   44:int2byte        
	//   34   45:ireturn         
	}

	public int intValue()
	{
		if(data.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field byte[] data>
	//*   2    4:arraylength     
	//*   3    5:ifle            32
		{
			long l = bcd2Dec();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #170 <Method long bcd2Dec()>
	//    6   12:lstore_1        
			if(l <= 0x7fffffffL && l >= 0x80000000L)
	//*   7   13:lload_1         
	//*   8   14:ldc2w           #171 <Long 0x7fffffffL>
	//*   9   17:lcmp            
	//*  10   18:ifgt            32
	//*  11   21:lload_1         
	//*  12   22:ldc2w           #173 <Long 0x80000000L>
	//*  13   25:lcmp            
	//*  14   26:iflt            32
				return (int)l;
	//   15   29:lload_1         
	//   16   30:l2i             
	//   17   31:ireturn         
		}
		return 0;
	//   18   32:iconst_0        
	//   19   33:ireturn         
	}

	public boolean isEmpty()
	{
		return data == null;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] data>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
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
	{
		if(data.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field byte[] data>
	//*   2    4:arraylength     
	//*   3    5:ifle            13
			return bcd2Dec();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #170 <Method long bcd2Dec()>
	//    6   12:lreturn         
		else
			return 0L;
	//    7   13:lconst_0        
	//    8   14:lreturn         
	}

	public int preplace(int i)
	{
		return preplace(i, (byte)-1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #182 <Method int preplace(int, byte)>
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

	public boolean setBCD_L(String s, int i)
	{
		clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #186 <Method void clear()>
		if(i > 0)
	//*   2    4:iload_2         
	//*   3    5:ifle            26
		{
			data = new byte[i];
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:newarray        byte[]
	//    7   12:putfield        #43  <Field byte[] data>
			Arrays.fill(data, (byte)-1);
	//    8   15:aload_0         
	//    9   16:getfield        #43  <Field byte[] data>
	//   10   19:iconst_m1       
	//   11   20:invokestatic    #192 <Method void Arrays.fill(byte[], byte)>
		} else
	//*  12   23:goto            28
		{
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
		}
		s = s.toUpperCase();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #195 <Method String String.toUpperCase()>
	//   17   32:astore_1        
		int l = s.length();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #74  <Method int String.length()>
	//   20   37:istore          6
		if(l > 0)
	//*  21   39:iload           6
	//*  22   41:ifle            171
		{
			int k = 0;
	//   23   44:iconst_0        
	//   24   45:istore          5
			for(int j = 0; j < l && j < i * 2; j++)
	//*  25   47:iconst_0        
	//*  26   48:istore          4
	//*  27   50:goto            154
			{
				char c = s.charAt(j);
	//   28   53:aload_1         
	//   29   54:iload           4
	//   30   56:invokevirtual   #82  <Method char String.charAt(int)>
	//   31   59:istore          7
				c = ((char) (validBcd.indexOf(((int) (c)))));
	//   32   61:getstatic       #37  <Field String validBcd>
	//   33   64:iload           7
	//   34   66:invokevirtual   #198 <Method int String.indexOf(int)>
	//   35   69:istore          7
				if(c != -1)
	//*  36   71:iload           7
	//*  37   73:iconst_m1       
	//*  38   74:icmpeq          146
				{
					if(j % 2 == 1)
	//*  39   77:iload           4
	//*  40   79:iconst_2        
	//*  41   80:irem            
	//*  42   81:iconst_1        
	//*  43   82:icmpne          123
					{
						c |= '\360';
	//   44   85:iload           7
	//   45   87:sipush          240
	//   46   90:ior             
	//   47   91:int2byte        
	//   48   92:istore          7
						byte abyte0[] = data;
	//   49   94:aload_0         
	//   50   95:getfield        #43  <Field byte[] data>
	//   51   98:astore          8
						abyte0[k] = (byte)(abyte0[k] & c);
	//   52  100:aload           8
	//   53  102:iload           5
	//   54  104:aload           8
	//   55  106:iload           5
	//   56  108:baload          
	//   57  109:iload           7
	//   58  111:iand            
	//   59  112:int2byte        
	//   60  113:bastore         
						k++;
	//   61  114:iload           5
	//   62  116:iconst_1        
	//   63  117:iadd            
	//   64  118:istore          5
					} else
	//*  65  120:goto            148
					{
						byte byte0 = (byte)((c & 0xf) << 4 | 0xf);
	//   66  123:iload           7
	//   67  125:bipush          15
	//   68  127:iand            
	//   69  128:iconst_4        
	//   70  129:ishl            
	//   71  130:bipush          15
	//   72  132:ior             
	//   73  133:int2byte        
	//   74  134:istore_3        
						data[k] = byte0;
	//   75  135:aload_0         
	//   76  136:getfield        #43  <Field byte[] data>
	//   77  139:iload           5
	//   78  141:iload_3         
	//   79  142:bastore         
					}
				} else
	//*  80  143:goto            148
				{
					return false;
	//   81  146:iconst_0        
	//   82  147:ireturn         
				}
			}

	//   83  148:iload           4
	//   84  150:iconst_1        
	//   85  151:iadd            
	//   86  152:istore          4
	//   87  154:iload           4
	//   88  156:iload           6
	//   89  158:icmpge          169
	//   90  161:iload           4
	//   91  163:iload_2         
	//   92  164:iconst_2        
	//   93  165:imul            
	//   94  166:icmplt          53
			return true;
	//   95  169:iconst_1        
	//   96  170:ireturn         
		} else
		{
			return false;
	//   97  171:iconst_0        
	//   98  172:ireturn         
		}
	}

	public boolean setBCD_R(String s, int i)
	{
		clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #186 <Method void clear()>
		if(i > 0)
	//*   2    4:iload_2         
	//*   3    5:ifle            26
		{
			data = new byte[i];
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:newarray        byte[]
	//    7   12:putfield        #43  <Field byte[] data>
			Arrays.fill(data, (byte)0);
	//    8   15:aload_0         
	//    9   16:getfield        #43  <Field byte[] data>
	//   10   19:iconst_0        
	//   11   20:invokestatic    #192 <Method void Arrays.fill(byte[], byte)>
		} else
	//*  12   23:goto            28
		{
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
		}
		s = s.toUpperCase();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #195 <Method String String.toUpperCase()>
	//   17   32:astore_1        
		int j = s.length();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #74  <Method int String.length()>
	//   20   37:istore_3        
		if(j > 0)
	//*  21   38:iload_3         
	//*  22   39:ifle            189
		{
			if(j >= data.length * 2)
	//*  23   42:iload_3         
	//*  24   43:aload_0         
	//*  25   44:getfield        #43  <Field byte[] data>
	//*  26   47:arraylength     
	//*  27   48:iconst_2        
	//*  28   49:imul            
	//*  29   50:icmplt          66
			{
				i = 0;
	//   30   53:iconst_0        
	//   31   54:istore_2        
				j = data.length * 2;
	//   32   55:aload_0         
	//   33   56:getfield        #43  <Field byte[] data>
	//   34   59:arraylength     
	//   35   60:iconst_2        
	//   36   61:imul            
	//   37   62:istore_3        
			} else
	//*  38   63:goto            76
			{
				i = data.length * 2 - j;
	//   39   66:aload_0         
	//   40   67:getfield        #43  <Field byte[] data>
	//   41   70:arraylength     
	//   42   71:iconst_2        
	//   43   72:imul            
	//   44   73:iload_3         
	//   45   74:isub            
	//   46   75:istore_2        
			}
			for(int k = 0; k < j; k++)
	//*  47   76:iconst_0        
	//*  48   77:istore          4
	//*  49   79:goto            181
			{
				char c = s.charAt(k);
	//   50   82:aload_1         
	//   51   83:iload           4
	//   52   85:invokevirtual   #82  <Method char String.charAt(int)>
	//   53   88:istore          5
				c = ((char) (validBcd.indexOf(((int) (c)))));
	//   54   90:getstatic       #37  <Field String validBcd>
	//   55   93:iload           5
	//   56   95:invokevirtual   #198 <Method int String.indexOf(int)>
	//   57   98:istore          5
				if(c == -1)
	//*  58  100:iload           5
	//*  59  102:iconst_m1       
	//*  60  103:icmpne          113
					c = '\017';
	//   61  106:bipush          15
	//   62  108:istore          5
				else
	//*  63  110:goto            121
					c &= '\017';
	//   64  113:iload           5
	//   65  115:bipush          15
	//   66  117:iand            
	//   67  118:int2byte        
	//   68  119:istore          5
				if(i % 2 == 1)
	//*  69  121:iload_2         
	//*  70  122:iconst_2        
	//*  71  123:irem            
	//*  72  124:iconst_1        
	//*  73  125:icmpne          139
					c &= '\017';
	//   74  128:iload           5
	//   75  130:bipush          15
	//   76  132:iand            
	//   77  133:int2byte        
	//   78  134:istore          5
				else
	//*  79  136:goto            151
					c = ((char) ((byte)((byte)(c << 4) & 0xf0)));
	//   80  139:iload           5
	//   81  141:iconst_4        
	//   82  142:ishl            
	//   83  143:int2byte        
	//   84  144:sipush          240
	//   85  147:iand            
	//   86  148:int2byte        
	//   87  149:istore          5
				data[i >> 1] = (byte)(data[i >> 1] | c);
	//   88  151:aload_0         
	//   89  152:getfield        #43  <Field byte[] data>
	//   90  155:iload_2         
	//   91  156:iconst_1        
	//   92  157:ishr            
	//   93  158:aload_0         
	//   94  159:getfield        #43  <Field byte[] data>
	//   95  162:iload_2         
	//   96  163:iconst_1        
	//   97  164:ishr            
	//   98  165:baload          
	//   99  166:iload           5
	//  100  168:ior             
	//  101  169:int2byte        
	//  102  170:bastore         
				i++;
	//  103  171:iload_2         
	//  104  172:iconst_1        
	//  105  173:iadd            
	//  106  174:istore_2        
			}

	//  107  175:iload           4
	//  108  177:iconst_1        
	//  109  178:iadd            
	//  110  179:istore          4
	//  111  181:iload           4
	//  112  183:iload_3         
	//  113  184:icmplt          82
			return true;
	//  114  187:iconst_1        
	//  115  188:ireturn         
		} else
		{
			return false;
	//  116  189:iconst_0        
	//  117  190:ireturn         
		}
	}

	public boolean setData(int i, String s)
		throws FM_Exception
	{
		int j = (s.length() + 1) / 2;
	//    0    0:aload_2         
	//    1    1:invokevirtual   #74  <Method int String.length()>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:istore          4
		if(j > 0)
	//*   7   10:iload           4
	//*   8   12:ifle            216
		{
			byte abyte0[] = new byte[j];
	//    9   15:iload           4
	//   10   17:newarray        byte[]
	//   11   19:astore          8
			s = s.toUpperCase();
	//   12   21:aload_2         
	//   13   22:invokevirtual   #195 <Method String String.toUpperCase()>
	//   14   25:astore_2        
			int l = 0;
	//   15   26:iconst_0        
	//   16   27:istore          5
			j = 0;
	//   17   29:iconst_0        
	//   18   30:istore          4
			byte byte0 = 0;
	//   19   32:iconst_0        
	//   20   33:istore_3        
			for(int i1 = 0; i1 < s.length(); i1++)
	//*  21   34:iconst_0        
	//*  22   35:istore          6
	//*  23   37:goto            128
			{
				int k1 = ((int) (s.charAt(i1)));
	//   24   40:aload_2         
	//   25   41:iload           6
	//   26   43:invokevirtual   #82  <Method char String.charAt(int)>
	//   27   46:istore          7
				k1 = validBcd.indexOf(k1);
	//   28   48:getstatic       #37  <Field String validBcd>
	//   29   51:iload           7
	//   30   53:invokevirtual   #198 <Method int String.indexOf(int)>
	//   31   56:istore          7
				if(k1 != -1)
	//*  32   58:iload           7
	//*  33   60:iconst_m1       
	//*  34   61:icmpeq          116
				{
					l++;
	//   35   64:iload           5
	//   36   66:iconst_1        
	//   37   67:iadd            
	//   38   68:istore          5
					if(l % 2 == 1)
	//*  39   70:iload           5
	//*  40   72:iconst_2        
	//*  41   73:irem            
	//*  42   74:iconst_1        
	//*  43   75:icmpne          89
					{
						byte0 = (byte)(k1 << 4 | byte0);
	//   44   78:iload           7
	//   45   80:iconst_4        
	//   46   81:ishl            
	//   47   82:iload_3         
	//   48   83:ior             
	//   49   84:int2byte        
	//   50   85:istore_3        
					} else
	//*  51   86:goto            122
					{
						byte0 |= ((byte) (k1));
	//   52   89:iload_3         
	//   53   90:iload           7
	//   54   92:ior             
	//   55   93:int2byte        
	//   56   94:istore_3        
						k1 = j + 1;
	//   57   95:iload           4
	//   58   97:iconst_1        
	//   59   98:iadd            
	//   60   99:istore          7
						abyte0[j] = byte0;
	//   61  101:aload           8
	//   62  103:iload           4
	//   63  105:iload_3         
	//   64  106:bastore         
						byte0 = 0;
	//   65  107:iconst_0        
	//   66  108:istore_3        
						j = k1;
	//   67  109:iload           7
	//   68  111:istore          4
					}
				} else
	//*  69  113:goto            122
				{
					clear();
	//   70  116:aload_0         
	//   71  117:invokevirtual   #186 <Method void clear()>
					return false;
	//   72  120:iconst_0        
	//   73  121:ireturn         
				}
			}

	//   74  122:iload           6
	//   75  124:iconst_1        
	//   76  125:iadd            
	//   77  126:istore          6
	//   78  128:iload           6
	//   79  130:aload_2         
	//   80  131:invokevirtual   #74  <Method int String.length()>
	//   81  134:icmplt          40
			int j1 = j;
	//   82  137:iload           4
	//   83  139:istore          6
			if(l % 2 == 1)
	//*  84  141:iload           5
	//*  85  143:iconst_2        
	//*  86  144:irem            
	//*  87  145:iconst_1        
	//*  88  146:icmpne          161
			{
				j1 = j + 1;
	//   89  149:iload           4
	//   90  151:iconst_1        
	//   91  152:iadd            
	//   92  153:istore          6
				abyte0[j] = byte0;
	//   93  155:aload           8
	//   94  157:iload           4
	//   95  159:iload_3         
	//   96  160:bastore         
			}
			if(i + j1 > data.length)
	//*  97  161:iload_1         
	//*  98  162:iload           6
	//*  99  164:iadd            
	//* 100  165:aload_0         
	//* 101  166:getfield        #43  <Field byte[] data>
	//* 102  169:arraylength     
	//* 103  170:icmple          183
				throw new FM_Exception("overstep the boundary");
	//  104  173:new             #105 <Class FM_Exception>
	//  105  176:dup             
	//  106  177:ldc1            #202 <String "overstep the boundary">
	//  107  179:invokespecial   #203 <Method void FM_Exception(String)>
	//  108  182:athrow          
			for(int k = 0; k < j1; k++)
	//* 109  183:iconst_0        
	//* 110  184:istore          4
	//* 111  186:goto            209
				data[i + k] = abyte0[k];
	//  112  189:aload_0         
	//  113  190:getfield        #43  <Field byte[] data>
	//  114  193:iload_1         
	//  115  194:iload           4
	//  116  196:iadd            
	//  117  197:aload           8
	//  118  199:iload           4
	//  119  201:baload          
	//  120  202:bastore         

	//  121  203:iload           4
	//  122  205:iconst_1        
	//  123  206:iadd            
	//  124  207:istore          4
	//  125  209:iload           4
	//  126  211:iload           6
	//  127  213:icmplt          189
		}
		return true;
	//  128  216:iconst_1        
	//  129  217:ireturn         
	}

	public boolean setData(int i, byte abyte0[])
		throws FM_Exception
	{
		return setData(i, abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:aload_2         
	//    5    5:arraylength     
	//    6    6:invokevirtual   #207 <Method boolean setData(int, byte[], int, int)>
	//    7    9:ireturn         
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
	//*   7   10:icmple          23
			throw new FM_Exception("invalid parameters");
	//    8   13:new             #105 <Class FM_Exception>
	//    9   16:dup             
	//   10   17:ldc1            #209 <String "invalid parameters">
	//   11   19:invokespecial   #203 <Method void FM_Exception(String)>
	//   12   22:athrow          
		if(i + k > data.length)
	//*  13   23:iload_1         
	//*  14   24:iload           4
	//*  15   26:iadd            
	//*  16   27:aload_0         
	//*  17   28:getfield        #43  <Field byte[] data>
	//*  18   31:arraylength     
	//*  19   32:icmple          45
			throw new FM_Exception("overstep the boundary");
	//   20   35:new             #105 <Class FM_Exception>
	//   21   38:dup             
	//   22   39:ldc1            #202 <String "overstep the boundary">
	//   23   41:invokespecial   #203 <Method void FM_Exception(String)>
	//   24   44:athrow          
		Arrays.fill(data, i, i + k, (byte)-1);
	//   25   45:aload_0         
	//   26   46:getfield        #43  <Field byte[] data>
	//   27   49:iload_1         
	//   28   50:iload_1         
	//   29   51:iload           4
	//   30   53:iadd            
	//   31   54:iconst_m1       
	//   32   55:invokestatic    #212 <Method void Arrays.fill(byte[], int, int, byte)>
		for(int l = 0; l < k; l++)
	//*  33   58:iconst_0        
	//*  34   59:istore          5
	//*  35   61:goto            209
		{
			byte byte0 = (byte)(abyte0[j + l] >> 4 & 0xf);
	//   36   64:aload_2         
	//   37   65:iload_3         
	//   38   66:iload           5
	//   39   68:iadd            
	//   40   69:baload          
	//   41   70:iconst_4        
	//   42   71:ishr            
	//   43   72:bipush          15
	//   44   74:iand            
	//   45   75:int2byte        
	//   46   76:istore          6
			if(byte0 < 10)
	//*  47   78:iload           6
	//*  48   80:bipush          10
	//*  49   82:icmpge          119
			{
				byte abyte1[] = data;
	//   50   85:aload_0         
	//   51   86:getfield        #43  <Field byte[] data>
	//   52   89:astore          8
				int i1 = i + l;
	//   53   91:iload_1         
	//   54   92:iload           5
	//   55   94:iadd            
	//   56   95:istore          7
				abyte1[i1] = (byte)(abyte1[i1] & (byte0 << 4 | 0xf));
	//   57   97:aload           8
	//   58   99:iload           7
	//   59  101:aload           8
	//   60  103:iload           7
	//   61  105:baload          
	//   62  106:iload           6
	//   63  108:iconst_4        
	//   64  109:ishl            
	//   65  110:bipush          15
	//   66  112:ior             
	//   67  113:iand            
	//   68  114:int2byte        
	//   69  115:bastore         
			} else
	//*  70  116:goto            135
			{
				if(byte0 != 15)
	//*  71  119:iload           6
	//*  72  121:bipush          15
	//*  73  123:icmpne          129
	//*  74  126:goto            216
				{
					clear();
	//   75  129:aload_0         
	//   76  130:invokevirtual   #186 <Method void clear()>
					return false;
	//   77  133:iconst_0        
	//   78  134:ireturn         
				}
				break;
			}
			byte0 = (byte)(abyte0[j + l] & 0xf);
	//   79  135:aload_2         
	//   80  136:iload_3         
	//   81  137:iload           5
	//   82  139:iadd            
	//   83  140:baload          
	//   84  141:bipush          15
	//   85  143:iand            
	//   86  144:int2byte        
	//   87  145:istore          6
			if(byte0 < 10)
	//*  88  147:iload           6
	//*  89  149:bipush          10
	//*  90  151:icmpge          187
			{
				byte abyte2[] = data;
	//   91  154:aload_0         
	//   92  155:getfield        #43  <Field byte[] data>
	//   93  158:astore          8
				int j1 = i + l;
	//   94  160:iload_1         
	//   95  161:iload           5
	//   96  163:iadd            
	//   97  164:istore          7
				abyte2[j1] = (byte)(abyte2[j1] & (byte0 | 0xf0));
	//   98  166:aload           8
	//   99  168:iload           7
	//  100  170:aload           8
	//  101  172:iload           7
	//  102  174:baload          
	//  103  175:iload           6
	//  104  177:sipush          240
	//  105  180:ior             
	//  106  181:iand            
	//  107  182:int2byte        
	//  108  183:bastore         
				continue;
	//  109  184:goto            203
			}
			if(byte0 != 15)
	//* 110  187:iload           6
	//* 111  189:bipush          15
	//* 112  191:icmpne          197
	//* 113  194:goto            216
			{
				clear();
	//  114  197:aload_0         
	//  115  198:invokevirtual   #186 <Method void clear()>
				return false;
	//  116  201:iconst_0        
	//  117  202:ireturn         
			}
			break;
		}

	//  118  203:iload           5
	//  119  205:iconst_1        
	//  120  206:iadd            
	//  121  207:istore          5
	//  122  209:iload           5
	//  123  211:iload           4
	//  124  213:icmplt          64
		return true;
	//  125  216:iconst_1        
	//  126  217:ireturn         
	}

	public short shortValue()
	{
		if(data.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field byte[] data>
	//*   2    4:arraylength     
	//*   3    5:ifle            33
		{
			long l = bcd2Dec();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #170 <Method long bcd2Dec()>
	//    6   12:lstore_1        
			if(l <= 32767L && l >= -32768L)
	//*   7   13:lload_1         
	//*   8   14:ldc2w           #215 <Long 32767L>
	//*   9   17:lcmp            
	//*  10   18:ifgt            33
	//*  11   21:lload_1         
	//*  12   22:ldc2w           #217 <Long -32768L>
	//*  13   25:lcmp            
	//*  14   26:iflt            33
				return (short)(int)l;
	//   15   29:lload_1         
	//   16   30:l2i             
	//   17   31:int2short       
	//   18   32:ireturn         
		}
		return 0;
	//   19   33:iconst_0        
	//   20   34:ireturn         
	}

	public String toHexString(char c)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #219 <Method void StringBuilder()>
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
			stringbuilder.append(validBcd.charAt((byte0 & 0xf0) >> 4));
	//   12   21:aload           4
	//   13   23:getstatic       #37  <Field String validBcd>
	//   14   26:iload_3         
	//   15   27:sipush          240
	//   16   30:iand            
	//   17   31:iconst_4        
	//   18   32:ishr            
	//   19   33:invokevirtual   #82  <Method char String.charAt(int)>
	//   20   36:invokevirtual   #222 <Method StringBuilder StringBuilder.append(char)>
	//   21   39:pop             
			stringbuilder.append(validBcd.charAt(byte0 & 0xf));
	//   22   40:aload           4
	//   23   42:getstatic       #37  <Field String validBcd>
	//   24   45:iload_3         
	//   25   46:bipush          15
	//   26   48:iand            
	//   27   49:invokevirtual   #82  <Method char String.charAt(int)>
	//   28   52:invokevirtual   #222 <Method StringBuilder StringBuilder.append(char)>
	//   29   55:pop             
			if(c != 0)
	//*  30   56:iload_1         
	//*  31   57:ifeq            67
				stringbuilder.append(c);
	//   32   60:aload           4
	//   33   62:iload_1         
	//   34   63:invokevirtual   #222 <Method StringBuilder StringBuilder.append(char)>
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
	//   46   82:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   47   85:areturn         
	}

	public boolean valueOf(String s)
	{
		clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #186 <Method void clear()>
		int i = (s.length() + 1) / 2;
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method int String.length()>
	//    4    8:iconst_1        
	//    5    9:iadd            
	//    6   10:iconst_2        
	//    7   11:idiv            
	//    8   12:istore_3        
		if(i > 0)
	//*   9   13:iload_3         
	//*  10   14:ifle            176
		{
			data = new byte[i];
	//   11   17:aload_0         
	//   12   18:iload_3         
	//   13   19:newarray        byte[]
	//   14   21:putfield        #43  <Field byte[] data>
			Arrays.fill(data, (byte)-1);
	//   15   24:aload_0         
	//   16   25:getfield        #43  <Field byte[] data>
	//   17   28:iconst_m1       
	//   18   29:invokestatic    #192 <Method void Arrays.fill(byte[], byte)>
			s = s.toUpperCase();
	//   19   32:aload_1         
	//   20   33:invokevirtual   #195 <Method String String.toUpperCase()>
	//   21   36:astore_1        
			int k = 0;
	//   22   37:iconst_0        
	//   23   38:istore          4
			int l = 0;
	//   24   40:iconst_0        
	//   25   41:istore          5
			for(int j = 0; j < s.length(); j++)
	//*  26   43:iconst_0        
	//*  27   44:istore_3        
	//*  28   45:goto            166
			{
				char c = s.charAt(j);
	//   29   48:aload_1         
	//   30   49:iload_3         
	//   31   50:invokevirtual   #82  <Method char String.charAt(int)>
	//   32   53:istore          6
				c = ((char) (validBcd.indexOf(((int) (c)))));
	//   33   55:getstatic       #37  <Field String validBcd>
	//   34   58:iload           6
	//   35   60:invokevirtual   #198 <Method int String.indexOf(int)>
	//   36   63:istore          6
				if(c != -1)
	//*  37   65:iload           6
	//*  38   67:iconst_m1       
	//*  39   68:icmpeq          156
				{
					if(j % 2 == 1)
	//*  40   71:iload_3         
	//*  41   72:iconst_2        
	//*  42   73:irem            
	//*  43   74:iconst_1        
	//*  44   75:icmpne          130
					{
						c = ((char) ((byte)((c | 0xf0) & l)));
	//   45   78:iload           6
	//   46   80:sipush          240
	//   47   83:ior             
	//   48   84:iload           5
	//   49   86:iand            
	//   50   87:int2byte        
	//   51   88:istore          6
						byte abyte0[] = data;
	//   52   90:aload_0         
	//   53   91:getfield        #43  <Field byte[] data>
	//   54   94:astore          7
						l = k + 1;
	//   55   96:iload           4
	//   56   98:iconst_1        
	//   57   99:iadd            
	//   58  100:istore          5
						abyte0[k] = (byte)(abyte0[k] & c);
	//   59  102:aload           7
	//   60  104:iload           4
	//   61  106:aload           7
	//   62  108:iload           4
	//   63  110:baload          
	//   64  111:iload           6
	//   65  113:iand            
	//   66  114:int2byte        
	//   67  115:bastore         
						c = '\0';
	//   68  116:iconst_0        
	//   69  117:istore          6
						k = l;
	//   70  119:iload           5
	//   71  121:istore          4
						l = ((int) (c));
	//   72  123:iload           6
	//   73  125:istore          5
					} else
	//*  74  127:goto            162
					{
						byte byte0 = (byte)(c << 4 | 0xf | l);
	//   75  130:iload           6
	//   76  132:iconst_4        
	//   77  133:ishl            
	//   78  134:bipush          15
	//   79  136:ior             
	//   80  137:iload           5
	//   81  139:ior             
	//   82  140:int2byte        
	//   83  141:istore_2        
						data[k] = byte0;
	//   84  142:aload_0         
	//   85  143:getfield        #43  <Field byte[] data>
	//   86  146:iload           4
	//   87  148:iload_2         
	//   88  149:bastore         
						l = ((int) (byte0));
	//   89  150:iload_2         
	//   90  151:istore          5
					}
				} else
	//*  91  153:goto            162
				{
					clear();
	//   92  156:aload_0         
	//   93  157:invokevirtual   #186 <Method void clear()>
					return false;
	//   94  160:iconst_0        
	//   95  161:ireturn         
				}
			}

	//   96  162:iload_3         
	//   97  163:iconst_1        
	//   98  164:iadd            
	//   99  165:istore_3        
	//  100  166:iload_3         
	//  101  167:aload_1         
	//  102  168:invokevirtual   #74  <Method int String.length()>
	//  103  171:icmplt          48
			return true;
	//  104  174:iconst_1        
	//  105  175:ireturn         
		} else
		{
			return false;
	//  106  176:iconst_0        
	//  107  177:ireturn         
		}
	}

	private static String clazzName = ((Class) (cn/com/fmsh/util/FM_CN)).getName();
	private static FMLog log = LogFactory.getInstance().getLog();
	private static String validBcd = "0123456789";
	public byte data[];

	static 
	{
	//    0    0:invokestatic    #19  <Method LogFactory LogFactory.getInstance()>
	//    1    3:invokevirtual   #23  <Method FMLog LogFactory.getLog()>
	//    2    6:putstatic       #25  <Field FMLog log>
	//    3    9:ldc1            #2   <Class FM_CN>
	//    4   11:invokevirtual   #31  <Method String Class.getName()>
	//    5   14:putstatic       #33  <Field String clazzName>
	//    6   17:ldc1            #35  <String "0123456789">
	//    7   19:putstatic       #37  <Field String validBcd>
	//*   8   22:return          
	}
}
