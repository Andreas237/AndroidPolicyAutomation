// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;


// Referenced classes of package com.irobot.home.view:
//			HideableView

class HideableView$1
	implements Runnable
{

	public void run()
	{
		HideableView hideableview = b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field HideableView b>
	//    2    4:astore_2        
		byte byte0;
		if(a)
	//*   3    5:aload_0         
	//*   4    6:getfield        #20  <Field boolean a>
	//*   5    9:ifeq            17
			byte0 = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		else
	//*   8   14:goto            38
		if(HideableView.a(b) == HideableView$a.hideInLayout)
	//*   9   17:aload_0         
	//*  10   18:getfield        #18  <Field HideableView b>
	//*  11   21:invokestatic    #28  <Method HideableView$a HideableView.a(HideableView)>
	//*  12   24:getstatic       #34  <Field HideableView$a HideableView$a.hideInLayout>
	//*  13   27:if_acmpne       35
			byte0 = 4;
	//   14   30:iconst_4        
	//   15   31:istore_1        
		else
	//*  16   32:goto            38
			byte0 = 8;
	//   17   35:bipush          8
	//   18   37:istore_1        
		hideableview.setVisibility(((int) (byte0)));
	//   19   38:aload_2         
	//   20   39:iload_1         
	//   21   40:invokevirtual   #38  <Method void HideableView.setVisibility(int)>
	//   22   43:return          
	}

	final boolean a;
	final HideableView b;

	HideableView$1(HideableView hideableview, boolean flag)
	{
		b = hideableview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field HideableView b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
