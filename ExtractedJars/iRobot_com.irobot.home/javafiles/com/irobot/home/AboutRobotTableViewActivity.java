// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.irobot.core.AccountService;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetInfo;
import com.irobot.core.FeatureType;
import com.irobot.core.OTAUIServiceData;
import com.irobot.core.OTAUIServiceDataCallback;
import com.irobot.core.OTAUIServiceDataState;
import com.irobot.core.OnDemandOTAEntryType;
import com.irobot.core.OnDemandOTAPathType;
import com.irobot.core.OnDemandOTAStatus;
import com.irobot.core.RegistrationService;
import com.irobot.core.SoftwareUpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.core.ViewId;
import com.irobot.home.model.Robot;
import com.irobot.home.model.RobotAxedaPreferences;
import com.irobot.home.model.RobotPreferences;
import com.irobot.home.model.a;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.androidannotations.a.a.a.b;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, WebViewActivity_, AboutRobotSettingsPresenter, RobotSoftwareUpdateActivity_, 
//			OnDemandOtaActivity_, OtaMqttActivity_

public class AboutRobotTableViewActivity extends BaseFragmentActivity
	implements AboutRobotSettingsPresenter.a
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
		//    5    9:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
		//    6   10:new             #29  <Class StringBuilder>
		//    7   13:dup             
		//    8   14:invokespecial   #30  <Method void StringBuilder()>
		//    9   17:astore          4
			stringbuilder.append("Change list: ");
		//   10   19:aload           4
		//   11   21:ldc1            #32  <String "Change list: ">
		//   12   23:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(((ArrayList) (obj)).toString());
		//   14   27:aload           4
		//   15   29:aload_3         
		//   16   30:invokevirtual   #42  <Method String ArrayList.toString()>
		//   17   33:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   18   36:pop             
			com.irobot.home.util.o.b("AboutRobot", stringbuilder.toString());
		//   19   37:ldc1            #44  <String "AboutRobot">
		//   20   39:aload           4
		//   21   41:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   22   44:invokestatic    #51  <Method void o.b(String, String)>
			obj = ((Object) (((ArrayList) (obj)).iterator()));
		//   23   47:aload_3         
		//   24   48:invokevirtual   #55  <Method Iterator ArrayList.iterator()>
		//   25   51:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
		//   26   52:aload_3         
		//   27   53:invokeinterface #61  <Method boolean Iterator.hasNext()>
		//   28   58:ifeq            154
				OTAUIServiceDataState otauiservicedatastate = (OTAUIServiceDataState)((Iterator) (obj)).next();
		//   29   61:aload_3         
		//   30   62:invokeinterface #65  <Method Object Iterator.next()>
		//   31   67:checkcast       #67  <Class OTAUIServiceDataState>
		//   32   70:astore          4
				static class _cls3
				{

					static final int a[];
					static final int b[];

					static 
					{
						b = new int[SoftwareUpdateStatus.values().length];
					//    0    0:invokestatic    #19  <Method SoftwareUpdateStatus[] SoftwareUpdateStatus.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #21  <Field int[] b>
						try
						{
							b[SoftwareUpdateStatus.InProgress.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] b>
					//    5   12:getstatic       #25  <Field SoftwareUpdateStatus SoftwareUpdateStatus.InProgress>
					//    6   15:invokevirtual   #29  <Method int SoftwareUpdateStatus.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #21  <Field int[] b>
					//*  10   23:getstatic       #32  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
					//*  11   26:invokevirtual   #29  <Method int SoftwareUpdateStatus.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #21  <Field int[] b>
					//*  15   34:getstatic       #35  <Field SoftwareUpdateStatus SoftwareUpdateStatus.UpToDate>
					//*  16   37:invokevirtual   #29  <Method int SoftwareUpdateStatus.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #21  <Field int[] b>
					//*  20   45:getstatic       #38  <Field SoftwareUpdateStatus SoftwareUpdateStatus.Unavailable>
					//*  21   48:invokevirtual   #29  <Method int SoftwareUpdateStatus.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:invokestatic    #43  <Method OTAUIServiceDataState[] OTAUIServiceDataState.values()>
					//*  25   56:arraylength     
					//*  26   57:newarray        int[]
					//*  27   59:putstatic       #45  <Field int[] a>
					//*  28   62:getstatic       #45  <Field int[] a>
					//*  29   65:getstatic       #49  <Field OTAUIServiceDataState OTAUIServiceDataState.ExpeditedOTAStatus>
					//*  30   68:invokevirtual   #50  <Method int OTAUIServiceDataState.ordinal()>
					//*  31   71:iconst_1        
					//*  32   72:iastore         
					//*  33   73:getstatic       #45  <Field int[] a>
					//*  34   76:getstatic       #53  <Field OTAUIServiceDataState OTAUIServiceDataState.SoftwareUpdateStatus>
					//*  35   79:invokevirtual   #50  <Method int OTAUIServiceDataState.ordinal()>
					//*  36   82:iconst_2        
					//*  37   83:iastore         
					//*  38   84:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   39   85:astore_0        
						try
						{
							b[SoftwareUpdateStatus.AvailableAndReady.ordinal()] = 2;
						}
					//*  40   86:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   41   89:astore_0        
						try
						{
							b[SoftwareUpdateStatus.UpToDate.ordinal()] = 3;
						}
					//*  42   90:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   43   93:astore_0        
						try
						{
							b[SoftwareUpdateStatus.Unavailable.ordinal()] = 4;
						}
					//*  44   94:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   45   97:astore_0        
						a = new int[OTAUIServiceDataState.values().length];
						try
						{
							a[OTAUIServiceDataState.ExpeditedOTAStatus.ordinal()] = 1;
						}
					//*  46   98:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   47  101:astore_0        
						try
						{
							a[OTAUIServiceDataState.SoftwareUpdateStatus.ordinal()] = 2;
						}
					//*  48  102:goto            73
						catch(NoSuchFieldError nosuchfielderror5) { }
					//   49  105:astore_0        
					//*  50  106:return          
					}
				}

				switch(com.irobot.home._cls3.a[otauiservicedatastate.ordinal()])
		//*  33   72:getstatic       #72  <Field int[] com.irobot.home.AboutRobotTableViewActivity$3.a>
		//*  34   75:aload           4
		//*  35   77:invokevirtual   #76  <Method int OTAUIServiceDataState.ordinal()>
		//*  36   80:iaload          
				{
		//*  37   81:tableswitch     1 2: default 104
		//		               1 52
		//		               2 107
		//*  38  104:goto            52
				case 2: // '\002'
					com.irobot.home.AboutRobotTableViewActivity.a(a, otauiservicedata.getSoftwareUpdateStatus());
		//   39  107:aload_0         
		//   40  108:getfield        #12  <Field AboutRobotTableViewActivity a>
		//   41  111:aload_1         
		//   42  112:invokevirtual   #80  <Method SoftwareUpdateStatus OTAUIServiceData.getSoftwareUpdateStatus()>
		//   43  115:invokestatic    #83  <Method SoftwareUpdateStatus com.irobot.home.AboutRobotTableViewActivity.a(AboutRobotTableViewActivity, SoftwareUpdateStatus)>
		//   44  118:pop             
					AboutRobotTableViewActivity aboutrobottableviewactivity = a;
		//   45  119:aload_0         
		//   46  120:getfield        #12  <Field AboutRobotTableViewActivity a>
		//   47  123:astore          4
					boolean flag;
					if(com.irobot.home.AboutRobotTableViewActivity.a(a) == SoftwareUpdateStatus.AvailableAndReady)
		//*  48  125:aload_0         
		//*  49  126:getfield        #12  <Field AboutRobotTableViewActivity a>
		//*  50  129:invokestatic    #86  <Method SoftwareUpdateStatus com.irobot.home.AboutRobotTableViewActivity.a(AboutRobotTableViewActivity)>
		//*  51  132:getstatic       #92  <Field SoftwareUpdateStatus SoftwareUpdateStatus.AvailableAndReady>
		//*  52  135:if_acmpne       143
						flag = true;
		//   53  138:iconst_1        
		//   54  139:istore_2        
					else
		//*  55  140:goto            145
						flag = false;
		//   56  143:iconst_0        
		//   57  144:istore_2        
					aboutrobottableviewactivity.a(flag);
		//   58  145:aload           4
		//   59  147:iload_2         
		//   60  148:invokevirtual   #95  <Method void com.irobot.home.AboutRobotTableViewActivity.a(boolean)>
					break;
				}
			} while(true);
		//*  61  151:goto            52
		//   62  154:return          
		}

		final AboutRobotTableViewActivity a;

		private a()
		{
			a = AboutRobotTableViewActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field AboutRobotTableViewActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void OTAUIServiceDataCallback()>
		//    5    9:return          
		}

	}


	public AboutRobotTableViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void BaseFragmentActivity()>
		o = SoftwareUpdateStatus.Unknown;
	//    2    4:aload_0         
	//    3    5:getstatic       #49  <Field SoftwareUpdateStatus SoftwareUpdateStatus.Unknown>
	//    4    8:putfield        #51  <Field SoftwareUpdateStatus o>
		t = new a();
	//    5   11:aload_0         
	//    6   12:new             #14  <Class AboutRobotTableViewActivity$a>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:invokespecial   #54  <Method void AboutRobotTableViewActivity$a(AboutRobotTableViewActivity, AboutRobotTableViewActivity$1)>
	//   11   21:putfield        #56  <Field AboutRobotTableViewActivity$a t>
	//   12   24:return          
	}

	static SoftwareUpdateStatus a(AboutRobotTableViewActivity aboutrobottableviewactivity)
	{
		return aboutrobottableviewactivity.o;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field SoftwareUpdateStatus o>
	//    2    4:areturn         
	}

	static SoftwareUpdateStatus a(AboutRobotTableViewActivity aboutrobottableviewactivity, SoftwareUpdateStatus softwareupdatestatus)
	{
		aboutrobottableviewactivity.o = softwareupdatestatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field SoftwareUpdateStatus o>
		return softwareupdatestatus;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private CustomTextView a(RelativeLayout relativelayout, int i1)
	{
		com.irobot.home.util.j.a(relativelayout, i1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #65  <Method android.widget.TextView j.a(RelativeLayout, int)>
	//    3    5:pop             
		return (CustomTextView)relativelayout.findViewById(0x7f09042d);
	//    4    6:aload_1         
	//    5    7:ldc1            #66  <Int 0x7f09042d>
	//    6    9:invokevirtual   #72  <Method View RelativeLayout.findViewById(int)>
	//    7   12:checkcast       #74  <Class CustomTextView>
	//    8   15:areturn         
	}

	static void a(AboutRobotTableViewActivity aboutrobottableviewactivity, String s)
	{
		aboutrobottableviewactivity.f(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method void f(String)>
	//    3    5:return          
	}

	private void f(String s)
	{
		com.irobot.home.WebViewActivity_.a(((android.content.Context) (this))).a(s).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #83  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(android.content.Context)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #88  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    4    8:invokevirtual   #91  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//    5   11:pop             
	//    6   12:return          
	}

	private void i()
	{
		if(Assembler.getInstance().getAccountService().isFeatureEnabled(FeatureType.LocalOta))
	//*   0    0:invokestatic    #97  <Method Assembler Assembler.getInstance()>
	//*   1    3:invokevirtual   #101 <Method AccountService Assembler.getAccountService()>
	//*   2    6:getstatic       #107 <Field FeatureType FeatureType.LocalOta>
	//*   3    9:invokevirtual   #113 <Method boolean AccountService.isFeatureEnabled(FeatureType)>
	//*   4   12:ifeq            34
		{
			a(f, 0x7f0f0947);
	//    5   15:aload_0         
	//    6   16:aload_0         
	//    7   17:getfield        #115 <Field RelativeLayout f>
	//    8   20:ldc1            #116 <Int 0x7f0f0947>
	//    9   22:invokespecial   #118 <Method CustomTextView a(RelativeLayout, int)>
	//   10   25:pop             
			f.setVisibility(0);
	//   11   26:aload_0         
	//   12   27:getfield        #115 <Field RelativeLayout f>
	//   13   30:iconst_0        
	//   14   31:invokevirtual   #122 <Method void RelativeLayout.setVisibility(int)>
		}
	//   15   34:return          
	}

	public void a(String s)
	{
		CustomTextView customtextview = i;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field CustomTextView i>
	//    2    4:astore_2        
		if(!com.irobot.home.util.j.i(s))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #127 <Method boolean j.i(String)>
	//*   5    9:ifeq            15
	//*   6   12:goto            25
			s = getResources().getString(0x7f0f0929);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #131 <Method Resources getResources()>
	//    9   19:ldc1            #132 <Int 0x7f0f0929>
	//   10   21:invokevirtual   #138 <Method String Resources.getString(int)>
	//   11   24:astore_1        
		customtextview.setText(((CharSequence) (s)));
	//   12   25:aload_2         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #142 <Method void CustomTextView.setText(CharSequence)>
	//   15   30:return          
	}

	protected void a(boolean flag)
	{
		View view = c.findViewById(0x7f090470);
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field RelativeLayout c>
	//    2    4:ldc1            #146 <Int 0x7f090470>
	//    3    6:invokevirtual   #72  <Method View RelativeLayout.findViewById(int)>
	//    4    9:astore          4
		byte byte1 = 8;
	//    5   11:bipush          8
	//    6   13:istore_3        
		byte byte0;
		if(flag)
	//*   7   14:iload_1         
	//*   8   15:ifeq            23
			byte0 = 0;
	//    9   18:iconst_0        
	//   10   19:istore_2        
		else
	//*  11   20:goto            26
			byte0 = 8;
	//   12   23:bipush          8
	//   13   25:istore_2        
		view.setVisibility(((int) (byte0)));
	//   14   26:aload           4
	//   15   28:iload_2         
	//   16   29:invokevirtual   #149 <Method void View.setVisibility(int)>
		view = c.findViewById(0x7f090054);
	//   17   32:aload_0         
	//   18   33:getfield        #145 <Field RelativeLayout c>
	//   19   36:ldc1            #150 <Int 0x7f090054>
	//   20   38:invokevirtual   #72  <Method View RelativeLayout.findViewById(int)>
	//   21   41:astore          4
		if(flag)
	//*  22   43:iload_1         
	//*  23   44:ifeq            52
			byte0 = byte1;
	//   24   47:iload_3         
	//   25   48:istore_2        
		else
	//*  26   49:goto            54
			byte0 = 0;
	//   27   52:iconst_0        
	//   28   53:istore_2        
		view.setVisibility(((int) (byte0)));
	//   29   54:aload           4
	//   30   56:iload_2         
	//   31   57:invokevirtual   #149 <Method void View.setVisibility(int)>
	//   32   60:return          
	}

	public void b(String s)
	{
		Object obj;
		obj = ((Object) (com.irobot.home.util.j.o(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field String a>
	//    2    4:invokestatic    #157 <Method Robot j.o(String)>
	//    3    7:astore_2        
		if(!com.irobot.home.util.j.i(s))
	//*   4    8:aload_1         
	//*   5    9:invokestatic    #127 <Method boolean j.i(String)>
	//*   6   12:ifne            25
		{
			d.setVisibility(8);
	//    7   15:aload_0         
	//    8   16:getfield        #159 <Field RelativeLayout d>
	//    9   19:bipush          8
	//   10   21:invokevirtual   #122 <Method void RelativeLayout.setVisibility(int)>
			return;
	//   11   24:return          
		}
		try
		{
			SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
	//   12   25:new             #161 <Class SimpleDateFormat>
	//   13   28:dup             
	//   14   29:ldc1            #163 <String "yyyy-MM-dd HH:mm:ssZ">
	//   15   31:invokespecial   #165 <Method void SimpleDateFormat(String)>
	//   16   34:astore_3        
			((DateFormat) (simpledateformat)).setTimeZone(TimeZone.getTimeZone(((Robot) (obj)).a().e().b()));
	//   17   35:aload_3         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #170 <Method RobotPreferences Robot.a()>
	//   20   40:invokevirtual   #175 <Method RobotAxedaPreferences RobotPreferences.e()>
	//   21   43:invokevirtual   #180 <Method String RobotAxedaPreferences.b()>
	//   22   46:invokestatic    #186 <Method TimeZone TimeZone.getTimeZone(String)>
	//   23   49:invokevirtual   #192 <Method void DateFormat.setTimeZone(TimeZone)>
			s = ((String) (((DateFormat) (simpledateformat)).parse(s)));
	//   24   52:aload_3         
	//   25   53:aload_1         
	//   26   54:invokevirtual   #196 <Method java.util.Date DateFormat.parse(String)>
	//   27   57:astore_1        
			obj = ((Object) (new SimpleDateFormat("MMMM d, yyyy")));
	//   28   58:new             #161 <Class SimpleDateFormat>
	//   29   61:dup             
	//   30   62:ldc1            #198 <String "MMMM d, yyyy">
	//   31   64:invokespecial   #165 <Method void SimpleDateFormat(String)>
	//   32   67:astore_2        
			((DateFormat) (obj)).setTimeZone(TimeZone.getDefault());
	//   33   68:aload_2         
	//   34   69:invokestatic    #202 <Method TimeZone TimeZone.getDefault()>
	//   35   72:invokevirtual   #192 <Method void DateFormat.setTimeZone(TimeZone)>
			j.setText(((CharSequence) (((DateFormat) (obj)).format(((java.util.Date) (s))))));
	//   36   75:aload_0         
	//   37   76:getfield        #204 <Field CustomTextView j>
	//   38   79:aload_2         
	//   39   80:aload_1         
	//   40   81:invokevirtual   #208 <Method String DateFormat.format(java.util.Date)>
	//   41   84:invokevirtual   #142 <Method void CustomTextView.setText(CharSequence)>
			d.setVisibility(0);
	//   42   87:aload_0         
	//   43   88:getfield        #159 <Field RelativeLayout d>
	//   44   91:iconst_0        
	//   45   92:invokevirtual   #122 <Method void RelativeLayout.setVisibility(int)>
			return;
	//   46   95:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  47   96:astore_1        
		{
			((Exception) (s)).printStackTrace();
	//   48   97:aload_1         
	//   49   98:invokevirtual   #211 <Method void Exception.printStackTrace()>
		}
		com.irobot.home.util.o.e("AboutRobot", "Error encountered while parsing lastSwUpdate");
	//   50  101:ldc1            #213 <String "AboutRobot">
	//   51  103:ldc1            #215 <String "Error encountered while parsing lastSwUpdate">
	//   52  105:invokestatic    #220 <Method void o.e(String, String)>
		d.setVisibility(8);
	//   53  108:aload_0         
	//   54  109:getfield        #159 <Field RelativeLayout d>
	//   55  112:bipush          8
	//   56  114:invokevirtual   #122 <Method void RelativeLayout.setVisibility(int)>
		return;
	//   57  117:return          
	}

	public void c(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
		{
			s = com.irobot.home.util.j.g(s);
	//    2    4:aload_1         
	//    3    5:invokestatic    #223 <Method String j.g(String)>
	//    4    8:astore_1        
			if(s != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
				g.setText(((CharSequence) (s)));
	//    7   13:aload_0         
	//    8   14:getfield        #225 <Field CustomTextView g>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #142 <Method void CustomTextView.setText(CharSequence)>
		}
	//   11   21:return          
	}

	void d(String s)
	{
		String s1;
label0:
		{
label1:
			{
				if(com.irobot.home.util.j.i(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #127 <Method boolean j.i(String)>
	//*   2    4:ifeq            41
				{
					e.setClickable(false);
	//    3    7:aload_0         
	//    4    8:getfield        #227 <Field RelativeLayout e>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #230 <Method void RelativeLayout.setClickable(boolean)>
					k.setText(((CharSequence) (s)));
	//    7   15:aload_0         
	//    8   16:getfield        #232 <Field CustomTextView k>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #142 <Method void CustomTextView.setText(CharSequence)>
					k.setVisibility(0);
	//   11   23:aload_0         
	//   12   24:getfield        #232 <Field CustomTextView k>
	//   13   27:iconst_0        
	//   14   28:invokevirtual   #233 <Method void CustomTextView.setVisibility(int)>
					l.setVisibility(8);
	//   15   31:aload_0         
	//   16   32:getfield        #235 <Field ImageView l>
	//   17   35:bipush          8
	//   18   37:invokevirtual   #238 <Method void ImageView.setVisibility(int)>
					return;
	//   19   40:return          
				}
				s = ((String) (m));
	//   20   41:aload_0         
	//   21   42:getfield        #240 <Field RobotErrorHelpContentList m>
	//   22   45:astore_1        
				s1 = null;
	//   23   46:aconst_null     
	//   24   47:astore_2        
				if(s == null || m.otherContent == null)
					break label1;
	//   25   48:aload_1         
	//   26   49:ifnull          110
	//   27   52:aload_0         
	//   28   53:getfield        #240 <Field RobotErrorHelpContentList m>
	//   29   56:getfield        #246 <Field List RobotErrorHelpContentList.otherContent>
	//   30   59:ifnull          110
				Iterator iterator = m.otherContent.iterator();
	//   31   62:aload_0         
	//   32   63:getfield        #240 <Field RobotErrorHelpContentList m>
	//   33   66:getfield        #246 <Field List RobotErrorHelpContentList.otherContent>
	//   34   69:invokeinterface #252 <Method Iterator List.iterator()>
	//   35   74:astore_3        
				do
				{
					if(!iterator.hasNext())
						break label1;
	//   36   75:aload_3         
	//   37   76:invokeinterface #258 <Method boolean Iterator.hasNext()>
	//   38   81:ifeq            110
					s = ((String) ((RobotErrorHelpContent)iterator.next()));
	//   39   84:aload_3         
	//   40   85:invokeinterface #262 <Method Object Iterator.next()>
	//   41   90:checkcast       #264 <Class RobotErrorHelpContent>
	//   42   93:astore_1        
				} while(!"Serial_number".equalsIgnoreCase(((RobotErrorHelpContent) (s)).id));
	//   43   94:ldc2            #266 <String "Serial_number">
	//   44   97:aload_1         
	//   45   98:getfield        #269 <Field String RobotErrorHelpContent.id>
	//   46  101:invokevirtual   #274 <Method boolean String.equalsIgnoreCase(String)>
	//   47  104:ifeq            75
				break label0;
	//   48  107:goto            112
			}
			s = null;
	//   49  110:aconst_null     
	//   50  111:astore_1        
		}
		if(s != null)
	//*  51  112:aload_1         
	//*  52  113:ifnull          121
			s1 = ((RobotErrorHelpContent) (s)).content;
	//   53  116:aload_1         
	//   54  117:getfield        #277 <Field String RobotErrorHelpContent.content>
	//   55  120:astore_2        
		if(com.irobot.home.util.j.i(s1))
	//*  56  121:aload_2         
	//*  57  122:invokestatic    #127 <Method boolean j.i(String)>
	//*  58  125:ifeq            170
		{
			e.setClickable(true);
	//   59  128:aload_0         
	//   60  129:getfield        #227 <Field RelativeLayout e>
	//   61  132:iconst_1        
	//   62  133:invokevirtual   #230 <Method void RelativeLayout.setClickable(boolean)>
			e.setOnClickListener(new android.view.View.OnClickListener(s1) {

				public void onClick(View view)
				{
					com.irobot.home.AboutRobotTableViewActivity.a(b, a);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field AboutRobotTableViewActivity b>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field String a>
				//    4    8:invokestatic    #29  <Method void com.irobot.home.AboutRobotTableViewActivity.a(AboutRobotTableViewActivity, String)>
				//    5   11:return          
				}

				final String a;
				final AboutRobotTableViewActivity b;

			
			{
				b = AboutRobotTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AboutRobotTableViewActivity b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   63  136:aload_0         
	//   64  137:getfield        #227 <Field RelativeLayout e>
	//   65  140:new             #10  <Class AboutRobotTableViewActivity$2>
	//   66  143:dup             
	//   67  144:aload_0         
	//   68  145:aload_2         
	//   69  146:invokespecial   #279 <Method void AboutRobotTableViewActivity$2(AboutRobotTableViewActivity, String)>
	//   70  149:invokevirtual   #283 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
			k.setVisibility(8);
	//   71  152:aload_0         
	//   72  153:getfield        #232 <Field CustomTextView k>
	//   73  156:bipush          8
	//   74  158:invokevirtual   #233 <Method void CustomTextView.setVisibility(int)>
			l.setVisibility(0);
	//   75  161:aload_0         
	//   76  162:getfield        #235 <Field ImageView l>
	//   77  165:iconst_0        
	//   78  166:invokevirtual   #238 <Method void ImageView.setVisibility(int)>
			return;
	//   79  169:return          
		} else
		{
			com.irobot.home.util.j.b(((android.content.Context) (this)), getString(0x7f0f0925));
	//   80  170:aload_0         
	//   81  171:aload_0         
	//   82  172:ldc2            #284 <Int 0x7f0f0925>
	//   83  175:invokevirtual   #285 <Method String getString(int)>
	//   84  178:invokestatic    #288 <Method void j.b(android.content.Context, String)>
			return;
	//   85  181:return          
		}
	}

	public void e()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field String a>
	//    2    4:invokestatic    #291 <Method a j.a(String)>
	//    3    7:invokevirtual   #296 <Method AssetInfo a.a()>
	//    4   10:astore_1        
		b(0x7f0f08c3);
	//    5   11:aload_0         
	//    6   12:ldc2            #297 <Int 0x7f0f08c3>
	//    7   15:invokevirtual   #299 <Method void b(int)>
		i();
	//    8   18:aload_0         
	//    9   19:invokespecial   #301 <Method void i()>
		i = a(c, 0x7f0f0308);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #145 <Field RelativeLayout c>
	//   14   28:ldc2            #302 <Int 0x7f0f0308>
	//   15   31:invokespecial   #118 <Method CustomTextView a(RelativeLayout, int)>
	//   16   34:putfield        #124 <Field CustomTextView i>
		j = a(d, 0x7f0f0321);
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:aload_0         
	//   20   40:getfield        #159 <Field RelativeLayout d>
	//   21   43:ldc2            #303 <Int 0x7f0f0321>
	//   22   46:invokespecial   #118 <Method CustomTextView a(RelativeLayout, int)>
	//   23   49:putfield        #204 <Field CustomTextView j>
		k = a(e, 0x7f0f07f2);
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:aload_0         
	//   27   55:getfield        #227 <Field RelativeLayout e>
	//   28   58:ldc2            #304 <Int 0x7f0f07f2>
	//   29   61:invokespecial   #118 <Method CustomTextView a(RelativeLayout, int)>
	//   30   64:putfield        #232 <Field CustomTextView k>
		l = (ImageView)e.findViewById(0x7f090349);
	//   31   67:aload_0         
	//   32   68:aload_0         
	//   33   69:getfield        #227 <Field RelativeLayout e>
	//   34   72:ldc2            #305 <Int 0x7f090349>
	//   35   75:invokevirtual   #72  <Method View RelativeLayout.findViewById(int)>
	//   36   78:checkcast       #237 <Class ImageView>
	//   37   81:putfield        #235 <Field ImageView l>
		k.setTextIsSelectable(true);
	//   38   84:aload_0         
	//   39   85:getfield        #232 <Field CustomTextView k>
	//   40   88:iconst_1        
	//   41   89:invokevirtual   #308 <Method void CustomTextView.setTextIsSelectable(boolean)>
		n = new AboutRobotSettingsPresenter(((AboutRobotSettingsPresenter.a) (this)), assetinfo.getAssetId(), Assembler.getInstance());
	//   42   92:aload_0         
	//   43   93:new             #310 <Class AboutRobotSettingsPresenter>
	//   44   96:dup             
	//   45   97:aload_0         
	//   46   98:aload_1         
	//   47   99:invokevirtual   #316 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   48  102:invokestatic    #97  <Method Assembler Assembler.getInstance()>
	//   49  105:invokespecial   #319 <Method void AboutRobotSettingsPresenter(AboutRobotSettingsPresenter$a, com.irobot.core.AssetId, Assembler)>
	//   50  108:putfield        #321 <Field AboutRobotSettingsPresenter n>
		b = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//   51  111:aload_0         
	//   52  112:aload_0         
	//   53  113:invokestatic    #324 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   54  116:putfield        #326 <Field CustomerCareRestClient b>
		f();
	//   55  119:aload_0         
	//   56  120:invokevirtual   #328 <Method void f()>
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.AboutRobot, assetinfo);
	//   57  123:invokestatic    #333 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   58  126:getstatic       #338 <Field ViewId ViewId.AboutRobot>
	//   59  129:aload_1         
	//   60  130:invokevirtual   #342 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, AssetInfo)>
		h = Assembler.getInstance().getUpdateUIService(assetinfo.getAssetId());
	//   61  133:aload_0         
	//   62  134:invokestatic    #97  <Method Assembler Assembler.getInstance()>
	//   63  137:aload_1         
	//   64  138:invokevirtual   #316 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//   65  141:invokevirtual   #346 <Method UpdateUIService Assembler.getUpdateUIService(com.irobot.core.AssetId)>
	//   66  144:putfield        #348 <Field UpdateUIService h>
		if(!AssetCapabilityUtils.isAwsEnabledAsset(assetinfo))
	//*  67  147:aload_1         
	//*  68  148:invokestatic    #354 <Method boolean AssetCapabilityUtils.isAwsEnabledAsset(AssetInfo)>
	//*  69  151:ifne            181
		{
			c.setClickable(false);
	//   70  154:aload_0         
	//   71  155:getfield        #145 <Field RelativeLayout c>
	//   72  158:iconst_0        
	//   73  159:invokevirtual   #230 <Method void RelativeLayout.setClickable(boolean)>
			c.findViewById(0x7f090054).setVisibility(8);
	//   74  162:aload_0         
	//   75  163:getfield        #145 <Field RelativeLayout c>
	//   76  166:ldc1            #150 <Int 0x7f090054>
	//   77  168:invokevirtual   #72  <Method View RelativeLayout.findViewById(int)>
	//   78  171:bipush          8
	//   79  173:invokevirtual   #149 <Method void View.setVisibility(int)>
			a(false);
	//   80  176:aload_0         
	//   81  177:iconst_0        
	//   82  178:invokevirtual   #356 <Method void a(boolean)>
		}
	//   83  181:return          
	}

	void f()
	{
		Robot robot = com.irobot.home.util.j.o(a);
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field String a>
	//    2    4:invokestatic    #157 <Method Robot j.o(String)>
	//    3    7:astore_1        
		Object obj = ((Object) (robot.w()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #359 <Method String Robot.w()>
	//    6   12:astore_2        
		if(com.irobot.home.util.j.i(((String) (obj))))
	//*   7   13:aload_2         
	//*   8   14:invokestatic    #127 <Method boolean j.i(String)>
	//*   9   17:ifeq            26
		{
			d(((String) (obj)));
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #361 <Method void d(String)>
			return;
	//   13   25:return          
		}
		obj = ((Object) (Locale.getDefault()));
	//   14   26:invokestatic    #366 <Method Locale Locale.getDefault()>
	//   15   29:astore_2        
		String s = com.irobot.home.util.j.a(a).a().getSku();
	//   16   30:aload_0         
	//   17   31:getfield        #154 <Field String a>
	//   18   34:invokestatic    #291 <Method a j.a(String)>
	//   19   37:invokevirtual   #296 <Method AssetInfo a.a()>
	//   20   40:invokevirtual   #369 <Method String AssetInfo.getSku()>
	//   21   43:astore_3        
		b.setRestErrorHandler(new b() {

			public void onRestClientExceptionThrown(org.c.b.b b1)
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #24  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #25  <Method void StringBuilder()>
			//    3    7:astore_2        
				stringbuilder.append("Rest client exception: ");
			//    4    8:aload_2         
			//    5    9:ldc1            #27  <String "Rest client exception: ">
			//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				stringbuilder.append(b1.getMessage());
			//    8   15:aload_2         
			//    9   16:aload_1         
			//   10   17:invokevirtual   #37  <Method String org.c.b.b.getMessage()>
			//   11   20:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//   12   23:pop             
				com.irobot.home.util.o.e("AboutRobot", stringbuilder.toString());
			//   13   24:ldc1            #39  <String "AboutRobot">
			//   14   26:aload_2         
			//   15   27:invokevirtual   #42  <Method String StringBuilder.toString()>
			//   16   30:invokestatic    #48  <Method void o.e(String, String)>
			//   17   33:return          
			}

			final AboutRobotTableViewActivity a;

			
			{
				a = AboutRobotTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AboutRobotTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   22   44:aload_0         
	//   23   45:getfield        #326 <Field CustomerCareRestClient b>
	//   24   48:new             #8   <Class AboutRobotTableViewActivity$1>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:invokespecial   #372 <Method void AboutRobotTableViewActivity$1(AboutRobotTableViewActivity)>
	//   28   56:invokeinterface #378 <Method void CustomerCareRestClient.setRestErrorHandler(b)>
		m = b.getRobotErrorHelp(com.irobot.home.util.j.a(((Locale) (obj))), com.irobot.home.util.j.h(((android.content.Context) (this))), s);
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #326 <Field CustomerCareRestClient b>
	//   32   66:aload_2         
	//   33   67:invokestatic    #381 <Method String j.a(Locale)>
	//   34   70:aload_0         
	//   35   71:invokestatic    #384 <Method String j.h(android.content.Context)>
	//   36   74:aload_3         
	//   37   75:invokeinterface #388 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//   38   80:putfield        #240 <Field RobotErrorHelpContentList m>
		if(m == null)
	//*  39   83:aload_0         
	//*  40   84:getfield        #240 <Field RobotErrorHelpContentList m>
	//*  41   87:ifnonnull       98
			com.irobot.home.util.o.e("AboutRobot", "Website API returned null for the otherContent url");
	//   42   90:ldc1            #213 <String "AboutRobot">
	//   43   92:ldc2            #390 <String "Website API returned null for the otherContent url">
	//   44   95:invokestatic    #220 <Method void o.e(String, String)>
		obj = ((Object) (Assembler.getInstance().getRegistrationService().getProductSerialNumber(a)));
	//   45   98:invokestatic    #97  <Method Assembler Assembler.getInstance()>
	//   46  101:invokevirtual   #394 <Method RegistrationService Assembler.getRegistrationService()>
	//   47  104:aload_0         
	//   48  105:getfield        #154 <Field String a>
	//   49  108:invokevirtual   #399 <Method String RegistrationService.getProductSerialNumber(String)>
	//   50  111:astore_2        
		if(com.irobot.home.util.j.i(((String) (obj))))
	//*  51  112:aload_2         
	//*  52  113:invokestatic    #127 <Method boolean j.i(String)>
	//*  53  116:ifeq            127
			robot.d(((String) (obj)));
	//   54  119:aload_1         
	//   55  120:aload_2         
	//   56  121:invokevirtual   #400 <Method void Robot.d(String)>
		else
	//*  57  124:goto            135
			com.irobot.home.util.o.e("AboutRobot", "No asset ID found in the registration database.");
	//   58  127:ldc1            #213 <String "AboutRobot">
	//   59  129:ldc2            #402 <String "No asset ID found in the registration database.">
	//   60  132:invokestatic    #220 <Method void o.e(String, String)>
		if(!isFinishing() && !isDestroyed())
	//*  61  135:aload_0         
	//*  62  136:invokevirtual   #405 <Method boolean isFinishing()>
	//*  63  139:ifne            154
	//*  64  142:aload_0         
	//*  65  143:invokevirtual   #408 <Method boolean isDestroyed()>
	//*  66  146:ifne            154
			d(((String) (obj)));
	//   67  149:aload_0         
	//   68  150:aload_2         
	//   69  151:invokevirtual   #361 <Method void d(String)>
	//   70  154:return          
	}

	protected void g()
	{
		OnDemandOtaActivity_.a a1;
		switch(com.irobot.home._cls3.b[o.ordinal()])
	//*   0    0:getstatic       #411 <Field int[] com.irobot.home.AboutRobotTableViewActivity$3.b>
	//*   1    3:aload_0         
	//*   2    4:getfield        #51  <Field SoftwareUpdateStatus o>
	//*   3    7:invokevirtual   #415 <Method int SoftwareUpdateStatus.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 4: default 40
	//	               1 88
	//	               2 57
	//	               3 41
	//	               4 41
		default:
			return;
	//    6   40:return          

		case 3: // '\003'
		case 4: // '\004'
			com.irobot.home.RobotSoftwareUpdateActivity_.a(((android.content.Context) (this))).a(a).a();
	//    7   41:aload_0         
	//    8   42:invokestatic    #420 <Method RobotSoftwareUpdateActivity_$a com.irobot.home.RobotSoftwareUpdateActivity_.a(android.content.Context)>
	//    9   45:aload_0         
	//   10   46:getfield        #154 <Field String a>
	//   11   49:invokevirtual   #425 <Method RobotSoftwareUpdateActivity_$a com.irobot.home.RobotSoftwareUpdateActivity_$a.a(String)>
	//   12   52:invokevirtual   #426 <Method org.androidannotations.api.a.e com.irobot.home.RobotSoftwareUpdateActivity_$a.a()>
	//   13   55:pop             
			return;
	//   14   56:return          

		case 2: // '\002'
			a1 = com.irobot.home.OnDemandOtaActivity_.a(((android.content.Context) (this))).a(a).a(OnDemandOTAEntryType.RequestOnDemandOTA).a(OnDemandOTAPathType.Settings).a(true);
	//   15   57:aload_0         
	//   16   58:invokestatic    #431 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_.a(android.content.Context)>
	//   17   61:aload_0         
	//   18   62:getfield        #154 <Field String a>
	//   19   65:invokevirtual   #436 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(String)>
	//   20   68:getstatic       #442 <Field OnDemandOTAEntryType OnDemandOTAEntryType.RequestOnDemandOTA>
	//   21   71:invokevirtual   #445 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAEntryType)>
	//   22   74:getstatic       #451 <Field OnDemandOTAPathType OnDemandOTAPathType.Settings>
	//   23   77:invokevirtual   #454 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAPathType)>
	//   24   80:iconst_1        
	//   25   81:invokevirtual   #457 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(boolean)>
	//   26   84:astore_1        
			break;

	//*  27   85:goto            118
		case 1: // '\001'
			a1 = com.irobot.home.OnDemandOtaActivity_.a(((android.content.Context) (this))).a(a).a(OnDemandOTAStatus.InProgress).a(OnDemandOTAEntryType.ViewOnDemandOTA).a(OnDemandOTAPathType.Settings);
	//   28   88:aload_0         
	//   29   89:invokestatic    #431 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_.a(android.content.Context)>
	//   30   92:aload_0         
	//   31   93:getfield        #154 <Field String a>
	//   32   96:invokevirtual   #436 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(String)>
	//   33   99:getstatic       #463 <Field OnDemandOTAStatus OnDemandOTAStatus.InProgress>
	//   34  102:invokevirtual   #466 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAStatus)>
	//   35  105:getstatic       #469 <Field OnDemandOTAEntryType OnDemandOTAEntryType.ViewOnDemandOTA>
	//   36  108:invokevirtual   #445 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAEntryType)>
	//   37  111:getstatic       #451 <Field OnDemandOTAPathType OnDemandOTAPathType.Settings>
	//   38  114:invokevirtual   #454 <Method OnDemandOtaActivity_$a com.irobot.home.OnDemandOtaActivity_$a.a(OnDemandOTAPathType)>
	//   39  117:astore_1        
			break;
		}
		a1.a();
	//   40  118:aload_1         
	//   41  119:invokevirtual   #470 <Method org.androidannotations.api.a.e com.irobot.home.OnDemandOtaActivity_$a.a()>
	//   42  122:pop             
	//   43  123:return          
	}

	protected void h()
	{
		com.irobot.home.OtaMqttActivity_.a(((android.content.Context) (this))).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #475 <Method OtaMqttActivity_$a com.irobot.home.OtaMqttActivity_.a(android.content.Context)>
	//    2    4:invokevirtual   #478 <Method org.androidannotations.api.a.e com.irobot.home.OtaMqttActivity_$a.a()>
	//    3    7:pop             
	//    4    8:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #481 <Method void BaseFragmentActivity.onPause()>
		n.b();
	//    2    4:aload_0         
	//    3    5:getfield        #321 <Field AboutRobotSettingsPresenter n>
	//    4    8:invokevirtual   #483 <Method void com.irobot.home.AboutRobotSettingsPresenter.b()>
	//    5   11:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #486 <Method void BaseFragmentActivity.onResume()>
		n.a();
	//    2    4:aload_0         
	//    3    5:getfield        #321 <Field AboutRobotSettingsPresenter n>
	//    4    8:invokevirtual   #488 <Method void com.irobot.home.AboutRobotSettingsPresenter.a()>
	//    5   11:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #491 <Method void BaseFragmentActivity.onStart()>
		h.registerUISubscriber(((OTAUIServiceDataCallback) (t)));
	//    2    4:aload_0         
	//    3    5:getfield        #348 <Field UpdateUIService h>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field AboutRobotTableViewActivity$a t>
	//    6   12:invokevirtual   #497 <Method boolean UpdateUIService.registerUISubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #500 <Method void BaseFragmentActivity.onStop()>
		h.unregisterSubscriber(((OTAUIServiceDataCallback) (t)));
	//    2    4:aload_0         
	//    3    5:getfield        #348 <Field UpdateUIService h>
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field AboutRobotTableViewActivity$a t>
	//    6   12:invokevirtual   #503 <Method boolean UpdateUIService.unregisterSubscriber(OTAUIServiceDataCallback)>
	//    7   15:pop             
	//    8   16:return          
	}

	String a;
	CustomerCareRestClient b;
	RelativeLayout c;
	RelativeLayout d;
	RelativeLayout e;
	RelativeLayout f;
	CustomTextView g;
	UpdateUIService h;
	private CustomTextView i;
	private CustomTextView j;
	private CustomTextView k;
	private ImageView l;
	private RobotErrorHelpContentList m;
	private AboutRobotSettingsPresenter n;
	private SoftwareUpdateStatus o;
	private a t;
}
