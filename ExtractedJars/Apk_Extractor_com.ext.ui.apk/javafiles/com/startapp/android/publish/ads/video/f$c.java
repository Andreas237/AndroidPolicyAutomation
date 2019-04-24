// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.video;


// Referenced classes of package com.startapp.android.publish.ads.video:
//			f

private static final class f$c extends Enum
{

	public static f$c valueOf(String s)
	{
		return (f$c)Enum.valueOf(com/startapp/android/publish/ads/video/f$c, s);
	//    0    0:ldc1            #2   <Class f$c>
	//    1    2:aload_0         
	//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class f$c>
	//    4    9:areturn         
	}

	public static f$c[] values()
	{
		return (f$c[])((f$c []) (d)).clone();
	//    0    0:getstatic       #33  <Field f$c[] d>
	//    1    3:invokevirtual   #48  <Method Object _5B_Lcom.startapp.android.publish.ads.video.f$c_3B_.clone()>
	//    2    6:checkcast       #44  <Class f$c[]>
	//    3    9:areturn         
	}

	public static final f$c a;
	public static final f$c b;
	public static final f$c c;
	private static final f$c d[];

	static 
	{
		a = new f$c("COMPLETE", 0);
	//    0    0:new             #2   <Class f$c>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "COMPLETE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void f$c(String, int)>
	//    5   10:putstatic       #23  <Field f$c a>
		b = new f$c("CLICKED", 1);
	//    6   13:new             #2   <Class f$c>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "CLICKED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void f$c(String, int)>
	//   11   23:putstatic       #27  <Field f$c b>
		c = new f$c("SKIPPED", 2);
	//   12   26:new             #2   <Class f$c>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "SKIPPED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void f$c(String, int)>
	//   17   36:putstatic       #31  <Field f$c c>
		d = (new f$c[] {
			a, b, c
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       f$c[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field f$c a>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #27  <Field f$c b>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #31  <Field f$c c>
	//   31   60:aastore         
	//   32   61:putstatic       #33  <Field f$c[] d>
	//*  33   64:return          
	}

	private f$c(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #35  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
