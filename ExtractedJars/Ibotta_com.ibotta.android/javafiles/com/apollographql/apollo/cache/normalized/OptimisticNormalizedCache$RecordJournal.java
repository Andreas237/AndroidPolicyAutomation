// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import java.util.*;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			OptimisticNormalizedCache, Record

private static final class OptimisticNormalizedCache$RecordJournal
{

	Set commit(Record record)
	{
		List list = history;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field List history>
	//    2    4:astore_2        
		list.add(list.size(), ((Object) (record.clone())));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokeinterface #43  <Method int List.size()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #28  <Method Record Record.clone()>
	//    8   16:invokeinterface #46  <Method void List.add(int, Object)>
		return snapshot.mergeWith(record);
	//    9   21:aload_0         
	//   10   22:getfield        #30  <Field Record snapshot>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #49  <Method Set Record.mergeWith(Record)>
	//   13   29:areturn         
	}

	Set revert(UUID uuid)
	{
		int i;
label0:
		{
			for(i = 0; i < history.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #22  <Field List history>
	//*   5    7:invokeinterface #43  <Method int List.size()>
	//*   6   12:icmpge          48
				if(uuid.equals(((Object) (((Record)history.get(i)).mutationId()))))
	//*   7   15:aload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #22  <Field List history>
	//*  10   20:iload_2         
	//*  11   21:invokeinterface #57  <Method Object List.get(int)>
	//*  12   26:checkcast       #24  <Class Record>
	//*  13   29:invokevirtual   #61  <Method UUID Record.mutationId()>
	//*  14   32:invokevirtual   #66  <Method boolean UUID.equals(Object)>
	//*  15   35:ifeq            41
					break label0;
	//   16   38:goto            50

	//   17   41:iload_2         
	//   18   42:iconst_1        
	//   19   43:iadd            
	//   20   44:istore_2        
	//*  21   45:goto            2
			i = -1;
	//   22   48:iconst_m1       
	//   23   49:istore_2        
		}
		if(i == -1)
	//*  24   50:iload_2         
	//*  25   51:iconst_m1       
	//*  26   52:icmpne          59
			return Collections.emptySet();
	//   27   55:invokestatic    #72  <Method Set Collections.emptySet()>
	//   28   58:areturn         
		uuid = ((UUID) (new HashSet()));
	//   29   59:new             #74  <Class HashSet>
	//   30   62:dup             
	//   31   63:invokespecial   #75  <Method void HashSet()>
	//   32   66:astore_1        
		((Set) (uuid)).add(((Object) (((Record)history.remove(i)).key())));
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:getfield        #22  <Field List history>
	//   36   72:iload_2         
	//   37   73:invokeinterface #78  <Method Object List.remove(int)>
	//   38   78:checkcast       #24  <Class Record>
	//   39   81:invokevirtual   #82  <Method String Record.key()>
	//   40   84:invokeinterface #85  <Method boolean Set.add(Object)>
	//   41   89:pop             
		int k = i - 1;
	//   42   90:iload_2         
	//   43   91:iconst_1        
	//   44   92:isub            
	//   45   93:istore_3        
		for(int j = Math.max(0, k); j < history.size(); j++)
	//*  46   94:iconst_0        
	//*  47   95:iload_3         
	//*  48   96:invokestatic    #91  <Method int Math.max(int, int)>
	//*  49   99:istore_2        
	//*  50  100:iload_2         
	//*  51  101:aload_0         
	//*  52  102:getfield        #22  <Field List history>
	//*  53  105:invokeinterface #43  <Method int List.size()>
	//*  54  110:icmpge          172
		{
			Record record = (Record)history.get(j);
	//   55  113:aload_0         
	//   56  114:getfield        #22  <Field List history>
	//   57  117:iload_2         
	//   58  118:invokeinterface #57  <Method Object List.get(int)>
	//   59  123:checkcast       #24  <Class Record>
	//   60  126:astore          4
			if(j == Math.max(0, k))
	//*  61  128:iload_2         
	//*  62  129:iconst_0        
	//*  63  130:iload_3         
	//*  64  131:invokestatic    #91  <Method int Math.max(int, int)>
	//*  65  134:icmpne          149
				snapshot = record.clone();
	//   66  137:aload_0         
	//   67  138:aload           4
	//   68  140:invokevirtual   #28  <Method Record Record.clone()>
	//   69  143:putfield        #30  <Field Record snapshot>
			else
	//*  70  146:goto            165
				((Set) (uuid)).addAll(((java.util.Collection) (snapshot.mergeWith(record))));
	//   71  149:aload_1         
	//   72  150:aload_0         
	//   73  151:getfield        #30  <Field Record snapshot>
	//   74  154:aload           4
	//   75  156:invokevirtual   #49  <Method Set Record.mergeWith(Record)>
	//   76  159:invokeinterface #95  <Method boolean Set.addAll(java.util.Collection)>
	//   77  164:pop             
		}

	//   78  165:iload_2         
	//   79  166:iconst_1        
	//   80  167:iadd            
	//   81  168:istore_2        
	//*  82  169:goto            100
		return ((Set) (uuid));
	//   83  172:aload_1         
	//   84  173:areturn         
	}

	final List history = new ArrayList();
	Record snapshot;

	OptimisticNormalizedCache$RecordJournal(Record record)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayList()>
	//    6   12:putfield        #22  <Field List history>
		snapshot = record.clone();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #28  <Method Record Record.clone()>
	//   10   20:putfield        #30  <Field Record snapshot>
		history.add(((Object) (record.clone())));
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field List history>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #28  <Method Record Record.clone()>
	//   15   31:invokeinterface #36  <Method boolean List.add(Object)>
	//   16   36:pop             
	//   17   37:return          
	}
}
