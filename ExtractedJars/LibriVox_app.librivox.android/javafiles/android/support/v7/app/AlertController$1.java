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
	//*   2    2:getfield        #12  <Field AlertController this$0>
	//*   3    5:getfield        #24  <Field android.widget.Button AlertController.mButtonPositive>
	//*   4    8:if_acmpne       35
	//*   5   11:aload_0         
	//*   6   12:getfield        #12  <Field AlertController this$0>
	//*   7   15:getfield        #28  <Field Message AlertController.mButtonPositiveMessage>
	//*   8   18:ifnull          35
			view = ((View) (Message.obtain(mButtonPositiveMessage)));
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field AlertController this$0>
	//   11   25:getfield        #28  <Field Message AlertController.mButtonPositiveMessage>
	//   12   28:invokestatic    #34  <Method Message Message.obtain(Message)>
	//   13   31:astore_1        
		else
	//*  14   32:goto            107
		if(view == mButtonNegative && mButtonNegativeMessage != null)
	//*  15   35:aload_1         
	//*  16   36:aload_0         
	//*  17   37:getfield        #12  <Field AlertController this$0>
	//*  18   40:getfield        #37  <Field android.widget.Button AlertController.mButtonNegative>
	//*  19   43:if_acmpne       70
	//*  20   46:aload_0         
	//*  21   47:getfield        #12  <Field AlertController this$0>
	//*  22   50:getfield        #40  <Field Message AlertController.mButtonNegativeMessage>
	//*  23   53:ifnull          70
			view = ((View) (Message.obtain(mButtonNegativeMessage)));
	//   24   56:aload_0         
	//   25   57:getfield        #12  <Field AlertController this$0>
	//   26   60:getfield        #40  <Field Message AlertController.mButtonNegativeMessage>
	//   27   63:invokestatic    #34  <Method Message Message.obtain(Message)>
	//   28   66:astore_1        
		else
	//*  29   67:goto            107
		if(view == mButtonNeutral && mButtonNeutralMessage != null)
	//*  30   70:aload_1         
	//*  31   71:aload_0         
	//*  32   72:getfield        #12  <Field AlertController this$0>
	//*  33   75:getfield        #43  <Field android.widget.Button AlertController.mButtonNeutral>
	//*  34   78:if_acmpne       105
	//*  35   81:aload_0         
	//*  36   82:getfield        #12  <Field AlertController this$0>
	//*  37   85:getfield        #46  <Field Message AlertController.mButtonNeutralMessage>
	//*  38   88:ifnull          105
			view = ((View) (Message.obtain(mButtonNeutralMessage)));
	//   39   91:aload_0         
	//   40   92:getfield        #12  <Field AlertController this$0>
	//   41   95:getfield        #46  <Field Message AlertController.mButtonNeutralMessage>
	//   42   98:invokestatic    #34  <Method Message Message.obtain(Message)>
	//   43  101:astore_1        
		else
	//*  44  102:goto            107
			view = null;
	//   45  105:aconst_null     
	//   46  106:astore_1        
		if(view != null)
	//*  47  107:aload_1         
	//*  48  108:ifnull          115
			((Message) (view)).sendToTarget();
	//   49  111:aload_1         
	//   50  112:invokevirtual   #49  <Method void Message.sendToTarget()>
		mHandler.obtainMessage(1, ((Object) (mDialog))).sendToTarget();
	//   51  115:aload_0         
	//   52  116:getfield        #12  <Field AlertController this$0>
	//   53  119:getfield        #53  <Field Handler AlertController.mHandler>
	//   54  122:iconst_1        
	//   55  123:aload_0         
	//   56  124:getfield        #12  <Field AlertController this$0>
	//   57  127:getfield        #57  <Field AppCompatDialog AlertController.mDialog>
	//   58  130:invokevirtual   #63  <Method Message Handler.obtainMessage(int, Object)>
	//   59  133:invokevirtual   #49  <Method void Message.sendToTarget()>
	//   60  136:return          
	}

	final AlertController this$0;

	AlertController$1()
	{
		this$0 = AlertController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AlertController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
