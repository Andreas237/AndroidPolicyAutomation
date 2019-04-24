// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import com.startapp.android.publish.adsCommon.k;

public class AdInformationJsInterface
{

	public AdInformationJsInterface(Context context1, Runnable runnable, Runnable runnable1, Runnable runnable2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		context = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #19  <Field Context context>
		processed = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #21  <Field boolean processed>
		declineCallback = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #23  <Field Runnable declineCallback>
		acceptCallback = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #25  <Field Runnable acceptCallback>
		privacyPolicyCallback = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #27  <Field Runnable privacyPolicyCallback>
		context = context1;
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:putfield        #19  <Field Context context>
		acceptCallback = runnable;
	//   20   34:aload_0         
	//   21   35:aload_2         
	//   22   36:putfield        #25  <Field Runnable acceptCallback>
		declineCallback = runnable1;
	//   23   39:aload_0         
	//   24   40:aload_3         
	//   25   41:putfield        #23  <Field Runnable declineCallback>
		privacyPolicyCallback = runnable2;
	//   26   44:aload_0         
	//   27   45:aload           4
	//   28   47:putfield        #27  <Field Runnable privacyPolicyCallback>
	//   29   50:return          
	}

	public void accept()
	{
		if(processed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean processed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			processed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #21  <Field boolean processed>
			acceptCallback.run();
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field Runnable acceptCallback>
	//    9   17:invokeinterface #35  <Method void Runnable.run()>
			return;
	//   10   22:return          
		}
	}

	public void decline()
	{
		if(processed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean processed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			processed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #21  <Field boolean processed>
			declineCallback.run();
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field Runnable declineCallback>
	//    9   17:invokeinterface #35  <Method void Runnable.run()>
			return;
	//   10   22:return          
		}
	}

	public void fullPrivacyPolicy()
	{
		if(processed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean processed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			processed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #21  <Field boolean processed>
			privacyPolicyCallback.run();
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field Runnable privacyPolicyCallback>
	//    9   17:invokeinterface #35  <Method void Runnable.run()>
			return;
	//   10   22:return          
		}
	}

	public String getAppId()
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(context != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #19  <Field Context context>
	//*   4    6:ifnull          38
		{
			long l;
			try
			{
				l = Long.valueOf(Long.parseLong(k.a(context, "shared_prefs_appId", ((String) (null))))).longValue();
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field Context context>
	//    7   13:ldc1            #44  <String "shared_prefs_appId">
	//    8   15:aconst_null     
	//    9   16:invokestatic    #50  <Method String k.a(Context, String, String)>
	//   10   19:invokestatic    #56  <Method long Long.parseLong(String)>
	//   11   22:invokestatic    #60  <Method Long Long.valueOf(long)>
	//   12   25:invokevirtual   #64  <Method long Long.longValue()>
	//   13   28:lstore_1        
			}
	//*  14   29:ldc2w           #65  <Long 0x7398cd9L>
	//*  15   32:lload_1         
	//*  16   33:lxor            
	//*  17   34:invokestatic    #71  <Method String String.valueOf(long)>
	//*  18   37:astore_3        
	//*  19   38:aload_3         
	//*  20   39:areturn         
			catch(Exception exception)
	//*  21   40:astore_3        
			{
				return null;
	//   22   41:aconst_null     
	//   23   42:areturn         
			}
			s = String.valueOf(0x7398cd9L ^ l);
		}
		return s;
	}

	private Runnable acceptCallback;
	private Context context;
	private Runnable declineCallback;
	private Runnable privacyPolicyCallback;
	private boolean processed;
}
