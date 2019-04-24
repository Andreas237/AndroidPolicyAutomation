// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.io.OutputStream;

public class LZWDecoder
{

	public LZWDecoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		data = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #25  <Field byte[] data>
		bitsToGet = 9;
	//    5    9:aload_0         
	//    6   10:bipush          9
	//    7   12:putfield        #27  <Field int bitsToGet>
		nextData = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #29  <Field int nextData>
		nextBits = 0;
	//   11   20:aload_0         
	//   12   21:iconst_0        
	//   13   22:putfield        #31  <Field int nextBits>
	//   14   25:aload_0         
	//   15   26:iconst_4        
	//   16   27:newarray        int[]
	//   17   29:dup             
	//   18   30:iconst_0        
	//   19   31:sipush          511
	//   20   34:iastore         
	//   21   35:dup             
	//   22   36:iconst_1        
	//   23   37:sipush          1023
	//   24   40:iastore         
	//   25   41:dup             
	//   26   42:iconst_2        
	//   27   43:sipush          2047
	//   28   46:iastore         
	//   29   47:dup             
	//   30   48:iconst_3        
	//   31   49:sipush          4095
	//   32   52:iastore         
	//   33   53:putfield        #33  <Field int[] andTable>
	//   34   56:return          
	}

	public void addStringToTable(byte abyte0[])
	{
		byte abyte1[][] = stringTable;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field byte[][] stringTable>
	//    2    4:astore_3        
		int i = tableIndex;
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field int tableIndex>
	//    5    9:istore_2        
		tableIndex = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #40  <Field int tableIndex>
		abyte1[i] = abyte0;
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:aload_1         
	//   14   20:aastore         
		if(tableIndex == 511)
	//*  15   21:aload_0         
	//*  16   22:getfield        #40  <Field int tableIndex>
	//*  17   25:sipush          511
	//*  18   28:icmpne          38
		{
			bitsToGet = 10;
	//   19   31:aload_0         
	//   20   32:bipush          10
	//   21   34:putfield        #27  <Field int bitsToGet>
		} else
	//*  22   37:return          
		{
			if(tableIndex == 1023)
	//*  23   38:aload_0         
	//*  24   39:getfield        #40  <Field int tableIndex>
	//*  25   42:sipush          1023
	//*  26   45:icmpne          55
			{
				bitsToGet = 11;
	//   27   48:aload_0         
	//   28   49:bipush          11
	//   29   51:putfield        #27  <Field int bitsToGet>
				return;
	//   30   54:return          
			}
			if(tableIndex == 2047)
	//*  31   55:aload_0         
	//*  32   56:getfield        #40  <Field int tableIndex>
	//*  33   59:sipush          2047
	//*  34   62:icmpne          37
			{
				bitsToGet = 12;
	//   35   65:aload_0         
	//   36   66:bipush          12
	//   37   68:putfield        #27  <Field int bitsToGet>
				return;
	//   38   71:return          
			}
		}
	}

	public void addStringToTable(byte abyte0[], byte byte0)
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		byte byte1 = ((byte) (new byte[i + 1]));
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:iadd            
	//    6    6:newarray        byte[]
	//    7    8:astore          4
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (byte1)), 0, i);
	//    8   10:aload_1         
	//    9   11:iconst_0        
	//   10   12:aload           4
	//   11   14:iconst_0        
	//   12   15:iload_3         
	//   13   16:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
		byte1[i] = byte0;
	//   14   19:aload           4
	//   15   21:iload_3         
	//   16   22:iload_2         
	//   17   23:bastore         
		abyte0 = ((byte []) (stringTable));
	//   18   24:aload_0         
	//   19   25:getfield        #38  <Field byte[][] stringTable>
	//   20   28:astore_1        
		i = tableIndex;
	//   21   29:aload_0         
	//   22   30:getfield        #40  <Field int tableIndex>
	//   23   33:istore_3        
		tableIndex = i + 1;
	//   24   34:aload_0         
	//   25   35:iload_3         
	//   26   36:iconst_1        
	//   27   37:iadd            
	//   28   38:putfield        #40  <Field int tableIndex>
		abyte0[i] = byte1;
	//   29   41:aload_1         
	//   30   42:iload_3         
	//   31   43:aload           4
	//   32   45:aastore         
		if(tableIndex == 511)
	//*  33   46:aload_0         
	//*  34   47:getfield        #40  <Field int tableIndex>
	//*  35   50:sipush          511
	//*  36   53:icmpne          63
		{
			bitsToGet = 10;
	//   37   56:aload_0         
	//   38   57:bipush          10
	//   39   59:putfield        #27  <Field int bitsToGet>
		} else
	//*  40   62:return          
		{
			if(tableIndex == 1023)
	//*  41   63:aload_0         
	//*  42   64:getfield        #40  <Field int tableIndex>
	//*  43   67:sipush          1023
	//*  44   70:icmpne          80
			{
				bitsToGet = 11;
	//   45   73:aload_0         
	//   46   74:bipush          11
	//   47   76:putfield        #27  <Field int bitsToGet>
				return;
	//   48   79:return          
			}
			if(tableIndex == 2047)
	//*  49   80:aload_0         
	//*  50   81:getfield        #40  <Field int tableIndex>
	//*  51   84:sipush          2047
	//*  52   87:icmpne          62
			{
				bitsToGet = 12;
	//   53   90:aload_0         
	//   54   91:bipush          12
	//   55   93:putfield        #27  <Field int bitsToGet>
				return;
	//   56   96:return          
			}
		}
	}

	public byte[] composeString(byte abyte0[], byte byte0)
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		byte abyte1[] = new byte[i + 1];
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:iadd            
	//    6    6:newarray        byte[]
	//    7    8:astore          4
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, i);
	//    8   10:aload_1         
	//    9   11:iconst_0        
	//   10   12:aload           4
	//   11   14:iconst_0        
	//   12   15:iload_3         
	//   13   16:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte1[i] = byte0;
	//   14   19:aload           4
	//   15   21:iload_3         
	//   16   22:iload_2         
	//   17   23:bastore         
		return abyte1;
	//   18   24:aload           4
	//   19   26:areturn         
	}

	public void decode(byte abyte0[], OutputStream outputstream)
	{
		if(abyte0[0] == 0 && abyte0[1] == 1)
	//*   0    0:aload_1         
	//*   1    1:iconst_0        
	//*   2    2:baload          
	//*   3    3:ifne            30
	//*   4    6:aload_1         
	//*   5    7:iconst_1        
	//*   6    8:baload          
	//*   7    9:iconst_1        
	//*   8   10:icmpne          30
			throw new RuntimeException(MessageLocalization.getComposedMessage("lzw.flavour.not.supported", new Object[0]));
	//    9   13:new             #53  <Class RuntimeException>
	//   10   16:dup             
	//   11   17:ldc1            #55  <String "lzw.flavour.not.supported">
	//   12   19:iconst_0        
	//   13   20:anewarray       Object[]
	//   14   23:invokestatic    #61  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   26:invokespecial   #64  <Method void RuntimeException(String)>
	//   16   29:athrow          
		initializeStringTable();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #67  <Method void initializeStringTable()>
		data = abyte0;
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:putfield        #25  <Field byte[] data>
		uncompData = outputstream;
	//   22   39:aload_0         
	//   23   40:aload_2         
	//   24   41:putfield        #69  <Field OutputStream uncompData>
		bytePointer = 0;
	//   25   44:aload_0         
	//   26   45:iconst_0        
	//   27   46:putfield        #71  <Field int bytePointer>
		bitPointer = 0;
	//   28   49:aload_0         
	//   29   50:iconst_0        
	//   30   51:putfield        #73  <Field int bitPointer>
		nextData = 0;
	//   31   54:aload_0         
	//   32   55:iconst_0        
	//   33   56:putfield        #29  <Field int nextData>
		nextBits = 0;
	//   34   59:aload_0         
	//   35   60:iconst_0        
	//   36   61:putfield        #31  <Field int nextBits>
		int i = 0;
	//   37   64:iconst_0        
	//   38   65:istore_3        
		do
		{
			int j;
label0:
			{
label1:
				{
					j = getNextCode();
	//   39   66:aload_0         
	//   40   67:invokevirtual   #77  <Method int getNextCode()>
	//   41   70:istore          4
					if(j != 257)
	//*  42   72:iload           4
	//*  43   74:sipush          257
	//*  44   77:icmpeq          104
					{
						if(j != 256)
							break label0;
	//   45   80:iload           4
	//   46   82:sipush          256
	//   47   85:icmpne          118
						initializeStringTable();
	//   48   88:aload_0         
	//   49   89:invokevirtual   #67  <Method void initializeStringTable()>
						i = getNextCode();
	//   50   92:aload_0         
	//   51   93:invokevirtual   #77  <Method int getNextCode()>
	//   52   96:istore_3        
						if(i != 257)
							break label1;
	//   53   97:iload_3         
	//   54   98:sipush          257
	//   55  101:icmpne          105
					}
					return;
	//   56  104:return          
				}
				writeString(stringTable[i]);
	//   57  105:aload_0         
	//   58  106:aload_0         
	//   59  107:getfield        #38  <Field byte[][] stringTable>
	//   60  110:iload_3         
	//   61  111:aaload          
	//   62  112:invokevirtual   #80  <Method void writeString(byte[])>
				continue;
	//   63  115:goto            66
			}
			if(j < tableIndex)
	//*  64  118:iload           4
	//*  65  120:aload_0         
	//*  66  121:getfield        #40  <Field int tableIndex>
	//*  67  124:icmpge          159
			{
				abyte0 = stringTable[j];
	//   68  127:aload_0         
	//   69  128:getfield        #38  <Field byte[][] stringTable>
	//   70  131:iload           4
	//   71  133:aaload          
	//   72  134:astore_1        
				writeString(abyte0);
	//   73  135:aload_0         
	//   74  136:aload_1         
	//   75  137:invokevirtual   #80  <Method void writeString(byte[])>
				addStringToTable(stringTable[i], abyte0[0]);
	//   76  140:aload_0         
	//   77  141:aload_0         
	//   78  142:getfield        #38  <Field byte[][] stringTable>
	//   79  145:iload_3         
	//   80  146:aaload          
	//   81  147:aload_1         
	//   82  148:iconst_0        
	//   83  149:baload          
	//   84  150:invokevirtual   #82  <Method void addStringToTable(byte[], byte)>
				i = j;
	//   85  153:iload           4
	//   86  155:istore_3        
			} else
	//*  87  156:goto            66
			{
				abyte0 = stringTable[i];
	//   88  159:aload_0         
	//   89  160:getfield        #38  <Field byte[][] stringTable>
	//   90  163:iload_3         
	//   91  164:aaload          
	//   92  165:astore_1        
				abyte0 = composeString(abyte0, abyte0[0]);
	//   93  166:aload_0         
	//   94  167:aload_1         
	//   95  168:aload_1         
	//   96  169:iconst_0        
	//   97  170:baload          
	//   98  171:invokevirtual   #84  <Method byte[] composeString(byte[], byte)>
	//   99  174:astore_1        
				writeString(abyte0);
	//  100  175:aload_0         
	//  101  176:aload_1         
	//  102  177:invokevirtual   #80  <Method void writeString(byte[])>
				addStringToTable(abyte0);
	//  103  180:aload_0         
	//  104  181:aload_1         
	//  105  182:invokevirtual   #86  <Method void addStringToTable(byte[])>
				i = j;
	//  106  185:iload           4
	//  107  187:istore_3        
			}
		} while(true);
	//  108  188:goto            66
	}

	public int getNextCode()
	{
		int i;
		int j;
		int k;
		int l;
		try
		{
			i = nextData;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int nextData>
	//    2    4:istore_1        
			byte abyte0[] = data;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field byte[] data>
	//    5    9:astore          5
			j = bytePointer;
	//    6   11:aload_0         
	//    7   12:getfield        #71  <Field int bytePointer>
	//    8   15:istore_2        
			bytePointer = j + 1;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:iconst_1        
	//   12   19:iadd            
	//   13   20:putfield        #71  <Field int bytePointer>
			nextData = i << 8 | abyte0[j] & 0xff;
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:bipush          8
	//   17   27:ishl            
	//   18   28:aload           5
	//   19   30:iload_2         
	//   20   31:baload          
	//   21   32:sipush          255
	//   22   35:iand            
	//   23   36:ior             
	//   24   37:putfield        #29  <Field int nextData>
			nextBits = nextBits + 8;
	//   25   40:aload_0         
	//   26   41:aload_0         
	//   27   42:getfield        #31  <Field int nextBits>
	//   28   45:bipush          8
	//   29   47:iadd            
	//   30   48:putfield        #31  <Field int nextBits>
			if(nextBits < bitsToGet)
	//*  31   51:aload_0         
	//*  32   52:getfield        #31  <Field int nextBits>
	//*  33   55:aload_0         
	//*  34   56:getfield        #27  <Field int bitsToGet>
	//*  35   59:icmpge          113
			{
				i = nextData;
	//   36   62:aload_0         
	//   37   63:getfield        #29  <Field int nextData>
	//   38   66:istore_1        
				byte abyte1[] = data;
	//   39   67:aload_0         
	//   40   68:getfield        #25  <Field byte[] data>
	//   41   71:astore          5
				j = bytePointer;
	//   42   73:aload_0         
	//   43   74:getfield        #71  <Field int bytePointer>
	//   44   77:istore_2        
				bytePointer = j + 1;
	//   45   78:aload_0         
	//   46   79:iload_2         
	//   47   80:iconst_1        
	//   48   81:iadd            
	//   49   82:putfield        #71  <Field int bytePointer>
				nextData = i << 8 | abyte1[j] & 0xff;
	//   50   85:aload_0         
	//   51   86:iload_1         
	//   52   87:bipush          8
	//   53   89:ishl            
	//   54   90:aload           5
	//   55   92:iload_2         
	//   56   93:baload          
	//   57   94:sipush          255
	//   58   97:iand            
	//   59   98:ior             
	//   60   99:putfield        #29  <Field int nextData>
				nextBits = nextBits + 8;
	//   61  102:aload_0         
	//   62  103:aload_0         
	//   63  104:getfield        #31  <Field int nextBits>
	//   64  107:bipush          8
	//   65  109:iadd            
	//   66  110:putfield        #31  <Field int nextBits>
			}
			i = nextData;
	//   67  113:aload_0         
	//   68  114:getfield        #29  <Field int nextData>
	//   69  117:istore_1        
			j = nextBits;
	//   70  118:aload_0         
	//   71  119:getfield        #31  <Field int nextBits>
	//   72  122:istore_2        
			k = bitsToGet;
	//   73  123:aload_0         
	//   74  124:getfield        #27  <Field int bitsToGet>
	//   75  127:istore_3        
			l = andTable[bitsToGet - 9];
	//   76  128:aload_0         
	//   77  129:getfield        #33  <Field int[] andTable>
	//   78  132:aload_0         
	//   79  133:getfield        #27  <Field int bitsToGet>
	//   80  136:bipush          9
	//   81  138:isub            
	//   82  139:iaload          
	//   83  140:istore          4
			nextBits = nextBits - bitsToGet;
	//   84  142:aload_0         
	//   85  143:aload_0         
	//   86  144:getfield        #31  <Field int nextBits>
	//   87  147:aload_0         
	//   88  148:getfield        #27  <Field int bitsToGet>
	//   89  151:isub            
	//   90  152:putfield        #31  <Field int nextBits>
		}
	//*  91  155:iload_1         
	//*  92  156:iload_2         
	//*  93  157:iload_3         
	//*  94  158:isub            
	//*  95  159:ishr            
	//*  96  160:iload           4
	//*  97  162:iand            
	//*  98  163:ireturn         
		catch(ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
	//*  99  164:astore          5
		{
			return 257;
	//  100  166:sipush          257
	//  101  169:ireturn         
		}
		return i >> j - k & l;
	}

	public void initializeStringTable()
	{
		stringTable = new byte[8192][];
	//    0    0:aload_0         
	//    1    1:sipush          8192
	//    2    4:anewarray       byte[][]
	//    3    7:putfield        #38  <Field byte[][] stringTable>
		for(int i = 0; i < 256; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:sipush          256
	//*   8   16:icmpge          45
		{
			stringTable[i] = new byte[1];
	//    9   19:aload_0         
	//   10   20:getfield        #38  <Field byte[][] stringTable>
	//   11   23:iload_1         
	//   12   24:iconst_1        
	//   13   25:newarray        byte[]
	//   14   27:aastore         
			stringTable[i][0] = (byte)i;
	//   15   28:aload_0         
	//   16   29:getfield        #38  <Field byte[][] stringTable>
	//   17   32:iload_1         
	//   18   33:aaload          
	//   19   34:iconst_0        
	//   20   35:iload_1         
	//   21   36:int2byte        
	//   22   37:bastore         
		}

	//   23   38:iload_1         
	//   24   39:iconst_1        
	//   25   40:iadd            
	//   26   41:istore_1        
	//*  27   42:goto            12
		tableIndex = 258;
	//   28   45:aload_0         
	//   29   46:sipush          258
	//   30   49:putfield        #40  <Field int tableIndex>
		bitsToGet = 9;
	//   31   52:aload_0         
	//   32   53:bipush          9
	//   33   55:putfield        #27  <Field int bitsToGet>
	//   34   58:return          
	}

	public void writeString(byte abyte0[])
	{
		try
		{
			uncompData.write(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field OutputStream uncompData>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method void OutputStream.write(byte[])>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   5    9:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//    6   10:new             #98  <Class ExceptionConverter>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #101 <Method void ExceptionConverter(Exception)>
	//   10   18:athrow          
		}
	}

	int andTable[] = {
		511, 1023, 2047, 4095
	};
	int bitPointer;
	int bitsToGet;
	int bytePointer;
	byte data[];
	int nextBits;
	int nextData;
	byte stringTable[][];
	int tableIndex;
	OutputStream uncompData;
}
