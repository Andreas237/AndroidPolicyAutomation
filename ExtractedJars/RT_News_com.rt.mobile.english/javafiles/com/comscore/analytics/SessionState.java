// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;


public final class SessionState extends Enum
{

	private SessionState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static SessionState valueOf(String s)
	{
		return (SessionState)Enum.valueOf(com/comscore/analytics/SessionState, s);
	//    0    0:ldc1            #2   <Class SessionState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SessionState>
	//    4    9:areturn         
	}

	public static SessionState[] values()
	{
		return (SessionState[])((SessionState []) (a)).clone();
	//    0    0:getstatic       #32  <Field SessionState[] a>
	//    1    3:invokevirtual   #47  <Method Object _5B_Lcom.comscore.analytics.SessionState_3B_.clone()>
	//    2    6:checkcast       #43  <Class SessionState[]>
	//    3    9:areturn         
	}

	public static final SessionState ACTIVE_USER;
	public static final SessionState APPLICATION;
	public static final SessionState INACTIVE;
	public static final SessionState USER;
	private static final SessionState a[];

	static 
	{
		INACTIVE = new SessionState("INACTIVE", 0);
	//    0    0:new             #2   <Class SessionState>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "INACTIVE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void SessionState(String, int)>
	//    5   10:putstatic       #21  <Field SessionState INACTIVE>
		APPLICATION = new SessionState("APPLICATION", 1);
	//    6   13:new             #2   <Class SessionState>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "APPLICATION">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void SessionState(String, int)>
	//   11   23:putstatic       #24  <Field SessionState APPLICATION>
		USER = new SessionState("USER", 2);
	//   12   26:new             #2   <Class SessionState>
	//   13   29:dup             
	//   14   30:ldc1            #25  <String "USER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #19  <Method void SessionState(String, int)>
	//   17   36:putstatic       #27  <Field SessionState USER>
		ACTIVE_USER = new SessionState("ACTIVE_USER", 3);
	//   18   39:new             #2   <Class SessionState>
	//   19   42:dup             
	//   20   43:ldc1            #28  <String "ACTIVE_USER">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #19  <Method void SessionState(String, int)>
	//   23   49:putstatic       #30  <Field SessionState ACTIVE_USER>
		a = (new SessionState[] {
			INACTIVE, APPLICATION, USER, ACTIVE_USER
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       SessionState[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #21  <Field SessionState INACTIVE>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #24  <Field SessionState APPLICATION>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #27  <Field SessionState USER>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #30  <Field SessionState ACTIVE_USER>
	//   41   79:aastore         
	//   42   80:putstatic       #32  <Field SessionState[] a>
	//*  43   83:return          
	}
}
