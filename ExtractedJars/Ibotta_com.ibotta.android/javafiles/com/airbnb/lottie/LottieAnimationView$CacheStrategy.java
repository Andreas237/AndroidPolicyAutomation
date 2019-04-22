// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			LottieAnimationView

public static final class LottieAnimationView$CacheStrategy extends Enum
{

	public static LottieAnimationView$CacheStrategy valueOf(String s)
	{
		return (LottieAnimationView$CacheStrategy)Enum.valueOf(com/airbnb/lottie/LottieAnimationView$CacheStrategy, s);
	//    0    0:ldc1            #2   <Class LottieAnimationView$CacheStrategy>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LottieAnimationView$CacheStrategy>
	//    4    9:areturn         
	}

	public static LottieAnimationView$CacheStrategy[] values()
	{
		return (LottieAnimationView$CacheStrategy[])((LottieAnimationView$CacheStrategy []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field LottieAnimationView$CacheStrategy[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.airbnb.lottie.LottieAnimationView$CacheStrategy_3B_.clone()>
	//    2    6:checkcast       #42  <Class LottieAnimationView$CacheStrategy[]>
	//    3    9:areturn         
	}

	private static final LottieAnimationView$CacheStrategy $VALUES[];
	public static final LottieAnimationView$CacheStrategy None;
	public static final LottieAnimationView$CacheStrategy Strong;
	public static final LottieAnimationView$CacheStrategy Weak;

	static 
	{
		None = new LottieAnimationView$CacheStrategy("None", 0);
	//    0    0:new             #2   <Class LottieAnimationView$CacheStrategy>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "None">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void LottieAnimationView$CacheStrategy(String, int)>
	//    5   10:putstatic       #23  <Field LottieAnimationView$CacheStrategy None>
		Weak = new LottieAnimationView$CacheStrategy("Weak", 1);
	//    6   13:new             #2   <Class LottieAnimationView$CacheStrategy>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Weak">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void LottieAnimationView$CacheStrategy(String, int)>
	//   11   23:putstatic       #26  <Field LottieAnimationView$CacheStrategy Weak>
		Strong = new LottieAnimationView$CacheStrategy("Strong", 2);
	//   12   26:new             #2   <Class LottieAnimationView$CacheStrategy>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "Strong">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void LottieAnimationView$CacheStrategy(String, int)>
	//   17   36:putstatic       #29  <Field LottieAnimationView$CacheStrategy Strong>
		$VALUES = (new LottieAnimationView$CacheStrategy[] {
			None, Weak, Strong
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       LottieAnimationView$CacheStrategy[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field LottieAnimationView$CacheStrategy None>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field LottieAnimationView$CacheStrategy Weak>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field LottieAnimationView$CacheStrategy Strong>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field LottieAnimationView$CacheStrategy[] $VALUES>
	//*  33   64:return          
	}

	private LottieAnimationView$CacheStrategy(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
