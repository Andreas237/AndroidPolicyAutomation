// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.provider;

import android.content.*;
import android.database.Cursor;
import android.net.Uri;
import com.raizlabs.android.dbflow.config.FlowLog;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.queriable.ListModelLoader;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import java.util.ArrayList;
import java.util.List;

public class ContentUtils
{

	public ContentUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static transient Uri buildUri(String s, String s1, String as[])
	{
		s = ((String) (Uri.parse((new StringBuilder()).append(s).append(s1).toString()).buildUpon()));
	//    0    0:new             #17  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:invokevirtual   #26  <Method String StringBuilder.toString()>
	//    8   18:invokestatic    #32  <Method Uri Uri.parse(String)>
	//    9   21:invokevirtual   #36  <Method android.net.Uri$Builder Uri.buildUpon()>
	//   10   24:astore_0        
		int j = as.length;
	//   11   25:aload_2         
	//   12   26:arraylength     
	//   13   27:istore          4
		for(int i = 0; i < j; i++)
	//*  14   29:iconst_0        
	//*  15   30:istore_3        
	//*  16   31:iload_3         
	//*  17   32:iload           4
	//*  18   34:icmpge          52
			((android.net.Uri.Builder) (s)).appendPath(as[i]);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:iload_3         
	//   22   40:aaload          
	//   23   41:invokevirtual   #42  <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   24   44:pop             

	//   25   45:iload_3         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_3        
	//*  29   49:goto            31
		return ((android.net.Uri.Builder) (s)).build();
	//   30   52:aload_0         
	//   31   53:invokevirtual   #46  <Method Uri android.net.Uri$Builder.build()>
	//   32   56:areturn         
	}

	public static transient Uri buildUriWithAuthority(String s, String as[])
	{
		return buildUri("content://", s, as);
	//    0    0:ldc1            #8   <String "content://">
	//    1    2:aload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #50  <Method Uri buildUri(String, String, String[])>
	//    4    7:areturn         
	}

