// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.util.*;

// Referenced classes of package com.itextpdf.text:
//			TabStop

public class TabSettings
{

	public TabSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		tabStops = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List tabStops>
		tabInterval = 36F;
	//    7   15:aload_0         
	//    8   16:ldc1            #7   <Float 36F>
	//    9   18:putfield        #22  <Field float tabInterval>
	//   10   21:return          
	}

	public TabSettings(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		tabStops = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List tabStops>
		tabInterval = 36F;
	//    7   15:aload_0         
	//    8   16:ldc1            #7   <Float 36F>
	//    9   18:putfield        #22  <Field float tabInterval>
		tabInterval = f;
	//   10   21:aload_0         
	//   11   22:fload_1         
	//   12   23:putfield        #22  <Field float tabInterval>
	//   13   26:return          
	}

	public TabSettings(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		tabStops = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List tabStops>
		tabInterval = 36F;
	//    7   15:aload_0         
	//    8   16:ldc1            #7   <Float 36F>
	//    9   18:putfield        #22  <Field float tabInterval>
		tabStops = list;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #20  <Field List tabStops>
	//   13   26:return          
	}

	public TabSettings(List list, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		tabStops = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List tabStops>
		tabInterval = 36F;
	//    7   15:aload_0         
	//    8   16:ldc1            #7   <Float 36F>
	//    9   18:putfield        #22  <Field float tabInterval>
		tabStops = list;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #20  <Field List tabStops>
		tabInterval = f;
	//   13   26:aload_0         
	//   14   27:fload_2         
	//   15   28:putfield        #22  <Field float tabInterval>
	//   16   31:return          
	}

	public static TabStop getTabStopNewInstance(float f, TabSettings tabsettings)
	{
		if(tabsettings != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			return tabsettings.getTabStopNewInstance(f);
	//    2    4:aload_1         
	//    3    5:fload_0         
	//    4    6:invokevirtual   #34  <Method TabStop getTabStopNewInstance(float)>
	//    5    9:areturn         
		else
			return TabStop.newInstance(f, 36F);
	//    6   10:fload_0         
	//    7   11:ldc1            #7   <Float 36F>
	//    8   13:invokestatic    #40  <Method TabStop TabStop.newInstance(float, float)>
	//    9   16:areturn         
	}

	public float getTabInterval()
	{
		return tabInterval;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float tabInterval>
	//    2    4:freturn         
	}

	public TabStop getTabStopNewInstance(float f)
	{
		TabStop tabstop;
label0:
		{
			Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
			tabstop = ((TabStop) (obj));
	//    2    2:aload_3         
	//    3    3:astore_2        
			if(tabStops == null)
				break label0;
	//    4    4:aload_0         
	//    5    5:getfield        #20  <Field List tabStops>
	//    6    8:ifnull          68
			Iterator iterator = tabStops.iterator();
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field List tabStops>
	//    9   15:invokeinterface #48  <Method Iterator List.iterator()>
	//   10   20:astore          4
			do
			{
				tabstop = ((TabStop) (obj));
	//   11   22:aload_3         
	//   12   23:astore_2        
				if(!iterator.hasNext())
					break label0;
	//   13   24:aload           4
	//   14   26:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//   15   31:ifeq            68
				tabstop = (TabStop)iterator.next();
	//   16   34:aload           4
	//   17   36:invokeinterface #58  <Method Object Iterator.next()>
	//   18   41:checkcast       #36  <Class TabStop>
	//   19   44:astore_2        
			} while((double)(tabstop.getPosition() - f) <= 0.001D);
	//   20   45:aload_2         
	//   21   46:invokevirtual   #61  <Method float TabStop.getPosition()>
	//   22   49:fload_1         
	//   23   50:fsub            
	//   24   51:f2d             
	//   25   52:ldc2w           #62  <Double 0.001D>
	//   26   55:dcmpl           
	//   27   56:ifle            22
			tabstop = new TabStop(tabstop);
	//   28   59:new             #36  <Class TabStop>
	//   29   62:dup             
	//   30   63:aload_2         
	//   31   64:invokespecial   #66  <Method void TabStop(TabStop)>
	//   32   67:astore_2        
		}
		TabStop tabstop1 = tabstop;
	//   33   68:aload_2         
	//   34   69:astore_3        
		if(tabstop == null)
	//*  35   70:aload_2         
	//*  36   71:ifnonnull       83
			tabstop1 = TabStop.newInstance(f, tabInterval);
	//   37   74:fload_1         
	//   38   75:aload_0         
	//   39   76:getfield        #22  <Field float tabInterval>
	//   40   79:invokestatic    #40  <Method TabStop TabStop.newInstance(float, float)>
	//   41   82:astore_3        
		return tabstop1;
	//   42   83:aload_3         
	//   43   84:areturn         
	}

	public List getTabStops()
	{
		return tabStops;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List tabStops>
	//    2    4:areturn         
	}

	public void setTabInterval(float f)
	{
		tabInterval = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #22  <Field float tabInterval>
	//    3    5:return          
	}

	public void setTabStops(List list)
	{
		tabStops = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field List tabStops>
	//    3    5:return          
	}

	public static final float DEFAULT_TAB_INTERVAL = 36F;
	private float tabInterval;
	private List tabStops;
}
