// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.TypeKey;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			ReadOnlyClassToSerializerMap

private static final class ReadOnlyClassToSerializerMap$Bucket
{

	public boolean matchesTyped(JavaType javatype)
	{
		return _isTyped && javatype.equals(((Object) (_type)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean _isTyped>
	//    2    4:ifeq            20
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field JavaType _type>
	//    6   12:invokevirtual   #59  <Method boolean JavaType.equals(Object)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean matchesTyped(Class class1)
	{
		return _class == class1 && _isTyped;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Class _class>
	//    2    4:aload_1         
	//    3    5:if_acmpne       17
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field boolean _isTyped>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean matchesUntyped(JavaType javatype)
	{
		return !_isTyped && javatype.equals(((Object) (_type)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean _isTyped>
	//    2    4:ifne            20
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field JavaType _type>
	//    6   12:invokevirtual   #59  <Method boolean JavaType.equals(Object)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public boolean matchesUntyped(Class class1)
	{
		return _class == class1 && !_isTyped;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Class _class>
	//    2    4:aload_1         
	//    3    5:if_acmpne       17
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field boolean _isTyped>
	//    6   12:ifne            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	protected final Class _class;
	protected final boolean _isTyped;
	protected final JavaType _type;
	public final ReadOnlyClassToSerializerMap$Bucket next;
	public final JsonSerializer value;

	public ReadOnlyClassToSerializerMap$Bucket(ReadOnlyClassToSerializerMap$Bucket readonlyclasstoserializermap$bucket, TypeKey typekey, JsonSerializer jsonserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		next = readonlyclasstoserializermap$bucket;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field ReadOnlyClassToSerializerMap$Bucket next>
		value = jsonserializer;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #28  <Field JsonSerializer value>
		_isTyped = typekey.isTyped();
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #34  <Method boolean TypeKey.isTyped()>
	//   11   19:putfield        #36  <Field boolean _isTyped>
		_class = typekey.getRawType();
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #40  <Method Class TypeKey.getRawType()>
	//   15   27:putfield        #42  <Field Class _class>
		_type = typekey.getType();
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #46  <Method JavaType TypeKey.getType()>
	//   19   35:putfield        #48  <Field JavaType _type>
	//   20   38:return          
	}
}
