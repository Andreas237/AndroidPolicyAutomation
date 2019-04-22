// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			FromStringDeserializer

public class UUIDDeserializer extends FromStringDeserializer
{

	public UUIDDeserializer()
	{
		super(java/util/UUID);
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <Class UUID>
	//    2    3:invokespecial   #28  <Method void FromStringDeserializer(Class)>
	//    3    6:return          
	}

	private UUID _badFormat(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		return (UUID)deserializationcontext.handleWeirdStringValue(handledType(), s, "UUID has to be represented by standard 36-char representation", new Object[0]);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #36  <Method Class handledType()>
	//    3    5:aload_1         
	//    4    6:ldc1            #38  <String "UUID has to be represented by standard 36-char representation">
	//    5    8:iconst_0        
	//    6    9:anewarray       Object[]
	//    7   12:invokevirtual   #46  <Method Object DeserializationContext.handleWeirdStringValue(Class, String, String, Object[])>
	//    8   15:checkcast       #25  <Class UUID>
	//    9   18:areturn         
	}

	private UUID _fromBytes(byte abyte0[], DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(abyte0.length == 16)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:bipush          16
	//*   3    4:icmpne          26
		{
			return new UUID(_long(abyte0, 0), _long(abyte0, 8));
	//    4    7:new             #25  <Class UUID>
	//    5   10:dup             
	//    6   11:aload_1         
	//    7   12:iconst_0        
	//    8   13:invokestatic    #55  <Method long _long(byte[], int)>
	//    9   16:aload_1         
	//   10   17:bipush          8
	//   11   19:invokestatic    #55  <Method long _long(byte[], int)>
	//   12   22:invokespecial   #58  <Method void UUID(long, long)>
	//   13   25:areturn         
		} else
		{
			deserializationcontext = ((DeserializationContext) (deserializationcontext.getParser()));
	//   14   26:aload_2         
	//   15   27:invokevirtual   #62  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//   16   30:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   17   31:new             #64  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #66  <Method void StringBuilder()>
	//   20   38:astore_3        
			stringbuilder.append("Can only construct UUIDs from byte[16]; got ");
	//   21   39:aload_3         
	//   22   40:ldc1            #68  <String "Can only construct UUIDs from byte[16]; got ">
	//   23   42:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			stringbuilder.append(abyte0.length);
	//   25   46:aload_3         
	//   26   47:aload_1         
	//   27   48:arraylength     
	//   28   49:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
	//   29   52:pop             
			stringbuilder.append(" bytes");
	//   30   53:aload_3         
	//   31   54:ldc1            #77  <String " bytes">
	//   32   56:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   33   59:pop             
			throw InvalidFormatException.from(((com.fasterxml.jackson.core.JsonParser) (deserializationcontext)), stringbuilder.toString(), ((Object) (abyte0)), handledType());
	//   34   60:aload_2         
	//   35   61:aload_3         
	//   36   62:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   37   65:aload_1         
	//   38   66:aload_0         
	//   39   67:invokevirtual   #36  <Method Class handledType()>
	//   40   70:invokestatic    #87  <Method InvalidFormatException InvalidFormatException.from(com.fasterxml.jackson.core.JsonParser, String, Object, Class)>
	//   41   73:athrow          
		}
	}

