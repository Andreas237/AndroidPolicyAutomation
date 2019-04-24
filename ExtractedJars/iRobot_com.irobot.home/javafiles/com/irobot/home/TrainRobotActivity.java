// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.CustomVideoView;
import java.util.HashSet;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, IRobotApplication

public class TrainRobotActivity extends BaseFragmentActivity
	implements com.irobot.home.view.CustomVideoView.a
{

	public TrainRobotActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void BaseFragmentActivity()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #49  <Field boolean b>
	//    5    9:return          
	}

	static MissionSubsystem a(TrainRobotActivity trainrobotactivity)
	{
		return trainrobotactivity.l;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field MissionSubsystem l>
	//    2    4:areturn         
	}

	private boolean k()
	{
		return m.getServiceData().getAvailableSettings().contains(((Object) (SettingType.PMapLearningAllowed)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field SettingsSubsystem m>
	//    2    4:invokevirtual   #61  <Method SettingsUIServiceData SettingsSubsystem.getServiceData()>
	//    3    7:invokevirtual   #67  <Method HashSet SettingsUIServiceData.getAvailableSettings()>
	//    4   10:getstatic       #73  <Field SettingType SettingType.PMapLearningAllowed>
	//    5   13:invokevirtual   #79  <Method boolean HashSet.contains(Object)>
	//    6   16:ireturn         
	}

	public void a(int i1, int j1)
	{
	//    0    0:return          
	}

	void e()
	{
		Object obj = ((Object) (com.irobot.home.util.j.j()));
	//    0    0:invokestatic    #85  <Method a j.j()>
	//    1    3:astore_3        
		if(obj != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          328
		{
			m = Assembler.getInstance().getSettingsSubsystem(((a) (obj)).b());
	//    4    8:aload_0         
	//    5    9:invokestatic    #91  <Method Assembler Assembler.getInstance()>
	//    6   12:aload_3         
	//    7   13:invokevirtual   #96  <Method com.irobot.core.AssetId a.b()>
	//    8   16:invokevirtual   #100 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//    9   19:putfield        #55  <Field SettingsSubsystem m>
			k = Assembler.getInstance().getMapsUIService(((a) (obj)).b());
	//   10   22:aload_0         
	//   11   23:invokestatic    #91  <Method Assembler Assembler.getInstance()>
	//   12   26:aload_3         
	//   13   27:invokevirtual   #96  <Method com.irobot.core.AssetId a.b()>
	//   14   30:invokevirtual   #104 <Method MapsUIService Assembler.getMapsUIService(com.irobot.core.AssetId)>
	//   15   33:putfield        #106 <Field MapsUIService k>
			l = Assembler.getInstance().getMissionSubsystem(((a) (obj)).b());
	//   16   36:aload_0         
	//   17   37:invokestatic    #91  <Method Assembler Assembler.getInstance()>
	//   18   40:aload_3         
	//   19   41:invokevirtual   #96  <Method com.irobot.core.AssetId a.b()>
	//   20   44:invokevirtual   #110 <Method MissionSubsystem Assembler.getMissionSubsystem(com.irobot.core.AssetId)>
	//   21   47:putfield        #52  <Field MissionSubsystem l>
			boolean flag;
			if(AssetCapabilityUtils.isCloudCapable(((a) (obj)).a()) && AssetCapabilityUtils.isMoppingRobot(((a) (obj)).a()))
	//*  22   50:aload_3         
	//*  23   51:invokevirtual   #113 <Method AssetInfo a.a()>
	//*  24   54:invokestatic    #119 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  25   57:ifeq            75
	//*  26   60:aload_3         
	//*  27   61:invokevirtual   #113 <Method AssetInfo a.a()>
	//*  28   64:invokestatic    #122 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  29   67:ifeq            75
				flag = true;
	//   30   70:iconst_1        
	//   31   71:istore_1        
			else
	//*  32   72:goto            77
				flag = false;
	//   33   75:iconst_0        
	//   34   76:istore_1        
			int i1;
			String s;
			if(flag)
	//*  35   77:iload_1         
	//*  36   78:ifeq            94
				i1 = 0x7f0f08e0;
	//   37   81:ldc1            #123 <Int 0x7f0f08e0>
	//   38   83:istore_2        
			else
	//*  39   84:aload_0         
	//*  40   85:iload_2         
	//*  41   86:invokevirtual   #127 <Method String getString(int)>
	//*  42   89:astore          4
	//*  43   91:goto            100
				i1 = 0x7f0f08e1;
	//   44   94:ldc1            #128 <Int 0x7f0f08e1>
	//   45   96:istore_2        
			s = getString(i1);
	//*  46   97:goto            84
			if(flag)
	//*  47  100:iload_1         
	//*  48  101:ifeq            114
				obj = ((Object) (getString(0x7f0f08df)));
	//   49  104:aload_0         
	//   50  105:ldc1            #129 <Int 0x7f0f08df>
	//   51  107:invokevirtual   #127 <Method String getString(int)>
	//   52  110:astore_3        
			else
	//*  53  111:goto            135
				obj = ((Object) (getString(0x7f0f08e2, new Object[] {
					((a) (obj)).a().getName()
				})));
	//   54  114:aload_0         
	//   55  115:ldc1            #130 <Int 0x7f0f08e2>
	//   56  117:iconst_1        
	//   57  118:anewarray       Object[]
	//   58  121:dup             
	//   59  122:iconst_0        
	//   60  123:aload_3         
	//   61  124:invokevirtual   #113 <Method AssetInfo a.a()>
	//   62  127:invokevirtual   #138 <Method String AssetInfo.getName()>
	//   63  130:aastore         
	//   64  131:invokevirtual   #141 <Method String getString(int, Object[])>
	//   65  134:astore_3        
			e.setText(((CharSequence) (s)));
	//   66  135:aload_0         
	//   67  136:getfield        #143 <Field CustomTextView e>
	//   68  139:aload           4
	//   69  141:invokevirtual   #149 <Method void CustomTextView.setText(CharSequence)>
			f.setText(((CharSequence) (obj)));
	//   70  144:aload_0         
	//   71  145:getfield        #151 <Field CustomTextView f>
	//   72  148:aload_3         
	//   73  149:invokevirtual   #149 <Method void CustomTextView.setText(CharSequence)>
			if(flag)
	//*  74  152:iload_1         
	//*  75  153:ifeq            182
			{
				ImageView imageview = new ImageView(((android.content.Context) (this)));
	//   76  156:new             #153 <Class ImageView>
	//   77  159:dup             
	//   78  160:aload_0         
	//   79  161:invokespecial   #156 <Method void ImageView(android.content.Context)>
	//   80  164:astore_3        
				imageview.setImageResource(0x7f080182);
	//   81  165:aload_3         
	//   82  166:ldc1            #157 <Int 0x7f080182>
	//   83  168:invokevirtual   #161 <Method void ImageView.setImageResource(int)>
				h.addView(((android.view.View) (imageview)));
	//   84  171:aload_0         
	//   85  172:getfield        #163 <Field FrameLayout h>
	//   86  175:aload_3         
	//   87  176:invokevirtual   #169 <Method void FrameLayout.addView(android.view.View)>
			} else
	//*  88  179:goto            270
			{
				j = new CustomVideoView(((android.content.Context) (this)));
	//   89  182:aload_0         
	//   90  183:new             #171 <Class CustomVideoView>
	//   91  186:dup             
	//   92  187:aload_0         
	//   93  188:invokespecial   #172 <Method void CustomVideoView(android.content.Context)>
	//   94  191:putfield        #174 <Field CustomVideoView j>
				android.net.Uri uri = com.irobot.home.util.j.a(((android.content.Context) (this)), 0x7f0e01f3);
	//   95  194:aload_0         
	//   96  195:ldc1            #175 <Int 0x7f0e01f3>
	//   97  197:invokestatic    #178 <Method android.net.Uri j.a(android.content.Context, int)>
	//   98  200:astore_3        
				j.setSource(uri);
	//   99  201:aload_0         
	//  100  202:getfield        #174 <Field CustomVideoView j>
	//  101  205:aload_3         
	//  102  206:invokevirtual   #182 <Method void CustomVideoView.setSource(android.net.Uri)>
				j.setLooping(false);
	//  103  209:aload_0         
	//  104  210:getfield        #174 <Field CustomVideoView j>
	//  105  213:iconst_0        
	//  106  214:invokevirtual   #186 <Method void CustomVideoView.setLooping(boolean)>
				j.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, com.irobot.home.util.j.a(((android.app.Activity) (this)), uri)));
	//  107  217:aload_0         
	//  108  218:getfield        #174 <Field CustomVideoView j>
	//  109  221:new             #188 <Class android.view.ViewGroup$LayoutParams>
	//  110  224:dup             
	//  111  225:iconst_m1       
	//  112  226:aload_0         
	//  113  227:aload_3         
	//  114  228:invokestatic    #191 <Method int j.a(android.app.Activity, android.net.Uri)>
	//  115  231:invokespecial   #193 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  116  234:invokevirtual   #197 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				h.addView(((android.view.View) (j)));
	//  117  237:aload_0         
	//  118  238:getfield        #163 <Field FrameLayout h>
	//  119  241:aload_0         
	//  120  242:getfield        #174 <Field CustomVideoView j>
	//  121  245:invokevirtual   #169 <Method void FrameLayout.addView(android.view.View)>
				i.bringToFront();
	//  122  248:aload_0         
	//  123  249:getfield        #199 <Field ImageButton i>
	//  124  252:invokevirtual   #204 <Method void ImageButton.bringToFront()>
				j.setVideoStatusListener(((com.irobot.home.view.CustomVideoView.a) (this)));
	//  125  255:aload_0         
	//  126  256:getfield        #174 <Field CustomVideoView j>
	//  127  259:aload_0         
	//  128  260:invokevirtual   #208 <Method void CustomVideoView.setVideoStatusListener(com.irobot.home.view.CustomVideoView$a)>
				j.a();
	//  129  263:aload_0         
	//  130  264:getfield        #174 <Field CustomVideoView j>
	//  131  267:invokevirtual   #210 <Method void CustomVideoView.a()>
			}
			i.setColorFilter(getResources().getColor(0x7f060078), android.graphics.PorterDuff.Mode.MULTIPLY);
	//  132  270:aload_0         
	//  133  271:getfield        #199 <Field ImageButton i>
	//  134  274:aload_0         
	//  135  275:invokevirtual   #214 <Method Resources getResources()>
	//  136  278:ldc1            #215 <Int 0x7f060078>
	//  137  280:invokevirtual   #221 <Method int Resources.getColor(int)>
	//  138  283:getstatic       #227 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//  139  286:invokevirtual   #231 <Method void ImageButton.setColorFilter(int, android.graphics.PorterDuff$Mode)>
			i.setVisibility(4);
	//  140  289:aload_0         
	//  141  290:getfield        #199 <Field ImageButton i>
	//  142  293:iconst_4        
	//  143  294:invokevirtual   #234 <Method void ImageButton.setVisibility(int)>
			n = com.irobot.home.util.j.a(0.0F, 1.0F, 0L, 200L, true);
	//  144  297:aload_0         
	//  145  298:fconst_0        
	//  146  299:fconst_1        
	//  147  300:lconst_0        
	//  148  301:ldc2w           #235 <Long 200L>
	//  149  304:iconst_1        
	//  150  305:invokestatic    #239 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//  151  308:putfield        #241 <Field AlphaAnimation n>
			o = com.irobot.home.util.j.a(1.0F, 0.0F, 100L, 200L, true);
	//  152  311:aload_0         
	//  153  312:fconst_1        
	//  154  313:fconst_0        
	//  155  314:ldc2w           #242 <Long 100L>
	//  156  317:ldc2w           #235 <Long 200L>
	//  157  320:iconst_1        
	//  158  321:invokestatic    #239 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//  159  324:putfield        #245 <Field AlphaAnimation o>
			return;
	//  160  327:return          
		} else
		{
			Log.e(a, "Current asset is null.");
	//  161  328:getstatic       #247 <Field String a>
	//  162  331:ldc1            #249 <String "Current asset is null.">
	//  163  333:invokestatic    #254 <Method int Log.e(String, String)>
	//  164  336:pop             
			return;
	//  165  337:return          
		}
	}

	public void e_()
	{
	//    0    0:return          
	}

	void f()
	{
		i.setClickable(false);
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field ImageButton i>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #258 <Method void ImageButton.setClickable(boolean)>
		i.startAnimation(((android.view.animation.Animation) (o)));
	//    4    8:aload_0         
	//    5    9:getfield        #199 <Field ImageButton i>
	//    6   12:aload_0         
	//    7   13:getfield        #245 <Field AlphaAnimation o>
	//    8   16:invokevirtual   #262 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		j.c();
	//    9   19:aload_0         
	//   10   20:getfield        #174 <Field CustomVideoView j>
	//   11   23:invokevirtual   #264 <Method void CustomVideoView.c()>
	//   12   26:return          
	}

	public void f_()
	{
		i.bringToFront();
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field ImageButton i>
	//    2    4:invokevirtual   #204 <Method void ImageButton.bringToFront()>
		i.setVisibility(0);
	//    3    7:aload_0         
	//    4    8:getfield        #199 <Field ImageButton i>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #234 <Method void ImageButton.setVisibility(int)>
		i.startAnimation(((android.view.animation.Animation) (n)));
	//    7   15:aload_0         
	//    8   16:getfield        #199 <Field ImageButton i>
	//    9   19:aload_0         
	//   10   20:getfield        #241 <Field AlphaAnimation n>
	//   11   23:invokevirtual   #262 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		i.setClickable(true);
	//   12   26:aload_0         
	//   13   27:getfield        #199 <Field ImageButton i>
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #258 <Method void ImageButton.setClickable(boolean)>
	//   16   34:return          
	}

	void i()
	{
		if(com.irobot.home.util.j.a()) goto _L2; else goto _L1
	//    0    0:invokestatic    #267 <Method boolean j.a()>
	//    1    3:ifne            38
_L1:
		Object obj = ((Object) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(((CharSequence) (getString(0x7f0f04db)))).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null)))));
	//    2    6:new             #269 <Class android.app.AlertDialog$Builder>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #270 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    6   14:aload_0         
	//    7   15:ldc2            #271 <Int 0x7f0f04db>
	//    8   18:invokevirtual   #127 <Method String getString(int)>
	//    9   21:invokevirtual   #275 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   10   24:ldc2            #276 <Int 0x7f0f05bb>
	//   11   27:aconst_null     
	//   12   28:invokevirtual   #280 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   31:astore_2        
