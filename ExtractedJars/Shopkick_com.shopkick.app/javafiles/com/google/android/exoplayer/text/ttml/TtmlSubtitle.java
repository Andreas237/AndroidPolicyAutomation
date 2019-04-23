// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.ttml;

import com.google.android.exoplayer.text.Subtitle;
import com.google.android.exoplayer.util.Util;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.text.ttml:
//			TtmlNode

public final class TtmlSubtitle
	implements Subtitle
{

	public TtmlSubtitle(TtmlNode ttmlnode, Map map, Map map1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		root = ttmlnode;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field TtmlNode root>
		regionMap = map1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #24  <Field Map regionMap>
		if(map != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          26
			map = Collections.unmodifiableMap(map);
	//   10   18:aload_2         
	//   11   19:invokestatic    #30  <Method Map Collections.unmodifiableMap(Map)>
	//   12   22:astore_2        
		else
	//*  13   23:goto            30
			map = Collections.emptyMap();
	//   14   26:invokestatic    #34  <Method Map Collections.emptyMap()>
	//   15   29:astore_2        
		globalStyles = map;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #36  <Field Map globalStyles>
		eventTimesUs = ttmlnode.getEventTimesUs();
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #42  <Method long[] TtmlNode.getEventTimesUs()>
	//   22   40:putfield        #44  <Field long[] eventTimesUs>
	//   23   43:return          
	}

	public List getCues(long l)
	{
		return root.getCues(l, globalStyles, regionMap);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TtmlNode root>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field Map globalStyles>
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field Map regionMap>
	//    7   13:invokevirtual   #52  <Method List TtmlNode.getCues(long, Map, Map)>
	//    8   16:areturn         
	}

	public long getEventTime(int i)
	{
		return eventTimesUs[i];
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long[] eventTimesUs>
	//    2    4:iload_1         
	//    3    5:laload          
	//    4    6:lreturn         
	}

	public int getEventTimeCount()
	{
		return eventTimesUs.length;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long[] eventTimesUs>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	Map getGlobalStyles()
	{
		return globalStyles;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Map globalStyles>
	//    2    4:areturn         
	}

	public long getLastEventTime()
	{
		long al[] = eventTimesUs;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long[] eventTimesUs>
	//    2    4:astore_1        
		if(al.length == 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifne            14
			return -1L;
	//    6   10:ldc2w           #62  <Long -1L>
	//    7   13:lreturn         
		else
			return al[al.length - 1];
	//    8   14:aload_1         
	//    9   15:aload_1         
	//   10   16:arraylength     
	//   11   17:iconst_1        
	//   12   18:isub            
	//   13   19:laload          
	//   14   20:lreturn         
	}

	public int getNextEventTimeIndex(long l)
	{
		int i = Util.binarySearchCeil(eventTimesUs, l, false, false);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long[] eventTimesUs>
	//    2    4:lload_1         
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokestatic    #71  <Method int Util.binarySearchCeil(long[], long, boolean, boolean)>
	//    6   10:istore_3        
		if(i < eventTimesUs.length)
	//*   7   11:iload_3         
	//*   8   12:aload_0         
	//*   9   13:getfield        #44  <Field long[] eventTimesUs>
	//*  10   16:arraylength     
	//*  11   17:icmpge          22
			return i;
	//   12   20:iload_3         
	//   13   21:ireturn         
		else
			return -1;
	//   14   22:iconst_m1       
	//   15   23:ireturn         
	}

	TtmlNode getRoot()
	{
		return root;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field TtmlNode root>
	//    2    4:areturn         
	}

	private final long eventTimesUs[];
	private final Map globalStyles;
	private final Map regionMap;
	private final TtmlNode root;
}
