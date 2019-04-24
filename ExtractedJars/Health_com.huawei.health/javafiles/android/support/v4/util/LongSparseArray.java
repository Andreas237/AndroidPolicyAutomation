// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//			ContainerHelpers

public class LongSparseArray
	implements Cloneable
{

	public LongSparseArray()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #28  <Method void LongSparseArray(int)>
	//    3    6:return          
	}

	public LongSparseArray(int i)
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
			mKeys = ContainerHelpers.EMPTY_LONGS;
	//    7   13:aload_0         
	//    8   14:getstatic       #35  <Field long[] ContainerHelpers.EMPTY_LONGS>
	//    9   17:putfield        #37  <Field long[] mKeys>
			mValues = ContainerHelpers.EMPTY_OBJECTS;
	//   10   20:aload_0         
	//   11   21:getstatic       #40  <Field Object[] ContainerHelpers.EMPTY_OBJECTS>
	//   12   24:putfield        #42  <Field Object[] mValues>
		} else
	//*  13   27:goto            50
		{
			i = ContainerHelpers.idealLongArraySize(i);
	//   14   30:iload_1         
	//   15   31:invokestatic    #46  <Method int ContainerHelpers.idealLongArraySize(int)>
	//   16   34:istore_1        
			mKeys = new long[i];
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:newarray        long[]
	//   20   39:putfield        #37  <Field long[] mKeys>
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
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		long al[] = mKeys;
	//    5    8:aload_0         
	//    6    9:getfield        #37  <Field long[] mKeys>
	//    7   12:astore          5
		Object aobj[] = mValues;
	//    8   14:aload_0         
	//    9   15:getfield        #42  <Field Object[] mValues>
	//   10   18:astore          6
		for(int i = 0; i < l;)
	//*  11   20:iconst_0        
	//*  12   21:istore_1        
	//*  13   22:iload_1         
	//*  14   23:iload           4
	//*  15   25:icmpge          81
		{
			Object obj = aobj[i];
	//   16   28:aload           6
	//   17   30:iload_1         
	//   18   31:aaload          
	//   19   32:astore          7
			int k = j;
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
					al[j] = al[i];
	//   28   49:aload           5
	//   29   51:iload_2         
	//   30   52:aload           5
	//   31   54:iload_1         
	//   32   55:laload          
	//   33   56:lastore         
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
			j = k;
	//   50   76:iload_3         
	//   51   77:istore_2        
		}

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

	public void append(long l, Object obj)
	{
		if(mSize != 0 && l <= mKeys[mSize - 1])
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int mSize>
	//*   2    4:ifeq            30
	//*   3    7:lload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #37  <Field long[] mKeys>
	//*   6   12:aload_0         
	//*   7   13:getfield        #48  <Field int mSize>
	//*   8   16:iconst_1        
	//*   9   17:isub            
	//*  10   18:laload          
	//*  11   19:lcmp            
	//*  12   20:ifgt            30
		{
			put(l, obj);
	//   13   23:aload_0         
	//   14   24:lload_1         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #54  <Method void put(long, Object)>
			return;
	//   17   29:return          
		}
		if(mGarbage && mSize >= mKeys.length)
	//*  18   30:aload_0         
	//*  19   31:getfield        #30  <Field boolean mGarbage>
	//*  20   34:ifeq            53
	//*  21   37:aload_0         
	//*  22   38:getfield        #48  <Field int mSize>
	//*  23   41:aload_0         
	//*  24   42:getfield        #37  <Field long[] mKeys>
	//*  25   45:arraylength     
	//*  26   46:icmplt          53
			gc();
	//   27   49:aload_0         
	//   28   50:invokespecial   #56  <Method void gc()>
		int i = mSize;
	//   29   53:aload_0         
	//   30   54:getfield        #48  <Field int mSize>
	//   31   57:istore          4
		if(i >= mKeys.length)
	//*  32   59:iload           4
	//*  33   61:aload_0         
	//*  34   62:getfield        #37  <Field long[] mKeys>
	//*  35   65:arraylength     
	//*  36   66:icmplt          135
		{
			int j = ContainerHelpers.idealLongArraySize(i + 1);
	//   37   69:iload           4
	//   38   71:iconst_1        
	//   39   72:iadd            
	//   40   73:invokestatic    #46  <Method int ContainerHelpers.idealLongArraySize(int)>
	//   41   76:istore          5
			long al[] = new long[j];
	//   42   78:iload           5
	//   43   80:newarray        long[]
	//   44   82:astore          6
			Object aobj[] = new Object[j];
	//   45   84:iload           5
	//   46   86:anewarray       Object[]
	//   47   89:astore          7
			System.arraycopy(((Object) (mKeys)), 0, ((Object) (al)), 0, mKeys.length);
	//   48   91:aload_0         
	//   49   92:getfield        #37  <Field long[] mKeys>
	//   50   95:iconst_0        
	//   51   96:aload           6
	//   52   98:iconst_0        
	//   53   99:aload_0         
	//   54  100:getfield        #37  <Field long[] mKeys>
	//   55  103:arraylength     
	//   56  104:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mValues)), 0, ((Object) (aobj)), 0, mValues.length);
	//   57  107:aload_0         
	//   58  108:getfield        #42  <Field Object[] mValues>
	//   59  111:iconst_0        
	//   60  112:aload           7
	//   61  114:iconst_0        
	//   62  115:aload_0         
	//   63  116:getfield        #42  <Field Object[] mValues>
	//   64  119:arraylength     
	//   65  120:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			mKeys = al;
	//   66  123:aload_0         
	//   67  124:aload           6
	//   68  126:putfield        #37  <Field long[] mKeys>
			mValues = aobj;
	//   69  129:aload_0         
	//   70  130:aload           7
	//   71  132:putfield        #42  <Field Object[] mValues>
		}
		mKeys[i] = l;
	//   72  135:aload_0         
	//   73  136:getfield        #37  <Field long[] mKeys>
	//   74  139:iload           4
	//   75  141:lload_1         
	//   76  142:lastore         
		mValues[i] = obj;
	//   77  143:aload_0         
	//   78  144:getfield        #42  <Field Object[] mValues>
	//   79  147:iload           4
	//   80  149:aload_3         
	//   81  150:aastore         
		mSize = i + 1;
	//   82  151:aload_0         
	//   83  152:iload           4
	//   84  154:iconst_1        
	//   85  155:iadd            
	//   86  156:putfield        #48  <Field int mSize>
	//   87  159:return          
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

	public LongSparseArray clone()
	{
		LongSparseArray longsparsearray = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		LongSparseArray longsparsearray1;
		try
		{
			longsparsearray1 = (LongSparseArray)super.clone();
	//    2    2:aload_0         
	//    3    3:invokespecial   #72  <Method Object Object.clone()>
	//    4    6:checkcast       #2   <Class LongSparseArray>
	//    5    9:astore_2        
		}
	//*   6   10:aload_2         
	//*   7   11:astore_1        
	//*   8   12:aload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #37  <Field long[] mKeys>
	//*  11   17:invokevirtual   #74  <Method Object _5B_J.clone()>
	//*  12   20:checkcast       #73  <Class long[]>
	//*  13   23:putfield        #37  <Field long[] mKeys>
	//*  14   26:aload_2         
	//*  15   27:astore_1        
	//*  16   28:aload_2         
	//*  17   29:aload_0         
	//*  18   30:getfield        #42  <Field Object[] mValues>
	//*  19   33:invokevirtual   #76  <Method Object _5B_Ljava.lang.Object_3B_.clone()>
	//*  20   36:checkcast       #75  <Class Object[]>
	//*  21   39:putfield        #42  <Field Object[] mValues>
	//*  22   42:aload_2         
	//*  23   43:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  24   44:astore_2        
		{
			return longsparsearray;
	//   25   45:aload_1         
	//   26   46:areturn         
		}
		longsparsearray = longsparsearray1;
		longsparsearray1.mKeys = (long[])((long []) (mKeys)).clone();
		longsparsearray = longsparsearray1;
		longsparsearray1.mValues = (Object[])((Object []) (mValues)).clone();
		return longsparsearray1;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method LongSparseArray clone()>
	//    2    4:areturn         
	}

	public void delete(long l)
	{
		int i = ContainerHelpers.binarySearch(mKeys, mSize, l);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field int mSize>
	//    4    8:lload_1         
	//    5    9:invokestatic    #86  <Method int ContainerHelpers.binarySearch(long[], int, long)>
	//    6   12:istore_3        
		if(i >= 0 && mValues[i] != DELETED)
	//*   7   13:iload_3         
	//*   8   14:iflt            43
	//*   9   17:aload_0         
	//*  10   18:getfield        #42  <Field Object[] mValues>
	//*  11   21:iload_3         
	//*  12   22:aaload          
	//*  13   23:getstatic       #24  <Field Object DELETED>
	//*  14   26:if_acmpeq       43
		{
			mValues[i] = DELETED;
	//   15   29:aload_0         
	//   16   30:getfield        #42  <Field Object[] mValues>
	//   17   33:iload_3         
	//   18   34:getstatic       #24  <Field Object DELETED>
	//   19   37:aastore         
			mGarbage = true;
	//   20   38:aload_0         
	//   21   39:iconst_1        
	//   22   40:putfield        #30  <Field boolean mGarbage>
		}
	//   23   43:return          
	}

	public Object get(long l)
	{
		return get(l, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #91  <Method Object get(long, Object)>
	//    4    6:areturn         
	}

	public Object get(long l, Object obj)
	{
		int i = ContainerHelpers.binarySearch(mKeys, mSize, l);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field int mSize>
	//    4    8:lload_1         
	//    5    9:invokestatic    #86  <Method int ContainerHelpers.binarySearch(long[], int, long)>
	//    6   12:istore          4
		if(i < 0 || mValues[i] == DELETED)
	//*   7   14:iload           4
	//*   8   16:iflt            32
	//*   9   19:aload_0         
	//*  10   20:getfield        #42  <Field Object[] mValues>
	//*  11   23:iload           4
	//*  12   25:aaload          
	//*  13   26:getstatic       #24  <Field Object DELETED>
	//*  14   29:if_acmpne       34
			return obj;
	//   15   32:aload_3         
	//   16   33:areturn         
		else
			return mValues[i];
	//   17   34:aload_0         
	//   18   35:getfield        #42  <Field Object[] mValues>
	//   19   38:iload           4
	//   20   40:aaload          
	//   21   41:areturn         
	}

	public int indexOfKey(long l)
	{
		if(mGarbage)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean mGarbage>
	//*   2    4:ifeq            11
			gc();
	//    3    7:aload_0         
	//    4    8:invokespecial   #56  <Method void gc()>
		return ContainerHelpers.binarySearch(mKeys, mSize, l);
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field long[] mKeys>
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field int mSize>
	//    9   19:lload_1         
	//   10   20:invokestatic    #86  <Method int ContainerHelpers.binarySearch(long[], int, long)>
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

	public long keyAt(int i)
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
	//    6   12:getfield        #37  <Field long[] mKeys>
	//    7   15:iload_1         
	//    8   16:laload          
	//    9   17:lreturn         
	}

	public void put(long l, Object obj)
	{
		int i = ContainerHelpers.binarySearch(mKeys, mSize, l);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long[] mKeys>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field int mSize>
	//    4    8:lload_1         
	//    5    9:invokestatic    #86  <Method int ContainerHelpers.binarySearch(long[], int, long)>
	//    6   12:istore          4
		if(i >= 0)
	//*   7   14:iload           4
	//*   8   16:iflt            28
		{
			mValues[i] = obj;
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field Object[] mValues>
	//   11   23:iload           4
	//   12   25:aload_3         
	//   13   26:aastore         
			return;
	//   14   27:return          
		}
		int j = ~i;
	//   15   28:iload           4
	//   16   30:iconst_m1       
	//   17   31:ixor            
	//   18   32:istore          5
		if(j < mSize && mValues[j] == DELETED)
	//*  19   34:iload           5
	//*  20   36:aload_0         
	//*  21   37:getfield        #48  <Field int mSize>
	//*  22   40:icmpge          73
	//*  23   43:aload_0         
	//*  24   44:getfield        #42  <Field Object[] mValues>
	//*  25   47:iload           5
	//*  26   49:aaload          
	//*  27   50:getstatic       #24  <Field Object DELETED>
	//*  28   53:if_acmpne       73
		{
			mKeys[j] = l;
	//   29   56:aload_0         
	//   30   57:getfield        #37  <Field long[] mKeys>
	//   31   60:iload           5
	//   32   62:lload_1         
	//   33   63:lastore         
			mValues[j] = obj;
	//   34   64:aload_0         
	//   35   65:getfield        #42  <Field Object[] mValues>
	//   36   68:iload           5
	//   37   70:aload_3         
	//   38   71:aastore         
			return;
	//   39   72:return          
		}
		i = j;
	//   40   73:iload           5
	//   41   75:istore          4
		if(mGarbage)
	//*  42   77:aload_0         
	//*  43   78:getfield        #30  <Field boolean mGarbage>
	//*  44   81:ifeq            120
		{
			i = j;
	//   45   84:iload           5
	//   46   86:istore          4
			if(mSize >= mKeys.length)
	//*  47   88:aload_0         
	//*  48   89:getfield        #48  <Field int mSize>
	//*  49   92:aload_0         
	//*  50   93:getfield        #37  <Field long[] mKeys>
	//*  51   96:arraylength     
	//*  52   97:icmplt          120
			{
				gc();
	//   53  100:aload_0         
	//   54  101:invokespecial   #56  <Method void gc()>
				i = ~ContainerHelpers.binarySearch(mKeys, mSize, l);
	//   55  104:aload_0         
	//   56  105:getfield        #37  <Field long[] mKeys>
	//   57  108:aload_0         
	//   58  109:getfield        #48  <Field int mSize>
	//   59  112:lload_1         
	//   60  113:invokestatic    #86  <Method int ContainerHelpers.binarySearch(long[], int, long)>
	//   61  116:iconst_m1       
	//   62  117:ixor            
	//   63  118:istore          4
			}
		}
		if(mSize >= mKeys.length)
	//*  64  120:aload_0         
	//*  65  121:getfield        #48  <Field int mSize>
	//*  66  124:aload_0         
	//*  67  125:getfield        #37  <Field long[] mKeys>
	//*  68  128:arraylength     
	//*  69  129:icmplt          200
		{
			int k = ContainerHelpers.idealLongArraySize(mSize + 1);
	//   70  132:aload_0         
	//   71  133:getfield        #48  <Field int mSize>
	//   72  136:iconst_1        
	//   73  137:iadd            
	//   74  138:invokestatic    #46  <Method int ContainerHelpers.idealLongArraySize(int)>
	//   75  141:istore          5
			long al[] = new long[k];
	//   76  143:iload           5
	//   77  145:newarray        long[]
	//   78  147:astore          6
			Object aobj[] = new Object[k];
	//   79  149:iload           5
	//   80  151:anewarray       Object[]
	//   81  154:astore          7
			System.arraycopy(((Object) (mKeys)), 0, ((Object) (al)), 0, mKeys.length);
	//   82  156:aload_0         
	//   83  157:getfield        #37  <Field long[] mKeys>
	//   84  160:iconst_0        
	//   85  161:aload           6
	//   86  163:iconst_0        
	//   87  164:aload_0         
	//   88  165:getfield        #37  <Field long[] mKeys>
	//   89  168:arraylength     
	//   90  169:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mValues)), 0, ((Object) (aobj)), 0, mValues.length);
	//   91  172:aload_0         
	//   92  173:getfield        #42  <Field Object[] mValues>
	//   93  176:iconst_0        
	//   94  177:aload           7
	//   95  179:iconst_0        
	//   96  180:aload_0         
	//   97  181:getfield        #42  <Field Object[] mValues>
	//   98  184:arraylength     
	//   99  185:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			mKeys = al;
	//  100  188:aload_0         
	//  101  189:aload           6
	//  102  191:putfield        #37  <Field long[] mKeys>
			mValues = aobj;
	//  103  194:aload_0         
	//  104  195:aload           7
	//  105  197:putfield        #42  <Field Object[] mValues>
		}
		if(mSize - i != 0)
	//* 106  200:aload_0         
	//* 107  201:getfield        #48  <Field int mSize>
	//* 108  204:iload           4
	//* 109  206:isub            
	//* 110  207:ifeq            258
		{
			System.arraycopy(((Object) (mKeys)), i, ((Object) (mKeys)), i + 1, mSize - i);
	//  111  210:aload_0         
	//  112  211:getfield        #37  <Field long[] mKeys>
	//  113  214:iload           4
	//  114  216:aload_0         
	//  115  217:getfield        #37  <Field long[] mKeys>
	//  116  220:iload           4
	//  117  222:iconst_1        
	//  118  223:iadd            
	//  119  224:aload_0         
	//  120  225:getfield        #48  <Field int mSize>
	//  121  228:iload           4
	//  122  230:isub            
	//  123  231:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (mValues)), i, ((Object) (mValues)), i + 1, mSize - i);
	//  124  234:aload_0         
	//  125  235:getfield        #42  <Field Object[] mValues>
	//  126  238:iload           4
	//  127  240:aload_0         
	//  128  241:getfield        #42  <Field Object[] mValues>
	//  129  244:iload           4
	//  130  246:iconst_1        
	//  131  247:iadd            
	//  132  248:aload_0         
	//  133  249:getfield        #48  <Field int mSize>
	//  134  252:iload           4
	//  135  254:isub            
	//  136  255:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mKeys[i] = l;
	//  137  258:aload_0         
	//  138  259:getfield        #37  <Field long[] mKeys>
	//  139  262:iload           4
	//  140  264:lload_1         
	//  141  265:lastore         
		mValues[i] = obj;
	//  142  266:aload_0         
	//  143  267:getfield        #42  <Field Object[] mValues>
	//  144  270:iload           4
	//  145  272:aload_3         
	//  146  273:aastore         
		mSize = mSize + 1;
	//  147  274:aload_0         
	//  148  275:aload_0         
	//  149  276:getfield        #48  <Field int mSize>
	//  150  279:iconst_1        
	//  151  280:iadd            
	//  152  281:putfield        #48  <Field int mSize>
	//  153  284:return          
	}

	public void remove(long l)
	{
		delete(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #103 <Method void delete(long)>
	//    3    5:return          
	}

	public void removeAt(int i)
	{
		if(mValues[i] != DELETED)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Object[] mValues>
	//*   2    4:iload_1         
	//*   3    5:aaload          
	//*   4    6:getstatic       #24  <Field Object DELETED>
	//*   5    9:if_acmpeq       26
		{
			mValues[i] = DELETED;
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field Object[] mValues>
	//    8   16:iload_1         
	//    9   17:getstatic       #24  <Field Object DELETED>
	//   10   20:aastore         
			mGarbage = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #30  <Field boolean mGarbage>
		}
	//   14   26:return          
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
	//*   1    1:invokevirtual   #113 <Method int size()>
	//*   2    4:ifgt            10
			return "{}";
	//    3    7:ldc1            #115 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 28);
	//    5   10:new             #117 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #48  <Field int mSize>
	//    9   18:bipush          28
	//   10   20:imul            
	//   11   21:invokespecial   #118 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #121 <Method StringBuilder StringBuilder.append(char)>
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
	//   26   47:ldc1            #123 <String ", ">
	//   27   49:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append(keyAt(i));
	//   29   53:aload_2         
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:invokevirtual   #128 <Method long keyAt(int)>
	//   33   59:invokevirtual   #131 <Method StringBuilder StringBuilder.append(long)>
	//   34   62:pop             
			stringbuilder.append('=');
	//   35   63:aload_2         
	//   36   64:bipush          61
	//   37   66:invokevirtual   #121 <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
			Object obj = valueAt(i);
	//   39   70:aload_0         
	//   40   71:iload_1         
	//   41   72:invokevirtual   #135 <Method Object valueAt(int)>
	//   42   75:astore_3        
			if(obj != this)
	//*  43   76:aload_3         
	//*  44   77:aload_0         
	//*  45   78:if_acmpeq       90
				stringbuilder.append(obj);
	//   46   81:aload_2         
	//   47   82:aload_3         
	//   48   83:invokevirtual   #138 <Method StringBuilder StringBuilder.append(Object)>
	//   49   86:pop             
			else
	//*  50   87:goto            97
				stringbuilder.append("(this Map)");
	//   51   90:aload_2         
	//   52   91:ldc1            #140 <String "(this Map)">
	//   53   93:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
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
	//   62  107:invokevirtual   #121 <Method StringBuilder StringBuilder.append(char)>
	//   63  110:pop             
		return stringbuilder.toString();
	//   64  111:aload_2         
	//   65  112:invokevirtual   #142 <Method String StringBuilder.toString()>
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
	private long mKeys[];
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
