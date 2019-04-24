// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.os.Parcel;

// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

static final class Entry$2
	implements android.os.le.Creator
{

	public Entry[] b(int i)
	{
		return new Entry[i];
	//    0    0:iload_1         
	//    1    1:anewarray       Entry[]
	//    2    4:areturn         
	}

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (e(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method Entry e(Parcel)>
	//    3    5:areturn         
	}

	public Entry e(Parcel parcel)
	{
		return new Entry(parcel);
	//    0    0:new             #9   <Class Entry>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #25  <Method void Entry(Parcel)>
	//    4    8:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (b(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #29  <Method Entry[] b(int)>
	//    3    5:areturn         
	}

	Entry$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
