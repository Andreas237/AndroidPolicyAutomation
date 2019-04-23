// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import android.arch.core.util.Function;
import java.util.*;

// Referenced classes of package androidx.work.impl.model:
//			WorkSpec

static final class WorkSpec$1
	implements Function
{

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((List)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class List>
	//    3    5:invokevirtual   #21  <Method List apply(List)>
	//    4    8:areturn         
	}

	public List apply(List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		ArrayList arraylist = new ArrayList(list.size());
	//    4    6:new             #23  <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokeinterface #27  <Method int List.size()>
	//    8   16:invokespecial   #30  <Method void ArrayList(int)>
	//    9   19:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (((rkInfoPojo)((Iterator) (list)).next()).toWorkInfo()))));
	//   10   20:aload_1         
	//   11   21:invokeinterface #34  <Method Iterator List.iterator()>
	//   12   26:astore_1        
	//   13   27:aload_1         
	//   14   28:invokeinterface #40  <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            58
	//   16   36:aload_2         
	//   17   37:aload_1         
	//   18   38:invokeinterface #44  <Method Object Iterator.next()>
	//   19   43:checkcast       #46  <Class WorkSpec$WorkInfoPojo>
	//   20   46:invokevirtual   #50  <Method androidx.work.WorkInfo WorkSpec$WorkInfoPojo.toWorkInfo()>
	//   21   49:invokeinterface #54  <Method boolean List.add(Object)>
	//   22   54:pop             
	//*  23   55:goto            27
		return ((List) (arraylist));
	//   24   58:aload_2         
	//   25   59:areturn         
	}

	WorkSpec$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
