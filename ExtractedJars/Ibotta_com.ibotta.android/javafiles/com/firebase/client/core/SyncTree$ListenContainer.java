// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.FirebaseError;
import com.firebase.client.core.view.QuerySpec;
import com.firebase.client.core.view.View;
import com.firebase.client.snapshot.Node;
import com.firebase.client.utilities.LogWrapper;
import com.firebase.client.utilities.NodeSizeEstimator;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, CompoundHash, Tag

private class SyncTree$ListenContainer
	implements er, SyncTree.SyncTreeHash
{

	public CompoundHash getCompoundHash()
	{
		return CompoundHash.fromNode(view.getServerCache());
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field View view>
	//    2    4:invokevirtual   #47  <Method Node View.getServerCache()>
	//    3    7:invokestatic    #53  <Method CompoundHash CompoundHash.fromNode(Node)>
	//    4   10:areturn         
	}

	public String getSimpleHash()
	{
		return view.getServerCache().getHash();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field View view>
	//    2    4:invokevirtual   #47  <Method Node View.getServerCache()>
	//    3    7:invokeinterface #60  <Method String Node.getHash()>
	//    4   12:areturn         
	}

	public List onListenComplete(FirebaseError firebaseerror)
	{
		if(firebaseerror == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       42
		{
			firebaseerror = ((FirebaseError) (view.getQuery()));
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field View view>
	//    4    8:invokevirtual   #32  <Method QuerySpec View.getQuery()>
	//    5   11:astore_1        
			Tag tag1 = tag;
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field Tag tag>
	//    8   16:astore_2        
			if(tag1 != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          30
				return applyTaggedListenComplete(tag1);
	//   11   21:aload_0         
	//   12   22:getfield        #21  <Field SyncTree this$0>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #66  <Method List SyncTree.applyTaggedListenComplete(Tag)>
	//   15   29:areturn         
			else
				return applyListenComplete(((QuerySpec) (firebaseerror)).getPath());
	//   16   30:aload_0         
	//   17   31:getfield        #21  <Field SyncTree this$0>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #72  <Method Path QuerySpec.getPath()>
	//   20   38:invokevirtual   #76  <Method List SyncTree.applyListenComplete(Path)>
	//   21   41:areturn         
		} else
		{
			LogWrapper logwrapper = SyncTree.access$100(SyncTree.this);
	//   22   42:aload_0         
	//   23   43:getfield        #21  <Field SyncTree this$0>
	//   24   46:invokestatic    #80  <Method LogWrapper SyncTree.access$100(SyncTree)>
	//   25   49:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   26   50:new             #82  <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #83  <Method void StringBuilder()>
	//   29   57:astore_3        
			stringbuilder.append("Listen at ");
	//   30   58:aload_3         
	//   31   59:ldc1            #85  <String "Listen at ">
	//   32   61:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
			stringbuilder.append(((Object) (view.getQuery().getPath())));
	//   34   65:aload_3         
	//   35   66:aload_0         
	//   36   67:getfield        #26  <Field View view>
	//   37   70:invokevirtual   #32  <Method QuerySpec View.getQuery()>
	//   38   73:invokevirtual   #72  <Method Path QuerySpec.getPath()>
	//   39   76:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
	//   40   79:pop             
			stringbuilder.append(" failed: ");
	//   41   80:aload_3         
	//   42   81:ldc1            #94  <String " failed: ">
	//   43   83:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
			stringbuilder.append(firebaseerror.toString());
	//   45   87:aload_3         
	//   46   88:aload_1         
	//   47   89:invokevirtual   #99  <Method String FirebaseError.toString()>
	//   48   92:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   49   95:pop             
			logwrapper.warn(stringbuilder.toString());
	//   50   96:aload_2         
	//   51   97:aload_3         
	//   52   98:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   53  101:invokevirtual   #106 <Method void LogWrapper.warn(String)>
			return removeAllEventRegistrations(view.getQuery(), firebaseerror);
	//   54  104:aload_0         
	//   55  105:getfield        #21  <Field SyncTree this$0>
	//   56  108:aload_0         
	//   57  109:getfield        #26  <Field View view>
	//   58  112:invokevirtual   #32  <Method QuerySpec View.getQuery()>
	//   59  115:aload_1         
	//   60  116:invokevirtual   #110 <Method List SyncTree.removeAllEventRegistrations(QuerySpec, FirebaseError)>
	//   61  119:areturn         
		}
	}

	public boolean shouldIncludeCompoundHash()
	{
		return NodeSizeEstimator.estimateSerializedNodeSize(view.getServerCache()) > 1024L;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field View view>
	//    2    4:invokevirtual   #47  <Method Node View.getServerCache()>
	//    3    7:invokestatic    #120 <Method long NodeSizeEstimator.estimateSerializedNodeSize(Node)>
	//    4   10:ldc2w           #121 <Long 1024L>
	//    5   13:lcmp            
	//    6   14:ifle            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private final Tag tag;
	final SyncTree this$0;
	private final View view;


/*
	static Tag access$1400(SyncTree$ListenContainer synctree$listencontainer)
	{
		return synctree$listencontainer.tag;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Tag tag>
	//    2    4:areturn         
	}

*/

	public SyncTree$ListenContainer(View view1)
	{
		this$0 = SyncTree.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field SyncTree this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		view = view1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field View view>
		tag = SyncTree.access$000(SyncTree.this, view1.getQuery());
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #32  <Method QuerySpec View.getQuery()>
	//   12   20:invokestatic    #36  <Method Tag SyncTree.access$000(SyncTree, QuerySpec)>
	//   13   23:putfield        #38  <Field Tag tag>
	//   14   26:return          
	}
}
