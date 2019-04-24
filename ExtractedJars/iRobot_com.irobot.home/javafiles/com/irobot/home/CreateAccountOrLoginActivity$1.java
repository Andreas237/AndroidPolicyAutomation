// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.ViewTreeObserver;
import android.widget.*;

// Referenced classes of package com.irobot.home:
//			CreateAccountOrLoginActivity

class CreateAccountOrLoginActivity$1
	implements android.view.Listener
{

	public void onGlobalLayout()
	{
		boolean flag;
		if(a.c.getHeight() < a.d.getHeight() + a.c.getPaddingTop() + a.c.getPaddingBottom())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field CreateAccountOrLoginActivity a>
	//*   2    4:getfield        #25  <Field ScrollView CreateAccountOrLoginActivity.c>
	//*   3    7:invokevirtual   #31  <Method int ScrollView.getHeight()>
	//*   4   10:aload_0         
	//*   5   11:getfield        #17  <Field CreateAccountOrLoginActivity a>
	//*   6   14:getfield        #35  <Field RelativeLayout CreateAccountOrLoginActivity.d>
	//*   7   17:invokevirtual   #38  <Method int RelativeLayout.getHeight()>
	//*   8   20:aload_0         
	//*   9   21:getfield        #17  <Field CreateAccountOrLoginActivity a>
	//*  10   24:getfield        #25  <Field ScrollView CreateAccountOrLoginActivity.c>
	//*  11   27:invokevirtual   #41  <Method int ScrollView.getPaddingTop()>
	//*  12   30:iadd            
	//*  13   31:aload_0         
	//*  14   32:getfield        #17  <Field CreateAccountOrLoginActivity a>
	//*  15   35:getfield        #25  <Field ScrollView CreateAccountOrLoginActivity.c>
	//*  16   38:invokevirtual   #44  <Method int ScrollView.getPaddingBottom()>
	//*  17   41:iadd            
	//*  18   42:icmpge          50
			flag = true;
	//   19   45:iconst_1        
	//   20   46:istore_1        
		else
	//*  21   47:goto            52
			flag = false;
	//   22   50:iconst_0        
	//   23   51:istore_1        
		android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)a.e.getLayoutParams();
	//   24   52:aload_0         
	//   25   53:getfield        #17  <Field CreateAccountOrLoginActivity a>
	//   26   56:getfield        #47  <Field LinearLayout CreateAccountOrLoginActivity.e>
	//   27   59:invokevirtual   #53  <Method android.view.ViewGroup$LayoutParams LinearLayout.getLayoutParams()>
	//   28   62:checkcast       #55  <Class android.widget.RelativeLayout$LayoutParams>
	//   29   65:astore_2        
		if(flag)
	//*  30   66:iload_1         
	//*  31   67:ifeq            86
		{
			layoutparams.removeRule(12);
	//   32   70:aload_2         
	//   33   71:bipush          12
	//   34   73:invokevirtual   #59  <Method void android.widget.RelativeLayout$LayoutParams.removeRule(int)>
			layoutparams.addRule(3, 0x7f090124);
	//   35   76:aload_2         
	//   36   77:iconst_3        
	//   37   78:ldc1            #60  <Int 0x7f090124>
	//   38   80:invokevirtual   #64  <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
		} else
	//*  39   83:goto            97
		{
			layoutparams.removeRule(3);
	//   40   86:aload_2         
	//   41   87:iconst_3        
	//   42   88:invokevirtual   #59  <Method void android.widget.RelativeLayout$LayoutParams.removeRule(int)>
			layoutparams.addRule(12);
	//   43   91:aload_2         
	//   44   92:bipush          12
	//   45   94:invokevirtual   #66  <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		}
		a.e.getViewTreeObserver().removeOnGlobalLayoutListener(CreateAccountOrLoginActivity.a(a));
	//   46   97:aload_0         
	//   47   98:getfield        #17  <Field CreateAccountOrLoginActivity a>
	//   48  101:getfield        #47  <Field LinearLayout CreateAccountOrLoginActivity.e>
	//   49  104:invokevirtual   #70  <Method ViewTreeObserver LinearLayout.getViewTreeObserver()>
	//   50  107:aload_0         
	//   51  108:getfield        #17  <Field CreateAccountOrLoginActivity a>
	//   52  111:invokestatic    #73  <Method android.view.ViewTreeObserver$OnGlobalLayoutListener CreateAccountOrLoginActivity.a(CreateAccountOrLoginActivity)>
	//   53  114:invokevirtual   #79  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		a.e.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   54  117:aload_0         
	//   55  118:getfield        #17  <Field CreateAccountOrLoginActivity a>
	//   56  121:getfield        #47  <Field LinearLayout CreateAccountOrLoginActivity.e>
	//   57  124:aload_2         
	//   58  125:invokevirtual   #83  <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   59  128:return          
	}

	final CreateAccountOrLoginActivity a;

	CreateAccountOrLoginActivity$1(CreateAccountOrLoginActivity createaccountorloginactivity)
	{
		a = createaccountorloginactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CreateAccountOrLoginActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
