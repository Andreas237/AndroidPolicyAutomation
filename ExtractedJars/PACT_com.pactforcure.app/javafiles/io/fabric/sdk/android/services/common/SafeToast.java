// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import io.fabric.sdk.android.services.concurrency.PriorityRunnable;

public class SafeToast extends Toast
{

	public SafeToast(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void Toast(Context)>
	//    3    5:return          
	}

	public static Toast makeText(Context context, int i, int j)
		throws android.content.res.Resources.NotFoundException
	{
		return makeText(context, context.getResources().getText(i), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #27  <Method Resources Context.getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #33  <Method CharSequence Resources.getText(int)>
	//    5    9:iload_2         
	//    6   10:invokestatic    #36  <Method Toast makeText(Context, CharSequence, int)>
	//    7   13:areturn         
	}

	public static Toast makeText(Context context, CharSequence charsequence, int i)
	{
		charsequence = ((CharSequence) (Toast.makeText(context, charsequence, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #38  <Method Toast Toast.makeText(Context, CharSequence, int)>
	//    4    6:astore_1        
		context = ((Context) (new SafeToast(context)));
	//    5    7:new             #2   <Class SafeToast>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #39  <Method void SafeToast(Context)>
	//    9   15:astore_0        
		((SafeToast) (context)).setView(((Toast) (charsequence)).getView());
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #43  <Method android.view.View Toast.getView()>
	//   13   21:invokevirtual   #47  <Method void setView(android.view.View)>
		((SafeToast) (context)).setDuration(((Toast) (charsequence)).getDuration());
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #51  <Method int Toast.getDuration()>
	//   17   29:invokevirtual   #55  <Method void setDuration(int)>
		return ((Toast) (context));
	//   18   32:aload_0         
	//   19   33:areturn         
	}

	public void show()
	{
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #61  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #64  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       14
		{
			super.show();
	//    3    9:aload_0         
	//    4   10:invokespecial   #17  <Method void Toast.show()>
			return;
	//    5   13:return          
		} else
		{
			(new Handler(Looper.getMainLooper())).post(((Runnable) (new PriorityRunnable() {

				public void run()
				{
					show();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field SafeToast this$0>
				//    2    4:invokestatic    #22  <Method void SafeToast.access$001(SafeToast)>
				//    3    7:return          
				}

				final SafeToast this$0;

			
			{
				this$0 = SafeToast.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SafeToast this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void PriorityRunnable()>
			//    5    9:return          
			}
			}
)));
	//    6   14:new             #66  <Class Handler>
	//    7   17:dup             
	//    8   18:invokestatic    #64  <Method Looper Looper.getMainLooper()>
	//    9   21:invokespecial   #69  <Method void Handler(Looper)>
	//   10   24:new             #6   <Class SafeToast$1>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:invokespecial   #71  <Method void SafeToast$1(SafeToast)>
	//   14   32:invokevirtual   #75  <Method boolean Handler.post(Runnable)>
	//   15   35:pop             
			return;
	//   16   36:return          
		}
	}


/*
	static void access$001(SafeToast safetoast)
	{
		((Toast) (safetoast)).Toast.show();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Toast.show()>
		return;
	//    2    4:return          
	}

*/
}
