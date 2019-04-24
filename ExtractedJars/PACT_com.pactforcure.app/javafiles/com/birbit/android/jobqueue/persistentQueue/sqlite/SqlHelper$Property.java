// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;


// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			SqlHelper

public static class SqlHelper$Property
{

	public final int columnIndex;
	final String columnName;
	public final y foreignKey;
	final String type;
	public final boolean unique;

	public SqlHelper$Property(String s, String s1, int i)
	{
		this(s, s1, i, ((y) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:invokespecial   #21  <Method void SqlHelper$Property(String, String, int, SqlHelper$ForeignKey, boolean)>
	//    7    9:return          
	}

	public SqlHelper$Property(String s, String s1, int i, y y)
	{
		this(s, s1, i, y, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokespecial   #21  <Method void SqlHelper$Property(String, String, int, SqlHelper$ForeignKey, boolean)>
	//    7   10:return          
	}

	public SqlHelper$Property(String s, String s1, int i, y y, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		columnName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String columnName>
		type = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field String type>
		columnIndex = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #32  <Field int columnIndex>
		foreignKey = y;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field SqlHelper$ForeignKey foreignKey>
		unique = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #36  <Field boolean unique>
	//   17   31:return          
	}
}
