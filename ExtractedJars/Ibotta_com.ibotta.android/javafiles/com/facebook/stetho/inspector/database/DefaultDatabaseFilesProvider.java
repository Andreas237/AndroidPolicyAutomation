// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.stetho.inspector.database:
//			DatabaseFilesProvider

public final class DefaultDatabaseFilesProvider
	implements DatabaseFilesProvider
{

	public DefaultDatabaseFilesProvider(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Context mContext>
	//    5    9:return          
	}

	public List getDatabaseFiles()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #20  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ArrayList()>
	//    3    7:astore_3        
		String as[] = mContext.databaseList();
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field Context mContext>
	//    6   12:invokevirtual   #27  <Method String[] Context.databaseList()>
	//    7   15:astore          4
		int j = as.length;
	//    8   17:aload           4
	//    9   19:arraylength     
	//   10   20:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_1        
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:icmpge          53
			((List) (arraylist)).add(((Object) (new File(as[i]))));
	//   16   28:aload_3         
	//   17   29:new             #29  <Class File>
	//   18   32:dup             
	//   19   33:aload           4
	//   20   35:iload_1         
	//   21   36:aaload          
	//   22   37:invokespecial   #32  <Method void File(String)>
	//   23   40:invokeinterface #38  <Method boolean List.add(Object)>
	//   24   45:pop             

	//   25   46:iload_1         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_1        
	//*  29   50:goto            23
		return ((List) (arraylist));
	//   30   53:aload_3         
	//   31   54:areturn         
	}

	private final Context mContext;
}
