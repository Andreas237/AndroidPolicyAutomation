// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


public final class apd extends Enum
{

	private apd(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #32  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static apd[] values()
	{
		return (apd[])((apd []) (d)).clone();
	//    0    0:getstatic       #30  <Field apd[] d>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.google.android.gms.internal.ads.apd_3B_.clone()>
	//    2    6:checkcast       #35  <Class apd[]>
	//    3    9:areturn         
	}

	public static final apd a;
	public static final apd b;
	public static final apd c;
	private static final apd d[];

	static 
	{
		a = new apd("UNCOMPRESSED", 0);
	//    0    0:new             #2   <Class apd>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "UNCOMPRESSED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void apd(String, int)>
	//    5   10:putstatic       #20  <Field apd a>
		b = new apd("COMPRESSED", 1);
	//    6   13:new             #2   <Class apd>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "COMPRESSED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void apd(String, int)>
	//   11   23:putstatic       #24  <Field apd b>
		c = new apd("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
	//   12   26:new             #2   <Class apd>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "DO_NOT_USE_CRUNCHY_UNCOMPRESSED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void apd(String, int)>
	//   17   36:putstatic       #28  <Field apd c>
		d = (new apd[] {
			a, b, c
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       apd[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field apd a>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #24  <Field apd b>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #28  <Field apd c>
	//   31   60:aastore         
	//   32   61:putstatic       #30  <Field apd[] d>
	//*  33   64:return          
	}
}
