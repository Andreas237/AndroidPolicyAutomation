// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.irobot.core.AddRobotServiceDataState;
import com.irobot.core.AddRobotUIService;
import com.irobot.core.AddRobotUIServiceCommand;
import com.irobot.core.AddRobotUIServiceData;
import com.irobot.core.AddRobotUIServiceDataCallback;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.NetworkAddress;
import com.irobot.home.model.IRobotModel;
import com.irobot.home.model.NetworkSettings;
import com.irobot.home.model.Robot;
import com.irobot.home.model.a;
import com.irobot.home.model.w;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.util.x;
import com.irobot.home.view.CustomButton;
import com.irobot.home.view.CustomVideoView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BaseDetectedSetupActivity, IRobotApplication

public class RoombaAddRobotSetupActivity extends BaseDetectedSetupActivity
	implements com.irobot.home.view.CustomVideoView.a
{
	private static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/irobot/home/RoombaAddRobotSetupActivity$a, s);
		//    0    0:ldc1            #2   <Class RoombaAddRobotSetupActivity$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RoombaAddRobotSetupActivity$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field RoombaAddRobotSetupActivity$a[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.irobot.home.RoombaAddRobotSetupActivity$a_3B_.clone()>
		//    2    6:checkcast       #42  <Class RoombaAddRobotSetupActivity$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a CONNECT;
		public static final a CONNECTED;
		public static final a CONNECTING;

		static 
		{
			CONNECT = new a("CONNECT", 0);
		//    0    0:new             #2   <Class RoombaAddRobotSetupActivity$a>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "CONNECT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void RoombaAddRobotSetupActivity$a(String, int)>
		//    5   10:putstatic       #23  <Field RoombaAddRobotSetupActivity$a CONNECT>
			CONNECTING = new a("CONNECTING", 1);
		//    6   13:new             #2   <Class RoombaAddRobotSetupActivity$a>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "CONNECTING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void RoombaAddRobotSetupActivity$a(String, int)>
		//   11   23:putstatic       #26  <Field RoombaAddRobotSetupActivity$a CONNECTING>
			CONNECTED = new a("CONNECTED", 2);
		//   12   26:new             #2   <Class RoombaAddRobotSetupActivity$a>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "CONNECTED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void RoombaAddRobotSetupActivity$a(String, int)>
		//   17   36:putstatic       #29  <Field RoombaAddRobotSetupActivity$a CONNECTED>
			$VALUES = (new a[] {
				CONNECT, CONNECTING, CONNECTED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       a[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field RoombaAddRobotSetupActivity$a CONNECT>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field RoombaAddRobotSetupActivity$a CONNECTING>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field RoombaAddRobotSetupActivity$a CONNECTED>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field RoombaAddRobotSetupActivity$a[] $VALUES>
		//*  33   64:return          
		}

		private a(String s, int i1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public RoombaAddRobotSetupActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void BaseDetectedSetupActivity()>
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #69  <Field int v>
		m = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean m>
		n = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean n>
	//   11   19:aload_0         
	//   12   20:new             #75  <Class Object>
	//   13   23:dup             
	//   14   24:invokespecial   #76  <Method void Object()>
	//   15   27:putfield        #78  <Field Object w>
		x = a.CONNECT;
	//   16   30:aload_0         
	//   17   31:getstatic       #81  <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECT>
	//   18   34:putfield        #83  <Field RoombaAddRobotSetupActivity$a x>
		A = ((AddRobotUIServiceDataCallback) (new AddRobotUIServiceDataCallback() {

			public void onAddRobotUIServiceDataChanged(AddRobotUIServiceData addrobotuiservicedata)
			{
				if(addrobotuiservicedata == null)
			//*   0    0:aload_1         
			//*   1    1:ifnonnull       5
					return;
			//    2    4:return          
				AddRobotServiceDataState addrobotservicedatastate;
				for(Iterator iterator = addrobotuiservicedata.getDataStateChangelist().iterator(); iterator.hasNext(); com.irobot.home.RoombaAddRobotSetupActivity.a(a, addrobotservicedatastate, addrobotuiservicedata))
			//*   3    5:aload_1         
			//*   4    6:invokevirtual   #24  <Method ArrayList AddRobotUIServiceData.getDataStateChangelist()>
			//*   5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
			//*   6   12:astore_2        
			//*   7   13:aload_2         
			//*   8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
			//*   9   19:ifeq            44
					addrobotservicedatastate = (AddRobotServiceDataState)iterator.next();
			//   10   22:aload_2         
			//   11   23:invokeinterface #40  <Method Object Iterator.next()>
			//   12   28:checkcast       #42  <Class AddRobotServiceDataState>
			//   13   31:astore_3        

			//   14   32:aload_0         
			//   15   33:getfield        #12  <Field RoombaAddRobotSetupActivity a>
			//   16   36:aload_3         
			//   17   37:aload_1         
			//   18   38:invokestatic    #45  <Method void com.irobot.home.RoombaAddRobotSetupActivity.a(RoombaAddRobotSetupActivity, AddRobotServiceDataState, AddRobotUIServiceData)>
			//*  19   41:goto            13
			//   20   44:return          
			}

			final RoombaAddRobotSetupActivity a;

			
			{
				a = RoombaAddRobotSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field RoombaAddRobotSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AddRobotUIServiceDataCallback()>
			//    5    9:return          
			}
		}
));
	//   19   37:aload_0         
	//   20   38:new             #8   <Class RoombaAddRobotSetupActivity$1>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:invokespecial   #86  <Method void RoombaAddRobotSetupActivity$1(RoombaAddRobotSetupActivity)>
	//   24   46:putfield        #88  <Field AddRobotUIServiceDataCallback A>
	//   25   49:return          
	}

	private void a(AddRobotServiceDataState addrobotservicedatastate, AddRobotUIServiceData addrobotuiservicedata)
	{
		static class _cls4
		{

			static final int a[];

			static 
			{
				a = new int[AddRobotServiceDataState.values().length];
			//    0    0:invokestatic    #18  <Method AddRobotServiceDataState[] AddRobotServiceDataState.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[AddRobotServiceDataState.AddRobotStarted.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotStarted>
			//    6   15:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotConnectedToAsset>
			//*  11   26:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] a>
			//*  15   34:getstatic       #34  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotInProgress>
			//*  16   37:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] a>
			//*  20   45:getstatic       #37  <Field AddRobotServiceDataState AddRobotServiceDataState.PasswordAvailable>
			//*  21   48:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] a>
			//*  25   56:getstatic       #40  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotFinished>
			//*  26   59:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] a>
			//*  30   67:getstatic       #43  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotBadState>
			//*  31   70:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] a>
			//*  35   79:getstatic       #46  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotSslHandshakeError>
			//*  36   82:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] a>
			//*  40   91:getstatic       #49  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotTimedOutConnecting>
			//*  41   94:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:getstatic       #20  <Field int[] a>
			//*  45  103:getstatic       #52  <Field AddRobotServiceDataState AddRobotServiceDataState.AddRobotTimedOutGettingPassword>
			//*  46  106:invokevirtual   #28  <Method int AddRobotServiceDataState.ordinal()>
			//*  47  109:bipush          9
			//*  48  111:iastore         
			//*  49  112:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   50  113:astore_0        
				try
				{
					a[AddRobotServiceDataState.AddRobotConnectedToAsset.ordinal()] = 2;
				}
			//*  51  114:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   52  117:astore_0        
				try
				{
					a[AddRobotServiceDataState.AddRobotInProgress.ordinal()] = 3;
				}
			//*  53  118:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   54  121:astore_0        
				try
				{
					a[AddRobotServiceDataState.PasswordAvailable.ordinal()] = 4;
				}
			//*  55  122:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   56  125:astore_0        
				try
				{
					a[AddRobotServiceDataState.AddRobotFinished.ordinal()] = 5;
				}
			//*  57  126:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   58  129:astore_0        
				try
				{
					a[AddRobotServiceDataState.AddRobotBadState.ordinal()] = 6;
				}
			//*  59  130:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   60  133:astore_0        
				try
				{
					a[AddRobotServiceDataState.AddRobotSslHandshakeError.ordinal()] = 7;
				}
			//*  61  134:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   62  137:astore_0        
				try
				{
					a[AddRobotServiceDataState.AddRobotTimedOutConnecting.ordinal()] = 8;
				}
			//*  63  138:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   64  141:astore_0        
				try
				{
					a[AddRobotServiceDataState.AddRobotTimedOutGettingPassword.ordinal()] = 9;
				}
			//*  65  142:goto            100
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   66  145:astore_0        
			//*  67  146:return          
			}
		}

		switch(com.irobot.home._cls4.a[addrobotservicedatastate.ordinal()])
	//*   0    0:getstatic       #92  <Field int[] com.irobot.home.RoombaAddRobotSetupActivity$4.a>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #98  <Method int AddRobotServiceDataState.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 9: default 60
	//	               1 147
	//	               2 137
	//	               3 127
	//	               4 118
	//	               5 86
	//	               6 69
	//	               7 69
	//	               8 69
	//	               9 69
		default:
			com.irobot.home.util.o.e(o, "Received a status that is not handled");
	//    5   60:getstatic       #63  <Field String o>
	//    6   63:ldc1            #100 <String "Received a status that is not handled">
	//    7   65:invokestatic    #106 <Method void o.e(String, String)>
			return;
	//    8   68:return          

		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
			y.unregisterSubscriber(A);
	//    9   69:aload_0         
	//   10   70:getfield        #108 <Field AddRobotUIService y>
	//   11   73:aload_0         
	//   12   74:getfield        #88  <Field AddRobotUIServiceDataCallback A>
	//   13   77:invokevirtual   #114 <Method boolean AddRobotUIService.unregisterSubscriber(AddRobotUIServiceDataCallback)>
	//   14   80:pop             
			j();
	//   15   81:aload_0         
	//   16   82:invokevirtual   #116 <Method void j()>
			return;
	//   17   85:return          

		case 5: // '\005'
			com.irobot.home.util.o.b(o, "Add robot finished");
	//   18   86:getstatic       #63  <Field String o>
	//   19   89:ldc1            #118 <String "Add robot finished">
	//   20   91:invokestatic    #121 <Method void o.b(String, String)>
			x = a.CONNECTED;
	//   21   94:aload_0         
	//   22   95:getstatic       #124 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTED>
	//   23   98:putfield        #83  <Field RoombaAddRobotSetupActivity$a x>
			y.unregisterSubscriber(A);
	//   24  101:aload_0         
	//   25  102:getfield        #108 <Field AddRobotUIService y>
	//   26  105:aload_0         
	//   27  106:getfield        #88  <Field AddRobotUIServiceDataCallback A>
	//   28  109:invokevirtual   #114 <Method boolean AddRobotUIService.unregisterSubscriber(AddRobotUIServiceDataCallback)>
	//   29  112:pop             
			g();
	//   30  113:aload_0         
	//   31  114:invokevirtual   #126 <Method void g()>
			return;
	//   32  117:return          

		case 4: // '\004'
			a(addrobotuiservicedata.getRobotPassword());
	//   33  118:aload_0         
	//   34  119:aload_2         
	//   35  120:invokevirtual   #131 <Method String AddRobotUIServiceData.getRobotPassword()>
	//   36  123:invokevirtual   #134 <Method void a(String)>
			return;
	//   37  126:return          

		case 3: // '\003'
			addrobotservicedatastate = ((AddRobotServiceDataState) (o));
	//   38  127:getstatic       #63  <Field String o>
	//   39  130:astore_1        
			addrobotuiservicedata = "Add in progress";
	//   40  131:ldc1            #136 <String "Add in progress">
	//   41  133:astore_2        
			break;

	//*  42  134:goto            154
		case 2: // '\002'
			addrobotservicedatastate = ((AddRobotServiceDataState) (o));
	//   43  137:getstatic       #63  <Field String o>
	//   44  140:astore_1        
			addrobotuiservicedata = "Connected to robot";
	//   45  141:ldc1            #138 <String "Connected to robot">
	//   46  143:astore_2        
			break;

	//*  47  144:goto            154
		case 1: // '\001'
			addrobotservicedatastate = ((AddRobotServiceDataState) (o));
	//   48  147:getstatic       #63  <Field String o>
	//   49  150:astore_1        
			addrobotuiservicedata = "Add Robot process started";
	//   50  151:ldc1            #140 <String "Add Robot process started">
	//   51  153:astore_2        
			break;
		}
		com.irobot.home.util.o.b(((String) (addrobotservicedatastate)), ((String) (addrobotuiservicedata)));
	//   52  154:aload_1         
	//   53  155:aload_2         
	//   54  156:invokestatic    #121 <Method void o.b(String, String)>
	//   55  159:return          
	}

	static void a(RoombaAddRobotSetupActivity roombaaddrobotsetupactivity)
	{
		roombaaddrobotsetupactivity.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void m()>
	//    2    4:return          
	}

	static void a(RoombaAddRobotSetupActivity roombaaddrobotsetupactivity, AddRobotServiceDataState addrobotservicedatastate, AddRobotUIServiceData addrobotuiservicedata)
	{
		roombaaddrobotsetupactivity.a(addrobotservicedatastate, addrobotuiservicedata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #145 <Method void a(AddRobotServiceDataState, AddRobotUIServiceData)>
	//    4    6:return          
	}

	private void m()
	{
		int i1;
		boolean flag;
		Object obj = ((Object) (i));
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field CustomButton i>
	//    2    4:astore          4
		a a1 = x;
	//    3    6:aload_0         
	//    4    7:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//    5   10:astore          5
		a a2 = a.CONNECT;
	//    6   12:getstatic       #81  <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECT>
	//    7   15:astore          6
		byte byte0 = 4;
	//    8   17:iconst_4        
	//    9   18:istore_2        
		if(a1 == a2)
	//*  10   19:aload           5
	//*  11   21:aload           6
	//*  12   23:if_acmpne       31
			i1 = 0;
	//   13   26:iconst_0        
	//   14   27:istore_1        
		else
	//*  15   28:goto            33
			i1 = 4;
	//   16   31:iconst_4        
	//   17   32:istore_1        
		((CustomButton) (obj)).setVisibility(i1);
	//   18   33:aload           4
	//   19   35:iload_1         
	//   20   36:invokevirtual   #153 <Method void CustomButton.setVisibility(int)>
		obj = ((Object) (c));
	//   21   39:aload_0         
	//   22   40:getfield        #157 <Field TextView c>
	//   23   43:astore          4
		i1 = ((int) (byte0));
	//   24   45:iload_2         
	//   25   46:istore_1        
		if(x == a.CONNECT)
	//*  26   47:aload_0         
	//*  27   48:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//*  28   51:getstatic       #81  <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECT>
	//*  29   54:if_acmpne       59
			i1 = 0;
	//   30   57:iconst_0        
	//   31   58:istore_1        
		((TextView) (obj)).setVisibility(i1);
	//   32   59:aload           4
	//   33   61:iload_1         
	//   34   62:invokevirtual   #160 <Method void TextView.setVisibility(int)>
		if(AssetCapabilityUtils.isCloudCapable(e) && AssetCapabilityUtils.isMoppingRobot(e))
	//*  35   65:aload_0         
	//*  36   66:getfield        #163 <Field AssetInfo e>
	//*  37   69:invokestatic    #169 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//*  38   72:ifeq            90
	//*  39   75:aload_0         
	//*  40   76:getfield        #163 <Field AssetInfo e>
	//*  41   79:invokestatic    #172 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  42   82:ifeq            90
			flag = true;
	//   43   85:iconst_1        
	//   44   86:istore_2        
		else
	//*  45   87:goto            92
			flag = false;
	//   46   90:iconst_0        
	//   47   91:istore_2        
		i1 = k.getMax() / 3;
	//   48   92:aload_0         
	//   49   93:getfield        #174 <Field ProgressBar k>
	//   50   96:invokevirtual   #179 <Method int ProgressBar.getMax()>
	//   51   99:iconst_3        
	//   52  100:idiv            
	//   53  101:istore_1        
		if(x != a.CONNECT) goto _L2; else goto _L1
	//   54  102:aload_0         
	//   55  103:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//   56  106:getstatic       #81  <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECT>
	//   57  109:if_acmpne       127
_L1:
		Object obj1 = ((Object) (k));
	//   58  112:aload_0         
	//   59  113:getfield        #174 <Field ProgressBar k>
	//   60  116:astore          4
_L4:
		((ProgressBar) (obj1)).setProgress(i1);
	//   61  118:aload           4
	//   62  120:iload_1         
	//   63  121:invokevirtual   #182 <Method void ProgressBar.setProgress(int)>
		break; /* Loop/switch isn't completed */
	//   64  124:goto            173
_L2:
		if(x == a.CONNECTING)
	//*  65  127:aload_0         
	//*  66  128:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//*  67  131:getstatic       #185 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTING>
	//*  68  134:if_acmpne       150
		{
			obj1 = ((Object) (k));
	//   69  137:aload_0         
	//   70  138:getfield        #174 <Field ProgressBar k>
	//   71  141:astore          4
			i1 *= 2;
	//   72  143:iload_1         
	//   73  144:iconst_2        
	//   74  145:imul            
	//   75  146:istore_1        
			continue; /* Loop/switch isn't completed */
	//   76  147:goto            118
		}
		if(x != a.CONNECTED)
			break; /* Loop/switch isn't completed */
	//   77  150:aload_0         
	//   78  151:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//   79  154:getstatic       #124 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTED>
	//   80  157:if_acmpne       173
		obj1 = ((Object) (k));
	//   81  160:aload_0         
	//   82  161:getfield        #174 <Field ProgressBar k>
	//   83  164:astore          4
		i1 *= 3;
	//   84  166:iload_1         
	//   85  167:iconst_3        
	//   86  168:imul            
	//   87  169:istore_1        
		if(true) goto _L4; else goto _L3
	//   88  170:goto            118
_L3:
		h.setVideoStatusListener(((com.irobot.home.view.CustomVideoView.a) (this)));
	//   89  173:aload_0         
	//   90  174:getfield        #187 <Field CustomVideoView h>
	//   91  177:aload_0         
	//   92  178:invokevirtual   #193 <Method void CustomVideoView.setVideoStatusListener(com.irobot.home.view.CustomVideoView$a)>
		obj1 = null;
	//   93  181:aconst_null     
	//   94  182:astore          4
		if(x == a.CONNECT)
	//*  95  184:aload_0         
	//*  96  185:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//*  97  188:getstatic       #81  <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECT>
	//*  98  191:if_acmpne       207
			obj1 = ((Object) (com.irobot.home.util.j.a(((Context) (this)), z)));
	//   99  194:aload_0         
	//  100  195:aload_0         
	//  101  196:getfield        #195 <Field int z>
	//  102  199:invokestatic    #198 <Method android.net.Uri j.a(Context, int)>
	//  103  202:astore          4
		else
	//* 104  204:goto            263
		if(x == a.CONNECTING)
	//* 105  207:aload_0         
	//* 106  208:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//* 107  211:getstatic       #185 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTING>
	//* 108  214:if_acmpne       263
		{
			h.b();
	//  109  217:aload_0         
	//  110  218:getfield        #187 <Field CustomVideoView h>
	//  111  221:invokevirtual   #200 <Method void CustomVideoView.b()>
			j.startAnimation(((android.view.animation.Animation) (u)));
	//  112  224:aload_0         
	//  113  225:getfield        #202 <Field ImageButton j>
	//  114  228:aload_0         
	//  115  229:getfield        #204 <Field AlphaAnimation u>
	//  116  232:invokevirtual   #210 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
			if(flag)
	//* 117  235:iload_2         
	//* 118  236:ifeq            245
				i1 = 0x7f0e020c;
	//  119  239:ldc1            #211 <Int 0x7f0e020c>
	//  120  241:istore_1        
			else
	//* 121  242:goto            248
				i1 = 0x7f0e01ff;
	//  122  245:ldc1            #212 <Int 0x7f0e01ff>
	//  123  247:istore_1        
			obj1 = ((Object) (com.irobot.home.util.j.a(((Context) (this)), i1)));
	//  124  248:aload_0         
	//  125  249:iload_1         
	//  126  250:invokestatic    #198 <Method android.net.Uri j.a(Context, int)>
	//  127  253:astore          4
			l.setScrollY(0);
	//  128  255:aload_0         
	//  129  256:getfield        #214 <Field ScrollView l>
	//  130  259:iconst_0        
	//  131  260:invokevirtual   #219 <Method void ScrollView.setScrollY(int)>
		}
		if(obj1 != null)
	//* 132  263:aload           4
	//* 133  265:ifnull          334
		{
			h.setSource(((android.net.Uri) (obj1)));
	//  134  268:aload_0         
	//  135  269:getfield        #187 <Field CustomVideoView h>
	//  136  272:aload           4
	//  137  274:invokevirtual   #223 <Method void CustomVideoView.setSource(android.net.Uri)>
			h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, com.irobot.home.util.j.a(((android.app.Activity) (this)), ((android.net.Uri) (obj1)))))));
	//  138  277:aload_0         
	//  139  278:getfield        #187 <Field CustomVideoView h>
	//  140  281:new             #225 <Class android.widget.RelativeLayout$LayoutParams>
	//  141  284:dup             
	//  142  285:iconst_m1       
	//  143  286:aload_0         
	//  144  287:aload           4
	//  145  289:invokestatic    #228 <Method int j.a(android.app.Activity, android.net.Uri)>
	//  146  292:invokespecial   #231 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  147  295:invokevirtual   #235 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			obj1 = ((Object) (h));
	//  148  298:aload_0         
	//  149  299:getfield        #187 <Field CustomVideoView h>
	//  150  302:astore          4
			boolean flag1;
			if(x == a.CONNECTING)
	//* 151  304:aload_0         
	//* 152  305:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//* 153  308:getstatic       #185 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTING>
	//* 154  311:if_acmpne       319
				flag1 = true;
	//  155  314:iconst_1        
	//  156  315:istore_3        
			else
	//* 157  316:goto            321
				flag1 = false;
	//  158  319:iconst_0        
	//  159  320:istore_3        
			((CustomVideoView) (obj1)).setLooping(flag1);
	//  160  321:aload           4
	//  161  323:iload_3         
	//  162  324:invokevirtual   #239 <Method void CustomVideoView.setLooping(boolean)>
			h.a();
	//  163  327:aload_0         
	//  164  328:getfield        #187 <Field CustomVideoView h>
	//  165  331:invokevirtual   #241 <Method void CustomVideoView.a()>
		}
		if(x != a.CONNECT) goto _L6; else goto _L5
	//  166  334:aload_0         
	//  167  335:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//  168  338:getstatic       #81  <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECT>
	//  169  341:if_acmpne       382
