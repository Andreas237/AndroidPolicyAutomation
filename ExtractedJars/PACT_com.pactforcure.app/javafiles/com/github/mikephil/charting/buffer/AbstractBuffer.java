// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.buffer;


public abstract class AbstractBuffer
{

	public AbstractBuffer(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		index = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int index>
		phaseX = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #23  <Field float phaseX>
		phaseY = 1.0F;
	//    8   14:aload_0         
	//    9   15:fconst_1        
	//   10   16:putfield        #25  <Field float phaseY>
		mFrom = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #27  <Field int mFrom>
		mTo = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #29  <Field int mTo>
		index = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #21  <Field int index>
		buffer = new float[i];
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:newarray        float[]
	//   23   38:putfield        #31  <Field float[] buffer>
	//   24   41:return          
	}

	public abstract void feed(Object obj);

	public void limitFrom(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            8
			j = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		mFrom = j;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:putfield        #27  <Field int mFrom>
	//    9   13:return          
	}

	public void limitTo(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            8
			j = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		mTo = j;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:putfield        #29  <Field int mTo>
	//    9   13:return          
	}

	public void reset()
	{
		index = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #21  <Field int index>
	//    3    5:return          
	}

	public void setPhases(float f, float f1)
	{
		phaseX = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #23  <Field float phaseX>
		phaseY = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #25  <Field float phaseY>
	//    6   10:return          
	}

	public int size()
	{
		return buffer.length;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float[] buffer>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public final float buffer[];
	protected int index;
	protected int mFrom;
	protected int mTo;
	protected float phaseX;
	protected float phaseY;
}
