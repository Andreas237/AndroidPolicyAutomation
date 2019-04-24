// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ObservableListView

static class ObservableListView$SavedState extends android.view.View.BaseSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #65  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(prevFirstVisiblePosition);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field int prevFirstVisiblePosition>
	//    7   11:invokevirtual   #69  <Method void Parcel.writeInt(int)>
		parcel.writeInt(prevFirstVisibleChildHeight);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field int prevFirstVisibleChildHeight>
	//   11   19:invokevirtual   #69  <Method void Parcel.writeInt(int)>
		parcel.writeInt(prevScrolledChildrenHeight);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #43  <Field int prevScrolledChildrenHeight>
	//   15   27:invokevirtual   #69  <Method void Parcel.writeInt(int)>
		parcel.writeInt(prevScrollY);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #45  <Field int prevScrollY>
	//   19   35:invokevirtual   #69  <Method void Parcel.writeInt(int)>
		parcel.writeInt(scrollY);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #47  <Field int scrollY>
	//   23   43:invokevirtual   #69  <Method void Parcel.writeInt(int)>
		SparseIntArray sparseintarray = childrenHeights;
	//   24   46:aload_0         
	//   25   47:getfield        #52  <Field SparseIntArray childrenHeights>
	//   26   50:astore          4
		int j = 0;
	//   27   52:iconst_0        
	//   28   53:istore_3        
		if(sparseintarray == null)
	//*  29   54:aload           4
	//*  30   56:ifnonnull       64
			i = 0;
	//   31   59:iconst_0        
	//   32   60:istore_2        
		else
	//*  33   61:goto            72
			i = childrenHeights.size();
	//   34   64:aload_0         
	//   35   65:getfield        #52  <Field SparseIntArray childrenHeights>
	//   36   68:invokevirtual   #72  <Method int SparseIntArray.size()>
	//   37   71:istore_2        
		parcel.writeInt(i);
	//   38   72:aload_1         
	//   39   73:iload_2         
	//   40   74:invokevirtual   #69  <Method void Parcel.writeInt(int)>
		if(i > 0)
	//*  41   77:iload_2         
	//*  42   78:ifle            117
			for(; j < i; j++)
	//*  43   81:iload_3         
	//*  44   82:iload_2         
	//*  45   83:icmpge          117
			{
				parcel.writeInt(childrenHeights.keyAt(j));
	//   46   86:aload_1         
	//   47   87:aload_0         
	//   48   88:getfield        #52  <Field SparseIntArray childrenHeights>
	//   49   91:iload_3         
	//   50   92:invokevirtual   #76  <Method int SparseIntArray.keyAt(int)>
	//   51   95:invokevirtual   #69  <Method void Parcel.writeInt(int)>
				parcel.writeInt(childrenHeights.valueAt(j));
	//   52   98:aload_1         
	//   53   99:aload_0         
	//   54  100:getfield        #52  <Field SparseIntArray childrenHeights>
	//   55  103:iload_3         
	//   56  104:invokevirtual   #79  <Method int SparseIntArray.valueAt(int)>
	//   57  107:invokevirtual   #69  <Method void Parcel.writeInt(int)>
			}

	//   58  110:iload_3         
	//   59  111:iconst_1        
	//   60  112:iadd            
	//   61  113:istore_3        
	//*  62  114:goto            81
	//   63  117:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableListView.SavedState createFromParcel(Parcel parcel)
		{
			return new ObservableListView.SavedState(parcel, ((ObservableListView._cls1) (null)));
		//    0    0:new             #9   <Class ObservableListView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void ObservableListView$SavedState(Parcel, ObservableListView$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method ObservableListView$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableListView.SavedState[] newArray(int i)
		{
			return new ObservableListView.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableListView.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method ObservableListView$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	SparseIntArray childrenHeights;
	int prevFirstVisibleChildHeight;
	int prevFirstVisiblePosition;
	int prevScrollY;
	int prevScrolledChildrenHeight;
	int scrollY;

	static 
	{
	//    0    0:new             #9   <Class ObservableListView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ObservableListView$SavedState$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private ObservableListView$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void android.view.View$BaseSavedState(Parcel)>
		prevFirstVisibleChildHeight = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #33  <Field int prevFirstVisibleChildHeight>
		prevFirstVisiblePosition = parcel.readInt();
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #39  <Method int Parcel.readInt()>
	//    9   15:putfield        #41  <Field int prevFirstVisiblePosition>
		prevFirstVisibleChildHeight = parcel.readInt();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #39  <Method int Parcel.readInt()>
	//   13   23:putfield        #33  <Field int prevFirstVisibleChildHeight>
		prevScrolledChildrenHeight = parcel.readInt();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #39  <Method int Parcel.readInt()>
	//   17   31:putfield        #43  <Field int prevScrolledChildrenHeight>
		prevScrollY = parcel.readInt();
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #39  <Method int Parcel.readInt()>
	//   21   39:putfield        #45  <Field int prevScrollY>
		scrollY = parcel.readInt();
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #39  <Method int Parcel.readInt()>
	//   25   47:putfield        #47  <Field int scrollY>
		childrenHeights = new SparseIntArray();
	//   26   50:aload_0         
	//   27   51:new             #49  <Class SparseIntArray>
	//   28   54:dup             
	//   29   55:invokespecial   #50  <Method void SparseIntArray()>
	//   30   58:putfield        #52  <Field SparseIntArray childrenHeights>
		int j = parcel.readInt();
	//   31   61:aload_1         
	//   32   62:invokevirtual   #39  <Method int Parcel.readInt()>
	//   33   65:istore_3        
		if(j > 0)
	//*  34   66:iload_3         
	//*  35   67:ifle            107
		{
			for(int i = 0; i < j; i++)
	//*  36   70:iconst_0        
	//*  37   71:istore_2        
	//*  38   72:iload_2         
	//*  39   73:iload_3         
	//*  40   74:icmpge          107
			{
				int k = parcel.readInt();
	//   41   77:aload_1         
	//   42   78:invokevirtual   #39  <Method int Parcel.readInt()>
	//   43   81:istore          4
				int l = parcel.readInt();
	//   44   83:aload_1         
	//   45   84:invokevirtual   #39  <Method int Parcel.readInt()>
	//   46   87:istore          5
				childrenHeights.put(k, l);
	//   47   89:aload_0         
	//   48   90:getfield        #52  <Field SparseIntArray childrenHeights>
	//   49   93:iload           4
	//   50   95:iload           5
	//   51   97:invokevirtual   #56  <Method void SparseIntArray.put(int, int)>
			}

	//   52  100:iload_2         
	//   53  101:iconst_1        
	//   54  102:iadd            
	//   55  103:istore_2        
		}
	//*  56  104:goto            72
	//   57  107:return          
	}

	ObservableListView$SavedState(Parcel parcel, ObservableListView._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #58  <Method void ObservableListView$SavedState(Parcel)>
	//    3    5:return          
	}

	ObservableListView$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void android.view.View$BaseSavedState(Parcelable)>
		prevFirstVisibleChildHeight = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #33  <Field int prevFirstVisibleChildHeight>
	//    6   10:return          
	}
}
