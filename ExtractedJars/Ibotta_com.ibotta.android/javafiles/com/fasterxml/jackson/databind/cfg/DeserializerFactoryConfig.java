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
		if(abstracttyperesolver != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          41
		{
			abstracttyperesolver = ((AbstractTypeResolver) ((AbstractTypeResolver[])ArrayBuilders.insertInListNoDup(((Object []) (_abstractTypeResolvers)), ((Object) (abstracttyperesolver)))));
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//    4    8:aload_1         
	//    5    9:invokestatic    #97  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//    6   12:checkcast       #98  <Class AbstractTypeResolver[]>
	//    7   15:astore_1        
			return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, _modifiers, ((AbstractTypeResolver []) (abstracttyperesolver)), _valueInstantiators);
	//    8   16:new             #2   <Class DeserializerFactoryConfig>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   12   24:aload_0         
	//   13   25:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//   14   28:aload_0         
	//   15   29:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   19   37:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   20   40:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot pass null resolver");
	//   21   41:new             #100 <Class IllegalArgumentException>
	//   22   44:dup             
	//   23   45:ldc1            #102 <String "Cannot pass null resolver">
	//   24   47:invokespecial   #105 <Method void IllegalArgumentException(String)>
	//   25   50:athrow          
		}
	}

	public DeserializerFactoryConfig withAdditionalDeserializers(Deserializers deserializers1)
	{
		if(deserializers1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          39
			return new DeserializerFactoryConfig((Deserializers[])ArrayBuilders.insertInListNoDup(((Object []) (_additionalDeserializers)), ((Object) (deserializers1))), _additionalKeyDeserializers, _modifiers, _abstractTypeResolvers, _valueInstantiators);
	//    2    4:new             #2   <Class DeserializerFactoryConfig>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//    6   12:aload_1         
	//    7   13:invokestatic    #97  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//    8   16:checkcast       #108 <Class Deserializers[]>
	//    9   19:aload_0         
	//   10   20:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//   11   23:aload_0         
	//   12   24:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//   13   27:aload_0         
	//   14   28:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//   15   31:aload_0         
	//   16   32:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   17   35:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   18   38:areturn         
		else
			throw new IllegalArgumentException("Cannot pass null Deserializers");
	//   19   39:new             #100 <Class IllegalArgumentException>
	//   20   42:dup             
	//   21   43:ldc1            #110 <String "Cannot pass null Deserializers">
	//   22   45:invokespecial   #105 <Method void IllegalArgumentException(String)>
	//   23   48:athrow          
	}

	public DeserializerFactoryConfig withAdditionalKeyDeserializers(KeyDeserializers keydeserializers)
	{
		if(keydeserializers != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          41
		{
			keydeserializers = ((KeyDeserializers) ((KeyDeserializers[])ArrayBuilders.insertInListNoDup(((Object []) (_additionalKeyDeserializers)), ((Object) (keydeserializers)))));
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//    4    8:aload_1         
	//    5    9:invokestatic    #97  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//    6   12:checkcast       #113 <Class KeyDeserializers[]>
	//    7   15:astore_1        
			return new DeserializerFactoryConfig(_additionalDeserializers, ((KeyDeserializers []) (keydeserializers)), _modifiers, _abstractTypeResolvers, _valueInstantiators);
	//    8   16:new             #2   <Class DeserializerFactoryConfig>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//   15   29:aload_0         
	//   16   30:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//   17   33:aload_0         
	//   18   34:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   19   37:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   20   40:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
	//   21   41:new             #100 <Class IllegalArgumentException>
	//   22   44:dup             
	//   23   45:ldc1            #115 <String "Cannot pass null KeyDeserializers">
	//   24   47:invokespecial   #105 <Method void IllegalArgumentException(String)>
	//   25   50:athrow          
		}
	}

	public DeserializerFactoryConfig withDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
	{
		if(beandeserializermodifier != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          41
		{
			beandeserializermodifier = ((BeanDeserializerModifier) ((BeanDeserializerModifier[])ArrayBuilders.insertInListNoDup(((Object []) (_modifiers)), ((Object) (beandeserializermodifier)))));
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//    4    8:aload_1         
	//    5    9:invokestatic    #97  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//    6   12:checkcast       #118 <Class BeanDeserializerModifier[]>
	//    7   15:astore_1        
			return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, ((BeanDeserializerModifier []) (beandeserializermodifier)), _abstractTypeResolvers, _valueInstantiators);
	//    8   16:new             #2   <Class DeserializerFactoryConfig>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   12   24:aload_0         
	//   13   25:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//   17   33:aload_0         
	//   18   34:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//   19   37:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   20   40:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot pass null modifier");
	//   21   41:new             #100 <Class IllegalArgumentException>
	//   22   44:dup             
	//   23   45:ldc1            #120 <String "Cannot pass null modifier">
	//   24   47:invokespecial   #105 <Method void IllegalArgumentException(String)>
	//   25   50:athrow          
		}
	}

	public DeserializerFactoryConfig withValueInstantiators(ValueInstantiators valueinstantiators)
	{
		if(valueinstantiators != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          41
		{
			valueinstantiators = ((ValueInstantiators) ((ValueInstantiators[])ArrayBuilders.insertInListNoDup(((Object []) (_valueInstantiators)), ((Object) (valueinstantiators)))));
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field ValueInstantiators[] _valueInstantiators>
	//    4    8:aload_1         
	//    5    9:invokestatic    #97  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//    6   12:checkcast       #123 <Class ValueInstantiators[]>
	//    7   15:astore_1        
			return new DeserializerFactoryConfig(_additionalDeserializers, _additionalKeyDeserializers, _modifiers, _abstractTypeResolvers, ((ValueInstantiators []) (valueinstantiators)));
	//    8   16:new             #2   <Class DeserializerFactoryConfig>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field Deserializers[] _additionalDeserializers>
	//   12   24:aload_0         
	//   13   25:getfield        #61  <Field KeyDeserializers[] _additionalKeyDeserializers>
	//   14   28:aload_0         
	//   15   29:getfield        #63  <Field BeanDeserializerModifier[] _modifiers>
	//   16   32:aload_0         
	//   17   33:getfield        #65  <Field AbstractTypeResolver[] _abstractTypeResolvers>
	//   18   36:aload_1         
	//   19   37:invokespecial   #56  <Method void DeserializerFactoryConfig(Deserializers[], KeyDeserializers[], BeanDeserializerModifier[], AbstractTypeResolver[], ValueInstantiators[])>
	//   20   40:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot pass null resolver");
	//   21   41:new             #100 <Class IllegalArgumentException>
	//   22   44:dup             
	//   23   45:ldc1            #102 <String "Cannot pass null resolver">
	//   24   47:invokespecial   #105 <Method void IllegalArgumentException(String)>
	//   25   50:athrow          
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
