// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.os.Handler;

// Referenced classes of package android.support.design.widget:
//			b

class b$6
	implements l$a
{

	public void a()
	{
		b.a.sendMessage(b.a.obtainMessage(0, ((Object) (a))));
	//    0    0:getstatic       #21  <Field Handler b.a>
	//    1    3:getstatic       #21  <Field Handler b.a>
	//    2    6:iconst_0        
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field b a>
	//    5   11:invokevirtual   #27  <Method android.os.Message Handler.obtainMessage(int, Object)>
	//    6   14:invokevirtual   #31  <Method boolean Handler.sendMessage(android.os.Message)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void a(int i)
	{
		b.a.sendMessage(b.a.obtainMessage(1, i, 0, ((Object) (a))));
	//    0    0:getstatic       #21  <Field Handler b.a>
	//    1    3:getstatic       #21  <Field Handler b.a>
	//    2    6:iconst_1        
	//    3    7:iload_1         
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field b a>
	//    7   13:invokevirtual   #35  <Method android.os.Message Handler.obtainMessage(int, int, int, Object)>
	//    8   16:invokevirtual   #31  <Method boolean Handler.sendMessage(android.os.Message)>
	//    9   19:pop             
	//   10   20:return          
	}

	final b a;

	b$6(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
