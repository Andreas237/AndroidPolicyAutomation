// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.*;
import android.content.Intent;
import android.os.*;
import android.support.v4.util.ArrayMap;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			LifecycleFragment, zzbs, LifecycleCallback

public final class zzbr extends Fragment
	implements LifecycleFragment, TraceFieldInterface
{

	public zzbr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Fragment()>
		zzlb = ((Map) (new ArrayMap()));
	//    2    4:aload_0         
	//    3    5:new             #34  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void ArrayMap()>
	//    6   12:putfield        #37  <Field Map zzlb>
		zzlc = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #39  <Field int zzlc>
	//   10   20:return          
	}

	static int zza(zzbr zzbr1)
	{
		return zzbr1.zzlc;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int zzlc>
	//    2    4:ireturn         
	}

	static Bundle zzb(zzbr zzbr1)
	{
		return zzbr1.zzld;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Bundle zzld>
	//    2    4:areturn         
	}

	public static zzbr zzc(Activity activity)
	{
label0:
		{
			Object obj = ((Object) ((WeakReference)zzla.get(((Object) (activity)))));
	//    0    0:getstatic       #30  <Field WeakHashMap zzla>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #53  <Method Object WeakHashMap.get(Object)>
	//    3    7:checkcast       #55  <Class WeakReference>
	//    4   10:astore_1        
			if(obj != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          29
			{
				obj = ((Object) ((zzbr)((WeakReference) (obj)).get()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #58  <Method Object WeakReference.get()>
	//    9   19:checkcast       #2   <Class zzbr>
	//   10   22:astore_1        
				if(obj != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
					return ((zzbr) (obj));
	//   13   27:aload_1         
	//   14   28:areturn         
			}
			zzbr zzbr1;
			try
			{
				zzbr1 = (zzbr)activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
	//   15   29:aload_0         
	//   16   30:invokevirtual   #64  <Method FragmentManager Activity.getFragmentManager()>
	//   17   33:ldc1            #66  <String "LifecycleFragmentImpl">
	//   18   35:invokevirtual   #72  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   19   38:checkcast       #2   <Class zzbr>
	//   20   41:astore_2        
			}
	//*  21   42:aload_2         
	//*  22   43:ifnull          55
	//*  23   46:aload_2         
	//*  24   47:astore_1        
	//*  25   48:aload_2         
	//*  26   49:invokevirtual   #76  <Method boolean isRemoving()>
	//*  27   52:ifeq            80
	//*  28   55:new             #2   <Class zzbr>
	//*  29   58:dup             
	//*  30   59:invokespecial   #77  <Method void zzbr()>
	//*  31   62:astore_1        
	//*  32   63:aload_0         
	//*  33   64:invokevirtual   #64  <Method FragmentManager Activity.getFragmentManager()>
	//*  34   67:invokevirtual   #81  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//*  35   70:aload_1         
	//*  36   71:ldc1            #66  <String "LifecycleFragmentImpl">
	//*  37   73:invokevirtual   #87  <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//*  38   76:invokevirtual   #91  <Method int FragmentTransaction.commitAllowingStateLoss()>
	//*  39   79:pop             
	//*  40   80:getstatic       #30  <Field WeakHashMap zzla>
	//*  41   83:aload_0         
	//*  42   84:new             #55  <Class WeakReference>
	//*  43   87:dup             
	//*  44   88:aload_1         
	//*  45   89:invokespecial   #94  <Method void WeakReference(Object)>
	//*  46   92:invokevirtual   #98  <Method Object WeakHashMap.put(Object, Object)>
	//*  47   95:pop             
	//*  48   96:aload_1         
	//*  49   97:areturn         
			// Misplaced declaration of an exception variable
			catch(Activity activity)
	//*  50   98:astore_0        
			{
				throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", ((Throwable) (activity)));
	//   51   99:new             #100 <Class IllegalStateException>
	//   52  102:dup             
	//   53  103:ldc1            #102 <String "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl">
	//   54  105:aload_0         
	//   55  106:invokespecial   #105 <Method void IllegalStateException(String, Throwable)>
	//   56  109:athrow          
			}
			if(zzbr1 != null)
			{
				obj = ((Object) (zzbr1));
				if(!zzbr1.isRemoving())
					break label0;
			}
			obj = ((Object) (new zzbr()));
			activity.getFragmentManager().beginTransaction().add(((Fragment) (obj)), "LifecycleFragmentImpl").commitAllowingStateLoss();
		}
		zzla.put(((Object) (activity)), ((Object) (new WeakReference(obj))));
		return ((zzbr) (obj));
	}

	public final void addCallback(String s, LifecycleCallback lifecyclecallback)
	{
		if(!zzlb.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Map zzlb>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #114 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            57
		{
			zzlb.put(((Object) (s)), ((Object) (lifecyclecallback)));
	//    5   13:aload_0         
	//    6   14:getfield        #37  <Field Map zzlb>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #115 <Method Object Map.put(Object, Object)>
	//   10   24:pop             
			if(zzlc > 0)
	//*  11   25:aload_0         
	//*  12   26:getfield        #39  <Field int zzlc>
	//*  13   29:ifle            56
				(new Handler(Looper.getMainLooper())).post(((Runnable) (new zzbs(this, lifecyclecallback, s))));
	//   14   32:new             #117 <Class Handler>
	//   15   35:dup             
	//   16   36:invokestatic    #123 <Method Looper Looper.getMainLooper()>
	//   17   39:invokespecial   #126 <Method void Handler(Looper)>
	//   18   42:new             #128 <Class zzbs>
	//   19   45:dup             
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:aload_1         
	//   23   49:invokespecial   #131 <Method void zzbs(zzbr, LifecycleCallback, String)>
	//   24   52:invokevirtual   #135 <Method boolean Handler.post(Runnable)>
	//   25   55:pop             
			return;
	//   26   56:return          
		} else
		{
			lifecyclecallback = ((LifecycleCallback) (new StringBuilder(String.valueOf(((Object) (s))).length() + 59)));
	//   27   57:new             #137 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:invokestatic    #143 <Method String String.valueOf(Object)>
	//   31   65:invokevirtual   #146 <Method int String.length()>
	//   32   68:bipush          59
	//   33   70:iadd            
	//   34   71:invokespecial   #149 <Method void StringBuilder(int)>
	//   35   74:astore_2        
			((StringBuilder) (lifecyclecallback)).append("LifecycleCallback with tag ");
	//   36   75:aload_2         
	//   37   76:ldc1            #151 <String "LifecycleCallback with tag ">
	//   38   78:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			((StringBuilder) (lifecyclecallback)).append(s);
	//   40   82:aload_2         
	//   41   83:aload_1         
	//   42   84:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
			((StringBuilder) (lifecyclecallback)).append(" already added to this fragment.");
	//   44   88:aload_2         
	//   45   89:ldc1            #157 <String " already added to this fragment.">
	//   46   91:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
			throw new IllegalArgumentException(((StringBuilder) (lifecyclecallback)).toString());
	//   48   95:new             #159 <Class IllegalArgumentException>
	//   49   98:dup             
	//   50   99:aload_2         
	//   51  100:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   52  103:invokespecial   #166 <Method void IllegalArgumentException(String)>
	//   53  106:athrow          
		}
	}

	public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #171 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).dump(s, filedescriptor, printwriter, as));
	//    6    9:aload_0         
	//    7   10:getfield        #37  <Field Map zzlb>
	//    8   13:invokeinterface #175 <Method Collection Map.values()>
	//    9   18:invokeinterface #181 <Method Iterator Collection.iterator()>
	//   10   23:astore          5
	//   11   25:aload           5
	//   12   27:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//   13   32:ifeq            56
	//   14   35:aload           5
	//   15   37:invokeinterface #189 <Method Object Iterator.next()>
	//   16   42:checkcast       #191 <Class LifecycleCallback>
	//   17   45:aload_1         
	//   18   46:aload_2         
	//   19   47:aload_3         
	//   20   48:aload           4
	//   21   50:invokevirtual   #192 <Method void LifecycleCallback.dump(String, FileDescriptor, PrintWriter, String[])>
	//*  22   53:goto            25
	//   23   56:return          
	}

	public final LifecycleCallback getCallbackOrNull(String s, Class class1)
	{
		return (LifecycleCallback)class1.cast(zzlb.get(((Object) (s))));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field Map zzlb>
	//    3    5:aload_1         
	//    4    6:invokeinterface #195 <Method Object Map.get(Object)>
	//    5   11:invokevirtual   #200 <Method Object Class.cast(Object)>
	//    6   14:checkcast       #191 <Class LifecycleCallback>
	//    7   17:areturn         
	}

	public final Activity getLifecycleActivity()
	{
		return getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method Activity getActivity()>
	//    2    4:areturn         
	}

	public final boolean isCreated()
	{
		return zzlc > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int zzlc>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final boolean isStarted()
	{
		return zzlc >= 2;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int zzlc>
	//    2    4:iconst_2        
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #213 <Method void Fragment.onActivityResult(int, int, Intent)>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onActivityResult(i, j, intent));
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field Map zzlb>
	//    7   11:invokeinterface #175 <Method Collection Map.values()>
	//    8   16:invokeinterface #181 <Method Iterator Collection.iterator()>
	//    9   21:astore          4
	//   10   23:aload           4
	//   11   25:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            52
	//   13   33:aload           4
	//   14   35:invokeinterface #189 <Method Object Iterator.next()>
	//   15   40:checkcast       #191 <Class LifecycleCallback>
	//   16   43:iload_1         
	//   17   44:iload_2         
	//   18   45:aload_3         
	//   19   46:invokevirtual   #214 <Method void LifecycleCallback.onActivityResult(int, int, Intent)>
	//*  20   49:goto            23
	//   21   52:return          
	}

	public final void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("zzbr");
	//    0    0:ldc1            #220 <String "zzbr">
	//    1    2:invokestatic    #225 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "zzbr#onCreate", ((java.util.ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #227 <Field Trace _nr_trace>
	//    4    9:ldc1            #229 <String "zzbr#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #233 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "zzbr#onCreate", ((java.util.ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #229 <String "zzbr#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #233 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #235 <Method void Fragment.onCreate(Bundle)>
		zzlc = 1;
	//   15   30:aload_0         
	//   16   31:iconst_1        
	//   17   32:putfield        #39  <Field int zzlc>
		zzld = bundle;
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:putfield        #45  <Field Bundle zzld>
		Object obj;
		LifecycleCallback lifecyclecallback;
		for(Iterator iterator = zzlb.entrySet().iterator(); iterator.hasNext(); lifecyclecallback.onCreate(((Bundle) (obj))))
	//*  21   40:aload_0         
	//*  22   41:getfield        #37  <Field Map zzlb>
	//*  23   44:invokeinterface #239 <Method Set Map.entrySet()>
	//*  24   49:invokeinterface #242 <Method Iterator Set.iterator()>
	//*  25   54:astore_3        
	//*  26   55:aload_3         
	//*  27   56:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//*  28   61:ifeq            117
		{
			obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   29   64:aload_3         
	//   30   65:invokeinterface #189 <Method Object Iterator.next()>
	//   31   70:checkcast       #244 <Class java.util.Map$Entry>
	//   32   73:astore_2        
			lifecyclecallback = (LifecycleCallback)((java.util.Map.Entry) (obj)).getValue();
	//   33   74:aload_2         
	//   34   75:invokeinterface #247 <Method Object java.util.Map$Entry.getValue()>
	//   35   80:checkcast       #191 <Class LifecycleCallback>
	//   36   83:astore          4
			if(bundle != null)
	//*  37   85:aload_1         
	//*  38   86:ifnull          106
				obj = ((Object) (bundle.getBundle((String)((java.util.Map.Entry) (obj)).getKey())));
	//   39   89:aload_1         
	//   40   90:aload_2         
	//   41   91:invokeinterface #250 <Method Object java.util.Map$Entry.getKey()>
	//   42   96:checkcast       #139 <Class String>
	//   43   99:invokevirtual   #256 <Method Bundle Bundle.getBundle(String)>
	//   44  102:astore_2        
			else
	//*  45  103:goto            108
				obj = null;
	//   46  106:aconst_null     
	//   47  107:astore_2        
		}

	//   48  108:aload           4
	//   49  110:aload_2         
	//   50  111:invokevirtual   #257 <Method void LifecycleCallback.onCreate(Bundle)>
	//*  51  114:goto            55
		TraceMachine.exitMethod();
	//   52  117:invokestatic    #260 <Method void TraceMachine.exitMethod()>
		return;
	//   53  120:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   54  121:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  55  122:goto            18
	}

	public final void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method void Fragment.onDestroy()>
		zzlc = 5;
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:putfield        #39  <Field int zzlc>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onDestroy());
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field Map zzlb>
	//    7   13:invokeinterface #175 <Method Collection Map.values()>
	//    8   18:invokeinterface #181 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #189 <Method Object Iterator.next()>
	//   15   39:checkcast       #191 <Class LifecycleCallback>
	//   16   42:invokevirtual   #264 <Method void LifecycleCallback.onDestroy()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public final void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #267 <Method void Fragment.onResume()>
		zzlc = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #39  <Field int zzlc>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onResume());
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field Map zzlb>
	//    7   13:invokeinterface #175 <Method Collection Map.values()>
	//    8   18:invokeinterface #181 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #189 <Method Object Iterator.next()>
	//   15   39:checkcast       #191 <Class LifecycleCallback>
	//   16   42:invokevirtual   #268 <Method void LifecycleCallback.onResume()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #271 <Method void Fragment.onSaveInstanceState(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		java.util.Map.Entry entry;
		Bundle bundle1;
		for(Iterator iterator = zzlb.entrySet().iterator(); iterator.hasNext(); bundle.putBundle((String)entry.getKey(), bundle1))
	//*   6   10:aload_0         
	//*   7   11:getfield        #37  <Field Map zzlb>
	//*   8   14:invokeinterface #239 <Method Set Map.entrySet()>
	//*   9   19:invokeinterface #242 <Method Iterator Set.iterator()>
	//*  10   24:astore_2        
	//*  11   25:aload_2         
	//*  12   26:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            85
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   14   34:aload_2         
	//   15   35:invokeinterface #189 <Method Object Iterator.next()>
	//   16   40:checkcast       #244 <Class java.util.Map$Entry>
	//   17   43:astore_3        
			bundle1 = new Bundle();
	//   18   44:new             #252 <Class Bundle>
	//   19   47:dup             
	//   20   48:invokespecial   #272 <Method void Bundle()>
	//   21   51:astore          4
			((LifecycleCallback)entry.getValue()).onSaveInstanceState(bundle1);
	//   22   53:aload_3         
	//   23   54:invokeinterface #247 <Method Object java.util.Map$Entry.getValue()>
	//   24   59:checkcast       #191 <Class LifecycleCallback>
	//   25   62:aload           4
	//   26   64:invokevirtual   #273 <Method void LifecycleCallback.onSaveInstanceState(Bundle)>
		}

	//   27   67:aload_1         
	//   28   68:aload_3         
	//   29   69:invokeinterface #250 <Method Object java.util.Map$Entry.getKey()>
	//   30   74:checkcast       #139 <Class String>
	//   31   77:aload           4
	//   32   79:invokevirtual   #277 <Method void Bundle.putBundle(String, Bundle)>
	//*  33   82:goto            25
	//   34   85:return          
	}

	public final void onStart()
	{
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    0    0:invokestatic    #284 <Method GestureObserver GestureObserver.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #287 <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
		super.onStart();
	//    3    7:aload_0         
	//    4    8:invokespecial   #289 <Method void Fragment.onStart()>
		zzlc = 2;
	//    5   11:aload_0         
	//    6   12:iconst_2        
	//    7   13:putfield        #39  <Field int zzlc>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onStart());
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Map zzlb>
	//   10   20:invokeinterface #175 <Method Collection Map.values()>
	//   11   25:invokeinterface #181 <Method Iterator Collection.iterator()>
	//   12   30:astore_1        
	//   13   31:aload_1         
	//   14   32:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//   15   37:ifeq            55
	//   16   40:aload_1         
	//   17   41:invokeinterface #189 <Method Object Iterator.next()>
	//   18   46:checkcast       #191 <Class LifecycleCallback>
	//   19   49:invokevirtual   #290 <Method void LifecycleCallback.onStart()>
	//*  20   52:goto            31
	//   21   55:return          
	}

	public final void onStop()
	{
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    0    0:invokestatic    #284 <Method GestureObserver GestureObserver.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #294 <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
		super.onStop();
	//    3    7:aload_0         
	//    4    8:invokespecial   #296 <Method void Fragment.onStop()>
		zzlc = 4;
	//    5   11:aload_0         
	//    6   12:iconst_4        
	//    7   13:putfield        #39  <Field int zzlc>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onStop());
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Map zzlb>
	//   10   20:invokeinterface #175 <Method Collection Map.values()>
	//   11   25:invokeinterface #181 <Method Iterator Collection.iterator()>
	//   12   30:astore_1        
	//   13   31:aload_1         
	//   14   32:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//   15   37:ifeq            55
	//   16   40:aload_1         
	//   17   41:invokeinterface #189 <Method Object Iterator.next()>
	//   18   46:checkcast       #191 <Class LifecycleCallback>
	//   19   49:invokevirtual   #297 <Method void LifecycleCallback.onStop()>
	//*  20   52:goto            31
	//   21   55:return          
	}

	private static WeakHashMap zzla = new WeakHashMap();
	public Trace _nr_trace;
	private Map zzlb;
	private int zzlc;
	private Bundle zzld;

	static 
	{
	//    0    0:new             #25  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void WeakHashMap()>
	//    3    7:putstatic       #30  <Field WeakHashMap zzla>
	//*   4   10:return          
	}
}
