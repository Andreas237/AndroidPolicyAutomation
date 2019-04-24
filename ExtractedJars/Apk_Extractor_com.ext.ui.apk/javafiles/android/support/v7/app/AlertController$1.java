// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$1
	implements android.view.er
{

	public void onClick(View view)
	{
		if(view == mButtonPositive && mButtonPositiveMessage != null)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #14  <Field AlertController this$0>
	//*   3    5:getfield        #24  <Field android.widget.Button AlertController.mButtonPositive>
	//*   4    8:if_acmpne       62
	//*   5   11:aload_0         
	//*   6   12:getfield        #14  <Field AlertController this$0>
	//*   7   15:getfield        #28  <Field Message AlertController.mButtonPositiveMessage>
	//*   8   18:ifnull          62
			view = ((View) (Message.obtain(mButtonPositiveMessage)));
	//    9   21:aload_0         
	//   10   22:getfield        #14  <Field AlertController this$0>
	//   11   25:getfield        #28  <Field Message AlertController.mButtonPositiveMessage>
	//   12   28:invokestatic    #34  <Method Message Message.obtain(Message)>
	//   13   31:astore_1        
		else
	//*  14   32:aload_1         
	//*  15   33:ifnull          40
	//*  16   36:aload_1         
	//*  17   37:invokevirtual   #37  <Method void Message.sendToTarget()>
	//*  18   40:aload_0         
	//*  19   41:getfield        #14  <Field AlertController this$0>
	//*  20   44:getfield        #41  <Field Handler AlertController.mHandler>
	//*  21   47:iconst_1        
	//*  22   48:aload_0         
	//*  23   49:getfield        #14  <Field AlertController this$0>
	//*  24   52:getfield        #45  <Field AppCompatDialog AlertController.mDialog>
	//*  25   55:invokevirtual   #51  <Method Message Handler.obtainMessage(int, Object)>
	//*  26   58:invokevirtual   #37  <Method void Message.sendToTarget()>
	//*  27   61:return          
		if(view == mButtonNegative && mButtonNegativeMessage != null)
	//*  28   62:aload_1         
	//*  29   63:aload_0         
	//*  30   64:getfield        #14  <Field AlertController this$0>
	//*  31   67:getfield        #54  <Field android.widget.Button AlertController.mButtonNegative>
	//*  32   70:if_acmpne       97
	//*  33   73:aload_0         
	//*  34   74:getfield        #14  <Field AlertController this$0>
	//*  35   77:getfield        #57  <Field Message AlertController.mButtonNegativeMessage>
	//*  36   80:ifnull          97
			view = ((View) (Message.obtain(mButtonNegativeMessage)));
	//   37   83:aload_0         
	//   38   84:getfield        #14  <Field AlertController this$0>
	//   39   87:getfield        #57  <Field Message AlertController.mButtonNegativeMessage>
	//   40   90:invokestatic    #34  <Method Message Message.obtain(Message)>
	//   41   93:astore_1        
		else
	//*  42   94:goto            32
		if(view == mButtonNeutral && mButtonNeutralMessage != null)
	//*  43   97:aload_1         
	//*  44   98:aload_0         
	//*  45   99:getfield        #14  <Field AlertController this$0>
	//*  46  102:getfield        #60  <Field android.widget.Button AlertController.mButtonNeutral>
	//*  47  105:if_acmpne       132
	//*  48  108:aload_0         
	//*  49  109:getfield        #14  <Field AlertController this$0>
	//*  50  112:getfield        #63  <Field Message AlertController.mButtonNeutralMessage>
	//*  51  115:ifnull          132
			view = ((View) (Message.obtain(mButtonNeutralMessage)));
	//   52  118:aload_0         
	//   53  119:getfield        #14  <Field AlertController this$0>
	//   54  122:getfield        #63  <Field Message AlertController.mButtonNeutralMessage>
	//   55  125:invokestatic    #34  <Method Message Message.obtain(Message)>
	//   56  128:astore_1        
		else
	//*  57  129:goto            32
			view = null;
	//   58  132:aconst_null     
	//   59  133:astore_1        
		if(view != null)
			((Message) (view)).sendToTarget();
		mHandler.obtainMessage(1, ((Object) (mDialog))).sendToTarget();
	//*  60  134:goto            32
	}

	final AlertController this$0;

	AlertController$1()
	{
		this$0 = AlertController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AlertController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
