// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.os.*;
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
	//    3    3:invokespecial   #34  <Method void SimpleTarget(int, int)>
		requestManager = requestmanager;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #36  <Field RequestManager requestManager>
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
	//    5    7:invokespecial   #40  <Method void PreloadTarget(RequestManager, int, int)>
	//    6   10:areturn         
	}

	void clear()
	{
		requestManager.clear(((Target) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field RequestManager requestManager>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #48  <Method void RequestManager.clear(Target)>
	//    4    8:return          
	}

	public void onResourceReady(Object obj, Transition transition)
	{
		HANDLER.obtainMessage(1, ((Object) (this))).sendToTarget();
	//    0    0:getstatic       #29  <Field Handler HANDLER>
	//    1    3:iconst_1        
	//    2    4:aload_0         
	//    3    5:invokevirtual   #56  <Method Message Handler.obtainMessage(int, Object)>
	//    4    8:invokevirtual   #61  <Method void Message.sendToTarget()>
	//    5   11:return          
	}

	private static final Handler HANDLER = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

		public boolean handleMessage(Message message)
		{
			if(message.what == 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #21  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpne          20
			{
				((PreloadTarget)message.obj).clear();
		//    4    8:aload_1         
		//    5    9:getfield        #25  <Field Object Message.obj>
		//    6   12:checkcast       #8   <Class PreloadTarget>
		//    7   15:invokevirtual   #28  <Method void PreloadTarget.clear()>
				return true;
		//    8   18:iconst_1        
		//    9   19:ireturn         
			} else
			{
				return false;
		//   10   20:iconst_0        
		//   11   21:ireturn         
			}
		}

	}
);
	private final RequestManager requestManager;

	static 
	{
	//    0    0:new             #15  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #21  <Method Looper Looper.getMainLooper()>
	//    3    7:new             #7   <Class PreloadTarget$1>
	//    4   10:dup             
	//    5   11:invokespecial   #24  <Method void PreloadTarget$1()>
	//    6   14:invokespecial   #27  <Method void Handler(Looper, android.os.Handler$Callback)>
	//    7   17:putstatic       #29  <Field Handler HANDLER>
	//*   8   20:return          
	}
}
