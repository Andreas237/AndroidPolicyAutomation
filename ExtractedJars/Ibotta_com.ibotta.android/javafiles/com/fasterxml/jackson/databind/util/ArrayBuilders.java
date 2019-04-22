// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			PrimitiveArrayBuilder, ClassUtil

public final class ArrayBuilders
{
	public static final class BooleanBuilder extends PrimitiveArrayBuilder
	{

		public volatile Object _constructArray(int i)
		{
			return ((Object) (_constructArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #18  <Method boolean[] _constructArray(int)>
		//    3    5:areturn         
		}

		public final boolean[] _constructArray(int i)
		{
			return new boolean[i];
		//    0    0:iload_1         
		//    1    1:newarray        boolean[]
		//    2    3:areturn         
		}

		public BooleanBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PrimitiveArrayBuilder()>
		//    2    4:return          
		}
	}

	public static final class ByteBuilder extends PrimitiveArrayBuilder
	{

		public volatile Object _constructArray(int i)
		{
			return ((Object) (_constructArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #18  <Method byte[] _constructArray(int)>
		//    3    5:areturn         
		}

		public final byte[] _constructArray(int i)
		{
			return new byte[i];
		//    0    0:iload_1         
		//    1    1:newarray        byte[]
		//    2    3:areturn         
		}

		public ByteBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PrimitiveArrayBuilder()>
		//    2    4:return          
		}
	}

	public static final class DoubleBuilder extends PrimitiveArrayBuilder
	{

		public volatile Object _constructArray(int i)
		{
			return ((Object) (_constructArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #18  <Method double[] _constructArray(int)>
		//    3    5:areturn         
		}

		public final double[] _constructArray(int i)
		{
			return new double[i];
		//    0    0:iload_1         
		//    1    1:newarray        double[]
		//    2    3:areturn         
		}

		public DoubleBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PrimitiveArrayBuilder()>
		//    2    4:return          
		}
	}

	public static final class FloatBuilder extends PrimitiveArrayBuilder
	{

		public volatile Object _constructArray(int i)
		{
			return ((Object) (_constructArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #18  <Method float[] _constructArray(int)>
		//    3    5:areturn         
		}

		public final float[] _constructArray(int i)
		{
			return new float[i];
		//    0    0:iload_1         
		//    1    1:newarray        float[]
		//    2    3:areturn         
		}

		public FloatBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PrimitiveArrayBuilder()>
		//    2    4:return          
		}
	}

	public static final class IntBuilder extends PrimitiveArrayBuilder
	{

		public volatile Object _constructArray(int i)
		{
			return ((Object) (_constructArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #18  <Method int[] _constructArray(int)>
		//    3    5:areturn         
		}

		public final int[] _constructArray(int i)
		{
			return new int[i];
		//    0    0:iload_1         
		//    1    1:newarray        int[]
		//    2    3:areturn         
		}

		public IntBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PrimitiveArrayBuilder()>
		//    2    4:return          
		}
	}

	public static final class LongBuilder extends PrimitiveArrayBuilder
	{

		public volatile Object _constructArray(int i)
		{
			return ((Object) (_constructArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #18  <Method long[] _constructArray(int)>
		//    3    5:areturn         
		}

		public final long[] _constructArray(int i)
		{
			return new long[i];
		//    0    0:iload_1         
		//    1    1:newarray        long[]
		//    2    3:areturn         
		}

		public LongBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PrimitiveArrayBuilder()>
		//    2    4:return          
		}
	}

	public static final class ShortBuilder extends PrimitiveArrayBuilder
	{

		public volatile Object _constructArray(int i)
		{
			return ((Object) (_constructArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #18  <Method short[] _constructArray(int)>
		//    3    5:areturn         
		}

		public final short[] _constructArray(int i)
		{
			return new short[i];
		//    0    0:iload_1         
		//    1    1:newarray        short[]
		//    2    3:areturn         
		}

		public ShortBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void PrimitiveArrayBuilder()>
		//    2    4:return          
		}
	}


