// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.licensing;

import android.util.Log;
import com.appscend.media.APSMediaPlayer;

// Referenced classes of package com.appscend.licensing:
//			LicenseRetriever

public class LicenseValidator
{

	public LicenseValidator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		licenseValid = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean licenseValid>
		licenseRetrieved = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field boolean licenseRetrieved>
		packageName = "";
	//    8   14:aload_0         
	//    9   15:ldc1            #26  <String "">
	//   10   17:putfield        #28  <Field String packageName>
	//   11   20:return          
	}

	public static LicenseValidator getInstance()
	{
		if(instance == null)
	//*   0    0:getstatic       #32  <Field LicenseValidator instance>
	//*   1    3:ifnonnull       16
			instance = new LicenseValidator();
	//    2    6:new             #2   <Class LicenseValidator>
	//    3    9:dup             
	//    4   10:invokespecial   #33  <Method void LicenseValidator()>
	//    5   13:putstatic       #32  <Field LicenseValidator instance>
		return instance;
	//    6   16:getstatic       #32  <Field LicenseValidator instance>
	//    7   19:areturn         
	}

	public boolean isLicenseRetrieved()
	{
		return licenseRetrieved;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean licenseRetrieved>
	//    2    4:ireturn         
	}

	public boolean isLicenseValid()
	{
		return licenseValid;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean licenseValid>
	//    2    4:ireturn         
	}

	public void setPackageName(String s)
	{
		packageName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String packageName>
	//    3    5:return          
	}

	public void startLicenseRetrieval()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("http://panel.veeso.co:5200/validate?key=identifiers.");
	//    4    8:aload_1         
	//    5    9:ldc1            #10  <String "http://panel.veeso.co:5200/validate?key=identifiers.">
	//    6   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(packageName);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #28  <Field String packageName>
	//   11   20:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   13   24:aload_1         
	//   14   25:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   15   28:astore_1        
		(new LicenseRetriever()).execute(((Object []) (new String[] {
			obj
		})));
	//   16   29:new             #52  <Class LicenseRetriever>
	//   17   32:dup             
	//   18   33:invokespecial   #53  <Method void LicenseRetriever()>
	//   19   36:iconst_1        
	//   20   37:anewarray       String[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:aload_1         
	//   24   43:aastore         
	//   25   44:invokevirtual   #59  <Method android.os.AsyncTask LicenseRetriever.execute(Object[])>
	//   26   47:pop             
	//   27   48:return          
	}

	protected void updateLicenseValidity(boolean flag, boolean flag1)
	{
		licenseRetrieved = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean licenseRetrieved>
		licenseValid = flag1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field boolean licenseValid>
		if(licenseRetrieved && !licenseValid)
	//*   6   10:aload_0         
	//*   7   11:getfield        #24  <Field boolean licenseRetrieved>
	//*   8   14:ifeq            53
	//*   9   17:aload_0         
	//*  10   18:getfield        #22  <Field boolean licenseValid>
	//*  11   21:ifne            53
		{
			Log.e("VastPlayer", "Stopping player instance due to invalid license. To continue check if your Android Package Name is added in the Veeso Dashboard: https://panel.veeso.co/licenses");
	//   12   24:ldc1            #63  <String "VastPlayer">
	//   13   26:ldc1            #65  <String "Stopping player instance due to invalid license. To continue check if your Android Package Name is added in the Veeso Dashboard: https://panel.veeso.co/licenses">
	//   14   28:invokestatic    #71  <Method int Log.e(String, String)>
	//   15   31:pop             
			if(APSMediaPlayer.getInstance().isPlaying())
	//*  16   32:invokestatic    #76  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*  17   35:invokevirtual   #79  <Method boolean APSMediaPlayer.isPlaying()>
	//*  18   38:ifeq            47
				APSMediaPlayer.getInstance().stop();
	//   19   41:invokestatic    #76  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   20   44:invokevirtual   #82  <Method void APSMediaPlayer.stop()>
			APSMediaPlayer.getInstance().finish();
	//   21   47:invokestatic    #76  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   22   50:invokevirtual   #85  <Method void APSMediaPlayer.finish()>
		}
	//   23   53:return          
	}

	private static LicenseValidator instance;
	private static final String validationEndpoint = "http://panel.veeso.co:5200/validate?key=identifiers.";
	private boolean licenseRetrieved;
	private boolean licenseValid;
	private String packageName;

	static 
	{
	//    0    0:return          
	}
}
