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
		if(view != a.c || a.d == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field AlertController a>
	//    3    5:getfield        #24  <Field android.widget.Button AlertController.c>
	//    4    8:if_acmpne       37
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field AlertController a>
	//    7   15:getfield        #28  <Field Message AlertController.d>
	//    8   18:ifnull          37
_L1:
		view = ((View) (a.d));
	//    9   21:aload_0         
	//   10   22:getfield        #14  <Field AlertController a>
	//   11   25:getfield        #28  <Field Message AlertController.d>
	//   12   28:astore_1        
_L4:
		view = ((View) (Message.obtain(((Message) (view)))));
	//   13   29:aload_1         
	//   14   30:invokestatic    #34  <Method Message Message.obtain(Message)>
	//   15   33:astore_1        
		break MISSING_BLOCK_LABEL_103;
	//   16   34:goto            103
_L2:
		if(view == a.e && a.f != null)
	//*  17   37:aload_1         
	//*  18   38:aload_0         
	//*  19   39:getfield        #14  <Field AlertController a>
	//*  20   42:getfield        #37  <Field android.widget.Button AlertController.e>
	//*  21   45:if_acmpne       69
	//*  22   48:aload_0         
	//*  23   49:getfield        #14  <Field AlertController a>
	//*  24   52:getfield        #40  <Field Message AlertController.f>
	//*  25   55:ifnull          69
		{
			view = ((View) (a.f));
	//   26   58:aload_0         
	//   27   59:getfield        #14  <Field AlertController a>
	//   28   62:getfield        #40  <Field Message AlertController.f>
	//   29   65:astore_1        
			continue; /* Loop/switch isn't completed */
	//   30   66:goto            29
		}
		if(view != a.g || a.h == null)
			break; /* Loop/switch isn't completed */
	//   31   69:aload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #14  <Field AlertController a>
	//   34   74:getfield        #43  <Field android.widget.Button AlertController.g>
	//   35   77:if_acmpne       101
	//   36   80:aload_0         
	//   37   81:getfield        #14  <Field AlertController a>
	//   38   84:getfield        #46  <Field Message AlertController.h>
	//   39   87:ifnull          101
		view = ((View) (a.h));
	//   40   90:aload_0         
	//   41   91:getfield        #14  <Field AlertController a>
	//   42   94:getfield        #46  <Field Message AlertController.h>
	//   43   97:astore_1        
		if(true) goto _L4; else goto _L3
	//   44   98:goto            29
_L3:
		view = null;
	//   45  101:aconst_null     
	//   46  102:astore_1        
		if(view != null)
	//*  47  103:aload_1         
	//*  48  104:ifnull          111
			((Message) (view)).sendToTarget();
	//   49  107:aload_1         
	//   50  108:invokevirtual   #49  <Method void Message.sendToTarget()>
		a.p.obtainMessage(1, ((Object) (a.a))).sendToTarget();
	//   51  111:aload_0         
	//   52  112:getfield        #14  <Field AlertController a>
	//   53  115:getfield        #53  <Field Handler AlertController.p>
	//   54  118:iconst_1        
	//   55  119:aload_0         
	//   56  120:getfield        #14  <Field AlertController a>
	//   57  123:getfield        #56  <Field i AlertController.a>
	//   58  126:invokevirtual   #62  <Method Message Handler.obtainMessage(int, Object)>
	//   59  129:invokevirtual   #49  <Method void Message.sendToTarget()>
		return;
	//   60  132:return          
	}

	final AlertController a;

	AlertController$1(AlertController alertcontroller)
	{
		a = alertcontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AlertController a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