	public static int bulkInsert(ContentResolver contentresolver, Uri uri, Class class1, List list)
	{
		int i;
		ContentValues acontentvalues[];
		if(list == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       72
			i = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
		else
	//*   4    7:iload           4
	//*   5    9:anewarray       ContentValues[]
	//*   6   12:astore          5
	//*   7   14:aload_2         
	//*   8   15:invokestatic    #60  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//*   9   18:astore_2        
	//*  10   19:aload_3         
	//*  11   20:ifnull          83
	//*  12   23:iconst_0        
	//*  13   24:istore          4
	//*  14   26:iload           4
	//*  15   28:aload           5
	//*  16   30:arraylength     
	//*  17   31:icmpge          83
	//*  18   34:aload           5
	//*  19   36:iload           4
	//*  20   38:new             #54  <Class ContentValues>
	//*  21   41:dup             
	//*  22   42:invokespecial   #61  <Method void ContentValues()>
	//*  23   45:aastore         
	//*  24   46:aload_2         
	//*  25   47:aload           5
	//*  26   49:iload           4
	//*  27   51:aaload          
	//*  28   52:aload_3         
	//*  29   53:iload           4
	//*  30   55:invokeinterface #67  <Method Object List.get(int)>
	//*  31   60:invokevirtual   #73  <Method void ModelAdapter.bindToInsertValues(ContentValues, Object)>
	//*  32   63:iload           4
	//*  33   65:iconst_1        
	//*  34   66:iadd            
	//*  35   67:istore          4
	//*  36   69:goto            26
			i = list.size();
	//   37   72:aload_3         
	//   38   73:invokeinterface #77  <Method int List.size()>
	//   39   78:istore          4
		acontentvalues = new ContentValues[i];
		class1 = ((Class) (FlowManager.getModelAdapter(class1)));
		if(list != null)
			for(i = 0; i < acontentvalues.length; i++)
			{
				acontentvalues[i] = new ContentValues();
				((ModelAdapter) (class1)).bindToInsertValues(acontentvalues[i], list.get(i));
			}

	//*  40   80:goto            7
		return contentresolver.bulkInsert(uri, acontentvalues);
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:aload           5
	//   44   87:invokevirtual   #82  <Method int ContentResolver.bulkInsert(Uri, ContentValues[])>
	//   45   90:ireturn         
	}

	public static int bulkInsert(Uri uri, Class class1, List list)
	{
		return bulkInsert(FlowManager.getContext().getContentResolver(), uri, class1, list);
	//    0    0:invokestatic    #89  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #95  <Method ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #97  <Method int bulkInsert(ContentResolver, Uri, Class, List)>
	//    6   12:ireturn         
	}

	public static int delete(ContentResolver contentresolver, Uri uri, Object obj)
	{
		ModelAdapter modeladapter = FlowManager.getModelAdapter(obj.getClass());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #104 <Method Class Object.getClass()>
	//    2    4:invokestatic    #60  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//    3    7:astore          4
		int i = contentresolver.delete(uri, modeladapter.getPrimaryConditionClause(obj).getQuery(), ((String []) (null)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload           4
	//    7   13:aload_2         
	//    8   14:invokevirtual   #108 <Method ConditionGroup ModelAdapter.getPrimaryConditionClause(Object)>
	//    9   17:invokevirtual   #113 <Method String ConditionGroup.getQuery()>
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #116 <Method int ContentResolver.delete(Uri, String, String[])>
	//   12   24:istore_3        
		if(i > 0)
	//*  13   25:iload_3         
	//*  14   26:ifle            41
		{
			modeladapter.updateAutoIncrement(obj, ((Number) (Integer.valueOf(0))));
	//   15   29:aload           4
	//   16   31:aload_2         
	//   17   32:iconst_0        
	//   18   33:invokestatic    #122 <Method Integer Integer.valueOf(int)>
	//   19   36:invokevirtual   #126 <Method void ModelAdapter.updateAutoIncrement(Object, Number)>
			return i;
	//   20   39:iload_3         
	//   21   40:ireturn         
		} else
		{
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.W, (new StringBuilder()).append("A delete on ").append(((Object) (obj.getClass()))).append(" within the ContentResolver appeared to fail.").toString());
	//   22   41:getstatic       #132 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.W>
	//   23   44:new             #17  <Class StringBuilder>
	//   24   47:dup             
	//   25   48:invokespecial   #18  <Method void StringBuilder()>
	//   26   51:ldc1            #134 <String "A delete on ">
	//   27   53:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:aload_2         
	//   29   57:invokevirtual   #104 <Method Class Object.getClass()>
	//   30   60:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
	//   31   63:ldc1            #139 <String " within the ContentResolver appeared to fail.">
	//   32   65:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:invokevirtual   #26  <Method String StringBuilder.toString()>
	//   34   71:invokestatic    #145 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
			return i;
	//   35   74:iload_3         
	//   36   75:ireturn         
		}
	}

	public static int delete(Uri uri, Object obj)
	{
		return delete(FlowManager.getContext().getContentResolver(), uri, obj);
	//    0    0:invokestatic    #89  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #95  <Method ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #149 <Method int delete(ContentResolver, Uri, Object)>
	//    5   11:ireturn         
	}

	public static Uri insert(ContentResolver contentresolver, Uri uri, Object obj)
	{
		ModelAdapter modeladapter = FlowManager.getModelAdapter(obj.getClass());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #104 <Method Class Object.getClass()>
	//    2    4:invokestatic    #60  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//    3    7:astore_3        
		ContentValues contentvalues = new ContentValues();
	//    4    8:new             #54  <Class ContentValues>
	//    5   11:dup             
	//    6   12:invokespecial   #61  <Method void ContentValues()>
	//    7   15:astore          4
		modeladapter.bindToInsertValues(contentvalues, obj);
	//    8   17:aload_3         
	//    9   18:aload           4
	//   10   20:aload_2         
	//   11   21:invokevirtual   #73  <Method void ModelAdapter.bindToInsertValues(ContentValues, Object)>
		contentresolver = ((ContentResolver) (contentresolver.insert(uri, contentvalues)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload           4
	//   15   28:invokevirtual   #155 <Method Uri ContentResolver.insert(Uri, ContentValues)>
	//   16   31:astore_0        
		modeladapter.updateAutoIncrement(obj, ((Number) (Long.valueOf((String)((Uri) (contentresolver)).getPathSegments().get(((Uri) (contentresolver)).getPathSegments().size() - 1)))));
	//   17   32:aload_3         
	//   18   33:aload_2         
	//   19   34:aload_0         
	//   20   35:invokevirtual   #159 <Method List Uri.getPathSegments()>
	//   21   38:aload_0         
	//   22   39:invokevirtual   #159 <Method List Uri.getPathSegments()>
	//   23   42:invokeinterface #77  <Method int List.size()>
	//   24   47:iconst_1        
	//   25   48:isub            
	//   26   49:invokeinterface #67  <Method Object List.get(int)>
	//   27   54:checkcast       #161 <Class String>
	//   28   57:invokestatic    #166 <Method Long Long.valueOf(String)>
	//   29   60:invokevirtual   #126 <Method void ModelAdapter.updateAutoIncrement(Object, Number)>
		return ((Uri) (contentresolver));
	//   30   63:aload_0         
	//   31   64:areturn         
	}

	public static Uri insert(Uri uri, Object obj)
	{
		return insert(FlowManager.getContext().getContentResolver(), uri, obj);
	//    0    0:invokestatic    #89  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #95  <Method ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #170 <Method Uri insert(ContentResolver, Uri, Object)>
	//    5   11:areturn         
	}

	public static transient Cursor query(ContentResolver contentresolver, Uri uri, ConditionGroup conditiongroup, String s, String as[])
	{
		return contentresolver.query(uri, as, conditiongroup.getQuery(), ((String []) (null)), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           4
	//    3    4:aload_2         
	//    4    5:invokevirtual   #113 <Method String ConditionGroup.getQuery()>
	//    5    8:aconst_null     
	//    6    9:aload_3         
	//    7   10:invokevirtual   #176 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//    8   13:areturn         
	}

	public static transient List queryList(ContentResolver contentresolver, Uri uri, Class class1, ConditionGroup conditiongroup, String s, String as[])
	{
		contentresolver = ((ContentResolver) (contentresolver.query(uri, as, conditiongroup.getQuery(), ((String []) (null)), s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           5
	//    3    4:aload_3         
	//    4    5:invokevirtual   #113 <Method String ConditionGroup.getQuery()>
	//    5    8:aconst_null     
	//    6    9:aload           4
	//    7   11:invokevirtual   #176 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//    8   14:astore_0        
		if(contentresolver != null)
	//*   9   15:aload_0         
	//*  10   16:ifnull          34
			return (List)FlowManager.getModelAdapter(class1).getListModelLoader().load(((Cursor) (contentresolver)));
	//   11   19:aload_2         
	//   12   20:invokestatic    #60  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//   13   23:invokevirtual   #182 <Method ListModelLoader ModelAdapter.getListModelLoader()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #188 <Method Object ListModelLoader.load(Cursor)>
	//   16   30:checkcast       #63  <Class List>
	//   17   33:areturn         
		else
			return ((List) (new ArrayList()));
	//   18   34:new             #190 <Class ArrayList>
	//   19   37:dup             
	//   20   38:invokespecial   #191 <Method void ArrayList()>
	//   21   41:areturn         
	}

	public static transient List queryList(Uri uri, Class class1, ConditionGroup conditiongroup, String s, String as[])
	{
		return queryList(FlowManager.getContext().getContentResolver(), uri, class1, conditiongroup, s, as);
	//    0    0:invokestatic    #89  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #95  <Method ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokestatic    #195 <Method List queryList(ContentResolver, Uri, Class, ConditionGroup, String, String[])>
	//    8   15:areturn         
	}

	public static transient Object querySingle(ContentResolver contentresolver, Uri uri, Class class1, ConditionGroup conditiongroup, String s, String as[])
	{
		contentresolver = ((ContentResolver) (queryList(contentresolver, uri, class1, conditiongroup, s, as)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokestatic    #195 <Method List queryList(ContentResolver, Uri, Class, ConditionGroup, String, String[])>
	//    7   11:astore_0        
		if(((List) (contentresolver)).size() > 0)
	//*   8   12:aload_0         
	//*   9   13:invokeinterface #77  <Method int List.size()>
	//*  10   18:ifle            29
			return ((List) (contentresolver)).get(0);
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #67  <Method Object List.get(int)>
	//   14   28:areturn         
		else
			return ((Object) (null));
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	public static transient Object querySingle(Uri uri, Class class1, ConditionGroup conditiongroup, String s, String as[])
	{
		return querySingle(FlowManager.getContext().getContentResolver(), uri, class1, conditiongroup, s, as);
	//    0    0:invokestatic    #89  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #95  <Method ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokestatic    #202 <Method Object querySingle(ContentResolver, Uri, Class, ConditionGroup, String, String[])>
	//    8   15:areturn         
	}

	public static int update(ContentResolver contentresolver, Uri uri, Object obj)
	{
		ModelAdapter modeladapter = FlowManager.getModelAdapter(obj.getClass());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #104 <Method Class Object.getClass()>
	//    2    4:invokestatic    #60  <Method ModelAdapter FlowManager.getModelAdapter(Class)>
	//    3    7:astore          4
		ContentValues contentvalues = new ContentValues();
	//    4    9:new             #54  <Class ContentValues>
	//    5   12:dup             
	//    6   13:invokespecial   #61  <Method void ContentValues()>
	//    7   16:astore          5
		modeladapter.bindToContentValues(contentvalues, obj);
	//    8   18:aload           4
	//    9   20:aload           5
	//   10   22:aload_2         
	//   11   23:invokevirtual   #207 <Method void ModelAdapter.bindToContentValues(ContentValues, Object)>
		int i = contentresolver.update(uri, contentvalues, modeladapter.getPrimaryConditionClause(obj).getQuery(), ((String []) (null)));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:aload           5
	//   15   30:aload           4
	//   16   32:aload_2         
	//   17   33:invokevirtual   #108 <Method ConditionGroup ModelAdapter.getPrimaryConditionClause(Object)>
	//   18   36:invokevirtual   #113 <Method String ConditionGroup.getQuery()>
	//   19   39:aconst_null     
	//   20   40:invokevirtual   #210 <Method int ContentResolver.update(Uri, ContentValues, String, String[])>
	//   21   43:istore_3        
		if(i == 0)
	//*  22   44:iload_3         
	//*  23   45:ifne            76
			FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog.Level.W, (new StringBuilder()).append("Updated failed of: ").append(((Object) (obj.getClass()))).toString());
	//   24   48:getstatic       #132 <Field com.raizlabs.android.dbflow.config.FlowLog$Level com.raizlabs.android.dbflow.config.FlowLog$Level.W>
	//   25   51:new             #17  <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #18  <Method void StringBuilder()>
	//   28   58:ldc1            #212 <String "Updated failed of: ">
	//   29   60:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
	//   30   63:aload_2         
	//   31   64:invokevirtual   #104 <Method Class Object.getClass()>
	//   32   67:invokevirtual   #137 <Method StringBuilder StringBuilder.append(Object)>
	//   33   70:invokevirtual   #26  <Method String StringBuilder.toString()>
	//   34   73:invokestatic    #145 <Method void FlowLog.log(com.raizlabs.android.dbflow.config.FlowLog$Level, String)>
		return i;
	//   35   76:iload_3         
	//   36   77:ireturn         
	}

	public static int update(Uri uri, Object obj)
	{
		return update(FlowManager.getContext().getContentResolver(), uri, obj);
	//    0    0:invokestatic    #89  <Method Context FlowManager.getContext()>
	//    1    3:invokevirtual   #95  <Method ContentResolver Context.getContentResolver()>
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokestatic    #214 <Method int update(ContentResolver, Uri, Object)>
	//    5   11:ireturn         
	}

	public static final String BASE_CONTENT_URI = "content://";
}
