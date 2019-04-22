// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteProgram;
import android.arch.persistence.db.SupportSQLiteQuery;
import java.util.*;

public class RoomSQLiteQuery
	implements SupportSQLiteProgram, SupportSQLiteQuery
{

	private RoomSQLiteQuery(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		mCapacity = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #45  <Field int mCapacity>
		i++;
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:istore_1        
		mBindingTypes = new int[i];
	//    9   13:aload_0         
	//   10   14:iload_1         
	//   11   15:newarray        int[]
	//   12   17:putfield        #47  <Field int[] mBindingTypes>
		mLongBindings = new long[i];
	//   13   20:aload_0         
	//   14   21:iload_1         
	//   15   22:newarray        long[]
	//   16   24:putfield        #49  <Field long[] mLongBindings>
		mDoubleBindings = new double[i];
	//   17   27:aload_0         
	//   18   28:iload_1         
	//   19   29:newarray        double[]
	//   20   31:putfield        #51  <Field double[] mDoubleBindings>
		mStringBindings = new String[i];
	//   21   34:aload_0         
	//   22   35:iload_1         
	//   23   36:anewarray       String[]
	//   24   39:putfield        #55  <Field String[] mStringBindings>
		mBlobBindings = new byte[i][];
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:anewarray       byte[][]
	//   28   47:putfield        #59  <Field byte[][] mBlobBindings>
	//   29   50:return          
	}

	public static RoomSQLiteQuery acquire(String s, int i)
	{
		Object obj = ((Object) (sQueryPool));
	//    0    0:getstatic       #40  <Field TreeMap sQueryPool>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Object obj1 = ((Object) (sQueryPool.ceilingEntry(((Object) (Integer.valueOf(i))))));
	//    4    6:getstatic       #40  <Field TreeMap sQueryPool>
	//    5    9:iload_1         
	//    6   10:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//    7   13:invokevirtual   #71  <Method java.util.Map$Entry TreeMap.ceilingEntry(Object)>
	//    8   16:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_54;
	//    9   17:aload_3         
	//   10   18:ifnull          54
		sQueryPool.remove(((java.util.Map.Entry) (obj1)).getKey());
	//   11   21:getstatic       #40  <Field TreeMap sQueryPool>
	//   12   24:aload_3         
	//   13   25:invokeinterface #77  <Method Object java.util.Map$Entry.getKey()>
	//   14   30:invokevirtual   #81  <Method Object TreeMap.remove(Object)>
	//   15   33:pop             
		obj1 = ((Object) ((RoomSQLiteQuery)((java.util.Map.Entry) (obj1)).getValue()));
	//   16   34:aload_3         
	//   17   35:invokeinterface #84  <Method Object java.util.Map$Entry.getValue()>
	//   18   40:checkcast       #2   <Class RoomSQLiteQuery>
	//   19   43:astore_3        
		((RoomSQLiteQuery) (obj1)).init(s, i);
	//   20   44:aload_3         
	//   21   45:aload_0         
	//   22   46:iload_1         
	//   23   47:invokevirtual   #88  <Method void init(String, int)>
		obj;
	//   24   50:aload_2         
		JVM INSTR monitorexit ;
	//   25   51:monitorexit     
		return ((RoomSQLiteQuery) (obj1));
	//   26   52:aload_3         
	//   27   53:areturn         
		obj;
	//   28   54:aload_2         
		JVM INSTR monitorexit ;
	//   29   55:monitorexit     
		obj = ((Object) (new RoomSQLiteQuery(i)));
	//   30   56:new             #2   <Class RoomSQLiteQuery>
	//   31   59:dup             
	//   32   60:iload_1         
	//   33   61:invokespecial   #90  <Method void RoomSQLiteQuery(int)>
	//   34   64:astore_2        
		((RoomSQLiteQuery) (obj)).init(s, i);
	//   35   65:aload_2         
	//   36   66:aload_0         
	//   37   67:iload_1         
	//   38   68:invokevirtual   #88  <Method void init(String, int)>
		return ((RoomSQLiteQuery) (obj));
	//   39   71:aload_2         
	//   40   72:areturn         
		s;
	//   41   73:astore_0        
		obj;
	//   42   74:aload_2         
		JVM INSTR monitorexit ;
	//   43   75:monitorexit     
		throw s;
	//   44   76:aload_0         
	//   45   77:athrow          
	}

	private static void prunePoolLocked()
	{
		if(sQueryPool.size() > 15)
	//*   0    0:getstatic       #40  <Field TreeMap sQueryPool>
	//*   1    3:invokevirtual   #95  <Method int TreeMap.size()>
	//*   2    6:bipush          15
	//*   3    8:icmple          57
		{
			int i = sQueryPool.size() - 10;
	//    4   11:getstatic       #40  <Field TreeMap sQueryPool>
	//    5   14:invokevirtual   #95  <Method int TreeMap.size()>
	//    6   17:bipush          10
	//    7   19:isub            
	//    8   20:istore_0        
			Iterator iterator = sQueryPool.descendingKeySet().iterator();
	//    9   21:getstatic       #40  <Field TreeMap sQueryPool>
	//   10   24:invokevirtual   #99  <Method NavigableSet TreeMap.descendingKeySet()>
	//   11   27:invokeinterface #105 <Method Iterator NavigableSet.iterator()>
	//   12   32:astore_1        
			for(; i > 0; i--)
	//*  13   33:iload_0         
	//*  14   34:ifle            57
			{
				iterator.next();
	//   15   37:aload_1         
	//   16   38:invokeinterface #110 <Method Object Iterator.next()>
	//   17   43:pop             
				iterator.remove();
	//   18   44:aload_1         
	//   19   45:invokeinterface #112 <Method void Iterator.remove()>
			}

	//   20   50:iload_0         
	//   21   51:iconst_1        
	//   22   52:isub            
	//   23   53:istore_0        
		}
	//*  24   54:goto            33
	//   25   57:return          
	}

	public void bindBlob(int i, byte abyte0[])
	{
		mBindingTypes[i] = 5;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_5        
	//    4    6:iastore         
		mBlobBindings[i] = abyte0;
	//    5    7:aload_0         
	//    6    8:getfield        #59  <Field byte[][] mBlobBindings>
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aastore         
	//   10   14:return          
	}

	public void bindDouble(int i, double d)
	{
		mBindingTypes[i] = 3;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_3        
	//    4    6:iastore         
		mDoubleBindings[i] = d;
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field double[] mDoubleBindings>
	//    7   11:iload_1         
	//    8   12:dload_2         
	//    9   13:dastore         
	//   10   14:return          
	}

	public void bindLong(int i, long l)
	{
		mBindingTypes[i] = 2;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_2        
	//    4    6:iastore         
		mLongBindings[i] = l;
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field long[] mLongBindings>
	//    7   11:iload_1         
	//    8   12:lload_2         
	//    9   13:lastore         
	//   10   14:return          
	}

	public void bindNull(int i)
	{
		mBindingTypes[i] = 1;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:iastore         
	//    5    7:return          
	}

	public void bindString(int i, String s)
	{
		mBindingTypes[i] = 4;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_4        
	//    4    6:iastore         
		mStringBindings[i] = s;
	//    5    7:aload_0         
	//    6    8:getfield        #55  <Field String[] mStringBindings>
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aastore         
	//   10   14:return          
	}

	public void bindTo(SupportSQLiteProgram supportsqliteprogram)
	{
		for(int i = 1; i <= mArgCount; i++)
	//*   0    0:iconst_1        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #125 <Field int mArgCount>
	//*   5    7:icmpgt          133
			switch(mBindingTypes[i])
	//*   6   10:aload_0         
	//*   7   11:getfield        #47  <Field int[] mBindingTypes>
	//*   8   14:iload_2         
	//*   9   15:iaload          
			{
	//*  10   16:tableswitch     1 5: default 52
	//	               1 119
	//	               2 103
	//	               3 87
	//	               4 71
	//	               5 55
	//*  11   52:goto            126
			case 5: // '\005'
				supportsqliteprogram.bindBlob(i, mBlobBindings[i]);
	//   12   55:aload_1         
	//   13   56:iload_2         
	//   14   57:aload_0         
	//   15   58:getfield        #59  <Field byte[][] mBlobBindings>
	//   16   61:iload_2         
	//   17   62:aaload          
	//   18   63:invokeinterface #127 <Method void SupportSQLiteProgram.bindBlob(int, byte[])>
				break;

	//*  19   68:goto            126
			case 4: // '\004'
				supportsqliteprogram.bindString(i, mStringBindings[i]);
	//   20   71:aload_1         
	//   21   72:iload_2         
	//   22   73:aload_0         
	//   23   74:getfield        #55  <Field String[] mStringBindings>
	//   24   77:iload_2         
	//   25   78:aaload          
	//   26   79:invokeinterface #129 <Method void SupportSQLiteProgram.bindString(int, String)>
				break;

	//*  27   84:goto            126
			case 3: // '\003'
				supportsqliteprogram.bindDouble(i, mDoubleBindings[i]);
	//   28   87:aload_1         
	//   29   88:iload_2         
	//   30   89:aload_0         
	//   31   90:getfield        #51  <Field double[] mDoubleBindings>
	//   32   93:iload_2         
	//   33   94:daload          
	//   34   95:invokeinterface #131 <Method void SupportSQLiteProgram.bindDouble(int, double)>
				break;

	//*  35  100:goto            126
			case 2: // '\002'
				supportsqliteprogram.bindLong(i, mLongBindings[i]);
	//   36  103:aload_1         
	//   37  104:iload_2         
	//   38  105:aload_0         
	//   39  106:getfield        #49  <Field long[] mLongBindings>
	//   40  109:iload_2         
	//   41  110:laload          
	//   42  111:invokeinterface #133 <Method void SupportSQLiteProgram.bindLong(int, long)>
				break;

	//*  43  116:goto            126
			case 1: // '\001'
				supportsqliteprogram.bindNull(i);
	//   44  119:aload_1         
	//   45  120:iload_2         
	//   46  121:invokeinterface #135 <Method void SupportSQLiteProgram.bindNull(int)>
				break;
			}

	//   47  126:iload_2         
	//   48  127:iconst_1        
	//   49  128:iadd            
	//   50  129:istore_2        
	//*  51  130:goto            2
	//   52  133:return          
	}

	public void clearBindings()
	{
		Arrays.fill(mBindingTypes, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int[] mBindingTypes>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #142 <Method void Arrays.fill(int[], int)>
		Arrays.fill(((Object []) (mStringBindings)), ((Object) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field String[] mStringBindings>
	//    6   12:aconst_null     
	//    7   13:invokestatic    #145 <Method void Arrays.fill(Object[], Object)>
		Arrays.fill(((Object []) (mBlobBindings)), ((Object) (null)));
	//    8   16:aload_0         
	//    9   17:getfield        #59  <Field byte[][] mBlobBindings>
	//   10   20:aconst_null     
	//   11   21:invokestatic    #145 <Method void Arrays.fill(Object[], Object)>
		mQuery = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #147 <Field String mQuery>
	//   15   29:return          
	}

	public void close()
	{
	//    0    0:return          
	}

	public int getArgCount()
	{
		return mArgCount;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int mArgCount>
	//    2    4:ireturn         
	}

	public String getSql()
	{
		return mQuery;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field String mQuery>
	//    2    4:areturn         
	}

	void init(String s, int i)
	{
		mQuery = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field String mQuery>
		mArgCount = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #125 <Field int mArgCount>
	//    6   10:return          
	}

	public void release()
	{
		synchronized(sQueryPool)
	//*   0    0:getstatic       #40  <Field TreeMap sQueryPool>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			sQueryPool.put(((Object) (Integer.valueOf(mCapacity))), ((Object) (this)));
	//    4    6:getstatic       #40  <Field TreeMap sQueryPool>
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field int mCapacity>
	//    7   13:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #156 <Method Object TreeMap.put(Object, Object)>
	//   10   20:pop             
			prunePoolLocked();
	//   11   21:invokestatic    #158 <Method void prunePoolLocked()>
		}
	//   12   24:aload_1         
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		exception;
	//   15   27:astore_2        
		treemap;
	//   16   28:aload_1         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		throw exception;
	//   18   30:aload_2         
	//   19   31:athrow          
	}

	static final TreeMap sQueryPool = new TreeMap();
	int mArgCount;
	private final int mBindingTypes[];
	final byte mBlobBindings[][];
	final int mCapacity;
	final double mDoubleBindings[];
	final long mLongBindings[];
	private volatile String mQuery;
	final String mStringBindings[];

	static 
	{
	//    0    0:new             #35  <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void TreeMap()>
	//    3    7:putstatic       #40  <Field TreeMap sQueryPool>
	//*   4   10:return          
	}
}
