// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.runtime;

import android.content.*;
import android.net.Uri;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.transaction.ITransaction;

public abstract class BaseContentProvider extends ContentProvider
{
	public static interface PropertyConverter
	{

		public abstract IProperty fromName(String s);
	}


	protected BaseContentProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ContentProvider()>
	//    2    4:return          
	}

	protected BaseContentProvider(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ContentProvider()>
		moduleClass = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Class moduleClass>
	//    5    9:return          
	}

	protected abstract int bulkInsert(Uri uri, ContentValues contentvalues);

	public int bulkInsert(final Uri uri, final ContentValues values[])
	{
		final int count[] = new int[1];
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:astore_3        
		count[0] = 0;
	//    3    4:aload_3         
	//    4    5:iconst_0        
	//    5    6:iconst_0        
	//    6    7:iastore         
		getDatabase().executeTransaction(new ITransaction() {

			public void execute(DatabaseWrapper databasewrapper)
			{
				databasewrapper = ((DatabaseWrapper) (values));
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field ContentValues[] val$values>
			//    2    4:astore_1        
				int j = databasewrapper.length;
			//    3    5:aload_1         
			//    4    6:arraylength     
			//    5    7:istore_3        
				for(int i = 0; i < j; i++)
			//*   6    8:iconst_0        
			//*   7    9:istore_2        
			//*   8   10:iload_2         
			//*   9   11:iload_3         
			//*  10   12:icmpge          55
				{
					ContentValues contentvalues = ((ContentValues) (databasewrapper[i]));
			//   11   15:aload_1         
			//   12   16:iload_2         
			//   13   17:aaload          
			//   14   18:astore          4
					int ai[] = count;
			//   15   20:aload_0         
			//   16   21:getfield        #27  <Field int[] val$count>
			//   17   24:astore          5
					ai[0] = ai[0] + bulkInsert(uri, contentvalues);
			//   18   26:aload           5
			//   19   28:iconst_0        
			//   20   29:aload           5
			//   21   31:iconst_0        
			//   22   32:iaload          
			//   23   33:aload_0         
			//   24   34:getfield        #23  <Field BaseContentProvider this$0>
			//   25   37:aload_0         
			//   26   38:getfield        #29  <Field Uri val$uri>
			//   27   41:aload           4
			//   28   43:invokevirtual   #38  <Method int BaseContentProvider.bulkInsert(Uri, ContentValues)>
			//   29   46:iadd            
			//   30   47:iastore         
				}

			//   31   48:iload_2         
			//   32   49:iconst_1        
			//   33   50:iadd            
			//   34   51:istore_2        
			//*  35   52:goto            10
			//   36   55:return          
			}

			final BaseContentProvider this$0;
			final int val$count[];
			final Uri val$uri;
			final ContentValues val$values[];

			
			{
				this$0 = BaseContentProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field BaseContentProvider this$0>
				values = acontentvalues;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field ContentValues[] val$values>
				count = ai;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field int[] val$count>
				uri = uri1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field Uri val$uri>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    7    8:aload_0         
	//    8    9:invokevirtual   #32  <Method DatabaseDefinition getDatabase()>
	//    9   12:new             #6   <Class BaseContentProvider$1>
	//   10   15:dup             
	//   11   16:aload_0         
	//   12   17:aload_2         
	//   13   18:aload_3         
	//   14   19:aload_1         
	//   15   20:invokespecial   #35  <Method void BaseContentProvider$1(BaseContentProvider, ContentValues[], int[], Uri)>
	//   16   23:invokevirtual   #41  <Method void DatabaseDefinition.executeTransaction(ITransaction)>
		getContext().getContentResolver().notifyChange(uri, ((android.database.ContentObserver) (null)));
	//   17   26:aload_0         
	//   18   27:invokevirtual   #45  <Method Context getContext()>
	//   19   30:invokevirtual   #51  <Method ContentResolver Context.getContentResolver()>
	//   20   33:aload_1         
	//   21   34:aconst_null     
	//   22   35:invokevirtual   #57  <Method void ContentResolver.notifyChange(Uri, android.database.ContentObserver)>
		return count[0];
	//   23   38:aload_3         
	//   24   39:iconst_0        
	//   25   40:iaload          
	//   26   41:ireturn         
	}

	protected DatabaseDefinition getDatabase()
	{
		if(database == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field DatabaseDefinition database>
	//*   2    4:ifnonnull       18
			database = FlowManager.getDatabase(getDatabaseName());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #64  <Method String getDatabaseName()>
	//    6   12:invokestatic    #69  <Method DatabaseDefinition FlowManager.getDatabase(String)>
	//    7   15:putfield        #60  <Field DatabaseDefinition database>
		return database;
	//    8   18:aload_0         
	//    9   19:getfield        #60  <Field DatabaseDefinition database>
	//   10   22:areturn         
	}

	protected abstract String getDatabaseName();

	public boolean onCreate()
	{
		if(moduleClass != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Class moduleClass>
	//*   2    4:ifnull          14
			FlowManager.initModule(moduleClass);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Class moduleClass>
	//    5   11:invokestatic    #74  <Method void FlowManager.initModule(Class)>
		return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
	}

	protected DatabaseDefinition database;
	protected Class moduleClass;
}
