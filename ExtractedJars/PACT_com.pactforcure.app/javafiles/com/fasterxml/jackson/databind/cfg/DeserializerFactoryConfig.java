// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import java.io.Serializable;

public class DeserializerFactoryConfig
	implements Serializable
{

	public DeserializerFactoryConfig()
	{
		this(((Deserializers []) (null)), ((KeyDeserializers []) (null)), ((BeanDeserializerModifier []) (null)), ((AbstractTypeResolver []) (null)), ((ValueInstantiators []) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//    7    9:return          
	}

	protected DeserializerFactoryConfig(Deserializers adeserializers[], KeyDeserializers akeydeserializers[], BeanDeserializerModifier abeandeserializermodifier[], AbstractTypeResolver aabstracttyperesolver[], ValueInstantiators avalueinstantiators[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		Deserializers adeserializers1[] = adeserializers;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(adeserializers == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       16
			adeserializers1 = NO_DESERIALIZERS;
	//    6   11:getstatic       #31  <Field Deserializers[] NO_DESERIALIZERS>
	//    7   14:astore          6
		_additionalDeserializers = adeserializers1;
	//    8   16:aload_0         
	//    9   17:aload           6
	//   10   19:putfield        #59  <Field Deserializers[] _additionalDeserializers>
		adeserializers = ((Deserializers []) (akeydeserializers));
	//   11   22:aload_2         
	//   12   23:astore_1        
		if(akeydeserializers == null)
	//*  13   24:aload_2         
	//*  14   25:ifnonnull       32
			adeserializers = ((Deserializers []) (DEFAULT_KEY_DESERIALIZERS));
	//   15   28:getstatic       #52  <Field KeyDeserializers[] DEFAULT_KEY_DESERIALIZERS>
	//   16   31:astore_1        
		_additionalKeyDeserializers = ((KeyDeserializers []) (adeserializers));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:putfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
		adeserializers = ((Deserializers []) (abeandeserializermodifier));
	//   20   37:aload_3         
	//   21   38:astore_1        
		if(abeandeserializermodifier == null)
	//*  22   39:aload_3         
	//*  23   40:ifnonnull       47
			adeserializers = ((Deserializers []) (NO_MODIFIERS));
	//   24   43:getstatic       #35  <Field BeanDeserializerModifier[] NO_MODIFIERS>
	//   25   46:astore_1        
		_modifiers = ((BeanDeserializerModifier []) (adeserializers));
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:putfield        #63  <Field BeanDeserializerModifier[] _modifiers>
		adeserializers = ((Deserializers []) (aabstracttyperesolver));
	//   29   52:aload           4
	//   30   54:astore_1        
		if(aabstracttyperesolver == null)
	//*  31   55:aload           4
	//*  32   57:ifnonnull       64
			adeserializers = ((Deserializers []) (NO_ABSTRACT_TYPE_RESOLVERS));
	//   33   60:getstatic       #39  <Field AbstractTypeResolver[] NO_ABSTRACT_TYPE_RESOLVERS>
	//   34   63:astore_1        
		_abstractTypeResolvers = ((AbstractTypeResolver []) (adeserializers));
	//   35   64:aload_0         
	//   36   65:aload_1         
	//   37   66:putfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
		adeserializers = ((Deserializers []) (avalueinstantiators));
	//   38   69:aload           5
	//   39   71:astore_1        
		if(avalueinstantiators == null)
	//*  40   72:aload           5
	//*  41   74:ifnonnull       81
			adeserializers = ((Deserializers []) (NO_VALUE_INSTANTIATORS));
	//   42   77:getstatic       #43  <Field ValueInstantiators[] NO_VALUE_INSTANTIATORS>
	//   43   80:astore_1        
		_valueInstantiators = ((ValueInstantiators []) (adeserializers));
	//   44   81:aload_0         
	//   45   82:aload_1         
	//   46   83:putfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   47   86:return          
	}

	public Iterable abstractTypeResolvers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_abstractTypeResolvers)))));
	//    0    0:new             #71  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//    4    8:invokespecial   #74  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public Iterable deserializerModifiers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_modifiers)))));
	//    0    0:new             #71  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//    4    8:invokespecial   #74  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public Iterable deserializers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_additionalDeserializers)))));
	//    0    0:new             #71  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//    4    8:invokespecial   #74  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public boolean hasAbstractTypeResolvers()
	{
		return _abstractTypeResolvers.length > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasDeserializerModifiers()
	{
		return _modifiers.length > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasDeserializers()
	{
		return _additionalDeserializers.length > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasKeyDeserializers()
	{
		return _additionalKeyDeserializers.length > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasValueInstantiators()
	{
		return _valueInstantiators.length > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public Iterable keyDeserializers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_additionalKeyDeserializers)))));
	//    0    0:new             #71  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//    4    8:invokespecial   #74  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public Iterable valueInstantiators()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_valueInstantiators)))));
	//    0    0:new             #71  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//    4    8:invokespecial   #74  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public DeserializerFactoryConfig withAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
	{
		if(abstracttyperesolver == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Can not pass null resolver");
	//    2    4:new             #94  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #96  <String "Can not pass null resolver">
	//    5   10:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			abstracttyperesolver = ((AbstractTypeResolver) ((AbstractTypeResolver[])ArrayBuilders.insertInListNoDup(((Object []) (_abstractTypeResolvers)), ((Object) (abstracttyperesolver)))));
	//    7   14:aload_0         
	//    8   15:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//    9   18:aload_1         
	//   10   19:invokestatic    #105 <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   11   22:checkcast       #106 <Class AbstractTypeResolver[]>
	//   12   25:astore_1        
			return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, _modifiers, ((AbstractTypeResolver []) (abstracttyperesolver)), _valueInstantiators);
	//   13   26:new             #2   <Class DeserializerFactoryConfig>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   17   34:aload_0         
	//   18   35:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//   19   38:aload_0         
	//   20   39:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//   21   42:aload_1         
	//   22   43:aload_0         
	//   23   44:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   24   47:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   25   50:areturn         
		}
	}

	public DeserializerFactoryConfig withAdditionalDeserializers(Deserializers deserializers1)
	{
		if(deserializers1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Can not pass null Deserializers");
	//    2    4:new             #94  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #110 <String "Can not pass null Deserializers">
	//    5   10:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new DeserializerFactoryConfig((Deserializers[])ArrayBuilders.insertInListNoDup(((Object []) (_additionalDeserializers)), ((Object) (deserializers1))), _additionalKeyDeserializers, _modifiers, _abstractTypeResolvers, _valueInstantiators);
	//    7   14:new             #2   <Class DeserializerFactoryConfig>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   11   22:aload_1         
	//   12   23:invokestatic    #105 <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   13   26:checkcast       #111 <Class Deserializers[]>
	//   14   29:aload_0         
	//   15   30:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//   16   33:aload_0         
	//   17   34:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//   18   37:aload_0         
	//   19   38:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//   20   41:aload_0         
	//   21   42:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   22   45:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   23   48:areturn         
	}

	public DeserializerFactoryConfig withAdditionalKeyDeserializers(KeyDeserializers keydeserializers)
	{
		if(keydeserializers == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Can not pass null KeyDeserializers");
	//    2    4:new             #94  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #115 <String "Can not pass null KeyDeserializers">
	//    5   10:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			keydeserializers = ((KeyDeserializers) ((KeyDeserializers[])ArrayBuilders.insertInListNoDup(((Object []) (_additionalKeyDeserializers)), ((Object) (keydeserializers)))));
	//    7   14:aload_0         
	//    8   15:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//    9   18:aload_1         
	//   10   19:invokestatic    #105 <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   11   22:checkcast       #116 <Class KeyDeserializers[]>
	//   12   25:astore_1        
			return new DeserializerFactoryConfig(_additionalDeserializers, ((KeyDeserializers []) (keydeserializers)), _modifiers, _abstractTypeResolvers, _valueInstantiators);
	//   13   26:new             #2   <Class DeserializerFactoryConfig>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//   20   39:aload_0         
	//   21   40:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//   22   43:aload_0         
	//   23   44:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   24   47:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   25   50:areturn         
		}
	}

	public DeserializerFactoryConfig withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
	{
		if(beandeserializermodifier == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Can not pass null modifier");
	//    2    4:new             #94  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #120 <String "Can not pass null modifier">
	//    5   10:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			beandeserializermodifier = ((BeanDeserializerModifier) ((BeanDeserializerModifier[])ArrayBuilders.insertInListNoDup(((Object []) (_modifiers)), ((Object) (beandeserializermodifier)))));
	//    7   14:aload_0         
	//    8   15:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//    9   18:aload_1         
	//   10   19:invokestatic    #105 <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   11   22:checkcast       #121 <Class BeanDeserializerModifier[]>
	//   12   25:astore_1        
			return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, ((BeanDeserializerModifier []) (beandeserializermodifier)), _abstractTypeResolvers, _valueInstantiators);
	//   13   26:new             #2   <Class DeserializerFactoryConfig>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   17   34:aload_0         
	//   18   35:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//   22   43:aload_0         
	//   23   44:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   24   47:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   25   50:areturn         
		}
	}

	public DeserializerFactoryConfig withValueInstantiators(ValueInstantiators valueinstantiators)
	{
		if(valueinstantiators == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Can not pass null resolver");
	//    2    4:new             #94  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #96  <String "Can not pass null resolver">
	//    5   10:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			valueinstantiators = ((ValueInstantiators) ((ValueInstantiators[])ArrayBuilders.insertInListNoDup(((Object []) (_valueInstantiators)), ((Object) (valueinstantiators)))));
	//    7   14:aload_0         
	//    8   15:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//    9   18:aload_1         
	//   10   19:invokestatic    #105 <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   11   22:checkcast       #124 <Class ValueInstantiators[]>
	//   12   25:astore_1        
			return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, _modifiers, _abstractTypeResolvers, ((ValueInstantiators []) (valueinstantiators)));
	//   13   26:new             #2   <Class DeserializerFactoryConfig>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   17   34:aload_0         
	//   18   35:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//   19   38:aload_0         
	//   20   39:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//   21   42:aload_0         
	//   22   43:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//   23   46:aload_1         
	//   24   47:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   25   50:areturn         
		}
	}

	protected static final KeyDeserializers DEFAULT_KEY_DESERIALIZERS[] = {
		new StdKeyDeserializers()
	};
	protected static final AbstractTypeResolver NO_ABSTRACT_TYPE_RESOLVERS[] = new AbstractTypeResolver[0];
	protected static final Deserializers NO_DESERIALIZERS[] = new Deserializers[0];
	protected static final BeanDeserializerModifier NO_MODIFIERS[] = new BeanDeserializerModifier[0];
	protected static final ValueInstantiators NO_VALUE_INSTANTIATORS[] = new ValueInstantiators[0];
	private static final long serialVersionUID = 1L;
	protected final AbstractTypeResolver _abstractTypeResolvers[];
	protected final Deserializers _additionalDeserializers[];
	protected final KeyDeserializers _additionalKeyDeserializers[];
	protected final BeanDeserializerModifier _modifiers[];
	protected final ValueInstantiators _valueInstantiators[];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Deserializers[]
	//    2    4:putstatic       #31  <Field Deserializers[] NO_DESERIALIZERS>
	//    3    7:iconst_0        
	//    4    8:anewarray       BeanDeserializerModifier[]
	//    5   11:putstatic       #35  <Field BeanDeserializerModifier[] NO_MODIFIERS>
	//    6   14:iconst_0        
	//    7   15:anewarray       AbstractTypeResolver[]
	//    8   18:putstatic       #39  <Field AbstractTypeResolver[] NO_ABSTRACT_TYPE_RESOLVERS>
	//    9   21:iconst_0        
	//   10   22:anewarray       ValueInstantiators[]
	//   11   25:putstatic       #43  <Field ValueInstantiators[] NO_VALUE_INSTANTIATORS>
	//   12   28:iconst_1        
	//   13   29:anewarray       KeyDeserializers[]
	//   14   32:dup             
	//   15   33:iconst_0        
	//   16   34:new             #47  <Class StdKeyDeserializers>
	//   17   37:dup             
	//   18   38:invokespecial   #50  <Method void StdKeyDeserializers()>
	//   19   41:aastore         
	//   20   42:putstatic       #52  <Field KeyDeserializers[] DEFAULT_KEY_DESERIALIZERS>
	//*  21   45:return          
	}
}
