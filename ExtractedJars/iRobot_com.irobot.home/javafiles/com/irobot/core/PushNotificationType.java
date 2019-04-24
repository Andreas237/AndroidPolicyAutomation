// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class PushNotificationType extends Enum
{

	private PushNotificationType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #66  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static PushNotificationType valueOf(String s)
	{
		return (PushNotificationType)Enum.valueOf(com/irobot/core/PushNotificationType, s);
	//    0    0:ldc1            #2   <Class PushNotificationType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #72  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PushNotificationType>
	//    4    9:areturn         
	}

	public static PushNotificationType[] values()
	{
		return (PushNotificationType[])((PushNotificationType []) ($VALUES)).clone();
	//    0    0:getstatic       #64  <Field PushNotificationType[] $VALUES>
	//    1    3:invokevirtual   #79  <Method Object _5B_Lcom.irobot.core.PushNotificationType_3B_.clone()>
	//    2    6:checkcast       #75  <Class PushNotificationType[]>
	//    3    9:areturn         
	}

	private static final PushNotificationType $VALUES[];
	public static final PushNotificationType ApplicationBadging;
	public static final PushNotificationType AutoEvacError;
	public static final PushNotificationType BetaProgram;
	public static final PushNotificationType BinFull;
	public static final PushNotificationType CleaningReport;
	public static final PushNotificationType CleaningReportAutoEvacError;
	public static final PushNotificationType CleaningReportBinFullError;
	public static final PushNotificationType CleaningStopError;
	public static final PushNotificationType Ota;
	public static final PushNotificationType PersistentMaps;
	public static final PushNotificationType TankEmpty;
	public static final PushNotificationType Unknown;

	static 
	{
		Unknown = new PushNotificationType("Unknown", 0);
	//    0    0:new             #2   <Class PushNotificationType>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "Unknown">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//    5   10:putstatic       #29  <Field PushNotificationType Unknown>
		CleaningReport = new PushNotificationType("CleaningReport", 1);
	//    6   13:new             #2   <Class PushNotificationType>
	//    7   16:dup             
	//    8   17:ldc1            #30  <String "CleaningReport">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   11   23:putstatic       #32  <Field PushNotificationType CleaningReport>
		CleaningStopError = new PushNotificationType("CleaningStopError", 2);
	//   12   26:new             #2   <Class PushNotificationType>
	//   13   29:dup             
	//   14   30:ldc1            #33  <String "CleaningStopError">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   17   36:putstatic       #35  <Field PushNotificationType CleaningStopError>
		BinFull = new PushNotificationType("BinFull", 3);
	//   18   39:new             #2   <Class PushNotificationType>
	//   19   42:dup             
	//   20   43:ldc1            #36  <String "BinFull">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   23   49:putstatic       #38  <Field PushNotificationType BinFull>
		Ota = new PushNotificationType("Ota", 4);
	//   24   52:new             #2   <Class PushNotificationType>
	//   25   55:dup             
	//   26   56:ldc1            #39  <String "Ota">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   29   62:putstatic       #41  <Field PushNotificationType Ota>
		BetaProgram = new PushNotificationType("BetaProgram", 5);
	//   30   65:new             #2   <Class PushNotificationType>
	//   31   68:dup             
	//   32   69:ldc1            #42  <String "BetaProgram">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   35   75:putstatic       #44  <Field PushNotificationType BetaProgram>
		CleaningReportAutoEvacError = new PushNotificationType("CleaningReportAutoEvacError", 6);
	//   36   78:new             #2   <Class PushNotificationType>
	//   37   81:dup             
	//   38   82:ldc1            #45  <String "CleaningReportAutoEvacError">
	//   39   84:bipush          6
	//   40   86:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   41   89:putstatic       #47  <Field PushNotificationType CleaningReportAutoEvacError>
		AutoEvacError = new PushNotificationType("AutoEvacError", 7);
	//   42   92:new             #2   <Class PushNotificationType>
	//   43   95:dup             
	//   44   96:ldc1            #48  <String "AutoEvacError">
	//   45   98:bipush          7
	//   46  100:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   47  103:putstatic       #50  <Field PushNotificationType AutoEvacError>
		PersistentMaps = new PushNotificationType("PersistentMaps", 8);
	//   48  106:new             #2   <Class PushNotificationType>
	//   49  109:dup             
	//   50  110:ldc1            #51  <String "PersistentMaps">
	//   51  112:bipush          8
	//   52  114:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   53  117:putstatic       #53  <Field PushNotificationType PersistentMaps>
		CleaningReportBinFullError = new PushNotificationType("CleaningReportBinFullError", 9);
	//   54  120:new             #2   <Class PushNotificationType>
	//   55  123:dup             
	//   56  124:ldc1            #54  <String "CleaningReportBinFullError">
	//   57  126:bipush          9
	//   58  128:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   59  131:putstatic       #56  <Field PushNotificationType CleaningReportBinFullError>
		TankEmpty = new PushNotificationType("TankEmpty", 10);
	//   60  134:new             #2   <Class PushNotificationType>
	//   61  137:dup             
	//   62  138:ldc1            #57  <String "TankEmpty">
	//   63  140:bipush          10
	//   64  142:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   65  145:putstatic       #59  <Field PushNotificationType TankEmpty>
		ApplicationBadging = new PushNotificationType("ApplicationBadging", 11);
	//   66  148:new             #2   <Class PushNotificationType>
	//   67  151:dup             
	//   68  152:ldc1            #60  <String "ApplicationBadging">
	//   69  154:bipush          11
	//   70  156:invokespecial   #27  <Method void PushNotificationType(String, int)>
	//   71  159:putstatic       #62  <Field PushNotificationType ApplicationBadging>
		$VALUES = (new PushNotificationType[] {
			Unknown, CleaningReport, CleaningStopError, BinFull, Ota, BetaProgram, CleaningReportAutoEvacError, AutoEvacError, PersistentMaps, CleaningReportBinFullError, 
			TankEmpty, ApplicationBadging
		});
	//   72  162:bipush          12
	//   73  164:anewarray       PushNotificationType[]
	//   74  167:dup             
	//   75  168:iconst_0        
	//   76  169:getstatic       #29  <Field PushNotificationType Unknown>
	//   77  172:aastore         
	//   78  173:dup             
	//   79  174:iconst_1        
	//   80  175:getstatic       #32  <Field PushNotificationType CleaningReport>
	//   81  178:aastore         
	//   82  179:dup             
	//   83  180:iconst_2        
	//   84  181:getstatic       #35  <Field PushNotificationType CleaningStopError>
	//   85  184:aastore         
	//   86  185:dup             
	//   87  186:iconst_3        
	//   88  187:getstatic       #38  <Field PushNotificationType BinFull>
	//   89  190:aastore         
	//   90  191:dup             
	//   91  192:iconst_4        
	//   92  193:getstatic       #41  <Field PushNotificationType Ota>
	//   93  196:aastore         
	//   94  197:dup             
	//   95  198:iconst_5        
	//   96  199:getstatic       #44  <Field PushNotificationType BetaProgram>
	//   97  202:aastore         
	//   98  203:dup             
	//   99  204:bipush          6
	//  100  206:getstatic       #47  <Field PushNotificationType CleaningReportAutoEvacError>
	//  101  209:aastore         
	//  102  210:dup             
	//  103  211:bipush          7
	//  104  213:getstatic       #50  <Field PushNotificationType AutoEvacError>
	//  105  216:aastore         
	//  106  217:dup             
	//  107  218:bipush          8
	//  108  220:getstatic       #53  <Field PushNotificationType PersistentMaps>
	//  109  223:aastore         
	//  110  224:dup             
	//  111  225:bipush          9
	//  112  227:getstatic       #56  <Field PushNotificationType CleaningReportBinFullError>
	//  113  230:aastore         
	//  114  231:dup             
	//  115  232:bipush          10
	//  116  234:getstatic       #59  <Field PushNotificationType TankEmpty>
	//  117  237:aastore         
	//  118  238:dup             
	//  119  239:bipush          11
	//  120  241:getstatic       #62  <Field PushNotificationType ApplicationBadging>
	//  121  244:aastore         
	//  122  245:putstatic       #64  <Field PushNotificationType[] $VALUES>
	//* 123  248:return          
	}
}
