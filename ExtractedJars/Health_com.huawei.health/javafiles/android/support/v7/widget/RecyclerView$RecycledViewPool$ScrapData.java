// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

static class RecyclerView$RecycledViewPool$ScrapData
{

	long mBindRunningAverageNs;
	long mCreateRunningAverageNs;
	int mMaxScrap;
	ArrayList mScrapHeap;

	RecyclerView$RecycledViewPool$ScrapData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mScrapHeap = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void ArrayList()>
	//    6   12:putfield        #27  <Field ArrayList mScrapHeap>
		mMaxScrap = 5;
	//    7   15:aload_0         
	//    8   16:iconst_5        
	//    9   17:putfield        #29  <Field int mMaxScrap>
		mCreateRunningAverageNs = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #31  <Field long mCreateRunningAverageNs>
		mBindRunningAverageNs = 0L;
	//   13   25:aload_0         
	//   14   26:lconst_0        
	//   15   27:putfield        #33  <Field long mBindRunningAverageNs>
	//   16   30:return          
	}
}
