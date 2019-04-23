// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.a.g;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import biz.bookdesign.librivox.a.k;
import biz.bookdesign.librivox.audio.LocalAudioService;
import biz.bookdesign.librivox.b.a;
import biz.bookdesign.librivox.b.i;
import biz.bookdesign.librivox.b.j;
import biz.bookdesign.librivox.b.m;
import biz.bookdesign.librivox.client.o;
import biz.bookdesign.librivox.support.b;
import biz.bookdesign.librivox.support.f;

// Referenced classes of package biz.bookdesign.librivox:
//			bj, bl, bk, bm

public class bi extends AppCompatActivity
{

	public bi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AppCompatActivity()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field BroadcastReceiver a>
		b = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #29  <Field boolean b>
		h = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #31  <Field boolean h>
	//   11   19:aload_0         
	//   12   20:new             #33  <Class bj>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #36  <Method void bj(bi)>
	//   16   28:putfield        #38  <Field ServiceConnection i>
	//   17   31:return          
	}

	static boolean a(bi bi1, boolean flag)
	{
		bi1.b = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean b>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private boolean b(m m1)
	{
		m m2 = f.f();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LocalAudioService f>
	//    2    4:invokevirtual   #48  <Method m LocalAudioService.f()>
	//    3    7:astore          5
		boolean flag1 = f.l();
	//    4    9:aload_0         
	//    5   10:getfield        #43  <Field LocalAudioService f>
	//    6   13:invokevirtual   #52  <Method boolean LocalAudioService.l()>
	//    7   16:istore_3        
		boolean flag2 = false;
	//    8   17:iconst_0        
	//    9   18:istore          4
		boolean flag;
		if(!flag1 && !f.k())
	//*  10   20:iload_3         
	//*  11   21:ifne            42
	//*  12   24:aload_0         
	//*  13   25:getfield        #43  <Field LocalAudioService f>
	//*  14   28:invokevirtual   #55  <Method boolean LocalAudioService.k()>
	//*  15   31:ifeq            37
	//*  16   34:goto            42
			flag = false;
	//   17   37:iconst_0        
	//   18   38:istore_2        
		else
	//*  19   39:goto            44
			flag = true;
	//   20   42:iconst_1        
	//   21   43:istore_2        
		flag1 = flag2;
	//   22   44:iload           4
	//   23   46:istore_3        
		if(m2 != null)
	//*  24   47:aload           5
	//*  25   49:ifnull          73
		{
			flag1 = flag2;
	//   26   52:iload           4
	//   27   54:istore_3        
			if(m2.equals(((Object) (m1))))
	//*  28   55:aload           5
	//*  29   57:aload_1         
	//*  30   58:invokevirtual   #61  <Method boolean m.equals(Object)>
	//*  31   61:ifeq            73
			{
				flag1 = flag2;
	//   32   64:iload           4
	//   33   66:istore_3        
				if(flag)
	//*  34   67:iload_2         
	//*  35   68:ifeq            73
					flag1 = true;
	//   36   71:iconst_1        
	//   37   72:istore_3        
			}
		}
		return flag1;
	//   38   73:iload_3         
	//   39   74:ireturn         
	}

	void a(a a1)
	{
		i i1 = a1.z();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method i a.z()>
	//    2    4:astore          5
		int l;
		long l1;
		if(i1 != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          26
		{
			l = i1.c();
	//    5   11:aload           5
	//    6   13:invokevirtual   #73  <Method int i.c()>
	//    7   16:istore_2        
			l1 = i1.e();
	//    8   17:aload           5
	//    9   19:invokevirtual   #76  <Method long i.e()>
	//   10   22:lstore_3        
		} else
	//*  11   23:goto            32
		{
			l = 1;
	//   12   26:iconst_1        
	//   13   27:istore_2        
			l1 = -1L;
	//   14   28:ldc2w           #77  <Long -1L>
	//   15   31:lstore_3        
		}
		a(new m(a1.p(), l, ((android.content.Context) (this))), l1);
	//   16   32:aload_0         
	//   17   33:new             #57  <Class m>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokevirtual   #81  <Method int a.p()>
	//   21   41:iload_2         
	//   22   42:aload_0         
	//   23   43:invokespecial   #84  <Method void m(int, int, android.content.Context)>
	//   24   46:lload_3         
	//   25   47:invokevirtual   #87  <Method void a(m, long)>
	//   26   50:return          
	}

	void a(m m1)
	{
		a(m1, -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #77  <Long -1L>
	//    3    5:invokevirtual   #87  <Method void a(m, long)>
	//    4    8:return          
	}

	void a(m m1, long l)
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field LocalAudioService f>
	//*   2    4:ifnonnull       21
		{
			com.crashlytics.android.a.a(6, "LibriVox", "Play called before audio service bound.");
	//    3    7:bipush          6
	//    4    9:ldc1            #90  <String "LibriVox">
	//    5   11:ldc1            #92  <String "Play called before audio service bound.">
	//    6   13:invokestatic    #97  <Method void com.crashlytics.android.a.a(int, String, String)>
			c();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #99  <Method void c()>
			return;
	//    9   20:return          
		}
		bl bl1 = new bl(this, m1, l);
	//   10   21:new             #101 <Class bl>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:lload_2         
	//   15   28:invokespecial   #104 <Method void bl(bi, m, long)>
	//   16   31:astore          4
		if(!m1.i() && !b(m1))
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #106 <Method boolean m.i()>
	//*  19   37:ifne            71
	//*  20   40:aload_0         
	//*  21   41:aload_1         
	//*  22   42:invokespecial   #108 <Method boolean b(m)>
	//*  23   45:ifeq            51
	//*  24   48:goto            71
		{
			(new f("no_wifi_play", true, k.listen_no_wifi)).a(((android.content.Context) (this)), ((Runnable) (bl1)));
	//   25   51:new             #110 <Class f>
	//   26   54:dup             
	//   27   55:ldc1            #112 <String "no_wifi_play">
	//   28   57:iconst_1        
	//   29   58:getstatic       #118 <Field int k.listen_no_wifi>
	//   30   61:invokespecial   #121 <Method void f(String, boolean, int)>
	//   31   64:aload_0         
	//   32   65:aload           4
	//   33   67:invokevirtual   #124 <Method void f.a(android.content.Context, Runnable)>
			return;
	//   34   70:return          
		} else
		{
			((Runnable) (bl1)).run();
	//   35   71:aload           4
	//   36   73:invokeinterface #129 <Method void Runnable.run()>
			return;
	//   37   78:return          
		}
	}

	protected void a(String s)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field Toast g>
	//*   2    4:ifnonnull       20
			g = Toast.makeText(getApplicationContext(), ((CharSequence) (s)), 0);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #139 <Method android.content.Context getApplicationContext()>
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:invokestatic    #145 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//    9   17:putfield        #135 <Field Toast g>
		if(!g.getView().isShown())
	//*  10   20:aload_0         
	//*  11   21:getfield        #135 <Field Toast g>
	//*  12   24:invokevirtual   #149 <Method View Toast.getView()>
	//*  13   27:invokevirtual   #154 <Method boolean View.isShown()>
	//*  14   30:ifne            48
		{
			g.setText(((CharSequence) (s)));
	//   15   33:aload_0         
	//   16   34:getfield        #135 <Field Toast g>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #158 <Method void Toast.setText(CharSequence)>
			g.show();
	//   19   41:aload_0         
	//   20   42:getfield        #135 <Field Toast g>
	//   21   45:invokevirtual   #161 <Method void Toast.show()>
		}
	//   22   48:return          
	}

	void b()
	{
		Object obj = ((Object) (PreferenceManager.getDefaultSharedPreferences(((android.content.Context) (this)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #168 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(android.content.Context)>
	//    2    4:astore_1        
		if(!((SharedPreferences) (obj)).getBoolean("notify_restricted_data", true))
	//*   3    5:aload_1         
	//*   4    6:ldc1            #170 <String "notify_restricted_data">
	//*   5    8:iconst_1        
	//*   6    9:invokeinterface #176 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*   7   14:ifne            18
			return;
	//    8   17:return          
		if(((SharedPreferences) (obj)).getLong("notify_restricted_data_time", 0L) + 0x6ddd00L > System.currentTimeMillis())
	//*   9   18:aload_1         
	//*  10   19:ldc1            #178 <String "notify_restricted_data_time">
	//*  11   21:lconst_0        
	//*  12   22:invokeinterface #182 <Method long SharedPreferences.getLong(String, long)>
	//*  13   27:ldc2w           #183 <Long 0x6ddd00L>
	//*  14   30:ladd            
	//*  15   31:invokestatic    #189 <Method long System.currentTimeMillis()>
	//*  16   34:lcmp            
	//*  17   35:ifle            39
		{
			return;
	//   18   38:return          
		} else
		{
			obj = ((Object) (new bk(this, ((SharedPreferences) (obj)))));
	//   19   39:new             #191 <Class bk>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:invokespecial   #194 <Method void bk(bi, SharedPreferences)>
	//   24   48:astore_1        
			biz.bookdesign.librivox.support.b.a(((android.content.Context) (this)), k.data_saver_title, k.data_saver_details, ((android.content.DialogInterface.OnClickListener) (obj)), ((android.content.DialogInterface.OnClickListener) (null)), "notify_restricted_data").show();
	//   25   49:aload_0         
	//   26   50:getstatic       #197 <Field int k.data_saver_title>
	//   27   53:getstatic       #200 <Field int k.data_saver_details>
	//   28   56:aload_1         
	//   29   57:aconst_null     
	//   30   58:ldc1            #170 <String "notify_restricted_data">
	//   31   60:invokestatic    #205 <Method Dialog b.a(android.content.Context, int, int, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnClickListener, String)>
	//   32   63:invokevirtual   #208 <Method void Dialog.show()>
			return;
	//   33   66:return          
		}
	}

	void c()
	{
		h = bindService(new Intent(((android.content.Context) (this)), biz/bookdesign/librivox/audio/LocalAudioService), i, 1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:new             #210 <Class Intent>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:ldc1            #45  <Class LocalAudioService>
	//    6    9:invokespecial   #213 <Method void Intent(android.content.Context, Class)>
	//    7   12:aload_0         
	//    8   13:getfield        #38  <Field ServiceConnection i>
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #217 <Method boolean bindService(Intent, ServiceConnection, int)>
	//   11   20:putfield        #31  <Field boolean h>
	//   12   23:return          
	}

	void d()
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean h>
	//*   2    4:ifeq            15
			unbindService(i);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field ServiceConnection i>
	//    6   12:invokevirtual   #221 <Method void unbindService(ServiceConnection)>
		f = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #43  <Field LocalAudioService f>
		h = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #31  <Field boolean h>
	//   13   25:return          
	}

	public boolean e()
	{
		LocalAudioService localaudioservice = f;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LocalAudioService f>
	//    2    4:astore_1        
		return localaudioservice != null && localaudioservice.k();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #55  <Method boolean LocalAudioService.k()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void f()
	{
		LocalAudioService localaudioservice = f;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LocalAudioService f>
	//    2    4:astore_1        
		if(localaudioservice != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			localaudioservice.m();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #224 <Method void LocalAudioService.m()>
	//    7   13:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #228 <Method void AppCompatActivity.onCreate(Bundle)>
		c = new j(getApplicationContext());
	//    3    5:aload_0         
	//    4    6:new             #230 <Class j>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #139 <Method android.content.Context getApplicationContext()>
	//    8   14:invokespecial   #233 <Method void j(android.content.Context)>
	//    9   17:putfield        #235 <Field j c>
		c.a();
	//   10   20:aload_0         
	//   11   21:getfield        #235 <Field j c>
	//   12   24:invokevirtual   #238 <Method j j.a()>
	//   13   27:pop             
		e = new o(getApplicationContext());
	//   14   28:aload_0         
	//   15   29:new             #240 <Class o>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokevirtual   #139 <Method android.content.Context getApplicationContext()>
	//   19   37:invokespecial   #241 <Method void o(android.content.Context)>
	//   20   40:putfield        #243 <Field o e>
		d = android.support.v4.a.g.a(((android.content.Context) (this)));
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:invokestatic    #248 <Method g g.a(android.content.Context)>
	//   24   48:putfield        #250 <Field g d>
	//   25   51:return          
	}

	protected void onDestroy()
	{
		c.b();
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field j c>
	//    2    4:invokevirtual   #253 <Method void j.b()>
		d.a(a);
	//    3    7:aload_0         
	//    4    8:getfield        #250 <Field g d>
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field BroadcastReceiver a>
	//    7   15:invokevirtual   #256 <Method void g.a(BroadcastReceiver)>
		super.onDestroy();
	//    8   18:aload_0         
	//    9   19:invokespecial   #258 <Method void AppCompatActivity.onDestroy()>
	//   10   22:return          
	}

	protected void onPause()
	{
		d.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field g d>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field BroadcastReceiver a>
	//    4    8:invokevirtual   #256 <Method void g.a(BroadcastReceiver)>
		IntentFilter intentfilter = new IntentFilter();
	//    5   11:new             #261 <Class IntentFilter>
	//    6   14:dup             
	//    7   15:invokespecial   #262 <Method void IntentFilter()>
	//    8   18:astore_1        
		intentfilter.addAction("countrychange");
	//    9   19:aload_1         
	//   10   20:ldc2            #264 <String "countrychange">
	//   11   23:invokevirtual   #267 <Method void IntentFilter.addAction(String)>
		d.a(a, intentfilter);
	//   12   26:aload_0         
	//   13   27:getfield        #250 <Field g d>
	//   14   30:aload_0         
	//   15   31:getfield        #27  <Field BroadcastReceiver a>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #270 <Method void g.a(BroadcastReceiver, IntentFilter)>
		if(!isChangingConfigurations())
	//*  18   38:aload_0         
	//*  19   39:invokevirtual   #273 <Method boolean isChangingConfigurations()>
	//*  20   42:ifne            69
		{
			LocalAudioService localaudioservice = f;
	//   21   45:aload_0         
	//   22   46:getfield        #43  <Field LocalAudioService f>
	//   23   49:astore_1        
			if(localaudioservice != null && !localaudioservice.k())
	//*  24   50:aload_1         
	//*  25   51:ifnull          69
	//*  26   54:aload_1         
	//*  27   55:invokevirtual   #55  <Method boolean LocalAudioService.k()>
	//*  28   58:ifne            69
				f.stopForeground(true);
	//   29   61:aload_0         
	//   30   62:getfield        #43  <Field LocalAudioService f>
	//   31   65:iconst_1        
	//   32   66:invokevirtual   #277 <Method void LocalAudioService.stopForeground(boolean)>
		}
		super.onPause();
	//   33   69:aload_0         
	//   34   70:invokespecial   #279 <Method void AppCompatActivity.onPause()>
	//   35   73:return          
	}

	protected void onResume()
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field boolean b>
	//*   2    4:ifeq            21
		{
			Intent intent = getIntent();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #284 <Method Intent getIntent()>
	//    5   11:astore_1        
			finish();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #287 <Method void finish()>
			startActivity(intent);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #291 <Method void startActivity(Intent)>
		}
		Object obj = ((Object) (a));
	//   11   21:aload_0         
	//   12   22:getfield        #27  <Field BroadcastReceiver a>
	//   13   25:astore_1        
		if(obj != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          38
			d.a(((BroadcastReceiver) (obj)));
	//   16   30:aload_0         
	//   17   31:getfield        #250 <Field g d>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #256 <Method void g.a(BroadcastReceiver)>
		obj = ((Object) (new IntentFilter()));
	//   20   38:new             #261 <Class IntentFilter>
	//   21   41:dup             
	//   22   42:invokespecial   #262 <Method void IntentFilter()>
	//   23   45:astore_1        
		((IntentFilter) (obj)).addAction("biz.bookdesign.librivox.dl.DOWNLOAD_FAIL_DEVICE");
	//   24   46:aload_1         
	//   25   47:ldc2            #293 <String "biz.bookdesign.librivox.dl.DOWNLOAD_FAIL_DEVICE">
	//   26   50:invokevirtual   #267 <Method void IntentFilter.addAction(String)>
		((IntentFilter) (obj)).addAction("biz.bookdesign.librivox.dl.DOWNLOAD_FAIL_NETWORK");
	//   27   53:aload_1         
	//   28   54:ldc2            #295 <String "biz.bookdesign.librivox.dl.DOWNLOAD_FAIL_NETWORK">
	//   29   57:invokevirtual   #267 <Method void IntentFilter.addAction(String)>
		((IntentFilter) (obj)).addAction("countrychange");
	//   30   60:aload_1         
	//   31   61:ldc2            #264 <String "countrychange">
	//   32   64:invokevirtual   #267 <Method void IntentFilter.addAction(String)>
		((IntentFilter) (obj)).addAction("biz.bookdesign.librivox.data_restricted");
	//   33   67:aload_1         
	//   34   68:ldc2            #297 <String "biz.bookdesign.librivox.data_restricted">
	//   35   71:invokevirtual   #267 <Method void IntentFilter.addAction(String)>
		a = ((BroadcastReceiver) (new bm(this, ((bj) (null)))));
	//   36   74:aload_0         
	//   37   75:new             #299 <Class bm>
	//   38   78:dup             
	//   39   79:aload_0         
	//   40   80:aconst_null     
	//   41   81:invokespecial   #302 <Method void bm(bi, bj)>
	//   42   84:putfield        #27  <Field BroadcastReceiver a>
		d.a(a, ((IntentFilter) (obj)));
	//   43   87:aload_0         
	//   44   88:getfield        #250 <Field g d>
	//   45   91:aload_0         
	//   46   92:getfield        #27  <Field BroadcastReceiver a>
	//   47   95:aload_1         
	//   48   96:invokevirtual   #270 <Method void g.a(BroadcastReceiver, IntentFilter)>
		if(c.c())
	//*  49   99:aload_0         
	//*  50  100:getfield        #235 <Field j c>
	//*  51  103:invokevirtual   #304 <Method boolean j.c()>
	//*  52  106:ifeq            132
		{
			c = new j(getApplicationContext());
	//   53  109:aload_0         
	//   54  110:new             #230 <Class j>
	//   55  113:dup             
	//   56  114:aload_0         
	//   57  115:invokevirtual   #139 <Method android.content.Context getApplicationContext()>
	//   58  118:invokespecial   #233 <Method void j(android.content.Context)>
	//   59  121:putfield        #235 <Field j c>
			c.a();
	//   60  124:aload_0         
	//   61  125:getfield        #235 <Field j c>
	//   62  128:invokevirtual   #238 <Method j j.a()>
	//   63  131:pop             
		}
		super.onResume();
	//   64  132:aload_0         
	//   65  133:invokespecial   #306 <Method void AppCompatActivity.onResume()>
	//   66  136:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #309 <Method void AppCompatActivity.onStart()>
		c();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #99  <Method void c()>
	//    4    8:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #312 <Method void AppCompatActivity.onStop()>
		d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #314 <Method void d()>
	//    4    8:return          
	}

	private BroadcastReceiver a;
	private boolean b;
	j c;
	g d;
	o e;
	LocalAudioService f;
	private Toast g;
	private boolean h;
	private final ServiceConnection i = new bj(this);
}
