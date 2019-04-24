// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary.internal;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import com.squareup.leakcanary.*;
import java.io.File;
import java.util.*;

// Referenced classes of package com.squareup.leakcanary.internal:
//			DisplayLeakAdapter

public final class DisplayLeakActivity extends Activity
{

	public DisplayLeakActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Activity()>
	//    2    4:return          
	}

	static String classSimpleName(String s)
	{
		int i = s.lastIndexOf('.');
	//    0    0:aload_0         
	//    1    1:bipush          46
	//    2    3:invokevirtual   #42  <Method int String.lastIndexOf(int)>
	//    3    6:istore_1        
		if(i == -1)
	//*   4    7:iload_1         
	//*   5    8:iconst_m1       
	//*   6    9:icmpne          14
			return s;
	//    7   12:aload_0         
	//    8   13:areturn         
		else
			return s.substring(i + 1);
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:invokevirtual   #46  <Method String String.substring(int)>
	//   14   21:areturn         
	}

	public static PendingIntent createPendingIntent(Context context)
	{
		return createPendingIntent(context, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #51  <Method PendingIntent createPendingIntent(Context, String)>
	//    3    5:areturn         
	}

	public static PendingIntent createPendingIntent(Context context, String s)
	{
		Intent intent = new Intent(context, com/squareup/leakcanary/internal/DisplayLeakActivity);
	//    0    0:new             #53  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class DisplayLeakActivity>
	//    4    7:invokespecial   #56  <Method void Intent(Context, Class)>
	//    5   10:astore_2        
		intent.putExtra("show_latest", s);
	//    6   11:aload_2         
	//    7   12:ldc1            #14  <String "show_latest">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #60  <Method Intent Intent.putExtra(String, String)>
	//   10   18:pop             
		intent.setFlags(0x14000000);
	//   11   19:aload_2         
	//   12   20:ldc1            #61  <Int 0x14000000>
	//   13   22:invokevirtual   #65  <Method Intent Intent.setFlags(int)>
	//   14   25:pop             
		return PendingIntent.getActivity(context, 1, intent, 0x8000000);
	//   15   26:aload_0         
	//   16   27:iconst_1        
	//   17   28:aload_2         
	//   18   29:ldc1            #66  <Int 0x8000000>
	//   19   31:invokestatic    #72  <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   20   34:areturn         
	}

	private static LeakDirectoryProvider leakDirectoryProvider(Context context)
	{
		LeakDirectoryProvider leakdirectoryprovider = leakDirectoryProvider;
	//    0    0:getstatic       #30  <Field LeakDirectoryProvider leakDirectoryProvider>
	//    1    3:astore_2        
		Object obj = ((Object) (leakdirectoryprovider));
	//    2    4:aload_2         
	//    3    5:astore_1        
		if(leakdirectoryprovider == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       19
			obj = ((Object) (new DefaultLeakDirectoryProvider(context)));
	//    6   10:new             #75  <Class DefaultLeakDirectoryProvider>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #78  <Method void DefaultLeakDirectoryProvider(Context)>
	//   10   18:astore_1        
		return ((LeakDirectoryProvider) (obj));
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public static void setLeakDirectoryProvider(LeakDirectoryProvider leakdirectoryprovider)
	{
		leakDirectoryProvider = leakdirectoryprovider;
	//    0    0:aload_0         
	//    1    1:putstatic       #30  <Field LeakDirectoryProvider leakDirectoryProvider>
	//    2    4:return          
	}

	void deleteAllLeaks()
	{
		leakDirectoryProvider(((Context) (this))).clearLeakDirectory();
	//    0    0:aload_0         
	//    1    1:invokestatic    #83  <Method LeakDirectoryProvider leakDirectoryProvider(Context)>
	//    2    4:invokeinterface #88  <Method void LeakDirectoryProvider.clearLeakDirectory()>
		leaks = Collections.emptyList();
	//    3    9:aload_0         
	//    4   10:invokestatic    #94  <Method List Collections.emptyList()>
	//    5   13:putfield        #96  <Field List leaks>
		updateUi();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #99  <Method void updateUi()>
	//    8   20:return          
	}

	void deleteVisibleLeak()
	{
		Leak leak = getVisibleLeak();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method DisplayLeakActivity$Leak getVisibleLeak()>
	//    2    4:astore_1        
	/* block-local class not found */
	class Leak {}

		File file = leak.heapDump.heapDumpFile;
	//    3    5:aload_1         
	//    4    6:getfield        #108 <Field HeapDump DisplayLeakActivity$Leak.heapDump>
	//    5    9:getfield        #114 <Field File HeapDump.heapDumpFile>
	//    6   12:astore_2        
		File file1 = leak.resultFile;
	//    7   13:aload_1         
	//    8   14:getfield        #117 <Field File DisplayLeakActivity$Leak.resultFile>
	//    9   17:astore_3        
		if(!file1.delete())
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #123 <Method boolean File.delete()>
	//*  12   22:ifne            41
			CanaryLog.d("Could not delete result file %s", new Object[] {
				file1.getPath()
			});
	//   13   25:ldc1            #125 <String "Could not delete result file %s">
	//   14   27:iconst_1        
	//   15   28:anewarray       Object[]
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:aload_3         
	//   19   34:invokevirtual   #131 <Method String File.getPath()>
	//   20   37:aastore         
	//   21   38:invokestatic    #137 <Method void CanaryLog.d(String, Object[])>
		if(!file.delete())
	//*  22   41:aload_2         
	//*  23   42:invokevirtual   #123 <Method boolean File.delete()>
	//*  24   45:ifne            64
			CanaryLog.d("Could not delete heap dump file %s", new Object[] {
				file.getPath()
			});
	//   25   48:ldc1            #139 <String "Could not delete heap dump file %s">
	//   26   50:iconst_1        
	//   27   51:anewarray       Object[]
	//   28   54:dup             
	//   29   55:iconst_0        
	//   30   56:aload_2         
	//   31   57:invokevirtual   #131 <Method String File.getPath()>
	//   32   60:aastore         
	//   33   61:invokestatic    #137 <Method void CanaryLog.d(String, Object[])>
		visibleLeakRefKey = null;
	//   34   64:aload_0         
	//   35   65:aconst_null     
	//   36   66:putfield        #141 <Field String visibleLeakRefKey>
		leaks.remove(((Object) (leak)));
	//   37   69:aload_0         
	//   38   70:getfield        #96  <Field List leaks>
	//   39   73:aload_1         
	//   40   74:invokeinterface #147 <Method boolean List.remove(Object)>
	//   41   79:pop             
		updateUi();
	//   42   80:aload_0         
	//   43   81:invokevirtual   #99  <Method void updateUi()>
	//   44   84:return          
	}

	Leak getVisibleLeak()
	{
		if(leaks == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field List leaks>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		for(Iterator iterator = leaks.iterator(); iterator.hasNext();)
	//*   5    9:aload_0         
	//*   6   10:getfield        #96  <Field List leaks>
	//*   7   13:invokeinterface #151 <Method Iterator List.iterator()>
	//*   8   18:astore_1        
	//*   9   19:aload_1         
	//*  10   20:invokeinterface #156 <Method boolean Iterator.hasNext()>
	//*  11   25:ifeq            60
		{
			Leak leak = (Leak)iterator.next();
	//   12   28:aload_1         
	//   13   29:invokeinterface #160 <Method Object Iterator.next()>
	//   14   34:checkcast       #6   <Class DisplayLeakActivity$Leak>
	//   15   37:astore_2        
			if(leak.heapDump.referenceKey.equals(((Object) (visibleLeakRefKey))))
	//*  16   38:aload_2         
	//*  17   39:getfield        #108 <Field HeapDump DisplayLeakActivity$Leak.heapDump>
	//*  18   42:getfield        #163 <Field String HeapDump.referenceKey>
	//*  19   45:aload_0         
	//*  20   46:getfield        #141 <Field String visibleLeakRefKey>
	//*  21   49:invokevirtual   #166 <Method boolean String.equals(Object)>
	//*  22   52:ifeq            57
				return leak;
	//   23   55:aload_2         
	//   24   56:areturn         
		}

	//*  25   57:goto            19
		return null;
	//   26   60:aconst_null     
	//   27   61:areturn         
	}

	public void onBackPressed()
	{
		if(visibleLeakRefKey != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field String visibleLeakRefKey>
	//*   2    4:ifnull          17
		{
			visibleLeakRefKey = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #141 <Field String visibleLeakRefKey>
			updateUi();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #99  <Method void updateUi()>
			return;
	//    8   16:return          
		} else
		{
			super.onBackPressed();
	//    9   17:aload_0         
	//   10   18:invokespecial   #169 <Method void Activity.onBackPressed()>
			return;
	//   11   21:return          
		}
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #173 <Method void Activity.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			visibleLeakRefKey = bundle.getString("visibleLeakRefKey");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #174 <String "visibleLeakRefKey">
	//    8   13:invokevirtual   #179 <Method String Bundle.getString(String)>
	//    9   16:putfield        #141 <Field String visibleLeakRefKey>
		} else
	//*  10   19:goto            46
		{
			bundle = ((Bundle) (getIntent()));
	//   11   22:aload_0         
	//   12   23:invokevirtual   #183 <Method Intent getIntent()>
	//   13   26:astore_1        
			if(((Intent) (bundle)).hasExtra("show_latest"))
	//*  14   27:aload_1         
	//*  15   28:ldc1            #14  <String "show_latest">
	//*  16   30:invokevirtual   #187 <Method boolean Intent.hasExtra(String)>
	//*  17   33:ifeq            46
				visibleLeakRefKey = ((Intent) (bundle)).getStringExtra("show_latest");
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:ldc1            #14  <String "show_latest">
	//   21   40:invokevirtual   #190 <Method String Intent.getStringExtra(String)>
	//   22   43:putfield        #141 <Field String visibleLeakRefKey>
		}
		leaks = (List)getLastNonConfigurationInstance();
	//   23   46:aload_0         
	//   24   47:aload_0         
	//   25   48:invokevirtual   #193 <Method Object getLastNonConfigurationInstance()>
	//   26   51:checkcast       #143 <Class List>
	//   27   54:putfield        #96  <Field List leaks>
		setContentView(com.squareup.leakcanary.R.layout.leak_canary_display_leak);
	//   28   57:aload_0         
	//   29   58:getstatic       #199 <Field int com.squareup.leakcanary.R$layout.leak_canary_display_leak>
	//   30   61:invokevirtual   #203 <Method void setContentView(int)>
		listView = (ListView)findViewById(com.squareup.leakcanary.R.id.leak_canary_display_leak_list);
	//   31   64:aload_0         
	//   32   65:aload_0         
	//   33   66:getstatic       #208 <Field int com.squareup.leakcanary.R$id.leak_canary_display_leak_list>
	//   34   69:invokevirtual   #212 <Method android.view.View findViewById(int)>
	//   35   72:checkcast       #214 <Class ListView>
	//   36   75:putfield        #216 <Field ListView listView>
		failureView = (TextView)findViewById(com.squareup.leakcanary.R.id.leak_canary_display_leak_failure);
	//   37   78:aload_0         
	//   38   79:aload_0         
	//   39   80:getstatic       #219 <Field int com.squareup.leakcanary.R$id.leak_canary_display_leak_failure>
	//   40   83:invokevirtual   #212 <Method android.view.View findViewById(int)>
	//   41   86:checkcast       #221 <Class TextView>
	//   42   89:putfield        #223 <Field TextView failureView>
		actionButton = (Button)findViewById(com.squareup.leakcanary.R.id.leak_canary_action);
	//   43   92:aload_0         
	//   44   93:aload_0         
	//   45   94:getstatic       #226 <Field int com.squareup.leakcanary.R$id.leak_canary_action>
	//   46   97:invokevirtual   #212 <Method android.view.View findViewById(int)>
	//   47  100:checkcast       #228 <Class Button>
	//   48  103:putfield        #230 <Field Button actionButton>
		updateUi();
	//   49  106:aload_0         
	//   50  107:invokevirtual   #99  <Method void updateUi()>
	//   51  110:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		Leak leak = getVisibleLeak();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method DisplayLeakActivity$Leak getVisibleLeak()>
	//    2    4:astore_2        
		if(leak != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          70
		{
			menu.add(com.squareup.leakcanary.R.string.leak_canary_share_leak).setOnMenuItemClickListener(((android.view.MenuItem.OnMenuItemClickListener) (new _cls1())));
	//    5    9:aload_1         
	//    6   10:getstatic       #237 <Field int com.squareup.leakcanary.R$string.leak_canary_share_leak>
	//    7   13:invokeinterface #243 <Method MenuItem Menu.add(int)>
	//    8   18:new             #245 <Class DisplayLeakActivity$1>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #248 <Method void DisplayLeakActivity$1(DisplayLeakActivity)>
	//   12   26:invokeinterface #254 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   13   31:pop             
			if(leak.heapDump.heapDumpFile.exists())
	//*  14   32:aload_2         
	//*  15   33:getfield        #108 <Field HeapDump DisplayLeakActivity$Leak.heapDump>
	//*  16   36:getfield        #114 <Field File HeapDump.heapDumpFile>
	//*  17   39:invokevirtual   #257 <Method boolean File.exists()>
	//*  18   42:ifeq            68
				menu.add(com.squareup.leakcanary.R.string.leak_canary_share_heap_dump).setOnMenuItemClickListener(((android.view.MenuItem.OnMenuItemClickListener) (new _cls2())));
	//   19   45:aload_1         
	//   20   46:getstatic       #260 <Field int com.squareup.leakcanary.R$string.leak_canary_share_heap_dump>
	//   21   49:invokeinterface #243 <Method MenuItem Menu.add(int)>
	//   22   54:new             #262 <Class DisplayLeakActivity$2>
	//   23   57:dup             
	//   24   58:aload_0         
	//   25   59:invokespecial   #263 <Method void DisplayLeakActivity$2(DisplayLeakActivity)>
	//   26   62:invokeinterface #254 <Method MenuItem MenuItem.setOnMenuItemClickListener(android.view.MenuItem$OnMenuItemClickListener)>
	//   27   67:pop             
			return true;
	//   28   68:iconst_1        
	//   29   69:ireturn         
		} else
		{
			return false;
	//   30   70:iconst_0        
	//   31   71:ireturn         
		}
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method void Activity.onDestroy()>
	/* block-local class not found */
	class LoadLeaks {}

		LoadLeaks.forgetActivity();
	//    2    4:invokestatic    #269 <Method void DisplayLeakActivity$LoadLeaks.forgetActivity()>
	//    3    7:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #275 <Method int MenuItem.getItemId()>
	//*   2    6:ldc2            #276 <Int 0x102002c>
	//*   3    9:icmpne          21
		{
			visibleLeakRefKey = null;
	//    4   12:aload_0         
	//    5   13:aconst_null     
	//    6   14:putfield        #141 <Field String visibleLeakRefKey>
			updateUi();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #99  <Method void updateUi()>
		}
		return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #279 <Method void Activity.onResume()>
		LoadLeaks.load(this, leakDirectoryProvider(((Context) (this))));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #83  <Method LeakDirectoryProvider leakDirectoryProvider(Context)>
	//    5    9:invokestatic    #283 <Method void DisplayLeakActivity$LoadLeaks.load(DisplayLeakActivity, LeakDirectoryProvider)>
	//    6   12:return          
	}

	public Object onRetainNonConfigurationInstance()
	{
		return ((Object) (leaks));
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field List leaks>
	//    2    4:areturn         
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #287 <Method void Activity.onSaveInstanceState(Bundle)>
		bundle.putString("visibleLeakRefKey", visibleLeakRefKey);
	//    3    5:aload_1         
	//    4    6:ldc1            #174 <String "visibleLeakRefKey">
	//    5    8:aload_0         
	//    6    9:getfield        #141 <Field String visibleLeakRefKey>
	//    7   12:invokevirtual   #291 <Method void Bundle.putString(String, String)>
	//    8   15:return          
	}

	public void setTheme(int i)
	{
		if(i != com.squareup.leakcanary.R.style.leak_canary_LeakCanary_Base)
	//*   0    0:iload_1         
	//*   1    1:getstatic       #297 <Field int com.squareup.leakcanary.R$style.leak_canary_LeakCanary_Base>
	//*   2    4:icmpeq          8
		{
			return;
	//    3    7:return          
		} else
		{
			super.setTheme(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #299 <Method void Activity.setTheme(int)>
			return;
	//    7   13:return          
		}
	}

	void shareHeapDump()
	{
		File file = getVisibleLeak().heapDump.heapDumpFile;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method DisplayLeakActivity$Leak getVisibleLeak()>
	//    2    4:getfield        #108 <Field HeapDump DisplayLeakActivity$Leak.heapDump>
	//    3    7:getfield        #114 <Field File HeapDump.heapDumpFile>
	//    4   10:astore_1        
		file.setReadable(true, false);
	//    5   11:aload_1         
	//    6   12:iconst_1        
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #304 <Method boolean File.setReadable(boolean, boolean)>
	//    9   17:pop             
		Intent intent = new Intent("android.intent.action.SEND");
	//   10   18:new             #53  <Class Intent>
	//   11   21:dup             
	//   12   22:ldc2            #306 <String "android.intent.action.SEND">
	//   13   25:invokespecial   #309 <Method void Intent(String)>
	//   14   28:astore_2        
		intent.setType("application/octet-stream");
	//   15   29:aload_2         
	//   16   30:ldc2            #311 <String "application/octet-stream">
	//   17   33:invokevirtual   #315 <Method Intent Intent.setType(String)>
	//   18   36:pop             
		intent.putExtra("android.intent.extra.STREAM", ((android.os.Parcelable) (Uri.fromFile(file))));
	//   19   37:aload_2         
	//   20   38:ldc2            #317 <String "android.intent.extra.STREAM">
	//   21   41:aload_1         
	//   22   42:invokestatic    #323 <Method Uri Uri.fromFile(File)>
	//   23   45:invokevirtual   #326 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   24   48:pop             
		startActivity(Intent.createChooser(intent, ((CharSequence) (getString(com.squareup.leakcanary.R.string.leak_canary_share_with)))));
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:aload_0         
	//   28   52:getstatic       #329 <Field int com.squareup.leakcanary.R$string.leak_canary_share_with>
	//   29   55:invokevirtual   #331 <Method String getString(int)>
	//   30   58:invokestatic    #335 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   31   61:invokevirtual   #339 <Method void startActivity(Intent)>
	//   32   64:return          
	}

	void shareLeak()
	{
		Object obj = ((Object) (getVisibleLeak()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method DisplayLeakActivity$Leak getVisibleLeak()>
	//    2    4:astore_1        
		obj = ((Object) (LeakCanary.leakInfo(((Context) (this)), ((Leak) (obj)).heapDump, ((Leak) (obj)).result, true)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #108 <Field HeapDump DisplayLeakActivity$Leak.heapDump>
	//    6   10:aload_1         
	//    7   11:getfield        #344 <Field AnalysisResult DisplayLeakActivity$Leak.result>
	//    8   14:iconst_1        
	//    9   15:invokestatic    #350 <Method String LeakCanary.leakInfo(Context, HeapDump, AnalysisResult, boolean)>
	//   10   18:astore_1        
		Intent intent = new Intent("android.intent.action.SEND");
	//   11   19:new             #53  <Class Intent>
	//   12   22:dup             
	//   13   23:ldc2            #306 <String "android.intent.action.SEND">
	//   14   26:invokespecial   #309 <Method void Intent(String)>
	//   15   29:astore_2        
		intent.setType("text/plain");
	//   16   30:aload_2         
	//   17   31:ldc2            #352 <String "text/plain">
	//   18   34:invokevirtual   #315 <Method Intent Intent.setType(String)>
	//   19   37:pop             
		intent.putExtra("android.intent.extra.TEXT", ((String) (obj)));
	//   20   38:aload_2         
	//   21   39:ldc2            #354 <String "android.intent.extra.TEXT">
	//   22   42:aload_1         
	//   23   43:invokevirtual   #60  <Method Intent Intent.putExtra(String, String)>
	//   24   46:pop             
		startActivity(Intent.createChooser(intent, ((CharSequence) (getString(com.squareup.leakcanary.R.string.leak_canary_share_with)))));
	//   25   47:aload_0         
	//   26   48:aload_2         
	//   27   49:aload_0         
	//   28   50:getstatic       #329 <Field int com.squareup.leakcanary.R$string.leak_canary_share_with>
	//   29   53:invokevirtual   #331 <Method String getString(int)>
	//   30   56:invokestatic    #335 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   31   59:invokevirtual   #339 <Method void startActivity(Intent)>
	//   32   62:return          
	}

	void updateUi()
	{
		if(leaks == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field List leaks>
	//*   2    4:ifnonnull       15
		{
			setTitle("Loading leaks...");
	//    3    7:aload_0         
	//    4    8:ldc2            #356 <String "Loading leaks...">
	//    5   11:invokevirtual   #360 <Method void setTitle(CharSequence)>
			return;
	//    6   14:return          
		}
		if(leaks.isEmpty())
	//*   7   15:aload_0         
	//*   8   16:getfield        #96  <Field List leaks>
	//*   9   19:invokeinterface #363 <Method boolean List.isEmpty()>
	//*  10   24:ifeq            32
			visibleLeakRefKey = null;
	//   11   27:aload_0         
	//   12   28:aconst_null     
	//   13   29:putfield        #141 <Field String visibleLeakRefKey>
		Object obj2 = ((Object) (getVisibleLeak()));
	//   14   32:aload_0         
	//   15   33:invokevirtual   #104 <Method DisplayLeakActivity$Leak getVisibleLeak()>
	//   16   36:astore          4
		if(obj2 == null)
	//*  17   38:aload           4
	//*  18   40:ifnonnull       48
			visibleLeakRefKey = null;
	//   19   43:aload_0         
	//   20   44:aconst_null     
	//   21   45:putfield        #141 <Field String visibleLeakRefKey>
		Object obj = ((Object) (listView.getAdapter()));
	//   22   48:aload_0         
	//   23   49:getfield        #216 <Field ListView listView>
	//   24   52:invokevirtual   #367 <Method android.widget.ListAdapter ListView.getAdapter()>
	//   25   55:astore_2        
		listView.setVisibility(0);
	//   26   56:aload_0         
	//   27   57:getfield        #216 <Field ListView listView>
	//   28   60:iconst_0        
	//   29   61:invokevirtual   #370 <Method void ListView.setVisibility(int)>
		failureView.setVisibility(8);
	//   30   64:aload_0         
	//   31   65:getfield        #223 <Field TextView failureView>
	//   32   68:bipush          8
	//   33   70:invokevirtual   #371 <Method void TextView.setVisibility(int)>
		if(obj2 != null)
	//*  34   73:aload           4
	//*  35   75:ifnull          392
		{
			Object obj1 = ((Object) (((Leak) (obj2)).result));
	//   36   78:aload           4
	//   37   80:getfield        #344 <Field AnalysisResult DisplayLeakActivity$Leak.result>
	//   38   83:astore_3        
			if(((AnalysisResult) (obj1)).failure != null)
	//*  39   84:aload_3         
	//*  40   85:getfield        #377 <Field Throwable AnalysisResult.failure>
	//*  41   88:ifnull          234
			{
				listView.setVisibility(8);
	//   42   91:aload_0         
	//   43   92:getfield        #216 <Field ListView listView>
	//   44   95:bipush          8
	//   45   97:invokevirtual   #370 <Method void ListView.setVisibility(int)>
				failureView.setVisibility(0);
	//   46  100:aload_0         
	//   47  101:getfield        #223 <Field TextView failureView>
	//   48  104:iconst_0        
	//   49  105:invokevirtual   #371 <Method void TextView.setVisibility(int)>
				obj = ((Object) ((new StringBuilder()).append(getString(com.squareup.leakcanary.R.string.leak_canary_failure_report)).append("1.5.1").append(" ").append("1be44b3").append("\n").append(Log.getStackTraceString(((AnalysisResult) (obj1)).failure)).toString()));
	//   50  108:new             #379 <Class StringBuilder>
	//   51  111:dup             
	//   52  112:invokespecial   #380 <Method void StringBuilder()>
	//   53  115:aload_0         
	//   54  116:getstatic       #383 <Field int com.squareup.leakcanary.R$string.leak_canary_failure_report>
	//   55  119:invokevirtual   #331 <Method String getString(int)>
	//   56  122:invokevirtual   #387 <Method StringBuilder StringBuilder.append(String)>
	//   57  125:ldc2            #389 <String "1.5.1">
	//   58  128:invokevirtual   #387 <Method StringBuilder StringBuilder.append(String)>
	//   59  131:ldc2            #391 <String " ">
	//   60  134:invokevirtual   #387 <Method StringBuilder StringBuilder.append(String)>
	//   61  137:ldc2            #393 <String "1be44b3">
	//   62  140:invokevirtual   #387 <Method StringBuilder StringBuilder.append(String)>
	//   63  143:ldc2            #395 <String "\n">
	//   64  146:invokevirtual   #387 <Method StringBuilder StringBuilder.append(String)>
	//   65  149:aload_3         
	//   66  150:getfield        #377 <Field Throwable AnalysisResult.failure>
	//   67  153:invokestatic    #401 <Method String Log.getStackTraceString(Throwable)>
	//   68  156:invokevirtual   #387 <Method StringBuilder StringBuilder.append(String)>
	//   69  159:invokevirtual   #404 <Method String StringBuilder.toString()>
	//   70  162:astore_2        
				failureView.setText(((CharSequence) (obj)));
	//   71  163:aload_0         
	//   72  164:getfield        #223 <Field TextView failureView>
	//   73  167:aload_2         
	//   74  168:invokevirtual   #407 <Method void TextView.setText(CharSequence)>
				setTitle(com.squareup.leakcanary.R.string.leak_canary_analysis_failed);
	//   75  171:aload_0         
	//   76  172:getstatic       #410 <Field int com.squareup.leakcanary.R$string.leak_canary_analysis_failed>
	//   77  175:invokevirtual   #412 <Method void setTitle(int)>
				invalidateOptionsMenu();
	//   78  178:aload_0         
	//   79  179:invokevirtual   #415 <Method void invalidateOptionsMenu()>
				getActionBar().setDisplayHomeAsUpEnabled(true);
	//   80  182:aload_0         
	//   81  183:invokevirtual   #419 <Method ActionBar getActionBar()>
	//   82  186:iconst_1        
	//   83  187:invokevirtual   #425 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
				actionButton.setVisibility(0);
	//   84  190:aload_0         
	//   85  191:getfield        #230 <Field Button actionButton>
	//   86  194:iconst_0        
	//   87  195:invokevirtual   #426 <Method void Button.setVisibility(int)>
				actionButton.setText(com.squareup.leakcanary.R.string.leak_canary_delete);
	//   88  198:aload_0         
	//   89  199:getfield        #230 <Field Button actionButton>
	//   90  202:getstatic       #429 <Field int com.squareup.leakcanary.R$string.leak_canary_delete>
	//   91  205:invokevirtual   #431 <Method void Button.setText(int)>
				actionButton.setOnClickListener(((android.view.View.OnClickListener) (new _cls3())));
	//   92  208:aload_0         
	//   93  209:getfield        #230 <Field Button actionButton>
	//   94  212:new             #433 <Class DisplayLeakActivity$3>
	//   95  215:dup             
	//   96  216:aload_0         
	//   97  217:invokespecial   #434 <Method void DisplayLeakActivity$3(DisplayLeakActivity)>
	//   98  220:invokevirtual   #438 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
				listView.setAdapter(((android.widget.ListAdapter) (null)));
	//   99  223:aload_0         
	//  100  224:getfield        #216 <Field ListView listView>
	//  101  227:aconst_null     
	//  102  228:invokevirtual   #442 <Method void ListView.setAdapter(android.widget.ListAdapter)>
			} else
	//* 103  231:goto            391
			{
				if(obj instanceof DisplayLeakAdapter)
	//* 104  234:aload_2         
	//* 105  235:instanceof      #444 <Class DisplayLeakAdapter>
	//* 106  238:ifeq            249
				{
					obj = ((Object) ((DisplayLeakAdapter)obj));
	//  107  241:aload_2         
	//  108  242:checkcast       #444 <Class DisplayLeakAdapter>
	//  109  245:astore_2        
				} else
	//* 110  246:goto            326
				{
					obj = ((Object) (new DisplayLeakAdapter()));
	//  111  249:new             #444 <Class DisplayLeakAdapter>
	//  112  252:dup             
	//  113  253:invokespecial   #445 <Method void DisplayLeakAdapter()>
	//  114  256:astore_2        
					listView.setAdapter(((android.widget.ListAdapter) (obj)));
	//  115  257:aload_0         
	//  116  258:getfield        #216 <Field ListView listView>
	//  117  261:aload_2         
	//  118  262:invokevirtual   #442 <Method void ListView.setAdapter(android.widget.ListAdapter)>
					listView.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (new _cls4(((DisplayLeakAdapter) (obj))))));
	//  119  265:aload_0         
	//  120  266:getfield        #216 <Field ListView listView>
	//  121  269:new             #447 <Class DisplayLeakActivity$4>
	//  122  272:dup             
	//  123  273:aload_0         
	//  124  274:aload_2         
	//  125  275:invokespecial   #450 <Method void DisplayLeakActivity$4(DisplayLeakActivity, DisplayLeakAdapter)>
	//  126  278:invokevirtual   #454 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
					invalidateOptionsMenu();
	//  127  281:aload_0         
	//  128  282:invokevirtual   #415 <Method void invalidateOptionsMenu()>
					getActionBar().setDisplayHomeAsUpEnabled(true);
	//  129  285:aload_0         
	//  130  286:invokevirtual   #419 <Method ActionBar getActionBar()>
	//  131  289:iconst_1        
	//  132  290:invokevirtual   #425 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
					actionButton.setVisibility(0);
	//  133  293:aload_0         
	//  134  294:getfield        #230 <Field Button actionButton>
	//  135  297:iconst_0        
	//  136  298:invokevirtual   #426 <Method void Button.setVisibility(int)>
					actionButton.setText(com.squareup.leakcanary.R.string.leak_canary_delete);
	//  137  301:aload_0         
	//  138  302:getfield        #230 <Field Button actionButton>
	//  139  305:getstatic       #429 <Field int com.squareup.leakcanary.R$string.leak_canary_delete>
	//  140  308:invokevirtual   #431 <Method void Button.setText(int)>
					actionButton.setOnClickListener(((android.view.View.OnClickListener) (new _cls5())));
	//  141  311:aload_0         
	//  142  312:getfield        #230 <Field Button actionButton>
	//  143  315:new             #456 <Class DisplayLeakActivity$5>
	//  144  318:dup             
	//  145  319:aload_0         
	//  146  320:invokespecial   #457 <Method void DisplayLeakActivity$5(DisplayLeakActivity)>
	//  147  323:invokevirtual   #438 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
				}
				obj2 = ((Object) (((Leak) (obj2)).heapDump));
	//  148  326:aload           4
	//  149  328:getfield        #108 <Field HeapDump DisplayLeakActivity$Leak.heapDump>
	//  150  331:astore          4
				((DisplayLeakAdapter) (obj)).update(((AnalysisResult) (obj1)).leakTrace, ((HeapDump) (obj2)).referenceKey, ((HeapDump) (obj2)).referenceName);
	//  151  333:aload_2         
	//  152  334:aload_3         
	//  153  335:getfield        #461 <Field com.squareup.leakcanary.LeakTrace AnalysisResult.leakTrace>
	//  154  338:aload           4
	//  155  340:getfield        #163 <Field String HeapDump.referenceKey>
	//  156  343:aload           4
	//  157  345:getfield        #464 <Field String HeapDump.referenceName>
	//  158  348:invokevirtual   #468 <Method void DisplayLeakAdapter.update(com.squareup.leakcanary.LeakTrace, String, String)>
				obj = ((Object) (Formatter.formatShortFileSize(((Context) (this)), ((AnalysisResult) (obj1)).retainedHeapSize)));
	//  159  351:aload_0         
	//  160  352:aload_3         
	//  161  353:getfield        #472 <Field long AnalysisResult.retainedHeapSize>
	//  162  356:invokestatic    #478 <Method String Formatter.formatShortFileSize(Context, long)>
	//  163  359:astore_2        
				obj1 = ((Object) (classSimpleName(((AnalysisResult) (obj1)).className)));
	//  164  360:aload_3         
	//  165  361:getfield        #481 <Field String AnalysisResult.className>
	//  166  364:invokestatic    #483 <Method String classSimpleName(String)>
	//  167  367:astore_3        
				setTitle(((CharSequence) (getString(com.squareup.leakcanary.R.string.leak_canary_class_has_leaked, new Object[] {
					obj1, obj
				}))));
	//  168  368:aload_0         
	//  169  369:aload_0         
	//  170  370:getstatic       #486 <Field int com.squareup.leakcanary.R$string.leak_canary_class_has_leaked>
	//  171  373:iconst_2        
	//  172  374:anewarray       Object[]
	//  173  377:dup             
	//  174  378:iconst_0        
	//  175  379:aload_3         
	//  176  380:aastore         
	//  177  381:dup             
	//  178  382:iconst_1        
	//  179  383:aload_2         
	//  180  384:aastore         
	//  181  385:invokevirtual   #489 <Method String getString(int, Object[])>
	//  182  388:invokevirtual   #360 <Method void setTitle(CharSequence)>
			}
			return;
	//  183  391:return          
		}
	/* block-local class not found */
	class LeakListAdapter {}

		if(obj instanceof LeakListAdapter)
	//* 184  392:aload_2         
	//* 185  393:instanceof      #8   <Class DisplayLeakActivity$LeakListAdapter>
	//* 186  396:ifeq            409
		{
			((LeakListAdapter)obj).notifyDataSetChanged();
	//  187  399:aload_2         
	//  188  400:checkcast       #8   <Class DisplayLeakActivity$LeakListAdapter>
	//  189  403:invokevirtual   #492 <Method void DisplayLeakActivity$LeakListAdapter.notifyDataSetChanged()>
		} else
	//* 190  406:goto            500
		{
			obj = ((Object) (new LeakListAdapter()));
	//  191  409:new             #8   <Class DisplayLeakActivity$LeakListAdapter>
	//  192  412:dup             
	//  193  413:aload_0         
	//  194  414:invokespecial   #493 <Method void DisplayLeakActivity$LeakListAdapter(DisplayLeakActivity)>
	//  195  417:astore_2        
			listView.setAdapter(((android.widget.ListAdapter) (obj)));
	//  196  418:aload_0         
	//  197  419:getfield        #216 <Field ListView listView>
	//  198  422:aload_2         
	//  199  423:invokevirtual   #442 <Method void ListView.setAdapter(android.widget.ListAdapter)>
			listView.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (new _cls6())));
	//  200  426:aload_0         
	//  201  427:getfield        #216 <Field ListView listView>
	//  202  430:new             #495 <Class DisplayLeakActivity$6>
	//  203  433:dup             
	//  204  434:aload_0         
	//  205  435:invokespecial   #496 <Method void DisplayLeakActivity$6(DisplayLeakActivity)>
	//  206  438:invokevirtual   #454 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			invalidateOptionsMenu();
	//  207  441:aload_0         
	//  208  442:invokevirtual   #415 <Method void invalidateOptionsMenu()>
			setTitle(((CharSequence) (getString(com.squareup.leakcanary.R.string.leak_canary_leak_list_title, new Object[] {
				getPackageName()
			}))));
	//  209  445:aload_0         
	//  210  446:aload_0         
	//  211  447:getstatic       #499 <Field int com.squareup.leakcanary.R$string.leak_canary_leak_list_title>
	//  212  450:iconst_1        
	//  213  451:anewarray       Object[]
	//  214  454:dup             
	//  215  455:iconst_0        
	//  216  456:aload_0         
	//  217  457:invokevirtual   #502 <Method String getPackageName()>
	//  218  460:aastore         
	//  219  461:invokevirtual   #489 <Method String getString(int, Object[])>
	//  220  464:invokevirtual   #360 <Method void setTitle(CharSequence)>
			getActionBar().setDisplayHomeAsUpEnabled(false);
	//  221  467:aload_0         
	//  222  468:invokevirtual   #419 <Method ActionBar getActionBar()>
	//  223  471:iconst_0        
	//  224  472:invokevirtual   #425 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
			actionButton.setText(com.squareup.leakcanary.R.string.leak_canary_delete_all);
	//  225  475:aload_0         
	//  226  476:getfield        #230 <Field Button actionButton>
	//  227  479:getstatic       #505 <Field int com.squareup.leakcanary.R$string.leak_canary_delete_all>
	//  228  482:invokevirtual   #431 <Method void Button.setText(int)>
			actionButton.setOnClickListener(((android.view.View.OnClickListener) (new _cls7())));
	//  229  485:aload_0         
	//  230  486:getfield        #230 <Field Button actionButton>
	//  231  489:new             #507 <Class DisplayLeakActivity$7>
	//  232  492:dup             
	//  233  493:aload_0         
	//  234  494:invokespecial   #508 <Method void DisplayLeakActivity$7(DisplayLeakActivity)>
	//  235  497:invokevirtual   #438 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		}
		obj = ((Object) (actionButton));
	//  236  500:aload_0         
	//  237  501:getfield        #230 <Field Button actionButton>
	//  238  504:astore_2        
		byte byte0;
		if(leaks.size() == 0)
	//* 239  505:aload_0         
	//* 240  506:getfield        #96  <Field List leaks>
	//* 241  509:invokeinterface #511 <Method int List.size()>
	//* 242  514:ifne            523
			byte0 = 8;
	//  243  517:bipush          8
	//  244  519:istore_1        
		else
	//* 245  520:goto            525
			byte0 = 0;
	//  246  523:iconst_0        
	//  247  524:istore_1        
		((Button) (obj)).setVisibility(((int) (byte0)));
	//  248  525:aload_2         
	//  249  526:iload_1         
	//  250  527:invokevirtual   #426 <Method void Button.setVisibility(int)>
	//  251  530:return          
	}

	private static final String SHOW_LEAK_EXTRA = "show_latest";
	private static LeakDirectoryProvider leakDirectoryProvider = null;
	private Button actionButton;
	private TextView failureView;
	List leaks;
	private ListView listView;
	String visibleLeakRefKey;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #30  <Field LeakDirectoryProvider leakDirectoryProvider>
	//*   2    4:return          
	}

	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls3 {}


	/* member class not found */
	class _cls4 {}


	/* member class not found */
	class _cls5 {}


	/* member class not found */
	class _cls6 {}


	/* member class not found */
	class _cls7 {}

}
