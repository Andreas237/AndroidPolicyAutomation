// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.widget.LinearLayout;
import com.paypal.android.sdk.*;

// Referenced classes of package com.paypal.android.sdk.payments:
//			be, dl, bi, cd

final class dr
	implements be
{

	dr(dl dl1)
	{
		a = dl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field dl a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(bi bi1)
	{
		a.dismissDialog(2);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field dl a>
	//    2    4:iconst_2        
	//    3    5:invokevirtual   #23  <Method void dl.dismissDialog(int)>
		if(bi1.b.equals("invalid_nonce"))
	//*   4    8:aload_1         
	//*   5    9:getfield        #29  <Field String bi.b>
	//*   6   12:ldc1            #31  <String "invalid_nonce">
	//*   7   14:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*   8   17:ifeq            49
		{
			a.c.h.setEnabled(false);
	//    9   20:aload_0         
	//   10   21:getfield        #12  <Field dl a>
	//   11   24:getfield        #41  <Field fd dl.c>
	//   12   27:getfield        #47  <Field LinearLayout fd.h>
	//   13   30:iconst_0        
	//   14   31:invokevirtual   #53  <Method void LinearLayout.setEnabled(boolean)>
			cd.a(((android.app.Activity) (a)), fa.a(fc.aL), 4);
	//   15   34:aload_0         
	//   16   35:getfield        #12  <Field dl a>
	//   17   38:getstatic       #59  <Field fc fc.aL>
	//   18   41:invokestatic    #64  <Method String fa.a(fc)>
	//   19   44:iconst_4        
	//   20   45:invokestatic    #69  <Method void cd.a(android.app.Activity, String, int)>
			return;
	//   21   48:return          
		} else
		{
			a.c.h.setEnabled(true);
	//   22   49:aload_0         
	//   23   50:getfield        #12  <Field dl a>
	//   24   53:getfield        #41  <Field fd dl.c>
	//   25   56:getfield        #47  <Field LinearLayout fd.h>
	//   26   59:iconst_1        
	//   27   60:invokevirtual   #53  <Method void LinearLayout.setEnabled(boolean)>
			cd.a(((android.app.Activity) (a)), fa.a(bi1.b), 1);
	//   28   63:aload_0         
	//   29   64:getfield        #12  <Field dl a>
	//   30   67:aload_1         
	//   31   68:getfield        #29  <Field String bi.b>
	//   32   71:invokestatic    #72  <Method String fa.a(String)>
	//   33   74:iconst_1        
	//   34   75:invokestatic    #69  <Method void cd.a(android.app.Activity, String, int)>
			return;
	//   35   78:return          
		}
	}

	public final void a(Object obj)
	{
		if(obj instanceof em)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #75  <Class em>
	//*   2    4:ifeq            19
		{
			dl.a(a, (em)obj);
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field dl a>
	//    5   11:aload_1         
	//    6   12:checkcast       #75  <Class em>
	//    7   15:invokestatic    #78  <Method void dl.a(dl, em)>
			return;
	//    8   18:return          
		} else
		{
			dl.b(a);
	//    9   19:aload_0         
	//   10   20:getfield        #12  <Field dl a>
	//   11   23:invokestatic    #80  <Method void dl.b(dl)>
			return;
	//   12   26:return          
		}
	}

	private dl a;
}
