// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.app.Application;
import android.content.Context;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;
import com.facebook.stetho.inspector.database.DatabaseFilesProvider;
import com.facebook.stetho.inspector.database.DefaultDatabaseFilesProvider;
import com.facebook.stetho.inspector.database.SqliteDatabaseDriver;
import com.facebook.stetho.inspector.elements.Document;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;
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
import java.util.*;

// Referenced classes of package com.facebook.stetho:
//			Stetho

public static final class Stetho$DefaultInspectorModulesBuilder
{

	private Stetho$DefaultInspectorModulesBuilder provideIfDesired(ChromeDevtoolsDomain chromedevtoolsdomain)
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

	public Stetho$DefaultInspectorModulesBuilder databaseFiles(DatabaseFilesProvider databasefilesprovider)
	{
		mDatabaseFilesProvider = databasefilesprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field DatabaseFilesProvider mDatabaseFilesProvider>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Stetho$DefaultInspectorModulesBuilder documentProvider(DocumentProviderFactory documentproviderfactory)
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

	public Stetho$DefaultInspectorModulesBuilder provide(ChromeDevtoolsDomain chromedevtoolsdomain)
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

	public Stetho$DefaultInspectorModulesBuilder provideDatabaseDriver(com.facebook.stetho.inspector.protocol.module.Database.DatabaseDriver databasedriver)
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

	public Stetho$DefaultInspectorModulesBuilder remove(String s)
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

	public Stetho$DefaultInspectorModulesBuilder runtimeRepl(RuntimeReplFactory runtimereplfactory)
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
	private final Stetho.PluginBuilder mDelegate = new Stetho.PluginBuilder(((Stetho._cls1) (null)));
	private DocumentProviderFactory mDocumentProvider;
	private RuntimeReplFactory mRuntimeRepl;

	public Stetho$DefaultInspectorModulesBuilder(Context context)
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
