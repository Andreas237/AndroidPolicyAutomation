// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, aye, ayf, asq, 
//			asr

public final class axt extends Enum
	implements asp
{

	private axt(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #51  <Method void Enum(String, int)>
		f = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #53  <Field int f>
	//    7   11:return          
	}

	public static axt a(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 3: default 32
	//	               0 46
	//	               1 42
	//	               2 38
	//	               3 34
		default:
			return null;
	//    2   32:aconst_null     
	//    3   33:areturn         

		case 3: // '\003'
			return d;
	//    4   34:getstatic       #39  <Field axt d>
	//    5   37:areturn         

		case 2: // '\002'
			return c;
	//    6   38:getstatic       #35  <Field axt c>
	//    7   41:areturn         

		case 1: // '\001'
			return b;
	//    8   42:getstatic       #31  <Field axt b>
	//    9   45:areturn         

		case 0: // '\0'
			return a;
	//   10   46:getstatic       #27  <Field axt a>
	//   11   49:areturn         
		}
	}

	public static asr b()
	{
		return ayf.a;
	//    0    0:getstatic       #60  <Field asr ayf.a>
	//    1    3:areturn         
	}

	public static axt[] values()
	{
		return (axt[])((axt []) (g)).clone();
	//    0    0:getstatic       #41  <Field axt[] g>
	//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.google.android.gms.internal.ads.axt_3B_.clone()>
	//    2    6:checkcast       #63  <Class axt[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int f>
	//    2    4:ireturn         
	}

	private static final axt a;
	private static final axt b;
	private static final axt c;
	private static final axt d;
	private static final asq e = new aye();
	private static final axt g[];
	private final int f;

	static 
	{
		a = new axt("AD_RESOURCE_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class axt>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "AD_RESOURCE_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #25  <Method void axt(String, int, int)>
	//    6   11:putstatic       #27  <Field axt a>
		b = new axt("AD_RESOURCE_CREATIVE", 1, 1);
	//    7   14:new             #2   <Class axt>
	//    8   17:dup             
	//    9   18:ldc1            #29  <String "AD_RESOURCE_CREATIVE">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #25  <Method void axt(String, int, int)>
	//   13   25:putstatic       #31  <Field axt b>
		c = new axt("AD_RESOURCE_POST_CLICK", 2, 2);
	//   14   28:new             #2   <Class axt>
	//   15   31:dup             
	//   16   32:ldc1            #33  <String "AD_RESOURCE_POST_CLICK">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #25  <Method void axt(String, int, int)>
	//   20   39:putstatic       #35  <Field axt c>
		d = new axt("AD_RESOURCE_AUTO_CLICK_DESTINATION", 3, 3);
	//   21   42:new             #2   <Class axt>
	//   22   45:dup             
	//   23   46:ldc1            #37  <String "AD_RESOURCE_AUTO_CLICK_DESTINATION">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #25  <Method void axt(String, int, int)>
	//   27   53:putstatic       #39  <Field axt d>
		g = (new axt[] {
			a, b, c, d
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       axt[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #27  <Field axt a>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #31  <Field axt b>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #35  <Field axt c>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #39  <Field axt d>
	//   45   83:aastore         
	//   46   84:putstatic       #41  <Field axt[] g>
	//   47   87:new             #43  <Class aye>
	//   48   90:dup             
	//   49   91:invokespecial   #45  <Method void aye()>
	//   50   94:putstatic       #47  <Field asq e>
	//*  51   97:return          
	}
}
