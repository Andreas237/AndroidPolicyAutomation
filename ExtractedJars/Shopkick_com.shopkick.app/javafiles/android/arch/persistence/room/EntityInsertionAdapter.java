// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import java.util.*;

// Referenced classes of package android.arch.persistence.room:
//			SharedSQLiteStatement, RoomDatabase

public abstract class EntityInsertionAdapter extends SharedSQLiteStatement
{

	public EntityInsertionAdapter(RoomDatabase roomdatabase)
	{
		super(roomdatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void SharedSQLiteStatement(RoomDatabase)>
	//    3    5:return          
	}

	protected abstract void bind(SupportSQLiteStatement supportsqlitestatement, Object obj);

	public final void insert(Iterable iterable)
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore_2        
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); supportsqlitestatement.executeInsert())
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #28  <Method Iterator Iterable.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            42
			bind(supportsqlitestatement, ((Iterator) (iterable)).next());
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokeinterface #38  <Method Object Iterator.next()>
	//   13   29:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>

	//   14   32:aload_2         
	//   15   33:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//   16   38:pop2            
	//*  17   39:goto            12
		release(supportsqlitestatement);
	//   18   42:aload_0         
	//   19   43:aload_2         
	//   20   44:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return;
	//   21   47:return          
		iterable;
	//   22   48:astore_1        
		release(supportsqlitestatement);
	//   23   49:aload_0         
	//   24   50:aload_2         
	//   25   51:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw iterable;
	//   26   54:aload_1         
	//   27   55:athrow          
	}

	public final void insert(Object obj)
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore_2        
		bind(supportsqlitestatement, obj);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		supportsqlitestatement.executeInsert();
	//    7   11:aload_2         
	//    8   12:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//    9   17:pop2            
		release(supportsqlitestatement);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return;
	//   13   23:return          
		obj;
	//   14   24:astore_1        
		release(supportsqlitestatement);
	//   15   25:aload_0         
	//   16   26:aload_2         
	//   17   27:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw obj;
	//   18   30:aload_1         
	//   19   31:athrow          
	}

	public final void insert(Object aobj[])
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore          4
		int j = aobj.length;
	//    3    6:aload_1         
	//    4    7:arraylength     
	//    5    8:istore_3        
		int i = 0;
	//    6    9:iconst_0        
	//    7   10:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    8   11:iload_2         
	//    9   12:iload_3         
	//   10   13:icmpge          40
		bind(supportsqlitestatement, aobj[i]);
	//   11   16:aload_0         
	//   12   17:aload           4
	//   13   19:aload_1         
	//   14   20:iload_2         
	//   15   21:aaload          
	//   16   22:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		supportsqlitestatement.executeInsert();
	//   17   25:aload           4
	//   18   27:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//   19   32:pop2            
		i++;
	//   20   33:iload_2         
	//   21   34:iconst_1        
	//   22   35:iadd            
	//   23   36:istore_2        
		if(true) goto _L2; else goto _L1
	//   24   37:goto            11
_L1:
		release(supportsqlitestatement);
	//   25   40:aload_0         
	//   26   41:aload           4
	//   27   43:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return;
	//   28   46:return          
		aobj;
	//   29   47:astore_1        
		release(supportsqlitestatement);
	//   30   48:aload_0         
	//   31   49:aload           4
	//   32   51:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw aobj;
	//   33   54:aload_1         
	//   34   55:athrow          
	}

	public final long insertAndReturnId(Object obj)
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore          4
		long l;
		bind(supportsqlitestatement, obj);
	//    3    6:aload_0         
	//    4    7:aload           4
	//    5    9:aload_1         
	//    6   10:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		l = supportsqlitestatement.executeInsert();
	//    7   13:aload           4
	//    8   15:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//    9   20:lstore_2        
		release(supportsqlitestatement);
	//   10   21:aload_0         
	//   11   22:aload           4
	//   12   24:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return l;
	//   13   27:lload_2         
	//   14   28:lreturn         
		obj;
	//   15   29:astore_1        
		release(supportsqlitestatement);
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw obj;
	//   19   36:aload_1         
	//   20   37:athrow          
	}

	public final long[] insertAndReturnIdsArray(Collection collection)
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore_3        
		long al[] = new long[collection.size()];
	//    3    5:aload_1         
	//    4    6:invokeinterface #67  <Method int Collection.size()>
	//    5   11:newarray        long[]
	//    6   13:astore          4
		int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		collection = ((Collection) (collection.iterator()));
	//    9   17:aload_1         
	//   10   18:invokeinterface #68  <Method Iterator Collection.iterator()>
	//   11   23:astore_1        
