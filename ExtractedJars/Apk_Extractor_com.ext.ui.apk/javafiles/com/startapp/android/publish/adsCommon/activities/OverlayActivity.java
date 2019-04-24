// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.startapp.android.publish.ads.a.b;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.common.a.g;

public class OverlayActivity extends Activity
{

	public OverlayActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Activity()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean f>
		g = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #23  <Field int g>
	//    8   14:return          
	}

	private void a()
	{
		int j = getIntent().getIntExtra("placement", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Intent getIntent()>
	//    2    4:ldc1            #30  <String "placement">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #36  <Method int Intent.getIntExtra(String, int)>
	//    5   10:istore_1        
		a = com.startapp.android.publish.ads.a.b.a(((Activity) (this)), getIntent(), com.startapp.android.publish.common.model.AdPreferences.Placement.getByIndex(j));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:aload_0         
	//    9   14:invokevirtual   #28  <Method Intent getIntent()>
	//   10   17:iload_1         
	//   11   18:invokestatic    #42  <Method com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.getByIndex(int)>
	//   12   21:invokestatic    #47  <Method b b.a(Activity, Intent, com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//   13   24:putfield        #49  <Field b a>
		if(a == null)
	//*  14   27:aload_0         
	//*  15   28:getfield        #49  <Field b a>
	//*  16   31:ifnonnull       38
			finish();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #52  <Method void finish()>
	//   19   38:return          
	}

	public void finish()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field b a>
	//*   2    4:ifnull          14
			a.q();
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field b a>
	//    5   11:invokevirtual   #55  <Method void b.q()>
		super.finish();
	//    6   14:aload_0         
	//    7   15:invokespecial   #56  <Method void Activity.finish()>
	//    8   18:return          
	}

	public void onBackPressed()
	{
		if(!a.r())
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field b a>
	//*   2    4:invokevirtual   #61  <Method boolean b.r()>
	//*   3    7:ifne            14
			super.onBackPressed();
	//    4   10:aload_0         
	//    5   11:invokespecial   #63  <Method void Activity.onBackPressed()>
	//    6   14:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void Activity.onConfigurationChanged(Configuration)>
		if(b)
	//*   3    5:aload_0         
	//*   4    6:getfield        #69  <Field boolean b>
	//*   5    9:ifeq            39
		{
			a();
	//    6   12:aload_0         
	//    7   13:invokespecial   #71  <Method void a()>
			a.a(e);
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field b a>
	//   10   20:aload_0         
	//   11   21:getfield        #73  <Field Bundle e>
	//   12   24:invokevirtual   #76  <Method void b.a(Bundle)>
			a.u();
	//   13   27:aload_0         
	//   14   28:getfield        #49  <Field b a>
	//   15   31:invokevirtual   #79  <Method void b.u()>
			b = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #69  <Field boolean b>
		}
		a.a(configuration);
	//   19   39:aload_0         
	//   20   40:getfield        #49  <Field b a>
	//   21   43:aload_1         
	//   22   44:invokevirtual   #81  <Method void b.a(Configuration)>
	//   23   47:return          
	}

	protected void onCreate(Bundle bundle)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		overridePendingTransition(0, 0);
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #86  <Method void overridePendingTransition(int, int)>
		super.onCreate(bundle);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:invokespecial   #88  <Method void Activity.onCreate(Bundle)>
		boolean flag1 = getIntent().getBooleanExtra("videoAd", false);
	//    9   13:aload_0         
	//   10   14:invokevirtual   #28  <Method Intent getIntent()>
	//   11   17:ldc1            #90  <String "videoAd">
	//   12   19:iconst_0        
	//   13   20:invokevirtual   #94  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   14   23:istore_3        
		requestWindowFeature(1);
	//   15   24:aload_0         
	//   16   25:iconst_1        
	//   17   26:invokevirtual   #98  <Method boolean requestWindowFeature(int)>
	//   18   29:pop             
		if(getIntent().getBooleanExtra("fullscreen", false) || flag1)
	//*  19   30:aload_0         
	//*  20   31:invokevirtual   #28  <Method Intent getIntent()>
	//*  21   34:ldc1            #100 <String "fullscreen">
	//*  22   36:iconst_0        
	//*  23   37:invokevirtual   #94  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  24   40:ifne            47
	//*  25   43:iload_3         
	//*  26   44:ifeq            60
			getWindow().setFlags(1024, 1024);
	//   27   47:aload_0         
	//   28   48:invokevirtual   #104 <Method Window getWindow()>
	//   29   51:sipush          1024
	//   30   54:sipush          1024
	//   31   57:invokevirtual   #109 <Method void Window.setFlags(int, int)>
		com.startapp.common.a.g.a("AppWallActivity", 2, "AppWallActivity::onCreate");
	//   32   60:ldc1            #111 <String "AppWallActivity">
	//   33   62:iconst_2        
	//   34   63:ldc1            #113 <String "AppWallActivity::onCreate">
	//   35   65:invokestatic    #118 <Method void g.a(String, int, String)>
		d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
	//   36   68:aload_0         
	//   37   69:aload_0         
	//   38   70:invokevirtual   #28  <Method Intent getIntent()>
	//   39   73:ldc1            #120 <String "activityShouldLockOrientation">
	//   40   75:iconst_1        
	//   41   76:invokevirtual   #94  <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   42   79:putfield        #122 <Field boolean d>
		if(bundle == null && !flag1)
	//*  43   82:aload_1         
	//*  44   83:ifnonnull       107
	//*  45   86:iload_3         
	//*  46   87:ifne            107
			com.startapp.common.b.a(((android.content.Context) (this))).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
	//   47   90:aload_0         
	//   48   91:invokestatic    #127 <Method com.startapp.common.b com.startapp.common.b.a(android.content.Context)>
	//   49   94:new             #32  <Class Intent>
	//   50   97:dup             
	//   51   98:ldc1            #129 <String "com.startapp.android.ShowDisplayBroadcastListener">
	//   52  100:invokespecial   #132 <Method void Intent(String)>
	//   53  103:invokevirtual   #135 <Method boolean com.startapp.common.b.a(Intent)>
	//   54  106:pop             
		if(bundle != null)
	//*  55  107:aload_1         
	//*  56  108:ifnull          133
		{
			g = bundle.getInt("activityLockedOrientation", -1);
	//   57  111:aload_0         
	//   58  112:aload_1         
	//   59  113:ldc1            #137 <String "activityLockedOrientation">
	//   60  115:iconst_m1       
	//   61  116:invokevirtual   #142 <Method int Bundle.getInt(String, int)>
	//   62  119:putfield        #23  <Field int g>
			d = bundle.getBoolean("activityShouldLockOrientation", true);
	//   63  122:aload_0         
	//   64  123:aload_1         
	//   65  124:ldc1            #120 <String "activityShouldLockOrientation">
	//   66  126:iconst_1        
	//   67  127:invokevirtual   #145 <Method boolean Bundle.getBoolean(String, boolean)>
	//   68  130:putfield        #122 <Field boolean d>
		}
		c = getIntent().getIntExtra("orientation", getResources().getConfiguration().orientation);
	//   69  133:aload_0         
	//   70  134:aload_0         
	//   71  135:invokevirtual   #28  <Method Intent getIntent()>
	//   72  138:ldc1            #147 <String "orientation">
	//   73  140:aload_0         
	//   74  141:invokevirtual   #151 <Method Resources getResources()>
	//   75  144:invokevirtual   #157 <Method Configuration Resources.getConfiguration()>
	//   76  147:getfield        #161 <Field int Configuration.orientation>
	//   77  150:invokevirtual   #36  <Method int Intent.getIntExtra(String, int)>
	//   78  153:putfield        #163 <Field int c>
		if(getResources().getConfiguration().orientation == c)
	//*  79  156:aload_0         
	//*  80  157:invokevirtual   #151 <Method Resources getResources()>
	//*  81  160:invokevirtual   #157 <Method Configuration Resources.getConfiguration()>
	//*  82  163:getfield        #161 <Field int Configuration.orientation>
	//*  83  166:aload_0         
	//*  84  167:getfield        #163 <Field int c>
	//*  85  170:icmpeq          198
	//*  86  173:aload_0         
	//*  87  174:iload_2         
	//*  88  175:putfield        #69  <Field boolean b>
	//*  89  178:aload_0         
	//*  90  179:getfield        #69  <Field boolean b>
	//*  91  182:ifne            203
	//*  92  185:aload_0         
	//*  93  186:invokespecial   #71  <Method void a()>
	//*  94  189:aload_0         
	//*  95  190:getfield        #49  <Field b a>
	//*  96  193:aload_1         
	//*  97  194:invokevirtual   #76  <Method void b.a(Bundle)>
	//*  98  197:return          
			flag = false;
	//   99  198:iconst_0        
	//  100  199:istore_2        
		b = flag;
		if(!b)
		{
			a();
			a.a(bundle);
			return;
		} else
	//* 101  200:goto            173
		{
			e = bundle;
	//  102  203:aload_0         
	//  103  204:aload_1         
	//  104  205:putfield        #73  <Field Bundle e>
			return;
	//  105  208:return          
		}
	}

	protected void onDestroy()
	{
		com.startapp.common.a.g.a("AppWallActivity", 2, "AppWallActivity::onDestroy");
	//    0    0:ldc1            #111 <String "AppWallActivity">
	//    1    2:iconst_2        
	//    2    3:ldc1            #166 <String "AppWallActivity::onDestroy">
	//    3    5:invokestatic    #118 <Method void g.a(String, int, String)>
		if(!b)
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field boolean b>
	//*   6   12:ifne            32
		{
			a.v();
	//    7   15:aload_0         
	//    8   16:getfield        #49  <Field b a>
	//    9   19:invokevirtual   #169 <Method void b.v()>
			a = null;
	//   10   22:aload_0         
	//   11   23:aconst_null     
	//   12   24:putfield        #49  <Field b a>
			i.a(((Activity) (this)), false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokestatic    #174 <Method void i.a(Activity, boolean)>
		}
		super.onDestroy();
	//   16   32:aload_0         
	//   17   33:invokespecial   #176 <Method void Activity.onDestroy()>
	//   18   36:return          
	}

	public boolean onKeyDown(int j, KeyEvent keyevent)
	{
		if(a != null && !a.a(j, keyevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field b a>
	//*   2    4:ifnull          26
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field b a>
	//*   5   11:iload_1         
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #180 <Method boolean b.a(int, KeyEvent)>
	//*   8   16:ifne            26
			return super.onKeyDown(j, keyevent);
	//    9   19:aload_0         
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:invokespecial   #182 <Method boolean Activity.onKeyDown(int, KeyEvent)>
	//   13   25:ireturn         
		else
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	protected void onPause()
	{
		com.startapp.common.a.g.a("AppWallActivity", 2, "OverlayActivity::onPause");
	//    0    0:ldc1            #111 <String "AppWallActivity">
	//    1    2:iconst_2        
	//    2    3:ldc1            #185 <String "OverlayActivity::onPause">
	//    3    5:invokestatic    #118 <Method void g.a(String, int, String)>
		super.onPause();
	//    4    8:aload_0         
	//    5    9:invokespecial   #187 <Method void Activity.onPause()>
		if(!b)
	//*   6   12:aload_0         
	//*   7   13:getfield        #69  <Field boolean b>
	//*   8   16:ifne            30
		{
			a.s();
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field b a>
	//   11   23:invokevirtual   #190 <Method void b.s()>
			com.startapp.android.publish.adsCommon.c.a(((android.content.Context) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #195 <Method void c.a(android.content.Context)>
		}
		overridePendingTransition(0, 0);
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #86  <Method void overridePendingTransition(int, int)>
	//   18   36:return          
	}

	protected void onResume()
	{
		com.startapp.common.a.g.a("AppWallActivity", 2, "AppWallActivity::onResume");
	//    0    0:ldc1            #111 <String "AppWallActivity">
	//    1    2:iconst_2        
	//    2    3:ldc1            #198 <String "AppWallActivity::onResume">
	//    3    5:invokestatic    #118 <Method void g.a(String, int, String)>
		super.onResume();
	//    4    8:aload_0         
	//    5    9:invokespecial   #200 <Method void Activity.onResume()>
		if(f)
	//*   6   12:aload_0         
	//*   7   13:getfield        #21  <Field boolean f>
	//*   8   16:ifeq            26
			a.c();
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field b a>
	//   11   23:invokevirtual   #202 <Method void b.c()>
		if(g == -1)
	//*  12   26:aload_0         
	//*  13   27:getfield        #23  <Field int g>
	//*  14   30:iconst_m1       
	//*  15   31:icmpne          65
			g = i.a(((Activity) (this)), c, d);
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #163 <Field int c>
	//   20   40:aload_0         
	//   21   41:getfield        #122 <Field boolean d>
	//   22   44:invokestatic    #205 <Method int i.a(Activity, int, boolean)>
	//   23   47:putfield        #23  <Field int g>
		else
	//*  24   50:aload_0         
	//*  25   51:getfield        #69  <Field boolean b>
	//*  26   54:ifne            64
	//*  27   57:aload_0         
	//*  28   58:getfield        #49  <Field b a>
	//*  29   61:invokevirtual   #79  <Method void b.u()>
	//*  30   64:return          
			com.startapp.common.a.c.a(((Activity) (this)), g);
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:getfield        #23  <Field int g>
	//   34   70:invokestatic    #210 <Method void com.startapp.common.a.c.a(Activity, int)>
		if(!b)
			a.u();
	//*  35   73:goto            50
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		com.startapp.common.a.g.a("AppWallActivity", 2, "AppWallActivity::onSaveInstanceState");
	//    0    0:ldc1            #111 <String "AppWallActivity">
	//    1    2:iconst_2        
	//    2    3:ldc1            #213 <String "AppWallActivity::onSaveInstanceState">
	//    3    5:invokestatic    #118 <Method void g.a(String, int, String)>
		super.onSaveInstanceState(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #215 <Method void Activity.onSaveInstanceState(Bundle)>
		if(!b)
	//*   7   13:aload_0         
	//*   8   14:getfield        #69  <Field boolean b>
	//*   9   17:ifne            48
		{
			a.b(bundle);
	//   10   20:aload_0         
	//   11   21:getfield        #49  <Field b a>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #217 <Method void b.b(Bundle)>
			bundle.putInt("activityLockedOrientation", g);
	//   14   28:aload_1         
	//   15   29:ldc1            #137 <String "activityLockedOrientation">
	//   16   31:aload_0         
	//   17   32:getfield        #23  <Field int g>
	//   18   35:invokevirtual   #221 <Method void Bundle.putInt(String, int)>
			bundle.putBoolean("activityShouldLockOrientation", d);
	//   19   38:aload_1         
	//   20   39:ldc1            #120 <String "activityShouldLockOrientation">
	//   21   41:aload_0         
	//   22   42:getfield        #122 <Field boolean d>
	//   23   45:invokevirtual   #225 <Method void Bundle.putBoolean(String, boolean)>
		}
	//   24   48:return          
	}

	protected void onStop()
	{
		com.startapp.common.a.g.a("AppWallActivity", 2, "AppWallActivity::onStop");
	//    0    0:ldc1            #111 <String "AppWallActivity">
	//    1    2:iconst_2        
	//    2    3:ldc1            #228 <String "AppWallActivity::onStop">
	//    3    5:invokestatic    #118 <Method void g.a(String, int, String)>
		super.onStop();
	//    4    8:aload_0         
	//    5    9:invokespecial   #230 <Method void Activity.onStop()>
		if(!b)
	//*   6   12:aload_0         
	//*   7   13:getfield        #69  <Field boolean b>
	//*   8   16:ifne            26
			a.t();
	//    9   19:aload_0         
	//   10   20:getfield        #49  <Field b a>
	//   11   23:invokevirtual   #233 <Method void b.t()>
	//   12   26:return          
	}

	private b a;
	private boolean b;
	private int c;
	private boolean d;
	private Bundle e;
	private boolean f;
	private int g;
}
