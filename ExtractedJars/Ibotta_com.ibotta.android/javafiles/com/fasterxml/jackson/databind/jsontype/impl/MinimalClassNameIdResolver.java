// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			ClassNameIdResolver

public class MinimalClassNameIdResolver extends ClassNameIdResolver
{

	protected MinimalClassNameIdResolver(JavaType javatype, TypeFactory typefactory)
	{
		super(javatype, typefactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void ClassNameIdResolver(JavaType, TypeFactory)>
		javatype = ((JavaType) (javatype.getRawClass().getName()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #17  <Method Class JavaType.getRawClass()>
	//    6   10:invokevirtual   #23  <Method String Class.getName()>
	//    7   13:astore_1        
		int i = ((String) (javatype)).lastIndexOf('.');
	//    8   14:aload_1         
	//    9   15:bipush          46
	//   10   17:invokevirtual   #29  <Method int String.lastIndexOf(int)>
	//   11   20:istore_3        
		if(i < 0)
	//*  12   21:iload_3         
	//*  13   22:ifge            38
		{
			_basePackageName = "";
	//   14   25:aload_0         
	//   15   26:ldc1            #31  <String "">
	//   16   28:putfield        #33  <Field String _basePackageName>
			_basePackagePrefix = ".";
	//   17   31:aload_0         
	//   18   32:ldc1            #35  <String ".">
	//   19   34:putfield        #37  <Field String _basePackagePrefix>
			return;
	//   20   37:return          
		} else
		{
			_basePackagePrefix = ((String) (javatype)).substring(0, i + 1);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:iconst_0        
	//   24   41:iload_3         
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:invokevirtual   #41  <Method String String.substring(int, int)>
	//   28   47:putfield        #37  <Field String _basePackagePrefix>
			_basePackageName = ((String) (javatype)).substring(0, i);
	//   29   50:aload_0         
	//   30   51:aload_1         
	//   31   52:iconst_0        
	//   32   53:iload_3         
	//   33   54:invokevirtual   #41  <Method String String.substring(int, int)>
	//   34   57:putfield        #33  <Field String _basePackageName>
			return;
	//   35   60:return          
		}
	}

	protected JavaType _typeFromId(String s, DatabindContext databindcontext)
		throws IOException
	{
		Object obj = ((Object) (s));
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(s.startsWith("."))
	//*   2    2:aload_1         
	//*   3    3:ldc1            #35  <String ".">
	//*   4    5:invokevirtual   #50  <Method boolean String.startsWith(String)>
	//*   5    8:ifeq            74
		{
			obj = ((Object) (new StringBuilder(s.length() + _basePackageName.length())));
	//    6   11:new             #52  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:aload_1         
	//    9   16:invokevirtual   #56  <Method int String.length()>
	//   10   19:aload_0         
	//   11   20:getfield        #33  <Field String _basePackageName>
	//   12   23:invokevirtual   #56  <Method int String.length()>
	//   13   26:iadd            
	//   14   27:invokespecial   #59  <Method void StringBuilder(int)>
	//   15   30:astore_3        
			if(_basePackageName.length() == 0)
	//*  16   31:aload_0         
	//*  17   32:getfield        #33  <Field String _basePackageName>
	//*  18   35:invokevirtual   #56  <Method int String.length()>
	//*  19   38:ifne            54
			{
				((StringBuilder) (obj)).append(s.substring(1));
	//   20   41:aload_3         
	//   21   42:aload_1         
	//   22   43:iconst_1        
	//   23   44:invokevirtual   #62  <Method String String.substring(int)>
	//   24   47:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			} else
	//*  26   51:goto            69
			{
				((StringBuilder) (obj)).append(_basePackageName);
	//   27   54:aload_3         
	//   28   55:aload_0         
	//   29   56:getfield        #33  <Field String _basePackageName>
	//   30   59:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
				((StringBuilder) (obj)).append(s);
	//   32   63:aload_3         
	//   33   64:aload_1         
	//   34   65:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			}
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   36   69:aload_3         
	//   37   70:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   38   73:astore_3        
		}
		return super._typeFromId(((String) (obj)), databindcontext);
	//   39   74:aload_0         
	//   40   75:aload_3         
	//   41   76:aload_2         
	//   42   77:invokespecial   #71  <Method JavaType ClassNameIdResolver._typeFromId(String, DatabindContext)>
	//   43   80:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.Id getMechanism()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
	//    0    0:getstatic       #80  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.MINIMAL_CLASS>
	//    1    3:areturn         
	}

	public String idFromValue(Object obj)
	{
		obj = ((Object) (obj.getClass().getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #23  <Method String Class.getName()>
	//    3    7:astore_1        
		if(((String) (obj)).startsWith(_basePackagePrefix))
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #37  <Field String _basePackagePrefix>
	//*   7   13:invokevirtual   #50  <Method boolean String.startsWith(String)>
	//*   8   16:ifeq            33
			return ((String) (obj)).substring(_basePackagePrefix.length() - 1);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #37  <Field String _basePackagePrefix>
	//   12   24:invokevirtual   #56  <Method int String.length()>
	//   13   27:iconst_1        
	//   14   28:isub            
	//   15   29:invokevirtual   #62  <Method String String.substring(int)>
	//   16   32:areturn         
		else
			return ((String) (obj));
	//   17   33:aload_1         
	//   18   34:areturn         
	}

	protected final String _basePackageName;
	protected final String _basePackagePrefix;
}