_L4:
		((android.app.AlertDialog.Builder) (obj)).show();
	//   14   32:aload_2         
	//   15   33:invokevirtual   #284 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   16   36:pop             
		return;
	//   17   37:return          
_L2:
		obj = ((Object) (l.getResolvedMissionStatus().status()));
	//   18   38:aload_0         
	//   19   39:getfield        #52  <Field MissionSubsystem l>
	//   20   42:invokevirtual   #290 <Method ResolvedMissionStatusEvent MissionSubsystem.getResolvedMissionStatus()>
	//   21   45:invokevirtual   #296 <Method ResolvedMissionStatus ResolvedMissionStatusEvent.status()>
	//   22   48:astore_2        
		static class _cls3
		{

			static final int a[];

			static 
			{
				a = new int[ResolvedMissionStatus.values().length];
			//    0    0:invokestatic    #18  <Method ResolvedMissionStatus[] ResolvedMissionStatus.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[ResolvedMissionStatus.Cleaning.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field ResolvedMissionStatus ResolvedMissionStatus.Cleaning>
			//    6   15:invokevirtual   #28  <Method int ResolvedMissionStatus.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field ResolvedMissionStatus ResolvedMissionStatus.SpotCleaning>
			//*  11   26:invokevirtual   #28  <Method int ResolvedMissionStatus.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field ResolvedMissionStatus ResolvedMissionStatus.Training>
			//*  16   37:invokevirtual   #28  <Method int ResolvedMissionStatus.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					a[ResolvedMissionStatus.SpotCleaning.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					a[ResolvedMissionStatus.Training.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		boolean flag;
		switch(com.irobot.home._cls3.a[((ResolvedMissionStatus) (obj)).ordinal()])
	//*  23   49:getstatic       #299 <Field int[] com.irobot.home.TrainRobotActivity$3.a>
	//*  24   52:aload_2         
	//*  25   53:invokevirtual   #305 <Method int ResolvedMissionStatus.ordinal()>
	//*  26   56:iaload          
		{
	//*  27   57:tableswitch     1 3: default 84
	//	               1 89
	//	               2 89
	//	               3 89
		default:
			flag = false;
	//   28   84:iconst_0        
	//   29   85:istore_1        
			break;

	//*  30   86:goto            91
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			flag = true;
	//   31   89:iconst_1        
	//   32   90:istore_1        
			break;
		}
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   33   91:iload_1         
	//   34   92:ifeq            161
		obj = ((Object) ((new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(((CharSequence) (getString(0x7f0f08f0, new Object[] {
			com.irobot.home.util.j.j().a().getName()
		})))).setPositiveButton(0x7f0f08ed, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				if(com.irobot.home.TrainRobotActivity.a(a) != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field TrainRobotActivity a>
			//*   2    4:invokestatic    #25  <Method MissionSubsystem com.irobot.home.TrainRobotActivity.a(TrainRobotActivity)>
			//*   3    7:ifnull          23
					com.irobot.home.TrainRobotActivity.a(a).sendCommand(CommandType.STOP);
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field TrainRobotActivity a>
			//    6   14:invokestatic    #25  <Method MissionSubsystem com.irobot.home.TrainRobotActivity.a(TrainRobotActivity)>
			//    7   17:getstatic       #31  <Field CommandType CommandType.STOP>
			//    8   20:invokevirtual   #37  <Method void MissionSubsystem.sendCommand(CommandType)>
			//    9   23:return          
			}

			final TrainRobotActivity a;

			
			{
				a = TrainRobotActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TrainRobotActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).setNegativeButton(0x7f0f08f1, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				a.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field TrainRobotActivity a>
			//    2    4:invokevirtual   #25  <Method void TrainRobotActivity.finish()>
			//    3    7:return          
			}

			final TrainRobotActivity a;

			
			{
				a = TrainRobotActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TrainRobotActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//   35   95:new             #269 <Class android.app.AlertDialog$Builder>
	//   36   98:dup             
	//   37   99:aload_0         
	//   38  100:invokespecial   #270 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   39  103:aload_0         
	//   40  104:ldc2            #306 <Int 0x7f0f08f0>
	//   41  107:iconst_1        
	//   42  108:anewarray       Object[]
	//   43  111:dup             
	//   44  112:iconst_0        
	//   45  113:invokestatic    #85  <Method a j.j()>
	//   46  116:invokevirtual   #113 <Method AssetInfo a.a()>
	//   47  119:invokevirtual   #138 <Method String AssetInfo.getName()>
	//   48  122:aastore         
	//   49  123:invokevirtual   #141 <Method String getString(int, Object[])>
	//   50  126:invokevirtual   #275 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   51  129:ldc2            #307 <Int 0x7f0f08ed>
	//   52  132:new             #10  <Class TrainRobotActivity$2>
	//   53  135:dup             
	//   54  136:aload_0         
	//   55  137:invokespecial   #310 <Method void TrainRobotActivity$2(TrainRobotActivity)>
	//   56  140:invokevirtual   #280 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   57  143:ldc2            #311 <Int 0x7f0f08f1>
	//   58  146:new             #8   <Class TrainRobotActivity$1>
	//   59  149:dup             
	//   60  150:aload_0         
	//   61  151:invokespecial   #312 <Method void TrainRobotActivity$1(TrainRobotActivity)>
	//   62  154:invokevirtual   #315 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   63  157:astore_2        
		if(true) goto _L4; else goto _L3
	//   64  158:goto            32
_L3:
label0:
		{
			Object obj1;
			String s;
			if(k())
	//*  65  161:aload_0         
	//*  66  162:invokespecial   #317 <Method boolean k()>
	//*  67  165:ifeq            275
			{
				if(b)
	//*  68  168:aload_0         
	//*  69  169:getfield        #49  <Field boolean b>
	//*  70  172:ifeq            221
				{
					Log.i(a, "Send training command with one more run.");
	//   71  175:getstatic       #247 <Field String a>
	//   72  178:ldc2            #319 <String "Send training command with one more run.">
	//   73  181:invokestatic    #321 <Method int Log.i(String, String)>
	//   74  184:pop             
					MapsUIServiceData mapsuiservicedata = MapsUIServiceData.create();
	//   75  185:invokestatic    #327 <Method MapsUIServiceData MapsUIServiceData.create()>
	//   76  188:astore_2        
					mapsuiservicedata.setRunActionCommandType(CommandType.TRAIN);
	//   77  189:aload_2         
	//   78  190:getstatic       #333 <Field CommandType CommandType.TRAIN>
	//   79  193:invokevirtual   #337 <Method void MapsUIServiceData.setRunActionCommandType(CommandType)>
					mapsuiservicedata.setRunActionMapId(c.f());
	//   80  196:aload_2         
	//   81  197:aload_0         
	//   82  198:getfield        #339 <Field IRobotApplication c>
	//   83  201:invokevirtual   #344 <Method com.irobot.core.PersistentMapIdentifier IRobotApplication.f()>
	//   84  204:invokevirtual   #348 <Method void MapsUIServiceData.setRunActionMapId(com.irobot.core.PersistentMapIdentifier)>
					k.sendCommand(MapsUIServiceCommand.StartOneMoreRunAction, mapsuiservicedata);
	//   85  207:aload_0         
	//   86  208:getfield        #106 <Field MapsUIService k>
	//   87  211:getstatic       #354 <Field MapsUIServiceCommand MapsUIServiceCommand.StartOneMoreRunAction>
	//   88  214:aload_2         
	//   89  215:invokevirtual   #360 <Method void MapsUIService.sendCommand(MapsUIServiceCommand, MapsUIServiceData)>
					break label0;
	//   90  218:goto            289
				}
				obj1 = ((Object) (SettingsUIServiceData.create()));
	//   91  221:invokestatic    #362 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   92  224:astore_2        
				((SettingsUIServiceData) (obj1)).setBooleanSetting(SettingType.PMapLearningAllowed, true);
	//   93  225:aload_2         
	//   94  226:getstatic       #73  <Field SettingType SettingType.PMapLearningAllowed>
	//   95  229:iconst_1        
	//   96  230:invokevirtual   #366 <Method void SettingsUIServiceData.setBooleanSetting(SettingType, boolean)>
				m.sendCommand(SettingsUIServiceCommand.UpdateSetting, ((SettingsUIServiceData) (obj1)));
	//   97  233:aload_0         
	//   98  234:getfield        #55  <Field SettingsSubsystem m>
	//   99  237:getstatic       #372 <Field SettingsUIServiceCommand SettingsUIServiceCommand.UpdateSetting>
	//  100  240:aload_2         
	//  101  241:invokevirtual   #375 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
				if(l != null)
	//* 102  244:aload_0         
	//* 103  245:getfield        #52  <Field MissionSubsystem l>
	//* 104  248:ifnull          264
				{
					l.sendCommand(CommandType.TRAIN);
	//  105  251:aload_0         
	//  106  252:getfield        #52  <Field MissionSubsystem l>
	//  107  255:getstatic       #333 <Field CommandType CommandType.TRAIN>
	//  108  258:invokevirtual   #377 <Method void MissionSubsystem.sendCommand(CommandType)>
					break label0;
	//  109  261:goto            289
				}
				obj1 = ((Object) (a));
	//  110  264:getstatic       #247 <Field String a>
	//  111  267:astore_2        
				s = "Cannot send training command, mMissionSubsystem is null.";
	//  112  268:ldc2            #379 <String "Cannot send training command, mMissionSubsystem is null.">
	//  113  271:astore_3        
			} else
	//* 114  272:goto            283
			{
				obj1 = ((Object) (a));
	//  115  275:getstatic       #247 <Field String a>
	//  116  278:astore_2        
				s = "Cannot enable pmap learning, pmaps not supported.";
	//  117  279:ldc2            #381 <String "Cannot enable pmap learning, pmaps not supported.">
	//  118  282:astore_3        
			}
			Log.i(((String) (obj1)), s);
	//  119  283:aload_2         
	//  120  284:aload_3         
	//  121  285:invokestatic    #321 <Method int Log.i(String, String)>
	//  122  288:pop             
		}
		com.irobot.home.util.j.a(((android.app.Activity) (this)));
	//  123  289:aload_0         
	//  124  290:invokestatic    #384 <Method void j.a(android.app.Activity)>
		return;
	//  125  293:return          
	}

	void j()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #387 <Method void finish()>
	//    2    4:return          
	}

	public static final String a = "TrainRobotActivity";
	boolean b;
	IRobotApplication c;
	ImageButton d;
	CustomTextView e;
	CustomTextView f;
	CustomButton g;
	FrameLayout h;
	ImageButton i;
	private CustomVideoView j;
	private MapsUIService k;
	private MissionSubsystem l;
	private SettingsSubsystem m;
	private AlphaAnimation n;
	private AlphaAnimation o;

	static 
	{
	//    0    0:return          
	}
}
