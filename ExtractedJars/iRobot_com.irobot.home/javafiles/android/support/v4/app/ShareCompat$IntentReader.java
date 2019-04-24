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
		for(; i < j; i++)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpge          194
		{
			char c = charsequence.charAt(i);
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//    6   12:istore          4
			Object obj;
			if(c == '<')
	//*   7   14:iload           4
	//*   8   16:bipush          60
	//*   9   18:icmpne          35
				obj = "&lt;";
	//   10   21:ldc1            #62  <String "&lt;">
	//   11   23:astore          6
			else
	//*  12   25:aload_0         
	//*  13   26:aload           6
	//*  14   28:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//*  15   31:pop             
	//*  16   32:goto            187
			if(c == '>')
	//*  17   35:iload           4
	//*  18   37:bipush          62
	//*  19   39:icmpne          49
				obj = "&gt;";
	//   20   42:ldc1            #70  <String "&gt;">
	//   21   44:astore          6
			else
	//*  22   46:goto            25
			if(c == '&')
	//*  23   49:iload           4
	//*  24   51:bipush          38
	//*  25   53:icmpne          63
			{
				obj = "&amp;";
	//   26   56:ldc1            #72  <String "&amp;">
	//   27   58:astore          6
			} else
	//*  28   60:goto            25
			{
				if(c <= '~' && c >= ' ')
	//*  29   63:iload           4
	//*  30   65:bipush          126
	//*  31   67:icmpgt          144
	//*  32   70:iload           4
	//*  33   72:bipush          32
	//*  34   74:icmpge          80
	//*  35   77:goto            144
				{
					if(c == ' ')
	//*  36   80:iload           4
	//*  37   82:bipush          32
	//*  38   84:icmpne          134
					{
						do
						{
							int k = i + 1;
	//   39   87:iload_2         
	//   40   88:iconst_1        
	//   41   89:iadd            
	//   42   90:istore          5
							if(k >= j || charsequence.charAt(k) != ' ')
								break;
	//   43   92:iload           5
	//   44   94:iload_3         
	//   45   95:icmpge          124
	//   46   98:aload_1         
	//   47   99:iload           5
	//   48  101:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   49  106:bipush          32
	//   50  108:icmpne          124
							stringbuilder.append("&nbsp;");
	//   51  111:aload_0         
	//   52  112:ldc1            #74  <String "&nbsp;">
	//   53  114:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   54  117:pop             
							i = k;
	//   55  118:iload           5
	//   56  120:istore_2        
						} while(true);
	//   57  121:goto            87
						stringbuilder.append(' ');
	//   58  124:aload_0         
	//   59  125:bipush          32
	//   60  127:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   61  130:pop             
					} else
	//*  62  131:goto            187
					{
						stringbuilder.append(c);
	//   63  134:aload_0         
	//   64  135:iload           4
	//   65  137:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   66  140:pop             
					}
					continue;
	//   67  141:goto            187
				}
				obj = ((Object) (new StringBuilder()));
	//   68  144:new             #64  <Class StringBuilder>
	//   69  147:dup             
	//   70  148:invokespecial   #78  <Method void StringBuilder()>
	//   71  151:astore          6
				((StringBuilder) (obj)).append("&#");
	//   72  153:aload           6
	//   73  155:ldc1            #80  <String "&#">
	//   74  157:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   75  160:pop             
				((StringBuilder) (obj)).append(((int) (c)));
	//   76  161:aload           6
	//   77  163:iload           4
	//   78  165:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   79  168:pop             
				((StringBuilder) (obj)).append(";");
	//   80  169:aload           6
	//   81  171:ldc1            #85  <String ";">
	//   82  173:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   83  176:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   84  177:aload           6
	//   85  179:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   86  182:astore          6
			}
			stringbuilder.append(((String) (obj)));
		}

	//   87  184:goto            25
	//   88  187:iload_2         
	//   89  188:iconst_1        
	//   90  189:iadd            
	//   91  190:istore_2        
	//*  92  191:goto            0
	//   93  194:return          
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
		String s = mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Intent mIntent>
	//    2    4:ldc1            #150 <String "android.intent.extra.HTML_TEXT">
	//    3    6:invokevirtual   #154 <Method String Intent.getStringExtra(String)>
	//    4    9:astore_2        
		Object obj = ((Object) (s));
	//    5   10:aload_2         
	//    6   11:astore_1        
		if(s == null)
	//*   7   12:aload_2         
	//*   8   13:ifnonnull       80
		{
			CharSequence charsequence = getText();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #157 <Method CharSequence getText()>
	//   11   20:astore_3        
			if(charsequence instanceof Spanned)
	//*  12   21:aload_3         
	//*  13   22:instanceof      #159 <Class Spanned>
	//*  14   25:ifeq            36
				return Html.toHtml((Spanned)charsequence);
	//   15   28:aload_3         
	//   16   29:checkcast       #159 <Class Spanned>
	//   17   32:invokestatic    #165 <Method String Html.toHtml(Spanned)>
	//   18   35:areturn         
			obj = ((Object) (s));
	//   19   36:aload_2         
	//   20   37:astore_1        
			if(charsequence != null)
	//*  21   38:aload_3         
	//*  22   39:ifnull          80
			{
				if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  23   42:getstatic       #171 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   45:bipush          16
	//*  25   47:icmplt          55
					return Html.escapeHtml(charsequence);
	//   26   50:aload_3         
	//   27   51:invokestatic    #175 <Method String Html.escapeHtml(CharSequence)>
	//   28   54:areturn         
				obj = ((Object) (new StringBuilder()));
	//   29   55:new             #64  <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #78  <Method void StringBuilder()>
	//   32   62:astore_1        
				withinStyle(((StringBuilder) (obj)), charsequence, 0, charsequence.length());
	//   33   63:aload_1         
	//   34   64:aload_3         
	//   35   65:iconst_0        
	//   36   66:aload_3         
	//   37   67:invokeinterface #179 <Method int CharSequence.length()>
	//   38   72:invokestatic    #181 <Method void withinStyle(StringBuilder, CharSequence, int, int)>
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   39   75:aload_1         
	//   40   76:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   41   79:astore_1        
			}
		}
		return ((String) (obj));
	//   42   80:aload_1         
	//   43   81:areturn         
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
		Object obj;
		if(mStreams != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #194 <Field ArrayList mStreams>
	//*  14   31:ifnull          48
			obj = mStreams.get(i);
	//   15   34:aload_0         
	//   16   35:getfield        #194 <Field ArrayList mStreams>
	//   17   38:iload_1         
	//   18   39:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   19   42:astore_2        
		else
	//*  20   43:aload_2         
	//*  21   44:checkcast       #191 <Class Uri>
	//*  22   47:areturn         
		if(i == 0)
	//*  23   48:iload_1         
	//*  24   49:ifne            65
		{
			obj = ((Object) (mIntent.getParcelableExtra("android.intent.extra.STREAM")));
	//   25   52:aload_0         
	//   26   53:getfield        #35  <Field Intent mIntent>
	//   27   56:ldc1            #185 <String "android.intent.extra.STREAM">
	//   28   58:invokevirtual   #189 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   29   61:astore_2        
		} else
	//*  30   62:goto            43
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   31   65:new             #64  <Class StringBuilder>
	//   32   68:dup             
	//   33   69:invokespecial   #78  <Method void StringBuilder()>
	//   34   72:astore_2        
			stringbuilder.append("Stream items available: ");
	//   35   73:aload_2         
	//   36   74:ldc1            #210 <String "Stream items available: ">
	//   37   76:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
			stringbuilder.append(getStreamCount());
	//   39   80:aload_2         
	//   40   81:aload_0         
	//   41   82:invokevirtual   #213 <Method int getStreamCount()>
	//   42   85:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   43   88:pop             
			stringbuilder.append(" index requested: ");
	//   44   89:aload_2         
	//   45   90:ldc1            #215 <String " index requested: ">
	//   46   92:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   47   95:pop             
			stringbuilder.append(i);
	//   48   96:aload_2         
	//   49   97:iload_1         
	//   50   98:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   51  101:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   52  102:new             #217 <Class IndexOutOfBoundsException>
	//   53  105:dup             
	//   54  106:aload_2         
	//   55  107:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   56  110:invokespecial   #220 <Method void IndexOutOfBoundsException(String)>
	//   57  113:athrow          
		}
		return (Uri)obj;
	}

	public int getStreamCount()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #222 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #224 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #227 <Method void Runtime(String)>
	//    4    9:athrow          
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
	//    7   14:ifne            31
	//    8   17:ldc1            #241 <String "android.intent.action.SEND_MULTIPLE">
	//    9   19:aload_1         
	//   10   20:invokevirtual   #250 <Method boolean String.equals(Object)>
	//   11   23:ifeq            29
	//   12   26:goto            31
	//   13   29:iconst_0        
	//   14   30:ireturn         
	//   15   31:iconst_1        
	//   16   32:ireturn         
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
