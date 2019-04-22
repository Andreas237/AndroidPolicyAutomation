// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind:
//			ObjectMapper

public class MappingJsonFactory extends JsonFactory
{

	public MappingJsonFactory()
	{
		this(((ObjectMapper) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #13  <Method void MappingJsonFactory(ObjectMapper)>
	//    3    5:return          
	}

	public MappingJsonFactory(ObjectMapper objectmapper)
	{
		super(((ObjectCodec) (objectmapper)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void JsonFactory(ObjectCodec)>
		if(objectmapper == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       22
			setCodec(((ObjectCodec) (new ObjectMapper(((JsonFactory) (this))))));
	//    5    9:aload_0         
	//    6   10:new             #19  <Class ObjectMapper>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #22  <Method void ObjectMapper(JsonFactory)>
	//   10   18:invokevirtual   #26  <Method JsonFactory setCodec(ObjectCodec)>
	//   11   21:pop             
	//   12   22:return          
	}

	public volatile ObjectCodec getCodec()
	{
		return ((ObjectCodec) (getCodec()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method ObjectMapper getCodec()>
	//    2    4:areturn         
	}

	public final ObjectMapper getCodec()
	{
		return (ObjectMapper)_objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ObjectCodec _objectCodec>
	//    2    4:checkcast       #19  <Class ObjectMapper>
	//    3    7:areturn         
	}

	public String getFormatName()
	{
		return "JSON";
	//    0    0:ldc1            #39  <String "JSON">
	//    1    2:areturn         
	}

	public MatchStrength hasFormat(InputAccessor inputaccessor)
		throws IOException
	{
		if(((Object)this).getClass() == com/fasterxml/jackson/databind/MappingJsonFactory)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class MappingJsonFactory>
	//*   3    6:if_acmpne       15
			return hasJSONFormat(inputaccessor);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #52  <Method MatchStrength hasJSONFormat(InputAccessor)>
	//    7   14:areturn         
		else
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
	}

	private static final long serialVersionUID = -1L;
}
