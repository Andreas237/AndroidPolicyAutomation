// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.persistence;

import com.firebase.client.core.view.QuerySpec;

public class TrackedQuery
{

	public TrackedQuery(long l, QuerySpec queryspec, long l1, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		id = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #19  <Field long id>
		if(queryspec.loadsAllData() && !queryspec.isDefault())
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #25  <Method boolean QuerySpec.loadsAllData()>
	//*   7   13:ifeq            36
	//*   8   16:aload_3         
	//*   9   17:invokevirtual   #28  <Method boolean QuerySpec.isDefault()>
	//*  10   20:ifeq            26
	//*  11   23:goto            36
		{
			throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
	//   12   26:new             #30  <Class IllegalArgumentException>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "Can't create TrackedQuery for a non-default query that loads all data">
	//   15   32:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   16   35:athrow          
		} else
		{
			querySpec = queryspec;
	//   17   36:aload_0         
	//   18   37:aload_3         
	//   19   38:putfield        #37  <Field QuerySpec querySpec>
			lastUse = l1;
	//   20   41:aload_0         
	//   21   42:lload           4
	//   22   44:putfield        #39  <Field long lastUse>
			complete = flag;
	//   23   47:aload_0         
	//   24   48:iload           6
	//   25   50:putfield        #41  <Field boolean complete>
			active = flag1;
	//   26   53:aload_0         
	//   27   54:iload           7
	//   28   56:putfield        #43  <Field boolean active>
			return;
	//   29   59:return          
		}
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          93
		{
			if(obj.getClass() != ((Object)this).getClass())
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #50  <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #50  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TrackedQuery)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TrackedQuery>
	//   16   28:astore_1        
			return id == ((TrackedQuery) (obj)).id && querySpec.equals(((Object) (((TrackedQuery) (obj)).querySpec))) && lastUse == ((TrackedQuery) (obj)).lastUse && complete == ((TrackedQuery) (obj)).complete && active == ((TrackedQuery) (obj)).active;
	//   17   29:aload_0         
	//   18   30:getfield        #19  <Field long id>
	//   19   33:aload_1         
	//   20   34:getfield        #19  <Field long id>
	//   21   37:lcmp            
	//   22   38:ifne            91
	//   23   41:aload_0         
	//   24   42:getfield        #37  <Field QuerySpec querySpec>
	//   25   45:aload_1         
	//   26   46:getfield        #37  <Field QuerySpec querySpec>
	//   27   49:invokevirtual   #52  <Method boolean QuerySpec.equals(Object)>
	//   28   52:ifeq            91
	//   29   55:aload_0         
	//   30   56:getfield        #39  <Field long lastUse>
	//   31   59:aload_1         
	//   32   60:getfield        #39  <Field long lastUse>
	//   33   63:lcmp            
	//   34   64:ifne            91
	//   35   67:aload_0         
	//   36   68:getfield        #41  <Field boolean complete>
	//   37   71:aload_1         
	//   38   72:getfield        #41  <Field boolean complete>
	//   39   75:icmpne          91
	//   40   78:aload_0         
	//   41   79:getfield        #43  <Field boolean active>
	//   42   82:aload_1         
	//   43   83:getfield        #43  <Field boolean active>
	//   44   86:icmpne          91
	//   45   89:iconst_1        
	//   46   90:ireturn         
	//   47   91:iconst_0        
	//   48   92:ireturn         
		} else
		{
			return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
		}
	}

