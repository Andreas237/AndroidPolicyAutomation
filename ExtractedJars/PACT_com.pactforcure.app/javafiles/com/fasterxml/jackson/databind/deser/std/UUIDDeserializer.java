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

	static int _badChar(String s, int i, DeserializationContext deserializationcontext, char c)
		throws JsonMappingException
	{
		String s1 = String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String: input String '%s'", new Object[] {
			Character.valueOf(c), Integer.toHexString(((int) (c))), s
		});
	//    0    0:ldc1            #34  <String "Non-hex character '%c' (value 0x%s), not valid for UUID String: input String '%s'">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:iload_3         
	//    6    9:invokestatic    #42  <Method Character Character.valueOf(char)>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:iload_3         
	//   11   16:invokestatic    #48  <Method String Integer.toHexString(int)>
	//   12   19:aastore         
	//   13   20:dup             
	//   14   21:iconst_2        
	//   15   22:aload_0         
	//   16   23:aastore         
	//   17   24:invokestatic    #54  <Method String String.format(String, Object[])>
	//   18   27:astore          4
		throw InvalidFormatException.from(deserializationcontext.getParser(), s1, ((Object) (s)), java/util/UUID);
	//   19   29:aload_2         
	//   20   30:invokevirtual   #60  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//   21   33:aload           4
	//   22   35:aload_0         
	//   23   36:ldc1            #25  <Class UUID>
	//   24   38:invokestatic    #66  <Method InvalidFormatException InvalidFormatException.from(com.fasterxml.jackson.core.JsonParser, String, Object, Class)>
	//   25   41:athrow          
	}

	private void _badFormat(String s, DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		throw InvalidFormatException.from(deserializationcontext.getParser(), String.format("UUID has to be represented by standard 36-char representation: input String '%s'", new Object[] {
			s
		}), ((Object) (s)), handledType());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #60  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//    2    4:ldc1            #71  <String "UUID has to be represented by standard 36-char representation: input String '%s'">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:aload_1         
	//    8   13:aastore         
	//    9   14:invokestatic    #54  <Method String String.format(String, Object[])>
	//   10   17:aload_1         
	//   11   18:aload_0         
	//   12   19:invokevirtual   #75  <Method Class handledType()>
	//   13   22:invokestatic    #66  <Method InvalidFormatException InvalidFormatException.from(com.fasterxml.jackson.core.JsonParser, String, Object, Class)>
	//   14   25:athrow          
	}

	private UUID _fromBytes(byte abyte0[], DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		if(abyte0.length != 16)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:bipush          16
	//*   3    4:icmpeq          45
			throw InvalidFormatException.from(deserializationcontext.getParser(), (new StringBuilder()).append("Can only construct UUIDs from byte[16]; got ").append(abyte0.length).append(" bytes").toString(), ((Object) (abyte0)), handledType());
	//    4    7:aload_2         
	//    5    8:invokevirtual   #60  <Method com.fasterxml.jackson.core.JsonParser DeserializationContext.getParser()>
	//    6   11:new             #79  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #81  <Method void StringBuilder()>
	//    9   18:ldc1            #83  <String "Can only construct UUIDs from byte[16]; got ">
	//   10   20:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:aload_1         
	//   12   24:arraylength     
	//   13   25:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
	//   14   28:ldc1            #92  <String " bytes">
	//   15   30:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   17   36:aload_1         
	//   18   37:aload_0         
	//   19   38:invokevirtual   #75  <Method Class handledType()>
	//   20   41:invokestatic    #66  <Method InvalidFormatException InvalidFormatException.from(com.fasterxml.jackson.core.JsonParser, String, Object, Class)>
	//   21   44:athrow          
		else
			return new UUID(_long(abyte0, 0), _long(abyte0, 8));
	//   22   45:new             #25  <Class UUID>
	//   23   48:dup             
	//   24   49:aload_1         
	//   25   50:iconst_0        
	//   26   51:invokestatic    #100 <Method long _long(byte[], int)>
	//   27   54:aload_1         
	//   28   55:bipush          8
	//   29   57:invokestatic    #100 <Method long _long(byte[], int)>
	//   30   60:invokespecial   #103 <Method void UUID(long, long)>
	//   31   63:areturn         
	}

	private static int _int(byte abyte0[], int i)
	{
		return abyte0[i] << 24 | (abyte0[i + 1] & 0xff) << 16 | (abyte0[i + 2] & 0xff) << 8 | abyte0[i + 3] & 0xff;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:bipush          24
	//    4    5:ishl            
	//    5    6:aload_0         
	//    6    7:iload_1         
	//    7    8:iconst_1        
	//    8    9:iadd            
	//    9   10:baload          
	//   10   11:sipush          255
	//   11   14:iand            
	//   12   15:bipush          16
	//   13   17:ishl            
	//   14   18:ior             
	//   15   19:aload_0         
	//   16   20:iload_1         
	//   17   21:iconst_2        
	//   18   22:iadd            
	//   19   23:baload          
	//   20   24:sipush          255
	//   21   27:iand            
	//   22   28:bipush          8
	//   23   30:ishl            
	//   24   31:ior             
	//   25   32:aload_0         
	//   26   33:iload_1         
	//   27   34:iconst_3        
	//   28   35:iadd            
	//   29   36:baload          
	//   30   37:sipush          255
	//   31   40:iand            
	//   32   41:ior             
	//   33   42:ireturn         
	}

	private static long _long(byte abyte0[], int i)
	{
		return (long)_int(abyte0, i) << 32 | ((long)_int(abyte0, i + 4) << 32) >>> 32;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #107 <Method int _int(byte[], int)>
	//    3    5:i2l             
	//    4    6:bipush          32
	//    5    8:lshl            
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iconst_4        
	//    9   12:iadd            
	//   10   13:invokestatic    #107 <Method int _int(byte[], int)>
	//   11   16:i2l             
	//   12   17:bipush          32
	//   13   19:lshl            
	//   14   20:bipush          32
	//   15   22:lushr           
	//   16   23:lor             
	//   17   24:lreturn         
	}

	static int byteFromChars(String s, int i, DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		char c = s.charAt(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #113 <Method char String.charAt(int)>
	//    3    5:istore_3        
		char c1 = s.charAt(i + 1);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_1        
	//    7    9:iadd            
	//    8   10:invokevirtual   #113 <Method char String.charAt(int)>
	//    9   13:istore          4
		if(c <= '\177' && c1 <= '\177')
	//*  10   15:iload_3         
	//*  11   16:bipush          127
	//*  12   18:icmpgt          52
	//*  13   21:iload           4
	//*  14   23:bipush          127
	//*  15   25:icmpgt          52
		{
			int j = HEX_DIGITS[c] << 4 | HEX_DIGITS[c1];
	//   16   28:getstatic       #15  <Field int[] HEX_DIGITS>
	//   17   31:iload_3         
	//   18   32:iaload          
	//   19   33:iconst_4        
	//   20   34:ishl            
	//   21   35:getstatic       #15  <Field int[] HEX_DIGITS>
	//   22   38:iload           4
	//   23   40:iaload          
	//   24   41:ior             
	//   25   42:istore          5
			if(j >= 0)
	//*  26   44:iload           5
	//*  27   46:iflt            52
				return j;
	//   28   49:iload           5
	//   29   51:ireturn         
		}
		if(c > '\177' || HEX_DIGITS[c] < 0)
	//*  30   52:iload_3         
	//*  31   53:bipush          127
	//*  32   55:icmpgt          66
	//*  33   58:getstatic       #15  <Field int[] HEX_DIGITS>
	//*  34   61:iload_3         
	//*  35   62:iaload          
	//*  36   63:ifge            74
			return _badChar(s, i, deserializationcontext, c);
	//   37   66:aload_0         
	//   38   67:iload_1         
	//   39   68:aload_2         
	//   40   69:iload_3         
	//   41   70:invokestatic    #115 <Method int _badChar(String, int, DeserializationContext, char)>
	//   42   73:ireturn         
		else
			return _badChar(s, i + 1, deserializationcontext, c1);
	//   43   74:aload_0         
	//   44   75:iload_1         
	//   45   76:iconst_1        
	//   46   77:iadd            
	//   47   78:aload_2         
	//   48   79:iload           4
	//   49   81:invokestatic    #115 <Method int _badChar(String, int, DeserializationContext, char)>
	//   50   84:ireturn         
	}

	static int intFromChars(String s, int i, DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return (byteFromChars(s, i, deserializationcontext) << 24) + (byteFromChars(s, i + 2, deserializationcontext) << 16) + (byteFromChars(s, i + 4, deserializationcontext) << 8) + byteFromChars(s, i + 6, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #118 <Method int byteFromChars(String, int, DeserializationContext)>
	//    4    6:bipush          24
	//    5    8:ishl            
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iconst_2        
	//    9   12:iadd            
	//   10   13:aload_2         
	//   11   14:invokestatic    #118 <Method int byteFromChars(String, int, DeserializationContext)>
	//   12   17:bipush          16
	//   13   19:ishl            
	//   14   20:iadd            
	//   15   21:aload_0         
	//   16   22:iload_1         
	//   17   23:iconst_4        
	//   18   24:iadd            
	//   19   25:aload_2         
	//   20   26:invokestatic    #118 <Method int byteFromChars(String, int, DeserializationContext)>
	//   21   29:bipush          8
	//   22   31:ishl            
	//   23   32:iadd            
	//   24   33:aload_0         
	//   25   34:iload_1         
	//   26   35:bipush          6
	//   27   37:iadd            
	//   28   38:aload_2         
	//   29   39:invokestatic    #118 <Method int byteFromChars(String, int, DeserializationContext)>
	//   30   42:iadd            
	//   31   43:ireturn         
	}

	static int shortFromChars(String s, int i, DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return (byteFromChars(s, i, deserializationcontext) << 8) + byteFromChars(s, i + 2, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #118 <Method int byteFromChars(String, int, DeserializationContext)>
	//    4    6:bipush          8
	//    5    8:ishl            
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iconst_2        
	//    9   12:iadd            
	//   10   13:aload_2         
	//   11   14:invokestatic    #118 <Method int byteFromChars(String, int, DeserializationContext)>
	//   12   17:iadd            
	//   13   18:ireturn         
	}

	protected volatile Object _deserialize(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (_deserialize(s, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #126 <Method UUID _deserialize(String, DeserializationContext)>
	//    4    6:areturn         
	}

	protected UUID _deserialize(String s, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(s.length() != 36)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #130 <Method int String.length()>
	//*   2    4:bipush          36
	//*   3    6:icmpeq          37
		{
			if(s.length() == 24)
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #130 <Method int String.length()>
	//*   6   13:bipush          24
	//*   7   15:icmpne          31
				return _fromBytes(Base64Variants.getDefaultVariant().decode(s), deserializationcontext);
	//    8   18:aload_0         
	//    9   19:invokestatic    #136 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #142 <Method byte[] Base64Variant.decode(String)>
	//   12   26:aload_2         
	//   13   27:invokespecial   #144 <Method UUID _fromBytes(byte[], DeserializationContext)>
	//   14   30:areturn         
			_badFormat(s, deserializationcontext);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #146 <Method void _badFormat(String, DeserializationContext)>
		}
		if(s.charAt(8) != '-' || s.charAt(13) != '-' || s.charAt(18) != '-' || s.charAt(23) != '-')
	//*  19   37:aload_1         
	//*  20   38:bipush          8
	//*  21   40:invokevirtual   #113 <Method char String.charAt(int)>
	//*  22   43:bipush          45
	//*  23   45:icmpne          81
	//*  24   48:aload_1         
	//*  25   49:bipush          13
	//*  26   51:invokevirtual   #113 <Method char String.charAt(int)>
	//*  27   54:bipush          45
	//*  28   56:icmpne          81
	//*  29   59:aload_1         
	//*  30   60:bipush          18
	//*  31   62:invokevirtual   #113 <Method char String.charAt(int)>
	//*  32   65:bipush          45
	//*  33   67:icmpne          81
	//*  34   70:aload_1         
	//*  35   71:bipush          23
	//*  36   73:invokevirtual   #113 <Method char String.charAt(int)>
	//*  37   76:bipush          45
	//*  38   78:icmpeq          87
			_badFormat(s, deserializationcontext);
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:aload_2         
	//   42   84:invokespecial   #146 <Method void _badFormat(String, DeserializationContext)>
		return new UUID(((long)intFromChars(s, 0, deserializationcontext) << 32) + ((long)shortFromChars(s, 9, deserializationcontext) << 16 | (long)shortFromChars(s, 14, deserializationcontext)), (long)(shortFromChars(s, 19, deserializationcontext) << 16 | shortFromChars(s, 24, deserializationcontext)) << 32 | ((long)intFromChars(s, 28, deserializationcontext) << 32) >>> 32);
	//   43   87:new             #25  <Class UUID>
	//   44   90:dup             
	//   45   91:aload_1         
	//   46   92:iconst_0        
	//   47   93:aload_2         
	//   48   94:invokestatic    #148 <Method int intFromChars(String, int, DeserializationContext)>
	//   49   97:i2l             
	//   50   98:bipush          32
	//   51  100:lshl            
	//   52  101:aload_1         
	//   53  102:bipush          9
	//   54  104:aload_2         
	//   55  105:invokestatic    #150 <Method int shortFromChars(String, int, DeserializationContext)>
	//   56  108:i2l             
	//   57  109:bipush          16
	//   58  111:lshl            
	//   59  112:aload_1         
	//   60  113:bipush          14
	//   61  115:aload_2         
	//   62  116:invokestatic    #150 <Method int shortFromChars(String, int, DeserializationContext)>
	//   63  119:i2l             
	//   64  120:lor             
	//   65  121:ladd            
	//   66  122:aload_1         
	//   67  123:bipush          19
	//   68  125:aload_2         
	//   69  126:invokestatic    #150 <Method int shortFromChars(String, int, DeserializationContext)>
	//   70  129:bipush          16
	//   71  131:ishl            
	//   72  132:aload_1         
	//   73  133:bipush          24
	//   74  135:aload_2         
	//   75  136:invokestatic    #150 <Method int shortFromChars(String, int, DeserializationContext)>
	//   76  139:ior             
	//   77  140:i2l             
	//   78  141:bipush          32
	//   79  143:lshl            
	//   80  144:aload_1         
	//   81  145:bipush          28
	//   82  147:aload_2         
	//   83  148:invokestatic    #148 <Method int intFromChars(String, int, DeserializationContext)>
	//   84  151:i2l             
	//   85  152:bipush          32
	//   86  154:lshl            
	//   87  155:bipush          32
	//   88  157:lushr           
	//   89  158:lor             
	//   90  159:invokespecial   #103 <Method void UUID(long, long)>
	//   91  162:areturn         
	}

	protected volatile Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
		throws IOException
	{
		return ((Object) (_deserializeEmbedded(obj, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #155 <Method UUID _deserializeEmbedded(Object, DeserializationContext)>
	//    4    6:areturn         
	}

	protected UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(obj instanceof byte[])
	//*   0    0:aload_1         
	//*   1    1:instanceof      #157 <Class byte[]>
	//*   2    4:ifeq            20
		{
			return _fromBytes((byte[])(byte[])obj, deserializationcontext);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #157 <Class byte[]>
	//    6   12:checkcast       #157 <Class byte[]>
	//    7   15:aload_2         
	//    8   16:invokespecial   #144 <Method UUID _fromBytes(byte[], DeserializationContext)>
	//    9   19:areturn         
		} else
		{
			super._deserializeEmbedded(obj, deserializationcontext);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #159 <Method Object FromStringDeserializer._deserializeEmbedded(Object, DeserializationContext)>
	//   14   26:pop             
			return null;
	//   15   27:aconst_null     
	//   16   28:areturn         
		}
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
		for(int i = 0; i < 10; i++)
	//*   6   14:iconst_0        
	//*   7   15:istore_0        
	//*   8   16:iload_0         
	//*   9   17:bipush          10
	//*  10   19:icmpge          38
			HEX_DIGITS[i + 48] = i;
	//   11   22:getstatic       #15  <Field int[] HEX_DIGITS>
	//   12   25:iload_0         
	//   13   26:bipush          48
	//   14   28:iadd            
	//   15   29:iload_0         
	//   16   30:iastore         

	//   17   31:iload_0         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_0        
	//*  21   35:goto            16
		for(int j = 0; j < 6; j++)
	//*  22   38:iconst_0        
	//*  23   39:istore_0        
	//*  24   40:iload_0         
	//*  25   41:bipush          6
	//*  26   43:icmpge          77
		{
			HEX_DIGITS[j + 97] = j + 10;
	//   27   46:getstatic       #15  <Field int[] HEX_DIGITS>
	//   28   49:iload_0         
	//   29   50:bipush          97
	//   30   52:iadd            
	//   31   53:iload_0         
	//   32   54:bipush          10
	//   33   56:iadd            
	//   34   57:iastore         
			HEX_DIGITS[j + 65] = j + 10;
	//   35   58:getstatic       #15  <Field int[] HEX_DIGITS>
	//   36   61:iload_0         
	//   37   62:bipush          65
	//   38   64:iadd            
	//   39   65:iload_0         
	//   40   66:bipush          10
	//   41   68:iadd            
	//   42   69:iastore         
		}

	//   43   70:iload_0         
	//   44   71:iconst_1        
	//   45   72:iadd            
	//   46   73:istore_0        
	//*  47   74:goto            40
	//*  48   77:return          
	}
}
