// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.builder;

import android.database.DatabaseUtils;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.converter.TypeConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import java.util.Iterator;

public class ValueQueryBuilder extends QueryBuilder
{

	public ValueQueryBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void QueryBuilder()>
	//    2    4:return          
	}

	public ValueQueryBuilder(String s)
	{
		super(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void QueryBuilder(Object)>
	//    3    5:return          
	}

	public static String convertValueToDatabaseString(Object obj)
	{
		Object obj1 = obj;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(obj != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          26
		{
			TypeConverter typeconverter = FlowManager.getTypeConverterForClass(obj.getClass());
	//    4    6:aload_0         
	//    5    7:invokevirtual   #22  <Method Class Object.getClass()>
	//    6   10:invokestatic    #28  <Method TypeConverter FlowManager.getTypeConverterForClass(Class)>
	//    7   13:astore_2        
			obj1 = obj;
	//    8   14:aload_0         
	//    9   15:astore_1        
			if(typeconverter != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          26
				obj1 = typeconverter.getDBValue(obj);
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:invokevirtual   #34  <Method Object TypeConverter.getDBValue(Object)>
	//   15   25:astore_1        
		}
		if(obj1 instanceof Number)
	//*  16   26:aload_1         
	//*  17   27:instanceof      #36  <Class Number>
	//*  18   30:ifeq            40
		{
			obj = ((Object) (String.valueOf(obj1)));
	//   19   33:aload_1         
	//   20   34:invokestatic    #41  <Method String String.valueOf(Object)>
	//   21   37:astore_0        
		} else
	//*  22   38:aload_0         
	//*  23   39:areturn         
		{
			obj1 = ((Object) (String.valueOf(obj1)));
	//   24   40:aload_1         
	//   25   41:invokestatic    #41  <Method String String.valueOf(Object)>
	//   26   44:astore_1        
			obj = obj1;
	//   27   45:aload_1         
	//   28   46:astore_0        
			if(!((String) (obj1)).equals("?"))
	//*  29   47:aload_1         
	//*  30   48:ldc1            #43  <String "?">
	//*  31   50:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*  32   53:ifne            38
				return DatabaseUtils.sqlEscapeString(((String) (obj1)));
	//   33   56:aload_1         
	//   34   57:invokestatic    #53  <Method String DatabaseUtils.sqlEscapeString(String)>
	//   35   60:areturn         
		}
		return ((String) (obj));
	}

	public static String joinArguments(CharSequence charsequence, Iterable iterable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:astore_3        
		boolean flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		iterable = ((Iterable) (iterable.iterator()));
	//    6   10:aload_1         
	//    7   11:invokeinterface #64  <Method Iterator Iterable.iterator()>
	//    8   16:astore_1        
		while(((Iterator) (iterable)).hasNext()) 
	//*   9   17:aload_1         
	//*  10   18:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*  11   23:ifeq            62
		{
			Object obj = ((Iterator) (iterable)).next();
	//   12   26:aload_1         
	//   13   27:invokeinterface #74  <Method Object Iterator.next()>
	//   14   32:astore          4
			if(flag)
	//*  15   34:iload_2         
	//*  16   35:ifeq            53
				flag = false;
	//   17   38:iconst_0        
	//   18   39:istore_2        
			else
	//*  19   40:aload_3         
	//*  20   41:aload           4
	//*  21   43:invokestatic    #76  <Method String convertValueToDatabaseString(Object)>
	//*  22   46:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  23   49:pop             
	//*  24   50:goto            17
				stringbuilder.append(charsequence);
	//   25   53:aload_3         
	//   26   54:aload_0         
	//   27   55:invokevirtual   #83  <Method StringBuilder StringBuilder.append(CharSequence)>
	//   28   58:pop             
			stringbuilder.append(convertValueToDatabaseString(obj));
		}
	//*  29   59:goto            40
		return stringbuilder.toString();
	//   30   62:aload_3         
	//   31   63:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   32   66:areturn         
	}

	public static String joinArguments(CharSequence charsequence, Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:astore          5
		boolean flag = true;
	//    4    9:iconst_1        
	//    5   10:istore_3        
		int j = aobj.length;
	//    6   11:aload_1         
	//    7   12:arraylength     
	//    8   13:istore          4
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		while(i < j) 
	//*  11   17:iload_2         
	//*  12   18:iload           4
	//*  13   20:icmpge          62
		{
			Object obj = aobj[i];
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:astore          6
			if(flag)
	//*  18   28:iload_3         
	//*  19   29:ifeq            52
				flag = false;
	//   20   32:iconst_0        
	//   21   33:istore_3        
			else
	//*  22   34:aload           5
	//*  23   36:aload           6
	//*  24   38:invokestatic    #76  <Method String convertValueToDatabaseString(Object)>
	//*  25   41:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  26   44:pop             
	//*  27   45:iload_2         
	//*  28   46:iconst_1        
	//*  29   47:iadd            
	//*  30   48:istore_2        
	//*  31   49:goto            17
				stringbuilder.append(charsequence);
	//   32   52:aload           5
	//   33   54:aload_0         
	//   34   55:invokevirtual   #83  <Method StringBuilder StringBuilder.append(CharSequence)>
	//   35   58:pop             
			stringbuilder.append(convertValueToDatabaseString(obj));
			i++;
		}
	//*  36   59:goto            34
		return stringbuilder.toString();
	//   37   62:aload           5
	//   38   64:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   39   67:areturn         
	}

	public ValueQueryBuilder appendDBValue(Object obj)
	{
		return (ValueQueryBuilder)append(((Object) (convertValueToDatabaseString(obj))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #76  <Method String convertValueToDatabaseString(Object)>
	//    3    5:invokevirtual   #93  <Method QueryBuilder append(Object)>
	//    4    8:checkcast       #2   <Class ValueQueryBuilder>
	//    5   11:areturn         
	}

	public ValueQueryBuilder appendModelArray(Object aobj[])
	{
		if(aobj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			append(((Object) (joinArguments(",", aobj))));
	//    2    4:aload_0         
	//    3    5:ldc1            #97  <String ",">
	//    4    7:aload_1         
	//    5    8:invokestatic    #99  <Method String joinArguments(CharSequence, Object[])>
	//    6   11:invokevirtual   #93  <Method QueryBuilder append(Object)>
	//    7   14:pop             
		return this;
	//    8   15:aload_0         
	//    9   16:areturn         
	}

	public ValueQueryBuilder appendModelList(Iterable iterable)
	{
		if(iterable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			append(((Object) (joinArguments(",", iterable))));
	//    2    4:aload_0         
	//    3    5:ldc1            #97  <String ",">
	//    4    7:aload_1         
	//    5    8:invokestatic    #103 <Method String joinArguments(CharSequence, Iterable)>
	//    6   11:invokevirtual   #93  <Method QueryBuilder append(Object)>
	//    7   14:pop             
		return this;
	//    8   15:aload_0         
	//    9   16:areturn         
	}

	public ValueQueryBuilder appendTableName(Class class1)
	{
		return (ValueQueryBuilder)append(((Object) (FlowManager.getTableName(class1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #111 <Method String FlowManager.getTableName(Class)>
	//    3    5:invokevirtual   #93  <Method QueryBuilder append(Object)>
	//    4    8:checkcast       #2   <Class ValueQueryBuilder>
	//    5   11:areturn         
	}
}
