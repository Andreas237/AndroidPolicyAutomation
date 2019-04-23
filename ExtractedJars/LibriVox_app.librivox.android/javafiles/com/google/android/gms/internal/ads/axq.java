// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			asp, aya, ayb, asq, 
//			asr

public final class axq extends Enum
	implements asp
{

	private axq(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		d = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #43  <Field int d>
	//    7   11:return          
	}

	public static axq a(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 30
	//	               1 26
		default:
			return null;
	//    2   24:aconst_null     
	//    3   25:areturn         

		case 1: // '\001'
			return b;
	//    4   26:getstatic       #29  <Field axq b>
	//    5   29:areturn         

		case 0: // '\0'
			return a;
	//    6   30:getstatic       #25  <Field axq a>
	//    7   33:areturn         
		}
	}

	public static asr b()
	{
		return ayb.a;
	//    0    0:getstatic       #50  <Field asr ayb.a>
	//    1    3:areturn         
	}

	public static axq[] values()
	{
		return (axq[])((axq []) (e)).clone();
	//    0    0:getstatic       #31  <Field axq[] e>
	//    1    3:invokevirtual   #57  <Method Object _5B_Lcom.google.android.gms.internal.ads.axq_3B_.clone()>
	//    2    6:checkcast       #53  <Class axq[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int d>
	//    2    4:ireturn         
	}

	private static final axq a;
	private static final axq b;
	private static final asq c = new aya();
	private static final axq e[];
	private final int d;

	static 
	{
		a = new axq("TYPE_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class axq>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "TYPE_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #23  <Method void axq(String, int, int)>
	//    6   11:putstatic       #25  <Field axq a>
		b = new axq("TYPE_CREATIVE", 1, 1);
	//    7   14:new             #2   <Class axq>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "TYPE_CREATIVE">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #23  <Method void axq(String, int, int)>
	//   13   25:putstatic       #29  <Field axq b>
		e = (new axq[] {
			a, b
		});
	//   14   28:iconst_2        
	//   15   29:anewarray       axq[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #25  <Field axq a>
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #29  <Field axq b>
	//   23   43:aastore         
	//   24   44:putstatic       #31  <Field axq[] e>
	//   25   47:new             #33  <Class aya>
	//   26   50:dup             
	//   27   51:invokespecial   #35  <Method void aya()>
	//   28   54:putstatic       #37  <Field asq c>
	//*  29   57:return          
	}
}
