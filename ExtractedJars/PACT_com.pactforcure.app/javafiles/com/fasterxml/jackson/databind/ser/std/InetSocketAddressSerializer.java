// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.net.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class InetSocketAddressSerializer extends StdScalarSerializer
{

	public InetSocketAddressSerializer()
	{
		super(java/net/InetSocketAddress);
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class InetSocketAddress>
	//    2    3:invokespecial   #12  <Method void StdScalarSerializer(Class)>
	//    3    6:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((InetSocketAddress)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class InetSocketAddress>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #20  <Method void serialize(InetSocketAddress, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(InetSocketAddress inetsocketaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		InetAddress inetaddress = inetsocketaddress.getAddress();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method InetAddress InetSocketAddress.getAddress()>
	//    2    4:astore          6
		int i;
		String s;
		if(inetaddress == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       108
			s = inetsocketaddress.getHostName();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #29  <Method String InetSocketAddress.getHostName()>
	//    7   15:astore          5
		else
	//*   8   17:aload           5
	//*   9   19:bipush          47
	//*  10   21:invokevirtual   #35  <Method int String.indexOf(int)>
	//*  11   24:istore          4
	//*  12   26:aload           5
	//*  13   28:astore_3        
	//*  14   29:iload           4
	//*  15   31:iflt            77
	//*  16   34:iload           4
	//*  17   36:ifne            131
	//*  18   39:aload           6
	//*  19   41:instanceof      #37  <Class Inet6Address>
	//*  20   44:ifeq            121
	//*  21   47:new             #39  <Class StringBuilder>
	//*  22   50:dup             
	//*  23   51:invokespecial   #41  <Method void StringBuilder()>
	//*  24   54:ldc1            #43  <String "[">
	//*  25   56:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  26   59:aload           5
	//*  27   61:iconst_1        
	//*  28   62:invokevirtual   #51  <Method String String.substring(int)>
	//*  29   65:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  30   68:ldc1            #53  <String "]">
	//*  31   70:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  32   73:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  33   76:astore_3        
	//*  34   77:aload_2         
	//*  35   78:new             #39  <Class StringBuilder>
	//*  36   81:dup             
	//*  37   82:invokespecial   #41  <Method void StringBuilder()>
	//*  38   85:aload_3         
	//*  39   86:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  40   89:ldc1            #58  <String ":">
	//*  41   91:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  42   94:aload_1         
	//*  43   95:invokevirtual   #62  <Method int InetSocketAddress.getPort()>
	//*  44   98:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//*  45  101:invokevirtual   #56  <Method String StringBuilder.toString()>
	//*  46  104:invokevirtual   #71  <Method void JsonGenerator.writeString(String)>
	//*  47  107:return          
			s = inetaddress.toString().trim();
	//   48  108:aload           6
	//   49  110:invokevirtual   #74  <Method String InetAddress.toString()>
	//   50  113:invokevirtual   #77  <Method String String.trim()>
	//   51  116:astore          5
		i = s.indexOf('/');
		serializerprovider = ((SerializerProvider) (s));
		if(i >= 0)
			if(i == 0)
			{
				if(inetaddress instanceof Inet6Address)
					serializerprovider = ((SerializerProvider) ((new StringBuilder()).append("[").append(s.substring(1)).append("]").toString()));
				else
	//*  52  118:goto            17
					serializerprovider = ((SerializerProvider) (s.substring(1)));
	//   53  121:aload           5
	//   54  123:iconst_1        
	//   55  124:invokevirtual   #51  <Method String String.substring(int)>
	//   56  127:astore_3        
			} else
	//*  57  128:goto            77
			{
				serializerprovider = ((SerializerProvider) (s.substring(0, i)));
	//   58  131:aload           5
	//   59  133:iconst_0        
	//   60  134:iload           4
	//   61  136:invokevirtual   #80  <Method String String.substring(int, int)>
	//   62  139:astore_3        
			}
		jsongenerator.writeString((new StringBuilder()).append(((String) (serializerprovider))).append(":").append(inetsocketaddress.getPort()).toString());
	//*  63  140:goto            77
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((InetSocketAddress)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class InetSocketAddress>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #85  <Method void serializeWithType(InetSocketAddress, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(InetSocketAddress inetsocketaddress, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonGenerationException
	{
		typeserializer.writeTypePrefixForScalar(((Object) (inetsocketaddress)), jsongenerator, java/net/InetSocketAddress);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:ldc1            #9   <Class InetSocketAddress>
	//    4    6:invokevirtual   #93  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator, Class)>
		serialize(inetsocketaddress, jsongenerator, serializerprovider);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #20  <Method void serialize(InetSocketAddress, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(((Object) (inetsocketaddress)), jsongenerator);
	//   10   16:aload           4
	//   11   18:aload_1         
	//   12   19:aload_2         
	//   13   20:invokevirtual   #97  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   14   23:return          
	}
}
