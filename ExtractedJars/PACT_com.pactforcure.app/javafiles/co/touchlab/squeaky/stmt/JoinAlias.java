// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.stmt;

import co.touchlab.squeaky.field.FieldType;
import java.sql.SQLException;

// Referenced classes of package co.touchlab.squeaky.stmt:
//			Where

public class JoinAlias
{

	public JoinAlias(Where where1, String s, Class class1, String s1, FieldType fieldtype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		where = where1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Where where>
		parentPrefix = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field String parentPrefix>
		tableType = class1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Class tableType>
		tablePrefix = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field String tablePrefix>
		fieldType = fieldtype;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #28  <Field FieldType fieldType>
	//   17   31:return          
	}

	public JoinAlias join(String s)
		throws SQLException
	{
		return where.join(this, s);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Where where>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method JoinAlias Where.join(JoinAlias, String)>
	//    5    9:areturn         
	}

	public final FieldType fieldType;
	public final String parentPrefix;
	public final String tablePrefix;
	public final Class tableType;
	public final Where where;
}
