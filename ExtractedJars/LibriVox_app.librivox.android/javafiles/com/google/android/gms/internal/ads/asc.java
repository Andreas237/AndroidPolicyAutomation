// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class asc extends Enum
{

	private asc(String s, int i, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		e = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #43  <Field boolean e>
	//    7   11:return          
	}

	public static asc[] values()
	{
		return (asc[])((asc []) (f)).clone();
	//    0    0:getstatic       #37  <Field asc[] f>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.google.android.gms.internal.ads.asc_3B_.clone()>
	//    2    6:checkcast       #46  <Class asc[]>
	//    3    9:areturn         
	}

	public static final asc a;
	public static final asc b;
	public static final asc c;
	public static final asc d;
	private static final asc f[];
	private final boolean e;

	static 
	{
		a = new asc("SCALAR", 0, false);
	//    0    0:new             #2   <Class asc>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "SCALAR">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #21  <Method void asc(String, int, boolean)>
	//    6   11:putstatic       #23  <Field asc a>
		b = new asc("VECTOR", 1, true);
	//    7   14:new             #2   <Class asc>
	//    8   17:dup             
	//    9   18:ldc1            #25  <String "VECTOR">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #21  <Method void asc(String, int, boolean)>
	//   13   25:putstatic       #27  <Field asc b>
		c = new asc("PACKED_VECTOR", 2, true);
	//   14   28:new             #2   <Class asc>
	//   15   31:dup             
	//   16   32:ldc1            #29  <String "PACKED_VECTOR">
	//   17   34:iconst_2        
	//   18   35:iconst_1        
	//   19   36:invokespecial   #21  <Method void asc(String, int, boolean)>
	//   20   39:putstatic       #31  <Field asc c>
		d = new asc("MAP", 3, false);
	//   21   42:new             #2   <Class asc>
	//   22   45:dup             
	//   23   46:ldc1            #33  <String "MAP">
	//   24   48:iconst_3        
	//   25   49:iconst_0        
	//   26   50:invokespecial   #21  <Method void asc(String, int, boolean)>
	//   27   53:putstatic       #35  <Field asc d>
		f = (new asc[] {
			a, b, c, d
		});
	//   28   56:iconst_4        
	//   29   57:anewarray       asc[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:getstatic       #23  <Field asc a>
	//   33   65:aastore         
	//   34   66:dup             
	//   35   67:iconst_1        
	//   36   68:getstatic       #27  <Field asc b>
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_2        
	//   40   74:getstatic       #31  <Field asc c>
	//   41   77:aastore         
	//   42   78:dup             
	//   43   79:iconst_3        
	//   44   80:getstatic       #35  <Field asc d>
	//   45   83:aastore         
	//   46   84:putstatic       #37  <Field asc[] f>
	//*  47   87:return          
	}
}
