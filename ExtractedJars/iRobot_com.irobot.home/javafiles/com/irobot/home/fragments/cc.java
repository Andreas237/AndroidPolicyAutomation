// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.res.Resources;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.widget.*;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomVideoView;
import java.util.List;

// Referenced classes of package com.irobot.home.fragments:
//			w

public class cc extends w
	implements com.irobot.home.view.CustomVideoView.a
{

	public cc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void w()>
		n = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field boolean n>
	//    5    9:return          
	}

	public void a()
	{
	//    0    0:return          
	}

	public void a(int i1, int j1)
	{
	//    0    0:return          
	}

	void b()
	{
		b.setText(g);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TextView b>
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field int g>
	//    4    8:invokevirtual   #48  <Method void TextView.setText(int)>
		TextView textview = b;
	//    5   11:aload_0         
	//    6   12:getfield        #40  <Field TextView b>
	//    7   15:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #50  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #51  <Method void StringBuilder()>
	//   11   23:astore_2        
		stringbuilder.append(getResources().getString(g));
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #55  <Method Resources getResources()>
	//   15   29:aload_0         
	//   16   30:getfield        #42  <Field int g>
	//   17   33:invokevirtual   #61  <Method String Resources.getString(int)>
	//   18   36:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(".");
	//   20   40:aload_2         
	//   21   41:ldc1            #67  <String ".">
	//   22   43:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		textview.setContentDescription(((CharSequence) (stringbuilder.toString())));
	//   24   47:aload_1         
	//   25   48:aload_2         
	//   26   49:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   27   52:invokevirtual   #75  <Method void TextView.setContentDescription(CharSequence)>
		c.setText(h);
	//   28   55:aload_0         
	//   29   56:getfield        #77  <Field TextView c>
	//   30   59:aload_0         
	//   31   60:getfield        #79  <Field int h>
	//   32   63:invokevirtual   #48  <Method void TextView.setText(int)>
		c.setContentDescription(((CharSequence) (getResources().getString(h))));
	//   33   66:aload_0         
	//   34   67:getfield        #77  <Field TextView c>
	//   35   70:aload_0         
	//   36   71:invokevirtual   #55  <Method Resources getResources()>
	//   37   74:aload_0         
	//   38   75:getfield        #79  <Field int h>
	//   39   78:invokevirtual   #61  <Method String Resources.getString(int)>
	//   40   81:invokevirtual   #75  <Method void TextView.setContentDescription(CharSequence)>
		e.setColorFilter(getResources().getColor(j), android.graphics.PorterDuff.Mode.MULTIPLY);
	//   41   84:aload_0         
	//   42   85:getfield        #81  <Field ImageButton e>
	//   43   88:aload_0         
	//   44   89:invokevirtual   #55  <Method Resources getResources()>
	//   45   92:aload_0         
	//   46   93:getfield        #83  <Field int j>
	//   47   96:invokevirtual   #87  <Method int Resources.getColor(int)>
	//   48   99:getstatic       #93  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   49  102:invokevirtual   #99  <Method void ImageButton.setColorFilter(int, android.graphics.PorterDuff$Mode)>
		e.setVisibility(4);
	//   50  105:aload_0         
	//   51  106:getfield        #81  <Field ImageButton e>
	//   52  109:iconst_4        
	//   53  110:invokevirtual   #102 <Method void ImageButton.setVisibility(int)>
		p = com.irobot.home.util.j.a(0.0F, 1.0F, 0L, 200L, true);
	//   54  113:aload_0         
	//   55  114:fconst_0        
	//   56  115:fconst_1        
	//   57  116:lconst_0        
	//   58  117:ldc2w           #103 <Long 200L>
	//   59  120:iconst_1        
	//   60  121:invokestatic    #109 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//   61  124:putfield        #111 <Field AlphaAnimation p>
		q = com.irobot.home.util.j.a(1.0F, 0.0F, 100L, 200L, true);
	//   62  127:aload_0         
	//   63  128:fconst_1        
	//   64  129:fconst_0        
	//   65  130:ldc2w           #112 <Long 100L>
	//   66  133:ldc2w           #103 <Long 200L>
	//   67  136:iconst_1        
	//   68  137:invokestatic    #109 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//   69  140:putfield        #115 <Field AlphaAnimation q>
		if(l)
	//*  70  143:aload_0         
	//*  71  144:getfield        #117 <Field boolean l>
	//*  72  147:ifeq            155
			setUserVisibleHint(true);
	//   73  150:aload_0         
	//   74  151:iconst_1        
	//   75  152:invokevirtual   #121 <Method void setUserVisibleHint(boolean)>
	//   76  155:return          
	}

	public void c()
	{
		e.setClickable(false);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field ImageButton e>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #124 <Method void ImageButton.setClickable(boolean)>
		e.startAnimation(((android.view.animation.Animation) (q)));
	//    4    8:aload_0         
	//    5    9:getfield        #81  <Field ImageButton e>
	//    6   12:aload_0         
	//    7   13:getfield        #115 <Field AlphaAnimation q>
	//    8   16:invokevirtual   #128 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		o.c();
	//    9   19:aload_0         
	//   10   20:getfield        #130 <Field CustomVideoView o>
	//   11   23:invokevirtual   #134 <Method void CustomVideoView.c()>
	//   12   26:return          
	}

	public void d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!isResumed() || getActivity() == null)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #138 <Method boolean isResumed()>
	//*   4    6:ifeq            97
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #142 <Method Activity getActivity()>
	//*   7   13:ifnonnull       19
			break MISSING_BLOCK_LABEL_97;
	//    8   16:goto            97
		AccessibilityManager accessibilitymanager = (AccessibilityManager)getActivity().getSystemService("accessibility");
	//    9   19:aload_0         
	//   10   20:invokevirtual   #142 <Method Activity getActivity()>
	//   11   23:ldc1            #144 <String "accessibility">
	//   12   25:invokevirtual   #150 <Method Object Activity.getSystemService(String)>
	//   13   28:checkcast       #152 <Class AccessibilityManager>
	//   14   31:astore_1        
		if(accessibilitymanager.isEnabled())
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #155 <Method boolean AccessibilityManager.isEnabled()>
	//*  17   36:ifeq            89
		{
			AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
	//   18   39:invokestatic    #161 <Method AccessibilityEvent AccessibilityEvent.obtain()>
	//   19   42:astore_2        
			accessibilityevent.setEventType(16384);
	//   20   43:aload_2         
	//   21   44:sipush          16384
	//   22   47:invokevirtual   #164 <Method void AccessibilityEvent.setEventType(int)>
			accessibilityevent.getText().add(((Object) (b.getText())));
	//   23   50:aload_2         
	//   24   51:invokevirtual   #168 <Method List AccessibilityEvent.getText()>
	//   25   54:aload_0         
	//   26   55:getfield        #40  <Field TextView b>
	//   27   58:invokevirtual   #171 <Method CharSequence TextView.getText()>
	//   28   61:invokeinterface #177 <Method boolean List.add(Object)>
	//   29   66:pop             
			accessibilityevent.getText().add(((Object) (c.getText())));
	//   30   67:aload_2         
	//   31   68:invokevirtual   #168 <Method List AccessibilityEvent.getText()>
	//   32   71:aload_0         
	//   33   72:getfield        #77  <Field TextView c>
	//   34   75:invokevirtual   #171 <Method CharSequence TextView.getText()>
	//   35   78:invokeinterface #177 <Method boolean List.add(Object)>
	//   36   83:pop             
			accessibilitymanager.sendAccessibilityEvent(accessibilityevent);
	//   37   84:aload_1         
	//   38   85:aload_2         
	//   39   86:invokevirtual   #181 <Method void AccessibilityManager.sendAccessibilityEvent(AccessibilityEvent)>
		}
		n = false;
	//   40   89:aload_0         
	//   41   90:iconst_0        
	//   42   91:putfield        #36  <Field boolean n>
		this;
	//   43   94:aload_0         
		JVM INSTR monitorexit ;
	//   44   95:monitorexit     
		return;
	//   45   96:return          
		n = true;
	//   46   97:aload_0         
	//   47   98:iconst_1        
	//   48   99:putfield        #36  <Field boolean n>
		this;
	//   49  102:aload_0         
		JVM INSTR monitorexit ;
	//   50  103:monitorexit     
		return;
	//   51  104:return          
		Exception exception;
		exception;
	//   52  105:astore_1        
	//*  53  106:aload_0         
		throw exception;
	//   54  107:monitorexit     
	//   55  108:aload_1         
	//   56  109:athrow          
	}

	public void e_()
	{
	//    0    0:return          
	}

	public void f_()
	{
		e.startAnimation(((android.view.animation.Animation) (p)));
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field ImageButton e>
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field AlphaAnimation p>
	//    4    8:invokevirtual   #128 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		e.setClickable(true);
	//    5   11:aload_0         
	//    6   12:getfield        #81  <Field ImageButton e>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #124 <Method void ImageButton.setClickable(boolean)>
	//    9   19:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #186 <Method void w.onResume()>
		if(!k)
	//*   2    4:aload_0         
	//*   3    5:getfield        #188 <Field boolean k>
	//*   4    8:ifne            18
			e.clearAnimation();
	//    5   11:aload_0         
	//    6   12:getfield        #81  <Field ImageButton e>
	//    7   15:invokevirtual   #191 <Method void ImageButton.clearAnimation()>
		if(n)
	//*   8   18:aload_0         
	//*   9   19:getfield        #36  <Field boolean n>
	//*  10   22:ifeq            29
			d();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #193 <Method void d()>
	//   13   29:return          
	}

	public void setUserVisibleHint(boolean flag)
	{
		super.setUserVisibleHint(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #194 <Method void w.setUserVisibleHint(boolean)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #196 <Field FrameLayout a>
	//*   5    9:ifnull          151
		{
			if(k)
	//*   6   12:aload_0         
	//*   7   13:getfield        #188 <Field boolean k>
	//*   8   16:ifeq            51
			{
				ImageView imageview = new ImageView(getActivity().getApplicationContext());
	//    9   19:new             #198 <Class ImageView>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokevirtual   #142 <Method Activity getActivity()>
	//   13   27:invokevirtual   #202 <Method android.content.Context Activity.getApplicationContext()>
	//   14   30:invokespecial   #205 <Method void ImageView(android.content.Context)>
	//   15   33:astore_2        
				imageview.setImageResource(f);
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:getfield        #207 <Field int f>
	//   19   39:invokevirtual   #210 <Method void ImageView.setImageResource(int)>
				a.addView(((android.view.View) (imageview)));
	//   20   42:aload_0         
	//   21   43:getfield        #196 <Field FrameLayout a>
	//   22   46:aload_2         
	//   23   47:invokevirtual   #216 <Method void FrameLayout.addView(android.view.View)>
				return;
	//   24   50:return          
			}
			if(flag)
	//*  25   51:iload_1         
	//*  26   52:ifeq            131
			{
				o = new CustomVideoView(((android.content.Context) (getActivity())));
	//   27   55:aload_0         
	//   28   56:new             #132 <Class CustomVideoView>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:invokevirtual   #142 <Method Activity getActivity()>
	//   32   64:invokespecial   #217 <Method void CustomVideoView(android.content.Context)>
	//   33   67:putfield        #130 <Field CustomVideoView o>
				o.setSource(com.irobot.home.util.j.a(((android.content.Context) (getActivity())), f));
	//   34   70:aload_0         
	//   35   71:getfield        #130 <Field CustomVideoView o>
	//   36   74:aload_0         
	//   37   75:invokevirtual   #142 <Method Activity getActivity()>
	//   38   78:aload_0         
	//   39   79:getfield        #207 <Field int f>
	//   40   82:invokestatic    #220 <Method android.net.Uri j.a(android.content.Context, int)>
	//   41   85:invokevirtual   #224 <Method void CustomVideoView.setSource(android.net.Uri)>
				o.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//   42   88:aload_0         
	//   43   89:getfield        #130 <Field CustomVideoView o>
	//   44   92:new             #226 <Class android.view.ViewGroup$LayoutParams>
	//   45   95:dup             
	//   46   96:iconst_m1       
	//   47   97:iconst_m1       
	//   48   98:invokespecial   #228 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   49  101:invokevirtual   #232 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				a.addView(((android.view.View) (o)));
	//   50  104:aload_0         
	//   51  105:getfield        #196 <Field FrameLayout a>
	//   52  108:aload_0         
	//   53  109:getfield        #130 <Field CustomVideoView o>
	//   54  112:invokevirtual   #216 <Method void FrameLayout.addView(android.view.View)>
				o.setVideoStatusListener(((com.irobot.home.view.CustomVideoView.a) (this)));
	//   55  115:aload_0         
	//   56  116:getfield        #130 <Field CustomVideoView o>
	//   57  119:aload_0         
	//   58  120:invokevirtual   #236 <Method void CustomVideoView.setVideoStatusListener(com.irobot.home.view.CustomVideoView$a)>
				o.a();
	//   59  123:aload_0         
	//   60  124:getfield        #130 <Field CustomVideoView o>
	//   61  127:invokevirtual   #238 <Method void CustomVideoView.a()>
				return;
	//   62  130:return          
			} else
			{
				e.clearAnimation();
	//   63  131:aload_0         
	//   64  132:getfield        #81  <Field ImageButton e>
	//   65  135:invokevirtual   #191 <Method void ImageButton.clearAnimation()>
				a.removeAllViews();
	//   66  138:aload_0         
	//   67  139:getfield        #196 <Field FrameLayout a>
	//   68  142:invokevirtual   #241 <Method void FrameLayout.removeAllViews()>
				o = null;
	//   69  145:aload_0         
	//   70  146:aconst_null     
	//   71  147:putfield        #130 <Field CustomVideoView o>
				return;
	//   72  150:return          
			}
		}
		if(flag)
	//*  73  151:iload_1         
	//*  74  152:ifeq            160
			l = true;
	//   75  155:aload_0         
	//   76  156:iconst_1        
	//   77  157:putfield        #117 <Field boolean l>
	//   78  160:return          
	}

	FrameLayout a;
	TextView b;
	TextView c;
	LinearLayout d;
	ImageButton e;
	int f;
	int g;
	int h;
	int i;
	int j;
	boolean k;
	private boolean l;
	private boolean n;
	private CustomVideoView o;
	private AlphaAnimation p;
	private AlphaAnimation q;
}
