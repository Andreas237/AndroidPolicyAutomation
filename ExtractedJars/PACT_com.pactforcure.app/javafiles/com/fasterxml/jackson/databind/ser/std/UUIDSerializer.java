// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class UUIDSerializer extends StdScalarSerializer
{

	public UUIDSerializer()
	{
		super(java/util/UUID);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class UUID>
	//    2    3:invokespecial   #26  <Method void StdScalarSerializer(Class)>
	//    3    6:return          
	}

	private static final void _appendInt(int i, byte abyte0[], int j)
	{
		abyte0[j] = (byte)(i >> 24);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_0         
	//    3    3:bipush          24
	//    4    5:ishr            
	//    5    6:int2byte        
	//    6    7:bastore         
		j++;
	//    7    8:iload_2         
	//    8    9:iconst_1        
	//    9   10:iadd            
	//   10   11:istore_2        
		abyte0[j] = (byte)(i >> 16);
	//   11   12:aload_1         
	//   12   13:iload_2         
	//   13   14:iload_0         
	//   14   15:bipush          16
	//   15   17:ishr            
	//   16   18:int2byte        
	//   17   19:bastore         
		j++;
	//   18   20:iload_2         
	//   19   21:iconst_1        
	//   20   22:iadd            
	//   21   23:istore_2        
		abyte0[j] = (byte)(i >> 8);
	//   22   24:aload_1         
	//   23   25:iload_2         
	//   24   26:iload_0         
	//   25   27:bipush          8
	//   26   29:ishr            
	//   27   30:int2byte        
	//   28   31:bastore         
		abyte0[j + 1] = (byte)i;
	//   29   32:aload_1         
	//   30   33:iload_2         
	//   31   34:iconst_1        
	//   32   35:iadd            
	//   33   36:iload_0         
	//   34   37:int2byte        
	//   35   38:bastore         
	//   36   39:return          
	}

	private static void _appendInt(int i, char ac[], int j)
	{
		_appendShort(i >> 16, ac, j);
	//    0    0:iload_0         
	//    1    1:bipush          16
	//    2    3:ishr            
	//    3    4:aload_1         
	//    4    5:iload_2         
	//    5    6:invokestatic    #32  <Method void _appendShort(int, char[], int)>
		_appendShort(i, ac, j + 4);
	//    6    9:iload_0         
	//    7   10:aload_1         
	//    8   11:iload_2         
	//    9   12:iconst_4        
	//   10   13:iadd            
	//   11   14:invokestatic    #32  <Method void _appendShort(int, char[], int)>
	//   12   17:return          
	}

	private static void _appendShort(int i, char ac[], int j)
	{
		ac[j] = HEX_CHARS[i >> 12 & 0xf];
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #19  <Field char[] HEX_CHARS>
	//    3    5:iload_0         
	//    4    6:bipush          12
	//    5    8:ishr            
	//    6    9:bipush          15
	//    7   11:iand            
	//    8   12:caload          
	//    9   13:castore         
		j++;
	//   10   14:iload_2         
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:istore_2        
		ac[j] = HEX_CHARS[i >> 8 & 0xf];
	//   14   18:aload_1         
	//   15   19:iload_2         
	//   16   20:getstatic       #19  <Field char[] HEX_CHARS>
	//   17   23:iload_0         
	//   18   24:bipush          8
	//   19   26:ishr            
	//   20   27:bipush          15
	//   21   29:iand            
	//   22   30:caload          
	//   23   31:castore         
		j++;
	//   24   32:iload_2         
	//   25   33:iconst_1        
	//   26   34:iadd            
	//   27   35:istore_2        
		ac[j] = HEX_CHARS[i >> 4 & 0xf];
	//   28   36:aload_1         
	//   29   37:iload_2         
	//   30   38:getstatic       #19  <Field char[] HEX_CHARS>
	//   31   41:iload_0         
	//   32   42:iconst_4        
	//   33   43:ishr            
	//   34   44:bipush          15
	//   35   46:iand            
	//   36   47:caload          
	//   37   48:castore         
		ac[j + 1] = HEX_CHARS[i & 0xf];
	//   38   49:aload_1         
	//   39   50:iload_2         
	//   40   51:iconst_1        
	//   41   52:iadd            
	//   42   53:getstatic       #19  <Field char[] HEX_CHARS>
	//   43   56:iload_0         
	//   44   57:bipush          15
	//   45   59:iand            
	//   46   60:caload          
	//   47   61:castore         
	//   48   62:return          
	}

	private static final byte[] _asBytes(UUID uuid)
	{
		byte abyte0[] = new byte[16];
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:astore          5
		long l = uuid.getMostSignificantBits();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #38  <Method long UUID.getMostSignificantBits()>
	//    5   10:lstore_1        
		long l1 = uuid.getLeastSignificantBits();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #41  <Method long UUID.getLeastSignificantBits()>
	//    8   15:lstore_3        
		_appendInt((int)(l >> 32), abyte0, 0);
	//    9   16:lload_1         
	//   10   17:bipush          32
	//   11   19:lshr            
	//   12   20:l2i             
	//   13   21:aload           5
	//   14   23:iconst_0        
	//   15   24:invokestatic    #43  <Method void _appendInt(int, byte[], int)>
		_appendInt((int)l, abyte0, 4);
	//   16   27:lload_1         
	//   17   28:l2i             
	//   18   29:aload           5
	//   19   31:iconst_4        
	//   20   32:invokestatic    #43  <Method void _appendInt(int, byte[], int)>
		_appendInt((int)(l1 >> 32), abyte0, 8);
	//   21   35:lload_3         
	//   22   36:bipush          32
	//   23   38:lshr            
	//   24   39:l2i             
	//   25   40:aload           5
	//   26   42:bipush          8
	//   27   44:invokestatic    #43  <Method void _appendInt(int, byte[], int)>
		_appendInt((int)l1, abyte0, 12);
	//   28   47:lload_3         
	//   29   48:l2i             
	//   30   49:aload           5
	//   31   51:bipush          12
	//   32   53:invokestatic    #43  <Method void _appendInt(int, byte[], int)>
		return abyte0;
	//   33   56:aload           5
	//   34   58:areturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (UUID)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #23  <Class UUID>
	//    4    6:invokevirtual   #48  <Method boolean isEmpty(SerializerProvider, UUID)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, UUID uuid)
	{
		while(uuid == null || uuid.getLeastSignificantBits() == 0L && uuid.getMostSignificantBits() == 0L) 
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #41  <Method long UUID.getLeastSignificantBits()>
	//    6   10:lconst_0        
	//    7   11:lcmp            
	//    8   12:ifne            24
	//    9   15:aload_2         
	//   10   16:invokevirtual   #38  <Method long UUID.getMostSignificantBits()>
	//   11   19:lconst_0        
	//   12   20:lcmp            
	//   13   21:ifeq            4
		return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((UUID)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class UUID>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #55  <Method void serialize(UUID, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(UUID uuid, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(jsongenerator.canWriteBinaryNatively() && !(jsongenerator instanceof TokenBuffer))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #62  <Method boolean JsonGenerator.canWriteBinaryNatively()>
	//*   2    4:ifeq            23
	//*   3    7:aload_2         
	//*   4    8:instanceof      #64  <Class TokenBuffer>
	//*   5   11:ifne            23
		{
			jsongenerator.writeBinary(_asBytes(uuid));
	//    6   14:aload_2         
	//    7   15:aload_1         
	//    8   16:invokestatic    #66  <Method byte[] _asBytes(UUID)>
	//    9   19:invokevirtual   #70  <Method void JsonGenerator.writeBinary(byte[])>
			return;
	//   10   22:return          
		} else
		{
			serializerprovider = ((SerializerProvider) (new char[36]));
	//   11   23:bipush          36
	//   12   25:newarray        char[]
	//   13   27:astore_3        
			long l = uuid.getMostSignificantBits();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #38  <Method long UUID.getMostSignificantBits()>
	//   16   32:lstore          5
			_appendInt((int)(l >> 32), ((char []) (serializerprovider)), 0);
	//   17   34:lload           5
	//   18   36:bipush          32
	//   19   38:lshr            
	//   20   39:l2i             
	//   21   40:aload_3         
	//   22   41:iconst_0        
	//   23   42:invokestatic    #72  <Method void _appendInt(int, char[], int)>
			serializerprovider[8] = '-';
	//   24   45:aload_3         
	//   25   46:bipush          8
	//   26   48:bipush          45
	//   27   50:castore         
			int i = (int)l;
	//   28   51:lload           5
	//   29   53:l2i             
	//   30   54:istore          4
			_appendShort(i >>> 16, ((char []) (serializerprovider)), 9);
	//   31   56:iload           4
	//   32   58:bipush          16
	//   33   60:iushr           
	//   34   61:aload_3         
	//   35   62:bipush          9
	//   36   64:invokestatic    #32  <Method void _appendShort(int, char[], int)>
			serializerprovider[13] = '-';
	//   37   67:aload_3         
	//   38   68:bipush          13
	//   39   70:bipush          45
	//   40   72:castore         
			_appendShort(i, ((char []) (serializerprovider)), 14);
	//   41   73:iload           4
	//   42   75:aload_3         
	//   43   76:bipush          14
	//   44   78:invokestatic    #32  <Method void _appendShort(int, char[], int)>
			serializerprovider[18] = '-';
	//   45   81:aload_3         
	//   46   82:bipush          18
	//   47   84:bipush          45
	//   48   86:castore         
			l = uuid.getLeastSignificantBits();
	//   49   87:aload_1         
	//   50   88:invokevirtual   #41  <Method long UUID.getLeastSignificantBits()>
	//   51   91:lstore          5
			_appendShort((int)(l >>> 48), ((char []) (serializerprovider)), 19);
	//   52   93:lload           5
	//   53   95:bipush          48
	//   54   97:lushr           
	//   55   98:l2i             
	//   56   99:aload_3         
	//   57  100:bipush          19
	//   58  102:invokestatic    #32  <Method void _appendShort(int, char[], int)>
			serializerprovider[23] = '-';
	//   59  105:aload_3         
	//   60  106:bipush          23
	//   61  108:bipush          45
	//   62  110:castore         
			_appendShort((int)(l >>> 32), ((char []) (serializerprovider)), 24);
	//   63  111:lload           5
	//   64  113:bipush          32
	//   65  115:lushr           
	//   66  116:l2i             
	//   67  117:aload_3         
	//   68  118:bipush          24
	//   69  120:invokestatic    #32  <Method void _appendShort(int, char[], int)>
			_appendInt((int)l, ((char []) (serializerprovider)), 28);
	//   70  123:lload           5
	//   71  125:l2i             
	//   72  126:aload_3         
	//   73  127:bipush          28
	//   74  129:invokestatic    #72  <Method void _appendInt(int, char[], int)>
			jsongenerator.writeString(((char []) (serializerprovider)), 0, 36);
	//   75  132:aload_2         
	//   76  133:aload_3         
	//   77  134:iconst_0        
	//   78  135:bipush          36
	//   79  137:invokevirtual   #76  <Method void JsonGenerator.writeString(char[], int, int)>
			return;
	//   80  140:return          
		}
	}

	static final char HEX_CHARS[] = "0123456789abcdef".toCharArray();

	static 
	{
	//    0    0:ldc1            #11  <String "0123456789abcdef">
	//    1    2:invokevirtual   #17  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #19  <Field char[] HEX_CHARS>
	//*   3    8:return          
	}
}
