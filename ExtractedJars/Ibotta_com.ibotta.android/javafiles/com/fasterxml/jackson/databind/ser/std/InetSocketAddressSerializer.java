// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
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
		if(inetaddress == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       19
			serializerprovider = ((SerializerProvider) (inetsocketaddress.getHostName()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #29  <Method String InetSocketAddress.getHostName()>
	//    7   15:astore_3        
		else
	//*   8   16:goto            28
			serializerprovider = ((SerializerProvider) (inetaddress.toString().trim()));
	//    9   19:aload           6
	//   10   21:invokevirtual   #34  <Method String InetAddress.toString()>
	//   11   24:invokevirtual   #39  <Method String String.trim()>
	//   12   27:astore_3        
		int i = ((String) (serializerprovider)).indexOf('/');
	//   13   28:aload_3         
	//   14   29:bipush          47
	//   15   31:invokevirtual   #43  <Method int String.indexOf(int)>
	//   16   34:istore          4
		Object obj = ((Object) (serializerprovider));
	//   17   36:aload_3         
	//   18   37:astore          5
		if(i >= 0)
	//*  19   39:iload           4
	//*  20   41:iflt            123
			if(i == 0)
	//*  21   44:iload           4
	//*  22   46:ifne            114
			{
				if(inetaddress instanceof Inet6Address)
	//*  23   49:aload           6
	//*  24   51:instanceof      #45  <Class Inet6Address>
	//*  25   54:ifeq            102
				{
					obj = ((Object) (new StringBuilder()));
	//   26   57:new             #47  <Class StringBuilder>
	//   27   60:dup             
	//   28   61:invokespecial   #49  <Method void StringBuilder()>
	//   29   64:astore          5
					((StringBuilder) (obj)).append("[");
	//   30   66:aload           5
	//   31   68:ldc1            #51  <String "[">
	//   32   70:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   33   73:pop             
					((StringBuilder) (obj)).append(((String) (serializerprovider)).substring(1));
	//   34   74:aload           5
	//   35   76:aload_3         
	//   36   77:iconst_1        
	//   37   78:invokevirtual   #59  <Method String String.substring(int)>
	//   38   81:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
					((StringBuilder) (obj)).append("]");
	//   40   85:aload           5
	//   41   87:ldc1            #61  <String "]">
	//   42   89:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   43   92:pop             
					serializerprovider = ((SerializerProvider) (((StringBuilder) (obj)).toString()));
	//   44   93:aload           5
	//   45   95:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   46   98:astore_3        
				} else
	//*  47   99:goto            108
				{
					serializerprovider = ((SerializerProvider) (((String) (serializerprovider)).substring(1)));
	//   48  102:aload_3         
	//   49  103:iconst_1        
	//   50  104:invokevirtual   #59  <Method String String.substring(int)>
	//   51  107:astore_3        
				}
				obj = ((Object) (serializerprovider));
	//   52  108:aload_3         
	//   53  109:astore          5
			} else
	//*  54  111:goto            123
			{
				obj = ((Object) (((String) (serializerprovider)).substring(0, i)));
	//   55  114:aload_3         
	//   56  115:iconst_0        
	//   57  116:iload           4
	//   58  118:invokevirtual   #65  <Method String String.substring(int, int)>
	//   59  121:astore          5
			}
		serializerprovider = ((SerializerProvider) (new StringBuilder()));
	//   60  123:new             #47  <Class StringBuilder>
	//   61  126:dup             
	//   62  127:invokespecial   #49  <Method void StringBuilder()>
	//   63  130:astore_3        
		((StringBuilder) (serializerprovider)).append(((String) (obj)));
	//   64  131:aload_3         
	//   65  132:aload           5
	//   66  134:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   67  137:pop             
		((StringBuilder) (serializerprovider)).append(":");
	//   68  138:aload_3         
	//   69  139:ldc1            #67  <String ":">
	//   70  141:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   71  144:pop             
		((StringBuilder) (serializerprovider)).append(inetsocketaddress.getPort());
	//   72  145:aload_3         
	//   73  146:aload_1         
	//   74  147:invokevirtual   #71  <Method int InetSocketAddress.getPort()>
	//   75  150:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   76  153:pop             
		jsongenerator.writeString(((StringBuilder) (serializerprovider)).toString());
	//   77  154:aload_2         
	//   78  155:aload_3         
	//   79  156:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   80  159:invokevirtual   #80  <Method void JsonGenerator.writeString(String)>
	//   81  162:return          
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
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (inetsocketaddress)), java/net/InetSocketAddress, JsonToken.VALUE_STRING));
	//    0    0:aload           4
	//    1    2:aload_2         
	//    2    3:aload           4
	//    3    5:aload_1         
	//    4    6:ldc1            #9   <Class InetSocketAddress>
	//    5    8:getstatic       #91  <Field JsonToken JsonToken.VALUE_STRING>
	//    6   11:invokevirtual   #97  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, Class, JsonToken)>
	//    7   14:invokevirtual   #101 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    8   17:astore          5
		serialize(inetsocketaddress, jsongenerator, serializerprovider);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #20  <Method void serialize(InetSocketAddress, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   14   26:aload           4
	//   15   28:aload_2         
	//   16   29:aload           5
	//   17   31:invokevirtual   #104 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   18   34:pop             
	//   19   35:return          
	}
}
