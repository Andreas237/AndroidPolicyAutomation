// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ew, cb, cc, ex, 
//			ey

public final class bx extends Enum
	implements ew
{

	private bx(String s, int i, int j)
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

	public static ey b()
	{
		return cc.a;
	//    0    0:getstatic       #49  <Field ey cc.a>
	//    1    3:areturn         
	}

	public static bx[] values()
	{
		return (bx[])((bx []) (e)).clone();
	//    0    0:getstatic       #31  <Field bx[] e>
	//    1    3:invokevirtual   #56  <Method Object _5B_Lcom.google.android.gms.internal.firebase_2D_perf.bx_3B_.clone()>
	//    2    6:checkcast       #52  <Class bx[]>
	//    3    9:areturn         
	}

	public final int a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int d>
	//    2    4:ireturn         
	}

	public static final bx a;
	private static final bx b;
	private static final ex c = new cb();
	private static final bx e[];
	private final int d;

	static 
	{
		b = new bx("NETWORK_CLIENT_ERROR_REASON_UNKNOWN", 0, 0);
	//    0    0:new             #2   <Class bx>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "NETWORK_CLIENT_ERROR_REASON_UNKNOWN">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #23  <Method void bx(String, int, int)>
	//    6   11:putstatic       #25  <Field bx b>
		a = new bx("GENERIC_CLIENT_ERROR", 1, 1);
	//    7   14:new             #2   <Class bx>
	//    8   17:dup             
	//    9   18:ldc1            #27  <String "GENERIC_CLIENT_ERROR">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #23  <Method void bx(String, int, int)>
	//   13   25:putstatic       #29  <Field bx a>
		e = (new bx[] {
			b, a
		});
	//   14   28:iconst_2        
	//   15   29:anewarray       bx[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:getstatic       #25  <Field bx b>
	//   19   37:aastore         
	//   20   38:dup             
	//   21   39:iconst_1        
	//   22   40:getstatic       #29  <Field bx a>
	//   23   43:aastore         
	//   24   44:putstatic       #31  <Field bx[] e>
	//   25   47:new             #33  <Class cb>
	//   26   50:dup             
	//   27   51:invokespecial   #35  <Method void cb()>
	//   28   54:putstatic       #37  <Field ex c>
	//*  29   57:return          
	}
}
