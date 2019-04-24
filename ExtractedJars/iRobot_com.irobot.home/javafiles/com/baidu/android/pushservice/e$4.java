// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.Context;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.e.b;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.message.e;

// Referenced classes of package com.baidu.android.pushservice:
//			e

class e$4 extends c
{

	public void a()
	{
		long l = System.currentTimeMillis();
	//    0    0:invokestatic    #27  <Method long System.currentTimeMillis()>
	//    1    3:lstore_3        
		int i = (int)((l / 60000L) % 5L);
	//    2    4:lload_3         
	//    3    5:ldc2w           #28  <Long 60000L>
	//    4    8:ldiv            
	//    5    9:ldc2w           #30  <Long 5L>
	//    6   12:lrem            
	//    7   13:l2i             
	//    8   14:istore_1        
		int j = (int)(l / 1000L);
	//    9   15:lload_3         
	//   10   16:ldc2w           #32  <Long 1000L>
	//   11   19:ldiv            
	//   12   20:l2i             
	//   13   21:istore_2        
		if(i == 0 && j % 60 < 15)
	//*  14   22:iload_1         
	//*  15   23:ifne            144
	//*  16   26:iload_2         
	//*  17   27:bipush          60
	//*  18   29:irem            
	//*  19   30:bipush          15
	//*  20   32:icmpge          144
		{
			long l1 = (long)(Math.random() * 60D * 1000D);
	//   21   35:invokestatic    #39  <Method double Math.random()>
	//   22   38:ldc2w           #40  <Double 60D>
	//   23   41:dmul            
	//   24   42:ldc2w           #42  <Double 1000D>
	//   25   45:dmul            
	//   26   46:d2l             
	//   27   47:lstore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   28   49:new             #45  <Class StringBuilder>
	//   29   52:dup             
	//   30   53:invokespecial   #47  <Method void StringBuilder()>
	//   31   56:astore          7
			stringbuilder.append("sleep for current: ");
	//   32   58:aload           7
	//   33   60:ldc1            #49  <String "sleep for current: ">
	//   34   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
			stringbuilder.append(l);
	//   36   66:aload           7
	//   37   68:lload_3         
	//   38   69:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   39   72:pop             
			stringbuilder.append(" delta: ");
	//   40   73:aload           7
	//   41   75:ldc1            #58  <String " delta: ">
	//   42   77:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   43   80:pop             
			stringbuilder.append(l1);
	//   44   81:aload           7
	//   45   83:lload           5
	//   46   85:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
	//   47   88:pop             
			com.baidu.android.pushservice.e.a.c("PushConnection", stringbuilder.toString());
	//   48   89:ldc1            #60  <String "PushConnection">
	//   49   91:aload           7
	//   50   93:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   51   96:invokestatic    #70  <Method void a.c(String, String)>
			try
			{
				Thread.sleep(l1);
	//   52   99:lload           5
	//   53  101:invokestatic    #76  <Method void Thread.sleep(long)>
			}
	//*  54  104:goto            144
			catch(InterruptedException interruptedexception)
	//*  55  107:astore          7
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   56  109:new             #45  <Class StringBuilder>
	//   57  112:dup             
	//   58  113:invokespecial   #47  <Method void StringBuilder()>
	//   59  116:astore          8
				stringbuilder1.append("InterruptedException: ");
	//   60  118:aload           8
	//   61  120:ldc1            #78  <String "InterruptedException: ">
	//   62  122:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   63  125:pop             
				stringbuilder1.append(((Object) (interruptedexception)));
	//   64  126:aload           8
	//   65  128:aload           7
	//   66  130:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
	//   67  133:pop             
				com.baidu.android.pushservice.e.a.e("PushConnection", stringbuilder1.toString());
	//   68  134:ldc1            #60  <String "PushConnection">
	//   69  136:aload           8
	//   70  138:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   71  141:invokestatic    #84  <Method void a.e(String, String)>
			}
		}
		a.c.c();
	//   72  144:aload_0         
	//   73  145:getfield        #15  <Field com.baidu.android.pushservice.e a>
	//   74  148:getfield        #87  <Field e com.baidu.android.pushservice.e.c>
	//   75  151:invokevirtual   #91  <Method void e.c()>
		a(a, System.currentTimeMillis());
	//   76  154:aload_0         
	//   77  155:getfield        #15  <Field com.baidu.android.pushservice.e a>
	//   78  158:invokestatic    #27  <Method long System.currentTimeMillis()>
	//   79  161:invokestatic    #94  <Method long a(com.baidu.android.pushservice.e, long)>
	//   80  164:pop2            
		b.c("PushConnection", "sendHeartbeatMessage", com.baidu.android.pushservice.e.c(a).getApplicationContext());
	//   81  165:ldc1            #60  <String "PushConnection">
	//   82  167:ldc1            #96  <String "sendHeartbeatMessage">
	//   83  169:aload_0         
	//   84  170:getfield        #15  <Field com.baidu.android.pushservice.e a>
	//   85  173:invokestatic    #99  <Method Context com.baidu.android.pushservice.e.c(com.baidu.android.pushservice.e)>
	//   86  176:invokevirtual   #105 <Method Context Context.getApplicationContext()>
	//   87  179:invokestatic    #110 <Method void b.c(String, String, Context)>
	//   88  182:return          
	}

	final com.baidu.android.pushservice.e a;

	e$4(com.baidu.android.pushservice.e e1, String s, short word0)
	{
		a = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field com.baidu.android.pushservice.e a>
		super(s, word0);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #18  <Method void c(String, short)>
	//    7   11:return          
	}
}
