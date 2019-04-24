// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import java.util.*;

// Referenced classes of package com.bumptech.glide.manager:
//			RequestManagerTreeNode, RequestManagerFragment

class RequestManagerFragment$FragmentRequestManagerTreeNode
	implements RequestManagerTreeNode
{

	public Set getDescendants()
	{
		Object obj = ((Object) (getDescendantRequestManagerFragments()));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RequestManagerFragment this$0>
	//    2    4:invokevirtual   #24  <Method Set RequestManagerFragment.getDescendantRequestManagerFragments()>
	//    3    7:astore_2        
		HashSet hashset = new HashSet(((Set) (obj)).size());
	//    4    8:new             #26  <Class HashSet>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:invokeinterface #32  <Method int Set.size()>
	//    8   18:invokespecial   #35  <Method void HashSet(int)>
	//    9   21:astore_1        
		obj = ((Object) (((Set) (obj)).iterator()));
	//   10   22:aload_2         
	//   11   23:invokeinterface #39  <Method Iterator Set.iterator()>
	//   12   28:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   13   29:aload_2         
	//   14   30:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            67
			RequestManagerFragment requestmanagerfragment = (RequestManagerFragment)((Iterator) (obj)).next();
	//   16   38:aload_2         
	//   17   39:invokeinterface #49  <Method Object Iterator.next()>
	//   18   44:checkcast       #8   <Class RequestManagerFragment>
	//   19   47:astore_3        
			if(requestmanagerfragment.getRequestManager() != null)
	//*  20   48:aload_3         
	//*  21   49:invokevirtual   #53  <Method com.bumptech.glide.RequestManager RequestManagerFragment.getRequestManager()>
	//*  22   52:ifnull          64
				hashset.add(((Object) (requestmanagerfragment.getRequestManager())));
	//   23   55:aload_1         
	//   24   56:aload_3         
	//   25   57:invokevirtual   #53  <Method com.bumptech.glide.RequestManager RequestManagerFragment.getRequestManager()>
	//   26   60:invokevirtual   #57  <Method boolean HashSet.add(Object)>
	//   27   63:pop             
		} while(true);
	//   28   64:goto            29
		return ((Set) (hashset));
	//   29   67:aload_1         
	//   30   68:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(super.toString()).append("{fragment=").append(((Object) (RequestManagerFragment.this))).append("}").toString();
	//    0    0:new             #63  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokespecial   #66  <Method String Object.toString()>
	//    5   11:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #72  <String "{fragment=">
	//    7   16:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #15  <Field RequestManagerFragment this$0>
	//   10   23:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:ldc1            #77  <String "}">
	//   12   28:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	final RequestManagerFragment this$0;

	RequestManagerFragment$FragmentRequestManagerTreeNode()
	{
		this$0 = RequestManagerFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field RequestManagerFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
