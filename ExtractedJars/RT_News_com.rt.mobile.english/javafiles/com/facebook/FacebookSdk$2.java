// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook:
//			FacebookSdk

static final class FacebookSdk$2
	implements Callable
{

	public File call()
		throws Exception
	{
		return FacebookSdk.access$000().getCacheDir();
	//    0    0:invokestatic    #25  <Method Context FacebookSdk.access$000()>
	//    1    3:invokevirtual   #30  <Method File Context.getCacheDir()>
	//    2    6:areturn         
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method File call()>
	//    2    4:areturn         
	}

	FacebookSdk$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
