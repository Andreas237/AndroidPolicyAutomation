// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			OptBoolean, JacksonAnnotationValue

public interface JacksonInject
	extends Annotation
{
	public static class Value
		implements JacksonAnnotationValue, Serializable
	{

		private static boolean _empty(Object obj, Boolean boolean1)
		{
			return obj == null && boolean1 == null;
		//    0    0:aload_0         
		//    1    1:ifnonnull       10
		//    2    4:aload_1         
		//    3    5:ifnonnull       10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		public static Value construct(Object obj, Boolean boolean1)
		{
			Object obj1 = obj;
		//    0    0:aload_0         
		//    1    1:astore_2        
			if("".equals(obj))
		//*   2    2:ldc1            #43  <String "">
		//*   3    4:aload_0         
		//*   4    5:invokevirtual   #49  <Method boolean String.equals(Object)>
		//*   5    8:ifeq            13
				obj1 = null;
		//    6   11:aconst_null     
		//    7   12:astore_2        
			if(_empty(obj1, boolean1))
		//*   8   13:aload_2         
		//*   9   14:aload_1         
		//*  10   15:invokestatic    #51  <Method boolean _empty(Object, Boolean)>
		//*  11   18:ifeq            25
				return EMPTY;
		//   12   21:getstatic       #30  <Field JacksonInject$Value EMPTY>
		//   13   24:areturn         
			else
				return new Value(obj1, boolean1);
		//   14   25:new             #2   <Class JacksonInject$Value>
		//   15   28:dup             
		//   16   29:aload_2         
		//   17   30:aload_1         
		//   18   31:invokespecial   #28  <Method void JacksonInject$Value(Object, Boolean)>
		//   19   34:areturn         
		}

		public static Value forId(Object obj)
		{
			return construct(obj, ((Boolean) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokestatic    #55  <Method JacksonInject$Value construct(Object, Boolean)>
		//    3    5:areturn         
		}

		public static Value from(JacksonInject jacksoninject)
		{
			if(jacksoninject == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       8
				return EMPTY;
		//    2    4:getstatic       #30  <Field JacksonInject$Value EMPTY>
		//    3    7:areturn         
			else
				return construct(((Object) (jacksoninject.value())), jacksoninject.useInput().asBoolean());
		//    4    8:aload_0         
		//    5    9:invokeinterface #61  <Method String JacksonInject.value()>
		//    6   14:aload_0         
		//    7   15:invokeinterface #65  <Method OptBoolean JacksonInject.useInput()>
		//    8   20:invokevirtual   #71  <Method Boolean OptBoolean.asBoolean()>
		//    9   23:invokestatic    #55  <Method JacksonInject$Value construct(Object, Boolean)>
		//   10   26:areturn         
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
			if(obj.getClass() == ((Object)this).getClass())
		//*   9   13:aload_1         
		//*  10   14:invokevirtual   #75  <Method Class Object.getClass()>
		//*  11   17:aload_0         
		//*  12   18:invokevirtual   #75  <Method Class Object.getClass()>
		//*  13   21:if_acmpne       72
			{
				obj = ((Object) ((Value)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class JacksonInject$Value>
		//   16   28:astore_1        
				if(OptBoolean.equals(_useInput, ((Value) (obj))._useInput))
		//*  17   29:aload_0         
		//*  18   30:getfield        #37  <Field Boolean _useInput>
		//*  19   33:aload_1         
		//*  20   34:getfield        #37  <Field Boolean _useInput>
		//*  21   37:invokestatic    #78  <Method boolean OptBoolean.equals(Boolean, Boolean)>
		//*  22   40:ifeq            72
				{
					Object obj1 = _id;
		//   23   43:aload_0         
		//   24   44:getfield        #35  <Field Object _id>
		//   25   47:astore_2        
					if(obj1 == null)
		//*  26   48:aload_2         
		//*  27   49:ifnonnull       63
						return ((Value) (obj))._id == null;
		//   28   52:aload_1         
		//   29   53:getfield        #35  <Field Object _id>
		//   30   56:ifnonnull       61
		//   31   59:iconst_1        
		//   32   60:ireturn         
		//   33   61:iconst_0        
		//   34   62:ireturn         
					else
						return obj1.equals(((Value) (obj))._id);
		//   35   63:aload_2         
		//   36   64:aload_1         
		//   37   65:getfield        #35  <Field Object _id>
		//   38   68:invokevirtual   #79  <Method boolean Object.equals(Object)>
		//   39   71:ireturn         
				}
			}
			return false;
		//   40   72:iconst_0        
		//   41   73:ireturn         
		}

		public Object getId()
		{
			return _id;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Object _id>
		//    2    4:areturn         
		}

		public boolean hasId()
		{
			return _id != null;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Object _id>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public int hashCode()
		{
			Object obj = _id;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Object _id>
		//    2    4:astore_3        
			int i = 1;
		//    3    5:iconst_1        
		//    4    6:istore_1        
			if(obj != null)
		//*   5    7:aload_3         
		//*   6    8:ifnull          18
				i = 1 + obj.hashCode();
		//    7   11:iconst_1        
		//    8   12:aload_3         
		//    9   13:invokevirtual   #87  <Method int Object.hashCode()>
		//   10   16:iadd            
		//   11   17:istore_1        
			obj = ((Object) (_useInput));
		//   12   18:aload_0         
		//   13   19:getfield        #37  <Field Boolean _useInput>
		//   14   22:astore_3        
			int j = i;
		//   15   23:iload_1         
		//   16   24:istore_2        
			if(obj != null)
		//*  17   25:aload_3         
		//*  18   26:ifnull          36
				j = i + ((Boolean) (obj)).hashCode();
		//   19   29:iload_1         
		//   20   30:aload_3         
		//   21   31:invokevirtual   #90  <Method int Boolean.hashCode()>
		//   22   34:iadd            
		//   23   35:istore_2        
			return j;
		//   24   36:iload_2         
		//   25   37:ireturn         
		}

		public String toString()
		{
			return String.format("JacksonInject.Value(id=%s,useInput=%s)", new Object[] {
				_id, _useInput
			});
		//    0    0:ldc1            #93  <String "JacksonInject.Value(id=%s,useInput=%s)">
		//    1    2:iconst_2        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:getfield        #35  <Field Object _id>
		//    7   12:aastore         
		//    8   13:dup             
		//    9   14:iconst_1        
		//   10   15:aload_0         
		//   11   16:getfield        #37  <Field Boolean _useInput>
		//   12   19:aastore         
		//   13   20:invokestatic    #97  <Method String String.format(String, Object[])>
		//   14   23:areturn         
		}

		public Class valueFor()
		{
			return com/fasterxml/jackson/annotation/JacksonInject;
		//    0    0:ldc1            #11  <Class JacksonInject>
		//    1    2:areturn         
		}

		public Value withId(Object obj)
		{
			if(obj == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       13
			{
				if(_id == null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #35  <Field Object _id>
		//*   4    8:ifnonnull       26
					return this;
		//    5   11:aload_0         
		//    6   12:areturn         
			} else
			if(obj.equals(_id))
		//*   7   13:aload_1         
		//*   8   14:aload_0         
		//*   9   15:getfield        #35  <Field Object _id>
		//*  10   18:invokevirtual   #79  <Method boolean Object.equals(Object)>
		//*  11   21:ifeq            26
				return this;
		//   12   24:aload_0         
		//   13   25:areturn         
			return new Value(obj, _useInput);
		//   14   26:new             #2   <Class JacksonInject$Value>
		//   15   29:dup             
		//   16   30:aload_1         
		//   17   31:aload_0         
		//   18   32:getfield        #37  <Field Boolean _useInput>
		//   19   35:invokespecial   #28  <Method void JacksonInject$Value(Object, Boolean)>
		//   20   38:areturn         
		}

		protected static final Value EMPTY = new Value(((Object) (null)), ((Boolean) (null)));
		private static final long serialVersionUID = 1L;
		protected final Object _id;
		protected final Boolean _useInput;

		static 
		{
		//    0    0:new             #2   <Class JacksonInject$Value>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:aconst_null     
		//    4    6:invokespecial   #28  <Method void JacksonInject$Value(Object, Boolean)>
		//    5    9:putstatic       #30  <Field JacksonInject$Value EMPTY>
		//*   6   12:return          
		}

		protected Value(Object obj, Boolean boolean1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			_id = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #35  <Field Object _id>
			_useInput = boolean1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #37  <Field Boolean _useInput>
		//    8   14:return          
		}
	}


	public abstract OptBoolean useInput();

	public abstract String value();
}
