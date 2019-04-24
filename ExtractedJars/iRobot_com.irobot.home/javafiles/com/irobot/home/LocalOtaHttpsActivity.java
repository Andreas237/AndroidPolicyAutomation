// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetSSID;
import com.irobot.core.SoftwareVersion;
import com.irobot.home.fragments.bp;
import com.irobot.home.fragments.bt;
import com.irobot.home.fragments.bz;
import com.irobot.home.fragments.ca;
import com.irobot.home.fragments.cb;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.NetworkSettings;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotSystem;
import com.irobot.home.model.WifiConfig;
import com.irobot.home.model.a;
import com.irobot.home.model.w;
import com.irobot.home.util.i;
import com.irobot.home.util.j;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home:
//			WizardFragmentActivity, IRobotApplication, BroadcastSetupActivity_, RobotCleanActivity_

public class LocalOtaHttpsActivity extends WizardFragmentActivity
{

	public LocalOtaHttpsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void WizardFragmentActivity()>
	//    2    4:return          
	}

	static void a(LocalOtaHttpsActivity localotahttpsactivity)
	{
		localotahttpsactivity.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void g()>
	//    2    4:return          
	}

	private void b(String s1, String s2)
	{
		Object obj = ((Object) (l.h().c()));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field IRobotApplication l>
	//    2    4:invokevirtual   #34  <Method IRobotModel IRobotApplication.h()>
	//    3    7:invokevirtual   #40  <Method a IRobotModel.c()>
	//    4   10:astore_3        
		if(obj != null && AssetCapabilityUtils.isCloudCapable(((a) (obj)).a()))
	//*   5   11:aload_3         
	//*   6   12:ifnull          46
	//*   7   15:aload_3         
	//*   8   16:invokevirtual   #45  <Method AssetInfo a.a()>
	//*   9   19:invokestatic    #51  <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  10   22:ifeq            46
		{
			obj = ((Object) (((w)obj).c().d()));
	//   11   25:aload_3         
	//   12   26:checkcast       #53  <Class w>
	//   13   29:invokevirtual   #56  <Method Robot w.c()>
	//   14   32:invokevirtual   #62  <Method NetworkSettings Robot.d()>
	//   15   35:astore_3        
			((NetworkSettings) (obj)).a(s2);
	//   16   36:aload_3         
	//   17   37:aload_2         
	//   18   38:invokevirtual   #67  <Method void NetworkSettings.a(String)>
			((NetworkSettings) (obj)).b(s1);
	//   19   41:aload_3         
	//   20   42:aload_1         
	//   21   43:invokevirtual   #69  <Method void NetworkSettings.b(String)>
		}
	//   22   46:return          
	}

	static boolean b(LocalOtaHttpsActivity localotahttpsactivity)
	{
		return localotahttpsactivity.a;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean a>
	//    2    4:ireturn         
	}

	static void c(LocalOtaHttpsActivity localotahttpsactivity)
	{
		localotahttpsactivity.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void h()>
	//    2    4:return          
	}

	private void c(String s1, String s2)
	{
		if(a && !s1.contains(((CharSequence) (s2))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean a>
	//*   2    4:ifeq            31
	//*   3    7:aload_1         
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #80  <Method boolean String.contains(CharSequence)>
	//*   6   12:ifne            31
		{
			a = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #72  <Field boolean a>
			H = new Robot();
	//   10   20:aload_0         
	//   11   21:new             #58  <Class Robot>
	//   12   24:dup             
	//   13   25:invokespecial   #81  <Method void Robot()>
	//   14   28:putfield        #85  <Field Robot H>
		}
	//   15   31:return          
	}

	private void g()
	{
		Intent intent = new Intent(((Context) (this)), com/irobot/home/BroadcastSetupActivity_);
	//    0    0:new             #87  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #89  <Class BroadcastSetupActivity_>
	//    4    7:invokespecial   #92  <Method void Intent(Context, Class)>
	//    5   10:astore_1        
		intent.putExtra("newRobotConfig", true);
	//    6   11:aload_1         
	//    7   12:ldc1            #94  <String "newRobotConfig">
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #98  <Method Intent Intent.putExtra(String, boolean)>
	//   10   18:pop             
		intent.putExtra("argRobotBlid", H.r());
	//   11   19:aload_1         
	//   12   20:ldc1            #100 <String "argRobotBlid">
	//   13   22:aload_0         
	//   14   23:getfield        #85  <Field Robot H>
	//   15   26:invokevirtual   #104 <Method String Robot.r()>
	//   16   29:invokevirtual   #107 <Method Intent Intent.putExtra(String, String)>
	//   17   32:pop             
		intent.addFlags(0x4000000);
	//   18   33:aload_1         
	//   19   34:ldc1            #108 <Int 0x4000000>
	//   20   36:invokevirtual   #112 <Method Intent Intent.addFlags(int)>
	//   21   39:pop             
		startActivity(intent);
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:invokevirtual   #116 <Method void startActivity(Intent)>
		finish();
	//   25   45:aload_0         
	//   26   46:invokevirtual   #119 <Method void finish()>
	//   27   49:return          
	}

	private void h()
	{
		com.irobot.home.RobotCleanActivity_.a(((Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #124 <Method RobotCleanActivity_$a com.irobot.home.RobotCleanActivity_.a(Context)>
	//    2    4:invokevirtual   #129 <Method org.androidannotations.api.a.e com.irobot.home.RobotCleanActivity_$a.a()>
	//    3    7:pop             
		finish();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #119 <Method void finish()>
	//    6   12:return          
	}

	private Fragment j()
	{
		a(0, 8, 0x7f0f00c5, 0x7f0800c8);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:bipush          8
	//    3    4:ldc1            #132 <Int 0x7f0f00c5>
	//    4    6:ldc1            #133 <Int 0x7f0800c8>
	//    5    8:invokevirtual   #136 <Method void a(int, int, int, int)>
		return ((Fragment) (bz.b().a()));
	//    6   11:invokestatic    #141 <Method com.irobot.home.fragments.bz$a bz.b()>
	//    7   14:invokevirtual   #146 <Method com.irobot.home.fragments.by com.irobot.home.fragments.bz$a.a()>
	//    8   17:areturn         
	}

	private Fragment k()
	{
		a(0, 8);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:bipush          8
	//    3    4:invokevirtual   #150 <Method void a(int, int)>
		return ((Fragment) (bp.b().a(H.i()).a(0x7f0f005c).a()));
	//    4    7:invokestatic    #155 <Method com.irobot.home.fragments.bp$a bp.b()>
	//    5   10:aload_0         
	//    6   11:getfield        #85  <Field Robot H>
	//    7   14:invokevirtual   #158 <Method String Robot.i()>
	//    8   17:invokevirtual   #163 <Method com.irobot.home.fragments.bp$a com.irobot.home.fragments.bp$a.a(String)>
	//    9   20:ldc1            #164 <Int 0x7f0f005c>
	//   10   22:invokevirtual   #167 <Method com.irobot.home.fragments.bp$a com.irobot.home.fragments.bp$a.a(int)>
	//   11   25:invokevirtual   #170 <Method com.irobot.home.fragments.bo com.irobot.home.fragments.bp$a.a()>
	//   12   28:areturn         
	}

	private Fragment l()
	{
		if(i.d)
	//*   0    0:getstatic       #174 <Field boolean i.d>
	//*   1    3:ifeq            16
		{
			a(8, 0);
	//    2    6:aload_0         
	//    3    7:bipush          8
	//    4    9:iconst_0        
	//    5   10:invokevirtual   #150 <Method void a(int, int)>
		} else
	//*   6   13:goto            28
		{
			G();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #177 <Method void G()>
			a(8, 8);
	//    9   20:aload_0         
	//   10   21:bipush          8
	//   11   23:bipush          8
	//   12   25:invokevirtual   #150 <Method void a(int, int)>
		}
		return ((Fragment) (bt.b().a(H.i()).a(0x7f0f0222).a()));
	//   13   28:invokestatic    #182 <Method com.irobot.home.fragments.bt$a bt.b()>
	//   14   31:aload_0         
	//   15   32:getfield        #85  <Field Robot H>
	//   16   35:invokevirtual   #158 <Method String Robot.i()>
	//   17   38:invokevirtual   #187 <Method com.irobot.home.fragments.bt$a com.irobot.home.fragments.bt$a.a(String)>
	//   18   41:ldc1            #188 <Int 0x7f0f0222>
	//   19   43:invokevirtual   #191 <Method com.irobot.home.fragments.bt$a com.irobot.home.fragments.bt$a.a(int)>
	//   20   46:invokevirtual   #194 <Method com.irobot.home.fragments.bs com.irobot.home.fragments.bt$a.a()>
	//   21   49:areturn         
	}

	private Fragment o()
	{
		byte byte0;
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field boolean a>
	//*   2    4:ifeq            13
			byte0 = 8;
	//    3    7:bipush          8
	//    4    9:istore_1        
		else
	//*   5   10:goto            15
			byte0 = 0;
	//    6   13:iconst_0        
	//    7   14:istore_1        
		a(((int) (byte0)), 8, 0x7f0f0281, 0x7f0800c8);
	//    8   15:aload_0         
	//    9   16:iload_1         
	//   10   17:bipush          8
	//   11   19:ldc1            #196 <Int 0x7f0f0281>
	//   12   21:ldc1            #133 <Int 0x7f0800c8>
	//   13   23:invokevirtual   #136 <Method void a(int, int, int, int)>
		ca ca1 = cb.i().a(J).a(H.r()).a(a).a(b).a();
	//   14   26:invokestatic    #201 <Method com.irobot.home.fragments.cb$a cb.i()>
	//   15   29:aload_0         
	//   16   30:getfield        #205 <Field WifiConfig J>
	//   17   33:invokevirtual   #210 <Method com.irobot.home.fragments.cb$a com.irobot.home.fragments.cb$a.a(WifiConfig)>
	//   18   36:aload_0         
	//   19   37:getfield        #85  <Field Robot H>
	//   20   40:invokevirtual   #104 <Method String Robot.r()>
	//   21   43:invokevirtual   #213 <Method com.irobot.home.fragments.cb$a com.irobot.home.fragments.cb$a.a(String)>
	//   22   46:aload_0         
	//   23   47:getfield        #72  <Field boolean a>
	//   24   50:invokevirtual   #216 <Method com.irobot.home.fragments.cb$a com.irobot.home.fragments.cb$a.a(boolean)>
	//   25   53:aload_0         
	//   26   54:getfield        #218 <Field WifiInfo b>
	//   27   57:invokevirtual   #221 <Method com.irobot.home.fragments.cb$a com.irobot.home.fragments.cb$a.a(WifiInfo)>
	//   28   60:invokevirtual   #224 <Method ca com.irobot.home.fragments.cb$a.a()>
	//   29   63:astore_2        
		ca1.a(new com.irobot.home.fragments.ca.a() {

			private void c()
			{
				a.B = null;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LocalOtaHttpsActivity a>
			//    2    4:aconst_null     
			//    3    5:putfield        #26  <Field ScanResult LocalOtaHttpsActivity.B>
				a.E = false;
			//    4    8:aload_0         
			//    5    9:getfield        #17  <Field LocalOtaHttpsActivity a>
			//    6   12:iconst_0        
			//    7   13:putfield        #30  <Field boolean LocalOtaHttpsActivity.E>
				a.F = false;
			//    8   16:aload_0         
			//    9   17:getfield        #17  <Field LocalOtaHttpsActivity a>
			//   10   20:iconst_0        
			//   11   21:putfield        #33  <Field boolean LocalOtaHttpsActivity.F>
			//   12   24:return          
			}

			public void a()
			{
				if(!LocalOtaHttpsActivity.b(a))
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field LocalOtaHttpsActivity a>
			//*   2    4:invokestatic    #37  <Method boolean LocalOtaHttpsActivity.b(LocalOtaHttpsActivity)>
			//*   3    7:ifne            18
					a.b(true);
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field LocalOtaHttpsActivity a>
			//    6   14:iconst_1        
			//    7   15:invokevirtual   #40  <Method void LocalOtaHttpsActivity.b(boolean)>
			//    8   18:return          
			}

			public void a(com.irobot.home.fragments.ca.a.a a1)
			{
				static class _cls3
				{

					static final int a[];

					static 
					{
						a = new int[com.irobot.home.fragments.ca.a.a.values().length];
					//    0    0:invokestatic    #18  <Method com.irobot.home.fragments.ca$a$a[] com.irobot.home.fragments.ca$a$a.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #20  <Field int[] a>
						try
						{
							a[com.irobot.home.fragments.ca.a.a.ROBOT_NOT_CONNECTED.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] a>
					//    5   12:getstatic       #24  <Field com.irobot.home.fragments.ca$a$a com.irobot.home.fragments.ca$a$a.ROBOT_NOT_CONNECTED>
					//    6   15:invokevirtual   #28  <Method int com.irobot.home.fragments.ca$a$a.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] a>
					//*  10   23:getstatic       #31  <Field com.irobot.home.fragments.ca$a$a com.irobot.home.fragments.ca$a$a.ROBOT_NOT_DOCKED>
					//*  11   26:invokevirtual   #28  <Method int com.irobot.home.fragments.ca$a$a.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #20  <Field int[] a>
					//*  15   34:getstatic       #34  <Field com.irobot.home.fragments.ca$a$a com.irobot.home.fragments.ca$a$a.UPDATE_INTERRUPTED>
					//*  16   37:invokevirtual   #28  <Method int com.irobot.home.fragments.ca$a$a.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #20  <Field int[] a>
					//*  20   45:getstatic       #37  <Field com.irobot.home.fragments.ca$a$a com.irobot.home.fragments.ca$a$a.ROBOT_NOT_READY>
					//*  21   48:invokevirtual   #28  <Method int com.irobot.home.fragments.ca$a$a.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   25   54:astore_0        
						try
						{
							a[com.irobot.home.fragments.ca.a.a.ROBOT_NOT_DOCKED.ordinal()] = 2;
						}
					//*  26   55:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   27   58:astore_0        
						try
						{
							a[com.irobot.home.fragments.ca.a.a.UPDATE_INTERRUPTED.ordinal()] = 3;
						}
					//*  28   59:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   29   62:astore_0        
						try
						{
							a[com.irobot.home.fragments.ca.a.a.ROBOT_NOT_READY.ordinal()] = 4;
						}
					//*  30   63:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   31   66:astore_0        
					//*  32   67:return          
					}
				}

				int j1 = com.irobot.home._cls3.a[a1.ordinal()];
			//    0    0:getstatic       #46  <Field int[] com.irobot.home.LocalOtaHttpsActivity$3.a>
			//    1    3:aload_1         
			//    2    4:invokevirtual   #52  <Method int com.irobot.home.fragments.ca$a$a.ordinal()>
			//    3    7:iaload          
			//    4    8:istore_3        
				int i1 = 0;
			//    5    9:iconst_0        
			//    6   10:istore_2        
				switch(j1)
			//*   7   11:iload_3         
				{
			//*   8   12:tableswitch     1 4: default 44
			//			               1 69
			//			               2 61
			//			               3 61
			//			               4 45
				default:
					return;
			//    9   44:return          

				case 4: // '\004'
					a.x = 0;
			//   10   45:aload_0         
			//   11   46:getfield        #17  <Field LocalOtaHttpsActivity a>
			//   12   49:iconst_0        
			//   13   50:putfield        #56  <Field int LocalOtaHttpsActivity.x>
					a.onBackPressed();
			//   14   53:aload_0         
			//   15   54:getfield        #17  <Field LocalOtaHttpsActivity a>
			//   16   57:invokevirtual   #59  <Method void LocalOtaHttpsActivity.onBackPressed()>
					return;
			//   17   60:return          

				case 2: // '\002'
				case 3: // '\003'
					a1 = ((com.irobot.home.fragments.ca.a.a) (a));
			//   18   61:aload_0         
			//   19   62:getfield        #17  <Field LocalOtaHttpsActivity a>
			//   20   65:astore_1        
					break;

			//*  21   66:goto            76
				case 1: // '\001'
					a1 = ((com.irobot.home.fragments.ca.a.a) (a));
			//   22   69:aload_0         
			//   23   70:getfield        #17  <Field LocalOtaHttpsActivity a>
			//   24   73:astore_1        
					i1 = 2;
			//   25   74:iconst_2        
			//   26   75:istore_2        
					break;
				}
				a1.x = i1;
			//   27   76:aload_1         
			//   28   77:iload_2         
			//   29   78:putfield        #56  <Field int LocalOtaHttpsActivity.x>
				c();
			//   30   81:aload_0         
			//   31   82:invokespecial   #61  <Method void c()>
				a.m();
			//   32   85:aload_0         
			//   33   86:getfield        #17  <Field LocalOtaHttpsActivity a>
			//   34   89:invokevirtual   #64  <Method void LocalOtaHttpsActivity.m()>
			//   35   92:return          
			}

			public void b()
			{
				if(LocalOtaHttpsActivity.b(a))
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field LocalOtaHttpsActivity a>
			//*   2    4:invokestatic    #37  <Method boolean LocalOtaHttpsActivity.b(LocalOtaHttpsActivity)>
			//*   3    7:ifeq            17
					LocalOtaHttpsActivity.c(a);
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field LocalOtaHttpsActivity a>
			//    6   14:invokestatic    #66  <Method void LocalOtaHttpsActivity.c(LocalOtaHttpsActivity)>
			//    7   17:return          
			}

			final LocalOtaHttpsActivity a;

			
			{
				a = LocalOtaHttpsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LocalOtaHttpsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   30   64:aload_2         
	//   31   65:new             #8   <Class LocalOtaHttpsActivity$2>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:invokespecial   #226 <Method void LocalOtaHttpsActivity$2(LocalOtaHttpsActivity)>
	//   35   73:invokevirtual   #231 <Method void ca.a(com.irobot.home.fragments.ca$a)>
		return ((Fragment) (ca1));
	//   36   76:aload_2         
	//   37   77:areturn         
	}

	protected void a(String s1, String s2)
	{
		c(s2, H.r());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #85  <Field Robot H>
	//    4    6:invokevirtual   #104 <Method String Robot.r()>
	//    5    9:invokespecial   #233 <Method void c(String, String)>
		Object obj = ((Object) (AssetSSID.create(s2)));
	//    6   12:aload_2         
	//    7   13:invokestatic    #239 <Method AssetSSID AssetSSID.create(String)>
	//    8   16:astore_3        
		H.e(((AssetSSID) (obj)).robotId());
	//    9   17:aload_0         
	//   10   18:getfield        #85  <Field Robot H>
	//   11   21:aload_3         
	//   12   22:invokevirtual   #242 <Method String AssetSSID.robotId()>
	//   13   25:invokevirtual   #245 <Method void Robot.e(String)>
		AssetId assetid = AssetId.assetIdForString(H.r());
	//   14   28:aload_0         
	//   15   29:getfield        #85  <Field Robot H>
	//   16   32:invokevirtual   #104 <Method String Robot.r()>
	//   17   35:invokestatic    #251 <Method AssetId AssetId.assetIdForString(String)>
	//   18   38:astore          4
		if(H.a.c() != null)
	//*  19   40:aload_0         
	//*  20   41:getfield        #85  <Field Robot H>
	//*  21   44:getfield        #254 <Field RobotSystem Robot.a>
	//*  22   47:invokevirtual   #259 <Method SoftwareVersion RobotSystem.c()>
	//*  23   50:ifnull          70
			obj = ((Object) (H.a.c().toString()));
	//   24   53:aload_0         
	//   25   54:getfield        #85  <Field Robot H>
	//   26   57:getfield        #254 <Field RobotSystem Robot.a>
	//   27   60:invokevirtual   #259 <Method SoftwareVersion RobotSystem.c()>
	//   28   63:invokevirtual   #264 <Method String SoftwareVersion.toString()>
	//   29   66:astore_3        
		else
	//*  30   67:goto            77
			obj = "";
	//   31   70:ldc2            #266 <String "">
	//   32   73:astore_3        
	//*  33   74:goto            67
		obj = ((Object) (AssetInfo.create(assetid, H.v(), ((String) (obj)), H.i(), "", "")));
	//   34   77:aload           4
	//   35   79:aload_0         
	//   36   80:getfield        #85  <Field Robot H>
	//   37   83:invokevirtual   #269 <Method String Robot.v()>
	//   38   86:aload_3         
	//   39   87:aload_0         
	//   40   88:getfield        #85  <Field Robot H>
	//   41   91:invokevirtual   #158 <Method String Robot.i()>
	//   42   94:ldc2            #266 <String "">
	//   43   97:ldc2            #266 <String "">
	//   44  100:invokestatic    #274 <Method AssetInfo AssetInfo.create(AssetId, String, String, String, String, String)>
	//   45  103:astore_3        
		l.h().c(((a) (new w(((AssetInfo) (obj)), H))));
	//   46  104:aload_0         
	//   47  105:getfield        #28  <Field IRobotApplication l>
	//   48  108:invokevirtual   #34  <Method IRobotModel IRobotApplication.h()>
	//   49  111:new             #53  <Class w>
	//   50  114:dup             
	//   51  115:aload_3         
	//   52  116:aload_0         
	//   53  117:getfield        #85  <Field Robot H>
	//   54  120:invokespecial   #277 <Method void w(AssetInfo, Robot)>
	//   55  123:invokevirtual   #280 <Method void IRobotModel.c(a)>
		super.a(s1, s2);
	//   56  126:aload_0         
	//   57  127:aload_1         
	//   58  128:aload_2         
	//   59  129:invokespecial   #282 <Method void com.irobot.home.WizardFragmentActivity.a(String, String)>
		b(s1, J.b());
	//   60  132:aload_0         
	//   61  133:aload_1         
	//   62  134:aload_0         
	//   63  135:getfield        #205 <Field WifiConfig J>
	//   64  138:invokevirtual   #286 <Method String WifiConfig.b()>
	//   65  141:invokespecial   #288 <Method void b(String, String)>
	//   66  144:return          
	}

	protected void e()
	{
		w = "LocalOtaHttpsActivity";
	//    0    0:aload_0         
	//    1    1:ldc2            #290 <String "LocalOtaHttpsActivity">
	//    2    4:putfield        #294 <Field String w>
		a a1 = com.irobot.home.util.j.j();
	//    3    7:invokestatic    #298 <Method a j.j()>
	//    4   10:astore_1        
		if(a1 != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          67
		{
			junit.b.a.a("Model asset must be cloud capable.", AssetCapabilityUtils.isCloudCapable(a1.a()));
	//    7   15:ldc2            #300 <String "Model asset must be cloud capable.">
	//    8   18:aload_1         
	//    9   19:invokevirtual   #45  <Method AssetInfo a.a()>
	//   10   22:invokestatic    #51  <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//   11   25:invokestatic    #305 <Method void junit.b.a.a(String, boolean)>
			H = ((w)a1).c();
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:checkcast       #53  <Class w>
	//   15   33:invokevirtual   #56  <Method Robot w.c()>
	//   16   36:putfield        #85  <Field Robot H>
			a = true;
	//   17   39:aload_0         
	//   18   40:iconst_1        
	//   19   41:putfield        #72  <Field boolean a>
			b = ((WifiManager)getApplicationContext().getSystemService("wifi")).getConnectionInfo();
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:invokevirtual   #309 <Method Context getApplicationContext()>
	//   23   49:ldc2            #311 <String "wifi">
	//   24   52:invokevirtual   #317 <Method Object Context.getSystemService(String)>
	//   25   55:checkcast       #319 <Class WifiManager>
	//   26   58:invokevirtual   #323 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   27   61:putfield        #218 <Field WifiInfo b>
		} else
	//*  28   64:goto            78
		{
			H = new Robot();
	//   29   67:aload_0         
	//   30   68:new             #58  <Class Robot>
	//   31   71:dup             
	//   32   72:invokespecial   #81  <Method void Robot()>
	//   33   75:putfield        #85  <Field Robot H>
		}
		x = 0;
	//   34   78:aload_0         
	//   35   79:iconst_0        
	//   36   80:putfield        #327 <Field int x>
		j.setVisibility(8);
	//   37   83:aload_0         
	//   38   84:getfield        #330 <Field ProgressBar j>
	//   39   87:bipush          8
	//   40   89:invokevirtual   #336 <Method void ProgressBar.setVisibility(int)>
		super.e();
	//   41   92:aload_0         
	//   42   93:invokespecial   #338 <Method void WizardFragmentActivity.e()>
	//   43   96:return          
	}

	void f()
	{
		(new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f02aa).setPositiveButton(0x7f0f0986, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				com.irobot.home.LocalOtaHttpsActivity.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LocalOtaHttpsActivity a>
			//    2    4:invokestatic    #24  <Method void com.irobot.home.LocalOtaHttpsActivity.a(LocalOtaHttpsActivity)>
			//    3    7:return          
			}

			final LocalOtaHttpsActivity a;

			
			{
				a = LocalOtaHttpsActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LocalOtaHttpsActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f04d3, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #341 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #344 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:ldc2            #345 <Int 0x7f0f02aa>
	//    5   11:invokevirtual   #349 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    6   14:ldc2            #350 <Int 0x7f0f0986>
	//    7   17:new             #6   <Class LocalOtaHttpsActivity$1>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #351 <Method void LocalOtaHttpsActivity$1(LocalOtaHttpsActivity)>
	//   11   25:invokevirtual   #355 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   12   28:ldc2            #356 <Int 0x7f0f04d3>
	//   13   31:aconst_null     
	//   14   32:invokevirtual   #359 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   15   35:invokevirtual   #363 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   16   38:pop             
	//   17   39:return          
	}

	protected void i()
	{
		if(x == 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field int x>
	//*   2    4:iconst_3        
	//*   3    5:icmpne          13
		{
			g();
	//    4    8:aload_0         
	//    5    9:invokespecial   #23  <Method void g()>
			return;
	//    6   12:return          
		} else
		{
			super.i();
	//    7   13:aload_0         
	//    8   14:invokespecial   #365 <Method void com.irobot.home.WizardFragmentActivity.i()>
			return;
	//    9   17:return          
		}
	}

	protected void m()
	{
label0:
		{
			K = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #370 <Field Fragment K>
			Fragment fragment;
			switch(x)
	//*   3    5:aload_0         
	//*   4    6:getfield        #327 <Field int x>
			{
	//*   5    9:tableswitch     0 3: default 40
	//	               0 108
	//	               1 100
	//	               2 92
	//	               3 84
			default:
				String s1 = w;
	//    6   40:aload_0         
	//    7   41:getfield        #294 <Field String w>
	//    8   44:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//    9   45:new             #372 <Class StringBuilder>
	//   10   48:dup             
	//   11   49:invokespecial   #373 <Method void StringBuilder()>
	//   12   52:astore_3        
				stringbuilder.append("Unhandled provisioning step: ");
	//   13   53:aload_3         
	//   14   54:ldc2            #375 <String "Unhandled provisioning step: ">
	//   15   57:invokevirtual   #379 <Method StringBuilder StringBuilder.append(String)>
	//   16   60:pop             
				stringbuilder.append(String.valueOf(x));
	//   17   61:aload_3         
	//   18   62:aload_0         
	//   19   63:getfield        #327 <Field int x>
	//   20   66:invokestatic    #383 <Method String String.valueOf(int)>
	//   21   69:invokevirtual   #379 <Method StringBuilder StringBuilder.append(String)>
	//   22   72:pop             
				com.irobot.home.util.o.e(s1, stringbuilder.toString());
	//   23   73:aload_2         
	//   24   74:aload_3         
	//   25   75:invokevirtual   #384 <Method String StringBuilder.toString()>
	//   26   78:invokestatic    #388 <Method void o.e(String, String)>
				break label0;
	//   27   81:goto            118

			case 3: // '\003'
				fragment = o();
	//   28   84:aload_0         
	//   29   85:invokespecial   #390 <Method Fragment o()>
	//   30   88:astore_2        
				break;
	//   31   89:goto            113

			case 2: // '\002'
				fragment = l();
	//   32   92:aload_0         
	//   33   93:invokespecial   #392 <Method Fragment l()>
	//   34   96:astore_2        
				break;
	//   35   97:goto            113

			case 1: // '\001'
				fragment = k();
	//   36  100:aload_0         
	//   37  101:invokespecial   #394 <Method Fragment k()>
	//   38  104:astore_2        
				break;
	//   39  105:goto            113

			case 0: // '\0'
				fragment = j();
	//   40  108:aload_0         
	//   41  109:invokespecial   #396 <Method Fragment j()>
	//   42  112:astore_2        
				break;
			}
			K = fragment;
	//   43  113:aload_0         
	//   44  114:aload_2         
	//   45  115:putfield        #370 <Field Fragment K>
		}
		boolean flag;
		if(K != null && x != 3)
	//*  46  118:aload_0         
	//*  47  119:getfield        #370 <Field Fragment K>
	//*  48  122:ifnull          138
	//*  49  125:aload_0         
	//*  50  126:getfield        #327 <Field int x>
	//*  51  129:iconst_3        
	//*  52  130:icmpeq          138
			flag = true;
	//   53  133:iconst_1        
	//   54  134:istore_1        
		else
	//*  55  135:goto            140
			flag = false;
	//   56  138:iconst_0        
	//   57  139:istore_1        
		b(flag);
	//   58  140:aload_0         
	//   59  141:iload_1         
	//   60  142:invokevirtual   #399 <Method void b(boolean)>
		super.m();
	//   61  145:aload_0         
	//   62  146:invokespecial   #401 <Method void WizardFragmentActivity.m()>
	//   63  149:return          
	}

	public void onBackPressed()
	{
		int i1 = x;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field int x>
	//    2    4:istore_1        
		if(i1 != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            24
		{
			if(i1 != 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpeq          19
			{
				I();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #404 <Method void I()>
				return;
	//   10   18:return          
			} else
			{
				f();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #406 <Method void f()>
				return;
	//   13   23:return          
			}
		} else
		{
			super.onBackPressed();
	//   14   24:aload_0         
	//   15   25:invokespecial   #408 <Method void WizardFragmentActivity.onBackPressed()>
			return;
	//   16   28:return          
		}
	}

	public void onRestoreInstanceState(Bundle bundle)
	{
		a = bundle.getBoolean("isUpdatingCurrentRobot");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #412 <String "isUpdatingCurrentRobot">
	//    3    5:invokevirtual   #418 <Method boolean Bundle.getBoolean(String)>
	//    4    8:putfield        #72  <Field boolean a>
		super.onRestoreInstanceState(bundle);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #420 <Method void WizardFragmentActivity.onRestoreInstanceState(Bundle)>
	//    8   16:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #423 <Method void WizardFragmentActivity.onResume()>
		if(x == 2)
	//*   2    4:aload_0         
	//*   3    5:getfield        #327 <Field int x>
	//*   4    8:iconst_2        
	//*   5    9:icmpne          64
		{
			if(C == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #427 <Field WifiManager C>
	//*   8   16:ifnonnull       36
				C = (WifiManager)getApplicationContext().getSystemService("wifi");
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #309 <Method Context getApplicationContext()>
	//   12   24:ldc2            #311 <String "wifi">
	//   13   27:invokevirtual   #317 <Method Object Context.getSystemService(String)>
	//   14   30:checkcast       #319 <Class WifiManager>
	//   15   33:putfield        #427 <Field WifiManager C>
			if(com.irobot.home.util.j.j(C.getConnectionInfo().getSSID()))
	//*  16   36:aload_0         
	//*  17   37:getfield        #427 <Field WifiManager C>
	//*  18   40:invokevirtual   #323 <Method WifiInfo WifiManager.getConnectionInfo()>
	//*  19   43:invokevirtual   #432 <Method String WifiInfo.getSSID()>
	//*  20   46:invokestatic    #434 <Method boolean j.j(String)>
	//*  21   49:ifeq            64
			{
				a(8, 8);
	//   22   52:aload_0         
	//   23   53:bipush          8
	//   24   55:bipush          8
	//   25   57:invokevirtual   #150 <Method void a(int, int)>
				G();
	//   26   60:aload_0         
	//   27   61:invokevirtual   #177 <Method void G()>
			}
		}
	//   28   64:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		bundle.putBoolean("isUpdatingCurrentRobot", a);
	//    0    0:aload_1         
	//    1    1:ldc2            #412 <String "isUpdatingCurrentRobot">
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field boolean a>
	//    4    8:invokevirtual   #438 <Method void Bundle.putBoolean(String, boolean)>
		super.onSaveInstanceState(bundle);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #440 <Method void WizardFragmentActivity.onSaveInstanceState(Bundle)>
	//    8   16:return          
	}

	protected void q()
	{
		if(E)
	//*   0    0:aload_0         
	//*   1    1:getfield        #444 <Field boolean E>
	//*   2    4:ifeq            55
		{
			com.irobot.home.util.o.b(w, "CONNECTED");
	//    3    7:aload_0         
	//    4    8:getfield        #294 <Field String w>
	//    5   11:ldc2            #446 <String "CONNECTED">
	//    6   14:invokestatic    #447 <Method void o.b(String, String)>
			if(B != null && x == 2)
	//*   7   17:aload_0         
	//*   8   18:getfield        #451 <Field ScanResult B>
	//*   9   21:ifnull          65
	//*  10   24:aload_0         
	//*  11   25:getfield        #327 <Field int x>
	//*  12   28:iconst_2        
	//*  13   29:icmpne          65
			{
				c(B.SSID, H.r());
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #451 <Field ScanResult B>
	//   17   37:getfield        #456 <Field String ScanResult.SSID>
	//   18   40:aload_0         
	//   19   41:getfield        #85  <Field Robot H>
	//   20   44:invokevirtual   #104 <Method String Robot.r()>
	//   21   47:invokespecial   #233 <Method void c(String, String)>
				super.q();
	//   22   50:aload_0         
	//   23   51:invokespecial   #458 <Method void WizardFragmentActivity.q()>
				return;
	//   24   54:return          
			}
		} else
		{
			com.irobot.home.util.o.b(w, "CONNECTED (but ignored at this point)");
	//   25   55:aload_0         
	//   26   56:getfield        #294 <Field String w>
	//   27   59:ldc2            #460 <String "CONNECTED (but ignored at this point)">
	//   28   62:invokestatic    #447 <Method void o.b(String, String)>
		}
	//   29   65:return          
	}

	void r()
	{
		x = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #327 <Field int x>
	//    3    5:return          
	}

	void s()
	{
		if(x == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field int x>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          15
			a(8, 0);
	//    4    8:aload_0         
	//    5    9:bipush          8
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #150 <Method void a(int, int)>
	//    8   15:return          
	}

	private boolean a;
	private WifiInfo b;
}
