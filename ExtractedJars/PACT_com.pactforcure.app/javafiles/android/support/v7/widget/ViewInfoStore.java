// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;

class ViewInfoStore
{
	static class InfoRecord
	{

		static void drainCache()
		{
			while(sPool.acquire() != null) ;
		//    0    0:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
		//    1    3:invokeinterface #50  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    2    8:ifnonnull       0
		//    3   11:return          
		}

		static InfoRecord obtain()
		{
			InfoRecord inforecord1 = (InfoRecord)sPool.acquire();
		//    0    0:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
		//    1    3:invokeinterface #50  <Method Object android.support.v4.util.Pools$Pool.acquire()>
		//    2    8:checkcast       #2   <Class ViewInfoStore$InfoRecord>
		//    3   11:astore_1        
			InfoRecord inforecord = inforecord1;
		//    4   12:aload_1         
		//    5   13:astore_0        
			if(inforecord1 == null)
		//*   6   14:aload_1         
		//*   7   15:ifnonnull       26
				inforecord = new InfoRecord();
		//    8   18:new             #2   <Class ViewInfoStore$InfoRecord>
		//    9   21:dup             
		//   10   22:invokespecial   #53  <Method void ViewInfoStore$InfoRecord()>
		//   11   25:astore_0        
			return inforecord;
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		static void recycle(InfoRecord inforecord)
		{
			inforecord.flags = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #57  <Field int flags>
			inforecord.preInfo = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #59  <Field RecyclerView$ItemAnimator$ItemHolderInfo preInfo>
			inforecord.postInfo = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #61  <Field RecyclerView$ItemAnimator$ItemHolderInfo postInfo>
			sPool.release(((Object) (inforecord)));
		//    9   15:getstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
		//   10   18:aload_0         
		//   11   19:invokeinterface #65  <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
		//   12   24:pop             
		//   13   25:return          
		}

		static final int FLAG_APPEAR = 2;
		static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
		static final int FLAG_APPEAR_PRE_AND_POST = 14;
		static final int FLAG_DISAPPEARED = 1;
		static final int FLAG_POST = 8;
		static final int FLAG_PRE = 4;
		static final int FLAG_PRE_AND_POST = 12;
		static android.support.v4.util.Pools.Pool sPool = new android.support.v4.util.Pools.SimplePool(20);
		int flags;
		RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
		RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

		static 
		{
		//    0    0:new             #34  <Class android.support.v4.util.Pools$SimplePool>
		//    1    3:dup             
		//    2    4:bipush          20
		//    3    6:invokespecial   #38  <Method void android.support.v4.util.Pools$SimplePool(int)>
		//    4    9:putstatic       #40  <Field android.support.v4.util.Pools$Pool sPool>
		//*   5   12:return          
		}

		private InfoRecord()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #43  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface ProcessCallback
	{

		public abstract void processAppeared(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

		public abstract void processDisappeared(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

		public abstract void processPersistent(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo1);

		public abstract void unused(RecyclerView.ViewHolder viewholder);
	}


	ViewInfoStore()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayMap()>
	//    6   12:putfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    7   15:aload_0         
	//    8   16:new             #31  <Class LongSparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #32  <Method void LongSparseArray()>
	//   11   23:putfield        #34  <Field LongSparseArray mOldChangedHolders>
	//   12   26:return          
	}

	private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewholder, int i)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		int j = mLayoutHolderMap.indexOfKey(((Object) (viewholder)));
	//    2    3:aload_0         
	//    3    4:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    4    7:aload_1         
	//    5    8:invokevirtual   #41  <Method int ArrayMap.indexOfKey(Object)>
	//    6   11:istore_3        
		Object obj;
		if(j < 0)
	//*   7   12:iload_3         
	//*   8   13:ifge            23
		{
			obj = ((Object) (obj1));
	//    9   16:aload           5
	//   10   18:astore          4
		} else
	//*  11   20:aload           4
	//*  12   22:areturn         
		{
			InfoRecord inforecord = (InfoRecord)mLayoutHolderMap.valueAt(j);
	//   13   23:aload_0         
	//   14   24:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   15   27:iload_3         
	//   16   28:invokevirtual   #45  <Method Object ArrayMap.valueAt(int)>
	//   17   31:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//   18   34:astore          6
			obj = ((Object) (obj1));
	//   19   36:aload           5
	//   20   38:astore          4
			if(inforecord != null)
	//*  21   40:aload           6
	//*  22   42:ifnull          20
			{
				obj = ((Object) (obj1));
	//   23   45:aload           5
	//   24   47:astore          4
				if((inforecord.flags & i) != 0)
	//*  25   49:aload           6
	//*  26   51:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  27   54:iload_2         
	//*  28   55:iand            
	//*  29   56:ifeq            20
				{
					inforecord.flags = inforecord.flags & ~i;
	//   30   59:aload           6
	//   31   61:aload           6
	//   32   63:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   33   66:iload_2         
	//   34   67:iconst_m1       
	//   35   68:ixor            
	//   36   69:iand            
	//   37   70:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
					if(i == 4)
	//*  38   73:iload_2         
	//*  39   74:iconst_4        
	//*  40   75:icmpne          114
						viewholder = ((RecyclerView.ViewHolder) (inforecord.preInfo));
	//   41   78:aload           6
	//   42   80:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   43   83:astore_1        
					else
	//*  44   84:aload_1         
	//*  45   85:astore          4
	//*  46   87:aload           6
	//*  47   89:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  48   92:bipush          12
	//*  49   94:iand            
	//*  50   95:ifne            20
	//*  51   98:aload_0         
	//*  52   99:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//*  53  102:iload_3         
	//*  54  103:invokevirtual   #56  <Method Object ArrayMap.removeAt(int)>
	//*  55  106:pop             
	//*  56  107:aload           6
	//*  57  109:invokestatic    #60  <Method void ViewInfoStore$InfoRecord.recycle(ViewInfoStore$InfoRecord)>
	//*  58  112:aload_1         
	//*  59  113:areturn         
					if(i == 8)
	//*  60  114:iload_2         
	//*  61  115:bipush          8
	//*  62  117:icmpne          129
						viewholder = ((RecyclerView.ViewHolder) (inforecord.postInfo));
	//   63  120:aload           6
	//   64  122:getfield        #63  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//   65  125:astore_1        
					else
	//*  66  126:goto            84
						throw new IllegalArgumentException("Must provide flag PRE or POST");
	//   67  129:new             #65  <Class IllegalArgumentException>
	//   68  132:dup             
	//   69  133:ldc1            #67  <String "Must provide flag PRE or POST">
	//   70  135:invokespecial   #70  <Method void IllegalArgumentException(String)>
	//   71  138:athrow          
					obj = ((Object) (viewholder));
					if((inforecord.flags & 0xc) == 0)
					{
						mLayoutHolderMap.removeAt(j);
						InfoRecord.recycle(inforecord);
						return ((RecyclerView.ItemAnimator.ItemHolderInfo) (viewholder));
					}
				}
			}
		}
		return ((RecyclerView.ItemAnimator.ItemHolderInfo) (obj));
	}

