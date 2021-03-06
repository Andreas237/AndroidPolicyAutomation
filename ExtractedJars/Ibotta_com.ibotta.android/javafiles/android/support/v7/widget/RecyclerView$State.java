// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.SparseArray;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$State
{

	void assertLayoutStep(int i)
	{
		if((mLayoutStep & i) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int mLayoutStep>
	//*   2    4:iload_1         
	//*   3    5:iand            
	//*   4    6:ifeq            10
		{
			return;
	//    5    9:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #60  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #61  <Method void StringBuilder()>
	//    9   17:astore_2        
			stringbuilder.append("Layout state should be one of ");
	//   10   18:aload_2         
	//   11   19:ldc1            #63  <String "Layout state should be one of ">
	//   12   21:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			stringbuilder.append(Integer.toBinaryString(i));
	//   14   25:aload_2         
	//   15   26:iload_1         
	//   16   27:invokestatic    #73  <Method String Integer.toBinaryString(int)>
	//   17   30:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(" but it is ");
	//   19   34:aload_2         
	//   20   35:ldc1            #75  <String " but it is ">
	//   21   37:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			stringbuilder.append(Integer.toBinaryString(mLayoutStep));
	//   23   41:aload_2         
	//   24   42:aload_0         
	//   25   43:getfield        #41  <Field int mLayoutStep>
	//   26   46:invokestatic    #73  <Method String Integer.toBinaryString(int)>
	//   27   49:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   29   53:new             #77  <Class IllegalStateException>
	//   30   56:dup             
	//   31   57:aload_2         
	//   32   58:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   33   61:invokespecial   #84  <Method void IllegalStateException(String)>
	//   34   64:athrow          
		}
	}

	public int getItemCount()
	{
		if(mInPreLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean mInPreLayout>
	//*   2    4:ifeq            17
			return mPreviousLayoutItemCount - mDeletedInvisibleItemCountSincePreviousLayout;
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field int mPreviousLayoutItemCount>
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field int mDeletedInvisibleItemCountSincePreviousLayout>
	//    7   15:isub            
	//    8   16:ireturn         
		else
			return mItemCount;
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field int mItemCount>
	//   11   21:ireturn         
	}

	public int getTargetScrollPosition()
	{
		return mTargetPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int mTargetPosition>
	//    2    4:ireturn         
	}

	public boolean hasTargetScrollPosition()
	{
		return mTargetPosition != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int mTargetPosition>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isPreLayout()
	{
		return mInPreLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean mInPreLayout>
	//    2    4:ireturn         
	}

	void prepareForNestedPrefetch(r r)
	{
		mLayoutStep = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #41  <Field int mLayoutStep>
		mItemCount = r.getItemCount();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #96  <Method int RecyclerView$Adapter.getItemCount()>
	//    6   10:putfield        #43  <Field int mItemCount>
		mInPreLayout = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #47  <Field boolean mInPreLayout>
		mTrackOldChangeHolders = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #49  <Field boolean mTrackOldChangeHolders>
		mIsMeasuring = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #51  <Field boolean mIsMeasuring>
	//   16   28:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("State{mTargetPosition=");
	//    4    8:aload_1         
	//    5    9:ldc1            #98  <String "State{mTargetPosition=">
	//    6   11:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mTargetPosition);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #35  <Field int mTargetPosition>
	//   11   20:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", mData=");
	//   13   24:aload_1         
	//   14   25:ldc1            #103 <String ", mData=">
	//   15   27:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (mData)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #105 <Field SparseArray mData>
	//   20   36:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", mItemCount=");
	//   22   40:aload_1         
	//   23   41:ldc1            #110 <String ", mItemCount=">
	//   24   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(mItemCount);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #43  <Field int mItemCount>
	//   29   52:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", mIsMeasuring=");
	//   31   56:aload_1         
	//   32   57:ldc1            #112 <String ", mIsMeasuring=">
	//   33   59:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(mIsMeasuring);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #51  <Field boolean mIsMeasuring>
	//   38   68:invokevirtual   #115 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   71:pop             
		stringbuilder.append(", mPreviousLayoutItemCount=");
	//   40   72:aload_1         
	//   41   73:ldc1            #117 <String ", mPreviousLayoutItemCount=">
	//   42   75:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(mPreviousLayoutItemCount);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #37  <Field int mPreviousLayoutItemCount>
	//   47   84:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
	//   49   88:aload_1         
	//   50   89:ldc1            #119 <String ", mDeletedInvisibleItemCountSincePreviousLayout=">
	//   51   91:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(mDeletedInvisibleItemCountSincePreviousLayout);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #39  <Field int mDeletedInvisibleItemCountSincePreviousLayout>
	//   56  100:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   57  103:pop             
		stringbuilder.append(", mStructureChanged=");
	//   58  104:aload_1         
	//   59  105:ldc1            #121 <String ", mStructureChanged=">
	//   60  107:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(mStructureChanged);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #45  <Field boolean mStructureChanged>
	//   65  116:invokevirtual   #115 <Method StringBuilder StringBuilder.append(boolean)>
	//   66  119:pop             
		stringbuilder.append(", mInPreLayout=");
	//   67  120:aload_1         
	//   68  121:ldc1            #123 <String ", mInPreLayout=">
	//   69  123:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(mInPreLayout);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #47  <Field boolean mInPreLayout>
	//   74  132:invokevirtual   #115 <Method StringBuilder StringBuilder.append(boolean)>
	//   75  135:pop             
		stringbuilder.append(", mRunSimpleAnimations=");
	//   76  136:aload_1         
	//   77  137:ldc1            #125 <String ", mRunSimpleAnimations=">
	//   78  139:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(mRunSimpleAnimations);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #53  <Field boolean mRunSimpleAnimations>
	//   83  148:invokevirtual   #115 <Method StringBuilder StringBuilder.append(boolean)>
	//   84  151:pop             
		stringbuilder.append(", mRunPredictiveAnimations=");
	//   85  152:aload_1         
	//   86  153:ldc1            #127 <String ", mRunPredictiveAnimations=">
	//   87  155:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   88  158:pop             
		stringbuilder.append(mRunPredictiveAnimations);
	//   89  159:aload_1         
	//   90  160:aload_0         
	//   91  161:getfield        #55  <Field boolean mRunPredictiveAnimations>
	//   92  164:invokevirtual   #115 <Method StringBuilder StringBuilder.append(boolean)>
	//   93  167:pop             
		stringbuilder.append('}');
	//   94  168:aload_1         
	//   95  169:bipush          125
	//   96  171:invokevirtual   #130 <Method StringBuilder StringBuilder.append(char)>
	//   97  174:pop             
		return stringbuilder.toString();
	//   98  175:aload_1         
	//   99  176:invokevirtual   #81  <Method String StringBuilder.toString()>
	//  100  179:areturn         
	}

	public boolean willRunPredictiveAnimations()
	{
		return mRunPredictiveAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean mRunPredictiveAnimations>
	//    2    4:ireturn         
	}

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
	int mTargetPosition;
	boolean mTrackOldChangeHolders;

	public RecyclerView$State()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mTargetPosition = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #35  <Field int mTargetPosition>
		mPreviousLayoutItemCount = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #37  <Field int mPreviousLayoutItemCount>
		mDeletedInvisibleItemCountSincePreviousLayout = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #39  <Field int mDeletedInvisibleItemCountSincePreviousLayout>
		mLayoutStep = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #41  <Field int mLayoutStep>
		mItemCount = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #43  <Field int mItemCount>
		mStructureChanged = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #45  <Field boolean mStructureChanged>
		mInPreLayout = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #47  <Field boolean mInPreLayout>
		mTrackOldChangeHolders = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #49  <Field boolean mTrackOldChangeHolders>
		mIsMeasuring = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #51  <Field boolean mIsMeasuring>
		mRunSimpleAnimations = false;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #53  <Field boolean mRunSimpleAnimations>
		mRunPredictiveAnimations = false;
	//   32   54:aload_0         
	//   33   55:iconst_0        
	//   34   56:putfield        #55  <Field boolean mRunPredictiveAnimations>
	//   35   59:return          
	}
}
