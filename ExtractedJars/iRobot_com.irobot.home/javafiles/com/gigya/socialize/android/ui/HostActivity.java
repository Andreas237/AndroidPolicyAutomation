// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.SparseArray;
import com.gigya.socialize.android.GSAPI;

public class HostActivity extends FragmentActivity
{
	public static interface HostActivityHandler
	{

		public abstract void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent);

		public abstract void onCancel(FragmentActivity fragmentactivity);

		public abstract void onCreate(FragmentActivity fragmentactivity, Bundle bundle);

		public abstract void onResume(FragmentActivity fragmentactivity);

		public abstract void onStart(FragmentActivity fragmentactivity);
	}


	public HostActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void FragmentActivity()>
	//    2    4:return          
	}

	public static void addActivity(Integer integer, HostActivity hostactivity)
	{
		activities.put(integer.intValue(), ((Object) (hostactivity)));
	//    0    0:getstatic       #31  <Field SparseArray activities>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method int Integer.intValue()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #47  <Method void SparseArray.put(int, Object)>
	//    5   11:return          
	}

	public static void addHandler(Integer integer, HostActivityHandler hostactivityhandler)
	{
		handlers.put(integer.intValue(), ((Object) (hostactivityhandler)));
	//    0    0:getstatic       #33  <Field SparseArray handlers>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method int Integer.intValue()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #47  <Method void SparseArray.put(int, Object)>
	//    5   11:return          
	}

	public static Integer create(Context context, HostActivityHandler hostactivityhandler)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
		{
			return Integer.valueOf(0);
	//    2    4:iconst_0        
	//    3    5:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//    4    8:areturn         
		} else
		{
			int i = ((Object) (hostactivityhandler)).hashCode();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #60  <Method int Object.hashCode()>
	//    7   13:istore_2        
			addHandler(Integer.valueOf(i), hostactivityhandler);
	//    8   14:iload_2         
	//    9   15:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   10   18:aload_1         
	//   11   19:invokestatic    #62  <Method void addHandler(Integer, HostActivity$HostActivityHandler)>
			hostactivityhandler = ((HostActivityHandler) (new Intent(context, com/gigya/socialize/android/ui/HostActivity)));
	//   12   22:new             #64  <Class Intent>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:ldc1            #2   <Class HostActivity>
	//   16   29:invokespecial   #67  <Method void Intent(Context, Class)>
	//   17   32:astore_1        
			((Intent) (hostactivityhandler)).putExtra("id", i);
	//   18   33:aload_1         
	//   19   34:ldc1            #68  <String "id">
	//   20   36:iload_2         
	//   21   37:invokevirtual   #72  <Method Intent Intent.putExtra(String, int)>
	//   22   40:pop             
			((Intent) (hostactivityhandler)).addFlags(0x10000000);
	//   23   41:aload_1         
	//   24   42:ldc1            #73  <Int 0x10000000>
	//   25   44:invokevirtual   #77  <Method Intent Intent.addFlags(int)>
	//   26   47:pop             
			context.startActivity(((Intent) (hostactivityhandler)));
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:invokevirtual   #83  <Method void Context.startActivity(Intent)>
			return Integer.valueOf(i);
	//   30   53:iload_2         
	//   31   54:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   32   57:areturn         
		}
	}

	public static HostActivity getActivity(Integer integer)
	{
		return (HostActivity)activities.get(integer.intValue());
	//    0    0:getstatic       #31  <Field SparseArray activities>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method int Integer.intValue()>
	//    3    7:invokevirtual   #89  <Method Object SparseArray.get(int)>
	//    4   10:checkcast       #2   <Class HostActivity>
	//    5   13:areturn         
	}

	public static HostActivityHandler getHandler(Integer integer)
	{
		return (HostActivityHandler)handlers.get(integer.intValue());
	//    0    0:getstatic       #33  <Field SparseArray handlers>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method int Integer.intValue()>
	//    3    7:invokevirtual   #89  <Method Object SparseArray.get(int)>
	//    4   10:checkcast       #6   <Class HostActivity$HostActivityHandler>
	//    5   13:areturn         
	}

	public static void removeActivity(Integer integer)
	{
		activities.remove(integer.intValue());
	//    0    0:getstatic       #31  <Field SparseArray activities>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method int Integer.intValue()>
	//    3    7:invokevirtual   #97  <Method void SparseArray.remove(int)>
	//    4   10:return          
	}

	public static void removeHandler(Integer integer)
	{
		handlers.remove(integer.intValue());
	//    0    0:getstatic       #33  <Field SparseArray handlers>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method int Integer.intValue()>
	//    3    7:invokevirtual   #97  <Method void SparseArray.remove(int)>
	//    4   10:return          
	}

	public void dismissProgressDialog()
	{
		if(showingProgress && progress.isShowing())
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field boolean showingProgress>
	//*   2    4:ifeq            24
	//*   3    7:aload_0         
	//*   4    8:getfield        #103 <Field ProgressDialog progress>
	//*   5   11:invokevirtual   #109 <Method boolean ProgressDialog.isShowing()>
	//*   6   14:ifeq            24
			progress.dismiss();
	//    7   17:aload_0         
	//    8   18:getfield        #103 <Field ProgressDialog progress>
	//    9   21:invokevirtual   #112 <Method void ProgressDialog.dismiss()>
		showingProgress = false;
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:putfield        #101 <Field boolean showingProgress>
		progressTitle = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #114 <Field String progressTitle>
	//   16   34:return          
	}

	public void finish()
	{
		removeHandler(Integer.valueOf(id));
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int id>
	//    2    4:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//    3    7:invokestatic    #119 <Method void removeHandler(Integer)>
		super.finish();
	//    4   10:aload_0         
	//    5   11:invokespecial   #121 <Method void FragmentActivity.finish()>
	//    6   14:return          
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #125 <Method void FragmentActivity.onActivityResult(int, int, Intent)>
		if(handler != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//*   7   11:ifnull          27
			handler.onActivityResult(((FragmentActivity) (this)), i, j, intent);
	//    8   14:aload_0         
	//    9   15:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:aload_3         
	//   14   22:invokeinterface #130 <Method void HostActivity$HostActivityHandler.onActivityResult(FragmentActivity, int, int, Intent)>
	//   15   27:return          
	}

	public void onBackPressed()
	{
		if(handler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//*   2    4:ifnull          17
			handler.onCancel(((FragmentActivity) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//    5   11:aload_0         
	//    6   12:invokeinterface #135 <Method void HostActivity$HostActivityHandler.onCancel(FragmentActivity)>
		super.onBackPressed();
	//    7   17:aload_0         
	//    8   18:invokespecial   #137 <Method void FragmentActivity.onBackPressed()>
	//    9   21:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #141 <Method void FragmentActivity.onCreate(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       26
		{
			id = getIntent().getIntExtra("id", 0);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #145 <Method Intent getIntent()>
	//    8   14:ldc1            #68  <String "id">
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #149 <Method int Intent.getIntExtra(String, int)>
	//   11   20:putfield        #117 <Field int id>
		} else
	//*  12   23:goto            56
		{
			id = bundle.getInt("handlerId");
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:ldc1            #151 <String "handlerId">
	//   16   30:invokevirtual   #157 <Method int Bundle.getInt(String)>
	//   17   33:putfield        #117 <Field int id>
			showingProgress = bundle.getBoolean("showingProgress");
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:ldc1            #158 <String "showingProgress">
	//   21   40:invokevirtual   #162 <Method boolean Bundle.getBoolean(String)>
	//   22   43:putfield        #101 <Field boolean showingProgress>
			progressTitle = bundle.getString("progressTitle");
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:ldc1            #163 <String "progressTitle">
	//   26   50:invokevirtual   #167 <Method String Bundle.getString(String)>
	//   27   53:putfield        #114 <Field String progressTitle>
		}
		addActivity(Integer.valueOf(id), this);
	//   28   56:aload_0         
	//   29   57:getfield        #117 <Field int id>
	//   30   60:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   31   63:aload_0         
	//   32   64:invokestatic    #169 <Method void addActivity(Integer, HostActivity)>
		handler = getHandler(Integer.valueOf(id));
	//   33   67:aload_0         
	//   34   68:aload_0         
	//   35   69:getfield        #117 <Field int id>
	//   36   72:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   37   75:invokestatic    #171 <Method HostActivity$HostActivityHandler getHandler(Integer)>
	//   38   78:putfield        #127 <Field HostActivity$HostActivityHandler handler>
		if(handler != null)
	//*  39   81:aload_0         
	//*  40   82:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//*  41   85:ifnull          99
			handler.onCreate(((FragmentActivity) (this)), bundle);
	//   42   88:aload_0         
	//   43   89:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:invokeinterface #174 <Method void HostActivity$HostActivityHandler.onCreate(FragmentActivity, Bundle)>
	//   47   99:return          
	}

	protected void onDestroy()
	{
		dismissProgressDialog();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method void dismissProgressDialog()>
		removeActivity(Integer.valueOf(id));
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field int id>
	//    4    8:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//    5   11:invokestatic    #179 <Method void removeActivity(Integer)>
		super.onDestroy();
	//    6   14:aload_0         
	//    7   15:invokespecial   #181 <Method void FragmentActivity.onDestroy()>
	//    8   18:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		GSAPI.getInstance().handleAndroidPermissionsResult(i, as, ai);
	//    0    0:invokestatic    #189 <Method GSAPI GSAPI.getInstance()>
	//    1    3:iload_1         
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #193 <Method boolean GSAPI.handleAndroidPermissionsResult(int, String[], int[])>
	//    5    9:pop             
	//    6   10:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #196 <Method void FragmentActivity.onResume()>
		if(handler != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//*   4    8:ifnull          21
			handler.onResume(((FragmentActivity) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//    7   15:aload_0         
	//    8   16:invokeinterface #198 <Method void HostActivity$HostActivityHandler.onResume(FragmentActivity)>
		if(showingProgress && progress != null && !progress.isShowing())
	//*   9   21:aload_0         
	//*  10   22:getfield        #101 <Field boolean showingProgress>
	//*  11   25:ifeq            53
	//*  12   28:aload_0         
	//*  13   29:getfield        #103 <Field ProgressDialog progress>
	//*  14   32:ifnull          53
	//*  15   35:aload_0         
	//*  16   36:getfield        #103 <Field ProgressDialog progress>
	//*  17   39:invokevirtual   #109 <Method boolean ProgressDialog.isShowing()>
	//*  18   42:ifne            53
			showProgressDialog(progressTitle);
	//   19   45:aload_0         
	//   20   46:aload_0         
	//   21   47:getfield        #114 <Field String progressTitle>
	//   22   50:invokevirtual   #202 <Method void showProgressDialog(String)>
	//   23   53:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #205 <Method void FragmentActivity.onSaveInstanceState(Bundle)>
		bundle.putInt("handlerId", id);
	//    3    5:aload_1         
	//    4    6:ldc1            #151 <String "handlerId">
	//    5    8:aload_0         
	//    6    9:getfield        #117 <Field int id>
	//    7   12:invokevirtual   #209 <Method void Bundle.putInt(String, int)>
		bundle.putBoolean("showingProgress", showingProgress);
	//    8   15:aload_1         
	//    9   16:ldc1            #158 <String "showingProgress">
	//   10   18:aload_0         
	//   11   19:getfield        #101 <Field boolean showingProgress>
	//   12   22:invokevirtual   #213 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putString("progressTitle", progressTitle);
	//   13   25:aload_1         
	//   14   26:ldc1            #163 <String "progressTitle">
	//   15   28:aload_0         
	//   16   29:getfield        #114 <Field String progressTitle>
	//   17   32:invokevirtual   #217 <Method void Bundle.putString(String, String)>
	//   18   35:return          
	}

	protected void onStart()
	{
		if(handler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//*   2    4:ifnull          17
			handler.onStart(((FragmentActivity) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #127 <Field HostActivity$HostActivityHandler handler>
	//    5   11:aload_0         
	//    6   12:invokeinterface #220 <Method void HostActivity$HostActivityHandler.onStart(FragmentActivity)>
		super.onStart();
	//    7   17:aload_0         
	//    8   18:invokespecial   #222 <Method void FragmentActivity.onStart()>
	//    9   21:return          
	}

	public void showProgressDialog(String s)
	{
		showingProgress = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #101 <Field boolean showingProgress>
		progress = ProgressDialog.show(((Context) (this)), ((CharSequence) (null)), ((CharSequence) (s)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:aload_1         
	//    7    9:invokestatic    #226 <Method ProgressDialog ProgressDialog.show(Context, CharSequence, CharSequence)>
	//    8   12:putfield        #103 <Field ProgressDialog progress>
		progressTitle = s;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #114 <Field String progressTitle>
	//   12   20:return          
	}

	private static SparseArray activities = new SparseArray();
	private static SparseArray handlers = new SparseArray();
	private HostActivityHandler handler;
	private int id;
	private ProgressDialog progress;
	private String progressTitle;
	private boolean showingProgress;

	static 
	{
	//    0    0:new             #26  <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void SparseArray()>
	//    3    7:putstatic       #31  <Field SparseArray activities>
	//    4   10:new             #26  <Class SparseArray>
	//    5   13:dup             
	//    6   14:invokespecial   #29  <Method void SparseArray()>
	//    7   17:putstatic       #33  <Field SparseArray handlers>
	//*   8   20:return          
	}
}
