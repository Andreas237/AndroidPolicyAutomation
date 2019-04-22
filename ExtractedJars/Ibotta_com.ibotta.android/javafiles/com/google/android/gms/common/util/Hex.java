// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;


public class Hex
{

	public Hex()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:return          
	}

	public static String bytesToColonDelimitedStringLowercase(byte abyte0[])
	{
		if(abyte0.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            13
			return new String();
	//    3    5:new             #43  <Class String>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void String()>
	//    6   12:areturn         
		char ac[] = new char[abyte0.length * 3 - 1];
	//    7   13:aload_0         
	//    8   14:arraylength     
	//    9   15:iconst_3        
	//   10   16:imul            
	//   11   17:iconst_1        
	//   12   18:isub            
	//   13   19:newarray        char[]
	//   14   21:astore          5
		int i = 0;
	//   15   23:iconst_0        
	//   16   24:istore_1        
		int j;
		for(j = 0; i < abyte0.length - 1; j++)
	//*  17   25:iconst_0        
	//*  18   26:istore_2        
	//*  19   27:iload_1         
	//*  20   28:aload_0         
	//*  21   29:arraylength     
	//*  22   30:iconst_1        
	//*  23   31:isub            
	//*  24   32:icmpge          97
		{
			int k = abyte0[i] & 0xff;
	//   25   35:aload_0         
	//   26   36:iload_1         
	//   27   37:baload          
	//   28   38:sipush          255
	//   29   41:iand            
	//   30   42:istore_3        
			int l = j + 1;
	//   31   43:iload_2         
	//   32   44:iconst_1        
	//   33   45:iadd            
	//   34   46:istore          4
			char ac1[] = zzaaa;
	//   35   48:getstatic       #35  <Field char[] zzaaa>
	//   36   51:astore          6
			ac[j] = ac1[k >>> 4];
	//   37   53:aload           5
	//   38   55:iload_2         
	//   39   56:aload           6
	//   40   58:iload_3         
	//   41   59:iconst_4        
	//   42   60:iushr           
	//   43   61:caload          
	//   44   62:castore         
			j = l + 1;
	//   45   63:iload           4
	//   46   65:iconst_1        
	//   47   66:iadd            
	//   48   67:istore_2        
			ac[l] = ac1[k & 0xf];
	//   49   68:aload           5
	//   50   70:iload           4
	//   51   72:aload           6
	//   52   74:iload_3         
	//   53   75:bipush          15
	//   54   77:iand            
	//   55   78:caload          
	//   56   79:castore         
			ac[j] = ':';
	//   57   80:aload           5
	//   58   82:iload_2         
	//   59   83:bipush          58
	//   60   85:castore         
			i++;
	//   61   86:iload_1         
	//   62   87:iconst_1        
	//   63   88:iadd            
	//   64   89:istore_1        
		}

	//   65   90:iload_2         
	//   66   91:iconst_1        
	//   67   92:iadd            
	//   68   93:istore_2        
	//*  69   94:goto            27
		i = abyte0[abyte0.length - 1] & 0xff;
	//   70   97:aload_0         
	//   71   98:aload_0         
	//   72   99:arraylength     
	//   73  100:iconst_1        
	//   74  101:isub            
	//   75  102:baload          
	//   76  103:sipush          255
	//   77  106:iand            
	//   78  107:istore_1        
		abyte0 = ((byte []) (zzaaa));
	//   79  108:getstatic       #35  <Field char[] zzaaa>
	//   80  111:astore_0        
		ac[j] = ((char) (abyte0[i >>> 4]));
	//   81  112:aload           5
	//   82  114:iload_2         
	//   83  115:aload_0         
	//   84  116:iload_1         
	//   85  117:iconst_4        
	//   86  118:iushr           
	//   87  119:caload          
	//   88  120:castore         
		ac[j + 1] = ((char) (abyte0[i & 0xf]));
	//   89  121:aload           5
	//   90  123:iload_2         
	//   91  124:iconst_1        
	//   92  125:iadd            
	//   93  126:aload_0         
	//   94  127:iload_1         
	//   95  128:bipush          15
	//   96  130:iand            
	//   97  131:caload          
	//   98  132:castore         
		return new String(ac);
	//   99  133:new             #43  <Class String>
	//  100  136:dup             
	//  101  137:aload           5
	//  102  139:invokespecial   #47  <Method void String(char[])>
	//  103  142:areturn         
	}

	public static String bytesToColonDelimitedStringUppercase(byte abyte0[])
	{
		if(abyte0.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            13
			return new String();
	//    3    5:new             #43  <Class String>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void String()>
	//    6   12:areturn         
		char ac[] = new char[abyte0.length * 3 - 1];
	//    7   13:aload_0         
	//    8   14:arraylength     
	//    9   15:iconst_3        
	//   10   16:imul            
	//   11   17:iconst_1        
	//   12   18:isub            
	//   13   19:newarray        char[]
	//   14   21:astore          5
		int i = 0;
	//   15   23:iconst_0        
	//   16   24:istore_1        
		int j;
		for(j = 0; i < abyte0.length - 1; j++)
	//*  17   25:iconst_0        
	//*  18   26:istore_2        
	//*  19   27:iload_1         
	//*  20   28:aload_0         
	//*  21   29:arraylength     
	//*  22   30:iconst_1        
	//*  23   31:isub            
	//*  24   32:icmpge          97
		{
			int k = abyte0[i] & 0xff;
	//   25   35:aload_0         
	//   26   36:iload_1         
	//   27   37:baload          
	//   28   38:sipush          255
	//   29   41:iand            
	//   30   42:istore_3        
			int l = j + 1;
	//   31   43:iload_2         
	//   32   44:iconst_1        
	//   33   45:iadd            
	//   34   46:istore          4
			char ac1[] = zzzz;
	//   35   48:getstatic       #27  <Field char[] zzzz>
	//   36   51:astore          6
			ac[j] = ac1[k >>> 4];
	//   37   53:aload           5
	//   38   55:iload_2         
	//   39   56:aload           6
	//   40   58:iload_3         
	//   41   59:iconst_4        
	//   42   60:iushr           
	//   43   61:caload          
	//   44   62:castore         
			j = l + 1;
	//   45   63:iload           4
	//   46   65:iconst_1        
	//   47   66:iadd            
	//   48   67:istore_2        
			ac[l] = ac1[k & 0xf];
	//   49   68:aload           5
	//   50   70:iload           4
	//   51   72:aload           6
	//   52   74:iload_3         
	//   53   75:bipush          15
	//   54   77:iand            
	//   55   78:caload          
	//   56   79:castore         
			ac[j] = ':';
	//   57   80:aload           5
	//   58   82:iload_2         
	//   59   83:bipush          58
	//   60   85:castore         
			i++;
	//   61   86:iload_1         
	//   62   87:iconst_1        
	//   63   88:iadd            
	//   64   89:istore_1        
		}

	//   65   90:iload_2         
	//   66   91:iconst_1        
	//   67   92:iadd            
	//   68   93:istore_2        
	//*  69   94:goto            27
		i = abyte0[abyte0.length - 1] & 0xff;
	//   70   97:aload_0         
	//   71   98:aload_0         
	//   72   99:arraylength     
	//   73  100:iconst_1        
	//   74  101:isub            
	//   75  102:baload          
	//   76  103:sipush          255
	//   77  106:iand            
	//   78  107:istore_1        
		abyte0 = ((byte []) (zzzz));
	//   79  108:getstatic       #27  <Field char[] zzzz>
	//   80  111:astore_0        
		ac[j] = ((char) (abyte0[i >>> 4]));
	//   81  112:aload           5
	//   82  114:iload_2         
	//   83  115:aload_0         
	//   84  116:iload_1         
	//   85  117:iconst_4        
	//   86  118:iushr           
	//   87  119:caload          
	//   88  120:castore         
		ac[j + 1] = ((char) (abyte0[i & 0xf]));
	//   89  121:aload           5
	//   90  123:iload_2         
	//   91  124:iconst_1        
	//   92  125:iadd            
	//   93  126:aload_0         
	//   94  127:iload_1         
	//   95  128:bipush          15
	//   96  130:iand            
	//   97  131:caload          
	//   98  132:castore         
		return new String(ac);
	//   99  133:new             #43  <Class String>
	//  100  136:dup             
	//  101  137:aload           5
	//  102  139:invokespecial   #47  <Method void String(char[])>
	//  103  142:areturn         
	}

	public static String bytesToStringLowercase(byte abyte0[])
	{
		char ac[] = new char[abyte0.length << 1];
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:ishl            
	//    4    4:newarray        char[]
	//    5    6:astore          5
		int i = 0;
	//    6    8:iconst_0        
	//    7    9:istore_1        
		int j = 0;
	//    8   10:iconst_0        
	//    9   11:istore_2        
		for(; i < abyte0.length; i++)
	//*  10   12:iload_1         
	//*  11   13:aload_0         
	//*  12   14:arraylength     
	//*  13   15:icmpge          70
		{
			int k = abyte0[i] & 0xff;
	//   14   18:aload_0         
	//   15   19:iload_1         
	//   16   20:baload          
	//   17   21:sipush          255
	//   18   24:iand            
	//   19   25:istore_3        
			int l = j + 1;
	//   20   26:iload_2         
	//   21   27:iconst_1        
	//   22   28:iadd            
	//   23   29:istore          4
			char ac1[] = zzaaa;
	//   24   31:getstatic       #35  <Field char[] zzaaa>
	//   25   34:astore          6
			ac[j] = ac1[k >>> 4];
	//   26   36:aload           5
	//   27   38:iload_2         
	//   28   39:aload           6
	//   29   41:iload_3         
	//   30   42:iconst_4        
	//   31   43:iushr           
	//   32   44:caload          
	//   33   45:castore         
			j = l + 1;
	//   34   46:iload           4
	//   35   48:iconst_1        
	//   36   49:iadd            
	//   37   50:istore_2        
			ac[l] = ac1[k & 0xf];
	//   38   51:aload           5
	//   39   53:iload           4
	//   40   55:aload           6
	//   41   57:iload_3         
	//   42   58:bipush          15
	//   43   60:iand            
	//   44   61:caload          
	//   45   62:castore         
		}

	//   46   63:iload_1         
	//   47   64:iconst_1        
	//   48   65:iadd            
	//   49   66:istore_1        
	//*  50   67:goto            12
		return new String(ac);
	//   51   70:new             #43  <Class String>
	//   52   73:dup             
	//   53   74:aload           5
	//   54   76:invokespecial   #47  <Method void String(char[])>
	//   55   79:areturn         
	}

	public static String bytesToStringUppercase(byte abyte0[])
	{
		return bytesToStringUppercase(abyte0, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #53  <Method String bytesToStringUppercase(byte[], boolean)>
	//    3    5:areturn         
	}

	public static String bytesToStringUppercase(byte abyte0[], boolean flag)
	{
		int j = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		StringBuilder stringbuilder = new StringBuilder(j << 1);
	//    3    3:new             #55  <Class StringBuilder>
	//    4    6:dup             
	//    5    7:iload_3         
	//    6    8:iconst_1        
	//    7    9:ishl            
	//    8   10:invokespecial   #58  <Method void StringBuilder(int)>
	//    9   13:astore          4
		for(int i = 0; i < j && (!flag || i != j - 1 || (abyte0[i] & 0xff) != 0); i++)
	//*  10   15:iconst_0        
	//*  11   16:istore_2        
	//*  12   17:iload_2         
	//*  13   18:iload_3         
	//*  14   19:icmpge          85
	//*  15   22:iload_1         
	//*  16   23:ifeq            43
	//*  17   26:iload_2         
	//*  18   27:iload_3         
	//*  19   28:iconst_1        
	//*  20   29:isub            
	//*  21   30:icmpne          43
	//*  22   33:aload_0         
	//*  23   34:iload_2         
	//*  24   35:baload          
	//*  25   36:sipush          255
	//*  26   39:iand            
	//*  27   40:ifeq            85
		{
			stringbuilder.append(zzzz[(abyte0[i] & 0xf0) >>> 4]);
	//   28   43:aload           4
	//   29   45:getstatic       #27  <Field char[] zzzz>
	//   30   48:aload_0         
	//   31   49:iload_2         
	//   32   50:baload          
	//   33   51:sipush          240
	//   34   54:iand            
	//   35   55:iconst_4        
	//   36   56:iushr           
	//   37   57:caload          
	//   38   58:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   39   61:pop             
			stringbuilder.append(zzzz[abyte0[i] & 0xf]);
	//   40   62:aload           4
	//   41   64:getstatic       #27  <Field char[] zzzz>
	//   42   67:aload_0         
	//   43   68:iload_2         
	//   44   69:baload          
	//   45   70:bipush          15
	//   46   72:iand            
	//   47   73:caload          
	//   48   74:invokevirtual   #62  <Method StringBuilder StringBuilder.append(char)>
	//   49   77:pop             
		}

	//   50   78:iload_2         
	//   51   79:iconst_1        
	//   52   80:iadd            
	//   53   81:istore_2        
	//*  54   82:goto            17
		return stringbuilder.toString();
	//   55   85:aload           4
	//   56   87:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   57   90:areturn         
	}

	public static byte[] colonDelimitedStringToBytes(String s)
	{
		return stringToBytes(s.replace(":", ""));
	//    0    0:aload_0         
	//    1    1:ldc1            #70  <String ":">
	//    2    3:ldc1            #72  <String "">
	//    3    5:invokevirtual   #76  <Method String String.replace(CharSequence, CharSequence)>
	//    4    8:invokestatic    #79  <Method byte[] stringToBytes(String)>
	//    5   11:areturn         
	}

	public static byte[] stringToBytes(String s)
		throws IllegalArgumentException
	{
		int k = s.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method int String.length()>
	//    2    4:istore_3        
		if(k % 2 == 0)
	//*   3    5:iload_3         
	//*   4    6:iconst_2        
	//*   5    7:irem            
	//*   6    8:ifne            59
		{
			byte abyte0[] = new byte[k / 2];
	//    7   11:iload_3         
	//    8   12:iconst_2        
	//    9   13:idiv            
	//   10   14:newarray        byte[]
	//   11   16:astore          5
			int j;
			for(int i = 0; i < k; i = j)
	//*  12   18:iconst_0        
	//*  13   19:istore_1        
	//*  14   20:iload_1         
	//*  15   21:iload_3         
	//*  16   22:icmpge          56
			{
				int l = i / 2;
	//   17   25:iload_1         
	//   18   26:iconst_2        
	//   19   27:idiv            
	//   20   28:istore          4
				j = i + 2;
	//   21   30:iload_1         
	//   22   31:iconst_2        
	//   23   32:iadd            
	//   24   33:istore_2        
				abyte0[l] = (byte)Integer.parseInt(s.substring(i, j), 16);
	//   25   34:aload           5
	//   26   36:iload           4
	//   27   38:aload_0         
	//   28   39:iload_1         
	//   29   40:iload_2         
	//   30   41:invokevirtual   #89  <Method String String.substring(int, int)>
	//   31   44:bipush          16
	//   32   46:invokestatic    #95  <Method int Integer.parseInt(String, int)>
	//   33   49:int2byte        
	//   34   50:bastore         
			}

	//   35   51:iload_2         
	//   36   52:istore_1        
	//*  37   53:goto            20
			return abyte0;
	//   38   56:aload           5
	//   39   58:areturn         
		} else
		{
			throw new IllegalArgumentException("Hex string has odd number of characters");
	//   40   59:new             #81  <Class IllegalArgumentException>
	//   41   62:dup             
	//   42   63:ldc1            #97  <String "Hex string has odd number of characters">
	//   43   65:invokespecial   #100 <Method void IllegalArgumentException(String)>
	//   44   68:athrow          
		}
	}

	private static final char zzaaa[] = {
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
		'a', 'b', 'c', 'd', 'e', 'f'
	};
	private static final char zzzz[] = {
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
		'A', 'B', 'C', 'D', 'E', 'F'
	};

	static 
	{
	//    0    0:bipush          16
	//    1    2:newarray        char[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #10  <Int 48>
	//    5    8:castore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #11  <Int 49>
	//    9   13:castore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #12  <Int 50>
	//   13   18:castore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #13  <Int 51>
	//   17   23:castore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #14  <Int 52>
	//   21   28:castore         
	//   22   29:dup             
	//   23   30:iconst_5        
	//   24   31:ldc1            #15  <Int 53>
	//   25   33:castore         
	//   26   34:dup             
	//   27   35:bipush          6
	//   28   37:ldc1            #16  <Int 54>
	//   29   39:castore         
	//   30   40:dup             
	//   31   41:bipush          7
	//   32   43:ldc1            #17  <Int 55>
	//   33   45:castore         
	//   34   46:dup             
	//   35   47:bipush          8
	//   36   49:ldc1            #18  <Int 56>
	//   37   51:castore         
	//   38   52:dup             
	//   39   53:bipush          9
	//   40   55:ldc1            #19  <Int 57>
	//   41   57:castore         
	//   42   58:dup             
	//   43   59:bipush          10
	//   44   61:ldc1            #20  <Int 65>
	//   45   63:castore         
	//   46   64:dup             
	//   47   65:bipush          11
	//   48   67:ldc1            #21  <Int 66>
	//   49   69:castore         
	//   50   70:dup             
	//   51   71:bipush          12
	//   52   73:ldc1            #22  <Int 67>
	//   53   75:castore         
	//   54   76:dup             
	//   55   77:bipush          13
	//   56   79:ldc1            #23  <Int 68>
	//   57   81:castore         
	//   58   82:dup             
	//   59   83:bipush          14
	//   60   85:ldc1            #24  <Int 69>
	//   61   87:castore         
	//   62   88:dup             
	//   63   89:bipush          15
	//   64   91:ldc1            #25  <Int 70>
	//   65   93:castore         
	//   66   94:putstatic       #27  <Field char[] zzzz>
	//   67   97:bipush          16
	//   68   99:newarray        char[]
	//   69  101:dup             
	//   70  102:iconst_0        
	//   71  103:ldc1            #10  <Int 48>
	//   72  105:castore         
	//   73  106:dup             
	//   74  107:iconst_1        
	//   75  108:ldc1            #11  <Int 49>
	//   76  110:castore         
	//   77  111:dup             
	//   78  112:iconst_2        
	//   79  113:ldc1            #12  <Int 50>
	//   80  115:castore         
	//   81  116:dup             
	//   82  117:iconst_3        
	//   83  118:ldc1            #13  <Int 51>
	//   84  120:castore         
	//   85  121:dup             
	//   86  122:iconst_4        
	//   87  123:ldc1            #14  <Int 52>
	//   88  125:castore         
	//   89  126:dup             
	//   90  127:iconst_5        
	//   91  128:ldc1            #15  <Int 53>
	//   92  130:castore         
	//   93  131:dup             
	//   94  132:bipush          6
	//   95  134:ldc1            #16  <Int 54>
	//   96  136:castore         
	//   97  137:dup             
	//   98  138:bipush          7
	//   99  140:ldc1            #17  <Int 55>
	//  100  142:castore         
	//  101  143:dup             
	//  102  144:bipush          8
	//  103  146:ldc1            #18  <Int 56>
	//  104  148:castore         
	//  105  149:dup             
	//  106  150:bipush          9
	//  107  152:ldc1            #19  <Int 57>
	//  108  154:castore         
	//  109  155:dup             
	//  110  156:bipush          10
	//  111  158:ldc1            #28  <Int 97>
	//  112  160:castore         
	//  113  161:dup             
	//  114  162:bipush          11
	//  115  164:ldc1            #29  <Int 98>
	//  116  166:castore         
	//  117  167:dup             
	//  118  168:bipush          12
	//  119  170:ldc1            #30  <Int 99>
	//  120  172:castore         
	//  121  173:dup             
	//  122  174:bipush          13
	//  123  176:ldc1            #31  <Int 100>
	//  124  178:castore         
	//  125  179:dup             
	//  126  180:bipush          14
	//  127  182:ldc1            #32  <Int 101>
	//  128  184:castore         
	//  129  185:dup             
	//  130  186:bipush          15
	//  131  188:ldc1            #33  <Int 102>
	//  132  190:castore         
	//  133  191:putstatic       #35  <Field char[] zzaaa>
	//* 134  194:return          
	}
}
