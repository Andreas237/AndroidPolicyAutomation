// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

public interface TypeResolutionContext
{
	public static class Basic
		implements TypeResolutionContext
	{

		public JavaType resolveType(Type type)
		{
			return _typeFactory.constructType(type, _bindings);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field TypeFactory _typeFactory>
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #20  <Field TypeBindings _bindings>
		//    5    9:invokevirtual   #29  <Method JavaType TypeFactory.constructType(Type, TypeBindings)>
		//    6   12:areturn         
		}

		private final TypeBindings _bindings;
		private final TypeFactory _typeFactory;

		public Basic(TypeFactory typefactory, TypeBindings typebindings)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			_typeFactory = typefactory;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field TypeFactory _typeFactory>
			_bindings = typebindings;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field TypeBindings _bindings>
		//    8   14:return          
		}
	}


	public abstract JavaType resolveType(Type type);
}
