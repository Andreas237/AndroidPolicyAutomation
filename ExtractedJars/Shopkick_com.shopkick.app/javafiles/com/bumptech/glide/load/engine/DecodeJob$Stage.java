// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;


// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob

private static final class DecodeJob$Stage extends Enum
{

	public static DecodeJob$Stage valueOf(String s)
	{
		return (DecodeJob$Stage)Enum.valueOf(com/bumptech/glide/load/engine/DecodeJob$Stage, s);
	//    0    0:ldc1            #2   <Class DecodeJob$Stage>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DecodeJob$Stage>
	//    4    9:areturn         
	}

	public static DecodeJob$Stage[] values()
	{
		return (DecodeJob$Stage[])((DecodeJob$Stage []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field DecodeJob$Stage[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.bumptech.glide.load.engine.DecodeJob$Stage_3B_.clone()>
	//    2    6:checkcast       #54  <Class DecodeJob$Stage[]>
	//    3    9:areturn         
	}

	private static final DecodeJob$Stage $VALUES[];
	public static final DecodeJob$Stage DATA_CACHE;
	public static final DecodeJob$Stage ENCODE;
	public static final DecodeJob$Stage FINISHED;
	public static final DecodeJob$Stage INITIALIZE;
	public static final DecodeJob$Stage RESOURCE_CACHE;
	public static final DecodeJob$Stage SOURCE;

	static 
	{
		INITIALIZE = new DecodeJob$Stage("INITIALIZE", 0);
	//    0    0:new             #2   <Class DecodeJob$Stage>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "INITIALIZE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
	//    5   10:putstatic       #26  <Field DecodeJob$Stage INITIALIZE>
		RESOURCE_CACHE = new DecodeJob$Stage("RESOURCE_CACHE", 1);
	//    6   13:new             #2   <Class DecodeJob$Stage>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "RESOURCE_CACHE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
	//   11   23:putstatic       #29  <Field DecodeJob$Stage RESOURCE_CACHE>
		DATA_CACHE = new DecodeJob$Stage("DATA_CACHE", 2);
	//   12   26:new             #2   <Class DecodeJob$Stage>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "DATA_CACHE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
	//   17   36:putstatic       #32  <Field DecodeJob$Stage DATA_CACHE>
		SOURCE = new DecodeJob$Stage("SOURCE", 3);
	//   18   39:new             #2   <Class DecodeJob$Stage>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "SOURCE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
	//   23   49:putstatic       #35  <Field DecodeJob$Stage SOURCE>
		ENCODE = new DecodeJob$Stage("ENCODE", 4);
	//   24   52:new             #2   <Class DecodeJob$Stage>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "ENCODE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
	//   29   62:putstatic       #38  <Field DecodeJob$Stage ENCODE>
		FINISHED = new DecodeJob$Stage("FINISHED", 5);
	//   30   65:new             #2   <Class DecodeJob$Stage>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "FINISHED">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void DecodeJob$Stage(String, int)>
	//   35   75:putstatic       #41  <Field DecodeJob$Stage FINISHED>
		$VALUES = (new DecodeJob$Stage[] {
			INITIALIZE, RESOURCE_CACHE, DATA_CACHE, SOURCE, ENCODE, FINISHED
		});
	//   36   78:bipush          6
	//   37   80:anewarray       DecodeJob$Stage[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field DecodeJob$Stage INITIALIZE>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field DecodeJob$Stage RESOURCE_CACHE>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field DecodeJob$Stage DATA_CACHE>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field DecodeJob$Stage SOURCE>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field DecodeJob$Stage ENCODE>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field DecodeJob$Stage FINISHED>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field DecodeJob$Stage[] $VALUES>
	//*  63  122:return          
	}

	private DecodeJob$Stage(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
