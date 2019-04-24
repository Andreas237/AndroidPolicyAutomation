// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

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

	protected JavaType _typeFromId(String s, TypeFactory typefactory)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(s.startsWith("."))
	//*   2    2:aload_1         
	//*   3    3:ldc1            #35  <String ".">
	//*   4    5:invokevirtual   #48  <Method boolean String.startsWith(String)>
	//*   5    8:ifeq            56
		{
			obj = ((Object) (new StringBuilder(s.length() + _basePackageName.length())));
	//    6   11:new             #50  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:aload_1         
	//    9   16:invokevirtual   #54  <Method int String.length()>
	//   10   19:aload_0         
	//   11   20:getfield        #33  <Field String _basePackageName>
	//   12   23:invokevirtual   #54  <Method int String.length()>
	//   13   26:iadd            
	//   14   27:invokespecial   #57  <Method void StringBuilder(int)>
	//   15   30:astore_3        
			if(_basePackageName.length() == 0)
	//*  16   31:aload_0         
	//*  17   32:getfield        #33  <Field String _basePackageName>
	//*  18   35:invokevirtual   #54  <Method int String.length()>
	//*  19   38:ifne            63
				((StringBuilder) (obj)).append(s.substring(1));
	//   20   41:aload_3         
	//   21   42:aload_1         
	//   22   43:iconst_1        
	//   23   44:invokevirtual   #60  <Method String String.substring(int)>
	//   24   47:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			else
	//*  26   51:aload_3         
	//*  27   52:invokevirtual   #67  <Method String StringBuilder.toString()>
	//*  28   55:astore_3        
	//*  29   56:aload_0         
	//*  30   57:aload_3         
	//*  31   58:aload_2         
	//*  32   59:invokespecial   #69  <Method JavaType ClassNameIdResolver._typeFromId(String, TypeFactory)>
	//*  33   62:areturn         
				((StringBuilder) (obj)).append(_basePackageName).append(s);
	//   34   63:aload_3         
	//   35   64:aload_0         
	//   36   65:getfield        #33  <Field String _basePackageName>
	//   37   68:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   38   71:aload_1         
	//   39   72:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
		}
		return super._typeFromId(((String) (obj)), typefactory);
	//*  41   76:goto            51
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.Id getMechanism()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.Id.MINIMAL_CLASS;
	//    0    0:getstatic       #77  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.MINIMAL_CLASS>
	//    1    3:areturn         
	}

	public String idFromValue(Object obj)
	{
		String s = obj.getClass().getName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #84  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #23  <Method String Class.getName()>
	//    3    7:astore_2        
		obj = ((Object) (s));
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(s.startsWith(_basePackagePrefix))
	//*   6   10:aload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #37  <Field String _basePackagePrefix>
	//*   9   15:invokevirtual   #48  <Method boolean String.startsWith(String)>
	//*  10   18:ifeq            35
			obj = ((Object) (s.substring(_basePackagePrefix.length() - 1)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #37  <Field String _basePackagePrefix>
	//   14   26:invokevirtual   #54  <Method int String.length()>
	//   15   29:iconst_1        
	//   16   30:isub            
	//   17   31:invokevirtual   #60  <Method String String.substring(int)>
	//   18   34:astore_1        
		return ((String) (obj));
	//   19   35:aload_1         
	//   20   36:areturn         
	}

	protected final String _basePackageName;
	protected final String _basePackagePrefix;
}
