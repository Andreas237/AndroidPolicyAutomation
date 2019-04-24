// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{

	public ContentLoadingProgressBar(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void ContentLoadingProgressBar(Context, AttributeSet)>
	//    4    6:return          
	}

	public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #26  <Method void ProgressBar(Context, AttributeSet, int)>
		a = -1L;
	//    5    7:aload_0         
	//    6    8:ldc2w           #27  <Long -1L>
	//    7   11:putfield        #30  <Field long a>
		b = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #32  <Field boolean b>
		c = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #34  <Field boolean c>
		d = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #36  <Field boolean d>
		e = new Runnable() {

			public void run()
			{
				a.b = false;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ContentLoadingProgressBar a>
			//    2    4:iconst_0        
			//    3    5:putfield        #23  <Field boolean ContentLoadingProgressBar.b>
				a.a = -1L;
			//    4    8:aload_0         
			//    5    9:getfield        #14  <Field ContentLoadingProgressBar a>
			//    6   12:ldc2w           #24  <Long -1L>
			//    7   15:putfield        #28  <Field long ContentLoadingProgressBar.a>
				a.setVisibility(8);
			//    8   18:aload_0         
			//    9   19:getfield        #14  <Field ContentLoadingProgressBar a>
			//   10   22:bipush          8
			//   11   24:invokevirtual   #32  <Method void ContentLoadingProgressBar.setVisibility(int)>
			//   12   27:return          
			}

			final ContentLoadingProgressBar a;

			
			{
				a = ContentLoadingProgressBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ContentLoadingProgressBar a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   17   29:aload_0         
	//   18   30:new             #6   <Class ContentLoadingProgressBar$1>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:invokespecial   #39  <Method void ContentLoadingProgressBar$1(ContentLoadingProgressBar)>
	//   22   38:putfield        #41  <Field Runnable e>
		f = new Runnable() {

			public void run()
			{
				a.c = false;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ContentLoadingProgressBar a>
			//    2    4:iconst_0        
			//    3    5:putfield        #23  <Field boolean ContentLoadingProgressBar.c>
				if(!a.d)
			//*   4    8:aload_0         
			//*   5    9:getfield        #14  <Field ContentLoadingProgressBar a>
			//*   6   12:getfield        #26  <Field boolean ContentLoadingProgressBar.d>
			//*   7   15:ifne            36
				{
					a.a = System.currentTimeMillis();
			//    8   18:aload_0         
			//    9   19:getfield        #14  <Field ContentLoadingProgressBar a>
			//   10   22:invokestatic    #32  <Method long System.currentTimeMillis()>
			//   11   25:putfield        #35  <Field long ContentLoadingProgressBar.a>
					a.setVisibility(0);
			//   12   28:aload_0         
			//   13   29:getfield        #14  <Field ContentLoadingProgressBar a>
			//   14   32:iconst_0        
			//   15   33:invokevirtual   #39  <Method void ContentLoadingProgressBar.setVisibility(int)>
				}
			//   16   36:return          
			}

			final ContentLoadingProgressBar a;

			
			{
				a = ContentLoadingProgressBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ContentLoadingProgressBar a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   23   41:aload_0         
	//   24   42:new             #8   <Class ContentLoadingProgressBar$2>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #42  <Method void ContentLoadingProgressBar$2(ContentLoadingProgressBar)>
	//   28   50:putfield        #44  <Field Runnable f>
	//   29   53:return          
	}

	private void a()
	{
		removeCallbacks(e);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field Runnable e>
	//    3    5:invokevirtual   #49  <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		removeCallbacks(f);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field Runnable f>
	//    8   14:invokevirtual   #49  <Method boolean removeCallbacks(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void ProgressBar.onAttachedToWindow()>
		a();
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void a()>
	//    4    8:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void ProgressBar.onDetachedFromWindow()>
		a();
	//    2    4:aload_0         
	//    3    5:invokespecial   #54  <Method void a()>
	//    4    8:return          
	}

	long a;
	boolean b;
	boolean c;
	boolean d;
	private final Runnable e;
	private final Runnable f;
}
