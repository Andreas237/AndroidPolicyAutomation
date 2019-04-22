// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.*;
import com.firebase.client.core.view.QueryParams;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.realtime.Connection;
import com.firebase.client.snapshot.Index;
import com.firebase.client.snapshot.NodeUtilities;
import com.firebase.client.utilities.LogWrapper;
import com.firebase.client.utilities.Utilities;
import java.util.*;
import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.firebase.client.core:
//			Context, Constants, Tag, Path, 
//			RangeMerge, AndroidSupport, CompoundHash, RepoInfo

public class PersistentConnection
	implements com.firebase.client.realtime.Connection.Delegate
{
	private static class AuthCredential
	{

		public void addListener(com.firebase.client.Firebase.AuthListener authlistener)
		{
			listeners.add(((Object) (authlistener)));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field List listeners>
		//    2    4:aload_1         
		//    3    5:invokeinterface #38  <Method boolean List.add(Object)>
		//    4   10:pop             
		//    5   11:return          
		}

		public String getCredential()
		{
			return credential;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String credential>
		//    2    4:areturn         
		}

		public boolean isComplete()
		{
			return onSuccessCalled;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field boolean onSuccessCalled>
		//    2    4:ireturn         
		}

		public boolean matches(String s)
		{
			return credential.equals(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String credential>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #53  <Method boolean String.equals(Object)>
		//    4    8:ireturn         
		}

		public void onCancel(FirebaseError firebaseerror)
		{
			if(onSuccessCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean onSuccessCalled>
		//*   2    4:ifeq            13
			{
				onRevoked(firebaseerror);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokevirtual   #58  <Method void onRevoked(FirebaseError)>
				return;
		//    6   12:return          
			}
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((com.firebase.client.Firebase.AuthListener)iterator.next()).onAuthError(firebaseerror));
		//    7   13:aload_0         
		//    8   14:getfield        #32  <Field List listeners>
		//    9   17:invokeinterface #62  <Method Iterator List.iterator()>
		//   10   22:astore_2        
		//   11   23:aload_2         
		//   12   24:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//   13   29:ifeq            50
		//   14   32:aload_2         
		//   15   33:invokeinterface #71  <Method Object Iterator.next()>
		//   16   38:checkcast       #73  <Class com.firebase.client.Firebase$AuthListener>
		//   17   41:aload_1         
		//   18   42:invokeinterface #76  <Method void com.firebase.client.Firebase$AuthListener.onAuthError(FirebaseError)>
		//*  19   47:goto            23
		//   20   50:return          
		}

		public void onRevoked(FirebaseError firebaseerror)
		{
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((com.firebase.client.Firebase.AuthListener)iterator.next()).onAuthRevoked(firebaseerror));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field List listeners>
		//    2    4:invokeinterface #62  <Method Iterator List.iterator()>
		//    3    9:astore_2        
		//    4   10:aload_2         
		//    5   11:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//    6   16:ifeq            37
		//    7   19:aload_2         
		//    8   20:invokeinterface #71  <Method Object Iterator.next()>
		//    9   25:checkcast       #73  <Class com.firebase.client.Firebase$AuthListener>
		//   10   28:aload_1         
		//   11   29:invokeinterface #79  <Method void com.firebase.client.Firebase$AuthListener.onAuthRevoked(FirebaseError)>
		//*  12   34:goto            10
		//   13   37:return          
		}

		public void onSuccess(Object obj)
		{
			if(!onSuccessCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean onSuccessCalled>
		//*   2    4:ifne            54
			{
				onSuccessCalled = true;
		//    3    7:aload_0         
		//    4    8:iconst_1        
		//    5    9:putfield        #27  <Field boolean onSuccessCalled>
				authData = obj;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:putfield        #83  <Field Object authData>
				for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((com.firebase.client.Firebase.AuthListener)iterator.next()).onAuthSuccess(obj));
		//    9   17:aload_0         
		//   10   18:getfield        #32  <Field List listeners>
		//   11   21:invokeinterface #62  <Method Iterator List.iterator()>
		//   12   26:astore_2        
		//   13   27:aload_2         
		//   14   28:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//   15   33:ifeq            54
		//   16   36:aload_2         
		//   17   37:invokeinterface #71  <Method Object Iterator.next()>
		//   18   42:checkcast       #73  <Class com.firebase.client.Firebase$AuthListener>
		//   19   45:aload_1         
		//   20   46:invokeinterface #86  <Method void com.firebase.client.Firebase$AuthListener.onAuthSuccess(Object)>
			}
		//*  21   51:goto            27
		//   22   54:return          
		}

		public void preempt()
		{
			FirebaseError firebaseerror = FirebaseError.fromStatus("preempted");
		//    0    0:ldc1            #89  <String "preempted">
		//    1    2:invokestatic    #95  <Method FirebaseError FirebaseError.fromStatus(String)>
		//    2    5:astore_1        
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((com.firebase.client.Firebase.AuthListener)iterator.next()).onAuthError(firebaseerror));
		//    3    6:aload_0         
		//    4    7:getfield        #32  <Field List listeners>
		//    5   10:invokeinterface #62  <Method Iterator List.iterator()>
		//    6   15:astore_2        
		//    7   16:aload_2         
		//    8   17:invokeinterface #67  <Method boolean Iterator.hasNext()>
		//    9   22:ifeq            43
		//   10   25:aload_2         
		//   11   26:invokeinterface #71  <Method Object Iterator.next()>
		//   12   31:checkcast       #73  <Class com.firebase.client.Firebase$AuthListener>
		//   13   34:aload_1         
		//   14   35:invokeinterface #76  <Method void com.firebase.client.Firebase$AuthListener.onAuthError(FirebaseError)>
		//*  15   40:goto            16
		//   16   43:return          
		}

		public void replay(com.firebase.client.Firebase.AuthListener authlistener)
		{
			authlistener.onAuthSuccess(authData);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #83  <Field Object authData>
		//    3    5:invokeinterface #86  <Method void com.firebase.client.Firebase$AuthListener.onAuthSuccess(Object)>
		//    4   10:return          
		}

		static final boolean $assertionsDisabled = false;
		private Object authData;
		private String credential;
		private List listeners;
		private boolean onSuccessCalled;

		static 
		{
		//    0    0:return          
		}

		AuthCredential(com.firebase.client.Firebase.AuthListener authlistener, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			onSuccessCalled = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #27  <Field boolean onSuccessCalled>
			listeners = ((List) (new ArrayList()));
		//    5    9:aload_0         
		//    6   10:new             #29  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #30  <Method void ArrayList()>
		//    9   17:putfield        #32  <Field List listeners>
			listeners.add(((Object) (authlistener)));
		//   10   20:aload_0         
		//   11   21:getfield        #32  <Field List listeners>
		//   12   24:aload_1         
		//   13   25:invokeinterface #38  <Method boolean List.add(Object)>
		//   14   30:pop             
			credential = s;
		//   15   31:aload_0         
		//   16   32:aload_2         
		//   17   33:putfield        #40  <Field String credential>
		//   18   36:return          
		}
	}

	private static final class ConnectionState extends Enum
	{

		public static ConnectionState valueOf(String s)
		{
			return (ConnectionState)Enum.valueOf(com/firebase/client/core/PersistentConnection$ConnectionState, s);
		//    0    0:ldc1            #2   <Class PersistentConnection$ConnectionState>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PersistentConnection$ConnectionState>
		//    4    9:areturn         
		}

		public static ConnectionState[] values()
		{
			return (ConnectionState[])((ConnectionState []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field PersistentConnection$ConnectionState[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.firebase.client.core.PersistentConnection$ConnectionState_3B_.clone()>
		//    2    6:checkcast       #42  <Class PersistentConnection$ConnectionState[]>
		//    3    9:areturn         
		}

		private static final ConnectionState $VALUES[];
		public static final ConnectionState Authenticating;
		public static final ConnectionState Connected;
		public static final ConnectionState Disconnected;

		static 
		{
			Disconnected = new ConnectionState("Disconnected", 0);
		//    0    0:new             #2   <Class PersistentConnection$ConnectionState>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "Disconnected">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void PersistentConnection$ConnectionState(String, int)>
		//    5   10:putstatic       #23  <Field PersistentConnection$ConnectionState Disconnected>
			Authenticating = new ConnectionState("Authenticating", 1);
		//    6   13:new             #2   <Class PersistentConnection$ConnectionState>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "Authenticating">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void PersistentConnection$ConnectionState(String, int)>
		//   11   23:putstatic       #26  <Field PersistentConnection$ConnectionState Authenticating>
			Connected = new ConnectionState("Connected", 2);
		//   12   26:new             #2   <Class PersistentConnection$ConnectionState>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "Connected">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void PersistentConnection$ConnectionState(String, int)>
		//   17   36:putstatic       #29  <Field PersistentConnection$ConnectionState Connected>
			$VALUES = (new ConnectionState[] {
				Disconnected, Authenticating, Connected
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       ConnectionState[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field PersistentConnection$ConnectionState Disconnected>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field PersistentConnection$ConnectionState Authenticating>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field PersistentConnection$ConnectionState Connected>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field PersistentConnection$ConnectionState[] $VALUES>
		//*  33   64:return          
		}

		private ConnectionState(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static interface Delegate
	{

		public abstract void onAuthStatus(boolean flag);

		public abstract void onConnect();

		public abstract void onDataUpdate(String s, Object obj, boolean flag, Tag tag);

		public abstract void onDisconnect();

		public abstract void onRangeMergeUpdate(Path path, List list, Tag tag);

		public abstract void onServerInfoUpdate(Map map);
	}

	private static class OutstandingDisconnect
	{

		public String getAction()
		{
			return action;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String action>
		//    2    4:areturn         
		}

		public Object getData()
		{
			return data;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Object data>
		//    2    4:areturn         
		}

		public com.firebase.client.Firebase.CompletionListener getOnComplete()
		{
			return onComplete;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field com.firebase.client.Firebase$CompletionListener onComplete>
		//    2    4:areturn         
		}

		public Path getPath()
		{
			return path;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Path path>
		//    2    4:areturn         
		}

		private final String action;
		private final Object data;
		private final com.firebase.client.Firebase.CompletionListener onComplete;
		private final Path path;


/*
		static com.firebase.client.Firebase.CompletionListener access$200(OutstandingDisconnect outstandingdisconnect)
		{
			return outstandingdisconnect.onComplete;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field com.firebase.client.Firebase$CompletionListener onComplete>
		//    2    4:areturn         
		}

*/

		private OutstandingDisconnect(String s, Path path1, Object obj, com.firebase.client.Firebase.CompletionListener completionlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			action = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field String action>
			path = path1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Path path>
			data = obj;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field Object data>
			onComplete = completionlistener;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #28  <Field com.firebase.client.Firebase$CompletionListener onComplete>
		//   14   25:return          
		}

	}

	static class OutstandingListen
	{

		public SyncTree.SyncTreeHash getHashFunction()
		{
			return hashFunction;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field SyncTree$SyncTreeHash hashFunction>
		//    2    4:areturn         
		}

		public QuerySpec getQuery()
		{
			return query;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field QuerySpec query>
		//    2    4:areturn         
		}

		public Tag getTag()
		{
			return tag;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Tag tag>
		//    2    4:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #46  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #47  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(query.toString());
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #24  <Field QuerySpec query>
		//    7   13:invokevirtual   #51  <Method String QuerySpec.toString()>
		//    8   16:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//    9   19:pop             
			stringbuilder.append(" (Tag: ");
		//   10   20:aload_1         
		//   11   21:ldc1            #57  <String " (Tag: ">
		//   12   23:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(((Object) (tag)));
		//   14   27:aload_1         
		//   15   28:aload_0         
		//   16   29:getfield        #28  <Field Tag tag>
		//   17   32:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
		//   18   35:pop             
			stringbuilder.append(")");
		//   19   36:aload_1         
		//   20   37:ldc1            #62  <String ")">
		//   21   39:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   22   42:pop             
			return stringbuilder.toString();
		//   23   43:aload_1         
		//   24   44:invokevirtual   #63  <Method String StringBuilder.toString()>
		//   25   47:areturn         
		}

		private final SyncTree.SyncTreeHash hashFunction;
		private final QuerySpec query;
		private final RequestResultListener resultListener;
		private final Tag tag;


/*
		static QuerySpec access$400(OutstandingListen outstandinglisten)
		{
			return outstandinglisten.query;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field QuerySpec query>
		//    2    4:areturn         
		}

*/


/*
		static RequestResultListener access$500(OutstandingListen outstandinglisten)
		{
			return outstandinglisten.resultListener;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field PersistentConnection$RequestResultListener resultListener>
		//    2    4:areturn         
		}

*/

		private OutstandingListen(RequestResultListener requestresultlistener, QuerySpec queryspec, Tag tag1, SyncTree.SyncTreeHash synctreehash)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			resultListener = requestresultlistener;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field PersistentConnection$RequestResultListener resultListener>
			query = queryspec;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field QuerySpec query>
			hashFunction = synctreehash;
		//    8   14:aload_0         
		//    9   15:aload           4
		//   10   17:putfield        #26  <Field SyncTree$SyncTreeHash hashFunction>
			tag = tag1;
		//   11   20:aload_0         
		//   12   21:aload_3         
		//   13   22:putfield        #28  <Field Tag tag>
		//   14   25:return          
		}

	}

	private static class OutstandingPut
	{

		public String getAction()
		{
			return action;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String action>
		//    2    4:areturn         
		}

		public com.firebase.client.Firebase.CompletionListener getOnComplete()
		{
			return onComplete;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field com.firebase.client.Firebase$CompletionListener onComplete>
		//    2    4:areturn         
		}

		public Map getRequest()
		{
			return request;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Map request>
		//    2    4:areturn         
		}

		private String action;
		private com.firebase.client.Firebase.CompletionListener onComplete;
		private Map request;


/*
		static com.firebase.client.Firebase.CompletionListener access$100(OutstandingPut outstandingput)
		{
			return outstandingput.onComplete;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field com.firebase.client.Firebase$CompletionListener onComplete>
		//    2    4:areturn         
		}

*/

		private OutstandingPut(String s, Map map, com.firebase.client.Firebase.CompletionListener completionlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			action = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field String action>
			request = map;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Map request>
			onComplete = completionlistener;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #25  <Field com.firebase.client.Firebase$CompletionListener onComplete>
		//   11   19:return          
		}

	}

	static interface RequestResultListener
	{

		public abstract void onRequestResult(FirebaseError firebaseerror);
	}

	private static interface ResponseListener
	{

		public abstract void onResponse(Map map);
	}


	public PersistentConnection(Context context, RepoInfo repoinfo, Delegate delegate1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void Object()>
		shouldReconnect = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #209 <Field boolean shouldReconnect>
		firstConnection = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #211 <Field boolean firstConnection>
		connectionState = ConnectionState.Disconnected;
	//    8   14:aload_0         
	//    9   15:getstatic       #214 <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Disconnected>
	//   10   18:putfield        #216 <Field PersistentConnection$ConnectionState connectionState>
		writeCounter = 0L;
	//   11   21:aload_0         
	//   12   22:lconst_0        
	//   13   23:putfield        #218 <Field long writeCounter>
		requestCounter = 0L;
	//   14   26:aload_0         
	//   15   27:lconst_0        
	//   16   28:putfield        #220 <Field long requestCounter>
		reconnectDelay = 1000L;
	//   17   31:aload_0         
	//   18   32:ldc2w           #53  <Long 1000L>
	//   19   35:putfield        #222 <Field long reconnectDelay>
		_flddelegate = delegate1;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:putfield        #224 <Field PersistentConnection$Delegate _flddelegate>
		ctx = context;
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:putfield        #226 <Field Context ctx>
		repoInfo = repoinfo;
	//   26   48:aload_0         
	//   27   49:aload_2         
	//   28   50:putfield        #228 <Field RepoInfo repoInfo>
		listens = ((Map) (new HashMap()));
	//   29   53:aload_0         
	//   30   54:new             #230 <Class HashMap>
	//   31   57:dup             
	//   32   58:invokespecial   #231 <Method void HashMap()>
	//   33   61:putfield        #233 <Field Map listens>
		requestCBHash = ((Map) (new HashMap()));
	//   34   64:aload_0         
	//   35   65:new             #230 <Class HashMap>
	//   36   68:dup             
	//   37   69:invokespecial   #231 <Method void HashMap()>
	//   38   72:putfield        #235 <Field Map requestCBHash>
		writesPaused = false;
	//   39   75:aload_0         
	//   40   76:iconst_0        
	//   41   77:putfield        #237 <Field boolean writesPaused>
		outstandingPuts = ((Map) (new HashMap()));
	//   42   80:aload_0         
	//   43   81:new             #230 <Class HashMap>
	//   44   84:dup             
	//   45   85:invokespecial   #231 <Method void HashMap()>
	//   46   88:putfield        #239 <Field Map outstandingPuts>
		onDisconnectRequestQueue = ((List) (new ArrayList()));
	//   47   91:aload_0         
	//   48   92:new             #241 <Class ArrayList>
	//   49   95:dup             
	//   50   96:invokespecial   #242 <Method void ArrayList()>
	//   51   99:putfield        #244 <Field List onDisconnectRequestQueue>
		random = new Random();
	//   52  102:aload_0         
	//   53  103:new             #246 <Class Random>
	//   54  106:dup             
	//   55  107:invokespecial   #247 <Method void Random()>
	//   56  110:putfield        #249 <Field Random random>
		long l = connectionIds;
	//   57  113:getstatic       #251 <Field long connectionIds>
	//   58  116:lstore          4
		connectionIds = 1L + l;
	//   59  118:lconst_1        
	//   60  119:lload           4
	//   61  121:ladd            
	//   62  122:putstatic       #251 <Field long connectionIds>
		context = ctx;
	//   63  125:aload_0         
	//   64  126:getfield        #226 <Field Context ctx>
	//   65  129:astore_1        
		repoinfo = ((RepoInfo) (new StringBuilder()));
	//   66  130:new             #253 <Class StringBuilder>
	//   67  133:dup             
	//   68  134:invokespecial   #254 <Method void StringBuilder()>
	//   69  137:astore_2        
		((StringBuilder) (repoinfo)).append("pc_");
	//   70  138:aload_2         
	//   71  139:ldc2            #256 <String "pc_">
	//   72  142:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   73  145:pop             
		((StringBuilder) (repoinfo)).append(l);
	//   74  146:aload_2         
	//   75  147:lload           4
	//   76  149:invokevirtual   #263 <Method StringBuilder StringBuilder.append(long)>
	//   77  152:pop             
		logger = context.getLogger("PersistentConnection", ((StringBuilder) (repoinfo)).toString());
	//   78  153:aload_0         
	//   79  154:aload_1         
	//   80  155:ldc2            #265 <String "PersistentConnection">
	//   81  158:aload_2         
	//   82  159:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   83  162:invokevirtual   #275 <Method LogWrapper Context.getLogger(String, String)>
	//   84  165:putfield        #277 <Field LogWrapper logger>
		lastSessionId = null;
	//   85  168:aload_0         
	//   86  169:aconst_null     
	//   87  170:putfield        #279 <Field String lastSessionId>
	//   88  173:return          
	}

	private boolean canSendWrites()
	{
		return connectionState == ConnectionState.Connected && !writesPaused;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field PersistentConnection$ConnectionState connectionState>
	//    2    4:getstatic       #316 <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Connected>
	//    3    7:if_acmpne       19
	//    4   10:aload_0         
	//    5   11:getfield        #237 <Field boolean writesPaused>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private void cancelTransactions()
	{
		Iterator iterator = outstandingPuts.entrySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field Map outstandingPuts>
	//    2    4:invokeinterface #323 <Method Set Map.entrySet()>
	//    3    9:invokeinterface #329 <Method Iterator Set.iterator()>
	//    4   14:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   15:aload_1         
	//    6   16:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            81
			OutstandingPut outstandingput = (OutstandingPut)((java.util.Map.Entry)iterator.next()).getValue();
	//    8   24:aload_1         
	//    9   25:invokeinterface #338 <Method Object Iterator.next()>
	//   10   30:checkcast       #340 <Class java.util.Map$Entry>
	//   11   33:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//   12   38:checkcast       #37  <Class PersistentConnection$OutstandingPut>
	//   13   41:astore_2        
			if(outstandingput.getRequest().containsKey("h"))
	//*  14   42:aload_2         
	//*  15   43:invokevirtual   #347 <Method Map PersistentConnection$OutstandingPut.getRequest()>
	//*  16   46:ldc1            #117 <String "h">
	//*  17   48:invokeinterface #351 <Method boolean Map.containsKey(Object)>
	//*  18   53:ifeq            15
			{
				outstandingput.getOnComplete().onComplete(FirebaseError.fromStatus("disconnected"), ((Firebase) (null)));
	//   19   56:aload_2         
	//   20   57:invokevirtual   #355 <Method com.firebase.client.Firebase$CompletionListener PersistentConnection$OutstandingPut.getOnComplete()>
	//   21   60:ldc2            #357 <String "disconnected">
	//   22   63:invokestatic    #363 <Method FirebaseError FirebaseError.fromStatus(String)>
	//   23   66:aconst_null     
	//   24   67:invokeinterface #369 <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
				iterator.remove();
	//   25   72:aload_1         
	//   26   73:invokeinterface #372 <Method void Iterator.remove()>
			}
		} while(true);
	//   27   78:goto            15
	//   28   81:return          
	}

	private boolean connected()
	{
		return connectionState != ConnectionState.Disconnected;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field PersistentConnection$ConnectionState connectionState>
	//    2    4:getstatic       #214 <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Disconnected>
	//    3    7:if_acmpeq       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private Map getPutObject(String s, Object obj, String s1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #230 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void HashMap()>
	//    3    7:astore          4
		((Map) (hashmap)).put("p", ((Object) (s)));
	//    4    9:aload           4
	//    5   11:ldc1            #84  <String "p">
	//    6   13:aload_1         
	//    7   14:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//    8   19:pop             
		((Map) (hashmap)).put("d", obj);
	//    9   20:aload           4
	//   10   22:ldc1            #120 <String "d">
	//   11   24:aload_2         
	//   12   25:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   13   30:pop             
		if(s1 != null)
	//*  14   31:aload_3         
	//*  15   32:ifnull          46
			((Map) (hashmap)).put("h", ((Object) (s1)));
	//   16   35:aload           4
	//   17   37:ldc1            #117 <String "h">
	//   18   39:aload_3         
	//   19   40:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   20   45:pop             
		return ((Map) (hashmap));
	//   21   46:aload           4
	//   22   48:areturn         
	}

	private void handleTimestamp(long l)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            20
			logger.debug("handling timestamp");
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:ldc2            #390 <String "handling timestamp">
	//    7   17:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		long l1 = System.currentTimeMillis();
	//    8   20:invokestatic    #400 <Method long System.currentTimeMillis()>
	//    9   23:lstore_3        
		HashMap hashmap = new HashMap();
	//   10   24:new             #230 <Class HashMap>
	//   11   27:dup             
	//   12   28:invokespecial   #231 <Method void HashMap()>
	//   13   31:astore          5
		((Map) (hashmap)).put(((Object) (Constants.DOT_INFO_SERVERTIME_OFFSET)), ((Object) (Long.valueOf(l - l1))));
	//   14   33:aload           5
	//   15   35:getstatic       #406 <Field com.firebase.client.snapshot.ChildKey Constants.DOT_INFO_SERVERTIME_OFFSET>
	//   16   38:lload_1         
	//   17   39:lload_3         
	//   18   40:lsub            
	//   19   41:invokestatic    #412 <Method Long Long.valueOf(long)>
	//   20   44:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   21   49:pop             
		_flddelegate.onServerInfoUpdate(((Map) (hashmap)));
	//   22   50:aload_0         
	//   23   51:getfield        #224 <Field PersistentConnection$Delegate _flddelegate>
	//   24   54:aload           5
	//   25   56:invokeinterface #416 <Method void PersistentConnection$Delegate.onServerInfoUpdate(Map)>
	//   26   61:return          
	}

	private long nextRequestNumber()
	{
		long l = requestCounter;
	//    0    0:aload_0         
	//    1    1:getfield        #220 <Field long requestCounter>
	//    2    4:lstore_1        
		requestCounter = 1L + l;
	//    3    5:aload_0         
	//    4    6:lconst_1        
	//    5    7:lload_1         
	//    6    8:ladd            
	//    7    9:putfield        #220 <Field long requestCounter>
		return l;
	//    8   12:lload_1         
	//    9   13:lreturn         
	}

	private void onAuthRevoked(String s, String s1)
	{
		if(authCredential != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//*   2    4:ifnull          26
		{
			s = ((String) (FirebaseError.fromStatus(s, s1)));
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #422 <Method FirebaseError FirebaseError.fromStatus(String, String)>
	//    6   12:astore_1        
			authCredential.onRevoked(((FirebaseError) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #426 <Method void PersistentConnection$AuthCredential.onRevoked(FirebaseError)>
			authCredential = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #302 <Field PersistentConnection$AuthCredential authCredential>
		}
	//   14   26:return          
	}

	private void onDataPush(String s, Map map)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            67
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #253 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #254 <Method void StringBuilder()>
	//   10   23:astore          5
			stringbuilder.append("handleServerMessage: ");
	//   11   25:aload           5
	//   12   27:ldc2            #430 <String "handleServerMessage: ">
	//   13   30:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
			stringbuilder.append(s);
	//   15   34:aload           5
	//   16   36:aload_1         
	//   17   37:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			stringbuilder.append(" ");
	//   19   41:aload           5
	//   20   43:ldc2            #432 <String " ">
	//   21   46:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
			stringbuilder.append(((Object) (map)));
	//   23   50:aload           5
	//   24   52:aload_2         
	//   25   53:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:pop             
			logwrapper.debug(stringbuilder.toString());
	//   27   57:aload           4
	//   28   59:aload           5
	//   29   61:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   30   64:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		boolean flag = s.equals("d");
	//   31   67:aload_1         
	//   32   68:ldc1            #120 <String "d">
	//   33   70:invokevirtual   #440 <Method boolean String.equals(Object)>
	//   34   73:istore_3        
		Object obj = null;
	//   35   74:aconst_null     
	//   36   75:astore          4
		if(!flag && !s.equals("m"))
	//*  37   77:iload_3         
	//*  38   78:ifne            515
	//*  39   81:aload_1         
	//*  40   82:ldc1            #72  <String "m">
	//*  41   84:invokevirtual   #440 <Method boolean String.equals(Object)>
	//*  42   87:ifeq            93
	//*  43   90:goto            515
		{
			if(s.equals("rm"))
	//*  44   93:aload_1         
	//*  45   94:ldc1            #144 <String "rm">
	//*  46   96:invokevirtual   #440 <Method boolean String.equals(Object)>
	//*  47   99:ifeq            382
			{
				String s1 = (String)map.get("p");
	//   48  102:aload_2         
	//   49  103:ldc1            #84  <String "p">
	//   50  105:invokeinterface #444 <Method Object Map.get(Object)>
	//   51  110:checkcast       #437 <Class String>
	//   52  113:astore          5
				obj = map.get("d");
	//   53  115:aload_2         
	//   54  116:ldc1            #120 <String "d">
	//   55  118:invokeinterface #444 <Method Object Map.get(Object)>
	//   56  123:astore          4
				s = ((String) (Utilities.longFromObject(map.get("t"))));
	//   57  125:aload_2         
	//   58  126:ldc1            #135 <String "t">
	//   59  128:invokeinterface #444 <Method Object Map.get(Object)>
	//   60  133:invokestatic    #450 <Method Long Utilities.longFromObject(Object)>
	//   61  136:astore_1        
				if(s != null)
	//*  62  137:aload_1         
	//*  63  138:ifnull          156
					s = ((String) (new Tag(((Long) (s)).longValue())));
	//   64  141:new             #452 <Class Tag>
	//   65  144:dup             
	//   66  145:aload_1         
	//   67  146:invokevirtual   #455 <Method long Long.longValue()>
	//   68  149:invokespecial   #457 <Method void Tag(long)>
	//   69  152:astore_1        
				else
	//*  70  153:goto            158
					s = null;
	//   71  156:aconst_null     
	//   72  157:astore_1        
				map = ((Map) ((List)obj));
	//   73  158:aload           4
	//   74  160:checkcast       #459 <Class List>
	//   75  163:astore_2        
				ArrayList arraylist = new ArrayList();
	//   76  164:new             #241 <Class ArrayList>
	//   77  167:dup             
	//   78  168:invokespecial   #242 <Method void ArrayList()>
	//   79  171:astore          6
				Map map1;
				for(Iterator iterator = ((List) (map)).iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (new RangeMerge(((Path) (map)), ((Path) (obj)), NodeUtilities.NodeFromJSON(map1.get("m")))))))
	//*  80  173:aload_2         
	//*  81  174:invokeinterface #460 <Method Iterator List.iterator()>
	//*  82  179:astore          7
	//*  83  181:aload           7
	//*  84  183:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//*  85  188:ifeq            303
				{
					map1 = (Map)iterator.next();
	//   86  191:aload           7
	//   87  193:invokeinterface #338 <Method Object Iterator.next()>
	//   88  198:checkcast       #319 <Class Map>
	//   89  201:astore          8
					map = ((Map) ((String)map1.get("s")));
	//   90  203:aload           8
	//   91  205:ldc1            #93  <String "s">
	//   92  207:invokeinterface #444 <Method Object Map.get(Object)>
	//   93  212:checkcast       #437 <Class String>
	//   94  215:astore_2        
					obj = ((Object) ((String)map1.get("e")));
	//   95  216:aload           8
	//   96  218:ldc1            #153 <String "e">
	//   97  220:invokeinterface #444 <Method Object Map.get(Object)>
	//   98  225:checkcast       #437 <Class String>
	//   99  228:astore          4
					if(map != null)
	//* 100  230:aload_2         
	//* 101  231:ifnull          246
						map = ((Map) (new Path(((String) (map)))));
	//  102  234:new             #462 <Class Path>
	//  103  237:dup             
	//  104  238:aload_2         
	//  105  239:invokespecial   #464 <Method void Path(String)>
	//  106  242:astore_2        
					else
	//* 107  243:goto            248
						map = null;
	//  108  246:aconst_null     
	//  109  247:astore_2        
					if(obj != null)
	//* 110  248:aload           4
	//* 111  250:ifnull          267
						obj = ((Object) (new Path(((String) (obj)))));
	//  112  253:new             #462 <Class Path>
	//  113  256:dup             
	//  114  257:aload           4
	//  115  259:invokespecial   #464 <Method void Path(String)>
	//  116  262:astore          4
					else
	//* 117  264:goto            270
						obj = null;
	//  118  267:aconst_null     
	//  119  268:astore          4
				}

	//  120  270:aload           6
	//  121  272:new             #466 <Class RangeMerge>
	//  122  275:dup             
	//  123  276:aload_2         
	//  124  277:aload           4
	//  125  279:aload           8
	//  126  281:ldc1            #72  <String "m">
	//  127  283:invokeinterface #444 <Method Object Map.get(Object)>
	//  128  288:invokestatic    #472 <Method com.firebase.client.snapshot.Node NodeUtilities.NodeFromJSON(Object)>
	//  129  291:invokespecial   #475 <Method void RangeMerge(Path, Path, com.firebase.client.snapshot.Node)>
	//  130  294:invokeinterface #478 <Method boolean List.add(Object)>
	//  131  299:pop             
	//* 132  300:goto            181
				if(((List) (arraylist)).isEmpty())
	//* 133  303:aload           6
	//* 134  305:invokeinterface #481 <Method boolean List.isEmpty()>
	//* 135  310:ifeq            360
				{
					if(logger.logsDebug())
	//* 136  313:aload_0         
	//* 137  314:getfield        #277 <Field LogWrapper logger>
	//* 138  317:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//* 139  320:ifeq            663
					{
						s = ((String) (logger));
	//  140  323:aload_0         
	//  141  324:getfield        #277 <Field LogWrapper logger>
	//  142  327:astore_1        
						map = ((Map) (new StringBuilder()));
	//  143  328:new             #253 <Class StringBuilder>
	//  144  331:dup             
	//  145  332:invokespecial   #254 <Method void StringBuilder()>
	//  146  335:astore_2        
						((StringBuilder) (map)).append("Ignoring empty range merge for path ");
	//  147  336:aload_2         
	//  148  337:ldc2            #483 <String "Ignoring empty range merge for path ">
	//  149  340:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  150  343:pop             
						((StringBuilder) (map)).append(s1);
	//  151  344:aload_2         
	//  152  345:aload           5
	//  153  347:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  154  350:pop             
						((LogWrapper) (s)).debug(((StringBuilder) (map)).toString());
	//  155  351:aload_1         
	//  156  352:aload_2         
	//  157  353:invokevirtual   #269 <Method String StringBuilder.toString()>
	//  158  356:invokevirtual   #394 <Method void LogWrapper.debug(String)>
						return;
	//  159  359:return          
					}
				} else
				{
					_flddelegate.onRangeMergeUpdate(new Path(s1), ((List) (arraylist)), ((Tag) (s)));
	//  160  360:aload_0         
	//  161  361:getfield        #224 <Field PersistentConnection$Delegate _flddelegate>
	//  162  364:new             #462 <Class Path>
	//  163  367:dup             
	//  164  368:aload           5
	//  165  370:invokespecial   #464 <Method void Path(String)>
	//  166  373:aload           6
	//  167  375:aload_1         
	//  168  376:invokeinterface #487 <Method void PersistentConnection$Delegate.onRangeMergeUpdate(Path, List, Tag)>
					return;
	//  169  381:return          
				}
			} else
			{
				if(s.equals("c"))
	//* 170  382:aload_1         
	//* 171  383:ldc1            #111 <String "c">
	//* 172  385:invokevirtual   #440 <Method boolean String.equals(Object)>
	//* 173  388:ifeq            414
				{
					onListenRevoked(new Path((String)map.get("p")));
	//  174  391:aload_0         
	//  175  392:new             #462 <Class Path>
	//  176  395:dup             
	//  177  396:aload_2         
	//  178  397:ldc1            #84  <String "p">
	//  179  399:invokeinterface #444 <Method Object Map.get(Object)>
	//  180  404:checkcast       #437 <Class String>
	//  181  407:invokespecial   #464 <Method void Path(String)>
	//  182  410:invokespecial   #491 <Method void onListenRevoked(Path)>
					return;
	//  183  413:return          
				}
				if(s.equals("ac"))
	//* 184  414:aload_1         
	//* 185  415:ldc1            #140 <String "ac">
	//* 186  417:invokevirtual   #440 <Method boolean String.equals(Object)>
	//* 187  420:ifeq            450
				{
					onAuthRevoked((String)map.get("s"), (String)map.get("d"));
	//  188  423:aload_0         
	//  189  424:aload_2         
	//  190  425:ldc1            #93  <String "s">
	//  191  427:invokeinterface #444 <Method Object Map.get(Object)>
	//  192  432:checkcast       #437 <Class String>
	//  193  435:aload_2         
	//  194  436:ldc1            #120 <String "d">
	//  195  438:invokeinterface #444 <Method Object Map.get(Object)>
	//  196  443:checkcast       #437 <Class String>
	//  197  446:invokespecial   #493 <Method void onAuthRevoked(String, String)>
					return;
	//  198  449:return          
				}
				if(s.equals("sd"))
	//* 199  450:aload_1         
	//* 200  451:ldc1            #150 <String "sd">
	//* 201  453:invokevirtual   #440 <Method boolean String.equals(Object)>
	//* 202  456:ifeq            465
				{
					onSecurityDebugPacket(map);
	//  203  459:aload_0         
	//  204  460:aload_2         
	//  205  461:invokespecial   #496 <Method void onSecurityDebugPacket(Map)>
					return;
	//  206  464:return          
				}
				if(logger.logsDebug())
	//* 207  465:aload_0         
	//* 208  466:getfield        #277 <Field LogWrapper logger>
	//* 209  469:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//* 210  472:ifeq            663
				{
					map = ((Map) (logger));
	//  211  475:aload_0         
	//  212  476:getfield        #277 <Field LogWrapper logger>
	//  213  479:astore_2        
					obj = ((Object) (new StringBuilder()));
	//  214  480:new             #253 <Class StringBuilder>
	//  215  483:dup             
	//  216  484:invokespecial   #254 <Method void StringBuilder()>
	//  217  487:astore          4
					((StringBuilder) (obj)).append("Unrecognized action from server: ");
	//  218  489:aload           4
	//  219  491:ldc2            #498 <String "Unrecognized action from server: ">
	//  220  494:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  221  497:pop             
					((StringBuilder) (obj)).append(s);
	//  222  498:aload           4
	//  223  500:aload_1         
	//  224  501:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  225  504:pop             
					((LogWrapper) (map)).debug(((StringBuilder) (obj)).toString());
	//  226  505:aload_2         
	//  227  506:aload           4
	//  228  508:invokevirtual   #269 <Method String StringBuilder.toString()>
	//  229  511:invokevirtual   #394 <Method void LogWrapper.debug(String)>
					return;
	//  230  514:return          
				}
			}
		} else
		{
			boolean flag1 = s.equals("m");
	//  231  515:aload_1         
	//  232  516:ldc1            #72  <String "m">
	//  233  518:invokevirtual   #440 <Method boolean String.equals(Object)>
	//  234  521:istore_3        
			String s2 = (String)map.get("p");
	//  235  522:aload_2         
	//  236  523:ldc1            #84  <String "p">
	//  237  525:invokeinterface #444 <Method Object Map.get(Object)>
	//  238  530:checkcast       #437 <Class String>
	//  239  533:astore          5
			Object obj1 = map.get("d");
	//  240  535:aload_2         
	//  241  536:ldc1            #120 <String "d">
	//  242  538:invokeinterface #444 <Method Object Map.get(Object)>
	//  243  543:astore          6
			map = ((Map) (Utilities.longFromObject(map.get("t"))));
	//  244  545:aload_2         
	//  245  546:ldc1            #135 <String "t">
	//  246  548:invokeinterface #444 <Method Object Map.get(Object)>
	//  247  553:invokestatic    #450 <Method Long Utilities.longFromObject(Object)>
	//  248  556:astore_2        
			s = ((String) (obj));
	//  249  557:aload           4
	//  250  559:astore_1        
			if(map != null)
	//* 251  560:aload_2         
	//* 252  561:ifnull          576
				s = ((String) (new Tag(((Long) (map)).longValue())));
	//  253  564:new             #452 <Class Tag>
	//  254  567:dup             
	//  255  568:aload_2         
	//  256  569:invokevirtual   #455 <Method long Long.longValue()>
	//  257  572:invokespecial   #457 <Method void Tag(long)>
	//  258  575:astore_1        
			if(flag1 && (obj1 instanceof Map) && ((Map)obj1).size() == 0)
	//* 259  576:iload_3         
	//* 260  577:ifeq            648
	//* 261  580:aload           6
	//* 262  582:instanceof      #319 <Class Map>
	//* 263  585:ifeq            648
	//* 264  588:aload           6
	//* 265  590:checkcast       #319 <Class Map>
	//* 266  593:invokeinterface #502 <Method int Map.size()>
	//* 267  598:ifne            648
			{
				if(logger.logsDebug())
	//* 268  601:aload_0         
	//* 269  602:getfield        #277 <Field LogWrapper logger>
	//* 270  605:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//* 271  608:ifeq            663
				{
					s = ((String) (logger));
	//  272  611:aload_0         
	//  273  612:getfield        #277 <Field LogWrapper logger>
	//  274  615:astore_1        
					map = ((Map) (new StringBuilder()));
	//  275  616:new             #253 <Class StringBuilder>
	//  276  619:dup             
	//  277  620:invokespecial   #254 <Method void StringBuilder()>
	//  278  623:astore_2        
					((StringBuilder) (map)).append("ignoring empty merge for path ");
	//  279  624:aload_2         
	//  280  625:ldc2            #504 <String "ignoring empty merge for path ">
	//  281  628:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  282  631:pop             
					((StringBuilder) (map)).append(s2);
	//  283  632:aload_2         
	//  284  633:aload           5
	//  285  635:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  286  638:pop             
					((LogWrapper) (s)).debug(((StringBuilder) (map)).toString());
	//  287  639:aload_1         
	//  288  640:aload_2         
	//  289  641:invokevirtual   #269 <Method String StringBuilder.toString()>
	//  290  644:invokevirtual   #394 <Method void LogWrapper.debug(String)>
					return;
	//  291  647:return          
				}
			} else
			{
				_flddelegate.onDataUpdate(s2, obj1, flag1, ((Tag) (s)));
	//  292  648:aload_0         
	//  293  649:getfield        #224 <Field PersistentConnection$Delegate _flddelegate>
	//  294  652:aload           5
	//  295  654:aload           6
	//  296  656:iload_3         
	//  297  657:aload_1         
	//  298  658:invokeinterface #508 <Method void PersistentConnection$Delegate.onDataUpdate(String, Object, boolean, Tag)>
			}
		}
	//  299  663:return          
	}

	private void onListenRevoked(Path path)
	{
		Object obj = ((Object) (removeListens(path)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #513 <Method Collection removeListens(Path)>
	//    3    5:astore_2        
		if(obj != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          54
		{
			path = ((Path) (FirebaseError.fromStatus("permission_denied")));
	//    6   10:ldc2            #515 <String "permission_denied">
	//    7   13:invokestatic    #363 <Method FirebaseError FirebaseError.fromStatus(String)>
	//    8   16:astore_1        
			for(obj = ((Object) (((Collection) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((OutstandingListen)((Iterator) (obj)).next()).resultListener.onRequestResult(((FirebaseError) (path))));
	//    9   17:aload_2         
	//   10   18:invokeinterface #518 <Method Iterator Collection.iterator()>
	//   11   23:astore_2        
	//   12   24:aload_2         
	//   13   25:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            54
	//   15   33:aload_2         
	//   16   34:invokeinterface #338 <Method Object Iterator.next()>
	//   17   39:checkcast       #34  <Class PersistentConnection$OutstandingListen>
	//   18   42:invokestatic    #522 <Method PersistentConnection$RequestResultListener PersistentConnection$OutstandingListen.access$500(PersistentConnection$OutstandingListen)>
	//   19   45:aload_1         
	//   20   46:invokeinterface #525 <Method void PersistentConnection$RequestResultListener.onRequestResult(FirebaseError)>
		}
	//*  21   51:goto            24
	//   22   54:return          
	}

	private void onSecurityDebugPacket(Map map)
	{
		logger.info((String)map.get("msg"));
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field LogWrapper logger>
	//    2    4:aload_1         
	//    3    5:ldc2            #527 <String "msg">
	//    4    8:invokeinterface #444 <Method Object Map.get(Object)>
	//    5   13:checkcast       #437 <Class String>
	//    6   16:invokevirtual   #530 <Method void LogWrapper.info(String)>
	//    7   19:return          
	}

	private void putInternal(String s, String s1, Object obj, String s2, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
		s1 = ((String) (getPutObject(s1, obj, s2)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokespecial   #535 <Method Map getPutObject(String, Object, String)>
	//    5    8:astore_2        
		long l = writeCounter;
	//    6    9:aload_0         
	//    7   10:getfield        #218 <Field long writeCounter>
	//    8   13:lstore          6
		writeCounter = 1L + l;
	//    9   15:aload_0         
	//   10   16:lconst_1        
	//   11   17:lload           6
	//   12   19:ladd            
	//   13   20:putfield        #218 <Field long writeCounter>
		outstandingPuts.put(((Object) (Long.valueOf(l))), ((Object) (new OutstandingPut(s, ((Map) (s1)), completionlistener))));
	//   14   23:aload_0         
	//   15   24:getfield        #239 <Field Map outstandingPuts>
	//   16   27:lload           6
	//   17   29:invokestatic    #412 <Method Long Long.valueOf(long)>
	//   18   32:new             #37  <Class PersistentConnection$OutstandingPut>
	//   19   35:dup             
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:aload           5
	//   23   40:aconst_null     
	//   24   41:invokespecial   #538 <Method void PersistentConnection$OutstandingPut(String, Map, com.firebase.client.Firebase$CompletionListener, PersistentConnection$1)>
	//   25   44:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   26   49:pop             
		if(canSendWrites())
	//*  27   50:aload_0         
	//*  28   51:invokespecial   #540 <Method boolean canSendWrites()>
	//*  29   54:ifeq            63
			sendPut(l);
	//   30   57:aload_0         
	//   31   58:lload           6
	//   32   60:invokespecial   #543 <Method void sendPut(long)>
	//   33   63:return          
	}

	private OutstandingListen removeListen(QuerySpec queryspec)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            45
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #253 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #254 <Method void StringBuilder()>
	//   10   22:astore_3        
			stringbuilder.append("removing query ");
	//   11   23:aload_3         
	//   12   24:ldc2            #545 <String "removing query ">
	//   13   27:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(((Object) (queryspec)));
	//   15   31:aload_3         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   18   36:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   22   42:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		if(!listens.containsKey(((Object) (queryspec))))
	//*  23   45:aload_0         
	//*  24   46:getfield        #233 <Field Map listens>
	//*  25   49:aload_1         
	//*  26   50:invokeinterface #351 <Method boolean Map.containsKey(Object)>
	//*  27   55:ifne            113
		{
			if(logger.logsDebug())
	//*  28   58:aload_0         
	//*  29   59:getfield        #277 <Field LogWrapper logger>
	//*  30   62:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  31   65:ifeq            111
			{
				LogWrapper logwrapper1 = logger;
	//   32   68:aload_0         
	//   33   69:getfield        #277 <Field LogWrapper logger>
	//   34   72:astore_2        
				StringBuilder stringbuilder1 = new StringBuilder();
	//   35   73:new             #253 <Class StringBuilder>
	//   36   76:dup             
	//   37   77:invokespecial   #254 <Method void StringBuilder()>
	//   38   80:astore_3        
				stringbuilder1.append("Trying to remove listener for QuerySpec ");
	//   39   81:aload_3         
	//   40   82:ldc2            #547 <String "Trying to remove listener for QuerySpec ">
	//   41   85:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
				stringbuilder1.append(((Object) (queryspec)));
	//   43   89:aload_3         
	//   44   90:aload_1         
	//   45   91:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   46   94:pop             
				stringbuilder1.append(" but no listener exists.");
	//   47   95:aload_3         
	//   48   96:ldc2            #549 <String " but no listener exists.">
	//   49   99:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
				logwrapper1.debug(stringbuilder1.toString());
	//   51  103:aload_2         
	//   52  104:aload_3         
	//   53  105:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   54  108:invokevirtual   #394 <Method void LogWrapper.debug(String)>
			}
			return null;
	//   55  111:aconst_null     
	//   56  112:areturn         
		} else
		{
			OutstandingListen outstandinglisten = (OutstandingListen)listens.get(((Object) (queryspec)));
	//   57  113:aload_0         
	//   58  114:getfield        #233 <Field Map listens>
	//   59  117:aload_1         
	//   60  118:invokeinterface #444 <Method Object Map.get(Object)>
	//   61  123:checkcast       #34  <Class PersistentConnection$OutstandingListen>
	//   62  126:astore_2        
			listens.remove(((Object) (queryspec)));
	//   63  127:aload_0         
	//   64  128:getfield        #233 <Field Map listens>
	//   65  131:aload_1         
	//   66  132:invokeinterface #551 <Method Object Map.remove(Object)>
	//   67  137:pop             
			return outstandinglisten;
	//   68  138:aload_2         
	//   69  139:areturn         
		}
	}

	private void restoreState()
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            20
			logger.debug("calling restore state");
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:ldc2            #554 <String "calling restore state">
	//    7   17:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		if(authCredential != null)
	//*   8   20:aload_0         
	//*   9   21:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//*  10   24:ifnull          61
		{
			if(logger.logsDebug())
	//*  11   27:aload_0         
	//*  12   28:getfield        #277 <Field LogWrapper logger>
	//*  13   31:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  14   34:ifeq            47
				logger.debug("Restoring auth.");
	//   15   37:aload_0         
	//   16   38:getfield        #277 <Field LogWrapper logger>
	//   17   41:ldc2            #556 <String "Restoring auth.">
	//   18   44:invokevirtual   #394 <Method void LogWrapper.debug(String)>
			connectionState = ConnectionState.Authenticating;
	//   19   47:aload_0         
	//   20   48:getstatic       #559 <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Authenticating>
	//   21   51:putfield        #216 <Field PersistentConnection$ConnectionState connectionState>
			sendAuthAndRestoreWrites();
	//   22   54:aload_0         
	//   23   55:invokespecial   #562 <Method void sendAuthAndRestoreWrites()>
		} else
	//*  24   58:goto            68
		{
			connectionState = ConnectionState.Connected;
	//   25   61:aload_0         
	//   26   62:getstatic       #316 <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Connected>
	//   27   65:putfield        #216 <Field PersistentConnection$ConnectionState connectionState>
		}
		if(logger.logsDebug())
	//*  28   68:aload_0         
	//*  29   69:getfield        #277 <Field LogWrapper logger>
	//*  30   72:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  31   75:ifeq            88
			logger.debug("Restoring outstanding listens");
	//   32   78:aload_0         
	//   33   79:getfield        #277 <Field LogWrapper logger>
	//   34   82:ldc2            #564 <String "Restoring outstanding listens">
	//   35   85:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		OutstandingListen outstandinglisten;
		for(Iterator iterator = listens.values().iterator(); iterator.hasNext(); sendListen(outstandinglisten))
	//*  36   88:aload_0         
	//*  37   89:getfield        #233 <Field Map listens>
	//*  38   92:invokeinterface #568 <Method Collection Map.values()>
	//*  39   97:invokeinterface #518 <Method Iterator Collection.iterator()>
	//*  40  102:astore_1        
	//*  41  103:aload_1         
	//*  42  104:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//*  43  109:ifeq            182
		{
			outstandinglisten = (OutstandingListen)iterator.next();
	//   44  112:aload_1         
	//   45  113:invokeinterface #338 <Method Object Iterator.next()>
	//   46  118:checkcast       #34  <Class PersistentConnection$OutstandingListen>
	//   47  121:astore_2        
			if(logger.logsDebug())
	//*  48  122:aload_0         
	//*  49  123:getfield        #277 <Field LogWrapper logger>
	//*  50  126:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  51  129:ifeq            174
			{
				LogWrapper logwrapper = logger;
	//   52  132:aload_0         
	//   53  133:getfield        #277 <Field LogWrapper logger>
	//   54  136:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   55  137:new             #253 <Class StringBuilder>
	//   56  140:dup             
	//   57  141:invokespecial   #254 <Method void StringBuilder()>
	//   58  144:astore          4
				stringbuilder.append("Restoring listen ");
	//   59  146:aload           4
	//   60  148:ldc2            #570 <String "Restoring listen ">
	//   61  151:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   62  154:pop             
				stringbuilder.append(((Object) (outstandinglisten.getQuery())));
	//   63  155:aload           4
	//   64  157:aload_2         
	//   65  158:invokevirtual   #574 <Method QuerySpec PersistentConnection$OutstandingListen.getQuery()>
	//   66  161:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   67  164:pop             
				logwrapper.debug(stringbuilder.toString());
	//   68  165:aload_3         
	//   69  166:aload           4
	//   70  168:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   71  171:invokevirtual   #394 <Method void LogWrapper.debug(String)>
			}
		}

	//   72  174:aload_0         
	//   73  175:aload_2         
	//   74  176:invokespecial   #578 <Method void sendListen(PersistentConnection$OutstandingListen)>
	//*  75  179:goto            103
		if(connectionState == ConnectionState.Connected)
	//*  76  182:aload_0         
	//*  77  183:getfield        #216 <Field PersistentConnection$ConnectionState connectionState>
	//*  78  186:getstatic       #316 <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Connected>
	//*  79  189:if_acmpne       196
			restoreWrites();
	//   80  192:aload_0         
	//   81  193:invokespecial   #311 <Method void restoreWrites()>
	//   82  196:return          
	}

	private void restoreWrites()
	{
		if(writesPaused)
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field boolean writesPaused>
	//*   2    4:ifeq            28
		{
			if(logger.logsDebug())
	//*   3    7:aload_0         
	//*   4    8:getfield        #277 <Field LogWrapper logger>
	//*   5   11:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   6   14:ifeq            163
			{
				logger.debug("Writes are paused; skip restoring writes.");
	//    7   17:aload_0         
	//    8   18:getfield        #277 <Field LogWrapper logger>
	//    9   21:ldc2            #580 <String "Writes are paused; skip restoring writes.">
	//   10   24:invokevirtual   #394 <Method void LogWrapper.debug(String)>
				return;
	//   11   27:return          
			}
		} else
		{
			if(logger.logsDebug())
	//*  12   28:aload_0         
	//*  13   29:getfield        #277 <Field LogWrapper logger>
	//*  14   32:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  15   35:ifeq            48
				logger.debug("Restoring writes.");
	//   16   38:aload_0         
	//   17   39:getfield        #277 <Field LogWrapper logger>
	//   18   42:ldc2            #582 <String "Restoring writes.">
	//   19   45:invokevirtual   #394 <Method void LogWrapper.debug(String)>
			Object obj = ((Object) (new ArrayList(((Collection) (outstandingPuts.keySet())))));
	//   20   48:new             #241 <Class ArrayList>
	//   21   51:dup             
	//   22   52:aload_0         
	//   23   53:getfield        #239 <Field Map outstandingPuts>
	//   24   56:invokeinterface #585 <Method Set Map.keySet()>
	//   25   61:invokespecial   #588 <Method void ArrayList(Collection)>
	//   26   64:astore_1        
			Collections.sort(((List) (obj)));
	//   27   65:aload_1         
	//   28   66:invokestatic    #594 <Method void Collections.sort(List)>
			for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); sendPut(((Long)((Iterator) (obj)).next()).longValue()));
	//   29   69:aload_1         
	//   30   70:invokevirtual   #595 <Method Iterator ArrayList.iterator()>
	//   31   73:astore_1        
	//   32   74:aload_1         
	//   33   75:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//   34   80:ifeq            102
	//   35   83:aload_0         
	//   36   84:aload_1         
	//   37   85:invokeinterface #338 <Method Object Iterator.next()>
	//   38   90:checkcast       #408 <Class Long>
	//   39   93:invokevirtual   #455 <Method long Long.longValue()>
	//   40   96:invokespecial   #543 <Method void sendPut(long)>
	//*  41   99:goto            74
			OutstandingDisconnect outstandingdisconnect;
			for(Iterator iterator = onDisconnectRequestQueue.iterator(); iterator.hasNext(); sendOnDisconnect(outstandingdisconnect.getAction(), outstandingdisconnect.getPath(), outstandingdisconnect.getData(), outstandingdisconnect.getOnComplete()))
	//*  42  102:aload_0         
	//*  43  103:getfield        #244 <Field List onDisconnectRequestQueue>
	//*  44  106:invokeinterface #460 <Method Iterator List.iterator()>
	//*  45  111:astore_1        
	//*  46  112:aload_1         
	//*  47  113:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//*  48  118:ifeq            154
				outstandingdisconnect = (OutstandingDisconnect)iterator.next();
	//   49  121:aload_1         
	//   50  122:invokeinterface #338 <Method Object Iterator.next()>
	//   51  127:checkcast       #31  <Class PersistentConnection$OutstandingDisconnect>
	//   52  130:astore_2        

	//   53  131:aload_0         
	//   54  132:aload_2         
	//   55  133:invokevirtual   #598 <Method String PersistentConnection$OutstandingDisconnect.getAction()>
	//   56  136:aload_2         
	//   57  137:invokevirtual   #602 <Method Path PersistentConnection$OutstandingDisconnect.getPath()>
	//   58  140:aload_2         
	//   59  141:invokevirtual   #605 <Method Object PersistentConnection$OutstandingDisconnect.getData()>
	//   60  144:aload_2         
	//   61  145:invokevirtual   #606 <Method com.firebase.client.Firebase$CompletionListener PersistentConnection$OutstandingDisconnect.getOnComplete()>
	//   62  148:invokespecial   #610 <Method void sendOnDisconnect(String, Path, Object, com.firebase.client.Firebase$CompletionListener)>
	//*  63  151:goto            112
			onDisconnectRequestQueue.clear();
	//   64  154:aload_0         
	//   65  155:getfield        #244 <Field List onDisconnectRequestQueue>
	//   66  158:invokeinterface #613 <Method void List.clear()>
		}
	//   67  163:return          
	}

	private void sendAction(String s, Map map, ResponseListener responselistener)
	{
		long l = nextRequestNumber();
	//    0    0:aload_0         
	//    1    1:invokespecial   #617 <Method long nextRequestNumber()>
	//    2    4:lstore          4
		HashMap hashmap = new HashMap();
	//    3    6:new             #230 <Class HashMap>
	//    4    9:dup             
	//    5   10:invokespecial   #231 <Method void HashMap()>
	//    6   13:astore          6
		((Map) (hashmap)).put("r", ((Object) (Long.valueOf(l))));
	//    7   15:aload           6
	//    8   17:ldc1            #126 <String "r">
	//    9   19:lload           4
	//   10   21:invokestatic    #412 <Method Long Long.valueOf(long)>
	//   11   24:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   12   29:pop             
		((Map) (hashmap)).put("a", ((Object) (s)));
	//   13   30:aload           6
	//   14   32:ldc1            #63  <String "a">
	//   15   34:aload_1         
	//   16   35:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   17   40:pop             
		((Map) (hashmap)).put("b", ((Object) (map)));
	//   18   41:aload           6
	//   19   43:ldc1            #130 <String "b">
	//   20   45:aload_2         
	//   21   46:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   22   51:pop             
		realtime.sendRequest(((Map) (hashmap)));
	//   23   52:aload_0         
	//   24   53:getfield        #619 <Field Connection realtime>
	//   25   56:aload           6
	//   26   58:invokevirtual   #624 <Method void Connection.sendRequest(Map)>
		requestCBHash.put(((Object) (Long.valueOf(l))), ((Object) (responselistener)));
	//   27   61:aload_0         
	//   28   62:getfield        #235 <Field Map requestCBHash>
	//   29   65:lload           4
	//   30   67:invokestatic    #412 <Method Long Long.valueOf(long)>
	//   31   70:aload_3         
	//   32   71:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   33   76:pop             
	//   34   77:return          
	}

	private void sendAuth()
	{
		sendAuthHelper(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #630 <Method void sendAuthHelper(boolean)>
	//    3    5:return          
	}

	private void sendAuthAndRestoreWrites()
	{
		sendAuthHelper(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #630 <Method void sendAuthHelper(boolean)>
	//    3    5:return          
	}

	private void sendAuthHelper(boolean flag)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #230 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("cred", ((Object) (authCredential.getCredential())));
	//    4    8:aload_2         
	//    5    9:ldc1            #114 <String "cred">
	//    6   11:aload_0         
	//    7   12:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//    8   15:invokevirtual   #633 <Method String PersistentConnection$AuthCredential.getCredential()>
	//    9   18:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   10   23:pop             
		sendAction("auth", ((Map) (hashmap)), new ResponseListener() {

			public void onResponse(Map map)
			{
				connectionState = ConnectionState.Connected;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field PersistentConnection this$0>
			//    2    4:getstatic       #37  <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Connected>
			//    3    7:invokestatic    #41  <Method PersistentConnection$ConnectionState PersistentConnection.access$602(PersistentConnection, PersistentConnection$ConnectionState)>
			//    4   10:pop             
				if(credential == authCredential)
			//*   5   11:aload_0         
			//*   6   12:getfield        #23  <Field PersistentConnection$AuthCredential val$credential>
			//*   7   15:aload_0         
			//*   8   16:getfield        #21  <Field PersistentConnection this$0>
			//*   9   19:invokestatic    #45  <Method PersistentConnection$AuthCredential PersistentConnection.access$700(PersistentConnection)>
			//*  10   22:if_acmpne       123
				{
					String s = (String)map.get("s");
			//   11   25:aload_1         
			//   12   26:ldc1            #47  <String "s">
			//   13   28:invokeinterface #53  <Method Object Map.get(Object)>
			//   14   33:checkcast       #55  <Class String>
			//   15   36:astore_2        
					if(s.equals("ok"))
			//*  16   37:aload_2         
			//*  17   38:ldc1            #57  <String "ok">
			//*  18   40:invokevirtual   #61  <Method boolean String.equals(Object)>
			//*  19   43:ifeq            77
					{
						_flddelegate.onAuthStatus(true);
			//   20   46:aload_0         
			//   21   47:getfield        #21  <Field PersistentConnection this$0>
			//   22   50:invokestatic    #65  <Method PersistentConnection$Delegate PersistentConnection.access$800(PersistentConnection)>
			//   23   53:iconst_1        
			//   24   54:invokeinterface #70  <Method void PersistentConnection$Delegate.onAuthStatus(boolean)>
						credential.onSuccess(map.get("d"));
			//   25   59:aload_0         
			//   26   60:getfield        #23  <Field PersistentConnection$AuthCredential val$credential>
			//   27   63:aload_1         
			//   28   64:ldc1            #72  <String "d">
			//   29   66:invokeinterface #53  <Method Object Map.get(Object)>
			//   30   71:invokevirtual   #78  <Method void PersistentConnection$AuthCredential.onSuccess(Object)>
					} else
			//*  31   74:goto            123
					{
						authCredential = null;
			//   32   77:aload_0         
			//   33   78:getfield        #21  <Field PersistentConnection this$0>
			//   34   81:aconst_null     
			//   35   82:invokestatic    #82  <Method PersistentConnection$AuthCredential PersistentConnection.access$702(PersistentConnection, PersistentConnection$AuthCredential)>
			//   36   85:pop             
						_flddelegate.onAuthStatus(false);
			//   37   86:aload_0         
			//   38   87:getfield        #21  <Field PersistentConnection this$0>
			//   39   90:invokestatic    #65  <Method PersistentConnection$Delegate PersistentConnection.access$800(PersistentConnection)>
			//   40   93:iconst_0        
			//   41   94:invokeinterface #70  <Method void PersistentConnection$Delegate.onAuthStatus(boolean)>
						map = ((Map) ((String)map.get("d")));
			//   42   99:aload_1         
			//   43  100:ldc1            #72  <String "d">
			//   44  102:invokeinterface #53  <Method Object Map.get(Object)>
			//   45  107:checkcast       #55  <Class String>
			//   46  110:astore_1        
						credential.onCancel(FirebaseError.fromStatus(s, ((String) (map))));
			//   47  111:aload_0         
			//   48  112:getfield        #23  <Field PersistentConnection$AuthCredential val$credential>
			//   49  115:aload_2         
			//   50  116:aload_1         
			//   51  117:invokestatic    #88  <Method FirebaseError FirebaseError.fromStatus(String, String)>
			//   52  120:invokevirtual   #92  <Method void PersistentConnection$AuthCredential.onCancel(FirebaseError)>
					}
				}
				if(restoreWritesAfterComplete)
			//*  53  123:aload_0         
			//*  54  124:getfield        #25  <Field boolean val$restoreWritesAfterComplete>
			//*  55  127:ifeq            137
					restoreWrites();
			//   56  130:aload_0         
			//   57  131:getfield        #21  <Field PersistentConnection this$0>
			//   58  134:invokestatic    #96  <Method void PersistentConnection.access$900(PersistentConnection)>
			//   59  137:return          
			}

			final PersistentConnection this$0;
			final AuthCredential val$credential;
			final boolean val$restoreWritesAfterComplete;

			
			{
				this$0 = PersistentConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field PersistentConnection this$0>
				credential = authcredential;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field PersistentConnection$AuthCredential val$credential>
				restoreWritesAfterComplete = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field boolean val$restoreWritesAfterComplete>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   11   24:aload_0         
	//   12   25:ldc1            #66  <String "auth">
	//   13   27:aload_2         
	//   14   28:new             #14  <Class PersistentConnection$4>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//   19   37:iload_1         
	//   20   38:invokespecial   #636 <Method void PersistentConnection$4(PersistentConnection, PersistentConnection$AuthCredential, boolean)>
	//   21   41:invokespecial   #638 <Method void sendAction(String, Map, PersistentConnection$ResponseListener)>
	//   22   44:return          
	}

	private void sendConnectStats()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #230 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void HashMap()>
	//    3    7:astore_1        
		if(AndroidSupport.isAndroid())
	//*   4    8:invokestatic    #644 <Method boolean AndroidSupport.isAndroid()>
	//*   5   11:ifeq            87
		{
			if(ctx.isPersistenceEnabled())
	//*   6   14:aload_0         
	//*   7   15:getfield        #226 <Field Context ctx>
	//*   8   18:invokevirtual   #647 <Method boolean Context.isPersistenceEnabled()>
	//*   9   21:ifeq            38
				((Map) (hashmap)).put("persistence.android.enabled", ((Object) (Integer.valueOf(1))));
	//   10   24:aload_1         
	//   11   25:ldc2            #649 <String "persistence.android.enabled">
	//   12   28:iconst_1        
	//   13   29:invokestatic    #654 <Method Integer Integer.valueOf(int)>
	//   14   32:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   15   37:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   16   38:new             #253 <Class StringBuilder>
	//   17   41:dup             
	//   18   42:invokespecial   #254 <Method void StringBuilder()>
	//   19   45:astore_2        
			stringbuilder.append("sdk.android.");
	//   20   46:aload_2         
	//   21   47:ldc2            #656 <String "sdk.android.">
	//   22   50:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   23   53:pop             
			stringbuilder.append(Firebase.getSdkVersion().replace('.', '-'));
	//   24   54:aload_2         
	//   25   55:invokestatic    #661 <Method String Firebase.getSdkVersion()>
	//   26   58:bipush          46
	//   27   60:bipush          45
	//   28   62:invokevirtual   #665 <Method String String.replace(char, char)>
	//   29   65:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
			((Map) (hashmap)).put(((Object) (stringbuilder.toString())), ((Object) (Integer.valueOf(1))));
	//   31   69:aload_1         
	//   32   70:aload_2         
	//   33   71:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   34   74:iconst_1        
	//   35   75:invokestatic    #654 <Method Integer Integer.valueOf(int)>
	//   36   78:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   37   83:pop             
		} else
	//*  38   84:goto            133
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   39   87:new             #253 <Class StringBuilder>
	//   40   90:dup             
	//   41   91:invokespecial   #254 <Method void StringBuilder()>
	//   42   94:astore_2        
			stringbuilder1.append("sdk.java.");
	//   43   95:aload_2         
	//   44   96:ldc2            #667 <String "sdk.java.">
	//   45   99:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   46  102:pop             
			stringbuilder1.append(Firebase.getSdkVersion().replace('.', '-'));
	//   47  103:aload_2         
	//   48  104:invokestatic    #661 <Method String Firebase.getSdkVersion()>
	//   49  107:bipush          46
	//   50  109:bipush          45
	//   51  111:invokevirtual   #665 <Method String String.replace(char, char)>
	//   52  114:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   53  117:pop             
			((Map) (hashmap)).put(((Object) (stringbuilder1.toString())), ((Object) (Integer.valueOf(1))));
	//   54  118:aload_1         
	//   55  119:aload_2         
	//   56  120:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   57  123:iconst_1        
	//   58  124:invokestatic    #654 <Method Integer Integer.valueOf(int)>
	//   59  127:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   60  132:pop             
		}
		if(logger.logsDebug())
	//*  61  133:aload_0         
	//*  62  134:getfield        #277 <Field LogWrapper logger>
	//*  63  137:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  64  140:ifeq            153
			logger.debug("Sending first connection stats");
	//   65  143:aload_0         
	//   66  144:getfield        #277 <Field LogWrapper logger>
	//   67  147:ldc2            #669 <String "Sending first connection stats">
	//   68  150:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		sendStats(((Map) (hashmap)));
	//   69  153:aload_0         
	//   70  154:aload_1         
	//   71  155:invokespecial   #672 <Method void sendStats(Map)>
	//   72  158:return          
	}

	private void sendListen(final OutstandingListen listen)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #230 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("p", ((Object) (listen.getQuery().getPath().toString())));
	//    4    8:aload_2         
	//    5    9:ldc1            #84  <String "p">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #574 <Method QuerySpec PersistentConnection$OutstandingListen.getQuery()>
	//    8   15:invokevirtual   #675 <Method Path QuerySpec.getPath()>
	//    9   18:invokevirtual   #676 <Method String Path.toString()>
	//   10   21:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   11   26:pop             
		Object obj = ((Object) (listen.getTag()));
	//   12   27:aload_1         
	//   13   28:invokevirtual   #680 <Method Tag PersistentConnection$OutstandingListen.getTag()>
	//   14   31:astore_3        
		if(obj != null)
	//*  15   32:aload_3         
	//*  16   33:ifnull          71
		{
			((Map) (hashmap)).put("q", ((Object) (listen.getQuery().getParams().getWireProtocolParams())));
	//   17   36:aload_2         
	//   18   37:ldc1            #87  <String "q">
	//   19   39:aload_1         
	//   20   40:invokevirtual   #574 <Method QuerySpec PersistentConnection$OutstandingListen.getQuery()>
	//   21   43:invokevirtual   #684 <Method QueryParams QuerySpec.getParams()>
	//   22   46:invokevirtual   #689 <Method Map QueryParams.getWireProtocolParams()>
	//   23   49:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   24   54:pop             
			((Map) (hashmap)).put("t", ((Object) (Long.valueOf(((Tag) (obj)).getTagNumber()))));
	//   25   55:aload_2         
	//   26   56:ldc1            #135 <String "t">
	//   27   58:aload_3         
	//   28   59:invokevirtual   #692 <Method long Tag.getTagNumber()>
	//   29   62:invokestatic    #412 <Method Long Long.valueOf(long)>
	//   30   65:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   31   70:pop             
		}
		obj = ((Object) (listen.getHashFunction()));
	//   32   71:aload_1         
	//   33   72:invokevirtual   #696 <Method SyncTree$SyncTreeHash PersistentConnection$OutstandingListen.getHashFunction()>
	//   34   75:astore_3        
		((Map) (hashmap)).put("h", ((Object) (((SyncTree.SyncTreeHash) (obj)).getSimpleHash())));
	//   35   76:aload_2         
	//   36   77:ldc1            #117 <String "h">
	//   37   79:aload_3         
	//   38   80:invokeinterface #701 <Method String SyncTree$SyncTreeHash.getSimpleHash()>
	//   39   85:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   40   90:pop             
		if(((SyncTree.SyncTreeHash) (obj)).shouldIncludeCompoundHash())
	//*  41   91:aload_3         
	//*  42   92:invokeinterface #704 <Method boolean SyncTree$SyncTreeHash.shouldIncludeCompoundHash()>
	//*  43   97:ifeq            207
		{
			obj = ((Object) (((SyncTree.SyncTreeHash) (obj)).getCompoundHash()));
	//   44  100:aload_3         
	//   45  101:invokeinterface #708 <Method CompoundHash SyncTree$SyncTreeHash.getCompoundHash()>
	//   46  106:astore_3        
			ArrayList arraylist = new ArrayList();
	//   47  107:new             #241 <Class ArrayList>
	//   48  110:dup             
	//   49  111:invokespecial   #242 <Method void ArrayList()>
	//   50  114:astore          4
			for(Iterator iterator = ((CompoundHash) (obj)).getPosts().iterator(); iterator.hasNext(); ((List) (arraylist)).add(((Object) (((Path)iterator.next()).wireFormat()))));
	//   51  116:aload_3         
	//   52  117:invokevirtual   #714 <Method List CompoundHash.getPosts()>
	//   53  120:invokeinterface #460 <Method Iterator List.iterator()>
	//   54  125:astore          5
	//   55  127:aload           5
	//   56  129:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//   57  134:ifeq            161
	//   58  137:aload           4
	//   59  139:aload           5
	//   60  141:invokeinterface #338 <Method Object Iterator.next()>
	//   61  146:checkcast       #462 <Class Path>
	//   62  149:invokevirtual   #717 <Method String Path.wireFormat()>
	//   63  152:invokeinterface #478 <Method boolean List.add(Object)>
	//   64  157:pop             
	//*  65  158:goto            127
			HashMap hashmap1 = new HashMap();
	//   66  161:new             #230 <Class HashMap>
	//   67  164:dup             
	//   68  165:invokespecial   #231 <Method void HashMap()>
	//   69  168:astore          5
			((Map) (hashmap1)).put("hs", ((Object) (((CompoundHash) (obj)).getHashes())));
	//   70  170:aload           5
	//   71  172:ldc1            #105 <String "hs">
	//   72  174:aload_3         
	//   73  175:invokevirtual   #720 <Method List CompoundHash.getHashes()>
	//   74  178:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   75  183:pop             
			((Map) (hashmap1)).put("ps", ((Object) (arraylist)));
	//   76  184:aload           5
	//   77  186:ldc1            #108 <String "ps">
	//   78  188:aload           4
	//   79  190:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   80  195:pop             
			((Map) (hashmap)).put("ch", ((Object) (hashmap1)));
	//   81  196:aload_2         
	//   82  197:ldc1            #102 <String "ch">
	//   83  199:aload           5
	//   84  201:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   85  206:pop             
		}
		sendAction("q", ((Map) (hashmap)), new ResponseListener() {

			public void onResponse(Map map)
			{
				String s = (String)map.get("s");
			//    0    0:aload_1         
			//    1    1:ldc1            #29  <String "s">
			//    2    3:invokeinterface #35  <Method Object Map.get(Object)>
			//    3    8:checkcast       #37  <Class String>
			//    4   11:astore_2        
				if(s.equals("ok"))
			//*   5   12:aload_2         
			//*   6   13:ldc1            #39  <String "ok">
			//*   7   15:invokevirtual   #43  <Method boolean String.equals(Object)>
			//*   8   18:ifeq            71
				{
					Object obj1 = ((Object) ((Map)map.get("d")));
			//    9   21:aload_1         
			//   10   22:ldc1            #45  <String "d">
			//   11   24:invokeinterface #35  <Method Object Map.get(Object)>
			//   12   29:checkcast       #31  <Class Map>
			//   13   32:astore_3        
					if(((Map) (obj1)).containsKey("w"))
			//*  14   33:aload_3         
			//*  15   34:ldc1            #47  <String "w">
			//*  16   36:invokeinterface #50  <Method boolean Map.containsKey(Object)>
			//*  17   41:ifeq            71
					{
						obj1 = ((Object) ((List)((Map) (obj1)).get("w")));
			//   18   44:aload_3         
			//   19   45:ldc1            #47  <String "w">
			//   20   47:invokeinterface #35  <Method Object Map.get(Object)>
			//   21   52:checkcast       #52  <Class List>
			//   22   55:astore_3        
						warnOnListenerWarnings(((List) (obj1)), listen.getQuery());
			//   23   56:aload_0         
			//   24   57:getfield        #19  <Field PersistentConnection this$0>
			//   25   60:aload_3         
			//   26   61:aload_0         
			//   27   62:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
			//   28   65:invokevirtual   #58  <Method QuerySpec PersistentConnection$OutstandingListen.getQuery()>
			//   29   68:invokestatic    #62  <Method void PersistentConnection.access$1300(PersistentConnection, List, QuerySpec)>
					}
				}
				if((OutstandingListen)listens.get(((Object) (listen.getQuery()))) == listen)
			//*  30   71:aload_0         
			//*  31   72:getfield        #19  <Field PersistentConnection this$0>
			//*  32   75:invokestatic    #66  <Method Map PersistentConnection.access$1400(PersistentConnection)>
			//*  33   78:aload_0         
			//*  34   79:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
			//*  35   82:invokevirtual   #58  <Method QuerySpec PersistentConnection$OutstandingListen.getQuery()>
			//*  36   85:invokeinterface #35  <Method Object Map.get(Object)>
			//*  37   90:checkcast       #54  <Class PersistentConnection$OutstandingListen>
			//*  38   93:aload_0         
			//*  39   94:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
			//*  40   97:if_acmpne       167
				{
					if(!s.equals("ok"))
			//*  41  100:aload_2         
			//*  42  101:ldc1            #39  <String "ok">
			//*  43  103:invokevirtual   #43  <Method boolean String.equals(Object)>
			//*  44  106:ifne            154
					{
						removeListen(listen.getQuery());
			//   45  109:aload_0         
			//   46  110:getfield        #19  <Field PersistentConnection this$0>
			//   47  113:aload_0         
			//   48  114:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
			//   49  117:invokevirtual   #58  <Method QuerySpec PersistentConnection$OutstandingListen.getQuery()>
			//   50  120:invokestatic    #70  <Method PersistentConnection$OutstandingListen PersistentConnection.access$1500(PersistentConnection, QuerySpec)>
			//   51  123:pop             
						map = ((Map) (FirebaseError.fromStatus(s, (String)map.get("d"))));
			//   52  124:aload_2         
			//   53  125:aload_1         
			//   54  126:ldc1            #45  <String "d">
			//   55  128:invokeinterface #35  <Method Object Map.get(Object)>
			//   56  133:checkcast       #37  <Class String>
			//   57  136:invokestatic    #76  <Method FirebaseError FirebaseError.fromStatus(String, String)>
			//   58  139:astore_1        
						listen.resultListener.onRequestResult(((FirebaseError) (map)));
			//   59  140:aload_0         
			//   60  141:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
			//   61  144:invokestatic    #80  <Method PersistentConnection$RequestResultListener PersistentConnection$OutstandingListen.access$500(PersistentConnection$OutstandingListen)>
			//   62  147:aload_1         
			//   63  148:invokeinterface #86  <Method void PersistentConnection$RequestResultListener.onRequestResult(FirebaseError)>
						return;
			//   64  153:return          
					}
					listen.resultListener.onRequestResult(((FirebaseError) (null)));
			//   65  154:aload_0         
			//   66  155:getfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
			//   67  158:invokestatic    #80  <Method PersistentConnection$RequestResultListener PersistentConnection$OutstandingListen.access$500(PersistentConnection$OutstandingListen)>
			//   68  161:aconst_null     
			//   69  162:invokeinterface #86  <Method void PersistentConnection$RequestResultListener.onRequestResult(FirebaseError)>
				}
			//   70  167:return          
			}

			final PersistentConnection this$0;
			final OutstandingListen val$listen;

			
			{
				this$0 = PersistentConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PersistentConnection this$0>
				listen = outstandinglisten;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field PersistentConnection$OutstandingListen val$listen>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   86  207:aload_0         
	//   87  208:ldc1            #87  <String "q">
	//   88  210:aload_2         
	//   89  211:new             #18  <Class PersistentConnection$6>
	//   90  214:dup             
	//   91  215:aload_0         
	//   92  216:aload_1         
	//   93  217:invokespecial   #723 <Method void PersistentConnection$6(PersistentConnection, PersistentConnection$OutstandingListen)>
	//   94  220:invokespecial   #638 <Method void sendAction(String, Map, PersistentConnection$ResponseListener)>
	//   95  223:return          
	}

	private void sendOnDisconnect(String s, Path path, Object obj, final com.firebase.client.Firebase.CompletionListener onComplete)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #230 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void HashMap()>
	//    3    7:astore          5
		((Map) (hashmap)).put("p", ((Object) (path.toString())));
	//    4    9:aload           5
	//    5   11:ldc1            #84  <String "p">
	//    6   13:aload_2         
	//    7   14:invokevirtual   #676 <Method String Path.toString()>
	//    8   17:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//    9   22:pop             
		((Map) (hashmap)).put("d", obj);
	//   10   23:aload           5
	//   11   25:ldc1            #120 <String "d">
	//   12   27:aload_3         
	//   13   28:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   14   33:pop             
		if(logger.logsDebug())
	//*  15   34:aload_0         
	//*  16   35:getfield        #277 <Field LogWrapper logger>
	//*  17   38:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  18   41:ifeq            94
		{
			path = ((Path) (logger));
	//   19   44:aload_0         
	//   20   45:getfield        #277 <Field LogWrapper logger>
	//   21   48:astore_2        
			obj = ((Object) (new StringBuilder()));
	//   22   49:new             #253 <Class StringBuilder>
	//   23   52:dup             
	//   24   53:invokespecial   #254 <Method void StringBuilder()>
	//   25   56:astore_3        
			((StringBuilder) (obj)).append("onDisconnect ");
	//   26   57:aload_3         
	//   27   58:ldc2            #725 <String "onDisconnect ">
	//   28   61:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   29   64:pop             
			((StringBuilder) (obj)).append(s);
	//   30   65:aload_3         
	//   31   66:aload_1         
	//   32   67:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
			((StringBuilder) (obj)).append(" ");
	//   34   71:aload_3         
	//   35   72:ldc2            #432 <String " ">
	//   36   75:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
			((StringBuilder) (obj)).append(((Object) (hashmap)));
	//   38   79:aload_3         
	//   39   80:aload           5
	//   40   82:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   41   85:pop             
			((LogWrapper) (path)).debug(((StringBuilder) (obj)).toString());
	//   42   86:aload_2         
	//   43   87:aload_3         
	//   44   88:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   45   91:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		sendAction(s, ((Map) (hashmap)), new ResponseListener() {

			public void onResponse(Map map)
			{
				Object obj1 = ((Object) ((String)map.get("s")));
			//    0    0:aload_1         
			//    1    1:ldc1            #29  <String "s">
			//    2    3:invokeinterface #35  <Method Object Map.get(Object)>
			//    3    8:checkcast       #37  <Class String>
			//    4   11:astore_2        
				if(!((String) (obj1)).equals("ok"))
			//*   5   12:aload_2         
			//*   6   13:ldc1            #39  <String "ok">
			//*   7   15:invokevirtual   #43  <Method boolean String.equals(Object)>
			//*   8   18:ifne            40
					map = ((Map) (FirebaseError.fromStatus(((String) (obj1)), (String)map.get("d"))));
			//    9   21:aload_2         
			//   10   22:aload_1         
			//   11   23:ldc1            #45  <String "d">
			//   12   25:invokeinterface #35  <Method Object Map.get(Object)>
			//   13   30:checkcast       #37  <Class String>
			//   14   33:invokestatic    #51  <Method FirebaseError FirebaseError.fromStatus(String, String)>
			//   15   36:astore_1        
				else
			//*  16   37:goto            42
					map = null;
			//   17   40:aconst_null     
			//   18   41:astore_1        
				obj1 = ((Object) (onComplete));
			//   19   42:aload_0         
			//   20   43:getfield        #21  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
			//   21   46:astore_2        
				if(obj1 != null)
			//*  22   47:aload_2         
			//*  23   48:ifnull          59
					((com.firebase.client.Firebase.CompletionListener) (obj1)).onComplete(((FirebaseError) (map)), ((Firebase) (null)));
			//   24   51:aload_2         
			//   25   52:aload_1         
			//   26   53:aconst_null     
			//   27   54:invokeinterface #57  <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
			//   28   59:return          
			}

			final PersistentConnection this$0;
			final com.firebase.client.Firebase.CompletionListener val$onComplete;

			
			{
				this$0 = PersistentConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PersistentConnection this$0>
				onComplete = completionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:aload           5
	//   49   98:new             #12  <Class PersistentConnection$3>
	//   50  101:dup             
	//   51  102:aload_0         
	//   52  103:aload           4
	//   53  105:invokespecial   #728 <Method void PersistentConnection$3(PersistentConnection, com.firebase.client.Firebase$CompletionListener)>
	//   54  108:invokespecial   #638 <Method void sendAction(String, Map, PersistentConnection$ResponseListener)>
	//   55  111:return          
	}

	private void sendPut(final long putId)
	{
		final OutstandingPut put = (OutstandingPut)outstandingPuts.get(((Object) (Long.valueOf(putId))));
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field Map outstandingPuts>
	//    2    4:lload_1         
	//    3    5:invokestatic    #412 <Method Long Long.valueOf(long)>
	//    4    8:invokeinterface #444 <Method Object Map.get(Object)>
	//    5   13:checkcast       #37  <Class PersistentConnection$OutstandingPut>
	//    6   16:astore_3        
		final com.firebase.client.Firebase.CompletionListener onComplete = put.getOnComplete();
	//    7   17:aload_3         
	//    8   18:invokevirtual   #355 <Method com.firebase.client.Firebase$CompletionListener PersistentConnection$OutstandingPut.getOnComplete()>
	//    9   21:astore          4
		final String action = put.getAction();
	//   10   23:aload_3         
	//   11   24:invokevirtual   #729 <Method String PersistentConnection$OutstandingPut.getAction()>
	//   12   27:astore          5
		sendAction(action, put.getRequest(), new ResponseListener() {

			public void onResponse(Map map)
			{
				if(logger.logsDebug())
			//*   0    0:aload_0         
			//*   1    1:getfield        #25  <Field PersistentConnection this$0>
			//*   2    4:invokestatic    #43  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
			//*   3    7:invokevirtual   #49  <Method boolean LogWrapper.logsDebug()>
			//*   4   10:ifeq            59
				{
					LogWrapper logwrapper = logger;
			//    5   13:aload_0         
			//    6   14:getfield        #25  <Field PersistentConnection this$0>
			//    7   17:invokestatic    #43  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
			//    8   20:astore_2        
					StringBuilder stringbuilder1 = new StringBuilder();
			//    9   21:new             #51  <Class StringBuilder>
			//   10   24:dup             
			//   11   25:invokespecial   #52  <Method void StringBuilder()>
			//   12   28:astore_3        
					stringbuilder1.append(action);
			//   13   29:aload_3         
			//   14   30:aload_0         
			//   15   31:getfield        #27  <Field String val$action>
			//   16   34:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//   17   37:pop             
					stringbuilder1.append(" response: ");
			//   18   38:aload_3         
			//   19   39:ldc1            #58  <String " response: ">
			//   20   41:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//   21   44:pop             
					stringbuilder1.append(((Object) (map)));
			//   22   45:aload_3         
			//   23   46:aload_1         
			//   24   47:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
			//   25   50:pop             
					logwrapper.debug(stringbuilder1.toString());
			//   26   51:aload_2         
			//   27   52:aload_3         
			//   28   53:invokevirtual   #65  <Method String StringBuilder.toString()>
			//   29   56:invokevirtual   #69  <Method void LogWrapper.debug(String)>
				}
				if((OutstandingPut)outstandingPuts.get(((Object) (Long.valueOf(putId)))) == put)
			//*  30   59:aload_0         
			//*  31   60:getfield        #25  <Field PersistentConnection this$0>
			//*  32   63:invokestatic    #73  <Method Map PersistentConnection.access$1200(PersistentConnection)>
			//*  33   66:aload_0         
			//*  34   67:getfield        #29  <Field long val$putId>
			//*  35   70:invokestatic    #79  <Method Long Long.valueOf(long)>
			//*  36   73:invokeinterface #85  <Method Object Map.get(Object)>
			//*  37   78:checkcast       #87  <Class PersistentConnection$OutstandingPut>
			//*  38   81:aload_0         
			//*  39   82:getfield        #31  <Field PersistentConnection$OutstandingPut val$put>
			//*  40   85:if_acmpne       174
				{
					outstandingPuts.remove(((Object) (Long.valueOf(putId))));
			//   41   88:aload_0         
			//   42   89:getfield        #25  <Field PersistentConnection this$0>
			//   43   92:invokestatic    #73  <Method Map PersistentConnection.access$1200(PersistentConnection)>
			//   44   95:aload_0         
			//   45   96:getfield        #29  <Field long val$putId>
			//   46   99:invokestatic    #79  <Method Long Long.valueOf(long)>
			//   47  102:invokeinterface #90  <Method Object Map.remove(Object)>
			//   48  107:pop             
					if(onComplete != null)
			//*  49  108:aload_0         
			//*  50  109:getfield        #33  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
			//*  51  112:ifnull          234
					{
						String s = (String)map.get("s");
			//   52  115:aload_1         
			//   53  116:ldc1            #92  <String "s">
			//   54  118:invokeinterface #85  <Method Object Map.get(Object)>
			//   55  123:checkcast       #94  <Class String>
			//   56  126:astore_2        
						if(s.equals("ok"))
			//*  57  127:aload_2         
			//*  58  128:ldc1            #96  <String "ok">
			//*  59  130:invokevirtual   #100 <Method boolean String.equals(Object)>
			//*  60  133:ifeq            148
						{
							onComplete.onComplete(((FirebaseError) (null)), ((Firebase) (null)));
			//   61  136:aload_0         
			//   62  137:getfield        #33  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
			//   63  140:aconst_null     
			//   64  141:aconst_null     
			//   65  142:invokeinterface #106 <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
							return;
			//   66  147:return          
						} else
						{
							onComplete.onComplete(FirebaseError.fromStatus(s, (String)map.get("d")), ((Firebase) (null)));
			//   67  148:aload_0         
			//   68  149:getfield        #33  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
			//   69  152:aload_2         
			//   70  153:aload_1         
			//   71  154:ldc1            #108 <String "d">
			//   72  156:invokeinterface #85  <Method Object Map.get(Object)>
			//   73  161:checkcast       #94  <Class String>
			//   74  164:invokestatic    #114 <Method FirebaseError FirebaseError.fromStatus(String, String)>
			//   75  167:aconst_null     
			//   76  168:invokeinterface #106 <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
							return;
			//   77  173:return          
						}
					}
				} else
				if(logger.logsDebug())
			//*  78  174:aload_0         
			//*  79  175:getfield        #25  <Field PersistentConnection this$0>
			//*  80  178:invokestatic    #43  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
			//*  81  181:invokevirtual   #49  <Method boolean LogWrapper.logsDebug()>
			//*  82  184:ifeq            234
				{
					map = ((Map) (logger));
			//   83  187:aload_0         
			//   84  188:getfield        #25  <Field PersistentConnection this$0>
			//   85  191:invokestatic    #43  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
			//   86  194:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
			//   87  195:new             #51  <Class StringBuilder>
			//   88  198:dup             
			//   89  199:invokespecial   #52  <Method void StringBuilder()>
			//   90  202:astore_2        
					stringbuilder.append("Ignoring on complete for put ");
			//   91  203:aload_2         
			//   92  204:ldc1            #116 <String "Ignoring on complete for put ">
			//   93  206:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//   94  209:pop             
					stringbuilder.append(putId);
			//   95  210:aload_2         
			//   96  211:aload_0         
			//   97  212:getfield        #29  <Field long val$putId>
			//   98  215:invokevirtual   #119 <Method StringBuilder StringBuilder.append(long)>
			//   99  218:pop             
					stringbuilder.append(" because it was removed already.");
			//  100  219:aload_2         
			//  101  220:ldc1            #121 <String " because it was removed already.">
			//  102  222:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//  103  225:pop             
					((LogWrapper) (map)).debug(stringbuilder.toString());
			//  104  226:aload_1         
			//  105  227:aload_2         
			//  106  228:invokevirtual   #65  <Method String StringBuilder.toString()>
			//  107  231:invokevirtual   #69  <Method void LogWrapper.debug(String)>
				}
			//  108  234:return          
			}

			final PersistentConnection this$0;
			final String val$action;
			final com.firebase.client.Firebase.CompletionListener val$onComplete;
			final OutstandingPut val$put;
			final long val$putId;

			
			{
				this$0 = PersistentConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field PersistentConnection this$0>
				action = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field String val$action>
				putId = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #29  <Field long val$putId>
				put = outstandingput;
			//    9   15:aload_0         
			//   10   16:aload           5
			//   11   18:putfield        #31  <Field PersistentConnection$OutstandingPut val$put>
				onComplete = completionlistener;
			//   12   21:aload_0         
			//   13   22:aload           6
			//   14   24:putfield        #33  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//   13   29:aload_0         
	//   14   30:aload           5
	//   15   32:aload_3         
	//   16   33:invokevirtual   #347 <Method Map PersistentConnection$OutstandingPut.getRequest()>
	//   17   36:new             #16  <Class PersistentConnection$5>
	//   18   39:dup             
	//   19   40:aload_0         
	//   20   41:aload           5
	//   21   43:lload_1         
	//   22   44:aload_3         
	//   23   45:aload           4
	//   24   47:invokespecial   #732 <Method void PersistentConnection$5(PersistentConnection, String, long, PersistentConnection$OutstandingPut, com.firebase.client.Firebase$CompletionListener)>
	//   25   50:invokespecial   #638 <Method void sendAction(String, Map, PersistentConnection$ResponseListener)>
	//   26   53:return          
	}

	private void sendStats(Map map)
	{
		if(!map.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #733 <Method boolean Map.isEmpty()>
	//*   2    6:ifne            43
		{
			HashMap hashmap = new HashMap();
	//    3    9:new             #230 <Class HashMap>
	//    4   12:dup             
	//    5   13:invokespecial   #231 <Method void HashMap()>
	//    6   16:astore_2        
			((Map) (hashmap)).put("c", ((Object) (map)));
	//    7   17:aload_2         
	//    8   18:ldc1            #111 <String "c">
	//    9   20:aload_1         
	//   10   21:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   11   26:pop             
			sendAction("s", ((Map) (hashmap)), new ResponseListener() {

				public void onResponse(Map map1)
				{
					String s = (String)map1.get("s");
				//    0    0:aload_1         
				//    1    1:ldc1            #24  <String "s">
				//    2    3:invokeinterface #30  <Method Object Map.get(Object)>
				//    3    8:checkcast       #32  <Class String>
				//    4   11:astore_2        
					if(!s.equals("ok"))
				//*   5   12:aload_2         
				//*   6   13:ldc1            #34  <String "ok">
				//*   7   15:invokevirtual   #38  <Method boolean String.equals(Object)>
				//*   8   18:ifne            87
					{
						map1 = ((Map) (FirebaseError.fromStatus(s, (String)map1.get("d"))));
				//    9   21:aload_2         
				//   10   22:aload_1         
				//   11   23:ldc1            #40  <String "d">
				//   12   25:invokeinterface #30  <Method Object Map.get(Object)>
				//   13   30:checkcast       #32  <Class String>
				//   14   33:invokestatic    #46  <Method FirebaseError FirebaseError.fromStatus(String, String)>
				//   15   36:astore_1        
						if(logger.logsDebug())
				//*  16   37:aload_0         
				//*  17   38:getfield        #17  <Field PersistentConnection this$0>
				//*  18   41:invokestatic    #50  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
				//*  19   44:invokevirtual   #56  <Method boolean LogWrapper.logsDebug()>
				//*  20   47:ifeq            87
						{
							LogWrapper logwrapper = logger;
				//   21   50:aload_0         
				//   22   51:getfield        #17  <Field PersistentConnection this$0>
				//   23   54:invokestatic    #50  <Method LogWrapper PersistentConnection.access$1100(PersistentConnection)>
				//   24   57:astore_2        
							StringBuilder stringbuilder = new StringBuilder();
				//   25   58:new             #58  <Class StringBuilder>
				//   26   61:dup             
				//   27   62:invokespecial   #59  <Method void StringBuilder()>
				//   28   65:astore_3        
							stringbuilder.append("Failed to send stats: ");
				//   29   66:aload_3         
				//   30   67:ldc1            #61  <String "Failed to send stats: ">
				//   31   69:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
				//   32   72:pop             
							stringbuilder.append(((Object) (map1)));
				//   33   73:aload_3         
				//   34   74:aload_1         
				//   35   75:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
				//   36   78:pop             
							logwrapper.debug(stringbuilder.toString());
				//   37   79:aload_2         
				//   38   80:aload_3         
				//   39   81:invokevirtual   #72  <Method String StringBuilder.toString()>
				//   40   84:invokevirtual   #76  <Method void LogWrapper.debug(String)>
						}
					}
				//   41   87:return          
				}

				final PersistentConnection this$0;

			
			{
				this$0 = PersistentConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PersistentConnection this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   12   27:aload_0         
	//   13   28:ldc1            #93  <String "s">
	//   14   30:aload_2         
	//   15   31:new             #20  <Class PersistentConnection$7>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:invokespecial   #735 <Method void PersistentConnection$7(PersistentConnection)>
	//   19   39:invokespecial   #638 <Method void sendAction(String, Map, PersistentConnection$ResponseListener)>
			return;
	//   20   42:return          
		}
		if(logger.logsDebug())
	//*  21   43:aload_0         
	//*  22   44:getfield        #277 <Field LogWrapper logger>
	//*  23   47:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  24   50:ifeq            63
			logger.debug("Not sending stats because stats are empty");
	//   25   53:aload_0         
	//   26   54:getfield        #277 <Field LogWrapper logger>
	//   27   57:ldc2            #737 <String "Not sending stats because stats are empty">
	//   28   60:invokevirtual   #394 <Method void LogWrapper.debug(String)>
	//   29   63:return          
	}

	private void sendUnlisten(OutstandingListen outstandinglisten)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #230 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #231 <Method void HashMap()>
	//    3    7:astore_2        
		((Map) (hashmap)).put("p", ((Object) (outstandinglisten.query.getPath().toString())));
	//    4    8:aload_2         
	//    5    9:ldc1            #84  <String "p">
	//    6   11:aload_1         
	//    7   12:invokestatic    #743 <Method QuerySpec PersistentConnection$OutstandingListen.access$400(PersistentConnection$OutstandingListen)>
	//    8   15:invokevirtual   #675 <Method Path QuerySpec.getPath()>
	//    9   18:invokevirtual   #676 <Method String Path.toString()>
	//   10   21:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   11   26:pop             
		Tag tag = outstandinglisten.getTag();
	//   12   27:aload_1         
	//   13   28:invokevirtual   #680 <Method Tag PersistentConnection$OutstandingListen.getTag()>
	//   14   31:astore_3        
		if(tag != null)
	//*  15   32:aload_3         
	//*  16   33:ifnull          71
		{
			((Map) (hashmap)).put("q", ((Object) (outstandinglisten.getQuery().getParams().getWireProtocolParams())));
	//   17   36:aload_2         
	//   18   37:ldc1            #87  <String "q">
	//   19   39:aload_1         
	//   20   40:invokevirtual   #574 <Method QuerySpec PersistentConnection$OutstandingListen.getQuery()>
	//   21   43:invokevirtual   #684 <Method QueryParams QuerySpec.getParams()>
	//   22   46:invokevirtual   #689 <Method Map QueryParams.getWireProtocolParams()>
	//   23   49:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   24   54:pop             
			((Map) (hashmap)).put("t", ((Object) (Long.valueOf(tag.getTagNumber()))));
	//   25   55:aload_2         
	//   26   56:ldc1            #135 <String "t">
	//   27   58:aload_3         
	//   28   59:invokevirtual   #692 <Method long Tag.getTagNumber()>
	//   29   62:invokestatic    #412 <Method Long Long.valueOf(long)>
	//   30   65:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   31   70:pop             
		}
		sendAction("n", ((Map) (hashmap)), ((ResponseListener) (null)));
	//   32   71:aload_0         
	//   33   72:ldc1            #90  <String "n">
	//   34   74:aload_2         
	//   35   75:aconst_null     
	//   36   76:invokespecial   #638 <Method void sendAction(String, Map, PersistentConnection$ResponseListener)>
	//   37   79:return          
	}

	private void warnOnListenerWarnings(List list, QuerySpec queryspec)
	{
		if(list.contains("no_index"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #745 <String "no_index">
	//*   2    4:invokeinterface #748 <Method boolean List.contains(Object)>
	//*   3    9:ifeq            119
		{
			list = ((List) (new StringBuilder()));
	//    4   12:new             #253 <Class StringBuilder>
	//    5   15:dup             
	//    6   16:invokespecial   #254 <Method void StringBuilder()>
	//    7   19:astore_1        
			((StringBuilder) (list)).append("\".indexOn\": \"");
	//    8   20:aload_1         
	//    9   21:ldc2            #750 <String "\".indexOn\": \"">
	//   10   24:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:pop             
			((StringBuilder) (list)).append(queryspec.getIndex().getQueryDefinition());
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokevirtual   #754 <Method Index QuerySpec.getIndex()>
	//   15   33:invokevirtual   #759 <Method String Index.getQueryDefinition()>
	//   16   36:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
			((StringBuilder) (list)).append('"');
	//   18   40:aload_1         
	//   19   41:bipush          34
	//   20   43:invokevirtual   #762 <Method StringBuilder StringBuilder.append(char)>
	//   21   46:pop             
			list = ((List) (((StringBuilder) (list)).toString()));
	//   22   47:aload_1         
	//   23   48:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   24   51:astore_1        
			LogWrapper logwrapper = logger;
	//   25   52:aload_0         
	//   26   53:getfield        #277 <Field LogWrapper logger>
	//   27   56:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   28   57:new             #253 <Class StringBuilder>
	//   29   60:dup             
	//   30   61:invokespecial   #254 <Method void StringBuilder()>
	//   31   64:astore          4
			stringbuilder.append("Using an unspecified index. Consider adding '");
	//   32   66:aload           4
	//   33   68:ldc2            #764 <String "Using an unspecified index. Consider adding '">
	//   34   71:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
			stringbuilder.append(((String) (list)));
	//   36   75:aload           4
	//   37   77:aload_1         
	//   38   78:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			stringbuilder.append("' at ");
	//   40   82:aload           4
	//   41   84:ldc2            #766 <String "' at ">
	//   42   87:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   43   90:pop             
			stringbuilder.append(((Object) (queryspec.getPath())));
	//   44   91:aload           4
	//   45   93:aload_2         
	//   46   94:invokevirtual   #675 <Method Path QuerySpec.getPath()>
	//   47   97:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   48  100:pop             
			stringbuilder.append(" to your security and Firebase rules for better performance");
	//   49  101:aload           4
	//   50  103:ldc2            #768 <String " to your security and Firebase rules for better performance">
	//   51  106:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   52  109:pop             
			logwrapper.warn(stringbuilder.toString());
	//   53  110:aload_3         
	//   54  111:aload           4
	//   55  113:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   56  116:invokevirtual   #771 <Method void LogWrapper.warn(String)>
		}
	//   57  119:return          
	}

	public void auth(String s, com.firebase.client.Firebase.AuthListener authlistener)
	{
		AuthCredential authcredential = authCredential;
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//    2    4:astore_3        
		if(authcredential == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       25
			authCredential = new AuthCredential(authlistener, s);
	//    5    9:aload_0         
	//    6   10:new             #22  <Class PersistentConnection$AuthCredential>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokespecial   #776 <Method void PersistentConnection$AuthCredential(com.firebase.client.Firebase$AuthListener, String)>
	//   11   19:putfield        #302 <Field PersistentConnection$AuthCredential authCredential>
		else
	//*  12   22:goto            82
		if(authcredential.matches(s))
	//*  13   25:aload_3         
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #780 <Method boolean PersistentConnection$AuthCredential.matches(String)>
	//*  16   30:ifeq            62
		{
			authCredential.addListener(authlistener);
	//   17   33:aload_0         
	//   18   34:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #784 <Method void PersistentConnection$AuthCredential.addListener(com.firebase.client.Firebase$AuthListener)>
			if(authCredential.isComplete())
	//*  21   41:aload_0         
	//*  22   42:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//*  23   45:invokevirtual   #787 <Method boolean PersistentConnection$AuthCredential.isComplete()>
	//*  24   48:ifeq            82
				authCredential.replay(authlistener);
	//   25   51:aload_0         
	//   26   52:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #790 <Method void PersistentConnection$AuthCredential.replay(com.firebase.client.Firebase$AuthListener)>
		} else
	//*  29   59:goto            82
		{
			authCredential.preempt();
	//   30   62:aload_0         
	//   31   63:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//   32   66:invokevirtual   #793 <Method void PersistentConnection$AuthCredential.preempt()>
			authCredential = new AuthCredential(authlistener, s);
	//   33   69:aload_0         
	//   34   70:new             #22  <Class PersistentConnection$AuthCredential>
	//   35   73:dup             
	//   36   74:aload_2         
	//   37   75:aload_1         
	//   38   76:invokespecial   #776 <Method void PersistentConnection$AuthCredential(com.firebase.client.Firebase$AuthListener, String)>
	//   39   79:putfield        #302 <Field PersistentConnection$AuthCredential authCredential>
		}
		if(connected())
	//*  40   82:aload_0         
	//*  41   83:invokespecial   #795 <Method boolean connected()>
	//*  42   86:ifeq            138
		{
			if(logger.logsDebug())
	//*  43   89:aload_0         
	//*  44   90:getfield        #277 <Field LogWrapper logger>
	//*  45   93:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  46   96:ifeq            134
			{
				authlistener = ((com.firebase.client.Firebase.AuthListener) (logger));
	//   47   99:aload_0         
	//   48  100:getfield        #277 <Field LogWrapper logger>
	//   49  103:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   50  104:new             #253 <Class StringBuilder>
	//   51  107:dup             
	//   52  108:invokespecial   #254 <Method void StringBuilder()>
	//   53  111:astore_3        
				stringbuilder.append("Authenticating with credential: ");
	//   54  112:aload_3         
	//   55  113:ldc2            #797 <String "Authenticating with credential: ">
	//   56  116:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   57  119:pop             
				stringbuilder.append(s);
	//   58  120:aload_3         
	//   59  121:aload_1         
	//   60  122:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   61  125:pop             
				((LogWrapper) (authlistener)).debug(stringbuilder.toString());
	//   62  126:aload_2         
	//   63  127:aload_3         
	//   64  128:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   65  131:invokevirtual   #394 <Method void LogWrapper.debug(String)>
			}
			sendAuth();
	//   66  134:aload_0         
	//   67  135:invokespecial   #799 <Method void sendAuth()>
		}
	//   68  138:return          
	}

	public void establishConnection()
	{
		if(shouldReconnect)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field boolean shouldReconnect>
	//*   2    4:ifeq            50
		{
			lastConnectionAttemptTime = System.currentTimeMillis();
	//    3    7:aload_0         
	//    4    8:invokestatic    #400 <Method long System.currentTimeMillis()>
	//    5   11:putfield        #802 <Field long lastConnectionAttemptTime>
			lastConnectionEstablishedTime = 0L;
	//    6   14:aload_0         
	//    7   15:lconst_0        
	//    8   16:putfield        #804 <Field long lastConnectionEstablishedTime>
			realtime = new Connection(ctx, repoInfo, ((com.firebase.client.realtime.Connection.Delegate) (this)), lastSessionId);
	//    9   19:aload_0         
	//   10   20:new             #621 <Class Connection>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #226 <Field Context ctx>
	//   14   28:aload_0         
	//   15   29:getfield        #228 <Field RepoInfo repoInfo>
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #279 <Field String lastSessionId>
	//   19   37:invokespecial   #807 <Method void Connection(Context, RepoInfo, com.firebase.client.realtime.Connection$Delegate, String)>
	//   20   40:putfield        #619 <Field Connection realtime>
			realtime.open();
	//   21   43:aload_0         
	//   22   44:getfield        #619 <Field Connection realtime>
	//   23   47:invokevirtual   #810 <Method void Connection.open()>
		}
	//   24   50:return          
	}

	public Map getListens()
	{
		return listens;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field Map listens>
	//    2    4:areturn         
	}

	void interrupt()
	{
		shouldReconnect = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #209 <Field boolean shouldReconnect>
		Object obj = ((Object) (realtime));
	//    3    5:aload_0         
	//    4    6:getfield        #619 <Field Connection realtime>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          24
		{
			((Connection) (obj)).close();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #816 <Method void Connection.close()>
			realtime = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #619 <Field Connection realtime>
			return;
	//   13   23:return          
		}
		obj = ((Object) (reconnectFuture));
	//   14   24:aload_0         
	//   15   25:getfield        #818 <Field ScheduledFuture reconnectFuture>
	//   16   28:astore_1        
		if(obj != null)
	//*  17   29:aload_1         
	//*  18   30:ifnull          46
		{
			((ScheduledFuture) (obj)).cancel(false);
	//   19   33:aload_1         
	//   20   34:iconst_0        
	//   21   35:invokeinterface #824 <Method boolean ScheduledFuture.cancel(boolean)>
	//   22   40:pop             
			reconnectFuture = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #818 <Field ScheduledFuture reconnectFuture>
		}
		onDisconnect(com.firebase.client.realtime.Connection.DisconnectReason.OTHER);
	//   26   46:aload_0         
	//   27   47:getstatic       #830 <Field com.firebase.client.realtime.Connection$DisconnectReason com.firebase.client.realtime.Connection$DisconnectReason.OTHER>
	//   28   50:invokevirtual   #834 <Method void onDisconnect(com.firebase.client.realtime.Connection$DisconnectReason)>
	//   29   53:return          
	}

	public void listen(QuerySpec queryspec, SyncTree.SyncTreeHash synctreehash, Tag tag, RequestResultListener requestresultlistener)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            51
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #253 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #254 <Method void StringBuilder()>
	//   10   23:astore          7
			stringbuilder.append("Listening on ");
	//   11   25:aload           7
	//   12   27:ldc2            #838 <String "Listening on ">
	//   13   30:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
			stringbuilder.append(((Object) (queryspec)));
	//   15   34:aload           7
	//   16   36:aload_1         
	//   17   37:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   41:aload           6
	//   20   43:aload           7
	//   21   45:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   22   48:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		boolean flag;
		if(!queryspec.isDefault() && queryspec.loadsAllData())
	//*  23   51:aload_1         
	//*  24   52:invokevirtual   #841 <Method boolean QuerySpec.isDefault()>
	//*  25   55:ifne            74
	//*  26   58:aload_1         
	//*  27   59:invokevirtual   #844 <Method boolean QuerySpec.loadsAllData()>
	//*  28   62:ifne            68
	//*  29   65:goto            74
			flag = false;
	//   30   68:iconst_0        
	//   31   69:istore          5
		else
	//*  32   71:goto            77
			flag = true;
	//   33   74:iconst_1        
	//   34   75:istore          5
		Utilities.hardAssert(flag, "listen() called for non-default but complete query");
	//   35   77:iload           5
	//   36   79:ldc2            #846 <String "listen() called for non-default but complete query">
	//   37   82:invokestatic    #850 <Method void Utilities.hardAssert(boolean, String)>
		Utilities.hardAssert(listens.containsKey(((Object) (queryspec))) ^ true, "listen() called twice for same QuerySpec.");
	//   38   85:aload_0         
	//   39   86:getfield        #233 <Field Map listens>
	//   40   89:aload_1         
	//   41   90:invokeinterface #351 <Method boolean Map.containsKey(Object)>
	//   42   95:iconst_1        
	//   43   96:ixor            
	//   44   97:ldc2            #852 <String "listen() called twice for same QuerySpec.">
	//   45  100:invokestatic    #850 <Method void Utilities.hardAssert(boolean, String)>
		if(logger.logsDebug())
	//*  46  103:aload_0         
	//*  47  104:getfield        #277 <Field LogWrapper logger>
	//*  48  107:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  49  110:ifeq            154
		{
			LogWrapper logwrapper1 = logger;
	//   50  113:aload_0         
	//   51  114:getfield        #277 <Field LogWrapper logger>
	//   52  117:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
	//   53  119:new             #253 <Class StringBuilder>
	//   54  122:dup             
	//   55  123:invokespecial   #254 <Method void StringBuilder()>
	//   56  126:astore          7
			stringbuilder1.append("Adding listen query: ");
	//   57  128:aload           7
	//   58  130:ldc2            #854 <String "Adding listen query: ">
	//   59  133:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   60  136:pop             
			stringbuilder1.append(((Object) (queryspec)));
	//   61  137:aload           7
	//   62  139:aload_1         
	//   63  140:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   64  143:pop             
			logwrapper1.debug(stringbuilder1.toString());
	//   65  144:aload           6
	//   66  146:aload           7
	//   67  148:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   68  151:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		synctreehash = ((SyncTree.SyncTreeHash) (new OutstandingListen(requestresultlistener, queryspec, tag, synctreehash)));
	//   69  154:new             #34  <Class PersistentConnection$OutstandingListen>
	//   70  157:dup             
	//   71  158:aload           4
	//   72  160:aload_1         
	//   73  161:aload_3         
	//   74  162:aload_2         
	//   75  163:aconst_null     
	//   76  164:invokespecial   #857 <Method void PersistentConnection$OutstandingListen(PersistentConnection$RequestResultListener, QuerySpec, Tag, SyncTree$SyncTreeHash, PersistentConnection$1)>
	//   77  167:astore_2        
		listens.put(((Object) (queryspec)), ((Object) (synctreehash)));
	//   78  168:aload_0         
	//   79  169:getfield        #233 <Field Map listens>
	//   80  172:aload_1         
	//   81  173:aload_2         
	//   82  174:invokeinterface #379 <Method Object Map.put(Object, Object)>
	//   83  179:pop             
		if(connected())
	//*  84  180:aload_0         
	//*  85  181:invokespecial   #795 <Method boolean connected()>
	//*  86  184:ifeq            192
			sendListen(((OutstandingListen) (synctreehash)));
	//   87  187:aload_0         
	//   88  188:aload_2         
	//   89  189:invokespecial   #578 <Method void sendListen(PersistentConnection$OutstandingListen)>
	//   90  192:return          
	}

	public void merge(String s, Object obj, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
		putInternal("m", s, obj, ((String) (null)), completionlistener);
	//    0    0:aload_0         
	//    1    1:ldc1            #72  <String "m">
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:aconst_null     
	//    5    6:aload_3         
	//    6    7:invokespecial   #861 <Method void putInternal(String, String, Object, String, com.firebase.client.Firebase$CompletionListener)>
	//    7   10:return          
	}

	public void onDataMessage(Map map)
	{
		if(map.containsKey("r"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #126 <String "r">
	//*   2    3:invokeinterface #351 <Method boolean Map.containsKey(Object)>
	//*   3    8:ifeq            69
		{
			long l = ((Integer)map.get("r")).intValue();
	//    4   11:aload_1         
	//    5   12:ldc1            #126 <String "r">
	//    6   14:invokeinterface #444 <Method Object Map.get(Object)>
	//    7   19:checkcast       #651 <Class Integer>
	//    8   22:invokevirtual   #865 <Method int Integer.intValue()>
	//    9   25:i2l             
	//   10   26:lstore_2        
			ResponseListener responselistener = (ResponseListener)requestCBHash.remove(((Object) (Long.valueOf(l))));
	//   11   27:aload_0         
	//   12   28:getfield        #235 <Field Map requestCBHash>
	//   13   31:lload_2         
	//   14   32:invokestatic    #412 <Method Long Long.valueOf(long)>
	//   15   35:invokeinterface #551 <Method Object Map.remove(Object)>
	//   16   40:checkcast       #43  <Class PersistentConnection$ResponseListener>
	//   17   43:astore          4
			if(responselistener != null)
	//*  18   45:aload           4
	//*  19   47:ifnull          170
			{
				responselistener.onResponse((Map)map.get("b"));
	//   20   50:aload           4
	//   21   52:aload_1         
	//   22   53:ldc1            #130 <String "b">
	//   23   55:invokeinterface #444 <Method Object Map.get(Object)>
	//   24   60:checkcast       #319 <Class Map>
	//   25   63:invokeinterface #868 <Method void PersistentConnection$ResponseListener.onResponse(Map)>
				return;
	//   26   68:return          
			}
		} else
		{
			if(map.containsKey("error"))
	//*  27   69:aload_1         
	//*  28   70:ldc1            #123 <String "error">
	//*  29   72:invokeinterface #351 <Method boolean Map.containsKey(Object)>
	//*  30   77:ifeq            81
				return;
	//   31   80:return          
			if(map.containsKey("a"))
	//*  32   81:aload_1         
	//*  33   82:ldc1            #63  <String "a">
	//*  34   84:invokeinterface #351 <Method boolean Map.containsKey(Object)>
	//*  35   89:ifeq            119
			{
				onDataPush((String)map.get("a"), (Map)map.get("b"));
	//   36   92:aload_0         
	//   37   93:aload_1         
	//   38   94:ldc1            #63  <String "a">
	//   39   96:invokeinterface #444 <Method Object Map.get(Object)>
	//   40  101:checkcast       #437 <Class String>
	//   41  104:aload_1         
	//   42  105:ldc1            #130 <String "b">
	//   43  107:invokeinterface #444 <Method Object Map.get(Object)>
	//   44  112:checkcast       #319 <Class Map>
	//   45  115:invokespecial   #870 <Method void onDataPush(String, Map)>
				return;
	//   46  118:return          
			}
			if(logger.logsDebug())
	//*  47  119:aload_0         
	//*  48  120:getfield        #277 <Field LogWrapper logger>
	//*  49  123:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  50  126:ifeq            170
			{
				LogWrapper logwrapper = logger;
	//   51  129:aload_0         
	//   52  130:getfield        #277 <Field LogWrapper logger>
	//   53  133:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   54  135:new             #253 <Class StringBuilder>
	//   55  138:dup             
	//   56  139:invokespecial   #254 <Method void StringBuilder()>
	//   57  142:astore          5
				stringbuilder.append("Ignoring unknown message: ");
	//   58  144:aload           5
	//   59  146:ldc2            #872 <String "Ignoring unknown message: ">
	//   60  149:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   61  152:pop             
				stringbuilder.append(((Object) (map)));
	//   62  153:aload           5
	//   63  155:aload_1         
	//   64  156:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   65  159:pop             
				logwrapper.debug(stringbuilder.toString());
	//   66  160:aload           4
	//   67  162:aload           5
	//   68  164:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   69  167:invokevirtual   #394 <Method void LogWrapper.debug(String)>
			}
		}
	//   70  170:return          
	}

	public void onDisconnect(com.firebase.client.realtime.Connection.DisconnectReason disconnectreason)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            54
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
	//    7   16:new             #253 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #254 <Method void StringBuilder()>
	//   10   23:astore          7
			stringbuilder1.append("Got on disconnect due to ");
	//   11   25:aload           7
	//   12   27:ldc2            #874 <String "Got on disconnect due to ">
	//   13   30:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
			stringbuilder1.append(disconnectreason.name());
	//   15   34:aload           7
	//   16   36:aload_1         
	//   17   37:invokevirtual   #877 <Method String com.firebase.client.realtime.Connection$DisconnectReason.name()>
	//   18   40:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:pop             
			logwrapper.debug(stringbuilder1.toString());
	//   20   44:aload           6
	//   21   46:aload           7
	//   22   48:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   23   51:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		connectionState = ConnectionState.Disconnected;
	//   24   54:aload_0         
	//   25   55:getstatic       #214 <Field PersistentConnection$ConnectionState PersistentConnection$ConnectionState.Disconnected>
	//   26   58:putfield        #216 <Field PersistentConnection$ConnectionState connectionState>
		if(!shouldReconnect)
	//*  27   61:aload_0         
	//*  28   62:getfield        #209 <Field boolean shouldReconnect>
	//*  29   65:ifne            84
		{
			cancelTransactions();
	//   30   68:aload_0         
	//   31   69:invokespecial   #879 <Method void cancelTransactions()>
			requestCBHash.clear();
	//   32   72:aload_0         
	//   33   73:getfield        #235 <Field Map requestCBHash>
	//   34   76:invokeinterface #880 <Method void Map.clear()>
		} else
	//*  35   81:goto            274
		{
			com.firebase.client.realtime.Connection.DisconnectReason disconnectreason1 = com.firebase.client.realtime.Connection.DisconnectReason.SERVER_RESET;
	//   36   84:getstatic       #883 <Field com.firebase.client.realtime.Connection$DisconnectReason com.firebase.client.realtime.Connection$DisconnectReason.SERVER_RESET>
	//   37   87:astore          6
			long l = 0L;
	//   38   89:lconst_0        
	//   39   90:lstore_2        
			if(disconnectreason != disconnectreason1)
	//*  40   91:aload_1         
	//*  41   92:aload           6
	//*  42   94:if_acmpne       100
	//*  43   97:goto            171
			{
				if(lastConnectionEstablishedTime > 0L)
	//*  44  100:aload_0         
	//*  45  101:getfield        #804 <Field long lastConnectionEstablishedTime>
	//*  46  104:lconst_0        
	//*  47  105:lcmp            
	//*  48  106:ifle            136
				{
					if(System.currentTimeMillis() - lastConnectionEstablishedTime > 30000L)
	//*  49  109:invokestatic    #400 <Method long System.currentTimeMillis()>
	//*  50  112:aload_0         
	//*  51  113:getfield        #804 <Field long lastConnectionEstablishedTime>
	//*  52  116:lsub            
	//*  53  117:ldc2w           #50  <Long 30000L>
	//*  54  120:lcmp            
	//*  55  121:ifle            131
						reconnectDelay = 1000L;
	//   56  124:aload_0         
	//   57  125:ldc2w           #53  <Long 1000L>
	//   58  128:putfield        #222 <Field long reconnectDelay>
					lastConnectionEstablishedTime = 0L;
	//   59  131:aload_0         
	//   60  132:lconst_0        
	//   61  133:putfield        #804 <Field long lastConnectionEstablishedTime>
				}
				l = System.currentTimeMillis();
	//   62  136:invokestatic    #400 <Method long System.currentTimeMillis()>
	//   63  139:lstore_2        
				long l1 = lastConnectionAttemptTime;
	//   64  140:aload_0         
	//   65  141:getfield        #802 <Field long lastConnectionAttemptTime>
	//   66  144:lstore          4
				l = Math.max(1L, reconnectDelay - (l - l1));
	//   67  146:lconst_1        
	//   68  147:aload_0         
	//   69  148:getfield        #222 <Field long reconnectDelay>
	//   70  151:lload_2         
	//   71  152:lload           4
	//   72  154:lsub            
	//   73  155:lsub            
	//   74  156:invokestatic    #889 <Method long Math.max(long, long)>
	//   75  159:lstore_2        
				l = random.nextInt((int)l);
	//   76  160:aload_0         
	//   77  161:getfield        #249 <Field Random random>
	//   78  164:lload_2         
	//   79  165:l2i             
	//   80  166:invokevirtual   #893 <Method int Random.nextInt(int)>
	//   81  169:i2l             
	//   82  170:lstore_2        
			}
			if(logger.logsDebug())
	//*  83  171:aload_0         
	//*  84  172:getfield        #277 <Field LogWrapper logger>
	//*  85  175:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*  86  178:ifeq            229
			{
				disconnectreason = ((com.firebase.client.realtime.Connection.DisconnectReason) (logger));
	//   87  181:aload_0         
	//   88  182:getfield        #277 <Field LogWrapper logger>
	//   89  185:astore_1        
				StringBuilder stringbuilder = new StringBuilder();
	//   90  186:new             #253 <Class StringBuilder>
	//   91  189:dup             
	//   92  190:invokespecial   #254 <Method void StringBuilder()>
	//   93  193:astore          6
				stringbuilder.append("Reconnecting in ");
	//   94  195:aload           6
	//   95  197:ldc2            #895 <String "Reconnecting in ">
	//   96  200:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   97  203:pop             
				stringbuilder.append(l);
	//   98  204:aload           6
	//   99  206:lload_2         
	//  100  207:invokevirtual   #263 <Method StringBuilder StringBuilder.append(long)>
	//  101  210:pop             
				stringbuilder.append("ms");
	//  102  211:aload           6
	//  103  213:ldc2            #897 <String "ms">
	//  104  216:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//  105  219:pop             
				((LogWrapper) (disconnectreason)).debug(stringbuilder.toString());
	//  106  220:aload_1         
	//  107  221:aload           6
	//  108  223:invokevirtual   #269 <Method String StringBuilder.toString()>
	//  109  226:invokevirtual   #394 <Method void LogWrapper.debug(String)>
			}
			reconnectFuture = ctx.getRunLoop().schedule(new Runnable() {

				public void run()
				{
					establishConnection();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field PersistentConnection this$0>
				//    2    4:invokevirtual   #25  <Method void PersistentConnection.establishConnection()>
				//    3    7:return          
				}

				final PersistentConnection this$0;

			
			{
				this$0 = PersistentConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PersistentConnection this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
, l);
	//  110  229:aload_0         
	//  111  230:aload_0         
	//  112  231:getfield        #226 <Field Context ctx>
	//  113  234:invokevirtual   #901 <Method RunLoop Context.getRunLoop()>
	//  114  237:new             #8   <Class PersistentConnection$1>
	//  115  240:dup             
	//  116  241:aload_0         
	//  117  242:invokespecial   #902 <Method void PersistentConnection$1(PersistentConnection)>
	//  118  245:lload_2         
	//  119  246:invokeinterface #908 <Method ScheduledFuture RunLoop.schedule(Runnable, long)>
	//  120  251:putfield        #818 <Field ScheduledFuture reconnectFuture>
			reconnectDelay = Math.min(30000L, (long)((double)reconnectDelay * 1.3D));
	//  121  254:aload_0         
	//  122  255:ldc2w           #50  <Long 30000L>
	//  123  258:aload_0         
	//  124  259:getfield        #222 <Field long reconnectDelay>
	//  125  262:l2d             
	//  126  263:ldc2w           #57  <Double 1.3D>
	//  127  266:dmul            
	//  128  267:d2l             
	//  129  268:invokestatic    #911 <Method long Math.min(long, long)>
	//  130  271:putfield        #222 <Field long reconnectDelay>
		}
		_flddelegate.onDisconnect();
	//  131  274:aload_0         
	//  132  275:getfield        #224 <Field PersistentConnection$Delegate _flddelegate>
	//  133  278:invokeinterface #913 <Method void PersistentConnection$Delegate.onDisconnect()>
	//  134  283:return          
	}

	void onDisconnectCancel(Path path, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
		if(canSendWrites())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #540 <Method boolean canSendWrites()>
	//*   2    4:ifeq            17
		{
			sendOnDisconnect("oc", path, ((Object) (null)), completionlistener);
	//    3    7:aload_0         
	//    4    8:ldc1            #75  <String "oc">
	//    5   10:aload_1         
	//    6   11:aconst_null     
	//    7   12:aload_2         
	//    8   13:invokespecial   #610 <Method void sendOnDisconnect(String, Path, Object, com.firebase.client.Firebase$CompletionListener)>
			return;
	//    9   16:return          
		} else
		{
			onDisconnectRequestQueue.add(((Object) (new OutstandingDisconnect("oc", path, ((Object) (null)), completionlistener))));
	//   10   17:aload_0         
	//   11   18:getfield        #244 <Field List onDisconnectRequestQueue>
	//   12   21:new             #31  <Class PersistentConnection$OutstandingDisconnect>
	//   13   24:dup             
	//   14   25:ldc1            #75  <String "oc">
	//   15   27:aload_1         
	//   16   28:aconst_null     
	//   17   29:aload_2         
	//   18   30:aconst_null     
	//   19   31:invokespecial   #918 <Method void PersistentConnection$OutstandingDisconnect(String, Path, Object, com.firebase.client.Firebase$CompletionListener, PersistentConnection$1)>
	//   20   34:invokeinterface #478 <Method boolean List.add(Object)>
	//   21   39:pop             
			return;
	//   22   40:return          
		}
	}

	void onDisconnectMerge(Path path, Map map, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
		if(canSendWrites())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #540 <Method boolean canSendWrites()>
	//*   2    4:ifeq            17
		{
			sendOnDisconnect("om", path, ((Object) (map)), completionlistener);
	//    3    7:aload_0         
	//    4    8:ldc1            #78  <String "om">
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokespecial   #610 <Method void sendOnDisconnect(String, Path, Object, com.firebase.client.Firebase$CompletionListener)>
			return;
	//    9   16:return          
		} else
		{
			onDisconnectRequestQueue.add(((Object) (new OutstandingDisconnect("om", path, ((Object) (map)), completionlistener))));
	//   10   17:aload_0         
	//   11   18:getfield        #244 <Field List onDisconnectRequestQueue>
	//   12   21:new             #31  <Class PersistentConnection$OutstandingDisconnect>
	//   13   24:dup             
	//   14   25:ldc1            #78  <String "om">
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:aconst_null     
	//   19   31:invokespecial   #918 <Method void PersistentConnection$OutstandingDisconnect(String, Path, Object, com.firebase.client.Firebase$CompletionListener, PersistentConnection$1)>
	//   20   34:invokeinterface #478 <Method boolean List.add(Object)>
	//   21   39:pop             
			return;
	//   22   40:return          
		}
	}

	void onDisconnectPut(Path path, Object obj, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
		if(canSendWrites())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #540 <Method boolean canSendWrites()>
	//*   2    4:ifeq            17
		{
			sendOnDisconnect("o", path, obj, completionlistener);
	//    3    7:aload_0         
	//    4    8:ldc1            #81  <String "o">
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokespecial   #610 <Method void sendOnDisconnect(String, Path, Object, com.firebase.client.Firebase$CompletionListener)>
			return;
	//    9   16:return          
		} else
		{
			onDisconnectRequestQueue.add(((Object) (new OutstandingDisconnect("o", path, obj, completionlistener))));
	//   10   17:aload_0         
	//   11   18:getfield        #244 <Field List onDisconnectRequestQueue>
	//   12   21:new             #31  <Class PersistentConnection$OutstandingDisconnect>
	//   13   24:dup             
	//   14   25:ldc1            #81  <String "o">
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:aload_3         
	//   18   30:aconst_null     
	//   19   31:invokespecial   #918 <Method void PersistentConnection$OutstandingDisconnect(String, Path, Object, com.firebase.client.Firebase$CompletionListener, PersistentConnection$1)>
	//   20   34:invokeinterface #478 <Method boolean List.add(Object)>
	//   21   39:pop             
			return;
	//   22   40:return          
		}
	}

	public void onKill(String s)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            45
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #253 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #254 <Method void StringBuilder()>
	//   10   22:astore_3        
			stringbuilder.append("Firebase connection was forcefully killed by the server. Will not attempt reconnect. Reason: ");
	//   11   23:aload_3         
	//   12   24:ldc2            #926 <String "Firebase connection was forcefully killed by the server. Will not attempt reconnect. Reason: ">
	//   13   27:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(s);
	//   15   31:aload_3         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   22   42:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		shouldReconnect = false;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #209 <Field boolean shouldReconnect>
	//   26   50:return          
	}

	public void onReady(long l, String s)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            20
			logger.debug("onReady");
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:ldc2            #929 <String "onReady">
	//    7   17:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		lastConnectionEstablishedTime = System.currentTimeMillis();
	//    8   20:aload_0         
	//    9   21:invokestatic    #400 <Method long System.currentTimeMillis()>
	//   10   24:putfield        #804 <Field long lastConnectionEstablishedTime>
		handleTimestamp(l);
	//   11   27:aload_0         
	//   12   28:lload_1         
	//   13   29:invokespecial   #931 <Method void handleTimestamp(long)>
		if(firstConnection)
	//*  14   32:aload_0         
	//*  15   33:getfield        #211 <Field boolean firstConnection>
	//*  16   36:ifeq            43
			sendConnectStats();
	//   17   39:aload_0         
	//   18   40:invokespecial   #933 <Method void sendConnectStats()>
		restoreState();
	//   19   43:aload_0         
	//   20   44:invokespecial   #935 <Method void restoreState()>
		firstConnection = false;
	//   21   47:aload_0         
	//   22   48:iconst_0        
	//   23   49:putfield        #211 <Field boolean firstConnection>
		lastSessionId = s;
	//   24   52:aload_0         
	//   25   53:aload_3         
	//   26   54:putfield        #279 <Field String lastSessionId>
		_flddelegate.onConnect();
	//   27   57:aload_0         
	//   28   58:getfield        #224 <Field PersistentConnection$Delegate _flddelegate>
	//   29   61:invokeinterface #938 <Method void PersistentConnection$Delegate.onConnect()>
	//   30   66:return          
	}

	public void pauseWrites()
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            20
			logger.debug("Writes paused.");
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:ldc2            #941 <String "Writes paused.">
	//    7   17:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		writesPaused = true;
	//    8   20:aload_0         
	//    9   21:iconst_1        
	//   10   22:putfield        #237 <Field boolean writesPaused>
	//   11   25:return          
	}

	public void purgeOutstandingWrites()
	{
		FirebaseError firebaseerror = FirebaseError.fromCode(-25);
	//    0    0:bipush          -25
	//    1    2:invokestatic    #946 <Method FirebaseError FirebaseError.fromCode(int)>
	//    2    5:astore_1        
		Iterator iterator = outstandingPuts.values().iterator();
	//    3    6:aload_0         
	//    4    7:getfield        #239 <Field Map outstandingPuts>
	//    5   10:invokeinterface #568 <Method Collection Map.values()>
	//    6   15:invokeinterface #518 <Method Iterator Collection.iterator()>
	//    7   20:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   21:aload_2         
	//    9   22:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//   10   27:ifeq            61
			OutstandingPut outstandingput = (OutstandingPut)iterator.next();
	//   11   30:aload_2         
	//   12   31:invokeinterface #338 <Method Object Iterator.next()>
	//   13   36:checkcast       #37  <Class PersistentConnection$OutstandingPut>
	//   14   39:astore_3        
			if(outstandingput.onComplete != null)
	//*  15   40:aload_3         
	//*  16   41:invokestatic    #950 <Method com.firebase.client.Firebase$CompletionListener PersistentConnection$OutstandingPut.access$100(PersistentConnection$OutstandingPut)>
	//*  17   44:ifnull          21
				outstandingput.onComplete.onComplete(firebaseerror, ((Firebase) (null)));
	//   18   47:aload_3         
	//   19   48:invokestatic    #950 <Method com.firebase.client.Firebase$CompletionListener PersistentConnection$OutstandingPut.access$100(PersistentConnection$OutstandingPut)>
	//   20   51:aload_1         
	//   21   52:aconst_null     
	//   22   53:invokeinterface #369 <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
		} while(true);
	//   23   58:goto            21
		iterator = onDisconnectRequestQueue.iterator();
	//   24   61:aload_0         
	//   25   62:getfield        #244 <Field List onDisconnectRequestQueue>
	//   26   65:invokeinterface #460 <Method Iterator List.iterator()>
	//   27   70:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   28   71:aload_2         
	//   29   72:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//   30   77:ifeq            111
			OutstandingDisconnect outstandingdisconnect = (OutstandingDisconnect)iterator.next();
	//   31   80:aload_2         
	//   32   81:invokeinterface #338 <Method Object Iterator.next()>
	//   33   86:checkcast       #31  <Class PersistentConnection$OutstandingDisconnect>
	//   34   89:astore_3        
			if(outstandingdisconnect.onComplete != null)
	//*  35   90:aload_3         
	//*  36   91:invokestatic    #954 <Method com.firebase.client.Firebase$CompletionListener PersistentConnection$OutstandingDisconnect.access$200(PersistentConnection$OutstandingDisconnect)>
	//*  37   94:ifnull          71
				outstandingdisconnect.onComplete.onComplete(firebaseerror, ((Firebase) (null)));
	//   38   97:aload_3         
	//   39   98:invokestatic    #954 <Method com.firebase.client.Firebase$CompletionListener PersistentConnection$OutstandingDisconnect.access$200(PersistentConnection$OutstandingDisconnect)>
	//   40  101:aload_1         
	//   41  102:aconst_null     
	//   42  103:invokeinterface #369 <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
		} while(true);
	//   43  108:goto            71
		outstandingPuts.clear();
	//   44  111:aload_0         
	//   45  112:getfield        #239 <Field Map outstandingPuts>
	//   46  115:invokeinterface #880 <Method void Map.clear()>
		onDisconnectRequestQueue.clear();
	//   47  120:aload_0         
	//   48  121:getfield        #244 <Field List onDisconnectRequestQueue>
	//   49  124:invokeinterface #613 <Method void List.clear()>
	//   50  129:return          
	}

	public void put(String s, Object obj, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
		put(s, obj, ((String) (null)), completionlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:invokevirtual   #957 <Method void put(String, Object, String, com.firebase.client.Firebase$CompletionListener)>
	//    6    8:return          
	}

	public void put(String s, Object obj, String s1, com.firebase.client.Firebase.CompletionListener completionlistener)
	{
		putInternal("p", s, obj, s1, completionlistener);
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <String "p">
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:aload_3         
	//    5    6:aload           4
	//    6    8:invokespecial   #861 <Method void putInternal(String, String, Object, String, com.firebase.client.Firebase$CompletionListener)>
	//    7   11:return          
	}

	public Collection removeListens(Path path)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            45
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #253 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #254 <Method void StringBuilder()>
	//   10   22:astore_3        
			stringbuilder.append("removing all listens at path ");
	//   11   23:aload_3         
	//   12   24:ldc2            #959 <String "removing all listens at path ">
	//   13   27:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(((Object) (path)));
	//   15   31:aload_3         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   18   36:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   22   42:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		ArrayList arraylist = new ArrayList();
	//   23   45:new             #241 <Class ArrayList>
	//   24   48:dup             
	//   25   49:invokespecial   #242 <Method void ArrayList()>
	//   26   52:astore_2        
		Iterator iterator = listens.entrySet().iterator();
	//   27   53:aload_0         
	//   28   54:getfield        #233 <Field Map listens>
	//   29   57:invokeinterface #323 <Method Set Map.entrySet()>
	//   30   62:invokeinterface #329 <Method Iterator Set.iterator()>
	//   31   67:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   32   68:aload_3         
	//   33   69:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//   34   74:ifeq            136
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   35   77:aload_3         
	//   36   78:invokeinterface #338 <Method Object Iterator.next()>
	//   37   83:checkcast       #340 <Class java.util.Map$Entry>
	//   38   86:astore          5
			QuerySpec queryspec = (QuerySpec)((java.util.Map.Entry) (obj)).getKey();
	//   39   88:aload           5
	//   40   90:invokeinterface #962 <Method Object java.util.Map$Entry.getKey()>
	//   41   95:checkcast       #674 <Class QuerySpec>
	//   42   98:astore          4
			obj = ((Object) ((OutstandingListen)((java.util.Map.Entry) (obj)).getValue()));
	//   43  100:aload           5
	//   44  102:invokeinterface #343 <Method Object java.util.Map$Entry.getValue()>
	//   45  107:checkcast       #34  <Class PersistentConnection$OutstandingListen>
	//   46  110:astore          5
			if(queryspec.getPath().equals(((Object) (path))))
	//*  47  112:aload           4
	//*  48  114:invokevirtual   #675 <Method Path QuerySpec.getPath()>
	//*  49  117:aload_1         
	//*  50  118:invokevirtual   #963 <Method boolean Path.equals(Object)>
	//*  51  121:ifeq            68
				((List) (arraylist)).add(obj);
	//   52  124:aload_2         
	//   53  125:aload           5
	//   54  127:invokeinterface #478 <Method boolean List.add(Object)>
	//   55  132:pop             
		} while(true);
	//   56  133:goto            68
		OutstandingListen outstandinglisten;
		for(path = ((Path) (((List) (arraylist)).iterator())); ((Iterator) (path)).hasNext(); listens.remove(((Object) (outstandinglisten.getQuery()))))
	//*  57  136:aload_2         
	//*  58  137:invokeinterface #460 <Method Iterator List.iterator()>
	//*  59  142:astore_1        
	//*  60  143:aload_1         
	//*  61  144:invokeinterface #334 <Method boolean Iterator.hasNext()>
	//*  62  149:ifeq            179
			outstandinglisten = (OutstandingListen)((Iterator) (path)).next();
	//   63  152:aload_1         
	//   64  153:invokeinterface #338 <Method Object Iterator.next()>
	//   65  158:checkcast       #34  <Class PersistentConnection$OutstandingListen>
	//   66  161:astore_3        

	//   67  162:aload_0         
	//   68  163:getfield        #233 <Field Map listens>
	//   69  166:aload_3         
	//   70  167:invokevirtual   #574 <Method QuerySpec PersistentConnection$OutstandingListen.getQuery()>
	//   71  170:invokeinterface #551 <Method Object Map.remove(Object)>
	//   72  175:pop             
	//*  73  176:goto            143
		return ((Collection) (arraylist));
	//   74  179:aload_2         
	//   75  180:areturn         
	}

	public void resume()
	{
		shouldReconnect = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #209 <Field boolean shouldReconnect>
		if(realtime == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #619 <Field Connection realtime>
	//*   5    9:ifnonnull       16
			establishConnection();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #967 <Method void establishConnection()>
	//    8   16:return          
	}

	public void unauth(final com.firebase.client.Firebase.CompletionListener listener)
	{
		authCredential = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #302 <Field PersistentConnection$AuthCredential authCredential>
		_flddelegate.onAuthStatus(false);
	//    3    5:aload_0         
	//    4    6:getfield        #224 <Field PersistentConnection$Delegate _flddelegate>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #971 <Method void PersistentConnection$Delegate.onAuthStatus(boolean)>
		if(connected())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #795 <Method boolean connected()>
	//*   9   19:ifeq            44
			sendAction("unauth", ((Map) (new HashMap())), new ResponseListener() {

				public void onResponse(Map map)
				{
					String s = (String)map.get("s");
				//    0    0:aload_1         
				//    1    1:ldc1            #29  <String "s">
				//    2    3:invokeinterface #35  <Method Object Map.get(Object)>
				//    3    8:checkcast       #37  <Class String>
				//    4   11:astore_2        
					if(!s.equals("ok"))
				//*   5   12:aload_2         
				//*   6   13:ldc1            #39  <String "ok">
				//*   7   15:invokevirtual   #43  <Method boolean String.equals(Object)>
				//*   8   18:ifne            40
						map = ((Map) (FirebaseError.fromStatus(s, (String)map.get("d"))));
				//    9   21:aload_2         
				//   10   22:aload_1         
				//   11   23:ldc1            #45  <String "d">
				//   12   25:invokeinterface #35  <Method Object Map.get(Object)>
				//   13   30:checkcast       #37  <Class String>
				//   14   33:invokestatic    #51  <Method FirebaseError FirebaseError.fromStatus(String, String)>
				//   15   36:astore_1        
					else
				//*  16   37:goto            42
						map = null;
				//   17   40:aconst_null     
				//   18   41:astore_1        
					listener.onComplete(((FirebaseError) (map)), ((Firebase) (null)));
				//   19   42:aload_0         
				//   20   43:getfield        #21  <Field com.firebase.client.Firebase$CompletionListener val$listener>
				//   21   46:aload_1         
				//   22   47:aconst_null     
				//   23   48:invokeinterface #57  <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
				//   24   53:return          
				}

				final PersistentConnection this$0;
				final com.firebase.client.Firebase.CompletionListener val$listener;

			
			{
				this$0 = PersistentConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PersistentConnection this$0>
				listener = completionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field com.firebase.client.Firebase$CompletionListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   10   22:aload_0         
	//   11   23:ldc1            #96  <String "unauth">
	//   12   25:new             #230 <Class HashMap>
	//   13   28:dup             
	//   14   29:invokespecial   #231 <Method void HashMap()>
	//   15   32:new             #10  <Class PersistentConnection$2>
	//   16   35:dup             
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:invokespecial   #972 <Method void PersistentConnection$2(PersistentConnection, com.firebase.client.Firebase$CompletionListener)>
	//   20   41:invokespecial   #638 <Method void sendAction(String, Map, PersistentConnection$ResponseListener)>
	//   21   44:return          
	}

	void unlisten(QuerySpec queryspec)
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            49
		{
			LogWrapper logwrapper = logger;
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #253 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #254 <Method void StringBuilder()>
	//   10   22:astore          4
			stringbuilder.append("unlistening on ");
	//   11   24:aload           4
	//   12   26:ldc2            #976 <String "unlistening on ">
	//   13   29:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
			stringbuilder.append(((Object) (queryspec)));
	//   15   33:aload           4
	//   16   35:aload_1         
	//   17   36:invokevirtual   #435 <Method StringBuilder StringBuilder.append(Object)>
	//   18   39:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   40:aload_3         
	//   20   41:aload           4
	//   21   43:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   22   46:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		}
		boolean flag;
		if(!queryspec.isDefault() && queryspec.loadsAllData())
	//*  23   49:aload_1         
	//*  24   50:invokevirtual   #841 <Method boolean QuerySpec.isDefault()>
	//*  25   53:ifne            71
	//*  26   56:aload_1         
	//*  27   57:invokevirtual   #844 <Method boolean QuerySpec.loadsAllData()>
	//*  28   60:ifne            66
	//*  29   63:goto            71
			flag = false;
	//   30   66:iconst_0        
	//   31   67:istore_2        
		else
	//*  32   68:goto            73
			flag = true;
	//   33   71:iconst_1        
	//   34   72:istore_2        
		Utilities.hardAssert(flag, "unlisten() called for non-default but complete query");
	//   35   73:iload_2         
	//   36   74:ldc2            #978 <String "unlisten() called for non-default but complete query">
	//   37   77:invokestatic    #850 <Method void Utilities.hardAssert(boolean, String)>
		queryspec = ((QuerySpec) (removeListen(queryspec)));
	//   38   80:aload_0         
	//   39   81:aload_1         
	//   40   82:invokespecial   #296 <Method PersistentConnection$OutstandingListen removeListen(QuerySpec)>
	//   41   85:astore_1        
		if(queryspec != null && connected())
	//*  42   86:aload_1         
	//*  43   87:ifnull          102
	//*  44   90:aload_0         
	//*  45   91:invokespecial   #795 <Method boolean connected()>
	//*  46   94:ifeq            102
			sendUnlisten(((OutstandingListen) (queryspec)));
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:invokespecial   #980 <Method void sendUnlisten(PersistentConnection$OutstandingListen)>
	//   50  102:return          
	}

	public void unpauseWrites()
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #388 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            20
			logger.debug("Writes unpaused.");
	//    4   10:aload_0         
	//    5   11:getfield        #277 <Field LogWrapper logger>
	//    6   14:ldc2            #983 <String "Writes unpaused.">
	//    7   17:invokevirtual   #394 <Method void LogWrapper.debug(String)>
		writesPaused = false;
	//    8   20:aload_0         
	//    9   21:iconst_0        
	//   10   22:putfield        #237 <Field boolean writesPaused>
		if(canSendWrites())
	//*  11   25:aload_0         
	//*  12   26:invokespecial   #540 <Method boolean canSendWrites()>
	//*  13   29:ifeq            36
			restoreWrites();
	//   14   32:aload_0         
	//   15   33:invokespecial   #311 <Method void restoreWrites()>
	//   16   36:return          
	}

	public boolean writesPaused()
	{
		return writesPaused;
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field boolean writesPaused>
	//    2    4:ireturn         
	}

	static final boolean $assertionsDisabled = false;
	private static final long RECONNECT_MAX_DELAY = 30000L;
	private static final long RECONNECT_MIN_DELAY = 1000L;
	private static final double RECONNECT_MULTIPLIER = 1.3D;
	private static final long RECONNECT_RESET_TIMEOUT = 30000L;
	private static final String REQUEST_ACTION = "a";
	private static final String REQUEST_ACTION_AUTH = "auth";
	private static final String REQUEST_ACTION_LISTEN = "l";
	private static final String REQUEST_ACTION_MERGE = "m";
	private static final String REQUEST_ACTION_ONDISCONNECT_CANCEL = "oc";
	private static final String REQUEST_ACTION_ONDISCONNECT_MERGE = "om";
	private static final String REQUEST_ACTION_ONDISCONNECT_PUT = "o";
	private static final String REQUEST_ACTION_PUT = "p";
	private static final String REQUEST_ACTION_QUERY = "q";
	private static final String REQUEST_ACTION_QUERY_UNLISTEN = "n";
	private static final String REQUEST_ACTION_STATS = "s";
	private static final String REQUEST_ACTION_UNAUTH = "unauth";
	private static final String REQUEST_ACTION_UNLISTEN = "u";
	private static final String REQUEST_COMPOUND_HASH = "ch";
	private static final String REQUEST_COMPOUND_HASH_HASHES = "hs";
	private static final String REQUEST_COMPOUND_HASH_PATHS = "ps";
	private static final String REQUEST_COUNTERS = "c";
	private static final String REQUEST_CREDENTIAL = "cred";
	private static final String REQUEST_DATA_HASH = "h";
	private static final String REQUEST_DATA_PAYLOAD = "d";
	private static final String REQUEST_ERROR = "error";
	private static final String REQUEST_NUMBER = "r";
	private static final String REQUEST_PATH = "p";
	private static final String REQUEST_PAYLOAD = "b";
	private static final String REQUEST_QUERIES = "q";
	private static final String REQUEST_STATUS = "s";
	private static final String REQUEST_TAG = "t";
	private static final String RESPONSE_FOR_REQUEST = "b";
	private static final String SERVER_ASYNC_ACTION = "a";
	private static final String SERVER_ASYNC_AUTH_REVOKED = "ac";
	private static final String SERVER_ASYNC_DATA_MERGE = "m";
	private static final String SERVER_ASYNC_DATA_RANGE_MERGE = "rm";
	private static final String SERVER_ASYNC_DATA_UPDATE = "d";
	private static final String SERVER_ASYNC_LISTEN_CANCELLED = "c";
	private static final String SERVER_ASYNC_PAYLOAD = "b";
	private static final String SERVER_ASYNC_SECURITY_DEBUG = "sd";
	private static final String SERVER_DATA_END_PATH = "e";
	private static final String SERVER_DATA_RANGE_MERGE = "m";
	private static final String SERVER_DATA_START_PATH = "s";
	private static final String SERVER_DATA_TAG = "t";
	private static final String SERVER_DATA_UPDATE_BODY = "d";
	private static final String SERVER_DATA_UPDATE_PATH = "p";
	private static final String SERVER_DATA_WARNINGS = "w";
	private static final String SERVER_RESPONSE_DATA = "d";
	private static long connectionIds;
	private AuthCredential authCredential;
	private ConnectionState connectionState;
	private Context ctx;
	private Delegate _flddelegate;
	private boolean firstConnection;
	private long lastConnectionAttemptTime;
	private long lastConnectionEstablishedTime;
	private String lastSessionId;
	private Map listens;
	private LogWrapper logger;
	private List onDisconnectRequestQueue;
	private Map outstandingPuts;
	private Random random;
	private Connection realtime;
	private long reconnectDelay;
	private ScheduledFuture reconnectFuture;
	private RepoInfo repoInfo;
	private Map requestCBHash;
	private long requestCounter;
	private boolean shouldReconnect;
	private long writeCounter;
	private boolean writesPaused;

	static 
	{
	//    0    0:return          
	}


/*
	static LogWrapper access$1100(PersistentConnection persistentconnection)
	{
		return persistentconnection.logger;
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field LogWrapper logger>
	//    2    4:areturn         
	}

*/


/*
	static Map access$1200(PersistentConnection persistentconnection)
	{
		return persistentconnection.outstandingPuts;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field Map outstandingPuts>
	//    2    4:areturn         
	}

*/


/*
	static void access$1300(PersistentConnection persistentconnection, List list, QuerySpec queryspec)
	{
		persistentconnection.warnOnListenerWarnings(list, queryspec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #289 <Method void warnOnListenerWarnings(List, QuerySpec)>
		return;
	//    4    6:return          
	}

*/


/*
	static Map access$1400(PersistentConnection persistentconnection)
	{
		return persistentconnection.listens;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field Map listens>
	//    2    4:areturn         
	}

*/


/*
	static OutstandingListen access$1500(PersistentConnection persistentconnection, QuerySpec queryspec)
	{
		return persistentconnection.removeListen(queryspec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #296 <Method PersistentConnection$OutstandingListen removeListen(QuerySpec)>
	//    3    5:areturn         
	}

*/


/*
	static ConnectionState access$602(PersistentConnection persistentconnection, ConnectionState connectionstate)
	{
		persistentconnection.connectionState = connectionstate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #216 <Field PersistentConnection$ConnectionState connectionState>
		return connectionstate;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static AuthCredential access$700(PersistentConnection persistentconnection)
	{
		return persistentconnection.authCredential;
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field PersistentConnection$AuthCredential authCredential>
	//    2    4:areturn         
	}

*/


/*
	static AuthCredential access$702(PersistentConnection persistentconnection, AuthCredential authcredential)
	{
		persistentconnection.authCredential = authcredential;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #302 <Field PersistentConnection$AuthCredential authCredential>
		return authcredential;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Delegate access$800(PersistentConnection persistentconnection)
	{
		return persistentconnection._flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field PersistentConnection$Delegate _flddelegate>
	//    2    4:areturn         
	}

*/


/*
	static void access$900(PersistentConnection persistentconnection)
	{
		persistentconnection.restoreWrites();
	//    0    0:aload_0         
	//    1    1:invokespecial   #311 <Method void restoreWrites()>
		return;
	//    2    4:return          
	}

*/
}
