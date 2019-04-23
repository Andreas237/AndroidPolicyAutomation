// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;


// Referenced classes of package com.appscend.vast:
//			APSVASTRootNode

public static final class APSVASTRootNode$APSAdPodFallback extends Enum
{

	public static APSVASTRootNode$APSAdPodFallback valueOf(String s)
	{
		return (APSVASTRootNode$APSAdPodFallback)Enum.valueOf(com/appscend/vast/APSVASTRootNode$APSAdPodFallback, s);
	//    0    0:ldc1            #2   <Class APSVASTRootNode$APSAdPodFallback>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSVASTRootNode$APSAdPodFallback>
	//    4    9:areturn         
	}

	public static APSVASTRootNode$APSAdPodFallback[] values()
	{
		return (APSVASTRootNode$APSAdPodFallback[])((APSVASTRootNode$APSAdPodFallback []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field APSVASTRootNode$APSAdPodFallback[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.vast.APSVASTRootNode$APSAdPodFallback_3B_.clone()>
	//    2    6:checkcast       #42  <Class APSVASTRootNode$APSAdPodFallback[]>
	//    3    9:areturn         
	}

	private static final APSVASTRootNode$APSAdPodFallback $VALUES[];
	public static final APSVASTRootNode$APSAdPodFallback APSAdPodFallbackDrop;
	public static final APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectAll;
	public static final APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectFirst;

	static 
	{
		APSAdPodFallbackSelectAll = new APSVASTRootNode$APSAdPodFallback("APSAdPodFallbackSelectAll", 0);
	//    0    0:new             #2   <Class APSVASTRootNode$APSAdPodFallback>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "APSAdPodFallbackSelectAll">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void APSVASTRootNode$APSAdPodFallback(String, int)>
	//    5   10:putstatic       #23  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectAll>
		APSAdPodFallbackSelectFirst = new APSVASTRootNode$APSAdPodFallback("APSAdPodFallbackSelectFirst", 1);
	//    6   13:new             #2   <Class APSVASTRootNode$APSAdPodFallback>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "APSAdPodFallbackSelectFirst">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void APSVASTRootNode$APSAdPodFallback(String, int)>
	//   11   23:putstatic       #26  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectFirst>
		APSAdPodFallbackDrop = new APSVASTRootNode$APSAdPodFallback("APSAdPodFallbackDrop", 2);
	//   12   26:new             #2   <Class APSVASTRootNode$APSAdPodFallback>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "APSAdPodFallbackDrop">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void APSVASTRootNode$APSAdPodFallback(String, int)>
	//   17   36:putstatic       #29  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackDrop>
		$VALUES = (new APSVASTRootNode$APSAdPodFallback[] {
			APSAdPodFallbackSelectAll, APSAdPodFallbackSelectFirst, APSAdPodFallbackDrop
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       APSVASTRootNode$APSAdPodFallback[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectAll>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectFirst>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackDrop>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field APSVASTRootNode$APSAdPodFallback[] $VALUES>
	//*  33   64:return          
	}

	private APSVASTRootNode$APSAdPodFallback(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
