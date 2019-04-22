// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import java.util.*;

// Referenced classes of package com.bumptech.glide.manager:
//			RequestManagerTreeNode, RequestManagerFragment

private class RequestManagerFragment$FragmentRequestManagerTreeNode
	implements RequestManagerTreeNode
{

	public Set getDescendants()
	{
		Object obj = ((Object) (getDescendantRequestManagerFragments()));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field RequestManagerFragment this$0>
	//    2    4:invokevirtual   #25  <Method Set RequestManagerFragment.getDescendantRequestManagerFragments()>
	//    3    7:astore_2        
		HashSet hashset = new HashSet(((Set) (obj)).size());
	//    4    8:new             #27  <Class HashSet>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:invokeinterface #33  <Method int Set.size()>
	//    8   18:invokespecial   #36  <Method void HashSet(int)>
	//    9   21:astore_1        
		obj = ((Object) (((Set) (obj)).iterator()));
	//   10   22:aload_2         
	//   11   23:invokeinterface #40  <Method Iterator Set.iterator()>
	//   12   28:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   13   29:aload_2         
	//   14   30:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            69
			RequestManagerFragment requestmanagerfragment = (RequestManagerFragment)((Iterator) (obj)).next();
	//   16   38:aload_2         
	//   17   39:invokeinterface #50  <Method Object Iterator.next()>
	//   18   44:checkcast       #8   <Class RequestManagerFragment>
	//   19   47:astore_3        
			if(requestmanagerfragment.getRequestManager() != null)
	//*  20   48:aload_3         
	//*  21   49:invokevirtual   #54  <Method com.bumptech.glide.RequestManager RequestManagerFragment.getRequestManager()>
	//*  22   52:ifnull          29
				((Set) (hashset)).add(((Object) (requestmanagerfragment.getRequestManager())));
	//   23   55:aload_1         
	//   24   56:aload_3         
	//   25   57:invokevirtual   #54  <Method com.bumptech.glide.RequestManager RequestManagerFragment.getRequestManager()>
	//   26   60:invokeinterface #58  <Method boolean Set.add(Object)>
	//   27   65:pop             
		} while(true);
	//   28   66:goto            29
		return ((Set) (hashset));
	//   29   69:aload_1         
	//   30   70:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #65  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(super.toString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #68  <Method String Object.toString()>
	//    7   13:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("{fragment=");
	//    9   17:aload_1         
	//   10   18:ldc1            #74  <String "{fragment=">
	//   11   20:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (RequestManagerFragment.this)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #15  <Field RequestManagerFragment this$0>
	//   16   29:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append("}");
	//   18   33:aload_1         
	//   19   34:ldc1            #79  <String "}">
	//   20   36:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   24   44:areturn         
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
