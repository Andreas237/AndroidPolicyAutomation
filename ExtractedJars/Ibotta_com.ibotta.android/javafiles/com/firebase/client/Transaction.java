// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import com.firebase.client.snapshot.Node;

// Referenced classes of package com.firebase.client:
//			MutableData, FirebaseError, DataSnapshot

public class Transaction
{
	public static interface Handler
	{

		public abstract Result doTransaction(MutableData mutabledata);

		public abstract void onComplete(FirebaseError firebaseerror, boolean flag, DataSnapshot datasnapshot);
	}

	public static class Result
	{

		public Node getNode()
		{
			return data;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Node data>
		//    2    4:areturn         
		}

		public boolean isSuccess()
		{
			return success;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field boolean success>
		//    2    4:ireturn         
		}

		private Node data;
		private boolean success;

		private Result(boolean flag, Node node)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			success = flag;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field boolean success>
			data = node;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Node data>
		//    8   14:return          
		}

	}


	public Transaction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static Result abort()
	{
		return new Result(false, ((Node) (null)));
	//    0    0:new             #11  <Class Transaction$Result>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #22  <Method void Transaction$Result(boolean, Node, Transaction$1)>
	//    6   10:areturn         
	}

	public static Result success(MutableData mutabledata)
	{
		return new Result(true, mutabledata.getNode());
	//    0    0:new             #11  <Class Transaction$Result>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:aload_0         
	//    4    6:invokevirtual   #30  <Method Node MutableData.getNode()>
	//    5    9:aconst_null     
	//    6   10:invokespecial   #22  <Method void Transaction$Result(boolean, Node, Transaction$1)>
	//    7   13:areturn         
	}
}
