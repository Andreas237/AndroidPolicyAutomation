// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.x;
import android.view.View;
import android.view.ViewGroup;
import com.b.c.c.b;
import com.crashlytics.android.a;
import com.google.android.gms.ads.*;
import java.util.Random;

// Referenced classes of package biz.bookdesign.librivox:
//			bw, SettingsActivity, ea, g, 
//			du, dw, h, cl, 
//			cm, bx

public class LibriVoxFreeApp extends bw
{

	public LibriVoxFreeApp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void bw()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class Random>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void Random()>
	//    6   12:putfield        #15  <Field Random a>
	//    7   15:return          
	}

	private boolean b(Context context)
	{
		boolean flag1 = SettingsActivity.c(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method boolean SettingsActivity.c(Context)>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(!flag1)
	//*   5    8:iload           4
	//*   6   10:ifne            15
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
		context = ((Context) (PreferenceManager.getDefaultSharedPreferences(context)));
	//    9   15:aload_1         
	//   10   16:invokestatic    #29  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   11   19:astore_1        
		if(!((SharedPreferences) (context)).getBoolean("show_paid", true))
	//*  12   20:aload_1         
	//*  13   21:ldc1            #31  <String "show_paid">
	//*  14   23:iconst_1        
	//*  15   24:invokeinterface #37  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  16   29:ifne            34
			return false;
	//   17   32:iconst_0        
	//   18   33:ireturn         
		int i = ((SharedPreferences) (context)).getInt("prad", 15);
	//   19   34:aload_1         
	//   20   35:ldc1            #39  <String "prad">
	//   21   37:bipush          15
	//   22   39:invokeinterface #43  <Method int SharedPreferences.getInt(String, int)>
	//   23   44:istore_2        
		if(a.nextInt(100) < i)
	//*  24   45:aload_0         
	//*  25   46:getfield        #15  <Field Random a>
	//*  26   49:bipush          100
	//*  27   51:invokevirtual   #47  <Method int Random.nextInt(int)>
	//*  28   54:iload_2         
	//*  29   55:icmpge          60
			flag = true;
	//   30   58:iconst_1        
	//   31   59:istore_3        
		return flag;
	//   32   60:iload_3         
	//   33   61:ireturn         
	}

	public View a(x x, ViewGroup viewgroup)
	{
		if(b(((Context) (x))))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #50  <Method boolean b(Context)>
	//*   3    5:ifeq            21
			return (new ea(x)).a(viewgroup);
	//    4    8:new             #52  <Class ea>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #55  <Method void ea(x)>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #58  <Method View biz.bookdesign.librivox.ea.a(ViewGroup)>
	//   10   20:areturn         
		else
			return (new biz.bookdesign.librivox.g(((Context) (x)))).a(viewgroup);
	//   11   21:new             #60  <Class biz.bookdesign.librivox.g>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #63  <Method void biz.bookdesign.librivox.g(Context)>
	//   15   29:aload_2         
	//   16   30:invokevirtual   #64  <Method View biz.bookdesign.librivox.g.a(ViewGroup)>
	//   17   33:areturn         
	}

	public void a(ViewGroup viewgroup, String s)
	{
		String s1;
		s1 = e();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method String e()>
	//    2    4:astore          4
		if(s1 == null)
			break MISSING_BLOCK_LABEL_102;
	//    3    6:aload           4
	//    4    8:ifnull          102
		g g1;
		g1 = new g(((Context) (this)));
	//    5   11:new             #75  <Class g>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #76  <Method void g(Context)>
	//    9   19:astore_3        
		g1.setId(du.admob_view);
	//   10   20:aload_3         
	//   11   21:getstatic       #82  <Field int du.admob_view>
	//   12   24:invokevirtual   #86  <Method void g.setId(int)>
		g1.setAdUnitId(s1);
	//   13   27:aload_3         
	//   14   28:aload           4
	//   15   30:invokevirtual   #90  <Method void g.setAdUnitId(String)>
		g1.setAdSize(f.g);
	//   16   33:aload_3         
	//   17   34:getstatic       #96  <Field f f.g>
	//   18   37:invokevirtual   #100 <Method void g.setAdSize(f)>
		viewgroup.addView(((View) (g1)), 0);
	//   19   40:aload_1         
	//   20   41:aload_3         
	//   21   42:iconst_0        
	//   22   43:invokevirtual   #106 <Method void ViewGroup.addView(View, int)>
		viewgroup = ((ViewGroup) (new e()));
	//   23   46:new             #108 <Class e>
	//   24   49:dup             
	//   25   50:invokespecial   #109 <Method void e()>
	//   26   53:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_64;
	//   27   54:aload_2         
	//   28   55:ifnull          64
		((e) (viewgroup)).c(s);
	//   29   58:aload_1         
	//   30   59:aload_2         
	//   31   60:invokevirtual   #112 <Method e e.c(String)>
	//   32   63:pop             
		g1.a(((e) (viewgroup)).a());
	//   33   64:aload_3         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #115 <Method com.google.android.gms.ads.d e.a()>
	//   36   69:invokevirtual   #118 <Method void g.a(com.google.android.gms.ads.d)>
		return;
	//   37   72:return          
		viewgroup;
	//   38   73:astore_1        
		com.crashlytics.android.a.a(6, "LibriVox", "Error initializing adView");
	//   39   74:bipush          6
	//   40   76:ldc1            #120 <String "LibriVox">
	//   41   78:ldc1            #122 <String "Error initializing adView">
	//   42   80:invokestatic    #127 <Method void a.a(int, String, String)>
		com.crashlytics.android.a.a(((Throwable) (viewgroup)));
	//   43   83:aload_1         
	//   44   84:invokestatic    #130 <Method void a.a(Throwable)>
		return;
	//   45   87:return          
		viewgroup;
	//   46   88:astore_1        
		com.crashlytics.android.a.a(6, "LibriVox", "Out of memory initializing adView");
	//   47   89:bipush          6
	//   48   91:ldc1            #120 <String "LibriVox">
	//   49   93:ldc1            #132 <String "Out of memory initializing adView">
	//   50   95:invokestatic    #127 <Method void a.a(int, String, String)>
		com.crashlytics.android.a.a(((Throwable) (viewgroup)));
	//   51   98:aload_1         
	//   52   99:invokestatic    #130 <Method void a.a(Throwable)>
	//   53  102:return          
	}

	public String e()
	{
		if(PreferenceManager.getDefaultSharedPreferences(((Context) (this))).getBoolean("ads_disabled", true))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #29  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//*   2    4:ldc1            #134 <String "ads_disabled">
	//*   3    6:iconst_1        
	//*   4    7:invokeinterface #37  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*   5   12:ifeq            23
			return getString(dw.admob_banner_ad_id);
	//    6   15:aload_0         
	//    7   16:getstatic       #139 <Field int dw.admob_banner_ad_id>
	//    8   19:invokevirtual   #143 <Method String getString(int)>
	//    9   22:areturn         
		else
			return null;
	//   10   23:aconst_null     
	//   11   24:areturn         
	}

	public View j()
	{
		if(biz.bookdesign.librivox.h.a(this))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #150 <Method boolean biz.bookdesign.librivox.h.a(LibriVoxFreeApp)>
	//*   2    4:ifeq            30
		{
			b b1 = new b(((Context) (this)));
	//    3    7:new             #152 <Class b>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #153 <Method void b(Context)>
	//    7   15:astore_1        
			b1.setCompanionListener(((com.b.c.c.a) (new cl(this))));
	//    8   16:aload_1         
	//    9   17:new             #155 <Class cl>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #158 <Method void cl(LibriVoxFreeApp)>
	//   13   25:invokevirtual   #162 <Method void b.setCompanionListener(com.b.c.c.a)>
			return ((View) (b1));
	//   14   28:aload_1         
	//   15   29:areturn         
		} else
		{
			return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
		}
	}

	public bx k()
	{
		return ((bx) (new h(this)));
	//    0    0:new             #147 <Class h>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #165 <Method void h(LibriVoxFreeApp)>
	//    4    8:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #168 <Method void bw.onCreate()>
		if(e() != null)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #73  <Method String e()>
	//*   4    8:ifnull          25
			(new cm(getApplicationContext())).a();
	//    5   11:new             #170 <Class cm>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokevirtual   #174 <Method Context getApplicationContext()>
	//    9   19:invokespecial   #175 <Method void cm(Context)>
	//   10   22:invokevirtual   #177 <Method void biz.bookdesign.librivox.cm.a()>
		if(e() != null)
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #73  <Method String e()>
	//*  13   29:ifnull          43
			com.google.android.gms.ads.k.a(((Context) (this)), getString(dw.admob_app_id));
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getstatic       #180 <Field int dw.admob_app_id>
	//   17   37:invokevirtual   #143 <Method String getString(int)>
	//   18   40:invokestatic    #185 <Method void k.a(Context, String)>
	//   19   43:return          
	}

	private final Random a = new Random();
}
