// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.domstorage;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.domstorage:
//			DOMStoragePeerManager, SharedPreferencesHelper

class DOMStoragePeerManager$1 extends PeersRegisteredListener
{

	protected void onFirstPeerRegistered()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		for(Iterator iterator = SharedPreferencesHelper.getSharedPreferenceTags(DOMStoragePeerManager.access$000(DOMStoragePeerManager.this)).iterator(); iterator.hasNext(); mPrefsListeners.add(obj))
	//*   2    2:aload_0         
	//*   3    3:getfield        #15  <Field DOMStoragePeerManager this$0>
	//*   4    6:invokestatic    #29  <Method Context DOMStoragePeerManager.access$000(DOMStoragePeerManager)>
	//*   5    9:invokestatic    #35  <Method List SharedPreferencesHelper.getSharedPreferenceTags(Context)>
	//*   6   12:invokeinterface #41  <Method Iterator List.iterator()>
	//*   7   17:astore_1        
	//*   8   18:aload_1         
	//*   9   19:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            85
		{
			obj = ((Object) ((String)iterator.next()));
	//   11   27:aload_1         
	//   12   28:invokeinterface #51  <Method Object Iterator.next()>
	//   13   33:checkcast       #53  <Class String>
	//   14   36:astore_3        
			SharedPreferences sharedpreferences = DOMStoragePeerManager.access$000(DOMStoragePeerManager.this).getSharedPreferences(((String) (obj)), 0);
	//   15   37:aload_0         
	//   16   38:getfield        #15  <Field DOMStoragePeerManager this$0>
	//   17   41:invokestatic    #29  <Method Context DOMStoragePeerManager.access$000(DOMStoragePeerManager)>
	//   18   44:aload_3         
	//   19   45:iconst_0        
	//   20   46:invokevirtual   #59  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   21   49:astore_2        
			obj = ((Object) (new vToolsSharedPreferencesListener(DOMStoragePeerManager.this, sharedpreferences, ((String) (obj)))));
	//   22   50:new             #61  <Class DOMStoragePeerManager$DevToolsSharedPreferencesListener>
	//   23   53:dup             
	//   24   54:aload_0         
	//   25   55:getfield        #15  <Field DOMStoragePeerManager this$0>
	//   26   58:aload_2         
	//   27   59:aload_3         
	//   28   60:invokespecial   #64  <Method void DOMStoragePeerManager$DevToolsSharedPreferencesListener(DOMStoragePeerManager, SharedPreferences, String)>
	//   29   63:astore_3        
			sharedpreferences.registerOnSharedPreferenceChangeListener(((android.content.edPreferenceChangeListener) (obj)));
	//   30   64:aload_2         
	//   31   65:aload_3         
	//   32   66:invokeinterface #70  <Method void SharedPreferences.registerOnSharedPreferenceChangeListener(android.content.SharedPreferences$OnSharedPreferenceChangeListener)>
		}

	//   33   71:aload_0         
	//   34   72:getfield        #23  <Field List mPrefsListeners>
	//   35   75:aload_3         
	//   36   76:invokeinterface #74  <Method boolean List.add(Object)>
	//   37   81:pop             
	//*  38   82:goto            18
		this;
	//   39   85:aload_0         
		JVM INSTR monitorexit ;
	//   40   86:monitorexit     
		return;
	//   41   87:return          
		Exception exception;
		exception;
	//   42   88:astore_1        
	//*  43   89:aload_0         
		throw exception;
	//   44   90:monitorexit     
	//   45   91:aload_1         
	//   46   92:athrow          
	}

	protected void onLastPeerUnregistered()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		for(Iterator iterator = mPrefsListeners.iterator(); iterator.hasNext(); ((vToolsSharedPreferencesListener)iterator.next()).unregister());
	//    2    2:aload_0         
	//    3    3:getfield        #23  <Field List mPrefsListeners>
	//    4    6:invokeinterface #41  <Method Iterator List.iterator()>
	//    5   11:astore_1        
	//    6   12:aload_1         
	//    7   13:invokeinterface #47  <Method boolean Iterator.hasNext()>
	//    8   18:ifeq            36
	//    9   21:aload_1         
	//   10   22:invokeinterface #51  <Method Object Iterator.next()>
	//   11   27:checkcast       #61  <Class DOMStoragePeerManager$DevToolsSharedPreferencesListener>
	//   12   30:invokevirtual   #78  <Method void DOMStoragePeerManager$DevToolsSharedPreferencesListener.unregister()>
	//*  13   33:goto            12
		mPrefsListeners.clear();
	//   14   36:aload_0         
	//   15   37:getfield        #23  <Field List mPrefsListeners>
	//   16   40:invokeinterface #81  <Method void List.clear()>
		this;
	//   17   45:aload_0         
		JVM INSTR monitorexit ;
	//   18   46:monitorexit     
		return;
	//   19   47:return          
		Exception exception;
		exception;
	//   20   48:astore_1        
	//*  21   49:aload_0         
		throw exception;
	//   22   50:monitorexit     
	//   23   51:aload_1         
	//   24   52:athrow          
	}

	private final List mPrefsListeners = new ArrayList();
	final DOMStoragePeerManager this$0;

	DOMStoragePeerManager$1()
	{
		this$0 = DOMStoragePeerManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DOMStoragePeerManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void PeersRegisteredListener()>
	//    5    9:aload_0         
	//    6   10:new             #20  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #21  <Method void ArrayList()>
	//    9   17:putfield        #23  <Field List mPrefsListeners>
	//   10   20:return          
	}
}
