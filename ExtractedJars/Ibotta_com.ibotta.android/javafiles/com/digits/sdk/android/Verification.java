// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;


public final class Verification extends Enum
{

	private Verification(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static Verification valueOf(String s)
	{
		return (Verification)Enum.valueOf(com/digits/sdk/android/Verification, s);
	//    0    0:ldc1            #2   <Class Verification>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Verification>
	//    4    9:areturn         
	}

	public static Verification[] values()
	{
		return (Verification[])((Verification []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field Verification[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.digits.sdk.android.Verification_3B_.clone()>
	//    2    6:checkcast       #35  <Class Verification[]>
	//    3    9:areturn         
	}

	private static final Verification $VALUES[];
	public static final Verification sms;
	public static final Verification voicecall;

	static 
	{
		voicecall = new Verification("voicecall", 0);
	//    0    0:new             #2   <Class Verification>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "voicecall">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void Verification(String, int)>
	//    5   10:putstatic       #19  <Field Verification voicecall>
		sms = new Verification("sms", 1);
	//    6   13:new             #2   <Class Verification>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "sms">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void Verification(String, int)>
	//   11   23:putstatic       #22  <Field Verification sms>
		$VALUES = (new Verification[] {
			voicecall, sms
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Verification[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field Verification voicecall>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field Verification sms>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field Verification[] $VALUES>
	//*  23   45:return          
	}
}
