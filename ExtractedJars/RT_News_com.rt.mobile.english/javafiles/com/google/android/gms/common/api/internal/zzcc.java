// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.*;
import android.support.v4.app.*;
import android.support.v4.util.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			LifecycleFragment, zzcd, LifecycleCallback

public final class zzcc extends Fragment
	implements LifecycleFragment
{

	public zzcc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Fragment()>
		zzlb = ((Map) (new ArrayMap()));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void ArrayMap()>
	//    6   12:putfield        #32  <Field Map zzlb>
		zzlc = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #34  <Field int zzlc>
	//   10   20:return          
	}

	static int zza(zzcc zzcc1)
	{
		return zzcc1.zzlc;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int zzlc>
	//    2    4:ireturn         
	}

	public static zzcc zza(FragmentActivity fragmentactivity)
	{
label0:
		{
			Object obj = ((Object) ((WeakReference)zzla.get(((Object) (fragmentactivity)))));
	//    0    0:getstatic       #25  <Field WeakHashMap zzla>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method Object WeakHashMap.get(Object)>
	//    3    7:checkcast       #45  <Class WeakReference>
	//    4   10:astore_1        
			if(obj != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          29
			{
				obj = ((Object) ((zzcc)((WeakReference) (obj)).get()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #48  <Method Object WeakReference.get()>
	//    9   19:checkcast       #2   <Class zzcc>
	//   10   22:astore_1        
				if(obj != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
					return ((zzcc) (obj));
	//   13   27:aload_1         
	//   14   28:areturn         
			}
			zzcc zzcc1;
			try
			{
				zzcc1 = (zzcc)fragmentactivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
	//   15   29:aload_0         
	//   16   30:invokevirtual   #54  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   17   33:ldc1            #56  <String "SupportLifecycleFragmentImpl">
	//   18   35:invokevirtual   #62  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   19   38:checkcast       #2   <Class zzcc>
	//   20   41:astore_2        
			}
	//*  21   42:aload_2         
	//*  22   43:ifnull          55
	//*  23   46:aload_2         
	//*  24   47:astore_1        
	//*  25   48:aload_2         
	//*  26   49:invokevirtual   #66  <Method boolean isRemoving()>
	//*  27   52:ifeq            80
	//*  28   55:new             #2   <Class zzcc>
	//*  29   58:dup             
	//*  30   59:invokespecial   #67  <Method void zzcc()>
	//*  31   62:astore_1        
	//*  32   63:aload_0         
	//*  33   64:invokevirtual   #54  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//*  34   67:invokevirtual   #71  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//*  35   70:aload_1         
	//*  36   71:ldc1            #56  <String "SupportLifecycleFragmentImpl">
	//*  37   73:invokevirtual   #77  <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//*  38   76:invokevirtual   #81  <Method int FragmentTransaction.commitAllowingStateLoss()>
	//*  39   79:pop             
	//*  40   80:getstatic       #25  <Field WeakHashMap zzla>
	//*  41   83:aload_0         
	//*  42   84:new             #45  <Class WeakReference>
	//*  43   87:dup             
	//*  44   88:aload_1         
	//*  45   89:invokespecial   #84  <Method void WeakReference(Object)>
	//*  46   92:invokevirtual   #88  <Method Object WeakHashMap.put(Object, Object)>
	//*  47   95:pop             
	//*  48   96:aload_1         
	//*  49   97:areturn         
			// Misplaced declaration of an exception variable
			catch(FragmentActivity fragmentactivity)
	//*  50   98:astore_0        
			{
				throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", ((Throwable) (fragmentactivity)));
	//   51   99:new             #90  <Class IllegalStateException>
	//   52  102:dup             
	//   53  103:ldc1            #92  <String "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl">
	//   54  105:aload_0         
	//   55  106:invokespecial   #95  <Method void IllegalStateException(String, Throwable)>
	//   56  109:athrow          
			}
			if(zzcc1 != null)
			{
				obj = ((Object) (zzcc1));
				if(!zzcc1.isRemoving())
					break label0;
			}
			obj = ((Object) (new zzcc()));
			fragmentactivity.getSupportFragmentManager().beginTransaction().add(((Fragment) (obj)), "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
		}
		zzla.put(((Object) (fragmentactivity)), ((Object) (new WeakReference(obj))));
		return ((zzcc) (obj));
	}

	static Bundle zzb(zzcc zzcc1)
	{
		return zzcc1.zzld;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Bundle zzld>
	//    2    4:areturn         
	}

	public final void addCallback(String s, LifecycleCallback lifecyclecallback)
	{
		if(!zzlb.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Map zzlb>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #108 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            57
		{
			zzlb.put(((Object) (s)), ((Object) (lifecyclecallback)));
	//    5   13:aload_0         
	//    6   14:getfield        #32  <Field Map zzlb>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//   10   24:pop             
			if(zzlc > 0)
	//*  11   25:aload_0         
	//*  12   26:getfield        #34  <Field int zzlc>
	//*  13   29:ifle            56
				(new Handler(Looper.getMainLooper())).post(((Runnable) (new zzcd(this, lifecyclecallback, s))));
	//   14   32:new             #111 <Class Handler>
	//   15   35:dup             
	//   16   36:invokestatic    #117 <Method Looper Looper.getMainLooper()>
	//   17   39:invokespecial   #120 <Method void Handler(Looper)>
	//   18   42:new             #122 <Class zzcd>
	//   19   45:dup             
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:aload_1         
	//   23   49:invokespecial   #125 <Method void zzcd(zzcc, LifecycleCallback, String)>
	//   24   52:invokevirtual   #129 <Method boolean Handler.post(Runnable)>
	//   25   55:pop             
			return;
	//   26   56:return          
		} else
		{
			lifecyclecallback = ((LifecycleCallback) (new StringBuilder(59 + String.valueOf(((Object) (s))).length())));
	//   27   57:new             #131 <Class StringBuilder>
	//   28   60:dup             
	//   29   61:bipush          59
	//   30   63:aload_1         
	//   31   64:invokestatic    #137 <Method String String.valueOf(Object)>
	//   32   67:invokevirtual   #140 <Method int String.length()>
	//   33   70:iadd            
	//   34   71:invokespecial   #143 <Method void StringBuilder(int)>
	//   35   74:astore_2        
			((StringBuilder) (lifecyclecallback)).append("LifecycleCallback with tag ");
	//   36   75:aload_2         
	//   37   76:ldc1            #145 <String "LifecycleCallback with tag ">
	//   38   78:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			((StringBuilder) (lifecyclecallback)).append(s);
	//   40   82:aload_2         
	//   41   83:aload_1         
	//   42   84:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
			((StringBuilder) (lifecyclecallback)).append(" already added to this fragment.");
	//   44   88:aload_2         
	//   45   89:ldc1            #151 <String " already added to this fragment.">
	//   46   91:invokevirtual   #149 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
			throw new IllegalArgumentException(((StringBuilder) (lifecyclecallback)).toString());
	//   48   95:new             #153 <Class IllegalArgumentException>
	//   49   98:dup             
	//   50   99:aload_2         
	//   51  100:invokevirtual   #157 <Method String StringBuilder.toString()>
	//   52  103:invokespecial   #160 <Method void IllegalArgumentException(String)>
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
	//    5    6:invokespecial   #165 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).dump(s, filedescriptor, printwriter, as));
	//    6    9:aload_0         
	//    7   10:getfield        #32  <Field Map zzlb>
	//    8   13:invokeinterface #169 <Method Collection Map.values()>
	//    9   18:invokeinterface #175 <Method Iterator Collection.iterator()>
	//   10   23:astore          5
	//   11   25:aload           5
	//   12   27:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//   13   32:ifeq            56
	//   14   35:aload           5
	//   15   37:invokeinterface #183 <Method Object Iterator.next()>
	//   16   42:checkcast       #185 <Class LifecycleCallback>
	//   17   45:aload_1         
	//   18   46:aload_2         
	//   19   47:aload_3         
	//   20   48:aload           4
	//   21   50:invokevirtual   #186 <Method void LifecycleCallback.dump(String, FileDescriptor, PrintWriter, String[])>
	//*  22   53:goto            25
	//   23   56:return          
	}

	public final LifecycleCallback getCallbackOrNull(String s, Class class1)
	{
		return (LifecycleCallback)class1.cast(zzlb.get(((Object) (s))));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field Map zzlb>
	//    3    5:aload_1         
	//    4    6:invokeinterface #189 <Method Object Map.get(Object)>
	//    5   11:invokevirtual   #194 <Method Object Class.cast(Object)>
	//    6   14:checkcast       #185 <Class LifecycleCallback>
	//    7   17:areturn         
	}

	public final Activity getLifecycleActivity()
	{
		return ((Activity) (getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #202 <Method FragmentActivity getActivity()>
	//    2    4:areturn         
	}

	public final boolean isCreated()
	{
		return zzlc > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int zzlc>
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
	//    1    1:getfield        #34  <Field int zzlc>
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
	//    4    4:invokespecial   #208 <Method void Fragment.onActivityResult(int, int, Intent)>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onActivityResult(i, j, intent));
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field Map zzlb>
	//    7   11:invokeinterface #169 <Method Collection Map.values()>
	//    8   16:invokeinterface #175 <Method Iterator Collection.iterator()>
	//    9   21:astore          4
	//   10   23:aload           4
	//   11   25:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            52
	//   13   33:aload           4
	//   14   35:invokeinterface #183 <Method Object Iterator.next()>
	//   15   40:checkcast       #185 <Class LifecycleCallback>
	//   16   43:iload_1         
	//   17   44:iload_2         
	//   18   45:aload_3         
	//   19   46:invokevirtual   #209 <Method void LifecycleCallback.onActivityResult(int, int, Intent)>
	//*  20   49:goto            23
	//   21   52:return          
	}

	public final void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #213 <Method void Fragment.onCreate(Bundle)>
		zzlc = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #34  <Field int zzlc>
		zzld = bundle;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #99  <Field Bundle zzld>
		Object obj;
		LifecycleCallback lifecyclecallback;
		for(Iterator iterator = zzlb.entrySet().iterator(); iterator.hasNext(); lifecyclecallback.onCreate(((Bundle) (obj))))
	//*   9   15:aload_0         
	//*  10   16:getfield        #32  <Field Map zzlb>
	//*  11   19:invokeinterface #217 <Method Set Map.entrySet()>
	//*  12   24:invokeinterface #220 <Method Iterator Set.iterator()>
	//*  13   29:astore_3        
	//*  14   30:aload_3         
	//*  15   31:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            92
		{
			obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   17   39:aload_3         
	//   18   40:invokeinterface #183 <Method Object Iterator.next()>
	//   19   45:checkcast       #222 <Class java.util.Map$Entry>
	//   20   48:astore_2        
			lifecyclecallback = (LifecycleCallback)((java.util.Map.Entry) (obj)).getValue();
	//   21   49:aload_2         
	//   22   50:invokeinterface #225 <Method Object java.util.Map$Entry.getValue()>
	//   23   55:checkcast       #185 <Class LifecycleCallback>
	//   24   58:astore          4
			if(bundle != null)
	//*  25   60:aload_1         
	//*  26   61:ifnull          81
				obj = ((Object) (bundle.getBundle((String)((java.util.Map.Entry) (obj)).getKey())));
	//   27   64:aload_1         
	//   28   65:aload_2         
	//   29   66:invokeinterface #228 <Method Object java.util.Map$Entry.getKey()>
	//   30   71:checkcast       #133 <Class String>
	//   31   74:invokevirtual   #234 <Method Bundle Bundle.getBundle(String)>
	//   32   77:astore_2        
			else
	//*  33   78:goto            83
				obj = null;
	//   34   81:aconst_null     
	//   35   82:astore_2        
		}

	//   36   83:aload           4
	//   37   85:aload_2         
	//   38   86:invokevirtual   #235 <Method void LifecycleCallback.onCreate(Bundle)>
	//*  39   89:goto            30
	//   40   92:return          
	}

	public final void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #238 <Method void Fragment.onDestroy()>
		zzlc = 5;
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:putfield        #34  <Field int zzlc>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onDestroy());
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Map zzlb>
	//    7   13:invokeinterface #169 <Method Collection Map.values()>
	//    8   18:invokeinterface #175 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #183 <Method Object Iterator.next()>
	//   15   39:checkcast       #185 <Class LifecycleCallback>
	//   16   42:invokevirtual   #239 <Method void LifecycleCallback.onDestroy()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public final void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #242 <Method void Fragment.onResume()>
		zzlc = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #34  <Field int zzlc>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onResume());
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Map zzlb>
	//    7   13:invokeinterface #169 <Method Collection Map.values()>
	//    8   18:invokeinterface #175 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #183 <Method Object Iterator.next()>
	//   15   39:checkcast       #185 <Class LifecycleCallback>
	//   16   42:invokevirtual   #243 <Method void LifecycleCallback.onResume()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public final void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #246 <Method void Fragment.onSaveInstanceState(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		java.util.Map.Entry entry;
		Bundle bundle1;
		for(Iterator iterator = zzlb.entrySet().iterator(); iterator.hasNext(); bundle.putBundle((String)entry.getKey(), bundle1))
	//*   6   10:aload_0         
	//*   7   11:getfield        #32  <Field Map zzlb>
	//*   8   14:invokeinterface #217 <Method Set Map.entrySet()>
	//*   9   19:invokeinterface #220 <Method Iterator Set.iterator()>
	//*  10   24:astore_2        
	//*  11   25:aload_2         
	//*  12   26:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            85
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   14   34:aload_2         
	//   15   35:invokeinterface #183 <Method Object Iterator.next()>
	//   16   40:checkcast       #222 <Class java.util.Map$Entry>
	//   17   43:astore_3        
			bundle1 = new Bundle();
	//   18   44:new             #230 <Class Bundle>
	//   19   47:dup             
	//   20   48:invokespecial   #247 <Method void Bundle()>
	//   21   51:astore          4
			((LifecycleCallback)entry.getValue()).onSaveInstanceState(bundle1);
	//   22   53:aload_3         
	//   23   54:invokeinterface #225 <Method Object java.util.Map$Entry.getValue()>
	//   24   59:checkcast       #185 <Class LifecycleCallback>
	//   25   62:aload           4
	//   26   64:invokevirtual   #248 <Method void LifecycleCallback.onSaveInstanceState(Bundle)>
		}

	//   27   67:aload_1         
	//   28   68:aload_3         
	//   29   69:invokeinterface #228 <Method Object java.util.Map$Entry.getKey()>
	//   30   74:checkcast       #133 <Class String>
	//   31   77:aload           4
	//   32   79:invokevirtual   #252 <Method void Bundle.putBundle(String, Bundle)>
	//*  33   82:goto            25
	//   34   85:return          
	}

	public final void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #255 <Method void Fragment.onStart()>
		zzlc = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #34  <Field int zzlc>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onStart());
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Map zzlb>
	//    7   13:invokeinterface #169 <Method Collection Map.values()>
	//    8   18:invokeinterface #175 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #183 <Method Object Iterator.next()>
	//   15   39:checkcast       #185 <Class LifecycleCallback>
	//   16   42:invokevirtual   #256 <Method void LifecycleCallback.onStart()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public final void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #259 <Method void Fragment.onStop()>
		zzlc = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #34  <Field int zzlc>
		for(Iterator iterator = zzlb.values().iterator(); iterator.hasNext(); ((LifecycleCallback)iterator.next()).onStop());
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Map zzlb>
	//    7   13:invokeinterface #169 <Method Collection Map.values()>
	//    8   18:invokeinterface #175 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #180 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #183 <Method Object Iterator.next()>
	//   15   39:checkcast       #185 <Class LifecycleCallback>
	//   16   42:invokevirtual   #260 <Method void LifecycleCallback.onStop()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	private static WeakHashMap zzla = new WeakHashMap();
	private Map zzlb;
	private int zzlc;
	private Bundle zzld;

	static 
	{
	//    0    0:new             #20  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void WeakHashMap()>
	//    3    7:putstatic       #25  <Field WeakHashMap zzla>
	//*   4   10:return          
	}
}
