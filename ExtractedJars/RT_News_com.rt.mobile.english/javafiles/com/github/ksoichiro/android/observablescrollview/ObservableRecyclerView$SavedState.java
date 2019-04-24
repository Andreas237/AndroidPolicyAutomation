// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			ObservableRecyclerView

static class ObservableRecyclerView$SavedState
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Parcelable getSuperState()
	{
		return superState;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Parcelable superState>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(superState, i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field Parcelable superState>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #95  <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeInt(prevFirstVisiblePosition);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #65  <Field int prevFirstVisiblePosition>
	//    8   14:invokevirtual   #99  <Method void Parcel.writeInt(int)>
		parcel.writeInt(prevFirstVisibleChildHeight);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #42  <Field int prevFirstVisibleChildHeight>
	//   12   22:invokevirtual   #99  <Method void Parcel.writeInt(int)>
		parcel.writeInt(prevScrolledChildrenHeight);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #67  <Field int prevScrolledChildrenHeight>
	//   16   30:invokevirtual   #99  <Method void Parcel.writeInt(int)>
		parcel.writeInt(prevScrollY);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #69  <Field int prevScrollY>
	//   20   38:invokevirtual   #99  <Method void Parcel.writeInt(int)>
		parcel.writeInt(scrollY);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #71  <Field int scrollY>
	//   24   46:invokevirtual   #99  <Method void Parcel.writeInt(int)>
		SparseIntArray sparseintarray = childrenHeights;
	//   25   49:aload_0         
	//   26   50:getfield        #76  <Field SparseIntArray childrenHeights>
	//   27   53:astore          4
		int j = 0;
	//   28   55:iconst_0        
	//   29   56:istore_3        
		if(sparseintarray == null)
	//*  30   57:aload           4
	//*  31   59:ifnonnull       67
			i = 0;
	//   32   62:iconst_0        
	//   33   63:istore_2        
		else
	//*  34   64:goto            75
			i = childrenHeights.size();
	//   35   67:aload_0         
	//   36   68:getfield        #76  <Field SparseIntArray childrenHeights>
	//   37   71:invokevirtual   #102 <Method int SparseIntArray.size()>
	//   38   74:istore_2        
		parcel.writeInt(i);
	//   39   75:aload_1         
	//   40   76:iload_2         
	//   41   77:invokevirtual   #99  <Method void Parcel.writeInt(int)>
		if(i > 0)
	//*  42   80:iload_2         
	//*  43   81:ifle            120
			for(; j < i; j++)
	//*  44   84:iload_3         
	//*  45   85:iload_2         
	//*  46   86:icmpge          120
			{
				parcel.writeInt(childrenHeights.keyAt(j));
	//   47   89:aload_1         
	//   48   90:aload_0         
	//   49   91:getfield        #76  <Field SparseIntArray childrenHeights>
	//   50   94:iload_3         
	//   51   95:invokevirtual   #106 <Method int SparseIntArray.keyAt(int)>
	//   52   98:invokevirtual   #99  <Method void Parcel.writeInt(int)>
				parcel.writeInt(childrenHeights.valueAt(j));
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #76  <Field SparseIntArray childrenHeights>
	//   56  106:iload_3         
	//   57  107:invokevirtual   #109 <Method int SparseIntArray.valueAt(int)>
	//   58  110:invokevirtual   #99  <Method void Parcel.writeInt(int)>
			}

	//   59  113:iload_3         
	//   60  114:iconst_1        
	//   61  115:iadd            
	//   62  116:istore_3        
	//*  63  117:goto            84
	//   64  120:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ObservableRecyclerView.SavedState createFromParcel(Parcel parcel)
		{
			return new ObservableRecyclerView.SavedState(parcel, ((ObservableRecyclerView._cls1) (null)));
		//    0    0:new             #9   <Class ObservableRecyclerView$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void ObservableRecyclerView$SavedState(Parcel, ObservableRecyclerView$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method ObservableRecyclerView$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ObservableRecyclerView.SavedState[] newArray(int i)
		{
			return new ObservableRecyclerView.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ObservableRecyclerView.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method ObservableRecyclerView$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final ObservableRecyclerView$SavedState EMPTY_STATE = new ObservableRecyclerView.SavedState() {

	}
;
	SparseIntArray childrenHeights;
	int prevFirstVisibleChildHeight;
	int prevFirstVisiblePosition;
	int prevScrollY;
	int prevScrolledChildrenHeight;
	int scrollY;
	Parcelable superState;

	static 
	{
	//    0    0:new             #11  <Class ObservableRecyclerView$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void ObservableRecyclerView$SavedState$1()>
	//    3    7:putstatic       #35  <Field ObservableRecyclerView$SavedState EMPTY_STATE>
	//    4   10:new             #13  <Class ObservableRecyclerView$SavedState$2>
	//    5   13:dup             
	//    6   14:invokespecial   #36  <Method void ObservableRecyclerView$SavedState$2()>
	//    7   17:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//*   8   20:return          
	}

	private ObservableRecyclerView$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		prevFirstVisibleChildHeight = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #42  <Field int prevFirstVisibleChildHeight>
		superState = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #44  <Field Parcelable superState>
	//    8   14:return          
	}

	private ObservableRecyclerView$SavedState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		prevFirstVisibleChildHeight = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #42  <Field int prevFirstVisibleChildHeight>
		Object obj = ((Object) (parcel.readParcelable(((Class) (android/support/v7/widget/RecyclerView)).getClassLoader())));
	//    5    9:aload_1         
	//    6   10:ldc1            #47  <Class RecyclerView>
	//    7   12:invokevirtual   #53  <Method ClassLoader Class.getClassLoader()>
	//    8   15:invokevirtual   #59  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//    9   18:astore          6
		if(obj == null)
	//*  10   20:aload           6
	//*  11   22:ifnull          28
	//*  12   25:goto            33
			obj = ((Object) (EMPTY_STATE));
	//   13   28:getstatic       #35  <Field ObservableRecyclerView$SavedState EMPTY_STATE>
	//   14   31:astore          6
		superState = ((Parcelable) (obj));
	//   15   33:aload_0         
	//   16   34:aload           6
	//   17   36:putfield        #44  <Field Parcelable superState>
		prevFirstVisiblePosition = parcel.readInt();
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:invokevirtual   #63  <Method int Parcel.readInt()>
	//   21   44:putfield        #65  <Field int prevFirstVisiblePosition>
		prevFirstVisibleChildHeight = parcel.readInt();
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:invokevirtual   #63  <Method int Parcel.readInt()>
	//   25   52:putfield        #42  <Field int prevFirstVisibleChildHeight>
		prevScrolledChildrenHeight = parcel.readInt();
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:invokevirtual   #63  <Method int Parcel.readInt()>
	//   29   60:putfield        #67  <Field int prevScrolledChildrenHeight>
		prevScrollY = parcel.readInt();
	//   30   63:aload_0         
	//   31   64:aload_1         
	//   32   65:invokevirtual   #63  <Method int Parcel.readInt()>
	//   33   68:putfield        #69  <Field int prevScrollY>
		scrollY = parcel.readInt();
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:invokevirtual   #63  <Method int Parcel.readInt()>
	//   37   76:putfield        #71  <Field int scrollY>
		childrenHeights = new SparseIntArray();
	//   38   79:aload_0         
	//   39   80:new             #73  <Class SparseIntArray>
	//   40   83:dup             
	//   41   84:invokespecial   #74  <Method void SparseIntArray()>
	//   42   87:putfield        #76  <Field SparseIntArray childrenHeights>
		int j = parcel.readInt();
	//   43   90:aload_1         
	//   44   91:invokevirtual   #63  <Method int Parcel.readInt()>
	//   45   94:istore_3        
		if(j > 0)
	//*  46   95:iload_3         
	//*  47   96:ifle            136
		{
			for(int i = 0; i < j; i++)
	//*  48   99:iconst_0        
	//*  49  100:istore_2        
	//*  50  101:iload_2         
	//*  51  102:iload_3         
	//*  52  103:icmpge          136
			{
				int k = parcel.readInt();
	//   53  106:aload_1         
	//   54  107:invokevirtual   #63  <Method int Parcel.readInt()>
	//   55  110:istore          4
				int l = parcel.readInt();
	//   56  112:aload_1         
	//   57  113:invokevirtual   #63  <Method int Parcel.readInt()>
	//   58  116:istore          5
				childrenHeights.put(k, l);
	//   59  118:aload_0         
	//   60  119:getfield        #76  <Field SparseIntArray childrenHeights>
	//   61  122:iload           4
	//   62  124:iload           5
	//   63  126:invokevirtual   #80  <Method void SparseIntArray.put(int, int)>
			}

	//   64  129:iload_2         
	//   65  130:iconst_1        
	//   66  131:iadd            
	//   67  132:istore_2        
		}
	//*  68  133:goto            101
	//   69  136:return          
	}

	ObservableRecyclerView$SavedState(Parcel parcel, ObservableRecyclerView._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void ObservableRecyclerView$SavedState(Parcel)>
	//    3    5:return          
	}

	ObservableRecyclerView$SavedState(Parcelable parcelable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		prevFirstVisibleChildHeight = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #42  <Field int prevFirstVisibleChildHeight>
		if(parcelable == EMPTY_STATE)
	//*   5    9:aload_1         
	//*   6   10:getstatic       #35  <Field ObservableRecyclerView$SavedState EMPTY_STATE>
	//*   7   13:if_acmpeq       19
	//*   8   16:goto            21
			parcelable = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		superState = parcelable;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #44  <Field Parcelable superState>
	//   14   26:return          
	}

	ObservableRecyclerView$SavedState(ObservableRecyclerView._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void ObservableRecyclerView$SavedState()>
	//    2    4:return          
	}
}
