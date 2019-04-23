// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			boq, bwq

final class bhp
	implements Runnable
{

	public bhp(boq boq1, bwq bwq1, Runnable runnable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = boq1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field boq a>
		b = bwq1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field bwq b>
		c = runnable;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field Runnable c>
	//   11   19:return          
	}

	public final void run()
	{
		a.h();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boq a>
	//    2    4:invokevirtual   #31  <Method boolean boq.h()>
	//    3    7:pop             
		boolean flag;
		if(b.c == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #21  <Field bwq b>
	//*   6   12:getfield        #36  <Field de bwq.c>
	//*   7   15:ifnonnull       23
			flag = true;
	//    8   18:iconst_1        
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			flag = false;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		if(flag)
	//*  13   25:iload_1         
	//*  14   26:ifeq            46
			a.a(b.a);
	//   15   29:aload_0         
	//   16   30:getfield        #19  <Field boq a>
	//   17   33:aload_0         
	//   18   34:getfield        #21  <Field bwq b>
	//   19   37:getfield        #39  <Field Object bwq.a>
	//   20   40:invokevirtual   #42  <Method void boq.a(Object)>
		else
	//*  21   43:goto            60
			a.a(b.c);
	//   22   46:aload_0         
	//   23   47:getfield        #19  <Field boq a>
	//   24   50:aload_0         
	//   25   51:getfield        #21  <Field bwq b>
	//   26   54:getfield        #36  <Field de bwq.c>
	//   27   57:invokevirtual   #45  <Method void boq.a(de)>
		if(b.d)
	//*  28   60:aload_0         
	//*  29   61:getfield        #21  <Field bwq b>
	//*  30   64:getfield        #49  <Field boolean bwq.d>
	//*  31   67:ifeq            82
			a.b("intermediate-response");
	//   32   70:aload_0         
	//   33   71:getfield        #19  <Field boq a>
	//   34   74:ldc1            #51  <String "intermediate-response">
	//   35   76:invokevirtual   #54  <Method void boq.b(String)>
		else
	//*  36   79:goto            91
			a.c("done");
	//   37   82:aload_0         
	//   38   83:getfield        #19  <Field boq a>
	//   39   86:ldc1            #56  <String "done">
	//   40   88:invokevirtual   #58  <Method void boq.c(String)>
		Runnable runnable = c;
	//   41   91:aload_0         
	//   42   92:getfield        #23  <Field Runnable c>
	//   43   95:astore_2        
		if(runnable != null)
	//*  44   96:aload_2         
	//*  45   97:ifnull          106
			runnable.run();
	//   46  100:aload_2         
	//   47  101:invokeinterface #60  <Method void Runnable.run()>
	//   48  106:return          
	}

	private final boq a;
	private final bwq b;
	private final Runnable c;
}
