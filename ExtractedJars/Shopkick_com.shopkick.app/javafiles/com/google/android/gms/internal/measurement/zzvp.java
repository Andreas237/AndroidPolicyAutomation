// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzuq, zzur

public final class zzvp extends LinkedHashMap
{

	private zzvp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void LinkedHashMap()>
		zzbtl = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #18  <Field boolean zzbtl>
	//    5    9:return          
	}

	private zzvp(Map map)
	{
		super(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void LinkedHashMap(Map)>
		zzbtl = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #18  <Field boolean zzbtl>
	//    6   10:return          
	}

	private static int zzab(Object obj)
	{
		if(obj instanceof byte[])
	//*   0    0:aload_0         
	//*   1    1:instanceof      #29  <Class byte[]>
	//*   2    4:ifeq            15
			return zzuq.hashCode((byte[])obj);
	//    3    7:aload_0         
	//    4    8:checkcast       #29  <Class byte[]>
	//    5   11:invokestatic    #35  <Method int zzuq.hashCode(byte[])>
	//    6   14:ireturn         
		if(!(obj instanceof zzur))
	//*   7   15:aload_0         
	//*   8   16:instanceof      #37  <Class zzur>
	//*   9   19:ifne            27
			return obj.hashCode();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #42  <Method int Object.hashCode()>
	//   12   26:ireturn         
		else
			throw new UnsupportedOperationException();
	//   13   27:new             #44  <Class UnsupportedOperationException>
	//   14   30:dup             
	//   15   31:invokespecial   #45  <Method void UnsupportedOperationException()>
	//   16   34:athrow          
	}

	public static zzvp zzxg()
	{
		return zzcal;
	//    0    0:getstatic       #16  <Field zzvp zzcal>
	//    1    3:areturn         
	}

	private final void zzxi()
	{
		if(zzbtl)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field boolean zzbtl>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new UnsupportedOperationException();
	//    4    8:new             #44  <Class UnsupportedOperationException>
	//    5   11:dup             
	//    6   12:invokespecial   #45  <Method void UnsupportedOperationException()>
	//    7   15:athrow          
	}

	public final void clear()
	{
		zzxi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzxi()>
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
label0:
		{
			boolean flag;
label1:
			{
label2:
				{
					if(!(obj instanceof Map))
						break label0;
	//    0    0:aload_1         
	//    1    1:instanceof      #72  <Class Map>
	//    2    4:ifeq            175
					obj = ((Object) ((Map)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #72  <Class Map>
	//    5   11:astore_1        
					if(this == obj)
						break label2;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:if_acmpeq       167
					if(((Map)this).size() != ((Map) (obj)).size())
	//*   9   17:aload_0         
	//*  10   18:invokeinterface #75  <Method int Map.size()>
	//*  11   23:aload_1         
	//*  12   24:invokeinterface #75  <Method int Map.size()>
	//*  13   29:icmpeq          37
					{
						flag = false;
	//   14   32:iconst_0        
	//   15   33:istore_2        
						break label1;
	//   16   34:goto            169
					}
					Iterator iterator = ((Map)this).entrySet().iterator();
	//   17   37:aload_0         
	//   18   38:invokeinterface #76  <Method Set Map.entrySet()>
	//   19   43:invokeinterface #82  <Method Iterator Set.iterator()>
	//   20   48:astore          4
					boolean flag1;
					do
					{
						if(!iterator.hasNext())
							break label2;
	//   21   50:aload           4
	//   22   52:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   23   57:ifeq            167
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
	//*  32   85:ifne            93
						{
							flag = false;
	//   33   88:iconst_0        
	//   34   89:istore_2        
							break label1;
	//   35   90:goto            169
						}
						Object obj1 = ((java.util.Map.Entry) (obj2)).getValue();
	//   36   93:aload           6
	//   37   95:invokeinterface #102 <Method Object java.util.Map$Entry.getValue()>
	//   38  100:astore          5
						obj2 = ((Map) (obj)).get(((java.util.Map.Entry) (obj2)).getKey());
	//   39  102:aload_1         
	//   40  103:aload           6
	//   41  105:invokeinterface #96  <Method Object java.util.Map$Entry.getKey()>
	//   42  110:invokeinterface #106 <Method Object Map.get(Object)>
	//   43  115:astore          6
						if((obj1 instanceof byte[]) && (obj2 instanceof byte[]))
	//*  44  117:aload           5
	//*  45  119:instanceof      #29  <Class byte[]>
	//*  46  122:ifeq            150
	//*  47  125:aload           6
	//*  48  127:instanceof      #29  <Class byte[]>
	//*  49  130:ifeq            150
							flag1 = Arrays.equals((byte[])obj1, (byte[])obj2);
	//   50  133:aload           5
	//   51  135:checkcast       #29  <Class byte[]>
	//   52  138:aload           6
	//   53  140:checkcast       #29  <Class byte[]>
	//   54  143:invokestatic    #111 <Method boolean Arrays.equals(byte[], byte[])>
	//   55  146:istore_3        
						else
	//*  56  147:goto            158
							flag1 = obj1.equals(obj2);
	//   57  150:aload           5
	//   58  152:aload           6
	//   59  154:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//   60  157:istore_3        
					} while(flag1);
	//   61  158:iload_3         
	//   62  159:ifne            50
					flag = false;
	//   63  162:iconst_0        
	//   64  163:istore_2        
					break label1;
	//   65  164:goto            169
				}
				flag = true;
	//   66  167:iconst_1        
	//   67  168:istore_2        
			}
			if(flag)
	//*  68  169:iload_2         
	//*  69  170:ifeq            175
				return true;
	//   70  173:iconst_1        
	//   71  174:ireturn         
		}
		return false;
	//   72  175:iconst_0        
	//   73  176:ireturn         
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
		for(i = 0; iterator.hasNext(); i += zzab(entry.getValue()) ^ j)
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
			j = zzab(entry.getKey());
	//   13   34:aload           4
	//   14   36:invokeinterface #96  <Method Object java.util.Map$Entry.getKey()>
	//   15   41:invokestatic    #115 <Method int zzab(Object)>
	//   16   44:istore_2        
		}

	//   17   45:iload_1         
	//   18   46:aload           4
	//   19   48:invokeinterface #102 <Method Object java.util.Map$Entry.getValue()>
	//   20   53:invokestatic    #115 <Method int zzab(Object)>
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
		return zzbtl;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field boolean zzbtl>
	//    2    4:ireturn         
	}

	public final Object put(Object obj, Object obj1)
	{
		zzxi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzxi()>
		zzuq.checkNotNull(obj);
	//    2    4:aload_1         
	//    3    5:invokestatic    #121 <Method Object zzuq.checkNotNull(Object)>
	//    4    8:pop             
		zzuq.checkNotNull(obj1);
	//    5    9:aload_2         
	//    6   10:invokestatic    #121 <Method Object zzuq.checkNotNull(Object)>
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
		zzxi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzxi()>
		Object obj;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zzuq.checkNotNull(map.get(obj)))
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
			zzuq.checkNotNull(obj);
	//   12   32:aload_3         
	//   13   33:invokestatic    #121 <Method Object zzuq.checkNotNull(Object)>
	//   14   36:pop             
		}

	//   15   37:aload_1         
	//   16   38:aload_3         
	//   17   39:invokeinterface #106 <Method Object Map.get(Object)>
	//   18   44:invokestatic    #121 <Method Object zzuq.checkNotNull(Object)>
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
		zzxi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzxi()>
		return super.remove(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #134 <Method Object LinkedHashMap.remove(Object)>
	//    5    9:areturn         
	}

	public final void zza(zzvp zzvp1)
	{
		zzxi();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void zzxi()>
		if(!zzvp1.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #60  <Method boolean isEmpty()>
	//*   4    8:ifne            16
			putAll(((Map) (zzvp1)));
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #138 <Method void putAll(Map)>
	//    8   16:return          
	}

	public final void zzsw()
	{
		zzbtl = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field boolean zzbtl>
	//    3    5:return          
	}

	public final zzvp zzxh()
	{
		if(isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #60  <Method boolean isEmpty()>
	//*   2    4:ifeq            15
			return new zzvp();
	//    3    7:new             #2   <Class zzvp>
	//    4   10:dup             
	//    5   11:invokespecial   #14  <Method void zzvp()>
	//    6   14:areturn         
		else
			return new zzvp(((Map) (this)));
	//    7   15:new             #2   <Class zzvp>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #142 <Method void zzvp(Map)>
	//   11   23:areturn         
	}

	private static final zzvp zzcal;
	private boolean zzbtl;

	static 
	{
		zzvp zzvp1 = new zzvp();
	//    0    0:new             #2   <Class zzvp>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void zzvp()>
	//    3    7:astore_0        
		zzcal = zzvp1;
	//    4    8:aload_0         
	//    5    9:putstatic       #16  <Field zzvp zzcal>
		zzvp1.zzbtl = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #18  <Field boolean zzbtl>
	//*   9   17:return          
	}
}