	public int hashCode()
	{
		return (((Long.valueOf(id).hashCode() * 31 + querySpec.hashCode()) * 31 + Long.valueOf(lastUse).hashCode()) * 31 + Boolean.valueOf(complete).hashCode()) * 31 + Boolean.valueOf(active).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field long id>
	//    2    4:invokestatic    #60  <Method Long Long.valueOf(long)>
	//    3    7:invokevirtual   #62  <Method int Long.hashCode()>
	//    4   10:bipush          31
	//    5   12:imul            
	//    6   13:aload_0         
	//    7   14:getfield        #37  <Field QuerySpec querySpec>
	//    8   17:invokevirtual   #63  <Method int QuerySpec.hashCode()>
	//    9   20:iadd            
	//   10   21:bipush          31
	//   11   23:imul            
	//   12   24:aload_0         
	//   13   25:getfield        #39  <Field long lastUse>
	//   14   28:invokestatic    #60  <Method Long Long.valueOf(long)>
	//   15   31:invokevirtual   #62  <Method int Long.hashCode()>
	//   16   34:iadd            
	//   17   35:bipush          31
	//   18   37:imul            
	//   19   38:aload_0         
	//   20   39:getfield        #41  <Field boolean complete>
	//   21   42:invokestatic    #68  <Method Boolean Boolean.valueOf(boolean)>
	//   22   45:invokevirtual   #69  <Method int Boolean.hashCode()>
	//   23   48:iadd            
	//   24   49:bipush          31
	//   25   51:imul            
	//   26   52:aload_0         
	//   27   53:getfield        #43  <Field boolean active>
	//   28   56:invokestatic    #68  <Method Boolean Boolean.valueOf(boolean)>
	//   29   59:invokevirtual   #69  <Method int Boolean.hashCode()>
	//   30   62:iadd            
	//   31   63:ireturn         
	}

	public TrackedQuery setActiveState(boolean flag)
	{
		return new TrackedQuery(id, querySpec, lastUse, complete, flag);
	//    0    0:new             #2   <Class TrackedQuery>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field long id>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field QuerySpec querySpec>
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field long lastUse>
	//    8   16:aload_0         
	//    9   17:getfield        #41  <Field boolean complete>
	//   10   20:iload_1         
	//   11   21:invokespecial   #73  <Method void TrackedQuery(long, QuerySpec, long, boolean, boolean)>
	//   12   24:areturn         
	}

	public TrackedQuery setComplete()
	{
		return new TrackedQuery(id, querySpec, lastUse, true, active);
	//    0    0:new             #2   <Class TrackedQuery>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field long id>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field QuerySpec querySpec>
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field long lastUse>
	//    8   16:iconst_1        
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field boolean active>
	//   11   21:invokespecial   #73  <Method void TrackedQuery(long, QuerySpec, long, boolean, boolean)>
	//   12   24:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("TrackedQuery{id=");
	//    4    8:aload_1         
	//    5    9:ldc1            #82  <String "TrackedQuery{id=">
	//    6   11:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(id);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #19  <Field long id>
	//   11   20:invokevirtual   #89  <Method StringBuilder StringBuilder.append(long)>
	//   12   23:pop             
		stringbuilder.append(", querySpec=");
	//   13   24:aload_1         
	//   14   25:ldc1            #91  <String ", querySpec=">
	//   15   27:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (querySpec)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #37  <Field QuerySpec querySpec>
	//   20   36:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", lastUse=");
	//   22   40:aload_1         
	//   23   41:ldc1            #96  <String ", lastUse=">
	//   24   43:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(lastUse);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #39  <Field long lastUse>
	//   29   52:invokevirtual   #89  <Method StringBuilder StringBuilder.append(long)>
	//   30   55:pop             
		stringbuilder.append(", complete=");
	//   31   56:aload_1         
	//   32   57:ldc1            #98  <String ", complete=">
	//   33   59:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(complete);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #41  <Field boolean complete>
	//   38   68:invokevirtual   #101 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   71:pop             
		stringbuilder.append(", active=");
	//   40   72:aload_1         
	//   41   73:ldc1            #103 <String ", active=">
	//   42   75:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(active);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #43  <Field boolean active>
	//   47   84:invokevirtual   #101 <Method StringBuilder StringBuilder.append(boolean)>
	//   48   87:pop             
		stringbuilder.append("}");
	//   49   88:aload_1         
	//   50   89:ldc1            #105 <String "}">
	//   51   91:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		return stringbuilder.toString();
	//   53   95:aload_1         
	//   54   96:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   55   99:areturn         
	}

	public TrackedQuery updateLastUse(long l)
	{
		return new TrackedQuery(id, querySpec, l, complete, active);
	//    0    0:new             #2   <Class TrackedQuery>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field long id>
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field QuerySpec querySpec>
	//    6   12:lload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field boolean complete>
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field boolean active>
	//   11   21:invokespecial   #73  <Method void TrackedQuery(long, QuerySpec, long, boolean, boolean)>
	//   12   24:areturn         
	}

	public final boolean active;
	public final boolean complete;
	public final long id;
	public final long lastUse;
	public final QuerySpec querySpec;
}
