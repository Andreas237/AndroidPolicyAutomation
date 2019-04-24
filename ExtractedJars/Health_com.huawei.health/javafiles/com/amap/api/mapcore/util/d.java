// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.autonavi.ae.gmap.GLMapRender;

// Referenced classes of package com.amap.api.mapcore.util:
//			t, em, b, s, 
//			ek, el

public class d extends GLSurfaceView
	implements t
{

	public d(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void d(Context, AttributeSet)>
	//    4    6:return          
	}

	public d(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void GLSurfaceView(Context, AttributeSet)>
		b = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #23  <Field s b>
		c = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #25  <Field GLMapRender c>
		a = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #27  <Field boolean a>
		em.a(((t) (this)), 5, 6, 5, 0, 16, 8);
	//   13   21:aload_0         
	//   14   22:iconst_5        
	//   15   23:bipush          6
	//   16   25:iconst_5        
	//   17   26:iconst_0        
	//   18   27:bipush          16
	//   19   29:bipush          8
	//   20   31:invokestatic    #32  <Method void em.a(t, int, int, int, int, int, int)>
		b = ((s) (new b(((t) (this)), context, attributeset)));
	//   21   34:aload_0         
	//   22   35:new             #34  <Class b>
	//   23   38:dup             
	//   24   39:aload_0         
	//   25   40:aload_1         
	//   26   41:aload_2         
	//   27   42:invokespecial   #37  <Method void b(t, Context, AttributeSet)>
	//   28   45:putfield        #23  <Field s b>
	//   29   48:return          
	}

	static GLMapRender a(d d1)
	{
		return d1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field GLMapRender c>
	//    2    4:areturn         
	}

	public s a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field s b>
	//    2    4:areturn         
	}

	public void a(ek ek)
	{
		super.setEGLConfigChooser(((android.opengl.GLSurfaceView.EGLConfigChooser) (ek)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method void GLSurfaceView.setEGLConfigChooser(android.opengl.GLSurfaceView$EGLConfigChooser)>
	//    3    5:return          
	}

	public void a(el el)
	{
		super.setEGLContextFactory(((android.opengl.GLSurfaceView.EGLContextFactory) (el)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void GLSurfaceView.setEGLContextFactory(android.opengl.GLSurfaceView$EGLContextFactory)>
	//    3    5:return          
	}

	public void b()
	{
		onPause();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method void onPause()>
		try
		{
			if(c != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #25  <Field GLMapRender c>
	//*   4    8:ifnull          18
				c.onDetachedFromWindow();
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field GLMapRender c>
	//    7   15:invokevirtual   #60  <Method void GLMapRender.onDetachedFromWindow()>
		}
	//*   8   18:goto            26
		catch(Throwable throwable)
	//*   9   21:astore_1        
		{
			throwable.printStackTrace();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #63  <Method void Throwable.printStackTrace()>
		}
		super.onDetachedFromWindow();
	//   12   26:aload_0         
	//   13   27:invokespecial   #64  <Method void GLSurfaceView.onDetachedFromWindow()>
	//   14   30:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void GLSurfaceView.onAttachedToWindow()>
		try
		{
			if(c != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #25  <Field GLMapRender c>
	//*   4    8:ifnull          18
				c.onAttachedToWindow();
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field GLMapRender c>
	//    7   15:invokevirtual   #68  <Method void GLMapRender.onAttachedToWindow()>
		}
	//*   8   18:goto            26
		catch(Throwable throwable)
	//*   9   21:astore_1        
		{
			throwable.printStackTrace();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #63  <Method void Throwable.printStackTrace()>
		}
		onResume();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #71  <Method void onResume()>
	//   14   30:return          
	}

	protected void onDetachedFromWindow()
	{
	//    0    0:return          
	}

	public void onPause()
	{
		if(c.mSurfacedestoryed) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field GLMapRender c>
	//    2    4:getfield        #76  <Field boolean GLMapRender.mSurfacedestoryed>
	//    3    7:ifne            61
_L1:
		int i;
		queueEvent(new Runnable() {

			public void run()
			{
				if(d.a(a) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field d a>
			//*   2    4:invokestatic    #26  <Method GLMapRender d.a(d)>
			//*   3    7:ifnull          26
					try
					{
						d.a(a).onSurfaceDestory();
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field d a>
			//    6   14:invokestatic    #26  <Method GLMapRender d.a(d)>
			//    7   17:invokevirtual   #31  <Method void GLMapRender.onSurfaceDestory()>
						return;
			//    8   20:return          
					}
					catch(Throwable throwable)
			//*   9   21:astore_1        
					{
						throwable.printStackTrace();
			//   10   22:aload_1         
			//   11   23:invokevirtual   #34  <Method void Throwable.printStackTrace()>
					}
			//   12   26:return          
			}

			final d a;

			
			{
				a = d.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field d a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    4   10:aload_0         
	//    5   11:new             #8   <Class d$1>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #79  <Method void d$1(d)>
	//    9   19:invokevirtual   #83  <Method void queueEvent(Runnable)>
		i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_1        
_L3:
		int j;
		if(c.mSurfacedestoryed)
			break; /* Loop/switch isn't completed */
	//   12   24:aload_0         
	//   13   25:getfield        #25  <Field GLMapRender c>
	//   14   28:getfield        #76  <Field boolean GLMapRender.mSurfacedestoryed>
	//   15   31:ifne            61
		j = i + 1;
	//   16   34:iload_1         
	//   17   35:iconst_1        
	//   18   36:iadd            
	//   19   37:istore_2        
		if(i >= 20)
			break; /* Loop/switch isn't completed */
	//   20   38:iload_1         
	//   21   39:bipush          20
	//   22   41:icmpge          61
		Thread.sleep(50L);
	//   23   44:ldc2w           #84  <Long 50L>
	//   24   47:invokestatic    #91  <Method void Thread.sleep(long)>
		i = j;
	//   25   50:iload_2         
	//   26   51:istore_1        
		continue; /* Loop/switch isn't completed */
	//   27   52:goto            24
		InterruptedException interruptedexception;
		interruptedexception;
	//   28   55:astore_3        
		i = j;
	//   29   56:iload_2         
	//   30   57:istore_1        
		if(true) goto _L3; else goto _L2
	//   31   58:goto            24
_L2:
		super.onPause();
	//   32   61:aload_0         
	//   33   62:invokespecial   #92  <Method void GLSurfaceView.onPause()>
		return;
	//   34   65:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void GLSurfaceView.onResume()>
	//    2    4:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #97  <Method boolean GLSurfaceView.onTouchEvent(MotionEvent)>
	//    3    5:pop             
		boolean flag;
		try
		{
			flag = b.onTouchEvent(motionevent);
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field s b>
	//    6   10:aload_1         
	//    7   11:invokeinterface #100 <Method boolean s.onTouchEvent(MotionEvent)>
	//    8   16:istore_2        
		}
	//*   9   17:iload_2         
	//*  10   18:ireturn         
		// Misplaced declaration of an exception variable
		catch(MotionEvent motionevent)
	//*  11   19:astore_1        
		{
			((Throwable) (motionevent)).printStackTrace();
	//   12   20:aload_1         
	//   13   21:invokevirtual   #63  <Method void Throwable.printStackTrace()>
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		}
		return flag;
	}

	protected void onWindowVisibilityChanged(int i)
	{
		super.onWindowVisibilityChanged(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #104 <Method void GLSurfaceView.onWindowVisibilityChanged(int)>
		if(i == 8 || i == 4)
	//*   3    5:iload_1         
	//*   4    6:bipush          8
	//*   5    8:icmpeq          16
	//*   6   11:iload_1         
	//*   7   12:iconst_4        
	//*   8   13:icmpne          38
		{
			try
			{
				if(c != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #25  <Field GLMapRender c>
	//*  11   20:ifnull          56
				{
					c.renderPause();
	//   12   23:aload_0         
	//   13   24:getfield        #25  <Field GLMapRender c>
	//   14   27:invokevirtual   #107 <Method void GLMapRender.renderPause()>
					a = false;
	//   15   30:aload_0         
	//   16   31:iconst_0        
	//   17   32:putfield        #27  <Field boolean a>
				}
			}
	//*  18   35:goto            56
	//*  19   38:iload_1         
	//*  20   39:ifne            56
	//*  21   42:aload_0         
	//*  22   43:getfield        #25  <Field GLMapRender c>
	//*  23   46:ifnull          56
	//*  24   49:aload_0         
	//*  25   50:getfield        #25  <Field GLMapRender c>
	//*  26   53:invokevirtual   #110 <Method void GLMapRender.renderResume()>
	//*  27   56:return          
			catch(Throwable throwable)
	//*  28   57:astore_2        
			{
				throwable.printStackTrace();
	//   29   58:aload_2         
	//   30   59:invokevirtual   #63  <Method void Throwable.printStackTrace()>
				return;
	//   31   62:return          
			}
			break MISSING_BLOCK_LABEL_56;
		}
		if(i != 0)
			break MISSING_BLOCK_LABEL_56;
		if(c != null)
			c.renderResume();
	}

	public void setRenderer(android.opengl.GLSurfaceView.Renderer renderer)
	{
		c = (GLMapRender)renderer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #57  <Class GLMapRender>
	//    3    5:putfield        #25  <Field GLMapRender c>
		super.setRenderer(renderer);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #114 <Method void GLSurfaceView.setRenderer(android.opengl.GLSurfaceView$Renderer)>
	//    7   13:return          
	}

	protected boolean a;
	private s b;
	private GLMapRender c;
}
