// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;


// Referenced classes of package com.irobot.home.view:
//			d

public static final class d$c extends Enum
{

	public static d$c valueOf(String s)
	{
		return (d$c)Enum.valueOf(com/irobot/home/view/d$c, s);
	//    0    0:ldc1            #2   <Class d$c>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class d$c>
	//    4    9:areturn         
	}

	public static d$c[] values()
	{
		return (d$c[])((d$c []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field d$c[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.irobot.home.view.d$c_3B_.clone()>
	//    2    6:checkcast       #46  <Class d$c[]>
	//    3    9:areturn         
	}

	private static final d$c $VALUES[];
	public static final d$c AspectFill;
	public static final d$c AspectFit;
	public static final d$c Center;
	public static final d$c Stretch;

	static 
	{
		AspectFit = new d$c("AspectFit", 0);
	//    0    0:new             #2   <Class d$c>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "AspectFit">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void d$c(String, int)>
	//    5   10:putstatic       #24  <Field d$c AspectFit>
		AspectFill = new d$c("AspectFill", 1);
	//    6   13:new             #2   <Class d$c>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "AspectFill">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void d$c(String, int)>
	//   11   23:putstatic       #27  <Field d$c AspectFill>
		Stretch = new d$c("Stretch", 2);
	//   12   26:new             #2   <Class d$c>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "Stretch">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void d$c(String, int)>
	//   17   36:putstatic       #30  <Field d$c Stretch>
		Center = new d$c("Center", 3);
	//   18   39:new             #2   <Class d$c>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "Center">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void d$c(String, int)>
	//   23   49:putstatic       #33  <Field d$c Center>
		$VALUES = (new d$c[] {
			AspectFit, AspectFill, Stretch, Center
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       d$c[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field d$c AspectFit>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field d$c AspectFill>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field d$c Stretch>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field d$c Center>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field d$c[] $VALUES>
	//*  43   83:return          
	}

	private d$c(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
