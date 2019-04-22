// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.os.Handler;

// Referenced classes of package com.appsflyer:
//			g

final class g$4
	implements Runnable
{

	public final void run()
	{
		synchronized(_fld02CA._fld02CB)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field g _fld02CA>
	//*   2    4:getfield        #23  <Field Object g._fld02CB>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			if(_fld02CA._fld02CA)
	//*   6   10:aload_0         
	//*   7   11:getfield        #14  <Field g _fld02CA>
	//*   8   14:getfield        #26  <Field boolean g._fld02CA>
	//*   9   17:ifeq            69
			{
				_fld02CA._fld02CF.removeCallbacks(_fld02CA._fld0971);
	//   10   20:aload_0         
	//   11   21:getfield        #14  <Field g _fld02CA>
	//   12   24:getfield        #30  <Field Handler g._fld02CF>
	//   13   27:aload_0         
	//   14   28:getfield        #14  <Field g _fld02CA>
	//   15   31:getfield        #34  <Field Runnable g._fld0971>
	//   16   34:invokevirtual   #40  <Method void Handler.removeCallbacks(Runnable)>
				_fld02CA._fld02CF.removeCallbacks(_fld02CA._fld02CE);
	//   17   37:aload_0         
	//   18   38:getfield        #14  <Field g _fld02CA>
	//   19   41:getfield        #30  <Field Handler g._fld02CF>
	//   20   44:aload_0         
	//   21   45:getfield        #14  <Field g _fld02CA>
	//   22   48:getfield        #43  <Field Runnable g._fld02CE>
	//   23   51:invokevirtual   #40  <Method void Handler.removeCallbacks(Runnable)>
				_fld02CA._mth02CF();
	//   24   54:aload_0         
	//   25   55:getfield        #14  <Field g _fld02CA>
	//   26   58:invokevirtual   #45  <Method void g._mth02CF()>
				_fld02CA._fld02CA = false;
	//   27   61:aload_0         
	//   28   62:getfield        #14  <Field g _fld02CA>
	//   29   65:iconst_0        
	//   30   66:putfield        #26  <Field boolean g._fld02CA>
			}
		}
	//   31   69:aload_1         
	//   32   70:monitorexit     
	//   33   71:return          
	//   34   72:astore_2        
	//   35   73:aload_1         
	//   36   74:monitorexit     
	//   37   75:aload_2         
	//   38   76:athrow          
	}

	private g _fld02CA;

	g$4(g g1)
	{
		_fld02CA = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field g _fld02CA>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
