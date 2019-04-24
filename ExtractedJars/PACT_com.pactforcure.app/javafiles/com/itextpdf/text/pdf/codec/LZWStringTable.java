// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import java.io.PrintStream;

public class LZWStringTable
{

	public LZWStringTable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		strChr_ = new byte[4096];
	//    2    4:aload_0         
	//    3    5:sipush          4096
	//    4    8:newarray        byte[]
	//    5   10:putfield        #33  <Field byte[] strChr_>
		strNxt_ = new short[4096];
	//    6   13:aload_0         
	//    7   14:sipush          4096
	//    8   17:newarray        short[]
	//    9   19:putfield        #35  <Field short[] strNxt_>
		strLen_ = new int[4096];
	//   10   22:aload_0         
	//   11   23:sipush          4096
	//   12   26:newarray        int[]
	//   13   28:putfield        #37  <Field int[] strLen_>
		strHsh_ = new short[9973];
	//   14   31:aload_0         
	//   15   32:sipush          9973
	//   16   35:newarray        short[]
	//   17   37:putfield        #39  <Field short[] strHsh_>
	//   18   40:return          
	}

	public static int Hash(short word0, byte byte0)
	{
		return (((short)(byte0 << 8) ^ word0) & 0xffff) % 9973;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:ishl            
	//    3    4:int2short       
	//    4    5:iload_0         
	//    5    6:ixor            
	//    6    7:ldc1            #43  <Int 65535>
	//    7    9:iand            
	//    8   10:sipush          9973
	//    9   13:irem            
	//   10   14:ireturn         
	}

	public int AddCharString(short word0, byte byte0)
	{
		if(numStrings_ >= 4096)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field short numStrings_>
	//*   2    4:sipush          4096
	//*   3    7:icmplt          13
			return 65535;
	//    4   10:ldc1            #43  <Int 65535>
	//    5   12:ireturn         
		int i;
		for(i = Hash(word0, byte0); strHsh_[i] != -1; i = (i + 2039) % 9973);
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:invokestatic    #48  <Method int Hash(short, byte)>
	//    9   18:istore_3        
	//   10   19:aload_0         
	//   11   20:getfield        #39  <Field short[] strHsh_>
	//   12   23:iload_3         
	//   13   24:saload          
	//   14   25:iconst_m1       
	//   15   26:icmpeq          42
	//   16   29:iload_3         
	//   17   30:sipush          2039
	//   18   33:iadd            
	//   19   34:sipush          9973
	//   20   37:irem            
	//   21   38:istore_3        
	//*  22   39:goto            19
		strHsh_[i] = numStrings_;
	//   23   42:aload_0         
	//   24   43:getfield        #39  <Field short[] strHsh_>
	//   25   46:iload_3         
	//   26   47:aload_0         
	//   27   48:getfield        #46  <Field short numStrings_>
	//   28   51:sastore         
		strChr_[numStrings_] = byte0;
	//   29   52:aload_0         
	//   30   53:getfield        #33  <Field byte[] strChr_>
	//   31   56:aload_0         
	//   32   57:getfield        #46  <Field short numStrings_>
	//   33   60:iload_2         
	//   34   61:bastore         
		if(word0 == -1)
	//*  35   62:iload_1         
	//*  36   63:iconst_m1       
	//*  37   64:icmpne          102
		{
			strNxt_[numStrings_] = -1;
	//   38   67:aload_0         
	//   39   68:getfield        #35  <Field short[] strNxt_>
	//   40   71:aload_0         
	//   41   72:getfield        #46  <Field short numStrings_>
	//   42   75:iconst_m1       
	//   43   76:sastore         
			strLen_[numStrings_] = 1;
	//   44   77:aload_0         
	//   45   78:getfield        #37  <Field int[] strLen_>
	//   46   81:aload_0         
	//   47   82:getfield        #46  <Field short numStrings_>
	//   48   85:iconst_1        
	//   49   86:iastore         
		} else
	//*  50   87:aload_0         
	//*  51   88:getfield        #46  <Field short numStrings_>
	//*  52   91:istore_3        
	//*  53   92:aload_0         
	//*  54   93:iload_3         
	//*  55   94:iconst_1        
	//*  56   95:iadd            
	//*  57   96:int2short       
	//*  58   97:putfield        #46  <Field short numStrings_>
	//*  59  100:iload_3         
	//*  60  101:ireturn         
		{
			strNxt_[numStrings_] = word0;
	//   61  102:aload_0         
	//   62  103:getfield        #35  <Field short[] strNxt_>
	//   63  106:aload_0         
	//   64  107:getfield        #46  <Field short numStrings_>
	//   65  110:iload_1         
	//   66  111:sastore         
			strLen_[numStrings_] = strLen_[word0] + 1;
	//   67  112:aload_0         
	//   68  113:getfield        #37  <Field int[] strLen_>
	//   69  116:aload_0         
	//   70  117:getfield        #46  <Field short numStrings_>
	//   71  120:aload_0         
	//   72  121:getfield        #37  <Field int[] strLen_>
	//   73  124:iload_1         
	//   74  125:iaload          
	//   75  126:iconst_1        
	//   76  127:iadd            
	//   77  128:iastore         
		}
		i = ((int) (numStrings_));
		numStrings_ = (short)(i + 1);
		return i;
	//*  78  129:goto            87
	}

	public void ClearTable(int i)
	{
		numStrings_ = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #46  <Field short numStrings_>
		for(int j = 0; j < 9973; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:sipush          9973
	//*   7   11:icmpge          28
			strHsh_[j] = -1;
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field short[] strHsh_>
	//   10   18:iload_2         
	//   11   19:iconst_m1       
	//   12   20:sastore         

	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:istore_2        
	//*  17   25:goto            7
		for(int k = 0; k < (1 << i) + 2; k++)
	//*  18   28:iconst_0        
	//*  19   29:istore_2        
	//*  20   30:iload_2         
	//*  21   31:iconst_1        
	//*  22   32:iload_1         
	//*  23   33:ishl            
	//*  24   34:iconst_2        
	//*  25   35:iadd            
	//*  26   36:icmpge          54
			AddCharString((short)-1, (byte)k);
	//   27   39:aload_0         
	//   28   40:iconst_m1       
	//   29   41:iload_2         
	//   30   42:int2byte        
	//   31   43:invokevirtual   #52  <Method int AddCharString(short, byte)>
	//   32   46:pop             

	//   33   47:iload_2         
	//   34   48:iconst_1        
	//   35   49:iadd            
	//   36   50:istore_2        
	//*  37   51:goto            30
	//   38   54:return          
	}

	public short FindCharString(short word0, byte byte0)
	{
		byte byte1 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          4
		if(word0 != -1) goto _L2; else goto _L1
	//    2    3:iload_1         
	//    3    4:iconst_m1       
	//    4    5:icmpne          17
_L1:
		short word1 = (short)(byte0 & 0xff);
	//    5    8:iload_2         
	//    6    9:sipush          255
	//    7   12:iand            
	//    8   13:int2short       
	//    9   14:istore_3        
_L4:
		return word1;
	//   10   15:iload_3         
	//   11   16:ireturn         
_L2:
		int i = Hash(word0, byte0);
	//   12   17:iload_1         
	//   13   18:iload_2         
	//   14   19:invokestatic    #48  <Method int Hash(short, byte)>
	//   15   22:istore          5
		do
		{
			int j = ((int) (strHsh_[i]));
	//   16   24:aload_0         
	//   17   25:getfield        #39  <Field short[] strHsh_>
	//   18   28:iload           5
	//   19   30:saload          
	//   20   31:istore          6
			word1 = ((short) (byte1));
	//   21   33:iload           4
	//   22   35:istore_3        
			if(j == -1)
				continue;
	//   23   36:iload           6
	//   24   38:iconst_m1       
	//   25   39:icmpeq          15
			if(strNxt_[j] == word0 && strChr_[j] == byte0)
	//*  26   42:aload_0         
	//*  27   43:getfield        #35  <Field short[] strNxt_>
	//*  28   46:iload           6
	//*  29   48:saload          
	//*  30   49:iload_1         
	//*  31   50:icmpne          68
	//*  32   53:aload_0         
	//*  33   54:getfield        #33  <Field byte[] strChr_>
	//*  34   57:iload           6
	//*  35   59:baload          
	//*  36   60:iload_2         
	//*  37   61:icmpne          68
				return (short)j;
	//   38   64:iload           6
	//   39   66:int2short       
	//   40   67:ireturn         
			i = (i + 2039) % 9973;
	//   41   68:iload           5
	//   42   70:sipush          2039
	//   43   73:iadd            
	//   44   74:sipush          9973
	//   45   77:irem            
	//   46   78:istore          5
		} while(true);
	//   47   80:goto            24
		if(true) goto _L4; else goto _L3
_L3:
	}

	public void dump(PrintStream printstream)
	{
		for(int i = 258; i < numStrings_; i++)
	//*   0    0:sipush          258
	//*   1    3:istore_2        
	//*   2    4:iload_2         
	//*   3    5:aload_0         
	//*   4    6:getfield        #46  <Field short numStrings_>
	//*   5    9:icmpge          94
			printstream.println((new StringBuilder()).append(" strNxt_[").append(i).append("] = ").append(((int) (strNxt_[i]))).append(" strChr_ ").append(Integer.toHexString(strChr_[i] & 0xff)).append(" strLen_ ").append(Integer.toHexString(strLen_[i])).toString());
	//    6   12:aload_1         
	//    7   13:new             #58  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #59  <Method void StringBuilder()>
	//   10   20:ldc1            #61  <String " strNxt_[">
	//   11   22:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:iload_2         
	//   13   26:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   14   29:ldc1            #70  <String "] = ">
	//   15   31:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:aload_0         
	//   17   35:getfield        #35  <Field short[] strNxt_>
	//   18   38:iload_2         
	//   19   39:saload          
	//   20   40:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   21   43:ldc1            #72  <String " strChr_ ">
	//   22   45:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:aload_0         
	//   24   49:getfield        #33  <Field byte[] strChr_>
	//   25   52:iload_2         
	//   26   53:baload          
	//   27   54:sipush          255
	//   28   57:iand            
	//   29   58:invokestatic    #78  <Method String Integer.toHexString(int)>
	//   30   61:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:ldc1            #80  <String " strLen_ ">
	//   32   66:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   33   69:aload_0         
	//   34   70:getfield        #37  <Field int[] strLen_>
	//   35   73:iload_2         
	//   36   74:iaload          
	//   37   75:invokestatic    #78  <Method String Integer.toHexString(int)>
	//   38   78:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   39   81:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   40   84:invokevirtual   #90  <Method void PrintStream.println(String)>

	//   41   87:iload_2         
	//   42   88:iconst_1        
	//   43   89:iadd            
	//   44   90:istore_2        
	//*  45   91:goto            4
	//   46   94:return          
	}

	public int expandCode(byte abyte0[], int i, short word0, int j)
	{
		int k = j;
	//    0    0:iload           4
	//    1    2:istore          5
		if(i == -2)
	//*   2    4:iload_2         
	//*   3    5:bipush          -2
	//*   4    7:icmpne          23
		{
			k = j;
	//    5   10:iload           4
	//    6   12:istore          5
			if(j == 1)
	//*   7   14:iload           4
	//*   8   16:iconst_1        
	//*   9   17:icmpne          23
				k = 0;
	//   10   20:iconst_0        
	//   11   21:istore          5
		}
		if(word0 == -1 || k == strLen_[word0])
	//*  12   23:iload_3         
	//*  13   24:iconst_m1       
	//*  14   25:icmpeq          39
	//*  15   28:iload           5
	//*  16   30:aload_0         
	//*  17   31:getfield        #37  <Field int[] strLen_>
	//*  18   34:iload_3         
	//*  19   35:iaload          
	//*  20   36:icmpne          43
		{
			i = 0;
	//   21   39:iconst_0        
	//   22   40:istore_2        
		} else
	//*  23   41:iload_2         
	//*  24   42:ireturn         
		{
			int j1 = strLen_[word0] - k;
	//   25   43:aload_0         
	//   26   44:getfield        #37  <Field int[] strLen_>
	//   27   47:iload_3         
	//   28   48:iaload          
	//   29   49:iload           5
	//   30   51:isub            
	//   31   52:istore          7
			j = abyte0.length - i;
	//   32   54:aload_1         
	//   33   55:arraylength     
	//   34   56:iload_2         
	//   35   57:isub            
	//   36   58:istore          4
			if(j > j1)
	//*  37   60:iload           4
	//*  38   62:iload           7
	//*  39   64:icmple          144
				j = j1;
	//   40   67:iload           7
	//   41   69:istore          4
			int i1 = j1 - j;
	//   42   71:iload           7
	//   43   73:iload           4
	//   44   75:isub            
	//   45   76:istore          6
			for(int l = i + j; l > i && word0 != -1;)
	//*  46   78:iload_2         
	//*  47   79:iload           4
	//*  48   81:iadd            
	//*  49   82:istore          5
	//*  50   84:iload           5
	//*  51   86:iload_2         
	//*  52   87:icmple          147
	//*  53   90:iload_3         
	//*  54   91:iconst_m1       
	//*  55   92:icmpeq          147
			{
				int k1 = i1 - 1;
	//   56   95:iload           6
	//   57   97:iconst_1        
	//   58   98:isub            
	//   59   99:istore          8
				i1 = l;
	//   60  101:iload           5
	//   61  103:istore          6
				if(k1 < 0)
	//*  62  105:iload           8
	//*  63  107:ifge            126
				{
					i1 = l - 1;
	//   64  110:iload           5
	//   65  112:iconst_1        
	//   66  113:isub            
	//   67  114:istore          6
					abyte0[i1] = strChr_[word0];
	//   68  116:aload_1         
	//   69  117:iload           6
	//   70  119:aload_0         
	//   71  120:getfield        #33  <Field byte[] strChr_>
	//   72  123:iload_3         
	//   73  124:baload          
	//   74  125:bastore         
				}
				word0 = strNxt_[word0];
	//   75  126:aload_0         
	//   76  127:getfield        #35  <Field short[] strNxt_>
	//   77  130:iload_3         
	//   78  131:saload          
	//   79  132:istore_3        
				l = i1;
	//   80  133:iload           6
	//   81  135:istore          5
				i1 = k1;
	//   82  137:iload           8
	//   83  139:istore          6
			}

	//*  84  141:goto            84
	//*  85  144:goto            71
			i = j;
	//   86  147:iload           4
	//   87  149:istore_2        
			if(j1 > j)
	//*  88  150:iload           7
	//*  89  152:iload           4
	//*  90  154:icmple          41
				return -j;
	//   91  157:iload           4
	//   92  159:ineg            
	//   93  160:ireturn         
		}
		return i;
	}

	private static final short HASHSIZE = 9973;
	private static final short HASHSTEP = 2039;
	private static final short HASH_FREE = -1;
	private static final int MAXBITS = 12;
	private static final int MAXSTR = 4096;
	private static final short NEXT_FIRST = -1;
	private static final int RES_CODES = 2;
	short numStrings_;
	byte strChr_[];
	short strHsh_[];
	int strLen_[];
	short strNxt_[];
}
