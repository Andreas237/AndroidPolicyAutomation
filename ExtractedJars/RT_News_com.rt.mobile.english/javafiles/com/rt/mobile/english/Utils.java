// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.rt.mobile.english;

import android.app.*;
import android.content.*;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.*;
import android.widget.Toast;
import com.google.android.gms.analytics.Tracker;
import com.nineoldandroids.view.ViewHelper;
import com.nineoldandroids.view.ViewPropertyAnimator;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.UsingFreqLimitedMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.rt.mobile.english.data.LocaleHelper;
import com.rt.mobile.english.service.FCMService;
import com.rt.mobile.english.ui.DatabaseManager;
import com.yandex.metrica.YandexMetrica;
import java.io.File;
import java.util.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package com.rt.mobile.english:
//			RTApp

public class Utils
	implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

	public Utils(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:ldc1            #56  <String "779000593693">
	//    4    7:putfield        #58  <Field String GCM_SENDER_ID>
	//    5   10:aload_0         
	//    6   11:new             #60  <Class Utils$1>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:invokespecial   #63  <Method void Utils$1(Utils)>
	//   10   19:putfield        #65  <Field butterknife.ButterKnife$Action showAction>
	//   11   22:aload_0         
	//   12   23:new             #67  <Class Utils$2>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:invokespecial   #68  <Method void Utils$2(Utils)>
	//   16   31:putfield        #70  <Field butterknife.ButterKnife$Action hideAction>
		context = context1;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #72  <Field Context context>
		getDefaultSharedPreferences().registerOnSharedPreferenceChangeListener(((android.content.SharedPreferences.OnSharedPreferenceChangeListener) (this)));
	//   20   39:aload_0         
	//   21   40:invokevirtual   #76  <Method SharedPreferences getDefaultSharedPreferences()>
	//   22   43:aload_0         
	//   23   44:invokeinterface #82  <Method void SharedPreferences.registerOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener)>
	//   24   49:return          
	}

	public static Fragment findFragmentByTag(FragmentManager fragmentmanager, String s)
	{
		Object obj;
label0:
		{
			Fragment fragment = fragmentmanager.findFragmentByTag(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #90  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//    3    5:astore_3        
			obj = ((Object) (fragment));
	//    4    6:aload_3         
	//    5    7:astore_2        
			if(fragment != null)
				break label0;
	//    6    8:aload_3         
	//    7    9:ifnonnull       85
			obj = ((Object) (fragment));
	//    8   12:aload_3         
	//    9   13:astore_2        
			if(fragmentmanager.getFragments() == null)
				break label0;
	//   10   14:aload_0         
	//   11   15:invokevirtual   #94  <Method List FragmentManager.getFragments()>
	//   12   18:ifnull          85
			Iterator iterator = fragmentmanager.getFragments().iterator();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #94  <Method List FragmentManager.getFragments()>
	//   15   25:invokeinterface #100 <Method Iterator List.iterator()>
	//   16   30:astore          4
			fragmentmanager = ((FragmentManager) (fragment));
	//   17   32:aload_3         
	//   18   33:astore_0        
			do
			{
				do
				{
					obj = ((Object) (fragmentmanager));
	//   19   34:aload_0         
	//   20   35:astore_2        
					if(!iterator.hasNext())
						break label0;
	//   21   36:aload           4
	//   22   38:invokeinterface #106 <Method boolean Iterator.hasNext()>
	//   23   43:ifeq            85
					obj = ((Object) ((Fragment)iterator.next()));
	//   24   46:aload           4
	//   25   48:invokeinterface #110 <Method Object Iterator.next()>
	//   26   53:checkcast       #112 <Class Fragment>
	//   27   56:astore_2        
				} while(obj == null || ((Fragment) (obj)).getChildFragmentManager() == null);
	//   28   57:aload_2         
	//   29   58:ifnull          34
	//   30   61:aload_2         
	//   31   62:invokevirtual   #116 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   32   65:ifnull          34
				obj = ((Object) (findFragmentByTag(((Fragment) (obj)).getChildFragmentManager(), s)));
	//   33   68:aload_2         
	//   34   69:invokevirtual   #116 <Method FragmentManager Fragment.getChildFragmentManager()>
	//   35   72:aload_1         
	//   36   73:invokestatic    #118 <Method Fragment findFragmentByTag(FragmentManager, String)>
	//   37   76:astore_2        
				fragmentmanager = ((FragmentManager) (obj));
	//   38   77:aload_2         
	//   39   78:astore_0        
			} while(obj == null);
	//   40   79:aload_2         
	//   41   80:ifnull          34
			return ((Fragment) (obj));
	//   42   83:aload_2         
	//   43   84:areturn         
		}
		return ((Fragment) (obj));
	//   44   85:aload_2         
	//   45   86:areturn         
	}

	public static int getActionBarSize(Context context1)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #122 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void TypedValue()>
	//    3    7:astore_1        
		context1.getTheme().resolveAttribute(0x7f040003, typedvalue, true);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #129 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:ldc1            #130 <Int 0x7f040003>
	//    7   14:aload_1         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #136 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   10   19:pop             
		return context1.getResources().getDimensionPixelSize(typedvalue.resourceId);
	//   11   20:aload_0         
	//   12   21:invokevirtual   #140 <Method Resources Context.getResources()>
	//   13   24:aload_1         
	//   14   25:getfield        #144 <Field int TypedValue.resourceId>
	//   15   28:invokevirtual   #150 <Method int Resources.getDimensionPixelSize(int)>
	//   16   31:ireturn         
	}

	public static Point getDisplaySize(Context context1)
	{
		context1 = ((Context) (((WindowManager)context1.getSystemService("window")).getDefaultDisplay()));
	//    0    0:aload_0         
	//    1    1:ldc1            #154 <String "window">
	//    2    3:invokevirtual   #158 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #160 <Class WindowManager>
	//    4    9:invokeinterface #164 <Method Display WindowManager.getDefaultDisplay()>
	//    5   14:astore_0        
		return new Point(((Display) (context1)).getWidth(), ((Display) (context1)).getHeight());
	//    6   15:new             #166 <Class Point>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokevirtual   #172 <Method int Display.getWidth()>
	//   10   23:aload_0         
	//   11   24:invokevirtual   #175 <Method int Display.getHeight()>
	//   12   27:invokespecial   #178 <Method void Point(int, int)>
	//   13   30:areturn         
	}

	private SharedPreferences getGcmPreferences()
	{
		return getContext().getSharedPreferences("gcm_preferences", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method Context getContext()>
	//    2    4:ldc1            #185 <String "gcm_preferences">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #189 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    5   10:areturn         
	}

	public static Utils getInstance()
	{
		if(mInstance == null)
	//*   0    0:getstatic       #193 <Field Utils mInstance>
	//*   1    3:ifnonnull       16
			throw new IllegalStateException("Utils instance not initialized yet");
	//    2    6:new             #195 <Class IllegalStateException>
	//    3    9:dup             
	//    4   10:ldc1            #197 <String "Utils instance not initialized yet">
	//    5   12:invokespecial   #200 <Method void IllegalStateException(String)>
	//    6   15:athrow          
		else
			return mInstance;
	//    7   16:getstatic       #193 <Field Utils mInstance>
	//    8   19:areturn         
	}

	public static String getMethodName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #204 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append(Thread.currentThread().getStackTrace()[3].getClassName());
	//    4    8:aload_0         
	//    5    9:invokestatic    #211 <Method Thread Thread.currentThread()>
	//    6   12:invokevirtual   #215 <Method StackTraceElement[] Thread.getStackTrace()>
	//    7   15:iconst_3        
	//    8   16:aaload          
	//    9   17:invokevirtual   #220 <Method String StackTraceElement.getClassName()>
	//   10   20:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(".");
	//   12   24:aload_0         
	//   13   25:ldc1            #226 <String ".">
	//   14   27:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		stringbuilder.append(Thread.currentThread().getStackTrace()[3].getMethodName());
	//   16   31:aload_0         
	//   17   32:invokestatic    #211 <Method Thread Thread.currentThread()>
	//   18   35:invokevirtual   #215 <Method StackTraceElement[] Thread.getStackTrace()>
	//   19   38:iconst_3        
	//   20   39:aaload          
	//   21   40:invokevirtual   #228 <Method String StackTraceElement.getMethodName()>
	//   22   43:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		return stringbuilder.toString();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   26   51:areturn         
	}

	public static String getNetworkClass()
	{
		NetworkInfo networkinfo = ((ConnectivityManager)getInstance().getContext().getSystemService("connectivity")).getActiveNetworkInfo();
	//    0    0:invokestatic    #234 <Method Utils getInstance()>
	//    1    3:invokevirtual   #183 <Method Context getContext()>
	//    2    6:ldc1            #236 <String "connectivity">
	//    3    8:invokevirtual   #158 <Method Object Context.getSystemService(String)>
	//    4   11:checkcast       #238 <Class ConnectivityManager>
	//    5   14:invokevirtual   #242 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    6   17:astore_0        
		if(networkinfo != null && networkinfo.isConnected())
	//*   7   18:aload_0         
	//*   8   19:ifnull          148
	//*   9   22:aload_0         
	//*  10   23:invokevirtual   #247 <Method boolean NetworkInfo.isConnected()>
	//*  11   26:ifne            32
	//*  12   29:goto            148
		{
			if(networkinfo.getType() == 1)
	//*  13   32:aload_0         
	//*  14   33:invokevirtual   #250 <Method int NetworkInfo.getType()>
	//*  15   36:iconst_1        
	//*  16   37:icmpne          43
				return "WIFI";
	//   17   40:ldc1            #252 <String "WIFI">
	//   18   42:areturn         
			if(networkinfo.getType() == 0)
	//*  19   43:aload_0         
	//*  20   44:invokevirtual   #250 <Method int NetworkInfo.getType()>
	//*  21   47:ifne            144
				switch(networkinfo.getSubtype())
	//*  22   50:aload_0         
	//*  23   51:invokevirtual   #255 <Method int NetworkInfo.getSubtype()>
				{
	//*  24   54:tableswitch     1 15: default 128
	//	               1 140
	//	               2 140
	//	               3 136
	//	               4 140
	//	               5 136
	//	               6 136
	//	               7 140
	//	               8 136
	//	               9 136
	//	               10 136
	//	               11 140
	//	               12 136
	//	               13 132
	//	               14 136
	//	               15 136
				default:
					return "?";
	//   25  128:ldc2            #257 <String "?">
	//   26  131:areturn         

				case 13: // '\r'
					return "4G";
	//   27  132:ldc2            #259 <String "4G">
	//   28  135:areturn         

				case 3: // '\003'
				case 5: // '\005'
				case 6: // '\006'
				case 8: // '\b'
				case 9: // '\t'
				case 10: // '\n'
				case 12: // '\f'
				case 14: // '\016'
				case 15: // '\017'
					return "3G";
	//   29  136:ldc2            #261 <String "3G">
	//   30  139:areturn         

				case 1: // '\001'
				case 2: // '\002'
				case 4: // '\004'
				case 7: // '\007'
				case 11: // '\013'
					return "2G";
	//   31  140:ldc2            #263 <String "2G">
	//   32  143:areturn         
				}
			else
				return "?";
	//   33  144:ldc2            #257 <String "?">
	//   34  147:areturn         
		} else
		{
			return "Not connected.";
	//   35  148:ldc2            #265 <String "Not connected.">
	//   36  151:areturn         
		}
	}

	public static String getStringTime(DateTime datetime)
	{
	/* block-local class not found */
	class EditionEnum {}

		if(getInstance().getLocaleVersion() == EditionEnum.EN)
	//*   0    0:invokestatic    #234 <Method Utils getInstance()>
	//*   1    3:invokevirtual   #271 <Method Utils$EditionEnum getLocaleVersion()>
	//*   2    6:getstatic       #274 <Field Utils$EditionEnum Utils$EditionEnum.EN>
	//*   3    9:if_acmpne       49
		{
			return DateUtils.getRelativeTimeSpanString(datetime.withZone((new DateTime()).getZone()).getMillis(), (new DateTime()).getMillis(), 0L).toString();
	//    4   12:aload_0         
	//    5   13:new             #276 <Class DateTime>
	//    6   16:dup             
	//    7   17:invokespecial   #277 <Method void DateTime()>
	//    8   20:invokevirtual   #281 <Method org.joda.time.DateTimeZone DateTime.getZone()>
	//    9   23:invokevirtual   #285 <Method DateTime DateTime.withZone(org.joda.time.DateTimeZone)>
	//   10   26:invokevirtual   #289 <Method long DateTime.getMillis()>
	//   11   29:new             #276 <Class DateTime>
	//   12   32:dup             
	//   13   33:invokespecial   #277 <Method void DateTime()>
	//   14   36:invokevirtual   #289 <Method long DateTime.getMillis()>
	//   15   39:lconst_0        
	//   16   40:invokestatic    #295 <Method CharSequence DateUtils.getRelativeTimeSpanString(long, long, long)>
	//   17   43:invokeinterface #298 <Method String CharSequence.toString()>
	//   18   48:areturn         
		} else
		{
			DateTimeFormatter datetimeformatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
	//   19   49:ldc2            #300 <String "yyyy-MM-dd HH:mm">
	//   20   52:invokestatic    #306 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//   21   55:astore_1        
			datetimeformatter.withLocale(Locale.getDefault());
	//   22   56:aload_1         
	//   23   57:invokestatic    #312 <Method Locale Locale.getDefault()>
	//   24   60:invokevirtual   #318 <Method DateTimeFormatter DateTimeFormatter.withLocale(Locale)>
	//   25   63:pop             
			return datetimeformatter.print(((org.joda.time.ReadableInstant) (datetime)));
	//   26   64:aload_1         
	//   27   65:aload_0         
	//   28   66:invokevirtual   #322 <Method String DateTimeFormatter.print(org.joda.time.ReadableInstant)>
	//   29   69:areturn         
		}
	}

	public static ImageLoader imageLoader()
	{
		Object obj = ((Object) ((new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder()).showImageOnLoading(((android.graphics.drawable.Drawable) (new ColorDrawable(Color.parseColor("#f0f0f0"))))).resetViewBeforeLoading(true).cacheInMemory(true).cacheOnDisk(true).considerExifParams(true).imageScaleType(ImageScaleType.EXACTLY_STRETCHED).bitmapConfig(android.graphics.Bitmap.Config.RGB_565).build()));
	//    0    0:new             #326 <Class com.nostra13.universalimageloader.core.DisplayImageOptions$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #327 <Method void com.nostra13.universalimageloader.core.DisplayImageOptions$Builder()>
	//    3    7:new             #329 <Class ColorDrawable>
	//    4   10:dup             
	//    5   11:ldc2            #331 <String "#f0f0f0">
	//    6   14:invokestatic    #337 <Method int Color.parseColor(String)>
	//    7   17:invokespecial   #340 <Method void ColorDrawable(int)>
	//    8   20:invokevirtual   #344 <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.showImageOnLoading(android.graphics.drawable.Drawable)>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #348 <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.resetViewBeforeLoading(boolean)>
	//   11   27:iconst_1        
	//   12   28:invokevirtual   #351 <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.cacheInMemory(boolean)>
	//   13   31:iconst_1        
	//   14   32:invokevirtual   #354 <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.cacheOnDisk(boolean)>
	//   15   35:iconst_1        
	//   16   36:invokevirtual   #357 <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.considerExifParams(boolean)>
	//   17   39:getstatic       #363 <Field ImageScaleType ImageScaleType.EXACTLY_STRETCHED>
	//   18   42:invokevirtual   #367 <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.imageScaleType(ImageScaleType)>
	//   19   45:getstatic       #373 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   20   48:invokevirtual   #377 <Method com.nostra13.universalimageloader.core.DisplayImageOptions$Builder com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.bitmapConfig(android.graphics.Bitmap$Config)>
	//   21   51:invokevirtual   #381 <Method com.nostra13.universalimageloader.core.DisplayImageOptions com.nostra13.universalimageloader.core.DisplayImageOptions$Builder.build()>
	//   22   54:astore_1        
		int i = (0x100000 * ((ActivityManager)getInstance().context.getSystemService("activity")).getMemoryClass()) / 8;
	//   23   55:ldc2            #382 <Int 0x100000>
	//   24   58:invokestatic    #234 <Method Utils getInstance()>
	//   25   61:getfield        #72  <Field Context context>
	//   26   64:ldc2            #384 <String "activity">
	//   27   67:invokevirtual   #158 <Method Object Context.getSystemService(String)>
	//   28   70:checkcast       #386 <Class ActivityManager>
	//   29   73:invokevirtual   #389 <Method int ActivityManager.getMemoryClass()>
	//   30   76:imul            
	//   31   77:bipush          8
	//   32   79:idiv            
	//   33   80:istore_0        
		Object obj1 = ((Object) (new StringBuilder()));
	//   34   81:new             #204 <Class StringBuilder>
	//   35   84:dup             
	//   36   85:invokespecial   #205 <Method void StringBuilder()>
	//   37   88:astore_2        
		((StringBuilder) (obj1)).append(Environment.getExternalStorageDirectory().getPath());
	//   38   89:aload_2         
	//   39   90:invokestatic    #395 <Method File Environment.getExternalStorageDirectory()>
	//   40   93:invokevirtual   #400 <Method String File.getPath()>
	//   41   96:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   42   99:pop             
		((StringBuilder) (obj1)).append("/rtnews/cache");
	//   43  100:aload_2         
	//   44  101:ldc2            #402 <String "/rtnews/cache">
	//   45  104:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   46  107:pop             
		obj1 = ((Object) (new File(((StringBuilder) (obj1)).toString())));
	//   47  108:new             #397 <Class File>
	//   48  111:dup             
	//   49  112:aload_2         
	//   50  113:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   51  116:invokespecial   #403 <Method void File(String)>
	//   52  119:astore_2        
		obj = ((Object) ((new com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder(getInstance().context)).threadPoolSize(3).threadPriority(3).denyCacheImageMultipleSizesInMemory().diskCacheFileNameGenerator(((com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator) (new Md5FileNameGenerator()))).memoryCache(((com.nostra13.universalimageloader.cache.memory.MemoryCache) (new UsingFreqLimitedMemoryCache(i)))).memoryCacheSize(i).diskCacheSize(0x1f400000).tasksProcessingOrder(QueueProcessingType.LIFO).diskCache(((com.nostra13.universalimageloader.cache.disc.DiskCache) (new UnlimitedDiskCache(((File) (obj1)))))).imageDownloader(((com.nostra13.universalimageloader.core.download.ImageDownloader) (new BaseImageDownloader(getInstance().context, 5000, 30000)))).defaultDisplayImageOptions(((com.nostra13.universalimageloader.core.DisplayImageOptions) (obj))).build()));
	//   53  120:new             #405 <Class com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder>
	//   54  123:dup             
	//   55  124:invokestatic    #234 <Method Utils getInstance()>
	//   56  127:getfield        #72  <Field Context context>
	//   57  130:invokespecial   #407 <Method void com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder(Context)>
	//   58  133:iconst_3        
	//   59  134:invokevirtual   #411 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.threadPoolSize(int)>
	//   60  137:iconst_3        
	//   61  138:invokevirtual   #414 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.threadPriority(int)>
	//   62  141:invokevirtual   #418 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.denyCacheImageMultipleSizesInMemory()>
	//   63  144:new             #420 <Class Md5FileNameGenerator>
	//   64  147:dup             
	//   65  148:invokespecial   #421 <Method void Md5FileNameGenerator()>
	//   66  151:invokevirtual   #425 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.diskCacheFileNameGenerator(com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator)>
	//   67  154:new             #427 <Class UsingFreqLimitedMemoryCache>
	//   68  157:dup             
	//   69  158:iload_0         
	//   70  159:invokespecial   #428 <Method void UsingFreqLimitedMemoryCache(int)>
	//   71  162:invokevirtual   #432 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.memoryCache(com.nostra13.universalimageloader.cache.memory.MemoryCache)>
	//   72  165:iload_0         
	//   73  166:invokevirtual   #435 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.memoryCacheSize(int)>
	//   74  169:ldc2            #436 <Int 0x1f400000>
	//   75  172:invokevirtual   #439 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.diskCacheSize(int)>
	//   76  175:getstatic       #445 <Field QueueProcessingType QueueProcessingType.LIFO>
	//   77  178:invokevirtual   #449 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.tasksProcessingOrder(QueueProcessingType)>
	//   78  181:new             #451 <Class UnlimitedDiskCache>
	//   79  184:dup             
	//   80  185:aload_2         
	//   81  186:invokespecial   #454 <Method void UnlimitedDiskCache(File)>
	//   82  189:invokevirtual   #458 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.diskCache(com.nostra13.universalimageloader.cache.disc.DiskCache)>
	//   83  192:new             #460 <Class BaseImageDownloader>
	//   84  195:dup             
	//   85  196:invokestatic    #234 <Method Utils getInstance()>
	//   86  199:getfield        #72  <Field Context context>
	//   87  202:sipush          5000
	//   88  205:sipush          30000
	//   89  208:invokespecial   #463 <Method void BaseImageDownloader(Context, int, int)>
	//   90  211:invokevirtual   #467 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.imageDownloader(com.nostra13.universalimageloader.core.download.ImageDownloader)>
	//   91  214:aload_1         
	//   92  215:invokevirtual   #471 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.defaultDisplayImageOptions(com.nostra13.universalimageloader.core.DisplayImageOptions)>
	//   93  218:invokevirtual   #474 <Method com.nostra13.universalimageloader.core.ImageLoaderConfiguration com.nostra13.universalimageloader.core.ImageLoaderConfiguration$Builder.build()>
	//   94  221:astore_1        
		ImageLoader.getInstance().init(((com.nostra13.universalimageloader.core.ImageLoaderConfiguration) (obj)));
	//   95  222:invokestatic    #478 <Method ImageLoader ImageLoader.getInstance()>
	//   96  225:aload_1         
	//   97  226:invokevirtual   #482 <Method void ImageLoader.init(com.nostra13.universalimageloader.core.ImageLoaderConfiguration)>
		return ImageLoader.getInstance();
	//   98  229:invokestatic    #478 <Method ImageLoader ImageLoader.getInstance()>
	//   99  232:areturn         
	}

	public static void setInstance(Utils utils)
	{
		mInstance = utils;
	//    0    0:aload_0         
	//    1    1:putstatic       #193 <Field Utils mInstance>
	//    2    4:return          
	}

	public static final void showErrorDialog(Context context1, String s)
	{
		(new android.app.AlertDialog.Builder(context1)).setTitle("Error").setMessage(((CharSequence) (s))).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (new _cls3()))).create().show();
	//    0    0:new             #487 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #488 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:ldc2            #490 <String "Error">
	//    5   11:invokevirtual   #494 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #497 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//    8   18:ldc2            #498 <Int 0x104000a>
	//    9   21:new             #500 <Class Utils$3>
	//   10   24:dup             
	//   11   25:invokespecial   #501 <Method void Utils$3()>
	//   12   28:invokevirtual   #505 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   13   31:invokevirtual   #509 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   14   34:invokevirtual   #514 <Method void AlertDialog.show()>
	//   15   37:return          
	}

	public static void showToast(Context context1, String s)
	{
		Toast.makeText(context1, ((CharSequence) (s)), 1).show();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #521 <Method Toast Toast.makeText(Context, CharSequence, int)>
	//    4    6:invokevirtual   #522 <Method void Toast.show()>
	//    5    9:return          
	}

	public static void showToolbarNoAnimation(View view)
	{
		if(ViewHelper.getTranslationY(view) != 0.0F)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #530 <Method float ViewHelper.getTranslationY(View)>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifeq            21
		{
			ViewPropertyAnimator.animate(view).cancel();
	//    5    9:aload_0         
	//    6   10:invokestatic    #536 <Method ViewPropertyAnimator ViewPropertyAnimator.animate(View)>
	//    7   13:invokevirtual   #539 <Method void ViewPropertyAnimator.cancel()>
			view.setY(0.0F);
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:invokevirtual   #545 <Method void View.setY(float)>
		}
	//   11   21:return          
	}

	public static boolean toolbarIsHidden(View view)
	{
		return ViewHelper.getTranslationY(view) == (float)(-view.getHeight());
	//    0    0:aload_0         
	//    1    1:invokestatic    #530 <Method float ViewHelper.getTranslationY(View)>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #548 <Method int View.getHeight()>
	//    4    8:ineg            
	//    5    9:i2f             
	//    6   10:fcmpl           
	//    7   11:ifne            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public String getAppUrl()
	{
		return context.getString(0x7f1000bf);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Context context>
	//    2    4:ldc2            #550 <Int 0x7f1000bf>
	//    3    7:invokevirtual   #554 <Method String Context.getString(int)>
	//    4   10:areturn         
	}

	public int getAppVersionCode()
	{
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		int i;
		try
		{
			i = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionCode;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method Context getContext()>
	//    2    4:invokevirtual   #561 <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #183 <Method Context getContext()>
	//    5   11:invokevirtual   #564 <Method String Context.getPackageName()>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #570 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    8   18:getfield        #575 <Field int PackageInfo.versionCode>
	//    9   21:istore_1        
		}
	//*  10   22:iload_1         
	//*  11   23:ireturn         
	//*  12   24:new             #195 <Class IllegalStateException>
	//*  13   27:dup             
	//*  14   28:ldc2            #577 <String "Current package never generate this error!">
	//*  15   31:invokespecial   #200 <Method void IllegalStateException(String)>
	//*  16   34:athrow          
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			throw new IllegalStateException("Current package never generate this error!");
		}
		return i;
	//*  17   35:astore_2        
	//*  18   36:goto            24
	}

	public Context getContext()
	{
		return context;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Context context>
	//    2    4:areturn         
	}

	public SharedPreferences getDefaultSharedPreferences()
	{
		if(defaultSharedPreferences == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #579 <Field SharedPreferences defaultSharedPreferences>
	//*   2    4:ifnonnull       18
			defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #72  <Field Context context>
	//    6   12:invokestatic    #584 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    7   15:putfield        #579 <Field SharedPreferences defaultSharedPreferences>
		return defaultSharedPreferences;
	//    8   18:aload_0         
	//    9   19:getfield        #579 <Field SharedPreferences defaultSharedPreferences>
	//   10   22:areturn         
	}

	public butterknife.ButterKnife.Action getHideAction()
	{
		return hideAction;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field butterknife.ButterKnife$Action hideAction>
	//    2    4:areturn         
	}

	public String getLocale()
	{
		return PreferenceManager.getDefaultSharedPreferences(context).getString("default_language", "none");
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Context context>
	//    2    4:invokestatic    #584 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    3    7:ldc1            #20  <String "default_language">
	//    4    9:ldc1            #26  <String "none">
	//    5   11:invokeinterface #592 <Method String SharedPreferences.getString(String, String)>
	//    6   16:areturn         
	}

	public EditionEnum getLocaleVersion()
	{
		if(mEditionEnum != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #594 <Field Utils$EditionEnum mEditionEnum>
	//*   2    4:ifnull          12
			return mEditionEnum;
	//    3    7:aload_0         
	//    4    8:getfield        #594 <Field Utils$EditionEnum mEditionEnum>
	//    5   11:areturn         
		if("ar".equals(((Object) (getLocale()))))
	//*   6   12:ldc2            #596 <String "ar">
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #598 <Method String getLocale()>
	//*   9   19:invokevirtual   #604 <Method boolean String.equals(Object)>
	//*  10   22:ifeq            35
			mEditionEnum = EditionEnum.AR;
	//   11   25:aload_0         
	//   12   26:getstatic       #607 <Field Utils$EditionEnum Utils$EditionEnum.AR>
	//   13   29:putfield        #594 <Field Utils$EditionEnum mEditionEnum>
		else
	//*  14   32:goto            134
		if("es".equals(((Object) (getLocale()))))
	//*  15   35:ldc2            #609 <String "es">
	//*  16   38:aload_0         
	//*  17   39:invokevirtual   #598 <Method String getLocale()>
	//*  18   42:invokevirtual   #604 <Method boolean String.equals(Object)>
	//*  19   45:ifeq            58
			mEditionEnum = EditionEnum.ES;
	//   20   48:aload_0         
	//   21   49:getstatic       #612 <Field Utils$EditionEnum Utils$EditionEnum.ES>
	//   22   52:putfield        #594 <Field Utils$EditionEnum mEditionEnum>
		else
	//*  23   55:goto            134
		if("fr".equals(((Object) (getLocale()))))
	//*  24   58:ldc2            #614 <String "fr">
	//*  25   61:aload_0         
	//*  26   62:invokevirtual   #598 <Method String getLocale()>
	//*  27   65:invokevirtual   #604 <Method boolean String.equals(Object)>
	//*  28   68:ifeq            81
			mEditionEnum = EditionEnum.FR;
	//   29   71:aload_0         
	//   30   72:getstatic       #617 <Field Utils$EditionEnum Utils$EditionEnum.FR>
	//   31   75:putfield        #594 <Field Utils$EditionEnum mEditionEnum>
		else
	//*  32   78:goto            134
		if("ru".equals(((Object) (getLocale()))))
	//*  33   81:ldc2            #619 <String "ru">
	//*  34   84:aload_0         
	//*  35   85:invokevirtual   #598 <Method String getLocale()>
	//*  36   88:invokevirtual   #604 <Method boolean String.equals(Object)>
	//*  37   91:ifeq            104
			mEditionEnum = EditionEnum.RU;
	//   38   94:aload_0         
	//   39   95:getstatic       #622 <Field Utils$EditionEnum Utils$EditionEnum.RU>
	//   40   98:putfield        #594 <Field Utils$EditionEnum mEditionEnum>
		else
	//*  41  101:goto            134
		if("de".equals(((Object) (getLocale()))))
	//*  42  104:ldc2            #624 <String "de">
	//*  43  107:aload_0         
	//*  44  108:invokevirtual   #598 <Method String getLocale()>
	//*  45  111:invokevirtual   #604 <Method boolean String.equals(Object)>
	//*  46  114:ifeq            127
			mEditionEnum = EditionEnum.DE;
	//   47  117:aload_0         
	//   48  118:getstatic       #627 <Field Utils$EditionEnum Utils$EditionEnum.DE>
	//   49  121:putfield        #594 <Field Utils$EditionEnum mEditionEnum>
		else
	//*  50  124:goto            134
			mEditionEnum = EditionEnum.EN;
	//   51  127:aload_0         
	//   52  128:getstatic       #274 <Field Utils$EditionEnum Utils$EditionEnum.EN>
	//   53  131:putfield        #594 <Field Utils$EditionEnum mEditionEnum>
		return mEditionEnum;
	//   54  134:aload_0         
	//   55  135:getfield        #594 <Field Utils$EditionEnum mEditionEnum>
	//   56  138:areturn         
	}

	public String getPresentation()
	{
		return getDefaultSharedPreferences().getString(context.getString(0x7f100112), context.getString(0x7f10011e));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method SharedPreferences getDefaultSharedPreferences()>
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field Context context>
	//    4    8:ldc2            #629 <Int 0x7f100112>
	//    5   11:invokevirtual   #554 <Method String Context.getString(int)>
	//    6   14:aload_0         
	//    7   15:getfield        #72  <Field Context context>
	//    8   18:ldc2            #630 <Int 0x7f10011e>
	//    9   21:invokevirtual   #554 <Method String Context.getString(int)>
	//   10   24:invokeinterface #592 <Method String SharedPreferences.getString(String, String)>
	//   11   29:areturn         
	}

	public GCMRegistrationInfo getRegistrationId()
	{
	/* block-local class not found */
	class GCMRegistrationInfo {}

		GCMRegistrationInfo gcmregistrationinfo = new GCMRegistrationInfo();
	//    0    0:new             #10  <Class Utils$GCMRegistrationInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #633 <Method void Utils$GCMRegistrationInfo(Utils)>
	//    4    8:astore_1        
		SharedPreferences sharedpreferences = getGcmPreferences();
	//    5    9:aload_0         
	//    6   10:invokespecial   #635 <Method SharedPreferences getGcmPreferences()>
	//    7   13:astore_2        
		gcmregistrationinfo.setEdition(sharedpreferences.getString("edition", "en"));
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:ldc1            #14  <String "edition">
	//   11   18:ldc2            #637 <String "en">
	//   12   21:invokeinterface #592 <Method String SharedPreferences.getString(String, String)>
	//   13   26:invokevirtual   #640 <Method void Utils$GCMRegistrationInfo.setEdition(String)>
		gcmregistrationinfo.setToken(sharedpreferences.getString("registration_id", ((String) (null))));
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:ldc1            #23  <String "registration_id">
	//   17   33:aconst_null     
	//   18   34:invokeinterface #592 <Method String SharedPreferences.getString(String, String)>
	//   19   39:invokevirtual   #643 <Method void Utils$GCMRegistrationInfo.setToken(String)>
		gcmregistrationinfo.setSubscribed(sharedpreferences.getBoolean("gcm_subscribed", false));
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:ldc1            #17  <String "gcm_subscribed">
	//   23   46:iconst_0        
	//   24   47:invokeinterface #647 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   25   52:invokevirtual   #651 <Method void Utils$GCMRegistrationInfo.setSubscribed(boolean)>
		return gcmregistrationinfo;
	//   26   55:aload_1         
	//   27   56:areturn         
	}

	public butterknife.ButterKnife.Action getShowAction()
	{
		return showAction;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field butterknife.ButterKnife$Action showAction>
	//    2    4:areturn         
	}

	public DateTimeFormatter getUTCDateFormatter()
	{
		if(utcDateTimeFormatter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #656 <Field DateTimeFormatter utcDateTimeFormatter>
	//*   2    4:ifnonnull       20
			utcDateTimeFormatter = DateTimeFormat.forPattern("yyyyMMdd'T'HHmmss").withZoneUTC();
	//    3    7:aload_0         
	//    4    8:ldc2            #658 <String "yyyyMMdd'T'HHmmss">
	//    5   11:invokestatic    #306 <Method DateTimeFormatter DateTimeFormat.forPattern(String)>
	//    6   14:invokevirtual   #661 <Method DateTimeFormatter DateTimeFormatter.withZoneUTC()>
	//    7   17:putfield        #656 <Field DateTimeFormatter utcDateTimeFormatter>
		return utcDateTimeFormatter;
	//    8   20:aload_0         
	//    9   21:getfield        #656 <Field DateTimeFormatter utcDateTimeFormatter>
	//   10   24:areturn         
	}

	public Integer getWebViewTextZoom()
	{
		return Integer.valueOf(getDefaultSharedPreferences().getInt("web_view_text_zoom", 100));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method SharedPreferences getDefaultSharedPreferences()>
	//    2    4:ldc2            #665 <String "web_view_text_zoom">
	//    3    7:bipush          100
	//    4    9:invokeinterface #669 <Method int SharedPreferences.getInt(String, int)>
	//    5   14:invokestatic    #675 <Method Integer Integer.valueOf(int)>
	//    6   17:areturn         
	}

	public boolean isFirstLaunch()
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		Object obj;
		String s;
		try
		{
			obj = ((Object) (getContext().getPackageManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method Context getContext()>
	//    2    4:invokevirtual   #561 <Method PackageManager Context.getPackageManager()>
	//    3    7:astore          4
			s = getContext().getPackageName();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #183 <Method Context getContext()>
	//    6   13:invokevirtual   #564 <Method String Context.getPackageName()>
	//    7   16:astore          5
		}
	//*   8   18:iconst_0        
	//*   9   19:istore_2        
	//*  10   20:aload           4
	//*  11   22:aload           5
	//*  12   24:iconst_0        
	//*  13   25:invokevirtual   #570 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*  14   28:astore          4
	//*  15   30:iload_2         
	//*  16   31:istore_1        
	//*  17   32:aload           4
	//*  18   34:ifnull          73
	//*  19   37:iload_2         
	//*  20   38:istore_1        
	//*  21   39:aload           4
	//*  22   41:getfield        #680 <Field long PackageInfo.firstInstallTime>
	//*  23   44:aload           4
	//*  24   46:getfield        #683 <Field long PackageInfo.lastUpdateTime>
	//*  25   49:lcmp            
	//*  26   50:ifne            73
	//*  27   53:invokestatic    #234 <Method Utils getInstance()>
	//*  28   56:invokevirtual   #598 <Method String getLocale()>
	//*  29   59:ldc1            #26  <String "none">
	//*  30   61:invokevirtual   #604 <Method boolean String.equals(Object)>
	//*  31   64:istore_3        
	//*  32   65:iload_2         
	//*  33   66:istore_1        
	//*  34   67:iload_3         
	//*  35   68:ifeq            73
	//*  36   71:iconst_1        
	//*  37   72:istore_1        
	//*  38   73:iload_1         
	//*  39   74:ireturn         
	//*  40   75:new             #204 <Class StringBuilder>
	//*  41   78:dup             
	//*  42   79:invokespecial   #205 <Method void StringBuilder()>
	//*  43   82:astore          4
	//*  44   84:aload           4
	//*  45   86:ldc2            #685 <String "Failed to get current package info with name ">
	//*  46   89:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//*  47   92:pop             
	//*  48   93:aload           4
	//*  49   95:aload_0         
	//*  50   96:invokevirtual   #183 <Method Context getContext()>
	//*  51   99:invokevirtual   #564 <Method String Context.getPackageName()>
	//*  52  102:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//*  53  105:pop             
	//*  54  106:new             #687 <Class RuntimeException>
	//*  55  109:dup             
	//*  56  110:aload           4
	//*  57  112:invokevirtual   #231 <Method String StringBuilder.toString()>
	//*  58  115:invokespecial   #688 <Method void RuntimeException(String)>
	//*  59  118:athrow          
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Failed to get current package info with name ");
			((StringBuilder) (obj)).append(getContext().getPackageName());
			throw new RuntimeException(((StringBuilder) (obj)).toString());
		}
		flag1 = false;
		obj = ((Object) (((PackageManager) (obj)).getPackageInfo(s, 0)));
		flag = flag1;
		if(obj == null)
			break MISSING_BLOCK_LABEL_73;
		flag = flag1;
		if(((PackageInfo) (obj)).firstInstallTime != ((PackageInfo) (obj)).lastUpdateTime)
			break MISSING_BLOCK_LABEL_73;
		flag2 = getInstance().getLocale().equals("none");
		flag = flag1;
		if(flag2)
			flag = true;
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		return flag;
	//*  60  119:astore          4
	//*  61  121:goto            75
	}

	public Boolean isNotificationsEnabled()
	{
		return Boolean.valueOf(PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(0x7f100111), true));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Context context>
	//    2    4:invokestatic    #584 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    3    7:aload_0         
	//    4    8:getfield        #72  <Field Context context>
	//    5   11:ldc2            #691 <Int 0x7f100111>
	//    6   14:invokevirtual   #554 <Method String Context.getString(int)>
	//    7   17:iconst_1        
	//    8   18:invokeinterface #647 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    9   23:invokestatic    #696 <Method Boolean Boolean.valueOf(boolean)>
	//   10   26:areturn         
	}

	public boolean isRtlDirectionSupports()
	{
		return getLocaleVersion() == EditionEnum.AR && android.os.Build.VERSION.SDK_INT >= 17;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #271 <Method Utils$EditionEnum getLocaleVersion()>
	//    2    4:getstatic       #607 <Field Utils$EditionEnum Utils$EditionEnum.AR>
	//    3    7:if_acmpne       20
	//    4   10:getstatic       #702 <Field int android.os.Build$VERSION.SDK_INT>
	//    5   13:bipush          17
	//    6   15:icmplt          20
	//    7   18:iconst_1        
	//    8   19:ireturn         
	//    9   20:iconst_0        
	//   10   21:ireturn         
	}

	public boolean isTablet()
	{
		int i = context.getResources().getConfiguration().screenLayout & 0xf;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Context context>
	//    2    4:invokevirtual   #140 <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #707 <Method Configuration Resources.getConfiguration()>
	//    4   10:getfield        #712 <Field int Configuration.screenLayout>
	//    5   13:bipush          15
	//    6   15:iand            
	//    7   16:istore_1        
		return i != 1 && i != 2;
	//    8   17:iload_1         
	//    9   18:iconst_1        
	//   10   19:icmpeq          29
	//   11   22:iload_1         
	//   12   23:iconst_2        
	//   13   24:icmpeq          29
	//   14   27:iconst_1        
	//   15   28:ireturn         
	//   16   29:iconst_0        
	//   17   30:ireturn         
	}

	public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
	{
		sharedpreferences = ((SharedPreferences) (new StringBuilder()));
	//    0    0:new             #204 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (sharedpreferences)).append("Shared preference changed. Key ");
	//    4    8:aload_1         
	//    5    9:ldc2            #716 <String "Shared preference changed. Key ">
	//    6   12:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (sharedpreferences)).append(s);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		Log.d("RTUtils", ((StringBuilder) (sharedpreferences)).toString());
	//   12   22:ldc1            #29  <String "RTUtils">
	//   13   24:aload_1         
	//   14   25:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #722 <Method int Log.d(String, String)>
	//   16   31:pop             
		if(s.equals(((Object) (context.getString(0x7f100111)))))
	//*  17   32:aload_2         
	//*  18   33:aload_0         
	//*  19   34:getfield        #72  <Field Context context>
	//*  20   37:ldc2            #691 <Int 0x7f100111>
	//*  21   40:invokevirtual   #554 <Method String Context.getString(int)>
	//*  22   43:invokevirtual   #604 <Method boolean String.equals(Object)>
	//*  23   46:ifeq            66
		{
			if(isNotificationsEnabled().booleanValue())
	//*  24   49:aload_0         
	//*  25   50:invokevirtual   #724 <Method Boolean isNotificationsEnabled()>
	//*  26   53:invokevirtual   #727 <Method boolean Boolean.booleanValue()>
	//*  27   56:ifeq            63
			{
				FCMService.subscribe();
	//   28   59:invokestatic    #732 <Method void FCMService.subscribe()>
				return;
	//   29   62:return          
			}
			FCMService.unsubscribe();
	//   30   63:invokestatic    #735 <Method void FCMService.unsubscribe()>
		}
	//   31   66:return          
	}

	public void sendAnalytics(Activity activity, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #204 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #205 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Tracking screen name ");
	//    4    8:aload_3         
	//    5    9:ldc2            #739 <String "Tracking screen name ">
	//    6   12:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_3         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		Log.i("RTUtils", stringbuilder.toString());
	//   12   22:ldc1            #29  <String "RTUtils">
	//   13   24:aload_3         
	//   14   25:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #742 <Method int Log.i(String, String)>
	//   16   31:pop             
		activity = ((Activity) (((RTApp)activity.getApplication()).getTracker()));
	//   17   32:aload_1         
	//   18   33:invokevirtual   #748 <Method android.app.Application Activity.getApplication()>
	//   19   36:checkcast       #750 <Class RTApp>
	//   20   39:invokevirtual   #754 <Method Tracker RTApp.getTracker()>
	//   21   42:astore_1        
		((Tracker) (activity)).setScreenName(s);
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:invokevirtual   #759 <Method void Tracker.setScreenName(String)>
		((Tracker) (activity)).send((new com.google.android.gms.analytics.HitBuilders.AppViewBuilder()).build());
	//   25   48:aload_1         
	//   26   49:new             #761 <Class com.google.android.gms.analytics.HitBuilders$AppViewBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #762 <Method void com.google.android.gms.analytics.HitBuilders$AppViewBuilder()>
	//   29   56:invokevirtual   #765 <Method Map com.google.android.gms.analytics.HitBuilders$AppViewBuilder.build()>
	//   30   59:invokevirtual   #769 <Method void Tracker.send(Map)>
		activity = ((Activity) (new HashMap()));
	//   31   62:new             #771 <Class HashMap>
	//   32   65:dup             
	//   33   66:invokespecial   #772 <Method void HashMap()>
	//   34   69:astore_1        
		((Map) (activity)).put("name", ((Object) (s)));
	//   35   70:aload_1         
	//   36   71:ldc2            #774 <String "name">
	//   37   74:aload_2         
	//   38   75:invokeinterface #780 <Method Object Map.put(Object, Object)>
	//   39   80:pop             
		((Map) (activity)).put("edition", ((Object) (getLocale())));
	//   40   81:aload_1         
	//   41   82:ldc1            #14  <String "edition">
	//   42   84:aload_0         
	//   43   85:invokevirtual   #598 <Method String getLocale()>
	//   44   88:invokeinterface #780 <Method Object Map.put(Object, Object)>
	//   45   93:pop             
		YandexMetrica.reportEvent("ScreenView", ((Map) (activity)));
	//   46   94:ldc2            #782 <String "ScreenView">
	//   47   97:aload_1         
	//   48   98:invokestatic    #788 <Method void YandexMetrica.reportEvent(String, Map)>
	//   49  101:return          
	}

	public void sendEvent(Activity activity, String s, String s1, String s2)
	{
		if(activity != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          40
			((RTApp)activity.getApplication()).getTracker().send((new com.google.android.gms.analytics.HitBuilders.EventBuilder()).setCategory(s).setAction(s1).setLabel(s2).build());
	//    2    4:aload_1         
	//    3    5:invokevirtual   #748 <Method android.app.Application Activity.getApplication()>
	//    4    8:checkcast       #750 <Class RTApp>
	//    5   11:invokevirtual   #754 <Method Tracker RTApp.getTracker()>
	//    6   14:new             #792 <Class com.google.android.gms.analytics.HitBuilders$EventBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #793 <Method void com.google.android.gms.analytics.HitBuilders$EventBuilder()>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #797 <Method com.google.android.gms.analytics.HitBuilders$EventBuilder com.google.android.gms.analytics.HitBuilders$EventBuilder.setCategory(String)>
	//   11   25:aload_3         
	//   12   26:invokevirtual   #800 <Method com.google.android.gms.analytics.HitBuilders$EventBuilder com.google.android.gms.analytics.HitBuilders$EventBuilder.setAction(String)>
	//   13   29:aload           4
	//   14   31:invokevirtual   #803 <Method com.google.android.gms.analytics.HitBuilders$EventBuilder com.google.android.gms.analytics.HitBuilders$EventBuilder.setLabel(String)>
	//   15   34:invokevirtual   #804 <Method Map com.google.android.gms.analytics.HitBuilders$EventBuilder.build()>
	//   16   37:invokevirtual   #769 <Method void Tracker.send(Map)>
		activity = ((Activity) (new HashMap()));
	//   17   40:new             #771 <Class HashMap>
	//   18   43:dup             
	//   19   44:invokespecial   #772 <Method void HashMap()>
	//   20   47:astore_1        
		((Map) (activity)).put(((Object) (s1)), ((Object) (s2)));
	//   21   48:aload_1         
	//   22   49:aload_3         
	//   23   50:aload           4
	//   24   52:invokeinterface #780 <Method Object Map.put(Object, Object)>
	//   25   57:pop             
		((Map) (activity)).put("edition", ((Object) (getLocale())));
	//   26   58:aload_1         
	//   27   59:ldc1            #14  <String "edition">
	//   28   61:aload_0         
	//   29   62:invokevirtual   #598 <Method String getLocale()>
	//   30   65:invokeinterface #780 <Method Object Map.put(Object, Object)>
	//   31   70:pop             
		YandexMetrica.reportEvent(s, ((Map) (activity)));
	//   32   71:aload_2         
	//   33   72:aload_1         
	//   34   73:invokestatic    #788 <Method void YandexMetrica.reportEvent(String, Map)>
	//   35   76:return          
	}

	public void setLocale(Context context1, String s)
	{
		String s1 = s;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(s.equals("none"))
	//*   2    2:aload_2         
	//*   3    3:ldc1            #26  <String "none">
	//*   4    5:invokevirtual   #604 <Method boolean String.equals(Object)>
	//*   5    8:ifeq            15
			s1 = "en";
	//    6   11:ldc2            #637 <String "en">
	//    7   14:astore_3        
		PreferenceManager.getDefaultSharedPreferences(context1).edit().putString("default_language", s1).apply();
	//    8   15:aload_1         
	//    9   16:invokestatic    #584 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   10   19:invokeinterface #809 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   11   24:ldc1            #20  <String "default_language">
	//   12   26:aload_3         
	//   13   27:invokeinterface #815 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   14   32:invokeinterface #818 <Method void android.content.SharedPreferences$Editor.apply()>
		context = LocaleHelper.onAttach(context1);
	//   15   37:aload_0         
	//   16   38:aload_1         
	//   17   39:invokestatic    #824 <Method Context LocaleHelper.onAttach(Context)>
	//   18   42:putfield        #72  <Field Context context>
		mEditionEnum = null;
	//   19   45:aload_0         
	//   20   46:aconst_null     
	//   21   47:putfield        #594 <Field Utils$EditionEnum mEditionEnum>
		DatabaseManager.setNulInstance();
	//   22   50:invokestatic    #829 <Method void DatabaseManager.setNulInstance()>
	//   23   53:return          
	}

	public void setRegistrationId(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       33
		{
			getGcmPreferences().edit().remove("registration_id").remove("edition").apply();
	//    2    4:aload_0         
	//    3    5:invokespecial   #635 <Method SharedPreferences getGcmPreferences()>
	//    4    8:invokeinterface #809 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:ldc1            #23  <String "registration_id">
	//    6   15:invokeinterface #834 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    7   20:ldc1            #14  <String "edition">
	//    8   22:invokeinterface #834 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    9   27:invokeinterface #818 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   10   32:return          
		} else
		{
			getGcmPreferences().edit().putString("registration_id", s).putString("edition", getLocale()).putBoolean("gcm_subscribed", false).apply();
	//   11   33:aload_0         
	//   12   34:invokespecial   #635 <Method SharedPreferences getGcmPreferences()>
	//   13   37:invokeinterface #809 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   14   42:ldc1            #23  <String "registration_id">
	//   15   44:aload_1         
	//   16   45:invokeinterface #815 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   17   50:ldc1            #14  <String "edition">
	//   18   52:aload_0         
	//   19   53:invokevirtual   #598 <Method String getLocale()>
	//   20   56:invokeinterface #815 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   21   61:ldc1            #17  <String "gcm_subscribed">
	//   22   63:iconst_0        
	//   23   64:invokeinterface #838 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   24   69:invokeinterface #818 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//   25   74:return          
		}
	}

	public void setSubscribed()
	{
		getGcmPreferences().edit().putBoolean("gcm_subscribed", true).apply();
	//    0    0:aload_0         
	//    1    1:invokespecial   #635 <Method SharedPreferences getGcmPreferences()>
	//    2    4:invokeinterface #809 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:ldc1            #17  <String "gcm_subscribed">
	//    4   11:iconst_1        
	//    5   12:invokeinterface #838 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    6   17:invokeinterface #818 <Method void android.content.SharedPreferences$Editor.apply()>
	//    7   22:return          
	}

	public void setWebViewTextZoom(Integer integer)
	{
		getDefaultSharedPreferences().edit().putInt("web_view_text_zoom", integer.intValue()).commit();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method SharedPreferences getDefaultSharedPreferences()>
	//    2    4:invokeinterface #809 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:ldc2            #665 <String "web_view_text_zoom">
	//    4   12:aload_1         
	//    5   13:invokevirtual   #843 <Method int Integer.intValue()>
	//    6   16:invokeinterface #847 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    7   21:invokeinterface #850 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//    8   26:pop             
	//    9   27:return          
	}

	public void share(Activity activity, String s, String s1)
	{
		Intent intent = new Intent("android.intent.action.SEND");
	//    0    0:new             #854 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #856 <String "android.intent.action.SEND">
	//    3    7:invokespecial   #857 <Method void Intent(String)>
	//    4   10:astore          4
		intent.setType("text/plain");
	//    5   12:aload           4
	//    6   14:ldc2            #859 <String "text/plain">
	//    7   17:invokevirtual   #863 <Method Intent Intent.setType(String)>
	//    8   20:pop             
		intent.putExtra("android.intent.extra.SUBJECT", s);
	//    9   21:aload           4
	//   10   23:ldc2            #865 <String "android.intent.extra.SUBJECT">
	//   11   26:aload_2         
	//   12   27:invokevirtual   #869 <Method Intent Intent.putExtra(String, String)>
	//   13   30:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//   14   31:new             #204 <Class StringBuilder>
	//   15   34:dup             
	//   16   35:invokespecial   #205 <Method void StringBuilder()>
	//   17   38:astore          5
		stringbuilder.append(s);
	//   18   40:aload           5
	//   19   42:aload_2         
	//   20   43:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
		stringbuilder.append(" ");
	//   22   47:aload           5
	//   23   49:ldc2            #871 <String " ">
	//   24   52:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
		stringbuilder.append(s1);
	//   26   56:aload           5
	//   27   58:aload_3         
	//   28   59:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
		intent.putExtra("android.intent.extra.TEXT", stringbuilder.toString());
	//   30   63:aload           4
	//   31   65:ldc2            #873 <String "android.intent.extra.TEXT">
	//   32   68:aload           5
	//   33   70:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   34   73:invokevirtual   #869 <Method Intent Intent.putExtra(String, String)>
	//   35   76:pop             
		getInstance().sendEvent(activity, activity.getString(0x7f100021), activity.getString(0x7f100038), s);
	//   36   77:invokestatic    #234 <Method Utils getInstance()>
	//   37   80:aload_1         
	//   38   81:aload_1         
	//   39   82:ldc2            #874 <Int 0x7f100021>
	//   40   85:invokevirtual   #875 <Method String Activity.getString(int)>
	//   41   88:aload_1         
	//   42   89:ldc2            #876 <Int 0x7f100038>
	//   43   92:invokevirtual   #875 <Method String Activity.getString(int)>
	//   44   95:aload_2         
	//   45   96:invokevirtual   #878 <Method void sendEvent(Activity, String, String, String)>
		activity.startActivity(Intent.createChooser(intent, ((CharSequence) (activity.getString(0x7f100110)))));
	//   46   99:aload_1         
	//   47  100:aload           4
	//   48  102:aload_1         
	//   49  103:ldc2            #879 <Int 0x7f100110>
	//   50  106:invokevirtual   #875 <Method String Activity.getString(int)>
	//   51  109:invokestatic    #883 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   52  112:invokevirtual   #887 <Method void Activity.startActivity(Intent)>
	//   53  115:return          
	}

	public static final String KEY_EDITION = "edition";
	public static final String KEY_GCM_SUBSCRIBED = "gcm_subscribed";
	public static final String KEY_LOCALE = "default_language";
	public static final String KEY_REGISTRATION_ID = "registration_id";
	public static final String LOCALE_NOT_SET = "none";
	private static final String TAG = "RTUtils";
	private static FragmentManager fragmentManager;
	private static Utils mInstance;
	private static String main;
	private final String GCM_SENDER_ID = "779000593693";
	private Context context;
	private SharedPreferences defaultSharedPreferences;
	private Intent gcmRS;
	private final butterknife.ButterKnife.Action hideAction = new _cls2();
	private EditionEnum mEditionEnum;
	private final butterknife.ButterKnife.Action showAction = new _cls1();
	private DateTimeFormatter utcDateTimeFormatter;

	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls3 {}

}
