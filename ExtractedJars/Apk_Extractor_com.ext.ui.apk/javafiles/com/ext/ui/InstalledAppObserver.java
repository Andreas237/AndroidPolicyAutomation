// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.*;
import android.support.v7.ci;

// Referenced classes of package com.ext.ui:
//			a

public class InstalledAppObserver extends BroadcastReceiver
{

	public InstalledAppObserver(a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BroadcastReceiver()>
		b = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field a b>
		a1 = ((a) (new IntentFilter("android.intent.action.PACKAGE_ADDED")));
	//    5    9:new             #27  <Class IntentFilter>
	//    6   12:dup             
	//    7   13:ldc1            #29  <String "android.intent.action.PACKAGE_ADDED">
	//    8   15:invokespecial   #32  <Method void IntentFilter(String)>
	//    9   18:astore_1        
		((IntentFilter) (a1)).addAction("android.intent.action.PACKAGE_REMOVED");
	//   10   19:aload_1         
	//   11   20:ldc1            #34  <String "android.intent.action.PACKAGE_REMOVED">
	//   12   22:invokevirtual   #37  <Method void IntentFilter.addAction(String)>
		((IntentFilter) (a1)).addAction("android.intent.action.PACKAGE_CHANGED");
	//   13   25:aload_1         
	//   14   26:ldc1            #39  <String "android.intent.action.PACKAGE_CHANGED">
	//   15   28:invokevirtual   #37  <Method void IntentFilter.addAction(String)>
		((IntentFilter) (a1)).addDataScheme("package");
	//   16   31:aload_1         
	//   17   32:ldc1            #41  <String "package">
	//   18   34:invokevirtual   #44  <Method void IntentFilter.addDataScheme(String)>
		b.getContext().registerReceiver(((BroadcastReceiver) (this)), ((IntentFilter) (a1)));
	//   19   37:aload_0         
	//   20   38:getfield        #25  <Field a b>
	//   21   41:invokevirtual   #50  <Method Context a.getContext()>
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #56  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   25   49:pop             
		a1 = ((a) (new IntentFilter()));
	//   26   50:new             #27  <Class IntentFilter>
	//   27   53:dup             
	//   28   54:invokespecial   #57  <Method void IntentFilter()>
	//   29   57:astore_1        
		((IntentFilter) (a1)).addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
	//   30   58:aload_1         
	//   31   59:ldc1            #59  <String "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE">
	//   32   61:invokevirtual   #37  <Method void IntentFilter.addAction(String)>
		((IntentFilter) (a1)).addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
	//   33   64:aload_1         
	//   34   65:ldc1            #61  <String "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE">
	//   35   67:invokevirtual   #37  <Method void IntentFilter.addAction(String)>
		b.getContext().registerReceiver(((BroadcastReceiver) (this)), ((IntentFilter) (a1)));
	//   36   70:aload_0         
	//   37   71:getfield        #25  <Field a b>
	//   38   74:invokevirtual   #50  <Method Context a.getContext()>
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:invokevirtual   #56  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   42   82:pop             
	//   43   83:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		ci.a(a, "Application installed/uninstalled");
	//    0    0:getstatic       #18  <Field String a>
	//    1    3:ldc1            #65  <String "Application installed/uninstalled">
	//    2    5:invokestatic    #70  <Method void ci.a(String, String)>
		b.onContentChanged();
	//    3    8:aload_0         
	//    4    9:getfield        #25  <Field a b>
	//    5   12:invokevirtual   #73  <Method void a.onContentChanged()>
	//    6   15:return          
	}

	private static final String a = ((Class) (com/ext/ui/InstalledAppObserver)).getSimpleName();
	private final a b;

	static 
	{
	//    0    0:ldc1            #2   <Class InstalledAppObserver>
	//    1    2:invokevirtual   #16  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #18  <Field String a>
	//*   3    8:return          
	}
}
