// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.InjectableValues;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			DefaultDeserializationContext, DeserializerFactory

public static final class DefaultDeserializationContext$Impl extends DefaultDeserializationContext
{

	public DefaultDeserializationContext createInstance(DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
	{
		return ((DefaultDeserializationContext) (new DefaultDeserializationContext$Impl(this, deserializationconfig, jsonparser, injectablevalues)));
	//    0    0:new             #2   <Class DefaultDeserializationContext$Impl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #27  <Method void DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl, DeserializationConfig, JsonParser, InjectableValues)>
	//    7   11:areturn         
	}

	public DefaultDeserializationContext with(DeserializerFactory deserializerfactory)
	{
		return ((DefaultDeserializationContext) (new DefaultDeserializationContext$Impl(this, deserializerfactory)));
	//    0    0:new             #2   <Class DefaultDeserializationContext$Impl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #31  <Method void DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl, DeserializerFactory)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;

	protected DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl defaultdeserializationcontext$impl, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
	{
		super(((DefaultDeserializationContext) (defaultdeserializationcontext$impl)), deserializationconfig, jsonparser, injectablevalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #14  <Method void DefaultDeserializationContext(DefaultDeserializationContext, DeserializationConfig, JsonParser, InjectableValues)>
	//    6    9:return          
	}

	protected DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl defaultdeserializationcontext$impl, DeserializerFactory deserializerfactory)
	{
		super(((DefaultDeserializationContext) (defaultdeserializationcontext$impl)), deserializerfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void DefaultDeserializationContext(DefaultDeserializationContext, DeserializerFactory)>
	//    4    6:return          
	}

	public DefaultDeserializationContext$Impl(DeserializerFactory deserializerfactory)
	{
		super(deserializerfactory, ((DeserializerCache) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #23  <Method void DefaultDeserializationContext(DeserializerFactory, DeserializerCache)>
	//    4    6:return          
	}
}