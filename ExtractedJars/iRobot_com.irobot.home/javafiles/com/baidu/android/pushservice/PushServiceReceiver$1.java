// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.Context;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.message.a.e;

// Referenced classes of package com.baidu.android.pushservice:
//			PushServiceReceiver

class PushServiceReceiver$1 extends c
{

	public void a()
	{
		com.baidu.android.pushservice.message.PublicMsg publicmsg = com.baidu.android.pushservice.message.a.e.a(a, b, c, d, e);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Context a>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field String b>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field String c>
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field byte[] d>
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field byte[] e>
	//   10   20:invokestatic    #52  <Method com.baidu.android.pushservice.message.PublicMsg e.a(Context, String, String, byte[], byte[])>
	//   11   23:astore_1        
		if(publicmsg == null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       36
		{
			com.baidu.android.pushservice.e.a.e("PushServiceReceiver", "notification check fail !");
	//   14   28:ldc1            #54  <String "PushServiceReceiver">
	//   15   30:ldc1            #56  <String "notification check fail !">
	//   16   32:invokestatic    #61  <Method void a.e(String, String)>
			return;
	//   17   35:return          
		}
		u.a(a, publicmsg);
	//   18   36:aload_0         
	//   19   37:getfield        #28  <Field Context a>
	//   20   40:aload_1         
	//   21   41:invokestatic    #66  <Method boolean u.a(Context, com.baidu.android.pushservice.message.PublicMsg)>
	//   22   44:pop             
		if("private".equals(((Object) (f))))
	//*  23   45:ldc1            #68  <String "private">
	//*  24   47:aload_0         
	//*  25   48:getfield        #38  <Field String f>
	//*  26   51:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  27   54:ifeq            82
		{
			com.baidu.android.pushservice.PushServiceReceiver.a(a, g, h, publicmsg, c, b);
	//   28   57:aload_0         
	//   29   58:getfield        #28  <Field Context a>
	//   30   61:aload_0         
	//   31   62:getfield        #40  <Field String g>
	//   32   65:aload_0         
	//   33   66:getfield        #42  <Field String h>
	//   34   69:aload_1         
	//   35   70:aload_0         
	//   36   71:getfield        #32  <Field String c>
	//   37   74:aload_0         
	//   38   75:getfield        #30  <Field String b>
	//   39   78:invokestatic    #77  <Method void com.baidu.android.pushservice.PushServiceReceiver.a(Context, String, String, com.baidu.android.pushservice.message.PublicMsg, String, String)>
			return;
	//   40   81:return          
		}
		if("rich_media".equals(((Object) (f))))
	//*  41   82:ldc1            #79  <String "rich_media">
	//*  42   84:aload_0         
	//*  43   85:getfield        #38  <Field String f>
	//*  44   88:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  45   91:ifeq            114
			com.baidu.android.pushservice.PushServiceReceiver.a(a, g, h, publicmsg, b);
	//   46   94:aload_0         
	//   47   95:getfield        #28  <Field Context a>
	//   48   98:aload_0         
	//   49   99:getfield        #40  <Field String g>
	//   50  102:aload_0         
	//   51  103:getfield        #42  <Field String h>
	//   52  106:aload_1         
	//   53  107:aload_0         
	//   54  108:getfield        #30  <Field String b>
	//   55  111:invokestatic    #82  <Method void com.baidu.android.pushservice.PushServiceReceiver.a(Context, String, String, com.baidu.android.pushservice.message.PublicMsg, String)>
	//   56  114:return          
	}

	final Context a;
	final String b;
	final String c;
	final byte d[];
	final byte e[];
	final String f;
	final String g;
	final String h;
	final PushServiceReceiver i;

	PushServiceReceiver$1(PushServiceReceiver pushservicereceiver, String s, short word0, Context context, String s1, String s2, byte abyte0[], 
			byte abyte1[], String s3, String s4, String s5)
	{
		i = pushservicereceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field PushServiceReceiver i>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #28  <Field Context a>
		b = s1;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #30  <Field String b>
		c = s2;
	//    9   17:aload_0         
	//   10   18:aload           6
	//   11   20:putfield        #32  <Field String c>
		d = abyte0;
	//   12   23:aload_0         
	//   13   24:aload           7
	//   14   26:putfield        #34  <Field byte[] d>
		e = abyte1;
	//   15   29:aload_0         
	//   16   30:aload           8
	//   17   32:putfield        #36  <Field byte[] e>
		f = s3;
	//   18   35:aload_0         
	//   19   36:aload           9
	//   20   38:putfield        #38  <Field String f>
		g = s4;
	//   21   41:aload_0         
	//   22   42:aload           10
	//   23   44:putfield        #40  <Field String g>
		h = s5;
	//   24   47:aload_0         
	//   25   48:aload           11
	//   26   50:putfield        #42  <Field String h>
		super(s, word0);
	//   27   53:aload_0         
	//   28   54:aload_2         
	//   29   55:iload_3         
	//   30   56:invokespecial   #45  <Method void c(String, short)>
	//   31   59:return          
	}
}
