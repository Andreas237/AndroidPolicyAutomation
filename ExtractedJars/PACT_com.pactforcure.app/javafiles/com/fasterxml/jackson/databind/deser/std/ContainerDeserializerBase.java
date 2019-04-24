// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class ContainerDeserializerBase extends StdDeserializer
{

	protected ContainerDeserializerBase(JavaType javatype)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void StdDeserializer(JavaType)>
	//    3    5:return          
	}

	public SettableBeanProperty findBackReference(String s)
	{
		JsonDeserializer jsondeserializer = getContentDeserializer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #16  <Method JsonDeserializer getContentDeserializer()>
	//    2    4:astore_2        
		if(jsondeserializer == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       56
			throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': type: container deserializer of type ").append(((Object)this).getClass().getName()).append(" returned null for 'getContentDeserializer()'").toString());
	//    5    9:new             #18  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:new             #20  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #23  <Method void StringBuilder()>
	//   10   20:ldc1            #25  <String "Can not handle managed/back reference '">
	//   11   22:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:ldc1            #31  <String "': type: container deserializer of type ">
	//   15   31:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #37  <Method Class Object.getClass()>
	//   18   38:invokevirtual   #43  <Method String Class.getName()>
	//   19   41:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:ldc1            #45  <String " returned null for 'getContentDeserializer()'">
	//   21   46:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   23   52:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   24   55:athrow          
		else
			return jsondeserializer.findBackReference(s);
	//   25   56:aload_2         
	//   26   57:aload_1         
	//   27   58:invokevirtual   #55  <Method SettableBeanProperty JsonDeserializer.findBackReference(String)>
	//   28   61:areturn         
	}

	public abstract JsonDeserializer getContentDeserializer();

	public abstract JavaType getContentType();

	protected void wrapAndThrow(Throwable throwable, Object obj, String s)
		throws IOException
	{
		for(; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_1         
	//    1    1:instanceof      #63  <Class InvocationTargetException>
	//    2    4:ifeq            22
	//    3    7:aload_1         
	//    4    8:invokevirtual   #69  <Method Throwable Throwable.getCause()>
	//    5   11:ifnull          22
	//    6   14:aload_1         
	//    7   15:invokevirtual   #69  <Method Throwable Throwable.getCause()>
	//    8   18:astore_1        
	//*   9   19:goto            0
		if(throwable instanceof Error)
	//*  10   22:aload_1         
	//*  11   23:instanceof      #71  <Class Error>
	//*  12   26:ifeq            34
			throw (Error)throwable;
	//   13   29:aload_1         
	//   14   30:checkcast       #71  <Class Error>
	//   15   33:athrow          
		if((throwable instanceof IOException) && !(throwable instanceof JsonMappingException))
	//*  16   34:aload_1         
	//*  17   35:instanceof      #61  <Class IOException>
	//*  18   38:ifeq            53
	//*  19   41:aload_1         
	//*  20   42:instanceof      #73  <Class JsonMappingException>
	//*  21   45:ifne            53
			throw (IOException)throwable;
	//   22   48:aload_1         
	//   23   49:checkcast       #61  <Class IOException>
	//   24   52:athrow          
		String s1 = s;
	//   25   53:aload_3         
	//   26   54:astore          4
		if(s == null)
	//*  27   56:aload_3         
	//*  28   57:ifnonnull       64
			s1 = "N/A";
	//   29   60:ldc1            #75  <String "N/A">
	//   30   62:astore          4
		throw JsonMappingException.wrapWithPath(throwable, obj, s1);
	//   31   64:aload_1         
	//   32   65:aload_2         
	//   33   66:aload           4
	//   34   68:invokestatic    #79  <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   35   71:athrow          
	}
}
