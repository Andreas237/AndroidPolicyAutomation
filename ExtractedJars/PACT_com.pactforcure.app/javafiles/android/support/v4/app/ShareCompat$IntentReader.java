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

	private static void withinStyle(StringBuilder stringbuilder, CharSequence charsequence, int i, int j)
	{
		while(i < j) 
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          178
		{
			char c = charsequence.charAt(i);
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//    6   12:istore          4
			if(c == '<')
	//*   7   14:iload           4
	//*   8   16:bipush          60
	//*   9   18:icmpne          35
				stringbuilder.append("&lt;");
	//   10   21:aload_0         
	//   11   22:ldc1            #62  <String "&lt;">
	//   12   24:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			else
	//*  14   28:iload_2         
	//*  15   29:iconst_1        
	//*  16   30:iadd            
	//*  17   31:istore_2        
	//*  18   32:goto            0
			if(c == '>')
	//*  19   35:iload           4
	//*  20   37:bipush          62
	//*  21   39:icmpne          52
				stringbuilder.append("&gt;");
	//   22   42:aload_0         
	//   23   43:ldc1            #70  <String "&gt;">
	//   24   45:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
			else
	//*  26   49:goto            28
			if(c == '&')
	//*  27   52:iload           4
	//*  28   54:bipush          38
	//*  29   56:icmpne          69
				stringbuilder.append("&amp;");
	//   30   59:aload_0         
	//   31   60:ldc1            #72  <String "&amp;">
	//   32   62:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
			else
	//*  34   66:goto            28
			if(c > '~' || c < ' ')
	//*  35   69:iload           4
	//*  36   71:bipush          126
	//*  37   73:icmpgt          83
	//*  38   76:iload           4
	//*  39   78:bipush          32
	//*  40   80:icmpge          116
				stringbuilder.append((new StringBuilder()).append("&#").append(((int) (c))).append(";").toString());
	//   41   83:aload_0         
	//   42   84:new             #64  <Class StringBuilder>
	//   43   87:dup             
	//   44   88:invokespecial   #73  <Method void StringBuilder()>
	//   45   91:ldc1            #75  <String "&#">
	//   46   93:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   47   96:iload           4
	//   48   98:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   49  101:ldc1            #80  <String ";">
	//   50  103:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   51  106:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   52  109:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   53  112:pop             
			else
	//*  54  113:goto            28
			if(c == ' ')
	//*  55  116:iload           4
	//*  56  118:bipush          32
	//*  57  120:icmpne          168
			{
				for(; i + 1 < j && charsequence.charAt(i + 1) == ' '; i++)
	//*  58  123:iload_2         
	//*  59  124:iconst_1        
	//*  60  125:iadd            
	//*  61  126:iload_3         
	//*  62  127:icmpge          158
	//*  63  130:aload_1         
	//*  64  131:iload_2         
	//*  65  132:iconst_1        
	//*  66  133:iadd            
	//*  67  134:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//*  68  139:bipush          32
	//*  69  141:icmpne          158
					stringbuilder.append("&nbsp;");
	//   70  144:aload_0         
	//   71  145:ldc1            #86  <String "&nbsp;">
	//   72  147:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   73  150:pop             

	//   74  151:iload_2         
	//   75  152:iconst_1        
	//   76  153:iadd            
	//   77  154:istore_2        
	//*  78  155:goto            123
				stringbuilder.append(' ');
	//   79  158:aload_0         
	//   80  159:bipush          32
	//   81  161:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   82  164:pop             
			} else
	//*  83  165:goto            28
			{
				stringbuilder.append(c);
	//   84  168:aload_0         
	//   85  169:iload           4
	//   86  171:invokevirtual   #89  <Method StringBuilder StringBuilder.append(char)>
	//   87  174:pop             
			}
			i++;
		}
	//*  88  175:goto            28
	//   89  178:return          
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
	//    7   13:invokevirtual   #98  <Method PackageManager Activity.getPackageManager()>
	//    8   16:astore_1        
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getActivityIcon(mCallingActivity)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field ComponentName mCallingActivity>
	//   12   22:invokevirtual   #104 <Method Drawable PackageManager.getActivityIcon(ComponentName)>
	//   13   25:astore_1        
		}
	//*  14   26:aload_1         
	//*  15   27:areturn         
		catch(android.content.pm.ndException ndexception)
	//*  16   28:astore_1        
		{
			Log.e("IntentReader", "Could not retrieve icon for calling activity", ((Throwable) (ndexception)));
	//   17   29:ldc1            #10  <String "IntentReader">
	//   18   31:ldc1            #106 <String "Could not retrieve icon for calling activity">
	//   19   33:aload_1         
	//   20   34:invokestatic    #112 <Method int Log.e(String, String, Throwable)>
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
	//    7   13:invokevirtual   #98  <Method PackageManager Activity.getPackageManager()>
	//    8   16:astore_1        
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getApplicationIcon(mCallingPackage)));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #41  <Field String mCallingPackage>
	//   12   22:invokevirtual   #117 <Method Drawable PackageManager.getApplicationIcon(String)>
	//   13   25:astore_1        
		}
	//*  14   26:aload_1         
	//*  15   27:areturn         
		catch(android.content.pm.ndException ndexception)
	//*  16   28:astore_1        
		{
			Log.e("IntentReader", "Could not retrieve icon for calling application", ((Throwable) (ndexception)));
	//   17   29:ldc1            #10  <String "IntentReader">
	//   18   31:ldc1            #119 <String "Could not retrieve icon for calling application">
	//   19   33:aload_1         
	//   20   34:invokestatic    #112 <Method int Log.e(String, String, Throwable)>
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
	//    7   13:invokevirtual   #98  <Method PackageManager Activity.getPackageManager()>
	//    8   16:astore_1        
		try
		{
			obj = ((Object) (((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(mCallingPackage, 0))));
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #41  <Field String mCallingPackage>
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #125 <Method android.content.pm.ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   15   27:invokevirtual   #129 <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
	//   16   30:astore_1        
		}
	//*  17   31:aload_1         
	//*  18   32:areturn         
		catch(android.content.pm.ndException ndexception)
	//*  19   33:astore_1        
		{
			Log.e("IntentReader", "Could not retrieve label for calling application", ((Throwable) (ndexception)));
	//   20   34:ldc1            #10  <String "IntentReader">
	//   21   36:ldc1            #131 <String "Could not retrieve label for calling application">
	//   22   38:aload_1         
	//   23   39:invokestatic    #112 <Method int Log.e(String, String, Throwable)>
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
	//    2    4:ldc1            #135 <String "android.intent.extra.BCC">
	//    3    6:invokevirtual   #141 <Method String[] Intent.getStringArrayExtra(String)>
	//    4    9:areturn         
	}

	public String[] getEmailCc()
	{
		return mIntent.getStringArrayExtra("android.intent.extra.CC");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #144 <String "android.intent.extra.CC">
	//    3    6:invokevirtual   #141 <Method String[] Intent.getStringArrayExtra(String)>
	//    4    9:areturn         
	}

	public String[] getEmailTo()
	{
		return mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #147 <String "android.intent.extra.EMAIL">
	//    3    6:invokevirtual   #141 <Method String[] Intent.getStringArrayExtra(String)>
	//    4    9:areturn         
	}

	public String getHtmlText()
	{
		String s1 = mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #150 <String "android.intent.extra.HTML_TEXT">
	//    3    6:invokevirtual   #154 <Method String Intent.getStringExtra(String)>
	//    4    9:astore_2        
		String s = s1;
	//    5   10:aload_2         
	//    6   11:astore_1        
		if(s1 == null)
	//*   7   12:aload_2         
	//*   8   13:ifnonnull       36
		{
			CharSequence charsequence = getText();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #157 <Method CharSequence getText()>
	//   11   20:astore_3        
			if(charsequence instanceof Spanned)
	//*  12   21:aload_3         
	//*  13   22:instanceof      #159 <Class Spanned>
	//*  14   25:ifeq            38
			{
				s = Html.toHtml((Spanned)charsequence);
	//   15   28:aload_3         
	//   16   29:checkcast       #159 <Class Spanned>
	//   17   32:invokestatic    #165 <Method String Html.toHtml(Spanned)>
	//   18   35:astore_1        
			} else
	//*  19   36:aload_1         
	//*  20   37:areturn         
			{
				s = s1;
	//   21   38:aload_2         
	//   22   39:astore_1        
				if(charsequence != null)
	//*  23   40:aload_3         
	//*  24   41:ifnull          36
					if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  25   44:getstatic       #171 <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   47:bipush          16
	//*  27   49:icmplt          57
					{
						return Html.escapeHtml(charsequence);
	//   28   52:aload_3         
	//   29   53:invokestatic    #175 <Method String Html.escapeHtml(CharSequence)>
	//   30   56:areturn         
					} else
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   31   57:new             #64  <Class StringBuilder>
	//   32   60:dup             
	//   33   61:invokespecial   #73  <Method void StringBuilder()>
	//   34   64:astore_1        
						withinStyle(stringbuilder, charsequence, 0, charsequence.length());
	//   35   65:aload_1         
	//   36   66:aload_3         
	//   37   67:iconst_0        
	//   38   68:aload_3         
	//   39   69:invokeinterface #179 <Method int CharSequence.length()>
	//   40   74:invokestatic    #181 <Method void withinStyle(StringBuilder, CharSequence, int, int)>
						return stringbuilder.toString();
	//   41   77:aload_1         
	//   42   78:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   43   81:areturn         
					}
			}
		}
		return s;
	}

	public Uri getStream()
	{
		return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #185 <String "android.intent.extra.STREAM">
	//    3    6:invokevirtual   #189 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//    4    9:checkcast       #191 <Class Uri>
	//    5   12:areturn         
	}

	public Uri getStream(int i)
	{
		if(mStreams == null && isMultipleShare())
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field ArrayList mStreams>
	//*   2    4:ifnonnull       27
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #198 <Method boolean isMultipleShare()>
	//*   5   11:ifeq            27
			mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field Intent mIntent>
	//    9   19:ldc1            #185 <String "android.intent.extra.STREAM">
	//   10   21:invokevirtual   #202 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
	//   11   24:putfield        #194 <Field ArrayList mStreams>
		if(mStreams != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #194 <Field ArrayList mStreams>
	//*  14   31:ifnull          46
			return (Uri)mStreams.get(i);
	//   15   34:aload_0         
	//   16   35:getfield        #194 <Field ArrayList mStreams>
	//   17   38:iload_1         
	//   18   39:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   19   42:checkcast       #191 <Class Uri>
	//   20   45:areturn         
		if(i == 0)
	//*  21   46:iload_1         
	//*  22   47:ifne            63
			return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
	//   23   50:aload_0         
	//   24   51:getfield        #35  <Field Intent mIntent>
	//   25   54:ldc1            #185 <String "android.intent.extra.STREAM">
	//   26   56:invokevirtual   #189 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   27   59:checkcast       #191 <Class Uri>
	//   28   62:areturn         
		else
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Stream items available: ").append(getStreamCount()).append(" index requested: ").append(i).toString());
	//   29   63:new             #210 <Class IndexOutOfBoundsException>
	//   30   66:dup             
	//   31   67:new             #64  <Class StringBuilder>
	//   32   70:dup             
	//   33   71:invokespecial   #73  <Method void StringBuilder()>
	//   34   74:ldc1            #212 <String "Stream items available: ">
	//   35   76:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   36   79:aload_0         
	//   37   80:invokevirtual   #215 <Method int getStreamCount()>
	//   38   83:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   39   86:ldc1            #217 <String " index requested: ">
	//   40   88:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   41   91:iload_1         
	//   42   92:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   43   95:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   44   98:invokespecial   #220 <Method void IndexOutOfBoundsException(String)>
	//   45  101:athrow          
	}

	public int getStreamCount()
	{
		if(mStreams == null && isMultipleShare())
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field ArrayList mStreams>
	//*   2    4:ifnonnull       27
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #198 <Method boolean isMultipleShare()>
	//*   5   11:ifeq            27
			mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field Intent mIntent>
	//    9   19:ldc1            #185 <String "android.intent.extra.STREAM">
	//   10   21:invokevirtual   #202 <Method ArrayList Intent.getParcelableArrayListExtra(String)>
	//   11   24:putfield        #194 <Field ArrayList mStreams>
		if(mStreams != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #194 <Field ArrayList mStreams>
	//*  14   31:ifnull          42
			return mStreams.size();
	//   15   34:aload_0         
	//   16   35:getfield        #194 <Field ArrayList mStreams>
	//   17   38:invokevirtual   #223 <Method int ArrayList.size()>
	//   18   41:ireturn         
		return !mIntent.hasExtra("android.intent.extra.STREAM") ? 0 : 1;
	//   19   42:aload_0         
	//   20   43:getfield        #35  <Field Intent mIntent>
	//   21   46:ldc1            #185 <String "android.intent.extra.STREAM">
	//   22   48:invokevirtual   #227 <Method boolean Intent.hasExtra(String)>
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
	//    2    4:ldc1            #230 <String "android.intent.extra.SUBJECT">
	//    3    6:invokevirtual   #154 <Method String Intent.getStringExtra(String)>
	//    4    9:areturn         
	}

	public CharSequence getText()
	{
		return mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #232 <String "android.intent.extra.TEXT">
	//    3    6:invokevirtual   #236 <Method CharSequence Intent.getCharSequenceExtra(String)>
	//    4    9:areturn         
	}

	public String getType()
	{
		return mIntent.getType();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:invokevirtual   #239 <Method String Intent.getType()>
	//    3    7:areturn         
	}

	public boolean isMultipleShare()
	{
		return "android.intent.action.SEND_MULTIPLE".equals(((Object) (mIntent.getAction())));
	//    0    0:ldc1            #241 <String "android.intent.action.SEND_MULTIPLE">
	//    1    2:aload_0         
	//    2    3:getfield        #35  <Field Intent mIntent>
	//    3    6:invokevirtual   #244 <Method String Intent.getAction()>
	//    4    9:invokevirtual   #250 <Method boolean String.equals(Object)>
	//    5   12:ireturn         
	}

	public boolean isShareIntent()
	{
		String s = mIntent.getAction();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:invokevirtual   #244 <Method String Intent.getAction()>
	//    3    7:astore_1        
		return "android.intent.action.SEND".equals(((Object) (s))) || "android.intent.action.SEND_MULTIPLE".equals(((Object) (s)));
	//    4    8:ldc1            #253 <String "android.intent.action.SEND">
	//    5   10:aload_1         
	//    6   11:invokevirtual   #250 <Method boolean String.equals(Object)>
	//    7   14:ifne            26
	//    8   17:ldc1            #241 <String "android.intent.action.SEND_MULTIPLE">
	//    9   19:aload_1         
	//   10   20:invokevirtual   #250 <Method boolean String.equals(Object)>
	//   11   23:ifeq            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	public boolean isSingleShare()
	{
		return "android.intent.action.SEND".equals(((Object) (mIntent.getAction())));
	//    0    0:ldc1            #253 <String "android.intent.action.SEND">
	//    1    2:aload_0         
	//    2    3:getfield        #35  <Field Intent mIntent>
	//    3    6:invokevirtual   #244 <Method String Intent.getAction()>
	//    4    9:invokevirtual   #250 <Method boolean String.equals(Object)>
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
