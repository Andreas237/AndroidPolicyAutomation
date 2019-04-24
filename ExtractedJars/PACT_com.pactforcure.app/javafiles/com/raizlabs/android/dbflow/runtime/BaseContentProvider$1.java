// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.runtime;

import android.content.ContentValues;
import android.net.Uri;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.transaction.ITransaction;

// Referenced classes of package com.raizlabs.android.dbflow.runtime:
//			BaseContentProvider

class BaseContentProvider$1
	implements ITransaction
{

	public void execute(DatabaseWrapper databasewrapper)
	{
		databasewrapper = ((DatabaseWrapper) (val$values));
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
			int ai[] = val$count;
	//   15   20:aload_0         
	//   16   21:getfield        #27  <Field int[] val$count>
	//   17   24:astore          5
			ai[0] = ai[0] + bulkInsert(val$uri, contentvalues);
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

	BaseContentProvider$1()
	{
		this$0 = final_basecontentprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field BaseContentProvider this$0>
		val$values = acontentvalues;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field ContentValues[] val$values>
		val$count = ai;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field int[] val$count>
		val$uri = Uri.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field Uri val$uri>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
