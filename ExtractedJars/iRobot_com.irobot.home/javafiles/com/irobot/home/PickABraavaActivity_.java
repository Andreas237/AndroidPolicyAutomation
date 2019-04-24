// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.irobot.core.AssetInfo;
import com.irobot.core.ConnectionStateEvent;
import com.irobot.core.DiscoveredAsset;
import com.irobot.core.DiscoveryType;
import com.irobot.home.util.AssetSoftwareUpdateUtils_;
import org.androidannotations.api.a.e;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity, IRobotApplication_

public final class PickABraavaActivity_ extends PickABraavaActivity
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.a
	{

		public e a(int j)
		{
			if(e != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field Fragment e>
		//*   2    4:ifnull          22
				e.startActivityForResult(c, j);
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field Fragment e>
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field android.content.Intent c>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #31  <Method void Fragment.startActivityForResult(android.content.Intent, int)>
			else
		//*   9   19:goto            95
			if(d != null)
		//*  10   22:aload_0         
		//*  11   23:getfield        #33  <Field android.app.Fragment d>
		//*  12   26:ifnull          48
				d.startActivityForResult(c, j, a);
		//   13   29:aload_0         
		//   14   30:getfield        #33  <Field android.app.Fragment d>
		//   15   33:aload_0         
		//   16   34:getfield        #25  <Field android.content.Intent c>
		//   17   37:iload_1         
		//   18   38:aload_0         
		//   19   39:getfield        #36  <Field Bundle a>
		//   20   42:invokevirtual   #41  <Method void android.app.Fragment.startActivityForResult(android.content.Intent, int, Bundle)>
			else
		//*  21   45:goto            95
			if(b instanceof Activity)
		//*  22   48:aload_0         
		//*  23   49:getfield        #45  <Field Context b>
		//*  24   52:instanceof      #47  <Class Activity>
		//*  25   55:ifeq            80
				ActivityCompat.startActivityForResult((Activity)b, c, j, a);
		//   26   58:aload_0         
		//   27   59:getfield        #45  <Field Context b>
		//   28   62:checkcast       #47  <Class Activity>
		//   29   65:aload_0         
		//   30   66:getfield        #25  <Field android.content.Intent c>
		//   31   69:iload_1         
		//   32   70:aload_0         
		//   33   71:getfield        #36  <Field Bundle a>
		//   34   74:invokestatic    #52  <Method void ActivityCompat.startActivityForResult(Activity, android.content.Intent, int, Bundle)>
			else
		//*  35   77:goto            95
				b.startActivity(c, a);
		//   36   80:aload_0         
		//   37   81:getfield        #45  <Field Context b>
		//   38   84:aload_0         
		//   39   85:getfield        #25  <Field android.content.Intent c>
		//   40   88:aload_0         
		//   41   89:getfield        #36  <Field Bundle a>
		//   42   92:invokevirtual   #58  <Method void Context.startActivity(android.content.Intent, Bundle)>
			return new e(b);
		//   43   95:new             #60  <Class e>
		//   44   98:dup             
		//   45   99:aload_0         
		//   46  100:getfield        #45  <Field Context b>
		//   47  103:invokespecial   #62  <Method void e(Context)>
		//   48  106:areturn         
		}

		private android.app.Fragment d;
		private Fragment e;

		public a(Context context)
		{
			super(context, com/irobot/home/PickABraavaActivity_);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class PickABraavaActivity_>
		//    3    4:invokespecial   #17  <Method void org.androidannotations.api.a.a(Context, Class)>
		//    4    7:return          
		}
	}


	public PickABraavaActivity_()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void PickABraavaActivity()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void c()>
	//    6   12:putfield        #48  <Field c i>
	//    7   15:return          
	}

	public static a a(Context context)
	{
		return new a(context);
	//    0    0:new             #36  <Class PickABraavaActivity_$a>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #53  <Method void PickABraavaActivity_$a(Context)>
	//    4    8:areturn         
	}

	private void a(Bundle bundle)
	{
		org.androidannotations.api.c.c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method void c.a(b)>
		c = IRobotApplication_.r();
	//    2    4:aload_0         
	//    3    5:invokestatic    #63  <Method IRobotApplication IRobotApplication_.r()>
	//    4    8:putfield        #67  <Field IRobotApplication c>
		d = ((com.irobot.home.util.AssetSoftwareUpdateUtils) (AssetSoftwareUpdateUtils_.a(((Context) (this)))));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokestatic    #72  <Method AssetSoftwareUpdateUtils_ AssetSoftwareUpdateUtils_.a(Context)>
	//    8   16:putfield        #76  <Field com.irobot.home.util.AssetSoftwareUpdateUtils d>
	//    9   19:return          
	}

	static void a(PickABraavaActivity_ pickabraavaactivity_)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).com.irobot.home.PickABraavaActivity.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void com.irobot.home.PickABraavaActivity.b()>
	//    2    4:return          
	}

	static void a(PickABraavaActivity_ pickabraavaactivity_, int j, String s, boolean flag, boolean flag1, com.irobot.home.g.a.a a1, String s1)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).com.irobot.home.PickABraavaActivity.a(j, s, flag, flag1, a1, s1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #84  <Method void com.irobot.home.PickABraavaActivity.a(int, String, boolean, boolean, com.irobot.home.g.a$a, String)>
	//    8   13:return          
	}

	static void a(PickABraavaActivity_ pickabraavaactivity_, AssetInfo assetinfo)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).com.irobot.home.PickABraavaActivity.a(assetinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #88  <Method void com.irobot.home.PickABraavaActivity.a(AssetInfo)>
	//    3    5:return          
	}

	static void a(PickABraavaActivity_ pickabraavaactivity_, ConnectionStateEvent connectionstateevent)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).PickABraavaActivity.onConnectionStateEvent(connectionstateevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #93  <Method void PickABraavaActivity.onConnectionStateEvent(ConnectionStateEvent)>
	//    3    5:return          
	}

	static void a(PickABraavaActivity_ pickabraavaactivity_, DiscoveryType discoverytype)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).com.irobot.home.PickABraavaActivity.a(discoverytype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #97  <Method void com.irobot.home.PickABraavaActivity.a(DiscoveryType)>
	//    3    5:return          
	}

	static void a(PickABraavaActivity_ pickabraavaactivity_, DiscoveryType discoverytype, DiscoveredAsset discoveredasset)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).com.irobot.home.PickABraavaActivity.a(discoverytype, discoveredasset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #101 <Method void com.irobot.home.PickABraavaActivity.a(DiscoveryType, DiscoveredAsset)>
	//    4    6:return          
	}

	static void a(PickABraavaActivity_ pickabraavaactivity_, String s)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).com.irobot.home.PickABraavaActivity.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #105 <Method void com.irobot.home.PickABraavaActivity.b(String)>
	//    3    5:return          
	}

	static void b(PickABraavaActivity_ pickabraavaactivity_)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).com.irobot.home.PickABraavaActivity.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #107 <Method void com.irobot.home.PickABraavaActivity.c()>
	//    2    4:return          
	}

	static void b(PickABraavaActivity_ pickabraavaactivity_, String s)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).com.irobot.home.PickABraavaActivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #109 <Method void com.irobot.home.PickABraavaActivity.a(String)>
	//    3    5:return          
	}

	static void c(PickABraavaActivity_ pickabraavaactivity_)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).PickABraavaActivity.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void PickABraavaActivity.d()>
	//    2    4:return          
	}

	static void d(PickABraavaActivity_ pickabraavaactivity_)
	{
		((PickABraavaActivity) (pickabraavaactivity_)).PickABraavaActivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void PickABraavaActivity.g()>
	//    2    4:return          
	}

	public View a(int j)
	{
		return findViewById(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #118 <Method View findViewById(int)>
	//    3    5:areturn         
	}

	public void a(int j, String s, boolean flag, boolean flag1, com.irobot.home.g.a.a a1, String s1)
	{
		org.androidannotations.api.b.a("", new Runnable(j, s, flag, flag1, a1, s1) {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.a(g, a, b, c, d, e, f);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field PickABraavaActivity_ g>
			//    2    4:aload_0         
			//    3    5:getfield        #28  <Field int a>
			//    4    8:aload_0         
			//    5    9:getfield        #30  <Field String b>
			//    6   12:aload_0         
			//    7   13:getfield        #32  <Field boolean c>
			//    8   16:aload_0         
			//    9   17:getfield        #34  <Field boolean d>
			//   10   20:aload_0         
			//   11   21:getfield        #36  <Field com.irobot.home.g.a$a e>
			//   12   24:aload_0         
			//   13   25:getfield        #38  <Field String f>
			//   14   28:invokestatic    #45  <Method void com.irobot.home.PickABraavaActivity_.a(PickABraavaActivity_, int, String, boolean, boolean, com.irobot.home.g.a$a, String)>
			//   15   31:return          
			}

			final int a;
			final String b;
			final boolean c;
			final boolean d;
			final com.irobot.home.g.a.a e;
			final String f;
			final PickABraavaActivity_ g;

			
			{
				g = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field PickABraavaActivity_ g>
				a = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #28  <Field int a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String b>
				c = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field boolean c>
				d = flag1;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #34  <Field boolean d>
				e = a1;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #36  <Field com.irobot.home.g.a$a e>
				f = s1;
			//   18   33:aload_0         
			//   19   34:aload           7
			//   20   36:putfield        #38  <Field String f>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #41  <Method void Object()>
			//   23   43:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #18  <Class PickABraavaActivity_$13>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:aload_2         
	//    6    9:iload_3         
	//    7   10:iload           4
	//    8   12:aload           5
	//    9   14:aload           6
	//   10   16:invokespecial   #124 <Method void PickABraavaActivity_$13(PickABraavaActivity_, int, String, boolean, boolean, com.irobot.home.g.a$a, String)>
	//   11   19:lconst_0        
	//   12   20:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//   13   23:return          
	}

	protected void a(AssetInfo assetinfo)
	{
		org.androidannotations.api.b.a("", new Runnable(assetinfo) {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field PickABraavaActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field AssetInfo a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.PickABraavaActivity_.a(PickABraavaActivity_, AssetInfo)>
			//    5   11:return          
			}

			final AssetInfo a;
			final PickABraavaActivity_ b;

			
			{
				b = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PickABraavaActivity_ b>
				a = assetinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field AssetInfo a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #24  <Class PickABraavaActivity_$4>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #131 <Method void PickABraavaActivity_$4(PickABraavaActivity_, AssetInfo)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(DiscoveryType discoverytype)
	{
		org.androidannotations.api.b.a("", new Runnable(discoverytype) {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field PickABraavaActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field DiscoveryType a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.PickABraavaActivity_.a(PickABraavaActivity_, DiscoveryType)>
			//    5   11:return          
			}

			final DiscoveryType a;
			final PickABraavaActivity_ b;

			
			{
				b = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PickABraavaActivity_ b>
				a = discoverytype;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field DiscoveryType a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #14  <Class PickABraavaActivity_$11>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #133 <Method void PickABraavaActivity_$11(PickABraavaActivity_, DiscoveryType)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void a(DiscoveryType discoverytype, DiscoveredAsset discoveredasset)
	{
		org.androidannotations.api.b.a("", new Runnable(discoverytype, discoveredasset) {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.a(c, a, b);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field PickABraavaActivity_ c>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field DiscoveryType a>
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field DiscoveredAsset b>
			//    6   12:invokestatic    #31  <Method void com.irobot.home.PickABraavaActivity_.a(PickABraavaActivity_, DiscoveryType, DiscoveredAsset)>
			//    7   15:return          
			}

			final DiscoveryType a;
			final DiscoveredAsset b;
			final PickABraavaActivity_ c;

			
			{
				c = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field PickABraavaActivity_ c>
				a = discoverytype;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field DiscoveryType a>
				b = discoveredasset;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field DiscoveredAsset b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #12  <Class PickABraavaActivity_$10>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokespecial   #135 <Method void PickABraavaActivity_$10(PickABraavaActivity_, DiscoveryType, DiscoveredAsset)>
	//    7   12:lconst_0        
	//    8   13:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    9   16:return          
	}

	public void a(String s)
	{
		org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new org.androidannotations.api.a.a("", 0L, "", s) {

			public void a()
			{
				try
				{
					com.irobot.home.PickABraavaActivity_.b(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field PickABraavaActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #18  <Field String a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.PickABraavaActivity_.b(PickABraavaActivity_, String)>
					return;
			//    5   11:return          
				}
				catch(Throwable throwable)
			//*   6   12:astore_1        
				{
					Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
			//    7   13:invokestatic    #34  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
			//    8   16:invokestatic    #38  <Method Thread Thread.currentThread()>
			//    9   19:aload_1         
			//   10   20:invokeinterface #44  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
				}
			//   11   25:return          
			}

			final String a;
			final PickABraavaActivity_ b;

			
			{
				b = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PickABraavaActivity_ b>
				a = s2;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #18  <Field String a>
				super(s, l, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #21  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
		}
)));
	//    0    0:new             #26  <Class PickABraavaActivity_$5>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #122 <String "">
	//    4    7:lconst_0        
	//    5    8:ldc1            #122 <String "">
	//    6   10:aload_1         
	//    7   11:invokespecial   #138 <Method void PickABraavaActivity_$5(PickABraavaActivity_, String, long, String, String)>
	//    8   14:invokestatic    #143 <Method void org.androidannotations.api.a.a(org.androidannotations.api.a$a)>
	//    9   17:return          
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		e = a1.a(0x7f090466);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #145 <Int 0x7f090466>
	//    3    4:invokeinterface #147 <Method View a.a(int)>
	//    4    9:putfield        #151 <Field View e>
		f = (Button)a1.a(0x7f090324);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:ldc1            #152 <Int 0x7f090324>
	//    8   16:invokeinterface #147 <Method View a.a(int)>
	//    9   21:checkcast       #154 <Class Button>
	//   10   24:putfield        #158 <Field Button f>
		g = (FrameLayout)a1.a(0x7f090223);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:ldc1            #159 <Int 0x7f090223>
	//   14   31:invokeinterface #147 <Method View a.a(int)>
	//   15   36:checkcast       #161 <Class FrameLayout>
	//   16   39:putfield        #164 <Field FrameLayout g>
		if(f != null)
	//*  17   42:aload_0         
	//*  18   43:getfield        #158 <Field Button f>
	//*  19   46:ifnull          64
			f.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.e();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PickABraavaActivity_ a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.PickABraavaActivity_.e()>
				//    3    7:return          
				}

				final PickABraavaActivity_ a;

			
			{
				a = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PickABraavaActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   20   49:aload_0         
	//   21   50:getfield        #158 <Field Button f>
	//   22   53:new             #10  <Class PickABraavaActivity_$1>
	//   23   56:dup             
	//   24   57:aload_0         
	//   25   58:invokespecial   #166 <Method void PickABraavaActivity_$1(PickABraavaActivity_)>
	//   26   61:invokevirtual   #170 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		if(e != null)
	//*  27   64:aload_0         
	//*  28   65:getfield        #151 <Field View e>
	//*  29   68:ifnull          86
			e.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.f();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PickABraavaActivity_ a>
				//    2    4:invokevirtual   #25  <Method void PickABraavaActivity_.f()>
				//    3    7:return          
				}

				final PickABraavaActivity_ a;

			
			{
				a = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PickABraavaActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   30   71:aload_0         
	//   31   72:getfield        #151 <Field View e>
	//   32   75:new             #28  <Class PickABraavaActivity_$6>
	//   33   78:dup             
	//   34   79:aload_0         
	//   35   80:invokespecial   #171 <Method void PickABraavaActivity_$6(PickABraavaActivity_)>
	//   36   83:invokevirtual   #174 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		a();
	//   37   86:aload_0         
	//   38   87:invokevirtual   #176 <Method void a()>
	//   39   90:return          
	}

	protected void b()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PickABraavaActivity_ a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.PickABraavaActivity_.a(PickABraavaActivity_)>
			//    3    7:return          
			}

			final PickABraavaActivity_ a;

			
			{
				a = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PickABraavaActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #30  <Class PickABraavaActivity_$7>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #177 <Method void PickABraavaActivity_$7(PickABraavaActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void b(String s)
	{
		org.androidannotations.api.b.a("", new Runnable(s) {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field PickABraavaActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #20  <Field String a>
			//    4    8:invokestatic    #27  <Method void com.irobot.home.PickABraavaActivity_.a(PickABraavaActivity_, String)>
			//    5   11:return          
			}

			final String a;
			final PickABraavaActivity_ b;

			
			{
				b = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field PickABraavaActivity_ b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #22  <Class PickABraavaActivity_$3>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #179 <Method void PickABraavaActivity_$3(PickABraavaActivity_, String)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	protected void c()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.b(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PickABraavaActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.PickABraavaActivity_.b(PickABraavaActivity_)>
			//    3    7:return          
			}

			final PickABraavaActivity_ a;

			
			{
				a = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PickABraavaActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #32  <Class PickABraavaActivity_$8>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #180 <Method void PickABraavaActivity_$8(PickABraavaActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void d()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.c(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PickABraavaActivity_ a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.PickABraavaActivity_.c(PickABraavaActivity_)>
			//    3    7:return          
			}

			final PickABraavaActivity_ a;

			
			{
				a = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PickABraavaActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #34  <Class PickABraavaActivity_$9>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #181 <Method void PickABraavaActivity_$9(PickABraavaActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	protected void g()
	{
		org.androidannotations.api.b.a("", new Runnable() {

			public void run()
			{
				PickABraavaActivity_.d(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field PickABraavaActivity_ a>
			//    2    4:invokestatic    #24  <Method void PickABraavaActivity_.d(PickABraavaActivity_)>
			//    3    7:return          
			}

			final PickABraavaActivity_ a;

			
			{
				a = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PickABraavaActivity_ a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #16  <Class PickABraavaActivity_$12>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:invokespecial   #182 <Method void PickABraavaActivity_$12(PickABraavaActivity_)>
	//    5   10:lconst_0        
	//    6   11:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    7   14:return          
	}

	public void onConnectionStateEvent(ConnectionStateEvent connectionstateevent)
	{
		org.androidannotations.api.b.a("", new Runnable(connectionstateevent) {

			public void run()
			{
				com.irobot.home.PickABraavaActivity_.a(b, a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field PickABraavaActivity_ b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field ConnectionStateEvent a>
			//    4    8:invokestatic    #28  <Method void com.irobot.home.PickABraavaActivity_.a(PickABraavaActivity_, ConnectionStateEvent)>
			//    5   11:return          
			}

			final ConnectionStateEvent a;
			final PickABraavaActivity_ b;

			
			{
				b = PickABraavaActivity_.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PickABraavaActivity_ b>
				a = connectionstateevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ConnectionStateEvent a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, 0L);
	//    0    0:ldc1            #122 <String "">
	//    1    2:new             #20  <Class PickABraavaActivity_$2>
	//    2    5:dup             
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokespecial   #185 <Method void PickABraavaActivity_$2(PickABraavaActivity_, ConnectionStateEvent)>
	//    6   11:lconst_0        
	//    7   12:invokestatic    #129 <Method void org.androidannotations.api.b.a(String, Runnable, long)>
	//    8   15:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = org.androidannotations.api.c.c.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field c i>
	//    2    4:invokestatic    #190 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #192 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #194 <Method void PickABraavaActivity.onCreate(Bundle)>
		org.androidannotations.api.c.c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #190 <Method c c.a(c)>
	//   12   22:pop             
		setContentView(0x7f0b0060);
	//   13   23:aload_0         
	//   14   24:ldc1            #195 <Int 0x7f0b0060>
	//   15   26:invokevirtual   #199 <Method void setContentView(int)>
	//   16   29:return          
	}

	public void setContentView(int j)
	{
		super.setContentView(j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #200 <Method void PickABraavaActivity.setContentView(int)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #202 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #205 <Method void PickABraavaActivity.setContentView(View)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field c i>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #202 <Method void c.a(a)>
	//    7   13:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #208 <Method void PickABraavaActivity.setContentView(View, android.view.ViewGroup$LayoutParams)>
		i.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field c i>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #202 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c i = new c();
}
