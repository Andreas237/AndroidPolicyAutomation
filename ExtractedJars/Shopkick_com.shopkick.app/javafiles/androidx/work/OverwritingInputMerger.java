// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.util.*;

// Referenced classes of package androidx.work:
//			InputMerger, Data

public final class OverwritingInputMerger extends InputMerger
{

	public OverwritingInputMerger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void InputMerger()>
	//    2    4:return          
	}

	public Data merge(List list)
	{
		Data.Builder builder = new Data.Builder();
	//    0    0:new             #14  <Class Data$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void Data$Builder()>
	//    3    7:astore_2        
		HashMap hashmap = new HashMap();
	//    4    8:new             #17  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #18  <Method void HashMap()>
	//    7   15:astore_3        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((Map) (hashmap)).putAll(((Data)((Iterator) (list)).next()).getKeyValueMap()));
	//    8   16:aload_1         
	//    9   17:invokeinterface #24  <Method Iterator List.iterator()>
	//   10   22:astore_1        
	//   11   23:aload_1         
	//   12   24:invokeinterface #30  <Method boolean Iterator.hasNext()>
	//   13   29:ifeq            53
	//   14   32:aload_3         
	//   15   33:aload_1         
	//   16   34:invokeinterface #34  <Method Object Iterator.next()>
	//   17   39:checkcast       #36  <Class Data>
	//   18   42:invokevirtual   #40  <Method Map Data.getKeyValueMap()>
	//   19   45:invokeinterface #46  <Method void Map.putAll(Map)>
	//*  20   50:goto            23
		builder.putAll(((Map) (hashmap)));
	//   21   53:aload_2         
	//   22   54:aload_3         
	//   23   55:invokevirtual   #49  <Method Data$Builder Data$Builder.putAll(Map)>
	//   24   58:pop             
		return builder.build();
	//   25   59:aload_2         
	//   26   60:invokevirtual   #53  <Method Data Data$Builder.build()>
	//   27   63:areturn         
	}
}
