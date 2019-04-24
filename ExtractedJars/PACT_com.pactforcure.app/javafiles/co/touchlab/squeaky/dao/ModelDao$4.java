// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import co.touchlab.squeaky.table.GeneratedTableMapper;
import co.touchlab.squeaky.table.TableInfo;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.dao:
//			Query, ModelDao

class ModelDao$4
	implements Query
{

	public String getFromStatement(boolean flag)
		throws SQLException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(ModelDao.access$500(ModelDao.this).getTableConfig().getTableName());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field ModelDao this$0>
	//    7   13:invokestatic    #32  <Method GeneratedTableMapper ModelDao.access$500(ModelDao)>
	//    8   16:invokeinterface #38  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    9   21:invokevirtual   #44  <Method String TableInfo.getTableName()>
	//   10   24:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:pop             
		if(flag)
	//*  12   28:iload_1         
	//*  13   29:ifeq            44
			stringbuilder.append(" ").append("t");
	//   14   32:aload_2         
	//   15   33:ldc1            #50  <String " ">
	//   16   35:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:ldc1            #52  <String "t">
	//   18   40:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   19   43:pop             
		return stringbuilder.toString();
	//   20   44:aload_2         
	//   21   45:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   22   48:areturn         
	}

	public String[] getParameters()
		throws SQLException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getWhereStatement(boolean flag)
		throws SQLException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	final ModelDao this$0;

	ModelDao$4()
	{
		this$0 = ModelDao.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ModelDao this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
