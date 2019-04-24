// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import java.security.InvalidParameterException;

// Referenced classes of package com.irobot.home.view:
//			RevealableView

public static class RevealableView$a
{

	public RevealableView$a a(int i)
	{
		a.a = i;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field RevealableView$c a>
	//    2    4:iload_1         
	//    3    5:putfield        #35  <Field int RevealableView$c.a>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public RevealableView$a a(RevealableView$b revealableview$b)
	{
		RevealableView$c.a(a, revealableview$b);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field RevealableView$c a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #39  <Method RevealableView$b RevealableView$c.a(RevealableView$c, RevealableView$b)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public RevealableView a()
	{
		RevealableView revealableview = new RevealableView(b);
	//    0    0:new             #6   <Class RevealableView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Context b>
	//    4    8:invokespecial   #41  <Method void RevealableView(Context)>
	//    5   11:astore_1        
		RevealableView.a(revealableview, a);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field RevealableView$c a>
	//    9   17:invokestatic    #44  <Method void RevealableView.a(RevealableView, RevealableView$c)>
		return revealableview;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public RevealableView$a b(int i)
	{
		a.b = i;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field RevealableView$c a>
	//    2    4:iload_1         
	//    3    5:putfield        #46  <Field int RevealableView$c.b>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private RevealableView$c a;
	private final Context b;

	public RevealableView$a(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Context b>
		if(b != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #17  <Field Context b>
	//*   7   13:ifnull          29
		{
			a = new RevealableView$c(context);
	//    8   16:aload_0         
	//    9   17:new             #19  <Class RevealableView$c>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #21  <Method void RevealableView$c(Context)>
	//   13   25:putfield        #23  <Field RevealableView$c a>
			return;
	//   14   28:return          
		} else
		{
			throw new InvalidParameterException("RevealableView must have a non-null context and a view holder as parent view");
	//   15   29:new             #25  <Class InvalidParameterException>
	//   16   32:dup             
	//   17   33:ldc1            #27  <String "RevealableView must have a non-null context and a view holder as parent view">
	//   18   35:invokespecial   #30  <Method void InvalidParameterException(String)>
	//   19   38:athrow          
		}
	}
}
