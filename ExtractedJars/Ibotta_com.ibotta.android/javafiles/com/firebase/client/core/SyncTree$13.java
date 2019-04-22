// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;

import com.firebase.client.core.view.View;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.firebase.client.core:
//			SyncTree, SyncPoint, Path

class SyncTree$13
	implements com.firebase.client.core.utilities.e.TreeVisitor
{

	public volatile Object onNodeValue(Path path, Object obj, Object obj1)
	{
		return ((Object) (onNodeValue(path, (SyncPoint)obj, (Void)obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #26  <Class SyncPoint>
	//    4    6:aload_3         
	//    5    7:checkcast       #28  <Class Void>
	//    6   10:invokevirtual   #31  <Method Void onNodeValue(Path, SyncPoint, Void)>
	//    7   13:areturn         
	}

	public Void onNodeValue(Path path, SyncPoint syncpoint, Void void1)
	{
		if(!path.isEmpty() && syncpoint.hasCompleteView())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #37  <Method boolean Path.isEmpty()>
	//*   2    4:ifne            53
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #40  <Method boolean SyncPoint.hasCompleteView()>
	//*   5   11:ifeq            53
		{
			path = ((Path) (syncpoint.getCompleteView().getQuery()));
	//    6   14:aload_2         
	//    7   15:invokevirtual   #44  <Method View SyncPoint.getCompleteView()>
	//    8   18:invokevirtual   #50  <Method com.firebase.client.core.view.QuerySpec View.getQuery()>
	//    9   21:astore_1        
			SyncTree.access$1500(SyncTree.this).stopListening(SyncTree.access$1300(SyncTree.this, ((com.firebase.client.core.view.QuerySpec) (path))), SyncTree.access$000(SyncTree.this, ((com.firebase.client.core.view.QuerySpec) (path))));
	//   10   22:aload_0         
	//   11   23:getfield        #18  <Field SyncTree this$0>
	//   12   26:invokestatic    #54  <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
	//   13   29:aload_0         
	//   14   30:getfield        #18  <Field SyncTree this$0>
	//   15   33:aload_1         
	//   16   34:invokestatic    #58  <Method com.firebase.client.core.view.QuerySpec SyncTree.access$1300(SyncTree, com.firebase.client.core.view.QuerySpec)>
	//   17   37:aload_0         
	//   18   38:getfield        #18  <Field SyncTree this$0>
	//   19   41:aload_1         
	//   20   42:invokestatic    #62  <Method Tag SyncTree.access$000(SyncTree, com.firebase.client.core.view.QuerySpec)>
	//   21   45:invokeinterface #68  <Method void SyncTree$ListenProvider.stopListening(com.firebase.client.core.view.QuerySpec, Tag)>
		} else
	//*  22   50:goto            116
		{
			for(path = ((Path) (syncpoint.getQueryViews().iterator())); ((Iterator) (path)).hasNext(); SyncTree.access$1500(SyncTree.this).stopListening(SyncTree.access$1300(SyncTree.this, ((com.firebase.client.core.view.QuerySpec) (syncpoint))), SyncTree.access$000(SyncTree.this, ((com.firebase.client.core.view.QuerySpec) (syncpoint)))))
	//*  23   53:aload_2         
	//*  24   54:invokevirtual   #72  <Method List SyncPoint.getQueryViews()>
	//*  25   57:invokeinterface #78  <Method Iterator List.iterator()>
	//*  26   62:astore_1        
	//*  27   63:aload_1         
	//*  28   64:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*  29   69:ifeq            116
				syncpoint = ((SyncPoint) (((View)((Iterator) (path)).next()).getQuery()));
	//   30   72:aload_1         
	//   31   73:invokeinterface #87  <Method Object Iterator.next()>
	//   32   78:checkcast       #46  <Class View>
	//   33   81:invokevirtual   #50  <Method com.firebase.client.core.view.QuerySpec View.getQuery()>
	//   34   84:astore_2        

	//   35   85:aload_0         
	//   36   86:getfield        #18  <Field SyncTree this$0>
	//   37   89:invokestatic    #54  <Method SyncTree$ListenProvider SyncTree.access$1500(SyncTree)>
	//   38   92:aload_0         
	//   39   93:getfield        #18  <Field SyncTree this$0>
	//   40   96:aload_2         
	//   41   97:invokestatic    #58  <Method com.firebase.client.core.view.QuerySpec SyncTree.access$1300(SyncTree, com.firebase.client.core.view.QuerySpec)>
	//   42  100:aload_0         
	//   43  101:getfield        #18  <Field SyncTree this$0>
	//   44  104:aload_2         
	//   45  105:invokestatic    #62  <Method Tag SyncTree.access$000(SyncTree, com.firebase.client.core.view.QuerySpec)>
	//   46  108:invokeinterface #68  <Method void SyncTree$ListenProvider.stopListening(com.firebase.client.core.view.QuerySpec, Tag)>
		}
	//*  47  113:goto            63
		return null;
	//   48  116:aconst_null     
	//   49  117:areturn         
	}

	final SyncTree this$0;

	SyncTree$13()
	{
		this$0 = SyncTree.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SyncTree this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
