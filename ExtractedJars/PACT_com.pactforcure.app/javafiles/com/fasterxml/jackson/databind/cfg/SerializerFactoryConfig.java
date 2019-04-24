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

	public boolean hasSerializers()
	{
		return _additionalSerializers.length > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Serializers[] _additionalSerializers>
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
	//    0    0:new             #48  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//    4    8:invokespecial   #51  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public Iterable serializerModifiers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_modifiers)))));
	//    0    0:new             #48  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//    4    8:invokespecial   #51  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public Iterable serializers()
	{
		return ((Iterable) (new ArrayIterator(((Object []) (_additionalSerializers)))));
	//    0    0:new             #48  <Class ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Serializers[] _additionalSerializers>
	//    4    8:invokespecial   #51  <Method void ArrayIterator(Object[])>
	//    5   11:areturn         
	}

	public SerializerFactoryConfig withAdditionalKeySerializers(Serializers serializers1)
	{
		if(serializers1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Can not pass null Serializers");
	//    2    4:new             #60  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #62  <String "Can not pass null Serializers">
	//    5   10:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			serializers1 = ((Serializers) ((Serializers[])ArrayBuilders.insertInListNoDup(((Object []) (_additionalKeySerializers)), ((Object) (serializers1)))));
	//    7   14:aload_0         
	//    8   15:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//    9   18:aload_1         
	//   10   19:invokestatic    #71  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   11   22:checkcast       #72  <Class Serializers[]>
	//   12   25:astore_1        
			return new SerializerFactoryConfig(_additionalSerializers, ((Serializers []) (serializers1)), _modifiers);
	//   13   26:new             #2   <Class SerializerFactoryConfig>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #36  <Field Serializers[] _additionalSerializers>
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//   20   39:invokespecial   #32  <Method void SerializerFactoryConfig(Serializers[], Serializers[], BeanSerializerModifier[])>
	//   21   42:areturn         
		}
	}

	public SerializerFactoryConfig withAdditionalSerializers(Serializers serializers1)
	{
		if(serializers1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Can not pass null Serializers");
	//    2    4:new             #60  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #62  <String "Can not pass null Serializers">
	//    5   10:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return new SerializerFactoryConfig((Serializers[])ArrayBuilders.insertInListNoDup(((Object []) (_additionalSerializers)), ((Object) (serializers1))), _additionalKeySerializers, _modifiers);
	//    7   14:new             #2   <Class SerializerFactoryConfig>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:getfield        #36  <Field Serializers[] _additionalSerializers>
	//   11   22:aload_1         
	//   12   23:invokestatic    #71  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   13   26:checkcast       #72  <Class Serializers[]>
	//   14   29:aload_0         
	//   15   30:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//   16   33:aload_0         
	//   17   34:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//   18   37:invokespecial   #32  <Method void SerializerFactoryConfig(Serializers[], Serializers[], BeanSerializerModifier[])>
	//   19   40:areturn         
	}

	public SerializerFactoryConfig withSerializerModifier(BeanSerializerModifier beanserializermodifier)
	{
		if(beanserializermodifier == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("Can not pass null modifier");
	//    2    4:new             #60  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #77  <String "Can not pass null modifier">
	//    5   10:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			beanserializermodifier = ((BeanSerializerModifier) ((BeanSerializerModifier[])ArrayBuilders.insertInListNoDup(((Object []) (_modifiers)), ((Object) (beanserializermodifier)))));
	//    7   14:aload_0         
	//    8   15:getfield        #40  <Field BeanSerializerModifier[] _modifiers>
	//    9   18:aload_1         
	//   10   19:invokestatic    #71  <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   11   22:checkcast       #78  <Class BeanSerializerModifier[]>
	//   12   25:astore_1        
			return new SerializerFactoryConfig(_additionalSerializers, _additionalKeySerializers, ((BeanSerializerModifier []) (beanserializermodifier)));
	//   13   26:new             #2   <Class SerializerFactoryConfig>
	//   14   29:dup             
	//   15   30:aload_0         
	//   16   31:getfield        #36  <Field Serializers[] _additionalSerializers>
	//   17   34:aload_0         
	//   18   35:getfield        #38  <Field Serializers[] _additionalKeySerializers>
	//   19   38:aload_1         
	//   20   39:invokespecial   #32  <Method void SerializerFactoryConfig(Serializers[], Serializers[], BeanSerializerModifier[])>
	//   21   42:areturn         
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
