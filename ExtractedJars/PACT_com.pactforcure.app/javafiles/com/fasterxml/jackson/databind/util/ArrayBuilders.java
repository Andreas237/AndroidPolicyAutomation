// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			PrimitiveArrayBuilder

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

	public static List addToList(List list, Object obj)
	{
		Object obj1 = ((Object) (list));
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(list == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       14
			obj1 = ((Object) (new ArrayList()));
	//    4    6:new             #64  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #65  <Method void ArrayList()>
	//    7   13:astore_2        
		((List) (obj1)).add(obj);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokeinterface #71  <Method boolean List.add(Object)>
	//   11   21:pop             
		return ((List) (obj1));
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public static ArrayList arrayToList(Object aobj[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #64  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void ArrayList()>
	//    3    7:astore_3        
		if(aobj != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          37
		{
			int j = aobj.length;
	//    6   12:aload_0         
	//    7   13:arraylength     
	//    8   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          37
				arraylist.add(aobj[i]);
	//   14   22:aload_3         
	//   15   23:aload_0         
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   19   29:pop             

	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_1        
		}
	//*  24   34:goto            17
		return arraylist;
	//   25   37:aload_3         
	//   26   38:areturn         
	}

	public static HashSet arrayToSet(Object aobj[])
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #81  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void HashSet()>
	//    3    7:astore_3        
		if(aobj != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          37
		{
			int j = aobj.length;
	//    6   12:aload_0         
	//    7   13:arraylength     
	//    8   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          37
				hashset.add(aobj[i]);
	//   14   22:aload_3         
	//   15   23:aload_0         
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:invokevirtual   #83  <Method boolean HashSet.add(Object)>
	//   19   29:pop             

	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_1        
		}
	//*  24   34:goto            17
		return hashset;
	//   25   37:aload_3         
	//   26   38:areturn         
	}

	public static Object getArrayComparator(Object obj)
	{
		int i = Array.getLength(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #92  <Method int Array.getLength(Object)>
	//    2    4:istore_1        
		return ((Object) (new Object(obj.getClass(), i, obj) {

			public boolean equals(Object obj1)
			{
				if(obj1 != this)
			//*   0    0:aload_1         
			//*   1    1:aload_0         
			//*   2    2:if_acmpne       7
			//*   3    5:iconst_1        
			//*   4    6:ireturn         
				{
					if(obj1 == null || obj1.getClass() != defaultValueType)
			//*   5    7:aload_1         
			//*   6    8:ifnull          22
			//*   7   11:aload_1         
			//*   8   12:invokevirtual   #33  <Method Class Object.getClass()>
			//*   9   15:aload_0         
			//*  10   16:getfield        #19  <Field Class val$defaultValueType>
			//*  11   19:if_acmpeq       24
						return false;
			//   12   22:iconst_0        
			//   13   23:ireturn         
					if(Array.getLength(obj1) != length)
			//*  14   24:aload_1         
			//*  15   25:invokestatic    #39  <Method int Array.getLength(Object)>
			//*  16   28:aload_0         
			//*  17   29:getfield        #21  <Field int val$length>
			//*  18   32:icmpeq          37
						return false;
			//   19   35:iconst_0        
			//   20   36:ireturn         
					int j = 0;
			//   21   37:iconst_0        
			//   22   38:istore_2        
					while(j < length) 
			//*  23   39:iload_2         
			//*  24   40:aload_0         
			//*  25   41:getfield        #21  <Field int val$length>
			//*  26   44:icmpge          5
					{
						Object obj2 = Array.get(defaultValue, j);
			//   27   47:aload_0         
			//   28   48:getfield        #23  <Field Object val$defaultValue>
			//   29   51:iload_2         
			//   30   52:invokestatic    #43  <Method Object Array.get(Object, int)>
			//   31   55:astore_3        
						Object obj3 = Array.get(obj1, j);
			//   32   56:aload_1         
			//   33   57:iload_2         
			//   34   58:invokestatic    #43  <Method Object Array.get(Object, int)>
			//   35   61:astore          4
						if(obj2 == obj3 || obj2 == null || obj2.equals(obj3))
			//*  36   63:aload_3         
			//*  37   64:aload           4
			//*  38   66:if_acmpne       76
							j++;
			//   39   69:iload_2         
			//   40   70:iconst_1        
			//   41   71:iadd            
			//   42   72:istore_2        
						else
			//*  43   73:goto            39
			//*  44   76:aload_3         
			//*  45   77:ifnull          69
			//*  46   80:aload_3         
			//*  47   81:aload           4
			//*  48   83:invokevirtual   #45  <Method boolean Object.equals(Object)>
			//*  49   86:ifne            69
							return false;
			//   50   89:iconst_0        
			//   51   90:ireturn         
					}
				}
				return true;
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
	//    6   10:invokevirtual   #96  <Method Class Object.getClass()>
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokespecial   #99  <Method void ArrayBuilders$1(Class, int, Object)>
	//   10   18:areturn         
	}

	public static Object[] insertInList(Object aobj[], Object obj)
	{
		int i = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		Object aobj1[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i + 1);
	//    3    3:aload_0         
	//    4    4:invokevirtual   #96  <Method Class Object.getClass()>
	//    5    7:invokevirtual   #106 <Method Class Class.getComponentType()>
	//    6   10:iload_2         
	//    7   11:iconst_1        
	//    8   12:iadd            
	//    9   13:invokestatic    #110 <Method Object Array.newInstance(Class, int)>
	//   10   16:checkcast       #112 <Class Object[]>
	//   11   19:checkcast       #112 <Class Object[]>
	//   12   22:astore_3        
		if(i > 0)
	//*  13   23:iload_2         
	//*  14   24:ifle            35
			System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 1, i);
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:aload_3         
	//   18   30:iconst_1        
	//   19   31:iload_2         
	//   20   32:invokestatic    #118 <Method void System.arraycopy(Object, int, Object, int, int)>
		aobj1[0] = obj;
	//   21   35:aload_3         
	//   22   36:iconst_0        
	//   23   37:aload_1         
	//   24   38:aastore         
		return aobj1;
	//   25   39:aload_3         
	//   26   40:areturn         
	}

	public static Object[] insertInListNoDup(Object aobj[], Object obj)
	{
		int i;
		int j;
		j = aobj.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_2        
_L6:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    5    5:iload_2         
	//    6    6:iload_3         
	//    7    7:icmpge          92
		if(aobj[i] != obj)
			break MISSING_BLOCK_LABEL_85;
	//    8   10:aload_0         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:aload_1         
	//   12   14:if_acmpne       85
		if(i != 0) goto _L2; else goto _L1
	//   13   17:iload_2         
	//   14   18:ifne            25
_L1:
		obj = ((Object) (aobj));
	//   15   21:aload_0         
	//   16   22:astore_1        
_L4:
		return ((Object []) (obj));
	//   17   23:aload_1         
	//   18   24:areturn         
_L2:
		Object aobj1[];
		aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j);
	//   19   25:aload_0         
	//   20   26:invokevirtual   #96  <Method Class Object.getClass()>
	//   21   29:invokevirtual   #106 <Method Class Class.getComponentType()>
	//   22   32:iload_3         
	//   23   33:invokestatic    #110 <Method Object Array.newInstance(Class, int)>
	//   24   36:checkcast       #112 <Class Object[]>
	//   25   39:checkcast       #112 <Class Object[]>
	//   26   42:astore          4
		System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 1, i);
	//   27   44:aload_0         
	//   28   45:iconst_0        
	//   29   46:aload           4
	//   30   48:iconst_1        
	//   31   49:iload_2         
	//   32   50:invokestatic    #118 <Method void System.arraycopy(Object, int, Object, int, int)>
		aobj1[0] = obj;
	//   33   53:aload           4
	//   34   55:iconst_0        
	//   35   56:aload_1         
	//   36   57:aastore         
		i++;
	//   37   58:iload_2         
	//   38   59:iconst_1        
	//   39   60:iadd            
	//   40   61:istore_2        
		j -= i;
	//   41   62:iload_3         
	//   42   63:iload_2         
	//   43   64:isub            
	//   44   65:istore_3        
		obj = ((Object) (aobj1));
	//   45   66:aload           4
	//   46   68:astore_1        
		if(j <= 0) goto _L4; else goto _L3
	//   47   69:iload_3         
	//   48   70:ifle            23
_L3:
		System.arraycopy(((Object) (aobj)), i, ((Object) (aobj1)), i, j);
	//   49   73:aload_0         
	//   50   74:iload_2         
	//   51   75:aload           4
	//   52   77:iload_2         
	//   53   78:iload_3         
	//   54   79:invokestatic    #118 <Method void System.arraycopy(Object, int, Object, int, int)>
		return aobj1;
	//   55   82:aload           4
	//   56   84:areturn         
		i++;
	//   57   85:iload_2         
	//   58   86:iconst_1        
	//   59   87:iadd            
	//   60   88:istore_2        
		if(true) goto _L6; else goto _L5
	//   61   89:goto            5
_L5:
		Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), j + 1);
	//   62   92:aload_0         
	//   63   93:invokevirtual   #96  <Method Class Object.getClass()>
	//   64   96:invokevirtual   #106 <Method Class Class.getComponentType()>
	//   65   99:iload_3         
	//   66  100:iconst_1        
	//   67  101:iadd            
	//   68  102:invokestatic    #110 <Method Object Array.newInstance(Class, int)>
	//   69  105:checkcast       #112 <Class Object[]>
	//   70  108:checkcast       #112 <Class Object[]>
	//   71  111:astore          4
		if(j > 0)
	//*  72  113:iload_3         
	//*  73  114:ifle            126
			System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), 1, j);
	//   74  117:aload_0         
	//   75  118:iconst_0        
	//   76  119:aload           4
	//   77  121:iconst_1        
	//   78  122:iload_3         
	//   79  123:invokestatic    #118 <Method void System.arraycopy(Object, int, Object, int, int)>
		aobj2[0] = obj;
	//   80  126:aload           4
	//   81  128:iconst_0        
	//   82  129:aload_1         
	//   83  130:aastore         
		return aobj2;
	//   84  131:aload           4
	//   85  133:areturn         
	}

	public static HashSet setAndArray(Set set, Object aobj[])
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #81  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void HashSet()>
	//    3    7:astore          4
		if(set != null)
	//*   4    9:aload_0         
	//*   5   10:ifnull          20
			hashset.addAll(((java.util.Collection) (set)));
	//    6   13:aload           4
	//    7   15:aload_0         
	//    8   16:invokevirtual   #126 <Method boolean HashSet.addAll(java.util.Collection)>
	//    9   19:pop             
		if(aobj != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          50
		{
			int j = aobj.length;
	//   12   24:aload_1         
	//   13   25:arraylength     
	//   14   26:istore_3        
			for(int i = 0; i < j; i++)
	//*  15   27:iconst_0        
	//*  16   28:istore_2        
	//*  17   29:iload_2         
	//*  18   30:iload_3         
	//*  19   31:icmpge          50
				hashset.add(aobj[i]);
	//   20   34:aload           4
	//   21   36:aload_1         
	//   22   37:iload_2         
	//   23   38:aaload          
	//   24   39:invokevirtual   #83  <Method boolean HashSet.add(Object)>
	//   25   42:pop             

	//   26   43:iload_2         
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:istore_2        
		}
	//*  30   47:goto            29
		return hashset;
	//   31   50:aload           4
	//   32   52:areturn         
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
	//    6   12:invokespecial   #130 <Method void ArrayBuilders$BooleanBuilder()>
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
	//    6   12:invokespecial   #133 <Method void ArrayBuilders$ByteBuilder()>
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
	//    6   12:invokespecial   #136 <Method void ArrayBuilders$DoubleBuilder()>
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
	//    6   12:invokespecial   #139 <Method void ArrayBuilders$FloatBuilder()>
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
	//    6   12:invokespecial   #142 <Method void ArrayBuilders$IntBuilder()>
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
	//    6   12:invokespecial   #145 <Method void ArrayBuilders$LongBuilder()>
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
	//    6   12:invokespecial   #148 <Method void ArrayBuilders$ShortBuilder()>
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
