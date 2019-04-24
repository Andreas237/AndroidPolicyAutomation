// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.LayoutInflater;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.q.b;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.util.v;
import com.irobot.home.util.w;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			BasePushNotificationActivity, OnDemandOtaActivity_, IRobotApplication

public class RobotSoftwareUpdateActivity extends BasePushNotificationActivity
{
	private class a extends OTAUIServiceDataCallback
	{

		public void onOTAUIServiceDataChanged(OTAUIServiceData otauiservicedata)
		{
			if(otauiservicedata == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			Object obj = ((Object) (otauiservicedata.getDataStates()));
		//    3    5:aload_1         
		//    4    6:invokevirtual   #27  <Method ArrayList OTAUIServiceData.getDataStates()>
		//    5    9:astore_2        
			String s1 = RobotSoftwareUpdateActivity.q();
		//    6   10:invokestatic    #31  <Method String RobotSoftwareUpdateActivity.q()>
		//    7   13:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//    8   14:new             #33  <Class StringBuilder>
		//    9   17:dup             
		//   10   18:invokespecial   #34  <Method void StringBuilder()>
		//   11   21:astore          4
			stringbuilder.append("Change list: ");
		//   12   23:aload           4
		//   13   25:ldc1            #36  <String "Change list: ">
		//   14   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   16   31:aload           4
		//   17   33:aload_2         
		//   18   34:invokevirtual   #45  <Method String ArrayList.toString()>
		//   19   37:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
		//   20   40:pop             
			com.irobot.home.util.o.b(s1, stringbuilder.toString());
		//   21   41:aload_3         
		//   22   42:aload           4
		//   23   44:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   24   47:invokestatic    #52  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   25   50:aload_2         
		//   26   51:invokevirtual   #56  <Method Iterator ArrayList.iterator()>
		//   27   54:astore_2        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   28   55:aload_2         
		//   29   56:invokeinterface #62  <Method boolean Iterator.hasNext()>
		//   30   61:ifeq            135
				OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
		//   31   64:aload_2         
		//   32   65:invokeinterface #66  <Method Object Iterator.next()>
		//   33   70:checkcast       #68  <Class OTAUIServiceDataState>
		//   34   73:astore_3        
				static class _cls1
				{

					static final int a[];
					static final int b[];
					static final int c[];

					static 
					{
						c = new int[SoftwareUpdateStatus.values().length];
					//    0    0:invokestatic    #20  <Method SoftwareUpdateStatus[] SoftwareUpdateStatus.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #22  <Field int[] c>
						try
						{
							c[SoftwareUpdateStatus.InProgress.ordinal()] = 1;
					//    4    9:getstatic       #22  <Field int[] c>
					//    5   12:getstatic       #26  <Field SoftwareUpdateStatus SoftwareUpdateStatus.InProgress>
					//    6   15:invokevirtual   #30  <Method int SoftwareUpdateStatus.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #22  <Field int[] c>
					//*  10   23:getstatic       #33  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
					//*  11   26:invokevirtual   #30  <Method int SoftwareUpdateStatus.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #22  <Field int[] c>
					//*  15   34:getstatic       #36  <Field SoftwareUpdateStatus SoftwareUpdateStatus.UpToDate>
					//*  16   37:invokevirtual   #30  <Method int SoftwareUpdateStatus.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #22  <Field int[] c>
					//*  20   45:getstatic       #39  <Field SoftwareUpdateStatus SoftwareUpdateStatus.Unavailable>
					//*  21   48:invokevirtual   #30  <Method int SoftwareUpdateStatus.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:invokestatic    #44  <Method ExpeditedOtaStatus[] ExpeditedOtaStatus.values()>
					//*  25   56:arraylength     
					//*  26   57:newarray        int[]
					//*  27   59:putstatic       #46  <Field int[] b>
					//*  28   62:getstatic       #46  <Field int[] b>
					//*  29   65:getstatic       #50  <Field ExpeditedOtaStatus ExpeditedOtaStatus.Available>
					//*  30   68:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  31   71:iconst_1        
					//*  32   72:iastore         
					//*  33   73:getstatic       #46  <Field int[] b>
					//*  34   76:getstatic       #54  <Field ExpeditedOtaStatus ExpeditedOtaStatus.AvailableViewed>
					//*  35   79:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  36   82:iconst_2        
					//*  37   83:iastore         
					//*  38   84:getstatic       #46  <Field int[] b>
					//*  39   87:getstatic       #57  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RequestStarted>
					//*  40   90:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  41   93:iconst_3        
					//*  42   94:iastore         
					//*  43   95:getstatic       #46  <Field int[] b>
					//*  44   98:getstatic       #60  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RequestFailed>
					//*  45  101:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  46  104:iconst_4        
					//*  47  105:iastore         
					//*  48  106:getstatic       #46  <Field int[] b>
					//*  49  109:getstatic       #63  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RequestSuccessful>
					//*  50  112:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  51  115:iconst_5        
					//*  52  116:iastore         
					//*  53  117:getstatic       #46  <Field int[] b>
					//*  54  120:getstatic       #66  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RetryAvailable>
					//*  55  123:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  56  126:bipush          6
					//*  57  128:iastore         
					//*  58  129:getstatic       #46  <Field int[] b>
					//*  59  132:getstatic       #69  <Field ExpeditedOtaStatus ExpeditedOtaStatus.RetryUnavailable>
					//*  60  135:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  61  138:bipush          7
					//*  62  140:iastore         
					//*  63  141:getstatic       #46  <Field int[] b>
					//*  64  144:getstatic       #71  <Field ExpeditedOtaStatus ExpeditedOtaStatus.Unavailable>
					//*  65  147:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  66  150:bipush          8
					//*  67  152:iastore         
					//*  68  153:getstatic       #46  <Field int[] b>
					//*  69  156:getstatic       #74  <Field ExpeditedOtaStatus ExpeditedOtaStatus.Unknown>
					//*  70  159:invokevirtual   #51  <Method int ExpeditedOtaStatus.ordinal()>
					//*  71  162:bipush          9
					//*  72  164:iastore         
					//*  73  165:invokestatic    #79  <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
					//*  74  168:arraylength     
					//*  75  169:newarray        int[]
					//*  76  171:putstatic       #81  <Field int[] a>
					//*  77  174:getstatic       #81  <Field int[] a>
					//*  78  177:getstatic       #85  <Field OTAUIServiceDataState OTAUIServiceDataState.ExpeditedOTAStatus>
					//*  79  180:invokevirtual   #86  <Method int OTAUIServiceDataState.ordinal()>
					//*  80  183:iconst_1        
					//*  81  184:iastore         
					//*  82  185:getstatic       #81  <Field int[] a>
					//*  83  188:getstatic       #89  <Field OTAUIServiceDataState OTAUIServiceDataState.SoftwareUpdateStatus>
					//*  84  191:invokevirtual   #86  <Method int OTAUIServiceDataState.ordinal()>
					//*  85  194:iconst_2        
					//*  86  195:iastore         
					//*  87  196:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   88  197:astore_0        
						try
						{
							c[SoftwareUpdateStatus.AvailableAndReady.ordinal()] = 2;
						}
					//*  89  198:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   90  201:astore_0        
						try
						{
							c[SoftwareUpdateStatus.UpToDate.ordinal()] = 3;
						}
					//*  91  202:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   92  205:astore_0        
						try
						{
							c[SoftwareUpdateStatus.Unavailable.ordinal()] = 4;
						}
					//*  93  206:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   94  209:astore_0        
						b = new int[ExpeditedOtaStatus.values().length];
						try
						{
							b[ExpeditedOtaStatus.Available.ordinal()] = 1;
						}
					//*  95  210:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   96  213:astore_0        
						try
						{
							b[ExpeditedOtaStatus.AvailableViewed.ordinal()] = 2;
						}
					//*  97  214:goto            73
						catch(NoSuchFieldError nosuchfielderror5) { }
					//   98  217:astore_0        
						try
						{
							b[ExpeditedOtaStatus.RequestStarted.ordinal()] = 3;
						}
					//*  99  218:goto            84
						catch(NoSuchFieldError nosuchfielderror6) { }
					//  100  221:astore_0        
						try
						{
							b[ExpeditedOtaStatus.RequestFailed.ordinal()] = 4;
						}
					//* 101  222:goto            95
						catch(NoSuchFieldError nosuchfielderror7) { }
					//  102  225:astore_0        
						try
						{
							b[ExpeditedOtaStatus.RequestSuccessful.ordinal()] = 5;
						}
					//* 103  226:goto            106
						catch(NoSuchFieldError nosuchfielderror8) { }
					//  104  229:astore_0        
						try
						{
							b[ExpeditedOtaStatus.RetryAvailable.ordinal()] = 6;
						}
					//* 105  230:goto            117
						catch(NoSuchFieldError nosuchfielderror9) { }
					//  106  233:astore_0        
						try
						{
							b[ExpeditedOtaStatus.RetryUnavailable.ordinal()] = 7;
						}
					//* 107  234:goto            129
						catch(NoSuchFieldError nosuchfielderror10) { }
					//  108  237:astore_0        
						try
						{
							b[ExpeditedOtaStatus.Unavailable.ordinal()] = 8;
						}
					//* 109  238:goto            141
						catch(NoSuchFieldError nosuchfielderror11) { }
					//  110  241:astore_0        
						try
						{
							b[ExpeditedOtaStatus.Unknown.ordinal()] = 9;
						}
					//* 111  242:goto            153
						catch(NoSuchFieldError nosuchfielderror12) { }
					//  112  245:astore_0        
						a = new int[OTAUIServiceDataState.values().length];
						try
						{
							a[OTAUIServiceDataState.ExpeditedOTAStatus.ordinal()] = 1;
						}
					//* 113  246:goto            165
						catch(NoSuchFieldError nosuchfielderror13) { }
					//  114  249:astore_0        
						try
						{
							a[OTAUIServiceDataState.SoftwareUpdateStatus.ordinal()] = 2;
						}
					//* 115  250:goto            185
						catch(NoSuchFieldError nosuchfielderror14) { }
					//  116  253:astore_0        
					//* 117  254:return          
					}
				}

				switch(com.irobot.home._cls1.a[otauiservicedatastate.ordinal()])
		//*  35   74:getstatic       #73  <Field int[] com.irobot.home.RobotSoftwareUpdateActivity$1.a>
		//*  36   77:aload_3         
		//*  37   78:invokevirtual   #77  <Method int OTAUIServiceDataState.ordinal()>
		//*  38   81:iaload          
				{
		//*  39   82:tableswitch     1 2: default 104
		//		               1 121
		//		               2 107
		//*  40  104:goto            55
				case 2: // '\002'
					com.irobot.home.RobotSoftwareUpdateActivity.a(a, otauiservicedata.getSoftwareUpdateStatus());
		//   41  107:aload_0         
		//   42  108:getfield        #12  <Field RobotSoftwareUpdateActivity a>
		//   43  111:aload_1         
		//   44  112:invokevirtual   #81  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
		//   45  115:invokestatic    #84  <Method void com.irobot.home.RobotSoftwareUpdateActivity.a(RobotSoftwareUpdateActivity, SoftwareUpdateStatus)>
					break;

		//*  46  118:goto            55
				case 1: // '\001'
					com.irobot.home.RobotSoftwareUpdateActivity.a(a, otauiservicedata.getExpeditedOtaStatus());
		//   47  121:aload_0         
		//   48  122:getfield        #12  <Field RobotSoftwareUpdateActivity a>
		//   49  125:aload_1         
		//   50  126:invokevirtual   #88  <Method ExpeditedOtaStatus OTAUIServiceData.getExpeditedOtaStatus()>
		//   51  129:invokestatic    #91  <Method void com.irobot.home.RobotSoftwareUpdateActivity.a(RobotSoftwareUpdateActivity, ExpeditedOtaStatus)>
					break;
				}
			} while(true);
		//*  52  132:goto            55
		//   53  135:return          
		}

		final RobotSoftwareUpdateActivity a;

		private a()
		{
			a = RobotSoftwareUpdateActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field RobotSoftwareUpdateActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public RobotSoftwareUpdateActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void BasePushNotificationActivity()>
		n = ((v) (w.a(((android.content.Context) (this)))));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #58  <Method w w.a(android.content.Context)>
	//    5    9:putfield        #60  <Field v n>
		o = new a(((_cls1) (null)));
	//    6   12:aload_0         
	//    7   13:new             #8   <Class RobotSoftwareUpdateActivity$a>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:invokespecial   #63  <Method void RobotSoftwareUpdateActivity$a(RobotSoftwareUpdateActivity, RobotSoftwareUpdateActivity$1)>
	//   12   22:putfield        #65  <Field RobotSoftwareUpdateActivity$a o>
	//   13   25:return          
	}

	private void a(int i1)
	{
		String s1 = com.irobot.home.util.j.a(b).a().getName();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String b>
	//    2    4:invokestatic    #71  <Method a j.a(String)>
	//    3    7:invokevirtual   #76  <Method AssetInfo a.a()>
	//    4   10:invokevirtual   #81  <Method String AssetInfo.getName()>
	//    5   13:astore_2        
		g.setVisibility(8);
	//    6   14:aload_0         
	//    7   15:getfield        #83  <Field TextView g>
	//    8   18:bipush          8
	//    9   20:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		h.setVisibility(8);
	//   10   23:aload_0         
	//   11   24:getfield        #90  <Field TextView h>
	//   12   27:bipush          8
	//   13   29:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		d.setVisibility(0);
	//   14   32:aload_0         
	//   15   33:getfield        #92  <Field TextView d>
	//   16   36:iconst_0        
	//   17   37:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		d.setText(((CharSequence) (getString(i1, new Object[] {
			s1
		}))));
	//   18   40:aload_0         
	//   19   41:getfield        #92  <Field TextView d>
	//   20   44:aload_0         
	//   21   45:iload_1         
	//   22   46:iconst_1        
	//   23   47:anewarray       Object[]
	//   24   50:dup             
	//   25   51:iconst_0        
	//   26   52:aload_2         
	//   27   53:aastore         
	//   28   54:invokevirtual   #98  <Method String getString(int, Object[])>
	//   29   57:invokevirtual   #102 <Method void TextView.setText(CharSequence)>
	//   30   60:return          
	}

	private void a(ExpeditedOtaStatus expeditedotastatus)
	{
		if(AssetCapabilityUtils.isAwsEnabledAsset(com.irobot.home.util.j.a(b).a()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field String b>
	//*   2    4:invokestatic    #71  <Method a j.a(String)>
	//*   3    7:invokevirtual   #76  <Method AssetInfo a.a()>
	//*   4   10:invokestatic    #109 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*   5   13:ifeq            17
			return;
	//    6   16:return          
		String s1 = m;
	//    7   17:getstatic       #49  <Field String m>
	//    8   20:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #111 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #112 <Method void StringBuilder()>
	//   12   28:astore_3        
		stringbuilder.append("onExpectedOtaStatusChanged: ");
	//   13   29:aload_3         
	//   14   30:ldc1            #114 <String "onExpectedOtaStatusChanged: ">
	//   15   32:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
		stringbuilder.append(((Object) (expeditedotastatus)));
	//   17   36:aload_3         
	//   18   37:aload_1         
	//   19   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   20   41:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   21   42:aload_2         
	//   22   43:aload_3         
	//   23   44:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #129 <Method void o.b(String, String)>
		switch(com.irobot.home._cls1.b[expeditedotastatus.ordinal()])
	//*  25   50:getstatic       #132 <Field int[] com.irobot.home.RobotSoftwareUpdateActivity$1.b>
	//*  26   53:aload_1         
	//*  27   54:invokevirtual   #138 <Method int ExpeditedOtaStatus.ordinal()>
	//*  28   57:iaload          
		{
	//*  29   58:tableswitch     1 9: default 108
	//	               1 180
	//	               2 180
	//	               3 175
	//	               4 170
	//	               5 165
	//	               6 160
	//	               7 155
	//	               8 150
	//	               9 145
		default:
			String s2 = m;
	//   30  108:getstatic       #49  <Field String m>
	//   31  111:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   32  112:new             #111 <Class StringBuilder>
	//   33  115:dup             
	//   34  116:invokespecial   #112 <Method void StringBuilder()>
	//   35  119:astore_3        
			stringbuilder1.append("Unhandled expedited OTA status: ");
	//   36  120:aload_3         
	//   37  121:ldc1            #140 <String "Unhandled expedited OTA status: ">
	//   38  123:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   39  126:pop             
			stringbuilder1.append(expeditedotastatus.name());
	//   40  127:aload_3         
	//   41  128:aload_1         
	//   42  129:invokevirtual   #143 <Method String ExpeditedOtaStatus.name()>
	//   43  132:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   44  135:pop             
			com.irobot.home.util.o.d(s2, stringbuilder1.toString());
	//   45  136:aload_2         
	//   46  137:aload_3         
	//   47  138:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   48  141:invokestatic    #145 <Method void o.d(String, String)>
			return;
	//   49  144:return          

		case 9: // '\t'
			p();
	//   50  145:aload_0         
	//   51  146:invokevirtual   #148 <Method void p()>
			return;
	//   52  149:return          

		case 8: // '\b'
			o();
	//   53  150:aload_0         
	//   54  151:invokevirtual   #150 <Method void o()>
			return;
	//   55  154:return          

		case 7: // '\007'
			m();
	//   56  155:aload_0         
	//   57  156:invokevirtual   #152 <Method void m()>
			return;
	//   58  159:return          

		case 6: // '\006'
			l();
	//   59  160:aload_0         
	//   60  161:invokevirtual   #154 <Method void l()>
			return;
	//   61  164:return          

		case 5: // '\005'
			k();
	//   62  165:aload_0         
	//   63  166:invokevirtual   #156 <Method void k()>
			return;
	//   64  169:return          

		case 4: // '\004'
			j();
	//   65  170:aload_0         
	//   66  171:invokevirtual   #158 <Method void j()>
			return;
	//   67  174:return          

		case 3: // '\003'
			i();
	//   68  175:aload_0         
	//   69  176:invokevirtual   #160 <Method void i()>
			return;
	//   70  179:return          

		case 1: // '\001'
		case 2: // '\002'
			h();
	//   71  180:aload_0         
	//   72  181:invokevirtual   #162 <Method void h()>
			return;
	//   73  184:return          
		}
	}

	private void a(SoftwareUpdateStatus softwareupdatestatus)
	{
		if(!AssetCapabilityUtils.isAwsEnabledAsset(com.irobot.home.util.j.a(b).a()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field String b>
	//*   2    4:invokestatic    #71  <Method a j.a(String)>
	//*   3    7:invokevirtual   #76  <Method AssetInfo a.a()>
	//*   4   10:invokestatic    #109 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*   5   13:ifne            17
			return;
	//    6   16:return          
		String s1 = m;
	//    7   17:getstatic       #49  <Field String m>
	//    8   20:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   21:new             #111 <Class StringBuilder>
	//   10   24:dup             
	//   11   25:invokespecial   #112 <Method void StringBuilder()>
	//   12   28:astore_3        
		stringbuilder.append("onSoftwareUpdateStatusChanged: ");
	//   13   29:aload_3         
	//   14   30:ldc1            #165 <String "onSoftwareUpdateStatusChanged: ">
	//   15   32:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
		stringbuilder.append(((Object) (softwareupdatestatus)));
	//   17   36:aload_3         
	//   18   37:aload_1         
	//   19   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   20   41:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   21   42:aload_2         
	//   22   43:aload_3         
	//   23   44:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   24   47:invokestatic    #129 <Method void o.b(String, String)>
		switch(_cls1.c[softwareupdatestatus.ordinal()])
	//*  25   50:getstatic       #167 <Field int[] RobotSoftwareUpdateActivity$1.c>
	//*  26   53:aload_1         
	//*  27   54:invokevirtual   #170 <Method int SoftwareUpdateStatus.ordinal()>
	//*  28   57:iaload          
		{
	//*  29   58:tableswitch     1 4: default 88
	//	               1 163
	//	               2 132
	//	               3 127
	//	               4 122
		default:
			String s2 = m;
	//   30   88:getstatic       #49  <Field String m>
	//   31   91:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   32   92:new             #111 <Class StringBuilder>
	//   33   95:dup             
	//   34   96:invokespecial   #112 <Method void StringBuilder()>
	//   35   99:astore_3        
			stringbuilder1.append("Unhandled software update status: ");
	//   36  100:aload_3         
	//   37  101:ldc1            #172 <String "Unhandled software update status: ">
	//   38  103:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   39  106:pop             
			stringbuilder1.append(((Object) (softwareupdatestatus)));
	//   40  107:aload_3         
	//   41  108:aload_1         
	//   42  109:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   43  112:pop             
			com.irobot.home.util.o.d(s2, stringbuilder1.toString());
	//   44  113:aload_2         
	//   45  114:aload_3         
	//   46  115:invokevirtual   #124 <Method String StringBuilder.toString()>
	//   47  118:invokestatic    #145 <Method void o.d(String, String)>
			return;
	//   48  121:return          

		case 4: // '\004'
			o();
	//   49  122:aload_0         
	//   50  123:invokevirtual   #150 <Method void o()>
			return;
	//   51  126:return          

		case 3: // '\003'
			n();
	//   52  127:aload_0         
	//   53  128:invokevirtual   #174 <Method void n()>
			return;
	//   54  131:return          

		case 2: // '\002'
			softwareupdatestatus = ((SoftwareUpdateStatus) (com.irobot.home.OnDemandOtaActivity_.a(((android.content.Context) (this))).a(b).a(OnDemandOTAEntryType.RequestOnDemandOTA).a(OnDemandOTAPathType.Settings).a(true)));
	//   55  132:aload_0         
	//   56  133:invokestatic    #179 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_.a(android.content.Context)>
	//   57  136:aload_0         
	//   58  137:getfield        #68  <Field String b>
	//   59  140:invokevirtual   #184 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(String)>
	//   60  143:getstatic       #190 <Field OnDemandOTAEntryType OnDemandOTAEntryType.RequestOnDemandOTA>
	//   61  146:invokevirtual   #193 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAEntryType)>
	//   62  149:getstatic       #199 <Field OnDemandOTAPathType OnDemandOTAPathType.Settings>
	//   63  152:invokevirtual   #202 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAPathType)>
	//   64  155:iconst_1        
	//   65  156:invokevirtual   #205 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(boolean)>
	//   66  159:astore_1        
			break;

	//*  67  160:goto            193
		case 1: // '\001'
			softwareupdatestatus = ((SoftwareUpdateStatus) (com.irobot.home.OnDemandOtaActivity_.a(((android.content.Context) (this))).a(b).a(OnDemandOTAStatus.InProgress).a(OnDemandOTAEntryType.ViewOnDemandOTA).a(OnDemandOTAPathType.Settings)));
	//   68  163:aload_0         
	//   69  164:invokestatic    #179 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_.a(android.content.Context)>
	//   70  167:aload_0         
	//   71  168:getfield        #68  <Field String b>
	//   72  171:invokevirtual   #184 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(String)>
	//   73  174:getstatic       #211 <Field OnDemandOTAStatus OnDemandOTAStatus.InProgress>
	//   74  177:invokevirtual   #214 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAStatus)>
	//   75  180:getstatic       #217 <Field OnDemandOTAEntryType OnDemandOTAEntryType.ViewOnDemandOTA>
	//   76  183:invokevirtual   #193 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAEntryType)>
	//   77  186:getstatic       #199 <Field OnDemandOTAPathType OnDemandOTAPathType.Settings>
	//   78  189:invokevirtual   #202 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAPathType)>
	//   79  192:astore_1        
			break;
		}
		((OnDemandOtaActivity_.a) (softwareupdatestatus)).a();
	//   80  193:aload_1         
	//   81  194:invokevirtual   #220 <Method org.androidannotations.api.a.e com.irobot.home.OnDemandOtaActivity_$a.a()>
	//   82  197:pop             
		finish();
	//   83  198:aload_0         
	//   84  199:invokevirtual   #223 <Method void finish()>
	//   85  202:return          
	}

	static void a(RobotSoftwareUpdateActivity robotsoftwareupdateactivity, ExpeditedOtaStatus expeditedotastatus)
	{
		robotsoftwareupdateactivity.a(expeditedotastatus);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #226 <Method void a(ExpeditedOtaStatus)>
	//    3    5:return          
	}

	static void a(RobotSoftwareUpdateActivity robotsoftwareupdateactivity, SoftwareUpdateStatus softwareupdatestatus)
	{
		robotsoftwareupdateactivity.a(softwareupdatestatus);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #229 <Method void a(SoftwareUpdateStatus)>
	//    3    5:return          
	}

	private void a(boolean flag)
	{
		ProgressBar progressbar = j;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field ProgressBar j>
	//    2    4:astore_3        
		byte byte0;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            17
			byte0 = 8;
	//    8   14:bipush          8
	//    9   16:istore_2        
		progressbar.setVisibility(((int) (byte0)));
	//   10   17:aload_3         
	//   11   18:iload_2         
	//   12   19:invokevirtual   #235 <Method void ProgressBar.setVisibility(int)>
	//   13   22:return          
	}

	private void f(int i1)
	{
		String s1 = com.irobot.home.util.j.a(b).a().getName();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String b>
	//    2    4:invokestatic    #71  <Method a j.a(String)>
	//    3    7:invokevirtual   #76  <Method AssetInfo a.a()>
	//    4   10:invokevirtual   #81  <Method String AssetInfo.getName()>
	//    5   13:astore_2        
		f.setText(((CharSequence) (getString(i1, new Object[] {
			s1
		}))));
	//    6   14:aload_0         
	//    7   15:getfield        #237 <Field TextView f>
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:iconst_1        
	//   11   21:anewarray       Object[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:aload_2         
	//   15   27:aastore         
	//   16   28:invokevirtual   #98  <Method String getString(int, Object[])>
	//   17   31:invokevirtual   #102 <Method void TextView.setText(CharSequence)>
		e.setVisibility(0);
	//   18   34:aload_0         
	//   19   35:getfield        #239 <Field TextView e>
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		f.setVisibility(0);
	//   22   42:aload_0         
	//   23   43:getfield        #237 <Field TextView f>
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #88  <Method void TextView.setVisibility(int)>
	//   26   50:return          
	}

	private void g(int i1)
	{
		i.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field LinearLayout i>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #244 <Method void LinearLayout.setVisibility(int)>
		c.setVisibility(0);
	//    4    8:aload_0         
	//    5    9:getfield        #246 <Field Button c>
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #249 <Method void Button.setVisibility(int)>
		c.setText(i1);
	//    8   16:aload_0         
	//    9   17:getfield        #246 <Field Button c>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #251 <Method void Button.setText(int)>
	//   12   24:return          
	}

	static String q()
	{
		return m;
	//    0    0:getstatic       #49  <Field String m>
	//    1    3:areturn         
	}

	private void r()
	{
		e.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field TextView e>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		f.setVisibility(8);
	//    4    9:aload_0         
	//    5   10:getfield        #237 <Field TextView f>
	//    6   13:bipush          8
	//    7   15:invokevirtual   #88  <Method void TextView.setVisibility(int)>
	//    8   18:return          
	}

	private void s()
	{
		c.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field Button c>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #249 <Method void Button.setVisibility(int)>
	//    4    9:return          
	}

	private void t()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f04db).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #256 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #259 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #260 <Int 0x7f0f04db>
	//    5   11:invokevirtual   #264 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    6   14:ldc2            #265 <Int 0x7f0f05bb>
	//    7   17:aconst_null     
	//    8   18:invokevirtual   #269 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//    9   21:invokevirtual   #273 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   10   24:pop             
	//   11   25:return          
	}

	private void x()
	{
		(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f01e6).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    0    0:new             #256 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #259 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//    4    8:ldc2            #275 <Int 0x7f0f01e6>
	//    5   11:invokevirtual   #264 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    6   14:ldc2            #265 <Int 0x7f0f05bb>
	//    7   17:aconst_null     
	//    8   18:invokevirtual   #269 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//    9   21:invokevirtual   #273 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   10   24:pop             
	//   11   25:return          
	}

	void e()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(b).a();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String b>
	//    2    4:invokestatic    #71  <Method a j.a(String)>
	//    3    7:invokevirtual   #76  <Method AssetInfo a.a()>
	//    4   10:astore_1        
		b(0x7f0f0795);
	//    5   11:aload_0         
	//    6   12:ldc2            #279 <Int 0x7f0f0795>
	//    7   15:invokevirtual   #281 <Method void b(int)>
		if(v())
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #285 <Method boolean v()>
	//*  10   22:ifeq            47
		{
			if(!com.irobot.home.util.j.a())
	//*  11   25:invokestatic    #287 <Method boolean j.a()>
	//*  12   28:ifne            36
			{
				com.irobot.home.util.j.b(((android.app.Activity) (this)));
	//   13   31:aload_0         
	//   14   32:invokestatic    #290 <Method void j.b(android.app.Activity)>
				return;
	//   15   35:return          
			}
			r.c(b);
	//   16   36:aload_0         
	//   17   37:getfield        #293 <Field b r>
	//   18   40:aload_0         
	//   19   41:getfield        #68  <Field String b>
	//   20   44:invokevirtual   #298 <Method void b.c(String)>
		}
		p();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #148 <Method void p()>
		k.setVisibility(0);
	//   23   51:aload_0         
	//   24   52:getfield        #300 <Field ImageButton k>
	//   25   55:iconst_0        
	//   26   56:invokevirtual   #303 <Method void ImageButton.setVisibility(int)>
		n.a(com.irobot.home.util.j.a(b).a().getSku());
	//   27   59:aload_0         
	//   28   60:getfield        #60  <Field v n>
	//   29   63:aload_0         
	//   30   64:getfield        #68  <Field String b>
	//   31   67:invokestatic    #71  <Method a j.a(String)>
	//   32   70:invokevirtual   #76  <Method AssetInfo a.a()>
	//   33   73:invokevirtual   #306 <Method String AssetInfo.getSku()>
	//   34   76:invokevirtual   #310 <Method void v.a(String)>
		l = Assembler.getInstance().getUpdateUIService(assetinfo.getAssetId());
	//   35   79:aload_0         
	//   36   80:invokestatic    #316 <Method Assembler Assembler.getInstance()>
	//   37   83:aload_1         
	//   38   84:invokevirtual   #320 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   39   87:invokevirtual   #324 <Method UpdateUIService Assembler.getUpdateUIService(com.irobot.core.AssetId)>
	//   40   90:putfield        #326 <Field UpdateUIService l>
		l.sendCommand(OTAUIServiceCommand.ExpeditedOTAViewed, ((OTAUIServiceData) (null)));
	//   41   93:aload_0         
	//   42   94:getfield        #326 <Field UpdateUIService l>
	//   43   97:getstatic       #332 <Field OTAUIServiceCommand OTAUIServiceCommand.ExpeditedOTAViewed>
	//   44  100:aconst_null     
	//   45  101:invokevirtual   #338 <Method void UpdateUIService.sendCommand(OTAUIServiceCommand, OTAUIServiceData)>
	//   46  104:return          
	}

	protected void f()
	{
		if(!n.a("provisioning_ota", 0x7f0f05d8))
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field v n>
	//*   2    4:ldc2            #341 <String "provisioning_ota">
	//*   3    7:ldc2            #342 <Int 0x7f0f05d8>
	//*   4   10:invokevirtual   #345 <Method boolean v.a(String, int)>
	//*   5   13:ifne            41
			(new android.app.AlertDialog.Builder(((android.content.Context) (this)))).setMessage(0x7f0f0960).setPositiveButton(0x7f0f05bb, ((android.content.DialogInterface.OnClickListener) (null))).show();
	//    6   16:new             #256 <Class android.app.AlertDialog$Builder>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:invokespecial   #259 <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   10   24:ldc2            #346 <Int 0x7f0f0960>
	//   11   27:invokevirtual   #264 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   12   30:ldc2            #265 <Int 0x7f0f05bb>
	//   13   33:aconst_null     
	//   14   34:invokevirtual   #269 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   15   37:invokevirtual   #273 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   16   40:pop             
	//   17   41:return          
	}

	public void g()
	{
		if(!com.irobot.home.util.j.a())
	//*   0    0:invokestatic    #287 <Method boolean j.a()>
	//*   1    3:ifne            11
		{
			t();
	//    2    6:aload_0         
	//    3    7:invokespecial   #348 <Method void t()>
			return;
	//    4   10:return          
		} else
		{
			l.sendCommand(OTAUIServiceCommand.ExpeditedOTARequested, ((OTAUIServiceData) (null)));
	//    5   11:aload_0         
	//    6   12:getfield        #326 <Field UpdateUIService l>
	//    7   15:getstatic       #351 <Field OTAUIServiceCommand OTAUIServiceCommand.ExpeditedOTARequested>
	//    8   18:aconst_null     
	//    9   19:invokevirtual   #338 <Method void UpdateUIService.sendCommand(OTAUIServiceCommand, OTAUIServiceData)>
			return;
	//   10   22:return          
		}
	}

	protected void h()
	{
		a(0x7f0f079e);
	//    0    0:aload_0         
	//    1    1:ldc2            #352 <Int 0x7f0f079e>
	//    2    4:invokespecial   #354 <Method void a(int)>
		r();
	//    3    7:aload_0         
	//    4    8:invokespecial   #356 <Method void r()>
		g(0x7f0f0754);
	//    5   11:aload_0         
	//    6   12:ldc2            #357 <Int 0x7f0f0754>
	//    7   15:invokespecial   #359 <Method void g(int)>
		a(false);
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:invokespecial   #361 <Method void a(boolean)>
	//   11   23:return          
	}

	protected void i()
	{
		s();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method void s()>
		a(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokespecial   #361 <Method void a(boolean)>
	//    5    9:return          
	}

	protected void j()
	{
		x();
	//    0    0:aload_0         
	//    1    1:invokespecial   #365 <Method void x()>
		g(0x7f0f0754);
	//    2    4:aload_0         
	//    3    5:ldc2            #357 <Int 0x7f0f0754>
	//    4    8:invokespecial   #359 <Method void g(int)>
		a(false);
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:invokespecial   #361 <Method void a(boolean)>
	//    8   16:return          
	}

	protected void k()
	{
		Toast toast = Toast.makeText(((android.content.Context) (this)), 0x7f0f0945, 0);
	//    0    0:aload_0         
	//    1    1:ldc2            #366 <Int 0x7f0f0945>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #372 <Method Toast Toast.makeText(android.content.Context, int, int)>
	//    4    8:astore_1        
		toast.setView(getLayoutInflater().inflate(0x7f0b0151, ((android.view.ViewGroup) (null))));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #376 <Method LayoutInflater getLayoutInflater()>
	//    8   14:ldc2            #377 <Int 0x7f0b0151>
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #383 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   11   21:invokevirtual   #387 <Method void Toast.setView(android.view.View)>
		toast.setGravity(119, 0, 0);
	//   12   24:aload_1         
	//   13   25:bipush          119
	//   14   27:iconst_0        
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #391 <Method void Toast.setGravity(int, int, int)>
		toast.show();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #393 <Method void Toast.show()>
		a(0x7f0f07a0);
	//   19   36:aload_0         
	//   20   37:ldc2            #394 <Int 0x7f0f07a0>
	//   21   40:invokespecial   #354 <Method void a(int)>
		r();
	//   22   43:aload_0         
	//   23   44:invokespecial   #356 <Method void r()>
		s();
	//   24   47:aload_0         
	//   25   48:invokespecial   #363 <Method void s()>
		a(false);
	//   26   51:aload_0         
	//   27   52:iconst_0        
	//   28   53:invokespecial   #361 <Method void a(boolean)>
	//   29   56:return          
	}

	protected void l()
	{
		a(0x7f0f079d);
	//    0    0:aload_0         
	//    1    1:ldc2            #395 <Int 0x7f0f079d>
	//    2    4:invokespecial   #354 <Method void a(int)>
		f(0x7f0f078f);
	//    3    7:aload_0         
	//    4    8:ldc2            #396 <Int 0x7f0f078f>
	//    5   11:invokespecial   #398 <Method void f(int)>
		g(0x7f0f0762);
	//    6   14:aload_0         
	//    7   15:ldc2            #399 <Int 0x7f0f0762>
	//    8   18:invokespecial   #359 <Method void g(int)>
		a(false);
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:invokespecial   #361 <Method void a(boolean)>
	//   12   26:return          
	}

	protected void m()
	{
		a(0x7f0f07a0);
	//    0    0:aload_0         
	//    1    1:ldc2            #394 <Int 0x7f0f07a0>
	//    2    4:invokespecial   #354 <Method void a(int)>
		r();
	//    3    7:aload_0         
	//    4    8:invokespecial   #356 <Method void r()>
		s();
	//    5   11:aload_0         
	//    6   12:invokespecial   #363 <Method void s()>
		a(false);
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:invokespecial   #361 <Method void a(boolean)>
	//   10   20:return          
	}

	protected void n()
	{
		Object obj = ((Object) (com.irobot.home.util.j.a(b).a()));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field String b>
	//    2    4:invokestatic    #71  <Method a j.a(String)>
	//    3    7:invokevirtual   #76  <Method AssetInfo a.a()>
	//    4   10:astore_1        
		g.setVisibility(0);
	//    5   11:aload_0         
	//    6   12:getfield        #83  <Field TextView g>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		g.setText(((CharSequence) (getString(0x7f0f079f, new Object[] {
			((AssetInfo) (obj)).getName()
		}))));
	//    9   19:aload_0         
	//   10   20:getfield        #83  <Field TextView g>
	//   11   23:aload_0         
	//   12   24:ldc2            #400 <Int 0x7f0f079f>
	//   13   27:iconst_1        
	//   14   28:anewarray       Object[]
	//   15   31:dup             
	//   16   32:iconst_0        
	//   17   33:aload_1         
	//   18   34:invokevirtual   #81  <Method String AssetInfo.getName()>
	//   19   37:aastore         
	//   20   38:invokevirtual   #98  <Method String getString(int, Object[])>
	//   21   41:invokevirtual   #102 <Method void TextView.setText(CharSequence)>
		h.setVisibility(0);
	//   22   44:aload_0         
	//   23   45:getfield        #90  <Field TextView h>
	//   24   48:iconst_0        
	//   25   49:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		obj = ((Object) (SoftwareVersion.create(((AssetInfo) (obj)).getSoftwareVersion())));
	//   26   52:aload_1         
	//   27   53:invokevirtual   #403 <Method String AssetInfo.getSoftwareVersion()>
	//   28   56:invokestatic    #409 <Method SoftwareVersion SoftwareVersion.create(String)>
	//   29   59:astore_1        
		h.setText(((CharSequence) (getString(0x7f0f085c, new Object[] {
			((SoftwareVersion) (obj)).toString()
		}))));
	//   30   60:aload_0         
	//   31   61:getfield        #90  <Field TextView h>
	//   32   64:aload_0         
	//   33   65:ldc2            #410 <Int 0x7f0f085c>
	//   34   68:iconst_1        
	//   35   69:anewarray       Object[]
	//   36   72:dup             
	//   37   73:iconst_0        
	//   38   74:aload_1         
	//   39   75:invokevirtual   #411 <Method String SoftwareVersion.toString()>
	//   40   78:aastore         
	//   41   79:invokevirtual   #98  <Method String getString(int, Object[])>
	//   42   82:invokevirtual   #102 <Method void TextView.setText(CharSequence)>
		d.setVisibility(8);
	//   43   85:aload_0         
	//   44   86:getfield        #92  <Field TextView d>
	//   45   89:bipush          8
	//   46   91:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		r();
	//   47   94:aload_0         
	//   48   95:invokespecial   #356 <Method void r()>
		s();
	//   49   98:aload_0         
	//   50   99:invokespecial   #363 <Method void s()>
		a(false);
	//   51  102:aload_0         
	//   52  103:iconst_0        
	//   53  104:invokespecial   #361 <Method void a(boolean)>
	//   54  107:return          
	}

	protected void o()
	{
		a(0x7f0f085a);
	//    0    0:aload_0         
	//    1    1:ldc2            #412 <Int 0x7f0f085a>
	//    2    4:invokespecial   #354 <Method void a(int)>
		r();
	//    3    7:aload_0         
	//    4    8:invokespecial   #356 <Method void r()>
		s();
	//    5   11:aload_0         
	//    6   12:invokespecial   #363 <Method void s()>
		a(false);
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:invokespecial   #361 <Method void a(boolean)>
	//   10   20:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #415 <Method void BasePushNotificationActivity.onStart()>
		l.registerUISubscriber(((OTAUIServiceDataCallback) (o)));
	//    2    4:aload_0         
	//    3    5:getfield        #326 <Field UpdateUIService l>
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field RobotSoftwareUpdateActivity$a o>
	//    6   12:invokevirtual   #419 <Method boolean UpdateUIService.registerUISubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #422 <Method void BasePushNotificationActivity.onStop()>
		l.unregisterSubscriber(((OTAUIServiceDataCallback) (o)));
	//    2    4:aload_0         
	//    3    5:getfield        #326 <Field UpdateUIService l>
	//    4    8:aload_0         
	//    5    9:getfield        #65  <Field RobotSoftwareUpdateActivity$a o>
	//    6   12:invokevirtual   #425 <Method boolean UpdateUIService.unregisterSubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void p()
	{
		d.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field TextView d>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #88  <Method void TextView.setVisibility(int)>
		r();
	//    4    9:aload_0         
	//    5   10:invokespecial   #356 <Method void r()>
		s();
	//    6   13:aload_0         
	//    7   14:invokespecial   #363 <Method void s()>
		a(true);
	//    8   17:aload_0         
	//    9   18:iconst_1        
	//   10   19:invokespecial   #361 <Method void a(boolean)>
	//   11   22:return          
	}

	private static final String m = com.irobot.home.util.j.r(((Class) (com/irobot/home/RobotSoftwareUpdateActivity)).getSimpleName());
	IRobotApplication a;
	String b;
	Button c;
	TextView d;
	TextView e;
	TextView f;
	TextView g;
	TextView h;
	LinearLayout i;
	ProgressBar j;
	ImageButton k;
	UpdateUIService l;
	private v n;
	private a o;

	static 
	{
	//    0    0:ldc1            #2   <Class RobotSoftwareUpdateActivity>
	//    1    2:invokevirtual   #41  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #47  <Method String j.r(String)>
	//    3    8:putstatic       #49  <Field String m>
	//*   4   11:return          
	}
}
