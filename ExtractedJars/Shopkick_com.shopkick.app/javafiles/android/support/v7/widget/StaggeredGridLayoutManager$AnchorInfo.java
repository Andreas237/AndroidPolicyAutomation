// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager, OrientationHelper

class StaggeredGridLayoutManager$AnchorInfo
{

	void assignCoordinateFromPadding()
	{
		int i;
		if(mLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean mLayoutFromEnd>
	//*   2    4:ifeq            21
			i = mPrimaryOrientation.getEndAfterPadding();
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field StaggeredGridLayoutManager this$0>
	//    5   11:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//    6   14:invokevirtual   #42  <Method int OrientationHelper.getEndAfterPadding()>
	//    7   17:istore_1        
		else
	//*   8   18:goto            32
			i = mPrimaryOrientation.getStartAfterPadding();
	//    9   21:aload_0         
	//   10   22:getfield        #22  <Field StaggeredGridLayoutManager this$0>
	//   11   25:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   12   28:invokevirtual   #45  <Method int OrientationHelper.getStartAfterPadding()>
	//   13   31:istore_1        
		mOffset = i;
	//   14   32:aload_0         
	//   15   33:iload_1         
	//   16   34:putfield        #47  <Field int mOffset>
	//   17   37:return          
	}

	void assignCoordinateFromPadding(int i)
	{
		if(mLayoutFromEnd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean mLayoutFromEnd>
	//*   2    4:ifeq            24
		{
			mOffset = mPrimaryOrientation.getEndAfterPadding() - i;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field StaggeredGridLayoutManager this$0>
	//    6   12:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//    7   15:invokevirtual   #42  <Method int OrientationHelper.getEndAfterPadding()>
	//    8   18:iload_1         
	//    9   19:isub            
	//   10   20:putfield        #47  <Field int mOffset>
			return;
	//   11   23:return          
		} else
		{
			mOffset = mPrimaryOrientation.getStartAfterPadding() + i;
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #22  <Field StaggeredGridLayoutManager this$0>
	//   15   29:getfield        #36  <Field OrientationHelper StaggeredGridLayoutManager.mPrimaryOrientation>
	//   16   32:invokevirtual   #45  <Method int OrientationHelper.getStartAfterPadding()>
	//   17   35:iload_1         
	//   18   36:iadd            
	//   19   37:putfield        #47  <Field int mOffset>
			return;
	//   20   40:return          
		}
	}

	void reset()
	{
		mPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #50  <Field int mPosition>
		mOffset = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #51  <Int 0x80000000>
	//    5    8:putfield        #47  <Field int mOffset>
		mLayoutFromEnd = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #32  <Field boolean mLayoutFromEnd>
		mInvalidateOffsets = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #53  <Field boolean mInvalidateOffsets>
		mValid = false;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #55  <Field boolean mValid>
		int ai[] = mSpanReferenceLines;
	//   15   26:aload_0         
	//   16   27:getfield        #57  <Field int[] mSpanReferenceLines>
	//   17   30:astore_1        
		if(ai != null)
	//*  18   31:aload_1         
	//*  19   32:ifnull          40
			Arrays.fill(ai, -1);
	//   20   35:aload_1         
	//   21   36:iconst_m1       
	//   22   37:invokestatic    #63  <Method void Arrays.fill(int[], int)>
	//   23   40:return          
	}

	void saveSpanReferenceLines(StaggeredGridLayoutManager.Span aspan[])
	{
		int j = aspan.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int ai[] = mSpanReferenceLines;
	//    3    3:aload_0         
	//    4    4:getfield        #57  <Field int[] mSpanReferenceLines>
	//    5    7:astore          4
		if(ai == null || ai.length < j)
	//*   6    9:aload           4
	//*   7   11:ifnull          21
	//*   8   14:aload           4
	//*   9   16:arraylength     
	//*  10   17:iload_3         
	//*  11   18:icmpge          35
			mSpanReferenceLines = new int[mSpans.length];
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #22  <Field StaggeredGridLayoutManager this$0>
	//   15   26:getfield        #69  <Field StaggeredGridLayoutManager$Span[] StaggeredGridLayoutManager.mSpans>
	//   16   29:arraylength     
	//   17   30:newarray        int[]
	//   18   32:putfield        #57  <Field int[] mSpanReferenceLines>
		for(int i = 0; i < j; i++)
	//*  19   35:iconst_0        
	//*  20   36:istore_2        
	//*  21   37:iload_2         
	//*  22   38:iload_3         
	//*  23   39:icmpge          63
			mSpanReferenceLines[i] = aspan[i].getStartLine(0x80000000);
	//   24   42:aload_0         
	//   25   43:getfield        #57  <Field int[] mSpanReferenceLines>
	//   26   46:iload_2         
	//   27   47:aload_1         
	//   28   48:iload_2         
	//   29   49:aaload          
	//   30   50:ldc1            #51  <Int 0x80000000>
	//   31   52:invokevirtual   #75  <Method int StaggeredGridLayoutManager$Span.getStartLine(int)>
	//   32   55:iastore         

	//   33   56:iload_2         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_2        
	//*  37   60:goto            37
	//   38   63:return          
	}

	boolean mInvalidateOffsets;
	boolean mLayoutFromEnd;
	int mOffset;
	int mPosition;
	int mSpanReferenceLines[];
	boolean mValid;
	final StaggeredGridLayoutManager this$0;

	StaggeredGridLayoutManager$AnchorInfo()
	{
		this$0 = StaggeredGridLayoutManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field StaggeredGridLayoutManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #28  <Method void reset()>
	//    7   13:return          
	}
}
