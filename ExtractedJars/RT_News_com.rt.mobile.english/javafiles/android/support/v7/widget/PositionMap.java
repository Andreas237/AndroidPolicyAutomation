// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.ArrayList;

class PositionMap
	implements Cloneable
{
	static class ContainerHelpers
	{

		static int binarySearch(int ai[], int i, int j)
		{
			i--;
		//    0    0:iload_1         
		//    1    1:iconst_1        
		//    2    2:isub            
		//    3    3:istore_1        
			int k;
			for(k = 0; k <= i;)
		//*   4    4:iconst_0        
		//*   5    5:istore_3        
		//*   6    6:iload_3         
		//*   7    7:iload_1         
		//*   8    8:icmpgt          55
			{
				int l = k + i >>> 1;
		//    9   11:iload_3         
		//   10   12:iload_1         
		//   11   13:iadd            
		//   12   14:iconst_1        
		//   13   15:iushr           
		//   14   16:istore          4
				int i1 = ai[l];
		//   15   18:aload_0         
		//   16   19:iload           4
		//   17   21:iaload          
		//   18   22:istore          5
				if(i1 < j)
		//*  19   24:iload           5
		//*  20   26:iload_2         
		//*  21   27:icmpge          38
					k = l + 1;
		//   22   30:iload           4
		//   23   32:iconst_1        
		//   24   33:iadd            
		//   25   34:istore_3        
				else
		//*  26   35:goto            6
				if(i1 > j)
		//*  27   38:iload           5
		//*  28   40:iload_2         
		//*  29   41:icmple          52
					i = l - 1;
		//   30   44:iload           4
		//   31   46:iconst_1        
		//   32   47:isub            
		//   33   48:istore_1        
				else
		//*  34   49:goto            6
					return l;
		//   35   52:iload           4
		//   36   54:ireturn         
			}

			return ~k;
		//   37   55:iload_3         
		//   38   56:iconst_m1       
		//   39   57:ixor            
		//   40   58:ireturn         
		}

		static final boolean EMPTY_BOOLEANS[] = new boolean[0];
		static final int EMPTY_INTS[] = new int[0];
		static final long EMPTY_LONGS[] = new long[0];
		static final Object EMPTY_OBJECTS[] = new Object[0];

		static 
		{
		//    0    0:iconst_0        
		//    1    1:newarray        boolean[]
		//    2    3:putstatic       #19  <Field boolean[] EMPTY_BOOLEANS>
		//    3    6:iconst_0        
		//    4    7:newarray        int[]
		//    5    9:putstatic       #21  <Field int[] EMPTY_INTS>
		//    6   12:iconst_0        
		//    7   13:newarray        long[]
		//    8   15:putstatic       #23  <Field long[] EMPTY_LONGS>
		//    9   18:iconst_0        
		//   10   19:anewarray       Object[]
		//   11   22:putstatic       #25  <Field Object[] EMPTY_OBJECTS>
		//*  12   25:return          
		}

		ContainerHelpers()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
		//    2    4:return          
		}
	}


	PositionMap()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #31  <Method void PositionMap(int)>
	//    3    6:return          
	}

	PositionMap(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mGarbage = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #33  <Field boolean mGarbage>
		if(i == 0)
	//*   5    9:iload_1         
	//*   6   10:ifne            30
		{
			mKeys = ContainerHelpers.EMPTY_INTS;
	//    7   13:aload_0         
	//    8   14:getstatic       #36  <Field int[] PositionMap$ContainerHelpers.EMPTY_INTS>
	//    9   17:putfield        #38  <Field int[] mKeys>
			mValues = ContainerHelpers.EMPTY_OBJECTS;
	//   10   20:aload_0         
	//   11   21:getstatic       #41  <Field Object[] PositionMap$ContainerHelpers.EMPTY_OBJECTS>
	//   12   24:putfield        #43  <Field Object[] mValues>
		} else
	//*  13   27:goto            50
		{
			i = idealIntArraySize(i);
	//   14   30:iload_1         
	//   15   31:invokestatic    #47  <Method int idealIntArraySize(int)>
	//   16   34:istore_1        
			mKeys = new int[i];
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:newarray        int[]
	//   20   39:putfield        #38  <Field int[] mKeys>
			mValues = new Object[i];
	//   21   42:aload_0         
	//   22   43:iload_1         
	//   23   44:anewarray       Object[]
	//   24   47:putfield        #43  <Field Object[] mValues>
		}
		mSize = 0;
	//   25   50:aload_0         
	//   26   51:iconst_0        
	//   27   52:putfield        #49  <Field int mSize>
	//   28   55:return          
	}

	private void gc()
	{
		int l = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSize>
	//    2    4:istore          4
		int ai[] = mKeys;
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field int[] mKeys>
	//    5   10:astore          5
		Object aobj[] = mValues;
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field Object[] mValues>
	//    8   16:astore          6
		int i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_1        
		int j;
		int k;
		for(j = i; i < l; j = k)
	//*  11   20:iload_1         
	//*  12   21:istore_2        
	//*  13   22:iload_1         
	//*  14   23:iload           4
	//*  15   25:icmpge          81
		{
			Object obj = aobj[i];
	//   16   28:aload           6
	//   17   30:iload_1         
	//   18   31:aaload          
	//   19   32:astore          7
			k = j;
	//   20   34:iload_2         
	//   21   35:istore_3        
			if(obj != DELETED)
	//*  22   36:aload           7
	//*  23   38:getstatic       #27  <Field Object DELETED>
	//*  24   41:if_acmpeq       72
			{
				if(i != j)
	//*  25   44:iload_1         
	//*  26   45:iload_2         
	//*  27   46:icmpeq          68
				{
					ai[j] = ai[i];
	//   28   49:aload           5
	//   29   51:iload_2         
	//   30   52:aload           5
	//   31   54:iload_1         
	//   32   55:iaload          
	//   33   56:iastore         
					aobj[j] = obj;
	//   34   57:aload           6
	//   35   59:iload_2         
	//   36   60:aload           7
	//   37   62:aastore         
					aobj[i] = null;
	//   38   63:aload           6
	//   39   65:iload_1         
	//   40   66:aconst_null     
	//   41   67:aastore         
				}
				k = j + 1;
	//   42   68:iload_2         
	//   43   69:iconst_1        
	//   44   70:iadd            
	//   45   71:istore_3        
			}
			i++;
	//   46   72:iload_1         
	//   47   73:iconst_1        
	//   48   74:iadd            
	//   49   75:istore_1        
		}

	//   50   76:iload_3         
	//   51   77:istore_2        
	//*  52   78:goto            22
		mGarbage = false;
	//   53   81:aload_0         
	//   54   82:iconst_0        
	//   55   83:putfield        #33  <Field boolean mGarbage>
		mSize = j;
	//   56   86:aload_0         
	//   57   87:iload_2         
	//   58   88:putfield        #49  <Field int mSize>
	//   59   91:return          
	}

	static int idealBooleanArraySize(int i)
	{
		return idealByteArraySize(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #54  <Method int idealByteArraySize(int)>
	//    2    4:ireturn         
	}

	static int idealByteArraySize(int i)
	{
		for(int j = 4; j < 32; j++)
	//*   0    0:iconst_4        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          32
	//*   4    5:icmpge          29
		{
			int k = (1 << j) - 12;
	//    5    8:iconst_1        
	//    6    9:iload_1         
	//    7   10:ishl            
	//    8   11:bipush          12
	//    9   13:isub            
	//   10   14:istore_2        
			if(i <= k)
	//*  11   15:iload_0         
	//*  12   16:iload_2         
	//*  13   17:icmpgt          22
				return k;
	//   14   20:iload_2         
	//   15   21:ireturn         
		}

	//   16   22:iload_1         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_1        
	//*  20   26:goto            2
		return i;
	//   21   29:iload_0         
	//   22   30:ireturn         
	}

	static int idealCharArraySize(int i)
	{
		return idealByteArraySize(i * 2) / 2;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:imul            
	//    3    3:invokestatic    #54  <Method int idealByteArraySize(int)>
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:ireturn         
	}

	static int idealFloatArraySize(int i)
	{
		return idealByteArraySize(i * 4) / 4;
	//    0    0:iload_0         
	//    1    1:iconst_4        
	//    2    2:imul            
	//    3    3:invokestatic    #54  <Method int idealByteArraySize(int)>
	//    4    6:iconst_4        
	//    5    7:idiv            
	//    6    8:ireturn         
	}

	static int idealIntArraySize(int i)
	{
		return idealByteArraySize(i * 4) / 4;
	//    0    0:iload_0         
	//    1    1:iconst_4        
	//    2    2:imul            
	//    3    3:invokestatic    #54  <Method int idealByteArraySize(int)>
	//    4    6:iconst_4        
	//    5    7:idiv            
	//    6    8:ireturn         
	}

	static int idealLongArraySize(int i)
	{
		return idealByteArraySize(i * 8) / 8;
	//    0    0:iload_0         
	//    1    1:bipush          8
	//    2    3:imul            
	//    3    4:invokestatic    #54  <Method int idealByteArraySize(int)>
	//    4    7:bipush          8
	//    5    9:idiv            
	//    6   10:ireturn         
	}

	static int idealObjectArraySize(int i)
	{
		return idealByteArraySize(i * 4) / 4;
	//    0    0:iload_0         
	//    1    1:iconst_4        
	//    2    2:imul            
	//    3    3:invokestatic    #54  <Method int idealByteArraySize(int)>
	//    4    6:iconst_4        
	//    5    7:idiv            
	//    6    8:ireturn         
	}

	static int idealShortArraySize(int i)
	{
		return idealByteArraySize(i * 2) / 2;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:imul            
	//    3    3:invokestatic    #54  <Method int idealByteArraySize(int)>
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:ireturn         
	}

	public void append(int i, Object obj)
	{
		if(mSize != 0 && i <= mKeys[mSize - 1])
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int mSize>
	//*   2    4:ifeq            29
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #38  <Field int[] mKeys>
	//*   6   12:aload_0         
	//*   7   13:getfield        #49  <Field int mSize>
	//*   8   16:iconst_1        
	//*   9   17:isub            
	//*  10   18:iaload          
	//*  11   19:icmpgt          29
		{
			put(i, obj);
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:aload_2         
	//   15   25:invokevirtual   #64  <Method void put(int, Object)>
			return;
	//   16   28:return          
		}
		if(mGarbage && mSize >= mKeys.length)
	//*  17   29:aload_0         
	//*  18   30:getfield        #33  <Field boolean mGarbage>
	//*  19   33:ifeq            52
	//*  20   36:aload_0         
	//*  21   37:getfield        #49  <Field int mSize>
	//*  22   40:aload_0         
	//*  23   41:getfield        #38  <Field int[] mKeys>
	//*  24   44:arraylength     
	//*  25   45:icmplt          52
			gc();
	//   26   48:aload_0         
	//   27   49:invokespecial   #66  <Method void gc()>
		int j = mSize;
	//   28   52:aload_0         
	//   29   53:getfield        #49  <Field int mSize>
	//   30   56:istore_3        
		if(j >= mKeys.length)
	//*  31   57:iload_3         
	//*  32   58:aload_0         
	//*  33   59:getfield        #38  <Field int[] mKeys>
	//*  34   62:arraylength     
	//*  35   63:icmplt          131
		{
			int k = idealIntArraySize(j + 1);
	//   36   66:iload_3         
	//   37   67:iconst_1        
	//   38   68:iadd            
	//   39   69:invokestatic    #47  <Method int idealIntArraySize(int)>
	//   40   72:istore          4
			int ai[] = new int[k];
	//   41   74:iload           4
	//   42   76:newarray        int[]
	//   43   78:astore          5
			Object aobj[] = new Object[k];
	//   44   80:iload           4
	//   45   82:anewarray       Object[]
	//   46   85:astore          6
			System.arraycopy(((Object) (mKeys)), 0, ((Object) (ai)), 0, mKeys.length);
	//   47   87:aload_0         
	//   48   88:getfield        #38  <Field int[] mKeys>
	//   49   91:iconst_0        
	//   50   92:aload           5
	//   51   94:iconst_0        
	//   52   95:aload_0         
	//   53   96:getfield        #38  <Field int[] mKeys>
	//   54   99:arraylength     
	//   55  100:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mValues)), 0, ((Object) (aobj)), 0, mValues.length);
	//   56  103:aload_0         
	//   57  104:getfield        #43  <Field Object[] mValues>
	//   58  107:iconst_0        
	//   59  108:aload           6
	//   60  110:iconst_0        
	//   61  111:aload_0         
	//   62  112:getfield        #43  <Field Object[] mValues>
	//   63  115:arraylength     
	//   64  116:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			mKeys = ai;
	//   65  119:aload_0         
	//   66  120:aload           5
	//   67  122:putfield        #38  <Field int[] mKeys>
			mValues = aobj;
	//   68  125:aload_0         
	//   69  126:aload           6
	//   70  128:putfield        #43  <Field Object[] mValues>
		}
		mKeys[j] = i;
	//   71  131:aload_0         
	//   72  132:getfield        #38  <Field int[] mKeys>
	//   73  135:iload_3         
	//   74  136:iload_1         
	//   75  137:iastore         
		mValues[j] = obj;
	//   76  138:aload_0         
	//   77  139:getfield        #43  <Field Object[] mValues>
	//   78  142:iload_3         
	//   79  143:aload_2         
	//   80  144:aastore         
		mSize = j + 1;
	//   81  145:aload_0         
	//   82  146:iload_3         
	//   83  147:iconst_1        
	//   84  148:iadd            
	//   85  149:putfield        #49  <Field int mSize>
	//   86  152:return          
	}

	public void clear()
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSize>
	//    2    4:istore_2        
		Object aobj[] = mValues;
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field Object[] mValues>
	//    5    9:astore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_2         
	//*  10   14:icmpge          28
			aobj[i] = null;
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:aconst_null     
	//   14   20:aastore         

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//*  19   25:goto            12
		mSize = 0;
	//   20   28:aload_0         
	//   21   29:iconst_0        
	//   22   30:putfield        #49  <Field int mSize>
		mGarbage = false;
	//   23   33:aload_0         
	//   24   34:iconst_0        
	//   25   35:putfield        #33  <Field boolean mGarbage>
	//   26   38:return          
	}

	public PositionMap clone()
	{
		Object obj;
		try
		{
			obj = ((Object) ((PositionMap)super.clone()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class PositionMap>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #38  <Field int[] mKeys>
	//*   7   13:invokevirtual   #84  <Method Object _5B_I.clone()>
	//*   8   16:checkcast       #83  <Class int[]>
	//*   9   19:putfield        #38  <Field int[] mKeys>
	//*  10   22:aload_1         
	//*  11   23:aload_0         
	//*  12   24:getfield        #43  <Field Object[] mValues>
	//*  13   27:invokevirtual   #86  <Method Object _5B_Ljava.lang.Object_3B_.clone()>
	//*  14   30:checkcast       #85  <Class Object[]>
	//*  15   33:putfield        #43  <Field Object[] mValues>
	//*  16   36:aload_1         
	//*  17   37:areturn         
	//*  18   38:aconst_null     
	//*  19   39:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			return null;
		}
		try
		{
			obj.mKeys = (int[])((int []) (mKeys)).clone();
			obj.mValues = (Object[])((Object []) (mValues)).clone();
		}
	//*  20   40:astore_1        
	//*  21   41:goto            38
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  22   44:astore_2        
		{
			return ((PositionMap) (obj));
	//   23   45:aload_1         
	//   24   46:areturn         
		}
		return ((PositionMap) (obj));
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method PositionMap clone()>
	//    2    4:areturn         
	}

	public void delete(int i)
	{
		i = ContainerHelpers.binarySearch(mKeys, mSize, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field int mSize>
	//    4    8:iload_1         
	//    5    9:invokestatic    #95  <Method int PositionMap$ContainerHelpers.binarySearch(int[], int, int)>
	//    6   12:istore_1        
		if(i >= 0 && mValues[i] != DELETED)
	//*   7   13:iload_1         
	//*   8   14:iflt            43
	//*   9   17:aload_0         
	//*  10   18:getfield        #43  <Field Object[] mValues>
	//*  11   21:iload_1         
	//*  12   22:aaload          
	//*  13   23:getstatic       #27  <Field Object DELETED>
	//*  14   26:if_acmpeq       43
		{
			mValues[i] = DELETED;
	//   15   29:aload_0         
	//   16   30:getfield        #43  <Field Object[] mValues>
	//   17   33:iload_1         
	//   18   34:getstatic       #27  <Field Object DELETED>
	//   19   37:aastore         
			mGarbage = true;
	//   20   38:aload_0         
	//   21   39:iconst_1        
	//   22   40:putfield        #33  <Field boolean mGarbage>
		}
	//   23   43:return          
	}

	public Object get(int i)
	{
		return get(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #100 <Method Object get(int, Object)>
	//    4    6:areturn         
	}

	public Object get(int i, Object obj)
	{
		i = ContainerHelpers.binarySearch(mKeys, mSize, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field int mSize>
	//    4    8:iload_1         
	//    5    9:invokestatic    #95  <Method int PositionMap$ContainerHelpers.binarySearch(int[], int, int)>
	//    6   12:istore_1        
		if(i >= 0)
	//*   7   13:iload_1         
	//*   8   14:iflt            38
		{
			if(mValues[i] == DELETED)
	//*   9   17:aload_0         
	//*  10   18:getfield        #43  <Field Object[] mValues>
	//*  11   21:iload_1         
	//*  12   22:aaload          
	//*  13   23:getstatic       #27  <Field Object DELETED>
	//*  14   26:if_acmpne       31
				return obj;
	//   15   29:aload_2         
	//   16   30:areturn         
			else
				return mValues[i];
	//   17   31:aload_0         
	//   18   32:getfield        #43  <Field Object[] mValues>
	//   19   35:iload_1         
	//   20   36:aaload          
	//   21   37:areturn         
		} else
		{
			return obj;
	//   22   38:aload_2         
	//   23   39:areturn         
		}
	}

	public int indexOfKey(int i)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #66  <Method void gc()>
		return ContainerHelpers.binarySearch(mKeys, mSize, i);
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field int[] mKeys>
	//    7   15:aload_0         
	//    8   16:getfield        #49  <Field int mSize>
	//    9   19:iload_1         
	//   10   20:invokestatic    #95  <Method int PositionMap$ContainerHelpers.binarySearch(int[], int, int)>
	//   11   23:ireturn         
	}

	public int indexOfValue(Object obj)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #66  <Method void gc()>
		for(int i = 0; i < mSize; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_2        
	//*   7   13:iload_2         
	//*   8   14:aload_0         
	//*   9   15:getfield        #49  <Field int mSize>
	//*  10   18:icmpge          40
			if(mValues[i] == obj)
	//*  11   21:aload_0         
	//*  12   22:getfield        #43  <Field Object[] mValues>
	//*  13   25:iload_2         
	//*  14   26:aaload          
	//*  15   27:aload_1         
	//*  16   28:if_acmpne       33
				return i;
	//   17   31:iload_2         
	//   18   32:ireturn         

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            13
		return -1;
	//   24   40:iconst_m1       
	//   25   41:ireturn         
	}

	public void insertKeyRange(int i, int j)
	{
	//    0    0:return          
	}

	public int keyAt(int i)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #66  <Method void gc()>
		return mKeys[i];
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field int[] mKeys>
	//    7   15:iload_1         
	//    8   16:iaload          
	//    9   17:ireturn         
	}

	public void put(int i, Object obj)
	{
		int j = ContainerHelpers.binarySearch(mKeys, mSize, i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field int mSize>
	//    4    8:iload_1         
	//    5    9:invokestatic    #95  <Method int PositionMap$ContainerHelpers.binarySearch(int[], int, int)>
	//    6   12:istore_3        
		if(j >= 0)
	//*   7   13:iload_3         
	//*   8   14:iflt            25
		{
			mValues[j] = obj;
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field Object[] mValues>
	//   11   21:iload_3         
	//   12   22:aload_2         
	//   13   23:aastore         
			return;
	//   14   24:return          
		}
		int k = ~j;
	//   15   25:iload_3         
	//   16   26:iconst_m1       
	//   17   27:ixor            
	//   18   28:istore          4
		if(k < mSize && mValues[k] == DELETED)
	//*  19   30:iload           4
	//*  20   32:aload_0         
	//*  21   33:getfield        #49  <Field int mSize>
	//*  22   36:icmpge          69
	//*  23   39:aload_0         
	//*  24   40:getfield        #43  <Field Object[] mValues>
	//*  25   43:iload           4
	//*  26   45:aaload          
	//*  27   46:getstatic       #27  <Field Object DELETED>
	//*  28   49:if_acmpne       69
		{
			mKeys[k] = i;
	//   29   52:aload_0         
	//   30   53:getfield        #38  <Field int[] mKeys>
	//   31   56:iload           4
	//   32   58:iload_1         
	//   33   59:iastore         
			mValues[k] = obj;
	//   34   60:aload_0         
	//   35   61:getfield        #43  <Field Object[] mValues>
	//   36   64:iload           4
	//   37   66:aload_2         
	//   38   67:aastore         
			return;
	//   39   68:return          
		}
		j = k;
	//   40   69:iload           4
	//   41   71:istore_3        
		if(mGarbage)
	//*  42   72:aload_0         
	//*  43   73:getfield        #33  <Field boolean mGarbage>
	//*  44   76:ifeq            113
		{
			j = k;
	//   45   79:iload           4
	//   46   81:istore_3        
			if(mSize >= mKeys.length)
	//*  47   82:aload_0         
	//*  48   83:getfield        #49  <Field int mSize>
	//*  49   86:aload_0         
	//*  50   87:getfield        #38  <Field int[] mKeys>
	//*  51   90:arraylength     
	//*  52   91:icmplt          113
			{
				gc();
	//   53   94:aload_0         
	//   54   95:invokespecial   #66  <Method void gc()>
				j = ~ContainerHelpers.binarySearch(mKeys, mSize, i);
	//   55   98:aload_0         
	//   56   99:getfield        #38  <Field int[] mKeys>
	//   57  102:aload_0         
	//   58  103:getfield        #49  <Field int mSize>
	//   59  106:iload_1         
	//   60  107:invokestatic    #95  <Method int PositionMap$ContainerHelpers.binarySearch(int[], int, int)>
	//   61  110:iconst_m1       
	//   62  111:ixor            
	//   63  112:istore_3        
			}
		}
		if(mSize >= mKeys.length)
	//*  64  113:aload_0         
	//*  65  114:getfield        #49  <Field int mSize>
	//*  66  117:aload_0         
	//*  67  118:getfield        #38  <Field int[] mKeys>
	//*  68  121:arraylength     
	//*  69  122:icmplt          193
		{
			int l = idealIntArraySize(mSize + 1);
	//   70  125:aload_0         
	//   71  126:getfield        #49  <Field int mSize>
	//   72  129:iconst_1        
	//   73  130:iadd            
	//   74  131:invokestatic    #47  <Method int idealIntArraySize(int)>
	//   75  134:istore          4
			int ai[] = new int[l];
	//   76  136:iload           4
	//   77  138:newarray        int[]
	//   78  140:astore          5
			Object aobj[] = new Object[l];
	//   79  142:iload           4
	//   80  144:anewarray       Object[]
	//   81  147:astore          6
			System.arraycopy(((Object) (mKeys)), 0, ((Object) (ai)), 0, mKeys.length);
	//   82  149:aload_0         
	//   83  150:getfield        #38  <Field int[] mKeys>
	//   84  153:iconst_0        
	//   85  154:aload           5
	//   86  156:iconst_0        
	//   87  157:aload_0         
	//   88  158:getfield        #38  <Field int[] mKeys>
	//   89  161:arraylength     
	//   90  162:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mValues)), 0, ((Object) (aobj)), 0, mValues.length);
	//   91  165:aload_0         
	//   92  166:getfield        #43  <Field Object[] mValues>
	//   93  169:iconst_0        
	//   94  170:aload           6
	//   95  172:iconst_0        
	//   96  173:aload_0         
	//   97  174:getfield        #43  <Field Object[] mValues>
	//   98  177:arraylength     
	//   99  178:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			mKeys = ai;
	//  100  181:aload_0         
	//  101  182:aload           5
	//  102  184:putfield        #38  <Field int[] mKeys>
			mValues = aobj;
	//  103  187:aload_0         
	//  104  188:aload           6
	//  105  190:putfield        #43  <Field Object[] mValues>
		}
		if(mSize - j != 0)
	//* 106  193:aload_0         
	//* 107  194:getfield        #49  <Field int mSize>
	//* 108  197:iload_3         
	//* 109  198:isub            
	//* 110  199:ifeq            255
		{
			int ai1[] = mKeys;
	//  111  202:aload_0         
	//  112  203:getfield        #38  <Field int[] mKeys>
	//  113  206:astore          5
			int ai2[] = mKeys;
	//  114  208:aload_0         
	//  115  209:getfield        #38  <Field int[] mKeys>
	//  116  212:astore          6
			int i1 = j + 1;
	//  117  214:iload_3         
	//  118  215:iconst_1        
	//  119  216:iadd            
	//  120  217:istore          4
			System.arraycopy(((Object) (ai1)), j, ((Object) (ai2)), i1, mSize - j);
	//  121  219:aload           5
	//  122  221:iload_3         
	//  123  222:aload           6
	//  124  224:iload           4
	//  125  226:aload_0         
	//  126  227:getfield        #49  <Field int mSize>
	//  127  230:iload_3         
	//  128  231:isub            
	//  129  232:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mValues)), j, ((Object) (mValues)), i1, mSize - j);
	//  130  235:aload_0         
	//  131  236:getfield        #43  <Field Object[] mValues>
	//  132  239:iload_3         
	//  133  240:aload_0         
	//  134  241:getfield        #43  <Field Object[] mValues>
	//  135  244:iload           4
	//  136  246:aload_0         
	//  137  247:getfield        #49  <Field int mSize>
	//  138  250:iload_3         
	//  139  251:isub            
	//  140  252:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mKeys[j] = i;
	//  141  255:aload_0         
	//  142  256:getfield        #38  <Field int[] mKeys>
	//  143  259:iload_3         
	//  144  260:iload_1         
	//  145  261:iastore         
		mValues[j] = obj;
	//  146  262:aload_0         
	//  147  263:getfield        #43  <Field Object[] mValues>
	//  148  266:iload_3         
	//  149  267:aload_2         
	//  150  268:aastore         
		mSize = mSize + 1;
	//  151  269:aload_0         
	//  152  270:aload_0         
	//  153  271:getfield        #49  <Field int mSize>
	//  154  274:iconst_1        
	//  155  275:iadd            
	//  156  276:putfield        #49  <Field int mSize>
	//  157  279:return          
	}

	public void remove(int i)
	{
		delete(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #112 <Method void delete(int)>
	//    3    5:return          
	}

	public void removeAt(int i)
	{
		if(mValues[i] != DELETED)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Object[] mValues>
	//*   2    4:iload_1         
	//*   3    5:aaload          
	//*   4    6:getstatic       #27  <Field Object DELETED>
	//*   5    9:if_acmpeq       26
		{
			mValues[i] = DELETED;
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field Object[] mValues>
	//    8   16:iload_1         
	//    9   17:getstatic       #27  <Field Object DELETED>
	//   10   20:aastore         
			mGarbage = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #33  <Field boolean mGarbage>
		}
	//   14   26:return          
	}

	public void removeAtRange(int i, int j)
	{
		for(j = Math.min(mSize, j + i); i < j; i++)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field int mSize>
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:iadd            
	//*   5    7:invokestatic    #120 <Method int Math.min(int, int)>
	//*   6   10:istore_2        
	//*   7   11:iload_1         
	//*   8   12:iload_2         
	//*   9   13:icmpge          28
			removeAt(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokevirtual   #122 <Method void removeAt(int)>

	//   13   21:iload_1         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:istore_1        
	//*  17   25:goto            11
	//   18   28:return          
	}

	public void removeKeyRange(ArrayList arraylist, int i, int j)
	{
	//    0    0:return          
	}

	public void setValueAt(int i, Object obj)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #66  <Method void gc()>
		mValues[i] = obj;
	//    5   11:aload_0         
	//    6   12:getfield        #43  <Field Object[] mValues>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:aastore         
	//   10   18:return          
	}

	public int size()
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #66  <Method void gc()>
		return mSize;
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field int mSize>
	//    7   15:ireturn         
	}

	public String toString()
	{
		if(size() <= 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #132 <Method int size()>
	//*   2    4:ifgt            10
			return "{}";
	//    3    7:ldc1            #134 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 28);
	//    5   10:new             #136 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #49  <Field int mSize>
	//    9   18:bipush          28
	//   10   20:imul            
	//   11   21:invokespecial   #137 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #140 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		for(int i = 0; i < mSize; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #49  <Field int mSize>
	//*  22   39:icmpge          104
		{
			if(i > 0)
	//*  23   42:iload_1         
	//*  24   43:ifle            53
				stringbuilder.append(", ");
	//   25   46:aload_2         
	//   26   47:ldc1            #142 <String ", ">
	//   27   49:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append(keyAt(i));
	//   29   53:aload_2         
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:invokevirtual   #147 <Method int keyAt(int)>
	//   33   59:invokevirtual   #150 <Method StringBuilder StringBuilder.append(int)>
	//   34   62:pop             
			stringbuilder.append('=');
	//   35   63:aload_2         
	//   36   64:bipush          61
	//   37   66:invokevirtual   #140 <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
			Object obj = valueAt(i);
	//   39   70:aload_0         
	//   40   71:iload_1         
	//   41   72:invokevirtual   #153 <Method Object valueAt(int)>
	//   42   75:astore_3        
			if(obj != this)
	//*  43   76:aload_3         
	//*  44   77:aload_0         
	//*  45   78:if_acmpeq       90
				stringbuilder.append(obj);
	//   46   81:aload_2         
	//   47   82:aload_3         
	//   48   83:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//   49   86:pop             
			else
	//*  50   87:goto            97
				stringbuilder.append("(this Map)");
	//   51   90:aload_2         
	//   52   91:ldc1            #158 <String "(this Map)">
	//   53   93:invokevirtual   #145 <Method StringBuilder StringBuilder.append(String)>
	//   54   96:pop             
		}

	//   55   97:iload_1         
	//   56   98:iconst_1        
	//   57   99:iadd            
	//   58  100:istore_1        
	//*  59  101:goto            34
		stringbuilder.append('}');
	//   60  104:aload_2         
	//   61  105:bipush          125
	//   62  107:invokevirtual   #140 <Method StringBuilder StringBuilder.append(char)>
	//   63  110:pop             
		return stringbuilder.toString();
	//   64  111:aload_2         
	//   65  112:invokevirtual   #160 <Method String StringBuilder.toString()>
	//   66  115:areturn         
	}

	public Object valueAt(int i)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #66  <Method void gc()>
		return mValues[i];
	//    5   11:aload_0         
	//    6   12:getfield        #43  <Field Object[] mValues>
	//    7   15:iload_1         
	//    8   16:aaload          
	//    9   17:areturn         
	}

	private static final Object DELETED = new Object();
	private boolean mGarbage;
	private int mKeys[];
	private int mSize;
	private Object mValues[];

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void Object()>
	//    3    7:putstatic       #27  <Field Object DELETED>
	//*   4   10:return          
	}
}
