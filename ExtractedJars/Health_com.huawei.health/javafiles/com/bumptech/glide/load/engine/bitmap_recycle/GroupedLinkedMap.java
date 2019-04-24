// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			Poolable

class GroupedLinkedMap
{
	static class LinkedEntry
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
		LinkedEntry next;
		LinkedEntry prev;
		private List values;

		public LinkedEntry()
		{
			this(((Object) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #23  <Method void GroupedLinkedMap$LinkedEntry(Object)>
		//    3    5:return          
		}

		public LinkedEntry(Object obj)
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


	GroupedLinkedMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #7   <Class GroupedLinkedMap$LinkedEntry>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void GroupedLinkedMap$LinkedEntry()>
	//    6   12:putfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//    7   15:aload_0         
	//    8   16:new             #23  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #24  <Method void HashMap()>
	//   11   23:putfield        #26  <Field Map keyToEntry>
	//   12   26:return          
	}

	private void makeHead(LinkedEntry linkedentry)
	{
		removeEntry(linkedentry);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method void removeEntry(GroupedLinkedMap$LinkedEntry)>
		linkedentry.prev = head;
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//    5    9:putfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
		linkedentry.next = head.next;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//    9   17:getfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
	//   10   20:putfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
		updateEntry(linkedentry);
	//   11   23:aload_1         
	//   12   24:invokestatic    #41  <Method void updateEntry(GroupedLinkedMap$LinkedEntry)>
	//   13   27:return          
	}

	private void makeTail(LinkedEntry linkedentry)
	{
		removeEntry(linkedentry);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method void removeEntry(GroupedLinkedMap$LinkedEntry)>
		linkedentry.prev = head.prev;
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//    5    9:getfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
	//    6   12:putfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
		linkedentry.next = head;
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//   10   20:putfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
		updateEntry(linkedentry);
	//   11   23:aload_1         
	//   12   24:invokestatic    #41  <Method void updateEntry(GroupedLinkedMap$LinkedEntry)>
	//   13   27:return          
	}

	private static void removeEntry(LinkedEntry linkedentry)
	{
		linkedentry.prev.next = linkedentry.next;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
	//    4    8:putfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
		linkedentry.next.prev = linkedentry.prev;
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
	//    9   19:putfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
	//   10   22:return          
	}

	private static void updateEntry(LinkedEntry linkedentry)
	{
		linkedentry.next.prev = linkedentry;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
	//    2    4:aload_0         
	//    3    5:putfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
		linkedentry.prev.next = linkedentry;
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
	//    6   12:aload_0         
	//    7   13:putfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
	//    8   16:return          
	}

	public Object get(Poolable poolable)
	{
		LinkedEntry linkedentry = (LinkedEntry)keyToEntry.get(((Object) (poolable)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map keyToEntry>
	//    2    4:aload_1         
	//    3    5:invokeinterface #53  <Method Object Map.get(Object)>
	//    4   10:checkcast       #7   <Class GroupedLinkedMap$LinkedEntry>
	//    5   13:astore_2        
		if(linkedentry == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       44
		{
			linkedentry = new LinkedEntry(((Object) (poolable)));
	//    8   18:new             #7   <Class GroupedLinkedMap$LinkedEntry>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #56  <Method void GroupedLinkedMap$LinkedEntry(Object)>
	//   12   26:astore_2        
			keyToEntry.put(((Object) (poolable)), ((Object) (linkedentry)));
	//   13   27:aload_0         
	//   14   28:getfield        #26  <Field Map keyToEntry>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
			poolable = ((Poolable) (linkedentry));
	//   19   39:aload_2         
	//   20   40:astore_1        
		} else
	//*  21   41:goto            52
		{
			poolable.offer();
	//   22   44:aload_1         
	//   23   45:invokeinterface #65  <Method void Poolable.offer()>
			poolable = ((Poolable) (linkedentry));
	//   24   50:aload_2         
	//   25   51:astore_1        
		}
		makeHead(((LinkedEntry) (poolable)));
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokespecial   #67  <Method void makeHead(GroupedLinkedMap$LinkedEntry)>
		return ((LinkedEntry) (poolable)).removeLast();
	//   29   57:aload_1         
	//   30   58:invokevirtual   #71  <Method Object GroupedLinkedMap$LinkedEntry.removeLast()>
	//   31   61:areturn         
	}

	public void put(Poolable poolable, Object obj)
	{
		LinkedEntry linkedentry = (LinkedEntry)keyToEntry.get(((Object) (poolable)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Map keyToEntry>
	//    2    4:aload_1         
	//    3    5:invokeinterface #53  <Method Object Map.get(Object)>
	//    4   10:checkcast       #7   <Class GroupedLinkedMap$LinkedEntry>
	//    5   13:astore_3        
		if(linkedentry == null)
	//*   6   14:aload_3         
	//*   7   15:ifnonnull       49
		{
			linkedentry = new LinkedEntry(((Object) (poolable)));
	//    8   18:new             #7   <Class GroupedLinkedMap$LinkedEntry>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:invokespecial   #56  <Method void GroupedLinkedMap$LinkedEntry(Object)>
	//   12   26:astore_3        
			makeTail(linkedentry);
	//   13   27:aload_0         
	//   14   28:aload_3         
	//   15   29:invokespecial   #76  <Method void makeTail(GroupedLinkedMap$LinkedEntry)>
			keyToEntry.put(((Object) (poolable)), ((Object) (linkedentry)));
	//   16   32:aload_0         
	//   17   33:getfield        #26  <Field Map keyToEntry>
	//   18   36:aload_1         
	//   19   37:aload_3         
	//   20   38:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   21   43:pop             
			poolable = ((Poolable) (linkedentry));
	//   22   44:aload_3         
	//   23   45:astore_1        
		} else
	//*  24   46:goto            57
		{
			poolable.offer();
	//   25   49:aload_1         
	//   26   50:invokeinterface #65  <Method void Poolable.offer()>
			poolable = ((Poolable) (linkedentry));
	//   27   55:aload_3         
	//   28   56:astore_1        
		}
		((LinkedEntry) (poolable)).add(obj);
	//   29   57:aload_1         
	//   30   58:aload_2         
	//   31   59:invokevirtual   #79  <Method void GroupedLinkedMap$LinkedEntry.add(Object)>
	//   32   62:return          
	}

	public Object removeLast()
	{
		for(LinkedEntry linkedentry = head.prev; !((Object) (linkedentry)).equals(((Object) (head))); linkedentry = linkedentry.prev)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//*   2    4:getfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//*   7   13:invokevirtual   #84  <Method boolean Object.equals(Object)>
	//*   8   16:ifne            68
		{
			Object obj = linkedentry.removeLast();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #71  <Method Object GroupedLinkedMap$LinkedEntry.removeLast()>
	//   11   23:astore_2        
			if(obj != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          30
				return obj;
	//   14   28:aload_2         
	//   15   29:areturn         
			removeEntry(linkedentry);
	//   16   30:aload_1         
	//   17   31:invokestatic    #32  <Method void removeEntry(GroupedLinkedMap$LinkedEntry)>
			keyToEntry.remove(linkedentry.key);
	//   18   34:aload_0         
	//   19   35:getfield        #26  <Field Map keyToEntry>
	//   20   38:aload_1         
	//   21   39:getfield        #88  <Field Object GroupedLinkedMap$LinkedEntry.key>
	//   22   42:invokeinterface #91  <Method Object Map.remove(Object)>
	//   23   47:pop             
			((Poolable)linkedentry.key).offer();
	//   24   48:aload_1         
	//   25   49:getfield        #88  <Field Object GroupedLinkedMap$LinkedEntry.key>
	//   26   52:checkcast       #62  <Class Poolable>
	//   27   55:invokeinterface #65  <Method void Poolable.offer()>
		}

	//   28   60:aload_1         
	//   29   61:getfield        #35  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.prev>
	//   30   64:astore_1        
	//*  31   65:goto            8
		return ((Object) (null));
	//   32   68:aconst_null     
	//   33   69:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("GroupedLinkedMap( ");
	//    0    0:new             #96  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #98  <String "GroupedLinkedMap( ">
	//    3    6:invokespecial   #101 <Method void StringBuilder(String)>
	//    4    9:astore_3        
		LinkedEntry linkedentry = head.next;
	//    5   10:aload_0         
	//    6   11:getfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//    7   14:getfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
	//    8   17:astore_2        
		boolean flag = false;
	//    9   18:iconst_0        
	//   10   19:istore_1        
		for(; !((Object) (linkedentry)).equals(((Object) (head))); linkedentry = linkedentry.next)
	//*  11   20:aload_2         
	//*  12   21:aload_0         
	//*  13   22:getfield        #21  <Field GroupedLinkedMap$LinkedEntry head>
	//*  14   25:invokevirtual   #84  <Method boolean Object.equals(Object)>
	//*  15   28:ifne            72
		{
			flag = true;
	//   16   31:iconst_1        
	//   17   32:istore_1        
			stringbuilder.append('{').append(linkedentry.key).append(':').append(linkedentry.size()).append("}, ");
	//   18   33:aload_3         
	//   19   34:bipush          123
	//   20   36:invokevirtual   #105 <Method StringBuilder StringBuilder.append(char)>
	//   21   39:aload_2         
	//   22   40:getfield        #88  <Field Object GroupedLinkedMap$LinkedEntry.key>
	//   23   43:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   24   46:bipush          58
	//   25   48:invokevirtual   #105 <Method StringBuilder StringBuilder.append(char)>
	//   26   51:aload_2         
	//   27   52:invokevirtual   #112 <Method int GroupedLinkedMap$LinkedEntry.size()>
	//   28   55:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   29   58:ldc1            #117 <String "}, ">
	//   30   60:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
		}

	//   32   64:aload_2         
	//   33   65:getfield        #38  <Field GroupedLinkedMap$LinkedEntry GroupedLinkedMap$LinkedEntry.next>
	//   34   68:astore_2        
	//*  35   69:goto            20
		if(flag)
	//*  36   72:iload_1         
	//*  37   73:ifeq            91
			stringbuilder.delete(stringbuilder.length() - 2, stringbuilder.length());
	//   38   76:aload_3         
	//   39   77:aload_3         
	//   40   78:invokevirtual   #123 <Method int StringBuilder.length()>
	//   41   81:iconst_2        
	//   42   82:isub            
	//   43   83:aload_3         
	//   44   84:invokevirtual   #123 <Method int StringBuilder.length()>
	//   45   87:invokevirtual   #127 <Method StringBuilder StringBuilder.delete(int, int)>
	//   46   90:pop             
		return stringbuilder.append(" )").toString();
	//   47   91:aload_3         
	//   48   92:ldc1            #129 <String " )">
	//   49   94:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   50   97:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   51  100:areturn         
	}

	private final LinkedEntry head = new LinkedEntry();
	private final Map keyToEntry = new HashMap();
}
