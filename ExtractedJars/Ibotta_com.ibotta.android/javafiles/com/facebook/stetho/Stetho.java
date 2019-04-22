// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.app.Application;
import android.content.Context;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.dumpapp.DumpappHttpSocketLikeHandler;
import com.facebook.stetho.dumpapp.DumpappSocketLikeHandler;
import com.facebook.stetho.dumpapp.Dumper;
import com.facebook.stetho.dumpapp.DumperPlugin;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.FilesDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.HprofDumperPlugin;
import com.facebook.stetho.dumpapp.plugins.SharedPreferencesDumperPlugin;
import com.facebook.stetho.inspector.DevtoolsSocketHandler;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.database.DatabaseFilesProvider;
import com.facebook.stetho.inspector.database.DefaultDatabaseFilesProvider;
import com.facebook.stetho.inspector.database.SqliteDatabaseDriver;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;
import com.facebook.stetho.inspector.elements.android.AndroidDocumentProviderFactory;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.module.CSS;
import com.facebook.stetho.inspector.protocol.module.Console;
import com.facebook.stetho.inspector.protocol.module.DOM;
import com.facebook.stetho.inspector.protocol.module.DOMStorage;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.Debugger;
import com.facebook.stetho.inspector.protocol.module.HeapProfiler;
import com.facebook.stetho.inspector.protocol.module.Inspector;
import com.facebook.stetho.inspector.protocol.module.Network;
import com.facebook.stetho.inspector.protocol.module.Page;
import com.facebook.stetho.inspector.protocol.module.Profiler;
import com.facebook.stetho.inspector.protocol.module.Runtime;
import com.facebook.stetho.inspector.protocol.module.Worker;
import com.facebook.stetho.inspector.runtime.RhinoDetectingRuntimeReplFactory;
import com.facebook.stetho.server.AddressNameHelper;
import com.facebook.stetho.server.LazySocketHandler;
import com.facebook.stetho.server.LocalSocketServer;
import com.facebook.stetho.server.ProtocolDetectingSocketHandler;
import com.facebook.stetho.server.ServerManager;
import com.facebook.stetho.server.SocketHandler;
import com.facebook.stetho.server.SocketHandlerFactory;
import java.util.*;

// Referenced classes of package com.facebook.stetho:
//			DumperPluginsProvider, InspectorModulesProvider

public class Stetho
{
	private static class BuilderBasedInitializer extends Initializer
	{

