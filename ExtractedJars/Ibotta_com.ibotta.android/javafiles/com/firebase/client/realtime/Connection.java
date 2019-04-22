// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;

import com.firebase.client.core.Context;
import com.firebase.client.core.RepoInfo;
import com.firebase.client.utilities.LogWrapper;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

public class Connection
	implements WebsocketConnection.Delegate
{
	public static interface Delegate
	{

		public abstract void onDataMessage(Map map);

		public abstract void onDisconnect(DisconnectReason disconnectreason);

		public abstract void onKill(String s);

		public abstract void onReady(long l, String s);
	}

	public static final class DisconnectReason extends Enum
	{

		public static DisconnectReason valueOf(String s)
		{
			return (DisconnectReason)Enum.valueOf(com/firebase/client/realtime/Connection$DisconnectReason, s);
		//    0    0:ldc1            #2   <Class Connection$DisconnectReason>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Connection$DisconnectReason>
		//    4    9:areturn         
		}

		public static DisconnectReason[] values()
		{
			return (DisconnectReason[])((DisconnectReason []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field Connection$DisconnectReason[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.realtime.Connection$DisconnectReason_3B_.clone()>
		//    2    6:checkcast       #38  <Class Connection$DisconnectReason[]>
		//    3    9:areturn         
		}

		private static final DisconnectReason $VALUES[];
		public static final DisconnectReason OTHER;
		public static final DisconnectReason SERVER_RESET;

		static 
		{
			SERVER_RESET = new DisconnectReason("SERVER_RESET", 0);
		//    0    0:new             #2   <Class Connection$DisconnectReason>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "SERVER_RESET">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void Connection$DisconnectReason(String, int)>
		//    5   10:putstatic       #22  <Field Connection$DisconnectReason SERVER_RESET>
			OTHER = new DisconnectReason("OTHER", 1);
		//    6   13:new             #2   <Class Connection$DisconnectReason>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "OTHER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void Connection$DisconnectReason(String, int)>
		//   11   23:putstatic       #25  <Field Connection$DisconnectReason OTHER>
			$VALUES = (new DisconnectReason[] {
				SERVER_RESET, OTHER
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       DisconnectReason[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field Connection$DisconnectReason SERVER_RESET>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field Connection$DisconnectReason OTHER>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field Connection$DisconnectReason[] $VALUES>
		//*  23   45:return          
		}

		private DisconnectReason(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static final class State extends Enum
	{

		public static State valueOf(String s)
		{
			return (State)Enum.valueOf(com/firebase/client/realtime/Connection$State, s);
		//    0    0:ldc1            #2   <Class Connection$State>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Connection$State>
		//    4    9:areturn         
		}

		public static State[] values()
		{
			return (State[])((State []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Connection$State[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.firebase.client.realtime.Connection$State_3B_.clone()>
		//    2    6:checkcast       #42  <Class Connection$State[]>
		//    3    9:areturn         
		}

		private static final State $VALUES[];
		public static final State REALTIME_CONNECTED;
		public static final State REALTIME_CONNECTING;
		public static final State REALTIME_DISCONNECTED;

		static 
		{
			REALTIME_CONNECTING = new State("REALTIME_CONNECTING", 0);
		//    0    0:new             #2   <Class Connection$State>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "REALTIME_CONNECTING">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Connection$State(String, int)>
		//    5   10:putstatic       #23  <Field Connection$State REALTIME_CONNECTING>
			REALTIME_CONNECTED = new State("REALTIME_CONNECTED", 1);
		//    6   13:new             #2   <Class Connection$State>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "REALTIME_CONNECTED">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Connection$State(String, int)>
		//   11   23:putstatic       #26  <Field Connection$State REALTIME_CONNECTED>
			REALTIME_DISCONNECTED = new State("REALTIME_DISCONNECTED", 2);
		//   12   26:new             #2   <Class Connection$State>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "REALTIME_DISCONNECTED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Connection$State(String, int)>
		//   17   36:putstatic       #29  <Field Connection$State REALTIME_DISCONNECTED>
			$VALUES = (new State[] {
				REALTIME_CONNECTING, REALTIME_CONNECTED, REALTIME_DISCONNECTED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       State[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Connection$State REALTIME_CONNECTING>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Connection$State REALTIME_CONNECTED>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Connection$State REALTIME_DISCONNECTED>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Connection$State[] $VALUES>
		//*  33   64:return          
		}

		private State(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Connection(Context context, RepoInfo repoinfo, Delegate delegate1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		long l = connectionIds;
	//    2    4:getstatic       #66  <Field long connectionIds>
	//    3    7:lstore          5
		connectionIds = 1L + l;
	//    4    9:lconst_1        
	//    5   10:lload           5
	//    6   12:ladd            
	//    7   13:putstatic       #66  <Field long connectionIds>
		repoInfo = repoinfo;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #68  <Field RepoInfo repoInfo>
		_flddelegate = delegate1;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #70  <Field Connection$Delegate _flddelegate>
		delegate1 = ((Delegate) (new StringBuilder()));
	//   14   26:new             #72  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #73  <Method void StringBuilder()>
	//   17   33:astore_3        
		((StringBuilder) (delegate1)).append("conn_");
	//   18   34:aload_3         
	//   19   35:ldc1            #75  <String "conn_">
	//   20   37:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		((StringBuilder) (delegate1)).append(l);
	//   22   41:aload_3         
	//   23   42:lload           5
	//   24   44:invokevirtual   #82  <Method StringBuilder StringBuilder.append(long)>
	//   25   47:pop             
		logger = context.getLogger("Connection", ((StringBuilder) (delegate1)).toString());
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:ldc1            #84  <String "Connection">
	//   29   52:aload_3         
	//   30   53:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   31   56:invokevirtual   #94  <Method LogWrapper Context.getLogger(String, String)>
	//   32   59:putfield        #96  <Field LogWrapper logger>
		state = State.REALTIME_CONNECTING;
	//   33   62:aload_0         
	//   34   63:getstatic       #99  <Field Connection$State Connection$State.REALTIME_CONNECTING>
	//   35   66:putfield        #101 <Field Connection$State state>
		conn = new WebsocketConnection(context, repoinfo, ((WebsocketConnection.Delegate) (this)), s);
	//   36   69:aload_0         
	//   37   70:new             #103 <Class WebsocketConnection>
	//   38   73:dup             
	//   39   74:aload_1         
	//   40   75:aload_2         
	//   41   76:aload_0         
	//   42   77:aload           4
	//   43   79:invokespecial   #106 <Method void WebsocketConnection(Context, RepoInfo, WebsocketConnection$Delegate, String)>
	//   44   82:putfield        #108 <Field WebsocketConnection conn>
	//   45   85:return          
	}

	private void onConnectionReady(long l, String s)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field LogWrapper logger>
	//*   2    4:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            19
			logger.debug("realtime connection established");
	//    4   10:aload_0         
	//    5   11:getfield        #96  <Field LogWrapper logger>
	//    6   14:ldc1            #118 <String "realtime connection established">
	//    7   16:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		state = State.REALTIME_CONNECTED;
	//    8   19:aload_0         
	//    9   20:getstatic       #125 <Field Connection$State Connection$State.REALTIME_CONNECTED>
	//   10   23:putfield        #101 <Field Connection$State state>
		_flddelegate.onReady(l, s);
	//   11   26:aload_0         
	//   12   27:getfield        #70  <Field Connection$Delegate _flddelegate>
	//   13   30:lload_1         
	//   14   31:aload_3         
	//   15   32:invokeinterface #128 <Method void Connection$Delegate.onReady(long, String)>
	//   16   37:return          
	}

	private void onConnectionShutdown(String s)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field LogWrapper logger>
	//*   2    4:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            19
			logger.debug("Connection shutdown command received. Shutting down...");
	//    4   10:aload_0         
	//    5   11:getfield        #96  <Field LogWrapper logger>
	//    6   14:ldc1            #131 <String "Connection shutdown command received. Shutting down...">
	//    7   16:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		_flddelegate.onKill(s);
	//    8   19:aload_0         
	//    9   20:getfield        #70  <Field Connection$Delegate _flddelegate>
	//   10   23:aload_1         
	//   11   24:invokeinterface #134 <Method void Connection$Delegate.onKill(String)>
		close();
	//   12   29:aload_0         
	//   13   30:invokevirtual   #137 <Method void close()>
	//   14   33:return          
	}

	private void onControlMessage(Map map)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field LogWrapper logger>
	//*   2    4:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            47
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #96  <Field LogWrapper logger>
	//    6   14:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #72  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #73  <Method void StringBuilder()>
	//   10   22:astore_3        
			stringbuilder.append("Got control message: ");
	//   11   23:aload_3         
	//   12   24:ldc1            #143 <String "Got control message: ">
	//   13   26:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(((Object) (map)).toString());
	//   15   30:aload_3         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #144 <Method String Object.toString()>
	//   18   35:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			logwrapper.debug(stringbuilder.toString());
	//   20   39:aload_2         
	//   21   40:aload_3         
	//   22   41:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   23   44:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		}
		String s = (String)map.get("t");
	//   24   47:aload_1         
	//   25   48:ldc1            #22  <String "t">
	//   26   50:invokeinterface #150 <Method Object Map.get(Object)>
	//   27   55:checkcast       #152 <Class String>
	//   28   58:astore_2        
		if(s == null)
			break MISSING_BLOCK_LABEL_183;
	//   29   59:aload_2         
	//   30   60:ifnull          183
		if(s.equals("s"))
	//*  31   63:aload_2         
	//*  32   64:ldc1            #36  <String "s">
	//*  33   66:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  34   69:ifeq            88
		{
			onConnectionShutdown((String)map.get("d"));
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:ldc1            #19  <String "d">
	//   38   76:invokeinterface #150 <Method Object Map.get(Object)>
	//   39   81:checkcast       #152 <Class String>
	//   40   84:invokespecial   #158 <Method void onConnectionShutdown(String)>
			return;
	//   41   87:return          
		}
		if(s.equals("r"))
	//*  42   88:aload_2         
	//*  43   89:ldc1            #33  <String "r">
	//*  44   91:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  45   94:ifeq            113
		{
			onReset((String)map.get("d"));
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #19  <String "d">
	//   49  101:invokeinterface #150 <Method Object Map.get(Object)>
	//   50  106:checkcast       #152 <Class String>
	//   51  109:invokespecial   #161 <Method void onReset(String)>
			return;
	//   52  112:return          
		}
		if(s.equals("h"))
	//*  53  113:aload_2         
	//*  54  114:ldc1            #30  <String "h">
	//*  55  116:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  56  119:ifeq            138
		{
			onHandshake((Map)map.get("d"));
	//   57  122:aload_0         
	//   58  123:aload_1         
	//   59  124:ldc1            #19  <String "d">
	//   60  126:invokeinterface #150 <Method Object Map.get(Object)>
	//   61  131:checkcast       #146 <Class Map>
	//   62  134:invokespecial   #164 <Method void onHandshake(Map)>
			return;
	//   63  137:return          
		}
		if(logger.logsDebug())
	//*  64  138:aload_0         
	//*  65  139:getfield        #96  <Field LogWrapper logger>
	//*  66  142:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*  67  145:ifeq            287
		{
			map = ((Map) (logger));
	//   68  148:aload_0         
	//   69  149:getfield        #96  <Field LogWrapper logger>
	//   70  152:astore_1        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   71  153:new             #72  <Class StringBuilder>
	//   72  156:dup             
	//   73  157:invokespecial   #73  <Method void StringBuilder()>
	//   74  160:astore_3        
			stringbuilder1.append("Ignoring unknown control message: ");
	//   75  161:aload_3         
	//   76  162:ldc1            #166 <String "Ignoring unknown control message: ">
	//   77  164:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   78  167:pop             
			stringbuilder1.append(s);
	//   79  168:aload_3         
	//   80  169:aload_2         
	//   81  170:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   82  173:pop             
			((LogWrapper) (map)).debug(stringbuilder1.toString());
	//   83  174:aload_1         
	//   84  175:aload_3         
	//   85  176:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   86  179:invokevirtual   #122 <Method void LogWrapper.debug(String)>
			return;
	//   87  182:return          
		}
		break MISSING_BLOCK_LABEL_287;
		try
		{
			if(logger.logsDebug())
	//*  88  183:aload_0         
	//*  89  184:getfield        #96  <Field LogWrapper logger>
	//*  90  187:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*  91  190:ifeq            230
			{
				LogWrapper logwrapper1 = logger;
	//   92  193:aload_0         
	//   93  194:getfield        #96  <Field LogWrapper logger>
	//   94  197:astore_2        
				StringBuilder stringbuilder2 = new StringBuilder();
	//   95  198:new             #72  <Class StringBuilder>
	//   96  201:dup             
	//   97  202:invokespecial   #73  <Method void StringBuilder()>
	//   98  205:astore_3        
				stringbuilder2.append("Got invalid control message: ");
	//   99  206:aload_3         
	//  100  207:ldc1            #168 <String "Got invalid control message: ">
	//  101  209:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  102  212:pop             
				stringbuilder2.append(((Object) (map)).toString());
	//  103  213:aload_3         
	//  104  214:aload_1         
	//  105  215:invokevirtual   #144 <Method String Object.toString()>
	//  106  218:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  107  221:pop             
				logwrapper1.debug(stringbuilder2.toString());
	//  108  222:aload_2         
	//  109  223:aload_3         
	//  110  224:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  111  227:invokevirtual   #122 <Method void LogWrapper.debug(String)>
			}
			close();
	//  112  230:aload_0         
	//  113  231:invokevirtual   #137 <Method void close()>
			return;
	//  114  234:return          
		}
		// Misplaced declaration of an exception variable
		catch(Map map) { }
	//  115  235:astore_1        
		if(logger.logsDebug())
	//* 116  236:aload_0         
	//* 117  237:getfield        #96  <Field LogWrapper logger>
	//* 118  240:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//* 119  243:ifeq            283
		{
			LogWrapper logwrapper2 = logger;
	//  120  246:aload_0         
	//  121  247:getfield        #96  <Field LogWrapper logger>
	//  122  250:astore_2        
			StringBuilder stringbuilder3 = new StringBuilder();
	//  123  251:new             #72  <Class StringBuilder>
	//  124  254:dup             
	//  125  255:invokespecial   #73  <Method void StringBuilder()>
	//  126  258:astore_3        
			stringbuilder3.append("Failed to parse control message: ");
	//  127  259:aload_3         
	//  128  260:ldc1            #170 <String "Failed to parse control message: ">
	//  129  262:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  130  265:pop             
			stringbuilder3.append(((ClassCastException) (map)).toString());
	//  131  266:aload_3         
	//  132  267:aload_1         
	//  133  268:invokevirtual   #171 <Method String ClassCastException.toString()>
	//  134  271:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  135  274:pop             
			logwrapper2.debug(stringbuilder3.toString());
	//  136  275:aload_2         
	//  137  276:aload_3         
	//  138  277:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  139  280:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		}
		close();
	//  140  283:aload_0         
	//  141  284:invokevirtual   #137 <Method void close()>
	//  142  287:return          
	}

	private void onDataMessage(Map map)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field LogWrapper logger>
	//*   2    4:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            47
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #96  <Field LogWrapper logger>
	//    6   14:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #72  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #73  <Method void StringBuilder()>
	//   10   22:astore_3        
			stringbuilder.append("received data message: ");
	//   11   23:aload_3         
	//   12   24:ldc1            #176 <String "received data message: ">
	//   13   26:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(((Object) (map)).toString());
	//   15   30:aload_3         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #144 <Method String Object.toString()>
	//   18   35:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			logwrapper.debug(stringbuilder.toString());
	//   20   39:aload_2         
	//   21   40:aload_3         
	//   22   41:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   23   44:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		}
		_flddelegate.onDataMessage(map);
	//   24   47:aload_0         
	//   25   48:getfield        #70  <Field Connection$Delegate _flddelegate>
	//   26   51:aload_1         
	//   27   52:invokeinterface #178 <Method void Connection$Delegate.onDataMessage(Map)>
	//   28   57:return          
	}

	private void onHandshake(Map map)
	{
		long l = ((Long)map.get("ts")).longValue();
	//    0    0:aload_1         
	//    1    1:ldc1            #45  <String "ts">
	//    2    3:invokeinterface #150 <Method Object Map.get(Object)>
	//    3    8:checkcast       #180 <Class Long>
	//    4   11:invokevirtual   #184 <Method long Long.longValue()>
	//    5   14:lstore_2        
		String s = (String)map.get("h");
	//    6   15:aload_1         
	//    7   16:ldc1            #30  <String "h">
	//    8   18:invokeinterface #150 <Method Object Map.get(Object)>
	//    9   23:checkcast       #152 <Class String>
	//   10   26:astore          4
		repoInfo.internalHost = s;
	//   11   28:aload_0         
	//   12   29:getfield        #68  <Field RepoInfo repoInfo>
	//   13   32:aload           4
	//   14   34:putfield        #189 <Field String RepoInfo.internalHost>
		map = ((Map) ((String)map.get("s")));
	//   15   37:aload_1         
	//   16   38:ldc1            #36  <String "s">
	//   17   40:invokeinterface #150 <Method Object Map.get(Object)>
	//   18   45:checkcast       #152 <Class String>
	//   19   48:astore_1        
		if(state == State.REALTIME_CONNECTING)
	//*  20   49:aload_0         
	//*  21   50:getfield        #101 <Field Connection$State state>
	//*  22   53:getstatic       #99  <Field Connection$State Connection$State.REALTIME_CONNECTING>
	//*  23   56:if_acmpne       72
		{
			conn.start();
	//   24   59:aload_0         
	//   25   60:getfield        #108 <Field WebsocketConnection conn>
	//   26   63:invokevirtual   #192 <Method void WebsocketConnection.start()>
			onConnectionReady(l, ((String) (map)));
	//   27   66:aload_0         
	//   28   67:lload_2         
	//   29   68:aload_1         
	//   30   69:invokespecial   #194 <Method void onConnectionReady(long, String)>
		}
	//   31   72:return          
	}

	private void onReset(String s)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field LogWrapper logger>
	//*   2    4:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            63
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #96  <Field LogWrapper logger>
	//    6   14:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #72  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #73  <Method void StringBuilder()>
	//   10   22:astore_3        
			stringbuilder.append("Got a reset; killing connection to ");
	//   11   23:aload_3         
	//   12   24:ldc1            #196 <String "Got a reset; killing connection to ">
	//   13   26:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(repoInfo.internalHost);
	//   15   30:aload_3         
	//   16   31:aload_0         
	//   17   32:getfield        #68  <Field RepoInfo repoInfo>
	//   18   35:getfield        #189 <Field String RepoInfo.internalHost>
	//   19   38:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			stringbuilder.append("; Updating internalHost to ");
	//   21   42:aload_3         
	//   22   43:ldc1            #198 <String "; Updating internalHost to ">
	//   23   45:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			stringbuilder.append(s);
	//   25   49:aload_3         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			logwrapper.debug(stringbuilder.toString());
	//   29   55:aload_2         
	//   30   56:aload_3         
	//   31   57:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   32   60:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		}
		repoInfo.internalHost = s;
	//   33   63:aload_0         
	//   34   64:getfield        #68  <Field RepoInfo repoInfo>
	//   35   67:aload_1         
	//   36   68:putfield        #189 <Field String RepoInfo.internalHost>
		close(DisconnectReason.SERVER_RESET);
	//   37   71:aload_0         
	//   38   72:getstatic       #202 <Field Connection$DisconnectReason Connection$DisconnectReason.SERVER_RESET>
	//   39   75:invokevirtual   #205 <Method void close(Connection$DisconnectReason)>
	//   40   78:return          
	}

	private void sendData(Map map)
	{
		if(state != State.REALTIME_CONNECTED)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Connection$State state>
	//*   2    4:getstatic       #125 <Field Connection$State Connection$State.REALTIME_CONNECTED>
	//*   3    7:if_acmpeq       30
		{
			if(logger.logsDebug())
	//*   4   10:aload_0         
	//*   5   11:getfield        #96  <Field LogWrapper logger>
	//*   6   14:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*   7   17:ifeq            85
			{
				logger.debug("Tried to send on an unconnected connection");
	//    8   20:aload_0         
	//    9   21:getfield        #96  <Field LogWrapper logger>
	//   10   24:ldc1            #208 <String "Tried to send on an unconnected connection">
	//   11   26:invokevirtual   #122 <Method void LogWrapper.debug(String)>
				return;
	//   12   29:return          
			}
		} else
		{
			if(logger.logsDebug())
	//*  13   30:aload_0         
	//*  14   31:getfield        #96  <Field LogWrapper logger>
	//*  15   34:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*  16   37:ifeq            77
			{
				LogWrapper logwrapper = logger;
	//   17   40:aload_0         
	//   18   41:getfield        #96  <Field LogWrapper logger>
	//   19   44:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   20   45:new             #72  <Class StringBuilder>
	//   21   48:dup             
	//   22   49:invokespecial   #73  <Method void StringBuilder()>
	//   23   52:astore_3        
				stringbuilder.append("Sending data: ");
	//   24   53:aload_3         
	//   25   54:ldc1            #210 <String "Sending data: ">
	//   26   56:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
				stringbuilder.append(((Object) (map)).toString());
	//   28   60:aload_3         
	//   29   61:aload_1         
	//   30   62:invokevirtual   #144 <Method String Object.toString()>
	//   31   65:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   32   68:pop             
				logwrapper.debug(stringbuilder.toString());
	//   33   69:aload_2         
	//   34   70:aload_3         
	//   35   71:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   36   74:invokevirtual   #122 <Method void LogWrapper.debug(String)>
			}
			conn.send(map);
	//   37   77:aload_0         
	//   38   78:getfield        #108 <Field WebsocketConnection conn>
	//   39   81:aload_1         
	//   40   82:invokevirtual   #213 <Method void WebsocketConnection.send(Map)>
		}
	//   41   85:return          
	}

	public void close()
	{
		close(DisconnectReason.OTHER);
	//    0    0:aload_0         
	//    1    1:getstatic       #216 <Field Connection$DisconnectReason Connection$DisconnectReason.OTHER>
	//    2    4:invokevirtual   #205 <Method void close(Connection$DisconnectReason)>
	//    3    7:return          
	}

	public void close(DisconnectReason disconnectreason)
	{
		if(state != State.REALTIME_DISCONNECTED)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Connection$State state>
	//*   2    4:getstatic       #219 <Field Connection$State Connection$State.REALTIME_DISCONNECTED>
	//*   3    7:if_acmpeq       64
		{
			if(logger.logsDebug())
	//*   4   10:aload_0         
	//*   5   11:getfield        #96  <Field LogWrapper logger>
	//*   6   14:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*   7   17:ifeq            29
				logger.debug("closing realtime connection");
	//    8   20:aload_0         
	//    9   21:getfield        #96  <Field LogWrapper logger>
	//   10   24:ldc1            #221 <String "closing realtime connection">
	//   11   26:invokevirtual   #122 <Method void LogWrapper.debug(String)>
			state = State.REALTIME_DISCONNECTED;
	//   12   29:aload_0         
	//   13   30:getstatic       #219 <Field Connection$State Connection$State.REALTIME_DISCONNECTED>
	//   14   33:putfield        #101 <Field Connection$State state>
			WebsocketConnection websocketconnection = conn;
	//   15   36:aload_0         
	//   16   37:getfield        #108 <Field WebsocketConnection conn>
	//   17   40:astore_2        
			if(websocketconnection != null)
	//*  18   41:aload_2         
	//*  19   42:ifnull          54
			{
				websocketconnection.close();
	//   20   45:aload_2         
	//   21   46:invokevirtual   #222 <Method void WebsocketConnection.close()>
				conn = null;
	//   22   49:aload_0         
	//   23   50:aconst_null     
	//   24   51:putfield        #108 <Field WebsocketConnection conn>
			}
			_flddelegate.onDisconnect(disconnectreason);
	//   25   54:aload_0         
	//   26   55:getfield        #70  <Field Connection$Delegate _flddelegate>
	//   27   58:aload_1         
	//   28   59:invokeinterface #225 <Method void Connection$Delegate.onDisconnect(Connection$DisconnectReason)>
		}
	//   29   64:return          
	}

	public void onDisconnect(boolean flag)
	{
		conn = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #108 <Field WebsocketConnection conn>
		if(!flag && state == State.REALTIME_CONNECTING)
	//*   3    5:iload_1         
	//*   4    6:ifne            49
	//*   5    9:aload_0         
	//*   6   10:getfield        #101 <Field Connection$State state>
	//*   7   13:getstatic       #99  <Field Connection$State Connection$State.REALTIME_CONNECTING>
	//*   8   16:if_acmpne       49
		{
			if(logger.logsDebug())
	//*   9   19:aload_0         
	//*  10   20:getfield        #96  <Field LogWrapper logger>
	//*  11   23:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*  12   26:ifeq            38
				logger.debug("Realtime connection failed");
	//   13   29:aload_0         
	//   14   30:getfield        #96  <Field LogWrapper logger>
	//   15   33:ldc1            #228 <String "Realtime connection failed">
	//   16   35:invokevirtual   #122 <Method void LogWrapper.debug(String)>
			repoInfo.isCacheableHost();
	//   17   38:aload_0         
	//   18   39:getfield        #68  <Field RepoInfo repoInfo>
	//   19   42:invokevirtual   #231 <Method boolean RepoInfo.isCacheableHost()>
	//   20   45:pop             
		} else
	//*  21   46:goto            68
		if(logger.logsDebug())
	//*  22   49:aload_0         
	//*  23   50:getfield        #96  <Field LogWrapper logger>
	//*  24   53:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*  25   56:ifeq            68
			logger.debug("Realtime connection lost");
	//   26   59:aload_0         
	//   27   60:getfield        #96  <Field LogWrapper logger>
	//   28   63:ldc1            #233 <String "Realtime connection lost">
	//   29   65:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		close();
	//   30   68:aload_0         
	//   31   69:invokevirtual   #137 <Method void close()>
	//   32   72:return          
	}

	public void onMessage(Map map)
	{
		String s = (String)map.get("t");
	//    0    0:aload_1         
	//    1    1:ldc1            #22  <String "t">
	//    2    3:invokeinterface #150 <Method Object Map.get(Object)>
	//    3    8:checkcast       #152 <Class String>
	//    4   11:astore_2        
		if(s == null)
			break MISSING_BLOCK_LABEL_111;
	//    5   12:aload_2         
	//    6   13:ifnull          111
		if(s.equals("d"))
	//*   7   16:aload_2         
	//*   8   17:ldc1            #19  <String "d">
	//*   9   19:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  10   22:ifeq            41
		{
			onDataMessage((Map)map.get("d"));
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:ldc1            #19  <String "d">
	//   14   29:invokeinterface #150 <Method Object Map.get(Object)>
	//   15   34:checkcast       #146 <Class Map>
	//   16   37:invokespecial   #235 <Method void onDataMessage(Map)>
			return;
	//   17   40:return          
		}
		if(s.equals("c"))
	//*  18   41:aload_2         
	//*  19   42:ldc1            #26  <String "c">
	//*  20   44:invokevirtual   #156 <Method boolean String.equals(Object)>
	//*  21   47:ifeq            66
		{
			onControlMessage((Map)map.get("d"));
	//   22   50:aload_0         
	//   23   51:aload_1         
	//   24   52:ldc1            #19  <String "d">
	//   25   54:invokeinterface #150 <Method Object Map.get(Object)>
	//   26   59:checkcast       #146 <Class Map>
	//   27   62:invokespecial   #237 <Method void onControlMessage(Map)>
			return;
	//   28   65:return          
		}
		if(logger.logsDebug())
	//*  29   66:aload_0         
	//*  30   67:getfield        #96  <Field LogWrapper logger>
	//*  31   70:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*  32   73:ifeq            215
		{
			map = ((Map) (logger));
	//   33   76:aload_0         
	//   34   77:getfield        #96  <Field LogWrapper logger>
	//   35   80:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   36   81:new             #72  <Class StringBuilder>
	//   37   84:dup             
	//   38   85:invokespecial   #73  <Method void StringBuilder()>
	//   39   88:astore_3        
			stringbuilder.append("Ignoring unknown server message type: ");
	//   40   89:aload_3         
	//   41   90:ldc1            #239 <String "Ignoring unknown server message type: ">
	//   42   92:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   43   95:pop             
			stringbuilder.append(s);
	//   44   96:aload_3         
	//   45   97:aload_2         
	//   46   98:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   47  101:pop             
			((LogWrapper) (map)).debug(stringbuilder.toString());
	//   48  102:aload_1         
	//   49  103:aload_3         
	//   50  104:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   51  107:invokevirtual   #122 <Method void LogWrapper.debug(String)>
			return;
	//   52  110:return          
		}
		break MISSING_BLOCK_LABEL_215;
		try
		{
			if(logger.logsDebug())
	//*  53  111:aload_0         
	//*  54  112:getfield        #96  <Field LogWrapper logger>
	//*  55  115:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*  56  118:ifeq            158
			{
				LogWrapper logwrapper = logger;
	//   57  121:aload_0         
	//   58  122:getfield        #96  <Field LogWrapper logger>
	//   59  125:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   60  126:new             #72  <Class StringBuilder>
	//   61  129:dup             
	//   62  130:invokespecial   #73  <Method void StringBuilder()>
	//   63  133:astore_3        
				stringbuilder1.append("Failed to parse server message: missing message type:");
	//   64  134:aload_3         
	//   65  135:ldc1            #241 <String "Failed to parse server message: missing message type:">
	//   66  137:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   67  140:pop             
				stringbuilder1.append(((Object) (map)).toString());
	//   68  141:aload_3         
	//   69  142:aload_1         
	//   70  143:invokevirtual   #144 <Method String Object.toString()>
	//   71  146:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   72  149:pop             
				logwrapper.debug(stringbuilder1.toString());
	//   73  150:aload_2         
	//   74  151:aload_3         
	//   75  152:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   76  155:invokevirtual   #122 <Method void LogWrapper.debug(String)>
			}
			close();
	//   77  158:aload_0         
	//   78  159:invokevirtual   #137 <Method void close()>
			return;
	//   79  162:return          
		}
		// Misplaced declaration of an exception variable
		catch(Map map) { }
	//   80  163:astore_1        
		if(logger.logsDebug())
	//*  81  164:aload_0         
	//*  82  165:getfield        #96  <Field LogWrapper logger>
	//*  83  168:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*  84  171:ifeq            211
		{
			LogWrapper logwrapper1 = logger;
	//   85  174:aload_0         
	//   86  175:getfield        #96  <Field LogWrapper logger>
	//   87  178:astore_2        
			StringBuilder stringbuilder2 = new StringBuilder();
	//   88  179:new             #72  <Class StringBuilder>
	//   89  182:dup             
	//   90  183:invokespecial   #73  <Method void StringBuilder()>
	//   91  186:astore_3        
			stringbuilder2.append("Failed to parse server message: ");
	//   92  187:aload_3         
	//   93  188:ldc1            #243 <String "Failed to parse server message: ">
	//   94  190:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   95  193:pop             
			stringbuilder2.append(((ClassCastException) (map)).toString());
	//   96  194:aload_3         
	//   97  195:aload_1         
	//   98  196:invokevirtual   #171 <Method String ClassCastException.toString()>
	//   99  199:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//  100  202:pop             
			logwrapper1.debug(stringbuilder2.toString());
	//  101  203:aload_2         
	//  102  204:aload_3         
	//  103  205:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  104  208:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		}
		close();
	//  105  211:aload_0         
	//  106  212:invokevirtual   #137 <Method void close()>
	//  107  215:return          
	}

	public void open()
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field LogWrapper logger>
	//*   2    4:invokevirtual   #116 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            19
			logger.debug("Opening a connection");
	//    4   10:aload_0         
	//    5   11:getfield        #96  <Field LogWrapper logger>
	//    6   14:ldc1            #246 <String "Opening a connection">
	//    7   16:invokevirtual   #122 <Method void LogWrapper.debug(String)>
		conn.open();
	//    8   19:aload_0         
	//    9   20:getfield        #108 <Field WebsocketConnection conn>
	//   10   23:invokevirtual   #248 <Method void WebsocketConnection.open()>
	//   11   26:return          
	}

	public void sendRequest(Map map)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #251 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #252 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("t", "d");
	//    4    8:aload_2         
	//    5    9:ldc1            #22  <String "t">
	//    6   11:ldc1            #19  <String "d">
	//    7   13:invokeinterface #256 <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("d", ((Object) (map)));
	//    9   19:aload_2         
	//   10   20:ldc1            #19  <String "d">
	//   11   22:aload_1         
	//   12   23:invokeinterface #256 <Method Object Map.put(Object, Object)>
	//   13   28:pop             
		sendData(((Map) (hashmap)));
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:invokespecial   #258 <Method void sendData(Map)>
	//   17   34:return          
	}

	private static final String REQUEST_PAYLOAD = "d";
	private static final String REQUEST_TYPE = "t";
	private static final String REQUEST_TYPE_DATA = "d";
	private static final String SERVER_CONTROL_MESSAGE = "c";
	private static final String SERVER_CONTROL_MESSAGE_DATA = "d";
	private static final String SERVER_CONTROL_MESSAGE_HELLO = "h";
	private static final String SERVER_CONTROL_MESSAGE_RESET = "r";
	private static final String SERVER_CONTROL_MESSAGE_SHUTDOWN = "s";
	private static final String SERVER_CONTROL_MESSAGE_TYPE = "t";
	private static final String SERVER_DATA_MESSAGE = "d";
	private static final String SERVER_ENVELOPE_DATA = "d";
	private static final String SERVER_ENVELOPE_TYPE = "t";
	private static final String SERVER_HELLO_HOST = "h";
	private static final String SERVER_HELLO_SESSION_ID = "s";
	private static final String SERVER_HELLO_TIMESTAMP = "ts";
	private static long connectionIds;
	private WebsocketConnection conn;
	private Delegate _flddelegate;
	private LogWrapper logger;
	private RepoInfo repoInfo;
	private State state;

	static 
	{
	//    0    0:return          
	}
}
