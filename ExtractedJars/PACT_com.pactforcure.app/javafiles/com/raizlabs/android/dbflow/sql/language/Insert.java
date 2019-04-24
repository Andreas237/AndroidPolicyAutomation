// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.annotation.ConflictAction;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.builder.ValueQueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.*;

// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			BaseQueriable, ConditionGroup, SQLCondition, From

public class Insert extends BaseQueriable
{

	public Insert(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void BaseQueriable(Class)>
		conflictAction = ConflictAction.NONE;
	//    3    5:aload_0         
	//    4    6:getstatic       #24  <Field ConflictAction ConflictAction.NONE>
	//    5    9:putfield        #26  <Field ConflictAction conflictAction>
	//    6   12:return          
	}

	public Insert asColumns()
	{
		columns(FlowManager.getModelAdapter(getTable()).getAllColumnProperties());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #35  <Method Class getTable()>
	//    3    5:invokestatic    #41  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//    4    8:invokevirtual   #47  <Method IProperty[] ModelAdapter.getAllColumnProperties()>
	//    5   11:invokevirtual   #50  <Method Insert columns(IProperty[])>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public Insert columnValues(ContentValues contentvalues)
	{
		Object obj = ((Object) (contentvalues.valueSet()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method Set ContentValues.valueSet()>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		String as[] = new String[contentvalues.size()];
	//    5    8:aload_1         
	//    6    9:invokevirtual   #63  <Method int ContentValues.size()>
	//    7   12:anewarray       String[]
	//    8   15:astore_3        
		Object aobj[] = new Object[contentvalues.size()];
	//    9   16:aload_1         
	//   10   17:invokevirtual   #63  <Method int ContentValues.size()>
	//   11   20:anewarray       Object[]
	//   12   23:astore          4
		for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  13   25:aload           5
	//*  14   27:invokeinterface #73  <Method Iterator Set.iterator()>
	//*  15   32:astore          5
	//*  16   34:aload           5
	//*  17   36:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*  18   41:ifeq            86
		{
			String s = (String)((java.util.Map.Entry)((Iterator) (obj)).next()).getKey();
	//   19   44:aload           5
	//   20   46:invokeinterface #83  <Method Object Iterator.next()>
	//   21   51:checkcast       #85  <Class java.util.Map$Entry>
	//   22   54:invokeinterface #88  <Method Object java.util.Map$Entry.getKey()>
	//   23   59:checkcast       #65  <Class String>
	//   24   62:astore          6
			as[i] = s;
	//   25   64:aload_3         
	//   26   65:iload_2         
	//   27   66:aload           6
	//   28   68:aastore         
			aobj[i] = contentvalues.get(s);
	//   29   69:aload           4
	//   30   71:iload_2         
	//   31   72:aload_1         
	//   32   73:aload           6
	//   33   75:invokevirtual   #92  <Method Object ContentValues.get(String)>
	//   34   78:aastore         
			i++;
	//   35   79:iload_2         
	//   36   80:iconst_1        
	//   37   81:iadd            
	//   38   82:istore_2        
		}

	//*  39   83:goto            34
		return columns(as).values(aobj);
	//   40   86:aload_0         
	//   41   87:aload_3         
	//   42   88:invokevirtual   #95  <Method Insert columns(String[])>
	//   43   91:aload           4
	//   44   93:invokevirtual   #99  <Method Insert values(Object[])>
	//   45   96:areturn         
	}

	public Insert columnValues(ConditionGroup conditiongroup)
	{
		int j = conditiongroup.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #104 <Method int ConditionGroup.size()>
	//    2    4:istore_3        
		String as[] = new String[j];
	//    3    5:iload_3         
	//    4    6:anewarray       String[]
	//    5    9:astore          4
		Object aobj[] = new Object[j];
	//    6   11:iload_3         
	//    7   12:anewarray       Object[]
	//    8   15:astore          5
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iload_3         
	//*  13   21:icmpge          68
		{
			SQLCondition sqlcondition = (SQLCondition)conditiongroup.getConditions().get(i);
	//   14   24:aload_1         
	//   15   25:invokevirtual   #108 <Method List ConditionGroup.getConditions()>
	//   16   28:iload_2         
	//   17   29:invokeinterface #113 <Method Object List.get(int)>
	//   18   34:checkcast       #115 <Class SQLCondition>
	//   19   37:astore          6
			as[i] = sqlcondition.columnName();
	//   20   39:aload           4
	//   21   41:iload_2         
	//   22   42:aload           6
	//   23   44:invokeinterface #119 <Method String SQLCondition.columnName()>
	//   24   49:aastore         
			aobj[i] = sqlcondition.value();
	//   25   50:aload           5
	//   26   52:iload_2         
	//   27   53:aload           6
	//   28   55:invokeinterface #122 <Method Object SQLCondition.value()>
	//   29   60:aastore         
		}

	//   30   61:iload_2         
	//   31   62:iconst_1        
	//   32   63:iadd            
	//   33   64:istore_2        
	//*  34   65:goto            19
		return columns(as).values(aobj);
	//   35   68:aload_0         
	//   36   69:aload           4
	//   37   71:invokevirtual   #95  <Method Insert columns(String[])>
	//   38   74:aload           5
	//   39   76:invokevirtual   #99  <Method Insert values(Object[])>
	//   40   79:areturn         
	}

	public transient Insert columnValues(SQLCondition asqlcondition[])
	{
		String as[] = new String[asqlcondition.length];
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:anewarray       String[]
	//    3    5:astore_3        
		Object aobj[] = new Object[asqlcondition.length];
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:anewarray       Object[]
	//    7   11:astore          4
		for(int i = 0; i < asqlcondition.length; i++)
	//*   8   13:iconst_0        
	//*   9   14:istore_2        
	//*  10   15:iload_2         
	//*  11   16:aload_1         
	//*  12   17:arraylength     
	//*  13   18:icmpge          54
		{
			SQLCondition sqlcondition = asqlcondition[i];
	//   14   21:aload_1         
	//   15   22:iload_2         
	//   16   23:aaload          
	//   17   24:astore          5
			as[i] = sqlcondition.columnName();
	//   18   26:aload_3         
	//   19   27:iload_2         
	//   20   28:aload           5
	//   21   30:invokeinterface #119 <Method String SQLCondition.columnName()>
	//   22   35:aastore         
			aobj[i] = sqlcondition.value();
	//   23   36:aload           4
	//   24   38:iload_2         
	//   25   39:aload           5
	//   26   41:invokeinterface #122 <Method Object SQLCondition.value()>
	//   27   46:aastore         
		}

	//   28   47:iload_2         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:istore_2        
	//*  32   51:goto            15
		return columns(as).values(aobj);
	//   33   54:aload_0         
	//   34   55:aload_3         
	//   35   56:invokevirtual   #95  <Method Insert columns(String[])>
	//   36   59:aload           4
	//   37   61:invokevirtual   #99  <Method Insert values(Object[])>
	//   38   64:areturn         
	}

	public Insert columns(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          52
		{
			columns = new IProperty[list.size()];
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #127 <Method int List.size()>
	//    5   11:anewarray       IProperty[]
	//    6   14:putfield        #131 <Field IProperty[] columns>
			for(int i = 0; i < list.size(); i++)
	//*   7   17:iconst_0        
	//*   8   18:istore_2        
	//*   9   19:iload_2         
	//*  10   20:aload_1         
	//*  11   21:invokeinterface #127 <Method int List.size()>
	//*  12   26:icmpge          52
				columns[i] = (IProperty)list.get(i);
	//   13   29:aload_0         
	//   14   30:getfield        #131 <Field IProperty[] columns>
	//   15   33:iload_2         
	//   16   34:aload_1         
	//   17   35:iload_2         
	//   18   36:invokeinterface #113 <Method Object List.get(int)>
	//   19   41:checkcast       #129 <Class IProperty>
	//   20   44:aastore         

	//   21   45:iload_2         
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:istore_2        
		}
	//*  25   49:goto            19
		return this;
	//   26   52:aload_0         
	//   27   53:areturn         
	}

	public transient Insert columns(IProperty aiproperty[])
	{
		columns = new IProperty[aiproperty.length];
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:anewarray       IProperty[]
	//    4    6:putfield        #131 <Field IProperty[] columns>
		for(int i = 0; i < aiproperty.length; i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:aload_1         
	//*   9   13:arraylength     
	//*  10   14:icmpge          33
			columns[i] = aiproperty[i];
	//   11   17:aload_0         
	//   12   18:getfield        #131 <Field IProperty[] columns>
	//   13   21:iload_2         
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:aaload          
	//   17   25:aastore         

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
	//*  22   30:goto            11
		return this;
	//   23   33:aload_0         
	//   24   34:areturn         
	}

	public transient Insert columns(String as[])
	{
		columns = new IProperty[as.length];
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:anewarray       IProperty[]
	//    4    6:putfield        #131 <Field IProperty[] columns>
		ModelAdapter modeladapter = FlowManager.getModelAdapter(getTable());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #35  <Method Class getTable()>
	//    7   13:invokestatic    #41  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//    8   16:astore_3        
		for(int i = 0; i < as.length; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:aload_1         
	//*  13   21:arraylength     
	//*  14   22:icmpge          49
		{
			String s = as[i];
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:aaload          
	//   18   28:astore          4
			columns[i] = ((IProperty) (modeladapter.getProperty(s)));
	//   19   30:aload_0         
	//   20   31:getfield        #131 <Field IProperty[] columns>
	//   21   34:iload_2         
	//   22   35:aload_3         
	//   23   36:aload           4
	//   24   38:invokevirtual   #137 <Method com.raizlabs.android.dbflow.sql.language.property.BaseProperty ModelAdapter.getProperty(String)>
	//   25   41:aastore         
		}

	//   26   42:iload_2         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_2        
	//*  30   46:goto            19
		return this;
	//   31   49:aload_0         
	//   32   50:areturn         
	}

	public long executeUpdateDelete()
	{
		throw new IllegalStateException("Cannot call executeUpdateDelete() from an Insert");
	//    0    0:new             #142 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #144 <String "Cannot call executeUpdateDelete() from an Insert">
	//    3    6:invokespecial   #147 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public long executeUpdateDelete(DatabaseWrapper databasewrapper)
	{
		throw new IllegalStateException("Cannot call executeUpdateDelete() from an Insert");
	//    0    0:new             #142 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #144 <String "Cannot call executeUpdateDelete() from an Insert">
	//    3    6:invokespecial   #147 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public String getQuery()
	{
		ValueQueryBuilder valuequerybuilder;
		valuequerybuilder = new ValueQueryBuilder("INSERT ");
	//    0    0:new             #151 <Class ValueQueryBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #153 <String "INSERT ">
	//    3    6:invokespecial   #154 <Method void ValueQueryBuilder(String)>
	//    4    9:astore_2        
		if(conflictAction != null && !conflictAction.equals(((Object) (ConflictAction.NONE))))
	//*   5   10:aload_0         
	//*   6   11:getfield        #26  <Field ConflictAction conflictAction>
	//*   7   14:ifnull          47
	//*   8   17:aload_0         
	//*   9   18:getfield        #26  <Field ConflictAction conflictAction>
	//*  10   21:getstatic       #24  <Field ConflictAction ConflictAction.NONE>
	//*  11   24:invokevirtual   #158 <Method boolean ConflictAction.equals(Object)>
	//*  12   27:ifne            47
			((ValueQueryBuilder)valuequerybuilder.append("OR")).appendSpaceSeparated(((Object) (conflictAction)));
	//   13   30:aload_2         
	//   14   31:ldc1            #160 <String "OR">
	//   15   33:invokevirtual   #164 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.append(Object)>
	//   16   36:checkcast       #151 <Class ValueQueryBuilder>
	//   17   39:aload_0         
	//   18   40:getfield        #26  <Field ConflictAction conflictAction>
	//   19   43:invokevirtual   #167 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.appendSpaceSeparated(Object)>
	//   20   46:pop             
		((ValueQueryBuilder)((ValueQueryBuilder)valuequerybuilder.append("INTO")).appendSpace()).appendTableName(getTable());
	//   21   47:aload_2         
	//   22   48:ldc1            #169 <String "INTO">
	//   23   50:invokevirtual   #164 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.append(Object)>
	//   24   53:checkcast       #151 <Class ValueQueryBuilder>
	//   25   56:invokevirtual   #173 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.appendSpace()>
	//   26   59:checkcast       #151 <Class ValueQueryBuilder>
	//   27   62:aload_0         
	//   28   63:invokevirtual   #35  <Method Class getTable()>
	//   29   66:invokevirtual   #177 <Method ValueQueryBuilder ValueQueryBuilder.appendTableName(Class)>
	//   30   69:pop             
		if(columns != null)
	//*  31   70:aload_0         
	//*  32   71:getfield        #131 <Field IProperty[] columns>
	//*  33   74:ifnull          105
			((ValueQueryBuilder)((ValueQueryBuilder)valuequerybuilder.append("(")).appendArray((Object[])columns)).append(")");
	//   34   77:aload_2         
	//   35   78:ldc1            #179 <String "(">
	//   36   80:invokevirtual   #164 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.append(Object)>
	//   37   83:checkcast       #151 <Class ValueQueryBuilder>
	//   38   86:aload_0         
	//   39   87:getfield        #131 <Field IProperty[] columns>
	//   40   90:checkcast       #181 <Class Object[]>
	//   41   93:invokevirtual   #185 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.appendArray(Object[])>
	//   42   96:checkcast       #151 <Class ValueQueryBuilder>
	//   43   99:ldc1            #187 <String ")">
	//   44  101:invokevirtual   #164 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.append(Object)>
	//   45  104:pop             
		if(selectFrom == null) goto _L2; else goto _L1
	//   46  105:aload_0         
	//   47  106:getfield        #189 <Field From selectFrom>
	//   48  109:ifnull          135
_L1:
		((ValueQueryBuilder)valuequerybuilder.appendSpace()).append(((Object) (selectFrom.getQuery())));
	//   49  112:aload_2         
	//   50  113:invokevirtual   #173 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.appendSpace()>
	//   51  116:checkcast       #151 <Class ValueQueryBuilder>
	//   52  119:aload_0         
	//   53  120:getfield        #189 <Field From selectFrom>
	//   54  123:invokevirtual   #193 <Method String From.getQuery()>
	//   55  126:invokevirtual   #164 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.append(Object)>
	//   56  129:pop             
_L4:
		return valuequerybuilder.getQuery();
	//   57  130:aload_2         
	//   58  131:invokevirtual   #194 <Method String ValueQueryBuilder.getQuery()>
	//   59  134:areturn         
_L2:
label0:
		{
			if(valuesList == null || valuesList.size() < 1)
	//*  60  135:aload_0         
	//*  61  136:getfield        #196 <Field List valuesList>
	//*  62  139:ifnull          155
	//*  63  142:aload_0         
	//*  64  143:getfield        #196 <Field List valuesList>
	//*  65  146:invokeinterface #127 <Method int List.size()>
	//*  66  151:iconst_1        
	//*  67  152:icmpge          193
				throw new IllegalStateException((new StringBuilder()).append("The insert of ").append(FlowManager.getTableName(getTable())).append(" should haveat least one value specified for the insert").toString());
	//   68  155:new             #142 <Class IllegalStateException>
	//   69  158:dup             
	//   70  159:new             #198 <Class StringBuilder>
	//   71  162:dup             
	//   72  163:invokespecial   #201 <Method void StringBuilder()>
	//   73  166:ldc1            #203 <String "The insert of ">
	//   74  168:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   75  171:aload_0         
	//   76  172:invokevirtual   #35  <Method Class getTable()>
	//   77  175:invokestatic    #210 <Method String FlowManager.getTableName(Class)>
	//   78  178:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   79  181:ldc1            #212 <String " should haveat least one value specified for the insert">
	//   80  183:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   81  186:invokevirtual   #215 <Method String StringBuilder.toString()>
	//   82  189:invokespecial   #147 <Method void IllegalStateException(String)>
	//   83  192:athrow          
			if(columns == null)
				break label0;
	//   84  193:aload_0         
	//   85  194:getfield        #131 <Field IProperty[] columns>
	//   86  197:ifnull          275
			Iterator iterator = valuesList.iterator();
	//   87  200:aload_0         
	//   88  201:getfield        #196 <Field List valuesList>
	//   89  204:invokeinterface #216 <Method Iterator List.iterator()>
	//   90  209:astore_3        
			do
				if(!iterator.hasNext())
					break label0;
	//   91  210:aload_3         
	//   92  211:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   93  216:ifeq            275
			while(((Object[])iterator.next()).length == columns.length);
	//   94  219:aload_3         
	//   95  220:invokeinterface #83  <Method Object Iterator.next()>
	//   96  225:checkcast       #181 <Class Object[]>
	//   97  228:arraylength     
	//   98  229:aload_0         
	//   99  230:getfield        #131 <Field IProperty[] columns>
	//  100  233:arraylength     
	//  101  234:icmpeq          210
			throw new IllegalStateException((new StringBuilder()).append("The Insert of ").append(FlowManager.getTableName(getTable())).append(" when specifyingcolumns needs to have the same amount of values and columns").toString());
	//  102  237:new             #142 <Class IllegalStateException>
	//  103  240:dup             
	//  104  241:new             #198 <Class StringBuilder>
	//  105  244:dup             
	//  106  245:invokespecial   #201 <Method void StringBuilder()>
	//  107  248:ldc1            #218 <String "The Insert of ">
	//  108  250:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  109  253:aload_0         
	//  110  254:invokevirtual   #35  <Method Class getTable()>
	//  111  257:invokestatic    #210 <Method String FlowManager.getTableName(Class)>
	//  112  260:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  113  263:ldc1            #220 <String " when specifyingcolumns needs to have the same amount of values and columns">
	//  114  265:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  115  268:invokevirtual   #215 <Method String StringBuilder.toString()>
	//  116  271:invokespecial   #147 <Method void IllegalStateException(String)>
	//  117  274:athrow          
		}
		valuequerybuilder.append(" VALUES(");
	//  118  275:aload_2         
	//  119  276:ldc1            #222 <String " VALUES(">
	//  120  278:invokevirtual   #164 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.append(Object)>
	//  121  281:pop             
		int i = 0;
	//  122  282:iconst_0        
	//  123  283:istore_1        
		while(i < valuesList.size()) 
	//* 124  284:iload_1         
	//* 125  285:aload_0         
	//* 126  286:getfield        #196 <Field List valuesList>
	//* 127  289:invokeinterface #127 <Method int List.size()>
	//* 128  294:icmpge          130
		{
			if(i > 0)
	//* 129  297:iload_1         
	//* 130  298:ifle            308
				valuequerybuilder.append(",(");
	//  131  301:aload_2         
	//  132  302:ldc1            #224 <String ",(">
	//  133  304:invokevirtual   #164 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.append(Object)>
	//  134  307:pop             
			valuequerybuilder.appendModelArray((Object[])valuesList.get(i)).append(")");
	//  135  308:aload_2         
	//  136  309:aload_0         
	//  137  310:getfield        #196 <Field List valuesList>
	//  138  313:iload_1         
	//  139  314:invokeinterface #113 <Method Object List.get(int)>
	//  140  319:checkcast       #181 <Class Object[]>
	//  141  322:invokevirtual   #228 <Method ValueQueryBuilder ValueQueryBuilder.appendModelArray(Object[])>
	//  142  325:ldc1            #187 <String ")">
	//  143  327:invokevirtual   #164 <Method com.raizlabs.android.dbflow.sql.QueryBuilder ValueQueryBuilder.append(Object)>
	//  144  330:pop             
			i++;
	//  145  331:iload_1         
	//  146  332:iconst_1        
	//  147  333:iadd            
	//  148  334:istore_1        
		}
		if(true) goto _L4; else goto _L3
	//  149  335:goto            284
_L3:
	}

	public Insert or(ConflictAction conflictaction)
	{
		conflictAction = conflictaction;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ConflictAction conflictAction>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Insert orAbort()
	{
		return or(ConflictAction.ABORT);
	//    0    0:aload_0         
	//    1    1:getstatic       #235 <Field ConflictAction ConflictAction.ABORT>
	//    2    4:invokevirtual   #237 <Method Insert or(ConflictAction)>
	//    3    7:areturn         
	}

	public Insert orFail()
	{
		return or(ConflictAction.FAIL);
	//    0    0:aload_0         
	//    1    1:getstatic       #241 <Field ConflictAction ConflictAction.FAIL>
	//    2    4:invokevirtual   #237 <Method Insert or(ConflictAction)>
	//    3    7:areturn         
	}

	public Insert orIgnore()
	{
		return or(ConflictAction.IGNORE);
	//    0    0:aload_0         
	//    1    1:getstatic       #245 <Field ConflictAction ConflictAction.IGNORE>
	//    2    4:invokevirtual   #237 <Method Insert or(ConflictAction)>
	//    3    7:areturn         
	}

	public Insert orReplace()
	{
		return or(ConflictAction.REPLACE);
	//    0    0:aload_0         
	//    1    1:getstatic       #249 <Field ConflictAction ConflictAction.REPLACE>
	//    2    4:invokevirtual   #237 <Method Insert or(ConflictAction)>
	//    3    7:areturn         
	}

	public Insert orRollback()
	{
		return or(ConflictAction.ROLLBACK);
	//    0    0:aload_0         
	//    1    1:getstatic       #253 <Field ConflictAction ConflictAction.ROLLBACK>
	//    2    4:invokevirtual   #237 <Method Insert or(ConflictAction)>
	//    3    7:areturn         
	}

	public Insert select(From from)
	{
		selectFrom = from;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #189 <Field From selectFrom>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient Insert values(Object aobj[])
	{
		if(valuesList == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field List valuesList>
	//*   2    4:ifnonnull       18
			valuesList = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #258 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #259 <Method void ArrayList()>
	//    7   15:putfield        #196 <Field List valuesList>
		valuesList.add(((Object) (aobj)));
	//    8   18:aload_0         
	//    9   19:getfield        #196 <Field List valuesList>
	//   10   22:aload_1         
	//   11   23:invokeinterface #262 <Method boolean List.add(Object)>
	//   12   28:pop             
		return this;
	//   13   29:aload_0         
	//   14   30:areturn         
	}

	private IProperty columns[];
	private ConflictAction conflictAction;
	private From selectFrom;
	private List valuesList;
}
