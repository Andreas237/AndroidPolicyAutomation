// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;
import android.text.TextUtils;

// Referenced classes of package o:
//			dhx

public abstract class dif extends Handler
{

	public dif(Looper looper)
	{
		super(looper);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void Handler(Looper)>
		sendEmptyMessageDelayed(1002, 30000L);
	//    3    5:aload_0         
	//    4    6:sipush          1002
	//    5    9:ldc2w           #9   <Long 30000L>
	//    6   12:invokevirtual   #14  <Method boolean sendEmptyMessageDelayed(int, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void a(Object obj)
	{
		Message message = obtainMessage(1001);
	//    0    0:aload_0         
	//    1    1:sipush          1001
	//    2    4:invokevirtual   #21  <Method Message obtainMessage(int)>
	//    3    7:astore_2        
		message.obj = obj;
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:putfield        #27  <Field Object Message.obj>
		sendMessage(message);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #31  <Method boolean sendMessage(Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	public void b(Object obj, String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            13
		{
			a(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #41  <Method void a(Object)>
			return;
	//    6   12:return          
		} else
		{
			Message message = obtainMessage(1000);
	//    7   13:aload_0         
	//    8   14:sipush          1000
	//    9   17:invokevirtual   #21  <Method Message obtainMessage(int)>
	//   10   20:astore_3        
			dhx dhx1 = new dhx();
	//   11   21:new             #43  <Class dhx>
	//   12   24:dup             
	//   13   25:invokespecial   #46  <Method void dhx()>
	//   14   28:astore          4
			dhx1.c = obj;
	//   15   30:aload           4
	//   16   32:aload_1         
	//   17   33:putfield        #49  <Field Object dhx.c>
			dhx1.a = s;
	//   18   36:aload           4
	//   19   38:aload_2         
	//   20   39:putfield        #52  <Field String dhx.a>
			message.obj = ((Object) (dhx1));
	//   21   42:aload_3         
	//   22   43:aload           4
	//   23   45:putfield        #27  <Field Object Message.obj>
			sendMessage(message);
	//   24   48:aload_0         
	//   25   49:aload_3         
	//   26   50:invokevirtual   #31  <Method boolean sendMessage(Message)>
	//   27   53:pop             
			return;
	//   28   54:return          
		}
	}

	protected abstract void d(Object obj, String s);

	protected abstract void e();

	public void handleMessage(Message message)
	{
		super.handleMessage(message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void Handler.handleMessage(Message)>
		switch(message.what)
	//*   3    5:aload_1         
	//*   4    6:getfield        #62  <Field int Message.what>
		{
	//*   5    9:tableswitch     1000 1002: default 36
	//	               1000 37
	//	               1001 76
	//	               1002 104
		default:
			return;
	//    6   36:return          

		case 1000: 
			removeMessages(1002);
	//    7   37:aload_0         
	//    8   38:sipush          1002
	//    9   41:invokevirtual   #66  <Method void removeMessages(int)>
			sendEmptyMessageDelayed(1002, 30000L);
	//   10   44:aload_0         
	//   11   45:sipush          1002
	//   12   48:ldc2w           #9   <Long 30000L>
	//   13   51:invokevirtual   #14  <Method boolean sendEmptyMessageDelayed(int, long)>
	//   14   54:pop             
			message = ((Message) ((dhx)message.obj));
	//   15   55:aload_1         
	//   16   56:getfield        #27  <Field Object Message.obj>
	//   17   59:checkcast       #43  <Class dhx>
	//   18   62:astore_1        
			d(((dhx) (message)).c, ((dhx) (message)).a);
	//   19   63:aload_0         
	//   20   64:aload_1         
	//   21   65:getfield        #49  <Field Object dhx.c>
	//   22   68:aload_1         
	//   23   69:getfield        #52  <Field String dhx.a>
	//   24   72:invokevirtual   #68  <Method void d(Object, String)>
			return;
	//   25   75:return          

		case 1001: 
			removeMessages(1002);
	//   26   76:aload_0         
	//   27   77:sipush          1002
	//   28   80:invokevirtual   #66  <Method void removeMessages(int)>
			sendEmptyMessageDelayed(1002, 30000L);
	//   29   83:aload_0         
	//   30   84:sipush          1002
	//   31   87:ldc2w           #9   <Long 30000L>
	//   32   90:invokevirtual   #14  <Method boolean sendEmptyMessageDelayed(int, long)>
	//   33   93:pop             
			d(message.obj, ((String) (null)));
	//   34   94:aload_0         
	//   35   95:aload_1         
	//   36   96:getfield        #27  <Field Object Message.obj>
	//   37   99:aconst_null     
	//   38  100:invokevirtual   #68  <Method void d(Object, String)>
			return;
	//   39  103:return          

		case 1002: 
			removeMessages(1002);
	//   40  104:aload_0         
	//   41  105:sipush          1002
	//   42  108:invokevirtual   #66  <Method void removeMessages(int)>
			break;
		}
		sendEmptyMessageDelayed(1002, 30000L);
	//   43  111:aload_0         
	//   44  112:sipush          1002
	//   45  115:ldc2w           #9   <Long 30000L>
	//   46  118:invokevirtual   #14  <Method boolean sendEmptyMessageDelayed(int, long)>
	//   47  121:pop             
		e();
	//   48  122:aload_0         
	//   49  123:invokevirtual   #70  <Method void e()>
	//   50  126:return          
	}
}
