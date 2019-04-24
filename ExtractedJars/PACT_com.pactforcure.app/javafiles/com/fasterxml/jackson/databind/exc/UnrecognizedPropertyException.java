// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.exc:
//			PropertyBindingException

public class UnrecognizedPropertyException extends PropertyBindingException
{

	public UnrecognizedPropertyException(JsonParser jsonparser, String s, JsonLocation jsonlocation, Class class1, String s1, Collection collection)
	{
		super(jsonparser, s, jsonlocation, class1, s1, collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #12  <Method void PropertyBindingException(JsonParser, String, JsonLocation, Class, String, Collection)>
	//    8   13:return          
	}

	public UnrecognizedPropertyException(String s, JsonLocation jsonlocation, Class class1, String s1, Collection collection)
	{
		super(s, jsonlocation, class1, s1, collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #19  <Method void PropertyBindingException(String, JsonLocation, Class, String, Collection)>
	//    7   11:return          
	}

	public static UnrecognizedPropertyException from(JsonParser jsonparser, Object obj, String s, Collection collection)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			throw new IllegalArgumentException();
	//    2    4:new             #25  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:invokespecial   #28  <Method void IllegalArgumentException()>
	//    5   11:athrow          
		Class class1;
		if(obj instanceof Class)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #30  <Class Class>
	//*   8   16:ifeq            87
			class1 = (Class)obj;
	//    9   19:aload_1         
	//   10   20:checkcast       #30  <Class Class>
	//   11   23:astore          4
		else
	//*  12   25:new             #2   <Class UnrecognizedPropertyException>
	//*  13   28:dup             
	//*  14   29:aload_0         
	//*  15   30:new             #32  <Class StringBuilder>
	//*  16   33:dup             
	//*  17   34:invokespecial   #33  <Method void StringBuilder()>
	//*  18   37:ldc1            #35  <String "Unrecognized field \"">
	//*  19   39:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//*  20   42:aload_2         
	//*  21   43:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//*  22   46:ldc1            #41  <String "\" (class ">
	//*  23   48:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//*  24   51:aload           4
	//*  25   53:invokevirtual   #45  <Method String Class.getName()>
	//*  26   56:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//*  27   59:ldc1            #47  <String "), not marked as ignorable">
	//*  28   61:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//*  29   64:invokevirtual   #50  <Method String StringBuilder.toString()>
	//*  30   67:aload_0         
	//*  31   68:invokevirtual   #56  <Method JsonLocation JsonParser.getCurrentLocation()>
	//*  32   71:aload           4
	//*  33   73:aload_2         
	//*  34   74:aload_3         
	//*  35   75:invokespecial   #57  <Method void UnrecognizedPropertyException(JsonParser, String, JsonLocation, Class, String, Collection)>
	//*  36   78:astore_0        
	//*  37   79:aload_0         
	//*  38   80:aload_1         
	//*  39   81:aload_2         
	//*  40   82:invokevirtual   #61  <Method void prependPath(Object, String)>
	//*  41   85:aload_0         
	//*  42   86:areturn         
			class1 = obj.getClass();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #67  <Method Class Object.getClass()>
	//   45   91:astore          4
		jsonparser = ((JsonParser) (new UnrecognizedPropertyException(jsonparser, (new StringBuilder()).append("Unrecognized field \"").append(s).append("\" (class ").append(class1.getName()).append("), not marked as ignorable").toString(), jsonparser.getCurrentLocation(), class1, s, collection)));
		((UnrecognizedPropertyException) (jsonparser)).prependPath(obj, s);
		return ((UnrecognizedPropertyException) (jsonparser));
	//*  46   93:goto            25
	}

	private static final long serialVersionUID = 1L;
}
