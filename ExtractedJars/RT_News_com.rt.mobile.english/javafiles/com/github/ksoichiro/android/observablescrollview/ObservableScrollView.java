// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.*;
import android.widget.ScrollView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			Scrollable, ObservableScrollViewCallbacks, ScrollState

public class ObservableScrollView extends ScrollView
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
		//    3    3:invokespecial   #45  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(prevScrollY);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #34  <Field int prevScrollY>
		//    7   11:invokevirtual   #49  <Method void Parcel.writeInt(int)>
			parcel.writeInt(scrollY);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #36  <Field int scrollY>
		//   11   19:invokevirtual   #49  <Method void Parcel.writeInt(int)>
		//   12   22:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class ObservableScrollView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void ObservableScrollView$SavedState(Parcel, ObservableScrollView$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method ObservableScrollView$SavedState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #30  <Method ObservableScrollView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int prevScrollY;
		int scrollY;

		static 
		{
		//    0    0:new             #9   <Class ObservableScrollView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void ObservableScrollView$SavedState$1()>
		//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void android.view.View$BaseSavedState(Parcel)>
			prevScrollY = parcel.readInt();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #32  <Method int Parcel.readInt()>
		//    6   10:putfield        #34  <Field int prevScrollY>
			scrollY = parcel.readInt();
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokevirtual   #32  <Method int Parcel.readInt()>
		//   10   18:putfield        #36  <Field int scrollY>
		//   11   21:return          
		}


		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void android.view.View$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public ObservableScrollView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void ScrollView(Context)>
	//    3    5:return          
	}

	public ObservableScrollView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void ScrollView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ObservableScrollView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #39  <Method void ScrollView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public int getCurrentScrollY()
	{
		return mScrollY;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mScrollY>
	//    2    4:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null && motionevent.getActionMasked() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          36
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #52  <Method int MotionEvent.getActionMasked()>
	//*   5   11:ifeq            17
	//*   6   14:goto            36
		{
			mDragging = true;
	//    7   17:aload_0         
	//    8   18:iconst_1        
	//    9   19:putfield        #54  <Field boolean mDragging>
			mFirstScroll = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #56  <Field boolean mFirstScroll>
			mCallbacks.onDownMotionEvent();
	//   13   27:aload_0         
	//   14   28:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//   15   31:invokeinterface #62  <Method void ObservableScrollViewCallbacks.onDownMotionEvent()>
		}
		return super.onInterceptTouchEvent(motionevent);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:invokespecial   #64  <Method boolean ScrollView.onInterceptTouchEvent(MotionEvent)>
	//   19   41:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #10  <Class ObservableScrollView$SavedState>
	//    2    4:astore_1        
		mPrevScrollY = ((SavedState) (parcelable)).prevScrollY;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #69  <Field int ObservableScrollView$SavedState.prevScrollY>
	//    6   10:putfield        #71  <Field int mPrevScrollY>
		mScrollY = ((SavedState) (parcelable)).scrollY;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #74  <Field int ObservableScrollView$SavedState.scrollY>
	//   10   18:putfield        #43  <Field int mScrollY>
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #78  <Method Parcelable ObservableScrollView$SavedState.getSuperState()>
	//   14   26:invokespecial   #80  <Method void ScrollView.onRestoreInstanceState(Parcelable)>
	//   15   29:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #10  <Class ObservableScrollView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #83  <Method Parcelable ScrollView.onSaveInstanceState()>
	//    4    8:invokespecial   #85  <Method void ObservableScrollView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.prevScrollY = mPrevScrollY;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #71  <Field int mPrevScrollY>
	//    9   17:putfield        #69  <Field int ObservableScrollView$SavedState.prevScrollY>
		savedstate.scrollY = mScrollY;
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field int mScrollY>
	//   13   25:putfield        #74  <Field int ObservableScrollView$SavedState.scrollY>
		return ((Parcelable) (savedstate));
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	protected void onScrollChanged(int i, int j, int k, int l)
	{
		super.onScrollChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #89  <Method void ScrollView.onScrollChanged(int, int, int, int)>
		if(mCallbacks != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   8   13:ifnull          89
		{
			mScrollY = j;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:putfield        #43  <Field int mScrollY>
			mCallbacks.onScrollChanged(j, mFirstScroll, mDragging);
	//   12   21:aload_0         
	//   13   22:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//   14   25:iload_2         
	//   15   26:aload_0         
	//   16   27:getfield        #56  <Field boolean mFirstScroll>
	//   17   30:aload_0         
	//   18   31:getfield        #54  <Field boolean mDragging>
	//   19   34:invokeinterface #92  <Method void ObservableScrollViewCallbacks.onScrollChanged(int, boolean, boolean)>
			if(mFirstScroll)
	//*  20   39:aload_0         
	//*  21   40:getfield        #56  <Field boolean mFirstScroll>
	//*  22   43:ifeq            51
				mFirstScroll = false;
	//   23   46:aload_0         
	//   24   47:iconst_0        
	//   25   48:putfield        #56  <Field boolean mFirstScroll>
			if(mPrevScrollY < j)
	//*  26   51:aload_0         
	//*  27   52:getfield        #71  <Field int mPrevScrollY>
	//*  28   55:iload_2         
	//*  29   56:icmpge          69
				mScrollState = ScrollState.UP;
	//   30   59:aload_0         
	//   31   60:getstatic       #97  <Field ScrollState ScrollState.UP>
	//   32   63:putfield        #99  <Field ScrollState mScrollState>
			else
	//*  33   66:goto            84
			if(j < mPrevScrollY)
	//*  34   69:iload_2         
	//*  35   70:aload_0         
	//*  36   71:getfield        #71  <Field int mPrevScrollY>
	//*  37   74:icmpge          84
				mScrollState = ScrollState.DOWN;
	//   38   77:aload_0         
	//   39   78:getstatic       #102 <Field ScrollState ScrollState.DOWN>
	//   40   81:putfield        #99  <Field ScrollState mScrollState>
			mPrevScrollY = j;
	//   41   84:aload_0         
	//   42   85:iload_2         
	//   43   86:putfield        #71  <Field int mPrevScrollY>
		}
	//   44   89:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          264
			switch(motionevent.getActionMasked())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #52  <Method int MotionEvent.getActionMasked()>
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
	//*   8   40:getfield        #105 <Field MotionEvent mPrevMoveEvent>
	//*   9   43:ifnonnull       51
					mPrevMoveEvent = motionevent;
	//   10   46:aload_0         
	//   11   47:aload_1         
	//   12   48:putfield        #105 <Field MotionEvent mPrevMoveEvent>
				float f = motionevent.getY();
	//   13   51:aload_1         
	//   14   52:invokevirtual   #109 <Method float MotionEvent.getY()>
	//   15   55:fstore_2        
				float f1 = mPrevMoveEvent.getY();
	//   16   56:aload_0         
	//   17   57:getfield        #105 <Field MotionEvent mPrevMoveEvent>
	//   18   60:invokevirtual   #109 <Method float MotionEvent.getY()>
	//   19   63:fstore_3        
				mPrevMoveEvent = MotionEvent.obtainNoHistory(motionevent);
	//   20   64:aload_0         
	//   21   65:aload_1         
	//   22   66:invokestatic    #113 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   23   69:putfield        #105 <Field MotionEvent mPrevMoveEvent>
				if((float)getCurrentScrollY() - (f - f1) > 0.0F)
					break;
	//   24   72:aload_0         
	//   25   73:invokevirtual   #115 <Method int getCurrentScrollY()>
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
	//*  35   87:getfield        #117 <Field boolean mIntercepted>
	//*  36   90:ifeq            95
					return false;
	//   37   93:iconst_0        
	//   38   94:ireturn         
				final ViewGroup parent;
				if(mTouchInterceptionViewGroup == null)
	//*  39   95:aload_0         
	//*  40   96:getfield        #119 <Field ViewGroup mTouchInterceptionViewGroup>
	//*  41   99:ifnonnull       114
					parent = (ViewGroup)getParent();
	//   42  102:aload_0         
	//   43  103:invokevirtual   #123 <Method android.view.ViewParent getParent()>
	//   44  106:checkcast       #125 <Class ViewGroup>
	//   45  109:astore          4
				else
	//*  46  111:goto            120
					parent = mTouchInterceptionViewGroup;
	//   47  114:aload_0         
	//   48  115:getfield        #119 <Field ViewGroup mTouchInterceptionViewGroup>
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
	//   63  142:invokevirtual   #130 <Method int View.getLeft()>
	//   64  145:aload           5
	//   65  147:invokevirtual   #133 <Method int View.getScrollX()>
	//   66  150:isub            
	//   67  151:i2f             
	//   68  152:fadd            
	//   69  153:fstore_3        
					f += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
	//   70  154:fload_2         
	//   71  155:aload           5
	//   72  157:invokevirtual   #136 <Method int View.getTop()>
	//   73  160:aload           5
	//   74  162:invokevirtual   #139 <Method int View.getScrollY()>
	//   75  165:isub            
	//   76  166:i2f             
	//   77  167:fadd            
	//   78  168:fstore_2        
				}

	//   79  169:aload           5
	//   80  171:invokevirtual   #140 <Method android.view.ViewParent View.getParent()>
	//   81  174:checkcast       #127 <Class View>
	//   82  177:astore          5
	//*  83  179:goto            127
				final MotionEvent event = MotionEvent.obtainNoHistory(motionevent);
	//   84  182:aload_1         
	//   85  183:invokestatic    #113 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   86  186:astore          5
				event.offsetLocation(f1, f);
	//   87  188:aload           5
	//   88  190:fload_3         
	//   89  191:fload_2         
	//   90  192:invokevirtual   #144 <Method void MotionEvent.offsetLocation(float, float)>
				if(parent.onInterceptTouchEvent(event))
	//*  91  195:aload           4
	//*  92  197:aload           5
	//*  93  199:invokevirtual   #145 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//*  94  202:ifeq            235
				{
					mIntercepted = true;
	//   95  205:aload_0         
	//   96  206:iconst_1        
	//   97  207:putfield        #117 <Field boolean mIntercepted>
					event.setAction(0);
	//   98  210:aload           5
	//   99  212:iconst_0        
	//  100  213:invokevirtual   #149 <Method void MotionEvent.setAction(int)>
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

						final ObservableScrollView this$0;
						final MotionEvent val$event;
						final ViewGroup val$parent;

			
			{
				this$0 = ObservableScrollView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ObservableScrollView this$0>
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
	//  102  217:new             #8   <Class ObservableScrollView$1>
	//  103  220:dup             
	//  104  221:aload_0         
	//  105  222:aload           4
	//  106  224:aload           5
	//  107  226:invokespecial   #152 <Method void ObservableScrollView$1(ObservableScrollView, ViewGroup, MotionEvent)>
	//  108  229:invokevirtual   #156 <Method boolean post(Runnable)>
	//  109  232:pop             
					return false;
	//  110  233:iconst_0        
	//  111  234:ireturn         
				} else
				{
					return super.onTouchEvent(motionevent);
	//  112  235:aload_0         
	//  113  236:aload_1         
	//  114  237:invokespecial   #158 <Method boolean ScrollView.onTouchEvent(MotionEvent)>
	//  115  240:ireturn         
				}

			case 1: // '\001'
			case 3: // '\003'
				mIntercepted = false;
	//  116  241:aload_0         
	//  117  242:iconst_0        
	//  118  243:putfield        #117 <Field boolean mIntercepted>
				mDragging = false;
	//  119  246:aload_0         
	//  120  247:iconst_0        
	//  121  248:putfield        #54  <Field boolean mDragging>
				mCallbacks.onUpOrCancelMotionEvent(mScrollState);
	//  122  251:aload_0         
	//  123  252:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//  124  255:aload_0         
	//  125  256:getfield        #99  <Field ScrollState mScrollState>
	//  126  259:invokeinterface #162 <Method void ObservableScrollViewCallbacks.onUpOrCancelMotionEvent(ScrollState)>
				break;
			}
		return super.onTouchEvent(motionevent);
	//  127  264:aload_0         
	//  128  265:aload_1         
	//  129  266:invokespecial   #158 <Method boolean ScrollView.onTouchEvent(MotionEvent)>
	//  130  269:ireturn         
	}

	public void scrollVerticallyTo(int i)
	{
		scrollTo(0, i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #167 <Method void scrollTo(int, int)>
	//    4    6:return          
	}

	public void setScrollViewCallbacks(ObservableScrollViewCallbacks observablescrollviewcallbacks)
	{
		mCallbacks = observablescrollviewcallbacks;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//    3    5:return          
	}

	public void setTouchInterceptionViewGroup(ViewGroup viewgroup)
	{
		mTouchInterceptionViewGroup = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field ViewGroup mTouchInterceptionViewGroup>
	//    3    5:return          
	}

	private ObservableScrollViewCallbacks mCallbacks;
	private boolean mDragging;
	private boolean mFirstScroll;
	private boolean mIntercepted;
	private MotionEvent mPrevMoveEvent;
	private int mPrevScrollY;
	private ScrollState mScrollState;
	private int mScrollY;
	private ViewGroup mTouchInterceptionViewGroup;
}