_L1:
		if(!((Iterator) (collection)).hasNext())
			break MISSING_BLOCK_LABEL_61;
	//   12   24:aload_1         
	//   13   25:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            61
		bind(supportsqlitestatement, ((Iterator) (collection)).next());
	//   15   33:aload_0         
	//   16   34:aload_3         
	//   17   35:aload_1         
	//   18   36:invokeinterface #38  <Method Object Iterator.next()>
	//   19   41:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		al[i] = supportsqlitestatement.executeInsert();
	//   20   44:aload           4
	//   21   46:iload_2         
	//   22   47:aload_3         
	//   23   48:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//   24   53:lastore         
		i++;
	//   25   54:iload_2         
	//   26   55:iconst_1        
	//   27   56:iadd            
	//   28   57:istore_2        
		  goto _L1
	//*  29   58:goto            24
		release(supportsqlitestatement);
	//   30   61:aload_0         
	//   31   62:aload_3         
	//   32   63:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return al;
	//   33   66:aload           4
	//   34   68:areturn         
		collection;
	//   35   69:astore_1        
		release(supportsqlitestatement);
	//   36   70:aload_0         
	//   37   71:aload_3         
	//   38   72:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw collection;
	//   39   75:aload_1         
	//   40   76:athrow          
	}

	public final long[] insertAndReturnIdsArray(Object aobj[])
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore          5
		int k;
		long al[];
		al = new long[aobj.length];
	//    3    6:aload_1         
	//    4    7:arraylength     
	//    5    8:newarray        long[]
	//    6   10:astore          6
		k = aobj.length;
	//    7   12:aload_1         
	//    8   13:arraylength     
	//    9   14:istore          4
		int i;
		int j;
		i = 0;
	//   10   16:iconst_0        
	//   11   17:istore_2        
		j = 0;
	//   12   18:iconst_0        
	//   13   19:istore_3        
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   14   20:iload_2         
	//   15   21:iload           4
	//   16   23:icmpge          57
		bind(supportsqlitestatement, aobj[i]);
	//   17   26:aload_0         
	//   18   27:aload           5
	//   19   29:aload_1         
	//   20   30:iload_2         
	//   21   31:aaload          
	//   22   32:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		al[j] = supportsqlitestatement.executeInsert();
	//   23   35:aload           6
	//   24   37:iload_3         
	//   25   38:aload           5
	//   26   40:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//   27   45:lastore         
		j++;
	//   28   46:iload_3         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_3        
		i++;
	//   32   50:iload_2         
	//   33   51:iconst_1        
	//   34   52:iadd            
	//   35   53:istore_2        
		if(true) goto _L2; else goto _L1
	//   36   54:goto            20
