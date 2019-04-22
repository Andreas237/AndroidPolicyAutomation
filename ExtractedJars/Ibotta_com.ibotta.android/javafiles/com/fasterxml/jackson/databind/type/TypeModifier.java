// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBindings, TypeFactory

public abstract class TypeModifier
{

	public TypeModifier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract JavaType modifyType(JavaType javatype, Type type, TypeBindings typebindings, TypeFactory typefactory);
}
