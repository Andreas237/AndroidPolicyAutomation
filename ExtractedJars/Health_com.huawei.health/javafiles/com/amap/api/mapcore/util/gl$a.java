// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.*;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			gl, gi

class gl$a
{

	private void a(Handler handler, List list)
	{
		Message message = handler.obtainMessage();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method Message Handler.obtainMessage()>
	//    2    4:astore_3        
		message.obj = ((Object) (list));
	//    3    5:aload_3         
	//    4    6:aload_2         
	//    5    7:putfield        #60  <Field Object Message.obj>
		message.what = 100;
	//    6   10:aload_3         
	//    7   11:bipush          100
	//    8   13:putfield        #63  <Field int Message.what>
		message.arg1 = d;
	//    9   16:aload_3         
	//   10   17:aload_0         
	//   11   18:getfield        #33  <Field int d>
	//   12   21:putfield        #66  <Field int Message.arg1>
		list = ((List) (new Bundle()));
	//   13   24:new             #68  <Class Bundle>
	//   14   27:dup             
	//   15   28:invokespecial   #69  <Method void Bundle()>
	//   16   31:astore_2        
		((Bundle) (list)).putInt("lineID", c);
	//   17   32:aload_2         
	//   18   33:ldc1            #71  <String "lineID">
	//   19   35:aload_0         
	//   20   36:getfield        #31  <Field int c>
	//   21   39:invokevirtual   #75  <Method void Bundle.putInt(String, int)>
		message.setData(((Bundle) (list)));
	//   22   42:aload_3         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #79  <Method void Message.setData(Bundle)>
		handler.sendMessage(message);
	//   25   47:aload_1         
	//   26   48:aload_3         
	//   27   49:invokevirtual   #83  <Method boolean Handler.sendMessage(Message)>
	//   28   52:pop             
		d = d + 1;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #33  <Field int d>
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:putfield        #33  <Field int d>
		f = f + 1;
	//   35   63:aload_0         
	//   36   64:aload_0         
	//   37   65:getfield        #37  <Field int f>
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:putfield        #37  <Field int f>
	//   41   73:return          
	}

	private void b(Handler handler)
	{
		if(f > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field int f>
	//*   2    4:ifle            80
		{
			int i = gi.a(h);
	//    3    7:aload_0         
	//    4    8:getfield        #42  <Field List h>
	//    5   11:invokestatic    #90  <Method int gi.a(List)>
	//    6   14:istore_2        
			Message message = handler.obtainMessage();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #54  <Method Message Handler.obtainMessage()>
	//    9   19:astore_3        
			message.obj = ((Object) (h));
	//   10   20:aload_3         
	//   11   21:aload_0         
	//   12   22:getfield        #42  <Field List h>
	//   13   25:putfield        #60  <Field Object Message.obj>
			message.what = 101;
	//   14   28:aload_3         
	//   15   29:bipush          101
	//   16   31:putfield        #63  <Field int Message.what>
			message.arg1 = i;
	//   17   34:aload_3         
	//   18   35:iload_2         
	//   19   36:putfield        #66  <Field int Message.arg1>
			message.arg2 = e;
	//   20   39:aload_3         
	//   21   40:aload_0         
	//   22   41:getfield        #35  <Field int e>
	//   23   44:putfield        #93  <Field int Message.arg2>
			Bundle bundle = new Bundle();
	//   24   47:new             #68  <Class Bundle>
	//   25   50:dup             
	//   26   51:invokespecial   #69  <Method void Bundle()>
	//   27   54:astore          4
			bundle.putInt("lineID", c);
	//   28   56:aload           4
	//   29   58:ldc1            #71  <String "lineID">
	//   30   60:aload_0         
	//   31   61:getfield        #31  <Field int c>
	//   32   64:invokevirtual   #75  <Method void Bundle.putInt(String, int)>
			message.setData(bundle);
	//   33   67:aload_3         
	//   34   68:aload           4
	//   35   70:invokevirtual   #79  <Method void Message.setData(Bundle)>
			handler.sendMessage(message);
	//   36   73:aload_1         
	//   37   74:aload_3         
	//   38   75:invokevirtual   #83  <Method boolean Handler.sendMessage(Message)>
	//   39   78:pop             
			return;
	//   40   79:return          
		} else
		{
			a.a(handler, c, "\u8F68\u8FF9\u70B9\u592A\u5C11\u6216\u8DDD\u79BB\u592A\u8FD1,\u8F68\u8FF9\u7EA0\u504F\u5931\u8D25");
	//   41   80:aload_0         
	//   42   81:getfield        #24  <Field gl a>
	//   43   84:aload_1         
	//   44   85:aload_0         
	//   45   86:getfield        #31  <Field int c>
	//   46   89:ldc1            #95  <String "\u8F68\u8FF9\u70B9\u592A\u5C11\u6216\u8DDD\u79BB\u592A\u8FD1,\u8F68\u8FF9\u7EA0\u504F\u5931\u8D25">
	//   47   91:invokevirtual   #98  <Method void gl.a(Handler, int, String)>
			return;
	//   48   94:return          
		}
	}

	public HashMap a()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field HashMap g>
	//    2    4:areturn         
	}

