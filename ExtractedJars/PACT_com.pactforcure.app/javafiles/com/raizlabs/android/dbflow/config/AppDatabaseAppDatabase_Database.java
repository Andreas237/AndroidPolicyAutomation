// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.config;

import com.pactforcure.app.core.AppDatabase;
import com.pactforcure.app.participant.Participant;
import com.pactforcure.app.participant.Participant_Table;
import com.pactforcure.app.survey.Answer;
import com.pactforcure.app.survey.Answer_Table;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.raizlabs.android.dbflow.config:
//			DatabaseDefinition, DatabaseHolder

public final class AppDatabaseAppDatabase_Database extends DatabaseDefinition
{

	public AppDatabaseAppDatabase_Database(DatabaseHolder databaseholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void DatabaseDefinition()>
		databaseholder.putDatabaseForTable(com/pactforcure/app/survey/Answer, ((DatabaseDefinition) (this)));
	//    2    4:aload_1         
	//    3    5:ldc1            #11  <Class Answer>
	//    4    7:aload_0         
	//    5    8:invokevirtual   #17  <Method void DatabaseHolder.putDatabaseForTable(Class, DatabaseDefinition)>
		databaseholder.putDatabaseForTable(com/pactforcure/app/participant/Participant, ((DatabaseDefinition) (this)));
	//    6   11:aload_1         
	//    7   12:ldc1            #19  <Class Participant>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #17  <Method void DatabaseHolder.putDatabaseForTable(Class, DatabaseDefinition)>
		models.add(com/pactforcure/app/survey/Answer);
	//   10   18:aload_0         
	//   11   19:getfield        #23  <Field List models>
	//   12   22:ldc1            #11  <Class Answer>
	//   13   24:invokeinterface #29  <Method boolean List.add(Object)>
	//   14   29:pop             
		modelTableNames.put("Answer", com/pactforcure/app/survey/Answer);
	//   15   30:aload_0         
	//   16   31:getfield        #33  <Field Map modelTableNames>
	//   17   34:ldc1            #35  <String "Answer">
	//   18   36:ldc1            #11  <Class Answer>
	//   19   38:invokeinterface #41  <Method Object Map.put(Object, Object)>
	//   20   43:pop             
		modelAdapters.put(com/pactforcure/app/survey/Answer, ((Object) (new Answer_Table(databaseholder, ((DatabaseDefinition) (this))))));
	//   21   44:aload_0         
	//   22   45:getfield        #44  <Field Map modelAdapters>
	//   23   48:ldc1            #11  <Class Answer>
	//   24   50:new             #46  <Class Answer_Table>
	//   25   53:dup             
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:invokespecial   #49  <Method void Answer_Table(DatabaseHolder, DatabaseDefinition)>
	//   29   59:invokeinterface #41  <Method Object Map.put(Object, Object)>
	//   30   64:pop             
		models.add(com/pactforcure/app/participant/Participant);
	//   31   65:aload_0         
	//   32   66:getfield        #23  <Field List models>
	//   33   69:ldc1            #19  <Class Participant>
	//   34   71:invokeinterface #29  <Method boolean List.add(Object)>
	//   35   76:pop             
		modelTableNames.put("Participant", com/pactforcure/app/participant/Participant);
	//   36   77:aload_0         
	//   37   78:getfield        #33  <Field Map modelTableNames>
	//   38   81:ldc1            #51  <String "Participant">
	//   39   83:ldc1            #19  <Class Participant>
	//   40   85:invokeinterface #41  <Method Object Map.put(Object, Object)>
	//   41   90:pop             
		modelAdapters.put(com/pactforcure/app/participant/Participant, ((Object) (new Participant_Table(databaseholder, ((DatabaseDefinition) (this))))));
	//   42   91:aload_0         
	//   43   92:getfield        #44  <Field Map modelAdapters>
	//   44   95:ldc1            #19  <Class Participant>
	//   45   97:new             #53  <Class Participant_Table>
	//   46  100:dup             
	//   47  101:aload_1         
	//   48  102:aload_0         
	//   49  103:invokespecial   #54  <Method void Participant_Table(DatabaseHolder, DatabaseDefinition)>
	//   50  106:invokeinterface #41  <Method Object Map.put(Object, Object)>
	//   51  111:pop             
	//   52  112:return          
	}

	public final boolean areConsistencyChecksEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean backupEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Class getAssociatedDatabaseClassFile()
	{
		return com/pactforcure/app/core/AppDatabase;
	//    0    0:ldc1            #62  <Class AppDatabase>
	//    1    2:areturn         
	}

	public final String getDatabaseName()
	{
		return "AppDatabase";
	//    0    0:ldc1            #68  <String "AppDatabase">
	//    1    2:areturn         
	}

	public final int getDatabaseVersion()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final boolean isForeignKeysSupported()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isInMemory()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
