// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			ShareCompat

public static class ShareCompat$IntentReader
{

	public static ShareCompat$IntentReader from(Activity activity)
	{
		return new ShareCompat$IntentReader(activity);
	//    0    0:new             #2   <Class ShareCompat$IntentReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #52  <Method void ShareCompat$IntentReader(Activity)>
	//    4    8:areturn         
	}

	public ComponentName getCallingActivity()
	{
		return mCallingActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ComponentName mCallingActivity>
	//    2    4:areturn         
	}

	public Drawable getCallingActivityIcon()
	{
		if(mCallingActivity == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field ComponentName mCallingActivity>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Object obj = ((Object) (mActivity.getPackageManager()));
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field Activity mActivity>
	//    7   13:invokevirtual   #61  <Method PackageManager Activity.getPackageManager()>
	//    8   16:astore_1        
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getActivityIcon(mCallingActivity)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field ComponentName mCallingActivity>
	//   12   22:invokevirtual   #67  <Method Drawable PackageManager.getActivityIcon(ComponentName)>
	//   13   25:astore_1        
		}
	//*  14   26:aload_1         
	//*  15   27:areturn         
		catch(android.content.pm.ndException ndexception)
	//*  16   28:astore_1        
		{
			Log.e("IntentReader", "Could not retrieve icon for calling activity", ((Throwable) (ndexception)));
	//   17   29:ldc1            #10  <String "IntentReader">
	//   18   31:ldc1            #69  <String "Could not retrieve icon for calling activity">
	//   19   33:aload_1         
	//   20   34:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
	//   21   37:pop             
			return null;
	//   22   38:aconst_null     
	//   23   39:areturn         
		}
		return ((Drawable) (obj));
	}

	public Drawable getCallingApplicationIcon()
	{
		if(mCallingPackage == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field String mCallingPackage>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Object obj = ((Object) (mActivity.getPackageManager()));
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field Activity mActivity>
	//    7   13:invokevirtual   #61  <Method PackageManager Activity.getPackageManager()>
	//    8   16:astore_1        
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getApplicationIcon(mCallingPackage)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #41  <Field String mCallingPackage>
	//   12   22:invokevirtual   #80  <Method Drawable PackageManager.getApplicationIcon(String)>
	//   13   25:astore_1        
		}
	//*  14   26:aload_1         
	//*  15   27:areturn         
		catch(android.content.pm.ndException ndexception)
	//*  16   28:astore_1        
		{
			Log.e("IntentReader", "Could not retrieve icon for calling application", ((Throwable) (ndexception)));
	//   17   29:ldc1            #10  <String "IntentReader">
	//   18   31:ldc1            #82  <String "Could not retrieve icon for calling application">
	//   19   33:aload_1         
	//   20   34:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
	//   21   37:pop             
			return null;
	//   22   38:aconst_null     
	//   23   39:areturn         
		}
		return ((Drawable) (obj));
	}

