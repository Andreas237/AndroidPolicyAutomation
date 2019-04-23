// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.paypal.android.sdk:
//			cb, cc

public final class fe
{

	public fe(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		c = new LinearLayout(context);
	//    2    4:aload_0         
	//    3    5:new             #16  <Class LinearLayout>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #18  <Method void LinearLayout(Context)>
	//    7   13:putfield        #20  <Field LinearLayout c>
		c.setOrientation(0);
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field LinearLayout c>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #24  <Method void LinearLayout.setOrientation(int)>
		b = new TextView(context);
	//   12   24:aload_0         
	//   13   25:new             #26  <Class TextView>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:invokespecial   #27  <Method void TextView(Context)>
	//   17   33:putfield        #29  <Field TextView b>
		b.setText("server");
	//   18   36:aload_0         
	//   19   37:getfield        #29  <Field TextView b>
	//   20   40:ldc1            #31  <String "server">
	//   21   42:invokevirtual   #35  <Method void TextView.setText(CharSequence)>
		b.setTextColor(-1);
	//   22   45:aload_0         
	//   23   46:getfield        #29  <Field TextView b>
	//   24   49:iconst_m1       
	//   25   50:invokevirtual   #38  <Method void TextView.setTextColor(int)>
		b.setBackgroundColor(cb.e);
	//   26   53:aload_0         
	//   27   54:getfield        #29  <Field TextView b>
	//   28   57:getstatic       #44  <Field int cb.e>
	//   29   60:invokevirtual   #47  <Method void TextView.setBackgroundColor(int)>
		b.setGravity(17);
	//   30   63:aload_0         
	//   31   64:getfield        #29  <Field TextView b>
	//   32   67:bipush          17
	//   33   69:invokevirtual   #50  <Method void TextView.setGravity(int)>
		c.addView(((android.view.View) (b)));
	//   34   72:aload_0         
	//   35   73:getfield        #20  <Field LinearLayout c>
	//   36   76:aload_0         
	//   37   77:getfield        #29  <Field TextView b>
	//   38   80:invokevirtual   #54  <Method void LinearLayout.addView(android.view.View)>
		cc.a(((android.view.View) (b)), "8dip", "8dip", "8dip", "8dip");
	//   39   83:aload_0         
	//   40   84:getfield        #29  <Field TextView b>
	//   41   87:ldc1            #56  <String "8dip">
	//   42   89:ldc1            #56  <String "8dip">
	//   43   91:ldc1            #56  <String "8dip">
	//   44   93:ldc1            #56  <String "8dip">
	//   45   95:invokestatic    #61  <Method void cc.a(android.view.View, String, String, String, String)>
		cc.a(((android.view.View) (b)), -2, -2);
	//   46   98:aload_0         
	//   47   99:getfield        #29  <Field TextView b>
	//   48  102:bipush          -2
	//   49  104:bipush          -2
	//   50  106:invokestatic    #64  <Method void cc.a(android.view.View, int, int)>
		cc.b(((android.view.View) (b)), ((String) (null)), "15dip", ((String) (null)), "15dip");
	//   51  109:aload_0         
	//   52  110:getfield        #29  <Field TextView b>
	//   53  113:aconst_null     
	//   54  114:ldc1            #66  <String "15dip">
	//   55  116:aconst_null     
	//   56  117:ldc1            #66  <String "15dip">
	//   57  119:invokestatic    #68  <Method void cc.b(android.view.View, String, String, String, String)>
		cc.a(((android.view.View) (b)), 1, 1.0F);
	//   58  122:aload_0         
	//   59  123:getfield        #29  <Field TextView b>
	//   60  126:iconst_1        
	//   61  127:fconst_1        
	//   62  128:invokestatic    #71  <Method void cc.a(android.view.View, int, float)>
		a = c;
	//   63  131:aload_0         
	//   64  132:aload_0         
	//   65  133:getfield        #20  <Field LinearLayout c>
	//   66  136:putfield        #73  <Field LinearLayout a>
	//   67  139:return          
	}

	public LinearLayout a;
	public TextView b;
	private LinearLayout c;
}
