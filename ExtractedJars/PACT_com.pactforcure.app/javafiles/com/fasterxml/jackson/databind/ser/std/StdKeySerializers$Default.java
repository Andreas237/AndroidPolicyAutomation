// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
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
	//*   1    1:getfield        #27  <Field int _typeId>
		{
	//*   2    4:tableswitch     1 4: default 36
	//	               1 45
	//	               2 55
	//	               3 68
	//	               4 80
		default:
			jsongenerator.writeFieldName(obj.toString());
	//    3   36:aload_2         
	//    4   37:aload_1         
	//    5   38:invokevirtual   #40  <Method String Object.toString()>
	//    6   41:invokevirtual   #46  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//    7   44:return          

		case 1: // '\001'
			serializerprovider.defaultSerializeDateKey((Date)obj, jsongenerator);
	//    8   45:aload_3         
	//    9   46:aload_1         
	//   10   47:checkcast       #48  <Class Date>
	//   11   50:aload_2         
	//   12   51:invokevirtual   #54  <Method void SerializerProvider.defaultSerializeDateKey(Date, JsonGenerator)>
			return;
	//   13   54:return          

		case 2: // '\002'
			serializerprovider.defaultSerializeDateKey(((Calendar)obj).getTimeInMillis(), jsongenerator);
	//   14   55:aload_3         
	//   15   56:aload_1         
	//   16   57:checkcast       #56  <Class Calendar>
	//   17   60:invokevirtual   #60  <Method long Calendar.getTimeInMillis()>
	//   18   63:aload_2         
	//   19   64:invokevirtual   #63  <Method void SerializerProvider.defaultSerializeDateKey(long, JsonGenerator)>
			return;
	//   20   67:return          

		case 3: // '\003'
			jsongenerator.writeFieldName(((Class)obj).getName());
	//   21   68:aload_2         
	//   22   69:aload_1         
	//   23   70:checkcast       #65  <Class Class>
	//   24   73:invokevirtual   #68  <Method String Class.getName()>
	//   25   76:invokevirtual   #46  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   26   79:return          

		case 4: // '\004'
			break;
		}
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*  27   80:aload_3         
	//*  28   81:getstatic       #74  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*  29   84:invokevirtual   #78  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  30   87:ifeq            101
			obj = ((Object) (obj.toString()));
	//   31   90:aload_1         
	//   32   91:invokevirtual   #40  <Method String Object.toString()>
	//   33   94:astore_1        
		else
	//*  34   95:aload_2         
	//*  35   96:aload_1         
	//*  36   97:invokevirtual   #46  <Method void JsonGenerator.writeFieldName(String)>
	//*  37  100:return          
			obj = ((Object) (((Enum)obj).name()));
	//   38  101:aload_1         
	//   39  102:checkcast       #80  <Class Enum>
	//   40  105:invokevirtual   #83  <Method String Enum.name()>
	//   41  108:astore_1        
		jsongenerator.writeFieldName(((String) (obj)));
	//*  42  109:goto            95
	}

	static final int TYPE_CALENDAR = 2;
	static final int TYPE_CLASS = 3;
	static final int TYPE_DATE = 1;
	static final int TYPE_ENUM = 4;
	static final int TYPE_TO_STRING = 5;
	protected final int _typeId;

	public StdKeySerializers$Default(int i, Class class1)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #25  <Method void StdSerializer(Class, boolean)>
		_typeId = i;
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:putfield        #27  <Field int _typeId>
	//    7   11:return          
	}
}
