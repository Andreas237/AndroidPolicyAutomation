// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.ksoichiro.android.observablescrollview;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.*;
import android.webkit.WebView;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//			Scrollable, ObservableScrollViewCallbacks, ScrollState

public class ObservableWebView extends WebView
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
			//    0    0:new             #9   <Class ObservableWebView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void ObservableWebView$SavedState(Parcel, ObservableWebView$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method ObservableWebView$SavedState createFromParcel(Parcel)>
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
			//    2    2:invokevirtual   #30  <Method ObservableWebView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int prevScrollY;
		int scrollY;

		static 
		{
		//    0    0:new             #9   <Class ObservableWebView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void ObservableWebView$SavedState$1()>
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


	public ObservableWebView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void WebView(Context)>
	//    3    5:return          
	}

	public ObservableWebView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void WebView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ObservableWebView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #39  <Method void WebView(Context, AttributeSet, int)>
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
	//   18   38:invokespecial   #64  <Method boolean WebView.onInterceptTouchEvent(MotionEvent)>
	//   19   41:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_1         
	//    1    1:checkcast       #10  <Class ObservableWebView$SavedState>
	//    2    4:astore_1        
		mPrevScrollY = ((SavedState) (parcelable)).prevScrollY;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #69  <Field int ObservableWebView$SavedState.prevScrollY>
	//    6   10:putfield        #71  <Field int mPrevScrollY>
		mScrollY = ((SavedState) (parcelable)).scrollY;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #74  <Field int ObservableWebView$SavedState.scrollY>
	//   10   18:putfield        #43  <Field int mScrollY>
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #78  <Method Parcelable ObservableWebView$SavedState.getSuperState()>
	//   14   26:invokespecial   #80  <Method void WebView.onRestoreInstanceState(Parcelable)>
	//   15   29:return          
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #10  <Class ObservableWebView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #83  <Method Parcelable WebView.onSaveInstanceState()>
	//    4    8:invokespecial   #85  <Method void ObservableWebView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.prevScrollY = mPrevScrollY;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #71  <Field int mPrevScrollY>
	//    9   17:putfield        #69  <Field int ObservableWebView$SavedState.prevScrollY>
		savedstate.scrollY = mScrollY;
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field int mScrollY>
	//   13   25:putfield        #74  <Field int ObservableWebView$SavedState.scrollY>
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
	//    5    6:invokespecial   #89  <Method void WebView.onScrollChanged(int, int, int, int)>
		if(mCallbacks != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   8   13:ifnull          99
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
	//*  33   66:goto            94
			if(j < mPrevScrollY)
	//*  34   69:iload_2         
	//*  35   70:aload_0         
	//*  36   71:getfield        #71  <Field int mPrevScrollY>
	//*  37   74:icmpge          87
				mScrollState = ScrollState.DOWN;
	//   38   77:aload_0         
	//   39   78:getstatic       #102 <Field ScrollState ScrollState.DOWN>
	//   40   81:putfield        #99  <Field ScrollState mScrollState>
			else
	//*  41   84:goto            94
				mScrollState = ScrollState.STOP;
	//   42   87:aload_0         
	//   43   88:getstatic       #105 <Field ScrollState ScrollState.STOP>
	//   44   91:putfield        #99  <Field ScrollState mScrollState>
			mPrevScrollY = j;
	//   45   94:aload_0         
	//   46   95:iload_2         
	//   47   96:putfield        #71  <Field int mPrevScrollY>
		}
	//   48   99:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mCallbacks != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//*   2    4:ifnull          268
			switch(motionevent.getActionMasked())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #52  <Method int MotionEvent.getActionMasked()>
			{
			case 0: // '\0'
			default:
				break;

	//*   5   11:tableswitch     0 3: default 40
	//	               0 268
	//	               1 245
	//	               2 43
	//	               3 245
	//*   6   40:goto            268
			case 2: // '\002'
				if(mPrevMoveEvent == null)
	//*   7   43:aload_0         
	//*   8   44:getfield        #108 <Field MotionEvent mPrevMoveEvent>
	//*   9   47:ifnonnull       55
					mPrevMoveEvent = motionevent;
	//   10   50:aload_0         
	//   11   51:aload_1         
	//   12   52:putfield        #108 <Field MotionEvent mPrevMoveEvent>
				float f = motionevent.getY();
	//   13   55:aload_1         
	//   14   56:invokevirtual   #112 <Method float MotionEvent.getY()>
	//   15   59:fstore_2        
				float f1 = mPrevMoveEvent.getY();
	//   16   60:aload_0         
	//   17   61:getfield        #108 <Field MotionEvent mPrevMoveEvent>
	//   18   64:invokevirtual   #112 <Method float MotionEvent.getY()>
	//   19   67:fstore_3        
				mPrevMoveEvent = MotionEvent.obtainNoHistory(motionevent);
	//   20   68:aload_0         
	//   21   69:aload_1         
	//   22   70:invokestatic    #116 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   23   73:putfield        #108 <Field MotionEvent mPrevMoveEvent>
				if((float)getCurrentScrollY() - (f - f1) > 0.0F)
					break;
	//   24   76:aload_0         
	//   25   77:invokevirtual   #118 <Method int getCurrentScrollY()>
	//   26   80:i2f             
	//   27   81:fload_2         
	//   28   82:fload_3         
	//   29   83:fsub            
	//   30   84:fsub            
	//   31   85:fconst_0        
	//   32   86:fcmpg           
	//   33   87:ifgt            268
				if(mIntercepted)
	//*  34   90:aload_0         
	//*  35   91:getfield        #120 <Field boolean mIntercepted>
	//*  36   94:ifeq            99
					return false;
	//   37   97:iconst_0        
	//   38   98:ireturn         
				final ViewGroup parent;
				if(mTouchInterceptionViewGroup == null)
	//*  39   99:aload_0         
	//*  40  100:getfield        #122 <Field ViewGroup mTouchInterceptionViewGroup>
	//*  41  103:ifnonnull       118
					parent = (ViewGroup)getParent();
	//   42  106:aload_0         
	//   43  107:invokevirtual   #126 <Method android.view.ViewParent getParent()>
	//   44  110:checkcast       #128 <Class ViewGroup>
	//   45  113:astore          4
				else
	//*  46  115:goto            124
					parent = mTouchInterceptionViewGroup;
	//   47  118:aload_0         
	//   48  119:getfield        #122 <Field ViewGroup mTouchInterceptionViewGroup>
	//   49  122:astore          4
				f1 = 0.0F;
	//   50  124:fconst_0        
	//   51  125:fstore_3        
				f = f1;
	//   52  126:fload_3         
	//   53  127:fstore_2        
				for(Object obj = ((Object) (this)); obj != null && obj != parent; obj = ((Object) ((View)((View) (obj)).getParent())))
	//*  54  128:aload_0         
	//*  55  129:astore          5
	//*  56  131:aload           5
	//*  57  133:ifnull          186
	//*  58  136:aload           5
	//*  59  138:aload           4
	//*  60  140:if_acmpeq       186
				{
					f1 += ((View) (obj)).getLeft() - ((View) (obj)).getScrollX();
	//   61  143:fload_3         
	//   62  144:aload           5
	//   63  146:invokevirtual   #133 <Method int View.getLeft()>
	//   64  149:aload           5
	//   65  151:invokevirtual   #136 <Method int View.getScrollX()>
	//   66  154:isub            
	//   67  155:i2f             
	//   68  156:fadd            
	//   69  157:fstore_3        
					f += ((View) (obj)).getTop() - ((View) (obj)).getScrollY();
	//   70  158:fload_2         
	//   71  159:aload           5
	//   72  161:invokevirtual   #139 <Method int View.getTop()>
	//   73  164:aload           5
	//   74  166:invokevirtual   #142 <Method int View.getScrollY()>
	//   75  169:isub            
	//   76  170:i2f             
	//   77  171:fadd            
	//   78  172:fstore_2        
				}

	//   79  173:aload           5
	//   80  175:invokevirtual   #143 <Method android.view.ViewParent View.getParent()>
	//   81  178:checkcast       #130 <Class View>
	//   82  181:astore          5
	//*  83  183:goto            131
				final MotionEvent event = MotionEvent.obtainNoHistory(motionevent);
	//   84  186:aload_1         
	//   85  187:invokestatic    #116 <Method MotionEvent MotionEvent.obtainNoHistory(MotionEvent)>
	//   86  190:astore          5
				event.offsetLocation(f1, f);
	//   87  192:aload           5
	//   88  194:fload_3         
	//   89  195:fload_2         
	//   90  196:invokevirtual   #147 <Method void MotionEvent.offsetLocation(float, float)>
				if(parent.onInterceptTouchEvent(event))
	//*  91  199:aload           4
	//*  92  201:aload           5
	//*  93  203:invokevirtual   #148 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//*  94  206:ifeq            239
				{
					mIntercepted = true;
	//   95  209:aload_0         
	//   96  210:iconst_1        
	//   97  211:putfield        #120 <Field boolean mIntercepted>
					event.setAction(0);
	//   98  214:aload           5
	//   99  216:iconst_0        
	//  100  217:invokevirtual   #152 <Method void MotionEvent.setAction(int)>
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

						final ObservableWebView this$0;
						final MotionEvent val$event;
						final ViewGroup val$parent;

			
			{
				this$0 = ObservableWebView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field ObservableWebView this$0>
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
	//  101  220:aload_0         
	//  102  221:new             #8   <Class ObservableWebView$1>
	//  103  224:dup             
	//  104  225:aload_0         
	//  105  226:aload           4
	//  106  228:aload           5
	//  107  230:invokespecial   #155 <Method void ObservableWebView$1(ObservableWebView, ViewGroup, MotionEvent)>
	//  108  233:invokevirtual   #159 <Method boolean post(Runnable)>
	//  109  236:pop             
					return false;
	//  110  237:iconst_0        
	//  111  238:ireturn         
				} else
				{
					return super.onTouchEvent(motionevent);
	//  112  239:aload_0         
	//  113  240:aload_1         
	//  114  241:invokespecial   #161 <Method boolean WebView.onTouchEvent(MotionEvent)>
	//  115  244:ireturn         
				}

			case 1: // '\001'
			case 3: // '\003'
				mIntercepted = false;
	//  116  245:aload_0         
	//  117  246:iconst_0        
	//  118  247:putfield        #120 <Field boolean mIntercepted>
				mDragging = false;
	//  119  250:aload_0         
	//  120  251:iconst_0        
	//  121  252:putfield        #54  <Field boolean mDragging>
				mCallbacks.onUpOrCancelMotionEvent(mScrollState);
	//  122  255:aload_0         
	//  123  256:getfield        #47  <Field ObservableScrollViewCallbacks mCallbacks>
	//  124  259:aload_0         
	//  125  260:getfield        #99  <Field ScrollState mScrollState>
	//  126  263:invokeinterface #165 <Method void ObservableScrollViewCallbacks.onUpOrCancelMotionEvent(ScrollState)>
				break;
			}
		return super.onTouchEvent(motionevent);
	//  127  268:aload_0         
	//  128  269:aload_1         
	//  129  270:invokespecial   #161 <Method boolean WebView.onTouchEvent(MotionEvent)>
	//  130  273:ireturn         
	}

	public void scrollVerticallyTo(int i)
	{
		scrollTo(0, i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokevirtual   #170 <Method void scrollTo(int, int)>
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
	//    2    2:putfield        #122 <Field ViewGroup mTouchInterceptionViewGroup>
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
