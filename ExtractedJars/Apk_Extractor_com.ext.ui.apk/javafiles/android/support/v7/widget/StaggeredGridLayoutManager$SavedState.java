// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager

public static class StaggeredGridLayoutManager$SavedState
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	void invalidateAnchorPositionInfo()
	{
		mSpanOffsets = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #57  <Field int[] mSpanOffsets>
		mSpanOffsetsSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #55  <Field int mSpanOffsetsSize>
		mAnchorPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #51  <Field int mAnchorPosition>
		mVisibleAnchorPosition = -1;
	//    9   15:aload_0         
	//   10   16:iconst_m1       
	//   11   17:putfield        #53  <Field int mVisibleAnchorPosition>
	//   12   20:return          
	}

	void invalidateSpanInfo()
	{
		mSpanOffsets = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #57  <Field int[] mSpanOffsets>
		mSpanOffsetsSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #55  <Field int mSpanOffsetsSize>
		mSpanLookupSize = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #63  <Field int mSpanLookupSize>
		mSpanLookup = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #65  <Field int[] mSpanLookup>
		mFullSpanItems = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #85  <Field List mFullSpanItems>
	//   15   25:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		parcel.writeInt(mAnchorPosition);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #51  <Field int mAnchorPosition>
	//    5    7:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mVisibleAnchorPosition);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #53  <Field int mVisibleAnchorPosition>
	//    9   15:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mSpanOffsetsSize);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #55  <Field int mSpanOffsetsSize>
	//   13   23:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		if(mSpanOffsetsSize > 0)
	//*  14   26:aload_0         
	//*  15   27:getfield        #55  <Field int mSpanOffsetsSize>
	//*  16   30:ifle            41
			parcel.writeIntArray(mSpanOffsets);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #57  <Field int[] mSpanOffsets>
	//   20   38:invokevirtual   #98  <Method void Parcel.writeIntArray(int[])>
		parcel.writeInt(mSpanLookupSize);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #63  <Field int mSpanLookupSize>
	//   24   46:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		if(mSpanLookupSize > 0)
	//*  25   49:aload_0         
	//*  26   50:getfield        #63  <Field int mSpanLookupSize>
	//*  27   53:ifle            64
			parcel.writeIntArray(mSpanLookup);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #65  <Field int[] mSpanLookup>
	//   31   61:invokevirtual   #98  <Method void Parcel.writeIntArray(int[])>
		if(mReverseLayout)
	//*  32   64:aload_0         
	//*  33   65:getfield        #67  <Field boolean mReverseLayout>
	//*  34   68:ifeq            115
			i = 1;
	//   35   71:iconst_1        
	//   36   72:istore_2        
		else
	//*  37   73:aload_1         
	//*  38   74:iload_2         
	//*  39   75:invokevirtual   #95  <Method void Parcel.writeInt(int)>
	//*  40   78:aload_0         
	//*  41   79:getfield        #69  <Field boolean mAnchorLayoutFromEnd>
	//*  42   82:ifeq            120
	//*  43   85:iconst_1        
	//*  44   86:istore_2        
	//*  45   87:aload_1         
	//*  46   88:iload_2         
	//*  47   89:invokevirtual   #95  <Method void Parcel.writeInt(int)>
	//*  48   92:aload_0         
	//*  49   93:getfield        #71  <Field boolean mLastLayoutRTL>
	//*  50   96:ifeq            125
	//*  51   99:iload_3         
	//*  52  100:istore_2        
	//*  53  101:aload_1         
	//*  54  102:iload_2         
	//*  55  103:invokevirtual   #95  <Method void Parcel.writeInt(int)>
	//*  56  106:aload_1         
	//*  57  107:aload_0         
	//*  58  108:getfield        #85  <Field List mFullSpanItems>
	//*  59  111:invokevirtual   #102 <Method void Parcel.writeList(List)>
	//*  60  114:return          
			i = 0;
	//   61  115:iconst_0        
	//   62  116:istore_2        
		parcel.writeInt(i);
		if(mAnchorLayoutFromEnd)
			i = 1;
		else
	//*  63  117:goto            73
			i = 0;
	//   64  120:iconst_0        
	//   65  121:istore_2        
		parcel.writeInt(i);
		if(mLastLayoutRTL)
			i = ((int) (flag));
		else
	//*  66  122:goto            87
			i = 0;
	//   67  125:iconst_0        
	//   68  126:istore_2        
		parcel.writeInt(i);
		parcel.writeList(mFullSpanItems);
	//*  69  127:goto            101
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public StaggeredGridLayoutManager.SavedState createFromParcel(Parcel parcel)
		{
			return new StaggeredGridLayoutManager.SavedState(parcel);
		//    0    0:new             #9   <Class StaggeredGridLayoutManager$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void StaggeredGridLayoutManager$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method StaggeredGridLayoutManager$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public StaggeredGridLayoutManager.SavedState[] newArray(int i)
		{
			return new StaggeredGridLayoutManager.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       StaggeredGridLayoutManager.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method StaggeredGridLayoutManager$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	boolean mAnchorLayoutFromEnd;
	int mAnchorPosition;
	List mFullSpanItems;
	boolean mLastLayoutRTL;
	boolean mReverseLayout;
	int mSpanLookup[];
	int mSpanLookupSize;
	int mSpanOffsets[];
	int mSpanOffsetsSize;
	int mVisibleAnchorPosition;

	static 
	{
	//    0    0:new             #11  <Class StaggeredGridLayoutManager$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StaggeredGridLayoutManager$SavedState$1()>
	//    3    7:putstatic       #40  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public StaggeredGridLayoutManager$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:return          
	}

	StaggeredGridLayoutManager$SavedState(Parcel parcel)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #42  <Method void Object()>
		mAnchorPosition = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #49  <Method int Parcel.readInt()>
	//    7   11:putfield        #51  <Field int mAnchorPosition>
		mVisibleAnchorPosition = parcel.readInt();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #49  <Method int Parcel.readInt()>
	//   11   19:putfield        #53  <Field int mVisibleAnchorPosition>
		mSpanOffsetsSize = parcel.readInt();
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #49  <Method int Parcel.readInt()>
	//   15   27:putfield        #55  <Field int mSpanOffsetsSize>
		if(mSpanOffsetsSize > 0)
	//*  16   30:aload_0         
	//*  17   31:getfield        #55  <Field int mSpanOffsetsSize>
	//*  18   34:ifle            55
		{
			mSpanOffsets = new int[mSpanOffsetsSize];
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #55  <Field int mSpanOffsetsSize>
	//   22   42:newarray        int[]
	//   23   44:putfield        #57  <Field int[] mSpanOffsets>
			parcel.readIntArray(mSpanOffsets);
	//   24   47:aload_1         
	//   25   48:aload_0         
	//   26   49:getfield        #57  <Field int[] mSpanOffsets>
	//   27   52:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
		}
		mSpanLookupSize = parcel.readInt();
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:invokevirtual   #49  <Method int Parcel.readInt()>
	//   31   60:putfield        #63  <Field int mSpanLookupSize>
		if(mSpanLookupSize > 0)
	//*  32   63:aload_0         
	//*  33   64:getfield        #63  <Field int mSpanLookupSize>
	//*  34   67:ifle            88
		{
			mSpanLookup = new int[mSpanLookupSize];
	//   35   70:aload_0         
	//   36   71:aload_0         
	//   37   72:getfield        #63  <Field int mSpanLookupSize>
	//   38   75:newarray        int[]
	//   39   77:putfield        #65  <Field int[] mSpanLookup>
			parcel.readIntArray(mSpanLookup);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #65  <Field int[] mSpanLookup>
	//   43   85:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
		}
		boolean flag;
		if(parcel.readInt() == 1)
	//*  44   88:aload_1         
	//*  45   89:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  46   92:iconst_1        
	//*  47   93:icmpne          147
			flag = true;
	//   48   96:iconst_1        
	//   49   97:istore_2        
		else
	//*  50   98:aload_0         
	//*  51   99:iload_2         
	//*  52  100:putfield        #67  <Field boolean mReverseLayout>
	//*  53  103:aload_1         
	//*  54  104:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  55  107:iconst_1        
	//*  56  108:icmpne          152
	//*  57  111:iconst_1        
	//*  58  112:istore_2        
	//*  59  113:aload_0         
	//*  60  114:iload_2         
	//*  61  115:putfield        #69  <Field boolean mAnchorLayoutFromEnd>
	//*  62  118:aload_1         
	//*  63  119:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  64  122:iconst_1        
	//*  65  123:icmpne          157
	//*  66  126:iload_3         
	//*  67  127:istore_2        
	//*  68  128:aload_0         
	//*  69  129:iload_2         
	//*  70  130:putfield        #71  <Field boolean mLastLayoutRTL>
	//*  71  133:aload_0         
	//*  72  134:aload_1         
	//*  73  135:ldc1            #73  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//*  74  137:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
	//*  75  140:invokevirtual   #83  <Method java.util.ArrayList Parcel.readArrayList(ClassLoader)>
	//*  76  143:putfield        #85  <Field List mFullSpanItems>
	//*  77  146:return          
			flag = false;
	//   78  147:iconst_0        
	//   79  148:istore_2        
		mReverseLayout = flag;
		if(parcel.readInt() == 1)
			flag = true;
		else
	//*  80  149:goto            98
			flag = false;
	//   81  152:iconst_0        
	//   82  153:istore_2        
		mAnchorLayoutFromEnd = flag;
		if(parcel.readInt() == 1)
			flag = flag1;
		else
	//*  83  154:goto            113
			flag = false;
	//   84  157:iconst_0        
	//   85  158:istore_2        
		mLastLayoutRTL = flag;
		mFullSpanItems = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
	//*  86  159:goto            128
	}

	public StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState staggeredgridlayoutmanager$savedstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mSpanOffsetsSize = staggeredgridlayoutmanager$savedstate.mSpanOffsetsSize;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #55  <Field int mSpanOffsetsSize>
	//    5    9:putfield        #55  <Field int mSpanOffsetsSize>
		mAnchorPosition = staggeredgridlayoutmanager$savedstate.mAnchorPosition;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #51  <Field int mAnchorPosition>
	//    9   17:putfield        #51  <Field int mAnchorPosition>
		mVisibleAnchorPosition = staggeredgridlayoutmanager$savedstate.mVisibleAnchorPosition;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #53  <Field int mVisibleAnchorPosition>
	//   13   25:putfield        #53  <Field int mVisibleAnchorPosition>
		mSpanOffsets = staggeredgridlayoutmanager$savedstate.mSpanOffsets;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #57  <Field int[] mSpanOffsets>
	//   17   33:putfield        #57  <Field int[] mSpanOffsets>
		mSpanLookupSize = staggeredgridlayoutmanager$savedstate.mSpanLookupSize;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #63  <Field int mSpanLookupSize>
	//   21   41:putfield        #63  <Field int mSpanLookupSize>
		mSpanLookup = staggeredgridlayoutmanager$savedstate.mSpanLookup;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #65  <Field int[] mSpanLookup>
	//   25   49:putfield        #65  <Field int[] mSpanLookup>
		mReverseLayout = staggeredgridlayoutmanager$savedstate.mReverseLayout;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #67  <Field boolean mReverseLayout>
	//   29   57:putfield        #67  <Field boolean mReverseLayout>
		mAnchorLayoutFromEnd = staggeredgridlayoutmanager$savedstate.mAnchorLayoutFromEnd;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #69  <Field boolean mAnchorLayoutFromEnd>
	//   33   65:putfield        #69  <Field boolean mAnchorLayoutFromEnd>
		mLastLayoutRTL = staggeredgridlayoutmanager$savedstate.mLastLayoutRTL;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #71  <Field boolean mLastLayoutRTL>
	//   37   73:putfield        #71  <Field boolean mLastLayoutRTL>
		mFullSpanItems = staggeredgridlayoutmanager$savedstate.mFullSpanItems;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #85  <Field List mFullSpanItems>
	//   41   81:putfield        #85  <Field List mFullSpanItems>
	//   42   84:return          
	}
}
