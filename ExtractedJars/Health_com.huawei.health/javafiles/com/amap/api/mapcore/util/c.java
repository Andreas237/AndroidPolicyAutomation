// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;

// Referenced classes of package com.amap.api.mapcore.util:
//			t, b, s, ek, 
//			el

public class c
	implements t
{

	public c(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void c(Context, AttributeSet)>
	//    4    6:return          
	}

	public c(Context context, AttributeSet attributeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field s b>
		a = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field boolean a>
		b = ((s) (new b(((t) (this)), context, attributeset)));
	//    8   14:aload_0         
	//    9   15:new             #25  <Class b>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokespecial   #28  <Method void b(t, Context, AttributeSet)>
	//   15   25:putfield        #21  <Field s b>
	//   16   28:return          
	}

	public s a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field s b>
	//    2    4:areturn         
	}

	public void a(ek ek)
	{
	//    0    0:return          
	}

	public void a(el el)
	{
	//    0    0:return          
	}

	public void b()
	{
	//    0    0:return          
	}

	public int getHeight()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public SurfaceHolder getHolder()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getRenderMode()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getWidth()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isEnabled()
	{
		return b != null;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field s b>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean post(Runnable runnable)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean postDelayed(Runnable runnable, long l)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void queueEvent(Runnable runnable)
	{
		if(runnable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
			runnable.run();
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method void Runnable.run()>
	//    4   10:return          
	}

	public void requestRender()
	{
	//    0    0:return          
	}

	public void setRenderMode(int i)
	{
	//    0    0:return          
	}

	public void setRenderer(android.opengl.GLSurfaceView.Renderer renderer)
	{
	//    0    0:return          
	}

	public void setVisibility(int i)
	{
	//    0    0:return          
	}

	protected boolean a;
	private s b;
}
