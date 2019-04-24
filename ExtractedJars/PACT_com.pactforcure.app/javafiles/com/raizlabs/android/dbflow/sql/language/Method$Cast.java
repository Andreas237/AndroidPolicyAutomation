// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			Method, NameAlias

public static class Method$Cast
{

	public IProperty as(SQLiteType sqlitetype)
	{
		return ((IProperty) (new Method("CAST", new IProperty[] {
			new Property(property.getTable(), property.getNameAlias().newBuilder().shouldAddIdentifierToAliasName(false).as(sqlitetype.name()).build())
		})));
	//    0    0:new             #6   <Class Method>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "CAST">
	//    3    6:iconst_1        
	//    4    7:anewarray       IProperty[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:new             #30  <Class Property>
	//    8   15:dup             
	//    9   16:aload_0         
	//   10   17:getfield        #17  <Field IProperty property>
	//   11   20:invokeinterface #34  <Method Class IProperty.getTable()>
	//   12   25:aload_0         
	//   13   26:getfield        #17  <Field IProperty property>
	//   14   29:invokeinterface #38  <Method NameAlias IProperty.getNameAlias()>
	//   15   34:invokevirtual   #44  <Method NameAlias$Builder NameAlias.newBuilder()>
	//   16   37:iconst_0        
	//   17   38:invokevirtual   #50  <Method NameAlias$Builder NameAlias$Builder.shouldAddIdentifierToAliasName(boolean)>
	//   18   41:aload_1         
	//   19   42:invokevirtual   #56  <Method String SQLiteType.name()>
	//   20   45:invokevirtual   #59  <Method NameAlias$Builder NameAlias$Builder.as(String)>
	//   21   48:invokevirtual   #62  <Method NameAlias NameAlias$Builder.build()>
	//   22   51:invokespecial   #65  <Method void Property(Class, NameAlias)>
	//   23   54:aastore         
	//   24   55:invokespecial   #68  <Method void Method(String, IProperty[])>
	//   25   58:areturn         
	}

	private final IProperty property;

	private Method$Cast(IProperty iproperty)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		property = iproperty;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field IProperty property>
	//    5    9:return          
	}

	Method$Cast(IProperty iproperty, Method._cls1 _pcls1)
	{
		this(iproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void Method$Cast(IProperty)>
	//    3    5:return          
	}
}
