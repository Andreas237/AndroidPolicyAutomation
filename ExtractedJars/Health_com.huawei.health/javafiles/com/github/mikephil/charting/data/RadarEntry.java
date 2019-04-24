// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;


// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public class RadarEntry extends Entry
{

	public RadarEntry(float f)
	{
		super(0.0F, f);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:invokespecial   #12  <Method void Entry(float, float)>
	//    4    6:return          
	}

	public RadarEntry(float f, Object obj)
	{
		super(0.0F, f, obj);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #17  <Method void Entry(float, float, Object)>
	//    5    7:return          
	}

	public volatile Entry copy()
	{
		return ((Entry) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method RadarEntry copy()>
	//    2    4:areturn         
	}

	public RadarEntry copy()
	{
		return new RadarEntry(getY(), getData());
	//    0    0:new             #2   <Class RadarEntry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #26  <Method float getY()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #30  <Method Object getData()>
	//    6   12:invokespecial   #32  <Method void RadarEntry(float, Object)>
	//    7   15:areturn         
	}

	public float getValue()
	{
		return getY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method float getY()>
	//    2    4:freturn         
	}

	public float getX()
	{
		return super.getX();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method float Entry.getX()>
	//    2    4:freturn         
	}

	public void setX(float f)
	{
		super.setX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #41  <Method void Entry.setX(float)>
	//    3    5:return          
	}
}
