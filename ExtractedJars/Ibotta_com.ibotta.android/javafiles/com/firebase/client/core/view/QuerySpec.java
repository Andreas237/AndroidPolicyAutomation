// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.view;

import com.firebase.client.core.Path;
import com.firebase.client.snapshot.Index;
import java.util.Map;

// Referenced classes of package com.firebase.client.core.view:
//			QueryParams

public class QuerySpec
{

	public QuerySpec(Path path1, QueryParams queryparams)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		path = path1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Path path>
		params = queryparams;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field QueryParams params>
	//    8   14:return          
	}

	public static QuerySpec defaultQueryAtPath(Path path1)
	{
		return new QuerySpec(path1, QueryParams.DEFAULT_PARAMS);
	//    0    0:new             #2   <Class QuerySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field QueryParams QueryParams.DEFAULT_PARAMS>
	//    4    8:invokespecial   #27  <Method void QuerySpec(Path, QueryParams)>
	//    5   11:areturn         
	}

	public static QuerySpec fromPathAndQueryObject(Path path1, Map map)
	{
		return new QuerySpec(path1, QueryParams.fromQueryObject(map));
	//    0    0:new             #2   <Class QuerySpec>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #33  <Method QueryParams QueryParams.fromQueryObject(Map)>
	//    5    9:invokespecial   #27  <Method void QuerySpec(Path, QueryParams)>
	//    6   12:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          63
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #41  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #41  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((QuerySpec)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class QuerySpec>
	//   16   28:astore_1        
			if(!path.equals(((Object) (((QuerySpec) (obj)).path))))
	//*  17   29:aload_0         
	//*  18   30:getfield        #15  <Field Path path>
	//*  19   33:aload_1         
	//*  20   34:getfield        #15  <Field Path path>
	//*  21   37:invokevirtual   #45  <Method boolean Path.equals(Object)>
	//*  22   40:ifne            45
				return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
			return params.equals(((Object) (((QuerySpec) (obj)).params)));
	//   25   45:aload_0         
	//   26   46:getfield        #17  <Field QueryParams params>
	//   27   49:aload_1         
	//   28   50:getfield        #17  <Field QueryParams params>
	//   29   53:invokevirtual   #46  <Method boolean QueryParams.equals(Object)>
	//   30   56:ifne            61
	//   31   59:iconst_0        
	//   32   60:ireturn         
	//   33   61:iconst_1        
	//   34   62:ireturn         
		} else
		{
			return false;
	//   35   63:iconst_0        
	//   36   64:ireturn         
		}
	}

	public Index getIndex()
	{
		return params.getIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field QueryParams params>
	//    2    4:invokevirtual   #50  <Method Index QueryParams.getIndex()>
	//    3    7:areturn         
	}

	public QueryParams getParams()
	{
		return params;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field QueryParams params>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		return path;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Path path>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return path.hashCode() * 31 + params.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Path path>
	//    2    4:invokevirtual   #58  <Method int Path.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #17  <Field QueryParams params>
	//    7   14:invokevirtual   #59  <Method int QueryParams.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public boolean isDefault()
	{
		return params.isDefault();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field QueryParams params>
	//    2    4:invokevirtual   #63  <Method boolean QueryParams.isDefault()>
	//    3    7:ireturn         
	}

	public boolean loadsAllData()
	{
		return params.loadsAllData();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field QueryParams params>
	//    2    4:invokevirtual   #66  <Method boolean QueryParams.loadsAllData()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #70  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #71  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object) (path)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field Path path>
	//    7   13:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(":");
	//    9   17:aload_1         
	//   10   18:ldc1            #77  <String ":">
	//   11   20:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (params)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #17  <Field QueryParams params>
	//   16   29:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	private final QueryParams params;
	private final Path path;
}
