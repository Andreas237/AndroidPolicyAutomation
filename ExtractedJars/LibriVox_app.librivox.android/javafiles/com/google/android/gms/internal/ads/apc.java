// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class apc extends Enum
{

	private apc(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #32  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static apc[] values()
	{
		return (apc[])((apc []) (d)).clone();
	//    0    0:getstatic       #30  <Field apc[] d>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.google.android.gms.internal.ads.apc_3B_.clone()>
	//    2    6:checkcast       #35  <Class apc[]>
	//    3    9:areturn         
	}

	public static final apc a;
	public static final apc b;
	public static final apc c;
	private static final apc d[];

	static 
	{
		a = new apc("NIST_P256", 0);
	//    0    0:new             #2   <Class apc>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "NIST_P256">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void apc(String, int)>
	//    5   10:putstatic       #20  <Field apc a>
		b = new apc("NIST_P384", 1);
	//    6   13:new             #2   <Class apc>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "NIST_P384">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void apc(String, int)>
	//   11   23:putstatic       #24  <Field apc b>
		c = new apc("NIST_P521", 2);
	//   12   26:new             #2   <Class apc>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "NIST_P521">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void apc(String, int)>
	//   17   36:putstatic       #28  <Field apc c>
		d = (new apc[] {
			a, b, c
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       apc[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field apc a>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #24  <Field apc b>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #28  <Field apc c>
	//   31   60:aastore         
	//   32   61:putstatic       #30  <Field apc[] d>
	//*  33   64:return          
	}
}