_L5:
		Object aobj[];
		obj1 = ((Object) (d));
	//  170  344:aload_0         
	//  171  345:getfield        #244 <Field TextView d>
	//  172  348:astore          4
		i1 = 0x7f0f021c;
	//  173  350:ldc1            #245 <Int 0x7f0f021c>
	//  174  352:istore_1        
		aobj = new Object[1];
	//  175  353:iconst_1        
	//  176  354:anewarray       Object[]
	//  177  357:astore          5
		aobj[0] = ((Object) (f));
	//  178  359:aload           5
	//  179  361:iconst_0        
	//  180  362:aload_0         
	//  181  363:getfield        #248 <Field String f>
	//  182  366:aastore         
_L8:
		((TextView) (obj1)).setText(((CharSequence) (getString(i1, aobj))));
	//  183  367:aload           4
	//  184  369:aload_0         
	//  185  370:iload_1         
	//  186  371:aload           5
	//  187  373:invokevirtual   #252 <Method String getString(int, Object[])>
	//  188  376:invokevirtual   #256 <Method void TextView.setText(CharSequence)>
		break MISSING_BLOCK_LABEL_439;
	//  189  379:goto            439
_L6:
		if(x != a.CONNECTING)
			break; /* Loop/switch isn't completed */
	//  190  382:aload_0         
	//  191  383:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//  192  386:getstatic       #185 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTING>
	//  193  389:if_acmpne       419
		obj1 = ((Object) (d));
	//  194  392:aload_0         
	//  195  393:getfield        #244 <Field TextView d>
	//  196  396:astore          4
		i1 = 0x7f0f022a;
	//  197  398:ldc2            #257 <Int 0x7f0f022a>
	//  198  401:istore_1        
		aobj = new Object[1];
	//  199  402:iconst_1        
	//  200  403:anewarray       Object[]
	//  201  406:astore          5
		aobj[0] = ((Object) (f));
	//  202  408:aload           5
	//  203  410:iconst_0        
	//  204  411:aload_0         
	//  205  412:getfield        #248 <Field String f>
	//  206  415:aastore         
		if(true) goto _L8; else goto _L7
	//  207  416:goto            367
