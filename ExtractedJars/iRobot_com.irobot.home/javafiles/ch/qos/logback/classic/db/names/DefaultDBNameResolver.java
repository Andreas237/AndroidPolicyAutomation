// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.db.names;


// Referenced classes of package ch.qos.logback.classic.db.names:
//			DBNameResolver

public class DefaultDBNameResolver
	implements DBNameResolver
{

	public DefaultDBNameResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public String getColumnName(Enum enum)
	{
		return enum.toString().toLowerCase();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #19  <Method String Enum.toString()>
	//    2    4:invokevirtual   #24  <Method String String.toLowerCase()>
	//    3    7:areturn         
	}

	public String getTableName(Enum enum)
	{
		return enum.toString().toLowerCase();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #19  <Method String Enum.toString()>
	//    2    4:invokevirtual   #24  <Method String String.toLowerCase()>
	//    3    7:areturn         
	}
}