_L1:
		release(supportsqlitestatement);
	//   37   57:aload_0         
	//   38   58:aload           5
	//   39   60:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return al;
	//   40   63:aload           6
	//   41   65:areturn         
		aobj;
	//   42   66:astore_1        
		release(supportsqlitestatement);
	//   43   67:aload_0         
	//   44   68:aload           5
	//   45   70:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw aobj;
	//   46   73:aload_1         
	//   47   74:athrow          
	}

	public final Long[] insertAndReturnIdsArrayBox(Collection collection)
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore_3        
		Long along[] = new Long[collection.size()];
	//    3    5:aload_1         
	//    4    6:invokeinterface #67  <Method int Collection.size()>
	//    5   11:anewarray       Long[]
	//    6   14:astore          4
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_2        
		collection = ((Collection) (collection.iterator()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #68  <Method Iterator Collection.iterator()>
	//   11   24:astore_1        
_L1:
		if(!((Iterator) (collection)).hasNext())
			break MISSING_BLOCK_LABEL_65;
	//   12   25:aload_1         
	//   13   26:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//   14   31:ifeq            65
		bind(supportsqlitestatement, ((Iterator) (collection)).next());
	//   15   34:aload_0         
	//   16   35:aload_3         
	//   17   36:aload_1         
	//   18   37:invokeinterface #38  <Method Object Iterator.next()>
	//   19   42:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		along[i] = Long.valueOf(supportsqlitestatement.executeInsert());
	//   20   45:aload           4
	//   21   47:iload_2         
	//   22   48:aload_3         
	//   23   49:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//   24   54:invokestatic    #79  <Method Long Long.valueOf(long)>
	//   25   57:aastore         
		i++;
	//   26   58:iload_2         
	//   27   59:iconst_1        
	//   28   60:iadd            
	//   29   61:istore_2        
		  goto _L1
	//*  30   62:goto            25
		release(supportsqlitestatement);
	//   31   65:aload_0         
	//   32   66:aload_3         
	//   33   67:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return along;
	//   34   70:aload           4
	//   35   72:areturn         
		collection;
	//   36   73:astore_1        
		release(supportsqlitestatement);
	//   37   74:aload_0         
	//   38   75:aload_3         
	//   39   76:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw collection;
	//   40   79:aload_1         
	//   41   80:athrow          
	}

	public final Long[] insertAndReturnIdsArrayBox(Object aobj[])
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore          5
		int k;
		Long along[];
		along = new Long[aobj.length];
	//    3    6:aload_1         
	//    4    7:arraylength     
	//    5    8:anewarray       Long[]
	//    6   11:astore          6
		k = aobj.length;
	//    7   13:aload_1         
	//    8   14:arraylength     
	//    9   15:istore          4
		int i;
		int j;
		i = 0;
	//   10   17:iconst_0        
	//   11   18:istore_2        
		j = 0;
	//   12   19:iconst_0        
	//   13   20:istore_3        
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   14   21:iload_2         
	//   15   22:iload           4
	//   16   24:icmpge          61
		bind(supportsqlitestatement, aobj[i]);
	//   17   27:aload_0         
	//   18   28:aload           5
	//   19   30:aload_1         
	//   20   31:iload_2         
	//   21   32:aaload          
	//   22   33:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		along[j] = Long.valueOf(supportsqlitestatement.executeInsert());
	//   23   36:aload           6
	//   24   38:iload_3         
	//   25   39:aload           5
	//   26   41:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//   27   46:invokestatic    #79  <Method Long Long.valueOf(long)>
	//   28   49:aastore         
		j++;
	//   29   50:iload_3         
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:istore_3        
		i++;
	//   33   54:iload_2         
	//   34   55:iconst_1        
	//   35   56:iadd            
	//   36   57:istore_2        
		if(true) goto _L2; else goto _L1
	//   37   58:goto            21
_L1:
		release(supportsqlitestatement);
	//   38   61:aload_0         
	//   39   62:aload           5
	//   40   64:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return along;
	//   41   67:aload           6
	//   42   69:areturn         
		aobj;
	//   43   70:astore_1        
		release(supportsqlitestatement);
	//   44   71:aload_0         
	//   45   72:aload           5
	//   46   74:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw aobj;
	//   47   77:aload_1         
	//   48   78:athrow          
	}

	public final List insertAndReturnIdsList(Collection collection)
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore_3        
		ArrayList arraylist = new ArrayList(collection.size());
	//    3    5:new             #86  <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokeinterface #67  <Method int Collection.size()>
	//    7   15:invokespecial   #89  <Method void ArrayList(int)>
	//    8   18:astore          4
		int i = 0;
	//    9   20:iconst_0        
	//   10   21:istore_2        
		collection = ((Collection) (collection.iterator()));
	//   11   22:aload_1         
	//   12   23:invokeinterface #68  <Method Iterator Collection.iterator()>
	//   13   28:astore_1        
