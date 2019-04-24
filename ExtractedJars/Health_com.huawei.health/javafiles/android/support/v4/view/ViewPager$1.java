// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//			ViewPager

static final class ViewPager$1
	implements Comparator
{

	public int compare(emInfo eminfo, emInfo eminfo1)
	{
		return eminfo.position - eminfo1.position;
	//    0    0:aload_1         
	//    1    1:getfield        #22  <Field int ViewPager$ItemInfo.position>
	//    2    4:aload_2         
	//    3    5:getfield        #22  <Field int ViewPager$ItemInfo.position>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((emInfo)obj, (emInfo)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class ViewPager$ItemInfo>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class ViewPager$ItemInfo>
	//    5    9:invokevirtual   #25  <Method int compare(ViewPager$ItemInfo, ViewPager$ItemInfo)>
	//    6   12:ireturn         
	}

	ViewPager$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
