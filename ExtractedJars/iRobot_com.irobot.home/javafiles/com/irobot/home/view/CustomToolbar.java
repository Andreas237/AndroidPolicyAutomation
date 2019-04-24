// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.irobot.home.view:
//			a

public class CustomToolbar extends Toolbar
{

	public CustomToolbar(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void Toolbar(Context)>
		a(context, ((AttributeSet) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #14  <Method void a(Context, AttributeSet)>
	//    7   11:return          
	}

	public CustomToolbar(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void Toolbar(Context, AttributeSet)>
		a(context, attributeset);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #14  <Method void a(Context, AttributeSet)>
	//    8   12:return          
	}

	public CustomToolbar(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #20  <Method void Toolbar(Context, AttributeSet, int)>
		a(context, attributeset);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokespecial   #14  <Method void a(Context, AttributeSet)>
	//    9   13:return          
	}

	private void a(Context context, AttributeSet attributeset)
	{
		for(int i = 0; i < getChildCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #24  <Method int getChildCount()>
	//*   5    7:icmpge          74
		{
			Object obj = ((Object) (getChildAt(i)));
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #28  <Method android.view.View getChildAt(int)>
	//    9   15:astore          4
			if(!(obj instanceof TextView))
				continue;
	//   10   17:aload           4
	//   11   19:instanceof      #30  <Class TextView>
	//   12   22:ifeq            67
			obj = ((Object) ((TextView)obj));
	//   13   25:aload           4
	//   14   27:checkcast       #30  <Class TextView>
	//   15   30:astore          4
			if(e == null && attributeset != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #32  <Field String e>
	//*  18   36:ifnonnull       57
	//*  19   39:aload_2         
	//*  20   40:ifnull          57
				e = com.irobot.home.view.a.a(((TextView) (obj)), context, attributeset);
	//   21   43:aload_0         
	//   22   44:aload           4
	//   23   46:aload_1         
	//   24   47:aload_2         
	//   25   48:invokestatic    #37  <Method String a.a(TextView, Context, AttributeSet)>
	//   26   51:putfield        #32  <Field String e>
			else
	//*  27   54:goto            67
				com.irobot.home.view.a.a(((TextView) (obj)), context, e);
	//   28   57:aload           4
	//   29   59:aload_1         
	//   30   60:aload_0         
	//   31   61:getfield        #32  <Field String e>
	//   32   64:invokestatic    #40  <Method void a.a(TextView, Context, String)>
		}

	//   33   67:iload_3         
	//   34   68:iconst_1        
	//   35   69:iadd            
	//   36   70:istore_3        
	//*  37   71:goto            2
	//   38   74:return          
	}

	public void a(Context context, int i)
	{
		super.a(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void Toolbar.a(Context, int)>
		a(context, ((AttributeSet) (null)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #14  <Method void a(Context, AttributeSet)>
	//    8   12:return          
	}

	public void b(Context context, int i)
	{
		super.b(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Toolbar.b(Context, int)>
		a(context, ((AttributeSet) (null)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #14  <Method void a(Context, AttributeSet)>
	//    8   12:return          
	}

	private String e;
}
