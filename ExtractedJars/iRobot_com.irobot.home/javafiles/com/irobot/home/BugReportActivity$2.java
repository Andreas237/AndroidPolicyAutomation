// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Spinner;
import com.irobot.core.*;
import com.irobot.home.b.g;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.irobot.home:
//			BugReportActivity

class BugReportActivity$2
	implements Runnable
{

	public void run()
	{
		int i = a.d.getSelectedItemPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BugReportActivity a>
	//    2    4:getfield        #25  <Field Spinner BugReportActivity.d>
	//    3    7:invokevirtual   #31  <Method int Spinner.getSelectedItemPosition()>
	//    4   10:istore_1        
		String s;
		if(i > 0)
	//*   5   11:iload_1         
	//*   6   12:ifle            36
			s = BugReportActivity.b(a).a(i).b().getId();
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field BugReportActivity a>
	//    9   19:invokestatic    #35  <Method g BugReportActivity.b(BugReportActivity)>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #40  <Method a g.a(int)>
	//   12   26:invokevirtual   #45  <Method AssetId a.b()>
	//   13   29:invokevirtual   #51  <Method String AssetId.getId()>
	//   14   32:astore_2        
		else
	//*  15   33:goto            42
			s = "";
	//   16   36:ldc1            #53  <String "">
	//   17   38:astore_2        
	//*  18   39:goto            33
		if(com.irobot.home.BugReportActivity.a(a) != null)
	//*  19   42:aload_0         
	//*  20   43:getfield        #17  <Field BugReportActivity a>
	//*  21   46:invokestatic    #56  <Method MissionSubsystem com.irobot.home.BugReportActivity.a(BugReportActivity)>
	//*  22   49:ifnull          66
			com.irobot.home.BugReportActivity.a(a).sendServiceCommand(MissionUIServiceCommand.DisableLogStream, ((com.irobot.core.MissionUIServiceData) (null)));
	//   23   52:aload_0         
	//   24   53:getfield        #17  <Field BugReportActivity a>
	//   25   56:invokestatic    #56  <Method MissionSubsystem com.irobot.home.BugReportActivity.a(BugReportActivity)>
	//   26   59:getstatic       #62  <Field MissionUIServiceCommand MissionUIServiceCommand.DisableLogStream>
	//   27   62:aconst_null     
	//   28   63:invokevirtual   #68  <Method void MissionSubsystem.sendServiceCommand(MissionUIServiceCommand, com.irobot.core.MissionUIServiceData)>
		String s1 = TextUtils.join("\n", ((Iterable) (BugReportActivity.c(a))));
	//   29   66:ldc1            #70  <String "\n">
	//   30   68:aload_0         
	//   31   69:getfield        #17  <Field BugReportActivity a>
	//   32   72:invokestatic    #74  <Method java.util.List BugReportActivity.c(BugReportActivity)>
	//   33   75:invokestatic    #80  <Method String TextUtils.join(CharSequence, Iterable)>
	//   34   78:astore_3        
		String s2 = ((Object) (a.a.getText())).toString();
	//   35   79:aload_0         
	//   36   80:getfield        #17  <Field BugReportActivity a>
	//   37   83:getfield        #83  <Field EditText com.irobot.home.BugReportActivity.a>
	//   38   86:invokevirtual   #89  <Method android.text.Editable EditText.getText()>
	//   39   89:invokevirtual   #92  <Method String Object.toString()>
	//   40   92:astore          4
		HashMap hashmap = new HashMap();
	//   41   94:new             #94  <Class HashMap>
	//   42   97:dup             
	//   43   98:invokespecial   #95  <Method void HashMap()>
	//   44  101:astore          5
		if(a.b.isEnabled() && a.b.isChecked())
	//*  45  103:aload_0         
	//*  46  104:getfield        #17  <Field BugReportActivity a>
	//*  47  107:getfield        #98  <Field SwitchCompat BugReportActivity.b>
	//*  48  110:invokevirtual   #104 <Method boolean SwitchCompat.isEnabled()>
	//*  49  113:ifeq            162
	//*  50  116:aload_0         
	//*  51  117:getfield        #17  <Field BugReportActivity a>
	//*  52  120:getfield        #98  <Field SwitchCompat BugReportActivity.b>
	//*  53  123:invokevirtual   #107 <Method boolean SwitchCompat.isChecked()>
	//*  54  126:ifeq            162
		{
			ArrayList arraylist = new ArrayList();
	//   55  129:new             #109 <Class ArrayList>
	//   56  132:dup             
	//   57  133:invokespecial   #110 <Method void ArrayList()>
	//   58  136:astore          6
			arraylist.add(((Object) (a.h)));
	//   59  138:aload           6
	//   60  140:aload_0         
	//   61  141:getfield        #17  <Field BugReportActivity a>
	//   62  144:getfield        #114 <Field String BugReportActivity.h>
	//   63  147:invokevirtual   #118 <Method boolean ArrayList.add(Object)>
	//   64  150:pop             
			hashmap.put(((Object) (BugReportFileType.Screenshot)), ((Object) (arraylist)));
	//   65  151:aload           5
	//   66  153:getstatic       #124 <Field BugReportFileType BugReportFileType.Screenshot>
	//   67  156:aload           6
	//   68  158:invokevirtual   #128 <Method Object HashMap.put(Object, Object)>
	//   69  161:pop             
		}
		ApplicationUIServiceData applicationuiservicedata = ApplicationUIServiceData.create();
	//   70  162:invokestatic    #134 <Method ApplicationUIServiceData ApplicationUIServiceData.create()>
	//   71  165:astore          6
		applicationuiservicedata.setBugReportData(s2, s, a.e.getSelectedItem().toString(), s1, j.b(((android.content.Context) (a))), hashmap);
	//   72  167:aload           6
	//   73  169:aload           4
	//   74  171:aload_2         
	//   75  172:aload_0         
	//   76  173:getfield        #17  <Field BugReportActivity a>
	//   77  176:getfield        #137 <Field Spinner BugReportActivity.e>
	//   78  179:invokevirtual   #141 <Method Object Spinner.getSelectedItem()>
	//   79  182:invokevirtual   #92  <Method String Object.toString()>
	//   80  185:aload_3         
	//   81  186:aload_0         
	//   82  187:getfield        #17  <Field BugReportActivity a>
	//   83  190:invokestatic    #146 <Method String j.b(android.content.Context)>
	//   84  193:aload           5
	//   85  195:invokevirtual   #150 <Method void ApplicationUIServiceData.setBugReportData(String, String, String, String, String, HashMap)>
		BugReportActivity.d(a).sendCommand(ApplicationUIServiceCommand.SubmitBugReport, applicationuiservicedata);
	//   86  198:aload_0         
	//   87  199:getfield        #17  <Field BugReportActivity a>
	//   88  202:invokestatic    #153 <Method ApplicationUIService BugReportActivity.d(BugReportActivity)>
	//   89  205:getstatic       #159 <Field ApplicationUIServiceCommand ApplicationUIServiceCommand.SubmitBugReport>
	//   90  208:aload           6
	//   91  210:invokevirtual   #165 <Method void ApplicationUIService.sendCommand(ApplicationUIServiceCommand, ApplicationUIServiceData)>
	//   92  213:return          
	}

	final BugReportActivity a;

	BugReportActivity$2(BugReportActivity bugreportactivity)
	{
		a = bugreportactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BugReportActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
