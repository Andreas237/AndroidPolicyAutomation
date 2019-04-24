// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;

// Referenced classes of package com.irobot.home.util:
//			c

static final class c$1 extends c$a
{

	public void a()
	{
		if((System.currentTimeMillis() - d) / 1000L > 1L)
	//*   0    0:invokestatic    #37  <Method long System.currentTimeMillis()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #29  <Field long d>
	//*   3    7:lsub            
	//*   4    8:ldc2w           #38  <Long 1000L>
	//*   5   11:ldiv            
	//*   6   12:lconst_1        
	//*   7   13:lcmp            
	//*   8   14:ifle            22
			c = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #27  <Field int c>
		d = System.currentTimeMillis();
	//   12   22:aload_0         
	//   13   23:invokestatic    #37  <Method long System.currentTimeMillis()>
	//   14   26:putfield        #29  <Field long d>
		c = c + 1;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #27  <Field int c>
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:putfield        #27  <Field int c>
		if(c == 2)
	//*  21   39:aload_0         
	//*  22   40:getfield        #27  <Field int c>
	//*  23   43:iconst_2        
	//*  24   44:icmpne          55
		{
			com.irobot.home.util.c.a(a);
	//   25   47:aload_0         
	//   26   48:getfield        #20  <Field View a>
	//   27   51:invokestatic    #42  <Method void c.a(View)>
			return;
	//   28   54:return          
		}
		if(c >= 3)
	//*  29   55:aload_0         
	//*  30   56:getfield        #27  <Field int c>
	//*  31   59:iconst_3        
	//*  32   60:icmplt          75
		{
			com.irobot.home.util.c.b(b);
	//   33   63:aload_0         
	//   34   64:getfield        #22  <Field Activity b>
	//   35   67:invokestatic    #45  <Method void c.b(Activity)>
			c = 0;
	//   36   70:aload_0         
	//   37   71:iconst_0        
	//   38   72:putfield        #27  <Field int c>
		}
	//   39   75:return          
	}

	final View a;
	final Activity b;
	private int c;
	private long d;

	c$1(Context context, View view, Activity activity)
	{
		a = view;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #20  <Field View a>
		b = activity;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #22  <Field Activity b>
		super(context);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #25  <Method void c$a(Context)>
		c = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #27  <Field int c>
		d = 0L;
	//   12   20:aload_0         
	//   13   21:lconst_0        
	//   14   22:putfield        #29  <Field long d>
	//   15   25:return          
	}
}
