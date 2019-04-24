// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.ProgressBar;
import rx.functions.Action1;

public final class RxProgressBar
{

	public RxProgressBar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static Action1 incrementProgressBy(ProgressBar progressbar)
	{
		return new Action1(progressbar) {

			public void call(Integer integer)
			{
				view.incrementProgressBy(integer.intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ProgressBar val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method int Integer.intValue()>
			//    4    8:invokevirtual   #35  <Method void ProgressBar.incrementProgressBy(int)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Integer>
			//    3    5:invokevirtual   #38  <Method void call(Integer)>
			//    4    8:return          
			}

			final ProgressBar val$view;

			
			{
				view = progressbar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ProgressBar val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxProgressBar$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #28  <Method void RxProgressBar$1(ProgressBar)>
	//    4    8:areturn         
	}

	public static Action1 incrementSecondaryProgressBy(ProgressBar progressbar)
	{
		return new Action1(progressbar) {

			public void call(Integer integer)
			{
				view.incrementSecondaryProgressBy(integer.intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ProgressBar val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method int Integer.intValue()>
			//    4    8:invokevirtual   #35  <Method void ProgressBar.incrementSecondaryProgressBy(int)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Integer>
			//    3    5:invokevirtual   #38  <Method void call(Integer)>
			//    4    8:return          
			}

			final ProgressBar val$view;

			
			{
				view = progressbar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ProgressBar val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class RxProgressBar$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void RxProgressBar$2(ProgressBar)>
	//    4    8:areturn         
	}

	public static Action1 indeterminate(ProgressBar progressbar)
	{
		return new Action1(progressbar) {

			public void call(Boolean boolean1)
			{
				view.setIndeterminate(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ProgressBar val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void ProgressBar.setIndeterminate(boolean)>
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

			final ProgressBar val$view;

			
			{
				view = progressbar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ProgressBar val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class RxProgressBar$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void RxProgressBar$3(ProgressBar)>
	//    4    8:areturn         
	}

	public static Action1 max(ProgressBar progressbar)
	{
		return new Action1(progressbar) {

			public void call(Integer integer)
			{
				view.setMax(integer.intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ProgressBar val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method int Integer.intValue()>
			//    4    8:invokevirtual   #36  <Method void ProgressBar.setMax(int)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Integer>
			//    3    5:invokevirtual   #39  <Method void call(Integer)>
			//    4    8:return          
			}

			final ProgressBar val$view;

			
			{
				view = progressbar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ProgressBar val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #12  <Class RxProgressBar$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void RxProgressBar$4(ProgressBar)>
	//    4    8:areturn         
	}

	public static Action1 progress(ProgressBar progressbar)
	{
		return new Action1(progressbar) {

			public void call(Integer integer)
			{
				view.setProgress(integer.intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ProgressBar val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method int Integer.intValue()>
			//    4    8:invokevirtual   #36  <Method void ProgressBar.setProgress(int)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Integer>
			//    3    5:invokevirtual   #39  <Method void call(Integer)>
			//    4    8:return          
			}

			final ProgressBar val$view;

			
			{
				view = progressbar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ProgressBar val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #14  <Class RxProgressBar$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #41  <Method void RxProgressBar$5(ProgressBar)>
	//    4    8:areturn         
	}

	public static Action1 secondaryProgress(ProgressBar progressbar)
	{
		return new Action1(progressbar) {

			public void call(Integer integer)
			{
				view.setSecondaryProgress(integer.intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field ProgressBar val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method int Integer.intValue()>
			//    4    8:invokevirtual   #36  <Method void ProgressBar.setSecondaryProgress(int)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Integer>
			//    3    5:invokevirtual   #39  <Method void call(Integer)>
			//    4    8:return          
			}

			final ProgressBar val$view;

			
			{
				view = progressbar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ProgressBar val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #16  <Class RxProgressBar$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void RxProgressBar$6(ProgressBar)>
	//    4    8:areturn         
	}
}
