// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class StaggeredGridLayoutManager$SavedState
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
	//    2    2:putfield        #48  <Field int[] mSpanOffsets>
		mSpanOffsetsSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #46  <Field int mSpanOffsetsSize>
		mAnchorPosition = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #42  <Field int mAnchorPosition>
		mVisibleAnchorPosition = -1;
	//    9   15:aload_0         
	//   10   16:iconst_m1       
	//   11   17:putfield        #44  <Field int mVisibleAnchorPosition>
	//   12   20:return          
	}

	void invalidateSpanInfo()
	{
		mSpanOffsets = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #48  <Field int[] mSpanOffsets>
		mSpanOffsetsSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #46  <Field int mSpanOffsetsSize>
		mSpanLookupSize = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #54  <Field int mSpanLookupSize>
		mSpanLookup = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #56  <Field int[] mSpanLookup>
		mFullSpanItems = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #76  <Field List mFullSpanItems>
	//   15   25:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #84  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #86  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #91  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new _cls1();
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
		class _cls1
			implements android.os.Parcelable.Creator
		{

			public StaggeredGridLayoutManager.SavedState createFromParcel(Parcel parcel)
			{
				return new StaggeredGridLayoutManager.SavedState(parcel);
			//    0    0:new             #15  <Class StaggeredGridLayoutManager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #18  <Method void StaggeredGridLayoutManager$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #21  <Method StaggeredGridLayoutManager$SavedState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #26  <Method StaggeredGridLayoutManager$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

			_cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #10  <Method void Object()>
			//    2    4:return          
			}
		}

	//    0    0:new             #26  <Class StaggeredGridLayoutManager$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StaggeredGridLayoutManager$SavedState$1()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public StaggeredGridLayoutManager$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	StaggeredGridLayoutManager$SavedState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mAnchorPosition = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #40  <Method int Parcel.readInt()>
	//    5    9:putfield        #42  <Field int mAnchorPosition>
		mVisibleAnchorPosition = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #40  <Method int Parcel.readInt()>
	//    9   17:putfield        #44  <Field int mVisibleAnchorPosition>
		mSpanOffsetsSize = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #40  <Method int Parcel.readInt()>
	//   13   25:putfield        #46  <Field int mSpanOffsetsSize>
		int i = mSpanOffsetsSize;
	//   14   28:aload_0         
	//   15   29:getfield        #46  <Field int mSpanOffsetsSize>
	//   16   32:istore_2        
		if(i > 0)
	//*  17   33:iload_2         
	//*  18   34:ifle            52
		{
			mSpanOffsets = new int[i];
	//   19   37:aload_0         
	//   20   38:iload_2         
	//   21   39:newarray        int[]
	//   22   41:putfield        #48  <Field int[] mSpanOffsets>
			parcel.readIntArray(mSpanOffsets);
	//   23   44:aload_1         
	//   24   45:aload_0         
	//   25   46:getfield        #48  <Field int[] mSpanOffsets>
	//   26   49:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
		}
		mSpanLookupSize = parcel.readInt();
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #40  <Method int Parcel.readInt()>
	//   30   57:putfield        #54  <Field int mSpanLookupSize>
		i = mSpanLookupSize;
	//   31   60:aload_0         
	//   32   61:getfield        #54  <Field int mSpanLookupSize>
	//   33   64:istore_2        
		if(i > 0)
	//*  34   65:iload_2         
	//*  35   66:ifle            84
		{
			mSpanLookup = new int[i];
	//   36   69:aload_0         
	//   37   70:iload_2         
	//   38   71:newarray        int[]
	//   39   73:putfield        #56  <Field int[] mSpanLookup>
			parcel.readIntArray(mSpanLookup);
	//   40   76:aload_1         
	//   41   77:aload_0         
	//   42   78:getfield        #56  <Field int[] mSpanLookup>
	//   43   81:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
		}
		i = parcel.readInt();
	//   44   84:aload_1         
	//   45   85:invokevirtual   #40  <Method int Parcel.readInt()>
	//   46   88:istore_2        
		boolean flag1 = false;
	//   47   89:iconst_0        
	//   48   90:istore          4
		boolean flag;
		if(i == 1)
	//*  49   92:iload_2         
	//*  50   93:iconst_1        
	//*  51   94:icmpne          102
			flag = true;
	//   52   97:iconst_1        
	//   53   98:istore_3        
		else
	//*  54   99:goto            104
			flag = false;
	//   55  102:iconst_0        
	//   56  103:istore_3        
		mReverseLayout = flag;
	//   57  104:aload_0         
	//   58  105:iload_3         
	//   59  106:putfield        #58  <Field boolean mReverseLayout>
		if(parcel.readInt() == 1)
	//*  60  109:aload_1         
	//*  61  110:invokevirtual   #40  <Method int Parcel.readInt()>
	//*  62  113:iconst_1        
	//*  63  114:icmpne          122
			flag = true;
	//   64  117:iconst_1        
	//   65  118:istore_3        
		else
	//*  66  119:goto            124
			flag = false;
	//   67  122:iconst_0        
	//   68  123:istore_3        
		mAnchorLayoutFromEnd = flag;
	//   69  124:aload_0         
	//   70  125:iload_3         
	//   71  126:putfield        #60  <Field boolean mAnchorLayoutFromEnd>
		flag = flag1;
	//   72  129:iload           4
	//   73  131:istore_3        
		if(parcel.readInt() == 1)
	//*  74  132:aload_1         
	//*  75  133:invokevirtual   #40  <Method int Parcel.readInt()>
	//*  76  136:iconst_1        
	//*  77  137:icmpne          142
			flag = true;
	//   78  140:iconst_1        
	//   79  141:istore_3        
		mLastLayoutRTL = flag;
	//   80  142:aload_0         
	//   81  143:iload_3         
	//   82  144:putfield        #62  <Field boolean mLastLayoutRTL>
		mFullSpanItems = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
	//   83  147:aload_0         
	//   84  148:aload_1         
	//   85  149:ldc1            #64  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   86  151:invokevirtual   #70  <Method ClassLoader Class.getClassLoader()>
	//   87  154:invokevirtual   #74  <Method java.util.ArrayList Parcel.readArrayList(ClassLoader)>
	//   88  157:putfield        #76  <Field List mFullSpanItems>
	//   89  160:return          
	}

	public StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState staggeredgridlayoutmanager$savedstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mSpanOffsetsSize = staggeredgridlayoutmanager$savedstate.mSpanOffsetsSize;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #46  <Field int mSpanOffsetsSize>
	//    5    9:putfield        #46  <Field int mSpanOffsetsSize>
		mAnchorPosition = staggeredgridlayoutmanager$savedstate.mAnchorPosition;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #42  <Field int mAnchorPosition>
	//    9   17:putfield        #42  <Field int mAnchorPosition>
		mVisibleAnchorPosition = staggeredgridlayoutmanager$savedstate.mVisibleAnchorPosition;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #44  <Field int mVisibleAnchorPosition>
	//   13   25:putfield        #44  <Field int mVisibleAnchorPosition>
		mSpanOffsets = staggeredgridlayoutmanager$savedstate.mSpanOffsets;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #48  <Field int[] mSpanOffsets>
	//   17   33:putfield        #48  <Field int[] mSpanOffsets>
		mSpanLookupSize = staggeredgridlayoutmanager$savedstate.mSpanLookupSize;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #54  <Field int mSpanLookupSize>
	//   21   41:putfield        #54  <Field int mSpanLookupSize>
		mSpanLookup = staggeredgridlayoutmanager$savedstate.mSpanLookup;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #56  <Field int[] mSpanLookup>
	//   25   49:putfield        #56  <Field int[] mSpanLookup>
		mReverseLayout = staggeredgridlayoutmanager$savedstate.mReverseLayout;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #58  <Field boolean mReverseLayout>
	//   29   57:putfield        #58  <Field boolean mReverseLayout>
		mAnchorLayoutFromEnd = staggeredgridlayoutmanager$savedstate.mAnchorLayoutFromEnd;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #60  <Field boolean mAnchorLayoutFromEnd>
	//   33   65:putfield        #60  <Field boolean mAnchorLayoutFromEnd>
		mLastLayoutRTL = staggeredgridlayoutmanager$savedstate.mLastLayoutRTL;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #62  <Field boolean mLastLayoutRTL>
	//   37   73:putfield        #62  <Field boolean mLastLayoutRTL>
		mFullSpanItems = staggeredgridlayoutmanager$savedstate.mFullSpanItems;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #76  <Field List mFullSpanItems>
	//   41   81:putfield        #76  <Field List mFullSpanItems>
	//   42   84:return          
	}
}
