// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class NotificationCenterServiceDataState extends Enum
{

	private NotificationCenterServiceDataState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static NotificationCenterServiceDataState valueOf(String s)
	{
		return (NotificationCenterServiceDataState)Enum.valueOf(com/irobot/core/NotificationCenterServiceDataState, s);
	//    0    0:ldc1            #2   <Class NotificationCenterServiceDataState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class NotificationCenterServiceDataState>
	//    4    9:areturn         
	}

	public static NotificationCenterServiceDataState[] values()
	{
		return (NotificationCenterServiceDataState[])((NotificationCenterServiceDataState []) ($VALUES)).clone();
	//    0    0:getstatic       #44  <Field NotificationCenterServiceDataState[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.irobot.core.NotificationCenterServiceDataState_3B_.clone()>
	//    2    6:checkcast       #55  <Class NotificationCenterServiceDataState[]>
	//    3    9:areturn         
	}

	private static final NotificationCenterServiceDataState $VALUES[];
	public static final NotificationCenterServiceDataState Invalid;
	public static final NotificationCenterServiceDataState NotificationAcceptSuccess;
	public static final NotificationCenterServiceDataState NotificationDeleteSuccess;
	public static final NotificationCenterServiceDataState NotificationDismissSuccess;
	public static final NotificationCenterServiceDataState NotificationListUpdated;
	public static final NotificationCenterServiceDataState NotificationMarkReadSuccess;
	public static final NotificationCenterServiceDataState NotificationRequestFailure;

	static 
	{
		NotificationListUpdated = new NotificationCenterServiceDataState("NotificationListUpdated", 0);
	//    0    0:new             #2   <Class NotificationCenterServiceDataState>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "NotificationListUpdated">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void NotificationCenterServiceDataState(String, int)>
	//    5   10:putstatic       #24  <Field NotificationCenterServiceDataState NotificationListUpdated>
		NotificationMarkReadSuccess = new NotificationCenterServiceDataState("NotificationMarkReadSuccess", 1);
	//    6   13:new             #2   <Class NotificationCenterServiceDataState>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "NotificationMarkReadSuccess">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void NotificationCenterServiceDataState(String, int)>
	//   11   23:putstatic       #27  <Field NotificationCenterServiceDataState NotificationMarkReadSuccess>
		NotificationDeleteSuccess = new NotificationCenterServiceDataState("NotificationDeleteSuccess", 2);
	//   12   26:new             #2   <Class NotificationCenterServiceDataState>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "NotificationDeleteSuccess">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void NotificationCenterServiceDataState(String, int)>
	//   17   36:putstatic       #30  <Field NotificationCenterServiceDataState NotificationDeleteSuccess>
		NotificationAcceptSuccess = new NotificationCenterServiceDataState("NotificationAcceptSuccess", 3);
	//   18   39:new             #2   <Class NotificationCenterServiceDataState>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "NotificationAcceptSuccess">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void NotificationCenterServiceDataState(String, int)>
	//   23   49:putstatic       #33  <Field NotificationCenterServiceDataState NotificationAcceptSuccess>
		NotificationDismissSuccess = new NotificationCenterServiceDataState("NotificationDismissSuccess", 4);
	//   24   52:new             #2   <Class NotificationCenterServiceDataState>
	//   25   55:dup             
	//   26   56:ldc1            #34  <String "NotificationDismissSuccess">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #22  <Method void NotificationCenterServiceDataState(String, int)>
	//   29   62:putstatic       #36  <Field NotificationCenterServiceDataState NotificationDismissSuccess>
		NotificationRequestFailure = new NotificationCenterServiceDataState("NotificationRequestFailure", 5);
	//   30   65:new             #2   <Class NotificationCenterServiceDataState>
	//   31   68:dup             
	//   32   69:ldc1            #37  <String "NotificationRequestFailure">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #22  <Method void NotificationCenterServiceDataState(String, int)>
	//   35   75:putstatic       #39  <Field NotificationCenterServiceDataState NotificationRequestFailure>
		Invalid = new NotificationCenterServiceDataState("Invalid", 6);
	//   36   78:new             #2   <Class NotificationCenterServiceDataState>
	//   37   81:dup             
	//   38   82:ldc1            #40  <String "Invalid">
	//   39   84:bipush          6
	//   40   86:invokespecial   #22  <Method void NotificationCenterServiceDataState(String, int)>
	//   41   89:putstatic       #42  <Field NotificationCenterServiceDataState Invalid>
		$VALUES = (new NotificationCenterServiceDataState[] {
			NotificationListUpdated, NotificationMarkReadSuccess, NotificationDeleteSuccess, NotificationAcceptSuccess, NotificationDismissSuccess, NotificationRequestFailure, Invalid
		});
	//   42   92:bipush          7
	//   43   94:anewarray       NotificationCenterServiceDataState[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #24  <Field NotificationCenterServiceDataState NotificationListUpdated>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #27  <Field NotificationCenterServiceDataState NotificationMarkReadSuccess>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #30  <Field NotificationCenterServiceDataState NotificationDeleteSuccess>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #33  <Field NotificationCenterServiceDataState NotificationAcceptSuccess>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #36  <Field NotificationCenterServiceDataState NotificationDismissSuccess>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #39  <Field NotificationCenterServiceDataState NotificationRequestFailure>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #42  <Field NotificationCenterServiceDataState Invalid>
	//   71  139:aastore         
	//   72  140:putstatic       #44  <Field NotificationCenterServiceDataState[] $VALUES>
	//*  73  143:return          
	}
}
