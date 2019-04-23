// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import android.arch.core.util.Function;
import androidx.work.WorkInfo;
import java.util.List;

// Referenced classes of package androidx.work.impl:
//			WorkManagerImpl

class WorkManagerImpl$2
	implements Function
{

	public WorkInfo apply(List list)
	{
		if(list != null && list.size() > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #30  <Method int List.size()>
	//*   4   10:ifle            27
			return ((androidx.work.impl.model.ojo)list.get(0)).toWorkInfo();
	//    5   13:aload_1         
	//    6   14:iconst_0        
	//    7   15:invokeinterface #34  <Method Object List.get(int)>
	//    8   20:checkcast       #36  <Class androidx.work.impl.model.WorkSpec$WorkInfoPojo>
	//    9   23:invokevirtual   #40  <Method WorkInfo androidx.work.impl.model.WorkSpec$WorkInfoPojo.toWorkInfo()>
	//   10   26:areturn         
		else
			return null;
	//   11   27:aconst_null     
	//   12   28:areturn         
	}

	public volatile Object apply(Object obj)
	{
		return ((Object) (apply((List)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class List>
	//    3    5:invokevirtual   #45  <Method WorkInfo apply(List)>
	//    4    8:areturn         
	}

	final WorkManagerImpl this$0;

	WorkManagerImpl$2()
	{
		this$0 = WorkManagerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field WorkManagerImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
