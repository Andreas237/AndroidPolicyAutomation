// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.*;
import android.support.v4.app.*;
import android.support.v4.util.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaax, zzaaw

public final class zzabm extends Fragment
	implements zzaax
{

	public zzabm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Fragment()>
		zzaBu = ((Map) (new ArrayMap()));
	//    2    4:aload_0         
	//    3    5:new             #31  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void ArrayMap()>
	//    6   12:putfield        #34  <Field Map zzaBu>
		zzJh = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #36  <Field int zzJh>
	//   10   20:return          
	}

	static int zza(zzabm zzabm1)
	{
		return zzabm1.zzJh;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int zzJh>
	//    2    4:ireturn         
	}

	public static zzabm zza(FragmentActivity fragmentactivity)
	{
label0:
		{
			Object obj = ((Object) ((WeakReference)zzaBt.get(((Object) (fragmentactivity)))));
	//    0    0:getstatic       #27  <Field WeakHashMap zzaBt>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #45  <Method Object WeakHashMap.get(Object)>
	//    3    7:checkcast       #47  <Class WeakReference>
	//    4   10:astore_1        
			if(obj != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          29
			{
				obj = ((Object) ((zzabm)((WeakReference) (obj)).get()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #50  <Method Object WeakReference.get()>
	//    9   19:checkcast       #2   <Class zzabm>
	//   10   22:astore_1        
				if(obj != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
					return ((zzabm) (obj));
	//   13   27:aload_1         
	//   14   28:areturn         
			}
			zzabm zzabm1;
			try
			{
				zzabm1 = (zzabm)fragmentactivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
	//   15   29:aload_0         
	//   16   30:invokevirtual   #56  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   17   33:ldc1            #58  <String "SupportLifecycleFragmentImpl">
	//   18   35:invokevirtual   #64  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   19   38:checkcast       #2   <Class zzabm>
	//   20   41:astore_2        
			}
	//*  21   42:aload_2         
	//*  22   43:ifnull          55
	//*  23   46:aload_2         
	//*  24   47:astore_1        
	//*  25   48:aload_2         
	//*  26   49:invokevirtual   #68  <Method boolean isRemoving()>
	//*  27   52:ifeq            80
	//*  28   55:new             #2   <Class zzabm>
	//*  29   58:dup             
	//*  30   59:invokespecial   #69  <Method void zzabm()>
	//*  31   62:astore_1        
	//*  32   63:aload_0         
	//*  33   64:invokevirtual   #56  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//*  34   67:invokevirtual   #73  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//*  35   70:aload_1         
	//*  36   71:ldc1            #58  <String "SupportLifecycleFragmentImpl">
	//*  37   73:invokevirtual   #79  <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//*  38   76:invokevirtual   #83  <Method int FragmentTransaction.commitAllowingStateLoss()>
	//*  39   79:pop             
	//*  40   80:getstatic       #27  <Field WeakHashMap zzaBt>
	//*  41   83:aload_0         
	//*  42   84:new             #47  <Class WeakReference>
	//*  43   87:dup             
	//*  44   88:aload_1         
	//*  45   89:invokespecial   #86  <Method void WeakReference(Object)>
	//*  46   92:invokevirtual   #90  <Method Object WeakHashMap.put(Object, Object)>
	//*  47   95:pop             
	//*  48   96:aload_1         
	//*  49   97:areturn         
			// Misplaced declaration of an exception variable
			catch(FragmentActivity fragmentactivity)
	//*  50   98:astore_0        
			{
				throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", ((Throwable) (fragmentactivity)));
	//   51   99:new             #92  <Class IllegalStateException>
	//   52  102:dup             
	//   53  103:ldc1            #94  <String "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl">
	//   54  105:aload_0         
	//   55  106:invokespecial   #97  <Method void IllegalStateException(String, Throwable)>
	//   56  109:athrow          
			}
			if(zzabm1 != null)
			{
				obj = ((Object) (zzabm1));
				if(!zzabm1.isRemoving())
					break label0;
			}
			obj = ((Object) (new zzabm()));
			fragmentactivity.getSupportFragmentManager().beginTransaction().add(((Fragment) (obj)), "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
		}
		zzaBt.put(((Object) (fragmentactivity)), ((Object) (new WeakReference(obj))));
		return ((zzabm) (obj));
	}

	static Bundle zzb(zzabm zzabm1)
	{
		return zzabm1.zzaBv;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Bundle zzaBv>
	//    2    4:areturn         
	}

	private void zzb(String s, zzaaw zzaaw1)
	{
		if(zzJh > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int zzJh>
	//*   2    4:ifle            31
			(new Handler(Looper.getMainLooper())).post(new Runnable(zzaaw1, s) {

				public void run()
				{
					if(zzabm.zza(zzaBL) >= 1)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field zzabm zzaBL>
				//*   2    4:invokestatic    #34  <Method int zzabm.zza(zzabm)>
				//*   3    7:iconst_1        
				//*   4    8:icmplt          46
					{
						zzaaw zzaaw2 = zzaBw;
				//    5   11:aload_0         
				//    6   12:getfield        #23  <Field zzaaw zzaBw>
				//    7   15:astore_2        
						Bundle bundle;
						if(zzabm.zzb(zzaBL) != null)
				//*   8   16:aload_0         
				//*   9   17:getfield        #21  <Field zzabm zzaBL>
				//*  10   20:invokestatic    #37  <Method Bundle zzabm.zzb(zzabm)>
				//*  11   23:ifnull          101
							bundle = zzabm.zzb(zzaBL).getBundle(zzO);
				//   12   26:aload_0         
				//   13   27:getfield        #21  <Field zzabm zzaBL>
				//   14   30:invokestatic    #37  <Method Bundle zzabm.zzb(zzabm)>
				//   15   33:aload_0         
				//   16   34:getfield        #25  <Field String zzO>
				//   17   37:invokevirtual   #43  <Method Bundle Bundle.getBundle(String)>
				//   18   40:astore_1        
						else
				//*  19   41:aload_2         
				//*  20   42:aload_1         
				//*  21   43:invokevirtual   #49  <Method void zzaaw.onCreate(Bundle)>
				//*  22   46:aload_0         
				//*  23   47:getfield        #21  <Field zzabm zzaBL>
				//*  24   50:invokestatic    #34  <Method int zzabm.zza(zzabm)>
				//*  25   53:iconst_2        
				//*  26   54:icmplt          64
				//*  27   57:aload_0         
				//*  28   58:getfield        #23  <Field zzaaw zzaBw>
				//*  29   61:invokevirtual   #52  <Method void zzaaw.onStart()>
				//*  30   64:aload_0         
				//*  31   65:getfield        #21  <Field zzabm zzaBL>
				//*  32   68:invokestatic    #34  <Method int zzabm.zza(zzabm)>
				//*  33   71:iconst_3        
				//*  34   72:icmplt          82
				//*  35   75:aload_0         
				//*  36   76:getfield        #23  <Field zzaaw zzaBw>
				//*  37   79:invokevirtual   #55  <Method void zzaaw.onStop()>
				//*  38   82:aload_0         
				//*  39   83:getfield        #21  <Field zzabm zzaBL>
				//*  40   86:invokestatic    #34  <Method int zzabm.zza(zzabm)>
				//*  41   89:iconst_4        
				//*  42   90:icmplt          100
				//*  43   93:aload_0         
				//*  44   94:getfield        #23  <Field zzaaw zzaBw>
				//*  45   97:invokevirtual   #58  <Method void zzaaw.onDestroy()>
				//*  46  100:return          
							bundle = null;
				//   47  101:aconst_null     
				//   48  102:astore_1        
						zzaaw2.onCreate(bundle);
					}
					if(zzabm.zza(zzaBL) >= 2)
						zzaBw.onStart();
					if(zzabm.zza(zzaBL) >= 3)
						zzaBw.onStop();
					if(zzabm.zza(zzaBL) >= 4)
						zzaBw.onDestroy();
				//*  49  103:goto            41
				}

				final String zzO;
				final zzabm zzaBL;
				final zzaaw zzaBw;

			
			{
				zzaBL = zzabm.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzabm zzaBL>
				zzaBw = zzaaw1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field zzaaw zzaBw>
				zzO = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String zzO>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    7:new             #105 <Class Handler>
	//    4   10:dup             
	//    5   11:invokestatic    #111 <Method Looper Looper.getMainLooper()>
	//    6   14:invokespecial   #114 <Method void Handler(Looper)>
	//    7   17:new             #8   <Class zzabm$1>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokespecial   #117 <Method void zzabm$1(zzabm, zzaaw, String)>
	//   13   27:invokevirtual   #121 <Method boolean Handler.post(Runnable)>
	//   14   30:pop             
	//   15   31:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		super.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #126 <Method void Fragment.dump(String, FileDescriptor, PrintWriter, String[])>
		for(Iterator iterator = zzaBu.values().iterator(); iterator.hasNext(); ((zzaaw)iterator.next()).dump(s, filedescriptor, printwriter, as));
	//    6    9:aload_0         
	//    7   10:getfield        #34  <Field Map zzaBu>
	//    8   13:invokeinterface #132 <Method Collection Map.values()>
	//    9   18:invokeinterface #138 <Method Iterator Collection.iterator()>
	//   10   23:astore          5
	//   11   25:aload           5
	//   12   27:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   13   32:ifeq            56
	//   14   35:aload           5
	//   15   37:invokeinterface #146 <Method Object Iterator.next()>
	//   16   42:checkcast       #148 <Class zzaaw>
	//   17   45:aload_1         
	//   18   46:aload_2         
	//   19   47:aload_3         
	//   20   48:aload           4
	//   21   50:invokevirtual   #149 <Method void zzaaw.dump(String, FileDescriptor, PrintWriter, String[])>
	//*  22   53:goto            25
	//   23   56:return          
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #153 <Method void Fragment.onActivityResult(int, int, Intent)>
		for(Iterator iterator = zzaBu.values().iterator(); iterator.hasNext(); ((zzaaw)iterator.next()).onActivityResult(i, j, intent));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field Map zzaBu>
	//    7   11:invokeinterface #132 <Method Collection Map.values()>
	//    8   16:invokeinterface #138 <Method Iterator Collection.iterator()>
	//    9   21:astore          4
	//   10   23:aload           4
	//   11   25:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            52
	//   13   33:aload           4
	//   14   35:invokeinterface #146 <Method Object Iterator.next()>
	//   15   40:checkcast       #148 <Class zzaaw>
	//   16   43:iload_1         
	//   17   44:iload_2         
	//   18   45:aload_3         
	//   19   46:invokevirtual   #154 <Method void zzaaw.onActivityResult(int, int, Intent)>
	//*  20   49:goto            23
	//   21   52:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void Fragment.onCreate(Bundle)>
		zzJh = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #36  <Field int zzJh>
		zzaBv = bundle;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #101 <Field Bundle zzaBv>
		Iterator iterator = zzaBu.entrySet().iterator();
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field Map zzaBu>
	//   11   19:invokeinterface #162 <Method Set Map.entrySet()>
	//   12   24:invokeinterface #165 <Method Iterator Set.iterator()>
	//   13   29:astore_3        
		while(iterator.hasNext()) 
	//*  14   30:aload_3         
	//*  15   31:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            92
		{
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   17   39:aload_3         
	//   18   40:invokeinterface #146 <Method Object Iterator.next()>
	//   19   45:checkcast       #167 <Class java.util.Map$Entry>
	//   20   48:astore_2        
			zzaaw zzaaw1 = (zzaaw)((java.util.Map.Entry) (obj)).getValue();
	//   21   49:aload_2         
	//   22   50:invokeinterface #170 <Method Object java.util.Map$Entry.getValue()>
	//   23   55:checkcast       #148 <Class zzaaw>
	//   24   58:astore          4
			if(bundle != null)
	//*  25   60:aload_1         
	//*  26   61:ifnull          87
				obj = ((Object) (bundle.getBundle((String)((java.util.Map.Entry) (obj)).getKey())));
	//   27   64:aload_1         
	//   28   65:aload_2         
	//   29   66:invokeinterface #173 <Method Object java.util.Map$Entry.getKey()>
	//   30   71:checkcast       #175 <Class String>
	//   31   74:invokevirtual   #181 <Method Bundle Bundle.getBundle(String)>
	//   32   77:astore_2        
			else
	//*  33   78:aload           4
	//*  34   80:aload_2         
	//*  35   81:invokevirtual   #182 <Method void zzaaw.onCreate(Bundle)>
	//*  36   84:goto            30
				obj = null;
	//   37   87:aconst_null     
	//   38   88:astore_2        
			zzaaw1.onCreate(((Bundle) (obj)));
		}
	//*  39   89:goto            78
	//   40   92:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void Fragment.onDestroy()>
		zzJh = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #36  <Field int zzJh>
		for(Iterator iterator = zzaBu.values().iterator(); iterator.hasNext(); ((zzaaw)iterator.next()).onDestroy());
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field Map zzaBu>
	//    7   13:invokeinterface #132 <Method Collection Map.values()>
	//    8   18:invokeinterface #138 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #146 <Method Object Iterator.next()>
	//   15   39:checkcast       #148 <Class zzaaw>
	//   16   42:invokevirtual   #186 <Method void zzaaw.onDestroy()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #189 <Method void Fragment.onSaveInstanceState(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
	//*   5    9:return          
		{
			Iterator iterator = zzaBu.entrySet().iterator();
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field Map zzaBu>
	//    8   14:invokeinterface #162 <Method Set Map.entrySet()>
	//    9   19:invokeinterface #165 <Method Iterator Set.iterator()>
	//   10   24:astore_2        
			while(iterator.hasNext()) 
	//*  11   25:aload_2         
	//*  12   26:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            9
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   14   34:aload_2         
	//   15   35:invokeinterface #146 <Method Object Iterator.next()>
	//   16   40:checkcast       #167 <Class java.util.Map$Entry>
	//   17   43:astore_3        
				Bundle bundle1 = new Bundle();
	//   18   44:new             #177 <Class Bundle>
	//   19   47:dup             
	//   20   48:invokespecial   #190 <Method void Bundle()>
	//   21   51:astore          4
				((zzaaw)entry.getValue()).onSaveInstanceState(bundle1);
	//   22   53:aload_3         
	//   23   54:invokeinterface #170 <Method Object java.util.Map$Entry.getValue()>
	//   24   59:checkcast       #148 <Class zzaaw>
	//   25   62:aload           4
	//   26   64:invokevirtual   #191 <Method void zzaaw.onSaveInstanceState(Bundle)>
				bundle.putBundle((String)entry.getKey(), bundle1);
	//   27   67:aload_1         
	//   28   68:aload_3         
	//   29   69:invokeinterface #173 <Method Object java.util.Map$Entry.getKey()>
	//   30   74:checkcast       #175 <Class String>
	//   31   77:aload           4
	//   32   79:invokevirtual   #195 <Method void Bundle.putBundle(String, Bundle)>
			}
		}
	//*  33   82:goto            25
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #198 <Method void Fragment.onStart()>
		zzJh = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #36  <Field int zzJh>
		for(Iterator iterator = zzaBu.values().iterator(); iterator.hasNext(); ((zzaaw)iterator.next()).onStart());
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field Map zzaBu>
	//    7   13:invokeinterface #132 <Method Collection Map.values()>
	//    8   18:invokeinterface #138 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #146 <Method Object Iterator.next()>
	//   15   39:checkcast       #148 <Class zzaaw>
	//   16   42:invokevirtual   #199 <Method void zzaaw.onStart()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #202 <Method void Fragment.onStop()>
		zzJh = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #36  <Field int zzJh>
		for(Iterator iterator = zzaBu.values().iterator(); iterator.hasNext(); ((zzaaw)iterator.next()).onStop());
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field Map zzaBu>
	//    7   13:invokeinterface #132 <Method Collection Map.values()>
	//    8   18:invokeinterface #138 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #146 <Method Object Iterator.next()>
	//   15   39:checkcast       #148 <Class zzaaw>
	//   16   42:invokevirtual   #203 <Method void zzaaw.onStop()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public zzaaw zza(String s, Class class1)
	{
		return (zzaaw)class1.cast(zzaBu.get(((Object) (s))));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field Map zzaBu>
	//    3    5:aload_1         
	//    4    6:invokeinterface #205 <Method Object Map.get(Object)>
	//    5   11:invokevirtual   #210 <Method Object Class.cast(Object)>
	//    6   14:checkcast       #148 <Class zzaaw>
	//    7   17:areturn         
	}

	public void zza(String s, zzaaw zzaaw1)
	{
		if(!zzaBu.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Map zzaBu>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #216 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            32
		{
			zzaBu.put(((Object) (s)), ((Object) (zzaaw1)));
	//    5   13:aload_0         
	//    6   14:getfield        #34  <Field Map zzaBu>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #217 <Method Object Map.put(Object, Object)>
	//   10   24:pop             
			zzb(s, zzaaw1);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokespecial   #219 <Method void zzb(String, zzaaw)>
			return;
	//   15   31:return          
		} else
		{
			throw new IllegalArgumentException((new StringBuilder(String.valueOf(((Object) (s))).length() + 59)).append("LifecycleCallback with tag ").append(s).append(" already added to this fragment.").toString());
	//   16   32:new             #221 <Class IllegalArgumentException>
	//   17   35:dup             
	//   18   36:new             #223 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokestatic    #227 <Method String String.valueOf(Object)>
	//   22   44:invokevirtual   #230 <Method int String.length()>
	//   23   47:bipush          59
	//   24   49:iadd            
	//   25   50:invokespecial   #233 <Method void StringBuilder(int)>
	//   26   53:ldc1            #235 <String "LifecycleCallback with tag ">
	//   27   55:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:ldc1            #241 <String " already added to this fragment.">
	//   31   64:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   33   70:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   34   73:athrow          
		}
	}

	public Activity zzwo()
	{
		return ((Activity) (zzws()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method FragmentActivity zzws()>
	//    2    4:areturn         
	}

	public FragmentActivity zzws()
	{
		return getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method FragmentActivity getActivity()>
	//    2    4:areturn         
	}

	private static WeakHashMap zzaBt = new WeakHashMap();
	private int zzJh;
	private Map zzaBu;
	private Bundle zzaBv;

	static 
	{
	//    0    0:new             #22  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void WeakHashMap()>
	//    3    7:putstatic       #27  <Field WeakHashMap zzaBt>
	//*   4   10:return          
	}
}