	public ArrayBuilders()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		_booleanBuilder = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #47  <Field ArrayBuilders$BooleanBuilder _booleanBuilder>
		_byteBuilder = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #49  <Field ArrayBuilders$ByteBuilder _byteBuilder>
		_shortBuilder = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #51  <Field ArrayBuilders$ShortBuilder _shortBuilder>
		_intBuilder = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #53  <Field ArrayBuilders$IntBuilder _intBuilder>
		_longBuilder = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #55  <Field ArrayBuilders$LongBuilder _longBuilder>
		_floatBuilder = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #57  <Field ArrayBuilders$FloatBuilder _floatBuilder>
		_doubleBuilder = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #59  <Field ArrayBuilders$DoubleBuilder _doubleBuilder>
	//   23   39:return          
	}

	public static Object getArrayComparator(Object obj)
	{
		int i = Array.getLength(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method int Array.getLength(Object)>
	//    2    4:istore_1        
		return ((Object) (new Object(obj.getClass(), i, obj) {

			public boolean equals(Object obj1)
			{
				if(obj1 == this)
			//*   0    0:aload_1         
			//*   1    1:aload_0         
			//*   2    2:if_acmpne       7
					return true;
			//    3    5:iconst_1        
			//    4    6:ireturn         
				if(!ClassUtil.hasClass(obj1, defaultValueType))
			//*   5    7:aload_1         
			//*   6    8:aload_0         
			//*   7    9:getfield        #19  <Field Class val$defaultValueType>
			//*   8   12:invokestatic    #35  <Method boolean ClassUtil.hasClass(Object, Class)>
			//*   9   15:ifne            20
					return false;
			//   10   18:iconst_0        
			//   11   19:ireturn         
				if(Array.getLength(obj1) != length)
			//*  12   20:aload_1         
			//*  13   21:invokestatic    #41  <Method int Array.getLength(Object)>
			//*  14   24:aload_0         
			//*  15   25:getfield        #21  <Field int val$length>
			//*  16   28:icmpeq          33
					return false;
			//   17   31:iconst_0        
			//   18   32:ireturn         
				for(int j = 0; j < length; j++)
			//*  19   33:iconst_0        
			//*  20   34:istore_2        
			//*  21   35:iload_2         
			//*  22   36:aload_0         
			//*  23   37:getfield        #21  <Field int val$length>
			//*  24   40:icmpge          90
				{
					Object obj2 = Array.get(defaultValue, j);
			//   25   43:aload_0         
			//   26   44:getfield        #23  <Field Object val$defaultValue>
			//   27   47:iload_2         
			//   28   48:invokestatic    #45  <Method Object Array.get(Object, int)>
			//   29   51:astore_3        
					Object obj3 = Array.get(obj1, j);
			//   30   52:aload_1         
			//   31   53:iload_2         
			//   32   54:invokestatic    #45  <Method Object Array.get(Object, int)>
			//   33   57:astore          4
					if(obj2 != obj3 && obj2 != null && !obj2.equals(obj3))
			//*  34   59:aload_3         
			//*  35   60:aload           4
			//*  36   62:if_acmpne       68
			//*  37   65:goto            83
			//*  38   68:aload_3         
			//*  39   69:ifnull          83
			//*  40   72:aload_3         
			//*  41   73:aload           4
			//*  42   75:invokevirtual   #47  <Method boolean Object.equals(Object)>
			//*  43   78:ifne            83
						return false;
			//   44   81:iconst_0        
			//   45   82:ireturn         
				}

			//   46   83:iload_2         
			//   47   84:iconst_1        
			//   48   85:iadd            
			//   49   86:istore_2        
			//*  50   87:goto            35
				return true;
			//   51   90:iconst_1        
			//   52   91:ireturn         
			}

			final Object val$defaultValue;
			final Class val$defaultValueType;
			final int val$length;

			
			{
				defaultValueType = class1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Class val$defaultValueType>
				length = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int val$length>
				defaultValue = obj;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field Object val$defaultValue>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//    3    5:new             #6   <Class ArrayBuilders$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokevirtual   #72  <Method Class Object.getClass()>
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokespecial   #75  <Method void ArrayBuilders$1(Class, int, Object)>
	//   10   18:areturn         
	}

	public static Object[] insertInListNoDup(Object aobj[], Object obj)
	{
		int j = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          84
			if(aobj[i] == obj)
	//*   8   10:aload_0         
	//*   9   11:iload_2         
	//*  10   12:aaload          
	//*  11   13:aload_1         
	//*  12   14:if_acmpne       77
			{
				if(i == 0)
	//*  13   17:iload_2         
	//*  14   18:ifne            23
					return aobj;
	//   15   21:aload_0         
	//   16   22:areturn         
				Object aobj1[] = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j);
	//   17   23:aload_0         
	//   18   24:invokevirtual   #72  <Method Class Object.getClass()>
	//   19   27:invokevirtual   #82  <Method Class Class.getComponentType()>
	//   20   30:iload_3         
	//   21   31:invokestatic    #86  <Method Object Array.newInstance(Class, int)>
	//   22   34:checkcast       #88  <Class Object[]>
	//   23   37:astore          4
				System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 1, i);
	//   24   39:aload_0         
	//   25   40:iconst_0        
	//   26   41:aload           4
	//   27   43:iconst_1        
	//   28   44:iload_2         
	//   29   45:invokestatic    #94  <Method void System.arraycopy(Object, int, Object, int, int)>
				aobj1[0] = obj;
	//   30   48:aload           4
	//   31   50:iconst_0        
	//   32   51:aload_1         
	//   33   52:aastore         
				i++;
	//   34   53:iload_2         
	//   35   54:iconst_1        
	//   36   55:iadd            
	//   37   56:istore_2        
				j -= i;
	//   38   57:iload_3         
	//   39   58:iload_2         
	//   40   59:isub            
	//   41   60:istore_3        
				if(j > 0)
	//*  42   61:iload_3         
	//*  43   62:ifle            74
					System.arraycopy(((Object) (aobj)), i, ((Object) (aobj1)), i, j);
	//   44   65:aload_0         
	//   45   66:iload_2         
	//   46   67:aload           4
	//   47   69:iload_2         
	//   48   70:iload_3         
	//   49   71:invokestatic    #94  <Method void System.arraycopy(Object, int, Object, int, int)>
				return aobj1;
	//   50   74:aload           4
	//   51   76:areturn         
			}

	//   52   77:iload_2         
	//   53   78:iconst_1        
	//   54   79:iadd            
	//   55   80:istore_2        
	//*  56   81:goto            5
		Object aobj2[] = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j + 1);
	//   57   84:aload_0         
	//   58   85:invokevirtual   #72  <Method Class Object.getClass()>
	//   59   88:invokevirtual   #82  <Method Class Class.getComponentType()>
	//   60   91:iload_3         
	//   61   92:iconst_1        
	//   62   93:iadd            
	//   63   94:invokestatic    #86  <Method Object Array.newInstance(Class, int)>
	//   64   97:checkcast       #88  <Class Object[]>
	//   65  100:astore          4
		if(j > 0)
	//*  66  102:iload_3         
	//*  67  103:ifle            115
			System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 1, j);
	//   68  106:aload_0         
	//   69  107:iconst_0        
	//   70  108:aload           4
	//   71  110:iconst_1        
	//   72  111:iload_3         
	//   73  112:invokestatic    #94  <Method void System.arraycopy(Object, int, Object, int, int)>
		aobj2[0] = obj;
	//   74  115:aload           4
	//   75  117:iconst_0        
	//   76  118:aload_1         
	//   77  119:aastore         
		return aobj2;
	//   78  120:aload           4
	//   79  122:areturn         
	}

	public BooleanBuilder getBooleanBuilder()
	{
		if(_booleanBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field ArrayBuilders$BooleanBuilder _booleanBuilder>
	//*   2    4:ifnonnull       18
			_booleanBuilder = new BooleanBuilder();
	//    3    7:aload_0         
	//    4    8:new             #8   <Class ArrayBuilders$BooleanBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #99  <Method void ArrayBuilders$BooleanBuilder()>
	//    7   15:putfield        #47  <Field ArrayBuilders$BooleanBuilder _booleanBuilder>
		return _booleanBuilder;
	//    8   18:aload_0         
	//    9   19:getfield        #47  <Field ArrayBuilders$BooleanBuilder _booleanBuilder>
	//   10   22:areturn         
	}

	public ByteBuilder getByteBuilder()
	{
		if(_byteBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ArrayBuilders$ByteBuilder _byteBuilder>
	//*   2    4:ifnonnull       18
			_byteBuilder = new ByteBuilder();
	//    3    7:aload_0         
	//    4    8:new             #11  <Class ArrayBuilders$ByteBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #102 <Method void ArrayBuilders$ByteBuilder()>
	//    7   15:putfield        #49  <Field ArrayBuilders$ByteBuilder _byteBuilder>
		return _byteBuilder;
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field ArrayBuilders$ByteBuilder _byteBuilder>
	//   10   22:areturn         
	}

	public DoubleBuilder getDoubleBuilder()
	{
		if(_doubleBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field ArrayBuilders$DoubleBuilder _doubleBuilder>
	//*   2    4:ifnonnull       18
			_doubleBuilder = new DoubleBuilder();
	//    3    7:aload_0         
	//    4    8:new             #14  <Class ArrayBuilders$DoubleBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #105 <Method void ArrayBuilders$DoubleBuilder()>
	//    7   15:putfield        #59  <Field ArrayBuilders$DoubleBuilder _doubleBuilder>
		return _doubleBuilder;
	//    8   18:aload_0         
	//    9   19:getfield        #59  <Field ArrayBuilders$DoubleBuilder _doubleBuilder>
	//   10   22:areturn         
	}

	public FloatBuilder getFloatBuilder()
	{
		if(_floatBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field ArrayBuilders$FloatBuilder _floatBuilder>
	//*   2    4:ifnonnull       18
			_floatBuilder = new FloatBuilder();
	//    3    7:aload_0         
	//    4    8:new             #17  <Class ArrayBuilders$FloatBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #108 <Method void ArrayBuilders$FloatBuilder()>
	//    7   15:putfield        #57  <Field ArrayBuilders$FloatBuilder _floatBuilder>
		return _floatBuilder;
	//    8   18:aload_0         
	//    9   19:getfield        #57  <Field ArrayBuilders$FloatBuilder _floatBuilder>
	//   10   22:areturn         
	}

	public IntBuilder getIntBuilder()
	{
		if(_intBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ArrayBuilders$IntBuilder _intBuilder>
	//*   2    4:ifnonnull       18
			_intBuilder = new IntBuilder();
	//    3    7:aload_0         
	//    4    8:new             #20  <Class ArrayBuilders$IntBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #111 <Method void ArrayBuilders$IntBuilder()>
	//    7   15:putfield        #53  <Field ArrayBuilders$IntBuilder _intBuilder>
		return _intBuilder;
	//    8   18:aload_0         
	//    9   19:getfield        #53  <Field ArrayBuilders$IntBuilder _intBuilder>
	//   10   22:areturn         
	}

	public LongBuilder getLongBuilder()
	{
		if(_longBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field ArrayBuilders$LongBuilder _longBuilder>
	//*   2    4:ifnonnull       18
			_longBuilder = new LongBuilder();
	//    3    7:aload_0         
	//    4    8:new             #23  <Class ArrayBuilders$LongBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #114 <Method void ArrayBuilders$LongBuilder()>
	//    7   15:putfield        #55  <Field ArrayBuilders$LongBuilder _longBuilder>
		return _longBuilder;
	//    8   18:aload_0         
	//    9   19:getfield        #55  <Field ArrayBuilders$LongBuilder _longBuilder>
	//   10   22:areturn         
	}

	public ShortBuilder getShortBuilder()
	{
		if(_shortBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field ArrayBuilders$ShortBuilder _shortBuilder>
	//*   2    4:ifnonnull       18
			_shortBuilder = new ShortBuilder();
	//    3    7:aload_0         
	//    4    8:new             #26  <Class ArrayBuilders$ShortBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #117 <Method void ArrayBuilders$ShortBuilder()>
	//    7   15:putfield        #51  <Field ArrayBuilders$ShortBuilder _shortBuilder>
		return _shortBuilder;
	//    8   18:aload_0         
	//    9   19:getfield        #51  <Field ArrayBuilders$ShortBuilder _shortBuilder>
	//   10   22:areturn         
	}

	private BooleanBuilder _booleanBuilder;
	private ByteBuilder _byteBuilder;
	private DoubleBuilder _doubleBuilder;
	private FloatBuilder _floatBuilder;
	private IntBuilder _intBuilder;
	private LongBuilder _longBuilder;
	private ShortBuilder _shortBuilder;
}
