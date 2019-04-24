// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			ResolvedRecursiveType

public final class ClassStack
{

	private ClassStack(ClassStack classstack, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		_parent = classstack;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field ClassStack _parent>
		_current = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Class _current>
	//    8   14:return          
	}

	public ClassStack(Class class1)
	{
		this(((ClassStack) (null)), class1);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #27  <Method void ClassStack(ClassStack, Class)>
	//    4    6:return          
	}

	public void addSelfReference(ResolvedRecursiveType resolvedrecursivetype)
	{
		if(_selfRefs == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field ArrayList _selfRefs>
	//*   2    4:ifnonnull       18
			_selfRefs = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #34  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #35  <Method void ArrayList()>
	//    7   15:putfield        #32  <Field ArrayList _selfRefs>
		_selfRefs.add(((Object) (resolvedrecursivetype)));
	//    8   18:aload_0         
	//    9   19:getfield        #32  <Field ArrayList _selfRefs>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #39  <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public ClassStack child(Class class1)
	{
		return new ClassStack(this, class1);
	//    0    0:new             #2   <Class ClassStack>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #27  <Method void ClassStack(ClassStack, Class)>
	//    5    9:areturn         
	}

	public ClassStack find(Class class1)
	{
		if(_current == class1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Class _current>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		for(ClassStack classstack = _parent; classstack != null; classstack = classstack._parent)
	//*   6   10:aload_0         
	//*   7   11:getfield        #19  <Field ClassStack _parent>
	//*   8   14:astore_2        
	//*   9   15:aload_2         
	//*  10   16:ifnull          37
			if(classstack._current == class1)
	//*  11   19:aload_2         
	//*  12   20:getfield        #21  <Field Class _current>
	//*  13   23:aload_1         
	//*  14   24:if_acmpne       29
				return classstack;
	//   15   27:aload_2         
	//   16   28:areturn         

	//   17   29:aload_2         
	//   18   30:getfield        #19  <Field ClassStack _parent>
	//   19   33:astore_2        
	//*  20   34:goto            15
		return null;
	//   21   37:aconst_null     
	//   22   38:areturn         
	}

	public void resolveSelfReferences(JavaType javatype)
	{
		if(_selfRefs != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field ArrayList _selfRefs>
	//*   2    4:ifnull          40
		{
			for(Iterator iterator = _selfRefs.iterator(); iterator.hasNext(); ((ResolvedRecursiveType)iterator.next()).setReference(javatype));
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field ArrayList _selfRefs>
	//    5   11:invokevirtual   #49  <Method Iterator ArrayList.iterator()>
	//    6   14:astore_2        
	//    7   15:aload_2         
	//    8   16:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            40
	//   10   24:aload_2         
	//   11   25:invokeinterface #59  <Method Object Iterator.next()>
	//   12   30:checkcast       #61  <Class ResolvedRecursiveType>
	//   13   33:aload_1         
	//   14   34:invokevirtual   #64  <Method void ResolvedRecursiveType.setReference(JavaType)>
		}
	//*  15   37:goto            15
	//   16   40:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore_2        
		StringBuilder stringbuilder1 = stringbuilder.append("[ClassStack (self-refs: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #71  <String "[ClassStack (self-refs: ">
	//    6   11:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:astore_3        
		Object obj;
		if(_selfRefs == null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #32  <Field ArrayList _selfRefs>
	//*  10   19:ifnonnull       67
			obj = "0";
	//   11   22:ldc1            #77  <String "0">
	//   12   24:astore_1        
		else
	//*  13   25:aload_3         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  16   30:bipush          41
	//*  17   32:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
	//*  18   35:pop             
	//*  19   36:aload_0         
	//*  20   37:astore_1        
	//*  21   38:aload_1         
	//*  22   39:ifnull          81
	//*  23   42:aload_2         
	//*  24   43:bipush          32
	//*  25   45:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
	//*  26   48:aload_1         
	//*  27   49:getfield        #21  <Field Class _current>
	//*  28   52:invokevirtual   #85  <Method String Class.getName()>
	//*  29   55:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//*  30   58:pop             
	//*  31   59:aload_1         
	//*  32   60:getfield        #19  <Field ClassStack _parent>
	//*  33   63:astore_1        
	//*  34   64:goto            38
			obj = ((Object) (String.valueOf(_selfRefs.size())));
	//   35   67:aload_0         
	//   36   68:getfield        #32  <Field ArrayList _selfRefs>
	//   37   71:invokevirtual   #89  <Method int ArrayList.size()>
	//   38   74:invokestatic    #95  <Method String String.valueOf(int)>
	//   39   77:astore_1        
		stringbuilder1.append(((String) (obj))).append(')');
		for(obj = ((Object) (this)); obj != null; obj = ((Object) (((ClassStack) (obj))._parent)))
			stringbuilder.append(' ').append(((ClassStack) (obj))._current.getName());

	//*  40   78:goto            25
		stringbuilder.append(']');
	//   41   81:aload_2         
	//   42   82:bipush          93
	//   43   84:invokevirtual   #80  <Method StringBuilder StringBuilder.append(char)>
	//   44   87:pop             
		return stringbuilder.toString();
	//   45   88:aload_2         
	//   46   89:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   47   92:areturn         
	}

	protected final Class _current;
	protected final ClassStack _parent;
	private ArrayList _selfRefs;
}
