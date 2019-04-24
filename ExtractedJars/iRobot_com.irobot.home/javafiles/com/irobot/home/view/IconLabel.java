// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class IconLabel extends FrameLayout
{

	public IconLabel(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FrameLayout(Context)>
		a = "";
	//    3    5:aload_0         
	//    4    6:ldc1            #18  <String "">
	//    5    8:putfield        #20  <Field String a>
		b = "";
	//    6   11:aload_0         
	//    7   12:ldc1            #18  <String "">
	//    8   14:putfield        #22  <Field String b>
		c = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #24  <Field boolean c>
		a();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #27  <Method void a()>
	//   14   26:return          
	}

	public IconLabel(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void FrameLayout(Context, AttributeSet)>
		a = "";
	//    4    6:aload_0         
	//    5    7:ldc1            #18  <String "">
	//    6    9:putfield        #20  <Field String a>
		b = "";
	//    7   12:aload_0         
	//    8   13:ldc1            #18  <String "">
	//    9   15:putfield        #22  <Field String b>
		c = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #24  <Field boolean c>
		a(attributeset);
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:invokespecial   #34  <Method void a(AttributeSet)>
		a();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #27  <Method void a()>
	//   18   32:return          
	}

	public IconLabel(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #37  <Method void FrameLayout(Context, AttributeSet, int)>
		a = "";
	//    5    7:aload_0         
	//    6    8:ldc1            #18  <String "">
	//    7   10:putfield        #20  <Field String a>
		b = "";
	//    8   13:aload_0         
	//    9   14:ldc1            #18  <String "">
	//   10   16:putfield        #22  <Field String b>
		c = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #24  <Field boolean c>
		a(attributeset);
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:invokespecial   #34  <Method void a(AttributeSet)>
		a();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #27  <Method void a()>
	//   19   33:return          
	}

	private void a(AttributeSet attributeset)
	{
		attributeset = ((AttributeSet) (getContext().getTheme().obtainStyledAttributes(attributeset, com.irobot.home.g.a.IconLabel, 0, 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Context getContext()>
	//    2    4:invokevirtual   #47  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    3    7:aload_1         
	//    4    8:getstatic       #53  <Field int[] com.irobot.home.g$a.IconLabel>
	//    5   11:iconst_0        
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #59  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    8   16:astore_1        
		a = ((TypedArray) (attributeset)).getString(1);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #65  <Method String TypedArray.getString(int)>
	//   13   23:putfield        #20  <Field String a>
		b = ((TypedArray) (attributeset)).getString(0);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #65  <Method String TypedArray.getString(int)>
	//   18   32:putfield        #22  <Field String b>
		c = ((TypedArray) (attributeset)).getBoolean(2, true);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:iconst_2        
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #69  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   24   42:putfield        #24  <Field boolean c>
		((TypedArray) (attributeset)).recycle();
	//   25   45:aload_1         
	//   26   46:invokevirtual   #72  <Method void TypedArray.recycle()>
		return;
	//   27   49:return          
		Exception exception;
		exception;
	//   28   50:astore_2        
		((TypedArray) (attributeset)).recycle();
	//   29   51:aload_1         
	//   30   52:invokevirtual   #72  <Method void TypedArray.recycle()>
		throw exception;
	//   31   55:aload_2         
	//   32   56:athrow          
	}

	void a()
	{
		inflate(getContext(), 0x7f0b00e4, ((android.view.ViewGroup) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method Context getContext()>
	//    2    4:ldc1            #73  <Int 0x7f0b00e4>
	//    3    6:aload_0         
	//    4    7:invokestatic    #77  <Method android.view.View inflate(Context, int, android.view.ViewGroup)>
	//    5   10:pop             
		d = (TextView)findViewById(0x7f0901cf);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:ldc1            #78  <Int 0x7f0901cf>
	//    9   15:invokevirtual   #82  <Method android.view.View findViewById(int)>
	//   10   18:checkcast       #84  <Class TextView>
	//   11   21:putfield        #86  <Field TextView d>
		d.setText(((CharSequence) (a)));
	//   12   24:aload_0         
	//   13   25:getfield        #86  <Field TextView d>
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field String a>
	//   16   32:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
		e = (TextView)findViewById(0x7f0901f3);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:ldc1            #91  <Int 0x7f0901f3>
	//   20   39:invokevirtual   #82  <Method android.view.View findViewById(int)>
	//   21   42:checkcast       #84  <Class TextView>
	//   22   45:putfield        #93  <Field TextView e>
		e.setText(((CharSequence) (b)));
	//   23   48:aload_0         
	//   24   49:getfield        #93  <Field TextView e>
	//   25   52:aload_0         
	//   26   53:getfield        #22  <Field String b>
	//   27   56:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
	//   28   59:return          
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void FrameLayout.onFinishInflate()>
		d.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Aspen.otf"));
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field TextView d>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #41  <Method Context getContext()>
	//    6   12:invokevirtual   #100 <Method android.content.res.AssetManager Context.getAssets()>
	//    7   15:ldc1            #102 <String "Aspen.otf">
	//    8   17:invokestatic    #108 <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
	//    9   20:invokevirtual   #112 <Method void TextView.setTypeface(Typeface)>
		if(!c)
	//*  10   23:aload_0         
	//*  11   24:getfield        #24  <Field boolean c>
	//*  12   27:ifne            39
			e.setVisibility(8);
	//   13   30:aload_0         
	//   14   31:getfield        #93  <Field TextView e>
	//   15   34:bipush          8
	//   16   36:invokevirtual   #116 <Method void TextView.setVisibility(int)>
	//   17   39:return          
	}

	public void setIconText(String s)
	{
		TextView textview = d;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field TextView d>
	//    2    4:astore_2        
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #20  <Field String a>
		textview.setText(((CharSequence) (s)));
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
	//    9   15:return          
	}

	public void setLabelText(String s)
	{
		TextView textview = e;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field TextView e>
	//    2    4:astore_2        
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #22  <Field String b>
		textview.setText(((CharSequence) (s)));
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #90  <Method void TextView.setText(CharSequence)>
	//    9   15:return          
	}

	public void setShowLabel(boolean flag)
	{
		c = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean c>
		TextView textview = e;
	//    3    5:aload_0         
	//    4    6:getfield        #93  <Field TextView e>
	//    5    9:astore_3        
		byte byte0;
		if(c)
	//*   6   10:aload_0         
	//*   7   11:getfield        #24  <Field boolean c>
	//*   8   14:ifeq            22
			byte0 = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		else
	//*  11   19:goto            25
			byte0 = 8;
	//   12   22:bipush          8
	//   13   24:istore_2        
		textview.setVisibility(((int) (byte0)));
	//   14   25:aload_3         
	//   15   26:iload_2         
	//   16   27:invokevirtual   #116 <Method void TextView.setVisibility(int)>
	//   17   30:return          
	}

	private String a;
	private String b;
	private boolean c;
	private TextView d;
	private TextView e;
}
