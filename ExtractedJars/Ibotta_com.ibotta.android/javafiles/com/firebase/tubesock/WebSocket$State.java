// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;


// Referenced classes of package com.firebase.tubesock:
//			WebSocket

private static final class WebSocket$State extends Enum
{

	public static WebSocket$State valueOf(String s)
	{
		return (WebSocket$State)Enum.valueOf(com/firebase/tubesock/WebSocket$State, s);
	//    0    0:ldc1            #2   <Class WebSocket$State>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class WebSocket$State>
	//    4    9:areturn         
	}

	public static WebSocket$State[] values()
	{
		return (WebSocket$State[])((WebSocket$State []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field WebSocket$State[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.firebase.tubesock.WebSocket$State_3B_.clone()>
	//    2    6:checkcast       #50  <Class WebSocket$State[]>
	//    3    9:areturn         
	}

	private static final WebSocket$State $VALUES[];
	public static final WebSocket$State CONNECTED;
	public static final WebSocket$State CONNECTING;
	public static final WebSocket$State DISCONNECTED;
	public static final WebSocket$State DISCONNECTING;
	public static final WebSocket$State NONE;

	static 
	{
		NONE = new WebSocket$State("NONE", 0);
	//    0    0:new             #2   <Class WebSocket$State>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void WebSocket$State(String, int)>
	//    5   10:putstatic       #25  <Field WebSocket$State NONE>
		CONNECTING = new WebSocket$State("CONNECTING", 1);
	//    6   13:new             #2   <Class WebSocket$State>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "CONNECTING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void WebSocket$State(String, int)>
	//   11   23:putstatic       #28  <Field WebSocket$State CONNECTING>
		CONNECTED = new WebSocket$State("CONNECTED", 2);
	//   12   26:new             #2   <Class WebSocket$State>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "CONNECTED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void WebSocket$State(String, int)>
	//   17   36:putstatic       #31  <Field WebSocket$State CONNECTED>
		DISCONNECTING = new WebSocket$State("DISCONNECTING", 3);
	//   18   39:new             #2   <Class WebSocket$State>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "DISCONNECTING">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void WebSocket$State(String, int)>
	//   23   49:putstatic       #34  <Field WebSocket$State DISCONNECTING>
		DISCONNECTED = new WebSocket$State("DISCONNECTED", 4);
	//   24   52:new             #2   <Class WebSocket$State>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "DISCONNECTED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void WebSocket$State(String, int)>
	//   29   62:putstatic       #37  <Field WebSocket$State DISCONNECTED>
		$VALUES = (new WebSocket$State[] {
			NONE, CONNECTING, CONNECTED, DISCONNECTING, DISCONNECTED
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       WebSocket$State[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field WebSocket$State NONE>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field WebSocket$State CONNECTING>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field WebSocket$State CONNECTED>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field WebSocket$State DISCONNECTING>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field WebSocket$State DISCONNECTED>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field WebSocket$State[] $VALUES>
	//*  53  102:return          
	}

	private WebSocket$State(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