_L7:
		if(x == a.CONNECTED)
	//* 208  419:aload_0         
	//* 209  420:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//* 210  423:getstatic       #124 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTED>
	//* 211  426:if_acmpne       439
			d.setText(0x7f0f088b);
	//  212  429:aload_0         
	//  213  430:getfield        #244 <Field TextView d>
	//  214  433:ldc2            #258 <Int 0x7f0f088b>
	//  215  436:invokevirtual   #260 <Method void TextView.setText(int)>
		com.irobot.home.util.j.a(d.getText(), ((Context) (this)), 16384);
	//  216  439:aload_0         
	//  217  440:getfield        #244 <Field TextView d>
	//  218  443:invokevirtual   #264 <Method CharSequence TextView.getText()>
	//  219  446:aload_0         
	//  220  447:sipush          16384
	//  221  450:invokestatic    #267 <Method void j.a(CharSequence, Context, int)>
		return;
	//  222  453:return          
	}

	public void a(int i1, int j1)
	{
	//    0    0:return          
	}

	public void a(String s)
	{
		Object obj = ((Object) (com.irobot.home.util.j.a(e.getAssetId().getId())));
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field AssetInfo e>
	//    2    4:invokevirtual   #273 <Method AssetId AssetInfo.getAssetId()>
	//    3    7:invokevirtual   #278 <Method String AssetId.getId()>
	//    4   10:invokestatic    #281 <Method a j.a(String)>
	//    5   13:astore_2        
		junit.b.a.a("Model asset must be cloud capable.", AssetCapabilityUtils.isCloudCapable(((com.irobot.home.model.a) (obj)).a()));
	//    6   14:ldc2            #283 <String "Model asset must be cloud capable.">
	//    7   17:aload_2         
	//    8   18:invokevirtual   #288 <Method AssetInfo a.a()>
	//    9   21:invokestatic    #169 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//   10   24:invokestatic    #293 <Method void junit.b.a.a(String, boolean)>
		obj = ((Object) (((w)obj).c()));
	//   11   27:aload_2         
	//   12   28:checkcast       #295 <Class w>
	//   13   31:invokevirtual   #298 <Method Robot w.c()>
	//   14   34:astore_2        
		if(obj != null)
	//*  15   35:aload_2         
	//*  16   36:ifnull          44
			((Robot) (obj)).a(s);
	//   17   39:aload_2         
	//   18   40:aload_1         
	//   19   41:invokevirtual   #301 <Method void Robot.a(String)>
	//   20   44:return          
	}

	protected void e()
	{
		synchronized(w)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field Object w>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			n = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #73  <Field boolean n>
			if(y != null && !m)
	//*   8   12:aload_0         
	//*   9   13:getfield        #108 <Field AddRobotUIService y>
	//*  10   16:ifnull          37
	//*  11   19:aload_0         
	//*  12   20:getfield        #71  <Field boolean m>
	//*  13   23:ifne            37
				y.sendCommand(AddRobotUIServiceCommand.Cancel, ((AddRobotUIServiceData) (null)));
	//   14   26:aload_0         
	//   15   27:getfield        #108 <Field AddRobotUIService y>
	//   16   30:getstatic       #307 <Field AddRobotUIServiceCommand AddRobotUIServiceCommand.Cancel>
	//   17   33:aconst_null     
	//   18   34:invokevirtual   #311 <Method void AddRobotUIService.sendCommand(AddRobotUIServiceCommand, AddRobotUIServiceData)>
		}
	//   19   37:aload_1         
	//   20   38:monitorexit     
		return;
	//   21   39:return          
		exception;
	//   22   40:astore_2        
		obj;
	//   23   41:aload_1         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		throw exception;
	//   25   43:aload_2         
	//   26   44:athrow          
	}

	public void e_()
	{
	//    0    0:return          
	}

	protected void f()
	{
		junit.b.a.a("Model asset must be cloud capable.", AssetCapabilityUtils.isCloudCapable(e));
	//    0    0:ldc2            #283 <String "Model asset must be cloud capable.">
	//    1    3:aload_0         
	//    2    4:getfield        #163 <Field AssetInfo e>
	//    3    7:invokestatic    #169 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//    4   10:invokestatic    #293 <Method void junit.b.a.a(String, boolean)>
		Assembler assembler = Assembler.getInstance();
	//    5   13:invokestatic    #318 <Method Assembler Assembler.getInstance()>
	//    6   16:astore_1        
		if(!assembler.isInitialized(e.getAssetId()))
	//*   7   17:aload_1         
	//*   8   18:aload_0         
	//*   9   19:getfield        #163 <Field AssetInfo e>
	//*  10   22:invokevirtual   #273 <Method AssetId AssetInfo.getAssetId()>
	//*  11   25:invokevirtual   #322 <Method boolean Assembler.isInitialized(AssetId)>
	//*  12   28:ifne            39
			assembler.initializeAsset(e);
	//   13   31:aload_1         
	//   14   32:aload_0         
	//   15   33:getfield        #163 <Field AssetInfo e>
	//   16   36:invokevirtual   #326 <Method void Assembler.initializeAsset(AssetInfo)>
		assembler.initializeAssetForAdding(e);
	//   17   39:aload_1         
	//   18   40:aload_0         
	//   19   41:getfield        #163 <Field AssetInfo e>
	//   20   44:invokevirtual   #329 <Method void Assembler.initializeAssetForAdding(AssetInfo)>
		com.irobot.home.util.j.b(e.getAssetId());
	//   21   47:aload_0         
	//   22   48:getfield        #163 <Field AssetInfo e>
	//   23   51:invokevirtual   #273 <Method AssetId AssetInfo.getAssetId()>
	//   24   54:invokestatic    #332 <Method void j.b(AssetId)>
		y = assembler.getAddRobotUIService(e.getAssetId());
	//   25   57:aload_0         
	//   26   58:aload_1         
	//   27   59:aload_0         
	//   28   60:getfield        #163 <Field AssetInfo e>
	//   29   63:invokevirtual   #273 <Method AssetId AssetInfo.getAssetId()>
	//   30   66:invokevirtual   #336 <Method AddRobotUIService Assembler.getAddRobotUIService(AssetId)>
	//   31   69:putfield        #108 <Field AddRobotUIService y>
		y.registerUISubscriber(A);
	//   32   72:aload_0         
	//   33   73:getfield        #108 <Field AddRobotUIService y>
	//   34   76:aload_0         
	//   35   77:getfield        #88  <Field AddRobotUIServiceDataCallback A>
	//   36   80:invokevirtual   #339 <Method boolean AddRobotUIService.registerUISubscriber(AddRobotUIServiceDataCallback)>
	//   37   83:pop             
		if(y != null)
	//*  38   84:aload_0         
	//*  39   85:getfield        #108 <Field AddRobotUIService y>
	//*  40   88:ifnull          123
		{
			n = false;
	//   41   91:aload_0         
	//   42   92:iconst_0        
	//   43   93:putfield        #73  <Field boolean n>
			AddRobotUIServiceData addrobotuiservicedata = AddRobotUIServiceData.create();
	//   44   96:invokestatic    #343 <Method AddRobotUIServiceData AddRobotUIServiceData.create()>
	//   45   99:astore_1        
			addrobotuiservicedata.setRobotAddress(NetworkAddress.httpsNetworkAddressForHost(g));
	//   46  100:aload_1         
	//   47  101:aload_0         
	//   48  102:getfield        #345 <Field String g>
	//   49  105:invokestatic    #351 <Method NetworkAddress NetworkAddress.httpsNetworkAddressForHost(String)>
	//   50  108:invokevirtual   #355 <Method void AddRobotUIServiceData.setRobotAddress(NetworkAddress)>
			y.sendCommand(AddRobotUIServiceCommand.Start, addrobotuiservicedata);
	//   51  111:aload_0         
	//   52  112:getfield        #108 <Field AddRobotUIService y>
	//   53  115:getstatic       #358 <Field AddRobotUIServiceCommand AddRobotUIServiceCommand.Start>
	//   54  118:aload_1         
	//   55  119:invokevirtual   #311 <Method void AddRobotUIService.sendCommand(AddRobotUIServiceCommand, AddRobotUIServiceData)>
			return;
	//   56  122:return          
		} else
		{
			com.irobot.home.util.o.e(o, "Encountered null add robot subsystem in tryToConnect() function");
	//   57  123:getstatic       #63  <Field String o>
	//   58  126:ldc2            #360 <String "Encountered null add robot subsystem in tryToConnect() function">
	//   59  129:invokestatic    #106 <Method void o.e(String, String)>
			return;
	//   60  132:return          
		}
	}

	public void f_()
	{
		j.startAnimation(((android.view.animation.Animation) (t)));
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field ImageButton j>
	//    2    4:aload_0         
	//    3    5:getfield        #363 <Field AlphaAnimation t>
	//    4    8:invokevirtual   #210 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		j.setClickable(true);
	//    5   11:aload_0         
	//    6   12:getfield        #202 <Field ImageButton j>
	//    7   15:iconst_1        
	//    8   16:invokevirtual   #366 <Method void ImageButton.setClickable(boolean)>
	//    9   19:return          
	}

	protected void g()
	{
label0:
		{
			synchronized(w)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field Object w>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!n)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #73  <Field boolean n>
	//    7   11:ifeq            17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		m = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #71  <Field boolean m>
		obj;
	//   14   22:aload_1         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		obj = ((Object) (e.getAssetId().getId()));
	//   16   24:aload_0         
	//   17   25:getfield        #163 <Field AssetInfo e>
	//   18   28:invokevirtual   #273 <Method AssetId AssetInfo.getAssetId()>
	//   19   31:invokevirtual   #278 <Method String AssetId.getId()>
	//   20   34:astore_1        
		com.irobot.home.model.a a1 = com.irobot.home.util.j.a(((String) (obj)));
	//   21   35:aload_1         
	//   22   36:invokestatic    #281 <Method a j.a(String)>
	//   23   39:astore_2        
		junit.b.a.a("Model asset must be cloud capable.", AssetCapabilityUtils.isCloudCapable(a1.a()));
	//   24   40:ldc2            #283 <String "Model asset must be cloud capable.">
	//   25   43:aload_2         
	//   26   44:invokevirtual   #288 <Method AssetInfo a.a()>
	//   27   47:invokestatic    #169 <Method boolean AssetCapabilityUtils.isCloudCapable(AssetInfo)>
	//   28   50:invokestatic    #293 <Method void junit.b.a.a(String, boolean)>
		Robot robot = ((w)a1).c();
	//   29   53:aload_2         
	//   30   54:checkcast       #295 <Class w>
	//   31   57:invokevirtual   #298 <Method Robot w.c()>
	//   32   60:astore_3        
		WifiInfo wifiinfo = ((WifiManager)getApplicationContext().getSystemService("wifi")).getConnectionInfo();
	//   33   61:aload_0         
	//   34   62:invokevirtual   #370 <Method Context getApplicationContext()>
	//   35   65:ldc2            #372 <String "wifi">
	//   36   68:invokevirtual   #378 <Method Object Context.getSystemService(String)>
	//   37   71:checkcast       #380 <Class WifiManager>
	//   38   74:invokevirtual   #384 <Method WifiInfo WifiManager.getConnectionInfo()>
	//   39   77:astore          4
		robot.d().a(com.irobot.home.util.j.e(wifiinfo.getSSID()));
	//   40   79:aload_3         
	//   41   80:invokevirtual   #387 <Method NetworkSettings Robot.d()>
	//   42   83:aload           4
	//   43   85:invokevirtual   #392 <Method String WifiInfo.getSSID()>
	//   44   88:invokestatic    #394 <Method String j.e(String)>
	//   45   91:invokevirtual   #397 <Method void NetworkSettings.a(String)>
		b.h().b(a1);
	//   46   94:aload_0         
	//   47   95:getfield        #400 <Field IRobotApplication b>
	//   48   98:invokevirtual   #405 <Method IRobotModel IRobotApplication.h()>
	//   49  101:aload_2         
	//   50  102:invokevirtual   #410 <Method void IRobotModel.b(a)>
		b.a(a1);
	//   51  105:aload_0         
	//   52  106:getfield        #400 <Field IRobotApplication b>
	//   53  109:aload_2         
	//   54  110:invokevirtual   #412 <Method void com.irobot.home.IRobotApplication.a(a)>
		r.b(((String) (obj)));
	//   55  113:aload_0         
	//   56  114:getfield        #415 <Field b r>
	//   57  117:aload_1         
	//   58  118:invokevirtual   #419 <Method void b.b(String)>
		setResult(-1);
	//   59  121:aload_0         
	//   60  122:iconst_m1       
	//   61  123:invokevirtual   #422 <Method void setResult(int)>
		obj = ((Object) (new Handler()));
	//   62  126:new             #424 <Class Handler>
	//   63  129:dup             
	//   64  130:invokespecial   #425 <Method void Handler()>
	//   65  133:astore_1        
		((Handler) (obj)).post(new Runnable() {

			public void run()
			{
				com.irobot.home.RoombaAddRobotSetupActivity.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaAddRobotSetupActivity a>
			//    2    4:invokestatic    #23  <Method void com.irobot.home.RoombaAddRobotSetupActivity.a(RoombaAddRobotSetupActivity)>
			//    3    7:return          
			}

			final RoombaAddRobotSetupActivity a;

			
			{
				a = RoombaAddRobotSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaAddRobotSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   66  134:aload_1         
	//   67  135:new             #10  <Class RoombaAddRobotSetupActivity$2>
	//   68  138:dup             
	//   69  139:aload_0         
	//   70  140:invokespecial   #426 <Method void RoombaAddRobotSetupActivity$2(RoombaAddRobotSetupActivity)>
	//   71  143:invokevirtual   #430 <Method boolean Handler.post(Runnable)>
	//   72  146:pop             
		((Handler) (obj)).postDelayed(new Runnable() {

			public void run()
			{
				a.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field RoombaAddRobotSetupActivity a>
			//    2    4:invokevirtual   #24  <Method void RoombaAddRobotSetupActivity.finish()>
			//    3    7:return          
			}

			final RoombaAddRobotSetupActivity a;

			
			{
				a = RoombaAddRobotSetupActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field RoombaAddRobotSetupActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 1500L);
	//   73  147:aload_1         
	//   74  148:new             #12  <Class RoombaAddRobotSetupActivity$3>
	//   75  151:dup             
	//   76  152:aload_0         
	//   77  153:invokespecial   #431 <Method void RoombaAddRobotSetupActivity$3(RoombaAddRobotSetupActivity)>
	//   78  156:ldc2w           #432 <Long 1500L>
	//   79  159:invokevirtual   #437 <Method boolean Handler.postDelayed(Runnable, long)>
	//   80  162:pop             
		return;
	//   81  163:return          
		exception;
	//   82  164:astore_2        
		obj;
	//   83  165:aload_1         
		JVM INSTR monitorexit ;
	//   84  166:monitorexit     
		throw exception;
	//   85  167:aload_2         
	//   86  168:athrow          
	}

	protected void h()
	{
		super.h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #439 <Method void BaseDetectedSetupActivity.h()>
		m = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #71  <Field boolean m>
		n = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #73  <Field boolean n>
		setResult(0);
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:invokevirtual   #422 <Method void setResult(int)>
		k.setVisibility(8);
	//   11   19:aload_0         
	//   12   20:getfield        #174 <Field ProgressBar k>
	//   13   23:bipush          8
	//   14   25:invokevirtual   #440 <Method void ProgressBar.setVisibility(int)>
		a(0x7f03000e, e.getSku());
	//   15   28:aload_0         
	//   16   29:ldc2            #441 <Int 0x7f03000e>
	//   17   32:aload_0         
	//   18   33:getfield        #163 <Field AssetInfo e>
	//   19   36:invokevirtual   #444 <Method String AssetInfo.getSku()>
	//   20   39:invokevirtual   #447 <Method void a(int, String)>
		z = com.irobot.home.util.x.a(e.getSku());
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:getfield        #163 <Field AssetInfo e>
	//   24   47:invokevirtual   #444 <Method String AssetInfo.getSku()>
	//   25   50:invokestatic    #452 <Method int x.a(String)>
	//   26   53:putfield        #195 <Field int z>
		j.setColorFilter(getResources().getColor(0x7f060078), android.graphics.PorterDuff.Mode.MULTIPLY);
	//   27   56:aload_0         
	//   28   57:getfield        #202 <Field ImageButton j>
	//   29   60:aload_0         
	//   30   61:invokevirtual   #456 <Method Resources getResources()>
	//   31   64:ldc2            #457 <Int 0x7f060078>
	//   32   67:invokevirtual   #463 <Method int Resources.getColor(int)>
	//   33   70:getstatic       #469 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   34   73:invokevirtual   #473 <Method void ImageButton.setColorFilter(int, android.graphics.PorterDuff$Mode)>
		j.setVisibility(4);
	//   35   76:aload_0         
	//   36   77:getfield        #202 <Field ImageButton j>
	//   37   80:iconst_4        
	//   38   81:invokevirtual   #474 <Method void ImageButton.setVisibility(int)>
		t = com.irobot.home.util.j.a(0.0F, 1.0F, 0L, 200L, true);
	//   39   84:aload_0         
	//   40   85:fconst_0        
	//   41   86:fconst_1        
	//   42   87:lconst_0        
	//   43   88:ldc2w           #475 <Long 200L>
	//   44   91:iconst_1        
	//   45   92:invokestatic    #479 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//   46   95:putfield        #363 <Field AlphaAnimation t>
		u = com.irobot.home.util.j.a(1.0F, 0.0F, 100L, 200L, true);
	//   47   98:aload_0         
	//   48   99:fconst_1        
	//   49  100:fconst_0        
	//   50  101:ldc2w           #480 <Long 100L>
	//   51  104:ldc2w           #475 <Long 200L>
	//   52  107:iconst_1        
	//   53  108:invokestatic    #479 <Method AlphaAnimation j.a(float, float, long, long, boolean)>
	//   54  111:putfield        #204 <Field AlphaAnimation u>
		m();
	//   55  114:aload_0         
	//   56  115:invokespecial   #142 <Method void m()>
		i();
	//   57  118:aload_0         
	//   58  119:invokevirtual   #483 <Method void i()>
	//   59  122:return          
	}

	public void k()
	{
		j.setClickable(false);
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field ImageButton j>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #366 <Method void ImageButton.setClickable(boolean)>
		j.startAnimation(((android.view.animation.Animation) (u)));
	//    4    8:aload_0         
	//    5    9:getfield        #202 <Field ImageButton j>
	//    6   12:aload_0         
	//    7   13:getfield        #204 <Field AlphaAnimation u>
	//    8   16:invokevirtual   #210 <Method void ImageButton.startAnimation(android.view.animation.Animation)>
		h.c();
	//    9   19:aload_0         
	//   10   20:getfield        #187 <Field CustomVideoView h>
	//   11   23:invokevirtual   #485 <Method void CustomVideoView.c()>
	//   12   26:return          
	}

	protected void l()
	{
		x = a.CONNECTING;
	//    0    0:aload_0         
	//    1    1:getstatic       #185 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTING>
	//    2    4:putfield        #83  <Field RoombaAddRobotSetupActivity$a x>
		m();
	//    3    7:aload_0         
	//    4    8:invokespecial   #142 <Method void m()>
		f();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #487 <Method void f()>
	//    7   15:return          
	}

	public void onBackPressed()
	{
		if(x == a.CONNECTING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//*   2    4:getstatic       #185 <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECTING>
	//*   3    7:if_acmpne       33
		{
			x = a.CONNECT;
	//    4   10:aload_0         
	//    5   11:getstatic       #81  <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECT>
	//    6   14:putfield        #83  <Field RoombaAddRobotSetupActivity$a x>
			h.b();
	//    7   17:aload_0         
	//    8   18:getfield        #187 <Field CustomVideoView h>
	//    9   21:invokevirtual   #200 <Method void CustomVideoView.b()>
			m();
	//   10   24:aload_0         
	//   11   25:invokespecial   #142 <Method void m()>
			e();
	//   12   28:aload_0         
	//   13   29:invokevirtual   #490 <Method void e()>
			return;
	//   14   32:return          
		}
		if(x == a.CONNECT)
	//*  15   33:aload_0         
	//*  16   34:getfield        #83  <Field RoombaAddRobotSetupActivity$a x>
	//*  17   37:getstatic       #81  <Field RoombaAddRobotSetupActivity$a RoombaAddRobotSetupActivity$a.CONNECT>
	//*  18   40:if_acmpne       61
		{
			org.androidannotations.api.a.a("startAddRobotProcess", true);
	//   19   43:ldc2            #492 <String "startAddRobotProcess">
	//   20   46:iconst_1        
	//   21   47:invokestatic    #495 <Method void org.androidannotations.api.a.a(String, boolean)>
			org.androidannotations.api.a.a("stopAddRobotProcess", true);
	//   22   50:ldc2            #497 <String "stopAddRobotProcess">
	//   23   53:iconst_1        
	//   24   54:invokestatic    #495 <Method void org.androidannotations.api.a.a(String, boolean)>
			super.onBackPressed();
	//   25   57:aload_0         
	//   26   58:invokespecial   #499 <Method void BaseDetectedSetupActivity.onBackPressed()>
		}
	//   27   61:return          
	}

	protected void onDestroy()
	{
		org.androidannotations.api.a.a("startAddRobotProcess", true);
	//    0    0:ldc2            #492 <String "startAddRobotProcess">
	//    1    3:iconst_1        
	//    2    4:invokestatic    #495 <Method void org.androidannotations.api.a.a(String, boolean)>
		org.androidannotations.api.a.a("stopAddRobotProcess", true);
	//    3    7:ldc2            #497 <String "stopAddRobotProcess">
	//    4   10:iconst_1        
	//    5   11:invokestatic    #495 <Method void org.androidannotations.api.a.a(String, boolean)>
		super.onDestroy();
	//    6   14:aload_0         
	//    7   15:invokespecial   #502 <Method void BaseDetectedSetupActivity.onDestroy()>
	//    8   18:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #505 <Method void BaseDetectedSetupActivity.onResume()>
		if(j != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #202 <Field ImageButton j>
	//*   4    8:ifnull          18
			j.clearAnimation();
	//    5   11:aload_0         
	//    6   12:getfield        #202 <Field ImageButton j>
	//    7   15:invokevirtual   #508 <Method void ImageButton.clearAnimation()>
	//    8   18:return          
	}

	private static final String o = com.irobot.home.util.j.r(((Class) (com/irobot/home/RoombaAddRobotSetupActivity)).getSimpleName());
	private AddRobotUIServiceDataCallback A;
	String g;
	CustomVideoView h;
	CustomButton i;
	ImageButton j;
	ProgressBar k;
	ScrollView l;
	boolean m;
	boolean n;
	private AlphaAnimation t;
	private AlphaAnimation u;
	private final int v = 3;
	private final Object w = new Object();
	private a x;
	private AddRobotUIService y;
	private int z;

	static 
	{
	//    0    0:ldc1            #2   <Class RoombaAddRobotSetupActivity>
	//    1    2:invokevirtual   #55  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #61  <Method String j.r(String)>
	//    3    8:putstatic       #63  <Field String o>
	//*   4   11:return          
	}
}
