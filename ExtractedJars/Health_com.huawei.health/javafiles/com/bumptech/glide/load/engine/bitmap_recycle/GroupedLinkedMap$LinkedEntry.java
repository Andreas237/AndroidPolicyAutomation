// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			GroupedLinkedMap

static class GroupedLinkedMap$LinkedEntry
{

	public void add(Object obj)
	{
		if(values == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field List values>
	//*   2    4:ifnonnull       18
			values = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #39  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #40  <Method void ArrayList()>
	//    7   15:putfield        #37  <Field List values>
		values.add(obj);
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field List values>
	//   10   22:aload_1         
	//   11   23:invokeinterface #45  <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public Object removeLast()
	{
		int i = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method int size()>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            22
			return values.remove(i - 1);
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field List values>
	//    7   13:iload_1         
	//    8   14:iconst_1        
	//    9   15:isub            
	//   10   16:invokeinterface #57  <Method Object List.remove(int)>
	//   11   21:areturn         
		else
			return ((Object) (null));
	//   12   22:aconst_null     
	//   13   23:areturn         
	}

	public int size()
	{
		if(values != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field List values>
	//*   2    4:ifnull          17
			return values.size();
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field List values>
	//    5   11:invokeinterface #60  <Method int List.size()>
	//    6   16:ireturn         
		else
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	final Object key;
	GroupedLinkedMap$LinkedEntry next;
	GroupedLinkedMap$LinkedEntry prev;
	private List values;

	public GroupedLinkedMap$LinkedEntry()
	{
		this(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #23  <Method void GroupedLinkedMap$LinkedEntry(Object)>
	//    3    5:return          
	}

	public GroupedLinkedMap$LinkedEntry(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		prev = this;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:putfield        #28  <Field GroupedLinkedMap$LinkedEntry prev>
		next = this;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:putfield        #30  <Field GroupedLinkedMap$LinkedEntry next>
		key = obj;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #32  <Field Object key>
	//   11   19:return          
	}
}
