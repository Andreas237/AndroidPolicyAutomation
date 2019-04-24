// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.Context;
import com.baidu.android.pushservice.f.a.b;
import com.baidu.android.pushservice.f.h;
import com.baidu.android.pushservice.f.p;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.h.u;

// Referenced classes of package com.baidu.android.pushservice:
//			e

class e$5 extends c
{

	public void a()
	{
		h h1;
		h1 = new h();
	//    0    0:new             #31  <Class h>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void h()>
	//    3    7:astore_2        
		h1.d = a;
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field String a>
	//    7   13:putfield        #36  <Field String h.d>
		h1.e = System.currentTimeMillis();
	//    8   16:aload_2         
	//    9   17:invokestatic    #42  <Method long System.currentTimeMillis()>
	//   10   20:putfield        #46  <Field long h.e>
		h1.f = com.baidu.android.pushservice.f.a.b.c(com.baidu.android.pushservice.e.c(c));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #18  <Field e c>
	//   14   28:invokestatic    #49  <Method Context com.baidu.android.pushservice.e.c(e)>
	//   15   31:invokestatic    #54  <Method String b.c(Context)>
	//   16   34:putfield        #57  <Field String h.f>
		h1.g = b;
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:getfield        #22  <Field int b>
	//   20   42:putfield        #60  <Field int h.g>
		if(!a.equals("030303")) goto _L2; else goto _L1
	//   21   45:aload_0         
	//   22   46:getfield        #20  <Field String a>
	//   23   49:ldc1            #62  <String "030303">
	//   24   51:invokevirtual   #68  <Method boolean String.equals(Object)>
	//   25   54:ifeq            76
_L1:
		String s = u.z(com.baidu.android.pushservice.e.c(c));
	//   26   57:aload_0         
	//   27   58:getfield        #18  <Field e c>
	//   28   61:invokestatic    #49  <Method Context com.baidu.android.pushservice.e.c(e)>
	//   29   64:invokestatic    #73  <Method String u.z(Context)>
	//   30   67:astore_1        
_L4:
		h1.j = s;
	//   31   68:aload_2         
	//   32   69:aload_1         
	//   33   70:putfield        #76  <Field String h.j>
		break MISSING_BLOCK_LABEL_102;
	//   34   73:goto            102
_L2:
		if(!a.equals("030301"))
			break MISSING_BLOCK_LABEL_102;
	//   35   76:aload_0         
	//   36   77:getfield        #20  <Field String a>
	//   37   80:ldc1            #78  <String "030301">
	//   38   82:invokevirtual   #68  <Method boolean String.equals(Object)>
	//   39   85:ifeq            102
		s = u.A(com.baidu.android.pushservice.e.c(c));
	//   40   88:aload_0         
	//   41   89:getfield        #18  <Field e c>
	//   42   92:invokestatic    #49  <Method Context com.baidu.android.pushservice.e.c(e)>
	//   43   95:invokestatic    #81  <Method String u.A(Context)>
	//   44   98:astore_1        
		if(true) goto _L4; else goto _L3
	//   45   99:goto            68
_L3:
		Exception exception;
		try
		{
			p.b(com.baidu.android.pushservice.e.c(c), h1);
	//   46  102:aload_0         
	//   47  103:getfield        #18  <Field e c>
	//   48  106:invokestatic    #49  <Method Context com.baidu.android.pushservice.e.c(e)>
	//   49  109:aload_2         
	//   50  110:invokestatic    #86  <Method long p.b(Context, h)>
	//   51  113:pop2            
			return;
	//   52  114:return          
		}
	//*  53  115:ldc1            #88  <String "PushConnection">
	//*  54  117:ldc1            #90  <String "insertAgent exception">
	//*  55  119:aload_0         
	//*  56  120:getfield        #18  <Field e c>
	//*  57  123:invokestatic    #49  <Method Context com.baidu.android.pushservice.e.c(e)>
	//*  58  126:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//*  59  129:invokestatic    #101 <Method void com.baidu.android.pushservice.e.b.c(String, String, Context)>
	//*  60  132:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			com.baidu.android.pushservice.e.b.c("PushConnection", "insertAgent exception", com.baidu.android.pushservice.e.c(c).getApplicationContext());
		}
		return;
	//*  61  133:astore_1        
	//*  62  134:goto            115
	}

	final String a;
	final int b;
	final e c;

	e$5(e e1, String s, short word0, String s1, int i)
	{
		c = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field e c>
		a = s1;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #20  <Field String a>
		b = i;
	//    6   11:aload_0         
	//    7   12:iload           5
	//    8   14:putfield        #22  <Field int b>
		super(s, word0);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #25  <Method void c(String, short)>
	//   13   23:return          
	}
}
