// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import java.util.Comparator;

final class ColorCutQuantizer$1
	implements Comparator
{

	public int compare(ox ox, ox ox1)
	{
		return ox1.getVolume() - ox.getVolume();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #19  <Method int ColorCutQuantizer$Vbox.getVolume()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #19  <Method int ColorCutQuantizer$Vbox.getVolume()>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((ox)obj, (ox)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #15  <Class ColorCutQuantizer$Vbox>
	//    3    5:aload_2         
	//    4    6:checkcast       #15  <Class ColorCutQuantizer$Vbox>
	//    5    9:invokevirtual   #22  <Method int compare(ColorCutQuantizer$Vbox, ColorCutQuantizer$Vbox)>
	//    6   12:ireturn         
	}

	ColorCutQuantizer$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
