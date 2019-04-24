// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.transition.Transition;

// Referenced classes of package com.bumptech.glide.request.target:
//			SimpleTarget

public final class PreloadTarget extends SimpleTarget
{

	private PreloadTarget(RequestManager requestmanager, int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokespecial   #12  <Method void SimpleTarget(int, int)>
		requestManager = requestmanager;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #14  <Field RequestManager requestManager>
	//    7   11:return          
	}

	public static PreloadTarget obtain(RequestManager requestmanager, int i, int j)
	{
		return new PreloadTarget(requestmanager, i, j);
	//    0    0:new             #2   <Class PreloadTarget>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #19  <Method void PreloadTarget(RequestManager, int, int)>
	//    6   10:areturn         
	}

	public void onResourceReady(Object obj, Transition transition)
	{
		requestManager.clear(((Target) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RequestManager requestManager>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #29  <Method void RequestManager.clear(Target)>
	//    4    8:return          
	}

	private final RequestManager requestManager;
}
