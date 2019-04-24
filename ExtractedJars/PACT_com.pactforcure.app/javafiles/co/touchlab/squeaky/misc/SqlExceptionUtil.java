// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.misc;

import java.sql.SQLException;

public class SqlExceptionUtil
{

	private SqlExceptionUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static SQLException create(String s, Throwable throwable)
	{
		if(throwable instanceof SQLException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #13  <Class SQLException>
	//*   2    4:ifeq            31
			s = ((String) (new SQLException(s, ((SQLException)throwable).getSQLState())));
	//    3    7:new             #13  <Class SQLException>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:checkcast       #13  <Class SQLException>
	//    8   16:invokevirtual   #17  <Method String SQLException.getSQLState()>
	//    9   19:invokespecial   #20  <Method void SQLException(String, String)>
	//   10   22:astore_0        
		else
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #24  <Method Throwable SQLException.initCause(Throwable)>
	//*  14   28:pop             
	//*  15   29:aload_0         
	//*  16   30:areturn         
			s = ((String) (new SQLException(s)));
	//   17   31:new             #13  <Class SQLException>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:invokespecial   #27  <Method void SQLException(String)>
	//   21   39:astore_0        
		((SQLException) (s)).initCause(throwable);
		return ((SQLException) (s));
	//*  22   40:goto            23
	}
}
