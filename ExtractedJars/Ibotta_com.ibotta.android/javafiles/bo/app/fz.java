// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.outgoing.AppboyProperties;

// Referenced classes of package bo.app:
//			fy, fs, cc

public abstract class fz extends fy
	implements fs
{

	protected fz(AppboyProperties appboyproperties, cc cc)
	{
		super(cc);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #13  <Method void fy(cc)>
		a = appboyproperties;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field AppboyProperties a>
	//    6   10:return          
	}

	public AppboyProperties f()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field AppboyProperties a>
	//    2    4:areturn         
	}

	private AppboyProperties a;
}
