// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.SparseArray;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$RecycledViewPool
{
	static class ScrapData
	{

		long mBindRunningAverageNs;
		long mCreateRunningAverageNs;
		int mMaxScrap;
		final ArrayList mScrapHeap = new ArrayList();

		ScrapData()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
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


	private ScrapData getScrapDataForType(int i)
	{
		ScrapData scrapdata1 = (ScrapData)mScrap.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SparseArray mScrap>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #35  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #9   <Class RecyclerView$RecycledViewPool$ScrapData>
	//    5   11:astore_3        
		ScrapData scrapdata = scrapdata1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(scrapdata1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       35
		{
			scrapdata = new ScrapData();
	//   10   18:new             #9   <Class RecyclerView$RecycledViewPool$ScrapData>
	//   11   21:dup             
	//   12   22:invokespecial   #36  <Method void RecyclerView$RecycledViewPool$ScrapData()>
	//   13   25:astore_2        
			mScrap.put(i, ((Object) (scrapdata)));
	//   14   26:aload_0         
	//   15   27:getfield        #26  <Field SparseArray mScrap>
	//   16   30:iload_1         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #40  <Method void SparseArray.put(int, Object)>
		}
		return scrapdata;
	//   19   35:aload_2         
	//   20   36:areturn         
	}

	void attach(RecyclerView.Adapter adapter)
	{
		mAttachCount = mAttachCount + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field int mAttachCount>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #28  <Field int mAttachCount>
	//    6   10:return          
	}

	public void clear()
	{
		for(int i = 0; i < mScrap.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #26  <Field SparseArray mScrap>
	//*   5    7:invokevirtual   #47  <Method int SparseArray.size()>
	//*   6   10:icmpge          37
			((ScrapData)mScrap.valueAt(i)).mScrapHeap.clear();
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field SparseArray mScrap>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #50  <Method Object SparseArray.valueAt(int)>
	//   11   21:checkcast       #9   <Class RecyclerView$RecycledViewPool$ScrapData>
	//   12   24:getfield        #54  <Field ArrayList RecyclerView$RecycledViewPool$ScrapData.mScrapHeap>
	//   13   27:invokevirtual   #58  <Method void ArrayList.clear()>

	//   14   30:iload_1         
	//   15   31:iconst_1        
	//   16   32:iadd            
	//   17   33:istore_1        
	//*  18   34:goto            2
	//   19   37:return          
	}

	void detach()
	{
		mAttachCount = mAttachCount - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field int mAttachCount>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #28  <Field int mAttachCount>
	//    6   10:return          
	}

	void factorInBindTime(int i, long l)
	{
		ScrapData scrapdata = getScrapDataForType(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method RecyclerView$RecycledViewPool$ScrapData getScrapDataForType(int)>
	//    3    5:astore          4
		scrapdata.mBindRunningAverageNs = runningAverage(scrapdata.mBindRunningAverageNs, l);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:getfield        #67  <Field long RecyclerView$RecycledViewPool$ScrapData.mBindRunningAverageNs>
	//    8   15:lload_2         
	//    9   16:invokevirtual   #71  <Method long runningAverage(long, long)>
	//   10   19:putfield        #67  <Field long RecyclerView$RecycledViewPool$ScrapData.mBindRunningAverageNs>
	//   11   22:return          
	}

	void factorInCreateTime(int i, long l)
	{
		ScrapData scrapdata = getScrapDataForType(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method RecyclerView$RecycledViewPool$ScrapData getScrapDataForType(int)>
	//    3    5:astore          4
		scrapdata.mCreateRunningAverageNs = runningAverage(scrapdata.mCreateRunningAverageNs, l);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:getfield        #75  <Field long RecyclerView$RecycledViewPool$ScrapData.mCreateRunningAverageNs>
	//    8   15:lload_2         
	//    9   16:invokevirtual   #71  <Method long runningAverage(long, long)>
	//   10   19:putfield        #75  <Field long RecyclerView$RecycledViewPool$ScrapData.mCreateRunningAverageNs>
	//   11   22:return          
	}

	public RecyclerView.ViewHolder getRecycledView(int i)
	{
		Object obj = ((Object) ((ScrapData)mScrap.get(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field SparseArray mScrap>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #35  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #9   <Class RecyclerView$RecycledViewPool$ScrapData>
	//    5   11:astore_2        
		if(obj != null && !((ScrapData) (obj)).mScrapHeap.isEmpty())
	//*   6   12:aload_2         
	//*   7   13:ifnull          45
	//*   8   16:aload_2         
	//*   9   17:getfield        #54  <Field ArrayList RecyclerView$RecycledViewPool$ScrapData.mScrapHeap>
	//*  10   20:invokevirtual   #82  <Method boolean ArrayList.isEmpty()>
	//*  11   23:ifne            45
		{
			obj = ((Object) (((ScrapData) (obj)).mScrapHeap));
	//   12   26:aload_2         
	//   13   27:getfield        #54  <Field ArrayList RecyclerView$RecycledViewPool$ScrapData.mScrapHeap>
	//   14   30:astore_2        
			return (RecyclerView.ViewHolder)((ArrayList) (obj)).remove(((ArrayList) (obj)).size() - 1);
	//   15   31:aload_2         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #83  <Method int ArrayList.size()>
	//   18   36:iconst_1        
	//   19   37:isub            
	//   20   38:invokevirtual   #86  <Method Object ArrayList.remove(int)>
	//   21   41:checkcast       #88  <Class RecyclerView$ViewHolder>
	//   22   44:areturn         
		} else
		{
			return null;
	//   23   45:aconst_null     
	//   24   46:areturn         
		}
	}

	public int getRecycledViewCount(int i)
	{
		return getScrapDataForType(i).mScrapHeap.size();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method RecyclerView$RecycledViewPool$ScrapData getScrapDataForType(int)>
	//    3    5:getfield        #54  <Field ArrayList RecyclerView$RecycledViewPool$ScrapData.mScrapHeap>
	//    4    8:invokevirtual   #83  <Method int ArrayList.size()>
	//    5   11:ireturn         
	}

	void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter1, boolean flag)
	{
		if(adapter != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
			detach();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #95  <Method void detach()>
		if(!flag && mAttachCount == 0)
	//*   4    8:iload_3         
	//*   5    9:ifne            23
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field int mAttachCount>
	//*   8   16:ifne            23
			clear();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #96  <Method void clear()>
		if(adapter1 != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          32
			attach(adapter1);
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #98  <Method void attach(RecyclerView$Adapter)>
	//   16   32:return          
	}

	public void putRecycledView(RecyclerView.ViewHolder viewholder)
	{
		int i = viewholder.getItemViewType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #103 <Method int RecyclerView$ViewHolder.getItemViewType()>
	//    2    4:istore_2        
		ArrayList arraylist = getScrapDataForType(i).mScrapHeap;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #63  <Method RecyclerView$RecycledViewPool$ScrapData getScrapDataForType(int)>
	//    6   10:getfield        #54  <Field ArrayList RecyclerView$RecycledViewPool$ScrapData.mScrapHeap>
	//    7   13:astore_3        
		if(((ScrapData)mScrap.get(i)).mMaxScrap <= arraylist.size())
	//*   8   14:aload_0         
	//*   9   15:getfield        #26  <Field SparseArray mScrap>
	//*  10   18:iload_2         
	//*  11   19:invokevirtual   #35  <Method Object SparseArray.get(int)>
	//*  12   22:checkcast       #9   <Class RecyclerView$RecycledViewPool$ScrapData>
	//*  13   25:getfield        #106 <Field int RecyclerView$RecycledViewPool$ScrapData.mMaxScrap>
	//*  14   28:aload_3         
	//*  15   29:invokevirtual   #83  <Method int ArrayList.size()>
	//*  16   32:icmpgt          36
		{
			return;
	//   17   35:return          
		} else
		{
			viewholder.resetInternal();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #109 <Method void RecyclerView$ViewHolder.resetInternal()>
			arraylist.add(((Object) (viewholder)));
	//   20   40:aload_3         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #113 <Method boolean ArrayList.add(Object)>
	//   23   45:pop             
			return;
	//   24   46:return          
		}
	}

	long runningAverage(long l, long l1)
	{
		if(l == 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            8
			return l1;
	//    4    6:lload_3         
	//    5    7:lreturn         
		else
			return (l / 4L) * 3L + l1 / 4L;
	//    6    8:lload_1         
	//    7    9:ldc2w           #114 <Long 4L>
	//    8   12:ldiv            
	//    9   13:ldc2w           #116 <Long 3L>
	//   10   16:lmul            
	//   11   17:lload_3         
	//   12   18:ldc2w           #114 <Long 4L>
	//   13   21:ldiv            
	//   14   22:ladd            
	//   15   23:lreturn         
	}

	public void setMaxRecycledViews(int i, int j)
	{
		Object obj = ((Object) (getScrapDataForType(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method RecyclerView$RecycledViewPool$ScrapData getScrapDataForType(int)>
	//    3    5:astore_3        
		obj.mMaxScrap = j;
	//    4    6:aload_3         
	//    5    7:iload_2         
	//    6    8:putfield        #106 <Field int RecyclerView$RecycledViewPool$ScrapData.mMaxScrap>
		for(obj = ((Object) (((ScrapData) (obj)).mScrapHeap)); ((ArrayList) (obj)).size() > j; ((ArrayList) (obj)).remove(((ArrayList) (obj)).size() - 1));
	//    7   11:aload_3         
	//    8   12:getfield        #54  <Field ArrayList RecyclerView$RecycledViewPool$ScrapData.mScrapHeap>
	//    9   15:astore_3        
	//   10   16:aload_3         
	//   11   17:invokevirtual   #83  <Method int ArrayList.size()>
	//   12   20:iload_2         
	//   13   21:icmple          38
	//   14   24:aload_3         
	//   15   25:aload_3         
	//   16   26:invokevirtual   #83  <Method int ArrayList.size()>
	//   17   29:iconst_1        
	//   18   30:isub            
	//   19   31:invokevirtual   #86  <Method Object ArrayList.remove(int)>
	//   20   34:pop             
	//*  21   35:goto            16
	//   22   38:return          
	}

	int size()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j;
		int k;
		for(j = 0; i < mScrap.size(); j = k)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #26  <Field SparseArray mScrap>
	//*   7    9:invokevirtual   #47  <Method int SparseArray.size()>
	//*   8   12:icmpge          55
		{
			ArrayList arraylist = ((ScrapData)mScrap.valueAt(i)).mScrapHeap;
	//    9   15:aload_0         
	//   10   16:getfield        #26  <Field SparseArray mScrap>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #50  <Method Object SparseArray.valueAt(int)>
	//   13   23:checkcast       #9   <Class RecyclerView$RecycledViewPool$ScrapData>
	//   14   26:getfield        #54  <Field ArrayList RecyclerView$RecycledViewPool$ScrapData.mScrapHeap>
	//   15   29:astore          4
			k = j;
	//   16   31:iload_2         
	//   17   32:istore_3        
			if(arraylist != null)
	//*  18   33:aload           4
	//*  19   35:ifnull          46
				k = j + arraylist.size();
	//   20   38:iload_2         
	//   21   39:aload           4
	//   22   41:invokevirtual   #83  <Method int ArrayList.size()>
	//   23   44:iadd            
	//   24   45:istore_3        
			i++;
	//   25   46:iload_1         
	//   26   47:iconst_1        
	//   27   48:iadd            
	//   28   49:istore_1        
		}

	//   29   50:iload_3         
	//   30   51:istore_2        
	//*  31   52:goto            4
		return j;
	//   32   55:iload_2         
	//   33   56:ireturn         
	}

	boolean willBindInTime(int i, long l, long l1)
	{
		long l2 = getScrapDataForType(i).mBindRunningAverageNs;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method RecyclerView$RecycledViewPool$ScrapData getScrapDataForType(int)>
	//    3    5:getfield        #67  <Field long RecyclerView$RecycledViewPool$ScrapData.mBindRunningAverageNs>
	//    4    8:lstore          6
		return l2 == 0L || l + l2 < l1;
	//    5   10:lload           6
	//    6   12:lconst_0        
	//    7   13:lcmp            
	//    8   14:ifeq            32
	//    9   17:lload_2         
	//   10   18:lload           6
	//   11   20:ladd            
	//   12   21:lload           4
	//   13   23:lcmp            
	//   14   24:ifge            30
	//   15   27:goto            32
	//   16   30:iconst_0        
	//   17   31:ireturn         
	//   18   32:iconst_1        
	//   19   33:ireturn         
	}

	boolean willCreateInTime(int i, long l, long l1)
	{
		long l2 = getScrapDataForType(i).mCreateRunningAverageNs;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #63  <Method RecyclerView$RecycledViewPool$ScrapData getScrapDataForType(int)>
	//    3    5:getfield        #75  <Field long RecyclerView$RecycledViewPool$ScrapData.mCreateRunningAverageNs>
	//    4    8:lstore          6
		return l2 == 0L || l + l2 < l1;
	//    5   10:lload           6
	//    6   12:lconst_0        
	//    7   13:lcmp            
	//    8   14:ifeq            32
	//    9   17:lload_2         
	//   10   18:lload           6
	//   11   20:ladd            
	//   12   21:lload           4
	//   13   23:lcmp            
	//   14   24:ifge            30
	//   15   27:goto            32
	//   16   30:iconst_0        
	//   17   31:ireturn         
	//   18   32:iconst_1        
	//   19   33:ireturn         
	}

	private static final int DEFAULT_MAX_SCRAP = 5;
	private int mAttachCount;
	SparseArray mScrap;

	public RecyclerView$RecycledViewPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mScrap = new SparseArray();
	//    2    4:aload_0         
	//    3    5:new             #23  <Class SparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void SparseArray()>
	//    6   12:putfield        #26  <Field SparseArray mScrap>
		mAttachCount = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #28  <Field int mAttachCount>
	//   10   20:return          
	}
}