	public CharSequence getCallingApplicationLabel()
	{
		if(mCallingPackage == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field String mCallingPackage>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Object obj = ((Object) (mActivity.getPackageManager()));
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field Activity mActivity>
	//    7   13:invokevirtual   #61  <Method PackageManager Activity.getPackageManager()>
	//    8   16:astore_1        
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(mCallingPackage, 0))));
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #41  <Field String mCallingPackage>
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #88  <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   15   27:invokevirtual   #92  <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
	//   16   30:astore_1        
		}
	//*  17   31:aload_1         
	//*  18   32:areturn         
		catch(android.content.pm.ndException ndexception)
	//*  19   33:astore_1        
		{
			Log.e("IntentReader", "Could not retrieve label for calling application", ((Throwable) (ndexception)));
	//   20   34:ldc1            #10  <String "IntentReader">
	//   21   36:ldc1            #94  <String "Could not retrieve label for calling application">
	//   22   38:aload_1         
	//   23   39:invokestatic    #75  <Method int Log.e(String, String, Throwable)>
	//   24   42:pop             
			return null;
	//   25   43:aconst_null     
	//   26   44:areturn         
		}
		return ((CharSequence) (obj));
	}

	public String getCallingPackage()
	{
		return mCallingPackage;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String mCallingPackage>
	//    2    4:areturn         
	}

	public String[] getEmailBcc()
	{
		return mIntent.getStringArrayExtra("android.intent.extra.BCC");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #99  <String "android.intent.extra.BCC">
	//    3    6:invokevirtual   #105 <Method String[] Intent.getStringArrayExtra(String)>
	//    4    9:areturn         
	}

	public String[] getEmailCc()
	{
		return mIntent.getStringArrayExtra("android.intent.extra.CC");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #108 <String "android.intent.extra.CC">
	//    3    6:invokevirtual   #105 <Method String[] Intent.getStringArrayExtra(String)>
	//    4    9:areturn         
	}

	public String[] getEmailTo()
	{
		return mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #111 <String "android.intent.extra.EMAIL">
	//    3    6:invokevirtual   #105 <Method String[] Intent.getStringArrayExtra(String)>
	//    4    9:areturn         
	}

	public String getHtmlText()
	{
		String s1 = mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #114 <String "android.intent.extra.HTML_TEXT">
	//    3    6:invokevirtual   #118 <Method String Intent.getStringExtra(String)>
	//    4    9:astore_2        
		String s = s1;
	//    5   10:aload_2         
	//    6   11:astore_1        
		if(s1 == null)
	//*   7   12:aload_2         
	//*   8   13:ifnonnull       52
		{
			CharSequence charsequence = getText();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #121 <Method CharSequence getText()>
	//   11   20:astore_3        
			if(charsequence instanceof Spanned)
	//*  12   21:aload_3         
	//*  13   22:instanceof      #123 <Class Spanned>
	//*  14   25:ifeq            36
				return Html.toHtml((Spanned)charsequence);
	//   15   28:aload_3         
	//   16   29:checkcast       #123 <Class Spanned>
	//   17   32:invokestatic    #129 <Method String Html.toHtml(Spanned)>
	//   18   35:areturn         
			s = s1;
	//   19   36:aload_2         
	//   20   37:astore_1        
			if(charsequence != null)
	//*  21   38:aload_3         
	//*  22   39:ifnull          52
				s = ShareCompat.IMPL.escapeHtml(charsequence);
	//   23   42:getstatic       #133 <Field ShareCompat$ShareCompatImpl ShareCompat.IMPL>
	//   24   45:aload_3         
	//   25   46:invokeinterface #139 <Method String ShareCompat$ShareCompatImpl.escapeHtml(CharSequence)>
	//   26   51:astore_1        
		}
		return s;
	//   27   52:aload_1         
	//   28   53:areturn         
	}

	public Uri getStream()
	{
		return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #143 <String "android.intent.extra.STREAM">
	//    3    6:invokevirtual   #147 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    4    9:checkcast       #149 <Class Uri>
	//    5   12:areturn         
	}

	public Uri getStream(int i)
	{
		if(mStreams == null && isMultipleShare())
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field ArrayList mStreams>
	//*   2    4:ifnonnull       27
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #156 <Method boolean isMultipleShare()>
	//*   5   11:ifeq            27
			mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field Intent mIntent>
	//    9   19:ldc1            #143 <String "android.intent.extra.STREAM">
	//   10   21:invokevirtual   #160 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
	//   11   24:putfield        #152 <Field ArrayList mStreams>
		if(mStreams != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #152 <Field ArrayList mStreams>
	//*  14   31:ifnull          46
			return (Uri)mStreams.get(i);
	//   15   34:aload_0         
	//   16   35:getfield        #152 <Field ArrayList mStreams>
	//   17   38:iload_1         
	//   18   39:invokevirtual   #166 <Method Object ArrayList.get(int)>
	//   19   42:checkcast       #149 <Class Uri>
	//   20   45:areturn         
		if(i == 0)
	//*  21   46:iload_1         
	//*  22   47:ifne            63
			return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
	//   23   50:aload_0         
	//   24   51:getfield        #35  <Field Intent mIntent>
	//   25   54:ldc1            #143 <String "android.intent.extra.STREAM">
	//   26   56:invokevirtual   #147 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   27   59:checkcast       #149 <Class Uri>
	//   28   62:areturn         
		else
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Stream items available: ").append(getStreamCount()).append(" index requested: ").append(i).toString());
	//   29   63:new             #168 <Class IndexOutOfBoundsException>
	//   30   66:dup             
	//   31   67:new             #170 <Class StringBuilder>
	//   32   70:dup             
	//   33   71:invokespecial   #171 <Method void StringBuilder()>
	//   34   74:ldc1            #173 <String "Stream items available: ">
	//   35   76:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   36   79:aload_0         
	//   37   80:invokevirtual   #181 <Method int getStreamCount()>
	//   38   83:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
	//   39   86:ldc1            #186 <String " index requested: ">
	//   40   88:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   41   91:iload_1         
	//   42   92:invokevirtual   #184 <Method StringBuilder StringBuilder.append(int)>
	//   43   95:invokevirtual   #189 <Method String StringBuilder.toString()>
	//   44   98:invokespecial   #192 <Method void IndexOutOfBoundsException(String)>
	//   45  101:athrow          
	}

	public int getStreamCount()
	{
		if(mStreams == null && isMultipleShare())
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field ArrayList mStreams>
	//*   2    4:ifnonnull       27
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #156 <Method boolean isMultipleShare()>
	//*   5   11:ifeq            27
			mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field Intent mIntent>
	//    9   19:ldc1            #143 <String "android.intent.extra.STREAM">
	//   10   21:invokevirtual   #160 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
	//   11   24:putfield        #152 <Field ArrayList mStreams>
		if(mStreams != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #152 <Field ArrayList mStreams>
	//*  14   31:ifnull          42
			return mStreams.size();
	//   15   34:aload_0         
	//   16   35:getfield        #152 <Field ArrayList mStreams>
	//   17   38:invokevirtual   #195 <Method int ArrayList.size()>
	//   18   41:ireturn         
		return !mIntent.hasExtra("android.intent.extra.STREAM") ? 0 : 1;
	//   19   42:aload_0         
	//   20   43:getfield        #35  <Field Intent mIntent>
	//   21   46:ldc1            #143 <String "android.intent.extra.STREAM">
	//   22   48:invokevirtual   #199 <Method boolean Intent.hasExtra(String)>
	//   23   51:ifeq            56
	//   24   54:iconst_1        
	//   25   55:ireturn         
	//   26   56:iconst_0        
	//   27   57:ireturn         
	}

	public String getSubject()
	{
		return mIntent.getStringExtra("android.intent.extra.SUBJECT");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #202 <String "android.intent.extra.SUBJECT">
	//    3    6:invokevirtual   #118 <Method String Intent.getStringExtra(String)>
	//    4    9:areturn         
	}

	public CharSequence getText()
	{
		return mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #204 <String "android.intent.extra.TEXT">
	//    3    6:invokevirtual   #208 <Method CharSequence Intent.getCharSequenceExtra(String)>
	//    4    9:areturn         
	}

	public String getType()
	{
		return mIntent.getType();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:invokevirtual   #211 <Method String Intent.getType()>
	//    3    7:areturn         
	}

	public boolean isMultipleShare()
	{
		return "android.intent.action.SEND_MULTIPLE".equals(((Object) (mIntent.getAction())));
	//    0    0:ldc1            #213 <String "android.intent.action.SEND_MULTIPLE">
	//    1    2:aload_0         
	//    2    3:getfield        #35  <Field Intent mIntent>
	//    3    6:invokevirtual   #216 <Method String Intent.getAction()>
	//    4    9:invokevirtual   #222 <Method boolean String.equals(Object)>
	//    5   12:ireturn         
	}

	public boolean isShareIntent()
	{
		String s = mIntent.getAction();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:invokevirtual   #216 <Method String Intent.getAction()>
	//    3    7:astore_1        
		return "android.intent.action.SEND".equals(((Object) (s))) || "android.intent.action.SEND_MULTIPLE".equals(((Object) (s)));
	//    4    8:ldc1            #225 <String "android.intent.action.SEND">
	//    5   10:aload_1         
	//    6   11:invokevirtual   #222 <Method boolean String.equals(Object)>
	//    7   14:ifne            26
	//    8   17:ldc1            #213 <String "android.intent.action.SEND_MULTIPLE">
	//    9   19:aload_1         
	//   10   20:invokevirtual   #222 <Method boolean String.equals(Object)>
	//   11   23:ifeq            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	public boolean isSingleShare()
	{
		return "android.intent.action.SEND".equals(((Object) (mIntent.getAction())));
	//    0    0:ldc1            #225 <String "android.intent.action.SEND">
	//    1    2:aload_0         
	//    2    3:getfield        #35  <Field Intent mIntent>
	//    3    6:invokevirtual   #216 <Method String Intent.getAction()>
	//    4    9:invokevirtual   #222 <Method boolean String.equals(Object)>
	//    5   12:ireturn         
	}

	private static final String TAG = "IntentReader";
	private Activity mActivity;
	private ComponentName mCallingActivity;
	private String mCallingPackage;
	private Intent mIntent;
	private ArrayList mStreams;

	private ShareCompat$IntentReader(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Activity mActivity>
		mIntent = activity.getIntent();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #33  <Method Intent Activity.getIntent()>
	//    8   14:putfield        #35  <Field Intent mIntent>
		mCallingPackage = ShareCompat.getCallingPackage(activity);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokestatic    #39  <Method String ShareCompat.getCallingPackage(Activity)>
	//   12   22:putfield        #41  <Field String mCallingPackage>
		mCallingActivity = ShareCompat.getCallingActivity(activity);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokestatic    #45  <Method ComponentName ShareCompat.getCallingActivity(Activity)>
	//   16   30:putfield        #47  <Field ComponentName mCallingActivity>
	//   17   33:return          
	}
}
