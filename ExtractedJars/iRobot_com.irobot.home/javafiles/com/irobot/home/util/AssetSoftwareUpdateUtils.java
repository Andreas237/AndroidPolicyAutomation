// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.irobot.core.Assembler;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;
import com.irobot.core.AssetUpdateAvailabilityEvent;
import com.irobot.core.AssetUpdateProgressEvent;
import com.irobot.core.EventType;
import com.irobot.core.FirmwareUpdateItem;
import com.irobot.core.UpdateProgressState;
import com.irobot.core.UpdateStatus;
import com.irobot.core.UpdateUIService;
import com.irobot.home.WebViewActivity_;
import com.irobot.home.i.a;
import com.irobot.home.model.rest.RobotErrorHelpContent;
import com.irobot.home.model.rest.RobotErrorHelpContentList;
import com.irobot.home.rest.CustomerCareRestClient;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.irobot.home.util:
//			j, o, i

public class AssetSoftwareUpdateUtils
{

	public AssetSoftwareUpdateUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		k = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #43  <Field String k>
		l = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #45  <Field boolean l>
		g = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #47  <Field UpdateUIService g>
		h = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #49  <Field ProgressDialog h>
		b = com.irobot.home.util.j.i(((Context) (a)));
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #51  <Field Activity a>
	//   17   29:invokestatic    #56  <Method CustomerCareRestClient j.i(Context)>
	//   18   32:putfield        #58  <Field CustomerCareRestClient b>
	//   19   35:return          
	}

	static String a(AssetSoftwareUpdateUtils assetsoftwareupdateutils)
	{
		return assetsoftwareupdateutils.k;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String k>
	//    2    4:areturn         
	}

	static boolean a(AssetSoftwareUpdateUtils assetsoftwareupdateutils, boolean flag)
	{
		assetsoftwareupdateutils.l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean l>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void d()
	{
		if(h != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field ProgressDialog h>
	//*   2    4:ifnull          19
		{
			h.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #49  <Field ProgressDialog h>
	//    5   11:invokevirtual   #65  <Method void ProgressDialog.dismiss()>
			h = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #49  <Field ProgressDialog h>
		}
		if(i != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #67  <Field a i>
	//*  11   23:ifnull          42
		{
			i.b(((Object) (this)), EventType.AssetUpdateProgressEvent);
	//   12   26:aload_0         
	//   13   27:getfield        #67  <Field a i>
	//   14   30:aload_0         
	//   15   31:getstatic       #73  <Field EventType EventType.AssetUpdateProgressEvent>
	//   16   34:invokevirtual   #78  <Method void a.b(Object, EventType)>
			i = null;
	//   17   37:aload_0         
	//   18   38:aconst_null     
	//   19   39:putfield        #67  <Field a i>
		}
	//   20   42:return          
	}

	public void a()
	{
		String s = e;
	//    0    0:getstatic       #80  <Field String e>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #82  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #83  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("startUpload with URL ");
	//    6   12:aload_2         
	//    7   13:ldc1            #85  <String "startUpload with URL ">
	//    8   15:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(f.updateInfo().getDownloadUrl());
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #91  <Field AssetUpdateAvailabilityEvent f>
	//   13   24:invokevirtual   #97  <Method FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//   14   27:invokevirtual   #103 <Method String FirmwareUpdateItem.getDownloadUrl()>
	//   15   30:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		o.b(s, stringbuilder.toString());
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   20   39:invokestatic    #111 <Method void o.b(String, String)>
		g.uploadPackage(f.updateInfo().getDownloadUrl());
	//   21   42:aload_0         
	//   22   43:getfield        #47  <Field UpdateUIService g>
	//   23   46:aload_0         
	//   24   47:getfield        #91  <Field AssetUpdateAvailabilityEvent f>
	//   25   50:invokevirtual   #97  <Method FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//   26   53:invokevirtual   #103 <Method String FirmwareUpdateItem.getDownloadUrl()>
	//   27   56:invokevirtual   #117 <Method void UpdateUIService.uploadPackage(String)>
	//   28   59:return          
	}

	public void a(Activity activity)
	{
		a = activity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Activity a>
	//    3    5:return          
	}

	public void a(android.content.DialogInterface.OnClickListener onclicklistener)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field AssetUpdateAvailabilityEvent f>
	//*   2    4:ifnull          196
		{
			if(f.updateInfo() == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #91  <Field AssetUpdateAvailabilityEvent f>
	//*   5   11:invokevirtual   #97  <Method FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//*   6   14:ifnonnull       18
				return;
	//    7   17:return          
			d = onclicklistener;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #121 <Field android.content.DialogInterface$OnClickListener d>
			onclicklistener = ((android.content.DialogInterface.OnClickListener) (f.assetId()));
	//   11   23:aload_0         
	//   12   24:getfield        #91  <Field AssetUpdateAvailabilityEvent f>
	//   13   27:invokevirtual   #125 <Method AssetId AssetUpdateAvailabilityEvent.assetId()>
	//   14   30:astore_1        
			g = Assembler.getInstance().getUpdateUIService(((AssetId) (onclicklistener)));
	//   15   31:aload_0         
	//   16   32:invokestatic    #131 <Method Assembler Assembler.getInstance()>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #135 <Method UpdateUIService Assembler.getUpdateUIService(AssetId)>
	//   19   39:putfield        #47  <Field UpdateUIService g>
			i = (a)Assembler.getInstance().getDomainEventBus();
	//   20   42:aload_0         
	//   21   43:invokestatic    #131 <Method Assembler Assembler.getInstance()>
	//   22   46:invokevirtual   #139 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   23   49:checkcast       #75  <Class a>
	//   24   52:putfield        #67  <Field a i>
			i.a(((Object) (this)), EventType.AssetUpdateProgressEvent);
	//   25   55:aload_0         
	//   26   56:getfield        #67  <Field a i>
	//   27   59:aload_0         
	//   28   60:getstatic       #73  <Field EventType EventType.AssetUpdateProgressEvent>
	//   29   63:invokevirtual   #141 <Method void a.a(Object, EventType)>
			a();
	//   30   66:aload_0         
	//   31   67:invokevirtual   #143 <Method void a()>
			h = new ProgressDialog(((Context) (a)));
	//   32   70:aload_0         
	//   33   71:new             #62  <Class ProgressDialog>
	//   34   74:dup             
	//   35   75:aload_0         
	//   36   76:getfield        #51  <Field Activity a>
	//   37   79:invokespecial   #146 <Method void ProgressDialog(Context)>
	//   38   82:putfield        #49  <Field ProgressDialog h>
			h.setTitle(0x7f0f0403);
	//   39   85:aload_0         
	//   40   86:getfield        #49  <Field ProgressDialog h>
	//   41   89:ldc1            #147 <Int 0x7f0f0403>
	//   42   91:invokevirtual   #151 <Method void ProgressDialog.setTitle(int)>
			h.setProgressStyle(1);
	//   43   94:aload_0         
	//   44   95:getfield        #49  <Field ProgressDialog h>
	//   45   98:iconst_1        
	//   46   99:invokevirtual   #154 <Method void ProgressDialog.setProgressStyle(int)>
			h.setProgressNumberFormat(((String) (null)));
	//   47  102:aload_0         
	//   48  103:getfield        #49  <Field ProgressDialog h>
	//   49  106:aconst_null     
	//   50  107:invokevirtual   #157 <Method void ProgressDialog.setProgressNumberFormat(String)>
			h.setProgressPercentFormat(((NumberFormat) (null)));
	//   51  110:aload_0         
	//   52  111:getfield        #49  <Field ProgressDialog h>
	//   53  114:aconst_null     
	//   54  115:invokevirtual   #161 <Method void ProgressDialog.setProgressPercentFormat(NumberFormat)>
			h.setCanceledOnTouchOutside(false);
	//   55  118:aload_0         
	//   56  119:getfield        #49  <Field ProgressDialog h>
	//   57  122:iconst_0        
	//   58  123:invokevirtual   #165 <Method void ProgressDialog.setCanceledOnTouchOutside(boolean)>
			h.setCancelable(false);
	//   59  126:aload_0         
	//   60  127:getfield        #49  <Field ProgressDialog h>
	//   61  130:iconst_0        
	//   62  131:invokevirtual   #168 <Method void ProgressDialog.setCancelable(boolean)>
			onclicklistener = ((android.content.DialogInterface.OnClickListener) (com.irobot.home.util.j.a(((AssetId) (onclicklistener)).getId())));
	//   63  134:aload_1         
	//   64  135:invokevirtual   #173 <Method String AssetId.getId()>
	//   65  138:invokestatic    #176 <Method com.irobot.home.model.a com.irobot.home.util.j.a(String)>
	//   66  141:astore_1        
			if(onclicklistener != null && AssetCapabilityUtils.isNonCloudCapableMoppingRobot(((com.irobot.home.model.a) (onclicklistener)).a()))
	//*  67  142:aload_1         
	//*  68  143:ifnull          189
	//*  69  146:aload_1         
	//*  70  147:invokevirtual   #181 <Method AssetInfo com.irobot.home.model.a.a()>
	//*  71  150:invokestatic    #187 <Method boolean AssetCapabilityUtils.isNonCloudCapableMoppingRobot(AssetInfo)>
	//*  72  153:ifeq            189
			{
				int i1;
				if(i.f)
	//*  73  156:getstatic       #191 <Field boolean i.f>
	//*  74  159:ifeq            168
					i1 = 0x7f0f00f0;
	//   75  162:ldc1            #192 <Int 0x7f0f00f0>
	//   76  164:istore_2        
				else
	//*  77  165:goto            171
					i1 = 0x7f0f00ef;
	//   78  168:ldc1            #193 <Int 0x7f0f00ef>
	//   79  170:istore_2        
				h.setMessage(((CharSequence) (h.getContext().getString(i1))));
	//   80  171:aload_0         
	//   81  172:getfield        #49  <Field ProgressDialog h>
	//   82  175:aload_0         
	//   83  176:getfield        #49  <Field ProgressDialog h>
	//   84  179:invokevirtual   #197 <Method Context ProgressDialog.getContext()>
	//   85  182:iload_2         
	//   86  183:invokevirtual   #203 <Method String Context.getString(int)>
	//   87  186:invokevirtual   #207 <Method void ProgressDialog.setMessage(CharSequence)>
			}
			h.show();
	//   88  189:aload_0         
	//   89  190:getfield        #49  <Field ProgressDialog h>
	//   90  193:invokevirtual   #210 <Method void ProgressDialog.show()>
		}
	//   91  196:return          
	}

	public void a(android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field AssetUpdateAvailabilityEvent f>
	//*   2    4:ifnull          77
		{
			if(f.updateInfo() == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #91  <Field AssetUpdateAvailabilityEvent f>
	//*   5   11:invokevirtual   #97  <Method FirmwareUpdateItem AssetUpdateAvailabilityEvent.updateInfo()>
	//*   6   14:ifnonnull       18
				return;
	//    7   17:return          
			c = onclicklistener;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #213 <Field android.content.DialogInterface$OnClickListener c>
			onclicklistener = ((android.content.DialogInterface.OnClickListener) ((new android.app.AlertDialog.Builder(((Context) (a)))).setTitle(0x7f0f0855).setMessage(0x7f0f05df).setPositiveButton(0x7f0f03fc, new android.content.DialogInterface.OnClickListener(onclicklistener1) {

				public void onClick(DialogInterface dialoginterface, int i1)
				{
					b.a(a);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field AssetSoftwareUpdateUtils b>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field android.content.DialogInterface$OnClickListener a>
				//    4    8:invokevirtual   #29  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils.a(android.content.DialogInterface$OnClickListener)>
				//    5   11:return          
				}

				final android.content.DialogInterface.OnClickListener a;
				final AssetSoftwareUpdateUtils b;

			
			{
				b = AssetSoftwareUpdateUtils.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AssetSoftwareUpdateUtils b>
				a = onclicklistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field android.content.DialogInterface$OnClickListener a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
).setNegativeButton(0x7f0f017d, onclicklistener).create()));
	//   11   23:new             #215 <Class android.app.AlertDialog$Builder>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #51  <Field Activity a>
	//   15   31:invokespecial   #216 <Method void android.app.AlertDialog$Builder(Context)>
	//   16   34:ldc1            #217 <Int 0x7f0f0855>
	//   17   36:invokevirtual   #220 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//   18   39:ldc1            #221 <Int 0x7f0f05df>
	//   19   41:invokevirtual   #223 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   20   44:ldc1            #224 <Int 0x7f0f03fc>
	//   21   46:new             #6   <Class AssetSoftwareUpdateUtils$1>
	//   22   49:dup             
	//   23   50:aload_0         
	//   24   51:aload_2         
	//   25   52:invokespecial   #227 <Method void AssetSoftwareUpdateUtils$1(AssetSoftwareUpdateUtils, android.content.DialogInterface$OnClickListener)>
	//   26   55:invokevirtual   #231 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   27   58:ldc1            #232 <Int 0x7f0f017d>
	//   28   60:aload_1         
	//   29   61:invokevirtual   #235 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   30   64:invokevirtual   #239 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   31   67:astore_1        
			((AlertDialog) (onclicklistener)).setCanceledOnTouchOutside(false);
	//   32   68:aload_1         
	//   33   69:iconst_0        
	//   34   70:invokevirtual   #242 <Method void AlertDialog.setCanceledOnTouchOutside(boolean)>
			((AlertDialog) (onclicklistener)).show();
	//   35   73:aload_1         
	//   36   74:invokevirtual   #243 <Method void AlertDialog.show()>
		}
	//   37   77:return          
	}

	public void a(AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		AssetUpdateAvailabilityEvent assetupdateavailabilityevent1;
		if(assetupdateavailabilityevent != null && assetupdateavailabilityevent.status() != UpdateStatus.UpdateUnavailable)
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #248 <Method UpdateStatus AssetUpdateAvailabilityEvent.status()>
	//*   4    8:getstatic       #254 <Field UpdateStatus UpdateStatus.UpdateUnavailable>
	//*   5   11:if_acmpeq       19
			assetupdateavailabilityevent1 = assetupdateavailabilityevent;
	//    6   14:aload_1         
	//    7   15:astore_2        
		else
	//*   8   16:goto            21
			assetupdateavailabilityevent1 = null;
	//    9   19:aconst_null     
	//   10   20:astore_2        
		f = assetupdateavailabilityevent1;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #91  <Field AssetUpdateAvailabilityEvent f>
		j = com.irobot.home.util.j.a(assetupdateavailabilityevent.assetId().getId()).a().getSku();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #125 <Method AssetId AssetUpdateAvailabilityEvent.assetId()>
	//   17   31:invokevirtual   #173 <Method String AssetId.getId()>
	//   18   34:invokestatic    #176 <Method com.irobot.home.model.a com.irobot.home.util.j.a(String)>
	//   19   37:invokevirtual   #181 <Method AssetInfo com.irobot.home.model.a.a()>
	//   20   40:invokevirtual   #259 <Method String AssetInfo.getSku()>
	//   21   43:putfield        #261 <Field String j>
		c();
	//   22   46:aload_0         
	//   23   47:invokevirtual   #263 <Method void c()>
	//   24   50:return          
	}

	public boolean b()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean l>
	//    2    4:ireturn         
	}

	protected void c()
	{
		Object obj = ((Object) (Locale.getDefault()));
	//    0    0:invokestatic    #272 <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_159;
	//    2    4:aload_1         
	//    3    5:ifnull          159
		String s;
		String s2;
		if(!com.irobot.home.util.j.a())
			break MISSING_BLOCK_LABEL_159;
	//    4    8:invokestatic    #274 <Method boolean com.irobot.home.util.j.a()>
	//    5   11:ifeq            159
		s2 = com.irobot.home.util.j.a(((Locale) (obj)));
	//    6   14:aload_1         
	//    7   15:invokestatic    #277 <Method String com.irobot.home.util.j.a(Locale)>
	//    8   18:astore_3        
		s = com.irobot.home.util.j.h(a.getBaseContext());
	//    9   19:aload_0         
	//   10   20:getfield        #51  <Field Activity a>
	//   11   23:invokevirtual   #282 <Method Context Activity.getBaseContext()>
	//   12   26:invokestatic    #285 <Method String j.h(Context)>
	//   13   29:astore_2        
		obj = ((Object) (s));
	//   14   30:aload_2         
	//   15   31:astore_1        
		if(!com.irobot.home.util.j.i(s))
	//*  16   32:aload_2         
	//*  17   33:invokestatic    #288 <Method boolean j.i(String)>
	//*  18   36:ifne            43
			obj = "US";
	//   19   39:ldc2            #290 <String "US">
	//   20   42:astore_1        
		obj = ((Object) (b.getRobotErrorHelp(s2, ((String) (obj)), j)));
	//   21   43:aload_0         
	//   22   44:getfield        #58  <Field CustomerCareRestClient b>
	//   23   47:aload_3         
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #261 <Field String j>
	//   27   53:invokeinterface #296 <Method RobotErrorHelpContentList CustomerCareRestClient.getRobotErrorHelp(String, String, String)>
	//   28   58:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_159;
	//   29   59:aload_1         
	//   30   60:ifnull          159
		try
		{
			if(((RobotErrorHelpContentList) (obj)).otherContent == null)
				break MISSING_BLOCK_LABEL_159;
	//   31   63:aload_1         
	//   32   64:getfield        #302 <Field List RobotErrorHelpContentList.otherContent>
	//   33   67:ifnull          159
			obj = ((Object) (((RobotErrorHelpContentList) (obj)).otherContent.iterator()));
	//   34   70:aload_1         
	//   35   71:getfield        #302 <Field List RobotErrorHelpContentList.otherContent>
	//   36   74:invokeinterface #308 <Method Iterator List.iterator()>
	//   37   79:astore_1        
			RobotErrorHelpContent roboterrorhelpcontent;
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break MISSING_BLOCK_LABEL_159;
	//   38   80:aload_1         
	//   39   81:invokeinterface #313 <Method boolean Iterator.hasNext()>
	//   40   86:ifeq            159
				roboterrorhelpcontent = (RobotErrorHelpContent)((Iterator) (obj)).next();
	//   41   89:aload_1         
	//   42   90:invokeinterface #317 <Method Object Iterator.next()>
	//   43   95:checkcast       #319 <Class RobotErrorHelpContent>
	//   44   98:astore_2        
			} while(!roboterrorhelpcontent.id.equalsIgnoreCase("software_update"));
	//   45   99:aload_2         
	//   46  100:getfield        #322 <Field String RobotErrorHelpContent.id>
	//   47  103:ldc2            #324 <String "software_update">
	//   48  106:invokevirtual   #329 <Method boolean String.equalsIgnoreCase(String)>
	//   49  109:ifeq            80
			k = roboterrorhelpcontent.content;
	//   50  112:aload_0         
	//   51  113:aload_2         
	//   52  114:getfield        #332 <Field String RobotErrorHelpContent.content>
	//   53  117:putfield        #43  <Field String k>
			return;
	//   54  120:return          
		}
		catch(Exception exception)
	//*  55  121:astore_1        
		{
			String s1 = e;
	//   56  122:getstatic       #80  <Field String e>
	//   57  125:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   58  126:new             #82  <Class StringBuilder>
	//   59  129:dup             
	//   60  130:invokespecial   #83  <Method void StringBuilder()>
	//   61  133:astore_3        
			stringbuilder.append("getSoftwareUpdateHelpContent: ");
	//   62  134:aload_3         
	//   63  135:ldc2            #334 <String "getSoftwareUpdateHelpContent: ">
	//   64  138:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   65  141:pop             
			stringbuilder.append(exception.getMessage());
	//   66  142:aload_3         
	//   67  143:aload_1         
	//   68  144:invokevirtual   #337 <Method String Exception.getMessage()>
	//   69  147:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   70  150:pop             
			o.e(s1, stringbuilder.toString());
	//   71  151:aload_2         
	//   72  152:aload_3         
	//   73  153:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   74  156:invokestatic    #339 <Method void o.e(String, String)>
		}
	//   75  159:return          
	}

	public void onAssetUpdateProgressEvent(AssetUpdateProgressEvent assetupdateprogressevent)
	{
		String s = e;
	//    0    0:getstatic       #80  <Field String e>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #82  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #83  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("AssetUpdateProgressEvent received for asset ID: ");
	//    6   12:aload_3         
	//    7   13:ldc2            #344 <String "AssetUpdateProgressEvent received for asset ID: ">
	//    8   16:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(assetupdateprogressevent.assetId().getId());
	//   10   20:aload_3         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #347 <Method AssetId AssetUpdateProgressEvent.assetId()>
	//   13   25:invokevirtual   #173 <Method String AssetId.getId()>
	//   14   28:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(", state=");
	//   16   32:aload_3         
	//   17   33:ldc2            #349 <String ", state=">
	//   18   36:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(((Object) (assetupdateprogressevent.state())));
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #353 <Method UpdateProgressState AssetUpdateProgressEvent.state()>
	//   23   45:invokevirtual   #356 <Method StringBuilder StringBuilder.append(Object)>
	//   24   48:pop             
		stringbuilder.append(", progress=");
	//   25   49:aload_3         
	//   26   50:ldc2            #358 <String ", progress=">
	//   27   53:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(assetupdateprogressevent.progressAmount());
	//   29   57:aload_3         
	//   30   58:aload_1         
	//   31   59:invokevirtual   #362 <Method int AssetUpdateProgressEvent.progressAmount()>
	//   32   62:invokevirtual   #365 <Method StringBuilder StringBuilder.append(int)>
	//   33   65:pop             
		stringbuilder.append(", total=");
	//   34   66:aload_3         
	//   35   67:ldc2            #367 <String ", total=">
	//   36   70:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
		stringbuilder.append(assetupdateprogressevent.totalAmount());
	//   38   74:aload_3         
	//   39   75:aload_1         
	//   40   76:invokevirtual   #370 <Method int AssetUpdateProgressEvent.totalAmount()>
	//   41   79:invokevirtual   #365 <Method StringBuilder StringBuilder.append(int)>
	//   42   82:pop             
		stringbuilder.append(", error=");
	//   43   83:aload_3         
	//   44   84:ldc2            #372 <String ", error=">
	//   45   87:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
		stringbuilder.append(((Object) (assetupdateprogressevent.error())));
	//   47   91:aload_3         
	//   48   92:aload_1         
	//   49   93:invokevirtual   #376 <Method com.irobot.core.Error AssetUpdateProgressEvent.error()>
	//   50   96:invokevirtual   #356 <Method StringBuilder StringBuilder.append(Object)>
	//   51   99:pop             
		o.b(s, stringbuilder.toString());
	//   52  100:aload_2         
	//   53  101:aload_3         
	//   54  102:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   55  105:invokestatic    #111 <Method void o.b(String, String)>
		if(h != null && !a.isFinishing())
	//*  56  108:aload_0         
	//*  57  109:getfield        #49  <Field ProgressDialog h>
	//*  58  112:ifnull          370
	//*  59  115:aload_0         
	//*  60  116:getfield        #51  <Field Activity a>
	//*  61  119:invokevirtual   #379 <Method boolean Activity.isFinishing()>
	//*  62  122:ifne            370
		{
			if(a.isDestroyed())
	//*  63  125:aload_0         
	//*  64  126:getfield        #51  <Field Activity a>
	//*  65  129:invokevirtual   #382 <Method boolean Activity.isDestroyed()>
	//*  66  132:ifeq            136
				return;
	//   67  135:return          
			if(h.getMax() != assetupdateprogressevent.totalAmount())
	//*  68  136:aload_0         
	//*  69  137:getfield        #49  <Field ProgressDialog h>
	//*  70  140:invokevirtual   #385 <Method int ProgressDialog.getMax()>
	//*  71  143:aload_1         
	//*  72  144:invokevirtual   #370 <Method int AssetUpdateProgressEvent.totalAmount()>
	//*  73  147:icmpeq          188
			{
				h.setMax(assetupdateprogressevent.totalAmount());
	//   74  150:aload_0         
	//   75  151:getfield        #49  <Field ProgressDialog h>
	//   76  154:aload_1         
	//   77  155:invokevirtual   #370 <Method int AssetUpdateProgressEvent.totalAmount()>
	//   78  158:invokevirtual   #388 <Method void ProgressDialog.setMax(int)>
				if(assetupdateprogressevent.totalAmount() > 0)
	//*  79  161:aload_1         
	//*  80  162:invokevirtual   #370 <Method int AssetUpdateProgressEvent.totalAmount()>
	//*  81  165:ifle            188
				{
					h.setProgressNumberFormat("%1d/%2d");
	//   82  168:aload_0         
	//   83  169:getfield        #49  <Field ProgressDialog h>
	//   84  172:ldc2            #390 <String "%1d/%2d">
	//   85  175:invokevirtual   #157 <Method void ProgressDialog.setProgressNumberFormat(String)>
					h.setProgressPercentFormat(NumberFormat.getPercentInstance());
	//   86  178:aload_0         
	//   87  179:getfield        #49  <Field ProgressDialog h>
	//   88  182:invokestatic    #396 <Method NumberFormat NumberFormat.getPercentInstance()>
	//   89  185:invokevirtual   #161 <Method void ProgressDialog.setProgressPercentFormat(NumberFormat)>
				}
			}
			h.setProgress(assetupdateprogressevent.progressAmount());
	//   90  188:aload_0         
	//   91  189:getfield        #49  <Field ProgressDialog h>
	//   92  192:aload_1         
	//   93  193:invokevirtual   #362 <Method int AssetUpdateProgressEvent.progressAmount()>
	//   94  196:invokevirtual   #399 <Method void ProgressDialog.setProgress(int)>
			if(assetupdateprogressevent.state() == UpdateProgressState.Complete)
	//*  95  199:aload_1         
	//*  96  200:invokevirtual   #353 <Method UpdateProgressState AssetUpdateProgressEvent.state()>
	//*  97  203:getstatic       #405 <Field UpdateProgressState UpdateProgressState.Complete>
	//*  98  206:if_acmpne       258
			{
				d();
	//   99  209:aload_0         
	//  100  210:invokespecial   #407 <Method void d()>
				assetupdateprogressevent = ((AssetUpdateProgressEvent) ((new android.app.AlertDialog.Builder(((Context) (a)))).setTitle(0x7f0f08a5).setPositiveButton(0x7f0f0235, d).setCancelable(false).create()));
	//  101  213:new             #215 <Class android.app.AlertDialog$Builder>
	//  102  216:dup             
	//  103  217:aload_0         
	//  104  218:getfield        #51  <Field Activity a>
	//  105  221:invokespecial   #216 <Method void android.app.AlertDialog$Builder(Context)>
	//  106  224:ldc2            #408 <Int 0x7f0f08a5>
	//  107  227:invokevirtual   #220 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//  108  230:ldc2            #409 <Int 0x7f0f0235>
	//  109  233:aload_0         
	//  110  234:getfield        #121 <Field android.content.DialogInterface$OnClickListener d>
	//  111  237:invokevirtual   #231 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//  112  240:iconst_0        
	//  113  241:invokevirtual   #412 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//  114  244:invokevirtual   #239 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//  115  247:astore_1        
				((AlertDialog) (assetupdateprogressevent)).setCanceledOnTouchOutside(false);
	//  116  248:aload_1         
	//  117  249:iconst_0        
	//  118  250:invokevirtual   #242 <Method void AlertDialog.setCanceledOnTouchOutside(boolean)>
				((AlertDialog) (assetupdateprogressevent)).show();
	//  119  253:aload_1         
	//  120  254:invokevirtual   #243 <Method void AlertDialog.show()>
				return;
	//  121  257:return          
			}
			if(assetupdateprogressevent.state() == UpdateProgressState.Error)
	//* 122  258:aload_1         
	//* 123  259:invokevirtual   #353 <Method UpdateProgressState AssetUpdateProgressEvent.state()>
	//* 124  262:getstatic       #415 <Field UpdateProgressState UpdateProgressState.Error>
	//* 125  265:if_acmpne       370
			{
				d();
	//  126  268:aload_0         
	//  127  269:invokespecial   #407 <Method void d()>
				assetupdateprogressevent = ((AssetUpdateProgressEvent) ((new android.app.AlertDialog.Builder(((Context) (a)))).setTitle(0x7f0f02ad).setMessage(0x7f0f093f).setPositiveButton(0x7f0f0761, new android.content.DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialoginterface, int i1)
					{
						a.a(a.d);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field AssetSoftwareUpdateUtils a>
					//    2    4:aload_0         
					//    3    5:getfield        #17  <Field AssetSoftwareUpdateUtils a>
					//    4    8:getfield        #27  <Field android.content.DialogInterface$OnClickListener AssetSoftwareUpdateUtils.d>
					//    5   11:invokevirtual   #30  <Method void com.irobot.home.util.AssetSoftwareUpdateUtils.a(android.content.DialogInterface$OnClickListener)>
					//    6   14:return          
					}

					final AssetSoftwareUpdateUtils a;

			
			{
				a = AssetSoftwareUpdateUtils.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AssetSoftwareUpdateUtils a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
).setNegativeButton(0x7f0f017d, c).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

					public void onDismiss(DialogInterface dialoginterface)
					{
						com.irobot.home.util.AssetSoftwareUpdateUtils.a(a, false);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field AssetSoftwareUpdateUtils a>
					//    2    4:iconst_0        
					//    3    5:invokestatic    #26  <Method boolean com.irobot.home.util.AssetSoftwareUpdateUtils.a(AssetSoftwareUpdateUtils, boolean)>
					//    4    8:pop             
					//    5    9:return          
					}

					final AssetSoftwareUpdateUtils a;

			
			{
				a = AssetSoftwareUpdateUtils.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AssetSoftwareUpdateUtils a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
).setCancelable(false)));
	//  128  272:new             #215 <Class android.app.AlertDialog$Builder>
	//  129  275:dup             
	//  130  276:aload_0         
	//  131  277:getfield        #51  <Field Activity a>
	//  132  280:invokespecial   #216 <Method void android.app.AlertDialog$Builder(Context)>
	//  133  283:ldc2            #416 <Int 0x7f0f02ad>
	//  134  286:invokevirtual   #220 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(int)>
	//  135  289:ldc2            #417 <Int 0x7f0f093f>
	//  136  292:invokevirtual   #223 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//  137  295:ldc2            #418 <Int 0x7f0f0761>
	//  138  298:new             #10  <Class AssetSoftwareUpdateUtils$3>
	//  139  301:dup             
	//  140  302:aload_0         
	//  141  303:invokespecial   #421 <Method void AssetSoftwareUpdateUtils$3(AssetSoftwareUpdateUtils)>
	//  142  306:invokevirtual   #231 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//  143  309:ldc1            #232 <Int 0x7f0f017d>
	//  144  311:aload_0         
	//  145  312:getfield        #213 <Field android.content.DialogInterface$OnClickListener c>
	//  146  315:invokevirtual   #235 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//  147  318:new             #8   <Class AssetSoftwareUpdateUtils$2>
	//  148  321:dup             
	//  149  322:aload_0         
	//  150  323:invokespecial   #422 <Method void AssetSoftwareUpdateUtils$2(AssetSoftwareUpdateUtils)>
	//  151  326:invokevirtual   #426 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
	//  152  329:iconst_0        
	//  153  330:invokevirtual   #412 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
	//  154  333:astore_1        
				if(com.irobot.home.util.j.i(k))
	//* 155  334:aload_0         
	//* 156  335:getfield        #43  <Field String k>
	//* 157  338:invokestatic    #288 <Method boolean j.i(String)>
	//* 158  341:ifeq            360
					((android.app.AlertDialog.Builder) (assetupdateprogressevent)).setNeutralButton(0x7f0f0356, new android.content.DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialoginterface, int i1)
						{
							WebViewActivity_.a(((Context) (a.a))).a(com.irobot.home.util.AssetSoftwareUpdateUtils.a(a)).a(Integer.valueOf(0x7f0f05d8)).a();
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field AssetSoftwareUpdateUtils a>
						//    2    4:getfield        #26  <Field Activity com.irobot.home.util.AssetSoftwareUpdateUtils.a>
						//    3    7:invokestatic    #31  <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(Context)>
						//    4   10:aload_0         
						//    5   11:getfield        #17  <Field AssetSoftwareUpdateUtils a>
						//    6   14:invokestatic    #34  <Method String com.irobot.home.util.AssetSoftwareUpdateUtils.a(AssetSoftwareUpdateUtils)>
						//    7   17:invokevirtual   #39  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
						//    8   20:ldc1            #40  <Int 0x7f0f05d8>
						//    9   22:invokestatic    #46  <Method Integer Integer.valueOf(int)>
						//   10   25:invokevirtual   #49  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
						//   11   28:invokevirtual   #52  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
						//   12   31:pop             
						//   13   32:return          
						}

						final AssetSoftwareUpdateUtils a;

			
			{
				a = AssetSoftwareUpdateUtils.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AssetSoftwareUpdateUtils a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
	//  159  344:aload_1         
	//  160  345:ldc2            #427 <Int 0x7f0f0356>
	//  161  348:new             #12  <Class AssetSoftwareUpdateUtils$4>
	//  162  351:dup             
	//  163  352:aload_0         
	//  164  353:invokespecial   #428 <Method void AssetSoftwareUpdateUtils$4(AssetSoftwareUpdateUtils)>
	//  165  356:invokevirtual   #431 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(int, android.content.DialogInterface$OnClickListener)>
	//  166  359:pop             
				((android.app.AlertDialog.Builder) (assetupdateprogressevent)).show();
	//  167  360:aload_1         
	//  168  361:invokevirtual   #433 <Method AlertDialog android.app.AlertDialog$Builder.show()>
	//  169  364:pop             
				l = true;
	//  170  365:aload_0         
	//  171  366:iconst_1        
	//  172  367:putfield        #45  <Field boolean l>
			}
		}
	//  173  370:return          
	}

	private static final String e = "com.irobot.home.util.AssetSoftwareUpdateUtils";
	Activity a;
	CustomerCareRestClient b;
	android.content.DialogInterface.OnClickListener c;
	android.content.DialogInterface.OnClickListener d;
	private AssetUpdateAvailabilityEvent f;
	private UpdateUIService g;
	private ProgressDialog h;
	private a i;
	private String j;
	private String k;
	private boolean l;

	static 
	{
	//    0    0:return          
	}
}
