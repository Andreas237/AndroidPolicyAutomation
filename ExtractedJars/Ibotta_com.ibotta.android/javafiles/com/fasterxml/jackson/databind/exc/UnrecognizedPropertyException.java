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

	public static UnrecognizedPropertyException from(JsonParser jsonparser, Object obj, String s, Collection collection)
	{
		Class class1;
		if(obj instanceof Class)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #19  <Class Class>
	//*   2    4:ifeq            16
			class1 = (Class)obj;
	//    3    7:aload_1         
	//    4    8:checkcast       #19  <Class Class>
	//    5   11:astore          4
		else
	//*   6   13:goto            22
			class1 = obj.getClass();
	//    7   16:aload_1         
	//    8   17:invokevirtual   #25  <Method Class Object.getClass()>
	//    9   20:astore          4
		jsonparser = ((JsonParser) (new UnrecognizedPropertyException(jsonparser, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", new Object[] {
			s, class1.getName()
		}), jsonparser.getCurrentLocation(), class1, s, collection)));
	//   10   22:new             #2   <Class UnrecognizedPropertyException>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:ldc1            #27  <String "Unrecognized field \"%s\" (class %s), not marked as ignorable">
	//   14   29:iconst_2        
	//   15   30:anewarray       Object[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:aload_2         
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_1        
	//   22   39:aload           4
	//   23   41:invokevirtual   #31  <Method String Class.getName()>
	//   24   44:aastore         
	//   25   45:invokestatic    #37  <Method String String.format(String, Object[])>
	//   26   48:aload_0         
	//   27   49:invokevirtual   #43  <Method JsonLocation JsonParser.getCurrentLocation()>
	//   28   52:aload           4
	//   29   54:aload_2         
	//   30   55:aload_3         
	//   31   56:invokespecial   #44  <Method void UnrecognizedPropertyException(JsonParser, String, JsonLocation, Class, String, Collection)>
	//   32   59:astore_0        
		((UnrecognizedPropertyException) (jsonparser)).prependPath(obj, s);
	//   33   60:aload_0         
	//   34   61:aload_1         
	//   35   62:aload_2         
	//   36   63:invokevirtual   #48  <Method void prependPath(Object, String)>
		return ((UnrecognizedPropertyException) (jsonparser));
	//   37   66:aload_0         
	//   38   67:areturn         
	}

	private static final long serialVersionUID = 1L;
}
