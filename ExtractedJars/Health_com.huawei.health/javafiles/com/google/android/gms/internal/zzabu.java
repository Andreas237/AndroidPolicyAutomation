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
//			zzabf, zzabe

public final class zzabu extends Fragment
	implements zzabf
{

	public zzabu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Fragment()>
		zzaCT = ((Map) (new ArrayMap()));
	//    2    4:aload_0         
	//    3    5:new             #31  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void ArrayMap()>
	//    6   12:putfield        #34  <Field Map zzaCT>
		zzJO = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #36  <Field int zzJO>
	//   10   20:return          
	}

	static int zza(zzabu zzabu1)
	{
		return zzabu1.zzJO;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int zzJO>
	//    2    4:ireturn         
	}

	public static zzabu zza(FragmentActivity fragmentactivity)
	{
		Object obj;
label0:
		{
			obj = ((Object) ((WeakReference)zzaCS.get(((Object) (fragmentactivity)))));
	//    0    0:getstatic       #27  <Field WeakHashMap zzaCS>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #45  <Method Object WeakHashMap.get(Object)>
	//    3    7:checkcast       #47  <Class WeakReference>
	//    4   10:astore_1        
			if(obj != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          29
			{
				obj = ((Object) ((zzabu)((WeakReference) (obj)).get()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #50  <Method Object WeakReference.get()>
	//    9   19:checkcast       #2   <Class zzabu>
	//   10   22:astore_1        
				if(obj != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          29
					return ((zzabu) (obj));
	//   13   27:aload_1         
	//   14   28:areturn         
			}
			zzabu zzabu1;
			try
			{
				zzabu1 = (zzabu)fragmentactivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
	//   15   29:aload_0         
	//   16   30:invokevirtual   #56  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   17   33:ldc1            #58  <String "SupportLifecycleFragmentImpl">
	//   18   35:invokevirtual   #64  <Method Fragment FragmentManager.findFragmentByTag(String)>
	//   19   38:checkcast       #2   <Class zzabu>
	//   20   41:astore_2        
			}
	//*  21   42:goto            57
			// Misplaced declaration of an exception variable
			catch(FragmentActivity fragmentactivity)
	//*  22   45:astore_0        
			{
				throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", ((Throwable) (fragmentactivity)));
	//   23   46:new             #66  <Class IllegalStateException>
	//   24   49:dup             
	//   25   50:ldc1            #68  <String "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl">
	//   26   52:aload_0         
	//   27   53:invokespecial   #71  <Method void IllegalStateException(String, Throwable)>
	//   28   56:athrow          
			}
			if(zzabu1 != null)
	//*  29   57:aload_2         
	//*  30   58:ifnull          70
			{
				obj = ((Object) (zzabu1));
	//   31   61:aload_2         
	//   32   62:astore_1        
				if(!zzabu1.isRemoving())
					break label0;
	//   33   63:aload_2         
	//   34   64:invokevirtual   #75  <Method boolean isRemoving()>
	//   35   67:ifeq            95
			}
			obj = ((Object) (new zzabu()));
	//   36   70:new             #2   <Class zzabu>
	//   37   73:dup             
	//   38   74:invokespecial   #76  <Method void zzabu()>
	//   39   77:astore_1        
			fragmentactivity.getSupportFragmentManager().beginTransaction().add(((Fragment) (obj)), "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
	//   40   78:aload_0         
	//   41   79:invokevirtual   #56  <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   42   82:invokevirtual   #80  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   43   85:aload_1         
	//   44   86:ldc1            #58  <String "SupportLifecycleFragmentImpl">
	//   45   88:invokevirtual   #86  <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   46   91:invokevirtual   #90  <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   47   94:pop             
		}
		zzaCS.put(((Object) (fragmentactivity)), ((Object) (new WeakReference(obj))));
	//   48   95:getstatic       #27  <Field WeakHashMap zzaCS>
	//   49   98:aload_0         
	//   50   99:new             #47  <Class WeakReference>
	//   51  102:dup             
	//   52  103:aload_1         
	//   53  104:invokespecial   #93  <Method void WeakReference(Object)>
	//   54  107:invokevirtual   #97  <Method Object WeakHashMap.put(Object, Object)>
	//   55  110:pop             
		return ((zzabu) (obj));
	//   56  111:aload_1         
	//   57  112:areturn         
	}

	static Bundle zzb(zzabu zzabu1)
	{
		return zzabu1.zzaCU;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Bundle zzaCU>
	//    2    4:areturn         
	}

	private void zzb(String s, zzabe zzabe1)
	{
		if(zzJO > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int zzJO>
	//*   2    4:ifle            31
			(new Handler(Looper.getMainLooper())).post(new Runnable(zzabe1, s) {

				public void run()
				{
					if(zzabu.zza(zzaDk) >= 1)
				//*   0    0:aload_0         
				//*   1    1:getfield        #21  <Field zzabu zzaDk>
				//*   2    4:invokestatic    #34  <Method int zzabu.zza(zzabu)>
				//*   3    7:iconst_1        
				//*   4    8:icmplt          51
					{
						zzabe zzabe2 = zzaCV;
				//    5   11:aload_0         
				//    6   12:getfield        #23  <Field zzabe zzaCV>
				//    7   15:astore_2        
						Bundle bundle;
						if(zzabu.zzb(zzaDk) != null)
				//*   8   16:aload_0         
				//*   9   17:getfield        #21  <Field zzabu zzaDk>
				//*  10   20:invokestatic    #37  <Method Bundle zzabu.zzb(zzabu)>
				//*  11   23:ifnull          44
							bundle = zzabu.zzb(zzaDk).getBundle(zzP);
				//   12   26:aload_0         
				//   13   27:getfield        #21  <Field zzabu zzaDk>
				//   14   30:invokestatic    #37  <Method Bundle zzabu.zzb(zzabu)>
				//   15   33:aload_0         
				//   16   34:getfield        #25  <Field String zzP>
				//   17   37:invokevirtual   #43  <Method Bundle Bundle.getBundle(String)>
				//   18   40:astore_1        
						else
				//*  19   41:goto            46
							bundle = null;
				//   20   44:aconst_null     
				//   21   45:astore_1        
						zzabe2.onCreate(bundle);
				//   22   46:aload_2         
				//   23   47:aload_1         
				//   24   48:invokevirtual   #49  <Method void zzabe.onCreate(Bundle)>
					}
					if(zzabu.zza(zzaDk) >= 2)
				//*  25   51:aload_0         
				//*  26   52:getfield        #21  <Field zzabu zzaDk>
				//*  27   55:invokestatic    #34  <Method int zzabu.zza(zzabu)>
				//*  28   58:iconst_2        
				//*  29   59:icmplt          69
						zzaCV.onStart();
				//   30   62:aload_0         
				//   31   63:getfield        #23  <Field zzabe zzaCV>
				//   32   66:invokevirtual   #52  <Method void zzabe.onStart()>
					if(zzabu.zza(zzaDk) >= 3)
				//*  33   69:aload_0         
				//*  34   70:getfield        #21  <Field zzabu zzaDk>
				//*  35   73:invokestatic    #34  <Method int zzabu.zza(zzabu)>
				//*  36   76:iconst_3        
				//*  37   77:icmplt          87
						zzaCV.onStop();
				//   38   80:aload_0         
				//   39   81:getfield        #23  <Field zzabe zzaCV>
				//   40   84:invokevirtual   #55  <Method void zzabe.onStop()>
					if(zzabu.zza(zzaDk) >= 4)
				//*  41   87:aload_0         
				//*  42   88:getfield        #21  <Field zzabu zzaDk>
				//*  43   91:invokestatic    #34  <Method int zzabu.zza(zzabu)>
				//*  44   94:iconst_4        
				//*  45   95:icmplt          105
						zzaCV.onDestroy();
				//   46   98:aload_0         
				//   47   99:getfield        #23  <Field zzabe zzaCV>
				//   48  102:invokevirtual   #58  <Method void zzabe.onDestroy()>
				//   49  105:return          
				}

				final String zzP;
				final zzabe zzaCV;
				final zzabu zzaDk;

			
			{
				zzaDk = zzabu.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field zzabu zzaDk>
				zzaCV = zzabe1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field zzabe zzaCV>
				zzP = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String zzP>
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
	//    7   17:new             #8   <Class zzabu$1>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokespecial   #117 <Method void zzabu$1(zzabu, zzabe, String)>
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
		for(Iterator iterator = zzaCT.values().iterator(); iterator.hasNext(); ((zzabe)iterator.next()).dump(s, filedescriptor, printwriter, as));
	//    6    9:aload_0         
	//    7   10:getfield        #34  <Field Map zzaCT>
	//    8   13:invokeinterface #132 <Method Collection Map.values()>
	//    9   18:invokeinterface #138 <Method Iterator Collection.iterator()>
	//   10   23:astore          5
	//   11   25:aload           5
	//   12   27:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   13   32:ifeq            56
	//   14   35:aload           5
	//   15   37:invokeinterface #146 <Method Object Iterator.next()>
	//   16   42:checkcast       #148 <Class zzabe>
	//   17   45:aload_1         
	//   18   46:aload_2         
	//   19   47:aload_3         
	//   20   48:aload           4
	//   21   50:invokevirtual   #149 <Method void zzabe.dump(String, FileDescriptor, PrintWriter, String[])>
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
		for(Iterator iterator = zzaCT.values().iterator(); iterator.hasNext(); ((zzabe)iterator.next()).onActivityResult(i, j, intent));
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field Map zzaCT>
	//    7   11:invokeinterface #132 <Method Collection Map.values()>
	//    8   16:invokeinterface #138 <Method Iterator Collection.iterator()>
	//    9   21:astore          4
	//   10   23:aload           4
	//   11   25:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            52
	//   13   33:aload           4
	//   14   35:invokeinterface #146 <Method Object Iterator.next()>
	//   15   40:checkcast       #148 <Class zzabe>
	//   16   43:iload_1         
	//   17   44:iload_2         
	//   18   45:aload_3         
	//   19   46:invokevirtual   #154 <Method void zzabe.onActivityResult(int, int, Intent)>
	//*  20   49:goto            23
	//   21   52:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void Fragment.onCreate(Bundle)>
		zzJO = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #36  <Field int zzJO>
		zzaCU = bundle;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #101 <Field Bundle zzaCU>
		Object obj;
		zzabe zzabe1;
		for(Iterator iterator = zzaCT.entrySet().iterator(); iterator.hasNext(); zzabe1.onCreate(((Bundle) (obj))))
	//*   9   15:aload_0         
	//*  10   16:getfield        #34  <Field Map zzaCT>
	//*  11   19:invokeinterface #162 <Method Set Map.entrySet()>
	//*  12   24:invokeinterface #165 <Method Iterator Set.iterator()>
	//*  13   29:astore_3        
	//*  14   30:aload_3         
	//*  15   31:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  16   36:ifeq            92
		{
			obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   17   39:aload_3         
	//   18   40:invokeinterface #146 <Method Object Iterator.next()>
	//   19   45:checkcast       #167 <Class java.util.Map$Entry>
	//   20   48:astore_2        
			zzabe1 = (zzabe)((java.util.Map.Entry) (obj)).getValue();
	//   21   49:aload_2         
	//   22   50:invokeinterface #170 <Method Object java.util.Map$Entry.getValue()>
	//   23   55:checkcast       #148 <Class zzabe>
	//   24   58:astore          4
			if(bundle != null)
	//*  25   60:aload_1         
	//*  26   61:ifnull          81
				obj = ((Object) (bundle.getBundle((String)((java.util.Map.Entry) (obj)).getKey())));
	//   27   64:aload_1         
	//   28   65:aload_2         
	//   29   66:invokeinterface #173 <Method Object java.util.Map$Entry.getKey()>
	//   30   71:checkcast       #175 <Class String>
	//   31   74:invokevirtual   #181 <Method Bundle Bundle.getBundle(String)>
	//   32   77:astore_2        
			else
	//*  33   78:goto            83
				obj = null;
	//   34   81:aconst_null     
	//   35   82:astore_2        
		}

	//   36   83:aload           4
	//   37   85:aload_2         
	//   38   86:invokevirtual   #182 <Method void zzabe.onCreate(Bundle)>
	//*  39   89:goto            30
	//   40   92:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #185 <Method void Fragment.onDestroy()>
		zzJO = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #36  <Field int zzJO>
		for(Iterator iterator = zzaCT.values().iterator(); iterator.hasNext(); ((zzabe)iterator.next()).onDestroy());
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field Map zzaCT>
	//    7   13:invokeinterface #132 <Method Collection Map.values()>
	//    8   18:invokeinterface #138 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #146 <Method Object Iterator.next()>
	//   15   39:checkcast       #148 <Class zzabe>
	//   16   42:invokevirtual   #186 <Method void zzabe.onDestroy()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #189 <Method void Fragment.onSaveInstanceState(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		java.util.Map.Entry entry;
		Bundle bundle1;
		for(Iterator iterator = zzaCT.entrySet().iterator(); iterator.hasNext(); bundle.putBundle((String)entry.getKey(), bundle1))
	//*   6   10:aload_0         
	//*   7   11:getfield        #34  <Field Map zzaCT>
	//*   8   14:invokeinterface #162 <Method Set Map.entrySet()>
	//*   9   19:invokeinterface #165 <Method Iterator Set.iterator()>
	//*  10   24:astore_2        
	//*  11   25:aload_2         
	//*  12   26:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  13   31:ifeq            85
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   14   34:aload_2         
	//   15   35:invokeinterface #146 <Method Object Iterator.next()>
	//   16   40:checkcast       #167 <Class java.util.Map$Entry>
	//   17   43:astore_3        
			bundle1 = new Bundle();
	//   18   44:new             #177 <Class Bundle>
	//   19   47:dup             
	//   20   48:invokespecial   #190 <Method void Bundle()>
	//   21   51:astore          4
			((zzabe)entry.getValue()).onSaveInstanceState(bundle1);
	//   22   53:aload_3         
	//   23   54:invokeinterface #170 <Method Object java.util.Map$Entry.getValue()>
	//   24   59:checkcast       #148 <Class zzabe>
	//   25   62:aload           4
	//   26   64:invokevirtual   #191 <Method void zzabe.onSaveInstanceState(Bundle)>
		}

	//   27   67:aload_1         
	//   28   68:aload_3         
	//   29   69:invokeinterface #173 <Method Object java.util.Map$Entry.getKey()>
	//   30   74:checkcast       #175 <Class String>
	//   31   77:aload           4
	//   32   79:invokevirtual   #195 <Method void Bundle.putBundle(String, Bundle)>
	//*  33   82:goto            25
	//   34   85:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #198 <Method void Fragment.onStart()>
		zzJO = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #36  <Field int zzJO>
		for(Iterator iterator = zzaCT.values().iterator(); iterator.hasNext(); ((zzabe)iterator.next()).onStart());
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field Map zzaCT>
	//    7   13:invokeinterface #132 <Method Collection Map.values()>
	//    8   18:invokeinterface #138 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #146 <Method Object Iterator.next()>
	//   15   39:checkcast       #148 <Class zzabe>
	//   16   42:invokevirtual   #199 <Method void zzabe.onStart()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #202 <Method void Fragment.onStop()>
		zzJO = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #36  <Field int zzJO>
		for(Iterator iterator = zzaCT.values().iterator(); iterator.hasNext(); ((zzabe)iterator.next()).onStop());
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field Map zzaCT>
	//    7   13:invokeinterface #132 <Method Collection Map.values()>
	//    8   18:invokeinterface #138 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #146 <Method Object Iterator.next()>
	//   15   39:checkcast       #148 <Class zzabe>
	//   16   42:invokevirtual   #203 <Method void zzabe.onStop()>
	//*  17   45:goto            24
	//   18   48:return          
	}

	public zzabe zza(String s, Class class1)
	{
		return (zzabe)class1.cast(zzaCT.get(((Object) (s))));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field Map zzaCT>
	//    3    5:aload_1         
	//    4    6:invokeinterface #205 <Method Object Map.get(Object)>
	//    5   11:invokevirtual   #210 <Method Object Class.cast(Object)>
	//    6   14:checkcast       #148 <Class zzabe>
	//    7   17:areturn         
	}

	public void zza(String s, zzabe zzabe1)
	{
		if(!zzaCT.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Map zzaCT>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #216 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            32
		{
			zzaCT.put(((Object) (s)), ((Object) (zzabe1)));
	//    5   13:aload_0         
	//    6   14:getfield        #34  <Field Map zzaCT>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #217 <Method Object Map.put(Object, Object)>
	//   10   24:pop             
			zzb(s, zzabe1);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:invokespecial   #219 <Method void zzb(String, zzabe)>
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

	public Activity zzwV()
	{
		return ((Activity) (zzwZ()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method FragmentActivity zzwZ()>
	//    2    4:areturn         
	}

	public FragmentActivity zzwZ()
	{
		return getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #257 <Method FragmentActivity getActivity()>
	//    2    4:areturn         
	}

	private static WeakHashMap zzaCS = new WeakHashMap();
	private int zzJO;
	private Map zzaCT;
	private Bundle zzaCU;

	static 
	{
	//    0    0:new             #22  <Class WeakHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void WeakHashMap()>
	//    3    7:putstatic       #27  <Field WeakHashMap zzaCS>
	//*   4   10:return          
	}
}
