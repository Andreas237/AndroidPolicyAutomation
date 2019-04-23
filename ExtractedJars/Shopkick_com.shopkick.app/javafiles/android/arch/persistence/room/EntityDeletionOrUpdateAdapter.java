// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import java.util.Iterator;

// Referenced classes of package android.arch.persistence.room:
//			SharedSQLiteStatement, RoomDatabase

public abstract class EntityDeletionOrUpdateAdapter extends SharedSQLiteStatement
{

	public EntityDeletionOrUpdateAdapter(RoomDatabase roomdatabase)
	{
		super(roomdatabase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void SharedSQLiteStatement(RoomDatabase)>
	//    3    5:return          
	}

	protected abstract void bind(SupportSQLiteStatement supportsqlitestatement, Object obj);

	protected abstract String createQuery();

	public final int handle(Object obj)
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore_3        
		int i;
		bind(supportsqlitestatement, obj);
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #26  <Method void bind(SupportSQLiteStatement, Object)>
		i = supportsqlitestatement.executeUpdateDelete();
	//    7   11:aload_3         
	//    8   12:invokeinterface #32  <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//    9   17:istore_2        
		release(supportsqlitestatement);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #36  <Method void release(SupportSQLiteStatement)>
		return i;
	//   13   23:iload_2         
	//   14   24:ireturn         
		obj;
	//   15   25:astore_1        
		release(supportsqlitestatement);
	//   16   26:aload_0         
	//   17   27:aload_3         
	//   18   28:invokevirtual   #36  <Method void release(SupportSQLiteStatement)>
		throw obj;
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	public final int handleMultiple(Iterable iterable)
	{
		int i;
		SupportSQLiteStatement supportsqlitestatement;
		supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore          4
		i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		iterable = ((Iterable) (iterable.iterator()));
	//    5    8:aload_1         
	//    6    9:invokeinterface #46  <Method Iterator Iterable.iterator()>
	//    7   14:astore_1        
_L1:
		int j;
		if(!((Iterator) (iterable)).hasNext())
			break MISSING_BLOCK_LABEL_51;
	//    8   15:aload_1         
	//    9   16:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//   10   21:ifeq            51
		bind(supportsqlitestatement, ((Iterator) (iterable)).next());
	//   11   24:aload_0         
	//   12   25:aload           4
	//   13   27:aload_1         
	//   14   28:invokeinterface #56  <Method Object Iterator.next()>
	//   15   33:invokevirtual   #26  <Method void bind(SupportSQLiteStatement, Object)>
		j = supportsqlitestatement.executeUpdateDelete();
	//   16   36:aload           4
	//   17   38:invokeinterface #32  <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   18   43:istore_3        
		i += j;
	//   19   44:iload_2         
	//   20   45:iload_3         
	//   21   46:iadd            
	//   22   47:istore_2        
		  goto _L1
	//*  23   48:goto            15
		release(supportsqlitestatement);
	//   24   51:aload_0         
	//   25   52:aload           4
	//   26   54:invokevirtual   #36  <Method void release(SupportSQLiteStatement)>
		return i;
	//   27   57:iload_2         
	//   28   58:ireturn         
		iterable;
	//   29   59:astore_1        
		release(supportsqlitestatement);
	//   30   60:aload_0         
	//   31   61:aload           4
	//   32   63:invokevirtual   #36  <Method void release(SupportSQLiteStatement)>
		throw iterable;
	//   33   66:aload_1         
	//   34   67:athrow          
	}

	public final int handleMultiple(Object aobj[])
	{
		SupportSQLiteStatement supportsqlitestatement = acquire();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method SupportSQLiteStatement acquire()>
	//    2    4:astore          6
		int k = aobj.length;
	//    3    6:aload_1         
	//    4    7:arraylength     
	//    5    8:istore          4
		int i;
		int j;
		i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		j = 0;
	//    8   12:iconst_0        
	//    9   13:istore_3        
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   10   14:iload_2         
	//   11   15:iload           4
	//   12   17:icmpge          50
		int l;
		bind(supportsqlitestatement, aobj[i]);
	//   13   20:aload_0         
	//   14   21:aload           6
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:aaload          
	//   18   26:invokevirtual   #26  <Method void bind(SupportSQLiteStatement, Object)>
		l = supportsqlitestatement.executeUpdateDelete();
	//   19   29:aload           6
	//   20   31:invokeinterface #32  <Method int SupportSQLiteStatement.executeUpdateDelete()>
	//   21   36:istore          5
		j += l;
	//   22   38:iload_3         
	//   23   39:iload           5
	//   24   41:iadd            
	//   25   42:istore_3        
		i++;
	//   26   43:iload_2         
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:istore_2        
		if(true) goto _L2; else goto _L1
	//   30   47:goto            14
_L1:
		release(supportsqlitestatement);
	//   31   50:aload_0         
	//   32   51:aload           6
	//   33   53:invokevirtual   #36  <Method void release(SupportSQLiteStatement)>
		return j;
	//   34   56:iload_3         
	//   35   57:ireturn         
		aobj;
	//   36   58:astore_1        
		release(supportsqlitestatement);
	//   37   59:aload_0         
	//   38   60:aload           6
	//   39   62:invokevirtual   #36  <Method void release(SupportSQLiteStatement)>
		throw aobj;
	//   40   65:aload_1         
	//   41   66:athrow          
	}
}
