// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bav

final class baz
	implements Runnable
{

	baz(bav bav1, int i, boolean flag)
	{
		c = bav1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field bav c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #18  <Field int a>
		b = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #20  <Field boolean b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		akh akh = c.b(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bav c>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field boolean b>
	//    6   12:invokevirtual   #30  <Method akh bav.b(int, boolean)>
	//    7   15:astore_1        
		bav.a(c, akh);
	//    8   16:aload_0         
	//    9   17:getfield        #16  <Field bav c>
	//   10   20:aload_1         
	//   11   21:invokestatic    #33  <Method akh bav.a(bav, akh)>
	//   12   24:pop             
		if(bav.a(a, akh))
	//*  13   25:aload_0         
	//*  14   26:getfield        #18  <Field int a>
	//*  15   29:aload_1         
	//*  16   30:invokestatic    #36  <Method boolean bav.a(int, akh)>
	//*  17   33:ifeq            53
			c.a(a + 1, b);
	//   18   36:aload_0         
	//   19   37:getfield        #16  <Field bav c>
	//   20   40:aload_0         
	//   21   41:getfield        #18  <Field int a>
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:aload_0         
	//   25   47:getfield        #20  <Field boolean b>
	//   26   50:invokevirtual   #39  <Method void bav.a(int, boolean)>
	//   27   53:return          
	}

	private final int a;
	private final boolean b;
	private final bav c;
}
