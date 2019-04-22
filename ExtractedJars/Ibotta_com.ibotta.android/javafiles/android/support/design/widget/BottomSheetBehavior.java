// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.math.MathUtils;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public class BottomSheetBehavior extends CoordinatorLayout.Behavior
{
	public static abstract class BottomSheetCallback
	{

		public abstract void onSlide(View view, float f);

		public abstract void onStateChanged(View view, int i);

		public BottomSheetCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(state);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field int state>
		//    7   11:invokevirtual   #45  <Method void Parcel.writeInt(int)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomSheetBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void BottomSheetBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method BottomSheetBehavior$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method BottomSheetBehavior$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
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
			//    2    2:invokevirtual   #34  <Method BottomSheetBehavior$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		final int state;

		static 
		{
		//    0    0:new             #9   <Class BottomSheetBehavior$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void BottomSheetBehavior$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			state = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #31  <Method int Parcel.readInt()>
		//    7   11:putfield        #33  <Field int state>
		//    8   14:return          
		}

		public SavedState(Parcelable parcelable, int i)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method void AbsSavedState(Parcelable)>
			state = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #33  <Field int state>
		//    6   10:return          
		}
	}

	private class SettleRunnable
		implements Runnable
	{

		public void run()
		{
			if(viewDragHelper != null && viewDragHelper.continueSettling(true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field BottomSheetBehavior this$0>
		//*   2    4:getfield        #32  <Field ViewDragHelper BottomSheetBehavior.viewDragHelper>
		//*   3    7:ifnull          33
		//*   4   10:aload_0         
		//*   5   11:getfield        #19  <Field BottomSheetBehavior this$0>
		//*   6   14:getfield        #32  <Field ViewDragHelper BottomSheetBehavior.viewDragHelper>
		//*   7   17:iconst_1        
		//*   8   18:invokevirtual   #38  <Method boolean ViewDragHelper.continueSettling(boolean)>
		//*   9   21:ifeq            33
			{
				ViewCompat.postOnAnimation(view, ((Runnable) (this)));
		//   10   24:aload_0         
		//   11   25:getfield        #24  <Field View view>
		//   12   28:aload_0         
		//   13   29:invokestatic    #44  <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
		//   14   32:return          
			} else
			{
				setStateInternal(targetState);
		//   15   33:aload_0         
		//   16   34:getfield        #19  <Field BottomSheetBehavior this$0>
		//   17   37:aload_0         
		//   18   38:getfield        #26  <Field int targetState>
		//   19   41:invokevirtual   #48  <Method void BottomSheetBehavior.setStateInternal(int)>
				return;
		//   20   44:return          
			}
		}

		private final int targetState;
		final BottomSheetBehavior this$0;
		private final View view;

		SettleRunnable(View view1, int i)
		{
			this$0 = BottomSheetBehavior.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field BottomSheetBehavior this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			view = view1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field View view>
			targetState = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field int targetState>
		//   11   19:return          
		}
	}

	public static interface State
		extends Annotation
	{
	}


	public BottomSheetBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void CoordinatorLayout$Behavior()>
		fitToContents = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #67  <Field boolean fitToContents>
		state = 4;
	//    5    9:aload_0         
	//    6   10:iconst_4        
	//    7   11:putfield        #69  <Field int state>
		dragCallback = ((android.support.v4.widget.ViewDragHelper.Callback) (new android.support.v4.widget.ViewDragHelper.Callback() {

			public int clampViewPositionHorizontal(View view, int i, int j)
			{
				return view.getLeft();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #25  <Method int View.getLeft()>
			//    2    4:ireturn         
			}

			public int clampViewPositionVertical(View view, int i, int j)
			{
				int k = getExpandedOffset();
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field BottomSheetBehavior this$0>
			//    2    4:invokestatic    #31  <Method int BottomSheetBehavior.access$100(BottomSheetBehavior)>
			//    3    7:istore          4
				if(hideable)
			//*   4    9:aload_0         
			//*   5   10:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   6   13:getfield        #35  <Field boolean BottomSheetBehavior.hideable>
			//*   7   16:ifeq            30
					j = parentHeight;
			//    8   19:aload_0         
			//    9   20:getfield        #12  <Field BottomSheetBehavior this$0>
			//   10   23:getfield        #39  <Field int BottomSheetBehavior.parentHeight>
			//   11   26:istore_3        
				else
			//*  12   27:goto            38
					j = collapsedOffset;
			//   13   30:aload_0         
			//   14   31:getfield        #12  <Field BottomSheetBehavior this$0>
			//   15   34:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//   16   37:istore_3        
				return MathUtils.clamp(i, k, j);
			//   17   38:iload_2         
			//   18   39:iload           4
			//   19   41:iload_3         
			//   20   42:invokestatic    #48  <Method int MathUtils.clamp(int, int, int)>
			//   21   45:ireturn         
			}

			public int getViewVerticalDragRange(View view)
			{
				if(hideable)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   2    4:getfield        #35  <Field boolean BottomSheetBehavior.hideable>
			//*   3    7:ifeq            18
					return parentHeight;
			//    4   10:aload_0         
			//    5   11:getfield        #12  <Field BottomSheetBehavior this$0>
			//    6   14:getfield        #39  <Field int BottomSheetBehavior.parentHeight>
			//    7   17:ireturn         
				else
					return collapsedOffset;
			//    8   18:aload_0         
			//    9   19:getfield        #12  <Field BottomSheetBehavior this$0>
			//   10   22:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//   11   25:ireturn         
			}

			public void onViewDragStateChanged(int i)
			{
				if(i == 1)
			//*   0    0:iload_1         
			//*   1    1:iconst_1        
			//*   2    2:icmpne          13
					setStateInternal(1);
			//    3    5:aload_0         
			//    4    6:getfield        #12  <Field BottomSheetBehavior this$0>
			//    5    9:iconst_1        
			//    6   10:invokevirtual   #55  <Method void BottomSheetBehavior.setStateInternal(int)>
			//    7   13:return          
			}

			public void onViewPositionChanged(View view, int i, int j, int k, int l)
			{
				dispatchOnSlide(j);
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field BottomSheetBehavior this$0>
			//    2    4:iload_3         
			//    3    5:invokevirtual   #60  <Method void BottomSheetBehavior.dispatchOnSlide(int)>
			//    4    8:return          
			}

			public void onViewReleased(View view, float f, float f1)
			{
				byte byte0 = 4;
			//    0    0:iconst_4        
			//    1    1:istore          5
				int i;
				if(f1 < 0.0F)
			//*   2    3:fload_3         
			//*   3    4:fconst_0        
			//*   4    5:fcmpg           
			//*   5    6:ifge            73
				{
					if(fitToContents)
			//*   6    9:aload_0         
			//*   7   10:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   8   13:invokestatic    #66  <Method boolean BottomSheetBehavior.access$000(BottomSheetBehavior)>
			//*   9   16:ifeq            34
					{
						i = fitToContentsOffset;
			//   10   19:aload_0         
			//   11   20:getfield        #12  <Field BottomSheetBehavior this$0>
			//   12   23:getfield        #69  <Field int BottomSheetBehavior.fitToContentsOffset>
			//   13   26:istore          4
						byte0 = 3;
			//   14   28:iconst_3        
			//   15   29:istore          5
					} else
			//*  16   31:goto            350
					if(view.getTop() > halfExpandedOffset)
			//*  17   34:aload_1         
			//*  18   35:invokevirtual   #72  <Method int View.getTop()>
			//*  19   38:aload_0         
			//*  20   39:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  21   42:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
			//*  22   45:icmple          64
					{
						i = halfExpandedOffset;
			//   23   48:aload_0         
			//   24   49:getfield        #12  <Field BottomSheetBehavior this$0>
			//   25   52:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
			//   26   55:istore          4
						byte0 = 6;
			//   27   57:bipush          6
			//   28   59:istore          5
					} else
			//*  29   61:goto            350
					{
						i = 0;
			//   30   64:iconst_0        
			//   31   65:istore          4
						byte0 = 3;
			//   32   67:iconst_3        
			//   33   68:istore          5
					}
				} else
			//*  34   70:goto            350
				if(hideable && shouldHide(view, f1) && (view.getTop() > collapsedOffset || Math.abs(f) < Math.abs(f1)))
			//*  35   73:aload_0         
			//*  36   74:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  37   77:getfield        #35  <Field boolean BottomSheetBehavior.hideable>
			//*  38   80:ifeq            136
			//*  39   83:aload_0         
			//*  40   84:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  41   87:aload_1         
			//*  42   88:fload_3         
			//*  43   89:invokevirtual   #79  <Method boolean BottomSheetBehavior.shouldHide(View, float)>
			//*  44   92:ifeq            136
			//*  45   95:aload_1         
			//*  46   96:invokevirtual   #72  <Method int View.getTop()>
			//*  47   99:aload_0         
			//*  48  100:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  49  103:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//*  50  106:icmpgt          121
			//*  51  109:fload_2         
			//*  52  110:invokestatic    #85  <Method float Math.abs(float)>
			//*  53  113:fload_3         
			//*  54  114:invokestatic    #85  <Method float Math.abs(float)>
			//*  55  117:fcmpg           
			//*  56  118:ifge            136
				{
					i = parentHeight;
			//   57  121:aload_0         
			//   58  122:getfield        #12  <Field BottomSheetBehavior this$0>
			//   59  125:getfield        #39  <Field int BottomSheetBehavior.parentHeight>
			//   60  128:istore          4
					byte0 = 5;
			//   61  130:iconst_5        
			//   62  131:istore          5
				} else
			//*  63  133:goto            350
				if(f1 != 0.0F && Math.abs(f) <= Math.abs(f1))
			//*  64  136:fload_3         
			//*  65  137:fconst_0        
			//*  66  138:fcmpl           
			//*  67  139:ifeq            169
			//*  68  142:fload_2         
			//*  69  143:invokestatic    #85  <Method float Math.abs(float)>
			//*  70  146:fload_3         
			//*  71  147:invokestatic    #85  <Method float Math.abs(float)>
			//*  72  150:fcmpl           
			//*  73  151:ifle            157
			//*  74  154:goto            169
				{
					i = collapsedOffset;
			//   75  157:aload_0         
			//   76  158:getfield        #12  <Field BottomSheetBehavior this$0>
			//   77  161:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//   78  164:istore          4
				} else
			//*  79  166:goto            350
				{
					i = view.getTop();
			//   80  169:aload_1         
			//   81  170:invokevirtual   #72  <Method int View.getTop()>
			//   82  173:istore          4
					if(fitToContents)
			//*  83  175:aload_0         
			//*  84  176:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  85  179:invokestatic    #66  <Method boolean BottomSheetBehavior.access$000(BottomSheetBehavior)>
			//*  86  182:ifeq            241
					{
						if(Math.abs(i - fitToContentsOffset) < Math.abs(i - collapsedOffset))
			//*  87  185:iload           4
			//*  88  187:aload_0         
			//*  89  188:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  90  191:getfield        #69  <Field int BottomSheetBehavior.fitToContentsOffset>
			//*  91  194:isub            
			//*  92  195:invokestatic    #88  <Method int Math.abs(int)>
			//*  93  198:iload           4
			//*  94  200:aload_0         
			//*  95  201:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  96  204:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//*  97  207:isub            
			//*  98  208:invokestatic    #88  <Method int Math.abs(int)>
			//*  99  211:icmpge          229
						{
							i = fitToContentsOffset;
			//  100  214:aload_0         
			//  101  215:getfield        #12  <Field BottomSheetBehavior this$0>
			//  102  218:getfield        #69  <Field int BottomSheetBehavior.fitToContentsOffset>
			//  103  221:istore          4
							byte0 = 3;
			//  104  223:iconst_3        
			//  105  224:istore          5
						} else
			//* 106  226:goto            350
						{
							i = collapsedOffset;
			//  107  229:aload_0         
			//  108  230:getfield        #12  <Field BottomSheetBehavior this$0>
			//  109  233:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//  110  236:istore          4
						}
					} else
			//* 111  238:goto            350
					if(i < halfExpandedOffset)
			//* 112  241:iload           4
			//* 113  243:aload_0         
			//* 114  244:getfield        #12  <Field BottomSheetBehavior this$0>
			//* 115  247:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
			//* 116  250:icmpge          296
					{
						if(i < Math.abs(i - collapsedOffset))
			//* 117  253:iload           4
			//* 118  255:iload           4
			//* 119  257:aload_0         
			//* 120  258:getfield        #12  <Field BottomSheetBehavior this$0>
			//* 121  261:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//* 122  264:isub            
			//* 123  265:invokestatic    #88  <Method int Math.abs(int)>
			//* 124  268:icmpge          280
						{
							i = 0;
			//  125  271:iconst_0        
			//  126  272:istore          4
							byte0 = 3;
			//  127  274:iconst_3        
			//  128  275:istore          5
						} else
			//* 129  277:goto            350
						{
							i = halfExpandedOffset;
			//  130  280:aload_0         
			//  131  281:getfield        #12  <Field BottomSheetBehavior this$0>
			//  132  284:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
			//  133  287:istore          4
							byte0 = 6;
			//  134  289:bipush          6
			//  135  291:istore          5
						}
					} else
			//* 136  293:goto            350
					if(Math.abs(i - halfExpandedOffset) < Math.abs(i - collapsedOffset))
			//* 137  296:iload           4
			//* 138  298:aload_0         
			//* 139  299:getfield        #12  <Field BottomSheetBehavior this$0>
			//* 140  302:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
			//* 141  305:isub            
			//* 142  306:invokestatic    #88  <Method int Math.abs(int)>
			//* 143  309:iload           4
			//* 144  311:aload_0         
			//* 145  312:getfield        #12  <Field BottomSheetBehavior this$0>
			//* 146  315:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//* 147  318:isub            
			//* 148  319:invokestatic    #88  <Method int Math.abs(int)>
			//* 149  322:icmpge          341
					{
						i = halfExpandedOffset;
			//  150  325:aload_0         
			//  151  326:getfield        #12  <Field BottomSheetBehavior this$0>
			//  152  329:getfield        #75  <Field int BottomSheetBehavior.halfExpandedOffset>
			//  153  332:istore          4
						byte0 = 6;
			//  154  334:bipush          6
			//  155  336:istore          5
					} else
			//* 156  338:goto            350
					{
						i = collapsedOffset;
			//  157  341:aload_0         
			//  158  342:getfield        #12  <Field BottomSheetBehavior this$0>
			//  159  345:getfield        #42  <Field int BottomSheetBehavior.collapsedOffset>
			//  160  348:istore          4
					}
				}
				if(viewDragHelper.settleCapturedViewAt(view.getLeft(), i))
			//* 161  350:aload_0         
			//* 162  351:getfield        #12  <Field BottomSheetBehavior this$0>
			//* 163  354:getfield        #92  <Field ViewDragHelper BottomSheetBehavior.viewDragHelper>
			//* 164  357:aload_1         
			//* 165  358:invokevirtual   #25  <Method int View.getLeft()>
			//* 166  361:iload           4
			//* 167  363:invokevirtual   #98  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
			//* 168  366:ifeq            396
				{
					setStateInternal(2);
			//  169  369:aload_0         
			//  170  370:getfield        #12  <Field BottomSheetBehavior this$0>
			//  171  373:iconst_2        
			//  172  374:invokevirtual   #55  <Method void BottomSheetBehavior.setStateInternal(int)>
					ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, ((int) (byte0))))));
			//  173  377:aload_1         
			//  174  378:new             #100 <Class BottomSheetBehavior$SettleRunnable>
			//  175  381:dup             
			//  176  382:aload_0         
			//  177  383:getfield        #12  <Field BottomSheetBehavior this$0>
			//  178  386:aload_1         
			//  179  387:iload           5
			//  180  389:invokespecial   #103 <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
			//  181  392:invokestatic    #109 <Method void ViewCompat.postOnAnimation(View, Runnable)>
					return;
			//  182  395:return          
				} else
				{
					setStateInternal(((int) (byte0)));
			//  183  396:aload_0         
			//  184  397:getfield        #12  <Field BottomSheetBehavior this$0>
			//  185  400:iload           5
			//  186  402:invokevirtual   #55  <Method void BottomSheetBehavior.setStateInternal(int)>
					return;
			//  187  405:return          
				}
			}

			public boolean tryCaptureView(View view, int i)
			{
				if(state == 1)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   2    4:getfield        #114 <Field int BottomSheetBehavior.state>
			//*   3    7:iconst_1        
			//*   4    8:icmpne          13
					return false;
			//    5   11:iconst_0        
			//    6   12:ireturn         
				if(touchingScrollingChild)
			//*   7   13:aload_0         
			//*   8   14:getfield        #12  <Field BottomSheetBehavior this$0>
			//*   9   17:getfield        #117 <Field boolean BottomSheetBehavior.touchingScrollingChild>
			//*  10   20:ifeq            25
					return false;
			//   11   23:iconst_0        
			//   12   24:ireturn         
				if(state == 3 && activePointerId == i)
			//*  13   25:aload_0         
			//*  14   26:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  15   29:getfield        #114 <Field int BottomSheetBehavior.state>
			//*  16   32:iconst_3        
			//*  17   33:icmpne          75
			//*  18   36:aload_0         
			//*  19   37:getfield        #12  <Field BottomSheetBehavior this$0>
			//*  20   40:getfield        #120 <Field int BottomSheetBehavior.activePointerId>
			//*  21   43:iload_2         
			//*  22   44:icmpne          75
				{
					View view1 = (View)nestedScrollingChildRef.get();
			//   23   47:aload_0         
			//   24   48:getfield        #12  <Field BottomSheetBehavior this$0>
			//   25   51:getfield        #124 <Field WeakReference BottomSheetBehavior.nestedScrollingChildRef>
			//   26   54:invokevirtual   #130 <Method Object WeakReference.get()>
			//   27   57:checkcast       #21  <Class View>
			//   28   60:astore_3        
					if(view1 != null && view1.canScrollVertically(-1))
			//*  29   61:aload_3         
			//*  30   62:ifnull          75
			//*  31   65:aload_3         
			//*  32   66:iconst_m1       
			//*  33   67:invokevirtual   #134 <Method boolean View.canScrollVertically(int)>
			//*  34   70:ifeq            75
						return false;
			//   35   73:iconst_0        
			//   36   74:ireturn         
				}
				return viewRef != null && viewRef.get() == view;
			//   37   75:aload_0         
			//   38   76:getfield        #12  <Field BottomSheetBehavior this$0>
			//   39   79:getfield        #137 <Field WeakReference BottomSheetBehavior.viewRef>
			//   40   82:ifnull          101
			//   41   85:aload_0         
			//   42   86:getfield        #12  <Field BottomSheetBehavior this$0>
			//   43   89:getfield        #137 <Field WeakReference BottomSheetBehavior.viewRef>
			//   44   92:invokevirtual   #130 <Method Object WeakReference.get()>
			//   45   95:aload_1         
			//   46   96:if_acmpne       101
			//   47   99:iconst_1        
			//   48  100:ireturn         
			//   49  101:iconst_0        
			//   50  102:ireturn         
			}

			final BottomSheetBehavior this$0;

			
			{
				this$0 = BottomSheetBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BottomSheetBehavior this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
			//    5    9:return          
			}
		}
));
	//    8   14:aload_0         
	//    9   15:new             #9   <Class BottomSheetBehavior$2>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:invokespecial   #72  <Method void BottomSheetBehavior$2(BottomSheetBehavior)>
	//   13   23:putfield        #74  <Field android.support.v4.widget.ViewDragHelper$Callback dragCallback>
	//   14   26:return          
	}

	public BottomSheetBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #78  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
		fitToContents = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #67  <Field boolean fitToContents>
		state = 4;
	//    7   11:aload_0         
	//    8   12:iconst_4        
	//    9   13:putfield        #69  <Field int state>
		dragCallback = ((android.support.v4.widget.ViewDragHelper.Callback) (new _cls2()));
	//   10   16:aload_0         
	//   11   17:new             #9   <Class BottomSheetBehavior$2>
	//   12   20:dup             
	//   13   21:aload_0         
	//   14   22:invokespecial   #72  <Method void BottomSheetBehavior$2(BottomSheetBehavior)>
	//   15   25:putfield        #74  <Field android.support.v4.widget.ViewDragHelper$Callback dragCallback>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.BottomSheetBehavior_Layout)));
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:getstatic       #84  <Field int[] android.support.design.R$styleable.BottomSheetBehavior_Layout>
	//   19   33:invokevirtual   #90  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   20   36:astore_2        
		TypedValue typedvalue = ((TypedArray) (attributeset)).peekValue(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
	//   21   37:aload_2         
	//   22   38:getstatic       #93  <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   23   41:invokevirtual   #99  <Method TypedValue TypedArray.peekValue(int)>
	//   24   44:astore_3        
		if(typedvalue != null && typedvalue.data == -1)
	//*  25   45:aload_3         
	//*  26   46:ifnull          68
	//*  27   49:aload_3         
	//*  28   50:getfield        #104 <Field int TypedValue.data>
	//*  29   53:iconst_m1       
	//*  30   54:icmpne          68
			setPeekHeight(typedvalue.data);
	//   31   57:aload_0         
	//   32   58:aload_3         
	//   33   59:getfield        #104 <Field int TypedValue.data>
	//   34   62:invokevirtual   #108 <Method void setPeekHeight(int)>
		else
	//*  35   65:goto            80
			setPeekHeight(((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
	//   36   68:aload_0         
	//   37   69:aload_2         
	//   38   70:getstatic       #93  <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight>
	//   39   73:iconst_m1       
	//   40   74:invokevirtual   #112 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   41   77:invokevirtual   #108 <Method void setPeekHeight(int)>
		setHideable(((TypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
	//   42   80:aload_0         
	//   43   81:aload_2         
	//   44   82:getstatic       #115 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_hideable>
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #119 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   47   89:invokevirtual   #123 <Method void setHideable(boolean)>
		setFitToContents(((TypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
	//   48   92:aload_0         
	//   49   93:aload_2         
	//   50   94:getstatic       #126 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents>
	//   51   97:iconst_1        
	//   52   98:invokevirtual   #119 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   53  101:invokevirtual   #129 <Method void setFitToContents(boolean)>
		setSkipCollapsed(((TypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
	//   54  104:aload_0         
	//   55  105:aload_2         
	//   56  106:getstatic       #132 <Field int android.support.design.R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed>
	//   57  109:iconst_0        
	//   58  110:invokevirtual   #119 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   59  113:invokevirtual   #135 <Method void setSkipCollapsed(boolean)>
		((TypedArray) (attributeset)).recycle();
	//   60  116:aload_2         
	//   61  117:invokevirtual   #138 <Method void TypedArray.recycle()>
		maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
	//   62  120:aload_0         
	//   63  121:aload_1         
	//   64  122:invokestatic    #144 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   65  125:invokevirtual   #148 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   66  128:i2f             
	//   67  129:putfield        #150 <Field float maximumVelocity>
	//   68  132:return          
	}

	private void calculateCollapsedOffset()
	{
		if(fitToContents)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean fitToContents>
	//*   2    4:ifeq            28
		{
			collapsedOffset = Math.max(parentHeight - lastPeekHeight, fitToContentsOffset);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #160 <Field int parentHeight>
	//    6   12:aload_0         
	//    7   13:getfield        #162 <Field int lastPeekHeight>
	//    8   16:isub            
	//    9   17:aload_0         
	//   10   18:getfield        #164 <Field int fitToContentsOffset>
	//   11   21:invokestatic    #169 <Method int Math.max(int, int)>
	//   12   24:putfield        #171 <Field int collapsedOffset>
			return;
	//   13   27:return          
		} else
		{
			collapsedOffset = parentHeight - lastPeekHeight;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #160 <Field int parentHeight>
	//   17   33:aload_0         
	//   18   34:getfield        #162 <Field int lastPeekHeight>
	//   19   37:isub            
	//   20   38:putfield        #171 <Field int collapsedOffset>
			return;
	//   21   41:return          
		}
	}

	public static BottomSheetBehavior from(View view)
	{
		view = ((View) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #179 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_0        
		if(view instanceof CoordinatorLayout.LayoutParams)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #181 <Class CoordinatorLayout$LayoutParams>
	//*   5    9:ifeq            42
		{
			view = ((View) (((CoordinatorLayout.LayoutParams)view).getBehavior()));
	//    6   12:aload_0         
	//    7   13:checkcast       #181 <Class CoordinatorLayout$LayoutParams>
	//    8   16:invokevirtual   #185 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//    9   19:astore_0        
			if(view instanceof BottomSheetBehavior)
	//*  10   20:aload_0         
	//*  11   21:instanceof      #2   <Class BottomSheetBehavior>
	//*  12   24:ifeq            32
				return (BottomSheetBehavior)view;
	//   13   27:aload_0         
	//   14   28:checkcast       #2   <Class BottomSheetBehavior>
	//   15   31:areturn         
			else
				throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
	//   16   32:new             #187 <Class IllegalArgumentException>
	//   17   35:dup             
	//   18   36:ldc1            #189 <String "The view is not associated with BottomSheetBehavior">
	//   19   38:invokespecial   #192 <Method void IllegalArgumentException(String)>
	//   20   41:athrow          
		} else
		{
			throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
	//   21   42:new             #187 <Class IllegalArgumentException>
	//   22   45:dup             
	//   23   46:ldc1            #194 <String "The view is not a child of CoordinatorLayout">
	//   24   48:invokespecial   #192 <Method void IllegalArgumentException(String)>
	//   25   51:athrow          
		}
	}

	private int getExpandedOffset()
	{
		if(fitToContents)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean fitToContents>
	//*   2    4:ifeq            12
			return fitToContentsOffset;
	//    3    7:aload_0         
	//    4    8:getfield        #164 <Field int fitToContentsOffset>
	//    5   11:ireturn         
		else
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private float getYVelocity()
	{
		VelocityTracker velocitytracker = velocityTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field VelocityTracker velocityTracker>
	//    2    4:astore_1        
		if(velocitytracker == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
		{
			return 0.0F;
	//    5    9:fconst_0        
	//    6   10:freturn         
		} else
		{
			velocitytracker.computeCurrentVelocity(1000, maximumVelocity);
	//    7   11:aload_1         
	//    8   12:sipush          1000
	//    9   15:aload_0         
	//   10   16:getfield        #150 <Field float maximumVelocity>
	//   11   19:invokevirtual   #206 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			return velocityTracker.getYVelocity(activePointerId);
	//   12   22:aload_0         
	//   13   23:getfield        #200 <Field VelocityTracker velocityTracker>
	//   14   26:aload_0         
	//   15   27:getfield        #208 <Field int activePointerId>
	//   16   30:invokevirtual   #211 <Method float VelocityTracker.getYVelocity(int)>
	//   17   33:freturn         
		}
	}

	private void reset()
	{
		activePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #208 <Field int activePointerId>
		VelocityTracker velocitytracker = velocityTracker;
	//    3    5:aload_0         
	//    4    6:getfield        #200 <Field VelocityTracker velocityTracker>
	//    5    9:astore_1        
		if(velocitytracker != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          23
		{
			velocitytracker.recycle();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #213 <Method void VelocityTracker.recycle()>
			velocityTracker = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #200 <Field VelocityTracker velocityTracker>
		}
	//   13   23:return          
	}

	private void updateImportantForAccessibility(boolean flag)
	{
		Object obj = ((Object) (viewRef));
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field WeakReference viewRef>
	//    2    4:astore          4
		if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		obj = ((Object) (((View)((WeakReference) (obj)).get()).getParent()));
	//    6   12:aload           4
	//    7   14:invokevirtual   #221 <Method Object WeakReference.get()>
	//    8   17:checkcast       #175 <Class View>
	//    9   20:invokevirtual   #225 <Method ViewParent View.getParent()>
	//   10   23:astore          4
		if(!(obj instanceof CoordinatorLayout))
	//*  11   25:aload           4
	//*  12   27:instanceof      #227 <Class CoordinatorLayout>
	//*  13   30:ifne            34
			return;
	//   14   33:return          
		obj = ((Object) ((CoordinatorLayout)obj));
	//   15   34:aload           4
	//   16   36:checkcast       #227 <Class CoordinatorLayout>
	//   17   39:astore          4
		int j = ((CoordinatorLayout) (obj)).getChildCount();
	//   18   41:aload           4
	//   19   43:invokevirtual   #230 <Method int CoordinatorLayout.getChildCount()>
	//   20   46:istore_3        
		if(android.os.Build.VERSION.SDK_INT >= 16 && flag)
	//*  21   47:getstatic       #235 <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   50:bipush          16
	//*  23   52:icmplt          82
	//*  24   55:iload_1         
	//*  25   56:ifeq            82
			if(importantForAccessibilityMap == null)
	//*  26   59:aload_0         
	//*  27   60:getfield        #237 <Field Map importantForAccessibilityMap>
	//*  28   63:ifnonnull       81
				importantForAccessibilityMap = ((Map) (new HashMap(j)));
	//   29   66:aload_0         
	//   30   67:new             #239 <Class HashMap>
	//   31   70:dup             
	//   32   71:iload_3         
	//   33   72:invokespecial   #241 <Method void HashMap(int)>
	//   34   75:putfield        #237 <Field Map importantForAccessibilityMap>
			else
	//*  35   78:goto            82
				return;
	//   36   81:return          
		for(int i = 0; i < j; i++)
	//*  37   82:iconst_0        
	//*  38   83:istore_2        
	//*  39   84:iload_2         
	//*  40   85:iload_3         
	//*  41   86:icmpge          205
		{
			View view = ((CoordinatorLayout) (obj)).getChildAt(i);
	//   42   89:aload           4
	//   43   91:iload_2         
	//   44   92:invokevirtual   #245 <Method View CoordinatorLayout.getChildAt(int)>
	//   45   95:astore          5
			if(view == viewRef.get())
	//*  46   97:aload           5
	//*  47   99:aload_0         
	//*  48  100:getfield        #216 <Field WeakReference viewRef>
	//*  49  103:invokevirtual   #221 <Method Object WeakReference.get()>
	//*  50  106:if_acmpne       112
				continue;
	//   51  109:goto            198
			if(!flag)
	//*  52  112:iload_1         
	//*  53  113:ifne            164
			{
				Map map = importantForAccessibilityMap;
	//   54  116:aload_0         
	//   55  117:getfield        #237 <Field Map importantForAccessibilityMap>
	//   56  120:astore          6
				if(map != null && map.containsKey(((Object) (view))))
	//*  57  122:aload           6
	//*  58  124:ifnull          198
	//*  59  127:aload           6
	//*  60  129:aload           5
	//*  61  131:invokeinterface #251 <Method boolean Map.containsKey(Object)>
	//*  62  136:ifeq            198
					ViewCompat.setImportantForAccessibility(view, ((Integer)importantForAccessibilityMap.get(((Object) (view)))).intValue());
	//   63  139:aload           5
	//   64  141:aload_0         
	//   65  142:getfield        #237 <Field Map importantForAccessibilityMap>
	//   66  145:aload           5
	//   67  147:invokeinterface #254 <Method Object Map.get(Object)>
	//   68  152:checkcast       #256 <Class Integer>
	//   69  155:invokevirtual   #259 <Method int Integer.intValue()>
	//   70  158:invokestatic    #265 <Method void ViewCompat.setImportantForAccessibility(View, int)>
				continue;
	//   71  161:goto            198
			}
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  72  164:getstatic       #235 <Field int android.os.Build$VERSION.SDK_INT>
	//*  73  167:bipush          16
	//*  74  169:icmplt          192
				importantForAccessibilityMap.put(((Object) (view)), ((Object) (Integer.valueOf(view.getImportantForAccessibility()))));
	//   75  172:aload_0         
	//   76  173:getfield        #237 <Field Map importantForAccessibilityMap>
	//   77  176:aload           5
	//   78  178:aload           5
	//   79  180:invokevirtual   #268 <Method int View.getImportantForAccessibility()>
	//   80  183:invokestatic    #272 <Method Integer Integer.valueOf(int)>
	//   81  186:invokeinterface #276 <Method Object Map.put(Object, Object)>
	//   82  191:pop             
			ViewCompat.setImportantForAccessibility(view, 4);
	//   83  192:aload           5
	//   84  194:iconst_4        
	//   85  195:invokestatic    #265 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		}

	//   86  198:iload_2         
	//   87  199:iconst_1        
	//   88  200:iadd            
	//   89  201:istore_2        
	//*  90  202:goto            84
		if(!flag)
	//*  91  205:iload_1         
	//*  92  206:ifne            214
			importantForAccessibilityMap = null;
	//   93  209:aload_0         
	//   94  210:aconst_null     
	//   95  211:putfield        #237 <Field Map importantForAccessibilityMap>
	//   96  214:return          
	}

	void dispatchOnSlide(int i)
	{
		View view = (View)viewRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field WeakReference viewRef>
	//    2    4:invokevirtual   #221 <Method Object WeakReference.get()>
	//    3    7:checkcast       #175 <Class View>
	//    4   10:astore_3        
		if(view != null)
	//*   5   11:aload_3         
	//*   6   12:ifnull          73
		{
			BottomSheetCallback bottomsheetcallback = callback;
	//    7   15:aload_0         
	//    8   16:getfield        #279 <Field BottomSheetBehavior$BottomSheetCallback callback>
	//    9   19:astore          4
			if(bottomsheetcallback != null)
	//*  10   21:aload           4
	//*  11   23:ifnull          73
			{
				int j = collapsedOffset;
	//   12   26:aload_0         
	//   13   27:getfield        #171 <Field int collapsedOffset>
	//   14   30:istore_2        
				if(i > j)
	//*  15   31:iload_1         
	//*  16   32:iload_2         
	//*  17   33:icmple          55
				{
					bottomsheetcallback.onSlide(view, (float)(j - i) / (float)(parentHeight - j));
	//   18   36:aload           4
	//   19   38:aload_3         
	//   20   39:iload_2         
	//   21   40:iload_1         
	//   22   41:isub            
	//   23   42:i2f             
	//   24   43:aload_0         
	//   25   44:getfield        #160 <Field int parentHeight>
	//   26   47:iload_2         
	//   27   48:isub            
	//   28   49:i2f             
	//   29   50:fdiv            
	//   30   51:invokevirtual   #283 <Method void BottomSheetBehavior$BottomSheetCallback.onSlide(View, float)>
					return;
	//   31   54:return          
				}
				bottomsheetcallback.onSlide(view, (float)(j - i) / (float)(j - getExpandedOffset()));
	//   32   55:aload           4
	//   33   57:aload_3         
	//   34   58:iload_2         
	//   35   59:iload_1         
	//   36   60:isub            
	//   37   61:i2f             
	//   38   62:iload_2         
	//   39   63:aload_0         
	//   40   64:invokespecial   #157 <Method int getExpandedOffset()>
	//   41   67:isub            
	//   42   68:i2f             
	//   43   69:fdiv            
	//   44   70:invokevirtual   #283 <Method void BottomSheetBehavior$BottomSheetCallback.onSlide(View, float)>
			}
		}
	//   45   73:return          
	}

	View findScrollingChild(View view)
	{
		if(ViewCompat.isNestedScrollingEnabled(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #290 <Method boolean ViewCompat.isNestedScrollingEnabled(View)>
	//*   2    4:ifeq            9
			return view;
	//    3    7:aload_1         
	//    4    8:areturn         
		if(view instanceof ViewGroup)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #292 <Class ViewGroup>
	//*   7   13:ifeq            59
		{
			view = ((View) ((ViewGroup)view));
	//    8   16:aload_1         
	//    9   17:checkcast       #292 <Class ViewGroup>
	//   10   20:astore_1        
			int i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
			for(int j = ((ViewGroup) (view)).getChildCount(); i < j; i++)
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #293 <Method int ViewGroup.getChildCount()>
	//*  15   27:istore_3        
	//*  16   28:iload_2         
	//*  17   29:iload_3         
	//*  18   30:icmpge          59
			{
				View view1 = findScrollingChild(((ViewGroup) (view)).getChildAt(i));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokevirtual   #294 <Method View ViewGroup.getChildAt(int)>
	//   23   39:invokevirtual   #296 <Method View findScrollingChild(View)>
	//   24   42:astore          4
				if(view1 != null)
	//*  25   44:aload           4
	//*  26   46:ifnull          52
					return view1;
	//   27   49:aload           4
	//   28   51:areturn         
			}

	//   29   52:iload_2         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_2        
		}
	//*  33   56:goto            28
		return null;
	//   34   59:aconst_null     
	//   35   60:areturn         
	}

	public final int getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int state>
	//    2    4:ireturn         
	}

	public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		int i;
		boolean flag3;
		Object obj1;
		boolean flag = view.isShown();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #304 <Method boolean View.isShown()>
	//    2    4:istore          6
		flag3 = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		if(!flag)
	//*   5    9:iload           6
	//*   6   11:ifne            21
		{
			ignoreEvents = true;
	//    7   14:aload_0         
	//    8   15:iconst_1        
	//    9   16:putfield        #306 <Field boolean ignoreEvents>
			return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		}
		i = motionevent.getActionMasked();
	//   12   21:aload_3         
	//   13   22:invokevirtual   #311 <Method int MotionEvent.getActionMasked()>
	//   14   25:istore          4
		if(i == 0)
	//*  15   27:iload           4
	//*  16   29:ifne            36
			reset();
	//   17   32:aload_0         
	//   18   33:invokespecial   #313 <Method void reset()>
		if(velocityTracker == null)
	//*  19   36:aload_0         
	//*  20   37:getfield        #200 <Field VelocityTracker velocityTracker>
	//*  21   40:ifnonnull       50
			velocityTracker = VelocityTracker.obtain();
	//   22   43:aload_0         
	//   23   44:invokestatic    #317 <Method VelocityTracker VelocityTracker.obtain()>
	//   24   47:putfield        #200 <Field VelocityTracker velocityTracker>
		velocityTracker.addMovement(motionevent);
	//   25   50:aload_0         
	//   26   51:getfield        #200 <Field VelocityTracker velocityTracker>
	//   27   54:aload_3         
	//   28   55:invokevirtual   #321 <Method void VelocityTracker.addMovement(MotionEvent)>
		obj1 = null;
	//   29   58:aconst_null     
	//   30   59:astore          9
		if(i == 3) goto _L2; else goto _L1
	//   31   61:iload           4
	//   32   63:iconst_3        
	//   33   64:icmpeq          215
_L1:
		i;
	//   34   67:iload           4
		JVM INSTR tableswitch 0 1: default 92
	//	               0 95
	//	               1 215;
	//   35   69:tableswitch     0 1: default 92
	//	               0 95
	//	               1 215
		   goto _L3 _L4 _L2
_L3:
		break; /* Loop/switch isn't completed */
	//   36   92:goto            239
_L4:
		int j = (int)motionevent.getX();
	//   37   95:aload_3         
	//   38   96:invokevirtual   #324 <Method float MotionEvent.getX()>
	//   39   99:f2i             
	//   40  100:istore          5
		initialY = (int)motionevent.getY();
	//   41  102:aload_0         
	//   42  103:aload_3         
	//   43  104:invokevirtual   #327 <Method float MotionEvent.getY()>
	//   44  107:f2i             
	//   45  108:putfield        #329 <Field int initialY>
		Object obj = ((Object) (nestedScrollingChildRef));
	//   46  111:aload_0         
	//   47  112:getfield        #331 <Field WeakReference nestedScrollingChildRef>
	//   48  115:astore          8
		if(obj != null)
	//*  49  117:aload           8
	//*  50  119:ifnull          135
			obj = ((Object) ((View)((WeakReference) (obj)).get()));
	//   51  122:aload           8
	//   52  124:invokevirtual   #221 <Method Object WeakReference.get()>
	//   53  127:checkcast       #175 <Class View>
	//   54  130:astore          8
		else
	//*  55  132:goto            138
			obj = null;
	//   56  135:aconst_null     
	//   57  136:astore          8
		if(obj != null && coordinatorlayout.isPointInChildBounds(((View) (obj)), j, initialY))
	//*  58  138:aload           8
	//*  59  140:ifnull          175
	//*  60  143:aload_1         
	//*  61  144:aload           8
	//*  62  146:iload           5
	//*  63  148:aload_0         
	//*  64  149:getfield        #329 <Field int initialY>
	//*  65  152:invokevirtual   #335 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  66  155:ifeq            175
		{
			activePointerId = motionevent.getPointerId(motionevent.getActionIndex());
	//   67  158:aload_0         
	//   68  159:aload_3         
	//   69  160:aload_3         
	//   70  161:invokevirtual   #338 <Method int MotionEvent.getActionIndex()>
	//   71  164:invokevirtual   #342 <Method int MotionEvent.getPointerId(int)>
	//   72  167:putfield        #208 <Field int activePointerId>
			touchingScrollingChild = true;
	//   73  170:aload_0         
	//   74  171:iconst_1        
	//   75  172:putfield        #344 <Field boolean touchingScrollingChild>
		}
		boolean flag1;
		if(activePointerId == -1 && !coordinatorlayout.isPointInChildBounds(view, j, initialY))
	//*  76  175:aload_0         
	//*  77  176:getfield        #208 <Field int activePointerId>
	//*  78  179:iconst_m1       
	//*  79  180:icmpne          203
	//*  80  183:aload_1         
	//*  81  184:aload_2         
	//*  82  185:iload           5
	//*  83  187:aload_0         
	//*  84  188:getfield        #329 <Field int initialY>
	//*  85  191:invokevirtual   #335 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//*  86  194:ifne            203
			flag1 = true;
	//   87  197:iconst_1        
	//   88  198:istore          6
		else
	//*  89  200:goto            206
			flag1 = false;
	//   90  203:iconst_0        
	//   91  204:istore          6
		ignoreEvents = flag1;
	//   92  206:aload_0         
	//   93  207:iload           6
	//   94  209:putfield        #306 <Field boolean ignoreEvents>
		break; /* Loop/switch isn't completed */
	//   95  212:goto            239
_L2:
		touchingScrollingChild = false;
	//   96  215:aload_0         
	//   97  216:iconst_0        
	//   98  217:putfield        #344 <Field boolean touchingScrollingChild>
		activePointerId = -1;
	//   99  220:aload_0         
	//  100  221:iconst_m1       
	//  101  222:putfield        #208 <Field int activePointerId>
		if(ignoreEvents)
	//* 102  225:aload_0         
	//* 103  226:getfield        #306 <Field boolean ignoreEvents>
	//* 104  229:ifeq            239
		{
			ignoreEvents = false;
	//  105  232:aload_0         
	//  106  233:iconst_0        
	//  107  234:putfield        #306 <Field boolean ignoreEvents>
			return false;
	//  108  237:iconst_0        
	//  109  238:ireturn         
		}
		if(!ignoreEvents)
	//* 110  239:aload_0         
	//* 111  240:getfield        #306 <Field boolean ignoreEvents>
	//* 112  243:ifne            265
		{
			view = ((View) (viewDragHelper));
	//  113  246:aload_0         
	//  114  247:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//  115  250:astore_2        
			if(view != null && ((ViewDragHelper) (view)).shouldInterceptTouchEvent(motionevent))
	//* 116  251:aload_2         
	//* 117  252:ifnull          265
	//* 118  255:aload_2         
	//* 119  256:aload_3         
	//* 120  257:invokevirtual   #352 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//* 121  260:ifeq            265
				return true;
	//  122  263:iconst_1        
	//  123  264:ireturn         
		}
		WeakReference weakreference = nestedScrollingChildRef;
	//  124  265:aload_0         
	//  125  266:getfield        #331 <Field WeakReference nestedScrollingChildRef>
	//  126  269:astore          8
		view = ((View) (obj1));
	//  127  271:aload           9
	//  128  273:astore_2        
		if(weakreference != null)
	//* 129  274:aload           8
	//* 130  276:ifnull          288
			view = (View)weakreference.get();
	//  131  279:aload           8
	//  132  281:invokevirtual   #221 <Method Object WeakReference.get()>
	//  133  284:checkcast       #175 <Class View>
	//  134  287:astore_2        
		boolean flag2 = flag3;
	//  135  288:iload           7
	//  136  290:istore          6
		if(i == 2)
	//* 137  292:iload           4
	//* 138  294:iconst_2        
	//* 139  295:icmpne          394
		{
			flag2 = flag3;
	//  140  298:iload           7
	//  141  300:istore          6
			if(view != null)
	//* 142  302:aload_2         
	//* 143  303:ifnull          394
			{
				flag2 = flag3;
	//  144  306:iload           7
	//  145  308:istore          6
				if(!ignoreEvents)
	//* 146  310:aload_0         
	//* 147  311:getfield        #306 <Field boolean ignoreEvents>
	//* 148  314:ifne            394
				{
					flag2 = flag3;
	//  149  317:iload           7
	//  150  319:istore          6
					if(state != 1)
	//* 151  321:aload_0         
	//* 152  322:getfield        #69  <Field int state>
	//* 153  325:iconst_1        
	//* 154  326:icmpeq          394
					{
						flag2 = flag3;
	//  155  329:iload           7
	//  156  331:istore          6
						if(!coordinatorlayout.isPointInChildBounds(view, (int)motionevent.getX(), (int)motionevent.getY()))
	//* 157  333:aload_1         
	//* 158  334:aload_2         
	//* 159  335:aload_3         
	//* 160  336:invokevirtual   #324 <Method float MotionEvent.getX()>
	//* 161  339:f2i             
	//* 162  340:aload_3         
	//* 163  341:invokevirtual   #327 <Method float MotionEvent.getY()>
	//* 164  344:f2i             
	//* 165  345:invokevirtual   #335 <Method boolean CoordinatorLayout.isPointInChildBounds(View, int, int)>
	//* 166  348:ifne            394
						{
							flag2 = flag3;
	//  167  351:iload           7
	//  168  353:istore          6
							if(viewDragHelper != null)
	//* 169  355:aload_0         
	//* 170  356:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//* 171  359:ifnull          394
							{
								flag2 = flag3;
	//  172  362:iload           7
	//  173  364:istore          6
								if(Math.abs((float)initialY - motionevent.getY()) > (float)viewDragHelper.getTouchSlop())
	//* 174  366:aload_0         
	//* 175  367:getfield        #329 <Field int initialY>
	//* 176  370:i2f             
	//* 177  371:aload_3         
	//* 178  372:invokevirtual   #327 <Method float MotionEvent.getY()>
	//* 179  375:fsub            
	//* 180  376:invokestatic    #356 <Method float Math.abs(float)>
	//* 181  379:aload_0         
	//* 182  380:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//* 183  383:invokevirtual   #359 <Method int ViewDragHelper.getTouchSlop()>
	//* 184  386:i2f             
	//* 185  387:fcmpl           
	//* 186  388:ifle            394
									flag2 = true;
	//  187  391:iconst_1        
	//  188  392:istore          6
							}
						}
					}
				}
			}
		}
		return flag2;
	//  189  394:iload           6
	//  190  396:ireturn         
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		if(ViewCompat.getFitsSystemWindows(((View) (coordinatorlayout))) && !ViewCompat.getFitsSystemWindows(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #365 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   2    4:ifeq            19
	//*   3    7:aload_2         
	//*   4    8:invokestatic    #365 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   5   11:ifne            19
			view.setFitsSystemWindows(true);
	//    6   14:aload_2         
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #368 <Method void View.setFitsSystemWindows(boolean)>
		int j = view.getTop();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #371 <Method int View.getTop()>
	//   11   23:istore          4
		coordinatorlayout.onLayoutChild(view, i);
	//   12   25:aload_1         
	//   13   26:aload_2         
	//   14   27:iload_3         
	//   15   28:invokevirtual   #373 <Method void CoordinatorLayout.onLayoutChild(View, int)>
		parentHeight = coordinatorlayout.getHeight();
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #376 <Method int CoordinatorLayout.getHeight()>
	//   19   36:putfield        #160 <Field int parentHeight>
		if(peekHeightAuto)
	//*  20   39:aload_0         
	//*  21   40:getfield        #378 <Field boolean peekHeightAuto>
	//*  22   43:ifeq            96
		{
			if(peekHeightMin == 0)
	//*  23   46:aload_0         
	//*  24   47:getfield        #380 <Field int peekHeightMin>
	//*  25   50:ifne            67
				peekHeightMin = coordinatorlayout.getResources().getDimensionPixelSize(android.support.design.R.dimen.design_bottom_sheet_peek_height_min);
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #384 <Method Resources CoordinatorLayout.getResources()>
	//   29   58:getstatic       #389 <Field int android.support.design.R$dimen.design_bottom_sheet_peek_height_min>
	//   30   61:invokevirtual   #393 <Method int Resources.getDimensionPixelSize(int)>
	//   31   64:putfield        #380 <Field int peekHeightMin>
			lastPeekHeight = Math.max(peekHeightMin, parentHeight - (coordinatorlayout.getWidth() * 9) / 16);
	//   32   67:aload_0         
	//   33   68:aload_0         
	//   34   69:getfield        #380 <Field int peekHeightMin>
	//   35   72:aload_0         
	//   36   73:getfield        #160 <Field int parentHeight>
	//   37   76:aload_1         
	//   38   77:invokevirtual   #396 <Method int CoordinatorLayout.getWidth()>
	//   39   80:bipush          9
	//   40   82:imul            
	//   41   83:bipush          16
	//   42   85:idiv            
	//   43   86:isub            
	//   44   87:invokestatic    #169 <Method int Math.max(int, int)>
	//   45   90:putfield        #162 <Field int lastPeekHeight>
		} else
	//*  46   93:goto            104
		{
			lastPeekHeight = peekHeight;
	//   47   96:aload_0         
	//   48   97:aload_0         
	//   49   98:getfield        #398 <Field int peekHeight>
	//   50  101:putfield        #162 <Field int lastPeekHeight>
		}
		fitToContentsOffset = Math.max(0, parentHeight - view.getHeight());
	//   51  104:aload_0         
	//   52  105:iconst_0        
	//   53  106:aload_0         
	//   54  107:getfield        #160 <Field int parentHeight>
	//   55  110:aload_2         
	//   56  111:invokevirtual   #399 <Method int View.getHeight()>
	//   57  114:isub            
	//   58  115:invokestatic    #169 <Method int Math.max(int, int)>
	//   59  118:putfield        #164 <Field int fitToContentsOffset>
		halfExpandedOffset = parentHeight / 2;
	//   60  121:aload_0         
	//   61  122:aload_0         
	//   62  123:getfield        #160 <Field int parentHeight>
	//   63  126:iconst_2        
	//   64  127:idiv            
	//   65  128:putfield        #401 <Field int halfExpandedOffset>
		calculateCollapsedOffset();
	//   66  131:aload_0         
	//   67  132:invokespecial   #403 <Method void calculateCollapsedOffset()>
		i = state;
	//   68  135:aload_0         
	//   69  136:getfield        #69  <Field int state>
	//   70  139:istore_3        
		if(i == 3)
	//*  71  140:iload_3         
	//*  72  141:iconst_3        
	//*  73  142:icmpne          156
			ViewCompat.offsetTopAndBottom(view, getExpandedOffset());
	//   74  145:aload_2         
	//   75  146:aload_0         
	//   76  147:invokespecial   #157 <Method int getExpandedOffset()>
	//   77  150:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		else
	//*  78  153:goto            238
		if(i == 6)
	//*  79  156:iload_3         
	//*  80  157:bipush          6
	//*  81  159:icmpne          173
			ViewCompat.offsetTopAndBottom(view, halfExpandedOffset);
	//   82  162:aload_2         
	//   83  163:aload_0         
	//   84  164:getfield        #401 <Field int halfExpandedOffset>
	//   85  167:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		else
	//*  86  170:goto            238
		if(hideable && i == 5)
	//*  87  173:aload_0         
	//*  88  174:getfield        #408 <Field boolean hideable>
	//*  89  177:ifeq            196
	//*  90  180:iload_3         
	//*  91  181:iconst_5        
	//*  92  182:icmpne          196
		{
			ViewCompat.offsetTopAndBottom(view, parentHeight);
	//   93  185:aload_2         
	//   94  186:aload_0         
	//   95  187:getfield        #160 <Field int parentHeight>
	//   96  190:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		} else
	//*  97  193:goto            238
		{
			i = state;
	//   98  196:aload_0         
	//   99  197:getfield        #69  <Field int state>
	//  100  200:istore_3        
			if(i == 4)
	//* 101  201:iload_3         
	//* 102  202:iconst_4        
	//* 103  203:icmpne          217
				ViewCompat.offsetTopAndBottom(view, collapsedOffset);
	//  104  206:aload_2         
	//  105  207:aload_0         
	//  106  208:getfield        #171 <Field int collapsedOffset>
	//  107  211:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			else
	//* 108  214:goto            238
			if(i == 1 || i == 2)
	//* 109  217:iload_3         
	//* 110  218:iconst_1        
	//* 111  219:icmpeq          227
	//* 112  222:iload_3         
	//* 113  223:iconst_2        
	//* 114  224:icmpne          238
				ViewCompat.offsetTopAndBottom(view, j - view.getTop());
	//  115  227:aload_2         
	//  116  228:iload           4
	//  117  230:aload_2         
	//  118  231:invokevirtual   #371 <Method int View.getTop()>
	//  119  234:isub            
	//  120  235:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		}
		if(viewDragHelper == null)
	//* 121  238:aload_0         
	//* 122  239:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//* 123  242:ifnonnull       257
			viewDragHelper = ViewDragHelper.create(((ViewGroup) (coordinatorlayout)), dragCallback);
	//  124  245:aload_0         
	//  125  246:aload_1         
	//  126  247:aload_0         
	//  127  248:getfield        #74  <Field android.support.v4.widget.ViewDragHelper$Callback dragCallback>
	//  128  251:invokestatic    #412 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, android.support.v4.widget.ViewDragHelper$Callback)>
	//  129  254:putfield        #346 <Field ViewDragHelper viewDragHelper>
		viewRef = new WeakReference(((Object) (view)));
	//  130  257:aload_0         
	//  131  258:new             #218 <Class WeakReference>
	//  132  261:dup             
	//  133  262:aload_2         
	//  134  263:invokespecial   #415 <Method void WeakReference(Object)>
	//  135  266:putfield        #216 <Field WeakReference viewRef>
		nestedScrollingChildRef = new WeakReference(((Object) (findScrollingChild(view))));
	//  136  269:aload_0         
	//  137  270:new             #218 <Class WeakReference>
	//  138  273:dup             
	//  139  274:aload_0         
	//  140  275:aload_2         
	//  141  276:invokevirtual   #296 <Method View findScrollingChild(View)>
	//  142  279:invokespecial   #415 <Method void WeakReference(Object)>
	//  143  282:putfield        #331 <Field WeakReference nestedScrollingChildRef>
		return true;
	//  144  285:iconst_1        
	//  145  286:ireturn         
	}

	public boolean onNestedPreFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
	{
		return view1 == nestedScrollingChildRef.get() && (state != 3 || super.onNestedPreFling(coordinatorlayout, view, view1, f, f1));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #331 <Field WeakReference nestedScrollingChildRef>
	//    3    5:invokevirtual   #221 <Method Object WeakReference.get()>
	//    4    8:if_acmpne       35
	//    5   11:aload_0         
	//    6   12:getfield        #69  <Field int state>
	//    7   15:iconst_3        
	//    8   16:icmpne          33
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:fload           4
	//   14   25:fload           5
	//   15   27:invokespecial   #421 <Method boolean CoordinatorLayout$Behavior.onNestedPreFling(CoordinatorLayout, View, View, float, float)>
	//   16   30:ifeq            35
	//   17   33:iconst_1        
	//   18   34:ireturn         
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[], int k)
	{
		if(k == 1)
	//*   0    0:iload           7
	//*   1    2:iconst_1        
	//*   2    3:icmpne          7
			return;
	//    3    6:return          
		if(view1 != (View)nestedScrollingChildRef.get())
	//*   4    7:aload_3         
	//*   5    8:aload_0         
	//*   6    9:getfield        #331 <Field WeakReference nestedScrollingChildRef>
	//*   7   12:invokevirtual   #221 <Method Object WeakReference.get()>
	//*   8   15:checkcast       #175 <Class View>
	//*   9   18:if_acmpeq       22
			return;
	//   10   21:return          
		i = view.getTop();
	//   11   22:aload_2         
	//   12   23:invokevirtual   #371 <Method int View.getTop()>
	//   13   26:istore          4
		k = i - j;
	//   14   28:iload           4
	//   15   30:iload           5
	//   16   32:isub            
	//   17   33:istore          7
		if(j > 0)
	//*  18   35:iload           5
	//*  19   37:ifle            98
		{
			if(k < getExpandedOffset())
	//*  20   40:iload           7
	//*  21   42:aload_0         
	//*  22   43:invokespecial   #157 <Method int getExpandedOffset()>
	//*  23   46:icmpge          77
			{
				ai[1] = i - getExpandedOffset();
	//   24   49:aload           6
	//   25   51:iconst_1        
	//   26   52:iload           4
	//   27   54:aload_0         
	//   28   55:invokespecial   #157 <Method int getExpandedOffset()>
	//   29   58:isub            
	//   30   59:iastore         
				ViewCompat.offsetTopAndBottom(view, -ai[1]);
	//   31   60:aload_2         
	//   32   61:aload           6
	//   33   63:iconst_1        
	//   34   64:iaload          
	//   35   65:ineg            
	//   36   66:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(3);
	//   37   69:aload_0         
	//   38   70:iconst_3        
	//   39   71:invokevirtual   #428 <Method void setStateInternal(int)>
			} else
	//*  40   74:goto            178
			{
				ai[1] = j;
	//   41   77:aload           6
	//   42   79:iconst_1        
	//   43   80:iload           5
	//   44   82:iastore         
				ViewCompat.offsetTopAndBottom(view, -j);
	//   45   83:aload_2         
	//   46   84:iload           5
	//   47   86:ineg            
	//   48   87:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(1);
	//   49   90:aload_0         
	//   50   91:iconst_1        
	//   51   92:invokevirtual   #428 <Method void setStateInternal(int)>
			}
		} else
	//*  52   95:goto            178
		if(j < 0 && !view1.canScrollVertically(-1))
	//*  53   98:iload           5
	//*  54  100:ifge            178
	//*  55  103:aload_3         
	//*  56  104:iconst_m1       
	//*  57  105:invokevirtual   #432 <Method boolean View.canScrollVertically(int)>
	//*  58  108:ifne            178
		{
			int l = collapsedOffset;
	//   59  111:aload_0         
	//   60  112:getfield        #171 <Field int collapsedOffset>
	//   61  115:istore          8
			if(k > l && !hideable)
	//*  62  117:iload           7
	//*  63  119:iload           8
	//*  64  121:icmple          160
	//*  65  124:aload_0         
	//*  66  125:getfield        #408 <Field boolean hideable>
	//*  67  128:ifeq            134
	//*  68  131:goto            160
			{
				ai[1] = i - l;
	//   69  134:aload           6
	//   70  136:iconst_1        
	//   71  137:iload           4
	//   72  139:iload           8
	//   73  141:isub            
	//   74  142:iastore         
				ViewCompat.offsetTopAndBottom(view, -ai[1]);
	//   75  143:aload_2         
	//   76  144:aload           6
	//   77  146:iconst_1        
	//   78  147:iaload          
	//   79  148:ineg            
	//   80  149:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(4);
	//   81  152:aload_0         
	//   82  153:iconst_4        
	//   83  154:invokevirtual   #428 <Method void setStateInternal(int)>
			} else
	//*  84  157:goto            178
			{
				ai[1] = j;
	//   85  160:aload           6
	//   86  162:iconst_1        
	//   87  163:iload           5
	//   88  165:iastore         
				ViewCompat.offsetTopAndBottom(view, -j);
	//   89  166:aload_2         
	//   90  167:iload           5
	//   91  169:ineg            
	//   92  170:invokestatic    #406 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				setStateInternal(1);
	//   93  173:aload_0         
	//   94  174:iconst_1        
	//   95  175:invokevirtual   #428 <Method void setStateInternal(int)>
			}
		}
		dispatchOnSlide(view.getTop());
	//   96  178:aload_0         
	//   97  179:aload_2         
	//   98  180:invokevirtual   #371 <Method int View.getTop()>
	//   99  183:invokevirtual   #434 <Method void dispatchOnSlide(int)>
		lastNestedScrollDy = j;
	//  100  186:aload_0         
	//  101  187:iload           5
	//  102  189:putfield        #436 <Field int lastNestedScrollDy>
		nestedScrolled = true;
	//  103  192:aload_0         
	//  104  193:iconst_1        
	//  105  194:putfield        #438 <Field boolean nestedScrolled>
	//  106  197:return          
	}

	public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
	{
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    0    0:aload_3         
	//    1    1:checkcast       #14  <Class BottomSheetBehavior$SavedState>
	//    2    4:astore_3        
		super.onRestoreInstanceState(coordinatorlayout, view, ((SavedState) (parcelable)).getSuperState());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #445 <Method Parcelable BottomSheetBehavior$SavedState.getSuperState()>
	//    8   12:invokespecial   #447 <Method void CoordinatorLayout$Behavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
		if(((SavedState) (parcelable)).state != 1 && ((SavedState) (parcelable)).state != 2)
	//*   9   15:aload_3         
	//*  10   16:getfield        #448 <Field int BottomSheetBehavior$SavedState.state>
	//*  11   19:iconst_1        
	//*  12   20:icmpeq          43
	//*  13   23:aload_3         
	//*  14   24:getfield        #448 <Field int BottomSheetBehavior$SavedState.state>
	//*  15   27:iconst_2        
	//*  16   28:icmpne          34
	//*  17   31:goto            43
		{
			state = ((SavedState) (parcelable)).state;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:getfield        #448 <Field int BottomSheetBehavior$SavedState.state>
	//   21   39:putfield        #69  <Field int state>
			return;
	//   22   42:return          
		} else
		{
			state = 4;
	//   23   43:aload_0         
	//   24   44:iconst_4        
	//   25   45:putfield        #69  <Field int state>
			return;
	//   26   48:return          
		}
	}

	public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
	{
		return ((Parcelable) (new SavedState(super.onSaveInstanceState(coordinatorlayout, view), state)));
	//    0    0:new             #14  <Class BottomSheetBehavior$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #453 <Method Parcelable CoordinatorLayout$Behavior.onSaveInstanceState(CoordinatorLayout, View)>
	//    6   10:aload_0         
	//    7   11:getfield        #69  <Field int state>
	//    8   14:invokespecial   #456 <Method void BottomSheetBehavior$SavedState(Parcelable, int)>
	//    9   17:areturn         
	}

	public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		lastNestedScrollDy = 0;
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:putfield        #436 <Field int lastNestedScrollDy>
		nestedScrolled = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #438 <Field boolean nestedScrolled>
		if((i & 2) != 0)
	//*   8   13:iload           5
	//*   9   15:iconst_2        
	//*  10   16:iand            
	//*  11   17:ifeq            23
			flag = true;
	//   12   20:iconst_1        
	//   13   21:istore          7
		return flag;
	//   14   23:iload           7
	//   15   25:ireturn         
	}

	public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
	{
		i = view.getTop();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #371 <Method int View.getTop()>
	//    2    4:istore          4
		int j = getExpandedOffset();
	//    3    6:aload_0         
	//    4    7:invokespecial   #157 <Method int getExpandedOffset()>
	//    5   10:istore          6
		byte byte0 = 3;
	//    6   12:iconst_3        
	//    7   13:istore          5
		if(i == j)
	//*   8   15:iload           4
	//*   9   17:iload           6
	//*  10   19:icmpne          28
		{
			setStateInternal(3);
	//   11   22:aload_0         
	//   12   23:iconst_3        
	//   13   24:invokevirtual   #428 <Method void setStateInternal(int)>
			return;
	//   14   27:return          
		}
		if(view1 == nestedScrollingChildRef.get())
	//*  15   28:aload_3         
	//*  16   29:aload_0         
	//*  17   30:getfield        #331 <Field WeakReference nestedScrollingChildRef>
	//*  18   33:invokevirtual   #221 <Method Object WeakReference.get()>
	//*  19   36:if_acmpne       312
		{
			if(!nestedScrolled)
	//*  20   39:aload_0         
	//*  21   40:getfield        #438 <Field boolean nestedScrolled>
	//*  22   43:ifne            47
				return;
	//   23   46:return          
			if(lastNestedScrollDy > 0)
	//*  24   47:aload_0         
	//*  25   48:getfield        #436 <Field int lastNestedScrollDy>
	//*  26   51:ifle            63
				i = getExpandedOffset();
	//   27   54:aload_0         
	//   28   55:invokespecial   #157 <Method int getExpandedOffset()>
	//   29   58:istore          4
			else
	//*  30   60:goto            260
			if(hideable && shouldHide(view, getYVelocity()))
	//*  31   63:aload_0         
	//*  32   64:getfield        #408 <Field boolean hideable>
	//*  33   67:ifeq            94
	//*  34   70:aload_0         
	//*  35   71:aload_2         
	//*  36   72:aload_0         
	//*  37   73:invokespecial   #464 <Method float getYVelocity()>
	//*  38   76:invokevirtual   #468 <Method boolean shouldHide(View, float)>
	//*  39   79:ifeq            94
			{
				i = parentHeight;
	//   40   82:aload_0         
	//   41   83:getfield        #160 <Field int parentHeight>
	//   42   86:istore          4
				byte0 = 5;
	//   43   88:iconst_5        
	//   44   89:istore          5
			} else
	//*  45   91:goto            260
			if(lastNestedScrollDy == 0)
	//*  46   94:aload_0         
	//*  47   95:getfield        #436 <Field int lastNestedScrollDy>
	//*  48   98:ifne            251
			{
				i = view.getTop();
	//   49  101:aload_2         
	//   50  102:invokevirtual   #371 <Method int View.getTop()>
	//   51  105:istore          4
				if(fitToContents)
	//*  52  107:aload_0         
	//*  53  108:getfield        #67  <Field boolean fitToContents>
	//*  54  111:ifeq            158
				{
					if(Math.abs(i - fitToContentsOffset) < Math.abs(i - collapsedOffset))
	//*  55  114:iload           4
	//*  56  116:aload_0         
	//*  57  117:getfield        #164 <Field int fitToContentsOffset>
	//*  58  120:isub            
	//*  59  121:invokestatic    #470 <Method int Math.abs(int)>
	//*  60  124:iload           4
	//*  61  126:aload_0         
	//*  62  127:getfield        #171 <Field int collapsedOffset>
	//*  63  130:isub            
	//*  64  131:invokestatic    #470 <Method int Math.abs(int)>
	//*  65  134:icmpge          146
					{
						i = fitToContentsOffset;
	//   66  137:aload_0         
	//   67  138:getfield        #164 <Field int fitToContentsOffset>
	//   68  141:istore          4
					} else
	//*  69  143:goto            260
					{
						i = collapsedOffset;
	//   70  146:aload_0         
	//   71  147:getfield        #171 <Field int collapsedOffset>
	//   72  150:istore          4
						byte0 = 4;
	//   73  152:iconst_4        
	//   74  153:istore          5
					}
				} else
	//*  75  155:goto            260
				{
					int k = halfExpandedOffset;
	//   76  158:aload_0         
	//   77  159:getfield        #401 <Field int halfExpandedOffset>
	//   78  162:istore          6
					if(i < k)
	//*  79  164:iload           4
	//*  80  166:iload           6
	//*  81  168:icmpge          205
					{
						if(i < Math.abs(i - collapsedOffset))
	//*  82  171:iload           4
	//*  83  173:iload           4
	//*  84  175:aload_0         
	//*  85  176:getfield        #171 <Field int collapsedOffset>
	//*  86  179:isub            
	//*  87  180:invokestatic    #470 <Method int Math.abs(int)>
	//*  88  183:icmpge          192
						{
							i = 0;
	//   89  186:iconst_0        
	//   90  187:istore          4
						} else
	//*  91  189:goto            260
						{
							i = halfExpandedOffset;
	//   92  192:aload_0         
	//   93  193:getfield        #401 <Field int halfExpandedOffset>
	//   94  196:istore          4
							byte0 = 6;
	//   95  198:bipush          6
	//   96  200:istore          5
						}
					} else
	//*  97  202:goto            260
					if(Math.abs(i - k) < Math.abs(i - collapsedOffset))
	//*  98  205:iload           4
	//*  99  207:iload           6
	//* 100  209:isub            
	//* 101  210:invokestatic    #470 <Method int Math.abs(int)>
	//* 102  213:iload           4
	//* 103  215:aload_0         
	//* 104  216:getfield        #171 <Field int collapsedOffset>
	//* 105  219:isub            
	//* 106  220:invokestatic    #470 <Method int Math.abs(int)>
	//* 107  223:icmpge          239
					{
						i = halfExpandedOffset;
	//  108  226:aload_0         
	//  109  227:getfield        #401 <Field int halfExpandedOffset>
	//  110  230:istore          4
						byte0 = 6;
	//  111  232:bipush          6
	//  112  234:istore          5
					} else
	//* 113  236:goto            260
					{
						i = collapsedOffset;
	//  114  239:aload_0         
	//  115  240:getfield        #171 <Field int collapsedOffset>
	//  116  243:istore          4
						byte0 = 4;
	//  117  245:iconst_4        
	//  118  246:istore          5
					}
				}
			} else
	//* 119  248:goto            260
			{
				i = collapsedOffset;
	//  120  251:aload_0         
	//  121  252:getfield        #171 <Field int collapsedOffset>
	//  122  255:istore          4
				byte0 = 4;
	//  123  257:iconst_4        
	//  124  258:istore          5
			}
			if(viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i))
	//* 125  260:aload_0         
	//* 126  261:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//* 127  264:aload_2         
	//* 128  265:aload_2         
	//* 129  266:invokevirtual   #473 <Method int View.getLeft()>
	//* 130  269:iload           4
	//* 131  271:invokevirtual   #476 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//* 132  274:ifeq            300
			{
				setStateInternal(2);
	//  133  277:aload_0         
	//  134  278:iconst_2        
	//  135  279:invokevirtual   #428 <Method void setStateInternal(int)>
				ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, ((int) (byte0))))));
	//  136  282:aload_2         
	//  137  283:new             #19  <Class BottomSheetBehavior$SettleRunnable>
	//  138  286:dup             
	//  139  287:aload_0         
	//  140  288:aload_2         
	//  141  289:iload           5
	//  142  291:invokespecial   #479 <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//  143  294:invokestatic    #483 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			} else
	//* 144  297:goto            306
			{
				setStateInternal(((int) (byte0)));
	//  145  300:aload_0         
	//  146  301:iload           5
	//  147  303:invokevirtual   #428 <Method void setStateInternal(int)>
			}
			nestedScrolled = false;
	//  148  306:aload_0         
	//  149  307:iconst_0        
	//  150  308:putfield        #438 <Field boolean nestedScrolled>
			return;
	//  151  311:return          
		} else
		{
			return;
	//  152  312:return          
		}
	}

	public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
	{
		if(!view.isShown())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #304 <Method boolean View.isShown()>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i = motionevent.getActionMasked();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #311 <Method int MotionEvent.getActionMasked()>
	//    7   13:istore          4
		if(state == 1 && i == 0)
	//*   8   15:aload_0         
	//*   9   16:getfield        #69  <Field int state>
	//*  10   19:iconst_1        
	//*  11   20:icmpne          30
	//*  12   23:iload           4
	//*  13   25:ifne            30
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		coordinatorlayout = ((CoordinatorLayout) (viewDragHelper));
	//   16   30:aload_0         
	//   17   31:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//   18   34:astore_1        
		if(coordinatorlayout != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          44
			((ViewDragHelper) (coordinatorlayout)).processTouchEvent(motionevent);
	//   21   39:aload_1         
	//   22   40:aload_3         
	//   23   41:invokevirtual   #488 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		if(i == 0)
	//*  24   44:iload           4
	//*  25   46:ifne            53
			reset();
	//   26   49:aload_0         
	//   27   50:invokespecial   #313 <Method void reset()>
		if(velocityTracker == null)
	//*  28   53:aload_0         
	//*  29   54:getfield        #200 <Field VelocityTracker velocityTracker>
	//*  30   57:ifnonnull       67
			velocityTracker = VelocityTracker.obtain();
	//   31   60:aload_0         
	//   32   61:invokestatic    #317 <Method VelocityTracker VelocityTracker.obtain()>
	//   33   64:putfield        #200 <Field VelocityTracker velocityTracker>
		velocityTracker.addMovement(motionevent);
	//   34   67:aload_0         
	//   35   68:getfield        #200 <Field VelocityTracker velocityTracker>
	//   36   71:aload_3         
	//   37   72:invokevirtual   #321 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(i == 2 && !ignoreEvents && Math.abs((float)initialY - motionevent.getY()) > (float)viewDragHelper.getTouchSlop())
	//*  38   75:iload           4
	//*  39   77:iconst_2        
	//*  40   78:icmpne          129
	//*  41   81:aload_0         
	//*  42   82:getfield        #306 <Field boolean ignoreEvents>
	//*  43   85:ifne            129
	//*  44   88:aload_0         
	//*  45   89:getfield        #329 <Field int initialY>
	//*  46   92:i2f             
	//*  47   93:aload_3         
	//*  48   94:invokevirtual   #327 <Method float MotionEvent.getY()>
	//*  49   97:fsub            
	//*  50   98:invokestatic    #356 <Method float Math.abs(float)>
	//*  51  101:aload_0         
	//*  52  102:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//*  53  105:invokevirtual   #359 <Method int ViewDragHelper.getTouchSlop()>
	//*  54  108:i2f             
	//*  55  109:fcmpl           
	//*  56  110:ifle            129
			viewDragHelper.captureChildView(view, motionevent.getPointerId(motionevent.getActionIndex()));
	//   57  113:aload_0         
	//   58  114:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//   59  117:aload_2         
	//   60  118:aload_3         
	//   61  119:aload_3         
	//   62  120:invokevirtual   #338 <Method int MotionEvent.getActionIndex()>
	//   63  123:invokevirtual   #342 <Method int MotionEvent.getPointerId(int)>
	//   64  126:invokevirtual   #491 <Method void ViewDragHelper.captureChildView(View, int)>
		return ignoreEvents ^ true;
	//   65  129:aload_0         
	//   66  130:getfield        #306 <Field boolean ignoreEvents>
	//   67  133:iconst_1        
	//   68  134:ixor            
	//   69  135:ireturn         
	}

	public void setBottomSheetCallback(BottomSheetCallback bottomsheetcallback)
	{
		callback = bottomsheetcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #279 <Field BottomSheetBehavior$BottomSheetCallback callback>
	//    3    5:return          
	}

	public void setFitToContents(boolean flag)
	{
		if(fitToContents == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field boolean fitToContents>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		fitToContents = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #67  <Field boolean fitToContents>
		if(viewRef != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #216 <Field WeakReference viewRef>
	//*  10   18:ifnull          25
			calculateCollapsedOffset();
	//   11   21:aload_0         
	//   12   22:invokespecial   #403 <Method void calculateCollapsedOffset()>
		int i;
		if(fitToContents && state == 6)
	//*  13   25:aload_0         
	//*  14   26:getfield        #67  <Field boolean fitToContents>
	//*  15   29:ifeq            46
	//*  16   32:aload_0         
	//*  17   33:getfield        #69  <Field int state>
	//*  18   36:bipush          6
	//*  19   38:icmpne          46
			i = 3;
	//   20   41:iconst_3        
	//   21   42:istore_2        
		else
	//*  22   43:goto            51
			i = state;
	//   23   46:aload_0         
	//   24   47:getfield        #69  <Field int state>
	//   25   50:istore_2        
		setStateInternal(i);
	//   26   51:aload_0         
	//   27   52:iload_2         
	//   28   53:invokevirtual   #428 <Method void setStateInternal(int)>
	//   29   56:return          
	}

	public void setHideable(boolean flag)
	{
		hideable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #408 <Field boolean hideable>
	//    3    5:return          
	}

	public final void setPeekHeight(int i)
	{
label0:
		{
			boolean flag;
label1:
			{
				flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
				if(i == -1)
	//*   2    2:iload_1         
	//*   3    3:iconst_m1       
	//*   4    4:icmpne          24
				{
					if(!peekHeightAuto)
	//*   5    7:aload_0         
	//*   6    8:getfield        #378 <Field boolean peekHeightAuto>
	//*   7   11:ifne            42
					{
						peekHeightAuto = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #378 <Field boolean peekHeightAuto>
						i = ((int) (flag));
	//   11   19:iload_2         
	//   12   20:istore_1        
						break label0;
	//   13   21:goto            73
					}
				} else
				if(peekHeightAuto || peekHeight != i)
	//*  14   24:aload_0         
	//*  15   25:getfield        #378 <Field boolean peekHeightAuto>
	//*  16   28:ifne            47
	//*  17   31:aload_0         
	//*  18   32:getfield        #398 <Field int peekHeight>
	//*  19   35:iload_1         
	//*  20   36:icmpeq          42
					break label1;
	//   21   39:goto            47
				i = 0;
	//   22   42:iconst_0        
	//   23   43:istore_1        
				break label0;
	//   24   44:goto            73
			}
			peekHeightAuto = false;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #378 <Field boolean peekHeightAuto>
			peekHeight = Math.max(0, i);
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:iload_1         
	//   31   55:invokestatic    #169 <Method int Math.max(int, int)>
	//   32   58:putfield        #398 <Field int peekHeight>
			collapsedOffset = parentHeight - i;
	//   33   61:aload_0         
	//   34   62:aload_0         
	//   35   63:getfield        #160 <Field int parentHeight>
	//   36   66:iload_1         
	//   37   67:isub            
	//   38   68:putfield        #171 <Field int collapsedOffset>
			i = ((int) (flag));
	//   39   71:iload_2         
	//   40   72:istore_1        
		}
		if(i != 0 && state == 4)
	//*  41   73:iload_1         
	//*  42   74:ifeq            110
	//*  43   77:aload_0         
	//*  44   78:getfield        #69  <Field int state>
	//*  45   81:iconst_4        
	//*  46   82:icmpne          110
		{
			Object obj = ((Object) (viewRef));
	//   47   85:aload_0         
	//   48   86:getfield        #216 <Field WeakReference viewRef>
	//   49   89:astore_3        
			if(obj != null)
	//*  50   90:aload_3         
	//*  51   91:ifnull          110
			{
				obj = ((Object) ((View)((WeakReference) (obj)).get()));
	//   52   94:aload_3         
	//   53   95:invokevirtual   #221 <Method Object WeakReference.get()>
	//   54   98:checkcast       #175 <Class View>
	//   55  101:astore_3        
				if(obj != null)
	//*  56  102:aload_3         
	//*  57  103:ifnull          110
					((View) (obj)).requestLayout();
	//   58  106:aload_3         
	//   59  107:invokevirtual   #496 <Method void View.requestLayout()>
			}
		}
	//   60  110:return          
	}

	public void setSkipCollapsed(boolean flag)
	{
		skipCollapsed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #498 <Field boolean skipCollapsed>
	//    3    5:return          
	}

	public final void setState(final int finalState)
	{
		if(finalState == state)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #69  <Field int state>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		final View child = ((View) (viewRef));
	//    5    9:aload_0         
	//    6   10:getfield        #216 <Field WeakReference viewRef>
	//    7   13:astore_2        
		if(child == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       52
		{
			if(finalState == 4 || finalState == 3 || finalState == 6 || hideable && finalState == 5)
	//*  10   18:iload_1         
	//*  11   19:iconst_4        
	//*  12   20:icmpeq          46
	//*  13   23:iload_1         
	//*  14   24:iconst_3        
	//*  15   25:icmpeq          46
	//*  16   28:iload_1         
	//*  17   29:bipush          6
	//*  18   31:icmpeq          46
	//*  19   34:aload_0         
	//*  20   35:getfield        #408 <Field boolean hideable>
	//*  21   38:ifeq            51
	//*  22   41:iload_1         
	//*  23   42:iconst_5        
	//*  24   43:icmpne          51
				state = finalState;
	//   25   46:aload_0         
	//   26   47:iload_1         
	//   27   48:putfield        #69  <Field int state>
			return;
	//   28   51:return          
		}
		child = (View)((WeakReference) (child)).get();
	//   29   52:aload_2         
	//   30   53:invokevirtual   #221 <Method Object WeakReference.get()>
	//   31   56:checkcast       #175 <Class View>
	//   32   59:astore_2        
		if(child == null)
	//*  33   60:aload_2         
	//*  34   61:ifnonnull       65
			return;
	//   35   64:return          
		ViewParent viewparent = child.getParent();
	//   36   65:aload_2         
	//   37   66:invokevirtual   #225 <Method ViewParent View.getParent()>
	//   38   69:astore_3        
		if(viewparent != null && viewparent.isLayoutRequested() && ViewCompat.isAttachedToWindow(child))
	//*  39   70:aload_3         
	//*  40   71:ifnull          106
	//*  41   74:aload_3         
	//*  42   75:invokeinterface #504 <Method boolean ViewParent.isLayoutRequested()>
	//*  43   80:ifeq            106
	//*  44   83:aload_2         
	//*  45   84:invokestatic    #507 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  46   87:ifeq            106
		{
			child.post(new Runnable() {

				public void run()
				{
					startSettlingAnimation(child, finalState);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field BottomSheetBehavior this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field View val$child>
				//    4    8:aload_0         
				//    5    9:getfield        #25  <Field int val$finalState>
				//    6   12:invokevirtual   #34  <Method void BottomSheetBehavior.startSettlingAnimation(View, int)>
				//    7   15:return          
				}

				final BottomSheetBehavior this$0;
				final View val$child;
				final int val$finalState;

			
			{
				this$0 = BottomSheetBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field BottomSheetBehavior this$0>
				child = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field View val$child>
				finalState = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field int val$finalState>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   47   90:aload_2         
	//   48   91:new             #7   <Class BottomSheetBehavior$1>
	//   49   94:dup             
	//   50   95:aload_0         
	//   51   96:aload_2         
	//   52   97:iload_1         
	//   53   98:invokespecial   #508 <Method void BottomSheetBehavior$1(BottomSheetBehavior, View, int)>
	//   54  101:invokevirtual   #512 <Method boolean View.post(Runnable)>
	//   55  104:pop             
			return;
	//   56  105:return          
		} else
		{
			startSettlingAnimation(child, finalState);
	//   57  106:aload_0         
	//   58  107:aload_2         
	//   59  108:iload_1         
	//   60  109:invokevirtual   #515 <Method void startSettlingAnimation(View, int)>
			return;
	//   61  112:return          
		}
	}

	void setStateInternal(int i)
	{
		if(state == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int state>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		state = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #69  <Field int state>
		if(i != 6 && i != 3)
	//*   8   14:iload_1         
	//*   9   15:bipush          6
	//*  10   17:icmpeq          46
	//*  11   20:iload_1         
	//*  12   21:iconst_3        
	//*  13   22:icmpne          28
	//*  14   25:goto            46
		{
			if(i == 5 || i == 4)
	//*  15   28:iload_1         
	//*  16   29:iconst_5        
	//*  17   30:icmpeq          38
	//*  18   33:iload_1         
	//*  19   34:iconst_4        
	//*  20   35:icmpne          51
				updateImportantForAccessibility(false);
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:invokespecial   #517 <Method void updateImportantForAccessibility(boolean)>
		} else
	//*  24   43:goto            51
		{
			updateImportantForAccessibility(true);
	//   25   46:aload_0         
	//   26   47:iconst_1        
	//   27   48:invokespecial   #517 <Method void updateImportantForAccessibility(boolean)>
		}
		View view = (View)viewRef.get();
	//   28   51:aload_0         
	//   29   52:getfield        #216 <Field WeakReference viewRef>
	//   30   55:invokevirtual   #221 <Method Object WeakReference.get()>
	//   31   58:checkcast       #175 <Class View>
	//   32   61:astore_2        
		if(view != null)
	//*  33   62:aload_2         
	//*  34   63:ifnull          81
		{
			BottomSheetCallback bottomsheetcallback = callback;
	//   35   66:aload_0         
	//   36   67:getfield        #279 <Field BottomSheetBehavior$BottomSheetCallback callback>
	//   37   70:astore_3        
			if(bottomsheetcallback != null)
	//*  38   71:aload_3         
	//*  39   72:ifnull          81
				bottomsheetcallback.onStateChanged(view, i);
	//   40   75:aload_3         
	//   41   76:aload_2         
	//   42   77:iload_1         
	//   43   78:invokevirtual   #520 <Method void BottomSheetBehavior$BottomSheetCallback.onStateChanged(View, int)>
		}
	//   44   81:return          
	}

	boolean shouldHide(View view, float f)
	{
		if(skipCollapsed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #498 <Field boolean skipCollapsed>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(view.getTop() < collapsedOffset)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #371 <Method int View.getTop()>
	//*   7   13:aload_0         
	//*   8   14:getfield        #171 <Field int collapsedOffset>
	//*   9   17:icmpge          22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		return Math.abs(((float)view.getTop() + f * 0.1F) - (float)collapsedOffset) / (float)peekHeight > 0.5F;
	//   12   22:aload_1         
	//   13   23:invokevirtual   #371 <Method int View.getTop()>
	//   14   26:i2f             
	//   15   27:fload_2         
	//   16   28:ldc2            #521 <Float 0.1F>
	//   17   31:fmul            
	//   18   32:fadd            
	//   19   33:aload_0         
	//   20   34:getfield        #171 <Field int collapsedOffset>
	//   21   37:i2f             
	//   22   38:fsub            
	//   23   39:invokestatic    #356 <Method float Math.abs(float)>
	//   24   42:aload_0         
	//   25   43:getfield        #398 <Field int peekHeight>
	//   26   46:i2f             
	//   27   47:fdiv            
	//   28   48:ldc2            #522 <Float 0.5F>
	//   29   51:fcmpl           
	//   30   52:ifle            57
	//   31   55:iconst_1        
	//   32   56:ireturn         
	//   33   57:iconst_0        
	//   34   58:ireturn         
	}

	void startSettlingAnimation(View view, int i)
	{
label0:
		{
			int j;
			if(i == 4)
	//*   0    0:iload_2         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          13
				j = collapsedOffset;
	//    3    5:aload_0         
	//    4    6:getfield        #171 <Field int collapsedOffset>
	//    5    9:istore_3        
			else
	//*   6   10:goto            84
			if(i == 6)
	//*   7   13:iload_2         
	//*   8   14:bipush          6
	//*   9   16:icmpne          54
			{
				j = halfExpandedOffset;
	//   10   19:aload_0         
	//   11   20:getfield        #401 <Field int halfExpandedOffset>
	//   12   23:istore_3        
				if(fitToContents)
	//*  13   24:aload_0         
	//*  14   25:getfield        #67  <Field boolean fitToContents>
	//*  15   28:ifeq            51
				{
					int k = fitToContentsOffset;
	//   16   31:aload_0         
	//   17   32:getfield        #164 <Field int fitToContentsOffset>
	//   18   35:istore          4
					if(j <= k)
	//*  19   37:iload_3         
	//*  20   38:iload           4
	//*  21   40:icmpgt          51
					{
						j = k;
	//   22   43:iload           4
	//   23   45:istore_3        
						i = 3;
	//   24   46:iconst_3        
	//   25   47:istore_2        
					}
				}
			} else
	//*  26   48:goto            84
	//*  27   51:goto            84
			if(i == 3)
	//*  28   54:iload_2         
	//*  29   55:iconst_3        
	//*  30   56:icmpne          67
			{
				j = getExpandedOffset();
	//   31   59:aload_0         
	//   32   60:invokespecial   #157 <Method int getExpandedOffset()>
	//   33   63:istore_3        
			} else
	//*  34   64:goto            84
			{
				if(!hideable || i != 5)
					break label0;
	//   35   67:aload_0         
	//   36   68:getfield        #408 <Field boolean hideable>
	//   37   71:ifeq            126
	//   38   74:iload_2         
	//   39   75:iconst_5        
	//   40   76:icmpne          126
				j = parentHeight;
	//   41   79:aload_0         
	//   42   80:getfield        #160 <Field int parentHeight>
	//   43   83:istore_3        
			}
			if(viewDragHelper.smoothSlideViewTo(view, view.getLeft(), j))
	//*  44   84:aload_0         
	//*  45   85:getfield        #346 <Field ViewDragHelper viewDragHelper>
	//*  46   88:aload_1         
	//*  47   89:aload_1         
	//*  48   90:invokevirtual   #473 <Method int View.getLeft()>
	//*  49   93:iload_3         
	//*  50   94:invokevirtual   #476 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  51   97:ifeq            120
			{
				setStateInternal(2);
	//   52  100:aload_0         
	//   53  101:iconst_2        
	//   54  102:invokevirtual   #428 <Method void setStateInternal(int)>
				ViewCompat.postOnAnimation(view, ((Runnable) (new SettleRunnable(view, i))));
	//   55  105:aload_1         
	//   56  106:new             #19  <Class BottomSheetBehavior$SettleRunnable>
	//   57  109:dup             
	//   58  110:aload_0         
	//   59  111:aload_1         
	//   60  112:iload_2         
	//   61  113:invokespecial   #479 <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//   62  116:invokestatic    #483 <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
	//   63  119:return          
			} else
			{
				setStateInternal(i);
	//   64  120:aload_0         
	//   65  121:iload_2         
	//   66  122:invokevirtual   #428 <Method void setStateInternal(int)>
				return;
	//   67  125:return          
			}
		}
		view = ((View) (new StringBuilder()));
	//   68  126:new             #524 <Class StringBuilder>
	//   69  129:dup             
	//   70  130:invokespecial   #525 <Method void StringBuilder()>
	//   71  133:astore_1        
		((StringBuilder) (view)).append("Illegal state argument: ");
	//   72  134:aload_1         
	//   73  135:ldc2            #527 <String "Illegal state argument: ">
	//   74  138:invokevirtual   #531 <Method StringBuilder StringBuilder.append(String)>
	//   75  141:pop             
		((StringBuilder) (view)).append(i);
	//   76  142:aload_1         
	//   77  143:iload_2         
	//   78  144:invokevirtual   #534 <Method StringBuilder StringBuilder.append(int)>
	//   79  147:pop             
		throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   80  148:new             #187 <Class IllegalArgumentException>
	//   81  151:dup             
	//   82  152:aload_1         
	//   83  153:invokevirtual   #538 <Method String StringBuilder.toString()>
	//   84  156:invokespecial   #192 <Method void IllegalArgumentException(String)>
	//   85  159:athrow          
	}

	int activePointerId;
	private BottomSheetCallback callback;
	int collapsedOffset;
	private final android.support.v4.widget.ViewDragHelper.Callback dragCallback;
	private boolean fitToContents;
	int fitToContentsOffset;
	int halfExpandedOffset;
	boolean hideable;
	private boolean ignoreEvents;
	private Map importantForAccessibilityMap;
	private int initialY;
	private int lastNestedScrollDy;
	private int lastPeekHeight;
	private float maximumVelocity;
	private boolean nestedScrolled;
	WeakReference nestedScrollingChildRef;
	int parentHeight;
	private int peekHeight;
	private boolean peekHeightAuto;
	private int peekHeightMin;
	private boolean skipCollapsed;
	int state;
	boolean touchingScrollingChild;
	private VelocityTracker velocityTracker;
	ViewDragHelper viewDragHelper;
	WeakReference viewRef;


/*
	static boolean access$000(BottomSheetBehavior bottomsheetbehavior)
	{
		return bottomsheetbehavior.fitToContents;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field boolean fitToContents>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(BottomSheetBehavior bottomsheetbehavior)
	{
		return bottomsheetbehavior.getExpandedOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method int getExpandedOffset()>
	//    2    4:ireturn         
	}

*/
}
