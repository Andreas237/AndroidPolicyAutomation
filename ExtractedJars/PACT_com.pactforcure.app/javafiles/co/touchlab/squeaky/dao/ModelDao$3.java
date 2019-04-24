// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import co.touchlab.squeaky.table.GeneratedTableMapper;
import co.touchlab.squeaky.table.TableInfo;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.dao:
//			Query, ModelDao

class ModelDao$3
	implements Query
{

	public String getFromStatement(boolean flag)
		throws SQLException
	{
		return ModelDao.access$500(ModelDao.this).getTableConfig().getTableName();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ModelDao this$0>
	//    2    4:invokestatic    #33  <Method GeneratedTableMapper ModelDao.access$500(ModelDao)>
	//    3    7:invokeinterface #39  <Method TableInfo GeneratedTableMapper.getTableConfig()>
	//    4   12:invokevirtual   #45  <Method String TableInfo.getTableName()>
	//    5   15:areturn         
	}

	public String[] getParameters()
		throws SQLException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getWhereStatement(boolean flag)
	{
		return val$sb.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field StringBuilder val$sb>
	//    2    4:invokevirtual   #54  <Method String StringBuilder.toString()>
	//    3    7:areturn         
	}

	final ModelDao this$0;
	final StringBuilder val$sb;

	ModelDao$3()
	{
		this$0 = final_modeldao;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ModelDao this$0>
		val$sb = StringBuilder.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field StringBuilder val$sb>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
