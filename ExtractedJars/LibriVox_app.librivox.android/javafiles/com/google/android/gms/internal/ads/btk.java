// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, buy, buz, asq, 
//			asr

public final class btk extends Enum
	implements asp
{

	private btk(String s, int i, int j)
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

	public static btk a(int i)
	{
		if(i != 4)
	//*   0    0:iload_0         
	//*   1    1:iconst_4        
	//*   2    2:icmpeq          46
			switch(i)
	//*   3    5:iload_0         
			{
	//*   4    6:tableswitch     0 2: default 32
	//	               0 42
	//	               1 38
	//	               2 34
			default:
				return null;
	//    5   32:aconst_null     
	//    6   33:areturn         

			case 2: // '\002'
				return c;
	//    7   34:getstatic       #35  <Field btk c>
	//    8   37:areturn         

			case 1: // '\001'
				return b;
	//    9   38:getstatic       #31  <Field btk b>
	//   10   41:areturn         

			case 0: // '\0'
				return a;
	//   11   42:getstatic       #27  <Field btk a>
	//   12   45:areturn         
			}
		else
			return d;
	//   13   46:getstatic       #39  <Field btk d>
	//   14   49:areturn         
	}

	public static asr b()
	{
		return buz.a;
	//    0    0:getstatic       #60  <Field asr buz.a>
	//    1    3:areturn         
	}

	public static btk[] values()
	{
		return (btk[])((btk []) (g)).clone();
	//    0    0:getstatic       #41  <Field btk[] g>
	//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.google.android.gms.internal.ads.btk_3B_.clone()>
	//    2    6:checkcast       #63  <Class btk[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int f>
	//    2    4:ireturn         
	}

	private static final btk a;
	private static final btk b;
	private static final btk c;
	private static final btk d;
	private static final asq e = new buy();
	private static final btk g[];
	private final int f;

	static 
	{
		a = new btk("CELLULAR_NETWORK_TYPE_UNSPECIFIED", 0, 0);
	//    0    0:new             #2   <Class btk>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "CELLULAR_NETWORK_TYPE_UNSPECIFIED">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #25  <Method void btk(String, int, int)>
	//    6   11:putstatic       #27  <Field btk a>
		b = new btk("TWO_G", 1, 1);
	//    7   14:new             #2   <Class btk>
	//    8   17:dup             
	//    9   18:ldc1            #29  <String "TWO_G">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #25  <Method void btk(String, int, int)>
	//   13   25:putstatic       #31  <Field btk b>
		c = new btk("THREE_G", 2, 2);
	//   14   28:new             #2   <Class btk>
	//   15   31:dup             
	//   16   32:ldc1            #33  <String "THREE_G">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #25  <Method void btk(String, int, int)>
	//   20   39:putstatic       #35  <Field btk c>
		d = new btk("LTE", 3, 4);
	//   21   42:new             #2   <Class btk>
	//   22   45:dup             
	//   23   46:ldc1            #37  <String "LTE">
	//   24   48:iconst_3        
	//   25   49:iconst_4        
	//   26   50:invokespecial   #25  <Method void btk(String, int, int)>
	//   27   53:putstatic       #39  <Field btk d>
		g = (new btk[] {
			a, b, c, d
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       btk[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #27  <Field btk a>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #31  <Field btk b>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #35  <Field btk c>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #39  <Field btk d>
	//   45   83:aastore         
	//   46   84:putstatic       #41  <Field btk[] g>
	//   47   87:new             #43  <Class buy>
	//   48   90:dup             
	//   49   91:invokespecial   #45  <Method void buy()>
	//   50   94:putstatic       #47  <Field asq e>
	//*  51   97:return          
	}
}
