// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.persistence.room.*;
import android.database.Cursor;
import android.support.v4.util.ArrayMap;
import androidx.work.Data;
import java.util.*;

// Referenced classes of package androidx.work.impl.model:
//			WorkSpecDao_Impl, WorkTypeConverters

class WorkSpecDao_Impl$11 extends ComputableLiveData
{

	protected volatile Object compute()
	{
		return ((Object) (compute()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method List compute()>
	//    2    4:areturn         
	}

	protected List compute()
	{
		if(_observer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
	//*   2    4:ifnonnull       52
		{
			_observer = ((android.arch.persistence.room.Observer) (new android.arch.persistence.room.InvalidationTracker.Observer("WorkTag", new String[] {
				"workspec", "worktag"
			}) {

				public void onInvalidated(Set set)
				{
					invalidate();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field WorkSpecDao_Impl$11 this$1>
				//    2    4:invokevirtual   #26  <Method void WorkSpecDao_Impl$11.invalidate()>
				//    3    7:return          
				}

				final WorkSpecDao_Impl._cls11 this$1;

			transient 
			{
				this$1 = WorkSpecDao_Impl._cls11.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkSpecDao_Impl$11 this$1>
				super(s, as);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #18  <Method void android.arch.persistence.room.InvalidationTracker$Observer(String, String[])>
			//    7   11:return          
			}
			}
));
	//    3    7:aload_0         
	//    4    8:new             #12  <Class WorkSpecDao_Impl$11$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:ldc1            #37  <String "WorkTag">
	//    8   15:iconst_2        
	//    9   16:anewarray       String[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:ldc1            #41  <String "workspec">
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:ldc1            #43  <String "worktag">
	//   17   28:aastore         
	//   18   29:invokespecial   #46  <Method void WorkSpecDao_Impl$11$1(WorkSpecDao_Impl$11, String, String[])>
	//   19   32:putfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
			WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).getInvalidationTracker().addWeakObserver(_observer);
	//   20   35:aload_0         
	//   21   36:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//   22   39:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//   23   42:invokevirtual   #56  <Method InvalidationTracker RoomDatabase.getInvalidationTracker()>
	//   24   45:aload_0         
	//   25   46:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
	//   26   49:invokevirtual   #62  <Method void InvalidationTracker.addWeakObserver(android.arch.persistence.room.InvalidationTracker$Observer)>
		}
		WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).beginTransaction();
	//   27   52:aload_0         
	//   28   53:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//   29   56:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//   30   59:invokevirtual   #65  <Method void RoomDatabase.beginTransaction()>
		Cursor cursor = WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).query(((android.arch.persistence.db.SupportSQLiteQuery) (val$_statement)));
	//   31   62:aload_0         
	//   32   63:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//   33   66:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//   34   69:aload_0         
	//   35   70:getfield        #24  <Field RoomSQLiteQuery val$_statement>
	//   36   73:invokevirtual   #69  <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   37   76:astore          6
		int i;
		int j;
		int k;
		ArrayMap arraymap;
		ArrayList arraylist2;
		arraymap = new ArrayMap();
	//   38   78:new             #71  <Class ArrayMap>
	//   39   81:dup             
	//   40   82:invokespecial   #72  <Method void ArrayMap()>
	//   41   85:astore          7
		i = cursor.getColumnIndexOrThrow("id");
	//   42   87:aload           6
	//   43   89:ldc1            #74  <String "id">
	//   44   91:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   45   96:istore_1        
		j = cursor.getColumnIndexOrThrow("state");
	//   46   97:aload           6
	//   47   99:ldc1            #82  <String "state">
	//   48  101:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   49  106:istore_2        
		k = cursor.getColumnIndexOrThrow("output");
	//   50  107:aload           6
	//   51  109:ldc1            #84  <String "output">
	//   52  111:invokeinterface #80  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   53  116:istore_3        
		arraylist2 = new ArrayList(cursor.getCount());
	//   54  117:new             #86  <Class ArrayList>
	//   55  120:dup             
	//   56  121:aload           6
	//   57  123:invokeinterface #90  <Method int Cursor.getCount()>
	//   58  128:invokespecial   #93  <Method void ArrayList(int)>
	//   59  131:astore          8
_L1:
		ArrayList arraylist1;
		ojo ojo;
		String s;
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_278;
	//   60  133:aload           6
	//   61  135:invokeinterface #97  <Method boolean Cursor.moveToNext()>
	//   62  140:ifeq            278
		ojo = new ojo();
	//   63  143:new             #99  <Class WorkSpec$WorkStatusPojo>
	//   64  146:dup             
	//   65  147:invokespecial   #100 <Method void WorkSpec$WorkStatusPojo()>
	//   66  150:astore          9
		ojo.id = cursor.getString(i);
	//   67  152:aload           9
	//   68  154:aload           6
	//   69  156:iload_1         
	//   70  157:invokeinterface #104 <Method String Cursor.getString(int)>
	//   71  162:putfield        #107 <Field String WorkSpec$WorkStatusPojo.id>
		ojo.state = WorkTypeConverters.intToState(cursor.getInt(j));
	//   72  165:aload           9
	//   73  167:aload           6
	//   74  169:iload_2         
	//   75  170:invokeinterface #111 <Method int Cursor.getInt(int)>
	//   76  175:invokestatic    #117 <Method androidx.work.State WorkTypeConverters.intToState(int)>
	//   77  178:putfield        #120 <Field androidx.work.State WorkSpec$WorkStatusPojo.state>
		ojo.output = Data.fromByteArray(cursor.getBlob(k));
	//   78  181:aload           9
	//   79  183:aload           6
	//   80  185:iload_3         
	//   81  186:invokeinterface #124 <Method byte[] Cursor.getBlob(int)>
	//   82  191:invokestatic    #130 <Method Data Data.fromByteArray(byte[])>
	//   83  194:putfield        #133 <Field Data WorkSpec$WorkStatusPojo.output>
		if(cursor.isNull(i))
			break MISSING_BLOCK_LABEL_265;
	//   84  197:aload           6
	//   85  199:iload_1         
	//   86  200:invokeinterface #137 <Method boolean Cursor.isNull(int)>
	//   87  205:ifne            265
		s = cursor.getString(i);
	//   88  208:aload           6
	//   89  210:iload_1         
	//   90  211:invokeinterface #104 <Method String Cursor.getString(int)>
	//   91  216:astore          10
		arraylist1 = (ArrayList)arraymap.get(((Object) (s)));
	//   92  218:aload           7
	//   93  220:aload           10
	//   94  222:invokevirtual   #141 <Method Object ArrayMap.get(Object)>
	//   95  225:checkcast       #86  <Class ArrayList>
	//   96  228:astore          5
		ArrayList arraylist;
		arraylist = arraylist1;
	//   97  230:aload           5
	//   98  232:astore          4
		if(arraylist1 != null)
			break MISSING_BLOCK_LABEL_258;
	//   99  234:aload           5
	//  100  236:ifnonnull       258
		arraylist = new ArrayList();
	//  101  239:new             #86  <Class ArrayList>
	//  102  242:dup             
	//  103  243:invokespecial   #142 <Method void ArrayList()>
	//  104  246:astore          4
		arraymap.put(((Object) (s)), ((Object) (arraylist)));
	//  105  248:aload           7
	//  106  250:aload           10
	//  107  252:aload           4
	//  108  254:invokevirtual   #146 <Method Object ArrayMap.put(Object, Object)>
	//  109  257:pop             
		ojo.tags = ((List) (arraylist));
	//  110  258:aload           9
	//  111  260:aload           4
	//  112  262:putfield        #150 <Field List WorkSpec$WorkStatusPojo.tags>
		((List) (arraylist2)).add(((Object) (ojo)));
	//  113  265:aload           8
	//  114  267:aload           9
	//  115  269:invokeinterface #156 <Method boolean List.add(Object)>
	//  116  274:pop             
		  goto _L1
	//* 117  275:goto            133
		WorkSpecDao_Impl.access$100(WorkSpecDao_Impl.this, arraymap);
	//  118  278:aload_0         
	//  119  279:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//  120  282:aload           7
	//  121  284:invokestatic    #160 <Method void WorkSpecDao_Impl.access$100(WorkSpecDao_Impl, ArrayMap)>
		WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).setTransactionSuccessful();
	//  122  287:aload_0         
	//  123  288:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//  124  291:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//  125  294:invokevirtual   #163 <Method void RoomDatabase.setTransactionSuccessful()>
		cursor.close();
	//  126  297:aload           6
	//  127  299:invokeinterface #166 <Method void Cursor.close()>
		WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).endTransaction();
	//  128  304:aload_0         
	//  129  305:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//  130  308:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//  131  311:invokevirtual   #169 <Method void RoomDatabase.endTransaction()>
		return ((List) (arraylist2));
	//  132  314:aload           8
	//  133  316:areturn         
		Exception exception;
		exception;
	//  134  317:astore          4
		cursor.close();
	//  135  319:aload           6
	//  136  321:invokeinterface #166 <Method void Cursor.close()>
		throw exception;
	//  137  326:aload           4
	//  138  328:athrow          
		exception;
	//  139  329:astore          4
		WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).endTransaction();
	//  140  331:aload_0         
	//  141  332:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//  142  335:invokestatic    #50  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//  143  338:invokevirtual   #169 <Method void RoomDatabase.endTransaction()>
		throw exception;
	//  144  341:aload           4
	//  145  343:athrow          
	}

	protected void finalize()
	{
		val$_statement.release();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RoomSQLiteQuery val$_statement>
	//    2    4:invokevirtual   #177 <Method void RoomSQLiteQuery.release()>
	//    3    7:return          
	}

	private android.arch.persistence.room.Observer _observer;
	final WorkSpecDao_Impl this$0;
	final RoomSQLiteQuery val$_statement;

	WorkSpecDao_Impl$11()
	{
		this$0 = final_workspecdao_impl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WorkSpecDao_Impl this$0>
		val$_statement = RoomSQLiteQuery.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field RoomSQLiteQuery val$_statement>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void ComputableLiveData()>
	//    8   14:return          
	}
}
