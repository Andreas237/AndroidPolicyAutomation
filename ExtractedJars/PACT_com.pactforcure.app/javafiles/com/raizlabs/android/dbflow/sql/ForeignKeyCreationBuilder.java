// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql;

import com.raizlabs.android.dbflow.annotation.ForeignKeyAction;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.raizlabs.android.dbflow.sql:
//			QueryBuilder

public class ForeignKeyCreationBuilder extends QueryBuilder
{

	public ForeignKeyCreationBuilder()
	{
		super("FOREIGN KEY(");
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <String "FOREIGN KEY(">
	//    2    3:invokespecial   #19  <Method void QueryBuilder(Object)>
	//    3    6:aload_0         
	//    4    7:new             #21  <Class ArrayList>
	//    5   10:dup             
	//    6   11:invokespecial   #23  <Method void ArrayList()>
	//    7   14:putfield        #25  <Field List foreignColumns>
	//    8   17:aload_0         
	//    9   18:new             #21  <Class ArrayList>
	//   10   21:dup             
	//   11   22:invokespecial   #23  <Method void ArrayList()>
	//   12   25:putfield        #27  <Field List columns>
	//   13   28:aload_0         
	//   14   29:new             #21  <Class ArrayList>
	//   15   32:dup             
	//   16   33:invokespecial   #23  <Method void ArrayList()>
	//   17   36:putfield        #29  <Field List updateConflicts>
	//   18   39:aload_0         
	//   19   40:new             #21  <Class ArrayList>
	//   20   43:dup             
	//   21   44:invokespecial   #23  <Method void ArrayList()>
	//   22   47:putfield        #31  <Field List deleteConflicts>
	//   23   50:return          
	}

	public ForeignKeyCreationBuilder addReference(ForeignKeyReference foreignkeyreference, ForeignKeyAction foreignkeyaction, ForeignKeyAction foreignkeyaction1)
	{
		foreignColumns.add(((Object) (foreignkeyreference.foreignKeyColumnName())));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List foreignColumns>
	//    2    4:aload_1         
	//    3    5:invokeinterface #40  <Method String ForeignKeyReference.foreignKeyColumnName()>
	//    4   10:invokeinterface #46  <Method boolean List.add(Object)>
	//    5   15:pop             
		columns.add(((Object) (foreignkeyreference.columnName())));
	//    6   16:aload_0         
	//    7   17:getfield        #27  <Field List columns>
	//    8   20:aload_1         
	//    9   21:invokeinterface #49  <Method String ForeignKeyReference.columnName()>
	//   10   26:invokeinterface #46  <Method boolean List.add(Object)>
	//   11   31:pop             
		updateConflicts.add(((Object) (foreignkeyaction)));
	//   12   32:aload_0         
	//   13   33:getfield        #29  <Field List updateConflicts>
	//   14   36:aload_2         
	//   15   37:invokeinterface #46  <Method boolean List.add(Object)>
	//   16   42:pop             
		deleteConflicts.add(((Object) (foreignkeyaction1)));
	//   17   43:aload_0         
	//   18   44:getfield        #31  <Field List deleteConflicts>
	//   19   47:aload_3         
	//   20   48:invokeinterface #46  <Method boolean List.add(Object)>
	//   21   53:pop             
		return this;
	//   22   54:aload_0         
	//   23   55:areturn         
	}

	private final List columns = new ArrayList();
	private final List deleteConflicts = new ArrayList();
	private final List foreignColumns = new ArrayList();
	private final List updateConflicts = new ArrayList();
}
