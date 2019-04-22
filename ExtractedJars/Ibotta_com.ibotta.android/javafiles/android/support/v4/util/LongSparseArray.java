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
		long al[] = mKeys;
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field long[] mKeys>
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
		for(j = 0; i < l; j = k)
	//*  11   20:iconst_0        
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

	public void append(long l, Object obj)
	{
		int i = mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mSize>
	//    2    4:istore          4
		if(i != 0 && l <= mKeys[i - 1])
	//*   3    6:iload           4
	//*   4    8:ifeq            32
	//*   5   11:lload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #37  <Field long[] mKeys>
	//*   8   16:iload           4
	//*   9   18:iconst_1        
	//*  10   19:isub            
	//*  11   20:laload          
	//*  12   21:lcmp            
	//*  13   22:ifgt            32
		{
			put(l, obj);
	//   14   25:aload_0         
	//   15   26:lload_1         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #54  <Method void put(long, Object)>
			return;
	//   18   31:return          
		}
		if(mGarbage && mSize >= mKeys.length)
	//*  19   32:aload_0         
	//*  20   33:getfield        #30  <Field boolean mGarbage>
	//*  21   36:ifeq            55
	//*  22   39:aload_0         
	//*  23   40:getfield        #48  <Field int mSize>
	//*  24   43:aload_0         
	//*  25   44:getfield        #37  <Field long[] mKeys>
	//*  26   47:arraylength     
	//*  27   48:icmplt          55
			gc();
	//   28   51:aload_0         
	//   29   52:invokespecial   #56  <Method void gc()>
		i = mSize;
	//   30   55:aload_0         
	//   31   56:getfield        #48  <Field int mSize>
	//   32   59:istore          4
		if(i >= mKeys.length)
	//*  33   61:iload           4
	//*  34   63:aload_0         
	//*  35   64:getfield        #37  <Field long[] mKeys>
	//*  36   67:arraylength     
	//*  37   68:icmplt          141
		{
			int j = ContainerHelpers.idealLongArraySize(i + 1);
	//   38   71:iload           4
	//   39   73:iconst_1        
	//   40   74:iadd            
	//   41   75:invokestatic    #46  <Method int ContainerHelpers.idealLongArraySize(int)>
	//   42   78:istore          5
			long al[] = new long[j];
	//   43   80:iload           5
	//   44   82:newarray        long[]
	//   45   84:astore          6
			Object aobj[] = new Object[j];
	//   46   86:iload           5
	//   47   88:anewarray       Object[]
	//   48   91:astore          7
			long al1[] = mKeys;
	//   49   93:aload_0         
	//   50   94:getfield        #37  <Field long[] mKeys>
	//   51   97:astore          8
			System.arraycopy(((Object) (al1)), 0, ((Object) (al)), 0, al1.length);
	//   52   99:aload           8
	//   53  101:iconst_0        
	//   54  102:aload           6
	//   55  104:iconst_0        
	//   56  105:aload           8
	//   57  107:arraylength     
	//   58  108:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			al1 = ((long []) (mValues));
	//   59  111:aload_0         
	//   60  112:getfield        #42  <Field Object[] mValues>
	//   61  115:astore          8
			System.arraycopy(((Object) (al1)), 0, ((Object) (aobj)), 0, al1.length);
	//   62  117:aload           8
	//   63  119:iconst_0        
	//   64  120:aload           7
	//   65  122:iconst_0        
	//   66  123:aload           8
	//   67  125:arraylength     
	//   68  126:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			mKeys = al;
	//   69  129:aload_0         
	//   70  130:aload           6
	//   71  132:putfield        #37  <Field long[] mKeys>
			mValues = aobj;
	//   72  135:aload_0         
	//   73  136:aload           7
	//   74  138:putfield        #42  <Field Object[] mValues>
		}
		mKeys[i] = l;
	//   75  141:aload_0         
	//   76  142:getfield        #37  <Field long[] mKeys>
	//   77  145:iload           4
	//   78  147:lload_1         
	//   79  148:lastore         
		mValues[i] = obj;
	//   80  149:aload_0         
	//   81  150:getfield        #42  <Field Object[] mValues>
	//   82  153:iload           4
	//   83  155:aload_3         
	//   84  156:aastore         
		mSize = i + 1;
	//   85  157:aload_0         
	//   86  158:iload           4
	//   87  160:iconst_1        
	//   88  161:iadd            
	//   89  162:putfield        #48  <Field int mSize>
	//   90  165:return          
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
		LongSparseArray longsparsearray;
		try
		{
			longsparsearray = (LongSparseArray)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class LongSparseArray>
	//    3    7:astore_1        
			longsparsearray.mKeys = (long[])((long []) (mKeys)).clone();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field long[] mKeys>
	//    7   13:invokevirtual   #74  <Method Object _5B_J.clone()>
	//    8   16:checkcast       #73  <Class long[]>
	//    9   19:putfield        #37  <Field long[] mKeys>
			longsparsearray.mValues = (Object[])((Object []) (mValues)).clone();
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
		return longsparsearray;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method LongSparseArray clone()>
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
	//    5    9:invokestatic    #91  <Method int ContainerHelpers.binarySearch(long[], int, long)>
	//    6   12:istore_3        
		if(i >= 0)
	//*   7   13:iload_3         
	//*   8   14:iflt            52
		{
			Object aobj[] = mValues;
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field Object[] mValues>
	//   11   21:astore          4
			Object obj = aobj[i];
	//   12   23:aload           4
	//   13   25:iload_3         
	//   14   26:aaload          
	//   15   27:astore          5
			Object obj1 = DELETED;
	//   16   29:getstatic       #24  <Field Object DELETED>
	//   17   32:astore          6
			if(obj != obj1)
	//*  18   34:aload           5
	//*  19   36:aload           6
	//*  20   38:if_acmpeq       52
			{
				aobj[i] = obj1;
	//   21   41:aload           4
	//   22   43:iload_3         
	//   23   44:aload           6
	//   24   46:aastore         
				mGarbage = true;
	//   25   47:aload_0         
	//   26   48:iconst_1        
	//   27   49:putfield        #30  <Field boolean mGarbage>
			}
		}
	//   28   52:return          
	}

	public Object get(long l)
	{
		return get(l, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #97  <Method Object get(long, Object)>
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
	//    5    9:invokestatic    #91  <Method int ContainerHelpers.binarySearch(long[], int, long)>
	//    6   12:istore          4
		if(i >= 0)
	//*   7   14:iload           4
	//*   8   16:iflt            44
		{
			Object aobj[] = mValues;
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field Object[] mValues>
	//   11   23:astore          5
			if(aobj[i] == DELETED)
	//*  12   25:aload           5
	//*  13   27:iload           4
	//*  14   29:aaload          
	//*  15   30:getstatic       #24  <Field Object DELETED>
	//*  16   33:if_acmpne       38
				return obj;
	//   17   36:aload_3         
	//   18   37:areturn         
			else
				return aobj[i];
	//   19   38:aload           5
	//   20   40:iload           4
	//   21   42:aaload          
	//   22   43:areturn         
		} else
		{
			return obj;
	//   23   44:aload_3         
	//   24   45:areturn         
		}
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
	//   10   20:invokestatic    #91  <Method int ContainerHelpers.binarySearch(long[], int, long)>
	//   11   23:ireturn         
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
	//    5    9:invokestatic    #91  <Method int ContainerHelpers.binarySearch(long[], int, long)>
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
		int j = i;
	//   15   28:iload           4
	//   16   30:istore          5
		if(j < mSize)
	//*  17   32:iload           5
	//*  18   34:aload_0         
	//*  19   35:getfield        #48  <Field int mSize>
	//*  20   38:icmpge          73
		{
			Object aobj[] = mValues;
	//   21   41:aload_0         
	//   22   42:getfield        #42  <Field Object[] mValues>
	//   23   45:astore          7
			if(aobj[j] == DELETED)
	//*  24   47:aload           7
	//*  25   49:iload           5
	//*  26   51:aaload          
	//*  27   52:getstatic       #24  <Field Object DELETED>
	//*  28   55:if_acmpne       73
			{
				mKeys[j] = l;
	//   29   58:aload_0         
	//   30   59:getfield        #37  <Field long[] mKeys>
	//   31   62:iload           5
	//   32   64:lload_1         
	//   33   65:lastore         
				aobj[j] = obj;
	//   34   66:aload           7
	//   35   68:iload           5
	//   36   70:aload_3         
	//   37   71:aastore         
				return;
	//   38   72:return          
			}
		}
		i = j;
	//   39   73:iload           5
	//   40   75:istore          4
		if(mGarbage)
	//*  41   77:aload_0         
	//*  42   78:getfield        #30  <Field boolean mGarbage>
	//*  43   81:ifeq            118
		{
			i = j;
	//   44   84:iload           5
	//   45   86:istore          4
			if(mSize >= mKeys.length)
	//*  46   88:aload_0         
	//*  47   89:getfield        #48  <Field int mSize>
	//*  48   92:aload_0         
	//*  49   93:getfield        #37  <Field long[] mKeys>
	//*  50   96:arraylength     
	//*  51   97:icmplt          118
			{
				gc();
	//   52  100:aload_0         
	//   53  101:invokespecial   #56  <Method void gc()>
				i = ContainerHelpers.binarySearch(mKeys, mSize, l);
	//   54  104:aload_0         
	//   55  105:getfield        #37  <Field long[] mKeys>
	//   56  108:aload_0         
	//   57  109:getfield        #48  <Field int mSize>
	//   58  112:lload_1         
	//   59  113:invokestatic    #91  <Method int ContainerHelpers.binarySearch(long[], int, long)>
	//   60  116:istore          4
			}
		}
		j = mSize;
	//   61  118:aload_0         
	//   62  119:getfield        #48  <Field int mSize>
	//   63  122:istore          5
		if(j >= mKeys.length)
	//*  64  124:iload           5
	//*  65  126:aload_0         
	//*  66  127:getfield        #37  <Field long[] mKeys>
	//*  67  130:arraylength     
	//*  68  131:icmplt          204
		{
			j = ContainerHelpers.idealLongArraySize(j + 1);
	//   69  134:iload           5
	//   70  136:iconst_1        
	//   71  137:iadd            
	//   72  138:invokestatic    #46  <Method int ContainerHelpers.idealLongArraySize(int)>
	//   73  141:istore          5
			long al[] = new long[j];
	//   74  143:iload           5
	//   75  145:newarray        long[]
	//   76  147:astore          7
			Object aobj1[] = new Object[j];
	//   77  149:iload           5
	//   78  151:anewarray       Object[]
	//   79  154:astore          8
			long al2[] = mKeys;
	//   80  156:aload_0         
	//   81  157:getfield        #37  <Field long[] mKeys>
	//   82  160:astore          9
			System.arraycopy(((Object) (al2)), 0, ((Object) (al)), 0, al2.length);
	//   83  162:aload           9
	//   84  164:iconst_0        
	//   85  165:aload           7
	//   86  167:iconst_0        
	//   87  168:aload           9
	//   88  170:arraylength     
	//   89  171:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			al2 = ((long []) (mValues));
	//   90  174:aload_0         
	//   91  175:getfield        #42  <Field Object[] mValues>
	//   92  178:astore          9
			System.arraycopy(((Object) (al2)), 0, ((Object) (aobj1)), 0, al2.length);
	//   93  180:aload           9
	//   94  182:iconst_0        
	//   95  183:aload           8
	//   96  185:iconst_0        
	//   97  186:aload           9
	//   98  188:arraylength     
	//   99  189:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			mKeys = al;
	//  100  192:aload_0         
	//  101  193:aload           7
	//  102  195:putfield        #37  <Field long[] mKeys>
			mValues = aobj1;
	//  103  198:aload_0         
	//  104  199:aload           8
	//  105  201:putfield        #42  <Field Object[] mValues>
		}
		j = mSize;
	//  106  204:aload_0         
	//  107  205:getfield        #48  <Field int mSize>
	//  108  208:istore          5
		if(j - i != 0)
	//* 109  210:iload           5
	//* 110  212:iload           4
	//* 111  214:isub            
	//* 112  215:ifeq            270
		{
			long al1[] = mKeys;
	//  113  218:aload_0         
	//  114  219:getfield        #37  <Field long[] mKeys>
	//  115  222:astore          7
			int k = i + 1;
	//  116  224:iload           4
	//  117  226:iconst_1        
	//  118  227:iadd            
	//  119  228:istore          6
			System.arraycopy(((Object) (al1)), i, ((Object) (al1)), k, j - i);
	//  120  230:aload           7
	//  121  232:iload           4
	//  122  234:aload           7
	//  123  236:iload           6
	//  124  238:iload           5
	//  125  240:iload           4
	//  126  242:isub            
	//  127  243:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
			al1 = ((long []) (mValues));
	//  128  246:aload_0         
	//  129  247:getfield        #42  <Field Object[] mValues>
	//  130  250:astore          7
			System.arraycopy(((Object) (al1)), i, ((Object) (al1)), k, mSize - i);
	//  131  252:aload           7
	//  132  254:iload           4
	//  133  256:aload           7
	//  134  258:iload           6
	//  135  260:aload_0         
	//  136  261:getfield        #48  <Field int mSize>
	//  137  264:iload           4
	//  138  266:isub            
	//  139  267:invokestatic    #62  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		mKeys[i] = l;
	//  140  270:aload_0         
	//  141  271:getfield        #37  <Field long[] mKeys>
	//  142  274:iload           4
	//  143  276:lload_1         
	//  144  277:lastore         
		mValues[i] = obj;
	//  145  278:aload_0         
	//  146  279:getfield        #42  <Field Object[] mValues>
	//  147  282:iload           4
	//  148  284:aload_3         
	//  149  285:aastore         
		mSize = mSize + 1;
	//  150  286:aload_0         
	//  151  287:aload_0         
	//  152  288:getfield        #48  <Field int mSize>
	//  153  291:iconst_1        
	//  154  292:iadd            
	//  155  293:putfield        #48  <Field int mSize>
	//  156  296:return          
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
	//*   1    1:invokevirtual   #111 <Method int size()>
	//*   2    4:ifgt            10
			return "{}";
	//    3    7:ldc1            #113 <String "{}">
	//    4    9:areturn         
		StringBuilder stringbuilder = new StringBuilder(mSize * 28);
	//    5   10:new             #115 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #48  <Field int mSize>
	//    9   18:bipush          28
	//   10   20:imul            
	//   11   21:invokespecial   #116 <Method void StringBuilder(int)>
	//   12   24:astore_2        
		stringbuilder.append('{');
	//   13   25:aload_2         
	//   14   26:bipush          123
	//   15   28:invokevirtual   #119 <Method StringBuilder StringBuilder.append(char)>
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
	//   26   47:ldc1            #121 <String ", ">
	//   27   49:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			stringbuilder.append(keyAt(i));
	//   29   53:aload_2         
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:invokevirtual   #126 <Method long keyAt(int)>
	//   33   59:invokevirtual   #129 <Method StringBuilder StringBuilder.append(long)>
	//   34   62:pop             
			stringbuilder.append('=');
	//   35   63:aload_2         
	//   36   64:bipush          61
	//   37   66:invokevirtual   #119 <Method StringBuilder StringBuilder.append(char)>
	//   38   69:pop             
			Object obj = valueAt(i);
	//   39   70:aload_0         
	//   40   71:iload_1         
	//   41   72:invokevirtual   #133 <Method Object valueAt(int)>
	//   42   75:astore_3        
			if(obj != this)
	//*  43   76:aload_3         
	//*  44   77:aload_0         
	//*  45   78:if_acmpeq       90
				stringbuilder.append(obj);
	//   46   81:aload_2         
	//   47   82:aload_3         
	//   48   83:invokevirtual   #136 <Method StringBuilder StringBuilder.append(Object)>
	//   49   86:pop             
			else
	//*  50   87:goto            97
				stringbuilder.append("(this Map)");
	//   51   90:aload_2         
	//   52   91:ldc1            #138 <String "(this Map)">
	//   53   93:invokevirtual   #124 <Method StringBuilder StringBuilder.append(String)>
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
	//   62  107:invokevirtual   #119 <Method StringBuilder StringBuilder.append(char)>
	//   63  110:pop             
		return stringbuilder.toString();
	//   64  111:aload_2         
	//   65  112:invokevirtual   #140 <Method String StringBuilder.toString()>
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
