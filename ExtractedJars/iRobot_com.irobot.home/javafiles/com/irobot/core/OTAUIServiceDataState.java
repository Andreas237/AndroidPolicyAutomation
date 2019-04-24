// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class OTAUIServiceDataState extends Enum
{

	private OTAUIServiceDataState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static OTAUIServiceDataState valueOf(String s)
	{
		return (OTAUIServiceDataState)Enum.valueOf(com/irobot/core/OTAUIServiceDataState, s);
	//    0    0:ldc1            #2   <Class OTAUIServiceDataState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class OTAUIServiceDataState>
	//    4    9:areturn         
	}

	public static OTAUIServiceDataState[] values()
	{
		return (OTAUIServiceDataState[])((OTAUIServiceDataState []) ($VALUES)).clone();
	//    0    0:getstatic       #52  <Field OTAUIServiceDataState[] $VALUES>
	//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.irobot.core.OTAUIServiceDataState_3B_.clone()>
	//    2    6:checkcast       #63  <Class OTAUIServiceDataState[]>
	//    3    9:areturn         
	}

	private static final OTAUIServiceDataState $VALUES[];
	public static final OTAUIServiceDataState ExpeditedOTAStatus;
	public static final OTAUIServiceDataState LocalOTAError;
	public static final OTAUIServiceDataState LocalOTAStatus;
	public static final OTAUIServiceDataState OnDemandOTACommError;
	public static final OTAUIServiceDataState OnDemandOTACompleted;
	public static final OTAUIServiceDataState OnDemandOTAError;
	public static final OTAUIServiceDataState OnDemandOTAPathType;
	public static final OTAUIServiceDataState OnDemandOTAStatus;
	public static final OTAUIServiceDataState SoftwareUpdateStatus;

	static 
	{
		LocalOTAStatus = new OTAUIServiceDataState("LocalOTAStatus", 0);
	//    0    0:new             #2   <Class OTAUIServiceDataState>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "LocalOTAStatus">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//    5   10:putstatic       #26  <Field OTAUIServiceDataState LocalOTAStatus>
		LocalOTAError = new OTAUIServiceDataState("LocalOTAError", 1);
	//    6   13:new             #2   <Class OTAUIServiceDataState>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "LocalOTAError">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//   11   23:putstatic       #29  <Field OTAUIServiceDataState LocalOTAError>
		OnDemandOTAStatus = new OTAUIServiceDataState("OnDemandOTAStatus", 2);
	//   12   26:new             #2   <Class OTAUIServiceDataState>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "OnDemandOTAStatus">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//   17   36:putstatic       #32  <Field OTAUIServiceDataState OnDemandOTAStatus>
		OnDemandOTAError = new OTAUIServiceDataState("OnDemandOTAError", 3);
	//   18   39:new             #2   <Class OTAUIServiceDataState>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "OnDemandOTAError">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//   23   49:putstatic       #35  <Field OTAUIServiceDataState OnDemandOTAError>
		OnDemandOTACompleted = new OTAUIServiceDataState("OnDemandOTACompleted", 4);
	//   24   52:new             #2   <Class OTAUIServiceDataState>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "OnDemandOTACompleted">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//   29   62:putstatic       #38  <Field OTAUIServiceDataState OnDemandOTACompleted>
		OnDemandOTACommError = new OTAUIServiceDataState("OnDemandOTACommError", 5);
	//   30   65:new             #2   <Class OTAUIServiceDataState>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "OnDemandOTACommError">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//   35   75:putstatic       #41  <Field OTAUIServiceDataState OnDemandOTACommError>
		OnDemandOTAPathType = new OTAUIServiceDataState("OnDemandOTAPathType", 6);
	//   36   78:new             #2   <Class OTAUIServiceDataState>
	//   37   81:dup             
	//   38   82:ldc1            #42  <String "OnDemandOTAPathType">
	//   39   84:bipush          6
	//   40   86:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//   41   89:putstatic       #44  <Field OTAUIServiceDataState OnDemandOTAPathType>
		ExpeditedOTAStatus = new OTAUIServiceDataState("ExpeditedOTAStatus", 7);
	//   42   92:new             #2   <Class OTAUIServiceDataState>
	//   43   95:dup             
	//   44   96:ldc1            #45  <String "ExpeditedOTAStatus">
	//   45   98:bipush          7
	//   46  100:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//   47  103:putstatic       #47  <Field OTAUIServiceDataState ExpeditedOTAStatus>
		SoftwareUpdateStatus = new OTAUIServiceDataState("SoftwareUpdateStatus", 8);
	//   48  106:new             #2   <Class OTAUIServiceDataState>
	//   49  109:dup             
	//   50  110:ldc1            #48  <String "SoftwareUpdateStatus">
	//   51  112:bipush          8
	//   52  114:invokespecial   #24  <Method void OTAUIServiceDataState(String, int)>
	//   53  117:putstatic       #50  <Field OTAUIServiceDataState SoftwareUpdateStatus>
		$VALUES = (new OTAUIServiceDataState[] {
			LocalOTAStatus, LocalOTAError, OnDemandOTAStatus, OnDemandOTAError, OnDemandOTACompleted, OnDemandOTACommError, OnDemandOTAPathType, ExpeditedOTAStatus, SoftwareUpdateStatus
		});
	//   54  120:bipush          9
	//   55  122:anewarray       OTAUIServiceDataState[]
	//   56  125:dup             
	//   57  126:iconst_0        
	//   58  127:getstatic       #26  <Field OTAUIServiceDataState LocalOTAStatus>
	//   59  130:aastore         
	//   60  131:dup             
	//   61  132:iconst_1        
	//   62  133:getstatic       #29  <Field OTAUIServiceDataState LocalOTAError>
	//   63  136:aastore         
	//   64  137:dup             
	//   65  138:iconst_2        
	//   66  139:getstatic       #32  <Field OTAUIServiceDataState OnDemandOTAStatus>
	//   67  142:aastore         
	//   68  143:dup             
	//   69  144:iconst_3        
	//   70  145:getstatic       #35  <Field OTAUIServiceDataState OnDemandOTAError>
	//   71  148:aastore         
	//   72  149:dup             
	//   73  150:iconst_4        
	//   74  151:getstatic       #38  <Field OTAUIServiceDataState OnDemandOTACompleted>
	//   75  154:aastore         
	//   76  155:dup             
	//   77  156:iconst_5        
	//   78  157:getstatic       #41  <Field OTAUIServiceDataState OnDemandOTACommError>
	//   79  160:aastore         
	//   80  161:dup             
	//   81  162:bipush          6
	//   82  164:getstatic       #44  <Field OTAUIServiceDataState OnDemandOTAPathType>
	//   83  167:aastore         
	//   84  168:dup             
	//   85  169:bipush          7
	//   86  171:getstatic       #47  <Field OTAUIServiceDataState ExpeditedOTAStatus>
	//   87  174:aastore         
	//   88  175:dup             
	//   89  176:bipush          8
	//   90  178:getstatic       #50  <Field OTAUIServiceDataState SoftwareUpdateStatus>
	//   91  181:aastore         
	//   92  182:putstatic       #52  <Field OTAUIServiceDataState[] $VALUES>
	//*  93  185:return          
	}
}
