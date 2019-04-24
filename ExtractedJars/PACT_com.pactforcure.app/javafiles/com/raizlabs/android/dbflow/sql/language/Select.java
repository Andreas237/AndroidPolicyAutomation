// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			From

public class Select
	implements Query
{

	public transient Select(IProperty aiproperty[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mSelectQualifier = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #24  <Field int mSelectQualifier>
	//    5    9:aload_0         
	//    6   10:new             #26  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #27  <Method void ArrayList()>
	//    9   17:putfield        #29  <Field List propertyList>
		Collections.addAll(((java.util.Collection) (propertyList)), ((Object []) (aiproperty)));
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field List propertyList>
	//   12   24:aload_1         
	//   13   25:invokestatic    #35  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   14   28:pop             
		if(propertyList.isEmpty())
	//*  15   29:aload_0         
	//*  16   30:getfield        #29  <Field List propertyList>
	//*  17   33:invokeinterface #41  <Method boolean List.isEmpty()>
	//*  18   38:ifeq            54
			propertyList.add(((Object) (Property.ALL_PROPERTY)));
	//   19   41:aload_0         
	//   20   42:getfield        #29  <Field List propertyList>
	//   21   45:getstatic       #47  <Field Property Property.ALL_PROPERTY>
	//   22   48:invokeinterface #51  <Method boolean List.add(Object)>
	//   23   53:pop             
	//   24   54:return          
	}

	private Select selectQualifier(int i)
	{
		mSelectQualifier = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int mSelectQualifier>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Select distinct()
	{
		return selectQualifier(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #58  <Method Select selectQualifier(int)>
	//    3    5:areturn         
	}

	public From from(Class class1)
	{
		return new From(((Query) (this)), class1);
	//    0    0:new             #62  <Class From>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #65  <Method void From(Query, Class)>
	//    5    9:areturn         
	}

	public String getQuery()
	{
		QueryBuilder querybuilder = new QueryBuilder("SELECT ");
	//    0    0:new             #71  <Class QueryBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #73  <String "SELECT ">
	//    3    6:invokespecial   #76  <Method void QueryBuilder(Object)>
	//    4    9:astore_1        
		if(mSelectQualifier == -1) goto _L2; else goto _L1
	//    5   10:aload_0         
	//    6   11:getfield        #24  <Field int mSelectQualifier>
	//    7   14:iconst_m1       
	//    8   15:icmpeq          37
_L1:
		if(mSelectQualifier != 0) goto _L4; else goto _L3
	//    9   18:aload_0         
	//   10   19:getfield        #24  <Field int mSelectQualifier>
	//   11   22:ifne            61
_L3:
		querybuilder.append("DISTINCT");
	//   12   25:aload_1         
	//   13   26:ldc1            #77  <String "DISTINCT">
	//   14   28:invokevirtual   #81  <Method QueryBuilder QueryBuilder.append(Object)>
	//   15   31:pop             
_L6:
		querybuilder.appendSpace();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #85  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   18   36:pop             
_L2:
		querybuilder.append(((Object) (QueryBuilder.join(",", ((Iterable) (propertyList))))));
	//   19   37:aload_1         
	//   20   38:ldc1            #87  <String ",">
	//   21   40:aload_0         
	//   22   41:getfield        #29  <Field List propertyList>
	//   23   44:invokestatic    #91  <Method String QueryBuilder.join(CharSequence, Iterable)>
	//   24   47:invokevirtual   #81  <Method QueryBuilder QueryBuilder.append(Object)>
	//   25   50:pop             
		querybuilder.appendSpace();
	//   26   51:aload_1         
	//   27   52:invokevirtual   #85  <Method QueryBuilder QueryBuilder.appendSpace()>
	//   28   55:pop             
		return querybuilder.getQuery();
	//   29   56:aload_1         
	//   30   57:invokevirtual   #93  <Method String QueryBuilder.getQuery()>
	//   31   60:areturn         
_L4:
		if(mSelectQualifier == 1)
	//*  32   61:aload_0         
	//*  33   62:getfield        #24  <Field int mSelectQualifier>
	//*  34   65:iconst_1        
	//*  35   66:icmpne          32
			querybuilder.append("ALL");
	//   36   69:aload_1         
	//   37   70:ldc1            #94  <String "ALL">
	//   38   72:invokevirtual   #81  <Method QueryBuilder QueryBuilder.append(Object)>
	//   39   75:pop             
		if(true) goto _L6; else goto _L5
	//   40   76:goto            32
_L5:
	}

	public String toString()
	{
		return getQuery();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method String getQuery()>
	//    2    4:areturn         
	}

	public static final int ALL = 1;
	public static final int DISTINCT = 0;
	public static final int NONE = -1;
	private int mSelectQualifier;
	private final List propertyList = new ArrayList();
}
