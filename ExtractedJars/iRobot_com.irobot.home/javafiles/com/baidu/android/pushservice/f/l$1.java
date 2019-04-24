// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.f;

import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.h.k;

// Referenced classes of package com.baidu.android.pushservice.f:
//			l

class l$1 extends c
{

	public void a()
	{
		if(!k.e(b.a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field l b>
	//*   2    4:getfield        #26  <Field android.content.Context com.baidu.android.pushservice.f.l.a>
	//*   3    7:invokestatic    #32  <Method boolean k.e(android.content.Context)>
	//*   4   10:ifne            21
		{
			com.baidu.android.pushservice.e.a.d("Statistics-BaseSender", "Network is not reachable!");
	//    5   13:ldc1            #34  <String "Statistics-BaseSender">
	//    6   15:ldc1            #36  <String "Network is not reachable!">
	//    7   17:invokestatic    #42  <Method void a.d(String, String)>
			return;
	//    8   20:return          
		} else
		{
			com.baidu.android.pushservice.f.l.a(b, a);
	//    9   21:aload_0         
	//   10   22:getfield        #16  <Field l b>
	//   11   25:aload_0         
	//   12   26:getfield        #18  <Field boolean a>
	//   13   29:invokestatic    #45  <Method void com.baidu.android.pushservice.f.l.a(l, boolean)>
			l.b(b, false);
	//   14   32:aload_0         
	//   15   33:getfield        #16  <Field l b>
	//   16   36:iconst_0        
	//   17   37:invokestatic    #48  <Method boolean l.b(l, boolean)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
	}

	final boolean a;
	final l b;

	l$1(l l1, String s, short word0, boolean flag)
	{
		b = l1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field l b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload           4
	//    5    8:putfield        #18  <Field boolean a>
		super(s, word0);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:iload_3         
	//    9   14:invokespecial   #21  <Method void c(String, short)>
	//   10   17:return          
	}
}
