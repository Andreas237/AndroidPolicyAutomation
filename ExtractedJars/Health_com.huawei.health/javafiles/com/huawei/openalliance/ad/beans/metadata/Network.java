// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import android.content.Context;
import com.huawei.openalliance.ad.utils.w;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.huawei.openalliance.ad.beans.metadata:
//			CellInfo

public class Network
{

	public Network()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		type__ = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int type__>
		cellInfo__ = ((List) (new ArrayList(4)));
	//    5    9:aload_0         
	//    6   10:new             #18  <Class ArrayList>
	//    7   13:dup             
	//    8   14:iconst_4        
	//    9   15:invokespecial   #21  <Method void ArrayList(int)>
	//   10   18:putfield        #23  <Field List cellInfo__>
	//   11   21:return          
	}

	public Network(Context context, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		type__ = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int type__>
		cellInfo__ = ((List) (new ArrayList(4)));
	//    5    9:aload_0         
	//    6   10:new             #18  <Class ArrayList>
	//    7   13:dup             
	//    8   14:iconst_4        
	//    9   15:invokespecial   #21  <Method void ArrayList(int)>
	//   10   18:putfield        #23  <Field List cellInfo__>
		type__ = w.c(context);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #31  <Method int w.c(Context)>
	//   14   26:putfield        #16  <Field int type__>
		if(flag)
	//*  15   29:iload_2         
	//*  16   30:ifeq            66
		{
			context = ((Context) (w.e(context)));
	//   17   33:aload_1         
	//   18   34:invokestatic    #35  <Method android.util.Pair w.e(Context)>
	//   19   37:astore_1        
			if(context != null)
	//*  20   38:aload_1         
	//*  21   39:ifnull          66
			{
				CellInfo cellinfo = new CellInfo();
	//   22   42:new             #37  <Class CellInfo>
	//   23   45:dup             
	//   24   46:invokespecial   #38  <Method void CellInfo()>
	//   25   49:astore_3        
				cellinfo.loadCellInfo(((android.util.Pair) (context)));
	//   26   50:aload_3         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #42  <Method void CellInfo.loadCellInfo(android.util.Pair)>
				cellInfo__.add(((Object) (cellinfo)));
	//   29   55:aload_0         
	//   30   56:getfield        #23  <Field List cellInfo__>
	//   31   59:aload_3         
	//   32   60:invokeinterface #48  <Method boolean List.add(Object)>
	//   33   65:pop             
			}
		}
	//   34   66:return          
	}

	public List getCellInfo__()
	{
		return cellInfo__;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List cellInfo__>
	//    2    4:areturn         
	}

	public int getType__()
	{
		return type__;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int type__>
	//    2    4:ireturn         
	}

	public void setCellInfo__(List list)
	{
		cellInfo__ = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field List cellInfo__>
	//    3    5:return          
	}

	public void setType__(int i)
	{
		type__ = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field int type__>
	//    3    5:return          
	}

	private List cellInfo__;
	private int type__;
}
