// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.appscend.utilities:
//			ProgressWheel

class ProgressWheel$1 extends Handler
{

	public void handleMessage(Message message)
	{
		invalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ProgressWheel this$0>
	//    2    4:invokevirtual   #21  <Method void ProgressWheel.invalidate()>
		if(isSpinning)
	//*   3    7:aload_0         
	//*   4    8:getfield        #12  <Field ProgressWheel this$0>
	//*   5   11:getfield        #25  <Field boolean ProgressWheel.isSpinning>
	//*   6   14:ifeq            103
		{
			message = ((Message) (ProgressWheel.this));
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field ProgressWheel this$0>
	//    9   21:astore_1        
			message.progress = ((ProgressWheel) (message)).progress + ProgressWheel.access$000(ProgressWheel.this);
	//   10   22:aload_1         
	//   11   23:aload_1         
	//   12   24:getfield        #29  <Field int ProgressWheel.progress>
	//   13   27:aload_0         
	//   14   28:getfield        #12  <Field ProgressWheel this$0>
	//   15   31:invokestatic    #33  <Method int ProgressWheel.access$000(ProgressWheel)>
	//   16   34:iadd            
	//   17   35:putfield        #29  <Field int ProgressWheel.progress>
			if(spinOnce && progress >= 360)
	//*  18   38:aload_0         
	//*  19   39:getfield        #12  <Field ProgressWheel this$0>
	//*  20   42:getfield        #36  <Field boolean ProgressWheel.spinOnce>
	//*  21   45:ifeq            62
	//*  22   48:aload_0         
	//*  23   49:getfield        #12  <Field ProgressWheel this$0>
	//*  24   52:getfield        #29  <Field int ProgressWheel.progress>
	//*  25   55:sipush          360
	//*  26   58:icmplt          62
				return;
	//   27   61:return          
			if(progress > 360)
	//*  28   62:aload_0         
	//*  29   63:getfield        #12  <Field ProgressWheel this$0>
	//*  30   66:getfield        #29  <Field int ProgressWheel.progress>
	//*  31   69:sipush          360
	//*  32   72:icmple          83
				progress = 0;
	//   33   75:aload_0         
	//   34   76:getfield        #12  <Field ProgressWheel this$0>
	//   35   79:iconst_0        
	//   36   80:putfield        #29  <Field int ProgressWheel.progress>
			ProgressWheel.access$200(ProgressWheel.this).sendEmptyMessageDelayed(0, ProgressWheel.access$100(ProgressWheel.this));
	//   37   83:aload_0         
	//   38   84:getfield        #12  <Field ProgressWheel this$0>
	//   39   87:invokestatic    #40  <Method Handler ProgressWheel.access$200(ProgressWheel)>
	//   40   90:iconst_0        
	//   41   91:aload_0         
	//   42   92:getfield        #12  <Field ProgressWheel this$0>
	//   43   95:invokestatic    #43  <Method int ProgressWheel.access$100(ProgressWheel)>
	//   44   98:i2l             
	//   45   99:invokevirtual   #47  <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//   46  102:pop             
		}
	//   47  103:return          
	}

	final ProgressWheel this$0;

	ProgressWheel$1()
	{
		this$0 = ProgressWheel.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ProgressWheel this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Handler()>
	//    5    9:return          
	}
}
