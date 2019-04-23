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
	//*   2    2:icmpge          196
		{
			char c = charsequence.charAt(i);
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//    6   12:istore          4
			if(c == '<')
	//*   7   14:iload           4
	//*   8   16:bipush          60
	//*   9   18:icmpne          31
			{
				stringbuilder.append("&lt;");
	//   10   21:aload_0         
	//   11   22:ldc1            #62  <String "&lt;">
	//   12   24:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
				continue;
	//   14   28:goto            189
			}
			if(c == '>')
	//*  15   31:iload           4
	//*  16   33:bipush          62
	//*  17   35:icmpne          48
			{
				stringbuilder.append("&gt;");
	//   18   38:aload_0         
	//   19   39:ldc1            #70  <String "&gt;">
	//   20   41:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
				continue;
	//   22   45:goto            189
			}
			if(c == '&')
	//*  23   48:iload           4
	//*  24   50:bipush          38
	//*  25   52:icmpne          65
			{
				stringbuilder.append("&amp;");
	//   26   55:aload_0         
	//   27   56:ldc1            #72  <String "&amp;">
	//   28   58:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   29   61:pop             
				continue;
	//   30   62:goto            189
			}
			if(c <= '~' && c >= ' ')
	//*  31   65:iload           4
	//*  32   67:bipush          126
	//*  33   69:icmpgt          146
	//*  34   72:iload           4
	//*  35   74:bipush          32
	//*  36   76:icmpge          82
	//*  37   79:goto            146
			{
				if(c == ' ')
	//*  38   82:iload           4
	//*  39   84:bipush          32
	//*  40   86:icmpne          136
				{
					do
					{
						int k = i + 1;
	//   41   89:iload_2         
	//   42   90:iconst_1        
	//   43   91:iadd            
	//   44   92:istore          5
						if(k >= j || charsequence.charAt(k) != ' ')
							break;
	//   45   94:iload           5
	//   46   96:iload_3         
	//   47   97:icmpge          126
	//   48  100:aload_1         
	//   49  101:iload           5
	//   50  103:invokeinterface #60  <Method char CharSequence.charAt(int)>
	//   51  108:bipush          32
	//   52  110:icmpne          126
						stringbuilder.append("&nbsp;");
	//   53  113:aload_0         
	//   54  114:ldc1            #74  <String "&nbsp;">
	//   55  116:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   56  119:pop             
						i = k;
	//   57  120:iload           5
	//   58  122:istore_2        
					} while(true);
	//   59  123:goto            89
					stringbuilder.append(' ');
	//   60  126:aload_0         
	//   61  127:bipush          32
	//   62  129:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   63  132:pop             
				} else
	//*  64  133:goto            189
				{
					stringbuilder.append(c);
	//   65  136:aload_0         
	//   66  137:iload           4
	//   67  139:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   68  142:pop             
				}
			} else
	//*  69  143:goto            189
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   70  146:new             #64  <Class StringBuilder>
	//   71  149:dup             
	//   72  150:invokespecial   #78  <Method void StringBuilder()>
	//   73  153:astore          6
				stringbuilder1.append("&#");
	//   74  155:aload           6
	//   75  157:ldc1            #80  <String "&#">
	//   76  159:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   77  162:pop             
				stringbuilder1.append(((int) (c)));
	//   78  163:aload           6
	//   79  165:iload           4
	//   80  167:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   81  170:pop             
				stringbuilder1.append(";");
	//   82  171:aload           6
	//   83  173:ldc1            #85  <String ";">
	//   84  175:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   85  178:pop             
				stringbuilder.append(stringbuilder1.toString());
	//   86  179:aload_0         
	//   87  180:aload           6
	//   88  182:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   89  185:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   90  188:pop             
			}
		}

	//   91  189:iload_2         
	//   92  190:iconst_1        
	//   93  191:iadd            
	//   94  192:istore_2        
	//*  95  193:goto            0
	//   96  196:return          
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
		ArrayList arraylist = mStreams;
	//   12   27:aload_0         
	//   13   28:getfield        #194 <Field ArrayList mStreams>
	//   14   31:astore_2        
		if(arraylist != null)
	//*  15   32:aload_2         
	//*  16   33:ifnull          45
			return (Uri)arraylist.get(i);
	//   17   36:aload_2         
	//   18   37:iload_1         
	//   19   38:invokevirtual   #208 <Method Object ArrayList.get(int)>
	//   20   41:checkcast       #191 <Class Uri>
	//   21   44:areturn         
		if(i == 0)
	//*  22   45:iload_1         
	//*  23   46:ifne            62
		{
			return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
	//   24   49:aload_0         
	//   25   50:getfield        #35  <Field Intent mIntent>
	//   26   53:ldc1            #185 <String "android.intent.extra.STREAM">
	//   27   55:invokevirtual   #189 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   28   58:checkcast       #191 <Class Uri>
	//   29   61:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   62:new             #64  <Class StringBuilder>
	//   31   65:dup             
	//   32   66:invokespecial   #78  <Method void StringBuilder()>
	//   33   69:astore_2        
			stringbuilder.append("Stream items available: ");
	//   34   70:aload_2         
	//   35   71:ldc1            #210 <String "Stream items available: ">
	//   36   73:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
			stringbuilder.append(getStreamCount());
	//   38   77:aload_2         
	//   39   78:aload_0         
	//   40   79:invokevirtual   #213 <Method int getStreamCount()>
	//   41   82:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   42   85:pop             
			stringbuilder.append(" index requested: ");
	//   43   86:aload_2         
	//   44   87:ldc1            #215 <String " index requested: ">
	//   45   89:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   46   92:pop             
			stringbuilder.append(i);
	//   47   93:aload_2         
	//   48   94:iload_1         
	//   49   95:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   50   98:pop             
			throw new IndexOutOfBoundsException(stringbuilder.toString());
	//   51   99:new             #217 <Class IndexOutOfBoundsException>
	//   52  102:dup             
	//   53  103:aload_2         
	//   54  104:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   55  107:invokespecial   #220 <Method void IndexOutOfBoundsException(String)>
	//   56  110:athrow          
		}
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
