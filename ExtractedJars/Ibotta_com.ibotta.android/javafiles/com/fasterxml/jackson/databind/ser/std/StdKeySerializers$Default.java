// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer, StdKeySerializers

public static class StdKeySerializers$Default extends StdSerializer
{

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		switch(_typeId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field int _typeId>
		{
	//*   2    4:tableswitch     1 7: default 48
	//	               1 168
	//	               2 155
	//	               3 143
	//	               4 88
	//	               5 76
	//	               6 76
	//	               7 57
		default:
			jsongenerator.writeFieldName(obj.toString());
	//    3   48:aload_2         
	//    4   49:aload_1         
	//    5   50:invokevirtual   #30  <Method String Object.toString()>
	//    6   53:invokevirtual   #36  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//    7   56:return          

		case 7: // '\007'
			jsongenerator.writeFieldName(serializerprovider.getConfig().getBase64Variant().encode((byte[])obj));
	//    8   57:aload_2         
	//    9   58:aload_3         
	//   10   59:invokevirtual   #42  <Method SerializationConfig SerializerProvider.getConfig()>
	//   11   62:invokevirtual   #48  <Method Base64Variant SerializationConfig.getBase64Variant()>
	//   12   65:aload_1         
	//   13   66:checkcast       #50  <Class byte[]>
	//   14   69:invokevirtual   #56  <Method String Base64Variant.encode(byte[])>
	//   15   72:invokevirtual   #36  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   16   75:return          

		case 5: // '\005'
		case 6: // '\006'
			jsongenerator.writeFieldId(((Number)obj).longValue());
	//   17   76:aload_2         
	//   18   77:aload_1         
	//   19   78:checkcast       #58  <Class Number>
	//   20   81:invokevirtual   #62  <Method long Number.longValue()>
	//   21   84:invokevirtual   #66  <Method void JsonGenerator.writeFieldId(long)>
			return;
	//   22   87:return          

		case 4: // '\004'
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*  23   88:aload_3         
	//*  24   89:getstatic       #72  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*  25   92:invokevirtual   #76  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  26   95:ifeq            106
			{
				obj = ((Object) (obj.toString()));
	//   27   98:aload_1         
	//   28   99:invokevirtual   #30  <Method String Object.toString()>
	//   29  102:astore_1        
			} else
	//*  30  103:goto            137
			{
				obj = ((Object) ((Enum)obj));
	//   31  106:aload_1         
	//   32  107:checkcast       #78  <Class Enum>
	//   33  110:astore_1        
				if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX))
	//*  34  111:aload_3         
	//*  35  112:getstatic       #81  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_INDEX>
	//*  36  115:invokevirtual   #76  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  37  118:ifeq            132
					obj = ((Object) (String.valueOf(((Enum) (obj)).ordinal())));
	//   38  121:aload_1         
	//   39  122:invokevirtual   #85  <Method int Enum.ordinal()>
	//   40  125:invokestatic    #91  <Method String String.valueOf(int)>
	//   41  128:astore_1        
				else
	//*  42  129:goto            137
					obj = ((Object) (((Enum) (obj)).name()));
	//   43  132:aload_1         
	//   44  133:invokevirtual   #94  <Method String Enum.name()>
	//   45  136:astore_1        
			}
			jsongenerator.writeFieldName(((String) (obj)));
	//   46  137:aload_2         
	//   47  138:aload_1         
	//   48  139:invokevirtual   #36  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   49  142:return          

		case 3: // '\003'
			jsongenerator.writeFieldName(((Class)obj).getName());
	//   50  143:aload_2         
	//   51  144:aload_1         
	//   52  145:checkcast       #96  <Class Class>
	//   53  148:invokevirtual   #99  <Method String Class.getName()>
	//   54  151:invokevirtual   #36  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   55  154:return          

		case 2: // '\002'
			serializerprovider.defaultSerializeDateKey(((Calendar)obj).getTimeInMillis(), jsongenerator);
	//   56  155:aload_3         
	//   57  156:aload_1         
	//   58  157:checkcast       #101 <Class Calendar>
	//   59  160:invokevirtual   #104 <Method long Calendar.getTimeInMillis()>
	//   60  163:aload_2         
	//   61  164:invokevirtual   #108 <Method void SerializerProvider.defaultSerializeDateKey(long, JsonGenerator)>
			return;
	//   62  167:return          

		case 1: // '\001'
			serializerprovider.defaultSerializeDateKey((Date)obj, jsongenerator);
	//   63  168:aload_3         
	//   64  169:aload_1         
	//   65  170:checkcast       #110 <Class Date>
	//   66  173:aload_2         
	//   67  174:invokevirtual   #113 <Method void SerializerProvider.defaultSerializeDateKey(Date, JsonGenerator)>
			return;
	//   68  177:return          
		}
	}

	protected final int _typeId;

	public StdKeySerializers$Default(int i, Class class1)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #15  <Method void StdSerializer(Class, boolean)>
		_typeId = i;
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:putfield        #17  <Field int _typeId>
	//    7   11:return          
	}
}
