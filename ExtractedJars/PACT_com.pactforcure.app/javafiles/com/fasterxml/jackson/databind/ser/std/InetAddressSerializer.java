// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.net.InetAddress;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class InetAddressSerializer extends StdScalarSerializer
{

	public InetAddressSerializer()
	{
		super(java/net/InetAddress);
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class InetAddress>
	//    2    3:invokespecial   #12  <Method void StdScalarSerializer(Class)>
	//    3    6:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((InetAddress)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class InetAddress>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #20  <Method void serialize(InetAddress, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(InetAddress inetaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializerprovider = ((SerializerProvider) (inetaddress.toString().trim()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method String InetAddress.toString()>
	//    2    4:invokevirtual   #30  <Method String String.trim()>
	//    3    7:astore_3        
		int i = ((String) (serializerprovider)).indexOf('/');
	//    4    8:aload_3         
	//    5    9:bipush          47
	//    6   11:invokevirtual   #34  <Method int String.indexOf(int)>
	//    7   14:istore          4
		inetaddress = ((InetAddress) (serializerprovider));
	//    8   16:aload_3         
	//    9   17:astore_1        
		if(i >= 0)
	//*  10   18:iload           4
	//*  11   20:iflt            34
			if(i == 0)
	//*  12   23:iload           4
	//*  13   25:ifne            40
				inetaddress = ((InetAddress) (((String) (serializerprovider)).substring(1)));
	//   14   28:aload_3         
	//   15   29:iconst_1        
	//   16   30:invokevirtual   #38  <Method String String.substring(int)>
	//   17   33:astore_1        
			else
	//*  18   34:aload_2         
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #44  <Method void JsonGenerator.writeString(String)>
	//*  21   39:return          
				inetaddress = ((InetAddress) (((String) (serializerprovider)).substring(0, i)));
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:iload           4
	//   25   44:invokevirtual   #47  <Method String String.substring(int, int)>
	//   26   47:astore_1        
		jsongenerator.writeString(((String) (inetaddress)));
	//*  27   48:goto            34
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((InetAddress)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class InetAddress>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #52  <Method void serializeWithType(InetAddress, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(InetAddress inetaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonGenerationException
	{
		typeserializer.writeTypePrefixForScalar(((Object) (inetaddress)), jsongenerator, java/net/InetAddress);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:ldc1            #9   <Class InetAddress>
	//    4    6:invokevirtual   #60  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator, Class)>
		serialize(inetaddress, jsongenerator, serializerprovider);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #20  <Method void serialize(InetAddress, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(((Object) (inetaddress)), jsongenerator);
	//   10   16:aload           4
	//   11   18:aload_1         
	//   12   19:aload_2         
	//   13   20:invokevirtual   #64  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   14   23:return          
	}
}
