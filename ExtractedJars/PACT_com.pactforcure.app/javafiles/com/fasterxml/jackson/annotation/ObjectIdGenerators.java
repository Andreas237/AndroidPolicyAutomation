// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			ObjectIdGenerator

public class ObjectIdGenerators
{
	private static abstract class Base extends ObjectIdGenerator
	{

		public boolean canUseFor(ObjectIdGenerator objectidgenerator)
		{
			return ((Object) (objectidgenerator)).getClass() == ((Object)this).getClass() && objectidgenerator.getScope() == _scope;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #29  <Method Class Object.getClass()>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #29  <Method Class Object.getClass()>
		//    4    8:if_acmpne       24
		//    5   11:aload_1         
		//    6   12:invokevirtual   #32  <Method Class ObjectIdGenerator.getScope()>
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field Class _scope>
		//    9   19:if_acmpne       24
		//   10   22:iconst_1        
		//   11   23:ireturn         
		//   12   24:iconst_0        
		//   13   25:ireturn         
		}

		public abstract Object generateId(Object obj);

		public final Class getScope()
		{
			return _scope;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Class _scope>
		//    2    4:areturn         
		}

		protected final Class _scope;

		protected Base(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ObjectIdGenerator()>
			_scope = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Class _scope>
		//    5    9:return          
		}
	}

	public static final class IntSequenceGenerator extends Base
	{

		public volatile boolean canUseFor(ObjectIdGenerator objectidgenerator)
		{
			return super.canUseFor(objectidgenerator);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method boolean ObjectIdGenerators$Base.canUseFor(ObjectIdGenerator)>
		//    3    5:ireturn         
		}

