// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.test;

import cn.com.fmsh.script.ApduFilterDataInit;
import cn.com.fmsh.script.core.FilterPolicy;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package cn.com.fmsh.script.test:
//			Test

class Test$FilterDataInit4Test
	implements ApduFilterDataInit
{

	public List getFilterPolicies()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #26  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void ArrayList()>
	//    3    7:astore_1        
		FilterPolicy filterpolicy = new FilterPolicy();
	//    4    8:new             #29  <Class FilterPolicy>
	//    5   11:dup             
	//    6   12:invokespecial   #30  <Method void FilterPolicy()>
	//    7   15:astore_2        
		filterpolicy.setCla((byte)0);
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #34  <Method void FilterPolicy.setCla(byte)>
		filterpolicy.setIns((byte)-92);
	//   11   21:aload_2         
	//   12   22:bipush          -92
	//   13   24:invokevirtual   #37  <Method void FilterPolicy.setIns(byte)>
		filterpolicy.addFilterData(new byte[0]);
	//   14   27:aload_2         
	//   15   28:iconst_0        
	//   16   29:newarray        byte[]
	//   17   31:invokevirtual   #41  <Method void FilterPolicy.addFilterData(byte[])>
		((List) (arraylist)).add(((Object) (filterpolicy)));
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokeinterface #47  <Method boolean List.add(Object)>
	//   21   41:pop             
		return ((List) (arraylist));
	//   22   42:aload_1         
	//   23   43:areturn         
	}

	final Test this$0;

	private Test$FilterDataInit4Test()
	{
		this$0 = Test.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Test this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	Test$FilterDataInit4Test(Test$FilterDataInit4Test test$filterdatainit4test)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void Test$FilterDataInit4Test(Test)>
	//    3    5:return          
	}
}
