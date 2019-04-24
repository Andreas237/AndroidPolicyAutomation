// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.content.Context;
import java.util.*;

// Referenced classes of package com.google.android.gms.flags:
//			Singletons, FlagValueProvider, Flag

public class FlagRegistry
{

	public FlagRegistry()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field Collection zzacc>
	//    7   15:aload_0         
	//    8   16:new             #16  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #17  <Method void ArrayList()>
	//   11   23:putfield        #21  <Field Collection zzacd>
	//   12   26:aload_0         
	//   13   27:new             #16  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #17  <Method void ArrayList()>
	//   16   34:putfield        #23  <Field Collection zzace>
	//   17   37:return          
	}

	public static void initialize(Context context)
	{
		Singletons.flagValueProvider().initialize(context);
	//    0    0:invokestatic    #32  <Method FlagValueProvider Singletons.flagValueProvider()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #36  <Method void FlagValueProvider.initialize(Context)>
	//    3    7:return          
	}

	public List getExperimentIdsFromClient()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #16  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = zzacd.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field Collection zzacd>
	//    6   12:invokeinterface #44  <Method Iterator Collection.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            58
			String s = (String)((Flag) ((Flag.StringFlag)iterator.next())).get();
	//   11   27:aload_2         
	//   12   28:invokeinterface #54  <Method Object Iterator.next()>
	//   13   33:checkcast       #56  <Class Flag$StringFlag>
	//   14   36:invokevirtual   #61  <Method Object Flag.get()>
	//   15   39:checkcast       #63  <Class String>
	//   16   42:astore_3        
			if(s != null)
	//*  17   43:aload_3         
	//*  18   44:ifnull          18
				((List) (arraylist)).add(((Object) (s)));
	//   19   47:aload_1         
	//   20   48:aload_3         
	//   21   49:invokeinterface #69  <Method boolean List.add(Object)>
	//   22   54:pop             
		} while(true);
	//   23   55:goto            18
		return ((List) (arraylist));
	//   24   58:aload_1         
	//   25   59:areturn         
	}

	public void registerClientExperimentId(Flag.StringFlag stringflag)
	{
		zzacd.add(((Object) (stringflag)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Collection zzacd>
	//    2    4:aload_1         
	//    3    5:invokeinterface #74  <Method boolean Collection.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void registerFlag(Flag flag)
	{
		zzacc.add(((Object) (flag)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Collection zzacc>
	//    2    4:aload_1         
	//    3    5:invokeinterface #74  <Method boolean Collection.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void registerServiceExperimentId(Flag.StringFlag stringflag)
	{
		zzace.add(((Object) (stringflag)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Collection zzace>
	//    2    4:aload_1         
	//    3    5:invokeinterface #74  <Method boolean Collection.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public Collection registeredFlags()
	{
		return Collections.unmodifiableCollection(zzacc);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Collection zzacc>
	//    2    4:invokestatic    #85  <Method Collection Collections.unmodifiableCollection(Collection)>
	//    3    7:areturn         
	}

	public Collection registeredServiceExperimentIdFlags()
	{
		return Collections.unmodifiableCollection(zzace);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Collection zzace>
	//    2    4:invokestatic    #85  <Method Collection Collections.unmodifiableCollection(Collection)>
	//    3    7:areturn         
	}

	private final Collection zzacc = new ArrayList();
	private final Collection zzacd = new ArrayList();
	private final Collection zzace = new ArrayList();
}
