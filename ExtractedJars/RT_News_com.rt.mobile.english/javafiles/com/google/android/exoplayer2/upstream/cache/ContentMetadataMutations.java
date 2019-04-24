// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import java.util.*;

public class ContentMetadataMutations
{

	public ContentMetadataMutations()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void HashMap()>
	//    6   12:putfield        #19  <Field Map editedValues>
	//    7   15:aload_0         
	//    8   16:new             #21  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #22  <Method void ArrayList()>
	//   11   23:putfield        #24  <Field List removedValues>
	//   12   26:return          
	}

	private ContentMetadataMutations checkAndSet(String s, Object obj)
	{
		editedValues.put(Assertions.checkNotNull(((Object) (s))), Assertions.checkNotNull(obj));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map editedValues>
	//    2    4:aload_1         
	//    3    5:invokestatic    #33  <Method Object Assertions.checkNotNull(Object)>
	//    4    8:aload_2         
	//    5    9:invokestatic    #33  <Method Object Assertions.checkNotNull(Object)>
	//    6   12:invokeinterface #39  <Method Object Map.put(Object, Object)>
	//    7   17:pop             
		removedValues.remove(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field List removedValues>
	//   10   22:aload_1         
	//   11   23:invokeinterface #45  <Method boolean List.remove(Object)>
	//   12   28:pop             
		return this;
	//   13   29:aload_0         
	//   14   30:areturn         
	}

	public Map getEditedValues()
	{
		HashMap hashmap = new HashMap(editedValues);
	//    0    0:new             #16  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Map editedValues>
	//    4    8:invokespecial   #50  <Method void HashMap(Map)>
	//    5   11:astore_1        
		Iterator iterator = hashmap.entrySet().iterator();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #54  <Method Set HashMap.entrySet()>
	//    8   16:invokeinterface #60  <Method Iterator Set.iterator()>
	//    9   21:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   22:aload_2         
	//   11   23:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            82
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   13   31:aload_2         
	//   14   32:invokeinterface #70  <Method Object Iterator.next()>
	//   15   37:checkcast       #72  <Class java.util.Map$Entry>
	//   16   40:astore_3        
			Object obj = entry.getValue();
	//   17   41:aload_3         
	//   18   42:invokeinterface #75  <Method Object java.util.Map$Entry.getValue()>
	//   19   47:astore          4
			if(obj instanceof byte[])
	//*  20   49:aload           4
	//*  21   51:instanceof      #77  <Class byte[]>
	//*  22   54:ifeq            22
			{
				byte abyte0[] = (byte[])obj;
	//   23   57:aload           4
	//   24   59:checkcast       #77  <Class byte[]>
	//   25   62:astore          4
				entry.setValue(((Object) (Arrays.copyOf(abyte0, abyte0.length))));
	//   26   64:aload_3         
	//   27   65:aload           4
	//   28   67:aload           4
	//   29   69:arraylength     
	//   30   70:invokestatic    #83  <Method byte[] Arrays.copyOf(byte[], int)>
	//   31   73:invokeinterface #86  <Method Object java.util.Map$Entry.setValue(Object)>
	//   32   78:pop             
			}
		} while(true);
	//   33   79:goto            22
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   34   82:aload_1         
	//   35   83:invokestatic    #92  <Method Map Collections.unmodifiableMap(Map)>
	//   36   86:areturn         
	}

	public List getRemovedValues()
	{
		return Collections.unmodifiableList(((List) (new ArrayList(((java.util.Collection) (removedValues))))));
	//    0    0:new             #21  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field List removedValues>
	//    4    8:invokespecial   #99  <Method void ArrayList(java.util.Collection)>
	//    5   11:invokestatic    #103 <Method List Collections.unmodifiableList(List)>
	//    6   14:areturn         
	}

	public ContentMetadataMutations remove(String s)
	{
		removedValues.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List removedValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #108 <Method boolean List.add(Object)>
	//    4   10:pop             
		editedValues.remove(((Object) (s)));
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field Map editedValues>
	//    7   15:aload_1         
	//    8   16:invokeinterface #110 <Method Object Map.remove(Object)>
	//    9   21:pop             
		return this;
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public ContentMetadataMutations set(String s, long l)
	{
		return checkAndSet(s, ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #118 <Method Long Long.valueOf(long)>
	//    4    6:invokespecial   #120 <Method ContentMetadataMutations checkAndSet(String, Object)>
	//    5    9:areturn         
	}

	public ContentMetadataMutations set(String s, String s1)
	{
		return checkAndSet(s, ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #120 <Method ContentMetadataMutations checkAndSet(String, Object)>
	//    4    6:areturn         
	}

	public ContentMetadataMutations set(String s, byte abyte0[])
	{
		return checkAndSet(s, ((Object) (Arrays.copyOf(abyte0, abyte0.length))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:invokestatic    #83  <Method byte[] Arrays.copyOf(byte[], int)>
	//    6    8:invokespecial   #120 <Method ContentMetadataMutations checkAndSet(String, Object)>
	//    7   11:areturn         
	}

	private final Map editedValues = new HashMap();
	private final List removedValues = new ArrayList();
}
