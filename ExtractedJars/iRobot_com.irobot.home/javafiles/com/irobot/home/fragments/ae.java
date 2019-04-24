// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.*;
import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.widget.*;
import com.irobot.home.WebViewActivity_;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomVideoView;
import java.util.ArrayList;
import java.util.HashMap;

public class ae extends Fragment
	implements com.irobot.home.view.CustomVideoView.a
{

	public ae()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Fragment()>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #47  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #53  <Method String Class.getSimpleName()>
	//    6   12:invokestatic    #58  <Method String j.r(String)>
	//    7   15:putfield        #60  <Field String a>
		l = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #62  <Field boolean l>
		m = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #64  <Field String m>
		n = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #66  <Field ArrayList n>
		o = 0x7f060078;
	//   17   33:aload_0         
	//   18   34:ldc1            #67  <Int 0x7f060078>
	//   19   36:putfield        #69  <Field int o>
		q = null;
	//   20   39:aload_0         
	//   21   40:aconst_null     
	//   22   41:putfield        #71  <Field String q>
		r = null;
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:putfield        #73  <Field String r>
	//   26   49:return          
	}

	private void b()
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field AlertDialog c>
	//*   2    4:ifnonnull       37
		{
			c = (new android.app.AlertDialog.Builder(((android.content.Context) (getActivity())))).setMessage(0x7f0f04db).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    3    7:aload_0         
	//    4    8:new             #78  <Class android.app.AlertDialog$Builder>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #82  <Method Activity getActivity()>
	//    8   16:invokespecial   #85  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    9   19:ldc1            #86  <Int 0x7f0f04db>
	//   10   21:invokevirtual   #90  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   11   24:ldc1            #91  <Int 0x7f0f05bb>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #95  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   14   30:invokevirtual   #99  <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//   15   33:putfield        #76  <Field AlertDialog c>
			return;
	//   16   36:return          
		} else
		{
			c.show();
	//   17   37:aload_0         
	//   18   38:getfield        #76  <Field AlertDialog c>
	//   19   41:invokevirtual   #103 <Method void AlertDialog.show()>
			return;
	//   20   44:return          
		}
	}

	protected void a()
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field ArrayList n>
	//*   2    4:ifnonnull       16
		{
			f.setVisibility(4);
	//    3    7:aload_0         
	//    4    8:getfield        #105 <Field TextView f>
	//    5   11:iconst_4        
	//    6   12:invokevirtual   #111 <Method void TextView.setVisibility(int)>
			return;
	//    7   15:return          
		} else
		{
			HashMap hashmap = new HashMap();
	//    8   16:new             #113 <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #114 <Method void HashMap()>
	//   11   23:astore_1        
			com.irobot.home.util.j.a(n, f, ((java.util.Map) (hashmap)));
	//   12   24:aload_0         
	//   13   25:getfield        #66  <Field ArrayList n>
	//   14   28:aload_0         
	//   15   29:getfield        #105 <Field TextView f>
	//   16   32:aload_1         
	//   17   33:invokestatic    #117 <Method void j.a(ArrayList, TextView, java.util.Map)>
			return;
	//   18   36:return          
		}
	}

	public void a(int i1, int j1)
	{
	//    0    0:return          
	}

	public void a(String s1)
	{
		r = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field String r>
		f();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #121 <Method void f()>
	//    5    9:return          
	}

	public void b(String s1)
	{
		r = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field String r>
	//    3    5:return          
	}

	void c()
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method void f()>
		e.setVisibility(8);
	//    2    4:aload_0         
	//    3    5:getfield        #123 <Field TextView e>
	//    4    8:bipush          8
	//    5   10:invokevirtual   #111 <Method void TextView.setVisibility(int)>
		if(m != null && !m.isEmpty())
	//*   6   13:aload_0         
	//*   7   14:getfield        #64  <Field String m>
	//*   8   17:ifnull          49
	//*   9   20:aload_0         
	//*  10   21:getfield        #64  <Field String m>
	//*  11   24:invokevirtual   #129 <Method boolean String.isEmpty()>
	//*  12   27:ifne            49
		{
			e.setVisibility(0);
	//   13   30:aload_0         
	//   14   31:getfield        #123 <Field TextView e>
	//   15   34:iconst_0        
	//   16   35:invokevirtual   #111 <Method void TextView.setVisibility(int)>
			e.setText(((CharSequence) (m)));
	//   17   38:aload_0         
	//   18   39:getfield        #123 <Field TextView e>
	//   19   42:aload_0         
	//   20   43:getfield        #64  <Field String m>
	//   21   46:invokevirtual   #133 <Method void TextView.setText(CharSequence)>
		}
		a();
	//   22   49:aload_0         
	//   23   50:invokevirtual   #135 <Method void a()>
		if(com.irobot.home.util.j.i(q))
	//*  24   53:aload_0         
	//*  25   54:getfield        #71  <Field String q>
	//*  26   57:invokestatic    #138 <Method boolean j.i(String)>
	//*  27   60:ifeq            85
		{
			h.setVisibility(0);
	//   28   63:aload_0         
	//   29   64:getfield        #140 <Field TextView h>
	//   30   67:iconst_0        
	//   31   68:invokevirtual   #111 <Method void TextView.setVisibility(int)>
			h.setText(((CharSequence) (q)));
	//   32   71:aload_0         
	//   33   72:getfield        #140 <Field TextView h>
	//   34   75:aload_0         
	//   35   76:getfield        #71  <Field String q>
	//   36   79:invokevirtual   #133 <Method void TextView.setText(CharSequence)>
		} else
	//*  37   82:goto            93
		{
			h.setVisibility(4);
	//   38   85:aload_0         
	//   39   86:getfield        #140 <Field TextView h>
	//   40   89:iconst_4        
	//   41   90:invokevirtual   #111 <Method void TextView.setVisibility(int)>
		}
		if(k)
	//*  42   93:aload_0         
	//*  43   94:getfield        #142 <Field boolean k>
	//*  44   97:ifeq            134
		{
			ImageView imageview = new ImageView(getActivity().getApplicationContext());
	//   45  100:new             #144 <Class ImageView>
	//   46  103:dup             
	//   47  104:aload_0         
	//   48  105:invokevirtual   #82  <Method Activity getActivity()>
	//   49  108:invokevirtual   #150 <Method android.content.Context Activity.getApplicationContext()>
	//   50  111:invokespecial   #151 <Method void ImageView(android.content.Context)>
	//   51  114:astore_1        
			imageview.setImageResource(j);
	//   52  115:aload_1         
	//   53  116:aload_0         
	//   54  117:getfield        #153 <Field int j>
	//   55  120:invokevirtual   #156 <Method void ImageView.setImageResource(int)>
			d.addView(((android.view.View) (imageview)));
	//   56  123:aload_0         
	//   57  124:getfield        #158 <Field FrameLayout d>
	//   58  127:aload_1         
	//   59  128:invokevirtual   #164 <Method void FrameLayout.addView(android.view.View)>
		} else
	//*  60  131:goto            236
		{
			b = new CustomVideoView(((android.content.Context) (getActivity())));
	//   61  134:aload_0         
	//   62  135:new             #166 <Class CustomVideoView>
	//   63  138:dup             
	//   64  139:aload_0         
	//   65  140:invokevirtual   #82  <Method Activity getActivity()>
	//   66  143:invokespecial   #167 <Method void CustomVideoView(android.content.Context)>
	//   67  146:putfield        #169 <Field CustomVideoView b>
			android.net.Uri uri = com.irobot.home.util.j.a(((android.content.Context) (getActivity())), j);
	//   68  149:aload_0         
	//   69  150:invokevirtual   #82  <Method Activity getActivity()>
	//   70  153:aload_0         
	//   71  154:getfield        #153 <Field int j>
	//   72  157:invokestatic    #172 <Method android.net.Uri j.a(android.content.Context, int)>
	//   73  160:astore_1        
			b.setSource(uri);
	//   74  161:aload_0         
	//   75  162:getfield        #169 <Field CustomVideoView b>
	//   76  165:aload_1         
	//   77  166:invokevirtual   #176 <Method void CustomVideoView.setSource(android.net.Uri)>
			b.setLooping(l);
	//   78  169:aload_0         
	//   79  170:getfield        #169 <Field CustomVideoView b>
	//   80  173:aload_0         
	//   81  174:getfield        #62  <Field boolean l>
	//   82  177:invokevirtual   #180 <Method void CustomVideoView.setLooping(boolean)>
			b.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, com.irobot.home.util.j.a(getActivity(), uri)));
	//   83  180:aload_0         
	//   84  181:getfield        #169 <Field CustomVideoView b>
	//   85  184:new             #182 <Class android.view.ViewGroup$LayoutParams>
	//   86  187:dup             
	//   87  188:iconst_m1       
	//   88  189:aload_0         
	//   89  190:invokevirtual   #82  <Method Activity getActivity()>
	//   90  193:aload_1         
	//   91  194:invokestatic    #185 <Method int j.a(Activity, android.net.Uri)>
	//   92  197:invokespecial   #187 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   93  200:invokevirtual   #191 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			d.addView(((android.view.View) (b)));
	//   94  203:aload_0         
	//   95  204:getfield        #158 <Field FrameLayout d>
	//   96  207:aload_0         
	//   97  208:getfield        #169 <Field CustomVideoView b>
	//   98  211:invokevirtual   #164 <Method void FrameLayout.addView(android.view.View)>
			i.bringToFront();
	//   99  214:aload_0         
	//  100  215:getfield        #193 <Field ImageButton i>
	//  101  218:invokevirtual   #198 <Method void ImageButton.bringToFront()>
			b.setVideoStatusListener(((com.irobot.home.view.CustomVideoView.a) (this)));
	//  102  221:aload_0         
	//  103  222:getfield        #169 <Field CustomVideoView b>
	//  104  225:aload_0         
	//  105  226:invokevirtual   #202 <Method void CustomVideoView.setVideoStatusListener(com.irobot.home.view.CustomVideoView$a)>
			b.a();
	//  106  229:aload_0         
	//  107  230:getfield        #169 <Field CustomVideoView b>
	//  108  233:invokevirtual   #203 <Method void CustomVideoView.a()>
		}
		i.setColorFilter(getResources().getColor(o), android.graphics.PorterDuff.Mode.MULTIPLY);
	//  109  236:aload_0         
	//  110  237:getfield        #193 <Field ImageButton i>
	//  111  240:aload_0         
	//  112  241:invokevirtual   #207 <Method Resources getResources()>
	//  113  244:aload_0         
	//  114  245:getfield        #69  <Field int o>
	//  115  248:invokevirtual   #213 <Method int Resources.getColor(int)>
	//  116  251:getstatic       #219 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//  117  254:invokevirtual   #223 <Method void ImageButton.setColorFilter(int, android.graphics.PorterDuff$Mode)>
		i.setVisibility(4);
	//  118  257:aload_0         
	//  119  258:getfield        #193 <Field ImageButton i>
	//  120  261:iconst_4        
	//  121  262:invokevirtual   #224 <Method void ImageButton.setVisibility(int)>
		s = com.irobot.home.util.j.a(0.0F, 1.0F, 0L, 200L, true);
	//  122  265:aload_0         
	//  123  266:fconst_0        
	//  124  267:fconst_1        
	//  125  268:lconst_0        
	//  126  269:ldc2w           #225 <Long 200L>
	//  127  272:iconst_1        
	//  128  273:invokestatic    #229 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//  129  276:putfield        #231 <Field AlphaAnimation s>
		t = com.irobot.home.util.j.a(1.0F, 0.0F, 100L, 200L, true);
	//  130  279:aload_0         
	//  131  280:fconst_1        
	//  132  281:fconst_0        
	//  133  282:ldc2w           #232 <Long 100L>
	//  134  285:ldc2w           #225 <Long 200L>
	//  135  288:iconst_1        
	//  136  289:invokestatic    #229 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//  137  292:putfield        #235 <Field AlphaAnimation t>
	//  138  295:return          
	}

	public void d()
	{
		i.setClickable(false);
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field ImageButton i>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #238 <Method void ImageButton.setClickable(boolean)>
		i.startAnimation(((android.view.animation.Animation) (t)));
	//    4    8:aload_0         
	//    5    9:getfield        #193 <Field ImageButton i>
	//    6   12:aload_0         
	//    7   13:getfield        #235 <Field AlphaAnimation t>
	//    8   16:invokevirtual   #242 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		b.c();
	//    9   19:aload_0         
	//   10   20:getfield        #169 <Field CustomVideoView b>
	//   11   23:invokevirtual   #244 <Method void CustomVideoView.c()>
	//   12   26:return          
	}

	public void e()
	{
		if(p && !com.irobot.home.util.j.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #246 <Field boolean p>
	//*   2    4:ifeq            18
	//*   3    7:invokestatic    #248 <Method boolean j.a()>
	//*   4   10:ifne            18
		{
			b();
	//    5   13:aload_0         
	//    6   14:invokespecial   #250 <Method void b()>
			return;
	//    7   17:return          
		}
		if(r != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #73  <Field String r>
	//*  10   22:ifnull          43
			WebViewActivity_.a(((android.content.Context) (getActivity()))).a(r).a();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #82  <Method Activity getActivity()>
	//   13   29:invokestatic    #255 <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
	//   14   32:aload_0         
	//   15   33:getfield        #73  <Field String r>
	//   16   36:invokevirtual   #260 <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//   17   39:invokevirtual   #263 <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   18   42:pop             
	//   19   43:return          
	}

	public void e_()
	{
	//    0    0:return          
	}

	protected void f()
	{
		if(isAdded() && !isRemoving() && g != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #267 <Method boolean isAdded()>
	//*   2    4:ifeq            53
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #270 <Method boolean isRemoving()>
	//*   5   11:ifne            53
	//*   6   14:aload_0         
	//*   7   15:getfield        #272 <Field TextView g>
	//*   8   18:ifnull          53
		{
			TextView textview = g;
	//    9   21:aload_0         
	//   10   22:getfield        #272 <Field TextView g>
	//   11   25:astore_2        
			byte byte0;
			if(r != null && p)
	//*  12   26:aload_0         
	//*  13   27:getfield        #73  <Field String r>
	//*  14   30:ifnull          45
	//*  15   33:aload_0         
	//*  16   34:getfield        #246 <Field boolean p>
	//*  17   37:ifeq            45
				byte0 = 0;
	//   18   40:iconst_0        
	//   19   41:istore_1        
			else
	//*  20   42:goto            48
				byte0 = 8;
	//   21   45:bipush          8
	//   22   47:istore_1        
			textview.setVisibility(((int) (byte0)));
	//   23   48:aload_2         
	//   24   49:iload_1         
	//   25   50:invokevirtual   #111 <Method void TextView.setVisibility(int)>
		}
	//   26   53:return          
	}

	public void f_()
	{
		i.bringToFront();
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field ImageButton i>
	//    2    4:invokevirtual   #198 <Method void ImageButton.bringToFront()>
		i.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #193 <Field ImageButton i>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #224 <Method void ImageButton.setVisibility(int)>
		i.startAnimation(((android.view.animation.Animation) (s)));
	//    7   15:aload_0         
	//    8   16:getfield        #193 <Field ImageButton i>
	//    9   19:aload_0         
	//   10   20:getfield        #231 <Field AlphaAnimation s>
	//   11   23:invokevirtual   #242 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		i.setClickable(true);
	//   12   26:aload_0         
	//   13   27:getfield        #193 <Field ImageButton i>
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #238 <Method void ImageButton.setClickable(boolean)>
	//   16   34:return          
	}

	public void onResume()
	{
		if(c != null && c.isShowing() && com.irobot.home.util.j.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field AlertDialog c>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field AlertDialog c>
	//*   5   11:invokevirtual   #277 <Method boolean AlertDialog.isShowing()>
	//*   6   14:ifeq            30
	//*   7   17:invokestatic    #248 <Method boolean j.a()>
	//*   8   20:ifeq            30
			c.dismiss();
	//    9   23:aload_0         
	//   10   24:getfield        #76  <Field AlertDialog c>
	//   11   27:invokevirtual   #280 <Method void AlertDialog.dismiss()>
		super.onResume();
	//   12   30:aload_0         
	//   13   31:invokespecial   #282 <Method void Fragment.onResume()>
	//   14   34:return          
	}

	private final String a = com.irobot.home.util.j.r(((Object)this).getClass().getSimpleName());
	private CustomVideoView b;
	private AlertDialog c;
	FrameLayout d;
	TextView e;
	TextView f;
	TextView g;
	TextView h;
	ImageButton i;
	int j;
	boolean k;
	boolean l;
	String m;
	ArrayList n;
	int o;
	boolean p;
	String q;
	String r;
	private AlphaAnimation s;
	private AlphaAnimation t;
}
