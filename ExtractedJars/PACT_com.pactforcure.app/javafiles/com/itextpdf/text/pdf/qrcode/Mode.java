// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			Version

public final class Mode
{

	private Mode(int ai[], int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		characterCountBitsForVersions = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #58  <Field int[] characterCountBitsForVersions>
		bits = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #60  <Field int bits>
		name = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #62  <Field String name>
	//   11   19:return          
	}

	public static Mode forBits(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 9: default 56
	//	               0 64
	//	               1 68
	//	               2 72
	//	               3 76
	//	               4 80
	//	               5 84
	//	               6 56
	//	               7 88
	//	               8 92
	//	               9 96
		case 6: // '\006'
		default:
			throw new IllegalArgumentException();
	//    2   56:new             #66  <Class IllegalArgumentException>
	//    3   59:dup             
	//    4   60:invokespecial   #67  <Method void IllegalArgumentException()>
	//    5   63:athrow          

		case 0: // '\0'
			return TERMINATOR;
	//    6   64:getstatic       #29  <Field Mode TERMINATOR>
	//    7   67:areturn         

		case 1: // '\001'
			return NUMERIC;
	//    8   68:getstatic       #32  <Field Mode NUMERIC>
	//    9   71:areturn         

		case 2: // '\002'
			return ALPHANUMERIC;
	//   10   72:getstatic       #35  <Field Mode ALPHANUMERIC>
	//   11   75:areturn         

		case 3: // '\003'
			return STRUCTURED_APPEND;
	//   12   76:getstatic       #38  <Field Mode STRUCTURED_APPEND>
	//   13   79:areturn         

		case 4: // '\004'
			return BYTE;
	//   14   80:getstatic       #41  <Field Mode BYTE>
	//   15   83:areturn         

		case 5: // '\005'
			return FNC1_FIRST_POSITION;
	//   16   84:getstatic       #50  <Field Mode FNC1_FIRST_POSITION>
	//   17   87:areturn         

		case 7: // '\007'
			return ECI;
	//   18   88:getstatic       #44  <Field Mode ECI>
	//   19   91:areturn         

		case 8: // '\b'
			return KANJI;
	//   20   92:getstatic       #47  <Field Mode KANJI>
	//   21   95:areturn         

		case 9: // '\t'
			return FNC1_SECOND_POSITION;
	//   22   96:getstatic       #53  <Field Mode FNC1_SECOND_POSITION>
	//   23   99:areturn         
		}
	}

	public int getBits()
	{
		return bits;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field int bits>
	//    2    4:ireturn         
	}

	public int getCharacterCountBits(Version version)
	{
		if(characterCountBitsForVersions == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field int[] characterCountBitsForVersions>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("Character count doesn't apply to this mode");
	//    3    7:new             #66  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #73  <String "Character count doesn't apply to this mode">
	//    6   13:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		int i = version.getVersionNumber();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #81  <Method int Version.getVersionNumber()>
	//   10   21:istore_2        
		if(i <= 9)
	//*  11   22:iload_2         
	//*  12   23:bipush          9
	//*  13   25:icmpgt          37
			i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_2        
		else
	//*  16   30:aload_0         
	//*  17   31:getfield        #58  <Field int[] characterCountBitsForVersions>
	//*  18   34:iload_2         
	//*  19   35:iaload          
	//*  20   36:ireturn         
		if(i <= 26)
	//*  21   37:iload_2         
	//*  22   38:bipush          26
	//*  23   40:icmpgt          48
			i = 1;
	//   24   43:iconst_1        
	//   25   44:istore_2        
		else
	//*  26   45:goto            30
			i = 2;
	//   27   48:iconst_2        
	//   28   49:istore_2        
		return characterCountBitsForVersions[i];
	//*  29   50:goto            30
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String name>
	//    2    4:areturn         
	}

	public String toString()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String name>
	//    2    4:areturn         
	}

	public static final Mode ALPHANUMERIC = new Mode(new int[] {
		9, 11, 13
	}, 2, "ALPHANUMERIC");
	public static final Mode BYTE = new Mode(new int[] {
		8, 16, 16
	}, 4, "BYTE");
	public static final Mode ECI = new Mode(((int []) (null)), 7, "ECI");
	public static final Mode FNC1_FIRST_POSITION = new Mode(((int []) (null)), 5, "FNC1_FIRST_POSITION");
	public static final Mode FNC1_SECOND_POSITION = new Mode(((int []) (null)), 9, "FNC1_SECOND_POSITION");
	public static final Mode KANJI = new Mode(new int[] {
		8, 10, 12
	}, 8, "KANJI");
	public static final Mode NUMERIC = new Mode(new int[] {
		10, 12, 14
	}, 1, "NUMERIC");
	public static final Mode STRUCTURED_APPEND = new Mode(new int[] {
		0, 0, 0
	}, 3, "STRUCTURED_APPEND");
	public static final Mode TERMINATOR = new Mode(new int[] {
		0, 0, 0
	}, 0, "TERMINATOR");
	private final int bits;
	private final int characterCountBitsForVersions[];
	private final String name;

	static 
	{
	//    0    0:new             #2   <Class Mode>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:newarray        int[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:iconst_0        
	//    7   10:iastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:iconst_0        
	//   11   14:iastore         
	//   12   15:dup             
	//   13   16:iconst_2        
	//   14   17:iconst_0        
	//   15   18:iastore         
	//   16   19:iconst_0        
	//   17   20:ldc1            #23  <String "TERMINATOR">
	//   18   22:invokespecial   #27  <Method void Mode(int[], int, String)>
	//   19   25:putstatic       #29  <Field Mode TERMINATOR>
	//   20   28:new             #2   <Class Mode>
	//   21   31:dup             
	//   22   32:iconst_3        
	//   23   33:newarray        int[]
	//   24   35:dup             
	//   25   36:iconst_0        
	//   26   37:bipush          10
	//   27   39:iastore         
	//   28   40:dup             
	//   29   41:iconst_1        
	//   30   42:bipush          12
	//   31   44:iastore         
	//   32   45:dup             
	//   33   46:iconst_2        
	//   34   47:bipush          14
	//   35   49:iastore         
	//   36   50:iconst_1        
	//   37   51:ldc1            #30  <String "NUMERIC">
	//   38   53:invokespecial   #27  <Method void Mode(int[], int, String)>
	//   39   56:putstatic       #32  <Field Mode NUMERIC>
	//   40   59:new             #2   <Class Mode>
	//   41   62:dup             
	//   42   63:iconst_3        
	//   43   64:newarray        int[]
	//   44   66:dup             
	//   45   67:iconst_0        
	//   46   68:bipush          9
	//   47   70:iastore         
	//   48   71:dup             
	//   49   72:iconst_1        
	//   50   73:bipush          11
	//   51   75:iastore         
	//   52   76:dup             
	//   53   77:iconst_2        
	//   54   78:bipush          13
	//   55   80:iastore         
	//   56   81:iconst_2        
	//   57   82:ldc1            #33  <String "ALPHANUMERIC">
	//   58   84:invokespecial   #27  <Method void Mode(int[], int, String)>
	//   59   87:putstatic       #35  <Field Mode ALPHANUMERIC>
	//   60   90:new             #2   <Class Mode>
	//   61   93:dup             
	//   62   94:iconst_3        
	//   63   95:newarray        int[]
	//   64   97:dup             
	//   65   98:iconst_0        
	//   66   99:iconst_0        
	//   67  100:iastore         
	//   68  101:dup             
	//   69  102:iconst_1        
	//   70  103:iconst_0        
	//   71  104:iastore         
	//   72  105:dup             
	//   73  106:iconst_2        
	//   74  107:iconst_0        
	//   75  108:iastore         
	//   76  109:iconst_3        
	//   77  110:ldc1            #36  <String "STRUCTURED_APPEND">
	//   78  112:invokespecial   #27  <Method void Mode(int[], int, String)>
	//   79  115:putstatic       #38  <Field Mode STRUCTURED_APPEND>
	//   80  118:new             #2   <Class Mode>
	//   81  121:dup             
	//   82  122:iconst_3        
	//   83  123:newarray        int[]
	//   84  125:dup             
	//   85  126:iconst_0        
	//   86  127:bipush          8
	//   87  129:iastore         
	//   88  130:dup             
	//   89  131:iconst_1        
	//   90  132:bipush          16
	//   91  134:iastore         
	//   92  135:dup             
	//   93  136:iconst_2        
	//   94  137:bipush          16
	//   95  139:iastore         
	//   96  140:iconst_4        
	//   97  141:ldc1            #39  <String "BYTE">
	//   98  143:invokespecial   #27  <Method void Mode(int[], int, String)>
	//   99  146:putstatic       #41  <Field Mode BYTE>
	//  100  149:new             #2   <Class Mode>
	//  101  152:dup             
	//  102  153:aconst_null     
	//  103  154:bipush          7
	//  104  156:ldc1            #42  <String "ECI">
	//  105  158:invokespecial   #27  <Method void Mode(int[], int, String)>
	//  106  161:putstatic       #44  <Field Mode ECI>
	//  107  164:new             #2   <Class Mode>
	//  108  167:dup             
	//  109  168:iconst_3        
	//  110  169:newarray        int[]
	//  111  171:dup             
	//  112  172:iconst_0        
	//  113  173:bipush          8
	//  114  175:iastore         
	//  115  176:dup             
	//  116  177:iconst_1        
	//  117  178:bipush          10
	//  118  180:iastore         
	//  119  181:dup             
	//  120  182:iconst_2        
	//  121  183:bipush          12
	//  122  185:iastore         
	//  123  186:bipush          8
	//  124  188:ldc1            #45  <String "KANJI">
	//  125  190:invokespecial   #27  <Method void Mode(int[], int, String)>
	//  126  193:putstatic       #47  <Field Mode KANJI>
	//  127  196:new             #2   <Class Mode>
	//  128  199:dup             
	//  129  200:aconst_null     
	//  130  201:iconst_5        
	//  131  202:ldc1            #48  <String "FNC1_FIRST_POSITION">
	//  132  204:invokespecial   #27  <Method void Mode(int[], int, String)>
	//  133  207:putstatic       #50  <Field Mode FNC1_FIRST_POSITION>
	//  134  210:new             #2   <Class Mode>
	//  135  213:dup             
	//  136  214:aconst_null     
	//  137  215:bipush          9
	//  138  217:ldc1            #51  <String "FNC1_SECOND_POSITION">
	//  139  219:invokespecial   #27  <Method void Mode(int[], int, String)>
	//  140  222:putstatic       #53  <Field Mode FNC1_SECOND_POSITION>
	//* 141  225:return          
	}
}
