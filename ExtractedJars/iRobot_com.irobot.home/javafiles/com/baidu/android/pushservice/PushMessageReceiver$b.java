// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;


// Referenced classes of package com.baidu.android.pushservice:
//			PushMessageReceiver

private static final class PushMessageReceiver$b extends Enum
{

	private int a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int d>
	//    2    4:ireturn         
	}

	static int a(PushMessageReceiver$b pushmessagereceiver$b)
	{
		return pushmessagereceiver$b.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method int a()>
	//    2    4:ireturn         
	}

	public static PushMessageReceiver$b valueOf(String s)
	{
		return (PushMessageReceiver$b)Enum.valueOf(com/baidu/android/pushservice/PushMessageReceiver$b, s);
	//    0    0:ldc1            #2   <Class PushMessageReceiver$b>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PushMessageReceiver$b>
	//    4    9:areturn         
	}

	public static PushMessageReceiver$b[] values()
	{
		return (PushMessageReceiver$b[])((PushMessageReceiver$b []) (e)).clone();
	//    0    0:getstatic       #35  <Field PushMessageReceiver$b[] e>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.baidu.android.pushservice.PushMessageReceiver$b_3B_.clone()>
	//    2    6:checkcast       #55  <Class PushMessageReceiver$b[]>
	//    3    9:areturn         
	}

	public static final PushMessageReceiver$b a;
	public static final PushMessageReceiver$b b;
	public static final PushMessageReceiver$b c;
	private static final PushMessageReceiver$b e[];
	private int d;

	static 
	{
		a = new PushMessageReceiver$b("MSG_PASS", 0, 1);
	//    0    0:new             #2   <Class PushMessageReceiver$b>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "MSG_PASS">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:invokespecial   #23  <Method void PushMessageReceiver$b(String, int, int)>
	//    6   11:putstatic       #25  <Field PushMessageReceiver$b a>
		b = new PushMessageReceiver$b("MSG_ARRIVED", 1, 2);
	//    7   14:new             #2   <Class PushMessageReceiver$b>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "MSG_ARRIVED">
	//   10   20:iconst_1        
	//   11   21:iconst_2        
	//   12   22:invokespecial   #23  <Method void PushMessageReceiver$b(String, int, int)>
	//   13   25:putstatic       #29  <Field PushMessageReceiver$b b>
		c = new PushMessageReceiver$b("MSG_CLICKED", 2, 3);
	//   14   28:new             #2   <Class PushMessageReceiver$b>
	//   15   31:dup             
	//   16   32:ldc1            #31  <String "MSG_CLICKED">
	//   17   34:iconst_2        
	//   18   35:iconst_3        
	//   19   36:invokespecial   #23  <Method void PushMessageReceiver$b(String, int, int)>
	//   20   39:putstatic       #33  <Field PushMessageReceiver$b c>
		e = (new PushMessageReceiver$b[] {
			a, b, c
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       PushMessageReceiver$b[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #25  <Field PushMessageReceiver$b a>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #29  <Field PushMessageReceiver$b b>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #33  <Field PushMessageReceiver$b c>
	//   34   63:aastore         
	//   35   64:putstatic       #35  <Field PushMessageReceiver$b[] e>
	//*  36   67:return          
	}

	private PushMessageReceiver$b(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #39  <Method void Enum(String, int)>
		d = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #41  <Field int d>
	//    7   11:return          
	}
}
