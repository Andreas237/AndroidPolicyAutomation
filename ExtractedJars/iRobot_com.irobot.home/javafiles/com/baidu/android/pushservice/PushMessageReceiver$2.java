// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.f.i;
import com.baidu.android.pushservice.f.k;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.message.a.h;

// Referenced classes of package com.baidu.android.pushservice:
//			PushMessageReceiver, a

class PushMessageReceiver$2 extends Thread
{

	public void run()
	{
		String as[] = com.baidu.android.pushservice.message.a.h.a(a, b, c, d, e, f);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Context a>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field int b>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field String c>
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field String d>
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field byte[] e>
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field byte[] f>
	//   12   24:invokestatic    #55  <Method String[] h.a(Context, int, String, String, byte[], byte[])>
	//   13   27:astore_1        
		if(as != null && as.length == 2)
	//*  14   28:aload_1         
	//*  15   29:ifnull          174
	//*  16   32:aload_1         
	//*  17   33:arraylength     
	//*  18   34:iconst_2        
	//*  19   35:icmpeq          41
	//*  20   38:goto            174
		{
			Object obj = ((Object) (new Message()));
	//   21   41:new             #57  <Class Message>
	//   22   44:dup             
	//   23   45:invokespecial   #58  <Method void Message()>
	//   24   48:astore_2        
			Bundle bundle = new Bundle();
	//   25   49:new             #60  <Class Bundle>
	//   26   52:dup             
	//   27   53:invokespecial   #61  <Method void Bundle()>
	//   28   56:astore_3        
			bundle.putString("message", as[0]);
	//   29   57:aload_3         
	//   30   58:ldc1            #63  <String "message">
	//   31   60:aload_1         
	//   32   61:iconst_0        
	//   33   62:aaload          
	//   34   63:invokevirtual   #67  <Method void Bundle.putString(String, String)>
			bundle.putString("custom_content", as[1]);
	//   35   66:aload_3         
	//   36   67:ldc1            #69  <String "custom_content">
	//   37   69:aload_1         
	//   38   70:iconst_1        
	//   39   71:aaload          
	//   40   72:invokevirtual   #67  <Method void Bundle.putString(String, String)>
			((Message) (obj)).setData(bundle);
	//   41   75:aload_2         
	//   42   76:aload_3         
	//   43   77:invokevirtual   #73  <Method void Message.setData(Bundle)>
			h.sendMessage(((Message) (obj)));
	//   44   80:aload_0         
	//   45   81:getfield        #45  <Field PushMessageReceiver$a h>
	//   46   84:aload_2         
	//   47   85:invokevirtual   #79  <Method boolean PushMessageReceiver$a.sendMessage(Message)>
	//   48   88:pop             
			obj = ((Object) (new StringBuilder()));
	//   49   89:new             #81  <Class StringBuilder>
	//   50   92:dup             
	//   51   93:invokespecial   #82  <Method void StringBuilder()>
	//   52   96:astore_2        
			((StringBuilder) (obj)).append("message ");
	//   53   97:aload_2         
	//   54   98:ldc1            #84  <String "message ">
	//   55  100:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   56  103:pop             
			((StringBuilder) (obj)).append(as[0]);
	//   57  104:aload_2         
	//   58  105:aload_1         
	//   59  106:iconst_0        
	//   60  107:aaload          
	//   61  108:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   62  111:pop             
			((StringBuilder) (obj)).append(" at time of ");
	//   63  112:aload_2         
	//   64  113:ldc1            #90  <String " at time of ">
	//   65  115:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   66  118:pop             
			((StringBuilder) (obj)).append(System.currentTimeMillis());
	//   67  119:aload_2         
	//   68  120:invokestatic    #96  <Method long System.currentTimeMillis()>
	//   69  123:invokevirtual   #99  <Method StringBuilder StringBuilder.append(long)>
	//   70  126:pop             
			u.b(((StringBuilder) (obj)).toString(), a);
	//   71  127:aload_2         
	//   72  128:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   73  131:aload_0         
	//   74  132:getfield        #31  <Field Context a>
	//   75  135:invokestatic    #108 <Method void u.b(String, Context)>
			if(com.baidu.android.pushservice.a.b() > 0)
	//*  76  138:invokestatic    #113 <Method int a.b()>
	//*  77  141:ifle            173
				k.b(a, c, d, b, as[0].getBytes(), 0, i.a);
	//   78  144:aload_0         
	//   79  145:getfield        #31  <Field Context a>
	//   80  148:aload_0         
	//   81  149:getfield        #35  <Field String c>
	//   82  152:aload_0         
	//   83  153:getfield        #37  <Field String d>
	//   84  156:aload_0         
	//   85  157:getfield        #33  <Field int b>
	//   86  160:aload_1         
	//   87  161:iconst_0        
	//   88  162:aaload          
	//   89  163:invokevirtual   #119 <Method byte[] String.getBytes()>
	//   90  166:iconst_0        
	//   91  167:getstatic       #123 <Field int i.a>
	//   92  170:invokestatic    #128 <Method void k.b(Context, String, String, int, byte[], int, int)>
			return;
	//   93  173:return          
		} else
		{
			com.baidu.android.pushservice.e.a.e(PushMessageReceiver.TAG, " check message error !");
	//   94  174:getstatic       #131 <Field String PushMessageReceiver.TAG>
	//   95  177:ldc1            #133 <String " check message error !">
	//   96  179:invokestatic    #137 <Method void a.e(String, String)>
			PushMessageReceiver.access$000(i, a, g, 9);
	//   97  182:aload_0         
	//   98  183:getfield        #29  <Field PushMessageReceiver i>
	//   99  186:aload_0         
	//  100  187:getfield        #31  <Field Context a>
	//  101  190:aload_0         
	//  102  191:getfield        #43  <Field Intent g>
	//  103  194:bipush          9
	//  104  196:invokestatic    #141 <Method void PushMessageReceiver.access$000(PushMessageReceiver, Context, Intent, int)>
			return;
	//  105  199:return          
		}
	}

	final Context a;
	final int b;
	final String c;
	final String d;
	final byte e[];
	final byte f[];
	final Intent g;
	final PushMessageReceiver$a h;
	final PushMessageReceiver i;

	PushMessageReceiver$2(PushMessageReceiver pushmessagereceiver, Context context, int j, String s, String s1, byte abyte0[], byte abyte1[], 
			Intent intent, PushMessageReceiver$a pushmessagereceiver$a)
	{
		i = pushmessagereceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field PushMessageReceiver i>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #31  <Field Context a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #33  <Field int b>
		c = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #35  <Field String c>
		d = s1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #37  <Field String d>
		e = abyte0;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #39  <Field byte[] e>
		f = abyte1;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #41  <Field byte[] f>
		g = intent;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #43  <Field Intent g>
		h = pushmessagereceiver$a;
	//   24   45:aload_0         
	//   25   46:aload           9
	//   26   48:putfield        #45  <Field PushMessageReceiver$a h>
		super();
	//   27   51:aload_0         
	//   28   52:invokespecial   #48  <Method void Thread()>
	//   29   55:return          
	}
}
