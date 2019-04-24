// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.database;

import android.content.Context;
import android.content.res.AssetManager;
import com.raizlabs.android.dbflow.config.*;
import com.raizlabs.android.dbflow.structure.database.transaction.ITransaction;
import com.raizlabs.android.dbflow.structure.database.transaction.Transaction;
import java.io.*;

// Referenced classes of package com.raizlabs.android.dbflow.structure.database:
//			BaseDatabaseHelper, DatabaseWrapper, DatabaseStatement, OpenHelper, 
//			DatabaseHelperListener

public class DatabaseHelperDelegate extends BaseDatabaseHelper
{

	public DatabaseHelperDelegate(DatabaseHelperListener databasehelperlistener, DatabaseDefinition databasedefinition, OpenHelper openhelper)
	{
		super(databasedefinition);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #20  <Method void BaseDatabaseHelper(DatabaseDefinition)>
		databaseHelperListener = databasehelperlistener;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #22  <Field DatabaseHelperListener databaseHelperListener>
		backupHelper = openhelper;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field OpenHelper backupHelper>
	//    9   15:return          
	}

	private String getTempDbFileName()
	{
		return getTempDbFileName(getDatabaseDefinition());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//    2    4:invokestatic    #48  <Method String getTempDbFileName(DatabaseDefinition)>
	//    3    7:areturn         
	}

