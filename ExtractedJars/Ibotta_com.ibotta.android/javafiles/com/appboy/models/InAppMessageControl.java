// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import bo.app.bt;
import bo.app.ci;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			InAppMessageBase

public class InAppMessageControl extends InAppMessageBase
{

	public InAppMessageControl(JSONObject jsonobject, bt bt1)
	{
		super(jsonobject, bt1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #10  <Method void InAppMessageBase(JSONObject, bt)>
		j = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #12  <Field boolean j>
	//    7   11:return          
	}

	public boolean logImpression()
	{
		if(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field boolean j>
	//*   2    4:ifeq            18
		{
			AppboyLogger.i(a, "Control impression already logged for this in-app message. Ignoring.");
	//    3    7:getstatic       #21  <Field String a>
	//    4   10:ldc1            #23  <String "Control impression already logged for this in-app message. Ignoring.">
	//    5   12:invokestatic    #29  <Method int AppboyLogger.i(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(StringUtils.isNullOrEmpty(d))
	//*   9   18:aload_0         
	//*  10   19:getfield        #32  <Field String d>
	//*  11   22:invokestatic    #38  <Method boolean StringUtils.isNullOrEmpty(String)>
	//*  12   25:ifeq            39
		{
			AppboyLogger.w(a, "Trigger Id not found. Not logging in-app message control impression.");
	//   13   28:getstatic       #21  <Field String a>
	//   14   31:ldc1            #40  <String "Trigger Id not found. Not logging in-app message control impression.">
	//   15   33:invokestatic    #43  <Method int AppboyLogger.w(String, String)>
	//   16   36:pop             
			return false;
	//   17   37:iconst_0        
	//   18   38:ireturn         
		}
		if(i == null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #46  <Field bt i>
	//*  21   43:ifnonnull       57
		{
			AppboyLogger.e(a, "Cannot log an in-app message control impression because the AppboyManager is null.");
	//   22   46:getstatic       #21  <Field String a>
	//   23   49:ldc1            #48  <String "Cannot log an in-app message control impression because the AppboyManager is null.">
	//   24   51:invokestatic    #51  <Method int AppboyLogger.e(String, String)>
	//   25   54:pop             
			return false;
	//   26   55:iconst_0        
	//   27   56:ireturn         
		}
		try
		{
			AppboyLogger.v(a, "Logging control in-app message impression event");
	//   28   57:getstatic       #21  <Field String a>
	//   29   60:ldc1            #53  <String "Logging control in-app message impression event">
	//   30   62:invokestatic    #56  <Method int AppboyLogger.v(String, String)>
	//   31   65:pop             
			ci ci1 = ci.a(b, c, d);
	//   32   66:aload_0         
	//   33   67:getfield        #59  <Field String b>
	//   34   70:aload_0         
	//   35   71:getfield        #62  <Field String c>
	//   36   74:aload_0         
	//   37   75:getfield        #32  <Field String d>
	//   38   78:invokestatic    #67  <Method ci ci.a(String, String, String)>
	//   39   81:astore_1        
			i.a(((bo.app.cc) (ci1)));
	//   40   82:aload_0         
	//   41   83:getfield        #46  <Field bt i>
	//   42   86:aload_1         
	//   43   87:invokeinterface #72  <Method boolean bt.a(bo.app.cc)>
	//   44   92:pop             
			j = true;
	//   45   93:aload_0         
	//   46   94:iconst_1        
	//   47   95:putfield        #12  <Field boolean j>
		}
	//*  48   98:iconst_1        
	//*  49   99:ireturn         
		catch(JSONException jsonexception)
	//*  50  100:astore_1        
		{
			i.a(((Throwable) (jsonexception)));
	//   51  101:aload_0         
	//   52  102:getfield        #46  <Field bt i>
	//   53  105:aload_1         
	//   54  106:invokeinterface #75  <Method void bt.a(Throwable)>
			return false;
	//   55  111:iconst_0        
	//   56  112:ireturn         
		}
		return true;
	}

	private boolean j;
}
