// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			DefaultSerializerProvider, SerializerFactory

public static final class DefaultSerializerProvider$Impl extends DefaultSerializerProvider
{

	public DefaultSerializerProvider copy()
	{
		if(((Object)this).getClass() != com/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #29  <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class DefaultSerializerProvider$Impl>
	//*   3    6:if_acmpeq       14
			return super.copy();
	//    4    9:aload_0         
	//    5   10:invokespecial   #31  <Method DefaultSerializerProvider DefaultSerializerProvider.copy()>
	//    6   13:areturn         
		else
			return ((DefaultSerializerProvider) (new DefaultSerializerProvider$Impl(this)));
	//    7   14:new             #2   <Class DefaultSerializerProvider$Impl>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #33  <Method void DefaultSerializerProvider$Impl(DefaultSerializerProvider$Impl)>
	//   11   22:areturn         
	}

	public DefaultSerializerProvider$Impl createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
	{
		return new DefaultSerializerProvider$Impl(((SerializerProvider) (this)), serializationconfig, serializerfactory);
	//    0    0:new             #2   <Class DefaultSerializerProvider$Impl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #36  <Method void DefaultSerializerProvider$Impl(SerializerProvider, SerializationConfig, SerializerFactory)>
	//    6   10:areturn         
	}

	public volatile DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
	{
		return ((DefaultSerializerProvider) (createInstance(serializationconfig, serializerfactory)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #39  <Method DefaultSerializerProvider$Impl createInstance(SerializationConfig, SerializerFactory)>
	//    4    6:areturn         
	}

	private static final long serialVersionUID = 1L;

	public DefaultSerializerProvider$Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void DefaultSerializerProvider()>
	//    2    4:return          
	}

	protected DefaultSerializerProvider$Impl(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
	{
		super(serializerprovider, serializationconfig, serializerfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #17  <Method void DefaultSerializerProvider(SerializerProvider, SerializationConfig, SerializerFactory)>
	//    5    7:return          
	}

	public DefaultSerializerProvider$Impl(DefaultSerializerProvider$Impl defaultserializerprovider$impl)
	{
		super(((DefaultSerializerProvider) (defaultserializerprovider$impl)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void DefaultSerializerProvider(DefaultSerializerProvider)>
	//    3    5:return          
	}
}
