// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.db.names;


// Referenced classes of package ch.qos.logback.classic.db.names:
//			DBNameResolver

public class SimpleDBNameResolver
	implements DBNameResolver
{

	public SimpleDBNameResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		tableNamePrefix = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String "">
	//    4    7:putfield        #19  <Field String tableNamePrefix>
		tableNameSuffix = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #17  <String "">
	//    7   13:putfield        #21  <Field String tableNameSuffix>
		columnNamePrefix = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #17  <String "">
	//   10   19:putfield        #23  <Field String columnNamePrefix>
		columnNameSuffix = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #17  <String "">
	//   13   25:putfield        #25  <Field String columnNameSuffix>
	//   14   28:return          
	}

	public String getColumnName(Enum enum)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(columnNamePrefix);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String columnNamePrefix>
	//    7   13:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(enum.name().toLowerCase());
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #41  <Method String Enum.name()>
	//   12   22:invokevirtual   #46  <Method String String.toLowerCase()>
	//   13   25:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(columnNameSuffix);
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #25  <Field String columnNameSuffix>
	//   18   34:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		return stringbuilder.toString();
	//   20   38:aload_2         
	//   21   39:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   22   42:areturn         
	}

	public String getTableName(Enum enum)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #30  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(tableNamePrefix);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field String tableNamePrefix>
	//    7   13:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(enum.name().toLowerCase());
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #41  <Method String Enum.name()>
	//   12   22:invokevirtual   #46  <Method String String.toLowerCase()>
	//   13   25:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		stringbuilder.append(tableNameSuffix);
	//   15   29:aload_2         
	//   16   30:aload_0         
	//   17   31:getfield        #21  <Field String tableNameSuffix>
	//   18   34:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		return stringbuilder.toString();
	//   20   38:aload_2         
	//   21   39:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   22   42:areturn         
	}

	public void setColumnNamePrefix(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            10
			s = "";
	//    3    7:ldc1            #17  <String "">
	//    4    9:astore_1        
		columnNamePrefix = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #23  <Field String columnNamePrefix>
	//    8   15:return          
	}

	public void setColumnNameSuffix(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            10
			s = "";
	//    3    7:ldc1            #17  <String "">
	//    4    9:astore_1        
		columnNameSuffix = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #25  <Field String columnNameSuffix>
	//    8   15:return          
	}

	public void setTableNamePrefix(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            10
			s = "";
	//    3    7:ldc1            #17  <String "">
	//    4    9:astore_1        
		tableNamePrefix = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #19  <Field String tableNamePrefix>
	//    8   15:return          
	}

	public void setTableNameSuffix(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            10
			s = "";
	//    3    7:ldc1            #17  <String "">
	//    4    9:astore_1        
		tableNameSuffix = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #21  <Field String tableNameSuffix>
	//    8   15:return          
	}

	private String columnNamePrefix;
	private String columnNameSuffix;
	private String tableNamePrefix;
	private String tableNameSuffix;
}