		public ObjectIdGenerator forScope(Class class1)
		{
			if(_scope == class1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #39  <Field Class _scope>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       10
				return ((ObjectIdGenerator) (this));
		//    4    8:aload_0         
		//    5    9:areturn         
			else
				return ((ObjectIdGenerator) (new IntSequenceGenerator(class1, _nextValue)));
		//    6   10:new             #2   <Class ObjectIdGenerators$IntSequenceGenerator>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #27  <Field int _nextValue>
		//   11   19:invokespecial   #21  <Method void ObjectIdGenerators$IntSequenceGenerator(Class, int)>
		//   12   22:areturn         
		}

		public Integer generateId(Object obj)
		{
			if(obj == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
			{
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			} else
			{
				int i = _nextValue;
		//    4    6:aload_0         
		//    5    7:getfield        #27  <Field int _nextValue>
		//    6   10:istore_2        
				_nextValue = _nextValue + 1;
		//    7   11:aload_0         
		//    8   12:aload_0         
		//    9   13:getfield        #27  <Field int _nextValue>
		//   10   16:iconst_1        
		//   11   17:iadd            
		//   12   18:putfield        #27  <Field int _nextValue>
				return Integer.valueOf(i);
		//   13   21:iload_2         
		//   14   22:invokestatic    #48  <Method Integer Integer.valueOf(int)>
		//   15   25:areturn         
			}
		}

		public volatile Object generateId(Object obj)
		{
			return ((Object) (generateId(obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #51  <Method Integer generateId(Object)>
		//    3    5:areturn         
		}

		protected int initialValue()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public ObjectIdGenerator.IdKey key(Object obj)
		{
			if(obj == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			else
				return new ObjectIdGenerator.IdKey(((Object)this).getClass(), _scope, obj);
		//    4    6:new             #57  <Class ObjectIdGenerator$IdKey>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokevirtual   #61  <Method Class Object.getClass()>
		//    8   14:aload_0         
		//    9   15:getfield        #39  <Field Class _scope>
		//   10   18:aload_1         
		//   11   19:invokespecial   #64  <Method void ObjectIdGenerator$IdKey(Class, Class, Object)>
		//   12   22:areturn         
		}

		public ObjectIdGenerator newForSerialization(Object obj)
		{
			return ((ObjectIdGenerator) (new IntSequenceGenerator(_scope, initialValue())));
		//    0    0:new             #2   <Class ObjectIdGenerators$IntSequenceGenerator>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field Class _scope>
		//    4    8:aload_0         
		//    5    9:invokevirtual   #68  <Method int initialValue()>
		//    6   12:invokespecial   #21  <Method void ObjectIdGenerators$IntSequenceGenerator(Class, int)>
		//    7   15:areturn         
		}

		private static final long serialVersionUID = 1L;
		protected transient int _nextValue;

		public IntSequenceGenerator()
		{
			this(java/lang/Object, -1);
		//    0    0:aload_0         
		//    1    1:ldc1            #18  <Class Object>
		//    2    3:iconst_m1       
		//    3    4:invokespecial   #21  <Method void ObjectIdGenerators$IntSequenceGenerator(Class, int)>
		//    4    7:return          
		}

		public IntSequenceGenerator(Class class1, int i)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void ObjectIdGenerators$Base(Class)>
			_nextValue = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #27  <Field int _nextValue>
		//    6   10:return          
		}
	}

	public static abstract class None extends ObjectIdGenerator
	{

		public None()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void ObjectIdGenerator()>
		//    2    4:return          
		}
	}

	public static abstract class PropertyGenerator extends Base
	{

		public volatile boolean canUseFor(ObjectIdGenerator objectidgenerator)
		{
			return super.canUseFor(objectidgenerator);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method boolean ObjectIdGenerators$Base.canUseFor(ObjectIdGenerator)>
		//    3    5:ireturn         
		}

		private static final long serialVersionUID = 1L;

		protected PropertyGenerator(Class class1)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void ObjectIdGenerators$Base(Class)>
		//    3    5:return          
		}
	}

	public static final class StringIdGenerator extends Base
	{

		public boolean canUseFor(ObjectIdGenerator objectidgenerator)
		{
			return objectidgenerator instanceof StringIdGenerator;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class ObjectIdGenerators$StringIdGenerator>
		//    2    4:ireturn         
		}

		public ObjectIdGenerator forScope(Class class1)
		{
			return ((ObjectIdGenerator) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public volatile Object generateId(Object obj)
		{
			return ((Object) (generateId(obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #34  <Method String generateId(Object)>
		//    3    5:areturn         
		}

		public String generateId(Object obj)
		{
			return UUID.randomUUID().toString();
		//    0    0:invokestatic    #40  <Method UUID UUID.randomUUID()>
		//    1    3:invokevirtual   #44  <Method String UUID.toString()>
		//    2    6:areturn         
		}

		public ObjectIdGenerator.IdKey key(Object obj)
		{
			if(obj == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			else
				return new ObjectIdGenerator.IdKey(((Object)this).getClass(), ((Class) (null)), obj);
		//    4    6:new             #48  <Class ObjectIdGenerator$IdKey>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokevirtual   #52  <Method Class Object.getClass()>
		//    8   14:aconst_null     
		//    9   15:aload_1         
		//   10   16:invokespecial   #55  <Method void ObjectIdGenerator$IdKey(Class, Class, Object)>
		//   11   19:areturn         
		}

		public ObjectIdGenerator newForSerialization(Object obj)
		{
			return ((ObjectIdGenerator) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		private static final long serialVersionUID = 1L;

		public StringIdGenerator()
		{
			this(java/lang/Object);
		//    0    0:aload_0         
		//    1    1:ldc1            #16  <Class Object>
		//    2    3:invokespecial   #19  <Method void ObjectIdGenerators$StringIdGenerator(Class)>
		//    3    6:return          
		}

		private StringIdGenerator(Class class1)
		{
			super(java/lang/Object);
		//    0    0:aload_0         
		//    1    1:ldc1            #16  <Class Object>
		//    2    3:invokespecial   #21  <Method void ObjectIdGenerators$Base(Class)>
		//    3    6:return          
		}
	}

	public static final class UUIDGenerator extends Base
	{

		public boolean canUseFor(ObjectIdGenerator objectidgenerator)
		{
			return ((Object) (objectidgenerator)).getClass() == ((Object)this).getClass();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #29  <Method Class Object.getClass()>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #29  <Method Class Object.getClass()>
		//    4    8:if_acmpne       13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public ObjectIdGenerator forScope(Class class1)
		{
			return ((ObjectIdGenerator) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public volatile Object generateId(Object obj)
		{
			return ((Object) (generateId(obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #38  <Method UUID generateId(Object)>
		//    3    5:areturn         
		}

		public UUID generateId(Object obj)
		{
			return UUID.randomUUID();
		//    0    0:invokestatic    #44  <Method UUID UUID.randomUUID()>
		//    1    3:areturn         
		}

		public ObjectIdGenerator.IdKey key(Object obj)
		{
			if(obj == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			else
				return new ObjectIdGenerator.IdKey(((Object)this).getClass(), ((Class) (null)), obj);
		//    4    6:new             #48  <Class ObjectIdGenerator$IdKey>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:invokevirtual   #29  <Method Class Object.getClass()>
		//    8   14:aconst_null     
		//    9   15:aload_1         
		//   10   16:invokespecial   #51  <Method void ObjectIdGenerator$IdKey(Class, Class, Object)>
		//   11   19:areturn         
		}

		public ObjectIdGenerator newForSerialization(Object obj)
		{
			return ((ObjectIdGenerator) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		private static final long serialVersionUID = 1L;

		public UUIDGenerator()
		{
			this(java/lang/Object);
		//    0    0:aload_0         
		//    1    1:ldc1            #16  <Class Object>
		//    2    3:invokespecial   #19  <Method void ObjectIdGenerators$UUIDGenerator(Class)>
		//    3    6:return          
		}

		private UUIDGenerator(Class class1)
		{
			super(java/lang/Object);
		//    0    0:aload_0         
		//    1    1:ldc1            #16  <Class Object>
		//    2    3:invokespecial   #21  <Method void ObjectIdGenerators$Base(Class)>
		//    3    6:return          
		}
	}


	public ObjectIdGenerators()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}
}
