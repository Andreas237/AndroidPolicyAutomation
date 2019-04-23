// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text.util;

import java.util.Comparator;

// Referenced classes of package android.support.v4.text.util:
//			LinkifyCompat

static final class LinkifyCompat$1
	implements Comparator
{

	public int compare(nkSpec nkspec, nkSpec nkspec1)
	{
		if(nkspec.start < nkspec1.start)
	//*   0    0:aload_1         
	//*   1    1:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
	//*   2    4:aload_2         
	//*   3    5:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
	//*   4    8:icmpge          13
			return -1;
	//    5   11:iconst_m1       
	//    6   12:ireturn         
		if(nkspec.start > nkspec1.start)
	//*   7   13:aload_1         
	//*   8   14:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
	//*   9   17:aload_2         
	//*  10   18:getfield        #22  <Field int LinkifyCompat$LinkSpec.start>
	//*  11   21:icmple          26
			return 1;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		if(nkspec.end < nkspec1.end)
	//*  14   26:aload_1         
	//*  15   27:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
	//*  16   30:aload_2         
	//*  17   31:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
	//*  18   34:icmpge          39
			return 1;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		return nkspec.end <= nkspec1.end ? 0 : -1;
	//   21   39:aload_1         
	//   22   40:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
	//   23   43:aload_2         
	//   24   44:getfield        #25  <Field int LinkifyCompat$LinkSpec.end>
	//   25   47:icmple          52
	//   26   50:iconst_m1       
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((nkSpec)obj, (nkSpec)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class LinkifyCompat$LinkSpec>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class LinkifyCompat$LinkSpec>
	//    5    9:invokevirtual   #28  <Method int compare(LinkifyCompat$LinkSpec, LinkifyCompat$LinkSpec)>
	//    6   12:ireturn         
	}

	LinkifyCompat$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
