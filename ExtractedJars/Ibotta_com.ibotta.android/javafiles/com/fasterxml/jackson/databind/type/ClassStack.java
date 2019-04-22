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
		Object obj = ((Object) (_selfRefs));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ArrayList _selfRefs>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          39
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((ResolvedRecursiveType)((Iterator) (obj)).next()).setReference(javatype));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #49  <Method Iterator ArrayList.iterator()>
	//    7   13:astore_2        
	//    8   14:aload_2         
	//    9   15:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   10   20:ifeq            39
	//   11   23:aload_2         
	//   12   24:invokeinterface #59  <Method Object Iterator.next()>
	//   13   29:checkcast       #61  <Class ResolvedRecursiveType>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #64  <Method void ResolvedRecursiveType.setReference(JavaType)>
	//*  16   36:goto            14
	//   17   39:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #68  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("[ClassStack (self-refs: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #71  <String "[ClassStack (self-refs: ">
	//    6   11:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		Object obj = ((Object) (_selfRefs));
	//    8   15:aload_0         
	//    9   16:getfield        #32  <Field ArrayList _selfRefs>
	//   10   19:astore_1        
		if(obj == null)
	//*  11   20:aload_1         
	//*  12   21:ifnonnull       30
			obj = "0";
	//   13   24:ldc1            #77  <String "0">
	//   14   26:astore_1        
		else
	//*  15   27:goto            38
			obj = ((Object) (String.valueOf(((ArrayList) (obj)).size())));
	//   16   30:aload_1         
	//   17   31:invokevirtual   #81  <Method int ArrayList.size()>
	//   18   34:invokestatic    #87  <Method String String.valueOf(int)>
	//   19   37:astore_1        
		stringbuilder.append(((String) (obj)));
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(')');
	//   24   44:aload_2         
	//   25   45:bipush          41
	//   26   47:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   27   50:pop             
		for(ClassStack classstack = this; classstack != null; classstack = classstack._parent)
	//*  28   51:aload_0         
	//*  29   52:astore_1        
	//*  30   53:aload_1         
	//*  31   54:ifnull          84
		{
			stringbuilder.append(' ');
	//   32   57:aload_2         
	//   33   58:bipush          32
	//   34   60:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   35   63:pop             
			stringbuilder.append(classstack._current.getName());
	//   36   64:aload_2         
	//   37   65:aload_1         
	//   38   66:getfield        #21  <Field Class _current>
	//   39   69:invokevirtual   #95  <Method String Class.getName()>
	//   40   72:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   41   75:pop             
		}

	//   42   76:aload_1         
	//   43   77:getfield        #19  <Field ClassStack _parent>
	//   44   80:astore_1        
	//*  45   81:goto            53
		stringbuilder.append(']');
	//   46   84:aload_2         
	//   47   85:bipush          93
	//   48   87:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   49   90:pop             
		return stringbuilder.toString();
	//   50   91:aload_2         
	//   51   92:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   52   95:areturn         
	}

	protected final Class _current;
	protected final ClassStack _parent;
	private ArrayList _selfRefs;
}
