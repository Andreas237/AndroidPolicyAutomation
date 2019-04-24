// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.amap.api.mapcore.util:
//			ed

class ed$2 extends ed$a
{

	public Object call()
		throws Exception
	{
		ed.a(a).set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ed a>
	//    2    4:invokestatic    #26  <Method AtomicBoolean ed.a(ed)>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #32  <Method void AtomicBoolean.set(boolean)>
		Process.setThreadPriority(10);
	//    5   11:bipush          10
	//    6   13:invokestatic    #38  <Method void Process.setThreadPriority(int)>
		return ed.a(a, a.a(b));
	//    7   16:aload_0         
	//    8   17:getfield        #15  <Field ed a>
	//    9   20:aload_0         
	//   10   21:getfield        #15  <Field ed a>
	//   11   24:aload_0         
	//   12   25:getfield        #42  <Field Object[] b>
	//   13   28:invokevirtual   #45  <Method Object ed.a(Object[])>
	//   14   31:invokestatic    #48  <Method Object ed.a(ed, Object)>
	//   15   34:areturn         
	}

	final ed a;

	ed$2(ed ed1)
	{
		a = ed1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ed a>
		super(((ed$1) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #18  <Method void ed$a(ed$1)>
	//    6   10:return          
	}
}
