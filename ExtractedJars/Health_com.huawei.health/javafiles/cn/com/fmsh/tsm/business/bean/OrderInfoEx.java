// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			OrderChiefInfo

public class OrderInfoEx
{

	public OrderInfoEx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		orderChiefInfos = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field List orderChiefInfos>
	//    7   15:return          
	}

	public void AddOrderChiefInfo(OrderChiefInfo orderchiefinfo)
	{
		orderChiefInfos.add(((Object) (orderchiefinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List orderChiefInfos>
	//    2    4:aload_1         
	//    3    5:invokeinterface #27  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public OrderChiefInfo[] getOrderChiefInfos()
	{
		return (OrderChiefInfo[])orderChiefInfos.toArray(((Object []) (new OrderChiefInfo[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field List orderChiefInfos>
	//    2    4:iconst_0        
	//    3    5:anewarray       OrderChiefInfo[]
	//    4    8:invokeinterface #35  <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #37  <Class OrderChiefInfo[]>
	//    6   16:areturn         
	}

	public String getTn()
	{
		return tn;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String tn>
	//    2    4:areturn         
	}

	public void setTn(String s)
	{
		tn = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String tn>
	//    3    5:return          
	}

	private List orderChiefInfos;
	private String tn;
}
