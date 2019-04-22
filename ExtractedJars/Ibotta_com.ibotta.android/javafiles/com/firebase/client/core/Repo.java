// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.*;
import com.firebase.client.authentication.AuthenticationManager;
import com.firebase.client.core.persistence.NoopPersistenceManager;
import com.firebase.client.core.persistence.PersistenceManager;
import com.firebase.client.core.utilities.Tree;
import com.firebase.client.core.view.EventRaiser;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.snapshot.*;
import com.firebase.client.utilities.*;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			Context, PersistentConnection, ValueEventRegistration, SyncTree, 
//			RepoInfo, SnapshotHolder, SparseSnapshotTree, Constants, 
//			Path, ServerValues, UserWriteRecord, CompoundWrite, 
//			EventRegistration, Tag

public class Repo
	implements PersistentConnection.Delegate
{
	private static class FirebaseAppImpl extends FirebaseApp
	{

		protected FirebaseAppImpl(Repo repo)
		{
			super(repo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void FirebaseApp(Repo)>
		//    3    5:return          
		}
	}

	private static class TransactionData
		implements Comparable
	{

		public int compareTo(TransactionData transactiondata)
		{
			long l = order;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field long order>
		//    2    4:lstore_2        
			long l1 = transactiondata.order;
		//    3    5:aload_1         
		//    4    6:getfield        #50  <Field long order>
		//    5    9:lstore          4
			if(l < l1)
		//*   6   11:lload_2         
		//*   7   12:lload           4
		//*   8   14:lcmp            
		//*   9   15:ifge            20
				return -1;
		//   10   18:iconst_m1       
		//   11   19:ireturn         
			return l != l1 ? 1 : 0;
		//   12   20:lload_2         
		//   13   21:lload           4
		//   14   23:lcmp            
		//   15   24:ifne            29
		//   16   27:iconst_0        
		//   17   28:ireturn         
		//   18   29:iconst_1        
		//   19   30:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((TransactionData)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class Repo$TransactionData>
		//    3    5:invokevirtual   #99  <Method int compareTo(Repo$TransactionData)>
		//    4    8:ireturn         
		}

		private FirebaseError abortReason;
		private boolean applyLocally;
		private Node currentInputSnapshot;
		private Node currentOutputSnapshotRaw;
		private Node currentOutputSnapshotResolved;
		private long currentWriteId;
		private com.firebase.client.Transaction.Handler handler;
		private long order;
		private ValueEventListener outstandingListener;
		private Path path;
		private int retryCount;
		private TransactionStatus status;


/*
		static Node access$1200(TransactionData transactiondata)
		{
			return transactiondata.currentInputSnapshot;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field Node currentInputSnapshot>
		//    2    4:areturn         
		}

*/


/*
		static Node access$1202(TransactionData transactiondata, Node node)
		{
			transactiondata.currentInputSnapshot = node;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field Node currentInputSnapshot>
			return node;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Node access$1300(TransactionData transactiondata)
		{
			return transactiondata.currentOutputSnapshotRaw;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Node currentOutputSnapshotRaw>
		//    2    4:areturn         
		}

*/


/*
		static Node access$1302(TransactionData transactiondata, Node node)
		{
			transactiondata.currentOutputSnapshotRaw = node;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #56  <Field Node currentOutputSnapshotRaw>
			return node;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Node access$1400(TransactionData transactiondata)
		{
			return transactiondata.currentOutputSnapshotResolved;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field Node currentOutputSnapshotResolved>
		//    2    4:areturn         
		}

*/


/*
		static Node access$1402(TransactionData transactiondata, Node node)
		{
			transactiondata.currentOutputSnapshotResolved = node;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #58  <Field Node currentOutputSnapshotResolved>
			return node;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static TransactionStatus access$1500(TransactionData transactiondata)
		{
			return transactiondata.status;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field Repo$TransactionStatus status>
		//    2    4:areturn         
		}

*/


/*
		static TransactionStatus access$1502(TransactionData transactiondata, TransactionStatus transactionstatus)
		{
			transactiondata.status = transactionstatus;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field Repo$TransactionStatus status>
			return transactionstatus;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static long access$1600(TransactionData transactiondata)
		{
			return transactiondata.currentWriteId;
		//    0    0:aload_0         
		//    1    1:getfield        #78  <Field long currentWriteId>
		//    2    4:lreturn         
		}

*/


/*
		static long access$1602(TransactionData transactiondata, long l)
		{
			transactiondata.currentWriteId = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #78  <Field long currentWriteId>
			return l;
		//    3    5:lload_1         
		//    4    6:lreturn         
		}

*/


/*
		static int access$1800(TransactionData transactiondata)
		{
			return transactiondata.retryCount;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field int retryCount>
		//    2    4:ireturn         
		}

*/


/*
		static int access$1808(TransactionData transactiondata)
		{
			int i = transactiondata.retryCount;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field int retryCount>
		//    2    4:istore_1        
			transactiondata.retryCount = i + 1;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:iconst_1        
		//    6    8:iadd            
		//    7    9:putfield        #46  <Field int retryCount>
			return i;
		//    8   12:iload_1         
		//    9   13:ireturn         
		}

*/


/*
		static Path access$1900(TransactionData transactiondata)
		{
			return transactiondata.path;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field Path path>
		//    2    4:areturn         
		}

*/


/*
		static com.firebase.client.Transaction.Handler access$2100(TransactionData transactiondata)
		{
			return transactiondata.handler;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field com.firebase.client.Transaction$Handler handler>
		//    2    4:areturn         
		}

*/


/*
		static ValueEventListener access$2200(TransactionData transactiondata)
		{
			return transactiondata.outstandingListener;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field ValueEventListener outstandingListener>
		//    2    4:areturn         
		}

*/


/*
		static FirebaseError access$2600(TransactionData transactiondata)
		{
			return transactiondata.abortReason;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field FirebaseError abortReason>
		//    2    4:areturn         
		}

*/


/*
		static FirebaseError access$2602(TransactionData transactiondata, FirebaseError firebaseerror)
		{
			transactiondata.abortReason = firebaseerror;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field FirebaseError abortReason>
			return firebaseerror;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static boolean access$2700(TransactionData transactiondata)
		{
			return transactiondata.applyLocally;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field boolean applyLocally>
		//    2    4:ireturn         
		}

*/

		private TransactionData(Path path1, com.firebase.client.Transaction.Handler handler1, ValueEventListener valueeventlistener, TransactionStatus transactionstatus, boolean flag, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Object()>
			path = path1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #38  <Field Path path>
			handler = handler1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #40  <Field com.firebase.client.Transaction$Handler handler>
			outstandingListener = valueeventlistener;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #42  <Field ValueEventListener outstandingListener>
			status = transactionstatus;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #44  <Field Repo$TransactionStatus status>
			retryCount = 0;
		//   14   25:aload_0         
		//   15   26:iconst_0        
		//   16   27:putfield        #46  <Field int retryCount>
			applyLocally = flag;
		//   17   30:aload_0         
		//   18   31:iload           5
		//   19   33:putfield        #48  <Field boolean applyLocally>
			order = l;
		//   20   36:aload_0         
		//   21   37:lload           6
		//   22   39:putfield        #50  <Field long order>
			abortReason = null;
		//   23   42:aload_0         
		//   24   43:aconst_null     
		//   25   44:putfield        #52  <Field FirebaseError abortReason>
			currentInputSnapshot = null;
		//   26   47:aload_0         
		//   27   48:aconst_null     
		//   28   49:putfield        #54  <Field Node currentInputSnapshot>
			currentOutputSnapshotRaw = null;
		//   29   52:aload_0         
		//   30   53:aconst_null     
		//   31   54:putfield        #56  <Field Node currentOutputSnapshotRaw>
			currentOutputSnapshotResolved = null;
		//   32   57:aload_0         
		//   33   58:aconst_null     
		//   34   59:putfield        #58  <Field Node currentOutputSnapshotResolved>
		//   35   62:return          
		}

		TransactionData(Path path1, com.firebase.client.Transaction.Handler handler1, ValueEventListener valueeventlistener, TransactionStatus transactionstatus, boolean flag, long l, 
				_cls1 _pcls1)
		{
			this(path1, handler1, valueeventlistener, transactionstatus, flag, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:iload           5
		//    6    8:lload           6
		//    7   10:invokespecial   #62  <Method void Repo$TransactionData(Path, com.firebase.client.Transaction$Handler, ValueEventListener, Repo$TransactionStatus, boolean, long)>
		//    8   13:return          
		}
	}

	private static final class TransactionStatus extends Enum
	{

		public static TransactionStatus valueOf(String s)
		{
			return (TransactionStatus)Enum.valueOf(com/firebase/client/core/Repo$TransactionStatus, s);
		//    0    0:ldc1            #2   <Class Repo$TransactionStatus>
		//    1    2:aload_0         
		//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Repo$TransactionStatus>
		//    4    9:areturn         
		}

		public static TransactionStatus[] values()
		{
			return (TransactionStatus[])((TransactionStatus []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field Repo$TransactionStatus[] $VALUES>
		//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.firebase.client.core.Repo$TransactionStatus_3B_.clone()>
		//    2    6:checkcast       #54  <Class Repo$TransactionStatus[]>
		//    3    9:areturn         
		}

		private static final TransactionStatus $VALUES[];
		public static final TransactionStatus COMPLETED;
		public static final TransactionStatus INITIALIZING;
		public static final TransactionStatus NEEDS_ABORT;
		public static final TransactionStatus RUN;
		public static final TransactionStatus SENT;
		public static final TransactionStatus SENT_NEEDS_ABORT;

		static 
		{
			INITIALIZING = new TransactionStatus("INITIALIZING", 0);
		//    0    0:new             #2   <Class Repo$TransactionStatus>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "INITIALIZING">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
		//    5   10:putstatic       #26  <Field Repo$TransactionStatus INITIALIZING>
			RUN = new TransactionStatus("RUN", 1);
		//    6   13:new             #2   <Class Repo$TransactionStatus>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "RUN">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
		//   11   23:putstatic       #29  <Field Repo$TransactionStatus RUN>
			SENT = new TransactionStatus("SENT", 2);
		//   12   26:new             #2   <Class Repo$TransactionStatus>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "SENT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
		//   17   36:putstatic       #32  <Field Repo$TransactionStatus SENT>
			COMPLETED = new TransactionStatus("COMPLETED", 3);
		//   18   39:new             #2   <Class Repo$TransactionStatus>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "COMPLETED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
		//   23   49:putstatic       #35  <Field Repo$TransactionStatus COMPLETED>
			SENT_NEEDS_ABORT = new TransactionStatus("SENT_NEEDS_ABORT", 4);
		//   24   52:new             #2   <Class Repo$TransactionStatus>
		//   25   55:dup             
		//   26   56:ldc1            #36  <String "SENT_NEEDS_ABORT">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
		//   29   62:putstatic       #38  <Field Repo$TransactionStatus SENT_NEEDS_ABORT>
			NEEDS_ABORT = new TransactionStatus("NEEDS_ABORT", 5);
		//   30   65:new             #2   <Class Repo$TransactionStatus>
		//   31   68:dup             
		//   32   69:ldc1            #39  <String "NEEDS_ABORT">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void Repo$TransactionStatus(String, int)>
		//   35   75:putstatic       #41  <Field Repo$TransactionStatus NEEDS_ABORT>
			$VALUES = (new TransactionStatus[] {
				INITIALIZING, RUN, SENT, COMPLETED, SENT_NEEDS_ABORT, NEEDS_ABORT
			});
		//   36   78:bipush          6
		//   37   80:anewarray       TransactionStatus[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field Repo$TransactionStatus INITIALIZING>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #29  <Field Repo$TransactionStatus RUN>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #32  <Field Repo$TransactionStatus SENT>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #35  <Field Repo$TransactionStatus COMPLETED>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #38  <Field Repo$TransactionStatus SENT_NEEDS_ABORT>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #41  <Field Repo$TransactionStatus NEEDS_ABORT>
		//   61  118:aastore         
		//   62  119:putstatic       #43  <Field Repo$TransactionStatus[] $VALUES>
		//*  63  122:return          
		}

		private TransactionStatus(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	Repo(RepoInfo repoinfo, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #121 <Class OffsetClock>
	//    4    8:dup             
	//    5    9:new             #123 <Class DefaultClock>
	//    6   12:dup             
	//    7   13:invokespecial   #124 <Method void DefaultClock()>
	//    8   16:lconst_0        
	//    9   17:invokespecial   #127 <Method void OffsetClock(com.firebase.client.utilities.Clock, long)>
	//   10   20:putfield        #129 <Field OffsetClock serverClock>
		hijackHash = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #131 <Field boolean hijackHash>
		dataUpdateCount = 0L;
	//   14   28:aload_0         
	//   15   29:lconst_0        
	//   16   30:putfield        #133 <Field long dataUpdateCount>
		nextWriteId = 1L;
	//   17   33:aload_0         
	//   18   34:lconst_1        
	//   19   35:putfield        #135 <Field long nextWriteId>
		loggedTransactionPersistenceWarning = false;
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:putfield        #137 <Field boolean loggedTransactionPersistenceWarning>
		transactionOrder = 0L;
	//   23   43:aload_0         
	//   24   44:lconst_0        
	//   25   45:putfield        #139 <Field long transactionOrder>
		repoInfo = repoinfo;
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:putfield        #141 <Field RepoInfo repoInfo>
		ctx = context;
	//   29   53:aload_0         
	//   30   54:aload_2         
	//   31   55:putfield        #143 <Field Context ctx>
		app = ((FirebaseApp) (new FirebaseAppImpl(this)));
	//   32   58:aload_0         
	//   33   59:new             #58  <Class Repo$FirebaseAppImpl>
	//   34   62:dup             
	//   35   63:aload_0         
	//   36   64:invokespecial   #146 <Method void Repo$FirebaseAppImpl(Repo)>
	//   37   67:putfield        #148 <Field FirebaseApp app>
		operationLogger = ctx.getLogger("RepoOperation");
	//   38   70:aload_0         
	//   39   71:aload_0         
	//   40   72:getfield        #143 <Field Context ctx>
	//   41   75:ldc1            #150 <String "RepoOperation">
	//   42   77:invokevirtual   #156 <Method LogWrapper Context.getLogger(String)>
	//   43   80:putfield        #158 <Field LogWrapper operationLogger>
		transactionLogger = ctx.getLogger("Transaction");
	//   44   83:aload_0         
	//   45   84:aload_0         
	//   46   85:getfield        #143 <Field Context ctx>
	//   47   88:ldc1            #160 <String "Transaction">
	//   48   90:invokevirtual   #156 <Method LogWrapper Context.getLogger(String)>
	//   49   93:putfield        #162 <Field LogWrapper transactionLogger>
		dataLogger = ctx.getLogger("DataOperation");
	//   50   96:aload_0         
	//   51   97:aload_0         
	//   52   98:getfield        #143 <Field Context ctx>
	//   53  101:ldc1            #164 <String "DataOperation">
	//   54  103:invokevirtual   #156 <Method LogWrapper Context.getLogger(String)>
	//   55  106:putfield        #166 <Field LogWrapper dataLogger>
		eventRaiser = new EventRaiser(ctx);
	//   56  109:aload_0         
	//   57  110:new             #168 <Class EventRaiser>
	//   58  113:dup             
	//   59  114:aload_0         
	//   60  115:getfield        #143 <Field Context ctx>
	//   61  118:invokespecial   #171 <Method void EventRaiser(Context)>
	//   62  121:putfield        #173 <Field EventRaiser eventRaiser>
		connection = new PersistentConnection(context, repoinfo, ((PersistentConnection.Delegate) (this)));
	//   63  124:aload_0         
	//   64  125:new             #175 <Class PersistentConnection>
	//   65  128:dup             
	//   66  129:aload_2         
	//   67  130:aload_1         
	//   68  131:aload_0         
	//   69  132:invokespecial   #178 <Method void PersistentConnection(Context, RepoInfo, PersistentConnection$Delegate)>
	//   70  135:putfield        #180 <Field PersistentConnection connection>
		authenticationManager = new AuthenticationManager(context, this, repoinfo, connection);
	//   71  138:aload_0         
	//   72  139:new             #182 <Class AuthenticationManager>
	//   73  142:dup             
	//   74  143:aload_2         
	//   75  144:aload_0         
	//   76  145:aload_1         
	//   77  146:aload_0         
	//   78  147:getfield        #180 <Field PersistentConnection connection>
	//   79  150:invokespecial   #185 <Method void AuthenticationManager(Context, Repo, RepoInfo, PersistentConnection)>
	//   80  153:putfield        #187 <Field AuthenticationManager authenticationManager>
		authenticationManager.resumeSession();
	//   81  156:aload_0         
	//   82  157:getfield        #187 <Field AuthenticationManager authenticationManager>
	//   83  160:invokevirtual   #190 <Method void AuthenticationManager.resumeSession()>
		scheduleNow(new Runnable() {

			public void run()
			{
				deferredInitialization();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field Repo this$0>
			//    2    4:invokestatic    #24  <Method void Repo.access$000(Repo)>
			//    3    7:return          
			}

			final Repo this$0;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Repo this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   84  163:aload_0         
	//   85  164:new             #8   <Class Repo$1>
	//   86  167:dup             
	//   87  168:aload_0         
	//   88  169:invokespecial   #191 <Method void Repo$1(Repo)>
	//   89  172:invokevirtual   #195 <Method void scheduleNow(Runnable)>
	//   90  175:return          
	}

	private Path abortTransactions(Path path, final int reason)
	{
		Path path1 = getAncestorTransactionNode(path).getPath();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method Tree getAncestorTransactionNode(Path)>
	//    3    5:invokevirtual   #207 <Method Path Tree.getPath()>
	//    4    8:astore_3        
		if(transactionLogger.logsDebug())
	//*   5    9:aload_0         
	//*   6   10:getfield        #162 <Field LogWrapper transactionLogger>
	//*   7   13:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*   8   16:ifeq            74
		{
			LogWrapper logwrapper = operationLogger;
	//    9   19:aload_0         
	//   10   20:getfield        #158 <Field LogWrapper operationLogger>
	//   11   23:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   12   25:new             #215 <Class StringBuilder>
	//   13   28:dup             
	//   14   29:invokespecial   #216 <Method void StringBuilder()>
	//   15   32:astore          5
			stringbuilder.append("Aborting transactions for path: ");
	//   16   34:aload           5
	//   17   36:ldc1            #218 <String "Aborting transactions for path: ">
	//   18   38:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			stringbuilder.append(((Object) (path)));
	//   20   42:aload           5
	//   21   44:aload_1         
	//   22   45:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   23   48:pop             
			stringbuilder.append(". Affected: ");
	//   24   49:aload           5
	//   25   51:ldc1            #227 <String ". Affected: ">
	//   26   53:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			stringbuilder.append(((Object) (path1)));
	//   28   57:aload           5
	//   29   59:aload_3         
	//   30   60:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   31   63:pop             
			logwrapper.debug(stringbuilder.toString());
	//   32   64:aload           4
	//   33   66:aload           5
	//   34   68:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   35   71:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		path = ((Path) (transactionQueueTree.subTree(path)));
	//   36   74:aload_0         
	//   37   75:getfield        #237 <Field Tree transactionQueueTree>
	//   38   78:aload_1         
	//   39   79:invokevirtual   #240 <Method Tree Tree.subTree(Path)>
	//   40   82:astore_1        
		((Tree) (path)).forEachAncestor(new com.firebase.client.core.utilities.Tree.TreeFilter() {

			public boolean filterTreeNode(Tree tree)
			{
				abortTransactionsAtNode(tree, reason);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field Repo this$0>
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #22  <Field int val$reason>
			//    5    9:invokestatic    #32  <Method void Repo.access$2900(Repo, Tree, int)>
				return false;
			//    6   12:iconst_0        
			//    7   13:ireturn         
			}

			final Repo this$0;
			final int val$reason;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Repo this$0>
				reason = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$reason>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   41   83:aload_1         
	//   42   84:new             #36  <Class Repo$20>
	//   43   87:dup             
	//   44   88:aload_0         
	//   45   89:iload_2         
	//   46   90:invokespecial   #243 <Method void Repo$20(Repo, int)>
	//   47   93:invokevirtual   #247 <Method boolean Tree.forEachAncestor(com.firebase.client.core.utilities.Tree$TreeFilter)>
	//   48   96:pop             
		abortTransactionsAtNode(((Tree) (path)), reason);
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:iload_2         
	//   52  100:invokespecial   #251 <Method void abortTransactionsAtNode(Tree, int)>
		((Tree) (path)).forEachDescendant(new com.firebase.client.core.utilities.Tree.TreeVisitor() {

			public void visitTree(Tree tree)
			{
				abortTransactionsAtNode(tree, reason);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field Repo this$0>
			//    2    4:aload_1         
			//    3    5:aload_0         
			//    4    6:getfield        #22  <Field int val$reason>
			//    5    9:invokestatic    #32  <Method void Repo.access$2900(Repo, Tree, int)>
			//    6   12:return          
			}

			final Repo this$0;
			final int val$reason;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Repo this$0>
				reason = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$reason>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   53  103:aload_1         
	//   54  104:new             #38  <Class Repo$21>
	//   55  107:dup             
	//   56  108:aload_0         
	//   57  109:iload_2         
	//   58  110:invokespecial   #252 <Method void Repo$21(Repo, int)>
	//   59  113:invokevirtual   #256 <Method void Tree.forEachDescendant(com.firebase.client.core.utilities.Tree$TreeVisitor)>
		return path1;
	//   60  116:aload_3         
	//   61  117:areturn         
	}

	private void abortTransactionsAtNode(Tree tree, int i)
	{
		List list = (List)tree.getValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #260 <Method Object Tree.getValue()>
	//    2    4:checkcast       #262 <Class List>
	//    3    7:astore          7
		ArrayList arraylist = new ArrayList();
	//    4    9:new             #264 <Class ArrayList>
	//    5   12:dup             
	//    6   13:invokespecial   #265 <Method void ArrayList()>
	//    7   16:astore          8
		if(list != null)
	//*   8   18:aload           7
	//*   9   20:ifnull          388
		{
			ArrayList arraylist1 = new ArrayList();
	//   10   23:new             #264 <Class ArrayList>
	//   11   26:dup             
	//   12   27:invokespecial   #265 <Method void ArrayList()>
	//   13   30:astore          9
			final Object abortError;
			if(i == -9)
	//*  14   32:iload_2         
	//*  15   33:bipush          -9
	//*  16   35:icmpne          48
			{
				abortError = ((Object) (FirebaseError.fromStatus("overriddenBySet")));
	//   17   38:ldc1            #75  <String "overriddenBySet">
	//   18   40:invokestatic    #271 <Method FirebaseError FirebaseError.fromStatus(String)>
	//   19   43:astore          6
			} else
	//*  20   45:goto            105
			{
				boolean flag;
				if(i == -25)
	//*  21   48:iload_2         
	//*  22   49:bipush          -25
	//*  23   51:icmpne          60
					flag = true;
	//   24   54:iconst_1        
	//   25   55:istore          5
				else
	//*  26   57:goto            63
					flag = false;
	//   27   60:iconst_0        
	//   28   61:istore          5
				abortError = ((Object) (new StringBuilder()));
	//   29   63:new             #215 <Class StringBuilder>
	//   30   66:dup             
	//   31   67:invokespecial   #216 <Method void StringBuilder()>
	//   32   70:astore          6
				((StringBuilder) (abortError)).append("Unknown transaction abort reason: ");
	//   33   72:aload           6
	//   34   74:ldc2            #273 <String "Unknown transaction abort reason: ">
	//   35   77:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   36   80:pop             
				((StringBuilder) (abortError)).append(i);
	//   37   81:aload           6
	//   38   83:iload_2         
	//   39   84:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//   40   87:pop             
				Utilities.hardAssert(flag, ((StringBuilder) (abortError)).toString());
	//   41   88:iload           5
	//   42   90:aload           6
	//   43   92:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   44   95:invokestatic    #282 <Method void Utilities.hardAssert(boolean, String)>
				abortError = ((Object) (FirebaseError.fromCode(-25)));
	//   45   98:bipush          -25
	//   46  100:invokestatic    #286 <Method FirebaseError FirebaseError.fromCode(int)>
	//   47  103:astore          6
			}
			int j = 0;
	//   48  105:iconst_0        
	//   49  106:istore_3        
			int k = -1;
	//   50  107:iconst_m1       
	//   51  108:istore          4
			for(; j < list.size(); j++)
	//*  52  110:iload_3         
	//*  53  111:aload           7
	//*  54  113:invokeinterface #290 <Method int List.size()>
	//*  55  118:icmpge          319
			{
				final TransactionData transaction = (TransactionData)list.get(j);
	//   56  121:aload           7
	//   57  123:iload_3         
	//   58  124:invokeinterface #294 <Method Object List.get(int)>
	//   59  129:checkcast       #61  <Class Repo$TransactionData>
	//   60  132:astore          10
				if(transaction.status == TransactionStatus.SENT_NEEDS_ABORT)
	//*  61  134:aload           10
	//*  62  136:invokestatic    #298 <Method Repo$TransactionStatus Repo$TransactionData.access$1500(Repo$TransactionData)>
	//*  63  139:getstatic       #302 <Field Repo$TransactionStatus Repo$TransactionStatus.SENT_NEEDS_ABORT>
	//*  64  142:if_acmpne       148
					continue;
	//   65  145:goto            312
				if(transaction.status == TransactionStatus.SENT)
	//*  66  148:aload           10
	//*  67  150:invokestatic    #298 <Method Repo$TransactionStatus Repo$TransactionData.access$1500(Repo$TransactionData)>
	//*  68  153:getstatic       #305 <Field Repo$TransactionStatus Repo$TransactionStatus.SENT>
	//*  69  156:if_acmpne       182
				{
					transaction.status = TransactionStatus.SENT_NEEDS_ABORT;
	//   70  159:aload           10
	//   71  161:getstatic       #302 <Field Repo$TransactionStatus Repo$TransactionStatus.SENT_NEEDS_ABORT>
	//   72  164:invokestatic    #309 <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
	//   73  167:pop             
					transaction.abortReason = ((FirebaseError) (abortError));
	//   74  168:aload           10
	//   75  170:aload           6
	//   76  172:invokestatic    #313 <Method FirebaseError Repo$TransactionData.access$2602(Repo$TransactionData, FirebaseError)>
	//   77  175:pop             
					k = j;
	//   78  176:iload_3         
	//   79  177:istore          4
					continue;
	//   80  179:goto            312
				}
				removeEventCallback(((EventRegistration) (new ValueEventRegistration(this, transaction.outstandingListener, QuerySpec.defaultQueryAtPath(transaction.path)))));
	//   81  182:aload_0         
	//   82  183:new             #315 <Class ValueEventRegistration>
	//   83  186:dup             
	//   84  187:aload_0         
	//   85  188:aload           10
	//   86  190:invokestatic    #319 <Method ValueEventListener Repo$TransactionData.access$2200(Repo$TransactionData)>
	//   87  193:aload           10
	//   88  195:invokestatic    #323 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//   89  198:invokestatic    #329 <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
	//   90  201:invokespecial   #332 <Method void ValueEventRegistration(Repo, ValueEventListener, QuerySpec)>
	//   91  204:invokevirtual   #336 <Method void removeEventCallback(EventRegistration)>
				if(i == -9)
	//*  92  207:iload_2         
	//*  93  208:bipush          -9
	//*  94  210:icmpne          242
				{
					((List) (arraylist)).addAll(((java.util.Collection) (serverSyncTree.ackUserWrite(transaction.currentWriteId, true, false, ((com.firebase.client.utilities.Clock) (serverClock))))));
	//   95  213:aload           8
	//   96  215:aload_0         
	//   97  216:getfield        #338 <Field SyncTree serverSyncTree>
	//   98  219:aload           10
	//   99  221:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//  100  224:iconst_1        
	//  101  225:iconst_0        
	//  102  226:aload_0         
	//  103  227:getfield        #129 <Field OffsetClock serverClock>
	//  104  230:invokevirtual   #348 <Method List SyncTree.ackUserWrite(long, boolean, boolean, com.firebase.client.utilities.Clock)>
	//  105  233:invokeinterface #352 <Method boolean List.addAll(java.util.Collection)>
	//  106  238:pop             
				} else
	//* 107  239:goto            292
				{
					boolean flag1;
					if(i == -25)
	//* 108  242:iload_2         
	//* 109  243:bipush          -25
	//* 110  245:icmpne          254
						flag1 = true;
	//  111  248:iconst_1        
	//  112  249:istore          5
					else
	//* 113  251:goto            257
						flag1 = false;
	//  114  254:iconst_0        
	//  115  255:istore          5
					StringBuilder stringbuilder = new StringBuilder();
	//  116  257:new             #215 <Class StringBuilder>
	//  117  260:dup             
	//  118  261:invokespecial   #216 <Method void StringBuilder()>
	//  119  264:astore          11
					stringbuilder.append("Unknown transaction abort reason: ");
	//  120  266:aload           11
	//  121  268:ldc2            #273 <String "Unknown transaction abort reason: ">
	//  122  271:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//  123  274:pop             
					stringbuilder.append(i);
	//  124  275:aload           11
	//  125  277:iload_2         
	//  126  278:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//  127  281:pop             
					Utilities.hardAssert(flag1, stringbuilder.toString());
	//  128  282:iload           5
	//  129  284:aload           11
	//  130  286:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  131  289:invokestatic    #282 <Method void Utilities.hardAssert(boolean, String)>
				}
				((List) (arraylist1)).add(((Object) (new Runnable() {

					public void run()
					{
						transaction.handler.onComplete(abortError, false, ((DataSnapshot) (null)));
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field Repo$TransactionData val$transaction>
					//    2    4:invokestatic    #36  <Method com.firebase.client.Transaction$Handler Repo$TransactionData.access$2100(Repo$TransactionData)>
					//    3    7:aload_0         
					//    4    8:getfield        #25  <Field FirebaseError val$abortError>
					//    5   11:iconst_0        
					//    6   12:aconst_null     
					//    7   13:invokeinterface #42  <Method void com.firebase.client.Transaction$Handler.onComplete(FirebaseError, boolean, DataSnapshot)>
					//    8   18:return          
					}

					final Repo this$0;
					final FirebaseError val$abortError;
					final TransactionData val$transaction;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Repo this$0>
				transaction = transactiondata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Repo$TransactionData val$transaction>
				abortError = firebaseerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field FirebaseError val$abortError>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
)));
	//  132  292:aload           9
	//  133  294:new             #40  <Class Repo$22>
	//  134  297:dup             
	//  135  298:aload_0         
	//  136  299:aload           10
	//  137  301:aload           6
	//  138  303:invokespecial   #355 <Method void Repo$22(Repo, Repo$TransactionData, FirebaseError)>
	//  139  306:invokeinterface #359 <Method boolean List.add(Object)>
	//  140  311:pop             
			}

	//  141  312:iload_3         
	//  142  313:iconst_1        
	//  143  314:iadd            
	//  144  315:istore_3        
	//* 145  316:goto            110
			if(k == -1)
	//* 146  319:iload           4
	//* 147  321:iconst_m1       
	//* 148  322:icmpne          333
				tree.setValue(((Object) (null)));
	//  149  325:aload_1         
	//  150  326:aconst_null     
	//  151  327:invokevirtual   #363 <Method void Tree.setValue(Object)>
			else
	//* 152  330:goto            349
				tree.setValue(((Object) (list.subList(0, k + 1))));
	//  153  333:aload_1         
	//  154  334:aload           7
	//  155  336:iconst_0        
	//  156  337:iload           4
	//  157  339:iconst_1        
	//  158  340:iadd            
	//  159  341:invokeinterface #367 <Method List List.subList(int, int)>
	//  160  346:invokevirtual   #363 <Method void Tree.setValue(Object)>
			postEvents(((List) (arraylist)));
	//  161  349:aload_0         
	//  162  350:aload           8
	//  163  352:invokespecial   #371 <Method void postEvents(List)>
			for(tree = ((Tree) (((List) (arraylist1)).iterator())); ((Iterator) (tree)).hasNext(); postEvent((Runnable)((Iterator) (tree)).next()));
	//  164  355:aload           9
	//  165  357:invokeinterface #375 <Method Iterator List.iterator()>
	//  166  362:astore_1        
	//  167  363:aload_1         
	//  168  364:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//  169  369:ifeq            388
	//  170  372:aload_0         
	//  171  373:aload_1         
	//  172  374:invokeinterface #383 <Method Object Iterator.next()>
	//  173  379:checkcast       #385 <Class Runnable>
	//  174  382:invokevirtual   #388 <Method void postEvent(Runnable)>
		}
	//* 175  385:goto            363
	//  176  388:return          
	}

	private void ackWriteAndRerunTransactions(long l, Path path, FirebaseError firebaseerror)
	{
		if(firebaseerror != null && firebaseerror.getCode() == -25)
	//*   0    0:aload           4
	//*   1    2:ifnull          16
	//*   2    5:aload           4
	//*   3    7:invokevirtual   #462 <Method int FirebaseError.getCode()>
	//*   4   10:bipush          -25
	//*   5   12:icmpne          16
			return;
	//    6   15:return          
		boolean flag;
		if(firebaseerror == null)
	//*   7   16:aload           4
	//*   8   18:ifnonnull       27
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore          5
		else
	//*  11   24:goto            30
			flag = false;
	//   12   27:iconst_0        
	//   13   28:istore          5
		firebaseerror = ((FirebaseError) (serverSyncTree.ackUserWrite(l, flag ^ true, true, ((com.firebase.client.utilities.Clock) (serverClock)))));
	//   14   30:aload_0         
	//   15   31:getfield        #338 <Field SyncTree serverSyncTree>
	//   16   34:lload_1         
	//   17   35:iload           5
	//   18   37:iconst_1        
	//   19   38:ixor            
	//   20   39:iconst_1        
	//   21   40:aload_0         
	//   22   41:getfield        #129 <Field OffsetClock serverClock>
	//   23   44:invokevirtual   #348 <Method List SyncTree.ackUserWrite(long, boolean, boolean, com.firebase.client.utilities.Clock)>
	//   24   47:astore          4
		if(((List) (firebaseerror)).size() > 0)
	//*  25   49:aload           4
	//*  26   51:invokeinterface #290 <Method int List.size()>
	//*  27   56:ifle            65
			rerunTransactions(path);
	//   28   59:aload_0         
	//   29   60:aload_3         
	//   30   61:invokespecial   #404 <Method Path rerunTransactions(Path)>
	//   31   64:pop             
		postEvents(((List) (firebaseerror)));
	//   32   65:aload_0         
	//   33   66:aload           4
	//   34   68:invokespecial   #371 <Method void postEvents(List)>
	//   35   71:return          
	}

	private void aggregateTransactionQueues(final List queue, Tree tree)
	{
		List list = (List)tree.getValue();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #260 <Method Object Tree.getValue()>
	//    2    4:checkcast       #262 <Class List>
	//    3    7:astore_3        
		if(list != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          20
			queue.addAll(((java.util.Collection) (list)));
	//    6   12:aload_1         
	//    7   13:aload_3         
	//    8   14:invokeinterface #352 <Method boolean List.addAll(java.util.Collection)>
	//    9   19:pop             
		tree.forEachChild(new com.firebase.client.core.utilities.Tree.TreeVisitor() {

			public void visitTree(Tree tree1)
			{
				aggregateTransactionQueues(queue, tree1);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field Repo this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field List val$queue>
			//    4    8:aload_1         
			//    5    9:invokestatic    #32  <Method void Repo.access$2800(Repo, List, Tree)>
			//    6   12:return          
			}

			final Repo this$0;
			final List val$queue;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Repo this$0>
				queue = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field List val$queue>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   10   20:aload_2         
	//   11   21:new             #30  <Class Repo$19>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #464 <Method void Repo$19(Repo, List)>
	//   16   30:invokevirtual   #467 <Method void Tree.forEachChild(com.firebase.client.core.utilities.Tree$TreeVisitor)>
	//   17   33:return          
	}

	private List buildTransactionQueue(Tree tree)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #264 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #265 <Method void ArrayList()>
	//    3    7:astore_2        
		aggregateTransactionQueues(((List) (arraylist)), tree);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #432 <Method void aggregateTransactionQueues(List, Tree)>
		Collections.sort(((List) (arraylist)));
	//    8   14:aload_2         
	//    9   15:invokestatic    #475 <Method void Collections.sort(List)>
		return ((List) (arraylist));
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	private void deferredInitialization()
	{
		connection.establishConnection();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field PersistentConnection connection>
	//    2    4:invokevirtual   #479 <Method void PersistentConnection.establishConnection()>
		PersistenceManager persistencemanager = ctx.getPersistenceManager(repoInfo.host);
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field Context ctx>
	//    5   11:aload_0         
	//    6   12:getfield        #141 <Field RepoInfo repoInfo>
	//    7   15:getfield        #484 <Field String RepoInfo.host>
	//    8   18:invokevirtual   #488 <Method PersistenceManager Context.getPersistenceManager(String)>
	//    9   21:astore_2        
		infoData = new SnapshotHolder();
	//   10   22:aload_0         
	//   11   23:new             #490 <Class SnapshotHolder>
	//   12   26:dup             
	//   13   27:invokespecial   #491 <Method void SnapshotHolder()>
	//   14   30:putfield        #398 <Field SnapshotHolder infoData>
		onDisconnect = new SparseSnapshotTree();
	//   15   33:aload_0         
	//   16   34:new             #493 <Class SparseSnapshotTree>
	//   17   37:dup             
	//   18   38:invokespecial   #494 <Method void SparseSnapshotTree()>
	//   19   41:putfield        #454 <Field SparseSnapshotTree onDisconnect>
		transactionQueueTree = new Tree();
	//   20   44:aload_0         
	//   21   45:new             #203 <Class Tree>
	//   22   48:dup             
	//   23   49:invokespecial   #495 <Method void Tree()>
	//   24   52:putfield        #237 <Field Tree transactionQueueTree>
		infoSyncTree = new SyncTree(ctx, ((PersistenceManager) (new NoopPersistenceManager())), new SyncTree.ListenProvider() {

			public void startListening(final QuerySpec query, Tag tag, SyncTree.SyncTreeHash synctreehash, SyncTree.CompletionListener completionlistener)
			{
				scheduleNow(((_cls1) (completionlistener)). new Runnable() {

					public void run()
					{
						Object obj = ((Object) (infoData.getNode(query.getPath())));
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field Repo$2 this$1>
					//    2    4:getfield        #34  <Field Repo Repo$2.this$0>
					//    3    7:invokestatic    #40  <Method SnapshotHolder Repo.access$100(Repo)>
					//    4   10:aload_0         
					//    5   11:getfield        #23  <Field QuerySpec val$query>
					//    6   14:invokevirtual   #46  <Method Path QuerySpec.getPath()>
					//    7   17:invokevirtual   #52  <Method Node SnapshotHolder.getNode(Path)>
					//    8   20:astore_1        
						if(!((Node) (obj)).isEmpty())
					//*   9   21:aload_1         
					//*  10   22:invokeinterface #58  <Method boolean Node.isEmpty()>
					//*  11   27:ifne            74
						{
							obj = ((Object) (infoSyncTree.applyServerOverwrite(query.getPath(), ((Node) (obj)))));
					//   12   30:aload_0         
					//   13   31:getfield        #21  <Field Repo$2 this$1>
					//   14   34:getfield        #34  <Field Repo Repo$2.this$0>
					//   15   37:invokestatic    #62  <Method SyncTree Repo.access$200(Repo)>
					//   16   40:aload_0         
					//   17   41:getfield        #23  <Field QuerySpec val$query>
					//   18   44:invokevirtual   #46  <Method Path QuerySpec.getPath()>
					//   19   47:aload_1         
					//   20   48:invokevirtual   #68  <Method List SyncTree.applyServerOverwrite(Path, Node)>
					//   21   51:astore_1        
							postEvents(((List) (obj)));
					//   22   52:aload_0         
					//   23   53:getfield        #21  <Field Repo$2 this$1>
					//   24   56:getfield        #34  <Field Repo Repo$2.this$0>
					//   25   59:aload_1         
					//   26   60:invokestatic    #72  <Method void Repo.access$300(Repo, List)>
							onComplete.onListenComplete(((FirebaseError) (null)));
					//   27   63:aload_0         
					//   28   64:getfield        #25  <Field SyncTree$CompletionListener val$onComplete>
					//   29   67:aconst_null     
					//   30   68:invokeinterface #78  <Method List SyncTree$CompletionListener.onListenComplete(FirebaseError)>
					//   31   73:pop             
						}
					//   32   74:return          
					}

					final _cls2 this$1;
					final SyncTree.CompletionListener val$onComplete;
					final QuerySpec val$query;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Repo$2 this$1>
				query = queryspec;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field QuerySpec val$query>
				onComplete = SyncTree.CompletionListener.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field SyncTree$CompletionListener val$onComplete>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Repo this$0>
			//    2    4:new             #13  <Class Repo$2$1>
			//    3    7:dup             
			//    4    8:aload_0         
			//    5    9:aload_1         
			//    6   10:aload           4
			//    7   12:invokespecial   #27  <Method void Repo$2$1(Repo$2, QuerySpec, SyncTree$CompletionListener)>
			//    8   15:invokevirtual   #31  <Method void Repo.scheduleNow(Runnable)>
			//    9   18:return          
			}

			public void stopListening(QuerySpec queryspec, Tag tag)
			{
			//    0    0:return          
			}

			final Repo this$0;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Repo this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   25   55:aload_0         
	//   26   56:new             #344 <Class SyncTree>
	//   27   59:dup             
	//   28   60:aload_0         
	//   29   61:getfield        #143 <Field Context ctx>
	//   30   64:new             #497 <Class NoopPersistenceManager>
	//   31   67:dup             
	//   32   68:invokespecial   #498 <Method void NoopPersistenceManager()>
	//   33   71:new             #32  <Class Repo$2>
	//   34   74:dup             
	//   35   75:aload_0         
	//   36   76:invokespecial   #499 <Method void Repo$2(Repo)>
	//   37   79:invokespecial   #502 <Method void SyncTree(Context, PersistenceManager, SyncTree$ListenProvider)>
	//   38   82:putfield        #414 <Field SyncTree infoSyncTree>
		serverSyncTree = new SyncTree(ctx, persistencemanager, new SyncTree.ListenProvider() {

			public void startListening(QuerySpec queryspec, Tag tag, SyncTree.SyncTreeHash synctreehash, SyncTree.CompletionListener completionlistener)
			{
				connection.listen(queryspec, synctreehash, tag, ((_cls1) (completionlistener)). new PersistentConnection.RequestResultListener() {

					public void onRequestResult(FirebaseError firebaseerror)
					{
						firebaseerror = ((FirebaseError) (onListenComplete.onListenComplete(firebaseerror)));
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field SyncTree$CompletionListener val$onListenComplete>
					//    2    4:aload_1         
					//    3    5:invokeinterface #33  <Method List SyncTree$CompletionListener.onListenComplete(FirebaseError)>
					//    4   10:astore_1        
						postEvents(((List) (firebaseerror)));
					//    5   11:aload_0         
					//    6   12:getfield        #19  <Field Repo$3 this$1>
					//    7   15:getfield        #37  <Field Repo Repo$3.this$0>
					//    8   18:aload_1         
					//    9   19:invokestatic    #43  <Method void Repo.access$300(Repo, List)>
					//   10   22:return          
					}

					final _cls3 this$1;
					final SyncTree.CompletionListener val$onListenComplete;

			
			{
				this$1 = final__pcls3;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Repo$3 this$1>
				onListenComplete = SyncTree.CompletionListener.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field SyncTree$CompletionListener val$onListenComplete>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Repo this$0>
			//    2    4:invokestatic    #28  <Method PersistentConnection Repo.access$400(Repo)>
			//    3    7:aload_1         
			//    4    8:aload_3         
			//    5    9:aload_2         
			//    6   10:new             #13  <Class Repo$3$1>
			//    7   13:dup             
			//    8   14:aload_0         
			//    9   15:aload           4
			//   10   17:invokespecial   #31  <Method void Repo$3$1(Repo$3, SyncTree$CompletionListener)>
			//   11   20:invokevirtual   #37  <Method void PersistentConnection.listen(QuerySpec, SyncTree$SyncTreeHash, Tag, PersistentConnection$RequestResultListener)>
			//   12   23:return          
			}

			public void stopListening(QuerySpec queryspec, Tag tag)
			{
				connection.unlisten(queryspec);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Repo this$0>
			//    2    4:invokestatic    #28  <Method PersistentConnection Repo.access$400(Repo)>
			//    3    7:aload_1         
			//    4    8:invokevirtual   #43  <Method void PersistentConnection.unlisten(QuerySpec)>
			//    5   11:return          
			}

			final Repo this$0;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Repo this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   39   85:aload_0         
	//   40   86:new             #344 <Class SyncTree>
	//   41   89:dup             
	//   42   90:aload_0         
	//   43   91:getfield        #143 <Field Context ctx>
	//   44   94:aload_2         
	//   45   95:new             #42  <Class Repo$3>
	//   46   98:dup             
	//   47   99:aload_0         
	//   48  100:invokespecial   #503 <Method void Repo$3(Repo)>
	//   49  103:invokespecial   #502 <Method void SyncTree(Context, PersistenceManager, SyncTree$ListenProvider)>
	//   50  106:putfield        #338 <Field SyncTree serverSyncTree>
		restoreWrites(persistencemanager);
	//   51  109:aload_0         
	//   52  110:aload_2         
	//   53  111:invokespecial   #507 <Method void restoreWrites(PersistenceManager)>
		boolean flag;
		if(authenticationManager.getAuth() != null)
	//*  54  114:aload_0         
	//*  55  115:getfield        #187 <Field AuthenticationManager authenticationManager>
	//*  56  118:invokevirtual   #511 <Method com.firebase.client.AuthData AuthenticationManager.getAuth()>
	//*  57  121:ifnull          129
			flag = true;
	//   58  124:iconst_1        
	//   59  125:istore_1        
		else
	//*  60  126:goto            131
			flag = false;
	//   61  129:iconst_0        
	//   62  130:istore_1        
		updateInfo(Constants.DOT_INFO_AUTHENTICATED, ((Object) (Boolean.valueOf(flag))));
	//   63  131:aload_0         
	//   64  132:getstatic       #517 <Field ChildKey Constants.DOT_INFO_AUTHENTICATED>
	//   65  135:iload_1         
	//   66  136:invokestatic    #523 <Method Boolean Boolean.valueOf(boolean)>
	//   67  139:invokespecial   #527 <Method void updateInfo(ChildKey, Object)>
		updateInfo(Constants.DOT_INFO_CONNECTED, ((Object) (Boolean.valueOf(false))));
	//   68  142:aload_0         
	//   69  143:getstatic       #530 <Field ChildKey Constants.DOT_INFO_CONNECTED>
	//   70  146:iconst_0        
	//   71  147:invokestatic    #523 <Method Boolean Boolean.valueOf(boolean)>
	//   72  150:invokespecial   #527 <Method void updateInfo(ChildKey, Object)>
	//   73  153:return          
	}

	private Tree getAncestorTransactionNode(Path path)
	{
		Tree tree;
		for(tree = transactionQueueTree; !path.isEmpty() && tree.getValue() == null; path = path.popFront())
	//*   0    0:aload_0         
	//*   1    1:getfield        #237 <Field Tree transactionQueueTree>
	//*   2    4:astore_2        
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #535 <Method boolean Path.isEmpty()>
	//*   5    9:ifne            50
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #260 <Method Object Tree.getValue()>
	//*   8   16:ifnonnull       50
			tree = tree.subTree(new Path(new ChildKey[] {
				path.getFront()
			}));
	//    9   19:aload_2         
	//   10   20:new             #532 <Class Path>
	//   11   23:dup             
	//   12   24:iconst_1        
	//   13   25:anewarray       ChildKey[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:aload_1         
	//   17   31:invokevirtual   #541 <Method ChildKey Path.getFront()>
	//   18   34:aastore         
	//   19   35:invokespecial   #544 <Method void Path(ChildKey[])>
	//   20   38:invokevirtual   #240 <Method Tree Tree.subTree(Path)>
	//   21   41:astore_2        

	//   22   42:aload_1         
	//   23   43:invokevirtual   #547 <Method Path Path.popFront()>
	//   24   46:astore_1        
	//*  25   47:goto            5
		return tree;
	//   26   50:aload_2         
	//   27   51:areturn         
	}

	private Node getLatestState(Path path)
	{
		return getLatestState(path, ((List) (new ArrayList())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #264 <Class ArrayList>
	//    3    5:dup             
	//    4    6:invokespecial   #265 <Method void ArrayList()>
	//    5    9:invokespecial   #553 <Method Node getLatestState(Path, List)>
	//    6   12:areturn         
	}

	private Node getLatestState(Path path, List list)
	{
		list = ((List) (serverSyncTree.calcCompleteEventCache(path, list)));
	//    0    0:aload_0         
	//    1    1:getfield        #338 <Field SyncTree serverSyncTree>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #556 <Method Node SyncTree.calcCompleteEventCache(Path, List)>
	//    5    9:astore_2        
		path = ((Path) (list));
	//    6   10:aload_2         
	//    7   11:astore_1        
		if(list == null)
	//*   8   12:aload_2         
	//*   9   13:ifnonnull       20
			path = ((Path) (EmptyNode.Empty()));
	//   10   16:invokestatic    #562 <Method EmptyNode EmptyNode.Empty()>
	//   11   19:astore_1        
		return ((Node) (path));
	//   12   20:aload_1         
	//   13   21:areturn         
	}

	private long getNextWriteId()
	{
		long l = nextWriteId;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field long nextWriteId>
	//    2    4:lstore_1        
		nextWriteId = 1L + l;
	//    3    5:aload_0         
	//    4    6:lconst_1        
	//    5    7:lload_1         
	//    6    8:ladd            
	//    7    9:putfield        #135 <Field long nextWriteId>
		return l;
	//    8   12:lload_1         
	//    9   13:lreturn         
	}

	private long nextTransactionOrder()
	{
		long l = transactionOrder;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field long transactionOrder>
	//    2    4:lstore_1        
		transactionOrder = 1L + l;
	//    3    5:aload_0         
	//    4    6:lconst_1        
	//    5    7:lload_1         
	//    6    8:ladd            
	//    7    9:putfield        #139 <Field long transactionOrder>
		return l;
	//    8   12:lload_1         
	//    9   13:lreturn         
	}

	private void postEvents(List list)
	{
		if(!list.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #567 <Method boolean List.isEmpty()>
	//*   2    6:ifne            17
			eventRaiser.raiseEvents(list);
	//    3    9:aload_0         
	//    4   10:getfield        #173 <Field EventRaiser eventRaiser>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #570 <Method void EventRaiser.raiseEvents(List)>
	//    7   17:return          
	}

	private void pruneCompletedTransactions(Tree tree)
	{
		List list = (List)tree.getValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #260 <Method Object Tree.getValue()>
	//    2    4:checkcast       #262 <Class List>
	//    3    7:astore_3        
		if(list != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          83
		{
			for(int i = 0; i < list.size();)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:aload_3         
	//*  10   16:invokeinterface #290 <Method int List.size()>
	//*  11   21:icmpge          61
				if(((TransactionData)list.get(i)).status == TransactionStatus.COMPLETED)
	//*  12   24:aload_3         
	//*  13   25:iload_2         
	//*  14   26:invokeinterface #294 <Method Object List.get(int)>
	//*  15   31:checkcast       #61  <Class Repo$TransactionData>
	//*  16   34:invokestatic    #298 <Method Repo$TransactionStatus Repo$TransactionData.access$1500(Repo$TransactionData)>
	//*  17   37:getstatic       #574 <Field Repo$TransactionStatus Repo$TransactionStatus.COMPLETED>
	//*  18   40:if_acmpne       54
					list.remove(i);
	//   19   43:aload_3         
	//   20   44:iload_2         
	//   21   45:invokeinterface #577 <Method Object List.remove(int)>
	//   22   50:pop             
				else
	//*  23   51:goto            14
					i++;
	//   24   54:iload_2         
	//   25   55:iconst_1        
	//   26   56:iadd            
	//   27   57:istore_2        

	//*  28   58:goto            14
			if(list.size() > 0)
	//*  29   61:aload_3         
	//*  30   62:invokeinterface #290 <Method int List.size()>
	//*  31   67:ifle            78
				tree.setValue(((Object) (list)));
	//   32   70:aload_1         
	//   33   71:aload_3         
	//   34   72:invokevirtual   #363 <Method void Tree.setValue(Object)>
			else
	//*  35   75:goto            83
				tree.setValue(((Object) (null)));
	//   36   78:aload_1         
	//   37   79:aconst_null     
	//   38   80:invokevirtual   #363 <Method void Tree.setValue(Object)>
		}
		tree.forEachChild(new com.firebase.client.core.utilities.Tree.TreeVisitor() {

			public void visitTree(Tree tree1)
			{
				pruneCompletedTransactions(tree1);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field Repo this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method void Repo.access$2400(Repo, Tree)>
			//    4    8:return          
			}

			final Repo this$0;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Repo this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   39   83:aload_1         
	//   40   84:new             #24  <Class Repo$16>
	//   41   87:dup             
	//   42   88:aload_0         
	//   43   89:invokespecial   #578 <Method void Repo$16(Repo)>
	//   44   92:invokevirtual   #467 <Method void Tree.forEachChild(com.firebase.client.core.utilities.Tree$TreeVisitor)>
	//   45   95:return          
	}

	private void rerunTransactionQueue(final List callbackError, Path path)
	{
		ArrayList arraylist;
		ArrayList arraylist1;
		Iterator iterator1;
		if(callbackError.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #567 <Method boolean List.isEmpty()>
	//*   2    6:ifeq            10
			return;
	//    3    9:return          
		arraylist = new ArrayList();
	//    4   10:new             #264 <Class ArrayList>
	//    5   13:dup             
	//    6   14:invokespecial   #265 <Method void ArrayList()>
	//    7   17:astore          8
		arraylist1 = new ArrayList();
	//    8   19:new             #264 <Class ArrayList>
	//    9   22:dup             
	//   10   23:invokespecial   #265 <Method void ArrayList()>
	//   11   26:astore          9
		for(Iterator iterator = callbackError.iterator(); iterator.hasNext(); ((List) (arraylist1)).add(((Object) (Long.valueOf(((TransactionData)iterator.next()).currentWriteId)))));
	//   12   28:aload_1         
	//   13   29:invokeinterface #375 <Method Iterator List.iterator()>
	//   14   34:astore          6
	//   15   36:aload           6
	//   16   38:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//   17   43:ifeq            73
	//   18   46:aload           9
	//   19   48:aload           6
	//   20   50:invokeinterface #383 <Method Object Iterator.next()>
	//   21   55:checkcast       #61  <Class Repo$TransactionData>
	//   22   58:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//   23   61:invokestatic    #588 <Method Long Long.valueOf(long)>
	//   24   64:invokeinterface #359 <Method boolean List.add(Object)>
	//   25   69:pop             
	//*  26   70:goto            36
		iterator1 = callbackError.iterator();
	//   27   73:aload_1         
	//   28   74:invokeinterface #375 <Method Iterator List.iterator()>
	//   29   79:astore          10
_L2:
		int i;
		boolean flag;
		Object obj1;
		final TransactionData transaction;
		ArrayList arraylist2;
		boolean flag1 = iterator1.hasNext();
	//   30   81:aload           10
	//   31   83:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//   32   88:istore          5
		i = 0;
	//   33   90:iconst_0        
	//   34   91:istore_3        
		if(!flag1)
			break; /* Loop/switch isn't completed */
	//   35   92:iload           5
	//   36   94:ifeq            589
		transaction = (TransactionData)iterator1.next();
	//   37   97:aload           10
	//   38   99:invokeinterface #383 <Method Object Iterator.next()>
	//   39  104:checkcast       #61  <Class Repo$TransactionData>
	//   40  107:astore          11
		Path.getRelative(path, transaction.path);
	//   41  109:aload_2         
	//   42  110:aload           11
	//   43  112:invokestatic    #323 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//   44  115:invokestatic    #592 <Method Path Path.getRelative(Path, Path)>
	//   45  118:pop             
		arraylist2 = new ArrayList();
	//   46  119:new             #264 <Class ArrayList>
	//   47  122:dup             
	//   48  123:invokespecial   #265 <Method void ArrayList()>
	//   49  126:astore          12
		callbackError = ((List) (transaction.status));
	//   50  128:aload           11
	//   51  130:invokestatic    #298 <Method Repo$TransactionStatus Repo$TransactionData.access$1500(Repo$TransactionData)>
	//   52  133:astore_1        
		TransactionStatus transactionstatus = TransactionStatus.NEEDS_ABORT;
	//   53  134:getstatic       #595 <Field Repo$TransactionStatus Repo$TransactionStatus.NEEDS_ABORT>
	//   54  137:astore          6
		obj1 = null;
	//   55  139:aconst_null     
	//   56  140:astore          7
		flag = true;
	//   57  142:iconst_1        
	//   58  143:istore          4
		if(callbackError == transactionstatus)
	//*  59  145:aload_1         
	//*  60  146:aload           6
	//*  61  148:if_acmpne       209
		{
			FirebaseError firebaseerror = transaction.abortReason;
	//   62  151:aload           11
	//   63  153:invokestatic    #599 <Method FirebaseError Repo$TransactionData.access$2600(Repo$TransactionData)>
	//   64  156:astore          6
			callbackError = ((List) (firebaseerror));
	//   65  158:aload           6
	//   66  160:astore_1        
			i = ((int) (flag));
	//   67  161:iload           4
	//   68  163:istore_3        
			if(firebaseerror.getCode() != -25)
	//*  69  164:aload           6
	//*  70  166:invokevirtual   #462 <Method int FirebaseError.getCode()>
	//*  71  169:bipush          -25
	//*  72  171:icmpeq          502
			{
				((List) (arraylist2)).addAll(((java.util.Collection) (serverSyncTree.ackUserWrite(transaction.currentWriteId, true, false, ((com.firebase.client.utilities.Clock) (serverClock))))));
	//   73  174:aload           12
	//   74  176:aload_0         
	//   75  177:getfield        #338 <Field SyncTree serverSyncTree>
	//   76  180:aload           11
	//   77  182:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//   78  185:iconst_1        
	//   79  186:iconst_0        
	//   80  187:aload_0         
	//   81  188:getfield        #129 <Field OffsetClock serverClock>
	//   82  191:invokevirtual   #348 <Method List SyncTree.ackUserWrite(long, boolean, boolean, com.firebase.client.utilities.Clock)>
	//   83  194:invokeinterface #352 <Method boolean List.addAll(java.util.Collection)>
	//   84  199:pop             
				callbackError = ((List) (firebaseerror));
	//   85  200:aload           6
	//   86  202:astore_1        
				i = ((int) (flag));
	//   87  203:iload           4
	//   88  205:istore_3        
			}
			break MISSING_BLOCK_LABEL_502;
	//   89  206:goto            502
		}
		if(transaction.status != TransactionStatus.RUN)
			break MISSING_BLOCK_LABEL_497;
	//   90  209:aload           11
	//   91  211:invokestatic    #298 <Method Repo$TransactionStatus Repo$TransactionData.access$1500(Repo$TransactionData)>
	//   92  214:getstatic       #602 <Field Repo$TransactionStatus Repo$TransactionStatus.RUN>
	//   93  217:if_acmpne       497
		if(transaction.retryCount >= 25)
	//*  94  220:aload           11
	//*  95  222:invokestatic    #606 <Method int Repo$TransactionData.access$1800(Repo$TransactionData)>
	//*  96  225:bipush          25
	//*  97  227:icmplt          268
		{
			callbackError = ((List) (FirebaseError.fromStatus("maxretries")));
	//   98  230:ldc1            #78  <String "maxretries">
	//   99  232:invokestatic    #271 <Method FirebaseError FirebaseError.fromStatus(String)>
	//  100  235:astore_1        
			((List) (arraylist2)).addAll(((java.util.Collection) (serverSyncTree.ackUserWrite(transaction.currentWriteId, true, false, ((com.firebase.client.utilities.Clock) (serverClock))))));
	//  101  236:aload           12
	//  102  238:aload_0         
	//  103  239:getfield        #338 <Field SyncTree serverSyncTree>
	//  104  242:aload           11
	//  105  244:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//  106  247:iconst_1        
	//  107  248:iconst_0        
	//  108  249:aload_0         
	//  109  250:getfield        #129 <Field OffsetClock serverClock>
	//  110  253:invokevirtual   #348 <Method List SyncTree.ackUserWrite(long, boolean, boolean, com.firebase.client.utilities.Clock)>
	//  111  256:invokeinterface #352 <Method boolean List.addAll(java.util.Collection)>
	//  112  261:pop             
			i = ((int) (flag));
	//  113  262:iload           4
	//  114  264:istore_3        
			break MISSING_BLOCK_LABEL_502;
	//  115  265:goto            502
		}
		callbackError = ((List) (getLatestState(transaction.path, ((List) (arraylist1)))));
	//  116  268:aload_0         
	//  117  269:aload           11
	//  118  271:invokestatic    #323 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//  119  274:aload           9
	//  120  276:invokespecial   #553 <Method Node getLatestState(Path, List)>
	//  121  279:astore_1        
		transaction.currentInputSnapshot = ((Node) (callbackError));
	//  122  280:aload           11
	//  123  282:aload_1         
	//  124  283:invokestatic    #610 <Method Node Repo$TransactionData.access$1202(Repo$TransactionData, Node)>
	//  125  286:pop             
		callbackError = ((List) (new MutableData(((Node) (callbackError)))));
	//  126  287:new             #612 <Class MutableData>
	//  127  290:dup             
	//  128  291:aload_1         
	//  129  292:invokespecial   #615 <Method void MutableData(Node)>
	//  130  295:astore_1        
		Object obj = ((Object) (transaction.handler.doTransaction(((MutableData) (callbackError)))));
	//  131  296:aload           11
	//  132  298:invokestatic    #619 <Method com.firebase.client.Transaction$Handler Repo$TransactionData.access$2100(Repo$TransactionData)>
	//  133  301:aload_1         
	//  134  302:invokeinterface #625 <Method com.firebase.client.Transaction$Result com.firebase.client.Transaction$Handler.doTransaction(MutableData)>
	//  135  307:astore          6
		callbackError = null;
	//  136  309:aconst_null     
	//  137  310:astore_1        
		break MISSING_BLOCK_LABEL_325;
	//  138  311:goto            325
		callbackError;
	//  139  314:astore_1        
		callbackError = ((List) (FirebaseError.fromException(((Throwable) (callbackError)))));
	//  140  315:aload_1         
	//  141  316:invokestatic    #629 <Method FirebaseError FirebaseError.fromException(Throwable)>
	//  142  319:astore_1        
		obj = ((Object) (Transaction.abort()));
	//  143  320:invokestatic    #635 <Method com.firebase.client.Transaction$Result Transaction.abort()>
	//  144  323:astore          6
		if(((com.firebase.client.Transaction.Result) (obj)).isSuccess())
	//* 145  325:aload           6
	//* 146  327:invokevirtual   #640 <Method boolean com.firebase.client.Transaction$Result.isSuccess()>
	//* 147  330:ifeq            465
		{
			callbackError = ((List) (Long.valueOf(transaction.currentWriteId)));
	//  148  333:aload           11
	//  149  335:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//  150  338:invokestatic    #588 <Method Long Long.valueOf(long)>
	//  151  341:astore_1        
			Object obj2 = ((Object) (ServerValues.generateServerValues(((com.firebase.client.utilities.Clock) (serverClock)))));
	//  152  342:aload_0         
	//  153  343:getfield        #129 <Field OffsetClock serverClock>
	//  154  346:invokestatic    #646 <Method Map ServerValues.generateServerValues(com.firebase.client.utilities.Clock)>
	//  155  349:astore          13
			obj = ((Object) (((com.firebase.client.Transaction.Result) (obj)).getNode()));
	//  156  351:aload           6
	//  157  353:invokevirtual   #650 <Method Node com.firebase.client.Transaction$Result.getNode()>
	//  158  356:astore          6
			obj2 = ((Object) (ServerValues.resolveDeferredValueSnapshot(((Node) (obj)), ((Map) (obj2)))));
	//  159  358:aload           6
	//  160  360:aload           13
	//  161  362:invokestatic    #654 <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
	//  162  365:astore          13
			transaction.currentOutputSnapshotRaw = ((Node) (obj));
	//  163  367:aload           11
	//  164  369:aload           6
	//  165  371:invokestatic    #657 <Method Node Repo$TransactionData.access$1302(Repo$TransactionData, Node)>
	//  166  374:pop             
			transaction.currentOutputSnapshotResolved = ((Node) (obj2));
	//  167  375:aload           11
	//  168  377:aload           13
	//  169  379:invokestatic    #660 <Method Node Repo$TransactionData.access$1402(Repo$TransactionData, Node)>
	//  170  382:pop             
			transaction.currentWriteId = getNextWriteId();
	//  171  383:aload           11
	//  172  385:aload_0         
	//  173  386:invokespecial   #662 <Method long getNextWriteId()>
	//  174  389:invokestatic    #666 <Method long Repo$TransactionData.access$1602(Repo$TransactionData, long)>
	//  175  392:pop2            
			((List) (arraylist1)).remove(((Object) (callbackError)));
	//  176  393:aload           9
	//  177  395:aload_1         
	//  178  396:invokeinterface #668 <Method boolean List.remove(Object)>
	//  179  401:pop             
			((List) (arraylist2)).addAll(((java.util.Collection) (serverSyncTree.applyUserOverwrite(transaction.path, ((Node) (obj)), ((Node) (obj2)), transaction.currentWriteId, transaction.applyLocally, false))));
	//  180  402:aload           12
	//  181  404:aload_0         
	//  182  405:getfield        #338 <Field SyncTree serverSyncTree>
	//  183  408:aload           11
	//  184  410:invokestatic    #323 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//  185  413:aload           6
	//  186  415:aload           13
	//  187  417:aload           11
	//  188  419:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//  189  422:aload           11
	//  190  424:invokestatic    #672 <Method boolean Repo$TransactionData.access$2700(Repo$TransactionData)>
	//  191  427:iconst_0        
	//  192  428:invokevirtual   #676 <Method List SyncTree.applyUserOverwrite(Path, Node, Node, long, boolean, boolean)>
	//  193  431:invokeinterface #352 <Method boolean List.addAll(java.util.Collection)>
	//  194  436:pop             
			((List) (arraylist2)).addAll(((java.util.Collection) (serverSyncTree.ackUserWrite(((Long) (callbackError)).longValue(), true, false, ((com.firebase.client.utilities.Clock) (serverClock))))));
	//  195  437:aload           12
	//  196  439:aload_0         
	//  197  440:getfield        #338 <Field SyncTree serverSyncTree>
	//  198  443:aload_1         
	//  199  444:invokevirtual   #679 <Method long Long.longValue()>
	//  200  447:iconst_1        
	//  201  448:iconst_0        
	//  202  449:aload_0         
	//  203  450:getfield        #129 <Field OffsetClock serverClock>
	//  204  453:invokevirtual   #348 <Method List SyncTree.ackUserWrite(long, boolean, boolean, com.firebase.client.utilities.Clock)>
	//  205  456:invokeinterface #352 <Method boolean List.addAll(java.util.Collection)>
	//  206  461:pop             
		} else
	//* 207  462:goto            497
		{
			((List) (arraylist2)).addAll(((java.util.Collection) (serverSyncTree.ackUserWrite(transaction.currentWriteId, true, false, ((com.firebase.client.utilities.Clock) (serverClock))))));
	//  208  465:aload           12
	//  209  467:aload_0         
	//  210  468:getfield        #338 <Field SyncTree serverSyncTree>
	//  211  471:aload           11
	//  212  473:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//  213  476:iconst_1        
	//  214  477:iconst_0        
	//  215  478:aload_0         
	//  216  479:getfield        #129 <Field OffsetClock serverClock>
	//  217  482:invokevirtual   #348 <Method List SyncTree.ackUserWrite(long, boolean, boolean, com.firebase.client.utilities.Clock)>
	//  218  485:invokeinterface #352 <Method boolean List.addAll(java.util.Collection)>
	//  219  490:pop             
			i = ((int) (flag));
	//  220  491:iload           4
	//  221  493:istore_3        
			break MISSING_BLOCK_LABEL_502;
	//  222  494:goto            502
		}
		i = 0;
	//  223  497:iconst_0        
	//  224  498:istore_3        
		callbackError = ((List) (obj1));
	//  225  499:aload           7
	//  226  501:astore_1        
		postEvents(((List) (arraylist2)));
	//  227  502:aload_0         
	//  228  503:aload           12
	//  229  505:invokespecial   #371 <Method void postEvents(List)>
		if(i != 0)
	//* 230  508:iload_3         
	//* 231  509:ifeq            81
		{
			transaction.status = TransactionStatus.COMPLETED;
	//  232  512:aload           11
	//  233  514:getstatic       #574 <Field Repo$TransactionStatus Repo$TransactionStatus.COMPLETED>
	//  234  517:invokestatic    #309 <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
	//  235  520:pop             
			final DataSnapshot snapshot = new DataSnapshot(new Firebase(this, transaction.path), IndexedNode.from(transaction.currentInputSnapshot));
	//  236  521:new             #681 <Class DataSnapshot>
	//  237  524:dup             
	//  238  525:new             #683 <Class Firebase>
	//  239  528:dup             
	//  240  529:aload_0         
	//  241  530:aload           11
	//  242  532:invokestatic    #323 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//  243  535:invokespecial   #686 <Method void Firebase(Repo, Path)>
	//  244  538:aload           11
	//  245  540:invokestatic    #690 <Method Node Repo$TransactionData.access$1200(Repo$TransactionData)>
	//  246  543:invokestatic    #696 <Method IndexedNode IndexedNode.from(Node)>
	//  247  546:invokespecial   #699 <Method void DataSnapshot(Firebase, IndexedNode)>
	//  248  549:astore          6
			scheduleNow(new Runnable() {

				public void run()
				{
					Repo repo = Repo.this;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field Repo this$0>
				//    2    4:astore_1        
					repo.removeEventCallback(((EventRegistration) (new ValueEventRegistration(repo, transaction.outstandingListener, QuerySpec.defaultQueryAtPath(transaction.path)))));
				//    3    5:aload_1         
				//    4    6:new             #28  <Class ValueEventRegistration>
				//    5    9:dup             
				//    6   10:aload_1         
				//    7   11:aload_0         
				//    8   12:getfield        #21  <Field Repo$TransactionData val$transaction>
				//    9   15:invokestatic    #34  <Method ValueEventListener Repo$TransactionData.access$2200(Repo$TransactionData)>
				//   10   18:aload_0         
				//   11   19:getfield        #21  <Field Repo$TransactionData val$transaction>
				//   12   22:invokestatic    #38  <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
				//   13   25:invokestatic    #44  <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
				//   14   28:invokespecial   #47  <Method void ValueEventRegistration(Repo, ValueEventListener, QuerySpec)>
				//   15   31:invokevirtual   #51  <Method void Repo.removeEventCallback(EventRegistration)>
				//   16   34:return          
				}

				final Repo this$0;
				final TransactionData val$transaction;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Repo this$0>
				transaction = transactiondata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Repo$TransactionData val$transaction>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  249  551:aload_0         
	//  250  552:new             #26  <Class Repo$17>
	//  251  555:dup             
	//  252  556:aload_0         
	//  253  557:aload           11
	//  254  559:invokespecial   #702 <Method void Repo$17(Repo, Repo$TransactionData)>
	//  255  562:invokevirtual   #195 <Method void scheduleNow(Runnable)>
			((List) (arraylist)).add(((Object) (new Runnable() {

				public void run()
				{
					transaction.handler.onComplete(callbackError, false, snapshot);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field Repo$TransactionData val$transaction>
				//    2    4:invokestatic    #40  <Method com.firebase.client.Transaction$Handler Repo$TransactionData.access$2100(Repo$TransactionData)>
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field FirebaseError val$callbackError>
				//    5   11:iconst_0        
				//    6   12:aload_0         
				//    7   13:getfield        #29  <Field DataSnapshot val$snapshot>
				//    8   16:invokeinterface #46  <Method void com.firebase.client.Transaction$Handler.onComplete(FirebaseError, boolean, DataSnapshot)>
				//    9   21:return          
				}

				final Repo this$0;
				final FirebaseError val$callbackError;
				final DataSnapshot val$snapshot;
				final TransactionData val$transaction;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Repo this$0>
				transaction = transactiondata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Repo$TransactionData val$transaction>
				callbackError = firebaseerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field FirebaseError val$callbackError>
				snapshot = datasnapshot;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field DataSnapshot val$snapshot>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
)));
	//  256  565:aload           8
	//  257  567:new             #28  <Class Repo$18>
	//  258  570:dup             
	//  259  571:aload_0         
	//  260  572:aload           11
	//  261  574:aload_1         
	//  262  575:aload           6
	//  263  577:invokespecial   #705 <Method void Repo$18(Repo, Repo$TransactionData, FirebaseError, DataSnapshot)>
	//  264  580:invokeinterface #359 <Method boolean List.add(Object)>
	//  265  585:pop             
		}
		if(true) goto _L2; else goto _L1
	//  266  586:goto            81
_L1:
		pruneCompletedTransactions(transactionQueueTree);
	//  267  589:aload_0         
	//  268  590:aload_0         
	//  269  591:getfield        #237 <Field Tree transactionQueueTree>
	//  270  594:invokespecial   #422 <Method void pruneCompletedTransactions(Tree)>
		for(; i < ((List) (arraylist)).size(); i++)
	//* 271  597:iload_3         
	//* 272  598:aload           8
	//* 273  600:invokeinterface #290 <Method int List.size()>
	//* 274  605:icmpge          630
			postEvent((Runnable)((List) (arraylist)).get(i));
	//  275  608:aload_0         
	//  276  609:aload           8
	//  277  611:iload_3         
	//  278  612:invokeinterface #294 <Method Object List.get(int)>
	//  279  617:checkcast       #385 <Class Runnable>
	//  280  620:invokevirtual   #388 <Method void postEvent(Runnable)>

	//  281  623:iload_3         
	//  282  624:iconst_1        
	//  283  625:iadd            
	//  284  626:istore_3        
	//* 285  627:goto            597
		sendAllReadyTransactions();
	//  286  630:aload_0         
	//  287  631:invokespecial   #426 <Method void sendAllReadyTransactions()>
		return;
	//  288  634:return          
	}

	private Path rerunTransactions(Path path)
	{
		path = ((Path) (getAncestorTransactionNode(path)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #201 <Method Tree getAncestorTransactionNode(Path)>
	//    3    5:astore_1        
		Path path1 = ((Tree) (path)).getPath();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #207 <Method Path Tree.getPath()>
	//    6   10:astore_2        
		rerunTransactionQueue(buildTransactionQueue(((Tree) (path))), path1);
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #708 <Method List buildTransactionQueue(Tree)>
	//   11   17:aload_2         
	//   12   18:invokespecial   #710 <Method void rerunTransactionQueue(List, Path)>
		return path1;
	//   13   21:aload_2         
	//   14   22:areturn         
	}

	private void restoreWrites(PersistenceManager persistencemanager)
	{
		Object obj = ((Object) (persistencemanager.loadUserWrites()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #716 <Method List PersistenceManager.loadUserWrites()>
	//    2    6:astore          4
		persistencemanager = ((PersistenceManager) (ServerValues.generateServerValues(((com.firebase.client.utilities.Clock) (serverClock)))));
	//    3    8:aload_0         
	//    4    9:getfield        #129 <Field OffsetClock serverClock>
	//    5   12:invokestatic    #646 <Method Map ServerValues.generateServerValues(com.firebase.client.utilities.Clock)>
	//    6   15:astore_1        
		obj = ((Object) (((List) (obj)).iterator()));
	//    7   16:aload           4
	//    8   18:invokeinterface #375 <Method Iterator List.iterator()>
	//    9   23:astore          4
		long l = 0x0L;
	//   10   25:ldc2w           #717 <Long 0x0L>
	//   11   28:lstore_2        
		while(((Iterator) (obj)).hasNext()) 
	//*  12   29:aload           4
	//*  13   31:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//*  14   36:ifeq            355
		{
			final UserWriteRecord write = (UserWriteRecord)((Iterator) (obj)).next();
	//   15   39:aload           4
	//   16   41:invokeinterface #383 <Method Object Iterator.next()>
	//   17   46:checkcast       #720 <Class UserWriteRecord>
	//   18   49:astore          5
			Object obj1 = ((Object) (new com.firebase.client.Firebase.CompletionListener() {

				public void onComplete(FirebaseError firebaseerror, Firebase firebase)
				{
					warnIfWriteFailed("Persisted write", write.getPath(), firebaseerror);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field Repo this$0>
				//    2    4:ldc1            #29  <String "Persisted write">
				//    3    6:aload_0         
				//    4    7:getfield        #21  <Field UserWriteRecord val$write>
				//    5   10:invokevirtual   #35  <Method Path UserWriteRecord.getPath()>
				//    6   13:aload_1         
				//    7   14:invokestatic    #39  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
					ackWriteAndRerunTransactions(write.getWriteId(), write.getPath(), firebaseerror);
				//    8   17:aload_0         
				//    9   18:getfield        #19  <Field Repo this$0>
				//   10   21:aload_0         
				//   11   22:getfield        #21  <Field UserWriteRecord val$write>
				//   12   25:invokevirtual   #43  <Method long UserWriteRecord.getWriteId()>
				//   13   28:aload_0         
				//   14   29:getfield        #21  <Field UserWriteRecord val$write>
				//   15   32:invokevirtual   #35  <Method Path UserWriteRecord.getPath()>
				//   16   35:aload_1         
				//   17   36:invokestatic    #47  <Method void Repo.access$600(Repo, long, Path, FirebaseError)>
				//   18   39:return          
				}

				final Repo this$0;
				final UserWriteRecord val$write;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Repo this$0>
				write = userwriterecord;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field UserWriteRecord val$write>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   19   51:new             #46  <Class Repo$4>
	//   20   54:dup             
	//   21   55:aload_0         
	//   22   56:aload           5
	//   23   58:invokespecial   #723 <Method void Repo$4(Repo, UserWriteRecord)>
	//   24   61:astore          6
			if(l < write.getWriteId())
	//*  25   63:lload_2         
	//*  26   64:aload           5
	//*  27   66:invokevirtual   #726 <Method long UserWriteRecord.getWriteId()>
	//*  28   69:lcmp            
	//*  29   70:ifge            344
			{
				l = write.getWriteId();
	//   30   73:aload           5
	//   31   75:invokevirtual   #726 <Method long UserWriteRecord.getWriteId()>
	//   32   78:lstore_2        
				nextWriteId = write.getWriteId() + 1L;
	//   33   79:aload_0         
	//   34   80:aload           5
	//   35   82:invokevirtual   #726 <Method long UserWriteRecord.getWriteId()>
	//   36   85:lconst_1        
	//   37   86:ladd            
	//   38   87:putfield        #135 <Field long nextWriteId>
				if(write.isOverwrite())
	//*  39   90:aload           5
	//*  40   92:invokevirtual   #729 <Method boolean UserWriteRecord.isOverwrite()>
	//*  41   95:ifeq            223
				{
					if(operationLogger.logsDebug())
	//*  42   98:aload_0         
	//*  43   99:getfield        #158 <Field LogWrapper operationLogger>
	//*  44  102:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*  45  105:ifeq            153
					{
						LogWrapper logwrapper = operationLogger;
	//   46  108:aload_0         
	//   47  109:getfield        #158 <Field LogWrapper operationLogger>
	//   48  112:astore          7
						StringBuilder stringbuilder = new StringBuilder();
	//   49  114:new             #215 <Class StringBuilder>
	//   50  117:dup             
	//   51  118:invokespecial   #216 <Method void StringBuilder()>
	//   52  121:astore          8
						stringbuilder.append("Restoring overwrite with id ");
	//   53  123:aload           8
	//   54  125:ldc2            #731 <String "Restoring overwrite with id ">
	//   55  128:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   56  131:pop             
						stringbuilder.append(write.getWriteId());
	//   57  132:aload           8
	//   58  134:aload           5
	//   59  136:invokevirtual   #726 <Method long UserWriteRecord.getWriteId()>
	//   60  139:invokevirtual   #734 <Method StringBuilder StringBuilder.append(long)>
	//   61  142:pop             
						logwrapper.debug(stringbuilder.toString());
	//   62  143:aload           7
	//   63  145:aload           8
	//   64  147:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   65  150:invokevirtual   #235 <Method void LogWrapper.debug(String)>
					}
					connection.put(write.getPath().toString(), write.getOverwrite().getValue(true), ((String) (null)), ((com.firebase.client.Firebase.CompletionListener) (obj1)));
	//   66  153:aload_0         
	//   67  154:getfield        #180 <Field PersistentConnection connection>
	//   68  157:aload           5
	//   69  159:invokevirtual   #735 <Method Path UserWriteRecord.getPath()>
	//   70  162:invokevirtual   #736 <Method String Path.toString()>
	//   71  165:aload           5
	//   72  167:invokevirtual   #739 <Method Node UserWriteRecord.getOverwrite()>
	//   73  170:iconst_1        
	//   74  171:invokeinterface #744 <Method Object Node.getValue(boolean)>
	//   75  176:aconst_null     
	//   76  177:aload           6
	//   77  179:invokevirtual   #748 <Method void PersistentConnection.put(String, Object, String, com.firebase.client.Firebase$CompletionListener)>
					obj1 = ((Object) (ServerValues.resolveDeferredValueSnapshot(write.getOverwrite(), ((Map) (persistencemanager)))));
	//   78  182:aload           5
	//   79  184:invokevirtual   #739 <Method Node UserWriteRecord.getOverwrite()>
	//   80  187:aload_1         
	//   81  188:invokestatic    #654 <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
	//   82  191:astore          6
					serverSyncTree.applyUserOverwrite(write.getPath(), write.getOverwrite(), ((Node) (obj1)), write.getWriteId(), true, false);
	//   83  193:aload_0         
	//   84  194:getfield        #338 <Field SyncTree serverSyncTree>
	//   85  197:aload           5
	//   86  199:invokevirtual   #735 <Method Path UserWriteRecord.getPath()>
	//   87  202:aload           5
	//   88  204:invokevirtual   #739 <Method Node UserWriteRecord.getOverwrite()>
	//   89  207:aload           6
	//   90  209:aload           5
	//   91  211:invokevirtual   #726 <Method long UserWriteRecord.getWriteId()>
	//   92  214:iconst_1        
	//   93  215:iconst_0        
	//   94  216:invokevirtual   #676 <Method List SyncTree.applyUserOverwrite(Path, Node, Node, long, boolean, boolean)>
	//   95  219:pop             
				} else
	//*  96  220:goto            29
				{
					if(operationLogger.logsDebug())
	//*  97  223:aload_0         
	//*  98  224:getfield        #158 <Field LogWrapper operationLogger>
	//*  99  227:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//* 100  230:ifeq            278
					{
						LogWrapper logwrapper1 = operationLogger;
	//  101  233:aload_0         
	//  102  234:getfield        #158 <Field LogWrapper operationLogger>
	//  103  237:astore          7
						StringBuilder stringbuilder1 = new StringBuilder();
	//  104  239:new             #215 <Class StringBuilder>
	//  105  242:dup             
	//  106  243:invokespecial   #216 <Method void StringBuilder()>
	//  107  246:astore          8
						stringbuilder1.append("Restoring merge with id ");
	//  108  248:aload           8
	//  109  250:ldc2            #750 <String "Restoring merge with id ">
	//  110  253:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//  111  256:pop             
						stringbuilder1.append(write.getWriteId());
	//  112  257:aload           8
	//  113  259:aload           5
	//  114  261:invokevirtual   #726 <Method long UserWriteRecord.getWriteId()>
	//  115  264:invokevirtual   #734 <Method StringBuilder StringBuilder.append(long)>
	//  116  267:pop             
						logwrapper1.debug(stringbuilder1.toString());
	//  117  268:aload           7
	//  118  270:aload           8
	//  119  272:invokevirtual   #231 <Method String StringBuilder.toString()>
	//  120  275:invokevirtual   #235 <Method void LogWrapper.debug(String)>
					}
					connection.merge(write.getPath().toString(), ((Object) (write.getMerge().getValue(true))), ((com.firebase.client.Firebase.CompletionListener) (obj1)));
	//  121  278:aload_0         
	//  122  279:getfield        #180 <Field PersistentConnection connection>
	//  123  282:aload           5
	//  124  284:invokevirtual   #735 <Method Path UserWriteRecord.getPath()>
	//  125  287:invokevirtual   #736 <Method String Path.toString()>
	//  126  290:aload           5
	//  127  292:invokevirtual   #754 <Method CompoundWrite UserWriteRecord.getMerge()>
	//  128  295:iconst_1        
	//  129  296:invokevirtual   #759 <Method Map CompoundWrite.getValue(boolean)>
	//  130  299:aload           6
	//  131  301:invokevirtual   #763 <Method void PersistentConnection.merge(String, Object, com.firebase.client.Firebase$CompletionListener)>
					obj1 = ((Object) (ServerValues.resolveDeferredValueMerge(write.getMerge(), ((Map) (persistencemanager)))));
	//  132  304:aload           5
	//  133  306:invokevirtual   #754 <Method CompoundWrite UserWriteRecord.getMerge()>
	//  134  309:aload_1         
	//  135  310:invokestatic    #767 <Method CompoundWrite ServerValues.resolveDeferredValueMerge(CompoundWrite, Map)>
	//  136  313:astore          6
					serverSyncTree.applyUserMerge(write.getPath(), write.getMerge(), ((CompoundWrite) (obj1)), write.getWriteId(), false);
	//  137  315:aload_0         
	//  138  316:getfield        #338 <Field SyncTree serverSyncTree>
	//  139  319:aload           5
	//  140  321:invokevirtual   #735 <Method Path UserWriteRecord.getPath()>
	//  141  324:aload           5
	//  142  326:invokevirtual   #754 <Method CompoundWrite UserWriteRecord.getMerge()>
	//  143  329:aload           6
	//  144  331:aload           5
	//  145  333:invokevirtual   #726 <Method long UserWriteRecord.getWriteId()>
	//  146  336:iconst_0        
	//  147  337:invokevirtual   #771 <Method List SyncTree.applyUserMerge(Path, CompoundWrite, CompoundWrite, long, boolean)>
	//  148  340:pop             
				}
			} else
	//* 149  341:goto            29
			{
				throw new IllegalStateException("Write ids were not in order.");
	//  150  344:new             #773 <Class IllegalStateException>
	//  151  347:dup             
	//  152  348:ldc2            #775 <String "Write ids were not in order.">
	//  153  351:invokespecial   #777 <Method void IllegalStateException(String)>
	//  154  354:athrow          
			}
		}
	//  155  355:return          
	}

	private void runOnDisconnectEvents()
	{
		Object obj = ((Object) (ServerValues.generateServerValues(((com.firebase.client.utilities.Clock) (serverClock)))));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field OffsetClock serverClock>
	//    2    4:invokestatic    #646 <Method Map ServerValues.generateServerValues(com.firebase.client.utilities.Clock)>
	//    3    7:astore_1        
		obj = ((Object) (ServerValues.resolveDeferredValueTree(onDisconnect, ((Map) (obj)))));
	//    4    8:aload_0         
	//    5    9:getfield        #454 <Field SparseSnapshotTree onDisconnect>
	//    6   12:aload_1         
	//    7   13:invokestatic    #782 <Method SparseSnapshotTree ServerValues.resolveDeferredValueTree(SparseSnapshotTree, Map)>
	//    8   16:astore_1        
		final ArrayList events = new ArrayList();
	//    9   17:new             #264 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #265 <Method void ArrayList()>
	//   12   24:astore_2        
		((SparseSnapshotTree) (obj)).forEachTree(Path.getEmptyPath(), new SparseSnapshotTree.SparseSnapshotTreeVisitor() {

			public void visitTree(Path path, Node node)
			{
				events.addAll(((java.util.Collection) (serverSyncTree.applyServerOverwrite(path, node))));
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field List val$events>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field Repo this$0>
			//    4    8:invokestatic    #30  <Method SyncTree Repo.access$800(Repo)>
			//    5   11:aload_1         
			//    6   12:aload_2         
			//    7   13:invokevirtual   #36  <Method List SyncTree.applyServerOverwrite(Path, Node)>
			//    8   16:invokeinterface #42  <Method boolean List.addAll(java.util.Collection)>
			//    9   21:pop             
				path = abortTransactions(path, -9);
			//   10   22:aload_0         
			//   11   23:getfield        #19  <Field Repo this$0>
			//   12   26:aload_1         
			//   13   27:bipush          -9
			//   14   29:invokestatic    #46  <Method Path Repo.access$900(Repo, Path, int)>
			//   15   32:astore_1        
				rerunTransactions(path);
			//   16   33:aload_0         
			//   17   34:getfield        #19  <Field Repo this$0>
			//   18   37:aload_1         
			//   19   38:invokestatic    #50  <Method Path Repo.access$1000(Repo, Path)>
			//   20   41:pop             
			//   21   42:return          
			}

			final Repo this$0;
			final List val$events;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Repo this$0>
				events = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field List val$events>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   13   25:aload_1         
	//   14   26:invokestatic    #785 <Method Path Path.getEmptyPath()>
	//   15   29:new             #12  <Class Repo$11>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokespecial   #786 <Method void Repo$11(Repo, List)>
	//   20   38:invokevirtual   #790 <Method void SparseSnapshotTree.forEachTree(Path, SparseSnapshotTree$SparseSnapshotTreeVisitor)>
		onDisconnect = new SparseSnapshotTree();
	//   21   41:aload_0         
	//   22   42:new             #493 <Class SparseSnapshotTree>
	//   23   45:dup             
	//   24   46:invokespecial   #494 <Method void SparseSnapshotTree()>
	//   25   49:putfield        #454 <Field SparseSnapshotTree onDisconnect>
		postEvents(((List) (events)));
	//   26   52:aload_0         
	//   27   53:aload_2         
	//   28   54:invokespecial   #371 <Method void postEvents(List)>
	//   29   57:return          
	}

	private void sendAllReadyTransactions()
	{
		Tree tree = transactionQueueTree;
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field Tree transactionQueueTree>
	//    2    4:astore_1        
		pruneCompletedTransactions(tree);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #422 <Method void pruneCompletedTransactions(Tree)>
		sendReadyTransactions(tree);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #410 <Method void sendReadyTransactions(Tree)>
	//    9   15:return          
	}

	private void sendReadyTransactions(Tree tree)
	{
		if((List)tree.getValue() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #260 <Method Object Tree.getValue()>
	//*   2    4:checkcast       #262 <Class List>
	//*   3    7:ifnull          85
		{
			List list = buildTransactionQueue(tree);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #708 <Method List buildTransactionQueue(Tree)>
	//    7   15:astore          4
			Boolean boolean2 = Boolean.valueOf(true);
	//    8   17:iconst_1        
	//    9   18:invokestatic    #523 <Method Boolean Boolean.valueOf(boolean)>
	//   10   21:astore_3        
			Iterator iterator = list.iterator();
	//   11   22:aload           4
	//   12   24:invokeinterface #375 <Method Iterator List.iterator()>
	//   13   29:astore          5
			Boolean boolean1;
			do
			{
				boolean1 = boolean2;
	//   14   31:aload_3         
	//   15   32:astore_2        
				if(!iterator.hasNext())
					break;
	//   16   33:aload           5
	//   17   35:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            67
				if(((TransactionData)iterator.next()).status == TransactionStatus.RUN)
					continue;
	//   19   43:aload           5
	//   20   45:invokeinterface #383 <Method Object Iterator.next()>
	//   21   50:checkcast       #61  <Class Repo$TransactionData>
	//   22   53:invokestatic    #298 <Method Repo$TransactionStatus Repo$TransactionData.access$1500(Repo$TransactionData)>
	//   23   56:getstatic       #602 <Field Repo$TransactionStatus Repo$TransactionStatus.RUN>
	//   24   59:if_acmpeq       31
				boolean1 = Boolean.valueOf(false);
	//   25   62:iconst_0        
	//   26   63:invokestatic    #523 <Method Boolean Boolean.valueOf(boolean)>
	//   27   66:astore_2        
				break;
			} while(true);
			if(boolean1.booleanValue())
	//*  28   67:aload_2         
	//*  29   68:invokevirtual   #793 <Method boolean Boolean.booleanValue()>
	//*  30   71:ifeq            104
			{
				sendTransactionQueue(list, tree.getPath());
	//   31   74:aload_0         
	//   32   75:aload           4
	//   33   77:aload_1         
	//   34   78:invokevirtual   #207 <Method Path Tree.getPath()>
	//   35   81:invokespecial   #796 <Method void sendTransactionQueue(List, Path)>
				return;
	//   36   84:return          
			}
		} else
		if(tree.hasChildren())
	//*  37   85:aload_1         
	//*  38   86:invokevirtual   #799 <Method boolean Tree.hasChildren()>
	//*  39   89:ifeq            104
			tree.forEachChild(new com.firebase.client.core.utilities.Tree.TreeVisitor() {

				public void visitTree(Tree tree1)
				{
					sendReadyTransactions(tree1);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field Repo this$0>
				//    2    4:aload_1         
				//    3    5:invokestatic    #27  <Method void Repo.access$1700(Repo, Tree)>
				//    4    8:return          
				}

				final Repo this$0;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Repo this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   40   92:aload_1         
	//   41   93:new             #18  <Class Repo$14>
	//   42   96:dup             
	//   43   97:aload_0         
	//   44   98:invokespecial   #800 <Method void Repo$14(Repo)>
	//   45  101:invokevirtual   #467 <Method void Tree.forEachChild(com.firebase.client.core.utilities.Tree$TreeVisitor)>
	//   46  104:return          
	}

	private void sendTransactionQueue(final List queue, final Path path)
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #264 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #265 <Method void ArrayList()>
	//    3    7:astore_3        
		for(Iterator iterator = queue.iterator(); iterator.hasNext(); ((List) (obj)).add(((Object) (Long.valueOf(((TransactionData)iterator.next()).currentWriteId)))));
	//    4    8:aload_1         
	//    5    9:invokeinterface #375 <Method Iterator List.iterator()>
	//    6   14:astore          4
	//    7   16:aload           4
	//    8   18:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            52
	//   10   26:aload_3         
	//   11   27:aload           4
	//   12   29:invokeinterface #383 <Method Object Iterator.next()>
	//   13   34:checkcast       #61  <Class Repo$TransactionData>
	//   14   37:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//   15   40:invokestatic    #588 <Method Long Long.valueOf(long)>
	//   16   43:invokeinterface #359 <Method boolean List.add(Object)>
	//   17   48:pop             
	//*  18   49:goto            16
		Object obj1 = ((Object) (getLatestState(path, ((List) (obj)))));
	//   19   52:aload_0         
	//   20   53:aload_2         
	//   21   54:aload_3         
	//   22   55:invokespecial   #553 <Method Node getLatestState(Path, List)>
	//   23   58:astore          4
		obj = "badhash";
	//   24   60:ldc2            #802 <String "badhash">
	//   25   63:astore_3        
		if(!hijackHash)
	//*  26   64:aload_0         
	//*  27   65:getfield        #131 <Field boolean hijackHash>
	//*  28   68:ifne            79
			obj = ((Object) (((Node) (obj1)).getHash()));
	//   29   71:aload           4
	//   30   73:invokeinterface #805 <Method String Node.getHash()>
	//   31   78:astore_3        
		for(Iterator iterator1 = queue.iterator(); iterator1.hasNext();)
	//*  32   79:aload_1         
	//*  33   80:invokeinterface #375 <Method Iterator List.iterator()>
	//*  34   85:astore          5
	//*  35   87:aload           5
	//*  36   89:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//*  37   94:ifeq            150
		{
			TransactionData transactiondata = (TransactionData)iterator1.next();
	//   38   97:aload           5
	//   39   99:invokeinterface #383 <Method Object Iterator.next()>
	//   40  104:checkcast       #61  <Class Repo$TransactionData>
	//   41  107:astore          6
			transactiondata.status = TransactionStatus.SENT;
	//   42  109:aload           6
	//   43  111:getstatic       #305 <Field Repo$TransactionStatus Repo$TransactionStatus.SENT>
	//   44  114:invokestatic    #309 <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
	//   45  117:pop             
			int i = ((com.firebase.client.core) (this)).Repo$4;
	//   46  118:aload           6
	//   47  120:invokestatic    #808 <Method int Repo$TransactionData.access$1808(Repo$TransactionData)>
	//   48  123:pop             
			obj1 = ((Object) (((Node) (obj1)).updateChild(Path.getRelative(path, transactiondata.path), transactiondata.currentOutputSnapshotRaw)));
	//   49  124:aload           4
	//   50  126:aload_2         
	//   51  127:aload           6
	//   52  129:invokestatic    #323 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
	//   53  132:invokestatic    #592 <Method Path Path.getRelative(Path, Path)>
	//   54  135:aload           6
	//   55  137:invokestatic    #811 <Method Node Repo$TransactionData.access$1300(Repo$TransactionData)>
	//   56  140:invokeinterface #815 <Method Node Node.updateChild(Path, Node)>
	//   57  145:astore          4
		}

	//*  58  147:goto            87
		obj1 = ((Node) (obj1)).getValue(true);
	//   59  150:aload           4
	//   60  152:iconst_1        
	//   61  153:invokeinterface #744 <Method Object Node.getValue(boolean)>
	//   62  158:astore          4
		getNextWriteId();
	//   63  160:aload_0         
	//   64  161:invokespecial   #662 <Method long getNextWriteId()>
	//   65  164:pop2            
		connection.put(path.toString(), obj1, ((String) (obj)), new com.firebase.client.Firebase.CompletionListener() {

			public void onComplete(FirebaseError firebaseerror, Firebase firebase)
			{
				warnIfWriteFailed("Transaction", path, firebaseerror);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field Repo this$0>
			//    2    4:ldc1            #38  <String "Transaction">
			//    3    6:aload_0         
			//    4    7:getfield        #26  <Field Path val$path>
			//    5   10:aload_1         
			//    6   11:invokestatic    #42  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
				firebase = ((Firebase) (new ArrayList()));
			//    7   14:new             #44  <Class ArrayList>
			//    8   17:dup             
			//    9   18:invokespecial   #45  <Method void ArrayList()>
			//   10   21:astore_2        
				if(firebaseerror == null)
			//*  11   22:aload_1         
			//*  12   23:ifnonnull       269
				{
					firebaseerror = ((FirebaseError) (new ArrayList()));
			//   13   26:new             #44  <Class ArrayList>
			//   14   29:dup             
			//   15   30:invokespecial   #45  <Method void ArrayList()>
			//   16   33:astore_1        
					final TransactionData txn;
					Object obj2;
					for(Iterator iterator2 = queue.iterator(); iterator2.hasNext(); ((Repo) (obj2)).removeEventCallback(((EventRegistration) (new ValueEventRegistration(((Repo) (obj2)), txn.outstandingListener, QuerySpec.defaultQueryAtPath(txn.path))))))
			//*  17   34:aload_0         
			//*  18   35:getfield        #28  <Field List val$queue>
			//*  19   38:invokeinterface #51  <Method Iterator List.iterator()>
			//*  20   43:astore          4
			//*  21   45:aload           4
			//*  22   47:invokeinterface #57  <Method boolean Iterator.hasNext()>
			//*  23   52:ifeq            195
					{
						txn = (TransactionData)iterator2.next();
			//   24   55:aload           4
			//   25   57:invokeinterface #61  <Method Object Iterator.next()>
			//   26   62:checkcast       #63  <Class Repo$TransactionData>
			//   27   65:astore          5
						txn.status = TransactionStatus.COMPLETED;
			//   28   67:aload           5
			//   29   69:getstatic       #69  <Field Repo$TransactionStatus Repo$TransactionStatus.COMPLETED>
			//   30   72:invokestatic    #73  <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
			//   31   75:pop             
						((List) (firebase)).addAll(((java.util.Collection) (serverSyncTree.ackUserWrite(txn.currentWriteId, false, false, ((com.firebase.client.utilities.Clock) (serverClock))))));
			//   32   76:aload_2         
			//   33   77:aload_0         
			//   34   78:getfield        #24  <Field Repo this$0>
			//   35   81:invokestatic    #77  <Method SyncTree Repo.access$800(Repo)>
			//   36   84:aload           5
			//   37   86:invokestatic    #81  <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
			//   38   89:iconst_0        
			//   39   90:iconst_0        
			//   40   91:aload_0         
			//   41   92:getfield        #24  <Field Repo this$0>
			//   42   95:invokestatic    #85  <Method OffsetClock Repo.access$2000(Repo)>
			//   43   98:invokevirtual   #91  <Method List SyncTree.ackUserWrite(long, boolean, boolean, com.firebase.client.utilities.Clock)>
			//   44  101:invokeinterface #95  <Method boolean List.addAll(java.util.Collection)>
			//   45  106:pop             
						obj2 = ((Object) (txn.currentOutputSnapshotResolved));
			//   46  107:aload           5
			//   47  109:invokestatic    #99  <Method Node Repo$TransactionData.access$1400(Repo$TransactionData)>
			//   48  112:astore          6
						((List) (firebaseerror)).add(((Object) (((_cls1) (new DataSnapshot(new Firebase(repo, txn.path), IndexedNode.from(((Node) (obj2)))))). new Runnable() {

							public void run()
							{
								txn.handler.onComplete(((FirebaseError) (null)), true, snap);
							//    0    0:aload_0         
							//    1    1:getfield        #23  <Field Repo$TransactionData val$txn>
							//    2    4:invokestatic    #36  <Method com.firebase.client.Transaction$Handler Repo$TransactionData.access$2100(Repo$TransactionData)>
							//    3    7:aconst_null     
							//    4    8:iconst_1        
							//    5    9:aload_0         
							//    6   10:getfield        #25  <Field DataSnapshot val$snap>
							//    7   13:invokeinterface #41  <Method void com.firebase.client.Transaction$Handler.onComplete(FirebaseError, boolean, DataSnapshot)>
							//    8   18:return          
							}

							final _cls15 this$1;
							final DataSnapshot val$snap;
							final TransactionData val$txn;

			
			{
				this$1 = final__pcls15;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Repo$15 this$1>
				txn = transactiondata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Repo$TransactionData val$txn>
				snap = DataSnapshot.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field DataSnapshot val$snap>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
						}
)));
			//   49  114:aload_1         
			//   50  115:new             #13  <Class Repo$15$1>
			//   51  118:dup             
			//   52  119:aload_0         
			//   53  120:aload           5
			//   54  122:new             #101 <Class DataSnapshot>
			//   55  125:dup             
			//   56  126:new             #103 <Class Firebase>
			//   57  129:dup             
			//   58  130:aload_0         
			//   59  131:getfield        #30  <Field Repo val$repo>
			//   60  134:aload           5
			//   61  136:invokestatic    #107 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
			//   62  139:invokespecial   #110 <Method void Firebase(Repo, Path)>
			//   63  142:aload           6
			//   64  144:invokestatic    #116 <Method IndexedNode IndexedNode.from(Node)>
			//   65  147:invokespecial   #119 <Method void DataSnapshot(Firebase, IndexedNode)>
			//   66  150:invokespecial   #122 <Method void Repo$15$1(Repo$15, Repo$TransactionData, DataSnapshot)>
			//   67  153:invokeinterface #126 <Method boolean List.add(Object)>
			//   68  158:pop             
						obj2 = ((Object) (Repo.this));
			//   69  159:aload_0         
			//   70  160:getfield        #24  <Field Repo this$0>
			//   71  163:astore          6
					}

			//   72  165:aload           6
			//   73  167:new             #128 <Class ValueEventRegistration>
			//   74  170:dup             
			//   75  171:aload           6
			//   76  173:aload           5
			//   77  175:invokestatic    #132 <Method ValueEventListener Repo$TransactionData.access$2200(Repo$TransactionData)>
			//   78  178:aload           5
			//   79  180:invokestatic    #107 <Method Path Repo$TransactionData.access$1900(Repo$TransactionData)>
			//   80  183:invokestatic    #138 <Method QuerySpec QuerySpec.defaultQueryAtPath(Path)>
			//   81  186:invokespecial   #141 <Method void ValueEventRegistration(Repo, ValueEventListener, QuerySpec)>
			//   82  189:invokevirtual   #145 <Method void Repo.removeEventCallback(EventRegistration)>
			//*  83  192:goto            45
					Repo repo1 = Repo.this;
			//   84  195:aload_0         
			//   85  196:getfield        #24  <Field Repo this$0>
			//   86  199:astore          4
					repo1.pruneCompletedTransactions(repo1.transactionQueueTree.subTree(path));
			//   87  201:aload           4
			//   88  203:aload           4
			//   89  205:invokestatic    #149 <Method Tree Repo.access$2300(Repo)>
			//   90  208:aload_0         
			//   91  209:getfield        #26  <Field Path val$path>
			//   92  212:invokevirtual   #155 <Method Tree Tree.subTree(Path)>
			//   93  215:invokestatic    #159 <Method void Repo.access$2400(Repo, Tree)>
					sendAllReadyTransactions();
			//   94  218:aload_0         
			//   95  219:getfield        #24  <Field Repo this$0>
			//   96  222:invokestatic    #163 <Method void Repo.access$2500(Repo)>
					repo.postEvents(((List) (firebase)));
			//   97  225:aload_0         
			//   98  226:getfield        #30  <Field Repo val$repo>
			//   99  229:aload_2         
			//  100  230:invokestatic    #167 <Method void Repo.access$300(Repo, List)>
					for(int i = 0; i < ((List) (firebaseerror)).size(); i++)
			//* 101  233:iconst_0        
			//* 102  234:istore_3        
			//* 103  235:iload_3         
			//* 104  236:aload_1         
			//* 105  237:invokeinterface #171 <Method int List.size()>
			//* 106  242:icmpge          399
						postEvent((Runnable)((List) (firebaseerror)).get(i));
			//  107  245:aload_0         
			//  108  246:getfield        #24  <Field Repo this$0>
			//  109  249:aload_1         
			//  110  250:iload_3         
			//  111  251:invokeinterface #175 <Method Object List.get(int)>
			//  112  256:checkcast       #177 <Class Runnable>
			//  113  259:invokevirtual   #181 <Method void Repo.postEvent(Runnable)>

			//  114  262:iload_3         
			//  115  263:iconst_1        
			//  116  264:iadd            
			//  117  265:istore_3        
				} else
			//* 118  266:goto            235
				{
					if(firebaseerror.getCode() == -1)
			//* 119  269:aload_1         
			//* 120  270:invokevirtual   #186 <Method int FirebaseError.getCode()>
			//* 121  273:iconst_m1       
			//* 122  274:icmpne          338
						for(firebaseerror = ((FirebaseError) (queue.iterator())); ((Iterator) (firebaseerror)).hasNext();)
			//* 123  277:aload_0         
			//* 124  278:getfield        #28  <Field List val$queue>
			//* 125  281:invokeinterface #51  <Method Iterator List.iterator()>
			//* 126  286:astore_1        
			//* 127  287:aload_1         
			//* 128  288:invokeinterface #57  <Method boolean Iterator.hasNext()>
			//* 129  293:ifeq            387
						{
							firebase = ((Firebase) ((TransactionData)((Iterator) (firebaseerror)).next()));
			//  130  296:aload_1         
			//  131  297:invokeinterface #61  <Method Object Iterator.next()>
			//  132  302:checkcast       #63  <Class Repo$TransactionData>
			//  133  305:astore_2        
							if(((TransactionData) (firebase)).status == TransactionStatus.SENT_NEEDS_ABORT)
			//* 134  306:aload_2         
			//* 135  307:invokestatic    #190 <Method Repo$TransactionStatus Repo$TransactionData.access$1500(Repo$TransactionData)>
			//* 136  310:getstatic       #193 <Field Repo$TransactionStatus Repo$TransactionStatus.SENT_NEEDS_ABORT>
			//* 137  313:if_acmpne       327
								firebase.status = TransactionStatus.NEEDS_ABORT;
			//  138  316:aload_2         
			//  139  317:getstatic       #196 <Field Repo$TransactionStatus Repo$TransactionStatus.NEEDS_ABORT>
			//  140  320:invokestatic    #73  <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
			//  141  323:pop             
							else
			//* 142  324:goto            287
								firebase.status = TransactionStatus.RUN;
			//  143  327:aload_2         
			//  144  328:getstatic       #199 <Field Repo$TransactionStatus Repo$TransactionStatus.RUN>
			//  145  331:invokestatic    #73  <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
			//  146  334:pop             
						}

					else
			//* 147  335:goto            287
						for(firebase = ((Firebase) (queue.iterator())); ((Iterator) (firebase)).hasNext();)
			//* 148  338:aload_0         
			//* 149  339:getfield        #28  <Field List val$queue>
			//* 150  342:invokeinterface #51  <Method Iterator List.iterator()>
			//* 151  347:astore_2        
			//* 152  348:aload_2         
			//* 153  349:invokeinterface #57  <Method boolean Iterator.hasNext()>
			//* 154  354:ifeq            387
						{
							TransactionData transactiondata1 = (TransactionData)((Iterator) (firebase)).next();
			//  155  357:aload_2         
			//  156  358:invokeinterface #61  <Method Object Iterator.next()>
			//  157  363:checkcast       #63  <Class Repo$TransactionData>
			//  158  366:astore          4
							transactiondata1.status = TransactionStatus.NEEDS_ABORT;
			//  159  368:aload           4
			//  160  370:getstatic       #196 <Field Repo$TransactionStatus Repo$TransactionStatus.NEEDS_ABORT>
			//  161  373:invokestatic    #73  <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
			//  162  376:pop             
							transactiondata1.abortReason = firebaseerror;
			//  163  377:aload           4
			//  164  379:aload_1         
			//  165  380:invokestatic    #203 <Method FirebaseError Repo$TransactionData.access$2602(Repo$TransactionData, FirebaseError)>
			//  166  383:pop             
						}

			//* 167  384:goto            348
					rerunTransactions(path);
			//  168  387:aload_0         
			//  169  388:getfield        #24  <Field Repo this$0>
			//  170  391:aload_0         
			//  171  392:getfield        #26  <Field Path val$path>
			//  172  395:invokestatic    #207 <Method Path Repo.access$1000(Repo, Path)>
			//  173  398:pop             
				}
			//  174  399:return          
			}

			final Repo this$0;
			final Path val$path;
			final List val$queue;
			final Repo val$repo;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field Repo this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Path val$path>
				queue = list;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field List val$queue>
				repo = repo2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Repo val$repo>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   66  165:aload_0         
	//   67  166:getfield        #180 <Field PersistentConnection connection>
	//   68  169:aload_2         
	//   69  170:invokevirtual   #736 <Method String Path.toString()>
	//   70  173:aload           4
	//   71  175:aload_3         
	//   72  176:new             #20  <Class Repo$15>
	//   73  179:dup             
	//   74  180:aload_0         
	//   75  181:aload_2         
	//   76  182:aload_1         
	//   77  183:aload_0         
	//   78  184:invokespecial   #818 <Method void Repo$15(Repo, Path, List, Repo)>
	//   79  187:invokevirtual   #748 <Method void PersistentConnection.put(String, Object, String, com.firebase.client.Firebase$CompletionListener)>
	//   80  190:return          
	}

	private void updateInfo(ChildKey childkey, Object obj)
	{
		if(childkey.equals(((Object) (Constants.DOT_INFO_SERVERTIME_OFFSET))))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #823 <Field ChildKey Constants.DOT_INFO_SERVERTIME_OFFSET>
	//*   2    4:invokevirtual   #826 <Method boolean ChildKey.equals(Object)>
	//*   3    7:ifeq            24
			serverClock.setOffset(((Long)obj).longValue());
	//    4   10:aload_0         
	//    5   11:getfield        #129 <Field OffsetClock serverClock>
	//    6   14:aload_2         
	//    7   15:checkcast       #585 <Class Long>
	//    8   18:invokevirtual   #679 <Method long Long.longValue()>
	//    9   21:invokevirtual   #830 <Method void OffsetClock.setOffset(long)>
		childkey = ((ChildKey) (new Path(new ChildKey[] {
			Constants.DOT_INFO, childkey
		})));
	//   10   24:new             #532 <Class Path>
	//   11   27:dup             
	//   12   28:iconst_2        
	//   13   29:anewarray       ChildKey[]
	//   14   32:dup             
	//   15   33:iconst_0        
	//   16   34:getstatic       #833 <Field ChildKey Constants.DOT_INFO>
	//   17   37:aastore         
	//   18   38:dup             
	//   19   39:iconst_1        
	//   20   40:aload_1         
	//   21   41:aastore         
	//   22   42:invokespecial   #544 <Method void Path(ChildKey[])>
	//   23   45:astore_1        
		try
		{
			obj = ((Object) (NodeUtilities.NodeFromJSON(obj)));
	//   24   46:aload_2         
	//   25   47:invokestatic    #839 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//   26   50:astore_2        
			infoData.update(((Path) (childkey)), ((Node) (obj)));
	//   27   51:aload_0         
	//   28   52:getfield        #398 <Field SnapshotHolder infoData>
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:invokevirtual   #843 <Method void SnapshotHolder.update(Path, Node)>
			postEvents(infoSyncTree.applyServerOverwrite(((Path) (childkey)), ((Node) (obj))));
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:getfield        #414 <Field SyncTree infoSyncTree>
	//   35   65:aload_1         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #847 <Method List SyncTree.applyServerOverwrite(Path, Node)>
	//   38   70:invokespecial   #371 <Method void postEvents(List)>
			return;
	//   39   73:return          
		}
		// Misplaced declaration of an exception variable
		catch(ChildKey childkey)
	//*  40   74:astore_1        
		{
			operationLogger.error("Failed to parse info update", ((Throwable) (childkey)));
	//   41   75:aload_0         
	//   42   76:getfield        #158 <Field LogWrapper operationLogger>
	//   43   79:ldc2            #849 <String "Failed to parse info update">
	//   44   82:aload_1         
	//   45   83:invokevirtual   #853 <Method void LogWrapper.error(String, Throwable)>
		}
	//   46   86:return          
	}

	private void warnIfWriteFailed(String s, Path path, FirebaseError firebaseerror)
	{
		if(firebaseerror != null && firebaseerror.getCode() != -1 && firebaseerror.getCode() != -25)
	//*   0    0:aload_3         
	//*   1    1:ifnull          91
	//*   2    4:aload_3         
	//*   3    5:invokevirtual   #462 <Method int FirebaseError.getCode()>
	//*   4    8:iconst_m1       
	//*   5    9:icmpeq          91
	//*   6   12:aload_3         
	//*   7   13:invokevirtual   #462 <Method int FirebaseError.getCode()>
	//*   8   16:bipush          -25
	//*   9   18:icmpeq          91
		{
			LogWrapper logwrapper = operationLogger;
	//   10   21:aload_0         
	//   11   22:getfield        #158 <Field LogWrapper operationLogger>
	//   12   25:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #215 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #216 <Method void StringBuilder()>
	//   16   34:astore          5
			stringbuilder.append(s);
	//   17   36:aload           5
	//   18   38:aload_1         
	//   19   39:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			stringbuilder.append(" at ");
	//   21   43:aload           5
	//   22   45:ldc2            #855 <String " at ">
	//   23   48:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
			stringbuilder.append(path.toString());
	//   25   52:aload           5
	//   26   54:aload_2         
	//   27   55:invokevirtual   #736 <Method String Path.toString()>
	//   28   58:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
			stringbuilder.append(" failed: ");
	//   30   62:aload           5
	//   31   64:ldc2            #857 <String " failed: ">
	//   32   67:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
			stringbuilder.append(firebaseerror.toString());
	//   34   71:aload           5
	//   35   73:aload_3         
	//   36   74:invokevirtual   #858 <Method String FirebaseError.toString()>
	//   37   77:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
			logwrapper.warn(stringbuilder.toString());
	//   39   81:aload           4
	//   40   83:aload           5
	//   41   85:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   42   88:invokevirtual   #861 <Method void LogWrapper.warn(String)>
		}
	//   43   91:return          
	}

	public void addEventCallback(EventRegistration eventregistration)
	{
		ChildKey childkey = eventregistration.getQuerySpec().getPath().getFront();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #869 <Method QuerySpec EventRegistration.getQuerySpec()>
	//    2    4:invokevirtual   #870 <Method Path QuerySpec.getPath()>
	//    3    7:invokevirtual   #541 <Method ChildKey Path.getFront()>
	//    4   10:astore_2        
		if(childkey != null && childkey.equals(((Object) (Constants.DOT_INFO))))
	//*   5   11:aload_2         
	//*   6   12:ifnull          37
	//*   7   15:aload_2         
	//*   8   16:getstatic       #833 <Field ChildKey Constants.DOT_INFO>
	//*   9   19:invokevirtual   #826 <Method boolean ChildKey.equals(Object)>
	//*  10   22:ifeq            37
			eventregistration = ((EventRegistration) (infoSyncTree.addEventRegistration(eventregistration)));
	//   11   25:aload_0         
	//   12   26:getfield        #414 <Field SyncTree infoSyncTree>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #874 <Method List SyncTree.addEventRegistration(EventRegistration)>
	//   15   33:astore_1        
		else
	//*  16   34:goto            46
			eventregistration = ((EventRegistration) (serverSyncTree.addEventRegistration(eventregistration)));
	//   17   37:aload_0         
	//   18   38:getfield        #338 <Field SyncTree serverSyncTree>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #874 <Method List SyncTree.addEventRegistration(EventRegistration)>
	//   21   45:astore_1        
		postEvents(((List) (eventregistration)));
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokespecial   #371 <Method void postEvents(List)>
	//   25   51:return          
	}

	void callOnComplete(final com.firebase.client.Firebase.CompletionListener onComplete, final FirebaseError error, final Path ref)
	{
		if(onComplete != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          64
		{
			ChildKey childkey = ref.getBack();
	//    2    4:aload_3         
	//    3    5:invokevirtual   #880 <Method ChildKey Path.getBack()>
	//    4    8:astore          4
			if(childkey != null && childkey.isPriorityChildName())
	//*   5   10:aload           4
	//*   6   12:ifnull          39
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #883 <Method boolean ChildKey.isPriorityChildName()>
	//*   9   20:ifeq            39
				ref = ((Path) (new Firebase(this, ref.getParent())));
	//   10   23:new             #683 <Class Firebase>
	//   11   26:dup             
	//   12   27:aload_0         
	//   13   28:aload_3         
	//   14   29:invokevirtual   #886 <Method Path Path.getParent()>
	//   15   32:invokespecial   #686 <Method void Firebase(Repo, Path)>
	//   16   35:astore_3        
			else
	//*  17   36:goto            49
				ref = ((Path) (new Firebase(this, ref)));
	//   18   39:new             #683 <Class Firebase>
	//   19   42:dup             
	//   20   43:aload_0         
	//   21   44:aload_3         
	//   22   45:invokespecial   #686 <Method void Firebase(Repo, Path)>
	//   23   48:astore_3        
			postEvent(new Runnable() {

				public void run()
				{
					onComplete.onComplete(error, ref);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				//    2    4:aload_0         
				//    3    5:getfield        #27  <Field FirebaseError val$error>
				//    4    8:aload_0         
				//    5    9:getfield        #29  <Field Firebase val$ref>
				//    6   12:invokeinterface #40  <Method void com.firebase.client.Firebase$CompletionListener.onComplete(FirebaseError, Firebase)>
				//    7   17:return          
				}

				final Repo this$0;
				final FirebaseError val$error;
				final com.firebase.client.Firebase.CompletionListener val$onComplete;
				final Firebase val$ref;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Repo this$0>
				onComplete = completionlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				error = firebaseerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field FirebaseError val$error>
				ref = firebase;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field Firebase val$ref>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   24   49:aload_0         
	//   25   50:new             #48  <Class Repo$5>
	//   26   53:dup             
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:aload_2         
	//   30   57:aload_3         
	//   31   58:invokespecial   #889 <Method void Repo$5(Repo, com.firebase.client.Firebase$CompletionListener, FirebaseError, Firebase)>
	//   32   61:invokevirtual   #388 <Method void postEvent(Runnable)>
		}
	//   33   64:return          
	}

	public AuthenticationManager getAuthenticationManager()
	{
		return authenticationManager;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field AuthenticationManager authenticationManager>
	//    2    4:areturn         
	}

	PersistentConnection getConnection()
	{
		return connection;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field PersistentConnection connection>
	//    2    4:areturn         
	}

	public FirebaseApp getFirebaseApp()
	{
		return app;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field FirebaseApp app>
	//    2    4:areturn         
	}

	SyncTree getInfoSyncTree()
	{
		return infoSyncTree;
	//    0    0:aload_0         
	//    1    1:getfield        #414 <Field SyncTree infoSyncTree>
	//    2    4:areturn         
	}

	SyncTree getServerSyncTree()
	{
		return serverSyncTree;
	//    0    0:aload_0         
	//    1    1:getfield        #338 <Field SyncTree serverSyncTree>
	//    2    4:areturn         
	}

	public long getServerTime()
	{
		return serverClock.millis();
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field OffsetClock serverClock>
	//    2    4:invokevirtual   #902 <Method long OffsetClock.millis()>
	//    3    7:lreturn         
	}

	boolean hasListeners()
	{
		return !infoSyncTree.isEmpty() || !serverSyncTree.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #414 <Field SyncTree infoSyncTree>
	//    2    4:invokevirtual   #904 <Method boolean SyncTree.isEmpty()>
	//    3    7:ifeq            25
	//    4   10:aload_0         
	//    5   11:getfield        #338 <Field SyncTree serverSyncTree>
	//    6   14:invokevirtual   #904 <Method boolean SyncTree.isEmpty()>
	//    7   17:ifne            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	void interrupt()
	{
		connection.interrupt();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field PersistentConnection connection>
	//    2    4:invokevirtual   #907 <Method void PersistentConnection.interrupt()>
	//    3    7:return          
	}

	public void keepSynced(QuerySpec queryspec, boolean flag)
	{
		serverSyncTree.keepSynced(queryspec, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #338 <Field SyncTree serverSyncTree>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #911 <Method void SyncTree.keepSynced(QuerySpec, boolean)>
	//    5    9:return          
	}

	public void onAuthStatus(boolean flag)
	{
		onServerInfoUpdate(Constants.DOT_INFO_AUTHENTICATED, ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getstatic       #517 <Field ChildKey Constants.DOT_INFO_AUTHENTICATED>
	//    2    4:iload_1         
	//    3    5:invokestatic    #523 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokevirtual   #916 <Method void onServerInfoUpdate(ChildKey, Object)>
	//    5   11:return          
	}

	public void onConnect()
	{
		onServerInfoUpdate(Constants.DOT_INFO_CONNECTED, ((Object) (Boolean.valueOf(true))));
	//    0    0:aload_0         
	//    1    1:getstatic       #530 <Field ChildKey Constants.DOT_INFO_CONNECTED>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #523 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokevirtual   #916 <Method void onServerInfoUpdate(ChildKey, Object)>
	//    5   11:return          
	}

	public void onDataUpdate(String s, Object obj, boolean flag, Tag tag)
	{
		if(operationLogger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field LogWrapper operationLogger>
	//*   2    4:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            51
		{
			LogWrapper logwrapper = operationLogger;
	//    4   10:aload_0         
	//    5   11:getfield        #158 <Field LogWrapper operationLogger>
	//    6   14:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #215 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #216 <Method void StringBuilder()>
	//   10   23:astore          6
			stringbuilder.append("onDataUpdate: ");
	//   11   25:aload           6
	//   12   27:ldc2            #921 <String "onDataUpdate: ">
	//   13   30:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
			stringbuilder.append(s);
	//   15   34:aload           6
	//   16   36:aload_1         
	//   17   37:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   41:aload           5
	//   20   43:aload           6
	//   21   45:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   22   48:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		if(dataLogger.logsDebug())
	//*  23   51:aload_0         
	//*  24   52:getfield        #166 <Field LogWrapper dataLogger>
	//*  25   55:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*  26   58:ifeq            118
		{
			LogWrapper logwrapper1 = operationLogger;
	//   27   61:aload_0         
	//   28   62:getfield        #158 <Field LogWrapper operationLogger>
	//   29   65:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   67:new             #215 <Class StringBuilder>
	//   31   70:dup             
	//   32   71:invokespecial   #216 <Method void StringBuilder()>
	//   33   74:astore          6
			stringbuilder1.append("onDataUpdate: ");
	//   34   76:aload           6
	//   35   78:ldc2            #921 <String "onDataUpdate: ">
	//   36   81:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   37   84:pop             
			stringbuilder1.append(s);
	//   38   85:aload           6
	//   39   87:aload_1         
	//   40   88:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   41   91:pop             
			stringbuilder1.append(" ");
	//   42   92:aload           6
	//   43   94:ldc2            #923 <String " ">
	//   44   97:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
			stringbuilder1.append(obj);
	//   46  101:aload           6
	//   47  103:aload_2         
	//   48  104:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   49  107:pop             
			logwrapper1.debug(stringbuilder1.toString());
	//   50  108:aload           5
	//   51  110:aload           6
	//   52  112:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   53  115:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		dataUpdateCount = dataUpdateCount + 1L;
	//   54  118:aload_0         
	//   55  119:aload_0         
	//   56  120:getfield        #133 <Field long dataUpdateCount>
	//   57  123:lconst_1        
	//   58  124:ladd            
	//   59  125:putfield        #133 <Field long dataUpdateCount>
		Path path = new Path(s);
	//   60  128:new             #532 <Class Path>
	//   61  131:dup             
	//   62  132:aload_1         
	//   63  133:invokespecial   #924 <Method void Path(String)>
	//   64  136:astore          5
		if(tag == null)
			break MISSING_BLOCK_LABEL_268;
	//   65  138:aload           4
	//   66  140:ifnull          268
		if(!flag)
			break MISSING_BLOCK_LABEL_247;
	//   67  143:iload_3         
	//   68  144:ifeq            247
		Node node;
		try
		{
			s = ((String) (new HashMap()));
	//   69  147:new             #926 <Class HashMap>
	//   70  150:dup             
	//   71  151:invokespecial   #927 <Method void HashMap()>
	//   72  154:astore_1        
			java.util.Map.Entry entry;
			Node node1;
			for(obj = ((Object) (((Map)obj).entrySet().iterator())); ((Iterator) (obj)).hasNext(); ((Map) (s)).put(((Object) (new Path((String)entry.getKey()))), ((Object) (node1))))
	//*  73  155:aload_2         
	//*  74  156:checkcast       #929 <Class Map>
	//*  75  159:invokeinterface #933 <Method Set Map.entrySet()>
	//*  76  164:invokeinterface #936 <Method Iterator Set.iterator()>
	//*  77  169:astore_2        
	//*  78  170:aload_2         
	//*  79  171:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//*  80  176:ifeq            231
			{
				entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   81  179:aload_2         
	//   82  180:invokeinterface #383 <Method Object Iterator.next()>
	//   83  185:checkcast       #938 <Class java.util.Map$Entry>
	//   84  188:astore          6
				node1 = NodeUtilities.NodeFromJSON(entry.getValue());
	//   85  190:aload           6
	//   86  192:invokeinterface #939 <Method Object java.util.Map$Entry.getValue()>
	//   87  197:invokestatic    #839 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//   88  200:astore          7
			}

	//   89  202:aload_1         
	//   90  203:new             #532 <Class Path>
	//   91  206:dup             
	//   92  207:aload           6
	//   93  209:invokeinterface #942 <Method Object java.util.Map$Entry.getKey()>
	//   94  214:checkcast       #944 <Class String>
	//   95  217:invokespecial   #924 <Method void Path(String)>
	//   96  220:aload           7
	//   97  222:invokeinterface #947 <Method Object Map.put(Object, Object)>
	//   98  227:pop             
		}
	//*  99  228:goto            170
	//* 100  231:aload_0         
	//* 101  232:getfield        #338 <Field SyncTree serverSyncTree>
	//* 102  235:aload           5
	//* 103  237:aload_1         
	//* 104  238:aload           4
	//* 105  240:invokevirtual   #951 <Method List SyncTree.applyTaggedQueryMerge(Path, Map, Tag)>
	//* 106  243:astore_1        
	//* 107  244:goto            386
	//* 108  247:aload_2         
	//* 109  248:invokestatic    #839 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//* 110  251:astore_1        
	//* 111  252:aload_0         
	//* 112  253:getfield        #338 <Field SyncTree serverSyncTree>
	//* 113  256:aload           5
	//* 114  258:aload_1         
	//* 115  259:aload           4
	//* 116  261:invokevirtual   #955 <Method List SyncTree.applyTaggedQueryOverwrite(Path, Node, Tag)>
	//* 117  264:astore_1        
	//* 118  265:goto            386
	//* 119  268:iload_3         
	//* 120  269:ifeq            370
	//* 121  272:new             #926 <Class HashMap>
	//* 122  275:dup             
	//* 123  276:invokespecial   #927 <Method void HashMap()>
	//* 124  279:astore_1        
	//* 125  280:aload_2         
	//* 126  281:checkcast       #929 <Class Map>
	//* 127  284:invokeinterface #933 <Method Set Map.entrySet()>
	//* 128  289:invokeinterface #936 <Method Iterator Set.iterator()>
	//* 129  294:astore_2        
	//* 130  295:aload_2         
	//* 131  296:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//* 132  301:ifeq            356
	//* 133  304:aload_2         
	//* 134  305:invokeinterface #383 <Method Object Iterator.next()>
	//* 135  310:checkcast       #938 <Class java.util.Map$Entry>
	//* 136  313:astore          4
	//* 137  315:aload           4
	//* 138  317:invokeinterface #939 <Method Object java.util.Map$Entry.getValue()>
	//* 139  322:invokestatic    #839 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//* 140  325:astore          6
	//* 141  327:aload_1         
	//* 142  328:new             #532 <Class Path>
	//* 143  331:dup             
	//* 144  332:aload           4
	//* 145  334:invokeinterface #942 <Method Object java.util.Map$Entry.getKey()>
	//* 146  339:checkcast       #944 <Class String>
	//* 147  342:invokespecial   #924 <Method void Path(String)>
	//* 148  345:aload           6
	//* 149  347:invokeinterface #947 <Method Object Map.put(Object, Object)>
	//* 150  352:pop             
	//* 151  353:goto            295
	//* 152  356:aload_0         
	//* 153  357:getfield        #338 <Field SyncTree serverSyncTree>
	//* 154  360:aload           5
	//* 155  362:aload_1         
	//* 156  363:invokevirtual   #959 <Method List SyncTree.applyServerMerge(Path, Map)>
	//* 157  366:astore_1        
	//* 158  367:goto            386
	//* 159  370:aload_2         
	//* 160  371:invokestatic    #839 <Method Node NodeUtilities.NodeFromJSON(Object)>
	//* 161  374:astore_1        
	//* 162  375:aload_0         
	//* 163  376:getfield        #338 <Field SyncTree serverSyncTree>
	//* 164  379:aload           5
	//* 165  381:aload_1         
	//* 166  382:invokevirtual   #847 <Method List SyncTree.applyServerOverwrite(Path, Node)>
	//* 167  385:astore_1        
	//* 168  386:aload_1         
	//* 169  387:invokeinterface #290 <Method int List.size()>
	//* 170  392:ifle            402
	//* 171  395:aload_0         
	//* 172  396:aload           5
	//* 173  398:invokespecial   #404 <Method Path rerunTransactions(Path)>
	//* 174  401:pop             
	//* 175  402:aload_0         
	//* 176  403:aload_1         
	//* 177  404:invokespecial   #371 <Method void postEvents(List)>
	//* 178  407:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 179  408:astore_1        
		{
			operationLogger.error("FIREBASE INTERNAL ERROR", ((Throwable) (s)));
	//  180  409:aload_0         
	//  181  410:getfield        #158 <Field LogWrapper operationLogger>
	//  182  413:ldc2            #961 <String "FIREBASE INTERNAL ERROR">
	//  183  416:aload_1         
	//  184  417:invokevirtual   #853 <Method void LogWrapper.error(String, Throwable)>
			return;
	//  185  420:return          
		}
		s = ((String) (serverSyncTree.applyTaggedQueryMerge(path, ((Map) (s)), tag)));
		break MISSING_BLOCK_LABEL_386;
		s = ((String) (NodeUtilities.NodeFromJSON(obj)));
		s = ((String) (serverSyncTree.applyTaggedQueryOverwrite(path, ((Node) (s)), tag)));
		break MISSING_BLOCK_LABEL_386;
		if(!flag)
			break MISSING_BLOCK_LABEL_370;
		s = ((String) (new HashMap()));
		for(obj = ((Object) (((Map)obj).entrySet().iterator())); ((Iterator) (obj)).hasNext(); ((Map) (s)).put(((Object) (new Path((String)((java.util.Map.Entry) (tag)).getKey()))), ((Object) (node))))
		{
			tag = ((Tag) ((java.util.Map.Entry)((Iterator) (obj)).next()));
			node = NodeUtilities.NodeFromJSON(((java.util.Map.Entry) (tag)).getValue());
		}

		s = ((String) (serverSyncTree.applyServerMerge(path, ((Map) (s)))));
		break MISSING_BLOCK_LABEL_386;
		s = ((String) (NodeUtilities.NodeFromJSON(obj)));
		s = ((String) (serverSyncTree.applyServerOverwrite(path, ((Node) (s)))));
		if(((List) (s)).size() > 0)
			rerunTransactions(path);
		postEvents(((List) (s)));
		return;
	}

	public void onDisconnect()
	{
		onServerInfoUpdate(Constants.DOT_INFO_CONNECTED, ((Object) (Boolean.valueOf(false))));
	//    0    0:aload_0         
	//    1    1:getstatic       #530 <Field ChildKey Constants.DOT_INFO_CONNECTED>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #523 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokevirtual   #916 <Method void onServerInfoUpdate(ChildKey, Object)>
		runOnDisconnectEvents();
	//    5   11:aload_0         
	//    6   12:invokespecial   #963 <Method void runOnDisconnectEvents()>
	//    7   15:return          
	}

	public void onDisconnectCancel(final Path path, final com.firebase.client.Firebase.CompletionListener onComplete)
	{
		connection.onDisconnectCancel(path, new com.firebase.client.Firebase.CompletionListener() {

			public void onComplete(FirebaseError firebaseerror, Firebase firebase)
			{
				if(firebaseerror == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       19
					onDisconnect.forget(path);
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field Repo this$0>
			//    4    8:invokestatic    #35  <Method SparseSnapshotTree Repo.access$700(Repo)>
			//    5   11:aload_0         
			//    6   12:getfield        #23  <Field Path val$path>
			//    7   15:invokevirtual   #41  <Method boolean SparseSnapshotTree.forget(Path)>
			//    8   18:pop             
				callOnComplete(onComplete, firebaseerror, path);
			//    9   19:aload_0         
			//   10   20:getfield        #21  <Field Repo this$0>
			//   11   23:aload_0         
			//   12   24:getfield        #25  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
			//   13   27:aload_1         
			//   14   28:aload_0         
			//   15   29:getfield        #23  <Field Path val$path>
			//   16   32:invokevirtual   #45  <Method void Repo.callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
			//   17   35:return          
			}

			final Repo this$0;
			final com.firebase.client.Firebase.CompletionListener val$onComplete;
			final Path val$path;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Repo this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Path val$path>
				onComplete = completionlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field PersistentConnection connection>
	//    2    4:aload_1         
	//    3    5:new             #10  <Class Repo$10>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #968 <Method void Repo$10(Repo, Path, com.firebase.client.Firebase$CompletionListener)>
	//    9   15:invokevirtual   #970 <Method void PersistentConnection.onDisconnectCancel(Path, com.firebase.client.Firebase$CompletionListener)>
	//   10   18:return          
	}

	public void onDisconnectSetValue(final Path path, final Node newValue, final com.firebase.client.Firebase.CompletionListener onComplete)
	{
		connection.onDisconnectPut(path, newValue.getValue(true), new com.firebase.client.Firebase.CompletionListener() {

			public void onComplete(FirebaseError firebaseerror, Firebase firebase)
			{
				warnIfWriteFailed("onDisconnect().setValue", path, firebaseerror);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field Repo this$0>
			//    2    4:ldc1            #37  <String "onDisconnect().setValue">
			//    3    6:aload_0         
			//    4    7:getfield        #25  <Field Path val$path>
			//    5   10:aload_1         
			//    6   11:invokestatic    #41  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
				if(firebaseerror == null)
			//*   7   14:aload_1         
			//*   8   15:ifnonnull       36
					onDisconnect.remember(path, newValue);
			//    9   18:aload_0         
			//   10   19:getfield        #23  <Field Repo this$0>
			//   11   22:invokestatic    #45  <Method SparseSnapshotTree Repo.access$700(Repo)>
			//   12   25:aload_0         
			//   13   26:getfield        #25  <Field Path val$path>
			//   14   29:aload_0         
			//   15   30:getfield        #27  <Field Node val$newValue>
			//   16   33:invokevirtual   #51  <Method void SparseSnapshotTree.remember(Path, Node)>
				callOnComplete(onComplete, firebaseerror, path);
			//   17   36:aload_0         
			//   18   37:getfield        #23  <Field Repo this$0>
			//   19   40:aload_0         
			//   20   41:getfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
			//   21   44:aload_1         
			//   22   45:aload_0         
			//   23   46:getfield        #25  <Field Path val$path>
			//   24   49:invokevirtual   #55  <Method void Repo.callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
			//   25   52:return          
			}

			final Repo this$0;
			final Node val$newValue;
			final com.firebase.client.Firebase.CompletionListener val$onComplete;
			final Path val$path;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Repo this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Path val$path>
				newValue = node;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Node val$newValue>
				onComplete = completionlistener;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field PersistentConnection connection>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_1        
	//    5    7:invokeinterface #744 <Method Object Node.getValue(boolean)>
	//    6   12:new             #54  <Class Repo$8>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokespecial   #975 <Method void Repo$8(Repo, Path, Node, com.firebase.client.Firebase$CompletionListener)>
	//   13   23:invokevirtual   #979 <Method void PersistentConnection.onDisconnectPut(Path, Object, com.firebase.client.Firebase$CompletionListener)>
	//   14   26:return          
	}

	public void onDisconnectUpdate(final Path path, final Map newChildren, final com.firebase.client.Firebase.CompletionListener listener, Map map)
	{
		connection.onDisconnectMerge(path, map, new com.firebase.client.Firebase.CompletionListener() {

			public void onComplete(FirebaseError firebaseerror, Firebase firebase)
			{
				warnIfWriteFailed("onDisconnect().updateChildren", path, firebaseerror);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field Repo this$0>
			//    2    4:ldc1            #37  <String "onDisconnect().updateChildren">
			//    3    6:aload_0         
			//    4    7:getfield        #25  <Field Path val$path>
			//    5   10:aload_1         
			//    6   11:invokestatic    #41  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
				if(firebaseerror == null)
			//*   7   14:aload_1         
			//*   8   15:ifnonnull       90
				{
					java.util.Map.Entry entry;
					for(firebase = ((Firebase) (newChildren.entrySet().iterator())); ((Iterator) (firebase)).hasNext(); onDisconnect.remember(path.child((Path)entry.getKey()), (Node)entry.getValue()))
			//*   9   18:aload_0         
			//*  10   19:getfield        #27  <Field Map val$newChildren>
			//*  11   22:invokeinterface #47  <Method Set Map.entrySet()>
			//*  12   27:invokeinterface #53  <Method Iterator Set.iterator()>
			//*  13   32:astore_2        
			//*  14   33:aload_2         
			//*  15   34:invokeinterface #59  <Method boolean Iterator.hasNext()>
			//*  16   39:ifeq            90
						entry = (java.util.Map.Entry)((Iterator) (firebase)).next();
			//   17   42:aload_2         
			//   18   43:invokeinterface #63  <Method Object Iterator.next()>
			//   19   48:checkcast       #65  <Class java.util.Map$Entry>
			//   20   51:astore_3        

			//   21   52:aload_0         
			//   22   53:getfield        #23  <Field Repo this$0>
			//   23   56:invokestatic    #69  <Method SparseSnapshotTree Repo.access$700(Repo)>
			//   24   59:aload_0         
			//   25   60:getfield        #25  <Field Path val$path>
			//   26   63:aload_3         
			//   27   64:invokeinterface #72  <Method Object java.util.Map$Entry.getKey()>
			//   28   69:checkcast       #74  <Class Path>
			//   29   72:invokevirtual   #78  <Method Path Path.child(Path)>
			//   30   75:aload_3         
			//   31   76:invokeinterface #81  <Method Object java.util.Map$Entry.getValue()>
			//   32   81:checkcast       #83  <Class Node>
			//   33   84:invokevirtual   #89  <Method void SparseSnapshotTree.remember(Path, Node)>
				}
			//*  34   87:goto            33
				callOnComplete(listener, firebaseerror, path);
			//   35   90:aload_0         
			//   36   91:getfield        #23  <Field Repo this$0>
			//   37   94:aload_0         
			//   38   95:getfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$listener>
			//   39   98:aload_1         
			//   40   99:aload_0         
			//   41  100:getfield        #25  <Field Path val$path>
			//   42  103:invokevirtual   #93  <Method void Repo.callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
			//   43  106:return          
			}

			final Repo this$0;
			final com.firebase.client.Firebase.CompletionListener val$listener;
			final Map val$newChildren;
			final Path val$path;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Repo this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Path val$path>
				newChildren = map;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Map val$newChildren>
				listener = completionlistener;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$listener>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field PersistentConnection connection>
	//    2    4:aload_1         
	//    3    5:aload           4
	//    4    7:new             #56  <Class Repo$9>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:aload_2         
	//    9   14:aload_3         
	//   10   15:invokespecial   #984 <Method void Repo$9(Repo, Path, Map, com.firebase.client.Firebase$CompletionListener)>
	//   11   18:invokevirtual   #988 <Method void PersistentConnection.onDisconnectMerge(Path, Map, com.firebase.client.Firebase$CompletionListener)>
	//   12   21:return          
	}

	public void onRangeMergeUpdate(Path path, List list, Tag tag)
	{
		if(operationLogger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field LogWrapper operationLogger>
	//*   2    4:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            51
		{
			LogWrapper logwrapper = operationLogger;
	//    4   10:aload_0         
	//    5   11:getfield        #158 <Field LogWrapper operationLogger>
	//    6   14:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #215 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #216 <Method void StringBuilder()>
	//   10   23:astore          5
			stringbuilder.append("onRangeMergeUpdate: ");
	//   11   25:aload           5
	//   12   27:ldc2            #993 <String "onRangeMergeUpdate: ">
	//   13   30:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
			stringbuilder.append(((Object) (path)));
	//   15   34:aload           5
	//   16   36:aload_1         
	//   17   37:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   41:aload           4
	//   20   43:aload           5
	//   21   45:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   22   48:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		if(dataLogger.logsDebug())
	//*  23   51:aload_0         
	//*  24   52:getfield        #166 <Field LogWrapper dataLogger>
	//*  25   55:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*  26   58:ifeq            118
		{
			LogWrapper logwrapper1 = operationLogger;
	//   27   61:aload_0         
	//   28   62:getfield        #158 <Field LogWrapper operationLogger>
	//   29   65:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   67:new             #215 <Class StringBuilder>
	//   31   70:dup             
	//   32   71:invokespecial   #216 <Method void StringBuilder()>
	//   33   74:astore          5
			stringbuilder1.append("onRangeMergeUpdate: ");
	//   34   76:aload           5
	//   35   78:ldc2            #993 <String "onRangeMergeUpdate: ">
	//   36   81:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   37   84:pop             
			stringbuilder1.append(((Object) (path)));
	//   38   85:aload           5
	//   39   87:aload_1         
	//   40   88:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   41   91:pop             
			stringbuilder1.append(" ");
	//   42   92:aload           5
	//   43   94:ldc2            #923 <String " ">
	//   44   97:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
			stringbuilder1.append(((Object) (list)));
	//   46  101:aload           5
	//   47  103:aload_2         
	//   48  104:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   49  107:pop             
			logwrapper1.debug(stringbuilder1.toString());
	//   50  108:aload           4
	//   51  110:aload           5
	//   52  112:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   53  115:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		dataUpdateCount = dataUpdateCount + 1L;
	//   54  118:aload_0         
	//   55  119:aload_0         
	//   56  120:getfield        #133 <Field long dataUpdateCount>
	//   57  123:lconst_1        
	//   58  124:ladd            
	//   59  125:putfield        #133 <Field long dataUpdateCount>
		if(tag != null)
	//*  60  128:aload_3         
	//*  61  129:ifnull          146
			list = serverSyncTree.applyTaggedRangeMerges(path, list, tag);
	//   62  132:aload_0         
	//   63  133:getfield        #338 <Field SyncTree serverSyncTree>
	//   64  136:aload_1         
	//   65  137:aload_2         
	//   66  138:aload_3         
	//   67  139:invokevirtual   #997 <Method List SyncTree.applyTaggedRangeMerges(Path, List, Tag)>
	//   68  142:astore_2        
		else
	//*  69  143:goto            156
			list = serverSyncTree.applyServerRangeMerges(path, list);
	//   70  146:aload_0         
	//   71  147:getfield        #338 <Field SyncTree serverSyncTree>
	//   72  150:aload_1         
	//   73  151:aload_2         
	//   74  152:invokevirtual   #1001 <Method List SyncTree.applyServerRangeMerges(Path, List)>
	//   75  155:astore_2        
		if(list.size() > 0)
	//*  76  156:aload_2         
	//*  77  157:invokeinterface #290 <Method int List.size()>
	//*  78  162:ifle            171
			rerunTransactions(path);
	//   79  165:aload_0         
	//   80  166:aload_1         
	//   81  167:invokespecial   #404 <Method Path rerunTransactions(Path)>
	//   82  170:pop             
		postEvents(list);
	//   83  171:aload_0         
	//   84  172:aload_2         
	//   85  173:invokespecial   #371 <Method void postEvents(List)>
	//   86  176:return          
	}

	public void onServerInfoUpdate(ChildKey childkey, Object obj)
	{
		updateInfo(childkey, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #527 <Method void updateInfo(ChildKey, Object)>
	//    4    6:return          
	}

	public void onServerInfoUpdate(Map map)
	{
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); updateInfo((ChildKey)entry.getKey(), entry.getValue()))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #933 <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #936 <Method Iterator Set.iterator()>
	//*   3   11:astore_1        
	//*   4   12:aload_1         
	//*   5   13:invokeinterface #380 <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            53
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #383 <Method Object Iterator.next()>
	//    9   27:checkcast       #938 <Class java.util.Map$Entry>
	//   10   30:astore_2        

	//   11   31:aload_0         
	//   12   32:aload_2         
	//   13   33:invokeinterface #942 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #537 <Class ChildKey>
	//   15   41:aload_2         
	//   16   42:invokeinterface #939 <Method Object java.util.Map$Entry.getValue()>
	//   17   47:invokespecial   #527 <Method void updateInfo(ChildKey, Object)>
	//*  18   50:goto            12
	//   19   53:return          
	}

	public void postEvent(Runnable runnable)
	{
		ctx.requireStarted();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Context ctx>
	//    2    4:invokevirtual   #1007 <Method void Context.requireStarted()>
		ctx.getEventTarget().postEvent(runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field Context ctx>
	//    5   11:invokevirtual   #1011 <Method EventTarget Context.getEventTarget()>
	//    6   14:aload_1         
	//    7   15:invokeinterface #1014 <Method void EventTarget.postEvent(Runnable)>
	//    8   20:return          
	}

	public void purgeOutstandingWrites()
	{
		if(operationLogger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field LogWrapper operationLogger>
	//*   2    4:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            20
			operationLogger.debug("Purging writes");
	//    4   10:aload_0         
	//    5   11:getfield        #158 <Field LogWrapper operationLogger>
	//    6   14:ldc2            #1017 <String "Purging writes">
	//    7   17:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		postEvents(serverSyncTree.removeAllWrites());
	//    8   20:aload_0         
	//    9   21:aload_0         
	//   10   22:getfield        #338 <Field SyncTree serverSyncTree>
	//   11   25:invokevirtual   #1020 <Method List SyncTree.removeAllWrites()>
	//   12   28:invokespecial   #371 <Method void postEvents(List)>
		abortTransactions(Path.getEmptyPath(), -25);
	//   13   31:aload_0         
	//   14   32:invokestatic    #785 <Method Path Path.getEmptyPath()>
	//   15   35:bipush          -25
	//   16   37:invokespecial   #459 <Method Path abortTransactions(Path, int)>
	//   17   40:pop             
		connection.purgeOutstandingWrites();
	//   18   41:aload_0         
	//   19   42:getfield        #180 <Field PersistentConnection connection>
	//   20   45:invokevirtual   #1022 <Method void PersistentConnection.purgeOutstandingWrites()>
	//   21   48:return          
	}

	public void removeEventCallback(EventRegistration eventregistration)
	{
		if(Constants.DOT_INFO.equals(((Object) (eventregistration.getQuerySpec().getPath().getFront()))))
	//*   0    0:getstatic       #833 <Field ChildKey Constants.DOT_INFO>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #869 <Method QuerySpec EventRegistration.getQuerySpec()>
	//*   3    7:invokevirtual   #870 <Method Path QuerySpec.getPath()>
	//*   4   10:invokevirtual   #541 <Method ChildKey Path.getFront()>
	//*   5   13:invokevirtual   #826 <Method boolean ChildKey.equals(Object)>
	//*   6   16:ifeq            31
			eventregistration = ((EventRegistration) (infoSyncTree.removeEventRegistration(eventregistration)));
	//    7   19:aload_0         
	//    8   20:getfield        #414 <Field SyncTree infoSyncTree>
	//    9   23:aload_1         
	//   10   24:invokevirtual   #1025 <Method List SyncTree.removeEventRegistration(EventRegistration)>
	//   11   27:astore_1        
		else
	//*  12   28:goto            40
			eventregistration = ((EventRegistration) (serverSyncTree.removeEventRegistration(eventregistration)));
	//   13   31:aload_0         
	//   14   32:getfield        #338 <Field SyncTree serverSyncTree>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #1025 <Method List SyncTree.removeEventRegistration(EventRegistration)>
	//   17   39:astore_1        
		postEvents(((List) (eventregistration)));
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokespecial   #371 <Method void postEvents(List)>
	//   21   45:return          
	}

	void resume()
	{
		connection.resume();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field PersistentConnection connection>
	//    2    4:invokevirtual   #1028 <Method void PersistentConnection.resume()>
	//    3    7:return          
	}

	public void scheduleNow(Runnable runnable)
	{
		ctx.requireStarted();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Context ctx>
	//    2    4:invokevirtual   #1007 <Method void Context.requireStarted()>
		ctx.getRunLoop().scheduleNow(runnable);
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field Context ctx>
	//    5   11:invokevirtual   #1032 <Method RunLoop Context.getRunLoop()>
	//    6   14:aload_1         
	//    7   15:invokeinterface #1035 <Method void RunLoop.scheduleNow(Runnable)>
	//    8   20:return          
	}

	public void setHijackHash(boolean flag)
	{
		hijackHash = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #131 <Field boolean hijackHash>
	//    3    5:return          
	}

	public void setValue(final Path path, Node node, final com.firebase.client.Firebase.CompletionListener onComplete)
	{
		if(operationLogger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field LogWrapper operationLogger>
	//*   2    4:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            51
		{
			LogWrapper logwrapper = operationLogger;
	//    4   10:aload_0         
	//    5   11:getfield        #158 <Field LogWrapper operationLogger>
	//    6   14:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #215 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #216 <Method void StringBuilder()>
	//   10   23:astore          7
			stringbuilder.append("set: ");
	//   11   25:aload           7
	//   12   27:ldc2            #1038 <String "set: ">
	//   13   30:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
			stringbuilder.append(((Object) (path)));
	//   15   34:aload           7
	//   16   36:aload_1         
	//   17   37:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   41:aload           6
	//   20   43:aload           7
	//   21   45:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   22   48:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		if(dataLogger.logsDebug())
	//*  23   51:aload_0         
	//*  24   52:getfield        #166 <Field LogWrapper dataLogger>
	//*  25   55:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*  26   58:ifeq            118
		{
			LogWrapper logwrapper1 = dataLogger;
	//   27   61:aload_0         
	//   28   62:getfield        #166 <Field LogWrapper dataLogger>
	//   29   65:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   67:new             #215 <Class StringBuilder>
	//   31   70:dup             
	//   32   71:invokespecial   #216 <Method void StringBuilder()>
	//   33   74:astore          7
			stringbuilder1.append("set: ");
	//   34   76:aload           7
	//   35   78:ldc2            #1038 <String "set: ">
	//   36   81:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   37   84:pop             
			stringbuilder1.append(((Object) (path)));
	//   38   85:aload           7
	//   39   87:aload_1         
	//   40   88:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   41   91:pop             
			stringbuilder1.append(" ");
	//   42   92:aload           7
	//   43   94:ldc2            #923 <String " ">
	//   44   97:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
			stringbuilder1.append(((Object) (node)));
	//   46  101:aload           7
	//   47  103:aload_2         
	//   48  104:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   49  107:pop             
			logwrapper1.debug(stringbuilder1.toString());
	//   50  108:aload           6
	//   51  110:aload           7
	//   52  112:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   53  115:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		Node node1 = ServerValues.resolveDeferredValueSnapshot(node, ServerValues.generateServerValues(((com.firebase.client.utilities.Clock) (serverClock))));
	//   54  118:aload_2         
	//   55  119:aload_0         
	//   56  120:getfield        #129 <Field OffsetClock serverClock>
	//   57  123:invokestatic    #646 <Method Map ServerValues.generateServerValues(com.firebase.client.utilities.Clock)>
	//   58  126:invokestatic    #654 <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
	//   59  129:astore          6
		final long writeId = getNextWriteId();
	//   60  131:aload_0         
	//   61  132:invokespecial   #662 <Method long getNextWriteId()>
	//   62  135:lstore          4
		postEvents(serverSyncTree.applyUserOverwrite(path, node, node1, writeId, true, true));
	//   63  137:aload_0         
	//   64  138:aload_0         
	//   65  139:getfield        #338 <Field SyncTree serverSyncTree>
	//   66  142:aload_1         
	//   67  143:aload_2         
	//   68  144:aload           6
	//   69  146:lload           4
	//   70  148:iconst_1        
	//   71  149:iconst_1        
	//   72  150:invokevirtual   #676 <Method List SyncTree.applyUserOverwrite(Path, Node, Node, long, boolean, boolean)>
	//   73  153:invokespecial   #371 <Method void postEvents(List)>
		connection.put(path.toString(), node.getValue(true), new com.firebase.client.Firebase.CompletionListener() {

			public void onComplete(FirebaseError firebaseerror, Firebase firebase)
			{
				warnIfWriteFailed("setValue", path, firebaseerror);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field Repo this$0>
			//    2    4:ldc1            #36  <String "setValue">
			//    3    6:aload_0         
			//    4    7:getfield        #25  <Field Path val$path>
			//    5   10:aload_1         
			//    6   11:invokestatic    #40  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
				ackWriteAndRerunTransactions(writeId, path, firebaseerror);
			//    7   14:aload_0         
			//    8   15:getfield        #23  <Field Repo this$0>
			//    9   18:aload_0         
			//   10   19:getfield        #27  <Field long val$writeId>
			//   11   22:aload_0         
			//   12   23:getfield        #25  <Field Path val$path>
			//   13   26:aload_1         
			//   14   27:invokestatic    #44  <Method void Repo.access$600(Repo, long, Path, FirebaseError)>
				callOnComplete(onComplete, firebaseerror, path);
			//   15   30:aload_0         
			//   16   31:getfield        #23  <Field Repo this$0>
			//   17   34:aload_0         
			//   18   35:getfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
			//   19   38:aload_1         
			//   20   39:aload_0         
			//   21   40:getfield        #25  <Field Path val$path>
			//   22   43:invokevirtual   #48  <Method void Repo.callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
			//   23   46:return          
			}

			final Repo this$0;
			final com.firebase.client.Firebase.CompletionListener val$onComplete;
			final Path val$path;
			final long val$writeId;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Repo this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Path val$path>
				writeId = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #27  <Field long val$writeId>
				onComplete = completionlistener;
			//    9   15:aload_0         
			//   10   16:aload           5
			//   11   18:putfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   74  156:aload_0         
	//   75  157:getfield        #180 <Field PersistentConnection connection>
	//   76  160:aload_1         
	//   77  161:invokevirtual   #736 <Method String Path.toString()>
	//   78  164:aload_2         
	//   79  165:iconst_1        
	//   80  166:invokeinterface #744 <Method Object Node.getValue(boolean)>
	//   81  171:new             #50  <Class Repo$6>
	//   82  174:dup             
	//   83  175:aload_0         
	//   84  176:aload_1         
	//   85  177:lload           4
	//   86  179:aload_3         
	//   87  180:invokespecial   #1041 <Method void Repo$6(Repo, Path, long, com.firebase.client.Firebase$CompletionListener)>
	//   88  183:invokevirtual   #1043 <Method void PersistentConnection.put(String, Object, com.firebase.client.Firebase$CompletionListener)>
		rerunTransactions(abortTransactions(path, -9));
	//   89  186:aload_0         
	//   90  187:aload_0         
	//   91  188:aload_1         
	//   92  189:bipush          -9
	//   93  191:invokespecial   #459 <Method Path abortTransactions(Path, int)>
	//   94  194:invokespecial   #404 <Method Path rerunTransactions(Path)>
	//   95  197:pop             
	//   96  198:return          
	}

	public void startTransaction(Path path, final com.firebase.client.Transaction.Handler handler, boolean flag)
	{
		Object obj;
		TransactionData transactiondata;
		Firebase firebase;
		if(operationLogger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field LogWrapper operationLogger>
	//*   2    4:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            51
		{
			LogWrapper logwrapper = operationLogger;
	//    4   10:aload_0         
	//    5   11:getfield        #158 <Field LogWrapper operationLogger>
	//    6   14:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #215 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #216 <Method void StringBuilder()>
	//   10   23:astore          5
			stringbuilder.append("transaction: ");
	//   11   25:aload           5
	//   12   27:ldc2            #1047 <String "transaction: ">
	//   13   30:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
			stringbuilder.append(((Object) (path)));
	//   15   34:aload           5
	//   16   36:aload_1         
	//   17   37:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   41:aload           4
	//   20   43:aload           5
	//   21   45:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   22   48:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		if(dataLogger.logsDebug())
	//*  23   51:aload_0         
	//*  24   52:getfield        #166 <Field LogWrapper dataLogger>
	//*  25   55:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*  26   58:ifeq            102
		{
			LogWrapper logwrapper1 = operationLogger;
	//   27   61:aload_0         
	//   28   62:getfield        #158 <Field LogWrapper operationLogger>
	//   29   65:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   67:new             #215 <Class StringBuilder>
	//   31   70:dup             
	//   32   71:invokespecial   #216 <Method void StringBuilder()>
	//   33   74:astore          5
			stringbuilder1.append("transaction: ");
	//   34   76:aload           5
	//   35   78:ldc2            #1047 <String "transaction: ">
	//   36   81:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   37   84:pop             
			stringbuilder1.append(((Object) (path)));
	//   38   85:aload           5
	//   39   87:aload_1         
	//   40   88:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   41   91:pop             
			logwrapper1.debug(stringbuilder1.toString());
	//   42   92:aload           4
	//   43   94:aload           5
	//   44   96:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   45   99:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		if(ctx.isPersistenceEnabled() && !loggedTransactionPersistenceWarning)
	//*  46  102:aload_0         
	//*  47  103:getfield        #143 <Field Context ctx>
	//*  48  106:invokevirtual   #1050 <Method boolean Context.isPersistenceEnabled()>
	//*  49  109:ifeq            134
	//*  50  112:aload_0         
	//*  51  113:getfield        #137 <Field boolean loggedTransactionPersistenceWarning>
	//*  52  116:ifne            134
		{
			loggedTransactionPersistenceWarning = true;
	//   53  119:aload_0         
	//   54  120:iconst_1        
	//   55  121:putfield        #137 <Field boolean loggedTransactionPersistenceWarning>
			transactionLogger.info("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across app restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
	//   56  124:aload_0         
	//   57  125:getfield        #162 <Field LogWrapper transactionLogger>
	//   58  128:ldc2            #1052 <String "runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across app restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.">
	//   59  131:invokevirtual   #1055 <Method void LogWrapper.info(String)>
		}
		firebase = new Firebase(this, path);
	//   60  134:new             #683 <Class Firebase>
	//   61  137:dup             
	//   62  138:aload_0         
	//   63  139:aload_1         
	//   64  140:invokespecial   #686 <Method void Firebase(Repo, Path)>
	//   65  143:astore          8
		obj = ((Object) (new ValueEventListener() {

			public void onCancelled(FirebaseError firebaseerror)
			{
			//    0    0:return          
			}

			public void onDataChange(DataSnapshot datasnapshot)
			{
			//    0    0:return          
			}

			final Repo this$0;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Repo this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//   66  145:new             #14  <Class Repo$12>
	//   67  148:dup             
	//   68  149:aload_0         
	//   69  150:invokespecial   #1056 <Method void Repo$12(Repo)>
	//   70  153:astore          4
		addEventCallback(((EventRegistration) (new ValueEventRegistration(this, ((ValueEventListener) (obj)), firebase.getSpec()))));
	//   71  155:aload_0         
	//   72  156:new             #315 <Class ValueEventRegistration>
	//   73  159:dup             
	//   74  160:aload_0         
	//   75  161:aload           4
	//   76  163:aload           8
	//   77  165:invokevirtual   #1059 <Method QuerySpec Firebase.getSpec()>
	//   78  168:invokespecial   #332 <Method void ValueEventRegistration(Repo, ValueEventListener, QuerySpec)>
	//   79  171:invokevirtual   #1061 <Method void addEventCallback(EventRegistration)>
		transactiondata = new TransactionData(path, handler, ((ValueEventListener) (obj)), TransactionStatus.INITIALIZING, flag, nextTransactionOrder());
	//   80  174:new             #61  <Class Repo$TransactionData>
	//   81  177:dup             
	//   82  178:aload_1         
	//   83  179:aload_2         
	//   84  180:aload           4
	//   85  182:getstatic       #1064 <Field Repo$TransactionStatus Repo$TransactionStatus.INITIALIZING>
	//   86  185:iload_3         
	//   87  186:aload_0         
	//   88  187:invokespecial   #1066 <Method long nextTransactionOrder()>
	//   89  190:aconst_null     
	//   90  191:invokespecial   #1069 <Method void Repo$TransactionData(Path, com.firebase.client.Transaction$Handler, ValueEventListener, Repo$TransactionStatus, boolean, long, Repo$1)>
	//   91  194:astore          7
		obj = ((Object) (getLatestState(path)));
	//   92  196:aload_0         
	//   93  197:aload_1         
	//   94  198:invokespecial   #1071 <Method Node getLatestState(Path)>
	//   95  201:astore          4
		transactiondata.currentInputSnapshot = ((Node) (obj));
	//   96  203:aload           7
	//   97  205:aload           4
	//   98  207:invokestatic    #610 <Method Node Repo$TransactionData.access$1202(Repo$TransactionData, Node)>
	//   99  210:pop             
		obj = ((Object) (new MutableData(((Node) (obj)))));
	//  100  211:new             #612 <Class MutableData>
	//  101  214:dup             
	//  102  215:aload           4
	//  103  217:invokespecial   #615 <Method void MutableData(Node)>
	//  104  220:astore          4
		obj = ((Object) (handler.doTransaction(((MutableData) (obj)))));
	//  105  222:aload_2         
	//  106  223:aload           4
	//  107  225:invokeinterface #625 <Method com.firebase.client.Transaction$Result com.firebase.client.Transaction$Handler.doTransaction(MutableData)>
	//  108  230:astore          4
		final Object innerClassError;
		if(obj != null)
	//* 109  232:aload           4
	//* 110  234:ifnull          243
		{
			innerClassError = null;
	//  111  237:aconst_null     
	//  112  238:astore          6
		} else
	//* 113  240:goto            276
		{
			try
			{
				throw new NullPointerException("Transaction returned null as result");
	//  114  243:new             #1073 <Class NullPointerException>
	//  115  246:dup             
	//  116  247:ldc2            #1075 <String "Transaction returned null as result">
	//  117  250:invokespecial   #1076 <Method void NullPointerException(String)>
	//  118  253:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 119  254:astore          4
			{
				obj = ((Object) (FirebaseError.fromException(((Throwable) (obj)))));
	//  120  256:aload           4
	//  121  258:invokestatic    #629 <Method FirebaseError FirebaseError.fromException(Throwable)>
	//  122  261:astore          4
			}
			com.firebase.client.Transaction.Result result = Transaction.abort();
	//  123  263:invokestatic    #635 <Method com.firebase.client.Transaction$Result Transaction.abort()>
	//  124  266:astore          5
			innerClassError = obj;
	//  125  268:aload           4
	//  126  270:astore          6
			obj = ((Object) (result));
	//  127  272:aload           5
	//  128  274:astore          4
		}
		if(!((com.firebase.client.Transaction.Result) (obj)).isSuccess())
	//* 129  276:aload           4
	//* 130  278:invokevirtual   #640 <Method boolean com.firebase.client.Transaction$Result.isSuccess()>
	//* 131  281:ifne            331
		{
			transactiondata.currentOutputSnapshotRaw = null;
	//  132  284:aload           7
	//  133  286:aconst_null     
	//  134  287:invokestatic    #657 <Method Node Repo$TransactionData.access$1302(Repo$TransactionData, Node)>
	//  135  290:pop             
			transactiondata.currentOutputSnapshotResolved = null;
	//  136  291:aload           7
	//  137  293:aconst_null     
	//  138  294:invokestatic    #660 <Method Node Repo$TransactionData.access$1402(Repo$TransactionData, Node)>
	//  139  297:pop             
			postEvent(new Runnable() {

				public void run()
				{
					handler.onComplete(innerClassError, false, snap);
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field com.firebase.client.Transaction$Handler val$handler>
				//    2    4:aload_0         
				//    3    5:getfield        #27  <Field FirebaseError val$innerClassError>
				//    4    8:iconst_0        
				//    5    9:aload_0         
				//    6   10:getfield        #29  <Field DataSnapshot val$snap>
				//    7   13:invokeinterface #40  <Method void com.firebase.client.Transaction$Handler.onComplete(FirebaseError, boolean, DataSnapshot)>
				//    8   18:return          
				}

				final Repo this$0;
				final com.firebase.client.Transaction.Handler val$handler;
				final FirebaseError val$innerClassError;
				final DataSnapshot val$snap;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Repo this$0>
				handler = handler1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field com.firebase.client.Transaction$Handler val$handler>
				innerClassError = firebaseerror;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field FirebaseError val$innerClassError>
				snap = datasnapshot;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field DataSnapshot val$snap>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//  140  298:aload_0         
	//  141  299:new             #16  <Class Repo$13>
	//  142  302:dup             
	//  143  303:aload_0         
	//  144  304:aload_2         
	//  145  305:aload           6
	//  146  307:new             #681 <Class DataSnapshot>
	//  147  310:dup             
	//  148  311:aload           8
	//  149  313:aload           7
	//  150  315:invokestatic    #690 <Method Node Repo$TransactionData.access$1200(Repo$TransactionData)>
	//  151  318:invokestatic    #696 <Method IndexedNode IndexedNode.from(Node)>
	//  152  321:invokespecial   #699 <Method void DataSnapshot(Firebase, IndexedNode)>
	//  153  324:invokespecial   #1079 <Method void Repo$13(Repo, com.firebase.client.Transaction$Handler, FirebaseError, DataSnapshot)>
	//  154  327:invokevirtual   #388 <Method void postEvent(Runnable)>
			return;
	//  155  330:return          
		}
		transactiondata.status = TransactionStatus.RUN;
	//  156  331:aload           7
	//  157  333:getstatic       #602 <Field Repo$TransactionStatus Repo$TransactionStatus.RUN>
	//  158  336:invokestatic    #309 <Method Repo$TransactionStatus Repo$TransactionData.access$1502(Repo$TransactionData, Repo$TransactionStatus)>
	//  159  339:pop             
		innerClassError = ((Object) (transactionQueueTree.subTree(path)));
	//  160  340:aload_0         
	//  161  341:getfield        #237 <Field Tree transactionQueueTree>
	//  162  344:aload_1         
	//  163  345:invokevirtual   #240 <Method Tree Tree.subTree(Path)>
	//  164  348:astore          6
		List list = (List)((Tree) (innerClassError)).getValue();
	//  165  350:aload           6
	//  166  352:invokevirtual   #260 <Method Object Tree.getValue()>
	//  167  355:checkcast       #262 <Class List>
	//  168  358:astore          5
		handler = ((com.firebase.client.Transaction.Handler) (list));
	//  169  360:aload           5
	//  170  362:astore_2        
		if(list == null)
	//* 171  363:aload           5
	//* 172  365:ifnonnull       376
			handler = ((com.firebase.client.Transaction.Handler) (new ArrayList()));
	//  173  368:new             #264 <Class ArrayList>
	//  174  371:dup             
	//  175  372:invokespecial   #265 <Method void ArrayList()>
	//  176  375:astore_2        
		((List) (handler)).add(((Object) (transactiondata)));
	//  177  376:aload_2         
	//  178  377:aload           7
	//  179  379:invokeinterface #359 <Method boolean List.add(Object)>
	//  180  384:pop             
		((Tree) (innerClassError)).setValue(((Object) (handler)));
	//  181  385:aload           6
	//  182  387:aload_2         
	//  183  388:invokevirtual   #363 <Method void Tree.setValue(Object)>
		handler = ((com.firebase.client.Transaction.Handler) (ServerValues.generateServerValues(((com.firebase.client.utilities.Clock) (serverClock)))));
	//  184  391:aload_0         
	//  185  392:getfield        #129 <Field OffsetClock serverClock>
	//  186  395:invokestatic    #646 <Method Map ServerValues.generateServerValues(com.firebase.client.utilities.Clock)>
	//  187  398:astore_2        
		obj = ((Object) (((com.firebase.client.Transaction.Result) (obj)).getNode()));
	//  188  399:aload           4
	//  189  401:invokevirtual   #650 <Method Node com.firebase.client.Transaction$Result.getNode()>
	//  190  404:astore          4
		handler = ((com.firebase.client.Transaction.Handler) (ServerValues.resolveDeferredValueSnapshot(((Node) (obj)), ((Map) (handler)))));
	//  191  406:aload           4
	//  192  408:aload_2         
	//  193  409:invokestatic    #654 <Method Node ServerValues.resolveDeferredValueSnapshot(Node, Map)>
	//  194  412:astore_2        
		transactiondata.currentOutputSnapshotRaw = ((Node) (obj));
	//  195  413:aload           7
	//  196  415:aload           4
	//  197  417:invokestatic    #657 <Method Node Repo$TransactionData.access$1302(Repo$TransactionData, Node)>
	//  198  420:pop             
		transactiondata.currentOutputSnapshotResolved = ((Node) (handler));
	//  199  421:aload           7
	//  200  423:aload_2         
	//  201  424:invokestatic    #660 <Method Node Repo$TransactionData.access$1402(Repo$TransactionData, Node)>
	//  202  427:pop             
		transactiondata.currentWriteId = getNextWriteId();
	//  203  428:aload           7
	//  204  430:aload_0         
	//  205  431:invokespecial   #662 <Method long getNextWriteId()>
	//  206  434:invokestatic    #666 <Method long Repo$TransactionData.access$1602(Repo$TransactionData, long)>
	//  207  437:pop2            
		postEvents(serverSyncTree.applyUserOverwrite(path, ((Node) (obj)), ((Node) (handler)), transactiondata.currentWriteId, flag, false));
	//  208  438:aload_0         
	//  209  439:aload_0         
	//  210  440:getfield        #338 <Field SyncTree serverSyncTree>
	//  211  443:aload_1         
	//  212  444:aload           4
	//  213  446:aload_2         
	//  214  447:aload           7
	//  215  449:invokestatic    #342 <Method long Repo$TransactionData.access$1600(Repo$TransactionData)>
	//  216  452:iload_3         
	//  217  453:iconst_0        
	//  218  454:invokevirtual   #676 <Method List SyncTree.applyUserOverwrite(Path, Node, Node, long, boolean, boolean)>
	//  219  457:invokespecial   #371 <Method void postEvents(List)>
		sendAllReadyTransactions();
	//  220  460:aload_0         
	//  221  461:invokespecial   #426 <Method void sendAllReadyTransactions()>
		return;
	//  222  464:return          
	}

	public String toString()
	{
		return repoInfo.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field RepoInfo repoInfo>
	//    2    4:invokevirtual   #1080 <Method String RepoInfo.toString()>
	//    3    7:areturn         
	}

	public void updateChildren(final Path path, CompoundWrite compoundwrite, final com.firebase.client.Firebase.CompletionListener onComplete, Map map)
	{
		if(operationLogger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field LogWrapper operationLogger>
	//*   2    4:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            51
		{
			LogWrapper logwrapper = operationLogger;
	//    4   10:aload_0         
	//    5   11:getfield        #158 <Field LogWrapper operationLogger>
	//    6   14:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//    7   16:new             #215 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #216 <Method void StringBuilder()>
	//   10   23:astore          8
			stringbuilder.append("update: ");
	//   11   25:aload           8
	//   12   27:ldc2            #1084 <String "update: ">
	//   13   30:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
			stringbuilder.append(((Object) (path)));
	//   15   34:aload           8
	//   16   36:aload_1         
	//   17   37:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:pop             
			logwrapper.debug(stringbuilder.toString());
	//   19   41:aload           7
	//   20   43:aload           8
	//   21   45:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   22   48:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		if(dataLogger.logsDebug())
	//*  23   51:aload_0         
	//*  24   52:getfield        #166 <Field LogWrapper dataLogger>
	//*  25   55:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*  26   58:ifeq            119
		{
			LogWrapper logwrapper1 = dataLogger;
	//   27   61:aload_0         
	//   28   62:getfield        #166 <Field LogWrapper dataLogger>
	//   29   65:astore          7
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   67:new             #215 <Class StringBuilder>
	//   31   70:dup             
	//   32   71:invokespecial   #216 <Method void StringBuilder()>
	//   33   74:astore          8
			stringbuilder1.append("update: ");
	//   34   76:aload           8
	//   35   78:ldc2            #1084 <String "update: ">
	//   36   81:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   37   84:pop             
			stringbuilder1.append(((Object) (path)));
	//   38   85:aload           8
	//   39   87:aload_1         
	//   40   88:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   41   91:pop             
			stringbuilder1.append(" ");
	//   42   92:aload           8
	//   43   94:ldc2            #923 <String " ">
	//   44   97:invokevirtual   #222 <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
			stringbuilder1.append(((Object) (map)));
	//   46  101:aload           8
	//   47  103:aload           4
	//   48  105:invokevirtual   #225 <Method StringBuilder StringBuilder.append(Object)>
	//   49  108:pop             
			logwrapper1.debug(stringbuilder1.toString());
	//   50  109:aload           7
	//   51  111:aload           8
	//   52  113:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   53  116:invokevirtual   #235 <Method void LogWrapper.debug(String)>
		}
		if(compoundwrite.isEmpty())
	//*  54  119:aload_2         
	//*  55  120:invokevirtual   #1085 <Method boolean CompoundWrite.isEmpty()>
	//*  56  123:ifeq            154
		{
			if(operationLogger.logsDebug())
	//*  57  126:aload_0         
	//*  58  127:getfield        #158 <Field LogWrapper operationLogger>
	//*  59  130:invokevirtual   #213 <Method boolean LogWrapper.logsDebug()>
	//*  60  133:ifeq            146
				operationLogger.debug("update called with no changes. No-op");
	//   61  136:aload_0         
	//   62  137:getfield        #158 <Field LogWrapper operationLogger>
	//   63  140:ldc2            #1087 <String "update called with no changes. No-op">
	//   64  143:invokevirtual   #235 <Method void LogWrapper.debug(String)>
			callOnComplete(onComplete, ((FirebaseError) (null)), path);
	//   65  146:aload_0         
	//   66  147:aload_3         
	//   67  148:aconst_null     
	//   68  149:aload_1         
	//   69  150:invokevirtual   #1089 <Method void callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
			return;
	//   70  153:return          
		} else
		{
			CompoundWrite compoundwrite1 = ServerValues.resolveDeferredValueMerge(compoundwrite, ServerValues.generateServerValues(((com.firebase.client.utilities.Clock) (serverClock))));
	//   71  154:aload_2         
	//   72  155:aload_0         
	//   73  156:getfield        #129 <Field OffsetClock serverClock>
	//   74  159:invokestatic    #646 <Method Map ServerValues.generateServerValues(com.firebase.client.utilities.Clock)>
	//   75  162:invokestatic    #767 <Method CompoundWrite ServerValues.resolveDeferredValueMerge(CompoundWrite, Map)>
	//   76  165:astore          7
			final long writeId = getNextWriteId();
	//   77  167:aload_0         
	//   78  168:invokespecial   #662 <Method long getNextWriteId()>
	//   79  171:lstore          5
			postEvents(serverSyncTree.applyUserMerge(path, compoundwrite, compoundwrite1, writeId, true));
	//   80  173:aload_0         
	//   81  174:aload_0         
	//   82  175:getfield        #338 <Field SyncTree serverSyncTree>
	//   83  178:aload_1         
	//   84  179:aload_2         
	//   85  180:aload           7
	//   86  182:lload           5
	//   87  184:iconst_1        
	//   88  185:invokevirtual   #771 <Method List SyncTree.applyUserMerge(Path, CompoundWrite, CompoundWrite, long, boolean)>
	//   89  188:invokespecial   #371 <Method void postEvents(List)>
			connection.merge(path.toString(), ((Object) (map)), new com.firebase.client.Firebase.CompletionListener() {

				public void onComplete(FirebaseError firebaseerror, Firebase firebase)
				{
					warnIfWriteFailed("updateChildren", path, firebaseerror);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field Repo this$0>
				//    2    4:ldc1            #36  <String "updateChildren">
				//    3    6:aload_0         
				//    4    7:getfield        #25  <Field Path val$path>
				//    5   10:aload_1         
				//    6   11:invokestatic    #40  <Method void Repo.access$500(Repo, String, Path, FirebaseError)>
					ackWriteAndRerunTransactions(writeId, path, firebaseerror);
				//    7   14:aload_0         
				//    8   15:getfield        #23  <Field Repo this$0>
				//    9   18:aload_0         
				//   10   19:getfield        #27  <Field long val$writeId>
				//   11   22:aload_0         
				//   12   23:getfield        #25  <Field Path val$path>
				//   13   26:aload_1         
				//   14   27:invokestatic    #44  <Method void Repo.access$600(Repo, long, Path, FirebaseError)>
					callOnComplete(onComplete, firebaseerror, path);
				//   15   30:aload_0         
				//   16   31:getfield        #23  <Field Repo this$0>
				//   17   34:aload_0         
				//   18   35:getfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				//   19   38:aload_1         
				//   20   39:aload_0         
				//   21   40:getfield        #25  <Field Path val$path>
				//   22   43:invokevirtual   #48  <Method void Repo.callOnComplete(com.firebase.client.Firebase$CompletionListener, FirebaseError, Path)>
				//   23   46:return          
				}

				final Repo this$0;
				final com.firebase.client.Firebase.CompletionListener val$onComplete;
				final Path val$path;
				final long val$writeId;

			
			{
				this$0 = Repo.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field Repo this$0>
				path = path1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Path val$path>
				writeId = l;
			//    6   10:aload_0         
			//    7   11:lload_3         
			//    8   12:putfield        #27  <Field long val$writeId>
				onComplete = completionlistener;
			//    9   15:aload_0         
			//   10   16:aload           5
			//   11   18:putfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$onComplete>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   90  191:aload_0         
	//   91  192:getfield        #180 <Field PersistentConnection connection>
	//   92  195:aload_1         
	//   93  196:invokevirtual   #736 <Method String Path.toString()>
	//   94  199:aload           4
	//   95  201:new             #52  <Class Repo$7>
	//   96  204:dup             
	//   97  205:aload_0         
	//   98  206:aload_1         
	//   99  207:lload           5
	//  100  209:aload_3         
	//  101  210:invokespecial   #1090 <Method void Repo$7(Repo, Path, long, com.firebase.client.Firebase$CompletionListener)>
	//  102  213:invokevirtual   #763 <Method void PersistentConnection.merge(String, Object, com.firebase.client.Firebase$CompletionListener)>
			rerunTransactions(abortTransactions(path, -9));
	//  103  216:aload_0         
	//  104  217:aload_0         
	//  105  218:aload_1         
	//  106  219:bipush          -9
	//  107  221:invokespecial   #459 <Method Path abortTransactions(Path, int)>
	//  108  224:invokespecial   #404 <Method Path rerunTransactions(Path)>
	//  109  227:pop             
			return;
	//  110  228:return          
		}
	}

	static final boolean $assertionsDisabled = false;
	private static final int TRANSACTION_MAX_RETRIES = 25;
	private static final String TRANSACTION_OVERRIDE_BY_SET = "overriddenBySet";
	private static final String TRANSACTION_TOO_MANY_RETRIES = "maxretries";
	private FirebaseApp app;
	private final AuthenticationManager authenticationManager;
	private final PersistentConnection connection;
	private final Context ctx;
	private final LogWrapper dataLogger;
	public long dataUpdateCount;
	private final EventRaiser eventRaiser;
	private boolean hijackHash;
	private SnapshotHolder infoData;
	private SyncTree infoSyncTree;
	private boolean loggedTransactionPersistenceWarning;
	private long nextWriteId;
	private SparseSnapshotTree onDisconnect;
	private final LogWrapper operationLogger;
	private final RepoInfo repoInfo;
	private final OffsetClock serverClock = new OffsetClock(((com.firebase.client.utilities.Clock) (new DefaultClock())), 0L);
	private SyncTree serverSyncTree;
	private final LogWrapper transactionLogger;
	private long transactionOrder;
	private Tree transactionQueueTree;

	static 
	{
	//    0    0:return          
	}


/*
	static void access$000(Repo repo)
	{
		repo.deferredInitialization();
	//    0    0:aload_0         
	//    1    1:invokespecial   #394 <Method void deferredInitialization()>
		return;
	//    2    4:return          
	}

*/


/*
	static SnapshotHolder access$100(Repo repo)
	{
		return repo.infoData;
	//    0    0:aload_0         
	//    1    1:getfield        #398 <Field SnapshotHolder infoData>
	//    2    4:areturn         
	}

*/


/*
	static Path access$1000(Repo repo, Path path)
	{
		return repo.rerunTransactions(path);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #404 <Method Path rerunTransactions(Path)>
	//    3    5:areturn         
	}

*/


/*
	static void access$1700(Repo repo, Tree tree)
	{
		repo.sendReadyTransactions(tree);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #410 <Method void sendReadyTransactions(Tree)>
		return;
	//    3    5:return          
	}

*/


/*
	static SyncTree access$200(Repo repo)
	{
		return repo.infoSyncTree;
	//    0    0:aload_0         
	//    1    1:getfield        #414 <Field SyncTree infoSyncTree>
	//    2    4:areturn         
	}

*/


/*
	static OffsetClock access$2000(Repo repo)
	{
		return repo.serverClock;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field OffsetClock serverClock>
	//    2    4:areturn         
	}

*/


/*
	static Tree access$2300(Repo repo)
	{
		return repo.transactionQueueTree;
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field Tree transactionQueueTree>
	//    2    4:areturn         
	}

*/


/*
	static void access$2400(Repo repo, Tree tree)
	{
		repo.pruneCompletedTransactions(tree);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #422 <Method void pruneCompletedTransactions(Tree)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$2500(Repo repo)
	{
		repo.sendAllReadyTransactions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #426 <Method void sendAllReadyTransactions()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$2800(Repo repo, List list, Tree tree)
	{
		repo.aggregateTransactionQueues(list, tree);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #432 <Method void aggregateTransactionQueues(List, Tree)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$2900(Repo repo, Tree tree, int i)
	{
		repo.abortTransactionsAtNode(tree, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #251 <Method void abortTransactionsAtNode(Tree, int)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$300(Repo repo, List list)
	{
		repo.postEvents(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #371 <Method void postEvents(List)>
		return;
	//    3    5:return          
	}

*/


/*
	static PersistentConnection access$400(Repo repo)
	{
		return repo.connection;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field PersistentConnection connection>
	//    2    4:areturn         
	}

*/


/*
	static void access$500(Repo repo, String s, Path path, FirebaseError firebaseerror)
	{
		repo.warnIfWriteFailed(s, path, firebaseerror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #444 <Method void warnIfWriteFailed(String, Path, FirebaseError)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$600(Repo repo, long l, Path path, FirebaseError firebaseerror)
	{
		repo.ackWriteAndRerunTransactions(l, path, firebaseerror);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokespecial   #450 <Method void ackWriteAndRerunTransactions(long, Path, FirebaseError)>
		return;
	//    5    8:return          
	}

*/


/*
	static SparseSnapshotTree access$700(Repo repo)
	{
		return repo.onDisconnect;
	//    0    0:aload_0         
	//    1    1:getfield        #454 <Field SparseSnapshotTree onDisconnect>
	//    2    4:areturn         
	}

*/


/*
	static SyncTree access$800(Repo repo)
	{
		return repo.serverSyncTree;
	//    0    0:aload_0         
	//    1    1:getfield        #338 <Field SyncTree serverSyncTree>
	//    2    4:areturn         
	}

*/


/*
	static Path access$900(Repo repo, Path path, int i)
	{
		return repo.abortTransactions(path, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #459 <Method Path abortTransactions(Path, int)>
	//    4    6:areturn         
	}

*/
}
