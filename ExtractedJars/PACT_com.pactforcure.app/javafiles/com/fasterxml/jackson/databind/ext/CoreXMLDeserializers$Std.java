// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.IOException;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

// Referenced classes of package com.fasterxml.jackson.databind.ext:
//			CoreXMLDeserializers

public static class CoreXMLDeserializers$Std extends FromStringDeserializer
{

	protected Object _deserialize(String s, DeserializationContext deserializationcontext)
		throws IllegalArgumentException
	{
		switch(_kind)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field int _kind>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 40
	//	               2 32
	//	               3 48
		case 2: // '\002'
		default:
			throw new IllegalStateException();
	//    3   32:new             #30  <Class IllegalStateException>
	//    4   35:dup             
	//    5   36:invokespecial   #33  <Method void IllegalStateException()>
	//    6   39:athrow          

		case 1: // '\001'
			return ((Object) (CoreXMLDeserializers._dataTypeFactory.newDuration(s)));
	//    7   40:getstatic       #37  <Field DatatypeFactory CoreXMLDeserializers._dataTypeFactory>
	//    8   43:aload_1         
	//    9   44:invokevirtual   #43  <Method javax.xml.datatype.Duration DatatypeFactory.newDuration(String)>
	//   10   47:areturn         

		case 3: // '\003'
			return ((Object) (QName.valueOf(s)));
	//   11   48:aload_1         
	//   12   49:invokestatic    #49  <Method QName QName.valueOf(String)>
	//   13   52:areturn         
		}
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		if(_kind == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field int _kind>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          56
		{
			java.util.Date date = _parseDate(jsonparser, deserializationcontext);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #60  <Method java.util.Date _parseDate(JsonParser, DeserializationContext)>
	//    8   14:astore_3        
			if(date == null)
	//*   9   15:aload_3         
	//*  10   16:ifnonnull       21
				return ((Object) (null));
	//   11   19:aconst_null     
	//   12   20:areturn         
			jsonparser = ((JsonParser) (new GregorianCalendar()));
	//   13   21:new             #62  <Class GregorianCalendar>
	//   14   24:dup             
	//   15   25:invokespecial   #63  <Method void GregorianCalendar()>
	//   16   28:astore_1        
			((GregorianCalendar) (jsonparser)).setTime(date);
	//   17   29:aload_1         
	//   18   30:aload_3         
	//   19   31:invokevirtual   #67  <Method void GregorianCalendar.setTime(java.util.Date)>
			deserializationcontext = ((DeserializationContext) (deserializationcontext.getTimeZone()));
	//   20   34:aload_2         
	//   21   35:invokevirtual   #73  <Method java.util.TimeZone DeserializationContext.getTimeZone()>
	//   22   38:astore_2        
			if(deserializationcontext != null)
	//*  23   39:aload_2         
	//*  24   40:ifnull          48
				((GregorianCalendar) (jsonparser)).setTimeZone(((java.util.TimeZone) (deserializationcontext)));
	//   25   43:aload_1         
	//   26   44:aload_2         
	//   27   45:invokevirtual   #77  <Method void GregorianCalendar.setTimeZone(java.util.TimeZone)>
			return ((Object) (CoreXMLDeserializers._dataTypeFactory.newXMLGregorianCalendar(((GregorianCalendar) (jsonparser)))));
	//   28   48:getstatic       #37  <Field DatatypeFactory CoreXMLDeserializers._dataTypeFactory>
	//   29   51:aload_1         
	//   30   52:invokevirtual   #81  <Method javax.xml.datatype.XMLGregorianCalendar DatatypeFactory.newXMLGregorianCalendar(GregorianCalendar)>
	//   31   55:areturn         
		} else
		{
			return super.deserialize(jsonparser, deserializationcontext);
	//   32   56:aload_0         
	//   33   57:aload_1         
	//   34   58:aload_2         
	//   35   59:invokespecial   #83  <Method Object FromStringDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   36   62:areturn         
		}
	}

	private static final long serialVersionUID = 1L;
	protected final int _kind;

	public CoreXMLDeserializers$Std(Class class1, int i)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void FromStringDeserializer(Class)>
		_kind = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int _kind>
	//    6   10:return          
	}
}
