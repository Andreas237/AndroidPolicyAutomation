// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.EventType;
import com.irobot.core.NetworkDiagnosticEvent;
import com.irobot.core.NetworkDiagnosticRoutines;
import com.irobot.core.NetworkDiagnosticState;
import com.irobot.core.NetworkDiagnostics;
import com.irobot.core.NetworkManager;
import com.irobot.core.OnDemandOTAAvailabilityEvent;
import com.irobot.core.ServiceDiscovery;
import com.irobot.core.ServiceDiscoveryData;
import com.irobot.core.TimeoutEvent;
import com.irobot.core.UpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomVideoView;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class CheckRemoteConnectionFragment extends g
{
	public static interface a
	{

		public abstract void a(a a1, boolean flag);
	}

	public static final class a.a extends Enum
	{

		public static a.a valueOf(String s)
		{
			return (a.a)Enum.valueOf(com/irobot/home/fragments/CheckRemoteConnectionFragment$a$a, s);
		//    0    0:ldc1            #2   <Class CheckRemoteConnectionFragment$a$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #45  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class CheckRemoteConnectionFragment$a$a>
		//    4    9:areturn         
		}

		public static a.a[] values()
		{
			return (a.a[])((a.a []) ($VALUES)).clone();
		//    0    0:getstatic       #37  <Field CheckRemoteConnectionFragment$a$a[] $VALUES>
		//    1    3:invokevirtual   #52  <Method Object _5B_Lcom.irobot.home.fragments.CheckRemoteConnectionFragment$a$a_3B_.clone()>
		//    2    6:checkcast       #48  <Class CheckRemoteConnectionFragment$a$a[]>
		//    3    9:areturn         
		}

		private static final a.a $VALUES[];
		public static final a.a BlockedMqttPort;
		public static final a.a Failure;
		public static final a.a NoInternetConnectivity;
		public static final a.a Success;

		static 
		{
			Success = new a.a("Success", 0);
		//    0    0:new             #2   <Class CheckRemoteConnectionFragment$a$a>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "Success">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void CheckRemoteConnectionFragment$a$a(String, int)>
		//    5   10:putstatic       #26  <Field CheckRemoteConnectionFragment$a$a Success>
			Failure = new a.a("Failure", 1);
		//    6   13:new             #2   <Class CheckRemoteConnectionFragment$a$a>
		//    7   16:dup             
		//    8   17:ldc1            #27  <String "Failure">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void CheckRemoteConnectionFragment$a$a(String, int)>
		//   11   23:putstatic       #29  <Field CheckRemoteConnectionFragment$a$a Failure>
			NoInternetConnectivity = new a.a("NoInternetConnectivity", 2);
		//   12   26:new             #2   <Class CheckRemoteConnectionFragment$a$a>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "NoInternetConnectivity">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void CheckRemoteConnectionFragment$a$a(String, int)>
		//   17   36:putstatic       #32  <Field CheckRemoteConnectionFragment$a$a NoInternetConnectivity>
			BlockedMqttPort = new a.a("BlockedMqttPort", 3);
		//   18   39:new             #2   <Class CheckRemoteConnectionFragment$a$a>
		//   19   42:dup             
		//   20   43:ldc1            #33  <String "BlockedMqttPort">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void CheckRemoteConnectionFragment$a$a(String, int)>
		//   23   49:putstatic       #35  <Field CheckRemoteConnectionFragment$a$a BlockedMqttPort>
			$VALUES = (new a.a[] {
				Success, Failure, NoInternetConnectivity, BlockedMqttPort
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       a.a[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #26  <Field CheckRemoteConnectionFragment$a$a Success>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #29  <Field CheckRemoteConnectionFragment$a$a Failure>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #32  <Field CheckRemoteConnectionFragment$a$a NoInternetConnectivity>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #35  <Field CheckRemoteConnectionFragment$a$a BlockedMqttPort>
		//   41   79:aastore         
		//   42   80:putstatic       #37  <Field CheckRemoteConnectionFragment$a$a[] $VALUES>
		//*  43   83:return          
		}

		private a.a(String s, int i1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #39  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public CheckRemoteConnectionFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void g()>
		j = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #60  <Field boolean j>
		k = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #62  <Field TimeoutEvent k>
		l = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #64  <Field OnDemandOTAAvailabilityEvent l>
		n = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #66  <Field AssetUpdateAvailabilityEvent n>
		o = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #68  <Field NetworkDiagnosticEvent o>
	//   17   29:return          
	}

	static void a(CheckRemoteConnectionFragment checkremoteconnectionfragment)
	{
		checkremoteconnectionfragment.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void d()>
	//    2    4:return          
	}

	static boolean a(CheckRemoteConnectionFragment checkremoteconnectionfragment, boolean flag)
	{
		checkremoteconnectionfragment.j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean j>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void d()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(g != null && j) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #74  <Field CheckRemoteConnectionFragment$a g>
	//    4    6:ifnull          260
	//    5    9:aload_0         
	//    6   10:getfield        #60  <Field boolean j>
	//    7   13:ifne            19
	//*   8   16:goto            260
_L2:
		Object obj = ((Object) (k));
	//    9   19:aload_0         
	//   10   20:getfield        #62  <Field TimeoutEvent k>
	//   11   23:astore_3        
		boolean flag1;
		flag1 = false;
	//   12   24:iconst_0        
	//   13   25:istore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_46;
	//   14   26:aload_3         
	//   15   27:ifnull          46
		g.a(a.a.Failure, false);
	//   16   30:aload_0         
	//   17   31:getfield        #74  <Field CheckRemoteConnectionFragment$a g>
	//   18   34:getstatic       #78  <Field CheckRemoteConnectionFragment$a$a CheckRemoteConnectionFragment$a$a.Failure>
	//   19   37:iconst_0        
	//   20   38:invokeinterface #81  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment$a.a(CheckRemoteConnectionFragment$a$a, boolean)>
		this;
	//   21   43:aload_0         
		JVM INSTR monitorexit ;
	//   22   44:monitorexit     
		return;
	//   23   45:return          
		if(o == null) goto _L4; else goto _L3
	//   24   46:aload_0         
	//   25   47:getfield        #68  <Field NetworkDiagnosticEvent o>
	//   26   50:ifnull          190
_L3:
		Object obj1;
		obj = ((Object) (o.routine()));
	//   27   53:aload_0         
	//   28   54:getfield        #68  <Field NetworkDiagnosticEvent o>
	//   29   57:invokevirtual   #87  <Method NetworkDiagnosticRoutines NetworkDiagnosticEvent.routine()>
	//   30   60:astore_3        
		obj1 = ((Object) (o.state()));
	//   31   61:aload_0         
	//   32   62:getfield        #68  <Field NetworkDiagnosticEvent o>
	//   33   65:invokevirtual   #91  <Method NetworkDiagnosticState NetworkDiagnosticEvent.state()>
	//   34   68:astore          4
		static class _cls2
		{

			static final int a[];

			static 
			{
				a = new int[NetworkDiagnosticRoutines.values().length];
			//    0    0:invokestatic    #18  <Method NetworkDiagnosticRoutines[] NetworkDiagnosticRoutines.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[NetworkDiagnosticRoutines.InternetConnectivity.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.InternetConnectivity>
			//    6   15:invokevirtual   #28  <Method int NetworkDiagnosticRoutines.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field NetworkDiagnosticRoutines NetworkDiagnosticRoutines.MQTTPort>
			//*  11   26:invokevirtual   #28  <Method int NetworkDiagnosticRoutines.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					a[NetworkDiagnosticRoutines.MQTTPort.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		com.irobot.home.fragments._cls2.a[((NetworkDiagnosticRoutines) (obj)).ordinal()];
	//   35   70:getstatic       #94  <Field int[] com.irobot.home.fragments.CheckRemoteConnectionFragment$2.a>
	//   36   73:aload_3         
	//   37   74:invokevirtual   #100 <Method int NetworkDiagnosticRoutines.ordinal()>
	//   38   77:iaload          
		JVM INSTR tableswitch 1 2: default 268
	//	               1 151
	//	               2 100;
	//   39   78:tableswitch     1 2: default 268
	//	               1 151
	//	               2 100
		   goto _L5 _L6 _L7
_L5:
		break MISSING_BLOCK_LABEL_187;
_L7:
		if(obj1 != NetworkDiagnosticState.Success) goto _L9; else goto _L8
	//   40  100:aload           4
	//   41  102:getstatic       #106 <Field NetworkDiagnosticState NetworkDiagnosticState.Success>
	//   42  105:if_acmpne       130
_L8:
		obj = ((Object) (g));
	//   43  108:aload_0         
	//   44  109:getfield        #74  <Field CheckRemoteConnectionFragment$a g>
	//   45  112:astore_3        
		obj1 = ((Object) (a.a.Failure));
	//   46  113:getstatic       #78  <Field CheckRemoteConnectionFragment$a$a CheckRemoteConnectionFragment$a$a.Failure>
	//   47  116:astore          4
_L11:
		((a) (obj)).a(((a.a) (obj1)), false);
	//   48  118:aload_3         
	//   49  119:aload           4
	//   50  121:iconst_0        
	//   51  122:invokeinterface #81  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment$a.a(CheckRemoteConnectionFragment$a$a, boolean)>
		break MISSING_BLOCK_LABEL_187;
	//   52  127:goto            187
_L9:
		if(obj1 != NetworkDiagnosticState.Failure)
			break MISSING_BLOCK_LABEL_187;
	//   53  130:aload           4
	//   54  132:getstatic       #108 <Field NetworkDiagnosticState NetworkDiagnosticState.Failure>
	//   55  135:if_acmpne       187
		obj = ((Object) (g));
	//   56  138:aload_0         
	//   57  139:getfield        #74  <Field CheckRemoteConnectionFragment$a g>
	//   58  142:astore_3        
		obj1 = ((Object) (a.a.BlockedMqttPort));
	//   59  143:getstatic       #111 <Field CheckRemoteConnectionFragment$a$a CheckRemoteConnectionFragment$a$a.BlockedMqttPort>
	//   60  146:astore          4
		continue; /* Loop/switch isn't completed */
	//   61  148:goto            118
_L6:
		if(obj1 == NetworkDiagnosticState.Success)
	//*  62  151:aload           4
	//*  63  153:getstatic       #106 <Field NetworkDiagnosticState NetworkDiagnosticState.Success>
	//*  64  156:if_acmpne       166
		{
			c();
	//   65  159:aload_0         
	//   66  160:invokevirtual   #113 <Method void c()>
			break MISSING_BLOCK_LABEL_187;
	//   67  163:goto            187
		}
		if(obj1 != NetworkDiagnosticState.Failure)
			break MISSING_BLOCK_LABEL_187;
	//   68  166:aload           4
	//   69  168:getstatic       #108 <Field NetworkDiagnosticState NetworkDiagnosticState.Failure>
	//   70  171:if_acmpne       187
		obj = ((Object) (g));
	//   71  174:aload_0         
	//   72  175:getfield        #74  <Field CheckRemoteConnectionFragment$a g>
	//   73  178:astore_3        
		obj1 = ((Object) (a.a.NoInternetConnectivity));
	//   74  179:getstatic       #116 <Field CheckRemoteConnectionFragment$a$a CheckRemoteConnectionFragment$a$a.NoInternetConnectivity>
	//   75  182:astore          4
		if(true) goto _L11; else goto _L10
	//   76  184:goto            118
_L10:
		this;
	//   77  187:aload_0         
		JVM INSTR monitorexit ;
	//   78  188:monitorexit     
		return;
	//   79  189:return          
_L4:
		boolean flag;
		a a1;
		Exception exception;
		a.a a2;
		if(n != null && l != null)
	//*  80  190:aload_0         
	//*  81  191:getfield        #66  <Field AssetUpdateAvailabilityEvent n>
	//*  82  194:ifnull          271
	//*  83  197:aload_0         
	//*  84  198:getfield        #64  <Field OnDemandOTAAvailabilityEvent l>
	//*  85  201:ifnull          271
			flag = true;
	//   86  204:iconst_1        
	//   87  205:istore_1        
		else
	//*  88  206:goto            209
	//*  89  209:iload_1         
	//*  90  210:ifeq            257
	//*  91  213:aload_0         
	//*  92  214:getfield        #64  <Field OnDemandOTAAvailabilityEvent l>
	//*  93  217:invokevirtual   #122 <Method boolean OnDemandOTAAvailabilityEvent.startConnectionStateMet()>
	//*  94  220:ifeq            257
	//*  95  223:aload_0         
	//*  96  224:getfield        #74  <Field CheckRemoteConnectionFragment$a g>
	//*  97  227:astore_3        
	//*  98  228:getstatic       #124 <Field CheckRemoteConnectionFragment$a$a CheckRemoteConnectionFragment$a$a.Success>
	//*  99  231:astore          4
	//* 100  233:aload_0         
	//* 101  234:getfield        #66  <Field AssetUpdateAvailabilityEvent n>
	//* 102  237:invokevirtual   #130 <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//* 103  240:getstatic       #136 <Field UpdateStatus UpdateStatus.UpdateAvailable>
	//* 104  243:if_acmpne       248
	//* 105  246:iconst_1        
	//* 106  247:istore_2        
	//* 107  248:aload_3         
	//* 108  249:aload           4
	//* 109  251:iload_2         
	//* 110  252:invokeinterface #81  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment$a.a(CheckRemoteConnectionFragment$a$a, boolean)>
	//* 111  257:aload_0         
	//* 112  258:monitorexit     
	//* 113  259:return          
	//* 114  260:aload_0         
	//* 115  261:monitorexit     
	//* 116  262:return          
	//* 117  263:astore_3        
	//* 118  264:aload_0         
	//* 119  265:monitorexit     
	//* 120  266:aload_3         
	//* 121  267:athrow          
	//* 122  268:goto            187
			flag = false;
	//  123  271:iconst_0        
	//  124  272:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_257;
		if(!l.startConnectionStateMet())
			break MISSING_BLOCK_LABEL_257;
		a1 = g;
		a2 = a.a.Success;
		if(n.status() == UpdateStatus.UpdateAvailable)
			flag1 = true;
		a1.a(a2, flag1);
		this;
		JVM INSTR monitorexit ;
		return;
_L1:
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//* 125  273:goto            209
	}

	protected void a()
	{
		Object obj = ((Object) (com.irobot.home.util.j.a(d).a().getName()));
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field String d>
	//    2    4:invokestatic    #141 <Method a j.a(String)>
	//    3    7:invokevirtual   #146 <Method AssetInfo a.a()>
	//    4   10:invokevirtual   #151 <Method String AssetInfo.getName()>
	//    5   13:astore_1        
		b.setText(((CharSequence) (getString(0x7f0f04b0, new Object[] {
			obj
		}))));
	//    6   14:aload_0         
	//    7   15:getfield        #153 <Field TextView b>
	//    8   18:aload_0         
	//    9   19:ldc1            #154 <Int 0x7f0f04b0>
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_1         
	//   15   28:aastore         
	//   16   29:invokevirtual   #160 <Method String getString(int, Object[])>
	//   17   32:invokevirtual   #166 <Method void TextView.setText(CharSequence)>
		obj = ((Object) (new CustomVideoView(((android.content.Context) (getActivity())))));
	//   18   35:new             #168 <Class CustomVideoView>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:invokevirtual   #172 <Method android.app.Activity getActivity()>
	//   22   43:invokespecial   #175 <Method void CustomVideoView(android.content.Context)>
	//   23   46:astore_1        
		android.net.Uri uri = com.irobot.home.util.j.a(((android.content.Context) (getActivity())), e);
	//   24   47:aload_0         
	//   25   48:invokevirtual   #172 <Method android.app.Activity getActivity()>
	//   26   51:aload_0         
	//   27   52:getfield        #177 <Field int e>
	//   28   55:invokestatic    #180 <Method android.net.Uri j.a(android.content.Context, int)>
	//   29   58:astore_2        
		((CustomVideoView) (obj)).setSource(uri);
	//   30   59:aload_1         
	//   31   60:aload_2         
	//   32   61:invokevirtual   #184 <Method void CustomVideoView.setSource(android.net.Uri)>
		((CustomVideoView) (obj)).setLooping(true);
	//   33   64:aload_1         
	//   34   65:iconst_1        
	//   35   66:invokevirtual   #188 <Method void CustomVideoView.setLooping(boolean)>
		((CustomVideoView) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, com.irobot.home.util.j.a(getActivity(), uri)));
	//   36   69:aload_1         
	//   37   70:new             #190 <Class android.view.ViewGroup$LayoutParams>
	//   38   73:dup             
	//   39   74:iconst_m1       
	//   40   75:aload_0         
	//   41   76:invokevirtual   #172 <Method android.app.Activity getActivity()>
	//   42   79:aload_2         
	//   43   80:invokestatic    #193 <Method int j.a(android.app.Activity, android.net.Uri)>
	//   44   83:invokespecial   #196 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   45   86:invokevirtual   #200 <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		c.addView(((android.view.View) (obj)));
	//   46   89:aload_0         
	//   47   90:getfield        #202 <Field FrameLayout c>
	//   48   93:aload_1         
	//   49   94:invokevirtual   #208 <Method void FrameLayout.addView(android.view.View)>
		((CustomVideoView) (obj)).a();
	//   50   97:aload_1         
	//   51   98:invokevirtual   #210 <Method void CustomVideoView.a()>
		h = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   52  101:aload_0         
	//   53  102:invokestatic    #216 <Method Assembler Assembler.getInstance()>
	//   54  105:invokevirtual   #220 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   55  108:checkcast       #222 <Class com.irobot.home.i.a>
	//   56  111:putfield        #224 <Field com.irobot.home.i.a h>
		i = Assembler.getInstance().getUpdateUIService(AssetId.assetIdForString(d));
	//   57  114:aload_0         
	//   58  115:invokestatic    #216 <Method Assembler Assembler.getInstance()>
	//   59  118:aload_0         
	//   60  119:getfield        #138 <Field String d>
	//   61  122:invokestatic    #230 <Method AssetId AssetId.assetIdForString(String)>
	//   62  125:invokevirtual   #234 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   63  128:putfield        #236 <Field UpdateUIService i>
		(new Handler()).postDelayed(new Runnable() {

			public void run()
			{
				com.irobot.home.fragments.CheckRemoteConnectionFragment.a(a, true);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CheckRemoteConnectionFragment a>
			//    2    4:iconst_1        
			//    3    5:invokestatic    #23  <Method boolean com.irobot.home.fragments.CheckRemoteConnectionFragment.a(CheckRemoteConnectionFragment, boolean)>
			//    4    8:pop             
				com.irobot.home.fragments.CheckRemoteConnectionFragment.a(a);
			//    5    9:aload_0         
			//    6   10:getfield        #16  <Field CheckRemoteConnectionFragment a>
			//    7   13:invokestatic    #25  <Method void com.irobot.home.fragments.CheckRemoteConnectionFragment.a(CheckRemoteConnectionFragment)>
			//    8   16:return          
			}

			final CheckRemoteConnectionFragment a;

			
			{
				a = CheckRemoteConnectionFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CheckRemoteConnectionFragment a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
, 5000L);
	//   64  131:new             #238 <Class Handler>
	//   65  134:dup             
	//   66  135:invokespecial   #239 <Method void Handler()>
	//   67  138:new             #6   <Class CheckRemoteConnectionFragment$1>
	//   68  141:dup             
	//   69  142:aload_0         
	//   70  143:invokespecial   #241 <Method void CheckRemoteConnectionFragment$1(CheckRemoteConnectionFragment)>
	//   71  146:ldc2w           #242 <Long 5000L>
	//   72  149:invokevirtual   #247 <Method boolean Handler.postDelayed(Runnable, long)>
	//   73  152:pop             
	//   74  153:return          
	}

	public void a(a a1)
	{
		g = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field CheckRemoteConnectionFragment$a g>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		TextView textview = a;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field TextView a>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			byte0 = 4;
	//    8   14:iconst_4        
	//    9   15:istore_2        
		textview.setVisibility(((int) (byte0)));
	//   10   16:aload_3         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #254 <Method void TextView.setVisibility(int)>
	//   13   21:return          
	}

	protected void b()
	{
		NetworkDiagnostics networkdiagnostics = NetworkManager.defaultManager().networkDiagnostics();
	//    0    0:invokestatic    #260 <Method NetworkManager NetworkManager.defaultManager()>
	//    1    3:invokevirtual   #264 <Method NetworkDiagnostics NetworkManager.networkDiagnostics()>
	//    2    6:astore_1        
		String s = ServiceDiscovery.getInstance().getServiceDiscoveryData(AssetId.assetIdForString(d)).getIotServiceUrl();
	//    3    7:invokestatic    #269 <Method ServiceDiscovery ServiceDiscovery.getInstance()>
	//    4   10:aload_0         
	//    5   11:getfield        #138 <Field String d>
	//    6   14:invokestatic    #230 <Method AssetId AssetId.assetIdForString(String)>
	//    7   17:invokevirtual   #273 <Method ServiceDiscoveryData ServiceDiscovery.getServiceDiscoveryData(AssetId)>
	//    8   20:invokevirtual   #278 <Method String ServiceDiscoveryData.getIotServiceUrl()>
	//    9   23:astore_2        
		if(com.irobot.home.util.j.i(s))
	//*  10   24:aload_2         
	//*  11   25:invokestatic    #281 <Method boolean j.i(String)>
	//*  12   28:ifeq            36
			networkdiagnostics.setUrlForMqttPortCheck(s);
	//   13   31:aload_1         
	//   14   32:aload_2         
	//   15   33:invokevirtual   #287 <Method void NetworkDiagnostics.setUrlForMqttPortCheck(String)>
		networkdiagnostics.checkInternetConnectivity();
	//   16   36:aload_1         
	//   17   37:invokevirtual   #290 <Method int NetworkDiagnostics.checkInternetConnectivity()>
	//   18   40:pop             
	//   19   41:return          
	}

	public void b(boolean flag)
	{
		TextView textview = b;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field TextView b>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			byte0 = 4;
	//    8   14:iconst_4        
	//    9   15:istore_2        
		textview.setVisibility(((int) (byte0)));
	//   10   16:aload_3         
	//   11   17:iload_2         
	//   12   18:invokevirtual   #254 <Method void TextView.setVisibility(int)>
	//   13   21:return          
	}

	protected void c()
	{
		NetworkManager.defaultManager().networkDiagnostics().checkMqttPort();
	//    0    0:invokestatic    #260 <Method NetworkManager NetworkManager.defaultManager()>
	//    1    3:invokevirtual   #264 <Method NetworkDiagnostics NetworkManager.networkDiagnostics()>
	//    2    6:invokevirtual   #293 <Method int NetworkDiagnostics.checkMqttPort()>
	//    3    9:pop             
	//    4   10:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #299 <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			n = assetupdateavailabilityevent;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #66  <Field AssetUpdateAvailabilityEvent n>
			d();
	//    7   13:aload_0         
	//    8   14:invokespecial   #71  <Method void d()>
			return;
	//    9   17:return          
		}
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #303 <Method void g.onDetach()>
		g = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #74  <Field CheckRemoteConnectionFragment$a g>
	//    5    9:return          
	}

	public void onNetworkDiagnosticEvent(NetworkDiagnosticEvent networkdiagnosticevent)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #299 <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			String s = f;
	//    4    8:getstatic       #54  <Field String f>
	//    5   11:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #307 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #308 <Method void StringBuilder()>
	//    9   19:astore_3        
			stringbuilder.append("NetworkDiagnosticEvent received: ");
	//   10   20:aload_3         
	//   11   21:ldc2            #310 <String "NetworkDiagnosticEvent received: ">
	//   12   24:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			stringbuilder.append(((Object) (networkdiagnosticevent.routine())));
	//   14   28:aload_3         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #87  <Method NetworkDiagnosticRoutines NetworkDiagnosticEvent.routine()>
	//   17   33:invokevirtual   #317 <Method StringBuilder StringBuilder.append(Object)>
	//   18   36:pop             
			stringbuilder.append("/");
	//   19   37:aload_3         
	//   20   38:ldc2            #319 <String "/">
	//   21   41:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			stringbuilder.append(((Object) (networkdiagnosticevent.state())));
	//   23   45:aload_3         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #91  <Method NetworkDiagnosticState NetworkDiagnosticEvent.state()>
	//   26   50:invokevirtual   #317 <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
			stringbuilder.append("/");
	//   28   54:aload_3         
	//   29   55:ldc2            #319 <String "/">
	//   30   58:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			stringbuilder.append(networkdiagnosticevent.progress());
	//   32   62:aload_3         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #322 <Method String NetworkDiagnosticEvent.progress()>
	//   35   67:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			com.irobot.home.util.o.b(s, stringbuilder.toString());
	//   37   71:aload_2         
	//   38   72:aload_3         
	//   39   73:invokevirtual   #325 <Method String StringBuilder.toString()>
	//   40   76:invokestatic    #330 <Method void o.b(String, String)>
			o = networkdiagnosticevent;
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:putfield        #68  <Field NetworkDiagnosticEvent o>
			d();
	//   44   84:aload_0         
	//   45   85:invokespecial   #71  <Method void d()>
			return;
	//   46   88:return          
		}
	}

	public void onOnDemandOTAAvailabilityEvent(OnDemandOTAAvailabilityEvent ondemandotaavailabilityevent)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #299 <Method boolean isAdded()>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			l = ondemandotaavailabilityevent;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #64  <Field OnDemandOTAAvailabilityEvent l>
			d();
	//    7   13:aload_0         
	//    8   14:invokespecial   #71  <Method void d()>
			return;
	//    9   17:return          
		}
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #335 <Method void g.onPause()>
		h.b(((Object) (this)), EventType.TimeoutEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #224 <Field com.irobot.home.i.a h>
	//    4    8:aload_0         
	//    5    9:getstatic       #341 <Field EventType EventType.TimeoutEvent>
	//    6   12:invokevirtual   #344 <Method void com.irobot.home.i.a.b(Object, EventType)>
		h.b(((Object) (this)), EventType.OnDemandOTAAvailabilityEvent);
	//    7   15:aload_0         
	//    8   16:getfield        #224 <Field com.irobot.home.i.a h>
	//    9   19:aload_0         
	//   10   20:getstatic       #347 <Field EventType EventType.OnDemandOTAAvailabilityEvent>
	//   11   23:invokevirtual   #344 <Method void com.irobot.home.i.a.b(Object, EventType)>
		h.b(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//   12   26:aload_0         
	//   13   27:getfield        #224 <Field com.irobot.home.i.a h>
	//   14   30:aload_0         
	//   15   31:getstatic       #350 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   16   34:invokevirtual   #344 <Method void com.irobot.home.i.a.b(Object, EventType)>
		h.b(((Object) (this)), EventType.NetworkDiagnosticEvent);
	//   17   37:aload_0         
	//   18   38:getfield        #224 <Field com.irobot.home.i.a h>
	//   19   41:aload_0         
	//   20   42:getstatic       #353 <Field EventType EventType.NetworkDiagnosticEvent>
	//   21   45:invokevirtual   #344 <Method void com.irobot.home.i.a.b(Object, EventType)>
	//   22   48:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #356 <Method void g.onResume()>
		h.a(((Object) (this)), EventType.TimeoutEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #224 <Field com.irobot.home.i.a h>
	//    4    8:aload_0         
	//    5    9:getstatic       #341 <Field EventType EventType.TimeoutEvent>
	//    6   12:invokevirtual   #358 <Method void com.irobot.home.i.a.a(Object, EventType)>
		h.a(((Object) (this)), EventType.OnDemandOTAAvailabilityEvent);
	//    7   15:aload_0         
	//    8   16:getfield        #224 <Field com.irobot.home.i.a h>
	//    9   19:aload_0         
	//   10   20:getstatic       #347 <Field EventType EventType.OnDemandOTAAvailabilityEvent>
	//   11   23:invokevirtual   #358 <Method void com.irobot.home.i.a.a(Object, EventType)>
		h.a(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//   12   26:aload_0         
	//   13   27:getfield        #224 <Field com.irobot.home.i.a h>
	//   14   30:aload_0         
	//   15   31:getstatic       #350 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   16   34:invokevirtual   #358 <Method void com.irobot.home.i.a.a(Object, EventType)>
		h.a(((Object) (this)), EventType.NetworkDiagnosticEvent);
	//   17   37:aload_0         
	//   18   38:getfield        #224 <Field com.irobot.home.i.a h>
	//   19   41:aload_0         
	//   20   42:getstatic       #353 <Field EventType EventType.NetworkDiagnosticEvent>
	//   21   45:invokevirtual   #358 <Method void com.irobot.home.i.a.a(Object, EventType)>
		i.queryOnDemandOTAAvailability();
	//   22   48:aload_0         
	//   23   49:getfield        #236 <Field UpdateUIService i>
	//   24   52:invokevirtual   #363 <Method void UpdateUIService.queryOnDemandOTAAvailability()>
		i.queryForSoftwareUpdate();
	//   25   55:aload_0         
	//   26   56:getfield        #236 <Field UpdateUIService i>
	//   27   59:invokevirtual   #366 <Method void UpdateUIService.queryForSoftwareUpdate()>
		b();
	//   28   62:aload_0         
	//   29   63:invokevirtual   #368 <Method void b()>
	//   30   66:return          
	}

	public void onTimeoutEvent(TimeoutEvent timeoutevent)
	{
		if(!isAdded())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #299 <Method boolean isAdded()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(timeoutevent.tag().equalsIgnoreCase("OnDemandOTARemoteConnectionTimeoutTag"))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #375 <Method String TimeoutEvent.tag()>
	//*   6   12:ldc2            #377 <String "OnDemandOTARemoteConnectionTimeoutTag">
	//*   7   15:invokevirtual   #382 <Method boolean String.equalsIgnoreCase(String)>
	//*   8   18:ifeq            30
		{
			k = timeoutevent;
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:putfield        #62  <Field TimeoutEvent k>
			d();
	//   12   26:aload_0         
	//   13   27:invokespecial   #71  <Method void d()>
		}
	//   14   30:return          
	}

	private static final String f = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/CheckRemoteConnectionFragment)).getSimpleName());
	TextView a;
	TextView b;
	FrameLayout c;
	String d;
	int e;
	private a g;
	private com.irobot.home.i.a h;
	private UpdateUIService i;
	private boolean j;
	private TimeoutEvent k;
	private OnDemandOTAAvailabilityEvent l;
	private AssetUpdateAvailabilityEvent n;
	private NetworkDiagnosticEvent o;

	static 
	{
	//    0    0:ldc1            #2   <Class CheckRemoteConnectionFragment>
	//    1    2:invokevirtual   #46  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #52  <Method String j.r(String)>
	//    3    8:putstatic       #54  <Field String f>
	//*   4   11:return          
	}
}
