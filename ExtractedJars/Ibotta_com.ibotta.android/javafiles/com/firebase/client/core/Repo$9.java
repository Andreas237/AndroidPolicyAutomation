// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.snapshot.Node;
import java.util.*;

// Referenced classes of package com.firebase.client.core:
//			Repo, Path, SparseSnapshotTree

class Repo$9
	implements com.firebase.client.e.CompletionListener
{

	public void onComplete(FirebaseError firebaseerror, Firebase firebase)
	{
		Repo.access$500(Repo.this, "onDisconnect().updateChildren", val$path, firebaseerror);
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
			java.util.ry ry;
			for(firebase = ((Firebase) (val$newChildren.entrySet().iterator())); ((Iterator) (firebase)).hasNext(); Repo.access$700(Repo.this).remember(val$path.child((Path)ry.getKey()), (Node)ry.getValue()))
	//*   9   18:aload_0         
	//*  10   19:getfield        #27  <Field Map val$newChildren>
	//*  11   22:invokeinterface #47  <Method Set Map.entrySet()>
	//*  12   27:invokeinterface #53  <Method Iterator Set.iterator()>
	//*  13   32:astore_2        
	//*  14   33:aload_2         
	//*  15   34:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//*  16   39:ifeq            90
				ry = (java.util.ry)((Iterator) (firebase)).next();
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
		callOnComplete(val$listener, firebaseerror, val$path);
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
	final com.firebase.client.e.CompletionListener val$listener;
	final Map val$newChildren;
	final Path val$path;

	Repo$9()
	{
		this$0 = final_repo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Repo this$0>
		val$path = path1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Path val$path>
		val$newChildren = map;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Map val$newChildren>
		val$listener = com.firebase.client.e.CompletionListener.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field com.firebase.client.Firebase$CompletionListener val$listener>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
