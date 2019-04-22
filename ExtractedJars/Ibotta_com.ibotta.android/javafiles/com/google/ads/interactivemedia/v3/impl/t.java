// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.SortedSet;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			aa, ab

public class t
	implements af.b
{

	public t(ab ab1, SortedSet sortedset, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		d = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #22  <Field float d>
		b = ab1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #24  <Field ab b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field String c>
		a = sortedset;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #28  <Field SortedSet a>
	//   14   24:return          
	}

	private SortedSet a(float f)
	{
		float f1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float d>
	//    2    4:fstore_2        
		if(f1 < f)
	//*   3    5:fload_2         
	//*   4    6:fload_1         
	//*   5    7:fcmpg           
	//*   6    8:ifge            29
			return a.subSet(((Object) (Float.valueOf(f1))), ((Object) (Float.valueOf(f))));
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field SortedSet a>
	//    9   15:fload_2         
	//   10   16:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   11   19:fload_1         
	//   12   20:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   13   23:invokeinterface #44  <Method SortedSet SortedSet.subSet(Object, Object)>
	//   14   28:areturn         
		else
			return a.subSet(((Object) (Float.valueOf(f))), ((Object) (Float.valueOf(d))));
	//   15   29:aload_0         
	//   16   30:getfield        #28  <Field SortedSet a>
	//   17   33:fload_1         
	//   18   34:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   19   37:aload_0         
	//   20   38:getfield        #22  <Field float d>
	//   21   41:invokestatic    #38  <Method Float Float.valueOf(float)>
	//   22   44:invokeinterface #44  <Method SortedSet SortedSet.subSet(Object, Object)>
	//   23   49:areturn         
	}

	public void a(VideoProgressUpdate videoprogressupdate)
	{
		if(videoprogressupdate != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          68
		{
			if(videoprogressupdate.getDuration() < 0.0F)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #52  <Method float VideoProgressUpdate.getDuration()>
	//*   4    8:fconst_0        
	//*   5    9:fcmpg           
	//*   6   10:ifge            14
				return;
	//    7   13:return          
			boolean flag = a(videoprogressupdate.getCurrentTime()).isEmpty();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #55  <Method float VideoProgressUpdate.getCurrentTime()>
	//   11   19:invokespecial   #57  <Method SortedSet a(float)>
	//   12   22:invokeinterface #61  <Method boolean SortedSet.isEmpty()>
	//   13   27:istore_2        
			d = videoprogressupdate.getCurrentTime();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #55  <Method float VideoProgressUpdate.getCurrentTime()>
	//   17   33:putfield        #22  <Field float d>
			if(flag ^ true)
	//*  18   36:iload_2         
	//*  19   37:iconst_1        
	//*  20   38:ixor            
	//*  21   39:ifeq            67
				b.b(new aa(aa.b.contentTimeUpdate, aa.c.contentTimeUpdate, c, ((Object) (videoprogressupdate))));
	//   22   42:aload_0         
	//   23   43:getfield        #24  <Field ab b>
	//   24   46:new             #63  <Class aa>
	//   25   49:dup             
	//   26   50:getstatic       #69  <Field aa$b aa$b.contentTimeUpdate>
	//   27   53:getstatic       #74  <Field aa$c aa$c.contentTimeUpdate>
	//   28   56:aload_0         
	//   29   57:getfield        #26  <Field String c>
	//   30   60:aload_1         
	//   31   61:invokespecial   #77  <Method void aa(aa$b, aa$c, String, Object)>
	//   32   64:invokevirtual   #82  <Method void ab.b(aa)>
			return;
	//   33   67:return          
		} else
		{
			return;
	//   34   68:return          
		}
	}

	private final SortedSet a;
	private ab b;
	private String c;
	private float d;
}
