// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.irobot.core.*;
import com.irobot.home.model.*;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.BatteryGaugeView;
import com.irobot.home.view.CustomButton;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.irobot.home.fragments:
//			i

public class bk extends i
{

	public bk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void i()>
		o = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean o>
		p = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #52  <Field boolean p>
		s = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #54  <Field boolean s>
		t = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #56  <Field boolean t>
		u = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #58  <Field boolean u>
		v = -1;
	//   17   29:aload_0         
	//   18   30:iconst_m1       
	//   19   31:putfield        #60  <Field int v>
	//   20   34:aload_0         
	//   21   35:new             #62  <Class Handler>
	//   22   38:dup             
	//   23   39:invokespecial   #63  <Method void Handler()>
	//   24   42:putfield        #65  <Field Handler w>
		x = new Runnable() {

			public void run()
			{
				Robot robot = com.irobot.home.util.j.c(com.irobot.home.util.j.k());
			//    0    0:invokestatic    #25  <Method com.irobot.core.AssetId j.k()>
			//    1    3:invokestatic    #29  <Method Robot j.c(com.irobot.core.AssetId)>
			//    2    6:astore_1        
				if(robot != null && com.irobot.home.fragments.bk.a(a))
			//*   3    7:aload_1         
			//*   4    8:ifnull          121
			//*   5   11:aload_0         
			//*   6   12:getfield        #14  <Field bk a>
			//*   7   15:invokestatic    #32  <Method boolean com.irobot.home.fragments.bk.a(bk)>
			//*   8   18:ifeq            121
				{
					if(!a.isVisible())
			//*   9   21:aload_0         
			//*  10   22:getfield        #14  <Field bk a>
			//*  11   25:invokevirtual   #36  <Method boolean bk.isVisible()>
			//*  12   28:ifne            32
						return;
			//   13   31:return          
					if(bk.b(a))
			//*  14   32:aload_0         
			//*  15   33:getfield        #14  <Field bk a>
			//*  16   36:invokestatic    #39  <Method boolean bk.b(bk)>
			//*  17   39:ifeq            106
					{
						bk.c(a);
			//   18   42:aload_0         
			//   19   43:getfield        #14  <Field bk a>
			//   20   46:invokestatic    #41  <Method void bk.c(bk)>
						if(bk.d(a) == 0)
			//*  21   49:aload_0         
			//*  22   50:getfield        #14  <Field bk a>
			//*  23   53:invokestatic    #45  <Method int bk.d(bk)>
			//*  24   56:ifne            106
							if(a.f && (!a.c || !robot.a().f()))
			//*  25   59:aload_0         
			//*  26   60:getfield        #14  <Field bk a>
			//*  27   63:getfield        #49  <Field boolean bk.f>
			//*  28   66:ifeq            99
			//*  29   69:aload_0         
			//*  30   70:getfield        #14  <Field bk a>
			//*  31   73:getfield        #51  <Field boolean bk.c>
			//*  32   76:ifeq            89
			//*  33   79:aload_1         
			//*  34   80:invokevirtual   #56  <Method RobotPreferences Robot.a()>
			//*  35   83:invokevirtual   #60  <Method boolean RobotPreferences.f()>
			//*  36   86:ifne            99
								a.c();
			//   37   89:aload_0         
			//   38   90:getfield        #14  <Field bk a>
			//   39   93:invokevirtual   #62  <Method void bk.c()>
							else
			//*  40   96:goto            106
								bk.e(a);
			//   41   99:aload_0         
			//   42  100:getfield        #14  <Field bk a>
			//   43  103:invokestatic    #65  <Method void bk.e(bk)>
					}
					bk.f(a).postDelayed(((Runnable) (this)), 1000L);
			//   44  106:aload_0         
			//   45  107:getfield        #14  <Field bk a>
			//   46  110:invokestatic    #68  <Method Handler bk.f(bk)>
			//   47  113:aload_0         
			//   48  114:ldc2w           #69  <Long 1000L>
			//   49  117:invokevirtual   #76  <Method boolean Handler.postDelayed(Runnable, long)>
			//   50  120:pop             
				}
			//   51  121:return          
			}

			final bk a;

			
			{
				a = bk.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field bk a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   25   45:aload_0         
	//   26   46:new             #6   <Class bk$1>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:invokespecial   #68  <Method void bk$1(bk)>
	//   30   54:putfield        #70  <Field Runnable x>
		y = null;
	//   31   57:aload_0         
	//   32   58:aconst_null     
	//   33   59:putfield        #72  <Field AlertDialog y>
	//   34   62:return          
	}

	static AlertDialog a(bk bk1, AlertDialog alertdialog)
	{
		bk1.y = alertdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field AlertDialog y>
		return alertdialog;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(MissionStatusAction missionstatusaction)
	{
		static class _cls4
		{

			static final int a[];
			static final int b[];

			static 
			{
				b = new int[ResolvedMissionStatus.values().length];
			//    0    0:invokestatic    #19  <Method ResolvedMissionStatus[] ResolvedMissionStatus.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] b>
				try
				{
					b[ResolvedMissionStatus.Paused.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] b>
			//    5   12:getstatic       #25  <Field ResolvedMissionStatus ResolvedMissionStatus.Paused>
			//    6   15:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] b>
			//*  10   23:getstatic       #32  <Field ResolvedMissionStatus ResolvedMissionStatus.PausedWithError>
			//*  11   26:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] b>
			//*  15   34:getstatic       #35  <Field ResolvedMissionStatus ResolvedMissionStatus.PausedWithStartRefuse>
			//*  16   37:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #21  <Field int[] b>
			//*  20   45:getstatic       #38  <Field ResolvedMissionStatus ResolvedMissionStatus.EndJobNoDock>
			//*  21   48:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #21  <Field int[] b>
			//*  25   56:getstatic       #41  <Field ResolvedMissionStatus ResolvedMissionStatus.EndJobWithDock>
			//*  26   59:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #21  <Field int[] b>
			//*  30   67:getstatic       #44  <Field ResolvedMissionStatus ResolvedMissionStatus.ReturnToDock>
			//*  31   70:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #21  <Field int[] b>
			//*  35   79:getstatic       #47  <Field ResolvedMissionStatus ResolvedMissionStatus.WetMoppingPausedWithStartRefuse>
			//*  36   82:invokevirtual   #29  <Method int ResolvedMissionStatus.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:invokestatic    #52  <Method MissionStatusAction[] MissionStatusAction.values()>
			//*  40   91:arraylength     
			//*  41   92:newarray        int[]
			//*  42   94:putstatic       #54  <Field int[] a>
			//*  43   97:getstatic       #54  <Field int[] a>
			//*  44  100:getstatic       #58  <Field MissionStatusAction MissionStatusAction.EndJob>
			//*  45  103:invokevirtual   #59  <Method int MissionStatusAction.ordinal()>
			//*  46  106:iconst_1        
			//*  47  107:iastore         
			//*  48  108:getstatic       #54  <Field int[] a>
			//*  49  111:getstatic       #61  <Field MissionStatusAction MissionStatusAction.ReturnToDock>
			//*  50  114:invokevirtual   #59  <Method int MissionStatusAction.ordinal()>
			//*  51  117:iconst_2        
			//*  52  118:iastore         
			//*  53  119:getstatic       #54  <Field int[] a>
			//*  54  122:getstatic       #64  <Field MissionStatusAction MissionStatusAction.EndNow>
			//*  55  125:invokevirtual   #59  <Method int MissionStatusAction.ordinal()>
			//*  56  128:iconst_3        
			//*  57  129:iastore         
			//*  58  130:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   59  131:astore_0        
				try
				{
					b[ResolvedMissionStatus.PausedWithError.ordinal()] = 2;
				}
			//*  60  132:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   61  135:astore_0        
				try
				{
					b[ResolvedMissionStatus.PausedWithStartRefuse.ordinal()] = 3;
				}
			//*  62  136:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   63  139:astore_0        
				try
				{
					b[ResolvedMissionStatus.EndJobNoDock.ordinal()] = 4;
				}
			//*  64  140:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   65  143:astore_0        
				try
				{
					b[ResolvedMissionStatus.EndJobWithDock.ordinal()] = 5;
				}
			//*  66  144:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   67  147:astore_0        
				try
				{
					b[ResolvedMissionStatus.ReturnToDock.ordinal()] = 6;
				}
			//*  68  148:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   69  151:astore_0        
				try
				{
					b[ResolvedMissionStatus.WetMoppingPausedWithStartRefuse.ordinal()] = 7;
				}
			//*  70  152:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   71  155:astore_0        
				a = new int[MissionStatusAction.values().length];
				try
				{
					a[MissionStatusAction.EndJob.ordinal()] = 1;
				}
			//*  72  156:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   73  159:astore_0        
				try
				{
					a[MissionStatusAction.ReturnToDock.ordinal()] = 2;
				}
			//*  74  160:goto            108
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   75  163:astore_0        
				try
				{
					a[MissionStatusAction.EndNow.ordinal()] = 3;
				}
			//*  76  164:goto            119
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   77  167:astore_0        
			//*  78  168:return          
			}
		}

		int i1;
		switch(com.irobot.home.fragments._cls4.a[missionstatusaction.ordinal()])
	//*   0    0:getstatic       #78  <Field int[] com.irobot.home.fragments.bk$4.a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #84  <Method int MissionStatusAction.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 42
	//	               2 42
	//	               3 42
		default:
			i1 = 0x7f0f079b;
	//    5   36:ldc1            #85  <Int 0x7f0f079b>
	//    6   38:istore_2        
			break;

	//*   7   39:goto            45
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			i1 = 0x7f0f02a6;
	//    8   42:ldc1            #86  <Int 0x7f0f02a6>
	//    9   44:istore_2        
			break;
		}
		j.setText(i1);
	//   10   45:aload_0         
	//   11   46:getfield        #88  <Field TextView j>
	//   12   49:iload_2         
	//   13   50:invokevirtual   #94  <Method void TextView.setText(int)>
	//   14   53:return          
	}

	private void a(boolean flag, boolean flag1)
	{
		g.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field CustomButton g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #103 <Method void CustomButton.setEnabled(boolean)>
		h.setEnabled(flag1);
	//    4    8:aload_0         
	//    5    9:getfield        #105 <Field CustomButton h>
	//    6   12:iload_2         
	//    7   13:invokevirtual   #103 <Method void CustomButton.setEnabled(boolean)>
	//    8   16:return          
	}

	static boolean a(bk bk1)
	{
		return bk1.u;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean u>
	//    2    4:ireturn         
	}

	static boolean b(bk bk1)
	{
		return bk1.s;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean s>
	//    2    4:ireturn         
	}

	static void c(bk bk1)
	{
		bk1.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method void j()>
	//    2    4:return          
	}

	static int d(bk bk1)
	{
		return bk1.q;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int q>
	//    2    4:ireturn         
	}

	static void e(bk bk1)
	{
		bk1.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void h()>
	//    2    4:return          
	}

	static Handler f(bk bk1)
	{
		return bk1.w;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Handler w>
	//    2    4:areturn         
	}

	private void g()
	{
		if(y != null && y.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field AlertDialog y>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #72  <Field AlertDialog y>
	//*   5   11:invokevirtual   #125 <Method boolean AlertDialog.isShowing()>
	//*   6   14:ifeq            18
			return;
	//    7   17:return          
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((android.content.Context) (getActivity())));
	//    8   18:new             #127 <Class android.app.AlertDialog$Builder>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokevirtual   #131 <Method android.app.Activity getActivity()>
	//   12   26:invokespecial   #134 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   13   29:astore_1        
		ArrayList arraylist = new ArrayList();
	//   14   30:new             #136 <Class ArrayList>
	//   15   33:dup             
	//   16   34:invokespecial   #137 <Method void ArrayList()>
	//   17   37:astore_2        
		((List) (arraylist)).add(((Object) (getString(0x7f0f0780))));
	//   18   38:aload_2         
	//   19   39:aload_0         
	//   20   40:ldc1            #138 <Int 0x7f0f0780>
	//   21   42:invokevirtual   #142 <Method String getString(int)>
	//   22   45:invokeinterface #148 <Method boolean List.add(Object)>
	//   23   50:pop             
		if(t)
	//*  24   51:aload_0         
	//*  25   52:getfield        #56  <Field boolean t>
	//*  26   55:ifeq            71
			((List) (arraylist)).add(((Object) (getString(0x7f0f0782))));
	//   27   58:aload_2         
	//   28   59:aload_0         
	//   29   60:ldc1            #149 <Int 0x7f0f0782>
	//   30   62:invokevirtual   #142 <Method String getString(int)>
	//   31   65:invokeinterface #148 <Method boolean List.add(Object)>
	//   32   70:pop             
		((List) (arraylist)).add(((Object) (getString(0x7f0f017d))));
	//   33   71:aload_2         
	//   34   72:aload_0         
	//   35   73:ldc1            #150 <Int 0x7f0f017d>
	//   36   75:invokevirtual   #142 <Method String getString(int)>
	//   37   78:invokeinterface #148 <Method boolean List.add(Object)>
	//   38   83:pop             
		builder.setItems((CharSequence[])((List) (arraylist)).toArray(((Object []) (new CharSequence[((List) (arraylist)).size()]))), new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i1)
			{
				switch(i1)
			//*   0    0:iload_2         
				{
			//*   1    1:tableswitch     0 1: default 24
			//			               0 67
			//			               1 40
				default:
					a.a.a(MissionStatusAction.Cancel);
			//    2   24:aload_0         
			//    3   25:getfield        #17  <Field bk a>
			//    4   28:getfield        #25  <Field i$a com.irobot.home.fragments.bk.a>
			//    5   31:getstatic       #31  <Field MissionStatusAction MissionStatusAction.Cancel>
			//    6   34:invokeinterface #36  <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
					return;
			//    7   39:return          

				case 1: // '\001'
					if(bk.g(a))
			//*   8   40:aload_0         
			//*   9   41:getfield        #17  <Field bk a>
			//*  10   44:invokestatic    #39  <Method boolean bk.g(bk)>
			//*  11   47:ifeq            57
						bk.h(a);
			//   12   50:aload_0         
			//   13   51:getfield        #17  <Field bk a>
			//   14   54:invokestatic    #42  <Method void bk.h(bk)>
					com.irobot.home.fragments.bk.a(a, ((AlertDialog) (null)));
			//   15   57:aload_0         
			//   16   58:getfield        #17  <Field bk a>
			//   17   61:aconst_null     
			//   18   62:invokestatic    #45  <Method AlertDialog com.irobot.home.fragments.bk.a(bk, AlertDialog)>
			//   19   65:pop             
					return;
			//   20   66:return          

				case 0: // '\0'
					bk.e(a);
			//   21   67:aload_0         
			//   22   68:getfield        #17  <Field bk a>
			//   23   71:invokestatic    #48  <Method void bk.e(bk)>
					com.irobot.home.fragments.bk.a(a, ((AlertDialog) (null)));
			//   24   74:aload_0         
			//   25   75:getfield        #17  <Field bk a>
			//   26   78:aconst_null     
			//   27   79:invokestatic    #45  <Method AlertDialog com.irobot.home.fragments.bk.a(bk, AlertDialog)>
			//   28   82:pop             
					return;
			//   29   83:return          
				}
			}

			final bk a;

			
			{
				a = bk.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field bk a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   39   84:aload_1         
	//   40   85:aload_2         
	//   41   86:aload_2         
	//   42   87:invokeinterface #153 <Method int List.size()>
	//   43   92:anewarray       CharSequence[]
	//   44   95:invokeinterface #159 <Method Object[] List.toArray(Object[])>
	//   45  100:checkcast       #161 <Class CharSequence[]>
	//   46  103:new             #8   <Class bk$2>
	//   47  106:dup             
	//   48  107:aload_0         
	//   49  108:invokespecial   #162 <Method void bk$2(bk)>
	//   50  111:invokevirtual   #166 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setItems(CharSequence[], android.content.DialogInterface$OnClickListener)>
	//   51  114:pop             
		builder.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

			public void onDismiss(DialogInterface dialoginterface)
			{
				a.a.a(MissionStatusAction.Cancel);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field bk a>
			//    2    4:getfield        #25  <Field i$a com.irobot.home.fragments.bk.a>
			//    3    7:getstatic       #31  <Field MissionStatusAction MissionStatusAction.Cancel>
			//    4   10:invokeinterface #36  <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
			//    5   15:return          
			}

			final bk a;

			
			{
				a = bk.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field bk a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   52  115:aload_1         
	//   53  116:new             #10  <Class bk$3>
	//   54  119:dup             
	//   55  120:aload_0         
	//   56  121:invokespecial   #167 <Method void bk$3(bk)>
	//   57  124:invokevirtual   #171 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//   58  127:pop             
		y = builder.create();
	//   59  128:aload_0         
	//   60  129:aload_1         
	//   61  130:invokevirtual   #175 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   62  133:putfield        #72  <Field AlertDialog y>
		y.show();
	//   63  136:aload_0         
	//   64  137:getfield        #72  <Field AlertDialog y>
	//   65  140:invokevirtual   #178 <Method void AlertDialog.show()>
	//   66  143:return          
	}

	private void g(boolean flag)
	{
		if(isAdded() && getActivity() != null && l != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #181 <Method boolean isAdded()>
	//*   2    4:ifeq            43
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #131 <Method android.app.Activity getActivity()>
	//*   5   11:ifnull          43
	//*   6   14:aload_0         
	//*   7   15:getfield        #183 <Field BatteryGaugeView l>
	//*   8   18:ifnull          43
		{
			BatteryGaugeView batterygaugeview = l;
	//    9   21:aload_0         
	//   10   22:getfield        #183 <Field BatteryGaugeView l>
	//   11   25:astore_3        
			byte byte0;
			if(flag)
	//*  12   26:iload_1         
	//*  13   27:ifeq            35
				byte0 = 0;
	//   14   30:iconst_0        
	//   15   31:istore_2        
			else
	//*  16   32:goto            38
				byte0 = 8;
	//   17   35:bipush          8
	//   18   37:istore_2        
			batterygaugeview.setVisibility(((int) (byte0)));
	//   19   38:aload_3         
	//   20   39:iload_2         
	//   21   40:invokevirtual   #188 <Method void BatteryGaugeView.setVisibility(int)>
		}
	//   22   43:return          
	}

	static boolean g(bk bk1)
	{
		return bk1.t;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean t>
	//    2    4:ireturn         
	}

	private void h()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field i$a a>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			a.a(MissionStatusAction.EndNow);
	//    4    8:aload_0         
	//    5    9:getfield        #191 <Field i$a a>
	//    6   12:getstatic       #195 <Field MissionStatusAction MissionStatusAction.EndNow>
	//    7   15:invokeinterface #199 <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
			a(MissionStatusAction.EndNow);
	//    8   20:aload_0         
	//    9   21:getstatic       #195 <Field MissionStatusAction MissionStatusAction.EndNow>
	//   10   24:invokespecial   #200 <Method void a(MissionStatusAction)>
			return;
	//   11   27:return          
		}
	}

	static void h(bk bk1)
	{
		bk1.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #202 <Method void i()>
	//    2    4:return          
	}

	private void h(boolean flag)
	{
		o = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean o>
		if(o)
	//*   3    5:aload_0         
	//*   4    6:getfield        #50  <Field boolean o>
	//*   5    9:ifeq            43
		{
			w.removeCallbacks(x);
	//    6   12:aload_0         
	//    7   13:getfield        #65  <Field Handler w>
	//    8   16:aload_0         
	//    9   17:getfield        #70  <Field Runnable x>
	//   10   20:invokevirtual   #206 <Method void Handler.removeCallbacks(Runnable)>
			j();
	//   11   23:aload_0         
	//   12   24:invokespecial   #110 <Method void j()>
			w.postDelayed(x, 1000L);
	//   13   27:aload_0         
	//   14   28:getfield        #65  <Field Handler w>
	//   15   31:aload_0         
	//   16   32:getfield        #70  <Field Runnable x>
	//   17   35:ldc2w           #207 <Long 1000L>
	//   18   38:invokevirtual   #212 <Method boolean Handler.postDelayed(Runnable, long)>
	//   19   41:pop             
			return;
	//   20   42:return          
		} else
		{
			w.removeCallbacks(x);
	//   21   43:aload_0         
	//   22   44:getfield        #65  <Field Handler w>
	//   23   47:aload_0         
	//   24   48:getfield        #70  <Field Runnable x>
	//   25   51:invokevirtual   #206 <Method void Handler.removeCallbacks(Runnable)>
			v = -1;
	//   26   54:aload_0         
	//   27   55:iconst_m1       
	//   28   56:putfield        #60  <Field int v>
			return;
	//   29   59:return          
		}
	}

	private void i()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field i$a a>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			a.a(MissionStatusAction.ReturnToDock);
	//    4    8:aload_0         
	//    5    9:getfield        #191 <Field i$a a>
	//    6   12:getstatic       #215 <Field MissionStatusAction MissionStatusAction.ReturnToDock>
	//    7   15:invokeinterface #199 <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
			a(MissionStatusAction.ReturnToDock);
	//    8   20:aload_0         
	//    9   21:getstatic       #215 <Field MissionStatusAction MissionStatusAction.ReturnToDock>
	//   10   24:invokespecial   #200 <Method void a(MissionStatusAction)>
			return;
	//   11   27:return          
		}
	}

	private void j()
	{
		int i1;
		if(r > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field int r>
	//*   2    4:ifle            15
			i1 = r;
	//    3    7:aload_0         
	//    4    8:getfield        #217 <Field int r>
	//    5   11:istore_1        
		else
	//*   6   12:goto            20
			i1 = q;
	//    7   15:aload_0         
	//    8   16:getfield        #114 <Field int q>
	//    9   19:istore_1        
		if(s && v != i1)
	//*  10   20:aload_0         
	//*  11   21:getfield        #54  <Field boolean s>
	//*  12   24:ifeq            190
	//*  13   27:aload_0         
	//*  14   28:getfield        #60  <Field int v>
	//*  15   31:iload_1         
	//*  16   32:icmpeq          190
		{
			Object obj = ((Object) (com.irobot.home.util.j.a(i1, getResources())));
	//   17   35:iload_1         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #221 <Method Resources getResources()>
	//   20   40:invokestatic    #226 <Method String j.a(int, Resources)>
	//   21   43:astore_3        
			if(e)
	//*  22   44:aload_0         
	//*  23   45:getfield        #228 <Field boolean e>
	//*  24   48:ifeq            98
			{
				Resources resources = getResources();
	//   25   51:aload_0         
	//   26   52:invokevirtual   #221 <Method Resources getResources()>
	//   27   55:astore          4
				int j1;
				if(r > 0)
	//*  28   57:aload_0         
	//*  29   58:getfield        #217 <Field int r>
	//*  30   61:ifle            70
					j1 = 0x7f0f08eb;
	//   31   64:ldc1            #229 <Int 0x7f0f08eb>
	//   32   66:istore_2        
				else
	//*  33   67:goto            73
					j1 = 0x7f0f08e4;
	//   34   70:ldc1            #230 <Int 0x7f0f08e4>
	//   35   72:istore_2        
				obj = ((Object) (new StringBuilder(resources.getString(j1, new Object[] {
					obj
				}))));
	//   36   73:new             #232 <Class StringBuilder>
	//   37   76:dup             
	//   38   77:aload           4
	//   39   79:iload_2         
	//   40   80:iconst_1        
	//   41   81:anewarray       Object[]
	//   42   84:dup             
	//   43   85:iconst_0        
	//   44   86:aload_3         
	//   45   87:aastore         
	//   46   88:invokevirtual   #239 <Method String Resources.getString(int, Object[])>
	//   47   91:invokespecial   #242 <Method void StringBuilder(String)>
	//   48   94:astore_3        
			} else
	//*  49   95:goto            142
			{
				Resources resources1 = getResources();
	//   50   98:aload_0         
	//   51   99:invokevirtual   #221 <Method Resources getResources()>
	//   52  102:astore          4
				int k1;
				if(r > 0)
	//*  53  104:aload_0         
	//*  54  105:getfield        #217 <Field int r>
	//*  55  108:ifle            117
					k1 = 0x7f0f01bd;
	//   56  111:ldc1            #243 <Int 0x7f0f01bd>
	//   57  113:istore_2        
				else
	//*  58  114:goto            120
					k1 = 0x7f0f01b0;
	//   59  117:ldc1            #244 <Int 0x7f0f01b0>
	//   60  119:istore_2        
				obj = ((Object) (new StringBuilder(resources1.getString(k1, new Object[] {
					obj
				}))));
	//   61  120:new             #232 <Class StringBuilder>
	//   62  123:dup             
	//   63  124:aload           4
	//   64  126:iload_2         
	//   65  127:iconst_1        
	//   66  128:anewarray       Object[]
	//   67  131:dup             
	//   68  132:iconst_0        
	//   69  133:aload_3         
	//   70  134:aastore         
	//   71  135:invokevirtual   #239 <Method String Resources.getString(int, Object[])>
	//   72  138:invokespecial   #242 <Method void StringBuilder(String)>
	//   73  141:astore_3        
			}
			if(r > 0 && p)
	//*  74  142:aload_0         
	//*  75  143:getfield        #217 <Field int r>
	//*  76  146:ifle            174
	//*  77  149:aload_0         
	//*  78  150:getfield        #52  <Field boolean p>
	//*  79  153:ifeq            174
			{
				((StringBuilder) (obj)).append("\n\n");
	//   80  156:aload_3         
	//   81  157:ldc1            #246 <String "\n\n">
	//   82  159:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   83  162:pop             
				((StringBuilder) (obj)).append(getString(0x7f0f0734));
	//   84  163:aload_3         
	//   85  164:aload_0         
	//   86  165:ldc1            #251 <Int 0x7f0f0734>
	//   87  167:invokevirtual   #142 <Method String getString(int)>
	//   88  170:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   89  173:pop             
			}
			j.setText(((CharSequence) (((StringBuilder) (obj)).toString())));
	//   90  174:aload_0         
	//   91  175:getfield        #88  <Field TextView j>
	//   92  178:aload_3         
	//   93  179:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   94  182:invokevirtual   #258 <Method void TextView.setText(CharSequence)>
			v = i1;
	//   95  185:aload_0         
	//   96  186:iload_1         
	//   97  187:putfield        #60  <Field int v>
		}
	//   98  190:return          
	}

	public void a()
	{
		l.a(com.irobot.home.view.BatteryGaugeView.a.SIMPLE);
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field BatteryGaugeView l>
	//    2    4:getstatic       #264 <Field com.irobot.home.view.BatteryGaugeView$a com.irobot.home.view.BatteryGaugeView$a.SIMPLE>
	//    3    7:invokevirtual   #267 <Method void BatteryGaugeView.a(com.irobot.home.view.BatteryGaugeView$a)>
	//    4   10:return          
	}

	public void a(int i1, boolean flag, String s1)
	{
		l.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field BatteryGaugeView l>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #188 <Method void BatteryGaugeView.setVisibility(int)>
		l.a(i1, flag);
	//    4    8:aload_0         
	//    5    9:getfield        #183 <Field BatteryGaugeView l>
	//    6   12:iload_1         
	//    7   13:i2f             
	//    8   14:iload_2         
	//    9   15:invokevirtual   #271 <Method void BatteryGaugeView.a(float, boolean)>
		if(s1 != null)
	//*  10   18:aload_3         
	//*  11   19:ifnull          30
			l.setContentDescription(((CharSequence) (s1)));
	//   12   22:aload_0         
	//   13   23:getfield        #183 <Field BatteryGaugeView l>
	//   14   26:aload_3         
	//   15   27:invokevirtual   #274 <Method void BatteryGaugeView.setContentDescription(CharSequence)>
	//   16   30:return          
	}

	public void a(CurrentConnectionState currentconnectionstate)
	{
		boolean flag;
		if(currentconnectionstate != CurrentConnectionState.ConnectedLocally && currentconnectionstate != CurrentConnectionState.ConnectedRemotely)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #281 <Field CurrentConnectionState CurrentConnectionState.ConnectedLocally>
	//*   2    4:if_acmpeq       22
	//*   3    7:aload_1         
	//*   4    8:getstatic       #284 <Field CurrentConnectionState CurrentConnectionState.ConnectedRemotely>
	//*   5   11:if_acmpne       17
	//*   6   14:goto            22
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_2        
		else
	//*   9   19:goto            24
			flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_2        
		g(flag);
	//   12   24:aload_0         
	//   13   25:iload_2         
	//   14   26:invokespecial   #286 <Method void g(boolean)>
	//   15   29:return          
	}

	public void a(ResolvedMissionStatus resolvedmissionstatus)
	{
		boolean flag1;
		String s1 = n;
	//    0    0:getstatic       #289 <Field String n>
	//    1    3:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #232 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #290 <Method void StringBuilder()>
	//    5   12:astore          5
		stringbuilder.append("Updating for asset resolved mission status: ");
	//    6   14:aload           5
	//    7   16:ldc2            #292 <String "Updating for asset resolved mission status: ">
	//    8   19:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:pop             
		stringbuilder.append(resolvedmissionstatus.name());
	//   10   23:aload           5
	//   11   25:aload_1         
	//   12   26:invokevirtual   #297 <Method String ResolvedMissionStatus.name()>
	//   13   29:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   15   33:aload           4
	//   16   35:aload           5
	//   17   37:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   18   40:invokestatic    #302 <Method void o.b(String, String)>
		flag1 = false;
	//   19   43:iconst_0        
	//   20   44:istore_3        
		p = false;
	//   21   45:aload_0         
	//   22   46:iconst_0        
	//   23   47:putfield        #52  <Field boolean p>
		_cls4.b[resolvedmissionstatus.ordinal()];
	//   24   50:getstatic       #304 <Field int[] bk$4.b>
	//   25   53:aload_1         
	//   26   54:invokevirtual   #305 <Method int ResolvedMissionStatus.ordinal()>
	//   27   57:iaload          
		JVM INSTR tableswitch 1 7: default 100
	//	               1 149
	//	               2 149
	//	               3 142
	//	               4 132
	//	               5 124
	//	               6 142
	//	               7 112;
	//   28   58:tableswitch     1 7: default 100
	//	               1 149
	//	               2 149
	//	               3 142
	//	               4 132
	//	               5 124
	//	               6 142
	//	               7 112
		   goto _L1 _L2 _L2 _L3 _L4 _L5 _L3 _L6
_L1:
		a(false, false);
	//   29  100:aload_0         
	//   30  101:iconst_0        
	//   31  102:iconst_0        
	//   32  103:invokespecial   #307 <Method void a(boolean, boolean)>
		v = -1;
	//   33  106:aload_0         
	//   34  107:iconst_m1       
	//   35  108:putfield        #60  <Field int v>
		return;
	//   36  111:return          
_L6:
		a(false, true);
	//   37  112:aload_0         
	//   38  113:iconst_0        
	//   39  114:iconst_1        
	//   40  115:invokespecial   #307 <Method void a(boolean, boolean)>
_L8:
		p = true;
	//   41  118:aload_0         
	//   42  119:iconst_1        
	//   43  120:putfield        #52  <Field boolean p>
		return;
	//   44  123:return          
_L5:
		t = true;
	//   45  124:aload_0         
	//   46  125:iconst_1        
	//   47  126:putfield        #56  <Field boolean t>
		break; /* Loop/switch isn't completed */
	//   48  129:goto            137
_L4:
		t = false;
	//   49  132:aload_0         
	//   50  133:iconst_0        
	//   51  134:putfield        #56  <Field boolean t>
		g();
	//   52  137:aload_0         
	//   53  138:invokespecial   #309 <Method void g()>
		return;
	//   54  141:return          
_L3:
		a(false, true);
	//   55  142:aload_0         
	//   56  143:iconst_0        
	//   57  144:iconst_1        
	//   58  145:invokespecial   #307 <Method void a(boolean, boolean)>
		return;
	//   59  148:return          
_L2:
		a(true, true);
	//   60  149:aload_0         
	//   61  150:iconst_1        
	//   62  151:iconst_1        
	//   63  152:invokespecial   #307 <Method void a(boolean, boolean)>
		resolvedmissionstatus = ((ResolvedMissionStatus) (com.irobot.home.util.j.j()));
	//   64  155:invokestatic    #312 <Method a j.j()>
	//   65  158:astore_1        
		boolean flag = flag1;
	//   66  159:iload_3         
	//   67  160:istore_2        
		if(resolvedmissionstatus != null)
	//*  68  161:aload_1         
	//*  69  162:ifnull          190
		{
			resolvedmissionstatus = ((ResolvedMissionStatus) (((a) (resolvedmissionstatus)).a()));
	//   70  165:aload_1         
	//   71  166:invokevirtual   #317 <Method com.irobot.core.AssetInfo a.a()>
	//   72  169:astore_1        
			flag = flag1;
	//   73  170:iload_3         
	//   74  171:istore_2        
			if(AssetCapabilityUtils.isCloudCapable(((com.irobot.core.AssetInfo) (resolvedmissionstatus))))
	//*  75  172:aload_1         
	//*  76  173:invokestatic    #323 <Method boolean AssetCapabilityUtils.isCloudCapable(com.irobot.core.AssetInfo)>
	//*  77  176:ifeq            190
			{
				flag = flag1;
	//   78  179:iload_3         
	//   79  180:istore_2        
				if(AssetCapabilityUtils.isMoppingRobot(((com.irobot.core.AssetInfo) (resolvedmissionstatus))))
	//*  80  181:aload_1         
	//*  81  182:invokestatic    #326 <Method boolean AssetCapabilityUtils.isMoppingRobot(com.irobot.core.AssetInfo)>
	//*  82  185:ifeq            190
					flag = true;
	//   83  188:iconst_1        
	//   84  189:istore_2        
			}
		}
		if(!flag)
	//*  85  190:iload_2         
	//*  86  191:ifeq            197
	//*  87  194:goto            118
			return;
	//   88  197:return          
		if(true) goto _L8; else goto _L7
_L7:
	}

	public void a(boolean flag)
	{
		super.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #328 <Method void com.irobot.home.fragments.i.a(boolean)>
		if(isAdded() && isVisible())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #181 <Method boolean isAdded()>
	//*   5    9:ifeq            44
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #331 <Method boolean isVisible()>
	//*   8   16:ifeq            44
		{
			ImageView imageview = i;
	//    9   19:aload_0         
	//   10   20:getfield        #333 <Field ImageView i>
	//   11   23:astore_3        
			byte byte0;
			if(c)
	//*  12   24:aload_0         
	//*  13   25:getfield        #335 <Field boolean c>
	//*  14   28:ifeq            36
				byte0 = 0;
	//   15   31:iconst_0        
	//   16   32:istore_2        
			else
	//*  17   33:goto            39
				byte0 = 8;
	//   18   36:bipush          8
	//   19   38:istore_2        
			imageview.setVisibility(((int) (byte0)));
	//   20   39:aload_3         
	//   21   40:iload_2         
	//   22   41:invokevirtual   #338 <Method void ImageView.setVisibility(int)>
		}
	//   23   44:return          
	}

	public void b()
	{
		j.setText(0x7f0f0451);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field TextView j>
	//    2    4:ldc2            #339 <Int 0x7f0f0451>
	//    3    7:invokevirtual   #94  <Method void TextView.setText(int)>
	//    4   10:return          
	}

	public void b(int i1)
	{
		q = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field int q>
		s = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #54  <Field boolean s>
	//    6   10:return          
	}

	public void b(String s1)
	{
		if(isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #181 <Method boolean isAdded()>
	//*   2    4:ifeq            15
			k.setText(((CharSequence) (s1)));
	//    3    7:aload_0         
	//    4    8:getfield        #341 <Field TextView k>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #258 <Method void TextView.setText(CharSequence)>
	//    7   15:return          
	}

	protected void c()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field i$a a>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			a.a(MissionStatusAction.Resume);
	//    4    8:aload_0         
	//    5    9:getfield        #191 <Field i$a a>
	//    6   12:getstatic       #344 <Field MissionStatusAction MissionStatusAction.Resume>
	//    7   15:invokeinterface #199 <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
			a(MissionStatusAction.Resume);
	//    8   20:aload_0         
	//    9   21:getstatic       #344 <Field MissionStatusAction MissionStatusAction.Resume>
	//   10   24:invokespecial   #200 <Method void a(MissionStatusAction)>
			return;
	//   11   27:return          
		}
	}

	public void c(int i1)
	{
		r = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #217 <Field int r>
		s = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #54  <Field boolean s>
	//    6   10:return          
	}

	protected void d()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field i$a a>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			a.a(MissionStatusAction.EndJob);
	//    4    8:aload_0         
	//    5    9:getfield        #191 <Field i$a a>
	//    6   12:getstatic       #347 <Field MissionStatusAction MissionStatusAction.EndJob>
	//    7   15:invokeinterface #199 <Method void com.irobot.home.fragments.i$a.a(MissionStatusAction)>
			return;
	//    8   20:return          
		}
	}

	public void d(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            39
		{
			j.setText(((CharSequence) (getString(0x7f0f0443, new Object[] {
				b
			}))));
	//    2    4:aload_0         
	//    3    5:getfield        #88  <Field TextView j>
	//    4    8:aload_0         
	//    5    9:ldc2            #348 <Int 0x7f0f0443>
	//    6   12:iconst_1        
	//    7   13:anewarray       Object[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:aload_0         
	//   11   19:getfield        #350 <Field String b>
	//   12   22:aastore         
	//   13   23:invokevirtual   #351 <Method String getString(int, Object[])>
	//   14   26:invokevirtual   #258 <Method void TextView.setText(CharSequence)>
			f();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #353 <Method void f()>
			a(false, false);
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:invokespecial   #307 <Method void a(boolean, boolean)>
		}
	//   21   39:return          
	}

	public void e()
	{
		j.setText(((CharSequence) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field TextView j>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #258 <Method void TextView.setText(CharSequence)>
		h(true);
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:invokespecial   #355 <Method void h(boolean)>
	//    7   13:return          
	}

	public void e(boolean flag)
	{
		u = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field boolean u>
	//    3    5:return          
	}

	public void f()
	{
		h(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #355 <Method void h(boolean)>
	//    3    5:return          
	}

	public void f(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #357 <Field boolean f>
	//    3    5:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #360 <Method void i.onPause()>
		boolean flag = o;
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field boolean o>
	//    4    8:istore_1        
		h(false);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokespecial   #355 <Method void h(boolean)>
		o = flag;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #50  <Field boolean o>
	//   11   19:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method void i.onResume()>
		if(o)
	//*   2    4:aload_0         
	//*   3    5:getfield        #50  <Field boolean o>
	//*   4    8:ifeq            15
			e();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #365 <Method void e()>
	//    7   15:return          
	}

	private static final String n = "bk";
	CustomButton g;
	CustomButton h;
	ImageView i;
	TextView j;
	TextView k;
	BatteryGaugeView l;
	private boolean o;
	private boolean p;
	private int q;
	private int r;
	private volatile boolean s;
	private boolean t;
	private boolean u;
	private int v;
	private final Handler w = new Handler();
	private Runnable x;
	private AlertDialog y;

	static 
	{
	//    0    0:return          
	}
}
