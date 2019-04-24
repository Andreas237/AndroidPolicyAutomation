// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import com.comscore.utils.CacheFlusher;

// Referenced classes of package com.comscore.analytics:
//			Core

class t
	implements Runnable
{

	t(Core core, long l)
	{
		b = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Core b>
		a = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #16  <Field long a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public void run()
	{
		b.af = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Core b>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field long a>
	//    4    8:putfield        #26  <Field long Core.af>
		if(b.d != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #14  <Field Core b>
	//*   7   15:getfield        #30  <Field CacheFlusher Core.d>
	//*   8   18:ifnull          31
			b.d.update();
	//    9   21:aload_0         
	//   10   22:getfield        #14  <Field Core b>
	//   11   25:getfield        #30  <Field CacheFlusher Core.d>
	//   12   28:invokevirtual   #35  <Method void CacheFlusher.update()>
	//   13   31:return          
	}

	final long a;
	final Core b;
}
