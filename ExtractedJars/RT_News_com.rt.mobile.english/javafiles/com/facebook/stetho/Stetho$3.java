// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;
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
import java.util.ArrayList;

// Referenced classes of package com.facebook.stetho:
//			InspectorModulesProvider, Stetho

static final class Stetho$3
	implements InspectorModulesProvider
{

	public Iterable get()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #25  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist.add(((Object) (new Console())));
	//    4    8:aload_1         
	//    5    9:new             #28  <Class Console>
	//    6   12:dup             
	//    7   13:invokespecial   #29  <Method void Console()>
	//    8   16:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//    9   19:pop             
		arraylist.add(((Object) (new CSS())));
	//   10   20:aload_1         
	//   11   21:new             #35  <Class CSS>
	//   12   24:dup             
	//   13   25:invokespecial   #36  <Method void CSS()>
	//   14   28:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   15   31:pop             
		arraylist.add(((Object) (new Debugger())));
	//   16   32:aload_1         
	//   17   33:new             #38  <Class Debugger>
	//   18   36:dup             
	//   19   37:invokespecial   #39  <Method void Debugger()>
	//   20   40:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		arraylist.add(((Object) (new DOM())));
	//   22   44:aload_1         
	//   23   45:new             #41  <Class DOM>
	//   24   48:dup             
	//   25   49:invokespecial   #42  <Method void DOM()>
	//   26   52:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   27   55:pop             
		arraylist.add(((Object) (new DOMStorage(val$context))));
	//   28   56:aload_1         
	//   29   57:new             #44  <Class DOMStorage>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:getfield        #17  <Field Context val$context>
	//   33   65:invokespecial   #46  <Method void DOMStorage(Context)>
	//   34   68:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   35   71:pop             
		arraylist.add(((Object) (new HeapProfiler())));
	//   36   72:aload_1         
	//   37   73:new             #48  <Class HeapProfiler>
	//   38   76:dup             
	//   39   77:invokespecial   #49  <Method void HeapProfiler()>
	//   40   80:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   41   83:pop             
		arraylist.add(((Object) (new Inspector())));
	//   42   84:aload_1         
	//   43   85:new             #51  <Class Inspector>
	//   44   88:dup             
	//   45   89:invokespecial   #52  <Method void Inspector()>
	//   46   92:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   47   95:pop             
		arraylist.add(((Object) (new Network(val$context))));
	//   48   96:aload_1         
	//   49   97:new             #54  <Class Network>
	//   50  100:dup             
	//   51  101:aload_0         
	//   52  102:getfield        #17  <Field Context val$context>
	//   53  105:invokespecial   #55  <Method void Network(Context)>
	//   54  108:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   55  111:pop             
		arraylist.add(((Object) (new Page(val$context))));
	//   56  112:aload_1         
	//   57  113:new             #57  <Class Page>
	//   58  116:dup             
	//   59  117:aload_0         
	//   60  118:getfield        #17  <Field Context val$context>
	//   61  121:invokespecial   #58  <Method void Page(Context)>
	//   62  124:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   63  127:pop             
		arraylist.add(((Object) (new Profiler())));
	//   64  128:aload_1         
	//   65  129:new             #60  <Class Profiler>
	//   66  132:dup             
	//   67  133:invokespecial   #61  <Method void Profiler()>
	//   68  136:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   69  139:pop             
		arraylist.add(((Object) (new Runtime())));
	//   70  140:aload_1         
	//   71  141:new             #63  <Class Runtime>
	//   72  144:dup             
	//   73  145:invokespecial   #64  <Method void Runtime()>
	//   74  148:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   75  151:pop             
		arraylist.add(((Object) (new Worker())));
	//   76  152:aload_1         
	//   77  153:new             #66  <Class Worker>
	//   78  156:dup             
	//   79  157:invokespecial   #67  <Method void Worker()>
	//   80  160:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   81  163:pop             
		if(android.os.SION.SDK_INT >= 11)
	//*  82  164:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//*  83  167:bipush          11
	//*  84  169:icmplt          188
			arraylist.add(((Object) (new Database(val$context))));
	//   85  172:aload_1         
	//   86  173:new             #75  <Class Database>
	//   87  176:dup             
	//   88  177:aload_0         
	//   89  178:getfield        #17  <Field Context val$context>
	//   90  181:invokespecial   #76  <Method void Database(Context)>
	//   91  184:invokevirtual   #33  <Method boolean ArrayList.add(Object)>
	//   92  187:pop             
		return ((Iterable) (arraylist));
	//   93  188:aload_1         
	//   94  189:areturn         
	}

	final Context val$context;

	Stetho$3(Context context1)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Context val$context>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