_L1:
		if(!((Iterator) (collection)).hasNext())
			break MISSING_BLOCK_LABEL_73;
	//   14   29:aload_1         
	//   15   30:invokeinterface #34  <Method boolean Iterator.hasNext()>
	//   16   35:ifeq            73
		bind(supportsqlitestatement, ((Iterator) (collection)).next());
	//   17   38:aload_0         
	//   18   39:aload_3         
	//   19   40:aload_1         
	//   20   41:invokeinterface #38  <Method Object Iterator.next()>
	//   21   46:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		((List) (arraylist)).add(i, ((Object) (Long.valueOf(supportsqlitestatement.executeInsert()))));
	//   22   49:aload           4
	//   23   51:iload_2         
	//   24   52:aload_3         
	//   25   53:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//   26   58:invokestatic    #79  <Method Long Long.valueOf(long)>
	//   27   61:invokeinterface #95  <Method void List.add(int, Object)>
		i++;
	//   28   66:iload_2         
	//   29   67:iconst_1        
	//   30   68:iadd            
	//   31   69:istore_2        
		  goto _L1
	//*  32   70:goto            29
		release(supportsqlitestatement);
	//   33   73:aload_0         
	//   34   74:aload_3         
	//   35   75:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return ((List) (arraylist));
	//   36   78:aload           4
	//   37   80:areturn         
		collection;
	//   38   81:astore_1        
		release(supportsqlitestatement);
	//   39   82:aload_0         
	//   40   83:aload_3         
	//   41   84:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw collection;
	//   42   87:aload_1         
	//   43   88:athrow          
	}

	public final List insertAndReturnIdsList(Object aobj[])
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore          5
		int k;
		ArrayList arraylist;
		arraylist = new ArrayList(aobj.length);
	//    3    6:new             #86  <Class ArrayList>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:arraylength     
	//    7   12:invokespecial   #89  <Method void ArrayList(int)>
	//    8   15:astore          6
		k = aobj.length;
	//    9   17:aload_1         
	//   10   18:arraylength     
	//   11   19:istore          4
		int i;
		int j;
		i = 0;
	//   12   21:iconst_0        
	//   13   22:istore_2        
		j = 0;
	//   14   23:iconst_0        
	//   15   24:istore_3        
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   16   25:iload_2         
	//   17   26:iload           4
	//   18   28:icmpge          69
		bind(supportsqlitestatement, aobj[i]);
	//   19   31:aload_0         
	//   20   32:aload           5
	//   21   34:aload_1         
	//   22   35:iload_2         
	//   23   36:aaload          
	//   24   37:invokevirtual   #40  <Method void bind(SupportSQLiteStatement, Object)>
		((List) (arraylist)).add(j, ((Object) (Long.valueOf(supportsqlitestatement.executeInsert()))));
	//   25   40:aload           6
	//   26   42:iload_3         
	//   27   43:aload           5
	//   28   45:invokeinterface #46  <Method long SupportSQLiteStatement.executeInsert()>
	//   29   50:invokestatic    #79  <Method Long Long.valueOf(long)>
	//   30   53:invokeinterface #95  <Method void List.add(int, Object)>
		j++;
	//   31   58:iload_3         
	//   32   59:iconst_1        
	//   33   60:iadd            
	//   34   61:istore_3        
		i++;
	//   35   62:iload_2         
	//   36   63:iconst_1        
	//   37   64:iadd            
	//   38   65:istore_2        
		if(true) goto _L2; else goto _L1
	//   39   66:goto            25
_L1:
		release(supportsqlitestatement);
	//   40   69:aload_0         
	//   41   70:aload           5
	//   42   72:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		return ((List) (arraylist));
	//   43   75:aload           6
	//   44   77:areturn         
		aobj;
	//   45   78:astore_1        
		release(supportsqlitestatement);
	//   46   79:aload_0         
	//   47   80:aload           5
	//   48   82:invokevirtual   #50  <Method void release(SupportSQLiteStatement)>
		throw aobj;
	//   49   85:aload_1         
	//   50   86:athrow          
	}
}
