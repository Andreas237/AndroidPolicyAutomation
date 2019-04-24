// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal:
//			LinkedHashTreeMap

final class LinkedHashTreeMap$EntrySet extends AbstractSet
{

	public void clear()
	{
		LinkedHashTreeMap.this.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
	//    2    4:invokevirtual   #23  <Method void LinkedHashTreeMap.clear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		return (obj instanceof java.util.Map.Entry) && findByEntry((java.util.Map.Entry)obj) != null;
	//    0    0:aload_1         
	//    1    1:instanceof      #27  <Class java.util.Map$Entry>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field LinkedHashTreeMap this$0>
	//    5   11:aload_1         
	//    6   12:checkcast       #27  <Class java.util.Map$Entry>
	//    7   15:invokevirtual   #31  <Method LinkedHashTreeMap$Node LinkedHashTreeMap.findByEntry(java.util.Map$Entry)>
	//    8   18:ifnull          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new LinkedHashTreeMap.LinkedTreeMapIterator() {

			public volatile Object next()
			{
				return ((Object) (next()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #32  <Method java.util.Map$Entry next()>
			//    2    4:areturn         
			}

			public java.util.Map.Entry next()
			{
				return ((java.util.Map.Entry) (nextNode()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #36  <Method LinkedHashTreeMap$Node nextNode()>
			//    2    4:areturn         
			}

			final LinkedHashTreeMap.EntrySet this$1;

			
			{
				this$1 = LinkedHashTreeMap.EntrySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LinkedHashTreeMap$EntrySet this$1>
				super(this$0);
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #23  <Field LinkedHashTreeMap LinkedHashTreeMap$EntrySet.this$0>
			//    6   10:invokespecial   #26  <Method void LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap)>
			//    7   13:return          
			}
		}
));
	//    0    0:new             #10  <Class LinkedHashTreeMap$EntrySet$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void LinkedHashTreeMap$EntrySet$1(LinkedHashTreeMap$EntrySet)>
	//    4    8:areturn         
	}

	public boolean remove(Object obj)
	{
		if(!(obj instanceof java.util.Map.Entry))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #27  <Class java.util.Map$Entry>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) (findByEntry((java.util.Map.Entry)obj)));
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field LinkedHashTreeMap this$0>
	//    7   13:aload_1         
	//    8   14:checkcast       #27  <Class java.util.Map$Entry>
	//    9   17:invokevirtual   #31  <Method LinkedHashTreeMap$Node LinkedHashTreeMap.findByEntry(java.util.Map$Entry)>
	//   10   20:astore_1        
		if(obj == null)
	//*  11   21:aload_1         
	//*  12   22:ifnonnull       27
		{
			return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
		} else
		{
			removeInternal(((LinkedHashTreeMap.Node) (obj)), true);
	//   15   27:aload_0         
	//   16   28:getfield        #16  <Field LinkedHashTreeMap this$0>
	//   17   31:aload_1         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #43  <Method void LinkedHashTreeMap.removeInternal(LinkedHashTreeMap$Node, boolean)>
			return true;
	//   20   36:iconst_1        
	//   21   37:ireturn         
		}
	}

	public int size()
	{
		return LinkedHashTreeMap.this.size;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
	//    2    4:getfield        #48  <Field int LinkedHashTreeMap.size>
	//    3    7:ireturn         
	}

	final LinkedHashTreeMap this$0;

	LinkedHashTreeMap$EntrySet()
	{
		this$0 = LinkedHashTreeMap.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field LinkedHashTreeMap this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AbstractSet()>
	//    5    9:return          
	}
}
