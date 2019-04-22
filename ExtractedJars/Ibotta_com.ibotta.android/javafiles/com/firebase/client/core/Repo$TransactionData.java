// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client.core:
//			Repo, Path

private static class Repo$TransactionData
	implements Comparable
{

	public int compareTo(Repo$TransactionData repo$transactiondata)
	{
		long l = order;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long order>
	//    2    4:lstore_2        
		long l1 = repo$transactiondata.order;
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
		return compareTo((Repo$TransactionData)obj);
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
	private s status;


/*
	static Node access$1200(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.currentInputSnapshot;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Node currentInputSnapshot>
	//    2    4:areturn         
	}

*/


/*
	static Node access$1202(Repo$TransactionData repo$transactiondata, Node node)
	{
		repo$transactiondata.currentInputSnapshot = node;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field Node currentInputSnapshot>
		return node;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Node access$1300(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.currentOutputSnapshotRaw;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Node currentOutputSnapshotRaw>
	//    2    4:areturn         
	}

*/


/*
	static Node access$1302(Repo$TransactionData repo$transactiondata, Node node)
	{
		repo$transactiondata.currentOutputSnapshotRaw = node;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Node currentOutputSnapshotRaw>
		return node;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Node access$1400(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.currentOutputSnapshotResolved;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Node currentOutputSnapshotResolved>
	//    2    4:areturn         
	}

*/


/*
	static Node access$1402(Repo$TransactionData repo$transactiondata, Node node)
	{
		repo$transactiondata.currentOutputSnapshotResolved = node;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field Node currentOutputSnapshotResolved>
		return node;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static s access$1500(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.status;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Repo$TransactionStatus status>
	//    2    4:areturn         
	}

*/


/*
	static s access$1502(Repo$TransactionData repo$transactiondata, s s)
	{
		repo$transactiondata.status = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Repo$TransactionStatus status>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static long access$1600(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.currentWriteId;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field long currentWriteId>
	//    2    4:lreturn         
	}

*/


/*
	static long access$1602(Repo$TransactionData repo$transactiondata, long l)
	{
		repo$transactiondata.currentWriteId = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #78  <Field long currentWriteId>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/


/*
	static int access$1800(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.retryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int retryCount>
	//    2    4:ireturn         
	}

*/


/*
	static int access$1808(Repo$TransactionData repo$transactiondata)
	{
		int i = repo$transactiondata.retryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int retryCount>
	//    2    4:istore_1        
		repo$transactiondata.retryCount = i + 1;
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
	static Path access$1900(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.path;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Path path>
	//    2    4:areturn         
	}

*/


/*
	static com.firebase.client.Transaction.Handler access$2100(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.handler;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field com.firebase.client.Transaction$Handler handler>
	//    2    4:areturn         
	}

*/


/*
	static ValueEventListener access$2200(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.outstandingListener;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ValueEventListener outstandingListener>
	//    2    4:areturn         
	}

*/


/*
	static FirebaseError access$2600(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.abortReason;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field FirebaseError abortReason>
	//    2    4:areturn         
	}

*/


/*
	static FirebaseError access$2602(Repo$TransactionData repo$transactiondata, FirebaseError firebaseerror)
	{
		repo$transactiondata.abortReason = firebaseerror;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field FirebaseError abortReason>
		return firebaseerror;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static boolean access$2700(Repo$TransactionData repo$transactiondata)
	{
		return repo$transactiondata.applyLocally;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean applyLocally>
	//    2    4:ireturn         
	}

*/

	private Repo$TransactionData(Path path1, com.firebase.client.Transaction.Handler handler1, ValueEventListener valueeventlistener, s s, boolean flag, long l)
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
		status = s;
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

	Repo$TransactionData(Path path1, com.firebase.client.Transaction.Handler handler1, ValueEventListener valueeventlistener, s s, boolean flag, long l, 
			Repo._cls1 _pcls1)
	{
		this(path1, handler1, valueeventlistener, s, flag, l);
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