	public void a(Handler handler)
	{
		int i = d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int d>
	//    2    4:istore_2        
		do
		{
			if(i > b)
				break;
	//    3    5:iload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field int b>
	//    6   10:icmpgt          56
			List list = (List)g.get(((Object) (Integer.valueOf(i))));
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field HashMap g>
	//    9   17:iload_2         
	//   10   18:invokestatic    #106 <Method Integer Integer.valueOf(int)>
	//   11   21:invokevirtual   #112 <Method Object HashMap.get(Object)>
	//   12   24:checkcast       #114 <Class List>
	//   13   27:astore_3        
			if(list == null)
				break;
	//   14   28:aload_3         
	//   15   29:ifnull          56
			h.addAll(((java.util.Collection) (list)));
	//   16   32:aload_0         
	//   17   33:getfield        #42  <Field List h>
	//   18   36:aload_3         
	//   19   37:invokeinterface #118 <Method boolean List.addAll(java.util.Collection)>
	//   20   42:pop             
			a(handler, list);
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:aload_3         
	//   24   46:invokespecial   #120 <Method void a(Handler, List)>
			i++;
	//   25   49:iload_2         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_2        
		} while(true);
	//   29   53:goto            5
		if(d == b + 1)
	//*  30   56:aload_0         
	//*  31   57:getfield        #33  <Field int d>
	//*  32   60:aload_0         
	//*  33   61:getfield        #29  <Field int b>
	//*  34   64:iconst_1        
	//*  35   65:iadd            
	//*  36   66:icmpne          74
			b(handler);
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:invokespecial   #122 <Method void b(Handler)>
	//   40   74:return          
	}

	final gl a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	private HashMap g;
	private List h;

	public gl$a(gl gl1, int i, int j, int k, HashMap hashmap)
	{
		a = gl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field gl a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void Object()>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #29  <Field int b>
		c = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #31  <Field int c>
		d = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #33  <Field int d>
		e = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #35  <Field int e>
		f = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #37  <Field int f>
		h = ((List) (new ArrayList()));
	//   20   34:aload_0         
	//   21   35:new             #39  <Class ArrayList>
	//   22   38:dup             
	//   23   39:invokespecial   #40  <Method void ArrayList()>
	//   24   42:putfield        #42  <Field List h>
		b = j;
	//   25   45:aload_0         
	//   26   46:iload_3         
	//   27   47:putfield        #29  <Field int b>
		g = hashmap;
	//   28   50:aload_0         
	//   29   51:aload           5
	//   30   53:putfield        #44  <Field HashMap g>
		c = i;
	//   31   56:aload_0         
	//   32   57:iload_2         
	//   33   58:putfield        #31  <Field int c>
		e = k;
	//   34   61:aload_0         
	//   35   62:iload           4
	//   36   64:putfield        #35  <Field int e>
	//   37   67:return          
	}
}
