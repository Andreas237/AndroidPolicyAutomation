// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.Request;

// Referenced classes of package com.bumptech.glide.request.target:
//			Target

public abstract class BaseTarget
	implements Target
{

	public BaseTarget()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public Request getRequest()
	{
		return request;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Request request>
	//    2    4:areturn         
	}

	public void onDestroy()
	{
	//    0    0:return          
	}

	public void onLoadCleared(Drawable drawable)
	{
	//    0    0:return          
	}

	public void onLoadFailed(Drawable drawable)
	{
	//    0    0:return          
	}

	public void onLoadStarted(Drawable drawable)
	{
	//    0    0:return          
	}

	public void onStart()
	{
	//    0    0:return          
	}

	public void onStop()
	{
	//    0    0:return          
	}

	public void setRequest(Request request1)
	{
		request = request1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Request request>
	//    3    5:return          
	}

	private Request request;
}
