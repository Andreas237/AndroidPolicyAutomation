// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.util.Log;

// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public class PieEntry extends Entry
{

	public PieEntry(float f)
	{
		super(0.0F, f);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:invokespecial   #14  <Method void Entry(float, float)>
	//    4    6:return          
	}

	public PieEntry(float f, Drawable drawable)
	{
		super(0.0F, f, drawable);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #19  <Method void Entry(float, float, Drawable)>
	//    5    7:return          
	}

	public PieEntry(float f, Drawable drawable, Object obj)
	{
		super(0.0F, f, drawable, obj);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #23  <Method void Entry(float, float, Drawable, Object)>
	//    6    8:return          
	}

	public PieEntry(float f, Object obj)
	{
		super(0.0F, f, obj);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #27  <Method void Entry(float, float, Object)>
	//    5    7:return          
	}

	public PieEntry(float f, String s)
	{
		super(0.0F, f);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:invokespecial   #14  <Method void Entry(float, float)>
		label = s;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #30  <Field String label>
	//    7   11:return          
	}

	public PieEntry(float f, String s, Drawable drawable)
	{
		super(0.0F, f, drawable);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:aload_3         
	//    4    4:invokespecial   #19  <Method void Entry(float, float, Drawable)>
		label = s;
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:putfield        #30  <Field String label>
	//    8   12:return          
	}

	public PieEntry(float f, String s, Drawable drawable, Object obj)
	{
		super(0.0F, f, drawable, obj);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #23  <Method void Entry(float, float, Drawable, Object)>
		label = s;
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:putfield        #30  <Field String label>
	//    9   14:return          
	}

	public PieEntry(float f, String s, Object obj)
	{
		super(0.0F, f, obj);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fload_1         
	//    3    3:aload_3         
	//    4    4:invokespecial   #27  <Method void Entry(float, float, Object)>
		label = s;
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:putfield        #30  <Field String label>
	//    8   12:return          
	}

	public volatile Entry copy()
	{
		return ((Entry) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method PieEntry copy()>
	//    2    4:areturn         
	}

	public PieEntry copy()
	{
		return new PieEntry(getY(), label, getData());
	//    0    0:new             #2   <Class PieEntry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #42  <Method float getY()>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field String label>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #46  <Method Object getData()>
	//    8   16:invokespecial   #48  <Method void PieEntry(float, String, Object)>
	//    9   19:areturn         
	}

	public String getLabel()
	{
		return label;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String label>
	//    2    4:areturn         
	}

	public float getValue()
	{
		return getY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method float getY()>
	//    2    4:freturn         
	}

	public float getX()
	{
		Log.i("DEPRECATED", "Pie entries do not have x values");
	//    0    0:ldc1            #55  <String "DEPRECATED">
	//    1    2:ldc1            #57  <String "Pie entries do not have x values">
	//    2    4:invokestatic    #63  <Method int Log.i(String, String)>
	//    3    7:pop             
		return super.getX();
	//    4    8:aload_0         
	//    5    9:invokespecial   #65  <Method float Entry.getX()>
	//    6   12:freturn         
	}

	public void setLabel(String s)
	{
		label = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String label>
	//    3    5:return          
	}

	public void setX(float f)
	{
		super.setX(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #71  <Method void Entry.setX(float)>
		Log.i("DEPRECATED", "Pie entries do not have x values");
	//    3    5:ldc1            #55  <String "DEPRECATED">
	//    4    7:ldc1            #57  <String "Pie entries do not have x values">
	//    5    9:invokestatic    #63  <Method int Log.i(String, String)>
	//    6   12:pop             
	//    7   13:return          
	}

	private String label;
}
