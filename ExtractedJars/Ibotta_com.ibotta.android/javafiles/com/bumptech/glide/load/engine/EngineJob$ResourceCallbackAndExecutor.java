// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.ResourceCallback;
import java.util.concurrent.Executor;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob

static final class EngineJob$ResourceCallbackAndExecutor
{

	public boolean equals(Object obj)
	{
		if(obj instanceof EngineJob$ResourceCallbackAndExecutor)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class EngineJob$ResourceCallbackAndExecutor>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((EngineJob$ResourceCallbackAndExecutor)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class EngineJob$ResourceCallbackAndExecutor>
	//    5   11:astore_1        
			return ((Object) (cb)).equals(((Object) (((EngineJob$ResourceCallbackAndExecutor) (obj)).cb)));
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field ResourceCallback cb>
	//    8   16:aload_1         
	//    9   17:getfield        #18  <Field ResourceCallback cb>
	//   10   20:invokevirtual   #25  <Method boolean Object.equals(Object)>
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public int hashCode()
	{
		return ((Object) (cb)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ResourceCallback cb>
	//    2    4:invokevirtual   #29  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	final ResourceCallback cb;
	final Executor executor;

	EngineJob$ResourceCallbackAndExecutor(ResourceCallback resourcecallback, Executor executor1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		cb = resourcecallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ResourceCallback cb>
		executor = executor1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Executor executor>
	//    8   14:return          
	}
}
