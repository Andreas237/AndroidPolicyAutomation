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
import android.widget.ListView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			Scrollable, ObservableScrollViewCallbacks, ScrollState

public class ObservableListView extends ListView
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


	public ObservableListView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void ListView(Context)>
		mPrevFirstVisibleChildHeight = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//    6   10:aload_0         
	//    7   11:new             #8   <Class ObservableListView$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #47  <Method void ObservableListView$1(ObservableListView)>
	//   11   19:putfield        #49  <Field android.widget.AbsListView$OnScrollListener mScrollListener>
		init();
	//   12   22:aload_0         
	//   13   23:invokespecial   #53  <Method void init()>
	//   14   26:return          
	}

	public ObservableListView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #57  <Method void ListView(Context, AttributeSet)>
		mPrevFirstVisibleChildHeight = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//    7   11:aload_0         
	//    8   12:new             #8   <Class ObservableListView$1>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #47  <Method void ObservableListView$1(ObservableListView)>
	//   12   20:putfield        #49  <Field android.widget.AbsListView$OnScrollListener mScrollListener>
		init();
	//   13   23:aload_0         
	//   14   24:invokespecial   #53  <Method void init()>
	//   15   27:return          
	}

	public ObservableListView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #60  <Method void ListView(Context, AttributeSet, int)>
		mPrevFirstVisibleChildHeight = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//    8   12:aload_0         
	//    9   13:new             #8   <Class ObservableListView$1>
	//   10   16:dup             
	//   11   17:aload_0         
	//   12   18:invokespecial   #47  <Method void ObservableListView$1(ObservableListView)>
	//   13   21:putfield        #49  <Field android.widget.AbsListView$OnScrollListener mScrollListener>
		init();
	//   14   24:aload_0         
	//   15   25:invokespecial   #53  <Method void init()>
	//   16   28:return          
	}

	private void init()
	{
		mChildrenHeights = new SparseIntArray();
	//    0    0:aload_0         
	//    1    1:new             #70  <Class SparseIntArray>
	//    2    4:dup             
	//    3    5:invokespecial   #72  <Method void SparseIntArray()>
	//    4    8:putfield        #74  <Field SparseIntArray mChildrenHeights>
		super.setOnScrollListener(mScrollListener);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field android.widget.AbsListView$OnScrollListener mScrollListener>
	//    8   16:invokespecial   #78  <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
	//    9   19:return          
	}

	private void onScrollChanged()
	{
		if(mCallbacks != null && getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          453
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #84  <Method int getChildCount()>
	//*   5   11:ifle            453
		{
			int i2 = getFirstVisiblePosition();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #87  <Method int getFirstVisiblePosition()>
	//    8   18:istore          4
			int l = getFirstVisiblePosition();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #87  <Method int getFirstVisiblePosition()>
	//   11   24:istore_2        
			for(int i = 0; l <= getLastVisiblePosition(); i++)
	//*  12   25:iconst_0        
	//*  13   26:istore_1        
	//*  14   27:iload_2         
	//*  15   28:aload_0         
	//*  16   29:invokevirtual   #90  <Method int getLastVisiblePosition()>
	//*  17   32:icmpgt          92
			{
				if(mChildrenHeights.indexOfKey(l) < 0 || getChildAt(i).getHeight() != mChildrenHeights.get(l))
	//*  18   35:aload_0         
	//*  19   36:getfield        #74  <Field SparseIntArray mChildrenHeights>
	//*  20   39:iload_2         
	//*  21   40:invokevirtual   #94  <Method int SparseIntArray.indexOfKey(int)>
	//*  22   43:iflt            65
	//*  23   46:aload_0         
	//*  24   47:iload_1         
	//*  25   48:invokevirtual   #98  <Method View getChildAt(int)>
	//*  26   51:invokevirtual   #103 <Method int View.getHeight()>
	//*  27   54:aload_0         
	//*  28   55:getfield        #74  <Field SparseIntArray mChildrenHeights>
	//*  29   58:iload_2         
	//*  30   59:invokevirtual   #106 <Method int SparseIntArray.get(int)>
	//*  31   62:icmpeq          81
					mChildrenHeights.put(l, getChildAt(i).getHeight());
	//   32   65:aload_0         
	//   33   66:getfield        #74  <Field SparseIntArray mChildrenHeights>
	//   34   69:iload_2         
	//   35   70:aload_0         
	//   36   71:iload_1         
	//   37   72:invokevirtual   #98  <Method View getChildAt(int)>
	//   38   75:invokevirtual   #103 <Method int View.getHeight()>
	//   39   78:invokevirtual   #110 <Method void SparseIntArray.put(int, int)>
				l++;
	//   40   81:iload_2         
	//   41   82:iconst_1        
	//   42   83:iadd            
	//   43   84:istore_2        
			}

	//   44   85:iload_1         
	//   45   86:iconst_1        
	//   46   87:iadd            
	//   47   88:istore_1        
	//*  48   89:goto            27
			View view = getChildAt(0);
	//   49   92:aload_0         
	//   50   93:iconst_0        
	//   51   94:invokevirtual   #98  <Method View getChildAt(int)>
	//   52   97:astore          5
			if(view != null)
	//*  53   99:aload           5
	//*  54  101:ifnull          453
			{
				if(mPrevFirstVisiblePosition < i2)
	//*  55  104:aload_0         
	//*  56  105:getfield        #112 <Field int mPrevFirstVisiblePosition>
	//*  57  108:iload           4
	//*  58  110:icmpge          210
				{
					int k1;
					if(i2 - mPrevFirstVisiblePosition != 1)
	//*  59  113:iload           4
	//*  60  115:aload_0         
	//*  61  116:getfield        #112 <Field int mPrevFirstVisiblePosition>
	//*  62  119:isub            
	//*  63  120:iconst_1        
	//*  64  121:icmpeq          181
					{
						int i1 = i2 - 1;
	//   65  124:iload           4
	//   66  126:iconst_1        
	//   67  127:isub            
	//   68  128:istore_2        
						int j = 0;
	//   69  129:iconst_0        
	//   70  130:istore_1        
						do
						{
							k1 = j;
	//   71  131:iload_1         
	//   72  132:istore_3        
							if(i1 <= mPrevFirstVisiblePosition)
								break;
	//   73  133:iload_2         
	//   74  134:aload_0         
	//   75  135:getfield        #112 <Field int mPrevFirstVisiblePosition>
	//   76  138:icmple          183
							if(mChildrenHeights.indexOfKey(i1) > 0)
	//*  77  141:aload_0         
	//*  78  142:getfield        #74  <Field SparseIntArray mChildrenHeights>
	//*  79  145:iload_2         
	//*  80  146:invokevirtual   #94  <Method int SparseIntArray.indexOfKey(int)>
	//*  81  149:ifle            166
								j += mChildrenHeights.get(i1);
	//   82  152:iload_1         
	//   83  153:aload_0         
	//   84  154:getfield        #74  <Field SparseIntArray mChildrenHeights>
	//   85  157:iload_2         
	//   86  158:invokevirtual   #106 <Method int SparseIntArray.get(int)>
	//   87  161:iadd            
	//   88  162:istore_1        
							else
	//*  89  163:goto            174
								j += view.getHeight();
	//   90  166:iload_1         
	//   91  167:aload           5
	//   92  169:invokevirtual   #103 <Method int View.getHeight()>
	//   93  172:iadd            
	//   94  173:istore_1        
							i1--;
	//   95  174:iload_2         
	//   96  175:iconst_1        
	//   97  176:isub            
	//   98  177:istore_2        
						} while(true);
	//   99  178:goto            131
					} else
					{
						k1 = 0;
	//  100  181:iconst_0        
	//  101  182:istore_3        
					}
					mPrevScrolledChildrenHeight = mPrevScrolledChildrenHeight + (mPrevFirstVisibleChildHeight + k1);
	//  102  183:aload_0         
	//  103  184:aload_0         
	//  104  185:getfield        #114 <Field int mPrevScrolledChildrenHeight>
	//  105  188:aload_0         
	//  106  189:getfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//  107  192:iload_3         
	//  108  193:iadd            
	//  109  194:iadd            
	//  110  195:putfield        #114 <Field int mPrevScrolledChildrenHeight>
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  111  198:aload_0         
	//  112  199:aload           5
	//  113  201:invokevirtual   #103 <Method int View.getHeight()>
	//  114  204:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
				} else
	//* 115  207:goto            331
				if(i2 < mPrevFirstVisiblePosition)
	//* 116  210:iload           4
	//* 117  212:aload_0         
	//* 118  213:getfield        #112 <Field int mPrevFirstVisiblePosition>
	//* 119  216:icmpge          317
				{
					int l1;
					if(mPrevFirstVisiblePosition - i2 != 1)
	//* 120  219:aload_0         
	//* 121  220:getfield        #112 <Field int mPrevFirstVisiblePosition>
	//* 122  223:iload           4
	//* 123  225:isub            
	//* 124  226:iconst_1        
	//* 125  227:icmpeq          287
					{
						int j1 = mPrevFirstVisiblePosition - 1;
	//  126  230:aload_0         
	//  127  231:getfield        #112 <Field int mPrevFirstVisiblePosition>
	//  128  234:iconst_1        
	//  129  235:isub            
	//  130  236:istore_2        
						int k = 0;
	//  131  237:iconst_0        
	//  132  238:istore_1        
						do
						{
							l1 = k;
	//  133  239:iload_1         
	//  134  240:istore_3        
							if(j1 <= i2)
								break;
	//  135  241:iload_2         
	//  136  242:iload           4
	//  137  244:icmple          289
							if(mChildrenHeights.indexOfKey(j1) > 0)
	//* 138  247:aload_0         
	//* 139  248:getfield        #74  <Field SparseIntArray mChildrenHeights>
	//* 140  251:iload_2         
	//* 141  252:invokevirtual   #94  <Method int SparseIntArray.indexOfKey(int)>
	//* 142  255:ifle            272
								k += mChildrenHeights.get(j1);
	//  143  258:iload_1         
	//  144  259:aload_0         
	//  145  260:getfield        #74  <Field SparseIntArray mChildrenHeights>
	//  146  263:iload_2         
	//  147  264:invokevirtual   #106 <Method int SparseIntArray.get(int)>
	//  148  267:iadd            
	//  149  268:istore_1        
							else
	//* 150  269:goto            280
								k += view.getHeight();
	//  151  272:iload_1         
	//  152  273:aload           5
	//  153  275:invokevirtual   #103 <Method int View.getHeight()>
	//  154  278:iadd            
	//  155  279:istore_1        
							j1--;
	//  156  280:iload_2         
	//  157  281:iconst_1        
	//  158  282:isub            
	//  159  283:istore_2        
						} while(true);
	//  160  284:goto            239
					} else
					{
						l1 = 0;
	//  161  287:iconst_0        
	//  162  288:istore_3        
					}
					mPrevScrolledChildrenHeight = mPrevScrolledChildrenHeight - (view.getHeight() + l1);
	//  163  289:aload_0         
	//  164  290:aload_0         
	//  165  291:getfield        #114 <Field int mPrevScrolledChildrenHeight>
	//  166  294:aload           5
	//  167  296:invokevirtual   #103 <Method int View.getHeight()>
	//  168  299:iload_3         
	//  169  300:iadd            
	//  170  301:isub            
	//  171  302:putfield        #114 <Field int mPrevScrolledChildrenHeight>
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  172  305:aload_0         
	//  173  306:aload           5
	//  174  308:invokevirtual   #103 <Method int View.getHeight()>
	//  175  311:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
				} else
	//* 176  314:goto            331
				if(i2 == 0)
	//* 177  317:iload           4
	//* 178  319:ifne            331
					mPrevFirstVisibleChildHeight = view.getHeight();
	//  179  322:aload_0         
	//  180  323:aload           5
	//  181  325:invokevirtual   #103 <Method int View.getHeight()>
	//  182  328:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
				if(mPrevFirstVisibleChildHeight < 0)
	//* 183  331:aload_0         
	//* 184  332:getfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//* 185  335:ifge            343
					mPrevFirstVisibleChildHeight = 0;
	//  186  338:aload_0         
	//  187  339:iconst_0        
	//  188  340:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
				mScrollY = mPrevScrolledChildrenHeight - view.getTop();
	//  189  343:aload_0         
	//  190  344:aload_0         
	//  191  345:getfield        #114 <Field int mPrevScrolledChildrenHeight>
	//  192  348:aload           5
	//  193  350:invokevirtual   #117 <Method int View.getTop()>
	//  194  353:isub            
	//  195  354:putfield        #119 <Field int mScrollY>
				mPrevFirstVisiblePosition = i2;
	//  196  357:aload_0         
	//  197  358:iload           4
	//  198  360:putfield        #112 <Field int mPrevFirstVisiblePosition>
				mCallbacks.onScrollChanged(mScrollY, mFirstScroll, mDragging);
	//  199  363:aload_0         
	//  200  364:getfield        #80  <Field ObservableScrollViewCallbacks mCallbacks>
	//  201  367:aload_0         
	//  202  368:getfield        #119 <Field int mScrollY>
	//  203  371:aload_0         
	//  204  372:getfield        #121 <Field boolean mFirstScroll>
	//  205  375:aload_0         
	//  206  376:getfield        #123 <Field boolean mDragging>
	//  207  379:invokeinterface #128 <Method void ObservableScrollViewCallbacks.onScrollChanged(int, boolean, boolean)>
				if(mFirstScroll)
	//* 208  384:aload_0         
	//* 209  385:getfield        #121 <Field boolean mFirstScroll>
	//* 210  388:ifeq            396
					mFirstScroll = false;
	//  211  391:aload_0         
	//  212  392:iconst_0        
	//  213  393:putfield        #121 <Field boolean mFirstScroll>
				if(mPrevScrollY < mScrollY)
	//* 214  396:aload_0         
	//* 215  397:getfield        #130 <Field int mPrevScrollY>
	//* 216  400:aload_0         
	//* 217  401:getfield        #119 <Field int mScrollY>
	//* 218  404:icmpge          417
					mScrollState = ScrollState.UP;
	//  219  407:aload_0         
	//  220  408:getstatic       #135 <Field ScrollState ScrollState.UP>
	//  221  411:putfield        #137 <Field ScrollState mScrollState>
				else
	//* 222  414:goto            445
				if(mScrollY < mPrevScrollY)
	//* 223  417:aload_0         
	//* 224  418:getfield        #119 <Field int mScrollY>
	//* 225  421:aload_0         
	//* 226  422:getfield        #130 <Field int mPrevScrollY>
	//* 227  425:icmpge          438
					mScrollState = ScrollState.DOWN;
	//  228  428:aload_0         
	//  229  429:getstatic       #140 <Field ScrollState ScrollState.DOWN>
	//  230  432:putfield        #137 <Field ScrollState mScrollState>
				else
	//* 231  435:goto            445
					mScrollState = ScrollState.STOP;
	//  232  438:aload_0         
	//  233  439:getstatic       #143 <Field ScrollState ScrollState.STOP>
	//  234  442:putfield        #137 <Field ScrollState mScrollState>
				mPrevScrollY = mScrollY;
	//  235  445:aload_0         
	//  236  446:aload_0         
	//  237  447:getfield        #119 <Field int mScrollY>
	//  238  450:putfield        #130 <Field int mPrevScrollY>
			}
		}
	//  239  453:return          
	}

	public int getCurrentScrollY()
	{
		return mScrollY;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int mScrollY>
	//    2    4:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null && motionevent.getActionMasked() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          36
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #151 <Method int MotionEvent.getActionMasked()>
	//*   5   11:ifeq            17
	//*   6   14:goto            36
		{
			mDragging = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #123 <Field boolean mDragging>
			mFirstScroll = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #121 <Field boolean mFirstScroll>
			mCallbacks.onDownMotionEvent();
	//   13   27:aload_0         
	//   14   28:getfield        #80  <Field ObservableScrollViewCallbacks mCallbacks>
	//   15   31:invokeinterface #154 <Method void ObservableScrollViewCallbacks.onDownMotionEvent()>
		}
		return super.onInterceptTouchEvent(motionevent);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokespecial   #156 <Method boolean ListView.onInterceptTouchEvent(MotionEvent)>
	//   19   41:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #12  <Class ObservableListView$SavedState>
	//    2    4:astore_1        
		mPrevFirstVisiblePosition = ((SavedState) (parcelable)).prevFirstVisiblePosition;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #161 <Field int ObservableListView$SavedState.prevFirstVisiblePosition>
	//    6   10:putfield        #112 <Field int mPrevFirstVisiblePosition>
		mPrevFirstVisibleChildHeight = ((SavedState) (parcelable)).prevFirstVisibleChildHeight;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #164 <Field int ObservableListView$SavedState.prevFirstVisibleChildHeight>
	//   10   18:putfield        #44  <Field int mPrevFirstVisibleChildHeight>
		mPrevScrolledChildrenHeight = ((SavedState) (parcelable)).prevScrolledChildrenHeight;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #167 <Field int ObservableListView$SavedState.prevScrolledChildrenHeight>
	//   14   26:putfield        #114 <Field int mPrevScrolledChildrenHeight>
		mPrevScrollY = ((SavedState) (parcelable)).prevScrollY;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getfield        #170 <Field int ObservableListView$SavedState.prevScrollY>
	//   18   34:putfield        #130 <Field int mPrevScrollY>
		mScrollY = ((SavedState) (parcelable)).scrollY;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getfield        #173 <Field int ObservableListView$SavedState.scrollY>
	//   22   42:putfield        #119 <Field int mScrollY>
		mChildrenHeights = ((SavedState) (parcelable)).childrenHeights;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:getfield        #176 <Field SparseIntArray ObservableListView$SavedState.childrenHeights>
	//   26   50:putfield        #74  <Field SparseIntArray mChildrenHeights>
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #180 <Method Parcelable ObservableListView$SavedState.getSuperState()>
	//   30   58:invokespecial   #182 <Method void ListView.onRestoreInstanceState(Parcelable)>
	//   31   61:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #12  <Class ObservableListView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #185 <Method Parcelable ListView.onSaveInstanceState()>
	//    4    8:invokespecial   #187 <Method void ObservableListView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.prevFirstVisiblePosition = mPrevFirstVisiblePosition;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #112 <Field int mPrevFirstVisiblePosition>
	//    9   17:putfield        #161 <Field int ObservableListView$SavedState.prevFirstVisiblePosition>
		savedstate.prevFirstVisibleChildHeight = mPrevFirstVisibleChildHeight;
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #44  <Field int mPrevFirstVisibleChildHeight>
	//   13   25:putfield        #164 <Field int ObservableListView$SavedState.prevFirstVisibleChildHeight>
		savedstate.prevScrolledChildrenHeight = mPrevScrolledChildrenHeight;
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #114 <Field int mPrevScrolledChildrenHeight>
	//   17   33:putfield        #167 <Field int ObservableListView$SavedState.prevScrolledChildrenHeight>
		savedstate.prevScrollY = mPrevScrollY;
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #130 <Field int mPrevScrollY>
	//   21   41:putfield        #170 <Field int ObservableListView$SavedState.prevScrollY>
		savedstate.scrollY = mScrollY;
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #119 <Field int mScrollY>
	//   25   49:putfield        #173 <Field int ObservableListView$SavedState.scrollY>
		savedstate.childrenHeights = mChildrenHeights;
	//   26   52:aload_1         
	//   27   53:aload_0         
	//   28   54:getfield        #74  <Field SparseIntArray mChildrenHeights>
	//   29   57:putfield        #176 <Field SparseIntArray ObservableListView$SavedState.childrenHeights>
		return ((Parcelable) (savedstate));
	//   30   60:aload_1         
	//   31   61:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          264
			switch(motionevent.getActionMasked())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #151 <Method int MotionEvent.getActionMasked()>
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
	//*   8   40:getfield        #190 <Field MotionEvent mPrevMoveEvent>
	//*   9   43:ifnonnull       51
					mPrevMoveEvent = motionevent;
	//   10   46:aload_0         
	//   11   47:aload_1         
	//   12   48:putfield        #190 <Field MotionEvent mPrevMoveEvent>
				float f = motionevent.getY();
	//   13   51:aload_1         
	//   14   52:invokevirtual   #194 <Method float MotionEvent.getY()>
	//   15   55:fstore_2        
				float f1 = mPrevMoveEvent.getY();
	//   16   56:aload_0         
	//   17   57:getfield        #190 <Field MotionEvent mPrevMoveEvent>
	//   18   60:invokevirtual   #194 <Method float MotionEvent.getY()>
	//   19   63:fstore_3        
				mPrevMoveEvent = MotionEvent.obtainNoHistory(motionevent);
	//   20   64:aload_0         
	//   21   65:aload_1         
	//   22   66:invokestatic    #198 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   23   69:putfield        #190 <Field MotionEvent mPrevMoveEvent>
				if((float)getCurrentScrollY() - (f - f1) > 0.0F)
					break;
	//   24   72:aload_0         
	//   25   73:invokevirtual   #200 <Method int getCurrentScrollY()>
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
	//*  35   87:getfield        #202 <Field boolean mIntercepted>
	//*  36   90:ifeq            95
					return false;
	//   37   93:iconst_0        
	//   38   94:ireturn         
				final ViewGroup parent;
				if(mTouchInterceptionViewGroup == null)
	//*  39   95:aload_0         
	//*  40   96:getfield        #204 <Field ViewGroup mTouchInterceptionViewGroup>
	//*  41   99:ifnonnull       114
					parent = (ViewGroup)getParent();
	//   42  102:aload_0         
	//   43  103:invokevirtual   #208 <Method android.view.ViewParent getParent()>
	//   44  106:checkcast       #210 <Class ViewGroup>
	//   45  109:astore          4
				else
	//*  46  111:goto            120
					parent = mTouchInterceptionViewGroup;
	//   47  114:aload_0         
	//   48  115:getfield        #204 <Field ViewGroup mTouchInterceptionViewGroup>
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
	//   63  142:invokevirtual   #213 <Method int View.getLeft()>
	//   64  145:aload           5
	//   65  147:invokevirtual   #216 <Method int View.getScrollX()>
	//   66  150:isub            
	//   67  151:i2f             
	//   68  152:fadd            
	//   69  153:fstore_3        
					f += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
	//   70  154:fload_2         
	//   71  155:aload           5
	//   72  157:invokevirtual   #117 <Method int View.getTop()>
	//   73  160:aload           5
	//   74  162:invokevirtual   #219 <Method int View.getScrollY()>
	//   75  165:isub            
	//   76  166:i2f             
	//   77  167:fadd            
	//   78  168:fstore_2        
				}

	//   79  169:aload           5
	//   80  171:invokevirtual   #220 <Method android.view.ViewParent View.getParent()>
	//   81  174:checkcast       #100 <Class View>
	//   82  177:astore          5
	//*  83  179:goto            127
				final MotionEvent event = MotionEvent.obtainNoHistory(motionevent);
	//   84  182:aload_1         
	//   85  183:invokestatic    #198 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   86  186:astore          5
				event.offsetLocation(f1, f);
	//   87  188:aload           5
	//   88  190:fload_3         
	//   89  191:fload_2         
	//   90  192:invokevirtual   #224 <Method void MotionEvent.offsetLocation(float, float)>
				if(parent.onInterceptTouchEvent(event))
	//*  91  195:aload           4
	//*  92  197:aload           5
	//*  93  199:invokevirtual   #225 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//*  94  202:ifeq            235
				{
					mIntercepted = true;
	//   95  205:aload_0         
	//   96  206:iconst_1        
	//   97  207:putfield        #202 <Field boolean mIntercepted>
					event.setAction(0);
	//   98  210:aload           5
	//   99  212:iconst_0        
	//  100  213:invokevirtual   #229 <Method void MotionEvent.setAction(int)>
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

						final ObservableListView this$0;
						final MotionEvent val$event;
						final ViewGroup val$parent;

			
			{
				this$0 = ObservableListView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ObservableListView this$0>
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
	//  102  217:new             #10  <Class ObservableListView$2>
	//  103  220:dup             
	//  104  221:aload_0         
	//  105  222:aload           4
	//  106  224:aload           5
	//  107  226:invokespecial   #232 <Method void ObservableListView$2(ObservableListView, ViewGroup, MotionEvent)>
	//  108  229:invokevirtual   #236 <Method boolean post(Runnable)>
	//  109  232:pop             
					return false;
	//  110  233:iconst_0        
	//  111  234:ireturn         
				} else
				{
					return super.onTouchEvent(motionevent);
	//  112  235:aload_0         
	//  113  236:aload_1         
	//  114  237:invokespecial   #238 <Method boolean ListView.onTouchEvent(MotionEvent)>
	//  115  240:ireturn         
				}

			case 1: // '\001'
			case 3: // '\003'
				mIntercepted = false;
	//  116  241:aload_0         
	//  117  242:iconst_0        
	//  118  243:putfield        #202 <Field boolean mIntercepted>
				mDragging = false;
	//  119  246:aload_0         
	//  120  247:iconst_0        
	//  121  248:putfield        #123 <Field boolean mDragging>
				mCallbacks.onUpOrCancelMotionEvent(mScrollState);
	//  122  251:aload_0         
	//  123  252:getfield        #80  <Field ObservableScrollViewCallbacks mCallbacks>
	//  124  255:aload_0         
	//  125  256:getfield        #137 <Field ScrollState mScrollState>
	//  126  259:invokeinterface #242 <Method void ObservableScrollViewCallbacks.onUpOrCancelMotionEvent(ScrollState)>
				break;
			}
		return super.onTouchEvent(motionevent);
	//  127  264:aload_0         
	//  128  265:aload_1         
	//  129  266:invokespecial   #238 <Method boolean ListView.onTouchEvent(MotionEvent)>
	//  130  269:ireturn         
	}

	public void scrollVerticallyTo(int i)
	{
		View view = getChildAt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #98  <Method View getChildAt(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
			setSelection(i / view.getHeight());
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #103 <Method int View.getHeight()>
	//   10   16:idiv            
	//   11   17:invokevirtual   #246 <Method void setSelection(int)>
	//   12   20:return          
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
	//    2    2:putfield        #80  <Field ObservableScrollViewCallbacks mCallbacks>
	//    3    5:return          
	}

	public void setTouchInterceptionViewGroup(ViewGroup viewgroup)
	{
		mTouchInterceptionViewGroup = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #204 <Field ViewGroup mTouchInterceptionViewGroup>
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
		//*   1    1:getfield        #14  <Field ObservableListView this$0>
		//*   2    4:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableListView.access$000(ObservableListView)>
		//*   3    7:ifnull          27
				mOriginalScrollListener.onScroll(abslistview, i, j, k);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field ObservableListView this$0>
		//    6   14:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableListView.access$000(ObservableListView)>
		//    7   17:aload_1         
		//    8   18:iload_2         
		//    9   19:iload_3         
		//   10   20:iload           4
		//   11   22:invokeinterface #26  <Method void android.widget.AbsListView$OnScrollListener.onScroll(AbsListView, int, int, int)>
			onScrollChanged();
		//   12   27:aload_0         
		//   13   28:getfield        #14  <Field ObservableListView this$0>
		//   14   31:invokestatic    #29  <Method void ObservableListView.access$100(ObservableListView)>
		//   15   34:return          
		}

		public void onScrollStateChanged(AbsListView abslistview, int i)
		{
			if(mOriginalScrollListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field ObservableListView this$0>
		//*   2    4:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableListView.access$000(ObservableListView)>
		//*   3    7:ifnull          24
				mOriginalScrollListener.onScrollStateChanged(abslistview, i);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field ObservableListView this$0>
		//    6   14:invokestatic    #24  <Method android.widget.AbsListView$OnScrollListener ObservableListView.access$000(ObservableListView)>
		//    7   17:aload_1         
		//    8   18:iload_2         
		//    9   19:invokeinterface #33  <Method void android.widget.AbsListView$OnScrollListener.onScrollStateChanged(AbsListView, int)>
		//   10   24:return          
		}

		final ObservableListView this$0;

			
			{
				this$0 = ObservableListView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ObservableListView this$0>
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
	static android.widget.AbsListView.OnScrollListener access$000(ObservableListView observablelistview)
	{
		return observablelistview.mOriginalScrollListener;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field android.widget.AbsListView$OnScrollListener mOriginalScrollListener>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(ObservableListView observablelistview)
	{
		observablelistview.onScrollChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void onScrollChanged()>
		return;
	//    2    4:return          
	}

*/
}
