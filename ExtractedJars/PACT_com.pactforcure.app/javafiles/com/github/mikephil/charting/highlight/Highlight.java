// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.highlight;


// Referenced classes of package com.github.mikephil.charting.highlight:
//			Range

public class Highlight
{

	public Highlight(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mStackIndex = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #17  <Field int mStackIndex>
		mXIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #19  <Field int mXIndex>
		mDataSetIndex = j;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #21  <Field int mDataSetIndex>
	//   11   19:return          
	}

	public Highlight(int i, int j, int k)
	{
		this(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #25  <Method void Highlight(int, int)>
		mStackIndex = k;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #17  <Field int mStackIndex>
	//    7   11:return          
	}

	public Highlight(int i, int j, int k, Range range)
	{
		this(i, j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #28  <Method void Highlight(int, int, int)>
		mRange = range;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #30  <Field Range mRange>
	//    8   13:return          
	}

	public boolean equalTo(Highlight highlight)
	{
		while(highlight == null || mDataSetIndex != highlight.mDataSetIndex || mXIndex != highlight.mXIndex || mStackIndex != highlight.mStackIndex) 
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field int mDataSetIndex>
	//    6   10:aload_1         
	//    7   11:getfield        #21  <Field int mDataSetIndex>
	//    8   14:icmpne          4
	//    9   17:aload_0         
	//   10   18:getfield        #19  <Field int mXIndex>
	//   11   21:aload_1         
	//   12   22:getfield        #19  <Field int mXIndex>
	//   13   25:icmpne          4
	//   14   28:aload_0         
	//   15   29:getfield        #17  <Field int mStackIndex>
	//   16   32:aload_1         
	//   17   33:getfield        #17  <Field int mStackIndex>
	//   18   36:icmpne          4
		return true;
	//   19   39:iconst_1        
	//   20   40:ireturn         
	}

	public int getDataSetIndex()
	{
		return mDataSetIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int mDataSetIndex>
	//    2    4:ireturn         
	}

	public Range getRange()
	{
		return mRange;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Range mRange>
	//    2    4:areturn         
	}

	public int getStackIndex()
	{
		return mStackIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mStackIndex>
	//    2    4:ireturn         
	}

	public int getXIndex()
	{
		return mXIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mXIndex>
	//    2    4:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Highlight, xIndex: ").append(mXIndex).append(", dataSetIndex: ").append(mDataSetIndex).append(", stackIndex (only stacked barentry): ").append(mStackIndex).toString();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:ldc1            #45  <String "Highlight, xIndex: ">
	//    4    9:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field int mXIndex>
	//    7   16:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #54  <String ", dataSetIndex: ">
	//    9   21:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #21  <Field int mDataSetIndex>
	//   12   28:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #56  <String ", stackIndex (only stacked barentry): ">
	//   14   33:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #17  <Field int mStackIndex>
	//   17   40:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   18   43:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   19   46:areturn         
	}

	private int mDataSetIndex;
	private Range mRange;
	private int mStackIndex;
	private int mXIndex;
}
