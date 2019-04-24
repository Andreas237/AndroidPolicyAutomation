// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Handler;
import android.widget.ProgressBar;

// Referenced classes of package com.irobot.home.fragments:
//			ca

class ca$1
	implements Runnable
{

	public void run()
	{
		int i = a.h.getProgress();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ca a>
	//    2    4:getfield        #23  <Field ProgressBar ca.h>
	//    3    7:invokevirtual   #29  <Method int ProgressBar.getProgress()>
	//    4   10:istore_1        
		if(i < a.h.getMax())
	//*   5   11:iload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #14  <Field ca a>
	//*   8   16:getfield        #23  <Field ProgressBar ca.h>
	//*   9   19:invokevirtual   #32  <Method int ProgressBar.getMax()>
	//*  10   22:icmpge          54
		{
			a.h.setProgress(i + 1);
	//   11   25:aload_0         
	//   12   26:getfield        #14  <Field ca a>
	//   13   29:getfield        #23  <Field ProgressBar ca.h>
	//   14   32:iload_1         
	//   15   33:iconst_1        
	//   16   34:iadd            
	//   17   35:invokevirtual   #36  <Method void ProgressBar.setProgress(int)>
			ca.a(a).postDelayed(((Runnable) (this)), 1000L);
	//   18   38:aload_0         
	//   19   39:getfield        #14  <Field ca a>
	//   20   42:invokestatic    #39  <Method Handler ca.a(ca)>
	//   21   45:aload_0         
	//   22   46:ldc2w           #40  <Long 1000L>
	//   23   49:invokevirtual   #47  <Method boolean Handler.postDelayed(Runnable, long)>
	//   24   52:pop             
			return;
	//   25   53:return          
		} else
		{
			a.a(a.UPDATE_INTERRUPTED);
	//   26   54:aload_0         
	//   27   55:getfield        #14  <Field ca a>
	//   28   58:getstatic       #53  <Field ca$a$a ca$a$a.UPDATE_INTERRUPTED>
	//   29   61:invokevirtual   #56  <Method void ca.a(ca$a$a)>
			return;
	//   30   64:return          
		}
	}

	final ca a;

	ca$1(ca ca1)
	{
		a = ca1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ca a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
