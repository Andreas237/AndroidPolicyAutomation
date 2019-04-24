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
		parcel.writeInt(mAnchorPosition);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int mAnchorPosition>
	//    3    5:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mVisibleAnchorPosition);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field int mVisibleAnchorPosition>
	//    7   13:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mSpanOffsetsSize);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #55  <Field int mSpanOffsetsSize>
	//   11   21:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		if(mSpanOffsetsSize > 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #55  <Field int mSpanOffsetsSize>
	//*  14   28:ifle            39
			parcel.writeIntArray(mSpanOffsets);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #57  <Field int[] mSpanOffsets>
	//   18   36:invokevirtual   #98  <Method void Parcel.writeIntArray(int[])>
		parcel.writeInt(mSpanLookupSize);
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:getfield        #63  <Field int mSpanLookupSize>
	//   22   44:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		if(mSpanLookupSize > 0)
	//*  23   47:aload_0         
	//*  24   48:getfield        #63  <Field int mSpanLookupSize>
	//*  25   51:ifle            62
			parcel.writeIntArray(mSpanLookup);
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #65  <Field int[] mSpanLookup>
	//   29   59:invokevirtual   #98  <Method void Parcel.writeIntArray(int[])>
		if(mReverseLayout)
	//*  30   62:aload_0         
	//*  31   63:getfield        #67  <Field boolean mReverseLayout>
	//*  32   66:ifeq            74
			i = 1;
	//   33   69:iconst_1        
	//   34   70:istore_2        
		else
	//*  35   71:goto            76
			i = 0;
	//   36   74:iconst_0        
	//   37   75:istore_2        
		parcel.writeInt(i);
	//   38   76:aload_1         
	//   39   77:iload_2         
	//   40   78:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		if(mAnchorLayoutFromEnd)
	//*  41   81:aload_0         
	//*  42   82:getfield        #69  <Field boolean mAnchorLayoutFromEnd>
	//*  43   85:ifeq            93
			i = 1;
	//   44   88:iconst_1        
	//   45   89:istore_2        
		else
	//*  46   90:goto            95
			i = 0;
	//   47   93:iconst_0        
	//   48   94:istore_2        
		parcel.writeInt(i);
	//   49   95:aload_1         
	//   50   96:iload_2         
	//   51   97:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		if(mLastLayoutRTL)
	//*  52  100:aload_0         
	//*  53  101:getfield        #71  <Field boolean mLastLayoutRTL>
	//*  54  104:ifeq            112
			i = 1;
	//   55  107:iconst_1        
	//   56  108:istore_2        
		else
	//*  57  109:goto            114
			i = 0;
	//   58  112:iconst_0        
	//   59  113:istore_2        
		parcel.writeInt(i);
	//   60  114:aload_1         
	//   61  115:iload_2         
	//   62  116:invokevirtual   #95  <Method void Parcel.writeInt(int)>
		parcel.writeList(mFullSpanItems);
	//   63  119:aload_1         
	//   64  120:aload_0         
	//   65  121:getfield        #85  <Field List mFullSpanItems>
	//   66  124:invokevirtual   #102 <Method void Parcel.writeList(List)>
	//   67  127:return          
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
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mAnchorPosition = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #49  <Method int Parcel.readInt()>
	//    5    9:putfield        #51  <Field int mAnchorPosition>
		mVisibleAnchorPosition = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #49  <Method int Parcel.readInt()>
	//    9   17:putfield        #53  <Field int mVisibleAnchorPosition>
		mSpanOffsetsSize = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #49  <Method int Parcel.readInt()>
	//   13   25:putfield        #55  <Field int mSpanOffsetsSize>
		if(mSpanOffsetsSize > 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #55  <Field int mSpanOffsetsSize>
	//*  16   32:ifle            53
		{
			mSpanOffsets = new int[mSpanOffsetsSize];
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #55  <Field int mSpanOffsetsSize>
	//   20   40:newarray        int[]
	//   21   42:putfield        #57  <Field int[] mSpanOffsets>
			parcel.readIntArray(mSpanOffsets);
	//   22   45:aload_1         
	//   23   46:aload_0         
	//   24   47:getfield        #57  <Field int[] mSpanOffsets>
	//   25   50:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
		}
		mSpanLookupSize = parcel.readInt();
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #49  <Method int Parcel.readInt()>
	//   29   58:putfield        #63  <Field int mSpanLookupSize>
		if(mSpanLookupSize > 0)
	//*  30   61:aload_0         
	//*  31   62:getfield        #63  <Field int mSpanLookupSize>
	//*  32   65:ifle            86
		{
			mSpanLookup = new int[mSpanLookupSize];
	//   33   68:aload_0         
	//   34   69:aload_0         
	//   35   70:getfield        #63  <Field int mSpanLookupSize>
	//   36   73:newarray        int[]
	//   37   75:putfield        #65  <Field int[] mSpanLookup>
			parcel.readIntArray(mSpanLookup);
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #65  <Field int[] mSpanLookup>
	//   41   83:invokevirtual   #61  <Method void Parcel.readIntArray(int[])>
		}
		boolean flag;
		if(parcel.readInt() == 1)
	//*  42   86:aload_1         
	//*  43   87:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  44   90:iconst_1        
	//*  45   91:icmpne          99
			flag = true;
	//   46   94:iconst_1        
	//   47   95:istore_2        
		else
	//*  48   96:goto            101
			flag = false;
	//   49   99:iconst_0        
	//   50  100:istore_2        
		mReverseLayout = flag;
	//   51  101:aload_0         
	//   52  102:iload_2         
	//   53  103:putfield        #67  <Field boolean mReverseLayout>
		if(parcel.readInt() == 1)
	//*  54  106:aload_1         
	//*  55  107:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  56  110:iconst_1        
	//*  57  111:icmpne          119
			flag = true;
	//   58  114:iconst_1        
	//   59  115:istore_2        
		else
	//*  60  116:goto            121
			flag = false;
	//   61  119:iconst_0        
	//   62  120:istore_2        
		mAnchorLayoutFromEnd = flag;
	//   63  121:aload_0         
	//   64  122:iload_2         
	//   65  123:putfield        #69  <Field boolean mAnchorLayoutFromEnd>
		if(parcel.readInt() == 1)
	//*  66  126:aload_1         
	//*  67  127:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  68  130:iconst_1        
	//*  69  131:icmpne          139
			flag = true;
	//   70  134:iconst_1        
	//   71  135:istore_2        
		else
	//*  72  136:goto            141
			flag = false;
	//   73  139:iconst_0        
	//   74  140:istore_2        
		mLastLayoutRTL = flag;
	//   75  141:aload_0         
	//   76  142:iload_2         
	//   77  143:putfield        #71  <Field boolean mLastLayoutRTL>
		mFullSpanItems = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
	//   78  146:aload_0         
	//   79  147:aload_1         
	//   80  148:ldc1            #73  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   81  150:invokevirtual   #79  <Method ClassLoader Class.getClassLoader()>
	//   82  153:invokevirtual   #83  <Method java.util.ArrayList Parcel.readArrayList(ClassLoader)>
	//   83  156:putfield        #85  <Field List mFullSpanItems>
	//   84  159:return          
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
