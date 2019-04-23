// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseView

class MadvertiseView$1 extends Handler
{

	public void handleMessage(Message message)
	{
		int i = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #24  <Field int Message.what>
	//    2    4:istore_2        
		if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            23
		{
			if(i != 2)
	//*   5    9:iload_2         
	//*   6   10:iconst_2        
	//*   7   11:icmpeq          15
			{
				return;
	//    8   14:return          
			} else
			{
				MadvertiseView.access$000(MadvertiseView.this);
	//    9   15:aload_0         
	//   10   16:getfield        #12  <Field MadvertiseView this$0>
	//   11   19:invokestatic    #27  <Method void MadvertiseView.access$000(MadvertiseView)>
				return;
	//   12   22:return          
			}
		} else
		{
			setVisibility(0);
	//   13   23:aload_0         
	//   14   24:getfield        #12  <Field MadvertiseView this$0>
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #31  <Method void MadvertiseView.setVisibility(int)>
			return;
	//   17   31:return          
		}
	}

	final MadvertiseView this$0;

	MadvertiseView$1()
	{
		this$0 = MadvertiseView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MadvertiseView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Handler()>
	//    5    9:return          
	}
}
