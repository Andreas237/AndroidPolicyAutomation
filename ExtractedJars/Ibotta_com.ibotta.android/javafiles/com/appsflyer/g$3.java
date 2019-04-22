// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.os.Handler;

// Referenced classes of package com.appsflyer:
//			g

final class g$3
	implements Runnable
{

	public final void run()
	{
		synchronized(_fld02CF._fld02CB)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field g _fld02CF>
	//*   2    4:getfield        #23  <Field Object g._fld02CB>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			_fld02CF._mth02CA();
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field g _fld02CF>
	//    8   14:invokevirtual   #26  <Method void g._mth02CA()>
			_fld02CF._fld02CF.postDelayed(_fld02CF._fld02CE, 500L);
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field g _fld02CF>
	//   11   21:getfield        #29  <Field Handler g._fld02CF>
	//   12   24:aload_0         
	//   13   25:getfield        #14  <Field g _fld02CF>
	//   14   28:getfield        #33  <Field Runnable g._fld02CE>
	//   15   31:ldc2w           #34  <Long 500L>
	//   16   34:invokevirtual   #41  <Method boolean Handler.postDelayed(Runnable, long)>
	//   17   37:pop             
			_fld02CF._fld02CA = true;
	//   18   38:aload_0         
	//   19   39:getfield        #14  <Field g _fld02CF>
	//   20   42:iconst_1        
	//   21   43:putfield        #44  <Field boolean g._fld02CA>
		}
	//   22   46:aload_1         
	//   23   47:monitorexit     
	//   24   48:return          
	//   25   49:astore_2        
	//   26   50:aload_1         
	//   27   51:monitorexit     
	//   28   52:aload_2         
	//   29   53:athrow          
	}

	private g _fld02CF;

	g$3(g g1)
	{
		_fld02CF = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field g _fld02CF>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
