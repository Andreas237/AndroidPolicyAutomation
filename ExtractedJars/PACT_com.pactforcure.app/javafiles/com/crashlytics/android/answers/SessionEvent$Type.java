// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;


// Referenced classes of package com.crashlytics.android.answers:
//			SessionEvent

static final class SessionEvent$Type extends Enum
{

	public static SessionEvent$Type valueOf(String s)
	{
		return (SessionEvent$Type)Enum.valueOf(com/crashlytics/android/answers/SessionEvent$Type, s);
	//    0    0:ldc1            #2   <Class SessionEvent$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SessionEvent$Type>
	//    4    9:areturn         
	}

	public static SessionEvent$Type[] values()
	{
		return (SessionEvent$Type[])((SessionEvent$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field SessionEvent$Type[] $VALUES>
	//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.crashlytics.android.answers.SessionEvent$Type_3B_.clone()>
	//    2    6:checkcast       #62  <Class SessionEvent$Type[]>
	//    3    9:areturn         
	}

	private static final SessionEvent$Type $VALUES[];
	public static final SessionEvent$Type CRASH;
	public static final SessionEvent$Type CUSTOM;
	public static final SessionEvent$Type INSTALL;
	public static final SessionEvent$Type PAUSE;
	public static final SessionEvent$Type PREDEFINED;
	public static final SessionEvent$Type RESUME;
	public static final SessionEvent$Type START;
	public static final SessionEvent$Type STOP;

	static 
	{
		START = new SessionEvent$Type("START", 0);
	//    0    0:new             #2   <Class SessionEvent$Type>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "START">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
	//    5   10:putstatic       #28  <Field SessionEvent$Type START>
		RESUME = new SessionEvent$Type("RESUME", 1);
	//    6   13:new             #2   <Class SessionEvent$Type>
	//    7   16:dup             
	//    8   17:ldc1            #29  <String "RESUME">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
	//   11   23:putstatic       #31  <Field SessionEvent$Type RESUME>
		PAUSE = new SessionEvent$Type("PAUSE", 2);
	//   12   26:new             #2   <Class SessionEvent$Type>
	//   13   29:dup             
	//   14   30:ldc1            #32  <String "PAUSE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
	//   17   36:putstatic       #34  <Field SessionEvent$Type PAUSE>
		STOP = new SessionEvent$Type("STOP", 3);
	//   18   39:new             #2   <Class SessionEvent$Type>
	//   19   42:dup             
	//   20   43:ldc1            #35  <String "STOP">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
	//   23   49:putstatic       #37  <Field SessionEvent$Type STOP>
		CRASH = new SessionEvent$Type("CRASH", 4);
	//   24   52:new             #2   <Class SessionEvent$Type>
	//   25   55:dup             
	//   26   56:ldc1            #38  <String "CRASH">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
	//   29   62:putstatic       #40  <Field SessionEvent$Type CRASH>
		INSTALL = new SessionEvent$Type("INSTALL", 5);
	//   30   65:new             #2   <Class SessionEvent$Type>
	//   31   68:dup             
	//   32   69:ldc1            #41  <String "INSTALL">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
	//   35   75:putstatic       #43  <Field SessionEvent$Type INSTALL>
		CUSTOM = new SessionEvent$Type("CUSTOM", 6);
	//   36   78:new             #2   <Class SessionEvent$Type>
	//   37   81:dup             
	//   38   82:ldc1            #44  <String "CUSTOM">
	//   39   84:bipush          6
	//   40   86:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
	//   41   89:putstatic       #46  <Field SessionEvent$Type CUSTOM>
		PREDEFINED = new SessionEvent$Type("PREDEFINED", 7);
	//   42   92:new             #2   <Class SessionEvent$Type>
	//   43   95:dup             
	//   44   96:ldc1            #47  <String "PREDEFINED">
	//   45   98:bipush          7
	//   46  100:invokespecial   #26  <Method void SessionEvent$Type(String, int)>
	//   47  103:putstatic       #49  <Field SessionEvent$Type PREDEFINED>
		$VALUES = (new SessionEvent$Type[] {
			START, RESUME, PAUSE, STOP, CRASH, INSTALL, CUSTOM, PREDEFINED
		});
	//   48  106:bipush          8
	//   49  108:anewarray       SessionEvent$Type[]
	//   50  111:dup             
	//   51  112:iconst_0        
	//   52  113:getstatic       #28  <Field SessionEvent$Type START>
	//   53  116:aastore         
	//   54  117:dup             
	//   55  118:iconst_1        
	//   56  119:getstatic       #31  <Field SessionEvent$Type RESUME>
	//   57  122:aastore         
	//   58  123:dup             
	//   59  124:iconst_2        
	//   60  125:getstatic       #34  <Field SessionEvent$Type PAUSE>
	//   61  128:aastore         
	//   62  129:dup             
	//   63  130:iconst_3        
	//   64  131:getstatic       #37  <Field SessionEvent$Type STOP>
	//   65  134:aastore         
	//   66  135:dup             
	//   67  136:iconst_4        
	//   68  137:getstatic       #40  <Field SessionEvent$Type CRASH>
	//   69  140:aastore         
	//   70  141:dup             
	//   71  142:iconst_5        
	//   72  143:getstatic       #43  <Field SessionEvent$Type INSTALL>
	//   73  146:aastore         
	//   74  147:dup             
	//   75  148:bipush          6
	//   76  150:getstatic       #46  <Field SessionEvent$Type CUSTOM>
	//   77  153:aastore         
	//   78  154:dup             
	//   79  155:bipush          7
	//   80  157:getstatic       #49  <Field SessionEvent$Type PREDEFINED>
	//   81  160:aastore         
	//   82  161:putstatic       #51  <Field SessionEvent$Type[] $VALUES>
	//*  83  164:return          
	}

	private SessionEvent$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #53  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
