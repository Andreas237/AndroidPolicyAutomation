// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.support.v4.view.h;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.view:
//			CheckableLinearLayout

public class AlertToggle extends CheckableLinearLayout
{
	public static interface a
	{

		public abstract void a(CheckableLinearLayout checkablelinearlayout, boolean flag);
	}


	public AlertToggle(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void CheckableLinearLayout(Context, AttributeSet)>
		b = context;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #25  <Field Context b>
		((LayoutInflater)b.getSystemService("layout_inflater")).inflate(0x7f0b0081, ((android.view.ViewGroup) (this)), true);
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field Context b>
	//    9   15:ldc1            #27  <String "layout_inflater">
	//   10   17:invokevirtual   #33  <Method Object Context.getSystemService(String)>
	//   11   20:checkcast       #35  <Class LayoutInflater>
	//   12   23:ldc1            #36  <Int 0x7f0b0081>
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #40  <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   16   30:pop             
		c = (SwitchCompat)findViewById(0x7f09004c);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:ldc1            #41  <Int 0x7f09004c>
	//   20   35:invokevirtual   #45  <Method android.view.View findViewById(int)>
	//   21   38:checkcast       #47  <Class SwitchCompat>
	//   22   41:putfield        #49  <Field SwitchCompat c>
	//   23   44:return          
	}

	protected void a(boolean flag, boolean flag1)
	{
		super.a(flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #52  <Method void CheckableLinearLayout.a(boolean, boolean)>
		if(c != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #49  <Field SwitchCompat c>
	//*   6   10:ifnull          21
			c.setChecked(flag);
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field SwitchCompat c>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #56  <Method void SwitchCompat.setChecked(boolean)>
	//   11   21:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		if(h.a(motionevent) != 0)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #63  <Method int h.a(MotionEvent)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(d != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #65  <Field AlertToggle$a d>
	//*   7   13:ifnull          33
			d.a(((CheckableLinearLayout) (this)), isChecked());
	//    8   16:aload_0         
	//    9   17:getfield        #65  <Field AlertToggle$a d>
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #69  <Method boolean isChecked()>
	//   13   25:invokeinterface #72  <Method void AlertToggle$a.a(CheckableLinearLayout, boolean)>
		else
	//*  14   30:goto            41
			o.e(a, "onBeforeCheckChangedListener is null, needs to be set");
	//   15   33:getstatic       #74  <Field String a>
	//   16   36:ldc1            #76  <String "onBeforeCheckChangedListener is null, needs to be set">
	//   17   38:invokestatic    #82  <Method void o.e(String, String)>
		return true;
	//   18   41:iconst_1        
	//   19   42:ireturn         
	}

	public boolean performClick()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #86  <Method void CheckableLinearLayout.setEnabled(boolean)>
		if(c != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #49  <Field SwitchCompat c>
	//*   5    9:ifnull          20
			c.setEnabled(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field SwitchCompat c>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #87  <Method void SwitchCompat.setEnabled(boolean)>
	//   10   20:return          
	}

	public void setOnBeforeCheckedChangeListener(a a1)
	{
		d = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field AlertToggle$a d>
	//    3    5:return          
	}

	private static final String a = "AlertToggle";
	private Context b;
	private SwitchCompat c;
	private a d;

	static 
	{
	//    0    0:return          
	}
}
