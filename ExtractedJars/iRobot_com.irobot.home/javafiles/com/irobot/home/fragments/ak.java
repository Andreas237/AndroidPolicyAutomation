// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.RenderPresenter;
import com.irobot.home.c;
import com.irobot.home.d;
import com.irobot.home.l.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.fragments:
//			j, al

public class ak extends com.irobot.home.fragments.j
	implements com.irobot.home.c.a, com.irobot.home.l.a.a
{

	public ak()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void com.irobot.home.fragments.j()>
		l = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field boolean l>
		m = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #41  <Field boolean m>
		n = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #43  <Field boolean n>
		o = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #45  <Field boolean o>
		p = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #47  <Field boolean p>
		q = true;
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:putfield        #49  <Field boolean q>
	//   20   34:return          
	}

	static int a(ak ak1, int i1)
	{
		ak1.j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int j>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	public static ak a(RenderPresenter renderpresenter, boolean flag, boolean flag1, com.irobot.home.c.a a1)
	{
		ak ak1 = al.i().a();
	//    0    0:invokestatic    #59  <Method al$a al.i()>
	//    1    3:invokevirtual   #64  <Method ak com.irobot.home.fragments.al$a.a()>
	//    2    6:astore          4
		ak1.a(renderpresenter);
	//    3    8:aload           4
	//    4   10:aload_0         
	//    5   11:invokevirtual   #67  <Method void a(RenderPresenter)>
		ak1.a(flag);
	//    6   14:aload           4
	//    7   16:iload_1         
	//    8   17:invokevirtual   #70  <Method void a(boolean)>
		ak1.b(flag1);
	//    9   20:aload           4
	//   10   22:iload_2         
	//   11   23:invokevirtual   #72  <Method void b(boolean)>
		ak1.a(a1);
	//   12   26:aload           4
	//   13   28:aload_3         
	//   14   29:invokevirtual   #75  <Method void a(com.irobot.home.c$a)>
		return ak1;
	//   15   32:aload           4
	//   16   34:areturn         
	}

	static int b(ak ak1, int i1)
	{
		ak1.k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field int k>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	public void a(float f1)
	{
		p = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #47  <Field boolean p>
	//    3    5:return          
	}

	public void a(float f1, float f2)
	{
		o = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #45  <Field boolean o>
	//    3    5:return          
	}

	public void a(Bitmap bitmap)
	{
	//    0    0:return          
	}

	protected void a(RenderPresenter renderpresenter)
	{
		d = renderpresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field RenderPresenter d>
	//    3    5:return          
	}

	protected void a(com.irobot.home.c.a a1)
	{
		f = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field com.irobot.home.c$a f>
	//    3    5:return          
	}

	protected void a(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean i>
	//    3    5:return          
	}

	public void a_()
	{
		e = new a(((android.app.Activity) (getActivity())), d, a);
	//    0    0:aload_0         
	//    1    1:new             #89  <Class a>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #93  <Method android.support.v4.app.FragmentActivity getActivity()>
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field RenderPresenter d>
	//    7   13:aload_0         
	//    8   14:getfield        #95  <Field GLSurfaceView a>
	//    9   17:invokespecial   #98  <Method void a(android.app.Activity, RenderPresenter, GLSurfaceView)>
	//   10   20:putfield        #100 <Field a e>
		e.a(((com.irobot.home.l.a.a) (this)));
	//   11   23:aload_0         
	//   12   24:getfield        #100 <Field a e>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #103 <Method void a.a(com.irobot.home.l.a$a)>
		if(a != null && q)
	//*  15   31:aload_0         
	//*  16   32:getfield        #95  <Field GLSurfaceView a>
	//*  17   35:ifnull          62
	//*  18   38:aload_0         
	//*  19   39:getfield        #49  <Field boolean q>
	//*  20   42:ifeq            62
			a.setOnTouchListener(e.a);
	//   21   45:aload_0         
	//   22   46:getfield        #95  <Field GLSurfaceView a>
	//   23   49:aload_0         
	//   24   50:getfield        #100 <Field a e>
	//   25   53:getfield        #106 <Field android.view.View$OnTouchListener a.a>
	//   26   56:invokevirtual   #112 <Method void GLSurfaceView.setOnTouchListener(android.view.View$OnTouchListener)>
		else
	//*  27   59:goto            69
			com.irobot.home.util.o.e("MapGLRenderFragment", "surface view null in onSurfaceReady");
	//   28   62:ldc1            #114 <String "MapGLRenderFragment">
	//   29   64:ldc1            #116 <String "surface view null in onSurfaceReady">
	//   30   66:invokestatic    #121 <Method void o.e(String, String)>
		a.setBackgroundColor(getResources().getColor(0x7f060055));
	//   31   69:aload_0         
	//   32   70:getfield        #95  <Field GLSurfaceView a>
	//   33   73:aload_0         
	//   34   74:invokevirtual   #125 <Method Resources getResources()>
	//   35   77:ldc1            #126 <Int 0x7f060055>
	//   36   79:invokevirtual   #132 <Method int Resources.getColor(int)>
	//   37   82:invokevirtual   #136 <Method void GLSurfaceView.setBackgroundColor(int)>
	//   38   85:return          
	}

	public void b(float f1)
	{
		if(f1 > 1.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_1        
	//*   2    2:fcmpl           
	//*   3    3:ifle            12
		{
			m = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #41  <Field boolean m>
			return;
	//    7   11:return          
		}
		if(f1 < 1.0F)
	//*   8   12:fload_1         
	//*   9   13:fconst_1        
	//*  10   14:fcmpg           
	//*  11   15:ifge            23
			n = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #43  <Field boolean n>
	//   15   23:return          
	}

	protected void b(boolean flag)
	{
		q = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field boolean q>
	//    3    5:return          
	}

	public void b_()
	{
	//    0    0:return          
	}

	public void c()
	{
	//    0    0:return          
	}

	public GLSurfaceView d()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field GLSurfaceView a>
	//    2    4:areturn         
	}

	void e()
	{
		c = new c(((android.content.Context) (getActivity())), d);
	//    0    0:aload_0         
	//    1    1:new             #140 <Class c>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #93  <Method android.support.v4.app.FragmentActivity getActivity()>
	//    5    9:aload_0         
	//    6   10:getfield        #82  <Field RenderPresenter d>
	//    7   13:invokespecial   #143 <Method void c(android.content.Context, RenderPresenter)>
	//    8   16:putfield        #145 <Field c c>
		a.setEGLContextClientVersion(2);
	//    9   19:aload_0         
	//   10   20:getfield        #95  <Field GLSurfaceView a>
	//   11   23:iconst_2        
	//   12   24:invokevirtual   #148 <Method void GLSurfaceView.setEGLContextClientVersion(int)>
		a.setEGLConfigChooser(((android.opengl.GLSurfaceView.EGLConfigChooser) (new d())));
	//   13   27:aload_0         
	//   14   28:getfield        #95  <Field GLSurfaceView a>
	//   15   31:new             #150 <Class d>
	//   16   34:dup             
	//   17   35:invokespecial   #151 <Method void d()>
	//   18   38:invokevirtual   #155 <Method void GLSurfaceView.setEGLConfigChooser(android.opengl.GLSurfaceView$EGLConfigChooser)>
		a.setPreserveEGLContextOnPause(true);
	//   19   41:aload_0         
	//   20   42:getfield        #95  <Field GLSurfaceView a>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #158 <Method void GLSurfaceView.setPreserveEGLContextOnPause(boolean)>
		a.setBackgroundColor(getResources().getColor(0x7f0600b2));
	//   23   49:aload_0         
	//   24   50:getfield        #95  <Field GLSurfaceView a>
	//   25   53:aload_0         
	//   26   54:invokevirtual   #125 <Method Resources getResources()>
	//   27   57:ldc1            #159 <Int 0x7f0600b2>
	//   28   59:invokevirtual   #132 <Method int Resources.getColor(int)>
	//   29   62:invokevirtual   #136 <Method void GLSurfaceView.setBackgroundColor(int)>
		a.setRenderer(((android.opengl.GLSurfaceView.Renderer) (c)));
	//   30   65:aload_0         
	//   31   66:getfield        #95  <Field GLSurfaceView a>
	//   32   69:aload_0         
	//   33   70:getfield        #145 <Field c c>
	//   34   73:invokevirtual   #163 <Method void GLSurfaceView.setRenderer(android.opengl.GLSurfaceView$Renderer)>
		l = true;
	//   35   76:aload_0         
	//   36   77:iconst_1        
	//   37   78:putfield        #39  <Field boolean l>
		if(b != null)
	//*  38   81:aload_0         
	//*  39   82:getfield        #165 <Field FrameLayout b>
	//*  40   85:ifnull          106
			b.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					com.irobot.home.fragments.ak.a(a, a.b.getHeight());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ak a>
				//    2    4:aload_0         
				//    3    5:getfield        #17  <Field ak a>
				//    4    8:getfield        #25  <Field FrameLayout ak.b>
				//    5   11:invokevirtual   #31  <Method int FrameLayout.getHeight()>
				//    6   14:invokestatic    #34  <Method int com.irobot.home.fragments.ak.a(ak, int)>
				//    7   17:pop             
					ak.b(a, a.b.getWidth());
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field ak a>
				//   10   22:aload_0         
				//   11   23:getfield        #17  <Field ak a>
				//   12   26:getfield        #25  <Field FrameLayout ak.b>
				//   13   29:invokevirtual   #37  <Method int FrameLayout.getWidth()>
				//   14   32:invokestatic    #39  <Method int ak.b(ak, int)>
				//   15   35:pop             
					a.b.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//   16   36:aload_0         
				//   17   37:getfield        #17  <Field ak a>
				//   18   40:getfield        #25  <Field FrameLayout ak.b>
				//   19   43:invokevirtual   #43  <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
				//   20   46:aload_0         
				//   21   47:invokevirtual   #49  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				//   22   50:return          
				}

				final ak a;

			
			{
				a = ak.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ak a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   41   88:aload_0         
	//   42   89:getfield        #165 <Field FrameLayout b>
	//   43   92:invokevirtual   #171 <Method ViewTreeObserver FrameLayout.getViewTreeObserver()>
	//   44   95:new             #10  <Class ak$1>
	//   45   98:dup             
	//   46   99:aload_0         
	//   47  100:invokespecial   #174 <Method void ak$1(ak)>
	//   48  103:invokevirtual   #180 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   49  106:return          
	}

	public void f()
	{
		if(a != null && d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field GLSurfaceView a>
	//*   2    4:ifnull          73
	//*   3    7:aload_0         
	//*   4    8:getfield        #82  <Field RenderPresenter d>
	//*   5   11:ifnull          73
		{
			q = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #49  <Field boolean q>
			e = new a(((android.app.Activity) (getActivity())), d, a);
	//    9   19:aload_0         
	//   10   20:new             #89  <Class a>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokevirtual   #93  <Method android.support.v4.app.FragmentActivity getActivity()>
	//   14   28:aload_0         
	//   15   29:getfield        #82  <Field RenderPresenter d>
	//   16   32:aload_0         
	//   17   33:getfield        #95  <Field GLSurfaceView a>
	//   18   36:invokespecial   #98  <Method void a(android.app.Activity, RenderPresenter, GLSurfaceView)>
	//   19   39:putfield        #100 <Field a e>
			e.a(((com.irobot.home.l.a.a) (null)));
	//   20   42:aload_0         
	//   21   43:getfield        #100 <Field a e>
	//   22   46:aconst_null     
	//   23   47:invokevirtual   #103 <Method void a.a(com.irobot.home.l.a$a)>
			e.a(((com.irobot.home.l.a.a) (this)));
	//   24   50:aload_0         
	//   25   51:getfield        #100 <Field a e>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #103 <Method void a.a(com.irobot.home.l.a$a)>
			a.setOnTouchListener(e.a);
	//   28   58:aload_0         
	//   29   59:getfield        #95  <Field GLSurfaceView a>
	//   30   62:aload_0         
	//   31   63:getfield        #100 <Field a e>
	//   32   66:getfield        #106 <Field android.view.View$OnTouchListener a.a>
	//   33   69:invokevirtual   #112 <Method void GLSurfaceView.setOnTouchListener(android.view.View$OnTouchListener)>
			return;
	//   34   72:return          
		} else
		{
			com.irobot.home.util.o.e("MapGLRenderFragment", "surface view null in onSurfaceReady");
	//   35   73:ldc1            #114 <String "MapGLRenderFragment">
	//   36   75:ldc1            #116 <String "surface view null in onSurfaceReady">
	//   37   77:invokestatic    #121 <Method void o.e(String, String)>
			return;
	//   38   80:return          
		}
	}

	public int g()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int j>
	//    2    4:ireturn         
	}

	public int h()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int k>
	//    2    4:ireturn         
	}

	public void onPause()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field com.irobot.home.c$a f>
	//*   2    4:ifnull          18
			c.b(f);
	//    3    7:aload_0         
	//    4    8:getfield        #145 <Field c c>
	//    5   11:aload_0         
	//    6   12:getfield        #84  <Field com.irobot.home.c$a f>
	//    7   15:invokevirtual   #186 <Method void c.b(com.irobot.home.c$a)>
		c.b(((com.irobot.home.c.a) (this)));
	//    8   18:aload_0         
	//    9   19:getfield        #145 <Field c c>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #186 <Method void c.b(com.irobot.home.c$a)>
		a.onPause();
	//   12   26:aload_0         
	//   13   27:getfield        #95  <Field GLSurfaceView a>
	//   14   30:invokevirtual   #188 <Method void GLSurfaceView.onPause()>
		super.onPause();
	//   15   33:aload_0         
	//   16   34:invokespecial   #189 <Method void j.onPause()>
		if(i)
	//*  17   37:aload_0         
	//*  18   38:getfield        #86  <Field boolean i>
	//*  19   41:ifeq            78
		{
			com.irobot.core.AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//   20   44:invokestatic    #194 <Method com.irobot.home.model.a j.j()>
	//   21   47:invokevirtual   #199 <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
	//   22   50:astore_1        
			AnalyticsSubsystem.getInstance().trackCleanMapInteractionFinished(assetinfo, l, m, n, o, p);
	//   23   51:invokestatic    #205 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   24   54:aload_1         
	//   25   55:aload_0         
	//   26   56:getfield        #39  <Field boolean l>
	//   27   59:aload_0         
	//   28   60:getfield        #41  <Field boolean m>
	//   29   63:aload_0         
	//   30   64:getfield        #43  <Field boolean n>
	//   31   67:aload_0         
	//   32   68:getfield        #45  <Field boolean o>
	//   33   71:aload_0         
	//   34   72:getfield        #47  <Field boolean p>
	//   35   75:invokevirtual   #209 <Method void AnalyticsSubsystem.trackCleanMapInteractionFinished(com.irobot.core.AssetInfo, boolean, boolean, boolean, boolean, boolean)>
		}
	//   36   78:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #212 <Method void j.onResume()>
		a.onResume();
	//    2    4:aload_0         
	//    3    5:getfield        #95  <Field GLSurfaceView a>
	//    4    8:invokevirtual   #213 <Method void GLSurfaceView.onResume()>
		c.a(((com.irobot.home.c.a) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #145 <Field c c>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #214 <Method void c.a(com.irobot.home.c$a)>
		if(f != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #84  <Field com.irobot.home.c$a f>
	//*  11   23:ifnull          37
			c.a(f);
	//   12   26:aload_0         
	//   13   27:getfield        #145 <Field c c>
	//   14   30:aload_0         
	//   15   31:getfield        #84  <Field com.irobot.home.c$a f>
	//   16   34:invokevirtual   #214 <Method void c.a(com.irobot.home.c$a)>
	//   17   37:return          
	}

	GLSurfaceView a;
	FrameLayout b;
	private c c;
	private RenderPresenter d;
	private a e;
	private com.irobot.home.c.a f;
	private boolean i;
	private int j;
	private int k;
	private boolean l;
	private boolean m;
	private boolean n;
	private boolean o;
	private boolean p;
	private boolean q;
}
