// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.irobot.home.BroadcastSetupActivity;

// Referenced classes of package com.irobot.home.fragments:
//			bq

class bq$1
	implements Runnable
{

	public void run()
	{
		c.e.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field bq c>
	//    2    4:getfield        #33  <Field LinearLayout bq.e>
	//    3    7:bipush          8
	//    4    9:invokevirtual   #38  <Method void LinearLayout.setVisibility(int)>
		String s;
		if(a > 0)
	//*   5   12:aload_0         
	//*   6   13:getfield        #22  <Field int a>
	//*   7   16:ifle            90
		{
			c.d.setVisibility(4);
	//    8   19:aload_0         
	//    9   20:getfield        #20  <Field bq c>
	//   10   23:getfield        #42  <Field FrameLayout bq.d>
	//   11   26:iconst_4        
	//   12   27:invokevirtual   #45  <Method void FrameLayout.setVisibility(int)>
			String s1 = c.getResources().getQuantityString(0x7f0d0023, a);
	//   13   30:aload_0         
	//   14   31:getfield        #20  <Field bq c>
	//   15   34:invokevirtual   #49  <Method Resources bq.getResources()>
	//   16   37:ldc1            #50  <Int 0x7f0d0023>
	//   17   39:aload_0         
	//   18   40:getfield        #22  <Field int a>
	//   19   43:invokevirtual   #56  <Method String Resources.getQuantityString(int, int)>
	//   20   46:astore_2        
			c.e.setVisibility(0);
	//   21   47:aload_0         
	//   22   48:getfield        #20  <Field bq c>
	//   23   51:getfield        #33  <Field LinearLayout bq.e>
	//   24   54:iconst_0        
	//   25   55:invokevirtual   #38  <Method void LinearLayout.setVisibility(int)>
			s = s1;
	//   26   58:aload_2         
	//   27   59:astore_1        
			if(1 < a)
	//*  28   60:iconst_1        
	//*  29   61:aload_0         
	//*  30   62:getfield        #22  <Field int a>
	//*  31   65:icmpge          127
				s = String.format(s1, new Object[] {
					Integer.valueOf(a)
				});
	//   32   68:aload_2         
	//   33   69:iconst_1        
	//   34   70:anewarray       Object[]
	//   35   73:dup             
	//   36   74:iconst_0        
	//   37   75:aload_0         
	//   38   76:getfield        #22  <Field int a>
	//   39   79:invokestatic    #62  <Method Integer Integer.valueOf(int)>
	//   40   82:aastore         
	//   41   83:invokestatic    #68  <Method String String.format(String, Object[])>
	//   42   86:astore_1        
		} else
	//*  43   87:goto            127
		if(-1 == a)
	//*  44   90:iconst_m1       
	//*  45   91:aload_0         
	//*  46   92:getfield        #22  <Field int a>
	//*  47   95:icmpne          125
		{
			c.d.setVisibility(0);
	//   48   98:aload_0         
	//   49   99:getfield        #20  <Field bq c>
	//   50  102:getfield        #42  <Field FrameLayout bq.d>
	//   51  105:iconst_0        
	//   52  106:invokevirtual   #45  <Method void FrameLayout.setVisibility(int)>
			s = c.getResources().getString(0x7f0f07dd);
	//   53  109:aload_0         
	//   54  110:getfield        #20  <Field bq c>
	//   55  113:invokevirtual   #49  <Method Resources bq.getResources()>
	//   56  116:ldc1            #69  <Int 0x7f0f07dd>
	//   57  118:invokevirtual   #73  <Method String Resources.getString(int)>
	//   58  121:astore_1        
		} else
	//*  59  122:goto            127
		{
			s = null;
	//   60  125:aconst_null     
	//   61  126:astore_1        
		}
		if(s != null)
	//*  62  127:aload_1         
	//*  63  128:ifnull          139
			b.a(s);
	//   64  131:aload_0         
	//   65  132:getfield        #24  <Field BroadcastSetupActivity b>
	//   66  135:aload_1         
	//   67  136:invokevirtual   #78  <Method void BroadcastSetupActivity.a(String)>
	//   68  139:return          
	}

	final int a;
	final BroadcastSetupActivity b;
	final bq c;

	bq$1(bq bq1, int i, BroadcastSetupActivity broadcastsetupactivity)
	{
		c = bq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field bq c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int a>
		b = broadcastsetupactivity;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field BroadcastSetupActivity b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
