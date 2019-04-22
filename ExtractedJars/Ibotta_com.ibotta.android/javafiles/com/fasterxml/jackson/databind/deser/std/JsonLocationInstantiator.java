// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;

public class JsonLocationInstantiator extends com.fasterxml.jackson.databind.deser.ValueInstantiator.Base
{

	public JsonLocationInstantiator()
	{
		super(com/fasterxml/jackson/core/JsonLocation);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <Class JsonLocation>
	//    2    3:invokespecial   #11  <Method void com.fasterxml.jackson.databind.deser.ValueInstantiator$Base(Class)>
	//    3    6:return          
	}

	private static final int _int(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return ((Number)obj).intValue();
	//    4    6:aload_0         
	//    5    7:checkcast       #16  <Class Number>
	//    6   10:invokevirtual   #20  <Method int Number.intValue()>
	//    7   13:ireturn         
	}

	private static final long _long(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0L;
	//    2    4:lconst_0        
	//    3    5:lreturn         
		else
			return ((Number)obj).longValue();
	//    4    6:aload_0         
	//    5    7:checkcast       #16  <Class Number>
	//    6   10:invokevirtual   #26  <Method long Number.longValue()>
	//    7   13:lreturn         
	}

	private static CreatorProperty creatorProp(String s, JavaType javatype, int i)
	{
		return new CreatorProperty(PropertyName.construct(s), javatype, ((PropertyName) (null)), ((com.fasterxml.jackson.databind.jsontype.TypeDeserializer) (null)), ((com.fasterxml.jackson.databind.util.Annotations) (null)), ((com.fasterxml.jackson.databind.introspect.AnnotatedParameter) (null)), i, ((Object) (null)), PropertyMetadata.STD_REQUIRED);
	//    0    0:new             #30  <Class CreatorProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #36  <Method PropertyName PropertyName.construct(String)>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:iload_2         
	//   10   14:aconst_null     
	//   11   15:getstatic       #42  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//   12   18:invokespecial   #45  <Method void CreatorProperty(PropertyName, JavaType, PropertyName, com.fasterxml.jackson.databind.jsontype.TypeDeserializer, com.fasterxml.jackson.databind.util.Annotations, com.fasterxml.jackson.databind.introspect.AnnotatedParameter, int, Object, PropertyMetadata)>
	//   13   21:areturn         
	}

	public boolean canCreateFromObjectWith()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Object createFromObjectWith(DeserializationContext deserializationcontext, Object aobj[])
	{
		return ((Object) (new JsonLocation(aobj[0], _long(aobj[1]), _long(aobj[2]), _int(aobj[3]), _int(aobj[4]))));
	//    0    0:new             #8   <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:aaload          
	//    5    7:aload_2         
	//    6    8:iconst_1        
	//    7    9:aaload          
	//    8   10:invokestatic    #51  <Method long _long(Object)>
	//    9   13:aload_2         
	//   10   14:iconst_2        
	//   11   15:aaload          
	//   12   16:invokestatic    #51  <Method long _long(Object)>
	//   13   19:aload_2         
	//   14   20:iconst_3        
	//   15   21:aaload          
	//   16   22:invokestatic    #53  <Method int _int(Object)>
	//   17   25:aload_2         
	//   18   26:iconst_4        
	//   19   27:aaload          
	//   20   28:invokestatic    #53  <Method int _int(Object)>
	//   21   31:invokespecial   #56  <Method void JsonLocation(Object, long, long, int, int)>
	//   22   34:areturn         
	}

	public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationconfig)
	{
		JavaType javatype = deserializationconfig.constructType(Integer.TYPE);
	//    0    0:aload_1         
	//    1    1:getstatic       #64  <Field Class Integer.TYPE>
	//    2    4:invokevirtual   #70  <Method JavaType DeserializationConfig.constructType(Class)>
	//    3    7:astore_2        
		JavaType javatype1 = deserializationconfig.constructType(Long.TYPE);
	//    4    8:aload_1         
	//    5    9:getstatic       #73  <Field Class Long.TYPE>
	//    6   12:invokevirtual   #70  <Method JavaType DeserializationConfig.constructType(Class)>
	//    7   15:astore_3        
		return (new SettableBeanProperty[] {
			creatorProp("sourceRef", deserializationconfig.constructType(java/lang/Object), 0), creatorProp("byteOffset", javatype1, 1), creatorProp("charOffset", javatype1, 2), creatorProp("lineNr", javatype, 3), creatorProp("columnNr", javatype, 4)
		});
	//    8   16:iconst_5        
	//    9   17:anewarray       SettableBeanProperty[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:ldc1            #77  <String "sourceRef">
	//   13   24:aload_1         
	//   14   25:ldc1            #79  <Class Object>
	//   15   27:invokevirtual   #70  <Method JavaType DeserializationConfig.constructType(Class)>
	//   16   30:iconst_0        
	//   17   31:invokestatic    #81  <Method CreatorProperty creatorProp(String, JavaType, int)>
	//   18   34:aastore         
	//   19   35:dup             
	//   20   36:iconst_1        
	//   21   37:ldc1            #83  <String "byteOffset">
	//   22   39:aload_3         
	//   23   40:iconst_1        
	//   24   41:invokestatic    #81  <Method CreatorProperty creatorProp(String, JavaType, int)>
	//   25   44:aastore         
	//   26   45:dup             
	//   27   46:iconst_2        
	//   28   47:ldc1            #85  <String "charOffset">
	//   29   49:aload_3         
	//   30   50:iconst_2        
	//   31   51:invokestatic    #81  <Method CreatorProperty creatorProp(String, JavaType, int)>
	//   32   54:aastore         
	//   33   55:dup             
	//   34   56:iconst_3        
	//   35   57:ldc1            #87  <String "lineNr">
	//   36   59:aload_2         
	//   37   60:iconst_3        
	//   38   61:invokestatic    #81  <Method CreatorProperty creatorProp(String, JavaType, int)>
	//   39   64:aastore         
	//   40   65:dup             
	//   41   66:iconst_4        
	//   42   67:ldc1            #89  <String "columnNr">
	//   43   69:aload_2         
	//   44   70:iconst_4        
	//   45   71:invokestatic    #81  <Method CreatorProperty creatorProp(String, JavaType, int)>
	//   46   74:aastore         
	//   47   75:areturn         
	}
}
