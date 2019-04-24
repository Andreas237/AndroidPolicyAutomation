// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.*;
import android.widget.ImageButton;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.fragments.SoftwareUpdateAvailableFragment;
import com.irobot.home.fragments.SoftwareUpdateAvailableFragment_;
import com.irobot.home.fragments.SoftwareUpdateCheckFragment;
import com.irobot.home.fragments.ce;
import com.irobot.home.fragments.cf;
import com.irobot.home.fragments.cg;
import com.irobot.home.fragments.ch;
import com.irobot.home.fragments.ci;
import com.irobot.home.fragments.ck;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.v;
import com.irobot.home.util.w;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, CustomerRegistrationActivity_, IRobotApplication

public class OnDemandOtaActivity extends BaseFragmentActivity
	implements com.irobot.home.fragments.SoftwareUpdateAvailableFragment.a, com.irobot.home.fragments.SoftwareUpdateCheckFragment.a, com.irobot.home.fragments.cf.a, com.irobot.home.fragments.ch.b, com.irobot.home.fragments.cj.a
{

	public OnDemandOtaActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void BaseFragmentActivity()>
		c = OnDemandOTAEntryType.RequestOnDemandOTA;
	//    2    4:aload_0         
	//    3    5:getstatic       #48  <Field OnDemandOTAEntryType OnDemandOTAEntryType.RequestOnDemandOTA>
	//    4    8:putfield        #50  <Field OnDemandOTAEntryType c>
		d = OnDemandOTAPathType.None;
	//    5   11:aload_0         
	//    6   12:getstatic       #55  <Field OnDemandOTAPathType OnDemandOTAPathType.None>
	//    7   15:putfield        #57  <Field OnDemandOTAPathType d>
		e = OnDemandOTAStatus.None;
	//    8   18:aload_0         
	//    9   19:getstatic       #61  <Field OnDemandOTAStatus OnDemandOTAStatus.None>
	//   10   22:putfield        #63  <Field OnDemandOTAStatus e>
		f = false;
	//   11   25:aload_0         
	//   12   26:iconst_0        
	//   13   27:putfield        #65  <Field boolean f>
		i = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #67  <Field Fragment i>
		j = null;
	//   17   35:aload_0         
	//   18   36:aconst_null     
	//   19   37:putfield        #69  <Field String j>
		k = ((v) (w.a(((android.content.Context) (this)))));
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:invokestatic    #74  <Method w w.a(android.content.Context)>
	//   23   45:putfield        #76  <Field v k>
	//   24   48:return          
	}

	static Fragment a(OnDemandOtaActivity ondemandotaactivity)
	{
		return ondemandotaactivity.i;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Fragment i>
	//    2    4:areturn         
	}

	static Fragment a(OnDemandOtaActivity ondemandotaactivity, Fragment fragment)
	{
		ondemandotaactivity.i = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #67  <Field Fragment i>
		return fragment;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static String a(OnDemandOtaActivity ondemandotaactivity, String s)
	{
		ondemandotaactivity.j = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field String j>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(Fragment fragment, String s)
	{
		if(!isFinishing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #85  <Method boolean isFinishing()>
	//*   2    4:ifne            39
		{
			if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #88  <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			(new Handler(Looper.getMainLooper())).post(new Runnable(fragment, s) {

				public void run()
				{
					if(a != null && !a.equals(((Object) (com.irobot.home.OnDemandOtaActivity.a(c)))))
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field Fragment a>
				//*   2    4:ifnull          170
				//*   3    7:aload_0         
				//*   4    8:getfield        #22  <Field Fragment a>
				//*   5   11:aload_0         
				//*   6   12:getfield        #20  <Field OnDemandOtaActivity c>
				//*   7   15:invokestatic    #32  <Method Fragment com.irobot.home.OnDemandOtaActivity.a(OnDemandOtaActivity)>
				//*   8   18:invokevirtual   #38  <Method boolean Fragment.equals(Object)>
				//*   9   21:ifne            170
					{
						com.irobot.home.OnDemandOtaActivity.a(c, a);
				//   10   24:aload_0         
				//   11   25:getfield        #20  <Field OnDemandOtaActivity c>
				//   12   28:aload_0         
				//   13   29:getfield        #22  <Field Fragment a>
				//   14   32:invokestatic    #41  <Method Fragment com.irobot.home.OnDemandOtaActivity.a(OnDemandOtaActivity, Fragment)>
				//   15   35:pop             
						Object obj = ((Object) (c.getSupportFragmentManager().beginTransaction()));
				//   16   36:aload_0         
				//   17   37:getfield        #20  <Field OnDemandOtaActivity c>
				//   18   40:invokevirtual   #45  <Method FragmentManager OnDemandOtaActivity.getSupportFragmentManager()>
				//   19   43:invokevirtual   #51  <Method FragmentTransaction FragmentManager.beginTransaction()>
				//   20   46:astore          4
						((FragmentTransaction) (obj)).replace(0x7f09022f, a);
				//   21   48:aload           4
				//   22   50:ldc1            #52  <Int 0x7f09022f>
				//   23   52:aload_0         
				//   24   53:getfield        #22  <Field Fragment a>
				//   25   56:invokevirtual   #58  <Method FragmentTransaction FragmentTransaction.replace(int, Fragment)>
				//   26   59:pop             
						((FragmentTransaction) (obj)).commitNow();
				//   27   60:aload           4
				//   28   62:invokevirtual   #61  <Method void FragmentTransaction.commitNow()>
						com.irobot.home.OnDemandOtaActivity.a(c, b);
				//   29   65:aload_0         
				//   30   66:getfield        #20  <Field OnDemandOtaActivity c>
				//   31   69:aload_0         
				//   32   70:getfield        #24  <Field String b>
				//   33   73:invokestatic    #64  <Method String com.irobot.home.OnDemandOtaActivity.a(OnDemandOtaActivity, String)>
				//   34   76:pop             
						c.g.setText(((CharSequence) (b)));
				//   35   77:aload_0         
				//   36   78:getfield        #20  <Field OnDemandOtaActivity c>
				//   37   81:getfield        #68  <Field TextView OnDemandOtaActivity.g>
				//   38   84:aload_0         
				//   39   85:getfield        #24  <Field String b>
				//   40   88:invokevirtual   #74  <Method void TextView.setText(CharSequence)>
						boolean flag2 = com.irobot.home.OnDemandOtaActivity.a(c) instanceof SoftwareUpdateAvailableFragment;
				//   41   91:aload_0         
				//   42   92:getfield        #20  <Field OnDemandOtaActivity c>
				//   43   95:invokestatic    #32  <Method Fragment com.irobot.home.OnDemandOtaActivity.a(OnDemandOtaActivity)>
				//   44   98:instanceof      #76  <Class SoftwareUpdateAvailableFragment>
				//   45  101:istore_3        
						boolean flag1 = false;
				//   46  102:iconst_0        
				//   47  103:istore_2        
						boolean flag;
						if(!flag2 && !(com.irobot.home.OnDemandOtaActivity.a(c) instanceof ch) && !(com.irobot.home.OnDemandOtaActivity.a(c) instanceof cf))
				//*  48  104:iload_3         
				//*  49  105:ifne            142
				//*  50  108:aload_0         
				//*  51  109:getfield        #20  <Field OnDemandOtaActivity c>
				//*  52  112:invokestatic    #32  <Method Fragment com.irobot.home.OnDemandOtaActivity.a(OnDemandOtaActivity)>
				//*  53  115:instanceof      #78  <Class ch>
				//*  54  118:ifne            142
				//*  55  121:aload_0         
				//*  56  122:getfield        #20  <Field OnDemandOtaActivity c>
				//*  57  125:invokestatic    #32  <Method Fragment com.irobot.home.OnDemandOtaActivity.a(OnDemandOtaActivity)>
				//*  58  128:instanceof      #80  <Class cf>
				//*  59  131:ifeq            137
				//*  60  134:goto            142
							flag = false;
				//   61  137:iconst_0        
				//   62  138:istore_1        
						else
				//*  63  139:goto            144
							flag = true;
				//   64  142:iconst_1        
				//   65  143:istore_1        
						obj = ((Object) (c.h));
				//   66  144:aload_0         
				//   67  145:getfield        #20  <Field OnDemandOtaActivity c>
				//   68  148:getfield        #84  <Field ImageButton OnDemandOtaActivity.h>
				//   69  151:astore          4
						byte byte0;
						if(flag)
				//*  70  153:iload_1         
				//*  71  154:ifeq            162
							byte0 = ((byte) (flag1));
				//   72  157:iload_2         
				//   73  158:istore_1        
						else
				//*  74  159:goto            164
							byte0 = 4;
				//   75  162:iconst_4        
				//   76  163:istore_1        
						((ImageButton) (obj)).setVisibility(((int) (byte0)));
				//   77  164:aload           4
				//   78  166:iload_1         
				//   79  167:invokevirtual   #90  <Method void ImageButton.setVisibility(int)>
					}
				//   80  170:return          
				}

				final Fragment a;
				final String b;
				final OnDemandOtaActivity c;

			
			{
				c = OnDemandOtaActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field OnDemandOtaActivity c>
				a = fragment;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Fragment a>
				b = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field String b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    7   15:new             #90  <Class Handler>
	//    8   18:dup             
	//    9   19:invokestatic    #96  <Method Looper Looper.getMainLooper()>
	//   10   22:invokespecial   #99  <Method void Handler(Looper)>
	//   11   25:new             #16  <Class OnDemandOtaActivity$1>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:invokespecial   #102 <Method void OnDemandOtaActivity$1(OnDemandOtaActivity, Fragment, String)>
	//   17   35:invokevirtual   #106 <Method boolean Handler.post(Runnable)>
	//   18   38:pop             
		}
	//   19   39:return          
	}

	private void a(OnDemandOTAEntryType ondemandotaentrytype)
	{
		a(((Fragment) (ci.f().a(b).a(ondemandotaentrytype).a(d).a())), getString(0x7f0f085e));
	//    0    0:aload_0         
	//    1    1:invokestatic    #112 <Method com.irobot.home.fragments.ci$a ci.f()>
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field String b>
	//    4    8:invokevirtual   #119 <Method com.irobot.home.fragments.ci$a com.irobot.home.fragments.ci$a.a(String)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #122 <Method com.irobot.home.fragments.ci$a com.irobot.home.fragments.ci$a.a(OnDemandOTAEntryType)>
	//    7   15:aload_0         
	//    8   16:getfield        #57  <Field OnDemandOTAPathType d>
	//    9   19:invokevirtual   #125 <Method com.irobot.home.fragments.ci$a com.irobot.home.fragments.ci$a.a(OnDemandOTAPathType)>
	//   10   22:invokevirtual   #128 <Method ch com.irobot.home.fragments.ci$a.a()>
	//   11   25:aload_0         
	//   12   26:ldc1            #129 <Int 0x7f0f085e>
	//   13   28:invokevirtual   #133 <Method String getString(int)>
	//   14   31:invokespecial   #135 <Method void a(Fragment, String)>
	//   15   34:return          
	}

	private void l()
	{
		if(d == OnDemandOTAPathType.Provisioning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field OnDemandOTAPathType d>
	//*   2    4:getstatic       #139 <Field OnDemandOTAPathType OnDemandOTAPathType.Provisioning>
	//*   3    7:if_acmpne       47
		{
			com.irobot.home.CustomerRegistrationActivity_.a(((android.content.Context) (this))).a(b).a();
	//    4   10:aload_0         
	//    5   11:invokestatic    #144 <Method CustomerRegistrationActivity_$a com.irobot.home.CustomerRegistrationActivity_.a(android.content.Context)>
	//    6   14:aload_0         
	//    7   15:getfield        #114 <Field String b>
	//    8   18:invokevirtual   #149 <Method CustomerRegistrationActivity_$a com.irobot.home.CustomerRegistrationActivity_$a.a(String)>
	//    9   21:invokevirtual   #152 <Method org.androidannotations.api.a.e com.irobot.home.CustomerRegistrationActivity_$a.a()>
	//   10   24:pop             
			AssetInfo assetinfo = com.irobot.home.util.j.a(b).a();
	//   11   25:aload_0         
	//   12   26:getfield        #114 <Field String b>
	//   13   29:invokestatic    #157 <Method a j.a(String)>
	//   14   32:invokevirtual   #162 <Method AssetInfo a.a()>
	//   15   35:astore_1        
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.OnDemandOtaSetupComplete, assetinfo);
	//   16   36:invokestatic    #168 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   17   39:getstatic       #174 <Field ViewId ViewId.OnDemandOtaSetupComplete>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #178 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
			return;
	//   20   46:return          
		} else
		{
			com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//   21   47:aload_0         
	//   22   48:invokestatic    #181 <Method void j.a(android.app.Activity)>
			return;
	//   23   51:return          
		}
	}

	private void m()
	{
		a(((Fragment) (ce.a().a(b).a())), getString(0x7f0f019b));
	//    0    0:aload_0         
	//    1    1:invokestatic    #187 <Method com.irobot.home.fragments.ce$a ce.a()>
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field String b>
	//    4    8:invokevirtual   #192 <Method com.irobot.home.fragments.ce$a com.irobot.home.fragments.ce$a.a(String)>
	//    5   11:invokevirtual   #195 <Method SoftwareUpdateCheckFragment com.irobot.home.fragments.ce$a.a()>
	//    6   14:aload_0         
	//    7   15:ldc1            #196 <Int 0x7f0f019b>
	//    8   17:invokevirtual   #133 <Method String getString(int)>
	//    9   20:invokespecial   #135 <Method void a(Fragment, String)>
	//   10   23:return          
	}

	public void a(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            55
		{
			a(((Fragment) (SoftwareUpdateAvailableFragment_.d().a(b).a(d).a())), getString(0x7f0f04cd, new Object[] {
				com.irobot.home.util.j.a(b).a().getName()
			}));
	//    2    4:aload_0         
	//    3    5:invokestatic    #202 <Method com.irobot.home.fragments.SoftwareUpdateAvailableFragment_$a SoftwareUpdateAvailableFragment_.d()>
	//    4    8:aload_0         
	//    5    9:getfield        #114 <Field String b>
	//    6   12:invokevirtual   #207 <Method com.irobot.home.fragments.SoftwareUpdateAvailableFragment_$a com.irobot.home.fragments.SoftwareUpdateAvailableFragment_$a.a(String)>
	//    7   15:aload_0         
	//    8   16:getfield        #57  <Field OnDemandOTAPathType d>
	//    9   19:invokevirtual   #210 <Method com.irobot.home.fragments.SoftwareUpdateAvailableFragment_$a com.irobot.home.fragments.SoftwareUpdateAvailableFragment_$a.a(OnDemandOTAPathType)>
	//   10   22:invokevirtual   #213 <Method SoftwareUpdateAvailableFragment com.irobot.home.fragments.SoftwareUpdateAvailableFragment_$a.a()>
	//   11   25:aload_0         
	//   12   26:ldc1            #214 <Int 0x7f0f04cd>
	//   13   28:iconst_1        
	//   14   29:anewarray       Object[]
	//   15   32:dup             
	//   16   33:iconst_0        
	//   17   34:aload_0         
	//   18   35:getfield        #114 <Field String b>
	//   19   38:invokestatic    #157 <Method a j.a(String)>
	//   20   41:invokevirtual   #162 <Method AssetInfo a.a()>
	//   21   44:invokevirtual   #222 <Method String AssetInfo.getName()>
	//   22   47:aastore         
	//   23   48:invokevirtual   #225 <Method String getString(int, Object[])>
	//   24   51:invokespecial   #135 <Method void a(Fragment, String)>
			return;
	//   25   54:return          
		} else
		{
			l();
	//   26   55:aload_0         
	//   27   56:invokespecial   #227 <Method void l()>
			return;
	//   28   59:return          
		}
	}

	public void b(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            39
		{
			d = OnDemandOTAPathType.None;
	//    2    4:aload_0         
	//    3    5:getstatic       #55  <Field OnDemandOTAPathType OnDemandOTAPathType.None>
	//    4    8:putfield        #57  <Field OnDemandOTAPathType d>
			try
			{
				if(i != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #67  <Field Fragment i>
	//*   7   15:ifnull          39
				{
					FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #233 <Method FragmentManager getSupportFragmentManager()>
	//   10   22:invokevirtual   #239 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   11   25:astore_2        
					fragmenttransaction.hide(i);
	//   12   26:aload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #67  <Field Fragment i>
	//   15   31:invokevirtual   #245 <Method FragmentTransaction FragmentTransaction.hide(Fragment)>
	//   16   34:pop             
					fragmenttransaction.commitNow();
	//   17   35:aload_2         
	//   18   36:invokevirtual   #248 <Method void FragmentTransaction.commitNow()>
				}
			}
	//*  19   39:aload_0         
	//*  20   40:invokespecial   #227 <Method void l()>
	//*  21   43:return          
			catch(Exception exception) { }
	//   22   44:astore_2        
		}
		l();
	//*  23   45:goto            39
	}

	protected void e()
	{
		static class _cls2
		{

			static final int a[];

			static 
			{
				a = new int[OnDemandOTAStatus.values().length];
			//    0    0:invokestatic    #18  <Method OnDemandOTAStatus[] OnDemandOTAStatus.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[OnDemandOTAStatus.InProgress.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field OnDemandOTAStatus OnDemandOTAStatus.InProgress>
			//    6   15:invokevirtual   #28  <Method int OnDemandOTAStatus.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field OnDemandOTAStatus OnDemandOTAStatus.ProcessError>
			//*  11   26:invokevirtual   #28  <Method int OnDemandOTAStatus.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field OnDemandOTAStatus OnDemandOTAStatus.Success>
			//*  16   37:invokevirtual   #28  <Method int OnDemandOTAStatus.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					a[OnDemandOTAStatus.ProcessError.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					a[OnDemandOTAStatus.Success.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(com.irobot.home._cls2.a[e.ordinal()])
	//*   0    0:getstatic       #251 <Field int[] com.irobot.home.OnDemandOtaActivity$2.a>
	//*   1    3:aload_0         
	//*   2    4:getfield        #63  <Field OnDemandOTAStatus e>
	//*   3    7:invokevirtual   #255 <Method int OnDemandOTAStatus.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 65
	//	               2 58
	//	               3 51
		default:
			if(f)
	//*   6   36:aload_0         
	//*   7   37:getfield        #65  <Field boolean f>
	//*   8   40:ifeq            76
			{
				a(true);
	//    9   43:aload_0         
	//   10   44:iconst_1        
	//   11   45:invokevirtual   #257 <Method void a(boolean)>
			} else
	//*  12   48:goto            97
	//*  13   51:aload_0         
	//*  14   52:invokevirtual   #259 <Method void h()>
	//*  15   55:goto            97
	//*  16   58:aload_0         
	//*  17   59:invokevirtual   #261 <Method void i()>
	//*  18   62:goto            97
	//*  19   65:aload_0         
	//*  20   66:aload_0         
	//*  21   67:getfield        #50  <Field OnDemandOTAEntryType c>
	//*  22   70:invokespecial   #263 <Method void a(OnDemandOTAEntryType)>
	//*  23   73:goto            97
			{
				a.h().b(com.irobot.home.util.j.a(b));
	//   24   76:aload_0         
	//   25   77:getfield        #265 <Field IRobotApplication a>
	//   26   80:invokevirtual   #270 <Method IRobotModel IRobotApplication.h()>
	//   27   83:aload_0         
	//   28   84:getfield        #114 <Field String b>
	//   29   87:invokestatic    #157 <Method a j.a(String)>
	//   30   90:invokevirtual   #275 <Method void IRobotModel.b(a)>
				m();
	//   31   93:aload_0         
	//   32   94:invokespecial   #277 <Method void m()>
			}
			break;

		case 3: // '\003'
			h();
			break;

		case 2: // '\002'
			i();
			break;

		case 1: // '\001'
			a(c);
			break;
		}
		k.a(com.irobot.home.util.j.a(b).a().getSku());
	//   33   97:aload_0         
	//   34   98:getfield        #76  <Field v k>
	//   35  101:aload_0         
	//   36  102:getfield        #114 <Field String b>
	//   37  105:invokestatic    #157 <Method a j.a(String)>
	//   38  108:invokevirtual   #162 <Method AssetInfo a.a()>
	//   39  111:invokevirtual   #280 <Method String AssetInfo.getSku()>
	//   40  114:invokevirtual   #285 <Method void v.a(String)>
	//   41  117:return          
	}

	public void f()
	{
		a(OnDemandOTAEntryType.RequestOnDemandOTA);
	//    0    0:aload_0         
	//    1    1:getstatic       #48  <Field OnDemandOTAEntryType OnDemandOTAEntryType.RequestOnDemandOTA>
	//    2    4:invokespecial   #263 <Method void a(OnDemandOTAEntryType)>
	//    3    7:return          
	}

	public void g()
	{
		b(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #287 <Method void b(boolean)>
	//    3    5:return          
	}

	public void h()
	{
		if(d == OnDemandOTAPathType.Provisioning)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field OnDemandOTAPathType d>
	//*   2    4:getstatic       #139 <Field OnDemandOTAPathType OnDemandOTAPathType.Provisioning>
	//*   3    7:if_acmpne       15
		{
			l();
	//    4   10:aload_0         
	//    5   11:invokespecial   #227 <Method void l()>
			return;
	//    6   14:return          
		} else
		{
			a(((Fragment) (ck.c().a(b).a())), getString(0x7f0f0853, new Object[] {
				com.irobot.home.util.j.a(b).a().getName()
			}));
	//    7   15:aload_0         
	//    8   16:invokestatic    #292 <Method com.irobot.home.fragments.ck$a ck.c()>
	//    9   19:aload_0         
	//   10   20:getfield        #114 <Field String b>
	//   11   23:invokevirtual   #297 <Method com.irobot.home.fragments.ck$a com.irobot.home.fragments.ck$a.a(String)>
	//   12   26:invokevirtual   #300 <Method com.irobot.home.fragments.cj com.irobot.home.fragments.ck$a.a()>
	//   13   29:aload_0         
	//   14   30:ldc2            #301 <Int 0x7f0f0853>
	//   15   33:iconst_1        
	//   16   34:anewarray       Object[]
	//   17   37:dup             
	//   18   38:iconst_0        
	//   19   39:aload_0         
	//   20   40:getfield        #114 <Field String b>
	//   21   43:invokestatic    #157 <Method a j.a(String)>
	//   22   46:invokevirtual   #162 <Method AssetInfo a.a()>
	//   23   49:invokevirtual   #222 <Method String AssetInfo.getName()>
	//   24   52:aastore         
	//   25   53:invokevirtual   #225 <Method String getString(int, Object[])>
	//   26   56:invokespecial   #135 <Method void a(Fragment, String)>
			return;
	//   27   59:return          
		}
	}

	public void i()
	{
		a(((Fragment) (cg.d().a(b).a())), getString(0x7f0f0856));
	//    0    0:aload_0         
	//    1    1:invokestatic    #306 <Method com.irobot.home.fragments.cg$a cg.d()>
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field String b>
	//    4    8:invokevirtual   #311 <Method com.irobot.home.fragments.cg$a com.irobot.home.fragments.cg$a.a(String)>
	//    5   11:invokevirtual   #314 <Method cf com.irobot.home.fragments.cg$a.a()>
	//    6   14:aload_0         
	//    7   15:ldc2            #315 <Int 0x7f0f0856>
	//    8   18:invokevirtual   #133 <Method String getString(int)>
	//    9   21:invokespecial   #135 <Method void a(Fragment, String)>
	//   10   24:return          
	}

	public void j()
	{
		l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #227 <Method void l()>
	//    2    4:return          
	}

	protected void k()
	{
		Object obj = ((Object) (com.irobot.home.util.j.a(b).a()));
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field String b>
	//    2    4:invokestatic    #157 <Method a j.a(String)>
	//    3    7:invokevirtual   #162 <Method AssetInfo a.a()>
	//    4   10:astore_1        
		if(i instanceof SoftwareUpdateAvailableFragment)
	//*   5   11:aload_0         
	//*   6   12:getfield        #67  <Field Fragment i>
	//*   7   15:instanceof      #317 <Class SoftwareUpdateAvailableFragment>
	//*   8   18:ifeq            31
			AnalyticsSubsystem.getInstance().trackOnDemandOtaAvailableHelpButtonPressed(((AssetInfo) (obj)));
	//    9   21:invokestatic    #168 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #321 <Method void AnalyticsSubsystem.trackOnDemandOtaAvailableHelpButtonPressed(AssetInfo)>
		else
	//*  12   28:goto            68
		if(i instanceof ch)
	//*  13   31:aload_0         
	//*  14   32:getfield        #67  <Field Fragment i>
	//*  15   35:instanceof      #323 <Class ch>
	//*  16   38:ifeq            51
			AnalyticsSubsystem.getInstance().trackOnDemandOtaInProgressHelpButtonPressed(((AssetInfo) (obj)));
	//   17   41:invokestatic    #168 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   18   44:aload_1         
	//   19   45:invokevirtual   #326 <Method void AnalyticsSubsystem.trackOnDemandOtaInProgressHelpButtonPressed(AssetInfo)>
		else
	//*  20   48:goto            68
		if(i instanceof cf)
	//*  21   51:aload_0         
	//*  22   52:getfield        #67  <Field Fragment i>
	//*  23   55:instanceof      #328 <Class cf>
	//*  24   58:ifeq            68
			AnalyticsSubsystem.getInstance().trackOnDemandOtaFailedHelpButtonPressed(((AssetInfo) (obj)));
	//   25   61:invokestatic    #168 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   26   64:aload_1         
	//   27   65:invokevirtual   #331 <Method void AnalyticsSubsystem.trackOnDemandOtaFailedHelpButtonPressed(AssetInfo)>
		if(i instanceof cf)
	//*  28   68:aload_0         
	//*  29   69:getfield        #67  <Field Fragment i>
	//*  30   72:instanceof      #328 <Class cf>
	//*  31   75:ifeq            85
			obj = "ota_somethingwrong";
	//   32   78:ldc2            #333 <String "ota_somethingwrong">
	//   33   81:astore_1        
		else
	//*  34   82:goto            89
			obj = "provisioning_ota";
	//   35   85:ldc2            #335 <String "provisioning_ota">
	//   36   88:astore_1        
		if(!k.a(((String) (obj)), 0x7f0f05d8))
	//*  37   89:aload_0         
	//*  38   90:getfield        #76  <Field v k>
	//*  39   93:aload_1         
	//*  40   94:ldc2            #336 <Int 0x7f0f05d8>
	//*  41   97:invokevirtual   #339 <Method boolean v.a(String, int)>
	//*  42  100:ifne            128
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f0960).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//   43  103:new             #341 <Class android.app.AlertDialog$Builder>
	//   44  106:dup             
	//   45  107:aload_0         
	//   46  108:invokespecial   #344 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   47  111:ldc2            #345 <Int 0x7f0f0960>
	//   48  114:invokevirtual   #349 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   49  117:ldc2            #350 <Int 0x7f0f05bb>
	//   50  120:aconst_null     
	//   51  121:invokevirtual   #354 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   52  124:invokevirtual   #358 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   53  127:pop             
	//   54  128:return          
	}

	public void onBackPressed()
	{
		boolean flag;
		if(!(i instanceof SoftwareUpdateCheckFragment) && !(i instanceof SoftwareUpdateAvailableFragment))
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field Fragment i>
	//*   2    4:instanceof      #361 <Class SoftwareUpdateCheckFragment>
	//*   3    7:ifne            28
	//*   4   10:aload_0         
	//*   5   11:getfield        #67  <Field Fragment i>
	//*   6   14:instanceof      #317 <Class SoftwareUpdateAvailableFragment>
	//*   7   17:ifeq            23
	//*   8   20:goto            28
			flag = false;
	//    9   23:iconst_0        
	//   10   24:istore_1        
		else
	//*  11   25:goto            30
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore_1        
		if(d != OnDemandOTAPathType.Provisioning && flag)
	//*  14   30:aload_0         
	//*  15   31:getfield        #57  <Field OnDemandOTAPathType d>
	//*  16   34:getstatic       #139 <Field OnDemandOTAPathType OnDemandOTAPathType.Provisioning>
	//*  17   37:if_acmpeq       48
	//*  18   40:iload_1         
	//*  19   41:ifeq            48
			super.onBackPressed();
	//   20   44:aload_0         
	//   21   45:invokespecial   #363 <Method void BaseFragmentActivity.onBackPressed()>
	//   22   48:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #366 <Method void BaseFragmentActivity.onResume()>
		a(i, j);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field Fragment i>
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field String j>
	//    7   13:invokespecial   #135 <Method void a(Fragment, String)>
	//    8   16:return          
	}

	IRobotApplication a;
	String b;
	OnDemandOTAEntryType c;
	OnDemandOTAPathType d;
	OnDemandOTAStatus e;
	boolean f;
	TextView g;
	ImageButton h;
	private Fragment i;
	private String j;
	private v k;
}
