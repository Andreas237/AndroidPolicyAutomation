// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.zzi;
import java.util.*;

public final class zzz extends zzi
{

	public zzz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void zzi()>
		zzud = ((Map) (new HashMap(4)));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashMap>
	//    4    8:dup             
	//    5    9:iconst_4        
	//    6   10:invokespecial   #18  <Method void HashMap(int)>
	//    7   13:putfield        #20  <Field Map zzud>
	//    8   16:return          
	}

	public final String toString()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #15  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void HashMap()>
	//    3    7:astore_1        
		java.util.Map.Entry entry;
		StringBuilder stringbuilder;
		for(Iterator iterator = zzud.entrySet().iterator(); iterator.hasNext(); ((Map) (hashmap)).put(((Object) (stringbuilder.toString())), entry.getValue()))
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field Map zzud>
	//*   6   12:invokeinterface #30  <Method Set Map.entrySet()>
	//*   7   17:invokeinterface #36  <Method Iterator Set.iterator()>
	//*   8   22:astore_2        
	//*   9   23:aload_2         
	//*  10   24:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            110
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   12   32:aload_2         
	//   13   33:invokeinterface #46  <Method Object Iterator.next()>
	//   14   38:checkcast       #48  <Class java.util.Map$Entry>
	//   15   41:astore_3        
			String s = String.valueOf(entry.getKey());
	//   16   42:aload_3         
	//   17   43:invokeinterface #51  <Method Object java.util.Map$Entry.getKey()>
	//   18   48:invokestatic    #57  <Method String String.valueOf(Object)>
	//   19   51:astore          4
			stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 9);
	//   20   53:new             #59  <Class StringBuilder>
	//   21   56:dup             
	//   22   57:aload           4
	//   23   59:invokestatic    #57  <Method String String.valueOf(Object)>
	//   24   62:invokevirtual   #63  <Method int String.length()>
	//   25   65:bipush          9
	//   26   67:iadd            
	//   27   68:invokespecial   #64  <Method void StringBuilder(int)>
	//   28   71:astore          5
			stringbuilder.append("dimension");
	//   29   73:aload           5
	//   30   75:ldc1            #66  <String "dimension">
	//   31   77:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   32   80:pop             
			stringbuilder.append(s);
	//   33   81:aload           5
	//   34   83:aload           4
	//   35   85:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   36   88:pop             
		}

	//   37   89:aload_1         
	//   38   90:aload           5
	//   39   92:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   40   95:aload_3         
	//   41   96:invokeinterface #75  <Method Object java.util.Map$Entry.getValue()>
	//   42  101:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   43  106:pop             
	//*  44  107:goto            23
		return zza(((Object) (hashmap)));
	//   45  110:aload_1         
	//   46  111:invokestatic    #82  <Method String zza(Object)>
	//   47  114:areturn         
	}

	public final Map zzau()
	{
		return Collections.unmodifiableMap(zzud);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map zzud>
	//    2    4:invokestatic    #90  <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public final void zzb(zzi zzi1)
	{
		((zzz)zzi1).zzud.putAll(zzud);
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class zzz>
	//    2    4:getfield        #20  <Field Map zzud>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field Map zzud>
	//    5   11:invokeinterface #98  <Method void Map.putAll(Map)>
	//    6   16:return          
	}

	private Map zzud;
}