		protected Iterable getDumperPlugins()
		{
			DumperPluginsProvider dumperpluginsprovider = mDumperPlugins;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field DumperPluginsProvider mDumperPlugins>
		//    2    4:astore_1        
			if(dumperpluginsprovider != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          16
				return dumperpluginsprovider.get();
		//    5    9:aload_1         
		//    6   10:invokeinterface #40  <Method Iterable DumperPluginsProvider.get()>
		//    7   15:areturn         
			else
				return null;
		//    8   16:aconst_null     
		//    9   17:areturn         
		}

		protected Iterable getInspectorModules()
		{
			InspectorModulesProvider inspectormodulesprovider = mInspectorModules;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field InspectorModulesProvider mInspectorModules>
		//    2    4:astore_1        
			if(inspectormodulesprovider != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          16
				return inspectormodulesprovider.get();
		//    5    9:aload_1         
		//    6   10:invokeinterface #47  <Method Iterable InspectorModulesProvider.get()>
		//    7   15:areturn         
			else
				return null;
		//    8   16:aconst_null     
		//    9   17:areturn         
		}

		private final DumperPluginsProvider mDumperPlugins;
		private final InspectorModulesProvider mInspectorModules;

		private BuilderBasedInitializer(InitializerBuilder initializerbuilder)
		{
			super(initializerbuilder.mContext);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #20  <Field Context Stetho$InitializerBuilder.mContext>
		//    3    5:invokespecial   #23  <Method void Stetho$Initializer(Context)>
			mDumperPlugins = initializerbuilder.mDumperPlugins;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #25  <Field DumperPluginsProvider Stetho$InitializerBuilder.mDumperPlugins>
		//    7   13:putfield        #26  <Field DumperPluginsProvider mDumperPlugins>
			mInspectorModules = initializerbuilder.mInspectorModules;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #28  <Field InspectorModulesProvider Stetho$InitializerBuilder.mInspectorModules>
		//   11   21:putfield        #29  <Field InspectorModulesProvider mInspectorModules>
		//   12   24:return          
		}

	}

	public static final class DefaultDumperPluginsBuilder
	{

		private DefaultDumperPluginsBuilder provideIfDesired(DumperPlugin dumperplugin)
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

		public DefaultDumperPluginsBuilder provide(DumperPlugin dumperplugin)
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

		public DefaultDumperPluginsBuilder remove(String s)
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
		private final PluginBuilder mDelegate = new PluginBuilder();

		public DefaultDumperPluginsBuilder(Context context)
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

	public static final class DefaultInspectorModulesBuilder
	{

		private DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain chromedevtoolsdomain)
		{
			mDelegate.provideIfDesired(((Object) (chromedevtoolsdomain)).getClass().getName(), ((Object) (chromedevtoolsdomain)));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Stetho$PluginBuilder mDelegate>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #51  <Method Class Object.getClass()>
		//    4    8:invokevirtual   #57  <Method String Class.getName()>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #60  <Method void Stetho$PluginBuilder.provideIfDesired(String, Object)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private DocumentProviderFactory resolveDocumentProvider()
		{
			DocumentProviderFactory documentproviderfactory = mDocumentProvider;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field DocumentProviderFactory mDocumentProvider>
		//    2    4:astore_1        
			if(documentproviderfactory != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          11
				return documentproviderfactory;
		//    5    9:aload_1         
		//    6   10:areturn         
			if(android.os.Build.VERSION.SDK_INT >= 14)
		//*   7   11:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
		//*   8   14:bipush          14
		//*   9   16:icmplt          31
				return ((DocumentProviderFactory) (new AndroidDocumentProviderFactory(mContext)));
		//   10   19:new             #72  <Class AndroidDocumentProviderFactory>
		//   11   22:dup             
		//   12   23:aload_0         
		//   13   24:getfield        #44  <Field Application mContext>
		//   14   27:invokespecial   #75  <Method void AndroidDocumentProviderFactory(Application)>
		//   15   30:areturn         
			else
				return null;
		//   16   31:aconst_null     
		//   17   32:areturn         
		}

		public DefaultInspectorModulesBuilder databaseFiles(DatabaseFilesProvider databasefilesprovider)
		{
			mDatabaseFilesProvider = databasefilesprovider;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #80  <Field DatabaseFilesProvider mDatabaseFilesProvider>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public DefaultInspectorModulesBuilder documentProvider(DocumentProviderFactory documentproviderfactory)
		{
			mDocumentProvider = documentproviderfactory;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #64  <Field DocumentProviderFactory mDocumentProvider>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Iterable finish()
		{
			provideIfDesired(((ChromeDevtoolsDomain) (new Console())));
		//    0    0:aload_0         
		//    1    1:new             #86  <Class Console>
		//    2    4:dup             
		//    3    5:invokespecial   #87  <Method void Console()>
		//    4    8:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//    5   11:pop             
			provideIfDesired(((ChromeDevtoolsDomain) (new Debugger())));
		//    6   12:aload_0         
		//    7   13:new             #91  <Class Debugger>
		//    8   16:dup             
		//    9   17:invokespecial   #92  <Method void Debugger()>
		//   10   20:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   11   23:pop             
			Object obj = ((Object) (resolveDocumentProvider()));
		//   12   24:aload_0         
		//   13   25:invokespecial   #94  <Method DocumentProviderFactory resolveDocumentProvider()>
		//   14   28:astore_1        
			if(obj != null)
		//*  15   29:aload_1         
		//*  16   30:ifnull          68
			{
				obj = ((Object) (new Document(((DocumentProviderFactory) (obj)))));
		//   17   33:new             #96  <Class Document>
		//   18   36:dup             
		//   19   37:aload_1         
		//   20   38:invokespecial   #99  <Method void Document(DocumentProviderFactory)>
		//   21   41:astore_1        
				provideIfDesired(((ChromeDevtoolsDomain) (new DOM(((Document) (obj))))));
		//   22   42:aload_0         
		//   23   43:new             #101 <Class DOM>
		//   24   46:dup             
		//   25   47:aload_1         
		//   26   48:invokespecial   #104 <Method void DOM(Document)>
		//   27   51:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   28   54:pop             
				provideIfDesired(((ChromeDevtoolsDomain) (new CSS(((Document) (obj))))));
		//   29   55:aload_0         
		//   30   56:new             #106 <Class CSS>
		//   31   59:dup             
		//   32   60:aload_1         
		//   33   61:invokespecial   #107 <Method void CSS(Document)>
		//   34   64:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   35   67:pop             
			}
			provideIfDesired(((ChromeDevtoolsDomain) (new DOMStorage(((Context) (mContext))))));
		//   36   68:aload_0         
		//   37   69:new             #109 <Class DOMStorage>
		//   38   72:dup             
		//   39   73:aload_0         
		//   40   74:getfield        #44  <Field Application mContext>
		//   41   77:invokespecial   #111 <Method void DOMStorage(Context)>
		//   42   80:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   43   83:pop             
			provideIfDesired(((ChromeDevtoolsDomain) (new HeapProfiler())));
		//   44   84:aload_0         
		//   45   85:new             #113 <Class HeapProfiler>
		//   46   88:dup             
		//   47   89:invokespecial   #114 <Method void HeapProfiler()>
		//   48   92:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   49   95:pop             
			provideIfDesired(((ChromeDevtoolsDomain) (new Inspector())));
		//   50   96:aload_0         
		//   51   97:new             #116 <Class Inspector>
		//   52  100:dup             
		//   53  101:invokespecial   #117 <Method void Inspector()>
		//   54  104:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   55  107:pop             
			provideIfDesired(((ChromeDevtoolsDomain) (new Network(((Context) (mContext))))));
		//   56  108:aload_0         
		//   57  109:new             #119 <Class Network>
		//   58  112:dup             
		//   59  113:aload_0         
		//   60  114:getfield        #44  <Field Application mContext>
		//   61  117:invokespecial   #120 <Method void Network(Context)>
		//   62  120:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   63  123:pop             
			provideIfDesired(((ChromeDevtoolsDomain) (new Page(((Context) (mContext))))));
		//   64  124:aload_0         
		//   65  125:new             #122 <Class Page>
		//   66  128:dup             
		//   67  129:aload_0         
		//   68  130:getfield        #44  <Field Application mContext>
		//   69  133:invokespecial   #123 <Method void Page(Context)>
		//   70  136:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   71  139:pop             
			provideIfDesired(((ChromeDevtoolsDomain) (new Profiler())));
		//   72  140:aload_0         
		//   73  141:new             #125 <Class Profiler>
		//   74  144:dup             
		//   75  145:invokespecial   #126 <Method void Profiler()>
		//   76  148:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   77  151:pop             
			obj = ((Object) (mRuntimeRepl));
		//   78  152:aload_0         
		//   79  153:getfield        #128 <Field RuntimeReplFactory mRuntimeRepl>
		//   80  156:astore_1        
			if(obj == null)
		//*  81  157:aload_1         
		//*  82  158:ifnull          164
		//*  83  161:goto            176
				obj = ((Object) (new RhinoDetectingRuntimeReplFactory(((Context) (mContext)))));
		//   84  164:new             #130 <Class RhinoDetectingRuntimeReplFactory>
		//   85  167:dup             
		//   86  168:aload_0         
		//   87  169:getfield        #44  <Field Application mContext>
		//   88  172:invokespecial   #131 <Method void RhinoDetectingRuntimeReplFactory(Context)>
		//   89  175:astore_1        
			provideIfDesired(((ChromeDevtoolsDomain) (new Runtime(((RuntimeReplFactory) (obj))))));
		//   90  176:aload_0         
		//   91  177:new             #133 <Class Runtime>
		//   92  180:dup             
		//   93  181:aload_1         
		//   94  182:invokespecial   #136 <Method void Runtime(RuntimeReplFactory)>
		//   95  185:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//   96  188:pop             
			provideIfDesired(((ChromeDevtoolsDomain) (new Worker())));
		//   97  189:aload_0         
		//   98  190:new             #138 <Class Worker>
		//   99  193:dup             
		//  100  194:invokespecial   #139 <Method void Worker()>
		//  101  197:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//  102  200:pop             
			if(android.os.Build.VERSION.SDK_INT >= 11)
		//* 103  201:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
		//* 104  204:bipush          11
		//* 105  206:icmplt          303
			{
				Database database = new Database();
		//  106  209:new             #141 <Class Database>
		//  107  212:dup             
		//  108  213:invokespecial   #142 <Method void Database()>
		//  109  216:astore_2        
				Application application = mContext;
		//  110  217:aload_0         
		//  111  218:getfield        #44  <Field Application mContext>
		//  112  221:astore_3        
				Object obj1 = ((Object) (mDatabaseFilesProvider));
		//  113  222:aload_0         
		//  114  223:getfield        #80  <Field DatabaseFilesProvider mDatabaseFilesProvider>
		//  115  226:astore_1        
				if(obj1 == null)
		//* 116  227:aload_1         
		//* 117  228:ifnull          234
		//* 118  231:goto            243
					obj1 = ((Object) (new DefaultDatabaseFilesProvider(((Context) (application)))));
		//  119  234:new             #144 <Class DefaultDatabaseFilesProvider>
		//  120  237:dup             
		//  121  238:aload_3         
		//  122  239:invokespecial   #145 <Method void DefaultDatabaseFilesProvider(Context)>
		//  123  242:astore_1        
				database.add(((com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver) (new SqliteDatabaseDriver(((Context) (application)), ((DatabaseFilesProvider) (obj1))))));
		//  124  243:aload_2         
		//  125  244:new             #147 <Class SqliteDatabaseDriver>
		//  126  247:dup             
		//  127  248:aload_3         
		//  128  249:aload_1         
		//  129  250:invokespecial   #150 <Method void SqliteDatabaseDriver(Context, DatabaseFilesProvider)>
		//  130  253:invokevirtual   #154 <Method void Database.add(com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver)>
				obj1 = ((Object) (mDatabaseDrivers));
		//  131  256:aload_0         
		//  132  257:getfield        #156 <Field List mDatabaseDrivers>
		//  133  260:astore_1        
				if(obj1 != null)
		//* 134  261:aload_1         
		//* 135  262:ifnull          297
					for(obj1 = ((Object) (((List) (obj1)).iterator())); ((Iterator) (obj1)).hasNext(); database.add((com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver)((Iterator) (obj1)).next()));
		//  136  265:aload_1         
		//  137  266:invokeinterface #162 <Method Iterator List.iterator()>
		//  138  271:astore_1        
		//  139  272:aload_1         
		//  140  273:invokeinterface #168 <Method boolean Iterator.hasNext()>
		//  141  278:ifeq            297
		//  142  281:aload_2         
		//  143  282:aload_1         
		//  144  283:invokeinterface #172 <Method Object Iterator.next()>
		//  145  288:checkcast       #174 <Class com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver>
		//  146  291:invokevirtual   #154 <Method void Database.add(com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver)>
		//* 147  294:goto            272
				provideIfDesired(((ChromeDevtoolsDomain) (database)));
		//  148  297:aload_0         
		//  149  298:aload_2         
		//  150  299:invokespecial   #89  <Method Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain)>
		//  151  302:pop             
			}
			return mDelegate.finish();
		//  152  303:aload_0         
		//  153  304:getfield        #34  <Field Stetho$PluginBuilder mDelegate>
		//  154  307:invokevirtual   #176 <Method Iterable Stetho$PluginBuilder.finish()>
		//  155  310:areturn         
		}

		public DefaultInspectorModulesBuilder provide(ChromeDevtoolsDomain chromedevtoolsdomain)
		{
			mDelegate.provide(((Object) (chromedevtoolsdomain)).getClass().getName(), ((Object) (chromedevtoolsdomain)));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Stetho$PluginBuilder mDelegate>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #51  <Method Class Object.getClass()>
		//    4    8:invokevirtual   #57  <Method String Class.getName()>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #182 <Method void Stetho$PluginBuilder.provide(String, Object)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		public DefaultInspectorModulesBuilder provideDatabaseDriver(com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver databasedriver)
		{
			if(mDatabaseDrivers == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #156 <Field List mDatabaseDrivers>
		//*   2    4:ifnonnull       18
				mDatabaseDrivers = ((List) (new ArrayList()));
		//    3    7:aload_0         
		//    4    8:new             #186 <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #187 <Method void ArrayList()>
		//    7   15:putfield        #156 <Field List mDatabaseDrivers>
			mDatabaseDrivers.add(((Object) (databasedriver)));
		//    8   18:aload_0         
		//    9   19:getfield        #156 <Field List mDatabaseDrivers>
		//   10   22:aload_1         
		//   11   23:invokeinterface #190 <Method boolean List.add(Object)>
		//   12   28:pop             
			return this;
		//   13   29:aload_0         
		//   14   30:areturn         
		}

		public DefaultInspectorModulesBuilder remove(String s)
		{
			mDelegate.remove(s);
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field Stetho$PluginBuilder mDelegate>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #195 <Method void Stetho$PluginBuilder.remove(String)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public DefaultInspectorModulesBuilder runtimeRepl(RuntimeReplFactory runtimereplfactory)
		{
			mRuntimeRepl = runtimereplfactory;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #128 <Field RuntimeReplFactory mRuntimeRepl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private final Application mContext;
		private List mDatabaseDrivers;
		private DatabaseFilesProvider mDatabaseFilesProvider;
		private final PluginBuilder mDelegate = new PluginBuilder();
		private DocumentProviderFactory mDocumentProvider;
		private RuntimeReplFactory mRuntimeRepl;

		public DefaultInspectorModulesBuilder(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #29  <Class Stetho$PluginBuilder>
		//    4    8:dup             
		//    5    9:aconst_null     
		//    6   10:invokespecial   #32  <Method void Stetho$PluginBuilder(Stetho$1)>
		//    7   13:putfield        #34  <Field Stetho$PluginBuilder mDelegate>
			mContext = (Application)context.getApplicationContext();
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #40  <Method Context Context.getApplicationContext()>
		//   11   21:checkcast       #42  <Class Application>
		//   12   24:putfield        #44  <Field Application mContext>
		//   13   27:return          
		}
	}

	public static abstract class Initializer
	{

		protected abstract Iterable getDumperPlugins();

		protected abstract Iterable getInspectorModules();

		final void start()
		{
			(new ServerManager(new LocalSocketServer("main", AddressNameHelper.createCustomAddress("_devtools_remote"), ((SocketHandler) (new LazySocketHandler(((SocketHandlerFactory) (new RealSocketHandlerFactory())))))))).start();
		//    0    0:new             #35  <Class ServerManager>
		//    1    3:dup             
		//    2    4:new             #37  <Class LocalSocketServer>
		//    3    7:dup             
		//    4    8:ldc1            #39  <String "main">
		//    5   10:ldc1            #41  <String "_devtools_remote">
		//    6   12:invokestatic    #47  <Method String AddressNameHelper.createCustomAddress(String)>
		//    7   15:new             #49  <Class LazySocketHandler>
		//    8   18:dup             
		//    9   19:new             #9   <Class Stetho$Initializer$RealSocketHandlerFactory>
		//   10   22:dup             
		//   11   23:aload_0         
		//   12   24:aconst_null     
		//   13   25:invokespecial   #52  <Method void Stetho$Initializer$RealSocketHandlerFactory(Stetho$Initializer, Stetho$1)>
		//   14   28:invokespecial   #55  <Method void LazySocketHandler(SocketHandlerFactory)>
		//   15   31:invokespecial   #58  <Method void LocalSocketServer(String, String, SocketHandler)>
		//   16   34:invokespecial   #61  <Method void ServerManager(LocalSocketServer)>
		//   17   37:invokevirtual   #63  <Method void ServerManager.start()>
		//   18   40:return          
		}

		private final Context mContext;


/*
		static Context access$100(Initializer initializer)
		{
			return initializer.mContext;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Context mContext>
		//    2    4:areturn         
		}

*/

		protected Initializer(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mContext = context.getApplicationContext();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #23  <Method Context Context.getApplicationContext()>
		//    5    9:putfield        #25  <Field Context mContext>
		//    6   12:return          
		}
	}

	private class Initializer.RealSocketHandlerFactory
		implements SocketHandlerFactory
	{

		public SocketHandler create()
		{
			ProtocolDetectingSocketHandler protocoldetectingsockethandler = new ProtocolDetectingSocketHandler(mContext);
		//    0    0:new             #29  <Class ProtocolDetectingSocketHandler>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field Stetho$Initializer this$0>
		//    4    8:invokestatic    #33  <Method Context Stetho$Initializer.access$100(Stetho$Initializer)>
		//    5   11:invokespecial   #36  <Method void ProtocolDetectingSocketHandler(Context)>
		//    6   14:astore_1        
			Object obj = ((Object) (getDumperPlugins()));
		//    7   15:aload_0         
		//    8   16:getfield        #18  <Field Stetho$Initializer this$0>
		//    9   19:invokevirtual   #40  <Method Iterable Stetho$Initializer.getDumperPlugins()>
		//   10   22:astore_2        
			if(obj != null)
		//*  11   23:aload_2         
		//*  12   24:ifnull          101
			{
				obj = ((Object) (new Dumper(((Iterable) (obj)))));
		//   13   27:new             #42  <Class Dumper>
		//   14   30:dup             
		//   15   31:aload_2         
		//   16   32:invokespecial   #45  <Method void Dumper(Iterable)>
		//   17   35:astore_2        
				protocoldetectingsockethandler.addHandler(((com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher) (new com.facebook.stetho.server.ProtocolDetectingSocketHandler.ExactMagicMatcher(DumpappSocketLikeHandler.PROTOCOL_MAGIC))), ((com.facebook.stetho.server.SocketLikeHandler) (new DumpappSocketLikeHandler(((Dumper) (obj))))));
		//   18   36:aload_1         
		//   19   37:new             #47  <Class com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher>
		//   20   40:dup             
		//   21   41:getstatic       #53  <Field byte[] DumpappSocketLikeHandler.PROTOCOL_MAGIC>
		//   22   44:invokespecial   #56  <Method void com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher(byte[])>
		//   23   47:new             #49  <Class DumpappSocketLikeHandler>
		//   24   50:dup             
		//   25   51:aload_2         
		//   26   52:invokespecial   #59  <Method void DumpappSocketLikeHandler(Dumper)>
		//   27   55:invokevirtual   #63  <Method void ProtocolDetectingSocketHandler.addHandler(com.facebook.stetho.server.ProtocolDetectingSocketHandler$MagicMatcher, com.facebook.stetho.server.SocketLikeHandler)>
				obj = ((Object) (new DumpappHttpSocketLikeHandler(((Dumper) (obj)))));
		//   28   58:new             #65  <Class DumpappHttpSocketLikeHandler>
		//   29   61:dup             
		//   30   62:aload_2         
		//   31   63:invokespecial   #66  <Method void DumpappHttpSocketLikeHandler(Dumper)>
		//   32   66:astore_2        
				protocoldetectingsockethandler.addHandler(((com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher) (new com.facebook.stetho.server.ProtocolDetectingSocketHandler.ExactMagicMatcher("GET /dumpapp".getBytes()))), ((com.facebook.stetho.server.SocketLikeHandler) (obj)));
		//   33   67:aload_1         
		//   34   68:new             #47  <Class com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher>
		//   35   71:dup             
		//   36   72:ldc1            #68  <String "GET /dumpapp">
		//   37   74:invokevirtual   #74  <Method byte[] String.getBytes()>
		//   38   77:invokespecial   #56  <Method void com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher(byte[])>
		//   39   80:aload_2         
		//   40   81:invokevirtual   #63  <Method void ProtocolDetectingSocketHandler.addHandler(com.facebook.stetho.server.ProtocolDetectingSocketHandler$MagicMatcher, com.facebook.stetho.server.SocketLikeHandler)>
				protocoldetectingsockethandler.addHandler(((com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher) (new com.facebook.stetho.server.ProtocolDetectingSocketHandler.ExactMagicMatcher("POST /dumpapp".getBytes()))), ((com.facebook.stetho.server.SocketLikeHandler) (obj)));
		//   41   84:aload_1         
		//   42   85:new             #47  <Class com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher>
		//   43   88:dup             
		//   44   89:ldc1            #76  <String "POST /dumpapp">
		//   45   91:invokevirtual   #74  <Method byte[] String.getBytes()>
		//   46   94:invokespecial   #56  <Method void com.facebook.stetho.server.ProtocolDetectingSocketHandler$ExactMagicMatcher(byte[])>
		//   47   97:aload_2         
		//   48   98:invokevirtual   #63  <Method void ProtocolDetectingSocketHandler.addHandler(com.facebook.stetho.server.ProtocolDetectingSocketHandler$MagicMatcher, com.facebook.stetho.server.SocketLikeHandler)>
			}
			obj = ((Object) (getInspectorModules()));
		//   49  101:aload_0         
		//   50  102:getfield        #18  <Field Stetho$Initializer this$0>
		//   51  105:invokevirtual   #79  <Method Iterable Stetho$Initializer.getInspectorModules()>
		//   52  108:astore_2        
			if(obj != null)
		//*  53  109:aload_2         
		//*  54  110:ifnull          139
				protocoldetectingsockethandler.addHandler(((com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher) (new com.facebook.stetho.server.ProtocolDetectingSocketHandler.AlwaysMatchMatcher())), ((com.facebook.stetho.server.SocketLikeHandler) (new DevtoolsSocketHandler(mContext, ((Iterable) (obj))))));
		//   55  113:aload_1         
		//   56  114:new             #81  <Class com.facebook.stetho.server.ProtocolDetectingSocketHandler$AlwaysMatchMatcher>
		//   57  117:dup             
		//   58  118:invokespecial   #82  <Method void com.facebook.stetho.server.ProtocolDetectingSocketHandler$AlwaysMatchMatcher()>
		//   59  121:new             #84  <Class DevtoolsSocketHandler>
		//   60  124:dup             
		//   61  125:aload_0         
		//   62  126:getfield        #18  <Field Stetho$Initializer this$0>
		//   63  129:invokestatic    #33  <Method Context Stetho$Initializer.access$100(Stetho$Initializer)>
		//   64  132:aload_2         
		//   65  133:invokespecial   #87  <Method void DevtoolsSocketHandler(Context, Iterable)>
		//   66  136:invokevirtual   #63  <Method void ProtocolDetectingSocketHandler.addHandler(com.facebook.stetho.server.ProtocolDetectingSocketHandler$MagicMatcher, com.facebook.stetho.server.SocketLikeHandler)>
			return ((SocketHandler) (protocoldetectingsockethandler));
		//   67  139:aload_1         
		//   68  140:areturn         
		}

		final Initializer this$0;

		private Initializer.RealSocketHandlerFactory()
		{
			this$0 = Initializer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field Stetho$Initializer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
		//    5    9:return          
		}

	}

	public static class InitializerBuilder
	{

		public Initializer build()
		{
			return ((Initializer) (new BuilderBasedInitializer(this)));
		//    0    0:new             #35  <Class Stetho$BuilderBasedInitializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #38  <Method void Stetho$BuilderBasedInitializer(Stetho$InitializerBuilder, Stetho$1)>
		//    5    9:areturn         
		}

		public InitializerBuilder enableDumpapp(DumperPluginsProvider dumperpluginsprovider)
		{
			mDumperPlugins = (DumperPluginsProvider)Util.throwIfNull(((Object) (dumperpluginsprovider)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #46  <Method Object Util.throwIfNull(Object)>
		//    3    5:checkcast       #48  <Class DumperPluginsProvider>
		//    4    8:putfield        #50  <Field DumperPluginsProvider mDumperPlugins>
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public InitializerBuilder enableWebKitInspector(InspectorModulesProvider inspectormodulesprovider)
		{
			mInspectorModules = inspectormodulesprovider;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field InspectorModulesProvider mInspectorModules>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		final Context mContext;
		DumperPluginsProvider mDumperPlugins;
		InspectorModulesProvider mInspectorModules;

		private InitializerBuilder(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			mContext = context.getApplicationContext();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #25  <Method Context Context.getApplicationContext()>
		//    5    9:putfield        #27  <Field Context mContext>
		//    6   12:return          
		}

	}

	private static class PluginBuilder
	{

		private void throwIfFinished()
		{
			if(!mFinished)
		//*   0    0:aload_0         
		//*   1    1:getfield        #39  <Field boolean mFinished>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			else
				throw new IllegalStateException("Must not continue to build after finish()");
		//    4    8:new             #41  <Class IllegalStateException>
		//    5   11:dup             
		//    6   12:ldc1            #43  <String "Must not continue to build after finish()">
		//    7   14:invokespecial   #46  <Method void IllegalStateException(String)>
		//    8   17:athrow          
		}

		public Iterable finish()
		{
			mFinished = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #39  <Field boolean mFinished>
			return ((Iterable) (mPlugins));
		//    3    5:aload_0         
		//    4    6:getfield        #33  <Field ArrayList mPlugins>
		//    5    9:areturn         
		}

		public void provide(String s, Object obj)
		{
			throwIfFinished();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void throwIfFinished()>
			mPlugins.add(obj);
		//    2    4:aload_0         
		//    3    5:getfield        #33  <Field ArrayList mPlugins>
		//    4    8:aload_2         
		//    5    9:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
		//    6   12:pop             
			mProvidedNames.add(((Object) (s)));
		//    7   13:aload_0         
		//    8   14:getfield        #26  <Field Set mProvidedNames>
		//    9   17:aload_1         
		//   10   18:invokeinterface #61  <Method boolean Set.add(Object)>
		//   11   23:pop             
		//   12   24:return          
		}

		public void provideIfDesired(String s, Object obj)
		{
			throwIfFinished();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void throwIfFinished()>
			if(!mRemovedNames.contains(((Object) (s))) && mProvidedNames.add(((Object) (s))))
		//*   2    4:aload_0         
		//*   3    5:getfield        #28  <Field Set mRemovedNames>
		//*   4    8:aload_1         
		//*   5    9:invokeinterface #66  <Method boolean Set.contains(Object)>
		//*   6   14:ifne            39
		//*   7   17:aload_0         
		//*   8   18:getfield        #26  <Field Set mProvidedNames>
		//*   9   21:aload_1         
		//*  10   22:invokeinterface #61  <Method boolean Set.add(Object)>
		//*  11   27:ifeq            39
				mPlugins.add(obj);
		//   12   30:aload_0         
		//   13   31:getfield        #33  <Field ArrayList mPlugins>
		//   14   34:aload_2         
		//   15   35:invokevirtual   #58  <Method boolean ArrayList.add(Object)>
		//   16   38:pop             
		//   17   39:return          
		}

		public void remove(String s)
		{
			throwIfFinished();
		//    0    0:aload_0         
		//    1    1:invokespecial   #54  <Method void throwIfFinished()>
			mRemovedNames.remove(((Object) (s)));
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field Set mRemovedNames>
		//    4    8:aload_1         
		//    5    9:invokeinterface #69  <Method boolean Set.remove(Object)>
		//    6   14:pop             
		//    7   15:return          
		}

		private boolean mFinished;
		private final ArrayList mPlugins;
		private final Set mProvidedNames;
		private final Set mRemovedNames;

		private PluginBuilder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mProvidedNames = ((Set) (new HashSet()));
		//    2    4:aload_0         
		//    3    5:new             #23  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #24  <Method void HashSet()>
		//    6   12:putfield        #26  <Field Set mProvidedNames>
			mRemovedNames = ((Set) (new HashSet()));
		//    7   15:aload_0         
		//    8   16:new             #23  <Class HashSet>
		//    9   19:dup             
		//   10   20:invokespecial   #24  <Method void HashSet()>
		//   11   23:putfield        #28  <Field Set mRemovedNames>
			mPlugins = new ArrayList();
		//   12   26:aload_0         
		//   13   27:new             #30  <Class ArrayList>
		//   14   30:dup             
		//   15   31:invokespecial   #31  <Method void ArrayList()>
		//   16   34:putfield        #33  <Field ArrayList mPlugins>
		//   17   37:return          
		}

	}


	private Stetho()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	public static DumperPluginsProvider defaultDumperPluginsProvider(Context context)
	{
		return new DumperPluginsProvider(context) {

			public Iterable get()
			{
				return (new DefaultDumperPluginsBuilder(context)).finish();
			//    0    0:new             #25  <Class Stetho$DefaultDumperPluginsBuilder>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field Context val$context>
			//    4    8:invokespecial   #27  <Method void Stetho$DefaultDumperPluginsBuilder(Context)>
			//    5   11:invokevirtual   #30  <Method Iterable Stetho$DefaultDumperPluginsBuilder.finish()>
			//    6   14:areturn         
			}

			final Context val$context;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Context val$context>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class Stetho$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #41  <Method void Stetho$2(Context)>
	//    4    8:areturn         
	}

	public static InspectorModulesProvider defaultInspectorModulesProvider(Context context)
	{
		return new InspectorModulesProvider(context) {

			public Iterable get()
			{
				return (new DefaultInspectorModulesBuilder(context)).finish();
			//    0    0:new             #25  <Class Stetho$DefaultInspectorModulesBuilder>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field Context val$context>
			//    4    8:invokespecial   #27  <Method void Stetho$DefaultInspectorModulesBuilder(Context)>
			//    5   11:invokevirtual   #30  <Method Iterable Stetho$DefaultInspectorModulesBuilder.finish()>
			//    6   14:areturn         
			}

			final Context val$context;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Context val$context>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class Stetho$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #44  <Method void Stetho$3(Context)>
	//    4    8:areturn         
	}

	public static void initialize(Initializer initializer)
	{
		if(!ActivityTracker.get().beginTrackingIfPossible((Application)initializer.mContext.getApplicationContext()))
	//*   0    0:invokestatic    #52  <Method ActivityTracker ActivityTracker.get()>
	//*   1    3:aload_0         
	//*   2    4:invokestatic    #56  <Method Context Stetho$Initializer.access$100(Stetho$Initializer)>
	//*   3    7:invokevirtual   #62  <Method Context Context.getApplicationContext()>
	//*   4   10:checkcast       #64  <Class Application>
	//*   5   13:invokevirtual   #68  <Method boolean ActivityTracker.beginTrackingIfPossible(Application)>
	//*   6   16:ifne            24
			LogUtil.w("Automatic activity tracking not available on this API level, caller must invoke ActivityTracker methods manually!");
	//    7   19:ldc1            #70  <String "Automatic activity tracking not available on this API level, caller must invoke ActivityTracker methods manually!">
	//    8   21:invokestatic    #76  <Method void LogUtil.w(String)>
		initializer.start();
	//    9   24:aload_0         
	//   10   25:invokevirtual   #79  <Method void Stetho$Initializer.start()>
	//   11   28:return          
	}

	public static void initializeWithDefaults(Context context)
	{
		initialize(((Initializer) (new Initializer(context, context) {

			protected Iterable getDumperPlugins()
			{
				return (new DefaultDumperPluginsBuilder(context)).finish();
			//    0    0:new             #22  <Class Stetho$DefaultDumperPluginsBuilder>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #15  <Field Context val$context>
			//    4    8:invokespecial   #23  <Method void Stetho$DefaultDumperPluginsBuilder(Context)>
			//    5   11:invokevirtual   #26  <Method Iterable Stetho$DefaultDumperPluginsBuilder.finish()>
			//    6   14:areturn         
			}

			protected Iterable getInspectorModules()
			{
				return (new DefaultInspectorModulesBuilder(context)).finish();
			//    0    0:new             #31  <Class Stetho$DefaultInspectorModulesBuilder>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #15  <Field Context val$context>
			//    4    8:invokespecial   #32  <Method void Stetho$DefaultInspectorModulesBuilder(Context)>
			//    5   11:invokevirtual   #33  <Method Iterable Stetho$DefaultInspectorModulesBuilder.finish()>
			//    6   14:areturn         
			}

			final Context val$context;

			
			{
				context = context2;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field Context val$context>
				super(context1);
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:invokespecial   #17  <Method void Stetho$Initializer(Context)>
			//    6   10:return          
			}
		}
)));
	//    0    0:new             #6   <Class Stetho$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokespecial   #83  <Method void Stetho$1(Context, Context)>
	//    5    9:invokestatic    #85  <Method void initialize(Stetho$Initializer)>
	//    6   12:return          
	}

	public static InitializerBuilder newInitializerBuilder(Context context)
	{
		return new InitializerBuilder(context);
	//    0    0:new             #27  <Class Stetho$InitializerBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #90  <Method void Stetho$InitializerBuilder(Context, Stetho$1)>
	//    5    9:areturn         
	}
}
