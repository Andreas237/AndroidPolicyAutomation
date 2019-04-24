// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import com.autonavi.amap.mapcore.MapConfig;
import java.lang.ref.WeakReference;

// Referenced classes of package com.amap.api.mapcore.util:
//			h, s, ef

class h$a$1
	implements Runnable
{

	public void run()
	{
		if(a != null && a.getMapConfig() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field s a>
	//*   2    4:ifnull          88
	//*   3    7:aload_0         
	//*   4    8:getfield        #22  <Field s a>
	//*   5   11:invokeinterface #32  <Method MapConfig s.getMapConfig()>
	//*   6   16:ifnull          88
		{
			Object obj = ((Object) (a.getMapConfig()));
	//    7   19:aload_0         
	//    8   20:getfield        #22  <Field s a>
	//    9   23:invokeinterface #32  <Method MapConfig s.getMapConfig()>
	//   10   28:astore_1        
			((MapConfig) (obj)).setProFunctionAuthEnable(false);
	//   11   29:aload_1         
	//   12   30:iconst_0        
	//   13   31:invokevirtual   #38  <Method void MapConfig.setProFunctionAuthEnable(boolean)>
			if(((MapConfig) (obj)).isUseProFunction())
	//*  14   34:aload_1         
	//*  15   35:invokevirtual   #42  <Method boolean MapConfig.isUseProFunction()>
	//*  16   38:ifeq            88
			{
				a.a(((MapConfig) (obj)).isCustomStyleEnable(), true);
	//   17   41:aload_0         
	//   18   42:getfield        #22  <Field s a>
	//   19   45:aload_1         
	//   20   46:invokevirtual   #45  <Method boolean MapConfig.isCustomStyleEnable()>
	//   21   49:iconst_1        
	//   22   50:invokeinterface #48  <Method void s.a(boolean, boolean)>
				if(h.a.a(b) == null)
	//*  23   55:aload_0         
	//*  24   56:getfield        #20  <Field h$a b>
	//*  25   59:invokestatic    #51  <Method WeakReference h$a.a(h$a)>
	//*  26   62:ifnonnull       70
					obj = null;
	//   27   65:aconst_null     
	//   28   66:astore_1        
				else
	//*  29   67:goto            84
					obj = ((Object) ((Context)h.a.a(b).get()));
	//   30   70:aload_0         
	//   31   71:getfield        #20  <Field h$a b>
	//   32   74:invokestatic    #51  <Method WeakReference h$a.a(h$a)>
	//   33   77:invokevirtual   #57  <Method Object WeakReference.get()>
	//   34   80:checkcast       #59  <Class Context>
	//   35   83:astore_1        
				ef.a(((Context) (obj)));
	//   36   84:aload_1         
	//   37   85:invokestatic    #64  <Method void ef.a(Context)>
			}
		}
	//   38   88:return          
	}

	final s a;
	final h.a b;

	h$a$1(h.a a1, s s1)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field h$a b>
		a = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field s a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