	public static String getTempDbFileName(DatabaseDefinition databasedefinition)
	{
		return (new StringBuilder()).append("temp-").append(databasedefinition.getDatabaseName()).append(".db").toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:ldc1            #10  <String "temp-">
	//    4    9:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #62  <Method String DatabaseDefinition.getDatabaseName()>
	//    7   16:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #64  <String ".db">
	//    9   21:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	private void writeDB(File file, InputStream inputstream)
		throws IOException
	{
		file = ((File) (new FileOutputStream(file)));
	//    0    0:new             #69  <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #72  <Method void FileOutputStream(File)>
	//    4    8:astore_1        
		byte abyte0[] = new byte[1024];
	//    5    9:sipush          1024
	//    6   12:newarray        byte[]
	//    7   14:astore          4
		do
		{
			int i = inputstream.read(abyte0);
	//    8   16:aload_2         
	//    9   17:aload           4
	//   10   19:invokevirtual   #78  <Method int InputStream.read(byte[])>
	//   11   22:istore_3        
			if(i > 0)
	//*  12   23:iload_3         
	//*  13   24:ifle            38
			{
				((OutputStream) (file)).write(abyte0, 0, i);
	//   14   27:aload_1         
	//   15   28:aload           4
	//   16   30:iconst_0        
	//   17   31:iload_3         
	//   18   32:invokevirtual   #84  <Method void OutputStream.write(byte[], int, int)>
			} else
	//*  19   35:goto            16
			{
				((OutputStream) (file)).flush();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #87  <Method void OutputStream.flush()>
				((OutputStream) (file)).close();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #90  <Method void OutputStream.close()>
				inputstream.close();
	//   24   46:aload_2         
	//   25   47:invokevirtual   #91  <Method void InputStream.close()>
				return;
	//   26   50:return          
			}
		} while(true);
	}

	public void backupDB()
	{
		if(!getDatabaseDefinition().backupEnabled() || !getDatabaseDefinition().areConsistencyChecksEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//*   2    4:invokevirtual   #96  <Method boolean DatabaseDefinition.backupEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//*   6   14:invokevirtual   #99  <Method boolean DatabaseDefinition.areConsistencyChecksEnabled()>
	//*   7   17:ifne            58
		{
			throw new IllegalStateException((new StringBuilder()).append("Backups are not enabled for : ").append(getDatabaseDefinition().getDatabaseName()).append(". Please consider adding both backupEnabled and consistency checks enabled to the Database annotation").toString());
	//    8   20:new             #101 <Class IllegalStateException>
	//    9   23:dup             
	//   10   24:new             #50  <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #53  <Method void StringBuilder()>
	//   13   31:ldc1            #103 <String "Backups are not enabled for : ">
	//   14   33:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   17   40:invokevirtual   #62  <Method String DatabaseDefinition.getDatabaseName()>
	//   18   43:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   19   46:ldc1            #105 <String ". Please consider adding both backupEnabled and consistency checks enabled to the Database annotation">
	//   20   48:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   21   51:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   22   54:invokespecial   #108 <Method void IllegalStateException(String)>
	//   23   57:athrow          
		} else
		{
			getDatabaseDefinition().beginTransactionAsync(new ITransaction() {

				public void execute(DatabaseWrapper databasewrapper)
				{
					Object obj = ((Object) (FlowManager.getContext()));
				//    0    0:invokestatic    #30  <Method Context FlowManager.getContext()>
				//    1    3:astore_3        
					databasewrapper = ((DatabaseWrapper) (((Context) (obj)).getDatabasePath(getTempDbFileName())));
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
						writeDB(((File) (databasewrapper)), ((InputStream) (new FileInputStream(((File) (obj))))));
				//   49  102:aload_0         
				//   50  103:getfield        #17  <Field DatabaseHelperDelegate this$0>
				//   51  106:aload_1         
				//   52  107:new             #84  <Class FileInputStream>
				//   53  110:dup             
				//   54  111:aload_3         
				//   55  112:invokespecial   #87  <Method void FileInputStream(File)>
				//   56  115:invokestatic    #91  <Method void DatabaseHelperDelegate.access$100(DatabaseHelperDelegate, File, InputStream)>
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
).build().execute();
	//   24   58:aload_0         
	//   25   59:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   26   62:new             #6   <Class DatabaseHelperDelegate$1>
	//   27   65:dup             
	//   28   66:aload_0         
	//   29   67:invokespecial   #111 <Method void DatabaseHelperDelegate$1(DatabaseHelperDelegate)>
	//   30   70:invokevirtual   #115 <Method com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder DatabaseDefinition.beginTransactionAsync(ITransaction)>
	//   31   73:invokevirtual   #121 <Method Transaction com.raizlabs.android.dbflow.structure.database.transaction.Transaction$Builder.build()>
	//   32   76:invokevirtual   #126 <Method void Transaction.execute()>
			return;
	//   33   79:return          
		}
	}

	public DatabaseWrapper getWritableDatabase()
	{
		return getDatabaseDefinition().getWritableDatabase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//    2    4:invokevirtual   #130 <Method DatabaseWrapper DatabaseDefinition.getWritableDatabase()>
	//    3    7:areturn         
	}

	public boolean isDatabaseIntegrityOk()
	{
		return isDatabaseIntegrityOk(getWritableDatabase());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #132 <Method DatabaseWrapper getWritableDatabase()>
	//    3    5:invokevirtual   #135 <Method boolean isDatabaseIntegrityOk(DatabaseWrapper)>
	//    4    8:ireturn         
	}

	public boolean isDatabaseIntegrityOk(DatabaseWrapper databasewrapper)
	{
		boolean flag;
		DatabaseWrapper databasewrapper1;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		databasewrapper1 = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		databasewrapper = ((DatabaseWrapper) (databasewrapper.compileStatement("PRAGMA quick_check(1)")));
	//    4    4:aload_1         
	//    5    5:ldc1            #137 <String "PRAGMA quick_check(1)">
	//    6    7:invokeinterface #143 <Method DatabaseStatement DatabaseWrapper.compileStatement(String)>
	//    7   12:astore_1        
		databasewrapper1 = databasewrapper;
	//    8   13:aload_1         
	//    9   14:astore_3        
		String s = ((DatabaseStatement) (databasewrapper)).simpleQueryForString();
	//   10   15:aload_1         
	//   11   16:invokeinterface #148 <Method String DatabaseStatement.simpleQueryForString()>
	//   12   21:astore          4
		databasewrapper1 = databasewrapper;
	//   13   23:aload_1         
	//   14   24:astore_3        
		if(s.equalsIgnoreCase("ok"))
			break MISSING_BLOCK_LABEL_99;
	//   15   25:aload           4
	//   16   27:ldc1            #150 <String "ok">
	//   17   29:invokevirtual   #156 <Method boolean String.equalsIgnoreCase(String)>
	//   18   32:ifne            99
		databasewrapper1 = databasewrapper;
	//   19   35:aload_1         
	//   20   36:astore_3        
		FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.E, (new StringBuilder()).append("PRAGMA integrity_check on ").append(getDatabaseDefinition().getDatabaseName()).append(" returned: ").append(s).toString());
	//   21   37:getstatic       #162 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.E>
	//   22   40:new             #50  <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #53  <Method void StringBuilder()>
	//   25   47:ldc1            #164 <String "PRAGMA integrity_check on ">
	//   26   49:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:aload_0         
	//   28   53:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   29   56:invokevirtual   #62  <Method String DatabaseDefinition.getDatabaseName()>
	//   30   59:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:ldc1            #166 <String " returned: ">
	//   32   64:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:aload           4
	//   34   69:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   36   75:invokestatic    #172 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		flag = false;
	//   37   78:iconst_0        
	//   38   79:istore_2        
		databasewrapper1 = databasewrapper;
	//   39   80:aload_1         
	//   40   81:astore_3        
		if(!getDatabaseDefinition().backupEnabled())
			break MISSING_BLOCK_LABEL_99;
	//   41   82:aload_0         
	//   42   83:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   43   86:invokevirtual   #96  <Method boolean DatabaseDefinition.backupEnabled()>
	//   44   89:ifeq            99
		databasewrapper1 = databasewrapper;
	//   45   92:aload_1         
	//   46   93:astore_3        
		flag = restoreBackUp();
	//   47   94:aload_0         
	//   48   95:invokevirtual   #175 <Method boolean restoreBackUp()>
	//   49   98:istore_2        
		if(databasewrapper != null)
	//*  50   99:aload_1         
	//*  51  100:ifnull          109
			((DatabaseStatement) (databasewrapper)).close();
	//   52  103:aload_1         
	//   53  104:invokeinterface #176 <Method void DatabaseStatement.close()>
		return flag;
	//   54  109:iload_2         
	//   55  110:ireturn         
		databasewrapper;
	//   56  111:astore_1        
		if(databasewrapper1 != null)
	//*  57  112:aload_3         
	//*  58  113:ifnull          122
			((DatabaseStatement) (databasewrapper1)).close();
	//   59  116:aload_3         
	//   60  117:invokeinterface #176 <Method void DatabaseStatement.close()>
		throw databasewrapper;
	//   61  122:aload_1         
	//   62  123:athrow          
	}

	public void movePrepackagedDB(String s, String s1)
	{
		File file;
		file = FlowManager.getContext().getDatabasePath(s);
	//    0    0:invokestatic    #184 <Method Context FlowManager.getContext()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #190 <Method File Context.getDatabasePath(String)>
	//    3    7:astore_3        
		if(file.exists() && (!getDatabaseDefinition().areConsistencyChecksEnabled() || getDatabaseDefinition().areConsistencyChecksEnabled() && isDatabaseIntegrityOk(getWritableDatabase())))
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #195 <Method boolean File.exists()>
	//*   6   12:ifeq            47
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//*   9   19:invokevirtual   #99  <Method boolean DatabaseDefinition.areConsistencyChecksEnabled()>
	//*  10   22:ifeq            46
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//*  13   29:invokevirtual   #99  <Method boolean DatabaseDefinition.areConsistencyChecksEnabled()>
	//*  14   32:ifeq            47
	//*  15   35:aload_0         
	//*  16   36:aload_0         
	//*  17   37:invokevirtual   #132 <Method DatabaseWrapper getWritableDatabase()>
	//*  18   40:invokevirtual   #135 <Method boolean isDatabaseIntegrityOk(DatabaseWrapper)>
	//*  19   43:ifeq            47
			return;
	//   20   46:return          
		file.getParentFile().mkdirs();
	//   21   47:aload_3         
	//   22   48:invokevirtual   #199 <Method File File.getParentFile()>
	//   23   51:invokevirtual   #202 <Method boolean File.mkdirs()>
	//   24   54:pop             
		s = ((String) (FlowManager.getContext().getDatabasePath(getTempDbFileName())));
	//   25   55:invokestatic    #184 <Method Context FlowManager.getContext()>
	//   26   58:aload_0         
	//   27   59:invokespecial   #32  <Method String getTempDbFileName()>
	//   28   62:invokevirtual   #190 <Method File Context.getDatabasePath(String)>
	//   29   65:astore_1        
		if(!((File) (s)).exists() || getDatabaseDefinition().backupEnabled() && (!getDatabaseDefinition().backupEnabled() || backupHelper == null || !isDatabaseIntegrityOk(backupHelper.getDatabase())))
			break MISSING_BLOCK_LABEL_143;
	//   30   66:aload_1         
	//   31   67:invokevirtual   #195 <Method boolean File.exists()>
	//   32   70:ifeq            143
	//   33   73:aload_0         
	//   34   74:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   35   77:invokevirtual   #96  <Method boolean DatabaseDefinition.backupEnabled()>
	//   36   80:ifeq            116
	//   37   83:aload_0         
	//   38   84:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   39   87:invokevirtual   #96  <Method boolean DatabaseDefinition.backupEnabled()>
	//   40   90:ifeq            143
	//   41   93:aload_0         
	//   42   94:getfield        #24  <Field OpenHelper backupHelper>
	//   43   97:ifnull          143
	//   44  100:aload_0         
	//   45  101:aload_0         
	//   46  102:getfield        #24  <Field OpenHelper backupHelper>
	//   47  105:invokeinterface #207 <Method DatabaseWrapper OpenHelper.getDatabase()>
	//   48  110:invokevirtual   #135 <Method boolean isDatabaseIntegrityOk(DatabaseWrapper)>
	//   49  113:ifeq            143
		s = ((String) (new FileInputStream(((File) (s)))));
	//   50  116:new             #209 <Class FileInputStream>
	//   51  119:dup             
	//   52  120:aload_1         
	//   53  121:invokespecial   #210 <Method void FileInputStream(File)>
	//   54  124:astore_1        
_L1:
		writeDB(file, ((InputStream) (s)));
	//   55  125:aload_0         
	//   56  126:aload_3         
	//   57  127:aload_1         
	//   58  128:invokespecial   #40  <Method void writeDB(File, InputStream)>
		return;
	//   59  131:return          
	//*  60  132:astore_1        
	//*  61  133:getstatic       #213 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.W>
	//*  62  136:ldc1            #215 <String "Failed to open file">
	//*  63  138:aload_1         
	//*  64  139:invokestatic    #218 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String, Throwable)>
	//*  65  142:return          
		try
		{
			s = ((String) (FlowManager.getContext().getAssets().open(s1)));
	//   66  143:invokestatic    #184 <Method Context FlowManager.getContext()>
	//   67  146:invokevirtual   #222 <Method AssetManager Context.getAssets()>
	//   68  149:aload_2         
	//   69  150:invokevirtual   #228 <Method InputStream AssetManager.open(String)>
	//   70  153:astore_1        
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.W, "Failed to open file", ((Throwable) (s)));
			return;
		}
		  goto _L1
	//*  71  154:goto            125
	}

	public void onCreate(DatabaseWrapper databasewrapper)
	{
		if(databaseHelperListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field DatabaseHelperListener databaseHelperListener>
	//*   2    4:ifnull          17
			databaseHelperListener.onCreate(databasewrapper);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field DatabaseHelperListener databaseHelperListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #234 <Method void DatabaseHelperListener.onCreate(DatabaseWrapper)>
		super.onCreate(databasewrapper);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokespecial   #235 <Method void BaseDatabaseHelper.onCreate(DatabaseWrapper)>
	//   10   22:return          
	}

	public void onOpen(DatabaseWrapper databasewrapper)
	{
		if(databaseHelperListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field DatabaseHelperListener databaseHelperListener>
	//*   2    4:ifnull          17
			databaseHelperListener.onOpen(databasewrapper);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field DatabaseHelperListener databaseHelperListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #238 <Method void DatabaseHelperListener.onOpen(DatabaseWrapper)>
		super.onOpen(databasewrapper);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokespecial   #239 <Method void BaseDatabaseHelper.onOpen(DatabaseWrapper)>
	//   10   22:return          
	}

	public void onUpgrade(DatabaseWrapper databasewrapper, int i, int j)
	{
		if(databaseHelperListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field DatabaseHelperListener databaseHelperListener>
	//*   2    4:ifnull          19
			databaseHelperListener.onUpgrade(databasewrapper, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field DatabaseHelperListener databaseHelperListener>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #243 <Method void DatabaseHelperListener.onUpgrade(DatabaseWrapper, int, int)>
		super.onUpgrade(databasewrapper, i, j);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:iload_3         
	//   13   23:invokespecial   #244 <Method void BaseDatabaseHelper.onUpgrade(DatabaseWrapper, int, int)>
	//   14   26:return          
	}

	public void performRestoreFromBackup()
	{
		movePrepackagedDB(getDatabaseDefinition().getDatabaseFileName(), getDatabaseDefinition().getDatabaseFileName());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//    3    5:invokevirtual   #248 <Method String DatabaseDefinition.getDatabaseFileName()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//    6   12:invokevirtual   #248 <Method String DatabaseDefinition.getDatabaseFileName()>
	//    7   15:invokevirtual   #250 <Method void movePrepackagedDB(String, String)>
		if(getDatabaseDefinition().backupEnabled())
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//*  10   22:invokevirtual   #96  <Method boolean DatabaseDefinition.backupEnabled()>
	//*  11   25:ifeq            70
		{
			if(backupHelper == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #24  <Field OpenHelper backupHelper>
	//*  14   32:ifnonnull       45
				throw new IllegalStateException("the passed backup helper was null, even though backup is enabled. Ensure that its passed in.");
	//   15   35:new             #101 <Class IllegalStateException>
	//   16   38:dup             
	//   17   39:ldc1            #252 <String "the passed backup helper was null, even though backup is enabled. Ensure that its passed in.">
	//   18   41:invokespecial   #108 <Method void IllegalStateException(String)>
	//   19   44:athrow          
			restoreDatabase(getTempDbFileName(), getDatabaseDefinition().getDatabaseFileName());
	//   20   45:aload_0         
	//   21   46:aload_0         
	//   22   47:invokespecial   #32  <Method String getTempDbFileName()>
	//   23   50:aload_0         
	//   24   51:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   25   54:invokevirtual   #248 <Method String DatabaseDefinition.getDatabaseFileName()>
	//   26   57:invokevirtual   #255 <Method void restoreDatabase(String, String)>
			backupHelper.getDatabase();
	//   27   60:aload_0         
	//   28   61:getfield        #24  <Field OpenHelper backupHelper>
	//   29   64:invokeinterface #207 <Method DatabaseWrapper OpenHelper.getDatabase()>
	//   30   69:pop             
		}
	//   31   70:return          
	}

	public boolean restoreBackUp()
	{
		File file = FlowManager.getContext().getDatabasePath((new StringBuilder()).append("temp-").append(getDatabaseDefinition().getDatabaseName()).toString());
	//    0    0:invokestatic    #184 <Method Context FlowManager.getContext()>
	//    1    3:new             #50  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #53  <Method void StringBuilder()>
	//    4   10:ldc1            #10  <String "temp-">
	//    5   12:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//    8   19:invokevirtual   #62  <Method String DatabaseDefinition.getDatabaseName()>
	//    9   22:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   10   25:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   11   28:invokevirtual   #190 <Method File Context.getDatabasePath(String)>
	//   12   31:astore_1        
		File file1 = FlowManager.getContext().getDatabasePath(getDatabaseDefinition().getDatabaseName());
	//   13   32:invokestatic    #184 <Method Context FlowManager.getContext()>
	//   14   35:aload_0         
	//   15   36:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   16   39:invokevirtual   #62  <Method String DatabaseDefinition.getDatabaseName()>
	//   17   42:invokevirtual   #190 <Method File Context.getDatabasePath(String)>
	//   18   45:astore_2        
		if(file1.delete())
	//*  19   46:aload_2         
	//*  20   47:invokevirtual   #258 <Method boolean File.delete()>
	//*  21   50:ifeq            75
		{
			try
			{
				writeDB(file1, ((InputStream) (new FileInputStream(file))));
	//   22   53:aload_0         
	//   23   54:aload_2         
	//   24   55:new             #209 <Class FileInputStream>
	//   25   58:dup             
	//   26   59:aload_1         
	//   27   60:invokespecial   #210 <Method void FileInputStream(File)>
	//   28   63:invokespecial   #40  <Method void writeDB(File, InputStream)>
			}
	//*  29   66:iconst_1        
	//*  30   67:ireturn         
			catch(IOException ioexception)
	//*  31   68:astore_1        
			{
				FlowLog.logError(((Throwable) (ioexception)));
	//   32   69:aload_1         
	//   33   70:invokestatic    #262 <Method void FlowLog.logError(Throwable)>
				return false;
	//   34   73:iconst_0        
	//   35   74:ireturn         
			}
			return true;
		} else
		{
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.E, "Failed to delete DB");
	//   36   75:getstatic       #162 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.E>
	//   37   78:ldc2            #264 <String "Failed to delete DB">
	//   38   81:invokestatic    #172 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
			return true;
	//   39   84:iconst_1        
	//   40   85:ireturn         
		}
	}

	public void restoreDatabase(String s, String s1)
	{
		File file;
		file = FlowManager.getContext().getDatabasePath(s);
	//    0    0:invokestatic    #184 <Method Context FlowManager.getContext()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #190 <Method File Context.getDatabasePath(String)>
	//    3    7:astore_3        
		if(file.exists())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #195 <Method boolean File.exists()>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		file.getParentFile().mkdirs();
	//    8   16:aload_3         
	//    9   17:invokevirtual   #199 <Method File File.getParentFile()>
	//   10   20:invokevirtual   #202 <Method boolean File.mkdirs()>
	//   11   23:pop             
		s = ((String) (FlowManager.getContext().getDatabasePath(getDatabaseDefinition().getDatabaseFileName())));
	//   12   24:invokestatic    #184 <Method Context FlowManager.getContext()>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   15   31:invokevirtual   #248 <Method String DatabaseDefinition.getDatabaseFileName()>
	//   16   34:invokevirtual   #190 <Method File Context.getDatabasePath(String)>
	//   17   37:astore_1        
		if(!((File) (s)).exists() || !getDatabaseDefinition().backupEnabled() || backupHelper == null || !isDatabaseIntegrityOk(backupHelper.getDatabase()))
			break MISSING_BLOCK_LABEL_100;
	//   18   38:aload_1         
	//   19   39:invokevirtual   #195 <Method boolean File.exists()>
	//   20   42:ifeq            100
	//   21   45:aload_0         
	//   22   46:invokevirtual   #45  <Method DatabaseDefinition getDatabaseDefinition()>
	//   23   49:invokevirtual   #96  <Method boolean DatabaseDefinition.backupEnabled()>
	//   24   52:ifeq            100
	//   25   55:aload_0         
	//   26   56:getfield        #24  <Field OpenHelper backupHelper>
	//   27   59:ifnull          100
	//   28   62:aload_0         
	//   29   63:aload_0         
	//   30   64:getfield        #24  <Field OpenHelper backupHelper>
	//   31   67:invokeinterface #207 <Method DatabaseWrapper OpenHelper.getDatabase()>
	//   32   72:invokevirtual   #135 <Method boolean isDatabaseIntegrityOk(DatabaseWrapper)>
	//   33   75:ifeq            100
		s = ((String) (new FileInputStream(((File) (s)))));
	//   34   78:new             #209 <Class FileInputStream>
	//   35   81:dup             
	//   36   82:aload_1         
	//   37   83:invokespecial   #210 <Method void FileInputStream(File)>
	//   38   86:astore_1        
_L1:
		writeDB(file, ((InputStream) (s)));
	//   39   87:aload_0         
	//   40   88:aload_3         
	//   41   89:aload_1         
	//   42   90:invokespecial   #40  <Method void writeDB(File, InputStream)>
		return;
	//   43   93:return          
	//*  44   94:astore_1        
	//*  45   95:aload_1         
	//*  46   96:invokestatic    #262 <Method void FlowLog.logError(Throwable)>
	//*  47   99:return          
		try
		{
			s = ((String) (FlowManager.getContext().getAssets().open(s1)));
	//   48  100:invokestatic    #184 <Method Context FlowManager.getContext()>
	//   49  103:invokevirtual   #222 <Method AssetManager Context.getAssets()>
	//   50  106:aload_2         
	//   51  107:invokevirtual   #228 <Method InputStream AssetManager.open(String)>
	//   52  110:astore_1        
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			FlowLog.logError(((Throwable) (s)));
			return;
		}
		  goto _L1
	//*  53  111:goto            87
	}

	public void setDatabaseHelperListener(DatabaseHelperListener databasehelperlistener)
	{
		databaseHelperListener = databasehelperlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DatabaseHelperListener databaseHelperListener>
	//    3    5:return          
	}

	public static final String TEMP_DB_NAME = "temp-";
	private final OpenHelper backupHelper;
	private DatabaseHelperListener databaseHelperListener;


/*
	static String access$000(DatabaseHelperDelegate databasehelperdelegate)
	{
		return databasehelperdelegate.getTempDbFileName();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method String getTempDbFileName()>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(DatabaseHelperDelegate databasehelperdelegate, File file, InputStream inputstream)
		throws IOException
	{
		databasehelperdelegate.writeDB(file, inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void writeDB(File, InputStream)>
		return;
	//    4    6:return          
	}

*/
}
