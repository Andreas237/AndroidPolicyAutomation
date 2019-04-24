// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.*;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.*;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.*;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamx, zzjn, zznk, zzkb, 
//			zzni, zzadh, zzane, zzamv

public final class zzamu
{

	public zzamu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	public static int zza(Context context, int i)
	{
		return zza(context.getResources().getDisplayMetrics(), i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #77  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:iload_1         
	//    4    8:invokestatic    #80  <Method int zza(DisplayMetrics, int)>
	//    5   11:ireturn         
	}

	public static int zza(DisplayMetrics displaymetrics, int i)
	{
		return (int)TypedValue.applyDimension(1, i, displaymetrics);
	//    0    0:iconst_1        
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:aload_0         
	//    4    4:invokestatic    #86  <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
	//    5    7:f2i             
	//    6    8:ireturn         
	}

	public static String zza(StackTraceElement astacktraceelement[], String s)
	{
label0:
		{
			int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
			do
			{
				int k = i + 1;
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:iadd            
	//    5    5:istore_3        
				if(k >= astacktraceelement.length)
					break;
	//    6    6:iload_3         
	//    7    7:aload_0         
	//    8    8:arraylength     
	//    9    9:icmpge          118
				StackTraceElement stacktraceelement = astacktraceelement[i];
	//   10   12:aload_0         
	//   11   13:iload_2         
	//   12   14:aaload          
	//   13   15:astore          4
				String s1 = stacktraceelement.getClassName();
	//   14   17:aload           4
	//   15   19:invokevirtual   #94  <Method String StackTraceElement.getClassName()>
	//   16   22:astore          5
				if("loadAd".equalsIgnoreCase(stacktraceelement.getMethodName()) && (zzcup.equalsIgnoreCase(s1) || zzcuq.equalsIgnoreCase(s1) || zzcur.equalsIgnoreCase(s1) || zzcus.equalsIgnoreCase(s1) || zzcut.equalsIgnoreCase(s1) || zzcuu.equalsIgnoreCase(s1)))
	//*  17   24:ldc1            #96  <String "loadAd">
	//*  18   26:aload           4
	//*  19   28:invokevirtual   #99  <Method String StackTraceElement.getMethodName()>
	//*  20   31:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   34:ifeq            113
	//*  22   37:getstatic       #40  <Field String zzcup>
	//*  23   40:aload           5
	//*  24   42:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//*  25   45:ifne            103
	//*  26   48:getstatic       #44  <Field String zzcuq>
	//*  27   51:aload           5
	//*  28   53:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//*  29   56:ifne            103
	//*  30   59:getstatic       #48  <Field String zzcur>
	//*  31   62:aload           5
	//*  32   64:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//*  33   67:ifne            103
	//*  34   70:getstatic       #52  <Field String zzcus>
	//*  35   73:aload           5
	//*  36   75:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//*  37   78:ifne            103
	//*  38   81:getstatic       #56  <Field String zzcut>
	//*  39   84:aload           5
	//*  40   86:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//*  41   89:ifne            103
	//*  42   92:getstatic       #60  <Field String zzcuu>
	//*  43   95:aload           5
	//*  44   97:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//*  45  100:ifeq            113
				{
					astacktraceelement = ((StackTraceElement []) (astacktraceelement[k].getClassName()));
	//   46  103:aload_0         
	//   47  104:iload_3         
	//   48  105:aaload          
	//   49  106:invokevirtual   #94  <Method String StackTraceElement.getClassName()>
	//   50  109:astore_0        
					break label0;
	//   51  110:goto            120
				}
				i = k;
	//   52  113:iload_3         
	//   53  114:istore_2        
			} while(true);
	//   54  115:goto            2
			astacktraceelement = null;
	//   55  118:aconst_null     
	//   56  119:astore_0        
		}
		if(s != null)
	//*  57  120:aload_1         
	//*  58  121:ifnull          224
		{
			StringTokenizer stringtokenizer = new StringTokenizer(s, ".");
	//   59  124:new             #107 <Class StringTokenizer>
	//   60  127:dup             
	//   61  128:aload_1         
	//   62  129:ldc1            #109 <String ".">
	//   63  131:invokespecial   #112 <Method void StringTokenizer(String, String)>
	//   64  134:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   65  136:new             #114 <Class StringBuilder>
	//   66  139:dup             
	//   67  140:invokespecial   #115 <Method void StringBuilder()>
	//   68  143:astore          5
			int j = 2;
	//   69  145:iconst_2        
	//   70  146:istore_2        
			if(stringtokenizer.hasMoreElements())
	//*  71  147:aload           4
	//*  72  149:invokevirtual   #119 <Method boolean StringTokenizer.hasMoreElements()>
	//*  73  152:ifeq            210
			{
				stringbuilder.append(stringtokenizer.nextToken());
	//   74  155:aload           5
	//   75  157:aload           4
	//   76  159:invokevirtual   #122 <Method String StringTokenizer.nextToken()>
	//   77  162:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   78  165:pop             
				for(; j > 0 && stringtokenizer.hasMoreElements(); j--)
	//*  79  166:iload_2         
	//*  80  167:ifle            204
	//*  81  170:aload           4
	//*  82  172:invokevirtual   #119 <Method boolean StringTokenizer.hasMoreElements()>
	//*  83  175:ifeq            204
				{
					stringbuilder.append(".");
	//   84  178:aload           5
	//   85  180:ldc1            #109 <String ".">
	//   86  182:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   87  185:pop             
					stringbuilder.append(stringtokenizer.nextToken());
	//   88  186:aload           5
	//   89  188:aload           4
	//   90  190:invokevirtual   #122 <Method String StringTokenizer.nextToken()>
	//   91  193:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   92  196:pop             
				}

	//   93  197:iload_2         
	//   94  198:iconst_1        
	//   95  199:isub            
	//   96  200:istore_2        
	//*  97  201:goto            166
				s = stringbuilder.toString();
	//   98  204:aload           5
	//   99  206:invokevirtual   #129 <Method String StringBuilder.toString()>
	//  100  209:astore_1        
			}
			if(astacktraceelement != null && !((String) (astacktraceelement)).contains(((CharSequence) (s))))
	//* 101  210:aload_0         
	//* 102  211:ifnull          224
	//* 103  214:aload_0         
	//* 104  215:aload_1         
	//* 105  216:invokevirtual   #133 <Method boolean String.contains(CharSequence)>
	//* 106  219:ifne            224
				return ((String) (astacktraceelement));
	//  107  222:aload_0         
	//  108  223:areturn         
		}
		return null;
	//  109  224:aconst_null     
	//  110  225:areturn         
	}

	public static void zza(Context context, String s, String s1, Bundle bundle, boolean flag, zzamx zzamx1)
	{
		if(flag)
	//*   0    0:iload           4
	//*   1    2:ifeq            109
		{
			Context context1 = context.getApplicationContext();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #139 <Method Context Context.getApplicationContext()>
	//    4    9:astore          8
			Object obj = ((Object) (context1));
	//    5   11:aload           8
	//    6   13:astore          7
			if(context1 == null)
	//*   7   15:aload           8
	//*   8   17:ifnonnull       23
				obj = ((Object) (context));
	//    9   20:aload_0         
	//   10   21:astore          7
			bundle.putString("os", android.os.Build.VERSION.RELEASE);
	//   11   23:aload_3         
	//   12   24:ldc1            #141 <String "os">
	//   13   26:getstatic       #146 <Field String android.os.Build$VERSION.RELEASE>
	//   14   29:invokevirtual   #151 <Method void Bundle.putString(String, String)>
			bundle.putString("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
	//   15   32:aload_3         
	//   16   33:ldc1            #153 <String "api">
	//   17   35:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//   18   38:invokestatic    #161 <Method String String.valueOf(int)>
	//   19   41:invokevirtual   #151 <Method void Bundle.putString(String, String)>
			bundle.putString("appid", ((Context) (obj)).getPackageName());
	//   20   44:aload_3         
	//   21   45:ldc1            #163 <String "appid">
	//   22   47:aload           7
	//   23   49:invokevirtual   #166 <Method String Context.getPackageName()>
	//   24   52:invokevirtual   #151 <Method void Bundle.putString(String, String)>
			obj = ((Object) (s));
	//   25   55:aload_1         
	//   26   56:astore          7
			if(s == null)
	//*  27   58:aload_1         
	//*  28   59:ifnonnull       101
			{
				int i = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
	//   29   62:invokestatic    #172 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//   30   65:aload_0         
	//   31   66:invokevirtual   #176 <Method int GoogleApiAvailabilityLight.getApkVersion(Context)>
	//   32   69:istore          6
				context = ((Context) (new StringBuilder(20)));
	//   33   71:new             #114 <Class StringBuilder>
	//   34   74:dup             
	//   35   75:bipush          20
	//   36   77:invokespecial   #179 <Method void StringBuilder(int)>
	//   37   80:astore_0        
				((StringBuilder) (context)).append(i);
	//   38   81:aload_0         
	//   39   82:iload           6
	//   40   84:invokevirtual   #182 <Method StringBuilder StringBuilder.append(int)>
	//   41   87:pop             
				((StringBuilder) (context)).append(".12451000");
	//   42   88:aload_0         
	//   43   89:ldc1            #184 <String ".12451000">
	//   44   91:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   45   94:pop             
				obj = ((Object) (((StringBuilder) (context)).toString()));
	//   46   95:aload_0         
	//   47   96:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   48   99:astore          7
			}
			bundle.putString("js", ((String) (obj)));
	//   49  101:aload_3         
	//   50  102:ldc1            #186 <String "js">
	//   51  104:aload           7
	//   52  106:invokevirtual   #151 <Method void Bundle.putString(String, String)>
		}
		context = ((Context) ((new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1)));
	//   53  109:new             #188 <Class android.net.Uri$Builder>
	//   54  112:dup             
	//   55  113:invokespecial   #189 <Method void android.net.Uri$Builder()>
	//   56  116:ldc1            #191 <String "https">
	//   57  118:invokevirtual   #195 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   58  121:ldc1            #197 <String "//pagead2.googlesyndication.com/pagead/gen_204">
	//   59  123:invokevirtual   #200 <Method android.net.Uri$Builder android.net.Uri$Builder.path(String)>
	//   60  126:ldc1            #202 <String "id">
	//   61  128:aload_2         
	//   62  129:invokevirtual   #206 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   63  132:astore_0        
		for(s = ((String) (bundle.keySet().iterator())); ((Iterator) (s)).hasNext(); ((android.net.Uri.Builder) (context)).appendQueryParameter(s1, bundle.getString(s1)))
	//*  64  133:aload_3         
	//*  65  134:invokevirtual   #210 <Method Set Bundle.keySet()>
	//*  66  137:invokeinterface #216 <Method Iterator Set.iterator()>
	//*  67  142:astore_1        
	//*  68  143:aload_1         
	//*  69  144:invokeinterface #221 <Method boolean Iterator.hasNext()>
	//*  70  149:ifeq            176
			s1 = (String)((Iterator) (s)).next();
	//   71  152:aload_1         
	//   72  153:invokeinterface #225 <Method Object Iterator.next()>
	//   73  158:checkcast       #101 <Class String>
	//   74  161:astore_2        

	//   75  162:aload_0         
	//   76  163:aload_2         
	//   77  164:aload_3         
	//   78  165:aload_2         
	//   79  166:invokevirtual   #229 <Method String Bundle.getString(String)>
	//   80  169:invokevirtual   #206 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   81  172:pop             
	//*  82  173:goto            143
		zzamx1.zzcz(((android.net.Uri.Builder) (context)).toString());
	//   83  176:aload           5
	//   84  178:aload_0         
	//   85  179:invokevirtual   #230 <Method String android.net.Uri$Builder.toString()>
	//   86  182:invokeinterface #236 <Method void zzamx.zzcz(String)>
	//   87  187:return          
	}

	private final void zza(ViewGroup viewgroup, zzjn zzjn1, String s, int i, int j)
	{
		if(viewgroup.getChildCount() != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #244 <Method int ViewGroup.getChildCount()>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			Context context = viewgroup.getContext();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #247 <Method Context ViewGroup.getContext()>
	//    6   12:astore          6
			TextView textview = new TextView(context);
	//    7   14:new             #249 <Class TextView>
	//    8   17:dup             
	//    9   18:aload           6
	//   10   20:invokespecial   #252 <Method void TextView(Context)>
	//   11   23:astore          7
			textview.setGravity(17);
	//   12   25:aload           7
	//   13   27:bipush          17
	//   14   29:invokevirtual   #255 <Method void TextView.setGravity(int)>
			textview.setText(((CharSequence) (s)));
	//   15   32:aload           7
	//   16   34:aload_3         
	//   17   35:invokevirtual   #259 <Method void TextView.setText(CharSequence)>
			textview.setTextColor(i);
	//   18   38:aload           7
	//   19   40:iload           4
	//   20   42:invokevirtual   #262 <Method void TextView.setTextColor(int)>
			textview.setBackgroundColor(j);
	//   21   45:aload           7
	//   22   47:iload           5
	//   23   49:invokevirtual   #265 <Method void TextView.setBackgroundColor(int)>
			s = ((String) (new FrameLayout(context)));
	//   24   52:new             #267 <Class FrameLayout>
	//   25   55:dup             
	//   26   56:aload           6
	//   27   58:invokespecial   #268 <Method void FrameLayout(Context)>
	//   28   61:astore_3        
			((FrameLayout) (s)).setBackgroundColor(i);
	//   29   62:aload_3         
	//   30   63:iload           4
	//   31   65:invokevirtual   #269 <Method void FrameLayout.setBackgroundColor(int)>
			i = zza(context, 3);
	//   32   68:aload           6
	//   33   70:iconst_3        
	//   34   71:invokestatic    #271 <Method int zza(Context, int)>
	//   35   74:istore          4
			((FrameLayout) (s)).addView(((android.view.View) (textview)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(zzjn1.widthPixels - i, zzjn1.heightPixels - i, 17))));
	//   36   76:aload_3         
	//   37   77:aload           7
	//   38   79:new             #273 <Class android.widget.FrameLayout$LayoutParams>
	//   39   82:dup             
	//   40   83:aload_2         
	//   41   84:getfield        #278 <Field int zzjn.widthPixels>
	//   42   87:iload           4
	//   43   89:isub            
	//   44   90:aload_2         
	//   45   91:getfield        #281 <Field int zzjn.heightPixels>
	//   46   94:iload           4
	//   47   96:isub            
	//   48   97:bipush          17
	//   49   99:invokespecial   #284 <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
	//   50  102:invokevirtual   #288 <Method void FrameLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			viewgroup.addView(((android.view.View) (s)), zzjn1.widthPixels, zzjn1.heightPixels);
	//   51  105:aload_1         
	//   52  106:aload_3         
	//   53  107:aload_2         
	//   54  108:getfield        #278 <Field int zzjn.widthPixels>
	//   55  111:aload_2         
	//   56  112:getfield        #281 <Field int zzjn.heightPixels>
	//   57  115:invokevirtual   #291 <Method void ViewGroup.addView(android.view.View, int, int)>
			return;
	//   58  118:return          
		}
	}

	public static void zza(boolean flag, HttpURLConnection httpurlconnection, String s)
	{
		httpurlconnection.setConnectTimeout(60000);
	//    0    0:aload_1         
	//    1    1:ldc2            #293 <Int 60000>
	//    2    4:invokevirtual   #298 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setInstanceFollowRedirects(true);
	//    3    7:aload_1         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #302 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		httpurlconnection.setReadTimeout(60000);
	//    6   12:aload_1         
	//    7   13:ldc2            #293 <Int 60000>
	//    8   16:invokevirtual   #305 <Method void HttpURLConnection.setReadTimeout(int)>
		if(s != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          31
			httpurlconnection.setRequestProperty("User-Agent", s);
	//   11   23:aload_1         
	//   12   24:ldc2            #307 <String "User-Agent">
	//   13   27:aload_2         
	//   14   28:invokevirtual   #310 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setUseCaches(false);
	//   15   31:aload_1         
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #313 <Method void HttpURLConnection.setUseCaches(boolean)>
	//   18   36:return          
	}

	public static int zzb(Context context, int i)
	{
		context = ((Context) (((WindowManager)context.getSystemService("window")).getDefaultDisplay()));
	//    0    0:aload_0         
	//    1    1:ldc2            #316 <String "window">
	//    2    4:invokevirtual   #320 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #322 <Class WindowManager>
	//    4   10:invokeinterface #326 <Method Display WindowManager.getDefaultDisplay()>
	//    5   15:astore_0        
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    6   16:new             #328 <Class DisplayMetrics>
	//    7   19:dup             
	//    8   20:invokespecial   #329 <Method void DisplayMetrics()>
	//    9   23:astore_2        
		((Display) (context)).getMetrics(displaymetrics);
	//   10   24:aload_0         
	//   11   25:aload_2         
	//   12   26:invokevirtual   #335 <Method void Display.getMetrics(DisplayMetrics)>
		return zzb(displaymetrics, i);
	//   13   29:aload_2         
	//   14   30:iload_1         
	//   15   31:invokestatic    #337 <Method int zzb(DisplayMetrics, int)>
	//   16   34:ireturn         
	}

	public static int zzb(DisplayMetrics displaymetrics, int i)
	{
		return Math.round((float)i / displaymetrics.density);
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:aload_0         
	//    3    3:getfield        #341 <Field float DisplayMetrics.density>
	//    4    6:fdiv            
	//    5    7:invokestatic    #347 <Method int Math.round(float)>
	//    6   10:ireturn         
	}

	public static String zzbc(Context context)
	{
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       14
			context = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		else
	//*   7   11:goto            22
			context = ((Context) (android.provider.Settings.Secure.getString(((android.content.ContentResolver) (context)), "android_id")));
	//    8   14:aload_0         
	//    9   15:ldc2            #355 <String "android_id">
	//   10   18:invokestatic    #360 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   11   21:astore_0        
		if(context == null || zzsg())
	//*  12   22:aload_0         
	//*  13   23:ifnull          32
	//*  14   26:invokestatic    #363 <Method boolean zzsg()>
	//*  15   29:ifeq            36
			context = "emulator";
	//   16   32:ldc2            #365 <String "emulator">
	//   17   35:astore_0        
		return zzde(((String) (context)));
	//   18   36:aload_0         
	//   19   37:invokestatic    #368 <Method String zzde(String)>
	//   20   40:areturn         
	}

	public static String zzbd(Context context)
	{
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method android.content.ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return android.provider.Settings.Secure.getString(((android.content.ContentResolver) (context)), "android_id");
	//    7   11:aload_0         
	//    8   12:ldc2            #355 <String "android_id">
	//    9   15:invokestatic    #360 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//   10   18:areturn         
	}

	public static boolean zzbe(Context context)
	{
		return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 0xbdfcb8) == 0;
	//    0    0:invokestatic    #172 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aload_0         
	//    2    4:ldc2            #372 <Int 0xbdfcb8>
	//    3    7:invokevirtual   #375 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public static int zzbf(Context context)
	{
		return DynamiteModule.getRemoteVersion(context, "com.google.android.gms.ads.dynamite");
	//    0    0:aload_0         
	//    1    1:ldc2            #378 <String "com.google.android.gms.ads.dynamite">
	//    2    4:invokestatic    #384 <Method int DynamiteModule.getRemoteVersion(Context, String)>
	//    3    7:ireturn         
	}

	public static int zzbg(Context context)
	{
		return DynamiteModule.getLocalVersion(context, "com.google.android.gms.ads.dynamite");
	//    0    0:aload_0         
	//    1    1:ldc2            #378 <String "com.google.android.gms.ads.dynamite">
	//    2    4:invokestatic    #388 <Method int DynamiteModule.getLocalVersion(Context, String)>
	//    3    7:ireturn         
	}

	public static boolean zzbh(Context context)
	{
		int i = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 0xbdfcb8);
	//    0    0:invokestatic    #172 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    1    3:aload_0         
	//    2    4:ldc2            #372 <Int 0xbdfcb8>
	//    3    7:invokevirtual   #375 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    4   10:istore_1        
		return i == 0 || i == 2;
	//    5   11:iload_1         
	//    6   12:ifeq            25
	//    7   15:iload_1         
	//    8   16:iconst_2        
	//    9   17:icmpne          23
	//   10   20:goto            25
	//   11   23:iconst_0        
	//   12   24:ireturn         
	//   13   25:iconst_1        
	//   14   26:ireturn         
	}

	public static boolean zzbi(Context context)
	{
		if(context.getResources().getConfiguration().orientation != 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//*   2    4:invokevirtual   #394 <Method Configuration Resources.getConfiguration()>
	//*   3    7:getfield        #399 <Field int Configuration.orientation>
	//*   4   10:iconst_2        
	//*   5   11:icmpeq          16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		context = ((Context) (context.getResources().getDisplayMetrics()));
	//    8   16:aload_0         
	//    9   17:invokevirtual   #71  <Method Resources Context.getResources()>
	//   10   20:invokevirtual   #77  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   11   23:astore_0        
		return (int)((float)((DisplayMetrics) (context)).heightPixels / ((DisplayMetrics) (context)).density) < 600;
	//   12   24:aload_0         
	//   13   25:getfield        #400 <Field int DisplayMetrics.heightPixels>
	//   14   28:i2f             
	//   15   29:aload_0         
	//   16   30:getfield        #341 <Field float DisplayMetrics.density>
	//   17   33:fdiv            
	//   18   34:f2i             
	//   19   35:sipush          600
	//   20   38:icmpge          43
	//   21   41:iconst_1        
	//   22   42:ireturn         
	//   23   43:iconst_0        
	//   24   44:ireturn         
	}

	public static boolean zzbj(Context context)
	{
		DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #77  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:astore          5
		context = ((Context) (((WindowManager)context.getSystemService("window")).getDefaultDisplay()));
	//    4    9:aload_0         
	//    5   10:ldc2            #316 <String "window">
	//    6   13:invokevirtual   #320 <Method Object Context.getSystemService(String)>
	//    7   16:checkcast       #322 <Class WindowManager>
	//    8   19:invokeinterface #326 <Method Display WindowManager.getDefaultDisplay()>
	//    9   24:astore_0        
		int i;
		int j;
		int k;
		int l;
		if(PlatformVersion.isAtLeastJellyBeanMR1())
	//*  10   25:invokestatic    #411 <Method boolean PlatformVersion.isAtLeastJellyBeanMR1()>
	//*  11   28:ifeq            52
		{
			((Display) (context)).getRealMetrics(displaymetrics);
	//   12   31:aload_0         
	//   13   32:aload           5
	//   14   34:invokevirtual   #414 <Method void Display.getRealMetrics(DisplayMetrics)>
			i = displaymetrics.heightPixels;
	//   15   37:aload           5
	//   16   39:getfield        #400 <Field int DisplayMetrics.heightPixels>
	//   17   42:istore_1        
			j = displaymetrics.widthPixels;
	//   18   43:aload           5
	//   19   45:getfield        #415 <Field int DisplayMetrics.widthPixels>
	//   20   48:istore_2        
		} else
	//*  21   49:goto            108
		{
			try
			{
				i = ((Integer)((Class) (android/view/Display)).getMethod("getRawHeight", new Class[0]).invoke(((Object) (context)), new Object[0])).intValue();
	//   22   52:ldc2            #331 <Class Display>
	//   23   55:ldc2            #417 <String "getRawHeight">
	//   24   58:iconst_0        
	//   25   59:anewarray       Class[]
	//   26   62:invokevirtual   #421 <Method Method Class.getMethod(String, Class[])>
	//   27   65:aload_0         
	//   28   66:iconst_0        
	//   29   67:anewarray       Object[]
	//   30   70:invokevirtual   #427 <Method Object Method.invoke(Object, Object[])>
	//   31   73:checkcast       #429 <Class Integer>
	//   32   76:invokevirtual   #432 <Method int Integer.intValue()>
	//   33   79:istore_1        
				j = ((Integer)((Class) (android/view/Display)).getMethod("getRawWidth", new Class[0]).invoke(((Object) (context)), new Object[0])).intValue();
	//   34   80:ldc2            #331 <Class Display>
	//   35   83:ldc2            #434 <String "getRawWidth">
	//   36   86:iconst_0        
	//   37   87:anewarray       Class[]
	//   38   90:invokevirtual   #421 <Method Method Class.getMethod(String, Class[])>
	//   39   93:aload_0         
	//   40   94:iconst_0        
	//   41   95:anewarray       Object[]
	//   42   98:invokevirtual   #427 <Method Object Method.invoke(Object, Object[])>
	//   43  101:checkcast       #429 <Class Integer>
	//   44  104:invokevirtual   #432 <Method int Integer.intValue()>
	//   45  107:istore_2        
			}
	//*  46  108:aload_0         
	//*  47  109:aload           5
	//*  48  111:invokevirtual   #335 <Method void Display.getMetrics(DisplayMetrics)>
	//*  49  114:aload           5
	//*  50  116:getfield        #400 <Field int DisplayMetrics.heightPixels>
	//*  51  119:istore_3        
	//*  52  120:aload           5
	//*  53  122:getfield        #415 <Field int DisplayMetrics.widthPixels>
	//*  54  125:istore          4
	//*  55  127:iload_3         
	//*  56  128:iload_1         
	//*  57  129:icmpne          140
	//*  58  132:iload           4
	//*  59  134:iload_2         
	//*  60  135:icmpne          140
	//*  61  138:iconst_1        
	//*  62  139:ireturn         
	//*  63  140:iconst_0        
	//*  64  141:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  65  142:astore_0        
			{
				return false;
	//   66  143:iconst_0        
	//   67  144:ireturn         
			}
		}
		((Display) (context)).getMetrics(displaymetrics);
		k = displaymetrics.heightPixels;
		l = displaymetrics.widthPixels;
		return k == i && l == j;
	}

	public static int zzbk(Context context)
	{
		int i = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Resources Context.getResources()>
	//    2    4:ldc2            #437 <String "navigation_bar_width">
	//    3    7:ldc2            #439 <String "dimen">
	//    4   10:ldc2            #441 <String "android">
	//    5   13:invokevirtual   #445 <Method int Resources.getIdentifier(String, String, String)>
	//    6   16:istore_1        
		if(i > 0)
	//*   7   17:iload_1         
	//*   8   18:ifle            30
			return context.getResources().getDimensionPixelSize(i);
	//    9   21:aload_0         
	//   10   22:invokevirtual   #71  <Method Resources Context.getResources()>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #449 <Method int Resources.getDimensionPixelSize(int)>
	//   13   29:ireturn         
		else
			return 0;
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public static Throwable zzc(Throwable throwable)
	{
		zzna zzna = zznk.zzauj;
	//    0    0:getstatic       #457 <Field zzna zznk.zzauj>
	//    1    3:astore          5
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    5:invokestatic    #463 <Method zzni zzkb.zzik()>
	//*   3    8:aload           5
	//*   4   10:invokevirtual   #469 <Method Object zzni.zzd(zzna)>
	//*   5   13:checkcast       #471 <Class Boolean>
	//*   6   16:invokevirtual   #474 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            24
			return throwable;
	//    8   22:aload_0         
	//    9   23:areturn         
		LinkedList linkedlist = new LinkedList();
	//   10   24:new             #476 <Class LinkedList>
	//   11   27:dup             
	//   12   28:invokespecial   #477 <Method void LinkedList()>
	//   13   31:astore          6
		for(; throwable != null; throwable = throwable.getCause())
	//*  14   33:aload_0         
	//*  15   34:ifnull          51
			linkedlist.push(((Object) (throwable)));
	//   16   37:aload           6
	//   17   39:aload_0         
	//   18   40:invokevirtual   #481 <Method void LinkedList.push(Object)>

	//   19   43:aload_0         
	//   20   44:invokevirtual   #487 <Method Throwable Throwable.getCause()>
	//   21   47:astore_0        
	//*  22   48:goto            33
		throwable = null;
	//   23   51:aconst_null     
	//   24   52:astore_0        
		do
		{
			if(linkedlist.isEmpty())
				break;
	//   25   53:aload           6
	//   26   55:invokevirtual   #490 <Method boolean LinkedList.isEmpty()>
	//   27   58:ifne            305
			Throwable throwable1 = (Throwable)linkedlist.pop();
	//   28   61:aload           6
	//   29   63:invokevirtual   #493 <Method Object LinkedList.pop()>
	//   30   66:checkcast       #483 <Class Throwable>
	//   31   69:astore          8
			StackTraceElement astacktraceelement[] = throwable1.getStackTrace();
	//   32   71:aload           8
	//   33   73:invokevirtual   #497 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   34   76:astore          9
			ArrayList arraylist = new ArrayList();
	//   35   78:new             #499 <Class ArrayList>
	//   36   81:dup             
	//   37   82:invokespecial   #500 <Method void ArrayList()>
	//   38   85:astore          7
			arraylist.add(((Object) (new StackTraceElement(((Object) (throwable1)).getClass().getName(), "<filtered>", "<filtered>", 1))));
	//   39   87:aload           7
	//   40   89:new             #91  <Class StackTraceElement>
	//   41   92:dup             
	//   42   93:aload           8
	//   43   95:invokevirtual   #504 <Method Class Object.getClass()>
	//   44   98:invokevirtual   #38  <Method String Class.getName()>
	//   45  101:ldc2            #506 <String "<filtered>">
	//   46  104:ldc2            #506 <String "<filtered>">
	//   47  107:iconst_1        
	//   48  108:invokespecial   #509 <Method void StackTraceElement(String, String, String, int)>
	//   49  111:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   50  114:pop             
			int k = astacktraceelement.length;
	//   51  115:aload           9
	//   52  117:arraylength     
	//   53  118:istore          4
			int i = 0;
	//   54  120:iconst_0        
	//   55  121:istore_1        
			int j = i;
	//   56  122:iload_1         
	//   57  123:istore_2        
			StackTraceElement stacktraceelement;
			for(; i < k; i++)
	//*  58  124:iload_1         
	//*  59  125:iload           4
	//*  60  127:icmpge          248
			{
				stacktraceelement = astacktraceelement[i];
	//   61  130:aload           9
	//   62  132:iload_1         
	//   63  133:aaload          
	//   64  134:astore          5
				if(zzdf(stacktraceelement.getClassName()))
	//*  65  136:aload           5
	//*  66  138:invokevirtual   #94  <Method String StackTraceElement.getClassName()>
	//*  67  141:invokestatic    #516 <Method boolean zzdf(String)>
	//*  68  144:ifeq            160
				{
					arraylist.add(((Object) (stacktraceelement)));
	//   69  147:aload           7
	//   70  149:aload           5
	//   71  151:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//   72  154:pop             
					j = 1;
	//   73  155:iconst_1        
	//   74  156:istore_2        
					continue;
	//   75  157:goto            241
				}
				String s = stacktraceelement.getClassName();
	//   76  160:aload           5
	//   77  162:invokevirtual   #94  <Method String StackTraceElement.getClassName()>
	//   78  165:astore          10
				boolean flag;
				if(!TextUtils.isEmpty(((CharSequence) (s))) && (s.startsWith("android.") || s.startsWith("java.")))
	//*  79  167:aload           10
	//*  80  169:invokestatic    #520 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  81  172:ifne            202
	//*  82  175:aload           10
	//*  83  177:ldc2            #522 <String "android.">
	//*  84  180:invokevirtual   #525 <Method boolean String.startsWith(String)>
	//*  85  183:ifne            197
	//*  86  186:aload           10
	//*  87  188:ldc2            #527 <String "java.">
	//*  88  191:invokevirtual   #525 <Method boolean String.startsWith(String)>
	//*  89  194:ifeq            202
					flag = true;
	//   90  197:iconst_1        
	//   91  198:istore_3        
				else
	//*  92  199:goto            204
					flag = false;
	//   93  202:iconst_0        
	//   94  203:istore_3        
				if(!flag)
	//*  95  204:iload_3         
	//*  96  205:ifeq            219
	//*  97  208:aload           7
	//*  98  210:aload           5
	//*  99  212:invokevirtual   #513 <Method boolean ArrayList.add(Object)>
	//* 100  215:pop             
	//* 101  216:goto            241
					stacktraceelement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
	//  102  219:new             #91  <Class StackTraceElement>
	//  103  222:dup             
	//  104  223:ldc2            #506 <String "<filtered>">
	//  105  226:ldc2            #506 <String "<filtered>">
	//  106  229:ldc2            #506 <String "<filtered>">
	//  107  232:iconst_1        
	//  108  233:invokespecial   #509 <Method void StackTraceElement(String, String, String, int)>
	//  109  236:astore          5
				arraylist.add(((Object) (stacktraceelement)));
			}

	//  110  238:goto            208
	//  111  241:iload_1         
	//  112  242:iconst_1        
	//  113  243:iadd            
	//  114  244:istore_1        
	//* 115  245:goto            124
			if(j != 0)
	//* 116  248:iload_2         
	//* 117  249:ifeq            53
			{
				if(throwable == null)
	//* 118  252:aload_0         
	//* 119  253:ifnonnull       272
					throwable = new Throwable(throwable1.getMessage());
	//  120  256:new             #483 <Class Throwable>
	//  121  259:dup             
	//  122  260:aload           8
	//  123  262:invokevirtual   #530 <Method String Throwable.getMessage()>
	//  124  265:invokespecial   #532 <Method void Throwable(String)>
	//  125  268:astore_0        
				else
	//* 126  269:goto            286
					throwable = new Throwable(throwable1.getMessage(), throwable);
	//  127  272:new             #483 <Class Throwable>
	//  128  275:dup             
	//  129  276:aload           8
	//  130  278:invokevirtual   #530 <Method String Throwable.getMessage()>
	//  131  281:aload_0         
	//  132  282:invokespecial   #535 <Method void Throwable(String, Throwable)>
	//  133  285:astore_0        
				throwable.setStackTrace((StackTraceElement[])arraylist.toArray(((Object []) (new StackTraceElement[0]))));
	//  134  286:aload_0         
	//  135  287:aload           7
	//  136  289:iconst_0        
	//  137  290:anewarray       StackTraceElement[]
	//  138  293:invokevirtual   #539 <Method Object[] ArrayList.toArray(Object[])>
	//  139  296:checkcast       #541 <Class StackTraceElement[]>
	//  140  299:invokevirtual   #545 <Method void Throwable.setStackTrace(StackTraceElement[])>
			}
		} while(true);
	//  141  302:goto            53
		return throwable;
	//  142  305:aload_0         
	//  143  306:areturn         
	}

	public static String zzde(String s)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L2:
		if(i >= 2)
			break; /* Loop/switch isn't completed */
	//    2    2:iload_1         
	//    3    3:iconst_2        
	//    4    4:icmpge          60
		Object obj;
		obj = ((Object) (MessageDigest.getInstance("MD5")));
	//    5    7:ldc2            #551 <String "MD5">
	//    6   10:invokestatic    #556 <Method MessageDigest MessageDigest.getInstance(String)>
	//    7   13:astore_2        
		((MessageDigest) (obj)).update(s.getBytes());
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #560 <Method byte[] String.getBytes()>
	//   11   19:invokevirtual   #564 <Method void MessageDigest.update(byte[])>
		obj = ((Object) (String.format(Locale.US, "%032X", new Object[] {
			new BigInteger(1, ((MessageDigest) (obj)).digest())
		})));
	//   12   22:getstatic       #570 <Field Locale Locale.US>
	//   13   25:ldc2            #572 <String "%032X">
	//   14   28:iconst_1        
	//   15   29:anewarray       Object[]
	//   16   32:dup             
	//   17   33:iconst_0        
	//   18   34:new             #574 <Class BigInteger>
	//   19   37:dup             
	//   20   38:iconst_1        
	//   21   39:aload_2         
	//   22   40:invokevirtual   #577 <Method byte[] MessageDigest.digest()>
	//   23   43:invokespecial   #580 <Method void BigInteger(int, byte[])>
	//   24   46:aastore         
	//   25   47:invokestatic    #584 <Method String String.format(Locale, String, Object[])>
	//   26   50:astore_2        
		return ((String) (obj));
	//   27   51:aload_2         
	//   28   52:areturn         
_L3:
		i++;
	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_1        
		if(true) goto _L2; else goto _L1
	//   33   57:goto            2
_L1:
		return null;
	//   34   60:aconst_null     
	//   35   61:areturn         
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//   36   62:astore_2        
		  goto _L3
	//*  37   63:goto            53
		s;
	//   38   66:astore_0        
		return null;
	//   39   67:aconst_null     
	//   40   68:areturn         
	}

	public static boolean zzdf(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #520 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		zzna zzna = zznk.zzauk;
	//    5    9:getstatic       #587 <Field zzna zznk.zzauk>
	//    6   12:astore_2        
		if(s.startsWith((String)zzkb.zzik().zzd(zzna)))
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #463 <Method zzni zzkb.zzik()>
	//*   9   17:aload_2         
	//*  10   18:invokevirtual   #469 <Method Object zzni.zzd(zzna)>
	//*  11   21:checkcast       #101 <Class String>
	//*  12   24:invokevirtual   #525 <Method boolean String.startsWith(String)>
	//*  13   27:ifeq            32
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
		boolean flag;
		try
		{
			flag = Class.forName(s).isAnnotationPresent(com/google/android/gms/internal/ads/zzadh);
	//   16   32:aload_0         
	//   17   33:invokestatic    #591 <Method Class Class.forName(String)>
	//   18   36:ldc2            #593 <Class zzadh>
	//   19   39:invokevirtual   #597 <Method boolean Class.isAnnotationPresent(Class)>
	//   20   42:istore_1        
		}
	//*  21   43:iload_1         
	//*  22   44:ireturn         
		catch(Exception exception)
	//*  23   45:astore_2        
		{
			s = String.valueOf(((Object) (s)));
	//   24   46:aload_0         
	//   25   47:invokestatic    #600 <Method String String.valueOf(Object)>
	//   26   50:astore_0        
			if(s.length() != 0)
	//*  27   51:aload_0         
	//*  28   52:invokevirtual   #603 <Method int String.length()>
	//*  29   55:ifeq            69
				s = "Fail to check class type for class ".concat(s);
	//   30   58:ldc2            #605 <String "Fail to check class type for class ">
	//   31   61:aload_0         
	//   32   62:invokevirtual   #608 <Method String String.concat(String)>
	//   33   65:astore_0        
			else
	//*  34   66:goto            80
				s = new String("Fail to check class type for class ");
	//   35   69:new             #101 <Class String>
	//   36   72:dup             
	//   37   73:ldc2            #605 <String "Fail to check class type for class ">
	//   38   76:invokespecial   #609 <Method void String(String)>
	//   39   79:astore_0        
			zzane.zza(s, ((Throwable) (exception)));
	//   40   80:aload_0         
	//   41   81:aload_2         
	//   42   82:invokestatic    #613 <Method void zzane.zza(String, Throwable)>
			return false;
	//   43   85:iconst_0        
	//   44   86:ireturn         
		}
		return flag;
	}

	public static boolean zzsg()
	{
		return Build.DEVICE.startsWith("generic");
	//    0    0:getstatic       #618 <Field String Build.DEVICE>
	//    1    3:ldc2            #620 <String "generic">
	//    2    6:invokevirtual   #525 <Method boolean String.startsWith(String)>
	//    3    9:ireturn         
	}

	public static boolean zzsh()
	{
		return Looper.myLooper() == Looper.getMainLooper();
	//    0    0:invokestatic    #624 <Method Looper Looper.myLooper()>
	//    1    3:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//    2    6:if_acmpne       11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	public static String zzsi()
	{
		int i;
		Object obj;
		byte abyte0[];
		byte abyte1[];
		obj = ((Object) (UUID.randomUUID()));
	//    0    0:invokestatic    #631 <Method UUID UUID.randomUUID()>
	//    1    3:astore_1        
		abyte0 = BigInteger.valueOf(((UUID) (obj)).getLeastSignificantBits()).toByteArray();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #635 <Method long UUID.getLeastSignificantBits()>
	//    4    8:invokestatic    #638 <Method BigInteger BigInteger.valueOf(long)>
	//    5   11:invokevirtual   #641 <Method byte[] BigInteger.toByteArray()>
	//    6   14:astore_3        
		abyte1 = BigInteger.valueOf(((UUID) (obj)).getMostSignificantBits()).toByteArray();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #644 <Method long UUID.getMostSignificantBits()>
	//    9   19:invokestatic    #638 <Method BigInteger BigInteger.valueOf(long)>
	//   10   22:invokevirtual   #641 <Method byte[] BigInteger.toByteArray()>
	//   11   25:astore          4
		obj = ((Object) ((new BigInteger(1, abyte0)).toString()));
	//   12   27:new             #574 <Class BigInteger>
	//   13   30:dup             
	//   14   31:iconst_1        
	//   15   32:aload_3         
	//   16   33:invokespecial   #580 <Method void BigInteger(int, byte[])>
	//   17   36:invokevirtual   #645 <Method String BigInteger.toString()>
	//   18   39:astore_1        
		i = 0;
	//   19   40:iconst_0        
	//   20   41:istore_0        
_L2:
		if(i >= 2)
			break; /* Loop/switch isn't completed */
	//   21   42:iload_0         
	//   22   43:iconst_2        
	//   23   44:icmpge          107
		Object obj1;
		obj1 = ((Object) (MessageDigest.getInstance("MD5")));
	//   24   47:ldc2            #551 <String "MD5">
	//   25   50:invokestatic    #556 <Method MessageDigest MessageDigest.getInstance(String)>
	//   26   53:astore_2        
		((MessageDigest) (obj1)).update(abyte0);
	//   27   54:aload_2         
	//   28   55:aload_3         
	//   29   56:invokevirtual   #564 <Method void MessageDigest.update(byte[])>
		((MessageDigest) (obj1)).update(abyte1);
	//   30   59:aload_2         
	//   31   60:aload           4
	//   32   62:invokevirtual   #564 <Method void MessageDigest.update(byte[])>
		byte abyte2[] = new byte[8];
	//   33   65:bipush          8
	//   34   67:newarray        byte[]
	//   35   69:astore          5
		System.arraycopy(((Object) (((MessageDigest) (obj1)).digest())), 0, ((Object) (abyte2)), 0, 8);
	//   36   71:aload_2         
	//   37   72:invokevirtual   #577 <Method byte[] MessageDigest.digest()>
	//   38   75:iconst_0        
	//   39   76:aload           5
	//   40   78:iconst_0        
	//   41   79:bipush          8
	//   42   81:invokestatic    #651 <Method void System.arraycopy(Object, int, Object, int, int)>
		obj1 = ((Object) ((new BigInteger(1, abyte2)).toString()));
	//   43   84:new             #574 <Class BigInteger>
	//   44   87:dup             
	//   45   88:iconst_1        
	//   46   89:aload           5
	//   47   91:invokespecial   #580 <Method void BigInteger(int, byte[])>
	//   48   94:invokevirtual   #645 <Method String BigInteger.toString()>
	//   49   97:astore_2        
		obj = obj1;
	//   50   98:aload_2         
	//   51   99:astore_1        
_L3:
		i++;
	//   52  100:iload_0         
	//   53  101:iconst_1        
	//   54  102:iadd            
	//   55  103:istore_0        
		if(true) goto _L2; else goto _L1
	//   56  104:goto            42
_L1:
		return ((String) (obj));
	//   57  107:aload_1         
	//   58  108:areturn         
		NoSuchAlgorithmException nosuchalgorithmexception;
		nosuchalgorithmexception;
	//   59  109:astore_2        
		  goto _L3
	//*  60  110:goto            100
	}

	public final void zza(Context context, String s, String s1, Bundle bundle, boolean flag)
	{
		zza(context, ((String) (null)), s1, bundle, true, ((zzamx) (new zzamv(this))));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iconst_1        
	//    5    6:new             #654 <Class zzamv>
	//    6    9:dup             
	//    7   10:aload_0         
	//    8   11:invokespecial   #657 <Method void zzamv(zzamu)>
	//    9   14:invokestatic    #659 <Method void zza(Context, String, String, Bundle, boolean, zzamx)>
	//   10   17:return          
	}

	public final void zza(ViewGroup viewgroup, zzjn zzjn1, String s)
	{
		zza(viewgroup, zzjn1, s, 0xff000000, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc2            #661 <Int 0xff000000>
	//    5    7:iconst_m1       
	//    6    8:invokespecial   #663 <Method void zza(ViewGroup, zzjn, String, int, int)>
	//    7   11:return          
	}

	public final void zza(ViewGroup viewgroup, zzjn zzjn1, String s, String s1)
	{
		zzane.zzdk(s1);
	//    0    0:aload           4
	//    1    2:invokestatic    #667 <Method void zzane.zzdk(String)>
		zza(viewgroup, zzjn1, s, 0xffff0000, 0xff000000);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:ldc2            #668 <Int 0xffff0000>
	//    7   12:ldc2            #661 <Int 0xff000000>
	//    8   15:invokespecial   #663 <Method void zza(ViewGroup, zzjn, String, int, int)>
	//    9   18:return          
	}

	private static final String zzcup = ((Class) (com/google/android/gms/ads/AdView)).getName();
	private static final String zzcuq = ((Class) (com/google/android/gms/ads/InterstitialAd)).getName();
	private static final String zzcur = ((Class) (com/google/android/gms/ads/doubleclick/PublisherAdView)).getName();
	private static final String zzcus = ((Class) (com/google/android/gms/ads/doubleclick/PublisherInterstitialAd)).getName();
	private static final String zzcut = ((Class) (com/google/android/gms/ads/search/SearchAdView)).getName();
	private static final String zzcuu = ((Class) (com/google/android/gms/ads/AdLoader)).getName();
	public static final Handler zzsy = new Handler(Looper.getMainLooper());

	static 
	{
	//    0    0:new             #18  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #24  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #28  <Method void Handler(Looper)>
	//    4   10:putstatic       #30  <Field Handler zzsy>
	//    5   13:ldc1            #32  <Class AdView>
	//    6   15:invokevirtual   #38  <Method String Class.getName()>
	//    7   18:putstatic       #40  <Field String zzcup>
	//    8   21:ldc1            #42  <Class InterstitialAd>
	//    9   23:invokevirtual   #38  <Method String Class.getName()>
	//   10   26:putstatic       #44  <Field String zzcuq>
	//   11   29:ldc1            #46  <Class PublisherAdView>
	//   12   31:invokevirtual   #38  <Method String Class.getName()>
	//   13   34:putstatic       #48  <Field String zzcur>
	//   14   37:ldc1            #50  <Class PublisherInterstitialAd>
	//   15   39:invokevirtual   #38  <Method String Class.getName()>
	//   16   42:putstatic       #52  <Field String zzcus>
	//   17   45:ldc1            #54  <Class SearchAdView>
	//   18   47:invokevirtual   #38  <Method String Class.getName()>
	//   19   50:putstatic       #56  <Field String zzcut>
	//   20   53:ldc1            #58  <Class AdLoader>
	//   21   55:invokevirtual   #38  <Method String Class.getName()>
	//   22   58:putstatic       #60  <Field String zzcuu>
	//*  23   61:return          
	}
}
