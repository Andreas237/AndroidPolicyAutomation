// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.*;

public class DiscreteSeekBar extends RelativeLayout
	implements android.widget.SeekBar.OnSeekBarChangeListener
{
	public static interface a
	{

		public abstract void b(int i);
	}


	public DiscreteSeekBar(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void RelativeLayout(Context)>
		c = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #23  <Field int c>
		a(context);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #25  <Method void a(Context)>
	//    9   15:return          
	}

	public DiscreteSeekBar(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #30  <Method void DiscreteSeekBar(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public DiscreteSeekBar(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void RelativeLayout(Context, AttributeSet, int)>
		c = -1;
	//    5    7:aload_0         
	//    6    8:iconst_m1       
	//    7    9:putfield        #23  <Field int c>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, com.irobot.home.g.a.DiscreteSeekBar)));
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:getstatic       #37  <Field int[] com.irobot.home.g$a.DiscreteSeekBar>
	//   11   17:invokevirtual   #43  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   12   20:astore_2        
		c = ((TypedArray) (attributeset)).getInt(2, -1);
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:iconst_2        
	//   16   24:iconst_m1       
	//   17   25:invokevirtual   #49  <Method int TypedArray.getInt(int, int)>
	//   18   28:putfield        #23  <Field int c>
		a = ((TypedArray) (attributeset)).getDrawable(1);
	//   19   31:aload_0         
	//   20   32:aload_2         
	//   21   33:iconst_1        
	//   22   34:invokevirtual   #53  <Method Drawable TypedArray.getDrawable(int)>
	//   23   37:putfield        #55  <Field Drawable a>
		b = ((TypedArray) (attributeset)).getDrawable(0);
	//   24   40:aload_0         
	//   25   41:aload_2         
	//   26   42:iconst_0        
	//   27   43:invokevirtual   #53  <Method Drawable TypedArray.getDrawable(int)>
	//   28   46:putfield        #57  <Field Drawable b>
		((TypedArray) (attributeset)).recycle();
	//   29   49:aload_2         
	//   30   50:invokevirtual   #61  <Method void TypedArray.recycle()>
		a(context);
	//   31   53:aload_0         
	//   32   54:aload_1         
	//   33   55:invokespecial   #25  <Method void a(Context)>
		return;
	//   34   58:return          
		context;
	//   35   59:astore_1        
		((TypedArray) (attributeset)).recycle();
	//   36   60:aload_2         
	//   37   61:invokevirtual   #61  <Method void TypedArray.recycle()>
		throw context;
	//   38   64:aload_1         
	//   39   65:athrow          
	}

	private void a(Context context)
	{
		((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0b015a, ((android.view.ViewGroup) (this)));
	//    0    0:aload_1         
	//    1    1:ldc1            #63  <String "layout_inflater">
	//    2    3:invokevirtual   #67  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #69  <Class LayoutInflater>
	//    4    9:ldc1            #70  <Int 0x7f0b015a>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #74  <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void RelativeLayout.onFinishInflate()>
		setMinDrawable(a);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field Drawable a>
	//    5    9:invokevirtual   #81  <Method void setMinDrawable(Drawable)>
		ImageView imageview = (ImageView)findViewById(0x7f09024b);
	//    6   12:aload_0         
	//    7   13:ldc1            #82  <Int 0x7f09024b>
	//    8   15:invokevirtual   #86  <Method android.view.View findViewById(int)>
	//    9   18:checkcast       #88  <Class ImageView>
	//   10   21:astore_1        
		if(b != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #57  <Field Drawable b>
	//*  13   26:ifnull          40
			imageview.setImageDrawable(b);
	//   14   29:aload_1         
	//   15   30:aload_0         
	//   16   31:getfield        #57  <Field Drawable b>
	//   17   34:invokevirtual   #91  <Method void ImageView.setImageDrawable(Drawable)>
		else
	//*  18   37:goto            46
			imageview.setVisibility(8);
	//   19   40:aload_1         
	//   20   41:bipush          8
	//   21   43:invokevirtual   #95  <Method void ImageView.setVisibility(int)>
		e = (SeekBar)findViewById(0x7f0903bf);
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:ldc1            #96  <Int 0x7f0903bf>
	//   25   50:invokevirtual   #86  <Method android.view.View findViewById(int)>
	//   26   53:checkcast       #98  <Class SeekBar>
	//   27   56:putfield        #100 <Field SeekBar e>
		e.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (this)));
	//   28   59:aload_0         
	//   29   60:getfield        #100 <Field SeekBar e>
	//   30   63:aload_0         
	//   31   64:invokevirtual   #104 <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
		if(c > 0)
	//*  32   67:aload_0         
	//*  33   68:getfield        #23  <Field int c>
	//*  34   71:ifle            82
			setSteps(c);
	//   35   74:aload_0         
	//   36   75:aload_0         
	//   37   76:getfield        #23  <Field int c>
	//   38   79:invokevirtual   #107 <Method void setSteps(int)>
	//   39   82:return          
	}

	public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
	{
	//    0    0:return          
	}

	public void onStartTrackingTouch(SeekBar seekbar)
	{
	//    0    0:return          
	}

	public void onStopTrackingTouch(SeekBar seekbar)
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field DiscreteSeekBar$a d>
	//*   2    4:ifnull          23
			d.b(e.getProgress());
	//    3    7:aload_0         
	//    4    8:getfield        #114 <Field DiscreteSeekBar$a d>
	//    5   11:aload_0         
	//    6   12:getfield        #100 <Field SeekBar e>
	//    7   15:invokevirtual   #118 <Method int SeekBar.getProgress()>
	//    8   18:invokeinterface #120 <Method void DiscreteSeekBar$a.b(int)>
	//    9   23:return          
	}

	public void setMaxDrawable(int i)
	{
		setMaxDrawable(getResources().getDrawable(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #125 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #128 <Method Drawable Resources.getDrawable(int)>
	//    5    9:invokevirtual   #130 <Method void setMaxDrawable(Drawable)>
	//    6   12:return          
	}

	public void setMaxDrawable(Drawable drawable)
	{
		a = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field Drawable a>
		drawable = ((Drawable) ((ImageView)findViewById(0x7f09024b)));
	//    3    5:aload_0         
	//    4    6:ldc1            #82  <Int 0x7f09024b>
	//    5    8:invokevirtual   #86  <Method android.view.View findViewById(int)>
	//    6   11:checkcast       #88  <Class ImageView>
	//    7   14:astore_1        
		int i;
		if(a != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #55  <Field Drawable a>
	//*  10   19:ifnull          38
		{
			((ImageView) (drawable)).setImageDrawable(a);
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #55  <Field Drawable a>
	//   14   27:invokevirtual   #91  <Method void ImageView.setImageDrawable(Drawable)>
			i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_2        
		} else
	//*  17   32:aload_1         
	//*  18   33:iload_2         
	//*  19   34:invokevirtual   #95  <Method void ImageView.setVisibility(int)>
	//*  20   37:return          
		{
			i = 8;
	//   21   38:bipush          8
	//   22   40:istore_2        
		}
		((ImageView) (drawable)).setVisibility(i);
	//*  23   41:goto            32
	}

	public void setMinDrawable(int i)
	{
		setMinDrawable(getResources().getDrawable(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #125 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #128 <Method Drawable Resources.getDrawable(int)>
	//    5    9:invokevirtual   #81  <Method void setMinDrawable(Drawable)>
	//    6   12:return          
	}

	public void setMinDrawable(Drawable drawable)
	{
		a = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field Drawable a>
		drawable = ((Drawable) ((ImageView)findViewById(0x7f090264)));
	//    3    5:aload_0         
	//    4    6:ldc1            #131 <Int 0x7f090264>
	//    5    8:invokevirtual   #86  <Method android.view.View findViewById(int)>
	//    6   11:checkcast       #88  <Class ImageView>
	//    7   14:astore_1        
		int i;
		if(a != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #55  <Field Drawable a>
	//*  10   19:ifnull          38
		{
			((ImageView) (drawable)).setImageDrawable(a);
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #55  <Field Drawable a>
	//   14   27:invokevirtual   #91  <Method void ImageView.setImageDrawable(Drawable)>
			i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_2        
		} else
	//*  17   32:aload_1         
	//*  18   33:iload_2         
	//*  19   34:invokevirtual   #95  <Method void ImageView.setVisibility(int)>
	//*  20   37:return          
		{
			i = 8;
	//   21   38:bipush          8
	//   22   40:istore_2        
		}
		((ImageView) (drawable)).setVisibility(i);
	//*  23   41:goto            32
	}

	public void setOnRangeSeekBarChangeListener(a a1)
	{
		d = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #114 <Field DiscreteSeekBar$a d>
	//    3    5:return          
	}

	public void setProgressTint(int i)
	{
		e.getProgressDrawable().setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field SeekBar e>
	//    2    4:invokevirtual   #138 <Method Drawable SeekBar.getProgressDrawable()>
	//    3    7:iload_1         
	//    4    8:getstatic       #144 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    5   11:invokevirtual   #150 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    6   14:return          
	}

	public void setSelectedIndex(int i)
	{
		e.setProgress(i);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field SeekBar e>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #154 <Method void SeekBar.setProgress(int)>
	//    4    8:return          
	}

	public void setSteps(int i)
	{
		e.setMax(i - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field SeekBar e>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:invokevirtual   #157 <Method void SeekBar.setMax(int)>
		setSelectedIndex(0);
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #159 <Method void setSelectedIndex(int)>
	//    9   15:return          
	}

	public void setThumb(Drawable drawable)
	{
		e.setThumb(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field SeekBar e>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #162 <Method void SeekBar.setThumb(Drawable)>
	//    4    8:return          
	}

	private Drawable a;
	private Drawable b;
	private int c;
	private a d;
	private SeekBar e;
}
