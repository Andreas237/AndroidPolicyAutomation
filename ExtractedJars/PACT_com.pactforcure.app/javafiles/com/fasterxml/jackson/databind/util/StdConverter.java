// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			Converter

public abstract class StdConverter
	implements Converter
{

	public StdConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	protected JavaType _findConverterType(TypeFactory typefactory)
	{
		typefactory = ((TypeFactory) (typefactory.constructType(((java.lang.reflect.Type) (((Object)this).getClass()))).findSuperType(com/fasterxml/jackson/databind/util/Converter)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #18  <Method Class Object.getClass()>
	//    3    5:invokevirtual   #24  <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    4    8:ldc1            #7   <Class Converter>
	//    5   10:invokevirtual   #30  <Method JavaType JavaType.findSuperType(Class)>
	//    6   13:astore_1        
		if(typefactory == null || ((JavaType) (typefactory)).containedTypeCount() < 2)
	//*   7   14:aload_1         
	//*   8   15:ifnull          26
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #34  <Method int JavaType.containedTypeCount()>
	//*  11   22:iconst_2        
	//*  12   23:icmpge          59
			throw new IllegalStateException((new StringBuilder()).append("Can not find OUT type parameter for Converter of type ").append(((Object)this).getClass().getName()).toString());
	//   13   26:new             #36  <Class IllegalStateException>
	//   14   29:dup             
	//   15   30:new             #38  <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #39  <Method void StringBuilder()>
	//   18   37:ldc1            #41  <String "Can not find OUT type parameter for Converter of type ">
	//   19   39:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:aload_0         
	//   21   43:invokevirtual   #18  <Method Class Object.getClass()>
	//   22   46:invokevirtual   #51  <Method String Class.getName()>
	//   23   49:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   24   52:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   25   55:invokespecial   #57  <Method void IllegalStateException(String)>
	//   26   58:athrow          
		else
			return ((JavaType) (typefactory));
	//   27   59:aload_1         
	//   28   60:areturn         
	}

	public abstract Object convert(Object obj);

	public JavaType getInputType(TypeFactory typefactory)
	{
		return _findConverterType(typefactory).containedType(0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method JavaType _findConverterType(TypeFactory)>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #66  <Method JavaType JavaType.containedType(int)>
	//    5    9:areturn         
	}

	public JavaType getOutputType(TypeFactory typefactory)
	{
		return _findConverterType(typefactory).containedType(1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method JavaType _findConverterType(TypeFactory)>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #66  <Method JavaType JavaType.containedType(int)>
	//    5    9:areturn         
	}
}
