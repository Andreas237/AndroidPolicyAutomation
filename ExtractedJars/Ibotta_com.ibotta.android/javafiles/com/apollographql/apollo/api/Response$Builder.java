// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import com.apollographql.apollo.api.internal.Utils;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.apollographql.apollo.api:
//			Response, Operation

public static final class Response$Builder
{

	public Response build()
	{
		return new Response(this);
	//    0    0:new             #7   <Class Response>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #46  <Method void Response(Response$Builder)>
	//    4    8:areturn         
	}

	public Response$Builder data(Object obj)
	{
		data = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Object data>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Response$Builder dependentKeys(Set set)
	{
		dependentKeys = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Set dependentKeys>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Response$Builder errors(List list)
	{
		errors = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field List errors>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Response$Builder fromCache(boolean flag)
	{
		fromCache = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean fromCache>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	Object data;
	Set dependentKeys;
	List errors;
	boolean fromCache;
	final Operation operation;

	Response$Builder(Operation operation1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		operation = (Operation)Utils.checkNotNull(((Object) (operation1)), "operation == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #29  <String "operation == null">
	//    5    8:invokestatic    #35  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #37  <Class Operation>
	//    7   14:putfield        #39  <Field Operation operation>
	//    8   17:return          
	}
}