	void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
	{
		InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore          4
		InfoRecord inforecord = inforecord1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(inforecord1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       35
		{
			inforecord = InfoRecord.obtain();
	//   10   21:invokestatic    #80  <Method ViewInfoStore$InfoRecord ViewInfoStore$InfoRecord.obtain()>
	//   11   24:astore_3        
			mLayoutHolderMap.put(((Object) (viewholder)), ((Object) (inforecord)));
	//   12   25:aload_0         
	//   13   26:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   14   29:aload_1         
	//   15   30:aload_3         
	//   16   31:invokevirtual   #84  <Method Object ArrayMap.put(Object, Object)>
	//   17   34:pop             
		}
		inforecord.flags = inforecord.flags | 2;
	//   18   35:aload_3         
	//   19   36:aload_3         
	//   20   37:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   21   40:iconst_2        
	//   22   41:ior             
	//   23   42:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
		inforecord.preInfo = itemholderinfo;
	//   24   45:aload_3         
	//   25   46:aload_2         
	//   26   47:putfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   27   50:return          
	}

	void addToDisappearedInLayout(RecyclerView.ViewHolder viewholder)
	{
		InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore_3        
		InfoRecord inforecord = inforecord1;
	//    6   12:aload_3         
	//    7   13:astore_2        
		if(inforecord1 == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       32
		{
			inforecord = InfoRecord.obtain();
	//   10   18:invokestatic    #80  <Method ViewInfoStore$InfoRecord ViewInfoStore$InfoRecord.obtain()>
	//   11   21:astore_2        
			mLayoutHolderMap.put(((Object) (viewholder)), ((Object) (inforecord)));
	//   12   22:aload_0         
	//   13   23:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #84  <Method Object ArrayMap.put(Object, Object)>
	//   17   31:pop             
		}
		inforecord.flags = inforecord.flags | 1;
	//   18   32:aload_2         
	//   19   33:aload_2         
	//   20   34:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   21   37:iconst_1        
	//   22   38:ior             
	//   23   39:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   24   42:return          
	}

	void addToOldChangeHolders(long l, RecyclerView.ViewHolder viewholder)
	{
		mOldChangedHolders.put(l, ((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #91  <Method void LongSparseArray.put(long, Object)>
	//    5    9:return          
	}

	void addToPostLayout(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
	{
		InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore          4
		InfoRecord inforecord = inforecord1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(inforecord1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       35
		{
			inforecord = InfoRecord.obtain();
	//   10   21:invokestatic    #80  <Method ViewInfoStore$InfoRecord ViewInfoStore$InfoRecord.obtain()>
	//   11   24:astore_3        
			mLayoutHolderMap.put(((Object) (viewholder)), ((Object) (inforecord)));
	//   12   25:aload_0         
	//   13   26:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   14   29:aload_1         
	//   15   30:aload_3         
	//   16   31:invokevirtual   #84  <Method Object ArrayMap.put(Object, Object)>
	//   17   34:pop             
		}
		inforecord.postInfo = itemholderinfo;
	//   18   35:aload_3         
	//   19   36:aload_2         
	//   20   37:putfield        #63  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
		inforecord.flags = inforecord.flags | 8;
	//   21   40:aload_3         
	//   22   41:aload_3         
	//   23   42:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   24   45:bipush          8
	//   25   47:ior             
	//   26   48:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   27   51:return          
	}

	void addToPreLayout(RecyclerView.ViewHolder viewholder, RecyclerView.ItemAnimator.ItemHolderInfo itemholderinfo)
	{
		InfoRecord inforecord1 = (InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore          4
		InfoRecord inforecord = inforecord1;
	//    6   13:aload           4
	//    7   15:astore_3        
		if(inforecord1 == null)
	//*   8   16:aload           4
	//*   9   18:ifnonnull       35
		{
			inforecord = InfoRecord.obtain();
	//   10   21:invokestatic    #80  <Method ViewInfoStore$InfoRecord ViewInfoStore$InfoRecord.obtain()>
	//   11   24:astore_3        
			mLayoutHolderMap.put(((Object) (viewholder)), ((Object) (inforecord)));
	//   12   25:aload_0         
	//   13   26:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   14   29:aload_1         
	//   15   30:aload_3         
	//   16   31:invokevirtual   #84  <Method Object ArrayMap.put(Object, Object)>
	//   17   34:pop             
		}
		inforecord.preInfo = itemholderinfo;
	//   18   35:aload_3         
	//   19   36:aload_2         
	//   20   37:putfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
		inforecord.flags = inforecord.flags | 4;
	//   21   40:aload_3         
	//   22   41:aload_3         
	//   23   42:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   24   45:iconst_4        
	//   25   46:ior             
	//   26   47:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   27   50:return          
	}

	void clear()
	{
		mLayoutHolderMap.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:invokevirtual   #96  <Method void ArrayMap.clear()>
		mOldChangedHolders.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//    5   11:invokevirtual   #97  <Method void LongSparseArray.clear()>
	//    6   14:return          
	}

	RecyclerView.ViewHolder getFromOldChangeHolders(long l)
	{
		return (RecyclerView.ViewHolder)mOldChangedHolders.get(l);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #102 <Method Object LongSparseArray.get(long)>
	//    4    8:checkcast       #104 <Class RecyclerView$ViewHolder>
	//    5   11:areturn         
	}

	boolean isDisappearing(RecyclerView.ViewHolder viewholder)
	{
		viewholder = ((RecyclerView.ViewHolder) ((InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore_1        
		return viewholder != null && (((InfoRecord) (viewholder)).flags & 1) != 0;
	//    6   12:aload_1         
	//    7   13:ifnull          27
	//    8   16:aload_1         
	//    9   17:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   10   20:iconst_1        
	//   11   21:iand            
	//   12   22:ifeq            27
	//   13   25:iconst_1        
	//   14   26:ireturn         
	//   15   27:iconst_0        
	//   16   28:ireturn         
	}

	boolean isInPreLayout(RecyclerView.ViewHolder viewholder)
	{
		viewholder = ((RecyclerView.ViewHolder) ((InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore_1        
		return viewholder != null && (((InfoRecord) (viewholder)).flags & 4) != 0;
	//    6   12:aload_1         
	//    7   13:ifnull          27
	//    8   16:aload_1         
	//    9   17:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   10   20:iconst_4        
	//   11   21:iand            
	//   12   22:ifeq            27
	//   13   25:iconst_1        
	//   14   26:ireturn         
	//   15   27:iconst_0        
	//   16   28:ireturn         
	}

	void onDetach()
	{
		InfoRecord.drainCache();
	//    0    0:invokestatic    #111 <Method void ViewInfoStore$InfoRecord.drainCache()>
	//    1    3:return          
	}

	public void onViewDetached(RecyclerView.ViewHolder viewholder)
	{
		removeFromDisappearedInLayout(viewholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #115 <Method void removeFromDisappearedInLayout(RecyclerView$ViewHolder)>
	//    3    5:return          
	}

	RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewholder)
	{
		return popFromLayoutStep(viewholder, 8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:bipush          8
	//    3    4:invokespecial   #120 <Method RecyclerView$ItemAnimator$ItemHolderInfo popFromLayoutStep(RecyclerView$ViewHolder, int)>
	//    4    7:areturn         
	}

	RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewholder)
	{
		return popFromLayoutStep(viewholder, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:invokespecial   #120 <Method RecyclerView$ItemAnimator$ItemHolderInfo popFromLayoutStep(RecyclerView$ViewHolder, int)>
	//    4    6:areturn         
	}

	void process(ProcessCallback processcallback)
	{
		int i = mLayoutHolderMap.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:invokevirtual   #128 <Method int ArrayMap.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            253
		{
			RecyclerView.ViewHolder viewholder = (RecyclerView.ViewHolder)mLayoutHolderMap.keyAt(i);
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #131 <Method Object ArrayMap.keyAt(int)>
	//   12   22:checkcast       #104 <Class RecyclerView$ViewHolder>
	//   13   25:astore_3        
			InfoRecord inforecord = (InfoRecord)mLayoutHolderMap.removeAt(i);
	//   14   26:aload_0         
	//   15   27:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #56  <Method Object ArrayMap.removeAt(int)>
	//   18   34:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//   19   37:astore          4
			if((inforecord.flags & 3) == 3)
	//*  20   39:aload           4
	//*  21   41:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  22   44:iconst_3        
	//*  23   45:iand            
	//*  24   46:iconst_3        
	//*  25   47:icmpne          69
				processcallback.unused(viewholder);
	//   26   50:aload_1         
	//   27   51:aload_3         
	//   28   52:invokeinterface #134 <Method void ViewInfoStore$ProcessCallback.unused(RecyclerView$ViewHolder)>
			else
	//*  29   57:aload           4
	//*  30   59:invokestatic    #60  <Method void ViewInfoStore$InfoRecord.recycle(ViewInfoStore$InfoRecord)>
	//*  31   62:iload_2         
	//*  32   63:iconst_1        
	//*  33   64:isub            
	//*  34   65:istore_2        
	//*  35   66:goto            10
			if((inforecord.flags & 1) != 0)
	//*  36   69:aload           4
	//*  37   71:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  38   74:iconst_1        
	//*  39   75:iand            
	//*  40   76:ifeq            117
			{
				if(inforecord.preInfo == null)
	//*  41   79:aload           4
	//*  42   81:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//*  43   84:ifnonnull       97
					processcallback.unused(viewholder);
	//   44   87:aload_1         
	//   45   88:aload_3         
	//   46   89:invokeinterface #134 <Method void ViewInfoStore$ProcessCallback.unused(RecyclerView$ViewHolder)>
				else
	//*  47   94:goto            57
					processcallback.processDisappeared(viewholder, inforecord.preInfo, inforecord.postInfo);
	//   48   97:aload_1         
	//   49   98:aload_3         
	//   50   99:aload           4
	//   51  101:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   52  104:aload           4
	//   53  106:getfield        #63  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//   54  109:invokeinterface #138 <Method void ViewInfoStore$ProcessCallback.processDisappeared(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			} else
	//*  55  114:goto            57
			if((inforecord.flags & 0xe) == 14)
	//*  56  117:aload           4
	//*  57  119:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  58  122:bipush          14
	//*  59  124:iand            
	//*  60  125:bipush          14
	//*  61  127:icmpne          150
				processcallback.processAppeared(viewholder, inforecord.preInfo, inforecord.postInfo);
	//   62  130:aload_1         
	//   63  131:aload_3         
	//   64  132:aload           4
	//   65  134:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   66  137:aload           4
	//   67  139:getfield        #63  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//   68  142:invokeinterface #141 <Method void ViewInfoStore$ProcessCallback.processAppeared(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			else
	//*  69  147:goto            57
			if((inforecord.flags & 0xc) == 12)
	//*  70  150:aload           4
	//*  71  152:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  72  155:bipush          12
	//*  73  157:iand            
	//*  74  158:bipush          12
	//*  75  160:icmpne          183
				processcallback.processPersistent(viewholder, inforecord.preInfo, inforecord.postInfo);
	//   76  163:aload_1         
	//   77  164:aload_3         
	//   78  165:aload           4
	//   79  167:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   80  170:aload           4
	//   81  172:getfield        #63  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//   82  175:invokeinterface #144 <Method void ViewInfoStore$ProcessCallback.processPersistent(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			else
	//*  83  180:goto            57
			if((inforecord.flags & 4) != 0)
	//*  84  183:aload           4
	//*  85  185:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  86  188:iconst_4        
	//*  87  189:iand            
	//*  88  190:ifeq            209
				processcallback.processDisappeared(viewholder, inforecord.preInfo, ((RecyclerView.ItemAnimator.ItemHolderInfo) (null)));
	//   89  193:aload_1         
	//   90  194:aload_3         
	//   91  195:aload           4
	//   92  197:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//   93  200:aconst_null     
	//   94  201:invokeinterface #138 <Method void ViewInfoStore$ProcessCallback.processDisappeared(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			else
	//*  95  206:goto            57
			if((inforecord.flags & 8) != 0)
	//*  96  209:aload           4
	//*  97  211:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//*  98  214:bipush          8
	//*  99  216:iand            
	//* 100  217:ifeq            240
				processcallback.processAppeared(viewholder, inforecord.preInfo, inforecord.postInfo);
	//  101  220:aload_1         
	//  102  221:aload_3         
	//  103  222:aload           4
	//  104  224:getfield        #53  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.preInfo>
	//  105  227:aload           4
	//  106  229:getfield        #63  <Field RecyclerView$ItemAnimator$ItemHolderInfo ViewInfoStore$InfoRecord.postInfo>
	//  107  232:invokeinterface #141 <Method void ViewInfoStore$ProcessCallback.processAppeared(RecyclerView$ViewHolder, RecyclerView$ItemAnimator$ItemHolderInfo, RecyclerView$ItemAnimator$ItemHolderInfo)>
			else
	//* 108  237:goto            57
			if((inforecord.flags & 2) == 0);
	//  109  240:aload           4
	//  110  242:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//  111  245:iconst_2        
	//  112  246:iand            
	//  113  247:ifeq            57
			InfoRecord.recycle(inforecord);
			i--;
		}
	//* 114  250:goto            57
	//  115  253:return          
	}

	void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewholder)
	{
		viewholder = ((RecyclerView.ViewHolder) ((InfoRecord)mLayoutHolderMap.get(((Object) (viewholder)))));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #76  <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//    5   11:astore_1        
		if(viewholder == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       17
		{
			return;
	//    8   16:return          
		} else
		{
			viewholder.flags = ((InfoRecord) (viewholder)).flags & -2;
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:getfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
	//   12   22:bipush          -2
	//   13   24:iand            
	//   14   25:putfield        #49  <Field int ViewInfoStore$InfoRecord.flags>
			return;
	//   15   28:return          
		}
	}

	void removeViewHolder(RecyclerView.ViewHolder viewholder)
	{
		int i = mOldChangedHolders.size() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//    2    4:invokevirtual   #146 <Method int LongSparseArray.size()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		do
		{
label0:
			{
				if(i >= 0)
	//*   6   10:iload_2         
	//*   7   11:iflt            34
				{
					if(viewholder != mOldChangedHolders.valueAt(i))
						break label0;
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #147 <Method Object LongSparseArray.valueAt(int)>
	//   13   23:if_acmpne       55
					mOldChangedHolders.removeAt(i);
	//   14   26:aload_0         
	//   15   27:getfield        #34  <Field LongSparseArray mOldChangedHolders>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #150 <Method void LongSparseArray.removeAt(int)>
				}
				viewholder = ((RecyclerView.ViewHolder) ((InfoRecord)mLayoutHolderMap.remove(((Object) (viewholder)))));
	//   18   34:aload_0         
	//   19   35:getfield        #29  <Field ArrayMap mLayoutHolderMap>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #153 <Method Object ArrayMap.remove(Object)>
	//   22   42:checkcast       #6   <Class ViewInfoStore$InfoRecord>
	//   23   45:astore_1        
				if(viewholder != null)
	//*  24   46:aload_1         
	//*  25   47:ifnull          54
					InfoRecord.recycle(((InfoRecord) (viewholder)));
	//   26   50:aload_1         
	//   27   51:invokestatic    #60  <Method void ViewInfoStore$InfoRecord.recycle(ViewInfoStore$InfoRecord)>
				return;
	//   28   54:return          
			}
			i--;
	//   29   55:iload_2         
	//   30   56:iconst_1        
	//   31   57:isub            
	//   32   58:istore_2        
		} while(true);
	//   33   59:goto            10
	}

	private static final boolean DEBUG = false;
	final ArrayMap mLayoutHolderMap = new ArrayMap();
	final LongSparseArray mOldChangedHolders = new LongSparseArray();
}
