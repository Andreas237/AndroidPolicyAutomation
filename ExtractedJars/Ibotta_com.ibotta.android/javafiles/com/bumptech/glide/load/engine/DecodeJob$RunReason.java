// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob

private static final class DecodeJob$RunReason extends Enum
{

	public static DecodeJob$RunReason valueOf(String s)
	{
		return (DecodeJob$RunReason)Enum.valueOf(com/bumptech/glide/load/engine/DecodeJob$RunReason, s);
	//    0    0:ldc1            #2   <Class DecodeJob$RunReason>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DecodeJob$RunReason>
	//    4    9:areturn         
	}

	public static DecodeJob$RunReason[] values()
	{
		return (DecodeJob$RunReason[])((DecodeJob$RunReason []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field DecodeJob$RunReason[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.bumptech.glide.load.engine.DecodeJob$RunReason_3B_.clone()>
	//    2    6:checkcast       #42  <Class DecodeJob$RunReason[]>
	//    3    9:areturn         
	}

	private static final DecodeJob$RunReason $VALUES[];
	public static final DecodeJob$RunReason DECODE_DATA;
	public static final DecodeJob$RunReason INITIALIZE;
	public static final DecodeJob$RunReason SWITCH_TO_SOURCE_SERVICE;

	static 
	{
		INITIALIZE = new DecodeJob$RunReason("INITIALIZE", 0);
	//    0    0:new             #2   <Class DecodeJob$RunReason>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "INITIALIZE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void DecodeJob$RunReason(String, int)>
	//    5   10:putstatic       #23  <Field DecodeJob$RunReason INITIALIZE>
		SWITCH_TO_SOURCE_SERVICE = new DecodeJob$RunReason("SWITCH_TO_SOURCE_SERVICE", 1);
	//    6   13:new             #2   <Class DecodeJob$RunReason>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "SWITCH_TO_SOURCE_SERVICE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void DecodeJob$RunReason(String, int)>
	//   11   23:putstatic       #26  <Field DecodeJob$RunReason SWITCH_TO_SOURCE_SERVICE>
		DECODE_DATA = new DecodeJob$RunReason("DECODE_DATA", 2);
	//   12   26:new             #2   <Class DecodeJob$RunReason>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "DECODE_DATA">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void DecodeJob$RunReason(String, int)>
	//   17   36:putstatic       #29  <Field DecodeJob$RunReason DECODE_DATA>
		$VALUES = (new DecodeJob$RunReason[] {
			INITIALIZE, SWITCH_TO_SOURCE_SERVICE, DECODE_DATA
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       DecodeJob$RunReason[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field DecodeJob$RunReason INITIALIZE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field DecodeJob$RunReason SWITCH_TO_SOURCE_SERVICE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field DecodeJob$RunReason DECODE_DATA>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field DecodeJob$RunReason[] $VALUES>
	//*  33   64:return          
	}

	private DecodeJob$RunReason(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
