// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, but, buu, asq, 
//			asr

public final class btb extends Enum
	implements asp
{

	private btb(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
		e = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #48  <Field int e>
	//    7   11:return          
	}

	public static btb a(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 38
	//	               1 34
	//	               2 30
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case 2: // '\002'
			return c;
	//    4   30:getstatic       #34  <Field btb c>
	//    5   33:areturn         

		case 1: // '\001'
			return b;
	//    6   34:getstatic       #30  <Field btb b>
	//    7   37:areturn         

		case 0: // '\0'
			return a;
	//    8   38:getstatic       #26  <Field btb a>
	//    9   41:areturn         
		}
	}

	public static asr b()
	{
		return buu.a;
	//    0    0:getstatic       #55  <Field asr buu.a>
	//    1    3:areturn         
	}

	public static btb[] values()
	{
		return (btb[])((btb []) (f)).clone();
	//    0    0:getstatic       #36  <Field btb[] f>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.google.android.gms.internal.ads.btb_3B_.clone()>
	//    2    6:checkcast       #58  <Class btb[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int e>
	//    2    4:ireturn         
	}

	private static final btb a;
	private static final btb b;
	private static final btb c;
	private static final asq d = new but();
	private static final btb f[];
	private final int e;

	static 
	{
		a = new btb("PLATFORM_UNSPECIFIED", 0, 0);
	//    0    0:new             #2   <Class btb>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "PLATFORM_UNSPECIFIED">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #24  <Method void btb(String, int, int)>
	//    6   11:putstatic       #26  <Field btb a>
		b = new btb("IOS", 1, 1);
	//    7   14:new             #2   <Class btb>
	//    8   17:dup             
	//    9   18:ldc1            #28  <String "IOS">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #24  <Method void btb(String, int, int)>
	//   13   25:putstatic       #30  <Field btb b>
		c = new btb("ANDROID", 2, 2);
	//   14   28:new             #2   <Class btb>
	//   15   31:dup             
	//   16   32:ldc1            #32  <String "ANDROID">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #24  <Method void btb(String, int, int)>
	//   20   39:putstatic       #34  <Field btb c>
		f = (new btb[] {
			a, b, c
		});
	//   21   42:iconst_3        
	//   22   43:anewarray       btb[]
	//   23   46:dup             
	//   24   47:iconst_0        
	//   25   48:getstatic       #26  <Field btb a>
	//   26   51:aastore         
	//   27   52:dup             
	//   28   53:iconst_1        
	//   29   54:getstatic       #30  <Field btb b>
	//   30   57:aastore         
	//   31   58:dup             
	//   32   59:iconst_2        
	//   33   60:getstatic       #34  <Field btb c>
	//   34   63:aastore         
	//   35   64:putstatic       #36  <Field btb[] f>
	//   36   67:new             #38  <Class but>
	//   37   70:dup             
	//   38   71:invokespecial   #40  <Method void but()>
	//   39   74:putstatic       #42  <Field asq d>
	//*  40   77:return          
	}
}
