// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.ArrayList;

class RecyclerView$RecycledViewPool$ScrapData
{

	long mBindRunningAverageNs;
	long mCreateRunningAverageNs;
	int mMaxScrap;
	final ArrayList mScrapHeap = new ArrayList();

	RecyclerView$RecycledViewPool$ScrapData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field ArrayList mScrapHeap>
		mMaxScrap = 5;
	//    7   15:aload_0         
	//    8   16:iconst_5        
	//    9   17:putfield        #22  <Field int mMaxScrap>
		mCreateRunningAverageNs = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #24  <Field long mCreateRunningAverageNs>
		mBindRunningAverageNs = 0L;
	//   13   25:aload_0         
	//   14   26:lconst_0        
	//   15   27:putfield        #26  <Field long mBindRunningAverageNs>
	//   16   30:return          
	}
}
