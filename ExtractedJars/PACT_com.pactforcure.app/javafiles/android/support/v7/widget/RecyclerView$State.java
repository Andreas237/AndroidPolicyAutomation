// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.SparseArray;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$State
{
	static interface LayoutState
		extends Annotation
	{
	}


	void assertLayoutStep(int i)
	{
		if((mLayoutStep & i) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field int mLayoutStep>
	//*   2    4:iload_1         
	//*   3    5:iand            
	//*   4    6:ifne            54
			throw new IllegalStateException((new StringBuilder()).append("Layout state should be one of ").append(Integer.toBinaryString(i)).append(" but it is ").append(Integer.toBinaryString(mLayoutStep)).toString());
	//    5    9:new             #71  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:new             #73  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #74  <Method void StringBuilder()>
	//   10   20:ldc1            #76  <String "Layout state should be one of ">
	//   11   22:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:iload_1         
	//   13   26:invokestatic    #86  <Method String Integer.toBinaryString(int)>
	//   14   29:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:ldc1            #88  <String " but it is ">
	//   16   34:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:aload_0         
	//   18   38:getfield        #50  <Field int mLayoutStep>
	//   19   41:invokestatic    #86  <Method String Integer.toBinaryString(int)>
	//   20   44:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   22   50:invokespecial   #95  <Method void IllegalStateException(String)>
	//   23   53:athrow          
		else
			return;
	//   24   54:return          
	}

	public boolean didStructureChange()
	{
		return mStructureChanged;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean mStructureChanged>
	//    2    4:ireturn         
	}

	public Object get(int i)
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field SparseArray mData>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mData.get(i);
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field SparseArray mData>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #105 <Method Object SparseArray.get(int)>
	//    9   17:areturn         
	}

	public int getItemCount()
	{
		if(mInPreLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field boolean mInPreLayout>
	//*   2    4:ifeq            17
			return mPreviousLayoutItemCount - mDeletedInvisibleItemCountSincePreviousLayout;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field int mPreviousLayoutItemCount>
	//    5   11:aload_0         
	//    6   12:getfield        #48  <Field int mDeletedInvisibleItemCountSincePreviousLayout>
	//    7   15:isub            
	//    8   16:ireturn         
		else
			return mItemCount;
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field int mItemCount>
	//   11   21:ireturn         
	}

	public int getRemainingScrollHorizontal()
	{
		return mRemainingScrollHorizontal;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int mRemainingScrollHorizontal>
	//    2    4:ireturn         
	}

	public int getRemainingScrollVertical()
	{
		return mRemainingScrollVertical;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field int mRemainingScrollVertical>
	//    2    4:ireturn         
	}

	public int getTargetScrollPosition()
	{
		return mTargetPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mTargetPosition>
	//    2    4:ireturn         
	}

	public boolean hasTargetScrollPosition()
	{
		return mTargetPosition != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int mTargetPosition>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isMeasuring()
	{
		return mIsMeasuring;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean mIsMeasuring>
	//    2    4:ireturn         
	}

	public boolean isPreLayout()
	{
		return mInPreLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean mInPreLayout>
	//    2    4:ireturn         
	}

	void prepareForNestedPrefetch(r r)
	{
		mLayoutStep = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field int mLayoutStep>
		mItemCount = r.getItemCount();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #125 <Method int RecyclerView$Adapter.getItemCount()>
	//    6   10:putfield        #52  <Field int mItemCount>
		mInPreLayout = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #56  <Field boolean mInPreLayout>
		mTrackOldChangeHolders = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #58  <Field boolean mTrackOldChangeHolders>
		mIsMeasuring = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #60  <Field boolean mIsMeasuring>
	//   16   28:return          
	}

	public void put(int i, Object obj)
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field SparseArray mData>
	//*   2    4:ifnonnull       18
			mData = new SparseArray();
	//    3    7:aload_0         
	//    4    8:new             #103 <Class SparseArray>
	//    5   11:dup             
	//    6   12:invokespecial   #128 <Method void SparseArray()>
	//    7   15:putfield        #101 <Field SparseArray mData>
		mData.put(i, obj);
	//    8   18:aload_0         
	//    9   19:getfield        #101 <Field SparseArray mData>
	//   10   22:iload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #130 <Method void SparseArray.put(int, Object)>
	//   13   27:return          
	}

	public void remove(int i)
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field SparseArray mData>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			mData.remove(i);
	//    4    8:aload_0         
	//    5    9:getfield        #101 <Field SparseArray mData>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #133 <Method void SparseArray.remove(int)>
			return;
	//    8   16:return          
		}
	}

	RecyclerView$State reset()
	{
		mTargetPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #44  <Field int mTargetPosition>
		if(mData != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #101 <Field SparseArray mData>
	//*   5    9:ifnull          19
			mData.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field SparseArray mData>
	//    8   16:invokevirtual   #138 <Method void SparseArray.clear()>
		mItemCount = 0;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #52  <Field int mItemCount>
		mStructureChanged = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #54  <Field boolean mStructureChanged>
		mIsMeasuring = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #60  <Field boolean mIsMeasuring>
		return this;
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("State{mTargetPosition=").append(mTargetPosition).append(", mData=").append(((Object) (mData))).append(", mItemCount=").append(mItemCount).append(", mPreviousLayoutItemCount=").append(mPreviousLayoutItemCount).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(mDeletedInvisibleItemCountSincePreviousLayout).append(", mStructureChanged=").append(mStructureChanged).append(", mInPreLayout=").append(mInPreLayout).append(", mRunSimpleAnimations=").append(mRunSimpleAnimations).append(", mRunPredictiveAnimations=").append(mRunPredictiveAnimations).append('}').toString();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:ldc1            #140 <String "State{mTargetPosition=">
	//    4    9:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #44  <Field int mTargetPosition>
	//    7   16:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #145 <String ", mData=">
	//    9   21:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #101 <Field SparseArray mData>
	//   12   28:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #150 <String ", mItemCount=">
	//   14   33:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #52  <Field int mItemCount>
	//   17   40:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   18   43:ldc1            #152 <String ", mPreviousLayoutItemCount=">
	//   19   45:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #46  <Field int mPreviousLayoutItemCount>
	//   22   52:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #154 <String ", mDeletedInvisibleItemCountSincePreviousLayout=">
	//   24   57:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #48  <Field int mDeletedInvisibleItemCountSincePreviousLayout>
	//   27   64:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   28   67:ldc1            #156 <String ", mStructureChanged=">
	//   29   69:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #54  <Field boolean mStructureChanged>
	//   32   76:invokevirtual   #159 <Method StringBuilder StringBuilder.append(boolean)>
	//   33   79:ldc1            #161 <String ", mInPreLayout=">
	//   34   81:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   35   84:aload_0         
	//   36   85:getfield        #56  <Field boolean mInPreLayout>
	//   37   88:invokevirtual   #159 <Method StringBuilder StringBuilder.append(boolean)>
	//   38   91:ldc1            #163 <String ", mRunSimpleAnimations=">
	//   39   93:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   40   96:aload_0         
	//   41   97:getfield        #62  <Field boolean mRunSimpleAnimations>
	//   42  100:invokevirtual   #159 <Method StringBuilder StringBuilder.append(boolean)>
	//   43  103:ldc1            #165 <String ", mRunPredictiveAnimations=">
	//   44  105:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   45  108:aload_0         
	//   46  109:getfield        #64  <Field boolean mRunPredictiveAnimations>
	//   47  112:invokevirtual   #159 <Method StringBuilder StringBuilder.append(boolean)>
	//   48  115:bipush          125
	//   49  117:invokevirtual   #168 <Method StringBuilder StringBuilder.append(char)>
	//   50  120:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   51  123:areturn         
	}

	public boolean willRunPredictiveAnimations()
	{
		return mRunPredictiveAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean mRunPredictiveAnimations>
	//    2    4:ireturn         
	}

	public boolean willRunSimpleAnimations()
	{
		return mRunSimpleAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean mRunSimpleAnimations>
	//    2    4:ireturn         
	}

	static final int STEP_ANIMATIONS = 4;
	static final int STEP_LAYOUT = 2;
	static final int STEP_START = 1;
	private SparseArray mData;
	int mDeletedInvisibleItemCountSincePreviousLayout;
	long mFocusedItemId;
	int mFocusedItemPosition;
	int mFocusedSubChildId;
	boolean mInPreLayout;
	boolean mIsMeasuring;
	int mItemCount;
	int mLayoutStep;
	int mPreviousLayoutItemCount;
	int mRemainingScrollHorizontal;
	int mRemainingScrollVertical;
	boolean mRunPredictiveAnimations;
	boolean mRunSimpleAnimations;
	boolean mStructureChanged;
	private int mTargetPosition;
	boolean mTrackOldChangeHolders;


/*
	static int access$1302(RecyclerView$State recyclerview$state, int i)
	{
		recyclerview$state.mTargetPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field int mTargetPosition>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	public RecyclerView$State()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mTargetPosition = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #44  <Field int mTargetPosition>
		mPreviousLayoutItemCount = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #46  <Field int mPreviousLayoutItemCount>
		mDeletedInvisibleItemCountSincePreviousLayout = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #48  <Field int mDeletedInvisibleItemCountSincePreviousLayout>
		mLayoutStep = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #50  <Field int mLayoutStep>
		mItemCount = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #52  <Field int mItemCount>
		mStructureChanged = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #54  <Field boolean mStructureChanged>
		mInPreLayout = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #56  <Field boolean mInPreLayout>
		mTrackOldChangeHolders = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #58  <Field boolean mTrackOldChangeHolders>
		mIsMeasuring = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #60  <Field boolean mIsMeasuring>
		mRunSimpleAnimations = false;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #62  <Field boolean mRunSimpleAnimations>
		mRunPredictiveAnimations = false;
	//   32   54:aload_0         
	//   33   55:iconst_0        
	//   34   56:putfield        #64  <Field boolean mRunPredictiveAnimations>
	//   35   59:return          
	}
}
