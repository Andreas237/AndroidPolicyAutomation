// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class ContainerDeserializerBase extends StdDeserializer
	implements com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
{

	protected ContainerDeserializerBase(JavaType javatype)
	{
		this(javatype, ((NullValueProvider) (null)), ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #20  <Method void ContainerDeserializerBase(JavaType, NullValueProvider, Boolean)>
	//    5    7:return          
	}

	protected ContainerDeserializerBase(JavaType javatype, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void StdDeserializer(JavaType)>
		_containerType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #25  <Field JavaType _containerType>
		_unwrapSingle = boolean1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Boolean _unwrapSingle>
		_nullProvider = nullvalueprovider;
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:putfield        #29  <Field NullValueProvider _nullProvider>
		_skipNullValues = NullsConstantProvider.isSkipper(nullvalueprovider);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:invokestatic    #35  <Method boolean NullsConstantProvider.isSkipper(NullValueProvider)>
	//   15   25:putfield        #37  <Field boolean _skipNullValues>
	//   16   28:return          
	}

	protected ContainerDeserializerBase(ContainerDeserializerBase containerdeserializerbase)
	{
		this(containerdeserializerbase, containerdeserializerbase._nullProvider, containerdeserializerbase._unwrapSingle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getfield        #29  <Field NullValueProvider _nullProvider>
	//    4    6:aload_1         
	//    5    7:getfield        #27  <Field Boolean _unwrapSingle>
	//    6   10:invokespecial   #41  <Method void ContainerDeserializerBase(ContainerDeserializerBase, NullValueProvider, Boolean)>
	//    7   13:return          
	}

	protected ContainerDeserializerBase(ContainerDeserializerBase containerdeserializerbase, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(containerdeserializerbase._containerType);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #25  <Field JavaType _containerType>
	//    3    5:invokespecial   #23  <Method void StdDeserializer(JavaType)>
		_containerType = containerdeserializerbase._containerType;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #25  <Field JavaType _containerType>
	//    7   13:putfield        #25  <Field JavaType _containerType>
		_nullProvider = nullvalueprovider;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #29  <Field NullValueProvider _nullProvider>
		_unwrapSingle = boolean1;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #27  <Field Boolean _unwrapSingle>
		_skipNullValues = NullsConstantProvider.isSkipper(nullvalueprovider);
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:invokestatic    #35  <Method boolean NullsConstantProvider.isSkipper(NullValueProvider)>
	//   17   31:putfield        #37  <Field boolean _skipNullValues>
	//   18   34:return          
	}

	public SettableBeanProperty findBackReference(String s)
	{
		JsonDeserializer jsondeserializer = getContentDeserializer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method JsonDeserializer getContentDeserializer()>
	//    2    4:astore_2        
		if(jsondeserializer != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return jsondeserializer.findBackReference(s);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #54  <Method SettableBeanProperty JsonDeserializer.findBackReference(String)>
	//    8   14:areturn         
		else
			throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[] {
				s, ((Object)this).getClass().getName()
			}));
	//    9   15:new             #56  <Class IllegalArgumentException>
	//   10   18:dup             
	//   11   19:ldc1            #58  <String "Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'">
	//   12   21:iconst_2        
	//   13   22:anewarray       Object[]
	//   14   25:dup             
	//   15   26:iconst_0        
	//   16   27:aload_1         
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_1        
	//   20   31:aload_0         
	//   21   32:invokevirtual   #64  <Method Class Object.getClass()>
	//   22   35:invokevirtual   #70  <Method String Class.getName()>
	//   23   38:aastore         
	//   24   39:invokestatic    #76  <Method String String.format(String, Object[])>
	//   25   42:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   26   45:athrow          
	}

	public abstract JsonDeserializer getContentDeserializer();

	public AccessPattern getEmptyAccessPattern()
	{
		return AccessPattern.DYNAMIC;
	//    0    0:getstatic       #87  <Field AccessPattern AccessPattern.DYNAMIC>
	//    1    3:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		Object obj = ((Object) (getValueInstantiator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method ValueInstantiator getValueInstantiator()>
	//    2    4:astore_2        
		if(obj == null || !((ValueInstantiator) (obj)).canCreateUsingDefault())
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #103 <Method boolean ValueInstantiator.canCreateUsingDefault()>
	//*   7   13:ifne            40
		{
			JavaType javatype = getValueType();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #107 <Method JavaType getValueType()>
	//   10   20:astore_3        
			deserializationcontext.reportBadDefinition(javatype, String.format("Cannot create empty instance of %s, no default Creator", new Object[] {
				javatype
			}));
	//   11   21:aload_1         
	//   12   22:aload_3         
	//   13   23:ldc1            #109 <String "Cannot create empty instance of %s, no default Creator">
	//   14   25:iconst_1        
	//   15   26:anewarray       Object[]
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:aload_3         
	//   19   32:aastore         
	//   20   33:invokestatic    #76  <Method String String.format(String, Object[])>
	//   21   36:invokevirtual   #115 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   22   39:pop             
		}
		try
		{
			obj = ((ValueInstantiator) (obj)).createUsingDefault(deserializationcontext);
	//   23   40:aload_2         
	//   24   41:aload_1         
	//   25   42:invokevirtual   #118 <Method Object ValueInstantiator.createUsingDefault(DeserializationContext)>
	//   26   45:astore_2        
		}
	//*  27   46:aload_2         
	//*  28   47:areturn         
		catch(IOException ioexception)
	//*  29   48:astore_2        
		{
			return ClassUtil.throwAsMappingException(deserializationcontext, ioexception);
	//   30   49:aload_1         
	//   31   50:aload_2         
	//   32   51:invokestatic    #124 <Method Object ClassUtil.throwAsMappingException(DeserializationContext, IOException)>
	//   33   54:areturn         
		}
		return obj;
	}

	public ValueInstantiator getValueInstantiator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JavaType getValueType()
	{
		return _containerType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JavaType _containerType>
	//    2    4:areturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.TRUE;
	//    0    0:getstatic       #132 <Field Boolean Boolean.TRUE>
	//    1    3:areturn         
	}

	protected Object wrapAndThrow(Throwable throwable, Object obj, String s)
		throws IOException
	{
		for(; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_1         
	//    1    1:instanceof      #136 <Class InvocationTargetException>
	//    2    4:ifeq            22
	//    3    7:aload_1         
	//    4    8:invokevirtual   #142 <Method Throwable Throwable.getCause()>
	//    5   11:ifnull          22
	//    6   14:aload_1         
	//    7   15:invokevirtual   #142 <Method Throwable Throwable.getCause()>
	//    8   18:astore_1        
	//*   9   19:goto            0
		ClassUtil.throwIfError(throwable);
	//   10   22:aload_1         
	//   11   23:invokestatic    #146 <Method Throwable ClassUtil.throwIfError(Throwable)>
	//   12   26:pop             
		if((throwable instanceof IOException) && !(throwable instanceof JsonMappingException))
	//*  13   27:aload_1         
	//*  14   28:instanceof      #93  <Class IOException>
	//*  15   31:ifeq            46
	//*  16   34:aload_1         
	//*  17   35:instanceof      #91  <Class JsonMappingException>
	//*  18   38:ifne            46
			throw (IOException)throwable;
	//   19   41:aload_1         
	//   20   42:checkcast       #93  <Class IOException>
	//   21   45:athrow          
		else
			throw JsonMappingException.wrapWithPath(throwable, obj, (String)ClassUtil.nonNull(((Object) (s)), "N/A"));
	//   22   46:aload_1         
	//   23   47:aload_2         
	//   24   48:aload_3         
	//   25   49:ldc1            #148 <String "N/A">
	//   26   51:invokestatic    #152 <Method Object ClassUtil.nonNull(Object, Object)>
	//   27   54:checkcast       #72  <Class String>
	//   28   57:invokestatic    #156 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   29   60:athrow          
	}

	protected final JavaType _containerType;
	protected final NullValueProvider _nullProvider;
	protected final boolean _skipNullValues;
	protected final Boolean _unwrapSingle;
}
