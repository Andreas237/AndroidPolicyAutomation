// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			blj, bld, ble

public final class blk extends blj
{

	public blk(bld bld1, long l, long l1, int i, long l2, List list, List list1)
	{
		super(bld1, l, l1, i, l2, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iload           6
	//    5    7:lload           7
	//    6    9:aload           9
	//    7   11:invokespecial   #11  <Method void blj(bld, long, long, int, long, List)>
		g = list1;
	//    8   14:aload_0         
	//    9   15:aload           10
	//   10   17:putfield        #13  <Field List g>
	//   11   20:return          
	}

	public final int a(long l)
	{
		return g.size();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field List g>
	//    2    4:invokeinterface #22  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final bld a(ble ble, int i)
	{
		return (bld)g.get(i - d);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field List g>
	//    2    4:iload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field int d>
	//    5    9:isub            
	//    6   10:invokeinterface #31  <Method Object List.get(int)>
	//    7   15:checkcast       #33  <Class bld>
	//    8   18:areturn         
	}

	public final boolean a()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final List g;
}
