// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;
import com.facebook.stetho.dumpapp.DumperPlugin;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.FilesDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.HprofDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin;

// Referenced classes of package com.facebook.stetho:
//			Stetho

public static final class Stetho$DefaultDumperPluginsBuilder
{

	private Stetho$DefaultDumperPluginsBuilder provideIfDesired(DumperPlugin dumperplugin)
	{
		mDelegate.provideIfDesired(dumperplugin.getName(), ((Object) (dumperplugin)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Stetho$PluginBuilder mDelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #35  <Method String DumperPlugin.getName()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #38  <Method void Stetho$PluginBuilder.provideIfDesired(String, Object)>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public Iterable finish()
	{
		provideIfDesired(((DumperPlugin) (new HprofDumperPlugin(mContext))));
	//    0    0:aload_0         
	//    1    1:new             #42  <Class HprofDumperPlugin>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field Context mContext>
	//    5    9:invokespecial   #44  <Method void HprofDumperPlugin(Context)>
	//    6   12:invokespecial   #46  <Method Stetho$DefaultDumperPluginsBuilder provideIfDesired(DumperPlugin)>
	//    7   15:pop             
		provideIfDesired(((DumperPlugin) (new SharedPreferencesDumperPlugin(mContext))));
	//    8   16:aload_0         
	//    9   17:new             #48  <Class SharedPreferencesDumperPlugin>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:getfield        #26  <Field Context mContext>
	//   13   25:invokespecial   #49  <Method void SharedPreferencesDumperPlugin(Context)>
	//   14   28:invokespecial   #46  <Method Stetho$DefaultDumperPluginsBuilder provideIfDesired(DumperPlugin)>
	//   15   31:pop             
		provideIfDesired(((DumperPlugin) (new CrashDumperPlugin())));
	//   16   32:aload_0         
	//   17   33:new             #51  <Class CrashDumperPlugin>
	//   18   36:dup             
	//   19   37:invokespecial   #52  <Method void CrashDumperPlugin()>
	//   20   40:invokespecial   #46  <Method Stetho$DefaultDumperPluginsBuilder provideIfDesired(DumperPlugin)>
	//   21   43:pop             
		provideIfDesired(((DumperPlugin) (new FilesDumperPlugin(mContext))));
	//   22   44:aload_0         
	//   23   45:new             #54  <Class FilesDumperPlugin>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:getfield        #26  <Field Context mContext>
	//   27   53:invokespecial   #55  <Method void FilesDumperPlugin(Context)>
	//   28   56:invokespecial   #46  <Method Stetho$DefaultDumperPluginsBuilder provideIfDesired(DumperPlugin)>
	//   29   59:pop             
		return mDelegate.finish();
	//   30   60:aload_0         
	//   31   61:getfield        #24  <Field Stetho$PluginBuilder mDelegate>
	//   32   64:invokevirtual   #57  <Method Iterable Stetho$PluginBuilder.finish()>
	//   33   67:areturn         
	}

	public Stetho$DefaultDumperPluginsBuilder provide(DumperPlugin dumperplugin)
	{
		mDelegate.provide(dumperplugin.getName(), ((Object) (dumperplugin)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Stetho$PluginBuilder mDelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #35  <Method String DumperPlugin.getName()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #62  <Method void Stetho$PluginBuilder.provide(String, Object)>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public Stetho$DefaultDumperPluginsBuilder remove(String s)
	{
		mDelegate.remove(s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Stetho$PluginBuilder mDelegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method void Stetho$PluginBuilder.remove(String)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private final Context mContext;
	private final Stetho.PluginBuilder mDelegate = new Stetho.PluginBuilder(((Stetho._cls1) (null)));

	public Stetho$DefaultDumperPluginsBuilder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class Stetho$PluginBuilder>
	//    4    8:dup             
	//    5    9:aconst_null     
	//    6   10:invokespecial   #22  <Method void Stetho$PluginBuilder(Stetho$1)>
	//    7   13:putfield        #24  <Field Stetho$PluginBuilder mDelegate>
		mContext = context;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #26  <Field Context mContext>
	//   11   21:return          
	}
}
