// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer, StdKeySerializers

public static class StdKeySerializers$EnumKeySerializer extends StdSerializer
{

	public static StdKeySerializers$EnumKeySerializer construct(Class class1, EnumValues enumvalues)
	{
		return new StdKeySerializers$EnumKeySerializer(class1, enumvalues);
	//    0    0:new             #2   <Class StdKeySerializers$EnumKeySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #24  <Method void StdKeySerializers$EnumKeySerializer(Class, EnumValues)>
	//    5    9:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #35  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*   2    4:invokevirtual   #41  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            19
		{
			jsongenerator.writeFieldName(obj.toString());
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #47  <Method String Object.toString()>
	//    7   15:invokevirtual   #53  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//    8   18:return          
		}
		obj = ((Object) ((Enum)obj));
	//    9   19:aload_1         
	//   10   20:checkcast       #55  <Class Enum>
	//   11   23:astore_1        
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX))
	//*  12   24:aload_3         
	//*  13   25:getstatic       #58  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_INDEX>
	//*  14   28:invokevirtual   #41  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  15   31:ifeq            46
		{
			jsongenerator.writeFieldName(String.valueOf(((Enum) (obj)).ordinal()));
	//   16   34:aload_2         
	//   17   35:aload_1         
	//   18   36:invokevirtual   #62  <Method int Enum.ordinal()>
	//   19   39:invokestatic    #68  <Method String String.valueOf(int)>
	//   20   42:invokevirtual   #53  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   21   45:return          
		} else
		{
			jsongenerator.writeFieldName(_values.serializedValueFor(((Enum) (obj))));
	//   22   46:aload_2         
	//   23   47:aload_0         
	//   24   48:getfield        #17  <Field EnumValues _values>
	//   25   51:aload_1         
	//   26   52:invokevirtual   #74  <Method com.fasterxml.jackson.core.SerializableString EnumValues.serializedValueFor(Enum)>
	//   27   55:invokevirtual   #77  <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
			return;
	//   28   58:return          
		}
	}

	protected final EnumValues _values;

	protected StdKeySerializers$EnumKeySerializer(Class class1, EnumValues enumvalues)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #15  <Method void StdSerializer(Class, boolean)>
		_values = enumvalues;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #17  <Field EnumValues _values>
	//    7   11:return          
	}
}
