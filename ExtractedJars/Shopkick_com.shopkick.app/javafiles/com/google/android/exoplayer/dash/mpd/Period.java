// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			AdaptationSet

public class Period
{

	public Period(String s, long l, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String id>
		startMs = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #20  <Field long startMs>
		adaptationSets = Collections.unmodifiableList(list);
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:invokestatic    #26  <Method List Collections.unmodifiableList(List)>
	//   11   20:putfield        #28  <Field List adaptationSets>
	//   12   23:return          
	}

	public int getAdaptationSetIndex(int i)
	{
		int k = adaptationSets.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List adaptationSets>
	//    2    4:invokeinterface #39  <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          46
			if(((AdaptationSet)adaptationSets.get(j)).type == i)
	//*   9   17:aload_0         
	//*  10   18:getfield        #28  <Field List adaptationSets>
	//*  11   21:iload_2         
	//*  12   22:invokeinterface #43  <Method Object List.get(int)>
	//*  13   27:checkcast       #45  <Class AdaptationSet>
	//*  14   30:getfield        #49  <Field int AdaptationSet.type>
	//*  15   33:iload_1         
	//*  16   34:icmpne          39
				return j;
	//   17   37:iload_2         
	//   18   38:ireturn         

	//   19   39:iload_2         
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:istore_2        
	//*  23   43:goto            12
		return -1;
	//   24   46:iconst_m1       
	//   25   47:ireturn         
	}

	public final List adaptationSets;
	public final String id;
	public final long startMs;
}
