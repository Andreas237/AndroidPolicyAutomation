// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.metadata.id3;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.metadata.MetadataParser;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.UnsupportedEncodingException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.metadata.id3:
//			ApicFrame, BinaryFrame, GeobFrame, PrivFrame, 
//			TextInformationFrame, TxxxFrame

public final class Id3Parser
	implements MetadataParser
{

	public Id3Parser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	private static int delimiterLength(int i)
	{
		return i != 0 && i != 3 ? 2 : 1;
	//    0    0:iload_0         
	//    1    1:ifeq            14
	//    2    4:iload_0         
	//    3    5:iconst_3        
	//    4    6:icmpne          12
	//    5    9:goto            14
	//    6   12:iconst_2        
	//    7   13:ireturn         
	//    8   14:iconst_1        
	//    9   15:ireturn         
	}

	private static String getCharsetName(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 44
	//	               1 41
	//	               2 38
	//	               3 35
		default:
			return "ISO-8859-1";
	//    2   32:ldc1            #27  <String "ISO-8859-1">
	//    3   34:areturn         

		case 3: // '\003'
			return "UTF-8";
	//    4   35:ldc1            #29  <String "UTF-8">
	//    5   37:areturn         

		case 2: // '\002'
			return "UTF-16BE";
	//    6   38:ldc1            #31  <String "UTF-16BE">
	//    7   40:areturn         

		case 1: // '\001'
			return "UTF-16";
	//    8   41:ldc1            #33  <String "UTF-16">
	//    9   43:areturn         

		case 0: // '\0'
			return "ISO-8859-1";
	//   10   44:ldc1            #27  <String "ISO-8859-1">
	//   11   46:areturn         
		}
	}

	private static int indexOfEos(byte abyte0[], int i, int j)
	{
		int k = indexOfZeroByte(abyte0, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #39  <Method int indexOfZeroByte(byte[], int)>
	//    3    5:istore_3        
		if(j != 0)
	//*   4    6:iload_2         
	//*   5    7:ifeq            57
		{
			i = k;
	//    6   10:iload_3         
	//    7   11:istore_1        
			if(j == 3)
	//*   8   12:iload_2         
	//*   9   13:iconst_3        
	//*  10   14:icmpne          19
				return k;
	//   11   17:iload_3         
	//   12   18:ireturn         
			for(; i < abyte0.length - 1; i = indexOfZeroByte(abyte0, i + 1))
	//*  13   19:iload_1         
	//*  14   20:aload_0         
	//*  15   21:arraylength     
	//*  16   22:iconst_1        
	//*  17   23:isub            
	//*  18   24:icmpge          54
				if(i % 2 == 0 && abyte0[i + 1] == 0)
	//*  19   27:iload_1         
	//*  20   28:iconst_2        
	//*  21   29:irem            
	//*  22   30:ifne            43
	//*  23   33:aload_0         
	//*  24   34:iload_1         
	//*  25   35:iconst_1        
	//*  26   36:iadd            
	//*  27   37:baload          
	//*  28   38:ifne            43
					return i;
	//   29   41:iload_1         
	//   30   42:ireturn         

	//   31   43:aload_0         
	//   32   44:iload_1         
	//   33   45:iconst_1        
	//   34   46:iadd            
	//   35   47:invokestatic    #39  <Method int indexOfZeroByte(byte[], int)>
	//   36   50:istore_1        
	//*  37   51:goto            19
			return abyte0.length;
	//   38   54:aload_0         
	//   39   55:arraylength     
	//   40   56:ireturn         
		} else
		{
			return k;
	//   41   57:iload_3         
	//   42   58:ireturn         
		}
	}

	private static int indexOfZeroByte(byte abyte0[], int i)
	{
		for(; i < abyte0.length; i++)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:arraylength     
	//*   3    3:icmpge          21
			if(abyte0[i] == 0)
	//*   4    6:aload_0         
	//*   5    7:iload_1         
	//*   6    8:baload          
	//*   7    9:ifne            14
				return i;
	//    8   12:iload_1         
	//    9   13:ireturn         

	//   10   14:iload_1         
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:istore_1        
	//*  14   18:goto            0
		return abyte0.length;
	//   15   21:aload_0         
	//   16   22:arraylength     
	//   17   23:ireturn         
	}

	private static ApicFrame parseApicFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_2        
		String s = getCharsetName(j);
	//    3    5:iload_2         
	//    4    6:invokestatic    #51  <Method String getCharsetName(int)>
	//    5    9:astore          5
		i--;
	//    6   11:iload_1         
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:istore_1        
		byte abyte0[] = new byte[i];
	//   10   15:iload_1         
	//   11   16:newarray        byte[]
	//   12   18:astore          6
		parsablebytearray.readBytes(abyte0, 0, i);
	//   13   20:aload_0         
	//   14   21:aload           6
	//   15   23:iconst_0        
	//   16   24:iload_1         
	//   17   25:invokevirtual   #55  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		int k = indexOfZeroByte(abyte0, 0);
	//   18   28:aload           6
	//   19   30:iconst_0        
	//   20   31:invokestatic    #39  <Method int indexOfZeroByte(byte[], int)>
	//   21   34:istore_3        
		parsablebytearray = ((ParsableByteArray) (new String(abyte0, 0, k, "ISO-8859-1")));
	//   22   35:new             #57  <Class String>
	//   23   38:dup             
	//   24   39:aload           6
	//   25   41:iconst_0        
	//   26   42:iload_3         
	//   27   43:ldc1            #27  <String "ISO-8859-1">
	//   28   45:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   29   48:astore_0        
		i = ((int) (abyte0[k + 1]));
	//   30   49:aload           6
	//   31   51:iload_3         
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:baload          
	//   35   55:istore_1        
		k += 2;
	//   36   56:iload_3         
	//   37   57:iconst_2        
	//   38   58:iadd            
	//   39   59:istore_3        
		int l = indexOfEos(abyte0, k, j);
	//   40   60:aload           6
	//   41   62:iload_3         
	//   42   63:iload_2         
	//   43   64:invokestatic    #62  <Method int indexOfEos(byte[], int, int)>
	//   44   67:istore          4
		return new ApicFrame(((String) (parsablebytearray)), new String(abyte0, k, l - k, s), i & 0xff, Arrays.copyOfRange(abyte0, l + delimiterLength(j), abyte0.length));
	//   45   69:new             #64  <Class ApicFrame>
	//   46   72:dup             
	//   47   73:aload_0         
	//   48   74:new             #57  <Class String>
	//   49   77:dup             
	//   50   78:aload           6
	//   51   80:iload_3         
	//   52   81:iload           4
	//   53   83:iload_3         
	//   54   84:isub            
	//   55   85:aload           5
	//   56   87:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   57   90:iload_1         
	//   58   91:sipush          255
	//   59   94:iand            
	//   60   95:aload           6
	//   61   97:iload           4
	//   62   99:iload_2         
	//   63  100:invokestatic    #66  <Method int delimiterLength(int)>
	//   64  103:iadd            
	//   65  104:aload           6
	//   66  106:arraylength     
	//   67  107:invokestatic    #72  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   68  110:invokespecial   #75  <Method void ApicFrame(String, String, int, byte[])>
	//   69  113:areturn         
	}

	private static BinaryFrame parseBinaryFrame(ParsableByteArray parsablebytearray, int i, String s)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		parsablebytearray.readBytes(abyte0, 0, i);
	//    3    4:aload_0         
	//    4    5:aload_3         
	//    5    6:iconst_0        
	//    6    7:iload_1         
	//    7    8:invokevirtual   #55  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		return new BinaryFrame(s, abyte0);
	//    8   11:new             #80  <Class BinaryFrame>
	//    9   14:dup             
	//   10   15:aload_2         
	//   11   16:aload_3         
	//   12   17:invokespecial   #83  <Method void BinaryFrame(String, byte[])>
	//   13   20:areturn         
	}

	private static GeobFrame parseGeobFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_2        
		String s = getCharsetName(j);
	//    3    5:iload_2         
	//    4    6:invokestatic    #51  <Method String getCharsetName(int)>
	//    5    9:astore          4
		i--;
	//    6   11:iload_1         
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:istore_1        
		byte abyte0[] = new byte[i];
	//   10   15:iload_1         
	//   11   16:newarray        byte[]
	//   12   18:astore          5
		parsablebytearray.readBytes(abyte0, 0, i);
	//   13   20:aload_0         
	//   14   21:aload           5
	//   15   23:iconst_0        
	//   16   24:iload_1         
	//   17   25:invokevirtual   #55  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		i = indexOfZeroByte(abyte0, 0);
	//   18   28:aload           5
	//   19   30:iconst_0        
	//   20   31:invokestatic    #39  <Method int indexOfZeroByte(byte[], int)>
	//   21   34:istore_1        
		parsablebytearray = ((ParsableByteArray) (new String(abyte0, 0, i, "ISO-8859-1")));
	//   22   35:new             #57  <Class String>
	//   23   38:dup             
	//   24   39:aload           5
	//   25   41:iconst_0        
	//   26   42:iload_1         
	//   27   43:ldc1            #27  <String "ISO-8859-1">
	//   28   45:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   29   48:astore_0        
		i++;
	//   30   49:iload_1         
	//   31   50:iconst_1        
	//   32   51:iadd            
	//   33   52:istore_1        
		int k = indexOfEos(abyte0, i, j);
	//   34   53:aload           5
	//   35   55:iload_1         
	//   36   56:iload_2         
	//   37   57:invokestatic    #62  <Method int indexOfEos(byte[], int, int)>
	//   38   60:istore_3        
		String s1 = new String(abyte0, i, k - i, s);
	//   39   61:new             #57  <Class String>
	//   40   64:dup             
	//   41   65:aload           5
	//   42   67:iload_1         
	//   43   68:iload_3         
	//   44   69:iload_1         
	//   45   70:isub            
	//   46   71:aload           4
	//   47   73:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   48   76:astore          6
		i = k + delimiterLength(j);
	//   49   78:iload_3         
	//   50   79:iload_2         
	//   51   80:invokestatic    #66  <Method int delimiterLength(int)>
	//   52   83:iadd            
	//   53   84:istore_1        
		k = indexOfEos(abyte0, i, j);
	//   54   85:aload           5
	//   55   87:iload_1         
	//   56   88:iload_2         
	//   57   89:invokestatic    #62  <Method int indexOfEos(byte[], int, int)>
	//   58   92:istore_3        
		return new GeobFrame(((String) (parsablebytearray)), s1, new String(abyte0, i, k - i, s), Arrays.copyOfRange(abyte0, k + delimiterLength(j), abyte0.length));
	//   59   93:new             #87  <Class GeobFrame>
	//   60   96:dup             
	//   61   97:aload_0         
	//   62   98:aload           6
	//   63  100:new             #57  <Class String>
	//   64  103:dup             
	//   65  104:aload           5
	//   66  106:iload_1         
	//   67  107:iload_3         
	//   68  108:iload_1         
	//   69  109:isub            
	//   70  110:aload           4
	//   71  112:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   72  115:aload           5
	//   73  117:iload_3         
	//   74  118:iload_2         
	//   75  119:invokestatic    #66  <Method int delimiterLength(int)>
	//   76  122:iadd            
	//   77  123:aload           5
	//   78  125:arraylength     
	//   79  126:invokestatic    #72  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   80  129:invokespecial   #90  <Method void GeobFrame(String, String, String, byte[])>
	//   81  132:areturn         
	}

	private static int parseId3Header(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		int i = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_1        
		int j = parsablebytearray.readUnsignedByte();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//    5    9:istore_2        
		int k = parsablebytearray.readUnsignedByte();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//    8   14:istore_3        
		if(i == 73 && j == 68 && k == 51)
	//*   9   15:iload_1         
	//*  10   16:bipush          73
	//*  11   18:icmpne          93
	//*  12   21:iload_2         
	//*  13   22:bipush          68
	//*  14   24:icmpne          93
	//*  15   27:iload_3         
	//*  16   28:bipush          51
	//*  17   30:icmpne          93
		{
			parsablebytearray.skipBytes(2);
	//   18   33:aload_0         
	//   19   34:iconst_2        
	//   20   35:invokevirtual   #98  <Method void ParsableByteArray.skipBytes(int)>
			k = parsablebytearray.readUnsignedByte();
	//   21   38:aload_0         
	//   22   39:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//   23   42:istore_3        
			j = parsablebytearray.readSynchSafeInt();
	//   24   43:aload_0         
	//   25   44:invokevirtual   #101 <Method int ParsableByteArray.readSynchSafeInt()>
	//   26   47:istore_2        
			i = j;
	//   27   48:iload_2         
	//   28   49:istore_1        
			if((k & 2) != 0)
	//*  29   50:iload_3         
	//*  30   51:iconst_2        
	//*  31   52:iand            
	//*  32   53:ifeq            77
			{
				i = parsablebytearray.readSynchSafeInt();
	//   33   56:aload_0         
	//   34   57:invokevirtual   #101 <Method int ParsableByteArray.readSynchSafeInt()>
	//   35   60:istore_1        
				if(i > 4)
	//*  36   61:iload_1         
	//*  37   62:iconst_4        
	//*  38   63:icmple          73
					parsablebytearray.skipBytes(i - 4);
	//   39   66:aload_0         
	//   40   67:iload_1         
	//   41   68:iconst_4        
	//   42   69:isub            
	//   43   70:invokevirtual   #98  <Method void ParsableByteArray.skipBytes(int)>
				i = j - i;
	//   44   73:iload_2         
	//   45   74:iload_1         
	//   46   75:isub            
	//   47   76:istore_1        
			}
			j = i;
	//   48   77:iload_1         
	//   49   78:istore_2        
			if((k & 8) != 0)
	//*  50   79:iload_3         
	//*  51   80:bipush          8
	//*  52   82:iand            
	//*  53   83:ifeq            91
				j = i - 10;
	//   54   86:iload_1         
	//   55   87:bipush          10
	//   56   89:isub            
	//   57   90:istore_2        
			return j;
	//   58   91:iload_2         
	//   59   92:ireturn         
		} else
		{
			throw new ParserException(String.format(Locale.US, "Unexpected ID3 file identifier, expected \"ID3\", actual \"%c%c%c\".", new Object[] {
				Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
			}));
	//   60   93:new             #94  <Class ParserException>
	//   61   96:dup             
	//   62   97:getstatic       #107 <Field Locale Locale.US>
	//   63  100:ldc1            #109 <String "Unexpected ID3 file identifier, expected \"ID3\", actual \"%c%c%c\".">
	//   64  102:iconst_3        
	//   65  103:anewarray       Object[]
	//   66  106:dup             
	//   67  107:iconst_0        
	//   68  108:iload_1         
	//   69  109:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   70  112:aastore         
	//   71  113:dup             
	//   72  114:iconst_1        
	//   73  115:iload_2         
	//   74  116:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   75  119:aastore         
	//   76  120:dup             
	//   77  121:iconst_2        
	//   78  122:iload_3         
	//   79  123:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   80  126:aastore         
	//   81  127:invokestatic    #119 <Method String String.format(Locale, String, Object[])>
	//   82  130:invokespecial   #122 <Method void ParserException(String)>
	//   83  133:athrow          
		}
	}

	private static PrivFrame parsePrivFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		parsablebytearray.readBytes(abyte0, 0, i);
	//    3    4:aload_0         
	//    4    5:aload_2         
	//    5    6:iconst_0        
	//    6    7:iload_1         
	//    7    8:invokevirtual   #55  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		i = indexOfZeroByte(abyte0, 0);
	//    8   11:aload_2         
	//    9   12:iconst_0        
	//   10   13:invokestatic    #39  <Method int indexOfZeroByte(byte[], int)>
	//   11   16:istore_1        
		return new PrivFrame(new String(abyte0, 0, i, "ISO-8859-1"), Arrays.copyOfRange(abyte0, i + 1, abyte0.length));
	//   12   17:new             #126 <Class PrivFrame>
	//   13   20:dup             
	//   14   21:new             #57  <Class String>
	//   15   24:dup             
	//   16   25:aload_2         
	//   17   26:iconst_0        
	//   18   27:iload_1         
	//   19   28:ldc1            #27  <String "ISO-8859-1">
	//   20   30:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   21   33:aload_2         
	//   22   34:iload_1         
	//   23   35:iconst_1        
	//   24   36:iadd            
	//   25   37:aload_2         
	//   26   38:arraylength     
	//   27   39:invokestatic    #72  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   28   42:invokespecial   #127 <Method void PrivFrame(String, byte[])>
	//   29   45:areturn         
	}

	private static TextInformationFrame parseTextInformationFrame(ParsableByteArray parsablebytearray, int i, String s)
		throws UnsupportedEncodingException
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_3        
		String s1 = getCharsetName(j);
	//    3    5:iload_3         
	//    4    6:invokestatic    #51  <Method String getCharsetName(int)>
	//    5    9:astore          4
		i--;
	//    6   11:iload_1         
	//    7   12:iconst_1        
	//    8   13:isub            
	//    9   14:istore_1        
		byte abyte0[] = new byte[i];
	//   10   15:iload_1         
	//   11   16:newarray        byte[]
	//   12   18:astore          5
		parsablebytearray.readBytes(abyte0, 0, i);
	//   13   20:aload_0         
	//   14   21:aload           5
	//   15   23:iconst_0        
	//   16   24:iload_1         
	//   17   25:invokevirtual   #55  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		return new TextInformationFrame(s, new String(abyte0, 0, indexOfEos(abyte0, 0, j), s1));
	//   18   28:new             #131 <Class TextInformationFrame>
	//   19   31:dup             
	//   20   32:aload_2         
	//   21   33:new             #57  <Class String>
	//   22   36:dup             
	//   23   37:aload           5
	//   24   39:iconst_0        
	//   25   40:aload           5
	//   26   42:iconst_0        
	//   27   43:iload_3         
	//   28   44:invokestatic    #62  <Method int indexOfEos(byte[], int, int)>
	//   29   47:aload           4
	//   30   49:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   31   52:invokespecial   #134 <Method void TextInformationFrame(String, String)>
	//   32   55:areturn         
	}

	private static TxxxFrame parseTxxxFrame(ParsableByteArray parsablebytearray, int i)
		throws UnsupportedEncodingException
	{
		int j = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:istore_2        
		String s = getCharsetName(j);
	//    3    5:iload_2         
	//    4    6:invokestatic    #51  <Method String getCharsetName(int)>
	//    5    9:astore_3        
		i--;
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:istore_1        
		byte abyte0[] = new byte[i];
	//   10   14:iload_1         
	//   11   15:newarray        byte[]
	//   12   17:astore          4
		parsablebytearray.readBytes(abyte0, 0, i);
	//   13   19:aload_0         
	//   14   20:aload           4
	//   15   22:iconst_0        
	//   16   23:iload_1         
	//   17   24:invokevirtual   #55  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		i = indexOfEos(abyte0, 0, j);
	//   18   27:aload           4
	//   19   29:iconst_0        
	//   20   30:iload_2         
	//   21   31:invokestatic    #62  <Method int indexOfEos(byte[], int, int)>
	//   22   34:istore_1        
		parsablebytearray = ((ParsableByteArray) (new String(abyte0, 0, i, s)));
	//   23   35:new             #57  <Class String>
	//   24   38:dup             
	//   25   39:aload           4
	//   26   41:iconst_0        
	//   27   42:iload_1         
	//   28   43:aload_3         
	//   29   44:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   30   47:astore_0        
		i += delimiterLength(j);
	//   31   48:iload_1         
	//   32   49:iload_2         
	//   33   50:invokestatic    #66  <Method int delimiterLength(int)>
	//   34   53:iadd            
	//   35   54:istore_1        
		return new TxxxFrame(((String) (parsablebytearray)), new String(abyte0, i, indexOfEos(abyte0, i, j) - i, s));
	//   36   55:new             #138 <Class TxxxFrame>
	//   37   58:dup             
	//   38   59:aload_0         
	//   39   60:new             #57  <Class String>
	//   40   63:dup             
	//   41   64:aload           4
	//   42   66:iload_1         
	//   43   67:aload           4
	//   44   69:iload_1         
	//   45   70:iload_2         
	//   46   71:invokestatic    #62  <Method int indexOfEos(byte[], int, int)>
	//   47   74:iload_1         
	//   48   75:isub            
	//   49   76:aload_3         
	//   50   77:invokespecial   #60  <Method void String(byte[], int, int, String)>
	//   51   80:invokespecial   #139 <Method void TxxxFrame(String, String)>
	//   52   83:areturn         
	}

	public boolean canParse(String s)
	{
		return s.equals("application/id3");
	//    0    0:aload_1         
	//    1    1:ldc1            #143 <String "application/id3">
	//    2    3:invokevirtual   #147 <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	public volatile Object parse(byte abyte0[], int i)
		throws ParserException
	{
		return ((Object) (parse(abyte0, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #152 <Method List parse(byte[], int)>
	//    4    6:areturn         
	}

	public List parse(byte abyte0[], int i)
		throws ParserException
	{
		ArrayList arraylist;
		ParsableByteArray parsablebytearray;
		arraylist = new ArrayList();
	//    0    0:new             #154 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #155 <Method void ArrayList()>
	//    3    7:astore          8
		parsablebytearray = new ParsableByteArray(abyte0, i);
	//    4    9:new             #45  <Class ParsableByteArray>
	//    5   12:dup             
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:invokespecial   #158 <Method void ParsableByteArray(byte[], int)>
	//    9   18:astore          9
		i = parseId3Header(parsablebytearray);
	//   10   20:aload           9
	//   11   22:invokestatic    #160 <Method int parseId3Header(ParsableByteArray)>
	//   12   25:istore_2        
_L2:
		if(i <= 0)
			break; /* Loop/switch isn't completed */
	//   13   26:iload_2         
	//   14   27:ifle            371
		int j = parsablebytearray.readUnsignedByte();
	//   15   30:aload           9
	//   16   32:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//   17   35:istore_3        
		int k = parsablebytearray.readUnsignedByte();
	//   18   36:aload           9
	//   19   38:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//   20   41:istore          4
		int l = parsablebytearray.readUnsignedByte();
	//   21   43:aload           9
	//   22   45:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//   23   48:istore          5
		int i1 = parsablebytearray.readUnsignedByte();
	//   24   50:aload           9
	//   25   52:invokevirtual   #49  <Method int ParsableByteArray.readUnsignedByte()>
	//   26   55:istore          6
		int j1 = parsablebytearray.readSynchSafeInt();
	//   27   57:aload           9
	//   28   59:invokevirtual   #101 <Method int ParsableByteArray.readSynchSafeInt()>
	//   29   62:istore          7
		if(j1 <= 1)
	//*  30   64:iload           7
	//*  31   66:iconst_1        
	//*  32   67:icmpgt          73
			break; /* Loop/switch isn't completed */
	//   33   70:goto            371
		parsablebytearray.skipBytes(2);
	//   34   73:aload           9
	//   35   75:iconst_2        
	//   36   76:invokevirtual   #98  <Method void ParsableByteArray.skipBytes(int)>
		if(j == 84 && k == 88 && l == 88 && i1 == 88)
	//*  37   79:iload_3         
	//*  38   80:bipush          84
	//*  39   82:icmpne          117
	//*  40   85:iload           4
	//*  41   87:bipush          88
	//*  42   89:icmpne          117
	//*  43   92:iload           5
	//*  44   94:bipush          88
	//*  45   96:icmpne          117
	//*  46   99:iload           6
	//*  47  101:bipush          88
	//*  48  103:icmpne          117
		{
			try
			{
				abyte0 = ((byte []) (parseTxxxFrame(parsablebytearray, j1)));
	//   49  106:aload           9
	//   50  108:iload           7
	//   51  110:invokestatic    #162 <Method TxxxFrame parseTxxxFrame(ParsableByteArray, int)>
	//   52  113:astore_1        
			}
	//*  53  114:goto            342
	//*  54  117:iload_3         
	//*  55  118:bipush          80
	//*  56  120:icmpne          155
	//*  57  123:iload           4
	//*  58  125:bipush          82
	//*  59  127:icmpne          155
	//*  60  130:iload           5
	//*  61  132:bipush          73
	//*  62  134:icmpne          155
	//*  63  137:iload           6
	//*  64  139:bipush          86
	//*  65  141:icmpne          155
	//*  66  144:aload           9
	//*  67  146:iload           7
	//*  68  148:invokestatic    #164 <Method PrivFrame parsePrivFrame(ParsableByteArray, int)>
	//*  69  151:astore_1        
	//*  70  152:goto            342
	//*  71  155:iload_3         
	//*  72  156:bipush          71
	//*  73  158:icmpne          193
	//*  74  161:iload           4
	//*  75  163:bipush          69
	//*  76  165:icmpne          193
	//*  77  168:iload           5
	//*  78  170:bipush          79
	//*  79  172:icmpne          193
	//*  80  175:iload           6
	//*  81  177:bipush          66
	//*  82  179:icmpne          193
	//*  83  182:aload           9
	//*  84  184:iload           7
	//*  85  186:invokestatic    #166 <Method GeobFrame parseGeobFrame(ParsableByteArray, int)>
	//*  86  189:astore_1        
	//*  87  190:goto            342
	//*  88  193:iload_3         
	//*  89  194:bipush          65
	//*  90  196:icmpne          231
	//*  91  199:iload           4
	//*  92  201:bipush          80
	//*  93  203:icmpne          231
	//*  94  206:iload           5
	//*  95  208:bipush          73
	//*  96  210:icmpne          231
	//*  97  213:iload           6
	//*  98  215:bipush          67
	//*  99  217:icmpne          231
	//* 100  220:aload           9
	//* 101  222:iload           7
	//* 102  224:invokestatic    #168 <Method ApicFrame parseApicFrame(ParsableByteArray, int)>
	//* 103  227:astore_1        
	//* 104  228:goto            342
	//* 105  231:iload_3         
	//* 106  232:bipush          84
	//* 107  234:icmpne          291
	//* 108  237:aload           9
	//* 109  239:iload           7
	//* 110  241:getstatic       #107 <Field Locale Locale.US>
	//* 111  244:ldc1            #170 <String "%c%c%c%c">
	//* 112  246:iconst_4        
	//* 113  247:anewarray       Object[]
	//* 114  250:dup             
	//* 115  251:iconst_0        
	//* 116  252:iload_3         
	//* 117  253:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//* 118  256:aastore         
	//* 119  257:dup             
	//* 120  258:iconst_1        
	//* 121  259:iload           4
	//* 122  261:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//* 123  264:aastore         
	//* 124  265:dup             
	//* 125  266:iconst_2        
	//* 126  267:iload           5
	//* 127  269:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//* 128  272:aastore         
	//* 129  273:dup             
	//* 130  274:iconst_3        
	//* 131  275:iload           6
	//* 132  277:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//* 133  280:aastore         
	//* 134  281:invokestatic    #119 <Method String String.format(Locale, String, Object[])>
	//* 135  284:invokestatic    #172 <Method TextInformationFrame parseTextInformationFrame(ParsableByteArray, int, String)>
	//* 136  287:astore_1        
	//* 137  288:goto            342
	//* 138  291:aload           9
	//* 139  293:iload           7
	//* 140  295:getstatic       #107 <Field Locale Locale.US>
	//* 141  298:ldc1            #170 <String "%c%c%c%c">
	//* 142  300:iconst_4        
	//* 143  301:anewarray       Object[]
	//* 144  304:dup             
	//* 145  305:iconst_0        
	//* 146  306:iload_3         
	//* 147  307:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//* 148  310:aastore         
	//* 149  311:dup             
	//* 150  312:iconst_1        
	//* 151  313:iload           4
	//* 152  315:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//* 153  318:aastore         
	//* 154  319:dup             
	//* 155  320:iconst_2        
	//* 156  321:iload           5
	//* 157  323:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//* 158  326:aastore         
	//* 159  327:dup             
	//* 160  328:iconst_3        
	//* 161  329:iload           6
	//* 162  331:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//* 163  334:aastore         
	//* 164  335:invokestatic    #119 <Method String String.format(Locale, String, Object[])>
	//* 165  338:invokestatic    #174 <Method BinaryFrame parseBinaryFrame(ParsableByteArray, int, String)>
	//* 166  341:astore_1        
	//* 167  342:aload           8
	//* 168  344:aload_1         
	//* 169  345:invokeinterface #179 <Method boolean List.add(Object)>
	//* 170  350:pop             
	//* 171  351:iload_2         
	//* 172  352:iload           7
	//* 173  354:bipush          10
	//* 174  356:iadd            
	//* 175  357:isub            
	//* 176  358:istore_2        
	//* 177  359:goto            26
	//* 178  362:new             #94  <Class ParserException>
	//* 179  365:dup             
	//* 180  366:aload_1         
	//* 181  367:invokespecial   #182 <Method void ParserException(Throwable)>
	//* 182  370:athrow          
	//* 183  371:aload           8
	//* 184  373:invokestatic    #188 <Method List Collections.unmodifiableList(List)>
	//* 185  376:areturn         
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				throw new ParserException(((Throwable) (abyte0)));
			}
			break MISSING_BLOCK_LABEL_342;
		}
		if(j != 80 || k != 82 || l != 73 || i1 != 86)
			break MISSING_BLOCK_LABEL_155;
		abyte0 = ((byte []) (parsePrivFrame(parsablebytearray, j1)));
		break MISSING_BLOCK_LABEL_342;
		if(j != 71 || k != 69 || l != 79 || i1 != 66)
			break MISSING_BLOCK_LABEL_193;
		abyte0 = ((byte []) (parseGeobFrame(parsablebytearray, j1)));
		break MISSING_BLOCK_LABEL_342;
		if(j != 65 || k != 80 || l != 73 || i1 != 67)
			break MISSING_BLOCK_LABEL_231;
		abyte0 = ((byte []) (parseApicFrame(parsablebytearray, j1)));
		break MISSING_BLOCK_LABEL_342;
		if(j != 84)
			break MISSING_BLOCK_LABEL_291;
		abyte0 = ((byte []) (parseTextInformationFrame(parsablebytearray, j1, String.format(Locale.US, "%c%c%c%c", new Object[] {
			Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1)
		}))));
		break MISSING_BLOCK_LABEL_342;
		abyte0 = ((byte []) (parseBinaryFrame(parsablebytearray, j1, String.format(Locale.US, "%c%c%c%c", new Object[] {
			Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1)
		}))));
		((List) (arraylist)).add(((Object) (abyte0)));
		i -= j1 + 10;
		if(true) goto _L2; else goto _L1
_L1:
		return Collections.unmodifiableList(((List) (arraylist)));
	//* 186  377:astore_1        
	//* 187  378:goto            362
	}

	private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
	private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
	private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
	private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
}
