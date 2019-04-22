// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			ObjectIdGenerator

public static final class ObjectIdGenerator$IdKey
	implements Serializable
{

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
	//*  10   14:invokevirtual   #62  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #62  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ObjectIdGenerator$IdKey)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ObjectIdGenerator$IdKey>
	//   18   30:astore_1        
		return ((ObjectIdGenerator$IdKey) (obj)).key.equals(key) && ((ObjectIdGenerator$IdKey) (obj)).type == type && ((ObjectIdGenerator$IdKey) (obj)).scope == scope;
	//   19   31:aload_1         
	//   20   32:getfield        #32  <Field Object key>
	//   21   35:aload_0         
	//   22   36:getfield        #32  <Field Object key>
	//   23   39:invokevirtual   #64  <Method boolean Object.equals(Object)>
	//   24   42:ifeq            69
	//   25   45:aload_1         
	//   26   46:getfield        #28  <Field Class type>
	//   27   49:aload_0         
	//   28   50:getfield        #28  <Field Class type>
	//   29   53:if_acmpne       69
	//   30   56:aload_1         
	//   31   57:getfield        #30  <Field Class scope>
	//   32   60:aload_0         
	//   33   61:getfield        #30  <Field Class scope>
	//   34   64:if_acmpne       69
	//   35   67:iconst_1        
	//   36   68:ireturn         
	//   37   69:iconst_0        
	//   38   70:ireturn         
	}

	public int hashCode()
	{
		return hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int hashCode>
	//    2    4:ireturn         
	}

	public String toString()
	{
		Object obj2 = key;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Object key>
	//    2    4:astore_3        
		Object obj = ((Object) (type));
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field Class type>
	//    5    9:astore_1        
		if(obj == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       20
			obj = "NONE";
	//    8   14:ldc1            #67  <String "NONE">
	//    9   16:astore_1        
		else
	//*  10   17:goto            25
			obj = ((Object) (((Class) (obj)).getName()));
	//   11   20:aload_1         
	//   12   21:invokevirtual   #41  <Method String Class.getName()>
	//   13   24:astore_1        
		Object obj1 = ((Object) (scope));
	//   14   25:aload_0         
	//   15   26:getfield        #30  <Field Class scope>
	//   16   29:astore_2        
		if(obj1 == null)
	//*  17   30:aload_2         
	//*  18   31:ifnonnull       40
			obj1 = "NONE";
	//   19   34:ldc1            #67  <String "NONE">
	//   20   36:astore_2        
		else
	//*  21   37:goto            45
			obj1 = ((Object) (((Class) (obj1)).getName()));
	//   22   40:aload_2         
	//   23   41:invokevirtual   #41  <Method String Class.getName()>
	//   24   44:astore_2        
		return String.format("[ObjectId: key=%s, type=%s, scope=%s]", new Object[] {
			obj2, obj, obj1
		});
	//   25   45:ldc1            #69  <String "[ObjectId: key=%s, type=%s, scope=%s]">
	//   26   47:iconst_3        
	//   27   48:anewarray       Object[]
	//   28   51:dup             
	//   29   52:iconst_0        
	//   30   53:aload_3         
	//   31   54:aastore         
	//   32   55:dup             
	//   33   56:iconst_1        
	//   34   57:aload_1         
	//   35   58:aastore         
	//   36   59:dup             
	//   37   60:iconst_2        
	//   38   61:aload_2         
	//   39   62:aastore         
	//   40   63:invokestatic    #73  <Method String String.format(String, Object[])>
	//   41   66:areturn         
	}

	private static final long serialVersionUID = 1L;
	private final int hashCode;
	public final Object key;
	public final Class scope;
	public final Class type;

	public ObjectIdGenerator$IdKey(Class class1, Class class2, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		if(obj != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          64
		{
			type = class1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #28  <Field Class type>
			scope = class2;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #30  <Field Class scope>
			key = obj;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #32  <Field Object key>
			int j = obj.hashCode() + class1.getName().hashCode();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #35  <Method int Object.hashCode()>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #41  <Method String Class.getName()>
	//   17   31:invokevirtual   #44  <Method int String.hashCode()>
	//   18   34:iadd            
	//   19   35:istore          5
			int i = j;
	//   20   37:iload           5
	//   21   39:istore          4
			if(class2 != null)
	//*  22   41:aload_2         
	//*  23   42:ifnull          57
				i = j ^ class2.getName().hashCode();
	//   24   45:iload           5
	//   25   47:aload_2         
	//   26   48:invokevirtual   #41  <Method String Class.getName()>
	//   27   51:invokevirtual   #44  <Method int String.hashCode()>
	//   28   54:ixor            
	//   29   55:istore          4
			hashCode = i;
	//   30   57:aload_0         
	//   31   58:iload           4
	//   32   60:putfield        #46  <Field int hashCode>
			return;
	//   33   63:return          
		} else
		{
			throw new IllegalArgumentException("Can not construct IdKey for null key");
	//   34   64:new             #48  <Class IllegalArgumentException>
	//   35   67:dup             
	//   36   68:ldc1            #50  <String "Can not construct IdKey for null key">
	//   37   70:invokespecial   #53  <Method void IllegalArgumentException(String)>
	//   38   73:athrow          
		}
	}
}
