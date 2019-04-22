// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.net.InetAddress;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class InetAddressSerializer extends StdScalarSerializer
	implements ContextualSerializer
{

	public InetAddressSerializer()
	{
		this(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #14  <Method void InetAddressSerializer(boolean)>
	//    3    5:return          
	}

	public InetAddressSerializer(boolean flag)
	{
		super(java/net/InetAddress);
	//    0    0:aload_0         
	//    1    1:ldc1            #17  <Class InetAddress>
	//    2    3:invokespecial   #20  <Method void StdScalarSerializer(Class)>
		_asNumeric = flag;
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:putfield        #22  <Field boolean _asNumeric>
	//    6   11:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		boolean flag;
label0:
		{
			serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #30  <Method Class handledType()>
	//    5    7:invokevirtual   #34  <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//    6   10:astore_1        
			if(serializerprovider != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          39
			{
				serializerprovider = ((SerializerProvider) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape()));
	//    9   15:aload_1         
	//   10   16:invokevirtual   #40  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//   11   19:astore_1        
				if(((com.fasterxml.jackson.annotation.JsonFormat.Shape) (serializerprovider)).isNumeric() || serializerprovider == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #46  <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Shape.isNumeric()>
	//*  14   24:ifne            34
	//*  15   27:aload_1         
	//*  16   28:getstatic       #50  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
	//*  17   31:if_acmpne       39
				{
					flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_3        
					break label0;
	//   20   36:goto            41
				}
			}
			flag = false;
	//   21   39:iconst_0        
	//   22   40:istore_3        
		}
		if(flag != _asNumeric)
	//*  23   41:iload_3         
	//*  24   42:aload_0         
	//*  25   43:getfield        #22  <Field boolean _asNumeric>
	//*  26   46:icmpeq          58
			return ((JsonSerializer) (new InetAddressSerializer(flag)));
	//   27   49:new             #2   <Class InetAddressSerializer>
	//   28   52:dup             
	//   29   53:iload_3         
	//   30   54:invokespecial   #14  <Method void InetAddressSerializer(boolean)>
	//   31   57:areturn         
		else
			return ((JsonSerializer) (this));
	//   32   58:aload_0         
	//   33   59:areturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((InetAddress)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class InetAddress>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #60  <Method void serialize(InetAddress, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(InetAddress inetaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_asNumeric)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean _asNumeric>
	//*   2    4:ifeq            15
		{
			inetaddress = ((InetAddress) (inetaddress.getHostAddress()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #64  <Method String InetAddress.getHostAddress()>
	//    5   11:astore_1        
		} else
	//*   6   12:goto            60
		{
			serializerprovider = ((SerializerProvider) (inetaddress.toString().trim()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #67  <Method String InetAddress.toString()>
	//    9   19:invokevirtual   #72  <Method String String.trim()>
	//   10   22:astore_3        
			int i = ((String) (serializerprovider)).indexOf('/');
	//   11   23:aload_3         
	//   12   24:bipush          47
	//   13   26:invokevirtual   #76  <Method int String.indexOf(int)>
	//   14   29:istore          4
			inetaddress = ((InetAddress) (serializerprovider));
	//   15   31:aload_3         
	//   16   32:astore_1        
			if(i >= 0)
	//*  17   33:iload           4
	//*  18   35:iflt            60
				if(i == 0)
	//*  19   38:iload           4
	//*  20   40:ifne            52
					inetaddress = ((InetAddress) (((String) (serializerprovider)).substring(1)));
	//   21   43:aload_3         
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #80  <Method String String.substring(int)>
	//   24   48:astore_1        
				else
	//*  25   49:goto            60
					inetaddress = ((InetAddress) (((String) (serializerprovider)).substring(0, i)));
	//   26   52:aload_3         
	//   27   53:iconst_0        
	//   28   54:iload           4
	//   29   56:invokevirtual   #83  <Method String String.substring(int, int)>
	//   30   59:astore_1        
		}
		jsongenerator.writeString(((String) (inetaddress)));
	//   31   60:aload_2         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #89  <Method void JsonGenerator.writeString(String)>
	//   34   65:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((InetAddress)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class InetAddress>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #94  <Method void serializeWithType(InetAddress, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(InetAddress inetaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (inetaddress)), java/net/InetAddress, JsonToken.VALUE_STRING));
	//    0    0:aload           4
	//    1    2:aload_2         
	//    2    3:aload           4
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <Class InetAddress>
	//    5    8:getstatic       #100 <Field JsonToken JsonToken.VALUE_STRING>
	//    6   11:invokevirtual   #106 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, Class, JsonToken)>
	//    7   14:invokevirtual   #110 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    8   17:astore          5
		serialize(inetaddress, jsongenerator, serializerprovider);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #60  <Method void serialize(InetAddress, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   14   26:aload           4
	//   15   28:aload_2         
	//   16   29:aload           5
	//   17   31:invokevirtual   #113 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   18   34:pop             
	//   19   35:return          
	}

	protected final boolean _asNumeric;
}
