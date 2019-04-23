// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Handler;
import android.os.Message;

public final class HandlerCompat
{

	private HandlerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean postDelayed(Handler handler, Runnable runnable, Object obj, long l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          16
		{
			return handler.postDelayed(runnable, obj, l);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:lload_3         
	//    7   12:invokevirtual   #24  <Method boolean Handler.postDelayed(Runnable, Object, long)>
	//    8   15:ireturn         
		} else
		{
			runnable = ((Runnable) (Message.obtain(handler, runnable)));
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokestatic    #30  <Method Message Message.obtain(Handler, Runnable)>
	//   12   21:astore_1        
			runnable.obj = obj;
	//   13   22:aload_1         
	//   14   23:aload_2         
	//   15   24:putfield        #34  <Field Object Message.obj>
			return handler.sendMessageDelayed(((Message) (runnable)), l);
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:lload_3         
	//   19   30:invokevirtual   #38  <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   20   33:ireturn         
		}
	}
}
