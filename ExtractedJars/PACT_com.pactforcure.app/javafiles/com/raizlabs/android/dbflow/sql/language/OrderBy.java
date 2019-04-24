// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.annotation.Collate;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			NameAlias

public class OrderBy
	implements Query
{

	OrderBy(NameAlias namealias)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		column = namealias;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field NameAlias column>
	//    5    9:return          
	}

	OrderBy(NameAlias namealias, boolean flag)
	{
		this(namealias);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void OrderBy(NameAlias)>
		isAscending = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #33  <Field boolean isAscending>
	//    6   10:return          
	}

	OrderBy(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		orderByString = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field String orderByString>
	//    5    9:return          
	}

	public static OrderBy fromNameAlias(NameAlias namealias)
	{
		return new OrderBy(namealias);
	//    0    0:new             #2   <Class OrderBy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void OrderBy(NameAlias)>
	//    4    8:areturn         
	}

	public static OrderBy fromProperty(IProperty iproperty)
	{
		return new OrderBy(iproperty.getNameAlias());
	//    0    0:new             #2   <Class OrderBy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #46  <Method NameAlias IProperty.getNameAlias()>
	//    4   10:invokespecial   #31  <Method void OrderBy(NameAlias)>
	//    5   13:areturn         
	}

	public static OrderBy fromString(String s)
	{
		return new OrderBy(s);
	//    0    0:new             #2   <Class OrderBy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #50  <Method void OrderBy(String)>
	//    4    8:areturn         
	}

	public OrderBy ascending()
	{
		isAscending = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #33  <Field boolean isAscending>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public OrderBy collate(Collate collate1)
	{
		collation = collate1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Collate collation>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public OrderBy descending()
	{
		isAscending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #33  <Field boolean isAscending>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String getQuery()
	{
		if(orderByString == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field String orderByString>
	//*   2    4:ifnonnull       85
		{
			StringBuilder stringbuilder = (new StringBuilder()).append(((Object) (column))).append(" ");
	//    3    7:new             #61  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #62  <Method void StringBuilder()>
	//    6   14:aload_0         
	//    7   15:getfield        #27  <Field NameAlias column>
	//    8   18:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//    9   21:ldc1            #68  <String " ">
	//   10   23:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:astore_2        
			if(collation != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #56  <Field Collate collation>
	//*  14   31:ifnull          58
				stringbuilder.append("COLLATE").append(" ").append(((Object) (collation))).append(" ");
	//   15   34:aload_2         
	//   16   35:ldc1            #73  <String "COLLATE">
	//   17   37:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:ldc1            #68  <String " ">
	//   19   42:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   20   45:aload_0         
	//   21   46:getfield        #56  <Field Collate collation>
	//   22   49:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
	//   23   52:ldc1            #68  <String " ">
	//   24   54:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   25   57:pop             
			String s;
			if(isAscending)
	//*  26   58:aload_0         
	//*  27   59:getfield        #33  <Field boolean isAscending>
	//*  28   62:ifeq            79
				s = "ASC";
	//   29   65:ldc1            #10  <String "ASC">
	//   30   67:astore_1        
			else
	//*  31   68:aload_2         
	//*  32   69:aload_1         
	//*  33   70:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//*  34   73:pop             
	//*  35   74:aload_2         
	//*  36   75:invokevirtual   #76  <Method String StringBuilder.toString()>
	//*  37   78:areturn         
				s = "DESC";
	//   38   79:ldc1            #13  <String "DESC">
	//   39   81:astore_1        
			stringbuilder.append(s);
			return stringbuilder.toString();
		} else
	//*  40   82:goto            68
		{
			return orderByString;
	//   41   85:aload_0         
	//   42   86:getfield        #36  <Field String orderByString>
	//   43   89:areturn         
		}
	}

	public String toString()
	{
		return getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method String getQuery()>
	//    2    4:areturn         
	}

	public static final String ASCENDING = "ASC";
	public static final String DESCENDING = "DESC";
	private Collate collation;
	private NameAlias column;
	private boolean isAscending;
	private String orderByString;
}
