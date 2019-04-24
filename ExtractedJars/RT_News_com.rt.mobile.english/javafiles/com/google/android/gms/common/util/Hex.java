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
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		char ac[] = new char[abyte0.length * 3 - 1];
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:iconst_3        
	//   12   18:imul            
	//   13   19:iconst_1        
	//   14   20:isub            
	//   15   21:newarray        char[]
	//   16   23:astore          5
		int j;
		for(j = 0; i < abyte0.length - 1; j++)
	//*  17   25:iconst_0        
	//*  18   26:istore_2        
	//*  19   27:iload_1         
	//*  20   28:aload_0         
	//*  21   29:arraylength     
	//*  22   30:iconst_1        
	//*  23   31:isub            
	//*  24   32:icmpge          94
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
			ac[j] = zzaaa[k >>> 4];
	//   35   48:aload           5
	//   36   50:iload_2         
	//   37   51:getstatic       #35  <Field char[] zzaaa>
	//   38   54:iload_3         
	//   39   55:iconst_4        
	//   40   56:iushr           
	//   41   57:caload          
	//   42   58:castore         
			j = l + 1;
	//   43   59:iload           4
	//   44   61:iconst_1        
	//   45   62:iadd            
	//   46   63:istore_2        
			ac[l] = zzaaa[k & 0xf];
	//   47   64:aload           5
	//   48   66:iload           4
	//   49   68:getstatic       #35  <Field char[] zzaaa>
	//   50   71:iload_3         
	//   51   72:bipush          15
	//   52   74:iand            
	//   53   75:caload          
	//   54   76:castore         
			ac[j] = ':';
	//   55   77:aload           5
	//   56   79:iload_2         
	//   57   80:bipush          58
	//   58   82:castore         
			i++;
	//   59   83:iload_1         
	//   60   84:iconst_1        
	//   61   85:iadd            
	//   62   86:istore_1        
		}

	//   63   87:iload_2         
	//   64   88:iconst_1        
	//   65   89:iadd            
	//   66   90:istore_2        
	//*  67   91:goto            27
		i = abyte0[abyte0.length - 1] & 0xff;
	//   68   94:aload_0         
	//   69   95:aload_0         
	//   70   96:arraylength     
	//   71   97:iconst_1        
	//   72   98:isub            
	//   73   99:baload          
	//   74  100:sipush          255
	//   75  103:iand            
	//   76  104:istore_1        
		ac[j] = zzaaa[i >>> 4];
	//   77  105:aload           5
	//   78  107:iload_2         
	//   79  108:getstatic       #35  <Field char[] zzaaa>
	//   80  111:iload_1         
	//   81  112:iconst_4        
	//   82  113:iushr           
	//   83  114:caload          
	//   84  115:castore         
		ac[j + 1] = zzaaa[i & 0xf];
	//   85  116:aload           5
	//   86  118:iload_2         
	//   87  119:iconst_1        
	//   88  120:iadd            
	//   89  121:getstatic       #35  <Field char[] zzaaa>
	//   90  124:iload_1         
	//   91  125:bipush          15
	//   92  127:iand            
	//   93  128:caload          
	//   94  129:castore         
		return new String(ac);
	//   95  130:new             #43  <Class String>
	//   96  133:dup             
	//   97  134:aload           5
	//   98  136:invokespecial   #47  <Method void String(char[])>
	//   99  139:areturn         
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
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		char ac[] = new char[abyte0.length * 3 - 1];
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:iconst_3        
	//   12   18:imul            
	//   13   19:iconst_1        
	//   14   20:isub            
	//   15   21:newarray        char[]
	//   16   23:astore          5
		int j;
		for(j = 0; i < abyte0.length - 1; j++)
	//*  17   25:iconst_0        
	//*  18   26:istore_2        
	//*  19   27:iload_1         
	//*  20   28:aload_0         
	//*  21   29:arraylength     
	//*  22   30:iconst_1        
	//*  23   31:isub            
	//*  24   32:icmpge          94
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
			ac[j] = zzzz[k >>> 4];
	//   35   48:aload           5
	//   36   50:iload_2         
	//   37   51:getstatic       #27  <Field char[] zzzz>
	//   38   54:iload_3         
	//   39   55:iconst_4        
	//   40   56:iushr           
	//   41   57:caload          
	//   42   58:castore         
			j = l + 1;
	//   43   59:iload           4
	//   44   61:iconst_1        
	//   45   62:iadd            
	//   46   63:istore_2        
			ac[l] = zzzz[k & 0xf];
	//   47   64:aload           5
	//   48   66:iload           4
	//   49   68:getstatic       #27  <Field char[] zzzz>
	//   50   71:iload_3         
	//   51   72:bipush          15
	//   52   74:iand            
	//   53   75:caload          
	//   54   76:castore         
			ac[j] = ':';
	//   55   77:aload           5
	//   56   79:iload_2         
	//   57   80:bipush          58
	//   58   82:castore         
			i++;
	//   59   83:iload_1         
	//   60   84:iconst_1        
	//   61   85:iadd            
	//   62   86:istore_1        
		}

	//   63   87:iload_2         
	//   64   88:iconst_1        
	//   65   89:iadd            
	//   66   90:istore_2        
	//*  67   91:goto            27
		i = abyte0[abyte0.length - 1] & 0xff;
	//   68   94:aload_0         
	//   69   95:aload_0         
	//   70   96:arraylength     
	//   71   97:iconst_1        
	//   72   98:isub            
	//   73   99:baload          
	//   74  100:sipush          255
	//   75  103:iand            
	//   76  104:istore_1        
		ac[j] = zzzz[i >>> 4];
	//   77  105:aload           5
	//   78  107:iload_2         
	//   79  108:getstatic       #27  <Field char[] zzzz>
	//   80  111:iload_1         
	//   81  112:iconst_4        
	//   82  113:iushr           
	//   83  114:caload          
	//   84  115:castore         
		ac[j + 1] = zzzz[i & 0xf];
	//   85  116:aload           5
	//   86  118:iload_2         
	//   87  119:iconst_1        
	//   88  120:iadd            
	//   89  121:getstatic       #27  <Field char[] zzzz>
	//   90  124:iload_1         
	//   91  125:bipush          15
	//   92  127:iand            
	//   93  128:caload          
	//   94  129:castore         
		return new String(ac);
	//   95  130:new             #43  <Class String>
	//   96  133:dup             
	//   97  134:aload           5
	//   98  136:invokespecial   #47  <Method void String(char[])>
	//   99  139:areturn         
	}

	public static String bytesToStringLowercase(byte abyte0[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		char ac[] = new char[abyte0.length << 1];
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:iconst_1        
	//    5    5:ishl            
	//    6    6:newarray        char[]
	//    7    8:astore          5
		int j = 0;
	//    8   10:iconst_0        
	//    9   11:istore_2        
		for(; i < abyte0.length; i++)
	//*  10   12:iload_1         
	//*  11   13:aload_0         
	//*  12   14:arraylength     
	//*  13   15:icmpge          67
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
			ac[j] = zzaaa[k >>> 4];
	//   24   31:aload           5
	//   25   33:iload_2         
	//   26   34:getstatic       #35  <Field char[] zzaaa>
	//   27   37:iload_3         
	//   28   38:iconst_4        
	//   29   39:iushr           
	//   30   40:caload          
	//   31   41:castore         
			j = l + 1;
	//   32   42:iload           4
	//   33   44:iconst_1        
	//   34   45:iadd            
	//   35   46:istore_2        
			ac[l] = zzaaa[k & 0xf];
	//   36   47:aload           5
	//   37   49:iload           4
	//   38   51:getstatic       #35  <Field char[] zzaaa>
	//   39   54:iload_3         
	//   40   55:bipush          15
	//   41   57:iand            
	//   42   58:caload          
	//   43   59:castore         
		}

	//   44   60:iload_1         
	//   45   61:iconst_1        
	//   46   62:iadd            
	//   47   63:istore_1        
	//*  48   64:goto            12
		return new String(ac);
	//   49   67:new             #43  <Class String>
	//   50   70:dup             
	//   51   71:aload           5
	//   52   73:invokespecial   #47  <Method void String(char[])>
	//   53   76:areturn         
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
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j = abyte0.length;
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:istore_3        
		StringBuilder stringbuilder = new StringBuilder(j << 1);
	//    5    5:new             #55  <Class StringBuilder>
	//    6    8:dup             
	//    7    9:iload_3         
	//    8   10:iconst_1        
	//    9   11:ishl            
	//   10   12:invokespecial   #58  <Method void StringBuilder(int)>
	//   11   15:astore          4
		for(; i < j && (!flag || i != j - 1 || (abyte0[i] & 0xff) != 0); i++)
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
		if(k % 2 != 0)
	//*   3    5:iload_3         
	//*   4    6:iconst_2        
	//*   5    7:irem            
	//*   6    8:ifeq            21
			throw new IllegalArgumentException("Hex string has odd number of characters");
	//    7   11:new             #81  <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:ldc1            #87  <String "Hex string has odd number of characters">
	//   10   17:invokespecial   #90  <Method void IllegalArgumentException(String)>
	//   11   20:athrow          
		byte abyte0[] = new byte[k / 2];
	//   12   21:iload_3         
	//   13   22:iconst_2        
	//   14   23:idiv            
	//   15   24:newarray        byte[]
	//   16   26:astore          5
		int j;
		for(int i = 0; i < k; i = j)
	//*  17   28:iconst_0        
	//*  18   29:istore_1        
	//*  19   30:iload_1         
	//*  20   31:iload_3         
	//*  21   32:icmpge          66
		{
			int l = i / 2;
	//   22   35:iload_1         
	//   23   36:iconst_2        
	//   24   37:idiv            
	//   25   38:istore          4
			j = i + 2;
	//   26   40:iload_1         
	//   27   41:iconst_2        
	//   28   42:iadd            
	//   29   43:istore_2        
			abyte0[l] = (byte)Integer.parseInt(s.substring(i, j), 16);
	//   30   44:aload           5
	//   31   46:iload           4
	//   32   48:aload_0         
	//   33   49:iload_1         
	//   34   50:iload_2         
	//   35   51:invokevirtual   #94  <Method String String.substring(int, int)>
	//   36   54:bipush          16
	//   37   56:invokestatic    #100 <Method int Integer.parseInt(String, int)>
	//   38   59:int2byte        
	//   39   60:bastore         
		}

	//   40   61:iload_2         
	//   41   62:istore_1        
	//*  42   63:goto            30
		return abyte0;
	//   43   66:aload           5
	//   44   68:areturn         
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
