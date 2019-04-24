// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;

public abstract class ObjectIdGenerator
	implements Serializable
{
	public static final class IdKey
		implements Serializable
	{

		public boolean equals(Object obj)
		{
			if(obj != this)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:if_acmpne       7
		//*   3    5:iconst_1        
		//*   4    6:ireturn         
			{
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
				obj = ((Object) ((IdKey)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class ObjectIdGenerator$IdKey>
		//   18   30:astore_1        
				if(!((IdKey) (obj)).key.equals(key) || ((IdKey) (obj)).type != type || ((IdKey) (obj)).scope != scope)
		//*  19   31:aload_1         
		//*  20   32:getfield        #39  <Field Object key>
		//*  21   35:aload_0         
		//*  22   36:getfield        #39  <Field Object key>
		//*  23   39:invokevirtual   #64  <Method boolean Object.equals(Object)>
		//*  24   42:ifeq            67
		//*  25   45:aload_1         
		//*  26   46:getfield        #35  <Field Class type>
		//*  27   49:aload_0         
		//*  28   50:getfield        #35  <Field Class type>
		//*  29   53:if_acmpne       67
		//*  30   56:aload_1         
		//*  31   57:getfield        #37  <Field Class scope>
		//*  32   60:aload_0         
		//*  33   61:getfield        #37  <Field Class scope>
		//*  34   64:if_acmpeq       5
					return false;
		//   35   67:iconst_0        
		//   36   68:ireturn         
			}
			return true;
		}

		public int hashCode()
		{
			return hashCode;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int hashCode>
		//    2    4:ireturn         
		}

		public String toString()
		{
			Object obj = key;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field Object key>
		//    2    4:astore_3        
			String s;
			String s1;
			if(type == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #35  <Field Class type>
		//*   5    9:ifnonnull       47
				s = "NONE";
		//    6   12:ldc1            #67  <String "NONE">
		//    7   14:astore_1        
			else
		//*   8   15:aload_0         
		//*   9   16:getfield        #37  <Field Class scope>
		//*  10   19:ifnonnull       58
		//*  11   22:ldc1            #67  <String "NONE">
		//*  12   24:astore_2        
		//*  13   25:ldc1            #69  <String "[ObjectId: key=%s, type=%s, scope=%s]">
		//*  14   27:iconst_3        
		//*  15   28:anewarray       Object[]
		//*  16   31:dup             
		//*  17   32:iconst_0        
		//*  18   33:aload_3         
		//*  19   34:aastore         
		//*  20   35:dup             
		//*  21   36:iconst_1        
		//*  22   37:aload_1         
		//*  23   38:aastore         
		//*  24   39:dup             
		//*  25   40:iconst_2        
		//*  26   41:aload_2         
		//*  27   42:aastore         
		//*  28   43:invokestatic    #73  <Method String String.format(String, Object[])>
		//*  29   46:areturn         
				s = type.getName();
		//   30   47:aload_0         
		//   31   48:getfield        #35  <Field Class type>
		//   32   51:invokevirtual   #48  <Method String Class.getName()>
		//   33   54:astore_1        
			if(scope == null)
				s1 = "NONE";
			else
		//*  34   55:goto            15
				s1 = scope.getName();
		//   35   58:aload_0         
		//   36   59:getfield        #37  <Field Class scope>
		//   37   62:invokevirtual   #48  <Method String Class.getName()>
		//   38   65:astore_2        
			return String.format("[ObjectId: key=%s, type=%s, scope=%s]", new Object[] {
				obj, s, s1
			});
		//*  39   66:goto            25
		}

		private static final long serialVersionUID = 1L;
		private final int hashCode;
		public final Object key;
		public final Class scope;
		public final Class type;

		public IdKey(Class class1, Class class2, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			if(obj == null)
		//*   2    4:aload_3         
		//*   3    5:ifnonnull       18
				throw new IllegalArgumentException("Can not construct IdKey for null key");
		//    4    8:new             #28  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #30  <String "Can not construct IdKey for null key">
		//    7   14:invokespecial   #33  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			type = class1;
		//    9   18:aload_0         
		//   10   19:aload_1         
		//   11   20:putfield        #35  <Field Class type>
			scope = class2;
		//   12   23:aload_0         
		//   13   24:aload_2         
		//   14   25:putfield        #37  <Field Class scope>
			key = obj;
		//   15   28:aload_0         
		//   16   29:aload_3         
		//   17   30:putfield        #39  <Field Object key>
			int j = obj.hashCode() + class1.getName().hashCode();
		//   18   33:aload_3         
		//   19   34:invokevirtual   #42  <Method int Object.hashCode()>
		//   20   37:aload_1         
		//   21   38:invokevirtual   #48  <Method String Class.getName()>
		//   22   41:invokevirtual   #51  <Method int String.hashCode()>
		//   23   44:iadd            
		//   24   45:istore          5
			int i = j;
		//   25   47:iload           5
		//   26   49:istore          4
			if(class2 != null)
		//*  27   51:aload_2         
		//*  28   52:ifnull          67
				i = j ^ class2.getName().hashCode();
		//   29   55:iload           5
		//   30   57:aload_2         
		//   31   58:invokevirtual   #48  <Method String Class.getName()>
		//   32   61:invokevirtual   #51  <Method int String.hashCode()>
		//   33   64:ixor            
		//   34   65:istore          4
			hashCode = i;
		//   35   67:aload_0         
		//   36   68:iload           4
		//   37   70:putfield        #53  <Field int hashCode>
		//   38   73:return          
		}
	}


	public ObjectIdGenerator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public abstract boolean canUseFor(ObjectIdGenerator objectidgenerator);

	public abstract ObjectIdGenerator forScope(Class class1);

	public abstract Object generateId(Object obj);

	public abstract Class getScope();

	public boolean isValidReferencePropertyName(String s, Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract IdKey key(Object obj);

	public boolean maySerializeAsObject()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract ObjectIdGenerator newForSerialization(Object obj);
}
