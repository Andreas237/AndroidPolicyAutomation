// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;


// Referenced classes of package com.appscend.mraid:
//			MadvertiseMraidView

class MadvertiseMraidView$4
	implements Runnable
{

	public void run()
	{
		MadvertiseMraidView madvertisemraidview = MadvertiseMraidView.this;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field MadvertiseMraidView this$0>
	//    2    4:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #28  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void StringBuilder()>
	//    6   12:astore_2        
		stringbuilder.append("javascript:");
	//    7   13:aload_2         
	//    8   14:ldc1            #31  <String "javascript:">
	//    9   16:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		stringbuilder.append(val$jsCode);
	//   11   20:aload_2         
	//   12   21:aload_0         
	//   13   22:getfield        #21  <Field String val$jsCode>
	//   14   25:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		madvertisemraidview.loadUrl(stringbuilder.toString());
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   19   34:invokevirtual   #42  <Method void MadvertiseMraidView.loadUrl(String)>
	//   20   37:return          
	}

	final MadvertiseMraidView this$0;
	final String val$jsCode;

	MadvertiseMraidView$4()
	{
		this$0 = final_madvertisemraidview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MadvertiseMraidView this$0>
		val$jsCode = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$jsCode>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
