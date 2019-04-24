// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetSerialNumberEvent;
import com.irobot.core.AssetSoftwareVersionEvent;
import com.irobot.core.AssetStatusSubsystem;
import com.irobot.core.AssetStatusType;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.EventType;
import com.irobot.core.RegistrationService;
import com.irobot.core.UpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.home.i.a;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.androidannotations.a.a.a.b;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, WebViewActivity_, BraavaSoftwareUpdateActivity_, IRobotApplication

public class BraavaAboutRobotActivity extends BaseFragmentActivity
{

	public BraavaAboutRobotActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void BaseFragmentActivity()>
		n = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #44  <Field boolean n>
		u = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #46  <Field boolean u>
	//    8   14:return          
	}

	private CustomTextView a(RelativeLayout relativelayout, int i1)
	{
		com.irobot.home.util.j.a(relativelayout, i1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #53  <Method android.widget.TextView j.a(RelativeLayout, int)>
	//    3    5:pop             
		return (CustomTextView)relativelayout.findViewById(0x7f09042d);
	//    4    6:aload_1         
	//    5    7:ldc1            #54  <Int 0x7f09042d>
	//    6    9:invokevirtual   #60  <Method View RelativeLayout.findViewById(int)>
	//    7   12:checkcast       #62  <Class CustomTextView>
	//    8   15:areturn         
	}

	static void a(BraavaAboutRobotActivity braavaaboutrobotactivity, String s)
	{
		braavaaboutrobotactivity.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void a(String)>
	//    3    5:return          
	}

	private void a(String s)
	{
		com.irobot.home.WebViewActivity_.a(((android.content.Context) (this))).a(s).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #71  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_.a(android.content.Context)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//    4    8:invokevirtual   #79  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//    5   11:pop             
	//    6   12:return          
	}

	public void e()
	{
		AssetId assetid = AssetId.assetIdForString(a);
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field String a>
	//    2    4:invokestatic    #87  <Method AssetId AssetId.assetIdForString(String)>
	//    3    7:astore_1        
		o = (a)Assembler.getInstance().getDomainEventBus();
	//    4    8:aload_0         
	//    5    9:invokestatic    #93  <Method Assembler Assembler.getInstance()>
	//    6   12:invokevirtual   #97  <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//    7   15:checkcast       #99  <Class a>
	//    8   18:putfield        #101 <Field a o>
		o.a(((Object) (this)), EventType.AssetSoftwareVersionEvent);
	//    9   21:aload_0         
	//   10   22:getfield        #101 <Field a o>
	//   11   25:aload_0         
	//   12   26:getstatic       #107 <Field EventType EventType.AssetSoftwareVersionEvent>
	//   13   29:invokevirtual   #110 <Method void a.a(Object, EventType)>
		o.a(((Object) (this)), EventType.AssetSerialNumberEvent);
	//   14   32:aload_0         
	//   15   33:getfield        #101 <Field a o>
	//   16   36:aload_0         
	//   17   37:getstatic       #113 <Field EventType EventType.AssetSerialNumberEvent>
	//   18   40:invokevirtual   #110 <Method void a.a(Object, EventType)>
		o.a(((Object) (this)), EventType.AssetUpdateAvailabilityEvent);
	//   19   43:aload_0         
	//   20   44:getfield        #101 <Field a o>
	//   21   47:aload_0         
	//   22   48:getstatic       #116 <Field EventType EventType.AssetUpdateAvailabilityEvent>
	//   23   51:invokevirtual   #110 <Method void a.a(Object, EventType)>
		b(0x7f0f08c3);
	//   24   54:aload_0         
	//   25   55:ldc1            #117 <Int 0x7f0f08c3>
	//   26   57:invokevirtual   #120 <Method void b(int)>
		j = Assembler.getInstance().getUpdateUIService(assetid);
	//   27   60:aload_0         
	//   28   61:invokestatic    #93  <Method Assembler Assembler.getInstance()>
	//   29   64:aload_1         
	//   30   65:invokevirtual   #124 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   31   68:putfield        #126 <Field UpdateUIService j>
		k = Assembler.getInstance().getAssetStatusSubsystem(assetid);
	//   32   71:aload_0         
	//   33   72:invokestatic    #93  <Method Assembler Assembler.getInstance()>
	//   34   75:aload_1         
	//   35   76:invokevirtual   #130 <Method AssetStatusSubsystem Assembler.getAssetStatusSubsystem(AssetId)>
	//   36   79:putfield        #132 <Field AssetStatusSubsystem k>
		f();
	//   37   82:aload_0         
	//   38   83:invokevirtual   #134 <Method void f()>
		g = a(c, 0x7f0f0027);
	//   39   86:aload_0         
	//   40   87:aload_0         
	//   41   88:aload_0         
	//   42   89:getfield        #136 <Field RelativeLayout c>
	//   43   92:ldc1            #137 <Int 0x7f0f0027>
	//   44   94:invokespecial   #139 <Method CustomTextView a(RelativeLayout, int)>
	//   45   97:putfield        #141 <Field CustomTextView g>
		h = a(d, 0x7f0f07f2);
	//   46  100:aload_0         
	//   47  101:aload_0         
	//   48  102:aload_0         
	//   49  103:getfield        #143 <Field RelativeLayout d>
	//   50  106:ldc1            #144 <Int 0x7f0f07f2>
	//   51  108:invokespecial   #139 <Method CustomTextView a(RelativeLayout, int)>
	//   52  111:putfield        #146 <Field CustomTextView h>
		i = (ImageView)d.findViewById(0x7f090349);
	//   53  114:aload_0         
	//   54  115:aload_0         
	//   55  116:getfield        #143 <Field RelativeLayout d>
	//   56  119:ldc1            #147 <Int 0x7f090349>
	//   57  121:invokevirtual   #60  <Method View RelativeLayout.findViewById(int)>
	//   58  124:checkcast       #149 <Class ImageView>
	//   59  127:putfield        #151 <Field ImageView i>
		b = com.irobot.home.util.j.i(((android.content.Context) (this)));
	//   60  130:aload_0         
	//   61  131:aload_0         
	//   62  132:invokestatic    #154 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   63  135:putfield        #156 <Field CustomerCareRestClient b>
		h();
	//   64  138:aload_0         
	//   65  139:invokevirtual   #158 <Method void h()>
		e.setVisibility(8);
	//   66  142:aload_0         
	//   67  143:getfield        #160 <Field View e>
	//   68  146:bipush          8
	//   69  148:invokevirtual   #165 <Method void View.setVisibility(int)>
	//   70  151:return          
	}

	public void f()
	{
		j.querySoftwareVersion();
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field UpdateUIService j>
	//    2    4:invokevirtual   #170 <Method void UpdateUIService.querySoftwareVersion()>
		j.queryForSoftwareUpdate();
	//    3    7:aload_0         
	//    4    8:getfield        #126 <Field UpdateUIService j>
	//    5   11:invokevirtual   #173 <Method void UpdateUIService.queryForSoftwareUpdate()>
		k.queryAssetStatus(AssetStatusType.SerialNumber);
	//    6   14:aload_0         
	//    7   15:getfield        #132 <Field AssetStatusSubsystem k>
	//    8   18:getstatic       #179 <Field AssetStatusType AssetStatusType.SerialNumber>
	//    9   21:invokevirtual   #185 <Method void AssetStatusSubsystem.queryAssetStatus(AssetStatusType)>
	//   10   24:return          
	}

	public void g()
	{
		if(l.updateInfo() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #187 <Field AssetUpdateAvailabilityEvent l>
	//*   2    4:invokevirtual   #193 <Method com.irobot.core.FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//*   3    7:ifnull          18
			com.irobot.home.BraavaSoftwareUpdateActivity_.a(((android.content.Context) (this))).a();
	//    4   10:aload_0         
	//    5   11:invokestatic    #198 <Method BraavaSoftwareUpdateActivity_$a com.irobot.home.BraavaSoftwareUpdateActivity_.a(android.content.Context)>
	//    6   14:invokevirtual   #201 <Method org.androidannotations.api.a.e com.irobot.home.BraavaSoftwareUpdateActivity_$a.a()>
	//    7   17:pop             
	//    8   18:return          
	}

	void h()
	{
		if(com.irobot.home.util.j.a())
	//*   0    0:invokestatic    #204 <Method boolean j.a()>
	//*   1    3:ifeq            77
		{
			Locale locale = Locale.getDefault();
	//    2    6:invokestatic    #210 <Method Locale Locale.getDefault()>
	//    3    9:astore_1        
			String s = com.irobot.home.util.j.a(a).a().getSku();
	//    4   10:aload_0         
	//    5   11:getfield        #81  <Field String a>
	//    6   14:invokestatic    #213 <Method com.irobot.home.model.a j.a(String)>
	//    7   17:invokevirtual   #218 <Method AssetInfo com.irobot.home.model.a.a()>
	//    8   20:invokevirtual   #224 <Method String AssetInfo.getSku()>
	//    9   23:astore_2        
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
					com.irobot.home.util.o.e("AboutBraava", stringbuilder.toString());
				//   13   24:ldc1            #39  <String "AboutBraava">
				//   14   26:aload_2         
				//   15   27:invokevirtual   #42  <Method String StringBuilder.toString()>
				//   16   30:invokestatic    #48  <Method void o.e(String, String)>
				//   17   33:return          
				}

				final BraavaAboutRobotActivity a;

			
			{
				a = BraavaAboutRobotActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BraavaAboutRobotActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   10   24:aload_0         
	//   11   25:getfield        #156 <Field CustomerCareRestClient b>
	//   12   28:new             #6   <Class BraavaAboutRobotActivity$1>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:invokespecial   #227 <Method void BraavaAboutRobotActivity$1(BraavaAboutRobotActivity)>
	//   16   36:invokeinterface #233 <Method void CustomerCareRestClient.setRestErrorHandler(b)>
			m = b.getRobotErrorHelp(com.irobot.home.util.j.a(locale), com.irobot.home.util.j.h(((android.content.Context) (this))), s);
	//   17   41:aload_0         
	//   18   42:aload_0         
	//   19   43:getfield        #156 <Field CustomerCareRestClient b>
	//   20   46:aload_1         
	//   21   47:invokestatic    #236 <Method String j.a(Locale)>
	//   22   50:aload_0         
	//   23   51:invokestatic    #239 <Method String j.h(android.content.Context)>
	//   24   54:aload_2         
	//   25   55:invokeinterface #243 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//   26   60:putfield        #245 <Field RobotErrorHelpContentList m>
			if(m == null)
	//*  27   63:aload_0         
	//*  28   64:getfield        #245 <Field RobotErrorHelpContentList m>
	//*  29   67:ifnonnull       77
				com.irobot.home.util.o.e("AboutBraava", "Website API returned null for the otherContent url");
	//   30   70:ldc1            #247 <String "AboutBraava">
	//   31   72:ldc1            #249 <String "Website API returned null for the otherContent url">
	//   32   74:invokestatic    #254 <Method void o.e(String, String)>
		}
		n = false;
	//   33   77:aload_0         
	//   34   78:iconst_0        
	//   35   79:putfield        #44  <Field boolean n>
		i();
	//   36   82:aload_0         
	//   37   83:invokevirtual   #256 <Method void i()>
	//   38   86:return          
	}

	void i()
	{
label0:
		{
			Object obj;
			String s;
label1:
			{
label2:
				{
					if(com.irobot.home.util.j.i(t))
	//*   0    0:aload_0         
	//*   1    1:getfield        #258 <Field String t>
	//*   2    4:invokestatic    #261 <Method boolean j.i(String)>
	//*   3    7:ifeq            47
					{
						d.setClickable(false);
	//    4   10:aload_0         
	//    5   11:getfield        #143 <Field RelativeLayout d>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #265 <Method void RelativeLayout.setClickable(boolean)>
						h.setText(((CharSequence) (t)));
	//    8   18:aload_0         
	//    9   19:getfield        #146 <Field CustomTextView h>
	//   10   22:aload_0         
	//   11   23:getfield        #258 <Field String t>
	//   12   26:invokevirtual   #269 <Method void CustomTextView.setText(CharSequence)>
						h.setVisibility(0);
	//   13   29:aload_0         
	//   14   30:getfield        #146 <Field CustomTextView h>
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #270 <Method void CustomTextView.setVisibility(int)>
						i.setVisibility(8);
	//   17   37:aload_0         
	//   18   38:getfield        #151 <Field ImageView i>
	//   19   41:bipush          8
	//   20   43:invokevirtual   #271 <Method void ImageView.setVisibility(int)>
						return;
	//   21   46:return          
					}
					if(n)
						break label0;
	//   22   47:aload_0         
	//   23   48:getfield        #44  <Field boolean n>
	//   24   51:ifne            206
					obj = ((Object) (m));
	//   25   54:aload_0         
	//   26   55:getfield        #245 <Field RobotErrorHelpContentList m>
	//   27   58:astore_1        
					s = null;
	//   28   59:aconst_null     
	//   29   60:astore_2        
					if(obj == null || m.otherContent == null)
						break label2;
	//   30   61:aload_1         
	//   31   62:ifnull          123
	//   32   65:aload_0         
	//   33   66:getfield        #245 <Field RobotErrorHelpContentList m>
	//   34   69:getfield        #277 <Field List RobotErrorHelpContentList.otherContent>
	//   35   72:ifnull          123
					Iterator iterator = m.otherContent.iterator();
	//   36   75:aload_0         
	//   37   76:getfield        #245 <Field RobotErrorHelpContentList m>
	//   38   79:getfield        #277 <Field List RobotErrorHelpContentList.otherContent>
	//   39   82:invokeinterface #283 <Method Iterator List.iterator()>
	//   40   87:astore_3        
					do
					{
						if(!iterator.hasNext())
							break label2;
	//   41   88:aload_3         
	//   42   89:invokeinterface #288 <Method boolean Iterator.hasNext()>
	//   43   94:ifeq            123
						obj = ((Object) ((RobotErrorHelpContent)iterator.next()));
	//   44   97:aload_3         
	//   45   98:invokeinterface #292 <Method Object Iterator.next()>
	//   46  103:checkcast       #294 <Class RobotErrorHelpContent>
	//   47  106:astore_1        
					} while(!"Serial_number".equalsIgnoreCase(((RobotErrorHelpContent) (obj)).id));
	//   48  107:ldc2            #296 <String "Serial_number">
	//   49  110:aload_1         
	//   50  111:getfield        #299 <Field String RobotErrorHelpContent.id>
	//   51  114:invokevirtual   #304 <Method boolean String.equalsIgnoreCase(String)>
	//   52  117:ifeq            88
					break label1;
	//   53  120:goto            125
				}
				obj = null;
	//   54  123:aconst_null     
	//   55  124:astore_1        
			}
			if(obj != null)
	//*  56  125:aload_1         
	//*  57  126:ifnull          134
				s = ((RobotErrorHelpContent) (obj)).content;
	//   58  129:aload_1         
	//   59  130:getfield        #307 <Field String RobotErrorHelpContent.content>
	//   60  133:astore_2        
			if(com.irobot.home.util.j.i(s))
	//*  61  134:aload_2         
	//*  62  135:invokestatic    #261 <Method boolean j.i(String)>
	//*  63  138:ifeq            183
			{
				d.setClickable(true);
	//   64  141:aload_0         
	//   65  142:getfield        #143 <Field RelativeLayout d>
	//   66  145:iconst_1        
	//   67  146:invokevirtual   #265 <Method void RelativeLayout.setClickable(boolean)>
				d.setOnClickListener(new android.view.View.OnClickListener(s) {

					public void onClick(View view)
					{
						com.irobot.home.BraavaAboutRobotActivity.a(b, a);
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field BraavaAboutRobotActivity b>
					//    2    4:aload_0         
					//    3    5:getfield        #21  <Field String a>
					//    4    8:invokestatic    #28  <Method void com.irobot.home.BraavaAboutRobotActivity.a(BraavaAboutRobotActivity, String)>
					//    5   11:return          
					}

					final String a;
					final BraavaAboutRobotActivity b;

			
			{
				b = BraavaAboutRobotActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BraavaAboutRobotActivity b>
				a = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   68  149:aload_0         
	//   69  150:getfield        #143 <Field RelativeLayout d>
	//   70  153:new             #8   <Class BraavaAboutRobotActivity$2>
	//   71  156:dup             
	//   72  157:aload_0         
	//   73  158:aload_2         
	//   74  159:invokespecial   #309 <Method void BraavaAboutRobotActivity$2(BraavaAboutRobotActivity, String)>
	//   75  162:invokevirtual   #313 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
				h.setVisibility(8);
	//   76  165:aload_0         
	//   77  166:getfield        #146 <Field CustomTextView h>
	//   78  169:bipush          8
	//   79  171:invokevirtual   #270 <Method void CustomTextView.setVisibility(int)>
				i.setVisibility(0);
	//   80  174:aload_0         
	//   81  175:getfield        #151 <Field ImageView i>
	//   82  178:iconst_0        
	//   83  179:invokevirtual   #271 <Method void ImageView.setVisibility(int)>
				return;
	//   84  182:return          
			}
			if(!u)
	//*  85  183:aload_0         
	//*  86  184:getfield        #46  <Field boolean u>
	//*  87  187:ifne            206
			{
				u = true;
	//   88  190:aload_0         
	//   89  191:iconst_1        
	//   90  192:putfield        #46  <Field boolean u>
				com.irobot.home.util.j.b(((android.content.Context) (this)), getString(0x7f0f0925));
	//   91  195:aload_0         
	//   92  196:aload_0         
	//   93  197:ldc2            #314 <Int 0x7f0f0925>
	//   94  200:invokevirtual   #318 <Method String getString(int)>
	//   95  203:invokestatic    #321 <Method void j.b(android.content.Context, String)>
			}
		}
	//   96  206:return          
	}

	public void onAssetSerialNumberEvent(AssetSerialNumberEvent assetserialnumberevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #326 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #327 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AssetSerialNumberEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #329 <String "AssetSerialNumberEvent received for asset ID: ">
	//    6   12:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(assetserialnumberevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #339 <Method AssetId AssetSerialNumberEvent.assetId()>
	//   11   21:invokevirtual   #342 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(", serial number is ");
	//   14   28:aload_2         
	//   15   29:ldc2            #344 <String ", serial number is ">
	//   16   32:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(assetserialnumberevent.serialNumber());
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #347 <Method String AssetSerialNumberEvent.serialNumber()>
	//   21   41:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		com.irobot.home.util.o.b("AboutBraava", stringbuilder.toString());
	//   23   45:ldc1            #247 <String "AboutBraava">
	//   24   47:aload_2         
	//   25   48:invokevirtual   #350 <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #352 <Method void o.b(String, String)>
		o.b(((Object) (this)), EventType.AssetSerialNumberEvent);
	//   27   54:aload_0         
	//   28   55:getfield        #101 <Field a o>
	//   29   58:aload_0         
	//   30   59:getstatic       #113 <Field EventType EventType.AssetSerialNumberEvent>
	//   31   62:invokevirtual   #354 <Method void a.b(Object, EventType)>
		t = Assembler.getInstance().getRegistrationService().getProductSerialNumber(assetserialnumberevent.serialNumber());
	//   32   65:aload_0         
	//   33   66:invokestatic    #93  <Method Assembler Assembler.getInstance()>
	//   34   69:invokevirtual   #358 <Method RegistrationService Assembler.getRegistrationService()>
	//   35   72:aload_1         
	//   36   73:invokevirtual   #347 <Method String AssetSerialNumberEvent.serialNumber()>
	//   37   76:invokevirtual   #364 <Method String RegistrationService.getProductSerialNumber(String)>
	//   38   79:putfield        #258 <Field String t>
		if(!isFinishing() && !isDestroyed())
	//*  39   82:aload_0         
	//*  40   83:invokevirtual   #367 <Method boolean isFinishing()>
	//*  41   86:ifne            100
	//*  42   89:aload_0         
	//*  43   90:invokevirtual   #370 <Method boolean isDestroyed()>
	//*  44   93:ifne            100
			i();
	//   45   96:aload_0         
	//   46   97:invokevirtual   #256 <Method void i()>
	//   47  100:return          
	}

	public void onAssetSoftwareVersionEvent(AssetSoftwareVersionEvent assetsoftwareversionevent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #326 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #327 <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append("AssetSoftwareVersionEvent received for asset ID: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #375 <String "AssetSoftwareVersionEvent received for asset ID: ">
	//    6   12:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(assetsoftwareversionevent.assetId().getId());
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #378 <Method AssetId AssetSoftwareVersionEvent.assetId()>
	//   11   21:invokevirtual   #342 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		((StringBuilder) (obj)).append(", version is ");
	//   14   28:aload_2         
	//   15   29:ldc2            #380 <String ", version is ">
	//   16   32:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		((StringBuilder) (obj)).append(assetsoftwareversionevent.softwareVersion());
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #383 <Method String AssetSoftwareVersionEvent.softwareVersion()>
	//   21   41:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		com.irobot.home.util.o.b("AboutBraava", ((StringBuilder) (obj)).toString());
	//   23   45:ldc1            #247 <String "AboutBraava">
	//   24   47:aload_2         
	//   25   48:invokevirtual   #350 <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #352 <Method void o.b(String, String)>
		obj = ((Object) (g));
	//   27   54:aload_0         
	//   28   55:getfield        #141 <Field CustomTextView g>
	//   29   58:astore_2        
		if(com.irobot.home.util.j.i(assetsoftwareversionevent.softwareVersion()))
	//*  30   59:aload_1         
	//*  31   60:invokevirtual   #383 <Method String AssetSoftwareVersionEvent.softwareVersion()>
	//*  32   63:invokestatic    #261 <Method boolean j.i(String)>
	//*  33   66:ifeq            77
			assetsoftwareversionevent = ((AssetSoftwareVersionEvent) (assetsoftwareversionevent.softwareVersion()));
	//   34   69:aload_1         
	//   35   70:invokevirtual   #383 <Method String AssetSoftwareVersionEvent.softwareVersion()>
	//   36   73:astore_1        
		else
	//*  37   74:goto            81
			assetsoftwareversionevent = "";
	//   38   77:ldc2            #385 <String "">
	//   39   80:astore_1        
		((CustomTextView) (obj)).setText(((CharSequence) (assetsoftwareversionevent)));
	//   40   81:aload_2         
	//   41   82:aload_1         
	//   42   83:invokevirtual   #269 <Method void CustomTextView.setText(CharSequence)>
	//   43   86:return          
	}

	public void onAssetUpdateAvailabilityEvent(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #326 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #327 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("AssetUpdateAvailabilityEvent received for asset ID: ");
	//    4    8:aload_3         
	//    5    9:ldc2            #389 <String "AssetUpdateAvailabilityEvent received for asset ID: ">
	//    6   12:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(assetupdateavailabilityevent.assetId().getId());
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #390 <Method AssetId AssetUpdateAvailabilityEvent.assetId()>
	//   11   21:invokevirtual   #342 <Method String AssetId.getId()>
	//   12   24:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append(", version is ");
	//   14   28:aload_3         
	//   15   29:ldc2            #380 <String ", version is ">
	//   16   32:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(assetupdateavailabilityevent.currentVersion());
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #393 <Method String AssetUpdateAvailabilityEvent.currentVersion()>
	//   21   41:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		com.irobot.home.util.o.b("AboutBraava", stringbuilder.toString());
	//   23   45:ldc1            #247 <String "AboutBraava">
	//   24   47:aload_3         
	//   25   48:invokevirtual   #350 <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #352 <Method void o.b(String, String)>
		l = assetupdateavailabilityevent;
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:putfield        #187 <Field AssetUpdateAvailabilityEvent l>
		byte byte0;
		if(assetupdateavailabilityevent.status() == UpdateStatus.UpdateAvailable && assetupdateavailabilityevent.updateInfo() != null)
	//*  30   59:aload_1         
	//*  31   60:invokevirtual   #397 <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//*  32   63:getstatic       #403 <Field UpdateStatus UpdateStatus.UpdateAvailable>
	//*  33   66:if_acmpne       86
	//*  34   69:aload_1         
	//*  35   70:invokevirtual   #193 <Method com.irobot.core.FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//*  36   73:ifnull          86
		{
			assetupdateavailabilityevent = ((AssetUpdateAvailabilityEvent) (e));
	//   37   76:aload_0         
	//   38   77:getfield        #160 <Field View e>
	//   39   80:astore_1        
			byte0 = 0;
	//   40   81:iconst_0        
	//   41   82:istore_2        
		} else
	//*  42   83:goto            94
		{
			assetupdateavailabilityevent = ((AssetUpdateAvailabilityEvent) (e));
	//   43   86:aload_0         
	//   44   87:getfield        #160 <Field View e>
	//   45   90:astore_1        
			byte0 = 8;
	//   46   91:bipush          8
	//   47   93:istore_2        
		}
		((View) (assetupdateavailabilityevent)).setVisibility(((int) (byte0)));
	//   48   94:aload_1         
	//   49   95:iload_2         
	//   50   96:invokevirtual   #165 <Method void View.setVisibility(int)>
	//   51   99:return          
	}

	protected void onDestroy()
	{
		o.a(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field a o>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #407 <Method void a.a(Object)>
		super.onDestroy();
	//    4    8:aload_0         
	//    5    9:invokespecial   #409 <Method void BaseFragmentActivity.onDestroy()>
	//    6   12:return          
	}

	String a;
	CustomerCareRestClient b;
	RelativeLayout c;
	RelativeLayout d;
	View e;
	IRobotApplication f;
	private CustomTextView g;
	private CustomTextView h;
	private ImageView i;
	private UpdateUIService j;
	private AssetStatusSubsystem k;
	private AssetUpdateAvailabilityEvent l;
	private RobotErrorHelpContentList m;
	private boolean n;
	private a o;
	private String t;
	private boolean u;
}
