// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video.b;


// Referenced classes of package com.startapp.android.publish.ads.video.b:
//			c

public static final class c$h extends Enum
{

	public static c$h valueOf(String s)
	{
		return (c$h)Enum.valueOf(com/startapp/android/publish/ads/video/b/c$h, s);
	//    0    0:ldc1            #2   <Class c$h>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class c$h>
	//    4    9:areturn         
	}

	public static c$h[] values()
	{
		return (c$h[])((c$h []) (e)).clone();
	//    0    0:getstatic       #39  <Field c$h[] e>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.startapp.android.publish.ads.video.b.c$h_3B_.clone()>
	//    2    6:checkcast       #50  <Class c$h[]>
	//    3    9:areturn         
	}

	public static final c$h a;
	public static final c$h b;
	public static final c$h c;
	public static final c$h d;
	private static final c$h e[];

	static 
	{
		a = new c$h("UNKNOWN", 0);
	//    0    0:new             #2   <Class c$h>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void c$h(String, int)>
	//    5   10:putstatic       #25  <Field c$h a>
		b = new c$h("SERVER_DIED", 1);
	//    6   13:new             #2   <Class c$h>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "SERVER_DIED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void c$h(String, int)>
	//   11   23:putstatic       #29  <Field c$h b>
		c = new c$h("BUFFERING_TIMEOUT", 2);
	//   12   26:new             #2   <Class c$h>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "BUFFERING_TIMEOUT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void c$h(String, int)>
	//   17   36:putstatic       #33  <Field c$h c>
		d = new c$h("PLAYER_CREATION", 3);
	//   18   39:new             #2   <Class c$h>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "PLAYER_CREATION">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void c$h(String, int)>
	//   23   49:putstatic       #37  <Field c$h d>
		e = (new c$h[] {
			a, b, c, d
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       c$h[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #25  <Field c$h a>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #29  <Field c$h b>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #33  <Field c$h c>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #37  <Field c$h d>
	//   41   79:aastore         
	//   42   80:putstatic       #39  <Field c$h[] e>
	//*  43   83:return          
	}

	private c$h(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
