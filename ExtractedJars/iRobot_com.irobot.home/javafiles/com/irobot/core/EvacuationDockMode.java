// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class EvacuationDockMode extends Enum
{

	private EvacuationDockMode(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static EvacuationDockMode valueOf(String s)
	{
		return (EvacuationDockMode)Enum.valueOf(com/irobot/core/EvacuationDockMode, s);
	//    0    0:ldc1            #2   <Class EvacuationDockMode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class EvacuationDockMode>
	//    4    9:areturn         
	}

	public static EvacuationDockMode[] values()
	{
		return (EvacuationDockMode[])((EvacuationDockMode []) ($VALUES)).clone();
	//    0    0:getstatic       #48  <Field EvacuationDockMode[] $VALUES>
	//    1    3:invokevirtual   #63  <Method Object _5B_Lcom.irobot.core.EvacuationDockMode_3B_.clone()>
	//    2    6:checkcast       #59  <Class EvacuationDockMode[]>
	//    3    9:areturn         
	}

	private static final EvacuationDockMode $VALUES[];
	public static final EvacuationDockMode BagFull;
	public static final EvacuationDockMode BinMissing;
	public static final EvacuationDockMode Clogged;
	public static final EvacuationDockMode Error;
	public static final EvacuationDockMode EvacuationInProgress;
	public static final EvacuationDockMode EvacuationStarting;
	public static final EvacuationDockMode Invalid;
	public static final EvacuationDockMode Ready;

	static 
	{
		Invalid = new EvacuationDockMode("Invalid", 0);
	//    0    0:new             #2   <Class EvacuationDockMode>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "Invalid">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void EvacuationDockMode(String, int)>
	//    5   10:putstatic       #25  <Field EvacuationDockMode Invalid>
		Ready = new EvacuationDockMode("Ready", 1);
	//    6   13:new             #2   <Class EvacuationDockMode>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "Ready">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void EvacuationDockMode(String, int)>
	//   11   23:putstatic       #28  <Field EvacuationDockMode Ready>
		EvacuationStarting = new EvacuationDockMode("EvacuationStarting", 2);
	//   12   26:new             #2   <Class EvacuationDockMode>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "EvacuationStarting">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void EvacuationDockMode(String, int)>
	//   17   36:putstatic       #31  <Field EvacuationDockMode EvacuationStarting>
		EvacuationInProgress = new EvacuationDockMode("EvacuationInProgress", 3);
	//   18   39:new             #2   <Class EvacuationDockMode>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "EvacuationInProgress">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void EvacuationDockMode(String, int)>
	//   23   49:putstatic       #34  <Field EvacuationDockMode EvacuationInProgress>
		BagFull = new EvacuationDockMode("BagFull", 4);
	//   24   52:new             #2   <Class EvacuationDockMode>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "BagFull">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void EvacuationDockMode(String, int)>
	//   29   62:putstatic       #37  <Field EvacuationDockMode BagFull>
		Clogged = new EvacuationDockMode("Clogged", 5);
	//   30   65:new             #2   <Class EvacuationDockMode>
	//   31   68:dup             
	//   32   69:ldc1            #38  <String "Clogged">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #23  <Method void EvacuationDockMode(String, int)>
	//   35   75:putstatic       #40  <Field EvacuationDockMode Clogged>
		BinMissing = new EvacuationDockMode("BinMissing", 6);
	//   36   78:new             #2   <Class EvacuationDockMode>
	//   37   81:dup             
	//   38   82:ldc1            #41  <String "BinMissing">
	//   39   84:bipush          6
	//   40   86:invokespecial   #23  <Method void EvacuationDockMode(String, int)>
	//   41   89:putstatic       #43  <Field EvacuationDockMode BinMissing>
		Error = new EvacuationDockMode("Error", 7);
	//   42   92:new             #2   <Class EvacuationDockMode>
	//   43   95:dup             
	//   44   96:ldc1            #44  <String "Error">
	//   45   98:bipush          7
	//   46  100:invokespecial   #23  <Method void EvacuationDockMode(String, int)>
	//   47  103:putstatic       #46  <Field EvacuationDockMode Error>
		$VALUES = (new EvacuationDockMode[] {
			Invalid, Ready, EvacuationStarting, EvacuationInProgress, BagFull, Clogged, BinMissing, Error
		});
	//   48  106:bipush          8
	//   49  108:anewarray       EvacuationDockMode[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #25  <Field EvacuationDockMode Invalid>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #28  <Field EvacuationDockMode Ready>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #31  <Field EvacuationDockMode EvacuationStarting>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #34  <Field EvacuationDockMode EvacuationInProgress>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #37  <Field EvacuationDockMode BagFull>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #40  <Field EvacuationDockMode Clogged>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #43  <Field EvacuationDockMode BinMissing>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #46  <Field EvacuationDockMode Error>
	//   81  160:aastore         
	//   82  161:putstatic       #48  <Field EvacuationDockMode[] $VALUES>
	//*  83  164:return          
	}
}
