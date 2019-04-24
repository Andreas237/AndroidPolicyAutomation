// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.util.Log;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsMissingDependencyException

class BuildIdValidator
{

	public BuildIdValidator(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		buildId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String buildId>
		requiringBuildId = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean requiringBuildId>
	//    8   14:return          
	}

	protected String getMessage(String s, String s1)
	{
		return "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
	//    0    0:ldc1            #8   <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//    1    2:areturn         
	}

	public void validate(String s, String s1)
	{
		if(CommonUtils.isNullOrEmpty(buildId) && requiringBuildId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field String buildId>
	//*   2    4:invokestatic    #31  <Method boolean CommonUtils.isNullOrEmpty(String)>
	//*   3    7:ifeq            184
	//*   4   10:aload_0         
	//*   5   11:getfield        #20  <Field boolean requiringBuildId>
	//*   6   14:ifeq            184
		{
			s = getMessage(s, s1);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #33  <Method String getMessage(String, String)>
	//   11   23:astore_1        
			Log.e("CrashlyticsCore", ".");
	//   12   24:ldc1            #35  <String "CrashlyticsCore">
	//   13   26:ldc1            #37  <String ".">
	//   14   28:invokestatic    #43  <Method int Log.e(String, String)>
	//   15   31:pop             
			Log.e("CrashlyticsCore", ".     |  | ");
	//   16   32:ldc1            #35  <String "CrashlyticsCore">
	//   17   34:ldc1            #45  <String ".     |  | ">
	//   18   36:invokestatic    #43  <Method int Log.e(String, String)>
	//   19   39:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   20   40:ldc1            #35  <String "CrashlyticsCore">
	//   21   42:ldc1            #47  <String ".     |  |">
	//   22   44:invokestatic    #43  <Method int Log.e(String, String)>
	//   23   47:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   24   48:ldc1            #35  <String "CrashlyticsCore">
	//   25   50:ldc1            #47  <String ".     |  |">
	//   26   52:invokestatic    #43  <Method int Log.e(String, String)>
	//   27   55:pop             
			Log.e("CrashlyticsCore", ".   \\ |  | /");
	//   28   56:ldc1            #35  <String "CrashlyticsCore">
	//   29   58:ldc1            #49  <String ".   \\ |  | /">
	//   30   60:invokestatic    #43  <Method int Log.e(String, String)>
	//   31   63:pop             
			Log.e("CrashlyticsCore", ".    \\    /");
	//   32   64:ldc1            #35  <String "CrashlyticsCore">
	//   33   66:ldc1            #51  <String ".    \\    /">
	//   34   68:invokestatic    #43  <Method int Log.e(String, String)>
	//   35   71:pop             
			Log.e("CrashlyticsCore", ".     \\  /");
	//   36   72:ldc1            #35  <String "CrashlyticsCore">
	//   37   74:ldc1            #53  <String ".     \\  /">
	//   38   76:invokestatic    #43  <Method int Log.e(String, String)>
	//   39   79:pop             
			Log.e("CrashlyticsCore", ".      \\/");
	//   40   80:ldc1            #35  <String "CrashlyticsCore">
	//   41   82:ldc1            #55  <String ".      \\/">
	//   42   84:invokestatic    #43  <Method int Log.e(String, String)>
	//   43   87:pop             
			Log.e("CrashlyticsCore", ".");
	//   44   88:ldc1            #35  <String "CrashlyticsCore">
	//   45   90:ldc1            #37  <String ".">
	//   46   92:invokestatic    #43  <Method int Log.e(String, String)>
	//   47   95:pop             
			Log.e("CrashlyticsCore", s);
	//   48   96:ldc1            #35  <String "CrashlyticsCore">
	//   49   98:aload_1         
	//   50   99:invokestatic    #43  <Method int Log.e(String, String)>
	//   51  102:pop             
			Log.e("CrashlyticsCore", ".");
	//   52  103:ldc1            #35  <String "CrashlyticsCore">
	//   53  105:ldc1            #37  <String ".">
	//   54  107:invokestatic    #43  <Method int Log.e(String, String)>
	//   55  110:pop             
			Log.e("CrashlyticsCore", ".      /\\");
	//   56  111:ldc1            #35  <String "CrashlyticsCore">
	//   57  113:ldc1            #57  <String ".      /\\">
	//   58  115:invokestatic    #43  <Method int Log.e(String, String)>
	//   59  118:pop             
			Log.e("CrashlyticsCore", ".     /  \\");
	//   60  119:ldc1            #35  <String "CrashlyticsCore">
	//   61  121:ldc1            #59  <String ".     /  \\">
	//   62  123:invokestatic    #43  <Method int Log.e(String, String)>
	//   63  126:pop             
			Log.e("CrashlyticsCore", ".    /    \\");
	//   64  127:ldc1            #35  <String "CrashlyticsCore">
	//   65  129:ldc1            #61  <String ".    /    \\">
	//   66  131:invokestatic    #43  <Method int Log.e(String, String)>
	//   67  134:pop             
			Log.e("CrashlyticsCore", ".   / |  | \\");
	//   68  135:ldc1            #35  <String "CrashlyticsCore">
	//   69  137:ldc1            #63  <String ".   / |  | \\">
	//   70  139:invokestatic    #43  <Method int Log.e(String, String)>
	//   71  142:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   72  143:ldc1            #35  <String "CrashlyticsCore">
	//   73  145:ldc1            #47  <String ".     |  |">
	//   74  147:invokestatic    #43  <Method int Log.e(String, String)>
	//   75  150:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   76  151:ldc1            #35  <String "CrashlyticsCore">
	//   77  153:ldc1            #47  <String ".     |  |">
	//   78  155:invokestatic    #43  <Method int Log.e(String, String)>
	//   79  158:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   80  159:ldc1            #35  <String "CrashlyticsCore">
	//   81  161:ldc1            #47  <String ".     |  |">
	//   82  163:invokestatic    #43  <Method int Log.e(String, String)>
	//   83  166:pop             
			Log.e("CrashlyticsCore", ".");
	//   84  167:ldc1            #35  <String "CrashlyticsCore">
	//   85  169:ldc1            #37  <String ".">
	//   86  171:invokestatic    #43  <Method int Log.e(String, String)>
	//   87  174:pop             
			throw new CrashlyticsMissingDependencyException(s);
	//   88  175:new             #65  <Class CrashlyticsMissingDependencyException>
	//   89  178:dup             
	//   90  179:aload_1         
	//   91  180:invokespecial   #68  <Method void CrashlyticsMissingDependencyException(String)>
	//   92  183:athrow          
		}
		if(!requiringBuildId)
	//*  93  184:aload_0         
	//*  94  185:getfield        #20  <Field boolean requiringBuildId>
	//*  95  188:ifne            203
			Fabric.getLogger().d("CrashlyticsCore", "Configured not to require a build ID.");
	//   96  191:invokestatic    #74  <Method Logger Fabric.getLogger()>
	//   97  194:ldc1            #35  <String "CrashlyticsCore">
	//   98  196:ldc1            #76  <String "Configured not to require a build ID.">
	//   99  198:invokeinterface #81  <Method void Logger.d(String, String)>
	//  100  203:return          
	}

	private static final String MESSAGE = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
	private final String buildId;
	private final boolean requiringBuildId;
}
