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
	//*   4    6:ifne            64
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #71  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #72  <Method void StringBuilder()>
	//    8   16:astore_2        
			stringbuilder.append("Layout state should be one of ");
	//    9   17:aload_2         
	//   10   18:ldc1            #74  <String "Layout state should be one of ">
	//   11   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(Integer.toBinaryString(i));
	//   13   24:aload_2         
	//   14   25:iload_1         
	//   15   26:invokestatic    #84  <Method String Integer.toBinaryString(int)>
	//   16   29:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
			stringbuilder.append(" but it is ");
	//   18   33:aload_2         
	//   19   34:ldc1            #86  <String " but it is ">
	//   20   36:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			stringbuilder.append(Integer.toBinaryString(mLayoutStep));
	//   22   40:aload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #50  <Field int mLayoutStep>
	//   25   45:invokestatic    #84  <Method String Integer.toBinaryString(int)>
	//   26   48:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   28   52:new             #88  <Class IllegalStateException>
	//   29   55:dup             
	//   30   56:aload_2         
	//   31   57:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   32   60:invokespecial   #95  <Method void IllegalStateException(String)>
	//   33   63:athrow          
		} else
		{
			return;
	//   34   64:return          
		}
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #71  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #72  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("State{mTargetPosition=");
	//    4    8:aload_1         
	//    5    9:ldc1            #140 <String "State{mTargetPosition=">
	//    6   11:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mTargetPosition);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #44  <Field int mTargetPosition>
	//   11   20:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", mData=");
	//   13   24:aload_1         
	//   14   25:ldc1            #145 <String ", mData=">
	//   15   27:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (mData)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #101 <Field SparseArray mData>
	//   20   36:invokevirtual   #148 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", mItemCount=");
	//   22   40:aload_1         
	//   23   41:ldc1            #150 <String ", mItemCount=">
	//   24   43:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mItemCount);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #52  <Field int mItemCount>
	//   29   52:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", mIsMeasuring=");
	//   31   56:aload_1         
	//   32   57:ldc1            #152 <String ", mIsMeasuring=">
	//   33   59:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mIsMeasuring);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #60  <Field boolean mIsMeasuring>
	//   38   68:invokevirtual   #155 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   71:pop             
		stringbuilder.append(", mPreviousLayoutItemCount=");
	//   40   72:aload_1         
	//   41   73:ldc1            #157 <String ", mPreviousLayoutItemCount=">
	//   42   75:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mPreviousLayoutItemCount);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #46  <Field int mPreviousLayoutItemCount>
	//   47   84:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
	//   49   88:aload_1         
	//   50   89:ldc1            #159 <String ", mDeletedInvisibleItemCountSincePreviousLayout=">
	//   51   91:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mDeletedInvisibleItemCountSincePreviousLayout);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #48  <Field int mDeletedInvisibleItemCountSincePreviousLayout>
	//   56  100:invokevirtual   #143 <Method StringBuilder StringBuilder.append(int)>
	//   57  103:pop             
		stringbuilder.append(", mStructureChanged=");
	//   58  104:aload_1         
	//   59  105:ldc1            #161 <String ", mStructureChanged=">
	//   60  107:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(mStructureChanged);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #54  <Field boolean mStructureChanged>
	//   65  116:invokevirtual   #155 <Method StringBuilder StringBuilder.append(boolean)>
	//   66  119:pop             
		stringbuilder.append(", mInPreLayout=");
	//   67  120:aload_1         
	//   68  121:ldc1            #163 <String ", mInPreLayout=">
	//   69  123:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(mInPreLayout);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #56  <Field boolean mInPreLayout>
	//   74  132:invokevirtual   #155 <Method StringBuilder StringBuilder.append(boolean)>
	//   75  135:pop             
		stringbuilder.append(", mRunSimpleAnimations=");
	//   76  136:aload_1         
	//   77  137:ldc1            #165 <String ", mRunSimpleAnimations=">
	//   78  139:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(mRunSimpleAnimations);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #62  <Field boolean mRunSimpleAnimations>
	//   83  148:invokevirtual   #155 <Method StringBuilder StringBuilder.append(boolean)>
	//   84  151:pop             
		stringbuilder.append(", mRunPredictiveAnimations=");
	//   85  152:aload_1         
	//   86  153:ldc1            #167 <String ", mRunPredictiveAnimations=">
	//   87  155:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(mRunPredictiveAnimations);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #64  <Field boolean mRunPredictiveAnimations>
	//   92  164:invokevirtual   #155 <Method StringBuilder StringBuilder.append(boolean)>
	//   93  167:pop             
		stringbuilder.append('}');
	//   94  168:aload_1         
	//   95  169:bipush          125
	//   96  171:invokevirtual   #170 <Method StringBuilder StringBuilder.append(char)>
	//   97  174:pop             
		return stringbuilder.toString();
	//   98  175:aload_1         
	//   99  176:invokevirtual   #92  <Method String StringBuilder.toString()>
	//  100  179:areturn         
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
