// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbq, zzbbr

public final class zzbco extends LinkedHashMap
{

	private zzbco()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void LinkedHashMap()>
		zzdpi = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #18  <Field boolean zzdpi>
	//    5    9:return          
	}

	private zzbco(Map map)
	{
		super(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void LinkedHashMap(Map)>
		zzdpi = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #18  <Field boolean zzdpi>
	//    6   10:return          
	}

	public static zzbco zzaeb()
	{
		return zzdwc;
	//    0    0:getstatic       #16  <Field zzbco zzdwc>
	//    1    3:areturn         
	}

	private final void zzaed()
	{
		if(!zzdpi)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field boolean zzdpi>
	//*   2    4:ifne            15
			throw new UnsupportedOperationException();
	//    3    7:new             #31  <Class UnsupportedOperationException>
	//    4   10:dup             
	//    5   11:invokespecial   #32  <Method void UnsupportedOperationException()>
	//    6   14:athrow          
		else
			return;
	//    7   15:return          
	}

	private static int zzr(Object obj)
	{
		if(obj instanceof byte[])
	//*   0    0:aload_0         
	//*   1    1:instanceof      #36  <Class byte[]>
	//*   2    4:ifeq            15
			return zzbbq.hashCode((byte[])obj);
	//    3    7:aload_0         
	//    4    8:checkcast       #36  <Class byte[]>
	//    5   11:invokestatic    #42  <Method int zzbbq.hashCode(byte[])>
	//    6   14:ireturn         
		if(obj instanceof zzbbr)
	//*   7   15:aload_0         
	//*   8   16:instanceof      #44  <Class zzbbr>
	//*   9   19:ifeq            30
			throw new UnsupportedOperationException();
	//   10   22:new             #31  <Class UnsupportedOperationException>
	//   11   25:dup             
	//   12   26:invokespecial   #32  <Method void UnsupportedOperationException()>
	//   13   29:athrow          
		else
			return obj.hashCode();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #49  <Method int Object.hashCode()>
	//   16   34:ireturn         
	}

	public final void clear()
	{
		zzaed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzaed()>
		super.clear();
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void LinkedHashMap.clear()>
	//    4    8:return          
	}

	public final Set entrySet()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #60  <Method boolean isEmpty()>
	//*   2    4:ifeq            11
			return Collections.emptySet();
	//    3    7:invokestatic    #65  <Method Set Collections.emptySet()>
	//    4   10:areturn         
		else
			return super.entrySet();
	//    5   11:aload_0         
	//    6   12:invokespecial   #67  <Method Set LinkedHashMap.entrySet()>
	//    7   15:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof Map))
			break MISSING_BLOCK_LABEL_171;
	//    0    0:aload_1         
	//    1    1:instanceof      #72  <Class Map>
	//    2    4:ifeq            171
		obj = ((Object) ((Map)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #72  <Class Map>
	//    5   11:astore_1        
		if(this == obj) goto _L2; else goto _L1
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:if_acmpeq       163
_L1:
		if(((Map)this).size() == ((Map) (obj)).size()) goto _L4; else goto _L3
	//    9   17:aload_0         
	//   10   18:invokeinterface #75  <Method int Map.size()>
	//   11   23:aload_1         
	//   12   24:invokeinterface #75  <Method int Map.size()>
	//   13   29:icmpeq          37
_L3:
		boolean flag;
		flag = false;
	//   14   32:iconst_0        
	//   15   33:istore_2        
		break MISSING_BLOCK_LABEL_165;
	//   16   34:goto            165
_L4:
		Iterator iterator = ((Map)this).entrySet().iterator();
	//   17   37:aload_0         
	//   18   38:invokeinterface #76  <Method Set Map.entrySet()>
	//   19   43:invokeinterface #82  <Method Iterator Set.iterator()>
	//   20   48:astore          4
_L6:
		if(!iterator.hasNext()) goto _L2; else goto _L5
	//   21   50:aload           4
	//   22   52:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   23   57:ifeq            163
_L5:
		boolean flag1;
		Object obj2 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   24   60:aload           4
	//   25   62:invokeinterface #91  <Method Object Iterator.next()>
	//   26   67:checkcast       #93  <Class java.util.Map$Entry>
	//   27   70:astore          6
		if(!((Map) (obj)).containsKey(((java.util.Map.Entry) (obj2)).getKey()))
	//*  28   72:aload_1         
	//*  29   73:aload           6
	//*  30   75:invokeinterface #96  <Method Object java.util.Map$Entry.getKey()>
	//*  31   80:invokeinterface #99  <Method boolean Map.containsKey(Object)>
	//*  32   85:ifne            91
			break; /* Loop/switch isn't completed */
	//   33   88:goto            32
		Object obj1 = ((java.util.Map.Entry) (obj2)).getValue();
	//   34   91:aload           6
	//   35   93:invokeinterface #102 <Method Object java.util.Map$Entry.getValue()>
	//   36   98:astore          5
		obj2 = ((Map) (obj)).get(((java.util.Map.Entry) (obj2)).getKey());
	//   37  100:aload_1         
	//   38  101:aload           6
	//   39  103:invokeinterface #96  <Method Object java.util.Map$Entry.getKey()>
	//   40  108:invokeinterface #106 <Method Object Map.get(Object)>
	//   41  113:astore          6
		if((obj1 instanceof byte[]) && (obj2 instanceof byte[]))
	//*  42  115:aload           5
	//*  43  117:instanceof      #36  <Class byte[]>
	//*  44  120:ifeq            148
	//*  45  123:aload           6
	//*  46  125:instanceof      #36  <Class byte[]>
	//*  47  128:ifeq            148
			flag1 = Arrays.equals((byte[])obj1, (byte[])obj2);
	//   48  131:aload           5
	//   49  133:checkcast       #36  <Class byte[]>
	//   50  136:aload           6
	//   51  138:checkcast       #36  <Class byte[]>
	//   52  141:invokestatic    #111 <Method boolean Arrays.equals(byte[], byte[])>
	//   53  144:istore_3        
		else
	//*  54  145:goto            156
			flag1 = obj1.equals(obj2);
	//   55  148:aload           5
	//   56  150:aload           6
	//   57  152:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//   58  155:istore_3        
		if(flag1) goto _L6; else goto _L3
	//   59  156:iload_3         
	//   60  157:ifne            50
	//*  61  160:goto            32
_L2:
		flag = true;
	//   62  163:iconst_1        
	//   63  164:istore_2        
		if(flag)
	//*  64  165:iload_2         
	//*  65  166:ifeq            171
			return true;
	//   66  169:iconst_1        
	//   67  170:ireturn         
		return false;
	//   68  171:iconst_0        
	//   69  172:ireturn         
	}

	public final int hashCode()
	{
		Iterator iterator = ((Map)this).entrySet().iterator();
	//    0    0:aload_0         
	//    1    1:invokeinterface #76  <Method Set Map.entrySet()>
	//    2    6:invokeinterface #82  <Method Iterator Set.iterator()>
	//    3   11:astore_3        
		int i;
		int j;
		java.util.Map.Entry entry;
		for(i = 0; iterator.hasNext(); i += zzr(entry.getValue()) ^ j)
	//*   4   12:iconst_0        
	//*   5   13:istore_1        
	//*   6   14:aload_3         
	//*   7   15:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*   8   20:ifeq            63
		{
			entry = (java.util.Map.Entry)iterator.next();
	//    9   23:aload_3         
	//   10   24:invokeinterface #91  <Method Object Iterator.next()>
	//   11   29:checkcast       #93  <Class java.util.Map$Entry>
	//   12   32:astore          4
			j = zzr(entry.getKey());
	//   13   34:aload           4
	//   14   36:invokeinterface #96  <Method Object java.util.Map$Entry.getKey()>
	//   15   41:invokestatic    #115 <Method int zzr(Object)>
	//   16   44:istore_2        
		}

	//   17   45:iload_1         
	//   18   46:aload           4
	//   19   48:invokeinterface #102 <Method Object java.util.Map$Entry.getValue()>
	//   20   53:invokestatic    #115 <Method int zzr(Object)>
	//   21   56:iload_2         
	//   22   57:ixor            
	//   23   58:iadd            
	//   24   59:istore_1        
	//*  25   60:goto            14
		return i;
	//   26   63:iload_1         
	//   27   64:ireturn         
	}

	public final boolean isMutable()
	{
		return zzdpi;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean zzdpi>
	//    2    4:ireturn         
	}

	public final Object put(Object obj, Object obj1)
	{
		zzaed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzaed()>
		zzbbq.checkNotNull(obj);
	//    2    4:aload_1         
	//    3    5:invokestatic    #121 <Method Object zzbbq.checkNotNull(Object)>
	//    4    8:pop             
		zzbbq.checkNotNull(obj1);
	//    5    9:aload_2         
	//    6   10:invokestatic    #121 <Method Object zzbbq.checkNotNull(Object)>
	//    7   13:pop             
		return super.put(obj, obj1);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #123 <Method Object LinkedHashMap.put(Object, Object)>
	//   12   20:areturn         
	}

	public final void putAll(Map map)
	{
		zzaed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzaed()>
		Object obj;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zzbbq.checkNotNull(map.get(obj)))
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #128 <Method Set Map.keySet()>
	//*   4   10:invokeinterface #82  <Method Iterator Set.iterator()>
	//*   5   15:astore_2        
	//*   6   16:aload_2         
	//*   7   17:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*   8   22:ifeq            51
		{
			obj = iterator.next();
	//    9   25:aload_2         
	//   10   26:invokeinterface #91  <Method Object Iterator.next()>
	//   11   31:astore_3        
			zzbbq.checkNotNull(obj);
	//   12   32:aload_3         
	//   13   33:invokestatic    #121 <Method Object zzbbq.checkNotNull(Object)>
	//   14   36:pop             
		}

	//   15   37:aload_1         
	//   16   38:aload_3         
	//   17   39:invokeinterface #106 <Method Object Map.get(Object)>
	//   18   44:invokestatic    #121 <Method Object zzbbq.checkNotNull(Object)>
	//   19   47:pop             
	//*  20   48:goto            16
		super.putAll(map);
	//   21   51:aload_0         
	//   22   52:aload_1         
	//   23   53:invokespecial   #130 <Method void LinkedHashMap.putAll(Map)>
	//   24   56:return          
	}

	public final Object remove(Object obj)
	{
		zzaed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzaed()>
		return super.remove(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #134 <Method Object LinkedHashMap.remove(Object)>
	//    5    9:areturn         
	}

	public final void zza(zzbco zzbco1)
	{
		zzaed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzaed()>
		if(!zzbco1.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #60  <Method boolean isEmpty()>
	//*   4    8:ifne            16
			putAll(((Map) (zzbco1)));
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #138 <Method void putAll(Map)>
	//    8   16:return          
	}

	public final void zzaaz()
	{
		zzdpi = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field boolean zzdpi>
	//    3    5:return          
	}

	public final zzbco zzaec()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #60  <Method boolean isEmpty()>
	//*   2    4:ifeq            15
			return new zzbco();
	//    3    7:new             #2   <Class zzbco>
	//    4   10:dup             
	//    5   11:invokespecial   #14  <Method void zzbco()>
	//    6   14:areturn         
		else
			return new zzbco(((Map) (this)));
	//    7   15:new             #2   <Class zzbco>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #142 <Method void zzbco(Map)>
	//   11   23:areturn         
	}

	private static final zzbco zzdwc;
	private boolean zzdpi;

	static 
	{
		zzbco zzbco1 = new zzbco();
	//    0    0:new             #2   <Class zzbco>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void zzbco()>
	//    3    7:astore_0        
		zzdwc = zzbco1;
	//    4    8:aload_0         
	//    5    9:putstatic       #16  <Field zzbco zzdwc>
		zzbco1.zzdpi = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #18  <Field boolean zzdpi>
	//*   9   17:return          
	}
}
