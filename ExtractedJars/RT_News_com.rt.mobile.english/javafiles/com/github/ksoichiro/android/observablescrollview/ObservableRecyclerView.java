// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.*;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			Scrollable, ObservableScrollViewCallbacks, ScrollState

public class ObservableRecyclerView extends RecyclerView
	implements Scrollable
{
	static class SavedState
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

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
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

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
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
		public static final SavedState EMPTY_STATE = new SavedState() {

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

		private SavedState()
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

		private SavedState(Parcel parcel)
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


		SavedState(Parcelable parcelable)
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

	}


	public ObservableRecyclerView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void RecyclerView(Context)>
		mPrevFirstVisibleChildHeight = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #41  <Field int mPrevFirstVisibleChildHeight>
		init();
	//    6   10:aload_0         
	//    7   11:invokespecial   #45  <Method void init()>
	//    8   14:return          
	}

	public ObservableRecyclerView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #49  <Method void RecyclerView(Context, AttributeSet)>
		mPrevFirstVisibleChildHeight = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #41  <Field int mPrevFirstVisibleChildHeight>
		init();
	//    7   11:aload_0         
	//    8   12:invokespecial   #45  <Method void init()>
	//    9   15:return          
	}

	public ObservableRecyclerView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #52  <Method void RecyclerView(Context, AttributeSet, int)>
		mPrevFirstVisibleChildHeight = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #41  <Field int mPrevFirstVisibleChildHeight>
		init();
	//    8   12:aload_0         
	//    9   13:invokespecial   #45  <Method void init()>
	//   10   16:return          
	}

	private void init()
	{
		mChildrenHeights = new SparseIntArray();
	//    0    0:aload_0         
	//    1    1:new             #54  <Class SparseIntArray>
	//    2    4:dup             
	//    3    5:invokespecial   #56  <Method void SparseIntArray()>
	//    4    8:putfield        #58  <Field SparseIntArray mChildrenHeights>
	//    5   11:return          
	}

	public int getCurrentScrollY()
	{
		return mScrollY;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int mScrollY>
	//    2    4:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null && motionevent.getActionMasked() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          36
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #71  <Method int MotionEvent.getActionMasked()>
	//*   5   11:ifeq            17
	//*   6   14:goto            36
		{
			mDragging = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #73  <Field boolean mDragging>
			mFirstScroll = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #75  <Field boolean mFirstScroll>
			mCallbacks.onDownMotionEvent();
	//   13   27:aload_0         
	//   14   28:getfield        #66  <Field ObservableScrollViewCallbacks mCallbacks>
	//   15   31:invokeinterface #80  <Method void ObservableScrollViewCallbacks.onDownMotionEvent()>
		}
		return super.onInterceptTouchEvent(motionevent);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokespecial   #82  <Method boolean RecyclerView.onInterceptTouchEvent(MotionEvent)>
	//   19   41:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #10  <Class ObservableRecyclerView$SavedState>
	//    2    4:astore_1        
		mPrevFirstVisiblePosition = ((SavedState) (parcelable)).prevFirstVisiblePosition;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #87  <Field int ObservableRecyclerView$SavedState.prevFirstVisiblePosition>
	//    6   10:putfield        #89  <Field int mPrevFirstVisiblePosition>
		mPrevFirstVisibleChildHeight = ((SavedState) (parcelable)).prevFirstVisibleChildHeight;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #92  <Field int ObservableRecyclerView$SavedState.prevFirstVisibleChildHeight>
	//   10   18:putfield        #41  <Field int mPrevFirstVisibleChildHeight>
		mPrevScrolledChildrenHeight = ((SavedState) (parcelable)).prevScrolledChildrenHeight;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #95  <Field int ObservableRecyclerView$SavedState.prevScrolledChildrenHeight>
	//   14   26:putfield        #97  <Field int mPrevScrolledChildrenHeight>
		mPrevScrollY = ((SavedState) (parcelable)).prevScrollY;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getfield        #100 <Field int ObservableRecyclerView$SavedState.prevScrollY>
	//   18   34:putfield        #102 <Field int mPrevScrollY>
		mScrollY = ((SavedState) (parcelable)).scrollY;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getfield        #105 <Field int ObservableRecyclerView$SavedState.scrollY>
	//   22   42:putfield        #62  <Field int mScrollY>
		mChildrenHeights = ((SavedState) (parcelable)).childrenHeights;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:getfield        #108 <Field SparseIntArray ObservableRecyclerView$SavedState.childrenHeights>
	//   26   50:putfield        #58  <Field SparseIntArray mChildrenHeights>
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #112 <Method Parcelable ObservableRecyclerView$SavedState.getSuperState()>
	//   30   58:invokespecial   #114 <Method void RecyclerView.onRestoreInstanceState(Parcelable)>
	//   31   61:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #10  <Class ObservableRecyclerView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #117 <Method Parcelable RecyclerView.onSaveInstanceState()>
	//    4    8:invokespecial   #119 <Method void ObservableRecyclerView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.prevFirstVisiblePosition = mPrevFirstVisiblePosition;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #89  <Field int mPrevFirstVisiblePosition>
	//    9   17:putfield        #87  <Field int ObservableRecyclerView$SavedState.prevFirstVisiblePosition>
		savedstate.prevFirstVisibleChildHeight = mPrevFirstVisibleChildHeight;
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #41  <Field int mPrevFirstVisibleChildHeight>
	//   13   25:putfield        #92  <Field int ObservableRecyclerView$SavedState.prevFirstVisibleChildHeight>
		savedstate.prevScrolledChildrenHeight = mPrevScrolledChildrenHeight;
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #97  <Field int mPrevScrolledChildrenHeight>
	//   17   33:putfield        #95  <Field int ObservableRecyclerView$SavedState.prevScrolledChildrenHeight>
		savedstate.prevScrollY = mPrevScrollY;
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #102 <Field int mPrevScrollY>
	//   21   41:putfield        #100 <Field int ObservableRecyclerView$SavedState.prevScrollY>
		savedstate.scrollY = mScrollY;
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #62  <Field int mScrollY>
	//   25   49:putfield        #105 <Field int ObservableRecyclerView$SavedState.scrollY>
		savedstate.childrenHeights = mChildrenHeights;
	//   26   52:aload_1         
	//   27   53:aload_0         
	//   28   54:getfield        #58  <Field SparseIntArray mChildrenHeights>
	//   29   57:putfield        #108 <Field SparseIntArray ObservableRecyclerView$SavedState.childrenHeights>
		return ((Parcelable) (savedstate));
	//   30   60:aload_1         
	//   31   61:areturn         
	}

	protected void onScrollChanged(int i, int j, int k, int l)
	{
		super.onScrollChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #123 <Method void RecyclerView.onScrollChanged(int, int, int, int)>
		if(mCallbacks != null && getChildCount() > 0)
	//*   6    9:aload_0         
	//*   7   10:getfield        #66  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   8   13:ifnull          482
	//*   9   16:aload_0         
	//*  10   17:invokevirtual   #126 <Method int getChildCount()>
	//*  11   20:ifle            482
		{
			l = getChildPosition(getChildAt(0));
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #130 <Method View getChildAt(int)>
	//   16   29:invokevirtual   #134 <Method int getChildPosition(View)>
	//   17   32:istore          4
			k = getChildPosition(getChildAt(getChildCount() - 1));
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:invokevirtual   #126 <Method int getChildCount()>
	//   22   40:iconst_1        
	//   23   41:isub            
	//   24   42:invokevirtual   #130 <Method View getChildAt(int)>
	//   25   45:invokevirtual   #134 <Method int getChildPosition(View)>
	//   26   48:istore_3        
			i = 0;
	//   27   49:iconst_0        
	//   28   50:istore_1        
			for(j = l; j <= k;)
	//*  29   51:iload           4
	//*  30   53:istore_2        
	//*  31   54:iload_2         
	//*  32   55:iload_3         
	//*  33   56:icmpgt          116
			{
				if(mChildrenHeights.indexOfKey(j) < 0 || getChildAt(i).getHeight() != mChildrenHeights.get(j))
	//*  34   59:aload_0         
	//*  35   60:getfield        #58  <Field SparseIntArray mChildrenHeights>
	//*  36   63:iload_2         
	//*  37   64:invokevirtual   #138 <Method int SparseIntArray.indexOfKey(int)>
	//*  38   67:iflt            89
	//*  39   70:aload_0         
	//*  40   71:iload_1         
	//*  41   72:invokevirtual   #130 <Method View getChildAt(int)>
	//*  42   75:invokevirtual   #143 <Method int View.getHeight()>
	//*  43   78:aload_0         
	//*  44   79:getfield        #58  <Field SparseIntArray mChildrenHeights>
	//*  45   82:iload_2         
	//*  46   83:invokevirtual   #146 <Method int SparseIntArray.get(int)>
	//*  47   86:icmpeq          105
					mChildrenHeights.put(j, getChildAt(i).getHeight());
	//   48   89:aload_0         
	//   49   90:getfield        #58  <Field SparseIntArray mChildrenHeights>
	//   50   93:iload_2         
	//   51   94:aload_0         
	//   52   95:iload_1         
	//   53   96:invokevirtual   #130 <Method View getChildAt(int)>
	//   54   99:invokevirtual   #143 <Method int View.getHeight()>
	//   55  102:invokevirtual   #150 <Method void SparseIntArray.put(int, int)>
				j++;
	//   56  105:iload_2         
	//   57  106:iconst_1        
	//   58  107:iadd            
	//   59  108:istore_2        
				i++;
	//   60  109:iload_1         
	//   61  110:iconst_1        
	//   62  111:iadd            
	//   63  112:istore_1        
			}

	//*  64  113:goto            54
			View view = getChildAt(0);
	//   65  116:aload_0         
	//   66  117:iconst_0        
	//   67  118:invokevirtual   #130 <Method View getChildAt(int)>
	//   68  121:astore          5
			if(view != null)
	//*  69  123:aload           5
	//*  70  125:ifnull          482
			{
				if(mPrevFirstVisiblePosition < l)
	//*  71  128:aload_0         
	//*  72  129:getfield        #89  <Field int mPrevFirstVisiblePosition>
	//*  73  132:iload           4
	//*  74  134:icmpge          234
				{
					if(l - mPrevFirstVisiblePosition != 1)
	//*  75  137:iload           4
	//*  76  139:aload_0         
	//*  77  140:getfield        #89  <Field int mPrevFirstVisiblePosition>
	//*  78  143:isub            
	//*  79  144:iconst_1        
	//*  80  145:icmpeq          205
					{
						j = l - 1;
	//   81  148:iload           4
	//   82  150:iconst_1        
	//   83  151:isub            
	//   84  152:istore_2        
						i = 0;
	//   85  153:iconst_0        
	//   86  154:istore_1        
						do
						{
							k = i;
	//   87  155:iload_1         
	//   88  156:istore_3        
							if(j <= mPrevFirstVisiblePosition)
								break;
	//   89  157:iload_2         
	//   90  158:aload_0         
	//   91  159:getfield        #89  <Field int mPrevFirstVisiblePosition>
	//   92  162:icmple          207
							if(mChildrenHeights.indexOfKey(j) > 0)
	//*  93  165:aload_0         
	//*  94  166:getfield        #58  <Field SparseIntArray mChildrenHeights>
	//*  95  169:iload_2         
	//*  96  170:invokevirtual   #138 <Method int SparseIntArray.indexOfKey(int)>
	//*  97  173:ifle            190
								i += mChildrenHeights.get(j);
	//   98  176:iload_1         
	//   99  177:aload_0         
	//  100  178:getfield        #58  <Field SparseIntArray mChildrenHeights>
	//  101  181:iload_2         
	//  102  182:invokevirtual   #146 <Method int SparseIntArray.get(int)>
	//  103  185:iadd            
	//  104  186:istore_1        
							else
	//* 105  187:goto            198
								i += view.getHeight();
	//  106  190:iload_1         
	//  107  191:aload           5
	//  108  193:invokevirtual   #143 <Method int View.getHeight()>
	//  109  196:iadd            
	//  110  197:istore_1        
							j--;
	//  111  198:iload_2         
	//  112  199:iconst_1        
	//  113  200:isub            
	//  114  201:istore_2        
						} while(true);
	//  115  202:goto            155
					} else
					{
						k = 0;
	//  116  205:iconst_0        
	//  117  206:istore_3        
					}
					mPrevScrolledChildrenHeight = mPrevScrolledChildrenHeight + (mPrevFirstVisibleChildHeight + k);
	//  118  207:aload_0         
	//  119  208:aload_0         
	//  120  209:getfield        #97  <Field int mPrevScrolledChildrenHeight>
	//  121  212:aload_0         
	//  122  213:getfield        #41  <Field int mPrevFirstVisibleChildHeight>
	//  123  216:iload_3         
	//  124  217:iadd            
	//  125  218:iadd            
	//  126  219:putfield        #97  <Field int mPrevScrolledChildrenHeight>
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  127  222:aload_0         
	//  128  223:aload           5
	//  129  225:invokevirtual   #143 <Method int View.getHeight()>
	//  130  228:putfield        #41  <Field int mPrevFirstVisibleChildHeight>
				} else
	//* 131  231:goto            360
				if(l < mPrevFirstVisiblePosition)
	//* 132  234:iload           4
	//* 133  236:aload_0         
	//* 134  237:getfield        #89  <Field int mPrevFirstVisiblePosition>
	//* 135  240:icmpge          341
				{
					if(mPrevFirstVisiblePosition - l != 1)
	//* 136  243:aload_0         
	//* 137  244:getfield        #89  <Field int mPrevFirstVisiblePosition>
	//* 138  247:iload           4
	//* 139  249:isub            
	//* 140  250:iconst_1        
	//* 141  251:icmpeq          311
					{
						j = mPrevFirstVisiblePosition - 1;
	//  142  254:aload_0         
	//  143  255:getfield        #89  <Field int mPrevFirstVisiblePosition>
	//  144  258:iconst_1        
	//  145  259:isub            
	//  146  260:istore_2        
						i = 0;
	//  147  261:iconst_0        
	//  148  262:istore_1        
						do
						{
							k = i;
	//  149  263:iload_1         
	//  150  264:istore_3        
							if(j <= l)
								break;
	//  151  265:iload_2         
	//  152  266:iload           4
	//  153  268:icmple          313
							if(mChildrenHeights.indexOfKey(j) > 0)
	//* 154  271:aload_0         
	//* 155  272:getfield        #58  <Field SparseIntArray mChildrenHeights>
	//* 156  275:iload_2         
	//* 157  276:invokevirtual   #138 <Method int SparseIntArray.indexOfKey(int)>
	//* 158  279:ifle            296
								i += mChildrenHeights.get(j);
	//  159  282:iload_1         
	//  160  283:aload_0         
	//  161  284:getfield        #58  <Field SparseIntArray mChildrenHeights>
	//  162  287:iload_2         
	//  163  288:invokevirtual   #146 <Method int SparseIntArray.get(int)>
	//  164  291:iadd            
	//  165  292:istore_1        
							else
	//* 166  293:goto            304
								i += view.getHeight();
	//  167  296:iload_1         
	//  168  297:aload           5
	//  169  299:invokevirtual   #143 <Method int View.getHeight()>
	//  170  302:iadd            
	//  171  303:istore_1        
							j--;
	//  172  304:iload_2         
	//  173  305:iconst_1        
	//  174  306:isub            
	//  175  307:istore_2        
						} while(true);
	//  176  308:goto            263
					} else
					{
						k = 0;
	//  177  311:iconst_0        
	//  178  312:istore_3        
					}
					mPrevScrolledChildrenHeight = mPrevScrolledChildrenHeight - (view.getHeight() + k);
	//  179  313:aload_0         
	//  180  314:aload_0         
	//  181  315:getfield        #97  <Field int mPrevScrolledChildrenHeight>
	//  182  318:aload           5
	//  183  320:invokevirtual   #143 <Method int View.getHeight()>
	//  184  323:iload_3         
	//  185  324:iadd            
	//  186  325:isub            
	//  187  326:putfield        #97  <Field int mPrevScrolledChildrenHeight>
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  188  329:aload_0         
	//  189  330:aload           5
	//  190  332:invokevirtual   #143 <Method int View.getHeight()>
	//  191  335:putfield        #41  <Field int mPrevFirstVisibleChildHeight>
				} else
	//* 192  338:goto            360
				if(l == 0)
	//* 193  341:iload           4
	//* 194  343:ifne            360
				{
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  195  346:aload_0         
	//  196  347:aload           5
	//  197  349:invokevirtual   #143 <Method int View.getHeight()>
	//  198  352:putfield        #41  <Field int mPrevFirstVisibleChildHeight>
					mPrevScrolledChildrenHeight = 0;
	//  199  355:aload_0         
	//  200  356:iconst_0        
	//  201  357:putfield        #97  <Field int mPrevScrolledChildrenHeight>
				}
				if(mPrevFirstVisibleChildHeight < 0)
	//* 202  360:aload_0         
	//* 203  361:getfield        #41  <Field int mPrevFirstVisibleChildHeight>
	//* 204  364:ifge            372
					mPrevFirstVisibleChildHeight = 0;
	//  205  367:aload_0         
	//  206  368:iconst_0        
	//  207  369:putfield        #41  <Field int mPrevFirstVisibleChildHeight>
				mScrollY = mPrevScrolledChildrenHeight - view.getTop();
	//  208  372:aload_0         
	//  209  373:aload_0         
	//  210  374:getfield        #97  <Field int mPrevScrolledChildrenHeight>
	//  211  377:aload           5
	//  212  379:invokevirtual   #153 <Method int View.getTop()>
	//  213  382:isub            
	//  214  383:putfield        #62  <Field int mScrollY>
				mPrevFirstVisiblePosition = l;
	//  215  386:aload_0         
	//  216  387:iload           4
	//  217  389:putfield        #89  <Field int mPrevFirstVisiblePosition>
				mCallbacks.onScrollChanged(mScrollY, mFirstScroll, mDragging);
	//  218  392:aload_0         
	//  219  393:getfield        #66  <Field ObservableScrollViewCallbacks mCallbacks>
	//  220  396:aload_0         
	//  221  397:getfield        #62  <Field int mScrollY>
	//  222  400:aload_0         
	//  223  401:getfield        #75  <Field boolean mFirstScroll>
	//  224  404:aload_0         
	//  225  405:getfield        #73  <Field boolean mDragging>
	//  226  408:invokeinterface #156 <Method void ObservableScrollViewCallbacks.onScrollChanged(int, boolean, boolean)>
				if(mFirstScroll)
	//* 227  413:aload_0         
	//* 228  414:getfield        #75  <Field boolean mFirstScroll>
	//* 229  417:ifeq            425
					mFirstScroll = false;
	//  230  420:aload_0         
	//  231  421:iconst_0        
	//  232  422:putfield        #75  <Field boolean mFirstScroll>
				if(mPrevScrollY < mScrollY)
	//* 233  425:aload_0         
	//* 234  426:getfield        #102 <Field int mPrevScrollY>
	//* 235  429:aload_0         
	//* 236  430:getfield        #62  <Field int mScrollY>
	//* 237  433:icmpge          446
					mScrollState = ScrollState.UP;
	//  238  436:aload_0         
	//  239  437:getstatic       #161 <Field ScrollState ScrollState.UP>
	//  240  440:putfield        #163 <Field ScrollState mScrollState>
				else
	//* 241  443:goto            474
				if(mScrollY < mPrevScrollY)
	//* 242  446:aload_0         
	//* 243  447:getfield        #62  <Field int mScrollY>
	//* 244  450:aload_0         
	//* 245  451:getfield        #102 <Field int mPrevScrollY>
	//* 246  454:icmpge          467
					mScrollState = ScrollState.DOWN;
	//  247  457:aload_0         
	//  248  458:getstatic       #166 <Field ScrollState ScrollState.DOWN>
	//  249  461:putfield        #163 <Field ScrollState mScrollState>
				else
	//* 250  464:goto            474
					mScrollState = ScrollState.STOP;
	//  251  467:aload_0         
	//  252  468:getstatic       #169 <Field ScrollState ScrollState.STOP>
	//  253  471:putfield        #163 <Field ScrollState mScrollState>
				mPrevScrollY = mScrollY;
	//  254  474:aload_0         
	//  255  475:aload_0         
	//  256  476:getfield        #62  <Field int mScrollY>
	//  257  479:putfield        #102 <Field int mPrevScrollY>
			}
		}
	//  258  482:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          264
			switch(motionevent.getActionMasked())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #71  <Method int MotionEvent.getActionMasked()>
			{
			default:
				break;

	//*   5   11:tableswitch     1 3: default 36
	//	               1 241
	//	               2 39
	//	               3 241
	//*   6   36:goto            264
			case 2: // '\002'
				if(mPrevMoveEvent == null)
	//*   7   39:aload_0         
	//*   8   40:getfield        #172 <Field MotionEvent mPrevMoveEvent>
	//*   9   43:ifnonnull       51
					mPrevMoveEvent = motionevent;
	//   10   46:aload_0         
	//   11   47:aload_1         
	//   12   48:putfield        #172 <Field MotionEvent mPrevMoveEvent>
				float f = motionevent.getY();
	//   13   51:aload_1         
	//   14   52:invokevirtual   #176 <Method float MotionEvent.getY()>
	//   15   55:fstore_2        
				float f1 = mPrevMoveEvent.getY();
	//   16   56:aload_0         
	//   17   57:getfield        #172 <Field MotionEvent mPrevMoveEvent>
	//   18   60:invokevirtual   #176 <Method float MotionEvent.getY()>
	//   19   63:fstore_3        
				mPrevMoveEvent = MotionEvent.obtainNoHistory(motionevent);
	//   20   64:aload_0         
	//   21   65:aload_1         
	//   22   66:invokestatic    #180 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   23   69:putfield        #172 <Field MotionEvent mPrevMoveEvent>
				if((float)getCurrentScrollY() - (f - f1) > 0.0F)
					break;
	//   24   72:aload_0         
	//   25   73:invokevirtual   #182 <Method int getCurrentScrollY()>
	//   26   76:i2f             
	//   27   77:fload_2         
	//   28   78:fload_3         
	//   29   79:fsub            
	//   30   80:fsub            
	//   31   81:fconst_0        
	//   32   82:fcmpg           
	//   33   83:ifgt            264
				if(mIntercepted)
	//*  34   86:aload_0         
	//*  35   87:getfield        #184 <Field boolean mIntercepted>
	//*  36   90:ifeq            95
					return false;
	//   37   93:iconst_0        
	//   38   94:ireturn         
				final ViewGroup parent;
				if(mTouchInterceptionViewGroup == null)
	//*  39   95:aload_0         
	//*  40   96:getfield        #186 <Field ViewGroup mTouchInterceptionViewGroup>
	//*  41   99:ifnonnull       114
					parent = (ViewGroup)getParent();
	//   42  102:aload_0         
	//   43  103:invokevirtual   #190 <Method android.view.ViewParent getParent()>
	//   44  106:checkcast       #192 <Class ViewGroup>
	//   45  109:astore          4
				else
	//*  46  111:goto            120
					parent = mTouchInterceptionViewGroup;
	//   47  114:aload_0         
	//   48  115:getfield        #186 <Field ViewGroup mTouchInterceptionViewGroup>
	//   49  118:astore          4
				f1 = 0.0F;
	//   50  120:fconst_0        
	//   51  121:fstore_3        
				f = f1;
	//   52  122:fload_3         
	//   53  123:fstore_2        
				for(Object obj = ((Object) (this)); obj != null && obj != parent; obj = ((Object) ((View)((View) (obj)).getParent())))
	//*  54  124:aload_0         
	//*  55  125:astore          5
	//*  56  127:aload           5
	//*  57  129:ifnull          182
	//*  58  132:aload           5
	//*  59  134:aload           4
	//*  60  136:if_acmpeq       182
				{
					f1 += ((View) (obj)).getLeft() - ((View) (obj)).getScrollX();
	//   61  139:fload_3         
	//   62  140:aload           5
	//   63  142:invokevirtual   #195 <Method int View.getLeft()>
	//   64  145:aload           5
	//   65  147:invokevirtual   #198 <Method int View.getScrollX()>
	//   66  150:isub            
	//   67  151:i2f             
	//   68  152:fadd            
	//   69  153:fstore_3        
					f += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
	//   70  154:fload_2         
	//   71  155:aload           5
	//   72  157:invokevirtual   #153 <Method int View.getTop()>
	//   73  160:aload           5
	//   74  162:invokevirtual   #201 <Method int View.getScrollY()>
	//   75  165:isub            
	//   76  166:i2f             
	//   77  167:fadd            
	//   78  168:fstore_2        
				}

	//   79  169:aload           5
	//   80  171:invokevirtual   #202 <Method android.view.ViewParent View.getParent()>
	//   81  174:checkcast       #140 <Class View>
	//   82  177:astore          5
	//*  83  179:goto            127
				final MotionEvent event = MotionEvent.obtainNoHistory(motionevent);
	//   84  182:aload_1         
	//   85  183:invokestatic    #180 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   86  186:astore          5
				event.offsetLocation(f1, f);
	//   87  188:aload           5
	//   88  190:fload_3         
	//   89  191:fload_2         
	//   90  192:invokevirtual   #206 <Method void MotionEvent.offsetLocation(float, float)>
				if(parent.onInterceptTouchEvent(event))
	//*  91  195:aload           4
	//*  92  197:aload           5
	//*  93  199:invokevirtual   #207 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//*  94  202:ifeq            235
				{
					mIntercepted = true;
	//   95  205:aload_0         
	//   96  206:iconst_1        
	//   97  207:putfield        #184 <Field boolean mIntercepted>
					event.setAction(0);
	//   98  210:aload           5
	//   99  212:iconst_0        
	//  100  213:invokevirtual   #211 <Method void MotionEvent.setAction(int)>
					post(new Runnable() {

						public void run()
						{
							parent.dispatchTouchEvent(event);
						//    0    0:aload_0         
						//    1    1:getfield        #23  <Field ViewGroup val$parent>
						//    2    4:aload_0         
						//    3    5:getfield        #25  <Field MotionEvent val$event>
						//    4    8:invokevirtual   #35  <Method boolean ViewGroup.dispatchTouchEvent(MotionEvent)>
						//    5   11:pop             
						//    6   12:return          
						}

						final ObservableRecyclerView this$0;
						final MotionEvent val$event;
						final ViewGroup val$parent;

			
			{
				this$0 = ObservableRecyclerView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ObservableRecyclerView this$0>
				parent = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ViewGroup val$parent>
				event = motionevent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field MotionEvent val$event>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
					}
);
	//  101  216:aload_0         
	//  102  217:new             #8   <Class ObservableRecyclerView$1>
	//  103  220:dup             
	//  104  221:aload_0         
	//  105  222:aload           4
	//  106  224:aload           5
	//  107  226:invokespecial   #214 <Method void ObservableRecyclerView$1(ObservableRecyclerView, ViewGroup, MotionEvent)>
	//  108  229:invokevirtual   #218 <Method boolean post(Runnable)>
	//  109  232:pop             
					return false;
	//  110  233:iconst_0        
	//  111  234:ireturn         
				} else
				{
					return super.onTouchEvent(motionevent);
	//  112  235:aload_0         
	//  113  236:aload_1         
	//  114  237:invokespecial   #220 <Method boolean RecyclerView.onTouchEvent(MotionEvent)>
	//  115  240:ireturn         
				}

			case 1: // '\001'
			case 3: // '\003'
				mIntercepted = false;
	//  116  241:aload_0         
	//  117  242:iconst_0        
	//  118  243:putfield        #184 <Field boolean mIntercepted>
				mDragging = false;
	//  119  246:aload_0         
	//  120  247:iconst_0        
	//  121  248:putfield        #73  <Field boolean mDragging>
				mCallbacks.onUpOrCancelMotionEvent(mScrollState);
	//  122  251:aload_0         
	//  123  252:getfield        #66  <Field ObservableScrollViewCallbacks mCallbacks>
	//  124  255:aload_0         
	//  125  256:getfield        #163 <Field ScrollState mScrollState>
	//  126  259:invokeinterface #224 <Method void ObservableScrollViewCallbacks.onUpOrCancelMotionEvent(ScrollState)>
				break;
			}
		return super.onTouchEvent(motionevent);
	//  127  264:aload_0         
	//  128  265:aload_1         
	//  129  266:invokespecial   #220 <Method boolean RecyclerView.onTouchEvent(MotionEvent)>
	//  130  269:ireturn         
	}

	public void scrollVerticallyTo(int i)
	{
		View view = getChildAt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #130 <Method View getChildAt(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
			scrollVerticallyToPosition(i / view.getHeight());
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #143 <Method int View.getHeight()>
	//   10   16:idiv            
	//   11   17:invokevirtual   #228 <Method void scrollVerticallyToPosition(int)>
	//   12   20:return          
	}

	public void scrollVerticallyToPosition(int i)
	{
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = getLayoutManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #232 <Method android.support.v7.widget.RecyclerView$LayoutManager getLayoutManager()>
	//    2    4:astore_2        
		if(layoutmanager != null && (layoutmanager instanceof LinearLayoutManager))
	//*   3    5:aload_2         
	//*   4    6:ifnull          26
	//*   5    9:aload_2         
	//*   6   10:instanceof      #234 <Class LinearLayoutManager>
	//*   7   13:ifeq            26
		{
			((LinearLayoutManager)layoutmanager).scrollToPositionWithOffset(i, 0);
	//    8   16:aload_2         
	//    9   17:checkcast       #234 <Class LinearLayoutManager>
	//   10   20:iload_1         
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #237 <Method void LinearLayoutManager.scrollToPositionWithOffset(int, int)>
			return;
	//   13   25:return          
		} else
		{
			scrollToPosition(i);
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:invokevirtual   #240 <Method void scrollToPosition(int)>
			return;
	//   17   31:return          
		}
	}

	public void setScrollViewCallbacks(ObservableScrollViewCallbacks observablescrollviewcallbacks)
	{
		mCallbacks = observablescrollviewcallbacks;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field ObservableScrollViewCallbacks mCallbacks>
	//    3    5:return          
	}

	public void setTouchInterceptionViewGroup(ViewGroup viewgroup)
	{
		mTouchInterceptionViewGroup = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #186 <Field ViewGroup mTouchInterceptionViewGroup>
	//    3    5:return          
	}

	private ObservableScrollViewCallbacks mCallbacks;
	private SparseIntArray mChildrenHeights;
	private boolean mDragging;
	private boolean mFirstScroll;
	private boolean mIntercepted;
	private int mPrevFirstVisibleChildHeight;
	private int mPrevFirstVisiblePosition;
	private MotionEvent mPrevMoveEvent;
	private int mPrevScrollY;
	private int mPrevScrolledChildrenHeight;
	private ScrollState mScrollState;
	private int mScrollY;
	private ViewGroup mTouchInterceptionViewGroup;
}
