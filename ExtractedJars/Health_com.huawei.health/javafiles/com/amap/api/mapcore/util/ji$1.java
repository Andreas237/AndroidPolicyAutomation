// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			kk, ji, gn, jj, 
//			jk

class ji$1 extends kk
{

	public void runTask()
	{
		try
		{
			jl jl = c.b(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ji c>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field jj a>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #23  <Method jl ji.b(jj, boolean)>
	//    6   12:astore_1        
			ji.a(c, jl, b);
	//    7   13:aload_0         
	//    8   14:getfield        #18  <Field ji c>
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #25  <Field jk b>
	//   12   22:invokestatic    #28  <Method void ji.a(ji, jl, jk)>
			return;
	//   13   25:return          
		}
		catch(gn gn1)
	//*  14   26:astore_1        
		{
			ji.a(c, gn1, b);
	//   15   27:aload_0         
	//   16   28:getfield        #18  <Field ji c>
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #25  <Field jk b>
	//   20   36:invokestatic    #31  <Method void ji.a(ji, gn, jk)>
		}
	//   21   39:return          
	}

	final jj a;
	final jk b;
	final ji c;
}
