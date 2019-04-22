// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import java.io.Serializable;

public final class SerializerFactoryConfig
	implements Serializable
{

	public SerializerFactoryConfig()
	{
		this(((Serializers []) (null)), ((Serializers []) (null)), ((BeanSerializerModifier []) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #32  <Method void SerializerFactoryConfig(Serializers[], Serializers[], BeanSerializerModifier[])>
	//    5    7:return          
	}

	protected SerializerFactoryConfig(Serializers aserializers[], Serializers aserializers1[], BeanSerializerModifier abeanserializermodifier[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		Serializers aserializers2[] = aserializers;
	//    2    4:aload_1         
	//    3    5:astore          4
		if(aserializers == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       16
			aserializers2 = NO_SERIALIZERS;
	//    6   11:getstatic       #23  <Field Serializers[] NO_SERIALIZERS>
	//    7   14:astore          4
		_additionalSerializers = aserializers2;
	//    8   16:aload_0         
	//    9   17:aload           4
	//   10   19:putfield        #36  <Field Serializers[] _additionalSerializers>
		aserializers = aserializers1;
	//   11   22:aload_2         
	//   12   23:astore_1        
		if(aserializers1 == null)
	//*  13   24:aload_2         
	//*  14   25:ifnonnull       32
			aserializers = NO_SERIALIZERS;
	//   15   28:getstatic       #23  <Field Serializers[] NO_SERIALIZERS>
	//   16   31:astore_1        
		_additionalKeySerializers = aserializers;
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:putfield        #38  <Field Serializers[] _additionalKeySerializers>
		aserializers = ((Serializers []) (abeanserializermodifier));
	//   20   37:aload_3         
	//   21   38:astore_1        
		if(abeanserializermodifier == null)
	//*  22   39:aload_3         
	//*  23   40:ifnonnull       47
			aserializers = ((Serializers []) (NO_MODIFIERS));
	//   24   43:getstatic       #27  <Field BeanSerializerModifier[] NO_MODIFIERS>
	//   25   46:astore_1        
		_modifiers = ((BeanSerializerModifier []) (aserializers));
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:putfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//   29   52:return          
	}

	public boolean hasKeySerializers()
	{
		return _additionalKeySerializers.length > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasSerializerModifiers()
	{
		return _modifiers.length > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public Iterable keySerializers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_additionalKeySerializers)))));
	//    0    0:new             #47  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//    4    8:invokespecial   #50  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public Iterable serializerModifiers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_modifiers)))));
	//    0    0:new             #47  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//    4    8:invokespecial   #50  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public Iterable serializers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_additionalSerializers)))));
	//    0    0:new             #47  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Serializers[] _additionalSerializers>
	//    4    8:invokespecial   #50  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public SerializerFactoryConfig withAdditionalKeySerializers(Serializers serializers1)
	{
		if(serializers1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			serializers1 = ((Serializers) ((Serializers[])ArrayBuilders.insertInListNoDup(((Object []) (_additionalKeySerializers)), ((Object) (serializers1)))));
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//    4    8:aload_1         
	//    5    9:invokestatic    #63  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//    6   12:checkcast       #64  <Class Serializers[]>
	//    7   15:astore_1        
			return new SerializerFactoryConfig(_additionalSerializers, ((Serializers []) (serializers1)), _modifiers);
	//    8   16:new             #2   <Class SerializerFactoryConfig>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field Serializers[] _additionalSerializers>
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//   15   29:invokespecial   #32  <Method void SerializerFactoryConfig(Serializers[], Serializers[], BeanSerializerModifier[])>
	//   16   32:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot pass null Serializers");
	//   17   33:new             #66  <Class IllegalArgumentException>
	//   18   36:dup             
	//   19   37:ldc1            #68  <String "Cannot pass null Serializers">
	//   20   39:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   21   42:athrow          
		}
	}

	public SerializerFactoryConfig withAdditionalSerializers(Serializers serializers1)
	{
		if(serializers1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
			return new SerializerFactoryConfig((Serializers[])ArrayBuilders.insertInListNoDup(((Object []) (_additionalSerializers)), ((Object) (serializers1))), _additionalKeySerializers, _modifiers);
	//    2    4:new             #2   <Class SerializerFactoryConfig>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field Serializers[] _additionalSerializers>
	//    6   12:aload_1         
	//    7   13:invokestatic    #63  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//    8   16:checkcast       #64  <Class Serializers[]>
	//    9   19:aload_0         
	//   10   20:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//   11   23:aload_0         
	//   12   24:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//   13   27:invokespecial   #32  <Method void SerializerFactoryConfig(Serializers[], Serializers[], BeanSerializerModifier[])>
	//   14   30:areturn         
		else
			throw new IllegalArgumentException("Cannot pass null Serializers");
	//   15   31:new             #66  <Class IllegalArgumentException>
	//   16   34:dup             
	//   17   35:ldc1            #68  <String "Cannot pass null Serializers">
	//   18   37:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   19   40:athrow          
	}

	public SerializerFactoryConfig withSerializerModifier(BeanSerializerModifier beanserializermodifier)
	{
		if(beanserializermodifier != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			beanserializermodifier = ((BeanSerializerModifier) ((BeanSerializerModifier[])ArrayBuilders.insertInListNoDup(((Object []) (_modifiers)), ((Object) (beanserializermodifier)))));
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//    4    8:aload_1         
	//    5    9:invokestatic    #63  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//    6   12:checkcast       #75  <Class BeanSerializerModifier[]>
	//    7   15:astore_1        
			return new SerializerFactoryConfig(_additionalSerializers, _additionalKeySerializers, ((BeanSerializerModifier []) (beanserializermodifier)));
	//    8   16:new             #2   <Class SerializerFactoryConfig>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field Serializers[] _additionalSerializers>
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//   14   28:aload_1         
	//   15   29:invokespecial   #32  <Method void SerializerFactoryConfig(Serializers[], Serializers[], BeanSerializerModifier[])>
	//   16   32:areturn         
		} else
		{
			throw new IllegalArgumentException("Cannot pass null modifier");
	//   17   33:new             #66  <Class IllegalArgumentException>
	//   18   36:dup             
	//   19   37:ldc1            #77  <String "Cannot pass null modifier">
	//   20   39:invokespecial   #71  <Method void IllegalArgumentException(String)>
	//   21   42:athrow          
		}
	}

	protected static final BeanSerializerModifier NO_MODIFIERS[] = new BeanSerializerModifier[0];
	protected static final Serializers NO_SERIALIZERS[] = new Serializers[0];
	private static final long serialVersionUID = 1L;
	protected final Serializers _additionalKeySerializers[];
	protected final Serializers _additionalSerializers[];
	protected final BeanSerializerModifier _modifiers[];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Serializers[]
	//    2    4:putstatic       #23  <Field Serializers[] NO_SERIALIZERS>
	//    3    7:iconst_0        
	//    4    8:anewarray       BeanSerializerModifier[]
	//    5   11:putstatic       #27  <Field BeanSerializerModifier[] NO_MODIFIERS>
	//*   6   14:return          
	}
}
