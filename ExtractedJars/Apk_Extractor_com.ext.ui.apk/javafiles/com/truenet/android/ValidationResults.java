// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.ae;
import java.util.List;

public final class ValidationResults
{

	public ValidationResults(List list)
	{
		ae.b(((Object) (list)), "results");
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "results">
	//    2    3:invokestatic    #21  <Method void ae.b(Object, String)>
		super();
	//    3    6:aload_0         
	//    4    7:invokespecial   #24  <Method void Object()>
		results = list;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #26  <Field List results>
	//    8   15:return          
	}

	public static ValidationResults copy$default(ValidationResults validationresults, List list, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			list = validationresults.results;
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field List results>
	//    6   10:astore_1        
		return validationresults.copy(list);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #36  <Method ValidationResults copy(List)>
	//   10   16:areturn         
	}

	public final List component1()
	{
		return results;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List results>
	//    2    4:areturn         
	}

	public final ValidationResults copy(List list)
	{
		ae.b(((Object) (list)), "results");
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "results">
	//    2    3:invokestatic    #21  <Method void ae.b(Object, String)>
		return new ValidationResults(list);
	//    3    6:new             #2   <Class ValidationResults>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:invokespecial   #42  <Method void ValidationResults(List)>
	//    7   14:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpeq       31
			{
				if(!(obj instanceof ValidationResults))
					break label0;
	//    3    5:aload_1         
	//    4    6:instanceof      #2   <Class ValidationResults>
	//    5    9:ifeq            33
				obj = ((Object) ((ValidationResults)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #2   <Class ValidationResults>
	//    8   16:astore_1        
				if(!ae.a(((Object) (results)), ((Object) (((ValidationResults) (obj)).results))))
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #26  <Field List results>
	//   11   21:aload_1         
	//   12   22:getfield        #26  <Field List results>
	//   13   25:invokestatic    #49  <Method boolean ae.a(Object, Object)>
	//   14   28:ifeq            33
			}
			return true;
	//   15   31:iconst_1        
	//   16   32:ireturn         
		}
		return false;
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	public final List getResults()
	{
		return results;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List results>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		List list = results;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List results>
	//    2    4:astore_1        
		if(list != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return ((Object) (list)).hashCode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #54  <Method int Object.hashCode()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("ValidationResults(results=").append(((Object) (results))).append(")").toString();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:ldc1            #61  <String "ValidationResults(results=">
	//    4    9:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #26  <Field List results>
	//    7   16:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #70  <String ")">
	//    9   21:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	private final List results;
}
