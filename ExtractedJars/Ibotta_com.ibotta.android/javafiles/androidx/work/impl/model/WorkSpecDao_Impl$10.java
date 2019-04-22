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

class WorkSpecDao_Impl$10 extends ComputableLiveData
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
	//*   2    4:ifnonnull       47
		{
			_observer = ((android.arch.persistence.room.Observer) (new android.arch.persistence.room.InvalidationTracker.Observer("WorkTag", new String[] {
				"workspec"
			}) {

				public void onInvalidated(Set set)
				{
					invalidate();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field WorkSpecDao_Impl$10 this$1>
				//    2    4:invokevirtual   #26  <Method void WorkSpecDao_Impl$10.invalidate()>
				//    3    7:return          
				}

				final WorkSpecDao_Impl._cls10 this$1;

			transient 
			{
				this$1 = WorkSpecDao_Impl._cls10.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WorkSpecDao_Impl$10 this$1>
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
	//    4    8:new             #12  <Class WorkSpecDao_Impl$10$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:ldc1            #37  <String "WorkTag">
	//    8   15:iconst_1        
	//    9   16:anewarray       String[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:ldc1            #41  <String "workspec">
	//   13   23:aastore         
	//   14   24:invokespecial   #44  <Method void WorkSpecDao_Impl$10$1(WorkSpecDao_Impl$10, String, String[])>
	//   15   27:putfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
			WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).getInvalidationTracker().addWeakObserver(_observer);
	//   16   30:aload_0         
	//   17   31:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//   18   34:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//   19   37:invokevirtual   #54  <Method InvalidationTracker RoomDatabase.getInvalidationTracker()>
	//   20   40:aload_0         
	//   21   41:getfield        #35  <Field android.arch.persistence.room.InvalidationTracker$Observer _observer>
	//   22   44:invokevirtual   #60  <Method void InvalidationTracker.addWeakObserver(android.arch.persistence.room.InvalidationTracker$Observer)>
		}
		WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).beginTransaction();
	//   23   47:aload_0         
	//   24   48:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//   25   51:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//   26   54:invokevirtual   #63  <Method void RoomDatabase.beginTransaction()>
		Cursor cursor = WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).query(((android.arch.persistence.db.SupportSQLiteQuery) (val$_statement)));
	//   27   57:aload_0         
	//   28   58:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//   29   61:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//   30   64:aload_0         
	//   31   65:getfield        #24  <Field RoomSQLiteQuery val$_statement>
	//   32   68:invokevirtual   #67  <Method Cursor RoomDatabase.query(android.arch.persistence.db.SupportSQLiteQuery)>
	//   33   71:astore          6
		int i;
		int j;
		int k;
		ArrayMap arraymap;
		ArrayList arraylist2;
		arraymap = new ArrayMap();
	//   34   73:new             #69  <Class ArrayMap>
	//   35   76:dup             
	//   36   77:invokespecial   #70  <Method void ArrayMap()>
	//   37   80:astore          7
		i = cursor.getColumnIndexOrThrow("id");
	//   38   82:aload           6
	//   39   84:ldc1            #72  <String "id">
	//   40   86:invokeinterface #78  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   41   91:istore_1        
		j = cursor.getColumnIndexOrThrow("state");
	//   42   92:aload           6
	//   43   94:ldc1            #80  <String "state">
	//   44   96:invokeinterface #78  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   45  101:istore_2        
		k = cursor.getColumnIndexOrThrow("output");
	//   46  102:aload           6
	//   47  104:ldc1            #82  <String "output">
	//   48  106:invokeinterface #78  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   49  111:istore_3        
		arraylist2 = new ArrayList(cursor.getCount());
	//   50  112:new             #84  <Class ArrayList>
	//   51  115:dup             
	//   52  116:aload           6
	//   53  118:invokeinterface #88  <Method int Cursor.getCount()>
	//   54  123:invokespecial   #91  <Method void ArrayList(int)>
	//   55  126:astore          8
_L1:
		ArrayList arraylist1;
		ojo ojo;
		String s;
		if(!cursor.moveToNext())
			break MISSING_BLOCK_LABEL_273;
	//   56  128:aload           6
	//   57  130:invokeinterface #95  <Method boolean Cursor.moveToNext()>
	//   58  135:ifeq            273
		ojo = new ojo();
	//   59  138:new             #97  <Class WorkSpec$WorkStatusPojo>
	//   60  141:dup             
	//   61  142:invokespecial   #98  <Method void WorkSpec$WorkStatusPojo()>
	//   62  145:astore          9
		ojo.id = cursor.getString(i);
	//   63  147:aload           9
	//   64  149:aload           6
	//   65  151:iload_1         
	//   66  152:invokeinterface #102 <Method String Cursor.getString(int)>
	//   67  157:putfield        #105 <Field String WorkSpec$WorkStatusPojo.id>
		ojo.state = WorkTypeConverters.intToState(cursor.getInt(j));
	//   68  160:aload           9
	//   69  162:aload           6
	//   70  164:iload_2         
	//   71  165:invokeinterface #109 <Method int Cursor.getInt(int)>
	//   72  170:invokestatic    #115 <Method androidx.work.State WorkTypeConverters.intToState(int)>
	//   73  173:putfield        #118 <Field androidx.work.State WorkSpec$WorkStatusPojo.state>
		ojo.output = Data.fromByteArray(cursor.getBlob(k));
	//   74  176:aload           9
	//   75  178:aload           6
	//   76  180:iload_3         
	//   77  181:invokeinterface #122 <Method byte[] Cursor.getBlob(int)>
	//   78  186:invokestatic    #128 <Method Data Data.fromByteArray(byte[])>
	//   79  189:putfield        #131 <Field Data WorkSpec$WorkStatusPojo.output>
		if(cursor.isNull(i))
			break MISSING_BLOCK_LABEL_260;
	//   80  192:aload           6
	//   81  194:iload_1         
	//   82  195:invokeinterface #135 <Method boolean Cursor.isNull(int)>
	//   83  200:ifne            260
		s = cursor.getString(i);
	//   84  203:aload           6
	//   85  205:iload_1         
	//   86  206:invokeinterface #102 <Method String Cursor.getString(int)>
	//   87  211:astore          10
		arraylist1 = (ArrayList)arraymap.get(((Object) (s)));
	//   88  213:aload           7
	//   89  215:aload           10
	//   90  217:invokevirtual   #139 <Method Object ArrayMap.get(Object)>
	//   91  220:checkcast       #84  <Class ArrayList>
	//   92  223:astore          5
		ArrayList arraylist;
		arraylist = arraylist1;
	//   93  225:aload           5
	//   94  227:astore          4
		if(arraylist1 != null)
			break MISSING_BLOCK_LABEL_253;
	//   95  229:aload           5
	//   96  231:ifnonnull       253
		arraylist = new ArrayList();
	//   97  234:new             #84  <Class ArrayList>
	//   98  237:dup             
	//   99  238:invokespecial   #140 <Method void ArrayList()>
	//  100  241:astore          4
		arraymap.put(((Object) (s)), ((Object) (arraylist)));
	//  101  243:aload           7
	//  102  245:aload           10
	//  103  247:aload           4
	//  104  249:invokevirtual   #144 <Method Object ArrayMap.put(Object, Object)>
	//  105  252:pop             
		ojo.tags = ((List) (arraylist));
	//  106  253:aload           9
	//  107  255:aload           4
	//  108  257:putfield        #148 <Field List WorkSpec$WorkStatusPojo.tags>
		((List) (arraylist2)).add(((Object) (ojo)));
	//  109  260:aload           8
	//  110  262:aload           9
	//  111  264:invokeinterface #154 <Method boolean List.add(Object)>
	//  112  269:pop             
		  goto _L1
	//* 113  270:goto            128
		WorkSpecDao_Impl.access$100(WorkSpecDao_Impl.this, arraymap);
	//  114  273:aload_0         
	//  115  274:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//  116  277:aload           7
	//  117  279:invokestatic    #158 <Method void WorkSpecDao_Impl.access$100(WorkSpecDao_Impl, ArrayMap)>
		WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).setTransactionSuccessful();
	//  118  282:aload_0         
	//  119  283:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//  120  286:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//  121  289:invokevirtual   #161 <Method void RoomDatabase.setTransactionSuccessful()>
		cursor.close();
	//  122  292:aload           6
	//  123  294:invokeinterface #164 <Method void Cursor.close()>
		WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).endTransaction();
	//  124  299:aload_0         
	//  125  300:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//  126  303:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//  127  306:invokevirtual   #167 <Method void RoomDatabase.endTransaction()>
		return ((List) (arraylist2));
	//  128  309:aload           8
	//  129  311:areturn         
		Exception exception;
		exception;
	//  130  312:astore          4
		cursor.close();
	//  131  314:aload           6
	//  132  316:invokeinterface #164 <Method void Cursor.close()>
		throw exception;
	//  133  321:aload           4
	//  134  323:athrow          
		exception;
	//  135  324:astore          4
		WorkSpecDao_Impl.access$000(WorkSpecDao_Impl.this).endTransaction();
	//  136  326:aload_0         
	//  137  327:getfield        #22  <Field WorkSpecDao_Impl this$0>
	//  138  330:invokestatic    #48  <Method RoomDatabase WorkSpecDao_Impl.access$000(WorkSpecDao_Impl)>
	//  139  333:invokevirtual   #167 <Method void RoomDatabase.endTransaction()>
		throw exception;
	//  140  336:aload           4
	//  141  338:athrow          
	}

	protected void finalize()
	{
		val$_statement.release();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RoomSQLiteQuery val$_statement>
	//    2    4:invokevirtual   #175 <Method void RoomSQLiteQuery.release()>
	//    3    7:return          
	}

	private android.arch.persistence.room.Observer _observer;
	final WorkSpecDao_Impl this$0;
	final RoomSQLiteQuery val$_statement;

	WorkSpecDao_Impl$10()
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