	private static int _int(byte abyte0[], int i)
	{
		byte byte0 = abyte0[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:istore_2        
		byte byte1 = abyte0[i + 1];
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:iconst_1        
	//    7    7:iadd            
	//    8    8:baload          
	//    9    9:istore_3        
		byte byte2 = abyte0[i + 2];
	//   10   10:aload_0         
	//   11   11:iload_1         
	//   12   12:iconst_2        
	//   13   13:iadd            
	//   14   14:baload          
	//   15   15:istore          4
		return abyte0[i + 3] & 0xff | (byte0 << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8);
	//   16   17:aload_0         
	//   17   18:iload_1         
	//   18   19:iconst_3        
	//   19   20:iadd            
	//   20   21:baload          
	//   21   22:sipush          255
	//   22   25:iand            
	//   23   26:iload_2         
	//   24   27:bipush          24
	//   25   29:ishl            
	//   26   30:iload_3         
	//   27   31:sipush          255
	//   28   34:iand            
	//   29   35:bipush          16
	//   30   37:ishl            
	//   31   38:ior             
	//   32   39:iload           4
	//   33   41:sipush          255
	//   34   44:iand            
	//   35   45:bipush          8
	//   36   47:ishl            
	//   37   48:ior             
	//   38   49:ior             
	//   39   50:ireturn         
	}

	private static long _long(byte abyte0[], int i)
	{
		long l = _int(abyte0, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #91  <Method int _int(byte[], int)>
	//    3    5:i2l             
	//    4    6:lstore_2        
		return ((long)_int(abyte0, i + 4) << 32) >>> 32 | l << 32;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:iconst_4        
	//    8   10:iadd            
	//    9   11:invokestatic    #91  <Method int _int(byte[], int)>
	//   10   14:i2l             
	//   11   15:bipush          32
	//   12   17:lshl            
	//   13   18:bipush          32
	//   14   20:lushr           
	//   15   21:lload_2         
	//   16   22:bipush          32
	//   17   24:lshl            
	//   18   25:lor             
	//   19   26:lreturn         
	}

	int _badChar(String s, int i, DeserializationContext deserializationcontext, char c)
		throws JsonMappingException
	{
		throw deserializationcontext.weirdStringException(s, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", new Object[] {
			Character.valueOf(c), Integer.toHexString(((int) (c)))
		}));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #36  <Method Class handledType()>
	//    4    6:ldc1            #95  <String "Non-hex character '%c' (value 0x%s), not valid for UUID String">
	//    5    8:iconst_2        
	//    6    9:anewarray       Object[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:iload           4
	//   10   16:invokestatic    #101 <Method Character Character.valueOf(char)>
	//   11   19:aastore         
	//   12   20:dup             
	//   13   21:iconst_1        
	//   14   22:iload           4
	//   15   24:invokestatic    #107 <Method String Integer.toHexString(int)>
	//   16   27:aastore         
	//   17   28:invokestatic    #113 <Method String String.format(String, Object[])>
	//   18   31:invokevirtual   #117 <Method JsonMappingException DeserializationContext.weirdStringException(String, Class, String)>
	//   19   34:athrow          
	}

	protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (_deserialize(s, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #121 <Method UUID _deserialize(String, DeserializationContext)>
	//    4    6:areturn         
	}

	protected UUID _deserialize(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(s.length() != 36)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #125 <Method int String.length()>
	//*   2    4:bipush          36
	//*   3    6:icmpeq          38
			if(s.length() == 24)
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #125 <Method int String.length()>
	//*   6   13:bipush          24
	//*   7   15:icmpne          31
				return _fromBytes(Base64Variants.getDefaultVariant().decode(s), deserializationcontext);
	//    8   18:aload_0         
	//    9   19:invokestatic    #131 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #137 <Method byte[] Base64Variant.decode(String)>
	//   12   26:aload_2         
	//   13   27:invokespecial   #139 <Method UUID _fromBytes(byte[], DeserializationContext)>
	//   14   30:areturn         
			else
				return _badFormat(s, deserializationcontext);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #141 <Method UUID _badFormat(String, DeserializationContext)>
	//   19   37:areturn         
		if(s.charAt(8) != '-' || s.charAt(13) != '-' || s.charAt(18) != '-' || s.charAt(23) != '-')
	//*  20   38:aload_1         
	//*  21   39:bipush          8
	//*  22   41:invokevirtual   #145 <Method char String.charAt(int)>
	//*  23   44:bipush          45
	//*  24   46:icmpne          82
	//*  25   49:aload_1         
	//*  26   50:bipush          13
	//*  27   52:invokevirtual   #145 <Method char String.charAt(int)>
	//*  28   55:bipush          45
	//*  29   57:icmpne          82
	//*  30   60:aload_1         
	//*  31   61:bipush          18
	//*  32   63:invokevirtual   #145 <Method char String.charAt(int)>
	//*  33   66:bipush          45
	//*  34   68:icmpne          82
	//*  35   71:aload_1         
	//*  36   72:bipush          23
	//*  37   74:invokevirtual   #145 <Method char String.charAt(int)>
	//*  38   77:bipush          45
	//*  39   79:icmpeq          89
			_badFormat(s, deserializationcontext);
	//   40   82:aload_0         
	//   41   83:aload_1         
	//   42   84:aload_2         
	//   43   85:invokespecial   #141 <Method UUID _badFormat(String, DeserializationContext)>
	//   44   88:pop             
		long l = intFromChars(s, 0, deserializationcontext);
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:iconst_0        
	//   48   92:aload_2         
	//   49   93:invokevirtual   #149 <Method int intFromChars(String, int, DeserializationContext)>
	//   50   96:i2l             
	//   51   97:lstore          4
		long l1 = shortFromChars(s, 9, deserializationcontext);
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:bipush          9
	//   55  103:aload_2         
	//   56  104:invokevirtual   #152 <Method int shortFromChars(String, int, DeserializationContext)>
	//   57  107:i2l             
	//   58  108:lstore          6
		long l2 = shortFromChars(s, 14, deserializationcontext);
	//   59  110:aload_0         
	//   60  111:aload_1         
	//   61  112:bipush          14
	//   62  114:aload_2         
	//   63  115:invokevirtual   #152 <Method int shortFromChars(String, int, DeserializationContext)>
	//   64  118:i2l             
	//   65  119:lstore          8
		int i = shortFromChars(s, 19, deserializationcontext);
	//   66  121:aload_0         
	//   67  122:aload_1         
	//   68  123:bipush          19
	//   69  125:aload_2         
	//   70  126:invokevirtual   #152 <Method int shortFromChars(String, int, DeserializationContext)>
	//   71  129:istore_3        
		long l3 = shortFromChars(s, 24, deserializationcontext) | i << 16;
	//   72  130:aload_0         
	//   73  131:aload_1         
	//   74  132:bipush          24
	//   75  134:aload_2         
	//   76  135:invokevirtual   #152 <Method int shortFromChars(String, int, DeserializationContext)>
	//   77  138:iload_3         
	//   78  139:bipush          16
	//   79  141:ishl            
	//   80  142:ior             
	//   81  143:i2l             
	//   82  144:lstore          10
		return new UUID((l << 32) + (l1 << 16 | l2), ((long)intFromChars(s, 28, deserializationcontext) << 32) >>> 32 | l3 << 32);
	//   83  146:new             #25  <Class UUID>
	//   84  149:dup             
	//   85  150:lload           4
	//   86  152:bipush          32
	//   87  154:lshl            
	//   88  155:lload           6
	//   89  157:bipush          16
	//   90  159:lshl            
	//   91  160:lload           8
	//   92  162:lor             
	//   93  163:ladd            
	//   94  164:aload_0         
	//   95  165:aload_1         
	//   96  166:bipush          28
	//   97  168:aload_2         
	//   98  169:invokevirtual   #149 <Method int intFromChars(String, int, DeserializationContext)>
	//   99  172:i2l             
	//  100  173:bipush          32
	//  101  175:lshl            
	//  102  176:bipush          32
	//  103  178:lushr           
	//  104  179:lload           10
	//  105  181:bipush          32
	//  106  183:lshl            
	//  107  184:lor             
	//  108  185:invokespecial   #58  <Method void UUID(long, long)>
	//  109  188:areturn         
	}

	protected volatile Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (_deserializeEmbedded(obj, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #157 <Method UUID _deserializeEmbedded(Object, DeserializationContext)>
	//    4    6:areturn         
	}

	protected UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(obj instanceof byte[])
	//*   0    0:aload_1         
	//*   1    1:instanceof      #159 <Class byte[]>
	//*   2    4:ifeq            17
		{
			return _fromBytes((byte[])obj, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #159 <Class byte[]>
	//    6   12:aload_2         
	//    7   13:invokespecial   #139 <Method UUID _fromBytes(byte[], DeserializationContext)>
	//    8   16:areturn         
		} else
		{
			super._deserializeEmbedded(obj, deserializationcontext);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #161 <Method Object FromStringDeserializer._deserializeEmbedded(Object, DeserializationContext)>
	//   13   23:pop             
			return null;
	//   14   24:aconst_null     
	//   15   25:areturn         
		}
	}

	int byteFromChars(String s, int i, DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		char c = s.charAt(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #145 <Method char String.charAt(int)>
	//    3    5:istore          4
		int j = i + 1;
	//    4    7:iload_2         
	//    5    8:iconst_1        
	//    6    9:iadd            
	//    7   10:istore          6
		char c1 = s.charAt(j);
	//    8   12:aload_1         
	//    9   13:iload           6
	//   10   15:invokevirtual   #145 <Method char String.charAt(int)>
	//   11   18:istore          5
		if(c <= '\177' && c1 <= '\177')
	//*  12   20:iload           4
	//*  13   22:bipush          127
	//*  14   24:icmpgt          66
	//*  15   27:iload           5
	//*  16   29:bipush          127
	//*  17   31:icmpgt          66
		{
			int ai[] = HEX_DIGITS;
	//   18   34:getstatic       #15  <Field int[] HEX_DIGITS>
	//   19   37:astore          8
			int k = ai[c];
	//   20   39:aload           8
	//   21   41:iload           4
	//   22   43:iaload          
	//   23   44:istore          7
			k = ai[c1] | k << 4;
	//   24   46:aload           8
	//   25   48:iload           5
	//   26   50:iaload          
	//   27   51:iload           7
	//   28   53:iconst_4        
	//   29   54:ishl            
	//   30   55:ior             
	//   31   56:istore          7
			if(k >= 0)
	//*  32   58:iload           7
	//*  33   60:iflt            66
				return k;
	//   34   63:iload           7
	//   35   65:ireturn         
		}
		if(c <= '\177' && HEX_DIGITS[c] >= 0)
	//*  36   66:iload           4
	//*  37   68:bipush          127
	//*  38   70:icmpgt          96
	//*  39   73:getstatic       #15  <Field int[] HEX_DIGITS>
	//*  40   76:iload           4
	//*  41   78:iaload          
	//*  42   79:ifge            85
	//*  43   82:goto            96
			return _badChar(s, j, deserializationcontext, c1);
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:iload           6
	//   47   89:aload_3         
	//   48   90:iload           5
	//   49   92:invokevirtual   #164 <Method int _badChar(String, int, DeserializationContext, char)>
	//   50   95:ireturn         
		else
			return _badChar(s, i, deserializationcontext, c);
	//   51   96:aload_0         
	//   52   97:aload_1         
	//   53   98:iload_2         
	//   54   99:aload_3         
	//   55  100:iload           4
	//   56  102:invokevirtual   #164 <Method int _badChar(String, int, DeserializationContext, char)>
	//   57  105:ireturn         
	}

	int intFromChars(String s, int i, DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return (byteFromChars(s, i, deserializationcontext) << 24) + (byteFromChars(s, i + 2, deserializationcontext) << 16) + (byteFromChars(s, i + 4, deserializationcontext) << 8) + byteFromChars(s, i + 6, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #166 <Method int byteFromChars(String, int, DeserializationContext)>
	//    5    7:bipush          24
	//    6    9:ishl            
	//    7   10:aload_0         
	//    8   11:aload_1         
	//    9   12:iload_2         
	//   10   13:iconst_2        
	//   11   14:iadd            
	//   12   15:aload_3         
	//   13   16:invokevirtual   #166 <Method int byteFromChars(String, int, DeserializationContext)>
	//   14   19:bipush          16
	//   15   21:ishl            
	//   16   22:iadd            
	//   17   23:aload_0         
	//   18   24:aload_1         
	//   19   25:iload_2         
	//   20   26:iconst_4        
	//   21   27:iadd            
	//   22   28:aload_3         
	//   23   29:invokevirtual   #166 <Method int byteFromChars(String, int, DeserializationContext)>
	//   24   32:bipush          8
	//   25   34:ishl            
	//   26   35:iadd            
	//   27   36:aload_0         
	//   28   37:aload_1         
	//   29   38:iload_2         
	//   30   39:bipush          6
	//   31   41:iadd            
	//   32   42:aload_3         
	//   33   43:invokevirtual   #166 <Method int byteFromChars(String, int, DeserializationContext)>
	//   34   46:iadd            
	//   35   47:ireturn         
	}

	int shortFromChars(String s, int i, DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return (byteFromChars(s, i, deserializationcontext) << 8) + byteFromChars(s, i + 2, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #166 <Method int byteFromChars(String, int, DeserializationContext)>
	//    5    7:bipush          8
	//    6    9:ishl            
	//    7   10:aload_0         
	//    8   11:aload_1         
	//    9   12:iload_2         
	//   10   13:iconst_2        
	//   11   14:iadd            
	//   12   15:aload_3         
	//   13   16:invokevirtual   #166 <Method int byteFromChars(String, int, DeserializationContext)>
	//   14   19:iadd            
	//   15   20:ireturn         
	}

	static final int HEX_DIGITS[];
	private static final long serialVersionUID = 1L;

	static 
	{
		HEX_DIGITS = new int[127];
	//    0    0:bipush          127
	//    1    2:newarray        int[]
	//    2    4:putstatic       #15  <Field int[] HEX_DIGITS>
		Arrays.fill(HEX_DIGITS, -1);
	//    3    7:getstatic       #15  <Field int[] HEX_DIGITS>
	//    4   10:iconst_m1       
	//    5   11:invokestatic    #21  <Method void Arrays.fill(int[], int)>
		boolean flag = false;
	//    6   14:iconst_0        
	//    7   15:istore_2        
		int j = 0;
	//    8   16:iconst_0        
	//    9   17:istore_1        
		int i;
		do
		{
			i = ((int) (flag));
	//   10   18:iload_2         
	//   11   19:istore_0        
			if(j >= 10)
				break;
	//   12   20:iload_1         
	//   13   21:bipush          10
	//   14   23:icmpge          42
			HEX_DIGITS[j + 48] = j;
	//   15   26:getstatic       #15  <Field int[] HEX_DIGITS>
	//   16   29:iload_1         
	//   17   30:bipush          48
	//   18   32:iadd            
	//   19   33:iload_1         
	//   20   34:iastore         
			j++;
	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
		} while(true);
	//   25   39:goto            18
		for(; i < 6; i++)
	//*  26   42:iload_0         
	//*  27   43:bipush          6
	//*  28   45:icmpge          78
		{
			int ai[] = HEX_DIGITS;
	//   29   48:getstatic       #15  <Field int[] HEX_DIGITS>
	//   30   51:astore_3        
			int k = i + 10;
	//   31   52:iload_0         
	//   32   53:bipush          10
	//   33   55:iadd            
	//   34   56:istore_1        
			ai[i + 97] = k;
	//   35   57:aload_3         
	//   36   58:iload_0         
	//   37   59:bipush          97
	//   38   61:iadd            
	//   39   62:iload_1         
	//   40   63:iastore         
			ai[i + 65] = k;
	//   41   64:aload_3         
	//   42   65:iload_0         
	//   43   66:bipush          65
	//   44   68:iadd            
	//   45   69:iload_1         
	//   46   70:iastore         
		}

	//   47   71:iload_0         
	//   48   72:iconst_1        
	//   49   73:iadd            
	//   50   74:istore_0        
	//*  51   75:goto            42
	//*  52   78:return          
	}
}
