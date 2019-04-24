// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language.property;

import com.raizlabs.android.dbflow.sql.language.NameAlias;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language.property:
//			Property

public class WrapperProperty extends Property
{

	public WrapperProperty(Class class1, NameAlias namealias)
	{
		super(class1, namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void Property(Class, NameAlias)>
	//    4    6:return          
	}

	public WrapperProperty(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void Property(Class, String)>
	//    4    6:return          
	}

	public Property invertProperty()
	{
		if(databaseProperty == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field WrapperProperty databaseProperty>
	//*   2    4:ifnonnull       26
			databaseProperty = new WrapperProperty(table, nameAlias);
	//    3    7:aload_0         
	//    4    8:new             #2   <Class WrapperProperty>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field Class table>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field NameAlias nameAlias>
	//   10   20:invokespecial   #32  <Method void WrapperProperty(Class, NameAlias)>
	//   11   23:putfield        #23  <Field WrapperProperty databaseProperty>
		return ((Property) (databaseProperty));
	//   12   26:aload_0         
	//   13   27:getfield        #23  <Field WrapperProperty databaseProperty>
	//   14   30:areturn         
	}

	private WrapperProperty databaseProperty;
}
