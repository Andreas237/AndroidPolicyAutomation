// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteProgram;
import android.arch.persistence.db.SupportSQLiteQuery;
import java.util.*;

public class RoomSQLiteQuery
	implements SupportSQLiteQuery, SupportSQLiteProgram
{

	private RoomSQLiteQuery(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		mCapacity = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #61  <Field int mCapacity>
		i++;
	//    5    9:iload_1         
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:istore_1        
		mBindingTypes = new int[i];
	//    9   13:aload_0         
	//   10   14:iload_1         
	//   11   15:newarray        int[]
	//   12   17:putfield        #63  <Field int[] mBindingTypes>
		mLongBindings = new long[i];
	//   13   20:aload_0         
	//   14   21:iload_1         
	//   15   22:newarray        long[]
	//   16   24:putfield        #65  <Field long[] mLongBindings>
		mDoubleBindings = new double[i];
	//   17   27:aload_0         
	//   18   28:iload_1         
	//   19   29:newarray        double[]
	//   20   31:putfield        #67  <Field double[] mDoubleBindings>
		mStringBindings = new String[i];
	//   21   34:aload_0         
	//   22   35:iload_1         
	//   23   36:anewarray       String[]
	//   24   39:putfield        #71  <Field String[] mStringBindings>
		mBlobBindings = new byte[i][];
	//   25   42:aload_0         
	//   26   43:iload_1         
	//   27   44:anewarray       byte[][]
	//   28   47:putfield        #75  <Field byte[][] mBlobBindings>
	//   29   50:return          
	}

	public static RoomSQLiteQuery acquire(String s, int i)
	{
		Object obj = ((Object) (sQueryPool));
	//    0    0:getstatic       #56  <Field TreeMap sQueryPool>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Object obj1 = ((Object) (sQueryPool.ceilingEntry(((Object) (Integer.valueOf(i))))));
	//    4    6:getstatic       #56  <Field TreeMap sQueryPool>
	//    5    9:iload_1         
	//    6   10:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//    7   13:invokevirtual   #87  <Method java.util.Map$Entry TreeMap.ceilingEntry(Object)>
	//    8   16:astore_3        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_54;
	//    9   17:aload_3         
	//   10   18:ifnull          54
		sQueryPool.remove(((java.util.Map.Entry) (obj1)).getKey());
	//   11   21:getstatic       #56  <Field TreeMap sQueryPool>
	//   12   24:aload_3         
	//   13   25:invokeinterface #93  <Method Object java.util.Map$Entry.getKey()>
	//   14   30:invokevirtual   #97  <Method Object TreeMap.remove(Object)>
	//   15   33:pop             
		obj1 = ((Object) ((RoomSQLiteQuery)((java.util.Map.Entry) (obj1)).getValue()));
	//   16   34:aload_3         
	//   17   35:invokeinterface #100 <Method Object java.util.Map$Entry.getValue()>
	//   18   40:checkcast       #2   <Class RoomSQLiteQuery>
	//   19   43:astore_3        
		((RoomSQLiteQuery) (obj1)).init(s, i);
	//   20   44:aload_3         
	//   21   45:aload_0         
	//   22   46:iload_1         
	//   23   47:invokevirtual   #104 <Method void init(String, int)>
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
	//   33   61:invokespecial   #106 <Method void RoomSQLiteQuery(int)>
	//   34   64:astore_2        
		((RoomSQLiteQuery) (obj)).init(s, i);
	//   35   65:aload_2         
	//   36   66:aload_0         
	//   37   67:iload_1         
	//   38   68:invokevirtual   #104 <Method void init(String, int)>
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

	public static RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportsqlitequery)
	{
		RoomSQLiteQuery roomsqlitequery = acquire(supportsqlitequery.getSql(), supportsqlitequery.getArgCount());
	//    0    0:aload_0         
	//    1    1:invokeinterface #112 <Method String SupportSQLiteQuery.getSql()>
	//    2    6:aload_0         
	//    3    7:invokeinterface #116 <Method int SupportSQLiteQuery.getArgCount()>
	//    4   12:invokestatic    #118 <Method RoomSQLiteQuery acquire(String, int)>
	//    5   15:astore_1        
		supportsqlitequery.bindTo(new SupportSQLiteProgram(roomsqlitequery) {

			public void bindBlob(int i, byte abyte0[])
			{
				query.bindBlob(i, abyte0);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #25  <Method void RoomSQLiteQuery.bindBlob(int, byte[])>
			//    5    9:return          
			}

			public void bindDouble(int i, double d)
			{
				query.bindDouble(i, d);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
			//    2    4:iload_1         
			//    3    5:dload_2         
			//    4    6:invokevirtual   #29  <Method void RoomSQLiteQuery.bindDouble(int, double)>
			//    5    9:return          
			}

			public void bindLong(int i, long l)
			{
				query.bindLong(i, l);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
			//    2    4:iload_1         
			//    3    5:lload_2         
			//    4    6:invokevirtual   #33  <Method void RoomSQLiteQuery.bindLong(int, long)>
			//    5    9:return          
			}

			public void bindNull(int i)
			{
				query.bindNull(i);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #37  <Method void RoomSQLiteQuery.bindNull(int)>
			//    4    8:return          
			}

			public void bindString(int i, String s)
			{
				query.bindString(i, s);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
			//    2    4:iload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #41  <Method void RoomSQLiteQuery.bindString(int, String)>
			//    5    9:return          
			}

			public void clearBindings()
			{
				query.clearBindings();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoomSQLiteQuery val$query>
			//    2    4:invokevirtual   #44  <Method void RoomSQLiteQuery.clearBindings()>
			//    3    7:return          
			}

			public void close()
			{
			//    0    0:return          
			}

			final RoomSQLiteQuery val$query;

			
			{
				query = roomsqlitequery;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoomSQLiteQuery val$query>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    6   16:aload_0         
	//    7   17:new             #10  <Class RoomSQLiteQuery$1>
	//    8   20:dup             
	//    9   21:aload_1         
	//   10   22:invokespecial   #121 <Method void RoomSQLiteQuery$1(RoomSQLiteQuery)>
	//   11   25:invokeinterface #125 <Method void SupportSQLiteQuery.bindTo(SupportSQLiteProgram)>
		return roomsqlitequery;
	//   12   30:aload_1         
	//   13   31:areturn         
	}

	private static void prunePoolLocked()
	{
		if(sQueryPool.size() > 15)
	//*   0    0:getstatic       #56  <Field TreeMap sQueryPool>
	//*   1    3:invokevirtual   #129 <Method int TreeMap.size()>
	//*   2    6:bipush          15
	//*   3    8:icmple          57
		{
			int i = sQueryPool.size() - 10;
	//    4   11:getstatic       #56  <Field TreeMap sQueryPool>
	//    5   14:invokevirtual   #129 <Method int TreeMap.size()>
	//    6   17:bipush          10
	//    7   19:isub            
	//    8   20:istore_0        
			Iterator iterator = sQueryPool.descendingKeySet().iterator();
	//    9   21:getstatic       #56  <Field TreeMap sQueryPool>
	//   10   24:invokevirtual   #133 <Method NavigableSet TreeMap.descendingKeySet()>
	//   11   27:invokeinterface #139 <Method Iterator NavigableSet.iterator()>
	//   12   32:astore_1        
			for(; i > 0; i--)
	//*  13   33:iload_0         
	//*  14   34:ifle            57
			{
				iterator.next();
	//   15   37:aload_1         
	//   16   38:invokeinterface #144 <Method Object Iterator.next()>
	//   17   43:pop             
				iterator.remove();
	//   18   44:aload_1         
	//   19   45:invokeinterface #146 <Method void Iterator.remove()>
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
	//    1    1:getfield        #63  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_5        
	//    4    6:iastore         
		mBlobBindings[i] = abyte0;
	//    5    7:aload_0         
	//    6    8:getfield        #75  <Field byte[][] mBlobBindings>
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aastore         
	//   10   14:return          
	}

	public void bindDouble(int i, double d)
	{
		mBindingTypes[i] = 3;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_3        
	//    4    6:iastore         
		mDoubleBindings[i] = d;
	//    5    7:aload_0         
	//    6    8:getfield        #67  <Field double[] mDoubleBindings>
	//    7   11:iload_1         
	//    8   12:dload_2         
	//    9   13:dastore         
	//   10   14:return          
	}

	public void bindLong(int i, long l)
	{
		mBindingTypes[i] = 2;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_2        
	//    4    6:iastore         
		mLongBindings[i] = l;
	//    5    7:aload_0         
	//    6    8:getfield        #65  <Field long[] mLongBindings>
	//    7   11:iload_1         
	//    8   12:lload_2         
	//    9   13:lastore         
	//   10   14:return          
	}

	public void bindNull(int i)
	{
		mBindingTypes[i] = 1;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:iastore         
	//    5    7:return          
	}

	public void bindString(int i, String s)
	{
		mBindingTypes[i] = 4;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int[] mBindingTypes>
	//    2    4:iload_1         
	//    3    5:iconst_4        
	//    4    6:iastore         
		mStringBindings[i] = s;
	//    5    7:aload_0         
	//    6    8:getfield        #71  <Field String[] mStringBindings>
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
	//*   4    4:getfield        #157 <Field int mArgCount>
	//*   5    7:icmpgt          133
			switch(mBindingTypes[i])
	//*   6   10:aload_0         
	//*   7   11:getfield        #63  <Field int[] mBindingTypes>
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
	//   15   58:getfield        #75  <Field byte[][] mBlobBindings>
	//   16   61:iload_2         
	//   17   62:aaload          
	//   18   63:invokeinterface #159 <Method void SupportSQLiteProgram.bindBlob(int, byte[])>
				break;

	//*  19   68:goto            126
			case 4: // '\004'
				supportsqliteprogram.bindString(i, mStringBindings[i]);
	//   20   71:aload_1         
	//   21   72:iload_2         
	//   22   73:aload_0         
	//   23   74:getfield        #71  <Field String[] mStringBindings>
	//   24   77:iload_2         
	//   25   78:aaload          
	//   26   79:invokeinterface #161 <Method void SupportSQLiteProgram.bindString(int, String)>
				break;

	//*  27   84:goto            126
			case 3: // '\003'
				supportsqliteprogram.bindDouble(i, mDoubleBindings[i]);
	//   28   87:aload_1         
	//   29   88:iload_2         
	//   30   89:aload_0         
	//   31   90:getfield        #67  <Field double[] mDoubleBindings>
	//   32   93:iload_2         
	//   33   94:daload          
	//   34   95:invokeinterface #163 <Method void SupportSQLiteProgram.bindDouble(int, double)>
				break;

	//*  35  100:goto            126
			case 2: // '\002'
				supportsqliteprogram.bindLong(i, mLongBindings[i]);
	//   36  103:aload_1         
	//   37  104:iload_2         
	//   38  105:aload_0         
	//   39  106:getfield        #65  <Field long[] mLongBindings>
	//   40  109:iload_2         
	//   41  110:laload          
	//   42  111:invokeinterface #165 <Method void SupportSQLiteProgram.bindLong(int, long)>
				break;

	//*  43  116:goto            126
			case 1: // '\001'
				supportsqliteprogram.bindNull(i);
	//   44  119:aload_1         
	//   45  120:iload_2         
	//   46  121:invokeinterface #167 <Method void SupportSQLiteProgram.bindNull(int)>
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
	//    1    1:getfield        #63  <Field int[] mBindingTypes>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #174 <Method void Arrays.fill(int[], int)>
		Arrays.fill(((Object []) (mStringBindings)), ((Object) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field String[] mStringBindings>
	//    6   12:aconst_null     
	//    7   13:invokestatic    #177 <Method void Arrays.fill(Object[], Object)>
		Arrays.fill(((Object []) (mBlobBindings)), ((Object) (null)));
	//    8   16:aload_0         
	//    9   17:getfield        #75  <Field byte[][] mBlobBindings>
	//   10   20:aconst_null     
	//   11   21:invokestatic    #177 <Method void Arrays.fill(Object[], Object)>
		mQuery = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #179 <Field String mQuery>
	//   15   29:return          
	}

	public void close()
	{
	//    0    0:return          
	}

	public void copyArgumentsFrom(RoomSQLiteQuery roomsqlitequery)
	{
		int i = roomsqlitequery.getArgCount() + 1;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #182 <Method int getArgCount()>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_2        
		System.arraycopy(((Object) (roomsqlitequery.mBindingTypes)), 0, ((Object) (mBindingTypes)), 0, i);
	//    5    7:aload_1         
	//    6    8:getfield        #63  <Field int[] mBindingTypes>
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:getfield        #63  <Field int[] mBindingTypes>
	//   10   16:iconst_0        
	//   11   17:iload_2         
	//   12   18:invokestatic    #188 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (roomsqlitequery.mLongBindings)), 0, ((Object) (mLongBindings)), 0, i);
	//   13   21:aload_1         
	//   14   22:getfield        #65  <Field long[] mLongBindings>
	//   15   25:iconst_0        
	//   16   26:aload_0         
	//   17   27:getfield        #65  <Field long[] mLongBindings>
	//   18   30:iconst_0        
	//   19   31:iload_2         
	//   20   32:invokestatic    #188 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (roomsqlitequery.mStringBindings)), 0, ((Object) (mStringBindings)), 0, i);
	//   21   35:aload_1         
	//   22   36:getfield        #71  <Field String[] mStringBindings>
	//   23   39:iconst_0        
	//   24   40:aload_0         
	//   25   41:getfield        #71  <Field String[] mStringBindings>
	//   26   44:iconst_0        
	//   27   45:iload_2         
	//   28   46:invokestatic    #188 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (roomsqlitequery.mBlobBindings)), 0, ((Object) (mBlobBindings)), 0, i);
	//   29   49:aload_1         
	//   30   50:getfield        #75  <Field byte[][] mBlobBindings>
	//   31   53:iconst_0        
	//   32   54:aload_0         
	//   33   55:getfield        #75  <Field byte[][] mBlobBindings>
	//   34   58:iconst_0        
	//   35   59:iload_2         
	//   36   60:invokestatic    #188 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (roomsqlitequery.mDoubleBindings)), 0, ((Object) (mDoubleBindings)), 0, i);
	//   37   63:aload_1         
	//   38   64:getfield        #67  <Field double[] mDoubleBindings>
	//   39   67:iconst_0        
	//   40   68:aload_0         
	//   41   69:getfield        #67  <Field double[] mDoubleBindings>
	//   42   72:iconst_0        
	//   43   73:iload_2         
	//   44   74:invokestatic    #188 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   45   77:return          
	}

	public int getArgCount()
	{
		return mArgCount;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field int mArgCount>
	//    2    4:ireturn         
	}

	public String getSql()
	{
		return mQuery;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field String mQuery>
	//    2    4:areturn         
	}

	void init(String s, int i)
	{
		mQuery = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field String mQuery>
		mArgCount = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #157 <Field int mArgCount>
	//    6   10:return          
	}

	public void release()
	{
		synchronized(sQueryPool)
	//*   0    0:getstatic       #56  <Field TreeMap sQueryPool>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			sQueryPool.put(((Object) (Integer.valueOf(mCapacity))), ((Object) (this)));
	//    4    6:getstatic       #56  <Field TreeMap sQueryPool>
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field int mCapacity>
	//    7   13:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #193 <Method Object TreeMap.put(Object, Object)>
	//   10   20:pop             
			prunePoolLocked();
	//   11   21:invokestatic    #195 <Method void prunePoolLocked()>
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

	private static final int BLOB = 5;
	static final int DESIRED_POOL_SIZE = 10;
	private static final int DOUBLE = 3;
	private static final int LONG = 2;
	private static final int NULL = 1;
	static final int POOL_LIMIT = 15;
	private static final int STRING = 4;
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
	//    0    0:new             #51  <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void TreeMap()>
	//    3    7:putstatic       #56  <Field TreeMap sQueryPool>
	//*   4   10:return          
	}
}
