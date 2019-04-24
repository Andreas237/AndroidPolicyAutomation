// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;

import android.content.Context;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.structure.database.transaction.ITransaction;
import java.io.File;
import java.io.FileInputStream;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			DatabaseHelperDelegate, DatabaseWrapper

class DatabaseHelperDelegate$1
	implements ITransaction
{

	public void execute(DatabaseWrapper databasewrapper)
	{
		Object obj = ((Object) (FlowManager.getContext()));
	//    0    0:invokestatic    #30  <Method Context FlowManager.getContext()>
	//    1    3:astore_3        
		databasewrapper = ((DatabaseWrapper) (((Context) (obj)).getDatabasePath(DatabaseHelperDelegate.access$000(DatabaseHelperDelegate.this))));
	//    2    4:aload_3         
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field DatabaseHelperDelegate this$0>
	//    5    9:invokestatic    #34  <Method String DatabaseHelperDelegate.access$000(DatabaseHelperDelegate)>
	//    6   12:invokevirtual   #40  <Method File Context.getDatabasePath(String)>
	//    7   15:astore_1        
		File file = ((Context) (obj)).getDatabasePath((new StringBuilder()).append("temp--2-").append(getDatabaseDefinition().getDatabaseFileName()).toString());
	//    8   16:aload_3         
	//    9   17:new             #42  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #43  <Method void StringBuilder()>
	//   12   24:ldc1            #45  <String "temp--2-">
	//   13   26:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:aload_0         
	//   15   30:getfield        #17  <Field DatabaseHelperDelegate this$0>
	//   16   33:invokevirtual   #53  <Method DatabaseDefinition DatabaseHelperDelegate.getDatabaseDefinition()>
	//   17   36:invokevirtual   #59  <Method String DatabaseDefinition.getDatabaseFileName()>
	//   18   39:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   20   45:invokevirtual   #40  <Method File Context.getDatabasePath(String)>
	//   21   48:astore_2        
		if(file.exists())
	//*  22   49:aload_2         
	//*  23   50:invokevirtual   #68  <Method boolean File.exists()>
	//*  24   53:ifeq            61
			file.delete();
	//   25   56:aload_2         
	//   26   57:invokevirtual   #71  <Method boolean File.delete()>
	//   27   60:pop             
		((File) (databasewrapper)).renameTo(file);
	//   28   61:aload_1         
	//   29   62:aload_2         
	//   30   63:invokevirtual   #75  <Method boolean File.renameTo(File)>
	//   31   66:pop             
		if(((File) (databasewrapper)).exists())
	//*  32   67:aload_1         
	//*  33   68:invokevirtual   #68  <Method boolean File.exists()>
	//*  34   71:ifeq            79
			((File) (databasewrapper)).delete();
	//   35   74:aload_1         
	//   36   75:invokevirtual   #71  <Method boolean File.delete()>
	//   37   78:pop             
		obj = ((Object) (((Context) (obj)).getDatabasePath(getDatabaseDefinition().getDatabaseFileName())));
	//   38   79:aload_3         
	//   39   80:aload_0         
	//   40   81:getfield        #17  <Field DatabaseHelperDelegate this$0>
	//   41   84:invokevirtual   #53  <Method DatabaseDefinition DatabaseHelperDelegate.getDatabaseDefinition()>
	//   42   87:invokevirtual   #59  <Method String DatabaseDefinition.getDatabaseFileName()>
	//   43   90:invokevirtual   #40  <Method File Context.getDatabasePath(String)>
	//   44   93:astore_3        
		try
		{
			((File) (databasewrapper)).getParentFile().mkdirs();
	//   45   94:aload_1         
	//   46   95:invokevirtual   #79  <Method File File.getParentFile()>
	//   47   98:invokevirtual   #82  <Method boolean File.mkdirs()>
	//   48  101:pop             
			DatabaseHelperDelegate.access$100(DatabaseHelperDelegate.this, ((File) (databasewrapper)), ((java.io.InputStream) (new FileInputStream(((File) (obj))))));
	//   49  102:aload_0         
	//   50  103:getfield        #17  <Field DatabaseHelperDelegate this$0>
	//   51  106:aload_1         
	//   52  107:new             #84  <Class FileInputStream>
	//   53  110:dup             
	//   54  111:aload_3         
	//   55  112:invokespecial   #87  <Method void FileInputStream(File)>
	//   56  115:invokestatic    #91  <Method void DatabaseHelperDelegate.access$100(DatabaseHelperDelegate, File, java.io.InputStream)>
			file.delete();
	//   57  118:aload_2         
	//   58  119:invokevirtual   #71  <Method boolean File.delete()>
	//   59  122:pop             
			return;
	//   60  123:return          
		}
		// Misplaced declaration of an exception variable
		catch(DatabaseWrapper databasewrapper)
	//*  61  124:astore_1        
		{
			FlowLog.logError(((Throwable) (databasewrapper)));
	//   62  125:aload_1         
	//   63  126:invokestatic    #97  <Method void FlowLog.logError(Throwable)>
		}
	//   64  129:return          
	}

	final DatabaseHelperDelegate this$0;

	DatabaseHelperDelegate$1()
	{
		this$0 = DatabaseHelperDelegate.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DatabaseHelperDelegate this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
