// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.Functions;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Observable;
import rx.functions.*;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewAttachEventOnSubscribe, ViewAttachesOnSubscribe, ViewClickEventOnSubscribe, ViewClickOnSubscribe, 
//			ViewDragEventOnSubscribe, ViewDragOnSubscribe, ViewFocusChangeEventOnSubscribe, ViewFocusChangeOnSubscribe, 
//			ViewLongClickEventOnSubscribe, ViewLongClickOnSubscribe, ViewTouchEventOnSubscribe, ViewTouchOnSubscribe

public final class RxView
{

	private RxView()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #22  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #24  <String "No instances.">
	//    5   10:invokespecial   #27  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static Action1 activated(View view)
	{
		return new Action1(view) {

			public void call(Boolean boolean1)
			{
				view.setActivated(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field View val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void View.setActivated(boolean)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Boolean>
			//    3    5:invokevirtual   #39  <Method void call(Boolean)>
			//    4    8:return          
			}

			final View val$view;

			
			{
				view = view1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field View val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxView$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #35  <Method void RxView$1(View)>
	//    4    8:areturn         
	}

	public static Observable attachEvents(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewAttachEventOnSubscribe(view))));
	//    0    0:new             #42  <Class ViewAttachEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void ViewAttachEventOnSubscribe(View)>
	//    4    8:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable attaches(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewAttachesOnSubscribe(view, true))));
	//    0    0:new             #54  <Class ViewAttachesOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #57  <Method void ViewAttachesOnSubscribe(View, boolean)>
	//    5    9:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable clickEvents(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewClickEventOnSubscribe(view))));
	//    0    0:new             #61  <Class ViewClickEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void ViewClickEventOnSubscribe(View)>
	//    4    8:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Action1 clickable(View view)
	{
		return new Action1(view) {

			public void call(Boolean boolean1)
			{
				view.setClickable(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field View val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void View.setClickable(boolean)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Boolean>
			//    3    5:invokevirtual   #39  <Method void call(Boolean)>
			//    4    8:return          
			}

			final View val$view;

			
			{
				view = view1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field View val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class RxView$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #65  <Method void RxView$2(View)>
	//    4    8:areturn         
	}

	public static Observable clicks(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewClickOnSubscribe(view))));
	//    0    0:new             #68  <Class ViewClickOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #69  <Method void ViewClickOnSubscribe(View)>
	//    4    8:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable detaches(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewAttachesOnSubscribe(view, false))));
	//    0    0:new             #54  <Class ViewAttachesOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #57  <Method void ViewAttachesOnSubscribe(View, boolean)>
	//    5    9:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable dragEvents(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewDragEventOnSubscribe(view, Functions.FUNC1_ALWAYS_TRUE))));
	//    0    0:new             #73  <Class ViewDragEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #79  <Field Func1 Functions.FUNC1_ALWAYS_TRUE>
	//    4    8:invokespecial   #82  <Method void ViewDragEventOnSubscribe(View, Func1)>
	//    5   11:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   14:areturn         
	}

	public static Observable dragEvents(View view, Func1 func1)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewDragEventOnSubscribe(view, func1))));
	//    0    0:new             #73  <Class ViewDragEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #82  <Method void ViewDragEventOnSubscribe(View, Func1)>
	//    5    9:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable drags(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewDragOnSubscribe(view, Functions.FUNC1_ALWAYS_TRUE))));
	//    0    0:new             #88  <Class ViewDragOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #79  <Field Func1 Functions.FUNC1_ALWAYS_TRUE>
	//    4    8:invokespecial   #89  <Method void ViewDragOnSubscribe(View, Func1)>
	//    5   11:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   14:areturn         
	}

	public static Observable drags(View view, Func1 func1)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewDragOnSubscribe(view, func1))));
	//    0    0:new             #88  <Class ViewDragOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #89  <Method void ViewDragOnSubscribe(View, Func1)>
	//    5    9:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Action1 enabled(View view)
	{
		return new Action1(view) {

			public void call(Boolean boolean1)
			{
				view.setEnabled(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field View val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void View.setEnabled(boolean)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Boolean>
			//    3    5:invokevirtual   #39  <Method void call(Boolean)>
			//    4    8:return          
			}

			final View val$view;

			
			{
				view = view1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field View val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class RxView$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #93  <Method void RxView$3(View)>
	//    4    8:areturn         
	}

	public static Observable focusChangeEvents(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewFocusChangeEventOnSubscribe(view))));
	//    0    0:new             #96  <Class ViewFocusChangeEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #97  <Method void ViewFocusChangeEventOnSubscribe(View)>
	//    4    8:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable focusChanges(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewFocusChangeOnSubscribe(view))));
	//    0    0:new             #101 <Class ViewFocusChangeOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #102 <Method void ViewFocusChangeOnSubscribe(View)>
	//    4    8:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable longClickEvents(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewLongClickEventOnSubscribe(view, Functions.FUNC1_ALWAYS_TRUE))));
	//    0    0:new             #106 <Class ViewLongClickEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #79  <Field Func1 Functions.FUNC1_ALWAYS_TRUE>
	//    4    8:invokespecial   #107 <Method void ViewLongClickEventOnSubscribe(View, Func1)>
	//    5   11:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   14:areturn         
	}

	public static Observable longClickEvents(View view, Func1 func1)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewLongClickEventOnSubscribe(view, func1))));
	//    0    0:new             #106 <Class ViewLongClickEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #107 <Method void ViewLongClickEventOnSubscribe(View, Func1)>
	//    5    9:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable longClicks(View view)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewLongClickOnSubscribe(view, Functions.FUNC0_ALWAYS_TRUE))));
	//    0    0:new             #112 <Class ViewLongClickOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #116 <Field Func0 Functions.FUNC0_ALWAYS_TRUE>
	//    4    8:invokespecial   #119 <Method void ViewLongClickOnSubscribe(View, Func0)>
	//    5   11:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   14:areturn         
	}

	public static Observable longClicks(View view, Func0 func0)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewLongClickOnSubscribe(view, func0))));
	//    0    0:new             #112 <Class ViewLongClickOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #119 <Method void ViewLongClickOnSubscribe(View, Func0)>
	//    5    9:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Action1 pressed(View view)
	{
		return new Action1(view) {

			public void call(Boolean boolean1)
			{
				view.setPressed(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field View val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void View.setPressed(boolean)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Boolean>
			//    3    5:invokevirtual   #39  <Method void call(Boolean)>
			//    4    8:return          
			}

			final View val$view;

			
			{
				view = view1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field View val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #12  <Class RxView$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #123 <Method void RxView$4(View)>
	//    4    8:areturn         
	}

	public static Action1 selected(View view)
	{
		return new Action1(view) {

			public void call(Boolean boolean1)
			{
				view.setSelected(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field View val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void View.setSelected(boolean)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Boolean>
			//    3    5:invokevirtual   #39  <Method void call(Boolean)>
			//    4    8:return          
			}

			final View val$view;

			
			{
				view = view1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field View val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #14  <Class RxView$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #125 <Method void RxView$5(View)>
	//    4    8:areturn         
	}

	public static Observable touchEvents(View view)
	{
		return touchEvents(view, Functions.FUNC1_ALWAYS_TRUE);
	//    0    0:aload_0         
	//    1    1:getstatic       #79  <Field Func1 Functions.FUNC1_ALWAYS_TRUE>
	//    2    4:invokestatic    #128 <Method Observable touchEvents(View, Func1)>
	//    3    7:areturn         
	}

	public static Observable touchEvents(View view, Func1 func1)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewTouchEventOnSubscribe(view, func1))));
	//    0    0:new             #131 <Class ViewTouchEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #132 <Method void ViewTouchEventOnSubscribe(View, Func1)>
	//    5    9:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable touches(View view)
	{
		return touches(view, Functions.FUNC1_ALWAYS_TRUE);
	//    0    0:aload_0         
	//    1    1:getstatic       #79  <Field Func1 Functions.FUNC1_ALWAYS_TRUE>
	//    2    4:invokestatic    #136 <Method Observable touches(View, Func1)>
	//    3    7:areturn         
	}

	public static Observable touches(View view, Func1 func1)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ViewTouchOnSubscribe(view, func1))));
	//    0    0:new             #139 <Class ViewTouchOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #140 <Method void ViewTouchOnSubscribe(View, Func1)>
	//    5    9:invokestatic    #49  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Action1 visibility(View view)
	{
		return visibility(view, 8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokestatic    #145 <Method Action1 visibility(View, int)>
	//    3    6:areturn         
	}

	public static Action1 visibility(View view, int i)
	{
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			boolean flag;
			if(i != 0)
	//*   2    2:iload_1         
	//*   3    3:ifeq            45
				flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_2        
			else
	//*   6    8:iload_2         
	//*   7    9:ldc1            #147 <String "Setting visibility to VISIBLE when false would have no effect.">
	//*   8   11:invokestatic    #153 <Method void Preconditions.checkArgument(boolean, String)>
	//*   9   14:iload_1         
	//*  10   15:iconst_4        
	//*  11   16:icmpeq          27
	//*  12   19:iload_3         
	//*  13   20:istore_2        
	//*  14   21:iload_1         
	//*  15   22:bipush          8
	//*  16   24:icmpne          29
	//*  17   27:iconst_1        
	//*  18   28:istore_2        
	//*  19   29:iload_2         
	//*  20   30:ldc1            #155 <String "Must set visibility to INVISIBLE or GONE when false.">
	//*  21   32:invokestatic    #153 <Method void Preconditions.checkArgument(boolean, String)>
	//*  22   35:new             #16  <Class RxView$6>
	//*  23   38:dup             
	//*  24   39:aload_0         
	//*  25   40:iload_1         
	//*  26   41:invokespecial   #158 <Method void RxView$6(View, int)>
	//*  27   44:areturn         
				flag = false;
	//   28   45:iconst_0        
	//   29   46:istore_2        
			Preconditions.checkArgument(flag, "Setting visibility to VISIBLE when false would have no effect.");
			if(i != 4)
			{
				flag = flag1;
				if(i != 8)
					break label0;
			}
			flag = true;
		}
		Preconditions.checkArgument(flag, "Must set visibility to INVISIBLE or GONE when false.");
		return new Action1(view, i) {

			public void call(Boolean boolean1)
			{
				View view1 = view;
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field View val$view>
			//    2    4:astore_3        
				int j;
				if(boolean1.booleanValue())
			//*   3    5:aload_1         
			//*   4    6:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
			//*   5    9:ifeq            20
					j = 0;
			//    6   12:iconst_0        
			//    7   13:istore_2        
				else
			//*   8   14:aload_3         
			//*   9   15:iload_2         
			//*  10   16:invokevirtual   #40  <Method void View.setVisibility(int)>
			//*  11   19:return          
					j = visibilityWhenFalse;
			//   12   20:aload_0         
			//   13   21:getfield        #22  <Field int val$visibilityWhenFalse>
			//   14   24:istore_2        
				view1.setVisibility(j);
			//*  15   25:goto            14
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #30  <Class Boolean>
			//    3    5:invokevirtual   #43  <Method void call(Boolean)>
			//    4    8:return          
			}

			final View val$view;
			final int val$visibilityWhenFalse;

			
			{
				view = view1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field View val$view>
				visibilityWhenFalse = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$visibilityWhenFalse>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//*  30   47:goto            8
	}
}
