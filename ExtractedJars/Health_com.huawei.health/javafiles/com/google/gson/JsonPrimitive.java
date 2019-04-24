// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.google.gson:
//			JsonElement

public final class JsonPrimitive extends JsonElement
{

	public JsonPrimitive(Boolean boolean1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void JsonElement()>
		setValue(((Object) (boolean1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method void setValue(Object)>
	//    5    9:return          
	}

	public JsonPrimitive(Character character)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void JsonElement()>
		setValue(((Object) (character)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method void setValue(Object)>
	//    5    9:return          
	}

	public JsonPrimitive(Number number)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void JsonElement()>
		setValue(((Object) (number)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method void setValue(Object)>
	//    5    9:return          
	}

	JsonPrimitive(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void JsonElement()>
		setValue(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method void setValue(Object)>
	//    5    9:return          
	}

	public JsonPrimitive(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void JsonElement()>
		setValue(((Object) (s)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method void setValue(Object)>
	//    5    9:return          
	}

	private static boolean isIntegral(JsonPrimitive jsonprimitive)
	{
		if(jsonprimitive.value instanceof Number)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object value>
	//*   2    4:instanceof      #60  <Class Number>
	//*   3    7:ifeq            57
		{
			jsonprimitive = ((JsonPrimitive) ((Number)jsonprimitive.value));
	//    4   10:aload_0         
	//    5   11:getfield        #58  <Field Object value>
	//    6   14:checkcast       #60  <Class Number>
	//    7   17:astore_0        
			return (jsonprimitive instanceof BigInteger) || (jsonprimitive instanceof Long) || (jsonprimitive instanceof Integer) || (jsonprimitive instanceof Short) || (jsonprimitive instanceof Byte);
	//    8   18:aload_0         
	//    9   19:instanceof      #62  <Class BigInteger>
	//   10   22:ifne            53
	//   11   25:aload_0         
	//   12   26:instanceof      #21  <Class Long>
	//   13   29:ifne            53
	//   14   32:aload_0         
	//   15   33:instanceof      #15  <Class Integer>
	//   16   36:ifne            53
	//   17   39:aload_0         
	//   18   40:instanceof      #24  <Class Short>
	//   19   43:ifne            53
	//   20   46:aload_0         
	//   21   47:instanceof      #33  <Class Byte>
	//   22   50:ifeq            55
	//   23   53:iconst_1        
	//   24   54:ireturn         
	//   25   55:iconst_0        
	//   26   56:ireturn         
		} else
		{
			return false;
	//   27   57:iconst_0        
	//   28   58:ireturn         
		}
	}

	private static boolean isPrimitiveOrString(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #66  <Class String>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		obj = ((Object) (obj.getClass()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #72  <Method Class Object.getClass()>
	//    7   13:astore_0        
		Class aclass[] = PRIMITIVE_TYPES;
	//    8   14:getstatic       #42  <Field Class[] PRIMITIVE_TYPES>
	//    9   17:astore_3        
		int j = aclass.length;
	//   10   18:aload_3         
	//   11   19:arraylength     
	//   12   20:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   21:iconst_0        
	//*  14   22:istore_1        
	//*  15   23:iload_1         
	//*  16   24:iload_2         
	//*  17   25:icmpge          47
			if(aclass[i].isAssignableFrom(((Class) (obj))))
	//*  18   28:aload_3         
	//*  19   29:iload_1         
	//*  20   30:aaload          
	//*  21   31:aload_0         
	//*  22   32:invokevirtual   #76  <Method boolean Class.isAssignableFrom(Class)>
	//*  23   35:ifeq            40
				return true;
	//   24   38:iconst_1        
	//   25   39:ireturn         

	//   26   40:iload_1         
	//   27   41:iconst_1        
	//   28   42:iadd            
	//   29   43:istore_1        
	//*  30   44:goto            23
		return false;
	//   31   47:iconst_0        
	//   32   48:ireturn         
	}

	public volatile JsonElement deepCopy()
	{
		return ((JsonElement) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method JsonPrimitive deepCopy()>
	//    2    4:areturn         
	}

	public JsonPrimitive deepCopy()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #72  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #72  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((JsonPrimitive)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class JsonPrimitive>
	//   16   28:astore_1        
		if(value == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #58  <Field Object value>
	//*  19   33:ifnonnull       47
			return ((JsonPrimitive) (obj)).value == null;
	//   20   36:aload_1         
	//   21   37:getfield        #58  <Field Object value>
	//   22   40:ifnonnull       45
	//   23   43:iconst_1        
	//   24   44:ireturn         
	//   25   45:iconst_0        
	//   26   46:ireturn         
		if(isIntegral(this) && isIntegral(((JsonPrimitive) (obj))))
	//*  27   47:aload_0         
	//*  28   48:invokestatic    #84  <Method boolean isIntegral(JsonPrimitive)>
	//*  29   51:ifeq            83
	//*  30   54:aload_1         
	//*  31   55:invokestatic    #84  <Method boolean isIntegral(JsonPrimitive)>
	//*  32   58:ifeq            83
			return getAsNumber().longValue() == ((JsonPrimitive) (obj)).getAsNumber().longValue();
	//   33   61:aload_0         
	//   34   62:invokevirtual   #88  <Method Number getAsNumber()>
	//   35   65:invokevirtual   #92  <Method long Number.longValue()>
	//   36   68:aload_1         
	//   37   69:invokevirtual   #88  <Method Number getAsNumber()>
	//   38   72:invokevirtual   #92  <Method long Number.longValue()>
	//   39   75:lcmp            
	//   40   76:ifne            81
	//   41   79:iconst_1        
	//   42   80:ireturn         
	//   43   81:iconst_0        
	//   44   82:ireturn         
		if((value instanceof Number) && (((JsonPrimitive) (obj)).value instanceof Number))
	//*  45   83:aload_0         
	//*  46   84:getfield        #58  <Field Object value>
	//*  47   87:instanceof      #60  <Class Number>
	//*  48   90:ifeq            146
	//*  49   93:aload_1         
	//*  50   94:getfield        #58  <Field Object value>
	//*  51   97:instanceof      #60  <Class Number>
	//*  52  100:ifeq            146
		{
			double d = getAsNumber().doubleValue();
	//   53  103:aload_0         
	//   54  104:invokevirtual   #88  <Method Number getAsNumber()>
	//   55  107:invokevirtual   #96  <Method double Number.doubleValue()>
	//   56  110:dstore_2        
			double d1 = ((JsonPrimitive) (obj)).getAsNumber().doubleValue();
	//   57  111:aload_1         
	//   58  112:invokevirtual   #88  <Method Number getAsNumber()>
	//   59  115:invokevirtual   #96  <Method double Number.doubleValue()>
	//   60  118:dstore          4
			return d == d1 || Double.isNaN(d) && Double.isNaN(d1);
	//   61  120:dload_2         
	//   62  121:dload           4
	//   63  123:dcmpl           
	//   64  124:ifeq            142
	//   65  127:dload_2         
	//   66  128:invokestatic    #100 <Method boolean Double.isNaN(double)>
	//   67  131:ifeq            144
	//   68  134:dload           4
	//   69  136:invokestatic    #100 <Method boolean Double.isNaN(double)>
	//   70  139:ifeq            144
	//   71  142:iconst_1        
	//   72  143:ireturn         
	//   73  144:iconst_0        
	//   74  145:ireturn         
		} else
		{
			return value.equals(((JsonPrimitive) (obj)).value);
	//   75  146:aload_0         
	//   76  147:getfield        #58  <Field Object value>
	//   77  150:aload_1         
	//   78  151:getfield        #58  <Field Object value>
	//   79  154:invokevirtual   #102 <Method boolean Object.equals(Object)>
	//   80  157:ireturn         
		}
	}

	public BigDecimal getAsBigDecimal()
	{
		if(value instanceof BigDecimal)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object value>
	//*   2    4:instanceof      #106 <Class BigDecimal>
	//*   3    7:ifeq            18
			return (BigDecimal)value;
	//    4   10:aload_0         
	//    5   11:getfield        #58  <Field Object value>
	//    6   14:checkcast       #106 <Class BigDecimal>
	//    7   17:areturn         
		else
			return new BigDecimal(value.toString());
	//    8   18:new             #106 <Class BigDecimal>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #58  <Field Object value>
	//   12   26:invokevirtual   #110 <Method String Object.toString()>
	//   13   29:invokespecial   #112 <Method void BigDecimal(String)>
	//   14   32:areturn         
	}

	public BigInteger getAsBigInteger()
	{
		if(value instanceof BigInteger)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object value>
	//*   2    4:instanceof      #62  <Class BigInteger>
	//*   3    7:ifeq            18
			return (BigInteger)value;
	//    4   10:aload_0         
	//    5   11:getfield        #58  <Field Object value>
	//    6   14:checkcast       #62  <Class BigInteger>
	//    7   17:areturn         
		else
			return new BigInteger(value.toString());
	//    8   18:new             #62  <Class BigInteger>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #58  <Field Object value>
	//   12   26:invokevirtual   #110 <Method String Object.toString()>
	//   13   29:invokespecial   #115 <Method void BigInteger(String)>
	//   14   32:areturn         
	}

	public boolean getAsBoolean()
	{
		if(isBoolean())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #120 <Method boolean isBoolean()>
	//*   2    4:ifeq            15
			return getAsBooleanWrapper().booleanValue();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #124 <Method Boolean getAsBooleanWrapper()>
	//    5   11:invokevirtual   #127 <Method boolean Boolean.booleanValue()>
	//    6   14:ireturn         
		else
			return Boolean.parseBoolean(getAsString());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #130 <Method String getAsString()>
	//    9   19:invokestatic    #134 <Method boolean Boolean.parseBoolean(String)>
	//   10   22:ireturn         
	}

	Boolean getAsBooleanWrapper()
	{
		return (Boolean)value;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object value>
	//    2    4:checkcast       #36  <Class Boolean>
	//    3    7:areturn         
	}

	public byte getAsByte()
	{
		if(isNumber())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method boolean isNumber()>
	//*   2    4:ifeq            15
			return getAsNumber().byteValue();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #88  <Method Number getAsNumber()>
	//    5   11:invokevirtual   #142 <Method byte Number.byteValue()>
	//    6   14:ireturn         
		else
			return Byte.parseByte(getAsString());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #130 <Method String getAsString()>
	//    9   19:invokestatic    #146 <Method byte Byte.parseByte(String)>
	//   10   22:ireturn         
	}

	public char getAsCharacter()
	{
		return getAsString().charAt(0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method String getAsString()>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #152 <Method char String.charAt(int)>
	//    4    8:ireturn         
	}

	public double getAsDouble()
	{
		if(isNumber())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method boolean isNumber()>
	//*   2    4:ifeq            15
			return getAsNumber().doubleValue();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #88  <Method Number getAsNumber()>
	//    5   11:invokevirtual   #96  <Method double Number.doubleValue()>
	//    6   14:dreturn         
		else
			return Double.parseDouble(getAsString());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #130 <Method String getAsString()>
	//    9   19:invokestatic    #157 <Method double Double.parseDouble(String)>
	//   10   22:dreturn         
	}

	public float getAsFloat()
	{
		if(isNumber())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method boolean isNumber()>
	//*   2    4:ifeq            15
			return getAsNumber().floatValue();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #88  <Method Number getAsNumber()>
	//    5   11:invokevirtual   #162 <Method float Number.floatValue()>
	//    6   14:freturn         
		else
			return Float.parseFloat(getAsString());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #130 <Method String getAsString()>
	//    9   19:invokestatic    #166 <Method float Float.parseFloat(String)>
	//   10   22:freturn         
	}

	public int getAsInt()
	{
		if(isNumber())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method boolean isNumber()>
	//*   2    4:ifeq            15
			return getAsNumber().intValue();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #88  <Method Number getAsNumber()>
	//    5   11:invokevirtual   #171 <Method int Number.intValue()>
	//    6   14:ireturn         
		else
			return Integer.parseInt(getAsString());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #130 <Method String getAsString()>
	//    9   19:invokestatic    #175 <Method int Integer.parseInt(String)>
	//   10   22:ireturn         
	}

	public long getAsLong()
	{
		if(isNumber())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method boolean isNumber()>
	//*   2    4:ifeq            15
			return getAsNumber().longValue();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #88  <Method Number getAsNumber()>
	//    5   11:invokevirtual   #92  <Method long Number.longValue()>
	//    6   14:lreturn         
		else
			return Long.parseLong(getAsString());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #130 <Method String getAsString()>
	//    9   19:invokestatic    #180 <Method long Long.parseLong(String)>
	//   10   22:lreturn         
	}

	public Number getAsNumber()
	{
		if(value instanceof String)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object value>
	//*   2    4:instanceof      #66  <Class String>
	//*   3    7:ifeq            25
			return ((Number) (new LazilyParsedNumber((String)value)));
	//    4   10:new             #182 <Class LazilyParsedNumber>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #58  <Field Object value>
	//    8   18:checkcast       #66  <Class String>
	//    9   21:invokespecial   #183 <Method void LazilyParsedNumber(String)>
	//   10   24:areturn         
		else
			return (Number)value;
	//   11   25:aload_0         
	//   12   26:getfield        #58  <Field Object value>
	//   13   29:checkcast       #60  <Class Number>
	//   14   32:areturn         
	}

	public short getAsShort()
	{
		if(isNumber())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method boolean isNumber()>
	//*   2    4:ifeq            15
			return getAsNumber().shortValue();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #88  <Method Number getAsNumber()>
	//    5   11:invokevirtual   #188 <Method short Number.shortValue()>
	//    6   14:ireturn         
		else
			return Short.parseShort(getAsString());
	//    7   15:aload_0         
	//    8   16:invokevirtual   #130 <Method String getAsString()>
	//    9   19:invokestatic    #192 <Method short Short.parseShort(String)>
	//   10   22:ireturn         
	}

	public String getAsString()
	{
		if(isNumber())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #139 <Method boolean isNumber()>
	//*   2    4:ifeq            15
			return ((Object) (getAsNumber())).toString();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #88  <Method Number getAsNumber()>
	//    5   11:invokevirtual   #110 <Method String Object.toString()>
	//    6   14:areturn         
		if(isBoolean())
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #120 <Method boolean isBoolean()>
	//*   9   19:ifeq            30
			return getAsBooleanWrapper().toString();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #124 <Method Boolean getAsBooleanWrapper()>
	//   12   26:invokevirtual   #193 <Method String Boolean.toString()>
	//   13   29:areturn         
		else
			return (String)value;
	//   14   30:aload_0         
	//   15   31:getfield        #58  <Field Object value>
	//   16   34:checkcast       #66  <Class String>
	//   17   37:areturn         
	}

	public int hashCode()
	{
		if(value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object value>
	//*   2    4:ifnonnull       10
			return 31;
	//    3    7:bipush          31
	//    4    9:ireturn         
		if(isIntegral(this))
	//*   5   10:aload_0         
	//*   6   11:invokestatic    #84  <Method boolean isIntegral(JsonPrimitive)>
	//*   7   14:ifeq            33
		{
			long l = getAsNumber().longValue();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #88  <Method Number getAsNumber()>
	//   10   21:invokevirtual   #92  <Method long Number.longValue()>
	//   11   24:lstore_1        
			return (int)(l >>> 32 ^ l);
	//   12   25:lload_1         
	//   13   26:bipush          32
	//   14   28:lushr           
	//   15   29:lload_1         
	//   16   30:lxor            
	//   17   31:l2i             
	//   18   32:ireturn         
		}
		if(value instanceof Number)
	//*  19   33:aload_0         
	//*  20   34:getfield        #58  <Field Object value>
	//*  21   37:instanceof      #60  <Class Number>
	//*  22   40:ifeq            62
		{
			long l1 = Double.doubleToLongBits(getAsNumber().doubleValue());
	//   23   43:aload_0         
	//   24   44:invokevirtual   #88  <Method Number getAsNumber()>
	//   25   47:invokevirtual   #96  <Method double Number.doubleValue()>
	//   26   50:invokestatic    #198 <Method long Double.doubleToLongBits(double)>
	//   27   53:lstore_1        
			return (int)(l1 >>> 32 ^ l1);
	//   28   54:lload_1         
	//   29   55:bipush          32
	//   30   57:lushr           
	//   31   58:lload_1         
	//   32   59:lxor            
	//   33   60:l2i             
	//   34   61:ireturn         
		} else
		{
			return value.hashCode();
	//   35   62:aload_0         
	//   36   63:getfield        #58  <Field Object value>
	//   37   66:invokevirtual   #200 <Method int Object.hashCode()>
	//   38   69:ireturn         
		}
	}

	public boolean isBoolean()
	{
		return value instanceof Boolean;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object value>
	//    2    4:instanceof      #36  <Class Boolean>
	//    3    7:ireturn         
	}

	public boolean isNumber()
	{
		return value instanceof Number;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object value>
	//    2    4:instanceof      #60  <Class Number>
	//    3    7:ireturn         
	}

	public boolean isString()
	{
		return value instanceof String;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object value>
	//    2    4:instanceof      #66  <Class String>
	//    3    7:ireturn         
	}

	void setValue(Object obj)
	{
		if(obj instanceof Character)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #39  <Class Character>
	//*   2    4:ifeq            22
		{
			value = ((Object) (String.valueOf(((Character)obj).charValue())));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #39  <Class Character>
	//    6   12:invokevirtual   #204 <Method char Character.charValue()>
	//    7   15:invokestatic    #208 <Method String String.valueOf(char)>
	//    8   18:putfield        #58  <Field Object value>
			return;
	//    9   21:return          
		}
		boolean flag;
		if((obj instanceof Number) || isPrimitiveOrString(obj))
	//*  10   22:aload_1         
	//*  11   23:instanceof      #60  <Class Number>
	//*  12   26:ifne            36
	//*  13   29:aload_1         
	//*  14   30:invokestatic    #210 <Method boolean isPrimitiveOrString(Object)>
	//*  15   33:ifeq            41
			flag = true;
	//   16   36:iconst_1        
	//   17   37:istore_2        
		else
	//*  18   38:goto            43
			flag = false;
	//   19   41:iconst_0        
	//   20   42:istore_2        
		com.google.gson.internal..Gson.Preconditions.checkArgument(flag);
	//   21   43:iload_2         
	//   22   44:invokestatic    #216 <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
		value = obj;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:putfield        #58  <Field Object value>
	//   26   52:return          
	}

	private static final Class PRIMITIVE_TYPES[];
	private Object value;

	static 
	{
		PRIMITIVE_TYPES = (new Class[] {
			Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, java/lang/Integer, java/lang/Long, 
			java/lang/Short, java/lang/Float, java/lang/Double, java/lang/Byte, java/lang/Boolean, java/lang/Character
		});
	//    0    0:bipush          16
	//    1    2:anewarray       Class[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:getstatic       #19  <Field Class Integer.TYPE>
	//    5   10:aastore         
	//    6   11:dup             
	//    7   12:iconst_1        
	//    8   13:getstatic       #22  <Field Class Long.TYPE>
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_2        
	//   12   19:getstatic       #25  <Field Class Short.TYPE>
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_3        
	//   16   25:getstatic       #28  <Field Class Float.TYPE>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_4        
	//   20   31:getstatic       #31  <Field Class Double.TYPE>
	//   21   34:aastore         
	//   22   35:dup             
	//   23   36:iconst_5        
	//   24   37:getstatic       #34  <Field Class Byte.TYPE>
	//   25   40:aastore         
	//   26   41:dup             
	//   27   42:bipush          6
	//   28   44:getstatic       #37  <Field Class Boolean.TYPE>
	//   29   47:aastore         
	//   30   48:dup             
	//   31   49:bipush          7
	//   32   51:getstatic       #40  <Field Class Character.TYPE>
	//   33   54:aastore         
	//   34   55:dup             
	//   35   56:bipush          8
	//   36   58:ldc1            #15  <Class Integer>
	//   37   60:aastore         
	//   38   61:dup             
	//   39   62:bipush          9
	//   40   64:ldc1            #21  <Class Long>
	//   41   66:aastore         
	//   42   67:dup             
	//   43   68:bipush          10
	//   44   70:ldc1            #24  <Class Short>
	//   45   72:aastore         
	//   46   73:dup             
	//   47   74:bipush          11
	//   48   76:ldc1            #27  <Class Float>
	//   49   78:aastore         
	//   50   79:dup             
	//   51   80:bipush          12
	//   52   82:ldc1            #30  <Class Double>
	//   53   84:aastore         
	//   54   85:dup             
	//   55   86:bipush          13
	//   56   88:ldc1            #33  <Class Byte>
	//   57   90:aastore         
	//   58   91:dup             
	//   59   92:bipush          14
	//   60   94:ldc1            #36  <Class Boolean>
	//   61   96:aastore         
	//   62   97:dup             
	//   63   98:bipush          15
	//   64  100:ldc1            #39  <Class Character>
	//   65  102:aastore         
	//   66  103:putstatic       #42  <Field Class[] PRIMITIVE_TYPES>
	//*  67  106:return          
	}
}
