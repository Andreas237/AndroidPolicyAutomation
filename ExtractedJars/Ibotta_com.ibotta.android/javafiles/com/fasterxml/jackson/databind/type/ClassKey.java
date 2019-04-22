// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

public final class ClassKey
	implements Serializable, Comparable
{

	public ClassKey()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_class = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #26  <Field Class _class>
		_className = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #28  <Field String _className>
		_hashCode = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #30  <Field int _hashCode>
	//   11   19:return          
	}

	public ClassKey(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_class = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Class _class>
		_className = class1.getName();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #38  <Method String Class.getName()>
	//    8   14:putfield        #28  <Field String _className>
		_hashCode = _className.hashCode();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #28  <Field String _className>
	//   12   22:invokevirtual   #44  <Method int String.hashCode()>
	//   13   25:putfield        #30  <Field int _hashCode>
	//   14   28:return          
	}

	public int compareTo(ClassKey classkey)
	{
		return _className.compareTo(classkey._className);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String _className>
	//    2    4:aload_1         
	//    3    5:getfield        #28  <Field String _className>
	//    4    8:invokevirtual   #51  <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ClassKey)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class ClassKey>
	//    3    5:invokevirtual   #54  <Method int compareTo(ClassKey)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(obj.getClass() != ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #60  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #60  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		return ((ClassKey)obj)._class == _class;
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ClassKey>
	//   18   30:getfield        #26  <Field Class _class>
	//   19   33:aload_0         
	//   20   34:getfield        #26  <Field Class _class>
	//   21   37:if_acmpne       42
	//   22   40:iconst_1        
	//   23   41:ireturn         
	//   24   42:iconst_0        
	//   25   43:ireturn         
	}

	public int hashCode()
	{
		return _hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int _hashCode>
	//    2    4:ireturn         
	}

	public void reset(Class class1)
	{
		_class = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Class _class>
		_className = class1.getName();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #38  <Method String Class.getName()>
	//    6   10:putfield        #28  <Field String _className>
		_hashCode = _className.hashCode();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field String _className>
	//   10   18:invokevirtual   #44  <Method int String.hashCode()>
	//   11   21:putfield        #30  <Field int _hashCode>
	//   12   24:return          
	}

	public String toString()
	{
		return _className;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String _className>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	private Class _class;
	private String _className;
	private int _hashCode;
}
