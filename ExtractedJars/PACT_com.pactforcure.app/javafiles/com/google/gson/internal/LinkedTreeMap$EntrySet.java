// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal:
//			LinkedTreeMap

class LinkedTreeMap$EntrySet extends AbstractSet
{

	public void clear()
	{
		LinkedTreeMap.this.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
	//    2    4:invokevirtual   #23  <Method void LinkedTreeMap.clear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		return (obj instanceof java.util.Map.Entry) && findByEntry((java.util.Map.Entry)obj) != null;
	//    0    0:aload_1         
	//    1    1:instanceof      #27  <Class java.util.Map$Entry>
	//    2    4:ifeq            23
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field LinkedTreeMap this$0>
	//    5   11:aload_1         
	//    6   12:checkcast       #27  <Class java.util.Map$Entry>
	//    7   15:invokevirtual   #31  <Method LinkedTreeMap$Node LinkedTreeMap.findByEntry(java.util.Map$Entry)>
	//    8   18:ifnull          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new LinkedTreeMap.LinkedTreeMapIterator() {

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
			//    1    1:invokevirtual   #36  <Method LinkedTreeMap$Node nextNode()>
			//    2    4:areturn         
			}

			final LinkedTreeMap.EntrySet this$1;

			
			{
				this$1 = LinkedTreeMap.EntrySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LinkedTreeMap$EntrySet this$1>
				super(this$0, ((LinkedTreeMap._cls1) (null)));
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #23  <Field LinkedTreeMap LinkedTreeMap$EntrySet.this$0>
			//    6   10:aconst_null     
			//    7   11:invokespecial   #26  <Method void LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap, LinkedTreeMap$1)>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #10  <Class LinkedTreeMap$EntrySet$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void LinkedTreeMap$EntrySet$1(LinkedTreeMap$EntrySet)>
	//    4    8:areturn         
	}

	public boolean remove(Object obj)
	{
		if(obj instanceof java.util.Map.Entry)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #27  <Class java.util.Map$Entry>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_0         
	//*   6   10:getfield        #16  <Field LinkedTreeMap this$0>
	//*   7   13:aload_1         
	//*   8   14:checkcast       #27  <Class java.util.Map$Entry>
	//*   9   17:invokevirtual   #31  <Method LinkedTreeMap$Node LinkedTreeMap.findByEntry(java.util.Map$Entry)>
	//*  10   20:astore_1        
			if((obj = ((Object) (findByEntry((java.util.Map.Entry)obj)))) != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          7
			{
				removeInternal(((LinkedTreeMap.Node) (obj)), true);
	//   13   25:aload_0         
	//   14   26:getfield        #16  <Field LinkedTreeMap this$0>
	//   15   29:aload_1         
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #43  <Method void LinkedTreeMap.removeInternal(LinkedTreeMap$Node, boolean)>
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
			}
		return false;
	}

	public int size()
	{
		return LinkedTreeMap.this.size;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
	//    2    4:getfield        #48  <Field int LinkedTreeMap.size>
	//    3    7:ireturn         
	}

	final LinkedTreeMap this$0;

	LinkedTreeMap$EntrySet()
	{
		this$0 = LinkedTreeMap.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field LinkedTreeMap this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AbstractSet()>
	//    5    9:return          
	}
}
