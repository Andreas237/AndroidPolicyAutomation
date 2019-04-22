// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.api.internal.Function;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			OptimisticNormalizedCache, Record

class OptimisticNormalizedCache$2
	implements Function
{

	public Record apply(Record record)
	{
		record = record.clone();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method Record Record.clone()>
	//    2    4:astore_1        
		record.mergeWith(val$journal.snapshot);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field OptimisticNormalizedCache$RecordJournal val$journal>
	//    6   10:getfield        #41  <Field Record OptimisticNormalizedCache$RecordJournal.snapshot>
	//    7   13:invokevirtual   #45  <Method java.util.Set Record.mergeWith(Record)>
	//    8   16:pop             
		return record;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((Record)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class Record>
	//    3    5:invokevirtual   #50  <Method Record apply(Record)>
	//    4    8:areturn         
	}

	final OptimisticNormalizedCache this$0;
	final cordJournal val$journal;

	OptimisticNormalizedCache$2()
	{
		this$0 = final_optimisticnormalizedcache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field OptimisticNormalizedCache this$0>
		val$journal = cordJournal.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field OptimisticNormalizedCache$RecordJournal val$journal>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
