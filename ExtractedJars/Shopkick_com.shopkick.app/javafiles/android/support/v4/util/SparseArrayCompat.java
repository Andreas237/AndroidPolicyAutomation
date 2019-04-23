// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//			ContainerHelpers

public class SparseArrayCompat
	implements Cloneable
{

	public SparseArrayCompat()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #28  <Method void SparseArrayCompat(int)>
	//    3    6:return          
	}

	public SparseArrayCompat(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mGarbage = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean mGarbage>
		if(i == 0)
	//*   5    9:iload_1         
	//*   6   10:ifne            30
		{
			mKeys = ContainerHelpers.EMPTY_INTS;
	//    7   13:aload_0         
	//    8   14:getstatic       #35  <Field int[] ContainerHelpers.EMPTY_INTS>
	//    9   17:putfield        #37  <Field int[] mKeys>
			mValues = ContainerHelpers.EMPTY_OBJECTS;
	//   10   20:aload_0         
	//   11   21:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   12   24:putfield        #42  <Field Object[] mValues>
		} else
	//*  13   27:goto            50
		{
			i = ContainerHelpers.idealIntArraySize(i);
	//   14   30:iload_1         
	//   15   31:invokestatic    #46  <Method int ContainerHelpers.idealIntArraySize(int)>
	//   16   34:istore_1        
			mKeys = new int[i];
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:newarray        int[]
	//   20   39:putfield        #37  <Field int[] mKeys>
			mValues = new Object[i];
	//   21   42:aload_0         
	//   22   43:iload_1         
	//   23   44:anewarray       Object[]
	//   24   47:putfield        #42  <Field Object[] mValues>
		}
		mSize = 0;
	//   25   50:aload_0         
	//   26   51:iconst_0        
	//   27   52:putfield        #48  <Field int mSize>
	//   28   55:return          
	}

	private void gc()
	{
		int l = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mSize>
	//    2    4:istore          4
		int ai[] = mKeys;
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field int[] mKeys>
	//    5   10:astore          5
		Object aobj[] = mValues;
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field Object[] mValues>
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
	//*  23   38:getstatic       #24  <Field Object DELETED>
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
	//   55   83:putfield        #30  <Field boolean mGarbage>
		mSize = j;
	//   56   86:aload_0         
	//   57   87:iload_2         
	//   58   88:putfield        #48  <Field int mSize>
	//   59   91:return          
	}

	public void append(int i, Object obj)
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mSize>
	//    2    4:istore_3        
		if(j != 0 && i <= mKeys[j - 1])
	//*   3    5:iload_3         
	//*   4    6:ifeq            28
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #37  <Field int[] mKeys>
	//*   8   14:iload_3         
	//*   9   15:iconst_1        
	//*  10   16:isub            
	//*  11   17:iaload          
	//*  12   18:icmpgt          28
		{
			put(i, obj);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:aload_2         
	//   16   24:invokevirtual   #54  <Method void put(int, Object)>
			return;
	//   17   27:return          
		}
		if(mGarbage && mSize >= mKeys.length)
	//*  18   28:aload_0         
	//*  19   29:getfield        #30  <Field boolean mGarbage>
	//*  20   32:ifeq            51
	//*  21   35:aload_0         
	//*  22   36:getfield        #48  <Field int mSize>
	//*  23   39:aload_0         
	//*  24   40:getfield        #37  <Field int[] mKeys>
	//*  25   43:arraylength     
	//*  26   44:icmplt          51
			gc();
	//   27   47:aload_0         
	//   28   48:invokespecial   #56  <Method void gc()>
		j = mSize;
	//   29   51:aload_0         
	//   30   52:getfield        #48  <Field int mSize>
	//   31   55:istore_3        
		if(j >= mKeys.length)
	//*  32   56:iload_3         
	//*  33   57:aload_0         
	//*  34   58:getfield        #37  <Field int[] mKeys>
	//*  35   61:arraylength     
	//*  36   62:icmplt          134
		{
			int k = ContainerHelpers.idealIntArraySize(j + 1);
	//   37   65:iload_3         
	//   38   66:iconst_1        
	//   39   67:iadd            
	//   40   68:invokestatic    #46  <Method int ContainerHelpers.idealIntArraySize(int)>
	//   41   71:istore          4
			int ai[] = new int[k];
	//   42   73:iload           4
	//   43   75:newarray        int[]
	//   44   77:astore          5
			Object aobj[] = new Object[k];
	//   45   79:iload           4
	//   46   81:anewarray       Object[]
	//   47   84:astore          6
			int ai1[] = mKeys;
	//   48   86:aload_0         
	//   49   87:getfield        #37  <Field int[] mKeys>
	//   50   90:astore          7
			System.arraycopy(((Object) (ai1)), 0, ((Object) (ai)), 0, ai1.length);
	//   51   92:aload           7
	//   52   94:iconst_0        
	//   53   95:aload           5
	//   54   97:iconst_0        
	//   55   98:aload           7
	//   56  100:arraylength     
	//   57  101:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			ai1 = ((int []) (mValues));
	//   58  104:aload_0         
	//   59  105:getfield        #42  <Field Object[] mValues>
	//   60  108:astore          7
			System.arraycopy(((Object) (ai1)), 0, ((Object) (aobj)), 0, ai1.length);
	//   61  110:aload           7
	//   62  112:iconst_0        
	//   63  113:aload           6
	//   64  115:iconst_0        
	//   65  116:aload           7
	//   66  118:arraylength     
	//   67  119:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			mKeys = ai;
	//   68  122:aload_0         
	//   69  123:aload           5
	//   70  125:putfield        #37  <Field int[] mKeys>
			mValues = aobj;
	//   71  128:aload_0         
	//   72  129:aload           6
	//   73  131:putfield        #42  <Field Object[] mValues>
		}
		mKeys[j] = i;
	//   74  134:aload_0         
	//   75  135:getfield        #37  <Field int[] mKeys>
	//   76  138:iload_3         
	//   77  139:iload_1         
	//   78  140:iastore         
		mValues[j] = obj;
	//   79  141:aload_0         
	//   80  142:getfield        #42  <Field Object[] mValues>
	//   81  145:iload_3         
	//   82  146:aload_2         
	//   83  147:aastore         
		mSize = j + 1;
	//   84  148:aload_0         
	//   85  149:iload_3         
	//   86  150:iconst_1        
	//   87  151:iadd            
	//   88  152:putfield        #48  <Field int mSize>
	//   89  155:return          
	}

	public void clear()
	{
		int j = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mSize>
	//    2    4:istore_2        
		Object aobj[] = mValues;
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field Object[] mValues>
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
	//   22   30:putfield        #48  <Field int mSize>
		mGarbage = false;
	//   23   33:aload_0         
	//   24   34:iconst_0        
	//   25   35:putfield        #30  <Field boolean mGarbage>
	//   26   38:return          
	}

	public SparseArrayCompat clone()
	{
		SparseArrayCompat sparsearraycompat;
		try
		{
			sparsearraycompat = (SparseArrayCompat)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class SparseArrayCompat>
	//    3    7:astore_1        
			sparsearraycompat.mKeys = (int[])((int []) (mKeys)).clone();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field int[] mKeys>
	//    7   13:invokevirtual   #74  <Method Object _5B_I.clone()>
	//    8   16:checkcast       #73  <Class int[]>
	//    9   19:putfield        #37  <Field int[] mKeys>
			sparsearraycompat.mValues = (Object[])((Object []) (mValues)).clone();
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #42  <Field Object[] mValues>
	//   13   27:invokevirtual   #76  <Method Object _5B_Ljava.lang.Object_3B_.clone()>
	//   14   30:checkcast       #75  <Class Object[]>
	//   15   33:putfield        #42  <Field Object[] mValues>
		}
	//*  16   36:aload_1         
	//*  17   37:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  18   38:astore_1        
		{
			throw new AssertionError(((Object) (clonenotsupportedexception)));
	//   19   39:new             #78  <Class AssertionError>
	//   20   42:dup             
	//   21   43:aload_1         
	//   22   44:invokespecial   #81  <Method void AssertionError(Object)>
	//   23   47:athrow          
		}
		return sparsearraycompat;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method SparseArrayCompat clone()>
	//    2    4:areturn         
	}

	public boolean containsKey(int i)
	{
		return indexOfKey(i) >= 0;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #90  <Method int indexOfKey(int)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean containsValue(Object obj)
	{
		return indexOfValue(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #96  <Method int indexOfValue(Object)>
	//    3    5:iflt            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void delete(int i)
	{
		i = ContainerHelpers.binarySearch(mKeys, mSize, i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field int mSize>
	//    4    8:iload_1         
	//    5    9:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//    6   12:istore_1        
		if(i >= 0)
	//*   7   13:iload_1         
	//*   8   14:iflt            47
		{
			Object aobj[] = mValues;
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field Object[] mValues>
	//   11   21:astore_2        
			Object obj = aobj[i];
	//   12   22:aload_2         
	//   13   23:iload_1         
	//   14   24:aaload          
	//   15   25:astore_3        
			Object obj1 = DELETED;
	//   16   26:getstatic       #24  <Field Object DELETED>
	//   17   29:astore          4
			if(obj != obj1)
	//*  18   31:aload_3         
	//*  19   32:aload           4
	//*  20   34:if_acmpeq       47
			{
				aobj[i] = obj1;
	//   21   37:aload_2         
	//   22   38:iload_1         
	//   23   39:aload           4
	//   24   41:aastore         
				mGarbage = true;
	//   25   42:aload_0         
	//   26   43:iconst_1        
	//   27   44:putfield        #30  <Field boolean mGarbage>
			}
		}
	//   28   47:return          
	}

	public Object get(int i)
	{
		return get(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #108 <Method Object get(int, Object)>
	//    4    6:areturn         
	}

	public Object get(int i, Object obj)
	{
		i = ContainerHelpers.binarySearch(mKeys, mSize, i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field int mSize>
	//    4    8:iload_1         
	//    5    9:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//    6   12:istore_1        
		if(i >= 0)
	//*   7   13:iload_1         
	//*   8   14:iflt            37
		{
			Object aobj[] = mValues;
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field Object[] mValues>
	//   11   21:astore_3        
			if(aobj[i] == DELETED)
	//*  12   22:aload_3         
	//*  13   23:iload_1         
	//*  14   24:aaload          
	//*  15   25:getstatic       #24  <Field Object DELETED>
	//*  16   28:if_acmpne       33
				return obj;
	//   17   31:aload_2         
	//   18   32:areturn         
			else
				return aobj[i];
	//   19   33:aload_3         
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:areturn         
		} else
		{
			return obj;
	//   23   37:aload_2         
	//   24   38:areturn         
		}
	}

	public int indexOfKey(int i)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #56  <Method void gc()>
		return ContainerHelpers.binarySearch(mKeys, mSize, i);
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field int[] mKeys>
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field int mSize>
	//    9   19:iload_1         
	//   10   20:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//   11   23:ireturn         
	}

	public int indexOfValue(Object obj)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #56  <Method void gc()>
		for(int i = 0; i < mSize; i++)
	//*   5   11:iconst_0        
	//*   6   12:istore_2        
	//*   7   13:iload_2         
	//*   8   14:aload_0         
	//*   9   15:getfield        #48  <Field int mSize>
	//*  10   18:icmpge          40
			if(mValues[i] == obj)
	//*  11   21:aload_0         
	//*  12   22:getfield        #42  <Field Object[] mValues>
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

	public boolean isEmpty()
	{
		return size() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method int size()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int keyAt(int i)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #56  <Method void gc()>
		return mKeys[i];
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field int[] mKeys>
	//    7   15:iload_1         
	//    8   16:iaload          
	//    9   17:ireturn         
	}

	public void put(int i, Object obj)
	{
		int j = ContainerHelpers.binarySearch(mKeys, mSize, i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field int mSize>
	//    4    8:iload_1         
	//    5    9:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//    6   12:istore_3        
		if(j >= 0)
	//*   7   13:iload_3         
	//*   8   14:iflt            25
		{
			mValues[j] = obj;
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field Object[] mValues>
	//   11   21:iload_3         
	//   12   22:aload_2         
	//   13   23:aastore         
			return;
	//   14   24:return          
		}
		int k = j;
	//   15   25:iload_3         
	//   16   26:istore          4
		if(k < mSize)
	//*  17   28:iload           4
	//*  18   30:aload_0         
	//*  19   31:getfield        #48  <Field int mSize>
	//*  20   34:icmpge          69
		{
			Object aobj[] = mValues;
	//   21   37:aload_0         
	//   22   38:getfield        #42  <Field Object[] mValues>
	//   23   41:astore          6
			if(aobj[k] == DELETED)
	//*  24   43:aload           6
	//*  25   45:iload           4
	//*  26   47:aaload          
	//*  27   48:getstatic       #24  <Field Object DELETED>
	//*  28   51:if_acmpne       69
			{
				mKeys[k] = i;
	//   29   54:aload_0         
	//   30   55:getfield        #37  <Field int[] mKeys>
	//   31   58:iload           4
	//   32   60:iload_1         
	//   33   61:iastore         
				aobj[k] = obj;
	//   34   62:aload           6
	//   35   64:iload           4
	//   36   66:aload_2         
	//   37   67:aastore         
				return;
	//   38   68:return          
			}
		}
		j = k;
	//   39   69:iload           4
	//   40   71:istore_3        
		if(mGarbage)
	//*  41   72:aload_0         
	//*  42   73:getfield        #30  <Field boolean mGarbage>
	//*  43   76:ifeq            111
		{
			j = k;
	//   44   79:iload           4
	//   45   81:istore_3        
			if(mSize >= mKeys.length)
	//*  46   82:aload_0         
	//*  47   83:getfield        #48  <Field int mSize>
	//*  48   86:aload_0         
	//*  49   87:getfield        #37  <Field int[] mKeys>
	//*  50   90:arraylength     
	//*  51   91:icmplt          111
			{
				gc();
	//   52   94:aload_0         
	//   53   95:invokespecial   #56  <Method void gc()>
				j = ContainerHelpers.binarySearch(mKeys, mSize, i);
	//   54   98:aload_0         
	//   55   99:getfield        #37  <Field int[] mKeys>
	//   56  102:aload_0         
	//   57  103:getfield        #48  <Field int mSize>
	//   58  106:iload_1         
	//   59  107:invokestatic    #102 <Method int ContainerHelpers.binarySearch(int[], int, int)>
	//   60  110:istore_3        
			}
		}
		k = mSize;
	//   61  111:aload_0         
	//   62  112:getfield        #48  <Field int mSize>
	//   63  115:istore          4
		if(k >= mKeys.length)
	//*  64  117:iload           4
	//*  65  119:aload_0         
	//*  66  120:getfield        #37  <Field int[] mKeys>
	//*  67  123:arraylength     
	//*  68  124:icmplt          197
		{
			k = ContainerHelpers.idealIntArraySize(k + 1);
	//   69  127:iload           4
	//   70  129:iconst_1        
	//   71  130:iadd            
	//   72  131:invokestatic    #46  <Method int ContainerHelpers.idealIntArraySize(int)>
	//   73  134:istore          4
			int ai[] = new int[k];
	//   74  136:iload           4
	//   75  138:newarray        int[]
	//   76  140:astore          6
			Object aobj1[] = new Object[k];
	//   77  142:iload           4
	//   78  144:anewarray       Object[]
	//   79  147:astore          7
			int ai2[] = mKeys;
	//   80  149:aload_0         
	//   81  150:getfield        #37  <Field int[] mKeys>
	//   82  153:astore          8
			System.arraycopy(((Object) (ai2)), 0, ((Object) (ai)), 0, ai2.length);
	//   83  155:aload           8
	//   84  157:iconst_0        
	//   85  158:aload           6
	//   86  160:iconst_0        
	//   87  161:aload           8
	//   88  163:arraylength     
	//   89  164:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			ai2 = ((int []) (mValues));
	//   90  167:aload_0         
	//   91  168:getfield        #42  <Field Object[] mValues>
	//   92  171:astore          8
			System.arraycopy(((Object) (ai2)), 0, ((Object) (aobj1)), 0, ai2.length);
	//   93  173:aload           8
	//   94  175:iconst_0        
	//   95  176:aload           7
	//   96  178:iconst_0        
	//   97  179:aload           8
	//   98  181:arraylength     
	//   99  182:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			mKeys = ai;
	//  100  185:aload_0         
	//  101  186:aload           6
	//  102  188:putfield        #37  <Field int[] mKeys>
			mValues = aobj1;
	//  103  191:aload_0         
	//  104  192:aload           7
	//  105  194:putfield        #42  <Field Object[] mValues>
		}
		k = mSize;
	//  106  197:aload_0         
	//  107  198:getfield        #48  <Field int mSize>
	//  108  201:istore          4
		if(k - j != 0)
	//* 109  203:iload           4
	//* 110  205:iload_3         
	//* 111  206:isub            
	//* 112  207:ifeq            257
		{
			int ai1[] = mKeys;
	//  113  210:aload_0         
	//  114  211:getfield        #37  <Field int[] mKeys>
	//  115  214:astore          6
			int l = j + 1;
	//  116  216:iload_3         
	//  117  217:iconst_1        
	//  118  218:iadd            
	//  119  219:istore          5
			System.arraycopy(((Object) (ai1)), j, ((Object) (ai1)), l, k - j);
	//  120  221:aload           6
	//  121  223:iload_3         
	//  122  224:aload           6
	//  123  226:iload           5
	//  124  228:iload           4
	//  125  230:iload_3         
	//  126  231:isub            
	//  127  232:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			ai1 = ((int []) (mValues));
	//  128  235:aload_0         
	//  129  236:getfield        #42  <Field Object[] mValues>
	//  130  239:astore          6
			System.arraycopy(((Object) (ai1)), j, ((Object) (ai1)), l, mSize - j);
	//  131  241:aload           6
	//  132  243:iload_3         
	//  133  244:aload           6
	//  134  246:iload           5
	//  135  248:aload_0         
	//  136  249:getfield        #48  <Field int mSize>
	//  137  252:iload_3         
	//  138  253:isub            
	//  139  254:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mKeys[j] = i;
	//  140  257:aload_0         
	//  141  258:getfield        #37  <Field int[] mKeys>
	//  142  261:iload_3         
	//  143  262:iload_1         
	//  144  263:iastore         
		mValues[j] = obj;
	//  145  264:aload_0         
	//  146  265:getfield        #42  <Field Object[] mValues>
	//  147  268:iload_3         
	//  148  269:aload_2         
	//  149  270:aastore         
		mSize = mSize + 1;
	//  150  271:aload_0         
	//  151  272:aload_0         
	//  152  273:getfield        #48  <Field int mSize>
	//  153  276:iconst_1        
	//  154  277:iadd            
	//  155  278:putfield        #48  <Field int mSize>
	//  156  281:return          
	}

	public void putAll(SparseArrayCompat sparsearraycompat)
	{
		int j = sparsearraycompat.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #118 <Method int size()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          33
			put(sparsearraycompat.keyAt(i), sparsearraycompat.valueAt(i));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #124 <Method int keyAt(int)>
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:invokevirtual   #127 <Method Object valueAt(int)>
	//   15   23:invokevirtual   #54  <Method void put(int, Object)>

	//   16   26:iload_2         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_2        
	//*  20   30:goto            7
	//   21   33:return          
	}

	public void remove(int i)
	{
		delete(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #132 <Method void delete(int)>
	//    3    5:return          
	}

	public void removeAt(int i)
	{
		Object aobj[] = mValues;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object[] mValues>
	//    2    4:astore_2        
		Object obj = aobj[i];
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:aaload          
	//    6    8:astore_3        
		Object obj1 = DELETED;
	//    7    9:getstatic       #24  <Field Object DELETED>
	//    8   12:astore          4
		if(obj != obj1)
	//*   9   14:aload_3         
	//*  10   15:aload           4
	//*  11   17:if_acmpeq       30
		{
			aobj[i] = obj1;
	//   12   20:aload_2         
	//   13   21:iload_1         
	//   14   22:aload           4
	//   15   24:aastore         
			mGarbage = true;
	//   16   25:aload_0         
	//   17   26:iconst_1        
	//   18   27:putfield        #30  <Field boolean mGarbage>
		}
	//   19   30:return          
	}

	public void removeAtRange(int i, int j)
	{
		for(j = Math.min(mSize, j + i); i < j; i++)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int mSize>
	//*   2    4:iload_2         
	//*   3    5:iload_1         
	//*   4    6:iadd            
	//*   5    7:invokestatic    #141 <Method int Math.min(int, int)>
	//*   6   10:istore_2        
	//*   7   11:iload_1         
	//*   8   12:iload_2         
	//*   9   13:icmpge          28
			removeAt(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokevirtual   #143 <Method void removeAt(int)>

	//   13   21:iload_1         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:istore_1        
	//*  17   25:goto            11
	//   18   28:return          
	}

	public void setValueAt(int i, Object obj)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #56  <Method void gc()>
		mValues[i] = obj;
	//    5   11:aload_0         
	//    6   12:getfield        #42  <Field Object[] mValues>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:aastore         
	//   10   18:return          
	}

	public int size()
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #56  <Method void gc()>
		return mSize;
	//    5   11:aload_0         
	//    6   12:getfield        #48  <Field int mSize>
	//    7   15:ireturn         
	}

	public String toString()
	{
		if(size() <= 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #118 <Method int size()>
	//*   2    4:ifgt            10
			return "{}";
	//    3    7:ldc1            #148 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 28);
	//    5   10:new             #150 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #48  <Field int mSize>
	//    9   18:bipush          28
	//   10   20:imul            
	//   11   21:invokespecial   #151 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #154 <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		for(int i = 0; i < mSize; i++)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:iload_1         
	//*  20   35:aload_0         
	//*  21   36:getfield        #48  <Field int mSize>
	//*  22   39:icmpge          104
		{
			if(i > 0)
	//*  23   42:iload_1         
	//*  24   43:ifle            53
				stringbuilder.append(", ");
	//   25   46:aload_2         
	//   26   47:ldc1            #156 <String ", ">
	//   27   49:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append(keyAt(i));
	//   29   53:aload_2         
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:invokevirtual   #124 <Method int keyAt(int)>
	//   33   59:invokevirtual   #162 <Method StringBuilder StringBuilder.append(int)>
	//   34   62:pop             
			stringbuilder.append('=');
	//   35   63:aload_2         
	//   36   64:bipush          61
	//   37   66:invokevirtual   #154 <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
			Object obj = valueAt(i);
	//   39   70:aload_0         
	//   40   71:iload_1         
	//   41   72:invokevirtual   #127 <Method Object valueAt(int)>
	//   42   75:astore_3        
			if(obj != this)
	//*  43   76:aload_3         
	//*  44   77:aload_0         
	//*  45   78:if_acmpeq       90
				stringbuilder.append(obj);
	//   46   81:aload_2         
	//   47   82:aload_3         
	//   48   83:invokevirtual   #165 <Method StringBuilder StringBuilder.append(Object)>
	//   49   86:pop             
			else
	//*  50   87:goto            97
				stringbuilder.append("(this Map)");
	//   51   90:aload_2         
	//   52   91:ldc1            #167 <String "(this Map)">
	//   53   93:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
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
	//   62  107:invokevirtual   #154 <Method StringBuilder StringBuilder.append(char)>
	//   63  110:pop             
		return stringbuilder.toString();
	//   64  111:aload_2         
	//   65  112:invokevirtual   #169 <Method String StringBuilder.toString()>
	//   66  115:areturn         
	}

	public Object valueAt(int i)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #56  <Method void gc()>
		return mValues[i];
	//    5   11:aload_0         
	//    6   12:getfield        #42  <Field Object[] mValues>
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
	//    2    4:invokespecial   #22  <Method void Object()>
	//    3    7:putstatic       #24  <Field Object DELETED>
	//*   4   10:return          
	}
}
