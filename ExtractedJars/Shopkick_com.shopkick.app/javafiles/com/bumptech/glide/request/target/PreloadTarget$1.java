// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.os.Message;

// Referenced classes of package com.bumptech.glide.request.target:
//			PreloadTarget

class PreloadTarget$1
	implements android.os.
{

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

	PreloadTarget$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
