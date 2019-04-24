// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.net.Uri;
import android.widget.Toast;

// Referenced classes of package com.baidu.android.pushservice:
//			PushServiceReceiver

class PushServiceReceiver$a$2
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (b.a));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PushServiceReceiver$a b>
	//    2    4:getfield        #30  <Field android.content.Context PushServiceReceiver$a.a>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #32  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #33  <Method void StringBuilder()>
	//    7   15:astore_2        
		stringbuilder.append("\u4E0B\u8F7D\u5BCC\u5A92\u4F53");
	//    8   16:aload_2         
	//    9   17:ldc1            #35  <String "\u4E0B\u8F7D\u5BCC\u5A92\u4F53">
	//   10   19:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(Uri.parse(a).getAuthority());
	//   12   23:aload_2         
	//   13   24:aload_0         
	//   14   25:getfield        #22  <Field String a>
	//   15   28:invokestatic    #45  <Method Uri Uri.parse(String)>
	//   16   31:invokevirtual   #49  <Method String Uri.getAuthority()>
	//   17   34:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		stringbuilder.append("\u5931\u8D25");
	//   19   38:aload_2         
	//   20   39:ldc1            #51  <String "\u5931\u8D25">
	//   21   41:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		obj = ((Object) (Toast.makeText(((android.content.Context) (obj)), ((CharSequence) (stringbuilder.toString())), 1)));
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   26   50:iconst_1        
	//   27   51:invokestatic    #60  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//   28   54:astore_1        
		((Toast) (obj)).setGravity(17, 0, 0);
	//   29   55:aload_1         
	//   30   56:bipush          17
	//   31   58:iconst_0        
	//   32   59:iconst_0        
	//   33   60:invokevirtual   #64  <Method void Toast.setGravity(int, int, int)>
		((Toast) (obj)).show();
	//   34   63:aload_1         
	//   35   64:invokevirtual   #67  <Method void Toast.show()>
	//   36   67:return          
	}

	final String a;
	final PushServiceReceiver.a b;

	PushServiceReceiver$a$2(PushServiceReceiver.a a1, String s)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field PushServiceReceiver$a b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
