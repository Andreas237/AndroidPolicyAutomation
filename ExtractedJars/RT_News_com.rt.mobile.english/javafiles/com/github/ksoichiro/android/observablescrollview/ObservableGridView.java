// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.*;
import android.widget.AbsListView;
import android.widget.GridView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			Scrollable, ObservableScrollViewCallbacks, ScrollState

public class ObservableGridView extends GridView
	implements Scrollable
{
	static class SavedState extends android.view.View.BaseSavedState
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

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class ObservableGridView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void ObservableGridView$SavedState(Parcel, ObservableGridView$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method ObservableGridView$SavedState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #30  <Method ObservableGridView$SavedState[] newArray(int)>
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
		//    0    0:new             #9   <Class ObservableGridView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void ObservableGridView$SavedState$1()>
		//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private SavedState(Parcel parcel)
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


		SavedState(Parcelable parcelable)
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


	public ObservableGridView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void GridView(Context)>
		mPrevFirstVisibleChildHeight = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//    6   10:aload_0         
	//    7   11:new             #8   <Class ObservableGridView$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #47  <Method void ObservableGridView$1(ObservableGridView)>
	//   11   19:putfield        #49  <Field android.widget.AbsListView$OnScrollListener mScrollListener>
		init();
	//   12   22:aload_0         
	//   13   23:invokespecial   #53  <Method void init()>
	//   14   26:return          
	}

	public ObservableGridView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #57  <Method void GridView(Context, AttributeSet)>
		mPrevFirstVisibleChildHeight = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//    7   11:aload_0         
	//    8   12:new             #8   <Class ObservableGridView$1>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #47  <Method void ObservableGridView$1(ObservableGridView)>
	//   12   20:putfield        #49  <Field android.widget.AbsListView$OnScrollListener mScrollListener>
		init();
	//   13   23:aload_0         
	//   14   24:invokespecial   #53  <Method void init()>
	//   15   27:return          
	}

	public ObservableGridView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #60  <Method void GridView(Context, AttributeSet, int)>
		mPrevFirstVisibleChildHeight = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//    8   12:aload_0         
	//    9   13:new             #8   <Class ObservableGridView$1>
	//   10   16:dup             
	//   11   17:aload_0         
	//   12   18:invokespecial   #47  <Method void ObservableGridView$1(ObservableGridView)>
	//   13   21:putfield        #49  <Field android.widget.AbsListView$OnScrollListener mScrollListener>
		init();
	//   14   24:aload_0         
	//   15   25:invokespecial   #53  <Method void init()>
	//   16   28:return          
	}

	private int getNumColumnsCompat()
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #75  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          13
			return getNumColumns();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #78  <Method int getNumColumns()>
	//    5   12:ireturn         
		int j = getChildCount();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #81  <Method int getChildCount()>
	//    8   17:istore_3        
		boolean flag = false;
	//    9   18:iconst_0        
	//   10   19:istore_2        
		int i = ((int) (flag));
	//   11   20:iload_2         
	//   12   21:istore_1        
		if(j > 0)
	//*  13   22:iload_3         
	//*  14   23:ifle            48
		{
			int k = getChildAt(0).getMeasuredWidth();
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:invokevirtual   #85  <Method View getChildAt(int)>
	//   18   31:invokevirtual   #90  <Method int View.getMeasuredWidth()>
	//   19   34:istore_3        
			i = ((int) (flag));
	//   20   35:iload_2         
	//   21   36:istore_1        
			if(k > 0)
	//*  22   37:iload_3         
	//*  23   38:ifle            48
				i = getWidth() / k;
	//   24   41:aload_0         
	//   25   42:invokevirtual   #93  <Method int getWidth()>
	//   26   45:iload_3         
	//   27   46:idiv            
	//   28   47:istore_1        
		}
		if(i > 0)
	//*  29   48:iload_1         
	//*  30   49:ifle            54
			return i;
	//   31   52:iload_1         
	//   32   53:ireturn         
		else
			return -1;
	//   33   54:iconst_m1       
	//   34   55:ireturn         
	}

	private void init()
	{
		mChildrenHeights = new SparseIntArray();
	//    0    0:aload_0         
	//    1    1:new             #95  <Class SparseIntArray>
	//    2    4:dup             
	//    3    5:invokespecial   #97  <Method void SparseIntArray()>
	//    4    8:putfield        #99  <Field SparseIntArray mChildrenHeights>
		super.setOnScrollListener(mScrollListener);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field android.widget.AbsListView$OnScrollListener mScrollListener>
	//    8   16:invokespecial   #103 <Method void GridView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
	//    9   19:return          
	}

	private void onScrollChanged()
	{
		if(mCallbacks != null && getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          448
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #81  <Method int getChildCount()>
	//*   5   11:ifle            448
		{
			int i2 = getFirstVisiblePosition();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #108 <Method int getFirstVisiblePosition()>
	//    8   18:istore          4
			int l = getFirstVisiblePosition();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #108 <Method int getFirstVisiblePosition()>
	//   11   24:istore_2        
			for(int i = 0; l <= getLastVisiblePosition(); i++)
	//*  12   25:iconst_0        
	//*  13   26:istore_1        
	//*  14   27:iload_2         
	//*  15   28:aload_0         
	//*  16   29:invokevirtual   #111 <Method int getLastVisiblePosition()>
	//*  17   32:icmpgt          101
			{
				if((mChildrenHeights.indexOfKey(l) < 0 || getChildAt(i).getHeight() != mChildrenHeights.get(l)) && l % getNumColumnsCompat() == 0)
	//*  18   35:aload_0         
	//*  19   36:getfield        #99  <Field SparseIntArray mChildrenHeights>
	//*  20   39:iload_2         
	//*  21   40:invokevirtual   #115 <Method int SparseIntArray.indexOfKey(int)>
	//*  22   43:iflt            65
	//*  23   46:aload_0         
	//*  24   47:iload_1         
	//*  25   48:invokevirtual   #85  <Method View getChildAt(int)>
	//*  26   51:invokevirtual   #118 <Method int View.getHeight()>
	//*  27   54:aload_0         
	//*  28   55:getfield        #99  <Field SparseIntArray mChildrenHeights>
	//*  29   58:iload_2         
	//*  30   59:invokevirtual   #121 <Method int SparseIntArray.get(int)>
	//*  31   62:icmpeq          90
	//*  32   65:iload_2         
	//*  33   66:aload_0         
	//*  34   67:invokespecial   #123 <Method int getNumColumnsCompat()>
	//*  35   70:irem            
	//*  36   71:ifne            90
					mChildrenHeights.put(l, getChildAt(i).getHeight());
	//   37   74:aload_0         
	//   38   75:getfield        #99  <Field SparseIntArray mChildrenHeights>
	//   39   78:iload_2         
	//   40   79:aload_0         
	//   41   80:iload_1         
	//   42   81:invokevirtual   #85  <Method View getChildAt(int)>
	//   43   84:invokevirtual   #118 <Method int View.getHeight()>
	//   44   87:invokevirtual   #127 <Method void SparseIntArray.put(int, int)>
				l++;
	//   45   90:iload_2         
	//   46   91:iconst_1        
	//   47   92:iadd            
	//   48   93:istore_2        
			}

	//   49   94:iload_1         
	//   50   95:iconst_1        
	//   51   96:iadd            
	//   52   97:istore_1        
	//*  53   98:goto            27
			View view = getChildAt(0);
	//   54  101:aload_0         
	//   55  102:iconst_0        
	//   56  103:invokevirtual   #85  <Method View getChildAt(int)>
	//   57  106:astore          5
			if(view != null)
	//*  58  108:aload           5
	//*  59  110:ifnull          448
			{
				if(mPrevFirstVisiblePosition < i2)
	//*  60  113:aload_0         
	//*  61  114:getfield        #129 <Field int mPrevFirstVisiblePosition>
	//*  62  117:iload           4
	//*  63  119:icmpge          212
				{
					int k1;
					if(i2 - mPrevFirstVisiblePosition != 1)
	//*  64  122:iload           4
	//*  65  124:aload_0         
	//*  66  125:getfield        #129 <Field int mPrevFirstVisiblePosition>
	//*  67  128:isub            
	//*  68  129:iconst_1        
	//*  69  130:icmpeq          183
					{
						int i1 = i2 - 1;
	//   70  133:iload           4
	//   71  135:iconst_1        
	//   72  136:isub            
	//   73  137:istore_2        
						int j = 0;
	//   74  138:iconst_0        
	//   75  139:istore_1        
						do
						{
							k1 = j;
	//   76  140:iload_1         
	//   77  141:istore_3        
							if(i1 <= mPrevFirstVisiblePosition)
								break;
	//   78  142:iload_2         
	//   79  143:aload_0         
	//   80  144:getfield        #129 <Field int mPrevFirstVisiblePosition>
	//   81  147:icmple          185
							k1 = j;
	//   82  150:iload_1         
	//   83  151:istore_3        
							if(mChildrenHeights.indexOfKey(i1) > 0)
	//*  84  152:aload_0         
	//*  85  153:getfield        #99  <Field SparseIntArray mChildrenHeights>
	//*  86  156:iload_2         
	//*  87  157:invokevirtual   #115 <Method int SparseIntArray.indexOfKey(int)>
	//*  88  160:ifle            174
								k1 = j + mChildrenHeights.get(i1);
	//   89  163:iload_1         
	//   90  164:aload_0         
	//   91  165:getfield        #99  <Field SparseIntArray mChildrenHeights>
	//   92  168:iload_2         
	//   93  169:invokevirtual   #121 <Method int SparseIntArray.get(int)>
	//   94  172:iadd            
	//   95  173:istore_3        
							i1--;
	//   96  174:iload_2         
	//   97  175:iconst_1        
	//   98  176:isub            
	//   99  177:istore_2        
							j = k1;
	//  100  178:iload_3         
	//  101  179:istore_1        
						} while(true);
	//  102  180:goto            140
					} else
					{
						k1 = 0;
	//  103  183:iconst_0        
	//  104  184:istore_3        
					}
					mPrevScrolledChildrenHeight = mPrevScrolledChildrenHeight + (mPrevFirstVisibleChildHeight + k1);
	//  105  185:aload_0         
	//  106  186:aload_0         
	//  107  187:getfield        #131 <Field int mPrevScrolledChildrenHeight>
	//  108  190:aload_0         
	//  109  191:getfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//  110  194:iload_3         
	//  111  195:iadd            
	//  112  196:iadd            
	//  113  197:putfield        #131 <Field int mPrevScrolledChildrenHeight>
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  114  200:aload_0         
	//  115  201:aload           5
	//  116  203:invokevirtual   #118 <Method int View.getHeight()>
	//  117  206:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
				} else
	//* 118  209:goto            326
				if(i2 < mPrevFirstVisiblePosition)
	//* 119  212:iload           4
	//* 120  214:aload_0         
	//* 121  215:getfield        #129 <Field int mPrevFirstVisiblePosition>
	//* 122  218:icmpge          312
				{
					int l1;
					if(mPrevFirstVisiblePosition - i2 != 1)
	//* 123  221:aload_0         
	//* 124  222:getfield        #129 <Field int mPrevFirstVisiblePosition>
	//* 125  225:iload           4
	//* 126  227:isub            
	//* 127  228:iconst_1        
	//* 128  229:icmpeq          282
					{
						int j1 = mPrevFirstVisiblePosition - 1;
	//  129  232:aload_0         
	//  130  233:getfield        #129 <Field int mPrevFirstVisiblePosition>
	//  131  236:iconst_1        
	//  132  237:isub            
	//  133  238:istore_2        
						int k = 0;
	//  134  239:iconst_0        
	//  135  240:istore_1        
						do
						{
							l1 = k;
	//  136  241:iload_1         
	//  137  242:istore_3        
							if(j1 <= i2)
								break;
	//  138  243:iload_2         
	//  139  244:iload           4
	//  140  246:icmple          284
							l1 = k;
	//  141  249:iload_1         
	//  142  250:istore_3        
							if(mChildrenHeights.indexOfKey(j1) > 0)
	//* 143  251:aload_0         
	//* 144  252:getfield        #99  <Field SparseIntArray mChildrenHeights>
	//* 145  255:iload_2         
	//* 146  256:invokevirtual   #115 <Method int SparseIntArray.indexOfKey(int)>
	//* 147  259:ifle            273
								l1 = k + mChildrenHeights.get(j1);
	//  148  262:iload_1         
	//  149  263:aload_0         
	//  150  264:getfield        #99  <Field SparseIntArray mChildrenHeights>
	//  151  267:iload_2         
	//  152  268:invokevirtual   #121 <Method int SparseIntArray.get(int)>
	//  153  271:iadd            
	//  154  272:istore_3        
							j1--;
	//  155  273:iload_2         
	//  156  274:iconst_1        
	//  157  275:isub            
	//  158  276:istore_2        
							k = l1;
	//  159  277:iload_3         
	//  160  278:istore_1        
						} while(true);
	//  161  279:goto            241
					} else
					{
						l1 = 0;
	//  162  282:iconst_0        
	//  163  283:istore_3        
					}
					mPrevScrolledChildrenHeight = mPrevScrolledChildrenHeight - (view.getHeight() + l1);
	//  164  284:aload_0         
	//  165  285:aload_0         
	//  166  286:getfield        #131 <Field int mPrevScrolledChildrenHeight>
	//  167  289:aload           5
	//  168  291:invokevirtual   #118 <Method int View.getHeight()>
	//  169  294:iload_3         
	//  170  295:iadd            
	//  171  296:isub            
	//  172  297:putfield        #131 <Field int mPrevScrolledChildrenHeight>
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  173  300:aload_0         
	//  174  301:aload           5
	//  175  303:invokevirtual   #118 <Method int View.getHeight()>
	//  176  306:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
				} else
	//* 177  309:goto            326
				if(i2 == 0)
	//* 178  312:iload           4
	//* 179  314:ifne            326
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  180  317:aload_0         
	//  181  318:aload           5
	//  182  320:invokevirtual   #118 <Method int View.getHeight()>
	//  183  323:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
				if(mPrevFirstVisibleChildHeight < 0)
	//* 184  326:aload_0         
	//* 185  327:getfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//* 186  330:ifge            338
					mPrevFirstVisibleChildHeight = 0;
	//  187  333:aload_0         
	//  188  334:iconst_0        
	//  189  335:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
				mScrollY = mPrevScrolledChildrenHeight - view.getTop();
	//  190  338:aload_0         
	//  191  339:aload_0         
	//  192  340:getfield        #131 <Field int mPrevScrolledChildrenHeight>
	//  193  343:aload           5
	//  194  345:invokevirtual   #134 <Method int View.getTop()>
	//  195  348:isub            
	//  196  349:putfield        #136 <Field int mScrollY>
				mPrevFirstVisiblePosition = i2;
	//  197  352:aload_0         
	//  198  353:iload           4
	//  199  355:putfield        #129 <Field int mPrevFirstVisiblePosition>
				mCallbacks.onScrollChanged(mScrollY, mFirstScroll, mDragging);
	//  200  358:aload_0         
	//  201  359:getfield        #105 <Field ObservableScrollViewCallbacks mCallbacks>
	//  202  362:aload_0         
	//  203  363:getfield        #136 <Field int mScrollY>
	//  204  366:aload_0         
	//  205  367:getfield        #138 <Field boolean mFirstScroll>
	//  206  370:aload_0         
	//  207  371:getfield        #140 <Field boolean mDragging>
	//  208  374:invokeinterface #145 <Method void ObservableScrollViewCallbacks.onScrollChanged(int, boolean, boolean)>
				if(mFirstScroll)
	//* 209  379:aload_0         
	//* 210  380:getfield        #138 <Field boolean mFirstScroll>
	//* 211  383:ifeq            391
					mFirstScroll = false;
	//  212  386:aload_0         
	//  213  387:iconst_0        
	//  214  388:putfield        #138 <Field boolean mFirstScroll>
				if(mPrevScrollY < mScrollY)
	//* 215  391:aload_0         
	//* 216  392:getfield        #147 <Field int mPrevScrollY>
	//* 217  395:aload_0         
	//* 218  396:getfield        #136 <Field int mScrollY>
	//* 219  399:icmpge          412
					mScrollState = ScrollState.UP;
	//  220  402:aload_0         
	//  221  403:getstatic       #152 <Field ScrollState ScrollState.UP>
	//  222  406:putfield        #154 <Field ScrollState mScrollState>
				else
	//* 223  409:goto            440
				if(mScrollY < mPrevScrollY)
	//* 224  412:aload_0         
	//* 225  413:getfield        #136 <Field int mScrollY>
	//* 226  416:aload_0         
	//* 227  417:getfield        #147 <Field int mPrevScrollY>
	//* 228  420:icmpge          433
					mScrollState = ScrollState.DOWN;
	//  229  423:aload_0         
	//  230  424:getstatic       #157 <Field ScrollState ScrollState.DOWN>
	//  231  427:putfield        #154 <Field ScrollState mScrollState>
				else
	//* 232  430:goto            440
					mScrollState = ScrollState.STOP;
	//  233  433:aload_0         
	//  234  434:getstatic       #160 <Field ScrollState ScrollState.STOP>
	//  235  437:putfield        #154 <Field ScrollState mScrollState>
				mPrevScrollY = mScrollY;
	//  236  440:aload_0         
	//  237  441:aload_0         
	//  238  442:getfield        #136 <Field int mScrollY>
	//  239  445:putfield        #147 <Field int mPrevScrollY>
			}
		}
	//  240  448:return          
	}

	public int getCurrentScrollY()
	{
		return mScrollY;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mScrollY>
	//    2    4:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null && motionevent.getActionMasked() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          36
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #168 <Method int MotionEvent.getActionMasked()>
	//*   5   11:ifeq            17
	//*   6   14:goto            36
		{
			mDragging = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #140 <Field boolean mDragging>
			mFirstScroll = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #138 <Field boolean mFirstScroll>
			mCallbacks.onDownMotionEvent();
	//   13   27:aload_0         
	//   14   28:getfield        #105 <Field ObservableScrollViewCallbacks mCallbacks>
	//   15   31:invokeinterface #171 <Method void ObservableScrollViewCallbacks.onDownMotionEvent()>
		}
		return super.onInterceptTouchEvent(motionevent);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokespecial   #173 <Method boolean GridView.onInterceptTouchEvent(MotionEvent)>
	//   19   41:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #12  <Class ObservableGridView$SavedState>
	//    2    4:astore_1        
		mPrevFirstVisiblePosition = ((SavedState) (parcelable)).prevFirstVisiblePosition;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #178 <Field int ObservableGridView$SavedState.prevFirstVisiblePosition>
	//    6   10:putfield        #129 <Field int mPrevFirstVisiblePosition>
		mPrevFirstVisibleChildHeight = ((SavedState) (parcelable)).prevFirstVisibleChildHeight;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #181 <Field int ObservableGridView$SavedState.prevFirstVisibleChildHeight>
	//   10   18:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
		mPrevScrolledChildrenHeight = ((SavedState) (parcelable)).prevScrolledChildrenHeight;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #184 <Field int ObservableGridView$SavedState.prevScrolledChildrenHeight>
	//   14   26:putfield        #131 <Field int mPrevScrolledChildrenHeight>
		mPrevScrollY = ((SavedState) (parcelable)).prevScrollY;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getfield        #187 <Field int ObservableGridView$SavedState.prevScrollY>
	//   18   34:putfield        #147 <Field int mPrevScrollY>
		mScrollY = ((SavedState) (parcelable)).scrollY;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getfield        #190 <Field int ObservableGridView$SavedState.scrollY>
	//   22   42:putfield        #136 <Field int mScrollY>
		mChildrenHeights = ((SavedState) (parcelable)).childrenHeights;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:getfield        #193 <Field SparseIntArray ObservableGridView$SavedState.childrenHeights>
	//   26   50:putfield        #99  <Field SparseIntArray mChildrenHeights>
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #197 <Method Parcelable ObservableGridView$SavedState.getSuperState()>
	//   30   58:invokespecial   #199 <Method void GridView.onRestoreInstanceState(Parcelable)>
	//   31   61:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #12  <Class ObservableGridView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #202 <Method Parcelable GridView.onSaveInstanceState()>
	//    4    8:invokespecial   #204 <Method void ObservableGridView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.prevFirstVisiblePosition = mPrevFirstVisiblePosition;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #129 <Field int mPrevFirstVisiblePosition>
	//    9   17:putfield        #178 <Field int ObservableGridView$SavedState.prevFirstVisiblePosition>
		savedstate.prevFirstVisibleChildHeight = mPrevFirstVisibleChildHeight;
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//   13   25:putfield        #181 <Field int ObservableGridView$SavedState.prevFirstVisibleChildHeight>
		savedstate.prevScrolledChildrenHeight = mPrevScrolledChildrenHeight;
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #131 <Field int mPrevScrolledChildrenHeight>
	//   17   33:putfield        #184 <Field int ObservableGridView$SavedState.prevScrolledChildrenHeight>
		savedstate.prevScrollY = mPrevScrollY;
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #147 <Field int mPrevScrollY>
	//   21   41:putfield        #187 <Field int ObservableGridView$SavedState.prevScrollY>
		savedstate.scrollY = mScrollY;
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #136 <Field int mScrollY>
	//   25   49:putfield        #190 <Field int ObservableGridView$SavedState.scrollY>
		savedstate.childrenHeights = mChildrenHeights;
	//   26   52:aload_1         
	//   27   53:aload_0         
	//   28   54:getfield        #99  <Field SparseIntArray mChildrenHeights>
	//   29   57:putfield        #193 <Field SparseIntArray ObservableGridView$SavedState.childrenHeights>
		return ((Parcelable) (savedstate));
	//   30   60:aload_1         
	//   31   61:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          264
			switch(motionevent.getActionMasked())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #168 <Method int MotionEvent.getActionMasked()>
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
	//*   8   40:getfield        #207 <Field MotionEvent mPrevMoveEvent>
	//*   9   43:ifnonnull       51
					mPrevMoveEvent = motionevent;
	//   10   46:aload_0         
	//   11   47:aload_1         
	//   12   48:putfield        #207 <Field MotionEvent mPrevMoveEvent>
				float f = motionevent.getY();
	//   13   51:aload_1         
	//   14   52:invokevirtual   #211 <Method float MotionEvent.getY()>
	//   15   55:fstore_2        
				float f1 = mPrevMoveEvent.getY();
	//   16   56:aload_0         
	//   17   57:getfield        #207 <Field MotionEvent mPrevMoveEvent>
	//   18   60:invokevirtual   #211 <Method float MotionEvent.getY()>
	//   19   63:fstore_3        
				mPrevMoveEvent = MotionEvent.obtainNoHistory(motionevent);
	//   20   64:aload_0         
	//   21   65:aload_1         
	//   22   66:invokestatic    #215 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   23   69:putfield        #207 <Field MotionEvent mPrevMoveEvent>
				if((float)getCurrentScrollY() - (f - f1) > 0.0F)
					break;
	//   24   72:aload_0         
	//   25   73:invokevirtual   #217 <Method int getCurrentScrollY()>
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
	//*  35   87:getfield        #219 <Field boolean mIntercepted>
	//*  36   90:ifeq            95
					return false;
	//   37   93:iconst_0        
	//   38   94:ireturn         
				final ViewGroup parent;
				if(mTouchInterceptionViewGroup == null)
	//*  39   95:aload_0         
	//*  40   96:getfield        #221 <Field ViewGroup mTouchInterceptionViewGroup>
	//*  41   99:ifnonnull       114
					parent = (ViewGroup)getParent();
	//   42  102:aload_0         
	//   43  103:invokevirtual   #225 <Method android.view.ViewParent getParent()>
	//   44  106:checkcast       #227 <Class ViewGroup>
	//   45  109:astore          4
				else
	//*  46  111:goto            120
					parent = mTouchInterceptionViewGroup;
	//   47  114:aload_0         
	//   48  115:getfield        #221 <Field ViewGroup mTouchInterceptionViewGroup>
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
	//   63  142:invokevirtual   #230 <Method int View.getLeft()>
	//   64  145:aload           5
	//   65  147:invokevirtual   #233 <Method int View.getScrollX()>
	//   66  150:isub            
	//   67  151:i2f             
	//   68  152:fadd            
	//   69  153:fstore_3        
					f += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
	//   70  154:fload_2         
	//   71  155:aload           5
	//   72  157:invokevirtual   #134 <Method int View.getTop()>
	//   73  160:aload           5
	//   74  162:invokevirtual   #236 <Method int View.getScrollY()>
	//   75  165:isub            
	//   76  166:i2f             
	//   77  167:fadd            
	//   78  168:fstore_2        
				}

	//   79  169:aload           5
	//   80  171:invokevirtual   #237 <Method android.view.ViewParent View.getParent()>
	//   81  174:checkcast       #87  <Class View>
	//   82  177:astore          5
	//*  83  179:goto            127
				final MotionEvent event = MotionEvent.obtainNoHistory(motionevent);
	//   84  182:aload_1         
	//   85  183:invokestatic    #215 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   86  186:astore          5
				event.offsetLocation(f1, f);
	//   87  188:aload           5
	//   88  190:fload_3         
	//   89  191:fload_2         
	//   90  192:invokevirtual   #241 <Method void MotionEvent.offsetLocation(float, float)>
				if(parent.onInterceptTouchEvent(event))
	//*  91  195:aload           4
	//*  92  197:aload           5
	//*  93  199:invokevirtual   #242 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//*  94  202:ifeq            235
				{
					mIntercepted = true;
	//   95  205:aload_0         
	//   96  206:iconst_1        
	//   97  207:putfield        #219 <Field boolean mIntercepted>
					event.setAction(0);
	//   98  210:aload           5
	//   99  212:iconst_0        
	//  100  213:invokevirtual   #246 <Method void MotionEvent.setAction(int)>
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

						final ObservableGridView this$0;
						final MotionEvent val$event;
						final ViewGroup val$parent;

			
			{
				this$0 = ObservableGridView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ObservableGridView this$0>
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
	//  102  217:new             #10  <Class ObservableGridView$2>
	//  103  220:dup             
	//  104  221:aload_0         
	//  105  222:aload           4
	//  106  224:aload           5
	//  107  226:invokespecial   #249 <Method void ObservableGridView$2(ObservableGridView, ViewGroup, MotionEvent)>
	//  108  229:invokevirtual   #253 <Method boolean post(Runnable)>
	//  109  232:pop             
					return false;
	//  110  233:iconst_0        
	//  111  234:ireturn         
				} else
				{
					return super.onTouchEvent(motionevent);
	//  112  235:aload_0         
	//  113  236:aload_1         
	//  114  237:invokespecial   #255 <Method boolean GridView.onTouchEvent(MotionEvent)>
	//  115  240:ireturn         
				}

			case 1: // '\001'
			case 3: // '\003'
				mIntercepted = false;
	//  116  241:aload_0         
	//  117  242:iconst_0        
	//  118  243:putfield        #219 <Field boolean mIntercepted>
				mDragging = false;
	//  119  246:aload_0         
	//  120  247:iconst_0        
	//  121  248:putfield        #140 <Field boolean mDragging>
				mCallbacks.onUpOrCancelMotionEvent(mScrollState);
	//  122  251:aload_0         
	//  123  252:getfield        #105 <Field ObservableScrollViewCallbacks mCallbacks>
	//  124  255:aload_0         
	//  125  256:getfield        #154 <Field ScrollState mScrollState>
	//  126  259:invokeinterface #259 <Method void ObservableScrollViewCallbacks.onUpOrCancelMotionEvent(ScrollState)>
				break;
			}
		return super.onTouchEvent(motionevent);
	//  127  264:aload_0         
	//  128  265:aload_1         
	//  129  266:invokespecial   #255 <Method boolean GridView.onTouchEvent(MotionEvent)>
	//  130  269:ireturn         
	}

	public void scrollVerticallyTo(int i)
	{
		scrollTo(0, i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #263 <Method void scrollTo(int, int)>
	//    4    6:return          
	}

	public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
	{
		mOriginalScrollListener = onscrolllistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field android.widget.AbsListView$OnScrollListener mOriginalScrollListener>
	//    3    5:return          
	}

	public void setScrollViewCallbacks(ObservableScrollViewCallbacks observablescrollviewcallbacks)
	{
		mCallbacks = observablescrollviewcallbacks;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field ObservableScrollViewCallbacks mCallbacks>
	//    3    5:return          
	}

	public void setTouchInterceptionViewGroup(ViewGroup viewgroup)
	{
		mTouchInterceptionViewGroup = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #221 <Field ViewGroup mTouchInterceptionViewGroup>
	//    3    5:return          
	}

	private ObservableScrollViewCallbacks mCallbacks;
	private SparseIntArray mChildrenHeights;
	private boolean mDragging;
	private boolean mFirstScroll;
	private boolean mIntercepted;
	private android.widget.AbsListView.OnScrollListener mOriginalScrollListener;
	private int mPrevFirstVisibleChildHeight;
	private int mPrevFirstVisiblePosition;
	private MotionEvent mPrevMoveEvent;
	private int mPrevScrollY;
	private int mPrevScrolledChildrenHeight;
	private android.widget.AbsListView.OnScrollListener mScrollListener = new android.widget.AbsListView.OnScrollListener() {

		public void onScroll(AbsListView abslistview, int i, int j, int k)
		{
			if(mOriginalScrollListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field ObservableGridView this$0>
		//*   2    4:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableGridView.access$000(ObservableGridView)>
		//*   3    7:ifnull          27
				mOriginalScrollListener.onScroll(abslistview, i, j, k);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field ObservableGridView this$0>
		//    6   14:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableGridView.access$000(ObservableGridView)>
		//    7   17:aload_1         
		//    8   18:iload_2         
		//    9   19:iload_3         
		//   10   20:iload           4
		//   11   22:invokeinterface #26  <Method void android.widget.AbsListView$OnScrollListener.onScroll(AbsListView, int, int, int)>
			onScrollChanged();
		//   12   27:aload_0         
		//   13   28:getfield        #14  <Field ObservableGridView this$0>
		//   14   31:invokestatic    #29  <Method void ObservableGridView.access$100(ObservableGridView)>
		//   15   34:return          
		}

		public void onScrollStateChanged(AbsListView abslistview, int i)
		{
			if(mOriginalScrollListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field ObservableGridView this$0>
		//*   2    4:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableGridView.access$000(ObservableGridView)>
		//*   3    7:ifnull          24
				mOriginalScrollListener.onScrollStateChanged(abslistview, i);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field ObservableGridView this$0>
		//    6   14:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableGridView.access$000(ObservableGridView)>
		//    7   17:aload_1         
		//    8   18:iload_2         
		//    9   19:invokeinterface #33  <Method void android.widget.AbsListView$OnScrollListener.onScrollStateChanged(AbsListView, int)>
		//   10   24:return          
		}

		final ObservableGridView this$0;

			
			{
				this$0 = ObservableGridView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ObservableGridView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private ScrollState mScrollState;
	private int mScrollY;
	private ViewGroup mTouchInterceptionViewGroup;


/*
	static android.widget.AbsListView.OnScrollListener access$000(ObservableGridView observablegridview)
	{
		return observablegridview.mOriginalScrollListener;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field android.widget.AbsListView$OnScrollListener mOriginalScrollListener>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(ObservableGridView observablegridview)
	{
		observablegridview.onScrollChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void onScrollChanged()>
		return;
	//    2    4:return          
	}

*/
}
